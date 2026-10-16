.class public final La2/l;
.super Ll2/l;
.source "SourceFile"


# static fields
.field public static final L:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:La2/b;

.field public D:La2/s;

.field public E:I

.field public F:Z

.field public volatile G:Z

.field public H:Z

.field public I:Ll8/e0;

.field public J:Z

.field public K:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:LS1/h;

.field public final q:LS1/k;

.field public final r:La2/b;

.field public final s:Z

.field public final t:Z

.field public final u:LQ1/u;

.field public final v:La2/d;

.field public final w:Ljava/util/List;

.field public final x:LN1/j;

.field public final y:LG2/i;

.field public final z:LQ1/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La2/l;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La2/d;LS1/h;LS1/k;LN1/n;ZLS1/h;LS1/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLQ1/u;LN1/j;La2/b;LG2/i;LQ1/o;ZLV1/k;)V
    .locals 13

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    .line 1
    invoke-direct/range {v1 .. v12}, Ll2/l;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    .line 2
    iput-boolean p2, p0, La2/l;->A:Z

    move/from16 p2, p19

    .line 3
    iput p2, p0, La2/l;->o:I

    move/from16 p2, p20

    .line 4
    iput-boolean p2, p0, La2/l;->K:Z

    move/from16 p2, p21

    .line 5
    iput p2, p0, La2/l;->l:I

    .line 6
    iput-object v0, p0, La2/l;->q:LS1/k;

    move-object/from16 p2, p6

    .line 7
    iput-object p2, p0, La2/l;->p:LS1/h;

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 8
    :goto_0
    iput-boolean p2, p0, La2/l;->F:Z

    move/from16 p2, p8

    .line 9
    iput-boolean p2, p0, La2/l;->B:Z

    move-object/from16 p2, p9

    .line 10
    iput-object p2, p0, La2/l;->m:Landroid/net/Uri;

    move/from16 p2, p23

    .line 11
    iput-boolean p2, p0, La2/l;->s:Z

    move-object/from16 p2, p24

    .line 12
    iput-object p2, p0, La2/l;->u:LQ1/u;

    move/from16 p2, p22

    .line 13
    iput-boolean p2, p0, La2/l;->t:Z

    .line 14
    iput-object p1, p0, La2/l;->v:La2/d;

    move-object/from16 p1, p10

    .line 15
    iput-object p1, p0, La2/l;->w:Ljava/util/List;

    move-object/from16 p1, p25

    .line 16
    iput-object p1, p0, La2/l;->x:LN1/j;

    move-object/from16 p1, p26

    .line 17
    iput-object p1, p0, La2/l;->r:La2/b;

    move-object/from16 p1, p27

    .line 18
    iput-object p1, p0, La2/l;->y:LG2/i;

    move-object/from16 p1, p28

    .line 19
    iput-object p1, p0, La2/l;->z:LQ1/o;

    move/from16 p1, p29

    .line 20
    iput-boolean p1, p0, La2/l;->n:Z

    .line 21
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 22
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 23
    iput-object p1, p0, La2/l;->I:Ll8/e0;

    .line 24
    sget-object p1, La2/l;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, La2/l;->k:I

    return-void
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final c(LS1/h;LS1/k;ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, La2/l;->E:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    move-object p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget p3, p0, La2/l;->E:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, LS1/k;->a(J)LS1/k;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, La2/l;->f(LS1/h;LS1/k;Z)Ls2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget p4, p0, La2/l;->E:I

    .line 25
    .line 26
    invoke-virtual {p3, p4}, Ls2/j;->j(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_6

    .line 32
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, La2/l;->G:Z

    .line 33
    .line 34
    if-nez p4, :cond_3

    .line 35
    .line 36
    iget-object p4, p0, La2/l;->C:La2/b;

    .line 37
    .line 38
    sget-object v0, La2/b;->f:LJ5/n;

    .line 39
    .line 40
    iget-object p4, p4, La2/b;->a:Ls2/m;

    .line 41
    .line 42
    invoke-interface {p4, p3, v0}, Ls2/m;->k(Ls2/n;LJ5/n;)I

    .line 43
    .line 44
    .line 45
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    if-nez p4, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p4

    .line 50
    goto :goto_5

    .line 51
    :catch_0
    move-exception p4

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    :try_start_2
    iget-wide p3, p3, Ls2/j;->d:J

    .line 54
    .line 55
    iget-wide v0, p2, LS1/k;->e:J

    .line 56
    .line 57
    :goto_2
    sub-long/2addr p3, v0

    .line 58
    long-to-int p2, p3

    .line 59
    iput p2, p0, La2/l;->E:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :goto_3
    :try_start_3
    iget-object v0, p0, Ll2/e;->d:LN1/n;

    .line 63
    .line 64
    iget v0, v0, LN1/n;->f:I

    .line 65
    .line 66
    and-int/lit16 v0, v0, 0x4000

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget-object p4, p0, La2/l;->C:La2/b;

    .line 71
    .line 72
    iget-object p4, p4, La2/b;->a:Ls2/m;

    .line 73
    .line 74
    const-wide/16 v0, 0x0

    .line 75
    .line 76
    invoke-interface {p4, v0, v1, v0, v1}, Ls2/m;->a(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    .line 79
    :try_start_4
    iget-wide p3, p3, Ls2/j;->d:J

    .line 80
    .line 81
    iget-wide v0, p2, LS1/k;->e:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_4
    invoke-static {p1}, LFe/b;->m(LS1/h;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 89
    :goto_5
    :try_start_6
    iget-wide v0, p3, Ls2/j;->d:J

    .line 90
    .line 91
    iget-wide p2, p2, LS1/k;->e:J

    .line 92
    .line 93
    sub-long/2addr v0, p2

    .line 94
    long-to-int p2, v0

    .line 95
    iput p2, p0, La2/l;->E:I

    .line 96
    .line 97
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 98
    :goto_6
    invoke-static {p1}, LFe/b;->m(LS1/h;)V

    .line 99
    .line 100
    .line 101
    throw p2
.end method

.method public final e(I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, La2/l;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La2/l;->I:Ll8/e0;

    .line 9
    .line 10
    iget v1, v0, Ll8/e0;->d:I

    .line 11
    .line 12
    if-lt p1, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {v0, p1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final f(LS1/h;LS1/k;Z)Ls2/j;
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/16 v4, 0xa

    .line 6
    .line 7
    const/4 v5, 0x1

    .line 8
    invoke-interface/range {p1 .. p2}, LS1/h;->y(LS1/k;)J

    .line 9
    .line 10
    .line 11
    move-result-wide v10

    .line 12
    iget-wide v12, v1, Ll2/e;->g:J

    .line 13
    .line 14
    iget-object v14, v1, La2/l;->u:LQ1/u;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    :try_start_0
    iget-boolean v6, v1, La2/l;->s:Z

    .line 19
    .line 20
    invoke-virtual {v14, v12, v13, v6}, LQ1/u;->h(JZ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    new-instance v2, Ljava/io/IOException;

    .line 26
    .line 27
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v2

    .line 31
    :catch_1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_0
    :goto_0
    new-instance v6, Ls2/j;

    .line 38
    .line 39
    iget-wide v8, v0, LS1/k;->e:J

    .line 40
    .line 41
    move-object/from16 v7, p1

    .line 42
    .line 43
    invoke-direct/range {v6 .. v11}, Ls2/j;-><init>(LN1/g;JJ)V

    .line 44
    .line 45
    .line 46
    iget-object v7, v1, La2/l;->C:La2/b;

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    if-nez v7, :cond_2f

    .line 50
    .line 51
    iget-object v7, v1, La2/l;->z:LQ1/o;

    .line 52
    .line 53
    iput v8, v6, Ls2/j;->f:I

    .line 54
    .line 55
    const/16 v9, 0x8

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v7, v4}, LQ1/o;->D(I)V

    .line 58
    .line 59
    .line 60
    iget-object v15, v7, LQ1/o;->a:[B

    .line 61
    .line 62
    invoke-virtual {v6, v15, v8, v4, v8}, Ls2/j;->c([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, LQ1/o;->x()I

    .line 66
    .line 67
    .line 68
    move-result v15

    .line 69
    const/16 v16, 0x4

    .line 70
    .line 71
    const v2, 0x494433

    .line 72
    .line 73
    .line 74
    if-eq v15, v2, :cond_1

    .line 75
    .line 76
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_1
    const/4 v2, 0x3

    .line 88
    invoke-virtual {v7, v2}, LQ1/o;->H(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, LQ1/o;->t()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    add-int/lit8 v15, v2, 0xa

    .line 96
    .line 97
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    iget-object v10, v7, LQ1/o;->a:[B

    .line 103
    .line 104
    array-length v11, v10

    .line 105
    if-le v15, v11, :cond_2

    .line 106
    .line 107
    invoke-virtual {v7, v15}, LQ1/o;->D(I)V

    .line 108
    .line 109
    .line 110
    iget-object v11, v7, LQ1/o;->a:[B

    .line 111
    .line 112
    invoke-static {v10, v8, v11, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    .line 114
    .line 115
    :cond_2
    iget-object v10, v7, LQ1/o;->a:[B

    .line 116
    .line 117
    invoke-virtual {v6, v10, v4, v2, v8}, Ls2/j;->c([BIIZ)Z

    .line 118
    .line 119
    .line 120
    iget-object v4, v7, LQ1/o;->a:[B

    .line 121
    .line 122
    iget-object v10, v1, La2/l;->y:LG2/i;

    .line 123
    .line 124
    invoke-virtual {v10, v2, v4}, LG2/i;->O(I[B)LN1/B;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-nez v2, :cond_4

    .line 129
    .line 130
    :cond_3
    :goto_1
    move-wide/from16 v2, v17

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    iget-object v2, v2, LN1/B;->a:[LN1/A;

    .line 134
    .line 135
    array-length v4, v2

    .line 136
    move v10, v8

    .line 137
    :goto_2
    if-ge v10, v4, :cond_3

    .line 138
    .line 139
    aget-object v11, v2, v10

    .line 140
    .line 141
    instance-of v15, v11, LG2/n;

    .line 142
    .line 143
    if-eqz v15, :cond_5

    .line 144
    .line 145
    check-cast v11, LG2/n;

    .line 146
    .line 147
    iget-object v15, v11, LG2/n;->b:Ljava/lang/String;

    .line 148
    .line 149
    const-string v3, "com.apple.streaming.transportStreamTimestamp"

    .line 150
    .line 151
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    iget-object v2, v7, LQ1/o;->a:[B

    .line 158
    .line 159
    iget-object v3, v11, LG2/n;->c:[B

    .line 160
    .line 161
    invoke-static {v3, v8, v2, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7, v8}, LQ1/o;->G(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v9}, LQ1/o;->F(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7}, LQ1/o;->o()J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    const-wide v10, 0x1ffffffffL

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    and-long/2addr v2, v10

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    add-int/2addr v10, v5

    .line 182
    goto :goto_2

    .line 183
    :catch_2
    const/16 v16, 0x4

    .line 184
    .line 185
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :goto_3
    iput v8, v6, Ls2/j;->f:I

    .line 192
    .line 193
    iget-object v4, v1, La2/l;->r:La2/b;

    .line 194
    .line 195
    if-eqz v4, :cond_e

    .line 196
    .line 197
    iget-object v0, v4, La2/b;->a:Ls2/m;

    .line 198
    .line 199
    invoke-interface {v0}, Ls2/m;->h()Ls2/m;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    instance-of v9, v7, LY2/y;

    .line 204
    .line 205
    if-nez v9, :cond_7

    .line 206
    .line 207
    instance-of v7, v7, LM2/l;

    .line 208
    .line 209
    if-eqz v7, :cond_6

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_6
    move v7, v8

    .line 213
    goto :goto_5

    .line 214
    :cond_7
    :goto_4
    move v7, v5

    .line 215
    :goto_5
    xor-int/2addr v7, v5

    .line 216
    invoke-static {v7}, LQ1/k;->g(Z)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v0}, Ls2/m;->h()Ls2/m;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    if-ne v7, v0, :cond_8

    .line 224
    .line 225
    move v7, v5

    .line 226
    goto :goto_6

    .line 227
    :cond_8
    move v7, v8

    .line 228
    :goto_6
    new-instance v9, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    const-string v15, "Can\'t recreate wrapped extractors. Outer type: "

    .line 231
    .line 232
    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-static {v9, v7}, LQ1/k;->f(Ljava/lang/String;Z)V

    .line 247
    .line 248
    .line 249
    instance-of v7, v0, La2/w;

    .line 250
    .line 251
    if-eqz v7, :cond_9

    .line 252
    .line 253
    new-instance v0, La2/w;

    .line 254
    .line 255
    iget-object v7, v4, La2/b;->b:LN1/n;

    .line 256
    .line 257
    iget-object v7, v7, LN1/n;->d:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v9, v4, La2/b;->c:LQ1/u;

    .line 260
    .line 261
    iget-object v15, v4, La2/b;->d:Lwa/a;

    .line 262
    .line 263
    iget-boolean v10, v4, La2/b;->e:Z

    .line 264
    .line 265
    invoke-direct {v0, v7, v9, v15, v10}, La2/w;-><init>(Ljava/lang/String;LQ1/u;Lwa/a;Z)V

    .line 266
    .line 267
    .line 268
    :goto_7
    move-object/from16 v21, v0

    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_9
    instance-of v7, v0, LY2/d;

    .line 272
    .line 273
    if-eqz v7, :cond_a

    .line 274
    .line 275
    new-instance v0, LY2/d;

    .line 276
    .line 277
    invoke-direct {v0, v8}, LY2/d;-><init>(I)V

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_a
    instance-of v7, v0, LY2/a;

    .line 282
    .line 283
    if-eqz v7, :cond_b

    .line 284
    .line 285
    new-instance v0, LY2/a;

    .line 286
    .line 287
    invoke-direct {v0}, LY2/a;-><init>()V

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_b
    instance-of v7, v0, LY2/c;

    .line 292
    .line 293
    if-eqz v7, :cond_c

    .line 294
    .line 295
    new-instance v0, LY2/c;

    .line 296
    .line 297
    invoke-direct {v0}, LY2/c;-><init>()V

    .line 298
    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_c
    instance-of v7, v0, LL2/d;

    .line 302
    .line 303
    if-eqz v7, :cond_d

    .line 304
    .line 305
    new-instance v0, LL2/d;

    .line 306
    .line 307
    invoke-direct {v0, v8}, LL2/d;-><init>(I)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :goto_8
    new-instance v20, La2/b;

    .line 312
    .line 313
    iget-object v0, v4, La2/b;->d:Lwa/a;

    .line 314
    .line 315
    iget-boolean v7, v4, La2/b;->e:Z

    .line 316
    .line 317
    iget-object v9, v4, La2/b;->b:LN1/n;

    .line 318
    .line 319
    iget-object v4, v4, La2/b;->c:LQ1/u;

    .line 320
    .line 321
    move-object/from16 v24, v0

    .line 322
    .line 323
    move-object/from16 v23, v4

    .line 324
    .line 325
    move/from16 v25, v7

    .line 326
    .line 327
    move-object/from16 v22, v9

    .line 328
    .line 329
    invoke-direct/range {v20 .. v25}, La2/b;-><init>(Ls2/m;LN1/n;LQ1/u;Lwa/a;Z)V

    .line 330
    .line 331
    .line 332
    move-wide/from16 v34, v12

    .line 333
    .line 334
    move v12, v8

    .line 335
    :goto_9
    move-object/from16 v0, v20

    .line 336
    .line 337
    goto/16 :goto_1e

    .line 338
    .line 339
    :cond_d
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v3, "Unexpected extractor type for recreation: "

    .line 350
    .line 351
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v2

    .line 359
    :cond_e
    invoke-interface/range {p1 .. p1}, LS1/h;->d()Ljava/util/Map;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    iget-object v7, v1, La2/l;->v:La2/d;

    .line 364
    .line 365
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget-object v10, v1, Ll2/e;->d:LN1/n;

    .line 369
    .line 370
    iget-object v11, v10, LN1/n;->n:Ljava/lang/String;

    .line 371
    .line 372
    invoke-static {v11}, Lgc/b;->x(Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    const-string v15, "Content-Type"

    .line 377
    .line 378
    invoke-interface {v4, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    check-cast v4, Ljava/util/List;

    .line 383
    .line 384
    if-eqz v4, :cond_10

    .line 385
    .line 386
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 387
    .line 388
    .line 389
    move-result v20

    .line 390
    if-eqz v20, :cond_f

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_f
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    check-cast v4, Ljava/lang/String;

    .line 398
    .line 399
    goto :goto_b

    .line 400
    :cond_10
    :goto_a
    const/4 v4, 0x0

    .line 401
    :goto_b
    invoke-static {v4}, Lgc/b;->x(Ljava/lang/String;)I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    iget-object v0, v0, LS1/k;->a:Landroid/net/Uri;

    .line 406
    .line 407
    invoke-static {v0}, Lgc/b;->y(Landroid/net/Uri;)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    new-instance v15, Ljava/util/ArrayList;

    .line 412
    .line 413
    const/4 v9, 0x7

    .line 414
    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 415
    .line 416
    .line 417
    invoke-static {v15, v11}, La2/d;->a(Ljava/util/ArrayList;I)V

    .line 418
    .line 419
    .line 420
    invoke-static {v15, v4}, La2/d;->a(Ljava/util/ArrayList;I)V

    .line 421
    .line 422
    .line 423
    invoke-static {v15, v0}, La2/d;->a(Ljava/util/ArrayList;I)V

    .line 424
    .line 425
    .line 426
    sget-object v20, La2/d;->c:[I

    .line 427
    .line 428
    move/from16 v26, v5

    .line 429
    .line 430
    move v5, v8

    .line 431
    :goto_c
    if-ge v5, v9, :cond_11

    .line 432
    .line 433
    aget v9, v20, v5

    .line 434
    .line 435
    invoke-static {v15, v9}, La2/d;->a(Ljava/util/ArrayList;I)V

    .line 436
    .line 437
    .line 438
    add-int/lit8 v5, v5, 0x1

    .line 439
    .line 440
    const/4 v9, 0x7

    .line 441
    goto :goto_c

    .line 442
    :cond_11
    iput v8, v6, Ls2/j;->f:I

    .line 443
    .line 444
    move v5, v8

    .line 445
    const/16 v21, 0x0

    .line 446
    .line 447
    :goto_d
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    iget-object v8, v1, La2/l;->u:LQ1/u;

    .line 452
    .line 453
    if-ge v5, v9, :cond_27

    .line 454
    .line 455
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v9

    .line 459
    check-cast v9, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    move/from16 v20, v5

    .line 466
    .line 467
    if-eqz v9, :cond_23

    .line 468
    .line 469
    move/from16 v5, v26

    .line 470
    .line 471
    if-eq v9, v5, :cond_22

    .line 472
    .line 473
    const/4 v5, 0x2

    .line 474
    if-eq v9, v5, :cond_21

    .line 475
    .line 476
    const/4 v5, 0x7

    .line 477
    if-eq v9, v5, :cond_20

    .line 478
    .line 479
    sget-object v23, LP2/j;->P8:Lx4/d;

    .line 480
    .line 481
    iget-object v5, v1, La2/l;->w:Ljava/util/List;

    .line 482
    .line 483
    move-object/from16 v24, v5

    .line 484
    .line 485
    const/16 v5, 0x8

    .line 486
    .line 487
    if-eq v9, v5, :cond_19

    .line 488
    .line 489
    const/16 v5, 0xb

    .line 490
    .line 491
    if-eq v9, v5, :cond_13

    .line 492
    .line 493
    const/16 v5, 0xd

    .line 494
    .line 495
    if-eq v9, v5, :cond_12

    .line 496
    .line 497
    move-object/from16 v31, v8

    .line 498
    .line 499
    move-wide/from16 v34, v12

    .line 500
    .line 501
    move-object/from16 v25, v15

    .line 502
    .line 503
    const/4 v5, 0x0

    .line 504
    :goto_e
    const/16 v19, 0x2

    .line 505
    .line 506
    goto/16 :goto_1c

    .line 507
    .line 508
    :cond_12
    new-instance v5, La2/w;

    .line 509
    .line 510
    move-wide/from16 v34, v12

    .line 511
    .line 512
    iget-object v12, v7, La2/d;->a:Lwa/a;

    .line 513
    .line 514
    iget-boolean v13, v7, La2/d;->b:Z

    .line 515
    .line 516
    move-object/from16 v25, v15

    .line 517
    .line 518
    iget-object v15, v10, LN1/n;->d:Ljava/lang/String;

    .line 519
    .line 520
    invoke-direct {v5, v15, v8, v12, v13}, La2/w;-><init>(Ljava/lang/String;LQ1/u;Lwa/a;Z)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v31, v8

    .line 524
    .line 525
    goto :goto_e

    .line 526
    :cond_13
    move-wide/from16 v34, v12

    .line 527
    .line 528
    move-object/from16 v25, v15

    .line 529
    .line 530
    iget-object v5, v7, La2/d;->a:Lwa/a;

    .line 531
    .line 532
    iget-boolean v12, v7, La2/d;->b:Z

    .line 533
    .line 534
    if-eqz v24, :cond_14

    .line 535
    .line 536
    const/16 v13, 0x30

    .line 537
    .line 538
    move v15, v13

    .line 539
    move-object/from16 v13, v24

    .line 540
    .line 541
    :goto_f
    move-object/from16 v27, v5

    .line 542
    .line 543
    goto :goto_10

    .line 544
    :cond_14
    new-instance v13, LN1/m;

    .line 545
    .line 546
    invoke-direct {v13}, LN1/m;-><init>()V

    .line 547
    .line 548
    .line 549
    const-string v15, "application/cea-608"

    .line 550
    .line 551
    invoke-static {v15}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v15

    .line 555
    iput-object v15, v13, LN1/m;->m:Ljava/lang/String;

    .line 556
    .line 557
    new-instance v15, LN1/n;

    .line 558
    .line 559
    invoke-direct {v15, v13}, LN1/n;-><init>(LN1/m;)V

    .line 560
    .line 561
    .line 562
    invoke-static {v15}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v13

    .line 566
    const/16 v15, 0x10

    .line 567
    .line 568
    goto :goto_f

    .line 569
    :goto_10
    iget-object v5, v10, LN1/n;->k:Ljava/lang/String;

    .line 570
    .line 571
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 572
    .line 573
    .line 574
    move-result v24

    .line 575
    move-object/from16 v31, v8

    .line 576
    .line 577
    if-nez v24, :cond_17

    .line 578
    .line 579
    const-string v8, "audio/mp4a-latm"

    .line 580
    .line 581
    invoke-static {v5, v8}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v8

    .line 585
    if-eqz v8, :cond_15

    .line 586
    .line 587
    const/16 v19, 0x2

    .line 588
    .line 589
    goto :goto_11

    .line 590
    :cond_15
    const/16 v19, 0x2

    .line 591
    .line 592
    or-int/lit8 v15, v15, 0x2

    .line 593
    .line 594
    :goto_11
    const-string v8, "video/avc"

    .line 595
    .line 596
    invoke-static {v5, v8}, LN1/C;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    if-eqz v5, :cond_16

    .line 601
    .line 602
    goto :goto_12

    .line 603
    :cond_16
    or-int/lit8 v15, v15, 0x4

    .line 604
    .line 605
    goto :goto_12

    .line 606
    :cond_17
    const/16 v19, 0x2

    .line 607
    .line 608
    :goto_12
    if-nez v12, :cond_18

    .line 609
    .line 610
    move-object/from16 v30, v23

    .line 611
    .line 612
    :goto_13
    const/16 v26, 0x1

    .line 613
    .line 614
    goto :goto_14

    .line 615
    :cond_18
    move-object/from16 v30, v27

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :goto_14
    xor-int/lit8 v29, v12, 0x1

    .line 619
    .line 620
    new-instance v27, LY2/y;

    .line 621
    .line 622
    new-instance v5, LY2/f;

    .line 623
    .line 624
    invoke-direct {v5, v15, v13}, LY2/f;-><init>(ILjava/util/List;)V

    .line 625
    .line 626
    .line 627
    const/16 v28, 0x2

    .line 628
    .line 629
    move-object/from16 v32, v5

    .line 630
    .line 631
    invoke-direct/range {v27 .. v32}, LY2/y;-><init>(IILP2/j;LQ1/u;LY2/f;)V

    .line 632
    .line 633
    .line 634
    :goto_15
    move-object/from16 v5, v27

    .line 635
    .line 636
    goto/16 :goto_1c

    .line 637
    .line 638
    :cond_19
    move-object/from16 v31, v8

    .line 639
    .line 640
    move-wide/from16 v34, v12

    .line 641
    .line 642
    move-object/from16 v25, v15

    .line 643
    .line 644
    const/16 v19, 0x2

    .line 645
    .line 646
    iget-object v5, v7, La2/d;->a:Lwa/a;

    .line 647
    .line 648
    iget-boolean v8, v7, La2/d;->b:Z

    .line 649
    .line 650
    iget-object v12, v10, LN1/n;->l:LN1/B;

    .line 651
    .line 652
    if-nez v12, :cond_1b

    .line 653
    .line 654
    move-object/from16 v27, v5

    .line 655
    .line 656
    :cond_1a
    const/4 v5, 0x0

    .line 657
    goto :goto_17

    .line 658
    :cond_1b
    const/4 v13, 0x0

    .line 659
    :goto_16
    iget-object v15, v12, LN1/B;->a:[LN1/A;

    .line 660
    .line 661
    move-object/from16 v27, v5

    .line 662
    .line 663
    array-length v5, v15

    .line 664
    if-ge v13, v5, :cond_1a

    .line 665
    .line 666
    aget-object v5, v15, v13

    .line 667
    .line 668
    instance-of v15, v5, La2/u;

    .line 669
    .line 670
    if-eqz v15, :cond_1c

    .line 671
    .line 672
    check-cast v5, La2/u;

    .line 673
    .line 674
    iget-object v5, v5, La2/u;->c:Ljava/util/List;

    .line 675
    .line 676
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 677
    .line 678
    .line 679
    move-result v5

    .line 680
    const/16 v26, 0x1

    .line 681
    .line 682
    xor-int/lit8 v5, v5, 0x1

    .line 683
    .line 684
    goto :goto_17

    .line 685
    :cond_1c
    const/16 v26, 0x1

    .line 686
    .line 687
    add-int/lit8 v13, v13, 0x1

    .line 688
    .line 689
    move-object/from16 v5, v27

    .line 690
    .line 691
    goto :goto_16

    .line 692
    :goto_17
    if-eqz v5, :cond_1d

    .line 693
    .line 694
    move/from16 v5, v16

    .line 695
    .line 696
    goto :goto_18

    .line 697
    :cond_1d
    const/4 v5, 0x0

    .line 698
    :goto_18
    if-nez v8, :cond_1e

    .line 699
    .line 700
    or-int/lit8 v5, v5, 0x20

    .line 701
    .line 702
    move-object/from16 v28, v23

    .line 703
    .line 704
    :goto_19
    move/from16 v29, v5

    .line 705
    .line 706
    goto :goto_1a

    .line 707
    :cond_1e
    move-object/from16 v28, v27

    .line 708
    .line 709
    goto :goto_19

    .line 710
    :goto_1a
    new-instance v27, LM2/l;

    .line 711
    .line 712
    if-eqz v24, :cond_1f

    .line 713
    .line 714
    move-object/from16 v32, v24

    .line 715
    .line 716
    goto :goto_1b

    .line 717
    :cond_1f
    sget-object v5, Ll8/e0;->e:Ll8/e0;

    .line 718
    .line 719
    move-object/from16 v32, v5

    .line 720
    .line 721
    :goto_1b
    const/16 v33, 0x0

    .line 722
    .line 723
    move-object/from16 v23, v31

    .line 724
    .line 725
    const/16 v31, 0x0

    .line 726
    .line 727
    move-object/from16 v30, v23

    .line 728
    .line 729
    invoke-direct/range {v27 .. v33}, LM2/l;-><init>(LP2/j;ILQ1/u;LM2/s;Ljava/util/List;LX1/l;)V

    .line 730
    .line 731
    .line 732
    move-object/from16 v31, v30

    .line 733
    .line 734
    goto :goto_15

    .line 735
    :cond_20
    move-object/from16 v31, v8

    .line 736
    .line 737
    move-wide/from16 v34, v12

    .line 738
    .line 739
    move-object/from16 v25, v15

    .line 740
    .line 741
    const/16 v19, 0x2

    .line 742
    .line 743
    new-instance v5, LL2/d;

    .line 744
    .line 745
    const/4 v8, 0x0

    .line 746
    const-wide/16 v12, 0x0

    .line 747
    .line 748
    invoke-direct {v5, v8, v12, v13}, LL2/d;-><init>(IJ)V

    .line 749
    .line 750
    .line 751
    goto :goto_1c

    .line 752
    :cond_21
    move/from16 v19, v5

    .line 753
    .line 754
    move-object/from16 v31, v8

    .line 755
    .line 756
    move-wide/from16 v34, v12

    .line 757
    .line 758
    move-object/from16 v25, v15

    .line 759
    .line 760
    const/4 v8, 0x0

    .line 761
    new-instance v5, LY2/d;

    .line 762
    .line 763
    invoke-direct {v5, v8}, LY2/d;-><init>(I)V

    .line 764
    .line 765
    .line 766
    goto :goto_1c

    .line 767
    :cond_22
    move-object/from16 v31, v8

    .line 768
    .line 769
    move-wide/from16 v34, v12

    .line 770
    .line 771
    move-object/from16 v25, v15

    .line 772
    .line 773
    const/16 v19, 0x2

    .line 774
    .line 775
    new-instance v5, LY2/c;

    .line 776
    .line 777
    invoke-direct {v5}, LY2/c;-><init>()V

    .line 778
    .line 779
    .line 780
    goto :goto_1c

    .line 781
    :cond_23
    move-object/from16 v31, v8

    .line 782
    .line 783
    move-wide/from16 v34, v12

    .line 784
    .line 785
    move-object/from16 v25, v15

    .line 786
    .line 787
    const/16 v19, 0x2

    .line 788
    .line 789
    new-instance v5, LY2/a;

    .line 790
    .line 791
    invoke-direct {v5}, LY2/a;-><init>()V

    .line 792
    .line 793
    .line 794
    :goto_1c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    :try_start_2
    invoke-interface {v5, v6}, Ls2/m;->i(Ls2/n;)Z

    .line 798
    .line 799
    .line 800
    move-result v8
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 801
    const/4 v12, 0x0

    .line 802
    iput v12, v6, Ls2/j;->f:I

    .line 803
    .line 804
    goto :goto_1d

    .line 805
    :catchall_0
    move-exception v0

    .line 806
    const/4 v12, 0x0

    .line 807
    iput v12, v6, Ls2/j;->f:I

    .line 808
    .line 809
    throw v0

    .line 810
    :catch_3
    const/4 v12, 0x0

    .line 811
    iput v12, v6, Ls2/j;->f:I

    .line 812
    .line 813
    move v8, v12

    .line 814
    :goto_1d
    if-eqz v8, :cond_24

    .line 815
    .line 816
    new-instance v20, La2/b;

    .line 817
    .line 818
    iget-object v0, v7, La2/d;->a:Lwa/a;

    .line 819
    .line 820
    iget-boolean v4, v7, La2/d;->b:Z

    .line 821
    .line 822
    move-object/from16 v24, v0

    .line 823
    .line 824
    move/from16 v25, v4

    .line 825
    .line 826
    move-object/from16 v21, v5

    .line 827
    .line 828
    move-object/from16 v22, v10

    .line 829
    .line 830
    move-object/from16 v23, v31

    .line 831
    .line 832
    invoke-direct/range {v20 .. v25}, La2/b;-><init>(Ls2/m;LN1/n;LQ1/u;Lwa/a;Z)V

    .line 833
    .line 834
    .line 835
    goto/16 :goto_9

    .line 836
    .line 837
    :cond_24
    move-object/from16 v27, v5

    .line 838
    .line 839
    move-object v5, v10

    .line 840
    if-nez v21, :cond_26

    .line 841
    .line 842
    if-eq v9, v11, :cond_25

    .line 843
    .line 844
    if-eq v9, v4, :cond_25

    .line 845
    .line 846
    if-eq v9, v0, :cond_25

    .line 847
    .line 848
    const/16 v8, 0xb

    .line 849
    .line 850
    if-ne v9, v8, :cond_26

    .line 851
    .line 852
    :cond_25
    move-object/from16 v21, v27

    .line 853
    .line 854
    :cond_26
    const/16 v26, 0x1

    .line 855
    .line 856
    add-int/lit8 v8, v20, 0x1

    .line 857
    .line 858
    move-object v10, v5

    .line 859
    move v5, v8

    .line 860
    move v8, v12

    .line 861
    move-object/from16 v15, v25

    .line 862
    .line 863
    move-wide/from16 v12, v34

    .line 864
    .line 865
    const/16 v26, 0x1

    .line 866
    .line 867
    goto/16 :goto_d

    .line 868
    .line 869
    :cond_27
    move-object/from16 v31, v8

    .line 870
    .line 871
    move-object v5, v10

    .line 872
    move-wide/from16 v34, v12

    .line 873
    .line 874
    const/4 v12, 0x0

    .line 875
    new-instance v20, La2/b;

    .line 876
    .line 877
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    iget-object v0, v7, La2/d;->a:Lwa/a;

    .line 881
    .line 882
    iget-boolean v4, v7, La2/d;->b:Z

    .line 883
    .line 884
    move-object/from16 v24, v0

    .line 885
    .line 886
    move/from16 v25, v4

    .line 887
    .line 888
    move-object/from16 v22, v5

    .line 889
    .line 890
    move-object/from16 v23, v31

    .line 891
    .line 892
    invoke-direct/range {v20 .. v25}, La2/b;-><init>(Ls2/m;LN1/n;LQ1/u;Lwa/a;Z)V

    .line 893
    .line 894
    .line 895
    goto/16 :goto_9

    .line 896
    .line 897
    :goto_1e
    iput-object v0, v1, La2/l;->C:La2/b;

    .line 898
    .line 899
    iget-object v0, v0, La2/b;->a:Ls2/m;

    .line 900
    .line 901
    invoke-interface {v0}, Ls2/m;->h()Ls2/m;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    instance-of v4, v0, LY2/d;

    .line 906
    .line 907
    if-nez v4, :cond_29

    .line 908
    .line 909
    instance-of v4, v0, LY2/a;

    .line 910
    .line 911
    if-nez v4, :cond_29

    .line 912
    .line 913
    instance-of v4, v0, LY2/c;

    .line 914
    .line 915
    if-nez v4, :cond_29

    .line 916
    .line 917
    instance-of v0, v0, LL2/d;

    .line 918
    .line 919
    if-eqz v0, :cond_28

    .line 920
    .line 921
    goto :goto_1f

    .line 922
    :cond_28
    move v0, v12

    .line 923
    goto :goto_20

    .line 924
    :cond_29
    :goto_1f
    const/4 v0, 0x1

    .line 925
    :goto_20
    if-eqz v0, :cond_2c

    .line 926
    .line 927
    iget-object v0, v1, La2/l;->D:La2/s;

    .line 928
    .line 929
    cmp-long v4, v2, v17

    .line 930
    .line 931
    if-eqz v4, :cond_2a

    .line 932
    .line 933
    invoke-virtual {v14, v2, v3}, LQ1/u;->b(J)J

    .line 934
    .line 935
    .line 936
    move-result-wide v2

    .line 937
    goto :goto_21

    .line 938
    :cond_2a
    move-wide/from16 v2, v34

    .line 939
    .line 940
    :goto_21
    iget-wide v4, v0, La2/s;->V:J

    .line 941
    .line 942
    cmp-long v4, v4, v2

    .line 943
    .line 944
    if-eqz v4, :cond_2e

    .line 945
    .line 946
    iput-wide v2, v0, La2/s;->V:J

    .line 947
    .line 948
    iget-object v0, v0, La2/s;->v:[La2/r;

    .line 949
    .line 950
    array-length v4, v0

    .line 951
    move v8, v12

    .line 952
    :goto_22
    if-ge v8, v4, :cond_2e

    .line 953
    .line 954
    aget-object v5, v0, v8

    .line 955
    .line 956
    iget-wide v9, v5, Lk2/c0;->F:J

    .line 957
    .line 958
    cmp-long v7, v9, v2

    .line 959
    .line 960
    if-eqz v7, :cond_2b

    .line 961
    .line 962
    iput-wide v2, v5, Lk2/c0;->F:J

    .line 963
    .line 964
    const/4 v7, 0x1

    .line 965
    iput-boolean v7, v5, Lk2/c0;->z:Z

    .line 966
    .line 967
    goto :goto_23

    .line 968
    :cond_2b
    const/4 v7, 0x1

    .line 969
    :goto_23
    add-int/2addr v8, v7

    .line 970
    goto :goto_22

    .line 971
    :cond_2c
    iget-object v0, v1, La2/l;->D:La2/s;

    .line 972
    .line 973
    iget-wide v2, v0, La2/s;->V:J

    .line 974
    .line 975
    const-wide/16 v4, 0x0

    .line 976
    .line 977
    cmp-long v2, v2, v4

    .line 978
    .line 979
    if-eqz v2, :cond_2e

    .line 980
    .line 981
    iput-wide v4, v0, La2/s;->V:J

    .line 982
    .line 983
    iget-object v0, v0, La2/s;->v:[La2/r;

    .line 984
    .line 985
    array-length v2, v0

    .line 986
    move v8, v12

    .line 987
    :goto_24
    if-ge v8, v2, :cond_2e

    .line 988
    .line 989
    aget-object v3, v0, v8

    .line 990
    .line 991
    iget-wide v9, v3, Lk2/c0;->F:J

    .line 992
    .line 993
    cmp-long v7, v9, v4

    .line 994
    .line 995
    if-eqz v7, :cond_2d

    .line 996
    .line 997
    iput-wide v4, v3, Lk2/c0;->F:J

    .line 998
    .line 999
    const/4 v7, 0x1

    .line 1000
    iput-boolean v7, v3, Lk2/c0;->z:Z

    .line 1001
    .line 1002
    goto :goto_25

    .line 1003
    :cond_2d
    const/4 v7, 0x1

    .line 1004
    :goto_25
    add-int/2addr v8, v7

    .line 1005
    goto :goto_24

    .line 1006
    :cond_2e
    iget-object v0, v1, La2/l;->D:La2/s;

    .line 1007
    .line 1008
    iget-object v0, v0, La2/s;->x:Ljava/util/HashSet;

    .line 1009
    .line 1010
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 1011
    .line 1012
    .line 1013
    iget-object v0, v1, La2/l;->C:La2/b;

    .line 1014
    .line 1015
    iget-object v2, v1, La2/l;->D:La2/s;

    .line 1016
    .line 1017
    iget-object v0, v0, La2/b;->a:Ls2/m;

    .line 1018
    .line 1019
    invoke-interface {v0, v2}, Ls2/m;->g(Ls2/o;)V

    .line 1020
    .line 1021
    .line 1022
    goto :goto_26

    .line 1023
    :cond_2f
    move v12, v8

    .line 1024
    :goto_26
    iget-object v0, v1, La2/l;->D:La2/s;

    .line 1025
    .line 1026
    iget-object v2, v0, La2/s;->W:LN1/j;

    .line 1027
    .line 1028
    sget v3, LQ1/x;->a:I

    .line 1029
    .line 1030
    iget-object v3, v1, La2/l;->x:LN1/j;

    .line 1031
    .line 1032
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    if-nez v2, :cond_31

    .line 1037
    .line 1038
    iput-object v3, v0, La2/s;->W:LN1/j;

    .line 1039
    .line 1040
    move v8, v12

    .line 1041
    :goto_27
    iget-object v2, v0, La2/s;->v:[La2/r;

    .line 1042
    .line 1043
    array-length v4, v2

    .line 1044
    if-ge v8, v4, :cond_31

    .line 1045
    .line 1046
    iget-object v4, v0, La2/s;->O:[Z

    .line 1047
    .line 1048
    aget-boolean v4, v4, v8

    .line 1049
    .line 1050
    if-eqz v4, :cond_30

    .line 1051
    .line 1052
    aget-object v2, v2, v8

    .line 1053
    .line 1054
    iput-object v3, v2, La2/r;->I:LN1/j;

    .line 1055
    .line 1056
    const/4 v7, 0x1

    .line 1057
    iput-boolean v7, v2, Lk2/c0;->z:Z

    .line 1058
    .line 1059
    goto :goto_28

    .line 1060
    :cond_30
    const/4 v7, 0x1

    .line 1061
    :goto_28
    add-int/2addr v8, v7

    .line 1062
    goto :goto_27

    .line 1063
    :cond_31
    return-object v6
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La2/l;->G:Z

    .line 3
    .line 4
    return-void
.end method

.method public final load()V
    .locals 4

    .line 1
    iget-object v0, p0, La2/l;->D:La2/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La2/l;->C:La2/b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La2/l;->r:La2/b;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, La2/b;->a:Ls2/m;

    .line 16
    .line 17
    invoke-interface {v0}, Ls2/m;->h()Ls2/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v2, v0, LY2/y;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    instance-of v0, v0, LM2/l;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, La2/l;->r:La2/b;

    .line 30
    .line 31
    iput-object v0, p0, La2/l;->C:La2/b;

    .line 32
    .line 33
    iput-boolean v1, p0, La2/l;->F:Z

    .line 34
    .line 35
    :cond_1
    iget-boolean v0, p0, La2/l;->F:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v0, p0, La2/l;->p:LS1/h;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, La2/l;->q:LS1/k;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-boolean v3, p0, La2/l;->B:Z

    .line 51
    .line 52
    invoke-virtual {p0, v0, v2, v3, v1}, La2/l;->c(LS1/h;LS1/k;ZZ)V

    .line 53
    .line 54
    .line 55
    iput v1, p0, La2/l;->E:I

    .line 56
    .line 57
    iput-boolean v1, p0, La2/l;->F:Z

    .line 58
    .line 59
    :goto_0
    iget-boolean v0, p0, La2/l;->G:Z

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    iget-boolean v0, p0, La2/l;->t:Z

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    iget-boolean v0, p0, La2/l;->A:Z

    .line 69
    .line 70
    iget-object v2, p0, Ll2/e;->i:LS1/z;

    .line 71
    .line 72
    iget-object v3, p0, Ll2/e;->b:LS1/k;

    .line 73
    .line 74
    invoke-virtual {p0, v2, v3, v0, v1}, La2/l;->c(LS1/h;LS1/k;ZZ)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-boolean v0, p0, La2/l;->G:Z

    .line 78
    .line 79
    xor-int/2addr v0, v1

    .line 80
    iput-boolean v0, p0, La2/l;->H:Z

    .line 81
    .line 82
    :cond_4
    return-void
.end method
