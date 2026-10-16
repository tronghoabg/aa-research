.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ab:J

.field private final bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private bs:I

.field private cp:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

.field private cq:Z

.field private cz:Landroid/widget/FrameLayout;

.field private dhk:Ljava/lang/String;

.field private dj:J

.field private dz:Z

.field private volatile fz:Z

.field private gr:I

.field private gsd:Z

.field private final gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

.field private ku:Lcom/bytedance/sdk/openadsdk/moa/xs;

.field protected lw:Z

.field final moa:Z

.field oa:Z

.field private oib:J

.field private orq:Z

.field private pz:Z

.field private rt:Z

.field private sy:J

.field private tpx:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private ue:F

.field protected uef:Z

.field private wk:Z

.field private wrv:J

.field private final xs:Landroid/app/Activity;

.field yo:Z

.field private final zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw:Z

    .line 10
    .line 11
    const-wide/16 v1, -0x1

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ab:J

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    .line 19
    .line 20
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    .line 21
    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pz:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->fz:Z

    .line 29
    .line 30
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 31
    .line 32
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->xs:Landroid/app/Activity;

    .line 35
    .line 36
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 39
    .line 40
    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->moa:Z

    .line 43
    .line 44
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->zjm:Ljava/lang/String;

    .line 47
    .line 48
    new-instance p1, Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->tpx:Ljava/util/HashSet;

    .line 54
    .line 55
    return-void
.end method

.method private dor()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->ivm()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj:J

    .line 19
    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->yo()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->oa()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 45
    .line 46
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->oa()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 50
    .line 51
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->moa()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef:Z

    .line 56
    .line 57
    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk:Ljava/lang/String;

    return-object p0
.end method

.method private oa(JJ)V
    .locals 5

    .line 3
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    int-to-long v0, v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    long-to-int v0, v0

    .line 4
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    if-ltz v1, :cond_2

    const/16 v2, 0x1f4

    if-gt v0, v2, :cond_2

    int-to-long v3, v1

    cmp-long p3, v3, p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    if-ge v0, v2, :cond_2

    .line 5
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->tpx:Ljava/util/HashSet;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    .line 6
    iget p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    int-to-long p3, p3

    cmp-long p1, p3, p1

    if-lez p1, :cond_1

    .line 7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs$1;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;)V

    int-to-long p3, v0

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->km()V

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef(ILjava/lang/String;)V

    .line 10
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->tpx:Ljava/util/HashSet;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    return p0
.end method

.method private uef(JZ)Z
    .locals 5

    .line 105
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wg()I

    move-result v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/CacheDirFactory;->getICacheDir(I)Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;

    move-result-object v0

    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;->uef()Ljava/lang/String;

    move-result-object v0

    .line 107
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    const/4 v1, 0x1

    .line 109
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa:Z

    .line 110
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/wk/uef/oa;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oa(Ljava/lang/String;)V

    .line 112
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oa(I)V

    .line 113
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->yo(I)V

    .line 114
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->yo(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef(J)V

    .line 116
    invoke-virtual {v0, p3}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef(Z)V

    .line 117
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    invoke-interface {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    return-object p0
.end method


# virtual methods
.method public ab()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->oa()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void

    .line 16
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "RewardFullVideoPlayerManager onPause throw Exception :"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    new-array v1, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public af()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->oyt()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public au()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq:Z

    .line 2
    .line 3
    return v0
.end method

.method public bcc()Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/bytedance/sdk/openadsdk/component/reward/moa;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->bs()Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->wrv()Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public bs()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->xs()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public cop()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->ivm()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj:J

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Z)V

    .line 25
    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq:Z

    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public cp()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public cq()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->ivm()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj:J

    .line 11
    .line 12
    return-wide v0
.end method

.method public cz()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->xs()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public dhk()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->lw()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public dj()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->fz:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x12c

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public dxx()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    const-string v1, "switch"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Lorg/json/JSONObject;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    const-string v1, "TTAD.RFVideoPlayerMag"

    .line 27
    .line 28
    const-string v2, "onStopPlaySpeed: "

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public dz()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wrv:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public fz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->fz:Z

    .line 2
    .line 3
    return v0
.end method

.method public gb()D
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gsd()Lcom/bytedance/sdk/openadsdk/core/model/tpx;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/tpx;->oa()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    :goto_0
    long-to-double v0, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 24
    .line 25
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/tpx;->moa()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->orq()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    int-to-double v3, v0

    .line 55
    mul-double v0, v1, v3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const-wide/16 v0, 0x0

    .line 59
    .line 60
    :goto_1
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 61
    .line 62
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xvp:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    double-to-long v3, v0

    .line 67
    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef(J)V

    .line 68
    .line 69
    .line 70
    :cond_3
    return-wide v0
.end method

.method public gem()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public gr()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->cz()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 10
    .line 11
    invoke-interface {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->xs()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    add-long/2addr v2, v0

    .line 16
    return-wide v2

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public gsd()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->zjm()I

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

.method public gzw()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->cz()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public ivm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->ivm()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public km()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->orq()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "onPause throw Exception :"

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "TTAD.RFVideoPlayerMag"

    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public ku()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public lw()Lcom/bytedance/sdk/openadsdk/moa/xs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ku:Lcom/bytedance/sdk/openadsdk/moa/xs;

    return-object v0
.end method

.method public lw(Z)V
    .locals 2

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wk:Z

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->ivm(Z)V

    :cond_0
    return-void
.end method

.method public lz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->yo:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa(Z)V
    .locals 1

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gsd:Z

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    instance-of v0, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->orq()I

    move-result p1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa(I)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm(I)V

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa(I)V

    return-void
.end method

.method public moa()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pz:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    if-ne v0, v2, :cond_3

    :cond_2
    return v2

    :cond_3
    return v1
.end method

.method public oa()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->sy:J

    return-wide v0
.end method

.method public oa(J)V
    .locals 0

    .line 11
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj:J

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 3

    .line 15
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pz()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wk()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->uef(JZ)Z

    :cond_0
    return-void
.end method

.method public oa(Z)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_0

    .line 13
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->oa()V

    .line 14
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dz:Z

    :cond_0
    return-void
.end method

.method public oib()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->moa()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 11
    .line 12
    return-void
.end method

.method public orq()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->oa()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public oyt()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oib()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public pu()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->uef()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public pz()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->xs()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef;->bcc()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 32
    .line 33
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->km()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return v2

    .line 43
    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wrv()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Z)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 53
    .line 54
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->km()V

    .line 61
    .line 62
    .line 63
    :cond_3
    return v2

    .line 64
    :cond_4
    return v1
.end method

.method public rl()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->gb()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public rt()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->bcc()I

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

.method public sk()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->pu()Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public swd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->af()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public sy()Lcom/bykv/vk/openvk/uef/uef/uef/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public tpx()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->yo()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public ue()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->cz()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public uef()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ab:J

    return-wide v0
.end method

.method public uef(II)V
    .locals 3

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_0

    .line 31
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 32
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 33
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 34
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 35
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(I)V

    .line 36
    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(I)V

    .line 37
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    invoke-interface {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->wrv()Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->moa(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    :cond_0
    return-void
.end method

.method public uef(ILjava/lang/String;)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs:I

    .line 28
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk:Ljava/lang/String;

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ab:J

    return-void
.end method

.method public uef(JJ)V
    .locals 2

    .line 23
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wrv:J

    .line 24
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->fz:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pu()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj()V

    .line 26
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa(JJ)V

    return-void
.end method

.method public uef(Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 3

    .line 4
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->orq:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->orq:Z

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz:Landroid/widget/FrameLayout;

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bbb()Lcom/bytedance/sdk/openadsdk/core/model/ku;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bbb()Lcom/bytedance/sdk/openadsdk/core/model/ku;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ku;->oa()I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bbb()Lcom/bytedance/sdk/openadsdk/core/model/ku;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ku;->uef()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    .line 10
    :cond_1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ku:Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pz:Z

    .line 13
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->xs:Landroid/app/Activity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 14
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gsd:Z

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->moa(Z)V

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cp:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    if-eqz p1, :cond_2

    .line 16
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;)V

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wk:Z

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->ivm(Z)V

    return-void

    :cond_3
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pz:Z

    .line 19
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/reward/moa;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p1, v0, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 20
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cp:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    if-eqz p2, :cond_4

    .line 21
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_0

    .line 39
    invoke-interface {v0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V
    .locals 4

    .line 69
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cop:Z

    if-nez v1, :cond_1

    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    .line 73
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->moa()Z

    move-result v1

    .line 74
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget v3, v3, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dz(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    if-nez v0, :cond_3

    if-ne v2, v3, :cond_3

    if-eqz v1, :cond_3

    goto :goto_0

    .line 75
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 76
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    .line 77
    :cond_5
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw:Z

    if-eqz v0, :cond_6

    goto :goto_0

    .line 78
    :cond_6
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->lw()Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    return-void

    .line 79
    :cond_7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj()V

    .line 80
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object p1

    const/16 v0, 0x12c

    .line 81
    iput v0, p1, Landroid/os/Message;->what:I

    .line 82
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 83
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->fz:Z

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 2

    const/4 v0, 0x0

    .line 118
    :try_start_0
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw:Z

    .line 119
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wrv()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dor()V

    .line 121
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 123
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->tpx()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    .line 124
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onContinue throw Exception :"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "TTAD.RFVideoPlayerMag"

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cp:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ku:Lcom/bytedance/sdk/openadsdk/moa/xs;

    return-void
.end method

.method public uef(Ljava/lang/String;Z)V
    .locals 10

    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_3

    .line 43
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v0

    .line 44
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uqx()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 45
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm()J

    move-result-wide v0

    :cond_0
    move-wide v5, v0

    .line 46
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 47
    invoke-interface {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->xs()J

    move-result-wide v1

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 48
    invoke-interface {v3}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;

    move-result-object v3

    .line 49
    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;JLcom/bykv/vk/openvk/uef/uef/uef/uef;)Lorg/json/JSONObject;

    move-result-object v8

    .line 50
    :try_start_0
    const-string v0, "auto_click"

    invoke-virtual {v8, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    if-nez p2, :cond_2

    .line 51
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    if-eqz v0, :cond_1

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 52
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ho()I

    move-result p2

    goto :goto_0

    :cond_1
    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qe()I

    move-result p2

    :goto_0
    long-to-int v0, v5

    .line 53
    invoke-static {v8, p2, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lorg/json/JSONObject;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :catch_0
    :cond_2
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->zjm:Ljava/lang/String;

    .line 55
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gsd()I

    move-result v7

    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ku:Lcom/bytedance/sdk/openadsdk/moa/xs;

    move-object v4, p1

    .line 56
    invoke-static/range {v2 .. v9}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;JILorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 57
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr()J

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gsd()I

    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rl()V

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef:Z

    return-void
.end method

.method public uef(ZLcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Z)V
    .locals 1

    .line 125
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dz:Z

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw:Z

    if-eqz p1, :cond_1

    :cond_0
    return-void

    .line 126
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cz()Z

    move-result p1

    const-string p3, "TTAD.RFVideoPlayerMag"

    if-eqz p1, :cond_2

    .line 127
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->tpx()V

    .line 128
    const-string p1, "resumeOrRestartVideo: continue play"

    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 129
    :cond_2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dor()V

    .line 130
    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 131
    const-string p1, "resumeOrRestartVideo: recreate video player & exec play"

    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 p1, 0x0

    .line 132
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dz:Z

    return-void
.end method

.method public uef(ZLjava/lang/String;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(JZLjava/util/Map;Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;",
            ")Z"
        }
    .end annotation

    .line 59
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cp()Z

    move-result v0

    const-string v1, "show_ad_fail"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 60
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    const-string p3, "video_controller_not_ready"

    invoke-static {p2, v1, p1, p3}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    if-eqz p3, :cond_2

    .line 62
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ku()Z

    move-result v0

    if-nez v0, :cond_3

    .line 63
    :cond_2
    invoke-virtual {p0, p5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V

    .line 64
    :cond_3
    :try_start_0
    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean p5, p5, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-direct {p0, p1, p2, p5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(JZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 65
    :try_start_1
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    move v2, p1

    goto :goto_0

    :catch_1
    move-exception p2

    .line 66
    :goto_0
    const-string p1, "TTAD.RFVideoPlayerMag"

    const-string p5, "playVideo: "

    invoke-static {p1, p5, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move p1, v2

    :goto_1
    if-eqz p1, :cond_4

    if-nez p3, :cond_4

    .line 67
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    invoke-virtual {p2, p4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->uef(Ljava/util/Map;)V

    goto :goto_2

    :cond_4
    if-nez p1, :cond_5

    .line 68
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p3, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    const-string p4, "video_play_fail"

    invoke-static {p3, v1, p2, p4}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return p1

    :cond_6
    :goto_3
    const/4 p1, 0x1

    return p1
.end method

.method public uef(Lorg/json/JSONObject;)Z
    .locals 9

    .line 84
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_8

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    goto/16 :goto_2

    .line 85
    :cond_0
    const-string v0, "switch"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 86
    const-string v3, "speed"

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v3, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v3

    double-to-float p1, v3

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    const/4 v3, 0x0

    cmpg-float p1, p1, v3

    if-gtz p1, :cond_1

    .line 87
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bbb()Lcom/bytedance/sdk/openadsdk/core/model/ku;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 88
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bbb()Lcom/bytedance/sdk/openadsdk/core/model/ku;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ku;->uef()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    :cond_1
    if-nez v0, :cond_3

    const/high16 p1, 0x3f800000    # 1.0f

    .line 89
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    .line 90
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    if-eqz p1, :cond_4

    .line 91
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->sy:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oib:J

    sub-long/2addr v5, v7

    add-long/2addr v5, v3

    iput-wide v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->sy:J

    .line 92
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz p1, :cond_2

    .line 93
    invoke-interface {p1, v5, v6}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(J)V

    .line 94
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz p1, :cond_4

    .line 95
    invoke-interface {p1, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->moa(Z)V

    goto :goto_0

    :cond_3
    if-ne v0, v2, :cond_4

    .line 96
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    if-nez p1, :cond_4

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oib:J

    .line 98
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz p1, :cond_4

    .line 99
    invoke-interface {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->moa(Z)V

    :cond_4
    :goto_0
    if-ne v0, v2, :cond_5

    move p1, v2

    goto :goto_1

    :cond_5
    move p1, v1

    .line 100
    :goto_1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    .line 101
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr:I

    if-ne p1, v2, :cond_6

    return v2

    .line 102
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-nez p1, :cond_7

    return v1

    .line 103
    :cond_7
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue:F

    invoke-interface {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(F)Z

    move-result p1

    return p1

    .line 104
    :cond_8
    :goto_2
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    return v1
.end method

.method public wk()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public wrv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef:Z

    .line 2
    .line 3
    return v0
.end method

.method public xs()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->cq()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public yo(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->yo:Z

    return-void
.end method

.method public yo()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt:Z

    return v0
.end method

.method public zjm()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->dz()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method
