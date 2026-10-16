.class Lcom/bytedance/sdk/openadsdk/component/ivm$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/ivm$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/ivm;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/ivm;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/model/fz;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/ivm;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->yo:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->lw()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->yo:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    :cond_0
    return-void
.end method

.method public uef(ILjava/lang/String;)V
    .locals 0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$7;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/component/ivm;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    return-void
.end method
