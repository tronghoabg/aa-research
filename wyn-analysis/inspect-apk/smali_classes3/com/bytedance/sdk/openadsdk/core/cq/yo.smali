.class public Lcom/bytedance/sdk/openadsdk/core/cq/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef()V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "tt_ugen_layout"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 2
    sget v0, Lcom/bytedance/adsdk/ugeno/yoga/YogaNative;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static uef(Landroid/content/Context;)V
    .locals 3

    .line 3
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/yo$1;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo$1;-><init>()V

    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/cq/uef;

    invoke-direct {v2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef;-><init>()V

    invoke-virtual {v0, p0, v1, v2}, Lcom/bytedance/adsdk/ugeno/lw;->uef(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/core/yo;Lcom/bytedance/adsdk/ugeno/uef;)V

    .line 4
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object p0

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/yo$2;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo$2;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/lw;->uef(Lcom/bytedance/adsdk/ugeno/moa/bcc;)V

    .line 5
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object p0

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/yo$3;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo$3;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/lw;->uef(Lcom/bytedance/adsdk/ugeno/moa/yo;)V

    .line 6
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object p0

    new-instance v0, Lcom/bytedance/adsdk/uef/yo;

    invoke-direct {v0}, Lcom/bytedance/adsdk/uef/yo;-><init>()V

    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/ugeno/lw;->uef(Lcom/bytedance/adsdk/ugeno/yo/uef;)V

    return-void
.end method
