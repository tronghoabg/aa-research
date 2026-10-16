.class Lcom/bytedance/sdk/openadsdk/yo/yo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/yo/moa$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/yo/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/yo/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/ku$uef;->uef()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void

    .line 22
    :goto_0
    const-string v1, "TTAdDislikeImpl"

    .line 23
    .line 24
    const-string v2, "dislike callback cancel error: "

    .line 25
    .line 26
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Z)V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/yo/moa;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/yo/moa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/yo/moa;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa(Lcom/bytedance/sdk/openadsdk/yo/yo;)V

    return-void
.end method

.method public uef(ILcom/bytedance/sdk/openadsdk/FilterWord;)V
    .locals 2

    .line 5
    :try_start_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/FilterWord;->hasSecondOptions()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo$2;->uef:Lcom/bytedance/sdk/openadsdk/yo/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/FilterWord;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/ku$uef;->uef(ILjava/lang/String;)V

    .line 8
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/FilterWord;->getName()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
