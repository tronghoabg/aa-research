.class Lcom/bytedance/sdk/openadsdk/core/zjm/rt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/gr$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/rt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/zjm/rt;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/rt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/rt;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Landroid/content/Context;Landroid/content/Intent;ZI)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/rt$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/rt;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p4}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
