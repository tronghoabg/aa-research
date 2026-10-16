.class public final LJc/b;
.super Lzc/a;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Integer;

.field public final c:LJc/a;

.field public d:I


# direct methods
.method public constructor <init>(Lt6/q;Landroid/app/Activity;Lmd/J;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, p0, LJc/b;->b:Ljava/lang/Integer;

    .line 10
    .line 11
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 12
    .line 13
    iget-object p1, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, LJc/b;->b:Ljava/lang/Integer;

    .line 27
    .line 28
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    :cond_0
    iget-object p1, p0, LJc/b;->b:Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    new-instance v1, LJc/a;

    .line 50
    .line 51
    invoke-direct {v1, p2, p3, v0, p1}, LJc/a;-><init>(Landroid/app/Activity;Lmd/J;ZI)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, LJc/b;->c:LJc/a;

    .line 55
    .line 56
    iget-object p1, v1, LJc/a;->f:LA7/V1;

    .line 57
    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    new-instance p1, LA7/V1;

    .line 62
    .line 63
    const/4 p3, 0x4

    .line 64
    invoke-direct {p1, v1, p3}, LA7/V1;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    iput-object p1, v1, LJc/a;->f:LA7/V1;

    .line 68
    .line 69
    sget-object p3, LJc/a;->g:Landroid/content/IntentFilter;

    .line 70
    .line 71
    invoke-virtual {p2, p1, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    iget-object p1, v1, LJc/a;->f:LA7/V1;

    .line 75
    .line 76
    const/4 p3, 0x0

    .line 77
    invoke-virtual {p1, p2, p3}, LA7/V1;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 0

    .line 1
    return-void
.end method
