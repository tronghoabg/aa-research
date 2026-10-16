.class public final LCd/p;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LCd/p;->a:I

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljf/c;I)V
    .locals 0

    .line 2
    iput p3, p0, LCd/p;->a:I

    iput-object p1, p0, LCd/p;->d:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LCd/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LRd/e;

    .line 7
    .line 8
    check-cast p2, LGd/c;

    .line 9
    .line 10
    check-cast p3, Ljf/c;

    .line 11
    .line 12
    new-instance p2, LCd/p;

    .line 13
    .line 14
    iget-object v0, p0, LCd/p;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lwd/c;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-direct {p2, v0, p3, v1}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p2, LCd/p;->c:Ljava/lang/Object;

    .line 23
    .line 24
    sget-object p1, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :pswitch_0
    check-cast p1, LHf/m;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Throwable;

    .line 34
    .line 35
    check-cast p3, Ljf/c;

    .line 36
    .line 37
    new-instance v0, LCd/p;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v0, v1, p3, v2}, LCd/p;-><init>(ILjf/c;I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v0, LCd/p;->c:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p2, v0, LCd/p;->d:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p1, Lef/C;->a:Lef/C;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_1
    check-cast p1, LRd/e;

    .line 56
    .line 57
    check-cast p3, Ljf/c;

    .line 58
    .line 59
    new-instance p2, LCd/p;

    .line 60
    .line 61
    iget-object v0, p0, LCd/p;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ltf/p;

    .line 64
    .line 65
    const/4 v1, 0x3

    .line 66
    invoke-direct {p2, v0, p3, v1}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p2, LCd/p;->c:Ljava/lang/Object;

    .line 70
    .line 71
    sget-object p1, Lef/C;->a:Lef/C;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :pswitch_2
    check-cast p1, LRd/e;

    .line 79
    .line 80
    check-cast p3, Ljf/c;

    .line 81
    .line 82
    new-instance p2, LCd/p;

    .line 83
    .line 84
    iget-object v0, p0, LCd/p;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ltf/r;

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    invoke-direct {p2, v0, p3, v1}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p2, LCd/p;->c:Ljava/lang/Object;

    .line 93
    .line 94
    sget-object p1, Lef/C;->a:Lef/C;

    .line 95
    .line 96
    invoke-virtual {p2, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_3
    check-cast p1, LRd/e;

    .line 102
    .line 103
    check-cast p2, LGd/c;

    .line 104
    .line 105
    check-cast p3, Ljf/c;

    .line 106
    .line 107
    new-instance v0, LCd/p;

    .line 108
    .line 109
    const/4 v1, 0x3

    .line 110
    const/4 v2, 0x1

    .line 111
    invoke-direct {v0, v1, p3, v2}, LCd/p;-><init>(ILjf/c;I)V

    .line 112
    .line 113
    .line 114
    iput-object p1, v0, LCd/p;->c:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object p2, v0, LCd/p;->d:Ljava/lang/Object;

    .line 117
    .line 118
    sget-object p1, Lef/C;->a:Lef/C;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_4
    check-cast p1, LRd/e;

    .line 126
    .line 127
    check-cast p3, Ljf/c;

    .line 128
    .line 129
    new-instance v0, LCd/p;

    .line 130
    .line 131
    const/4 v1, 0x3

    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-direct {v0, v1, p3, v2}, LCd/p;-><init>(ILjf/c;I)V

    .line 134
    .line 135
    .line 136
    iput-object p1, v0, LCd/p;->c:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object p2, v0, LCd/p;->d:Ljava/lang/Object;

    .line 139
    .line 140
    sget-object p1, Lef/C;->a:Lef/C;

    .line 141
    .line 142
    invoke-virtual {v0, p1}, LCd/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 3
    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget v4, p0, LCd/p;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 13
    .line 14
    iget v4, p0, LCd/p;->b:I

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, LCd/p;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, LRd/e;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LRd/e;

    .line 42
    .line 43
    :try_start_1
    iput-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 44
    .line 45
    iput v3, p0, LCd/p;->b:I

    .line 46
    .line 47
    invoke-virtual {p1, p0}, LRd/e;->d(Ljf/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    if-ne v2, v0, :cond_2

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-object v0, p1

    .line 56
    move-object p1, v2

    .line 57
    :goto_0
    :try_start_2
    check-cast p1, LGd/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    :goto_1
    return-object v1

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    move-object v10, v0

    .line 62
    move-object v0, p1

    .line 63
    move-object p1, v10

    .line 64
    :goto_2
    iget-object v1, p0, LCd/p;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lwd/c;

    .line 67
    .line 68
    iget-object v1, v1, Lwd/c;->j:Ly3/j;

    .line 69
    .line 70
    sget-object v2, LHd/a;->d:Lwa/a;

    .line 71
    .line 72
    iget-object v0, v0, LRd/e;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lxd/c;

    .line 75
    .line 76
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, v1, Ly3/j;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, LPd/b;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, LPd/b;->a(Lwa/a;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, LVa/M6;->z(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :pswitch_0
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 95
    .line 96
    iget v5, p0, LCd/p;->b:I

    .line 97
    .line 98
    if-eqz v5, :cond_4

    .line 99
    .line 100
    if-ne v5, v3, :cond_3

    .line 101
    .line 102
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, LHf/m;

    .line 118
    .line 119
    iget-object v2, p0, LCd/p;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, Ljava/lang/Throwable;

    .line 122
    .line 123
    const-string v5, "FirebaseSessionsRepo"

    .line 124
    .line 125
    const-string v6, "Error reading stored session data."

    .line 126
    .line 127
    invoke-static {v5, v6, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 128
    .line 129
    .line 130
    new-instance v2, Lx1/b;

    .line 131
    .line 132
    invoke-direct {v2, v3}, Lx1/b;-><init>(Z)V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, LCd/p;->c:Ljava/lang/Object;

    .line 136
    .line 137
    iput v3, p0, LCd/p;->b:I

    .line 138
    .line 139
    invoke-interface {p1, v2, p0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v4, :cond_5

    .line 144
    .line 145
    move-object v1, v4

    .line 146
    :cond_5
    :goto_3
    return-object v1

    .line 147
    :pswitch_1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 148
    .line 149
    iget v4, p0, LCd/p;->b:I

    .line 150
    .line 151
    if-eqz v4, :cond_7

    .line 152
    .line 153
    if-ne v4, v3, :cond_6

    .line 154
    .line 155
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_7
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p1, LRd/e;

    .line 171
    .line 172
    iget-object p1, p1, LRd/e;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput v3, p0, LCd/p;->b:I

    .line 175
    .line 176
    iget-object v2, p0, LCd/p;->d:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Ltf/p;

    .line 179
    .line 180
    invoke-interface {v2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-ne p1, v0, :cond_8

    .line 185
    .line 186
    move-object v1, v0

    .line 187
    :cond_8
    :goto_4
    return-object v1

    .line 188
    :pswitch_2
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 189
    .line 190
    iget v4, p0, LCd/p;->b:I

    .line 191
    .line 192
    if-eqz v4, :cond_a

    .line 193
    .line 194
    if-ne v4, v3, :cond_9

    .line 195
    .line 196
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_a
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p1, LRd/e;

    .line 212
    .line 213
    new-instance v2, LDd/f;

    .line 214
    .line 215
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 216
    .line 217
    .line 218
    iget-object v4, p1, LRd/e;->a:Ljava/lang/Object;

    .line 219
    .line 220
    invoke-virtual {p1}, LRd/e;->c()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iput v3, p0, LCd/p;->b:I

    .line 225
    .line 226
    iget-object v3, p0, LCd/p;->d:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v3, Ltf/r;

    .line 229
    .line 230
    invoke-interface {v3, v2, v4, p1, p0}, Ltf/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v0, :cond_b

    .line 235
    .line 236
    move-object v1, v0

    .line 237
    :cond_b
    :goto_5
    return-object v1

    .line 238
    :pswitch_3
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 239
    .line 240
    iget v5, p0, LCd/p;->b:I

    .line 241
    .line 242
    if-eqz v5, :cond_d

    .line 243
    .line 244
    if-ne v5, v3, :cond_c

    .line 245
    .line 246
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_d
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p1, LRd/e;

    .line 262
    .line 263
    iget-object v2, p0, LCd/p;->d:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v2, LGd/c;

    .line 266
    .line 267
    iget-object v5, v2, LGd/c;->a:LSd/a;

    .line 268
    .line 269
    iget-object v2, v2, LGd/c;->b:Ljava/lang/Object;

    .line 270
    .line 271
    instance-of v6, v2, Lio/ktor/utils/io/t;

    .line 272
    .line 273
    if-nez v6, :cond_e

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_e
    iget-object v6, v5, LSd/a;->a:Lkotlin/reflect/KClass;

    .line 277
    .line 278
    sget-object v7, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 279
    .line 280
    const-class v8, Ljava/io/InputStream;

    .line 281
    .line 282
    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-eqz v6, :cond_f

    .line 291
    .line 292
    check-cast v2, Lio/ktor/utils/io/t;

    .line 293
    .line 294
    iget-object v6, p1, LRd/e;->a:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v6, Lxd/c;

    .line 297
    .line 298
    invoke-virtual {v6}, Lxd/c;->getCoroutineContext()Ljf/h;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    sget-object v7, LEf/l0;->a:LEf/l0;

    .line 303
    .line 304
    invoke-interface {v6, v7}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    check-cast v6, LEf/m0;

    .line 309
    .line 310
    const-string v6, "<this>"

    .line 311
    .line 312
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v6, LCd/t;

    .line 316
    .line 317
    invoke-direct {v6, v2, v3}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 318
    .line 319
    .line 320
    new-instance v2, LCd/t;

    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    invoke-direct {v2, v6, v7}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 324
    .line 325
    .line 326
    new-instance v6, LGd/c;

    .line 327
    .line 328
    invoke-direct {v6, v5, v2}, LGd/c;-><init>(LSd/a;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iput-object v0, p0, LCd/p;->c:Ljava/lang/Object;

    .line 332
    .line 333
    iput v3, p0, LCd/p;->b:I

    .line 334
    .line 335
    invoke-virtual {p1, v6, p0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-ne p1, v4, :cond_f

    .line 340
    .line 341
    move-object v1, v4

    .line 342
    :cond_f
    :goto_6
    return-object v1

    .line 343
    :pswitch_4
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 344
    .line 345
    iget v5, p0, LCd/p;->b:I

    .line 346
    .line 347
    if-eqz v5, :cond_11

    .line 348
    .line 349
    if-ne v5, v3, :cond_10

    .line 350
    .line 351
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_9

    .line 355
    .line 356
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 357
    .line 358
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p1

    .line 362
    :cond_11
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    iget-object p1, p0, LCd/p;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast p1, LRd/e;

    .line 368
    .line 369
    iget-object v2, p0, LCd/p;->d:Ljava/lang/Object;

    .line 370
    .line 371
    iget-object v5, p1, LRd/e;->a:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v5, LFd/c;

    .line 374
    .line 375
    iget-object v5, v5, LFd/c;->c:LJd/n;

    .line 376
    .line 377
    sget-object v6, LJd/p;->a:Ljava/util/List;

    .line 378
    .line 379
    const-string v6, "Accept"

    .line 380
    .line 381
    invoke-virtual {v5, v6}, LA7/B0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    iget-object v7, p1, LRd/e;->a:Ljava/lang/Object;

    .line 386
    .line 387
    if-nez v5, :cond_12

    .line 388
    .line 389
    move-object v5, v7

    .line 390
    check-cast v5, LFd/c;

    .line 391
    .line 392
    iget-object v5, v5, LFd/c;->c:LJd/n;

    .line 393
    .line 394
    const-string v8, "*/*"

    .line 395
    .line 396
    invoke-virtual {v5, v6, v8}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :cond_12
    move-object v5, v7

    .line 400
    check-cast v5, LJd/r;

    .line 401
    .line 402
    invoke-static {v5}, Lff/B;->i(LJd/r;)LJd/f;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    instance-of v6, v2, Ljava/lang/String;

    .line 407
    .line 408
    if-eqz v6, :cond_14

    .line 409
    .line 410
    new-instance v6, LMd/d;

    .line 411
    .line 412
    move-object v8, v2

    .line 413
    check-cast v8, Ljava/lang/String;

    .line 414
    .line 415
    if-nez v5, :cond_13

    .line 416
    .line 417
    sget-object v5, LJd/e;->a:LJd/f;

    .line 418
    .line 419
    :cond_13
    invoke-direct {v6, v8, v5}, LMd/d;-><init>(Ljava/lang/String;LJd/f;)V

    .line 420
    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_14
    instance-of v6, v2, [B

    .line 424
    .line 425
    if-eqz v6, :cond_15

    .line 426
    .line 427
    new-instance v6, LCd/n;

    .line 428
    .line 429
    invoke-direct {v6, v5, v2}, LCd/n;-><init>(LJd/f;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_15
    instance-of v6, v2, Lio/ktor/utils/io/t;

    .line 434
    .line 435
    if-eqz v6, :cond_16

    .line 436
    .line 437
    new-instance v6, LCd/o;

    .line 438
    .line 439
    invoke-direct {v6, p1, v5, v2}, LCd/o;-><init>(LRd/e;LJd/f;Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_16
    instance-of v6, v2, LMd/c;

    .line 444
    .line 445
    if-eqz v6, :cond_17

    .line 446
    .line 447
    move-object v6, v2

    .line 448
    check-cast v6, LMd/c;

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_17
    move-object v6, v7

    .line 452
    check-cast v6, LFd/c;

    .line 453
    .line 454
    const-string v8, "context"

    .line 455
    .line 456
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    const-string v8, "body"

    .line 460
    .line 461
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    instance-of v8, v2, Ljava/io/InputStream;

    .line 465
    .line 466
    if-eqz v8, :cond_18

    .line 467
    .line 468
    new-instance v8, LCd/o;

    .line 469
    .line 470
    invoke-direct {v8, v6, v5, v2}, LCd/o;-><init>(LFd/c;LJd/f;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    move-object v6, v8

    .line 474
    goto :goto_7

    .line 475
    :cond_18
    move-object v6, v0

    .line 476
    :goto_7
    if-eqz v6, :cond_19

    .line 477
    .line 478
    invoke-virtual {v6}, LMd/c;->b()LJd/f;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    goto :goto_8

    .line 483
    :cond_19
    move-object v5, v0

    .line 484
    :goto_8
    if-eqz v5, :cond_1a

    .line 485
    .line 486
    check-cast v7, LFd/c;

    .line 487
    .line 488
    iget-object v5, v7, LFd/c;->c:LJd/n;

    .line 489
    .line 490
    iget-object v5, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v5, Ljava/util/Map;

    .line 493
    .line 494
    const-string v8, "Content-Type"

    .line 495
    .line 496
    invoke-interface {v5, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    sget-object v5, LCd/s;->a:Lvg/b;

    .line 500
    .line 501
    new-instance v8, Ljava/lang/StringBuilder;

    .line 502
    .line 503
    const-string v9, "Transformed with default transformers request body for "

    .line 504
    .line 505
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    iget-object v7, v7, LFd/c;->a:LJd/B;

    .line 509
    .line 510
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    const-string v7, " from "

    .line 514
    .line 515
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    sget-object v7, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 523
    .line 524
    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-interface {v5, v2}, Lvg/b;->s(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    iput-object v0, p0, LCd/p;->c:Ljava/lang/Object;

    .line 539
    .line 540
    iput v3, p0, LCd/p;->b:I

    .line 541
    .line 542
    invoke-virtual {p1, v6, p0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object p1

    .line 546
    if-ne p1, v4, :cond_1a

    .line 547
    .line 548
    move-object v1, v4

    .line 549
    :cond_1a
    :goto_9
    return-object v1

    .line 550
    nop

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
