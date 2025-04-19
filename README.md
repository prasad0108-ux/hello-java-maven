---

```markdown
# ☕ Hello Java Maven CI with Jenkins

Welcome to the Hello Java Maven project – a minimal Java "Hello, World" app built with Maven, integrated with Jenkins for CI/CD. Whether you're new to Jenkins or brushing up on Maven pipelines, this project is your quick and effective playground!

## 🌟 Features

- Java Hello World App (`HelloWorld.java`)
- Maven Build (`pom.xml`)
- Jenkins Freestyle Project Support (`config.xml`)
- Minimal setup – ideal for CI/CD practice

## 🚀 Quick Start

Clone this repository to your local machine:

```bash
git clone https://github.com/prasad0108-ux/hello-java-maven.git
cd hello-java-maven
```

Then:

1. Create a **Freestyle Jenkins Job** in your Jenkins dashboard.
2. In the job config, go to **Source Code Management** → Git:
   - Repository URL: `https://github.com/prasad0108-ux/hello-java-maven.git`
   - Branch to build: `main`
3. Under **Build**, add step **Invoke top-level Maven targets** with:
   - Goals: `clean package`
4. Save and click **Build Now**
5. Check the **Console Output** to see the Maven build in action!

## 🗂️ Project Structure

```
hello-java-maven/
├── src/
│   └── main/
│       └── java/
│           └── HelloWorld.java
├── pom.xml
└── config.xml
```

## 🛠 Requirements

- Java JDK
- Apache Maven
- Jenkins (running via Docker or natively)

## 🤝 Contributions

Feel free to fork, experiment, and raise PRs for improvements!

---
```
