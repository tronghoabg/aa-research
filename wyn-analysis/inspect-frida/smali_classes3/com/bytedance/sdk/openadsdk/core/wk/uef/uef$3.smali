.class Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

.field final synthetic uef:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;->oa:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;->uef:Z

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;->oa:Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pz:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;->uef:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/ivm;->uef(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
