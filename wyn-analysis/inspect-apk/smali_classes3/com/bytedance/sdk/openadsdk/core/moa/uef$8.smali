.class Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;->uef:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;->oa:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    .line 4
    .line 5
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;->uef:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
