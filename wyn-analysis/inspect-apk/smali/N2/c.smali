.class public final LN2/c;
.super LN2/i;
.source "SourceFile"


# instance fields
.field public o:LJ5/p;

.field public p:LA7/B1;


# virtual methods
.method public final b(LQ1/o;)J
    .locals 4

    .line 1
    iget-object v0, p1, LQ1/o;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v2, v0, v1

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    if-ne v2, v3, :cond_2

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    aget-byte v0, v0, v2

    .line 11
    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    shr-int/2addr v0, v2

    .line 16
    const/4 v3, 0x6

    .line 17
    if-eq v0, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    if-ne v0, v3, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p1, v2}, LQ1/o;->H(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, LQ1/o;->B()J

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {v0, p1}, Ls2/a;->v(ILQ1/o;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1, v1}, LQ1/o;->G(I)V

    .line 33
    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    return-wide v0

    .line 37
    :cond_2
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    return-wide v0
.end method

.method public final d(LQ1/o;JLS3/c;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, LQ1/o;->a:[B

    .line 8
    .line 9
    iget-object v4, v0, LN2/c;->o:LJ5/p;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    new-instance v4, LJ5/p;

    .line 15
    .line 16
    const/16 v6, 0x11

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    invoke-direct {v4, v3, v6, v7}, LJ5/p;-><init>([BII)V

    .line 20
    .line 21
    .line 22
    iput-object v4, v0, LN2/c;->o:LJ5/p;

    .line 23
    .line 24
    iget v1, v1, LQ1/o;->c:I

    .line 25
    .line 26
    const/16 v6, 0x9

    .line 27
    .line 28
    invoke-static {v3, v6, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v4, v1, v3}, LJ5/p;->e([BLN1/B;)LN1/n;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v2, LS3/c;->b:Ljava/lang/Object;

    .line 38
    .line 39
    return v5

    .line 40
    :cond_0
    const/4 v6, 0x0

    .line 41
    aget-byte v3, v3, v6

    .line 42
    .line 43
    and-int/lit8 v7, v3, 0x7f

    .line 44
    .line 45
    const/4 v8, 0x3

    .line 46
    if-ne v7, v8, :cond_1

    .line 47
    .line 48
    invoke-static {v1}, Ls2/a;->w(LQ1/o;)LY2/B;

    .line 49
    .line 50
    .line 51
    move-result-object v19

    .line 52
    new-instance v9, LJ5/p;

    .line 53
    .line 54
    iget-wide v1, v4, LJ5/p;->k:J

    .line 55
    .line 56
    iget-object v3, v4, LJ5/p;->m:Landroid/os/Parcelable;

    .line 57
    .line 58
    move-object/from16 v20, v3

    .line 59
    .line 60
    check-cast v20, LN1/B;

    .line 61
    .line 62
    iget v10, v4, LJ5/p;->b:I

    .line 63
    .line 64
    iget v11, v4, LJ5/p;->c:I

    .line 65
    .line 66
    iget v12, v4, LJ5/p;->d:I

    .line 67
    .line 68
    iget v13, v4, LJ5/p;->e:I

    .line 69
    .line 70
    iget v14, v4, LJ5/p;->f:I

    .line 71
    .line 72
    iget v15, v4, LJ5/p;->h:I

    .line 73
    .line 74
    iget v3, v4, LJ5/p;->i:I

    .line 75
    .line 76
    move-wide/from16 v17, v1

    .line 77
    .line 78
    move/from16 v16, v3

    .line 79
    .line 80
    invoke-direct/range {v9 .. v20}, LJ5/p;-><init>(IIIIIIIJLY2/B;LN1/B;)V

    .line 81
    .line 82
    .line 83
    move-object/from16 v1, v19

    .line 84
    .line 85
    iput-object v9, v0, LN2/c;->o:LJ5/p;

    .line 86
    .line 87
    new-instance v2, LA7/B1;

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    invoke-direct {v2, v3}, LA7/B1;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object v9, v2, LA7/B1;->d:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v1, v2, LA7/B1;->e:Ljava/lang/Object;

    .line 96
    .line 97
    const-wide/16 v3, -0x1

    .line 98
    .line 99
    iput-wide v3, v2, LA7/B1;->b:J

    .line 100
    .line 101
    iput-wide v3, v2, LA7/B1;->c:J

    .line 102
    .line 103
    iput-object v2, v0, LN2/c;->p:LA7/B1;

    .line 104
    .line 105
    return v5

    .line 106
    :cond_1
    const/4 v1, -0x1

    .line 107
    if-ne v3, v1, :cond_3

    .line 108
    .line 109
    iget-object v1, v0, LN2/c;->p:LA7/B1;

    .line 110
    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    move-wide/from16 v3, p2

    .line 114
    .line 115
    iput-wide v3, v1, LA7/B1;->b:J

    .line 116
    .line 117
    iput-object v1, v2, LS3/c;->c:Ljava/lang/Object;

    .line 118
    .line 119
    :cond_2
    iget-object v1, v2, LS3/c;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, LN1/n;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    return v6

    .line 127
    :cond_3
    return v5
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LN2/i;->f(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LN2/c;->o:LJ5/p;

    .line 8
    .line 9
    iput-object p1, p0, LN2/c;->p:LA7/B1;

    .line 10
    .line 11
    :cond_0
    return-void
.end method
