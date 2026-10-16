.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/cq/cz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$uef;,
        Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;
    }
.end annotation


# instance fields
.field private ab:Z

.field private af:J

.field private volatile au:I

.field bcc:Z

.field private final bs:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

.field private final cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field private cq:I

.field public cz:Z

.field private dhk:Landroid/view/View;

.field private dj:I

.field private volatile dor:I

.field private dv:Lcom/bytedance/sdk/openadsdk/common/lw;

.field private dxx:J

.field private dz:I

.field private etd:J

.field private fz:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

.field private gb:J

.field private gem:Ljava/lang/String;

.field private gr:Z

.field private gsd:J

.field private gzw:F

.field private hts:I

.field ivm:Ljava/lang/String;

.field private km:Z

.field private ku:Z

.field lw:I

.field private lz:Z

.field moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

.field private nkh:Z

.field protected oa:Z

.field private oib:Z

.field private orq:F

.field private oyt:Z

.field private pu:Z

.field private pz:F

.field private rj:Lcom/bytedance/sdk/openadsdk/core/widget/uef/ivm$uef;

.field private rl:I

.field private rt:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;"
        }
    .end annotation
.end field

.field private volatile sk:I

.field private swd:I

.field private sy:Z

.field private tpx:Landroid/view/View;

.field private ue:F

.field uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field private uqx:Z

.field private wk:Lcom/bytedance/sdk/component/cz/ivm;

.field private final wrv:Z

.field protected xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

.field protected yo:Ljava/lang/String;

.field private final zjm:Ljava/lang/String;

.field private zou:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab:Z

    .line 9
    .line 10
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw:I

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm:Ljava/lang/String;

    .line 22
    .line 23
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc:Z

    .line 24
    .line 25
    new-instance v2, Landroid/util/SparseArray;

    .line 26
    .line 27
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt:Landroid/util/SparseArray;

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr:Z

    .line 33
    .line 34
    const/high16 v0, -0x40800000    # -1.0f

    .line 35
    .line 36
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ue:F

    .line 37
    .line 38
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pz:F

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ku:Z

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dxx:J

    .line 45
    .line 46
    const-wide/16 v4, -0x1

    .line 47
    .line 48
    iput-wide v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    .line 49
    .line 50
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sk:I

    .line 51
    .line 52
    const/4 v0, -0x1

    .line 53
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->swd:I

    .line 54
    .line 55
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->au:I

    .line 56
    .line 57
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dor:I

    .line 58
    .line 59
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->etd:J

    .line 60
    .line 61
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cz:Z

    .line 62
    .line 63
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->hts:I

    .line 64
    .line 65
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 66
    .line 67
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    .line 68
    .line 69
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    .line 70
    .line 71
    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    .line 72
    .line 73
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv:Z

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic ab(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/common/lw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dv:Lcom/bytedance/sdk/openadsdk/common/lw;

    return-object p0
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sk:I

    return p0
.end method

.method public static synthetic bs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gsd:J

    return-wide v0
.end method

.method public static synthetic cq(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dor:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dor:I

    return v0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dor:I

    return p0
.end method

.method public static synthetic dhk(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ue:F

    return p0
.end method

.method public static synthetic dj(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->au:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->au:I

    return v0
.end method

.method public static synthetic dz(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sk:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sk:I

    return v0
.end method

.method public static synthetic gr(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dhk:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic gsd(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr:Z

    return p0
.end method

.method public static synthetic gzw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab:Z

    return p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gem:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab:Z

    return p1
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uqx:Z

    return p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gr:Z

    return p1
.end method

.method private lz()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lz:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->nkh:Z

    .line 6
    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 8
    .line 9
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 10
    .line 11
    const/16 v3, 0x258

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 17
    .line 18
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 19
    .line 20
    const/16 v3, 0x2bc

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 26
    .line 27
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 28
    .line 29
    const/16 v3, 0x384

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 35
    .line 36
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->moa(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 42
    .line 43
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hg:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_0

    .line 67
    .line 68
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->bcc(I)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Landroid/view/View$OnClickListener;

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$uef;

    .line 99
    .line 100
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 101
    .line 102
    invoke-direct {v2, v3, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$uef;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pz:F

    return p1
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->fz:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    return p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gzw:F

    return p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pu:Z

    return p1
.end method

.method public static synthetic oib(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gzw:F

    return p0
.end method

.method public static synthetic orq(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt:Landroid/util/SparseArray;

    return-object p0
.end method

.method private oyt()Lcom/bytedance/sdk/openadsdk/moa/moa/lw;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    new-instance v1, Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string v2, "rewarded_video"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v2, "fullscreen_interstitial_ad"

    .line 15
    .line 16
    :goto_0
    const/4 v3, 0x2

    .line 17
    invoke-direct {v1, v3, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/oib;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public static synthetic rt(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->tpx:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic sy(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->orq:F

    return p0
.end method

.method public static synthetic tpx(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pz:F

    return p0
.end method

.method public static synthetic ue(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv:Z

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->orq:F

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->hts:I

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;J)J
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gsd:J

    return-wide p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Landroid/util/SparseArray;)Landroid/util/SparseArray;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rt:Landroid/util/SparseArray;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->tpx:Landroid/view/View;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    return-object p0
.end method

.method private static uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;III)Ljava/lang/String;
    .locals 4

    .line 58
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gze()F

    move-result v0

    .line 59
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 60
    const-string v2, "&"

    const-string v3, "?"

    if-ne p2, v1, :cond_1

    .line 61
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 62
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 64
    :goto_0
    const-string p2, "orientation=portrait"

    .line 65
    invoke-static {p0, p2}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 66
    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 67
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 69
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "height="

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "&width="

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "&aspect_ratio="

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 70
    :cond_3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 71
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/ivm;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method private uef(ILcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 1

    .line 21
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-nez v0, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wrv:Z

    if-nez v0, :cond_1

    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 25
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dhk:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 26
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-eqz v0, :cond_3

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->cq(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 27
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->lw()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;ILcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(ILcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    return-void
.end method

.method private uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V
    .locals 12

    .line 90
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 91
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 92
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/cq;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v2}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;

    invoke-direct {v3, p0, v9}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->swd:I

    invoke-direct {v0, v9, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/moa/cq;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/webkit/WebView;Lcom/bytedance/sdk/openadsdk/moa/wrv;I)V

    const/4 v10, 0x1

    .line 93
    invoke-virtual {v0, v10}, Lcom/bytedance/sdk/openadsdk/moa/cq;->oa(Z)Lcom/bytedance/sdk/openadsdk/moa/cq;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 94
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/uef/ivm$uef;

    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rj:Lcom/bytedance/sdk/openadsdk/core/widget/uef/ivm$uef;

    .line 95
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv()Z

    move-result v2

    const-string v3, "landingpage_endcard"

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->oa(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    invoke-virtual {v0, v10}, Lcom/bytedance/sdk/openadsdk/moa/cq;->yo(Z)V

    .line 98
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$12;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$12;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 100
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    if-eqz v0, :cond_1

    .line 101
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->uef()Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Lcom/bytedance/sdk/openadsdk/orq/bcc;)V

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    invoke-static {v9, v0, v2, v4}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/component/cz/ivm;Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/lw;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dv:Lcom/bytedance/sdk/openadsdk/common/lw;

    if-eqz v0, :cond_3

    .line 103
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, p1

    :goto_1
    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/common/lw;->uef(Ljava/lang/String;)V

    .line 104
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 105
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-static {v9, v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 106
    :cond_4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$2;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dv:Lcom/bytedance/sdk/openadsdk/common/lw;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 107
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->fjj()Z

    move-result v7

    move-object v1, p0

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/common/lw;Lcom/bytedance/sdk/openadsdk/moa/cq;ZLcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->fz:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 108
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 109
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->fz:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    invoke-virtual {v0, v9}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 110
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->fz:Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv:Z

    if-eqz v2, :cond_5

    const-string v2, "rewarded_video"

    goto :goto_2

    :cond_5
    const-string v2, "fullscreen_interstitial_ad"

    :goto_2
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->uef(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->fjj()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 112
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;

    invoke-direct {v2, p0, v9}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 113
    :cond_6
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v6, :cond_7

    .line 114
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$4;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dv:Lcom/bytedance/sdk/openadsdk/common/lw;

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/moa/cq;Lcom/bytedance/sdk/openadsdk/common/lw;Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V

    invoke-virtual {v6, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 115
    :cond_7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    const/16 v0, 0x18

    if-lt v11, v0, :cond_8

    .line 116
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setLayerType(ILandroid/graphics/Paint;)V

    .line 117
    :cond_8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setBackgroundColor(I)V

    .line 118
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setDisplayZoomControls(Z)V

    :cond_9
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Ljava/lang/Runnable;)Z
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/Runnable;)Z

    move-result p0

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Ljava/lang/String;)Z
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uqx:Z

    return p1
.end method

.method private uef(Ljava/lang/Runnable;)Z
    .locals 6

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 143
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dxx:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x64

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    .line 144
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dxx:J

    if-eqz p1, :cond_0

    .line 145
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private uef(Ljava/lang/String;)Z
    .locals 2

    .line 119
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->fjj()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ".mp4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic wk(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic wrv(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    return-object p0
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rl:I

    return p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ue:F

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lz()V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zou:Z

    return p1
.end method

.method public static synthetic zjm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->au:I

    return p0
.end method


# virtual methods
.method public ab()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->wk()V

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 5
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->af:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    sub-long/2addr v4, v6

    add-long/2addr v4, v0

    iput-wide v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->af:J

    .line 6
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;ZZ)V

    :cond_2
    return-void
.end method

.method public bcc()Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    return-object v0
.end method

.method public bs()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->cq()V

    .line 4
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dj()V

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    .line 11
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v1, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;ZZ)V

    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 15
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lz:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs()V

    goto :goto_0

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, v3, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;ZZ)V

    .line 20
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v0, :cond_4

    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->xs()V

    :cond_4
    return-void
.end method

.method public cp()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

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

.method public cq()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public cz()Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    return-object v0
.end method

.method public dhk()Z
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oyt:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->km:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->wrv()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    .line 4
    :cond_1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oyt:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->km:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public dj()V
    .locals 11

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->af:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_3

    .line 6
    iget-wide v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    cmp-long v3, v5, v3

    if-lez v3, :cond_1

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    sub-long/2addr v3, v5

    add-long/2addr v3, v1

    iput-wide v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->af:J

    .line 8
    :cond_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 9
    :try_start_0
    const-string v1, "endcard_overlay_render_type"

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x7

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v8, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :catchall_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    const-string v7, "second_endcard_duration"

    iget-wide v9, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->af:J

    invoke-static/range {v5 .. v10}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;J)V

    :cond_3
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->uef(Z)V

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->dj()V

    .line 15
    :cond_4
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v1, :cond_5

    .line 16
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv()V

    .line 17
    :cond_5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v1, :cond_6

    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->fjj()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->moa(Z)V

    .line 19
    :cond_6
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils$AudioInfoReceiver;->oa(Lcom/bytedance/sdk/openadsdk/cq/cz;)V

    return-void
.end method

.method public dxx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public dz()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    return v0
.end method

.method public fz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lz:Z

    .line 2
    .line 3
    return v0
.end method

.method public gr()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz()Z

    move-result v0

    return v0
.end method

.method public gsd()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc:Z

    return v0
.end method

.method public gzw()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(J)V

    :cond_0
    return-void
.end method

.method public ivm()V
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz v3, :cond_3

    .line 5
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oyt()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    if-nez v0, :cond_3

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vup()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gem:Ljava/lang/String;

    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef()Lcom/bytedance/sdk/openadsdk/xs/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/xs/oa;->oa()Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef()Lcom/bytedance/sdk/openadsdk/xs/oa;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gem:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/xs/oa;->uef(Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->rl:I

    if-lez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 10
    :goto_0
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->swd:I

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gem:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v0, :cond_2

    .line 13
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->swd:I

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(I)V

    .line 14
    :cond_2
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->etd:J

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cop:Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gem:Ljava/lang/String;

    const-string v4, "landingpage_endcard"

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/moa/yo$uef;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bykv/vk/openvk/preload/falconx/loader/ILoader;Ljava/lang/String;)V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    const-string v2, "play.google.com/store"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_4
    if-eqz v3, :cond_5

    .line 16
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 17
    :cond_5
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 18
    :cond_6
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc:Z

    return-void

    .line 19
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "preLoadEndCardForce: return mShouldPreloadEndCard "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ",webViewIsLoading "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zou:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "TTAD.RFWVM"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa:Z

    if-eqz v0, :cond_c

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->jkf:Z

    .line 22
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v2, :cond_b

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_8
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 23
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zou:Z

    if-eqz v0, :cond_9

    goto :goto_1

    .line 24
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    const-string v3, "&is_pre_render=1"

    .line 25
    invoke-static {v0, v2, v3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v2, :cond_a

    .line 27
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->moa()V

    .line 28
    :cond_a
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Lcom/bytedance/sdk/component/cz/ivm;Ljava/lang/String;)V

    .line 29
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zou:Z

    return-void

    .line 30
    :cond_b
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->yo()V

    :cond_c
    :goto_1
    return-void
.end method

.method public ivm(Z)V
    .locals 4

    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->km:Z

    .line 36
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 37
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 38
    :try_start_0
    const-string v2, "endcard_overlay_render_type"

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x7

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :catchall_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    const-string v3, "use_second_endcard"

    invoke-static {v1, v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->gb:J

    .line 41
    :try_start_1
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_2

    .line 42
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->bcc()V

    .line 43
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm:Ljava/lang/String;

    const-string v2, "endcard_close_skip"

    invoke-static {v1, p1, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_1

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const-string v0, "click_endcard_close"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 45
    :catch_0
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    iget p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef(J)V

    return-void
.end method

.method public ku()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->lw()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public lw()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vj:Z

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm()V

    return-void
.end method

.method public lw(Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public moa(Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Z)V

    return-void
.end method

.method public moa()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->km:Z

    return v0
.end method

.method public oa()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dhk:Landroid/view/View;

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->km:Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    sget v1, Lcom/bytedance/sdk/openadsdk/utils/bs;->ab:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/cz/ivm;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->lw()V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 11
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    return-void
.end method

.method public oa(I)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_0

    .line 15
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/oa;->uef(I)V

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/yo;->yo()V

    :cond_0
    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V
    .locals 0

    .line 13
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public oa(Z)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V

    return-void
.end method

.method public oib()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm:Ljava/lang/String;

    return-object v0
.end method

.method public orq()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/yo;->ivm()V

    :cond_0
    return-void
.end method

.method public pz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->nkh:Z

    .line 2
    .line 3
    return v0
.end method

.method public rt()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/yo;->cz()V

    :cond_0
    return-void
.end method

.method public sy()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw:I

    return v0
.end method

.method public tpx()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/yo;->xs()V

    :cond_0
    return-void
.end method

.method public ue()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public uef()V
    .locals 4

    .line 11
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oib:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oib:Z

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->etd:I

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dj:I

    .line 14
    iget v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rj:I

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cq:I

    .line 15
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dv:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dz:I

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 17
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa()V

    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->etd:J

    return-void
.end method

.method public uef(F)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;F)V

    return-void
.end method

.method public uef(I)V
    .locals 2

    .line 77
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(ILcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 80
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_2

    .line 81
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 82
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 83
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->fjj()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 84
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setLandingPage(Z)V

    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    const-string v1, "landingpage_endcard"

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setTag(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cuu()Lcom/bytedance/sdk/component/cz/oa/uef;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/cz/ivm;->setMaterialMeta(Lcom/bytedance/sdk/component/cz/oa/uef;)V

    :cond_3
    return-void
.end method

.method public uef(II)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Landroid/webkit/DownloadListener;)V
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 122
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/cz/ivm;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->oa(Z)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/webkit/WebView;)V

    .line 124
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    const/16 v2, 0x1f45

    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/utils/dhk;->uef(Landroid/webkit/WebView;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setUserAgentString(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setMixedContentMode(I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/oyt;ZZ)V
    .locals 5

    .line 127
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 128
    const-string v1, "endcard_mute"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 129
    const-string p2, "endcard_show"

    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 130
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    const-string v1, "end"

    const-string v2, "endcard_type"

    if-eqz p2, :cond_1

    .line 132
    :try_start_1
    const-string v3, "multi_ads_show"

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->zjm()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 133
    iget-boolean p2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->bs:Z

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "mid"

    :goto_0
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    :goto_1
    const-string p2, "endcard_control_event"

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    if-eqz p3, :cond_2

    .line 136
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->sy:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    .line 137
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uqx:Z

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 138
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uqx:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/cq/xs;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 5

    .line 28
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    if-nez p1, :cond_0

    return-void

    .line 29
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x2

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "click_scence"

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oyt()Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 33
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 34
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 35
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kid()Ljava/lang/String;

    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 37
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 38
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 39
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 40
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 41
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x7

    goto :goto_0

    :cond_1
    const/4 v3, 0x5

    :goto_0
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(I)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/yo;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-direct {v3, v4}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/yo;-><init>(Landroid/view/View;)V

    .line 42
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v2

    .line 43
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    .line 44
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v1

    .line 45
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wrv()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p2, "landingpage_endcard"

    :cond_2
    invoke-virtual {v1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p2

    .line 46
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 47
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;

    invoke-direct {p2, p0, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 48
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$7;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$7;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V

    .line 49
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt$uef;)V

    .line 50
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/moa;

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-direct {p2, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/moa;-><init>(Lcom/bytedance/sdk/component/cz/ivm;)V

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 51
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Landroid/view/View;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    .line 52
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->yo()Lcom/bytedance/sdk/openadsdk/cq/lw;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;

    invoke-direct {p2, p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 53
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/cq/yo;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 54
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oyt:Z

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Z)V

    return-void
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 1

    .line 19
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$5;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$5;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V

    invoke-direct {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V

    .line 20
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$6;

    invoke-direct {p1, p0, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$6;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Landroid/webkit/DownloadListener;)V

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa:Z

    return-void
.end method

.method public uef(ZILjava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 140
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->oa()V

    return-void

    .line 141
    :cond_1
    invoke-interface {v0, p2, p3}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->uef(ILjava/lang/String;)V

    return-void
.end method

.method public uef(ZZ)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;ZZ)V

    return-void
.end method

.method public wk()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/yo;->bcc()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->bcc()V

    :cond_1
    return-void
.end method

.method public wrv()Z
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    const-string v2, "show_landingpage"

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    return v1
.end method

.method public xs()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const-string v1, "showPlayableEndCardOverlay"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    const/16 v1, 0x258

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$10;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$10;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef(J)V

    :cond_0
    return-void
.end method

.method public xs(Z)V
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->nkh:Z

    return-void
.end method

.method public yo(I)V
    .locals 1

    .line 6
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->hts:I

    if-gtz v0, :cond_0

    if-lez p1, :cond_0

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Z)V

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Z)V

    .line 9
    :cond_1
    :goto_0
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->hts:I

    return-void
.end method

.method public yo(Z)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Z)V

    return-void
.end method

.method public yo()Z
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pu:Z

    return v0
.end method

.method public zjm()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bcc()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->pu()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cp:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->gr()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    :cond_0
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wrv()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->wrv(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    .line 10
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dj:I

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dz:I

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cq:I

    invoke-static {v1, v0, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;III)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->yo:Ljava/lang/String;

    const-string v1, "use_second_endcard=1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oyt:Z

    :cond_4
    return-void
.end method
