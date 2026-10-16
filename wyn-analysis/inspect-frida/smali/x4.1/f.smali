.class public final Lx4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/e;
.implements Landroid/location/LocationListener;


# instance fields
.field public final a:Landroid/location/LocationManager;

.field public final b:Lx4/k;

.field public final c:Lx4/h;

.field public final d:Landroid/content/Context;

.field public e:Z

.field public f:Landroid/location/Location;

.field public g:Ljava/lang/String;

.field public h:Lx4/l;

.field public i:Lw4/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx4/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lx4/f;->e:Z

    .line 6
    .line 7
    const-string v0, "location"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/location/LocationManager;

    .line 14
    .line 15
    iput-object v0, p0, Lx4/f;->a:Landroid/location/LocationManager;

    .line 16
    .line 17
    iput-object p2, p0, Lx4/f;->c:Lx4/h;

    .line 18
    .line 19
    iput-object p1, p0, Lx4/f;->d:Landroid/content/Context;

    .line 20
    .line 21
    new-instance v0, Lx4/k;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Lx4/k;-><init>(Landroid/content/Context;Lx4/h;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lx4/f;->b:Lx4/k;

    .line 27
    .line 28
    return-void
.end method

.method public static f(Landroid/location/Location;Landroid/location/Location;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    sub-long/2addr v1, v3

    .line 14
    const-wide/32 v3, 0x1d4c0

    .line 15
    .line 16
    .line 17
    cmp-long v3, v1, v3

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-lez v3, :cond_1

    .line 21
    .line 22
    move v3, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v3, v4

    .line 25
    :goto_0
    const-wide/32 v5, -0x1d4c0

    .line 26
    .line 27
    .line 28
    cmp-long v5, v1, v5

    .line 29
    .line 30
    if-gez v5, :cond_2

    .line 31
    .line 32
    move v5, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v5, v4

    .line 35
    :goto_1
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    cmp-long v1, v1, v6

    .line 38
    .line 39
    if-lez v1, :cond_3

    .line 40
    .line 41
    move v1, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move v1, v4

    .line 44
    :goto_2
    if-eqz v3, :cond_4

    .line 45
    .line 46
    return v0

    .line 47
    :cond_4
    if-eqz v5, :cond_5

    .line 48
    .line 49
    return v4

    .line 50
    :cond_5
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sub-float/2addr v2, v3

    .line 59
    float-to-int v2, v2

    .line 60
    int-to-float v2, v2

    .line 61
    const/4 v3, 0x0

    .line 62
    cmpl-float v5, v2, v3

    .line 63
    .line 64
    if-lez v5, :cond_6

    .line 65
    .line 66
    move v5, v0

    .line 67
    goto :goto_3

    .line 68
    :cond_6
    move v5, v4

    .line 69
    :goto_3
    cmpg-float v3, v2, v3

    .line 70
    .line 71
    if-gez v3, :cond_7

    .line 72
    .line 73
    move v3, v0

    .line 74
    goto :goto_4

    .line 75
    :cond_7
    move v3, v4

    .line 76
    :goto_4
    const/high16 v6, 0x43480000    # 200.0f

    .line 77
    .line 78
    cmpl-float v2, v2, v6

    .line 79
    .line 80
    if-lez v2, :cond_8

    .line 81
    .line 82
    move v2, v0

    .line 83
    goto :goto_5

    .line 84
    :cond_8
    move v2, v4

    .line 85
    :goto_5
    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-eqz v6, :cond_9

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    goto :goto_6

    .line 104
    :cond_9
    move p0, v4

    .line 105
    :goto_6
    if-eqz v3, :cond_a

    .line 106
    .line 107
    return v0

    .line 108
    :cond_a
    if-eqz v1, :cond_b

    .line 109
    .line 110
    if-nez v5, :cond_b

    .line 111
    .line 112
    return v0

    .line 113
    :cond_b
    if-eqz v1, :cond_c

    .line 114
    .line 115
    if-nez v2, :cond_c

    .line 116
    .line 117
    if-eqz p0, :cond_c

    .line 118
    .line 119
    return v0

    .line 120
    :cond_c
    return v4
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lx4/l;Lw4/a;)V
    .locals 24

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v6, v5, Lx4/f;->d:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v6}, Lwg/b;->a(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    if-nez v6, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, v2}, Lw4/a;->onError(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    move-object/from16 v6, p2

    .line 21
    .line 22
    iput-object v6, v5, Lx4/f;->h:Lx4/l;

    .line 23
    .line 24
    iput-object v0, v5, Lx4/f;->i:Lw4/a;

    .line 25
    .line 26
    const/4 v6, 0x5

    .line 27
    const/16 v7, 0x68

    .line 28
    .line 29
    const/16 v8, 0x64

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    const/16 v12, 0x66

    .line 33
    .line 34
    iget-object v13, v5, Lx4/f;->c:Lx4/h;

    .line 35
    .line 36
    if-eqz v13, :cond_4

    .line 37
    .line 38
    iget-wide v14, v13, Lx4/h;->b:J

    .line 39
    .line 40
    long-to-float v14, v14

    .line 41
    iget v15, v13, Lx4/h;->a:I

    .line 42
    .line 43
    if-ne v15, v4, :cond_1

    .line 44
    .line 45
    const-wide p1, 0x7fffffffffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    const-wide v9, 0x7fffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-wide p1, 0x7fffffffffffffffL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    iget-wide v9, v13, Lx4/h;->c:J

    .line 62
    .line 63
    :goto_0
    invoke-static {v15}, LA/f;->f(I)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    if-eqz v13, :cond_3

    .line 68
    .line 69
    if-eq v13, v4, :cond_3

    .line 70
    .line 71
    const/16 v16, 0x2

    .line 72
    .line 73
    if-eq v13, v2, :cond_2

    .line 74
    .line 75
    const/4 v1, 0x4

    .line 76
    if-eq v13, v1, :cond_2

    .line 77
    .line 78
    if-eq v13, v6, :cond_2

    .line 79
    .line 80
    move v1, v12

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v1, v8

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const/16 v16, 0x2

    .line 85
    .line 86
    move v1, v7

    .line 87
    :goto_1
    move/from16 v18, v14

    .line 88
    .line 89
    move v6, v15

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    const-wide p1, 0x7fffffffffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    const/16 v16, 0x2

    .line 97
    .line 98
    const-wide/16 v9, 0x0

    .line 99
    .line 100
    move/from16 v18, v11

    .line 101
    .line 102
    move v1, v12

    .line 103
    :goto_2
    iget-object v13, v5, Lx4/f;->a:Landroid/location/LocationManager;

    .line 104
    .line 105
    invoke-virtual {v13, v4}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    const/16 v14, 0x1f

    .line 110
    .line 111
    if-ne v6, v4, :cond_5

    .line 112
    .line 113
    const-string v6, "passive"

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    const-string v6, "fused"

    .line 117
    .line 118
    invoke-interface {v13, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v15

    .line 122
    if-eqz v15, :cond_6

    .line 123
    .line 124
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    if-lt v15, v14, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    const-string v6, "gps"

    .line 130
    .line 131
    invoke-interface {v13, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v15

    .line 135
    if-eqz v15, :cond_7

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    const-string v6, "network"

    .line 139
    .line 140
    invoke-interface {v13, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    if-eqz v15, :cond_8

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-nez v6, :cond_9

    .line 152
    .line 153
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Ljava/lang/String;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    const/4 v6, 0x0

    .line 161
    :goto_3
    iput-object v6, v5, Lx4/f;->g:Ljava/lang/String;

    .line 162
    .line 163
    if-nez v6, :cond_a

    .line 164
    .line 165
    invoke-interface {v0, v2}, Lw4/a;->onError(I)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_a
    const-string v0, "intervalMillis"

    .line 170
    .line 171
    invoke-static {v9, v10, v0}, Lj1/d;->b(JLjava/lang/String;)V

    .line 172
    .line 173
    .line 174
    cmpg-float v0, v18, v11

    .line 175
    .line 176
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 177
    .line 178
    .line 179
    const-string v13, "minUpdateDistanceMeters"

    .line 180
    .line 181
    if-ltz v0, :cond_16

    .line 182
    .line 183
    cmpl-float v0, v18, v6

    .line 184
    .line 185
    if-gtz v0, :cond_15

    .line 186
    .line 187
    const-string v0, "minUpdateIntervalMillis"

    .line 188
    .line 189
    invoke-static {v9, v10, v0}, Lj1/d;->b(JLjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    if-eq v1, v7, :cond_c

    .line 193
    .line 194
    if-eq v1, v12, :cond_c

    .line 195
    .line 196
    if-ne v1, v8, :cond_b

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_b
    move v0, v3

    .line 200
    goto :goto_5

    .line 201
    :cond_c
    :goto_4
    move v0, v4

    .line 202
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    new-array v7, v4, [Ljava/lang/Object;

    .line 207
    .line 208
    aput-object v6, v7, v3

    .line 209
    .line 210
    if-eqz v0, :cond_14

    .line 211
    .line 212
    cmp-long v0, v9, p1

    .line 213
    .line 214
    if-nez v0, :cond_e

    .line 215
    .line 216
    const-wide/16 v6, -0x1

    .line 217
    .line 218
    cmp-long v0, v9, v6

    .line 219
    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_d
    move v0, v3

    .line 224
    goto :goto_7

    .line 225
    :cond_e
    :goto_6
    move v0, v4

    .line 226
    :goto_7
    if-eqz v0, :cond_13

    .line 227
    .line 228
    new-instance v17, Le1/d;

    .line 229
    .line 230
    invoke-static {v9, v10, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 231
    .line 232
    .line 233
    move-result-wide v22

    .line 234
    move/from16 v19, v1

    .line 235
    .line 236
    move-wide/from16 v20, v9

    .line 237
    .line 238
    invoke-direct/range {v17 .. v23}, Le1/d;-><init>(FIJJ)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v0, v17

    .line 242
    .line 243
    iput-boolean v4, v5, Lx4/f;->e:Z

    .line 244
    .line 245
    iget-object v1, v5, Lx4/f;->b:Lx4/k;

    .line 246
    .line 247
    invoke-virtual {v1}, Lx4/k;->b()V

    .line 248
    .line 249
    .line 250
    iget-object v1, v5, Lx4/f;->g:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    sget v7, Le1/b;->a:I

    .line 257
    .line 258
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 259
    .line 260
    iget-object v8, v5, Lx4/f;->a:Landroid/location/LocationManager;

    .line 261
    .line 262
    if-lt v7, v14, :cond_f

    .line 263
    .line 264
    invoke-static {v0}, Le1/a;->c(Le1/d;)Landroid/location/LocationRequest;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-instance v2, Landroid/os/Handler;

    .line 269
    .line 270
    invoke-direct {v2, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 271
    .line 272
    .line 273
    new-instance v3, LY4/g;

    .line 274
    .line 275
    invoke-direct {v3, v2, v4}, LY4/g;-><init>(Landroid/os/Handler;I)V

    .line 276
    .line 277
    .line 278
    invoke-static {v8, v1, v0, v3, v5}, Le1/a;->b(Landroid/location/LocationManager;Ljava/lang/String;Landroid/location/LocationRequest;LY4/g;Lx4/f;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_f
    :try_start_0
    sget-object v7, Lxg/g;->c:Ljava/lang/Class;

    .line 283
    .line 284
    if-nez v7, :cond_10

    .line 285
    .line 286
    const-string v7, "android.location.LocationRequest"

    .line 287
    .line 288
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    sput-object v7, Lxg/g;->c:Ljava/lang/Class;

    .line 293
    .line 294
    :cond_10
    sget-object v7, Lxg/g;->d:Ljava/lang/reflect/Method;

    .line 295
    .line 296
    if-nez v7, :cond_11

    .line 297
    .line 298
    const-class v7, Landroid/location/LocationManager;

    .line 299
    .line 300
    const-string v9, "requestLocationUpdates"

    .line 301
    .line 302
    new-array v10, v2, [Ljava/lang/Class;

    .line 303
    .line 304
    sget-object v11, Lxg/g;->c:Ljava/lang/Class;

    .line 305
    .line 306
    aput-object v11, v10, v3

    .line 307
    .line 308
    const-class v11, Landroid/location/LocationListener;

    .line 309
    .line 310
    aput-object v11, v10, v4

    .line 311
    .line 312
    const-class v11, Landroid/os/Looper;

    .line 313
    .line 314
    aput-object v11, v10, v16

    .line 315
    .line 316
    invoke-virtual {v7, v9, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    sput-object v7, Lxg/g;->d:Ljava/lang/reflect/Method;

    .line 321
    .line 322
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 323
    .line 324
    .line 325
    :cond_11
    invoke-virtual {v0, v1}, Le1/d;->a(Ljava/lang/String;)Landroid/location/LocationRequest;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    if-eqz v7, :cond_12

    .line 330
    .line 331
    sget-object v9, Lxg/g;->d:Ljava/lang/reflect/Method;

    .line 332
    .line 333
    new-array v2, v2, [Ljava/lang/Object;

    .line 334
    .line 335
    aput-object v7, v2, v3

    .line 336
    .line 337
    aput-object v5, v2, v4

    .line 338
    .line 339
    aput-object v6, v2, v16

    .line 340
    .line 341
    invoke-virtual {v9, v8, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :catch_0
    :cond_12
    iget v4, v0, Le1/d;->d:F

    .line 346
    .line 347
    iget-wide v2, v0, Le1/d;->b:J

    .line 348
    .line 349
    move-object v0, v8

    .line 350
    invoke-virtual/range {v0 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    const-string v1, "passive location requests must have an explicit minimum update interval"

    .line 357
    .line 358
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 363
    .line 364
    const-string v1, "quality must be a defined QUALITY constant, not %d"

    .line 365
    .line 366
    invoke-static {v1, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v0

    .line 374
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 375
    .line 376
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 377
    .line 378
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    new-array v2, v2, [Ljava/lang/Object;

    .line 387
    .line 388
    aput-object v13, v2, v3

    .line 389
    .line 390
    aput-object v5, v2, v4

    .line 391
    .line 392
    aput-object v6, v2, v16

    .line 393
    .line 394
    const-string v3, "%s is out of range of [%f, %f] (too high)"

    .line 395
    .line 396
    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v0

    .line 404
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 405
    .line 406
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 407
    .line 408
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    new-array v2, v2, [Ljava/lang/Object;

    .line 417
    .line 418
    aput-object v13, v2, v3

    .line 419
    .line 420
    aput-object v5, v2, v4

    .line 421
    .line 422
    aput-object v6, v2, v16

    .line 423
    .line 424
    const-string v3, "%s is out of range of [%f, %f] (too low)"

    .line 425
    .line 426
    invoke-static {v1, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    throw v0
.end method

.method public final b(LKa/b;LKa/b;)V
    .locals 4

    .line 1
    iget-object p2, p0, Lx4/f;->a:Landroid/location/LocationManager;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p2, v0}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-static {v2, v1}, Lx4/f;->f(Landroid/location/Location;Landroid/location/Location;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move-object v1, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p1, v1}, LKa/b;->a(Landroid/location/Location;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final c(Lcom/google/android/gms/ads/nativead/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/f;->a:Landroid/location/LocationManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ltc/g;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lx4/f;->d:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v0}, Lwg/b;->a(Landroid/content/Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ltc/g;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d(II)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lx4/f;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx4/f;->b:Lx4/k;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx4/k;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lx4/f;->a:Landroid/location/LocationManager;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onFlushComplete(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized onLocationChanged(Landroid/location/Location;)V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lx4/f;->f:Landroid/location/Location;

    invoke-static {p1, v0}, Lx4/f;->f(Landroid/location/Location;Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iput-object p1, p0, Lx4/f;->f:Landroid/location/Location;

    .line 5
    iget-object v0, p0, Lx4/f;->h:Lx4/l;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lx4/f;->b:Lx4/k;

    invoke-virtual {v0, p1}, Lx4/k;->a(Landroid/location/Location;)V

    .line 7
    iget-object p1, p0, Lx4/f;->h:Lx4/l;

    iget-object v0, p0, Lx4/f;->f:Landroid/location/Location;

    invoke-interface {p1, v0}, Lx4/l;->a(Landroid/location/Location;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onLocationChanged(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/location/Location;

    invoke-virtual {p0, v2}, Lx4/f;->onLocationChanged(Landroid/location/Location;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onProviderDisabled(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/f;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    iget-boolean p1, p0, Lx4/f;->e:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lx4/f;->a:Landroid/location/LocationManager;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lx4/f;->i:Lw4/a;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-interface {p1, v0}, Lw4/a;->onError(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lx4/f;->g:Ljava/lang/String;

    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    if-ne p2, p3, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lx4/f;->onProviderDisabled(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_1
    :goto_0
    return-void
.end method
