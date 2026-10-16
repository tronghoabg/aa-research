.class public Lcom/bytedance/sdk/openadsdk/component/xs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/ue$uef;


# instance fields
.field private bcc:I

.field private volatile cz:I

.field private dj:Z

.field private ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private lw:I

.field private final moa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final oa:Lcom/bytedance/sdk/openadsdk/core/gzw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/core/gzw<",
            "Lcom/bytedance/sdk/openadsdk/moa/uef;",
            ">;"
        }
    .end annotation
.end field

.field private final uef:Landroid/content/Context;

.field private xs:Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

.field private final yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

.field private final zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

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
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->lw:I

    .line 13
    .line 14
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    .line 15
    .line 16
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/fz;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->uef:Landroid/content/Context;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->uef:Landroid/content/Context;

    .line 37
    .line 38
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->yo()Lcom/bytedance/sdk/openadsdk/core/gzw;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->oa:Lcom/bytedance/sdk/openadsdk/core/gzw;

    .line 43
    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->uef:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/xs;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->lw:I

    .line 2
    .line 3
    return p0
.end method

.method private oa()V
    .locals 5

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->oa()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/model/ue;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iput-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    const/4 v2, 0x1

    .line 7
    iput v2, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->moa:I

    const/4 v3, 0x2

    .line 8
    iput v3, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->cz:I

    .line 9
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    .line 10
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->oa:Lcom/bytedance/sdk/openadsdk/core/gzw;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    new-instance v4, Lcom/bytedance/sdk/openadsdk/component/xs$4;

    invoke-direct {v4, p0, v0}, Lcom/bytedance/sdk/openadsdk/component/xs$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    const/4 v0, 0x3

    invoke-interface {v2, v3, v1, v0, v4}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/tpx;)V

    return-void
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->yo(Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/xs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/xs;->oa()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/xs;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    return p1
.end method

.method public static uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/xs;
    .locals 1

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/xs;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/core/model/fz;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    return-object p0
.end method

.method private uef()V
    .locals 2

    .line 60
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/xs$3;

    const-string v1, "tryGetAppOpenAdFromCache"

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->yo(Ljava/lang/Runnable;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V
    .locals 10

    .line 63
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->oa()I

    move-result v0

    .line 64
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->yo()I

    move-result v1

    .line 65
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {v2, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/fz;II)V

    .line 66
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    const/16 v5, 0x64

    if-nez v2, :cond_0

    if-ne v0, v4, :cond_8

    if-ne v1, v5, :cond_8

    .line 67
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    if-nez v0, :cond_8

    .line 68
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->lw:I

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->uef()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/lw/uef;-><init>(ILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 69
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/uef;)V

    .line 70
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->dj:Z

    if-nez v0, :cond_8

    .line 71
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {p1, v4, v0}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILcom/bytedance/sdk/openadsdk/core/model/fz;)V

    return-void

    :cond_0
    if-ne v0, v4, :cond_5

    if-ne v1, v5, :cond_1

    .line 72
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    if-nez v0, :cond_1

    .line 73
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->lw:I

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v6

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->uef()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object v7

    invoke-direct {v0, v2, v6, v7}, Lcom/bytedance/sdk/openadsdk/component/lw/uef;-><init>(ILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 74
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/uef;)V

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->xs:Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    const/16 v2, 0x65

    if-eqz v0, :cond_3

    .line 76
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/moa;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->uef:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v7

    if-ne v1, v2, :cond_2

    move v8, v4

    goto :goto_0

    :cond_2
    move v8, v3

    :goto_0
    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-direct {v0, v6, v7, v8, v9}, Lcom/bytedance/sdk/openadsdk/component/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 77
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->xs:Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    invoke-interface {v6, v0}, Lcom/bytedance/sdk/openadsdk/api/PAGLoadListener;->onAdLoaded(Ljava/lang/Object;)V

    :cond_3
    if-ne v1, v2, :cond_4

    .line 78
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;J)V

    return-void

    :cond_4
    if-ne v1, v5, :cond_8

    .line 79
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {p1, v3, v0}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILcom/bytedance/sdk/openadsdk/core/model/fz;)V

    .line 80
    iput-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->dj:Z

    return-void

    :cond_5
    const/4 v1, 0x2

    const/4 v2, 0x3

    if-eq v0, v1, :cond_6

    if-ne v0, v2, :cond_8

    .line 81
    :cond_6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->xs:Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    if-eqz v1, :cond_7

    .line 82
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->lw()I

    move-result v3

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->ivm()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v3, p1}, Lcom/bytedance/sdk/openadsdk/api/PAGLoadListener;->onError(ILjava/lang/String;)V

    :cond_7
    if-ne v0, v2, :cond_8

    .line 83
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->bcc:I

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->uef(IILcom/bytedance/sdk/openadsdk/core/model/fz;)V

    :cond_8
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 3

    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/xs$5;

    invoke-direct {v2, p0, p3, p1, p4}, Lcom/bytedance/sdk/openadsdk/component/xs$5;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/component/ivm$oa;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->yo:Lcom/bytedance/sdk/openadsdk/component/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/xs$6;

    invoke-direct {v2, p0, p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/component/xs$6;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/fz;Lcom/bytedance/sdk/openadsdk/component/ivm$uef;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 11

    const/4 v0, 0x2

    .line 22
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    const/4 v1, 0x3

    const/16 v2, 0x64

    if-eqz p1, :cond_9

    .line 23
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p2

    const/4 v3, 0x0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 25
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hts()J

    move-result-wide v4

    .line 26
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iput-wide v4, v6, Lcom/bytedance/sdk/openadsdk/core/model/fz;->oa:J

    .line 27
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->zjm()I

    move-result v6

    invoke-virtual {p2, v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(I)V

    .line 28
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v6

    .line 29
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ku()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    .line 30
    new-instance p3, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    invoke-direct {p3, v8, v2, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void

    :cond_1
    if-nez v6, :cond_7

    .line 31
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tpq()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v6

    const-wide/16 v9, -0x1

    if-eqz v6, :cond_6

    .line 33
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->ivm()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 34
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iput-wide v9, p4, Lcom/bytedance/sdk/openadsdk/core/model/fz;->oa:J

    .line 35
    invoke-virtual {p4, v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(I)V

    .line 36
    new-instance p4, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    invoke-direct {p4, v8, v2, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    .line 37
    invoke-direct {p0, p2, p3, v3, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 38
    :cond_3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    xor-int/2addr v1, v8

    invoke-direct {p0, p2, p3, v1, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 39
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-boolean p3, p3, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    if-eqz p3, :cond_5

    .line 40
    invoke-virtual {p4}, Lcom/bytedance/sdk/openadsdk/utils/pu;->moa()J

    move-result-wide p3

    .line 41
    invoke-static {p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;J)V

    const-wide/16 p3, 0x0

    cmp-long p3, v4, p3

    if-nez p3, :cond_4

    .line 42
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(I)V

    .line 43
    new-instance p3, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    invoke-direct {p3, v8, v2, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void

    .line 44
    :cond_4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object p3

    new-instance p4, Lcom/bytedance/sdk/openadsdk/component/xs$2;

    invoke-direct {p4, p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/xs$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-virtual {p3, p4, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void

    .line 45
    :cond_6
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iput-wide v9, p3, Lcom/bytedance/sdk/openadsdk/core/model/fz;->oa:J

    .line 46
    invoke-virtual {p3, v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(I)V

    .line 47
    new-instance p3, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    invoke-direct {p3, v8, v2, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    .line 48
    invoke-direct {p0, p2, v3, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 49
    :cond_7
    :goto_0
    new-instance p4, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    invoke-direct {p4, v8, v2, p2, p1}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    .line 50
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p4

    if-eqz p4, :cond_8

    .line 51
    invoke-direct {p0, p2, p3, v3, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 52
    :cond_8
    invoke-direct {p0, p2, v3, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 53
    :cond_9
    :goto_1
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->cz:I

    .line 54
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    const/16 p3, 0x4e21

    .line 55
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, v0, v2, p3, p4}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IIILjava/lang/String;)V

    .line 56
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    const/4 p1, -0x3

    .line 57
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(I)V

    .line 58
    invoke-virtual {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->yo(I)V

    .line 59
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/yo;)V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/AdSlot;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    return-object p0
.end method

.method private yo(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 4

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->oa()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object v0

    .line 3
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/model/ue;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iput-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    const/4 v2, 0x1

    .line 5
    iput v2, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->moa:I

    const/4 v2, 0x2

    .line 6
    iput v2, v1, Lcom/bytedance/sdk/openadsdk/core/model/ue;->cz:I

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->oa:Lcom/bytedance/sdk/openadsdk/core/gzw;

    new-instance v3, Lcom/bytedance/sdk/openadsdk/component/xs$1;

    invoke-direct {v3, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/xs$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    const/4 v0, 0x3

    invoke-interface {v2, p1, v1, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;ILcom/bytedance/sdk/openadsdk/core/tpx;)V

    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)I
    .locals 0

    .line 84
    :try_start_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    const/4 p1, 0x0

    return p1
.end method

.method public uef(Landroid/os/Message;)V
    .locals 4

    .line 85
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 86
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    const/16 v0, 0x66

    const/16 v1, 0x2712

    .line 88
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-direct {p1, v3, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IIILjava/lang/String;)V

    .line 89
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/common/xs;I)V
    .locals 4

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-gtz p3, :cond_1

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->xs()I

    move-result p3

    .line 7
    :cond_1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->setCacheScene(I)V

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getBidAdm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    .line 10
    instance-of p1, p2, Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    if-eqz p1, :cond_2

    .line 11
    check-cast p2, Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->xs:Lcom/bytedance/sdk/openadsdk/api/open/PAGAppOpenAdLoadListener;

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->lw:I

    .line 13
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->bcc:I

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/pu;->oa()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_3

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->oa()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->oa(J)V

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->yo()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->oa(I)V

    .line 18
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/fz;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef:Z

    if-eqz p1, :cond_4

    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs;->ivm:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->oa(Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    return-void

    .line 20
    :cond_4
    new-instance p1, Lcom/bytedance/sdk/component/utils/ue;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/bytedance/sdk/component/utils/ue;-><init>(Landroid/os/Looper;Lcom/bytedance/sdk/component/utils/ue$uef;)V

    int-to-long p2, p3

    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 21
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef()V

    return-void
.end method
