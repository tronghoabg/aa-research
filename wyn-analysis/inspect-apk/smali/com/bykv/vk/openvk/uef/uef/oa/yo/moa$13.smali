.class Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->dj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$13;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$13;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bcc(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Lcom/bytedance/sdk/component/utils/ue;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa$13;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->bcc(Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;)Lcom/bytedance/sdk/component/utils/ue;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x65

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
