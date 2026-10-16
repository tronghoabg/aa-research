.class public final LN2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public final f:[I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 p1, 0xff

    .line 8
    .line 9
    new-array v0, p1, [I

    .line 10
    .line 11
    iput-object v0, p0, LN2/f;->f:[I

    .line 12
    .line 13
    new-instance v0, LQ1/o;

    .line 14
    .line 15
    invoke-direct {v0, p1}, LQ1/o;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LN2/f;->g:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    const/16 p1, 0xff

    .line 25
    .line 26
    new-array v0, p1, [I

    .line 27
    .line 28
    iput-object v0, p0, LN2/f;->f:[I

    .line 29
    .line 30
    new-instance v0, LY4/b;

    .line 31
    .line 32
    invoke-direct {v0, p1}, LY4/b;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LN2/f;->g:Ljava/lang/Object;

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(LJ5/h;Z)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LN2/f;->a:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, LN2/f;->b:J

    .line 7
    .line 8
    iput v0, p0, LN2/f;->c:I

    .line 9
    .line 10
    iput v0, p0, LN2/f;->d:I

    .line 11
    .line 12
    iput v0, p0, LN2/f;->e:I

    .line 13
    .line 14
    iget-object v1, p0, LN2/f;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LY4/b;

    .line 17
    .line 18
    const/16 v2, 0x1b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, LY4/b;->x(I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, LY4/b;->a:[B

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1, v3, v0, v2, p2}, LJ5/h;->c([BIIZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    if-eqz p2, :cond_7

    .line 32
    .line 33
    move v2, v0

    .line 34
    :goto_0
    if-eqz v2, :cond_6

    .line 35
    .line 36
    invoke-virtual {v1}, LY4/b;->r()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const-wide/32 v4, 0x4f676753

    .line 41
    .line 42
    .line 43
    cmp-long v2, v2, v4

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_0
    invoke-virtual {v1}, LY4/b;->q()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    const-string p1, "unsupported bit stream revision"

    .line 58
    .line 59
    invoke-static {p1}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-virtual {v1}, LY4/b;->q()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, LN2/f;->a:I

    .line 69
    .line 70
    invoke-virtual {v1}, LY4/b;->g()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    iput-wide v2, p0, LN2/f;->b:J

    .line 75
    .line 76
    invoke-virtual {v1}, LY4/b;->h()J

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, LY4/b;->h()J

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, LY4/b;->h()J

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LY4/b;->q()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iput v2, p0, LN2/f;->c:I

    .line 90
    .line 91
    add-int/lit8 v3, v2, 0x1b

    .line 92
    .line 93
    iput v3, p0, LN2/f;->d:I

    .line 94
    .line 95
    invoke-virtual {v1, v2}, LY4/b;->x(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, LY4/b;->a:[B

    .line 99
    .line 100
    iget v3, p0, LN2/f;->c:I

    .line 101
    .line 102
    :try_start_1
    invoke-virtual {p1, v2, v0, v3, p2}, LJ5/h;->c([BIIZ)Z

    .line 103
    .line 104
    .line 105
    move-result p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    goto :goto_1

    .line 107
    :catch_1
    move-exception p1

    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    move p1, v0

    .line 111
    :goto_1
    if-nez p1, :cond_3

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    :goto_2
    iget p1, p0, LN2/f;->c:I

    .line 115
    .line 116
    if-ge v0, p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v1}, LY4/b;->q()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget-object p2, p0, LN2/f;->f:[I

    .line 123
    .line 124
    aput p1, p2, v0

    .line 125
    .line 126
    iget p2, p0, LN2/f;->e:I

    .line 127
    .line 128
    add-int/2addr p2, p1

    .line 129
    iput p2, p0, LN2/f;->e:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 p1, 0x1

    .line 135
    return p1

    .line 136
    :cond_5
    throw p1

    .line 137
    :cond_6
    :goto_3
    return v0

    .line 138
    :cond_7
    throw v2
.end method

.method public b(Ls2/j;Z)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LN2/f;->a:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, LN2/f;->b:J

    .line 7
    .line 8
    iput v0, p0, LN2/f;->c:I

    .line 9
    .line 10
    iput v0, p0, LN2/f;->d:I

    .line 11
    .line 12
    iput v0, p0, LN2/f;->e:I

    .line 13
    .line 14
    iget-object v1, p0, LN2/f;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LQ1/o;

    .line 17
    .line 18
    const/16 v2, 0x1b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, LQ1/o;->D(I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v1, LQ1/o;->a:[B

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1, v3, v0, v2, p2}, Ls2/j;->c([BIIZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    if-eqz p2, :cond_7

    .line 32
    .line 33
    move v2, v0

    .line 34
    :goto_0
    if-eqz v2, :cond_6

    .line 35
    .line 36
    invoke-virtual {v1}, LQ1/o;->w()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const-wide/32 v4, 0x4f676753

    .line 41
    .line 42
    .line 43
    cmp-long v2, v2, v4

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_0
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    const-string p1, "unsupported bit stream revision"

    .line 58
    .line 59
    invoke-static {p1}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, LN2/f;->a:I

    .line 69
    .line 70
    invoke-virtual {v1}, LQ1/o;->k()J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    iput-wide v2, p0, LN2/f;->b:J

    .line 75
    .line 76
    invoke-virtual {v1}, LQ1/o;->l()J

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, LQ1/o;->l()J

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, LQ1/o;->l()J

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    iput v2, p0, LN2/f;->c:I

    .line 90
    .line 91
    add-int/lit8 v3, v2, 0x1b

    .line 92
    .line 93
    iput v3, p0, LN2/f;->d:I

    .line 94
    .line 95
    invoke-virtual {v1, v2}, LQ1/o;->D(I)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, LQ1/o;->a:[B

    .line 99
    .line 100
    iget v3, p0, LN2/f;->c:I

    .line 101
    .line 102
    :try_start_1
    invoke-virtual {p1, v2, v0, v3, p2}, Ls2/j;->c([BIIZ)Z

    .line 103
    .line 104
    .line 105
    move-result p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 106
    goto :goto_1

    .line 107
    :catch_1
    move-exception p1

    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    move p1, v0

    .line 111
    :goto_1
    if-nez p1, :cond_3

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    :goto_2
    iget p1, p0, LN2/f;->c:I

    .line 115
    .line 116
    if-ge v0, p1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget-object p2, p0, LN2/f;->f:[I

    .line 123
    .line 124
    aput p1, p2, v0

    .line 125
    .line 126
    iget p2, p0, LN2/f;->e:I

    .line 127
    .line 128
    add-int/2addr p2, p1

    .line 129
    iput p2, p0, LN2/f;->e:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 p1, 0x1

    .line 135
    return p1

    .line 136
    :cond_5
    throw p1

    .line 137
    :cond_6
    :goto_3
    return v0

    .line 138
    :cond_7
    throw v2
.end method

.method public c(LJ5/h;J)Z
    .locals 11

    .line 1
    iget-wide v0, p1, LJ5/h;->d:J

    .line 2
    .line 3
    invoke-virtual {p1}, LJ5/h;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LN2/f;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LY4/b;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-virtual {v0, v3}, LY4/b;->x(I)V

    .line 25
    .line 26
    .line 27
    :goto_1
    const-wide/16 v4, -0x1

    .line 28
    .line 29
    cmp-long v4, p2, v4

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget-wide v5, p1, LJ5/h;->d:J

    .line 34
    .line 35
    const-wide/16 v7, 0x4

    .line 36
    .line 37
    add-long/2addr v5, v7

    .line 38
    cmp-long v5, v5, p2

    .line 39
    .line 40
    if-gez v5, :cond_3

    .line 41
    .line 42
    :cond_1
    iget-object v5, v0, LY4/b;->a:[B

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {p1, v5, v1, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move v5, v1

    .line 50
    :goto_2
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v1}, LY4/b;->A(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, LY4/b;->r()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    const-wide/32 v6, 0x4f676753

    .line 60
    .line 61
    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    iput v1, p1, LJ5/h;->f:I

    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    invoke-virtual {p1, v2}, LJ5/h;->j(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_3
    if-eqz v4, :cond_4

    .line 74
    .line 75
    iget-wide v5, p1, LJ5/h;->d:J

    .line 76
    .line 77
    cmp-long v0, v5, p2

    .line 78
    .line 79
    if-gez v0, :cond_7

    .line 80
    .line 81
    :cond_4
    iget v0, p1, LJ5/h;->g:I

    .line 82
    .line 83
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p1, v0}, LJ5/h;->o(I)V

    .line 88
    .line 89
    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    iget-object v6, p1, LJ5/h;->a:[B

    .line 93
    .line 94
    array-length v0, v6

    .line 95
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    const/4 v10, 0x1

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    move-object v5, p1

    .line 103
    invoke-virtual/range {v5 .. v10}, LJ5/h;->n([BIIIZ)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v5, p1

    .line 109
    :goto_4
    const/4 p1, -0x1

    .line 110
    if-eq v0, p1, :cond_6

    .line 111
    .line 112
    iget-wide v6, v5, LJ5/h;->d:J

    .line 113
    .line 114
    int-to-long v8, v0

    .line 115
    add-long/2addr v6, v8

    .line 116
    iput-wide v6, v5, LJ5/h;->d:J

    .line 117
    .line 118
    :cond_6
    const/4 p1, -0x1

    .line 119
    if-eq v0, p1, :cond_7

    .line 120
    .line 121
    move-object p1, v5

    .line 122
    goto :goto_3

    .line 123
    :cond_7
    return v1
.end method

.method public d(Ls2/j;J)Z
    .locals 9

    .line 1
    iget-wide v0, p1, Ls2/j;->d:J

    .line 2
    .line 3
    invoke-virtual {p1}, Ls2/j;->g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LN2/f;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LQ1/o;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    invoke-virtual {v0, v3}, LQ1/o;->D(I)V

    .line 25
    .line 26
    .line 27
    :goto_1
    const-wide/16 v4, -0x1

    .line 28
    .line 29
    cmp-long v4, p2, v4

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget-wide v5, p1, Ls2/j;->d:J

    .line 34
    .line 35
    const-wide/16 v7, 0x4

    .line 36
    .line 37
    add-long/2addr v5, v7

    .line 38
    cmp-long v5, v5, p2

    .line 39
    .line 40
    if-gez v5, :cond_3

    .line 41
    .line 42
    :cond_1
    iget-object v5, v0, LQ1/o;->a:[B

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {p1, v5, v1, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v5
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move v5, v1

    .line 50
    :goto_2
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v1}, LQ1/o;->G(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, LQ1/o;->w()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    const-wide/32 v6, 0x4f676753

    .line 60
    .line 61
    .line 62
    cmp-long v4, v4, v6

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    iput v1, p1, Ls2/j;->f:I

    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    invoke-virtual {p1, v2}, Ls2/j;->j(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    :goto_3
    if-eqz v4, :cond_4

    .line 74
    .line 75
    iget-wide v5, p1, Ls2/j;->d:J

    .line 76
    .line 77
    cmp-long v0, v5, p2

    .line 78
    .line 79
    if-gez v0, :cond_5

    .line 80
    .line 81
    :cond_4
    invoke-virtual {p1, v2}, Ls2/j;->q(I)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v3, -0x1

    .line 86
    if-eq v0, v3, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    return v1
.end method
