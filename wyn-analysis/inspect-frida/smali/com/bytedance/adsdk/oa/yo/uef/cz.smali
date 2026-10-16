.class public Lcom/bytedance/adsdk/oa/yo/uef/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/yo/uef/cq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/adsdk/oa/yo/uef/cq<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field private final oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

.field private final uef:Lcom/bytedance/adsdk/oa/yo/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/yo/uef/oa;Lcom/bytedance/adsdk/oa/yo/uef/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->uef:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public oa()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->uef:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/uef/oa;->oa()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/uef/oa;->oa()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public uef()Lcom/bytedance/adsdk/oa/uef/oa/uef;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bytedance/adsdk/oa/uef/oa/uef<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/oa/uef/oa/dz;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->uef:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/yo/uef/oa;->uef()Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/bytedance/adsdk/oa/yo/uef/cz;->oa:Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/bytedance/adsdk/oa/yo/uef/oa;->uef()Lcom/bytedance/adsdk/oa/uef/oa/uef;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/bytedance/adsdk/oa/uef/oa/dz;-><init>(Lcom/bytedance/adsdk/oa/uef/oa/uef;Lcom/bytedance/adsdk/oa/uef/oa/uef;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public yo()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "Landroid/graphics/PointF;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
