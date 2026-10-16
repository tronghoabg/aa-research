.class public abstract Lcom/google/protobuf/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;

.field public static final c:Lcom/google/protobuf/c2;

.field public static final d:Z

.field public static final e:Z

.field public static final f:J

.field public static final g:J

.field public static final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    invoke-static {}, Lcom/google/protobuf/d2;->j()Lsun/misc/Unsafe;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sput-object v6, Lcom/google/protobuf/d2;->a:Lsun/misc/Unsafe;

    .line 14
    .line 15
    sget-object v7, Lcom/google/protobuf/c;->a:Ljava/lang/Class;

    .line 16
    .line 17
    sput-object v7, Lcom/google/protobuf/d2;->b:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/google/protobuf/d2;->g(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    invoke-static {v0}, Lcom/google/protobuf/d2;->g(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    const/4 v9, 0x0

    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    :cond_0
    move-object v7, v9

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-eqz v7, :cond_2

    .line 33
    .line 34
    new-instance v7, Lcom/google/protobuf/b2;

    .line 35
    .line 36
    invoke-direct {v7, v6, v5}, Lcom/google/protobuf/b2;-><init>(Lsun/misc/Unsafe;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    if-eqz v8, :cond_0

    .line 41
    .line 42
    new-instance v7, Lcom/google/protobuf/b2;

    .line 43
    .line 44
    invoke-direct {v7, v6, v4}, Lcom/google/protobuf/b2;-><init>(Lsun/misc/Unsafe;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sput-object v7, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 48
    .line 49
    if-nez v7, :cond_3

    .line 50
    .line 51
    move v6, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {v7}, Lcom/google/protobuf/c2;->u()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    :goto_1
    sput-boolean v6, Lcom/google/protobuf/d2;->d:Z

    .line 58
    .line 59
    if-nez v7, :cond_4

    .line 60
    .line 61
    :goto_2
    move v0, v4

    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_4
    const-class v6, Ljava/lang/Class;

    .line 65
    .line 66
    const-class v8, Ljava/lang/Object;

    .line 67
    .line 68
    iget-object v10, v7, Lcom/google/protobuf/c2;->a:Lsun/misc/Unsafe;

    .line 69
    .line 70
    if-nez v10, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    const-string v11, "objectFieldOffset"

    .line 78
    .line 79
    new-array v12, v5, [Ljava/lang/Class;

    .line 80
    .line 81
    const-class v13, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    aput-object v13, v12, v4

    .line 84
    .line 85
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    const-string v11, "arrayBaseOffset"

    .line 89
    .line 90
    new-array v12, v5, [Ljava/lang/Class;

    .line 91
    .line 92
    aput-object v6, v12, v4

    .line 93
    .line 94
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 95
    .line 96
    .line 97
    const-string v11, "arrayIndexScale"

    .line 98
    .line 99
    new-array v12, v5, [Ljava/lang/Class;

    .line 100
    .line 101
    aput-object v6, v12, v4

    .line 102
    .line 103
    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    const-string v6, "getInt"

    .line 107
    .line 108
    new-array v11, v3, [Ljava/lang/Class;

    .line 109
    .line 110
    aput-object v8, v11, v4

    .line 111
    .line 112
    aput-object v1, v11, v5

    .line 113
    .line 114
    invoke-virtual {v10, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    const-string v6, "putInt"

    .line 118
    .line 119
    new-array v11, v2, [Ljava/lang/Class;

    .line 120
    .line 121
    aput-object v8, v11, v4

    .line 122
    .line 123
    aput-object v1, v11, v5

    .line 124
    .line 125
    aput-object v0, v11, v3

    .line 126
    .line 127
    invoke-virtual {v10, v6, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    const-string v0, "getLong"

    .line 131
    .line 132
    new-array v6, v3, [Ljava/lang/Class;

    .line 133
    .line 134
    aput-object v8, v6, v4

    .line 135
    .line 136
    aput-object v1, v6, v5

    .line 137
    .line 138
    invoke-virtual {v10, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    const-string v0, "putLong"

    .line 142
    .line 143
    new-array v6, v2, [Ljava/lang/Class;

    .line 144
    .line 145
    aput-object v8, v6, v4

    .line 146
    .line 147
    aput-object v1, v6, v5

    .line 148
    .line 149
    aput-object v1, v6, v3

    .line 150
    .line 151
    invoke-virtual {v10, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    const-string v0, "getObject"

    .line 155
    .line 156
    new-array v6, v3, [Ljava/lang/Class;

    .line 157
    .line 158
    aput-object v8, v6, v4

    .line 159
    .line 160
    aput-object v1, v6, v5

    .line 161
    .line 162
    invoke-virtual {v10, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    const-string v0, "putObject"

    .line 166
    .line 167
    new-array v2, v2, [Ljava/lang/Class;

    .line 168
    .line 169
    aput-object v8, v2, v4

    .line 170
    .line 171
    aput-object v1, v2, v5

    .line 172
    .line 173
    aput-object v8, v2, v3

    .line 174
    .line 175
    invoke-virtual {v10, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .line 177
    .line 178
    move v0, v5

    .line 179
    goto :goto_3

    .line 180
    :catchall_0
    move-exception v0

    .line 181
    invoke-static {v0}, Lcom/google/protobuf/d2;->a(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :goto_3
    sput-boolean v0, Lcom/google/protobuf/d2;->e:Z

    .line 186
    .line 187
    const-class v0, [B

    .line 188
    .line 189
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    int-to-long v2, v0

    .line 194
    sput-wide v2, Lcom/google/protobuf/d2;->f:J

    .line 195
    .line 196
    const-class v0, [Z

    .line 197
    .line 198
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 202
    .line 203
    .line 204
    const-class v0, [I

    .line 205
    .line 206
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 207
    .line 208
    .line 209
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 210
    .line 211
    .line 212
    const-class v0, [J

    .line 213
    .line 214
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 215
    .line 216
    .line 217
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 218
    .line 219
    .line 220
    const-class v0, [F

    .line 221
    .line 222
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 226
    .line 227
    .line 228
    const-class v0, [D

    .line 229
    .line 230
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 231
    .line 232
    .line 233
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 234
    .line 235
    .line 236
    const-class v0, [Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v0}, Lcom/google/protobuf/d2;->d(Ljava/lang/Class;)I

    .line 239
    .line 240
    .line 241
    invoke-static {v0}, Lcom/google/protobuf/d2;->e(Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    const-class v0, Ljava/nio/Buffer;

    .line 245
    .line 246
    const-string v2, "effectiveDirectAddress"

    .line 247
    .line 248
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 249
    .line 250
    .line 251
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 252
    goto :goto_4

    .line 253
    :catchall_1
    move-object v2, v9

    .line 254
    :goto_4
    if-eqz v2, :cond_6

    .line 255
    .line 256
    move-object v9, v2

    .line 257
    goto :goto_6

    .line 258
    :cond_6
    const-string v2, "address"

    .line 259
    .line 260
    :try_start_2
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 261
    .line 262
    .line 263
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 264
    goto :goto_5

    .line 265
    :catchall_2
    move-object v0, v9

    .line 266
    :goto_5
    if-eqz v0, :cond_7

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    if-ne v2, v1, :cond_7

    .line 273
    .line 274
    move-object v9, v0

    .line 275
    :cond_7
    :goto_6
    if-eqz v9, :cond_9

    .line 276
    .line 277
    if-nez v7, :cond_8

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_8
    invoke-virtual {v7, v9}, Lcom/google/protobuf/c2;->l(Ljava/lang/reflect/Field;)J

    .line 281
    .line 282
    .line 283
    move-result-wide v0

    .line 284
    goto :goto_8

    .line 285
    :cond_9
    :goto_7
    const-wide/16 v0, -0x1

    .line 286
    .line 287
    :goto_8
    sput-wide v0, Lcom/google/protobuf/d2;->g:J

    .line 288
    .line 289
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 294
    .line 295
    if-ne v0, v1, :cond_a

    .line 296
    .line 297
    move v4, v5

    .line 298
    :cond_a
    sput-boolean v4, Lcom/google/protobuf/d2;->h:Z

    .line 299
    .line 300
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const-class v0, Lcom/google/protobuf/d2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "platform method missing - proto runtime falling back to safer methods: "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static b(Ljava/nio/ByteBuffer;)J
    .locals 3

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    sget-wide v1, Lcom/google/protobuf/d2;->g:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2, p0}, Lcom/google/protobuf/c2;->j(JLjava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public static c(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/protobuf/d2;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public static d(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/d2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/c2;->a(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public static e(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/d2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/google/protobuf/c2;->b(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static f(J[BJJ)V
    .locals 8

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    move-wide v1, p0

    .line 4
    move-object v3, p2

    .line 5
    move-wide v4, p3

    .line 6
    move-wide v6, p5

    .line 7
    invoke-virtual/range {v0 .. v7}, Lcom/google/protobuf/c2;->c(J[BJJ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static g(Ljava/lang/Class;)Z
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    const-class v5, [B

    .line 7
    .line 8
    sget-object v6, Lcom/google/protobuf/c;->a:Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v6, Lcom/google/protobuf/d2;->b:Ljava/lang/Class;

    .line 11
    .line 12
    const-string v7, "peekLong"

    .line 13
    .line 14
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    new-array v9, v2, [Ljava/lang/Class;

    .line 17
    .line 18
    aput-object p0, v9, v4

    .line 19
    .line 20
    aput-object v8, v9, v3

    .line 21
    .line 22
    invoke-virtual {v6, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    const-string v7, "pokeLong"

    .line 26
    .line 27
    new-array v9, v1, [Ljava/lang/Class;

    .line 28
    .line 29
    aput-object p0, v9, v4

    .line 30
    .line 31
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    aput-object v10, v9, v3

    .line 34
    .line 35
    aput-object v8, v9, v2

    .line 36
    .line 37
    invoke-virtual {v6, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    const-string v7, "pokeInt"

    .line 41
    .line 42
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    new-array v10, v1, [Ljava/lang/Class;

    .line 45
    .line 46
    aput-object p0, v10, v4

    .line 47
    .line 48
    aput-object v9, v10, v3

    .line 49
    .line 50
    aput-object v8, v10, v2

    .line 51
    .line 52
    invoke-virtual {v6, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    const-string v7, "peekInt"

    .line 56
    .line 57
    new-array v10, v2, [Ljava/lang/Class;

    .line 58
    .line 59
    aput-object p0, v10, v4

    .line 60
    .line 61
    aput-object v8, v10, v3

    .line 62
    .line 63
    invoke-virtual {v6, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    const-string v7, "pokeByte"

    .line 67
    .line 68
    new-array v8, v2, [Ljava/lang/Class;

    .line 69
    .line 70
    aput-object p0, v8, v4

    .line 71
    .line 72
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    aput-object v10, v8, v3

    .line 75
    .line 76
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    const-string v7, "peekByte"

    .line 80
    .line 81
    new-array v8, v3, [Ljava/lang/Class;

    .line 82
    .line 83
    aput-object p0, v8, v4

    .line 84
    .line 85
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    const-string v7, "pokeByteArray"

    .line 89
    .line 90
    new-array v8, v0, [Ljava/lang/Class;

    .line 91
    .line 92
    aput-object p0, v8, v4

    .line 93
    .line 94
    aput-object v5, v8, v3

    .line 95
    .line 96
    aput-object v9, v8, v2

    .line 97
    .line 98
    aput-object v9, v8, v1

    .line 99
    .line 100
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    const-string v7, "peekByteArray"

    .line 104
    .line 105
    new-array v0, v0, [Ljava/lang/Class;

    .line 106
    .line 107
    aput-object p0, v0, v4

    .line 108
    .line 109
    aput-object v5, v0, v3

    .line 110
    .line 111
    aput-object v9, v0, v2

    .line 112
    .line 113
    aput-object v9, v0, v1

    .line 114
    .line 115
    invoke-virtual {v6, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    return v3

    .line 119
    :catchall_0
    return v4
.end method

.method public static h(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/protobuf/c2;->i(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    not-long p0, p0

    .line 11
    const-wide/16 v0, 0x3

    .line 12
    .line 13
    and-long/2addr p0, v0

    .line 14
    const/4 v0, 0x3

    .line 15
    shl-long/2addr p0, v0

    .line 16
    long-to-int p0, p0

    .line 17
    ushr-int p0, p2, p0

    .line 18
    .line 19
    and-int/lit16 p0, p0, 0xff

    .line 20
    .line 21
    int-to-byte p0, p0

    .line 22
    return p0
.end method

.method public static i(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Lcom/google/protobuf/c2;->i(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const-wide/16 v0, 0x3

    .line 11
    .line 12
    and-long/2addr p0, v0

    .line 13
    const/4 v0, 0x3

    .line 14
    shl-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    ushr-int p0, p2, p0

    .line 17
    .line 18
    and-int/lit16 p0, p0, 0xff

    .line 19
    .line 20
    int-to-byte p0, p0

    .line 21
    return p0
.end method

.method public static j()Lsun/misc/Unsafe;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/protobuf/a2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :catchall_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public static k(BJ)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/c2;->n(BJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static l([BJB)V
    .locals 2

    .line 1
    sget-wide v0, Lcom/google/protobuf/d2;->f:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    sget-object p1, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 5
    .line 6
    invoke-virtual {p1, p0, v0, v1, p3}, Lcom/google/protobuf/c2;->o(Ljava/lang/Object;JB)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static m(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/protobuf/c2;->i(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    not-int p1, p1

    .line 12
    and-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    shl-int/lit8 p1, p1, 0x3

    .line 15
    .line 16
    const/16 p2, 0xff

    .line 17
    .line 18
    shl-int v3, p2, p1

    .line 19
    .line 20
    not-int v3, v3

    .line 21
    and-int/2addr v2, v3

    .line 22
    and-int/2addr p2, p3

    .line 23
    shl-int p1, p2, p1

    .line 24
    .line 25
    or-int/2addr p1, v2

    .line 26
    invoke-static {v0, v1, p0, p1}, Lcom/google/protobuf/d2;->o(JLjava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static n(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Lcom/google/protobuf/c2;->i(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    and-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    const/16 p2, 0xff

    .line 16
    .line 17
    shl-int v3, p2, p1

    .line 18
    .line 19
    not-int v3, v3

    .line 20
    and-int/2addr v2, v3

    .line 21
    and-int/2addr p2, p3

    .line 22
    shl-int p1, p2, p1

    .line 23
    .line 24
    or-int/2addr p1, v2

    .line 25
    invoke-static {v0, v1, p0, p1}, Lcom/google/protobuf/d2;->o(JLjava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static o(JLjava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/c2;->r(JLjava/lang/Object;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static p(Ljava/lang/Object;JJ)V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move-wide v4, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/c2;->s(Ljava/lang/Object;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static q(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/d2;->c:Lcom/google/protobuf/c2;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/c2;->t(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
