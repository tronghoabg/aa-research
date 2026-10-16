.class Lcom/bytedance/sdk/openadsdk/component/ivm$6;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/component/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/ivm;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->oa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

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
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/component/ivm;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->oa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    const/16 p2, 0x64

    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/fz;II)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$6;->oa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {v0, p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/component/ivm;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;)V

    return-void
.end method
