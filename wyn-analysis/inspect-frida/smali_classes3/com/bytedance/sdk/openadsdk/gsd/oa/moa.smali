.class public Lcom/bytedance/sdk/openadsdk/gsd/oa/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gv()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;

    .line 5
    .line 6
    const-string v1, "mrc_report"

    .line 7
    .line 8
    invoke-direct {v0, v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/gsd/oa/uef;Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
