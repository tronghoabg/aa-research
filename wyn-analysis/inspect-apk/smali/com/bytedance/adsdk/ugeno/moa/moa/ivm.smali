.class public Lcom/bytedance/adsdk/ugeno/moa/moa/ivm;
.super Lcom/bytedance/adsdk/ugeno/moa/moa/yo;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public varargs uef([Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->oa()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    .line 14
    .line 15
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/bytedance/adsdk/ugeno/moa/dj;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/ugeno/moa/ivm;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return p1
.end method
