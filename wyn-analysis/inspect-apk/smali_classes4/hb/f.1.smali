.class public final Lhb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhb/q;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhb/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/reflect/Type;Ljava/lang/Class;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "No JsonAdapter for "

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, ", you should probably use "

    .line 25
    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, " instead of "

    .line 37
    .line 38
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter."

    .line 49
    .line 50
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;Ljava/util/Set;Lhb/K;)Lhb/r;
    .locals 18

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    const-class v2, Ljava/util/Set;

    .line 6
    .line 7
    const-class v3, Ljava/util/Collection;

    .line 8
    .line 9
    const-class v4, Ljava/util/List;

    .line 10
    .line 11
    const-class v5, Ljava/util/Map;

    .line 12
    .line 13
    const-class v6, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    const-class v8, Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v9, 0x2

    .line 20
    const/4 v12, 0x1

    .line 21
    move-object/from16 v13, p0

    .line 22
    .line 23
    iget v14, v13, Lhb/f;->a:I

    .line 24
    .line 25
    packed-switch v14, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    const/16 v16, 0x0

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_0
    sget-object v2, Lhb/P;->b:Lhb/M;

    .line 39
    .line 40
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    if-ne v1, v3, :cond_1

    .line 43
    .line 44
    move-object v10, v2

    .line 45
    goto/16 :goto_a

    .line 46
    .line 47
    :cond_1
    sget-object v3, Lhb/P;->c:Lhb/M;

    .line 48
    .line 49
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne v1, v4, :cond_2

    .line 52
    .line 53
    move-object v10, v3

    .line 54
    goto/16 :goto_a

    .line 55
    .line 56
    :cond_2
    sget-object v4, Lhb/P;->d:Lhb/M;

    .line 57
    .line 58
    sget-object v5, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne v1, v5, :cond_3

    .line 61
    .line 62
    move-object v10, v4

    .line 63
    goto/16 :goto_a

    .line 64
    .line 65
    :cond_3
    sget-object v5, Lhb/P;->e:Lhb/M;

    .line 66
    .line 67
    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne v1, v14, :cond_4

    .line 70
    .line 71
    move-object v10, v5

    .line 72
    goto/16 :goto_a

    .line 73
    .line 74
    :cond_4
    sget-object v14, Lhb/P;->f:Lhb/M;

    .line 75
    .line 76
    sget-object v15, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne v1, v15, :cond_5

    .line 79
    .line 80
    move-object v10, v14

    .line 81
    goto/16 :goto_a

    .line 82
    .line 83
    :cond_5
    sget-object v15, Lhb/P;->g:Lhb/M;

    .line 84
    .line 85
    if-ne v1, v7, :cond_6

    .line 86
    .line 87
    move-object v10, v15

    .line 88
    goto/16 :goto_a

    .line 89
    .line 90
    :cond_6
    sget-object v7, Lhb/P;->h:Lhb/M;

    .line 91
    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    if-ne v1, v10, :cond_7

    .line 97
    .line 98
    move-object v10, v7

    .line 99
    goto/16 :goto_a

    .line 100
    .line 101
    :cond_7
    sget-object v10, Lhb/P;->i:Lhb/M;

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    sget-object v11, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    if-ne v1, v11, :cond_8

    .line 108
    .line 109
    goto/16 :goto_a

    .line 110
    .line 111
    :cond_8
    const-class v11, Ljava/lang/Boolean;

    .line 112
    .line 113
    if-ne v1, v11, :cond_9

    .line 114
    .line 115
    invoke-virtual {v2}, Lhb/r;->nullSafe()Lhb/r;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    goto/16 :goto_a

    .line 120
    .line 121
    :cond_9
    const-class v2, Ljava/lang/Byte;

    .line 122
    .line 123
    if-ne v1, v2, :cond_a

    .line 124
    .line 125
    invoke-virtual {v3}, Lhb/r;->nullSafe()Lhb/r;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    goto/16 :goto_a

    .line 130
    .line 131
    :cond_a
    const-class v2, Ljava/lang/Character;

    .line 132
    .line 133
    if-ne v1, v2, :cond_b

    .line 134
    .line 135
    invoke-virtual {v4}, Lhb/r;->nullSafe()Lhb/r;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    goto/16 :goto_a

    .line 140
    .line 141
    :cond_b
    const-class v2, Ljava/lang/Double;

    .line 142
    .line 143
    if-ne v1, v2, :cond_c

    .line 144
    .line 145
    invoke-virtual {v5}, Lhb/r;->nullSafe()Lhb/r;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :cond_c
    const-class v2, Ljava/lang/Float;

    .line 152
    .line 153
    if-ne v1, v2, :cond_d

    .line 154
    .line 155
    invoke-virtual {v14}, Lhb/r;->nullSafe()Lhb/r;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    goto/16 :goto_a

    .line 160
    .line 161
    :cond_d
    const-class v2, Ljava/lang/Integer;

    .line 162
    .line 163
    if-ne v1, v2, :cond_e

    .line 164
    .line 165
    invoke-virtual {v15}, Lhb/r;->nullSafe()Lhb/r;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_e
    const-class v2, Ljava/lang/Long;

    .line 172
    .line 173
    if-ne v1, v2, :cond_f

    .line 174
    .line 175
    invoke-virtual {v7}, Lhb/r;->nullSafe()Lhb/r;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    goto/16 :goto_a

    .line 180
    .line 181
    :cond_f
    const-class v2, Ljava/lang/Short;

    .line 182
    .line 183
    if-ne v1, v2, :cond_10

    .line 184
    .line 185
    invoke-virtual {v10}, Lhb/r;->nullSafe()Lhb/r;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    goto/16 :goto_a

    .line 190
    .line 191
    :cond_10
    if-ne v1, v6, :cond_11

    .line 192
    .line 193
    sget-object v0, Lhb/P;->j:Lhb/M;

    .line 194
    .line 195
    invoke-virtual {v0}, Lhb/r;->nullSafe()Lhb/r;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    goto/16 :goto_a

    .line 200
    .line 201
    :cond_11
    if-ne v1, v8, :cond_12

    .line 202
    .line 203
    new-instance v1, Lhb/O;

    .line 204
    .line 205
    invoke-direct {v1, v0}, Lhb/O;-><init>(Lhb/K;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Lhb/r;->nullSafe()Lhb/r;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    goto/16 :goto_a

    .line 213
    .line 214
    :cond_12
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    sget-object v3, Lib/f;->a:Ljava/util/Set;

    .line 219
    .line 220
    const-class v3, [Ljava/lang/reflect/Type;

    .line 221
    .line 222
    const-class v4, Lhb/s;

    .line 223
    .line 224
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Lhb/s;

    .line 229
    .line 230
    if-eqz v4, :cond_16

    .line 231
    .line 232
    invoke-interface {v4}, Lhb/s;->generateAdapter()Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-nez v4, :cond_13

    .line 237
    .line 238
    goto/16 :goto_7

    .line 239
    .line 240
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    new-instance v5, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const-string v6, "$"

    .line 250
    .line 251
    const-string v7, "_"

    .line 252
    .line 253
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v4, "JsonAdapter"

    .line 261
    .line 262
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-static {v4, v12, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    :try_start_1
    instance-of v5, v1, Ljava/lang/reflect/ParameterizedType;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 278
    .line 279
    const-class v6, Lhb/K;

    .line 280
    .line 281
    if-eqz v5, :cond_14

    .line 282
    .line 283
    :try_start_2
    move-object v5, v1

    .line 284
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 285
    .line 286
    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 287
    .line 288
    .line 289
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    .line 290
    :try_start_3
    new-array v7, v9, [Ljava/lang/Class;

    .line 291
    .line 292
    aput-object v6, v7, v17

    .line 293
    .line 294
    aput-object v3, v7, v12

    .line 295
    .line 296
    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    new-array v7, v9, [Ljava/lang/Object;

    .line 301
    .line 302
    aput-object v0, v7, v17

    .line 303
    .line 304
    aput-object v5, v7, v12
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_0

    .line 305
    .line 306
    goto :goto_1

    .line 307
    :catch_0
    move-exception v0

    .line 308
    goto :goto_2

    .line 309
    :catch_1
    move-exception v0

    .line 310
    goto :goto_3

    .line 311
    :catch_2
    move-exception v0

    .line 312
    goto :goto_4

    .line 313
    :catch_3
    move-exception v0

    .line 314
    goto/16 :goto_6

    .line 315
    .line 316
    :catch_4
    :try_start_4
    new-array v0, v12, [Ljava/lang/Class;

    .line 317
    .line 318
    aput-object v3, v0, v17

    .line 319
    .line 320
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    new-array v7, v12, [Ljava/lang/Object;

    .line 325
    .line 326
    aput-object v5, v7, v17
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_0

    .line 327
    .line 328
    goto :goto_1

    .line 329
    :goto_0
    move-object v10, v4

    .line 330
    goto :goto_5

    .line 331
    :catch_5
    move-exception v0

    .line 332
    goto :goto_0

    .line 333
    :cond_14
    :try_start_5
    new-array v3, v12, [Ljava/lang/Class;

    .line 334
    .line 335
    aput-object v6, v3, v17

    .line 336
    .line 337
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    new-array v7, v12, [Ljava/lang/Object;

    .line 342
    .line 343
    aput-object v0, v7, v17
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_0

    .line 344
    .line 345
    goto :goto_1

    .line 346
    :catch_6
    move/from16 v0, v17

    .line 347
    .line 348
    :try_start_6
    new-array v3, v0, [Ljava/lang/Class;

    .line 349
    .line 350
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    new-array v7, v0, [Ljava/lang/Object;

    .line 355
    .line 356
    :goto_1
    invoke-virtual {v6, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v6, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    check-cast v0, Lhb/r;

    .line 364
    .line 365
    invoke-virtual {v0}, Lhb/r;->nullSafe()Lhb/r;

    .line 366
    .line 367
    .line 368
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_0

    .line 369
    goto/16 :goto_8

    .line 370
    .line 371
    :catch_7
    move-exception v0

    .line 372
    move-object/from16 v10, v16

    .line 373
    .line 374
    goto :goto_5

    .line 375
    :goto_2
    invoke-static {v0}, Lib/f;->i(Ljava/lang/reflect/InvocationTargetException;)V

    .line 376
    .line 377
    .line 378
    throw v16

    .line 379
    :goto_3
    new-instance v2, Ljava/lang/RuntimeException;

    .line 380
    .line 381
    new-instance v3, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    const-string v4, "Failed to instantiate the generated JsonAdapter for "

    .line 384
    .line 385
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    throw v2

    .line 399
    :goto_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 400
    .line 401
    new-instance v3, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v4, "Failed to access the generated JsonAdapter for "

    .line 404
    .line 405
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    throw v2

    .line 419
    :goto_5
    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    .line 420
    .line 421
    if-nez v2, :cond_15

    .line 422
    .line 423
    invoke-virtual {v10}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    array-length v2, v2

    .line 428
    if-eqz v2, :cond_15

    .line 429
    .line 430
    new-instance v2, Ljava/lang/RuntimeException;

    .line 431
    .line 432
    new-instance v3, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    const-string v4, "Failed to find the generated JsonAdapter constructor for \'"

    .line 435
    .line 436
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string v1, "\'. Suspiciously, the type was not parameterized but the target class \'"

    .line 443
    .line 444
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v10}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    const-string v1, "\' is generic. Consider using Types#newParameterizedType() to define these missing type variables."

    .line 455
    .line 456
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    throw v2

    .line 467
    :cond_15
    new-instance v2, Ljava/lang/RuntimeException;

    .line 468
    .line 469
    new-instance v3, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    const-string v4, "Failed to find the generated JsonAdapter constructor for "

    .line 472
    .line 473
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 484
    .line 485
    .line 486
    throw v2

    .line 487
    :goto_6
    new-instance v2, Ljava/lang/RuntimeException;

    .line 488
    .line 489
    new-instance v3, Ljava/lang/StringBuilder;

    .line 490
    .line 491
    const-string v4, "Failed to find the generated JsonAdapter class for "

    .line 492
    .line 493
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    invoke-direct {v2, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    throw v2

    .line 507
    :cond_16
    :goto_7
    move-object/from16 v0, v16

    .line 508
    .line 509
    :goto_8
    if-eqz v0, :cond_17

    .line 510
    .line 511
    move-object v10, v0

    .line 512
    goto :goto_a

    .line 513
    :cond_17
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-eqz v0, :cond_18

    .line 518
    .line 519
    new-instance v0, Lhb/N;

    .line 520
    .line 521
    invoke-direct {v0, v2}, Lhb/N;-><init>(Ljava/lang/Class;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, Lhb/r;->nullSafe()Lhb/r;

    .line 525
    .line 526
    .line 527
    move-result-object v10

    .line 528
    goto :goto_a

    .line 529
    :cond_18
    :goto_9
    move-object/from16 v10, v16

    .line 530
    .line 531
    :goto_a
    return-object v10

    .line 532
    :pswitch_0
    const/16 v16, 0x0

    .line 533
    .line 534
    return-object v16

    .line 535
    :pswitch_1
    const/16 v16, 0x0

    .line 536
    .line 537
    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->isEmpty()Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-nez v2, :cond_19

    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_19
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    if-eq v2, v5, :cond_1a

    .line 549
    .line 550
    :goto_b
    move-object/from16 v10, v16

    .line 551
    .line 552
    goto :goto_e

    .line 553
    :cond_1a
    const-class v3, Ljava/util/Properties;

    .line 554
    .line 555
    if-ne v1, v3, :cond_1b

    .line 556
    .line 557
    new-array v1, v9, [Ljava/lang/reflect/Type;

    .line 558
    .line 559
    const/16 v17, 0x0

    .line 560
    .line 561
    aput-object v6, v1, v17

    .line 562
    .line 563
    aput-object v6, v1, v12

    .line 564
    .line 565
    :goto_c
    const/16 v17, 0x0

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :cond_1b
    invoke-virtual {v5, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    if-eqz v3, :cond_1d

    .line 573
    .line 574
    invoke-static {v1, v2, v5}, Lib/f;->c(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 579
    .line 580
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 581
    .line 582
    .line 583
    invoke-static {v1, v2, v3, v4}, Lib/f;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    .line 588
    .line 589
    if-eqz v2, :cond_1c

    .line 590
    .line 591
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 592
    .line 593
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    goto :goto_c

    .line 598
    :cond_1c
    new-array v1, v9, [Ljava/lang/reflect/Type;

    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    aput-object v8, v1, v17

    .line 603
    .line 604
    aput-object v8, v1, v12

    .line 605
    .line 606
    :goto_d
    new-instance v2, Lhb/g;

    .line 607
    .line 608
    aget-object v3, v1, v17

    .line 609
    .line 610
    aget-object v1, v1, v12

    .line 611
    .line 612
    invoke-direct {v2, v0, v3, v1}, Lhb/g;-><init>(Lhb/K;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Lhb/r;->nullSafe()Lhb/r;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    :goto_e
    return-object v10

    .line 620
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 621
    .line 622
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :pswitch_2
    const/16 v16, 0x0

    .line 627
    .line 628
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result v6

    .line 636
    if-nez v6, :cond_1e

    .line 637
    .line 638
    goto :goto_f

    .line 639
    :cond_1e
    if-eq v5, v4, :cond_21

    .line 640
    .line 641
    if-ne v5, v3, :cond_1f

    .line 642
    .line 643
    goto :goto_10

    .line 644
    :cond_1f
    if-ne v5, v2, :cond_20

    .line 645
    .line 646
    invoke-static {v1}, Lhb/P;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-virtual {v0, v1}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    new-instance v1, Lhb/m;

    .line 655
    .line 656
    invoke-direct {v1, v0, v12}, Lhb/m;-><init>(Lhb/r;I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v1}, Lhb/r;->nullSafe()Lhb/r;

    .line 660
    .line 661
    .line 662
    move-result-object v10

    .line 663
    goto :goto_11

    .line 664
    :cond_20
    :goto_f
    move-object/from16 v10, v16

    .line 665
    .line 666
    goto :goto_11

    .line 667
    :cond_21
    :goto_10
    invoke-static {v1}, Lhb/P;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-virtual {v0, v1}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    new-instance v1, Lhb/m;

    .line 676
    .line 677
    const/4 v2, 0x0

    .line 678
    invoke-direct {v1, v0, v2}, Lhb/m;-><init>(Lhb/r;I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v1}, Lhb/r;->nullSafe()Lhb/r;

    .line 682
    .line 683
    .line 684
    move-result-object v10

    .line 685
    :goto_11
    return-object v10

    .line 686
    :pswitch_3
    const/16 v16, 0x0

    .line 687
    .line 688
    instance-of v6, v1, Ljava/lang/Class;

    .line 689
    .line 690
    if-nez v6, :cond_22

    .line 691
    .line 692
    instance-of v6, v1, Ljava/lang/reflect/ParameterizedType;

    .line 693
    .line 694
    if-nez v6, :cond_22

    .line 695
    .line 696
    goto/16 :goto_1c

    .line 697
    .line 698
    :cond_22
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    invoke-virtual {v6}, Ljava/lang/Class;->isInterface()Z

    .line 703
    .line 704
    .line 705
    move-result v10

    .line 706
    if-nez v10, :cond_37

    .line 707
    .line 708
    invoke-virtual {v6}, Ljava/lang/Class;->isEnum()Z

    .line 709
    .line 710
    .line 711
    move-result v10

    .line 712
    if-eqz v10, :cond_23

    .line 713
    .line 714
    goto/16 :goto_1c

    .line 715
    .line 716
    :cond_23
    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->isEmpty()Z

    .line 717
    .line 718
    .line 719
    move-result v10

    .line 720
    if-nez v10, :cond_24

    .line 721
    .line 722
    goto/16 :goto_1c

    .line 723
    .line 724
    :cond_24
    invoke-static {v6}, Lib/f;->d(Ljava/lang/Class;)Z

    .line 725
    .line 726
    .line 727
    move-result v10

    .line 728
    if-eqz v10, :cond_26

    .line 729
    .line 730
    invoke-static {v1, v4}, Lhb/f;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    .line 731
    .line 732
    .line 733
    invoke-static {v1, v2}, Lhb/f;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    .line 734
    .line 735
    .line 736
    invoke-static {v1, v5}, Lhb/f;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v1, v3}, Lhb/f;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    .line 740
    .line 741
    .line 742
    new-instance v0, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    const-string v2, "Platform "

    .line 745
    .line 746
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    instance-of v2, v1, Ljava/lang/reflect/ParameterizedType;

    .line 757
    .line 758
    if-eqz v2, :cond_25

    .line 759
    .line 760
    new-instance v2, Ljava/lang/StringBuilder;

    .line 761
    .line 762
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    .line 768
    const-string v0, " in "

    .line 769
    .line 770
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    :cond_25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 781
    .line 782
    const-string v2, " requires explicit JsonAdapter to be registered"

    .line 783
    .line 784
    invoke-static {v0, v2}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    throw v1

    .line 792
    :cond_26
    invoke-virtual {v6}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 793
    .line 794
    .line 795
    move-result v2

    .line 796
    if-nez v2, :cond_36

    .line 797
    .line 798
    invoke-virtual {v6}, Ljava/lang/Class;->isLocalClass()Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-nez v2, :cond_35

    .line 803
    .line 804
    invoke-virtual {v6}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    if-eqz v2, :cond_28

    .line 809
    .line 810
    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    if-eqz v2, :cond_27

    .line 819
    .line 820
    goto :goto_12

    .line 821
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 822
    .line 823
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    const-string v2, "Cannot serialize non-static nested class "

    .line 828
    .line 829
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    throw v0

    .line 837
    :cond_28
    :goto_12
    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    if-nez v2, :cond_34

    .line 846
    .line 847
    sget-object v2, Lib/f;->d:Ljava/lang/Class;

    .line 848
    .line 849
    if-eqz v2, :cond_2a

    .line 850
    .line 851
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    if-nez v2, :cond_29

    .line 856
    .line 857
    goto :goto_13

    .line 858
    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 859
    .line 860
    new-instance v1, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    const-string v2, "Cannot serialize Kotlin type "

    .line 863
    .line 864
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    const-string v2, ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."

    .line 875
    .line 876
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v1

    .line 883
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    throw v0

    .line 887
    :cond_2a
    :goto_13
    const-string v2, "newInstance"

    .line 888
    .line 889
    const-class v3, Ljava/io/ObjectStreamClass;

    .line 890
    .line 891
    const-class v4, Ljava/lang/Class;

    .line 892
    .line 893
    const/4 v5, 0x0

    .line 894
    :try_start_7
    new-array v10, v5, [Ljava/lang/Class;

    .line 895
    .line 896
    invoke-virtual {v6, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 897
    .line 898
    .line 899
    move-result-object v5

    .line 900
    invoke-virtual {v5, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 901
    .line 902
    .line 903
    new-instance v10, Lhb/h;

    .line 904
    .line 905
    invoke-direct {v10, v5, v6}, Lhb/h;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Class;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_8

    .line 906
    .line 907
    .line 908
    :goto_14
    const/16 v17, 0x0

    .line 909
    .line 910
    goto :goto_15

    .line 911
    :catch_8
    :try_start_8
    const-string v5, "sun.misc.Unsafe"

    .line 912
    .line 913
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    move-result-object v5

    .line 917
    const-string v10, "theUnsafe"

    .line 918
    .line 919
    invoke-virtual {v5, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 920
    .line 921
    .line 922
    move-result-object v10

    .line 923
    invoke-virtual {v10, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 924
    .line 925
    .line 926
    move-object/from16 v11, v16

    .line 927
    .line 928
    invoke-virtual {v10, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v10

    .line 932
    const-string v11, "allocateInstance"

    .line 933
    .line 934
    new-array v14, v12, [Ljava/lang/Class;

    .line 935
    .line 936
    const/16 v17, 0x0

    .line 937
    .line 938
    aput-object v4, v14, v17

    .line 939
    .line 940
    invoke-virtual {v5, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    new-instance v11, Lhb/i;

    .line 945
    .line 946
    invoke-direct {v11, v5, v10, v6}, Lhb/i;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_8 .. :try_end_8} :catch_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/lang/NoSuchFieldException; {:try_start_8 .. :try_end_8} :catch_9

    .line 947
    .line 948
    .line 949
    move-object v10, v11

    .line 950
    goto :goto_14

    .line 951
    :catch_9
    :try_start_9
    const-string v5, "getConstructorId"

    .line 952
    .line 953
    new-array v10, v12, [Ljava/lang/Class;

    .line 954
    .line 955
    const/16 v17, 0x0

    .line 956
    .line 957
    aput-object v4, v10, v17

    .line 958
    .line 959
    invoke-virtual {v3, v5, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 960
    .line 961
    .line 962
    move-result-object v5

    .line 963
    invoke-virtual {v5, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 964
    .line 965
    .line 966
    new-array v10, v12, [Ljava/lang/Object;

    .line 967
    .line 968
    aput-object v8, v10, v17

    .line 969
    .line 970
    const/4 v11, 0x0

    .line 971
    invoke-virtual {v5, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v5

    .line 975
    check-cast v5, Ljava/lang/Integer;

    .line 976
    .line 977
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    new-array v10, v9, [Ljava/lang/Class;

    .line 982
    .line 983
    aput-object v4, v10, v17

    .line 984
    .line 985
    aput-object v7, v10, v12

    .line 986
    .line 987
    invoke-virtual {v3, v2, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 988
    .line 989
    .line 990
    move-result-object v3

    .line 991
    invoke-virtual {v3, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 992
    .line 993
    .line 994
    new-instance v10, Lhb/j;

    .line 995
    .line 996
    invoke-direct {v10, v3, v6, v5}, Lhb/j;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;I)V
    :try_end_9
    .catch Ljava/lang/IllegalAccessException; {:try_start_9 .. :try_end_9} :catch_d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_9 .. :try_end_9} :catch_a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_9} :catch_b

    .line 997
    .line 998
    .line 999
    goto :goto_14

    .line 1000
    :catch_a
    move-exception v0

    .line 1001
    goto/16 :goto_1b

    .line 1002
    .line 1003
    :catch_b
    :try_start_a
    const-class v3, Ljava/io/ObjectInputStream;

    .line 1004
    .line 1005
    new-array v5, v9, [Ljava/lang/Class;

    .line 1006
    .line 1007
    const/16 v17, 0x0

    .line 1008
    .line 1009
    aput-object v4, v5, v17

    .line 1010
    .line 1011
    aput-object v4, v5, v12

    .line 1012
    .line 1013
    invoke-virtual {v3, v2, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    invoke-virtual {v2, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1018
    .line 1019
    .line 1020
    new-instance v10, Lhb/h;

    .line 1021
    .line 1022
    invoke-direct {v10, v2, v6}, Lhb/h;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Class;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_c

    .line 1023
    .line 1024
    .line 1025
    :goto_15
    new-instance v2, Ljava/util/TreeMap;

    .line 1026
    .line 1027
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 1028
    .line 1029
    .line 1030
    :goto_16
    if-eq v1, v8, :cond_33

    .line 1031
    .line 1032
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v3

    .line 1036
    invoke-static {v3}, Lib/f;->d(Ljava/lang/Class;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v4

    .line 1040
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v5

    .line 1044
    array-length v6, v5

    .line 1045
    move/from16 v7, v17

    .line 1046
    .line 1047
    :goto_17
    if-ge v7, v6, :cond_32

    .line 1048
    .line 1049
    aget-object v9, v5, v7

    .line 1050
    .line 1051
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 1052
    .line 1053
    .line 1054
    move-result v11

    .line 1055
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v14

    .line 1059
    if-nez v14, :cond_2d

    .line 1060
    .line 1061
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v14

    .line 1065
    if-eqz v14, :cond_2b

    .line 1066
    .line 1067
    goto :goto_18

    .line 1068
    :cond_2b
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v14

    .line 1072
    if-nez v14, :cond_2c

    .line 1073
    .line 1074
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v11

    .line 1078
    if-nez v11, :cond_2c

    .line 1079
    .line 1080
    if-nez v4, :cond_2d

    .line 1081
    .line 1082
    :cond_2c
    const-class v11, Lhb/o;

    .line 1083
    .line 1084
    invoke-virtual {v9, v11}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v11

    .line 1088
    check-cast v11, Lhb/o;

    .line 1089
    .line 1090
    if-eqz v11, :cond_2e

    .line 1091
    .line 1092
    invoke-interface {v11}, Lhb/o;->ignore()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v14

    .line 1096
    if-eqz v14, :cond_2e

    .line 1097
    .line 1098
    :cond_2d
    :goto_18
    move-object/from16 p1, v3

    .line 1099
    .line 1100
    goto :goto_1a

    .line 1101
    :cond_2e
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v14

    .line 1105
    new-instance v15, Ljava/util/LinkedHashSet;

    .line 1106
    .line 1107
    invoke-direct {v15}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1108
    .line 1109
    .line 1110
    invoke-static {v1, v3, v14, v15}, Lib/f;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v14

    .line 1114
    invoke-interface {v9}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v15

    .line 1118
    invoke-static {v15}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v15

    .line 1122
    move-object/from16 p1, v3

    .line 1123
    .line 1124
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    invoke-virtual {v0, v14, v15, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v14

    .line 1132
    invoke-virtual {v9, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1133
    .line 1134
    .line 1135
    if-nez v11, :cond_2f

    .line 1136
    .line 1137
    goto :goto_19

    .line 1138
    :cond_2f
    invoke-interface {v11}, Lhb/o;->name()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v11

    .line 1142
    const-string v15, "\u0000"

    .line 1143
    .line 1144
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v15

    .line 1148
    if-eqz v15, :cond_30

    .line 1149
    .line 1150
    goto :goto_19

    .line 1151
    :cond_30
    move-object v3, v11

    .line 1152
    :goto_19
    new-instance v11, Lhb/k;

    .line 1153
    .line 1154
    invoke-direct {v11, v3, v9, v14}, Lhb/k;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;Lhb/r;)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v2, v3, v11}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    check-cast v3, Lhb/k;

    .line 1162
    .line 1163
    if-nez v3, :cond_31

    .line 1164
    .line 1165
    goto :goto_1a

    .line 1166
    :cond_31
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1167
    .line 1168
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1169
    .line 1170
    const-string v2, "Conflicting fields:\n    "

    .line 1171
    .line 1172
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    iget-object v2, v3, Lhb/k;->b:Ljava/lang/reflect/Field;

    .line 1176
    .line 1177
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    .line 1180
    const-string v2, "\n    "

    .line 1181
    .line 1182
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v1

    .line 1192
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    throw v0

    .line 1196
    :goto_1a
    add-int/2addr v7, v12

    .line 1197
    move-object/from16 v3, p1

    .line 1198
    .line 1199
    goto/16 :goto_17

    .line 1200
    .line 1201
    :cond_32
    invoke-static {v1}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    invoke-virtual {v3}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v4

    .line 1209
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1210
    .line 1211
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1212
    .line 1213
    .line 1214
    invoke-static {v1, v3, v4, v5}, Lib/f;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/LinkedHashSet;)Ljava/lang/reflect/Type;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    goto/16 :goto_16

    .line 1219
    .line 1220
    :cond_33
    new-instance v0, Lhb/l;

    .line 1221
    .line 1222
    invoke-direct {v0, v10, v2}, Lhb/l;-><init>(Lhb/P;Ljava/util/TreeMap;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v0}, Lhb/r;->nullSafe()Lhb/r;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v10

    .line 1229
    goto :goto_1d

    .line 1230
    :catch_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1231
    .line 1232
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    const-string v2, "cannot construct instances of "

    .line 1237
    .line 1238
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    throw v0

    .line 1246
    :goto_1b
    invoke-static {v0}, Lib/f;->i(Ljava/lang/reflect/InvocationTargetException;)V

    .line 1247
    .line 1248
    .line 1249
    const/16 v16, 0x0

    .line 1250
    .line 1251
    throw v16

    .line 1252
    :catch_d
    new-instance v0, Ljava/lang/AssertionError;

    .line 1253
    .line 1254
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 1255
    .line 1256
    .line 1257
    throw v0

    .line 1258
    :catch_e
    new-instance v0, Ljava/lang/AssertionError;

    .line 1259
    .line 1260
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 1261
    .line 1262
    .line 1263
    throw v0

    .line 1264
    :cond_34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1265
    .line 1266
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v1

    .line 1270
    const-string v2, "Cannot serialize abstract class "

    .line 1271
    .line 1272
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v1

    .line 1276
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1277
    .line 1278
    .line 1279
    throw v0

    .line 1280
    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1281
    .line 1282
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    const-string v2, "Cannot serialize local class "

    .line 1287
    .line 1288
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v1

    .line 1292
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1293
    .line 1294
    .line 1295
    throw v0

    .line 1296
    :cond_36
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1297
    .line 1298
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    const-string v2, "Cannot serialize anonymous class "

    .line 1303
    .line 1304
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    throw v0

    .line 1312
    :cond_37
    :goto_1c
    move-object/from16 v10, v16

    .line 1313
    .line 1314
    :goto_1d
    return-object v10

    .line 1315
    :pswitch_4
    const/16 v16, 0x0

    .line 1316
    .line 1317
    instance-of v2, v1, Ljava/lang/reflect/GenericArrayType;

    .line 1318
    .line 1319
    if-eqz v2, :cond_38

    .line 1320
    .line 1321
    check-cast v1, Ljava/lang/reflect/GenericArrayType;

    .line 1322
    .line 1323
    invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v11

    .line 1327
    goto :goto_1e

    .line 1328
    :cond_38
    instance-of v2, v1, Ljava/lang/Class;

    .line 1329
    .line 1330
    if-eqz v2, :cond_39

    .line 1331
    .line 1332
    check-cast v1, Ljava/lang/Class;

    .line 1333
    .line 1334
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v11

    .line 1338
    goto :goto_1e

    .line 1339
    :cond_39
    move-object/from16 v11, v16

    .line 1340
    .line 1341
    :goto_1e
    if-nez v11, :cond_3a

    .line 1342
    .line 1343
    goto :goto_1f

    .line 1344
    :cond_3a
    invoke-interface/range {p2 .. p2}, Ljava/util/Set;->isEmpty()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v1

    .line 1348
    if-nez v1, :cond_3b

    .line 1349
    .line 1350
    :goto_1f
    move-object/from16 v10, v16

    .line 1351
    .line 1352
    goto :goto_20

    .line 1353
    :cond_3b
    invoke-static {v11}, Lhb/P;->d(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    invoke-virtual {v0, v11}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    new-instance v2, Lhb/g;

    .line 1362
    .line 1363
    invoke-direct {v2, v1, v0}, Lhb/g;-><init>(Ljava/lang/Class;Lhb/r;)V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v2}, Lhb/r;->nullSafe()Lhb/r;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v10

    .line 1370
    :goto_20
    return-object v10

    .line 1371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
