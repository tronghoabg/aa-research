.class Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/oa;->uef()Lcom/bytedance/sdk/openadsdk/dz/uef/uef/oa;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/oa;->oa()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    :goto_0
    invoke-interface {v1, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;->uef(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    :catch_0
    :cond_1
    return-void
.end method
