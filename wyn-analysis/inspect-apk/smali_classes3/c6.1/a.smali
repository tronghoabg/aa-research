.class public final Lc6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc6/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/k;Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->c:I

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/gms/common/internal/k;->d:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {p1, v2, v1, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x5

    .line 42
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->e:Landroid/os/IBinder;

    .line 43
    .line 44
    invoke-static {p1, v1, v4}, La/a;->V(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 49
    .line 50
    invoke-static {p1, v1, v4, p2}, La/a;->d0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x7

    .line 54
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->g:Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-static {p1, v1, v4, v3}, La/a;->S(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->h:Landroid/accounts/Account;

    .line 62
    .line 63
    invoke-static {p1, v1, v4, p2, v3}, La/a;->Z(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0xa

    .line 67
    .line 68
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->i:[Ld7/d;

    .line 69
    .line 70
    invoke-static {p1, v1, v4, p2}, La/a;->d0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 71
    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    iget-object v4, p0, Lcom/google/android/gms/common/internal/k;->j:[Ld7/d;

    .line 76
    .line 77
    invoke-static {p1, v1, v4, p2}, La/a;->d0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 78
    .line 79
    .line 80
    const/16 p2, 0xc

    .line 81
    .line 82
    invoke-static {p1, p2, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 83
    .line 84
    .line 85
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/k;->k:Z

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    const/16 p2, 0xd

    .line 91
    .line 92
    invoke-static {p1, p2, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 93
    .line 94
    .line 95
    iget p2, p0, Lcom/google/android/gms/common/internal/k;->l:I

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    .line 99
    .line 100
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/k;->m:Z

    .line 101
    .line 102
    const/16 v1, 0xe

    .line 103
    .line 104
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    .line 109
    .line 110
    const/16 p2, 0xf

    .line 111
    .line 112
    iget-object p0, p0, Lcom/google/android/gms/common/internal/k;->n:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, p2, p0, v3}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    move-object/from16 v10, p0

    .line 13
    .line 14
    iget v11, v10, Lc6/a;->a:I

    .line 15
    .line 16
    packed-switch v11, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    move v12, v8

    .line 24
    move v15, v12

    .line 25
    move-object v13, v9

    .line 26
    move-object v14, v13

    .line 27
    move-object/from16 v16, v14

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v2, v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-char v3, v2

    .line 40
    if-eq v3, v7, :cond_4

    .line 41
    .line 42
    if-eq v3, v6, :cond_3

    .line 43
    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    if-eq v3, v4, :cond_1

    .line 47
    .line 48
    const/16 v9, 0x3e8

    .line 49
    .line 50
    if-eq v3, v9, :cond_0

    .line 51
    .line 52
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {v2, v0}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v16

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    sget-object v3, Landroid/database/CursorWindow;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    move-object v14, v2

    .line 78
    check-cast v14, [Landroid/database/CursorWindow;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-static {v2, v0}, LU8/v0;->z(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 87
    .line 88
    .line 89
    new-instance v11, Lcom/google/android/gms/common/data/DataHolder;

    .line 90
    .line 91
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/data/DataHolder;-><init>(I[Ljava/lang/String;[Landroid/database/CursorWindow;ILandroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Landroid/os/Bundle;

    .line 95
    .line 96
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, v11, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 100
    .line 101
    move v0, v8

    .line 102
    :goto_1
    iget-object v1, v11, Lcom/google/android/gms/common/data/DataHolder;->b:[Ljava/lang/String;

    .line 103
    .line 104
    array-length v2, v1

    .line 105
    if-ge v0, v2, :cond_6

    .line 106
    .line 107
    iget-object v2, v11, Lcom/google/android/gms/common/data/DataHolder;->c:Landroid/os/Bundle;

    .line 108
    .line 109
    aget-object v1, v1, v0

    .line 110
    .line 111
    invoke-virtual {v2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    add-int/2addr v0, v7

    .line 115
    goto :goto_1

    .line 116
    :cond_6
    iget-object v0, v11, Lcom/google/android/gms/common/data/DataHolder;->d:[Landroid/database/CursorWindow;

    .line 117
    .line 118
    array-length v1, v0

    .line 119
    new-array v1, v1, [I

    .line 120
    .line 121
    iput-object v1, v11, Lcom/google/android/gms/common/data/DataHolder;->g:[I

    .line 122
    .line 123
    move v1, v8

    .line 124
    :goto_2
    array-length v2, v0

    .line 125
    if-ge v8, v2, :cond_7

    .line 126
    .line 127
    iget-object v2, v11, Lcom/google/android/gms/common/data/DataHolder;->g:[I

    .line 128
    .line 129
    aput v1, v2, v8

    .line 130
    .line 131
    aget-object v2, v0, v8

    .line 132
    .line 133
    invoke-virtual {v2}, Landroid/database/CursorWindow;->getStartPosition()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    sub-int v2, v1, v2

    .line 138
    .line 139
    aget-object v3, v0, v8

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/database/CursorWindow;->getNumRows()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    sub-int/2addr v3, v2

    .line 146
    add-int/2addr v1, v3

    .line 147
    add-int/2addr v8, v7

    .line 148
    goto :goto_2

    .line 149
    :cond_7
    return-object v11

    .line 150
    :pswitch_0
    new-instance v1, Le6/a;

    .line 151
    .line 152
    invoke-direct {v1, v0}, LZ5/b;-><init>(Landroid/os/Parcel;)V

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :pswitch_1
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    move v2, v8

    .line 161
    move-object v3, v9

    .line 162
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    if-ge v11, v1, :cond_c

    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    int-to-char v12, v11

    .line 173
    if-eq v12, v7, :cond_b

    .line 174
    .line 175
    if-eq v12, v6, :cond_a

    .line 176
    .line 177
    if-eq v12, v5, :cond_9

    .line 178
    .line 179
    if-eq v12, v4, :cond_8

    .line 180
    .line 181
    invoke-static {v11, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    invoke-static {v11, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    goto :goto_3

    .line 190
    :cond_9
    invoke-static {v11, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    goto :goto_3

    .line 195
    :cond_a
    invoke-static {v11, v0}, LU8/v0;->e0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    goto :goto_3

    .line 200
    :cond_b
    invoke-static {v11, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    goto :goto_3

    .line 205
    :cond_c
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 206
    .line 207
    .line 208
    new-instance v0, Ld7/u;

    .line 209
    .line 210
    invoke-direct {v0, v9, v3, v8, v2}, Ld7/u;-><init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_2
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    move-wide/from16 v17, v1

    .line 219
    .line 220
    move v13, v8

    .line 221
    move v15, v13

    .line 222
    move/from16 v16, v15

    .line 223
    .line 224
    move-object v14, v9

    .line 225
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-ge v1, v11, :cond_12

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    int-to-char v2, v1

    .line 236
    if-eq v2, v7, :cond_11

    .line 237
    .line 238
    if-eq v2, v6, :cond_10

    .line 239
    .line 240
    if-eq v2, v5, :cond_f

    .line 241
    .line 242
    if-eq v2, v4, :cond_e

    .line 243
    .line 244
    if-eq v2, v3, :cond_d

    .line 245
    .line 246
    invoke-static {v1, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_d
    invoke-static {v1, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 251
    .line 252
    .line 253
    move-result-wide v1

    .line 254
    move-wide/from16 v17, v1

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_e
    invoke-static {v1, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    move/from16 v16, v1

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_f
    invoke-static {v1, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    move v15, v1

    .line 269
    goto :goto_4

    .line 270
    :cond_10
    invoke-static {v1, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    move-object v14, v1

    .line 275
    goto :goto_4

    .line 276
    :cond_11
    invoke-static {v1, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    move v13, v1

    .line 281
    goto :goto_4

    .line 282
    :cond_12
    invoke-static {v11, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 283
    .line 284
    .line 285
    new-instance v12, Ld7/t;

    .line 286
    .line 287
    invoke-direct/range {v12 .. v18}, Ld7/t;-><init>(ZLjava/lang/String;IIJ)V

    .line 288
    .line 289
    .line 290
    return-object v12

    .line 291
    :pswitch_3
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    move v13, v8

    .line 296
    move v14, v13

    .line 297
    move/from16 v16, v14

    .line 298
    .line 299
    move/from16 v17, v16

    .line 300
    .line 301
    move/from16 v18, v17

    .line 302
    .line 303
    move-object v12, v9

    .line 304
    move-object v15, v12

    .line 305
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-ge v2, v1, :cond_13

    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    int-to-char v3, v2

    .line 316
    packed-switch v3, :pswitch_data_1

    .line 317
    .line 318
    .line 319
    :pswitch_4
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :pswitch_5
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 324
    .line 325
    .line 326
    move-result v18

    .line 327
    goto :goto_5

    .line 328
    :pswitch_6
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 329
    .line 330
    .line 331
    move-result v17

    .line 332
    goto :goto_5

    .line 333
    :pswitch_7
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 334
    .line 335
    .line 336
    move-result v16

    .line 337
    goto :goto_5

    .line 338
    :pswitch_8
    invoke-static {v2, v0}, LU8/v0;->e0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    goto :goto_5

    .line 343
    :pswitch_9
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 344
    .line 345
    .line 346
    move-result v14

    .line 347
    goto :goto_5

    .line 348
    :pswitch_a
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    goto :goto_5

    .line 353
    :pswitch_b
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    goto :goto_5

    .line 358
    :cond_13
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 359
    .line 360
    .line 361
    new-instance v11, Ld7/s;

    .line 362
    .line 363
    invoke-direct/range {v11 .. v18}, Ld7/s;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V

    .line 364
    .line 365
    .line 366
    return-object v11

    .line 367
    :pswitch_c
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    move-wide v13, v1

    .line 372
    move v12, v8

    .line 373
    move/from16 v16, v12

    .line 374
    .line 375
    move-object v15, v9

    .line 376
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-ge v1, v3, :cond_18

    .line 381
    .line 382
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    int-to-char v2, v1

    .line 387
    if-eq v2, v7, :cond_17

    .line 388
    .line 389
    if-eq v2, v6, :cond_16

    .line 390
    .line 391
    if-eq v2, v5, :cond_15

    .line 392
    .line 393
    if-eq v2, v4, :cond_14

    .line 394
    .line 395
    invoke-static {v1, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 396
    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_14
    invoke-static {v1, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    move/from16 v16, v1

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_15
    invoke-static {v1, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 407
    .line 408
    .line 409
    move-result-wide v1

    .line 410
    move-wide v13, v1

    .line 411
    goto :goto_6

    .line 412
    :cond_16
    invoke-static {v1, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    move v12, v1

    .line 417
    goto :goto_6

    .line 418
    :cond_17
    invoke-static {v1, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    move-object v15, v1

    .line 423
    goto :goto_6

    .line 424
    :cond_18
    invoke-static {v3, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 425
    .line 426
    .line 427
    new-instance v11, Ld7/d;

    .line 428
    .line 429
    invoke-direct/range {v11 .. v16}, Ld7/d;-><init>(IJLjava/lang/String;Z)V

    .line 430
    .line 431
    .line 432
    return-object v11

    .line 433
    :pswitch_d
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    move v12, v8

    .line 438
    move v13, v12

    .line 439
    move-object v14, v9

    .line 440
    move-object v15, v14

    .line 441
    move-object/from16 v16, v15

    .line 442
    .line 443
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-ge v2, v1, :cond_1e

    .line 448
    .line 449
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 450
    .line 451
    .line 452
    move-result v2

    .line 453
    int-to-char v8, v2

    .line 454
    if-eq v8, v7, :cond_1d

    .line 455
    .line 456
    if-eq v8, v6, :cond_1c

    .line 457
    .line 458
    if-eq v8, v5, :cond_1b

    .line 459
    .line 460
    if-eq v8, v4, :cond_1a

    .line 461
    .line 462
    if-eq v8, v3, :cond_19

    .line 463
    .line 464
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 465
    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_19
    invoke-static {v2, v0}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v16

    .line 472
    goto :goto_7

    .line 473
    :cond_1a
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v15

    .line 477
    goto :goto_7

    .line 478
    :cond_1b
    sget-object v8, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 479
    .line 480
    invoke-static {v0, v2, v8}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    move-object v14, v2

    .line 485
    check-cast v14, Landroid/app/PendingIntent;

    .line 486
    .line 487
    goto :goto_7

    .line 488
    :cond_1c
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 489
    .line 490
    .line 491
    move-result v13

    .line 492
    goto :goto_7

    .line 493
    :cond_1d
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 494
    .line 495
    .line 496
    move-result v12

    .line 497
    goto :goto_7

    .line 498
    :cond_1e
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 499
    .line 500
    .line 501
    new-instance v11, Ld7/b;

    .line 502
    .line 503
    invoke-direct/range {v11 .. v16}, Ld7/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 504
    .line 505
    .line 506
    return-object v11

    .line 507
    :pswitch_e
    new-instance v1, Ld6/j;

    .line 508
    .line 509
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 510
    .line 511
    .line 512
    move-result-wide v2

    .line 513
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 514
    .line 515
    .line 516
    move-result-wide v4

    .line 517
    invoke-direct {v1, v2, v3, v4, v5}, Ld6/j;-><init>(JJ)V

    .line 518
    .line 519
    .line 520
    return-object v1

    .line 521
    :pswitch_f
    new-instance v1, Ld6/i;

    .line 522
    .line 523
    invoke-direct {v1, v0}, Ld6/i;-><init>(Landroid/os/Parcel;)V

    .line 524
    .line 525
    .line 526
    return-object v1

    .line 527
    :pswitch_10
    new-instance v0, Ld6/f;

    .line 528
    .line 529
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 530
    .line 531
    .line 532
    return-object v0

    .line 533
    :pswitch_11
    new-instance v1, Ld6/e;

    .line 534
    .line 535
    invoke-direct {v1, v0}, Ld6/e;-><init>(Landroid/os/Parcel;)V

    .line 536
    .line 537
    .line 538
    return-object v1

    .line 539
    :pswitch_12
    new-instance v1, Ld6/a;

    .line 540
    .line 541
    invoke-direct {v1, v0}, Ld6/a;-><init>(Landroid/os/Parcel;)V

    .line 542
    .line 543
    .line 544
    return-object v1

    .line 545
    :pswitch_13
    new-instance v1, Ld/d;

    .line 546
    .line 547
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    sget v2, Ld/c;->b:I

    .line 555
    .line 556
    if-nez v0, :cond_1f

    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_1f
    sget-object v2, Ld/b;->Y8:Ljava/lang/String;

    .line 560
    .line 561
    invoke-interface {v0, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    if-eqz v2, :cond_20

    .line 566
    .line 567
    instance-of v3, v2, Ld/b;

    .line 568
    .line 569
    if-eqz v3, :cond_20

    .line 570
    .line 571
    move-object v9, v2

    .line 572
    check-cast v9, Ld/b;

    .line 573
    .line 574
    goto :goto_8

    .line 575
    :cond_20
    new-instance v9, Ld/a;

    .line 576
    .line 577
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 578
    .line 579
    .line 580
    iput-object v0, v9, Ld/a;->a:Landroid/os/IBinder;

    .line 581
    .line 582
    :goto_8
    iput-object v9, v1, Ld/d;->a:Ld/b;

    .line 583
    .line 584
    return-object v1

    .line 585
    :pswitch_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 586
    .line 587
    .line 588
    move-result v1

    .line 589
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    invoke-static {v1, v0}, Lcom/google/android/material/datepicker/n;->c(II)Lcom/google/android/material/datepicker/n;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    return-object v0

    .line 598
    :pswitch_15
    new-instance v1, Lcom/google/android/material/datepicker/d;

    .line 599
    .line 600
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 601
    .line 602
    .line 603
    move-result-wide v2

    .line 604
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/datepicker/d;-><init>(J)V

    .line 605
    .line 606
    .line 607
    return-object v1

    .line 608
    :pswitch_16
    const-class v1, Lcom/google/android/material/datepicker/n;

    .line 609
    .line 610
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    move-object v4, v2

    .line 619
    check-cast v4, Lcom/google/android/material/datepicker/n;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    move-object v5, v2

    .line 630
    check-cast v5, Lcom/google/android/material/datepicker/n;

    .line 631
    .line 632
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    move-object v7, v1

    .line 641
    check-cast v7, Lcom/google/android/material/datepicker/n;

    .line 642
    .line 643
    const-class v1, Lcom/google/android/material/datepicker/d;

    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    move-object v6, v1

    .line 654
    check-cast v6, Lcom/google/android/material/datepicker/d;

    .line 655
    .line 656
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 657
    .line 658
    .line 659
    move-result v8

    .line 660
    new-instance v3, Lcom/google/android/material/datepicker/b;

    .line 661
    .line 662
    invoke-direct/range {v3 .. v8}, Lcom/google/android/material/datepicker/b;-><init>(Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/n;I)V

    .line 663
    .line 664
    .line 665
    return-object v3

    .line 666
    :pswitch_17
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    sget-object v2, Lcom/google/android/gms/common/internal/k;->o:[Lcom/google/android/gms/common/api/Scope;

    .line 671
    .line 672
    new-instance v3, Landroid/os/Bundle;

    .line 673
    .line 674
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 675
    .line 676
    .line 677
    sget-object v4, Lcom/google/android/gms/common/internal/k;->p:[Ld7/d;

    .line 678
    .line 679
    move-object/from16 v17, v2

    .line 680
    .line 681
    move-object/from16 v18, v3

    .line 682
    .line 683
    move-object/from16 v20, v4

    .line 684
    .line 685
    move-object/from16 v21, v20

    .line 686
    .line 687
    move v12, v8

    .line 688
    move v13, v12

    .line 689
    move v14, v13

    .line 690
    move/from16 v22, v14

    .line 691
    .line 692
    move/from16 v23, v22

    .line 693
    .line 694
    move/from16 v24, v23

    .line 695
    .line 696
    move-object v15, v9

    .line 697
    move-object/from16 v16, v15

    .line 698
    .line 699
    move-object/from16 v19, v16

    .line 700
    .line 701
    move-object/from16 v25, v19

    .line 702
    .line 703
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    if-ge v2, v1, :cond_21

    .line 708
    .line 709
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    int-to-char v3, v2

    .line 714
    packed-switch v3, :pswitch_data_2

    .line 715
    .line 716
    .line 717
    :pswitch_18
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 718
    .line 719
    .line 720
    goto :goto_9

    .line 721
    :pswitch_19
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v25

    .line 725
    goto :goto_9

    .line 726
    :pswitch_1a
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 727
    .line 728
    .line 729
    move-result v24

    .line 730
    goto :goto_9

    .line 731
    :pswitch_1b
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 732
    .line 733
    .line 734
    move-result v23

    .line 735
    goto :goto_9

    .line 736
    :pswitch_1c
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 737
    .line 738
    .line 739
    move-result v22

    .line 740
    goto :goto_9

    .line 741
    :pswitch_1d
    sget-object v3, Ld7/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 742
    .line 743
    invoke-static {v0, v2, v3}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    move-object/from16 v21, v2

    .line 748
    .line 749
    check-cast v21, [Ld7/d;

    .line 750
    .line 751
    goto :goto_9

    .line 752
    :pswitch_1e
    sget-object v3, Ld7/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 753
    .line 754
    invoke-static {v0, v2, v3}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    move-object/from16 v20, v2

    .line 759
    .line 760
    check-cast v20, [Ld7/d;

    .line 761
    .line 762
    goto :goto_9

    .line 763
    :pswitch_1f
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 764
    .line 765
    invoke-static {v0, v2, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    move-object/from16 v19, v2

    .line 770
    .line 771
    check-cast v19, Landroid/accounts/Account;

    .line 772
    .line 773
    goto :goto_9

    .line 774
    :pswitch_20
    invoke-static {v2, v0}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 775
    .line 776
    .line 777
    move-result-object v18

    .line 778
    goto :goto_9

    .line 779
    :pswitch_21
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 780
    .line 781
    invoke-static {v0, v2, v3}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    move-object/from16 v17, v2

    .line 786
    .line 787
    check-cast v17, [Lcom/google/android/gms/common/api/Scope;

    .line 788
    .line 789
    goto :goto_9

    .line 790
    :pswitch_22
    invoke-static {v2, v0}, LU8/v0;->e0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 791
    .line 792
    .line 793
    move-result-object v16

    .line 794
    goto :goto_9

    .line 795
    :pswitch_23
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v15

    .line 799
    goto :goto_9

    .line 800
    :pswitch_24
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 801
    .line 802
    .line 803
    move-result v14

    .line 804
    goto :goto_9

    .line 805
    :pswitch_25
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 806
    .line 807
    .line 808
    move-result v13

    .line 809
    goto :goto_9

    .line 810
    :pswitch_26
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 811
    .line 812
    .line 813
    move-result v12

    .line 814
    goto :goto_9

    .line 815
    :cond_21
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 816
    .line 817
    .line 818
    new-instance v11, Lcom/google/android/gms/common/internal/k;

    .line 819
    .line 820
    invoke-direct/range {v11 .. v25}, Lcom/google/android/gms/common/internal/k;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Ld7/d;[Ld7/d;ZIZLjava/lang/String;)V

    .line 821
    .line 822
    .line 823
    return-object v11

    .line 824
    :pswitch_27
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 825
    .line 826
    .line 827
    move-result v1

    .line 828
    move v13, v8

    .line 829
    move v14, v13

    .line 830
    move/from16 v16, v14

    .line 831
    .line 832
    move-object v12, v9

    .line 833
    move-object v15, v12

    .line 834
    move-object/from16 v17, v15

    .line 835
    .line 836
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 837
    .line 838
    .line 839
    move-result v2

    .line 840
    if-ge v2, v1, :cond_22

    .line 841
    .line 842
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    int-to-char v3, v2

    .line 847
    packed-switch v3, :pswitch_data_3

    .line 848
    .line 849
    .line 850
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 851
    .line 852
    .line 853
    goto :goto_a

    .line 854
    :pswitch_28
    invoke-static {v2, v0}, LU8/v0;->t(ILandroid/os/Parcel;)[I

    .line 855
    .line 856
    .line 857
    move-result-object v17

    .line 858
    goto :goto_a

    .line 859
    :pswitch_29
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 860
    .line 861
    .line 862
    move-result v16

    .line 863
    goto :goto_a

    .line 864
    :pswitch_2a
    invoke-static {v2, v0}, LU8/v0;->t(ILandroid/os/Parcel;)[I

    .line 865
    .line 866
    .line 867
    move-result-object v15

    .line 868
    goto :goto_a

    .line 869
    :pswitch_2b
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 870
    .line 871
    .line 872
    move-result v14

    .line 873
    goto :goto_a

    .line 874
    :pswitch_2c
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 875
    .line 876
    .line 877
    move-result v13

    .line 878
    goto :goto_a

    .line 879
    :pswitch_2d
    sget-object v3, Lcom/google/android/gms/common/internal/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 880
    .line 881
    invoke-static {v0, v2, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    move-object v12, v2

    .line 886
    check-cast v12, Lcom/google/android/gms/common/internal/x;

    .line 887
    .line 888
    goto :goto_a

    .line 889
    :cond_22
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 890
    .line 891
    .line 892
    new-instance v11, Lcom/google/android/gms/common/internal/j;

    .line 893
    .line 894
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/common/internal/j;-><init>(Lcom/google/android/gms/common/internal/x;ZZ[II[I)V

    .line 895
    .line 896
    .line 897
    return-object v11

    .line 898
    :pswitch_2e
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 899
    .line 900
    .line 901
    move-result v1

    .line 902
    move-object v2, v9

    .line 903
    move-object v3, v2

    .line 904
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 905
    .line 906
    .line 907
    move-result v11

    .line 908
    if-ge v11, v1, :cond_27

    .line 909
    .line 910
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 911
    .line 912
    .line 913
    move-result v11

    .line 914
    int-to-char v12, v11

    .line 915
    if-eq v12, v7, :cond_26

    .line 916
    .line 917
    if-eq v12, v6, :cond_25

    .line 918
    .line 919
    if-eq v12, v5, :cond_24

    .line 920
    .line 921
    if-eq v12, v4, :cond_23

    .line 922
    .line 923
    invoke-static {v11, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 924
    .line 925
    .line 926
    goto :goto_b

    .line 927
    :cond_23
    sget-object v3, Lcom/google/android/gms/common/internal/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 928
    .line 929
    invoke-static {v0, v11, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    check-cast v3, Lcom/google/android/gms/common/internal/j;

    .line 934
    .line 935
    goto :goto_b

    .line 936
    :cond_24
    invoke-static {v11, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 937
    .line 938
    .line 939
    move-result v8

    .line 940
    goto :goto_b

    .line 941
    :cond_25
    sget-object v2, Ld7/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 942
    .line 943
    invoke-static {v0, v11, v2}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    check-cast v2, [Ld7/d;

    .line 948
    .line 949
    goto :goto_b

    .line 950
    :cond_26
    invoke-static {v11, v0}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    goto :goto_b

    .line 955
    :cond_27
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 956
    .line 957
    .line 958
    new-instance v0, Lcom/google/android/gms/common/internal/T;

    .line 959
    .line 960
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 961
    .line 962
    .line 963
    iput-object v9, v0, Lcom/google/android/gms/common/internal/T;->a:Landroid/os/Bundle;

    .line 964
    .line 965
    iput-object v2, v0, Lcom/google/android/gms/common/internal/T;->b:[Ld7/d;

    .line 966
    .line 967
    iput v8, v0, Lcom/google/android/gms/common/internal/T;->c:I

    .line 968
    .line 969
    iput-object v3, v0, Lcom/google/android/gms/common/internal/T;->d:Lcom/google/android/gms/common/internal/j;

    .line 970
    .line 971
    return-object v0

    .line 972
    :pswitch_2f
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    move v12, v8

    .line 977
    move v13, v12

    .line 978
    move v14, v13

    .line 979
    move v15, v14

    .line 980
    move/from16 v16, v15

    .line 981
    .line 982
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-ge v2, v1, :cond_2d

    .line 987
    .line 988
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    int-to-char v8, v2

    .line 993
    if-eq v8, v7, :cond_2c

    .line 994
    .line 995
    if-eq v8, v6, :cond_2b

    .line 996
    .line 997
    if-eq v8, v5, :cond_2a

    .line 998
    .line 999
    if-eq v8, v4, :cond_29

    .line 1000
    .line 1001
    if-eq v8, v3, :cond_28

    .line 1002
    .line 1003
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_c

    .line 1007
    :cond_28
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1008
    .line 1009
    .line 1010
    move-result v14

    .line 1011
    goto :goto_c

    .line 1012
    :cond_29
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1013
    .line 1014
    .line 1015
    move-result v13

    .line 1016
    goto :goto_c

    .line 1017
    :cond_2a
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v16

    .line 1021
    goto :goto_c

    .line 1022
    :cond_2b
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v15

    .line 1026
    goto :goto_c

    .line 1027
    :cond_2c
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1028
    .line 1029
    .line 1030
    move-result v12

    .line 1031
    goto :goto_c

    .line 1032
    :cond_2d
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1033
    .line 1034
    .line 1035
    new-instance v11, Lcom/google/android/gms/common/internal/x;

    .line 1036
    .line 1037
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/x;-><init>(IIIZZ)V

    .line 1038
    .line 1039
    .line 1040
    return-object v11

    .line 1041
    :pswitch_30
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    move v12, v8

    .line 1046
    move v15, v12

    .line 1047
    move/from16 v16, v15

    .line 1048
    .line 1049
    move-object v13, v9

    .line 1050
    move-object v14, v13

    .line 1051
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    if-ge v2, v1, :cond_33

    .line 1056
    .line 1057
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1058
    .line 1059
    .line 1060
    move-result v2

    .line 1061
    int-to-char v8, v2

    .line 1062
    if-eq v8, v7, :cond_32

    .line 1063
    .line 1064
    if-eq v8, v6, :cond_31

    .line 1065
    .line 1066
    if-eq v8, v5, :cond_30

    .line 1067
    .line 1068
    if-eq v8, v4, :cond_2f

    .line 1069
    .line 1070
    if-eq v8, v3, :cond_2e

    .line 1071
    .line 1072
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_d

    .line 1076
    :cond_2e
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v16

    .line 1080
    goto :goto_d

    .line 1081
    :cond_2f
    invoke-static {v2, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v15

    .line 1085
    goto :goto_d

    .line 1086
    :cond_30
    sget-object v8, Ld7/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1087
    .line 1088
    invoke-static {v0, v2, v8}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    move-object v14, v2

    .line 1093
    check-cast v14, Ld7/b;

    .line 1094
    .line 1095
    goto :goto_d

    .line 1096
    :cond_31
    invoke-static {v2, v0}, LU8/v0;->e0(ILandroid/os/Parcel;)Landroid/os/IBinder;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v13

    .line 1100
    goto :goto_d

    .line 1101
    :cond_32
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1102
    .line 1103
    .line 1104
    move-result v12

    .line 1105
    goto :goto_d

    .line 1106
    :cond_33
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1107
    .line 1108
    .line 1109
    new-instance v11, Lcom/google/android/gms/common/internal/F;

    .line 1110
    .line 1111
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/F;-><init>(ILandroid/os/IBinder;Ld7/b;ZZ)V

    .line 1112
    .line 1113
    .line 1114
    return-object v11

    .line 1115
    :pswitch_31
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    move v2, v8

    .line 1120
    move-object v3, v9

    .line 1121
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1122
    .line 1123
    .line 1124
    move-result v11

    .line 1125
    if-ge v11, v1, :cond_38

    .line 1126
    .line 1127
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1128
    .line 1129
    .line 1130
    move-result v11

    .line 1131
    int-to-char v12, v11

    .line 1132
    if-eq v12, v7, :cond_37

    .line 1133
    .line 1134
    if-eq v12, v6, :cond_36

    .line 1135
    .line 1136
    if-eq v12, v5, :cond_35

    .line 1137
    .line 1138
    if-eq v12, v4, :cond_34

    .line 1139
    .line 1140
    invoke-static {v11, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1141
    .line 1142
    .line 1143
    goto :goto_e

    .line 1144
    :cond_34
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1145
    .line 1146
    invoke-static {v0, v11, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v3

    .line 1150
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1151
    .line 1152
    goto :goto_e

    .line 1153
    :cond_35
    invoke-static {v11, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1154
    .line 1155
    .line 1156
    move-result v2

    .line 1157
    goto :goto_e

    .line 1158
    :cond_36
    sget-object v9, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1159
    .line 1160
    invoke-static {v0, v11, v9}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v9

    .line 1164
    check-cast v9, Landroid/accounts/Account;

    .line 1165
    .line 1166
    goto :goto_e

    .line 1167
    :cond_37
    invoke-static {v11, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1168
    .line 1169
    .line 1170
    move-result v8

    .line 1171
    goto :goto_e

    .line 1172
    :cond_38
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1173
    .line 1174
    .line 1175
    new-instance v0, Lcom/google/android/gms/common/internal/E;

    .line 1176
    .line 1177
    invoke-direct {v0, v8, v9, v2, v3}, Lcom/google/android/gms/common/internal/E;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1178
    .line 1179
    .line 1180
    return-object v0

    .line 1181
    :pswitch_32
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1182
    .line 1183
    .line 1184
    move-result v1

    .line 1185
    const/4 v2, -0x1

    .line 1186
    const-wide/16 v3, 0x0

    .line 1187
    .line 1188
    move/from16 v22, v2

    .line 1189
    .line 1190
    move-wide v15, v3

    .line 1191
    move-wide/from16 v17, v15

    .line 1192
    .line 1193
    move v12, v8

    .line 1194
    move v13, v12

    .line 1195
    move v14, v13

    .line 1196
    move/from16 v21, v14

    .line 1197
    .line 1198
    move-object/from16 v19, v9

    .line 1199
    .line 1200
    move-object/from16 v20, v19

    .line 1201
    .line 1202
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1203
    .line 1204
    .line 1205
    move-result v2

    .line 1206
    if-ge v2, v1, :cond_39

    .line 1207
    .line 1208
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1209
    .line 1210
    .line 1211
    move-result v2

    .line 1212
    int-to-char v3, v2

    .line 1213
    packed-switch v3, :pswitch_data_4

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1217
    .line 1218
    .line 1219
    goto :goto_f

    .line 1220
    :pswitch_33
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1221
    .line 1222
    .line 1223
    move-result v2

    .line 1224
    move/from16 v22, v2

    .line 1225
    .line 1226
    goto :goto_f

    .line 1227
    :pswitch_34
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    move/from16 v21, v2

    .line 1232
    .line 1233
    goto :goto_f

    .line 1234
    :pswitch_35
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v2

    .line 1238
    move-object/from16 v20, v2

    .line 1239
    .line 1240
    goto :goto_f

    .line 1241
    :pswitch_36
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    move-object/from16 v19, v2

    .line 1246
    .line 1247
    goto :goto_f

    .line 1248
    :pswitch_37
    invoke-static {v2, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v2

    .line 1252
    move-wide/from16 v17, v2

    .line 1253
    .line 1254
    goto :goto_f

    .line 1255
    :pswitch_38
    invoke-static {v2, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1256
    .line 1257
    .line 1258
    move-result-wide v2

    .line 1259
    move-wide v15, v2

    .line 1260
    goto :goto_f

    .line 1261
    :pswitch_39
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1262
    .line 1263
    .line 1264
    move-result v2

    .line 1265
    move v14, v2

    .line 1266
    goto :goto_f

    .line 1267
    :pswitch_3a
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1268
    .line 1269
    .line 1270
    move-result v2

    .line 1271
    move v13, v2

    .line 1272
    goto :goto_f

    .line 1273
    :pswitch_3b
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1274
    .line 1275
    .line 1276
    move-result v2

    .line 1277
    move v12, v2

    .line 1278
    goto :goto_f

    .line 1279
    :cond_39
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1280
    .line 1281
    .line 1282
    new-instance v11, Lcom/google/android/gms/common/internal/t;

    .line 1283
    .line 1284
    invoke-direct/range {v11 .. v22}, Lcom/google/android/gms/common/internal/t;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1285
    .line 1286
    .line 1287
    return-object v11

    .line 1288
    :pswitch_3c
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1289
    .line 1290
    .line 1291
    move-result v1

    .line 1292
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1293
    .line 1294
    .line 1295
    move-result v2

    .line 1296
    if-ge v2, v1, :cond_3c

    .line 1297
    .line 1298
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1299
    .line 1300
    .line 1301
    move-result v2

    .line 1302
    int-to-char v3, v2

    .line 1303
    if-eq v3, v7, :cond_3b

    .line 1304
    .line 1305
    if-eq v3, v6, :cond_3a

    .line 1306
    .line 1307
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1308
    .line 1309
    .line 1310
    goto :goto_10

    .line 1311
    :cond_3a
    sget-object v3, Lcom/google/android/gms/common/internal/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1312
    .line 1313
    invoke-static {v0, v2, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v9

    .line 1317
    goto :goto_10

    .line 1318
    :cond_3b
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1319
    .line 1320
    .line 1321
    move-result v8

    .line 1322
    goto :goto_10

    .line 1323
    :cond_3c
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1324
    .line 1325
    .line 1326
    new-instance v0, Lcom/google/android/gms/common/internal/y;

    .line 1327
    .line 1328
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/common/internal/y;-><init>(ILjava/util/List;)V

    .line 1329
    .line 1330
    .line 1331
    return-object v0

    .line 1332
    :pswitch_3d
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1337
    .line 1338
    .line 1339
    move-result v2

    .line 1340
    if-ge v2, v1, :cond_3f

    .line 1341
    .line 1342
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1343
    .line 1344
    .line 1345
    move-result v2

    .line 1346
    int-to-char v3, v2

    .line 1347
    if-eq v3, v7, :cond_3e

    .line 1348
    .line 1349
    if-eq v3, v6, :cond_3d

    .line 1350
    .line 1351
    invoke-static {v2, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1352
    .line 1353
    .line 1354
    goto :goto_11

    .line 1355
    :cond_3d
    invoke-static {v2, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v9

    .line 1359
    goto :goto_11

    .line 1360
    :cond_3e
    invoke-static {v2, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1361
    .line 1362
    .line 1363
    move-result v8

    .line 1364
    goto :goto_11

    .line 1365
    :cond_3f
    invoke-static {v1, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v0, Lcom/google/android/gms/common/internal/g;

    .line 1369
    .line 1370
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/common/internal/g;-><init>(ILjava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    return-object v0

    .line 1374
    :pswitch_3e
    new-instance v1, Lc6/f;

    .line 1375
    .line 1376
    invoke-direct {v1, v0}, Lc6/f;-><init>(Landroid/os/Parcel;)V

    .line 1377
    .line 1378
    .line 1379
    return-object v1

    .line 1380
    :pswitch_3f
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v3

    .line 1384
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 1385
    .line 1386
    .line 1387
    move-result-wide v5

    .line 1388
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1389
    .line 1390
    .line 1391
    move-result v7

    .line 1392
    new-instance v2, Lc6/d;

    .line 1393
    .line 1394
    invoke-direct/range {v2 .. v7}, Lc6/d;-><init>(JJI)V

    .line 1395
    .line 1396
    .line 1397
    return-object v2

    .line 1398
    :pswitch_40
    new-instance v1, Ljava/util/ArrayList;

    .line 1399
    .line 1400
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1401
    .line 1402
    .line 1403
    const-class v2, Lc6/d;

    .line 1404
    .line 1405
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    invoke-virtual {v0, v1, v2}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 1410
    .line 1411
    .line 1412
    new-instance v0, Lc6/e;

    .line 1413
    .line 1414
    invoke-direct {v0, v1}, Lc6/e;-><init>(Ljava/util/ArrayList;)V

    .line 1415
    .line 1416
    .line 1417
    return-object v0

    .line 1418
    :pswitch_41
    new-instance v1, Lc6/c;

    .line 1419
    .line 1420
    invoke-direct {v1, v0}, Lc6/c;-><init>(Landroid/os/Parcel;)V

    .line 1421
    .line 1422
    .line 1423
    return-object v1

    .line 1424
    :pswitch_42
    new-instance v1, Lc6/b;

    .line 1425
    .line 1426
    invoke-direct {v1, v0}, Lc6/b;-><init>(Landroid/os/Parcel;)V

    .line 1427
    .line 1428
    .line 1429
    return-object v1

    .line 1430
    nop

    .line 1431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_27
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_5
    .end packed-switch

    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_18
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc6/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lcom/google/android/gms/common/data/DataHolder;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Le6/a;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Ld7/u;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Ld7/t;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Ld7/s;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Ld7/d;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Ld7/b;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Ld6/j;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Ld6/i;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Ld6/f;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Ld6/e;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Ld6/a;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Ld/d;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lcom/google/android/material/datepicker/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/material/datepicker/d;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lcom/google/android/material/datepicker/b;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lcom/google/android/gms/common/internal/k;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lcom/google/android/gms/common/internal/j;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lcom/google/android/gms/common/internal/T;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lcom/google/android/gms/common/internal/x;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lcom/google/android/gms/common/internal/F;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lcom/google/android/gms/common/internal/E;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lcom/google/android/gms/common/internal/t;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lcom/google/android/gms/common/internal/y;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lcom/google/android/gms/common/internal/g;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lc6/f;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Lc6/d;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lc6/e;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lc6/c;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lc6/b;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
