.class public final Lcom/moloco/sdk/internal/publisher/V;
.super Lcom/moloco/sdk/publisher/Banner;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/internal/publisher/b0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/moloco/sdk/internal/services/u;

.field public final c:Lcom/moloco/sdk/internal/services/events/c;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

.field public final g:Lcom/moloco/sdk/internal/publisher/E;

.field public final h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

.field public final i:LW1/r;

.field public final j:Lcom/moloco/sdk/internal/b;

.field public final k:Lcom/moloco/sdk/internal/m;

.field public final l:Lcom/moloco/sdk/internal/services/B;

.field public final m:Lcom/moloco/sdk/acm/recorder/c;

.field public final n:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;

.field public final o:Lcom/moloco/sdk/publisher/AdFormatType;

.field public p:Z

.field public final q:Lcom/moloco/sdk/acm/l;

.field public r:Lcom/moloco/sdk/acm/l;

.field public final s:LKd/a;

.field public final t:LR0/e;

.field public final u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

.field public v:LY2/B;

.field public w:Lcom/moloco/sdk/publisher/BannerAdShowListener;

.field public final x:Lcom/moloco/sdk/internal/publisher/B;

.field public final y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Ljava/lang/String;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LW1/r;Lcom/moloco/sdk/internal/b;Lcom/moloco/sdk/internal/m;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;Lcom/moloco/sdk/publisher/AdFormatType;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p4

    .line 4
    .line 5
    move-object/from16 v9, p12

    .line 6
    .line 7
    move-object/from16 v10, p14

    .line 8
    .line 9
    const/4 v11, 0x0

    .line 10
    sget-object v0, Lcom/moloco/sdk/internal/publisher/E;->a:Lcom/moloco/sdk/internal/publisher/E;

    .line 11
    .line 12
    sget-object v12, Lcom/moloco/sdk/internal/publisher/F;->a:Lcom/moloco/sdk/internal/publisher/F;

    .line 13
    .line 14
    const-string v1, "adUnitId"

    .line 15
    .line 16
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "adFormatType"

    .line 20
    .line 21
    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct/range {p0 .. p1}, Lcom/moloco/sdk/publisher/Banner;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    iput-object v1, v2, Lcom/moloco/sdk/internal/publisher/V;->a:Landroid/content/Context;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    iput-object v1, v2, Lcom/moloco/sdk/internal/publisher/V;->b:Lcom/moloco/sdk/internal/services/u;

    .line 34
    .line 35
    move-object/from16 v1, p3

    .line 36
    .line 37
    iput-object v1, v2, Lcom/moloco/sdk/internal/publisher/V;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 38
    .line 39
    iput-object v8, v2, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 40
    .line 41
    move/from16 v1, p5

    .line 42
    .line 43
    iput-boolean v1, v2, Lcom/moloco/sdk/internal/publisher/V;->e:Z

    .line 44
    .line 45
    move-object/from16 v1, p6

    .line 46
    .line 47
    iput-object v1, v2, Lcom/moloco/sdk/internal/publisher/V;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 48
    .line 49
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->g:Lcom/moloco/sdk/internal/publisher/E;

    .line 50
    .line 51
    move-object/from16 v0, p7

    .line 52
    .line 53
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 54
    .line 55
    move-object/from16 v0, p8

    .line 56
    .line 57
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->i:LW1/r;

    .line 58
    .line 59
    move-object/from16 v0, p9

    .line 60
    .line 61
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->j:Lcom/moloco/sdk/internal/b;

    .line 62
    .line 63
    move-object/from16 v0, p10

    .line 64
    .line 65
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->k:Lcom/moloco/sdk/internal/m;

    .line 66
    .line 67
    move-object/from16 v0, p11

    .line 68
    .line 69
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->l:Lcom/moloco/sdk/internal/services/B;

    .line 70
    .line 71
    iput-object v9, v2, Lcom/moloco/sdk/internal/publisher/V;->m:Lcom/moloco/sdk/acm/recorder/c;

    .line 72
    .line 73
    move-object/from16 v0, p13

    .line 74
    .line 75
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->n:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;

    .line 76
    .line 77
    iput-object v10, v2, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 78
    .line 79
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 80
    .line 81
    const-string v0, "ad_create_to_load_ms"

    .line 82
    .line 83
    invoke-virtual {v9, v0}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v3, "toLowerCase(...)"

    .line 100
    .line 101
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v3, "ad_type"

    .line 105
    .line 106
    invoke-virtual {v0, v3, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->q:Lcom/moloco/sdk/acm/l;

    .line 110
    .line 111
    sget-object v0, LEf/S;->a:LLf/e;

    .line 112
    .line 113
    sget-object v0, LJf/n;->a:LFf/e;

    .line 114
    .line 115
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    iput-object v13, v2, Lcom/moloco/sdk/internal/publisher/V;->s:LKd/a;

    .line 120
    .line 121
    new-instance v0, LR0/e;

    .line 122
    .line 123
    const/4 v1, 0x3

    .line 124
    invoke-direct {v0, v1}, LR0/e;-><init>(I)V

    .line 125
    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    iput-object v1, v0, LR0/e;->d:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v1, v0, LR0/e;->e:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v1, v0, LR0/e;->f:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v1, v0, LR0/e;->g:Ljava/lang/Object;

    .line 135
    .line 136
    iput-boolean v11, v0, LR0/e;->b:Z

    .line 137
    .line 138
    iput-object v1, v0, LR0/e;->h:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v1, v0, LR0/e;->i:Ljava/lang/Object;

    .line 141
    .line 142
    iput-boolean v11, v0, LR0/e;->c:Z

    .line 143
    .line 144
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 145
    .line 146
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 147
    .line 148
    invoke-direct {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v0, v2, Lcom/moloco/sdk/internal/publisher/V;->u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 152
    .line 153
    new-instance v14, Lcom/moloco/sdk/internal/publisher/I;

    .line 154
    .line 155
    invoke-direct {v14, v2, v11}, Lcom/moloco/sdk/internal/publisher/I;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 156
    .line 157
    .line 158
    new-instance v3, LEf/p0;

    .line 159
    .line 160
    move-object v0, v3

    .line 161
    const-class v3, Lcom/moloco/sdk/internal/publisher/V;

    .line 162
    .line 163
    const-string v4, "recreateXenossAd"

    .line 164
    .line 165
    const/4 v1, 0x1

    .line 166
    const-string v5, "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;"

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    const/4 v7, 0x1

    .line 170
    invoke-direct/range {v0 .. v7}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 171
    .line 172
    .line 173
    move-object v15, v2

    .line 174
    sget-object v1, Lcom/moloco/sdk/service_locator/a;->a:Lef/p;

    .line 175
    .line 176
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    move-object v5, v1

    .line 181
    check-cast v5, Lcom/moloco/sdk/internal/services/l;

    .line 182
    .line 183
    new-instance v7, Lcom/moloco/sdk/internal/publisher/J;

    .line 184
    .line 185
    invoke-direct {v7, v15, v11}, Lcom/moloco/sdk/internal/publisher/J;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 186
    .line 187
    .line 188
    move-object v3, v0

    .line 189
    move-object v2, v8

    .line 190
    move-object v6, v9

    .line 191
    move-object v4, v10

    .line 192
    move-object v0, v13

    .line 193
    move-object v1, v14

    .line 194
    invoke-static/range {v0 .. v7}, Lvf/a;->c(LKd/a;Ltf/l;Ljava/lang/String;Ltf/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/internal/services/l;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)Lcom/moloco/sdk/internal/publisher/B;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, v15, Lcom/moloco/sdk/internal/publisher/V;->x:Lcom/moloco/sdk/internal/publisher/B;

    .line 199
    .line 200
    new-instance v0, Lcom/moloco/sdk/internal/publisher/U;

    .line 201
    .line 202
    invoke-direct {v0, v15}, Lcom/moloco/sdk/internal/publisher/U;-><init>(Lcom/moloco/sdk/internal/publisher/V;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Lcom/moloco/sdk/internal/publisher/F;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 210
    .line 211
    iput-object v0, v15, Lcom/moloco/sdk/internal/publisher/V;->y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 212
    .line 213
    return-void
.end method

.method public static final c(Lcom/moloco/sdk/internal/publisher/V;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "RecyclerView"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    const-string v1, "ScrollView"

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    const-string v1, "ListView"

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    const-string v1, "ViewPager"

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    const-string v1, "HorizontalScrollView"

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    const-string v1, "AndroidComposeView"

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    instance-of v0, p0, Landroid/view/View;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    check-cast p0, Landroid/view/View;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object p0, v1

    .line 74
    :goto_1
    if-eqz p0, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move-object p0, v1

    .line 82
    goto :goto_0

    .line 83
    :cond_3
    :goto_2
    return-object v0

    .line 84
    :cond_4
    const-string p0, "none"

    .line 85
    .line 86
    return-object p0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->i:LW1/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LW1/r;->a(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Lcom/moloco/sdk/internal/r;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 2
    .line 3
    iget-object v1, v0, LR0/e;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LEf/H0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v2}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v2, v0, LR0/e;->g:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v1, Lcom/moloco/sdk/publisher/AdFormatType;->MREC:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 18
    .line 19
    if-ne v3, v1, :cond_1

    .line 20
    .line 21
    iget-boolean v4, p0, Lcom/moloco/sdk/internal/publisher/V;->p:Z

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 26
    .line 27
    const-string v7, "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker)."

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const-string v6, "BannerViewImpl"

    .line 31
    .line 32
    const/4 v9, 0x4

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-boolean v4, v0, LR0/e;->b:Z

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 41
    .line 42
    const-string v7, "Banner: isAdShowing state set from isAdShowing function."

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const-string v6, "BannerViewImpl"

    .line 46
    .line 47
    const/4 v9, 0x4

    .line 48
    const/4 v10, 0x0

    .line 49
    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v4, v0, LR0/e;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 55
    .line 56
    iget-boolean v5, p0, Lcom/moloco/sdk/internal/publisher/V;->e:Z

    .line 57
    .line 58
    if-nez v5, :cond_3

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->l()LHf/v0;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/moloco/sdk/publisher/Banner;->isViewShown()LHf/v0;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :goto_1
    invoke-interface {v4}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    :goto_2
    iget-object v5, v0, LR0/e;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 85
    .line 86
    if-eqz v5, :cond_4

    .line 87
    .line 88
    invoke-virtual {v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->destroy()V

    .line 89
    .line 90
    .line 91
    :cond_4
    iput-object v2, v0, LR0/e;->d:Ljava/lang/Object;

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-string v6, "internalError"

    .line 103
    .line 104
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v5, v5, LY2/B;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v5, Lcom/moloco/sdk/internal/publisher/b;

    .line 110
    .line 111
    invoke-virtual {v5, p1}, Lcom/moloco/sdk/internal/publisher/b;->a(Lcom/moloco/sdk/internal/r;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    if-eqz v4, :cond_6

    .line 115
    .line 116
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 117
    .line 118
    if-eqz p1, :cond_6

    .line 119
    .line 120
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 121
    .line 122
    const/4 v5, 0x6

    .line 123
    invoke-static {v4, v2, v2, v5, v2}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {p1, v4}, LY2/B;->s(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    iput-object v2, v0, LR0/e;->e:Ljava/lang/Object;

    .line 131
    .line 132
    if-ne v3, v1, :cond_7

    .line 133
    .line 134
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/V;->p:Z

    .line 135
    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-boolean p1, v0, LR0/e;->b:Z

    .line 140
    .line 141
    :cond_7
    iput-object v2, v0, LR0/e;->f:Ljava/lang/Object;

    .line 142
    .line 143
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->s:LKd/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/moloco/sdk/internal/publisher/V;->b(Lcom/moloco/sdk/internal/r;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lcom/moloco/sdk/internal/publisher/V;->setAdShowListener(Lcom/moloco/sdk/publisher/BannerAdShowListener;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 14
    .line 15
    return-void
.end method

.method public getAdShowListener()Lcom/moloco/sdk/publisher/BannerAdShowListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->w:Lcom/moloco/sdk/publisher/BannerAdShowListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCreateAdObjectDuration-UwyO8pc()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->i:LW1/r;

    .line 2
    .line 3
    iget-wide v0, v0, LW1/r;->b:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->x:Lcom/moloco/sdk/internal/publisher/B;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 4
    .line 5
    return v0
.end method

.method public final load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V
    .locals 2

    .line 1
    const-string v0, "bidResponseJson"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->m:Lcom/moloco/sdk/acm/recorder/c;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/V;->q:Lcom/moloco/sdk/acm/l;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 14
    .line 15
    const-string v1, "load_to_show_time"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->r:Lcom/moloco/sdk/acm/l;

    .line 22
    .line 23
    new-instance v0, Lcom/moloco/sdk/internal/publisher/Q;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, p1, p2, v1}, Lcom/moloco/sdk/internal/publisher/Q;-><init>(Lcom/moloco/sdk/internal/publisher/V;Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;Ljf/c;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iget-object p2, p0, Lcom/moloco/sdk/internal/publisher/V;->s:LKd/a;

    .line 31
    .line 32
    invoke-static {p2, v1, v0, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setAdShowListener(Lcom/moloco/sdk/publisher/BannerAdShowListener;)V
    .locals 9
    .param p1    # Lcom/moloco/sdk/publisher/BannerAdShowListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, LY2/B;

    .line 2
    .line 3
    new-instance v4, Lcom/moloco/sdk/internal/publisher/J;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v4, p0, v1}, Lcom/moloco/sdk/internal/publisher/J;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 7
    .line 8
    .line 9
    new-instance v5, Lcom/moloco/sdk/internal/publisher/J;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v5, p0, v1}, Lcom/moloco/sdk/internal/publisher/J;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 13
    .line 14
    .line 15
    new-instance v8, Lcom/moloco/sdk/internal/publisher/J;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v8, p0, v1}, Lcom/moloco/sdk/internal/publisher/J;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/V;->b:Lcom/moloco/sdk/internal/services/u;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/V;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 24
    .line 25
    iget-object v6, p0, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 26
    .line 27
    iget-object v7, p0, Lcom/moloco/sdk/internal/publisher/V;->m:Lcom/moloco/sdk/acm/recorder/c;

    .line 28
    .line 29
    move-object v1, p1

    .line 30
    invoke-direct/range {v0 .. v8}, LY2/B;-><init>(Lcom/moloco/sdk/publisher/BannerAdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/publisher/J;Lcom/moloco/sdk/internal/publisher/J;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/J;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 34
    .line 35
    iget-object p1, v0, LY2/B;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lcom/moloco/sdk/publisher/BannerAdShowListener;

    .line 38
    .line 39
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/V;->w:Lcom/moloco/sdk/publisher/BannerAdShowListener;

    .line 40
    .line 41
    return-void
.end method

.method public setCreateAdObjectDuration-LRDsOJo(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/V;->i:LW1/r;

    .line 2
    .line 3
    iput-wide p1, v0, LW1/r;->b:J

    .line 4
    .line 5
    return-void
.end method
