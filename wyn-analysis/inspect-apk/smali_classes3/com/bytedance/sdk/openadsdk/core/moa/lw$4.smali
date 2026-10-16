.class Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/ivm/yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/lw;->lw()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(ZI)V
    .locals 0

    const/4 p1, 0x1

    if-eq p2, p1, :cond_2

    const/4 p1, 0x2

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->ivm(Lcom/bytedance/sdk/openadsdk/core/moa/lw;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef(I)V

    :cond_1
    return-void

    .line 7
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(I)V

    return-void
.end method

.method public uef(ZIFI)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(ZIIZZ)V
    .locals 0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(Lcom/bytedance/sdk/openadsdk/core/moa/lw;I)V

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/lw;I)I

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->uef(I)V

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/lw$4;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/lw;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/lw;->oa(I)V

    return-void
.end method
