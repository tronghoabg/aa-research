.class public final LM2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/e;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LM2/d;->a:I

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-array p1, p1, [LM2/t;

    iput-object p1, p0, LM2/d;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 74
    iput p1, p0, LM2/d;->c:I

    return-void
.end method

.method public constructor <init>(II[F[F)V
    .locals 6

    const/4 v0, 0x5

    iput v0, p0, LM2/d;->a:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p1, p0, LM2/d;->b:I

    .line 46
    array-length p1, p3

    int-to-long v0, p1

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    array-length p1, p4

    int-to-long v2, p1

    const-wide/16 v4, 0x3

    mul-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lu6/a;->e(Z)V

    .line 47
    iput-object p3, p0, LM2/d;->d:Ljava/lang/Object;

    .line 48
    iput-object p4, p0, LM2/d;->e:Ljava/lang/Object;

    .line 49
    iput p2, p0, LM2/d;->c:I

    return-void
.end method

.method public constructor <init>(ILu6/t;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM2/d;->a:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p1, p0, LM2/d;->b:I

    .line 41
    iput-object p2, p0, LM2/d;->d:Ljava/lang/Object;

    .line 42
    iput p3, p0, LM2/d;->c:I

    .line 43
    new-instance p1, LY4/b;

    invoke-direct {p1}, LY4/b;-><init>()V

    iput-object p1, p0, LM2/d;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LM2/d;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, LM2/d;->a:I

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iget-object v0, p1, LM2/d;->d:Ljava/lang/Object;

    check-cast v0, [F

    .line 52
    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    .line 53
    iput v1, p0, LM2/d;->b:I

    .line 54
    invoke-static {v0}, Lu6/a;->m([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, LM2/d;->d:Ljava/lang/Object;

    .line 55
    iget-object v0, p1, LM2/d;->e:Ljava/lang/Object;

    check-cast v0, [F

    invoke-static {v0}, Lu6/a;->m([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, LM2/d;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 56
    iget p1, p1, LM2/d;->c:I

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x4

    .line 57
    iput p1, p0, LM2/d;->c:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x6

    .line 58
    iput p1, p0, LM2/d;->c:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x5

    .line 59
    iput p1, p0, LM2/d;->c:I

    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/ByteString;II)V
    .locals 3

    const/4 v0, 0x4

    iput v0, p0, LM2/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_5

    const/16 v0, 0x8

    if-ge p2, v0, :cond_5

    .line 2
    const-string v1, "Invalid hash count: "

    if-ltz p3, :cond_4

    .line 3
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    move-result v2

    if-lez v2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 5
    invoke-static {p3, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-nez v1, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Expected padding of 0 when bitmap length is 0, but got "

    .line 9
    invoke-static {p2, p3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_3
    :goto_1
    iput-object p1, p0, LM2/d;->d:Ljava/lang/Object;

    .line 12
    iput p3, p0, LM2/d;->c:I

    .line 13
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->size()I

    move-result p1

    mul-int/2addr p1, v0

    sub-int/2addr p1, p2

    iput p1, p0, LM2/d;->b:I

    .line 14
    :try_start_0
    const-string p1, "MD5"

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iput-object p1, p0, LM2/d;->e:Ljava/lang/Object;

    return-void

    :catch_0
    move-exception p1

    .line 16
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Missing MD5 MessageDigest provider: "

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 17
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    invoke-static {p3, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Invalid padding: "

    .line 21
    invoke-static {p2, p3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lf8/m;Lmd/J;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LM2/d;->a:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, LM2/d;->d:Ljava/lang/Object;

    .line 67
    iput-object p1, p0, LM2/d;->e:Ljava/lang/Object;

    .line 68
    iget-object p1, p2, Lmd/J;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1a

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 69
    iput p2, p0, LM2/d;->b:I

    const/16 p2, 0x32

    .line 70
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 71
    iput p1, p0, LM2/d;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LM2/d;->a:I

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput p3, p0, LM2/d;->b:I

    .line 62
    iput-object p1, p0, LM2/d;->d:Ljava/lang/Object;

    .line 63
    iput p4, p0, LM2/d;->c:I

    .line 64
    iput-object p2, p0, LM2/d;->e:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lcom/google/protobuf/ByteString;II)LM2/d;
    .locals 2

    .line 1
    if-ltz p1, :cond_5

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    if-ge p1, v0, :cond_5

    .line 6
    .line 7
    const-string v0, "Invalid hash count: "

    .line 8
    .line 9
    if-ltz p2, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_1

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p0, Lv9/e;

    .line 21
    .line 22
    invoke-static {p2, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    new-instance p0, Lv9/e;

    .line 40
    .line 41
    const-string p2, "Expected padding of 0 when bitmap length is 0, but got "

    .line 42
    .line 43
    invoke-static {p1, p2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_3
    :goto_1
    new-instance v0, LM2/d;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1, p2}, LM2/d;-><init>(Lcom/google/protobuf/ByteString;II)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_4
    new-instance p0, Lv9/e;

    .line 58
    .line 59
    invoke-static {p2, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_5
    new-instance p0, Lv9/e;

    .line 68
    .line 69
    const-string p2, "Invalid padding: "

    .line 70
    .line 71
    invoke-static {p1, p2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p0
.end method

.method public static b(I[B)J
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    const/16 v3, 0x8

    .line 5
    .line 6
    if-ge v2, v3, :cond_0

    .line 7
    .line 8
    add-int v3, p0, v2

    .line 9
    .line 10
    aget-byte v3, p1, v3

    .line 11
    .line 12
    int-to-long v3, v3

    .line 13
    const-wide/16 v5, 0xff

    .line 14
    .line 15
    and-long/2addr v3, v5

    .line 16
    mul-int/lit8 v5, v2, 0x8

    .line 17
    .line 18
    shl-long/2addr v3, v5

    .line 19
    or-long/2addr v0, v3

    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-wide v0
.end method


# virtual methods
.method public s()V
    .locals 3

    .line 1
    sget-object v0, Lu6/v;->f:[B

    .line 2
    .line 3
    iget-object v1, p0, LM2/d;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LY4/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v2, v0

    .line 11
    invoke-virtual {v1, v2, v0}, LY4/b;->y(I[B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public t(LJ5/h;J)LJ5/d;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v5, v1, LJ5/h;->d:J

    .line 6
    .line 7
    iget v2, v0, LM2/d;->c:I

    .line 8
    .line 9
    int-to-long v2, v2

    .line 10
    iget-wide v7, v1, LJ5/h;->c:J

    .line 11
    .line 12
    sub-long/2addr v7, v5

    .line 13
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    long-to-int v2, v2

    .line 18
    iget-object v3, v0, LM2/d;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, LY4/b;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, LY4/b;->x(I)V

    .line 23
    .line 24
    .line 25
    iget-object v4, v3, LY4/b;->a:[B

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-virtual {v1, v4, v7, v2, v7}, LJ5/h;->c([BIIZ)Z

    .line 29
    .line 30
    .line 31
    iget v1, v3, LY4/b;->c:I

    .line 32
    .line 33
    const-wide/16 v7, -0x1

    .line 34
    .line 35
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    move-wide v11, v7

    .line 41
    move-wide v15, v9

    .line 42
    :goto_0
    invoke-virtual {v3}, LY4/b;->a()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v4, 0xbc

    .line 47
    .line 48
    if-lt v2, v4, :cond_6

    .line 49
    .line 50
    iget-object v2, v3, LY4/b;->a:[B

    .line 51
    .line 52
    iget v4, v3, LY4/b;->b:I

    .line 53
    .line 54
    :goto_1
    if-ge v4, v1, :cond_0

    .line 55
    .line 56
    aget-byte v13, v2, v4

    .line 57
    .line 58
    const/16 v14, 0x47

    .line 59
    .line 60
    if-eq v13, v14, :cond_0

    .line 61
    .line 62
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    add-int/lit16 v2, v4, 0xbc

    .line 66
    .line 67
    if-le v2, v1, :cond_1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget v7, v0, LM2/d;->b:I

    .line 71
    .line 72
    invoke-static {v3, v4, v7}, Lic/d;->K(LY4/b;II)J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    cmp-long v13, v7, v9

    .line 77
    .line 78
    if-eqz v13, :cond_5

    .line 79
    .line 80
    iget-object v13, v0, LM2/d;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v13, Lu6/t;

    .line 83
    .line 84
    invoke-virtual {v13, v7, v8}, Lu6/t;->b(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    cmp-long v13, v7, p2

    .line 89
    .line 90
    if-lez v13, :cond_3

    .line 91
    .line 92
    cmp-long v1, v15, v9

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    new-instance v1, LJ5/d;

    .line 97
    .line 98
    const/4 v2, -0x1

    .line 99
    move-wide v3, v7

    .line 100
    invoke-direct/range {v1 .. v6}, LJ5/d;-><init>(IJJ)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_2
    add-long v17, v5, v11

    .line 105
    .line 106
    new-instance v13, LJ5/d;

    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-direct/range {v13 .. v18}, LJ5/d;-><init>(IJJ)V

    .line 115
    .line 116
    .line 117
    return-object v13

    .line 118
    :cond_3
    move-wide v15, v7

    .line 119
    const-wide/32 v7, 0x186a0

    .line 120
    .line 121
    .line 122
    add-long/2addr v7, v15

    .line 123
    cmp-long v7, v7, p2

    .line 124
    .line 125
    if-lez v7, :cond_4

    .line 126
    .line 127
    int-to-long v1, v4

    .line 128
    add-long v11, v5, v1

    .line 129
    .line 130
    new-instance v7, LJ5/d;

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-direct/range {v7 .. v12}, LJ5/d;-><init>(IJJ)V

    .line 139
    .line 140
    .line 141
    return-object v7

    .line 142
    :cond_4
    int-to-long v7, v4

    .line 143
    move-wide v11, v7

    .line 144
    :cond_5
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 145
    .line 146
    .line 147
    int-to-long v7, v2

    .line 148
    goto :goto_0

    .line 149
    :cond_6
    :goto_2
    cmp-long v1, v15, v9

    .line 150
    .line 151
    if-eqz v1, :cond_7

    .line 152
    .line 153
    add-long v17, v5, v7

    .line 154
    .line 155
    new-instance v13, LJ5/d;

    .line 156
    .line 157
    const/4 v14, -0x2

    .line 158
    invoke-direct/range {v13 .. v18}, LJ5/d;-><init>(IJJ)V

    .line 159
    .line 160
    .line 161
    return-object v13

    .line 162
    :cond_7
    sget-object v1, LJ5/d;->d:LJ5/d;

    .line 163
    .line 164
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LM2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "BloomFilter{hashCount="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, LM2/d;->c:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", size="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, LM2/d;->b:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", bitmap=\""

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LM2/d;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcom/google/protobuf/ByteString;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x2

    .line 47
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "\"}"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
