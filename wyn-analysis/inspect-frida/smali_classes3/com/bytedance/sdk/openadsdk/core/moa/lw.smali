.class public Lcom/bytedance/sdk/openadsdk/core/moa/lw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bcc:Lcom/bytedance/sdk/openadsdk/core/moa/ivm$uef;

.field private final ivm:Lcom/bytedance/sdk/openadsdk/core/moa/ivm$oa;

.field private lw:I

.field private final moa:Ljava/lang/String;

.field private oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

.field private uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

.field private final xs:Landroid/view/View$OnAttachStateChangeListener;

.field private yo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/moa/uef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/orq;Landroid/content/Context;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    .line 10
    .line 11
    const-string v0, "BannerSwiperManager"

    .line 12
    .line 13
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->moa:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    .line 17
    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->ivm:Lcom/bytedance/sdk/openadsdk/core/moa/ivm$oa;

    .line 24
    .line 25
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/lw$2;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->xs:Landroid/view/View$OnAttachStateChangeListener;

    .line 31
    .line 32
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/moa/lw$3;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->bcc:Lcom/bytedance/sdk/openadsdk/core/moa/ivm$uef;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 40
    .line 41
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;->setSwiperWindowFocusChangedListener(Lcom/bytedance/sdk/openadsdk/core/moa/ivm$oa;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;->setSwiperVisibleChangeListener(Lcom/bytedance/sdk/openadsdk/core/moa/ivm$uef;)V

    .line 59
    .line 60
    .line 61
    int-to-float p1, p3

    .line 62
    int-to-float p3, p4

    .line 63
    invoke-virtual {p0, p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef(Landroid/content/Context;FF)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/moa/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    return-object p0
.end method

.method private lw()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/orq;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/orq;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->uef()Ljava/lang/String;

    move-result-object v0

    const-string v1, "vertical"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {v1, v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    const-string v1, "dot"

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 8
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->moa()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 9
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->oa()I

    move-result v2

    if-ne v2, v3, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 10
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->cz()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 11
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->zjm()I

    move-result v2

    if-ne v2, v3, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    move v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 12
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->bcc()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 13
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->yo()I

    move-result v2

    if-ne v2, v3, :cond_4

    move v1, v3

    :cond_4
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 14
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->lw()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 15
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->ivm()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    .line 16
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->xs()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->setOnPageChangeListener(Lcom/bytedance/adsdk/ugeno/ivm/yo;)V

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(Ljava/util/List;)V

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo()V

    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    return-object p0
.end method

.method private moa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->oa()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    .line 4
    :cond_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    if-ltz v0, :cond_1

    .line 5
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef(I)V

    .line 6
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(I)V

    :cond_1
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->moa()V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/lw;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo(I)V

    return-void
.end method

.method private oa(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/moa/uef;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/Object;)Lcom/bytedance/adsdk/ugeno/ivm/uef;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/lw;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo()V

    return-void
.end method

.method private yo()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/model/orq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->oa()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm()V

    .line 4
    :cond_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    if-ltz v0, :cond_1

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(I)V

    :cond_1
    return-void
.end method

.method private yo(I)V
    .locals 2

    .line 6
    :try_start_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-eq v0, p1, :cond_0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa()V

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bcc()V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw()V

    return-void
.end method


# virtual methods
.method public oa()Landroid/view/View;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    return-object v0
.end method

.method public oa(I)V
    .locals 2

    const/4 v0, 0x0

    .line 3
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    if-eq v0, p1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cz()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 6
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public uef()V
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    if-eqz v0, :cond_1

    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw:I

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa()V

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;->setSwiperWindowFocusChangedListener(Lcom/bytedance/sdk/openadsdk/core/moa/ivm$oa;)V

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/ivm;->setSwiperVisibleChangeListener(Lcom/bytedance/sdk/openadsdk/core/moa/ivm$uef;)V

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->xs:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 24
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public uef(I)V
    .locals 3

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    if-eqz v1, :cond_1

    .line 13
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/moa/lw$5;

    invoke-direct {v2, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/lw$5;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;II)V

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 14
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public uef(Landroid/content/Context;FF)V
    .locals 0

    .line 3
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p2

    .line 4
    invoke-static {p1, p3}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p1

    .line 5
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    if-nez p3, :cond_0

    .line 6
    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, p2, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 7
    :cond_0
    iput p2, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 8
    iput p1, p3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/ivm;

    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public uef(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/moa/uef;",
            ">;)V"
        }
    .end annotation

    .line 10
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->yo:Ljava/util/List;

    return-void
.end method
