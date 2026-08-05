# 💱 Conversor de Moedas

Aplicativo Android simples e elegante para conversão de moedas, desenvolvido com **Material Components** e **ConstraintLayout**.

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white" alt="Platform" />
  <img src="https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white" alt="Language" />
  <img src="https://img.shields.io/badge/UI-Material%20Components-4A90D9" alt="UI" />
  <img src="https://img.shields.io/badge/License-MIT-green" alt="License" />
</p>

---

## 📱 Sobre o projeto

Este app permite converter valores entre moedas de forma rápida e intuitiva, com uma interface limpa construída em Material Design.

Atualmente suporta conversão de:
- 🇪🇺 **Euro (€)** → 🇺🇸 **Dólar ($)**
⚠️**Observação: atualmente os valores de conversão são fixos, sem uso de APIs**

## ✨ Funcionalidades

- Conversão de Euro para Dólar
- Interface com Material Components (campos, botões e cards estilizados)

## 🛠️ Tecnologias utilizadas

- **Kotlin** — linguagem principal
- **ConstraintLayout** — organização da interface
- **Material Components for Android** — componentes visuais (TextInputLayout, MaterialButton, CardView)

## 📸 Screenshots
<p align="center">
  | Tela principal |
</p>
<p align="center">
  <img width="387" height="824" alt="image" src="https://github.com/user-attachments/assets/cc2ec13d-e763-4d3a-81b2-653a64e0a7e0" />
</p>

## 🚀 Como executar o projeto

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) instalado + JDK 21(ou superior)
- SDK mínimo: `API XX` *(ajuste conforme seu `build.gradle`)*
- SDK alvo: `API XX`

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/nome-do-repositorio.git

# Entre na pasta do projeto
cd nome-do-repositorio

# Abra no Android Studio e execute (Shift + F10)
# ou via linha de comando:
./gradlew installDebug
```

## 📂 Estrutura do projeto

```
app/
 ├── src/main/
 │   ├── java/com/example/currencyconverter/MainActivity.kt      # Lógica de conversão
 │   ├── res/layout/activity_main.xml  # Interface principal
 │   └── res/values/                   # Cores, strings, temas
 └── build.gradle
```
