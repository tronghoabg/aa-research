.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Z

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

.field public final d:Lcom/moloco/sdk/acm/recorder/c;

.field public final e:LKd/a;

.field public final f:LHf/x0;

.field public final g:LHf/x0;

.field public final h:LHf/x0;

.field public final i:LHf/x0;

.field public final j:LHf/x0;

.field public final k:LHf/x0;

.field public final l:Ls6/C;

.field public m:Ljava/lang/String;

.field public n:Z

.field public final o:Landroid/os/Looper;

.field public p:LE5/I;

.field public q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;

.field public r:Z

.field public final s:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;

.field public final t:Lba/a;

.field public u:J

.field public v:LEf/H0;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Landroidx/lifecycle/o;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v8, p4

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "context"

    .line 11
    .line 12
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v4, "mediaCacheRepository"

    .line 16
    .line 17
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v4, "lifecycle"

    .line 21
    .line 22
    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->a:Landroid/content/Context;

    .line 29
    .line 30
    move/from16 v4, p2

    .line 31
    .line 32
    iput-boolean v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->b:Z

    .line 33
    .line 34
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 35
    .line 36
    move-object/from16 v1, p5

    .line 37
    .line 38
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 39
    .line 40
    sget-object v1, LEf/S;->a:LLf/e;

    .line 41
    .line 42
    sget-object v1, LJf/n;->a:LFf/e;

    .line 43
    .line 44
    invoke-static {v1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->e:LKd/a;

    .line 49
    .line 50
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;

    .line 51
    .line 52
    invoke-static {v1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->f:LHf/x0;

    .line 57
    .line 58
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->g:LHf/x0;

    .line 59
    .line 60
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-direct {v1, v3, v4, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;-><init>(ZZZ)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->h:LHf/x0;

    .line 71
    .line 72
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->i:LHf/x0;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-static {v1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->j:LHf/x0;

    .line 80
    .line 81
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->k:LHf/x0;

    .line 82
    .line 83
    :try_start_0
    new-instance v4, Ls6/C;

    .line 84
    .line 85
    invoke-direct {v4, v0}, Ls6/C;-><init>(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v3}, Ls6/C;->setUseController(Z)V
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .line 93
    move-object v12, v0

    .line 94
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 95
    .line 96
    const-string v11, "ExoPlayerView could not be instantiated."

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const-string v10, "SimplifiedExoPlayer"

    .line 100
    .line 101
    const/16 v14, 0x8

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    invoke-static/range {v9 .. v15}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->j:LHf/x0;

    .line 108
    .line 109
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1, v4}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-object v4, v1

    .line 118
    :goto_0
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->l:Ls6/C;

    .line 119
    .line 120
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->o:Landroid/os/Looper;

    .line 125
    .line 126
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->i:LHf/x0;

    .line 127
    .line 128
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/e;

    .line 129
    .line 130
    invoke-direct {v4, v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;Ljf/c;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, LHf/Z;

    .line 134
    .line 135
    invoke-direct {v1, v0, v4, v3}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->e:LKd/a;

    .line 139
    .line 140
    invoke-static {v1, v0}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 141
    .line 142
    .line 143
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;

    .line 144
    .line 145
    invoke-direct {v0, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->s:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;

    .line 149
    .line 150
    new-instance v9, Lba/a;

    .line 151
    .line 152
    new-instance v0, LS8/d;

    .line 153
    .line 154
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 155
    .line 156
    const-string v4, "initOrResumeExoPlayer"

    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    const-string v5, "initOrResumeExoPlayer()V"

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    const/16 v7, 0x15

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 165
    .line 166
    .line 167
    move-object v10, v0

    .line 168
    new-instance v0, LS8/d;

    .line 169
    .line 170
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 171
    .line 172
    const-string v4, "disposeExoPlayer"

    .line 173
    .line 174
    const/4 v1, 0x0

    .line 175
    const-string v5, "disposeExoPlayer()V"

    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    const/16 v7, 0x16

    .line 179
    .line 180
    move-object/from16 v2, p0

    .line 181
    .line 182
    invoke-direct/range {v0 .. v7}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v9, v8, v10, v0}, Lba/a;-><init>(Landroidx/lifecycle/o;LS8/d;LS8/d;)V

    .line 186
    .line 187
    .line 188
    iput-object v9, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->t:Lba/a;

    .line 189
    .line 190
    return-void
.end method

.method public static b(LE5/I;Z)V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p1, v0

    .line 9
    :goto_0
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lu6/v;->g(FFF)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget v0, p0, LE5/I;->b0:F

    .line 17
    .line 18
    cmpl-float v0, v0, p1

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iput p1, p0, LE5/I;->b0:F

    .line 24
    .line 25
    iget-object v0, p0, LE5/I;->A:LE5/e;

    .line 26
    .line 27
    iget v0, v0, LE5/e;->e:F

    .line 28
    .line 29
    mul-float/2addr v0, p1

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x1

    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-virtual {p0, v1, v2, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, LE5/t;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, p1, v1}, LE5/t;-><init>(FI)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, LE5/I;->l:LK8/H;

    .line 46
    .line 47
    const/16 p1, 0x16

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, LK8/H;->p(ILu6/g;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(LE5/I;Ljava/lang/String;)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const-string v1, "SimplifiedExoPlayer"

    .line 8
    .line 9
    const-string v2, "URI Source is empty"

    .line 10
    .line 11
    const/16 v5, 0xc

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->b:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 23
    .line 24
    const-string v2, "SimplifiedExoPlayer"

    .line 25
    .line 26
    const-string v3, "Streaming is enabled"

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/16 v6, 0xc

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lf6/m;

    .line 37
    .line 38
    new-instance v1, Laa/f;

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    invoke-direct {v1, v2, p2, p0}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, LJ5/i;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2}, Lf6/m;-><init>(Lt6/k;LJ5/i;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, LE5/d0;->a(Ljava/lang/String;)LE5/d0;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {v0, p2}, Lf6/m;->a(LE5/d0;)Lf6/a;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 62
    .line 63
    .line 64
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, LE5/I;->G0(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :goto_0
    move-object v3, p1

    .line 76
    goto :goto_3

    .line 77
    :catch_0
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 81
    .line 82
    const-string v1, "SimplifiedExoPlayer"

    .line 83
    .line 84
    const-string v2, "Streaming is disabled"

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    const/16 v5, 0xc

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p2}, LE5/d0;->a(Ljava/lang/String;)LE5/d0;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {p2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1}, LE5/I;->Q0()V

    .line 106
    .line 107
    .line 108
    new-instance v0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    :goto_1
    iget v2, p2, Ll8/e0;->d:I

    .line 115
    .line 116
    if-ge v1, v2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p2, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, LE5/d0;

    .line 123
    .line 124
    iget-object v3, p1, LE5/I;->q:Lf6/y;

    .line 125
    .line 126
    invoke-interface {v3, v2}, Lf6/y;->a(LE5/d0;)Lf6/a;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    invoke-virtual {p1, v0}, LE5/I;->G0(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    invoke-virtual {p1}, LE5/I;->B0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :goto_3
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 144
    .line 145
    const-string v2, "ExoPlayer setMediaItem exception"

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    const-string v1, "SimplifiedExoPlayer"

    .line 149
    .line 150
    const/16 v5, 0x8

    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;

    .line 157
    .line 158
    iget-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->j:LHf/x0;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    invoke-virtual {p2, v0, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final c()V
    .locals 14

    .line 1
    const/4 v1, 0x4

    .line 2
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 3
    .line 4
    const-string v3, "SimplifiedExoPlayer"

    .line 5
    .line 6
    const-string v4, "Disposing exo player"

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/16 v7, 0xc

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->l:Ls6/C;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v3, v0, Ls6/C;->d:Landroid/view/View;

    .line 22
    .line 23
    instance-of v4, v3, Landroid/opengl/GLSurfaceView;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    check-cast v3, Landroid/opengl/GLSurfaceView;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/opengl/GLSurfaceView;->onPause()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0, v2}, Ls6/C;->setPlayer(LE5/w0;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, LE5/I;->r0()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-wide v5, v3

    .line 47
    :goto_0
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, LE5/I;->m0()J

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move-wide v7, v3

    .line 57
    :goto_1
    sub-long/2addr v5, v7

    .line 58
    cmp-long v0, v5, v3

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x1

    .line 62
    if-lez v0, :cond_4

    .line 63
    .line 64
    move v7, v6

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    move v7, v5

    .line 67
    :goto_2
    iget-object v8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 68
    .line 69
    if-eqz v8, :cond_d

    .line 70
    .line 71
    invoke-virtual {v8}, LE5/I;->m0()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iput-wide v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->u:J

    .line 76
    .line 77
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->s:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;

    .line 78
    .line 79
    invoke-virtual {v8, v0}, LE5/I;->C0(LE5/u0;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "ExoPlayerImpl"

    .line 83
    .line 84
    new-instance v9, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v10, "Release "

    .line 87
    .line 88
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v10, " [ExoPlayerLib/2.18.2] ["

    .line 103
    .line 104
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    sget-object v10, Lu6/v;->e:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v10, "] ["

    .line 113
    .line 114
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    sget-object v10, LE5/P;->a:Ljava/util/HashSet;

    .line 118
    .line 119
    const-class v10, LE5/P;

    .line 120
    .line 121
    monitor-enter v10

    .line 122
    :try_start_0
    sget-object v11, LE5/P;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    monitor-exit v10

    .line 125
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v10, "]"

    .line 129
    .line 130
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    invoke-static {v0, v9}, Lu6/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, LE5/I;->Q0()V

    .line 141
    .line 142
    .line 143
    sget v0, Lu6/v;->a:I

    .line 144
    .line 145
    const/16 v9, 0x15

    .line 146
    .line 147
    if-ge v0, v9, :cond_5

    .line 148
    .line 149
    iget-object v0, v8, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 154
    .line 155
    .line 156
    iput-object v2, v8, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 157
    .line 158
    :cond_5
    iget-object v0, v8, LE5/I;->z:LE5/b;

    .line 159
    .line 160
    invoke-virtual {v0}, LE5/b;->l()V

    .line 161
    .line 162
    .line 163
    iget-object v9, v8, LE5/I;->B:LE5/E0;

    .line 164
    .line 165
    iget-object v0, v9, LE5/E0;->e:LA7/V1;

    .line 166
    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    :try_start_1
    iget-object v10, v9, LE5/E0;->a:Landroid/content/Context;

    .line 170
    .line 171
    invoke-virtual {v10, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :catch_0
    move-exception v0

    .line 176
    const-string v10, "StreamVolumeManager"

    .line 177
    .line 178
    const-string v11, "Error unregistering stream volume receiver"

    .line 179
    .line 180
    invoke-static {v0, v10, v11}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :goto_3
    iput-object v2, v9, LE5/E0;->e:LA7/V1;

    .line 184
    .line 185
    :cond_6
    iget-object v0, v8, LE5/I;->C:Lx9/d;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-object v0, v8, LE5/I;->D:Lya/b;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget-object v0, v8, LE5/I;->A:LE5/e;

    .line 196
    .line 197
    iput-object v2, v0, LE5/e;->c:LE5/F;

    .line 198
    .line 199
    invoke-virtual {v0}, LE5/e;->a()V

    .line 200
    .line 201
    .line 202
    iget-object v0, v8, LE5/I;->k:LE5/O;

    .line 203
    .line 204
    invoke-virtual {v0}, LE5/O;->x()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_7

    .line 209
    .line 210
    iget-object v0, v8, LE5/I;->l:LK8/H;

    .line 211
    .line 212
    new-instance v9, LA5/f;

    .line 213
    .line 214
    invoke-direct {v9, v1}, LA5/f;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const/16 v10, 0xa

    .line 218
    .line 219
    invoke-virtual {v0, v10, v9}, LK8/H;->p(ILu6/g;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    iget-object v0, v8, LE5/I;->l:LK8/H;

    .line 223
    .line 224
    iget-object v9, v0, LK8/H;->e:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 227
    .line 228
    invoke-virtual {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    :cond_8
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    if-eqz v11, :cond_9

    .line 237
    .line 238
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    check-cast v11, Lu6/i;

    .line 243
    .line 244
    iput-boolean v6, v11, Lu6/i;->d:Z

    .line 245
    .line 246
    iget-boolean v12, v11, Lu6/i;->c:Z

    .line 247
    .line 248
    if-eqz v12, :cond_8

    .line 249
    .line 250
    iput-boolean v5, v11, Lu6/i;->c:Z

    .line 251
    .line 252
    iget-object v12, v11, Lu6/i;->b:LN1/k;

    .line 253
    .line 254
    invoke-virtual {v12}, LN1/k;->c()Lu6/e;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    iget-object v11, v11, Lu6/i;->a:Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v13, v0, LK8/H;->d:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v13, Lu6/h;

    .line 263
    .line 264
    invoke-interface {v13, v11, v12}, Lu6/h;->a(Ljava/lang/Object;Lu6/e;)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_9
    invoke-virtual {v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 269
    .line 270
    .line 271
    iput-boolean v6, v0, LK8/H;->a:Z

    .line 272
    .line 273
    iget-object v0, v8, LE5/I;->i:Lu6/s;

    .line 274
    .line 275
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 276
    .line 277
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, v8, LE5/I;->t:Lt6/e;

    .line 281
    .line 282
    iget-object v9, v8, LE5/I;->r:LF5/f;

    .line 283
    .line 284
    check-cast v0, Lt6/p;

    .line 285
    .line 286
    iget-object v0, v0, Lt6/p;->b:La2/c;

    .line 287
    .line 288
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 291
    .line 292
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    :cond_a
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    if-eqz v11, :cond_b

    .line 301
    .line 302
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    check-cast v11, Lt6/d;

    .line 307
    .line 308
    iget-object v12, v11, Lt6/d;->b:LF5/f;

    .line 309
    .line 310
    if-ne v12, v9, :cond_a

    .line 311
    .line 312
    iput-boolean v6, v11, Lt6/d;->c:Z

    .line 313
    .line 314
    invoke-virtual {v0, v11}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_b
    iget-object v0, v8, LE5/I;->j0:LE5/q0;

    .line 319
    .line 320
    invoke-virtual {v0, v6}, LE5/q0;->f(I)LE5/q0;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iput-object v0, v8, LE5/I;->j0:LE5/q0;

    .line 325
    .line 326
    iget-object v6, v0, LE5/q0;->b:Lf6/z;

    .line 327
    .line 328
    invoke-virtual {v0, v6}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    iput-object v0, v8, LE5/I;->j0:LE5/q0;

    .line 333
    .line 334
    iget-wide v9, v0, LE5/q0;->r:J

    .line 335
    .line 336
    iput-wide v9, v0, LE5/q0;->p:J

    .line 337
    .line 338
    iget-object v0, v8, LE5/I;->j0:LE5/q0;

    .line 339
    .line 340
    iput-wide v3, v0, LE5/q0;->q:J

    .line 341
    .line 342
    iget-object v0, v8, LE5/I;->r:LF5/f;

    .line 343
    .line 344
    iget-object v3, v0, LF5/f;->h:Lu6/s;

    .line 345
    .line 346
    invoke-static {v3}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    new-instance v4, LC8/g;

    .line 350
    .line 351
    invoke-direct {v4, v0, v1}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 352
    .line 353
    .line 354
    iget-object v0, v3, Lu6/s;->a:Landroid/os/Handler;

    .line 355
    .line 356
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 357
    .line 358
    .line 359
    iget-object v0, v8, LE5/I;->h:Lr6/o;

    .line 360
    .line 361
    invoke-virtual {v0}, Lr6/o;->a()V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v8}, LE5/I;->D0()V

    .line 365
    .line 366
    .line 367
    iget-object v0, v8, LE5/I;->S:Landroid/view/Surface;

    .line 368
    .line 369
    if-eqz v0, :cond_c

    .line 370
    .line 371
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 372
    .line 373
    .line 374
    iput-object v2, v8, LE5/I;->S:Landroid/view/Surface;

    .line 375
    .line 376
    :cond_c
    sget-object v0, Lh6/c;->b:Lh6/c;

    .line 377
    .line 378
    iput-object v0, v8, LE5/I;->d0:Lh6/c;

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :catchall_0
    move-exception v0

    .line 382
    :try_start_2
    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 383
    throw v0

    .line 384
    :cond_d
    :goto_6
    iput-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 385
    .line 386
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->h:LHf/x0;

    .line 387
    .line 388
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;

    .line 389
    .line 390
    invoke-direct {v1, v5, v5, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;-><init>(ZZZ)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, v2, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    return-void
.end method

.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->e:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->t:Lba/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lba/a;->destroy()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->c()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
