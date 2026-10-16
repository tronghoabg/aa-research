.class Lcom/bytedance/sdk/openadsdk/core/gsd$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/gzw$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/gsd;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/gzw$uef;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/model/ue;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field final synthetic yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/gsd;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/gzw$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->lw:Lcom/bytedance/sdk/openadsdk/core/gsd;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/ue;

    .line 6
    .line 7
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->yo:I

    .line 8
    .line 9
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->moa:Lcom/bytedance/sdk/openadsdk/core/gzw$uef;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->lw:Lcom/bytedance/sdk/openadsdk/core/gsd;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/ue;

    .line 6
    .line 7
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->yo:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$1;->moa:Lcom/bytedance/sdk/openadsdk/core/gzw$uef;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/openadsdk/core/gsd;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/gzw$uef;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
