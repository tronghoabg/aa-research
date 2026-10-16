.class public final Lyc/e;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lyc/g;


# direct methods
.method public constructor <init>(Lyc/g;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc/e;->c:Lyc/g;

    .line 2
    .line 3
    iput-object p2, p0, Lyc/e;->b:Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lyc/e;->a:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 1
    const-string p1, "Camera"

    .line 2
    .line 3
    const-string v0, "CameraCaptureSession onClosed"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lyc/e;->a:Z

    .line 10
    .line 11
    return-void
.end method

.method public final onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 1
    const-string p1, "Camera"

    .line 2
    .line 3
    const-string v0, "CameraCaptureSession onConfigureFailed"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lyc/e;->c:Lyc/g;

    .line 9
    .line 10
    iget-object p1, p1, Lyc/g;->h:Lmd/J;

    .line 11
    .line 12
    const-string v0, "Failed to configure camera session."

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lmd/J;->w(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 3

    .line 1
    const-string v0, "Camera"

    .line 2
    .line 3
    const-string v1, "CameraCaptureSession onConfigured"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyc/e;->c:Lyc/g;

    .line 9
    .line 10
    iget-object v2, v1, Lyc/g;->o:Lu0/w0;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-boolean v2, p0, Lyc/e;->a:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iput-object p1, v1, Lyc/g;->p:Landroid/hardware/camera2/CameraCaptureSession;

    .line 20
    .line 21
    const-string p1, "Updating builder settings"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    iget-object p1, v1, Lyc/g;->s:Landroid/hardware/camera2/CaptureRequest$Builder;

    .line 27
    .line 28
    iget-object v0, v1, Lyc/g;->a:LJ3/g;

    .line 29
    .line 30
    iget-object v0, v0, LJ3/g;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lzc/a;

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Lzc/a;->a(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p1, Lo1/c;

    .line 57
    .line 58
    const/16 v0, 0x14

    .line 59
    .line 60
    invoke-direct {p1, p0, v0}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lyc/e;->b:Ljava/lang/Runnable;

    .line 64
    .line 65
    invoke-virtual {v1, v0, p1}, Lyc/g;->h(Ljava/lang/Runnable;Lyc/m;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    :goto_1
    iget-object p1, v1, Lyc/g;->h:Lmd/J;

    .line 70
    .line 71
    const-string v0, "The camera was closed during configuration."

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lmd/J;->w(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
