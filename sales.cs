Blob key = EncodingUtil.base64Decode('Pq6F9DO83vG/Z1Ccl+GJGA==');
Blob encData = EncodingUtil.base64Decode('NmPZsa8i2/TJbBBWUdmNxS+IAgkEViWTjDcGz2UQ2gWYj3zv+NnBOinqdJHKn3bN');

Blob decryptedData = Crypto.decryptWithManagedIV('AES128', key, encData);

System.Debug( decryptedData.toString() );


