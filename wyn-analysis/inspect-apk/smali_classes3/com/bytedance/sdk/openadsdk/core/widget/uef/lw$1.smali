.class Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/oa$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Ljava/lang/String;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->yo:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->uef:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->oa:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->yo:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->uef:Ljava/lang/String;

    const-string v4, ""

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->oa:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/Throwable;)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->yo:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->uef:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw$1;->oa:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
