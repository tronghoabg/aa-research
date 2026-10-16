.class public final Lx4/a;
.super Lx7/l;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lx4/h;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lx4/b;


# direct methods
.method public constructor <init>(Lx4/b;Lx4/h;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx4/a;->c:Lx4/b;

    .line 5
    .line 6
    iput-object p2, p0, Lx4/a;->a:Lx4/h;

    .line 7
    .line 8
    iput-object p3, p0, Lx4/a;->b:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final declared-synchronized onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget p1, p1, Lcom/google/android/gms/location/LocationAvailability;->d:I

    .line 3
    .line 4
    const/16 v0, 0x3e8

    .line 5
    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lx4/a;->c:Lx4/b;

    .line 14
    .line 15
    iget-object v0, p0, Lx4/a;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lwg/b;->a(Landroid/content/Context;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lx4/a;->c:Lx4/b;

    .line 27
    .line 28
    iget-object p1, p1, Lx4/b;->g:Lw4/a;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    invoke-interface {p1, v0}, Lw4/a;->onError(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public final declared-synchronized onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lx4/a;->c:Lx4/b;

    .line 3
    .line 4
    iget-object v0, v0, Lx4/b;->h:Lx4/l;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const-string p1, "FlutterGeolocator"

    .line 9
    .line 10
    const-string v0, "LocationCallback was called with empty locationResult or no positionChangedCallback was registered."

    .line 11
    .line 12
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lx4/a;->c:Lx4/b;

    .line 16
    .line 17
    iget-object v0, p1, Lx4/b;->c:Lcom/google/android/gms/internal/location/zzbi;

    .line 18
    .line 19
    iget-object p1, p1, Lx4/b;->b:Lx4/a;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Lx7/h;->removeLocationUpdates(Lx7/l;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lx4/a;->c:Lx4/b;

    .line 25
    .line 26
    iget-object p1, p1, Lx4/b;->g:Lw4/a;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    invoke-interface {p1, v0}, Lw4/a;->onError(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :cond_1
    :try_start_1
    iget-object p1, p1, Lcom/google/android/gms/location/LocationResult;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    add-int/lit8 v0, v0, -0x1

    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Landroid/location/Location;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    :goto_1
    if-nez p1, :cond_3

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object v0, p0, Lx4/a;->a:Lx4/h;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "geolocator_use_mslAltitude"

    .line 81
    .line 82
    iget-object v2, p0, Lx4/a;->a:Lx4/h;

    .line 83
    .line 84
    iget-boolean v2, v2, Lx4/h;->d:Z

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    :cond_5
    iget-object v0, p0, Lx4/a;->c:Lx4/b;

    .line 90
    .line 91
    iget-object v0, v0, Lx4/b;->d:Lx4/k;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Lx4/k;->a(Landroid/location/Location;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lx4/a;->c:Lx4/b;

    .line 97
    .line 98
    iget-object v0, v0, Lx4/b;->h:Lx4/l;

    .line 99
    .line 100
    invoke-interface {v0, p1}, Lx4/l;->a(Landroid/location/Location;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    .line 103
    monitor-exit p0

    .line 104
    return-void

    .line 105
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    throw p1
.end method
