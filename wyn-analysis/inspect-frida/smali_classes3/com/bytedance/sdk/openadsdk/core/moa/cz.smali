.class public Lcom/bytedance/sdk/openadsdk/core/moa/cz;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/uef;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$moa;
.implements Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$yo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;
    }
.end annotation


# instance fields
.field private ab:J

.field private bs:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

.field private cq:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

.field private dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

.field public uef:Z

.field private wk:Ljava/lang/String;

.field private wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->uef:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 8
    .line 9
    return-void
.end method

.method private lw()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;->uef(II)Lcom/bytedance/sdk/openadsdk/core/zjm/oib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-lez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-float v2, v2

    .line 42
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 47
    .line 48
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 49
    .line 50
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    int-to-float v2, v2

    .line 57
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 65
    .line 66
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    iget v2, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/oib;->oa:F

    .line 74
    .line 75
    div-float/2addr v1, v2

    .line 76
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 85
    .line 86
    :goto_0
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 87
    .line 88
    if-lez v1, :cond_1

    .line 89
    .line 90
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 91
    .line 92
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-le v1, v2, :cond_1

    .line 97
    .line 98
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 99
    .line 100
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    int-to-float v1, v1

    .line 105
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 106
    .line 107
    int-to-float v2, v2

    .line 108
    div-float/2addr v1, v2

    .line 109
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    .line 110
    .line 111
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iput v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 116
    .line 117
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 118
    .line 119
    int-to-float v2, v2

    .line 120
    mul-float/2addr v2, v1

    .line 121
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Float;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 130
    .line 131
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v1, :cond_2

    .line 136
    .line 137
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 138
    .line 139
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 140
    .line 141
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 142
    .line 143
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 144
    .line 145
    .line 146
    :cond_2
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->xs:I

    .line 147
    .line 148
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 149
    .line 150
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->bcc:I

    .line 151
    .line 152
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 153
    .line 154
    instance-of v2, v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 155
    .line 156
    if-eqz v2, :cond_3

    .line 157
    .line 158
    move-object v2, v1

    .line 159
    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 160
    .line 161
    const/16 v3, 0x11

    .line 162
    .line 163
    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 164
    .line 165
    :cond_3
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 166
    .line 167
    .line 168
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/oib;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    return-object p0
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/core/zjm/oib;)Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;
    .locals 5

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/cz$1;)V

    .line 3
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    .line 4
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v3, -0x1

    .line 5
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 7
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    invoke-direct {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/widget/wrv;

    .line 9
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x11

    .line 10
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 11
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/widget/wrv;

    invoke-virtual {v3, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/widget/wrv;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    const/high16 v3, 0x40a00000    # 5.0f

    invoke-static {v1, v3}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v1

    if-eqz p1, :cond_0

    .line 14
    iget p1, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/oib;->uef:I

    const/4 v3, 0x1

    if-ne p1, v3, :cond_0

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/ivm;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/ivm;->oa(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 17
    :goto_0
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    const v3, 0x1f000001

    invoke-virtual {p1, v3}, Landroid/view/View;->setId(I)V

    .line 18
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v3, 0x800005

    .line 19
    iput v3, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 20
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 21
    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v3, p1}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    iget-object v3, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, v3}, Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;->createPAGLogoViewByMaterial(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    move-result-object p1

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    .line 24
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v2, 0x800053

    .line 25
    iput v2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 26
    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 27
    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    invoke-virtual {v2, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    iget-object v2, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 29
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    invoke-direct {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    iput-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 30
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->oa:Landroid/content/Context;

    const/high16 v2, 0x41300000    # 11.0f

    invoke-static {p1, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p1

    .line 31
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, p1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const p1, 0x800055

    .line 32
    iput p1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 33
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 34
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 35
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 37
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->bs:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/zjm/oib;)V
    .locals 9

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_a

    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hw()I

    move-result v0

    .line 16
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/oib;)Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 17
    iget-object v1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->uef:Landroid/widget/FrameLayout;

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    iget-object v1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 20
    iget-object v2, p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    .line 21
    iget-object v3, p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 22
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gzw()Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    .line 23
    invoke-static {v3, v5}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 24
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    move-result-object v5

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x41300000    # 11.0f

    invoke-static {v6, v7, v4}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/content/Context;FZ)F

    move-result v6

    float-to-int v6, v6

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5, v6, v3, v7}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->uef(ILandroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->getVideoView()Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    move-result-object v5

    .line 26
    instance-of v6, v5, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    if-eqz v6, :cond_2

    .line 27
    iput-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    .line 28
    invoke-virtual {v5, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->setVideoAdLoadListener(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$moa;)V

    .line 29
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    invoke-virtual {v6, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->setVideoAdInteractionListener(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$yo;)V

    .line 30
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    new-instance v7, Landroid/util/Pair;

    sget-object v8, Lcom/iab/omid/library/bytedance2/adsession/FriendlyObstructionPurpose;->CLOSE_AD:Lcom/iab/omid/library/bytedance2/adsession/FriendlyObstructionPurpose;

    invoke-direct {v7, v1, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v7, Landroid/util/Pair;

    sget-object v8, Lcom/iab/omid/library/bytedance2/adsession/FriendlyObstructionPurpose;->OTHER:Lcom/iab/omid/library/bytedance2/adsession/FriendlyObstructionPurpose;

    invoke-direct {v7, v2, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v7, Landroid/util/Pair;

    invoke-direct {v7, v3, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    invoke-virtual {v3, v6}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->uef(Ljava/util/List;)Lcom/bytedance/sdk/openadsdk/core/dz/ivm;

    .line 35
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    new-instance v6, Lcom/bytedance/sdk/openadsdk/core/moa/cz$1;

    invoke-direct {v6, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/cz$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)V

    invoke-virtual {v3, v6}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->setAdCreativeClickListener(Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 36
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/moa/cz$2;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/cz$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    if-eqz v1, :cond_4

    .line 37
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/moa/cz$3;

    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/cz$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    :cond_4
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/cz$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/widget/wrv;

    .line 39
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nkc()Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    move-result-object v1

    if-eqz v1, :cond_8

    if-eqz p1, :cond_8

    .line 40
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nkc()Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->zjm()I

    move-result v1

    .line 41
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nkc()Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->dj()I

    move-result v2

    int-to-float v2, v2

    if-lez v1, :cond_5

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_5

    int-to-float v0, v1

    div-float/2addr v0, v2

    .line 42
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;->setRatio(F)V

    goto :goto_0

    :cond_5
    const/16 v1, 0xf

    if-ne v0, v1, :cond_6

    const/high16 v0, 0x3f100000    # 0.5625f

    .line 43
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;->setRatio(F)V

    goto :goto_0

    :cond_6
    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    const v0, 0x3fe38e39

    .line 44
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;->setRatio(F)V

    goto :goto_0

    :cond_7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/widget/wrv;->setRatio(F)V

    .line 46
    :cond_8
    :goto_0
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    if-eqz v5, :cond_9

    if-eqz p1, :cond_9

    .line 47
    invoke-virtual {p1, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const v1, 0x1f000042

    invoke-virtual {v5, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    :cond_9
    invoke-virtual {p0, v5, v4}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->uef(Landroid/view/View;Z)V

    .line 50
    invoke-virtual {p0, p0, v4}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->uef(Landroid/view/View;Z)V

    .line 51
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->uef(Landroid/view/View;)V

    :cond_a
    :goto_1
    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/moa/cz;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getVideoProgress()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->ab:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public h_()V
    .locals 0

    return-void
.end method

.method public i_()V
    .locals 0

    return-void
.end method

.method public j_()V
    .locals 0

    return-void
.end method

.method public k_()V
    .locals 0

    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->bs:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 2
    .line 3
    return-void
.end method

.method public setClosedListenerKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wk:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public uef()V
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->lw:Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->moa:Lcom/bytedance/sdk/openadsdk/yo/yo;

    if-eqz v0, :cond_1

    .line 55
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef()V

    return-void

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wk:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTDelegateActivity;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    return-void
.end method

.method public uef(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(JJ)V
    .locals 0

    .line 57
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->ab:J

    return-void
.end method

.method public uef(Landroid/view/View;ILcom/bytedance/sdk/openadsdk/core/model/ab;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->getNativeVideoController()Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    move-result-object p1

    instance-of p1, p1, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->dz:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm;->getNativeVideoController()Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->km()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V
    .locals 1

    const/high16 v0, -0x1000000

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 10
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->cq:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 11
    const-string p1, "banner_ad"

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef;->ivm:Ljava/lang/String;

    .line 12
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 p3, -0x2

    invoke-direct {p1, p3, p3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/cz;->lw()V

    return-void
.end method
