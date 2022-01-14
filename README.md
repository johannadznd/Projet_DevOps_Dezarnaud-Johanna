<h1>Projet_DevOps_Dezarnaud-Johanna</h1>

## Le projet 

Le but de ce projet est de mettre en pratique l’ensemble des connaissances acquises
pendant les 4 journées de formation, afin de réaliser une infrastructure de staging pour une
application java (fournie).

## Rendu

Le rendu attendu des élèves est un projet git de type monorepo (contenant le code IaC
terraform, CaC ansible et les pipelines de déploiements jenkins (dans des dossiers différents
pour la clarté)). Ce projet devra tendre à respecter le plus possible le “git flow”.

La propreté des commits et du code (ansible, jenkins et terraform) sera primordiale dans la
notation du projet.


## Cloner le projet
   ```sh
   git clone https://github.com/johannadznd/Projet_DevOps_Dezarnaud-Johanna.git
   ```

## Lancer la pipeline CI 

- Ce placer dans le bon dossier
   ```sh
   cd jenkins
   ```
- Lancer docker 

   ```sh
   docker-compose up --build
   ```
- On peut maintenant avoir accès à jenkins via http://localhost/

## Lancer la pipeline IaC 

- Ajouter la clé ssh au projet terraform
   ```sh
   cd terraform/terraform-files
   ```
   ```sh
   mkdir ./ssh
   ```
   ```sh
   ssh-keygen -f ./ssh/id_rsa
   ```
- Ajouter les credentials dans le dossier terraform
- Maintenant on peut remonter dans le dossier terraform
   ```sh
   cd ..
   ```
- Et lancer Docker

   ```sh
   docker-compose up --build
   ```
- On peut maintenant avoir accès à jenkins via http://localhost/

## Lancer la pipeline CaC 


- Ajouter la clé ssh au projet ansible
   ```sh
   cd ansible/ansible-files
   ```
   ```sh
   mkdir ./ssh
   ```
   ```sh
   ssh-keygen -f ./ssh/id_rsa
   ```
- Maintenant on peut remonter dans le dossier ansible
   ```sh
   cd ..
   ```
- Et lancer Docker

   ```sh
   docker-compose up --build
   ```
 - On peut maintenant avoir accèes au jenkins de docker via http://localhost/


### Usage

Les identifiants sont les suivants :

- Nom d'utilisateur = admin
- Mot de passe = admin


Vous avez maintenant accès aux différentes Pipelines :

    - CI pour la construction du .jar
    - IaC pour terraform avec la création et la destruction de l'instance AWS.
    - CaC pour ansible qui se charge de l'exploitation de l'instance AWS.




