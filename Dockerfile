# 1 Image de base Java
FROM openjdk:21-slim

# 2 Répertoire de travail dans le conteneur
WORKDIR /app

# 3  Copier le JAR dans le conteneur
COPY target/my_project-V1.0.jar .

# 4 Définir la commande pour exécuter le JAR
CMD ["java", "-jar", "my_project-V1.0.jar"]