.class public Lcom/bytedance/sdk/openadsdk/component/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/component/yo$oa;,
        Lcom/bytedance/sdk/openadsdk/component/yo$uef;
    }
.end annotation


# instance fields
.field private ab:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field protected bcc:Landroid/widget/FrameLayout;

.field private bs:Landroid/widget/ImageView;

.field private cq:Landroid/widget/RelativeLayout;

.field protected cz:Landroid/view/View;

.field private dhk:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field protected dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private dz:Landroid/widget/ImageView;

.field private gr:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

.field private gsd:Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

.field private final gzw:Lcom/bytedance/sdk/openadsdk/component/cz/bcc;

.field protected final ivm:I

.field protected final lw:Lcom/bytedance/sdk/openadsdk/component/uef;

.field protected final moa:Landroid/widget/FrameLayout;

.field protected final oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private orq:F

.field private pz:Landroid/view/View;

.field private rt:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private sy:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

.field private tpx:F

.field private ue:Lcom/bytedance/sdk/openadsdk/core/widget/ab;

.field protected final uef:Landroid/app/Activity;

.field private wk:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

.field protected final wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

.field protected xs:I

.field protected final yo:Z

.field protected zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/uef;IZLcom/bytedance/sdk/openadsdk/component/bcc/uef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/bcc;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/bcc;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gzw:Lcom/bytedance/sdk/openadsdk/component/cz/bcc;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->moa:Landroid/widget/FrameLayout;

    .line 16
    .line 17
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->xs:I

    .line 18
    .line 19
    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->yo:Z

    .line 20
    .line 21
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ivm:I

    .line 28
    .line 29
    iput-object p7, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    .line 30
    .line 31
    return-void
.end method

.method private bcc()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gzw:Lcom/bytedance/sdk/openadsdk/component/cz/bcc;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/bcc;->uef()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ab:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kik()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ku()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->cz()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->yo:Z

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-direct {p0, v2}, Lcom/bytedance/sdk/openadsdk/component/yo;->oa(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->bcc:Landroid/widget/FrameLayout;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(Landroid/widget/FrameLayout;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/uef;->yo()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/uef;->moa()V

    .line 59
    .line 60
    .line 61
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 62
    .line 63
    new-instance v3, Lcom/bytedance/sdk/openadsdk/component/yo$uef;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    .line 66
    .line 67
    invoke-direct {v3, v4, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$uef;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/yo;)V

    .line 68
    .line 69
    .line 70
    const/16 v4, 0x19

    .line 71
    .line 72
    invoke-static {v0, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/component/ivm$yo;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/component/yo;->oa(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm()V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/uef;->yo()V

    .line 88
    .line 89
    .line 90
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->rt:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 91
    .line 92
    const/4 v3, 0x1

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jp()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->rt:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 108
    .line 109
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jp()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    move v0, v3

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->rt:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 129
    .line 130
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 131
    .line 132
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/ivm;->oa()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    move v0, v2

    .line 145
    :goto_3
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gr:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 146
    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 154
    .line 155
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gr:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 160
    .line 161
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 162
    .line 163
    invoke-virtual {v4, v5, v6, v7}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/sy;Landroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ue:Lcom/bytedance/sdk/openadsdk/core/widget/ab;

    .line 167
    .line 168
    if-eqz v4, :cond_7

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 172
    .line 173
    invoke-static {v5, v4, v6}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/widget/TextView;Lcom/bytedance/sdk/openadsdk/core/widget/ab;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 174
    .line 175
    .line 176
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 177
    .line 178
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    if-eqz v4, :cond_6

    .line 183
    .line 184
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 185
    .line 186
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/ivm;->moa()D

    .line 191
    .line 192
    .line 193
    move-result-wide v4

    .line 194
    const-wide/16 v6, 0x0

    .line 195
    .line 196
    cmpg-double v4, v4, v6

    .line 197
    .line 198
    if-gez v4, :cond_8

    .line 199
    .line 200
    :cond_6
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ue:Lcom/bytedance/sdk/openadsdk/core/widget/ab;

    .line 201
    .line 202
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    move v3, v0

    .line 206
    :cond_8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->pz:Landroid/view/View;

    .line 207
    .line 208
    if-eqz v0, :cond_a

    .line 209
    .line 210
    if-eqz v3, :cond_9

    .line 211
    .line 212
    move v1, v2

    .line 213
    :cond_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    :cond_a
    return-void
.end method

.method private cz()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/ivm;->oa()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/ivm;->oa()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jp()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jp()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dhk:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dhk:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dhk:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_5

    .line 136
    .line 137
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->oa()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->yo()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    .line 172
    .line 173
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 174
    .line 175
    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->uef(Ljava/lang/String;IILandroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 176
    .line 177
    .line 178
    :cond_5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    .line 179
    .line 180
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/uef;->yo()V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method private oa(I)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->bcc:Landroid/widget/FrameLayout;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/yo;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/yo;->uef(Ljava/lang/Object;)V

    return-void
.end method

.method private uef(Ljava/lang/Object;)V
    .locals 2

    .line 44
    :try_start_0
    instance-of v0, p1, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 46
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->bs:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    const/4 p1, 0x2

    .line 47
    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "open_ad"

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const-string v0, "bindBackGroundImage error"

    const/4 v1, 0x1

    aput-object v0, p1, v1

    const-string v0, "AppOpenAdNativeManager"

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private zjm()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/model/sy;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->xs()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/bytedance/sdk/component/utils/lw;->uef(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->xs()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->oa(Ljava/lang/String;)Ljava/io/File;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lcom/bytedance/sdk/openadsdk/dhk/uef;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->xs()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-direct {v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/dhk/uef;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->oa()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->yo()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    new-instance v5, Lcom/bytedance/sdk/openadsdk/component/yo$oa;

    .line 63
    .line 64
    invoke-direct {v5, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$oa;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    const/16 v7, 0x19

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/utils/sy;->uef(Lcom/bytedance/sdk/openadsdk/dhk/uef;IILcom/bytedance/sdk/openadsdk/utils/sy$uef;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public ivm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->cz:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/yo$4;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 19
    .line 20
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/yo$5;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$5;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method public lw()V
    .locals 0

    return-void
.end method

.method public moa()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public oa()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tv()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->bcc()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/uef;->yo()V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/TTAppOpenAdTransActivity;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const-string v2, "#1E1E1E"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public uef(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public uef()V
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wk:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/yo$2;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/yo;->ivm()V

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tv()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wrv:Lcom/bytedance/sdk/openadsdk/component/bcc/uef;

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;)Lcom/bytedance/sdk/openadsdk/component/uef/uef;

    move-result-object v0

    .line 35
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/yo$3;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gsd:Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/uef$uef;)V

    .line 37
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zou()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 38
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->cq:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->cq:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 40
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ab:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ab:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public uef(FF)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->orq:F

    .line 64
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->tpx:F

    return-void
.end method

.method public uef(I)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public uef(IZ)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    if-eqz p2, :cond_2

    .line 66
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 p2, 0x8

    if-eq p1, p2, :cond_1

    .line 67
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 68
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_3

    .line 69
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 70
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "s"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_3

    .line 73
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public uef(Landroid/view/ViewGroup;)V
    .locals 9

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/moa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/cz/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 4
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nkh()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_1

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/cz/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :cond_0
    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/cz/lw;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    goto :goto_0

    .line 7
    :goto_1
    iput-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->cq:Landroid/widget/RelativeLayout;

    .line 8
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 9
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getBackImage()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->bs:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getVideoContainer()Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->bcc:Landroid/widget/FrameLayout;

    .line 11
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getImageView()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    .line 12
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getClickButton()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ab:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 13
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getAdLogo()Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->wk:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    .line 14
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getAdTitleTextView()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->rt:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 15
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getAdIconView()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gr:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 16
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getScoreBar()Lcom/bytedance/sdk/openadsdk/core/widget/ab;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->ue:Lcom/bytedance/sdk/openadsdk/core/widget/ab;

    .line 17
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getOverlayLayout()Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->pz:Landroid/view/View;

    .line 18
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ku()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 19
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getIconOnlyView()Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    .line 20
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getTitle()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oib:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 21
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getContent()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dhk:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 22
    :cond_2
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getDspAdChoice()Lcom/bytedance/sdk/openadsdk/core/widget/yo;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 23
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getDspAdChoice()Lcom/bytedance/sdk/openadsdk/core/widget/yo;

    move-result-object p1

    const/16 v0, 0xe

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/yo;->uef(ILcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 24
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tv()Z

    move-result p1

    if-nez p1, :cond_4

    .line 25
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gzw:Lcom/bytedance/sdk/openadsdk/component/cz/bcc;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget v6, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->orq:F

    iget v7, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->tpx:F

    iget-boolean v8, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->yo:Z

    invoke-virtual/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/component/cz/bcc;->uef(Lcom/bytedance/sdk/openadsdk/component/cz/yo;Lcom/bytedance/sdk/openadsdk/core/model/gzw;FFZ)V

    .line 26
    :cond_4
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getTopDisLike()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->cz:Landroid/view/View;

    .line 27
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getTopSkip()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 28
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->getTopCountDown()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 29
    instance-of p1, v4, Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    if-eqz p1, :cond_5

    .line 30
    check-cast v4, Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/yo$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/component/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/yo;)V

    invoke-virtual {v4, p1}, Lcom/bytedance/sdk/openadsdk/component/cz/lw;->setRenderListener(Lcom/bytedance/sdk/openadsdk/component/cz/lw$uef;)V

    :cond_5
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;)V
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;->oa()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 50
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;->oa()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 51
    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;->moa()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 52
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 53
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_2

    .line 54
    invoke-static {v0}, LA0/j;->x(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 55
    invoke-static {v0}, LA0/j;->j(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/AnimatedImageDrawable;

    move-result-object p1

    invoke-static {p1}, LA0/j;->A(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    .line 56
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 58
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/model/sy;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->oa()I

    move-result v0

    .line 59
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/dhk/uef/oa;->yo()[B

    move-result-object p1

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/sy;->uef([BI)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 60
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->dz:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public uef(Landroid/widget/FrameLayout;)Z
    .locals 3

    .line 42
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->uef:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/bcc/yo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gsd:Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

    .line 43
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->lw:Lcom/bytedance/sdk/openadsdk/component/uef;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/bcc/yo;->uef(Landroid/widget/FrameLayout;Lcom/bytedance/sdk/openadsdk/component/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    return p1
.end method

.method public xs()Lcom/bytedance/sdk/openadsdk/component/bcc/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gsd:Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/yo;->gsd:Lcom/bytedance/sdk/openadsdk/component/bcc/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/bcc/yo;->wrv()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
