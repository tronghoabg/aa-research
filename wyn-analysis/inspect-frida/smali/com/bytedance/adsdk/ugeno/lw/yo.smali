.class public Lcom/bytedance/adsdk/ugeno/lw/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field ab:I

.field bcc:I

.field bs:Z

.field cq:I

.field cz:I

.field dj:F

.field dz:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field ivm:I

.field lw:I

.field moa:I

.field oa:I

.field sy:Z

.field uef:I

.field wk:I

.field wrv:I

.field xs:I

.field yo:I

.field zjm:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->uef:I

    .line 8
    .line 9
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->oa:I

    .line 10
    .line 11
    const/high16 v0, -0x80000000

    .line 12
    .line 13
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->yo:I

    .line 14
    .line 15
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->moa:I

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->dz:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public oa()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->bcc:I

    .line 2
    .line 3
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->cz:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->xs:I

    return v0
.end method

.method public uef(Landroid/view/View;IIII)V
    .locals 4

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/bytedance/adsdk/ugeno/lw/oa;

    .line 3
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->uef:I

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/lw/oa;->cq()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->uef:I

    .line 4
    iget p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->oa:I

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/lw/oa;->dz()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int/2addr v1, p3

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->oa:I

    .line 5
    iget p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->yo:I

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p3

    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/lw/oa;->wk()I

    move-result v1

    add-int/2addr v1, p3

    add-int/2addr v1, p4

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->yo:I

    .line 6
    iget p2, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->moa:I

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/lw/oa;->ab()I

    move-result p3

    add-int/2addr p3, p1

    add-int/2addr p3, p5

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/lw/yo;->moa:I

    return-void
.end method
