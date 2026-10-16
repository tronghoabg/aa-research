.class Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/ab;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/model/dhk;->sy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Landroid/os/Handler;

    move-result-object p1

    const/16 p2, 0x65

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/dj;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$7;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x65

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    return-void
.end method
