.class public final Lyc/h;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# instance fields
.field public final a:Lyc/g;

.field public b:I

.field public final c:LS3/s;

.field public final d:Lb7/k;

.field public final e:Landroid/hardware/camera2/CaptureResult$Key;

.field public final f:Landroid/hardware/camera2/CaptureResult$Key;


# direct methods
.method public constructor <init>(Lyc/g;LS3/s;Lb7/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 5
    .line 6
    iput-object v0, p0, Lyc/h;->e:Landroid/hardware/camera2/CaptureResult$Key;

    .line 7
    .line 8
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 9
    .line 10
    iput-object v0, p0, Lyc/h;->f:Landroid/hardware/camera2/CaptureResult$Key;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput v0, p0, Lyc/h;->b:I

    .line 14
    .line 15
    iput-object p1, p0, Lyc/h;->a:Lyc/g;

    .line 16
    .line 17
    iput-object p2, p0, Lyc/h;->c:LS3/s;

    .line 18
    .line 19
    iput-object p3, p0, Lyc/h;->d:Lb7/k;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureResult;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lyc/h;->e:Landroid/hardware/camera2/CaptureResult$Key;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v1, p0, Lyc/h;->f:Landroid/hardware/camera2/CaptureResult$Key;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Integer;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-object v2, Landroid/hardware/camera2/CaptureResult;->LENS_APERTURE:Landroid/hardware/camera2/CaptureResult$Key;

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Float;

    .line 28
    .line 29
    sget-object v3, Landroid/hardware/camera2/CaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    .line 30
    .line 31
    invoke-virtual {p1, v3}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Long;

    .line 36
    .line 37
    sget-object v4, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    .line 38
    .line 39
    invoke-virtual {p1, v4}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    iget-object v4, p0, Lyc/h;->d:Lb7/k;

    .line 46
    .line 47
    iput-object v2, v4, Lb7/k;->b:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v3, v4, Lb7/k;->c:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object p1, v4, Lb7/k;->d:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_0
    iget p1, p0, Lyc/h;->b:I

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    const-string v3, "CameraCaptureCallback"

    .line 57
    .line 58
    if-eq p1, v2, :cond_6

    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v4, "CameraCaptureCallback | state: "

    .line 63
    .line 64
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget v4, p0, Lyc/h;->b:I

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    if-eq v4, v5, :cond_5

    .line 71
    .line 72
    const/4 v5, 0x2

    .line 73
    if-eq v4, v5, :cond_4

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    if-eq v4, v5, :cond_3

    .line 77
    .line 78
    const/4 v5, 0x4

    .line 79
    if-eq v4, v5, :cond_2

    .line 80
    .line 81
    const/4 v5, 0x5

    .line 82
    if-eq v4, v5, :cond_1

    .line 83
    .line 84
    const-string v4, "null"

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const-string v4, "STATE_CAPTURING"

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    const-string v4, "STATE_WAITING_PRECAPTURE_DONE"

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    const-string v4, "STATE_WAITING_PRECAPTURE_START"

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    const-string v4, "STATE_WAITING_FOCUS"

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const-string v4, "STATE_PREVIEW"

    .line 100
    .line 101
    :goto_0
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, " | afState: "

    .line 105
    .line 106
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v4, " | aeState: "

    .line 113
    .line 114
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    :cond_6
    iget p1, p0, Lyc/h;->b:I

    .line 128
    .line 129
    invoke-static {p1}, LA/f;->f(I)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 v4, 0x4

    .line 134
    iget-object v5, p0, Lyc/h;->a:Lyc/g;

    .line 135
    .line 136
    const/4 v6, 0x2

    .line 137
    iget-object v7, p0, Lyc/h;->c:LS3/s;

    .line 138
    .line 139
    const/4 v8, 0x5

    .line 140
    if-eq p1, v2, :cond_d

    .line 141
    .line 142
    if-eq p1, v6, :cond_a

    .line 143
    .line 144
    const/4 v1, 0x3

    .line 145
    if-eq p1, v1, :cond_7

    .line 146
    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_7
    if-eqz v0, :cond_9

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eq p1, v8, :cond_8

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_8
    iget-object p1, v7, LS3/s;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, LJ5/n;

    .line 161
    .line 162
    invoke-virtual {p1}, LJ5/n;->b()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_12

    .line 167
    .line 168
    const-string p1, "Metering timeout waiting for pre-capture to finish, moving on with capture"

    .line 169
    .line 170
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Lyc/g;->e()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_9
    :goto_1
    invoke-virtual {v5}, Lyc/g;->e()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_a
    if-eqz v0, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-eq p1, v6, :cond_c

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-eq p1, v8, :cond_c

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-ne p1, v4, :cond_b

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_b
    iget-object p1, v7, LS3/s;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, LJ5/n;

    .line 205
    .line 206
    invoke-virtual {p1}, LJ5/n;->b()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_12

    .line 211
    .line 212
    const-string p1, "Metering timeout waiting for pre-capture to start, moving on with capture"

    .line 213
    .line 214
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    iput v4, p0, Lyc/h;->b:I

    .line 218
    .line 219
    return-void

    .line 220
    :cond_c
    :goto_2
    iput v4, p0, Lyc/h;->b:I

    .line 221
    .line 222
    return-void

    .line 223
    :cond_d
    if-nez v1, :cond_e

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    if-eq p1, v4, :cond_13

    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-ne p1, v8, :cond_f

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_f
    iget-object p1, v7, LS3/s;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, LJ5/n;

    .line 242
    .line 243
    invoke-virtual {p1}, LJ5/n;->b()Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_12

    .line 248
    .line 249
    const-string p1, "Focus timeout, moving on with capture"

    .line 250
    .line 251
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    if-eqz v0, :cond_11

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-ne p1, v6, :cond_10

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_10
    invoke-virtual {v5}, Lyc/g;->i()V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_11
    :goto_3
    invoke-virtual {v5}, Lyc/g;->e()V

    .line 268
    .line 269
    .line 270
    :cond_12
    :goto_4
    return-void

    .line 271
    :cond_13
    :goto_5
    if-eqz v0, :cond_15

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-ne p1, v6, :cond_14

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_14
    invoke-virtual {v5}, Lyc/g;->i()V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_15
    :goto_6
    invoke-virtual {v5}, Lyc/g;->e()V

    .line 285
    .line 286
    .line 287
    return-void
.end method

.method public final onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lyc/h;->a(Landroid/hardware/camera2/CaptureResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lyc/h;->a(Landroid/hardware/camera2/CaptureResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
