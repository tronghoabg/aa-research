.class public Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;
.super Lcom/bytedance/sdk/openadsdk/core/yo/yo;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;


# instance fields
.field private oa:Lcom/bytedance/sdk/component/adexpress/oa/dj;

.field protected uef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/yo/yo;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private uef(Landroid/view/View;IFFFFLandroid/util/SparseArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "IFFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;)V"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;->oa:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    if-eqz v0, :cond_1

    .line 6
    const-string v0, ""

    .line 7
    :try_start_0
    sget v1, Lcom/bytedance/sdk/component/adexpress/dynamic/uef;->tpx:I

    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    :cond_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;-><init>()V

    .line 10
    invoke-virtual {v1, p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 11
    invoke-virtual {p3, p4}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 12
    invoke-virtual {p3, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 13
    invoke-virtual {p3, p6}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->gsd:J

    .line 14
    invoke-virtual {p3, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->rt:J

    .line 15
    invoke-virtual {p3, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 16
    invoke-virtual {p3, p7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->ku:Z

    .line 17
    invoke-virtual {p3, p4}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 18
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 19
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/ab;

    move-result-object p3

    .line 20
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;->oa:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    invoke-interface {p4, p1, p2, p3}, Lcom/bytedance/sdk/component/adexpress/oa/dj;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public uef(Landroid/view/View;)V
    .locals 1

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;->uef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public uef(Landroid/view/View;FFFFLandroid/util/SparseArray;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "FFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;Z)V"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ljava/lang/Integer;

    invoke-virtual {p7}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;->uef(Landroid/view/View;IFFFFLandroid/util/SparseArray;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/bcc/uef/uef;->oa:Lcom/bytedance/sdk/component/adexpress/oa/dj;

    return-void
.end method
