.class public final Lcg/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg/i;


# instance fields
.field public final a:Lcg/H;

.field public final b:Lcg/g;

.field public c:Z


# direct methods
.method public constructor <init>(Lcg/H;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcg/B;->a:Lcg/H;

    .line 10
    .line 11
    new-instance p1, Lcg/g;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcg/B;->b:Lcg/g;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final F(Lcg/h;)J
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    move-wide v2, v0

    .line 4
    :cond_0
    :goto_0
    iget-object v4, p0, Lcg/B;->b:Lcg/g;

    .line 5
    .line 6
    iget-object v5, p0, Lcg/B;->a:Lcg/H;

    .line 7
    .line 8
    const-wide/16 v6, 0x2000

    .line 9
    .line 10
    invoke-interface {v5, v4, v6, v7}, Lcg/H;->read(Lcg/g;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v5

    .line 14
    const-wide/16 v7, -0x1

    .line 15
    .line 16
    cmp-long v5, v5, v7

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    invoke-virtual {v4}, Lcg/g;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    cmp-long v7, v5, v0

    .line 25
    .line 26
    if-lez v7, :cond_0

    .line 27
    .line 28
    add-long/2addr v2, v5

    .line 29
    invoke-interface {p1, v4, v5, v6}, Lcg/F;->E(Lcg/g;J)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-wide v5, v4, Lcg/g;->b:J

    .line 34
    .line 35
    cmp-long v0, v5, v0

    .line 36
    .line 37
    if-lez v0, :cond_2

    .line 38
    .line 39
    add-long/2addr v2, v5

    .line 40
    invoke-interface {p1, v4, v5, v6}, Lcg/F;->E(Lcg/g;J)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-wide v2
.end method

.method public final a(J)Lcg/j;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lcg/B;->require(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lcg/g;->z(J)Lcg/j;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcg/B;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcg/g;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final e(JLcg/j;)Z
    .locals 5

    .line 1
    const-string p1, "bytes"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p3, Lcg/j;->a:[B

    .line 7
    .line 8
    array-length p2, p1

    .line 9
    iget-boolean p3, p0, Lcg/B;->c:Z

    .line 10
    .line 11
    if-nez p3, :cond_5

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    if-ltz p2, :cond_4

    .line 15
    .line 16
    array-length v0, p1

    .line 17
    if-ge v0, p2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move v0, p3

    .line 21
    :goto_0
    if-ge v0, p2, :cond_3

    .line 22
    .line 23
    int-to-long v1, v0

    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    add-long/2addr v3, v1

    .line 27
    invoke-virtual {p0, v3, v4}, Lcg/B;->request(J)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object v3, p0, Lcg/B;->b:Lcg/g;

    .line 35
    .line 36
    invoke-virtual {v3, v1, v2}, Lcg/g;->o(J)B

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    aget-byte v2, p1, v0

    .line 41
    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const/4 p1, 0x1

    .line 49
    return p1

    .line 50
    :cond_4
    :goto_1
    return p3

    .line 51
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "closed"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public final exhausted()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcg/g;->exhausted()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    .line 14
    .line 15
    const-wide/16 v2, 0x2000

    .line 16
    .line 17
    invoke-interface {v1, v0, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/16 v2, -0x1

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "closed"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final getBuffer()Lcg/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final indexOf(BJJ)J
    .locals 9

    .line 1
    iget-boolean p2, p0, Lcg/B;->c:Z

    .line 2
    .line 3
    if-nez p2, :cond_4

    .line 4
    .line 5
    const-wide/16 p2, 0x0

    .line 6
    .line 7
    cmp-long v0, p2, p4

    .line 8
    .line 9
    if-gtz v0, :cond_3

    .line 10
    .line 11
    move-wide v3, p2

    .line 12
    :goto_0
    cmp-long p2, v3, p4

    .line 13
    .line 14
    const-wide/16 v7, -0x1

    .line 15
    .line 16
    if-gez p2, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lcg/B;->b:Lcg/g;

    .line 19
    .line 20
    move v2, p1

    .line 21
    move-wide v5, p4

    .line 22
    invoke-virtual/range {v1 .. v6}, Lcg/g;->indexOf(BJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    cmp-long p3, p1, v7

    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    return-wide p1

    .line 31
    :cond_0
    iget-wide p1, v1, Lcg/g;->b:J

    .line 32
    .line 33
    cmp-long p3, p1, v5

    .line 34
    .line 35
    if-gez p3, :cond_2

    .line 36
    .line 37
    iget-object p3, p0, Lcg/B;->a:Lcg/H;

    .line 38
    .line 39
    const-wide/16 p4, 0x2000

    .line 40
    .line 41
    invoke-interface {p3, v1, p4, p5}, Lcg/H;->read(Lcg/g;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    cmp-long p3, p3, v7

    .line 46
    .line 47
    if-nez p3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    move p1, v2

    .line 55
    move-wide p4, v5

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-wide v7

    .line 58
    :cond_3
    move-wide v5, p4

    .line 59
    const-string p1, "fromIndex=0 toIndex="

    .line 60
    .line 61
    invoke-static {v5, v6, p1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p2

    .line 75
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string p2, "closed"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public final inputStream()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, LCd/t;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public final m(Lcg/j;)J
    .locals 10

    .line 1
    const-string v0, "targetBytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    :goto_0
    iget-object v2, p0, Lcg/B;->b:Lcg/g;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v1, p1}, Lcg/g;->y(JLcg/j;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    const-wide/16 v5, -0x1

    .line 19
    .line 20
    cmp-long v7, v3, v5

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    return-wide v3

    .line 25
    :cond_0
    iget-wide v3, v2, Lcg/g;->b:J

    .line 26
    .line 27
    iget-object v7, p0, Lcg/B;->a:Lcg/H;

    .line 28
    .line 29
    const-wide/16 v8, 0x2000

    .line 30
    .line 31
    invoke-interface {v7, v2, v8, v9}, Lcg/H;->read(Lcg/g;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    cmp-long v2, v7, v5

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    return-wide v5

    .line 40
    :cond_1
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "closed"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final r(Lcg/x;)I
    .locals 6

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v0, p1, v1}, Ldg/a;->c(Lcg/g;Lcg/x;Z)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, -0x2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    if-eq v1, v3, :cond_2

    .line 22
    .line 23
    iget-object p1, p1, Lcg/x;->a:[Lcg/j;

    .line 24
    .line 25
    aget-object p1, p1, v1

    .line 26
    .line 27
    invoke-virtual {p1}, Lcg/j;->d()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-long v2, p1

    .line 32
    invoke-virtual {v0, v2, v3}, Lcg/g;->skip(J)V

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    .line 37
    .line 38
    const-wide/16 v4, 0x2000

    .line 39
    .line 40
    invoke-interface {v1, v0, v4, v5}, Lcg/H;->read(Lcg/g;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    const-wide/16 v4, -0x1

    .line 45
    .line 46
    cmp-long v0, v0, v4

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    :cond_2
    return v3

    .line 51
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "closed"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    iget-wide v1, v0, Lcg/g;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 2
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcg/g;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final read(Lcg/g;J)J
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 4
    iget-boolean v2, p0, Lcg/B;->c:Z

    if-nez v2, :cond_1

    .line 5
    iget-object v2, p0, Lcg/B;->b:Lcg/g;

    iget-wide v3, v2, Lcg/g;->b:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lcg/H;->read(Lcg/g;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    return-wide v3

    .line 7
    :cond_0
    iget-wide v0, v2, Lcg/g;->b:J

    .line 8
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    .line 9
    invoke-virtual {v2, p1, p2, p3}, Lcg/g;->read(Lcg/g;J)J

    move-result-wide p1

    return-wide p1

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_2
    const-string p1, "byteCount < 0: "

    .line 12
    invoke-static {p2, p3, p1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final readByte()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/B;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/g;->readByte()B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final readByteArray()[B
    .locals 4

    .line 1
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    .line 2
    .line 3
    iget-object v1, p0, Lcg/B;->b:Lcg/g;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcg/g;->q(Lcg/H;)J

    .line 6
    .line 7
    .line 8
    iget-wide v2, v1, Lcg/g;->b:J

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3}, Lcg/g;->readByteArray(J)[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final readByteString()Lcg/j;
    .locals 4

    .line 1
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    .line 2
    .line 3
    iget-object v1, p0, Lcg/B;->b:Lcg/g;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lcg/g;->q(Lcg/H;)J

    .line 6
    .line 7
    .line 8
    iget-wide v2, v1, Lcg/g;->b:J

    .line 9
    .line 10
    invoke-virtual {v1, v2, v3}, Lcg/g;->z(J)Lcg/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final readInt()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/B;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/g;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final readIntLe()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/B;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/g;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Lcg/b;->i(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public final readLongLe()J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lcg/B;->require(J)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcg/B;->b:Lcg/g;

    .line 9
    .line 10
    iget-wide v2, v1, Lcg/g;->b:J

    .line 11
    .line 12
    const-wide/16 v4, 0x8

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    if-ltz v2, :cond_2

    .line 17
    .line 18
    iget-object v2, v1, Lcg/g;->a:Lcg/C;

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget v3, v2, Lcg/C;->b:I

    .line 24
    .line 25
    iget v6, v2, Lcg/C;->c:I

    .line 26
    .line 27
    sub-int v7, v6, v3

    .line 28
    .line 29
    int-to-long v7, v7

    .line 30
    cmp-long v7, v7, v4

    .line 31
    .line 32
    const/16 v8, 0x20

    .line 33
    .line 34
    if-gez v7, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Lcg/g;->readInt()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    int-to-long v2, v2

    .line 41
    const-wide v4, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v2, v4

    .line 47
    shl-long/2addr v2, v8

    .line 48
    invoke-virtual {v1}, Lcg/g;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    int-to-long v6, v1

    .line 53
    and-long/2addr v4, v6

    .line 54
    or-long/2addr v2, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v7, v3, 0x1

    .line 57
    .line 58
    iget-object v9, v2, Lcg/C;->a:[B

    .line 59
    .line 60
    aget-byte v10, v9, v3

    .line 61
    .line 62
    int-to-long v10, v10

    .line 63
    const-wide/16 v12, 0xff

    .line 64
    .line 65
    and-long/2addr v10, v12

    .line 66
    const/16 v14, 0x38

    .line 67
    .line 68
    shl-long/2addr v10, v14

    .line 69
    add-int/lit8 v14, v3, 0x2

    .line 70
    .line 71
    aget-byte v7, v9, v7

    .line 72
    .line 73
    move-wide v15, v4

    .line 74
    int-to-long v4, v7

    .line 75
    and-long/2addr v4, v12

    .line 76
    const/16 v7, 0x30

    .line 77
    .line 78
    shl-long/2addr v4, v7

    .line 79
    or-long/2addr v4, v10

    .line 80
    add-int/lit8 v7, v3, 0x3

    .line 81
    .line 82
    aget-byte v10, v9, v14

    .line 83
    .line 84
    int-to-long v10, v10

    .line 85
    and-long/2addr v10, v12

    .line 86
    const/16 v14, 0x28

    .line 87
    .line 88
    shl-long/2addr v10, v14

    .line 89
    or-long/2addr v4, v10

    .line 90
    add-int/lit8 v10, v3, 0x4

    .line 91
    .line 92
    aget-byte v7, v9, v7

    .line 93
    .line 94
    move v11, v8

    .line 95
    move-object v14, v9

    .line 96
    int-to-long v8, v7

    .line 97
    and-long/2addr v8, v12

    .line 98
    shl-long v7, v8, v11

    .line 99
    .line 100
    or-long/2addr v4, v7

    .line 101
    add-int/lit8 v7, v3, 0x5

    .line 102
    .line 103
    aget-byte v8, v14, v10

    .line 104
    .line 105
    int-to-long v8, v8

    .line 106
    and-long/2addr v8, v12

    .line 107
    const/16 v10, 0x18

    .line 108
    .line 109
    shl-long/2addr v8, v10

    .line 110
    or-long/2addr v4, v8

    .line 111
    add-int/lit8 v8, v3, 0x6

    .line 112
    .line 113
    aget-byte v7, v14, v7

    .line 114
    .line 115
    int-to-long v9, v7

    .line 116
    and-long/2addr v9, v12

    .line 117
    const/16 v7, 0x10

    .line 118
    .line 119
    shl-long/2addr v9, v7

    .line 120
    or-long/2addr v4, v9

    .line 121
    add-int/lit8 v7, v3, 0x7

    .line 122
    .line 123
    aget-byte v8, v14, v8

    .line 124
    .line 125
    int-to-long v8, v8

    .line 126
    and-long/2addr v8, v12

    .line 127
    const/16 v10, 0x8

    .line 128
    .line 129
    shl-long/2addr v8, v10

    .line 130
    or-long/2addr v4, v8

    .line 131
    add-int/2addr v3, v10

    .line 132
    aget-byte v7, v14, v7

    .line 133
    .line 134
    int-to-long v7, v7

    .line 135
    and-long/2addr v7, v12

    .line 136
    or-long/2addr v4, v7

    .line 137
    iget-wide v7, v1, Lcg/g;->b:J

    .line 138
    .line 139
    sub-long/2addr v7, v15

    .line 140
    iput-wide v7, v1, Lcg/g;->b:J

    .line 141
    .line 142
    if-ne v3, v6, :cond_1

    .line 143
    .line 144
    invoke-virtual {v2}, Lcg/C;->a()Lcg/C;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iput-object v3, v1, Lcg/g;->a:Lcg/C;

    .line 149
    .line 150
    invoke-static {v2}, Lcg/D;->a(Lcg/C;)V

    .line 151
    .line 152
    .line 153
    :goto_0
    move-wide v2, v4

    .line 154
    goto :goto_1

    .line 155
    :cond_1
    iput v3, v2, Lcg/C;->b:I

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :goto_1
    const-wide/high16 v4, -0x100000000000000L

    .line 159
    .line 160
    and-long/2addr v4, v2

    .line 161
    const/16 v1, 0x38

    .line 162
    .line 163
    ushr-long/2addr v4, v1

    .line 164
    const-wide/high16 v6, 0xff000000000000L

    .line 165
    .line 166
    and-long/2addr v6, v2

    .line 167
    const/16 v8, 0x28

    .line 168
    .line 169
    ushr-long/2addr v6, v8

    .line 170
    or-long/2addr v4, v6

    .line 171
    const-wide v6, 0xff0000000000L

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    and-long/2addr v6, v2

    .line 177
    const/16 v9, 0x18

    .line 178
    .line 179
    ushr-long/2addr v6, v9

    .line 180
    or-long/2addr v4, v6

    .line 181
    const-wide v6, 0xff00000000L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    and-long/2addr v6, v2

    .line 187
    const/16 v10, 0x8

    .line 188
    .line 189
    ushr-long/2addr v6, v10

    .line 190
    or-long/2addr v4, v6

    .line 191
    const-wide v6, 0xff000000L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    and-long/2addr v6, v2

    .line 197
    shl-long/2addr v6, v10

    .line 198
    or-long/2addr v4, v6

    .line 199
    const-wide/32 v6, 0xff0000

    .line 200
    .line 201
    .line 202
    and-long/2addr v6, v2

    .line 203
    shl-long/2addr v6, v9

    .line 204
    or-long/2addr v4, v6

    .line 205
    const-wide/32 v6, 0xff00

    .line 206
    .line 207
    .line 208
    and-long/2addr v6, v2

    .line 209
    shl-long/2addr v6, v8

    .line 210
    or-long/2addr v4, v6

    .line 211
    const-wide/16 v6, 0xff

    .line 212
    .line 213
    and-long/2addr v2, v6

    .line 214
    shl-long v1, v2, v1

    .line 215
    .line 216
    or-long/2addr v1, v4

    .line 217
    return-wide v1

    .line 218
    :cond_2
    new-instance v1, Ljava/io/EOFException;

    .line 219
    .line 220
    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    .line 221
    .line 222
    .line 223
    throw v1
.end method

.method public final readShort()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/B;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/g;->readShort()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final readShortLe()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lcg/B;->require(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcg/g;->readShortLe()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final readString(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcg/g;->q(Lcg/H;)J

    .line 6
    .line 7
    .line 8
    iget-wide v1, v0, Lcg/g;->b:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, p1}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final readUtf8(J)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcg/B;->require(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v1, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, v1}, Lcg/g;->readString(JLjava/nio/charset/Charset;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final readUtf8LineStrict(J)Ljava/lang/String;
    .locals 18

    .line 1
    move-wide/from16 v6, p1

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v0

    .line 6
    .line 7
    if-ltz v0, :cond_3

    .line 8
    .line 9
    const-wide v8, 0x7fffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v6, v8

    .line 15
    .line 16
    const-wide/16 v10, 0x1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move-wide v4, v8

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-long v0, v6, v10

    .line 23
    .line 24
    move-wide v4, v0

    .line 25
    :goto_0
    const/16 v1, 0xa

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    move-object/from16 v0, p0

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v5}, Lcg/B;->indexOf(BJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    const-wide/16 v12, -0x1

    .line 36
    .line 37
    cmp-long v3, v1, v12

    .line 38
    .line 39
    iget-object v12, v0, Lcg/B;->b:Lcg/g;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-static {v12, v1, v2}, Ldg/a;->b(Lcg/g;J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    return-object v1

    .line 48
    :cond_1
    cmp-long v1, v4, v8

    .line 49
    .line 50
    if-gez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v4, v5}, Lcg/B;->request(J)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    sub-long v1, v4, v10

    .line 59
    .line 60
    invoke-virtual {v12, v1, v2}, Lcg/g;->o(J)B

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/16 v2, 0xd

    .line 65
    .line 66
    if-ne v1, v2, :cond_2

    .line 67
    .line 68
    add-long v1, v4, v10

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lcg/B;->request(J)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v12, v4, v5}, Lcg/g;->o(J)B

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v2, 0xa

    .line 81
    .line 82
    if-ne v1, v2, :cond_2

    .line 83
    .line 84
    invoke-static {v12, v4, v5}, Ldg/a;->b(Lcg/g;J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    return-object v1

    .line 89
    :cond_2
    new-instance v13, Lcg/g;

    .line 90
    .line 91
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-wide v1, v12, Lcg/g;->b:J

    .line 95
    .line 96
    const/16 v3, 0x20

    .line 97
    .line 98
    int-to-long v3, v3

    .line 99
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v16

    .line 103
    const-wide/16 v14, 0x0

    .line 104
    .line 105
    invoke-virtual/range {v12 .. v17}, Lcg/g;->h(Lcg/g;JJ)V

    .line 106
    .line 107
    .line 108
    new-instance v1, Ljava/io/EOFException;

    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "\\n not found: limit="

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-wide v3, v12, Lcg/g;->b:J

    .line 118
    .line 119
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 120
    .line 121
    .line 122
    move-result-wide v3

    .line 123
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v3, " content="

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-wide v3, v13, Lcg/g;->b:J

    .line 132
    .line 133
    invoke-virtual {v13, v3, v4}, Lcg/g;->z(J)Lcg/j;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Lcg/j;->e()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const/16 v3, 0x2026

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-direct {v1, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_3
    move-object/from16 v0, p0

    .line 158
    .line 159
    const-string v1, "limit < 0: "

    .line 160
    .line 161
    invoke-static {v6, v7, v1}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v2
.end method

.method public final request(J)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcg/B;->b:Lcg/g;

    .line 12
    .line 13
    iget-wide v1, v0, Lcg/g;->b:J

    .line 14
    .line 15
    cmp-long v1, v1, p1

    .line 16
    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    .line 20
    .line 21
    const-wide/16 v2, 0x2000

    .line 22
    .line 23
    invoke-interface {v1, v0, v2, v3}, Lcg/H;->read(Lcg/g;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :cond_1
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "closed"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_3
    const-string v0, "byteCount < 0: "

    .line 46
    .line 47
    invoke-static {p1, p2, v0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p2
.end method

.method public final require(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcg/B;->request(J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final s(Lcg/j;)J
    .locals 10

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    :goto_0
    iget-object v2, p0, Lcg/B;->b:Lcg/g;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v1, p1}, Lcg/g;->w(JLcg/j;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    const-wide/16 v5, -0x1

    .line 19
    .line 20
    cmp-long v7, v3, v5

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    return-wide v3

    .line 25
    :cond_0
    iget-wide v3, v2, Lcg/g;->b:J

    .line 26
    .line 27
    iget-object v7, p0, Lcg/B;->a:Lcg/H;

    .line 28
    .line 29
    const-wide/16 v8, 0x2000

    .line 30
    .line 31
    invoke-interface {v7, v2, v8, v9}, Lcg/H;->read(Lcg/g;J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    cmp-long v2, v7, v5

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    return-wide v5

    .line 40
    :cond_1
    iget-object v2, p1, Lcg/j;->a:[B

    .line 41
    .line 42
    array-length v2, v2

    .line 43
    int-to-long v5, v2

    .line 44
    sub-long/2addr v3, v5

    .line 45
    const-wide/16 v5, 0x1

    .line 46
    .line 47
    add-long/2addr v3, v5

    .line 48
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "closed"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final skip(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcg/B;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lcg/B;->b:Lcg/g;

    .line 12
    .line 13
    iget-wide v3, v2, Lcg/g;->b:J

    .line 14
    .line 15
    cmp-long v0, v3, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v2, v3, v4}, Lcg/H;->read(Lcg/g;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v3

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_1
    iget-wide v0, v2, Lcg/g;->b:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v2, v0, v1}, Lcg/g;->skip(J)V

    .line 47
    .line 48
    .line 49
    sub-long/2addr p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "closed"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

.method public final timeout()Lcg/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/B;->a:Lcg/H;

    .line 2
    .line 3
    invoke-interface {v0}, Lcg/H;->timeout()Lcg/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcg/B;->a:Lcg/H;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
