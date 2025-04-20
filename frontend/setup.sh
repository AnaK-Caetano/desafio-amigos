#!/bin/bash

# Criação da estrutura de pastas do Angular
ng g c home &&
ng g c auth/login &&
ng g c auth/register &&

# Desafios
ng g c challenges/daily-training &&
ng g c challenges/quick-match &&
ng g c challenges/components/code-editor &&
ng g c challenges/components/ranking-table &&

# Models
touch src/app/challenges/challenge.models.ts &&
echo "export interface ChallengeSubmission { code: string; timestamp: Date; }
export interface DailyChallenge { id: string; description: string; correctCode: string; }
export interface QuickMatch { code: string; createdAt: Date; }" > src/app/challenges/challenge.models.ts  &&
touch src/app/challenges/models/submission.model.ts &&

# Serviços
ng g s services/api/auth &&
ng g s services/api/challenges &&
ng g s services/session &&
ng g s services/notification &&

# Interfaces para serviços
touch src/app/services/api/auth/auth.interface.ts &&
touch src/app/services/api/challenges/challenge.interface.ts &&
touch src/app/services/session/session.interface.ts &&

# Componentes comuns
ng g c shared/components/header &&
ng g c shared/components/footer &&
ng g c shared/components/loading-spinner &&

# Instalação de dependências
yarn add @angular/cdk @angular/material monaco-editor ngx-mask bootstrap
