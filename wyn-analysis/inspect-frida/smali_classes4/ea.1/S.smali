.class public final Lea/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lea/S;->a:I

    iput-object p1, p0, Lea/S;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lea/S;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iget v2, p0, Lea/S;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    instance-of p1, p2, Lv4/a;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p2, Lv4/a;

    .line 14
    .line 15
    iget-object p1, p2, Lv4/a;->a:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 16
    .line 17
    check-cast v1, Lv4/b;

    .line 18
    .line 19
    iput-object p1, v1, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 20
    .line 21
    iget-object p2, v1, Lv4/b;->b:Lx4/c;

    .line 22
    .line 23
    iput-object p2, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 24
    .line 25
    iget p2, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 26
    .line 27
    add-int/2addr p2, v0

    .line 28
    iput p2, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 29
    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v0, "Flutter engine connected. Connected engine count "

    .line 33
    .line 34
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string v0, "FlutterGeolocator"

    .line 47
    .line 48
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    iget-object p2, v1, Lv4/b;->f:Lv4/d;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    iput-object p1, p2, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 56
    .line 57
    :cond_0
    return-void

    .line 58
    :pswitch_0
    check-cast v1, Li8/d;

    .line 59
    .line 60
    iget-object v2, v1, Li8/d;->b:Li8/y;

    .line 61
    .line 62
    new-array v0, v0, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    aput-object p1, v0, v3

    .line 66
    .line 67
    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    .line 68
    .line 69
    invoke-virtual {v2, p1, v0}, Li8/y;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Li8/b;

    .line 73
    .line 74
    invoke-direct {p1, p0, p2}, Li8/b;-><init>(Lea/S;Landroid/os/IBinder;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Li8/d;->a()Landroid/os/Handler;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v0, "Connected to SessionLifecycleService. Queue size "

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    check-cast v1, LW9/u;

    .line 93
    .line 94
    iget-object v0, v1, LW9/u;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->size()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    const-string v0, "SessionLifecycleClient"

    .line 110
    .line 111
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    new-instance p1, Landroid/os/Messenger;

    .line 115
    .line 116
    invoke-direct {p1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, v1, LW9/u;->b:Ljava/lang/Object;

    .line 120
    .line 121
    new-instance p1, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object p2, v1, LW9/u;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p2, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->drainTo(Ljava/util/Collection;)I

    .line 131
    .line 132
    .line 133
    iget-object p2, v1, LW9/u;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p2, Ljf/h;

    .line 136
    .line 137
    invoke-static {p2}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    new-instance v0, Lea/Q;

    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    invoke-direct {v0, v1, p1, v2}, Lea/Q;-><init>(LW9/u;Ljava/util/ArrayList;Ljf/c;)V

    .line 145
    .line 146
    .line 147
    const/4 p1, 0x3

    .line 148
    invoke-static {p2, v2, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lea/S;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget v3, p0, Lea/S;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lv4/b;

    .line 11
    .line 12
    iget-object p1, v2, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 17
    .line 18
    iput-object v1, v2, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    check-cast v2, Li8/d;

    .line 22
    .line 23
    iget-object v1, v2, Li8/d;->b:Li8/y;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    new-array v3, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    .line 31
    .line 32
    invoke-virtual {v1, p1, v3}, Li8/y;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Li8/c;

    .line 36
    .line 37
    invoke-direct {p1, p0, v0}, Li8/c;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Li8/d;->a()Landroid/os/Handler;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    const-string p1, "SessionLifecycleClient"

    .line 49
    .line 50
    const-string v0, "Disconnected from SessionLifecycleService"

    .line 51
    .line 52
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    check-cast v2, LW9/u;

    .line 56
    .line 57
    iput-object v1, v2, LW9/u;->b:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
