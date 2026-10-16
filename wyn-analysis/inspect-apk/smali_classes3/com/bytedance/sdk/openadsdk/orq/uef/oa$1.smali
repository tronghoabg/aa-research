.class Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/cq/xs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->bcc()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/orq/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/oa;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;)Lcom/bytedance/sdk/openadsdk/cq/xs;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/oa;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;)Lcom/bytedance/sdk/openadsdk/cq/xs;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/cq/xs;->uef()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/oa;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/orq/uef/oa;Z)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method
