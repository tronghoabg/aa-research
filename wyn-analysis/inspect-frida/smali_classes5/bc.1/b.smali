.class public final Lbc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/hardware/SensorManager;

.field public c:I

.field public final d:Landroid/hardware/Sensor;

.field public e:Luc/h;


# direct methods
.method public constructor <init>(Landroid/hardware/SensorManager;II)V
    .locals 0

    .line 1
    iput p3, p0, Lbc/b;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p3, "sensorManager"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    iput p3, p0, Lbc/b;->c:I

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lbc/b;->d:Landroid/hardware/Sensor;

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    const-string p3, "sensorManager"

    .line 27
    .line 28
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 35
    .line 36
    const/4 p3, 0x1

    .line 37
    iput p3, p0, Lbc/b;->c:I

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lbc/b;->d:Landroid/hardware/Sensor;

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final a(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    .line 1
    iput p1, p0, Lbc/b;->c:I

    .line 2
    .line 3
    iget-object v0, p0, Lbc/b;->e:Luc/h;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lbc/b;->d:Landroid/hardware/Sensor;

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1, p1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    iget p1, p0, Lbc/b;->a:I

    return-void
.end method

.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget p1, p0, Lbc/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lbc/b;->e:Luc/h;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object p1, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lbc/b;->e:Luc/h;

    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 1

    .line 1
    iget p1, p0, Lbc/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lbc/b;->d:Landroid/hardware/Sensor;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p2, Luc/h;

    .line 11
    .line 12
    iput-object p2, p0, Lbc/b;->e:Luc/h;

    .line 13
    .line 14
    iget-object p2, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 15
    .line 16
    iget v0, p0, Lbc/b;->c:I

    .line 17
    .line 18
    invoke-virtual {p2, p0, p1, v0}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p0, Lbc/b;->d:Landroid/hardware/Sensor;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    check-cast p2, Luc/h;

    .line 27
    .line 28
    iput-object p2, p0, Lbc/b;->e:Luc/h;

    .line 29
    .line 30
    iget-object p2, p0, Lbc/b;->b:Landroid/hardware/SensorManager;

    .line 31
    .line 32
    iget v0, p0, Lbc/b;->c:I

    .line 33
    .line 34
    invoke-virtual {p2, p0, p1, v0}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    iget v5, p0, Lbc/b;->a:I

    .line 7
    .line 8
    packed-switch v5, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v5, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 15
    .line 16
    aget v5, v5, v4

    .line 17
    .line 18
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    iget-object v6, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 23
    .line 24
    aget v6, v6, v3

    .line 25
    .line 26
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iget-object v7, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 31
    .line 32
    aget v7, v7, v2

    .line 33
    .line 34
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iget-wide v8, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 39
    .line 40
    long-to-double v8, v8

    .line 41
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    aput-object v5, v1, v4

    .line 48
    .line 49
    aput-object v6, v1, v3

    .line 50
    .line 51
    aput-object v7, v1, v2

    .line 52
    .line 53
    aput-object p1, v1, v0

    .line 54
    .line 55
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lbc/b;->e:Luc/h;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :pswitch_0
    new-array v5, v1, [F

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 73
    .line 74
    invoke-static {v5, p1}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lbc/b;->e:Luc/h;

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    aget v6, v5, v3

    .line 82
    .line 83
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    aget v7, v5, v2

    .line 88
    .line 89
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    aget v8, v5, v0

    .line 94
    .line 95
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    aget v5, v5, v4

    .line 100
    .line 101
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    new-array v1, v1, [Ljava/lang/Float;

    .line 106
    .line 107
    aput-object v6, v1, v4

    .line 108
    .line 109
    aput-object v7, v1, v3

    .line 110
    .line 111
    aput-object v8, v1, v2

    .line 112
    .line 113
    aput-object v5, v1, v0

    .line 114
    .line 115
    invoke-static {v1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p1, v0}, Luc/h;->a(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
