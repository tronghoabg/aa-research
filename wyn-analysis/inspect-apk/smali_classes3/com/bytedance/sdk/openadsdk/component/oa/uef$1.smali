.class Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/oa/uef;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/common/xs;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/oa/uef;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field final synthetic oa:Landroid/content/Context;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/common/xs;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/oa/uef;Lcom/bytedance/sdk/openadsdk/common/xs;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->lw:Lcom/bytedance/sdk/openadsdk/component/oa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/common/xs;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->oa:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/common/xs;

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/common/xs;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->lw:Lcom/bytedance/sdk/openadsdk/component/oa/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->oa:Landroid/content/Context;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/common/xs;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/oa/uef$1;->moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/component/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/component/oa/uef;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/common/xs;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    return-void
.end method
