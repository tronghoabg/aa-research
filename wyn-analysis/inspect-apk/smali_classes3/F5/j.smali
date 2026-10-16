.class public final LF5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public final a:Landroid/content/Context;

.field public final b:LF5/h;

.field public final c:Landroid/media/metrics/PlaybackSession;

.field public final d:J

.field public final e:LE5/I0;

.field public final f:LE5/H0;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public i:Ljava/lang/String;

.field public j:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public k:I

.field public l:I

.field public m:I

.field public n:LE5/o;

.field public o:LS3/e;

.field public p:LS3/e;

.field public q:LS3/e;

.field public r:LE5/T;

.field public s:LE5/T;

.field public t:LE5/T;

.field public u:Z

.field public v:I

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LF5/j;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    new-instance p1, LE5/I0;

    .line 13
    .line 14
    invoke-direct {p1}, LE5/I0;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LF5/j;->e:LE5/I0;

    .line 18
    .line 19
    new-instance p1, LE5/H0;

    .line 20
    .line 21
    invoke-direct {p1}, LE5/H0;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LF5/j;->f:LE5/H0;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LF5/j;->h:Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LF5/j;->g:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, LF5/j;->d:J

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    iput p1, p0, LF5/j;->l:I

    .line 48
    .line 49
    iput p1, p0, LF5/j;->m:I

    .line 50
    .line 51
    new-instance p1, LF5/h;

    .line 52
    .line 53
    invoke-direct {p1}, LF5/h;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LF5/j;->b:LF5/h;

    .line 57
    .line 58
    iput-object p0, p1, LF5/h;->d:LF5/j;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(LS3/e;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, LS3/e;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, p0, LF5/j;->b:LF5/h;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, v0, LF5/h;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, LF5/j;->A:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, LF5/j;->z:I

    .line 11
    .line 12
    invoke-static {v0, v2}, LV1/g;->v(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, LF5/j;->x:I

    .line 18
    .line 19
    invoke-static {v0, v2}, LV1/g;->z(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, LF5/j;->y:I

    .line 25
    .line 26
    invoke-static {v0, v2}, LV1/h;->p(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LF5/j;->g:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, LF5/j;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, LV1/h;->q(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LF5/j;->h:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, LF5/j;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, LV1/h;->z(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, LV1/h;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 96
    .line 97
    iget-object v2, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 98
    .line 99
    invoke-static {v2}, LV1/h;->g(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v0, v2}, LV1/h;->r(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 108
    .line 109
    iput-object v0, p0, LF5/j;->i:Ljava/lang/String;

    .line 110
    .line 111
    iput v1, p0, LF5/j;->z:I

    .line 112
    .line 113
    iput v1, p0, LF5/j;->x:I

    .line 114
    .line 115
    iput v1, p0, LF5/j;->y:I

    .line 116
    .line 117
    iput-object v0, p0, LF5/j;->r:LE5/T;

    .line 118
    .line 119
    iput-object v0, p0, LF5/j;->s:LE5/T;

    .line 120
    .line 121
    iput-object v0, p0, LF5/j;->t:LE5/T;

    .line 122
    .line 123
    iput-boolean v1, p0, LF5/j;->A:Z

    .line 124
    .line 125
    return-void
.end method

.method public final c(LE5/J0;Lf6/z;)V
    .locals 8

    .line 1
    iget-object v0, p0, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p2, Lf6/x;->a:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, LF5/j;->f:LE5/H0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, p2, v1, v2}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 20
    .line 21
    .line 22
    iget p2, v1, LE5/H0;->c:I

    .line 23
    .line 24
    iget-object v1, p0, LF5/j;->e:LE5/I0;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v1}, LE5/J0;->n(ILE5/I0;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, LE5/I0;->c:LE5/d0;

    .line 30
    .line 31
    iget-object p1, p1, LE5/d0;->b:LE5/a0;

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object p1, p1, LE5/a0;->a:Landroid/net/Uri;

    .line 39
    .line 40
    invoke-static {p1}, Lu6/v;->u(Landroid/net/Uri;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    if-eq p1, v3, :cond_4

    .line 47
    .line 48
    if-eq p1, p2, :cond_3

    .line 49
    .line 50
    move v2, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/4 v2, 0x4

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    const/4 v2, 0x5

    .line 55
    goto :goto_1

    .line 56
    :cond_5
    const/4 v2, 0x3

    .line 57
    :goto_1
    invoke-static {v0, v2}, LV1/h;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 58
    .line 59
    .line 60
    iget-wide v4, v1, LE5/I0;->m:J

    .line 61
    .line 62
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    cmp-long p1, v4, v6

    .line 68
    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    iget-boolean p1, v1, LE5/I0;->k:Z

    .line 72
    .line 73
    if-nez p1, :cond_6

    .line 74
    .line 75
    iget-boolean p1, v1, LE5/I0;->h:Z

    .line 76
    .line 77
    if-nez p1, :cond_6

    .line 78
    .line 79
    invoke-virtual {v1}, LE5/I0;->a()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    iget-wide v4, v1, LE5/I0;->m:J

    .line 86
    .line 87
    invoke-static {v4, v5}, Lu6/v;->F(J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-static {v0, v4, v5}, LV1/h;->C(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {v1}, LE5/I0;->a()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_7
    move p2, v3

    .line 102
    :goto_2
    invoke-static {v0, p2}, LV1/h;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 103
    .line 104
    .line 105
    iput-boolean v3, p0, LF5/j;->A:Z

    .line 106
    .line 107
    return-void
.end method

.method public final d(LF5/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p1, LF5/a;->d:Lf6/z;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lf6/x;->a()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, LF5/j;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, LF5/j;->b()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    iget-object p1, p0, LF5/j;->g:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LF5/j;->h:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(IJLE5/T;)V
    .locals 3

    .line 1
    invoke-static {p1}, LF5/i;->j(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, LF5/j;->d:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, LV1/h;->m(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_a

    .line 14
    .line 15
    invoke-static {p1}, LV1/g;->w(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    invoke-static {p1, p3}, LV1/g;->r(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p4, LE5/T;->k:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {p1, v0}, LV1/g;->s(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p4, LE5/T;->l:Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-static {p1, v0}, LV1/g;->y(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p4, LE5/T;->i:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-static {p1, v0}, LV1/g;->B(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    const/4 v0, -0x1

    .line 44
    iget v1, p4, LE5/T;->h:I

    .line 45
    .line 46
    if-eq v1, v0, :cond_3

    .line 47
    .line 48
    invoke-static {p1, v1}, LV1/g;->x(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v1, p4, LE5/T;->q:I

    .line 52
    .line 53
    if-eq v1, v0, :cond_4

    .line 54
    .line 55
    invoke-static {p1, v1}, LV1/g;->A(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget v1, p4, LE5/T;->r:I

    .line 59
    .line 60
    if-eq v1, v0, :cond_5

    .line 61
    .line 62
    invoke-static {p1, v1}, LV1/g;->C(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 63
    .line 64
    .line 65
    :cond_5
    iget v1, p4, LE5/T;->y:I

    .line 66
    .line 67
    if-eq v1, v0, :cond_6

    .line 68
    .line 69
    invoke-static {p1, v1}, LV1/g;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 70
    .line 71
    .line 72
    :cond_6
    iget v1, p4, LE5/T;->z:I

    .line 73
    .line 74
    if-eq v1, v0, :cond_7

    .line 75
    .line 76
    invoke-static {p1, v1}, LV1/h;->t(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 77
    .line 78
    .line 79
    :cond_7
    iget-object v1, p4, LE5/T;->c:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v1, :cond_9

    .line 82
    .line 83
    sget v2, Lu6/v;->a:I

    .line 84
    .line 85
    const-string v2, "-"

    .line 86
    .line 87
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const/4 v1, 0x0

    .line 92
    aget-object v1, v0, v1

    .line 93
    .line 94
    array-length v2, v0

    .line 95
    if-lt v2, p3, :cond_8

    .line 96
    .line 97
    aget-object p3, v0, p2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_8
    const/4 p3, 0x0

    .line 101
    :goto_0
    invoke-static {v1, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    iget-object v0, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {p1, v0}, LV1/h;->u(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 113
    .line 114
    if-eqz p3, :cond_9

    .line 115
    .line 116
    check-cast p3, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {p1, p3}, LV1/h;->A(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_9
    iget p3, p4, LE5/T;->s:F

    .line 122
    .line 123
    const/high16 p4, -0x40800000    # -1.0f

    .line 124
    .line 125
    cmpl-float p4, p3, p4

    .line 126
    .line 127
    if-eqz p4, :cond_b

    .line 128
    .line 129
    invoke-static {p1, p3}, Lyc/a;->b(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_a
    invoke-static {p1}, LV1/g;->q(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    :goto_1
    iput-boolean p2, p0, LF5/j;->A:Z

    .line 137
    .line 138
    iget-object p2, p0, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 139
    .line 140
    invoke-static {p1}, LV1/g;->l(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p2, p1}, LV1/g;->p(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method
