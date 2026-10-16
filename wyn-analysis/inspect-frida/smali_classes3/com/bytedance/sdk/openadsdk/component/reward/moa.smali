.class public Lcom/bytedance/sdk/openadsdk/component/reward/moa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;
    }
.end annotation


# instance fields
.field private bcc:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

.field private ivm:Z

.field private lw:J

.field private moa:Z

.field private final oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private final uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

.field private xs:J

.field private final yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->moa:Z

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->lw:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ivm:Z

    .line 13
    .line 14
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/moa$1;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/moa;)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-wide/16 v3, 0xa

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    double-to-long v5, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-wide v5, v3

    .line 38
    :goto_0
    cmp-long v0, v5, v0

    .line 39
    .line 40
    if-gtz v0, :cond_1

    .line 41
    .line 42
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->uef(D)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-wide v3, v5

    .line 49
    :goto_1
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 50
    .line 51
    const-wide/16 v0, 0x3e8

    .line 52
    .line 53
    mul-long/2addr v3, v0

    .line 54
    invoke-direct {p1, v3, v4, v2, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;-><init>(JLcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public ab()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->xs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public bcc()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bs()Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->oa()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public cz()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ab()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ivm()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bs()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public lw()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->moa()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public moa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->cq()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public oa()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->wrv()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ivm()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->cz()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->xs()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ab()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(J)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 40
    .line 41
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->bcc:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;->uef(I)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public uef()V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->zjm()V

    return-void
.end method

.method public uef(J)V
    .locals 1

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->xs:J

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef(J)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->bcc:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    return-void
.end method

.method public uef(ZI)V
    .locals 0

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->moa()V

    return-void
.end method

.method public uef(ZLjava/lang/String;)V
    .locals 0

    .line 15
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ivm:Z

    return-void
.end method

.method public uef(F)Z
    .locals 0

    .line 2
    const/4 p1, 0x0

    return p1
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)Z
    .locals 4

    .line 7
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dj()Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ivm:Z

    .line 8
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->zjm()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->zjm()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->oa(J)V

    .line 10
    :cond_0
    const-string v0, "player_force_raw_url"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    invoke-virtual {p1, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oa(Z)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    invoke-static {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->dj()V

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->bcc:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    if-eqz p1, :cond_2

    .line 14
    invoke-interface {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;->uef(I)V

    :cond_2
    return v2
.end method

.method public wk()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public wrv()Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public xs()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public yo()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->dj()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->ivm()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->cz()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->xs()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->yo:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 33
    .line 34
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->bcc:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;->uef(I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public zjm()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v0, v1, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/uef;->uef(JJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method
