.class public final Lyc/d;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:LIc/a;

.field public final synthetic b:Lyc/g;


# direct methods
.method public constructor <init>(Lyc/g;LIc/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc/d;->b:Lyc/g;

    .line 2
    .line 3
    iput-object p2, p0, Lyc/d;->a:LIc/a;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    .line 1
    const-string p1, "open | onClosed"

    .line 2
    .line 3
    const-string v0, "Camera"

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lyc/d;->b:Lyc/g;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p1, Lyc/g;->o:Lu0/w0;

    .line 12
    .line 13
    iget-object v2, p1, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const-string v2, "closeCaptureSession"

    .line 18
    .line 19
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p1, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 28
    .line 29
    :cond_0
    iget-object p1, p1, Lyc/g;->h:Lmd/J;

    .line 30
    .line 31
    new-instance v0, Lkd/c;

    .line 32
    .line 33
    const/16 v1, 0x1c

    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Lmd/J;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    .line 1
    const-string p1, "Camera"

    .line 2
    .line 3
    const-string v0, "open | onDisconnected"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lyc/d;->b:Lyc/g;

    .line 9
    .line 10
    invoke-virtual {p1}, Lyc/g;->a()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, Lyc/g;->h:Lmd/J;

    .line 14
    .line 15
    const-string v0, "The camera was disconnected."

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lmd/J;->w(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 1

    .line 1
    const-string p1, "Camera"

    .line 2
    .line 3
    const-string v0, "open | onError"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lyc/d;->b:Lyc/g;

    .line 9
    .line 10
    invoke-virtual {p1}, Lyc/g;->a()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p2, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p2, v0, :cond_3

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p2, v0, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-eq p2, v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    if-eq p2, v0, :cond_0

    .line 27
    .line 28
    const-string p2, "Unknown camera error"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p2, "The camera service has encountered a fatal error."

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p2, "The camera device has encountered a fatal error"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const-string p2, "The camera device could not be opened due to a device policy."

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const-string p2, "Max cameras in use"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    const-string p2, "The camera device is in use already."

    .line 44
    .line 45
    :goto_0
    iget-object p1, p1, Lyc/g;->h:Lmd/J;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lmd/J;->w(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    .line 1
    new-instance v0, Lu0/w0;

    .line 2
    .line 3
    iget-object v1, p0, Lyc/d;->b:Lyc/g;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lu0/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, v1, Lyc/g;->o:Lu0/w0;

    .line 9
    .line 10
    :try_start_0
    iget-boolean p1, v1, Lyc/g;->u:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lyc/d;->a:LIc/a;

    .line 17
    .line 18
    new-instance v0, Lyc/b;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v0, v2, p0, p1}, Lyc/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    invoke-virtual {v1, p1}, Lyc/g;->p(Lyc/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, " occurred while opening camera."

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_1
    iget-object v0, v1, Lyc/g;->h:Lmd/J;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lmd/J;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Lyc/g;->a()V

    .line 61
    .line 62
    .line 63
    return-void
.end method
