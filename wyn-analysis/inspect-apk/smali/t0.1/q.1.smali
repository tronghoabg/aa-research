.class public final Lt0/q;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lt0/t;


# direct methods
.method public synthetic constructor <init>(Lt0/t;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt0/q;->i:I

    iput-object p1, p0, Lt0/q;->j:Lt0/t;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lt0/q;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LZ/j;

    .line 7
    .line 8
    check-cast p2, Lt0/y;

    .line 9
    .line 10
    const-string v0, "mod"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "toWrap"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    instance-of v0, p1, Lb0/e;

    .line 21
    .line 22
    iget-object v1, p2, Lt0/y;->s:[LX0/E;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Lt0/f;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Lb0/e;

    .line 30
    .line 31
    invoke-direct {v0, p2, v2}, Lt0/f;-><init>(Lt0/y;Lb0/e;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v1, v0, v2}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    instance-of v0, p1, Lp0/o;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    new-instance v0, Lt0/L;

    .line 44
    .line 45
    move-object v3, p1

    .line 46
    check-cast v3, Lp0/o;

    .line 47
    .line 48
    invoke-direct {v0, p2, v3}, LX0/E;-><init>(Lt0/y;LZ/j;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0, v2}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    instance-of v0, p1, Lx0/i;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    new-instance v0, Lx0/h;

    .line 59
    .line 60
    move-object v3, p1

    .line 61
    check-cast v3, Lx0/i;

    .line 62
    .line 63
    invoke-direct {v0, p2, v3}, Lx0/h;-><init>(Lt0/y;Lx0/i;)V

    .line 64
    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    invoke-static {v1, v0, v3}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    instance-of v0, p1, LE/j;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    new-instance v0, Lt0/O;

    .line 75
    .line 76
    invoke-direct {v0, p2, p1}, Lt0/O;-><init>(Lt0/y;LZ/j;)V

    .line 77
    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    invoke-static {v1, v0, v3}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 81
    .line 82
    .line 83
    :cond_3
    instance-of v0, p1, Lr0/o;

    .line 84
    .line 85
    iget-object v1, p0, Lt0/q;->j:Lt0/t;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v0, v1, Lt0/t;->H:LP/d;

    .line 90
    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    new-instance v0, LP/d;

    .line 94
    .line 95
    const/16 v3, 0x10

    .line 96
    .line 97
    new-array v3, v3, [Lef/k;

    .line 98
    .line 99
    invoke-direct {v0, v3}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, v1, Lt0/t;->H:LP/d;

    .line 103
    .line 104
    :cond_4
    new-instance v3, Lef/k;

    .line 105
    .line 106
    invoke-direct {v3, p2, p1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, LP/d;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    instance-of v0, p1, Lr0/l;

    .line 113
    .line 114
    if-eqz v0, :cond_11

    .line 115
    .line 116
    move-object v0, p1

    .line 117
    check-cast v0, Lr0/l;

    .line 118
    .line 119
    iget-object v1, v1, Lt0/t;->i:LP/d;

    .line 120
    .line 121
    invoke-virtual {v1}, LP/d;->i()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_6

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    iget v3, v1, LP/d;->c:I

    .line 129
    .line 130
    const/4 v4, -0x1

    .line 131
    if-lez v3, :cond_9

    .line 132
    .line 133
    sub-int/2addr v3, v2

    .line 134
    iget-object v5, v1, LP/d;->a:[Ljava/lang/Object;

    .line 135
    .line 136
    :cond_7
    aget-object v6, v5, v3

    .line 137
    .line 138
    check-cast v6, Lt0/A;

    .line 139
    .line 140
    iget-boolean v7, v6, Lt0/A;->B:Z

    .line 141
    .line 142
    if-eqz v7, :cond_8

    .line 143
    .line 144
    iget-object v6, v6, Lt0/A;->A:Lr0/l;

    .line 145
    .line 146
    if-ne v6, v0, :cond_8

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_8
    add-int/lit8 v3, v3, -0x1

    .line 150
    .line 151
    if-gez v3, :cond_7

    .line 152
    .line 153
    :cond_9
    move v3, v4

    .line 154
    :goto_0
    if-gez v3, :cond_d

    .line 155
    .line 156
    iget v3, v1, LP/d;->c:I

    .line 157
    .line 158
    if-lez v3, :cond_c

    .line 159
    .line 160
    sub-int/2addr v3, v2

    .line 161
    iget-object v2, v1, LP/d;->a:[Ljava/lang/Object;

    .line 162
    .line 163
    :cond_a
    aget-object v5, v2, v3

    .line 164
    .line 165
    check-cast v5, Lt0/A;

    .line 166
    .line 167
    iget-boolean v5, v5, Lt0/A;->B:Z

    .line 168
    .line 169
    if-nez v5, :cond_b

    .line 170
    .line 171
    move v4, v3

    .line 172
    goto :goto_1

    .line 173
    :cond_b
    add-int/lit8 v3, v3, -0x1

    .line 174
    .line 175
    if-gez v3, :cond_a

    .line 176
    .line 177
    :cond_c
    :goto_1
    move v3, v4

    .line 178
    :cond_d
    if-gez v3, :cond_e

    .line 179
    .line 180
    :goto_2
    const/4 v1, 0x0

    .line 181
    goto :goto_3

    .line 182
    :cond_e
    invoke-virtual {v1, v3}, LP/d;->m(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Lt0/A;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    iput-object v0, v1, Lt0/A;->A:Lr0/l;

    .line 192
    .line 193
    iput-object p2, v1, Lt0/A;->z:Lt0/y;

    .line 194
    .line 195
    :goto_3
    if-nez v1, :cond_f

    .line 196
    .line 197
    new-instance v1, Lt0/A;

    .line 198
    .line 199
    iget-object v2, p2, Lt0/y;->e:Lt0/t;

    .line 200
    .line 201
    invoke-direct {v1, v2}, Lt0/y;-><init>(Lt0/t;)V

    .line 202
    .line 203
    .line 204
    iput-object p2, v1, Lt0/A;->z:Lt0/y;

    .line 205
    .line 206
    iput-object v0, v1, Lt0/A;->A:Lr0/l;

    .line 207
    .line 208
    :cond_f
    move-object p2, v1

    .line 209
    iget-object v0, p2, Lt0/y;->v:Lt0/G;

    .line 210
    .line 211
    if-eqz v0, :cond_10

    .line 212
    .line 213
    invoke-interface {v0}, Lt0/G;->invalidate()V

    .line 214
    .line 215
    .line 216
    :cond_10
    iget-object v0, p2, Lt0/A;->z:Lt0/y;

    .line 217
    .line 218
    iput-object p2, v0, Lt0/y;->f:Lt0/y;

    .line 219
    .line 220
    :cond_11
    instance-of v0, p1, Lr0/q;

    .line 221
    .line 222
    iget-object v1, p2, Lt0/y;->s:[LX0/E;

    .line 223
    .line 224
    if-eqz v0, :cond_12

    .line 225
    .line 226
    new-instance v0, Lt0/O;

    .line 227
    .line 228
    invoke-direct {v0, p2, p1}, Lt0/O;-><init>(Lt0/y;LZ/j;)V

    .line 229
    .line 230
    .line 231
    const/4 v2, 0x4

    .line 232
    invoke-static {v1, v0, v2}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 233
    .line 234
    .line 235
    :cond_12
    instance-of v0, p1, Lr0/r;

    .line 236
    .line 237
    if-eqz v0, :cond_13

    .line 238
    .line 239
    new-instance v0, Lt0/O;

    .line 240
    .line 241
    invoke-direct {v0, p2, p1}, Lt0/O;-><init>(Lt0/y;LZ/j;)V

    .line 242
    .line 243
    .line 244
    const/4 p1, 0x5

    .line 245
    invoke-static {v1, v0, p1}, LFe/e;->g([LX0/E;LX0/E;I)V

    .line 246
    .line 247
    .line 248
    :cond_13
    return-object p2

    .line 249
    :pswitch_0
    check-cast p1, Lef/C;

    .line 250
    .line 251
    check-cast p2, LZ/j;

    .line 252
    .line 253
    const-string v0, "<anonymous parameter 0>"

    .line 254
    .line 255
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    const-string p1, "mod"

    .line 259
    .line 260
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object p1, p0, Lt0/q;->j:Lt0/t;

    .line 264
    .line 265
    iget-object p1, p1, Lt0/t;->i:LP/d;

    .line 266
    .line 267
    iget v0, p1, LP/d;->c:I

    .line 268
    .line 269
    const/4 v1, 0x1

    .line 270
    if-lez v0, :cond_16

    .line 271
    .line 272
    sub-int/2addr v0, v1

    .line 273
    iget-object p1, p1, LP/d;->a:[Ljava/lang/Object;

    .line 274
    .line 275
    :cond_14
    aget-object v2, p1, v0

    .line 276
    .line 277
    move-object v3, v2

    .line 278
    check-cast v3, Lt0/A;

    .line 279
    .line 280
    iget-object v4, v3, Lt0/A;->A:Lr0/l;

    .line 281
    .line 282
    if-ne v4, p2, :cond_15

    .line 283
    .line 284
    iget-boolean v3, v3, Lt0/A;->B:Z

    .line 285
    .line 286
    if-nez v3, :cond_15

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_15
    add-int/lit8 v0, v0, -0x1

    .line 290
    .line 291
    if-gez v0, :cond_14

    .line 292
    .line 293
    :cond_16
    const/4 v2, 0x0

    .line 294
    :goto_4
    check-cast v2, Lt0/A;

    .line 295
    .line 296
    if-nez v2, :cond_17

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_17
    iput-boolean v1, v2, Lt0/A;->B:Z

    .line 300
    .line 301
    :goto_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 302
    .line 303
    return-object p1

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
