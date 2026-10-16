.class public final LWb/a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lxa/d;

.field public c:Luc/h;

.field public final d:Landroid/os/Handler;

.field public e:LQ3/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lxa/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LWb/a;->d:Landroid/os/Handler;

    .line 14
    .line 15
    iput-object p1, p0, LWb/a;->a:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, LWb/a;->b:Lxa/d;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LWb/a;->e:LQ3/h;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LWb/a;->b:Lxa/d;

    .line 12
    .line 13
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, LWb/a;->e:LQ3/h;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_0
    iget-object p1, p0, LWb/a;->a:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    :cond_1
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 1

    .line 1
    check-cast p2, Luc/h;

    .line 2
    .line 3
    iput-object p2, p0, LWb/a;->c:Luc/h;

    .line 4
    .line 5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 p2, 0x18

    .line 8
    .line 9
    iget-object v0, p0, LWb/a;->b:Lxa/d;

    .line 10
    .line 11
    if-lt p1, p2, :cond_0

    .line 12
    .line 13
    new-instance p1, LQ3/h;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p1, p0, p2}, LQ3/h;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LWb/a;->e:LQ3/h;

    .line 20
    .line 21
    iget-object p2, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Landroid/net/ConnectivityManager;

    .line 24
    .line 25
    invoke-static {p2, p1}, LW1/p;->v(Landroid/net/ConnectivityManager;LQ3/h;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Landroid/content/IntentFilter;

    .line 30
    .line 31
    const-string p2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 32
    .line 33
    invoke-direct {p1, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, LWb/a;->a:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {p2, p0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p1, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, LT3/r;

    .line 58
    .line 59
    const/16 v0, 0x13

    .line 60
    .line 61
    invoke-direct {p2, v0, p0, p1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, LWb/a;->d:Landroid/os/Handler;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p1, p0, LWb/a;->c:Luc/h;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, LWb/a;->b:Lxa/d;

    .line 6
    .line 7
    iget-object p2, p2, Lxa/d;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Luc/h;->a(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
