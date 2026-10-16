.class public final Llg/c;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:[B

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Llg/c;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0x2000

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Llg/c;->a(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget v0, p0, Llg/c;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Llg/c;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    iget p1, p0, Llg/c;->e:I

    .line 14
    .line 15
    iget-object v0, p0, Llg/c;->c:[B

    .line 16
    .line 17
    array-length v0, v0

    .line 18
    add-int/2addr p1, v0

    .line 19
    iput p1, p0, Llg/c;->e:I

    .line 20
    .line 21
    iget p1, p0, Llg/c;->d:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    iput p1, p0, Llg/c;->d:I

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, [B

    .line 32
    .line 33
    iput-object p1, p0, Llg/c;->c:[B

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object v0, p0, Llg/c;->c:[B

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Llg/c;->e:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    array-length v0, v0

    .line 45
    shl-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iget v2, p0, Llg/c;->e:I

    .line 48
    .line 49
    sub-int/2addr p1, v2

    .line 50
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget v0, p0, Llg/c;->e:I

    .line 55
    .line 56
    iget-object v2, p0, Llg/c;->c:[B

    .line 57
    .line 58
    array-length v2, v2

    .line 59
    add-int/2addr v0, v2

    .line 60
    iput v0, p0, Llg/c;->e:I

    .line 61
    .line 62
    :goto_0
    iget v0, p0, Llg/c;->d:I

    .line 63
    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    iput v0, p0, Llg/c;->d:I

    .line 67
    .line 68
    sget-object v0, Lgg/c;->a:[B

    .line 69
    .line 70
    new-array p1, p1, [B

    .line 71
    .line 72
    iput-object p1, p0, Llg/c;->c:[B

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final b()[B
    .locals 7

    .line 1
    iget v0, p0, Llg/c;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lgg/c;->a:[B

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v1, Lgg/c;->a:[B

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    iget-object v2, p0, Llg/c;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, [B

    .line 31
    .line 32
    array-length v6, v5

    .line 33
    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v5, v3, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    add-int/2addr v4, v6

    .line 41
    sub-int/2addr v0, v6

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    :cond_2
    return-object v1
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Llg/c;->b()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final write(I)V
    .locals 3

    .line 10
    iget v0, p0, Llg/c;->b:I

    iget v1, p0, Llg/c;->e:I

    sub-int v1, v0, v1

    .line 11
    iget-object v2, p0, Llg/c;->c:[B

    array-length v2, v2

    if-ne v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Llg/c;->a(I)V

    const/4 v1, 0x0

    .line 13
    :cond_0
    iget-object v0, p0, Llg/c;->c:[B

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 14
    iget p1, p0, Llg/c;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Llg/c;->b:I

    return-void
.end method

.method public final write([B)V
    .locals 2

    .line 9
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Llg/c;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 6

    const/4 v0, 0x0

    if-ltz p2, :cond_3

    .line 1
    array-length v1, p1

    if-gt p2, v1, :cond_3

    if-ltz p3, :cond_3

    add-int v1, p2, p3

    array-length v2, p1

    if-gt v1, v2, :cond_3

    if-ltz v1, :cond_3

    if-nez p3, :cond_0

    return-void

    .line 2
    :cond_0
    iget p2, p0, Llg/c;->b:I

    add-int v2, p2, p3

    .line 3
    iget v3, p0, Llg/c;->e:I

    sub-int/2addr p2, v3

    :cond_1
    :goto_0
    if-lez p3, :cond_2

    .line 4
    iget-object v3, p0, Llg/c;->c:[B

    array-length v3, v3

    sub-int/2addr v3, p2

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int v4, v1, p3

    .line 5
    iget-object v5, p0, Llg/c;->c:[B

    invoke-static {p1, v4, v5, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr p3, v3

    if-lez p3, :cond_1

    .line 6
    invoke-virtual {p0, v2}, Llg/c;->a(I)V

    move p2, v0

    goto :goto_0

    .line 7
    :cond_2
    iput v2, p0, Llg/c;->b:I

    return-void

    .line 8
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const/4 p2, 0x1

    aput-object p3, v1, p2

    const-string p2, "offset=%,d, length=%,d"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
