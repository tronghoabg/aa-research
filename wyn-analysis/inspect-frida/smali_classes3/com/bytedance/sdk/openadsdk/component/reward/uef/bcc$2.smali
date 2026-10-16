.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;->yo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;I)I

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->sy:Lcom/bytedance/sdk/openadsdk/orq/uef/uef;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 24
    .line 25
    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
