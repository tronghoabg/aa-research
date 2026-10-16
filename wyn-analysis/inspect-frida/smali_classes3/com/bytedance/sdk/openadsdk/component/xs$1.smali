.class Lcom/bytedance/sdk/openadsdk/component/xs$1;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/xs;->yo(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/component/xs;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;I)I

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    const/4 v2, 0x2

    const/16 v3, 0x64

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IIILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$1;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-static {v0, p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    return-void
.end method
