.class public final Lm9/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls9/f;


# direct methods
.method public constructor <init>(Ls9/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm9/f0;->a:Ls9/f;

    .line 5
    .line 6
    return-void
.end method

.method public static h(Ls8/q;)Lka/C1;
    .locals 5

    .line 1
    iget v0, p0, Ls8/q;->b:I

    .line 2
    .line 3
    div-int/lit16 v0, v0, 0x3e8

    .line 4
    .line 5
    mul-int/lit16 v0, v0, 0x3e8

    .line 6
    .line 7
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lcom/google/protobuf/Timestamp;->newBuilder()Lcom/google/protobuf/Timestamp$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-wide v3, p0, Ls8/q;->a:J

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/Timestamp$Builder;->setSeconds(J)Lcom/google/protobuf/Timestamp$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Lcom/google/protobuf/Timestamp$Builder;->setNanos(I)Lcom/google/protobuf/Timestamp$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v1, p0}, Lka/B1;->o(Lcom/google/protobuf/Timestamp$Builder;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lka/C1;

    .line 33
    .line 34
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LE5/b;)Ls9/l;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lw9/i;->d:Lw9/i;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lw9/j;->b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0, p2}, Lm9/f0;->d(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lka/C1;->v()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0xb

    .line 26
    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    new-instance p1, Ls9/l;

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ls9/l;-><init>(Lka/C1;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    sget-object v0, Lw9/p;->a:Lm9/B;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v0, "Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: "

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p2

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string p2, "Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final b(Ljava/lang/Object;LE5/b;)Lka/C1;
    .locals 1

    .line 1
    sget-object v0, Lw9/i;->d:Lw9/i;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw9/j;->b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1, p2}, Lm9/f0;->d(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final c(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/16 v2, 0x13

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, LE4/n;-><init>(II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0}, LE4/n;->x()LE5/b;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, LE5/b;

    .line 34
    .line 35
    iget-object v4, v4, LE5/b;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, LE4/n;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x1

    .line 41
    const/16 v8, 0xd

    .line 42
    .line 43
    invoke-direct {v5, v4, v6, v7, v8}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3, v5}, Lm9/f0;->b(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object v1
.end method

.method public final d(Ljava/lang/Object;LE5/b;)Lka/C1;
    .locals 11

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    instance-of v2, p1, Ljava/util/Map;

    .line 5
    .line 6
    iget-object v3, p2, LE5/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, LE4/n;

    .line 9
    .line 10
    iget-object v4, p2, LE5/b;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Ls9/j;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    if-eqz v2, :cond_6

    .line 17
    .line 18
    check-cast p1, Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4}, Ls9/e;->h()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p2, v4}, LE5/b;->a(Ls9/j;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {}, Lka/p0;->c()Lka/p0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Lka/B1;->k(Lka/p0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lka/C1;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_1
    invoke-static {}, Lka/p0;->f()Lka/n0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_5

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, Ljava/util/Map$Entry;

    .line 78
    .line 79
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    instance-of v8, v8, Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v8, :cond_4

    .line 86
    .line 87
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    check-cast v8, Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    move-object v9, v5

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {v4, v8}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    check-cast v9, Ls9/j;

    .line 106
    .line 107
    :goto_1
    new-instance v10, LE5/b;

    .line 108
    .line 109
    invoke-direct {v10, v3, v9, v6, v0}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10, v8}, LE5/b;->q(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v7, v10}, Lm9/f0;->d(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-eqz v7, :cond_2

    .line 120
    .line 121
    invoke-virtual {v2, v8, v7}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-array v0, v1, [Ljava/lang/Object;

    .line 130
    .line 131
    aput-object p1, v0, v6

    .line 132
    .line 133
    const-string p1, "Non-String Map key (%s) is not allowed"

    .line 134
    .line 135
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    throw p1

    .line 144
    :cond_5
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1, v2}, Lka/B1;->j(Lka/n0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lka/C1;

    .line 156
    .line 157
    return-object p1

    .line 158
    :cond_6
    instance-of v2, p1, Lm9/x;

    .line 159
    .line 160
    if-eqz v2, :cond_12

    .line 161
    .line 162
    check-cast p1, Lm9/x;

    .line 163
    .line 164
    invoke-virtual {p2}, LE5/b;->h()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_11

    .line 169
    .line 170
    if-eqz v4, :cond_10

    .line 171
    .line 172
    instance-of v0, p1, Lm9/u;

    .line 173
    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    iget p1, v3, LE4/n;->b:I

    .line 177
    .line 178
    const/4 v0, 0x2

    .line 179
    if-ne p1, v0, :cond_7

    .line 180
    .line 181
    invoke-virtual {p2, v4}, LE5/b;->a(Ls9/j;)V

    .line 182
    .line 183
    .line 184
    return-object v5

    .line 185
    :cond_7
    const/4 v0, 0x3

    .line 186
    if-ne p1, v0, :cond_9

    .line 187
    .line 188
    iget-object p1, v4, Ls9/e;->a:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-lez p1, :cond_8

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_8
    move v1, v6

    .line 198
    :goto_2
    const-string p1, "FieldValue.delete() at the top level should have already been handled."

    .line 199
    .line 200
    new-array v0, v6, [Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {v1, p1, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    const-string p1, "FieldValue.delete() can only appear at the top level of your update data"

    .line 206
    .line 207
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    throw p1

    .line 212
    :cond_9
    const-string p1, "FieldValue.delete() can only be used with update() and set() with SetOptions.merge()"

    .line 213
    .line 214
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    throw p1

    .line 219
    :cond_a
    instance-of v0, p1, Lm9/w;

    .line 220
    .line 221
    if-eqz v0, :cond_b

    .line 222
    .line 223
    sget-object p1, Lt9/n;->a:Lt9/n;

    .line 224
    .line 225
    invoke-virtual {p2, v4, p1}, LE5/b;->b(Ls9/j;Lt9/p;)V

    .line 226
    .line 227
    .line 228
    return-object v5

    .line 229
    :cond_b
    instance-of v0, p1, Lm9/t;

    .line 230
    .line 231
    if-eqz v0, :cond_c

    .line 232
    .line 233
    check-cast p1, Lm9/t;

    .line 234
    .line 235
    iget-object p1, p1, Lm9/t;->c:Ljava/util/List;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, Lm9/f0;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    new-instance v0, Lt9/b;

    .line 242
    .line 243
    invoke-direct {v0, p1}, Lt9/c;-><init>(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p2, v4, v0}, LE5/b;->b(Ls9/j;Lt9/p;)V

    .line 247
    .line 248
    .line 249
    return-object v5

    .line 250
    :cond_c
    instance-of v0, p1, Lm9/s;

    .line 251
    .line 252
    if-eqz v0, :cond_d

    .line 253
    .line 254
    check-cast p1, Lm9/s;

    .line 255
    .line 256
    iget-object p1, p1, Lm9/s;->c:Ljava/util/List;

    .line 257
    .line 258
    invoke-virtual {p0, p1}, Lm9/f0;->c(Ljava/util/List;)Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    new-instance v0, Lt9/a;

    .line 263
    .line 264
    invoke-direct {v0, p1}, Lt9/c;-><init>(Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p2, v4, v0}, LE5/b;->b(Ls9/j;Lt9/p;)V

    .line 268
    .line 269
    .line 270
    return-object v5

    .line 271
    :cond_d
    instance-of v0, p1, Lm9/v;

    .line 272
    .line 273
    if-eqz v0, :cond_e

    .line 274
    .line 275
    check-cast p1, Lm9/v;

    .line 276
    .line 277
    iget-object p1, p1, Lm9/v;->c:Ljava/lang/Number;

    .line 278
    .line 279
    invoke-virtual {p0, p1, v6}, Lm9/f0;->f(Ljava/lang/Object;Z)Lka/C1;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    new-instance v0, Lt9/k;

    .line 284
    .line 285
    invoke-direct {v0, p1}, Lt9/k;-><init>(Lka/C1;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2, v4, v0}, LE5/b;->b(Ls9/j;Lt9/p;)V

    .line 289
    .line 290
    .line 291
    return-object v5

    .line 292
    :cond_e
    sget-object p2, Lw9/p;->a:Lm9/B;

    .line 293
    .line 294
    if-nez p1, :cond_f

    .line 295
    .line 296
    const-string p1, "null"

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    :goto_3
    new-array p2, v1, [Ljava/lang/Object;

    .line 308
    .line 309
    aput-object p1, p2, v6

    .line 310
    .line 311
    const-string p1, "Unknown FieldValue type: %s"

    .line 312
    .line 313
    invoke-static {p1, p2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    throw v5

    .line 317
    :cond_10
    invoke-virtual {p1}, Lm9/x;->a()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    const-string v0, "() is not currently supported inside arrays"

    .line 322
    .line 323
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    throw p1

    .line 332
    :cond_11
    invoke-virtual {p1}, Lm9/x;->a()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    const-string v0, "() can only be used with set() and update()"

    .line 337
    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    throw p1

    .line 347
    :cond_12
    if-eqz v4, :cond_13

    .line 348
    .line 349
    invoke-virtual {p2, v4}, LE5/b;->a(Ls9/j;)V

    .line 350
    .line 351
    .line 352
    :cond_13
    instance-of v2, p1, Ljava/util/List;

    .line 353
    .line 354
    if-eqz v2, :cond_18

    .line 355
    .line 356
    iget-boolean v2, p2, LE5/b;->b:Z

    .line 357
    .line 358
    if-eqz v2, :cond_15

    .line 359
    .line 360
    iget v2, v3, LE4/n;->b:I

    .line 361
    .line 362
    const/4 v4, 0x5

    .line 363
    if-ne v2, v4, :cond_14

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_14
    const-string p1, "Nested arrays are not supported"

    .line 367
    .line 368
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    throw p1

    .line 373
    :cond_15
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 374
    .line 375
    invoke-static {}, Lka/g;->g()Lka/f;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_17

    .line 388
    .line 389
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    new-instance v4, LE5/b;

    .line 394
    .line 395
    invoke-direct {v4, v3, v5, v1, v0}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p0, v2, v4}, Lm9/f0;->d(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    if-nez v2, :cond_16

    .line 403
    .line 404
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    sget-object v4, Lcom/google/protobuf/NullValue;->NULL_VALUE:Lcom/google/protobuf/NullValue;

    .line 409
    .line 410
    invoke-virtual {v2, v4}, Lka/B1;->l(Lcom/google/protobuf/NullValue;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Lka/C1;

    .line 418
    .line 419
    :cond_16
    invoke-virtual {p2, v2}, Lka/f;->b(Lka/C1;)V

    .line 420
    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_17
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    invoke-virtual {p1, p2}, Lka/B1;->b(Lka/f;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    check-cast p1, Lka/C1;

    .line 435
    .line 436
    return-object p1

    .line 437
    :cond_18
    if-nez p1, :cond_19

    .line 438
    .line 439
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    sget-object p2, Lcom/google/protobuf/NullValue;->NULL_VALUE:Lcom/google/protobuf/NullValue;

    .line 444
    .line 445
    invoke-virtual {p1, p2}, Lka/B1;->l(Lcom/google/protobuf/NullValue;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    check-cast p1, Lka/C1;

    .line 453
    .line 454
    return-object p1

    .line 455
    :cond_19
    instance-of v0, p1, Ljava/lang/Integer;

    .line 456
    .line 457
    if-eqz v0, :cond_1a

    .line 458
    .line 459
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 460
    .line 461
    .line 462
    move-result-object p2

    .line 463
    check-cast p1, Ljava/lang/Integer;

    .line 464
    .line 465
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result p1

    .line 469
    int-to-long v0, p1

    .line 470
    invoke-virtual {p2, v0, v1}, Lka/B1;->h(J)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    check-cast p1, Lka/C1;

    .line 478
    .line 479
    return-object p1

    .line 480
    :cond_1a
    instance-of v0, p1, Ljava/lang/Long;

    .line 481
    .line 482
    if-eqz v0, :cond_1b

    .line 483
    .line 484
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 485
    .line 486
    .line 487
    move-result-object p2

    .line 488
    check-cast p1, Ljava/lang/Long;

    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 491
    .line 492
    .line 493
    move-result-wide v0

    .line 494
    invoke-virtual {p2, v0, v1}, Lka/B1;->h(J)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    check-cast p1, Lka/C1;

    .line 502
    .line 503
    return-object p1

    .line 504
    :cond_1b
    instance-of v0, p1, Ljava/lang/Float;

    .line 505
    .line 506
    if-eqz v0, :cond_1c

    .line 507
    .line 508
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 509
    .line 510
    .line 511
    move-result-object p2

    .line 512
    check-cast p1, Ljava/lang/Float;

    .line 513
    .line 514
    invoke-virtual {p1}, Ljava/lang/Float;->doubleValue()D

    .line 515
    .line 516
    .line 517
    move-result-wide v0

    .line 518
    invoke-virtual {p2, v0, v1}, Lka/B1;->f(D)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    check-cast p1, Lka/C1;

    .line 526
    .line 527
    return-object p1

    .line 528
    :cond_1c
    instance-of v0, p1, Ljava/lang/Double;

    .line 529
    .line 530
    if-eqz v0, :cond_1d

    .line 531
    .line 532
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 533
    .line 534
    .line 535
    move-result-object p2

    .line 536
    check-cast p1, Ljava/lang/Double;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 539
    .line 540
    .line 541
    move-result-wide v0

    .line 542
    invoke-virtual {p2, v0, v1}, Lka/B1;->f(D)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Lka/C1;

    .line 550
    .line 551
    return-object p1

    .line 552
    :cond_1d
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 553
    .line 554
    if-eqz v0, :cond_1e

    .line 555
    .line 556
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 557
    .line 558
    .line 559
    move-result-object p2

    .line 560
    check-cast p1, Ljava/lang/Boolean;

    .line 561
    .line 562
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 563
    .line 564
    .line 565
    move-result p1

    .line 566
    invoke-virtual {p2, p1}, Lka/B1;->d(Z)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    check-cast p1, Lka/C1;

    .line 574
    .line 575
    return-object p1

    .line 576
    :cond_1e
    instance-of v0, p1, Ljava/lang/String;

    .line 577
    .line 578
    if-eqz v0, :cond_1f

    .line 579
    .line 580
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 581
    .line 582
    .line 583
    move-result-object p2

    .line 584
    check-cast p1, Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {p2, p1}, Lka/B1;->n(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    check-cast p1, Lka/C1;

    .line 594
    .line 595
    return-object p1

    .line 596
    :cond_1f
    instance-of v0, p1, Ljava/util/Date;

    .line 597
    .line 598
    if-eqz v0, :cond_20

    .line 599
    .line 600
    new-instance p2, Ls8/q;

    .line 601
    .line 602
    check-cast p1, Ljava/util/Date;

    .line 603
    .line 604
    invoke-direct {p2, p1}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 605
    .line 606
    .line 607
    invoke-static {p2}, Lm9/f0;->h(Ls8/q;)Lka/C1;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    return-object p1

    .line 612
    :cond_20
    instance-of v0, p1, Ls8/q;

    .line 613
    .line 614
    if-eqz v0, :cond_21

    .line 615
    .line 616
    check-cast p1, Ls8/q;

    .line 617
    .line 618
    invoke-static {p1}, Lm9/f0;->h(Ls8/q;)Lka/C1;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    return-object p1

    .line 623
    :cond_21
    instance-of v0, p1, Lm9/J;

    .line 624
    .line 625
    if-eqz v0, :cond_22

    .line 626
    .line 627
    check-cast p1, Lm9/J;

    .line 628
    .line 629
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 630
    .line 631
    .line 632
    move-result-object p2

    .line 633
    invoke-static {}, LIa/c;->g()LIa/b;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    iget-wide v1, p1, Lm9/J;->a:D

    .line 638
    .line 639
    invoke-virtual {v0, v1, v2}, LIa/b;->a(D)V

    .line 640
    .line 641
    .line 642
    iget-wide v1, p1, Lm9/J;->b:D

    .line 643
    .line 644
    invoke-virtual {v0, v1, v2}, LIa/b;->b(D)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {p2, v0}, Lka/B1;->g(LIa/b;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    check-cast p1, Lka/C1;

    .line 655
    .line 656
    return-object p1

    .line 657
    :cond_22
    instance-of v0, p1, Lm9/g;

    .line 658
    .line 659
    if-eqz v0, :cond_23

    .line 660
    .line 661
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 662
    .line 663
    .line 664
    move-result-object p2

    .line 665
    check-cast p1, Lm9/g;

    .line 666
    .line 667
    iget-object p1, p1, Lm9/g;->a:Lcom/google/protobuf/ByteString;

    .line 668
    .line 669
    invoke-virtual {p2, p1}, Lka/B1;->e(Lcom/google/protobuf/ByteString;)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 673
    .line 674
    .line 675
    move-result-object p1

    .line 676
    check-cast p1, Lka/C1;

    .line 677
    .line 678
    return-object p1

    .line 679
    :cond_23
    instance-of v0, p1, Lm9/m;

    .line 680
    .line 681
    if-eqz v0, :cond_26

    .line 682
    .line 683
    check-cast p1, Lm9/m;

    .line 684
    .line 685
    iget-object v0, p0, Lm9/f0;->a:Ls9/f;

    .line 686
    .line 687
    iget-object v1, v0, Ls9/f;->b:Ljava/lang/String;

    .line 688
    .line 689
    iget-object v2, v0, Ls9/f;->a:Ljava/lang/String;

    .line 690
    .line 691
    iget-object v3, p1, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 692
    .line 693
    if-eqz v3, :cond_25

    .line 694
    .line 695
    iget-object v3, v3, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 696
    .line 697
    invoke-virtual {v3, v0}, Ls9/f;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_24

    .line 702
    .line 703
    goto :goto_6

    .line 704
    :cond_24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 705
    .line 706
    const-string v0, "Document reference is for database "

    .line 707
    .line 708
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    iget-object v0, v3, Ls9/f;->a:Ljava/lang/String;

    .line 712
    .line 713
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    const-string v0, "/"

    .line 717
    .line 718
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    iget-object v3, v3, Ls9/f;->b:Ljava/lang/String;

    .line 722
    .line 723
    const-string v4, " but should be for database "

    .line 724
    .line 725
    invoke-static {p1, v3, v4, v2, v0}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    throw p1

    .line 740
    :cond_25
    :goto_6
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 741
    .line 742
    .line 743
    move-result-object p2

    .line 744
    invoke-virtual {p1}, Lm9/m;->d()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object p1

    .line 748
    const-string v0, "projects/"

    .line 749
    .line 750
    const-string v3, "/databases/"

    .line 751
    .line 752
    const-string v4, "/documents/"

    .line 753
    .line 754
    invoke-static {v0, v2, v3, v1, v4}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object p1

    .line 765
    invoke-virtual {p2, p1}, Lka/B1;->m(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 769
    .line 770
    .line 771
    move-result-object p1

    .line 772
    check-cast p1, Lka/C1;

    .line 773
    .line 774
    return-object p1

    .line 775
    :cond_26
    instance-of v0, p1, Lm9/g0;

    .line 776
    .line 777
    if-eqz v0, :cond_28

    .line 778
    .line 779
    check-cast p1, Lm9/g0;

    .line 780
    .line 781
    invoke-static {}, Lka/p0;->f()Lka/n0;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    const-string v2, "__type__"

    .line 786
    .line 787
    sget-object v3, Ls9/p;->f:Lka/C1;

    .line 788
    .line 789
    invoke-virtual {v0, v2, v3}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 790
    .line 791
    .line 792
    new-instance v2, Ljava/util/ArrayList;

    .line 793
    .line 794
    iget-object p1, p1, Lm9/g0;->a:[D

    .line 795
    .line 796
    array-length v3, p1

    .line 797
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 798
    .line 799
    .line 800
    :goto_7
    array-length v3, p1

    .line 801
    if-ge v6, v3, :cond_27

    .line 802
    .line 803
    aget-wide v3, p1, v6

    .line 804
    .line 805
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    invoke-virtual {v2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    add-int/2addr v6, v1

    .line 813
    goto :goto_7

    .line 814
    :cond_27
    invoke-virtual {p0, v2, p2}, Lm9/f0;->d(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 815
    .line 816
    .line 817
    move-result-object p1

    .line 818
    const-string p2, "value"

    .line 819
    .line 820
    invoke-virtual {v0, p2, p1}, Lka/n0;->b(Ljava/lang/String;Lka/C1;)V

    .line 821
    .line 822
    .line 823
    invoke-static {}, Lka/C1;->w()Lka/B1;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    invoke-virtual {p1, v0}, Lka/B1;->j(Lka/n0;)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 831
    .line 832
    .line 833
    move-result-object p1

    .line 834
    check-cast p1, Lka/C1;

    .line 835
    .line 836
    return-object p1

    .line 837
    :cond_28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-nez v0, :cond_29

    .line 846
    .line 847
    sget-object v0, Lw9/p;->a:Lm9/B;

    .line 848
    .line 849
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    move-result-object p1

    .line 853
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    const-string v0, "Unsupported type: "

    .line 858
    .line 859
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 864
    .line 865
    .line 866
    move-result-object p1

    .line 867
    throw p1

    .line 868
    :cond_29
    const-string p1, "Arrays are not supported; use a List instead"

    .line 869
    .line 870
    invoke-virtual {p2, p1}, LE5/b;->f(Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    throw p1
.end method

.method public final e(Ljava/lang/Object;Lt9/f;)Lmd/J;
    .locals 7

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x13

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, LE4/n;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LE4/n;->x()LE5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, p1, v1}, Lm9/f0;->a(Ljava/lang/Object;LE5/b;)Ls9/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/HashSet;

    .line 20
    .line 21
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    if-eqz p2, :cond_8

    .line 26
    .line 27
    iget-object v2, p2, Lt9/f;->a:Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ls9/j;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Ls9/j;

    .line 60
    .line 61
    invoke-virtual {v4, v6}, Ls9/e;->i(Ls9/e;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Lt9/g;

    .line 83
    .line 84
    iget-object v6, v6, Lt9/g;->a:Ls9/j;

    .line 85
    .line 86
    invoke-virtual {v4, v6}, Ls9/e;->i(Ls9/e;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    new-instance p2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, "Field \'"

    .line 98
    .line 99
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ls9/j;->c()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, "\' is specified in your field mask but not in your input data."

    .line 110
    .line 111
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lt9/g;

    .line 142
    .line 143
    iget-object v4, v3, Lt9/g;->a:Ls9/j;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_5

    .line 154
    .line 155
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    check-cast v6, Ls9/j;

    .line 160
    .line 161
    invoke-virtual {v6, v4}, Ls9/e;->i(Ls9/e;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_6

    .line 166
    .line 167
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    new-instance v0, Lmd/J;

    .line 172
    .line 173
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-direct {v0, p1, p2, v1}, Lmd/J;-><init>(Ls9/l;Lt9/f;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_8
    new-instance p2, Lmd/J;

    .line 182
    .line 183
    new-instance v2, Lt9/f;

    .line 184
    .line 185
    invoke-direct {v2, v1}, Lt9/f;-><init>(Ljava/util/HashSet;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p2, p1, v2, v0}, Lmd/J;-><init>(Ls9/l;Lt9/f;Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    return-object p2
.end method

.method public final f(Ljava/lang/Object;Z)Lka/C1;
    .locals 4

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x5

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x4

    .line 8
    :goto_0
    const/16 v1, 0x13

    .line 9
    .line 10
    invoke-direct {v0, p2, v1}, LE4/n;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LE4/n;->x()LE5/b;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0, p1, p2}, Lm9/f0;->b(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x0

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, p2

    .line 27
    :goto_1
    const-string v2, "Parsed data should not be null."

    .line 28
    .line 29
    new-array v3, p2, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v1, v2, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const-string v1, "Field transforms should have been disallowed."

    .line 43
    .line 44
    new-array p2, p2, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v0, v1, p2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object p1
.end method

.method public final g(Ljava/lang/Object;)Lmd/J;
    .locals 3

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x13

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, LE4/n;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LE4/n;->x()LE5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, p1, v1}, Lm9/f0;->a(Ljava/lang/Object;LE5/b;)Ls9/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v1, Lmd/J;

    .line 18
    .line 19
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p1, v2, v0}, Lmd/J;-><init>(Ls9/l;Lt9/f;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public final i(Ljava/util/Map;)Lne/a;
    .locals 6

    .line 1
    new-instance v0, LE4/n;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x13

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, LE4/n;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LE4/n;->x()LE5/b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ls9/l;

    .line 14
    .line 15
    invoke-direct {v2}, Ls9/l;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v4}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    instance-of v5, v3, Lm9/u;

    .line 53
    .line 54
    iget-object v4, v4, Lm9/r;->a:Ls9/j;

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1, v4}, LE5/b;->a(Ls9/j;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v1, v4}, LE5/b;->c(Ls9/j;)LE5/b;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {p0, v3, v5}, Lm9/f0;->b(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    invoke-virtual {v1, v4}, LE5/b;->a(Ls9/j;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3, v4}, Ls9/l;->g(Lka/C1;Ls9/j;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    new-instance p1, Lne/a;

    .line 80
    .line 81
    iget-object v1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Ljava/util/HashSet;

    .line 84
    .line 85
    new-instance v3, Lt9/f;

    .line 86
    .line 87
    invoke-direct {v3, v1}, Lt9/f;-><init>(Ljava/util/HashSet;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p1, v2, v3, v0}, Lne/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object p1
.end method
