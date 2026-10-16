.class public final Lf6/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public c:J

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo2/e;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Lf6/S;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 3
    iget p1, p1, Lo2/e;->c:I

    .line 4
    iput p1, p0, Lf6/S;->b:I

    .line 5
    new-instance v0, LQ1/o;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    iput-object v0, p0, Lf6/S;->e:Ljava/lang/Object;

    .line 6
    new-instance v0, LA7/B1;

    const-wide/16 v1, 0x0

    const/4 v3, 0x4

    invoke-direct {v0, p1, v3, v1, v2}, LA7/B1;-><init>(IIJ)V

    iput-object v0, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 7
    iput-object v0, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lf6/S;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lo2/e;B)V
    .locals 3

    const/4 p2, 0x0

    iput p2, p0, Lf6/S;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 11
    iget p1, p1, Lo2/e;->c:I

    .line 12
    iput p1, p0, Lf6/S;->b:I

    .line 13
    new-instance p2, LY4/b;

    const/16 v0, 0x20

    invoke-direct {p2, v0}, LY4/b;-><init>(I)V

    iput-object p2, p0, Lf6/S;->e:Ljava/lang/Object;

    .line 14
    new-instance p2, LA7/B1;

    const-wide/16 v0, 0x0

    const/4 v2, 0x3

    invoke-direct {p2, p1, v2, v0, v1}, LA7/B1;-><init>(IIJ)V

    iput-object p2, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lf6/S;->h:Ljava/lang/Object;

    return-void
.end method

.method private final c(J)V
    .locals 5

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/B1;

    .line 11
    .line 12
    iget-wide v1, v0, LA7/B1;->c:J

    .line 13
    .line 14
    cmp-long v1, p1, v1

    .line 15
    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lo2/e;

    .line 21
    .line 22
    iget-object v0, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lt6/a;

    .line 25
    .line 26
    monitor-enter v1

    .line 27
    :try_start_0
    iget-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, [Lt6/a;

    .line 30
    .line 31
    iget v3, v1, Lo2/e;->f:I

    .line 32
    .line 33
    add-int/lit8 v4, v3, 0x1

    .line 34
    .line 35
    iput v4, v1, Lo2/e;->f:I

    .line 36
    .line 37
    aput-object v0, v2, v3

    .line 38
    .line 39
    iget v0, v1, Lo2/e;->e:I

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    iput v0, v1, Lo2/e;->e:I

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    monitor-exit v1

    .line 49
    iget-object v0, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, LA7/B1;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    iput-object v1, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v2, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, LA7/B1;

    .line 59
    .line 60
    iput-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v2, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p1

    .line 68
    :cond_1
    iget-object p1, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, LA7/B1;

    .line 71
    .line 72
    iget-wide p1, p1, LA7/B1;->b:J

    .line 73
    .line 74
    iget-wide v1, v0, LA7/B1;->b:J

    .line 75
    .line 76
    cmp-long p1, p1, v1

    .line 77
    .line 78
    if-gez p1, :cond_2

    .line 79
    .line 80
    iput-object v0, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 81
    .line 82
    :cond_2
    :goto_1
    return-void
.end method

.method private final e(I)I
    .locals 7

    .line 1
    iget-object v0, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/B1;

    .line 4
    .line 5
    iget-object v1, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lt6/a;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lo2/e;

    .line 14
    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget v2, v1, Lo2/e;->e:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    iput v2, v1, Lo2/e;->e:I

    .line 21
    .line 22
    iget v3, v1, Lo2/e;->f:I

    .line 23
    .line 24
    if-lez v3, :cond_0

    .line 25
    .line 26
    iget-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, [Lt6/a;

    .line 29
    .line 30
    add-int/lit8 v3, v3, -0x1

    .line 31
    .line 32
    iput v3, v1, Lo2/e;->f:I

    .line 33
    .line 34
    aget-object v2, v2, v3

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, [Lt6/a;

    .line 42
    .line 43
    iget v4, v1, Lo2/e;->f:I

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    aput-object v5, v3, v4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v3, Lt6/a;

    .line 52
    .line 53
    iget v4, v1, Lo2/e;->c:I

    .line 54
    .line 55
    new-array v4, v4, [B

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-direct {v3, v4, v5}, Lt6/a;-><init>([BI)V

    .line 59
    .line 60
    .line 61
    iget-object v4, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, [Lt6/a;

    .line 64
    .line 65
    array-length v5, v4

    .line 66
    if-le v2, v5, :cond_1

    .line 67
    .line 68
    array-length v2, v4

    .line 69
    mul-int/lit8 v2, v2, 0x2

    .line 70
    .line 71
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, [Lt6/a;

    .line 76
    .line 77
    iput-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    :cond_1
    move-object v2, v3

    .line 80
    :goto_0
    monitor-exit v1

    .line 81
    new-instance v1, LA7/B1;

    .line 82
    .line 83
    iget-object v3, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, LA7/B1;

    .line 86
    .line 87
    iget-wide v3, v3, LA7/B1;->c:J

    .line 88
    .line 89
    iget v5, p0, Lf6/S;->b:I

    .line 90
    .line 91
    const/4 v6, 0x3

    .line 92
    invoke-direct {v1, v5, v6, v3, v4}, LA7/B1;-><init>(IIJ)V

    .line 93
    .line 94
    .line 95
    iput-object v2, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    throw p1

    .line 102
    :cond_2
    :goto_2
    iget-object v0, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LA7/B1;

    .line 105
    .line 106
    iget-wide v0, v0, LA7/B1;->c:J

    .line 107
    .line 108
    iget-wide v2, p0, Lf6/S;->c:J

    .line 109
    .line 110
    sub-long/2addr v0, v2

    .line 111
    long-to-int v0, v0

    .line 112
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1
.end method

.method public static f(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, LA7/B1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :goto_1
    if-lez p4, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, LA7/B1;->c:J

    .line 15
    .line 16
    sub-long/2addr v0, p1

    .line 17
    long-to-int v0, v0

    .line 18
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lt6/a;

    .line 25
    .line 26
    iget-object v2, v1, Lt6/a;->a:[B

    .line 27
    .line 28
    iget-wide v3, p0, LA7/B1;->b:J

    .line 29
    .line 30
    sub-long v3, p1, v3

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    iget v1, v1, Lt6/a;->b:I

    .line 34
    .line 35
    add-int/2addr v3, v1

    .line 36
    invoke-virtual {p3, v2, v3, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v0

    .line 40
    int-to-long v0, v0

    .line 41
    add-long/2addr p1, v0

    .line 42
    iget-wide v0, p0, LA7/B1;->c:J

    .line 43
    .line 44
    cmp-long v0, p1, v0

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, LA7/B1;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-object p0
.end method

.method public static g(LA7/B1;J[BI)LA7/B1;
    .locals 6

    .line 1
    :goto_0
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, LA7/B1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, p4

    .line 13
    :cond_1
    :goto_1
    if-lez v0, :cond_2

    .line 14
    .line 15
    iget-wide v1, p0, LA7/B1;->c:J

    .line 16
    .line 17
    sub-long/2addr v1, p1

    .line 18
    long-to-int v1, v1

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lt6/a;

    .line 26
    .line 27
    iget-object v3, v2, Lt6/a;->a:[B

    .line 28
    .line 29
    iget-wide v4, p0, LA7/B1;->b:J

    .line 30
    .line 31
    sub-long v4, p1, v4

    .line 32
    .line 33
    long-to-int v4, v4

    .line 34
    iget v2, v2, Lt6/a;->b:I

    .line 35
    .line 36
    add-int/2addr v4, v2

    .line 37
    sub-int v2, p4, v0

    .line 38
    .line 39
    invoke-static {v3, v4, p3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    sub-int/2addr v0, v1

    .line 43
    int-to-long v1, v1

    .line 44
    add-long/2addr p1, v1

    .line 45
    iget-wide v1, p0, LA7/B1;->c:J

    .line 46
    .line 47
    cmp-long v1, p1, v1

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, LA7/B1;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    return-object p0
.end method

.method public static h(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, LA7/B1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :goto_1
    if-lez p4, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, LA7/B1;->c:J

    .line 15
    .line 16
    sub-long/2addr v0, p1

    .line 17
    long-to-int v0, v0

    .line 18
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lo2/a;

    .line 25
    .line 26
    iget-object v2, v1, Lo2/a;->a:[B

    .line 27
    .line 28
    iget-wide v3, p0, LA7/B1;->b:J

    .line 29
    .line 30
    sub-long v3, p1, v3

    .line 31
    .line 32
    long-to-int v3, v3

    .line 33
    iget v1, v1, Lo2/a;->b:I

    .line 34
    .line 35
    add-int/2addr v3, v1

    .line 36
    invoke-virtual {p3, v2, v3, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v0

    .line 40
    int-to-long v0, v0

    .line 41
    add-long/2addr p1, v0

    .line 42
    iget-wide v0, p0, LA7/B1;->c:J

    .line 43
    .line 44
    cmp-long v0, p1, v0

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, LA7/B1;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-object p0
.end method

.method public static i(LA7/B1;J[BI)LA7/B1;
    .locals 6

    .line 1
    :goto_0
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, LA7/B1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, p4

    .line 13
    :cond_1
    :goto_1
    if-lez v0, :cond_2

    .line 14
    .line 15
    iget-wide v1, p0, LA7/B1;->c:J

    .line 16
    .line 17
    sub-long/2addr v1, p1

    .line 18
    long-to-int v1, v1

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Lo2/a;

    .line 26
    .line 27
    iget-object v3, v2, Lo2/a;->a:[B

    .line 28
    .line 29
    iget-wide v4, p0, LA7/B1;->b:J

    .line 30
    .line 31
    sub-long v4, p1, v4

    .line 32
    .line 33
    long-to-int v4, v4

    .line 34
    iget v2, v2, Lo2/a;->b:I

    .line 35
    .line 36
    add-int/2addr v4, v2

    .line 37
    sub-int v2, p4, v0

    .line 38
    .line 39
    invoke-static {v3, v4, p3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    sub-int/2addr v0, v1

    .line 43
    int-to-long v1, v1

    .line 44
    add-long/2addr p1, v1

    .line 45
    iget-wide v1, p0, LA7/B1;->c:J

    .line 46
    .line 47
    cmp-long v1, p1, v1

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    iget-object p0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, LA7/B1;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    return-object p0
.end method

.method public static j(LA7/B1;LH5/h;Lc2/g;LY4/b;)LA7/B1;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/high16 v1, 0x40000000    # 2.0f

    .line 3
    .line 4
    invoke-virtual {p1, v1}, LH5/a;->h(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    iget-wide v1, p2, Lc2/g;->b:J

    .line 11
    .line 12
    invoke-virtual {p3, v0}, LY4/b;->x(I)V

    .line 13
    .line 14
    .line 15
    iget-object v3, p3, LY4/b;->a:[B

    .line 16
    .line 17
    invoke-static {p0, v1, v2, v3, v0}, Lf6/S;->g(LA7/B1;J[BI)LA7/B1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-wide/16 v3, 0x1

    .line 22
    .line 23
    add-long/2addr v1, v3

    .line 24
    iget-object v3, p3, LY4/b;->a:[B

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    aget-byte v3, v3, v4

    .line 28
    .line 29
    and-int/lit16 v5, v3, 0x80

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    move v5, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v5, v4

    .line 36
    :goto_0
    and-int/lit8 v3, v3, 0x7f

    .line 37
    .line 38
    iget-object v6, p1, LH5/h;->c:LH5/c;

    .line 39
    .line 40
    iget-object v7, v6, LH5/c;->a:[B

    .line 41
    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    const/16 v7, 0x10

    .line 45
    .line 46
    new-array v7, v7, [B

    .line 47
    .line 48
    iput-object v7, v6, LH5/c;->a:[B

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v7, v4}, Ljava/util/Arrays;->fill([BB)V

    .line 52
    .line 53
    .line 54
    :goto_1
    iget-object v7, v6, LH5/c;->a:[B

    .line 55
    .line 56
    invoke-static {p0, v1, v2, v7, v3}, Lf6/S;->g(LA7/B1;J[BI)LA7/B1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    int-to-long v7, v3

    .line 61
    add-long/2addr v1, v7

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    invoke-virtual {p3, v3}, LY4/b;->x(I)V

    .line 66
    .line 67
    .line 68
    iget-object v7, p3, LY4/b;->a:[B

    .line 69
    .line 70
    invoke-static {p0, v1, v2, v7, v3}, Lf6/S;->g(LA7/B1;J[BI)LA7/B1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-wide/16 v7, 0x2

    .line 75
    .line 76
    add-long/2addr v1, v7

    .line 77
    invoke-virtual {p3}, LY4/b;->v()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move v3, v0

    .line 83
    :goto_2
    iget-object v7, v6, LH5/c;->d:[I

    .line 84
    .line 85
    if-eqz v7, :cond_3

    .line 86
    .line 87
    array-length v8, v7

    .line 88
    if-ge v8, v3, :cond_4

    .line 89
    .line 90
    :cond_3
    new-array v7, v3, [I

    .line 91
    .line 92
    :cond_4
    iget-object v8, v6, LH5/c;->e:[I

    .line 93
    .line 94
    if-eqz v8, :cond_5

    .line 95
    .line 96
    array-length v9, v8

    .line 97
    if-ge v9, v3, :cond_6

    .line 98
    .line 99
    :cond_5
    new-array v8, v3, [I

    .line 100
    .line 101
    :cond_6
    if-eqz v5, :cond_7

    .line 102
    .line 103
    mul-int/lit8 v5, v3, 0x6

    .line 104
    .line 105
    invoke-virtual {p3, v5}, LY4/b;->x(I)V

    .line 106
    .line 107
    .line 108
    iget-object v9, p3, LY4/b;->a:[B

    .line 109
    .line 110
    invoke-static {p0, v1, v2, v9, v5}, Lf6/S;->g(LA7/B1;J[BI)LA7/B1;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    int-to-long v9, v5

    .line 115
    add-long/2addr v1, v9

    .line 116
    invoke-virtual {p3, v4}, LY4/b;->A(I)V

    .line 117
    .line 118
    .line 119
    :goto_3
    if-ge v4, v3, :cond_8

    .line 120
    .line 121
    invoke-virtual {p3}, LY4/b;->v()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    aput v5, v7, v4

    .line 126
    .line 127
    invoke-virtual {p3}, LY4/b;->t()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    aput v5, v8, v4

    .line 132
    .line 133
    add-int/2addr v4, v0

    .line 134
    goto :goto_3

    .line 135
    :cond_7
    aput v4, v7, v4

    .line 136
    .line 137
    iget v0, p2, Lc2/g;->a:I

    .line 138
    .line 139
    iget-wide v9, p2, Lc2/g;->b:J

    .line 140
    .line 141
    sub-long v9, v1, v9

    .line 142
    .line 143
    long-to-int v5, v9

    .line 144
    sub-int/2addr v0, v5

    .line 145
    aput v0, v8, v4

    .line 146
    .line 147
    :cond_8
    iget-object v0, p2, Lc2/g;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, LJ5/v;

    .line 150
    .line 151
    sget v4, Lu6/v;->a:I

    .line 152
    .line 153
    iget-object v4, v0, LJ5/v;->b:[B

    .line 154
    .line 155
    iget-object v5, v6, LH5/c;->a:[B

    .line 156
    .line 157
    iput v3, v6, LH5/c;->f:I

    .line 158
    .line 159
    iput-object v7, v6, LH5/c;->d:[I

    .line 160
    .line 161
    iput-object v8, v6, LH5/c;->e:[I

    .line 162
    .line 163
    iput-object v4, v6, LH5/c;->b:[B

    .line 164
    .line 165
    iput-object v5, v6, LH5/c;->a:[B

    .line 166
    .line 167
    iget v9, v0, LJ5/v;->a:I

    .line 168
    .line 169
    iput v9, v6, LH5/c;->c:I

    .line 170
    .line 171
    iget v10, v0, LJ5/v;->c:I

    .line 172
    .line 173
    iput v10, v6, LH5/c;->g:I

    .line 174
    .line 175
    iget v0, v0, LJ5/v;->d:I

    .line 176
    .line 177
    iput v0, v6, LH5/c;->h:I

    .line 178
    .line 179
    iget-object v11, v6, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 180
    .line 181
    iput v3, v11, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 182
    .line 183
    iput-object v7, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 184
    .line 185
    iput-object v8, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 186
    .line 187
    iput-object v4, v11, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 188
    .line 189
    iput-object v5, v11, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 190
    .line 191
    iput v9, v11, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 192
    .line 193
    sget v3, Lu6/v;->a:I

    .line 194
    .line 195
    const/16 v4, 0x18

    .line 196
    .line 197
    if-lt v3, v4, :cond_9

    .line 198
    .line 199
    iget-object v3, v6, LH5/c;->j:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v3, LS3/c;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object v4, v3, LS3/c;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v4, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 209
    .line 210
    invoke-static {v4, v10, v0}, LA7/O0;->t(Landroid/media/MediaCodec$CryptoInfo$Pattern;II)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v3, LS3/c;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Landroid/media/MediaCodec$CryptoInfo;

    .line 216
    .line 217
    iget-object v3, v3, LS3/c;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 220
    .line 221
    invoke-static {v0, v3}, LA7/O0;->u(Landroid/media/MediaCodec$CryptoInfo;Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    iget-wide v3, p2, Lc2/g;->b:J

    .line 225
    .line 226
    sub-long/2addr v1, v3

    .line 227
    long-to-int v0, v1

    .line 228
    int-to-long v1, v0

    .line 229
    add-long/2addr v3, v1

    .line 230
    iput-wide v3, p2, Lc2/g;->b:J

    .line 231
    .line 232
    iget v1, p2, Lc2/g;->a:I

    .line 233
    .line 234
    sub-int/2addr v1, v0

    .line 235
    iput v1, p2, Lc2/g;->a:I

    .line 236
    .line 237
    :cond_a
    const/high16 v0, 0x10000000

    .line 238
    .line 239
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_d

    .line 244
    .line 245
    const/4 v0, 0x4

    .line 246
    invoke-virtual {p3, v0}, LY4/b;->x(I)V

    .line 247
    .line 248
    .line 249
    iget-wide v1, p2, Lc2/g;->b:J

    .line 250
    .line 251
    iget-object v3, p3, LY4/b;->a:[B

    .line 252
    .line 253
    invoke-static {p0, v1, v2, v3, v0}, Lf6/S;->g(LA7/B1;J[BI)LA7/B1;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p3}, LY4/b;->t()I

    .line 258
    .line 259
    .line 260
    move-result p3

    .line 261
    iget-wide v1, p2, Lc2/g;->b:J

    .line 262
    .line 263
    const-wide/16 v3, 0x4

    .line 264
    .line 265
    add-long/2addr v1, v3

    .line 266
    iput-wide v1, p2, Lc2/g;->b:J

    .line 267
    .line 268
    iget v1, p2, Lc2/g;->a:I

    .line 269
    .line 270
    sub-int/2addr v1, v0

    .line 271
    iput v1, p2, Lc2/g;->a:I

    .line 272
    .line 273
    invoke-virtual {p1, p3}, LH5/h;->r(I)V

    .line 274
    .line 275
    .line 276
    iget-wide v0, p2, Lc2/g;->b:J

    .line 277
    .line 278
    iget-object v2, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 279
    .line 280
    invoke-static {p0, v0, v1, v2, p3}, Lf6/S;->f(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    iget-wide v0, p2, Lc2/g;->b:J

    .line 285
    .line 286
    int-to-long v2, p3

    .line 287
    add-long/2addr v0, v2

    .line 288
    iput-wide v0, p2, Lc2/g;->b:J

    .line 289
    .line 290
    iget v0, p2, Lc2/g;->a:I

    .line 291
    .line 292
    sub-int/2addr v0, p3

    .line 293
    iput v0, p2, Lc2/g;->a:I

    .line 294
    .line 295
    iget-object p3, p1, LH5/h;->g:Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    if-eqz p3, :cond_c

    .line 298
    .line 299
    invoke-virtual {p3}, Ljava/nio/Buffer;->capacity()I

    .line 300
    .line 301
    .line 302
    move-result p3

    .line 303
    if-ge p3, v0, :cond_b

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_b
    iget-object p3, p1, LH5/h;->g:Ljava/nio/ByteBuffer;

    .line 307
    .line 308
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_c
    :goto_4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    iput-object p3, p1, LH5/h;->g:Ljava/nio/ByteBuffer;

    .line 317
    .line 318
    :goto_5
    iget-wide v0, p2, Lc2/g;->b:J

    .line 319
    .line 320
    iget-object p1, p1, LH5/h;->g:Ljava/nio/ByteBuffer;

    .line 321
    .line 322
    iget p2, p2, Lc2/g;->a:I

    .line 323
    .line 324
    invoke-static {p0, v0, v1, p1, p2}, Lf6/S;->f(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :cond_d
    iget p3, p2, Lc2/g;->a:I

    .line 330
    .line 331
    invoke-virtual {p1, p3}, LH5/h;->r(I)V

    .line 332
    .line 333
    .line 334
    iget-wide v0, p2, Lc2/g;->b:J

    .line 335
    .line 336
    iget-object p1, p1, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 337
    .line 338
    iget p2, p2, Lc2/g;->a:I

    .line 339
    .line 340
    invoke-static {p0, v0, v1, p1, p2}, Lf6/S;->f(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    return-object p0
.end method

.method public static k(LA7/B1;LT1/d;Lc2/g;LQ1/o;)LA7/B1;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/high16 v1, 0x40000000    # 2.0f

    .line 3
    .line 4
    invoke-virtual {p1, v1}, LH5/a;->h(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_a

    .line 9
    .line 10
    iget-wide v1, p2, Lc2/g;->b:J

    .line 11
    .line 12
    invoke-virtual {p3, v0}, LQ1/o;->D(I)V

    .line 13
    .line 14
    .line 15
    iget-object v3, p3, LQ1/o;->a:[B

    .line 16
    .line 17
    invoke-static {p0, v1, v2, v3, v0}, Lf6/S;->i(LA7/B1;J[BI)LA7/B1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-wide/16 v3, 0x1

    .line 22
    .line 23
    add-long/2addr v1, v3

    .line 24
    iget-object v3, p3, LQ1/o;->a:[B

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    aget-byte v3, v3, v4

    .line 28
    .line 29
    and-int/lit16 v5, v3, 0x80

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    move v5, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v5, v4

    .line 36
    :goto_0
    and-int/lit8 v3, v3, 0x7f

    .line 37
    .line 38
    iget-object v6, p1, LT1/d;->d:LH5/c;

    .line 39
    .line 40
    iget-object v7, v6, LH5/c;->a:[B

    .line 41
    .line 42
    if-nez v7, :cond_1

    .line 43
    .line 44
    const/16 v7, 0x10

    .line 45
    .line 46
    new-array v7, v7, [B

    .line 47
    .line 48
    iput-object v7, v6, LH5/c;->a:[B

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v7, v4}, Ljava/util/Arrays;->fill([BB)V

    .line 52
    .line 53
    .line 54
    :goto_1
    iget-object v7, v6, LH5/c;->a:[B

    .line 55
    .line 56
    invoke-static {p0, v1, v2, v7, v3}, Lf6/S;->i(LA7/B1;J[BI)LA7/B1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    int-to-long v7, v3

    .line 61
    add-long/2addr v1, v7

    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    invoke-virtual {p3, v3}, LQ1/o;->D(I)V

    .line 66
    .line 67
    .line 68
    iget-object v7, p3, LQ1/o;->a:[B

    .line 69
    .line 70
    invoke-static {p0, v1, v2, v7, v3}, Lf6/S;->i(LA7/B1;J[BI)LA7/B1;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-wide/16 v7, 0x2

    .line 75
    .line 76
    add-long/2addr v1, v7

    .line 77
    invoke-virtual {p3}, LQ1/o;->A()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move v3, v0

    .line 83
    :goto_2
    iget-object v7, v6, LH5/c;->d:[I

    .line 84
    .line 85
    if-eqz v7, :cond_3

    .line 86
    .line 87
    array-length v8, v7

    .line 88
    if-ge v8, v3, :cond_4

    .line 89
    .line 90
    :cond_3
    new-array v7, v3, [I

    .line 91
    .line 92
    :cond_4
    iget-object v8, v6, LH5/c;->e:[I

    .line 93
    .line 94
    if-eqz v8, :cond_5

    .line 95
    .line 96
    array-length v9, v8

    .line 97
    if-ge v9, v3, :cond_6

    .line 98
    .line 99
    :cond_5
    new-array v8, v3, [I

    .line 100
    .line 101
    :cond_6
    if-eqz v5, :cond_7

    .line 102
    .line 103
    mul-int/lit8 v5, v3, 0x6

    .line 104
    .line 105
    invoke-virtual {p3, v5}, LQ1/o;->D(I)V

    .line 106
    .line 107
    .line 108
    iget-object v9, p3, LQ1/o;->a:[B

    .line 109
    .line 110
    invoke-static {p0, v1, v2, v9, v5}, Lf6/S;->i(LA7/B1;J[BI)LA7/B1;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    int-to-long v9, v5

    .line 115
    add-long/2addr v1, v9

    .line 116
    invoke-virtual {p3, v4}, LQ1/o;->G(I)V

    .line 117
    .line 118
    .line 119
    :goto_3
    if-ge v4, v3, :cond_8

    .line 120
    .line 121
    invoke-virtual {p3}, LQ1/o;->A()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    aput v5, v7, v4

    .line 126
    .line 127
    invoke-virtual {p3}, LQ1/o;->y()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    aput v5, v8, v4

    .line 132
    .line 133
    add-int/2addr v4, v0

    .line 134
    goto :goto_3

    .line 135
    :cond_7
    aput v4, v7, v4

    .line 136
    .line 137
    iget v0, p2, Lc2/g;->a:I

    .line 138
    .line 139
    iget-wide v9, p2, Lc2/g;->b:J

    .line 140
    .line 141
    sub-long v9, v1, v9

    .line 142
    .line 143
    long-to-int v5, v9

    .line 144
    sub-int/2addr v0, v5

    .line 145
    aput v0, v8, v4

    .line 146
    .line 147
    :cond_8
    iget-object v0, p2, Lc2/g;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Ls2/B;

    .line 150
    .line 151
    sget v4, LQ1/x;->a:I

    .line 152
    .line 153
    iget-object v4, v0, Ls2/B;->b:[B

    .line 154
    .line 155
    iget-object v5, v6, LH5/c;->a:[B

    .line 156
    .line 157
    iput v3, v6, LH5/c;->f:I

    .line 158
    .line 159
    iput-object v7, v6, LH5/c;->d:[I

    .line 160
    .line 161
    iput-object v8, v6, LH5/c;->e:[I

    .line 162
    .line 163
    iput-object v4, v6, LH5/c;->b:[B

    .line 164
    .line 165
    iput-object v5, v6, LH5/c;->a:[B

    .line 166
    .line 167
    iget v9, v0, Ls2/B;->a:I

    .line 168
    .line 169
    iput v9, v6, LH5/c;->c:I

    .line 170
    .line 171
    iget v10, v0, Ls2/B;->c:I

    .line 172
    .line 173
    iput v10, v6, LH5/c;->g:I

    .line 174
    .line 175
    iget v0, v0, Ls2/B;->d:I

    .line 176
    .line 177
    iput v0, v6, LH5/c;->h:I

    .line 178
    .line 179
    iget-object v11, v6, LH5/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 180
    .line 181
    iput v3, v11, Landroid/media/MediaCodec$CryptoInfo;->numSubSamples:I

    .line 182
    .line 183
    iput-object v7, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 184
    .line 185
    iput-object v8, v11, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfEncryptedData:[I

    .line 186
    .line 187
    iput-object v4, v11, Landroid/media/MediaCodec$CryptoInfo;->key:[B

    .line 188
    .line 189
    iput-object v5, v11, Landroid/media/MediaCodec$CryptoInfo;->iv:[B

    .line 190
    .line 191
    iput v9, v11, Landroid/media/MediaCodec$CryptoInfo;->mode:I

    .line 192
    .line 193
    sget v3, LQ1/x;->a:I

    .line 194
    .line 195
    const/16 v4, 0x18

    .line 196
    .line 197
    if-lt v3, v4, :cond_9

    .line 198
    .line 199
    iget-object v3, v6, LH5/c;->j:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v3, LS3/e;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object v4, v3, LS3/e;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v4, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 209
    .line 210
    invoke-static {v4, v10, v0}, LA7/O0;->t(Landroid/media/MediaCodec$CryptoInfo$Pattern;II)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v3, LS3/e;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Landroid/media/MediaCodec$CryptoInfo;

    .line 216
    .line 217
    iget-object v3, v3, LS3/e;->c:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    .line 220
    .line 221
    invoke-static {v0, v3}, LA7/O0;->u(Landroid/media/MediaCodec$CryptoInfo;Landroid/media/MediaCodec$CryptoInfo$Pattern;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    iget-wide v3, p2, Lc2/g;->b:J

    .line 225
    .line 226
    sub-long/2addr v1, v3

    .line 227
    long-to-int v0, v1

    .line 228
    int-to-long v1, v0

    .line 229
    add-long/2addr v3, v1

    .line 230
    iput-wide v3, p2, Lc2/g;->b:J

    .line 231
    .line 232
    iget v1, p2, Lc2/g;->a:I

    .line 233
    .line 234
    sub-int/2addr v1, v0

    .line 235
    iput v1, p2, Lc2/g;->a:I

    .line 236
    .line 237
    :cond_a
    const/high16 v0, 0x10000000

    .line 238
    .line 239
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_d

    .line 244
    .line 245
    const/4 v0, 0x4

    .line 246
    invoke-virtual {p3, v0}, LQ1/o;->D(I)V

    .line 247
    .line 248
    .line 249
    iget-wide v1, p2, Lc2/g;->b:J

    .line 250
    .line 251
    iget-object v3, p3, LQ1/o;->a:[B

    .line 252
    .line 253
    invoke-static {p0, v1, v2, v3, v0}, Lf6/S;->i(LA7/B1;J[BI)LA7/B1;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p3}, LQ1/o;->y()I

    .line 258
    .line 259
    .line 260
    move-result p3

    .line 261
    iget-wide v1, p2, Lc2/g;->b:J

    .line 262
    .line 263
    const-wide/16 v3, 0x4

    .line 264
    .line 265
    add-long/2addr v1, v3

    .line 266
    iput-wide v1, p2, Lc2/g;->b:J

    .line 267
    .line 268
    iget v1, p2, Lc2/g;->a:I

    .line 269
    .line 270
    sub-int/2addr v1, v0

    .line 271
    iput v1, p2, Lc2/g;->a:I

    .line 272
    .line 273
    invoke-virtual {p1, p3}, LT1/d;->r(I)V

    .line 274
    .line 275
    .line 276
    iget-wide v0, p2, Lc2/g;->b:J

    .line 277
    .line 278
    iget-object v2, p1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 279
    .line 280
    invoke-static {p0, v0, v1, v2, p3}, Lf6/S;->h(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    iget-wide v0, p2, Lc2/g;->b:J

    .line 285
    .line 286
    int-to-long v2, p3

    .line 287
    add-long/2addr v0, v2

    .line 288
    iput-wide v0, p2, Lc2/g;->b:J

    .line 289
    .line 290
    iget v0, p2, Lc2/g;->a:I

    .line 291
    .line 292
    sub-int/2addr v0, p3

    .line 293
    iput v0, p2, Lc2/g;->a:I

    .line 294
    .line 295
    iget-object p3, p1, LT1/d;->h:Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    if-eqz p3, :cond_c

    .line 298
    .line 299
    invoke-virtual {p3}, Ljava/nio/Buffer;->capacity()I

    .line 300
    .line 301
    .line 302
    move-result p3

    .line 303
    if-ge p3, v0, :cond_b

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_b
    iget-object p3, p1, LT1/d;->h:Ljava/nio/ByteBuffer;

    .line 307
    .line 308
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_c
    :goto_4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    iput-object p3, p1, LT1/d;->h:Ljava/nio/ByteBuffer;

    .line 317
    .line 318
    :goto_5
    iget-wide v0, p2, Lc2/g;->b:J

    .line 319
    .line 320
    iget-object p1, p1, LT1/d;->h:Ljava/nio/ByteBuffer;

    .line 321
    .line 322
    iget p2, p2, Lc2/g;->a:I

    .line 323
    .line 324
    invoke-static {p0, v0, v1, p1, p2}, Lf6/S;->h(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :cond_d
    iget p3, p2, Lc2/g;->a:I

    .line 330
    .line 331
    invoke-virtual {p1, p3}, LT1/d;->r(I)V

    .line 332
    .line 333
    .line 334
    iget-wide v0, p2, Lc2/g;->b:J

    .line 335
    .line 336
    iget-object p1, p1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 337
    .line 338
    iget p2, p2, Lc2/g;->a:I

    .line 339
    .line 340
    invoke-static {p0, v0, v1, p1, p2}, Lf6/S;->h(LA7/B1;JLjava/nio/ByteBuffer;I)LA7/B1;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    return-object p0
.end method


# virtual methods
.method public a(LA7/B1;)V
    .locals 6

    .line 1
    iget-object v0, p1, LA7/B1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo2/a;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lo2/e;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    move-object v1, p1

    .line 14
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    :try_start_0
    iget-object v3, v0, Lo2/e;->g:[Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, [Lo2/a;

    .line 20
    .line 21
    iget v4, v0, Lo2/e;->f:I

    .line 22
    .line 23
    add-int/lit8 v5, v4, 0x1

    .line 24
    .line 25
    iput v5, v0, Lo2/e;->f:I

    .line 26
    .line 27
    iget-object v5, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Lo2/a;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    aput-object v5, v3, v4

    .line 35
    .line 36
    iget v3, v0, Lo2/e;->e:I

    .line 37
    .line 38
    add-int/lit8 v3, v3, -0x1

    .line 39
    .line 40
    iput v3, v0, Lo2/e;->e:I

    .line 41
    .line 42
    iget-object v1, v1, LA7/B1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, LA7/B1;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v3, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lo2/a;

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    :cond_2
    move-object v1, v2

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v0

    .line 62
    iput-object v2, p1, LA7/B1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object v2, p1, LA7/B1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    return-void

    .line 67
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw p1
.end method

.method public final b(J)V
    .locals 5

    .line 1
    iget v0, p0, Lf6/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LA7/B1;

    .line 16
    .line 17
    iget-wide v1, v0, LA7/B1;->c:J

    .line 18
    .line 19
    cmp-long v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lo2/e;

    .line 26
    .line 27
    iget-object v0, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lo2/a;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, [Lo2/a;

    .line 35
    .line 36
    iget v3, v1, Lo2/e;->f:I

    .line 37
    .line 38
    add-int/lit8 v4, v3, 0x1

    .line 39
    .line 40
    iput v4, v1, Lo2/e;->f:I

    .line 41
    .line 42
    aput-object v0, v2, v3

    .line 43
    .line 44
    iget v0, v1, Lo2/e;->e:I

    .line 45
    .line 46
    add-int/lit8 v0, v0, -0x1

    .line 47
    .line 48
    iput v0, v1, Lo2/e;->e:I

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit v1

    .line 54
    iget-object v0, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LA7/B1;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    iput-object v1, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v2, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, LA7/B1;

    .line 64
    .line 65
    iput-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v2, p0, Lf6/S;->f:Ljava/lang/Object;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1

    .line 73
    :cond_1
    iget-object p1, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, LA7/B1;

    .line 76
    .line 77
    iget-wide p1, p1, LA7/B1;->b:J

    .line 78
    .line 79
    iget-wide v1, v0, LA7/B1;->b:J

    .line 80
    .line 81
    cmp-long p1, p1, v1

    .line 82
    .line 83
    if-gez p1, :cond_2

    .line 84
    .line 85
    iput-object v0, p0, Lf6/S;->g:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_2
    :goto_1
    return-void

    .line 88
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lf6/S;->c(J)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(I)I
    .locals 7

    .line 1
    iget v0, p0, Lf6/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/B1;

    .line 9
    .line 10
    iget-object v1, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lo2/a;

    .line 13
    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lf6/S;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lo2/e;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget v2, v1, Lo2/e;->e:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    iput v2, v1, Lo2/e;->e:I

    .line 26
    .line 27
    iget v3, v1, Lo2/e;->f:I

    .line 28
    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    iget-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, [Lo2/a;

    .line 34
    .line 35
    add-int/lit8 v3, v3, -0x1

    .line 36
    .line 37
    iput v3, v1, Lo2/e;->f:I

    .line 38
    .line 39
    aget-object v2, v2, v3

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v3, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, [Lo2/a;

    .line 47
    .line 48
    iget v4, v1, Lo2/e;->f:I

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    aput-object v5, v3, v4

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v3, Lo2/a;

    .line 57
    .line 58
    iget v4, v1, Lo2/e;->c:I

    .line 59
    .line 60
    new-array v4, v4, [B

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct {v3, v4, v5}, Lo2/a;-><init>([BI)V

    .line 64
    .line 65
    .line 66
    iget-object v4, v1, Lo2/e;->g:[Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, [Lo2/a;

    .line 69
    .line 70
    array-length v5, v4

    .line 71
    if-le v2, v5, :cond_1

    .line 72
    .line 73
    array-length v2, v4

    .line 74
    mul-int/lit8 v2, v2, 0x2

    .line 75
    .line 76
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, [Lo2/a;

    .line 81
    .line 82
    iput-object v2, v1, Lo2/e;->g:[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    :cond_1
    move-object v2, v3

    .line 85
    :goto_0
    monitor-exit v1

    .line 86
    new-instance v1, LA7/B1;

    .line 87
    .line 88
    iget-object v3, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, LA7/B1;

    .line 91
    .line 92
    iget-wide v3, v3, LA7/B1;->c:J

    .line 93
    .line 94
    iget v5, p0, Lf6/S;->b:I

    .line 95
    .line 96
    const/4 v6, 0x4

    .line 97
    invoke-direct {v1, v5, v6, v3, v4}, LA7/B1;-><init>(IIJ)V

    .line 98
    .line 99
    .line 100
    iput-object v2, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw p1

    .line 107
    :cond_2
    :goto_2
    iget-object v0, p0, Lf6/S;->h:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, LA7/B1;

    .line 110
    .line 111
    iget-wide v0, v0, LA7/B1;->c:J

    .line 112
    .line 113
    iget-wide v2, p0, Lf6/S;->c:J

    .line 114
    .line 115
    sub-long/2addr v0, v2

    .line 116
    long-to-int v0, v0

    .line 117
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    return p1

    .line 122
    :pswitch_0
    invoke-direct {p0, p1}, Lf6/S;->e(I)I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    return p1

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
