.class public Lcom/bytedance/adsdk/oa/uef/oa/bs;
.super Lcom/bytedance/adsdk/oa/uef/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bytedance/adsdk/oa/uef/oa/uef<",
        "TK;TA;>;"
    }
.end annotation


# virtual methods
.method public ivm()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef;->yo:Lcom/bytedance/adsdk/oa/xs/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Lcom/bytedance/adsdk/oa/uef/oa/uef;->oa()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/xs/uef;F)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TK;>;F)TA;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public uef(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/adsdk/oa/uef/oa/uef;->oa:F

    return-void
.end method

.method public xs()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
.end method
