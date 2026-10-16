.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ab:Z

.field private volatile bcc:J

.field private bs:Z

.field private cq:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private cz:Ljava/lang/String;

.field private dj:J

.field private dz:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private volatile ivm:J

.field private final lw:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final moa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field final uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private wk:Ljava/lang/String;

.field private wrv:J

.field private volatile xs:J

.field private yo:Landroid/widget/FrameLayout;

.field private final zjm:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->lw:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dj:J

    .line 29
    .line 30
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wrv:J

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wk:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->ab:Z

    .line 36
    .line 37
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 38
    .line 39
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->lw:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wrv:J

    return-wide v0
.end method

.method private dz()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->pu()Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    if-nez v4, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 16
    .line 17
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    .line 21
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$3;

    .line 24
    .line 25
    invoke-direct {v6, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)V

    .line 26
    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$4;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dz()V

    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->ivm:J

    return-wide v0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->xs:J

    return-wide p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;Lcom/bytedance/adsdk/ugeno/oa/yo;)Lcom/bytedance/adsdk/ugeno/oa/yo;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dz:Lcom/bytedance/adsdk/ugeno/oa/yo;

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)Ljava/lang/String;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dj:J

    return-wide p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;Lcom/bytedance/adsdk/ugeno/oa/yo;)Lcom/bytedance/adsdk/ugeno/oa/yo;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cq:Lcom/bytedance/adsdk/ugeno/oa/yo;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wk:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->ab:Z

    return p1
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->xs:J

    return-wide v0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dj:J

    return-wide v0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wrv:J

    return-wide p1
.end method


# virtual methods
.method public bcc()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dz:Lcom/bytedance/adsdk/ugeno/oa/yo;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->yo:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v0

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dz:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->km()I

    move-result v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->dz:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v4}, Lcom/bytedance/adsdk/ugeno/oa/yo;->pu()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->lw:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public cz()V
    .locals 5

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bcc:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->xs:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->xs:J

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bcc:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wk:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public dj()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bcc:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public ivm()V
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bcc:J

    return-void
.end method

.method public lw()V
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->ivm:J

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    return-void
.end method

.method public moa()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->ab:Z

    return v0
.end method

.method public oa()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->km:Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    sget v1, Lcom/bytedance/sdk/openadsdk/utils/bs;->bs:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->yo:Landroid/widget/FrameLayout;

    return-void
.end method

.method public uef()V
    .locals 1

    .line 6
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bs:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bs:Z

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa()V

    return-void
.end method

.method public uef(I)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->yo:Landroid/widget/FrameLayout;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public wrv()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public xs()V
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->zjm()V

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz()V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cq:Lcom/bytedance/adsdk/ugeno/oa/yo;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->yo:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v0

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cq:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->km()I

    move-result v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cq:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v4}, Lcom/bytedance/adsdk/ugeno/oa/yo;->pu()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public yo()V
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->km()Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    move-result-object v4

    if-nez v4, :cond_1

    :goto_0
    return-void

    .line 5
    :cond_1
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    new-instance v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$1;

    invoke-direct {v6, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)V

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;)V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->pu()Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;)V

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;)V

    .line 8
    :cond_2
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef()V

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Landroid/view/View;)V

    return-void
.end method

.method public zjm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cz:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
