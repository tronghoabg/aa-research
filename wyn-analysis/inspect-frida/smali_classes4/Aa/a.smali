.class public final LAa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Landroid/graphics/Bitmap;

.field public volatile b:Ljava/nio/ByteBuffer;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    iput-object p1, p0, LAa/a;->a:Landroid/graphics/Bitmap;

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, LAa/a;->c:I

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, LAa/a;->d:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, LAa/a;->e:I

    const/4 p1, -0x1

    iput p1, p0, LAa/a;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;IIII)V
    .locals 4

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x32315659

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p5, v0, :cond_0

    const/16 v0, 0x11

    if-ne p5, v0, :cond_1

    move p5, v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 6
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    iput-object p1, p0, LAa/a;->b:Ljava/nio/ByteBuffer;

    .line 7
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    mul-int v3, p2, p3

    if-le v0, v3, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    const-string v3, "Image dimension, ByteBuffer size and format don\'t match. Please check if the ByteBuffer is in the decalred format."

    .line 8
    invoke-static {v3, v0}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 9
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iput p2, p0, LAa/a;->c:I

    iput p3, p0, LAa/a;->d:I

    if-eqz p4, :cond_3

    const/16 p1, 0x5a

    if-eq p4, p1, :cond_3

    const/16 p1, 0xb4

    if-eq p4, p1, :cond_3

    const/16 p1, 0x10e

    if-ne p4, p1, :cond_4

    :cond_3
    move v1, v2

    .line 10
    :cond_4
    const-string p1, "Invalid rotation. Only 0, 90, 180, 270 are supported currently."

    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 11
    iput p4, p0, LAa/a;->e:I

    iput p5, p0, LAa/a;->f:I

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;)LAa/a;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const-string v0, "Please provide a valid Context"

    .line 6
    .line 7
    move-object/from16 v4, p0

    .line 8
    .line 9
    invoke-static {v4, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "Please provide a valid imageUri"

    .line 13
    .line 14
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v7

    .line 21
    sget-object v0, LBa/a;->b:LBa/a;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v5, "MLKitImageUtils"

    .line 31
    .line 32
    sget-object v6, LBa/a;->a:Lcom/google/android/gms/common/internal/n;

    .line 33
    .line 34
    const-class v9, Ljava/lang/Throwable;

    .line 35
    .line 36
    :try_start_0
    invoke-static {v4, v1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    if-eqz v10, :cond_5

    .line 41
    .line 42
    const-string v0, "content"

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v11, 0x0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const-string v0, "file"

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {v4, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 72
    .line 73
    .line 74
    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    :try_start_2
    new-instance v0, LB1/h;

    .line 78
    .line 79
    invoke-direct {v0, v4}, LB1/h;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    move-object v2, v0

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object v12, v0

    .line 86
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    :try_start_4
    const-string v4, "addSuppressed"

    .line 92
    .line 93
    new-array v13, v2, [Ljava/lang/Class;

    .line 94
    .line 95
    aput-object v9, v13, v3

    .line 96
    .line 97
    invoke-virtual {v9, v4, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    new-array v2, v2, [Ljava/lang/Object;

    .line 102
    .line 103
    aput-object v0, v2, v3

    .line 104
    .line 105
    invoke-virtual {v4, v12, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 106
    .line 107
    .line 108
    :catch_1
    :goto_0
    :try_start_5
    throw v12
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 109
    :catch_2
    move-exception v0

    .line 110
    goto :goto_2

    .line 111
    :cond_1
    move-object v2, v11

    .line 112
    :goto_1
    if-eqz v4, :cond_2

    .line 113
    .line 114
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :catch_3
    move-exception v0

    .line 119
    goto :goto_3

    .line 120
    :goto_2
    move-object v2, v11

    .line 121
    :goto_3
    :try_start_7
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    const-string v9, "failed to open file to read rotation meta data: "

    .line 126
    .line 127
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v6, v0, v5, v4}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    :goto_4
    if-nez v2, :cond_3

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_3
    invoke-virtual {v2}, LB1/h;->e()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    :goto_5
    new-instance v0, Landroid/graphics/Matrix;

    .line 142
    .line 143
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    const/high16 v2, 0x42b40000    # 90.0f

    .line 155
    .line 156
    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 157
    .line 158
    const/high16 v9, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/high16 v12, -0x40800000    # -1.0f

    .line 161
    .line 162
    packed-switch v3, :pswitch_data_0

    .line 163
    .line 164
    .line 165
    :goto_6
    move-object v15, v11

    .line 166
    goto :goto_8

    .line 167
    :pswitch_0
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 168
    .line 169
    .line 170
    goto :goto_7

    .line 171
    :pswitch_1
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v12, v9}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 175
    .line 176
    .line 177
    goto :goto_7

    .line 178
    :pswitch_2
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :pswitch_3
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v12, v9}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :pswitch_4
    invoke-virtual {v0, v9, v12}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 190
    .line 191
    .line 192
    goto :goto_7

    .line 193
    :pswitch_5
    const/high16 v2, 0x43340000    # 180.0f

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 196
    .line 197
    .line 198
    :goto_7
    move-object v15, v0

    .line 199
    goto :goto_8

    .line 200
    :pswitch_6
    new-instance v11, Landroid/graphics/Matrix;

    .line 201
    .line 202
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11, v12, v9}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :goto_8
    if-eqz v15, :cond_4

    .line 210
    .line 211
    const/4 v11, 0x0

    .line 212
    const/4 v12, 0x0

    .line 213
    const/16 v16, 0x1

    .line 214
    .line 215
    invoke-static/range {v10 .. v16}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-eq v10, v0, :cond_4

    .line 220
    .line 221
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_0

    .line 222
    .line 223
    .line 224
    move-object v10, v0

    .line 225
    :cond_4
    new-instance v0, LAa/a;

    .line 226
    .line 227
    invoke-direct {v0, v10}, LAa/a;-><init>(Landroid/graphics/Bitmap;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    move-object v1, v10

    .line 235
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    const-string v1, "vision-common"

    .line 244
    .line 245
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzms;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    const/4 v5, -0x1

    .line 250
    const/4 v6, 0x4

    .line 251
    const/4 v12, 0x0

    .line 252
    invoke-static/range {v4 .. v12}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmu;->zza(Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;IIJIIII)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :cond_5
    :try_start_8
    new-instance v0, Ljava/io/IOException;

    .line 257
    .line 258
    const-string v2, "The image Uri could not be resolved."

    .line 259
    .line 260
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_0

    .line 264
    :goto_9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-string v2, "Could not open file: "

    .line 269
    .line 270
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v6, v0, v5, v1}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    throw v0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
