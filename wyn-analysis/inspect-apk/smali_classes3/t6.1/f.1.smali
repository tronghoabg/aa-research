.class public abstract Lt6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/l;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:Lt6/n;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lt6/f;->a:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lt6/f;->d:Lt6/n;

    .line 3
    .line 4
    sget v2, Lu6/v;->a:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    iget v4, p0, Lt6/f;->c:I

    .line 9
    .line 10
    if-ge v3, v4, :cond_2

    .line 11
    .line 12
    iget-object v4, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lt6/K;

    .line 19
    .line 20
    iget-boolean v5, p0, Lt6/f;->a:Z

    .line 21
    .line 22
    check-cast v4, Lt6/p;

    .line 23
    .line 24
    monitor-enter v4

    .line 25
    :try_start_0
    sget-object v6, Lt6/p;->n:Ll8/e0;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget v5, v1, Lt6/n;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    move v5, v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move v5, v2

    .line 34
    :goto_1
    if-nez v5, :cond_1

    .line 35
    .line 36
    monitor-exit v4

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :try_start_1
    iget-wide v5, v4, Lt6/p;->h:J

    .line 39
    .line 40
    int-to-long v7, p1

    .line 41
    add-long/2addr v5, v7

    .line 42
    iput-wide v5, v4, Lt6/p;->h:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    monitor-exit v4

    .line 45
    :goto_2
    add-int/2addr v3, v0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    throw p1

    .line 50
    :cond_2
    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lt6/f;->d:Lt6/n;

    .line 3
    .line 4
    sget v2, Lu6/v;->a:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    iget v4, p0, Lt6/f;->c:I

    .line 9
    .line 10
    if-ge v3, v4, :cond_6

    .line 11
    .line 12
    iget-object v4, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lt6/K;

    .line 19
    .line 20
    iget-boolean v5, p0, Lt6/f;->a:Z

    .line 21
    .line 22
    move-object v6, v4

    .line 23
    check-cast v6, Lt6/p;

    .line 24
    .line 25
    monitor-enter v6

    .line 26
    :try_start_0
    sget-object v4, Lt6/p;->n:Ll8/e0;

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    iget v4, v1, Lt6/n;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    move v4, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v2

    .line 35
    :goto_1
    if-nez v4, :cond_1

    .line 36
    .line 37
    monitor-exit v6

    .line 38
    goto :goto_4

    .line 39
    :cond_1
    :try_start_1
    iget v4, v6, Lt6/p;->f:I

    .line 40
    .line 41
    if-lez v4, :cond_2

    .line 42
    .line 43
    move v4, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v4, v2

    .line 46
    :goto_2
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v4, v6, Lt6/p;->d:Lu6/q;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    iget-wide v7, v6, Lt6/p;->g:J

    .line 59
    .line 60
    sub-long v7, v4, v7

    .line 61
    .line 62
    long-to-int v7, v7

    .line 63
    iget-wide v8, v6, Lt6/p;->j:J

    .line 64
    .line 65
    int-to-long v10, v7

    .line 66
    add-long/2addr v8, v10

    .line 67
    iput-wide v8, v6, Lt6/p;->j:J

    .line 68
    .line 69
    iget-wide v8, v6, Lt6/p;->k:J

    .line 70
    .line 71
    iget-wide v10, v6, Lt6/p;->h:J

    .line 72
    .line 73
    add-long/2addr v8, v10

    .line 74
    iput-wide v8, v6, Lt6/p;->k:J

    .line 75
    .line 76
    if-lez v7, :cond_5

    .line 77
    .line 78
    long-to-float v8, v10

    .line 79
    const/high16 v9, 0x45fa0000    # 8000.0f

    .line 80
    .line 81
    mul-float/2addr v8, v9

    .line 82
    int-to-float v9, v7

    .line 83
    div-float/2addr v8, v9

    .line 84
    iget-object v9, v6, Lt6/p;->c:Lt6/I;

    .line 85
    .line 86
    long-to-double v10, v10

    .line 87
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide v10

    .line 91
    double-to-int v10, v10

    .line 92
    invoke-virtual {v9, v8, v10}, Lt6/I;->a(FI)V

    .line 93
    .line 94
    .line 95
    iget-wide v8, v6, Lt6/p;->j:J

    .line 96
    .line 97
    const-wide/16 v10, 0x7d0

    .line 98
    .line 99
    cmp-long v8, v8, v10

    .line 100
    .line 101
    if-gez v8, :cond_3

    .line 102
    .line 103
    iget-wide v8, v6, Lt6/p;->k:J

    .line 104
    .line 105
    const-wide/32 v10, 0x80000

    .line 106
    .line 107
    .line 108
    cmp-long v8, v8, v10

    .line 109
    .line 110
    if-ltz v8, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto :goto_5

    .line 115
    :cond_3
    :goto_3
    iget-object v8, v6, Lt6/p;->c:Lt6/I;

    .line 116
    .line 117
    invoke-virtual {v8}, Lt6/I;->b()F

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    float-to-long v8, v8

    .line 122
    iput-wide v8, v6, Lt6/p;->l:J

    .line 123
    .line 124
    :cond_4
    iget-wide v8, v6, Lt6/p;->h:J

    .line 125
    .line 126
    iget-wide v10, v6, Lt6/p;->l:J

    .line 127
    .line 128
    invoke-virtual/range {v6 .. v11}, Lt6/p;->b(IJJ)V

    .line 129
    .line 130
    .line 131
    iput-wide v4, v6, Lt6/p;->g:J

    .line 132
    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    iput-wide v4, v6, Lt6/p;->h:J

    .line 136
    .line 137
    :cond_5
    iget v4, v6, Lt6/p;->f:I

    .line 138
    .line 139
    sub-int/2addr v4, v0

    .line 140
    iput v4, v6, Lt6/p;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    monitor-exit v6

    .line 143
    :goto_4
    add-int/2addr v3, v0

    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :goto_5
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    throw v0

    .line 148
    :cond_6
    const/4 v0, 0x0

    .line 149
    iput-object v0, p0, Lt6/f;->d:Lt6/n;

    .line 150
    .line 151
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lt6/f;->c:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lt6/K;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public final n(Lt6/n;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-object p1, p0, Lt6/f;->d:Lt6/n;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    iget v3, p0, Lt6/f;->c:I

    .line 7
    .line 8
    if-ge v2, v3, :cond_3

    .line 9
    .line 10
    iget-object v3, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lt6/K;

    .line 17
    .line 18
    iget-boolean v4, p0, Lt6/f;->a:Z

    .line 19
    .line 20
    check-cast v3, Lt6/p;

    .line 21
    .line 22
    monitor-enter v3

    .line 23
    :try_start_0
    sget-object v5, Lt6/p;->n:Ll8/e0;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    iget v4, p1, Lt6/n;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    move v4, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move v4, v1

    .line 32
    :goto_1
    if-nez v4, :cond_1

    .line 33
    .line 34
    monitor-exit v3

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    :try_start_1
    iget v4, v3, Lt6/p;->f:I

    .line 37
    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    iget-object v4, v3, Lt6/p;->d:Lu6/q;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    iput-wide v4, v3, Lt6/p;->g:J

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :cond_2
    :goto_2
    iget v4, v3, Lt6/p;->f:I

    .line 55
    .line 56
    add-int/2addr v4, v0

    .line 57
    iput v4, v3, Lt6/p;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    monitor-exit v3

    .line 60
    :goto_3
    add-int/2addr v2, v0

    .line 61
    goto :goto_0

    .line 62
    :goto_4
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1

    .line 64
    :cond_3
    return-void
.end method

.method public final z(Lt6/K;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt6/f;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget p1, p0, Lt6/f;->c:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    iput p1, p0, Lt6/f;->c:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method
