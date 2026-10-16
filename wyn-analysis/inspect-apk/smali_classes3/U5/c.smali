.class public final LU5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/b;
.implements LZ2/b;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public c:J

.field public d:I

.field public e:J

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf6/N;LJ5/w;LU5/e;Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LU5/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LU5/c;->f:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LU5/c;->g:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LU5/c;->h:Ljava/lang/Object;

    .line 5
    iget p1, p3, LU5/e;->d:I

    iget p2, p3, LU5/e;->a:I

    mul-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x8

    .line 6
    iget v0, p3, LU5/e;->c:I

    if-ne v0, p1, :cond_0

    .line 7
    iget p3, p3, LU5/e;->b:I

    mul-int v0, p3, p1

    mul-int/lit8 v1, v0, 0x8

    .line 8
    div-int/lit8 v0, v0, 0xa

    .line 9
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LU5/c;->b:I

    .line 10
    new-instance v0, LE5/S;

    invoke-direct {v0}, LE5/S;-><init>()V

    .line 11
    iput-object p4, v0, LE5/S;->k:Ljava/lang/String;

    .line 12
    iput v1, v0, LE5/S;->f:I

    .line 13
    iput v1, v0, LE5/S;->g:I

    .line 14
    iput p1, v0, LE5/S;->l:I

    .line 15
    iput p2, v0, LE5/S;->x:I

    .line 16
    iput p3, v0, LE5/S;->y:I

    .line 17
    iput p5, v0, LE5/S;->z:I

    .line 18
    new-instance p1, LE5/T;

    invoke-direct {p1, v0}, LE5/T;-><init>(LE5/S;)V

    .line 19
    iput-object p1, p0, LU5/c;->i:Ljava/lang/Object;

    return-void

    .line 20
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Expected block size: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; got: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Ls2/o;Ls2/C;LU5/e;Ljava/lang/String;I)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LU5/c;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, LU5/c;->f:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, LU5/c;->g:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, LU5/c;->h:Ljava/lang/Object;

    .line 25
    iget p1, p3, LU5/e;->d:I

    iget p2, p3, LU5/e;->a:I

    mul-int/2addr p1, p2

    div-int/lit8 p1, p1, 0x8

    .line 26
    iget v0, p3, LU5/e;->c:I

    if-ne v0, p1, :cond_0

    .line 27
    iget p3, p3, LU5/e;->b:I

    mul-int v0, p3, p1

    mul-int/lit8 v1, v0, 0x8

    .line 28
    div-int/lit8 v0, v0, 0xa

    .line 29
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LU5/c;->b:I

    .line 30
    new-instance v0, LN1/m;

    invoke-direct {v0}, LN1/m;-><init>()V

    .line 31
    invoke-static {p4}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iput-object p4, v0, LN1/m;->m:Ljava/lang/String;

    .line 32
    iput v1, v0, LN1/m;->h:I

    .line 33
    iput v1, v0, LN1/m;->i:I

    .line 34
    iput p1, v0, LN1/m;->n:I

    .line 35
    iput p2, v0, LN1/m;->B:I

    .line 36
    iput p3, v0, LN1/m;->C:I

    .line 37
    iput p5, v0, LN1/m;->D:I

    .line 38
    new-instance p1, LN1/n;

    invoke-direct {p1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 39
    iput-object p1, p0, LU5/c;->i:Ljava/lang/Object;

    return-void

    .line 40
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Expected block size: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; got: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final a(IJ)V
    .locals 8

    .line 1
    iget v0, p0, LU5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, LZ2/d;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    int-to-long v4, p1

    .line 10
    iget-object p1, p0, LU5/c;->h:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    check-cast v2, LU5/e;

    .line 14
    .line 15
    move-wide v6, p2

    .line 16
    invoke-direct/range {v1 .. v7}, LZ2/d;-><init>(LU5/e;IJJ)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LU5/c;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ls2/o;

    .line 22
    .line 23
    invoke-interface {p1, v1}, Ls2/o;->s(Ls2/w;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LU5/c;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ls2/C;

    .line 29
    .line 30
    iget-object p2, p0, LU5/c;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, LN1/n;

    .line 33
    .line 34
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    move-wide v5, p2

    .line 39
    new-instance v0, LU5/g;

    .line 40
    .line 41
    int-to-long v3, p1

    .line 42
    iget-object p1, p0, LU5/c;->h:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, LU5/e;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct/range {v0 .. v6}, LU5/g;-><init>(LU5/e;IJJ)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, LU5/c;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lf6/N;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lf6/N;->x(LJ5/t;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LU5/c;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, LJ5/w;

    .line 61
    .line 62
    iget-object p2, p0, LU5/c;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, LE5/T;

    .line 65
    .line 66
    invoke-interface {p1, p2}, LJ5/w;->a(LE5/T;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(J)V
    .locals 1

    .line 1
    iget v0, p0, LU5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LU5/c;->c:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, LU5/c;->d:I

    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    iput-wide p1, p0, LU5/c;->e:J

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iput-wide p1, p0, LU5/c;->c:J

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput p1, p0, LU5/c;->d:I

    .line 20
    .line 21
    const-wide/16 p1, 0x0

    .line 22
    .line 23
    iput-wide p1, p0, LU5/c;->e:J

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ls2/j;J)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU5/c;->g:Ljava/lang/Object;

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmp-long v6, v2, v4

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    if-lez v6, :cond_1

    .line 13
    .line 14
    iget v8, v0, LU5/c;->d:I

    .line 15
    .line 16
    iget v9, v0, LU5/c;->b:I

    .line 17
    .line 18
    if-ge v8, v9, :cond_1

    .line 19
    .line 20
    sub-int/2addr v9, v8

    .line 21
    int-to-long v8, v9

    .line 22
    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v8

    .line 26
    long-to-int v6, v8

    .line 27
    move-object v8, v1

    .line 28
    check-cast v8, Ls2/C;

    .line 29
    .line 30
    move-object/from16 v9, p1

    .line 31
    .line 32
    invoke-interface {v8, v9, v6, v7}, Ls2/C;->d(LN1/g;IZ)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const/4 v7, -0x1

    .line 37
    if-ne v6, v7, :cond_0

    .line 38
    .line 39
    move-wide v2, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget v4, v0, LU5/c;->d:I

    .line 42
    .line 43
    add-int/2addr v4, v6

    .line 44
    iput v4, v0, LU5/c;->d:I

    .line 45
    .line 46
    int-to-long v4, v6

    .line 47
    sub-long/2addr v2, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v2, v0, LU5/c;->h:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, LU5/e;

    .line 52
    .line 53
    iget v3, v0, LU5/c;->d:I

    .line 54
    .line 55
    iget v4, v2, LU5/e;->c:I

    .line 56
    .line 57
    div-int/2addr v3, v4

    .line 58
    if-lez v3, :cond_2

    .line 59
    .line 60
    iget-wide v8, v0, LU5/c;->c:J

    .line 61
    .line 62
    iget-wide v10, v0, LU5/c;->e:J

    .line 63
    .line 64
    iget v2, v2, LU5/e;->b:I

    .line 65
    .line 66
    int-to-long v14, v2

    .line 67
    sget v2, LQ1/x;->a:I

    .line 68
    .line 69
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 70
    .line 71
    const-wide/32 v12, 0xf4240

    .line 72
    .line 73
    .line 74
    invoke-static/range {v10 .. v16}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v10

    .line 78
    add-long v13, v8, v10

    .line 79
    .line 80
    mul-int v16, v3, v4

    .line 81
    .line 82
    iget v2, v0, LU5/c;->d:I

    .line 83
    .line 84
    sub-int v17, v2, v16

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    move-object v12, v1

    .line 89
    check-cast v12, Ls2/C;

    .line 90
    .line 91
    const/4 v15, 0x1

    .line 92
    invoke-interface/range {v12 .. v18}, Ls2/C;->a(JIIILs2/B;)V

    .line 93
    .line 94
    .line 95
    move/from16 v2, v17

    .line 96
    .line 97
    iget-wide v4, v0, LU5/c;->e:J

    .line 98
    .line 99
    int-to-long v8, v3

    .line 100
    add-long/2addr v4, v8

    .line 101
    iput-wide v4, v0, LU5/c;->e:J

    .line 102
    .line 103
    iput v2, v0, LU5/c;->d:I

    .line 104
    .line 105
    :cond_2
    if-gtz v6, :cond_3

    .line 106
    .line 107
    return v7

    .line 108
    :cond_3
    const/4 v1, 0x0

    .line 109
    return v1
.end method

.method public d(LJ5/h;J)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    :goto_0
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-lez v5, :cond_1

    .line 11
    .line 12
    iget v7, v0, LU5/c;->d:I

    .line 13
    .line 14
    iget v8, v0, LU5/c;->b:I

    .line 15
    .line 16
    if-ge v7, v8, :cond_1

    .line 17
    .line 18
    sub-int/2addr v8, v7

    .line 19
    int-to-long v7, v8

    .line 20
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    long-to-int v5, v7

    .line 25
    iget-object v7, v0, LU5/c;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, LJ5/w;

    .line 28
    .line 29
    move-object/from16 v8, p1

    .line 30
    .line 31
    invoke-interface {v7, v8, v5, v6}, LJ5/w;->d(Lt6/i;IZ)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 v6, -0x1

    .line 36
    if-ne v5, v6, :cond_0

    .line 37
    .line 38
    move-wide v1, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget v3, v0, LU5/c;->d:I

    .line 41
    .line 42
    add-int/2addr v3, v5

    .line 43
    iput v3, v0, LU5/c;->d:I

    .line 44
    .line 45
    int-to-long v3, v5

    .line 46
    sub-long/2addr v1, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, v0, LU5/c;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, LU5/e;

    .line 51
    .line 52
    iget v2, v0, LU5/c;->d:I

    .line 53
    .line 54
    iget v3, v1, LU5/e;->c:I

    .line 55
    .line 56
    div-int/2addr v2, v3

    .line 57
    if-lez v2, :cond_2

    .line 58
    .line 59
    iget-wide v7, v0, LU5/c;->c:J

    .line 60
    .line 61
    iget-wide v9, v0, LU5/c;->e:J

    .line 62
    .line 63
    iget v1, v1, LU5/e;->b:I

    .line 64
    .line 65
    int-to-long v13, v1

    .line 66
    const-wide/32 v11, 0xf4240

    .line 67
    .line 68
    .line 69
    invoke-static/range {v9 .. v14}, Lu6/v;->D(JJJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    add-long v12, v7, v9

    .line 74
    .line 75
    mul-int v15, v2, v3

    .line 76
    .line 77
    iget v1, v0, LU5/c;->d:I

    .line 78
    .line 79
    sub-int v16, v1, v15

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    iget-object v1, v0, LU5/c;->g:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v11, v1

    .line 86
    check-cast v11, LJ5/w;

    .line 87
    .line 88
    const/4 v14, 0x1

    .line 89
    invoke-interface/range {v11 .. v17}, LJ5/w;->b(JIIILJ5/v;)V

    .line 90
    .line 91
    .line 92
    move/from16 v1, v16

    .line 93
    .line 94
    iget-wide v3, v0, LU5/c;->e:J

    .line 95
    .line 96
    int-to-long v7, v2

    .line 97
    add-long/2addr v3, v7

    .line 98
    iput-wide v3, v0, LU5/c;->e:J

    .line 99
    .line 100
    iput v1, v0, LU5/c;->d:I

    .line 101
    .line 102
    :cond_2
    if-gtz v5, :cond_3

    .line 103
    .line 104
    return v6

    .line 105
    :cond_3
    const/4 v1, 0x0

    .line 106
    return v1
.end method
