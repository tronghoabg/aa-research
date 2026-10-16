.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/u0;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic B()V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic E(LE5/d0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic F(Lh6/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic G(LE5/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic I(LE5/f0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(I)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x4

    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    if-eq p1, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v0, "ENDED"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v0, "READY"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const-string v0, "BUFFERING"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    const-string v0, "IDLE"

    .line 28
    .line 29
    :goto_0
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 30
    .line 31
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "onPlaybackStateChanged: "

    .line 39
    .line 40
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, " pos="

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0}, LE5/I;->m0()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    move-object v0, v10

    .line 66
    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v0, " dur="

    .line 70
    .line 71
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0}, LE5/I;->r0()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    move-object v0, v10

    .line 88
    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const-string v3, "SimplifiedExoPlayer"

    .line 98
    .line 99
    const/16 v7, 0xc

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    if-ne p1, v1, :cond_7

    .line 106
    .line 107
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;

    .line 108
    .line 109
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 110
    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    invoke-virtual {v0}, LE5/I;->r0()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const-wide/16 v0, 0x1

    .line 119
    .line 120
    :goto_3
    invoke-direct {p1, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;-><init>(J)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->f:LHf/x0;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v10, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x0

    .line 132
    iput-boolean p1, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->r:Z

    .line 133
    .line 134
    const-wide/16 v0, 0x0

    .line 135
    .line 136
    iput-wide v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->u:J

    .line 137
    .line 138
    :cond_7
    return-void
.end method

.method public final synthetic c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic e(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic g(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic h(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic i(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic j(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic k(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic l(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, LE5/I;->r0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v4, v2

    .line 15
    :goto_0
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, LE5/I;->m0()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-wide v6, v2

    .line 25
    :goto_1
    sub-long/2addr v4, v6

    .line 26
    cmp-long v1, v4, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-lez v1, :cond_2

    .line 30
    .line 31
    move v1, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v1, 0x0

    .line 34
    :goto_2
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 35
    .line 36
    new-instance v4, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v5, "onIsPlayingChanged hasMore= "

    .line 39
    .line 40
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const-string v4, "SimplifiedExoPlayer"

    .line 53
    .line 54
    const/16 v8, 0xc

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;

    .line 61
    .line 62
    invoke-direct {v3, p1, v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;-><init>(ZZZ)V

    .line 63
    .line 64
    .line 65
    iget-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->h:LHf/x0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p1, v0, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final synthetic n(LE5/t0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic p(LE5/v0;LE5/v0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic q(LE5/s0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic r(LE5/r0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic s(LE5/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic t(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic u(LE5/L0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic v(Lr6/r;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final w()V
    .locals 7

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "onRenderedFirstFrame pos="

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->p:LE5/I;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, LE5/I;->m0()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const-string v1, "SimplifiedExoPlayer"

    .line 39
    .line 40
    const/16 v5, 0xc

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final synthetic x(Lv6/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final y(LE5/o;)V
    .locals 11

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "error"

    .line 5
    .line 6
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v5, "Exoplayer error (streaming enabled = "

    .line 19
    .line 20
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v10, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->b:Z

    .line 24
    .line 25
    const/16 v5, 0x29

    .line 26
    .line 27
    invoke-static {v4, v10, v5}, LA7/p0;->p(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v4, "SimplifiedExoPlayer"

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/16 v8, 0x8

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    move-object v6, p1

    .line 38
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 42
    .line 43
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 44
    .line 45
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 46
    .line 47
    const-string v5, "exoplayer_error"

    .line 48
    .line 49
    invoke-direct {v4, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget v5, v6, LE5/o;->a:I

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const-string v7, "error_code"

    .line 59
    .line 60
    invoke-virtual {v4, v7, v6}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/16 v6, 0x1389

    .line 64
    .line 65
    if-eq v5, v6, :cond_2

    .line 66
    .line 67
    const/16 v6, 0x138a

    .line 68
    .line 69
    if-eq v5, v6, :cond_1

    .line 70
    .line 71
    packed-switch v5, :pswitch_data_0

    .line 72
    .line 73
    .line 74
    packed-switch v5, :pswitch_data_1

    .line 75
    .line 76
    .line 77
    packed-switch v5, :pswitch_data_2

    .line 78
    .line 79
    .line 80
    packed-switch v5, :pswitch_data_3

    .line 81
    .line 82
    .line 83
    packed-switch v5, :pswitch_data_4

    .line 84
    .line 85
    .line 86
    const v6, 0xf4240

    .line 87
    .line 88
    .line 89
    if-lt v5, v6, :cond_0

    .line 90
    .line 91
    const-string v5, "custom error code"

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_0
    const-string v5, "invalid error code"

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :pswitch_0
    const-string v5, "ERROR_CODE_DRM_LICENSE_EXPIRED"

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :pswitch_1
    const-string v5, "ERROR_CODE_DRM_DEVICE_REVOKED"

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :pswitch_2
    const-string v5, "ERROR_CODE_DRM_SYSTEM_ERROR"

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :pswitch_3
    const-string v5, "ERROR_CODE_DRM_DISALLOWED_OPERATION"

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :pswitch_4
    const-string v5, "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED"

    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :pswitch_5
    const-string v5, "ERROR_CODE_DRM_CONTENT_ERROR"

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :pswitch_6
    const-string v5, "ERROR_CODE_DRM_PROVISIONING_FAILED"

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :pswitch_7
    const-string v5, "ERROR_CODE_DRM_SCHEME_UNSUPPORTED"

    .line 128
    .line 129
    goto/16 :goto_0

    .line 130
    .line 131
    :pswitch_8
    const-string v5, "ERROR_CODE_DRM_UNSPECIFIED"

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :pswitch_9
    const-string v5, "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED"

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_a
    const-string v5, "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES"

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :pswitch_b
    const-string v5, "ERROR_CODE_DECODING_FAILED"

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_c
    const-string v5, "ERROR_CODE_DECODER_QUERY_FAILED"

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :pswitch_d
    const-string v5, "ERROR_CODE_DECODER_INIT_FAILED"

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :pswitch_e
    const-string v5, "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED"

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :pswitch_f
    const-string v5, "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED"

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :pswitch_10
    const-string v5, "ERROR_CODE_PARSING_MANIFEST_MALFORMED"

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :pswitch_11
    const-string v5, "ERROR_CODE_PARSING_CONTAINER_MALFORMED"

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :pswitch_12
    const-string v5, "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE"

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :pswitch_13
    const-string v5, "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED"

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :pswitch_14
    const-string v5, "ERROR_CODE_IO_NO_PERMISSION"

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :pswitch_15
    const-string v5, "ERROR_CODE_IO_FILE_NOT_FOUND"

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :pswitch_16
    const-string v5, "ERROR_CODE_IO_BAD_HTTP_STATUS"

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :pswitch_17
    const-string v5, "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE"

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :pswitch_18
    const-string v5, "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT"

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :pswitch_19
    const-string v5, "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED"

    .line 183
    .line 184
    goto :goto_0

    .line 185
    :pswitch_1a
    const-string v5, "ERROR_CODE_IO_UNSPECIFIED"

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :pswitch_1b
    const-string v5, "ERROR_CODE_FAILED_RUNTIME_CHECK"

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :pswitch_1c
    const-string v5, "ERROR_CODE_TIMEOUT"

    .line 192
    .line 193
    goto :goto_0

    .line 194
    :pswitch_1d
    const-string v5, "ERROR_CODE_BEHIND_LIVE_WINDOW"

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :pswitch_1e
    const-string v5, "ERROR_CODE_REMOTE_ERROR"

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :pswitch_1f
    const-string v5, "ERROR_CODE_UNSPECIFIED"

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_1
    const-string v5, "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED"

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_2
    const-string v5, "ERROR_CODE_AUDIO_TRACK_INIT_FAILED"

    .line 207
    .line 208
    :goto_0
    const-string v6, "error_code_name"

    .line 209
    .line 210
    invoke-virtual {v4, v6, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v5, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;

    .line 214
    .line 215
    const/4 v6, 0x1

    .line 216
    if-eqz v5, :cond_3

    .line 217
    .line 218
    iget-boolean v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;->f:Z

    .line 219
    .line 220
    if-ne v5, v6, :cond_3

    .line 221
    .line 222
    move v5, v6

    .line 223
    goto :goto_1

    .line 224
    :cond_3
    move v5, v1

    .line 225
    :goto_1
    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    const-string v7, "has_streaming_error"

    .line 230
    .line 231
    invoke-virtual {v4, v7, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object v5, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->f:LHf/x0;

    .line 235
    .line 236
    invoke-virtual {v5}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;

    .line 241
    .line 242
    instance-of v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;

    .line 243
    .line 244
    if-eqz v8, :cond_4

    .line 245
    .line 246
    const-string v7, "not_available"

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_4
    instance-of v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 250
    .line 251
    if-eqz v8, :cond_5

    .line 252
    .line 253
    const-string v7, "preparing"

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_5
    instance-of v8, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 257
    .line 258
    if-eqz v8, :cond_6

    .line 259
    .line 260
    const-string v7, "position"

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_6
    instance-of v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;

    .line 264
    .line 265
    if-eqz v7, :cond_c

    .line 266
    .line 267
    const-string v7, "finished"

    .line 268
    .line 269
    :goto_2
    const-string v8, "playback_progress"

    .line 270
    .line 271
    invoke-virtual {v4, v8, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 275
    .line 276
    .line 277
    if-eqz v10, :cond_b

    .line 278
    .line 279
    iget-object p1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;

    .line 280
    .line 281
    if-eqz p1, :cond_b

    .line 282
    .line 283
    iget-boolean p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/d;->f:Z

    .line 284
    .line 285
    if-ne p1, v6, :cond_b

    .line 286
    .line 287
    invoke-virtual {v5}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/p;

    .line 292
    .line 293
    instance-of v4, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/l;

    .line 294
    .line 295
    if-nez v4, :cond_a

    .line 296
    .line 297
    instance-of v4, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/n;

    .line 298
    .line 299
    if-eqz v4, :cond_7

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_7
    instance-of v4, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/o;

    .line 303
    .line 304
    if-nez v4, :cond_9

    .line 305
    .line 306
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/m;

    .line 307
    .line 308
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-eqz p1, :cond_8

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_8
    new-instance p1, LE5/Q;

    .line 316
    .line 317
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 318
    .line 319
    .line 320
    throw p1

    .line 321
    :cond_9
    :goto_3
    const/4 v6, 0x0

    .line 322
    const/4 v7, 0x0

    .line 323
    const-string v4, "SimplifiedExoPlayer"

    .line 324
    .line 325
    const-string v5, "Exoplayer streaming failed before any playback started, so report that as error"

    .line 326
    .line 327
    const/16 v8, 0xc

    .line 328
    .line 329
    const/4 v9, 0x0

    .line 330
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_a
    :goto_4
    const/4 v6, 0x0

    .line 335
    const/4 v7, 0x0

    .line 336
    const-string v4, "SimplifiedExoPlayer"

    .line 337
    .line 338
    const-string v5, "Ignoring exoplayer streaming error as the user has viewed some of the ad already"

    .line 339
    .line 340
    const/16 v8, 0xc

    .line 341
    .line 342
    const/4 v9, 0x0

    .line 343
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :cond_b
    :goto_5
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;

    .line 348
    .line 349
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->j:LHf/x0;

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    const/4 v1, 0x0

    .line 355
    invoke-virtual {v0, v1, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_c
    new-instance p1, LE5/Q;

    .line 360
    .line 361
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 362
    .line 363
    .line 364
    throw p1

    .line 365
    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    :pswitch_data_1
    .packed-switch 0x7d0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    :pswitch_data_2
    .packed-switch 0xbb9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    :pswitch_data_3
    .packed-switch 0xfa1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    :pswitch_data_4
    .packed-switch 0x1770
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic z(LW5/c;)V
    .locals 0

    .line 1
    return-void
.end method
