.class public Lcom/bytedance/adsdk/ugeno/cz/oa/oa;
.super Lcom/bytedance/adsdk/ugeno/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/ugeno/cz/oa/oa$uef;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/adsdk/ugeno/oa/uef<",
        "Lcom/bytedance/adsdk/ugeno/cz/oa/uef;",
        ">;"
    }
.end annotation


# instance fields
.field private qn:Lcom/bytedance/adsdk/ugeno/cz/oa/uef;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/oa/uef;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/oa/oa;->qn:Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->fjj:Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/oa/uef;->setEventMap(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/bytedance/adsdk/ugeno/oa/uef;->oa()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic uef()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/cz/oa/oa;->yo()Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public yo()Lcom/bytedance/adsdk/ugeno/cz/oa/uef;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/oa/uef;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/oa/oa;->qn:Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/cz/oa/uef;->uef(Lcom/bytedance/adsdk/ugeno/moa;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/oa/oa;->qn:Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 14
    .line 15
    return-object v0
.end method

.method public zjm()Lcom/bytedance/adsdk/ugeno/oa/uef$uef;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/ugeno/cz/oa/oa$uef;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/adsdk/ugeno/cz/oa/oa$uef;-><init>(Lcom/bytedance/adsdk/ugeno/oa/uef;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
