.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ab:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final af:Landroid/content/Context;

.field public final aos:Z

.field public au:I

.field public bcc:I

.field public final bs:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private bx:I

.field private cl:I

.field public cop:Z

.field public cp:Lcom/bytedance/sdk/openadsdk/cq/zjm;

.field public final cq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final cz:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public dh:Z

.field public final dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final dj:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public dor:Z

.field public dv:I

.field public final dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

.field public final dz:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public etd:I

.field public final fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

.field private fzf:Ljava/lang/String;

.field public final gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

.field public gem:Z

.field public ggp:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

.field public final gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

.field public final gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

.field public final gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

.field private hdd:J

.field public hg:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

.field public hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

.field public hts:J

.field public final ivm:I

.field public ix:Z

.field public jkf:Z

.field public final km:Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

.field public final ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

.field public final lw:Ljava/lang/String;

.field public final lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

.field public final moa:Z

.field public ne:Z

.field public nkh:Z

.field public oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field public final oib:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final orq:Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;

.field public ot:Z

.field public ou:Z

.field public final oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

.field public final pu:Landroid/app/Activity;

.field public final pz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;

.field public rj:I

.field public final rl:Z

.field public final rt:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

.field public final sk:Lcom/bytedance/sdk/component/utils/ue;

.field public sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

.field public swd:Ljava/lang/String;

.field public final sy:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private tc:J

.field public final tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

.field public final ue:Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;

.field public final uef:I

.field public uqx:F

.field public vj:Z

.field public vjj:Z

.field public vyg:Z

.field public final wk:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final wrv:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public wxf:Z

.field public xs:I

.field public xvp:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

.field public final yo:Z

.field public final zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public zou:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/component/utils/ue;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;IZ)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/component/utils/ue;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;IZLcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/component/utils/ue;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;IZLcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    .line 4
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bcc:I

    .line 5
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dj:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wrv:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dz:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sy:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oib:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cop:Z

    const/4 v1, 0x1

    .line 18
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->etd:I

    const-wide/16 v2, 0x0

    .line 19
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hts:J

    const/4 v2, 0x0

    .line 20
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 21
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vj:Z

    .line 22
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ne:Z

    .line 23
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dh:Z

    const/4 v2, -0x1

    .line 24
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bx:I

    .line 25
    const-string v2, ""

    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fzf:Ljava/lang/String;

    .line 26
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cl:I

    .line 27
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 28
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 29
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p4

    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 30
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 31
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->uef:I

    if-eqz p7, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    .line 32
    :goto_0
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ix:Z

    if-eqz p5, :cond_2

    if-ne p5, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v0

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v1

    .line 33
    :goto_2
    iput-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ou:Z

    const/4 v2, 0x2

    if-eqz p5, :cond_4

    if-ne p5, v2, :cond_3

    goto :goto_3

    :cond_3
    move v3, v0

    goto :goto_4

    :cond_4
    :goto_3
    move v3, v1

    .line 34
    :goto_4
    iput-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rl:Z

    .line 35
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 36
    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->aos:Z

    .line 37
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getDurationSlotType()I

    move-result p2

    const/4 p6, 0x7

    if-ne p2, p6, :cond_5

    move v0, v1

    :cond_5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    if-eqz v0, :cond_6

    .line 38
    const-string p2, "rewarded_video"

    goto :goto_5

    :cond_6
    const-string p2, "fullscreen_interstitial_ad"

    :goto_5
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    .line 39
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    move-result p6

    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wxf:Z

    .line 40
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result p6

    iput p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    .line 41
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-static {p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->sy(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 42
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-static {p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p6

    invoke-virtual {v0, p6}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->wk(Ljava/lang/String;)Z

    move-result p6

    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->yo:Z

    .line 43
    new-instance p6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    invoke-direct {p6, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rt:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    if-ne p5, v2, :cond_7

    .line 44
    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/view/wrv;

    invoke-direct {p5, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/wrv;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    goto :goto_6

    :cond_7
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    move-result p5

    if-eqz p5, :cond_8

    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-direct {p5, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    goto :goto_6

    :cond_8
    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/view/zjm;

    invoke-direct {p5, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/zjm;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    :goto_6
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 45
    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    invoke-direct {p5, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->km:Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    .line 46
    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-direct {p5, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 47
    new-instance p5, Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;

    invoke-direct {p5, p3, p2, p4, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V

    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->orq:Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;

    .line 48
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    invoke-direct {p2, p0, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    if-eqz p7, :cond_9

    .line 49
    iget-object p2, p7, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    goto :goto_7

    :cond_9
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    :goto_7
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 50
    invoke-virtual {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 51
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 52
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    .line 53
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 54
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    .line 55
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    if-eqz p7, :cond_a

    .line 56
    iget-object p2, p7, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ue:Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;

    goto :goto_8

    :cond_a
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    :goto_8
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ue:Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;

    .line 57
    invoke-virtual {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 58
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;

    .line 59
    new-instance p2, Lcom/bytedance/sdk/openadsdk/cq/zjm;

    invoke-direct {p2, p4}, Lcom/bytedance/sdk/openadsdk/cq/zjm;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cp:Lcom/bytedance/sdk/openadsdk/cq/zjm;

    .line 60
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa$1;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/utils/cz;->uef(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/utils/cz$uef;)Lcom/bytedance/sdk/openadsdk/utils/dz;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    return-void
.end method


# virtual methods
.method public bcc()Lcom/bytedance/sdk/openadsdk/moa/xs;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getAdShowTime()Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 33
    .line 34
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/xs;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/openadsdk/moa/xs;->uef(JF)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 46
    .line 47
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/xs;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/openadsdk/moa/xs;->uef(JF)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public cz()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ggp()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x2

    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->dj()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "dynamic_show_type"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :catch_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    .line 61
    :try_start_0
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object v0
.end method

.method public ivm()J
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tc:J

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hdd:J

    .line 8
    .line 9
    sub-long/2addr v2, v4

    .line 10
    add-long/2addr v2, v0

    .line 11
    return-wide v2
.end method

.method public lw()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hdd:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hdd:J

    .line 14
    .line 15
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tc:J

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hdd:J

    .line 22
    .line 23
    sub-long/2addr v2, v4

    .line 24
    add-long/2addr v2, v0

    .line 25
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tc:J

    .line 26
    .line 27
    return-void
.end method

.method public moa()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hdd:J

    .line 6
    .line 7
    return-void
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bx:I

    .line 2
    .line 3
    return v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cl:I

    return v0
.end method

.method public uef(ILjava/lang/String;I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bx:I

    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fzf:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cl:I

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->nkh:Z

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->moa(Z)V

    return-void
.end method

.method public xs()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    return v0
.end method

.method public yo()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cl:I

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
