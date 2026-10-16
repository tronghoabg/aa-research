.class public final Lad/G;
.super LI6/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad/H;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lad/G;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Lad/G;->a:I

    iput-object p1, p0, Lad/G;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 2

    .line 1
    iget v0, p0, Lad/G;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/d;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 11
    .line 12
    invoke-virtual {p1}, Lx6/l;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget p1, p1, Lx6/a;->a:I

    .line 17
    .line 18
    invoke-interface {v0, p1, v1}, Lcom/unity3d/scar/adapter/common/d;->onAdFailedToLoad(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/h;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 27
    .line 28
    invoke-virtual {p1}, Lx6/l;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget p1, p1, Lx6/a;->a:I

    .line 33
    .line 34
    invoke-interface {v0, p1, v1}, Lcom/unity3d/scar/adapter/common/d;->onAdFailedToLoad(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lad/H;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v1, Lad/f;

    .line 58
    .line 59
    invoke-direct {v1, p1}, Lad/f;-><init>(Lx6/l;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v0, Lad/H;->b:LG9/e;

    .line 63
    .line 64
    iget v0, v0, Lad/i;->a:I

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, LG9/e;->y(ILad/f;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdLoaded(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lad/G;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LI6/a;

    .line 7
    .line 8
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lvb/d;

    .line 11
    .line 12
    iget-object v1, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lvb/d;->e:Lrb/g;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, LI6/a;->setFullScreenContentCallback(Lx6/k;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lvb/d;->b:Lvb/c;

    .line 23
    .line 24
    iput-object p1, v1, Lrb/a;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object p1, v0, Lrb/b;->a:Lnb/b;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Lnb/b;->onAdLoaded()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :pswitch_0
    check-cast p1, LI6/a;

    .line 35
    .line 36
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/h;

    .line 39
    .line 40
    iget-object v1, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 41
    .line 42
    invoke-interface {v1}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lrb/h;->e:Lrb/g;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, LI6/a;->setFullScreenContentCallback(Lx6/k;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lrb/h;->b:Lrb/f;

    .line 51
    .line 52
    iput-object p1, v1, Lrb/a;->b:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object p1, v0, Lrb/b;->a:Lnb/b;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-interface {p1}, Lnb/b;->onAdLoaded()V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    :pswitch_1
    check-cast p1, LI6/a;

    .line 63
    .line 64
    iget-object v0, p0, Lad/G;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lad/H;

    .line 79
    .line 80
    iput-object p1, v0, Lad/H;->c:LI6/a;

    .line 81
    .line 82
    new-instance v1, LS3/e;

    .line 83
    .line 84
    iget-object v2, v0, Lad/H;->b:LG9/e;

    .line 85
    .line 86
    const/16 v3, 0x1c

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v1, v2, v4, v0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, LI6/a;->setOnPaidEventListener(Lx6/q;)V

    .line 93
    .line 94
    .line 95
    iget v0, v0, Lad/i;->a:I

    .line 96
    .line 97
    invoke-virtual {p1}, LI6/a;->getResponseInfo()Lx6/t;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v2, v0, p1}, LG9/e;->z(ILx6/t;)V

    .line 102
    .line 103
    .line 104
    :cond_2
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
