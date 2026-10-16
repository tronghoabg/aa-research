.class public final Lcom/google/android/ads/nativetemplates/TemplateView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Lp5/a;

.field public c:Lcom/google/android/gms/ads/nativead/NativeAd;

.field public d:Lcom/google/android/gms/ads/nativead/NativeAdView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/RatingBar;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/ImageView;

.field public j:Lcom/google/android/gms/ads/nativead/MediaView;

.field public k:Landroid/widget/Button;

.field public l:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lad/a0;->a:[I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, p2, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const v0, 0x7f0d0042

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    .line 26
    .line 27
    const-string p2, "layout_inflater"

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/LayoutInflater;

    .line 34
    .line 35
    iget p2, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 43
    .line 44
    .line 45
    throw p1
.end method


# virtual methods
.method public getNativeAdView()Lcom/google/android/gms/ads/nativead/NativeAdView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTemplateTypeName()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->a:I

    .line 2
    .line 3
    const v1, 0x7f0d0042

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const-string v0, "medium_template"

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const v1, 0x7f0d0043

    .line 12
    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    const-string v0, "small_template"

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string v0, ""

    .line 20
    .line 21
    return-object v0
.end method

.method public final onFinishInflate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0a01e0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 14
    .line 15
    const v0, 0x7f0a0215

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 25
    .line 26
    const v0, 0x7f0a024f

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/TextView;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 36
    .line 37
    const v0, 0x7f0a0087

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/widget/TextView;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 47
    .line 48
    const v0, 0x7f0a021c

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/widget/RatingBar;

    .line 56
    .line 57
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->g:Landroid/widget/RatingBar;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 61
    .line 62
    .line 63
    const v0, 0x7f0a00c0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroid/widget/Button;

    .line 71
    .line 72
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 73
    .line 74
    const v0, 0x7f0a0150

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/widget/ImageView;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->i:Landroid/widget/ImageView;

    .line 84
    .line 85
    const v0, 0x7f0a01b5

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lcom/google/android/gms/ads/nativead/MediaView;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->j:Lcom/google/android/gms/ads/nativead/MediaView;

    .line 95
    .line 96
    const v0, 0x7f0a0077

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 104
    .line 105
    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 106
    .line 107
    return-void
.end method

.method public setNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd;)V
    .locals 13

    .line 1
    iput-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->c:Lcom/google/android/gms/ads/nativead/NativeAd;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getStore()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getAdvertiser()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getHeadline()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getBody()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getCallToAction()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getStarRating()Ljava/lang/Double;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getIcon()Lcom/google/android/gms/ads/nativead/c;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 32
    .line 33
    iget-object v8, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 34
    .line 35
    invoke-virtual {v7, v8}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setCallToActionView(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 39
    .line 40
    iget-object v8, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v7, v8}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setHeadlineView(Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 46
    .line 47
    iget-object v8, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->j:Lcom/google/android/gms/ads/nativead/MediaView;

    .line 48
    .line 49
    invoke-virtual {v7, v8}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setMediaView(Lcom/google/android/gms/ads/nativead/MediaView;)V

    .line 50
    .line 51
    .line 52
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getStore()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getAdvertiser()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_0

    .line 71
    .line 72
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_0

    .line 77
    .line 78
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 79
    .line 80
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {v1, v7}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setStoreView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_1

    .line 91
    .line 92
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 93
    .line 94
    iget-object v7, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {v0, v7}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setAdvertiserView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    move-object v0, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    const-string v0, ""

    .line 102
    .line 103
    :goto_0
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 109
    .line 110
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    const/16 v1, 0x8

    .line 114
    .line 115
    if-eqz v5, :cond_2

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    const-wide/16 v11, 0x0

    .line 122
    .line 123
    cmpl-double v2, v9, v11

    .line 124
    .line 125
    if-lez v2, :cond_2

    .line 126
    .line 127
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->g:Landroid/widget/RatingBar;

    .line 133
    .line 134
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->g:Landroid/widget/RatingBar;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Double;->floatValue()F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {v0, v2}, Landroid/widget/RatingBar;->setRating(F)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 147
    .line 148
    iget-object v2, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->g:Landroid/widget/RatingBar;

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setStarRatingView(Landroid/view/View;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    iget-object v2, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 155
    .line 156
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->g:Landroid/widget/RatingBar;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    :goto_1
    if-eqz v6, :cond_3

    .line 170
    .line 171
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->i:Landroid/widget/ImageView;

    .line 172
    .line 173
    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->i:Landroid/widget/ImageView;

    .line 177
    .line 178
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nativead/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->i:Landroid/widget/ImageView;

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    :goto_2
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 192
    .line 193
    if-eqz v0, :cond_4

    .line 194
    .line 195
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 199
    .line 200
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setBodyView(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->d:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 206
    .line 207
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/NativeAdView;->setNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public setStyles(Lp5/a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 2
    .line 3
    iget-object p1, p1, Lp5/a;->q:Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 34
    .line 35
    iget-object p1, p1, Lp5/a;->e:Landroid/graphics/Typeface;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 47
    .line 48
    iget-object p1, p1, Lp5/a;->i:Landroid/graphics/Typeface;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 60
    .line 61
    iget-object p1, p1, Lp5/a;->m:Landroid/graphics/Typeface;

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 73
    .line 74
    iget-object p1, p1, Lp5/a;->a:Landroid/graphics/Typeface;

    .line 75
    .line 76
    if-eqz p1, :cond_6

    .line 77
    .line 78
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 86
    .line 87
    iget-object p1, p1, Lp5/a;->g:Ljava/lang/Integer;

    .line 88
    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 100
    .line 101
    .line 102
    :cond_7
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 103
    .line 104
    iget-object p1, p1, Lp5/a;->k:Ljava/lang/Integer;

    .line 105
    .line 106
    if-eqz p1, :cond_8

    .line 107
    .line 108
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 117
    .line 118
    .line 119
    :cond_8
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 120
    .line 121
    iget-object p1, p1, Lp5/a;->o:Ljava/lang/Integer;

    .line 122
    .line 123
    if-eqz p1, :cond_9

    .line 124
    .line 125
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    .line 135
    .line 136
    :cond_9
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 137
    .line 138
    iget-object p1, p1, Lp5/a;->c:Ljava/lang/Integer;

    .line 139
    .line 140
    if-eqz p1, :cond_a

    .line 141
    .line 142
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 143
    .line 144
    if-eqz v0, :cond_a

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    :cond_a
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 154
    .line 155
    iget p1, p1, Lp5/a;->b:F

    .line 156
    .line 157
    const/4 v0, 0x0

    .line 158
    cmpl-float v1, p1, v0

    .line 159
    .line 160
    if-lez v1, :cond_b

    .line 161
    .line 162
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 163
    .line 164
    if-eqz v1, :cond_b

    .line 165
    .line 166
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 167
    .line 168
    .line 169
    :cond_b
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 170
    .line 171
    iget p1, p1, Lp5/a;->f:F

    .line 172
    .line 173
    cmpl-float v1, p1, v0

    .line 174
    .line 175
    if-lez v1, :cond_c

    .line 176
    .line 177
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 178
    .line 179
    if-eqz v1, :cond_c

    .line 180
    .line 181
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 182
    .line 183
    .line 184
    :cond_c
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 185
    .line 186
    iget p1, p1, Lp5/a;->j:F

    .line 187
    .line 188
    cmpl-float v1, p1, v0

    .line 189
    .line 190
    if-lez v1, :cond_d

    .line 191
    .line 192
    iget-object v1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 193
    .line 194
    if-eqz v1, :cond_d

    .line 195
    .line 196
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 197
    .line 198
    .line 199
    :cond_d
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 200
    .line 201
    iget p1, p1, Lp5/a;->n:F

    .line 202
    .line 203
    cmpl-float v0, p1, v0

    .line 204
    .line 205
    if-lez v0, :cond_e

    .line 206
    .line 207
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 212
    .line 213
    .line 214
    :cond_e
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 215
    .line 216
    iget-object p1, p1, Lp5/a;->d:Landroid/graphics/drawable/ColorDrawable;

    .line 217
    .line 218
    if-eqz p1, :cond_f

    .line 219
    .line 220
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->k:Landroid/widget/Button;

    .line 221
    .line 222
    if-eqz v0, :cond_f

    .line 223
    .line 224
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 225
    .line 226
    .line 227
    :cond_f
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 228
    .line 229
    iget-object p1, p1, Lp5/a;->h:Landroid/graphics/drawable/ColorDrawable;

    .line 230
    .line 231
    if-eqz p1, :cond_10

    .line 232
    .line 233
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->e:Landroid/widget/TextView;

    .line 234
    .line 235
    if-eqz v0, :cond_10

    .line 236
    .line 237
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 238
    .line 239
    .line 240
    :cond_10
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 241
    .line 242
    iget-object p1, p1, Lp5/a;->l:Landroid/graphics/drawable/ColorDrawable;

    .line 243
    .line 244
    if-eqz p1, :cond_11

    .line 245
    .line 246
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->f:Landroid/widget/TextView;

    .line 247
    .line 248
    if-eqz v0, :cond_11

    .line 249
    .line 250
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 251
    .line 252
    .line 253
    :cond_11
    iget-object p1, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->b:Lp5/a;

    .line 254
    .line 255
    iget-object p1, p1, Lp5/a;->p:Landroid/graphics/drawable/ColorDrawable;

    .line 256
    .line 257
    if-eqz p1, :cond_12

    .line 258
    .line 259
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/TemplateView;->h:Landroid/widget/TextView;

    .line 260
    .line 261
    if-eqz v0, :cond_12

    .line 262
    .line 263
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 264
    .line 265
    .line 266
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 270
    .line 271
    .line 272
    return-void
.end method
