.class public final Lq2/f;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public b:Landroid/os/Handler;

.field public c:Ljava/lang/Error;

.field public d:Ljava/lang/RuntimeException;

.field public e:Ljava/lang/Object;

.field public f:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq2/f;->a:I

    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final a(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lq2/f;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    const-string v0, "PlaceholderSurface"

    .line 19
    .line 20
    const-string v2, "Failed to release placeholder surface"

    .line 21
    .line 22
    invoke-static {v0, v2, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    :try_start_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lq2/f;->b(I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch LQ1/e; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 37
    .line 38
    .line 39
    monitor-enter p0

    .line 40
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 41
    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return v1

    .line 45
    :catchall_2
    move-exception p1

    .line 46
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 47
    throw p1

    .line 48
    :catchall_3
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_0

    .line 52
    :catch_1
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :catch_2
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :goto_0
    :try_start_4
    const-string v0, "PlaceholderSurface"

    .line 57
    .line 58
    const-string v2, "Failed to initialize placeholder surface"

    .line 59
    .line 60
    invoke-static {v0, v2, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lq2/f;->c:Ljava/lang/Error;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 64
    .line 65
    monitor-enter p0

    .line 66
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 67
    .line 68
    .line 69
    monitor-exit p0

    .line 70
    goto :goto_3

    .line 71
    :catchall_4
    move-exception p1

    .line 72
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 73
    throw p1

    .line 74
    :goto_1
    :try_start_6
    const-string v0, "PlaceholderSurface"

    .line 75
    .line 76
    const-string v2, "Failed to initialize placeholder surface"

    .line 77
    .line 78
    invoke-static {v0, v2, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lq2/f;->d:Ljava/lang/RuntimeException;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 87
    .line 88
    monitor-enter p0

    .line 89
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 90
    .line 91
    .line 92
    monitor-exit p0

    .line 93
    goto :goto_3

    .line 94
    :catchall_5
    move-exception p1

    .line 95
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 96
    throw p1

    .line 97
    :goto_2
    :try_start_8
    const-string v0, "PlaceholderSurface"

    .line 98
    .line 99
    const-string v2, "Failed to initialize placeholder surface"

    .line 100
    .line 101
    invoke-static {v0, v2, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lq2/f;->d:Ljava/lang/RuntimeException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 105
    .line 106
    monitor-enter p0

    .line 107
    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 108
    .line 109
    .line 110
    monitor-exit p0

    .line 111
    :goto_3
    return v1

    .line 112
    :catchall_6
    move-exception p1

    .line 113
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 114
    throw p1

    .line 115
    :goto_4
    monitor-enter p0

    .line 116
    :try_start_a
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 117
    .line 118
    .line 119
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 120
    throw p1

    .line 121
    :catchall_7
    move-exception p1

    .line 122
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 123
    throw p1
.end method


# virtual methods
.method public final b(I)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "eglMakeCurrent failed"

    .line 6
    .line 7
    const-string v3, "eglCreatePbufferSurface failed"

    .line 8
    .line 9
    const-string v8, "eglCreateContext failed"

    .line 10
    .line 11
    const/4 v11, 0x5

    .line 12
    const-string v14, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"

    .line 13
    .line 14
    const-string v15, "eglInitialize failed"

    .line 15
    .line 16
    const/16 v16, 0x6

    .line 17
    .line 18
    const-string v4, "eglGetDisplay failed"

    .line 19
    .line 20
    const/16 v17, 0x3057

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    const/16 v18, 0x3056

    .line 24
    .line 25
    const/4 v7, 0x2

    .line 26
    const/16 v19, 0x3098

    .line 27
    .line 28
    const/4 v9, 0x1

    .line 29
    const/16 v20, 0x3038

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    const/16 v21, 0x32c0

    .line 33
    .line 34
    iget v12, v0, Lq2/f;->a:I

    .line 35
    .line 36
    packed-switch v12, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    iget-object v12, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v12, Lu6/c;

    .line 42
    .line 43
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v12, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v12, Lu6/c;

    .line 49
    .line 50
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const/16 v30, 0x4

    .line 54
    .line 55
    invoke-static {v10}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    if-eqz v13, :cond_0

    .line 60
    .line 61
    move v5, v9

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v5, v10

    .line 64
    :goto_0
    invoke-static {v4, v5}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    new-array v4, v7, [I

    .line 68
    .line 69
    invoke-static {v13, v4, v10, v4, v9}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-static {v15, v4}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    iput-object v13, v12, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 77
    .line 78
    new-array v4, v9, [Landroid/opengl/EGLConfig;

    .line 79
    .line 80
    new-array v5, v9, [I

    .line 81
    .line 82
    sget-object v23, Lu6/c;->g:[I

    .line 83
    .line 84
    const/16 v24, 0x0

    .line 85
    .line 86
    const/16 v26, 0x0

    .line 87
    .line 88
    const/16 v27, 0x1

    .line 89
    .line 90
    const/16 v29, 0x0

    .line 91
    .line 92
    move-object/from16 v25, v4

    .line 93
    .line 94
    move-object/from16 v28, v5

    .line 95
    .line 96
    move-object/from16 v22, v13

    .line 97
    .line 98
    invoke-static/range {v22 .. v29}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    aget v5, v28, v10

    .line 105
    .line 106
    if-lez v5, :cond_1

    .line 107
    .line 108
    aget-object v5, v25, v10

    .line 109
    .line 110
    if-eqz v5, :cond_1

    .line 111
    .line 112
    move v5, v9

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move v5, v10

    .line 115
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    aget v13, v28, v10

    .line 120
    .line 121
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    aget-object v15, v25, v10

    .line 126
    .line 127
    move/from16 v22, v7

    .line 128
    .line 129
    new-array v7, v6, [Ljava/lang/Object;

    .line 130
    .line 131
    aput-object v4, v7, v10

    .line 132
    .line 133
    aput-object v13, v7, v9

    .line 134
    .line 135
    aput-object v15, v7, v22

    .line 136
    .line 137
    sget v4, Lu6/v;->a:I

    .line 138
    .line 139
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 140
    .line 141
    invoke-static {v4, v14, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-static {v4, v5}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    aget-object v4, v25, v10

    .line 149
    .line 150
    iget-object v5, v12, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 151
    .line 152
    if-nez v1, :cond_2

    .line 153
    .line 154
    new-array v7, v6, [I

    .line 155
    .line 156
    aput v19, v7, v10

    .line 157
    .line 158
    aput v22, v7, v9

    .line 159
    .line 160
    aput v20, v7, v22

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_2
    new-array v7, v11, [I

    .line 164
    .line 165
    aput v19, v7, v10

    .line 166
    .line 167
    aput v22, v7, v9

    .line 168
    .line 169
    aput v21, v7, v22

    .line 170
    .line 171
    aput v9, v7, v6

    .line 172
    .line 173
    aput v20, v7, v30

    .line 174
    .line 175
    :goto_2
    sget-object v13, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 176
    .line 177
    invoke-static {v5, v4, v13, v7, v10}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_3

    .line 182
    .line 183
    move v7, v9

    .line 184
    goto :goto_3

    .line 185
    :cond_3
    move v7, v10

    .line 186
    :goto_3
    invoke-static {v8, v7}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    iput-object v5, v12, Lu6/c;->d:Landroid/opengl/EGLContext;

    .line 190
    .line 191
    iget-object v7, v12, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 192
    .line 193
    if-ne v1, v9, :cond_4

    .line 194
    .line 195
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_4
    move/from16 v8, v22

    .line 199
    .line 200
    if-ne v1, v8, :cond_5

    .line 201
    .line 202
    const/4 v13, 0x7

    .line 203
    new-array v13, v13, [I

    .line 204
    .line 205
    aput v17, v13, v10

    .line 206
    .line 207
    aput v9, v13, v9

    .line 208
    .line 209
    aput v18, v13, v8

    .line 210
    .line 211
    aput v9, v13, v6

    .line 212
    .line 213
    aput v21, v13, v30

    .line 214
    .line 215
    aput v9, v13, v11

    .line 216
    .line 217
    aput v20, v13, v16

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_5
    new-array v13, v11, [I

    .line 221
    .line 222
    aput v17, v13, v10

    .line 223
    .line 224
    aput v9, v13, v9

    .line 225
    .line 226
    aput v18, v13, v8

    .line 227
    .line 228
    aput v9, v13, v6

    .line 229
    .line 230
    aput v20, v13, v30

    .line 231
    .line 232
    :goto_4
    invoke-static {v7, v4, v13, v10}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    if-eqz v4, :cond_6

    .line 237
    .line 238
    move v6, v9

    .line 239
    goto :goto_5

    .line 240
    :cond_6
    move v6, v10

    .line 241
    :goto_5
    invoke-static {v3, v6}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    move-object v3, v4

    .line 245
    :goto_6
    invoke-static {v7, v3, v3, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    invoke-static {v2, v4}, Lu6/a;->g(Ljava/lang/String;Z)V

    .line 250
    .line 251
    .line 252
    iput-object v3, v12, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 253
    .line 254
    iget-object v2, v12, Lu6/c;->b:[I

    .line 255
    .line 256
    invoke-static {v9, v2, v10}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 257
    .line 258
    .line 259
    invoke-static {}, Lu6/a;->f()V

    .line 260
    .line 261
    .line 262
    new-instance v3, Landroid/graphics/SurfaceTexture;

    .line 263
    .line 264
    aget v2, v2, v10

    .line 265
    .line 266
    invoke-direct {v3, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 267
    .line 268
    .line 269
    iput-object v3, v12, Lu6/c;->f:Landroid/graphics/SurfaceTexture;

    .line 270
    .line 271
    invoke-virtual {v3, v12}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 272
    .line 273
    .line 274
    new-instance v2, Lv6/g;

    .line 275
    .line 276
    iget-object v3, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v3, Lu6/c;

    .line 279
    .line 280
    iget-object v3, v3, Lu6/c;->f:Landroid/graphics/SurfaceTexture;

    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    if-eqz v1, :cond_7

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_7
    move v9, v10

    .line 289
    :goto_7
    invoke-direct {v2, v0, v3, v9}, Lv6/g;-><init>(Lq2/f;Landroid/graphics/SurfaceTexture;Z)V

    .line 290
    .line 291
    .line 292
    iput-object v2, v0, Lq2/f;->f:Landroid/view/Surface;

    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_0
    const/16 v30, 0x4

    .line 296
    .line 297
    iget-object v5, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v5, LQ1/d;

    .line 300
    .line 301
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v5, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v5, LQ1/d;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {v10}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    if-eqz v7, :cond_8

    .line 316
    .line 317
    move v12, v9

    .line 318
    goto :goto_8

    .line 319
    :cond_8
    move v12, v10

    .line 320
    :goto_8
    invoke-static {v4, v12}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 321
    .line 322
    .line 323
    const/4 v4, 0x2

    .line 324
    new-array v12, v4, [I

    .line 325
    .line 326
    invoke-static {v7, v12, v10, v12, v9}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    invoke-static {v15, v4}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 331
    .line 332
    .line 333
    iput-object v7, v5, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 334
    .line 335
    new-array v4, v9, [Landroid/opengl/EGLConfig;

    .line 336
    .line 337
    new-array v12, v9, [I

    .line 338
    .line 339
    sget-object v32, LQ1/d;->g:[I

    .line 340
    .line 341
    const/16 v33, 0x0

    .line 342
    .line 343
    const/16 v35, 0x0

    .line 344
    .line 345
    const/16 v36, 0x1

    .line 346
    .line 347
    const/16 v38, 0x0

    .line 348
    .line 349
    move-object/from16 v34, v4

    .line 350
    .line 351
    move-object/from16 v31, v7

    .line 352
    .line 353
    move-object/from16 v37, v12

    .line 354
    .line 355
    invoke-static/range {v31 .. v38}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-eqz v4, :cond_9

    .line 360
    .line 361
    aget v7, v37, v10

    .line 362
    .line 363
    if-lez v7, :cond_9

    .line 364
    .line 365
    aget-object v7, v34, v10

    .line 366
    .line 367
    if-eqz v7, :cond_9

    .line 368
    .line 369
    move v7, v9

    .line 370
    goto :goto_9

    .line 371
    :cond_9
    move v7, v10

    .line 372
    :goto_9
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    aget v12, v37, v10

    .line 377
    .line 378
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    aget-object v13, v34, v10

    .line 383
    .line 384
    new-array v15, v6, [Ljava/lang/Object;

    .line 385
    .line 386
    aput-object v4, v15, v10

    .line 387
    .line 388
    aput-object v12, v15, v9

    .line 389
    .line 390
    const/16 v22, 0x2

    .line 391
    .line 392
    aput-object v13, v15, v22

    .line 393
    .line 394
    sget v4, LQ1/x;->a:I

    .line 395
    .line 396
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 397
    .line 398
    invoke-static {v4, v14, v15}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-static {v4, v7}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 403
    .line 404
    .line 405
    aget-object v4, v34, v10

    .line 406
    .line 407
    iget-object v7, v5, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 408
    .line 409
    if-nez v1, :cond_a

    .line 410
    .line 411
    new-array v12, v6, [I

    .line 412
    .line 413
    aput v19, v12, v10

    .line 414
    .line 415
    const/16 v22, 0x2

    .line 416
    .line 417
    aput v22, v12, v9

    .line 418
    .line 419
    aput v20, v12, v22

    .line 420
    .line 421
    goto :goto_a

    .line 422
    :cond_a
    const/16 v22, 0x2

    .line 423
    .line 424
    new-array v12, v11, [I

    .line 425
    .line 426
    aput v19, v12, v10

    .line 427
    .line 428
    aput v22, v12, v9

    .line 429
    .line 430
    aput v21, v12, v22

    .line 431
    .line 432
    aput v9, v12, v6

    .line 433
    .line 434
    aput v20, v12, v30

    .line 435
    .line 436
    :goto_a
    sget-object v13, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 437
    .line 438
    invoke-static {v7, v4, v13, v12, v10}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    if-eqz v7, :cond_b

    .line 443
    .line 444
    move v12, v9

    .line 445
    goto :goto_b

    .line 446
    :cond_b
    move v12, v10

    .line 447
    :goto_b
    invoke-static {v8, v12}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 448
    .line 449
    .line 450
    iput-object v7, v5, LQ1/d;->d:Landroid/opengl/EGLContext;

    .line 451
    .line 452
    iget-object v8, v5, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 453
    .line 454
    if-ne v1, v9, :cond_c

    .line 455
    .line 456
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_c
    const/4 v12, 0x2

    .line 460
    if-ne v1, v12, :cond_d

    .line 461
    .line 462
    const/4 v13, 0x7

    .line 463
    new-array v13, v13, [I

    .line 464
    .line 465
    aput v17, v13, v10

    .line 466
    .line 467
    aput v9, v13, v9

    .line 468
    .line 469
    aput v18, v13, v12

    .line 470
    .line 471
    aput v9, v13, v6

    .line 472
    .line 473
    aput v21, v13, v30

    .line 474
    .line 475
    aput v9, v13, v11

    .line 476
    .line 477
    aput v20, v13, v16

    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_d
    new-array v13, v11, [I

    .line 481
    .line 482
    aput v17, v13, v10

    .line 483
    .line 484
    aput v9, v13, v9

    .line 485
    .line 486
    aput v18, v13, v12

    .line 487
    .line 488
    aput v9, v13, v6

    .line 489
    .line 490
    aput v20, v13, v30

    .line 491
    .line 492
    :goto_c
    invoke-static {v8, v4, v13, v10}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    if-eqz v4, :cond_e

    .line 497
    .line 498
    move v6, v9

    .line 499
    goto :goto_d

    .line 500
    :cond_e
    move v6, v10

    .line 501
    :goto_d
    invoke-static {v3, v6}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 502
    .line 503
    .line 504
    move-object v3, v4

    .line 505
    :goto_e
    invoke-static {v8, v3, v3, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    invoke-static {v2, v4}, LQ1/k;->d(Ljava/lang/String;Z)V

    .line 510
    .line 511
    .line 512
    iput-object v3, v5, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 513
    .line 514
    iget-object v2, v5, LQ1/d;->b:[I

    .line 515
    .line 516
    invoke-static {v9, v2, v10}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 517
    .line 518
    .line 519
    new-instance v3, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 522
    .line 523
    .line 524
    move v4, v10

    .line 525
    :goto_f
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    if-eqz v6, :cond_11

    .line 530
    .line 531
    if-eqz v4, :cond_f

    .line 532
    .line 533
    const/16 v4, 0xa

    .line 534
    .line 535
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    :cond_f
    invoke-static {v6}, Landroid/opengl/GLU;->gluErrorString(I)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    if-nez v4, :cond_10

    .line 543
    .line 544
    new-instance v4, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v7, "error code: 0x"

    .line 547
    .line 548
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    :cond_10
    const-string v6, "glError: "

    .line 563
    .line 564
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    move v4, v9

    .line 571
    goto :goto_f

    .line 572
    :cond_11
    if-nez v4, :cond_13

    .line 573
    .line 574
    new-instance v3, Landroid/graphics/SurfaceTexture;

    .line 575
    .line 576
    aget v2, v2, v10

    .line 577
    .line 578
    invoke-direct {v3, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 579
    .line 580
    .line 581
    iput-object v3, v5, LQ1/d;->f:Landroid/graphics/SurfaceTexture;

    .line 582
    .line 583
    invoke-virtual {v3, v5}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 584
    .line 585
    .line 586
    new-instance v2, Lq2/g;

    .line 587
    .line 588
    iget-object v3, v0, Lq2/f;->e:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v3, LQ1/d;

    .line 591
    .line 592
    iget-object v3, v3, LQ1/d;->f:Landroid/graphics/SurfaceTexture;

    .line 593
    .line 594
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    if-eqz v1, :cond_12

    .line 598
    .line 599
    goto :goto_10

    .line 600
    :cond_12
    move v9, v10

    .line 601
    :goto_10
    invoke-direct {v2, v0, v3, v9}, Lq2/g;-><init>(Lq2/f;Landroid/graphics/SurfaceTexture;Z)V

    .line 602
    .line 603
    .line 604
    iput-object v2, v0, Lq2/f;->f:Landroid/view/Surface;

    .line 605
    .line 606
    return-void

    .line 607
    :cond_13
    new-instance v1, LQ1/e;

    .line 608
    .line 609
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    throw v1

    .line 617
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 7

    .line 1
    iget v0, p0, Lq2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/f;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu6/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lq2/f;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lu6/c;

    .line 16
    .line 17
    iget-object v1, v0, Lu6/c;->a:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x13

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :try_start_0
    iget-object v3, v0, Lu6/c;->f:Landroid/graphics/SurfaceTexture;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/graphics/SurfaceTexture;->release()V

    .line 30
    .line 31
    .line 32
    iget-object v3, v0, Lu6/c;->b:[I

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-static {v5, v3, v4}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    iget-object v3, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    iget-object v3, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 55
    .line 56
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 57
    .line 58
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 59
    .line 60
    invoke-static {v3, v4, v4, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v3, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 64
    .line 65
    if-eqz v3, :cond_2

    .line 66
    .line 67
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v3, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 76
    .line 77
    iget-object v4, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 78
    .line 79
    invoke-static {v3, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 80
    .line 81
    .line 82
    :cond_2
    iget-object v3, v0, Lu6/c;->d:Landroid/opengl/EGLContext;

    .line 83
    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    iget-object v4, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 87
    .line 88
    invoke-static {v4, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    sget v3, Lu6/v;->a:I

    .line 92
    .line 93
    if-lt v3, v1, :cond_4

    .line 94
    .line 95
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 96
    .line 97
    .line 98
    :cond_4
    iget-object v1, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 103
    .line 104
    invoke-virtual {v1, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_5

    .line 109
    .line 110
    iget-object v1, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 111
    .line 112
    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 113
    .line 114
    .line 115
    :cond_5
    iput-object v2, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 116
    .line 117
    iput-object v2, v0, Lu6/c;->d:Landroid/opengl/EGLContext;

    .line 118
    .line 119
    iput-object v2, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 120
    .line 121
    iput-object v2, v0, Lu6/c;->f:Landroid/graphics/SurfaceTexture;

    .line 122
    .line 123
    return-void

    .line 124
    :goto_1
    iget-object v4, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 125
    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 129
    .line 130
    invoke-virtual {v4, v5}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_6

    .line 135
    .line 136
    iget-object v4, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 137
    .line 138
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 139
    .line 140
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 141
    .line 142
    invoke-static {v4, v5, v5, v6}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 143
    .line 144
    .line 145
    :cond_6
    iget-object v4, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 146
    .line 147
    if-eqz v4, :cond_7

    .line 148
    .line 149
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_7

    .line 156
    .line 157
    iget-object v4, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 158
    .line 159
    iget-object v5, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 160
    .line 161
    invoke-static {v4, v5}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 162
    .line 163
    .line 164
    :cond_7
    iget-object v4, v0, Lu6/c;->d:Landroid/opengl/EGLContext;

    .line 165
    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    iget-object v5, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 169
    .line 170
    invoke-static {v5, v4}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 171
    .line 172
    .line 173
    :cond_8
    sget v4, Lu6/v;->a:I

    .line 174
    .line 175
    if-lt v4, v1, :cond_9

    .line 176
    .line 177
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 178
    .line 179
    .line 180
    :cond_9
    iget-object v1, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 181
    .line 182
    if-eqz v1, :cond_a

    .line 183
    .line 184
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 185
    .line 186
    invoke-virtual {v1, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_a

    .line 191
    .line 192
    iget-object v1, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 193
    .line 194
    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 195
    .line 196
    .line 197
    :cond_a
    iput-object v2, v0, Lu6/c;->c:Landroid/opengl/EGLDisplay;

    .line 198
    .line 199
    iput-object v2, v0, Lu6/c;->d:Landroid/opengl/EGLContext;

    .line 200
    .line 201
    iput-object v2, v0, Lu6/c;->e:Landroid/opengl/EGLSurface;

    .line 202
    .line 203
    iput-object v2, v0, Lu6/c;->f:Landroid/graphics/SurfaceTexture;

    .line 204
    .line 205
    throw v3

    .line 206
    :pswitch_0
    iget-object v0, p0, Lq2/f;->e:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, LQ1/d;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v0, p0, Lq2/f;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, LQ1/d;

    .line 216
    .line 217
    iget-object v1, v0, LQ1/d;->a:Landroid/os/Handler;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 220
    .line 221
    .line 222
    const/4 v1, 0x0

    .line 223
    :try_start_1
    iget-object v2, v0, LQ1/d;->f:Landroid/graphics/SurfaceTexture;

    .line 224
    .line 225
    if-eqz v2, :cond_b

    .line 226
    .line 227
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 228
    .line 229
    .line 230
    iget-object v2, v0, LQ1/d;->b:[I

    .line 231
    .line 232
    const/4 v3, 0x0

    .line 233
    const/4 v4, 0x1

    .line 234
    invoke-static {v4, v2, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :catchall_1
    move-exception v2

    .line 239
    goto :goto_3

    .line 240
    :cond_b
    :goto_2
    iget-object v2, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 241
    .line 242
    if-eqz v2, :cond_c

    .line 243
    .line 244
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 245
    .line 246
    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_c

    .line 251
    .line 252
    iget-object v2, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 253
    .line 254
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 255
    .line 256
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 257
    .line 258
    invoke-static {v2, v3, v3, v4}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 259
    .line 260
    .line 261
    :cond_c
    iget-object v2, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 262
    .line 263
    if-eqz v2, :cond_d

    .line 264
    .line 265
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_d

    .line 272
    .line 273
    iget-object v2, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 274
    .line 275
    iget-object v3, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 276
    .line 277
    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 278
    .line 279
    .line 280
    :cond_d
    iget-object v2, v0, LQ1/d;->d:Landroid/opengl/EGLContext;

    .line 281
    .line 282
    if-eqz v2, :cond_e

    .line 283
    .line 284
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 285
    .line 286
    invoke-static {v3, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 287
    .line 288
    .line 289
    :cond_e
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 290
    .line 291
    .line 292
    iget-object v2, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 293
    .line 294
    if-eqz v2, :cond_f

    .line 295
    .line 296
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 297
    .line 298
    invoke-virtual {v2, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    if-nez v2, :cond_f

    .line 303
    .line 304
    iget-object v2, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 305
    .line 306
    invoke-static {v2}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 307
    .line 308
    .line 309
    :cond_f
    iput-object v1, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 310
    .line 311
    iput-object v1, v0, LQ1/d;->d:Landroid/opengl/EGLContext;

    .line 312
    .line 313
    iput-object v1, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 314
    .line 315
    iput-object v1, v0, LQ1/d;->f:Landroid/graphics/SurfaceTexture;

    .line 316
    .line 317
    return-void

    .line 318
    :goto_3
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 319
    .line 320
    if-eqz v3, :cond_10

    .line 321
    .line 322
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 323
    .line 324
    invoke-virtual {v3, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-nez v3, :cond_10

    .line 329
    .line 330
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 331
    .line 332
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 333
    .line 334
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 335
    .line 336
    invoke-static {v3, v4, v4, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 337
    .line 338
    .line 339
    :cond_10
    iget-object v3, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 340
    .line 341
    if-eqz v3, :cond_11

    .line 342
    .line 343
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 344
    .line 345
    invoke-virtual {v3, v4}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-nez v3, :cond_11

    .line 350
    .line 351
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 352
    .line 353
    iget-object v4, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 354
    .line 355
    invoke-static {v3, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 356
    .line 357
    .line 358
    :cond_11
    iget-object v3, v0, LQ1/d;->d:Landroid/opengl/EGLContext;

    .line 359
    .line 360
    if-eqz v3, :cond_12

    .line 361
    .line 362
    iget-object v4, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 363
    .line 364
    invoke-static {v4, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 365
    .line 366
    .line 367
    :cond_12
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 368
    .line 369
    .line 370
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 371
    .line 372
    if-eqz v3, :cond_13

    .line 373
    .line 374
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 375
    .line 376
    invoke-virtual {v3, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-nez v3, :cond_13

    .line 381
    .line 382
    iget-object v3, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 383
    .line 384
    invoke-static {v3}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 385
    .line 386
    .line 387
    :cond_13
    iput-object v1, v0, LQ1/d;->c:Landroid/opengl/EGLDisplay;

    .line 388
    .line 389
    iput-object v1, v0, LQ1/d;->d:Landroid/opengl/EGLContext;

    .line 390
    .line 391
    iput-object v1, v0, LQ1/d;->e:Landroid/opengl/EGLSurface;

    .line 392
    .line 393
    iput-object v1, v0, LQ1/d;->f:Landroid/graphics/SurfaceTexture;

    .line 394
    .line 395
    throw v2

    .line 396
    nop

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget v0, p0, Lq2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-eq v0, p1, :cond_0

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lq2/f;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 19
    .line 20
    .line 21
    goto :goto_4

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    const-string v0, "PlaceholderSurface"

    .line 24
    .line 25
    const-string v2, "Failed to release placeholder surface"

    .line 26
    .line 27
    invoke-static {v0, v2, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_1
    move-exception p1

    .line 32
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    :try_start_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lq2/f;->b(I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lu6/f; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 39
    .line 40
    .line 41
    monitor-enter p0

    .line 42
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 43
    .line 44
    .line 45
    monitor-exit p0

    .line 46
    goto :goto_4

    .line 47
    :catchall_2
    move-exception p1

    .line 48
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 49
    throw p1

    .line 50
    :catchall_3
    move-exception p1

    .line 51
    goto :goto_5

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :catch_1
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :catch_2
    move-exception p1

    .line 57
    goto :goto_3

    .line 58
    :goto_1
    :try_start_4
    const-string v0, "PlaceholderSurface"

    .line 59
    .line 60
    const-string v2, "Failed to initialize placeholder surface"

    .line 61
    .line 62
    invoke-static {v0, v2, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lq2/f;->c:Ljava/lang/Error;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 66
    .line 67
    monitor-enter p0

    .line 68
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 69
    .line 70
    .line 71
    monitor-exit p0

    .line 72
    goto :goto_4

    .line 73
    :catchall_4
    move-exception p1

    .line 74
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 75
    throw p1

    .line 76
    :goto_2
    :try_start_6
    const-string v0, "PlaceholderSurface"

    .line 77
    .line 78
    const-string v2, "Failed to initialize placeholder surface"

    .line 79
    .line 80
    invoke-static {v0, v2, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lq2/f;->d:Ljava/lang/RuntimeException;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 89
    .line 90
    monitor-enter p0

    .line 91
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 92
    .line 93
    .line 94
    monitor-exit p0

    .line 95
    goto :goto_4

    .line 96
    :catchall_5
    move-exception p1

    .line 97
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 98
    throw p1

    .line 99
    :goto_3
    :try_start_8
    const-string v0, "PlaceholderSurface"

    .line 100
    .line 101
    const-string v2, "Failed to initialize placeholder surface"

    .line 102
    .line 103
    invoke-static {v0, v2, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lq2/f;->d:Ljava/lang/RuntimeException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 107
    .line 108
    monitor-enter p0

    .line 109
    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 110
    .line 111
    .line 112
    monitor-exit p0

    .line 113
    :goto_4
    return v1

    .line 114
    :catchall_6
    move-exception p1

    .line 115
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 116
    throw p1

    .line 117
    :goto_5
    monitor-enter p0

    .line 118
    :try_start_a
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 119
    .line 120
    .line 121
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 122
    throw p1

    .line 123
    :catchall_7
    move-exception p1

    .line 124
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 125
    throw p1

    .line 126
    :pswitch_0
    invoke-direct {p0, p1}, Lq2/f;->a(Landroid/os/Message;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
