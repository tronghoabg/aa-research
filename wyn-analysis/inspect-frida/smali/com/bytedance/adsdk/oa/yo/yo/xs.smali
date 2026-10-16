.class public Lcom/bytedance/adsdk/oa/yo/yo/xs;
.super Lcom/bytedance/adsdk/oa/yo/yo/uef;
.source "SourceFile"


# instance fields
.field private final bcc:Lcom/bytedance/adsdk/oa/yo/yo/oa;

.field private final xs:Lcom/bytedance/adsdk/oa/uef/uef/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/lw;Lcom/bytedance/adsdk/oa/yo/yo/oa;Lcom/bytedance/adsdk/oa/xs;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/adsdk/oa/yo/yo/uef;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/lw;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->bcc:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 5
    .line 6
    new-instance p3, Lcom/bytedance/adsdk/oa/yo/oa/ab;

    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/bytedance/adsdk/oa/yo/yo/lw;->dz()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const/4 v0, 0x0

    .line 13
    const-string v1, "__container"

    .line 14
    .line 15
    invoke-direct {p3, v1, p2, v0}, Lcom/bytedance/adsdk/oa/yo/oa/ab;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/bytedance/adsdk/oa/uef/uef/moa;

    .line 19
    .line 20
    invoke-direct {p2, p1, p0, p3, p4}, Lcom/bytedance/adsdk/oa/uef/uef/moa;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Lcom/bytedance/adsdk/oa/yo/oa/ab;Lcom/bytedance/adsdk/oa/xs;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->xs:Lcom/bytedance/adsdk/oa/uef/uef/moa;

    .line 24
    .line 25
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p2, p1, p1}, Lcom/bytedance/adsdk/oa/uef/uef/moa;->uef(Ljava/util/List;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public dj()Lcom/bytedance/adsdk/oa/lw/zjm;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->dj()Lcom/bytedance/adsdk/oa/lw/zjm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->bcc:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->dj()Lcom/bytedance/adsdk/oa/lw/zjm;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public oa(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->oa(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->xs:Lcom/bytedance/adsdk/oa/uef/uef/moa;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/adsdk/oa/uef/uef/moa;->uef(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public uef(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->xs:Lcom/bytedance/adsdk/oa/uef/uef/moa;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {p2, p1, v0, p3}, Lcom/bytedance/adsdk/oa/uef/uef/moa;->uef(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public zjm()Lcom/bytedance/adsdk/oa/yo/oa/uef;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->zjm()Lcom/bytedance/adsdk/oa/yo/oa/uef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo/xs;->bcc:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->zjm()Lcom/bytedance/adsdk/oa/yo/oa/uef;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method
