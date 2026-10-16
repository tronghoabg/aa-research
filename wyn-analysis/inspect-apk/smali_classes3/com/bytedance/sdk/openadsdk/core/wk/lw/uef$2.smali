.class final Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef$2;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

.field final synthetic uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef$2;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef$2;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef;

    .line 2
    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef$2;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/lw/uef$2;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    .line 10
    .line 11
    invoke-interface {v0, v1, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef;->uef(Landroid/content/Context;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    return-void
.end method
