.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static oa:I = 0x1

.field public static uef:I = 0x0

.field public static yo:I = 0x2


# instance fields
.field private lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

.field private final moa:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->geh()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->moa:Z

    .line 9
    .line 10
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;

    .line 17
    .line 18
    invoke-direct {p2, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bcc;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->lw()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public cz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->dz()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public dj()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->wk()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public ivm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->cz()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public lw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->moa()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public moa()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->zjm()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public moa(I)Z
    .locals 1

    .line 3
    sget v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->oa:I

    if-ne p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->cq()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public oa(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef(I)V

    :cond_0
    return-void
.end method

.method public oa(Z)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->yo(Z)V

    :cond_0
    return-void
.end method

.method public oa()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/orq/bcc;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public uef(I)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    int-to-long v1, p1

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef(J)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/yo/lw;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/lw;)V

    :cond_0
    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->oa(Z)V

    :cond_0
    return-void
.end method

.method public xs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/cq/lw;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public yo(I)V
    .locals 1

    .line 2
    sget v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->yo:I

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->ivm()V

    :cond_0
    return-void
.end method

.method public zjm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->yo()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
