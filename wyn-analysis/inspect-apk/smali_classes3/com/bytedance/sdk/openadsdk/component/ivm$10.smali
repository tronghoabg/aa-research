.class Lcom/bytedance/sdk/openadsdk/component/ivm$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/utils/sy$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/component/ivm$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:Lcom/bytedance/sdk/openadsdk/component/ivm;

.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/ivm$uef;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field final synthetic uef:I

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/ivm;ILcom/bytedance/sdk/openadsdk/utils/pu;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/component/ivm$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->ivm:Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->uef:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->moa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm$uef;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 4

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;JZ)V

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm$uef;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/component/ivm$uef;->uef()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;->lw()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->ivm:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->uef:I

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->oa(I)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    move-result-wide v0

    .line 4
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v3, 0x1

    invoke-static {v2, v0, v1, v3}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;JZ)V

    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->moa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(J)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->moa:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(I)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm$uef;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/ivm$uef;->uef(Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;)V

    return-void

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;JZ)V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/ivm$10;->lw:Lcom/bytedance/sdk/openadsdk/component/ivm$uef;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/component/ivm$uef;->uef()V

    return-void
.end method
