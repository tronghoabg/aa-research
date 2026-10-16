.class public final Lf6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/w;
.implements Lf6/v;


# instance fields
.field public final a:Lf6/w;

.field public b:Lf6/v;

.field public c:[Lf6/b;

.field public d:J

.field public e:J

.field public f:J

.field public g:Lf6/e;


# direct methods
.method public constructor <init>(Lf6/w;ZJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/c;->a:Lf6/w;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [Lf6/b;

    .line 8
    .line 9
    iput-object p1, p0, Lf6/c;->c:[Lf6/b;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move-wide p1, p3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    :goto_0
    iput-wide p1, p0, Lf6/c;->d:J

    .line 21
    .line 22
    iput-wide p3, p0, Lf6/c;->e:J

    .line 23
    .line 24
    iput-wide p5, p0, Lf6/c;->f:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lf6/w;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lf6/c;->g:Lf6/e;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lf6/c;->b:Lf6/v;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0}, Lf6/v;->a(Lf6/w;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(Lf6/W;)V
    .locals 0

    .line 1
    check-cast p1, Lf6/w;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/c;->b:Lf6/v;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lf6/v;->b(Lf6/W;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c()J
    .locals 7

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lf6/W;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, Lf6/c;->f:J

    .line 14
    .line 15
    cmp-long v6, v4, v2

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-ltz v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final d(J)J
    .locals 5

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lf6/c;->d:J

    .line 7
    .line 8
    iget-object v0, p0, Lf6/c;->c:[Lf6/b;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iput-boolean v2, v4, Lf6/b;->b:Z

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lf6/w;->d(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    cmp-long p1, v0, p1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-wide p1, p0, Lf6/c;->e:J

    .line 35
    .line 36
    cmp-long p1, v0, p1

    .line 37
    .line 38
    if-ltz p1, :cond_3

    .line 39
    .line 40
    iget-wide p1, p0, Lf6/c;->f:J

    .line 41
    .line 42
    const-wide/high16 v3, -0x8000000000000000L

    .line 43
    .line 44
    cmp-long v3, p1, v3

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    cmp-long p1, v0, p1

    .line 49
    .line 50
    if-gtz p1, :cond_3

    .line 51
    .line 52
    :cond_2
    const/4 v2, 0x1

    .line 53
    :cond_3
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 54
    .line 55
    .line 56
    return-wide v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lf6/W;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lf6/c;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v3, p0, Lf6/c;->d:J

    .line 13
    .line 14
    iput-wide v1, p0, Lf6/c;->d:J

    .line 15
    .line 16
    invoke-virtual {p0}, Lf6/c;->f()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    cmp-long v0, v5, v1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-wide v5

    .line 25
    :cond_0
    return-wide v3

    .line 26
    :cond_1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 27
    .line 28
    invoke-interface {v0}, Lf6/w;->f()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    cmp-long v0, v3, v1

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_2
    iget-wide v0, p0, Lf6/c;->e:J

    .line 38
    .line 39
    cmp-long v0, v3, v0

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x1

    .line 43
    if-ltz v0, :cond_3

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move v0, v1

    .line 48
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 49
    .line 50
    .line 51
    iget-wide v5, p0, Lf6/c;->f:J

    .line 52
    .line 53
    const-wide/high16 v7, -0x8000000000000000L

    .line 54
    .line 55
    cmp-long v0, v5, v7

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    cmp-long v0, v3, v5

    .line 60
    .line 61
    if-gtz v0, :cond_5

    .line 62
    .line 63
    :cond_4
    move v1, v2

    .line 64
    :cond_5
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 65
    .line 66
    .line 67
    return-wide v3
.end method

.method public final g()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lf6/c;->d:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->g:Lf6/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 6
    .line 7
    invoke-interface {v0}, Lf6/w;->h()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
.end method

.method public final i(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lf6/w;->i(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()Lf6/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lf6/w;->j()Lf6/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final n()J
    .locals 7

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lf6/W;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, Lf6/c;->f:J

    .line 14
    .line 15
    cmp-long v6, v4, v2

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-ltz v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lf6/W;->o(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r(Lf6/v;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf6/c;->b:Lf6/v;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/c;->a:Lf6/w;

    .line 4
    .line 5
    invoke-interface {p1, p0, p2, p3}, Lf6/w;->r(Lf6/v;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s(JLE5/C0;)J
    .locals 10

    .line 1
    iget-wide v0, p0, Lf6/c;->e:J

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-wide v3, p3, LE5/C0;->a:J

    .line 9
    .line 10
    sub-long v7, p1, v0

    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    invoke-static/range {v3 .. v8}, Lu6/v;->i(JJJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-wide v2, p0, Lf6/c;->f:J

    .line 19
    .line 20
    const-wide/high16 v4, -0x8000000000000000L

    .line 21
    .line 22
    cmp-long v4, v2, v4

    .line 23
    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    const-wide v2, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    :goto_0
    move-wide v8, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    sub-long/2addr v2, p1

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-wide v4, p3, LE5/C0;->b:J

    .line 36
    .line 37
    const-wide/16 v6, 0x0

    .line 38
    .line 39
    invoke-static/range {v4 .. v9}, Lu6/v;->i(JJJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iget-wide v4, p3, LE5/C0;->a:J

    .line 44
    .line 45
    cmp-long v4, v0, v4

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    iget-wide v4, p3, LE5/C0;->b:J

    .line 50
    .line 51
    cmp-long v4, v2, v4

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    new-instance p3, LE5/C0;

    .line 57
    .line 58
    invoke-direct {p3, v0, v1, v2, v3}, LE5/C0;-><init>(JJ)V

    .line 59
    .line 60
    .line 61
    :goto_2
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 62
    .line 63
    invoke-interface {v0, p1, p2, p3}, Lf6/w;->s(JLE5/C0;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p1

    .line 67
    return-wide p1
.end method

.method public final y([Lr6/n;[Z[Lf6/V;[ZJ)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    array-length v1, v8

    .line 7
    new-array v1, v1, [Lf6/b;

    .line 8
    .line 9
    iput-object v1, v0, Lf6/c;->c:[Lf6/b;

    .line 10
    .line 11
    array-length v1, v8

    .line 12
    new-array v4, v1, [Lf6/V;

    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    move v1, v10

    .line 16
    :goto_0
    array-length v2, v8

    .line 17
    const/4 v11, 0x0

    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v0, Lf6/c;->c:[Lf6/b;

    .line 21
    .line 22
    aget-object v3, v8, v1

    .line 23
    .line 24
    check-cast v3, Lf6/b;

    .line 25
    .line 26
    aput-object v3, v2, v1

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-object v11, v3, Lf6/b;->a:Lf6/V;

    .line 31
    .line 32
    :cond_0
    aput-object v11, v4, v1

    .line 33
    .line 34
    add-int/2addr v1, v9

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v1, v0, Lf6/c;->a:Lf6/w;

    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    move-object/from16 v3, p2

    .line 41
    .line 42
    move-object/from16 v5, p4

    .line 43
    .line 44
    move-wide/from16 v6, p5

    .line 45
    .line 46
    invoke-interface/range {v1 .. v7}, Lf6/w;->y([Lr6/n;[Z[Lf6/V;[ZJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v12

    .line 50
    invoke-virtual {v0}, Lf6/c;->g()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_12

    .line 55
    .line 56
    iget-wide v5, v0, Lf6/c;->e:J

    .line 57
    .line 58
    cmp-long v1, p5, v5

    .line 59
    .line 60
    if-nez v1, :cond_12

    .line 61
    .line 62
    const-wide/16 v14, 0x0

    .line 63
    .line 64
    cmp-long v1, v5, v14

    .line 65
    .line 66
    if-eqz v1, :cond_12

    .line 67
    .line 68
    array-length v1, v2

    .line 69
    move v3, v10

    .line 70
    :goto_1
    if-ge v3, v1, :cond_12

    .line 71
    .line 72
    aget-object v5, v2, v3

    .line 73
    .line 74
    if-eqz v5, :cond_11

    .line 75
    .line 76
    invoke-interface {v5}, Lr6/n;->j()LE5/T;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iget-object v6, v5, LE5/T;->l:Ljava/lang/String;

    .line 81
    .line 82
    sget-object v7, Lu6/k;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    if-nez v6, :cond_2

    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :cond_2
    const/4 v7, -0x1

    .line 89
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    sparse-switch v14, :sswitch_data_0

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :sswitch_0
    const-string v14, "audio/g711-mlaw"

    .line 99
    .line 100
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_3

    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_3
    const/16 v7, 0xa

    .line 109
    .line 110
    goto/16 :goto_2

    .line 111
    .line 112
    :sswitch_1
    const-string v14, "audio/g711-alaw"

    .line 113
    .line 114
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_4

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :cond_4
    const/16 v7, 0x9

    .line 123
    .line 124
    goto/16 :goto_2

    .line 125
    .line 126
    :sswitch_2
    const-string v14, "audio/mpeg"

    .line 127
    .line 128
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-nez v6, :cond_5

    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :cond_5
    const/16 v7, 0x8

    .line 137
    .line 138
    goto/16 :goto_2

    .line 139
    .line 140
    :sswitch_3
    const-string v14, "audio/flac"

    .line 141
    .line 142
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-nez v6, :cond_6

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_6
    const/4 v7, 0x7

    .line 150
    goto :goto_2

    .line 151
    :sswitch_4
    const-string v14, "audio/eac3"

    .line 152
    .line 153
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-nez v6, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    const/4 v7, 0x6

    .line 161
    goto :goto_2

    .line 162
    :sswitch_5
    const-string v14, "audio/raw"

    .line 163
    .line 164
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_8

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    const/4 v7, 0x5

    .line 172
    goto :goto_2

    .line 173
    :sswitch_6
    const-string v14, "audio/ac3"

    .line 174
    .line 175
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-nez v6, :cond_9

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_9
    const/4 v7, 0x4

    .line 183
    goto :goto_2

    .line 184
    :sswitch_7
    const-string v14, "audio/mp4a-latm"

    .line 185
    .line 186
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_a

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_a
    const/4 v7, 0x3

    .line 194
    goto :goto_2

    .line 195
    :sswitch_8
    const-string v14, "audio/mpeg-L2"

    .line 196
    .line 197
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-nez v6, :cond_b

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_b
    const/4 v7, 0x2

    .line 205
    goto :goto_2

    .line 206
    :sswitch_9
    const-string v14, "audio/mpeg-L1"

    .line 207
    .line 208
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-nez v6, :cond_c

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_c
    move v7, v9

    .line 216
    goto :goto_2

    .line 217
    :sswitch_a
    const-string v14, "audio/eac3-joc"

    .line 218
    .line 219
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    if-nez v6, :cond_d

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_d
    move v7, v10

    .line 227
    :goto_2
    packed-switch v7, :pswitch_data_0

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :pswitch_0
    iget-object v5, v5, LE5/T;->i:Ljava/lang/String;

    .line 232
    .line 233
    if-nez v5, :cond_e

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_e
    invoke-static {v5}, Lu6/k;->d(Ljava/lang/String;)LD9/n;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    if-nez v5, :cond_f

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_f
    invoke-virtual {v5}, LD9/n;->a()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_10

    .line 248
    .line 249
    const/16 v6, 0x10

    .line 250
    .line 251
    if-eq v5, v6, :cond_10

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_10
    :goto_3
    move-wide v1, v12

    .line 255
    goto :goto_5

    .line 256
    :cond_11
    :goto_4
    :pswitch_1
    add-int/2addr v3, v9

    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    :cond_12
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    :goto_5
    iput-wide v1, v0, Lf6/c;->d:J

    .line 265
    .line 266
    cmp-long v1, v12, p5

    .line 267
    .line 268
    if-eqz v1, :cond_14

    .line 269
    .line 270
    iget-wide v1, v0, Lf6/c;->e:J

    .line 271
    .line 272
    cmp-long v1, v12, v1

    .line 273
    .line 274
    if-ltz v1, :cond_13

    .line 275
    .line 276
    iget-wide v1, v0, Lf6/c;->f:J

    .line 277
    .line 278
    const-wide/high16 v5, -0x8000000000000000L

    .line 279
    .line 280
    cmp-long v3, v1, v5

    .line 281
    .line 282
    if-eqz v3, :cond_14

    .line 283
    .line 284
    cmp-long v1, v12, v1

    .line 285
    .line 286
    if-gtz v1, :cond_13

    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_13
    move v1, v10

    .line 290
    goto :goto_7

    .line 291
    :cond_14
    :goto_6
    move v1, v9

    .line 292
    :goto_7
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 293
    .line 294
    .line 295
    :goto_8
    array-length v1, v8

    .line 296
    if-ge v10, v1, :cond_18

    .line 297
    .line 298
    aget-object v1, v4, v10

    .line 299
    .line 300
    if-nez v1, :cond_15

    .line 301
    .line 302
    iget-object v1, v0, Lf6/c;->c:[Lf6/b;

    .line 303
    .line 304
    aput-object v11, v1, v10

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_15
    iget-object v2, v0, Lf6/c;->c:[Lf6/b;

    .line 308
    .line 309
    aget-object v3, v2, v10

    .line 310
    .line 311
    if-eqz v3, :cond_16

    .line 312
    .line 313
    iget-object v3, v3, Lf6/b;->a:Lf6/V;

    .line 314
    .line 315
    if-eq v3, v1, :cond_17

    .line 316
    .line 317
    :cond_16
    new-instance v3, Lf6/b;

    .line 318
    .line 319
    invoke-direct {v3, v0, v1}, Lf6/b;-><init>(Lf6/c;Lf6/V;)V

    .line 320
    .line 321
    .line 322
    aput-object v3, v2, v10

    .line 323
    .line 324
    :cond_17
    :goto_9
    iget-object v1, v0, Lf6/c;->c:[Lf6/b;

    .line 325
    .line 326
    aget-object v1, v1, v10

    .line 327
    .line 328
    aput-object v1, v8, v10

    .line 329
    .line 330
    add-int/2addr v10, v9

    .line 331
    goto :goto_8

    .line 332
    :cond_18
    return-wide v12

    .line 333
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_a
        -0x19cc928c -> :sswitch_9
        -0x19cc928b -> :sswitch_8
        -0x3313c2e -> :sswitch_7
        0xb269698 -> :sswitch_6
        0xb26d66f -> :sswitch_5
        0x59ae0c65 -> :sswitch_4
        0x59aeaa01 -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x71710385 -> :sswitch_1
        0x717677f9 -> :sswitch_0
    .end sparse-switch

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final z(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/c;->a:Lf6/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lf6/W;->z(J)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
