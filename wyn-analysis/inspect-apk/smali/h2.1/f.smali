.class public final Lh2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i;


# instance fields
.field public final a:Lg2/l;

.field public final b:I

.field public c:Ls2/C;

.field public d:J

.field public e:I

.field public f:I

.field public g:J

.field public h:J


# direct methods
.method public constructor <init>(Lg2/l;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh2/f;->a:Lg2/l;

    .line 5
    .line 6
    :try_start_0
    iget-object p1, p1, Lg2/l;->d:Ll8/j0;

    .line 7
    .line 8
    invoke-static {p1}, Lh2/f;->e(Ll8/j0;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lh2/f;->b:I
    :try_end_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lh2/f;->d:J

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    iput p1, p0, Lh2/f;->e:I

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput p1, p0, Lh2/f;->f:I

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    iput-wide v2, p0, Lh2/f;->g:J

    .line 30
    .line 31
    iput-wide v0, p0, Lh2/f;->h:J

    .line 32
    .line 33
    return-void

    .line 34
    :catch_0
    move-exception p1

    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public static e(Ll8/j0;)I
    .locals 6

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    rem-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    if-nez v2, :cond_4

    .line 20
    .line 21
    invoke-static {p0}, LQ1/x;->r(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v2, LJ5/y;

    .line 26
    .line 27
    array-length v3, p0

    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-direct {v2, p0, v3, v4, v5}, LJ5/y;-><init>([BIIB)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ne p0, v0, :cond_0

    .line 44
    .line 45
    move p0, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p0, v1

    .line 48
    :goto_0
    const-string v3, "Only supports allStreamsSameTimeFraming."

    .line 49
    .line 50
    invoke-static {v3, p0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    invoke-virtual {v2, p0}, LJ5/y;->i(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 v3, 0x4

    .line 59
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    move v3, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v3, v1

    .line 68
    :goto_1
    const-string v4, "Only suppors one program."

    .line 69
    .line 70
    invoke-static {v4, v3}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    move v1, v0

    .line 81
    :cond_2
    const-string v2, "Only suppors one layer."

    .line 82
    .line 83
    invoke-static {v2, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    move v1, p0

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    const-string v2, "unsupported audio mux version: "

    .line 89
    .line 90
    invoke-static {p0, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v2, LN1/D;

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-direct {v2, p0, v3, v0, v1}, LN1/D;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_4
    :goto_2
    add-int/2addr v1, v0

    .line 102
    return v1
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lh2/f;->d:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lh2/f;->f:I

    .line 5
    .line 6
    iput-wide p3, p0, Lh2/f;->g:J

    .line 7
    .line 8
    return-void
.end method

.method public final b(LQ1/o;JIZ)V
    .locals 13

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    iget-object v1, p0, Lh2/f;->c:Ls2/C;

    .line 4
    .line 5
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lh2/f;->e:I

    .line 9
    .line 10
    invoke-static {v1}, Lg2/i;->a(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lh2/f;->f:I

    .line 15
    .line 16
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-lez v2, :cond_0

    .line 23
    .line 24
    if-ge v1, v0, :cond_0

    .line 25
    .line 26
    iget-object v6, p0, Lh2/f;->c:Ls2/C;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-wide v7, p0, Lh2/f;->h:J

    .line 32
    .line 33
    iget v10, p0, Lh2/f;->f:I

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v9, 0x1

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-interface/range {v6 .. v12}, Ls2/C;->a(JIIILs2/B;)V

    .line 39
    .line 40
    .line 41
    iput v5, p0, Lh2/f;->f:I

    .line 42
    .line 43
    iput-wide v3, p0, Lh2/f;->h:J

    .line 44
    .line 45
    :cond_0
    move v1, v5

    .line 46
    :goto_0
    iget v2, p0, Lh2/f;->b:I

    .line 47
    .line 48
    if-ge v1, v2, :cond_3

    .line 49
    .line 50
    move v2, v5

    .line 51
    :cond_1
    iget v6, p1, LQ1/o;->b:I

    .line 52
    .line 53
    iget v7, p1, LQ1/o;->c:I

    .line 54
    .line 55
    if-ge v6, v7, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, LQ1/o;->u()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/2addr v2, v6

    .line 62
    const/16 v7, 0xff

    .line 63
    .line 64
    if-eq v6, v7, :cond_1

    .line 65
    .line 66
    :cond_2
    iget-object v6, p0, Lh2/f;->c:Ls2/C;

    .line 67
    .line 68
    invoke-interface {v6, v2, p1}, Ls2/C;->e(ILQ1/o;)V

    .line 69
    .line 70
    .line 71
    iget v6, p0, Lh2/f;->f:I

    .line 72
    .line 73
    add-int/2addr v6, v2

    .line 74
    iput v6, p0, Lh2/f;->f:I

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-wide v6, p0, Lh2/f;->g:J

    .line 80
    .line 81
    iget-wide v11, p0, Lh2/f;->d:J

    .line 82
    .line 83
    iget-object p1, p0, Lh2/f;->a:Lg2/l;

    .line 84
    .line 85
    iget v10, p1, Lg2/l;->b:I

    .line 86
    .line 87
    move-wide v8, p2

    .line 88
    invoke-static/range {v6 .. v12}, LS3/f;->N(JJIJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    iput-wide v1, p0, Lh2/f;->h:J

    .line 93
    .line 94
    if-eqz p5, :cond_4

    .line 95
    .line 96
    iget-object v6, p0, Lh2/f;->c:Ls2/C;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-wide v7, p0, Lh2/f;->h:J

    .line 102
    .line 103
    iget v10, p0, Lh2/f;->f:I

    .line 104
    .line 105
    const/4 v12, 0x0

    .line 106
    const/4 v9, 0x1

    .line 107
    const/4 v11, 0x0

    .line 108
    invoke-interface/range {v6 .. v12}, Ls2/C;->a(JIIILs2/B;)V

    .line 109
    .line 110
    .line 111
    iput v5, p0, Lh2/f;->f:I

    .line 112
    .line 113
    iput-wide v3, p0, Lh2/f;->h:J

    .line 114
    .line 115
    :cond_4
    iput v0, p0, Lh2/f;->e:I

    .line 116
    .line 117
    return-void
.end method

.method public final c(Ls2/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, Lh2/f;->c:Ls2/C;

    .line 7
    .line 8
    sget p2, LQ1/x;->a:I

    .line 9
    .line 10
    iget-object p2, p0, Lh2/f;->a:Lg2/l;

    .line 11
    .line 12
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 13
    .line 14
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lh2/f;->d:J

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
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    iput-wide p1, p0, Lh2/f;->d:J

    .line 19
    .line 20
    return-void
.end method
