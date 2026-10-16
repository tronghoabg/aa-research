.class public Lcom/bytedance/sdk/component/adexpress/ivm/tpx;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private bcc:Landroid/animation/AnimatorSet;

.field private cz:Landroid/animation/AnimatorSet;

.field private dj:I

.field private ivm:Landroid/animation/AnimatorSet;

.field private lw:Landroid/widget/TextView;

.field private moa:Landroid/widget/TextView;

.field private oa:Landroid/widget/ImageView;

.field private uef:Landroid/widget/ImageView;

.field private xs:Landroid/animation/AnimatorSet;

.field private yo:Landroid/widget/ImageView;

.field private zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    .line 3
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    .line 4
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    .line 5
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    const/16 v0, 0x64

    .line 6
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    .line 7
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 8
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 9
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    .line 10
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    .line 11
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    .line 12
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    const/16 v0, 0x64

    .line 13
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 15
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->zjm:Ljava/lang/String;

    .line 16
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/adexpress/ivm/tpx;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->yo:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/adexpress/ivm/tpx;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    return-object p0
.end method


# virtual methods
.method public getSlideUpAnimatorSet()Landroid/animation/AnimatorSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()V
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-void

    .line 10
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setGuideText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->moa:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSlideText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->lw:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->lw:Landroid/widget/TextView;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->lw:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public uef()V
    .locals 2

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->yo()V

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    new-instance v1, Lcom/bytedance/sdk/component/adexpress/ivm/tpx$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx$1;-><init>(Lcom/bytedance/sdk/component/adexpress/ivm/tpx;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public uef(Landroid/content/Context;)V
    .locals 4

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object p1

    .line 3
    :cond_0
    const-string v0, "5"

    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->zjm:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/yo/uef;->ivm(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    iget p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v0, v2

    double-to-int p1, v0

    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/yo/uef;->lw(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_0
    const p1, 0x7d06ffee

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef:Landroid/widget/ImageView;

    const p1, 0x7d06ffef

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    const p1, 0x7d06ffea

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->moa:Landroid/widget/TextView;

    const p1, 0x7d06ffed

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->yo:Landroid/widget/ImageView;

    const p1, 0x7d06ffeb

    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->lw:Landroid/widget/TextView;

    return-void
.end method

.method public yo()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef:Landroid/widget/ImageView;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/high16 v4, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v5, 0x2

    .line 9
    new-array v6, v5, [F

    .line 10
    .line 11
    fill-array-data v6, :array_0

    .line 12
    .line 13
    .line 14
    const-string v7, "alpha"

    .line 15
    .line 16
    invoke-static {v2, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v6, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef:Landroid/widget/ImageView;

    .line 21
    .line 22
    new-array v8, v5, [F

    .line 23
    .line 24
    fill-array-data v8, :array_1

    .line 25
    .line 26
    .line 27
    invoke-static {v6, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v8, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->uef:Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget v10, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    .line 38
    .line 39
    neg-int v10, v10

    .line 40
    int-to-float v10, v10

    .line 41
    invoke-static {v9, v10}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    new-array v10, v5, [F

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    aput v3, v10, v11

    .line 49
    .line 50
    const/4 v12, 0x1

    .line 51
    aput v9, v10, v12

    .line 52
    .line 53
    const-string v9, "translationY"

    .line 54
    .line 55
    invoke-static {v8, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    new-instance v10, Landroid/view/animation/PathInterpolator;

    .line 60
    .line 61
    const v13, 0x3e4ccccd    # 0.2f

    .line 62
    .line 63
    .line 64
    const v14, 0x3e99999a    # 0.3f

    .line 65
    .line 66
    .line 67
    invoke-direct {v10, v13, v3, v14, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8, v10}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    iget v15, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    .line 78
    .line 79
    int-to-float v15, v15

    .line 80
    invoke-static {v10, v15}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    float-to-int v10, v10

    .line 85
    filled-new-array {v11, v10}, [I

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    new-instance v15, Lcom/bytedance/sdk/component/adexpress/ivm/tpx$2;

    .line 94
    .line 95
    invoke-direct {v15, v0}, Lcom/bytedance/sdk/component/adexpress/ivm/tpx$2;-><init>(Lcom/bytedance/sdk/component/adexpress/ivm/tpx;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10, v15}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 99
    .line 100
    .line 101
    new-instance v15, Landroid/view/animation/PathInterpolator;

    .line 102
    .line 103
    invoke-direct {v15, v13, v3, v14, v4}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v15}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 107
    .line 108
    .line 109
    iget-object v15, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->yo:Landroid/widget/ImageView;

    .line 110
    .line 111
    move/from16 v16, v11

    .line 112
    .line 113
    new-array v11, v5, [F

    .line 114
    .line 115
    fill-array-data v11, :array_2

    .line 116
    .line 117
    .line 118
    invoke-static {v15, v7, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    iget-object v15, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->yo:Landroid/widget/ImageView;

    .line 123
    .line 124
    move/from16 v17, v12

    .line 125
    .line 126
    new-array v12, v5, [F

    .line 127
    .line 128
    fill-array-data v12, :array_3

    .line 129
    .line 130
    .line 131
    invoke-static {v15, v7, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    iget-object v15, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    .line 136
    .line 137
    new-array v1, v5, [F

    .line 138
    .line 139
    fill-array-data v1, :array_4

    .line 140
    .line 141
    .line 142
    invoke-static {v15, v7, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v15, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    .line 147
    .line 148
    move/from16 v18, v3

    .line 149
    .line 150
    new-array v3, v5, [F

    .line 151
    .line 152
    fill-array-data v3, :array_5

    .line 153
    .line 154
    .line 155
    invoke-static {v15, v7, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v7, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    .line 160
    .line 161
    const-string v15, "scaleX"

    .line 162
    .line 163
    new-array v4, v5, [F

    .line 164
    .line 165
    fill-array-data v4, :array_6

    .line 166
    .line 167
    .line 168
    invoke-static {v7, v15, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v7, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    .line 173
    .line 174
    const-string v15, "scaleY"

    .line 175
    .line 176
    new-array v13, v5, [F

    .line 177
    .line 178
    fill-array-data v13, :array_7

    .line 179
    .line 180
    .line 181
    invoke-static {v7, v15, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    iget-object v13, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->oa:Landroid/widget/ImageView;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v15

    .line 191
    iget v14, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->dj:I

    .line 192
    .line 193
    neg-int v14, v14

    .line 194
    int-to-float v14, v14

    .line 195
    invoke-static {v15, v14}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    new-array v15, v5, [F

    .line 200
    .line 201
    aput v18, v15, v16

    .line 202
    .line 203
    aput v14, v15, v17

    .line 204
    .line 205
    invoke-static {v13, v9, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    new-instance v13, Landroid/view/animation/PathInterpolator;

    .line 210
    .line 211
    move-object/from16 v19, v1

    .line 212
    .line 213
    move/from16 v14, v18

    .line 214
    .line 215
    const v1, 0x3e99999a    # 0.3f

    .line 216
    .line 217
    .line 218
    const/high16 v15, 0x3f800000    # 1.0f

    .line 219
    .line 220
    move/from16 v18, v5

    .line 221
    .line 222
    const v5, 0x3e4ccccd    # 0.2f

    .line 223
    .line 224
    .line 225
    invoke-direct {v13, v5, v14, v1, v15}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v9, v13}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    .line 232
    .line 233
    const-wide/16 v13, 0x32

    .line 234
    .line 235
    invoke-virtual {v1, v13, v14}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 236
    .line 237
    .line 238
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    .line 239
    .line 240
    const-wide/16 v13, 0x5dc

    .line 241
    .line 242
    invoke-virtual {v1, v13, v14}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 243
    .line 244
    .line 245
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    .line 246
    .line 247
    const-wide/16 v13, 0x32

    .line 248
    .line 249
    invoke-virtual {v1, v13, v14}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 250
    .line 251
    .line 252
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    .line 253
    .line 254
    const/4 v5, 0x3

    .line 255
    new-array v13, v5, [Landroid/animation/Animator;

    .line 256
    .line 257
    aput-object v6, v13, v16

    .line 258
    .line 259
    aput-object v3, v13, v17

    .line 260
    .line 261
    aput-object v12, v13, v18

    .line 262
    .line 263
    invoke-virtual {v1, v13}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    .line 267
    .line 268
    const/4 v3, 0x5

    .line 269
    new-array v3, v3, [Landroid/animation/Animator;

    .line 270
    .line 271
    aput-object v2, v3, v16

    .line 272
    .line 273
    aput-object v19, v3, v17

    .line 274
    .line 275
    aput-object v4, v3, v18

    .line 276
    .line 277
    aput-object v7, v3, v5

    .line 278
    .line 279
    const/4 v2, 0x4

    .line 280
    aput-object v11, v3, v2

    .line 281
    .line 282
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 283
    .line 284
    .line 285
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    .line 286
    .line 287
    new-array v2, v5, [Landroid/animation/Animator;

    .line 288
    .line 289
    aput-object v8, v2, v16

    .line 290
    .line 291
    aput-object v10, v2, v17

    .line 292
    .line 293
    aput-object v9, v2, v18

    .line 294
    .line 295
    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 296
    .line 297
    .line 298
    iget-object v1, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->ivm:Landroid/animation/AnimatorSet;

    .line 299
    .line 300
    iget-object v2, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->bcc:Landroid/animation/AnimatorSet;

    .line 301
    .line 302
    iget-object v3, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->cz:Landroid/animation/AnimatorSet;

    .line 303
    .line 304
    iget-object v4, v0, Lcom/bytedance/sdk/component/adexpress/ivm/tpx;->xs:Landroid/animation/AnimatorSet;

    .line 305
    .line 306
    new-array v5, v5, [Landroid/animation/Animator;

    .line 307
    .line 308
    aput-object v2, v5, v16

    .line 309
    .line 310
    aput-object v3, v5, v17

    .line 311
    .line 312
    aput-object v4, v5, v18

    .line 313
    .line 314
    invoke-virtual {v1, v5}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    nop

    .line 319
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    :array_4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    :array_5
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    :array_6
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    :array_7
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
