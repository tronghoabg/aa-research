.class public final Lk2/f;
.super Lk2/x;
.source "SourceFile"


# instance fields
.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z


# direct methods
.method public constructor <init>(LN1/N;JJ)V
    .locals 13

    .line 1
    move-wide/from16 v0, p4

    .line 2
    .line 3
    invoke-direct/range {p0 .. p1}, Lk2/x;-><init>(LN1/N;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LN1/N;->h()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v2, v4, :cond_9

    .line 13
    .line 14
    new-instance v2, LN1/M;

    .line 15
    .line 16
    invoke-direct {v2}, LN1/M;-><init>()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    invoke-virtual {p1, v3, v2, v5, v6}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    move-wide v7, p2

    .line 26
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v9

    .line 30
    iget-boolean v2, p1, LN1/M;->k:Z

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    cmp-long v2, v9, v5

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget-boolean v2, p1, LN1/M;->h:Z

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Lk2/g;

    .line 44
    .line 45
    invoke-direct {p1, v4}, Lk2/g;-><init>(I)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    .line 50
    .line 51
    cmp-long v2, v0, v7

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-wide v0, p1, LN1/M;->m:J

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    :goto_1
    iget-wide v5, p1, LN1/M;->m:J

    .line 63
    .line 64
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long v2, v5, v7

    .line 70
    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    cmp-long v11, v0, v5

    .line 74
    .line 75
    if-lez v11, :cond_3

    .line 76
    .line 77
    move-wide v11, v5

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-wide v11, v0

    .line 80
    :goto_2
    cmp-long v0, v9, v11

    .line 81
    .line 82
    if-gtz v0, :cond_4

    .line 83
    .line 84
    move-wide v0, v11

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    new-instance v7, Lk2/g;

    .line 87
    .line 88
    const/4 v8, 0x2

    .line 89
    invoke-direct/range {v7 .. v12}, Lk2/g;-><init>(IJJ)V

    .line 90
    .line 91
    .line 92
    throw v7

    .line 93
    :cond_5
    :goto_3
    iput-wide v9, p0, Lk2/f;->c:J

    .line 94
    .line 95
    iput-wide v0, p0, Lk2/f;->d:J

    .line 96
    .line 97
    cmp-long v11, v0, v7

    .line 98
    .line 99
    if-nez v11, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    sub-long v7, v0, v9

    .line 103
    .line 104
    :goto_4
    iput-wide v7, p0, Lk2/f;->e:J

    .line 105
    .line 106
    iget-boolean p1, p1, LN1/M;->i:Z

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    if-eqz v11, :cond_7

    .line 111
    .line 112
    if-eqz v2, :cond_8

    .line 113
    .line 114
    cmp-long p1, v0, v5

    .line 115
    .line 116
    if-nez p1, :cond_8

    .line 117
    .line 118
    :cond_7
    move v3, v4

    .line 119
    :cond_8
    iput-boolean v3, p0, Lk2/f;->f:Z

    .line 120
    .line 121
    return-void

    .line 122
    :cond_9
    new-instance p1, Lk2/g;

    .line 123
    .line 124
    invoke-direct {p1, v3}, Lk2/g;-><init>(I)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method


# virtual methods
.method public final f(ILN1/L;Z)LN1/L;
    .locals 10

    .line 1
    iget-object v1, p0, Lk2/x;->b:LN1/N;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2, p2, p3}, LN1/N;->f(ILN1/L;Z)LN1/L;

    .line 5
    .line 6
    .line 7
    iget-wide v1, p2, LN1/L;->e:J

    .line 8
    .line 9
    iget-wide v3, p0, Lk2/f;->c:J

    .line 10
    .line 11
    sub-long v6, v1, v3

    .line 12
    .line 13
    iget-wide v1, p0, Lk2/f;->e:J

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v5, v1, v3

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    :goto_0
    move-wide v4, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    sub-long v3, v1, v6

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v1, p2, LN1/L;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v2, p2, LN1/L;->b:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v8, LN1/b;->c:LN1/b;

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v0, p2

    .line 38
    invoke-virtual/range {v0 .. v9}, LN1/L;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLN1/b;Z)V

    .line 39
    .line 40
    .line 41
    return-object p2
.end method

.method public final m(ILN1/M;J)LN1/M;
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    const-wide/16 p3, 0x0

    .line 3
    .line 4
    iget-object v0, p0, Lk2/x;->b:LN1/N;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3, p4}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 7
    .line 8
    .line 9
    iget-wide p3, p2, LN1/M;->p:J

    .line 10
    .line 11
    iget-wide v0, p0, Lk2/f;->c:J

    .line 12
    .line 13
    add-long/2addr p3, v0

    .line 14
    iput-wide p3, p2, LN1/M;->p:J

    .line 15
    .line 16
    iget-wide p3, p0, Lk2/f;->e:J

    .line 17
    .line 18
    iput-wide p3, p2, LN1/M;->m:J

    .line 19
    .line 20
    iget-boolean p1, p0, Lk2/f;->f:Z

    .line 21
    .line 22
    iput-boolean p1, p2, LN1/M;->i:Z

    .line 23
    .line 24
    iget-wide p3, p2, LN1/M;->l:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long p1, p3, v2

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iput-wide p3, p2, LN1/M;->l:J

    .line 40
    .line 41
    iget-wide v4, p0, Lk2/f;->d:J

    .line 42
    .line 43
    cmp-long p1, v4, v2

    .line 44
    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3, p4, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :goto_0
    sub-long/2addr p3, v0

    .line 53
    iput-wide p3, p2, LN1/M;->l:J

    .line 54
    .line 55
    :cond_1
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide p3

    .line 59
    iget-wide v0, p2, LN1/M;->e:J

    .line 60
    .line 61
    cmp-long p1, v0, v2

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    add-long/2addr v0, p3

    .line 66
    iput-wide v0, p2, LN1/M;->e:J

    .line 67
    .line 68
    :cond_2
    iget-wide v0, p2, LN1/M;->f:J

    .line 69
    .line 70
    cmp-long p1, v0, v2

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    add-long/2addr v0, p3

    .line 75
    iput-wide v0, p2, LN1/M;->f:J

    .line 76
    .line 77
    :cond_3
    return-object p2
.end method
