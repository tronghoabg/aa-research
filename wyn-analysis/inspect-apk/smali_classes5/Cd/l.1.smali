.class public final LCd/l;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LGd/a;

.field public b:I

.field public c:I

.field public synthetic d:Ljava/lang/Object;


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, LCd/l;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, v0, LCd/l;->d:Ljava/lang/Object;

    .line 8
    .line 9
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGd/a;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LCd/l;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LCd/l;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LCd/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LCd/l;->c:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/16 v3, 0x12c

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v5, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    iget v0, p0, LCd/l;->b:I

    .line 18
    .line 19
    iget-object v1, p0, LCd/l;->a:LGd/a;

    .line 20
    .line 21
    iget-object v2, p0, LCd/l;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, LGd/a;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LTd/a; {:try_start_0 .. :try_end_0} :catch_1

    .line 26
    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget v1, p0, LCd/l;->b:I

    .line 39
    .line 40
    iget-object v5, p0, LCd/l;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, LGd/a;

    .line 43
    .line 44
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, LCd/l;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, LGd/a;

    .line 55
    .line 56
    invoke-virtual {p1}, LGd/a;->c()Lxd/c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Lxd/c;->b()LNd/d;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v6, LCd/F;->c:LNd/a;

    .line 65
    .line 66
    invoke-virtual {v1, v6}, LNd/d;->b(LNd/a;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    sget-object v0, LCd/m;->b:Lvg/b;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "Skipping default response validation for "

    .line 83
    .line 84
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, LGd/a;->c()Lxd/c;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lxd/c;->d()LFd/b;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {p1}, LFd/b;->getUrl()LJd/H;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {v0, p1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_3
    invoke-virtual {p1}, LGd/a;->e()LJd/v;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget v1, v1, LJd/v;->a:I

    .line 115
    .line 116
    invoke-virtual {p1}, LGd/a;->c()Lxd/c;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    if-lt v1, v3, :cond_c

    .line 121
    .line 122
    invoke-virtual {v6}, Lxd/c;->b()LNd/d;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    sget-object v8, LCd/m;->a:LNd/a;

    .line 127
    .line 128
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const-string v9, "key"

    .line 132
    .line 133
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, LNd/d;->c()Ljava/util/Map;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-interface {v7, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_4

    .line 145
    .line 146
    goto/16 :goto_7

    .line 147
    .line 148
    :cond_4
    iput-object p1, p0, LCd/l;->d:Ljava/lang/Object;

    .line 149
    .line 150
    iput v1, p0, LCd/l;->b:I

    .line 151
    .line 152
    iput v5, p0, LCd/l;->c:I

    .line 153
    .line 154
    invoke-static {v6, p0}, Lka/e0;->w(Lxd/c;Llf/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    if-ne v5, v0, :cond_5

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    move-object v10, v5

    .line 162
    move-object v5, p1

    .line 163
    move-object p1, v10

    .line 164
    :goto_0
    check-cast p1, Lxd/c;

    .line 165
    .line 166
    invoke-virtual {p1}, Lxd/c;->b()LNd/d;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    sget-object v7, LCd/m;->a:LNd/a;

    .line 171
    .line 172
    invoke-virtual {v6, v7, v2}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lxd/c;->e()LGd/a;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    :try_start_1
    iput-object v5, p0, LCd/l;->d:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p1, p0, LCd/l;->a:LGd/a;

    .line 182
    .line 183
    iput v1, p0, LCd/l;->b:I

    .line 184
    .line 185
    iput v4, p0, LCd/l;->c:I

    .line 186
    .line 187
    sget-object v2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 188
    .line 189
    invoke-static {p1, v2, p0}, Lgc/b;->h(LGd/a;Ljava/nio/charset/Charset;Llf/c;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2
    :try_end_1
    .catch LTd/a; {:try_start_1 .. :try_end_1} :catch_0

    .line 193
    if-ne v2, v0, :cond_6

    .line 194
    .line 195
    :goto_1
    return-object v0

    .line 196
    :cond_6
    move v0, v1

    .line 197
    move-object v1, p1

    .line 198
    move-object p1, v2

    .line 199
    move-object v2, v5

    .line 200
    :goto_2
    :try_start_2
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catch LTd/a; {:try_start_2 .. :try_end_2} :catch_1

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :catch_0
    move v0, v1

    .line 204
    move-object v2, v5

    .line 205
    move-object v1, p1

    .line 206
    :catch_1
    const-string p1, "<body failed decoding>"

    .line 207
    .line 208
    :goto_3
    const/16 v4, 0x190

    .line 209
    .line 210
    if-gt v3, v0, :cond_8

    .line 211
    .line 212
    if-lt v0, v4, :cond_7

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_7
    new-instance v0, LCd/g;

    .line 216
    .line 217
    const/4 v3, 0x1

    .line 218
    invoke-direct {v0, v1, p1, v3}, LCd/g;-><init>(LGd/a;Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_8
    :goto_4
    const/16 v3, 0x1f4

    .line 223
    .line 224
    if-gt v4, v0, :cond_a

    .line 225
    .line 226
    if-lt v0, v3, :cond_9

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    new-instance v0, LCd/g;

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    invoke-direct {v0, v1, p1, v3}, LCd/g;-><init>(LGd/a;Ljava/lang/String;I)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_a
    :goto_5
    if-gt v3, v0, :cond_b

    .line 237
    .line 238
    const/16 v3, 0x258

    .line 239
    .line 240
    if-ge v0, v3, :cond_b

    .line 241
    .line 242
    new-instance v0, LCd/g;

    .line 243
    .line 244
    const/4 v3, 0x2

    .line 245
    invoke-direct {v0, v1, p1, v3}, LCd/g;-><init>(LGd/a;Ljava/lang/String;I)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    new-instance v0, LCd/s0;

    .line 250
    .line 251
    invoke-direct {v0, v1, p1}, LCd/s0;-><init>(LGd/a;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    :goto_6
    sget-object p1, LCd/m;->b:Lvg/b;

    .line 255
    .line 256
    new-instance v1, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v3, "Default response validation for "

    .line 259
    .line 260
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, LGd/a;->c()Lxd/c;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v2}, Lxd/c;->d()LFd/b;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-interface {v2}, LFd/b;->getUrl()LJd/H;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string v2, " failed with "

    .line 279
    .line 280
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-interface {p1, v1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v0

    .line 294
    :cond_c
    :goto_7
    return-object v2
.end method
