.class Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/gzw$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(JII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

.field final synthetic uef:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->uef:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    move-result-object v1

    const-string v4, ""

    iget v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->uef:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, p1

    move-object v6, p2

    invoke-interface/range {v1 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;->oa(ZILjava/lang/String;ILjava/lang/String;I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/gsd$oa;)V
    .locals 8

    .line 4
    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->oa:Z

    .line 5
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/lz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/lz;->uef()I

    move-result v3

    .line 6
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/lz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/lz;->oa()Ljava/lang/String;

    move-result-object v4

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    move-result-object v1

    iget-boolean v2, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->oa:Z

    const-string v6, ""

    iget v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->uef:I

    const/4 v5, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;->oa(ZILjava/lang/String;ILjava/lang/String;I)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method
