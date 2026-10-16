.class public abstract LS1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS1/h;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:LS1/k;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LS1/c;->a:Z

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
    iput-object p1, p0, LS1/c;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final C(LS1/A;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LS1/c;->b:Ljava/util/ArrayList;

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
    iget p1, p0, LS1/c;->c:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    iput p1, p0, LS1/c;->c:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LS1/c;->d:LS1/k;

    .line 3
    .line 4
    sget v2, LQ1/x;->a:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    iget v4, p0, LS1/c;->c:I

    .line 9
    .line 10
    if-ge v3, v4, :cond_3

    .line 11
    .line 12
    iget-object v4, p0, LS1/c;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, LS1/A;

    .line 19
    .line 20
    iget-boolean v5, p0, LS1/c;->a:Z

    .line 21
    .line 22
    check-cast v4, Lo2/g;

    .line 23
    .line 24
    monitor-enter v4

    .line 25
    :try_start_0
    sget-object v6, Lo2/g;->n:Ll8/e0;

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    iget v5, v1, LS1/k;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    const/16 v6, 0x8

    .line 32
    .line 33
    and-int/2addr v5, v6

    .line 34
    if-ne v5, v6, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v5, v0

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    move v5, v2

    .line 40
    :goto_2
    if-nez v5, :cond_2

    .line 41
    .line 42
    monitor-exit v4

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :try_start_1
    iget-wide v5, v4, Lo2/g;->h:J

    .line 45
    .line 46
    int-to-long v7, p1

    .line 47
    add-long/2addr v5, v7

    .line 48
    iput-wide v5, v4, Lo2/g;->h:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    monitor-exit v4

    .line 51
    :goto_3
    add-int/2addr v3, v0

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    throw p1

    .line 56
    :cond_3
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
    iget-object v1, p0, LS1/c;->d:LS1/k;

    .line 3
    .line 4
    sget v2, LQ1/x;->a:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    iget v4, p0, LS1/c;->c:I

    .line 9
    .line 10
    if-ge v3, v4, :cond_7

    .line 11
    .line 12
    iget-object v4, p0, LS1/c;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, LS1/A;

    .line 19
    .line 20
    iget-boolean v5, p0, LS1/c;->a:Z

    .line 21
    .line 22
    move-object v6, v4

    .line 23
    check-cast v6, Lo2/g;

    .line 24
    .line 25
    monitor-enter v6

    .line 26
    :try_start_0
    sget-object v4, Lo2/g;->n:Ll8/e0;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    iget v4, v1, LS1/k;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    const/16 v5, 0x8

    .line 33
    .line 34
    and-int/2addr v4, v5

    .line 35
    if-ne v4, v5, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move v4, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_1
    move v4, v2

    .line 41
    :goto_2
    if-nez v4, :cond_2

    .line 42
    .line 43
    monitor-exit v6

    .line 44
    goto :goto_5

    .line 45
    :cond_2
    :try_start_1
    iget v4, v6, Lo2/g;->f:I

    .line 46
    .line 47
    if-lez v4, :cond_3

    .line 48
    .line 49
    move v4, v0

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move v4, v2

    .line 52
    :goto_3
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v6, Lo2/g;->c:LQ1/q;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    iget-wide v7, v6, Lo2/g;->g:J

    .line 65
    .line 66
    sub-long v7, v4, v7

    .line 67
    .line 68
    long-to-int v7, v7

    .line 69
    iget-wide v8, v6, Lo2/g;->i:J

    .line 70
    .line 71
    int-to-long v10, v7

    .line 72
    add-long/2addr v8, v10

    .line 73
    iput-wide v8, v6, Lo2/g;->i:J

    .line 74
    .line 75
    iget-wide v8, v6, Lo2/g;->j:J

    .line 76
    .line 77
    iget-wide v10, v6, Lo2/g;->h:J

    .line 78
    .line 79
    add-long/2addr v8, v10

    .line 80
    iput-wide v8, v6, Lo2/g;->j:J

    .line 81
    .line 82
    if-lez v7, :cond_6

    .line 83
    .line 84
    long-to-float v8, v10

    .line 85
    const/high16 v9, 0x45fa0000    # 8000.0f

    .line 86
    .line 87
    mul-float/2addr v8, v9

    .line 88
    int-to-float v9, v7

    .line 89
    div-float/2addr v8, v9

    .line 90
    iget-object v9, v6, Lo2/g;->e:Lo2/r;

    .line 91
    .line 92
    long-to-double v10, v10

    .line 93
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v10

    .line 97
    double-to-int v10, v10

    .line 98
    invoke-virtual {v9, v8, v10}, Lo2/r;->a(FI)V

    .line 99
    .line 100
    .line 101
    iget-wide v8, v6, Lo2/g;->i:J

    .line 102
    .line 103
    const-wide/16 v10, 0x7d0

    .line 104
    .line 105
    cmp-long v8, v8, v10

    .line 106
    .line 107
    if-gez v8, :cond_4

    .line 108
    .line 109
    iget-wide v8, v6, Lo2/g;->j:J

    .line 110
    .line 111
    const-wide/32 v10, 0x80000

    .line 112
    .line 113
    .line 114
    cmp-long v8, v8, v10

    .line 115
    .line 116
    if-ltz v8, :cond_5

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_6

    .line 121
    :cond_4
    :goto_4
    iget-object v8, v6, Lo2/g;->e:Lo2/r;

    .line 122
    .line 123
    invoke-virtual {v8}, Lo2/r;->b()F

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    float-to-long v8, v8

    .line 128
    iput-wide v8, v6, Lo2/g;->k:J

    .line 129
    .line 130
    :cond_5
    iget-wide v8, v6, Lo2/g;->h:J

    .line 131
    .line 132
    iget-wide v10, v6, Lo2/g;->k:J

    .line 133
    .line 134
    invoke-virtual/range {v6 .. v11}, Lo2/g;->b(IJJ)V

    .line 135
    .line 136
    .line 137
    iput-wide v4, v6, Lo2/g;->g:J

    .line 138
    .line 139
    const-wide/16 v4, 0x0

    .line 140
    .line 141
    iput-wide v4, v6, Lo2/g;->h:J

    .line 142
    .line 143
    :cond_6
    iget v4, v6, Lo2/g;->f:I

    .line 144
    .line 145
    sub-int/2addr v4, v0

    .line 146
    iput v4, v6, Lo2/g;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    .line 148
    monitor-exit v6

    .line 149
    :goto_5
    add-int/2addr v3, v0

    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :goto_6
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 153
    throw v0

    .line 154
    :cond_7
    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, LS1/c;->d:LS1/k;

    .line 156
    .line 157
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, LS1/c;->c:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, LS1/c;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LS1/A;

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

.method public final o(LS1/k;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-object p1, p0, LS1/c;->d:LS1/k;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    iget v3, p0, LS1/c;->c:I

    .line 7
    .line 8
    if-ge v2, v3, :cond_4

    .line 9
    .line 10
    iget-object v3, p0, LS1/c;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, LS1/A;

    .line 17
    .line 18
    iget-boolean v4, p0, LS1/c;->a:Z

    .line 19
    .line 20
    check-cast v3, Lo2/g;

    .line 21
    .line 22
    monitor-enter v3

    .line 23
    :try_start_0
    sget-object v5, Lo2/g;->n:Ll8/e0;

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget v4, p1, LS1/k;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const/16 v5, 0x8

    .line 30
    .line 31
    and-int/2addr v4, v5

    .line 32
    if-ne v4, v5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v4, v0

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    move v4, v1

    .line 38
    :goto_2
    if-nez v4, :cond_2

    .line 39
    .line 40
    monitor-exit v3

    .line 41
    goto :goto_4

    .line 42
    :cond_2
    :try_start_1
    iget v4, v3, Lo2/g;->f:I

    .line 43
    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    iget-object v4, v3, Lo2/g;->c:LQ1/q;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    iput-wide v4, v3, Lo2/g;->g:J

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_5

    .line 60
    :cond_3
    :goto_3
    iget v4, v3, Lo2/g;->f:I

    .line 61
    .line 62
    add-int/2addr v4, v0

    .line 63
    iput v4, v3, Lo2/g;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    monitor-exit v3

    .line 66
    :goto_4
    add-int/2addr v2, v0

    .line 67
    goto :goto_0

    .line 68
    :goto_5
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    throw p1

    .line 70
    :cond_4
    return-void
.end method
