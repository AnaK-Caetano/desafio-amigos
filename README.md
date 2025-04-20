# 🚀 Arena de desafio de códigos para Devs!  

<div align="center">  
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />  
  <img src="https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white" />  
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />  
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />  
  <img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" />  
</div>  

---

## 📌 Sobre o Projeto  
Plataforma de desafios de código onde usuários podem:  
- **Treinar diariamente** com problemas pré-definidos.  
- **Criar partidas rápidas** com amigos, competindo por tempo de submissão.  

---

## 🎯 Features Principais  
### 🏋️ Treinamento Diário  
- ✅ Autenticação JWT para usuários registrados.  
- 🗓️ Desafio único por dia (persistido no PostgreSQL).  
- 📤 Submissão de código **sem validação automática**.  

### ⚡ Partida Rápida  
- 🎮 Geração de código de sala único.  
- 🏁 Ranking por tempo de submissão (quem envia primeiro ganha).  
- 🚫 **Sem necessidade de login** (acesso via código da sala).  

---

## 📐 Diagrama de Classes  
```mermaid  
classDiagram
    class User {
        +Long id
        +String username
        +String password
        +List<Submission> submissions
    }

    class DailyChallenge {
        +Long id
        +LocalDate date
        +String description
        +String correctCode
    }

    class QuickMatch {
        +String code
        +LocalDateTime creationDate
    }

    class Submission {
        +Long id
        +String submittedCode
        +LocalDateTime date
        +User user
        +DailyChallenge challenge
        +String roomCode
    }

    User "1" -- "*" Submission : Makes
    DailyChallenge "1" -- "*" Submission : Has
    QuickMatch "1" -- "*" Submission : Has
