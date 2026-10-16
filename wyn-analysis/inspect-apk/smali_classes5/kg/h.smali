.class public final Lkg/h;
.super Ljava/io/InputStream;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:[B

.field public final b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>([B)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 3
    iput-object p1, p0, Lkg/h;->a:[B

    .line 4
    iput v0, p0, Lkg/h;->b:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lkg/h;->c:I

    .line 6
    iput p1, p0, Lkg/h;->d:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 8
    const-string v0, "offset"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkg/h;->a(ILjava/lang/String;)V

    .line 9
    const-string v0, "length"

    invoke-static {p2, v0}, Lkg/h;->a(ILjava/lang/String;)V

    .line 10
    const-string v0, "data"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lkg/h;->a:[B

    .line 11
    const-string v0, "defaultValue"

    invoke-static {v1, v0}, Lkg/h;->a(ILjava/lang/String;)V

    .line 12
    array-length v2, p1

    if-lez v2, :cond_0

    array-length v2, p1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, p2

    .line 13
    array-length p2, p1

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lkg/h;->b:I

    .line 14
    invoke-static {v1, v0}, Lkg/h;->a(ILjava/lang/String;)V

    .line 15
    array-length p2, p1

    if-lez p2, :cond_1

    array-length p2, p1

    goto :goto_1

    :cond_1
    move p2, v1

    :goto_1
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 16
    iput p2, p0, Lkg/h;->c:I

    .line 17
    invoke-static {v1, v0}, Lkg/h;->a(ILjava/lang/String;)V

    .line 18
    array-length p2, p1

    if-lez p2, :cond_2

    array-length p1, p1

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 19
    iput p1, p0, Lkg/h;->d:I

    return-void
.end method

.method public static a(ILjava/lang/String;)V
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    const-string v0, " cannot be negative"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 1
    iget v0, p0, Lkg/h;->c:I

    .line 2
    .line 3
    iget v1, p0, Lkg/h;->b:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final mark(I)V
    .locals 0

    .line 1
    iget p1, p0, Lkg/h;->c:I

    .line 2
    .line 3
    iput p1, p0, Lkg/h;->d:I

    .line 4
    .line 5
    return-void
.end method

.method public final markSupported()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final read()I
    .locals 2

    .line 1
    iget v0, p0, Lkg/h;->c:I

    iget v1, p0, Lkg/h;->b:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lkg/h;->c:I

    iget-object v1, p0, Lkg/h;->a:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final read([B)I
    .locals 2

    .line 2
    const-string v0, "dest"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lkg/h;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    .line 4
    const-string v0, "dest"

    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-ltz p2, :cond_3

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    .line 5
    array-length v1, p1

    if-gt v0, v1, :cond_3

    .line 6
    iget v0, p0, Lkg/h;->c:I

    iget v1, p0, Lkg/h;->b:I

    if-lt v0, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr v1, v0

    if-ge p3, v1, :cond_1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    if-gtz p3, :cond_2

    const/4 p1, 0x0

    return p1

    .line 7
    :cond_2
    iget-object v1, p0, Lkg/h;->a:[B

    invoke-static {v1, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    iget p1, p0, Lkg/h;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lkg/h;->c:I

    return p3

    .line 9
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Lkg/h;->d:I

    .line 2
    .line 3
    iput v0, p0, Lkg/h;->c:I

    .line 4
    .line 5
    return-void
.end method

.method public final skip(J)J
    .locals 5

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
    iget v0, p0, Lkg/h;->c:I

    .line 8
    .line 9
    iget v1, p0, Lkg/h;->b:I

    .line 10
    .line 11
    sub-int/2addr v1, v0

    .line 12
    int-to-long v1, v1

    .line 13
    cmp-long v3, p1, v1

    .line 14
    .line 15
    if-gez v3, :cond_0

    .line 16
    .line 17
    move-wide v1, p1

    .line 18
    :cond_0
    long-to-int v3, p1

    .line 19
    int-to-long v3, v3

    .line 20
    cmp-long p1, p1, v3

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    int-to-long p1, v0

    .line 25
    add-long/2addr p1, v3

    .line 26
    long-to-int v0, p1

    .line 27
    int-to-long v3, v0

    .line 28
    cmp-long p1, p1, v3

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    iput v0, p0, Lkg/h;->c:I

    .line 33
    .line 34
    return-wide v1

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string p2, "Skipping backward is not supported"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method
