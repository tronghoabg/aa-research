.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private bcc:I

.field private cq:Z

.field private cz:I

.field private dj:I

.field private dz:Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;

.field private ivm:J

.field private lw:Z

.field private moa:Z

.field private oa:J

.field private uef:J

.field private wrv:I

.field private xs:Z

.field private yo:J

.field private zjm:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo:J

    .line 11
    .line 12
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->ivm:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->xs:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->cq:Z

    .line 18
    .line 19
    return-void
.end method

.method private ab()V
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-lez v4, :cond_0

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 10
    .line 11
    cmp-long v6, v4, v0

    .line 12
    .line 13
    if-lez v6, :cond_0

    .line 14
    .line 15
    rem-long/2addr v4, v0

    .line 16
    iput-wide v4, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 17
    .line 18
    cmp-long v2, v4, v2

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 23
    .line 24
    :cond_0
    return-void
.end method


# virtual methods
.method public bcc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->zjm:I

    .line 2
    .line 3
    return v0
.end method

.method public cq()Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->dz:Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public dj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->cq:Z

    .line 2
    .line 3
    return v0
.end method

.method public dz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa:Z

    .line 2
    .line 3
    return v0
.end method

.method public ivm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->cz:I

    .line 2
    .line 3
    return v0
.end method

.method public lw()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->bcc:I

    .line 2
    .line 3
    return v0
.end method

.method public moa()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo:J

    return-wide v0
.end method

.method public moa(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->wrv:I

    return-void
.end method

.method public moa(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo:J

    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->ab()V

    return-void
.end method

.method public oa()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    return-wide v0
.end method

.method public oa(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->cz:I

    return-void
.end method

.method public oa(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->ab()V

    return-void
.end method

.method public oa(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa:Z

    return-void
.end method

.method public uef()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->ivm:J

    return-wide v0
.end method

.method public uef(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->bcc:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->ivm:J

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->dz:Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->xs:Z

    return-void
.end method

.method public wk()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public wrv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->xs:Z

    .line 2
    .line 3
    return v0
.end method

.method public xs()I
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-gtz v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef:J

    .line 12
    .line 13
    const-wide/16 v4, 0x64

    .line 14
    .line 15
    mul-long/2addr v2, v4

    .line 16
    div-long/2addr v2, v0

    .line 17
    long-to-int v0, v2

    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method public yo()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa:J

    return-wide v0
.end method

.method public yo(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->zjm:I

    return-void
.end method

.method public yo(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa:J

    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->lw:Z

    return-void
.end method

.method public zjm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->wrv:I

    .line 2
    .line 3
    return v0
.end method
