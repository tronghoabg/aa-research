.class Lcom/bytedance/sdk/openadsdk/core/moa/yo$1;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/yo;->yo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/moa/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/yo;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    .line 2
    .line 3
    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p6}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public yo(I)Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->yo(I)Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->uef(Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;)Lcom/bytedance/sdk/openadsdk/gsd/oa/lw$uef;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
