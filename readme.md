## Spring Security 实战教程配套代码 

个人博客  [码农小胖哥的博客](https://www.felord.cn/)



请多多关注公众号：码农小胖哥
 
 ![](./qr.jpg)


## 启动DEMO
分别启动**oauth2-server**和**oauth2-client**两个项目。调用 [http://127.0.0.1:8080/oauth2/authorization/felord](http://127.0.0.1:8080/oauth2/authorization/felord)，输入用户名`felord`和密码`password`后即可返回OAuth2.0 Client的信息：
```json
{
    "oAuth2AuthorizedClient": {
        "clientRegistration": {
            "registrationId": "felord",
            "clientId": "felord-client",
            "clientSecret": "secret",
            "clientAuthenticationMethod": {
                "value": "client_secret_basic"
            },
            "authorizationGrantType": {
                "value": "authorization_code"
            },
            "redirectUri": "http://127.0.0.1:8080/foo/bar",
            "scopes": [
                "message.read",
                "message.write"
            ],
            "providerDetails": {
                "authorizationUri": "http://localhost:9000/oauth2/authorize",
                "tokenUri": "http://localhost:9000/oauth2/token",
                "userInfoEndpoint": {
                    "uri": null,
                    "authenticationMethod": {
                        "value": "header"
                    },
                    "userNameAttributeName": null
                },
                "jwkSetUri": null,
                "issuerUri": null,
                "configurationMetadata": {}
            },
            "clientName": "felord",
            "redirectUriTemplate": "http://127.0.0.1:8080/foo/bar"
        },
        "principalName": "anonymousUser",
        "accessToken": {
            "tokenValue": "eyJ4NXQjUzI1NiI6IlZGR1F4Q21nSEloX2dhRi13UGIxeEM5b0tBMXc1bGEwRUZtcXFQTXJxbXciLCJraWQiOiJmZWxvcmRjbiIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJmZWxvcmQiLCJhdWQiOiJmZWxvcmQtY2xpZW50IiwibmJmIjoxNjM2NDI4NjQxLCJzY29wZSI6WyJtZXNzYWdlLnJlYWQiLCJtZXNzYWdlLndyaXRlIl0sImlzcyI6Imh0dHA6XC9cL2xvY2FsaG9zdDo5MDAwIiwiZXhwIjoxNjM2NDI4OTQxLCJpYXQiOjE2MzY0Mjg2NDF9.PSAGviFAX_GKPnKkV9-vLskaqW4lV-VzYiKBVSGRfsngZp_TcqUyxuQrMcD0Uzb21tq-WKv8_8a4_nx8SlZ6PopJJU_sPfGpSaDuVuNF5bT2UPeoG7Ib0lxoysYtvxtTODM2pP_-YG8sPjyQce9c48Q_k6vb2w_AbrPf5jf8MHidZPZqJxyPgxmX9vKuEtc0eo6_h50XigYoYTbKl2_lNV-F0O2viMwbj1Gw8mGVWxPs83-UWa6O8GaIBh2EYpqWRhu7tCqUmysXLPa6UGPVA9ZvvpwqNXUd5lvaQ3hmCrYDUXMTrIMi_CBZj9vE2rIvbZwyCQ22aAdtUt_hocGfFA",
            "issuedAt": "2021-11-09T03:30:41.133Z",
            "expiresAt": "2021-11-09T03:35:40.133Z",
            "tokenType": {
                "value": "Bearer"
            },
            "scopes": [
                "message.read",
                "message.write"
            ]
        },
        "refreshToken": {
            "tokenValue": "nY2XAPvyNZ6e8hx8Zmt2ZCHybaSeRyKbpuVYxsH9oICCa-LG7EbhC8S9W5vZBa2bgmKflT9k2CgqDEI9clrKinjwmE1YKD8DarAxxJCB4LR9Vt7dNiMtiNVKaxV93h2x",
            "issuedAt": "2021-11-09T03:30:41.133Z",
            "expiresAt": null
        }
    },
    "authentication": {
        "authorities": [
            {
                "authority": "ROLE_ANONYMOUS"
            }
        ],
        "details": {
            "remoteAddress": "127.0.0.1",
            "sessionId": "F946D10E329983C1465B8C2D94800AB6"
        },
        "authenticated": true,
        "principal": "anonymousUser",
        "keyHash": 2097646443,
        "credentials": "",
        "name": "anonymousUser"
    }
}
```