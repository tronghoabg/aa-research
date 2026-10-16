.class public final Lrb/i;
.super LR6/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrb/i;->a:I

    iput-object p1, p0, Lrb/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 2

    .line 1
    iget v0, p0, Lrb/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

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
    iget-object v0, p0, Lrb/i;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/j;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

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
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdLoaded(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lrb/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LR6/c;

    .line 7
    .line 8
    iget-object v0, p0, Lrb/i;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lvb/f;

    .line 11
    .line 12
    iget-object v1, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lvb/f;->f:Lrb/g;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, LR6/c;->setFullScreenContentCallback(Lx6/k;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lvb/f;->b:Lvb/c;

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
    check-cast p1, LR6/c;

    .line 35
    .line 36
    iget-object v0, p0, Lrb/i;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/j;

    .line 39
    .line 40
    iget-object v1, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 41
    .line 42
    invoke-interface {v1}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lrb/j;->f:Lrb/g;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, LR6/c;->setFullScreenContentCallback(Lx6/k;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lrb/j;->b:Lrb/f;

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
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
