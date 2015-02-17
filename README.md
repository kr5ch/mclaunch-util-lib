# mclaunch-util-lib
Library to use Mojang's Yggdrasil authentication scheme (and more)

This library can:
* Make request to Yggdrasil (authenticate, request tokens, invalidate them, etc.)
* Read the launcher_profile.json file in the minecraft folder and serialize it (useful to retrieve the client token of the vanilla launcher for exemple)
* More to come

## Making requests to Yggdrasil

```java
YggdrasilRequester req = new YggdrasilRequester();

try {
	YggdrasilAuthenticateRes res = req.authenticate(YggdrasilAgent.getMinecraftAgent(), "<username>", "<password>", "<client token>");
	System.out.println("Look what I got: " + res.getAccessToken());
}
catch (IOException | YggdrasilError e) {
	e.printStackTrace();
}
```
This will try to authenticate an user with its username and password and will return a ``YggdrasilAuthenticateRes`` object, which contains a access token, a client token, the profiles available on the account, etc.

The library implements all 5 endpoints; ``authenticate``, ``refresh``, ``validate``, ``signout``, and ``invalidate``.
More information on the endpoints and how to use all theses tokens can be found on **http://wiki.vg/Authentication**.

**Debug mode** can be enabled on all instances of ``YggdrasilRequester``, this will log in plaintext every request/response.

```java
YggdrasilRequester.setDebug(true);
```

## Reading the launcher_profile.json

```java
try {
	LauncherProfiles launcherProfiles = LauncherProfiles.getLauncherProfiles();
	System.out.println(launcherProfiles.getClientToken());
}
catch (JsonSyntaxException | IOException e) {
	e.printStackTrace();
}
```
Why make things complicated ?
