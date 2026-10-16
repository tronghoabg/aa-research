.class public Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected bcc:Landroid/content/Context;

.field protected cz:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private dj:Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;

.field protected ivm:F

.field protected lw:F

.field protected moa:Ljava/lang/String;

.field protected oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

.field private wrv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

.field protected xs:Landroid/app/Activity;

.field protected yo:Landroid/view/ViewGroup;

.field private zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->yo:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->xs:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->bcc:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->wrv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->wrv:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;
    .locals 1

    .line 28
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 29
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->xs:Landroid/app/Activity;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public ivm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->cq()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public lw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->dj()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public moa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->wrv()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(FF)V
    .locals 6

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->lw:F

    .line 5
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->ivm:F

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result p1

    .line 7
    new-instance p2, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    invoke-direct {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->lw:F

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->ivm:F

    .line 9
    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setExpressViewAcceptedSize(FF)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->cz:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 10
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->xs:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->bcc:Landroid/content/Context;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->cz:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;-><init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->dj:Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->yo()V

    .line 13
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x1

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 p2, 0x11

    .line 14
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 15
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->yo:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p2, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->tpx()V

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->dj()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->dj:Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/lw;)V
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->setDislikeClickListener(Lcom/bytedance/sdk/openadsdk/core/zjm/lw;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;Lcom/bytedance/sdk/openadsdk/core/zjm/cz;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickListener(Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;)V

    .line 25
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 26
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 27
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickCreativeListener(Lcom/bytedance/sdk/openadsdk/core/zjm/cz;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef([F)V
    .locals 2

    if-eqz p1, :cond_1

    .line 2
    array-length v0, p1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    aget v0, p1, v0

    const/4 v1, 0x1

    aget p1, p1, v1

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef(FF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public yo()V
    .locals 10

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->xs:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$1;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "click_scence"

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$2;

    .line 43
    .line 44
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->xs:Landroid/app/Activity;

    .line 45
    .line 46
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 47
    .line 48
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    move-object v5, p0

    .line 55
    invoke-direct/range {v4 .. v9}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$3;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0, v4}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;Lcom/bytedance/sdk/openadsdk/core/zjm/cz;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
