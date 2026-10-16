.class public final Lokhttp3/internal/http/RetryAndFollowUpInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/http/RetryAndFollowUpInterceptor;",
        "Lokhttp3/Interceptor;",
        "Companion",
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
.field public final a:Lokhttp3/OkHttpClient;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 10
    .line 11
    return-void
.end method

.method public static c(Lokhttp3/Response;I)I
    .locals 1

    .line 1
    const-string v0, "Retry-After"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    const-string p1, "\\d+"

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "compile(...)"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "valueOf(header)"

    .line 36
    .line 37
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    const p0, 0x7fffffff

    .line 46
    .line 47
    .line 48
    return p0
.end method


# virtual methods
.method public final a(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)Lokhttp3/Request;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :goto_0
    move-object v1, v0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p2, Lokhttp3/internal/connection/Exchange;->f:Lokhttp3/internal/connection/RealConnection;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, v1, Lokhttp3/internal/connection/RealConnection;->b:Lokhttp3/Route;

    .line 12
    .line 13
    :goto_1
    iget v2, p1, Lokhttp3/Response;->d:I

    .line 14
    .line 15
    iget-object v3, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 16
    .line 17
    iget-object v4, v3, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    const/16 v7, 0x134

    .line 22
    .line 23
    const/16 v8, 0x133

    .line 24
    .line 25
    if-eq v2, v8, :cond_f

    .line 26
    .line 27
    if-eq v2, v7, :cond_f

    .line 28
    .line 29
    const/16 v9, 0x191

    .line 30
    .line 31
    if-eq v2, v9, :cond_e

    .line 32
    .line 33
    const/16 v9, 0x1a5

    .line 34
    .line 35
    if-eq v2, v9, :cond_b

    .line 36
    .line 37
    const/16 p2, 0x1f7

    .line 38
    .line 39
    if-eq v2, p2, :cond_9

    .line 40
    .line 41
    const/16 p2, 0x197

    .line 42
    .line 43
    if-eq v2, p2, :cond_7

    .line 44
    .line 45
    const/16 p2, 0x198

    .line 46
    .line 47
    if-eq v2, p2, :cond_2

    .line 48
    .line 49
    packed-switch v2, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_2
    iget-object v1, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 55
    .line 56
    iget-boolean v1, v1, Lokhttp3/OkHttpClient;->f:Z

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_3
    iget-object v1, v3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1}, Lokhttp3/RequestBody;->isOneShot()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_4
    iget-object v1, p1, Lokhttp3/Response;->j:Lokhttp3/Response;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    iget v1, v1, Lokhttp3/Response;->d:I

    .line 79
    .line 80
    if-ne v1, p2, :cond_5

    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_5
    invoke-static {p1, v5}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c(Lokhttp3/Response;I)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-lez p2, :cond_6

    .line 89
    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :cond_6
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object p2, v1, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 105
    .line 106
    if-ne p2, v0, :cond_8

    .line 107
    .line 108
    iget-object p2, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 109
    .line 110
    iget-object p2, p2, Lokhttp3/OkHttpClient;->n:Lokhttp3/Authenticator;

    .line 111
    .line 112
    invoke-interface {p2, v1, p1}, Lokhttp3/Authenticator;->a(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :cond_8
    new-instance p1, Ljava/net/ProtocolException;

    .line 118
    .line 119
    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_9
    iget-object v1, p1, Lokhttp3/Response;->j:Lokhttp3/Response;

    .line 126
    .line 127
    if-eqz v1, :cond_a

    .line 128
    .line 129
    iget v1, v1, Lokhttp3/Response;->d:I

    .line 130
    .line 131
    if-ne v1, p2, :cond_a

    .line 132
    .line 133
    goto/16 :goto_3

    .line 134
    .line 135
    :cond_a
    const p2, 0x7fffffff

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p2}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->c(Lokhttp3/Response;I)I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-nez p2, :cond_14

    .line 143
    .line 144
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 145
    .line 146
    return-object p1

    .line 147
    :cond_b
    iget-object v1, v3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 148
    .line 149
    if-eqz v1, :cond_c

    .line 150
    .line 151
    invoke-virtual {v1}, Lokhttp3/RequestBody;->isOneShot()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_c

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_c
    if-eqz p2, :cond_14

    .line 159
    .line 160
    iget-object v1, p2, Lokhttp3/internal/connection/Exchange;->c:Lokhttp3/internal/connection/ExchangeFinder;

    .line 161
    .line 162
    iget-object v1, v1, Lokhttp3/internal/connection/ExchangeFinder;->b:Lokhttp3/Address;

    .line 163
    .line 164
    iget-object v1, v1, Lokhttp3/Address;->h:Lokhttp3/HttpUrl;

    .line 165
    .line 166
    iget-object v1, v1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v2, p2, Lokhttp3/internal/connection/Exchange;->f:Lokhttp3/internal/connection/RealConnection;

    .line 169
    .line 170
    iget-object v2, v2, Lokhttp3/internal/connection/RealConnection;->b:Lokhttp3/Route;

    .line 171
    .line 172
    iget-object v2, v2, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 173
    .line 174
    iget-object v2, v2, Lokhttp3/Address;->h:Lokhttp3/HttpUrl;

    .line 175
    .line 176
    iget-object v2, v2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_d

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_d
    iget-object p2, p2, Lokhttp3/internal/connection/Exchange;->f:Lokhttp3/internal/connection/RealConnection;

    .line 186
    .line 187
    monitor-enter p2

    .line 188
    :try_start_0
    iput-boolean v6, p2, Lokhttp3/internal/connection/RealConnection;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    monitor-exit p2

    .line 191
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 192
    .line 193
    return-object p1

    .line 194
    :catchall_0
    move-exception p1

    .line 195
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    throw p1

    .line 197
    :cond_e
    iget-object p2, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 198
    .line 199
    iget-object p2, p2, Lokhttp3/OkHttpClient;->g:Lokhttp3/Authenticator;

    .line 200
    .line 201
    invoke-interface {p2, v1, p1}, Lokhttp3/Authenticator;->a(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    return-object p1

    .line 206
    :cond_f
    :pswitch_0
    iget-object p2, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 207
    .line 208
    iget-boolean v1, p2, Lokhttp3/OkHttpClient;->h:Z

    .line 209
    .line 210
    if-nez v1, :cond_10

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_10
    const-string v1, "Location"

    .line 214
    .line 215
    invoke-static {v1, p1}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    if-nez v1, :cond_11

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_11
    iget-object v2, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 223
    .line 224
    iget-object v3, v2, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v1}, Lokhttp3/HttpUrl;->g(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-nez v1, :cond_12

    .line 234
    .line 235
    move-object v1, v0

    .line 236
    goto :goto_2

    .line 237
    :cond_12
    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->a()Lokhttp3/HttpUrl;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    :goto_2
    if-nez v1, :cond_13

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_13
    iget-object v3, v2, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 245
    .line 246
    iget-object v3, v3, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v9, v1, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-nez v3, :cond_15

    .line 255
    .line 256
    iget-boolean p2, p2, Lokhttp3/OkHttpClient;->i:Z

    .line 257
    .line 258
    if-nez p2, :cond_15

    .line 259
    .line 260
    :cond_14
    :goto_3
    return-object v0

    .line 261
    :cond_15
    invoke-virtual {v2}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-static {v4}, Lokhttp3/internal/http/HttpMethod;->b(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_1a

    .line 270
    .line 271
    sget-object v3, Lokhttp3/internal/http/HttpMethod;->a:Lokhttp3/internal/http/HttpMethod;

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    const-string v3, "PROPFIND"

    .line 277
    .line 278
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    iget p1, p1, Lokhttp3/Response;->d:I

    .line 283
    .line 284
    if-nez v9, :cond_16

    .line 285
    .line 286
    if-eq p1, v7, :cond_16

    .line 287
    .line 288
    if-ne p1, v8, :cond_17

    .line 289
    .line 290
    :cond_16
    move v5, v6

    .line 291
    :cond_17
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-nez v3, :cond_18

    .line 296
    .line 297
    if-eq p1, v7, :cond_18

    .line 298
    .line 299
    if-eq p1, v8, :cond_18

    .line 300
    .line 301
    const-string p1, "GET"

    .line 302
    .line 303
    invoke-virtual {p2, p1, v0}, Lokhttp3/Request$Builder;->f(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_18
    if-eqz v5, :cond_19

    .line 308
    .line 309
    iget-object v0, v2, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 310
    .line 311
    :cond_19
    invoke-virtual {p2, v4, v0}, Lokhttp3/Request$Builder;->f(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 312
    .line 313
    .line 314
    :goto_4
    if-nez v5, :cond_1a

    .line 315
    .line 316
    const-string p1, "Transfer-Encoding"

    .line 317
    .line 318
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 319
    .line 320
    invoke-virtual {v0, p1}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    const-string p1, "Content-Length"

    .line 324
    .line 325
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 326
    .line 327
    invoke-virtual {v0, p1}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    const-string p1, "Content-Type"

    .line 331
    .line 332
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 333
    .line 334
    invoke-virtual {v0, p1}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_1a
    iget-object p1, v2, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 338
    .line 339
    invoke-static {p1, v1}, Lokhttp3/internal/Util;->a(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-nez p1, :cond_1b

    .line 344
    .line 345
    const-string p1, "Authorization"

    .line 346
    .line 347
    iget-object v0, p2, Lokhttp3/Request$Builder;->c:Lokhttp3/Headers$Builder;

    .line 348
    .line 349
    invoke-virtual {v0, p1}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_1b
    iput-object v1, p2, Lokhttp3/Request$Builder;->a:Lokhttp3/HttpUrl;

    .line 353
    .line 354
    invoke-virtual {p2}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    return-object p1

    .line 359
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    iget-boolean v0, v0, Lokhttp3/OkHttpClient;->f:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    iget-object p3, p3, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    invoke-virtual {p3}, Lokhttp3/RequestBody;->isOneShot()Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-nez p3, :cond_12

    .line 21
    .line 22
    :cond_1
    instance-of p3, p1, Ljava/io/FileNotFoundException;

    .line 23
    .line 24
    if-eqz p3, :cond_2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_2
    instance-of p3, p1, Ljava/net/ProtocolException;

    .line 28
    .line 29
    if-eqz p3, :cond_3

    .line 30
    .line 31
    return v1

    .line 32
    :cond_3
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    .line 33
    .line 34
    if-eqz p3, :cond_4

    .line 35
    .line 36
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 37
    .line 38
    if-eqz p1, :cond_12

    .line 39
    .line 40
    if-nez p4, :cond_12

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 44
    .line 45
    if-eqz p3, :cond_5

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    instance-of p3, p3, Ljava/security/cert/CertificateException;

    .line 52
    .line 53
    if-eqz p3, :cond_5

    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_5
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 58
    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    :goto_0
    iget-object p1, p2, Lokhttp3/internal/connection/RealCall;->h:Lokhttp3/internal/connection/ExchangeFinder;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget p2, p1, Lokhttp3/internal/connection/ExchangeFinder;->g:I

    .line 68
    .line 69
    const/4 p3, 0x1

    .line 70
    if-nez p2, :cond_7

    .line 71
    .line 72
    iget p4, p1, Lokhttp3/internal/connection/ExchangeFinder;->h:I

    .line 73
    .line 74
    if-nez p4, :cond_7

    .line 75
    .line 76
    iget p4, p1, Lokhttp3/internal/connection/ExchangeFinder;->i:I

    .line 77
    .line 78
    if-nez p4, :cond_7

    .line 79
    .line 80
    move p1, v1

    .line 81
    goto :goto_5

    .line 82
    :cond_7
    iget-object p4, p1, Lokhttp3/internal/connection/ExchangeFinder;->j:Lokhttp3/Route;

    .line 83
    .line 84
    if-eqz p4, :cond_8

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_8
    const/4 p4, 0x0

    .line 88
    if-gt p2, p3, :cond_d

    .line 89
    .line 90
    iget p2, p1, Lokhttp3/internal/connection/ExchangeFinder;->h:I

    .line 91
    .line 92
    if-gt p2, p3, :cond_d

    .line 93
    .line 94
    iget p2, p1, Lokhttp3/internal/connection/ExchangeFinder;->i:I

    .line 95
    .line 96
    if-lez p2, :cond_9

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_9
    iget-object p2, p1, Lokhttp3/internal/connection/ExchangeFinder;->c:Lokhttp3/internal/connection/RealCall;

    .line 100
    .line 101
    iget-object p2, p2, Lokhttp3/internal/connection/RealCall;->i:Lokhttp3/internal/connection/RealConnection;

    .line 102
    .line 103
    if-nez p2, :cond_a

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_a
    monitor-enter p2

    .line 107
    :try_start_0
    iget v0, p2, Lokhttp3/internal/connection/RealConnection;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    if-eqz v0, :cond_b

    .line 110
    .line 111
    monitor-exit p2

    .line 112
    goto :goto_1

    .line 113
    :cond_b
    :try_start_1
    iget-object v0, p2, Lokhttp3/internal/connection/RealConnection;->b:Lokhttp3/Route;

    .line 114
    .line 115
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 116
    .line 117
    iget-object v0, v0, Lokhttp3/Address;->h:Lokhttp3/HttpUrl;

    .line 118
    .line 119
    iget-object v2, p1, Lokhttp3/internal/connection/ExchangeFinder;->b:Lokhttp3/Address;

    .line 120
    .line 121
    iget-object v2, v2, Lokhttp3/Address;->h:Lokhttp3/HttpUrl;

    .line 122
    .line 123
    invoke-static {v0, v2}, Lokhttp3/internal/Util;->a(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z

    .line 124
    .line 125
    .line 126
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    if-nez v0, :cond_c

    .line 128
    .line 129
    monitor-exit p2

    .line 130
    goto :goto_1

    .line 131
    :cond_c
    :try_start_2
    iget-object p4, p2, Lokhttp3/internal/connection/RealConnection;->b:Lokhttp3/Route;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    .line 133
    monitor-exit p2

    .line 134
    goto :goto_1

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    monitor-exit p2

    .line 137
    throw p1

    .line 138
    :cond_d
    :goto_1
    if-eqz p4, :cond_e

    .line 139
    .line 140
    iput-object p4, p1, Lokhttp3/internal/connection/ExchangeFinder;->j:Lokhttp3/Route;

    .line 141
    .line 142
    :goto_2
    move p1, p3

    .line 143
    goto :goto_5

    .line 144
    :cond_e
    iget-object p2, p1, Lokhttp3/internal/connection/ExchangeFinder;->e:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 145
    .line 146
    if-nez p2, :cond_f

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_f
    invoke-virtual {p2}, Lokhttp3/internal/connection/RouteSelector$Selection;->a()Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-ne p2, p3, :cond_10

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_10
    :goto_3
    iget-object p1, p1, Lokhttp3/internal/connection/ExchangeFinder;->f:Lokhttp3/internal/connection/RouteSelector;

    .line 157
    .line 158
    if-nez p1, :cond_11

    .line 159
    .line 160
    :goto_4
    goto :goto_2

    .line 161
    :cond_11
    invoke-virtual {p1}, Lokhttp3/internal/connection/RouteSelector;->a()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    :goto_5
    if-nez p1, :cond_13

    .line 166
    .line 167
    :cond_12
    :goto_6
    return v1

    .line 168
    :cond_13
    return p3
.end method

.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    check-cast v2, Lokhttp3/internal/http/RealInterceptorChain;

    .line 6
    .line 7
    iget-object v0, v2, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 8
    .line 9
    iget-object v3, v2, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 10
    .line 11
    sget-object v4, Lff/v;->a:Lff/v;

    .line 12
    .line 13
    move-object v8, v4

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    move-object v4, v0

    .line 17
    :goto_0
    const/4 v0, 0x1

    .line 18
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v11, "request"

    .line 22
    .line 23
    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v11, v3, Lokhttp3/internal/connection/RealCall;->k:Lokhttp3/internal/connection/Exchange;

    .line 27
    .line 28
    if-nez v11, :cond_10

    .line 29
    .line 30
    monitor-enter v3

    .line 31
    :try_start_0
    iget-boolean v11, v3, Lokhttp3/internal/connection/RealCall;->m:Z

    .line 32
    .line 33
    if-nez v11, :cond_f

    .line 34
    .line 35
    iget-boolean v11, v3, Lokhttp3/internal/connection/RealCall;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    .line 37
    if-nez v11, :cond_e

    .line 38
    .line 39
    monitor-exit v3

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Lokhttp3/internal/connection/ExchangeFinder;

    .line 43
    .line 44
    iget-object v11, v3, Lokhttp3/internal/connection/RealCall;->c:Lokhttp3/internal/connection/RealConnectionPool;

    .line 45
    .line 46
    iget-object v12, v4, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 47
    .line 48
    iget-boolean v13, v12, Lokhttp3/HttpUrl;->j:Z

    .line 49
    .line 50
    iget-object v14, v3, Lokhttp3/internal/connection/RealCall;->a:Lokhttp3/OkHttpClient;

    .line 51
    .line 52
    if-eqz v13, :cond_1

    .line 53
    .line 54
    iget-object v13, v14, Lokhttp3/OkHttpClient;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 55
    .line 56
    if-eqz v13, :cond_0

    .line 57
    .line 58
    iget-object v15, v14, Lokhttp3/OkHttpClient;->t:Lokhttp3/internal/tls/OkHostnameVerifier;

    .line 59
    .line 60
    iget-object v7, v14, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 61
    .line 62
    move-object/from16 v19, v7

    .line 63
    .line 64
    move-object/from16 v17, v13

    .line 65
    .line 66
    move-object/from16 v18, v15

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v2, "CLEARTEXT-only client"

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_1
    const/16 v17, 0x0

    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    :goto_2
    new-instance v7, Lokhttp3/Address;

    .line 84
    .line 85
    iget-object v15, v14, Lokhttp3/OkHttpClient;->l:Lokhttp3/Dns;

    .line 86
    .line 87
    iget-object v13, v14, Lokhttp3/OkHttpClient;->o:Ljavax/net/SocketFactory;

    .line 88
    .line 89
    iget-object v5, v14, Lokhttp3/OkHttpClient;->n:Lokhttp3/Authenticator;

    .line 90
    .line 91
    iget-object v6, v14, Lokhttp3/OkHttpClient;->s:Ljava/util/List;

    .line 92
    .line 93
    move-object/from16 v20, v5

    .line 94
    .line 95
    iget-object v5, v14, Lokhttp3/OkHttpClient;->r:Ljava/util/List;

    .line 96
    .line 97
    iget-object v14, v14, Lokhttp3/OkHttpClient;->m:Ljava/net/ProxySelector;

    .line 98
    .line 99
    move-object/from16 v16, v13

    .line 100
    .line 101
    iget-object v13, v12, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 102
    .line 103
    iget v12, v12, Lokhttp3/HttpUrl;->e:I

    .line 104
    .line 105
    move-object/from16 v22, v5

    .line 106
    .line 107
    move-object/from16 v21, v6

    .line 108
    .line 109
    move-object/from16 v23, v14

    .line 110
    .line 111
    move v14, v12

    .line 112
    move-object v12, v7

    .line 113
    invoke-direct/range {v12 .. v23}, Lokhttp3/Address;-><init>(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 114
    .line 115
    .line 116
    iget-object v5, v3, Lokhttp3/internal/connection/RealCall;->d:Lokhttp3/EventListener;

    .line 117
    .line 118
    invoke-direct {v0, v11, v12, v3, v5}, Lokhttp3/internal/connection/ExchangeFinder;-><init>(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, v3, Lokhttp3/internal/connection/RealCall;->h:Lokhttp3/internal/connection/ExchangeFinder;

    .line 122
    .line 123
    :cond_2
    :try_start_1
    iget-boolean v0, v3, Lokhttp3/internal/connection/RealCall;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    if-nez v0, :cond_d

    .line 126
    .line 127
    :try_start_2
    invoke-virtual {v2, v4}, Lokhttp3/internal/http/RealInterceptorChain;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_2
    .catch Lokhttp3/internal/connection/RouteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    if-eqz v9, :cond_4

    .line 132
    .line 133
    :try_start_3
    invoke-virtual {v0}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v9}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    const/4 v5, 0x0

    .line 142
    iput-object v5, v4, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 143
    .line 144
    invoke-virtual {v4}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    iget-object v6, v4, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 149
    .line 150
    if-nez v6, :cond_3

    .line 151
    .line 152
    iput-object v4, v0, Lokhttp3/Response$Builder;->j:Lokhttp3/Response;

    .line 153
    .line 154
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_3
    move-object v9, v0

    .line 159
    goto :goto_4

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    const/4 v6, 0x1

    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 165
    .line 166
    const-string v2, "priorResponse.body != null"

    .line 167
    .line 168
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_4
    const/4 v5, 0x0

    .line 173
    goto :goto_3

    .line 174
    :goto_4
    iget-object v0, v3, Lokhttp3/internal/connection/RealCall;->k:Lokhttp3/internal/connection/Exchange;

    .line 175
    .line 176
    invoke-virtual {v1, v9, v0}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->a(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)Lokhttp3/Request;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-nez v4, :cond_7

    .line 181
    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    iget-boolean v0, v0, Lokhttp3/internal/connection/Exchange;->e:Z

    .line 185
    .line 186
    if-eqz v0, :cond_5

    .line 187
    .line 188
    iget-boolean v0, v3, Lokhttp3/internal/connection/RealCall;->j:Z

    .line 189
    .line 190
    if-nez v0, :cond_6

    .line 191
    .line 192
    const/4 v2, 0x1

    .line 193
    iput-boolean v2, v3, Lokhttp3/internal/connection/RealCall;->j:Z

    .line 194
    .line 195
    iget-object v0, v3, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/internal/connection/RealCall$timeout$1;

    .line 196
    .line 197
    invoke-virtual {v0}, Lcg/e;->i()Z

    .line 198
    .line 199
    .line 200
    :cond_5
    const/4 v6, 0x0

    .line 201
    goto :goto_5

    .line 202
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    const-string v2, "Check failed."

    .line 205
    .line 206
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    :goto_5
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 211
    .line 212
    .line 213
    return-object v9

    .line 214
    :cond_7
    const/4 v6, 0x0

    .line 215
    :try_start_4
    iget-object v0, v4, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 216
    .line 217
    if-eqz v0, :cond_8

    .line 218
    .line 219
    invoke-virtual {v0}, Lokhttp3/RequestBody;->isOneShot()Z

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 223
    if-eqz v0, :cond_8

    .line 224
    .line 225
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 226
    .line 227
    .line 228
    return-object v9

    .line 229
    :cond_8
    :try_start_5
    iget-object v0, v9, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 230
    .line 231
    if-nez v0, :cond_9

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_9
    invoke-static {v0}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 235
    .line 236
    .line 237
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 238
    .line 239
    const/16 v0, 0x14

    .line 240
    .line 241
    if-gt v10, v0, :cond_a

    .line 242
    .line 243
    const/4 v6, 0x1

    .line 244
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_a
    :try_start_6
    new-instance v0, Ljava/net/ProtocolException;

    .line 250
    .line 251
    const-string v2, "Too many follow-up requests: "

    .line 252
    .line 253
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v0

    .line 265
    :catch_0
    move-exception v0

    .line 266
    const/4 v5, 0x0

    .line 267
    instance-of v6, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 268
    .line 269
    const/4 v7, 0x1

    .line 270
    xor-int/2addr v6, v7

    .line 271
    invoke-virtual {v1, v0, v3, v4, v6}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;Z)Z

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    if-eqz v6, :cond_b

    .line 276
    .line 277
    check-cast v8, Ljava/util/Collection;

    .line 278
    .line 279
    invoke-static {v8, v0}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 280
    .line 281
    .line 282
    move-result-object v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 283
    invoke-virtual {v3, v7}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 284
    .line 285
    .line 286
    const/4 v0, 0x0

    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :cond_b
    :try_start_7
    invoke-static {v0, v8}, Lokhttp3/internal/Util;->A(Ljava/io/IOException;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :catch_1
    move-exception v0

    .line 294
    const/4 v5, 0x0

    .line 295
    iget-object v6, v0, Lokhttp3/internal/connection/RouteException;->b:Ljava/io/IOException;

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    invoke-virtual {v1, v6, v3, v4, v7}, Lokhttp3/internal/http/RetryAndFollowUpInterceptor;->b(Ljava/io/IOException;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-eqz v6, :cond_c

    .line 303
    .line 304
    check-cast v8, Ljava/util/Collection;

    .line 305
    .line 306
    iget-object v0, v0, Lokhttp3/internal/connection/RouteException;->a:Ljava/io/IOException;

    .line 307
    .line 308
    invoke-static {v8, v0}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 309
    .line 310
    .line 311
    move-result-object v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 312
    const/4 v6, 0x1

    .line 313
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 314
    .line 315
    .line 316
    move v0, v7

    .line 317
    goto/16 :goto_1

    .line 318
    .line 319
    :cond_c
    :try_start_8
    iget-object v0, v0, Lokhttp3/internal/connection/RouteException;->a:Ljava/io/IOException;

    .line 320
    .line 321
    invoke-static {v0, v8}, Lokhttp3/internal/Util;->A(Ljava/io/IOException;Ljava/util/List;)V

    .line 322
    .line 323
    .line 324
    throw v0

    .line 325
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 326
    .line 327
    const-string v2, "Canceled"

    .line 328
    .line 329
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 333
    :goto_7
    invoke-virtual {v3, v6}, Lokhttp3/internal/connection/RealCall;->c(Z)V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :cond_e
    :try_start_9
    const-string v0, "Check failed."

    .line 338
    .line 339
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v2

    .line 345
    :catchall_1
    move-exception v0

    .line 346
    goto :goto_8

    .line 347
    :cond_f
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 348
    .line 349
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 355
    :goto_8
    monitor-exit v3

    .line 356
    throw v0

    .line 357
    :cond_10
    const-string v0, "Check failed."

    .line 358
    .line 359
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 360
    .line 361
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v2
.end method
