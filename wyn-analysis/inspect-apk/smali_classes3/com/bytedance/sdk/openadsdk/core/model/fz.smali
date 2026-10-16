.class public Lcom/bytedance/sdk/openadsdk/core/model/fz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:J

.field private cq:I

.field private cz:J

.field private dj:I

.field private ivm:J

.field private lw:J

.field private moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field public oa:J

.field public uef:Z

.field private wrv:J

.field private xs:J

.field private yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field private zjm:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->yo()Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 9
    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->yo()Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public bcc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public cz()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->wrv:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public ivm()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->cz:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public lw()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->bcc:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public moa()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->xs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public oa()J
    .locals 2

    .line 3
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->lw:J

    return-wide v0
.end method

.method public declared-synchronized oa(I)V
    .locals 0

    monitor-enter p0

    .line 5
    :try_start_0
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->cq:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public oa(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->wrv:J

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->moa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/pu;->uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->cz:J

    return-void
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/utils/pu;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

    return-object v0
.end method

.method public uef(I)V
    .locals 0

    .line 8
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->dj:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->zjm:J

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/utils/pu;Lcom/bytedance/sdk/openadsdk/utils/pu;ILcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->yo:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/pu;->uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->lw:J

    .line 2
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/utils/pu;->uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->ivm:J

    int-to-long v0, p3

    .line 3
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->xs:J

    .line 4
    invoke-virtual {p4, p2}, Lcom/bytedance/sdk/openadsdk/utils/pu;->uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->bcc:J

    return-void
.end method

.method public xs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->zjm:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public yo()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->ivm:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public declared-synchronized zjm()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->cq:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method
