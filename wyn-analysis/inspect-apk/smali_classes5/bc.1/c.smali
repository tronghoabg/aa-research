.class public final Lbc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/hardware/SensorManager;

.field public final c:Landroid/hardware/Sensor;

.field public d:Luc/h;

.field public e:D


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/hardware/SensorManager;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sensorManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lbc/c;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lbc/c;->b:Landroid/hardware/SensorManager;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p2, p1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lbc/c;->c:Landroid/hardware/Sensor;

    .line 24
    .line 25
    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    .line 26
    .line 27
    iput-wide p1, p0, Lbc/c;->e:D

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lbc/c;->b:Landroid/hardware/SensorManager;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lbc/c;->d:Luc/h;

    .line 8
    .line 9
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 1

    .line 1
    check-cast p2, Luc/h;

    .line 2
    .line 3
    iput-object p2, p0, Lbc/c;->d:Luc/h;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    iget-object p2, p0, Lbc/c;->b:Landroid/hardware/SensorManager;

    .line 7
    .line 8
    iget-object v0, p0, Lbc/c;->c:Landroid/hardware/Sensor;

    .line 9
    .line 10
    invoke-virtual {p2, p0, v0, p1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lbc/c;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "window"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroid/view/WindowManager;

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eq p1, v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    if-eq p1, v2, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    if-eq p1, v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-wide v0, -0x3fa9800000000000L    # -90.0

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-wide v0, 0x4066800000000000L    # 180.0

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-wide v0, 0x4056800000000000L    # 90.0

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_0
    iget-wide v2, p0, Lbc/c;->e:D

    .line 56
    .line 57
    cmpg-double p1, v0, v2

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    iget-object p1, p0, Lbc/c;->d:Luc/h;

    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p1, v2}, Luc/h;->a(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_5
    iput-wide v0, p0, Lbc/c;->e:D

    .line 74
    .line 75
    return-void
.end method
