.class Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/moa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private lw:I

.field private moa:I

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

.field final synthetic uef:Landroid/app/Activity;

.field private final yo:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->uef:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->yo:Landroid/graphics/Rect;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->moa:I

    .line 17
    .line 18
    return-void
.end method

.method private uef()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->lw(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->ivm(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;->moa()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 36
    .line 37
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    rem-int v3, v2, v0

    .line 46
    .line 47
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->moa:I

    .line 48
    .line 49
    if-le v3, v4, :cond_6

    .line 50
    .line 51
    move v3, v1

    .line 52
    :goto_0
    if-gt v3, v2, :cond_6

    .line 53
    .line 54
    rem-int v4, v3, v0

    .line 55
    .line 56
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->moa:I

    .line 57
    .line 58
    if-le v4, v5, :cond_5

    .line 59
    .line 60
    if-eq v3, v1, :cond_2

    .line 61
    .line 62
    if-ne v3, v2, :cond_3

    .line 63
    .line 64
    :cond_2
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 65
    .line 66
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->yo:Landroid/graphics/Rect;

    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/graphics/Rect;->setEmpty()V

    .line 79
    .line 80
    .line 81
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->yo:Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-lez v5, :cond_5

    .line 91
    .line 92
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->yo:Landroid/graphics/Rect;

    .line 93
    .line 94
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    int-to-float v6, v6

    .line 99
    const/high16 v7, 0x3f800000    # 1.0f

    .line 100
    .line 101
    mul-float/2addr v6, v7

    .line 102
    int-to-float v5, v5

    .line 103
    div-float/2addr v6, v5

    .line 104
    const/high16 v5, 0x3f000000    # 0.5f

    .line 105
    .line 106
    cmpg-float v5, v6, v5

    .line 107
    .line 108
    if-ltz v5, :cond_5

    .line 109
    .line 110
    :cond_3
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 111
    .line 112
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->moa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/RecyclerView;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5, v3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/m0;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    instance-of v6, v5, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 121
    .line 122
    if-eqz v6, :cond_4

    .line 123
    .line 124
    check-cast v5, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 125
    .line 126
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    if-eqz v6, :cond_4

    .line 131
    .line 132
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->hg()V

    .line 137
    .line 138
    .line 139
    :cond_4
    iget v5, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->moa:I

    .line 140
    .line 141
    if-le v4, v5, :cond_5

    .line 142
    .line 143
    iput v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->moa:I

    .line 144
    .line 145
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->uef:Landroid/app/Activity;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-gez p1, :cond_1

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_1
    if-nez p2, :cond_5

    .line 48
    .line 49
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->cq(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eq p1, v1, :cond_5

    .line 56
    .line 57
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 58
    .line 59
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->dz(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x1

    .line 64
    const/4 v3, 0x0

    .line 65
    if-ne p1, v1, :cond_2

    .line 66
    .line 67
    move v1, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move v1, v3

    .line 70
    :goto_0
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 71
    .line 72
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->wk(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v2, v3

    .line 82
    :goto_1
    invoke-static {v4, p1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;IZ)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->wk(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 96
    .line 97
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->ab(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 104
    .line 105
    invoke-static {p1, v3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->yo(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Z)Z

    .line 106
    .line 107
    .line 108
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 109
    .line 110
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->bs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$ivm;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 117
    .line 118
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->bs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$ivm;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$ivm;->moa()V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-static {p1, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Lcom/bytedance/sdk/openadsdk/activity/single/moa$ivm;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$ivm;

    .line 129
    .line 130
    .line 131
    :cond_5
    if-nez p2, :cond_6

    .line 132
    .line 133
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 134
    .line 135
    const/4 p2, -0x1

    .line 136
    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;I)I

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 140
    .line 141
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->bcc(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 148
    .line 149
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->cz(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-lez p1, :cond_7

    .line 154
    .line 155
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 156
    .line 157
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->ivm(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;->uef()I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 166
    .line 167
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->cz(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    sub-int/2addr p1, p2

    .line 172
    if-lt v0, p1, :cond_7

    .line 173
    .line 174
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 175
    .line 176
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->zjm(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    :goto_2
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_3

    .line 5
    .line 6
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->uef:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->uef()V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 20
    .line 21
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->xs(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-lez p3, :cond_1

    .line 30
    .line 31
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 32
    .line 33
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->bcc(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 40
    .line 41
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->cz(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-lez p3, :cond_1

    .line 46
    .line 47
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 48
    .line 49
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->ivm(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;->uef()I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->cz(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    sub-int/2addr p3, v0

    .line 64
    if-lt p2, p3, :cond_1

    .line 65
    .line 66
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 67
    .line 68
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->zjm(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->lw:I

    .line 72
    .line 73
    if-eq p3, p2, :cond_3

    .line 74
    .line 75
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->lw:I

    .line 76
    .line 77
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 78
    .line 79
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->dj(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Ljava/util/HashSet;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Ljava/util/HashSet;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    const/4 v0, 0x1

    .line 88
    if-nez p3, :cond_2

    .line 89
    .line 90
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 91
    .line 92
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->dj(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Ljava/util/HashSet;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-eqz p3, :cond_2

    .line 105
    .line 106
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 107
    .line 108
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->dj(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Ljava/util/HashSet;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p3, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/m0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    instance-of p2, p1, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 124
    .line 125
    if-eqz p2, :cond_3

    .line 126
    .line 127
    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 128
    .line 129
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->lw(Z)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->ue()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 145
    .line 146
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->wrv(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    if-eqz p3, :cond_3

    .line 151
    .line 152
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$14;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-static {p3, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Z)Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/m0;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    instance-of p2, p1, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 163
    .line 164
    if-eqz p2, :cond_3

    .line 165
    .line 166
    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;

    .line 167
    .line 168
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    instance-of p2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 173
    .line 174
    if-eqz p2, :cond_3

    .line 175
    .line 176
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->lw(Z)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->gr()V

    .line 188
    .line 189
    .line 190
    :cond_3
    :goto_0
    return-void
.end method
