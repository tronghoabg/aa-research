.class public final LPf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPf/i;
.implements Ljava/lang/AutoCloseable;
.implements Ljava/io/Flushable;


# instance fields
.field public a:LPf/g;

.field public b:LPf/g;

.field public c:J


# virtual methods
.method public final a(II[B)I
    .locals 7

    .line 1
    array-length v0, p3

    .line 2
    int-to-long v1, v0

    .line 3
    int-to-long v3, p1

    .line 4
    int-to-long v5, p2

    .line 5
    invoke-static/range {v1 .. v6}, LPf/j;->a(JJJ)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LPf/a;->a:LPf/g;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p1, -0x1

    .line 13
    return p1

    .line 14
    :cond_0
    sub-int/2addr p2, p1

    .line 15
    invoke-virtual {v0}, LPf/g;->a()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    add-int v1, p1, p2

    .line 24
    .line 25
    sub-int/2addr v1, p1

    .line 26
    iget v2, v0, LPf/g;->b:I

    .line 27
    .line 28
    add-int v3, v2, v1

    .line 29
    .line 30
    iget-object v4, v0, LPf/g;->a:[B

    .line 31
    .line 32
    invoke-static {p1, v2, v3, v4, p3}, Lff/m;->f0(III[B[B)V

    .line 33
    .line 34
    .line 35
    iget p1, v0, LPf/g;->b:I

    .line 36
    .line 37
    add-int/2addr p1, v1

    .line 38
    iput p1, v0, LPf/g;->b:I

    .line 39
    .line 40
    iget-wide v1, p0, LPf/a;->c:J

    .line 41
    .line 42
    int-to-long v3, p2

    .line 43
    sub-long/2addr v1, v3

    .line 44
    iput-wide v1, p0, LPf/a;->c:J

    .line 45
    .line 46
    invoke-virtual {v0}, LPf/g;->a()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, LPf/a;->d()V

    .line 53
    .line 54
    .line 55
    :cond_1
    return p2
.end method

.method public final b(LPf/a;J)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v0, p2, v0

    .line 9
    .line 10
    if-ltz v0, :cond_1

    .line 11
    .line 12
    iget-wide v0, p0, LPf/a;->c:J

    .line 13
    .line 14
    cmp-long v2, v0, p2

    .line 15
    .line 16
    if-ltz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, p0, p2, p3}, LPf/a;->y(LPf/a;J)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p1, p0, v0, v1}, LPf/a;->y(LPf/a;J)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/io/EOFException;

    .line 26
    .line 27
    const-string v0, "Buffer exhausted before writing "

    .line 28
    .line 29
    const-string v1, " bytes. Only "

    .line 30
    .line 31
    invoke-static {p2, p3, v0, v1}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-wide v0, p0, LPf/a;->c:J

    .line 36
    .line 37
    const-string p3, " bytes were written."

    .line 38
    .line 39
    invoke-static {p2, v0, v1, p3}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    const-string p1, "byteCount ("

    .line 48
    .line 49
    const-string v0, ") < 0"

    .line 50
    .line 51
    invoke-static {p2, p3, p1, v0}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, LPf/a;->a:LPf/g;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, LPf/g;->f:LPf/g;

    .line 7
    .line 8
    iput-object v1, p0, LPf/a;->a:LPf/g;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v2, p0, LPf/a;->b:LPf/g;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object v2, v1, LPf/g;->g:LPf/g;

    .line 17
    .line 18
    :goto_0
    iput-object v2, v0, LPf/g;->f:LPf/g;

    .line 19
    .line 20
    invoke-static {v0}, LPf/h;->a(LPf/g;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final exhausted()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LPf/a;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getBuffer()LPf/a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h(LPf/d;)J
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    const-wide/16 v2, 0x2000

    .line 9
    .line 10
    invoke-interface {p1, p0, v2, v3}, LPf/d;->j(LPf/a;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-wide v0
.end method

.method public final i(LPf/a;)J
    .locals 4

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, LPf/a;->c:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0, v1}, LPf/a;->y(LPf/a;J)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-wide v0
.end method

.method public final j(LPf/a;J)J
    .locals 4

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    if-ltz v2, :cond_2

    .line 11
    .line 12
    iget-wide v2, p0, LPf/a;->c:J

    .line 13
    .line 14
    cmp-long v0, v2, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-wide/16 p1, -0x1

    .line 19
    .line 20
    return-wide p1

    .line 21
    :cond_0
    cmp-long v0, p2, v2

    .line 22
    .line 23
    if-lez v0, :cond_1

    .line 24
    .line 25
    move-wide p2, v2

    .line 26
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, LPf/a;->y(LPf/a;J)V

    .line 27
    .line 28
    .line 29
    return-wide p2

    .line 30
    :cond_2
    const-string p1, "byteCount ("

    .line 31
    .line 32
    const-string v0, ") < 0"

    .line 33
    .line 34
    invoke-static {p2, p3, p1, v0}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p2
.end method

.method public final synthetic o()LPf/g;
    .locals 3

    .line 1
    iget-object v0, p0, LPf/a;->b:LPf/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LPf/h;->b()LPf/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LPf/a;->a:LPf/g;

    .line 10
    .line 11
    iput-object v0, p0, LPf/a;->b:LPf/g;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget v1, v0, LPf/g;->c:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    const/16 v2, 0x2000

    .line 19
    .line 20
    if-gt v1, v2, :cond_2

    .line 21
    .line 22
    iget-boolean v1, v0, LPf/g;->e:Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v0

    .line 28
    :cond_2
    :goto_0
    invoke-static {}, LPf/h;->b()LPf/g;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, LPf/g;->d(LPf/g;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, LPf/a;->b:LPf/g;

    .line 36
    .line 37
    return-object v1
.end method

.method public final readByte()B
    .locals 6

    .line 1
    iget-object v0, p0, LPf/a;->a:LPf/g;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, LPf/g;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LPf/a;->d()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LPf/a;->readByte()B

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    iget v2, v0, LPf/g;->b:I

    .line 20
    .line 21
    add-int/lit8 v3, v2, 0x1

    .line 22
    .line 23
    iput v3, v0, LPf/g;->b:I

    .line 24
    .line 25
    iget-object v0, v0, LPf/g;->a:[B

    .line 26
    .line 27
    aget-byte v0, v0, v2

    .line 28
    .line 29
    iget-wide v2, p0, LPf/a;->c:J

    .line 30
    .line 31
    const-wide/16 v4, 0x1

    .line 32
    .line 33
    sub-long/2addr v2, v4

    .line 34
    iput-wide v2, p0, LPf/a;->c:J

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, LPf/a;->d()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return v0

    .line 43
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "Buffer doesn\'t contain required number of bytes (size: "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-wide v2, p0, LPf/a;->c:J

    .line 53
    .line 54
    const-string v4, ", required: 1)"

    .line 55
    .line 56
    invoke-static {v1, v2, v3, v4}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public final request(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, LPf/a;->c:J

    .line 8
    .line 9
    cmp-long p1, v0, p1

    .line 10
    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    const-string v0, "byteCount: "

    .line 18
    .line 19
    const-string v1, " < 0"

    .line 20
    .line 21
    invoke-static {p1, p2, v0, v1}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p2
.end method

.method public final require(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, LPf/a;->c:J

    .line 8
    .line 9
    cmp-long v0, v0, p1

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "Buffer doesn\'t contain required number of bytes (size: "

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-wide v2, p0, LPf/a;->c:J

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, ", required: "

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x29

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    const-string v0, "byteCount: "

    .line 50
    .line 51
    invoke-static {p1, p2, v0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2
.end method

.method public final skip(J)V
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_3

    .line 6
    .line 7
    move-wide v2, p1

    .line 8
    :cond_0
    :goto_0
    cmp-long v4, v2, v0

    .line 9
    .line 10
    if-lez v4, :cond_2

    .line 11
    .line 12
    iget-object v4, p0, LPf/a;->a:LPf/g;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    iget v5, v4, LPf/g;->c:I

    .line 17
    .line 18
    iget v6, v4, LPf/g;->b:I

    .line 19
    .line 20
    sub-int/2addr v5, v6

    .line 21
    int-to-long v5, v5

    .line 22
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v5

    .line 26
    long-to-int v5, v5

    .line 27
    iget-wide v6, p0, LPf/a;->c:J

    .line 28
    .line 29
    int-to-long v8, v5

    .line 30
    sub-long/2addr v6, v8

    .line 31
    iput-wide v6, p0, LPf/a;->c:J

    .line 32
    .line 33
    sub-long/2addr v2, v8

    .line 34
    iget v6, v4, LPf/g;->b:I

    .line 35
    .line 36
    add-int/2addr v6, v5

    .line 37
    iput v6, v4, LPf/g;->b:I

    .line 38
    .line 39
    iget v4, v4, LPf/g;->c:I

    .line 40
    .line 41
    if-ne v6, v4, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, LPf/a;->d()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v0, Ljava/io/EOFException;

    .line 48
    .line 49
    const-string v1, "Buffer exhausted before skipping "

    .line 50
    .line 51
    const-string v2, " bytes."

    .line 52
    .line 53
    invoke-static {p1, p2, v1, v2}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    return-void

    .line 62
    :cond_3
    const-string v0, "byteCount ("

    .line 63
    .line 64
    const-string v1, ") < 0"

    .line 65
    .line 66
    invoke-static {p1, p2, v0, v1}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-wide v0, p0, LPf/a;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-string v0, "Buffer(size=0)"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/16 v2, 0x40

    .line 13
    .line 14
    int-to-long v2, v2

    .line 15
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    long-to-int v0, v0

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    mul-int/lit8 v4, v0, 0x2

    .line 23
    .line 24
    iget-wide v5, p0, LPf/a;->c:J

    .line 25
    .line 26
    cmp-long v5, v5, v2

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-lez v5, :cond_1

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v5, v6

    .line 34
    :goto_0
    add-int/2addr v4, v5

    .line 35
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iget-object v4, p0, LPf/a;->a:LPf/g;

    .line 39
    .line 40
    move v5, v6

    .line 41
    :goto_1
    if-eqz v4, :cond_3

    .line 42
    .line 43
    move v7, v6

    .line 44
    :goto_2
    if-ge v5, v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v4}, LPf/g;->a()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-ge v7, v8, :cond_2

    .line 51
    .line 52
    add-int/lit8 v8, v7, 0x1

    .line 53
    .line 54
    invoke-virtual {v4, v7}, LPf/g;->b(I)B

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    sget-object v9, LPf/j;->a:[C

    .line 61
    .line 62
    shr-int/lit8 v10, v7, 0x4

    .line 63
    .line 64
    and-int/lit8 v10, v10, 0xf

    .line 65
    .line 66
    aget-char v10, v9, v10

    .line 67
    .line 68
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    and-int/lit8 v7, v7, 0xf

    .line 72
    .line 73
    aget-char v7, v9, v7

    .line 74
    .line 75
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    move v7, v8

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    iget-object v4, v4, LPf/g;->f:LPf/g;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    iget-wide v4, p0, LPf/a;->c:J

    .line 84
    .line 85
    cmp-long v0, v4, v2

    .line 86
    .line 87
    if-lez v0, :cond_4

    .line 88
    .line 89
    const/16 v0, 0x2026

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v2, "Buffer(size="

    .line 97
    .line 98
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-wide v2, p0, LPf/a;->c:J

    .line 102
    .line 103
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v2, " hex="

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v1, 0x29

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0
.end method

.method public final w(I[B)V
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p2

    .line 7
    int-to-long v1, v0

    .line 8
    const/4 v0, 0x0

    .line 9
    int-to-long v3, v0

    .line 10
    int-to-long v5, p1

    .line 11
    invoke-static/range {v1 .. v6}, LPf/j;->a(JJJ)V

    .line 12
    .line 13
    .line 14
    :goto_0
    if-ge v0, p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LPf/a;->o()LPf/g;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sub-int v2, p1, v0

    .line 21
    .line 22
    iget-object v3, v1, LPf/g;->a:[B

    .line 23
    .line 24
    array-length v4, v3

    .line 25
    iget v5, v1, LPf/g;->c:I

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    iget v4, v1, LPf/g;->c:I

    .line 34
    .line 35
    invoke-static {v4, v0, v2, p2, v3}, Lff/m;->f0(III[B[B)V

    .line 36
    .line 37
    .line 38
    iget v3, v1, LPf/g;->c:I

    .line 39
    .line 40
    sub-int v0, v2, v0

    .line 41
    .line 42
    add-int/2addr v0, v3

    .line 43
    iput v0, v1, LPf/g;->c:I

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-wide v0, p0, LPf/a;->c:J

    .line 48
    .line 49
    int-to-long p1, p1

    .line 50
    add-long/2addr v0, p1

    .line 51
    iput-wide v0, p0, LPf/a;->c:J

    .line 52
    .line 53
    return-void
.end method

.method public final y(LPf/a;J)V
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eq p1, p0, :cond_f

    .line 7
    .line 8
    iget-wide v0, p1, LPf/a;->c:J

    .line 9
    .line 10
    invoke-static {v0, v1, p2, p3}, LPf/j;->b(JJ)V

    .line 11
    .line 12
    .line 13
    :goto_0
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    cmp-long v0, p2, v0

    .line 16
    .line 17
    if-lez v0, :cond_e

    .line 18
    .line 19
    iget-object v0, p1, LPf/a;->a:LPf/g;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, LPf/g;->a()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-long v0, v0

    .line 29
    cmp-long v0, p2, v0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-gez v0, :cond_5

    .line 33
    .line 34
    iget-object v0, p0, LPf/a;->b:LPf/g;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-boolean v2, v0, LPf/g;->e:Z

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget v2, v0, LPf/g;->c:I

    .line 43
    .line 44
    int-to-long v2, v2

    .line 45
    add-long/2addr v2, p2

    .line 46
    iget-object v4, v0, LPf/g;->d:LPf/j;

    .line 47
    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    check-cast v4, LPf/f;

    .line 51
    .line 52
    iget v4, v4, LPf/f;->b:I

    .line 53
    .line 54
    if-lez v4, :cond_0

    .line 55
    .line 56
    move v4, v1

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    iget v4, v0, LPf/g;->b:I

    .line 59
    .line 60
    :goto_1
    int-to-long v4, v4

    .line 61
    sub-long/2addr v2, v4

    .line 62
    const-wide/16 v4, 0x2000

    .line 63
    .line 64
    cmp-long v2, v2, v4

    .line 65
    .line 66
    if-gtz v2, :cond_1

    .line 67
    .line 68
    iget-object v1, p1, LPf/a;->a:LPf/g;

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    long-to-int v2, p2

    .line 74
    invoke-virtual {v1, v0, v2}, LPf/g;->f(LPf/g;I)V

    .line 75
    .line 76
    .line 77
    iget-wide v0, p1, LPf/a;->c:J

    .line 78
    .line 79
    sub-long/2addr v0, p2

    .line 80
    iput-wide v0, p1, LPf/a;->c:J

    .line 81
    .line 82
    iget-wide v0, p0, LPf/a;->c:J

    .line 83
    .line 84
    add-long/2addr v0, p2

    .line 85
    iput-wide v0, p0, LPf/a;->c:J

    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    iget-object v0, p1, LPf/a;->a:LPf/g;

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    long-to-int v2, p2

    .line 94
    if-lez v2, :cond_4

    .line 95
    .line 96
    iget v3, v0, LPf/g;->c:I

    .line 97
    .line 98
    iget v4, v0, LPf/g;->b:I

    .line 99
    .line 100
    sub-int/2addr v3, v4

    .line 101
    if-gt v2, v3, :cond_4

    .line 102
    .line 103
    const/16 v3, 0x400

    .line 104
    .line 105
    if-lt v2, v3, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0}, LPf/g;->e()LPf/g;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-static {}, LPf/h;->b()LPf/g;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget v4, v0, LPf/g;->b:I

    .line 117
    .line 118
    add-int v5, v4, v2

    .line 119
    .line 120
    iget-object v6, v3, LPf/g;->a:[B

    .line 121
    .line 122
    iget-object v7, v0, LPf/g;->a:[B

    .line 123
    .line 124
    invoke-static {v1, v4, v5, v7, v6}, Lff/m;->f0(III[B[B)V

    .line 125
    .line 126
    .line 127
    :goto_2
    iget v4, v3, LPf/g;->b:I

    .line 128
    .line 129
    add-int/2addr v4, v2

    .line 130
    iput v4, v3, LPf/g;->c:I

    .line 131
    .line 132
    iget v4, v0, LPf/g;->b:I

    .line 133
    .line 134
    add-int/2addr v4, v2

    .line 135
    iput v4, v0, LPf/g;->b:I

    .line 136
    .line 137
    iget-object v2, v0, LPf/g;->g:LPf/g;

    .line 138
    .line 139
    if-eqz v2, :cond_3

    .line 140
    .line 141
    invoke-virtual {v2, v3}, LPf/g;->d(LPf/g;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_3
    iput-object v0, v3, LPf/g;->f:LPf/g;

    .line 146
    .line 147
    iput-object v3, v0, LPf/g;->g:LPf/g;

    .line 148
    .line 149
    :goto_3
    iput-object v3, p1, LPf/a;->a:LPf/g;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    const-string p2, "byteCount out of range"

    .line 155
    .line 156
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_5
    :goto_4
    iget-object v0, p1, LPf/a;->a:LPf/g;

    .line 161
    .line 162
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, LPf/g;->a()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    int-to-long v2, v2

    .line 170
    invoke-virtual {v0}, LPf/g;->c()LPf/g;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    iput-object v4, p1, LPf/a;->a:LPf/g;

    .line 175
    .line 176
    if-nez v4, :cond_6

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    iput-object v4, p1, LPf/a;->b:LPf/g;

    .line 180
    .line 181
    :cond_6
    iget-object v4, p0, LPf/a;->a:LPf/g;

    .line 182
    .line 183
    if-nez v4, :cond_7

    .line 184
    .line 185
    iput-object v0, p0, LPf/a;->a:LPf/g;

    .line 186
    .line 187
    iput-object v0, p0, LPf/a;->b:LPf/g;

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_7
    iget-object v4, p0, LPf/a;->b:LPf/g;

    .line 191
    .line 192
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4, v0}, LPf/g;->d(LPf/g;)V

    .line 196
    .line 197
    .line 198
    iget-object v4, v0, LPf/g;->g:LPf/g;

    .line 199
    .line 200
    if-eqz v4, :cond_d

    .line 201
    .line 202
    iget-boolean v5, v4, LPf/g;->e:Z

    .line 203
    .line 204
    if-nez v5, :cond_8

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_8
    iget v5, v0, LPf/g;->c:I

    .line 208
    .line 209
    iget v6, v0, LPf/g;->b:I

    .line 210
    .line 211
    sub-int/2addr v5, v6

    .line 212
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget v4, v4, LPf/g;->c:I

    .line 216
    .line 217
    rsub-int v4, v4, 0x2000

    .line 218
    .line 219
    iget-object v6, v0, LPf/g;->g:LPf/g;

    .line 220
    .line 221
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v6, v6, LPf/g;->d:LPf/j;

    .line 225
    .line 226
    if-eqz v6, :cond_9

    .line 227
    .line 228
    check-cast v6, LPf/f;

    .line 229
    .line 230
    iget v6, v6, LPf/f;->b:I

    .line 231
    .line 232
    if-lez v6, :cond_9

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_9
    iget-object v1, v0, LPf/g;->g:LPf/g;

    .line 236
    .line 237
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget v1, v1, LPf/g;->b:I

    .line 241
    .line 242
    :goto_5
    add-int/2addr v4, v1

    .line 243
    if-le v5, v4, :cond_a

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_a
    iget-object v1, v0, LPf/g;->g:LPf/g;

    .line 247
    .line 248
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v1, v5}, LPf/g;->f(LPf/g;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, LPf/g;->c()LPf/g;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    if-nez v4, :cond_c

    .line 259
    .line 260
    invoke-static {v0}, LPf/h;->a(LPf/g;)V

    .line 261
    .line 262
    .line 263
    move-object v0, v1

    .line 264
    :goto_6
    iput-object v0, p0, LPf/a;->b:LPf/g;

    .line 265
    .line 266
    iget-object v1, v0, LPf/g;->g:LPf/g;

    .line 267
    .line 268
    if-nez v1, :cond_b

    .line 269
    .line 270
    iput-object v0, p0, LPf/a;->a:LPf/g;

    .line 271
    .line 272
    :cond_b
    :goto_7
    iget-wide v0, p1, LPf/a;->c:J

    .line 273
    .line 274
    sub-long/2addr v0, v2

    .line 275
    iput-wide v0, p1, LPf/a;->c:J

    .line 276
    .line 277
    iget-wide v0, p0, LPf/a;->c:J

    .line 278
    .line 279
    add-long/2addr v0, v2

    .line 280
    iput-wide v0, p0, LPf/a;->c:J

    .line 281
    .line 282
    sub-long/2addr p2, v2

    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    const-string p2, "Check failed."

    .line 288
    .line 289
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw p1

    .line 293
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    const-string p2, "cannot compact"

    .line 296
    .line 297
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw p1

    .line 301
    :cond_e
    return-void

    .line 302
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 303
    .line 304
    const-string p2, "source == this"

    .line 305
    .line 306
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p1
.end method

.method public final z(B)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LPf/a;->o()LPf/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, LPf/g;->c:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, v0, LPf/g;->c:I

    .line 10
    .line 11
    iget-object v0, v0, LPf/g;->a:[B

    .line 12
    .line 13
    aput-byte p1, v0, v1

    .line 14
    .line 15
    iget-wide v0, p0, LPf/a;->c:J

    .line 16
    .line 17
    const-wide/16 v2, 0x1

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    iput-wide v0, p0, LPf/a;->c:J

    .line 21
    .line 22
    return-void
.end method
