.class public abstract Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;
.super Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;
.source "SourceFile"


# instance fields
.field private cq:Lcom/bytedance/sdk/openadsdk/cq/xs;

.field protected dj:Lcom/bytedance/sdk/openadsdk/core/yo/lw;

.field public wrv:Lcom/bytedance/sdk/openadsdk/core/widget/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->moa()V

    :cond_0
    return-void
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)Z
    .locals 0

    .line 17
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    if-eqz p1, :cond_0

    .line 18
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->cz()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)I
    .locals 1

    .line 6
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yc()I

    move-result p1

    return p1

    .line 8
    :cond_0
    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ho()I

    move-result p1

    return p1

    :cond_1
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qe()I

    move-result p1

    return p1
.end method

.method public static uef(Landroid/content/Context;)Landroid/widget/FrameLayout;
    .locals 2

    .line 143
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 144
    sget p0, Lcom/bytedance/sdk/openadsdk/utils/bs;->cq:I

    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    const/high16 p0, -0x1000000

    .line 145
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 146
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    .line 147
    iput v1, p0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 148
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private uef(JJ)V
    .locals 2

    sub-long p1, p3, p1

    .line 88
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardVideoActivity;

    if-eqz v1, :cond_0

    .line 89
    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardVideoActivity;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardVideoActivity;->yo(JJ)V

    :cond_0
    return-void
.end method

.method public static uef(Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 9

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 91
    iget-boolean v1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ou:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eqz v1, :cond_3

    .line 92
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 93
    sget v5, Lcom/bytedance/sdk/openadsdk/utils/bs;->wrv:I

    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 94
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(Landroid/content/Context;)Landroid/widget/FrameLayout;

    move-result-object v5

    .line 96
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v6

    const-string v7, ""

    if-eqz v6, :cond_0

    .line 97
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 98
    invoke-virtual {v6}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 99
    :cond_0
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 100
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1

    const/4 v7, 0x0

    .line 101
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/bytedance/sdk/openadsdk/core/model/sy;

    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    move-result-object v7

    .line 102
    :cond_1
    :goto_0
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 103
    new-instance v6, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v6, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    .line 104
    sget v8, Lcom/bytedance/sdk/openadsdk/utils/bs;->jh:I

    invoke-virtual {v6, v8}, Landroid/view/View;->setId(I)V

    .line 105
    invoke-virtual {v6, v8, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 106
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 107
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    move-object v6, v3

    .line 108
    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 109
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/widget/dj;

    invoke-direct {v5, v0}, Lcom/bytedance/sdk/openadsdk/core/widget/dj;-><init>(Landroid/content/Context;)V

    .line 110
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 111
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/view/moa;

    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/moa;-><init>(Landroid/content/Context;)V

    .line 112
    sget v5, Lcom/bytedance/sdk/openadsdk/utils/bs;->dz:I

    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 113
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v5, v4, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x50

    .line 114
    iput v7, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 115
    invoke-virtual {p0, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 116
    new-instance v5, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa$2;

    invoke-direct {v5, p1, v6}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/core/ivm/moa;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 117
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;-><init>(Landroid/content/Context;)V

    .line 118
    sget v5, Lcom/bytedance/sdk/openadsdk/utils/bs;->wk:I

    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 119
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x8

    .line 120
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 121
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 122
    :cond_3
    iget-boolean v1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rl:Z

    if-eqz v1, :cond_6

    .line 123
    new-instance v1, Lcom/bytedance/sdk/component/cz/ivm;

    sget-object v5, Lcom/bytedance/sdk/component/cz/ivm$yo;->moa:Lcom/bytedance/sdk/component/cz/ivm$yo;

    invoke-direct {v1, v0, v2, v5}, Lcom/bytedance/sdk/component/cz/ivm;-><init>(Landroid/content/Context;ZLcom/bytedance/sdk/component/cz/ivm$yo;)V

    .line 124
    sget v2, Lcom/bytedance/sdk/openadsdk/utils/bs;->ab:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    const/4 v2, 0x2

    .line 125
    invoke-virtual {v1, v2, v3}, Lcom/bytedance/sdk/component/cz/ivm;->setLayerType(ILandroid/graphics/Paint;)V

    const/4 v2, 0x4

    .line 126
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setVisibility(I)V

    .line 127
    iget-object v3, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    .line 128
    iget-object v5, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->wrv(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v5

    .line 129
    iget-boolean v6, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ne:Z

    if-nez v6, :cond_5

    if-nez v3, :cond_4

    if-eqz v5, :cond_5

    .line 130
    :cond_4
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 131
    iget-object v5, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const/high16 v6, 0x42680000    # 58.0f

    invoke-static {v5, v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v5

    iput v5, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 132
    invoke-virtual {p0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    .line 133
    :cond_5
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    :goto_2
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 135
    sget v3, Lcom/bytedance/sdk/openadsdk/utils/bs;->bs:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    .line 136
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 137
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 139
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 140
    sget v0, Lcom/bytedance/sdk/openadsdk/utils/bs;->ksq:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 141
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 142
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;I)Z
    .locals 9

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    return v1

    .line 11
    :cond_0
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    .line 13
    :goto_1
    iget-object v3, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    if-eqz v3, :cond_3

    .line 14
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dz()J

    move-result-wide v3

    int-to-long v5, p2

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    cmp-long p2, v3, v5

    if-ltz p2, :cond_3

    move p2, v2

    goto :goto_2

    :cond_3
    move p2, v1

    .line 15
    :goto_2
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    if-eqz p1, :cond_4

    .line 16
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->moa()Z

    move-result p1

    if-eqz p1, :cond_4

    move p1, v2

    goto :goto_3

    :cond_4
    move p1, v1

    :goto_3
    if-eqz v0, :cond_6

    if-nez p2, :cond_5

    if-eqz p1, :cond_6

    :cond_5
    return v2

    :cond_6
    return v1
.end method

.method private yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public ab()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sy:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 23
    .line 24
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    .line 25
    .line 26
    if-gez v0, :cond_0

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/16 v2, 0x2bc

    .line 36
    .line 37
    iput v2, v0, Landroid/os/Message;->what:I

    .line 38
    .line 39
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 40
    .line 41
    iget v3, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    .line 42
    .line 43
    iput v3, v0, Landroid/os/Message;->arg1:I

    .line 44
    .line 45
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 51
    .line 52
    iget v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bcc:I

    .line 53
    .line 54
    if-lez v2, :cond_2

    .line 55
    .line 56
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oib:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/16 v1, 0x384

    .line 69
    .line 70
    iput v1, v0, Landroid/os/Message;->what:I

    .line 71
    .line 72
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 73
    .line 74
    iget v2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bcc:I

    .line 75
    .line 76
    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 77
    .line 78
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public bcc()Landroid/view/View;
    .locals 9

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sget v1, Lcom/bytedance/sdk/openadsdk/utils/bs;->wg:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/widget/ivm;->oa(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v2, 0x1f00000c

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 30
    .line 31
    const/4 v3, -0x2

    .line 32
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    const v4, 0x800035

    .line 36
    .line 37
    .line 38
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 39
    .line 40
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 41
    .line 42
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 43
    .line 44
    const/high16 v5, 0x41a00000    # 20.0f

    .line 45
    .line 46
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 51
    .line 52
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 53
    .line 54
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 55
    .line 56
    const/high16 v5, 0x41800000    # 16.0f

    .line 57
    .line 58
    invoke-static {v4, v5}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 68
    .line 69
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 70
    .line 71
    const-string v4, "tt_ad_close_text"

    .line 72
    .line 73
    invoke-static {v2, v4}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    const/16 v2, 0x8

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 86
    .line 87
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 88
    .line 89
    const/high16 v4, 0x41600000    # 14.0f

    .line 90
    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->gr()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    const/4 v2, 0x0

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 107
    .line 108
    iget-object v5, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 109
    .line 110
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 111
    .line 112
    invoke-static {v5, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;->createPAGLogoViewByMaterial(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const v5, 0x1f00003d

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v5}, Landroid/view/View;->setId(I)V

    .line 120
    .line 121
    .line 122
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 123
    .line 124
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 125
    .line 126
    iget-object v6, v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 127
    .line 128
    invoke-static {v6, v4}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    invoke-direct {v5, v3, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 133
    .line 134
    .line 135
    const v6, 0x800053

    .line 136
    .line 137
    .line 138
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 139
    .line 140
    invoke-virtual {v2, v5}, Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 141
    .line 142
    .line 143
    :goto_1
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 144
    .line 145
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 146
    .line 147
    iget-object v6, v6, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 148
    .line 149
    invoke-direct {v5, v6}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    .line 150
    .line 151
    .line 152
    sget v6, Lcom/bytedance/sdk/openadsdk/utils/bs;->ovw:I

    .line 153
    .line 154
    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    .line 155
    .line 156
    .line 157
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 158
    .line 159
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 160
    .line 161
    iget-object v7, v7, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 162
    .line 163
    const/high16 v8, 0x42000000    # 32.0f

    .line 164
    .line 165
    invoke-static {v7, v8}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 170
    .line 171
    iget-object v8, v8, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 172
    .line 173
    invoke-static {v8, v4}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-direct {v6, v7, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 178
    .line 179
    .line 180
    const v4, 0x800055

    .line 181
    .line 182
    .line 183
    iput v4, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 184
    .line 185
    invoke-virtual {v5, v6}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    .line 187
    .line 188
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 189
    .line 190
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 191
    .line 192
    const/high16 v6, 0x41100000    # 9.0f

    .line 193
    .line 194
    invoke-static {v4, v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 199
    .line 200
    iget-object v7, v7, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 201
    .line 202
    invoke-static {v7, v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    const/4 v7, 0x0

    .line 207
    invoke-virtual {v5, v4, v7, v6, v7}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setPadding(IIII)V

    .line 208
    .line 209
    .line 210
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 211
    .line 212
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 213
    .line 214
    .line 215
    if-eqz v2, :cond_2

    .line 216
    .line 217
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 218
    .line 219
    .line 220
    :cond_2
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 224
    .line 225
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 226
    .line 227
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_3

    .line 232
    .line 233
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 234
    .line 235
    iget-boolean v4, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    .line 236
    .line 237
    if-eqz v4, :cond_3

    .line 238
    .line 239
    iget v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->uef:I

    .line 240
    .line 241
    const/4 v4, 0x1

    .line 242
    if-eq v2, v4, :cond_4

    .line 243
    .line 244
    :cond_3
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 245
    .line 246
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 247
    .line 248
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 249
    .line 250
    invoke-direct {v2, v4}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;-><init>(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    sget v4, Lcom/bytedance/sdk/openadsdk/utils/bs;->uz:I

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroid/view/View;->setId(I)V

    .line 256
    .line 257
    .line 258
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 259
    .line 260
    const/4 v5, -0x1

    .line 261
    invoke-direct {v4, v5, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    return-object v0
.end method

.method public bs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iput-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cop:Z

    .line 8
    .line 9
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 10
    .line 11
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ab()V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->dz()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ab()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->bcc()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oib:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sy:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/utils/dz;->oa()V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :catchall_0
    :goto_0
    return-void
.end method

.method public cq()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->lw()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 18
    .line 19
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 24
    .line 25
    instance-of v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    return-void

    .line 31
    :cond_2
    :goto_1
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->ivm(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public cz()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bx()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x5

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget v1, Lcom/bytedance/sdk/openadsdk/utils/bs;->pp:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public dhk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->dj()Z

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
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 17
    .line 18
    iget v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->orq(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 38
    .line 39
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 52
    .line 53
    invoke-direct {p0, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;I)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 60
    .line 61
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
.end method

.method public dj()V
    .locals 0

    return-void
.end method

.method public dz()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x12c

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public gr()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public gsd()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->yo()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->gr()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->rt()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->gr()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;->oa()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    .line 57
    .line 58
    const/16 v1, 0x1f4

    .line 59
    .line 60
    const-wide/16 v2, 0x64

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 66
    .line 67
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 68
    .line 69
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->uqx:F

    .line 70
    .line 71
    const/high16 v2, 0x42c80000    # 100.0f

    .line 72
    .line 73
    cmpl-float v0, v0, v2

    .line 74
    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const/4 v0, 0x0

    .line 80
    :goto_0
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->uef(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->orq()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->ivm()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public gzw()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->lw()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/xs;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->oa()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->cz:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->wk()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-interface {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->uef(JZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dj()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 42
    .line 43
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 48
    .line 49
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->gzw()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    sget v0, Lcom/bytedance/sdk/openadsdk/moa/oa$oa;->uef:I

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(I)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pu()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    xor-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    const/4 v2, 0x4

    .line 73
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(II)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ib()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 95
    .line 96
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 97
    .line 98
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    invoke-interface {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef(J)V

    .line 105
    .line 106
    .line 107
    :cond_3
    return-void
.end method

.method public abstract ivm()V
.end method

.method public abstract lw()Z
.end method

.method public abstract moa()Z
.end method

.method public oa(Z)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->ivm()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->dz()V

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oyt()V

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->moa()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dj()V

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    if-eqz p1, :cond_4

    .line 10
    sget v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->uef:I

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->yo(I)V

    .line 11
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    if-eqz p1, :cond_5

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->wrv()V

    .line 13
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    if-eqz p1, :cond_6

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;->yo()V

    .line 15
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz p1, :cond_7

    .line 16
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/utils/dz;->yo()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_7
    return-void
.end method

.method public oib()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->oa(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public orq()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gr:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->yo()Lcom/bytedance/sdk/openadsdk/core/yo/lw;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/yo/lw;

    .line 10
    .line 11
    return-void
.end method

.method public final rt()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 20
    .line 21
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v1, "reward_endcard"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string v1, "fullscreen_endcard"

    .line 29
    .line 30
    :goto_0
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq:Lcom/bytedance/sdk/openadsdk/cq/xs;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 35
    .line 36
    invoke-virtual {v2, v3, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/cq/xs;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 40
    .line 41
    iget-boolean v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vj:Z

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    .line 46
    .line 47
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->uef(Z)V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 53
    .line 54
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gb:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 57
    .line 58
    invoke-virtual {v2, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw()V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public sy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->ab()V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 14
    .line 15
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 16
    .line 17
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cp:Lcom/bytedance/sdk/openadsdk/cq/zjm;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/cq/zjm;->uef()I

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->xs()I

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->wk()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 33
    .line 34
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 39
    .line 40
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa$1;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public tpx()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->yo()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->lw(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public uef(I)V
    .locals 2

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v0, v1, v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(ZZZI)V

    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    if-eqz p1, :cond_0

    .line 20
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->cz:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    const/16 v0, 0x2710

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->oa(I)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 12

    .line 21
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_13

    const/16 v2, 0x12c

    if-eq v0, v2, :cond_f

    const/16 v2, 0x190

    const/4 v3, 0x0

    if-eq v0, v2, :cond_e

    const/16 v1, 0x1f4

    const/high16 v2, 0x3f800000    # 1.0f

    if-eq v0, v1, :cond_a

    const/16 v1, 0x258

    if-eq v0, v1, :cond_9

    const-wide/16 v4, 0x3e8

    .line 22
    const-string v1, "s"

    const/16 v6, 0x2bc

    if-eq v0, v6, :cond_4

    const/16 v6, 0x320

    if-eq v0, v6, :cond_2

    const/16 v2, 0x384

    if-eq v0, v2, :cond_0

    goto/16 :goto_2

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oib:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_12

    .line 24
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gb()D

    move-result-wide v6

    int-to-long v8, p1

    const-wide v10, 0x408f400000000000L    # 1000.0

    mul-double/2addr v10, v6

    double-to-long v10, v10

    .line 26
    invoke-direct {p0, v8, v9, v10, v11}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(JJ)V

    if-lez p1, :cond_1

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->oa()V

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit16 v9, p1, 0x3e8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef(Ljava/lang/CharSequence;)V

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->lw(Z)V

    .line 30
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 31
    iput v2, v0, Landroid/os/Message;->what:I

    add-int/lit16 v1, p1, -0x3e8

    .line 32
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 33
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iput v1, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bcc:I

    .line 34
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {v1, v0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-eqz v1, :cond_12

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz v1, :cond_12

    const-wide/16 v1, 0x0

    cmpl-double v1, v6, v1

    if-lez v1, :cond_12

    .line 36
    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    int-to-float p1, p1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p1, v1

    float-to-double v1, p1

    div-double/2addr v1, v6

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    double-to-float p1, v3

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(F)V

    return-void

    .line 37
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq()V

    .line 39
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 40
    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-eqz p1, :cond_12

    instance-of p1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz p1, :cond_12

    .line 41
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    move-result-object p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    invoke-direct {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;-><init>(ILcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    return-void

    .line 42
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 43
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {p1, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->yo(Z)V

    .line 44
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->uef(F)V

    .line 45
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    move-result p1

    if-nez p1, :cond_12

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm()Z

    move-result p1

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_12

    .line 46
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk()V

    return-void

    .line 47
    :cond_4
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 48
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sy:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_12

    if-lez p1, :cond_5

    .line 49
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->oa()V

    .line 50
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit16 v7, p1, 0x3e8

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->lw(Z)V

    .line 52
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 53
    iput v6, v0, Landroid/os/Message;->what:I

    add-int/lit16 p1, p1, -0x3e8

    .line 54
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 55
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget v1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    add-int/lit16 v1, v1, -0x3e8

    iput v1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xs:I

    .line 56
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {p1, v0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 57
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->zjm:Lcom/bytedance/sdk/component/utils/ue;

    invoke-virtual {p1, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 58
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 59
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->oa()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cq()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    .line 60
    :cond_6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->tpx()V

    return-void

    .line 61
    :cond_7
    :goto_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq()V

    return-void

    .line 62
    :cond_8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq()V

    return-void

    .line 63
    :cond_9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->cq()V

    return-void

    .line 64
    :cond_a
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-nez p1, :cond_b

    .line 65
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {p1, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->yo(Z)V

    .line 66
    :cond_b
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    if-eqz p1, :cond_c

    .line 67
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 68
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->cq()V

    .line 69
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->resumeTimers()V

    .line 70
    :cond_c
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 71
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(F)V

    .line 72
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->uef(F)V

    .line 73
    :cond_d
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    move-result p1

    if-nez p1, :cond_12

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->ivm()Z

    move-result p1

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_12

    .line 74
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk()V

    return-void

    .line 75
    :cond_e
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dhk()V

    const/4 p1, 0x3

    .line 76
    invoke-virtual {p0, v3, v1, v3, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(ZZZI)V

    return-void

    .line 77
    :cond_f
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-eqz v0, :cond_10

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz v0, :cond_10

    .line 78
    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->gzw()V

    goto :goto_1

    .line 79
    :cond_10
    sget p1, Lcom/bytedance/sdk/openadsdk/moa/oa$oa;->oa:I

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(I)V

    .line 80
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pu()Z

    move-result v0

    xor-int/2addr v0, v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->pu()Z

    move-result v2

    xor-int/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(II)V

    .line 81
    :goto_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lw:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "play_video_time_out"

    invoke-static {v0, v2, p1, v1}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 83
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object p1

    if-eqz p1, :cond_11

    .line 84
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;->lw:Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;)V

    .line 85
    :cond_11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    if-eqz p1, :cond_12

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->wk:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    if-eqz p1, :cond_12

    .line 86
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm()V

    :cond_12
    :goto_2
    return-void

    .line 87
    :cond_13
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->tpx()V

    return-void
.end method

.method public abstract uef(Landroid/widget/FrameLayout;)V
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->uef(Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Lcom/bytedance/sdk/component/utils/ue;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Lcom/bytedance/sdk/component/utils/ue;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean p2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ou:Z

    if-eqz p2, :cond_0

    .line 3
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Z)V

    :cond_0
    return-void
.end method

.method public uef(ZZZI)V
    .locals 7

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    move-object v5, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;->uef(ZZZLcom/bytedance/sdk/openadsdk/component/reward/oa/oa;I)V

    return-void
.end method

.method public wk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->pz()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->fz()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->ab()V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->zjm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hnk:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 74
    .line 75
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef()V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa()V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public wrv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->wrv:Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->wrv:Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dismiss()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public xs()Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/RFEndCardBackUpLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public zjm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rt:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->moa:Z

    .line 6
    .line 7
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->oa()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->lz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/ivm;->uef()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->uef()V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->xs()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->moa()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 80
    .line 81
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc()Lcom/bytedance/sdk/component/cz/ivm;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v1, 0x4

    .line 88
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 94
    .line 95
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 102
    .line 103
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 104
    .line 105
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 112
    .line 113
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 114
    .line 115
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 123
    .line 124
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 125
    .line 126
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 127
    .line 128
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->rj:I

    .line 129
    .line 130
    int-to-float v0, v0

    .line 131
    invoke-static {v2, v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 136
    .line 137
    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    .line 138
    .line 139
    iget v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dv:I

    .line 140
    .line 141
    int-to-float v2, v2

    .line 142
    invoke-static {v3, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->uef(II)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 150
    .line 151
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->orq:Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw;->uef()V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 157
    .line 158
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->wxf:Z

    .line 159
    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->uef(I)V

    .line 166
    .line 167
    .line 168
    :cond_3
    :goto_0
    return-void
.end method
