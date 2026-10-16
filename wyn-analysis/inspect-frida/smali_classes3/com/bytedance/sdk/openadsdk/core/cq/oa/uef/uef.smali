.class Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;,
        Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;
    }
.end annotation


# instance fields
.field private ab:[F

.field private af:I

.field private au:F

.field private bcc:Landroid/graphics/Paint;

.field private bs:[Z

.field private cop:F

.field private final cp:Landroid/graphics/Path;

.field private cq:Landroid/graphics/Matrix;

.field private cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

.field private dhk:[Landroid/animation/ValueAnimator;

.field private dj:[Ljava/lang/String;

.field private dor:F

.field private final dxx:[F

.field private dz:[Ljava/lang/String;

.field private etd:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

.field private final fz:Landroid/graphics/Path;

.field private gb:I

.field private gem:F

.field private final gr:Landroid/graphics/RectF;

.field private final gsd:Landroid/graphics/RectF;

.field private final gzw:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field private ivm:F

.field private km:J

.field private final ku:Landroid/graphics/Path;

.field private lw:I

.field private final lz:[F

.field private moa:I

.field private oa:I

.field private oib:[Landroid/animation/ValueAnimator;

.field private orq:[F

.field private oyt:Landroid/graphics/Paint;

.field private pu:I

.field private final pz:Landroid/graphics/Path;

.field private final rj:Ljava/lang/Runnable;

.field private rl:F

.field private final rt:Landroid/graphics/RectF;

.field private sk:I

.field private swd:F

.field private sy:[Z

.field private tpx:[F

.field private final ue:Landroid/graphics/RectF;

.field private uef:I

.field private uqx:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

.field private wk:[F

.field private wrv:Landroid/graphics/Camera;

.field private xs:Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;

.field private yo:I

.field private zjm:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->zjm:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    new-array v0, p1, [Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Camera;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    .line 26
    .line 27
    new-instance v0, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    .line 33
    .line 34
    new-array v0, p1, [Ljava/lang/String;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dz:[Ljava/lang/String;

    .line 37
    .line 38
    new-array v0, p1, [F

    .line 39
    .line 40
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wk:[F

    .line 41
    .line 42
    new-array v0, p1, [F

    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ab:[F

    .line 45
    .line 46
    new-array v0, p1, [Z

    .line 47
    .line 48
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    .line 49
    .line 50
    new-array v0, p1, [Z

    .line 51
    .line 52
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    .line 53
    .line 54
    new-array v0, p1, [Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    new-array v0, p1, [Landroid/animation/ValueAnimator;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    .line 61
    .line 62
    new-array v0, p1, [F

    .line 63
    .line 64
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->tpx:[F

    .line 65
    .line 66
    new-array p1, p1, [F

    .line 67
    .line 68
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->orq:[F

    .line 69
    .line 70
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 71
    .line 72
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gzw:Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 76
    .line 77
    new-instance p1, Landroid/graphics/RectF;

    .line 78
    .line 79
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 83
    .line 84
    new-instance p1, Landroid/graphics/RectF;

    .line 85
    .line 86
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    .line 90
    .line 91
    new-instance p1, Landroid/graphics/RectF;

    .line 92
    .line 93
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gr:Landroid/graphics/RectF;

    .line 97
    .line 98
    new-instance p1, Landroid/graphics/RectF;

    .line 99
    .line 100
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ue:Landroid/graphics/RectF;

    .line 104
    .line 105
    new-instance p1, Landroid/graphics/Path;

    .line 106
    .line 107
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pz:Landroid/graphics/Path;

    .line 111
    .line 112
    new-instance p1, Landroid/graphics/Path;

    .line 113
    .line 114
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cp:Landroid/graphics/Path;

    .line 118
    .line 119
    new-instance p1, Landroid/graphics/Path;

    .line 120
    .line 121
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ku:Landroid/graphics/Path;

    .line 125
    .line 126
    new-instance p1, Landroid/graphics/Path;

    .line 127
    .line 128
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->fz:Landroid/graphics/Path;

    .line 132
    .line 133
    const/16 p1, 0x8

    .line 134
    .line 135
    new-array v0, p1, [F

    .line 136
    .line 137
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dxx:[F

    .line 138
    .line 139
    new-array p1, p1, [F

    .line 140
    .line 141
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lz:[F

    .line 142
    .line 143
    const-wide/16 v0, 0x0

    .line 144
    .line 145
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->km:J

    .line 146
    .line 147
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$1;

    .line 148
    .line 149
    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rj:Ljava/lang/Runnable;

    .line 153
    .line 154
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa()V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw()V

    .line 158
    .line 159
    .line 160
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->yo()V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static synthetic a(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;ILandroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(ILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;ILandroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa(ILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dz:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    .line 2
    .line 3
    return-object p0
.end method

.method private lw()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    .line 4
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    :cond_0
    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)[Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method private moa()V
    .locals 2

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    .line 3
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef:I

    return p0
.end method

.method private synthetic oa(ILandroid/animation/ValueAnimator;)V
    .locals 4

    .line 2
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wk:[F

    aput p2, v0, p1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->tpx:[F

    const/high16 v1, -0x3d4c0000    # -90.0f

    div-float/2addr p2, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p2

    aput v1, v0, p1

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 6
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->km:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x10

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->km:J

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef:I

    return v0
.end method

.method private uef(III)V
    .locals 6

    .line 74
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    aput-object p1, v3, v1

    const-string p1, "%02d"

    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    aget-boolean v4, v4, v1

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aget-boolean v4, v4, v1

    if-nez v4, :cond_0

    if-eqz v0, :cond_0

    .line 77
    invoke-direct {p0, v1, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    aget-object v0, v0, v2

    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v4, v2, [Ljava/lang/Object;

    aput-object p2, v4, v1

    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 80
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    aget-boolean v4, v4, v2

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aget-boolean v4, v4, v2

    if-nez v4, :cond_1

    if-eqz v0, :cond_1

    .line 81
    invoke-direct {p0, v2, v0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v0, v0, v4

    .line 83
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v5, v2, [Ljava/lang/Object;

    aput-object p3, v5, v1

    invoke-static {p1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    aget-boolean p3, p3, v4

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aget-boolean p3, p3, v4

    if-nez p3, :cond_2

    if-eqz v0, :cond_2

    .line 85
    invoke-direct {p0, v4, v0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    .line 86
    :cond_2
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    aget-object v0, p3, v1

    if-nez v0, :cond_3

    aput-object v3, p3, v1

    .line 87
    :cond_3
    aget-object v0, p3, v2

    if-nez v0, :cond_4

    aput-object p2, p3, v2

    .line 88
    :cond_4
    aget-object p2, p3, v4

    if-nez p2, :cond_5

    aput-object p1, p3, v4

    :cond_5
    return-void
.end method

.method private synthetic uef(ILandroid/animation/ValueAnimator;)V
    .locals 4

    .line 114
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 115
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ab:[F

    aput p2, v0, p1

    .line 116
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->orq:[F

    const/high16 v1, 0x42b40000    # 90.0f

    add-float/2addr p2, v1

    div-float/2addr p2, v1

    aput p2, v0, p1

    .line 117
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 118
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->km:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x10

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 120
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->km:J

    :cond_0
    return-void
.end method

.method private uef(ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    .line 89
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    aput-object p2, v1, p1

    .line 90
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dz:[Ljava/lang/String;

    aput-object p3, p2, p1

    .line 91
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    const/4 p3, 0x1

    aput-boolean p3, p2, p1

    .line 92
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aput-boolean p3, p2, p1

    .line 93
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wk:[F

    const/4 v1, 0x0

    aput v1, p2, p1

    .line 94
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ab:[F

    const/high16 v2, 0x42b40000    # 90.0f

    aput v2, p2, p1

    .line 95
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->tpx:[F

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, p2, p1

    .line 96
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->orq:[F

    aput v1, p2, p1

    .line 97
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object v1, p2, p1

    const-wide/16 v2, 0xfa

    if-nez v1, :cond_0

    .line 98
    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    aput-object v1, p2, p1

    .line 99
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 100
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gzw:Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-virtual {p2, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 101
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/a;

    const/4 v4, 0x0

    invoke-direct {v1, p0, p1, v4}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/a;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;II)V

    invoke-virtual {p2, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 102
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->etd:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

    aget-object v1, v1, p1

    invoke-virtual {p2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    .line 103
    :cond_0
    new-array p2, v0, [F

    fill-array-data p2, :array_1

    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 104
    :goto_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object v1, p2, p1

    if-nez v1, :cond_1

    .line 105
    new-array v0, v0, [F

    fill-array-data v0, :array_2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    aput-object v0, p2, p1

    .line 106
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 107
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gzw:Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 108
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/a;

    invoke-direct {v0, p0, p1, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/a;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;II)V

    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 109
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uqx:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_1

    .line 110
    :cond_1
    new-array p2, v0, [F

    fill-array-data p2, :array_3

    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 111
    :goto_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 112
    :cond_2
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 113
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object p1, p2, p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        -0x3d4c0000    # -90.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        -0x3d4c0000    # -90.0f
    .end array-data

    :array_2
    .array-data 4
        -0x3d4c0000    # -90.0f
        0x0
    .end array-data

    :array_3
    .array-data 4
        -0x3d4c0000    # -90.0f
        0x0
    .end array-data
.end method

.method private uef(Landroid/graphics/Canvas;FF)V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    move-result v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    move-result v1

    add-float/2addr v1, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v1, v0

    sub-float/2addr p3, v1

    .line 73
    const-string v0, ":"

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private uef(Landroid/graphics/Canvas;FFFFLjava/lang/String;I)V
    .locals 3

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    add-float/2addr p4, p2

    add-float/2addr p5, p3

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 19
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p2}, Landroid/graphics/RectF;->centerY()F

    move-result p2

    .line 20
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p3}, Landroid/graphics/RectF;->centerY()F

    move-result p3

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    invoke-virtual {p4}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p4

    invoke-virtual {p4}, Landroid/graphics/Paint;->descent()F

    move-result p4

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    invoke-virtual {p5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p5

    invoke-virtual {p5}, Landroid/graphics/Paint;->ascent()F

    move-result p5

    add-float/2addr p5, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p5, p4

    sub-float/2addr p3, p5

    .line 21
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gr:Landroid/graphics/RectF;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    iget v0, p5, Landroid/graphics/RectF;->left:F

    iget v1, p5, Landroid/graphics/RectF;->top:F

    iget p5, p5, Landroid/graphics/RectF;->right:F

    invoke-virtual {p4, v0, v1, p5, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 22
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pz:Landroid/graphics/Path;

    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 23
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pz:Landroid/graphics/Path;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gr:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dxx:[F

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p4, p5, v0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 24
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    iget p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa:I

    invoke-virtual {p4, p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pz:Landroid/graphics/Path;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 26
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    sget-object p5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p4, p5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 27
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p4

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p4, p3, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 28
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ue:Landroid/graphics/RectF;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    iget v0, p5, Landroid/graphics/RectF;->left:F

    iget v2, p5, Landroid/graphics/RectF;->right:F

    iget p5, p5, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p4, v0, p2, v2, p5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 29
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cp:Landroid/graphics/Path;

    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 30
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cp:Landroid/graphics/Path;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ue:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lz:[F

    invoke-virtual {p4, p5, v0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 31
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    iget p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->yo:I

    invoke-virtual {p4, p5}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cp:Landroid/graphics/Path;

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 33
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    move-result p4

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    invoke-virtual {p5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p5

    invoke-virtual {p1, p6, p4, p3, p5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 34
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bs:[Z

    aget-boolean p4, p4, p7

    if-nez p4, :cond_0

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aget-boolean p5, p5, p7

    if-eqz p5, :cond_2

    :cond_0
    const/high16 p5, 0x437f0000    # 255.0f

    if-eqz p4, :cond_1

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 36
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p4}, Landroid/graphics/Matrix;->reset()V

    .line 37
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    invoke-virtual {p4}, Landroid/graphics/Camera;->save()V

    .line 38
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wk:[F

    aget p6, p6, p7

    invoke-virtual {p4, p6}, Landroid/graphics/Camera;->rotateX(F)V

    .line 39
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p4, p6}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 40
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p6}, Landroid/graphics/RectF;->centerX()F

    move-result p6

    neg-float p6, p6

    neg-float v0, p2

    invoke-virtual {p4, p6, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 41
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p6}, Landroid/graphics/RectF;->centerX()F

    move-result p6

    invoke-virtual {p4, p6, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 42
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p1, p4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 43
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ku:Landroid/graphics/Path;

    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 44
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ku:Landroid/graphics/Path;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gr:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dxx:[F

    invoke-virtual {p4, p6, v0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 45
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    iget p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa:I

    invoke-virtual {p4, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ku:Landroid/graphics/Path;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 47
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p4}, Landroid/graphics/Paint;->getAlpha()I

    move-result p4

    .line 48
    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->tpx:[F

    aget v0, v0, p7

    mul-float/2addr v0, p5

    float-to-int v0, v0

    invoke-virtual {p6, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 49
    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    aget-object p6, p6, p7

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, v0, p3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 50
    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p6, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 51
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    invoke-virtual {p4}, Landroid/graphics/Camera;->restore()V

    .line 52
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 53
    :cond_1
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sy:[Z

    aget-boolean p4, p4, p7

    if-eqz p4, :cond_2

    .line 54
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 55
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p4}, Landroid/graphics/Matrix;->reset()V

    .line 56
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    invoke-virtual {p4}, Landroid/graphics/Camera;->save()V

    .line 57
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ab:[F

    aget p6, p6, p7

    invoke-virtual {p4, p6}, Landroid/graphics/Camera;->rotateX(F)V

    .line 58
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p4, p6}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 59
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p6}, Landroid/graphics/RectF;->centerX()F

    move-result p6

    neg-float p6, p6

    neg-float v0, p2

    invoke-virtual {p4, p6, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 60
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p6}, Landroid/graphics/RectF;->centerX()F

    move-result p6

    invoke-virtual {p4, p6, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cq:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 62
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->fz:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 63
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->fz:Landroid/graphics/Path;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ue:Landroid/graphics/RectF;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lz:[F

    invoke-virtual {p2, p4, p6, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 64
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    iget p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->yo:I

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->fz:Landroid/graphics/Path;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 66
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p2}, Landroid/graphics/Paint;->getAlpha()I

    move-result p2

    .line 67
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->orq:[F

    aget p6, p6, p7

    mul-float/2addr p6, p5

    float-to-int p5, p6

    invoke-virtual {p4, p5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 68
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dz:[Ljava/lang/String;

    aget-object p4, p4, p7

    iget-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rt:Landroid/graphics/RectF;

    invoke-virtual {p5}, Landroid/graphics/RectF;->centerX()F

    move-result p5

    iget-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p1, p4, p5, p3, p6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 69
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oyt:Landroid/graphics/Paint;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 70
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->wrv:Landroid/graphics/Camera;

    invoke-virtual {p2}, Landroid/graphics/Camera;->restore()V

    .line 71
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_2
    return-void
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dj:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->zjm:Landroid/os/Handler;

    return-object p0
.end method

.method private yo()V
    .locals 4

    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->etd:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

    .line 3
    new-array v1, v0, [Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uqx:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->etd:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;

    invoke-direct {v3, p0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$oa;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;I)V

    aput-object v3, v2, v1

    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uqx:[Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;

    invoke-direct {v3, p0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef$uef;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;I)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oib:[Landroid/animation/ValueAnimator;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object v1, v1, v0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dhk:[Landroid/animation/ValueAnimator;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    const/4 v8, 0x0

    .line 2
    const/4 v9, 0x1

    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa:I

    .line 7
    .line 8
    if-lez v2, :cond_2

    .line 9
    .line 10
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 11
    .line 12
    if-gtz v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    int-to-float v3, v3

    .line 26
    const/high16 v10, 0x40000000    # 2.0f

    .line 27
    .line 28
    div-float/2addr v3, v10

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 34
    .line 35
    sub-int/2addr v4, v5

    .line 36
    int-to-float v4, v4

    .line 37
    div-float/2addr v4, v10

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa:I

    .line 43
    .line 44
    add-int/2addr v5, v6

    .line 45
    int-to-float v5, v5

    .line 46
    div-float/2addr v5, v10

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget v7, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 52
    .line 53
    add-int/2addr v6, v7

    .line 54
    int-to-float v6, v6

    .line 55
    div-float/2addr v6, v10

    .line 56
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 60
    .line 61
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ivm:F

    .line 62
    .line 63
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    .line 64
    .line 65
    invoke-virtual {p1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef:I

    .line 69
    .line 70
    div-int/lit16 v3, v2, 0xe10

    .line 71
    .line 72
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pu:I

    .line 73
    .line 74
    rem-int/lit16 v2, v2, 0xe10

    .line 75
    .line 76
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gb:I

    .line 77
    .line 78
    div-int/lit8 v3, v2, 0x3c

    .line 79
    .line 80
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->af:I

    .line 81
    .line 82
    rem-int/lit8 v2, v2, 0x3c

    .line 83
    .line 84
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sk:I

    .line 85
    .line 86
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa:I

    .line 87
    .line 88
    int-to-float v2, v2

    .line 89
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 90
    .line 91
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 92
    .line 93
    int-to-float v2, v2

    .line 94
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->swd:F

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    sub-int/2addr v2, v3

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    sub-int/2addr v2, v3

    .line 110
    int-to-float v2, v2

    .line 111
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gem:F

    .line 112
    .line 113
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 114
    .line 115
    const/high16 v11, 0x40400000    # 3.0f

    .line 116
    .line 117
    mul-float/2addr v3, v11

    .line 118
    iput v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cop:F

    .line 119
    .line 120
    sub-float/2addr v2, v3

    .line 121
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->au:F

    .line 122
    .line 123
    const/4 v3, 0x0

    .line 124
    cmpl-float v3, v2, v3

    .line 125
    .line 126
    if-lez v3, :cond_1

    .line 127
    .line 128
    div-float/2addr v2, v10

    .line 129
    goto :goto_0

    .line 130
    :cond_1
    const/high16 v2, 0x41200000    # 10.0f

    .line 131
    .line 132
    :goto_0
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dor:F

    .line 133
    .line 134
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pu:I

    .line 135
    .line 136
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->af:I

    .line 137
    .line 138
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sk:I

    .line 139
    .line 140
    invoke-direct {p0, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(III)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    int-to-float v2, v2

    .line 148
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 149
    .line 150
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->swd:F

    .line 155
    .line 156
    div-float v4, v5, v10

    .line 157
    .line 158
    sub-float/2addr v3, v4

    .line 159
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 160
    .line 161
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->pu:I

    .line 162
    .line 163
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    new-array v7, v9, [Ljava/lang/Object;

    .line 168
    .line 169
    aput-object v6, v7, v8

    .line 170
    .line 171
    const-string v12, "%02d"

    .line 172
    .line 173
    invoke-static {v12, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    const/4 v7, 0x0

    .line 178
    move-object v0, p0

    .line 179
    move-object v1, p1

    .line 180
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(Landroid/graphics/Canvas;FFFFLjava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    int-to-float v1, v1

    .line 188
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 189
    .line 190
    add-float/2addr v1, v2

    .line 191
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dor:F

    .line 192
    .line 193
    add-float/2addr v2, v1

    .line 194
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->swd:F

    .line 201
    .line 202
    div-float v3, v5, v10

    .line 203
    .line 204
    sub-float v3, v1, v3

    .line 205
    .line 206
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 207
    .line 208
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->af:I

    .line 209
    .line 210
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    new-array v6, v9, [Ljava/lang/Object;

    .line 215
    .line 216
    aput-object v1, v6, v8

    .line 217
    .line 218
    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    const/4 v7, 0x1

    .line 223
    move-object v1, p1

    .line 224
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(Landroid/graphics/Canvas;FFFFLjava/lang/String;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    int-to-float v1, v1

    .line 232
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 233
    .line 234
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dor:F

    .line 235
    .line 236
    add-float/2addr v2, v3

    .line 237
    mul-float/2addr v2, v10

    .line 238
    add-float/2addr v2, v1

    .line 239
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 240
    .line 241
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->swd:F

    .line 246
    .line 247
    div-float v3, v5, v10

    .line 248
    .line 249
    sub-float v3, v1, v3

    .line 250
    .line 251
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 252
    .line 253
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->sk:I

    .line 254
    .line 255
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    new-array v6, v9, [Ljava/lang/Object;

    .line 260
    .line 261
    aput-object v1, v6, v8

    .line 262
    .line 263
    invoke-static {v12, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    const/4 v7, 0x2

    .line 268
    move-object v1, p1

    .line 269
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(Landroid/graphics/Canvas;FFFFLjava/lang/String;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    int-to-float v2, v2

    .line 277
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 278
    .line 279
    add-float/2addr v2, v3

    .line 280
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dor:F

    .line 281
    .line 282
    div-float/2addr v3, v10

    .line 283
    add-float/2addr v3, v2

    .line 284
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 285
    .line 286
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    invoke-direct {p0, p1, v3, v2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(Landroid/graphics/Canvas;FF)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    int-to-float v2, v2

    .line 298
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rl:F

    .line 299
    .line 300
    mul-float/2addr v3, v10

    .line 301
    add-float/2addr v3, v2

    .line 302
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dor:F

    .line 303
    .line 304
    mul-float/2addr v2, v11

    .line 305
    div-float/2addr v2, v10

    .line 306
    add-float/2addr v2, v3

    .line 307
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->gsd:Landroid/graphics/RectF;

    .line 308
    .line 309
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    invoke-direct {p0, p1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef(Landroid/graphics/Canvas;FF)V

    .line 314
    .line 315
    .line 316
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;

    .line 317
    .line 318
    if-eqz v2, :cond_2

    .line 319
    .line 320
    invoke-virtual {v2, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;->uef(Landroid/graphics/Canvas;)V

    .line 321
    .line 322
    .line 323
    :cond_2
    :goto_1
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->uef(II)[I

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    aget p2, p1, v0

    .line 15
    .line 16
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    aget v1, p1, v0

    .line 21
    .line 22
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 29
    .line 30
    if-le v1, p2, :cond_1

    .line 31
    .line 32
    :cond_0
    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 33
    .line 34
    const/high16 v1, 0x40000000    # 2.0f

    .line 35
    .line 36
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    aput p2, p1, v0

    .line 41
    .line 42
    :cond_1
    const/4 p2, 0x0

    .line 43
    aget p2, p1, p2

    .line 44
    .line 45
    aget p1, p1, v0

    .line 46
    .line 47
    invoke-super {p0, p2, p1}, Landroid/view/View;->onMeasure(II)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public uef()Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    return-object v0
.end method

.method public uef(IIIIIF)V
    .locals 5

    const v0, 0x57e7c

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa:I

    .line 4
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->yo:I

    .line 5
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->moa:I

    .line 6
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lw:I

    .line 7
    iput p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ivm:F

    .line 8
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->uef:I

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->zjm:Landroid/os/Handler;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->rj:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->bcc:Landroid/graphics/Paint;

    if-eqz p1, :cond_0

    .line 11
    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->oa:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->dxx:[F

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->ivm:F

    const/4 p3, 0x3

    aput p2, p1, p3

    const/4 p4, 0x2

    aput p2, p1, p4

    const/4 p5, 0x1

    aput p2, p1, p5

    const/4 p6, 0x0

    aput p2, p1, p6

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 13
    aput v1, p1, v0

    const/4 v2, 0x6

    aput v1, p1, v2

    const/4 v3, 0x5

    aput v1, p1, v3

    const/4 v4, 0x4

    aput v1, p1, v4

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->lz:[F

    aput v1, p1, p3

    aput v1, p1, p4

    aput v1, p1, p5

    aput v1, p1, p6

    .line 15
    aput p2, p1, v0

    aput p2, p1, v2

    aput p2, p1, v3

    aput p2, p1, v4

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->cz:Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/cq/oa/uef/oa;

    return-void
.end method
