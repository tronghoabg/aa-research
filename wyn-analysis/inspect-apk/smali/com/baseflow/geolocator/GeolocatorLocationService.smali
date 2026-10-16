.class public Lcom/baseflow/geolocator/GeolocatorLocationService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:Lv4/a;

.field public b:Z

.field public c:I

.field public d:I

.field public e:Landroid/app/Activity;

.field public f:Lx4/c;

.field public g:Lx4/e;

.field public h:Landroid/os/PowerManager$WakeLock;

.field public i:Landroid/net/wifi/WifiManager$WifiLock;

.field public j:Lt6/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv4/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lv4/a;-><init>(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->a:Lv4/a;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->b:Z

    .line 13
    .line 14
    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 15
    .line 16
    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v0, "FlutterGeolocator"

    .line 6
    .line 7
    const-string v1, "Stop service in foreground."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, Lu6/u;->i(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->c()V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->b:Z

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final b(Lu0/a0;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->c()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lu0/a0;->b:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "power"

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/os/PowerManager;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const-string v3, "GeolocatorLocationService:Wakelock"

    .line 25
    .line 26
    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-boolean p1, p1, Lu0/a0;->a:Z

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "wifi"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Landroid/net/wifi/WifiManager;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v2, 0x1d

    .line 61
    .line 62
    if-ge v0, v2, :cond_1

    .line 63
    .line 64
    const/4 v0, 0x3

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 v0, 0x4

    .line 67
    :goto_0
    const-string v2, "GeolocatorLocationService:WifiLock"

    .line 68
    .line 69
    invoke-virtual {p1, v0, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Landroid/os/PowerManager$WakeLock;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Landroid/net/wifi/WifiManager$WifiLock;

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    const-string p1, "FlutterGeolocator"

    .line 2
    .line 3
    const-string v0, "Binding to location service."

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->a:Lv4/a;

    .line 9
    .line 10
    return-object p1
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    const-string v0, "FlutterGeolocator"

    .line 5
    .line 6
    const-string v1, "Creating service."

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    const-string v0, "FlutterGeolocator"

    .line 2
    .line 3
    const-string v1, "Destroying location service."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    iput v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 13
    .line 14
    const-string v1, "Stopping location service."

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->g:Lx4/e;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v2, v2, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-interface {v1}, Lx4/e;->e()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->a()V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 40
    .line 41
    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 42
    .line 43
    const-string v1, "Destroyed location service."

    .line 44
    .line 45
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onUnbind(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    const-string v0, "FlutterGeolocator"

    .line 2
    .line 3
    const-string v1, "Unbinding from location service."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method
