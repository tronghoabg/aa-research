.class public final synthetic LJ9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/d;
.implements LLe/b;
.implements LLe/c;
.implements LG2/g;
.implements LL8/f;
.implements LO9/a;
.implements Lq5/f;
.implements Lk8/h;
.implements LL8/e;
.implements Lcom/vungle/ads/internal/util/m;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lb6/g;
.implements LQ1/g;
.implements Luc/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LJ9/x;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LUc/f;I)V
    .locals 0

    .line 2
    iput p2, p0, LJ9/x;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Ljava/io/ObjectInputStream;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/InputStream;)Ljava/io/ObjectInputStream;

    move-result-object p1

    return-object p1
.end method

.method public a(IIIII)Z
    .locals 3

    .line 2
    iget v0, p0, LJ9/x;->a:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p2, v0, :cond_0

    const/16 v0, 0x4f

    if-ne p3, v0, :cond_0

    if-ne p4, v2, :cond_0

    if-eq p5, v2, :cond_1

    if-eq p1, v1, :cond_1

    :cond_0
    if-ne p2, v2, :cond_2

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_2

    if-ne p4, p2, :cond_2

    const/16 p2, 0x54

    if-eq p5, p2, :cond_1

    if-ne p1, v1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p2, v0, :cond_3

    const/16 v0, 0x4f

    if-ne p3, v0, :cond_3

    if-ne p4, v2, :cond_3

    if-eq p5, v2, :cond_4

    if-eq p1, v1, :cond_4

    :cond_3
    if-ne p2, v2, :cond_5

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_5

    if-ne p4, p2, :cond_5

    const/16 p2, 0x54

    if-eq p5, p2, :cond_4

    if-ne p1, v1, :cond_5

    :cond_4
    const/4 p1, 0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LJ9/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Impressions store read fail: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lic/d;->G(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "Cache read error: "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lic/d;->G(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    check-cast p1, Lta/o;

    .line 55
    .line 56
    const-string p1, "Fetched from cache"

    .line 57
    .line 58
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    const/4 v2, 0x0

    .line 2
    const/4 v3, 0x3

    .line 3
    const/4 v4, 0x2

    .line 4
    const/4 v5, 0x1

    .line 5
    move-object/from16 v6, p0

    .line 6
    .line 7
    iget v7, v6, LJ9/x;->a:I

    .line 8
    .line 9
    sparse-switch v7, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, LV1/d;

    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, LQ1/q;

    .line 17
    .line 18
    invoke-direct {v0, v1}, LV1/d;-><init>(LQ1/q;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :sswitch_0
    move-object/from16 v0, p1

    .line 23
    .line 24
    check-cast v0, LR5/n;

    .line 25
    .line 26
    return-object v0

    .line 27
    :sswitch_1
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, LP2/a;

    .line 30
    .line 31
    iget-wide v0, v0, LP2/a;->b:J

    .line 32
    .line 33
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    cmp-long v2, v0, v2

    .line 39
    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :sswitch_2
    move-object/from16 v7, p1

    .line 50
    .line 51
    check-cast v7, LP1/b;

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v8, Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v9, v7, LP1/b;->a:Ljava/lang/CharSequence;

    .line 62
    .line 63
    if-eqz v9, :cond_5

    .line 64
    .line 65
    sget-object v10, LP1/b;->r:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    instance-of v10, v9, Landroid/text/Spanned;

    .line 71
    .line 72
    if-eqz v10, :cond_5

    .line 73
    .line 74
    check-cast v9, Landroid/text/Spanned;

    .line 75
    .line 76
    sget-object v10, LP1/d;->a:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v10, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    const-class v12, LP1/f;

    .line 88
    .line 89
    invoke-interface {v9, v2, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    check-cast v11, [LP1/f;

    .line 94
    .line 95
    array-length v12, v11

    .line 96
    move v13, v2

    .line 97
    :goto_0
    if-ge v13, v12, :cond_1

    .line 98
    .line 99
    aget-object v14, v11, v13

    .line 100
    .line 101
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v15, Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 107
    .line 108
    .line 109
    sget-object v0, LP1/f;->c:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, v14, LP1/f;->a:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v15, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, LP1/f;->d:Ljava/lang/String;

    .line 117
    .line 118
    iget v1, v14, LP1/f;->b:I

    .line 119
    .line 120
    invoke-virtual {v15, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v9, v14, v5, v15}, LP1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    add-int/2addr v13, v5

    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const-class v1, LP1/g;

    .line 137
    .line 138
    invoke-interface {v9, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, [LP1/g;

    .line 143
    .line 144
    array-length v1, v0

    .line 145
    move v11, v2

    .line 146
    :goto_1
    if-ge v11, v1, :cond_2

    .line 147
    .line 148
    aget-object v12, v0, v11

    .line 149
    .line 150
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v13, Landroid/os/Bundle;

    .line 154
    .line 155
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 156
    .line 157
    .line 158
    sget-object v14, LP1/g;->d:Ljava/lang/String;

    .line 159
    .line 160
    iget v15, v12, LP1/g;->a:I

    .line 161
    .line 162
    invoke-virtual {v13, v14, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    sget-object v14, LP1/g;->e:Ljava/lang/String;

    .line 166
    .line 167
    iget v15, v12, LP1/g;->b:I

    .line 168
    .line 169
    invoke-virtual {v13, v14, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 170
    .line 171
    .line 172
    sget-object v14, LP1/g;->f:Ljava/lang/String;

    .line 173
    .line 174
    iget v15, v12, LP1/g;->c:I

    .line 175
    .line 176
    invoke-virtual {v13, v14, v15}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    invoke-static {v9, v12, v4, v13}, LP1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    add-int/2addr v11, v5

    .line 187
    goto :goto_1

    .line 188
    :cond_2
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    const-class v1, LP1/e;

    .line 193
    .line 194
    invoke-interface {v9, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, [LP1/e;

    .line 199
    .line 200
    array-length v1, v0

    .line 201
    move v4, v2

    .line 202
    :goto_2
    if-ge v4, v1, :cond_3

    .line 203
    .line 204
    aget-object v11, v0, v4

    .line 205
    .line 206
    const/4 v12, 0x0

    .line 207
    invoke-static {v9, v11, v3, v12}, LP1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    add-int/2addr v4, v5

    .line 215
    goto :goto_2

    .line 216
    :cond_3
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    const-class v1, LP1/h;

    .line 221
    .line 222
    invoke-interface {v9, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, [LP1/h;

    .line 227
    .line 228
    array-length v1, v0

    .line 229
    move v3, v2

    .line 230
    :goto_3
    if-ge v3, v1, :cond_4

    .line 231
    .line 232
    aget-object v4, v0, v3

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance v11, Landroid/os/Bundle;

    .line 238
    .line 239
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 240
    .line 241
    .line 242
    sget-object v12, LP1/h;->b:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v13, v4, LP1/h;->a:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v11, v12, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 v12, 0x4

    .line 250
    invoke-static {v9, v4, v12, v11}, LP1/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    add-int/2addr v3, v5

    .line 258
    goto :goto_3

    .line 259
    :cond_4
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_5

    .line 264
    .line 265
    sget-object v0, LP1/b;->s:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v8, v0, v10}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 268
    .line 269
    .line 270
    :cond_5
    sget-object v0, LP1/b;->t:Ljava/lang/String;

    .line 271
    .line 272
    iget-object v1, v7, LP1/b;->b:Landroid/text/Layout$Alignment;

    .line 273
    .line 274
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 275
    .line 276
    .line 277
    sget-object v0, LP1/b;->u:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v1, v7, LP1/b;->c:Landroid/text/Layout$Alignment;

    .line 280
    .line 281
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 282
    .line 283
    .line 284
    sget-object v0, LP1/b;->x:Ljava/lang/String;

    .line 285
    .line 286
    iget v1, v7, LP1/b;->e:F

    .line 287
    .line 288
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 289
    .line 290
    .line 291
    sget-object v0, LP1/b;->y:Ljava/lang/String;

    .line 292
    .line 293
    iget v1, v7, LP1/b;->f:I

    .line 294
    .line 295
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 296
    .line 297
    .line 298
    sget-object v0, LP1/b;->z:Ljava/lang/String;

    .line 299
    .line 300
    iget v1, v7, LP1/b;->g:I

    .line 301
    .line 302
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 303
    .line 304
    .line 305
    sget-object v0, LP1/b;->A:Ljava/lang/String;

    .line 306
    .line 307
    iget v1, v7, LP1/b;->h:F

    .line 308
    .line 309
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 310
    .line 311
    .line 312
    sget-object v0, LP1/b;->B:Ljava/lang/String;

    .line 313
    .line 314
    iget v1, v7, LP1/b;->i:I

    .line 315
    .line 316
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 317
    .line 318
    .line 319
    sget-object v0, LP1/b;->C:Ljava/lang/String;

    .line 320
    .line 321
    iget v1, v7, LP1/b;->n:I

    .line 322
    .line 323
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 324
    .line 325
    .line 326
    sget-object v0, LP1/b;->D:Ljava/lang/String;

    .line 327
    .line 328
    iget v1, v7, LP1/b;->o:F

    .line 329
    .line 330
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 331
    .line 332
    .line 333
    sget-object v0, LP1/b;->E:Ljava/lang/String;

    .line 334
    .line 335
    iget v1, v7, LP1/b;->j:F

    .line 336
    .line 337
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 338
    .line 339
    .line 340
    sget-object v0, LP1/b;->F:Ljava/lang/String;

    .line 341
    .line 342
    iget v1, v7, LP1/b;->k:F

    .line 343
    .line 344
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 345
    .line 346
    .line 347
    sget-object v0, LP1/b;->H:Ljava/lang/String;

    .line 348
    .line 349
    iget-boolean v1, v7, LP1/b;->l:Z

    .line 350
    .line 351
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 352
    .line 353
    .line 354
    sget-object v0, LP1/b;->G:Ljava/lang/String;

    .line 355
    .line 356
    iget v1, v7, LP1/b;->m:I

    .line 357
    .line 358
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 359
    .line 360
    .line 361
    sget-object v0, LP1/b;->I:Ljava/lang/String;

    .line 362
    .line 363
    iget v1, v7, LP1/b;->p:I

    .line 364
    .line 365
    invoke-virtual {v8, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 366
    .line 367
    .line 368
    sget-object v0, LP1/b;->J:Ljava/lang/String;

    .line 369
    .line 370
    iget v1, v7, LP1/b;->q:F

    .line 371
    .line 372
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 373
    .line 374
    .line 375
    iget-object v0, v7, LP1/b;->d:Landroid/graphics/Bitmap;

    .line 376
    .line 377
    if-eqz v0, :cond_6

    .line 378
    .line 379
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 380
    .line 381
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 382
    .line 383
    .line 384
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 385
    .line 386
    invoke-virtual {v0, v3, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 391
    .line 392
    .line 393
    sget-object v0, LP1/b;->w:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 400
    .line 401
    .line 402
    :cond_6
    return-object v8

    .line 403
    :sswitch_3
    const/4 v12, 0x0

    .line 404
    move-object/from16 v0, p1

    .line 405
    .line 406
    check-cast v0, Landroid/os/Bundle;

    .line 407
    .line 408
    sget-object v1, LP1/b;->r:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    if-eqz v1, :cond_c

    .line 415
    .line 416
    sget-object v7, LP1/b;->s:Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    if-eqz v7, :cond_b

    .line 423
    .line 424
    invoke-static {v1}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    if-eqz v8, :cond_b

    .line 437
    .line 438
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    check-cast v8, Landroid/os/Bundle;

    .line 443
    .line 444
    sget-object v9, LP1/d;->a:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v8, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    sget-object v10, LP1/d;->b:Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v8, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    sget-object v11, LP1/d;->c:Ljava/lang/String;

    .line 457
    .line 458
    invoke-virtual {v8, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    sget-object v13, LP1/d;->d:Ljava/lang/String;

    .line 463
    .line 464
    const/4 v14, -0x1

    .line 465
    invoke-virtual {v8, v13, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 466
    .line 467
    .line 468
    move-result v13

    .line 469
    sget-object v14, LP1/d;->e:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {v8, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    if-eq v13, v5, :cond_a

    .line 476
    .line 477
    if-eq v13, v4, :cond_9

    .line 478
    .line 479
    if-eq v13, v3, :cond_8

    .line 480
    .line 481
    const/4 v14, 0x4

    .line 482
    if-eq v13, v14, :cond_7

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    new-instance v13, LP1/h;

    .line 489
    .line 490
    sget-object v15, LP1/h;->b:Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v8, v15}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-direct {v13, v8}, LP1/h;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v1, v13, v9, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 503
    .line 504
    .line 505
    goto :goto_5

    .line 506
    :cond_8
    const/4 v14, 0x4

    .line 507
    new-instance v8, LP1/e;

    .line 508
    .line 509
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 510
    .line 511
    .line 512
    invoke-interface {v1, v8, v9, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 513
    .line 514
    .line 515
    goto :goto_5

    .line 516
    :cond_9
    const/4 v14, 0x4

    .line 517
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v13, LP1/g;

    .line 521
    .line 522
    sget-object v15, LP1/g;->d:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v8, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 525
    .line 526
    .line 527
    move-result v15

    .line 528
    sget-object v12, LP1/g;->e:Ljava/lang/String;

    .line 529
    .line 530
    invoke-virtual {v8, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 531
    .line 532
    .line 533
    move-result v12

    .line 534
    sget-object v14, LP1/g;->f:Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v8, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    invoke-direct {v13, v15, v12, v8}, LP1/g;-><init>(III)V

    .line 541
    .line 542
    .line 543
    invoke-interface {v1, v13, v9, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 544
    .line 545
    .line 546
    goto :goto_5

    .line 547
    :cond_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v12, LP1/f;

    .line 551
    .line 552
    sget-object v13, LP1/f;->c:Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v8, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v13

    .line 558
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    sget-object v14, LP1/f;->d:Ljava/lang/String;

    .line 562
    .line 563
    invoke-virtual {v8, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 564
    .line 565
    .line 566
    move-result v8

    .line 567
    invoke-direct {v12, v13, v8}, LP1/f;-><init>(Ljava/lang/String;I)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v1, v12, v9, v10, v11}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 571
    .line 572
    .line 573
    :goto_5
    const/4 v12, 0x0

    .line 574
    goto/16 :goto_4

    .line 575
    .line 576
    :cond_b
    move-object/from16 v17, v1

    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_c
    const/16 v17, 0x0

    .line 580
    .line 581
    :goto_6
    sget-object v1, LP1/b;->t:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    check-cast v1, Landroid/text/Layout$Alignment;

    .line 588
    .line 589
    if-eqz v1, :cond_d

    .line 590
    .line 591
    move-object/from16 v18, v1

    .line 592
    .line 593
    goto :goto_7

    .line 594
    :cond_d
    const/16 v18, 0x0

    .line 595
    .line 596
    :goto_7
    sget-object v1, LP1/b;->u:Ljava/lang/String;

    .line 597
    .line 598
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, Landroid/text/Layout$Alignment;

    .line 603
    .line 604
    if-eqz v1, :cond_e

    .line 605
    .line 606
    move-object/from16 v19, v1

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_e
    const/16 v19, 0x0

    .line 610
    .line 611
    :goto_8
    sget-object v1, LP1/b;->v:Ljava/lang/String;

    .line 612
    .line 613
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    check-cast v1, Landroid/graphics/Bitmap;

    .line 618
    .line 619
    if-eqz v1, :cond_f

    .line 620
    .line 621
    :goto_9
    move-object/from16 v20, v1

    .line 622
    .line 623
    goto :goto_a

    .line 624
    :cond_f
    sget-object v1, LP1/b;->w:Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    if-eqz v1, :cond_10

    .line 631
    .line 632
    array-length v3, v1

    .line 633
    invoke-static {v1, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    goto :goto_9

    .line 638
    :cond_10
    const/16 v20, 0x0

    .line 639
    .line 640
    :goto_a
    sget-object v1, LP1/b;->x:Ljava/lang/String;

    .line 641
    .line 642
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    const v4, -0x800001

    .line 647
    .line 648
    .line 649
    const/high16 v7, -0x80000000

    .line 650
    .line 651
    if-eqz v3, :cond_11

    .line 652
    .line 653
    sget-object v3, LP1/b;->y:Ljava/lang/String;

    .line 654
    .line 655
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 656
    .line 657
    .line 658
    move-result v8

    .line 659
    if-eqz v8, :cond_11

    .line 660
    .line 661
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    move/from16 v21, v1

    .line 670
    .line 671
    move/from16 v22, v3

    .line 672
    .line 673
    goto :goto_b

    .line 674
    :cond_11
    move/from16 v21, v4

    .line 675
    .line 676
    move/from16 v22, v7

    .line 677
    .line 678
    :goto_b
    sget-object v1, LP1/b;->z:Ljava/lang/String;

    .line 679
    .line 680
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-eqz v3, :cond_12

    .line 685
    .line 686
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 687
    .line 688
    .line 689
    move-result v1

    .line 690
    move/from16 v23, v1

    .line 691
    .line 692
    goto :goto_c

    .line 693
    :cond_12
    move/from16 v23, v7

    .line 694
    .line 695
    :goto_c
    sget-object v1, LP1/b;->A:Ljava/lang/String;

    .line 696
    .line 697
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_13

    .line 702
    .line 703
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    move/from16 v24, v1

    .line 708
    .line 709
    goto :goto_d

    .line 710
    :cond_13
    move/from16 v24, v4

    .line 711
    .line 712
    :goto_d
    sget-object v1, LP1/b;->B:Ljava/lang/String;

    .line 713
    .line 714
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-eqz v3, :cond_14

    .line 719
    .line 720
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    move/from16 v25, v1

    .line 725
    .line 726
    goto :goto_e

    .line 727
    :cond_14
    move/from16 v25, v7

    .line 728
    .line 729
    :goto_e
    sget-object v1, LP1/b;->D:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 732
    .line 733
    .line 734
    move-result v3

    .line 735
    if-eqz v3, :cond_15

    .line 736
    .line 737
    sget-object v3, LP1/b;->C:Ljava/lang/String;

    .line 738
    .line 739
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 740
    .line 741
    .line 742
    move-result v8

    .line 743
    if-eqz v8, :cond_15

    .line 744
    .line 745
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    move/from16 v27, v1

    .line 754
    .line 755
    move/from16 v26, v3

    .line 756
    .line 757
    goto :goto_f

    .line 758
    :cond_15
    move/from16 v27, v4

    .line 759
    .line 760
    move/from16 v26, v7

    .line 761
    .line 762
    :goto_f
    sget-object v1, LP1/b;->E:Ljava/lang/String;

    .line 763
    .line 764
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    if-eqz v3, :cond_16

    .line 769
    .line 770
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 771
    .line 772
    .line 773
    move-result v1

    .line 774
    move/from16 v28, v1

    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_16
    move/from16 v28, v4

    .line 778
    .line 779
    :goto_10
    sget-object v1, LP1/b;->F:Ljava/lang/String;

    .line 780
    .line 781
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    if-eqz v3, :cond_17

    .line 786
    .line 787
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    :cond_17
    move/from16 v29, v4

    .line 792
    .line 793
    sget-object v1, LP1/b;->G:Ljava/lang/String;

    .line 794
    .line 795
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-eqz v3, :cond_18

    .line 800
    .line 801
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    :goto_11
    move/from16 v31, v1

    .line 806
    .line 807
    goto :goto_12

    .line 808
    :cond_18
    const/high16 v1, -0x1000000

    .line 809
    .line 810
    move v5, v2

    .line 811
    goto :goto_11

    .line 812
    :goto_12
    sget-object v1, LP1/b;->H:Ljava/lang/String;

    .line 813
    .line 814
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-nez v1, :cond_19

    .line 819
    .line 820
    move/from16 v30, v2

    .line 821
    .line 822
    goto :goto_13

    .line 823
    :cond_19
    move/from16 v30, v5

    .line 824
    .line 825
    :goto_13
    sget-object v1, LP1/b;->I:Ljava/lang/String;

    .line 826
    .line 827
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 828
    .line 829
    .line 830
    move-result v2

    .line 831
    if-eqz v2, :cond_1a

    .line 832
    .line 833
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 834
    .line 835
    .line 836
    move-result v7

    .line 837
    :cond_1a
    move/from16 v32, v7

    .line 838
    .line 839
    sget-object v1, LP1/b;->J:Ljava/lang/String;

    .line 840
    .line 841
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    if-eqz v2, :cond_1b

    .line 846
    .line 847
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 848
    .line 849
    .line 850
    move-result v0

    .line 851
    :goto_14
    move/from16 v33, v0

    .line 852
    .line 853
    goto :goto_15

    .line 854
    :cond_1b
    const/4 v0, 0x0

    .line 855
    goto :goto_14

    .line 856
    :goto_15
    new-instance v16, LP1/b;

    .line 857
    .line 858
    invoke-direct/range {v16 .. v33}, LP1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 859
    .line 860
    .line 861
    return-object v16

    .line 862
    :sswitch_4
    move-object/from16 v0, p1

    .line 863
    .line 864
    check-cast v0, LN1/o;

    .line 865
    .line 866
    new-instance v1, Ljava/lang/StringBuilder;

    .line 867
    .line 868
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 869
    .line 870
    .line 871
    iget-object v2, v0, LN1/o;->a:Ljava/lang/String;

    .line 872
    .line 873
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    .line 875
    .line 876
    const-string v2, ": "

    .line 877
    .line 878
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    iget-object v0, v0, LN1/o;->b:Ljava/lang/String;

    .line 882
    .line 883
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    return-object v0

    .line 891
    :sswitch_5
    move-object/from16 v0, p1

    .line 892
    .line 893
    check-cast v0, LM2/s;

    .line 894
    .line 895
    return-object v0

    .line 896
    :sswitch_6
    move-object/from16 v0, p1

    .line 897
    .line 898
    check-cast v0, [B

    .line 899
    .line 900
    return-object v0

    .line 901
    :sswitch_7
    move-object/from16 v0, p1

    .line 902
    .line 903
    check-cast v0, Lsa/f;

    .line 904
    .line 905
    invoke-virtual {v0}, Lsa/f;->b()Lz9/Q;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    invoke-virtual {v1}, Lz9/Q;->f()I

    .line 910
    .line 911
    .line 912
    move-result v1

    .line 913
    invoke-static {v1}, LA/f;->f(I)I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    if-eqz v1, :cond_1c

    .line 918
    .line 919
    if-eq v1, v5, :cond_1c

    .line 920
    .line 921
    if-eq v1, v4, :cond_1c

    .line 922
    .line 923
    if-eq v1, v3, :cond_1c

    .line 924
    .line 925
    const-string v0, "Filtering non-displayable message"

    .line 926
    .line 927
    invoke-static {v0}, Lic/d;->E(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    sget-object v0, LSe/e;->a:LSe/e;

    .line 931
    .line 932
    goto :goto_16

    .line 933
    :cond_1c
    invoke-static {v0}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    :goto_16
    return-object v0

    .line 938
    nop

    .line 939
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_7
        0x8 -> :sswitch_6
        0x9 -> :sswitch_5
        0xf -> :sswitch_4
        0x11 -> :sswitch_3
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 8

    .line 1
    iget v0, p0, LJ9/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LUc/n;

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-static {v2}, LA/f;->g(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    aget p1, v2, p1

    .line 37
    .line 38
    new-instance v2, LPc/o;

    .line 39
    .line 40
    const/16 v3, 0x10

    .line 41
    .line 42
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    new-instance v0, LMb/b;

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    invoke-direct {v0, v1, p1, v2, v3}, LMb/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    check-cast p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    move-object v3, v1

    .line 70
    check-cast v3, LUc/n;

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object v4, v1

    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v6, p1

    .line 86
    check-cast v6, LUc/t;

    .line 87
    .line 88
    new-instance v5, LPc/p;

    .line 89
    .line 90
    const/16 p1, 0x10

    .line 91
    .line 92
    invoke-direct {v5, v0, p2, p1}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 96
    .line 97
    new-instance v2, LCb/a;

    .line 98
    .line 99
    const/4 v7, 0x6

    .line 100
    invoke-direct/range {v2 .. v7}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    check-cast p1, Ljava/util/ArrayList;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, LUc/n;

    .line 120
    .line 121
    const/4 v2, 0x1

    .line 122
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    new-instance v2, LPc/q;

    .line 129
    .line 130
    const/16 v3, 0xf

    .line 131
    .line 132
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 133
    .line 134
    .line 135
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 136
    .line 137
    new-instance v0, LAb/a;

    .line 138
    .line 139
    const/16 v3, 0xd

    .line 140
    .line 141
    invoke-direct {v0, v1, p1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(LO9/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LJ9/x;->a:I

    .line 2
    .line 3
    check-cast p1, LN1/H;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    new-instance v0, LE5/Q;

    .line 13
    .line 14
    const-string v1, "Player release timed out."

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, LU1/j;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    const/16 v3, 0x3eb

    .line 24
    .line 25
    invoke-direct {v1, v2, v0, v3}, LU1/j;-><init>(ILjava/lang/Exception;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v1}, LN1/H;->C(LN1/E;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LJ9/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->a(LC6/l;)LP9/d;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:LL8/p;

    .line 12
    .line 13
    sget-object p1, LM8/k;->a:LM8/k;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_1
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:LL8/p;

    .line 17
    .line 18
    invoke-virtual {p1}, LL8/p;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_2
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:LL8/p;

    .line 26
    .line 27
    invoke-virtual {p1}, LL8/p;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_3
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:LL8/p;

    .line 35
    .line 36
    invoke-virtual {p1}, LL8/p;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "FirebaseCrashlytics"

    .line 2
    .line 3
    const-string v1, "Error fetching settings."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    xor-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    return p1
.end method
