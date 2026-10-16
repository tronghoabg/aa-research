.class public final Lc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP2/e;
.implements LT1/b;


# instance fields
.field public final a:LH4/a;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayDeque;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:[LT1/d;

.field public final f:[LT1/e;

.field public g:I

.field public h:I

.field public i:LT1/d;

.field public j:LH5/f;

.field public k:Z

.field public l:Z

.field public m:J

.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP2/l;)V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, Lc2/b;->n:I

    const/4 v0, 0x2

    .line 1
    new-array v1, v0, [LP2/i;

    new-array v0, v0, [LP2/c;

    invoke-direct {p0, v1, v0}, Lc2/b;-><init>([LT1/d;[LT1/e;)V

    .line 2
    iget v0, p0, Lc2/b;->g:I

    iget-object v1, p0, Lc2/b;->e:[LT1/d;

    array-length v2, v1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 3
    array-length v0, v1

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v2, v1, v3

    const/16 v4, 0x400

    .line 4
    invoke-virtual {v2, v4}, LT1/d;->r(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 5
    :cond_1
    iput-object p1, p0, Lc2/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LV1/c;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lc2/b;->n:I

    const/4 v0, 0x1

    .line 28
    new-array v1, v0, [LT1/d;

    new-array v0, v0, [Lc2/a;

    invoke-direct {p0, v1, v0}, Lc2/b;-><init>([LT1/d;[LT1/e;)V

    .line 29
    iput-object p1, p0, Lc2/b;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([LT1/d;[LT1/e;)V
    .locals 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide v0, p0, Lc2/b;->m:J

    .line 9
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 11
    iput-object p1, p0, Lc2/b;->e:[LT1/d;

    .line 12
    array-length p1, p1

    iput p1, p0, Lc2/b;->g:I

    const/4 p1, 0x0

    move v0, p1

    .line 13
    :goto_0
    iget v1, p0, Lc2/b;->g:I

    if-ge v0, v1, :cond_0

    .line 14
    iget-object v1, p0, Lc2/b;->e:[LT1/d;

    iget v2, p0, Lc2/b;->n:I

    packed-switch v2, :pswitch_data_0

    .line 15
    new-instance v2, LP2/i;

    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, LT1/d;-><init>(I)V

    goto :goto_1

    .line 17
    :pswitch_0
    new-instance v2, LT1/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, LT1/d;-><init>(I)V

    .line 18
    :goto_1
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 19
    :cond_0
    iput-object p2, p0, Lc2/b;->f:[LT1/e;

    .line 20
    array-length p2, p2

    iput p2, p0, Lc2/b;->h:I

    .line 21
    :goto_2
    iget p2, p0, Lc2/b;->h:I

    if-ge p1, p2, :cond_1

    .line 22
    iget-object p2, p0, Lc2/b;->f:[LT1/e;

    iget v0, p0, Lc2/b;->n:I

    packed-switch v0, :pswitch_data_1

    .line 23
    new-instance v0, LP2/c;

    invoke-direct {v0, p0}, LP2/c;-><init>(Lc2/b;)V

    goto :goto_3

    .line 24
    :pswitch_1
    new-instance v0, Lc2/a;

    invoke-direct {v0, p0}, Lc2/a;-><init>(Lc2/b;)V

    .line 25
    :goto_3
    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 26
    :cond_1
    new-instance p1, LH4/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, LH4/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lc2/b;->a:LH4/a;

    .line 27
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc2/b;->i()LT1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lc2/b;->j:LH5/f;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lc2/b;->i:LT1/d;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lc2/b;->g:I

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v3, p0, Lc2/b;->e:[LT1/d;

    .line 26
    .line 27
    sub-int/2addr v1, v2

    .line 28
    iput v1, p0, Lc2/b;->g:I

    .line 29
    .line 30
    aget-object v1, v3, v1

    .line 31
    .line 32
    :goto_1
    iput-object v1, p0, Lc2/b;->i:LT1/d;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    throw v1

    .line 39
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final bridge synthetic d(LP2/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc2/b;->k(LT1/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lc2/b;->g:I

    .line 5
    .line 6
    iget-object v2, p0, Lc2/b;->e:[LT1/d;

    .line 7
    .line 8
    array-length v2, v2

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    iget-boolean v1, p0, Lc2/b;->k:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 21
    :goto_1
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lc2/b;->m:J

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method

.method public final f(Ljava/lang/Throwable;)LH5/f;
    .locals 2

    .line 1
    iget v0, p0, Lc2/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LP2/f;

    .line 7
    .line 8
    const-string v1, "Unexpected decode error"

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lc2/d;

    .line 15
    .line 16
    const-string v1, "Unexpected decode error"

    .line 17
    .line 18
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lc2/b;->k:Z

    .line 6
    .line 7
    iget-object v1, p0, Lc2/b;->i:LT1/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, LT1/d;->o()V

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lc2/b;->g:I

    .line 15
    .line 16
    add-int/lit8 v3, v2, 0x1

    .line 17
    .line 18
    iput v3, p0, Lc2/b;->g:I

    .line 19
    .line 20
    iget-object v3, p0, Lc2/b;->e:[LT1/d;

    .line 21
    .line 22
    aput-object v1, v3, v2

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-object v1, p0, Lc2/b;->i:LT1/d;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    iget-object v1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, LT1/d;

    .line 45
    .line 46
    invoke-virtual {v1}, LT1/d;->o()V

    .line 47
    .line 48
    .line 49
    iget v2, p0, Lc2/b;->g:I

    .line 50
    .line 51
    add-int/lit8 v3, v2, 0x1

    .line 52
    .line 53
    iput v3, p0, Lc2/b;->g:I

    .line 54
    .line 55
    iget-object v3, p0, Lc2/b;->e:[LT1/d;

    .line 56
    .line 57
    aput-object v1, v3, v2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_1
    iget-object v1, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, LT1/e;

    .line 75
    .line 76
    invoke-virtual {v1}, LT1/e;->q()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    monitor-exit v0

    .line 81
    return-void

    .line 82
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    throw v1
.end method

.method public final g(LT1/d;LT1/e;Z)LH5/f;
    .locals 7

    .line 1
    iget v0, p0, Lc2/b;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP2/i;

    .line 7
    .line 8
    check-cast p2, LP2/c;

    .line 9
    .line 10
    :try_start_0
    iget-object v0, p1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, Lc2/b;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, LP2/l;

    .line 26
    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, LP2/l;->reset()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p3, 0x0

    .line 33
    invoke-interface {v2, p3, v0, v1}, LP2/l;->H(II[B)LP2/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-wide v1, p1, LT1/d;->g:J

    .line 38
    .line 39
    iget-wide v3, p1, LP2/i;->j:J

    .line 40
    .line 41
    iput-wide v1, p2, LT1/e;->c:J

    .line 42
    .line 43
    iput-object v0, p2, LP2/c;->e:LP2/d;

    .line 44
    .line 45
    const-wide v5, 0x7fffffffffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    cmp-long p1, v3, v5

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-wide v1, v3

    .line 56
    :goto_0
    iput-wide v1, p2, LP2/c;->f:J

    .line 57
    .line 58
    iput-boolean p3, p2, LT1/e;->d:Z
    :try_end_0
    .catch LP2/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p1

    .line 63
    :goto_1
    return-object p1

    .line 64
    :pswitch_0
    check-cast p2, Lc2/a;

    .line 65
    .line 66
    :try_start_1
    iget-object p3, p1, LT1/d;->e:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_2

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const/4 v0, 0x0

    .line 87
    :goto_2
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lc2/b;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, LV1/c;

    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p3, v1}, LV1/c;->b(I[B)Landroid/graphics/Bitmap;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    iput-object p3, p2, Lc2/a;->e:Landroid/graphics/Bitmap;

    .line 110
    .line 111
    iget-wide v0, p1, LT1/d;->g:J

    .line 112
    .line 113
    iput-wide v0, p2, LT1/e;->c:J
    :try_end_1
    .catch Lc2/d; {:try_start_1 .. :try_end_1} :catch_1

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    goto :goto_3

    .line 117
    :catch_1
    move-exception p1

    .line 118
    :goto_3
    return-object p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lc2/b;->l:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget v1, p0, Lc2/b;->h:I

    .line 19
    .line 20
    if-lez v1, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v1, v2

    .line 25
    :goto_1
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_1
    iget-boolean v1, p0, Lc2/b;->l:Z

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return v2

    .line 42
    :cond_2
    iget-object v1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LT1/d;

    .line 49
    .line 50
    iget-object v4, p0, Lc2/b;->f:[LT1/e;

    .line 51
    .line 52
    iget v5, p0, Lc2/b;->h:I

    .line 53
    .line 54
    sub-int/2addr v5, v3

    .line 55
    iput v5, p0, Lc2/b;->h:I

    .line 56
    .line 57
    aget-object v4, v4, v5

    .line 58
    .line 59
    iget-boolean v5, p0, Lc2/b;->k:Z

    .line 60
    .line 61
    iput-boolean v2, p0, Lc2/b;->k:Z

    .line 62
    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x4

    .line 65
    invoke-virtual {v1, v0}, LH5/a;->h(I)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {v4, v0}, LH5/a;->b(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    iget-wide v6, v1, LT1/d;->g:J

    .line 76
    .line 77
    iput-wide v6, v4, LT1/e;->c:J

    .line 78
    .line 79
    const/high16 v0, 0x8000000

    .line 80
    .line 81
    invoke-virtual {v1, v0}, LH5/a;->h(I)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    invoke-virtual {v4, v0}, LH5/a;->b(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    iget-wide v6, v1, LT1/d;->g:J

    .line 91
    .line 92
    invoke-virtual {p0, v6, v7}, Lc2/b;->j(J)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    iput-boolean v3, v4, LT1/e;->d:Z

    .line 99
    .line 100
    :cond_5
    :try_start_1
    invoke-virtual {p0, v1, v4, v5}, Lc2/b;->g(LT1/d;LT1/e;Z)LH5/f;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    .line 104
    goto :goto_2

    .line 105
    :catch_0
    move-exception v0

    .line 106
    invoke-virtual {p0, v0}, Lc2/b;->f(Ljava/lang/Throwable;)LH5/f;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_2

    .line 111
    :catch_1
    move-exception v0

    .line 112
    invoke-virtual {p0, v0}, Lc2/b;->f(Ljava/lang/Throwable;)LH5/f;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    if-eqz v0, :cond_6

    .line 117
    .line 118
    iget-object v5, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 119
    .line 120
    monitor-enter v5

    .line 121
    :try_start_2
    iput-object v0, p0, Lc2/b;->j:LH5/f;

    .line 122
    .line 123
    monitor-exit v5

    .line 124
    return v2

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    throw v0

    .line 128
    :cond_6
    :goto_3
    iget-object v2, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 129
    .line 130
    monitor-enter v2

    .line 131
    :try_start_3
    iget-boolean v0, p0, Lc2/b;->k:Z

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    invoke-virtual {v4}, LT1/e;->q()V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    iget-boolean v0, v4, LT1/e;->d:Z

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-virtual {v4}, LT1/e;->q()V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_8
    iget-object v0, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 150
    .line 151
    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    invoke-virtual {v1}, LT1/d;->o()V

    .line 155
    .line 156
    .line 157
    iget v0, p0, Lc2/b;->g:I

    .line 158
    .line 159
    add-int/lit8 v4, v0, 0x1

    .line 160
    .line 161
    iput v4, p0, Lc2/b;->g:I

    .line 162
    .line 163
    iget-object v4, p0, Lc2/b;->e:[LT1/d;

    .line 164
    .line 165
    aput-object v1, v4, v0

    .line 166
    .line 167
    monitor-exit v2

    .line 168
    return v3

    .line 169
    :goto_5
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    throw v0

    .line 171
    :goto_6
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 172
    throw v1
.end method

.method public final i()LT1/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lc2/b;->j:LH5/f;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lc2/b;->d:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, LT1/e;

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object v1

    .line 31
    :cond_1
    throw v1

    .line 32
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw v1
.end method

.method public final j(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lc2/b;->m:J

    .line 5
    .line 6
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v3, v1, v3

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    cmp-long p1, p1, v1

    .line 16
    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    return p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method public final k(LT1/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lc2/b;->j:LH5/f;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lc2/b;->i:LT1/d;

    .line 9
    .line 10
    if-ne p1, v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-static {v1}, LQ1/k;->c(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    iget p1, p0, Lc2/b;->h:I

    .line 32
    .line 33
    if-lez p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lc2/b;->i:LT1/d;

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    throw v1

    .line 48
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
.end method

.method public final l(LT1/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, LT1/e;->o()V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lc2/b;->h:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iput v2, p0, Lc2/b;->h:I

    .line 12
    .line 13
    iget-object v2, p0, Lc2/b;->f:[LT1/e;

    .line 14
    .line 15
    aput-object p1, v2, v1

    .line 16
    .line 17
    iget-object p1, p0, Lc2/b;->c:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget p1, p0, Lc2/b;->h:I

    .line 26
    .line 27
    if-lez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 32
    .line 33
    .line 34
    :cond_0
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1
.end method

.method public final release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lc2/b;->l:Z

    .line 6
    .line 7
    iget-object v1, p0, Lc2/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :try_start_1
    iget-object v0, p0, Lc2/b;->a:LH4/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    throw v1
.end method
