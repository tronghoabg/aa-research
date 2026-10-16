.class public abstract Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;
.implements Lcom/bytedance/sdk/component/utils/ue$uef;
.implements Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;


# instance fields
.field protected ab:Z

.field private final af:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected bs:Z

.field protected cp:Z

.field protected cq:Z

.field protected cz:J

.field protected dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected final dj:Landroid/content/Context;

.field protected dxx:J

.field protected dz:Z

.field protected fz:Z

.field private gb:I

.field protected gr:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$oa;",
            ">;"
        }
    .end annotation
.end field

.field protected gsd:Z

.field protected gzw:Lcom/bytedance/sdk/openadsdk/core/wk/uef/oa;

.field protected ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

.field private km:J

.field protected ku:J

.field protected lw:Landroid/graphics/SurfaceTexture;

.field protected lz:Ljava/lang/Runnable;

.field protected moa:Landroid/view/SurfaceHolder;

.field protected final oa:I

.field protected oib:Z

.field protected orq:Z

.field private oyt:J

.field private pu:Z

.field protected pz:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

.field protected final rt:Landroid/view/ViewGroup;

.field protected sy:Z

.field protected tpx:Z

.field protected ue:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

.field protected uef:Ljava/lang/String;

.field protected wk:Z

.field protected final wrv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field protected xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

.field protected final yo:Lcom/bytedance/sdk/component/utils/ue;

.field protected zjm:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "TTAD.VideoController"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v0, 0x64

    .line 9
    .line 10
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa:I

    .line 11
    .line 12
    new-instance v0, Lcom/bytedance/sdk/component/utils/ue;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1, p0}, Lcom/bytedance/sdk/component/utils/ue;-><init>(Landroid/os/Looper;Lcom/bytedance/sdk/component/utils/ue$uef;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo:Lcom/bytedance/sdk/component/utils/ue;

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz:J

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wrv:Ljava/util/List;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dz:Z

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wk:Z

    .line 43
    .line 44
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bs:Z

    .line 45
    .line 46
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->sy:Z

    .line 47
    .line 48
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    .line 49
    .line 50
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-direct {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 53
    .line 54
    .line 55
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->orq:Z

    .line 58
    .line 59
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 60
    .line 61
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$1;

    .line 62
    .line 63
    invoke-direct {v4, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;)V

    .line 64
    .line 65
    .line 66
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->lz:Ljava/lang/Runnable;

    .line 67
    .line 68
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->km:J

    .line 69
    .line 70
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pu:Z

    .line 71
    .line 72
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gb:I

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->af:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 80
    .line 81
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 82
    .line 83
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dj:Landroid/content/Context;

    .line 84
    .line 85
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->rt:Landroid/view/ViewGroup;

    .line 86
    .line 87
    new-instance p1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef:Ljava/lang/String;

    .line 109
    .line 110
    return-void
.end method

.method private ab()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq()Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/moa;

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method private oyt()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(ZZ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->xs()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private uef(JZ)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_1

    .line 55
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oyt()V

    .line 56
    :cond_1
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    invoke-virtual {p3, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(J)V

    return-void
.end method

.method private yo(I)Z
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa(I)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final bcc()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ab()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public bs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ku:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final cp()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    int-to-long v3, v3

    .line 25
    div-long/2addr v1, v3

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bs()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(J)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 44
    .line 45
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dz:Z

    .line 2
    .line 3
    return v0
.end method

.method public final cz()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;->bs()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public dhk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo:Lcom/bytedance/sdk/component/utils/ue;

    .line 2
    .line 3
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public dj()Lcom/bykv/vk/openvk/uef/uef/uef/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final dxx()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    add-long/2addr v2, v0

    .line 10
    return-wide v2
.end method

.method public final dz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gsd:Z

    .line 2
    .line 3
    return v0
.end method

.method public fz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gb:I

    .line 2
    .line 3
    return v0
.end method

.method public final gr()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public gsd()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ab:Z

    .line 2
    .line 3
    return v0
.end method

.method public gzw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bs:Z

    .line 2
    .line 3
    return v0
.end method

.method public ivm()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final ku()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gzw:Lcom/bytedance/sdk/openadsdk/core/wk/uef/oa;

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final lw(J)V
    .locals 3

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz:J

    .line 4
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef()V

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz p1, :cond_1

    .line 8
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz:J

    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ab:Z

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(ZJZ)V

    :cond_1
    return-void
.end method

.method public final lw(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;Z)V

    return-void
.end method

.method public lw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->orq:Z

    return-void
.end method

.method public final lz()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->efa()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/gsd/uef;->uef(Ljava/util/List;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x5

    .line 21
    invoke-static {v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/util/List;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public moa(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dxx:J

    return-void
.end method

.method public final moa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;)V
    .locals 1

    .line 3
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo(Z)V

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->rt:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa(Landroid/view/ViewGroup;)V

    .line 7
    :cond_0
    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(I)V

    return-void

    :cond_1
    const/4 p1, 0x3

    .line 8
    invoke-interface {p0, p2, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(ZI)V

    return-void
.end method

.method public final moa(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pu:Z

    return-void
.end method

.method public final oa()V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->dj()V

    .line 46
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->tpx:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cp()V

    :cond_1
    return-void
.end method

.method public oa(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gb:I

    return-void
.end method

.method public oa(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz:J

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    return-void
.end method

.method public final oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;I)V
    .locals 0

    .line 32
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_0

    .line 33
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm()V

    :cond_0
    return-void
.end method

.method public oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    .line 9
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz p2, :cond_0

    .line 10
    invoke-virtual {p2, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Z)V

    :cond_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->lw:Landroid/graphics/SurfaceTexture;

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib()V

    return-void
.end method

.method public oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/SurfaceHolder;)V
    .locals 0

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    const/4 p2, 0x0

    .line 5
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->moa:Landroid/view/SurfaceHolder;

    .line 6
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p2, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Z)V

    :cond_0
    return-void
.end method

.method public final oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;ZZ)V

    return-void
.end method

.method public final oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;ZZ)V
    .locals 0

    .line 18
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo(Z)V

    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dj:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_3

    .line 20
    :cond_0
    instance-of p1, p1, Landroid/app/Activity;

    if-nez p1, :cond_1

    goto :goto_3

    .line 21
    :cond_1
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    const/4 p4, 0x0

    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    const/16 p1, 0x8

    goto :goto_0

    :cond_2
    move p1, p4

    .line 22
    :goto_0
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(I)V

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_4

    .line 24
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->rt:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(Landroid/view/ViewGroup;)V

    .line 25
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1, p4}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo(Z)V

    goto :goto_1

    .line 26
    :cond_3
    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(I)V

    .line 27
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_4

    .line 28
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->rt:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa(Landroid/view/ViewGroup;)V

    .line 29
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1, p4}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo(Z)V

    .line 30
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gr:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$oa;

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_6

    .line 31
    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    invoke-interface {p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$oa;->uef(Z)V

    :cond_6
    :goto_3
    return-void
.end method

.method public oa(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V
    .locals 1

    .line 14
    move-object v0, p1

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/oa;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gzw:Lcom/bytedance/sdk/openadsdk/core/wk/uef/oa;

    .line 15
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dj()Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ab:Z

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa(Ljava/lang/String;)V

    return-void
.end method

.method public final oa(Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 5

    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 35
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 37
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz()I

    move-result v3

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 38
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 39
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(I)V

    .line 40
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(J)V

    .line 41
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cp:Z

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(Z)V

    .line 42
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-static {v1, v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    return-void
.end method

.method public oa(Ljava/lang/Runnable;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wrv:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final oa(Z)V
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dz:Z

    return-void
.end method

.method public oib()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wrv:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wrv:Ljava/util/List;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Runnable;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wrv:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public orq()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wk:Z

    .line 2
    .line 3
    return v0
.end method

.method public final pz()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    int-to-long v3, v3

    .line 25
    div-long/2addr v1, v3

    .line 26
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->tpx()Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public rt()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pu:Z

    .line 2
    .line 3
    return v0
.end method

.method public sy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ab()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->lw:Landroid/graphics/SurfaceTexture;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->dhk()Landroid/graphics/SurfaceTexture;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->lw:Landroid/graphics/SurfaceTexture;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Landroid/graphics/SurfaceTexture;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->moa:Landroid/view/SurfaceHolder;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oib()Landroid/view/SurfaceHolder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eq v0, v1, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->moa:Landroid/view/SurfaceHolder;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Landroid/view/SurfaceHolder;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public final tpx()Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 2
    .line 3
    return-object v0
.end method

.method public final ue()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ivm()Z

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

.method public final uef(I)V
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dj:Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_2

    const/16 v1, 0x8

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 32
    :goto_1
    instance-of v2, v0, Landroid/app/Activity;

    if-nez v2, :cond_3

    :goto_2
    return-void

    .line 33
    :cond_3
    check-cast v0, Landroid/app/Activity;

    .line 34
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const/16 p1, 0x400

    if-nez v1, :cond_4

    .line 35
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1, p1}, Landroid/view/Window;->setFlags(II)V

    return-void

    .line 36
    :cond_4
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 80
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ku:J

    return-void
.end method

.method public uef(JJ)V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->af:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef()Lcom/bytedance/sdk/openadsdk/ivm/uef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo()Z

    move-result v0

    if-eqz v0, :cond_1

    long-to-double p1, p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    mul-double/2addr p1, v0

    long-to-double p3, p3

    div-double/2addr p1, p3

    const-wide p3, 0x3fd3333333333333L    # 0.3

    cmpl-double p1, p1, p3

    if-lez p1, :cond_1

    .line 85
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->af:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p1, :cond_1

    .line 87
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ivm/oa;->uef()Lcom/bytedance/sdk/openadsdk/ivm/oa;

    move-result-object p1

    const-string p2, "videoPercent30"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bcc:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/ivm/oa;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cp:Z

    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;I)V
    .locals 2

    .line 52
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-nez p1, :cond_0

    return-void

    .line 53
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oyt:J

    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo(I)Z

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->uef(JZ)V

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;IZ)V
    .locals 4

    .line 46
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dj:Landroid/content/Context;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    int-to-long p1, p2

    .line 47
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dxx:J

    mul-long/2addr p1, v0

    long-to-float p1, p1

    const/high16 p2, 0x3f800000    # 1.0f

    mul-float/2addr p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    float-to-long p1, p1

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-lez p3, :cond_1

    long-to-int p1, p1

    int-to-long p1, p1

    .line 48
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oyt:J

    goto :goto_0

    .line 49
    :cond_1
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oyt:J

    .line 50
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_2

    .line 51
    iget-wide p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oyt:J

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(J)V

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    .line 14
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->lw:Landroid/graphics/SurfaceTexture;

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Landroid/graphics/SurfaceTexture;)V

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    invoke-virtual {p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Z)V

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib()V

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/SurfaceHolder;)V
    .locals 0

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->moa:Landroid/view/SurfaceHolder;

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-nez p1, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(Landroid/view/SurfaceHolder;)V

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib()V

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;ZZ)V
    .locals 1

    .line 37
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wk:Z

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa()V

    :cond_0
    if-eqz p3, :cond_1

    .line 39
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wk:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gr()Z

    move-result p1

    if-nez p1, :cond_1

    .line 40
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ue()Z

    move-result p2

    const/4 p3, 0x1

    xor-int/2addr p2, p3

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa(ZZ)V

    .line 41
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1, p4, p3, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(ZZZ)V

    .line 42
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->ivm()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 43
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm()V

    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw()V

    return-void

    .line 45
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm()V

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$moa;)V
    .locals 0

    .line 3
    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$oa;)V
    .locals 1

    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gr:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ue:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;)V
    .locals 5

    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 67
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 68
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 69
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz()I

    move-result v3

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 70
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 71
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;)V

    .line 72
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->tpx()Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->yo(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;)V

    return-void
.end method

.method public final uef(Lcom/bytedance/sdk/openadsdk/core/widget/dhk$uef;Ljava/lang/String;)V
    .locals 1

    .line 74
    sget-object p2, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$4;->uef:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return-void

    .line 75
    :cond_0
    invoke-interface {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->yo()V

    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->bs:Z

    .line 77
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->sy:Z

    return-void

    .line 78
    :cond_1
    invoke-interface {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->moa()V

    return-void

    .line 79
    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa()V

    return-void
.end method

.method public final uef(Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 6

    .line 57
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 58
    :cond_0
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->fz:Z

    .line 59
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pz:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->gsd()Z

    move-result v5

    invoke-virtual {v0, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/ivm;->uef(JZ)V

    .line 61
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 62
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->rt()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(Z)V

    .line 63
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cz()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 64
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->dz()Z

    move-result v3

    if-eqz v3, :cond_2

    move v1, v2

    :cond_2
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(Z)V

    .line 65
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-static {v1, v2, v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Landroid/content/Context;Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    return-void
.end method

.method public uef(Ljava/lang/Runnable;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->cq:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oa(Ljava/lang/Runnable;)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 19
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->wk:Z

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(Z)V

    :cond_0
    return-void
.end method

.method public final uef(ZLjava/lang/String;)V
    .locals 1

    .line 22
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ab:Z

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {v0, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->oa(Z)V

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;ZLjava/lang/String;)V

    .line 26
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pz:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    if-eqz p2, :cond_2

    .line 27
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/oa/oa/uef;->uef()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 28
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->pz:Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/ivm;->uef(Z)V

    return-void

    .line 29
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->yo:Lcom/bytedance/sdk/component/utils/ue;

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;Z)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public uef(F)Z
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->uef(F)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)Z
    .locals 0

    .line 4
    const/4 p1, 0x0

    return p1
.end method

.method public wk()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic wrv()Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->tpx()Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final xs()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/moa;->wk()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public yo(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->km:J

    return-void
.end method

.method public final yo(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;)V
    .locals 0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cz()V

    :cond_0
    const/4 p1, 0x1

    const/4 p2, 0x3

    .line 5
    invoke-interface {p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(ZI)V

    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->oib:Z

    return-void
.end method

.method public final zjm()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->zjm:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/uef/uef;->dxx:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/uef;->uef(JJ)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
