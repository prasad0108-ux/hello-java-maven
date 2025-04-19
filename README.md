```markdown
<h1 align="center">🌟 Hello Java Maven + Jenkins CI Pipeline</h1>

<p align="center">
  <strong>Simple yet powerful</strong> — a Java "Hello World" app built with Maven and powered by Jenkins Freestyle jobs.
</p>

<p align="center">
  🚀 CI/CD Ready &nbsp; • &nbsp; 💡 Beginner-Friendly &nbsp; • &nbsp; 🔧 Maven + Jenkins
</p>

---

## 📌 What’s Inside?

Welcome to a minimalist Java Maven project designed to demonstrate:

- ✅ A basic Java app (`HelloWorld.java`)
- 🛠️ A Maven-based build system (`pom.xml`)
- ⚙️ A Jenkins Freestyle CI job (`config.xml`)
- 🎯 GitHub integration with the **`main`** branch for continuous builds

Whether you're just getting started with Jenkins or setting up your first CI job — this project is your launchpad 🚀

---

## 🧪 Jenkins CI Workflow

This project is built using a Jenkins **Freestyle job** that performs the following steps:

1. **Clones** this repository from the `main` branch
2. **Builds** the app using `mvn clean package`
3. **Displays** build logs in Jenkins console output

The Jenkins job configuration is stored in `config.xml` — importable or editable directly if you're managing Jenkins with code or Docker volumes.

---

## 📂 Key Files

| File                     | Description                             |
|--------------------------|-----------------------------------------|
| `HelloWorld.java`        | Basic Java class with a main method     |
| `pom.xml`                | Maven configuration for dependencies & build |
| `config.xml`             | Jenkins Freestyle job definition (XML)  |

> All files are committed to the **`main`** branch for clean CI operations.

---

## 🚀 Quick Start (for Jenkins Users)

1. Clone the repo:
   ```bash
   git clone https://github.com/prasad0108-ux/hello-java-maven.git
   cd hello-java-maven
   ```

2. Create a Freestyle Jenkins job:
   - Source Code Management → Git
   - Repo URL: `https://github.com/prasad0108-ux/hello-java-maven.git`
   - Branch: `main`
   - Build → Add: `Invoke top-level Maven targets`
     - Goals: `clean package`

3. Save and click **Build Now**

✅ Done! Check the Jenkins console for real-time build logs.

---

## 💬 Final Thoughts

This project is intentionally lightweight — to get you up and running with Jenkins and Maven as fast as possible. Tweak it, break it, automate it!

---

> _“Code once, automate forever.”_

<p align="center">
  ⭐ Star this repo if you found it useful — or fork it to make it your own!
</p>
```

---
