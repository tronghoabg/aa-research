.class public final LVa/B7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public a:LVa/b8;

.field public b:LVa/f0;

.field public c:LVa/Z7;

.field public d:LVa/Z0;

.field public e:Landroid/content/Context;

.field public f:Ljava/util/ArrayList;

.field public g:LVa/Xa;


# direct methods
.method public static k(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x1f629a782304a835L    # 1.6937312433456E-157

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method


# virtual methods
.method public final a()LVa/f0;
    .locals 2

    .line 1
    sget v0, LVa/B7;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B7;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x39

    .line 14
    .line 15
    rem-int/lit16 v0, v1, 0x80

    .line 16
    .line 17
    sput v0, LVa/B7;->i:I

    .line 18
    .line 19
    rem-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    iget-object v0, p0, LVa/B7;->b:LVa/f0;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x34

    .line 26
    .line 27
    div-int/lit8 v1, v1, 0x0

    .line 28
    .line 29
    :cond_0
    return-object v0

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    throw v0
.end method

.method public final declared-synchronized b()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/B7;->h:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x73

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/B7;->i:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/B7;->d:LVa/Z0;

    .line 11
    .line 12
    invoke-virtual {v0}, LVa/Z0;->q0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, LVa/B7;->i:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x35

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x80

    .line 21
    .line 22
    sput v1, LVa/B7;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return v0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public final declared-synchronized c()Ljava/util/ArrayList;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/B7;->h:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x77

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/B7;->i:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, LVa/B7;->f:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v1, p0, LVa/B7;->f:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    sget v1, LVa/B7;->h:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x37

    .line 37
    .line 38
    rem-int/lit16 v1, v1, 0x80

    .line 39
    .line 40
    sput v1, LVa/B7;->i:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    monitor-exit p0

    .line 43
    return-object v0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    :try_start_3
    throw v0

    .line 48
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B7;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LVa/B7;->h()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0x2d

    .line 24
    .line 25
    div-int/2addr v4, v2

    .line 26
    if-nez v3, :cond_5

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, LVa/B7;->h()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_5

    .line 38
    .line 39
    :goto_0
    sget v3, LVa/B7;->i:I

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x51

    .line 42
    .line 43
    rem-int/lit16 v4, v3, 0x80

    .line 44
    .line 45
    sput v4, LVa/B7;->h:I

    .line 46
    .line 47
    rem-int/lit8 v3, v3, 0x2

    .line 48
    .line 49
    const v4, 0xab01

    .line 50
    .line 51
    .line 52
    const-string v5, "\ua870\u037a\ufe76\ua974\u047d\uff75\uaa77"

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    const/high16 v3, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {v2, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    cmpl-float v3, v6, v3

    .line 63
    .line 64
    mul-int/2addr v3, v4

    .line 65
    invoke-static {v3, v5}, LVa/B7;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const/4 v3, 0x0

    .line 81
    invoke-static {v2, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    cmpl-float v3, v6, v3

    .line 86
    .line 87
    add-int/2addr v3, v4

    .line 88
    invoke-static {v3, v5}, LVa/B7;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_5

    .line 101
    .line 102
    :goto_1
    const-string v3, ""

    .line 103
    .line 104
    const/16 v4, 0x30

    .line 105
    .line 106
    invoke-static {v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const v4, 0xa37a

    .line 111
    .line 112
    .line 113
    sub-int/2addr v4, v3

    .line 114
    const-string v3, "\ua871\u0b07\uee90\u4205\u259b\u991e\u7c92\ud02c"

    .line 115
    .line 116
    invoke-static {v4, v3}, LVa/B7;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const/4 v3, 0x1

    .line 129
    if-eq v0, v3, :cond_5

    .line 130
    .line 131
    invoke-virtual {p0}, LVa/B7;->h()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v3, p0, LVa/B7;->a:LVa/b8;

    .line 136
    .line 137
    iget-object v4, v3, LVa/b8;->h:Ljava/lang/String;

    .line 138
    .line 139
    if-nez v4, :cond_4

    .line 140
    .line 141
    sget v4, LVa/b8;->n:I

    .line 142
    .line 143
    add-int/lit8 v4, v4, 0x9

    .line 144
    .line 145
    rem-int/lit16 v4, v4, 0x80

    .line 146
    .line 147
    sput v4, LVa/b8;->m:I

    .line 148
    .line 149
    iget-object v4, v3, LVa/b8;->a:Lorg/json/JSONObject;

    .line 150
    .line 151
    const/16 v5, 0xa

    .line 152
    .line 153
    new-array v5, v5, [I

    .line 154
    .line 155
    fill-array-data v5, :array_0

    .line 156
    .line 157
    .line 158
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    add-int/lit8 v2, v2, 0x12

    .line 163
    .line 164
    invoke-static {v2, v5}, LVa/b8;->f(I[I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v2}, LVa/Ab;->N(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    if-eqz v2, :cond_4

    .line 181
    .line 182
    new-instance v4, Ljava/util/ArrayList;

    .line 183
    .line 184
    check-cast v2, Ljava/util/HashMap;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 191
    .line 192
    .line 193
    new-instance v5, LA7/R0;

    .line 194
    .line 195
    const/4 v6, 0x6

    .line 196
    invoke-direct {v5, v6}, LA7/R0;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-nez v5, :cond_2

    .line 211
    .line 212
    iput-object v1, v3, LVa/b8;->h:Ljava/lang/String;

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_2
    sget v5, LVa/b8;->m:I

    .line 216
    .line 217
    add-int/lit8 v5, v5, 0x6b

    .line 218
    .line 219
    rem-int/lit16 v5, v5, 0x80

    .line 220
    .line 221
    sput v5, LVa/b8;->n:I

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    check-cast v5, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v0, v5}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-ltz v6, :cond_3

    .line 234
    .line 235
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/String;

    .line 240
    .line 241
    :cond_3
    sget v5, LVa/b8;->m:I

    .line 242
    .line 243
    add-int/lit8 v5, v5, 0xf

    .line 244
    .line 245
    rem-int/lit16 v5, v5, 0x80

    .line 246
    .line 247
    sput v5, LVa/b8;->n:I

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_4
    :goto_3
    iget-object v0, v3, LVa/b8;->h:Ljava/lang/String;

    .line 251
    .line 252
    return-object v0

    .line 253
    :cond_5
    return-object v1

    .line 254
    nop

    .line 255
    :array_0
    .array-data 4
        0x225fc2c9
        0xb89c13
        0x370de68b
        0x7e96fb3a
        0x4a984e85    # 4990786.5f
        -0x39759b4
        -0x1ef939a5
        0xe93f1b5
        0x7190611a
        0x3f12408
    .end array-data
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->a:LVa/b8;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LVa/b8;->m:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x5d

    .line 17
    .line 18
    rem-int/lit16 v1, v1, 0x80

    .line 19
    .line 20
    sput v1, LVa/b8;->n:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x9

    .line 23
    .line 24
    rem-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    sput v2, LVa/b8;->m:I

    .line 27
    .line 28
    rem-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    sget v1, LVa/B7;->i:I

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x63

    .line 36
    .line 37
    rem-int/lit16 v3, v1, 0x80

    .line 38
    .line 39
    sput v3, LVa/B7;->h:I

    .line 40
    .line 41
    rem-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    iget-object v0, v0, LVa/b8;->g:Ljava/lang/String;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_0
    throw v2

    .line 49
    :cond_1
    throw v2
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->a:LVa/b8;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LVa/b8;->m:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x5b

    .line 17
    .line 18
    rem-int/lit16 v2, v1, 0x80

    .line 19
    .line 20
    sput v2, LVa/b8;->n:I

    .line 21
    .line 22
    rem-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/16 v1, 0x11

    .line 27
    .line 28
    div-int/lit8 v1, v1, 0x0

    .line 29
    .line 30
    :cond_0
    add-int/lit8 v2, v2, 0x21

    .line 31
    .line 32
    rem-int/lit16 v2, v2, 0x80

    .line 33
    .line 34
    sput v2, LVa/b8;->m:I

    .line 35
    .line 36
    sget v1, LVa/B7;->i:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x67

    .line 39
    .line 40
    rem-int/lit16 v2, v1, 0x80

    .line 41
    .line 42
    sput v2, LVa/B7;->h:I

    .line 43
    .line 44
    rem-int/lit8 v1, v1, 0x2

    .line 45
    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    iget-object v0, v0, LVa/b8;->f:Ljava/lang/String;

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    .line 52
    throw v0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/B7;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->h:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->d:LVa/Z0;

    .line 10
    .line 11
    invoke-virtual {v0}, LVa/Z0;->u0()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget v1, LVa/B7;->h:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x43

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, LVa/B7;->i:I

    .line 22
    .line 23
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->d:LVa/Z0;

    .line 10
    .line 11
    invoke-virtual {v0}, LVa/Z0;->x0()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget v1, LVa/B7;->h:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x23

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, LVa/B7;->i:I

    .line 22
    .line 23
    return-object v0
.end method

.method public final i()V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget v0, LVa/B7;->i:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x25

    .line 6
    .line 7
    rem-int/lit16 v2, v0, 0x80

    .line 8
    .line 9
    sput v2, LVa/B7;->h:I

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    rem-int/2addr v0, v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v1, LVa/B7;->a:LVa/b8;

    .line 17
    .line 18
    invoke-virtual {v0}, LVa/b8;->a()LVa/Xa;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/16 v4, 0x33

    .line 23
    .line 24
    div-int/2addr v4, v3

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, v1, LVa/B7;->a:LVa/b8;

    .line 29
    .line 30
    invoke-virtual {v0}, LVa/b8;->a()LVa/Xa;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    :goto_0
    sget v4, LVa/B7;->h:I

    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x67

    .line 39
    .line 40
    rem-int/lit16 v5, v4, 0x80

    .line 41
    .line 42
    sput v5, LVa/B7;->i:I

    .line 43
    .line 44
    rem-int/2addr v4, v2

    .line 45
    invoke-virtual {v1, v0}, LVa/B7;->l(LVa/Xa;)V

    .line 46
    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    const/16 v4, 0x40

    .line 51
    .line 52
    div-int/2addr v4, v3

    .line 53
    :cond_1
    sget v4, LVa/B7;->h:I

    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x15

    .line 56
    .line 57
    rem-int/lit16 v4, v4, 0x80

    .line 58
    .line 59
    sput v4, LVa/B7;->i:I

    .line 60
    .line 61
    iget-object v4, v1, LVa/B7;->d:LVa/Z0;

    .line 62
    .line 63
    invoke-virtual {v4}, LVa/Z0;->r0()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    sget v4, LVa/z;->k:I

    .line 70
    .line 71
    sput-object v0, LVa/z;->i:LVa/Xa;

    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x2f

    .line 74
    .line 75
    rem-int/lit16 v4, v4, 0x80

    .line 76
    .line 77
    sput v4, LVa/z;->j:I

    .line 78
    .line 79
    :cond_2
    iget-object v0, v1, LVa/B7;->a:LVa/b8;

    .line 80
    .line 81
    invoke-virtual {v0}, LVa/b8;->b()LVa/x8;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v4, "\ua85b\u5dd7\u4347\u48d5\u7e4f\u63df\u6965\u1ed2\u0444\u09ca\u3f4c\u24f1"

    .line 86
    .line 87
    const-string v5, ""

    .line 88
    .line 89
    const/16 v6, 0x30

    .line 90
    .line 91
    invoke-static {v5, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    const v7, 0xf582

    .line 96
    .line 97
    .line 98
    sub-int/2addr v7, v5

    .line 99
    invoke-static {v7, v4}, LVa/B7;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v5, v1, LVa/B7;->d:LVa/Z0;

    .line 108
    .line 109
    invoke-virtual {v0, v5, v4}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v1, LVa/B7;->a:LVa/b8;

    .line 113
    .line 114
    invoke-virtual {v0}, LVa/b8;->c()Ljava/util/HashMap;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v7, 0x3

    .line 132
    const/4 v8, 0x1

    .line 133
    if-eqz v4, :cond_7

    .line 134
    .line 135
    sget v4, LVa/B7;->i:I

    .line 136
    .line 137
    add-int/lit8 v4, v4, 0x71

    .line 138
    .line 139
    rem-int/lit16 v4, v4, 0x80

    .line 140
    .line 141
    sput v4, LVa/B7;->h:I

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, Ljava/lang/String;

    .line 148
    .line 149
    iget-object v9, v1, LVa/B7;->a:LVa/b8;

    .line 150
    .line 151
    invoke-virtual {v9}, LVa/b8;->c()Ljava/util/HashMap;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, LVa/g8;

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    sget v9, LVa/g8;->j:I

    .line 165
    .line 166
    add-int/2addr v9, v7

    .line 167
    rem-int/lit16 v7, v9, 0x80

    .line 168
    .line 169
    sput v7, LVa/g8;->i:I

    .line 170
    .line 171
    rem-int/2addr v9, v2

    .line 172
    iget-boolean v7, v4, LVa/g8;->c:Z

    .line 173
    .line 174
    if-eqz v9, :cond_4

    .line 175
    .line 176
    const/16 v9, 0x34

    .line 177
    .line 178
    div-int/2addr v9, v3

    .line 179
    :cond_4
    if-nez v7, :cond_3

    .line 180
    .line 181
    invoke-virtual {v1, v4}, LVa/B7;->m(LVa/g8;)LVa/ha;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v7, LVa/y7;

    .line 186
    .line 187
    iget-object v9, v1, LVa/B7;->c:LVa/Z7;

    .line 188
    .line 189
    iget-object v10, v1, LVa/B7;->d:LVa/Z0;

    .line 190
    .line 191
    iget-object v11, v1, LVa/B7;->a:LVa/b8;

    .line 192
    .line 193
    invoke-virtual {v11}, LVa/b8;->b()LVa/x8;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 198
    .line 199
    .line 200
    iput-object v5, v7, LVa/y7;->f:LVa/v7;

    .line 201
    .line 202
    iput-object v4, v7, LVa/y7;->a:LVa/ha;

    .line 203
    .line 204
    new-instance v12, LVa/x8;

    .line 205
    .line 206
    new-instance v13, Ljava/util/HashMap;

    .line 207
    .line 208
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-direct {v12, v13, v11, v8}, LVa/x8;-><init>(Ljava/util/HashMap;LVa/x8;Z)V

    .line 212
    .line 213
    .line 214
    iput-object v12, v7, LVa/y7;->b:LVa/x8;

    .line 215
    .line 216
    invoke-virtual {v7}, LVa/y7;->h()LVa/ha;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-virtual {v8}, LVa/ha;->g()Ljava/util/ArrayList;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-virtual {v12, v8}, LVa/x8;->g(Ljava/util/List;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, LVa/ha;->b()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v11, v7, v4}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iput-object v9, v7, LVa/y7;->c:LVa/Z7;

    .line 235
    .line 236
    iput-object v10, v7, LVa/y7;->d:LVa/Z0;

    .line 237
    .line 238
    new-instance v4, LVa/Ra;

    .line 239
    .line 240
    invoke-direct {v4, v7}, LVa/Ra;-><init>(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    sget v8, LVa/y7;->l:I

    .line 244
    .line 245
    add-int/lit8 v8, v8, 0x61

    .line 246
    .line 247
    rem-int/lit16 v8, v8, 0x80

    .line 248
    .line 249
    sput v8, LVa/y7;->m:I

    .line 250
    .line 251
    iput-object v4, v7, LVa/y7;->e:LVa/Ra;

    .line 252
    .line 253
    iput-object v1, v7, LVa/y7;->h:LVa/B7;

    .line 254
    .line 255
    new-instance v4, LVa/ba;

    .line 256
    .line 257
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 258
    .line 259
    .line 260
    new-instance v8, Ljava/util/HashMap;

    .line 261
    .line 262
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 263
    .line 264
    .line 265
    iput-object v8, v4, LVa/ba;->a:Ljava/lang/Object;

    .line 266
    .line 267
    new-instance v8, Ljava/util/HashMap;

    .line 268
    .line 269
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 270
    .line 271
    .line 272
    iput-object v8, v4, LVa/ba;->b:Ljava/lang/Object;

    .line 273
    .line 274
    new-instance v8, Ljava/util/HashMap;

    .line 275
    .line 276
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 277
    .line 278
    .line 279
    iput-object v8, v4, LVa/ba;->c:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object v4, v7, LVa/y7;->j:LVa/ba;

    .line 282
    .line 283
    sget v4, LVa/B7;->i:I

    .line 284
    .line 285
    add-int/lit8 v4, v4, 0x67

    .line 286
    .line 287
    rem-int/lit16 v8, v4, 0x80

    .line 288
    .line 289
    sput v8, LVa/B7;->h:I

    .line 290
    .line 291
    rem-int/2addr v4, v2

    .line 292
    iget-object v8, v1, LVa/B7;->f:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    if-nez v4, :cond_6

    .line 298
    .line 299
    sget v4, LVa/B7;->i:I

    .line 300
    .line 301
    add-int/lit8 v4, v4, 0x4b

    .line 302
    .line 303
    rem-int/lit16 v7, v4, 0x80

    .line 304
    .line 305
    sput v7, LVa/B7;->h:I

    .line 306
    .line 307
    rem-int/2addr v4, v2

    .line 308
    if-nez v4, :cond_5

    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_5
    throw v5

    .line 313
    :cond_6
    throw v5

    .line 314
    :cond_7
    monitor-enter p0

    .line 315
    :try_start_0
    iget-object v0, v1, LVa/B7;->d:LVa/Z0;

    .line 316
    .line 317
    invoke-virtual {v0}, LVa/Z0;->q0()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_8

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_8
    invoke-virtual {v1}, LVa/B7;->c()Ljava/util/ArrayList;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_9

    .line 337
    .line 338
    sget v4, LVa/B7;->h:I

    .line 339
    .line 340
    add-int/lit8 v4, v4, 0x27

    .line 341
    .line 342
    rem-int/lit16 v4, v4, 0x80

    .line 343
    .line 344
    sput v4, LVa/B7;->i:I

    .line 345
    .line 346
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    check-cast v4, LVa/y7;

    .line 351
    .line 352
    iget-object v9, v1, LVa/B7;->a:LVa/b8;

    .line 353
    .line 354
    invoke-virtual {v9}, LVa/b8;->b()LVa/x8;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    invoke-virtual {v9}, LVa/x8;->j()LVa/x8;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-virtual {v4}, LVa/y7;->h()LVa/ha;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    invoke-virtual {v10}, LVa/ha;->b()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    invoke-virtual {v9, v4, v10}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_2

    .line 374
    :catchall_0
    move-exception v0

    .line 375
    goto/16 :goto_17

    .line 376
    .line 377
    :cond_9
    :goto_3
    sget v0, LVa/B7;->h:I

    .line 378
    .line 379
    add-int/lit8 v0, v0, 0x65

    .line 380
    .line 381
    rem-int/lit16 v0, v0, 0x80

    .line 382
    .line 383
    sput v0, LVa/B7;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 384
    .line 385
    monitor-exit p0

    .line 386
    invoke-virtual {v1}, LVa/B7;->c()Ljava/util/ArrayList;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    xor-int/2addr v4, v8

    .line 399
    if-eq v4, v8, :cond_32

    .line 400
    .line 401
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    check-cast v4, LVa/y7;

    .line 406
    .line 407
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    sget v9, LVa/y7;->m:I

    .line 411
    .line 412
    add-int/lit8 v9, v9, 0xb

    .line 413
    .line 414
    rem-int/lit16 v9, v9, 0x80

    .line 415
    .line 416
    sput v9, LVa/y7;->l:I

    .line 417
    .line 418
    invoke-virtual {v4}, LVa/y7;->h()LVa/ha;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    invoke-virtual {v9}, LVa/ha;->m()Ljava/util/ArrayList;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    if-eqz v10, :cond_31

    .line 435
    .line 436
    sget v10, LVa/y7;->l:I

    .line 437
    .line 438
    add-int/lit8 v10, v10, 0x69

    .line 439
    .line 440
    rem-int/lit16 v10, v10, 0x80

    .line 441
    .line 442
    sput v10, LVa/y7;->m:I

    .line 443
    .line 444
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    check-cast v10, LVa/h8;

    .line 449
    .line 450
    sget v12, LVa/y7;->m:I

    .line 451
    .line 452
    add-int/lit8 v12, v12, 0x4b

    .line 453
    .line 454
    rem-int/lit16 v12, v12, 0x80

    .line 455
    .line 456
    sput v12, LVa/y7;->l:I

    .line 457
    .line 458
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    sget v13, LVa/G;->F:I

    .line 466
    .line 467
    add-int/lit8 v13, v13, 0x55

    .line 468
    .line 469
    rem-int/lit16 v13, v13, 0x80

    .line 470
    .line 471
    sput v13, LVa/G;->E:I

    .line 472
    .line 473
    iget-object v13, v12, LVa/G;->z:Ljava/util/ArrayList;

    .line 474
    .line 475
    const-string v14, ""

    .line 476
    .line 477
    const/4 v15, 0x5

    .line 478
    if-nez v13, :cond_a

    .line 479
    .line 480
    invoke-virtual {v12}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 481
    .line 482
    .line 483
    move-result-object v13

    .line 484
    invoke-static {v14, v6, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 485
    .line 486
    .line 487
    move-result v16

    .line 488
    move-object/from16 v17, v5

    .line 489
    .line 490
    add-int/lit8 v5, v16, 0x5

    .line 491
    .line 492
    const/16 v16, 0x0

    .line 493
    .line 494
    const-string v11, "\u9f8e\ue3c9\u31ac\uec5b"

    .line 495
    .line 496
    invoke-static {v5, v11}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-virtual {v13, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    new-instance v11, Lwa/a;

    .line 509
    .line 510
    const/16 v13, 0x1b

    .line 511
    .line 512
    invoke-direct {v11, v13}, Lwa/a;-><init>(I)V

    .line 513
    .line 514
    .line 515
    invoke-static {v5, v11}, LVa/Ab;->d0(Lorg/json/JSONArray;LVa/sb;)Ljava/util/ArrayList;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iput-object v5, v12, LVa/G;->z:Ljava/util/ArrayList;

    .line 520
    .line 521
    goto :goto_6

    .line 522
    :cond_a
    move-object/from16 v17, v5

    .line 523
    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    :goto_6
    iget-object v5, v12, LVa/G;->z:Ljava/util/ArrayList;

    .line 527
    .line 528
    sget v11, LVa/G;->F:I

    .line 529
    .line 530
    add-int/lit8 v11, v11, 0x2d

    .line 531
    .line 532
    rem-int/lit16 v11, v11, 0x80

    .line 533
    .line 534
    sput v11, LVa/G;->E:I

    .line 535
    .line 536
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    sget v11, LVa/h8;->h:I

    .line 540
    .line 541
    add-int/lit8 v11, v11, 0x49

    .line 542
    .line 543
    rem-int/lit16 v12, v11, 0x80

    .line 544
    .line 545
    sput v12, LVa/h8;->i:I

    .line 546
    .line 547
    rem-int/2addr v11, v2

    .line 548
    if-eqz v11, :cond_30

    .line 549
    .line 550
    if-eqz v5, :cond_d

    .line 551
    .line 552
    sget v11, LVa/y7;->l:I

    .line 553
    .line 554
    add-int/2addr v11, v15

    .line 555
    rem-int/lit16 v12, v11, 0x80

    .line 556
    .line 557
    sput v12, LVa/y7;->m:I

    .line 558
    .line 559
    rem-int/2addr v11, v2

    .line 560
    if-eqz v11, :cond_c

    .line 561
    .line 562
    sget-object v11, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;->UNKNOWN:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 563
    .line 564
    iget-object v12, v10, LVa/h8;->b:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 565
    .line 566
    if-eq v12, v11, :cond_d

    .line 567
    .line 568
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    if-nez v5, :cond_b

    .line 573
    .line 574
    sget v5, LVa/y7;->l:I

    .line 575
    .line 576
    add-int/lit8 v5, v5, 0x2f

    .line 577
    .line 578
    rem-int/lit16 v5, v5, 0x80

    .line 579
    .line 580
    sput v5, LVa/y7;->m:I

    .line 581
    .line 582
    goto :goto_7

    .line 583
    :cond_b
    sget v5, LVa/y7;->l:I

    .line 584
    .line 585
    add-int/lit8 v5, v5, 0x4f

    .line 586
    .line 587
    rem-int/lit16 v5, v5, 0x80

    .line 588
    .line 589
    sput v5, LVa/y7;->m:I

    .line 590
    .line 591
    move-object/from16 v18, v0

    .line 592
    .line 593
    move/from16 v21, v2

    .line 594
    .line 595
    move v0, v6

    .line 596
    move/from16 v24, v7

    .line 597
    .line 598
    move v5, v8

    .line 599
    move-object/from16 v19, v9

    .line 600
    .line 601
    goto/16 :goto_16

    .line 602
    .line 603
    :cond_c
    throw v17

    .line 604
    :cond_d
    :goto_7
    sget v5, LVa/h8;->h:I

    .line 605
    .line 606
    add-int/lit8 v5, v5, 0x59

    .line 607
    .line 608
    rem-int/lit16 v11, v5, 0x80

    .line 609
    .line 610
    sput v11, LVa/h8;->i:I

    .line 611
    .line 612
    rem-int/2addr v5, v2

    .line 613
    if-nez v5, :cond_e

    .line 614
    .line 615
    const/16 v5, 0x3d

    .line 616
    .line 617
    div-int/2addr v5, v3

    .line 618
    :cond_e
    iget-object v5, v10, LVa/h8;->a:Ljava/lang/String;

    .line 619
    .line 620
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 621
    .line 622
    .line 623
    move-result v11

    .line 624
    const-string v12, "\ufff6\u0007\ufffc\t\ufffc\u0007\u000c\ufff4"

    .line 625
    .line 626
    const-string v13, "\ufff6\u0000\ufffb\t\t\u0001"

    .line 627
    .line 628
    const-string v15, "\u0008\t\ufff7\ufffb"

    .line 629
    .line 630
    const-wide/16 v19, 0x0

    .line 631
    .line 632
    sparse-switch v11, :sswitch_data_0

    .line 633
    .line 634
    .line 635
    const/16 v21, 0x4

    .line 636
    .line 637
    goto/16 :goto_a

    .line 638
    .line 639
    :sswitch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 640
    .line 641
    .line 642
    move-result v11

    .line 643
    shr-int/lit8 v11, v11, 0x10

    .line 644
    .line 645
    add-int/lit8 v11, v11, 0x7f

    .line 646
    .line 647
    const/16 v21, 0x4

    .line 648
    .line 649
    const-string v6, "\u008a\u0098\u0092\u0084\u0097\u0096\u0096\u008e"

    .line 650
    .line 651
    invoke-static {v11, v6}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v6

    .line 659
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    if-eqz v5, :cond_12

    .line 664
    .line 665
    sget v5, LVa/y7;->m:I

    .line 666
    .line 667
    add-int/lit8 v5, v5, 0x7b

    .line 668
    .line 669
    rem-int/lit16 v6, v5, 0x80

    .line 670
    .line 671
    sput v6, LVa/y7;->l:I

    .line 672
    .line 673
    rem-int/2addr v5, v2

    .line 674
    if-eqz v5, :cond_f

    .line 675
    .line 676
    const/4 v5, 0x5

    .line 677
    goto/16 :goto_b

    .line 678
    .line 679
    :cond_f
    move/from16 v5, v21

    .line 680
    .line 681
    goto/16 :goto_b

    .line 682
    .line 683
    :sswitch_1
    const/16 v21, 0x4

    .line 684
    .line 685
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 686
    .line 687
    .line 688
    move-result-wide v22

    .line 689
    cmp-long v6, v22, v19

    .line 690
    .line 691
    add-int/lit8 v6, v6, 0x4

    .line 692
    .line 693
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    shr-int/lit8 v11, v11, 0x10

    .line 698
    .line 699
    rsub-int v11, v11, 0xef

    .line 700
    .line 701
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 702
    .line 703
    .line 704
    move-result-wide v22

    .line 705
    cmp-long v7, v22, v19

    .line 706
    .line 707
    invoke-static {v15, v6, v11, v7, v8}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v5

    .line 719
    if-eqz v5, :cond_12

    .line 720
    .line 721
    :goto_8
    move v5, v8

    .line 722
    goto/16 :goto_b

    .line 723
    .line 724
    :sswitch_2
    const/16 v21, 0x4

    .line 725
    .line 726
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 727
    .line 728
    .line 729
    move-result-wide v6

    .line 730
    cmp-long v6, v6, v19

    .line 731
    .line 732
    rsub-int/lit8 v6, v6, 0x7

    .line 733
    .line 734
    invoke-static {v14}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 735
    .line 736
    .line 737
    move-result v7

    .line 738
    add-int/lit16 v7, v7, 0xef

    .line 739
    .line 740
    invoke-static {v3, v3}, Landroid/view/View;->getDefaultSize(II)I

    .line 741
    .line 742
    .line 743
    move-result v11

    .line 744
    rsub-int/lit8 v11, v11, 0x4

    .line 745
    .line 746
    invoke-static {v13, v6, v7, v11, v8}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    if-eqz v5, :cond_12

    .line 759
    .line 760
    move v5, v2

    .line 761
    goto :goto_b

    .line 762
    :sswitch_3
    const/16 v21, 0x4

    .line 763
    .line 764
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 765
    .line 766
    .line 767
    move-result v6

    .line 768
    shr-int/lit8 v6, v6, 0x10

    .line 769
    .line 770
    rsub-int/lit8 v6, v6, 0x8

    .line 771
    .line 772
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 773
    .line 774
    .line 775
    move-result v7

    .line 776
    rsub-int v7, v7, 0xee

    .line 777
    .line 778
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 779
    .line 780
    .line 781
    move-result v11

    .line 782
    shr-int/lit8 v11, v11, 0x10

    .line 783
    .line 784
    add-int/lit8 v11, v11, 0x7

    .line 785
    .line 786
    invoke-static {v12, v6, v7, v11, v3}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v6

    .line 790
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v6

    .line 794
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-eqz v5, :cond_12

    .line 799
    .line 800
    sget v5, LVa/y7;->m:I

    .line 801
    .line 802
    add-int/lit8 v5, v5, 0x4f

    .line 803
    .line 804
    rem-int/lit16 v6, v5, 0x80

    .line 805
    .line 806
    sput v6, LVa/y7;->l:I

    .line 807
    .line 808
    rem-int/2addr v5, v2

    .line 809
    if-eqz v5, :cond_10

    .line 810
    .line 811
    goto :goto_8

    .line 812
    :cond_10
    move v5, v3

    .line 813
    goto :goto_b

    .line 814
    :sswitch_4
    const/16 v21, 0x4

    .line 815
    .line 816
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 817
    .line 818
    .line 819
    move-result v6

    .line 820
    shr-int/lit8 v6, v6, 0x10

    .line 821
    .line 822
    rsub-int/lit8 v6, v6, 0x7f

    .line 823
    .line 824
    const-string v7, "\u0082\u008f\u0092\u0094\u0092\u0082\u0095\u0089\u0088\u0094\u0085\u0089\u0093\u0089\u0085\u0092\u008e"

    .line 825
    .line 826
    invoke-static {v6, v7}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    if-eqz v5, :cond_12

    .line 839
    .line 840
    sget v5, LVa/y7;->m:I

    .line 841
    .line 842
    add-int/lit8 v5, v5, 0x11

    .line 843
    .line 844
    rem-int/lit16 v6, v5, 0x80

    .line 845
    .line 846
    sput v6, LVa/y7;->l:I

    .line 847
    .line 848
    rem-int/2addr v5, v2

    .line 849
    if-eqz v5, :cond_11

    .line 850
    .line 851
    const/16 v18, 0x5

    .line 852
    .line 853
    goto :goto_9

    .line 854
    :cond_11
    const/16 v18, 0x3

    .line 855
    .line 856
    :goto_9
    move/from16 v5, v18

    .line 857
    .line 858
    goto :goto_b

    .line 859
    :cond_12
    :goto_a
    const/4 v5, -0x1

    .line 860
    :goto_b
    const-string v6, "\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099"

    .line 861
    .line 862
    const-string v7, "\u0010\u0013\uffc1\uffee\u0006\u0015\t\u0010\u0005\uffc1\u0005\u0006\u0007\n\u000f\n\u0015\n\u0010\u000f\uffc1\u0007"

    .line 863
    .line 864
    iget-object v11, v4, LVa/y7;->j:LVa/ba;

    .line 865
    .line 866
    if-eqz v5, :cond_28

    .line 867
    .line 868
    if-eq v5, v8, :cond_1d

    .line 869
    .line 870
    if-eq v5, v2, :cond_19

    .line 871
    .line 872
    const/4 v6, 0x3

    .line 873
    if-eq v5, v6, :cond_17

    .line 874
    .line 875
    move/from16 v6, v21

    .line 876
    .line 877
    if-eq v5, v6, :cond_13

    .line 878
    .line 879
    goto :goto_c

    .line 880
    :cond_13
    new-instance v5, LA7/b0;

    .line 881
    .line 882
    sget v6, LVa/h8;->i:I

    .line 883
    .line 884
    add-int/lit8 v6, v6, 0x7

    .line 885
    .line 886
    rem-int/lit16 v7, v6, 0x80

    .line 887
    .line 888
    sput v7, LVa/h8;->h:I

    .line 889
    .line 890
    rem-int/2addr v6, v2

    .line 891
    if-nez v6, :cond_16

    .line 892
    .line 893
    iget-object v6, v10, LVa/h8;->d:Ljava/util/List;

    .line 894
    .line 895
    invoke-virtual {v4, v6}, LVa/y7;->r(Ljava/util/List;)Ljava/util/ArrayList;

    .line 896
    .line 897
    .line 898
    move-result-object v6

    .line 899
    new-instance v7, LVa/ha;

    .line 900
    .line 901
    invoke-direct {v7, v4, v6}, LVa/ha;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    sget v6, LVa/y7;->l:I

    .line 905
    .line 906
    add-int/lit8 v6, v6, 0x41

    .line 907
    .line 908
    rem-int/lit16 v10, v6, 0x80

    .line 909
    .line 910
    sput v10, LVa/y7;->m:I

    .line 911
    .line 912
    rem-int/2addr v6, v2

    .line 913
    if-eqz v6, :cond_15

    .line 914
    .line 915
    invoke-direct {v5, v7}, LA7/b0;-><init>(LVa/jb;)V

    .line 916
    .line 917
    .line 918
    iput-object v5, v4, LVa/y7;->g:LA7/b0;

    .line 919
    .line 920
    :cond_14
    :goto_c
    move-object/from16 v18, v0

    .line 921
    .line 922
    move/from16 v21, v2

    .line 923
    .line 924
    move v5, v8

    .line 925
    move-object/from16 v19, v9

    .line 926
    .line 927
    const/16 v0, 0x30

    .line 928
    .line 929
    :goto_d
    const/16 v24, 0x3

    .line 930
    .line 931
    goto/16 :goto_16

    .line 932
    .line 933
    :cond_15
    throw v17

    .line 934
    :cond_16
    throw v17

    .line 935
    :cond_17
    iget-object v5, v4, LVa/y7;->f:LVa/v7;

    .line 936
    .line 937
    if-nez v5, :cond_14

    .line 938
    .line 939
    sget v5, LVa/y7;->m:I

    .line 940
    .line 941
    add-int/lit8 v5, v5, 0x57

    .line 942
    .line 943
    rem-int/lit16 v5, v5, 0x80

    .line 944
    .line 945
    sput v5, LVa/y7;->l:I

    .line 946
    .line 947
    sget v5, LVa/h8;->i:I

    .line 948
    .line 949
    add-int/lit8 v5, v5, 0x7

    .line 950
    .line 951
    rem-int/lit16 v6, v5, 0x80

    .line 952
    .line 953
    sput v6, LVa/h8;->h:I

    .line 954
    .line 955
    rem-int/2addr v5, v2

    .line 956
    if-nez v5, :cond_18

    .line 957
    .line 958
    iget-object v5, v10, LVa/h8;->d:Ljava/util/List;

    .line 959
    .line 960
    invoke-virtual {v4, v5}, LVa/y7;->r(Ljava/util/List;)Ljava/util/ArrayList;

    .line 961
    .line 962
    .line 963
    move-result-object v5

    .line 964
    new-instance v6, LVa/v7;

    .line 965
    .line 966
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 967
    .line 968
    .line 969
    iput-object v4, v6, LVa/v7;->b:LVa/y7;

    .line 970
    .line 971
    iput-object v5, v6, LVa/v7;->a:Ljava/util/ArrayList;

    .line 972
    .line 973
    sget v5, LVa/y7;->m:I

    .line 974
    .line 975
    add-int/lit8 v5, v5, 0x11

    .line 976
    .line 977
    rem-int/lit16 v5, v5, 0x80

    .line 978
    .line 979
    sput v5, LVa/y7;->l:I

    .line 980
    .line 981
    iput-object v6, v4, LVa/y7;->f:LVa/v7;

    .line 982
    .line 983
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    iget-object v6, v4, LVa/y7;->f:LVa/v7;

    .line 988
    .line 989
    invoke-virtual {v5, v6}, LVa/fb;->f(LVa/db;)V

    .line 990
    .line 991
    .line 992
    goto :goto_c

    .line 993
    :cond_18
    throw v17

    .line 994
    :cond_19
    invoke-virtual {v10}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 995
    .line 996
    .line 997
    move-result-object v5

    .line 998
    invoke-virtual {v4, v5}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 999
    .line 1000
    .line 1001
    move-result-object v5

    .line 1002
    if-eqz v5, :cond_1b

    .line 1003
    .line 1004
    invoke-virtual {v4, v3}, LVa/y7;->g(Z)LVa/n7;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v6

    .line 1008
    invoke-virtual {v4, v8}, LVa/y7;->g(Z)LVa/n7;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v7

    .line 1012
    sget v12, LVa/y7;->m:I

    .line 1013
    .line 1014
    add-int/lit8 v12, v12, 0x6f

    .line 1015
    .line 1016
    rem-int/lit16 v14, v12, 0x80

    .line 1017
    .line 1018
    sput v14, LVa/y7;->l:I

    .line 1019
    .line 1020
    rem-int/2addr v12, v2

    .line 1021
    if-nez v12, :cond_1a

    .line 1022
    .line 1023
    new-instance v12, LVa/r7;

    .line 1024
    .line 1025
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    iput-object v7, v12, LVa/r7;->K:LVa/pb;

    .line 1029
    .line 1030
    iput-object v6, v12, LVa/r7;->L:LVa/pb;

    .line 1031
    .line 1032
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    new-instance v6, LVa/Da;

    .line 1036
    .line 1037
    const/16 v7, 0x18

    .line 1038
    .line 1039
    invoke-direct {v6, v7}, LVa/Da;-><init>(I)V

    .line 1040
    .line 1041
    .line 1042
    iput-object v11, v6, LVa/Da;->f:Ljava/lang/Object;

    .line 1043
    .line 1044
    iput-object v5, v6, LVa/Da;->d:Ljava/lang/Object;

    .line 1045
    .line 1046
    iput-object v12, v6, LVa/Da;->e:Ljava/lang/Object;

    .line 1047
    .line 1048
    invoke-static {v6}, LVa/Cb;->g(LVa/Ba;)V

    .line 1049
    .line 1050
    .line 1051
    sget v5, LVa/ba;->h:I

    .line 1052
    .line 1053
    add-int/lit8 v5, v5, 0x15

    .line 1054
    .line 1055
    rem-int/lit16 v5, v5, 0x80

    .line 1056
    .line 1057
    sput v5, LVa/ba;->i:I

    .line 1058
    .line 1059
    sget v5, LVa/y7;->m:I

    .line 1060
    .line 1061
    add-int/lit8 v5, v5, 0x4b

    .line 1062
    .line 1063
    rem-int/lit16 v5, v5, 0x80

    .line 1064
    .line 1065
    sput v5, LVa/y7;->l:I

    .line 1066
    .line 1067
    goto :goto_e

    .line 1068
    :cond_1a
    throw v17

    .line 1069
    :cond_1b
    :goto_e
    sget v5, LVa/y7;->l:I

    .line 1070
    .line 1071
    add-int/lit8 v5, v5, 0x11

    .line 1072
    .line 1073
    rem-int/lit16 v6, v5, 0x80

    .line 1074
    .line 1075
    sput v6, LVa/y7;->m:I

    .line 1076
    .line 1077
    rem-int/2addr v5, v2

    .line 1078
    if-eqz v5, :cond_1c

    .line 1079
    .line 1080
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 1081
    .line 1082
    .line 1083
    move-result v5

    .line 1084
    rsub-int/lit8 v5, v5, 0x6

    .line 1085
    .line 1086
    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 1087
    .line 1088
    .line 1089
    move-result v6

    .line 1090
    add-int/lit16 v6, v6, 0xef

    .line 1091
    .line 1092
    invoke-static/range {v19 .. v20}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 1093
    .line 1094
    .line 1095
    move-result v7

    .line 1096
    const/16 v24, 0x3

    .line 1097
    .line 1098
    rsub-int/lit8 v7, v7, 0x3

    .line 1099
    .line 1100
    invoke-static {v13, v5, v6, v7, v8}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v5

    .line 1104
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v5

    .line 1108
    invoke-virtual {v4, v5, v10}, LVa/y7;->y(Ljava/lang/String;LVa/h8;)V

    .line 1109
    .line 1110
    .line 1111
    sget v5, LVa/y7;->m:I

    .line 1112
    .line 1113
    add-int/lit8 v5, v5, 0x33

    .line 1114
    .line 1115
    rem-int/lit16 v6, v5, 0x80

    .line 1116
    .line 1117
    sput v6, LVa/y7;->l:I

    .line 1118
    .line 1119
    rem-int/2addr v5, v2

    .line 1120
    if-eqz v5, :cond_14

    .line 1121
    .line 1122
    const/16 v5, 0x32

    .line 1123
    .line 1124
    div-int/2addr v5, v3

    .line 1125
    goto/16 :goto_c

    .line 1126
    .line 1127
    :cond_1c
    throw v17

    .line 1128
    :cond_1d
    sget v5, LVa/y7;->m:I

    .line 1129
    .line 1130
    add-int/lit8 v5, v5, 0x29

    .line 1131
    .line 1132
    rem-int/lit16 v5, v5, 0x80

    .line 1133
    .line 1134
    sput v5, LVa/y7;->l:I

    .line 1135
    .line 1136
    invoke-virtual {v10}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v5

    .line 1140
    invoke-virtual {v4, v5}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v5

    .line 1144
    if-eqz v5, :cond_27

    .line 1145
    .line 1146
    sget v12, LVa/y7;->m:I

    .line 1147
    .line 1148
    add-int/lit8 v12, v12, 0x6f

    .line 1149
    .line 1150
    rem-int/lit16 v13, v12, 0x80

    .line 1151
    .line 1152
    sput v13, LVa/y7;->l:I

    .line 1153
    .line 1154
    rem-int/2addr v12, v2

    .line 1155
    if-eqz v12, :cond_20

    .line 1156
    .line 1157
    sget v12, LVa/h8;->h:I

    .line 1158
    .line 1159
    add-int/lit8 v12, v12, 0x17

    .line 1160
    .line 1161
    rem-int/lit16 v13, v12, 0x80

    .line 1162
    .line 1163
    sput v13, LVa/h8;->i:I

    .line 1164
    .line 1165
    rem-int/2addr v12, v2

    .line 1166
    if-eqz v12, :cond_1f

    .line 1167
    .line 1168
    iget-object v12, v10, LVa/h8;->e:Ljava/lang/String;

    .line 1169
    .line 1170
    invoke-virtual {v4, v3}, LVa/y7;->p(Z)LVa/p7;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v13

    .line 1174
    invoke-virtual {v4, v3}, LVa/y7;->p(Z)LVa/p7;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v18

    .line 1178
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v21

    .line 1182
    if-nez v21, :cond_1e

    .line 1183
    .line 1184
    :goto_f
    move/from16 v21, v2

    .line 1185
    .line 1186
    move-object/from16 v2, v18

    .line 1187
    .line 1188
    goto :goto_10

    .line 1189
    :cond_1e
    move/from16 v21, v2

    .line 1190
    .line 1191
    move-object/from16 v2, v18

    .line 1192
    .line 1193
    goto/16 :goto_11

    .line 1194
    .line 1195
    :cond_1f
    throw v17

    .line 1196
    :cond_20
    sget v12, LVa/h8;->h:I

    .line 1197
    .line 1198
    add-int/lit8 v12, v12, 0x17

    .line 1199
    .line 1200
    rem-int/lit16 v13, v12, 0x80

    .line 1201
    .line 1202
    sput v13, LVa/h8;->i:I

    .line 1203
    .line 1204
    rem-int/2addr v12, v2

    .line 1205
    if-eqz v12, :cond_26

    .line 1206
    .line 1207
    iget-object v12, v10, LVa/h8;->e:Ljava/lang/String;

    .line 1208
    .line 1209
    invoke-virtual {v4, v8}, LVa/y7;->p(Z)LVa/p7;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v13

    .line 1213
    invoke-virtual {v4, v3}, LVa/y7;->p(Z)LVa/p7;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v18

    .line 1217
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v21

    .line 1221
    if-nez v21, :cond_1e

    .line 1222
    .line 1223
    goto :goto_f

    .line 1224
    :goto_10
    invoke-virtual {v4, v12}, LVa/y7;->q(Ljava/lang/String;)LVa/r8;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v8

    .line 1228
    if-eqz v8, :cond_23

    .line 1229
    .line 1230
    new-instance v6, LVa/ha;

    .line 1231
    .line 1232
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1233
    .line 1234
    .line 1235
    iput-object v4, v6, LVa/ha;->b:Ljava/lang/Object;

    .line 1236
    .line 1237
    iput-object v8, v6, LVa/ha;->a:Ljava/lang/Object;

    .line 1238
    .line 1239
    sget v7, LVa/y7;->m:I

    .line 1240
    .line 1241
    add-int/lit8 v7, v7, 0x2d

    .line 1242
    .line 1243
    rem-int/lit16 v8, v7, 0x80

    .line 1244
    .line 1245
    sput v8, LVa/y7;->l:I

    .line 1246
    .line 1247
    rem-int/lit8 v7, v7, 0x2

    .line 1248
    .line 1249
    if-nez v7, :cond_22

    .line 1250
    .line 1251
    invoke-static {v2, v13}, LVa/y7;->n(LVa/p7;LVa/p7;)LVa/s7;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v2

    .line 1255
    invoke-virtual {v11, v5, v2, v6}, LVa/ba;->r(Lorg/json/JSONObject;LVa/s7;LVa/ha;)V

    .line 1256
    .line 1257
    .line 1258
    sget v2, LVa/y7;->l:I

    .line 1259
    .line 1260
    add-int/lit8 v2, v2, 0x7

    .line 1261
    .line 1262
    rem-int/lit16 v5, v2, 0x80

    .line 1263
    .line 1264
    sput v5, LVa/y7;->m:I

    .line 1265
    .line 1266
    rem-int/lit8 v2, v2, 0x2

    .line 1267
    .line 1268
    if-eqz v2, :cond_21

    .line 1269
    .line 1270
    goto/16 :goto_12

    .line 1271
    .line 1272
    :cond_21
    throw v17

    .line 1273
    :cond_22
    invoke-static {v2, v13}, LVa/y7;->n(LVa/p7;LVa/p7;)LVa/s7;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    invoke-virtual {v11, v5, v0, v6}, LVa/ba;->r(Lorg/json/JSONObject;LVa/s7;LVa/ha;)V

    .line 1278
    .line 1279
    .line 1280
    throw v17

    .line 1281
    :cond_23
    invoke-virtual {v4}, LVa/y7;->f()Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1288
    .line 1289
    .line 1290
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 1291
    .line 1292
    .line 1293
    move-result v8

    .line 1294
    shr-int/lit8 v8, v8, 0x8

    .line 1295
    .line 1296
    rsub-int/lit8 v8, v8, 0x16

    .line 1297
    .line 1298
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 1299
    .line 1300
    .line 1301
    move-result-wide v25

    .line 1302
    cmp-long v11, v25, v19

    .line 1303
    .line 1304
    rsub-int v11, v11, 0xe1

    .line 1305
    .line 1306
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 1307
    .line 1308
    .line 1309
    move-result v13

    .line 1310
    const/16 v24, 0x3

    .line 1311
    .line 1312
    rsub-int/lit8 v13, v13, 0x3

    .line 1313
    .line 1314
    invoke-static {v7, v8, v11, v13, v3}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v7

    .line 1318
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v7

    .line 1322
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    invoke-static {v14}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 1329
    .line 1330
    .line 1331
    move-result v7

    .line 1332
    rsub-int/lit8 v7, v7, 0x7f

    .line 1333
    .line 1334
    invoke-static {v7, v6}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v6

    .line 1338
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v6

    .line 1342
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v5

    .line 1349
    invoke-static {v2, v5}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1350
    .line 1351
    .line 1352
    goto :goto_12

    .line 1353
    :goto_11
    sget v6, LVa/y7;->l:I

    .line 1354
    .line 1355
    add-int/lit8 v6, v6, 0x49

    .line 1356
    .line 1357
    rem-int/lit16 v7, v6, 0x80

    .line 1358
    .line 1359
    sput v7, LVa/y7;->m:I

    .line 1360
    .line 1361
    rem-int/lit8 v6, v6, 0x2

    .line 1362
    .line 1363
    if-eqz v6, :cond_25

    .line 1364
    .line 1365
    invoke-static {v2, v13}, LVa/y7;->n(LVa/p7;LVa/p7;)LVa/s7;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    invoke-virtual {v11, v5, v2}, LVa/ba;->d(Lorg/json/JSONObject;LVa/s7;)V

    .line 1370
    .line 1371
    .line 1372
    sget v2, LVa/y7;->m:I

    .line 1373
    .line 1374
    add-int/lit8 v2, v2, 0x13

    .line 1375
    .line 1376
    rem-int/lit16 v5, v2, 0x80

    .line 1377
    .line 1378
    sput v5, LVa/y7;->l:I

    .line 1379
    .line 1380
    rem-int/lit8 v2, v2, 0x2

    .line 1381
    .line 1382
    if-nez v2, :cond_24

    .line 1383
    .line 1384
    goto :goto_12

    .line 1385
    :cond_24
    throw v17

    .line 1386
    :cond_25
    invoke-static {v2, v13}, LVa/y7;->n(LVa/p7;LVa/p7;)LVa/s7;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    invoke-virtual {v11, v5, v0}, LVa/ba;->d(Lorg/json/JSONObject;LVa/s7;)V

    .line 1391
    .line 1392
    .line 1393
    throw v17

    .line 1394
    :cond_26
    throw v17

    .line 1395
    :cond_27
    move/from16 v21, v2

    .line 1396
    .line 1397
    :goto_12
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 1398
    .line 1399
    .line 1400
    move-result v2

    .line 1401
    cmpl-float v2, v2, v16

    .line 1402
    .line 1403
    const/16 v24, 0x3

    .line 1404
    .line 1405
    add-int/lit8 v2, v2, 0x3

    .line 1406
    .line 1407
    invoke-static {v3, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 1408
    .line 1409
    .line 1410
    move-result v5

    .line 1411
    add-int/lit16 v5, v5, 0xef

    .line 1412
    .line 1413
    const v6, 0x1000001

    .line 1414
    .line 1415
    .line 1416
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 1417
    .line 1418
    .line 1419
    move-result v7

    .line 1420
    add-int/2addr v7, v6

    .line 1421
    const/4 v6, 0x1

    .line 1422
    invoke-static {v15, v2, v5, v7, v6}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v2

    .line 1430
    invoke-virtual {v4, v2, v10}, LVa/y7;->y(Ljava/lang/String;LVa/h8;)V

    .line 1431
    .line 1432
    .line 1433
    move-object/from16 v18, v0

    .line 1434
    .line 1435
    move-object/from16 v19, v9

    .line 1436
    .line 1437
    const/16 v0, 0x30

    .line 1438
    .line 1439
    const/4 v5, 0x1

    .line 1440
    goto/16 :goto_d

    .line 1441
    .line 1442
    :cond_28
    move/from16 v21, v2

    .line 1443
    .line 1444
    sget v2, LVa/y7;->l:I

    .line 1445
    .line 1446
    add-int/lit8 v2, v2, 0x13

    .line 1447
    .line 1448
    rem-int/lit16 v5, v2, 0x80

    .line 1449
    .line 1450
    sput v5, LVa/y7;->m:I

    .line 1451
    .line 1452
    rem-int/lit8 v2, v2, 0x2

    .line 1453
    .line 1454
    if-eqz v2, :cond_2f

    .line 1455
    .line 1456
    invoke-virtual {v10}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v2

    .line 1460
    invoke-virtual {v4, v2}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v2

    .line 1464
    if-eqz v2, :cond_2e

    .line 1465
    .line 1466
    sget v5, LVa/h8;->i:I

    .line 1467
    .line 1468
    add-int/lit8 v8, v5, 0x35

    .line 1469
    .line 1470
    rem-int/lit16 v13, v8, 0x80

    .line 1471
    .line 1472
    sput v13, LVa/h8;->h:I

    .line 1473
    .line 1474
    rem-int/lit8 v8, v8, 0x2

    .line 1475
    .line 1476
    if-nez v8, :cond_2d

    .line 1477
    .line 1478
    add-int/lit8 v5, v5, 0x5b

    .line 1479
    .line 1480
    rem-int/lit16 v8, v5, 0x80

    .line 1481
    .line 1482
    sput v8, LVa/h8;->h:I

    .line 1483
    .line 1484
    rem-int/lit8 v5, v5, 0x2

    .line 1485
    .line 1486
    if-eqz v5, :cond_29

    .line 1487
    .line 1488
    const/16 v5, 0x55

    .line 1489
    .line 1490
    div-int/2addr v5, v3

    .line 1491
    :cond_29
    iget-object v5, v10, LVa/h8;->f:Ljava/lang/String;

    .line 1492
    .line 1493
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1494
    .line 1495
    .line 1496
    move-result v8

    .line 1497
    if-nez v8, :cond_2b

    .line 1498
    .line 1499
    sget v8, LVa/y7;->m:I

    .line 1500
    .line 1501
    add-int/lit8 v8, v8, 0x33

    .line 1502
    .line 1503
    rem-int/lit16 v8, v8, 0x80

    .line 1504
    .line 1505
    sput v8, LVa/y7;->l:I

    .line 1506
    .line 1507
    invoke-virtual {v4, v5}, LVa/y7;->q(Ljava/lang/String;)LVa/r8;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v8

    .line 1511
    if-eqz v8, :cond_2a

    .line 1512
    .line 1513
    new-instance v6, LVa/ib;

    .line 1514
    .line 1515
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1516
    .line 1517
    .line 1518
    iput-object v4, v6, LVa/ib;->c:Ljava/lang/Object;

    .line 1519
    .line 1520
    iput-object v8, v6, LVa/ib;->a:Ljava/lang/Object;

    .line 1521
    .line 1522
    iput-object v5, v6, LVa/ib;->b:Ljava/lang/Object;

    .line 1523
    .line 1524
    move-object/from16 v18, v0

    .line 1525
    .line 1526
    move-object/from16 v19, v9

    .line 1527
    .line 1528
    goto :goto_14

    .line 1529
    :cond_2a
    invoke-virtual {v4}, LVa/y7;->f()Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v8

    .line 1533
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1534
    .line 1535
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1536
    .line 1537
    .line 1538
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 1539
    .line 1540
    .line 1541
    move-result v15

    .line 1542
    add-int/lit8 v15, v15, 0x16

    .line 1543
    .line 1544
    move-object/from16 v18, v0

    .line 1545
    .line 1546
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1547
    .line 1548
    .line 1549
    move-result v0

    .line 1550
    rsub-int v0, v0, 0xe0

    .line 1551
    .line 1552
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 1553
    .line 1554
    .line 1555
    move-result v16

    .line 1556
    shr-int/lit8 v16, v16, 0x10

    .line 1557
    .line 1558
    move-object/from16 v19, v9

    .line 1559
    .line 1560
    const/16 v24, 0x3

    .line 1561
    .line 1562
    add-int/lit8 v9, v16, 0x3

    .line 1563
    .line 1564
    invoke-static {v7, v15, v0, v9, v3}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0

    .line 1568
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v0

    .line 1572
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v14, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v0

    .line 1582
    rsub-int/lit8 v0, v0, 0x7f

    .line 1583
    .line 1584
    invoke-static {v0, v6}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v0

    .line 1588
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v0

    .line 1599
    invoke-static {v8, v0}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1600
    .line 1601
    .line 1602
    goto :goto_13

    .line 1603
    :cond_2b
    move-object/from16 v18, v0

    .line 1604
    .line 1605
    move-object/from16 v19, v9

    .line 1606
    .line 1607
    :goto_13
    move-object/from16 v6, v17

    .line 1608
    .line 1609
    :goto_14
    invoke-virtual {v4, v3}, LVa/y7;->m(Z)LVa/q7;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    const/4 v5, 0x1

    .line 1614
    invoke-virtual {v4, v5}, LVa/y7;->m(Z)LVa/q7;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v7

    .line 1618
    sget v8, LVa/y7;->m:I

    .line 1619
    .line 1620
    add-int/lit8 v8, v8, 0x41

    .line 1621
    .line 1622
    rem-int/lit16 v8, v8, 0x80

    .line 1623
    .line 1624
    sput v8, LVa/y7;->l:I

    .line 1625
    .line 1626
    add-int/lit8 v9, v8, 0x6d

    .line 1627
    .line 1628
    rem-int/lit16 v13, v9, 0x80

    .line 1629
    .line 1630
    sput v13, LVa/y7;->m:I

    .line 1631
    .line 1632
    rem-int/lit8 v9, v9, 0x2

    .line 1633
    .line 1634
    if-eqz v9, :cond_2c

    .line 1635
    .line 1636
    new-instance v9, LVa/o7;

    .line 1637
    .line 1638
    const/16 v13, 0x9

    .line 1639
    .line 1640
    invoke-direct {v9, v13}, LVa/a;-><init>(I)V

    .line 1641
    .line 1642
    .line 1643
    iput-object v7, v9, LVa/o7;->y:LVa/a;

    .line 1644
    .line 1645
    iput-object v0, v9, LVa/o7;->z:LVa/a;

    .line 1646
    .line 1647
    new-instance v0, LVa/q;

    .line 1648
    .line 1649
    const/4 v7, 0x2

    .line 1650
    invoke-direct {v0, v7}, LVa/q;-><init>(I)V

    .line 1651
    .line 1652
    .line 1653
    iput-object v4, v0, LVa/q;->b:Ljava/lang/Object;

    .line 1654
    .line 1655
    add-int/lit8 v8, v8, 0x75

    .line 1656
    .line 1657
    rem-int/lit16 v8, v8, 0x80

    .line 1658
    .line 1659
    sput v8, LVa/y7;->m:I

    .line 1660
    .line 1661
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1662
    .line 1663
    .line 1664
    new-instance v7, LVa/Ga;

    .line 1665
    .line 1666
    invoke-direct {v7}, LVa/Ga;-><init>()V

    .line 1667
    .line 1668
    .line 1669
    iput-object v11, v7, LVa/Ga;->h:Ljava/lang/Object;

    .line 1670
    .line 1671
    iput-object v2, v7, LVa/Ga;->d:Ljava/lang/Object;

    .line 1672
    .line 1673
    iput-object v6, v7, LVa/Ga;->e:Ljava/lang/Object;

    .line 1674
    .line 1675
    iput-object v9, v7, LVa/Ga;->f:Ljava/lang/Object;

    .line 1676
    .line 1677
    iput-object v0, v7, LVa/Ga;->g:Ljava/lang/Object;

    .line 1678
    .line 1679
    invoke-static {v7}, LVa/Cb;->g(LVa/Ba;)V

    .line 1680
    .line 1681
    .line 1682
    sget v0, LVa/ba;->h:I

    .line 1683
    .line 1684
    add-int/lit8 v0, v0, 0x7d

    .line 1685
    .line 1686
    rem-int/lit16 v0, v0, 0x80

    .line 1687
    .line 1688
    sput v0, LVa/ba;->i:I

    .line 1689
    .line 1690
    sget v0, LVa/y7;->m:I

    .line 1691
    .line 1692
    const/16 v24, 0x3

    .line 1693
    .line 1694
    add-int/lit8 v0, v0, 0x3

    .line 1695
    .line 1696
    rem-int/lit16 v0, v0, 0x80

    .line 1697
    .line 1698
    sput v0, LVa/y7;->l:I

    .line 1699
    .line 1700
    goto :goto_15

    .line 1701
    :cond_2c
    throw v17

    .line 1702
    :cond_2d
    throw v17

    .line 1703
    :cond_2e
    move-object/from16 v18, v0

    .line 1704
    .line 1705
    move-object/from16 v19, v9

    .line 1706
    .line 1707
    const/4 v5, 0x1

    .line 1708
    const/16 v24, 0x3

    .line 1709
    .line 1710
    :goto_15
    sget v0, LVa/y7;->l:I

    .line 1711
    .line 1712
    add-int/lit8 v0, v0, 0x6f

    .line 1713
    .line 1714
    rem-int/lit16 v0, v0, 0x80

    .line 1715
    .line 1716
    sput v0, LVa/y7;->m:I

    .line 1717
    .line 1718
    const/16 v0, 0x30

    .line 1719
    .line 1720
    invoke-static {v14, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 1721
    .line 1722
    .line 1723
    move-result v2

    .line 1724
    rsub-int/lit8 v2, v2, 0x7

    .line 1725
    .line 1726
    invoke-static {v14}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 1727
    .line 1728
    .line 1729
    move-result v6

    .line 1730
    rsub-int v6, v6, 0xee

    .line 1731
    .line 1732
    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    .line 1733
    .line 1734
    .line 1735
    move-result v7

    .line 1736
    add-int/lit8 v7, v7, 0x14

    .line 1737
    .line 1738
    shr-int/lit8 v7, v7, 0x6

    .line 1739
    .line 1740
    rsub-int/lit8 v7, v7, 0x7

    .line 1741
    .line 1742
    invoke-static {v12, v2, v6, v7, v3}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    invoke-virtual {v4, v2, v10}, LVa/y7;->y(Ljava/lang/String;LVa/h8;)V

    .line 1751
    .line 1752
    .line 1753
    :goto_16
    move v6, v0

    .line 1754
    move v8, v5

    .line 1755
    move-object/from16 v5, v17

    .line 1756
    .line 1757
    move-object/from16 v0, v18

    .line 1758
    .line 1759
    move-object/from16 v9, v19

    .line 1760
    .line 1761
    move/from16 v2, v21

    .line 1762
    .line 1763
    move/from16 v7, v24

    .line 1764
    .line 1765
    goto/16 :goto_5

    .line 1766
    .line 1767
    :cond_2f
    invoke-virtual {v10}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v0

    .line 1771
    invoke-virtual {v4, v0}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 1772
    .line 1773
    .line 1774
    throw v17

    .line 1775
    :cond_30
    throw v17

    .line 1776
    :cond_31
    move-object/from16 v18, v0

    .line 1777
    .line 1778
    move/from16 v21, v2

    .line 1779
    .line 1780
    move-object/from16 v17, v5

    .line 1781
    .line 1782
    move v0, v6

    .line 1783
    move/from16 v24, v7

    .line 1784
    .line 1785
    move v5, v8

    .line 1786
    const/16 v16, 0x0

    .line 1787
    .line 1788
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 1789
    .line 1790
    .line 1791
    move-result v2

    .line 1792
    cmpl-float v2, v2, v16

    .line 1793
    .line 1794
    rsub-int/lit8 v2, v2, 0x7f

    .line 1795
    .line 1796
    const-string v6, "\u0082\u0090\u0089\u008f\u008e\u0089\u0085\u0089\u008b\u0089\u008d\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081"

    .line 1797
    .line 1798
    invoke-static {v2, v6}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v2

    .line 1802
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v2

    .line 1806
    new-instance v6, Ljava/util/ArrayList;

    .line 1807
    .line 1808
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual {v4, v2, v6}, LVa/y7;->t(Ljava/lang/String;Ljava/util/List;)V

    .line 1812
    .line 1813
    .line 1814
    sget v2, LVa/y7;->l:I

    .line 1815
    .line 1816
    add-int/lit8 v2, v2, 0x3f

    .line 1817
    .line 1818
    rem-int/lit16 v2, v2, 0x80

    .line 1819
    .line 1820
    sput v2, LVa/y7;->m:I

    .line 1821
    .line 1822
    move v6, v0

    .line 1823
    move v8, v5

    .line 1824
    move-object/from16 v5, v17

    .line 1825
    .line 1826
    move-object/from16 v0, v18

    .line 1827
    .line 1828
    move/from16 v2, v21

    .line 1829
    .line 1830
    move/from16 v7, v24

    .line 1831
    .line 1832
    goto/16 :goto_4

    .line 1833
    .line 1834
    :cond_32
    return-void

    .line 1835
    :goto_17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1836
    throw v0

    .line 1837
    :sswitch_data_0
    .sparse-switch
        -0x6ccfeae5 -> :sswitch_4
        -0x62b40cf1 -> :sswitch_3
        -0x2ef42410 -> :sswitch_2
        0x373aa5 -> :sswitch_1
        0x44391737 -> :sswitch_0
    .end sparse-switch
.end method

.method public final j()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/B7;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->h:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->a:LVa/b8;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LVa/b8;->m:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x35

    .line 17
    .line 18
    rem-int/lit16 v2, v1, 0x80

    .line 19
    .line 20
    sput v2, LVa/b8;->n:I

    .line 21
    .line 22
    rem-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    div-int/lit8 v1, v1, 0x0

    .line 28
    .line 29
    :cond_0
    sget v1, LVa/B7;->i:I

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x27

    .line 32
    .line 33
    rem-int/lit16 v1, v1, 0x80

    .line 34
    .line 35
    sput v1, LVa/B7;->h:I

    .line 36
    .line 37
    iget-object v0, v0, LVa/b8;->c:Ljava/lang/String;

    .line 38
    .line 39
    return-object v0
.end method

.method public final declared-synchronized l(LVa/Xa;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/B7;->h:I

    .line 3
    .line 4
    iput-object p1, p0, LVa/B7;->g:LVa/Xa;

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x17

    .line 7
    .line 8
    rem-int/lit16 v0, v0, 0x80

    .line 9
    .line 10
    sput v0, LVa/B7;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final m(LVa/g8;)LVa/ha;
    .locals 4

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B7;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, LVa/B7;->a:LVa/b8;

    .line 17
    .line 18
    invoke-virtual {v0}, LVa/b8;->c()Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v2, LVa/g8;->i:I

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x47

    .line 25
    .line 26
    rem-int/lit16 v3, v2, 0x80

    .line 27
    .line 28
    sput v3, LVa/g8;->j:I

    .line 29
    .line 30
    rem-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x17

    .line 35
    .line 36
    rem-int/lit16 v3, v3, 0x80

    .line 37
    .line 38
    sput v3, LVa/g8;->i:I

    .line 39
    .line 40
    iget-object v2, p1, LVa/g8;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, LVa/g8;

    .line 47
    .line 48
    new-instance v2, LVa/ha;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, LVa/B7;->m(LVa/g8;)LVa/ha;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, v2, LVa/ha;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v0, v2, LVa/ha;->b:Ljava/lang/Object;

    .line 60
    .line 61
    sget p1, LVa/B7;->i:I

    .line 62
    .line 63
    add-int/lit8 p1, p1, 0x9

    .line 64
    .line 65
    rem-int/lit16 v0, p1, 0x80

    .line 66
    .line 67
    sput v0, LVa/B7;->h:I

    .line 68
    .line 69
    rem-int/lit8 p1, p1, 0x2

    .line 70
    .line 71
    if-nez p1, :cond_0

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_0
    throw v1

    .line 75
    :cond_1
    throw v1

    .line 76
    :cond_2
    return-object v1

    .line 77
    :cond_3
    throw v1
.end method

.method public final n()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/B7;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B7;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/B7;->a:LVa/b8;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, LVa/b8;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {v1}, LVa/b8;->e()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0
.end method

.method public final o()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B7;->a:LVa/b8;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LVa/b8;->n:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0xf

    .line 17
    .line 18
    rem-int/lit16 v2, v1, 0x80

    .line 19
    .line 20
    sput v2, LVa/b8;->m:I

    .line 21
    .line 22
    rem-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x19

    .line 28
    .line 29
    rem-int/lit16 v1, v2, 0x80

    .line 30
    .line 31
    sput v1, LVa/b8;->n:I

    .line 32
    .line 33
    rem-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    sget v1, LVa/B7;->h:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x57

    .line 40
    .line 41
    rem-int/lit16 v1, v1, 0x80

    .line 42
    .line 43
    sput v1, LVa/B7;->i:I

    .line 44
    .line 45
    iget-object v0, v0, LVa/b8;->d:Ljava/lang/String;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_0
    throw v3

    .line 49
    :cond_1
    throw v3
.end method

.method public final p(Ljava/lang/String;Ljava/util/List;)V
    .locals 9

    .line 1
    sget v0, LVa/B7;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B7;->h:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/B7;->c()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, LVa/y7;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    rsub-int/lit8 v5, v5, 0x10

    .line 44
    .line 45
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    shr-int/lit8 v6, v6, 0x16

    .line 50
    .line 51
    add-int/lit16 v6, v6, 0xe3

    .line 52
    .line 53
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    shr-int/lit8 v7, v7, 0x10

    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x10

    .line 60
    .line 61
    const-string v8, "\ufff1\r\r\u000b\n\uffff\uffe0\u0010\r\uffff\u0002\u0001\uffff\u0011\u0012\uffcc"

    .line 62
    .line 63
    invoke-static {v8, v5, v6, v7, v4}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1, v3, p2}, LVa/y7;->t(Ljava/lang/String;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    sget v1, LVa/y7;->l:I

    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x47

    .line 87
    .line 88
    rem-int/lit16 v3, v1, 0x80

    .line 89
    .line 90
    sput v3, LVa/y7;->m:I

    .line 91
    .line 92
    rem-int/lit8 v1, v1, 0x2

    .line 93
    .line 94
    if-eqz v1, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    throw v2

    .line 98
    :cond_1
    sget p1, LVa/B7;->h:I

    .line 99
    .line 100
    add-int/lit8 p1, p1, 0x41

    .line 101
    .line 102
    rem-int/lit16 p2, p1, 0x80

    .line 103
    .line 104
    sput p2, LVa/B7;->i:I

    .line 105
    .line 106
    rem-int/lit8 p1, p1, 0x2

    .line 107
    .line 108
    if-eqz p1, :cond_2

    .line 109
    .line 110
    return-void

    .line 111
    :cond_2
    throw v2
.end method

.method public final q()V
    .locals 6

    .line 1
    sget v0, LVa/B7;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/B7;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/B7;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_7

    .line 25
    .line 26
    sget v1, LVa/B7;->i:I

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x6b

    .line 29
    .line 30
    rem-int/lit16 v1, v1, 0x80

    .line 31
    .line 32
    sput v1, LVa/B7;->h:I

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LVa/y7;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget v3, LVa/y7;->l:I

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x71

    .line 46
    .line 47
    rem-int/lit16 v3, v3, 0x80

    .line 48
    .line 49
    sput v3, LVa/y7;->m:I

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x69

    .line 52
    .line 53
    rem-int/lit16 v3, v3, 0x80

    .line 54
    .line 55
    sput v3, LVa/y7;->l:I

    .line 56
    .line 57
    iget-object v3, v1, LVa/y7;->j:LVa/ba;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v4, LVa/Nb;

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    invoke-direct {v4, v5}, LVa/Nb;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object v3, v4, LVa/Nb;->d:LVa/ba;

    .line 69
    .line 70
    invoke-static {v4}, LVa/Cb;->g(LVa/Ba;)V

    .line 71
    .line 72
    .line 73
    sget v4, LVa/ba;->i:I

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x6f

    .line 76
    .line 77
    rem-int/lit16 v5, v4, 0x80

    .line 78
    .line 79
    sput v5, LVa/ba;->h:I

    .line 80
    .line 81
    rem-int/lit8 v4, v4, 0x2

    .line 82
    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    const/16 v4, 0x33

    .line 86
    .line 87
    div-int/lit8 v4, v4, 0x0

    .line 88
    .line 89
    :cond_0
    sget v4, LVa/y7;->l:I

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x5f

    .line 92
    .line 93
    rem-int/lit16 v4, v4, 0x80

    .line 94
    .line 95
    sput v4, LVa/y7;->m:I

    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x53

    .line 98
    .line 99
    rem-int/lit16 v5, v4, 0x80

    .line 100
    .line 101
    sput v5, LVa/y7;->l:I

    .line 102
    .line 103
    rem-int/lit8 v4, v4, 0x2

    .line 104
    .line 105
    invoke-virtual {v3}, LVa/ba;->s()V

    .line 106
    .line 107
    .line 108
    if-nez v4, :cond_6

    .line 109
    .line 110
    sget v4, LVa/y7;->l:I

    .line 111
    .line 112
    add-int/lit8 v4, v4, 0x7

    .line 113
    .line 114
    rem-int/lit16 v5, v4, 0x80

    .line 115
    .line 116
    sput v5, LVa/y7;->m:I

    .line 117
    .line 118
    rem-int/lit8 v4, v4, 0x2

    .line 119
    .line 120
    invoke-virtual {v3}, LVa/ba;->j()V

    .line 121
    .line 122
    .line 123
    if-eqz v4, :cond_5

    .line 124
    .line 125
    sget v3, LVa/y7;->m:I

    .line 126
    .line 127
    add-int/lit8 v3, v3, 0x15

    .line 128
    .line 129
    rem-int/lit16 v4, v3, 0x80

    .line 130
    .line 131
    sput v4, LVa/y7;->l:I

    .line 132
    .line 133
    rem-int/lit8 v3, v3, 0x2

    .line 134
    .line 135
    if-eqz v3, :cond_1

    .line 136
    .line 137
    const/16 v3, 0x3f

    .line 138
    .line 139
    div-int/lit8 v3, v3, 0x0

    .line 140
    .line 141
    :cond_1
    iget-object v3, v1, LVa/y7;->f:LVa/v7;

    .line 142
    .line 143
    if-eqz v3, :cond_2

    .line 144
    .line 145
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v4, v1, LVa/y7;->f:LVa/v7;

    .line 150
    .line 151
    invoke-virtual {v3, v4}, LVa/fb;->k(LVa/db;)V

    .line 152
    .line 153
    .line 154
    iput-object v2, v1, LVa/y7;->f:LVa/v7;

    .line 155
    .line 156
    sget v3, LVa/y7;->l:I

    .line 157
    .line 158
    add-int/lit8 v3, v3, 0x29

    .line 159
    .line 160
    rem-int/lit16 v3, v3, 0x80

    .line 161
    .line 162
    sput v3, LVa/y7;->m:I

    .line 163
    .line 164
    :cond_2
    iget-object v3, v1, LVa/y7;->g:LA7/b0;

    .line 165
    .line 166
    if-eqz v3, :cond_4

    .line 167
    .line 168
    sget v4, LVa/y7;->l:I

    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x25

    .line 171
    .line 172
    rem-int/lit16 v5, v4, 0x80

    .line 173
    .line 174
    sput v5, LVa/y7;->m:I

    .line 175
    .line 176
    rem-int/lit8 v4, v4, 0x2

    .line 177
    .line 178
    if-nez v4, :cond_3

    .line 179
    .line 180
    invoke-virtual {v3}, LA7/b0;->x()V

    .line 181
    .line 182
    .line 183
    iput-object v2, v1, LVa/y7;->g:LA7/b0;

    .line 184
    .line 185
    const/16 v3, 0x2b

    .line 186
    .line 187
    div-int/lit8 v3, v3, 0x0

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_3
    invoke-virtual {v3}, LA7/b0;->x()V

    .line 191
    .line 192
    .line 193
    iput-object v2, v1, LVa/y7;->g:LA7/b0;

    .line 194
    .line 195
    :cond_4
    :goto_1
    iput-object v2, v1, LVa/y7;->e:LVa/Ra;

    .line 196
    .line 197
    sget v1, LVa/B7;->i:I

    .line 198
    .line 199
    add-int/lit8 v1, v1, 0x11

    .line 200
    .line 201
    rem-int/lit16 v1, v1, 0x80

    .line 202
    .line 203
    sput v1, LVa/B7;->h:I

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_5
    throw v2

    .line 208
    :cond_6
    throw v2

    .line 209
    :cond_7
    new-instance v0, LVa/S;

    .line 210
    .line 211
    const/4 v1, 0x1

    .line 212
    invoke-direct {v0, v1}, LVa/S;-><init>(I)V

    .line 213
    .line 214
    .line 215
    iput-object p0, v0, LVa/S;->d:LVa/B7;

    .line 216
    .line 217
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    throw v2
.end method
