.class public final Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lla/A;


# instance fields
.field public final a:Lba/a;

.field public final b:Lla/h;

.field public final c:Lcom/google/gson/internal/Excluder;

.field public final d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lba/a;Lla/h;Lcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lba/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b:Lla/h;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c:Lcom/google/gson/internal/Excluder;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Class "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " declares multiple JSON fields named \'"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "\'; conflict is caused by fields "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {p2}, Lpa/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " and "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {p3}, Lpa/c;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "\nSee "

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 55
    .line 56
    const-string p1, "duplicate-fields"

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0
.end method


# virtual methods
.method public final b(Lla/l;Lqa/a;Ljava/lang/Class;Z)Lcom/google/gson/internal/bind/r;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    invoke-virtual {v7}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/google/gson/internal/bind/r;->c:Lcom/google/gson/internal/bind/r;

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object/from16 v10, p2

    .line 25
    .line 26
    move-object v11, v7

    .line 27
    :goto_0
    const-class v1, Ljava/lang/Object;

    .line 28
    .line 29
    if-eq v11, v1, :cond_16

    .line 30
    .line 31
    invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 32
    .line 33
    .line 34
    move-result-object v12

    .line 35
    if-eq v11, v7, :cond_1

    .line 36
    .line 37
    array-length v1, v12

    .line 38
    if-lez v1, :cond_1

    .line 39
    .line 40
    iget-object v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v1}, Lna/d;->f(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    array-length v13, v12

    .line 46
    const/4 v14, 0x0

    .line 47
    move v15, v14

    .line 48
    :goto_1
    if-ge v15, v13, :cond_15

    .line 49
    .line 50
    aget-object v1, v12, v15

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-virtual {v0, v1, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Ljava/lang/reflect/Field;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v24

    .line 57
    invoke-virtual {v0, v1, v14}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c(Ljava/lang/reflect/Field;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v24, :cond_2

    .line 62
    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    move-object/from16 v3, p1

    .line 66
    .line 67
    goto/16 :goto_e

    .line 68
    .line 69
    :cond_2
    const/16 v25, 0x0

    .line 70
    .line 71
    const-class v4, Lma/b;

    .line 72
    .line 73
    if-eqz p4, :cond_6

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    move/from16 v26, v14

    .line 86
    .line 87
    :goto_2
    move-object/from16 v19, v25

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    sget-object v5, Lpa/c;->a:Lp7/b;

    .line 91
    .line 92
    invoke-virtual {v5, v11, v1}, Lp7/b;->s(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-static {v5}, Lpa/c;->f(Ljava/lang/reflect/AccessibleObject;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    if-eqz v6, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    invoke-static {v5, v14}, Lpa/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v2, Lla/p;

    .line 117
    .line 118
    const-string v3, "@SerializedName on "

    .line 119
    .line 120
    const-string v4, " is not supported"

    .line 121
    .line 122
    invoke-static {v3, v1, v4}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const/16 v3, 0xd

    .line 127
    .line 128
    invoke-direct {v2, v1, v3}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    throw v2

    .line 132
    :cond_5
    :goto_3
    move/from16 v26, v3

    .line 133
    .line 134
    move-object/from16 v19, v5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    move/from16 v26, v3

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_4
    if-nez v19, :cond_7

    .line 141
    .line 142
    invoke-static {v1}, Lpa/c;->f(Ljava/lang/reflect/AccessibleObject;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    iget-object v3, v10, Lqa/a;->b:Ljava/lang/reflect/Type;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    new-instance v6, Ljava/util/HashMap;

    .line 152
    .line 153
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-static {v3, v11, v5, v6}, Lna/d;->k(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, Lma/b;

    .line 165
    .line 166
    if-nez v4, :cond_8

    .line 167
    .line 168
    iget-object v4, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b:Lla/h;

    .line 169
    .line 170
    invoke-virtual {v4, v1}, Lla/h;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    :goto_5
    move/from16 p2, v2

    .line 179
    .line 180
    move-object v2, v4

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    invoke-interface {v4}, Lma/b;->value()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-interface {v4}, Lma/b;->alternate()[Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    array-length v6, v4

    .line 191
    if-nez v6, :cond_9

    .line 192
    .line 193
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    goto :goto_5

    .line 198
    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    .line 199
    .line 200
    move/from16 p2, v2

    .line 201
    .line 202
    array-length v2, v4

    .line 203
    add-int/lit8 v2, v2, 0x1

    .line 204
    .line 205
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    invoke-static {v6, v4}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-object v2, v6

    .line 215
    :goto_6
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    move-object/from16 v17, v4

    .line 220
    .line 221
    check-cast v17, Ljava/lang/String;

    .line 222
    .line 223
    new-instance v4, Lqa/a;

    .line 224
    .line 225
    invoke-direct {v4, v3}, Lqa/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 226
    .line 227
    .line 228
    iget-object v3, v4, Lqa/a;->a:Ljava/lang/Class;

    .line 229
    .line 230
    instance-of v5, v3, Ljava/lang/Class;

    .line 231
    .line 232
    if-eqz v5, :cond_a

    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-eqz v3, :cond_a

    .line 239
    .line 240
    move/from16 v22, p2

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_a
    move/from16 v22, v14

    .line 244
    .line 245
    :goto_7
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_b

    .line 254
    .line 255
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-eqz v3, :cond_b

    .line 260
    .line 261
    move/from16 v23, p2

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_b
    move/from16 v23, v14

    .line 265
    .line 266
    :goto_8
    const-class v3, Lma/a;

    .line 267
    .line 268
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    move-object v5, v3

    .line 273
    check-cast v5, Lma/a;

    .line 274
    .line 275
    if-eqz v5, :cond_c

    .line 276
    .line 277
    move-object/from16 v18, v1

    .line 278
    .line 279
    iget-object v1, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->d:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    .line 280
    .line 281
    move-object v6, v2

    .line 282
    iget-object v2, v0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lba/a;

    .line 283
    .line 284
    move-object v3, v6

    .line 285
    const/4 v6, 0x0

    .line 286
    move/from16 v16, p2

    .line 287
    .line 288
    move-object/from16 v27, v3

    .line 289
    .line 290
    move-object/from16 v3, p1

    .line 291
    .line 292
    invoke-virtual/range {v1 .. v6}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->a(Lba/a;Lla/l;Lqa/a;Lma/a;Z)Lla/z;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    goto :goto_9

    .line 297
    :cond_c
    move-object/from16 v3, p1

    .line 298
    .line 299
    move/from16 v16, p2

    .line 300
    .line 301
    move-object/from16 v18, v1

    .line 302
    .line 303
    move-object/from16 v27, v2

    .line 304
    .line 305
    move-object/from16 v1, v25

    .line 306
    .line 307
    :goto_9
    if-eqz v1, :cond_d

    .line 308
    .line 309
    move/from16 v2, v16

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_d
    move v2, v14

    .line 313
    :goto_a
    if-nez v1, :cond_e

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Lla/l;->c(Lqa/a;)Lla/z;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    :cond_e
    if-eqz v24, :cond_10

    .line 320
    .line 321
    if-eqz v2, :cond_f

    .line 322
    .line 323
    move-object v2, v1

    .line 324
    goto :goto_b

    .line 325
    :cond_f
    new-instance v2, Lcom/dexterous/flutterlocalnotifications/j;

    .line 326
    .line 327
    iget-object v4, v4, Lqa/a;->b:Ljava/lang/reflect/Type;

    .line 328
    .line 329
    invoke-direct {v2, v3, v1, v4}, Lcom/dexterous/flutterlocalnotifications/j;-><init>(Lla/l;Lla/z;Ljava/lang/reflect/Type;)V

    .line 330
    .line 331
    .line 332
    :goto_b
    move-object/from16 v20, v2

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_10
    move-object/from16 v20, v1

    .line 336
    .line 337
    :goto_c
    new-instance v16, Lcom/google/gson/internal/bind/o;

    .line 338
    .line 339
    move-object/from16 v21, v1

    .line 340
    .line 341
    invoke-direct/range {v16 .. v23}, Lcom/google/gson/internal/bind/o;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lla/z;Lla/z;ZZ)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v2, v16

    .line 345
    .line 346
    move-object/from16 v4, v17

    .line 347
    .line 348
    move-object/from16 v1, v18

    .line 349
    .line 350
    if-eqz v26, :cond_12

    .line 351
    .line 352
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    if-eqz v6, :cond_12

    .line 361
    .line 362
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    check-cast v6, Ljava/lang/String;

    .line 367
    .line 368
    invoke-interface {v8, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v16

    .line 372
    move-object/from16 v14, v16

    .line 373
    .line 374
    check-cast v14, Lcom/google/gson/internal/bind/o;

    .line 375
    .line 376
    if-nez v14, :cond_11

    .line 377
    .line 378
    const/4 v14, 0x0

    .line 379
    goto :goto_d

    .line 380
    :cond_11
    iget-object v2, v14, Lcom/google/gson/internal/bind/o;->b:Ljava/lang/reflect/Field;

    .line 381
    .line 382
    invoke-static {v7, v6, v2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 383
    .line 384
    .line 385
    throw v25

    .line 386
    :cond_12
    if-eqz v24, :cond_14

    .line 387
    .line 388
    invoke-interface {v9, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    check-cast v2, Lcom/google/gson/internal/bind/o;

    .line 393
    .line 394
    if-nez v2, :cond_13

    .line 395
    .line 396
    goto :goto_e

    .line 397
    :cond_13
    iget-object v2, v2, Lcom/google/gson/internal/bind/o;->b:Ljava/lang/reflect/Field;

    .line 398
    .line 399
    invoke-static {v7, v4, v2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 400
    .line 401
    .line 402
    throw v25

    .line 403
    :cond_14
    :goto_e
    add-int/lit8 v15, v15, 0x1

    .line 404
    .line 405
    const/4 v14, 0x0

    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :cond_15
    move-object/from16 v3, p1

    .line 409
    .line 410
    iget-object v1, v10, Lqa/a;->b:Ljava/lang/reflect/Type;

    .line 411
    .line 412
    invoke-virtual {v11}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    new-instance v4, Ljava/util/HashMap;

    .line 417
    .line 418
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-static {v1, v11, v2, v4}, Lna/d;->k(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    new-instance v10, Lqa/a;

    .line 426
    .line 427
    invoke-direct {v10, v1}, Lqa/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 428
    .line 429
    .line 430
    iget-object v11, v10, Lqa/a;->a:Ljava/lang/Class;

    .line 431
    .line 432
    goto/16 :goto_0

    .line 433
    .line 434
    :cond_16
    new-instance v1, Lcom/google/gson/internal/bind/r;

    .line 435
    .line 436
    new-instance v2, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 443
    .line 444
    .line 445
    invoke-direct {v1, v8, v2}, Lcom/google/gson/internal/bind/r;-><init>(Ljava/util/Map;Ljava/util/List;)V

    .line 446
    .line 447
    .line 448
    return-object v1
.end method

.method public final c(Ljava/lang/reflect/Field;Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->c:Lcom/google/gson/internal/Excluder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/16 v2, 0x88

    .line 11
    .line 12
    and-int/2addr v1, v2

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    :goto_0
    move p1, v2

    .line 17
    goto :goto_3

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/Excluder;->a(Ljava/lang/Class;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object p1, v0, Lcom/google/gson/internal/Excluder;->a:Ljava/util/List;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    iget-object p1, v0, Lcom/google/gson/internal/Excluder;->b:Ljava/util/List;

    .line 42
    .line 43
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_5

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    throw p1

    .line 65
    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 66
    :goto_3
    xor-int/2addr p1, v2

    .line 67
    return p1
.end method

.method public final create(Lla/l;Lqa/a;)Lla/z;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p2, Lqa/a;->a:Ljava/lang/Class;

    .line 3
    .line 4
    const-class v2, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v2, Lpa/c;->a:Lp7/b;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->isLocalClass()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    :cond_1
    new-instance p1, Lcom/google/gson/internal/bind/n;

    .line 39
    .line 40
    invoke-direct {p1, v0}, Lcom/google/gson/internal/bind/n;-><init>(I)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    iget-object v2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->e:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {v2}, Lna/d;->f(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lpa/c;->a:Lp7/b;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Lp7/b;->I(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    new-instance v0, Lcom/google/gson/internal/bind/s;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {p0, p1, p2, v1, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b(Lla/l;Lqa/a;Ljava/lang/Class;Z)Lcom/google/gson/internal/bind/r;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, v1, p1}, Lcom/google/gson/internal/bind/s;-><init>(Ljava/lang/Class;Lcom/google/gson/internal/bind/r;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    iget-object v2, p0, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->a:Lba/a;

    .line 69
    .line 70
    invoke-virtual {v2, p2}, Lba/a;->t(Lqa/a;)Lna/m;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, Lcom/google/gson/internal/bind/q;

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b(Lla/l;Lqa/a;Ljava/lang/Class;Z)Lcom/google/gson/internal/bind/r;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v3, v2, p1}, Lcom/google/gson/internal/bind/q;-><init>(Lna/m;Lcom/google/gson/internal/bind/r;)V

    .line 81
    .line 82
    .line 83
    return-object v3
.end method
