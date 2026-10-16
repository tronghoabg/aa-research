.class public final LQ3/h;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ3/h;->a:I

    iput-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, LQ3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LVa/Y7;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, LVa/Y7;->i(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lnd/b;

    .line 22
    .line 23
    iget-object p1, p1, Lnd/b;->a:Lmd/S;

    .line 24
    .line 25
    invoke-virtual {p1}, Lmd/S;->j()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    iget-object v0, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LDd/c;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-static {v0, p1, v1}, LDd/c;->y(LDd/c;Landroid/net/Network;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    iget-object v0, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LWb/a;

    .line 41
    .line 42
    iget-object v1, v0, LWb/a;->b:Lxa/d;

    .line 43
    .line 44
    iget-object v1, v1, Lxa/d;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v1, LT3/r;

    .line 57
    .line 58
    const/16 v2, 0x13

    .line 59
    .line 60
    invoke-direct {v1, v2, v0, p1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v0, LWb/a;->d:Landroid/os/Handler;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 1

    .line 1
    iget v0, p0, LQ3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    if-nez p2, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lnd/b;

    .line 15
    .line 16
    iget-object p1, p1, Lnd/b;->a:Lmd/S;

    .line 17
    .line 18
    invoke-virtual {p1}, Lmd/S;->j()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    .line 1
    iget v0, p0, LQ3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LWb/a;

    .line 13
    .line 14
    iget-object v0, p1, LWb/a;->b:Lxa/d;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance v0, LT3/r;

    .line 24
    .line 25
    const/16 v1, 0x13

    .line 26
    .line 27
    invoke-direct {v0, v1, p1, p2}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, LWb/a;->d:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    const-string v0, "network"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "capabilities"

    .line 42
    .line 43
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v0, LQ3/j;->a:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v2, "Network capabilities changed: "

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p1, v0, p2}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LQ3/i;

    .line 72
    .line 73
    iget-object p2, p1, LQ3/i;->f:Landroid/net/ConnectivityManager;

    .line 74
    .line 75
    invoke-static {p2}, LQ3/j;->a(Landroid/net/ConnectivityManager;)LO3/a;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p1, p2}, LQ3/f;->c(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 3

    .line 1
    iget v0, p0, LQ3/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LVa/Y7;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, LVa/Y7;->i(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_2
    iget-object v0, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LDd/c;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v0, p1, v1}, LDd/c;->y(LDd/c;Landroid/net/Network;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_3
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, LWb/a;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v0, LC8/g;

    .line 36
    .line 37
    const/16 v1, 0x16

    .line 38
    .line 39
    invoke-direct {v0, p1, v1}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, LWb/a;->d:Landroid/os/Handler;

    .line 43
    .line 44
    const-wide/16 v1, 0x1f4

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    const-string v0, "network"

    .line 51
    .line 52
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, LQ3/j;->a:Ljava/lang/String;

    .line 60
    .line 61
    const-string v1, "Network connection lost"

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, LQ3/h;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, LQ3/i;

    .line 69
    .line 70
    iget-object v0, p1, LQ3/i;->f:Landroid/net/ConnectivityManager;

    .line 71
    .line 72
    invoke-static {v0}, LQ3/j;->a(Landroid/net/ConnectivityManager;)LO3/a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v0}, LQ3/f;->c(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
