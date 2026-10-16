.class Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dhk()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->zjm()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
