.class Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;->uef(Landroid/content/Context;Landroid/content/Intent;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;

.field final synthetic uef:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6$1;->oa:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6$1;->uef:I

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6$1;->oa:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 4
    .line 5
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$6$1;->uef:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
