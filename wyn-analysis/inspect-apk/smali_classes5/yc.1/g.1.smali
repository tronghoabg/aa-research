.class public final Lyc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public a:LJ3/g;

.field public b:I

.field public c:Lyc/G;

.field public d:I

.field public final e:Lio/flutter/embedding/engine/renderer/i;

.field public final f:LLc/b;

.field public final g:Landroid/content/Context;

.field public final h:Lmd/J;

.field public i:Lt6/q;

.field public final j:La9/b;

.field public final k:Landroid/app/Activity;

.field public final l:Lyc/h;

.field public m:Landroid/os/Handler;

.field public n:Landroid/os/HandlerThread;

.field public o:Lu0/w0;

.field public p:Landroid/hardware/camera2/CameraCaptureSession;

.field public q:Landroid/media/ImageReader;

.field public r:LE4/n;

.field public s:Landroid/hardware/camera2/CaptureRequest$Builder;

.field public t:Landroid/media/MediaRecorder;

.field public u:Z

.field public v:Z

.field public w:Ljava/io/File;

.field public final x:LS3/s;

.field public final y:Lb7/k;

.field public z:LPc/q;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/flutter/embedding/engine/renderer/i;La9/b;Lmd/J;Lt6/q;LLc/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iput-object p1, p0, Lyc/g;->k:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p2, p0, Lyc/g;->e:Lio/flutter/embedding/engine/renderer/i;

    .line 9
    .line 10
    iput-object p4, p0, Lyc/g;->h:Lmd/J;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    iput-object p2, p0, Lyc/g;->g:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p5, p0, Lyc/g;->i:Lt6/q;

    .line 19
    .line 20
    iput-object p3, p0, Lyc/g;->j:La9/b;

    .line 21
    .line 22
    iput-object p6, p0, Lyc/g;->f:LLc/b;

    .line 23
    .line 24
    iget p2, p6, LLc/b;->b:I

    .line 25
    .line 26
    invoke-static {p3, p5, p1, p4, p2}, LJ3/g;->h(La9/b;Lt6/q;Landroid/app/Activity;Lmd/J;I)LJ3/g;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 31
    .line 32
    new-instance p1, LS3/s;

    .line 33
    .line 34
    const/16 p2, 0xd

    .line 35
    .line 36
    const/4 p3, 0x0

    .line 37
    invoke-direct {p1, p2, p3}, LS3/s;-><init>(IC)V

    .line 38
    .line 39
    .line 40
    new-instance p2, LJ5/n;

    .line 41
    .line 42
    const/4 p3, 0x2

    .line 43
    invoke-direct {p2, p3}, LJ5/n;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p2, p1, LS3/s;->b:Ljava/lang/Object;

    .line 47
    .line 48
    new-instance p2, LJ5/n;

    .line 49
    .line 50
    const/4 p3, 0x2

    .line 51
    invoke-direct {p2, p3}, LJ5/n;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p1, LS3/s;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object p1, p0, Lyc/g;->x:LS3/s;

    .line 57
    .line 58
    new-instance p2, Lb7/k;

    .line 59
    .line 60
    const/16 p3, 0x9

    .line 61
    .line 62
    const/4 p4, 0x0

    .line 63
    invoke-direct {p2, p3, p4}, Lb7/k;-><init>(IZ)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lyc/g;->y:Lb7/k;

    .line 67
    .line 68
    new-instance p3, Lyc/h;

    .line 69
    .line 70
    invoke-direct {p3, p0, p1, p2}, Lyc/h;-><init>(Lyc/g;LS3/s;Lb7/k;)V

    .line 71
    .line 72
    .line 73
    iput-object p3, p0, Lyc/g;->l:Lyc/h;

    .line 74
    .line 75
    iget-object p1, p0, Lyc/g;->n:Landroid/os/HandlerThread;

    .line 76
    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    new-instance p1, Landroid/os/HandlerThread;

    .line 81
    .line 82
    const-string p2, "CameraBackground"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lyc/g;->n:Landroid/os/HandlerThread;

    .line 88
    .line 89
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    :catch_0
    iget-object p1, p0, Lyc/g;->n:Landroid/os/HandlerThread;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance p2, Landroid/os/Handler;

    .line 99
    .line 100
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    iput-object p2, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 104
    .line 105
    :goto_0
    return-void

    .line 106
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string p2, "No activity available!"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const-string v0, "close"

    .line 2
    .line 3
    const-string v1, "Camera"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyc/g;->o:Lu0/w0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lu0/w0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Lyc/g;->o:Lu0/w0;

    .line 21
    .line 22
    iput-object v2, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "closeCaptureSession"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object v0, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lyc/g;->r:LE4/n;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v0, v0, LE4/n;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroid/media/ImageReader;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/media/ImageReader;->close()V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lyc/g;->r:LE4/n;

    .line 62
    .line 63
    :cond_3
    iget-object v0, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 76
    .line 77
    :cond_4
    iget-object v0, p0, Lyc/g;->n:Landroid/os/HandlerThread;

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 82
    .line 83
    .line 84
    :cond_5
    iput-object v2, p0, Lyc/g;->n:Landroid/os/HandlerThread;

    .line 85
    .line 86
    iput-object v2, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 87
    .line 88
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyc/g;->c:Lyc/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lyc/G;->m:LH4/a;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lyc/G;->q:Landroid/os/HandlerThread;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Lyc/G;->f:[I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static {v2, v1, v3}, Landroid/opengl/GLES20;->glDeleteBuffers(I[II)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lyc/G;->a:[I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-static {v2, v1, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 29
    .line 30
    iget-object v2, v0, Lyc/G;->k:Landroid/opengl/EGLContext;

    .line 31
    .line 32
    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, Lyc/G;->j:Landroid/opengl/EGLDisplay;

    .line 36
    .line 37
    iget-object v2, v0, Lyc/G;->l:Landroid/opengl/EGLSurface;

    .line 38
    .line 39
    invoke-static {v1, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 40
    .line 41
    .line 42
    iget v1, v0, Lyc/G;->d:I

    .line 43
    .line 44
    invoke-static {v1}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lyc/g;->c:Lyc/G;

    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final varargs c(ILjava/lang/Runnable;[Landroid/view/Surface;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 3
    .line 4
    iget-object v0, p0, Lyc/g;->o:Lu0/w0;

    .line 5
    .line 6
    iget-object v0, v0, Lu0/w0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 15
    .line 16
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 17
    .line 18
    invoke-virtual {v0}, LJ3/g;->e()LIc/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lyc/g;->e:Lio/flutter/embedding/engine/renderer/i;

    .line 23
    .line 24
    iget-object v1, v1, Lio/flutter/embedding/engine/renderer/i;->b:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, v0, LIc/a;->c:Landroid/util/Size;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iget-object v0, v0, LIc/a;->c:Landroid/util/Size;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {v1, v2, v0}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroid/view/Surface;

    .line 46
    .line 47
    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    const/4 v1, 0x1

    .line 60
    if-eq p1, v1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Landroid/view/Surface;

    .line 83
    .line 84
    if-ne v2, p1, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iget-object v3, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 88
    .line 89
    invoke-virtual {v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object p1, p0, Lyc/g;->i:Lt6/q;

    .line 94
    .line 95
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 96
    .line 97
    sget v2, Lyc/E;->a:I

    .line 98
    .line 99
    const/16 v3, 0x1c

    .line 100
    .line 101
    if-lt v2, v3, :cond_5

    .line 102
    .line 103
    iget-object v4, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v4, Landroid/hardware/camera2/CameraCharacteristics;

    .line 106
    .line 107
    invoke-static {}, Llc/f;->b()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v4, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, [I

    .line 116
    .line 117
    if-nez v4, :cond_2

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    new-array v4, v4, [I

    .line 121
    .line 122
    :cond_2
    invoke-static {v4}, Lj$/util/DesugarArrays;->stream([I)Lj$/util/stream/IntStream;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    new-instance v5, Lyc/j;

    .line 127
    .line 128
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v4, v5}, Lj$/util/stream/IntStream;->filter(Ljava/util/function/IntPredicate;)Lj$/util/stream/IntStream;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-interface {v4}, Lj$/util/stream/IntStream;->count()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    const-wide/16 v6, 0x0

    .line 140
    .line 141
    cmp-long v4, v4, v6

    .line 142
    .line 143
    if-lez v4, :cond_5

    .line 144
    .line 145
    invoke-static {}, Llc/f;->c()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, Ljava/lang/Integer;

    .line 154
    .line 155
    iget-object p1, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 158
    .line 159
    if-eqz v1, :cond_4

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_3

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 169
    .line 170
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, Landroid/graphics/Rect;

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    :goto_1
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 178
    .line 179
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Landroid/graphics/Rect;

    .line 184
    .line 185
    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    new-instance v4, Landroid/util/Size;

    .line 194
    .line 195
    invoke-direct {v4, v1, p1}, Landroid/util/Size;-><init>(II)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_5
    iget-object p1, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 202
    .line 203
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PIXEL_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 204
    .line 205
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    move-object v4, p1

    .line 210
    check-cast v4, Landroid/util/Size;

    .line 211
    .line 212
    :goto_3
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 213
    .line 214
    invoke-virtual {p1}, LJ3/g;->c()LDc/a;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object v4, p1, LDc/a;->b:Landroid/util/Size;

    .line 219
    .line 220
    invoke-virtual {p1}, LDc/a;->b()V

    .line 221
    .line 222
    .line 223
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 224
    .line 225
    invoke-virtual {p1}, LJ3/g;->d()LFc/a;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    iput-object v4, p1, LFc/a;->b:Landroid/util/Size;

    .line 230
    .line 231
    invoke-virtual {p1}, LFc/a;->b()V

    .line 232
    .line 233
    .line 234
    new-instance p1, Lyc/e;

    .line 235
    .line 236
    invoke-direct {p1, p0, p2}, Lyc/e;-><init>(Lyc/g;Ljava/lang/Runnable;)V

    .line 237
    .line 238
    .line 239
    if-lt v2, v3, :cond_7

    .line 240
    .line 241
    new-instance p2, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, Lu6/u;->b(Landroid/view/Surface;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p3

    .line 257
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Landroid/view/Surface;

    .line 268
    .line 269
    invoke-static {v0}, Lu6/u;->b(Landroid/view/Surface;)Landroid/hardware/camera2/params/OutputConfiguration;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_6
    iget-object p3, p0, Lyc/g;->o:Lu0/w0;

    .line 278
    .line 279
    invoke-static {}, Llc/f;->i()V

    .line 280
    .line 281
    .line 282
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {p2, v0, p1}, Llc/f;->d(Ljava/util/ArrayList;Ljava/util/concurrent/ExecutorService;Lyc/e;)Landroid/hardware/camera2/params/SessionConfiguration;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    iget-object p2, p3, Lu0/w0;->a:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    .line 293
    .line 294
    invoke-static {p2, p1}, Llc/f;->k(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/SessionConfiguration;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_7
    new-instance p2, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 307
    .line 308
    .line 309
    iget-object p3, p0, Lyc/g;->o:Lu0/w0;

    .line 310
    .line 311
    iget-object v0, p3, Lu0/w0;->b:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, Lyc/g;

    .line 314
    .line 315
    iget-object v0, v0, Lyc/g;->m:Landroid/os/Handler;

    .line 316
    .line 317
    iget-object p3, p3, Lu0/w0;->a:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast p3, Landroid/hardware/camera2/CameraDevice;

    .line 320
    .line 321
    invoke-virtual {p3, p2, p1, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    .line 322
    .line 323
    .line 324
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const-string v0, "lockAutoFocus"

    .line 2
    .line 3
    const-string v1, "Camera"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "[unlockAutoFocus] captureSession null, returning"

    .line 13
    .line 14
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 19
    .line 20
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 31
    .line 32
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v0, v1, v3, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    const-string v0, "CameraAccessException occurred while locking autofocus."

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    iget-object v1, p0, Lyc/g;->h:Lmd/J;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lmd/J;->w(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final e()V
    .locals 7

    .line 1
    const-string v0, "cameraAccess"

    .line 2
    .line 3
    iget-object v1, p0, Lyc/g;->h:Lmd/J;

    .line 4
    .line 5
    const-string v2, "captureStillPicture"

    .line 6
    .line 7
    const-string v3, "Camera"

    .line 8
    .line 9
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lyc/g;->l:Lyc/h;

    .line 13
    .line 14
    const/4 v4, 0x5

    .line 15
    iput v4, v2, Lyc/h;->b:I

    .line 16
    .line 17
    iget-object v2, p0, Lyc/g;->o:Lu0/w0;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    :try_start_0
    iget-object v2, v2, Lu0/w0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroid/hardware/camera2/CameraDevice;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-virtual {v2, v4}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v2
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    iget-object v4, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    .line 39
    .line 40
    .line 41
    sget-object v4, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 42
    .line 43
    iget-object v5, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Landroid/graphics/Rect;

    .line 50
    .line 51
    invoke-virtual {v2, v4, v5}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v4, p0, Lyc/g;->a:LJ3/g;

    .line 55
    .line 56
    iget-object v4, v4, LJ3/g;->a:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lzc/a;

    .line 77
    .line 78
    invoke-virtual {v5, v2}, Lzc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v4, p0, Lyc/g;->a:LJ3/g;

    .line 83
    .line 84
    invoke-virtual {v4}, LJ3/g;->f()LJc/b;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    iget v4, v4, LJc/b;->d:I

    .line 89
    .line 90
    sget-object v5, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 91
    .line 92
    if-nez v4, :cond_2

    .line 93
    .line 94
    iget-object v4, p0, Lyc/g;->a:LJ3/g;

    .line 95
    .line 96
    invoke-virtual {v4}, LJ3/g;->f()LJc/b;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-object v4, v4, LJc/b;->c:LJc/a;

    .line 101
    .line 102
    iget v6, v4, LJc/a;->e:I

    .line 103
    .line 104
    invoke-virtual {v4, v6}, LJc/a;->a(I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    iget-object v6, p0, Lyc/g;->a:LJ3/g;

    .line 110
    .line 111
    invoke-virtual {v6}, LJ3/g;->f()LJc/b;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iget-object v6, v6, LJc/b;->c:LJc/a;

    .line 116
    .line 117
    invoke-virtual {v6, v4}, LJc/a;->a(I)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    :goto_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v2, v5, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance v4, Lyc/f;

    .line 129
    .line 130
    invoke-direct {v4, p0}, Lyc/f;-><init>(Lyc/g;)V

    .line 131
    .line 132
    .line 133
    :try_start_1
    const-string v5, "sending capture request"

    .line 134
    .line 135
    invoke-static {v3, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    iget-object v3, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-object v5, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 145
    .line 146
    invoke-virtual {v3, v2, v4, v5}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :catch_0
    move-exception v2

    .line 151
    iget-object v3, p0, Lyc/g;->z:LPc/q;

    .line 152
    .line 153
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v1, v3, v0, v2}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :catch_1
    move-exception v2

    .line 162
    iget-object v3, p0, Lyc/g;->z:LPc/q;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v1, v3, v0, v2}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :goto_2
    return-void
.end method

.method public final f(Ljava/lang/Integer;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lyc/g;->b:I

    .line 6
    .line 7
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 8
    .line 9
    invoke-virtual {p1}, LJ3/g;->e()LIc/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget v0, p1, LIc/a;->f:I

    .line 14
    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, LIc/a;->b:Landroid/util/Size;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p1, LIc/a;->b:Landroid/util/Size;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v2, 0x100

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-static {v0, v1, v2, v3}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 37
    .line 38
    new-instance v0, LE4/n;

    .line 39
    .line 40
    iget-object v1, p1, LIc/a;->c:Landroid/util/Size;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p1, LIc/a;->c:Landroid/util/Size;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget v3, p0, Lyc/g;->b:I

    .line 53
    .line 54
    invoke-direct {v0, v1, v2, v3}, LE4/n;-><init>(III)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lyc/g;->r:LE4/n;

    .line 58
    .line 59
    const-string v0, "camera"

    .line 60
    .line 61
    iget-object v1, p0, Lyc/g;->k:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Landroid/hardware/camera2/CameraManager;

    .line 68
    .line 69
    iget-object v1, p0, Lyc/g;->i:Lt6/q;

    .line 70
    .line 71
    iget-object v1, v1, Lt6/q;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Ljava/lang/String;

    .line 74
    .line 75
    new-instance v2, Lyc/d;

    .line 76
    .line 77
    invoke-direct {v2, p0, p1}, Lyc/d;-><init>(Lyc/g;LIc/a;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2, p1}, Landroid/hardware/camera2/CameraManager;->openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v0, "Camera with name \""

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lyc/g;->i:Lt6/q;

    .line 94
    .line 95
    iget-object v0, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    const-string v1, "\" is not supported by this plugin."

    .line 100
    .line 101
    invoke-static {p1, v0, v1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object v0, p0, Lyc/g;->h:Lmd/J;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lmd/J;->w(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "Camera"

    .line 2
    .line 3
    const-string v1, "prepareMediaRecorder"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lyc/g;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 19
    .line 20
    invoke-virtual {v0}, LJ3/g;->f()LJc/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v0, v0, LJc/b;->d:I

    .line 25
    .line 26
    sget v1, Lyc/E;->a:I

    .line 27
    .line 28
    const/16 v2, 0x1f

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-lt v1, v2, :cond_1

    .line 33
    .line 34
    move v1, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v1, v3

    .line 37
    :goto_0
    iget-object v5, p0, Lyc/g;->f:LLc/b;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, Lyc/g;->a:LJ3/g;

    .line 42
    .line 43
    invoke-virtual {v1}, LJ3/g;->e()LIc/a;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v1, v1, LIc/a;->e:Landroid/media/EncoderProfiles;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    new-instance v1, LLc/b;

    .line 52
    .line 53
    iget-object v6, p0, Lyc/g;->a:LJ3/g;

    .line 54
    .line 55
    invoke-virtual {v6}, LJ3/g;->e()LIc/a;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iget-object v6, v6, LIc/a;->e:Landroid/media/EncoderProfiles;

    .line 60
    .line 61
    new-instance v7, LS3/i;

    .line 62
    .line 63
    iget-object v8, v5, LLc/b;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Ljava/lang/Integer;

    .line 66
    .line 67
    iget-object v9, v5, LLc/b;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Ljava/lang/Integer;

    .line 70
    .line 71
    iget-object v10, v5, LLc/b;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-direct {v7, p1, v8, v9, v10}, LS3/i;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v6, v1, LLc/b;->d:Ljava/lang/Object;

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    iput-object p1, v1, LLc/b;->c:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v7, v1, LLc/b;->e:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    new-instance v1, LLc/b;

    .line 90
    .line 91
    iget-object v6, p0, Lyc/g;->a:LJ3/g;

    .line 92
    .line 93
    invoke-virtual {v6}, LJ3/g;->e()LIc/a;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v6, v6, LIc/a;->d:Landroid/media/CamcorderProfile;

    .line 98
    .line 99
    new-instance v7, LS3/i;

    .line 100
    .line 101
    iget-object v8, v5, LLc/b;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v8, Ljava/lang/Integer;

    .line 104
    .line 105
    iget-object v9, v5, LLc/b;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v9, Ljava/lang/Integer;

    .line 108
    .line 109
    iget-object v10, v5, LLc/b;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-direct {v7, p1, v8, v9, v10}, LS3/i;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v6, v1, LLc/b;->c:Ljava/lang/Object;

    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    iput-object p1, v1, LLc/b;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v7, v1, LLc/b;->e:Ljava/lang/Object;

    .line 125
    .line 126
    :goto_1
    iget-boolean p1, v5, LLc/b;->a:Z

    .line 127
    .line 128
    iput-boolean p1, v1, LLc/b;->a:Z

    .line 129
    .line 130
    if-nez v0, :cond_3

    .line 131
    .line 132
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 133
    .line 134
    invoke-virtual {p1}, LJ3/g;->f()LJc/b;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object p1, p1, LJc/b;->c:LJc/a;

    .line 139
    .line 140
    iget v0, p1, LJc/a;->e:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, LJc/a;->c(I)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    goto :goto_2

    .line 147
    :cond_3
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 148
    .line 149
    invoke-virtual {p1}, LJ3/g;->f()LJc/b;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object p1, p1, LJc/b;->c:LJc/a;

    .line 154
    .line 155
    invoke-virtual {p1, v0}, LJc/a;->c(I)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    :goto_2
    iput p1, v1, LLc/b;->b:I

    .line 160
    .line 161
    new-instance p1, Landroid/media/MediaRecorder;

    .line 162
    .line 163
    invoke-direct {p1}, Landroid/media/MediaRecorder;-><init>()V

    .line 164
    .line 165
    .line 166
    iget-boolean v0, v1, LLc/b;->a:Z

    .line 167
    .line 168
    if-eqz v0, :cond_4

    .line 169
    .line 170
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 171
    .line 172
    .line 173
    :cond_4
    const/4 v0, 0x2

    .line 174
    invoke-virtual {p1, v0}, Landroid/media/MediaRecorder;->setVideoSource(I)V

    .line 175
    .line 176
    .line 177
    sget v0, Lyc/E;->a:I

    .line 178
    .line 179
    if-lt v0, v2, :cond_5

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_5
    move v4, v3

    .line 183
    :goto_3
    iget-object v0, v1, LLc/b;->e:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, LS3/i;

    .line 186
    .line 187
    iget-object v2, v0, LS3/i;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Ljava/lang/Integer;

    .line 190
    .line 191
    iget-object v5, v0, LS3/i;->c:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v5, Ljava/lang/Integer;

    .line 194
    .line 195
    iget-object v6, v0, LS3/i;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v6, Ljava/lang/Integer;

    .line 198
    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    iget-object v4, v1, LLc/b;->d:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v4, Landroid/media/EncoderProfiles;

    .line 204
    .line 205
    if-eqz v4, :cond_a

    .line 206
    .line 207
    invoke-static {v4}, LF5/i;->c(Landroid/media/EncoderProfiles;)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 212
    .line 213
    .line 214
    iget-object v4, v1, LLc/b;->d:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v4, Landroid/media/EncoderProfiles;

    .line 217
    .line 218
    invoke-static {v4}, Le1/c;->m(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v4}, Le1/c;->e(Ljava/lang/Object;)Landroid/media/EncoderProfiles$VideoProfile;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    iget-boolean v7, v1, LLc/b;->a:Z

    .line 231
    .line 232
    if-eqz v7, :cond_7

    .line 233
    .line 234
    iget-object v7, v1, LLc/b;->d:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v7, Landroid/media/EncoderProfiles;

    .line 237
    .line 238
    invoke-static {v7}, LF5/i;->l(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-static {v3}, LF5/i;->e(Ljava/lang/Object;)Landroid/media/EncoderProfiles$AudioProfile;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-static {v3}, LF5/i;->a(Landroid/media/EncoderProfiles$AudioProfile;)I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-virtual {p1, v7}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 255
    .line 256
    .line 257
    if-eqz v6, :cond_6

    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-lez v7, :cond_6

    .line 264
    .line 265
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    goto :goto_4

    .line 270
    :cond_6
    invoke-static {v3}, LF5/i;->r(Landroid/media/EncoderProfiles$AudioProfile;)I

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    :goto_4
    invoke-virtual {p1, v6}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    .line 275
    .line 276
    .line 277
    invoke-static {v3}, LF5/i;->v(Landroid/media/EncoderProfiles$AudioProfile;)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-virtual {p1, v3}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 282
    .line 283
    .line 284
    :cond_7
    invoke-static {v4}, LF5/i;->w(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-virtual {p1, v3}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    .line 289
    .line 290
    .line 291
    if-eqz v5, :cond_8

    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    if-lez v3, :cond_8

    .line 298
    .line 299
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    goto :goto_5

    .line 304
    :cond_8
    invoke-static {v4}, LF5/i;->y(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    :goto_5
    invoke-virtual {p1, v3}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    .line 309
    .line 310
    .line 311
    if-eqz v2, :cond_9

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-lez v3, :cond_9

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    goto :goto_6

    .line 324
    :cond_9
    invoke-static {v4}, Lyc/a;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    :goto_6
    invoke-virtual {p1, v2}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    .line 329
    .line 330
    .line 331
    invoke-static {v4}, LF5/i;->b(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-static {v4}, LF5/i;->s(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    invoke-virtual {p1, v2, v3}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    .line 340
    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_a
    iget-object v3, v1, LLc/b;->c:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v3, Landroid/media/CamcorderProfile;

    .line 346
    .line 347
    if-eqz v3, :cond_f

    .line 348
    .line 349
    iget v4, v3, Landroid/media/CamcorderProfile;->fileFormat:I

    .line 350
    .line 351
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 352
    .line 353
    .line 354
    iget-boolean v4, v1, LLc/b;->a:Z

    .line 355
    .line 356
    if-eqz v4, :cond_c

    .line 357
    .line 358
    iget v4, v3, Landroid/media/CamcorderProfile;->audioCodec:I

    .line 359
    .line 360
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 361
    .line 362
    .line 363
    if-eqz v6, :cond_b

    .line 364
    .line 365
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-lez v4, :cond_b

    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    goto :goto_7

    .line 376
    :cond_b
    iget v4, v3, Landroid/media/CamcorderProfile;->audioBitRate:I

    .line 377
    .line 378
    :goto_7
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    .line 379
    .line 380
    .line 381
    iget v4, v3, Landroid/media/CamcorderProfile;->audioSampleRate:I

    .line 382
    .line 383
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 384
    .line 385
    .line 386
    :cond_c
    iget v4, v3, Landroid/media/CamcorderProfile;->videoCodec:I

    .line 387
    .line 388
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    .line 389
    .line 390
    .line 391
    if-eqz v5, :cond_d

    .line 392
    .line 393
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-lez v4, :cond_d

    .line 398
    .line 399
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    goto :goto_8

    .line 404
    :cond_d
    iget v4, v3, Landroid/media/CamcorderProfile;->videoBitRate:I

    .line 405
    .line 406
    :goto_8
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    .line 407
    .line 408
    .line 409
    if-eqz v2, :cond_e

    .line 410
    .line 411
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v4

    .line 415
    if-lez v4, :cond_e

    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    goto :goto_9

    .line 422
    :cond_e
    iget v2, v3, Landroid/media/CamcorderProfile;->videoFrameRate:I

    .line 423
    .line 424
    :goto_9
    invoke-virtual {p1, v2}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    .line 425
    .line 426
    .line 427
    iget v2, v3, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 428
    .line 429
    iget v3, v3, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 430
    .line 431
    invoke-virtual {p1, v2, v3}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    .line 432
    .line 433
    .line 434
    :cond_f
    :goto_a
    iget-object v0, v0, LS3/i;->a:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v0, Ljava/lang/String;

    .line 437
    .line 438
    invoke-virtual {p1, v0}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    iget v0, v1, LLc/b;->b:I

    .line 442
    .line 443
    invoke-virtual {p1, v0}, Landroid/media/MediaRecorder;->setOrientationHint(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1}, Landroid/media/MediaRecorder;->prepare()V

    .line 447
    .line 448
    .line 449
    iput-object p1, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 450
    .line 451
    return-void
.end method

.method public final h(Ljava/lang/Runnable;Lyc/m;)V
    .locals 4

    .line 1
    const-string v0, "Camera"

    .line 2
    .line 3
    const-string v1, "refreshPreviewCaptureSession"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string p1, "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh."

    .line 13
    .line 14
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lyc/g;->v:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v2, p0, Lyc/g;->l:Lyc/h;

    .line 29
    .line 30
    iget-object v3, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2, v3}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_1
    move-exception p1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-interface {p2, p1}, Lyc/m;->onError(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "Camera is closed: "

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p2, p1}, Lyc/m;->onError(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_3
    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyc/g;->l:Lyc/h;

    .line 2
    .line 3
    const-string v1, "Camera"

    .line 4
    .line 5
    const-string v2, "runPrecaptureSequence"

    .line 6
    .line 7
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 11
    .line 12
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 23
    .line 24
    iget-object v3, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {v1, v3, v0, v4}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 33
    .line 34
    .line 35
    new-instance v1, Lyc/c;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v1, p0, v3}, Lyc/c;-><init>(Lyc/g;I)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {p0, v3, v1}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    iput v1, v0, Lyc/h;->b:I

    .line 47
    .line 48
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v1, v2, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 59
    .line 60
    iget-object v2, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 67
    .line 68
    invoke-virtual {v1, v2, v0, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final j(Lt6/q;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lyc/g;->u:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "setDescriptionWhileRecordingFailed"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    sget v0, Lyc/E;->a:I

    .line 9
    .line 10
    const/16 v3, 0x1a

    .line 11
    .line 12
    if-lt v0, v3, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lyc/g;->o:Lu0/w0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lu0/w0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lyc/g;->o:Lu0/w0;

    .line 26
    .line 27
    iput-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v0, "Camera"

    .line 35
    .line 36
    const-string v3, "closeCaptureSession"

    .line 37
    .line 38
    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lyc/g;->c:Lyc/G;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 54
    .line 55
    invoke-virtual {v0}, LJ3/g;->e()LIc/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v3, Lod/A0;

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    invoke-direct {v3, p0, v4}, Lod/A0;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    new-instance v4, Lyc/G;

    .line 66
    .line 67
    iget-object v5, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 68
    .line 69
    invoke-virtual {v5}, Landroid/media/MediaRecorder;->getSurface()Landroid/view/Surface;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    iget-object v6, v0, LIc/a;->b:Landroid/util/Size;

    .line 74
    .line 75
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    iget-object v0, v0, LIc/a;->b:Landroid/util/Size;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-direct {v4, v5, v6, v0, v3}, Lyc/G;-><init>(Landroid/view/Surface;IILod/A0;)V

    .line 86
    .line 87
    .line 88
    iput-object v4, p0, Lyc/g;->c:Lyc/G;

    .line 89
    .line 90
    :goto_1
    iput-object p1, p0, Lyc/g;->i:Lt6/q;

    .line 91
    .line 92
    iget-object v0, p0, Lyc/g;->f:LLc/b;

    .line 93
    .line 94
    iget v0, v0, LLc/b;->b:I

    .line 95
    .line 96
    iget-object v3, p0, Lyc/g;->h:Lmd/J;

    .line 97
    .line 98
    iget-object v4, p0, Lyc/g;->j:La9/b;

    .line 99
    .line 100
    iget-object v5, p0, Lyc/g;->k:Landroid/app/Activity;

    .line 101
    .line 102
    invoke-static {v4, p1, v5, v3, v0}, LJ3/g;->h(La9/b;Lt6/q;Landroid/app/Activity;Lmd/J;I)LJ3/g;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 107
    .line 108
    iget-object v0, p0, Lyc/g;->i:Lt6/q;

    .line 109
    .line 110
    new-instance v3, LAc/a;

    .line 111
    .line 112
    const/4 v4, 0x1

    .line 113
    invoke-direct {v3, v0, v4}, LAc/a;-><init>(Lt6/q;Z)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, LJ3/g;->a:Ljava/util/HashMap;

    .line 117
    .line 118
    const-string v0, "AUTO_FOCUS"

    .line 119
    .line 120
    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lyc/g;->i:Lt6/q;

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lyc/g;->n(Lt6/q;)V

    .line 126
    .line 127
    .line 128
    :try_start_0
    iget p1, p0, Lyc/g;->b:I

    .line 129
    .line 130
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p0, p1}, Lyc/g;->f(Ljava/lang/Integer;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :catch_0
    move-exception p1

    .line 139
    new-instance v0, Lyc/o;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {v0, v2, p1, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_3
    new-instance p1, Lyc/o;

    .line 150
    .line 151
    const-string v0, "Device does not support switching the camera while recording"

    .line 152
    .line 153
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_4
    new-instance p1, Lyc/o;

    .line 158
    .line 159
    const-string v0, "Device was not recording"

    .line 160
    .line 161
    invoke-direct {p1, v2, v0, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    throw p1
.end method

.method public final k(LPc/o;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 2
    .line 3
    iget-object v0, v0, LJ3/g;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "FLASH"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lzc/a;

    .line 12
    .line 13
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    check-cast v0, LEc/a;

    .line 17
    .line 18
    iput p2, v0, LEc/a;->b:I

    .line 19
    .line 20
    iget-object p2, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, LEc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Lkd/c;

    .line 26
    .line 27
    const/16 v0, 0x1b

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lo1/c;

    .line 33
    .line 34
    const/16 v1, 0x13

    .line 35
    .line 36
    invoke-direct {v0, p1, v1}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2, v0}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final l(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 2
    .line 3
    iget-object v0, v0, LJ3/g;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "AUTO_FOCUS"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LAc/a;

    .line 12
    .line 13
    iput p1, v0, LAc/a;->b:I

    .line 14
    .line 15
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LAc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lyc/g;->v:Z

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    invoke-static {p1}, LA/f;->f(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object p1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    const-string p1, "Camera"

    .line 39
    .line 40
    const-string v0, "[unlockAutoFocus] captureSession null, returning"

    .line 41
    .line 42
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {p0}, Lyc/g;->d()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 50
    .line 51
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    :try_start_0
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 63
    .line 64
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 71
    .line 72
    invoke-virtual {v0, v1, p1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catch_0
    move-exception v0

    .line 77
    new-instance v1, Lyc/o;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v3, "Error setting focus mode: "

    .line 82
    .line 83
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v2, "setFocusModeFailed"

    .line 98
    .line 99
    invoke-direct {v1, v2, v0, p1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_2
    invoke-virtual {p0}, Lyc/g;->q()V

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_0
    return-void
.end method

.method public final m(LPc/p;Lu0/w0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ3/g;->d()LFc/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object v1, p2, Lu0/w0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Double;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p2, Lu0/w0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/Double;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    :cond_1
    iput-object p2, v0, LFc/a;->c:Lu0/w0;

    .line 23
    .line 24
    invoke-virtual {v0}, LFc/a;->b()V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 28
    .line 29
    invoke-virtual {v0, p2}, LFc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lkd/c;

    .line 33
    .line 34
    const/16 v0, 0x19

    .line 35
    .line 36
    invoke-direct {p2, p1, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Lo1/c;

    .line 40
    .line 41
    const/16 v1, 0x10

    .line 42
    .line 43
    invoke-direct {v0, p1, v1}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p2, v0}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 50
    .line 51
    iget-object p1, p1, LJ3/g;->a:Ljava/util/HashMap;

    .line 52
    .line 53
    const-string p2, "AUTO_FOCUS"

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, LAc/a;

    .line 60
    .line 61
    iget p1, p1, LAc/a;->b:I

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lyc/g;->l(I)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final n(Lt6/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyc/g;->f:LLc/b;

    .line 2
    .line 3
    iget-object v1, v0, LLc/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lez v1, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, LLc/b;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sget v0, Lyc/E;->a:I

    .line 21
    .line 22
    const/16 v1, 0x1f

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v0, v2

    .line 30
    :goto_0
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 34
    .line 35
    invoke-virtual {v0}, LJ3/g;->e()LIc/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, LIc/a;->e:Landroid/media/EncoderProfiles;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {v0}, Le1/c;->m(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-lez v3, :cond_2

    .line 52
    .line 53
    invoke-static {v0}, Le1/c;->m(Landroid/media/EncoderProfiles;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Le1/c;->e(Ljava/lang/Object;)Landroid/media/EncoderProfiles$VideoProfile;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lyc/a;->a(Landroid/media/EncoderProfiles$VideoProfile;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v0, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    iget-object v0, p0, Lyc/g;->a:LJ3/g;

    .line 77
    .line 78
    invoke-virtual {v0}, LJ3/g;->e()LIc/a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, LIc/a;->d:Landroid/media/CamcorderProfile;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    iget v0, v0, Landroid/media/CamcorderProfile;->videoFrameRate:I

    .line 87
    .line 88
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_1
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-lez v1, :cond_4

    .line 99
    .line 100
    new-instance v1, LGc/a;

    .line 101
    .line 102
    invoke-direct {v1, p1}, LGc/a;-><init>(Lt6/q;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Landroid/util/Range;

    .line 106
    .line 107
    invoke-direct {p1, v0, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, v1, LGc/a;->b:Landroid/util/Range;

    .line 111
    .line 112
    iget-object p1, p0, Lyc/g;->a:LJ3/g;

    .line 113
    .line 114
    iget-object p1, p1, LJ3/g;->a:Ljava/util/HashMap;

    .line 115
    .line 116
    const-string v0, "FPS_RANGE"

    .line 117
    .line 118
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    :cond_4
    return-void
.end method

.method public final o(ZZ)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lyc/g;->t:Landroid/media/MediaRecorder;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/media/MediaRecorder;->getSurface()Landroid/view/Surface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    new-instance p1, Lkd/c;

    .line 18
    .line 19
    const/16 v1, 0x18

    .line 20
    .line 21
    invoke-direct {p1, p0, v1}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lyc/g;->r:LE4/n;

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p2, LE4/n;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p2, Landroid/media/ImageReader;

    .line 35
    .line 36
    invoke-virtual {p2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p2, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    new-array p2, p2, [Landroid/view/Surface;

    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, [Landroid/view/Surface;

    .line 60
    .line 61
    const/4 v0, 0x3

    .line 62
    invoke-virtual {p0, v0, p1, p2}, Lyc/g;->c(ILjava/lang/Runnable;[Landroid/view/Surface;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 8

    .line 1
    const-string v0, "Camera"

    .line 2
    .line 3
    const-string v1, "onImageAvailable"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireNextImage()Landroid/media/Image;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v2, Lpb/a;

    .line 18
    .line 19
    iget-object v5, p0, Lyc/g;->w:Ljava/io/File;

    .line 20
    .line 21
    new-instance v6, Lac/a;

    .line 22
    .line 23
    const/16 v0, 0x1a

    .line 24
    .line 25
    invoke-direct {v6, p0, v0}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    const/16 v3, 0x8

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    invoke-direct/range {v2 .. v7}, Lpb/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lyc/g;->l:Lyc/h;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput v0, p1, Lyc/h;->b:I

    .line 41
    .line 42
    return-void
.end method

.method public final p(Lyc/b;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-boolean v2, p0, Lyc/g;->u:Z

    .line 4
    .line 5
    if-eqz v2, :cond_5

    .line 6
    .line 7
    iget-object v2, p0, Lyc/g;->c:Lyc/G;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_8

    .line 12
    .line 13
    invoke-virtual {p1}, Lyc/b;->run()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v2, p0, Lyc/g;->a:LJ3/g;

    .line 18
    .line 19
    invoke-virtual {v2}, LJ3/g;->f()LJc/b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget v2, v2, LJc/b;->d:I

    .line 24
    .line 25
    iget-object v3, p0, Lyc/g;->a:LJ3/g;

    .line 26
    .line 27
    invoke-virtual {v3}, LJ3/g;->f()LJc/b;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v3, v3, LJc/b;->c:LJc/a;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    iget v2, v3, LJc/a;->e:I

    .line 38
    .line 39
    invoke-virtual {v3, v2}, LJc/a;->c(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v3, v2}, LJc/a;->c(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move v2, v1

    .line 50
    :goto_0
    iget-object v3, p0, Lyc/g;->i:Lt6/q;

    .line 51
    .line 52
    iget-object v3, v3, Lt6/q;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroid/hardware/camera2/CameraCharacteristics;

    .line 55
    .line 56
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iget v4, p0, Lyc/g;->d:I

    .line 69
    .line 70
    if-eq v3, v4, :cond_3

    .line 71
    .line 72
    add-int/lit16 v2, v2, 0xb4

    .line 73
    .line 74
    rem-int/lit16 v2, v2, 0x168

    .line 75
    .line 76
    :cond_3
    iget-object v3, p0, Lyc/g;->c:Lyc/G;

    .line 77
    .line 78
    iput v2, v3, Lyc/G;->v:I

    .line 79
    .line 80
    iget-object v2, v3, Lyc/G;->w:Ljava/lang/Object;

    .line 81
    .line 82
    monitor-enter v2

    .line 83
    :goto_1
    :try_start_0
    iget-object v4, v3, Lyc/G;->p:Landroid/view/Surface;

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    iget-object v4, v3, Lyc/G;->w:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->wait()V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    new-array v0, v0, [Landroid/view/Surface;

    .line 97
    .line 98
    aput-object v4, v0, v1

    .line 99
    .line 100
    const/4 v1, 0x3

    .line 101
    invoke-virtual {p0, v1, p1, v0}, Lyc/g;->c(ILjava/lang/Runnable;[Landroid/view/Surface;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw p1

    .line 107
    :cond_5
    iget-object v2, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 108
    .line 109
    if-eqz v2, :cond_7

    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const-string v2, "Camera"

    .line 119
    .line 120
    const-string v3, "startPreview"

    .line 121
    .line 122
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Lyc/g;->q:Landroid/media/ImageReader;

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    new-array v3, v0, [Landroid/view/Surface;

    .line 132
    .line 133
    aput-object v2, v3, v1

    .line 134
    .line 135
    invoke-virtual {p0, v0, p1, v3}, Lyc/g;->c(ILjava/lang/Runnable;[Landroid/view/Surface;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    .line 140
    .line 141
    invoke-virtual {p1}, Lyc/b;->run()V

    .line 142
    .line 143
    .line 144
    :cond_8
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    const-string v0, "Camera"

    .line 2
    .line 3
    const-string v1, "unlockAutoFocus"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "[unlockAutoFocus] captureSession null, returning"

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 19
    .line 20
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 31
    .line 32
    iget-object v2, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v0, v2, v4, v3}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 55
    .line 56
    iget-object v1, p0, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v2, p0, Lyc/g;->m:Landroid/os/Handler;

    .line 63
    .line 64
    invoke-virtual {v0, v1, v4, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    new-instance v0, Lyc/c;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p0, v1}, Lyc/c;-><init>(Lyc/g;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v4, v0}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    const-string v0, "CameraAccessException occurred while unlocking autofocus."

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_0
    iget-object v1, p0, Lyc/g;->h:Lmd/J;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Lmd/J;->w(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
