# ExcuseBackJava

Projet fait en java 17 avec  
- Spring Web  
- Spring data JPA  
- H2 database
- Lombok

Lancer l'application.

Lancer Postman

- Ajouter l’ensemble des datas d’excuses:  
    Endpoint: http://localhost:8080/api/v1/saveAll  
    Method: POST(data.json)  

- Ajouter une excuse:  
    Endpoint: http://localhost:8080/api/v1/save  
    Method: POST  
    {
        "http_code": 900,
        "tag": "test",
        "message": "nouveau"
    }


- Lire les données:  
    Endpoint:  http://localhost:8080/api/v1/allExcuses  
    Regarder les données avec Get:  
    Method: GET
