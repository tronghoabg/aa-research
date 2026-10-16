.class public final LQ5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:LY4/b;

.field public final b:LG5/L;

.field public final c:LJ5/q;

.field public final d:Ly3/j;

.field public final e:LJ5/j;

.field public f:Lf6/N;

.field public g:LJ5/w;

.field public h:LJ5/w;

.field public i:I

.field public j:LW5/c;

.field public k:J

.field public l:J

.field public m:J

.field public n:I

.field public o:LQ5/f;

.field public p:Z

.field public q:Z

.field public r:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LQ5/d;->a:LY4/b;

    .line 12
    .line 13
    new-instance v0, LG5/L;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, LG5/L;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LQ5/d;->b:LG5/L;

    .line 20
    .line 21
    new-instance v0, LJ5/q;

    .line 22
    .line 23
    invoke-direct {v0}, LJ5/q;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LQ5/d;->c:LJ5/q;

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, LQ5/d;->k:J

    .line 34
    .line 35
    new-instance v0, Ly3/j;

    .line 36
    .line 37
    const/16 v1, 0xd

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ly3/j;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LQ5/d;->d:Ly3/j;

    .line 43
    .line 44
    new-instance v0, LJ5/j;

    .line 45
    .line 46
    invoke-direct {v0}, LJ5/j;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, LQ5/d;->e:LJ5/j;

    .line 50
    .line 51
    iput-object v0, p0, LQ5/d;->h:LJ5/w;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, LQ5/d;->i:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LQ5/d;->k:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, LQ5/d;->l:J

    .line 14
    .line 15
    iput p1, p0, LQ5/d;->n:I

    .line 16
    .line 17
    iput-wide p3, p0, LQ5/d;->r:J

    .line 18
    .line 19
    iget-object p1, p0, LQ5/d;->o:LQ5/f;

    .line 20
    .line 21
    instance-of p2, p1, LQ5/b;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    check-cast p1, LQ5/b;

    .line 26
    .line 27
    invoke-virtual {p1, p3, p4}, LQ5/b;->a(J)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, LQ5/d;->q:Z

    .line 35
    .line 36
    iget-object p1, p0, LQ5/d;->e:LJ5/j;

    .line 37
    .line 38
    iput-object p1, p0, LQ5/d;->h:LJ5/w;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final b(LJ5/h;Z)LQ5/a;
    .locals 10

    .line 1
    iget-object v0, p0, LQ5/d;->a:LY4/b;

    .line 2
    .line 3
    iget-object v1, v0, LY4/b;->a:[B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LY4/b;->d()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, LQ5/d;->b:LG5/L;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, LG5/L;->a(I)Z

    .line 20
    .line 21
    .line 22
    new-instance v2, LQ5/a;

    .line 23
    .line 24
    iget-wide v5, p1, LJ5/h;->d:J

    .line 25
    .line 26
    iget v7, v1, LG5/L;->g:I

    .line 27
    .line 28
    iget v8, v1, LG5/L;->d:I

    .line 29
    .line 30
    iget-wide v3, p1, LJ5/h;->c:J

    .line 31
    .line 32
    move v9, p2

    .line 33
    invoke-direct/range {v2 .. v9}, LQ5/a;-><init>(JJIIZ)V

    .line 34
    .line 35
    .line 36
    return-object v2
.end method

.method public final c(LJ5/h;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LQ5/d;->o:LQ5/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, LQ5/f;->d()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, LJ5/h;->g()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x4

    .line 21
    .line 22
    sub-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, LQ5/d;->a:LY4/b;

    .line 29
    .line 30
    iget-object v0, v0, LY4/b;->a:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-virtual {p1, v0, v2, v3, v1}, LJ5/h;->c([BIIZ)Z

    .line 35
    .line 36
    .line 37
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    xor-int/2addr p1, v1

    .line 39
    return p1

    .line 40
    :catch_0
    :goto_0
    return v1
.end method

.method public final d(LJ5/h;Z)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const v2, 0x8000

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/high16 v2, 0x20000

    .line 12
    .line 13
    :goto_0
    const/4 v3, 0x0

    .line 14
    iput v3, v1, LJ5/h;->f:I

    .line 15
    .line 16
    iget-wide v4, v1, LJ5/h;->d:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    cmp-long v4, v4, v6

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v4, :cond_3

    .line 24
    .line 25
    iget-object v4, v0, LQ5/d;->d:Ly3/j;

    .line 26
    .line 27
    invoke-virtual {v4, v1, v5}, Ly3/j;->o(LJ5/h;Lb6/g;)LW5/c;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iput-object v4, v0, LQ5/d;->j:LW5/c;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v6, v0, LQ5/d;->c:LJ5/q;

    .line 36
    .line 37
    invoke-virtual {v6, v4}, LJ5/q;->b(LW5/c;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    long-to-int v4, v6

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    move v6, v3

    .line 51
    :goto_1
    move v7, v6

    .line 52
    move v8, v7

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move v4, v3

    .line 55
    move v6, v4

    .line 56
    goto :goto_1

    .line 57
    :goto_2
    invoke-virtual/range {p0 .. p1}, LQ5/d;->c(LJ5/h;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    const/4 v10, 0x1

    .line 62
    if-eqz v9, :cond_5

    .line 63
    .line 64
    if-lez v7, :cond_4

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    new-instance v1, Ljava/io/EOFException;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_5
    iget-object v9, v0, LQ5/d;->a:LY4/b;

    .line 74
    .line 75
    invoke-virtual {v9, v3}, LY4/b;->A(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9}, LY4/b;->d()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v6, :cond_6

    .line 83
    .line 84
    int-to-long v11, v6

    .line 85
    const v13, -0x1f400

    .line 86
    .line 87
    .line 88
    and-int/2addr v13, v9

    .line 89
    int-to-long v13, v13

    .line 90
    const-wide/32 v15, -0x1f400

    .line 91
    .line 92
    .line 93
    and-long/2addr v11, v15

    .line 94
    cmp-long v11, v13, v11

    .line 95
    .line 96
    if-nez v11, :cond_7

    .line 97
    .line 98
    :cond_6
    invoke-static {v9}, LG5/b;->d(I)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    const/4 v12, -0x1

    .line 103
    if-ne v11, v12, :cond_b

    .line 104
    .line 105
    :cond_7
    add-int/lit8 v6, v8, 0x1

    .line 106
    .line 107
    if-ne v8, v2, :cond_9

    .line 108
    .line 109
    if-eqz p2, :cond_8

    .line 110
    .line 111
    return v3

    .line 112
    :cond_8
    const-string v1, "Searched too many bytes."

    .line 113
    .line 114
    invoke-static {v1, v5}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    throw v1

    .line 119
    :cond_9
    if-eqz p2, :cond_a

    .line 120
    .line 121
    iput v3, v1, LJ5/h;->f:I

    .line 122
    .line 123
    add-int v7, v4, v6

    .line 124
    .line 125
    invoke-virtual {v1, v7, v3}, LJ5/h;->b(IZ)Z

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_a
    invoke-virtual {v1, v10}, LJ5/h;->j(I)V

    .line 130
    .line 131
    .line 132
    :goto_3
    move v7, v3

    .line 133
    move v8, v6

    .line 134
    move v6, v7

    .line 135
    goto :goto_2

    .line 136
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 137
    .line 138
    if-ne v7, v10, :cond_c

    .line 139
    .line 140
    iget-object v6, v0, LQ5/d;->b:LG5/L;

    .line 141
    .line 142
    invoke-virtual {v6, v9}, LG5/L;->a(I)Z

    .line 143
    .line 144
    .line 145
    move v6, v9

    .line 146
    goto :goto_6

    .line 147
    :cond_c
    const/4 v9, 0x4

    .line 148
    if-ne v7, v9, :cond_e

    .line 149
    .line 150
    :goto_4
    if-eqz p2, :cond_d

    .line 151
    .line 152
    add-int/2addr v4, v8

    .line 153
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_d
    iput v3, v1, LJ5/h;->f:I

    .line 158
    .line 159
    :goto_5
    iput v6, v0, LQ5/d;->i:I

    .line 160
    .line 161
    return v10

    .line 162
    :cond_e
    :goto_6
    add-int/lit8 v11, v11, -0x4

    .line 163
    .line 164
    invoke-virtual {v1, v11, v3}, LJ5/h;->b(IZ)Z

    .line 165
    .line 166
    .line 167
    goto :goto_2
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v3, 0x4

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v7, 0x1

    .line 6
    iget-object v8, v0, LQ5/d;->g:LJ5/w;

    .line 7
    .line 8
    invoke-static {v8}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget v8, Lu6/v;->a:I

    .line 12
    .line 13
    iget v8, v0, LQ5/d;->i:I

    .line 14
    .line 15
    iget-object v12, v0, LQ5/d;->b:LG5/L;

    .line 16
    .line 17
    if-nez v8, :cond_0

    .line 18
    .line 19
    :try_start_0
    move-object/from16 v8, p1

    .line 20
    .line 21
    check-cast v8, LJ5/h;

    .line 22
    .line 23
    invoke-virtual {v0, v8, v6}, LQ5/d;->d(LJ5/h;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-object v1, v0

    .line 28
    const/4 v3, -0x1

    .line 29
    const/4 v6, -0x1

    .line 30
    const-wide/32 v16, 0xf4240

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1b

    .line 34
    .line 35
    :cond_0
    :goto_0
    iget-object v8, v0, LQ5/d;->o:LQ5/f;

    .line 36
    .line 37
    iget-object v13, v0, LQ5/d;->a:LY4/b;

    .line 38
    .line 39
    if-nez v8, :cond_24

    .line 40
    .line 41
    new-instance v8, LY4/b;

    .line 42
    .line 43
    const/16 p2, 0x0

    .line 44
    .line 45
    iget v2, v12, LG5/L;->d:I

    .line 46
    .line 47
    invoke-direct {v8, v2}, LY4/b;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v8, LY4/b;->a:[B

    .line 51
    .line 52
    const-wide/32 v16, 0xf4240

    .line 53
    .line 54
    .line 55
    iget v10, v12, LG5/L;->d:I

    .line 56
    .line 57
    move-object/from16 v11, p1

    .line 58
    .line 59
    check-cast v11, LJ5/h;

    .line 60
    .line 61
    invoke-virtual {v11, v2, v6, v10, v6}, LJ5/h;->c([BIIZ)Z

    .line 62
    .line 63
    .line 64
    iget v2, v12, LG5/L;->b:I

    .line 65
    .line 66
    and-int/2addr v2, v7

    .line 67
    const/16 v10, 0x15

    .line 68
    .line 69
    const/16 v11, 0x24

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    iget v2, v12, LG5/L;->f:I

    .line 74
    .line 75
    if-eq v2, v7, :cond_3

    .line 76
    .line 77
    move v10, v11

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget v2, v12, LG5/L;->f:I

    .line 80
    .line 81
    if-eq v2, v7, :cond_2

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/16 v10, 0xd

    .line 85
    .line 86
    :cond_3
    :goto_1
    iget v2, v8, LY4/b;->c:I

    .line 87
    .line 88
    const-wide/16 v18, 0x0

    .line 89
    .line 90
    add-int/lit8 v14, v10, 0x4

    .line 91
    .line 92
    const v15, 0x56425249

    .line 93
    .line 94
    .line 95
    const v4, 0x58696e67

    .line 96
    .line 97
    .line 98
    const v5, 0x496e666f

    .line 99
    .line 100
    .line 101
    if-lt v2, v14, :cond_4

    .line 102
    .line 103
    invoke-virtual {v8, v10}, LY4/b;->A(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, LY4/b;->d()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eq v2, v4, :cond_6

    .line 111
    .line 112
    if-ne v2, v5, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    iget v2, v8, LY4/b;->c:I

    .line 116
    .line 117
    const/16 v14, 0x28

    .line 118
    .line 119
    if-lt v2, v14, :cond_5

    .line 120
    .line 121
    invoke-virtual {v8, v11}, LY4/b;->A(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8}, LY4/b;->d()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-ne v2, v15, :cond_5

    .line 129
    .line 130
    move v2, v15

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    move v2, v6

    .line 133
    :cond_6
    :goto_2
    iget-object v11, v0, LQ5/d;->c:LJ5/q;

    .line 134
    .line 135
    const-wide/16 v22, -0x1

    .line 136
    .line 137
    const-string v14, ", "

    .line 138
    .line 139
    if-eq v2, v4, :cond_7

    .line 140
    .line 141
    if-ne v2, v5, :cond_8

    .line 142
    .line 143
    :cond_7
    move-object/from16 v27, v8

    .line 144
    .line 145
    goto/16 :goto_9

    .line 146
    .line 147
    :cond_8
    if-ne v2, v15, :cond_12

    .line 148
    .line 149
    move-object/from16 v2, p1

    .line 150
    .line 151
    check-cast v2, LJ5/h;

    .line 152
    .line 153
    iget-wide v4, v2, LJ5/h;->d:J

    .line 154
    .line 155
    const/16 v10, 0xa

    .line 156
    .line 157
    invoke-virtual {v8, v10}, LY4/b;->B(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, LY4/b;->d()I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-gtz v10, :cond_9

    .line 165
    .line 166
    :goto_3
    move-object/from16 v32, p2

    .line 167
    .line 168
    move-object v0, v2

    .line 169
    goto/16 :goto_8

    .line 170
    .line 171
    :cond_9
    iget v15, v12, LG5/L;->e:I

    .line 172
    .line 173
    move-wide/from16 v30, v4

    .line 174
    .line 175
    int-to-long v3, v10

    .line 176
    const/16 v5, 0x7d00

    .line 177
    .line 178
    if-lt v15, v5, :cond_a

    .line 179
    .line 180
    const/16 v5, 0x480

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    const/16 v5, 0x240

    .line 184
    .line 185
    :goto_4
    int-to-long v9, v5

    .line 186
    mul-long v26, v9, v16

    .line 187
    .line 188
    int-to-long v9, v15

    .line 189
    move-wide/from16 v24, v3

    .line 190
    .line 191
    move-wide/from16 v28, v9

    .line 192
    .line 193
    invoke-static/range {v24 .. v29}, Lu6/v;->D(JJJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v35

    .line 197
    invoke-virtual {v8}, LY4/b;->v()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-virtual {v8}, LY4/b;->v()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v8}, LY4/b;->v()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    const/4 v9, 0x2

    .line 210
    invoke-virtual {v8, v9}, LY4/b;->B(I)V

    .line 211
    .line 212
    .line 213
    iget v10, v12, LG5/L;->d:I

    .line 214
    .line 215
    int-to-long v9, v10

    .line 216
    add-long v9, v30, v9

    .line 217
    .line 218
    new-array v15, v3, [J

    .line 219
    .line 220
    new-array v6, v3, [J

    .line 221
    .line 222
    move-object/from16 v34, v6

    .line 223
    .line 224
    move-object/from16 v27, v8

    .line 225
    .line 226
    move-wide/from16 v7, v30

    .line 227
    .line 228
    const/4 v6, 0x0

    .line 229
    :goto_5
    if-ge v6, v3, :cond_f

    .line 230
    .line 231
    int-to-long v0, v6

    .line 232
    mul-long v0, v0, v35

    .line 233
    .line 234
    move-wide/from16 v28, v0

    .line 235
    .line 236
    int-to-long v0, v3

    .line 237
    div-long v0, v28, v0

    .line 238
    .line 239
    aput-wide v0, v15, v6

    .line 240
    .line 241
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 242
    .line 243
    .line 244
    move-result-wide v0

    .line 245
    aput-wide v0, v34, v6

    .line 246
    .line 247
    const/4 v0, 0x1

    .line 248
    if-eq v5, v0, :cond_e

    .line 249
    .line 250
    const/4 v0, 0x2

    .line 251
    if-eq v5, v0, :cond_d

    .line 252
    .line 253
    const/4 v1, 0x3

    .line 254
    if-eq v5, v1, :cond_c

    .line 255
    .line 256
    const/4 v1, 0x4

    .line 257
    if-eq v5, v1, :cond_b

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_b
    invoke-virtual/range {v27 .. v27}, LY4/b;->t()I

    .line 261
    .line 262
    .line 263
    move-result v24

    .line 264
    :goto_6
    move/from16 v0, v24

    .line 265
    .line 266
    move-object/from16 v24, v2

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_c
    const/4 v1, 0x4

    .line 270
    invoke-virtual/range {v27 .. v27}, LY4/b;->s()I

    .line 271
    .line 272
    .line 273
    move-result v24

    .line 274
    goto :goto_6

    .line 275
    :cond_d
    const/4 v1, 0x4

    .line 276
    invoke-virtual/range {v27 .. v27}, LY4/b;->v()I

    .line 277
    .line 278
    .line 279
    move-result v24

    .line 280
    goto :goto_6

    .line 281
    :cond_e
    const/4 v0, 0x2

    .line 282
    const/4 v1, 0x4

    .line 283
    invoke-virtual/range {v27 .. v27}, LY4/b;->q()I

    .line 284
    .line 285
    .line 286
    move-result v24

    .line 287
    goto :goto_6

    .line 288
    :goto_7
    int-to-long v1, v0

    .line 289
    move-wide/from16 v30, v1

    .line 290
    .line 291
    int-to-long v0, v4

    .line 292
    mul-long v1, v30, v0

    .line 293
    .line 294
    add-long/2addr v7, v1

    .line 295
    const/16 v26, 0x1

    .line 296
    .line 297
    add-int/lit8 v6, v6, 0x1

    .line 298
    .line 299
    move-object/from16 v0, p0

    .line 300
    .line 301
    move-object/from16 v2, v24

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_f
    move-object v0, v2

    .line 305
    iget-wide v1, v0, LJ5/h;->c:J

    .line 306
    .line 307
    cmp-long v3, v1, v22

    .line 308
    .line 309
    if-eqz v3, :cond_10

    .line 310
    .line 311
    cmp-long v3, v1, v7

    .line 312
    .line 313
    if-eqz v3, :cond_10

    .line 314
    .line 315
    const-string v3, "VBRI data size mismatch: "

    .line 316
    .line 317
    invoke-static {v1, v2, v3, v14}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    const-string v2, "VbriSeeker"

    .line 329
    .line 330
    invoke-static {v2, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :cond_10
    new-instance v32, LQ5/g;

    .line 334
    .line 335
    move-wide/from16 v37, v7

    .line 336
    .line 337
    move-object/from16 v33, v15

    .line 338
    .line 339
    invoke-direct/range {v32 .. v38}, LQ5/g;-><init>([J[JJJ)V

    .line 340
    .line 341
    .line 342
    :goto_8
    iget v1, v12, LG5/L;->d:I

    .line 343
    .line 344
    invoke-virtual {v0, v1}, LJ5/h;->j(I)V

    .line 345
    .line 346
    .line 347
    :cond_11
    move-object/from16 v1, p0

    .line 348
    .line 349
    goto/16 :goto_e

    .line 350
    .line 351
    :cond_12
    move-object/from16 v0, p1

    .line 352
    .line 353
    check-cast v0, LJ5/h;

    .line 354
    .line 355
    const/4 v1, 0x0

    .line 356
    iput v1, v0, LJ5/h;->f:I

    .line 357
    .line 358
    move-object/from16 v1, p0

    .line 359
    .line 360
    move-object/from16 v32, p2

    .line 361
    .line 362
    goto/16 :goto_e

    .line 363
    .line 364
    :goto_9
    move-object/from16 v0, p1

    .line 365
    .line 366
    check-cast v0, LJ5/h;

    .line 367
    .line 368
    iget-wide v3, v0, LJ5/h;->d:J

    .line 369
    .line 370
    iget v1, v12, LG5/L;->h:I

    .line 371
    .line 372
    iget v6, v12, LG5/L;->e:I

    .line 373
    .line 374
    invoke-virtual/range {v27 .. v27}, LY4/b;->d()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    const/4 v8, 0x1

    .line 379
    and-int/lit8 v9, v7, 0x1

    .line 380
    .line 381
    if-ne v9, v8, :cond_17

    .line 382
    .line 383
    invoke-virtual/range {v27 .. v27}, LY4/b;->t()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    if-nez v8, :cond_13

    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_13
    int-to-long v8, v8

    .line 391
    move-wide/from16 v28, v3

    .line 392
    .line 393
    int-to-long v3, v1

    .line 394
    mul-long v34, v3, v16

    .line 395
    .line 396
    int-to-long v3, v6

    .line 397
    move-wide/from16 v36, v3

    .line 398
    .line 399
    move-wide/from16 v32, v8

    .line 400
    .line 401
    invoke-static/range {v32 .. v37}, Lu6/v;->D(JJJ)J

    .line 402
    .line 403
    .line 404
    move-result-wide v36

    .line 405
    const/4 v1, 0x6

    .line 406
    and-int/lit8 v3, v7, 0x6

    .line 407
    .line 408
    if-eq v3, v1, :cond_14

    .line 409
    .line 410
    new-instance v32, LQ5/h;

    .line 411
    .line 412
    iget v1, v12, LG5/L;->d:I

    .line 413
    .line 414
    const-wide/16 v38, -0x1

    .line 415
    .line 416
    const/16 v40, 0x0

    .line 417
    .line 418
    move/from16 v35, v1

    .line 419
    .line 420
    move-wide/from16 v33, v28

    .line 421
    .line 422
    invoke-direct/range {v32 .. v40}, LQ5/h;-><init>(JIJJ[J)V

    .line 423
    .line 424
    .line 425
    goto :goto_c

    .line 426
    :cond_14
    move-wide/from16 v33, v28

    .line 427
    .line 428
    invoke-virtual/range {v27 .. v27}, LY4/b;->r()J

    .line 429
    .line 430
    .line 431
    move-result-wide v38

    .line 432
    const/16 v1, 0x64

    .line 433
    .line 434
    new-array v3, v1, [J

    .line 435
    .line 436
    const/4 v4, 0x0

    .line 437
    :goto_a
    if-ge v4, v1, :cond_15

    .line 438
    .line 439
    invoke-virtual/range {v27 .. v27}, LY4/b;->q()I

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    int-to-long v6, v6

    .line 444
    aput-wide v6, v3, v4

    .line 445
    .line 446
    const/16 v26, 0x1

    .line 447
    .line 448
    add-int/lit8 v4, v4, 0x1

    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_15
    iget-wide v6, v0, LJ5/h;->c:J

    .line 452
    .line 453
    cmp-long v1, v6, v22

    .line 454
    .line 455
    if-eqz v1, :cond_16

    .line 456
    .line 457
    add-long v8, v33, v38

    .line 458
    .line 459
    cmp-long v1, v6, v8

    .line 460
    .line 461
    if-eqz v1, :cond_16

    .line 462
    .line 463
    const-string v1, "XING data size mismatch: "

    .line 464
    .line 465
    invoke-static {v6, v7, v1, v14}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    const-string v4, "XingSeeker"

    .line 477
    .line 478
    invoke-static {v4, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    :cond_16
    new-instance v32, LQ5/h;

    .line 482
    .line 483
    iget v1, v12, LG5/L;->d:I

    .line 484
    .line 485
    move/from16 v35, v1

    .line 486
    .line 487
    move-object/from16 v40, v3

    .line 488
    .line 489
    invoke-direct/range {v32 .. v40}, LQ5/h;-><init>(JIJJ[J)V

    .line 490
    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_17
    :goto_b
    move-object/from16 v32, p2

    .line 494
    .line 495
    :goto_c
    if-eqz v32, :cond_1a

    .line 496
    .line 497
    iget v1, v11, LJ5/q;->a:I

    .line 498
    .line 499
    const/4 v3, -0x1

    .line 500
    if-eq v1, v3, :cond_18

    .line 501
    .line 502
    iget v1, v11, LJ5/q;->b:I

    .line 503
    .line 504
    if-eq v1, v3, :cond_18

    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_18
    const/4 v1, 0x0

    .line 508
    iput v1, v0, LJ5/h;->f:I

    .line 509
    .line 510
    add-int/lit16 v10, v10, 0x8d

    .line 511
    .line 512
    invoke-virtual {v0, v10, v1}, LJ5/h;->b(IZ)Z

    .line 513
    .line 514
    .line 515
    iget-object v3, v13, LY4/b;->a:[B

    .line 516
    .line 517
    const/4 v4, 0x3

    .line 518
    invoke-virtual {v0, v3, v1, v4, v1}, LJ5/h;->c([BIIZ)Z

    .line 519
    .line 520
    .line 521
    invoke-virtual {v13, v1}, LY4/b;->A(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v13}, LY4/b;->s()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    shr-int/lit8 v3, v1, 0xc

    .line 529
    .line 530
    and-int/lit16 v1, v1, 0xfff

    .line 531
    .line 532
    if-gtz v3, :cond_19

    .line 533
    .line 534
    if-lez v1, :cond_1a

    .line 535
    .line 536
    :cond_19
    iput v3, v11, LJ5/q;->a:I

    .line 537
    .line 538
    iput v1, v11, LJ5/q;->b:I

    .line 539
    .line 540
    :cond_1a
    :goto_d
    iget v1, v12, LG5/L;->d:I

    .line 541
    .line 542
    invoke-virtual {v0, v1}, LJ5/h;->j(I)V

    .line 543
    .line 544
    .line 545
    if-eqz v32, :cond_11

    .line 546
    .line 547
    invoke-virtual/range {v32 .. v32}, LQ5/h;->e()Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-nez v1, :cond_11

    .line 552
    .line 553
    if-ne v2, v5, :cond_11

    .line 554
    .line 555
    const/4 v2, 0x0

    .line 556
    move-object/from16 v1, p0

    .line 557
    .line 558
    invoke-virtual {v1, v0, v2}, LQ5/d;->b(LJ5/h;Z)LQ5/a;

    .line 559
    .line 560
    .line 561
    move-result-object v32

    .line 562
    :goto_e
    iget-object v0, v1, LQ5/d;->j:LW5/c;

    .line 563
    .line 564
    move-object/from16 v2, p1

    .line 565
    .line 566
    check-cast v2, LJ5/h;

    .line 567
    .line 568
    iget-wide v3, v2, LJ5/h;->d:J

    .line 569
    .line 570
    if-eqz v0, :cond_1f

    .line 571
    .line 572
    iget-object v5, v0, LW5/c;->a:[LW5/b;

    .line 573
    .line 574
    array-length v6, v5

    .line 575
    const/4 v7, 0x0

    .line 576
    :goto_f
    if-ge v7, v6, :cond_1f

    .line 577
    .line 578
    aget-object v8, v5, v7

    .line 579
    .line 580
    instance-of v9, v8, Lb6/k;

    .line 581
    .line 582
    if-eqz v9, :cond_1e

    .line 583
    .line 584
    check-cast v8, Lb6/k;

    .line 585
    .line 586
    if-eqz v0, :cond_1c

    .line 587
    .line 588
    iget-object v0, v0, LW5/c;->a:[LW5/b;

    .line 589
    .line 590
    array-length v5, v0

    .line 591
    const/4 v6, 0x0

    .line 592
    :goto_10
    if-ge v6, v5, :cond_1c

    .line 593
    .line 594
    aget-object v7, v0, v6

    .line 595
    .line 596
    instance-of v9, v7, Lb6/m;

    .line 597
    .line 598
    if-eqz v9, :cond_1b

    .line 599
    .line 600
    check-cast v7, Lb6/m;

    .line 601
    .line 602
    iget-object v9, v7, Lb6/i;->a:Ljava/lang/String;

    .line 603
    .line 604
    const-string v10, "TLEN"

    .line 605
    .line 606
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v9

    .line 610
    if-eqz v9, :cond_1b

    .line 611
    .line 612
    iget-object v0, v7, Lb6/m;->c:Ljava/lang/String;

    .line 613
    .line 614
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 615
    .line 616
    .line 617
    move-result-wide v5

    .line 618
    invoke-static {v5, v6}, Lu6/v;->y(J)J

    .line 619
    .line 620
    .line 621
    move-result-wide v5

    .line 622
    const/16 v26, 0x1

    .line 623
    .line 624
    goto :goto_11

    .line 625
    :cond_1b
    const/16 v26, 0x1

    .line 626
    .line 627
    add-int/lit8 v6, v6, 0x1

    .line 628
    .line 629
    goto :goto_10

    .line 630
    :cond_1c
    const/16 v26, 0x1

    .line 631
    .line 632
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    :goto_11
    iget-object v0, v8, Lb6/k;->e:[I

    .line 638
    .line 639
    array-length v0, v0

    .line 640
    add-int/lit8 v7, v0, 0x1

    .line 641
    .line 642
    new-array v9, v7, [J

    .line 643
    .line 644
    new-array v7, v7, [J

    .line 645
    .line 646
    const/16 v25, 0x0

    .line 647
    .line 648
    aput-wide v3, v9, v25

    .line 649
    .line 650
    aput-wide v18, v7, v25

    .line 651
    .line 652
    move-wide/from16 v14, v18

    .line 653
    .line 654
    move/from16 v10, v26

    .line 655
    .line 656
    :goto_12
    if-gt v10, v0, :cond_1d

    .line 657
    .line 658
    add-int/lit8 v18, v10, -0x1

    .line 659
    .line 660
    move/from16 v22, v0

    .line 661
    .line 662
    iget-object v0, v8, Lb6/k;->e:[I

    .line 663
    .line 664
    aget v0, v0, v18

    .line 665
    .line 666
    move/from16 v19, v0

    .line 667
    .line 668
    iget v0, v8, Lb6/k;->c:I

    .line 669
    .line 670
    add-int v0, v0, v19

    .line 671
    .line 672
    move-wide/from16 v27, v3

    .line 673
    .line 674
    int-to-long v3, v0

    .line 675
    add-long v3, v27, v3

    .line 676
    .line 677
    iget-object v0, v8, Lb6/k;->f:[I

    .line 678
    .line 679
    aget v0, v0, v18

    .line 680
    .line 681
    move/from16 v18, v0

    .line 682
    .line 683
    iget v0, v8, Lb6/k;->d:I

    .line 684
    .line 685
    add-int v0, v0, v18

    .line 686
    .line 687
    move-wide/from16 v18, v3

    .line 688
    .line 689
    int-to-long v3, v0

    .line 690
    add-long/2addr v14, v3

    .line 691
    aput-wide v18, v9, v10

    .line 692
    .line 693
    aput-wide v14, v7, v10

    .line 694
    .line 695
    const/16 v26, 0x1

    .line 696
    .line 697
    add-int/lit8 v10, v10, 0x1

    .line 698
    .line 699
    move-wide/from16 v3, v18

    .line 700
    .line 701
    move/from16 v0, v22

    .line 702
    .line 703
    goto :goto_12

    .line 704
    :cond_1d
    new-instance v0, LQ5/c;

    .line 705
    .line 706
    invoke-direct {v0, v9, v7, v5, v6}, LQ5/c;-><init>([J[JJ)V

    .line 707
    .line 708
    .line 709
    goto :goto_13

    .line 710
    :cond_1e
    const/16 v26, 0x1

    .line 711
    .line 712
    add-int/lit8 v7, v7, 0x1

    .line 713
    .line 714
    goto/16 :goto_f

    .line 715
    .line 716
    :cond_1f
    move-object/from16 v0, p2

    .line 717
    .line 718
    :goto_13
    iget-boolean v3, v1, LQ5/d;->p:Z

    .line 719
    .line 720
    if-eqz v3, :cond_20

    .line 721
    .line 722
    new-instance v0, LQ5/e;

    .line 723
    .line 724
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    invoke-direct {v0, v3, v4}, LJ5/o;-><init>(J)V

    .line 730
    .line 731
    .line 732
    goto :goto_15

    .line 733
    :cond_20
    if-eqz v0, :cond_21

    .line 734
    .line 735
    move-object/from16 v32, v0

    .line 736
    .line 737
    goto :goto_14

    .line 738
    :cond_21
    if-eqz v32, :cond_22

    .line 739
    .line 740
    goto :goto_14

    .line 741
    :cond_22
    move-object/from16 v32, p2

    .line 742
    .line 743
    :goto_14
    if-eqz v32, :cond_23

    .line 744
    .line 745
    invoke-interface/range {v32 .. v32}, LJ5/t;->e()Z

    .line 746
    .line 747
    .line 748
    move-object/from16 v0, v32

    .line 749
    .line 750
    goto :goto_15

    .line 751
    :cond_23
    const/4 v0, 0x0

    .line 752
    invoke-virtual {v1, v2, v0}, LQ5/d;->b(LJ5/h;Z)LQ5/a;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    move-object v0, v3

    .line 757
    :goto_15
    iput-object v0, v1, LQ5/d;->o:LQ5/f;

    .line 758
    .line 759
    iget-object v3, v1, LQ5/d;->f:Lf6/N;

    .line 760
    .line 761
    invoke-virtual {v3, v0}, Lf6/N;->x(LJ5/t;)V

    .line 762
    .line 763
    .line 764
    iget-object v0, v1, LQ5/d;->h:LJ5/w;

    .line 765
    .line 766
    new-instance v3, LE5/S;

    .line 767
    .line 768
    invoke-direct {v3}, LE5/S;-><init>()V

    .line 769
    .line 770
    .line 771
    iget-object v4, v12, LG5/L;->c:Ljava/lang/String;

    .line 772
    .line 773
    iput-object v4, v3, LE5/S;->k:Ljava/lang/String;

    .line 774
    .line 775
    const/16 v4, 0x1000

    .line 776
    .line 777
    iput v4, v3, LE5/S;->l:I

    .line 778
    .line 779
    iget v4, v12, LG5/L;->f:I

    .line 780
    .line 781
    iput v4, v3, LE5/S;->x:I

    .line 782
    .line 783
    iget v4, v12, LG5/L;->e:I

    .line 784
    .line 785
    iput v4, v3, LE5/S;->y:I

    .line 786
    .line 787
    iget v4, v11, LJ5/q;->a:I

    .line 788
    .line 789
    iput v4, v3, LE5/S;->A:I

    .line 790
    .line 791
    iget v4, v11, LJ5/q;->b:I

    .line 792
    .line 793
    iput v4, v3, LE5/S;->B:I

    .line 794
    .line 795
    iget-object v4, v1, LQ5/d;->j:LW5/c;

    .line 796
    .line 797
    iput-object v4, v3, LE5/S;->i:LW5/c;

    .line 798
    .line 799
    new-instance v4, LE5/T;

    .line 800
    .line 801
    invoke-direct {v4, v3}, LE5/T;-><init>(LE5/S;)V

    .line 802
    .line 803
    .line 804
    invoke-interface {v0, v4}, LJ5/w;->a(LE5/T;)V

    .line 805
    .line 806
    .line 807
    iget-wide v2, v2, LJ5/h;->d:J

    .line 808
    .line 809
    iput-wide v2, v1, LQ5/d;->m:J

    .line 810
    .line 811
    goto :goto_16

    .line 812
    :cond_24
    move-object v1, v0

    .line 813
    const/16 p2, 0x0

    .line 814
    .line 815
    const-wide/32 v16, 0xf4240

    .line 816
    .line 817
    .line 818
    const-wide/16 v18, 0x0

    .line 819
    .line 820
    iget-wide v2, v1, LQ5/d;->m:J

    .line 821
    .line 822
    cmp-long v0, v2, v18

    .line 823
    .line 824
    if-eqz v0, :cond_25

    .line 825
    .line 826
    move-object/from16 v0, p1

    .line 827
    .line 828
    check-cast v0, LJ5/h;

    .line 829
    .line 830
    iget-wide v4, v0, LJ5/h;->d:J

    .line 831
    .line 832
    cmp-long v0, v4, v2

    .line 833
    .line 834
    if-gez v0, :cond_25

    .line 835
    .line 836
    sub-long/2addr v2, v4

    .line 837
    long-to-int v0, v2

    .line 838
    move-object/from16 v2, p1

    .line 839
    .line 840
    check-cast v2, LJ5/h;

    .line 841
    .line 842
    invoke-virtual {v2, v0}, LJ5/h;->j(I)V

    .line 843
    .line 844
    .line 845
    :cond_25
    :goto_16
    iget v0, v1, LQ5/d;->n:I

    .line 846
    .line 847
    if-nez v0, :cond_2a

    .line 848
    .line 849
    move-object/from16 v0, p1

    .line 850
    .line 851
    check-cast v0, LJ5/h;

    .line 852
    .line 853
    const/4 v2, 0x0

    .line 854
    iput v2, v0, LJ5/h;->f:I

    .line 855
    .line 856
    move-object/from16 v0, p1

    .line 857
    .line 858
    check-cast v0, LJ5/h;

    .line 859
    .line 860
    invoke-virtual {v1, v0}, LQ5/d;->c(LJ5/h;)Z

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    if-eqz v3, :cond_26

    .line 865
    .line 866
    goto/16 :goto_1a

    .line 867
    .line 868
    :cond_26
    invoke-virtual {v13, v2}, LY4/b;->A(I)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v13}, LY4/b;->d()I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    iget v3, v1, LQ5/d;->i:I

    .line 876
    .line 877
    int-to-long v3, v3

    .line 878
    const v5, -0x1f400

    .line 879
    .line 880
    .line 881
    and-int/2addr v5, v2

    .line 882
    int-to-long v5, v5

    .line 883
    const-wide/32 v7, -0x1f400

    .line 884
    .line 885
    .line 886
    and-long/2addr v3, v7

    .line 887
    cmp-long v3, v5, v3

    .line 888
    .line 889
    if-nez v3, :cond_27

    .line 890
    .line 891
    invoke-static {v2}, LG5/b;->d(I)I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    const/4 v4, -0x1

    .line 896
    if-ne v3, v4, :cond_28

    .line 897
    .line 898
    :cond_27
    const/4 v2, 0x0

    .line 899
    const/4 v8, 0x1

    .line 900
    goto :goto_17

    .line 901
    :cond_28
    invoke-virtual {v12, v2}, LG5/L;->a(I)Z

    .line 902
    .line 903
    .line 904
    iget-wide v2, v1, LQ5/d;->k:J

    .line 905
    .line 906
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    cmp-long v2, v2, v20

    .line 912
    .line 913
    if-nez v2, :cond_29

    .line 914
    .line 915
    iget-object v2, v1, LQ5/d;->o:LQ5/f;

    .line 916
    .line 917
    iget-wide v3, v0, LJ5/h;->d:J

    .line 918
    .line 919
    invoke-interface {v2, v3, v4}, LQ5/f;->b(J)J

    .line 920
    .line 921
    .line 922
    move-result-wide v2

    .line 923
    iput-wide v2, v1, LQ5/d;->k:J

    .line 924
    .line 925
    :cond_29
    iget v2, v12, LG5/L;->d:I

    .line 926
    .line 927
    iput v2, v1, LQ5/d;->n:I

    .line 928
    .line 929
    iget-object v2, v1, LQ5/d;->o:LQ5/f;

    .line 930
    .line 931
    instance-of v3, v2, LQ5/b;

    .line 932
    .line 933
    if-eqz v3, :cond_2a

    .line 934
    .line 935
    check-cast v2, LQ5/b;

    .line 936
    .line 937
    iget-wide v3, v1, LQ5/d;->l:J

    .line 938
    .line 939
    iget v5, v12, LG5/L;->h:I

    .line 940
    .line 941
    int-to-long v5, v5

    .line 942
    add-long/2addr v3, v5

    .line 943
    iget-wide v5, v1, LQ5/d;->k:J

    .line 944
    .line 945
    mul-long v3, v3, v16

    .line 946
    .line 947
    iget v7, v12, LG5/L;->e:I

    .line 948
    .line 949
    int-to-long v7, v7

    .line 950
    div-long/2addr v3, v7

    .line 951
    add-long/2addr v3, v5

    .line 952
    iget-wide v5, v0, LJ5/h;->d:J

    .line 953
    .line 954
    invoke-virtual {v2, v3, v4}, LQ5/b;->a(J)Z

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    if-eqz v0, :cond_2b

    .line 959
    .line 960
    iget-boolean v0, v1, LQ5/d;->q:Z

    .line 961
    .line 962
    if-eqz v0, :cond_2a

    .line 963
    .line 964
    iget-wide v3, v1, LQ5/d;->r:J

    .line 965
    .line 966
    invoke-virtual {v2, v3, v4}, LQ5/b;->a(J)Z

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    if-eqz v0, :cond_2a

    .line 971
    .line 972
    const/4 v2, 0x0

    .line 973
    iput-boolean v2, v1, LQ5/d;->q:Z

    .line 974
    .line 975
    iget-object v0, v1, LQ5/d;->g:LJ5/w;

    .line 976
    .line 977
    iput-object v0, v1, LQ5/d;->h:LJ5/w;

    .line 978
    .line 979
    :cond_2a
    const/4 v8, 0x1

    .line 980
    goto :goto_19

    .line 981
    :cond_2b
    throw p2

    .line 982
    :goto_17
    invoke-virtual {v0, v8}, LJ5/h;->j(I)V

    .line 983
    .line 984
    .line 985
    iput v2, v1, LQ5/d;->i:I

    .line 986
    .line 987
    :goto_18
    const/4 v3, -0x1

    .line 988
    const/4 v6, 0x0

    .line 989
    goto :goto_1b

    .line 990
    :goto_19
    iget-object v0, v1, LQ5/d;->h:LJ5/w;

    .line 991
    .line 992
    iget v2, v1, LQ5/d;->n:I

    .line 993
    .line 994
    move-object/from16 v3, p1

    .line 995
    .line 996
    invoke-interface {v0, v3, v2, v8}, LJ5/w;->d(Lt6/i;IZ)I

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    const/4 v3, -0x1

    .line 1001
    if-ne v0, v3, :cond_2c

    .line 1002
    .line 1003
    :goto_1a
    const/4 v3, -0x1

    .line 1004
    const/4 v6, -0x1

    .line 1005
    goto :goto_1b

    .line 1006
    :cond_2c
    iget v2, v1, LQ5/d;->n:I

    .line 1007
    .line 1008
    sub-int/2addr v2, v0

    .line 1009
    iput v2, v1, LQ5/d;->n:I

    .line 1010
    .line 1011
    if-lez v2, :cond_2d

    .line 1012
    .line 1013
    goto :goto_18

    .line 1014
    :cond_2d
    iget-object v3, v1, LQ5/d;->h:LJ5/w;

    .line 1015
    .line 1016
    iget-wide v4, v1, LQ5/d;->l:J

    .line 1017
    .line 1018
    iget-wide v6, v1, LQ5/d;->k:J

    .line 1019
    .line 1020
    mul-long v4, v4, v16

    .line 1021
    .line 1022
    iget v0, v12, LG5/L;->e:I

    .line 1023
    .line 1024
    int-to-long v8, v0

    .line 1025
    div-long/2addr v4, v8

    .line 1026
    add-long/2addr v4, v6

    .line 1027
    iget v7, v12, LG5/L;->d:I

    .line 1028
    .line 1029
    const/4 v8, 0x0

    .line 1030
    const/4 v9, 0x0

    .line 1031
    const/4 v6, 0x1

    .line 1032
    invoke-interface/range {v3 .. v9}, LJ5/w;->b(JIIILJ5/v;)V

    .line 1033
    .line 1034
    .line 1035
    iget-wide v2, v1, LQ5/d;->l:J

    .line 1036
    .line 1037
    iget v0, v12, LG5/L;->h:I

    .line 1038
    .line 1039
    int-to-long v4, v0

    .line 1040
    add-long/2addr v2, v4

    .line 1041
    iput-wide v2, v1, LQ5/d;->l:J

    .line 1042
    .line 1043
    const/4 v2, 0x0

    .line 1044
    iput v2, v1, LQ5/d;->n:I

    .line 1045
    .line 1046
    move v6, v2

    .line 1047
    const/4 v3, -0x1

    .line 1048
    :goto_1b
    if-ne v6, v3, :cond_2e

    .line 1049
    .line 1050
    iget-object v0, v1, LQ5/d;->o:LQ5/f;

    .line 1051
    .line 1052
    instance-of v2, v0, LQ5/b;

    .line 1053
    .line 1054
    if-eqz v2, :cond_2e

    .line 1055
    .line 1056
    iget-wide v2, v1, LQ5/d;->l:J

    .line 1057
    .line 1058
    iget-wide v4, v1, LQ5/d;->k:J

    .line 1059
    .line 1060
    mul-long v2, v2, v16

    .line 1061
    .line 1062
    iget v7, v12, LG5/L;->e:I

    .line 1063
    .line 1064
    int-to-long v7, v7

    .line 1065
    div-long/2addr v2, v7

    .line 1066
    add-long/2addr v2, v4

    .line 1067
    invoke-interface {v0}, LJ5/t;->f()J

    .line 1068
    .line 1069
    .line 1070
    move-result-wide v4

    .line 1071
    cmp-long v0, v4, v2

    .line 1072
    .line 1073
    if-eqz v0, :cond_2e

    .line 1074
    .line 1075
    iget-object v0, v1, LQ5/d;->o:LQ5/f;

    .line 1076
    .line 1077
    move-object v2, v0

    .line 1078
    check-cast v2, LQ5/b;

    .line 1079
    .line 1080
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1081
    .line 1082
    .line 1083
    iget-object v2, v1, LQ5/d;->f:Lf6/N;

    .line 1084
    .line 1085
    invoke-virtual {v2, v0}, Lf6/N;->x(LJ5/t;)V

    .line 1086
    .line 1087
    .line 1088
    :cond_2e
    return v6
.end method

.method public final h(Lf6/N;)V
    .locals 2

    .line 1
    iput-object p1, p0, LQ5/d;->f:Lf6/N;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Lf6/N;->m(II)LJ5/w;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LQ5/d;->g:LJ5/w;

    .line 10
    .line 11
    iput-object p1, p0, LQ5/d;->h:LJ5/w;

    .line 12
    .line 13
    iget-object p1, p0, LQ5/d;->f:Lf6/N;

    .line 14
    .line 15
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    check-cast p1, LJ5/h;

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, LQ5/d;->d(LJ5/h;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
