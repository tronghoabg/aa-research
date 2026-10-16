.class Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;ILjava/lang/String;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    return-void
.end method
