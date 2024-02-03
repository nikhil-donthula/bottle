Install mongoDB community server in your local machine

Install mongoDB Compass for GUI - for doing all these below operation in GUI

Connect to mongoDB server:
```
mongosh
```
Create a new DB/Switching to existing DB
use <new_database_name>
```
use bottle_db
```
Create a Collection
db.createCollection(<collection_name>)
```
db.createCollection("bottle_collection")
```
insert single document
db.bottle_collection.insertOne({
... brand_name: "Nayasa",
... price: 300,
... material: "plastic"
... })
insert multiple documents
db.bottle_collection.insertMany([
    { brand_name: "Milton", price: 500, material: "plastic"},
    { brand_name: "Solimo", price: 200, material: "plastic"},
    { brand_name: "Cello", price: 1000, material: "steel"}
])



