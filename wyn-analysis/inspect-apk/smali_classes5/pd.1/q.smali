.class public final Lpd/q;
.super Lod/c;
.source "SourceFile"


# instance fields
.field public final a:Lcg/g;


# direct methods
.method public constructor <init>(Lcg/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpd/q;->a:Lcg/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lpd/q;->a:Lcg/g;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    invoke-virtual {v0, v1, v2}, Lcg/g;->skip(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/q;->a:Lcg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/g;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h(I)Lod/c;
    .locals 4

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lpd/q;->a:Lcg/g;

    .line 7
    .line 8
    int-to-long v2, p1

    .line 9
    invoke-virtual {v0, v1, v2, v3}, Lcg/g;->E(Lcg/g;J)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lpd/q;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lpd/q;-><init>(Lcg/g;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final i(II[B)V
    .locals 2

    .line 1
    :goto_0
    if-lez p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lpd/q;->a:Lcg/g;

    .line 4
    .line 5
    invoke-virtual {v0, p3, p1, p2}, Lcg/g;->read([BII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    sub-int/2addr p2, v0

    .line 13
    add-int/2addr p1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 16
    .line 17
    const-string p3, "EOF trying to read "

    .line 18
    .line 19
    const-string v0, " bytes"

    .line 20
    .line 21
    invoke-static {p2, p3, v0}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    return-void
.end method

.method public final o(Ljava/io/OutputStream;I)V
    .locals 10

    .line 1
    int-to-long v4, p2

    .line 2
    iget-object p2, p0, Lpd/q;->a:Lcg/g;

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "out"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p2, Lcg/g;->b:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lcg/b;->f(JJJ)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p2, Lcg/g;->a:Lcg/C;

    .line 20
    .line 21
    :cond_0
    :goto_0
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    cmp-long v1, v4, v1

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget v1, v0, Lcg/C;->c:I

    .line 31
    .line 32
    iget v2, v0, Lcg/C;->b:I

    .line 33
    .line 34
    sub-int/2addr v1, v2

    .line 35
    int-to-long v1, v1

    .line 36
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    long-to-int v1, v1

    .line 41
    iget-object v2, v0, Lcg/C;->a:[B

    .line 42
    .line 43
    iget v3, v0, Lcg/C;->b:I

    .line 44
    .line 45
    invoke-virtual {p1, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 46
    .line 47
    .line 48
    iget v2, v0, Lcg/C;->b:I

    .line 49
    .line 50
    add-int/2addr v2, v1

    .line 51
    iput v2, v0, Lcg/C;->b:I

    .line 52
    .line 53
    iget-wide v6, p2, Lcg/g;->b:J

    .line 54
    .line 55
    int-to-long v8, v1

    .line 56
    sub-long/2addr v6, v8

    .line 57
    iput-wide v6, p2, Lcg/g;->b:J

    .line 58
    .line 59
    sub-long/2addr v4, v8

    .line 60
    iget v1, v0, Lcg/C;->c:I

    .line 61
    .line 62
    if-ne v2, v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0}, Lcg/C;->a()Lcg/C;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p2, Lcg/g;->a:Lcg/C;

    .line 69
    .line 70
    invoke-static {v0}, Lcg/D;->a(Lcg/C;)V

    .line 71
    .line 72
    .line 73
    move-object v0, v1

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return-void
.end method

.method public final w(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final y()I
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lpd/q;->a:Lcg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/g;->readByte()B

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    and-int/lit16 v0, v0, 0xff

    .line 8
    .line 9
    return v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1
.end method

.method public final z()I
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/q;->a:Lcg/g;

    .line 2
    .line 3
    iget-wide v0, v0, Lcg/g;->b:J

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    return v0
.end method
