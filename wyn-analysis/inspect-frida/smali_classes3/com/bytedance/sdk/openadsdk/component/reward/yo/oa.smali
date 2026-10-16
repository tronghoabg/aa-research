.class public abstract Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/ue$uef;
.implements Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;
.implements Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;


# instance fields
.field protected ab:Z

.field protected bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

.field private final bs:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected cq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

.field private dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

.field protected final dj:Lcom/bytedance/sdk/component/utils/ue;

.field protected dz:J

.field private gzw:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

.field protected ivm:Ljava/lang/String;

.field protected lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected moa:Landroid/app/Activity;

.field public oa:Z

.field private oib:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;

.field private orq:Landroid/view/ViewGroup;

.field private sy:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;

.field private tpx:Z

.field protected uef:Ljava/lang/String;

.field protected wk:Z

.field protected wrv:Landroid/content/Context;

.field public xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

.field protected yo:Z

.field protected zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v7, 0x0

    .line 7
    invoke-direct {v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-boolean v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo:Z

    .line 13
    .line 14
    iput-boolean v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->tpx:Z

    .line 15
    .line 16
    new-instance v4, Lcom/bytedance/sdk/component/utils/ue;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-direct {v4, v5, p0}, Lcom/bytedance/sdk/component/utils/ue;-><init>(Landroid/os/Looper;Lcom/bytedance/sdk/component/utils/ue$uef;)V

    .line 23
    .line 24
    .line 25
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dj:Lcom/bytedance/sdk/component/utils/ue;

    .line 26
    .line 27
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 35
    .line 36
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->orq:Landroid/view/ViewGroup;

    .line 43
    .line 44
    new-instance v4, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 45
    .line 46
    invoke-direct {v4, p0, p1, p3, p4}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 50
    .line 51
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    move-object v6, p0

    .line 58
    move-object v4, p1

    .line 59
    move-object v2, p3

    .line 60
    move-object v3, p4

    .line 61
    move-object v1, p5

    .line 62
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;-><init>(Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 66
    .line 67
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    .line 68
    .line 69
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cgg()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    iget-boolean v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oa:Z

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    move-object v1, p1

    .line 78
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZZLcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    .line 82
    .line 83
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;

    .line 89
    .line 90
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;

    .line 91
    .line 92
    invoke-direct {v0, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oib:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;

    .line 96
    .line 97
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 98
    .line 99
    invoke-direct {v0, p5, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 103
    .line 104
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 105
    .line 106
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cgg()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-direct {v0, p1, p3, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 114
    .line 115
    move-object v0, p6

    .line 116
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 129
    .line 130
    invoke-virtual {p0, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/yo/lw;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/lw;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    .line 138
    .line 139
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getDurationSlotType()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    const/4 v2, 0x7

    .line 148
    if-ne v1, v2, :cond_0

    .line 149
    .line 150
    const/4 v7, 0x1

    .line 151
    :cond_0
    invoke-virtual {v0, v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Z)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method private bs()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->uef()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->lw()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->orq:Landroid/view/ViewGroup;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->lw()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->oa()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    return-object p0
.end method

.method private sy()V
    .locals 3

    .line 1
    const-string v0, "BaseManagerBundle"

    .line 2
    .line 3
    const-string v1, "removeLoadingPage: "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->yo()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v2

    .line 17
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->lw()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->lw()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;

    return-object p0
.end method


# virtual methods
.method public ab()V
    .locals 6

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->bcc()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "BVA"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "callback close is invoke by config change."

    .line 20
    .line 21
    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ab:Z

    .line 26
    .line 27
    if-nez v0, :cond_4

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ab:Z

    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->swd()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cz()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    cmp-long v4, v0, v2

    .line 51
    .line 52
    if-lez v4, :cond_1

    .line 53
    .line 54
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    sub-long/2addr v4, v0

    .line 59
    cmp-long v0, v4, v2

    .line 60
    .line 61
    if-lez v0, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 64
    .line 65
    invoke-virtual {v0, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(J)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    new-instance v0, Lorg/json/JSONObject;

    .line 73
    .line 74
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 78
    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    iput-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dz:J

    .line 104
    .line 105
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(Lorg/json/JSONObject;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_4
    const-string v0, "invoke callback onAdClose has already been called "

    .line 115
    .line 116
    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public bcc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public cq()V
    .locals 0

    return-void
.end method

.method public cz()V
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "invoke callback onAdClicked, "

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BaseManagerBundle"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public abstract dj()V
.end method

.method public dz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo:Z

    .line 2
    .line 3
    return v0
.end method

.method public ivm()V
    .locals 2

    .line 1
    const-string v0, "BaseManagerBundle"

    .line 2
    .line 3
    const-string v1, "onPause: "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->moa()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->yo()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public lw()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oib:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getWebView()Lcom/bytedance/sdk/component/cz/ivm;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;->uef(Landroid/view/ViewGroup;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oib:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/ivm;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$2;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setJsbLandingPageOpenListener(Lcom/bytedance/sdk/openadsdk/core/widget/lw;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public moa()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->tpx:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->tpx:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public oa()V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "invoke callback onShow, "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BVA"

    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm()V

    return-void
.end method

.method public oa(Landroid/os/Bundle;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zjm(Z)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bcc(Z)V

    :cond_1
    return-void
.end method

.method public oa(Z)V
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo:Z

    return-void
.end method

.method public onAdClicked()V
    .locals 0

    return-void
.end method

.method public onAdDismissed()V
    .locals 0

    return-void
.end method

.method public onAdShow(Landroid/view/View;I)V
    .locals 0

    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRenderSuccess(Landroid/view/View;FF)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dz:J

    .line 43
    .line 44
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(Lorg/json/JSONObject;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/bcc;->moa()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->uef()V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 65
    .line 66
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$3;

    .line 67
    .line 68
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->uef(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dhk:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    .line 75
    .line 76
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;

    .line 77
    .line 78
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 85
    .line 86
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$5;

    .line 87
    .line 88
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$5;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 95
    .line 96
    if-eqz p1, :cond_2

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->yo()V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/uef;->moa()V

    .line 104
    .line 105
    .line 106
    :cond_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/yo/lw;
    .locals 7

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->gzw:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    if-nez v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->gzw:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 17
    :cond_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$6;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    const-string v0, "rewarded_video"

    invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    :goto_0
    move-object v2, p0

    move-object v4, p1

    move v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x5

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$6;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 18
    iget-object p1, v2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->gzw:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    invoke-virtual {v1, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    return-object v1
.end method

.method public uef()V
    .locals 4

    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cz()V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->puz()V

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa(Z)V

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wzm()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/os/Bundle;)V
    .locals 2

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    invoke-static {p1, v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 4
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bs()V

    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Z)V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getAdShowTime()Lcom/bytedance/sdk/openadsdk/moa/xs;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    invoke-virtual {v1, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(ZLcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public abstract uef(ZILjava/lang/String;ILjava/lang/String;I)V
.end method

.method public abstract wk()V
.end method

.method public abstract wrv()V
.end method

.method public xs()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->sy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->oa()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->oa()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    sub-long/2addr v0, v2

    .line 37
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getAdShowTime()Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v1, 0x0

    .line 63
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 64
    .line 65
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v2, v3, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/moa;->uef()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->ivm()V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public yo()V
    .locals 2

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa()V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dj:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Lcom/bytedance/sdk/component/utils/ue;)V

    :cond_0
    return-void
.end method

.method public yo(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    const-string v1, "enable_new_arch"

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    :cond_1
    return-void
.end method

.method public zjm()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dj()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->oib()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
