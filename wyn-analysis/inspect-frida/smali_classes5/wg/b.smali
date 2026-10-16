.class public abstract synthetic Lwg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/location/LocationManager;

    .line 8
    .line 9
    const-string v0, "gps"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "network"

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public static b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LN/o;->o()V

    .line 5
    .line 6
    .line 7
    new-instance p0, LN/u0;

    .line 8
    .line 9
    invoke-direct {p0, p3}, LN/u0;-><init>(LN/o;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static d(ILV/d;LN/u0;LN/o;I)V
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p2, p3, p0}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, p4}, LN/o;->M(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static e(LN/o;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN/o;->p(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, LN/o;->p(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, LN/o;->p(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p4}, LN/o;->p(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static f(Luc/f;Lq/s1;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, Lyc/p;->d:Lyc/p;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getAvailableCameras"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lyc/n;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.create"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, Lyc/n;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.initialize"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, Lyc/n;

    .line 58
    .line 59
    const/16 v4, 0xc

    .line 60
    .line 61
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    new-instance v0, LVa/X7;

    .line 72
    .line 73
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.dispose"

    .line 74
    .line 75
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    new-instance v2, Lyc/n;

    .line 81
    .line 82
    const/16 v4, 0xd

    .line 83
    .line 84
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 92
    .line 93
    .line 94
    :goto_3
    new-instance v0, LVa/X7;

    .line 95
    .line 96
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.lockCaptureOrientation"

    .line 97
    .line 98
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    new-instance v2, Lyc/n;

    .line 104
    .line 105
    const/16 v4, 0xe

    .line 106
    .line 107
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 115
    .line 116
    .line 117
    :goto_4
    new-instance v0, LVa/X7;

    .line 118
    .line 119
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.unlockCaptureOrientation"

    .line 120
    .line 121
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    new-instance v2, Lyc/n;

    .line 127
    .line 128
    const/16 v4, 0xf

    .line 129
    .line 130
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 138
    .line 139
    .line 140
    :goto_5
    new-instance v0, LVa/X7;

    .line 141
    .line 142
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.takePicture"

    .line 143
    .line 144
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    new-instance v2, Lyc/n;

    .line 150
    .line 151
    const/16 v4, 0x10

    .line 152
    .line 153
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_6
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 161
    .line 162
    .line 163
    :goto_6
    new-instance v0, LVa/X7;

    .line 164
    .line 165
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.startVideoRecording"

    .line 166
    .line 167
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    new-instance v2, Lyc/n;

    .line 173
    .line 174
    const/16 v4, 0x11

    .line 175
    .line 176
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 180
    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_7
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 184
    .line 185
    .line 186
    :goto_7
    new-instance v0, LVa/X7;

    .line 187
    .line 188
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.stopVideoRecording"

    .line 189
    .line 190
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    new-instance v2, Lyc/n;

    .line 196
    .line 197
    const/16 v4, 0x12

    .line 198
    .line 199
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 203
    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_8
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 207
    .line 208
    .line 209
    :goto_8
    new-instance v0, LVa/X7;

    .line 210
    .line 211
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.pauseVideoRecording"

    .line 212
    .line 213
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    if-eqz p1, :cond_9

    .line 217
    .line 218
    new-instance v2, Lyc/n;

    .line 219
    .line 220
    const/16 v4, 0x13

    .line 221
    .line 222
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 226
    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_9
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 230
    .line 231
    .line 232
    :goto_9
    new-instance v0, LVa/X7;

    .line 233
    .line 234
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.resumeVideoRecording"

    .line 235
    .line 236
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    if-eqz p1, :cond_a

    .line 240
    .line 241
    new-instance v2, Lyc/n;

    .line 242
    .line 243
    const/16 v4, 0xb

    .line 244
    .line 245
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 249
    .line 250
    .line 251
    goto :goto_a

    .line 252
    :cond_a
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 253
    .line 254
    .line 255
    :goto_a
    new-instance v0, LVa/X7;

    .line 256
    .line 257
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.startImageStream"

    .line 258
    .line 259
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    if-eqz p1, :cond_b

    .line 263
    .line 264
    new-instance v2, Lyc/n;

    .line 265
    .line 266
    const/16 v4, 0x14

    .line 267
    .line 268
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 272
    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_b
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 276
    .line 277
    .line 278
    :goto_b
    new-instance v0, LVa/X7;

    .line 279
    .line 280
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.stopImageStream"

    .line 281
    .line 282
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    if-eqz p1, :cond_c

    .line 286
    .line 287
    new-instance v2, Lyc/n;

    .line 288
    .line 289
    const/16 v4, 0x15

    .line 290
    .line 291
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 295
    .line 296
    .line 297
    goto :goto_c

    .line 298
    :cond_c
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 299
    .line 300
    .line 301
    :goto_c
    new-instance v0, LVa/X7;

    .line 302
    .line 303
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setFlashMode"

    .line 304
    .line 305
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    if-eqz p1, :cond_d

    .line 309
    .line 310
    new-instance v2, Lyc/n;

    .line 311
    .line 312
    const/16 v4, 0x16

    .line 313
    .line 314
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 318
    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_d
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 322
    .line 323
    .line 324
    :goto_d
    new-instance v0, LVa/X7;

    .line 325
    .line 326
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setExposureMode"

    .line 327
    .line 328
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    if-eqz p1, :cond_e

    .line 332
    .line 333
    new-instance v2, Lyc/n;

    .line 334
    .line 335
    const/16 v4, 0x17

    .line 336
    .line 337
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 341
    .line 342
    .line 343
    goto :goto_e

    .line 344
    :cond_e
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 345
    .line 346
    .line 347
    :goto_e
    new-instance v0, LVa/X7;

    .line 348
    .line 349
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 350
    .line 351
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setExposurePoint"

    .line 352
    .line 353
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    if-eqz p1, :cond_f

    .line 357
    .line 358
    new-instance v2, Lyc/n;

    .line 359
    .line 360
    const/16 v4, 0x18

    .line 361
    .line 362
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 366
    .line 367
    .line 368
    goto :goto_f

    .line 369
    :cond_f
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 370
    .line 371
    .line 372
    :goto_f
    new-instance v0, LVa/X7;

    .line 373
    .line 374
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 375
    .line 376
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getMinExposureOffset"

    .line 377
    .line 378
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    if-eqz p1, :cond_10

    .line 382
    .line 383
    new-instance v2, Lyc/n;

    .line 384
    .line 385
    const/16 v4, 0x19

    .line 386
    .line 387
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 391
    .line 392
    .line 393
    goto :goto_10

    .line 394
    :cond_10
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 395
    .line 396
    .line 397
    :goto_10
    new-instance v0, LVa/X7;

    .line 398
    .line 399
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 400
    .line 401
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getMaxExposureOffset"

    .line 402
    .line 403
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    if-eqz p1, :cond_11

    .line 407
    .line 408
    new-instance v2, Lyc/n;

    .line 409
    .line 410
    const/16 v4, 0x1a

    .line 411
    .line 412
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 416
    .line 417
    .line 418
    goto :goto_11

    .line 419
    :cond_11
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 420
    .line 421
    .line 422
    :goto_11
    new-instance v0, LVa/X7;

    .line 423
    .line 424
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 425
    .line 426
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getExposureOffsetStepSize"

    .line 427
    .line 428
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    if-eqz p1, :cond_12

    .line 432
    .line 433
    new-instance v2, Lyc/n;

    .line 434
    .line 435
    const/16 v4, 0x1b

    .line 436
    .line 437
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 441
    .line 442
    .line 443
    goto :goto_12

    .line 444
    :cond_12
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 445
    .line 446
    .line 447
    :goto_12
    new-instance v0, LVa/X7;

    .line 448
    .line 449
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 450
    .line 451
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setExposureOffset"

    .line 452
    .line 453
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    if-eqz p1, :cond_13

    .line 457
    .line 458
    new-instance v2, Lyc/n;

    .line 459
    .line 460
    const/4 v4, 0x1

    .line 461
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 465
    .line 466
    .line 467
    goto :goto_13

    .line 468
    :cond_13
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 469
    .line 470
    .line 471
    :goto_13
    new-instance v0, LVa/X7;

    .line 472
    .line 473
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 474
    .line 475
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setFocusMode"

    .line 476
    .line 477
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    if-eqz p1, :cond_14

    .line 481
    .line 482
    new-instance v2, Lyc/n;

    .line 483
    .line 484
    const/4 v4, 0x3

    .line 485
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 489
    .line 490
    .line 491
    goto :goto_14

    .line 492
    :cond_14
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 493
    .line 494
    .line 495
    :goto_14
    new-instance v0, LVa/X7;

    .line 496
    .line 497
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 498
    .line 499
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setFocusPoint"

    .line 500
    .line 501
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    if-eqz p1, :cond_15

    .line 505
    .line 506
    new-instance v2, Lyc/n;

    .line 507
    .line 508
    const/4 v4, 0x4

    .line 509
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 513
    .line 514
    .line 515
    goto :goto_15

    .line 516
    :cond_15
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 517
    .line 518
    .line 519
    :goto_15
    new-instance v0, LVa/X7;

    .line 520
    .line 521
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 522
    .line 523
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getMaxZoomLevel"

    .line 524
    .line 525
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    if-eqz p1, :cond_16

    .line 529
    .line 530
    new-instance v2, Lyc/n;

    .line 531
    .line 532
    const/4 v4, 0x5

    .line 533
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 537
    .line 538
    .line 539
    goto :goto_16

    .line 540
    :cond_16
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 541
    .line 542
    .line 543
    :goto_16
    new-instance v0, LVa/X7;

    .line 544
    .line 545
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 546
    .line 547
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.getMinZoomLevel"

    .line 548
    .line 549
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    if-eqz p1, :cond_17

    .line 553
    .line 554
    new-instance v2, Lyc/n;

    .line 555
    .line 556
    const/4 v4, 0x6

    .line 557
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 561
    .line 562
    .line 563
    goto :goto_17

    .line 564
    :cond_17
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 565
    .line 566
    .line 567
    :goto_17
    new-instance v0, LVa/X7;

    .line 568
    .line 569
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 570
    .line 571
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setZoomLevel"

    .line 572
    .line 573
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    if-eqz p1, :cond_18

    .line 577
    .line 578
    new-instance v2, Lyc/n;

    .line 579
    .line 580
    const/4 v4, 0x7

    .line 581
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 585
    .line 586
    .line 587
    goto :goto_18

    .line 588
    :cond_18
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 589
    .line 590
    .line 591
    :goto_18
    new-instance v0, LVa/X7;

    .line 592
    .line 593
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 594
    .line 595
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.pausePreview"

    .line 596
    .line 597
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    if-eqz p1, :cond_19

    .line 601
    .line 602
    new-instance v2, Lyc/n;

    .line 603
    .line 604
    const/16 v4, 0x8

    .line 605
    .line 606
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 610
    .line 611
    .line 612
    goto :goto_19

    .line 613
    :cond_19
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 614
    .line 615
    .line 616
    :goto_19
    new-instance v0, LVa/X7;

    .line 617
    .line 618
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 619
    .line 620
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.resumePreview"

    .line 621
    .line 622
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    if-eqz p1, :cond_1a

    .line 626
    .line 627
    new-instance v2, Lyc/n;

    .line 628
    .line 629
    const/16 v4, 0x9

    .line 630
    .line 631
    invoke-direct {v2, p1, v4}, Lyc/n;-><init>(Lq/s1;I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 635
    .line 636
    .line 637
    goto :goto_1a

    .line 638
    :cond_1a
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 639
    .line 640
    .line 641
    :goto_1a
    new-instance v0, LVa/X7;

    .line 642
    .line 643
    sget-object v2, Lyc/p;->d:Lyc/p;

    .line 644
    .line 645
    const-string v2, "dev.flutter.pigeon.camera_android.CameraApi.setDescriptionWhileRecording"

    .line 646
    .line 647
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    if-eqz p1, :cond_1b

    .line 651
    .line 652
    new-instance p0, Lyc/n;

    .line 653
    .line 654
    const/16 v1, 0xa

    .line 655
    .line 656
    invoke-direct {p0, p1, v1}, Lyc/n;-><init>(Lq/s1;I)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 660
    .line 661
    .line 662
    return-void

    .line 663
    :cond_1b
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 664
    .line 665
    .line 666
    return-void
.end method
