.class Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/uef;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1$5;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1$5;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->au(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1$5;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->dor(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
