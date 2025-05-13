# ☕ Coffee Machine Simulator – Java Edition

## Présentation

**Coffee Machine Simulator** est une application en ligne de commande qui simule le fonctionnement d’une machine à café automatique. L'utilisateur peut y acheter des boissons, remplir les réservoirs, vider l'argent encaissé et entretenir la machine.

---

## 🎮 Fonctionnalités

* 🧃 Préparer trois types de boissons : espresso, latte, cappuccino
* 🛠 Remplir manuellement l’eau, le lait, les grains et les gobelets
* 💰 Récupérer l’argent contenu dans la machine
* 🧼 Nettoyer la machine tous les 10 cafés obligatoirement
* 📋 Afficher à tout moment l’état des ressources internes
* 🔁 Interface 100 % en ligne de commande

---

## 📦 Télécharger et utiliser

**➡️ [Télécharger le .jar](https://github.com/ScrimaliAnthony/coffeemachinesimulator-java/releases/latest)**

### ▶️ Exécution (Java requis)

```bash
java -jar CoffeeMachineSimulator.jar
```

Suivez les instructions pour :

* Acheter un café (`buy`)
* Remplir les réservoirs (`fill`)
* Prendre l’argent (`take`)
* Nettoyer la machine (`clean`)
* Voir les ressources restantes (`remaining`)
* Quitter le programme (`exit`)

---

## 🧱 Structure du projet

```
src/
├── machine/
│   ├── CoffeeMachine.java         → Point d’entrée
│   ├── CoffeeMachineComputer.java → Logique de gestion
│   ├── User.java                  → Commandes utilisateur
│   └── Display.java               → Textes d’affichage console
```

### 🔨 Compilation manuelle

```bash
javac -d out $(find src -name "*.java")
jar cfm CoffeeMachineSimulator.jar manifest.txt -C out .
```
    