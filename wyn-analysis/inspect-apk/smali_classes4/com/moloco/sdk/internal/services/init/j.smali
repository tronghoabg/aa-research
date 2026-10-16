.class public final Lcom/moloco/sdk/internal/services/init/j;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/acm/recorder/b;

.field public final synthetic b:Lcom/moloco/sdk/internal/services/init/a;

.field public final synthetic c:Lcom/moloco/sdk/K0;

.field public final synthetic d:Lcom/moloco/sdk/internal/services/init/k;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/K0;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/j;->a:Lcom/moloco/sdk/acm/recorder/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/init/j;->b:Lcom/moloco/sdk/internal/services/init/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/init/j;->c:Lcom/moloco/sdk/K0;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/services/init/j;->d:Lcom/moloco/sdk/internal/services/init/k;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/init/j;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/moloco/sdk/internal/services/init/j;->c:Lcom/moloco/sdk/K0;

    .line 4
    .line 5
    iget-object v4, p0, Lcom/moloco/sdk/internal/services/init/j;->d:Lcom/moloco/sdk/internal/services/init/k;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/init/j;->a:Lcom/moloco/sdk/acm/recorder/b;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/init/j;->b:Lcom/moloco/sdk/internal/services/init/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/init/j;-><init>(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/K0;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/services/init/j;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/services/init/j;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/services/init/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "success"

    .line 4
    .line 5
    const-string v2, "Reason"

    .line 6
    .line 7
    const-string v3, "failure"

    .line 8
    .line 9
    const-string v4, "Result"

    .line 10
    .line 11
    iget-object v5, v1, Lcom/moloco/sdk/internal/services/init/j;->b:Lcom/moloco/sdk/internal/services/init/a;

    .line 12
    .line 13
    const-string v6, "Failed to update cache for cacheKey: "

    .line 14
    .line 15
    const-string v7, "Successfully updated cache for cacheKey: "

    .line 16
    .line 17
    const-string v8, "Failed to encode SDKInitResponse for cacheKey: "

    .line 18
    .line 19
    const-string v9, "Updating cache for cacheKey: "

    .line 20
    .line 21
    sget-object v10, Lkf/a;->a:Lkf/a;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v10, v1, Lcom/moloco/sdk/internal/services/init/j;->a:Lcom/moloco/sdk/acm/recorder/b;

    .line 27
    .line 28
    move-object v11, v10

    .line 29
    check-cast v11, Lcom/moloco/sdk/acm/recorder/c;

    .line 30
    .line 31
    const-string v12, "SDKInitCacheWrite"

    .line 32
    .line 33
    invoke-virtual {v11, v12}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    :try_start_0
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 38
    .line 39
    const-string v15, "InitCacheImpl"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 40
    .line 41
    move-object/from16 v21, v5

    .line 42
    .line 43
    :try_start_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v16

    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0xc

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v5, v1, Lcom/moloco/sdk/internal/services/init/j;->c:Lcom/moloco/sdk/K0;

    .line 71
    .line 72
    invoke-virtual {v5}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/4 v9, 0x0

    .line 77
    invoke-static {v5, v9}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-eqz v5, :cond_1

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-nez v15, :cond_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    move v8, v9

    .line 91
    goto :goto_2

    .line 92
    :catch_0
    move-exception v0

    .line 93
    :goto_0
    move-object/from16 v17, v0

    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_1
    :goto_1
    const-string v15, "InitCacheImpl"

    .line 98
    .line 99
    new-instance v9, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v16

    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0xc

    .line 120
    .line 121
    const/16 v20, 0x0

    .line 122
    .line 123
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/4 v8, 0x1

    .line 127
    :goto_2
    if-nez v8, :cond_2

    .line 128
    .line 129
    iget-object v9, v1, Lcom/moloco/sdk/internal/services/init/j;->d:Lcom/moloco/sdk/internal/services/init/k;

    .line 130
    .line 131
    iget-object v9, v9, Lcom/moloco/sdk/internal/services/init/k;->a:Landroid/content/SharedPreferences;

    .line 132
    .line 133
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-interface {v9, v15, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    goto :goto_3

    .line 150
    :cond_2
    const/4 v9, 0x0

    .line 151
    :goto_3
    if-eqz v9, :cond_3

    .line 152
    .line 153
    const-string v15, "InitCacheImpl"

    .line 154
    .line 155
    new-instance v5, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v16

    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/16 v18, 0x0

    .line 174
    .line 175
    const/16 v19, 0xc

    .line 176
    .line 177
    const/16 v20, 0x0

    .line 178
    .line 179
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v13, v4, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move-object v5, v10

    .line 186
    check-cast v5, Lcom/moloco/sdk/acm/recorder/c;

    .line 187
    .line 188
    invoke-virtual {v5, v13}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 189
    .line 190
    .line 191
    new-instance v5, Lcom/moloco/sdk/acm/h;

    .line 192
    .line 193
    invoke-direct {v5, v12}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v4, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast v10, Lcom/moloco/sdk/acm/recorder/c;

    .line 200
    .line 201
    invoke-virtual {v10, v5}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_6

    .line 205
    .line 206
    :cond_3
    if-eqz v8, :cond_4

    .line 207
    .line 208
    const-string v0, "encoding_failure"

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_4
    const-string v0, "commit_failure"

    .line 212
    .line 213
    :goto_4
    const-string v15, "InitCacheImpl"

    .line 214
    .line 215
    new-instance v5, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v7, " with error: "

    .line 228
    .line 229
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v16

    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0xc

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v13, v4, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v13, v2, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    move-object v5, v10

    .line 257
    check-cast v5, Lcom/moloco/sdk/acm/recorder/c;

    .line 258
    .line 259
    invoke-virtual {v5, v13}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 260
    .line 261
    .line 262
    new-instance v5, Lcom/moloco/sdk/acm/h;

    .line 263
    .line 264
    invoke-direct {v5, v12}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, v4, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v2, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    check-cast v10, Lcom/moloco/sdk/acm/recorder/c;

    .line 274
    .line 275
    invoke-virtual {v10, v5}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :catch_1
    move-exception v0

    .line 280
    move-object/from16 v21, v5

    .line 281
    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :goto_5
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 285
    .line 286
    new-instance v0, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v21 .. v21}, Lcom/moloco/sdk/internal/services/init/a;->a()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v5, " with exception"

    .line 299
    .line 300
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v16

    .line 307
    const-string v15, "InitCacheImpl"

    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    const/16 v19, 0x8

    .line 312
    .line 313
    const/16 v20, 0x0

    .line 314
    .line 315
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13, v4, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v13, v2, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v11, v13}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 333
    .line 334
    .line 335
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 336
    .line 337
    invoke-direct {v0, v12}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v4, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v0, v2, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v11, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 355
    .line 356
    .line 357
    :goto_6
    sget-object v0, Lef/C;->a:Lef/C;

    .line 358
    .line 359
    return-object v0
.end method
