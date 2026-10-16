.class public Lcom/bytedance/sdk/openadsdk/orq/uef/oa;
.super Lcom/bytedance/sdk/openadsdk/orq/uef/uef;
.source "SourceFile"


# instance fields
.field private ivm:Ljava/lang/String;

.field private lw:Landroid/widget/FrameLayout;

.field private final moa:Landroid/widget/FrameLayout;

.field private volatile oa:Z

.field private yo:Lcom/bytedance/sdk/openadsdk/cq/xs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;)V

    .line 2
    .line 3
    .line 4
    move-object p2, p1

    .line 5
    move-object p1, p0

    .line 6
    iput-object p5, p1, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->moa:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    iput-object p6, p1, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->ivm:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p4, 0x0

    .line 11
    invoke-virtual {p0, p4}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa(Z)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result p5

    .line 18
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/content/Context;)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 p6, 0x1

    .line 23
    if-ne p3, p6, :cond_0

    .line 24
    .line 25
    if-gt p5, p2, :cond_1

    .line 26
    .line 27
    iget-object p3, p1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    .line 28
    .line 29
    invoke-virtual {p3, p4, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 p6, 0x2

    .line 34
    if-ne p3, p6, :cond_2

    .line 35
    .line 36
    if-le p5, p2, :cond_1

    .line 37
    .line 38
    iget-object p3, p1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    .line 39
    .line 40
    invoke-virtual {p3, p4, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p3, p1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    .line 45
    .line 46
    invoke-virtual {p3, p4, p4, p2, p5}, Landroid/view/View;->layout(IIII)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;)Lcom/bytedance/sdk/openadsdk/cq/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/cq/xs;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->oa:Z

    return p1
.end method


# virtual methods
.method public bcc()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-super {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef(ZLcom/bytedance/sdk/openadsdk/cq/xs;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public cz()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->lw:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef()V

    return-void
.end method

.method public uef(Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/cq/xs;)V
    .locals 1

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->lw:Landroid/widget/FrameLayout;

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->moa:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/cq/xs;

    .line 6
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->oa:Z

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->yo:Lcom/bytedance/sdk/openadsdk/cq/xs;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/cq/xs;->uef()V

    :cond_0
    return-void
.end method
