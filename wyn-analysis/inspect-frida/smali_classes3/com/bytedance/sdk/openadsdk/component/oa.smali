.class public Lcom/bytedance/sdk/openadsdk/component/oa;
.super Lcom/bytedance/sdk/openadsdk/component/yo;
.source "SourceFile"


# instance fields
.field private final cq:Lcom/bytedance/sdk/openadsdk/component/ivm/oa;

.field private dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

.field private wk:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/uef;IZLcom/bytedance/sdk/openadsdk/component/bcc/uef;Lcom/bytedance/sdk/openadsdk/component/ivm/oa;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/bytedance/sdk/openadsdk/component/yo;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/uef;IZLcom/bytedance/sdk/openadsdk/component/bcc/uef;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iput-object p8, p1, Lcom/bytedance/sdk/openadsdk/component/oa;->cq:Lcom/bytedance/sdk/openadsdk/component/ivm/oa;

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/oa;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/oa;)Lcom/bytedance/sdk/openadsdk/component/cz/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/oa;Landroid/view/ViewGroup;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/oa;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->wk:Z

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/oa;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->oa()V

    return-void
.end method


# virtual methods
.method public lw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->oib()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public moa()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/oa;->getDynamicShowType()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public oa()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->tpx()V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public uef()V
    .locals 4

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;Lcom/bytedance/sdk/openadsdk/component/cz/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;

    move-result-object v0

    .line 15
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/oa$2;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/oa;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickListener(Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;)V

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;Lcom/bytedance/sdk/openadsdk/component/cz/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/cz;

    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickCreativeListener(Lcom/bytedance/sdk/openadsdk/core/zjm/cz;)V

    .line 19
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/oa$3;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/oa$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/oa;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/oa$4;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/oa$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/oa;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setBackupListener(Lcom/bytedance/sdk/component/adexpress/oa/yo;)V

    return-void
.end method

.method public uef(IZ)V
    .locals 5

    .line 21
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(IZ)V

    .line 22
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    if-eqz p2, :cond_0

    .line 23
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/bcc/uef;->yo()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v1, v1

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setTime(Ljava/lang/CharSequence;IIZ)V

    :cond_0
    return-void
.end method

.method public uef(JJ)V
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/component/cz/oa;->uef(JJ)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/view/ViewGroup;)V
    .locals 8

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->xs:I

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa/uef;->uef(Landroid/view/Window;I)Landroid/util/Pair;

    move-result-object p1

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    .line 7
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setExpressViewAcceptedSize(FF)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v3

    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->cq:Lcom/bytedance/sdk/openadsdk/component/ivm/oa;

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    const-string v4, "open_ad"

    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/component/cz/oa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/uef;Lcom/bytedance/sdk/openadsdk/component/ivm/oa;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/cz/oa;->setTopListener(Lcom/bytedance/sdk/openadsdk/component/ivm/uef;)V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/cz/oa;->setExpressVideoListenerProxy(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/oa$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/oa;)V

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oib(I)V

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->moa:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public yo()V
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->yo()V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa;->dz:Lcom/bytedance/sdk/openadsdk/component/cz/oa;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->cq()V

    :cond_0
    return-void
.end method
