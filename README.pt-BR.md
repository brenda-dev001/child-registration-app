# 🧩 Child Registration App

[English](README.md) | **Português**

Aplicativo Android desenvolvido como projeto acadêmico durante minha graduação em Análise e Desenvolvimento de Sistemas, com foco no cadastro e gerenciamento de crianças utilizando Kotlin, Jetpack Compose, Room Database e componentes da arquitetura Android.

## ✨ Funcionalidades

- Cadastro de crianças e seus responsáveis.
- Pesquisa de crianças por CPF.
- Pesquisa de responsáveis por CPF e visualização das crianças associadas.
- Atualização dos dados das crianças.
- Atualização dos dados dos responsáveis.
- Exclusão de cadastros de crianças.
- Exibição de estatísticas, incluindo a quantidade total de crianças cadastradas e a média de idade.
- Persistência local dos dados utilizando Room Database.


## 🛠️ Technologies Used


<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg" width="40" height="40" alt="Kotlin" title="Kotlin" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/android/android-original.svg" width="40" height="40" alt="Android" title="Android" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jetpackcompose/jetpackcompose-original.svg" width="40" height="40" alt="Jetpack Compose" title="Jetpack Compose" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/sqlite/sqlite-original.svg" width="40" height="40" alt="SQLite" title="SQLite" />
  &nbsp;
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg" width="40" height="40" alt="Android Studio" title="Android Studio" />
</p>

## ⚙️ Como Funciona

O projeto consiste em um aplicativo Android desenvolvido com Kotlin e Jetpack Compose, utilizando Room Database para persistência local dos dados.

A aplicação segue uma arquitetura em camadas, separando as responsabilidades entre **UI**, **ViewModel**, **Repository** e **DAO**.

A entidade principal é `Child`, responsável por armazenar as informações das crianças juntamente com os dados de seus responsáveis.

O aplicativo permite cadastrar, pesquisar, atualizar e excluir registros de crianças. Também é possível pesquisar responsáveis pelo CPF, permitindo visualizar as crianças associadas a eles.

As operações com o banco de dados são realizadas utilizando Kotlin Coroutines, enquanto o Jetpack Compose gerencia a interface e reage às alterações de estado.

## 📁 Estrutura do Projeto

```text
child-registration-app/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/clinicofkids/
│   │       │   ├── data/
│   │       │   │   ├── model/
│   │       │   │   └── repository/
│   │       │   └── ui/
│   │       │       ├── screens/
│   │       │       │   ├── child/
│   │       │       │   └── search/
│   │       │       └── theme/
│   │       ├── res/
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── .gitignore
```

## 🚀 Executando o Projeto

1. Instale o Android Studio.

2. Clone o repositório:

   ```bash
   git clone https://github.com/brenda-dev001/child-registration-app.git
   ```

3. Abra o projeto no Android Studio.

4. Aguarde a sincronização do Gradle.

5. Configure um emulador Android ou conecte um dispositivo físico.

6. Compile e execute o aplicativo pelo Android Studio.

O aplicativo utiliza Room Database para armazenar os registros localmente, sem a necessidade de um servidor de banco de dados externo.

## 📌 Status do Projeto

Projeto desenvolvido para fins educacionais, com foco no aprendizado de Kotlin, Jetpack Compose, Room Database, SQLite, arquitetura MVVM, operações CRUD, navegação, gerenciamento de estados e Kotlin Coroutines.

## 👩‍💻 Autora

Desenvolvido por [Brenda](https://github.com/brenda-dev001) como projeto acadêmico durante minha graduação em Análise e Desenvolvimento de Sistemas.
