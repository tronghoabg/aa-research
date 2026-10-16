.class public final LX1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/i;


# instance fields
.field public final a:Lo2/n;

.field public final b:LS3/n;

.field public final c:[I

.field public final d:I

.field public final e:LS1/h;

.field public final f:J

.field public final g:I

.field public final h:LX1/l;

.field public final i:[LA7/u;

.field public j:Ln2/q;

.field public k:LY1/c;

.field public l:I

.field public m:Lk2/b;

.field public n:Z


# direct methods
.method public constructor <init>(LE4/F;Lo2/n;LY1/c;LS3/n;I[ILn2/q;ILS1/h;JIZLjava/util/ArrayList;LX1/l;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p7

    move/from16 v6, p8

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v7, p2

    .line 2
    iput-object v7, v0, LX1/i;->a:Lo2/n;

    .line 3
    iput-object v2, v0, LX1/i;->k:LY1/c;

    .line 4
    iput-object v3, v0, LX1/i;->b:LS3/n;

    move-object/from16 v7, p6

    .line 5
    iput-object v7, v0, LX1/i;->c:[I

    .line 6
    iput-object v5, v0, LX1/i;->j:Ln2/q;

    .line 7
    iput v6, v0, LX1/i;->d:I

    move-object/from16 v7, p9

    .line 8
    iput-object v7, v0, LX1/i;->e:LS1/h;

    .line 9
    iput v4, v0, LX1/i;->l:I

    move-wide/from16 v7, p10

    .line 10
    iput-wide v7, v0, LX1/i;->f:J

    move/from16 v7, p12

    .line 11
    iput v7, v0, LX1/i;->g:I

    move-object/from16 v13, p15

    .line 12
    iput-object v13, v0, LX1/i;->h:LX1/l;

    .line 13
    invoke-virtual {v2, v4}, LY1/c;->d(I)J

    move-result-wide v14

    .line 14
    invoke-virtual {v0}, LX1/i;->h()Ljava/util/ArrayList;

    move-result-object v2

    .line 15
    invoke-interface {v5}, Ln2/q;->length()I

    move-result v4

    new-array v4, v4, [LA7/u;

    iput-object v4, v0, LX1/i;->i:[LA7/u;

    const/4 v4, 0x0

    move v7, v4

    .line 16
    :goto_0
    iget-object v8, v0, LX1/i;->i:[LA7/u;

    array-length v8, v8

    if-ge v7, v8, :cond_b

    .line 17
    invoke-interface {v5, v7}, Ln2/q;->c(I)I

    move-result v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LY1/m;

    .line 18
    iget-object v9, v8, LY1/m;->b:Ll8/K;

    invoke-virtual {v3, v9}, LS3/n;->d(Ljava/util/List;)LY1/b;

    move-result-object v9

    .line 19
    iget-object v10, v0, LX1/i;->i:[LA7/u;

    new-instance v16, LA7/u;

    if-eqz v9, :cond_0

    :goto_1
    move-object/from16 v17, v9

    goto :goto_2

    .line 20
    :cond_0
    iget-object v9, v8, LY1/m;->b:Ll8/K;

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LY1/b;

    goto :goto_1

    .line 21
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iget-object v9, v8, LY1/m;->a:LN1/n;

    iget-object v11, v9, LN1/n;->m:Ljava/lang/String;

    .line 23
    invoke-static {v11}, LN1/C;->k(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 24
    iget-boolean v11, v1, LE4/F;->b:Z

    if-nez v11, :cond_1

    const/4 v9, 0x0

    move/from16 v19, v7

    move-object v4, v8

    move-object/from16 v18, v10

    :goto_3
    move-object v12, v9

    move-wide v8, v14

    goto/16 :goto_9

    .line 25
    :cond_1
    new-instance v11, LP2/h;

    iget-object v12, v1, LE4/F;->c:Ljava/lang/Object;

    check-cast v12, Lwa/a;

    .line 26
    invoke-virtual {v12, v9}, Lwa/a;->i(LN1/n;)LP2/l;

    move-result-object v12

    invoke-direct {v11, v12, v9}, LP2/h;-><init>(LP2/l;LN1/n;)V

    :goto_4
    move/from16 v19, v7

    move-object v4, v8

    move-object v0, v9

    move-object/from16 v18, v10

    goto/16 :goto_8

    :cond_2
    const/4 v12, 0x1

    if-nez v11, :cond_3

    goto :goto_5

    .line 27
    :cond_3
    const-string v4, "video/webm"

    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "audio/webm"

    .line 28
    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "application/webm"

    .line 29
    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "video/x-matroska"

    .line 30
    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "audio/x-matroska"

    .line 31
    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "application/x-matroska"

    .line 32
    invoke-virtual {v11, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    move/from16 v19, v7

    move-object v4, v8

    move-object v0, v9

    move-object/from16 v18, v10

    goto :goto_7

    .line 33
    :cond_5
    :goto_5
    const-string v4, "image/jpeg"

    invoke-static {v11, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 34
    new-instance v11, LO2/a;

    invoke-direct {v11, v12}, LO2/a;-><init>(I)V

    goto :goto_4

    .line 35
    :cond_6
    const-string v4, "image/png"

    invoke-static {v11, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 36
    new-instance v11, LO2/a;

    const/4 v4, 0x0

    const/4 v12, 0x0

    invoke-direct {v11, v12, v4}, LO2/a;-><init>(BI)V

    goto :goto_4

    :cond_7
    if-eqz p13, :cond_8

    const/4 v4, 0x4

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    .line 37
    :goto_6
    iget-boolean v11, v1, LE4/F;->b:Z

    if-nez v11, :cond_9

    or-int/lit8 v4, v4, 0x20

    :cond_9
    move v11, v7

    .line 38
    new-instance v7, LM2/l;

    iget-object v12, v1, LE4/F;->c:Ljava/lang/Object;

    check-cast v12, Lwa/a;

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object v0, v9

    move v9, v4

    move-object v4, v8

    move-object v8, v12

    move-object/from16 v12, p14

    invoke-direct/range {v7 .. v13}, LM2/l;-><init>(LP2/j;ILQ1/u;LM2/s;Ljava/util/List;LX1/l;)V

    move-object v11, v7

    goto :goto_8

    .line 39
    :goto_7
    iget-boolean v7, v1, LE4/F;->b:Z

    if-nez v7, :cond_a

    const/4 v12, 0x3

    .line 40
    :cond_a
    new-instance v11, LK2/d;

    iget-object v7, v1, LE4/F;->c:Ljava/lang/Object;

    check-cast v7, Lwa/a;

    invoke-direct {v11, v7, v12}, LK2/d;-><init>(LP2/j;I)V

    .line 41
    :goto_8
    new-instance v9, Ll2/d;

    invoke-direct {v9, v11, v6, v0}, Ll2/d;-><init>(Ls2/m;ILN1/n;)V

    goto/16 :goto_3

    :goto_9
    const-wide/16 v13, 0x0

    .line 42
    invoke-virtual {v4}, LY1/m;->c()LX1/g;

    move-result-object v15

    move-object v10, v4

    move-object/from16 v7, v16

    move-object/from16 v11, v17

    invoke-direct/range {v7 .. v15}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    aput-object v7, v18, v19

    add-int/lit8 v7, v19, 0x1

    move-object/from16 v0, p0

    move-object/from16 v13, p15

    move-wide v14, v8

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_b
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LX1/i;->m:Lk2/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LX1/i;->a:Lo2/n;

    .line 6
    .line 7
    invoke-interface {v0}, Lo2/n;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
.end method

.method public final b(JLU1/a0;)J
    .locals 18

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v7, p0

    .line 4
    .line 5
    iget-object v0, v7, LX1/i;->i:[LA7/u;

    .line 6
    .line 7
    array-length v3, v0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    if-ge v4, v3, :cond_4

    .line 10
    .line 11
    aget-object v5, v0, v4

    .line 12
    .line 13
    iget-object v6, v5, LA7/u;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, LX1/g;

    .line 16
    .line 17
    if-eqz v6, :cond_3

    .line 18
    .line 19
    invoke-virtual {v5}, LA7/u;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v8

    .line 23
    const-wide/16 v10, 0x0

    .line 24
    .line 25
    cmp-long v6, v8, v10

    .line 26
    .line 27
    if-nez v6, :cond_0

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    iget-object v0, v5, LA7/u;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LX1/g;

    .line 33
    .line 34
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-wide v3, v5, LA7/u;->b:J

    .line 38
    .line 39
    invoke-interface {v0, v1, v2, v3, v4}, LX1/g;->v(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-wide v10, v5, LA7/u;->c:J

    .line 44
    .line 45
    add-long/2addr v3, v10

    .line 46
    move-wide v12, v3

    .line 47
    invoke-virtual {v5, v12, v13}, LA7/u;->f(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    cmp-long v6, v3, v1

    .line 52
    .line 53
    if-gez v6, :cond_2

    .line 54
    .line 55
    const-wide/16 v14, -0x1

    .line 56
    .line 57
    cmp-long v6, v8, v14

    .line 58
    .line 59
    const-wide/16 v14, 0x1

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, LX1/g;->E()J

    .line 67
    .line 68
    .line 69
    move-result-wide v16

    .line 70
    add-long v16, v16, v10

    .line 71
    .line 72
    add-long v16, v16, v8

    .line 73
    .line 74
    sub-long v16, v16, v14

    .line 75
    .line 76
    cmp-long v0, v12, v16

    .line 77
    .line 78
    if-gez v0, :cond_2

    .line 79
    .line 80
    :cond_1
    add-long v8, v12, v14

    .line 81
    .line 82
    invoke-virtual {v5, v8, v9}, LA7/u;->f(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    :goto_1
    move-object/from16 v0, p3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move-wide v5, v3

    .line 90
    goto :goto_1

    .line 91
    :goto_2
    invoke-virtual/range {v0 .. v6}, LU1/a0;->a(JJJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    return-wide v0

    .line 96
    :cond_3
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    move-wide/from16 v1, p1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-wide p1
.end method

.method public final c(Ll2/e;)V
    .locals 13

    .line 1
    instance-of v0, p1, Ll2/k;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ll2/k;

    .line 7
    .line 8
    iget-object v1, p0, LX1/i;->j:Ln2/q;

    .line 9
    .line 10
    iget-object v0, v0, Ll2/e;->d:LN1/n;

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ln2/q;->q(LN1/n;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, LX1/i;->i:[LA7/u;

    .line 17
    .line 18
    aget-object v2, v1, v0

    .line 19
    .line 20
    iget-object v3, v2, LA7/u;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, LX1/g;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iget-object v3, v2, LA7/u;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ll2/d;

    .line 29
    .line 30
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, v3, Ll2/d;->h:Ls2/w;

    .line 34
    .line 35
    instance-of v4, v3, Ls2/h;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    check-cast v3, Ls2/h;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v3, 0x0

    .line 43
    :goto_0
    if-eqz v3, :cond_1

    .line 44
    .line 45
    new-instance v12, LA2/d;

    .line 46
    .line 47
    iget-object v4, v2, LA7/u;->e:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v7, v4

    .line 50
    check-cast v7, LY1/m;

    .line 51
    .line 52
    iget-wide v4, v7, LY1/m;->c:J

    .line 53
    .line 54
    const/16 v6, 0x8

    .line 55
    .line 56
    invoke-direct {v12, v3, v4, v5, v6}, LA2/d;-><init>(Ljava/lang/Object;JI)V

    .line 57
    .line 58
    .line 59
    new-instance v4, LA7/u;

    .line 60
    .line 61
    iget-object v3, v2, LA7/u;->d:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v9, v3

    .line 64
    check-cast v9, Ll2/d;

    .line 65
    .line 66
    iget-wide v10, v2, LA7/u;->c:J

    .line 67
    .line 68
    iget-wide v5, v2, LA7/u;->b:J

    .line 69
    .line 70
    iget-object v2, v2, LA7/u;->f:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v8, v2

    .line 73
    check-cast v8, LY1/b;

    .line 74
    .line 75
    invoke-direct/range {v4 .. v12}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 76
    .line 77
    .line 78
    aput-object v4, v1, v0

    .line 79
    .line 80
    :cond_1
    iget-object v0, p0, LX1/i;->h:LX1/l;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-wide v1, v0, LX1/l;->d:J

    .line 85
    .line 86
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    cmp-long v3, v1, v3

    .line 92
    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    iget-wide v3, p1, Ll2/e;->h:J

    .line 96
    .line 97
    cmp-long v1, v3, v1

    .line 98
    .line 99
    if-lez v1, :cond_3

    .line 100
    .line 101
    :cond_2
    iget-wide v1, p1, Ll2/e;->h:J

    .line 102
    .line 103
    iput-wide v1, v0, LX1/l;->d:J

    .line 104
    .line 105
    :cond_3
    const/4 p1, 0x1

    .line 106
    iget-object v0, v0, LX1/l;->e:LX1/m;

    .line 107
    .line 108
    iput-boolean p1, v0, LX1/m;->g:Z

    .line 109
    .line 110
    :cond_4
    return-void
.end method

.method public final d(JLl2/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LX1/i;->m:Lk2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, LX1/i;->j:Ln2/q;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Ln2/q;->r(JLl2/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final e(Ll2/e;ZLA/x;Lae/d;)Z
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    iget-object p2, p0, LX1/i;->h:LX1/l;

    .line 8
    .line 9
    if-eqz p2, :cond_5

    .line 10
    .line 11
    iget-wide v2, p2, LX1/l;->d:J

    .line 12
    .line 13
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v4, v2, v4

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    iget-wide v4, p1, Ll2/e;->g:J

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    move v2, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v2, v1

    .line 31
    :goto_0
    iget-object p2, p2, LX1/l;->e:LX1/m;

    .line 32
    .line 33
    iget-object v3, p2, LX1/m;->f:LY1/c;

    .line 34
    .line 35
    iget-boolean v3, v3, LY1/c;->d:Z

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-boolean v3, p2, LX1/m;->h:Z

    .line 41
    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :cond_3
    if-eqz v2, :cond_5

    .line 47
    .line 48
    iget-boolean p1, p2, LX1/m;->g:Z

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_4
    iput-boolean v0, p2, LX1/m;->h:Z

    .line 55
    .line 56
    iput-boolean v1, p2, LX1/m;->g:Z

    .line 57
    .line 58
    iget-object p1, p2, LX1/m;->b:LY9/c;

    .line 59
    .line 60
    iget-object p1, p1, LY9/c;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, LX1/f;

    .line 63
    .line 64
    iget-object p2, p1, LX1/f;->D:Landroid/os/Handler;

    .line 65
    .line 66
    iget-object p3, p1, LX1/f;->w:LX1/c;

    .line 67
    .line 68
    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, LX1/f;->z()V

    .line 72
    .line 73
    .line 74
    return v0

    .line 75
    :cond_5
    :goto_1
    iget-object p2, p0, LX1/i;->k:LY1/c;

    .line 76
    .line 77
    iget-boolean p2, p2, LY1/c;->d:Z

    .line 78
    .line 79
    iget-object v2, p0, LX1/i;->i:[LA7/u;

    .line 80
    .line 81
    if-nez p2, :cond_6

    .line 82
    .line 83
    instance-of p2, p1, Ll2/l;

    .line 84
    .line 85
    if-eqz p2, :cond_6

    .line 86
    .line 87
    iget-object p2, p3, LA/x;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p2, Ljava/io/IOException;

    .line 90
    .line 91
    instance-of v3, p2, LS1/u;

    .line 92
    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    check-cast p2, LS1/u;

    .line 96
    .line 97
    iget p2, p2, LS1/u;->d:I

    .line 98
    .line 99
    const/16 v3, 0x194

    .line 100
    .line 101
    if-ne p2, v3, :cond_6

    .line 102
    .line 103
    iget-object p2, p0, LX1/i;->j:Ln2/q;

    .line 104
    .line 105
    iget-object v3, p1, Ll2/e;->d:LN1/n;

    .line 106
    .line 107
    invoke-interface {p2, v3}, Ln2/q;->q(LN1/n;)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    aget-object p2, v2, p2

    .line 112
    .line 113
    invoke-virtual {p2}, LA7/u;->d()J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    const-wide/16 v5, -0x1

    .line 118
    .line 119
    cmp-long v5, v3, v5

    .line 120
    .line 121
    if-eqz v5, :cond_6

    .line 122
    .line 123
    const-wide/16 v5, 0x0

    .line 124
    .line 125
    cmp-long v5, v3, v5

    .line 126
    .line 127
    if-eqz v5, :cond_6

    .line 128
    .line 129
    iget-object v5, p2, LA7/u;->g:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v5, LX1/g;

    .line 132
    .line 133
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v5}, LX1/g;->E()J

    .line 137
    .line 138
    .line 139
    move-result-wide v5

    .line 140
    iget-wide v7, p2, LA7/u;->c:J

    .line 141
    .line 142
    add-long/2addr v5, v7

    .line 143
    add-long/2addr v5, v3

    .line 144
    const-wide/16 v3, 0x1

    .line 145
    .line 146
    sub-long/2addr v5, v3

    .line 147
    move-object p2, p1

    .line 148
    check-cast p2, Ll2/l;

    .line 149
    .line 150
    invoke-virtual {p2}, Ll2/l;->a()J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    cmp-long p2, v3, v5

    .line 155
    .line 156
    if-lez p2, :cond_6

    .line 157
    .line 158
    iput-boolean v0, p0, LX1/i;->n:Z

    .line 159
    .line 160
    return v0

    .line 161
    :cond_6
    iget-object p2, p0, LX1/i;->j:Ln2/q;

    .line 162
    .line 163
    iget-object v3, p1, Ll2/e;->d:LN1/n;

    .line 164
    .line 165
    invoke-interface {p2, v3}, Ln2/q;->q(LN1/n;)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    aget-object p2, v2, p2

    .line 170
    .line 171
    iget-object v2, p2, LA7/u;->e:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v2, LY1/m;

    .line 174
    .line 175
    iget-object v2, v2, LY1/m;->b:Ll8/K;

    .line 176
    .line 177
    iget-object v3, p0, LX1/i;->b:LS3/n;

    .line 178
    .line 179
    invoke-virtual {v3, v2}, LS3/n;->d(Ljava/util/List;)LY1/b;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget-object v4, p2, LA7/u;->f:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v4, LY1/b;

    .line 186
    .line 187
    if-eqz v2, :cond_7

    .line 188
    .line 189
    invoke-virtual {v4, v2}, LY1/b;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-nez v2, :cond_7

    .line 194
    .line 195
    goto/16 :goto_6

    .line 196
    .line 197
    :cond_7
    iget-object v2, p0, LX1/i;->j:Ln2/q;

    .line 198
    .line 199
    iget-object p2, p2, LA7/u;->e:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p2, LY1/m;

    .line 202
    .line 203
    iget-object p2, p2, LY1/m;->b:Ll8/K;

    .line 204
    .line 205
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v5

    .line 209
    invoke-interface {v2}, Ln2/q;->length()I

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    move v8, v1

    .line 214
    move v9, v8

    .line 215
    :goto_2
    if-ge v8, v7, :cond_9

    .line 216
    .line 217
    invoke-interface {v2, v8, v5, v6}, Ln2/q;->m(IJ)Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-eqz v10, :cond_8

    .line 222
    .line 223
    add-int/2addr v9, v0

    .line 224
    :cond_8
    add-int/2addr v8, v0

    .line 225
    goto :goto_2

    .line 226
    :cond_9
    new-instance v2, Ljava/util/HashSet;

    .line 227
    .line 228
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 229
    .line 230
    .line 231
    move v5, v1

    .line 232
    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-ge v5, v6, :cond_a

    .line 237
    .line 238
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    check-cast v6, LY1/b;

    .line 243
    .line 244
    iget v6, v6, LY1/b;->c:I

    .line 245
    .line 246
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    add-int/2addr v5, v0

    .line 254
    goto :goto_3

    .line 255
    :cond_a
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    new-instance v5, LF6/p;

    .line 260
    .line 261
    new-instance v6, Ljava/util/HashSet;

    .line 262
    .line 263
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, p2}, LS3/n;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    move v8, v1

    .line 271
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-ge v8, v10, :cond_b

    .line 276
    .line 277
    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    check-cast v10, LY1/b;

    .line 282
    .line 283
    iget v10, v10, LY1/b;->c:I

    .line 284
    .line 285
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    invoke-virtual {v6, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    add-int/2addr v8, v0

    .line 293
    goto :goto_4

    .line 294
    :cond_b
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    .line 295
    .line 296
    .line 297
    move-result p2

    .line 298
    sub-int p2, v2, p2

    .line 299
    .line 300
    invoke-direct {v5, v2, p2, v7, v9}, LF6/p;-><init>(IIII)V

    .line 301
    .line 302
    .line 303
    const/4 p2, 0x2

    .line 304
    invoke-virtual {v5, p2}, LF6/p;->a(I)Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-nez v2, :cond_c

    .line 309
    .line 310
    invoke-virtual {v5, v0}, LF6/p;->a(I)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-nez v2, :cond_c

    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_c
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v5, p3}, Lae/d;->f(LF6/p;LA/x;)LU5/f;

    .line 322
    .line 323
    .line 324
    move-result-object p3

    .line 325
    if-eqz p3, :cond_12

    .line 326
    .line 327
    iget p4, p3, LU5/f;->a:I

    .line 328
    .line 329
    invoke-virtual {v5, p4}, LF6/p;->a(I)Z

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    if-nez v2, :cond_d

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_d
    iget-wide v5, p3, LU5/f;->b:J

    .line 337
    .line 338
    if-ne p4, p2, :cond_e

    .line 339
    .line 340
    iget-object p2, p0, LX1/i;->j:Ln2/q;

    .line 341
    .line 342
    iget-object p1, p1, Ll2/e;->d:LN1/n;

    .line 343
    .line 344
    invoke-interface {p2, p1}, Ln2/q;->q(LN1/n;)I

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    invoke-interface {p2, p1, v5, v6}, Ln2/q;->o(IJ)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    return p1

    .line 353
    :cond_e
    if-ne p4, v0, :cond_12

    .line 354
    .line 355
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 356
    .line 357
    .line 358
    move-result-wide p1

    .line 359
    add-long/2addr p1, v5

    .line 360
    iget-object p3, v4, LY1/b;->b:Ljava/lang/String;

    .line 361
    .line 362
    iget-object p4, v3, LS3/n;->a:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p4, Ljava/util/HashMap;

    .line 365
    .line 366
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_f

    .line 371
    .line 372
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Ljava/lang/Long;

    .line 377
    .line 378
    sget v2, LQ1/x;->a:I

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 381
    .line 382
    .line 383
    move-result-wide v1

    .line 384
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 385
    .line 386
    .line 387
    move-result-wide v1

    .line 388
    goto :goto_5

    .line 389
    :cond_f
    move-wide v1, p1

    .line 390
    :goto_5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-virtual {p4, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    const/high16 p3, -0x80000000

    .line 398
    .line 399
    iget p4, v4, LY1/b;->c:I

    .line 400
    .line 401
    if-eq p4, p3, :cond_11

    .line 402
    .line 403
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object p3

    .line 407
    iget-object p4, v3, LS3/n;->b:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast p4, Ljava/util/HashMap;

    .line 410
    .line 411
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    if-eqz v1, :cond_10

    .line 416
    .line 417
    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, Ljava/lang/Long;

    .line 422
    .line 423
    sget v2, LQ1/x;->a:I

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 426
    .line 427
    .line 428
    move-result-wide v1

    .line 429
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 430
    .line 431
    .line 432
    move-result-wide p1

    .line 433
    :cond_10
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-virtual {p4, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    :cond_11
    :goto_6
    return v0

    .line 441
    :cond_12
    :goto_7
    return v1
.end method

.method public final f(LU1/C;JLjava/util/List;LE4/F;)V
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v4, v0, LX1/i;->m:Lk2/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    iget-wide v5, v4, LU1/C;->a:J

    .line 16
    .line 17
    sub-long v7, v1, v5

    .line 18
    .line 19
    iget-object v4, v0, LX1/i;->k:LY1/c;

    .line 20
    .line 21
    iget-wide v9, v4, LY1/c;->a:J

    .line 22
    .line 23
    invoke-static {v9, v10}, LQ1/x;->K(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    iget-object v4, v0, LX1/i;->k:LY1/c;

    .line 28
    .line 29
    iget v11, v0, LX1/i;->l:I

    .line 30
    .line 31
    invoke-virtual {v4, v11}, LY1/c;->b(I)LY1/h;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-wide v11, v4, LY1/h;->b:J

    .line 36
    .line 37
    invoke-static {v11, v12}, LQ1/x;->K(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v11

    .line 41
    add-long/2addr v11, v9

    .line 42
    add-long/2addr v11, v1

    .line 43
    const/4 v13, 0x0

    .line 44
    iget-object v9, v0, LX1/i;->h:LX1/l;

    .line 45
    .line 46
    if-eqz v9, :cond_8

    .line 47
    .line 48
    iget-object v9, v9, LX1/l;->e:LX1/m;

    .line 49
    .line 50
    iget-object v10, v9, LX1/m;->f:LY1/c;

    .line 51
    .line 52
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iget-boolean v14, v10, LY1/c;->d:Z

    .line 58
    .line 59
    if-nez v14, :cond_1

    .line 60
    .line 61
    move-wide/from16 v18, v5

    .line 62
    .line 63
    move v4, v13

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-boolean v14, v9, LX1/m;->h:Z

    .line 66
    .line 67
    if-eqz v14, :cond_2

    .line 68
    .line 69
    move-wide/from16 v18, v5

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v14, v9, LX1/m;->e:Ljava/util/TreeMap;

    .line 74
    .line 75
    move-wide/from16 v18, v5

    .line 76
    .line 77
    iget-wide v4, v10, LY1/c;->h:J

    .line 78
    .line 79
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v14, v4}, Ljava/util/TreeMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iget-object v5, v9, LX1/m;->b:LY9/c;

    .line 88
    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    cmp-long v6, v14, v11

    .line 102
    .line 103
    if-gez v6, :cond_5

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v10

    .line 115
    iget-object v4, v5, LY9/c;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, LX1/f;

    .line 118
    .line 119
    iget-wide v14, v4, LX1/f;->N:J

    .line 120
    .line 121
    cmp-long v6, v14, v16

    .line 122
    .line 123
    if-eqz v6, :cond_3

    .line 124
    .line 125
    cmp-long v6, v14, v10

    .line 126
    .line 127
    if-gez v6, :cond_4

    .line 128
    .line 129
    :cond_3
    iput-wide v10, v4, LX1/f;->N:J

    .line 130
    .line 131
    :cond_4
    const/4 v4, 0x1

    .line 132
    goto :goto_0

    .line 133
    :cond_5
    move v4, v13

    .line 134
    :goto_0
    if-eqz v4, :cond_7

    .line 135
    .line 136
    iget-boolean v6, v9, LX1/m;->g:Z

    .line 137
    .line 138
    if-nez v6, :cond_6

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    const/4 v6, 0x1

    .line 142
    iput-boolean v6, v9, LX1/m;->h:Z

    .line 143
    .line 144
    iput-boolean v13, v9, LX1/m;->g:Z

    .line 145
    .line 146
    iget-object v5, v5, LY9/c;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v5, LX1/f;

    .line 149
    .line 150
    iget-object v6, v5, LX1/f;->D:Landroid/os/Handler;

    .line 151
    .line 152
    iget-object v9, v5, LX1/f;->w:LX1/c;

    .line 153
    .line 154
    invoke-virtual {v6, v9}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, LX1/f;->z()V

    .line 158
    .line 159
    .line 160
    :cond_7
    :goto_1
    if-eqz v4, :cond_9

    .line 161
    .line 162
    :goto_2
    return-void

    .line 163
    :cond_8
    move-wide/from16 v18, v5

    .line 164
    .line 165
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    :cond_9
    iget-wide v4, v0, LX1/i;->f:J

    .line 171
    .line 172
    invoke-static {v4, v5}, LQ1/x;->x(J)J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v14

    .line 180
    iget-object v4, v0, LX1/i;->k:LY1/c;

    .line 181
    .line 182
    iget-wide v5, v4, LY1/c;->a:J

    .line 183
    .line 184
    cmp-long v9, v5, v16

    .line 185
    .line 186
    if-nez v9, :cond_a

    .line 187
    .line 188
    move-wide/from16 v4, v16

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_a
    iget v9, v0, LX1/i;->l:I

    .line 192
    .line 193
    invoke-virtual {v4, v9}, LY1/c;->b(I)LY1/h;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    iget-wide v9, v4, LY1/h;->b:J

    .line 198
    .line 199
    add-long/2addr v5, v9

    .line 200
    invoke-static {v5, v6}, LQ1/x;->K(J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    sub-long v4, v14, v4

    .line 205
    .line 206
    :goto_3
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    const/16 v20, 0x0

    .line 211
    .line 212
    if-eqz v6, :cond_b

    .line 213
    .line 214
    move-object/from16 v11, p4

    .line 215
    .line 216
    move-object/from16 v21, v20

    .line 217
    .line 218
    const/4 v6, 0x1

    .line 219
    goto :goto_4

    .line 220
    :cond_b
    move-object/from16 v11, p4

    .line 221
    .line 222
    const/4 v6, 0x1

    .line 223
    invoke-static {v6, v11}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    check-cast v9, Ll2/l;

    .line 228
    .line 229
    move-object/from16 v21, v9

    .line 230
    .line 231
    :goto_4
    iget-object v9, v0, LX1/i;->j:Ln2/q;

    .line 232
    .line 233
    invoke-interface {v9}, Ln2/q;->length()I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    new-array v12, v9, [Ll2/m;

    .line 238
    .line 239
    move v10, v13

    .line 240
    :goto_5
    iget-object v6, v0, LX1/i;->i:[LA7/u;

    .line 241
    .line 242
    if-ge v10, v9, :cond_f

    .line 243
    .line 244
    aget-object v6, v6, v10

    .line 245
    .line 246
    move/from16 v22, v13

    .line 247
    .line 248
    iget-object v13, v6, LA7/u;->g:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v13, LX1/g;

    .line 251
    .line 252
    sget-object v23, Ll2/m;->b9:Landroidx/fragment/app/X;

    .line 253
    .line 254
    if-nez v13, :cond_c

    .line 255
    .line 256
    aput-object v23, v12, v10

    .line 257
    .line 258
    move-wide/from16 v34, v4

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_c
    invoke-virtual {v6, v14, v15}, LA7/u;->b(J)J

    .line 262
    .line 263
    .line 264
    move-result-wide v26

    .line 265
    invoke-virtual {v6, v14, v15}, LA7/u;->c(J)J

    .line 266
    .line 267
    .line 268
    move-result-wide v28

    .line 269
    if-eqz v21, :cond_d

    .line 270
    .line 271
    invoke-virtual/range {v21 .. v21}, Ll2/l;->a()J

    .line 272
    .line 273
    .line 274
    move-result-wide v24

    .line 275
    move-wide/from16 v34, v4

    .line 276
    .line 277
    :goto_6
    move-wide/from16 v30, v24

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_d
    iget-object v13, v6, LA7/u;->g:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v13, LX1/g;

    .line 283
    .line 284
    invoke-static {v13}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    move-wide/from16 v34, v4

    .line 288
    .line 289
    iget-wide v4, v6, LA7/u;->b:J

    .line 290
    .line 291
    invoke-interface {v13, v1, v2, v4, v5}, LX1/g;->v(JJ)J

    .line 292
    .line 293
    .line 294
    move-result-wide v4

    .line 295
    move-wide/from16 v24, v4

    .line 296
    .line 297
    iget-wide v4, v6, LA7/u;->c:J

    .line 298
    .line 299
    add-long v24, v24, v4

    .line 300
    .line 301
    invoke-static/range {v24 .. v29}, LQ1/x;->j(JJJ)J

    .line 302
    .line 303
    .line 304
    move-result-wide v24

    .line 305
    goto :goto_6

    .line 306
    :goto_7
    cmp-long v4, v30, v26

    .line 307
    .line 308
    if-gez v4, :cond_e

    .line 309
    .line 310
    aput-object v23, v12, v10

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_e
    move-wide/from16 v32, v28

    .line 314
    .line 315
    invoke-virtual {v0, v10}, LX1/i;->i(I)LA7/u;

    .line 316
    .line 317
    .line 318
    move-result-object v29

    .line 319
    new-instance v28, LX1/h;

    .line 320
    .line 321
    invoke-direct/range {v28 .. v33}, LX1/h;-><init>(LA7/u;JJ)V

    .line 322
    .line 323
    .line 324
    aput-object v28, v12, v10

    .line 325
    .line 326
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 327
    .line 328
    move/from16 v13, v22

    .line 329
    .line 330
    move-wide/from16 v4, v34

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_f
    move-wide/from16 v34, v4

    .line 334
    .line 335
    move/from16 v22, v13

    .line 336
    .line 337
    iget-object v4, v0, LX1/i;->k:LY1/c;

    .line 338
    .line 339
    iget-boolean v4, v4, LY1/c;->d:Z

    .line 340
    .line 341
    const-wide/16 v9, 0x0

    .line 342
    .line 343
    if-eqz v4, :cond_10

    .line 344
    .line 345
    aget-object v4, v6, v22

    .line 346
    .line 347
    invoke-virtual {v4}, LA7/u;->d()J

    .line 348
    .line 349
    .line 350
    move-result-wide v4

    .line 351
    cmp-long v4, v4, v9

    .line 352
    .line 353
    if-nez v4, :cond_11

    .line 354
    .line 355
    :cond_10
    move-wide/from16 v25, v7

    .line 356
    .line 357
    move-wide v6, v9

    .line 358
    goto :goto_a

    .line 359
    :cond_11
    aget-object v4, v6, v22

    .line 360
    .line 361
    invoke-virtual {v4, v14, v15}, LA7/u;->c(J)J

    .line 362
    .line 363
    .line 364
    move-result-wide v4

    .line 365
    aget-object v6, v6, v22

    .line 366
    .line 367
    invoke-virtual {v6, v4, v5}, LA7/u;->e(J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v4

    .line 371
    iget-object v6, v0, LX1/i;->k:LY1/c;

    .line 372
    .line 373
    iget-wide v9, v6, LY1/c;->a:J

    .line 374
    .line 375
    cmp-long v13, v9, v16

    .line 376
    .line 377
    if-nez v13, :cond_12

    .line 378
    .line 379
    move-wide/from16 v25, v7

    .line 380
    .line 381
    move-wide/from16 v6, v16

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_12
    iget v13, v0, LX1/i;->l:I

    .line 385
    .line 386
    invoke-virtual {v6, v13}, LY1/c;->b(I)LY1/h;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    move-wide/from16 v25, v7

    .line 391
    .line 392
    iget-wide v6, v6, LY1/h;->b:J

    .line 393
    .line 394
    add-long/2addr v9, v6

    .line 395
    invoke-static {v9, v10}, LQ1/x;->K(J)J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    sub-long v6, v14, v6

    .line 400
    .line 401
    :goto_9
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 402
    .line 403
    .line 404
    move-result-wide v4

    .line 405
    sub-long v4, v4, v18

    .line 406
    .line 407
    const-wide/16 v6, 0x0

    .line 408
    .line 409
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 410
    .line 411
    .line 412
    move-result-wide v4

    .line 413
    move-wide v9, v4

    .line 414
    goto :goto_b

    .line 415
    :goto_a
    move-wide/from16 v9, v16

    .line 416
    .line 417
    :goto_b
    iget-object v4, v0, LX1/i;->j:Ln2/q;

    .line 418
    .line 419
    move-wide/from16 v23, v6

    .line 420
    .line 421
    move-wide/from16 v5, v18

    .line 422
    .line 423
    move-wide/from16 v7, v25

    .line 424
    .line 425
    move-wide/from16 v36, v34

    .line 426
    .line 427
    const/4 v13, 0x1

    .line 428
    invoke-interface/range {v4 .. v12}, Ln2/q;->l(JJJLjava/util/List;[Ll2/m;)V

    .line 429
    .line 430
    .line 431
    iget-object v4, v0, LX1/i;->j:Ln2/q;

    .line 432
    .line 433
    invoke-interface {v4}, Ln2/q;->n()I

    .line 434
    .line 435
    .line 436
    move-result v4

    .line 437
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v4}, LX1/i;->i(I)LA7/u;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    iget-object v5, v4, LA7/u;->g:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v5, LX1/g;

    .line 447
    .line 448
    iget-object v6, v4, LA7/u;->f:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v6, LY1/b;

    .line 451
    .line 452
    iget-object v7, v4, LA7/u;->d:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v7, Ll2/d;

    .line 455
    .line 456
    iget-object v8, v4, LA7/u;->e:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v8, LY1/m;

    .line 459
    .line 460
    if-eqz v7, :cond_15

    .line 461
    .line 462
    iget-object v9, v7, Ll2/d;->i:[LN1/n;

    .line 463
    .line 464
    if-nez v9, :cond_13

    .line 465
    .line 466
    iget-object v9, v8, LY1/m;->e:LY1/j;

    .line 467
    .line 468
    goto :goto_c

    .line 469
    :cond_13
    move-object/from16 v9, v20

    .line 470
    .line 471
    :goto_c
    if-nez v5, :cond_14

    .line 472
    .line 473
    invoke-virtual {v8}, LY1/m;->d()LY1/j;

    .line 474
    .line 475
    .line 476
    move-result-object v20

    .line 477
    :cond_14
    move-object/from16 v10, v20

    .line 478
    .line 479
    if-nez v9, :cond_16

    .line 480
    .line 481
    if-eqz v10, :cond_15

    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_15
    move/from16 v10, v22

    .line 485
    .line 486
    goto :goto_f

    .line 487
    :cond_16
    :goto_d
    iget-object v1, v0, LX1/i;->j:Ln2/q;

    .line 488
    .line 489
    invoke-interface {v1}, Ln2/q;->j()LN1/n;

    .line 490
    .line 491
    .line 492
    move-result-object v14

    .line 493
    iget-object v1, v0, LX1/i;->j:Ln2/q;

    .line 494
    .line 495
    invoke-interface {v1}, Ln2/q;->u()I

    .line 496
    .line 497
    .line 498
    move-result v15

    .line 499
    iget-object v1, v0, LX1/i;->j:Ln2/q;

    .line 500
    .line 501
    invoke-interface {v1}, Ln2/q;->p()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v16

    .line 505
    if-eqz v9, :cond_18

    .line 506
    .line 507
    iget-object v1, v6, LY1/b;->a:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v9, v10, v1}, LY1/j;->a(LY1/j;Ljava/lang/String;)LY1/j;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    if-nez v1, :cond_17

    .line 514
    .line 515
    goto :goto_e

    .line 516
    :cond_17
    move-object v9, v1

    .line 517
    goto :goto_e

    .line 518
    :cond_18
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    move-object v9, v10

    .line 522
    :goto_e
    iget-object v1, v6, LY1/b;->a:Ljava/lang/String;

    .line 523
    .line 524
    move/from16 v10, v22

    .line 525
    .line 526
    invoke-static {v8, v1, v9, v10}, LA6/c;->k(LY1/m;Ljava/lang/String;LY1/j;I)LS1/k;

    .line 527
    .line 528
    .line 529
    move-result-object v13

    .line 530
    new-instance v11, Ll2/k;

    .line 531
    .line 532
    iget-object v1, v4, LA7/u;->d:Ljava/lang/Object;

    .line 533
    .line 534
    move-object/from16 v17, v1

    .line 535
    .line 536
    check-cast v17, Ll2/d;

    .line 537
    .line 538
    iget-object v12, v0, LX1/i;->e:LS1/h;

    .line 539
    .line 540
    invoke-direct/range {v11 .. v17}, Ll2/k;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;Ll2/d;)V

    .line 541
    .line 542
    .line 543
    iput-object v11, v3, LE4/F;->c:Ljava/lang/Object;

    .line 544
    .line 545
    return-void

    .line 546
    :goto_f
    iget-object v9, v0, LX1/i;->k:LY1/c;

    .line 547
    .line 548
    iget-boolean v11, v9, LY1/c;->d:Z

    .line 549
    .line 550
    if-eqz v11, :cond_19

    .line 551
    .line 552
    iget v11, v0, LX1/i;->l:I

    .line 553
    .line 554
    iget-object v9, v9, LY1/c;->m:Ljava/util/List;

    .line 555
    .line 556
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    sub-int/2addr v9, v13

    .line 561
    if-ne v11, v9, :cond_19

    .line 562
    .line 563
    move v9, v13

    .line 564
    goto :goto_10

    .line 565
    :cond_19
    move v9, v10

    .line 566
    :goto_10
    iget-wide v11, v4, LA7/u;->b:J

    .line 567
    .line 568
    if-eqz v9, :cond_1a

    .line 569
    .line 570
    cmp-long v18, v11, v16

    .line 571
    .line 572
    if-eqz v18, :cond_1b

    .line 573
    .line 574
    :cond_1a
    move v10, v13

    .line 575
    :cond_1b
    invoke-virtual {v4}, LA7/u;->d()J

    .line 576
    .line 577
    .line 578
    move-result-wide v18

    .line 579
    cmp-long v18, v18, v23

    .line 580
    .line 581
    if-nez v18, :cond_1c

    .line 582
    .line 583
    iput-boolean v10, v3, LE4/F;->b:Z

    .line 584
    .line 585
    return-void

    .line 586
    :cond_1c
    invoke-virtual {v4, v14, v15}, LA7/u;->b(J)J

    .line 587
    .line 588
    .line 589
    move-result-wide v25

    .line 590
    invoke-virtual {v4, v14, v15}, LA7/u;->c(J)J

    .line 591
    .line 592
    .line 593
    move-result-wide v14

    .line 594
    if-eqz v9, :cond_1e

    .line 595
    .line 596
    invoke-virtual {v4, v14, v15}, LA7/u;->e(J)J

    .line 597
    .line 598
    .line 599
    move-result-wide v18

    .line 600
    invoke-virtual {v4, v14, v15}, LA7/u;->f(J)J

    .line 601
    .line 602
    .line 603
    move-result-wide v23

    .line 604
    sub-long v23, v18, v23

    .line 605
    .line 606
    add-long v23, v23, v18

    .line 607
    .line 608
    cmp-long v9, v23, v11

    .line 609
    .line 610
    if-ltz v9, :cond_1d

    .line 611
    .line 612
    move v9, v13

    .line 613
    goto :goto_11

    .line 614
    :cond_1d
    const/4 v9, 0x0

    .line 615
    :goto_11
    and-int/2addr v10, v9

    .line 616
    :cond_1e
    move-wide/from16 v27, v14

    .line 617
    .line 618
    iget-wide v13, v4, LA7/u;->c:J

    .line 619
    .line 620
    if-eqz v21, :cond_1f

    .line 621
    .line 622
    invoke-virtual/range {v21 .. v21}, Ll2/l;->a()J

    .line 623
    .line 624
    .line 625
    move-result-wide v18

    .line 626
    :goto_12
    move-wide/from16 v1, v18

    .line 627
    .line 628
    goto :goto_13

    .line 629
    :cond_1f
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v5, v1, v2, v11, v12}, LX1/g;->v(JJ)J

    .line 633
    .line 634
    .line 635
    move-result-wide v18

    .line 636
    add-long v23, v18, v13

    .line 637
    .line 638
    invoke-static/range {v23 .. v28}, LQ1/x;->j(JJJ)J

    .line 639
    .line 640
    .line 641
    move-result-wide v18

    .line 642
    goto :goto_12

    .line 643
    :goto_13
    cmp-long v9, v1, v25

    .line 644
    .line 645
    if-gez v9, :cond_20

    .line 646
    .line 647
    new-instance v1, Lk2/b;

    .line 648
    .line 649
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 650
    .line 651
    .line 652
    iput-object v1, v0, LX1/i;->m:Lk2/b;

    .line 653
    .line 654
    return-void

    .line 655
    :cond_20
    cmp-long v9, v1, v27

    .line 656
    .line 657
    if-gtz v9, :cond_2c

    .line 658
    .line 659
    iget-boolean v15, v0, LX1/i;->n:Z

    .line 660
    .line 661
    if-eqz v15, :cond_21

    .line 662
    .line 663
    if-ltz v9, :cond_21

    .line 664
    .line 665
    goto/16 :goto_1d

    .line 666
    .line 667
    :cond_21
    if-eqz v10, :cond_22

    .line 668
    .line 669
    invoke-virtual {v4, v1, v2}, LA7/u;->f(J)J

    .line 670
    .line 671
    .line 672
    move-result-wide v9

    .line 673
    cmp-long v9, v9, v11

    .line 674
    .line 675
    if-ltz v9, :cond_22

    .line 676
    .line 677
    const/4 v9, 0x1

    .line 678
    iput-boolean v9, v3, LE4/F;->b:Z

    .line 679
    .line 680
    return-void

    .line 681
    :cond_22
    iget v9, v0, LX1/i;->g:I

    .line 682
    .line 683
    int-to-long v9, v9

    .line 684
    sub-long v18, v27, v1

    .line 685
    .line 686
    const-wide/16 v20, 0x1

    .line 687
    .line 688
    move-wide/from16 v23, v11

    .line 689
    .line 690
    add-long v11, v18, v20

    .line 691
    .line 692
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 693
    .line 694
    .line 695
    move-result-wide v9

    .line 696
    long-to-int v9, v9

    .line 697
    cmp-long v10, v23, v16

    .line 698
    .line 699
    if-eqz v10, :cond_23

    .line 700
    .line 701
    :goto_14
    const/4 v11, 0x1

    .line 702
    if-le v9, v11, :cond_23

    .line 703
    .line 704
    int-to-long v11, v9

    .line 705
    add-long/2addr v11, v1

    .line 706
    sub-long v11, v11, v20

    .line 707
    .line 708
    invoke-virtual {v4, v11, v12}, LA7/u;->f(J)J

    .line 709
    .line 710
    .line 711
    move-result-wide v11

    .line 712
    cmp-long v11, v11, v23

    .line 713
    .line 714
    if-ltz v11, :cond_23

    .line 715
    .line 716
    add-int/lit8 v9, v9, -0x1

    .line 717
    .line 718
    goto :goto_14

    .line 719
    :cond_23
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 720
    .line 721
    .line 722
    move-result v11

    .line 723
    if-eqz v11, :cond_24

    .line 724
    .line 725
    move-wide/from16 v48, p2

    .line 726
    .line 727
    goto :goto_15

    .line 728
    :cond_24
    move-wide/from16 v48, v16

    .line 729
    .line 730
    :goto_15
    iget-object v11, v0, LX1/i;->j:Ln2/q;

    .line 731
    .line 732
    invoke-interface {v11}, Ln2/q;->j()LN1/n;

    .line 733
    .line 734
    .line 735
    move-result-object v41

    .line 736
    iget-object v11, v0, LX1/i;->j:Ln2/q;

    .line 737
    .line 738
    invoke-interface {v11}, Ln2/q;->u()I

    .line 739
    .line 740
    .line 741
    move-result v42

    .line 742
    iget-object v11, v0, LX1/i;->j:Ln2/q;

    .line 743
    .line 744
    invoke-interface {v11}, Ln2/q;->p()Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v43

    .line 748
    invoke-virtual {v4, v1, v2}, LA7/u;->f(J)J

    .line 749
    .line 750
    .line 751
    move-result-wide v44

    .line 752
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    sub-long v11, v1, v13

    .line 756
    .line 757
    invoke-interface {v5, v11, v12}, LX1/g;->u(J)LY1/j;

    .line 758
    .line 759
    .line 760
    move-result-object v11

    .line 761
    iget-object v12, v0, LX1/i;->e:LS1/h;

    .line 762
    .line 763
    if-nez v7, :cond_26

    .line 764
    .line 765
    invoke-virtual {v4, v1, v2}, LA7/u;->e(J)J

    .line 766
    .line 767
    .line 768
    move-result-wide v46

    .line 769
    move-wide/from16 v9, v36

    .line 770
    .line 771
    invoke-virtual {v4, v1, v2, v9, v10}, LA7/u;->g(JJ)Z

    .line 772
    .line 773
    .line 774
    move-result v4

    .line 775
    if-eqz v4, :cond_25

    .line 776
    .line 777
    const/4 v13, 0x0

    .line 778
    goto :goto_16

    .line 779
    :cond_25
    const/16 v13, 0x8

    .line 780
    .line 781
    :goto_16
    iget-object v4, v6, LY1/b;->a:Ljava/lang/String;

    .line 782
    .line 783
    invoke-static {v8, v4, v11, v13}, LA6/c;->k(LY1/m;Ljava/lang/String;LY1/j;I)LS1/k;

    .line 784
    .line 785
    .line 786
    move-result-object v40

    .line 787
    new-instance v38, Ll2/n;

    .line 788
    .line 789
    iget v4, v0, LX1/i;->d:I

    .line 790
    .line 791
    move-object/from16 v51, v41

    .line 792
    .line 793
    move-wide/from16 v48, v1

    .line 794
    .line 795
    move/from16 v50, v4

    .line 796
    .line 797
    move-object/from16 v39, v12

    .line 798
    .line 799
    invoke-direct/range {v38 .. v51}, Ll2/n;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJILN1/n;)V

    .line 800
    .line 801
    .line 802
    :goto_17
    move-object/from16 v1, v38

    .line 803
    .line 804
    goto/16 :goto_1c

    .line 805
    .line 806
    :cond_26
    move-wide/from16 v52, v1

    .line 807
    .line 808
    move-object/from16 v39, v12

    .line 809
    .line 810
    move-wide/from16 v1, v36

    .line 811
    .line 812
    move-object/from16 v7, v41

    .line 813
    .line 814
    move-object v15, v11

    .line 815
    const/4 v11, 0x1

    .line 816
    const/4 v12, 0x1

    .line 817
    :goto_18
    if-ge v11, v9, :cond_28

    .line 818
    .line 819
    move/from16 v19, v9

    .line 820
    .line 821
    move/from16 v18, v10

    .line 822
    .line 823
    int-to-long v9, v11

    .line 824
    add-long v9, v52, v9

    .line 825
    .line 826
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    sub-long/2addr v9, v13

    .line 830
    invoke-interface {v5, v9, v10}, LX1/g;->u(J)LY1/j;

    .line 831
    .line 832
    .line 833
    move-result-object v9

    .line 834
    iget-object v10, v6, LY1/b;->a:Ljava/lang/String;

    .line 835
    .line 836
    invoke-virtual {v15, v9, v10}, LY1/j;->a(LY1/j;Ljava/lang/String;)LY1/j;

    .line 837
    .line 838
    .line 839
    move-result-object v9

    .line 840
    if-nez v9, :cond_27

    .line 841
    .line 842
    goto :goto_19

    .line 843
    :cond_27
    add-int/lit8 v12, v12, 0x1

    .line 844
    .line 845
    add-int/lit8 v11, v11, 0x1

    .line 846
    .line 847
    move-object v15, v9

    .line 848
    move/from16 v10, v18

    .line 849
    .line 850
    move/from16 v9, v19

    .line 851
    .line 852
    goto :goto_18

    .line 853
    :cond_28
    move/from16 v18, v10

    .line 854
    .line 855
    :goto_19
    int-to-long v9, v12

    .line 856
    add-long v9, v52, v9

    .line 857
    .line 858
    sub-long v9, v9, v20

    .line 859
    .line 860
    invoke-virtual {v4, v9, v10}, LA7/u;->e(J)J

    .line 861
    .line 862
    .line 863
    move-result-wide v46

    .line 864
    if-eqz v18, :cond_29

    .line 865
    .line 866
    cmp-long v5, v23, v46

    .line 867
    .line 868
    if-gtz v5, :cond_29

    .line 869
    .line 870
    move-wide/from16 v50, v23

    .line 871
    .line 872
    goto :goto_1a

    .line 873
    :cond_29
    move-wide/from16 v50, v16

    .line 874
    .line 875
    :goto_1a
    invoke-virtual {v4, v9, v10, v1, v2}, LA7/u;->g(JJ)Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-eqz v1, :cond_2a

    .line 880
    .line 881
    const/4 v13, 0x0

    .line 882
    goto :goto_1b

    .line 883
    :cond_2a
    const/16 v13, 0x8

    .line 884
    .line 885
    :goto_1b
    iget-object v1, v6, LY1/b;->a:Ljava/lang/String;

    .line 886
    .line 887
    invoke-static {v8, v1, v15, v13}, LA6/c;->k(LY1/m;Ljava/lang/String;LY1/j;I)LS1/k;

    .line 888
    .line 889
    .line 890
    move-result-object v40

    .line 891
    iget-wide v1, v8, LY1/m;->c:J

    .line 892
    .line 893
    neg-long v1, v1

    .line 894
    iget-object v5, v7, LN1/n;->n:Ljava/lang/String;

    .line 895
    .line 896
    invoke-static {v5}, LN1/C;->j(Ljava/lang/String;)Z

    .line 897
    .line 898
    .line 899
    move-result v5

    .line 900
    if-eqz v5, :cond_2b

    .line 901
    .line 902
    add-long v1, v1, v44

    .line 903
    .line 904
    :cond_2b
    move-wide/from16 v55, v1

    .line 905
    .line 906
    new-instance v38, Ll2/j;

    .line 907
    .line 908
    iget-object v1, v4, LA7/u;->d:Ljava/lang/Object;

    .line 909
    .line 910
    move-object/from16 v57, v1

    .line 911
    .line 912
    check-cast v57, Ll2/d;

    .line 913
    .line 914
    move-object/from16 v41, v7

    .line 915
    .line 916
    move/from16 v54, v12

    .line 917
    .line 918
    invoke-direct/range {v38 .. v57}, Ll2/j;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJJJIJLl2/f;)V

    .line 919
    .line 920
    .line 921
    goto :goto_17

    .line 922
    :goto_1c
    iput-object v1, v3, LE4/F;->c:Ljava/lang/Object;

    .line 923
    .line 924
    return-void

    .line 925
    :cond_2c
    :goto_1d
    iput-boolean v10, v3, LE4/F;->b:Z

    .line 926
    .line 927
    return-void
.end method

.method public final g(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, LX1/i;->m:Lk2/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LX1/i;->j:Ln2/q;

    .line 6
    .line 7
    invoke-interface {v0}, Ln2/q;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LX1/i;->j:Ln2/q;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, Ln2/q;->s(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final h()Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object v0, p0, LX1/i;->k:LY1/c;

    .line 2
    .line 3
    iget v1, p0, LX1/i;->l:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LY1/c;->b(I)LY1/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, LY1/h;->c:Ljava/util/List;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LX1/i;->c:[I

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_0

    .line 21
    .line 22
    aget v5, v2, v4

    .line 23
    .line 24
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, LY1/a;

    .line 29
    .line 30
    iget-object v5, v5, LY1/a;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v1
.end method

.method public final i(I)LA7/u;
    .locals 13

    .line 1
    iget-object v0, p0, LX1/i;->i:[LA7/u;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    iget-object v2, v1, LA7/u;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LY1/m;

    .line 8
    .line 9
    iget-object v2, v2, LY1/m;->b:Ll8/K;

    .line 10
    .line 11
    iget-object v3, p0, LX1/i;->b:LS3/n;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, LS3/n;->d(Ljava/util/List;)LY1/b;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    if-eqz v8, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, LA7/u;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LY1/b;

    .line 22
    .line 23
    invoke-virtual {v8, v2}, LY1/b;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v4, LA7/u;

    .line 30
    .line 31
    iget-wide v10, v1, LA7/u;->c:J

    .line 32
    .line 33
    iget-object v2, v1, LA7/u;->g:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v12, v2

    .line 36
    check-cast v12, LX1/g;

    .line 37
    .line 38
    iget-wide v5, v1, LA7/u;->b:J

    .line 39
    .line 40
    iget-object v2, v1, LA7/u;->e:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v7, v2

    .line 43
    check-cast v7, LY1/m;

    .line 44
    .line 45
    iget-object v1, v1, LA7/u;->d:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v9, v1

    .line 48
    check-cast v9, Ll2/d;

    .line 49
    .line 50
    invoke-direct/range {v4 .. v12}, LA7/u;-><init>(JLY1/m;LY1/b;Ll2/d;JLX1/g;)V

    .line 51
    .line 52
    .line 53
    aput-object v4, v0, p1

    .line 54
    .line 55
    return-object v4

    .line 56
    :cond_0
    return-object v1
.end method

.method public final release()V
    .locals 4

    .line 1
    iget-object v0, p0, LX1/i;->i:[LA7/u;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget-object v3, v3, LA7/u;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Ll2/d;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v3, Ll2/d;->a:Ls2/m;

    .line 16
    .line 17
    invoke-interface {v3}, Ls2/m;->release()V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method
