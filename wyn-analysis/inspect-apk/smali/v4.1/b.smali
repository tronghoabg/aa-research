.class public Lv4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public final a:Ly4/a;

.field public final b:Lx4/c;

.field public final c:Lx4/d;

.field public d:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field public e:LD6/o;

.field public f:Lv4/d;

.field public final g:Lea/S;

.field public h:LVc/d;

.field public i:Lrc/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lea/S;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Lea/S;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lv4/b;->g:Lea/S;

    .line 11
    .line 12
    const-class v0, Ly4/a;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    sget-object v1, Ly4/a;->d:Ly4/a;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ly4/a;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v1, Ly4/a;->d:Ly4/a;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    sget-object v1, Ly4/a;->d:Ly4/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    iput-object v1, p0, Lv4/b;->a:Ly4/a;

    .line 33
    .line 34
    invoke-static {}, Lx4/c;->b()Lx4/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lv4/b;->b:Lx4/c;

    .line 39
    .line 40
    invoke-static {}, Lx4/d;->y()Lx4/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lv4/b;->c:Lx4/d;

    .line 45
    .line 46
    return-void

    .line 47
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v1
.end method


# virtual methods
.method public final onAttachedToActivity(Lrc/b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lv4/b;->i:Lrc/b;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv4/b;->b:Lx4/c;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lq/s1;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lq/s1;->b(Luc/t;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lv4/b;->i:Lrc/b;

    .line 14
    .line 15
    iget-object v1, p0, Lv4/b;->a:Ly4/a;

    .line 16
    .line 17
    check-cast v0, Lq/s1;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lq/s1;->d(Luc/v;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lv4/b;->e:LD6/o;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Lq/s1;

    .line 28
    .line 29
    iget-object v1, v1, Lq/s1;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/app/Activity;

    .line 32
    .line 33
    iput-object v1, v0, LD6/o;->f:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lv4/b;->f:Lv4/d;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p1, Lq/s1;

    .line 40
    .line 41
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Landroid/app/Activity;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    iget-object v1, v0, Lv4/d;->g:Lx4/e;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object v1, v0, Lv4/d;->b:Luc/j;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Lv4/d;->b()V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object p1, v0, Lv4/d;->d:Landroid/app/Activity;

    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lv4/b;->i:Lrc/b;

    .line 65
    .line 66
    check-cast v0, Lq/s1;

    .line 67
    .line 68
    iget-object v0, v0, Lq/s1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Landroid/app/Activity;

    .line 71
    .line 72
    iput-object v0, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 8

    .line 1
    new-instance v0, LD6/o;

    .line 2
    .line 3
    iget-object v1, p0, Lv4/b;->a:Ly4/a;

    .line 4
    .line 5
    iget-object v2, p0, Lv4/b;->b:Lx4/c;

    .line 6
    .line 7
    iget-object v3, p0, Lv4/b;->c:Lx4/d;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LD6/o;-><init>(Ly4/a;Lx4/c;Lx4/d;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lv4/b;->e:LD6/o;

    .line 13
    .line 14
    iget-object v3, p1, Lqc/a;->a:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v4, v0, LD6/o;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Luc/r;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    const-string v4, "Setting a method call handler before the last was disposed."

    .line 24
    .line 25
    const-string v6, "MethodCallHandlerImpl"

    .line 26
    .line 27
    invoke-static {v6, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v4, v0, LD6/o;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Luc/r;

    .line 33
    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    const-string v4, "Tried to stop listening when no MethodChannel had been initialized."

    .line 37
    .line 38
    invoke-static {v6, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v4, v5}, Luc/r;->b(Luc/p;)V

    .line 43
    .line 44
    .line 45
    iput-object v5, v0, LD6/o;->g:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_1
    :goto_0
    new-instance v4, Luc/r;

    .line 48
    .line 49
    iget-object v6, p1, Lqc/a;->c:Luc/f;

    .line 50
    .line 51
    const-string v7, "flutter.baseflow.com/geolocator_android"

    .line 52
    .line 53
    invoke-direct {v4, v6, v7}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object v4, v0, LD6/o;->g:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v4, v0}, Luc/r;->b(Luc/p;)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v0, LD6/o;->e:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v0, Lv4/d;

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, Lv4/d;-><init>(Ly4/a;Lx4/c;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lv4/b;->f:Lv4/d;

    .line 69
    .line 70
    iget-object v1, v0, Lv4/d;->b:Luc/j;

    .line 71
    .line 72
    const-string v2, "Setting a event call handler before the last was disposed."

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    const-string v1, "FlutterGeolocator"

    .line 77
    .line 78
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lv4/d;->b()V

    .line 82
    .line 83
    .line 84
    :cond_2
    new-instance v1, Luc/j;

    .line 85
    .line 86
    const-string v3, "flutter.baseflow.com/geolocator_updates_android"

    .line 87
    .line 88
    invoke-direct {v1, v6, v3}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object v1, v0, Lv4/d;->b:Luc/j;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Luc/j;->a(Luc/i;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 97
    .line 98
    iput-object p1, v0, Lv4/d;->c:Landroid/content/Context;

    .line 99
    .line 100
    new-instance v0, LVc/d;

    .line 101
    .line 102
    invoke-direct {v0}, LVc/d;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lv4/b;->h:LVc/d;

    .line 106
    .line 107
    iput-object p1, v0, LVc/d;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v1, v0, LVc/d;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Luc/j;

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    const-string v1, "LocationServiceHandler"

    .line 116
    .line 117
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    iget-object v1, v0, LVc/d;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Luc/j;

    .line 123
    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    iget-object v1, v0, LVc/d;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Landroid/content/Context;

    .line 130
    .line 131
    if-eqz v1, :cond_4

    .line 132
    .line 133
    iget-object v2, v0, LVc/d;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Lx4/i;

    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    iget-object v1, v0, LVc/d;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Luc/j;

    .line 145
    .line 146
    invoke-virtual {v1, v5}, Luc/j;->a(Luc/i;)V

    .line 147
    .line 148
    .line 149
    iput-object v5, v0, LVc/d;->b:Ljava/lang/Object;

    .line 150
    .line 151
    :cond_5
    :goto_1
    new-instance v1, Luc/j;

    .line 152
    .line 153
    const-string v2, "flutter.baseflow.com/geolocator_service_updates_android"

    .line 154
    .line 155
    invoke-direct {v1, v6, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iput-object v1, v0, LVc/d;->b:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Luc/j;->a(Luc/i;)V

    .line 161
    .line 162
    .line 163
    iput-object p1, v0, LVc/d;->c:Ljava/lang/Object;

    .line 164
    .line 165
    new-instance v0, Landroid/content/Intent;

    .line 166
    .line 167
    const-class v1, Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 168
    .line 169
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, p0, Lv4/b;->g:Lea/S;

    .line 173
    .line 174
    const/4 v2, 0x1

    .line 175
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv4/b;->i:Lrc/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lv4/b;->b:Lx4/c;

    .line 6
    .line 7
    check-cast v0, Lq/s1;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lq/s1;->m(Luc/t;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lv4/b;->i:Lrc/b;

    .line 13
    .line 14
    check-cast v0, Lq/s1;

    .line 15
    .line 16
    iget-object v0, v0, Lq/s1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/HashSet;

    .line 19
    .line 20
    iget-object v1, p0, Lv4/b;->a:Ly4/a;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lv4/b;->e:LD6/o;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iput-object v1, v0, LD6/o;->f:Ljava/lang/Object;

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lv4/b;->f:Lv4/d;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget-object v2, v0, Lv4/d;->g:Lx4/e;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, v0, Lv4/d;->b:Luc/j;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lv4/d;->b()V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object v1, v0, Lv4/d;->d:Landroid/app/Activity;

    .line 48
    .line 49
    :cond_3
    iget-object v0, p0, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iput-object v1, v0, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 54
    .line 55
    :cond_4
    iget-object v0, p0, Lv4/b;->i:Lrc/b;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iput-object v1, p0, Lv4/b;->i:Lrc/b;

    .line 60
    .line 61
    :cond_5
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv4/b;->onDetachedFromActivity()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v0, p0, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    iput v1, v0, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Flutter engine disconnected. Connected engine count "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget v0, v0, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FlutterGeolocator"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lv4/b;->g:Lea/S;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lv4/b;->e:LD6/o;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object v1, p1, LD6/o;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Luc/r;

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    const-string p1, "MethodCallHandlerImpl"

    .line 51
    .line 52
    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    .line 53
    .line 54
    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p1, LD6/o;->g:Ljava/lang/Object;

    .line 62
    .line 63
    :goto_0
    iget-object p1, p0, Lv4/b;->e:LD6/o;

    .line 64
    .line 65
    iput-object v0, p1, LD6/o;->f:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v0, p0, Lv4/b;->e:LD6/o;

    .line 68
    .line 69
    :cond_2
    iget-object p1, p0, Lv4/b;->f:Lv4/d;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1}, Lv4/d;->b()V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lv4/b;->f:Lv4/d;

    .line 77
    .line 78
    iput-object v0, p1, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 79
    .line 80
    iput-object v0, p0, Lv4/b;->f:Lv4/d;

    .line 81
    .line 82
    :cond_3
    iget-object p1, p0, Lv4/b;->h:LVc/d;

    .line 83
    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    iput-object v0, p1, LVc/d;->c:Ljava/lang/Object;

    .line 87
    .line 88
    iget-object v1, p1, LVc/d;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Luc/j;

    .line 91
    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v1, p1, LVc/d;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Luc/j;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, Luc/j;->a(Luc/i;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p1, LVc/d;->b:Ljava/lang/Object;

    .line 103
    .line 104
    :goto_1
    iput-object v0, p0, Lv4/b;->h:LVc/d;

    .line 105
    .line 106
    :cond_5
    iget-object p1, p0, Lv4/b;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 107
    .line 108
    if-eqz p1, :cond_6

    .line 109
    .line 110
    iput-object v0, p1, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lv4/b;->onAttachedToActivity(Lrc/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
