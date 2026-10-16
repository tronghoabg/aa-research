.class public final LV/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:LV/d;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA/U;ILA/Z;Ljava/lang/Object;LV/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LV/a;->i:I

    .line 1
    iput-object p1, p0, LV/a;->m:Ljava/lang/Object;

    iput p2, p0, LV/a;->j:I

    iput-object p3, p0, LV/a;->n:Ljava/lang/Object;

    iput-object p4, p0, LV/a;->k:Ljava/lang/Object;

    iput-object p5, p0, LV/a;->l:LV/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LV/d;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LV/a;->i:I

    .line 2
    iput-object p1, p0, LV/a;->l:LV/d;

    iput-object p2, p0, LV/a;->k:Ljava/lang/Object;

    iput-object p3, p0, LV/a;->m:Ljava/lang/Object;

    iput-object p4, p0, LV/a;->n:Ljava/lang/Object;

    iput p5, p0, LV/a;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LV/a;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, LN/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p1, p1, 0xb

    .line 16
    .line 17
    const/4 p2, 0x2

    .line 18
    if-ne p1, p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v7}, LN/o;->x()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v7}, LN/o;->I()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_1
    :goto_0
    new-instance p1, LG/f;

    .line 33
    .line 34
    iget-object p2, p0, LV/a;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, LA/Z;

    .line 37
    .line 38
    const/4 v0, 0x7

    .line 39
    invoke-direct {p1, p2, v0}, LG/f;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    const p2, -0x4fcbfb15

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, p2}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    sget-object v5, LA/b0;->a:LS3/e;

    .line 49
    .line 50
    const p2, -0x880d1ef

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, p2}, LN/o;->M(I)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, LV/a;->m:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v1, p2

    .line 59
    check-cast v1, LA/U;

    .line 60
    .line 61
    invoke-virtual {v1}, LA/U;->b()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const v0, -0x1a25b2ec

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7, v0}, LN/o;->M(I)V

    .line 69
    .line 70
    .line 71
    iget-object v8, p0, LV/a;->k:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    const/4 v2, 0x0

    .line 78
    const/high16 v3, 0x3f800000    # 1.0f

    .line 79
    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    move p2, v3

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move p2, v2

    .line 85
    :goto_1
    const/4 v9, 0x0

    .line 86
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    iget-object v4, v1, LA/U;->c:LN/Y;

    .line 94
    .line 95
    invoke-virtual {v4}, LN/Y;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v7, v0}, LN/o;->M(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    move v2, v3

    .line 109
    :cond_3
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 110
    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v1}, LA/U;->c()LA/N;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1, v0, v7, v2}, LG/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    move-object v4, p1

    .line 129
    check-cast v4, LA/u;

    .line 130
    .line 131
    const-string v6, "FloatAnimation"

    .line 132
    .line 133
    move-object v2, p2

    .line 134
    invoke-static/range {v1 .. v7}, LA/t;->e(LA/U;Ljava/lang/Object;Ljava/lang/Object;LA/u;LS3/e;Ljava/lang/String;LN/o;)LA/O;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 142
    .line 143
    .line 144
    sget-object p2, LZ/i;->a:LZ/i;

    .line 145
    .line 146
    const v0, 0x44faf204

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v0}, LN/o;->M(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-nez v0, :cond_4

    .line 161
    .line 162
    sget-object v0, LN/k;->a:LN/P;

    .line 163
    .line 164
    if-ne v1, v0, :cond_5

    .line 165
    .line 166
    :cond_4
    new-instance v1, LB/F;

    .line 167
    .line 168
    const/16 v0, 0x17

    .line 169
    .line 170
    invoke-direct {v1, p1, v0}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 177
    .line 178
    .line 179
    check-cast v1, Ltf/l;

    .line 180
    .line 181
    invoke-static {p2, v1}, Le0/z;->j(LZ/k;Ltf/l;)LZ/k;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const p2, -0x76a43a57

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7, p2}, LN/o;->M(I)V

    .line 189
    .line 190
    .line 191
    sget-object p2, LZ/a;->a:LZ/d;

    .line 192
    .line 193
    invoke-static {p2, v9, v7}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    const v0, 0x520574f7

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7, v0}, LN/o;->M(I)V

    .line 201
    .line 202
    .line 203
    sget-object v0, Lu0/M;->e:LN/L0;

    .line 204
    .line 205
    invoke-virtual {v7, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, LL0/b;

    .line 210
    .line 211
    sget-object v1, Lu0/M;->k:LN/L0;

    .line 212
    .line 213
    invoke-virtual {v7, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, LL0/i;

    .line 218
    .line 219
    sget-object v2, Lt0/c;->g9:Lt0/b;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object v2, Lt0/b;->b:Lt0/d;

    .line 225
    .line 226
    invoke-static {p1}, LS3/f;->y(LZ/k;)LV/d;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v7}, LN/o;->O()V

    .line 231
    .line 232
    .line 233
    iget-boolean v3, v7, LN/o;->O:Z

    .line 234
    .line 235
    if-eqz v3, :cond_6

    .line 236
    .line 237
    invoke-virtual {v7, v2}, LN/o;->k(Ltf/a;)V

    .line 238
    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    invoke-virtual {v7}, LN/o;->X()V

    .line 242
    .line 243
    .line 244
    :goto_2
    iput-boolean v9, v7, LN/o;->x:Z

    .line 245
    .line 246
    sget-object v2, Lt0/b;->e:Lt0/a;

    .line 247
    .line 248
    invoke-static {v7, p2, v2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 249
    .line 250
    .line 251
    sget-object p2, Lt0/b;->d:Lt0/a;

    .line 252
    .line 253
    invoke-static {v7, v0, p2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 254
    .line 255
    .line 256
    sget-object p2, Lt0/b;->f:Lt0/a;

    .line 257
    .line 258
    invoke-static {v7, v1, p2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7}, LN/o;->o()V

    .line 262
    .line 263
    .line 264
    new-instance p2, LN/u0;

    .line 265
    .line 266
    invoke-direct {p2, v7}, LN/u0;-><init>(LN/o;)V

    .line 267
    .line 268
    .line 269
    const v0, 0x7ab4aae9

    .line 270
    .line 271
    .line 272
    invoke-static {v9, p1, p2, v7, v0}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 273
    .line 274
    .line 275
    const p1, -0x4ab8dd79

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, p1}, LN/o;->M(I)V

    .line 279
    .line 280
    .line 281
    const p1, -0xd465f6e

    .line 282
    .line 283
    .line 284
    invoke-virtual {v7, p1}, LN/o;->M(I)V

    .line 285
    .line 286
    .line 287
    iget p1, p0, LV/a;->j:I

    .line 288
    .line 289
    shr-int/lit8 p1, p1, 0x9

    .line 290
    .line 291
    and-int/lit8 p1, p1, 0x70

    .line 292
    .line 293
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    iget-object p2, p0, LV/a;->l:LV/d;

    .line 298
    .line 299
    invoke-virtual {p2, v8, v7, p1}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    const/4 p1, 0x1

    .line 303
    invoke-static {v7, v9, v9, v9, p1}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v7, v9}, LN/o;->p(Z)V

    .line 310
    .line 311
    .line 312
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 313
    .line 314
    return-object p1

    .line 315
    :pswitch_0
    move-object v4, p1

    .line 316
    check-cast v4, LN/o;

    .line 317
    .line 318
    check-cast p2, Ljava/lang/Number;

    .line 319
    .line 320
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 321
    .line 322
    .line 323
    iget p1, p0, LV/a;->j:I

    .line 324
    .line 325
    invoke-static {p1}, LN/d;->Q(I)I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    or-int/lit8 v5, p1, 0x1

    .line 330
    .line 331
    iget-object v2, p0, LV/a;->m:Ljava/lang/Object;

    .line 332
    .line 333
    iget-object v3, p0, LV/a;->n:Ljava/lang/Object;

    .line 334
    .line 335
    iget-object v0, p0, LV/a;->l:LV/d;

    .line 336
    .line 337
    iget-object v1, p0, LV/a;->k:Ljava/lang/Object;

    .line 338
    .line 339
    invoke-virtual/range {v0 .. v5}, LV/d;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LN/o;I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    sget-object p1, Lef/C;->a:Lef/C;

    .line 343
    .line 344
    return-object p1

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
