.class public final Lokhttp3/internal/authenticator/JavaNetAuthenticator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Authenticator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/authenticator/JavaNetAuthenticator$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/authenticator/JavaNetAuthenticator;",
        "Lokhttp3/Authenticator;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lokhttp3/Dns;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/authenticator/JavaNetAuthenticator;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    sget-object p1, Lokhttp3/Dns;->a:Lokhttp3/Dns;

    .line 3
    const-string v0, "defaultDns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->b:Lokhttp3/Dns;

    return-void
.end method

.method public static b(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Lokhttp3/internal/authenticator/JavaNetAuthenticator$WhenMappings;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    iget-object p0, p1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p2, p0}, Lokhttp3/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/net/InetAddress;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    check-cast p0, Ljava/net/InetSocketAddress;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string p1, "address() as InetSocketAddress).address"

    .line 46
    .line 47
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 52
    .line 53
    const-string p1, "null cannot be cast to non-null type java.net.InetSocketAddress"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method


# virtual methods
.method public final a(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v4, v2, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 12
    .line 13
    iget v0, v2, Lokhttp3/Response;->d:I

    .line 14
    .line 15
    const/16 v5, 0x191

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/16 v7, 0x197

    .line 19
    .line 20
    if-eq v0, v5, :cond_1

    .line 21
    .line 22
    if-eq v0, v7, :cond_0

    .line 23
    .line 24
    sget-object v0, Lff/v;->a:Lff/v;

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    const-string v0, "Proxy-Authenticate"

    .line 28
    .line 29
    :goto_0
    move-object v5, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string v0, "WWW-Authenticate"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    sget-object v0, Lokhttp3/internal/http/HttpHeaders;->a:Lcg/j;

    .line 35
    .line 36
    new-instance v8, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lokhttp3/Headers;->size()I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    move v0, v6

    .line 46
    :goto_2
    if-ge v0, v9, :cond_3

    .line 47
    .line 48
    add-int/lit8 v10, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-virtual {v5, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_2

    .line 59
    .line 60
    new-instance v11, Lcg/g;

    .line 61
    .line 62
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v0}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v11, v0}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :try_start_0
    invoke-static {v11, v8}, Lokhttp3/internal/http/HttpHeaders;->b(Lcg/g;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :catch_0
    move-exception v0

    .line 77
    sget-object v11, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform$Companion;

    .line 78
    .line 79
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v11, Lokhttp3/internal/platform/Platform;->b:Lokhttp3/internal/platform/Platform;

    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const-string v11, "Unable to parse challenge"

    .line 88
    .line 89
    const/4 v12, 0x5

    .line 90
    invoke-static {v11, v12, v0}, Lokhttp3/internal/platform/Platform;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_3
    move v0, v10

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v0, v8

    .line 96
    :goto_4
    iget-object v4, v2, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 97
    .line 98
    iget-object v5, v4, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 99
    .line 100
    iget v2, v2, Lokhttp3/Response;->d:I

    .line 101
    .line 102
    if-ne v2, v7, :cond_4

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_4
    move v3, v6

    .line 106
    :goto_5
    if-nez v1, :cond_5

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    goto :goto_6

    .line 110
    :cond_5
    iget-object v6, v1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 111
    .line 112
    :goto_6
    if-nez v6, :cond_6

    .line 113
    .line 114
    sget-object v6, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 115
    .line 116
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_7
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_f

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    check-cast v7, Lokhttp3/Challenge;

    .line 131
    .line 132
    iget-object v8, v7, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 133
    .line 134
    const-string v9, "Basic"

    .line 135
    .line 136
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-nez v8, :cond_8

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_8
    if-nez v1, :cond_9

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    goto :goto_8

    .line 147
    :cond_9
    iget-object v8, v1, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 148
    .line 149
    iget-object v8, v8, Lokhttp3/Address;->a:Lokhttp3/Dns;

    .line 150
    .line 151
    :goto_8
    move-object/from16 v9, p0

    .line 152
    .line 153
    if-nez v8, :cond_a

    .line 154
    .line 155
    iget-object v8, v9, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->b:Lokhttp3/Dns;

    .line 156
    .line 157
    :cond_a
    const-string v10, "realm"

    .line 158
    .line 159
    if-eqz v3, :cond_c

    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    if-eqz v11, :cond_b

    .line 166
    .line 167
    check-cast v11, Ljava/net/InetSocketAddress;

    .line 168
    .line 169
    invoke-virtual {v11}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    invoke-static {v6, v5, v8}, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->b(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    invoke-virtual {v11}, Ljava/net/InetSocketAddress;->getPort()I

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    iget-object v15, v5, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v8, v7, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 184
    .line 185
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    move-object/from16 v16, v8

    .line 190
    .line 191
    check-cast v16, Ljava/lang/String;

    .line 192
    .line 193
    iget-object v8, v7, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 194
    .line 195
    :try_start_1
    new-instance v10, Ljava/net/URL;

    .line 196
    .line 197
    iget-object v11, v5, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 198
    .line 199
    invoke-direct {v10, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1

    .line 200
    .line 201
    .line 202
    sget-object v19, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    .line 203
    .line 204
    move-object/from16 v17, v8

    .line 205
    .line 206
    move-object/from16 v18, v10

    .line 207
    .line 208
    invoke-static/range {v12 .. v19}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    const/16 p2, 0x0

    .line 213
    .line 214
    goto :goto_9

    .line 215
    :catch_1
    move-exception v0

    .line 216
    new-instance v1, Ljava/lang/RuntimeException;

    .line 217
    .line 218
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    throw v1

    .line 222
    :cond_b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 223
    .line 224
    const-string v1, "null cannot be cast to non-null type java.net.InetSocketAddress"

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v0

    .line 230
    :cond_c
    iget-object v11, v5, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 231
    .line 232
    const-string v12, "proxy"

    .line 233
    .line 234
    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-static {v6, v5, v8}, Lokhttp3/internal/authenticator/JavaNetAuthenticator;->b(Ljava/net/Proxy;Lokhttp3/HttpUrl;Lokhttp3/Dns;)Ljava/net/InetAddress;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    iget v12, v5, Lokhttp3/HttpUrl;->e:I

    .line 242
    .line 243
    iget-object v13, v5, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 244
    .line 245
    iget-object v14, v7, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 246
    .line 247
    invoke-interface {v14, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    move-object v14, v10

    .line 252
    check-cast v14, Ljava/lang/String;

    .line 253
    .line 254
    iget-object v15, v7, Lokhttp3/Challenge;->a:Ljava/lang/String;

    .line 255
    .line 256
    :try_start_2
    new-instance v10, Ljava/net/URL;

    .line 257
    .line 258
    const/16 p2, 0x0

    .line 259
    .line 260
    iget-object v2, v5, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 261
    .line 262
    invoke-direct {v10, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_3

    .line 263
    .line 264
    .line 265
    sget-object v17, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    .line 266
    .line 267
    move-object/from16 v16, v10

    .line 268
    .line 269
    move-object v10, v11

    .line 270
    move-object v11, v8

    .line 271
    invoke-static/range {v10 .. v17}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    :goto_9
    if-eqz v8, :cond_7

    .line 276
    .line 277
    if-eqz v3, :cond_d

    .line 278
    .line 279
    const-string v0, "Proxy-Authorization"

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_d
    const-string v0, "Authorization"

    .line 283
    .line 284
    :goto_a
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    const-string v2, "auth.userName"

    .line 289
    .line 290
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    new-instance v2, Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    const-string v5, "auth.password"

    .line 300
    .line 301
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    .line 305
    .line 306
    .line 307
    iget-object v3, v7, Lokhttp3/Challenge;->b:Ljava/util/Map;

    .line 308
    .line 309
    const-string v5, "charset"

    .line 310
    .line 311
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    check-cast v3, Ljava/lang/String;

    .line 316
    .line 317
    if-eqz v3, :cond_e

    .line 318
    .line 319
    :try_start_3
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    const-string v5, "forName(charset)"

    .line 324
    .line 325
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 326
    .line 327
    .line 328
    goto :goto_b

    .line 329
    :catch_2
    :cond_e
    sget-object v3, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 330
    .line 331
    const-string v5, "ISO_8859_1"

    .line 332
    .line 333
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :goto_b
    sget v5, Lokhttp3/Credentials;->a:I

    .line 337
    .line 338
    new-instance v5, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const/16 v1, 0x3a

    .line 347
    .line 348
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    sget-object v2, Lcg/j;->d:Lcg/j;

    .line 359
    .line 360
    const-string v2, "<this>"

    .line 361
    .line 362
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v2, Lcg/j;

    .line 366
    .line 367
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v3, "getBytes(...)"

    .line 372
    .line 373
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-direct {v2, v1}, Lcg/j;-><init>([B)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Lcg/j;->a()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    const-string v2, "Basic "

    .line 384
    .line 385
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v4}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-virtual {v2, v0, v1}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0

    .line 401
    :catch_3
    move-exception v0

    .line 402
    new-instance v1, Ljava/lang/RuntimeException;

    .line 403
    .line 404
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 405
    .line 406
    .line 407
    throw v1

    .line 408
    :cond_f
    move-object/from16 v9, p0

    .line 409
    .line 410
    const/16 p2, 0x0

    .line 411
    .line 412
    return-object p2
.end method
