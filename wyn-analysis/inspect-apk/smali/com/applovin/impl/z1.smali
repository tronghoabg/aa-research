.class public Lcom/applovin/impl/z1;
.super Lcom/applovin/impl/a2;
.source "SourceFile"


# instance fields
.field private final p0:Lcom/applovin/impl/p7;

.field private final q0:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/sdk/ad/b;Landroid/app/Activity;Ljava/util/Map;Lcom/applovin/impl/sdk/k;Lcom/applovin/sdk/AppLovinAdClickListener;Lcom/applovin/sdk/AppLovinAdDisplayListener;Lcom/applovin/sdk/AppLovinAdVideoPlaybackListener;)V
    .locals 2

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/applovin/impl/a2;-><init>(Lcom/applovin/impl/sdk/ad/b;Landroid/app/Activity;Ljava/util/Map;Lcom/applovin/impl/sdk/k;Lcom/applovin/sdk/AppLovinAdClickListener;Lcom/applovin/sdk/AppLovinAdDisplayListener;Lcom/applovin/sdk/AppLovinAdVideoPlaybackListener;)V

    .line 2
    .line 3
    .line 4
    move-object p5, p2

    .line 5
    move-object p2, p0

    .line 6
    new-instance p7, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {p7}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p7, p2, Lcom/applovin/impl/z1;->q0:Ljava/util/Set;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lcom/applovin/impl/p7;

    .line 15
    .line 16
    iput-object v0, p2, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->r1()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->l1()Lcom/applovin/impl/v7;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p3}, Lcom/applovin/impl/v7;->e()Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-static {p3, p5, p4}, Lcom/applovin/impl/v7;->a(Landroid/net/Uri;Landroid/content/Context;Lcom/applovin/impl/sdk/k;)Landroid/widget/ImageView;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p2, Lcom/applovin/impl/a2;->X:Landroid/widget/ImageView;

    .line 37
    .line 38
    move-object p3, p1

    .line 39
    new-instance p1, Lcom/applovin/impl/B1;

    .line 40
    .line 41
    const/4 p6, 0x0

    .line 42
    invoke-direct/range {p1 .. p6}, Lcom/applovin/impl/B1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object p1, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    .line 49
    .line 50
    sget-object p3, Lcom/applovin/impl/a8;->a:[Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, p1, p3}, Lcom/applovin/impl/p7;->a(Lcom/applovin/impl/p7$d;[Ljava/lang/String;)Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    invoke-interface {p7, p3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    sget-object p3, Lcom/applovin/impl/p7$d;->a:Lcom/applovin/impl/p7$d;

    .line 60
    .line 61
    invoke-direct {p0, p3}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;)V

    .line 62
    .line 63
    .line 64
    const-string p3, "creativeView"

    .line 65
    .line 66
    invoke-direct {p0, p1, p3}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Lcom/applovin/impl/f4;->g()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static synthetic V(Lcom/applovin/impl/z1;Lcom/applovin/impl/sdk/ad/b;Lcom/applovin/impl/sdk/k;Landroid/app/Activity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/sdk/ad/b;Lcom/applovin/impl/sdk/k;Landroid/app/Activity;Landroid/view/View;)V

    return-void
.end method

.method private V()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/a2;->X:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {v0}, Lcom/applovin/impl/p7;->r1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private W()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/applovin/impl/a2;->G()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/applovin/impl/z1;->q0:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Firing "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/applovin/impl/z1;->q0:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, " un-fired video progress trackers when video was completed."

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "AppLovinFullscreenActivity"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/z1;->q0:Ljava/util/Set;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lcom/applovin/impl/z1;->a(Ljava/util/Set;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z1;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/z1;->q0:Ljava/util/Set;

    return-object p0
.end method

.method private a(Lcom/applovin/impl/p7$d;)V
    .locals 1

    .line 42
    sget-object v0, Lcom/applovin/impl/u7;->b:Lcom/applovin/impl/u7;

    invoke-direct {p0, p1, v0}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Lcom/applovin/impl/u7;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/p7$d;Lcom/applovin/impl/u7;)V
    .locals 1

    .line 44
    const-string v0, ""

    invoke-direct {p0, p1, v0, p2}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;Lcom/applovin/impl/u7;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V
    .locals 1

    .line 43
    sget-object v0, Lcom/applovin/impl/u7;->b:Lcom/applovin/impl/u7;

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;Lcom/applovin/impl/u7;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/p7$d;Ljava/lang/String;Lcom/applovin/impl/u7;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {v0, p1, p2}, Lcom/applovin/impl/p7;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    .line 46
    invoke-direct {p0, p1, p3}, Lcom/applovin/impl/z1;->a(Ljava/util/Set;Lcom/applovin/impl/u7;)V

    return-void
.end method

.method private synthetic a(Lcom/applovin/impl/sdk/ad/b;Lcom/applovin/impl/sdk/k;Landroid/app/Activity;Landroid/view/View;)V
    .locals 3

    .line 3
    iget-object p4, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {p4}, Lcom/applovin/impl/p7;->l1()Lcom/applovin/impl/v7;

    move-result-object p4

    invoke-virtual {p4}, Lcom/applovin/impl/v7;->c()Landroid/net/Uri;

    move-result-object p4

    if-eqz p4, :cond_2

    .line 4
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Industry Icon clicked, opening URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppLovinFullscreenActivity"

    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_0
    sget-object v0, Lcom/applovin/impl/p7$d;->g:Lcom/applovin/impl/p7$d;

    invoke-direct {p0, v0}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;)V

    .line 6
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/ad/b;->isCustomTabsEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p2}, Lcom/applovin/impl/sdk/k;->z()Lcom/applovin/impl/f1;

    move-result-object p1

    invoke-virtual {p0}, Lcom/applovin/impl/w1;->b()Lcom/applovin/adview/AppLovinAdView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/applovin/adview/AppLovinAdView;->getController()Lcom/applovin/impl/adview/a;

    move-result-object p2

    invoke-virtual {p1, p4, p2, p3}, Lcom/applovin/impl/f1;->a(Landroid/net/Uri;Lcom/applovin/impl/adview/a;Landroid/app/Activity;)V

    return-void

    .line 8
    :cond_1
    invoke-static {p4, p1, p3, p2}, Lcom/applovin/impl/l7;->b(Landroid/net/Uri;Lcom/applovin/impl/sdk/ad/b;Landroid/content/Context;Lcom/applovin/impl/sdk/k;)Z

    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/z1;Ljava/util/Set;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/applovin/impl/z1;->a(Ljava/util/Set;)V

    return-void
.end method

.method private a(Ljava/util/Set;)V
    .locals 1

    .line 41
    sget-object v0, Lcom/applovin/impl/u7;->b:Lcom/applovin/impl/u7;

    invoke-direct {p0, p1, v0}, Lcom/applovin/impl/z1;->a(Ljava/util/Set;Lcom/applovin/impl/u7;)V

    return-void
.end method

.method private a(Ljava/util/Set;Lcom/applovin/impl/u7;)V
    .locals 9

    if-eqz p1, :cond_2

    .line 47
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 48
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/applovin/impl/a2;->P:Lcom/applovin/impl/adview/AppLovinVideoView;

    invoke-virtual {v1}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v4

    .line 49
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {v0}, Lcom/applovin/impl/p7;->q1()Lcom/applovin/impl/d8;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {v0}, Lcom/applovin/impl/d8;->d()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 51
    :goto_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Firing "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " tracker(s): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AppLovinFullscreenActivity"

    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_1
    iget-object v8, p0, Lcom/applovin/impl/w1;->b:Lcom/applovin/impl/sdk/k;

    move-object v3, p1

    move-object v7, p2

    invoke-static/range {v3 .. v8}, Lcom/applovin/impl/b8;->a(Ljava/util/Set;JLandroid/net/Uri;Lcom/applovin/impl/u7;Lcom/applovin/impl/sdk/k;)V

    :cond_2
    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/z1;)Lcom/applovin/impl/p7;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public D()V
    .locals 2

    .line 1
    sget-object v0, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    .line 2
    .line 3
    const-string v1, "skip"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->B()V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Lcom/applovin/impl/a2;->D()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/applovin/impl/a2;->E()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->i()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public O()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->O()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-gez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->P()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->O()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-ltz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->O()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->p1()Lcom/applovin/impl/c8;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/applovin/impl/c8;->d()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-lez v4, :cond_3

    .line 53
    .line 54
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/applovin/impl/c8;->d()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-long v3, v1

    .line 61
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-wide v4, p0, Lcom/applovin/impl/a2;->g0:J

    .line 67
    .line 68
    cmp-long v1, v4, v2

    .line 69
    .line 70
    if-lez v1, :cond_4

    .line 71
    .line 72
    move-wide v2, v4

    .line 73
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->W0()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->r()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    long-to-int v0, v0

    .line 84
    if-lez v0, :cond_5

    .line 85
    .line 86
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    int-to-long v4, v0

    .line 89
    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    add-long/2addr v2, v0

    .line 94
    :cond_5
    long-to-double v0, v2

    .line 95
    iget-object v2, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/ad/b;->P()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    int-to-double v2, v2

    .line 102
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 103
    .line 104
    div-double/2addr v2, v4

    .line 105
    mul-double/2addr v2, v0

    .line 106
    double-to-long v0, v2

    .line 107
    :goto_2
    invoke-virtual {p0, v0, v1}, Lcom/applovin/impl/w1;->c(J)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public R()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/applovin/impl/a2;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->j()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/applovin/impl/z1;->W()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/applovin/impl/b8;->a(Lcom/applovin/impl/p7;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/applovin/impl/a2;->j0:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    sget-object v0, Lcom/applovin/impl/p7$d;->e:Lcom/applovin/impl/p7$d;

    .line 17
    .line 18
    const-string v1, "creativeView"

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->w()V

    .line 30
    .line 31
    .line 32
    invoke-super {p0}, Lcom/applovin/impl/a2;->S()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 43
    .line 44
    const-string v1, "AppLovinFullscreenActivity"

    .line 45
    .line 46
    const-string v2, "VAST ad does not have valid companion ad - dismissing..."

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    const-string v0, "no_valid_companion_ad"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/applovin/impl/z1;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public U()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/applovin/impl/a2;->U()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/applovin/impl/a2;->f0:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "mute"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "unmute"

    .line 14
    .line 15
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v1, p0, Lcom/applovin/impl/a2;->f0:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/applovin/impl/l4;->b(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 1

    .line 38
    sget-object v0, Lcom/applovin/impl/p7$d;->b:Lcom/applovin/impl/p7$d;

    invoke-direct {p0, v0}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;)V

    .line 39
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/l4;->v()V

    .line 40
    invoke-super {p0, p1}, Lcom/applovin/impl/a2;->a(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public a(Landroid/view/ViewGroup;)V
    .locals 4

    .line 13
    invoke-super {p0, p1}, Lcom/applovin/impl/a2;->a(Landroid/view/ViewGroup;)V

    .line 14
    invoke-direct {p0}, Lcom/applovin/impl/z1;->V()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 15
    sget-object p1, Lcom/applovin/impl/p7$d;->f:Lcom/applovin/impl/p7$d;

    invoke-direct {p0, p1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;)V

    .line 16
    iget-object p1, p0, Lcom/applovin/impl/a2;->X:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/a2;->c0:Lcom/applovin/impl/b1;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    new-instance v2, Lcom/applovin/impl/z1$a;

    invoke-direct {v2, p0}, Lcom/applovin/impl/z1$a;-><init>(Lcom/applovin/impl/z1;)V

    const-string v3, "PROGRESS_TRACKING"

    invoke-virtual {p1, v3, v0, v1, v2}, Lcom/applovin/impl/b1;->a(Ljava/lang/String;JLcom/applovin/impl/b1$b;)V

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    iget-object v0, p0, Lcom/applovin/impl/a2;->Q:Lcom/applovin/impl/a;

    if-eqz v0, :cond_1

    .line 20
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->OTHER:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "video stream buffering indicator"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/applovin/impl/a2;->R:Lcom/applovin/impl/adview/g;

    if-eqz v0, :cond_2

    .line 22
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->CLOSE_AD:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "skip button"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_2
    iget-object v0, p0, Lcom/applovin/impl/a2;->S:Lcom/applovin/impl/i0;

    if-eqz v0, :cond_3

    .line 24
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->OTHER:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "countdown clock"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_3
    iget-object v0, p0, Lcom/applovin/impl/a2;->V:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_4

    .line 26
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->OTHER:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "progress bar"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_4
    iget-object v0, p0, Lcom/applovin/impl/a2;->W:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_5

    .line 28
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->OTHER:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "postitial progress bar"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    :cond_5
    iget-object v0, p0, Lcom/applovin/impl/a2;->T:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    .line 30
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->VIDEO_CONTROLS:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "mute button"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_6
    iget-object v0, p0, Lcom/applovin/impl/a2;->U:Lcom/applovin/impl/adview/l;

    if-eqz v0, :cond_7

    .line 32
    new-instance v1, Lcom/applovin/impl/h4;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->VIDEO_CONTROLS:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    const-string v3, "generic webview overlay containing HTML controls"

    invoke-direct {v1, v0, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    :cond_7
    iget-object v0, p0, Lcom/applovin/impl/w1;->j:Lcom/applovin/impl/adview/k;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/applovin/impl/adview/k;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 34
    new-instance v0, Lcom/applovin/impl/h4;

    iget-object v1, p0, Lcom/applovin/impl/w1;->j:Lcom/applovin/impl/adview/k;

    sget-object v2, Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;->NOT_VISIBLE:Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;

    .line 35
    invoke-virtual {v1}, Lcom/applovin/impl/adview/k;->getIdentifier()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/applovin/impl/h4;-><init>(Landroid/view/View;Lcom/iab/omid/library/applovin/adsession/FriendlyObstructionPurpose;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_8
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    move-result-object v0

    iget-object v1, p0, Lcom/applovin/impl/a2;->P:Lcom/applovin/impl/adview/AppLovinVideoView;

    invoke-virtual {v0, v1, p1}, Lcom/applovin/impl/f4;->b(Landroid/view/View;Ljava/util/List;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 9
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    const-string v1, "close"

    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lcom/applovin/impl/p7$d;->e:Lcom/applovin/impl/p7$d;

    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/applovin/impl/a2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public d(J)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/applovin/impl/a2;->d(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    long-to-float p1, p1

    .line 17
    iget-object p2, p0, Lcom/applovin/impl/w1;->b:Lcom/applovin/impl/sdk/k;

    .line 18
    .line 19
    invoke-static {p2}, Lcom/applovin/impl/o7;->e(Lcom/applovin/impl/sdk/k;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-virtual {v0, p1, p2}, Lcom/applovin/impl/l4;->b(FZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/applovin/impl/p7$d;->h:Lcom/applovin/impl/p7$d;

    .line 2
    .line 3
    sget-object v1, Lcom/applovin/impl/u7;->n:Lcom/applovin/impl/u7;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Lcom/applovin/impl/u7;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/applovin/impl/f4;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Lcom/applovin/impl/a2;->g(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public s()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/applovin/impl/w1;->s()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/applovin/impl/a2;->j0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/applovin/impl/p7$d;->e:Lcom/applovin/impl/p7$d;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    .line 12
    .line 13
    :goto_0
    const-string v1, "pause"

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->z()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/applovin/impl/w1;->t()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/applovin/impl/a2;->j0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/applovin/impl/p7$d;->e:Lcom/applovin/impl/p7$d;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v0, Lcom/applovin/impl/p7$d;->d:Lcom/applovin/impl/p7$d;

    .line 12
    .line 13
    :goto_0
    const-string v1, "resume"

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lcom/applovin/impl/z1;->a(Lcom/applovin/impl/p7$d;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/applovin/impl/z1;->p0:Lcom/applovin/impl/p7;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/applovin/impl/p7;->getAdEventTracker()Lcom/applovin/impl/l4;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/applovin/impl/l4;->A()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/a2;->c0:Lcom/applovin/impl/b1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/b1;->c()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/applovin/impl/a2;->v()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public w()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/applovin/impl/z1;->a(Landroid/view/ViewGroup;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
