# Injection des Dépendances en Java

## Description

Ce projet est une implémentation simple du concept d'injection des dépendances en Java. Il explore deux approches :

1. **Injection statique** : utilisée dans `PresentationV1`, où les dépendances sont instanciées directement dans le code.
2. **Injection dynamique** : utilisée dans `PresentationV2`, où les classes sont chargées dynamiquement via la réflexion et un fichier de configuration `config.txt`.

## Structure du projet

```
.
├── config.txt
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── DAO
│   │   │   │   ├── DaoImpl.java
│   │   │   │   └── IDao.java
│   │   │   ├── EXT
│   │   │   │   └── DaoImpl2.java
│   │   │   ├── METIER
│   │   │   │   ├── IMetier.java
│   │   │   │   └── MetierImpl.java
│   │   │   └── PRES
│   │   │       ├── PresentationV1.java
│   │   │       └── PresentationV2.java
│   │   └── resources
│   └── test
│       └── java
└── target
```

## Configuration

Le fichier `config.txt` contient les noms des classes à charger dynamiquement :

```
DAO.DaoImpl
METIER.MetierImpl
```

## Cloner le dépôt
   ```bash
   git clone https://github.com/Mostapha-El-Kaddaoui/Java-Dependency-Injection-Static-Dynamic.git

## Technologies

- Java

## Auteur

EL KADDAOUI Mostafa

### **Remarque**

Ce projet a été réalisé par mes soins, mais je tiens à préciser que la structure de base et le concept ont été fournis par mon professeur, M.YOUSSFI Mohamed.
