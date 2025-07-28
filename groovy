def token = message.getProperty("accessToken")
message.setHeader("Authorization", "Bearer " + token)
return message
