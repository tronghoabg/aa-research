.class public final synthetic Lhd/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lhd/o;


# direct methods
.method public synthetic constructor <init>(Lhd/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhd/k;->a:I

    iput-object p1, p0, Lhd/k;->b:Lhd/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 7

    .line 1
    iget v0, p0, Lhd/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lhd/k;->b:Lhd/o;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object p1, p1, Lhd/o;->d:LU1/m;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    check-cast v1, LU1/u;

    .line 17
    .line 18
    invoke-virtual {v1}, LU1/u;->m0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast p1, LU1/u;

    .line 27
    .line 28
    invoke-virtual {p1}, LU1/u;->h0()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v2, Lhd/i;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, v2, Lhd/i;->a:Ljava/lang/Long;

    .line 42
    .line 43
    iput-object p1, v2, Lhd/i;->b:Ljava/lang/Long;

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    iget-object v0, p0, Lhd/k;->b:Lhd/o;

    .line 60
    .line 61
    new-instance v1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    check-cast p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/Long;

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iget-object p1, v0, Lhd/o;->d:LU1/m;

    .line 83
    .line 84
    check-cast p1, LA7/B0;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, LU1/u;

    .line 91
    .line 92
    invoke-virtual {v0}, LU1/u;->l0()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p1, v3, v4, v0, v2}, LA7/B0;->O(JIZ)V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_1
    move-exception p1

    .line 105
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_1
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    iget-object p1, p0, Lhd/k;->b:Lhd/o;

    .line 114
    .line 115
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    :try_start_2
    iget-object p1, p1, Lhd/o;->d:LU1/m;

    .line 121
    .line 122
    check-cast p1, LA7/B0;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast p1, LU1/u;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-virtual {p1, v1}, LU1/u;->G0(Z)V

    .line 131
    .line 132
    .line 133
    const/4 p1, 0x0

    .line 134
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catchall_2
    move-exception p1

    .line 139
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_2
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_2
    iget-object p1, p0, Lhd/k;->b:Lhd/o;

    .line 148
    .line 149
    new-instance v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    :try_start_3
    iget-object p1, p1, Lhd/o;->d:LU1/m;

    .line 155
    .line 156
    check-cast p1, LA7/B0;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast p1, LU1/u;

    .line 162
    .line 163
    const/4 v1, 0x1

    .line 164
    invoke-virtual {p1, v1}, LU1/u;->G0(Z)V

    .line 165
    .line 166
    .line 167
    const/4 p1, 0x0

    .line 168
    const/4 v1, 0x0

    .line 169
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :catchall_3
    move-exception p1

    .line 174
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    :goto_3
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_3
    iget-object v0, p0, Lhd/k;->b:Lhd/o;

    .line 183
    .line 184
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    check-cast p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Ljava/lang/Double;

    .line 197
    .line 198
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    new-instance v3, LN1/F;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Double;->floatValue()F

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-direct {v3, p1}, LN1/F;-><init>(F)V

    .line 208
    .line 209
    .line 210
    iget-object p1, v0, Lhd/o;->d:LU1/m;

    .line 211
    .line 212
    check-cast p1, LU1/u;

    .line 213
    .line 214
    invoke-virtual {p1, v3}, LU1/u;->H0(LN1/F;)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :catchall_4
    move-exception p1

    .line 223
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    :goto_4
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_4
    iget-object v0, p0, Lhd/k;->b:Lhd/o;

    .line 232
    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    check-cast p1, Ljava/util/ArrayList;

    .line 239
    .line 240
    const/4 v2, 0x0

    .line 241
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Ljava/lang/Double;

    .line 246
    .line 247
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 255
    .line 256
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 257
    .line 258
    .line 259
    move-result-wide v3

    .line 260
    const-wide/16 v5, 0x0

    .line 261
    .line 262
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    double-to-float p1, v3

    .line 267
    iget-object v0, v0, Lhd/o;->d:LU1/m;

    .line 268
    .line 269
    check-cast v0, LU1/u;

    .line 270
    .line 271
    invoke-virtual {v0, p1}, LU1/u;->M0(F)V

    .line 272
    .line 273
    .line 274
    const/4 p1, 0x0

    .line 275
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :catchall_5
    move-exception p1

    .line 280
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    :goto_5
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_5
    iget-object v0, p0, Lhd/k;->b:Lhd/o;

    .line 289
    .line 290
    new-instance v1, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    check-cast p1, Ljava/util/ArrayList;

    .line 296
    .line 297
    const/4 v2, 0x0

    .line 298
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    check-cast p1, Ljava/lang/Boolean;

    .line 303
    .line 304
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_0

    .line 312
    .line 313
    const/4 p1, 0x2

    .line 314
    goto :goto_6

    .line 315
    :cond_0
    move p1, v2

    .line 316
    :goto_6
    iget-object v0, v0, Lhd/o;->d:LU1/m;

    .line 317
    .line 318
    check-cast v0, LU1/u;

    .line 319
    .line 320
    invoke-virtual {v0, p1}, LU1/u;->I0(I)V

    .line 321
    .line 322
    .line 323
    const/4 p1, 0x0

    .line 324
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catchall_6
    move-exception p1

    .line 329
    invoke-static {p1}, La/a;->Q(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    :goto_7
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    return-void

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
