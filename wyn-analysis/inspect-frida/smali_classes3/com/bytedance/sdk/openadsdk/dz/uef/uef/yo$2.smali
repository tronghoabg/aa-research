.class Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef;

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
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    return-void
.end method
