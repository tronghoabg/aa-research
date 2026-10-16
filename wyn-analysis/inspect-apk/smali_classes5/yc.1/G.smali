.class public final Lyc/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[I

.field public final b:[F

.field public final c:[I

.field public d:I

.field public e:I

.field public final f:[I

.field public g:I

.field public h:I

.field public i:I

.field public j:Landroid/opengl/EGLDisplay;

.field public k:Landroid/opengl/EGLContext;

.field public l:Landroid/opengl/EGLSurface;

.field public final m:LH4/a;

.field public final n:Landroid/view/Surface;

.field public o:Landroid/graphics/SurfaceTexture;

.field public p:Landroid/view/Surface;

.field public q:Landroid/os/HandlerThread;

.field public final r:Ljava/lang/Object;

.field public s:Ljava/lang/Boolean;

.field public final t:I

.field public final u:I

.field public v:I

.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Surface;IILod/A0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Lyc/G;->a:[I

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyc/G;->b:[F

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, 0x6

    .line 21
    new-array v2, v2, [I

    .line 22
    .line 23
    fill-array-data v2, :array_1

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lyc/G;->c:[I

    .line 27
    .line 28
    iput v0, p0, Lyc/G;->e:I

    .line 29
    .line 30
    new-array v1, v1, [I

    .line 31
    .line 32
    iput-object v1, p0, Lyc/G;->f:[I

    .line 33
    .line 34
    iput v0, p0, Lyc/G;->g:I

    .line 35
    .line 36
    iput v0, p0, Lyc/G;->h:I

    .line 37
    .line 38
    iput v0, p0, Lyc/G;->i:I

    .line 39
    .line 40
    new-instance v1, Ljava/lang/Object;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lyc/G;->r:Ljava/lang/Object;

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    iput-object v1, p0, Lyc/G;->s:Ljava/lang/Boolean;

    .line 50
    .line 51
    iput v0, p0, Lyc/G;->v:I

    .line 52
    .line 53
    new-instance v1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lyc/G;->w:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object p1, p0, Lyc/G;->n:Landroid/view/Surface;

    .line 61
    .line 62
    iput p3, p0, Lyc/G;->u:I

    .line 63
    .line 64
    iput p2, p0, Lyc/G;->t:I

    .line 65
    .line 66
    const-string p1, "VideoRenderer"

    .line 67
    .line 68
    const-string p2, "Starting OpenGL Thread"

    .line 69
    .line 70
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    new-instance p2, LH4/a;

    .line 74
    .line 75
    const/4 p3, 0x4

    .line 76
    invoke-direct {p2, p3, p0, v0}, LH4/a;-><init>(ILjava/lang/Object;Z)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lyc/G;->m:LH4/a;

    .line 80
    .line 81
    invoke-virtual {p2, p4}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lyc/G;->m:LH4/a;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 87
    .line 88
    .line 89
    const-string p2, "VideoRenderer setup complete"

    .line 90
    .line 91
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x0
        0x0
        0x0
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    :array_1
    .array-data 4
        0x2
        0x1
        0x0
        0x0
        0x3
        0x2
    .end array-data
.end method


# virtual methods
.method public final a()V
    .locals 15

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x3038

    .line 3
    .line 4
    const-string v2, "eglMakeCurrent(): "

    .line 5
    .line 6
    const-string v3, "eglInitialize(): "

    .line 7
    .line 8
    const-string v4, "eglDisplay == EGL14.EGL_NO_DISPLAY: "

    .line 9
    .line 10
    iget-object v5, p0, Lyc/G;->w:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v5

    .line 13
    const/4 v6, 0x0

    .line 14
    :try_start_0
    invoke-static {v6}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    iput-object v7, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 19
    .line 20
    sget-object v8, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 21
    .line 22
    if-eq v7, v8, :cond_9

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    new-array v8, v4, [I

    .line 26
    .line 27
    invoke-static {v7, v8, v6, v8, v0}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_8

    .line 32
    .line 33
    iget-object v3, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 34
    .line 35
    const/16 v7, 0x3055

    .line 36
    .line 37
    invoke-static {v3, v7}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v7, "EGL_ANDROID_presentation_time"

    .line 42
    .line 43
    invoke-virtual {v3, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_7

    .line 48
    .line 49
    sget v3, Lyc/E;->a:I

    .line 50
    .line 51
    const/16 v7, 0x1a

    .line 52
    .line 53
    if-lt v3, v7, :cond_0

    .line 54
    .line 55
    move v3, v0

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v3, v6

    .line 58
    :goto_0
    if-eqz v3, :cond_1

    .line 59
    .line 60
    const/16 v3, 0xd

    .line 61
    .line 62
    new-array v3, v3, [I

    .line 63
    .line 64
    fill-array-data v3, :array_0

    .line 65
    .line 66
    .line 67
    :goto_1
    move-object v8, v3

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    const/16 v3, 0xb

    .line 70
    .line 71
    new-array v3, v3, [I

    .line 72
    .line 73
    fill-array-data v3, :array_1

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    const/4 v12, 0x1

    .line 78
    new-array v10, v12, [Landroid/opengl/EGLConfig;

    .line 79
    .line 80
    new-array v13, v0, [I

    .line 81
    .line 82
    iget-object v7, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v11, 0x0

    .line 86
    const/4 v14, 0x0

    .line 87
    invoke-static/range {v7 .. v14}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    const/16 v7, 0x3000

    .line 98
    .line 99
    if-ne v3, v7, :cond_5

    .line 100
    .line 101
    const/16 v3, 0x3098

    .line 102
    .line 103
    filled-new-array {v3, v4, v1}, [I

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-object v8, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 108
    .line 109
    aget-object v9, v10, v6

    .line 110
    .line 111
    sget-object v11, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 112
    .line 113
    invoke-static {v8, v9, v11, v3, v6}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iput-object v3, p0, Lyc/G;->k:Landroid/opengl/EGLContext;

    .line 118
    .line 119
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-ne v3, v7, :cond_4

    .line 124
    .line 125
    filled-new-array {v1}, [I

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-object v3, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 130
    .line 131
    aget-object v8, v10, v6

    .line 132
    .line 133
    iget-object v9, p0, Lyc/G;->n:Landroid/view/Surface;

    .line 134
    .line 135
    invoke-static {v3, v8, v9, v1, v6}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iput-object v1, p0, Lyc/G;->l:Landroid/opengl/EGLSurface;

    .line 140
    .line 141
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-ne v1, v7, :cond_3

    .line 146
    .line 147
    iget-object v1, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 148
    .line 149
    iget-object v3, p0, Lyc/G;->l:Landroid/opengl/EGLSurface;

    .line 150
    .line 151
    iget-object v7, p0, Lyc/G;->k:Landroid/opengl/EGLContext;

    .line 152
    .line 153
    invoke-static {v1, v3, v3, v7}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_2

    .line 158
    .line 159
    iget-object v1, p0, Lyc/G;->b:[F

    .line 160
    .line 161
    array-length v1, v1

    .line 162
    mul-int/lit8 v1, v1, 0x4

    .line 163
    .line 164
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    iget-object v3, p0, Lyc/G;->b:[F

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2, v6}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 189
    .line 190
    .line 191
    iget-object v2, p0, Lyc/G;->c:[I

    .line 192
    .line 193
    array-length v2, v2

    .line 194
    mul-int/lit8 v2, v2, 0x4

    .line 195
    .line 196
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    iget-object v7, p0, Lyc/G;->c:[I

    .line 212
    .line 213
    invoke-virtual {v3, v7}, Ljava/nio/IntBuffer;->put([I)Ljava/nio/IntBuffer;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 217
    .line 218
    .line 219
    const-string v3, "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }"

    .line 220
    .line 221
    const v7, 0x8b31

    .line 222
    .line 223
    .line 224
    invoke-static {v7}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    invoke-static {v7, v3}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v7}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 232
    .line 233
    .line 234
    const-string v3, " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }"

    .line 235
    .line 236
    const v8, 0x8b30

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    invoke-static {v8, v3}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v8}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    iput v3, p0, Lyc/G;->d:I

    .line 254
    .line 255
    invoke-static {v3, v7}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 256
    .line 257
    .line 258
    iget v3, p0, Lyc/G;->d:I

    .line 259
    .line 260
    invoke-static {v3, v8}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 261
    .line 262
    .line 263
    iget v3, p0, Lyc/G;->d:I

    .line 264
    .line 265
    invoke-static {v3}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 266
    .line 267
    .line 268
    invoke-static {v7}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 269
    .line 270
    .line 271
    invoke-static {v8}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 272
    .line 273
    .line 274
    iget v3, p0, Lyc/G;->d:I

    .line 275
    .line 276
    const-string v7, "vertexPosition"

    .line 277
    .line 278
    invoke-static {v3, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    iput v3, p0, Lyc/G;->e:I

    .line 283
    .line 284
    iget v3, p0, Lyc/G;->d:I

    .line 285
    .line 286
    const-string v7, "uvs"

    .line 287
    .line 288
    invoke-static {v3, v7}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    iput v3, p0, Lyc/G;->g:I

    .line 293
    .line 294
    iget v3, p0, Lyc/G;->d:I

    .line 295
    .line 296
    const-string v7, "texMatrix"

    .line 297
    .line 298
    invoke-static {v3, v7}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    iput v3, p0, Lyc/G;->h:I

    .line 303
    .line 304
    iget v3, p0, Lyc/G;->d:I

    .line 305
    .line 306
    const-string v7, "mvp"

    .line 307
    .line 308
    invoke-static {v3, v7}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    iput v3, p0, Lyc/G;->i:I

    .line 313
    .line 314
    iget-object v3, p0, Lyc/G;->f:[I

    .line 315
    .line 316
    invoke-static {v4, v3, v6}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 317
    .line 318
    .line 319
    iget-object v3, p0, Lyc/G;->f:[I

    .line 320
    .line 321
    aget v3, v3, v6

    .line 322
    .line 323
    const v4, 0x8892

    .line 324
    .line 325
    .line 326
    invoke-static {v4, v3}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 327
    .line 328
    .line 329
    iget-object v3, p0, Lyc/G;->b:[F

    .line 330
    .line 331
    array-length v3, v3

    .line 332
    mul-int/lit8 v3, v3, 0x4

    .line 333
    .line 334
    const v7, 0x88e8

    .line 335
    .line 336
    .line 337
    invoke-static {v4, v3, v1, v7}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 338
    .line 339
    .line 340
    iget-object v1, p0, Lyc/G;->f:[I

    .line 341
    .line 342
    aget v1, v1, v0

    .line 343
    .line 344
    const v3, 0x8893

    .line 345
    .line 346
    .line 347
    invoke-static {v3, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 348
    .line 349
    .line 350
    iget-object v1, p0, Lyc/G;->c:[I

    .line 351
    .line 352
    array-length v1, v1

    .line 353
    mul-int/lit8 v1, v1, 0x4

    .line 354
    .line 355
    invoke-static {v3, v1, v2, v7}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 356
    .line 357
    .line 358
    iget-object v1, p0, Lyc/G;->a:[I

    .line 359
    .line 360
    invoke-static {v0, v1, v6}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 361
    .line 362
    .line 363
    iget-object v0, p0, Lyc/G;->a:[I

    .line 364
    .line 365
    aget v0, v0, v6

    .line 366
    .line 367
    const v1, 0x8d65

    .line 368
    .line 369
    .line 370
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 371
    .line 372
    .line 373
    new-instance v0, Landroid/graphics/SurfaceTexture;

    .line 374
    .line 375
    iget-object v1, p0, Lyc/G;->a:[I

    .line 376
    .line 377
    aget v1, v1, v6

    .line 378
    .line 379
    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 380
    .line 381
    .line 382
    iput-object v0, p0, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 383
    .line 384
    iget v1, p0, Lyc/G;->t:I

    .line 385
    .line 386
    iget v2, p0, Lyc/G;->u:I

    .line 387
    .line 388
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 389
    .line 390
    .line 391
    new-instance v0, Landroid/os/HandlerThread;

    .line 392
    .line 393
    const-string v1, "FrameHandlerThread"

    .line 394
    .line 395
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iput-object v0, p0, Lyc/G;->q:Landroid/os/HandlerThread;

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 401
    .line 402
    .line 403
    new-instance v0, Landroid/view/Surface;

    .line 404
    .line 405
    iget-object v1, p0, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 406
    .line 407
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 408
    .line 409
    .line 410
    iput-object v0, p0, Lyc/G;->p:Landroid/view/Surface;

    .line 411
    .line 412
    iget-object v0, p0, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 413
    .line 414
    new-instance v1, Lyc/F;

    .line 415
    .line 416
    invoke-direct {v1, p0}, Lyc/F;-><init>(Lyc/G;)V

    .line 417
    .line 418
    .line 419
    new-instance v2, Landroid/os/Handler;

    .line 420
    .line 421
    iget-object v3, p0, Lyc/G;->q:Landroid/os/HandlerThread;

    .line 422
    .line 423
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    .line 431
    .line 432
    .line 433
    iget-object v0, p0, Lyc/G;->w:Ljava/lang/Object;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 436
    .line 437
    .line 438
    monitor-exit v5

    .line 439
    return-void

    .line 440
    :catchall_0
    move-exception v0

    .line 441
    goto/16 :goto_3

    .line 442
    .line 443
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 444
    .line 445
    new-instance v1, Ljava/lang/StringBuilder;

    .line 446
    .line 447
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    invoke-static {v2}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v0

    .line 469
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 470
    .line 471
    invoke-static {v1}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v0

    .line 479
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 480
    .line 481
    invoke-static {v3}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw v0

    .line 489
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 490
    .line 491
    invoke-static {v3}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 500
    .line 501
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    invoke-static {v1}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    throw v0

    .line 513
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    .line 514
    .line 515
    const-string v1, "cannot configure OpenGL. missing EGL_ANDROID_presentation_time"

    .line 516
    .line 517
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    throw v0

    .line 521
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    .line 522
    .line 523
    new-instance v1, Ljava/lang/StringBuilder;

    .line 524
    .line 525
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    invoke-static {v2}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    throw v0

    .line 547
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 548
    .line 549
    new-instance v1, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-static {v2}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v0

    .line 573
    :goto_3
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 574
    throw v0

    .line 575
    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3142
        0x1
        0x3038
    .end array-data

    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    :array_1
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3038
    .end array-data
.end method

.method public final b([FII)V
    .locals 7

    .line 1
    const/16 v0, 0x4100

    .line 2
    .line 3
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {v0, v0, v0, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0, v0, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 12
    .line 13
    .line 14
    iget p2, p0, Lyc/G;->d:I

    .line 15
    .line 16
    invoke-static {p2}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lyc/G;->h:I

    .line 20
    .line 21
    const/4 p3, 0x1

    .line 22
    invoke-static {p2, p3, v0, p1, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lyc/G;->i:I

    .line 26
    .line 27
    const/16 p2, 0x10

    .line 28
    .line 29
    new-array v1, p2, [F

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 32
    .line 33
    .line 34
    iget p2, p0, Lyc/G;->v:I

    .line 35
    .line 36
    int-to-float v3, p2

    .line 37
    const/4 v5, 0x0

    .line 38
    const/high16 v6, 0x3f800000    # 1.0f

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p3, v0, v1, v0}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lyc/G;->f:[I

    .line 49
    .line 50
    aget p2, p1, v0

    .line 51
    .line 52
    const v1, 0x8892

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p2}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 56
    .line 57
    .line 58
    const p2, 0x8893

    .line 59
    .line 60
    .line 61
    aget p1, p1, p3

    .line 62
    .line 63
    invoke-static {p2, p1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 64
    .line 65
    .line 66
    iget p1, p0, Lyc/G;->e:I

    .line 67
    .line 68
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lyc/G;->e:I

    .line 72
    .line 73
    const/16 v3, 0x1406

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v2, 0x3

    .line 77
    const/16 v5, 0x14

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 81
    .line 82
    .line 83
    iget p1, p0, Lyc/G;->g:I

    .line 84
    .line 85
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lyc/G;->g:I

    .line 89
    .line 90
    const/4 v2, 0x2

    .line 91
    const/16 v6, 0xc

    .line 92
    .line 93
    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 94
    .line 95
    .line 96
    const/16 p1, 0x1405

    .line 97
    .line 98
    const/4 p2, 0x4

    .line 99
    const/4 p3, 0x6

    .line 100
    invoke-static {p2, p3, p1, v0}, Landroid/opengl/GLES20;->glDrawElements(IIII)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 104
    .line 105
    iget-object p2, p0, Lyc/G;->l:Landroid/opengl/EGLSurface;

    .line 106
    .line 107
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    const-wide/32 v2, 0xf4240

    .line 112
    .line 113
    .line 114
    mul-long/2addr v0, v2

    .line 115
    invoke-static {p1, p2, v0, v1}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 119
    .line 120
    iget-object p2, p0, Lyc/G;->l:Landroid/opengl/EGLSurface;

    .line 121
    .line 122
    invoke-static {p1, p2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_0

    .line 127
    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string p2, "eglSwapBuffers() "

    .line 131
    .line 132
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    invoke-static {p2}, Landroid/opengl/GLUtils;->getEGLErrorString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const-string p2, "VideoRenderer"

    .line 151
    .line 152
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_0
    return-void
.end method
