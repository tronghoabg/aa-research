.class Lcom/applovin/impl/q0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/applovin/impl/sdk/network/a;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/Object;

.field private final e:Z

.field private final f:Lcom/applovin/impl/q0$b;

.field private final g:Lcom/applovin/impl/q0$e;

.field final synthetic h:Lcom/applovin/impl/q0;


# direct methods
.method private constructor <init>(Lcom/applovin/impl/q0;Ljava/lang/String;Lcom/applovin/impl/sdk/network/a;Ljava/lang/String;Ljava/lang/Object;ZLcom/applovin/impl/q0$b;Lcom/applovin/impl/q0$e;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/applovin/impl/q0$c;->b:Lcom/applovin/impl/sdk/network/a;

    .line 5
    iput-object p4, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 7
    iput-boolean p6, p0, Lcom/applovin/impl/q0$c;->e:Z

    .line 8
    iput-object p7, p0, Lcom/applovin/impl/q0$c;->f:Lcom/applovin/impl/q0$b;

    .line 9
    iput-object p8, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/q0;Ljava/lang/String;Lcom/applovin/impl/sdk/network/a;Ljava/lang/String;Ljava/lang/Object;ZLcom/applovin/impl/q0$b;Lcom/applovin/impl/q0$e;Lcom/applovin/impl/q0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/applovin/impl/q0$c;-><init>(Lcom/applovin/impl/q0;Ljava/lang/String;Lcom/applovin/impl/sdk/network/a;Ljava/lang/String;Ljava/lang/Object;ZLcom/applovin/impl/q0$b;Lcom/applovin/impl/q0$e;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/impl/b4$d;)V
    .locals 12

    .line 1
    const-string v1, "Unable to parse response from "

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->e()J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    const/4 v9, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->c()I

    .line 9
    .line 10
    .line 11
    move-result v5
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-lez v5, :cond_b

    .line 13
    .line 14
    const/16 v0, 0xc8

    .line 15
    .line 16
    if-lt v5, v0, :cond_a

    .line 17
    .line 18
    const/16 v0, 0x190

    .line 19
    .line 20
    if-ge v5, v0, :cond_a

    .line 21
    .line 22
    :try_start_1
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->f:Lcom/applovin/impl/q0$b;
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    :try_start_2
    invoke-static {v0, v6, v7}, Lcom/applovin/impl/q0$b;->a(Lcom/applovin/impl/q0$b;J)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object v8, v0

    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :catch_0
    move-exception v0

    .line 35
    :goto_0
    move-object p1, v0

    .line 36
    :goto_1
    move-object v8, p1

    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_0
    :goto_2
    :try_start_3
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static/range {v2 .. v7}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/String;IJ)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    move v8, v5

    .line 49
    :try_start_4
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->d()[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Lcom/applovin/impl/o7;->h(Landroid/content/Context;)Z

    .line 58
    .line 59
    .line 60
    move-result v2
    :try_end_4
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 61
    const-string v3, "UTF-8"

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    :try_start_5
    iget-boolean v2, p0, Lcom/applovin/impl/q0$c;->e:Z

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-static {v0}, Lcom/applovin/impl/v4;->b([B)Lcom/applovin/impl/v4$a;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    sget-object v4, Lcom/applovin/impl/v4$a;->d:Lcom/applovin/impl/v4$a;
    :try_end_5
    .catch Ljava/net/MalformedURLException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 74
    .line 75
    if-eq v2, v4, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catch_1
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    move v5, v8

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    :goto_3
    const-string v2, ""

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    :try_start_6
    new-instance v4, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->d()[B

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-direct {v4, v5, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_2
    move-object v4, v2

    .line 101
    :goto_4
    iget-object v5, p0, Lcom/applovin/impl/q0$c;->b:Lcom/applovin/impl/sdk/network/a;

    .line 102
    .line 103
    invoke-virtual {v5}, Lcom/applovin/impl/sdk/network/a;->b()Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-eqz v5, :cond_3

    .line 108
    .line 109
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->b:Lcom/applovin/impl/sdk/network/a;

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/network/a;->b()Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    :cond_3
    iget-object v5, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 120
    .line 121
    invoke-static {v5}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5}, Lcom/applovin/impl/sdk/k;->t()Lcom/applovin/impl/sdk/j;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-object v10, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v5, v4, v10, v2}, Lcom/applovin/impl/sdk/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    if-eqz v0, :cond_9

    .line 135
    .line 136
    new-instance v10, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->d()[B

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-direct {v10, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->f:Lcom/applovin/impl/q0$b;

    .line 150
    .line 151
    if-eqz v2, :cond_5

    .line 152
    .line 153
    array-length v3, v0

    .line 154
    int-to-long v3, v3

    .line 155
    invoke-static {v2, v3, v4}, Lcom/applovin/impl/q0$b;->b(Lcom/applovin/impl/q0$b;J)V

    .line 156
    .line 157
    .line 158
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->b:Lcom/applovin/impl/sdk/network/a;

    .line 159
    .line 160
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/network/a;->r()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    iget-object v11, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 167
    .line 168
    new-instance v2, Lcom/applovin/impl/q0$d;

    .line 169
    .line 170
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->b:Lcom/applovin/impl/sdk/network/a;

    .line 171
    .line 172
    invoke-virtual {v3}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    array-length v4, v0

    .line 177
    int-to-long v4, v4

    .line 178
    invoke-direct/range {v2 .. v7}, Lcom/applovin/impl/q0$d;-><init>(Ljava/lang/String;JJ)V

    .line 179
    .line 180
    .line 181
    invoke-static {v11, v2}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Lcom/applovin/impl/q0$d;)Lcom/applovin/impl/q0$d;

    .line 182
    .line 183
    .line 184
    :cond_5
    iget-boolean v2, p0, Lcom/applovin/impl/q0$c;->e:Z

    .line 185
    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 189
    .line 190
    invoke-static {v2}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/k;->j0()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 199
    .line 200
    invoke-static {v3}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/v4;->b([BLjava/lang/String;Lcom/applovin/impl/sdk/k;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-nez v0, :cond_6

    .line 209
    .line 210
    new-instance v2, Ljava/util/HashMap;

    .line 211
    .line 212
    const/4 v3, 0x2

    .line 213
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const-string v3, "request"

    .line 217
    .line 218
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 219
    .line 220
    invoke-static {v4}, Lcom/applovin/impl/sdk/utils/StringUtils;->getHostAndPath(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    const-string v3, "response"

    .line 228
    .line 229
    invoke-virtual {v2, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 233
    .line 234
    invoke-static {v3}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, Lcom/applovin/impl/sdk/k;->F()Lcom/applovin/impl/sdk/EventServiceImpl;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    const-string v4, "rdf"

    .line 243
    .line 244
    invoke-virtual {v3, v4, v2}, Lcom/applovin/impl/sdk/EventServiceImpl;->trackEvent(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_6
    .catch Ljava/net/MalformedURLException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 245
    .line 246
    .line 247
    :cond_6
    move-object v10, v0

    .line 248
    :cond_7
    :try_start_7
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 249
    .line 250
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v0, v10, v2}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 257
    .line 258
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 259
    .line 260
    invoke-interface {v2, v3, v0, v8}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :catchall_1
    move-exception v0

    .line 265
    :try_start_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 271
    .line 272
    invoke-static {v1}, Lcom/applovin/impl/sdk/utils/StringUtils;->getHostAndPath(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v1, " because of "

    .line 280
    .line 281
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v1, " : "

    .line 296
    .line 297
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 312
    .line 313
    invoke-static {v2}, Lcom/applovin/impl/q0;->b(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/o;

    .line 314
    .line 315
    .line 316
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 317
    .line 318
    .line 319
    move-result v2
    :try_end_8
    .catch Ljava/net/MalformedURLException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 320
    const-string v3, "ConnectionManager"

    .line 321
    .line 322
    if-eqz v2, :cond_8

    .line 323
    .line 324
    :try_start_9
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 325
    .line 326
    invoke-static {v2}, Lcom/applovin/impl/q0;->b(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/o;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v2, v3, v1, v0}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 331
    .line 332
    .line 333
    :cond_8
    const-string v2, "url"

    .line 334
    .line 335
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 336
    .line 337
    invoke-static {v4}, Lcom/applovin/impl/sdk/utils/StringUtils;->getHostAndPath(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-static {v2, v4}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 346
    .line 347
    invoke-static {v4}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    invoke-virtual {v4}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    const-string v5, "failedToParseResponse"

    .line 356
    .line 357
    invoke-virtual {v4, v3, v5, v0, v2}, Lcom/applovin/impl/r1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 358
    .line 359
    .line 360
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 361
    .line 362
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 363
    .line 364
    const/16 v3, -0x320

    .line 365
    .line 366
    invoke-interface {v0, v2, v3, v1, v9}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_7

    .line 370
    .line 371
    :cond_9
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 372
    .line 373
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 374
    .line 375
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-interface {v0, v1, v2, v8}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :catch_2
    move-exception v0

    .line 382
    move v8, v5

    .line 383
    goto/16 :goto_0

    .line 384
    .line 385
    :cond_a
    move v8, v5

    .line 386
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 387
    .line 388
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 389
    .line 390
    invoke-interface {v0, v1, v8, v9, v9}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/net/MalformedURLException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_b
    move v8, v5

    .line 395
    :try_start_a
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 396
    .line 397
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 398
    .line 399
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;
    :try_end_a
    .catch Ljava/net/MalformedURLException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 400
    .line 401
    move v5, v8

    .line 402
    const/4 v8, 0x0

    .line 403
    :try_start_b
    invoke-static/range {v2 .. v8}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Throwable;)V

    .line 404
    .line 405
    .line 406
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 407
    .line 408
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 409
    .line 410
    invoke-interface {v0, v1, v5, v9, v9}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/net/MalformedURLException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :catch_3
    move-exception v0

    .line 415
    move v5, v8

    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :goto_5
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->b()I

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    :try_start_c
    invoke-virtual {p1}, Lcom/applovin/impl/b4$d;->f()[B

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    new-instance v0, Ljava/lang/String;

    .line 427
    .line 428
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 429
    .line 430
    .line 431
    if-eqz p1, :cond_d

    .line 432
    .line 433
    iget-boolean v1, p0, Lcom/applovin/impl/q0$c;->e:Z

    .line 434
    .line 435
    if-eqz v1, :cond_c

    .line 436
    .line 437
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 438
    .line 439
    invoke-static {v0}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->j0()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 448
    .line 449
    invoke-static {v1}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;)Lcom/applovin/impl/sdk/k;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-static {p1, v0, v1}, Lcom/applovin/impl/v4;->b([BLjava/lang/String;Lcom/applovin/impl/sdk/k;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :cond_c
    iget-object p1, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 458
    .line 459
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 460
    .line 461
    invoke-static {p1, v0, v1}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v9
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 465
    :catchall_2
    :cond_d
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 466
    .line 467
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 468
    .line 469
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 470
    .line 471
    invoke-static/range {v2 .. v8}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    iget-object p1, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 475
    .line 476
    iget-object v0, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-interface {p1, v0, v5, v1, v9}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    goto :goto_7

    .line 486
    :catch_4
    move-exception v0

    .line 487
    move-object p1, v0

    .line 488
    const/4 v5, 0x0

    .line 489
    goto/16 :goto_1

    .line 490
    .line 491
    :goto_6
    iget-object p1, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 492
    .line 493
    const/16 v0, -0x385

    .line 494
    .line 495
    if-eqz p1, :cond_e

    .line 496
    .line 497
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 498
    .line 499
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 500
    .line 501
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 502
    .line 503
    invoke-static/range {v2 .. v8}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    iget-object p1, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 507
    .line 508
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 509
    .line 510
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-interface {p1, v1, v0, v2, v9}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    goto :goto_7

    .line 518
    :cond_e
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->h:Lcom/applovin/impl/q0;

    .line 519
    .line 520
    iget-object v3, p0, Lcom/applovin/impl/q0$c;->c:Ljava/lang/String;

    .line 521
    .line 522
    iget-object v4, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 523
    .line 524
    invoke-static/range {v2 .. v7}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/q0;Ljava/lang/String;Ljava/lang/String;IJ)V

    .line 525
    .line 526
    .line 527
    iget-object p1, p0, Lcom/applovin/impl/q0$c;->g:Lcom/applovin/impl/q0$e;

    .line 528
    .line 529
    iget-object v1, p0, Lcom/applovin/impl/q0$c;->a:Ljava/lang/String;

    .line 530
    .line 531
    iget-object v2, p0, Lcom/applovin/impl/q0$c;->d:Ljava/lang/Object;

    .line 532
    .line 533
    invoke-interface {p1, v1, v2, v0}, Lcom/applovin/impl/q0$e;->a(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 534
    .line 535
    .line 536
    :goto_7
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/applovin/impl/b4$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/applovin/impl/q0$c;->a(Lcom/applovin/impl/b4$d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
