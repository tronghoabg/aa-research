.class public final synthetic Lo1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/applovin/shadow/okhttp3/EventListener$Factory;
.implements Lw9/o;
.implements Luc/c;
.implements Ls2/e;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lyc/m;
.implements LB5/b;
.implements LLe/b;
.implements LL8/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo1/c;->a:I

    iput-object p1, p0, Lo1/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ5/p;

    .line 4
    .line 5
    iget v1, v0, LJ5/p;->f:I

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    mul-long/2addr p1, v1

    .line 9
    const-wide/32 v1, 0xf4240

    .line 10
    .line 11
    .line 12
    div-long v3, p1, v1

    .line 13
    .line 14
    iget-wide p1, v0, LJ5/p;->k:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    sub-long v7, p1, v0

    .line 19
    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    invoke-static/range {v3 .. v8}, LQ1/x;->j(JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    return-wide p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, LN9/m;

    .line 2
    .line 3
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lz9/B;

    .line 6
    .line 7
    iget-object v1, v0, Lz9/B;->f:LA5/h;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v10, p1, LN9/m;->a:LN9/h;

    .line 12
    .line 13
    new-instance v2, LJ9/o;

    .line 14
    .line 15
    iget-object v0, v0, Lz9/B;->b:LJ9/k;

    .line 16
    .line 17
    iget-object v8, v0, LJ9/k;->f:LJ9/G;

    .line 18
    .line 19
    iget-object v9, v0, LJ9/k;->g:LJ9/i;

    .line 20
    .line 21
    iget-object v11, p1, LN9/m;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, v0, LJ9/k;->a:LJ9/u;

    .line 24
    .line 25
    iget-object v4, v0, LJ9/k;->b:LM9/a;

    .line 26
    .line 27
    iget-object v5, v0, LJ9/k;->c:LJ9/X;

    .line 28
    .line 29
    iget-object v6, v0, LJ9/k;->d:LJ9/V;

    .line 30
    .line 31
    iget-object v7, v0, LJ9/k;->e:LN9/b;

    .line 32
    .line 33
    invoke-direct/range {v2 .. v11}, LJ9/o;-><init>(LJ9/u;LM9/a;LJ9/X;LJ9/V;LN9/b;LJ9/G;LJ9/i;LN9/h;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v10, v2}, LA5/h;->displayMessage(LN9/h;Lz9/E;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public b(Lmd/J;)Lc2/g;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget-object v4, v3, Lo1/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, Lr5/b;

    .line 10
    .line 11
    const-string v5, "CctTransportBackend"

    .line 12
    .line 13
    invoke-static {v5}, Lic/d;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v7, 0x4

    .line 18
    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v9, v0, Lmd/J;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v9, Ljava/net/URL;

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    new-array v8, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    aput-object v9, v8, v1

    .line 31
    .line 32
    const-string v10, "Making request to: %s"

    .line 33
    .line 34
    invoke-static {v10, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/net/HttpURLConnection;

    .line 46
    .line 47
    const/16 v8, 0x7530

    .line 48
    .line 49
    invoke-virtual {v6, v8}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 50
    .line 51
    .line 52
    iget v8, v4, Lr5/b;->g:I

    .line 53
    .line 54
    invoke-virtual {v6, v8}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 61
    .line 62
    .line 63
    const-string v8, "POST"

    .line 64
    .line 65
    invoke-virtual {v6, v8}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v8, "User-Agent"

    .line 69
    .line 70
    const-string v9, "datatransport/3.3.0 android/"

    .line 71
    .line 72
    invoke-virtual {v6, v8, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v8, "Content-Encoding"

    .line 76
    .line 77
    const-string v9, "gzip"

    .line 78
    .line 79
    invoke-virtual {v6, v8, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v10, "Content-Type"

    .line 83
    .line 84
    const-string v11, "application/json"

    .line 85
    .line 86
    invoke-virtual {v6, v10, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v11, "Accept-Encoding"

    .line 90
    .line 91
    invoke-virtual {v6, v11, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v11, v0, Lmd/J;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v11, Ljava/lang/String;

    .line 97
    .line 98
    if-eqz v11, :cond_1

    .line 99
    .line 100
    const-string v12, "X-Goog-Api-Key"

    .line 101
    .line 102
    invoke-virtual {v6, v12, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    :try_start_0
    invoke-virtual {v6}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 106
    .line 107
    .line 108
    move-result-object v14
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lh9/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :try_start_1
    new-instance v15, Ljava/util/zip/GZIPOutputStream;

    .line 110
    .line 111
    invoke-direct {v15, v14}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 112
    .line 113
    .line 114
    :try_start_2
    iget-object v4, v4, Lr5/b;->a:Lad/L;

    .line 115
    .line 116
    iget-object v0, v0, Lmd/J;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ls5/n;

    .line 119
    .line 120
    move/from16 v22, v1

    .line 121
    .line 122
    new-instance v1, Ljava/io/BufferedWriter;

    .line 123
    .line 124
    new-instance v11, Ljava/io/OutputStreamWriter;

    .line 125
    .line 126
    invoke-direct {v11, v15}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v1, v11}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 130
    .line 131
    .line 132
    new-instance v16, Lj9/e;

    .line 133
    .line 134
    iget-object v4, v4, Lad/L;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, Lj9/d;

    .line 137
    .line 138
    iget-object v11, v4, Lj9/d;->a:Ljava/util/HashMap;

    .line 139
    .line 140
    iget-object v12, v4, Lj9/d;->b:Ljava/util/HashMap;

    .line 141
    .line 142
    iget-object v13, v4, Lj9/d;->c:Lj9/a;

    .line 143
    .line 144
    iget-boolean v4, v4, Lj9/d;->d:Z

    .line 145
    .line 146
    move-object/from16 v17, v1

    .line 147
    .line 148
    move/from16 v21, v4

    .line 149
    .line 150
    move-object/from16 v18, v11

    .line 151
    .line 152
    move-object/from16 v19, v12

    .line 153
    .line 154
    move-object/from16 v20, v13

    .line 155
    .line 156
    invoke-direct/range {v16 .. v21}, Lj9/e;-><init>(Ljava/io/Writer;Ljava/util/HashMap;Ljava/util/HashMap;Lj9/a;Z)V

    .line 157
    .line 158
    .line 159
    move-object/from16 v1, v16

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Lj9/e;->a(Ljava/lang/Object;)Lj9/e;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lj9/e;->c()V

    .line 165
    .line 166
    .line 167
    iget-object v0, v1, Lj9/e;->b:Landroid/util/JsonWriter;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 170
    .line 171
    .line 172
    :try_start_3
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 173
    .line 174
    .line 175
    if-eqz v14, :cond_2

    .line 176
    .line 177
    :try_start_4
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lh9/b; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :catch_0
    move-exception v0

    .line 182
    goto/16 :goto_d

    .line 183
    .line 184
    :catch_1
    move-exception v0

    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :catch_2
    move-exception v0

    .line 188
    :goto_0
    const/4 v2, 0x0

    .line 189
    const-wide/16 v6, 0x0

    .line 190
    .line 191
    goto/16 :goto_e

    .line 192
    .line 193
    :catch_3
    move-exception v0

    .line 194
    goto :goto_0

    .line 195
    :cond_2
    :goto_1
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v5}, Lic/d;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v4, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_3

    .line 212
    .line 213
    new-array v2, v2, [Ljava/lang/Object;

    .line 214
    .line 215
    aput-object v1, v2, v22

    .line 216
    .line 217
    const-string v1, "Status Code: %d"

    .line 218
    .line 219
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v4, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    :cond_3
    const-string v1, "Content-Type: %s"

    .line 227
    .line 228
    invoke-virtual {v6, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v5, v1, v2}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    const-string v1, "Content-Encoding: %s"

    .line 236
    .line 237
    invoke-virtual {v6, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-static {v5, v1, v2}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const/16 v1, 0x12e

    .line 245
    .line 246
    if-eq v0, v1, :cond_b

    .line 247
    .line 248
    const/16 v1, 0x12d

    .line 249
    .line 250
    if-eq v0, v1, :cond_b

    .line 251
    .line 252
    const/16 v1, 0x133

    .line 253
    .line 254
    if-ne v0, v1, :cond_4

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_4
    const/16 v1, 0xc8

    .line 258
    .line 259
    if-eq v0, v1, :cond_5

    .line 260
    .line 261
    new-instance v1, Lc2/g;

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    const-wide/16 v4, 0x0

    .line 265
    .line 266
    invoke-direct {v1, v0, v2, v4, v5}, Lc2/g;-><init>(ILjava/net/URL;J)V

    .line 267
    .line 268
    .line 269
    return-object v1

    .line 270
    :cond_5
    invoke-virtual {v6}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    :try_start_5
    invoke-virtual {v6, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_6

    .line 283
    .line 284
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 285
    .line 286
    invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_6
    move-object v2, v1

    .line 291
    :goto_2
    :try_start_6
    new-instance v4, Ljava/io/BufferedReader;

    .line 292
    .line 293
    new-instance v5, Ljava/io/InputStreamReader;

    .line 294
    .line 295
    invoke-direct {v5, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v4}, Ls5/v;->a(Ljava/io/BufferedReader;)Ls5/v;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    iget-wide v4, v4, Ls5/v;->a:J

    .line 306
    .line 307
    new-instance v6, Lc2/g;

    .line 308
    .line 309
    const/4 v7, 0x0

    .line 310
    invoke-direct {v6, v0, v7, v4, v5}, Lc2/g;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 311
    .line 312
    .line 313
    if-eqz v2, :cond_7

    .line 314
    .line 315
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 316
    .line 317
    .line 318
    goto :goto_3

    .line 319
    :catchall_0
    move-exception v0

    .line 320
    move-object v2, v0

    .line 321
    goto :goto_5

    .line 322
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 325
    .line 326
    .line 327
    :cond_8
    return-object v6

    .line 328
    :catchall_1
    move-exception v0

    .line 329
    move-object v4, v0

    .line 330
    if-eqz v2, :cond_9

    .line 331
    .line 332
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :catchall_2
    move-exception v0

    .line 337
    :try_start_9
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    :cond_9
    :goto_4
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 341
    :goto_5
    if-eqz v1, :cond_a

    .line 342
    .line 343
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :catchall_3
    move-exception v0

    .line 348
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 349
    .line 350
    .line 351
    :cond_a
    :goto_6
    throw v2

    .line 352
    :cond_b
    :goto_7
    const-string v1, "Location"

    .line 353
    .line 354
    invoke-virtual {v6, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    new-instance v2, Lc2/g;

    .line 359
    .line 360
    new-instance v4, Ljava/net/URL;

    .line 361
    .line 362
    invoke-direct {v4, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-wide/16 v5, 0x0

    .line 366
    .line 367
    invoke-direct {v2, v0, v4, v5, v6}, Lc2/g;-><init>(ILjava/net/URL;J)V

    .line 368
    .line 369
    .line 370
    return-object v2

    .line 371
    :catchall_4
    move-exception v0

    .line 372
    move-object v1, v0

    .line 373
    goto :goto_b

    .line 374
    :goto_8
    move-object v1, v0

    .line 375
    goto :goto_9

    .line 376
    :catchall_5
    move-exception v0

    .line 377
    goto :goto_8

    .line 378
    :goto_9
    :try_start_b
    invoke-virtual {v15}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 379
    .line 380
    .line 381
    goto :goto_a

    .line 382
    :catchall_6
    move-exception v0

    .line 383
    :try_start_c
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    :goto_a
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 387
    :goto_b
    if-eqz v14, :cond_c

    .line 388
    .line 389
    :try_start_d
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 390
    .line 391
    .line 392
    goto :goto_c

    .line 393
    :catchall_7
    move-exception v0

    .line 394
    :try_start_e
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 395
    .line 396
    .line 397
    :cond_c
    :goto_c
    throw v1
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch Lh9/b; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 398
    :goto_d
    const-string v1, "Couldn\'t encode request, returning with 400"

    .line 399
    .line 400
    invoke-static {v0, v5, v1}, Lic/d;->s(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    new-instance v0, Lc2/g;

    .line 404
    .line 405
    const/16 v1, 0x190

    .line 406
    .line 407
    const/4 v2, 0x0

    .line 408
    const-wide/16 v6, 0x0

    .line 409
    .line 410
    invoke-direct {v0, v1, v2, v6, v7}, Lc2/g;-><init>(ILjava/net/URL;J)V

    .line 411
    .line 412
    .line 413
    goto :goto_f

    .line 414
    :goto_e
    const-string v1, "Couldn\'t open connection, returning with 500"

    .line 415
    .line 416
    invoke-static {v0, v5, v1}, Lic/d;->s(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    new-instance v0, Lc2/g;

    .line 420
    .line 421
    const/16 v1, 0x1f4

    .line 422
    .line 423
    invoke-direct {v0, v1, v2, v6, v7}, Lc2/g;-><init>(ILjava/net/URL;J)V

    .line 424
    .line 425
    .line 426
    :goto_f
    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 5
    .line 6
    const-string v1, "handled"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Unable to unpack JSON message: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "KeyEventChannel"

    .line 29
    .line 30
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object p1, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lcom/unity3d/services/core/webview/b;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, LE4/F;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, LE4/F;->k(Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public create(Lcom/applovin/shadow/okhttp3/Call;)Lcom/applovin/shadow/okhttp3/EventListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/shadow/okhttp3/EventListener;

    invoke-static {v0, p1}, Lcom/applovin/shadow/okhttp3/internal/Util;->a(Lcom/applovin/shadow/okhttp3/EventListener;Lcom/applovin/shadow/okhttp3/Call;)Lcom/applovin/shadow/okhttp3/EventListener;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/view/Display;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq2/o;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    float-to-double v1, p1

    .line 15
    const-wide v3, 0x41cdcd6500000000L    # 1.0E9

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    div-double/2addr v3, v1

    .line 21
    double-to-long v1, v3

    .line 22
    iput-wide v1, v0, Lq2/o;->i:J

    .line 23
    .line 24
    const-wide/16 v3, 0x50

    .line 25
    .line 26
    mul-long/2addr v1, v3

    .line 27
    const-wide/16 v3, 0x64

    .line 28
    .line 29
    div-long/2addr v1, v3

    .line 30
    iput-wide v1, v0, Lq2/o;->j:J

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    .line 34
    .line 35
    const-string v1, "Unable to query display refresh rate"

    .line 36
    .line 37
    invoke-static {p1, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide v1, v0, Lq2/o;->i:J

    .line 46
    .line 47
    iput-wide v1, v0, Lq2/o;->j:J

    .line 48
    .line 49
    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget v4, p0, Lo1/c;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lz5/h;

    .line 12
    .line 13
    iget-object v4, v3, Lz5/h;->b:LA5/d;

    .line 14
    .line 15
    check-cast v4, LA5/m;

    .line 16
    .line 17
    new-instance v5, LA5/f;

    .line 18
    .line 19
    invoke-direct {v5, v2}, LA5/f;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v4, v5}, LA5/m;->d(LA5/k;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Lt5/i;

    .line 43
    .line 44
    iget-object v6, v3, Lz5/h;->c:Lz5/c;

    .line 45
    .line 46
    invoke-virtual {v6, v5, v0, v2}, Lz5/c;->a(Lt5/i;IZ)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v1

    .line 51
    :pswitch_0
    check-cast v3, Lz5/f;

    .line 52
    .line 53
    iget-object v0, v3, Lz5/f;->i:LA5/c;

    .line 54
    .line 55
    check-cast v0, LA5/m;

    .line 56
    .line 57
    invoke-virtual {v0}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 62
    .line 63
    .line 64
    :try_start_0
    const-string v3, "DELETE FROM log_event_dropped"

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 71
    .line 72
    .line 73
    new-instance v3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v4, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    .line 76
    .line 77
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, LA5/m;->b:LC5/a;

    .line 81
    .line 82
    invoke-interface {v0}, LC5/a;->c()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :pswitch_1
    check-cast v3, LA5/d;

    .line 113
    .line 114
    check-cast v3, LA5/m;

    .line 115
    .line 116
    iget-object v1, v3, LA5/m;->b:LC5/a;

    .line 117
    .line 118
    invoke-interface {v1}, LC5/a;->c()J

    .line 119
    .line 120
    .line 121
    move-result-wide v4

    .line 122
    iget-object v1, v3, LA5/m;->d:LA5/a;

    .line 123
    .line 124
    iget-wide v6, v1, LA5/a;->d:J

    .line 125
    .line 126
    sub-long/2addr v4, v6

    .line 127
    invoke-virtual {v3}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 132
    .line 133
    .line 134
    :try_start_1
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    filled-new-array {v4}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    const-string v5, "SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name"

    .line 143
    .line 144
    invoke-virtual {v1, v5, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 145
    .line 146
    .line 147
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    :goto_1
    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_1

    .line 153
    .line 154
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    int-to-long v8, v6

    .line 163
    sget-object v6, Lw5/c;->c:Lw5/c;

    .line 164
    .line 165
    invoke-virtual {v3, v8, v9, v6, v7}, LA5/m;->i(JLw5/c;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    :try_start_3
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 170
    .line 171
    .line 172
    const-string v0, "events"

    .line 173
    .line 174
    const-string v2, "timestamp_ms < ?"

    .line 175
    .line 176
    invoke-virtual {v1, v0, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 184
    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    goto :goto_2

    .line 193
    :catchall_2
    move-exception v0

    .line 194
    :try_start_4
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 195
    .line 196
    .line 197
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    :goto_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :pswitch_2
    check-cast v3, LA5/c;

    .line 203
    .line 204
    check-cast v3, LA5/m;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sget v0, Lw5/a;->e:I

    .line 210
    .line 211
    new-instance v0, LS3/n;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    iput-object v1, v0, LS3/n;->a:Ljava/lang/Object;

    .line 217
    .line 218
    new-instance v4, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object v4, v0, LS3/n;->b:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v1, v0, LS3/n;->c:Ljava/lang/Object;

    .line 226
    .line 227
    const-string v1, ""

    .line 228
    .line 229
    iput-object v1, v0, LS3/n;->d:Ljava/lang/Object;

    .line 230
    .line 231
    new-instance v1, Ljava/util/HashMap;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v4, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped"

    .line 237
    .line 238
    invoke-virtual {v3}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 243
    .line 244
    .line 245
    :try_start_5
    new-array v2, v2, [Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v5, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    new-instance v4, LA5/g;

    .line 252
    .line 253
    const/4 v6, 0x2

    .line 254
    invoke-direct {v4, v3, v1, v0, v6}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    invoke-static {v2, v4}, LA5/m;->y(Landroid/database/Cursor;LA5/k;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    check-cast v0, Lw5/a;

    .line 262
    .line 263
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :catchall_3
    move-exception v0

    .line 271
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 272
    .line 273
    .line 274
    throw v0

    .line 275
    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public get()Ljava/lang/Object;
    .locals 20

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v3, v2, Lo1/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, Lr9/e;

    .line 8
    .line 9
    iget-object v4, v3, Lr9/e;->c:Lr9/d;

    .line 10
    .line 11
    iget-object v5, v4, Lr9/d;->b:Lr9/l;

    .line 12
    .line 13
    iget-object v5, v5, Lr9/l;->b:Lr9/f;

    .line 14
    .line 15
    new-instance v6, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v7, v3, Lr9/e;->e:I

    .line 21
    .line 22
    move v8, v7

    .line 23
    :goto_0
    if-lez v8, :cond_7

    .line 24
    .line 25
    invoke-interface {v5}, Lr9/f;->h()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    if-eqz v9, :cond_7

    .line 30
    .line 31
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eqz v10, :cond_0

    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_0
    new-array v10, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    aput-object v9, v10, v0

    .line 42
    .line 43
    const-string v11, "IndexBackfiller"

    .line 44
    .line 45
    const-string v12, "Processing collection: %s"

    .line 46
    .line 47
    invoke-static {v11, v12, v1, v10}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v10, v4, Lr9/d;->b:Lr9/l;

    .line 51
    .line 52
    iget-object v10, v10, Lr9/l;->b:Lr9/f;

    .line 53
    .line 54
    iget-object v12, v3, Lr9/e;->d:Lr9/d;

    .line 55
    .line 56
    iget-object v12, v12, Lr9/d;->b:Lr9/l;

    .line 57
    .line 58
    iget-object v12, v12, Lr9/l;->f:LVa/Za;

    .line 59
    .line 60
    invoke-interface {v10, v9}, Lr9/f;->m(Ljava/lang/String;)Ls9/b;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    iget-object v14, v12, LVa/Za;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v14, Lr9/A;

    .line 67
    .line 68
    invoke-interface {v14, v9, v13, v8}, Lr9/A;->x(Ljava/lang/String;Ls9/b;I)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v14

    .line 72
    invoke-interface {v14}, Ljava/util/Map;->size()I

    .line 73
    .line 74
    .line 75
    move-result v15

    .line 76
    sub-int v15, v8, v15

    .line 77
    .line 78
    if-lez v15, :cond_1

    .line 79
    .line 80
    iget v15, v13, Ls9/b;->c:I

    .line 81
    .line 82
    invoke-interface {v14}, Ljava/util/Map;->size()I

    .line 83
    .line 84
    .line 85
    move-result v16

    .line 86
    move/from16 v17, v0

    .line 87
    .line 88
    sub-int v0, v8, v16

    .line 89
    .line 90
    iget-object v1, v12, LVa/Za;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lr9/b;

    .line 93
    .line 94
    invoke-interface {v1, v15, v0, v9}, Lr9/b;->a(IILjava/lang/String;)Ljava/util/HashMap;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move/from16 v17, v0

    .line 100
    .line 101
    new-instance v0, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const/4 v15, -0x1

    .line 115
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v18

    .line 119
    if-eqz v18, :cond_4

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v18

    .line 125
    move-object/from16 v19, v1

    .line 126
    .line 127
    move-object/from16 v1, v18

    .line 128
    .line 129
    check-cast v1, Lt9/d;

    .line 130
    .line 131
    iget-object v2, v1, Lt9/d;->b:Lt9/h;

    .line 132
    .line 133
    iget-object v2, v2, Lt9/h;->a:Ls9/h;

    .line 134
    .line 135
    invoke-interface {v14, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_3

    .line 140
    .line 141
    iget-object v2, v1, Lt9/d;->b:Lt9/h;

    .line 142
    .line 143
    move-object/from16 v18, v3

    .line 144
    .line 145
    instance-of v3, v2, Lt9/l;

    .line 146
    .line 147
    iget-object v2, v2, Lt9/h;->a:Ls9/h;

    .line 148
    .line 149
    if-eqz v3, :cond_2

    .line 150
    .line 151
    iget-object v3, v12, LVa/Za;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Lr9/A;

    .line 154
    .line 155
    invoke-interface {v3, v2}, Lr9/A;->B(Ls9/h;)Ls9/k;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    goto :goto_3

    .line 160
    :cond_2
    invoke-static {v2}, Ls9/k;->g(Ls9/h;)Ls9/k;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :goto_3
    invoke-interface {v14, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_3
    move-object/from16 v18, v3

    .line 169
    .line 170
    :goto_4
    iget v1, v1, Lt9/d;->a:I

    .line 171
    .line 172
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    move-object/from16 v2, p0

    .line 177
    .line 178
    move-object/from16 v3, v18

    .line 179
    .line 180
    move-object/from16 v1, v19

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    move-object/from16 v18, v3

    .line 184
    .line 185
    invoke-interface {v14}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v12, v0, v1}, LVa/Za;->j(Ljava/util/Map;Ljava/util/Set;)V

    .line 190
    .line 191
    .line 192
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 193
    .line 194
    invoke-virtual {v12, v14, v0, v1}, LVa/Za;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v15, v0}, Lr9/g;->a(ILjava/util/HashMap;)Lr9/g;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iget-object v1, v0, Lr9/g;->b:Lc9/c;

    .line 203
    .line 204
    invoke-interface {v10, v1}, Lr9/f;->n(Lc9/c;)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    move-object v3, v13

    .line 212
    :cond_5
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_6

    .line 217
    .line 218
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    check-cast v12, Ljava/util/Map$Entry;

    .line 223
    .line 224
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    check-cast v12, Ls9/k;

    .line 229
    .line 230
    invoke-static {v12}, Ls9/b;->b(Ls9/k;)Ls9/b;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-virtual {v12, v3}, Ls9/b;->a(Ls9/b;)I

    .line 235
    .line 236
    .line 237
    move-result v14

    .line 238
    if-lez v14, :cond_5

    .line 239
    .line 240
    move-object v3, v12

    .line 241
    goto :goto_5

    .line 242
    :cond_6
    iget-object v2, v3, Ls9/b;->a:Ls9/o;

    .line 243
    .line 244
    iget v12, v13, Ls9/b;->c:I

    .line 245
    .line 246
    iget v0, v0, Lr9/g;->a:I

    .line 247
    .line 248
    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    new-instance v12, Ls9/b;

    .line 253
    .line 254
    iget-object v3, v3, Ls9/b;->b:Ls9/h;

    .line 255
    .line 256
    invoke-direct {v12, v2, v3, v0}, Ls9/b;-><init>(Ls9/o;Ls9/h;I)V

    .line 257
    .line 258
    .line 259
    const/4 v0, 0x1

    .line 260
    new-array v2, v0, [Ljava/lang/Object;

    .line 261
    .line 262
    aput-object v12, v2, v17

    .line 263
    .line 264
    const-string v3, "Updating offset: %s"

    .line 265
    .line 266
    invoke-static {v11, v3, v0, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v10, v9, v12}, Lr9/f;->o(Ljava/lang/String;Ls9/b;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Lc9/c;->size()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    sub-int/2addr v8, v1

    .line 277
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-object/from16 v2, p0

    .line 281
    .line 282
    move v1, v0

    .line 283
    move/from16 v0, v17

    .line 284
    .line 285
    move-object/from16 v3, v18

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_7
    :goto_6
    sub-int/2addr v7, v8

    .line 290
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;

    invoke-static {v0, p1}, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->a(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;LC6/l;)Lz9/B;

    move-result-object p1

    return-object p1
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/ads/nativead/l;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x3

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Lpd/f;->h(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {v3}, Lpd/f;->g(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ltc/g;

    .line 24
    .line 25
    invoke-virtual {v1, p1, v0, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lx7/q;

    .line 34
    .line 35
    if-eqz p1, :cond_5

    .line 36
    .line 37
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lcom/google/android/gms/common/api/t;

    .line 40
    .line 41
    check-cast p1, Lx7/r;

    .line 42
    .line 43
    iget-object p1, p1, Lx7/r;->b:Lx7/s;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    const/4 v2, 0x1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    iget-boolean v3, p1, Lx7/s;->a:Z

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v3, v0

    .line 56
    :goto_0
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-boolean p1, p1, Lx7/s;->b:Z

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    move p1, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move p1, v0

    .line 65
    :goto_1
    if-nez v3, :cond_3

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    :cond_3
    move v0, v2

    .line 70
    :cond_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ltc/g;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-static {v3}, Lpd/f;->h(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {v3}, Lpd/f;->g(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v1, v1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ltc/g;

    .line 93
    .line 94
    invoke-virtual {v1, p1, v0, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lo1/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lyc/e;

    .line 9
    .line 10
    iget-object v0, v0, Lyc/e;->c:Lyc/g;

    .line 11
    .line 12
    iget-object v0, v0, Lyc/g;->h:Lmd/J;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lmd/J;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    new-instance p1, Lyc/o;

    .line 19
    .line 20
    const-string v0, "Could not set flash mode."

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    const-string v2, "setFlashModeFailed"

    .line 24
    .line 25
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LPc/o;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, LPc/o;->c(Lyc/o;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    new-instance p1, Lyc/o;

    .line 37
    .line 38
    const-string v0, "Could not set exposure mode."

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const-string v2, "setExposureModeFailed"

    .line 42
    .line 43
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LPc/p;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, LPc/p;->c(Lyc/o;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    new-instance p1, Lyc/o;

    .line 55
    .line 56
    const-string v0, "Could not set exposure offset."

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    const-string v2, "setExposureOffsetFailed"

    .line 60
    .line 61
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, LPc/o;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, LPc/o;->c(Lyc/o;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_3
    new-instance p1, Lyc/o;

    .line 73
    .line 74
    const-string v0, "Could not set focus point."

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    const-string v2, "setFocusPointFailed"

    .line 78
    .line 79
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, LPc/p;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, LPc/p;->c(Lyc/o;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_4
    new-instance p1, Lyc/o;

    .line 91
    .line 92
    const-string v0, "Could not set zoom level."

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    const-string v2, "setZoomLevelFailed"

    .line 96
    .line 97
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, LPc/q;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, LPc/q;->c(Lyc/o;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_5
    new-instance p1, Lyc/o;

    .line 109
    .line 110
    const-string v0, "Could not set exposure point."

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    const-string v2, "setExposurePointFailed"

    .line 114
    .line 115
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, LPc/q;

    .line 121
    .line 122
    invoke-virtual {v0, p1}, LPc/q;->c(Lyc/o;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string p1, "Geolocator"

    .line 2
    .line 3
    const-string v0, "Error trying to get last the last known GPS location"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, LKa/b;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-virtual {p1, v0}, LKa/b;->onError(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lo1/c;->a:I

    .line 4
    .line 5
    sparse-switch v1, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, LKa/b;

    .line 9
    .line 10
    check-cast p1, Landroid/location/Location;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, LKa/b;->a(Landroid/location/Location;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    check-cast p1, Lx7/q;

    .line 17
    .line 18
    check-cast v0, Lx4/b;

    .line 19
    .line 20
    iget-object p1, v0, Lx4/b;->f:Lx4/h;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lx4/b;->g(Lx4/h;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    sget v1, Landroidx/credentials/playservices/HiddenActivity;->c:I

    .line 27
    .line 28
    check-cast v0, Lo1/d;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lo1/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lo1/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv9/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v1, v1, Lm9/G;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lm9/G;

    .line 32
    .line 33
    iget-object v1, v1, Lm9/G;->a:Lm9/F;

    .line 34
    .line 35
    sget-object v2, Lm9/F;->l:Lm9/F;

    .line 36
    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    iget-object v0, v0, Lv9/g;->c:Lv9/m;

    .line 40
    .line 41
    iget-object v1, v0, Lv9/m;->b:Ln9/d;

    .line 42
    .line 43
    invoke-virtual {v1}, Ln9/d;->Y()V

    .line 44
    .line 45
    .line 46
    iget-object v0, v0, Lv9/m;->c:Ln9/b;

    .line 47
    .line 48
    invoke-virtual {v0}, Ln9/b;->X()V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    throw p1

    .line 56
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lka/A;

    .line 61
    .line 62
    invoke-virtual {p1}, Lka/A;->b()Lcom/google/protobuf/Timestamp;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1}, Lka/A;->e()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    new-instance v2, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    :goto_0
    if-ge v3, v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {p1, v3}, Lka/A;->d(I)Lka/Q1;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v4, v0}, Lv9/o;->d(Lka/Q1;Ls9/o;)Lt9/j;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-object v2

    .line 97
    :pswitch_0
    iget-object v0, p0, Lo1/c;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lp9/B;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_7

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ls9/k;

    .line 131
    .line 132
    invoke-virtual {v2}, Ls9/k;->d()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    iget-object v3, v2, Ls9/k;->c:Ls9/o;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    invoke-virtual {v2}, Ls9/k;->e()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_6

    .line 146
    .line 147
    sget-object v3, Ls9/o;->b:Ls9/o;

    .line 148
    .line 149
    :goto_2
    iget-object v4, v0, Lp9/B;->b:Ljava/util/HashMap;

    .line 150
    .line 151
    iget-object v5, v2, Ls9/k;->a:Ls9/h;

    .line 152
    .line 153
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_5

    .line 158
    .line 159
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Ls9/o;

    .line 164
    .line 165
    iget-object v2, v2, Ls9/k;->c:Ls9/o;

    .line 166
    .line 167
    invoke-virtual {v3, v2}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_4

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_4
    new-instance p1, Lm9/G;

    .line 175
    .line 176
    sget-object v0, Lm9/F;->i:Lm9/F;

    .line 177
    .line 178
    const-string v1, "Document version changed between two reads."

    .line 179
    .line 180
    invoke-direct {p1, v1, v0}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_5
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v0, "Unexpected document type in transaction: "

    .line 191
    .line 192
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    const/4 v0, 0x0

    .line 203
    new-array v0, v0, [Ljava/lang/Object;

    .line 204
    .line 205
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    const/4 p1, 0x0

    .line 209
    throw p1

    .line 210
    :cond_7
    return-object p1

    .line 211
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
