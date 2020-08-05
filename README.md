# MongoDB-Sample

A simple note app. This project helps to explain how to hook up a Spring project to a sample MongoDB Database hosted in an Atlas cluster (cloud-based).

## Getting started

### Pre-requisites / Dependencies

- A mongoDB Atlas account
- Postman for the API calls
- An IDE to run the app and edit the `application.properties` file in `src/main/resources`

In application.properties, change the `<VARIABLES>` with the correct values. You can create a free cluster with an account at cloud.mongodb.com

```
spring.data.mongodb.database=<DATABASE NAME>
spring.data.mongodb.uri=mongodb+srv://<USER>:<PASSWORD>@<CLUSTER>.lxsu7.mongodb.net/<DATABASE NAME>?retryWrites=true&w=majority
```

To keep things simpler I have not used DTO mapping and only two API calls for proof of concept. Once your applications.properties is set you should be able to run the app within an IDE.

While the app is running (within an IDE) you can use the following API calls:

```
/addNote
/findAllNotes
```

You can test these with Postman - and see the results in your browser (cloud interface) or MongoDB Compass.

## Body for /addNote
```
{
    "noteId": 1,
    "title": "creating a note",
    "body": "the note Id is not the same as mongoDB's objectID, which is still applied"
}
```
Postman API call and response with a noteId
![Add third note with noteId](https://i.imgur.com/eAbg86y.jpg)

Postman API call and response without a noteId
![Add note without noteId](https://i.imgur.com/GgRi8Jl.jpg)

## /findAllNotes with Postman

![FindAllNotes](https://i.imgur.com/28pr87Q.jpg)

## The atlas console (via cloud.mongodb.com)
![Atlas console navigation](https://i.imgur.com/ugSZFTF.jpg)

The first note was added via 'insert document' while the other was added via an API call
![Atlas console 2 notes](https://i.imgur.com/5y8iLa9.jpg)

You can see the additional notes added via API calls
![Atlas console new notes](https://i.imgur.com/ZsQWyRD.jpg)

