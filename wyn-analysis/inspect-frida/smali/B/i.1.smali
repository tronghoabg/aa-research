.class public final LB/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB/i;->i:I

    iput-object p2, p0, LB/i;->j:Ljava/lang/Object;

    iput-object p3, p0, LB/i;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LB/i;->i:I

    iput-object p1, p0, LB/i;->j:Ljava/lang/Object;

    iput-object p2, p0, LB/i;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LB/i;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, LB/i;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lu0/n;

    .line 16
    .line 17
    iget-object v0, p0, LB/i;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LV/d;

    .line 20
    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    invoke-static {p2, v0, p1, v1}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(Lu0/n;LV/d;LN/o;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lef/C;->a:Lef/C;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    check-cast p1, Lt0/C;

    .line 30
    .line 31
    check-cast p2, LZ/j;

    .line 32
    .line 33
    const-string v0, "lastProvider"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "mod"

    .line 39
    .line 40
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    instance-of v0, p2, Ls0/a;

    .line 44
    .line 45
    iget-object v1, p0, LB/i;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lt0/t;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    move-object v0, p2

    .line 52
    check-cast v0, Ls0/a;

    .line 53
    .line 54
    iget-object v2, p0, LB/i;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, LP/d;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget v3, v2, LP/d;->c:I

    .line 62
    .line 63
    if-lez v3, :cond_2

    .line 64
    .line 65
    iget-object v4, v2, LP/d;->a:[Ljava/lang/Object;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    :cond_0
    aget-object v6, v4, v5

    .line 69
    .line 70
    check-cast v6, Lt0/B;

    .line 71
    .line 72
    iget-object v6, v6, Lt0/B;->b:Ls0/a;

    .line 73
    .line 74
    if-ne v6, v0, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    if-lt v5, v3, :cond_0

    .line 80
    .line 81
    :cond_2
    const/4 v5, -0x1

    .line 82
    :goto_0
    if-gez v5, :cond_3

    .line 83
    .line 84
    new-instance v2, Lt0/B;

    .line 85
    .line 86
    invoke-direct {v2, p1, v0}, Lt0/B;-><init>(Lt0/C;Ls0/a;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v2, v5}, LP/d;->m(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, Lt0/B;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iput-object p1, v2, Lt0/B;->a:Lt0/C;

    .line 101
    .line 102
    :goto_1
    iget-object v0, p1, Lt0/C;->f:LP/d;

    .line 103
    .line 104
    invoke-virtual {v0, v2}, LP/d;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    instance-of v0, p2, Ls0/b;

    .line 108
    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    check-cast p2, Ls0/b;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, Lt0/C;->c:Lt0/C;

    .line 117
    .line 118
    :goto_2
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget-object v2, v0, Lt0/C;->b:Ls0/b;

    .line 121
    .line 122
    if-eq v2, p2, :cond_5

    .line 123
    .line 124
    iget-object v0, v0, Lt0/C;->c:Lt0/C;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    if-nez v0, :cond_6

    .line 128
    .line 129
    new-instance v0, Lt0/C;

    .line 130
    .line 131
    invoke-direct {v0, v1, p2}, Lt0/C;-><init>(Lt0/t;Ls0/b;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    iget-object p2, v0, Lt0/C;->d:Lt0/C;

    .line 136
    .line 137
    if-nez p2, :cond_7

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    iget-object v1, v0, Lt0/C;->c:Lt0/C;

    .line 141
    .line 142
    iput-object v1, p2, Lt0/C;->c:Lt0/C;

    .line 143
    .line 144
    :goto_3
    iget-object v1, v0, Lt0/C;->c:Lt0/C;

    .line 145
    .line 146
    if-nez v1, :cond_8

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    iput-object p2, v1, Lt0/C;->d:Lt0/C;

    .line 150
    .line 151
    :goto_4
    iget-object p2, p1, Lt0/C;->c:Lt0/C;

    .line 152
    .line 153
    iput-object p2, v0, Lt0/C;->c:Lt0/C;

    .line 154
    .line 155
    iget-object p2, p1, Lt0/C;->c:Lt0/C;

    .line 156
    .line 157
    if-nez p2, :cond_9

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    iput-object v0, p2, Lt0/C;->d:Lt0/C;

    .line 161
    .line 162
    :goto_5
    iput-object v0, p1, Lt0/C;->c:Lt0/C;

    .line 163
    .line 164
    iput-object p1, v0, Lt0/C;->d:Lt0/C;

    .line 165
    .line 166
    move-object p1, v0

    .line 167
    :cond_a
    return-object p1

    .line 168
    :pswitch_1
    check-cast p1, LN/o;

    .line 169
    .line 170
    check-cast p2, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    and-int/lit8 p2, p2, 0xb

    .line 177
    .line 178
    const/4 v0, 0x2

    .line 179
    if-ne p2, v0, :cond_c

    .line 180
    .line 181
    invoke-virtual {p1}, LN/o;->x()Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-nez p2, :cond_b

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_b
    invoke-virtual {p1}, LN/o;->I()V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_c
    :goto_6
    iget-object p2, p0, LB/i;->k:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p2, Ljava/util/Map;

    .line 195
    .line 196
    const/16 v0, 0x40

    .line 197
    .line 198
    iget-object v1, p0, LB/i;->j:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Li0/H;

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    invoke-static {v1, p2, p1, v0, v2}, Lic/d;->b(Li0/H;Ljava/util/Map;LN/o;II)V

    .line 204
    .line 205
    .line 206
    :goto_7
    sget-object p1, Lef/C;->a:Lef/C;

    .line 207
    .line 208
    return-object p1

    .line 209
    :pswitch_2
    check-cast p1, LN/o;

    .line 210
    .line 211
    check-cast p2, Ljava/lang/Number;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    and-int/lit8 p2, p2, 0xb

    .line 218
    .line 219
    const/4 v0, 0x2

    .line 220
    if-ne p2, v0, :cond_e

    .line 221
    .line 222
    invoke-virtual {p1}, LN/o;->x()Z

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    if-nez p2, :cond_d

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_d
    invoke-virtual {p1}, LN/o;->I()V

    .line 230
    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_e
    :goto_8
    iget-object p2, p0, LB/i;->k:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast p2, Li0/L;

    .line 236
    .line 237
    iget-object v0, p2, Li0/L;->h:Li0/D;

    .line 238
    .line 239
    iget v0, v0, Li0/D;->g:F

    .line 240
    .line 241
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object p2, p2, Li0/L;->h:Li0/D;

    .line 246
    .line 247
    iget p2, p2, Li0/D;->h:F

    .line 248
    .line 249
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    const/4 v1, 0x0

    .line 254
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v2, p0, LB/i;->j:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v2, LV/d;

    .line 261
    .line 262
    invoke-virtual {v2, v0, p2, p1, v1}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :goto_9
    sget-object p1, Lef/C;->a:Lef/C;

    .line 266
    .line 267
    return-object p1

    .line 268
    :pswitch_3
    check-cast p1, LN/o;

    .line 269
    .line 270
    check-cast p2, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 273
    .line 274
    .line 275
    iget-object p2, p0, LB/i;->k:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast p2, LV/d;

    .line 278
    .line 279
    iget-object v0, p0, LB/i;->j:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lz0/p;

    .line 282
    .line 283
    const/16 v1, 0x31

    .line 284
    .line 285
    invoke-static {v0, p2, p1, v1}, LK/I;->a(Lz0/p;LV/d;LN/o;I)V

    .line 286
    .line 287
    .line 288
    sget-object p1, Lef/C;->a:Lef/C;

    .line 289
    .line 290
    return-object p1

    .line 291
    :pswitch_4
    check-cast p1, LN/o;

    .line 292
    .line 293
    check-cast p2, Ljava/lang/Number;

    .line 294
    .line 295
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 296
    .line 297
    .line 298
    iget-object p2, p0, LB/i;->j:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p2, LD/i;

    .line 301
    .line 302
    iget-object v0, p0, LB/i;->k:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LN/V;

    .line 305
    .line 306
    const/16 v1, 0x31

    .line 307
    .line 308
    invoke-static {p2, v0, p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->H(LD/i;LN/V;LN/o;I)V

    .line 309
    .line 310
    .line 311
    sget-object p1, Lef/C;->a:Lef/C;

    .line 312
    .line 313
    return-object p1

    .line 314
    :pswitch_5
    check-cast p1, LN/o;

    .line 315
    .line 316
    check-cast p2, Ljava/lang/Number;

    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 319
    .line 320
    .line 321
    iget-object p2, p0, LB/i;->j:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast p2, LZ/k;

    .line 324
    .line 325
    iget-object v0, p0, LB/i;->k:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Ltf/l;

    .line 328
    .line 329
    const/4 v1, 0x7

    .line 330
    invoke-static {p2, v0, p1, v1}, Landroid/support/v4/media/session/b;->F(LZ/k;Ltf/l;LN/o;I)V

    .line 331
    .line 332
    .line 333
    sget-object p1, Lef/C;->a:Lef/C;

    .line 334
    .line 335
    return-object p1

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
