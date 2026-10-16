.class public final LA7/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/N;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/M;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LA7/M;->b:I

    iput-object p3, p0, LA7/M;->c:Ljava/lang/String;

    iput-object p4, p0, LA7/M;->d:Ljava/lang/Object;

    iput-object p5, p0, LA7/M;->e:Ljava/lang/Object;

    iput-object p6, p0, LA7/M;->f:Ljava/lang/Object;

    iput-object p1, p0, LA7/M;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LA7/T;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/M;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 4
    iput-object p2, p0, LA7/M;->d:Ljava/lang/Object;

    .line 5
    iput p3, p0, LA7/M;->b:I

    .line 6
    iput-object p4, p0, LA7/M;->e:Ljava/lang/Object;

    .line 7
    iput-object p5, p0, LA7/M;->f:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LA7/M;->c:Ljava/lang/String;

    .line 9
    iput-object p6, p0, LA7/M;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, LA7/M;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v3, p0, LA7/M;->b:I

    .line 7
    .line 8
    iget-object v0, p0, LA7/M;->e:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v0

    .line 11
    check-cast v4, Ljava/io/IOException;

    .line 12
    .line 13
    iget-object v0, p0, LA7/M;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, LA7/T;

    .line 17
    .line 18
    iget-object v2, p0, LA7/M;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p0, LA7/M;->f:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v0

    .line 23
    check-cast v5, [B

    .line 24
    .line 25
    iget-object v0, p0, LA7/M;->g:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface/range {v1 .. v6}, LA7/T;->t(Ljava/lang/String;ILjava/io/IOException;[BLjava/util/Map;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p0, LA7/M;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LA7/N;

    .line 37
    .line 38
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LA7/n0;

    .line 41
    .line 42
    iget-object v0, v0, LA7/n0;->h:LA7/Z;

    .line 43
    .line 44
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v1, v0, LA7/D0;->b:Z

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    iget-object v0, p0, LA7/M;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, LA7/N;

    .line 54
    .line 55
    const-string v1, "Persisted config not initialized. Not logging error/warn"

    .line 56
    .line 57
    invoke-virtual {v0}, LA7/N;->r0()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-static {v2, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_0
    iget-object v1, p0, LA7/M;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LA7/N;

    .line 70
    .line 71
    iget-char v2, v1, LA7/N;->c:C

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x1

    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LA7/n0;

    .line 80
    .line 81
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 82
    .line 83
    iget-object v2, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 84
    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    monitor-enter v1

    .line 88
    :try_start_0
    iget-object v2, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 89
    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, LA7/n0;

    .line 95
    .line 96
    iget-object v2, v2, LA7/n0;->a:Landroid/content/Context;

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {}, Ln7/c;->f()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v2, :cond_1

    .line 111
    .line 112
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_1

    .line 117
    .line 118
    move v2, v4

    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_1

    .line 122
    :cond_1
    move v2, v3

    .line 123
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iput-object v2, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 128
    .line 129
    :cond_2
    iget-object v2, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 130
    .line 131
    if-nez v2, :cond_3

    .line 132
    .line 133
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    iput-object v2, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 142
    .line 143
    const-string v5, "My process not in the list of running processes"

    .line 144
    .line 145
    invoke-virtual {v2, v5}, LA7/P;->c(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    monitor-exit v1

    .line 149
    goto :goto_2

    .line 150
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    throw v0

    .line 152
    :cond_4
    :goto_2
    iget-object v1, v1, LA7/e;->e:Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_5

    .line 159
    .line 160
    iget-object v1, p0, LA7/M;->g:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, LA7/N;

    .line 163
    .line 164
    const/16 v2, 0x43

    .line 165
    .line 166
    iput-char v2, v1, LA7/N;->c:C

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    iget-object v1, p0, LA7/M;->g:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, LA7/N;

    .line 172
    .line 173
    const/16 v2, 0x63

    .line 174
    .line 175
    iput-char v2, v1, LA7/N;->c:C

    .line 176
    .line 177
    :cond_6
    :goto_3
    iget-object v1, p0, LA7/M;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, LA7/N;

    .line 180
    .line 181
    iget-wide v5, v1, LA7/N;->d:J

    .line 182
    .line 183
    const-wide/16 v7, 0x0

    .line 184
    .line 185
    cmp-long v2, v5, v7

    .line 186
    .line 187
    if-gez v2, :cond_7

    .line 188
    .line 189
    const-wide/32 v5, 0x19e10

    .line 190
    .line 191
    .line 192
    iput-wide v5, v1, LA7/N;->d:J

    .line 193
    .line 194
    :cond_7
    const-string v1, "01VDIWEA?"

    .line 195
    .line 196
    iget v2, p0, LA7/M;->b:I

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    iget-object v2, p0, LA7/M;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, LA7/N;

    .line 205
    .line 206
    iget-char v5, v2, LA7/N;->c:C

    .line 207
    .line 208
    iget-wide v9, v2, LA7/N;->d:J

    .line 209
    .line 210
    iget-object v2, p0, LA7/M;->c:Ljava/lang/String;

    .line 211
    .line 212
    iget-object v6, p0, LA7/M;->d:Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v11, p0, LA7/M;->e:Ljava/lang/Object;

    .line 215
    .line 216
    iget-object v12, p0, LA7/M;->f:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-static {v4, v2, v6, v11, v12}, LA7/N;->j0(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v6, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v11, "2"

    .line 225
    .line 226
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v1, ":"

    .line 239
    .line 240
    invoke-static {v6, v1, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    const/16 v5, 0x400

    .line 249
    .line 250
    if-le v2, v5, :cond_8

    .line 251
    .line 252
    iget-object v1, p0, LA7/M;->c:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :cond_8
    iget-object v0, v0, LA7/Z;->f:LA7/c0;

    .line 259
    .line 260
    if-eqz v0, :cond_e

    .line 261
    .line 262
    iget-object v2, v0, LA7/c0;->e:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v2, LA7/Z;

    .line 265
    .line 266
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 267
    .line 268
    .line 269
    iget-object v5, v0, LA7/c0;->e:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v5, LA7/Z;

    .line 272
    .line 273
    invoke-virtual {v5}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    iget-object v6, v0, LA7/c0;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v6, Ljava/lang/String;

    .line 280
    .line 281
    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v5

    .line 285
    cmp-long v5, v5, v7

    .line 286
    .line 287
    if-nez v5, :cond_9

    .line 288
    .line 289
    invoke-virtual {v0}, LA7/c0;->n()V

    .line 290
    .line 291
    .line 292
    :cond_9
    if-nez v1, :cond_a

    .line 293
    .line 294
    const-string v1, ""

    .line 295
    .line 296
    :cond_a
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    iget-object v6, v0, LA7/c0;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v6, Ljava/lang/String;

    .line 303
    .line 304
    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v9

    .line 308
    cmp-long v5, v9, v7

    .line 309
    .line 310
    iget-object v0, v0, LA7/c0;->d:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v0, Ljava/lang/String;

    .line 313
    .line 314
    const-wide/16 v7, 0x1

    .line 315
    .line 316
    if-gtz v5, :cond_b

    .line 317
    .line 318
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 327
    .line 328
    .line 329
    invoke-interface {v2, v6, v7, v8}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 330
    .line 331
    .line 332
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 333
    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_b
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-virtual {v5}, LA7/U1;->r1()Ljava/security/SecureRandom;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    .line 345
    .line 346
    .line 347
    move-result-wide v11

    .line 348
    const-wide v13, 0x7fffffffffffffffL

    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    and-long/2addr v11, v13

    .line 354
    add-long/2addr v9, v7

    .line 355
    div-long/2addr v13, v9

    .line 356
    cmp-long v5, v11, v13

    .line 357
    .line 358
    if-gez v5, :cond_c

    .line 359
    .line 360
    move v3, v4

    .line 361
    :cond_c
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    if-eqz v3, :cond_d

    .line 370
    .line 371
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 372
    .line 373
    .line 374
    :cond_d
    invoke-interface {v2, v6, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 375
    .line 376
    .line 377
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 378
    .line 379
    .line 380
    :cond_e
    :goto_4
    return-void

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
