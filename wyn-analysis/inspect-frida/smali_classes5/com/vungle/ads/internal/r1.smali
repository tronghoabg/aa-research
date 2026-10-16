.class public final Lcom/vungle/ads/internal/r1;
.super Lcom/vungle/ads/internal/s;
.source "SourceFile"

# interfaces
.implements Lcom/vungle/ads/internal/presenter/x;


# instance fields
.field public final A:Landroid/view/View$OnTouchListener;

.field public final q:Lef/i;

.field public final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final s:Lef/i;

.field public t:Lcom/vungle/ads/internal/presenter/w;

.field public u:Ljava/util/LinkedHashMap;

.field public final v:Lef/i;

.field public final w:Lef/i;

.field public x:F

.field public final y:Lef/i;

.field public z:Lcom/vungle/ads/internal/ui/a0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/vungle/ads/internal/s;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/vungle/ads/internal/l1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/vungle/ads/internal/l1;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/vungle/ads/internal/r1;->q:Lef/i;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/vungle/ads/internal/r1;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    sget-object v0, Lef/j;->a:Lef/j;

    .line 29
    .line 30
    new-instance v1, Lcom/vungle/ads/internal/o1;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lcom/vungle/ads/internal/o1;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, Lcom/vungle/ads/internal/r1;->s:Lef/i;

    .line 40
    .line 41
    new-instance v1, Lcom/vungle/ads/internal/p1;

    .line 42
    .line 43
    invoke-direct {v1, p1}, Lcom/vungle/ads/internal/p1;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/vungle/ads/internal/r1;->v:Lef/i;

    .line 51
    .line 52
    new-instance p1, Lcom/vungle/ads/internal/k1;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lcom/vungle/ads/internal/k1;-><init>(Lcom/vungle/ads/internal/r1;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lcom/vungle/ads/internal/r1;->w:Lef/i;

    .line 62
    .line 63
    sget-object p1, Lcom/vungle/ads/internal/q1;->a:Lcom/vungle/ads/internal/q1;

    .line 64
    .line 65
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/vungle/ads/internal/r1;->y:Lef/i;

    .line 70
    .line 71
    new-instance p1, LLb/g;

    .line 72
    .line 73
    const/4 v0, 0x4

    .line 74
    invoke-direct {p1, p0, v0}, LLb/g;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/vungle/ads/internal/r1;->A:Landroid/view/View$OnTouchListener;

    .line 78
    .line 79
    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/r1;)Lcom/vungle/ads/internal/executor/a;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/vungle/ads/internal/r1;->v:Lef/i;

    .line 4
    invoke-interface {p0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/internal/executor/a;

    return-object p0
.end method

.method public static synthetic a(Lcom/vungle/ads/internal/r1;I)V
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/vungle/ads/internal/r1;->a(ILjava/util/Map;)V

    return-void
.end method

.method public static a(Lcom/vungle/ads/internal/r1;Ljava/lang/String;)V
    .locals 2

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object p0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz p0, :cond_0

    const-string v0, "tpat"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/vungle/ads/internal/presenter/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/r1;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object p0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p2}, Lcom/vungle/ads/internal/presenter/w;->a(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(ILjava/util/Map;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/vungle/ads/internal/presenter/w;->a(ILjava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->c()Lcom/vungle/ads/internal/model/h0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/h0;->z()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 36
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->A:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;Lcom/vungle/ads/NativeAd$adPlayCallback$1;)V
    .locals 4

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->c()Lcom/vungle/ads/internal/model/h0;

    move-result-object v0

    if-nez v0, :cond_0

    .line 23
    new-instance p1, Lcom/vungle/ads/AdNotLoadedCantPlay;

    const-string v0, "Ad is null"

    invoke-direct {p1, v0}, Lcom/vungle/ads/AdNotLoadedCantPlay;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object p1

    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object p1

    if-eqz p2, :cond_5

    .line 24
    invoke-interface {p2, p1}, Lcom/vungle/ads/internal/presenter/b;->onFailure(Lcom/vungle/ads/VungleError;)V

    return-void

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-nez v1, :cond_1

    .line 26
    new-instance v1, Lcom/vungle/ads/internal/presenter/w;

    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->d()Landroid/content/Context;

    move-result-object v2

    .line 27
    iget-object v3, p0, Lcom/vungle/ads/internal/r1;->s:Lef/i;

    invoke-interface {v3}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/vungle/ads/internal/platform/f;

    .line 28
    invoke-direct {v1, v2, p0, v0, v3}, Lcom/vungle/ads/internal/presenter/w;-><init>(Landroid/content/Context;Lcom/vungle/ads/internal/r1;Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/platform/f;)V

    iput-object v1, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    .line 29
    new-instance v0, Lcom/vungle/ads/internal/presenter/a;

    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->f()Lcom/vungle/ads/internal/model/i3;

    move-result-object v2

    invoke-direct {v0, p2, v2}, Lcom/vungle/ads/internal/presenter/a;-><init>(Lcom/vungle/ads/internal/presenter/b;Lcom/vungle/ads/internal/model/i3;)V

    invoke-virtual {v1, v0}, Lcom/vungle/ads/internal/presenter/w;->a(Lcom/vungle/ads/internal/presenter/a;)V

    .line 30
    :cond_1
    iget-object p2, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz p2, :cond_4

    .line 31
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_2

    const-string v1, "OM_SDK_DATA"

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_2
    const-string v0, ""

    .line 32
    :cond_3
    invoke-virtual {p2, p1, v0}, Lcom/vungle/ads/internal/presenter/w;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 33
    :cond_4
    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->n()Lcom/vungle/ads/internal/f1;

    move-result-object p2

    new-instance v0, Lcom/vungle/ads/internal/m1;

    invoke-direct {v0, p0}, Lcom/vungle/ads/internal/m1;-><init>(Lcom/vungle/ads/internal/r1;)V

    invoke-virtual {p2, p1, v0}, Lcom/vungle/ads/internal/f1;->a(Landroid/view/View;Lcom/vungle/ads/internal/c1;)V

    .line 34
    iget-object p1, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/vungle/ads/internal/presenter/w;->c()V

    :cond_5
    return-void
.end method

.method public final a(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 3

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->z:Lcom/vungle/ads/internal/ui/a0;

    if-nez v0, :cond_1

    .line 16
    new-instance v0, Lcom/vungle/ads/internal/ui/a0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "rootView.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2}, Lcom/vungle/ads/internal/ui/a0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/vungle/ads/internal/r1;->z:Lcom/vungle/ads/internal/ui/a0;

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/vungle/ads/internal/r1;->z:Lcom/vungle/ads/internal/ui/a0;

    if-eqz p2, :cond_4

    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    :cond_3
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    invoke-virtual {p2}, Landroid/view/View;->bringToFront()V

    :cond_4
    :goto_1
    return-void
.end method

.method public final a(Landroid/widget/ImageView;)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_0

    const-string v1, "APP_ICON"

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/vungle/ads/internal/r1;->w:Lef/i;

    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vungle/ads/internal/util/p;

    .line 9
    new-instance v2, Lcom/vungle/ads/internal/j1;

    invoke-direct {v2, p1}, Lcom/vungle/ads/internal/j1;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v0, v2}, Lcom/vungle/ads/internal/util/p;->a(Ljava/lang/String;Lcom/vungle/ads/internal/j1;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    if-eqz v0, :cond_0

    const-string v1, "tpat"

    const-string v2, "video.length"

    invoke-virtual {v0, v1, v2, p1}, Lcom/vungle/ads/internal/presenter/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/vungle/ads/VungleAdSize;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Lcom/vungle/ads/internal/model/i3;)Z
    .locals 1

    const-string v0, "placement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/i3;->i()Z

    move-result p1

    return p1
.end method

.method public final b()Lcom/vungle/ads/VungleAdSize;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Landroid/widget/ImageView;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_0

    const-string v1, "MAIN_IMAGE"

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/vungle/ads/internal/r1;->w:Lef/i;

    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vungle/ads/internal/util/p;

    .line 4
    new-instance v2, Lcom/vungle/ads/internal/j1;

    invoke-direct {v2, p1}, Lcom/vungle/ads/internal/j1;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v0, v2}, Lcom/vungle/ads/internal/util/p;->a(Ljava/lang/String;Lcom/vungle/ads/internal/j1;)V

    return-void
.end method

.method public final b(Lcom/vungle/ads/internal/model/h0;)V
    .locals 8

    const-string v0, "Failed to release metadata retriever"

    const-string v1, "NativeAdInternal"

    sget-object v2, Lef/C;->a:Lef/C;

    const-string v3, "Failed to retrieve video metadata: "

    const-string v4, "advertisement"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->s()Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 6
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/vungle/ads/internal/util/s;->a()Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v6, 0x3

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    cmp-long p1, v4, v6

    if-nez p1, :cond_4

    .line 8
    :cond_3
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->l()V

    .line 9
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->s()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 10
    new-instance p1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 11
    :try_start_0
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->d()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->o()Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    const-string v6, "parse(this)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, v4, v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    const/16 v4, 0x12

    .line 14
    invoke-virtual {p1, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 15
    invoke-static {v4}, LBf/r;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 16
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_3

    :catchall_0
    move-exception v4

    goto :goto_5

    :cond_5
    move v4, v5

    :goto_3
    const/16 v6, 0x13

    .line 17
    invoke-virtual {p1, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 18
    invoke-static {v6}, LBf/r;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 19
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_6
    if-lez v4, :cond_7

    if-lez v5, :cond_7

    int-to-float v4, v4

    int-to-float v5, v5

    div-float/2addr v4, v5

    .line 20
    iput v4, p0, Lcom/vungle/ads/internal/r1;->x:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :cond_7
    :try_start_1
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    move-result-object v2

    :goto_4
    invoke-static {v2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    goto :goto_7

    .line 22
    :goto_5
    :try_start_2
    sget-boolean v5, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v5, "NativeAd"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 23
    :try_start_3
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    move-result-object v2

    :goto_6
    invoke-static {v2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 24
    :goto_7
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    invoke-static {v1, v0, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-void

    :catchall_3
    move-exception v3

    .line 25
    :try_start_4
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception p1

    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    move-result-object v2

    :goto_8
    invoke-static {v2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 26
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    invoke-static {v1, v0, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    :cond_9
    throw v3

    .line 28
    :cond_a
    iget-object p1, p0, Lcom/vungle/ads/internal/r1;->w:Lef/i;

    invoke-interface {p1}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/vungle/ads/internal/util/p;

    .line 29
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_b

    const-string v1, "MAIN_IMAGE"

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_c

    :cond_b
    const-string v0, ""

    .line 30
    :cond_c
    new-instance v1, Lcom/vungle/ads/internal/n1;

    invoke-direct {v1, p0}, Lcom/vungle/ads/internal/n1;-><init>(Lcom/vungle/ads/internal/r1;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/vungle/ads/internal/util/p;->a(Ljava/lang/String;Lcom/vungle/ads/internal/n1;)V

    return-void
.end method

.method public final c(Landroid/widget/ImageView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "VUNGLE_PRIVACY_ICON_URL"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    const-string v0, ""

    .line 16
    .line 17
    :cond_1
    iget-object v1, p0, Lcom/vungle/ads/internal/r1;->w:Lef/i;

    .line 18
    .line 19
    invoke-interface {v1}, Lef/i;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/vungle/ads/internal/util/p;

    .line 24
    .line 25
    new-instance v2, Lcom/vungle/ads/internal/j1;

    .line 26
    .line 27
    invoke-direct {v2, p1}, Lcom/vungle/ads/internal/j1;-><init>(Landroid/widget/ImageView;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lcom/vungle/ads/internal/util/p;->a(Ljava/lang/String;Lcom/vungle/ads/internal/j1;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final j()Lcom/vungle/ads/InvalidAdStateError;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/s;->b:Lcom/vungle/ads/internal/h;

    .line 2
    .line 3
    sget-object v1, Lcom/vungle/ads/internal/h;->c:Lcom/vungle/ads/internal/g;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/vungle/ads/internal/s;->i()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lcom/vungle/ads/InvalidAdStateError;

    .line 15
    .line 16
    sget-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->AD_NOT_LOADED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/vungle/ads/internal/s;->b:Lcom/vungle/ads/internal/h;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, " can not play native ad."

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-direct {v0, v1, v2}, Lcom/vungle/ads/InvalidAdStateError;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 42
    return-object v0
.end method

.method public final m()Ljava/lang/Double;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "APP_RATING_VALUE"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, LBf/q;->Y(Ljava/lang/String;)Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final n()Lcom/vungle/ads/internal/f1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->q:Lef/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/vungle/ads/internal/f1;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v1, "MAIN_VIDEO"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v1, "ORIGINAL_VIDEO_URL"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    const-string v0, ""

    .line 18
    .line 19
    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/s;->d:Lcom/vungle/ads/internal/model/i3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/vungle/ads/internal/model/i3;->a:Ljava/lang/String;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return-object v0
.end method

.method public final r()Lcom/vungle/ads/nativead/NativeVideoOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->y:Lef/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/vungle/ads/nativead/NativeVideoOptions;

    .line 8
    .line 9
    return-object v0
.end method

.method public final s()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final u()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->s:Lef/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/vungle/ads/internal/platform/f;

    .line 8
    .line 9
    check-cast v0, Lcom/vungle/ads/internal/platform/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/vungle/ads/internal/platform/c;->o()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/vungle/ads/internal/r1;->r()Lcom/vungle/ads/nativead/NativeVideoOptions;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/vungle/ads/nativead/NativeVideoOptions;->getStartMuted()Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const-string v2, "START_MUTED"

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, LBf/k;->U0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v0, v1

    .line 59
    :goto_0
    if-eqz v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 v0, 0x0

    .line 63
    return v0

    .line 64
    :cond_3
    :goto_1
    return v1
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v2, "VUNGLE_PRIVACY_URL"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    :cond_0
    const-string v1, ""

    .line 20
    .line 21
    :cond_1
    const/4 v2, 0x0

    .line 22
    const-string v3, "openPrivacy"

    .line 23
    .line 24
    invoke-virtual {v0, v3, v2, v1}, Lcom/vungle/ads/internal/presenter/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/vungle/ads/internal/r1;->a(ILjava/util/Map;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/vungle/ads/internal/r1;->t:Lcom/vungle/ads/internal/presenter/w;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lcom/vungle/ads/internal/r1;->u:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string v3, "CTA_BUTTON_URL"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :cond_0
    const-string v2, ""

    .line 26
    .line 27
    :cond_1
    const-string v3, "download"

    .line 28
    .line 29
    invoke-virtual {v0, v3, v1, v2}, Lcom/vungle/ads/internal/presenter/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method
