.class Lcom/bytedance/sdk/openadsdk/orq/uef/yo$2;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/orq/uef/yo;->yo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/orq/uef/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/orq/uef/yo;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/yo;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    const-string v0, "model"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "pag_plb_config"

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/oib/moa/uef;->oa(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/orq/oa/uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/oa/uef;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/orq/uef/yo;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v1, v0, v2, v3}, Lcom/bytedance/sdk/openadsdk/orq/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/orq/uef/yo;Lcom/bytedance/sdk/openadsdk/orq/oa/uef;Lcom/bytedance/sdk/openadsdk/orq/oa/uef;I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
