TP CICD

Sujet du Projet: Simple Astronomy Lib

Team: 

- KAFANGA AKIM Victoire
- Lobe Anthony Junior
- Mammeri Melissa
- Iliés Hadoune


Difficultés concontrées:

Etant novices, vous avons eu des problèmes liés aux plugins non installés sur jenkings et on a passé beaucoups des temps pour chercher sur internet une procédure pour corriger chaque erreur et on etait obligé de suivre une vidéo sur youtube pour voir un exemple d'utilisation de nexus avec Jenkins.


Build :

On a build le projet avec maven.

Tests:

Après le build, on lance les tests.

* Les tests unitaires nous permeret de vérifier l'ensemble des fonctions du projet pour s'assurer qu'il n y pas des bugs suite à la modification du code.
* Les tests d'analyse nous permeret de vérifier la qualité du code.

Publish / Package:

Nous mettons a disposition le jar de l'application pour qu'il soit en suite uiliser par Nexus.

Nexus :

1. Nous avons ajouté le plugin nexus-artifact-uploader dans Jenkins. 

2. On se place sur le localhost:8081 de Nexus pour faire la configuration qui correspond au JenkinsFile =>  on crée un repository au nom de aptast-release  

3. Dans le pipeline Jenkins/Pipeline Syntax, nous avons spécifié les informations pour expédier l'artifact.

4. Nous avons utilisé le bouton Generate Pipeline Script pour obtenir le code correspond aux informations spécifiées pour l'expedition de l'artifact et nous l'avons ajouté dans le  JenkinsFile. 

Lors de l'étape "Nexus" nous envoyons alors avec succès notre artifact dans Nexus.

En Bonus:

 - Utilisation de Docker pour produire une image docker 


Nous avons utiliser un Dockerfile pour faire le packaging sous Docker.

