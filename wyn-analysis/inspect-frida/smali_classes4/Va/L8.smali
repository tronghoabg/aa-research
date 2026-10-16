.class public final LVa/L8;
.super LVa/I8;
.source "SourceFile"


# direct methods
.method public static h(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p1, LVa/a;->t:I

    .line 11
    .line 12
    array-length p1, p0

    .line 13
    new-array p1, p1, [C

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
    array-length v2, p0

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p0, v1

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
    const-wide v4, -0x3c56cd4a52c1efdcL    # -9.07856677729473E17

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
    aput-char v2, p1, v1

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
    new-instance p0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p0

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 9

    .line 1
    const-string v0, "\u1061\u0eb5\u2d90\u4ce2\u6bda\u8a6b\ua913\uc867\ue75d\u05b3\u248f\u4384\u62f4\u81ca\ua020\udf0e\ufe34\u1d44\u3ba7\u5a9f\u79eb\u98d8\ub7d4\ud628\uf51c\u147b\u330a\u51b2\u7095\u6fe7\u8e9e\uad3c\ucc3c\ueb17\u0a70\u2948\u47bb\u6698\u85ff\ua4de\uc332\ue25f\u013d"

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/I8;->e()LVa/y8;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, LVa/I8;->g()LVa/y8;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, LVa/s8;->c()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    new-instance v4, LVa/s8;

    .line 29
    .line 30
    check-cast v3, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-virtual {v1}, LVa/s8;->c()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v4, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v4

    .line 46
    :catch_0
    move-exception v1

    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_0
    instance-of v4, v3, Lorg/json/JSONArray;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    new-instance v4, LVa/s8;

    .line 54
    .line 55
    check-cast v3, Lorg/json/JSONArray;

    .line 56
    .line 57
    invoke-virtual {v1}, LVa/s8;->a()Ljava/lang/Number;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v4, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object v4

    .line 73
    :cond_1
    instance-of v4, v3, Ljava/util/Map;

    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    new-instance v4, LVa/s8;

    .line 78
    .line 79
    check-cast v3, Ljava/util/Map;

    .line 80
    .line 81
    invoke-virtual {v1}, LVa/s8;->c()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-direct {v4, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :cond_2
    instance-of v4, v3, Ljava/util/List;

    .line 94
    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    new-instance v4, LVa/s8;

    .line 98
    .line 99
    check-cast v3, Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v1}, LVa/s8;->a()Ljava/lang/Number;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-direct {v4, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v4

    .line 117
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_4

    .line 126
    .line 127
    new-instance v4, LVa/s8;

    .line 128
    .line 129
    check-cast v3, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-virtual {v1}, LVa/s8;->a()Ljava/lang/Number;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    aget-object v1, v3, v1

    .line 140
    .line 141
    invoke-direct {v4, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object v4

    .line 145
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    rsub-int v4, v4, 0x1ee3

    .line 156
    .line 157
    invoke-static {v0, v4}, LVa/L8;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v4, "\u1003\uaac3\u65be\u20c7\ufb22\ub60c\u7163\u0c41\uc6ab\u81c1\u5cf2\u1734\ud258\u6d68\u2841\ue2b2\ubdd4\u78d2\u33f3\uce63\u890f\u446b\u1efa\ud99e\u94f2\u2f91\uea23\ua505\u607b\u3b58\uf5b2\ub097\u4beb\u062b\uc10a\u9c76\u5754\u11f5\uac85\u67ed\u22c6\ufd24\ub805\u734f\u0df8"

    .line 172
    .line 173
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    const-wide/16 v7, 0x0

    .line 178
    .line 179
    cmp-long v5, v5, v7

    .line 180
    .line 181
    const v6, 0xbade

    .line 182
    .line 183
    .line 184
    sub-int/2addr v6, v5

    .line 185
    invoke-static {v4, v6}, LVa/L8;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    new-instance v3, LVa/j8;

    .line 204
    .line 205
    invoke-direct {v3, p2, p1, v1, v2}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v3, v1}, LVa/j8;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    .line 215
    goto :goto_1

    .line 216
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    shr-int/lit8 v4, v4, 0x10

    .line 226
    .line 227
    add-int/lit16 v4, v4, 0x1ee3

    .line 228
    .line 229
    invoke-static {v0, v4}, LVa/L8;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v0, ""

    .line 244
    .line 245
    const/16 v4, 0x30

    .line 246
    .line 247
    invoke-static {v0, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    const v4, 0xf9fe

    .line 252
    .line 253
    .line 254
    add-int/2addr v0, v4

    .line 255
    const-string v4, "\u1003"

    .line 256
    .line 257
    invoke-static {v4, v0}, LVa/L8;->h(Ljava/lang/String;I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v3, LVa/j8;

    .line 273
    .line 274
    invoke-direct {v3, p2, p1, v0, v1}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {v3, p1}, LVa/j8;->d(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :goto_1
    new-instance p1, LVa/s8;

    .line 285
    .line 286
    invoke-direct {p1, v2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-object p1
.end method
