.class public abstract LM2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LM2/r;->a:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.8909645E8f
        0x4d344120    # 1.8901043E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
.end method

.method public static a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    array-length v1, p2

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    add-int/lit8 v1, v1, 0x20

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    array-length v2, p1

    .line 12
    mul-int/lit8 v2, v2, 0x10

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x4

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    :cond_1
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    const v1, 0x70737368    # 3.013775E29f

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    const/high16 v1, 0x1000000

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v1, v0

    .line 36
    :goto_1
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    array-length p0, p1

    .line 56
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    array-length p0, p1

    .line 60
    move v1, v0

    .line 61
    :goto_2
    if-ge v1, p0, :cond_3

    .line 62
    .line 63
    aget-object v3, p1, v1

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-virtual {v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    if-eqz p2, :cond_4

    .line 83
    .line 84
    array-length p0, p2

    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    array-length p0, p2

    .line 88
    invoke-virtual {v2, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    .line 98
    :goto_3
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method

.method public static b(LN1/B;Ljava/lang/String;)LR1/a;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LN1/B;->a:[LN1/A;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    instance-of v2, v1, LR1/a;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, LR1/a;

    .line 14
    .line 15
    iget-object v2, v1, LR1/a;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static c(IZ)Z
    .locals 4

    .line 1
    ushr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    const v1, 0x336770

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    const v0, 0x68656963

    .line 11
    .line 12
    .line 13
    if-ne p0, v0, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    sget-object p1, LM2/r;->a:[I

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    move v1, v0

    .line 22
    :goto_0
    const/16 v3, 0x1d

    .line 23
    .line 24
    if-ge v1, v3, :cond_3

    .line 25
    .line 26
    aget v3, p1, v1

    .line 27
    .line 28
    if-ne v3, p0, :cond_2

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    return v0
.end method

.method public static d(ILQ1/o;)LG2/e;
    .locals 3

    .line 1
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const/16 p0, 0x8

    .line 15
    .line 16
    invoke-virtual {p1, p0}, LQ1/o;->H(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    invoke-virtual {p1, v0}, LQ1/o;->q(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, LG2/e;

    .line 26
    .line 27
    const-string v0, "und"

    .line 28
    .line 29
    invoke-direct {p1, v0, p0, p0}, LG2/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v0, "Failed to parse comment attribute: "

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, LH5/a;->f(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "MetadataUtil"

    .line 52
    .line 53
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    return-object p0
.end method

.method public static e(LQ1/o;)LG2/a;
    .locals 5

    .line 1
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const-string v3, "MetadataUtil"

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne v1, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sget-object v2, LM2/g;->a:[B

    .line 22
    .line 23
    const v2, 0xffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v1, v2

    .line 27
    const/16 v2, 0xd

    .line 28
    .line 29
    if-ne v1, v2, :cond_0

    .line 30
    .line 31
    const-string v2, "image/jpeg"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v2, 0xe

    .line 35
    .line 36
    if-ne v1, v2, :cond_1

    .line 37
    .line 38
    const-string v2, "image/png"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v2, v4

    .line 42
    :goto_0
    if-nez v2, :cond_2

    .line 43
    .line 44
    const-string p0, "Unrecognized cover art flags: "

    .line 45
    .line 46
    invoke-static {v1, p0, v3}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    const/4 v1, 0x4

    .line 51
    invoke-virtual {p0, v1}, LQ1/o;->H(I)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, -0x10

    .line 55
    .line 56
    new-array v1, v0, [B

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {p0, v3, v0, v1}, LQ1/o;->f(II[B)V

    .line 60
    .line 61
    .line 62
    new-instance p0, LG2/a;

    .line 63
    .line 64
    const/4 v0, 0x3

    .line 65
    invoke-direct {p0, v2, v4, v0, v1}, LG2/a;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_3
    const-string p0, "Failed to parse cover art attribute"

    .line 70
    .line 71
    invoke-static {v3, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v4
.end method

.method public static f(ILQ1/o;Ljava/lang/String;)LG2/o;
    .locals 4

    .line 1
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, LQ1/o;->A()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    const-string p0, ""

    .line 31
    .line 32
    invoke-static {v0, p0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1}, LQ1/o;->A()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, "/"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_0
    new-instance p1, LG2/o;

    .line 63
    .line 64
    invoke-static {p0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {p1, p2, v3, p0}, LG2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll8/e0;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string p2, "Failed to parse index/count attribute: "

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, LH5/a;->f(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string p1, "MetadataUtil"

    .line 91
    .line 92
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v3
.end method

.method public static g(LQ1/o;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LQ1/o;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v1}, LQ1/o;->H(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, LQ1/o;->e()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, LQ1/o;->y()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    invoke-virtual {p0}, LQ1/o;->x()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    invoke-virtual {p0}, LQ1/o;->A()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    invoke-virtual {p0}, LQ1/o;->u()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_0
    const-string p0, "MetadataUtil"

    .line 63
    .line 64
    const-string v0, "Failed to parse data atom to int"

    .line 65
    .line 66
    invoke-static {p0, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, -0x1

    .line 70
    return p0
.end method

.method public static h(ILjava/lang/String;LQ1/o;ZZ)LG2/j;
    .locals 0

    .line 1
    invoke-static {p2}, LM2/r;->g(LQ1/o;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :cond_0
    const/4 p4, 0x0

    .line 13
    if-ltz p2, :cond_2

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    new-instance p0, LG2/o;

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, p4, p2}, LG2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll8/e0;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance p0, LG2/e;

    .line 32
    .line 33
    const-string p3, "und"

    .line 34
    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p0, p3, p1, p2}, LG2/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string p2, "Failed to parse uint8 attribute: "

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, LH5/a;->f(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "MetadataUtil"

    .line 62
    .line 63
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p4
.end method

.method public static i([B)LY9/c;
    .locals 13

    .line 1
    new-instance v0, LQ1/o;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LQ1/o;-><init>([B)V

    .line 4
    .line 5
    .line 6
    iget p0, v0, LQ1/o;->c:I

    .line 7
    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge p0, v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p0}, LQ1/o;->G(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LQ1/o;->a()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const-string v4, "PsshAtomUtil"

    .line 27
    .line 28
    if-eq v3, v1, :cond_1

    .line 29
    .line 30
    new-instance p0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v0, "Advertised atom size ("

    .line 33
    .line 34
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ") does not match buffer size: "

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v4, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_1
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const v3, 0x70737368    # 3.013775E29f

    .line 61
    .line 62
    .line 63
    if-eq v1, v3, :cond_2

    .line 64
    .line 65
    const-string p0, "Atom type is not pssh: "

    .line 66
    .line 67
    invoke-static {v1, p0, v4}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v2

    .line 71
    :cond_2
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {v1}, LM2/g;->c(I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/4 v3, 0x1

    .line 80
    if-le v1, v3, :cond_3

    .line 81
    .line 82
    const-string p0, "Unsupported pssh version: "

    .line 83
    .line 84
    invoke-static {v1, p0, v4}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_3
    new-instance v5, Ljava/util/UUID;

    .line 89
    .line 90
    invoke-virtual {v0}, LQ1/o;->o()J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    invoke-virtual {v0}, LQ1/o;->o()J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    invoke-direct {v5, v6, v7, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    .line 99
    .line 100
    .line 101
    if-ne v1, v3, :cond_4

    .line 102
    .line 103
    invoke-virtual {v0}, LQ1/o;->y()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    new-array v6, v3, [Ljava/util/UUID;

    .line 108
    .line 109
    move v7, p0

    .line 110
    :goto_0
    if-ge v7, v3, :cond_4

    .line 111
    .line 112
    new-instance v8, Ljava/util/UUID;

    .line 113
    .line 114
    invoke-virtual {v0}, LQ1/o;->o()J

    .line 115
    .line 116
    .line 117
    move-result-wide v9

    .line 118
    invoke-virtual {v0}, LQ1/o;->o()J

    .line 119
    .line 120
    .line 121
    move-result-wide v11

    .line 122
    invoke-direct {v8, v9, v10, v11, v12}, Ljava/util/UUID;-><init>(JJ)V

    .line 123
    .line 124
    .line 125
    aput-object v8, v6, v7

    .line 126
    .line 127
    add-int/lit8 v7, v7, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    invoke-virtual {v0}, LQ1/o;->y()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {v0}, LQ1/o;->a()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    if-eq v3, v6, :cond_5

    .line 139
    .line 140
    new-instance p0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v0, "Atom data size ("

    .line 143
    .line 144
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v0, ") does not match the bytes left: "

    .line 151
    .line 152
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {v4, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    :cond_5
    new-array v2, v3, [B

    .line 167
    .line 168
    invoke-virtual {v0, p0, v3, v2}, LQ1/o;->f(II[B)V

    .line 169
    .line 170
    .line 171
    new-instance p0, LY9/c;

    .line 172
    .line 173
    invoke-direct {p0, v5, v1, v2}, LY9/c;-><init>(Ljava/util/UUID;I[B)V

    .line 174
    .line 175
    .line 176
    return-object p0
.end method

.method public static j(ILQ1/o;Ljava/lang/String;)LG2/o;
    .locals 4

    .line 1
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, LQ1/o;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    invoke-virtual {p1, p0}, LQ1/o;->H(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x10

    .line 21
    .line 22
    invoke-virtual {p1, v0}, LQ1/o;->q(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, LG2/o;

    .line 27
    .line 28
    invoke-static {p0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p2, v3, p0}, LG2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll8/e0;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p2, "Failed to parse text attribute: "

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, LH5/a;->f(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string p1, "MetadataUtil"

    .line 55
    .line 56
    invoke-static {p1, p0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v3
.end method

.method public static k(Ls2/n;ZZ)Ls2/A;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-interface {v0}, Ls2/n;->i()J

    .line 7
    .line 8
    .line 9
    move-result-wide v3

    .line 10
    const-wide/16 v5, -0x1

    .line 11
    .line 12
    cmp-long v7, v3, v5

    .line 13
    .line 14
    const-wide/16 v8, 0x1000

    .line 15
    .line 16
    if-eqz v7, :cond_1

    .line 17
    .line 18
    cmp-long v10, v3, v8

    .line 19
    .line 20
    if-lez v10, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide v8, v3

    .line 24
    :cond_1
    :goto_0
    long-to-int v8, v8

    .line 25
    new-instance v9, LQ1/o;

    .line 26
    .line 27
    const/16 v10, 0x40

    .line 28
    .line 29
    invoke-direct {v9, v10}, LQ1/o;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v10, 0x0

    .line 33
    move v11, v10

    .line 34
    move v12, v11

    .line 35
    :goto_1
    if-ge v11, v8, :cond_2

    .line 36
    .line 37
    const/16 v14, 0x8

    .line 38
    .line 39
    invoke-virtual {v9, v14}, LQ1/o;->D(I)V

    .line 40
    .line 41
    .line 42
    iget-object v15, v9, LQ1/o;->a:[B

    .line 43
    .line 44
    invoke-interface {v0, v15, v10, v14, v2}, Ls2/n;->c([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    if-nez v15, :cond_3

    .line 49
    .line 50
    :cond_2
    move v4, v10

    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_3
    invoke-virtual {v9}, LQ1/o;->w()J

    .line 56
    .line 57
    .line 58
    move-result-wide v15

    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const-wide/16 v18, 0x1

    .line 66
    .line 67
    cmp-long v18, v15, v18

    .line 68
    .line 69
    if-nez v18, :cond_4

    .line 70
    .line 71
    iget-object v15, v9, LQ1/o;->a:[B

    .line 72
    .line 73
    invoke-interface {v0, v14, v14, v15}, Ls2/n;->a(II[B)V

    .line 74
    .line 75
    .line 76
    const/16 v15, 0x10

    .line 77
    .line 78
    invoke-virtual {v9, v15}, LQ1/o;->F(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, LQ1/o;->o()J

    .line 82
    .line 83
    .line 84
    move-result-wide v18

    .line 85
    move-wide/from16 v5, v18

    .line 86
    .line 87
    move/from16 v18, v11

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    const-wide/16 v18, 0x0

    .line 91
    .line 92
    cmp-long v18, v15, v18

    .line 93
    .line 94
    if-nez v18, :cond_5

    .line 95
    .line 96
    invoke-interface {v0}, Ls2/n;->i()J

    .line 97
    .line 98
    .line 99
    move-result-wide v18

    .line 100
    cmp-long v20, v18, v5

    .line 101
    .line 102
    if-eqz v20, :cond_5

    .line 103
    .line 104
    invoke-interface {v0}, Ls2/n;->g()J

    .line 105
    .line 106
    .line 107
    move-result-wide v15

    .line 108
    sub-long v18, v18, v15

    .line 109
    .line 110
    int-to-long v5, v14

    .line 111
    add-long v15, v18, v5

    .line 112
    .line 113
    :cond_5
    move/from16 v18, v11

    .line 114
    .line 115
    move-wide v5, v15

    .line 116
    move v15, v14

    .line 117
    :goto_2
    int-to-long v10, v15

    .line 118
    cmp-long v19, v5, v10

    .line 119
    .line 120
    if-gez v19, :cond_6

    .line 121
    .line 122
    new-instance v0, LM2/m;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_6
    add-int v15, v18, v15

    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const v13, 0x6d6f6f76

    .line 133
    .line 134
    .line 135
    if-ne v2, v13, :cond_8

    .line 136
    .line 137
    long-to-int v2, v5

    .line 138
    add-int/2addr v8, v2

    .line 139
    if-eqz v7, :cond_7

    .line 140
    .line 141
    int-to-long v5, v8

    .line 142
    cmp-long v2, v5, v3

    .line 143
    .line 144
    if-lez v2, :cond_7

    .line 145
    .line 146
    long-to-int v8, v3

    .line 147
    :cond_7
    move v11, v15

    .line 148
    move/from16 v2, v17

    .line 149
    .line 150
    const-wide/16 v5, -0x1

    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    goto :goto_1

    .line 154
    :cond_8
    const v13, 0x6d6f6f66

    .line 155
    .line 156
    .line 157
    if-eq v2, v13, :cond_15

    .line 158
    .line 159
    const v13, 0x6d766578

    .line 160
    .line 161
    .line 162
    if-ne v2, v13, :cond_9

    .line 163
    .line 164
    goto/16 :goto_5

    .line 165
    .line 166
    :cond_9
    const v13, 0x6d646174

    .line 167
    .line 168
    .line 169
    if-ne v2, v13, :cond_a

    .line 170
    .line 171
    move/from16 v12, v17

    .line 172
    .line 173
    :cond_a
    move-wide/from16 v21, v3

    .line 174
    .line 175
    int-to-long v3, v15

    .line 176
    add-long/2addr v3, v5

    .line 177
    sub-long/2addr v3, v10

    .line 178
    move v13, v15

    .line 179
    int-to-long v14, v8

    .line 180
    cmp-long v3, v3, v14

    .line 181
    .line 182
    if-ltz v3, :cond_b

    .line 183
    .line 184
    const/4 v2, 0x0

    .line 185
    goto/16 :goto_7

    .line 186
    .line 187
    :cond_b
    sub-long/2addr v5, v10

    .line 188
    long-to-int v3, v5

    .line 189
    add-int v11, v13, v3

    .line 190
    .line 191
    const v4, 0x66747970

    .line 192
    .line 193
    .line 194
    if-ne v2, v4, :cond_13

    .line 195
    .line 196
    const/16 v2, 0x8

    .line 197
    .line 198
    if-ge v3, v2, :cond_c

    .line 199
    .line 200
    new-instance v0, LM2/m;

    .line 201
    .line 202
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :cond_c
    invoke-virtual {v9, v3}, LQ1/o;->D(I)V

    .line 207
    .line 208
    .line 209
    iget-object v2, v9, LQ1/o;->a:[B

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-interface {v0, v4, v3, v2}, Ls2/n;->a(II[B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    invoke-static {v2, v1}, LM2/r;->c(IZ)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_d

    .line 224
    .line 225
    move/from16 v12, v17

    .line 226
    .line 227
    :cond_d
    const/4 v2, 0x4

    .line 228
    invoke-virtual {v9, v2}, LQ1/o;->H(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9}, LQ1/o;->a()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    div-int/2addr v3, v2

    .line 236
    if-nez v12, :cond_f

    .line 237
    .line 238
    if-lez v3, :cond_f

    .line 239
    .line 240
    new-array v13, v3, [I

    .line 241
    .line 242
    move v2, v4

    .line 243
    :goto_3
    if-ge v2, v3, :cond_10

    .line 244
    .line 245
    invoke-virtual {v9}, LQ1/o;->h()I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    aput v5, v13, v2

    .line 250
    .line 251
    invoke-static {v5, v1}, LM2/r;->c(IZ)Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_e

    .line 256
    .line 257
    move/from16 v12, v17

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_e
    add-int/lit8 v2, v2, 0x1

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_f
    move-object/from16 v13, v18

    .line 264
    .line 265
    :cond_10
    :goto_4
    if-nez v12, :cond_14

    .line 266
    .line 267
    new-instance v0, LM2/m;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 270
    .line 271
    .line 272
    if-eqz v13, :cond_12

    .line 273
    .line 274
    sget v1, Lo8/a;->c:I

    .line 275
    .line 276
    array-length v1, v13

    .line 277
    if-nez v1, :cond_11

    .line 278
    .line 279
    return-object v0

    .line 280
    :cond_11
    new-instance v1, Lo8/a;

    .line 281
    .line 282
    array-length v2, v13

    .line 283
    invoke-static {v13, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-direct {v1, v2}, Lo8/a;-><init>([I)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_12
    sget v1, Lo8/a;->c:I

    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_13
    const/4 v4, 0x0

    .line 295
    if-eqz v3, :cond_14

    .line 296
    .line 297
    invoke-interface {v0, v3}, Ls2/n;->h(I)V

    .line 298
    .line 299
    .line 300
    :cond_14
    move v10, v4

    .line 301
    move/from16 v2, v17

    .line 302
    .line 303
    move-wide/from16 v3, v21

    .line 304
    .line 305
    const-wide/16 v5, -0x1

    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_15
    :goto_5
    move/from16 v2, v17

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :goto_6
    move v2, v4

    .line 313
    :goto_7
    if-nez v12, :cond_16

    .line 314
    .line 315
    sget-object v0, LM2/m;->c:LM2/m;

    .line 316
    .line 317
    return-object v0

    .line 318
    :cond_16
    move/from16 v0, p1

    .line 319
    .line 320
    if-eq v0, v2, :cond_18

    .line 321
    .line 322
    if-eqz v2, :cond_17

    .line 323
    .line 324
    sget-object v0, LM2/m;->a:LM2/m;

    .line 325
    .line 326
    return-object v0

    .line 327
    :cond_17
    sget-object v0, LM2/m;->b:LM2/m;

    .line 328
    .line 329
    return-object v0

    .line 330
    :cond_18
    return-object v18
.end method
