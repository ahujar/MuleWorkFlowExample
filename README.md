# MuleWorkFlowExample
Mule ESB Implementation for: 

1) FTP Connector which persist an Object to MongoDB.

2) HTTP Request-Response Connector which fetches persisted objects from MongoDB and prints them in JSON pretty print output.


First Flow : Ftp connector listens to an FTP server location and expects and xml file, this converts the xml to a JAXBObject ( this part is done is for learning purpose )
the Object is transformed to json and then to DbObject finally persisting in mongoDB using mongo component and For Each Scope in Mule.

Second Flow : HTTP endpoint request @ ( http://localhost:8081/getYaks )  calls the mongoDB component which runs a find query on the collection ,  transforms the object to String and the groovy component converts the output to a pretty print format before sending the response to the HTTP endpoint.   


This also contains a Functional Test Case which uses MuleClient to mock the MuleServer and runs each of the above flows.



