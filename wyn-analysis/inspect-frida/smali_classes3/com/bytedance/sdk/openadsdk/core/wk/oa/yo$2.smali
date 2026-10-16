.class Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;->uef(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
