.class public final Lg2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lac/a;

.field public final b:Lac/a;

.field public final c:Ljava/lang/String;

.field public final d:Ljavax/net/SocketFactory;

.field public final e:Ljava/util/ArrayDeque;

.field public final f:Landroid/util/SparseArray;

.field public final g:LE4/n;

.field public h:Landroid/net/Uri;

.field public i:Lg2/z;

.field public j:LY1/t;

.field public k:Ljava/lang/String;

.field public l:J

.field public m:Lg2/m;

.field public n:LVa/m8;

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:J


# direct methods
.method public constructor <init>(Lac/a;Lac/a;Ljava/lang/String;Landroid/net/Uri;Ljavax/net/SocketFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/n;->a:Lac/a;

    .line 5
    .line 6
    iput-object p2, p0, Lg2/n;->b:Lac/a;

    .line 7
    .line 8
    iput-object p3, p0, Lg2/n;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lg2/n;->d:Ljavax/net/SocketFactory;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lg2/n;->e:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    new-instance p1, Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lg2/n;->f:Landroid/util/SparseArray;

    .line 25
    .line 26
    new-instance p1, LE4/n;

    .line 27
    .line 28
    invoke-direct {p1, p0}, LE4/n;-><init>(Lg2/n;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lg2/n;->g:LE4/n;

    .line 32
    .line 33
    invoke-static {p4}, Lg2/A;->f(Landroid/net/Uri;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lg2/n;->h:Landroid/net/Uri;

    .line 38
    .line 39
    new-instance p1, Lg2/z;

    .line 40
    .line 41
    new-instance p2, LY2/B;

    .line 42
    .line 43
    invoke-direct {p2, p0}, LY2/B;-><init>(Lg2/n;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, p2}, Lg2/z;-><init>(LY2/B;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lg2/n;->i:Lg2/z;

    .line 50
    .line 51
    const-wide/32 p1, 0xea60

    .line 52
    .line 53
    .line 54
    iput-wide p1, p0, Lg2/n;->l:J

    .line 55
    .line 56
    invoke-static {p4}, Lg2/A;->d(Landroid/net/Uri;)LY1/t;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lg2/n;->j:LY1/t;

    .line 61
    .line 62
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide p1, p0, Lg2/n;->s:J

    .line 68
    .line 69
    const/4 p1, -0x1

    .line 70
    iput p1, p0, Lg2/n;->o:I

    .line 71
    .line 72
    return-void
.end method

.method public static a(Lg2/n;Lio/ktor/utils/io/T;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lg2/n;->p:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lg2/n;->b:Lac/a;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lac/a;->L(Lio/ktor/utils/io/T;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, ""

    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Lg2/n;->a:Lac/a;

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, Lac/a;->N(Ljava/lang/String;Ljava/io/IOException;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lg2/n;->e:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lg2/q;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lg2/n;->b:Lac/a;

    .line 14
    .line 15
    iget-object v0, v0, Lac/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lg2/s;

    .line 18
    .line 19
    iget-wide v1, v0, Lg2/s;->n:J

    .line 20
    .line 21
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v5, v1, v3

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-static {v1, v2}, LQ1/x;->W(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-wide v1, v0, Lg2/s;->o:J

    .line 36
    .line 37
    cmp-long v3, v1, v3

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-static {v1, v2}, LQ1/x;->W(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-wide/16 v1, 0x0

    .line 47
    .line 48
    :goto_0
    iget-object v0, v0, Lg2/s;->d:Lg2/n;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lg2/n;->i(J)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object v3, v2, Lg2/q;->b:Lg2/f;

    .line 55
    .line 56
    iget-object v3, v3, Lg2/f;->b:Lg2/w;

    .line 57
    .line 58
    iget-object v3, v3, Lg2/w;->b:Landroid/net/Uri;

    .line 59
    .line 60
    iget-object v4, v2, Lg2/q;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v2, Lg2/q;->c:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v4, p0, Lg2/n;->k:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v5, p0, Lg2/n;->g:LE4/n;

    .line 70
    .line 71
    iget-object v6, v5, LE4/n;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Lg2/n;

    .line 74
    .line 75
    iput v1, v6, Lg2/n;->o:I

    .line 76
    .line 77
    const-string v6, "Transport"

    .line 78
    .line 79
    invoke-static {v6, v2}, Ll8/s;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x2

    .line 83
    new-array v7, v7, [Ljava/lang/Object;

    .line 84
    .line 85
    aput-object v6, v7, v1

    .line 86
    .line 87
    aput-object v2, v7, v0

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {v0, v7, v1}, Ll8/j0;->c(I[Ljava/lang/Object;LE4/n;)Ll8/j0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/16 v1, 0xa

    .line 95
    .line 96
    invoke-virtual {v5, v1, v4, v0, v3}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v5, v0}, LE4/n;->y(Lg2/B;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lg2/n;->m:Lg2/m;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lg2/m;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lg2/n;->m:Lg2/m;

    .line 10
    .line 11
    iget-object v0, p0, Lg2/n;->h:Landroid/net/Uri;

    .line 12
    .line 13
    iget-object v1, p0, Lg2/n;->k:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lg2/n;->g:LE4/n;

    .line 19
    .line 20
    iget-object v3, v2, LE4/n;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lg2/n;

    .line 23
    .line 24
    iget v4, v3, Lg2/n;->o:I

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    if-eq v4, v5, :cond_1

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x0

    .line 33
    iput v4, v3, Lg2/n;->o:I

    .line 34
    .line 35
    sget-object v3, Ll8/j0;->g:Ll8/j0;

    .line 36
    .line 37
    const/16 v4, 0xc

    .line 38
    .line 39
    invoke-virtual {v2, v4, v1, v3, v0}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v2, v0}, LE4/n;->y(Lg2/B;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Lg2/n;->i:Lg2/z;

    .line 47
    .line 48
    invoke-virtual {v0}, Lg2/z;->close()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final d(Landroid/net/Uri;)Ljava/net/Socket;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getPort()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/net/Uri;->getPort()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/16 v0, 0x22a

    .line 25
    .line 26
    :goto_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lg2/n;->d:Ljavax/net/SocketFactory;

    .line 34
    .line 35
    invoke-virtual {v1, p1, v0}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public final h(J)V
    .locals 7

    .line 1
    iget v0, p0, Lg2/n;->o:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lg2/n;->r:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lg2/n;->h:Landroid/net/Uri;

    .line 11
    .line 12
    iget-object v2, p0, Lg2/n;->k:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lg2/n;->g:LE4/n;

    .line 18
    .line 19
    iget-object v4, v3, LE4/n;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Lg2/n;

    .line 22
    .line 23
    iget v5, v4, Lg2/n;->o:I

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    if-ne v5, v1, :cond_0

    .line 27
    .line 28
    move v1, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Ll8/j0;->g:Ll8/j0;

    .line 35
    .line 36
    const/4 v5, 0x5

    .line 37
    invoke-virtual {v3, v5, v2, v1, v0}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v3, v0}, LE4/n;->y(Lg2/B;)V

    .line 42
    .line 43
    .line 44
    iput-boolean v6, v4, Lg2/n;->r:Z

    .line 45
    .line 46
    :cond_1
    iput-wide p1, p0, Lg2/n;->s:J

    .line 47
    .line 48
    return-void
.end method

.method public final i(J)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, Lg2/n;->h:Landroid/net/Uri;

    .line 5
    .line 6
    iget-object v4, p0, Lg2/n;->k:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v5, p0, Lg2/n;->g:LE4/n;

    .line 12
    .line 13
    iget-object v6, v5, LE4/n;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lg2/n;

    .line 16
    .line 17
    iget v6, v6, Lg2/n;->o:I

    .line 18
    .line 19
    if-eq v6, v2, :cond_1

    .line 20
    .line 21
    if-ne v6, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v6, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v6, v2

    .line 27
    :goto_1
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 28
    .line 29
    .line 30
    sget-object v6, Lg2/C;->c:Lg2/C;

    .line 31
    .line 32
    long-to-double p1, p1

    .line 33
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    div-double/2addr p1, v6

    .line 39
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-array p2, v2, [Ljava/lang/Object;

    .line 44
    .line 45
    aput-object p1, p2, v1

    .line 46
    .line 47
    sget p1, LQ1/x;->a:I

    .line 48
    .line 49
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    const-string v6, "npt=%.3f-"

    .line 52
    .line 53
    invoke-static {p1, v6, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-array p2, v0, [Ljava/lang/Object;

    .line 58
    .line 59
    const-string v0, "Range"

    .line 60
    .line 61
    aput-object v0, p2, v1

    .line 62
    .line 63
    aput-object p1, p2, v2

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-static {v2, p2, p1}, Ll8/j0;->c(I[Ljava/lang/Object;LE4/n;)Ll8/j0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 p2, 0x6

    .line 71
    invoke-virtual {v5, p2, v4, p1, v3}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v5, p1}, LE4/n;->y(Lg2/B;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
