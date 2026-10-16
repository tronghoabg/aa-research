.class public final Lxe/a;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lv6/l;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/nativead/model/g;


# direct methods
.method public constructor <init>(Lv6/l;Lcom/moloco/sdk/internal/publisher/nativead/model/g;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxe/a;->a:Lv6/l;

    .line 2
    .line 3
    iput-object p2, p0, Lxe/a;->b:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lxe/a;

    .line 2
    .line 3
    iget-object v0, p0, Lxe/a;->a:Lv6/l;

    .line 4
    .line 5
    iget-object v1, p0, Lxe/a;->b:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lxe/a;-><init>(Lv6/l;Lcom/moloco/sdk/internal/publisher/nativead/model/g;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lxe/a;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lxe/a;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lxe/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 3
    .line 4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lxe/a;->b:Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 8
    .line 9
    iget-object v1, p1, Lcom/moloco/sdk/internal/publisher/nativead/model/g;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lxe/a;->a:Lv6/l;

    .line 12
    .line 13
    :try_start_0
    new-instance v3, Ljava/net/URL;

    .line 14
    .line 15
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_2

    .line 16
    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v1, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    .line 29
    sget-object v3, Lve/b;->a:[Lve/b;

    .line 30
    .line 31
    const-string v3, "GET"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/nativead/model/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1, v4, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-string p1, "Content-Type"

    .line 75
    .line 76
    const-string v3, "application/json"

    .line 77
    .line 78
    invoke-virtual {v1, p1, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string p1, "Accept"

    .line 82
    .line 83
    invoke-virtual {v1, p1, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const/16 v3, 0xc8

    .line 91
    .line 92
    if-gt v3, p1, :cond_1

    .line 93
    .line 94
    const/16 v3, 0x12c

    .line 95
    .line 96
    if-ge p1, v3, :cond_1

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_1
    const/16 v3, 0x1f4

    .line 108
    .line 109
    if-gt v3, p1, :cond_2

    .line 110
    .line 111
    const/16 v3, 0x258

    .line 112
    .line 113
    if-ge p1, v3, :cond_2

    .line 114
    .line 115
    sget-object v0, Lff/w;->a:Lff/w;

    .line 116
    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, Ljava/io/InputStreamReader;

    .line 123
    .line 124
    const-string v4, "utf-8"

    .line 125
    .line 126
    invoke-direct {v3, v1, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    new-instance v1, Ljava/io/BufferedReader;

    .line 130
    .line 131
    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 132
    .line 133
    .line 134
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    .line 138
    .line 139
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-eqz v4, :cond_9

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    sub-int/2addr v5, v0

    .line 150
    const/4 v6, 0x0

    .line 151
    move v7, v6

    .line 152
    move v8, v7

    .line 153
    :goto_3
    if-gt v7, v5, :cond_8

    .line 154
    .line 155
    if-nez v8, :cond_3

    .line 156
    .line 157
    move v9, v7

    .line 158
    goto :goto_4

    .line 159
    :cond_3
    move v9, v5

    .line 160
    :goto_4
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    const/16 v10, 0x20

    .line 165
    .line 166
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->g(II)I

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    if-gtz v9, :cond_4

    .line 171
    .line 172
    move v9, v0

    .line 173
    goto :goto_5

    .line 174
    :cond_4
    move v9, v6

    .line 175
    :goto_5
    if-nez v8, :cond_6

    .line 176
    .line 177
    if-nez v9, :cond_5

    .line 178
    .line 179
    move v8, v0

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    add-int/2addr v7, v0

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    if-nez v9, :cond_7

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_7
    add-int/lit8 v5, v5, -0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :catchall_0
    move-exception p1

    .line 190
    goto :goto_9

    .line 191
    :catch_0
    move-exception p1

    .line 192
    goto :goto_8

    .line 193
    :cond_8
    :goto_6
    add-int/2addr v5, v0

    .line 194
    invoke-virtual {v4, v7, v5}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_9
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v3, "toString(...)"

    .line 211
    .line 212
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 216
    .line 217
    .line 218
    iget-object v1, v2, Lv6/l;->a:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Landroidx/fragment/app/X;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Landroidx/fragment/app/X;->j(Ljava/lang/String;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_7
    new-instance v1, Lve/a;

    .line 230
    .line 231
    invoke-direct {v1, p1, v0}, Lve/a;-><init>(ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    return-object v1

    .line 235
    :goto_8
    :try_start_5
    new-instance v0, Lbe/b;

    .line 236
    .line 237
    sget-object v2, Lbe/a;->d:Lbe/a;

    .line 238
    .line 239
    const-string v3, "Failed to read response"

    .line 240
    .line 241
    invoke-direct {v0, v2, v3, p1}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 245
    :goto_9
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    invoke-static {v1, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :catch_1
    move-exception p1

    .line 252
    instance-of v0, p1, Ljava/io/IOException;

    .line 253
    .line 254
    if-nez v0, :cond_a

    .line 255
    .line 256
    instance-of v0, p1, Ljava/lang/ClassCastException;

    .line 257
    .line 258
    if-nez v0, :cond_a

    .line 259
    .line 260
    instance-of v0, p1, Ljava/lang/NullPointerException;

    .line 261
    .line 262
    if-eqz v0, :cond_b

    .line 263
    .line 264
    :cond_a
    new-instance v0, Lbe/b;

    .line 265
    .line 266
    sget-object v1, Lbe/a;->d:Lbe/a;

    .line 267
    .line 268
    const-string v2, "Connection opening failed"

    .line 269
    .line 270
    invoke-direct {v0, v1, v2, p1}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    move-object p1, v0

    .line 274
    :cond_b
    throw p1

    .line 275
    :catch_2
    move-exception p1

    .line 276
    new-instance v0, Lbe/b;

    .line 277
    .line 278
    sget-object v2, Lbe/a;->c:Lbe/a;

    .line 279
    .line 280
    const-string v3, "Wrong url - \""

    .line 281
    .line 282
    const-string v4, "\""

    .line 283
    .line 284
    invoke-static {v3, v1, v4}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-direct {v0, v2, v1, p1}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    throw v0
.end method
