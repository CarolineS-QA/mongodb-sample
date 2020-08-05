# MongoDB-Sample

A simple note app. This project helps to explain how to hook up a Spring project to some sample MongoDB Databases hosted in an Atlas cluster (cloud-based).

In application.properties, change the `<VARIABLES>` with the correct values. You can create a free cluster with an account at cloud.mongodb.com

```
spring.data.mongodb.database=<DATABASE NAME>
spring.data.mongodb.uri=mongodb+srv://<USER>:<PASSWORD>@<CLUSTER>.lxsu7.mongodb.net/<DATABASE NAME>?retryWrites=true&w=majority
```

To keep things simpler I have not used DTO mapping.

While the app is running you can use the following API calls:

```
/addNote
/findAllNotes
```

You can test these with Postman - and see the results in your browser (cloud interface) or MongoDB Compass.