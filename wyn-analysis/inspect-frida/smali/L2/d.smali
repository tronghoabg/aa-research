.class public final LL2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# static fields
.field public static final v:LJ9/x;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:LQ1/o;

.field public final d:LG5/L;

.field public final e:Ls2/s;

.field public final f:LX2/a;

.field public final g:Ls2/l;

.field public h:Ls2/o;

.field public i:Ls2/C;

.field public j:Ls2/C;

.field public k:I

.field public l:LN1/B;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:I

.field public r:LL2/f;

.field public s:Z

.field public t:Z

.field public u:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ9/x;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, LJ9/x;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LL2/d;->v:LJ9/x;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    invoke-direct {p0, p1, v0, v1}, LL2/d;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    .line 3
    :cond_0
    iput p1, p0, LL2/d;->a:I

    .line 4
    iput-wide p2, p0, LL2/d;->b:J

    .line 5
    new-instance p1, LQ1/o;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    iput-object p1, p0, LL2/d;->c:LQ1/o;

    .line 6
    new-instance p1, LG5/L;

    const/4 p2, 0x1

    .line 7
    invoke-direct {p1, p2}, LG5/L;-><init>(I)V

    .line 8
    iput-object p1, p0, LL2/d;->d:LG5/L;

    .line 9
    new-instance p1, Ls2/s;

    invoke-direct {p1}, Ls2/s;-><init>()V

    iput-object p1, p0, LL2/d;->e:Ls2/s;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    iput-wide p1, p0, LL2/d;->m:J

    .line 11
    new-instance p1, LX2/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, LX2/a;-><init>(I)V

    iput-object p1, p0, LL2/d;->f:LX2/a;

    .line 12
    new-instance p1, Ls2/l;

    invoke-direct {p1}, Ls2/l;-><init>()V

    iput-object p1, p0, LL2/d;->g:Ls2/l;

    .line 13
    iput-object p1, p0, LL2/d;->j:Ls2/C;

    const-wide/16 p1, -0x1

    .line 14
    iput-wide p1, p0, LL2/d;->p:J

    return-void
.end method

.method public static b(LN1/B;)J
    .locals 6

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object p0, p0, LN1/B;->a:[LN1/A;

    .line 4
    .line 5
    array-length v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    aget-object v3, p0, v2

    .line 11
    .line 12
    instance-of v4, v3, LG2/o;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    check-cast v3, LG2/o;

    .line 17
    .line 18
    iget-object v4, v3, LG2/j;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-string v5, "TLEN"

    .line 21
    .line 22
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    iget-object p0, v3, LG2/o;->c:Ll8/K;

    .line 29
    .line 30
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v0, v1}, LQ1/x;->K(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0

    .line 45
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    return-wide v0
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, LL2/d;->k:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LL2/d;->m:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, LL2/d;->n:J

    .line 14
    .line 15
    iput p1, p0, LL2/d;->q:I

    .line 16
    .line 17
    iput-wide p3, p0, LL2/d;->u:J

    .line 18
    .line 19
    iget-object p1, p0, LL2/d;->r:LL2/f;

    .line 20
    .line 21
    instance-of p2, p1, LL2/b;

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    check-cast p1, LL2/b;

    .line 26
    .line 27
    iget-object p1, p1, LL2/b;->c:Ls2/u;

    .line 28
    .line 29
    iget-object p1, p1, Ls2/u;->b:LQ1/l;

    .line 30
    .line 31
    iget p2, p1, LQ1/l;->b:I

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sub-int/2addr p2, v0

    .line 38
    invoke-virtual {p1, p2}, LQ1/l;->c(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    sub-long/2addr p3, p1

    .line 43
    const-wide/32 p1, 0x186a0

    .line 44
    .line 45
    .line 46
    cmp-long p1, p3, p1

    .line 47
    .line 48
    if-gez p1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    iput-boolean v0, p0, LL2/d;->t:Z

    .line 52
    .line 53
    iget-object p1, p0, LL2/d;->g:Ls2/l;

    .line 54
    .line 55
    iput-object p1, p0, LL2/d;->j:Ls2/C;

    .line 56
    .line 57
    :cond_2
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    iget-object v0, p0, LL2/d;->r:LL2/f;

    .line 2
    .line 3
    instance-of v1, v0, LL2/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ls2/i;

    .line 8
    .line 9
    invoke-virtual {v0}, Ls2/i;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, LL2/d;->p:J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, LL2/d;->r:LL2/f;

    .line 24
    .line 25
    invoke-interface {v2}, LL2/f;->d()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, LL2/d;->r:LL2/f;

    .line 34
    .line 35
    check-cast v0, LL2/a;

    .line 36
    .line 37
    iget-wide v2, p0, LL2/d;->p:J

    .line 38
    .line 39
    new-instance v1, LL2/a;

    .line 40
    .line 41
    iget v7, v0, LL2/a;->j:I

    .line 42
    .line 43
    iget v6, v0, LL2/a;->i:I

    .line 44
    .line 45
    iget-boolean v8, v0, LL2/a;->k:Z

    .line 46
    .line 47
    iget-wide v4, v0, LL2/a;->h:J

    .line 48
    .line 49
    invoke-direct/range {v1 .. v8}, LL2/a;-><init>(JJIIZ)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, LL2/d;->r:LL2/f;

    .line 53
    .line 54
    iget-object v0, p0, LL2/d;->h:Ls2/o;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, LL2/d;->r:LL2/f;

    .line 60
    .line 61
    invoke-interface {v0, v1}, Ls2/o;->s(Ls2/w;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final d(Ls2/j;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LL2/d;->r:LL2/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, LL2/f;->d()J

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
    invoke-virtual {p1}, Ls2/j;->g()J

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
    iget-object v0, p0, LL2/d;->c:LQ1/o;

    .line 29
    .line 30
    iget-object v0, v0, LQ1/o;->a:[B

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-virtual {p1, v0, v2, v3, v1}, Ls2/j;->c([BIIZ)Z

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

.method public final e(Ls2/j;Z)Z
    .locals 16

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
    iput v3, v1, Ls2/j;->f:I

    .line 15
    .line 16
    iget-wide v4, v1, Ls2/j;->d:J

    .line 17
    .line 18
    const-wide/16 v6, 0x0

    .line 19
    .line 20
    cmp-long v4, v4, v6

    .line 21
    .line 22
    if-nez v4, :cond_4

    .line 23
    .line 24
    iget v4, v0, LL2/d;->a:I

    .line 25
    .line 26
    and-int/lit8 v4, v4, 0x8

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v4, LL2/d;->v:LJ9/x;

    .line 33
    .line 34
    :goto_1
    iget-object v5, v0, LL2/d;->f:LX2/a;

    .line 35
    .line 36
    invoke-virtual {v5, v1, v4}, LX2/a;->a(Ls2/j;LG2/g;)LN1/B;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iput-object v4, v0, LL2/d;->l:LN1/B;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    iget-object v5, v0, LL2/d;->e:Ls2/s;

    .line 45
    .line 46
    invoke-virtual {v5, v4}, Ls2/s;->b(LN1/B;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v1}, Ls2/j;->g()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    long-to-int v4, v4

    .line 54
    if-nez p2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Ls2/j;->j(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    move v5, v3

    .line 60
    :goto_2
    move v6, v5

    .line 61
    move v7, v6

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move v4, v3

    .line 64
    move v5, v4

    .line 65
    goto :goto_2

    .line 66
    :goto_3
    invoke-virtual/range {p0 .. p1}, LL2/d;->d(Ls2/j;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    const/4 v9, 0x1

    .line 71
    if-eqz v8, :cond_6

    .line 72
    .line 73
    if-lez v6, :cond_5

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_5
    invoke-virtual {v0}, LL2/d;->c()V

    .line 77
    .line 78
    .line 79
    new-instance v1, Ljava/io/EOFException;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 82
    .line 83
    .line 84
    throw v1

    .line 85
    :cond_6
    iget-object v8, v0, LL2/d;->c:LQ1/o;

    .line 86
    .line 87
    invoke-virtual {v8, v3}, LQ1/o;->G(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, LQ1/o;->h()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v5, :cond_7

    .line 95
    .line 96
    int-to-long v10, v5

    .line 97
    const v12, -0x1f400

    .line 98
    .line 99
    .line 100
    and-int/2addr v12, v8

    .line 101
    int-to-long v12, v12

    .line 102
    const-wide/32 v14, -0x1f400

    .line 103
    .line 104
    .line 105
    and-long/2addr v10, v14

    .line 106
    cmp-long v10, v12, v10

    .line 107
    .line 108
    if-nez v10, :cond_8

    .line 109
    .line 110
    :cond_7
    invoke-static {v8}, Ls2/a;->j(I)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    const/4 v11, -0x1

    .line 115
    if-ne v10, v11, :cond_c

    .line 116
    .line 117
    :cond_8
    add-int/lit8 v5, v7, 0x1

    .line 118
    .line 119
    if-ne v7, v2, :cond_a

    .line 120
    .line 121
    if-eqz p2, :cond_9

    .line 122
    .line 123
    return v3

    .line 124
    :cond_9
    invoke-virtual {v0}, LL2/d;->c()V

    .line 125
    .line 126
    .line 127
    new-instance v1, Ljava/io/EOFException;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw v1

    .line 133
    :cond_a
    if-eqz p2, :cond_b

    .line 134
    .line 135
    iput v3, v1, Ls2/j;->f:I

    .line 136
    .line 137
    add-int v6, v4, v5

    .line 138
    .line 139
    invoke-virtual {v1, v6, v3}, Ls2/j;->b(IZ)Z

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    invoke-virtual {v1, v9}, Ls2/j;->j(I)V

    .line 144
    .line 145
    .line 146
    :goto_4
    move v6, v3

    .line 147
    move v7, v5

    .line 148
    move v5, v6

    .line 149
    goto :goto_3

    .line 150
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    if-ne v6, v9, :cond_d

    .line 153
    .line 154
    iget-object v5, v0, LL2/d;->d:LG5/L;

    .line 155
    .line 156
    invoke-virtual {v5, v8}, LG5/L;->a(I)Z

    .line 157
    .line 158
    .line 159
    move v5, v8

    .line 160
    goto :goto_7

    .line 161
    :cond_d
    const/4 v8, 0x4

    .line 162
    if-ne v6, v8, :cond_f

    .line 163
    .line 164
    :goto_5
    if-eqz p2, :cond_e

    .line 165
    .line 166
    add-int/2addr v4, v7

    .line 167
    invoke-virtual {v1, v4}, Ls2/j;->j(I)V

    .line 168
    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_e
    iput v3, v1, Ls2/j;->f:I

    .line 172
    .line 173
    :goto_6
    iput v5, v0, LL2/d;->k:I

    .line 174
    .line 175
    return v9

    .line 176
    :cond_f
    :goto_7
    add-int/lit8 v10, v10, -0x4

    .line 177
    .line 178
    invoke-virtual {v1, v10, v3}, Ls2/j;->b(IZ)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iput-object p1, p0, LL2/d;->h:Ls2/o;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LL2/d;->i:Ls2/C;

    .line 10
    .line 11
    iput-object p1, p0, LL2/d;->j:Ls2/C;

    .line 12
    .line 13
    iget-object p1, p0, LL2/d;->h:Ls2/o;

    .line 14
    .line 15
    invoke-interface {p1}, Ls2/o;->l()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    check-cast p1, Ls2/j;

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, LL2/d;->e(Ls2/j;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, LL2/d;->i:Ls2/C;

    .line 9
    .line 10
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget v5, LQ1/x;->a:I

    .line 14
    .line 15
    iget v5, v0, LL2/d;->k:I

    .line 16
    .line 17
    iget-object v9, v0, LL2/d;->d:LG5/L;

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-nez v5, :cond_0

    .line 21
    .line 22
    :try_start_0
    move-object v5, v1

    .line 23
    check-cast v5, Ls2/j;

    .line 24
    .line 25
    invoke-virtual {v0, v5, v10}, LL2/d;->e(Ls2/j;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    const/4 v5, -0x1

    .line 30
    const/4 v10, -0x1

    .line 31
    const-wide/32 v16, 0xf4240

    .line 32
    .line 33
    .line 34
    goto/16 :goto_31

    .line 35
    .line 36
    :cond_0
    :goto_0
    iget-object v5, v0, LL2/d;->r:LL2/f;

    .line 37
    .line 38
    iget-object v11, v0, LL2/d;->c:LQ1/o;

    .line 39
    .line 40
    if-nez v5, :cond_35

    .line 41
    .line 42
    new-instance v5, LQ1/o;

    .line 43
    .line 44
    const-wide/32 v16, 0xf4240

    .line 45
    .line 46
    .line 47
    iget v7, v9, LG5/L;->d:I

    .line 48
    .line 49
    invoke-direct {v5, v7}, LQ1/o;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iget-object v7, v5, LQ1/o;->a:[B

    .line 53
    .line 54
    iget v8, v9, LG5/L;->d:I

    .line 55
    .line 56
    const-wide/16 v18, 0x0

    .line 57
    .line 58
    move-object v14, v1

    .line 59
    check-cast v14, Ls2/j;

    .line 60
    .line 61
    invoke-virtual {v14, v7, v10, v8, v10}, Ls2/j;->c([BIIZ)Z

    .line 62
    .line 63
    .line 64
    iget v7, v9, LG5/L;->b:I

    .line 65
    .line 66
    and-int/2addr v7, v4

    .line 67
    const/16 v8, 0x24

    .line 68
    .line 69
    if-eqz v7, :cond_2

    .line 70
    .line 71
    iget v7, v9, LG5/L;->f:I

    .line 72
    .line 73
    if-eq v7, v4, :cond_1

    .line 74
    .line 75
    move v7, v8

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    :goto_1
    const/16 v7, 0x15

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    iget v7, v9, LG5/L;->f:I

    .line 81
    .line 82
    if-eq v7, v4, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/16 v7, 0xd

    .line 86
    .line 87
    :goto_2
    iget v15, v5, LQ1/o;->c:I

    .line 88
    .line 89
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    add-int/lit8 v12, v7, 0x4

    .line 95
    .line 96
    const v13, 0x56425249

    .line 97
    .line 98
    .line 99
    const v6, 0x496e666f

    .line 100
    .line 101
    .line 102
    const v14, 0x58696e67

    .line 103
    .line 104
    .line 105
    if-lt v15, v12, :cond_4

    .line 106
    .line 107
    invoke-virtual {v5, v7}, LQ1/o;->G(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eq v7, v14, :cond_6

    .line 115
    .line 116
    if-ne v7, v6, :cond_4

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    iget v7, v5, LQ1/o;->c:I

    .line 120
    .line 121
    const/16 v12, 0x28

    .line 122
    .line 123
    if-lt v7, v12, :cond_5

    .line 124
    .line 125
    invoke-virtual {v5, v8}, LQ1/o;->G(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-ne v7, v13, :cond_5

    .line 133
    .line 134
    move v7, v13

    .line 135
    goto :goto_3

    .line 136
    :cond_5
    move v7, v10

    .line 137
    :cond_6
    :goto_3
    iget-object v8, v0, LL2/d;->e:Ls2/s;

    .line 138
    .line 139
    const-wide/16 v23, -0x1

    .line 140
    .line 141
    if-eq v7, v6, :cond_8

    .line 142
    .line 143
    if-eq v7, v13, :cond_9

    .line 144
    .line 145
    if-eq v7, v14, :cond_8

    .line 146
    .line 147
    move-object v5, v1

    .line 148
    check-cast v5, Ls2/j;

    .line 149
    .line 150
    iput v10, v5, Ls2/j;->f:I

    .line 151
    .line 152
    move/from16 v25, v10

    .line 153
    .line 154
    move-object/from16 v34, v11

    .line 155
    .line 156
    :cond_7
    :goto_4
    const/16 v37, 0x0

    .line 157
    .line 158
    goto/16 :goto_1c

    .line 159
    .line 160
    :cond_8
    move/from16 v25, v10

    .line 161
    .line 162
    move-object/from16 v34, v11

    .line 163
    .line 164
    goto/16 :goto_a

    .line 165
    .line 166
    :cond_9
    move-object v6, v1

    .line 167
    check-cast v6, Ls2/j;

    .line 168
    .line 169
    iget-wide v13, v6, Ls2/j;->d:J

    .line 170
    .line 171
    const/4 v7, 0x6

    .line 172
    invoke-virtual {v5, v7}, LQ1/o;->H(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    iget v15, v9, LG5/L;->d:I

    .line 180
    .line 181
    move-wide/from16 v25, v13

    .line 182
    .line 183
    int-to-long v12, v15

    .line 184
    add-long v12, v25, v12

    .line 185
    .line 186
    int-to-long v14, v7

    .line 187
    add-long/2addr v12, v14

    .line 188
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-gtz v7, :cond_a

    .line 193
    .line 194
    move/from16 v25, v10

    .line 195
    .line 196
    move-object/from16 v34, v11

    .line 197
    .line 198
    :goto_5
    const/16 v37, 0x0

    .line 199
    .line 200
    goto/16 :goto_9

    .line 201
    .line 202
    :cond_a
    iget v14, v9, LG5/L;->e:I

    .line 203
    .line 204
    move v15, v10

    .line 205
    move-object/from16 v34, v11

    .line 206
    .line 207
    int-to-long v10, v7

    .line 208
    const/16 v7, 0x7d00

    .line 209
    .line 210
    if-lt v14, v7, :cond_b

    .line 211
    .line 212
    const/16 v7, 0x480

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_b
    const/16 v7, 0x240

    .line 216
    .line 217
    :goto_6
    int-to-long v3, v7

    .line 218
    mul-long v29, v3, v16

    .line 219
    .line 220
    int-to-long v3, v14

    .line 221
    sget-object v33, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 222
    .line 223
    move-wide/from16 v31, v3

    .line 224
    .line 225
    move-wide/from16 v27, v10

    .line 226
    .line 227
    invoke-static/range {v27 .. v33}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 228
    .line 229
    .line 230
    move-result-wide v40

    .line 231
    invoke-virtual {v5}, LQ1/o;->A()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    invoke-virtual {v5}, LQ1/o;->A()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    invoke-virtual {v5}, LQ1/o;->A()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    invoke-virtual {v5, v2}, LQ1/o;->H(I)V

    .line 244
    .line 245
    .line 246
    iget v10, v9, LG5/L;->d:I

    .line 247
    .line 248
    int-to-long v10, v10

    .line 249
    add-long v10, v25, v10

    .line 250
    .line 251
    new-array v14, v3, [J

    .line 252
    .line 253
    move/from16 v25, v15

    .line 254
    .line 255
    new-array v15, v3, [J

    .line 256
    .line 257
    move/from16 v2, v25

    .line 258
    .line 259
    :goto_7
    if-ge v2, v3, :cond_10

    .line 260
    .line 261
    move-object/from16 v38, v14

    .line 262
    .line 263
    move-object/from16 v39, v15

    .line 264
    .line 265
    int-to-long v14, v2

    .line 266
    mul-long v14, v14, v40

    .line 267
    .line 268
    move-wide/from16 v27, v14

    .line 269
    .line 270
    int-to-long v14, v3

    .line 271
    div-long v14, v27, v14

    .line 272
    .line 273
    aput-wide v14, v38, v2

    .line 274
    .line 275
    aput-wide v10, v39, v2

    .line 276
    .line 277
    const/4 v14, 0x1

    .line 278
    if-eq v7, v14, :cond_f

    .line 279
    .line 280
    const/4 v14, 0x2

    .line 281
    if-eq v7, v14, :cond_e

    .line 282
    .line 283
    const/4 v14, 0x3

    .line 284
    if-eq v7, v14, :cond_d

    .line 285
    .line 286
    const/4 v14, 0x4

    .line 287
    if-eq v7, v14, :cond_c

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_c
    invoke-virtual {v5}, LQ1/o;->y()I

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    goto :goto_8

    .line 295
    :cond_d
    invoke-virtual {v5}, LQ1/o;->x()I

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    goto :goto_8

    .line 300
    :cond_e
    invoke-virtual {v5}, LQ1/o;->A()I

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    goto :goto_8

    .line 305
    :cond_f
    invoke-virtual {v5}, LQ1/o;->u()I

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    :goto_8
    int-to-long v14, v14

    .line 310
    move/from16 v27, v2

    .line 311
    .line 312
    move/from16 v22, v3

    .line 313
    .line 314
    int-to-long v2, v4

    .line 315
    mul-long/2addr v14, v2

    .line 316
    add-long/2addr v10, v14

    .line 317
    const/16 v36, 0x1

    .line 318
    .line 319
    add-int/lit8 v2, v27, 0x1

    .line 320
    .line 321
    move/from16 v3, v22

    .line 322
    .line 323
    move-object/from16 v14, v38

    .line 324
    .line 325
    move-object/from16 v15, v39

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_10
    move-object/from16 v38, v14

    .line 329
    .line 330
    move-object/from16 v39, v15

    .line 331
    .line 332
    iget-wide v2, v6, Ls2/j;->c:J

    .line 333
    .line 334
    cmp-long v4, v2, v23

    .line 335
    .line 336
    const-string v5, ", "

    .line 337
    .line 338
    const-string v7, "VbriSeeker"

    .line 339
    .line 340
    if-eqz v4, :cond_11

    .line 341
    .line 342
    cmp-long v4, v2, v12

    .line 343
    .line 344
    if-eqz v4, :cond_11

    .line 345
    .line 346
    const-string v4, "VBRI data size mismatch: "

    .line 347
    .line 348
    invoke-static {v2, v3, v4, v5}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-static {v7, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    :cond_11
    cmp-long v2, v12, v10

    .line 363
    .line 364
    if-eqz v2, :cond_12

    .line 365
    .line 366
    const-string v2, "VBRI bytes and ToC mismatch (using max): "

    .line 367
    .line 368
    invoke-static {v12, v13, v2, v5}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    const-string v3, "\nSeeking will be inaccurate."

    .line 376
    .line 377
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v7, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 388
    .line 389
    .line 390
    move-result-wide v12

    .line 391
    :cond_12
    move-wide/from16 v42, v12

    .line 392
    .line 393
    new-instance v37, LL2/g;

    .line 394
    .line 395
    iget v2, v9, LG5/L;->g:I

    .line 396
    .line 397
    move/from16 v44, v2

    .line 398
    .line 399
    invoke-direct/range {v37 .. v44}, LL2/g;-><init>([J[JJJI)V

    .line 400
    .line 401
    .line 402
    :goto_9
    iget v2, v9, LG5/L;->d:I

    .line 403
    .line 404
    invoke-virtual {v6, v2}, Ls2/j;->j(I)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_1c

    .line 408
    .line 409
    :goto_a
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    const/16 v36, 0x1

    .line 414
    .line 415
    and-int/lit8 v3, v2, 0x1

    .line 416
    .line 417
    if-eqz v3, :cond_13

    .line 418
    .line 419
    invoke-virtual {v5}, LQ1/o;->y()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    :goto_b
    const/16 v26, 0x2

    .line 424
    .line 425
    goto :goto_c

    .line 426
    :cond_13
    const/4 v3, -0x1

    .line 427
    goto :goto_b

    .line 428
    :goto_c
    and-int/lit8 v4, v2, 0x2

    .line 429
    .line 430
    if-eqz v4, :cond_14

    .line 431
    .line 432
    invoke-virtual {v5}, LQ1/o;->w()J

    .line 433
    .line 434
    .line 435
    move-result-wide v10

    .line 436
    move-wide/from16 v44, v10

    .line 437
    .line 438
    :goto_d
    const/4 v4, 0x4

    .line 439
    goto :goto_e

    .line 440
    :cond_14
    move-wide/from16 v44, v23

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :goto_e
    and-int/lit8 v6, v2, 0x4

    .line 444
    .line 445
    if-ne v6, v4, :cond_16

    .line 446
    .line 447
    const/16 v4, 0x64

    .line 448
    .line 449
    new-array v6, v4, [J

    .line 450
    .line 451
    move/from16 v15, v25

    .line 452
    .line 453
    :goto_f
    if-ge v15, v4, :cond_15

    .line 454
    .line 455
    invoke-virtual {v5}, LQ1/o;->u()I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    int-to-long v10, v10

    .line 460
    aput-wide v10, v6, v15

    .line 461
    .line 462
    const/16 v36, 0x1

    .line 463
    .line 464
    add-int/lit8 v15, v15, 0x1

    .line 465
    .line 466
    goto :goto_f

    .line 467
    :cond_15
    move-object/from16 v46, v6

    .line 468
    .line 469
    goto :goto_10

    .line 470
    :cond_16
    const/16 v46, 0x0

    .line 471
    .line 472
    :goto_10
    and-int/lit8 v2, v2, 0x8

    .line 473
    .line 474
    if-eqz v2, :cond_17

    .line 475
    .line 476
    const/4 v4, 0x4

    .line 477
    invoke-virtual {v5, v4}, LQ1/o;->H(I)V

    .line 478
    .line 479
    .line 480
    :cond_17
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    const/16 v4, 0x18

    .line 485
    .line 486
    if-lt v2, v4, :cond_18

    .line 487
    .line 488
    const/16 v2, 0x15

    .line 489
    .line 490
    invoke-virtual {v5, v2}, LQ1/o;->H(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v5}, LQ1/o;->x()I

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    const v4, 0xfff000

    .line 498
    .line 499
    .line 500
    and-int/2addr v4, v2

    .line 501
    shr-int/lit8 v4, v4, 0xc

    .line 502
    .line 503
    and-int/lit16 v2, v2, 0xfff

    .line 504
    .line 505
    goto :goto_11

    .line 506
    :cond_18
    const/4 v2, -0x1

    .line 507
    const/4 v4, -0x1

    .line 508
    :goto_11
    int-to-long v5, v3

    .line 509
    iget v3, v9, LG5/L;->d:I

    .line 510
    .line 511
    iget v10, v9, LG5/L;->e:I

    .line 512
    .line 513
    iget v11, v9, LG5/L;->g:I

    .line 514
    .line 515
    iget v12, v9, LG5/L;->h:I

    .line 516
    .line 517
    iget v13, v8, Ls2/s;->a:I

    .line 518
    .line 519
    const/4 v15, -0x1

    .line 520
    if-eq v13, v15, :cond_19

    .line 521
    .line 522
    iget v13, v8, Ls2/s;->b:I

    .line 523
    .line 524
    if-eq v13, v15, :cond_19

    .line 525
    .line 526
    goto :goto_12

    .line 527
    :cond_19
    if-eq v4, v15, :cond_1a

    .line 528
    .line 529
    if-eq v2, v15, :cond_1a

    .line 530
    .line 531
    iput v4, v8, Ls2/s;->a:I

    .line 532
    .line 533
    iput v2, v8, Ls2/s;->b:I

    .line 534
    .line 535
    :cond_1a
    :goto_12
    move-object v2, v1

    .line 536
    check-cast v2, Ls2/j;

    .line 537
    .line 538
    iget-wide v14, v2, Ls2/j;->d:J

    .line 539
    .line 540
    move-wide/from16 v27, v5

    .line 541
    .line 542
    iget-wide v4, v2, Ls2/j;->c:J

    .line 543
    .line 544
    cmp-long v13, v4, v23

    .line 545
    .line 546
    if-eqz v13, :cond_1c

    .line 547
    .line 548
    cmp-long v13, v44, v23

    .line 549
    .line 550
    if-eqz v13, :cond_1c

    .line 551
    .line 552
    move v13, v7

    .line 553
    add-long v6, v14, v44

    .line 554
    .line 555
    cmp-long v29, v4, v6

    .line 556
    .line 557
    move/from16 v40, v3

    .line 558
    .line 559
    if-eqz v29, :cond_1b

    .line 560
    .line 561
    const-string v3, "Data size mismatch between stream ("

    .line 562
    .line 563
    move/from16 v43, v11

    .line 564
    .line 565
    const-string v11, ") and Xing frame ("

    .line 566
    .line 567
    invoke-static {v4, v5, v3, v11}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    const-string v6, "), using Xing value."

    .line 575
    .line 576
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    const-string v6, "Mp3Extractor"

    .line 584
    .line 585
    invoke-static {v6, v3}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto :goto_14

    .line 589
    :cond_1b
    :goto_13
    move/from16 v43, v11

    .line 590
    .line 591
    goto :goto_14

    .line 592
    :cond_1c
    move/from16 v40, v3

    .line 593
    .line 594
    move v13, v7

    .line 595
    goto :goto_13

    .line 596
    :goto_14
    iget v3, v9, LG5/L;->d:I

    .line 597
    .line 598
    invoke-virtual {v2, v3}, Ls2/j;->j(I)V

    .line 599
    .line 600
    .line 601
    const-wide/16 v2, 0x1

    .line 602
    .line 603
    const v6, 0x58696e67

    .line 604
    .line 605
    .line 606
    if-ne v13, v6, :cond_22

    .line 607
    .line 608
    cmp-long v4, v27, v23

    .line 609
    .line 610
    if-eqz v4, :cond_1e

    .line 611
    .line 612
    cmp-long v4, v27, v18

    .line 613
    .line 614
    if-nez v4, :cond_1d

    .line 615
    .line 616
    goto :goto_15

    .line 617
    :cond_1d
    int-to-long v4, v12

    .line 618
    mul-long v5, v27, v4

    .line 619
    .line 620
    sub-long/2addr v5, v2

    .line 621
    invoke-static {v10, v5, v6}, LQ1/x;->Q(IJ)J

    .line 622
    .line 623
    .line 624
    move-result-wide v2

    .line 625
    move-wide/from16 v51, v2

    .line 626
    .line 627
    goto :goto_16

    .line 628
    :cond_1e
    :goto_15
    move-wide/from16 v51, v20

    .line 629
    .line 630
    :goto_16
    cmp-long v2, v51, v20

    .line 631
    .line 632
    if-nez v2, :cond_1f

    .line 633
    .line 634
    goto/16 :goto_4

    .line 635
    .line 636
    :cond_1f
    cmp-long v2, v44, v23

    .line 637
    .line 638
    if-eqz v2, :cond_20

    .line 639
    .line 640
    if-nez v46, :cond_21

    .line 641
    .line 642
    :cond_20
    move-wide/from16 v48, v14

    .line 643
    .line 644
    goto :goto_17

    .line 645
    :cond_21
    new-instance v37, LL2/h;

    .line 646
    .line 647
    move-wide/from16 v38, v14

    .line 648
    .line 649
    move-wide/from16 v41, v51

    .line 650
    .line 651
    invoke-direct/range {v37 .. v46}, LL2/h;-><init>(JIJIJ[J)V

    .line 652
    .line 653
    .line 654
    goto/16 :goto_1c

    .line 655
    .line 656
    :goto_17
    new-instance v47, LL2/h;

    .line 657
    .line 658
    const-wide/16 v54, -0x1

    .line 659
    .line 660
    const/16 v56, 0x0

    .line 661
    .line 662
    move/from16 v50, v40

    .line 663
    .line 664
    move/from16 v53, v43

    .line 665
    .line 666
    invoke-direct/range {v47 .. v56}, LL2/h;-><init>(JIJIJ[J)V

    .line 667
    .line 668
    .line 669
    move-object/from16 v37, v47

    .line 670
    .line 671
    goto :goto_1c

    .line 672
    :cond_22
    move-wide/from16 v48, v14

    .line 673
    .line 674
    move/from16 v6, v40

    .line 675
    .line 676
    cmp-long v7, v27, v23

    .line 677
    .line 678
    if-eqz v7, :cond_24

    .line 679
    .line 680
    cmp-long v7, v27, v18

    .line 681
    .line 682
    if-nez v7, :cond_23

    .line 683
    .line 684
    goto :goto_18

    .line 685
    :cond_23
    int-to-long v11, v12

    .line 686
    mul-long v11, v11, v27

    .line 687
    .line 688
    sub-long/2addr v11, v2

    .line 689
    invoke-static {v10, v11, v12}, LQ1/x;->Q(IJ)J

    .line 690
    .line 691
    .line 692
    move-result-wide v2

    .line 693
    move-wide/from16 v41, v2

    .line 694
    .line 695
    goto :goto_19

    .line 696
    :cond_24
    :goto_18
    move-wide/from16 v41, v20

    .line 697
    .line 698
    :goto_19
    cmp-long v2, v41, v20

    .line 699
    .line 700
    if-nez v2, :cond_25

    .line 701
    .line 702
    goto/16 :goto_4

    .line 703
    .line 704
    :cond_25
    cmp-long v2, v44, v23

    .line 705
    .line 706
    if-eqz v2, :cond_26

    .line 707
    .line 708
    add-long v4, v48, v44

    .line 709
    .line 710
    int-to-long v2, v6

    .line 711
    sub-long v44, v44, v2

    .line 712
    .line 713
    :goto_1a
    move-wide/from16 v51, v4

    .line 714
    .line 715
    move-wide/from16 v37, v44

    .line 716
    .line 717
    goto :goto_1b

    .line 718
    :cond_26
    cmp-long v2, v4, v23

    .line 719
    .line 720
    if-eqz v2, :cond_7

    .line 721
    .line 722
    sub-long v2, v4, v48

    .line 723
    .line 724
    int-to-long v10, v6

    .line 725
    sub-long v44, v2, v10

    .line 726
    .line 727
    goto :goto_1a

    .line 728
    :goto_1b
    sget-object v43, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 729
    .line 730
    const-wide/32 v39, 0x7a1200

    .line 731
    .line 732
    .line 733
    invoke-static/range {v37 .. v43}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 734
    .line 735
    .line 736
    move-result-wide v2

    .line 737
    move-wide/from16 v4, v37

    .line 738
    .line 739
    move-object/from16 v7, v43

    .line 740
    .line 741
    invoke-static {v2, v3}, LS3/f;->l(J)I

    .line 742
    .line 743
    .line 744
    move-result v55

    .line 745
    move-wide/from16 v2, v27

    .line 746
    .line 747
    invoke-static {v4, v5, v2, v3, v7}, LA6/h;->t(JJLjava/math/RoundingMode;)J

    .line 748
    .line 749
    .line 750
    move-result-wide v2

    .line 751
    invoke-static {v2, v3}, LS3/f;->l(J)I

    .line 752
    .line 753
    .line 754
    move-result v56

    .line 755
    new-instance v50, LL2/a;

    .line 756
    .line 757
    int-to-long v2, v6

    .line 758
    add-long v53, v48, v2

    .line 759
    .line 760
    const/16 v57, 0x0

    .line 761
    .line 762
    invoke-direct/range {v50 .. v57}, LL2/a;-><init>(JJIIZ)V

    .line 763
    .line 764
    .line 765
    move-object/from16 v37, v50

    .line 766
    .line 767
    :goto_1c
    iget-object v2, v0, LL2/d;->l:LN1/B;

    .line 768
    .line 769
    move-object v3, v1

    .line 770
    check-cast v3, Ls2/j;

    .line 771
    .line 772
    iget-wide v4, v3, Ls2/j;->d:J

    .line 773
    .line 774
    if-eqz v2, :cond_29

    .line 775
    .line 776
    iget-object v6, v2, LN1/B;->a:[LN1/A;

    .line 777
    .line 778
    array-length v7, v6

    .line 779
    move/from16 v15, v25

    .line 780
    .line 781
    :goto_1d
    if-ge v15, v7, :cond_29

    .line 782
    .line 783
    aget-object v10, v6, v15

    .line 784
    .line 785
    instance-of v11, v10, LG2/m;

    .line 786
    .line 787
    if-eqz v11, :cond_28

    .line 788
    .line 789
    check-cast v10, LG2/m;

    .line 790
    .line 791
    invoke-static {v2}, LL2/d;->b(LN1/B;)J

    .line 792
    .line 793
    .line 794
    move-result-wide v6

    .line 795
    iget-object v2, v10, LG2/m;->e:[I

    .line 796
    .line 797
    array-length v2, v2

    .line 798
    const/16 v36, 0x1

    .line 799
    .line 800
    add-int/lit8 v11, v2, 0x1

    .line 801
    .line 802
    new-array v12, v11, [J

    .line 803
    .line 804
    new-array v11, v11, [J

    .line 805
    .line 806
    aput-wide v4, v12, v25

    .line 807
    .line 808
    aput-wide v18, v11, v25

    .line 809
    .line 810
    move-wide/from16 v14, v18

    .line 811
    .line 812
    move/from16 v13, v36

    .line 813
    .line 814
    :goto_1e
    if-gt v13, v2, :cond_27

    .line 815
    .line 816
    add-int/lit8 v22, v13, -0x1

    .line 817
    .line 818
    move/from16 v27, v2

    .line 819
    .line 820
    iget-object v2, v10, LG2/m;->e:[I

    .line 821
    .line 822
    aget v2, v2, v22

    .line 823
    .line 824
    move/from16 v28, v2

    .line 825
    .line 826
    iget v2, v10, LG2/m;->c:I

    .line 827
    .line 828
    add-int v2, v2, v28

    .line 829
    .line 830
    move-wide/from16 v28, v4

    .line 831
    .line 832
    int-to-long v4, v2

    .line 833
    add-long v4, v28, v4

    .line 834
    .line 835
    iget-object v2, v10, LG2/m;->f:[I

    .line 836
    .line 837
    aget v2, v2, v22

    .line 838
    .line 839
    move/from16 v22, v2

    .line 840
    .line 841
    iget v2, v10, LG2/m;->d:I

    .line 842
    .line 843
    add-int v2, v2, v22

    .line 844
    .line 845
    move-wide/from16 v28, v4

    .line 846
    .line 847
    int-to-long v4, v2

    .line 848
    add-long/2addr v14, v4

    .line 849
    aput-wide v28, v12, v13

    .line 850
    .line 851
    aput-wide v14, v11, v13

    .line 852
    .line 853
    const/16 v36, 0x1

    .line 854
    .line 855
    add-int/lit8 v13, v13, 0x1

    .line 856
    .line 857
    move/from16 v2, v27

    .line 858
    .line 859
    move-wide/from16 v4, v28

    .line 860
    .line 861
    goto :goto_1e

    .line 862
    :cond_27
    new-instance v2, LL2/c;

    .line 863
    .line 864
    invoke-direct {v2, v12, v11, v6, v7}, LL2/c;-><init>([J[JJ)V

    .line 865
    .line 866
    .line 867
    goto :goto_1f

    .line 868
    :cond_28
    const/16 v36, 0x1

    .line 869
    .line 870
    add-int/lit8 v15, v15, 0x1

    .line 871
    .line 872
    goto :goto_1d

    .line 873
    :cond_29
    const/4 v2, 0x0

    .line 874
    :goto_1f
    iget-boolean v4, v0, LL2/d;->s:Z

    .line 875
    .line 876
    iget v5, v0, LL2/d;->a:I

    .line 877
    .line 878
    if-eqz v4, :cond_2a

    .line 879
    .line 880
    new-instance v2, LL2/e;

    .line 881
    .line 882
    move-wide/from16 v6, v20

    .line 883
    .line 884
    invoke-direct {v2, v6, v7}, Ls2/q;-><init>(J)V

    .line 885
    .line 886
    .line 887
    move-object v4, v2

    .line 888
    move-object/from16 v2, v34

    .line 889
    .line 890
    goto/16 :goto_26

    .line 891
    .line 892
    :cond_2a
    const/16 v35, 0x4

    .line 893
    .line 894
    and-int/lit8 v4, v5, 0x4

    .line 895
    .line 896
    if-eqz v4, :cond_2d

    .line 897
    .line 898
    if-eqz v2, :cond_2b

    .line 899
    .line 900
    iget-wide v6, v2, LL2/c;->c:J

    .line 901
    .line 902
    :goto_20
    move-wide/from16 v28, v6

    .line 903
    .line 904
    move-wide/from16 v32, v23

    .line 905
    .line 906
    goto :goto_21

    .line 907
    :cond_2b
    if-eqz v37, :cond_2c

    .line 908
    .line 909
    invoke-interface/range {v37 .. v37}, Ls2/w;->f()J

    .line 910
    .line 911
    .line 912
    move-result-wide v6

    .line 913
    invoke-interface/range {v37 .. v37}, LL2/f;->d()J

    .line 914
    .line 915
    .line 916
    move-result-wide v23

    .line 917
    goto :goto_20

    .line 918
    :cond_2c
    iget-object v2, v0, LL2/d;->l:LN1/B;

    .line 919
    .line 920
    invoke-static {v2}, LL2/d;->b(LN1/B;)J

    .line 921
    .line 922
    .line 923
    move-result-wide v6

    .line 924
    goto :goto_20

    .line 925
    :goto_21
    new-instance v27, LL2/b;

    .line 926
    .line 927
    iget-wide v6, v3, Ls2/j;->d:J

    .line 928
    .line 929
    move-wide/from16 v30, v6

    .line 930
    .line 931
    invoke-direct/range {v27 .. v33}, LL2/b;-><init>(JJJ)V

    .line 932
    .line 933
    .line 934
    move-object/from16 v37, v27

    .line 935
    .line 936
    goto :goto_22

    .line 937
    :cond_2d
    if-eqz v2, :cond_2e

    .line 938
    .line 939
    move-object/from16 v37, v2

    .line 940
    .line 941
    goto :goto_22

    .line 942
    :cond_2e
    if-eqz v37, :cond_2f

    .line 943
    .line 944
    goto :goto_22

    .line 945
    :cond_2f
    const/16 v37, 0x0

    .line 946
    .line 947
    :goto_22
    if-eqz v37, :cond_30

    .line 948
    .line 949
    invoke-interface/range {v37 .. v37}, Ls2/w;->e()Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-nez v2, :cond_31

    .line 954
    .line 955
    const/16 v36, 0x1

    .line 956
    .line 957
    and-int/lit8 v2, v5, 0x1

    .line 958
    .line 959
    if-eqz v2, :cond_31

    .line 960
    .line 961
    :cond_30
    const/16 v26, 0x2

    .line 962
    .line 963
    goto :goto_23

    .line 964
    :cond_31
    move-object/from16 v2, v34

    .line 965
    .line 966
    move-object/from16 v4, v37

    .line 967
    .line 968
    goto :goto_26

    .line 969
    :goto_23
    and-int/lit8 v2, v5, 0x2

    .line 970
    .line 971
    if-eqz v2, :cond_32

    .line 972
    .line 973
    const/16 v33, 0x1

    .line 974
    .line 975
    :goto_24
    move-object/from16 v2, v34

    .line 976
    .line 977
    goto :goto_25

    .line 978
    :cond_32
    move/from16 v33, v25

    .line 979
    .line 980
    goto :goto_24

    .line 981
    :goto_25
    iget-object v4, v2, LQ1/o;->a:[B

    .line 982
    .line 983
    move/from16 v15, v25

    .line 984
    .line 985
    const/4 v14, 0x4

    .line 986
    invoke-virtual {v3, v4, v15, v14, v15}, Ls2/j;->c([BIIZ)Z

    .line 987
    .line 988
    .line 989
    invoke-virtual {v2, v15}, LQ1/o;->G(I)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 993
    .line 994
    .line 995
    move-result v4

    .line 996
    invoke-virtual {v9, v4}, LG5/L;->a(I)Z

    .line 997
    .line 998
    .line 999
    new-instance v26, LL2/a;

    .line 1000
    .line 1001
    iget-wide v6, v3, Ls2/j;->d:J

    .line 1002
    .line 1003
    iget v4, v9, LG5/L;->g:I

    .line 1004
    .line 1005
    iget v10, v9, LG5/L;->d:I

    .line 1006
    .line 1007
    iget-wide v11, v3, Ls2/j;->c:J

    .line 1008
    .line 1009
    move/from16 v31, v4

    .line 1010
    .line 1011
    move-wide/from16 v29, v6

    .line 1012
    .line 1013
    move/from16 v32, v10

    .line 1014
    .line 1015
    move-wide/from16 v27, v11

    .line 1016
    .line 1017
    invoke-direct/range {v26 .. v33}, LL2/a;-><init>(JJIIZ)V

    .line 1018
    .line 1019
    .line 1020
    move-object/from16 v4, v26

    .line 1021
    .line 1022
    :goto_26
    iput-object v4, v0, LL2/d;->r:LL2/f;

    .line 1023
    .line 1024
    iget-object v6, v0, LL2/d;->h:Ls2/o;

    .line 1025
    .line 1026
    invoke-interface {v6, v4}, Ls2/o;->s(Ls2/w;)V

    .line 1027
    .line 1028
    .line 1029
    new-instance v4, LN1/m;

    .line 1030
    .line 1031
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    iget-object v6, v9, LG5/L;->c:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    iput-object v6, v4, LN1/m;->m:Ljava/lang/String;

    .line 1041
    .line 1042
    const/16 v6, 0x1000

    .line 1043
    .line 1044
    iput v6, v4, LN1/m;->n:I

    .line 1045
    .line 1046
    iget v6, v9, LG5/L;->f:I

    .line 1047
    .line 1048
    iput v6, v4, LN1/m;->B:I

    .line 1049
    .line 1050
    iget v6, v9, LG5/L;->e:I

    .line 1051
    .line 1052
    iput v6, v4, LN1/m;->C:I

    .line 1053
    .line 1054
    iget v6, v8, Ls2/s;->a:I

    .line 1055
    .line 1056
    iput v6, v4, LN1/m;->E:I

    .line 1057
    .line 1058
    iget v6, v8, Ls2/s;->b:I

    .line 1059
    .line 1060
    iput v6, v4, LN1/m;->F:I

    .line 1061
    .line 1062
    and-int/lit8 v5, v5, 0x8

    .line 1063
    .line 1064
    if-eqz v5, :cond_33

    .line 1065
    .line 1066
    const/4 v12, 0x0

    .line 1067
    goto :goto_27

    .line 1068
    :cond_33
    iget-object v12, v0, LL2/d;->l:LN1/B;

    .line 1069
    .line 1070
    :goto_27
    iput-object v12, v4, LN1/m;->k:LN1/B;

    .line 1071
    .line 1072
    iget-object v5, v0, LL2/d;->r:LL2/f;

    .line 1073
    .line 1074
    invoke-interface {v5}, LL2/f;->l()I

    .line 1075
    .line 1076
    .line 1077
    move-result v5

    .line 1078
    const v6, -0x7fffffff

    .line 1079
    .line 1080
    .line 1081
    if-eq v5, v6, :cond_34

    .line 1082
    .line 1083
    iget-object v5, v0, LL2/d;->r:LL2/f;

    .line 1084
    .line 1085
    invoke-interface {v5}, LL2/f;->l()I

    .line 1086
    .line 1087
    .line 1088
    move-result v5

    .line 1089
    iput v5, v4, LN1/m;->h:I

    .line 1090
    .line 1091
    :cond_34
    iget-object v5, v0, LL2/d;->j:Ls2/C;

    .line 1092
    .line 1093
    invoke-static {v4, v5}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 1094
    .line 1095
    .line 1096
    iget-wide v3, v3, Ls2/j;->d:J

    .line 1097
    .line 1098
    iput-wide v3, v0, LL2/d;->o:J

    .line 1099
    .line 1100
    goto :goto_28

    .line 1101
    :cond_35
    move-object v2, v11

    .line 1102
    const-wide/32 v16, 0xf4240

    .line 1103
    .line 1104
    .line 1105
    const-wide/16 v18, 0x0

    .line 1106
    .line 1107
    iget-wide v3, v0, LL2/d;->o:J

    .line 1108
    .line 1109
    cmp-long v5, v3, v18

    .line 1110
    .line 1111
    if-eqz v5, :cond_36

    .line 1112
    .line 1113
    move-object v5, v1

    .line 1114
    check-cast v5, Ls2/j;

    .line 1115
    .line 1116
    iget-wide v5, v5, Ls2/j;->d:J

    .line 1117
    .line 1118
    cmp-long v7, v5, v3

    .line 1119
    .line 1120
    if-gez v7, :cond_36

    .line 1121
    .line 1122
    sub-long/2addr v3, v5

    .line 1123
    long-to-int v3, v3

    .line 1124
    move-object v4, v1

    .line 1125
    check-cast v4, Ls2/j;

    .line 1126
    .line 1127
    invoke-virtual {v4, v3}, Ls2/j;->j(I)V

    .line 1128
    .line 1129
    .line 1130
    :cond_36
    :goto_28
    iget v3, v0, LL2/d;->q:I

    .line 1131
    .line 1132
    if-nez v3, :cond_3d

    .line 1133
    .line 1134
    move-object v3, v1

    .line 1135
    check-cast v3, Ls2/j;

    .line 1136
    .line 1137
    const/4 v15, 0x0

    .line 1138
    iput v15, v3, Ls2/j;->f:I

    .line 1139
    .line 1140
    move-object v3, v1

    .line 1141
    check-cast v3, Ls2/j;

    .line 1142
    .line 1143
    invoke-virtual {v0, v3}, LL2/d;->d(Ls2/j;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v4

    .line 1147
    if-eqz v4, :cond_37

    .line 1148
    .line 1149
    goto/16 :goto_30

    .line 1150
    .line 1151
    :cond_37
    invoke-virtual {v2, v15}, LQ1/o;->G(I)V

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 1155
    .line 1156
    .line 1157
    move-result v2

    .line 1158
    iget v4, v0, LL2/d;->k:I

    .line 1159
    .line 1160
    int-to-long v4, v4

    .line 1161
    const v6, -0x1f400

    .line 1162
    .line 1163
    .line 1164
    and-int/2addr v6, v2

    .line 1165
    int-to-long v6, v6

    .line 1166
    const-wide/32 v10, -0x1f400

    .line 1167
    .line 1168
    .line 1169
    and-long/2addr v4, v10

    .line 1170
    cmp-long v4, v6, v4

    .line 1171
    .line 1172
    if-nez v4, :cond_3f

    .line 1173
    .line 1174
    invoke-static {v2}, Ls2/a;->j(I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v4

    .line 1178
    const/4 v5, -0x1

    .line 1179
    if-ne v4, v5, :cond_38

    .line 1180
    .line 1181
    const/4 v14, 0x1

    .line 1182
    const/4 v15, 0x0

    .line 1183
    goto/16 :goto_2d

    .line 1184
    .line 1185
    :cond_38
    invoke-virtual {v9, v2}, LG5/L;->a(I)Z

    .line 1186
    .line 1187
    .line 1188
    iget-wide v4, v0, LL2/d;->m:J

    .line 1189
    .line 1190
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    cmp-long v2, v4, v20

    .line 1196
    .line 1197
    if-nez v2, :cond_39

    .line 1198
    .line 1199
    iget-object v2, v0, LL2/d;->r:LL2/f;

    .line 1200
    .line 1201
    iget-wide v4, v3, Ls2/j;->d:J

    .line 1202
    .line 1203
    invoke-interface {v2, v4, v5}, LL2/f;->b(J)J

    .line 1204
    .line 1205
    .line 1206
    move-result-wide v4

    .line 1207
    iput-wide v4, v0, LL2/d;->m:J

    .line 1208
    .line 1209
    iget-wide v4, v0, LL2/d;->b:J

    .line 1210
    .line 1211
    cmp-long v2, v4, v20

    .line 1212
    .line 1213
    if-eqz v2, :cond_39

    .line 1214
    .line 1215
    iget-object v2, v0, LL2/d;->r:LL2/f;

    .line 1216
    .line 1217
    move-wide/from16 v6, v18

    .line 1218
    .line 1219
    invoke-interface {v2, v6, v7}, LL2/f;->b(J)J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v6

    .line 1223
    iget-wide v10, v0, LL2/d;->m:J

    .line 1224
    .line 1225
    sub-long/2addr v4, v6

    .line 1226
    add-long/2addr v4, v10

    .line 1227
    iput-wide v4, v0, LL2/d;->m:J

    .line 1228
    .line 1229
    :cond_39
    iget v2, v9, LG5/L;->d:I

    .line 1230
    .line 1231
    iput v2, v0, LL2/d;->q:I

    .line 1232
    .line 1233
    iget-wide v3, v3, Ls2/j;->d:J

    .line 1234
    .line 1235
    int-to-long v5, v2

    .line 1236
    add-long/2addr v3, v5

    .line 1237
    iput-wide v3, v0, LL2/d;->p:J

    .line 1238
    .line 1239
    iget-object v2, v0, LL2/d;->r:LL2/f;

    .line 1240
    .line 1241
    instance-of v5, v2, LL2/b;

    .line 1242
    .line 1243
    if-eqz v5, :cond_3e

    .line 1244
    .line 1245
    check-cast v2, LL2/b;

    .line 1246
    .line 1247
    iget-wide v5, v0, LL2/d;->n:J

    .line 1248
    .line 1249
    iget v7, v9, LG5/L;->h:I

    .line 1250
    .line 1251
    int-to-long v7, v7

    .line 1252
    add-long/2addr v5, v7

    .line 1253
    iget-wide v7, v0, LL2/d;->m:J

    .line 1254
    .line 1255
    mul-long v5, v5, v16

    .line 1256
    .line 1257
    iget v10, v9, LG5/L;->e:I

    .line 1258
    .line 1259
    int-to-long v10, v10

    .line 1260
    div-long/2addr v5, v10

    .line 1261
    add-long/2addr v5, v7

    .line 1262
    iget-object v7, v2, LL2/b;->c:Ls2/u;

    .line 1263
    .line 1264
    iget-object v7, v7, Ls2/u;->b:LQ1/l;

    .line 1265
    .line 1266
    iget v8, v7, LQ1/l;->b:I

    .line 1267
    .line 1268
    const-wide/32 v10, 0x186a0

    .line 1269
    .line 1270
    .line 1271
    iget-object v2, v2, LL2/b;->c:Ls2/u;

    .line 1272
    .line 1273
    if-nez v8, :cond_3a

    .line 1274
    .line 1275
    goto :goto_29

    .line 1276
    :cond_3a
    const/16 v36, 0x1

    .line 1277
    .line 1278
    add-int/lit8 v8, v8, -0x1

    .line 1279
    .line 1280
    invoke-virtual {v7, v8}, LQ1/l;->c(I)J

    .line 1281
    .line 1282
    .line 1283
    move-result-wide v7

    .line 1284
    sub-long v7, v5, v7

    .line 1285
    .line 1286
    cmp-long v7, v7, v10

    .line 1287
    .line 1288
    if-gez v7, :cond_3b

    .line 1289
    .line 1290
    goto :goto_2a

    .line 1291
    :cond_3b
    :goto_29
    invoke-virtual {v2, v5, v6, v3, v4}, Ls2/u;->a(JJ)V

    .line 1292
    .line 1293
    .line 1294
    :goto_2a
    iget-boolean v3, v0, LL2/d;->t:Z

    .line 1295
    .line 1296
    if-eqz v3, :cond_3e

    .line 1297
    .line 1298
    iget-wide v3, v0, LL2/d;->u:J

    .line 1299
    .line 1300
    iget-object v2, v2, Ls2/u;->b:LQ1/l;

    .line 1301
    .line 1302
    iget v5, v2, LQ1/l;->b:I

    .line 1303
    .line 1304
    if-nez v5, :cond_3c

    .line 1305
    .line 1306
    goto :goto_2c

    .line 1307
    :cond_3c
    const/16 v36, 0x1

    .line 1308
    .line 1309
    add-int/lit8 v5, v5, -0x1

    .line 1310
    .line 1311
    invoke-virtual {v2, v5}, LQ1/l;->c(I)J

    .line 1312
    .line 1313
    .line 1314
    move-result-wide v5

    .line 1315
    sub-long/2addr v3, v5

    .line 1316
    cmp-long v2, v3, v10

    .line 1317
    .line 1318
    if-gez v2, :cond_3e

    .line 1319
    .line 1320
    const/4 v15, 0x0

    .line 1321
    iput-boolean v15, v0, LL2/d;->t:Z

    .line 1322
    .line 1323
    iget-object v2, v0, LL2/d;->i:Ls2/C;

    .line 1324
    .line 1325
    iput-object v2, v0, LL2/d;->j:Ls2/C;

    .line 1326
    .line 1327
    :cond_3d
    :goto_2b
    const/4 v14, 0x1

    .line 1328
    goto :goto_2f

    .line 1329
    :cond_3e
    :goto_2c
    const/4 v15, 0x0

    .line 1330
    goto :goto_2b

    .line 1331
    :cond_3f
    const/4 v15, 0x0

    .line 1332
    const/4 v14, 0x1

    .line 1333
    :goto_2d
    invoke-virtual {v3, v14}, Ls2/j;->j(I)V

    .line 1334
    .line 1335
    .line 1336
    iput v15, v0, LL2/d;->k:I

    .line 1337
    .line 1338
    :goto_2e
    const/4 v5, -0x1

    .line 1339
    const/4 v10, 0x0

    .line 1340
    goto :goto_31

    .line 1341
    :goto_2f
    iget-object v2, v0, LL2/d;->j:Ls2/C;

    .line 1342
    .line 1343
    iget v3, v0, LL2/d;->q:I

    .line 1344
    .line 1345
    invoke-interface {v2, v1, v3, v14}, Ls2/C;->d(LN1/g;IZ)I

    .line 1346
    .line 1347
    .line 1348
    move-result v1

    .line 1349
    const/4 v5, -0x1

    .line 1350
    if-ne v1, v5, :cond_40

    .line 1351
    .line 1352
    :goto_30
    const/4 v5, -0x1

    .line 1353
    const/4 v10, -0x1

    .line 1354
    goto :goto_31

    .line 1355
    :cond_40
    iget v2, v0, LL2/d;->q:I

    .line 1356
    .line 1357
    sub-int/2addr v2, v1

    .line 1358
    iput v2, v0, LL2/d;->q:I

    .line 1359
    .line 1360
    if-lez v2, :cond_41

    .line 1361
    .line 1362
    goto :goto_2e

    .line 1363
    :cond_41
    iget-object v1, v0, LL2/d;->j:Ls2/C;

    .line 1364
    .line 1365
    iget-wide v2, v0, LL2/d;->n:J

    .line 1366
    .line 1367
    iget-wide v4, v0, LL2/d;->m:J

    .line 1368
    .line 1369
    mul-long v2, v2, v16

    .line 1370
    .line 1371
    iget v6, v9, LG5/L;->e:I

    .line 1372
    .line 1373
    int-to-long v6, v6

    .line 1374
    div-long/2addr v2, v6

    .line 1375
    add-long v19, v2, v4

    .line 1376
    .line 1377
    iget v2, v9, LG5/L;->d:I

    .line 1378
    .line 1379
    const/16 v23, 0x0

    .line 1380
    .line 1381
    const/16 v24, 0x0

    .line 1382
    .line 1383
    const/16 v21, 0x1

    .line 1384
    .line 1385
    move-object/from16 v18, v1

    .line 1386
    .line 1387
    move/from16 v22, v2

    .line 1388
    .line 1389
    invoke-interface/range {v18 .. v24}, Ls2/C;->a(JIIILs2/B;)V

    .line 1390
    .line 1391
    .line 1392
    iget-wide v1, v0, LL2/d;->n:J

    .line 1393
    .line 1394
    iget v3, v9, LG5/L;->h:I

    .line 1395
    .line 1396
    int-to-long v3, v3

    .line 1397
    add-long/2addr v1, v3

    .line 1398
    iput-wide v1, v0, LL2/d;->n:J

    .line 1399
    .line 1400
    const/4 v15, 0x0

    .line 1401
    iput v15, v0, LL2/d;->q:I

    .line 1402
    .line 1403
    move v10, v15

    .line 1404
    const/4 v5, -0x1

    .line 1405
    :goto_31
    if-ne v10, v5, :cond_42

    .line 1406
    .line 1407
    iget-object v1, v0, LL2/d;->r:LL2/f;

    .line 1408
    .line 1409
    instance-of v2, v1, LL2/b;

    .line 1410
    .line 1411
    if-eqz v2, :cond_42

    .line 1412
    .line 1413
    iget-wide v2, v0, LL2/d;->n:J

    .line 1414
    .line 1415
    iget-wide v4, v0, LL2/d;->m:J

    .line 1416
    .line 1417
    mul-long v2, v2, v16

    .line 1418
    .line 1419
    iget v6, v9, LG5/L;->e:I

    .line 1420
    .line 1421
    int-to-long v6, v6

    .line 1422
    div-long/2addr v2, v6

    .line 1423
    add-long/2addr v2, v4

    .line 1424
    invoke-interface {v1}, Ls2/w;->f()J

    .line 1425
    .line 1426
    .line 1427
    move-result-wide v4

    .line 1428
    cmp-long v1, v4, v2

    .line 1429
    .line 1430
    if-eqz v1, :cond_42

    .line 1431
    .line 1432
    iget-object v1, v0, LL2/d;->r:LL2/f;

    .line 1433
    .line 1434
    move-object v4, v1

    .line 1435
    check-cast v4, LL2/b;

    .line 1436
    .line 1437
    iget-object v4, v4, LL2/b;->c:Ls2/u;

    .line 1438
    .line 1439
    iput-wide v2, v4, Ls2/u;->c:J

    .line 1440
    .line 1441
    iget-object v2, v0, LL2/d;->h:Ls2/o;

    .line 1442
    .line 1443
    invoke-interface {v2, v1}, Ls2/o;->s(Ls2/w;)V

    .line 1444
    .line 1445
    .line 1446
    :cond_42
    return v10
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
