.class public Lcom/bytedance/sdk/openadsdk/uef/oa/uef/uef;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/uef;
.source "SourceFile"


# instance fields
.field private uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

.field private wrv:Lcom/bytedance/sdk/openadsdk/uef/oa/uef;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public setExtraFuncationHelper(Lcom/bytedance/sdk/openadsdk/uef/oa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/uef/oa/uef/uef;->wrv:Lcom/bytedance/sdk/openadsdk/uef/oa/uef;

    .line 2
    .line 3
    return-void
.end method

.method public uef(Landroid/view/View;ILcom/bytedance/sdk/openadsdk/core/model/ab;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/uef/oa/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;)V
    .locals 2

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/uef/oa/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 4
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
