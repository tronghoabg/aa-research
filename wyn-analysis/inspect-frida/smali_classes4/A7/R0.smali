.class public final synthetic LA7/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:LA7/R0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA7/R0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LA7/R0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA7/R0;->b:LA7/R0;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/R0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget v3, p0, LA7/R0;->a:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lx7/b;

    .line 10
    .line 11
    check-cast p2, Lx7/b;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget v3, p1, Lx7/b;->a:I

    .line 20
    .line 21
    iget v4, p2, Lx7/b;->a:I

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    if-lt v3, v4, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget p1, p1, Lx7/b;->b:I

    .line 29
    .line 30
    iget p2, p2, Lx7/b;->b:I

    .line 31
    .line 32
    if-ne p1, p2, :cond_1

    .line 33
    .line 34
    move v0, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    if-lt p1, p2, :cond_2

    .line 37
    .line 38
    :goto_0
    move v0, v1

    .line 39
    :cond_2
    :goto_1
    return v0

    .line 40
    :pswitch_0
    check-cast p1, Ljava/lang/Comparable;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Comparable;

    .line 43
    .line 44
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :pswitch_1
    check-cast p1, Ljava/lang/Comparable;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Comparable;

    .line 52
    .line 53
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :pswitch_2
    check-cast p1, Ldg/f;

    .line 59
    .line 60
    iget-object p1, p1, Ldg/f;->a:Lcg/y;

    .line 61
    .line 62
    check-cast p2, Ldg/f;

    .line 63
    .line 64
    iget-object p2, p2, Ldg/f;->a:Lcg/y;

    .line 65
    .line 66
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1

    .line 71
    :pswitch_3
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;

    .line 72
    .line 73
    iget p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;->b:I

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;

    .line 80
    .line 81
    iget p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/m;->b:I

    .line 82
    .line 83
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    return p1

    .line 92
    :pswitch_4
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;

    .line 93
    .line 94
    iget-wide v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;->b:J

    .line 95
    .line 96
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;

    .line 101
    .line 102
    iget-wide v0, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/a;->b:J

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    return p1

    .line 113
    :pswitch_5
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;

    .line 114
    .line 115
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;->a:Ljava/lang/Integer;

    .line 116
    .line 117
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;

    .line 118
    .line 119
    iget-object p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;->a:Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-static {p1, p2}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :pswitch_6
    check-cast p1, Lc0/g;

    .line 127
    .line 128
    iget-object p1, p1, Lc0/g;->k:Lt0/y;

    .line 129
    .line 130
    const/4 v0, 0x0

    .line 131
    if-eqz p1, :cond_3

    .line 132
    .line 133
    iget-object p1, p1, Lt0/y;->e:Lt0/t;

    .line 134
    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    iget p1, p1, Lt0/t;->t:I

    .line 138
    .line 139
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    goto :goto_2

    .line 144
    :cond_3
    move-object p1, v0

    .line 145
    :goto_2
    check-cast p2, Lc0/g;

    .line 146
    .line 147
    iget-object p2, p2, Lc0/g;->k:Lt0/y;

    .line 148
    .line 149
    if-eqz p2, :cond_4

    .line 150
    .line 151
    iget-object p2, p2, Lt0/y;->e:Lt0/t;

    .line 152
    .line 153
    if-eqz p2, :cond_4

    .line 154
    .line 155
    iget p2, p2, Lt0/t;->t:I

    .line 156
    .line 157
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :cond_4
    invoke-static {p1, v0}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    return p1

    .line 166
    :pswitch_7
    check-cast p1, Landroidx/recyclerview/widget/r;

    .line 167
    .line 168
    check-cast p2, Landroidx/recyclerview/widget/r;

    .line 169
    .line 170
    iget-object v3, p1, Landroidx/recyclerview/widget/r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    if-nez v3, :cond_5

    .line 173
    .line 174
    move v4, v1

    .line 175
    goto :goto_3

    .line 176
    :cond_5
    move v4, v2

    .line 177
    :goto_3
    iget-object v5, p2, Landroidx/recyclerview/widget/r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 178
    .line 179
    if-nez v5, :cond_6

    .line 180
    .line 181
    move v5, v1

    .line 182
    goto :goto_4

    .line 183
    :cond_6
    move v5, v2

    .line 184
    :goto_4
    if-eq v4, v5, :cond_7

    .line 185
    .line 186
    if-nez v3, :cond_c

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_7
    iget-boolean v3, p1, Landroidx/recyclerview/widget/r;->a:Z

    .line 190
    .line 191
    iget-boolean v4, p2, Landroidx/recyclerview/widget/r;->a:Z

    .line 192
    .line 193
    if-eq v3, v4, :cond_9

    .line 194
    .line 195
    if-eqz v3, :cond_8

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_8
    :goto_5
    move v0, v1

    .line 199
    goto :goto_6

    .line 200
    :cond_9
    iget v0, p2, Landroidx/recyclerview/widget/r;->b:I

    .line 201
    .line 202
    iget v1, p1, Landroidx/recyclerview/widget/r;->b:I

    .line 203
    .line 204
    sub-int/2addr v0, v1

    .line 205
    if-eqz v0, :cond_a

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_a
    iget p1, p1, Landroidx/recyclerview/widget/r;->c:I

    .line 209
    .line 210
    iget p2, p2, Landroidx/recyclerview/widget/r;->c:I

    .line 211
    .line 212
    sub-int v0, p1, p2

    .line 213
    .line 214
    if-eqz v0, :cond_b

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_b
    move v0, v2

    .line 218
    :cond_c
    :goto_6
    return v0

    .line 219
    :pswitch_8
    check-cast p1, Landroid/view/View;

    .line 220
    .line 221
    check-cast p2, Landroid/view/View;

    .line 222
    .line 223
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    sub-int/2addr p1, p2

    .line 232
    return p1

    .line 233
    :pswitch_9
    check-cast p1, LVa/r8;

    .line 234
    .line 235
    check-cast p2, LVa/r8;

    .line 236
    .line 237
    invoke-virtual {p1}, LVa/r8;->a()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    invoke-virtual {p2}, LVa/r8;->a()I

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    sub-int/2addr p1, p2

    .line 246
    return p1

    .line 247
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 248
    .line 249
    check-cast p2, Ljava/lang/String;

    .line 250
    .line 251
    invoke-static {p1, p2}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    return p1

    .line 256
    :pswitch_b
    check-cast p1, Landroid/view/View;

    .line 257
    .line 258
    check-cast p2, Landroid/view/View;

    .line 259
    .line 260
    sget-object v3, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 261
    .line 262
    invoke-static {p1}, Lk1/J;->g(Landroid/view/View;)F

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    invoke-static {p2}, Lk1/J;->g(Landroid/view/View;)F

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    cmpl-float v3, p1, p2

    .line 271
    .line 272
    if-lez v3, :cond_d

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_d
    cmpg-float p1, p1, p2

    .line 276
    .line 277
    if-gez p1, :cond_e

    .line 278
    .line 279
    move v0, v1

    .line 280
    goto :goto_7

    .line 281
    :cond_e
    move v0, v2

    .line 282
    :goto_7
    return v0

    .line 283
    :pswitch_c
    check-cast p1, LO0/f;

    .line 284
    .line 285
    check-cast p2, LO0/f;

    .line 286
    .line 287
    iget p1, p1, LO0/f;->b:I

    .line 288
    .line 289
    iget p2, p2, LO0/f;->b:I

    .line 290
    .line 291
    sub-int/2addr p1, p2

    .line 292
    return p1

    .line 293
    :pswitch_d
    check-cast p1, LI9/b;

    .line 294
    .line 295
    check-cast p2, LI9/b;

    .line 296
    .line 297
    invoke-virtual {p1}, LI9/b;->a()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {p2}, LI9/b;->a()I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-le v3, v4, :cond_f

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_f
    invoke-virtual {p1}, LI9/b;->a()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    invoke-virtual {p2}, LI9/b;->a()I

    .line 313
    .line 314
    .line 315
    move-result p2

    .line 316
    if-ge p1, p2, :cond_10

    .line 317
    .line 318
    move v0, v1

    .line 319
    goto :goto_8

    .line 320
    :cond_10
    move v0, v2

    .line 321
    :goto_8
    return v0

    .line 322
    :pswitch_e
    check-cast p1, Ljava/util/Map$Entry;

    .line 323
    .line 324
    check-cast p2, Ljava/util/Map$Entry;

    .line 325
    .line 326
    sget-object v0, LEa/d;->a:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    .line 327
    .line 328
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    check-cast p1, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    check-cast p2, Ljava/lang/Integer;

    .line 339
    .line 340
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    return p1

    .line 345
    :pswitch_f
    check-cast p2, Ljava/lang/String;

    .line 346
    .line 347
    check-cast p1, Ljava/lang/String;

    .line 348
    .line 349
    sget-object v0, Lx6/s;->f:Ljava/util/List;

    .line 350
    .line 351
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    sub-int/2addr p1, p2

    .line 360
    return p1

    .line 361
    :pswitch_10
    check-cast p1, Ljava/lang/Long;

    .line 362
    .line 363
    check-cast p2, Ljava/lang/Long;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v0

    .line 369
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 370
    .line 371
    .line 372
    move-result-wide p1

    .line 373
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 374
    .line 375
    .line 376
    move-result p1

    .line 377
    return p1

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
