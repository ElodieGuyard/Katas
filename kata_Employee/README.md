
# Kata Employee 🧑‍💼

Ce kata est une mise en pratique des bases de la programmation orientée objet en Java. Il s'inspire du kata "Employee Report" proposé sur [Coding Dojo](https://codingdojo.org/kata/Employee-Report/).

## 🎯 Objectifs pédagogiques

- Manipuler les **classes** et **objets** en Java.
- Utiliser les **listes** (`ArrayList`) pour stocker des objets.
- Implémenter des **méthodes de tri personnalisées** à l'aide de `Comparator`.
- Découvrir les notions de **tests unitaires** avec JUnit.
- Appliquer les concepts de **méthodes d'instance** et **encapsulation**.
- Gérer les différences de **casse** lors du tri de chaînes de caractères.

## 📁 Structure du projet

- `Employee.java` : classe représentant un employé avec son nom, son âge et une méthode `isMajeur()`.
- `KataEmployee.java` : classe principale avec la logique métier (filtrage et tri des employés).
- `KataEmployeeTest.java` : tests unitaires pour valider les fonctionnalités clés.

## 🛠️ Fonctionnalités implémentées

1. **Filtrage des employés majeurs**
   - Permet d’afficher uniquement les employés ayant 18 ans ou plus.
   - Objectif métier : savoir qui peut travailler le dimanche.

2. **Tri des employés**
   - Par **nom** (non sensible à la casse).
   - Par **âge** croissant.

3. **Affichage des résultats**
   - Via des boucles `for` avec des conditions `if/else`.

## 🧪 Tests unitaires (JUnit)

Les tests couvrent :

- La méthode `isMajeur()` pour employés mineurs et majeurs.
- La méthode de tri `SortEmployeeListByName()` avec vérification de l'ordre alphabétique insensible à la casse.

Exemple :
```java
assertTrue("Patrick est majeur", testeur1.isMajeur());
assertFalse("Kevin est mineur", testeur2.isMajeur());
```

## 📦 Notions vues et bonnes pratiques

1. **Encapsulation & getters**
   - Accès aux attributs via `getName()` et `getAge()` au lieu d'accès direct.

2. **Utilisation de `Comparator`**
   - Pour le tri personnalisé :
     ```java
     Comparator<Employee> compareByName = Comparator.comparing(
         (Employee c) -> c.getName().toUpperCase()
     );
     ```

3. **Bonne gestion de la casse**
   - Conversion des noms en majuscules avant comparaison pour un tri insensible à la casse.

4. **Responsabilité unique**
   - La logique de tri est isolée dans une méthode `SortEmployeeListByName()`.

5. **Lisibilité**
   - Code clair avec commentaires et messages d'affichage explicites.

## 🔗 Ressources utilisées

- Kata original : [Employee Report - Coding Dojo](https://codingdojo.org/kata/Employee-Report/)
- Article sur les `Comparator` : [Baeldung - Java Comparing Objects](https://www.baeldung.com/java-comparing-objects)
- Référence Java : [J.M. Doudoux - Techniques Java](https://www.jmdoudoux.fr/java/dej/chap-techniques_java.htm)

---

👩‍💻 **Auteur·rice** : [Elodie Guyard](https://github.com/ElodieGuyard)  
🗓️ **Date** : Avril 2025  
🎓 **Niveau** : Débutant Java
