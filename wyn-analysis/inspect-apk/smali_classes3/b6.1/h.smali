.class public final Lb6/h;
.super Lic/d;
.source "SourceFile"


# static fields
.field public static final c:LV1/c;


# instance fields
.field public final b:Lb6/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LV1/c;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, LV1/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lb6/h;->c:LV1/c;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lb6/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb6/h;->b:Lb6/g;

    .line 5
    .line 6
    return-void
.end method

.method public static P(LY4/b;II)Lb6/a;
    .locals 7

    .line 1
    invoke-virtual {p0}, LY4/b;->q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    add-int/lit8 p1, p1, -0x1

    .line 10
    .line 11
    new-array v2, p1, [B

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p0, v3, p1, v2}, LY4/b;->c(II[B)V

    .line 15
    .line 16
    .line 17
    const-string p0, "ISO-8859-1"

    .line 18
    .line 19
    const-string v4, "image/"

    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    if-ne p2, v5, :cond_1

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Ljava/lang/String;

    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    invoke-direct {v4, v2, v3, v6, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p2, "image/jpg"

    .line 47
    .line 48
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_0

    .line 53
    .line 54
    const-string p0, "image/jpeg"

    .line 55
    .line 56
    :cond_0
    move p2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {v3, v2}, Lb6/h;->g0(I[B)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    new-instance v6, Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v6, v2, v3, p2, p0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v6}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const/16 v3, 0x2f

    .line 72
    .line 73
    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v6, -0x1

    .line 78
    if-ne v3, v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :cond_2
    :goto_0
    add-int/lit8 v3, p2, 0x1

    .line 85
    .line 86
    aget-byte v3, v2, v3

    .line 87
    .line 88
    and-int/lit16 v3, v3, 0xff

    .line 89
    .line 90
    add-int/2addr p2, v5

    .line 91
    invoke-static {p2, v0, v2}, Lb6/h;->f0(II[B)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    new-instance v5, Ljava/lang/String;

    .line 96
    .line 97
    sub-int v6, v4, p2

    .line 98
    .line 99
    invoke-direct {v5, v2, p2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lb6/h;->c0(I)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    add-int/2addr p2, v4

    .line 107
    if-gt p1, p2, :cond_3

    .line 108
    .line 109
    sget-object p1, Lu6/v;->f:[B

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-static {v2, p2, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :goto_1
    new-instance p2, Lb6/a;

    .line 117
    .line 118
    invoke-direct {p2, p0, v5, v3, p1}, Lb6/a;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 119
    .line 120
    .line 121
    return-object p2
.end method

.method public static Q(LY4/b;IIZILb6/g;)Lb6/c;
    .locals 14

    .line 1
    iget v0, p0, LY4/b;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LY4/b;->a:[B

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb6/h;->g0(I[B)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v3, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, LY4/b;->a:[B

    .line 12
    .line 13
    sub-int v4, v1, v0

    .line 14
    .line 15
    const-string v5, "ISO-8859-1"

    .line 16
    .line 17
    invoke-direct {v3, v2, v0, v4, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    invoke-virtual {p0, v1}, LY4/b;->A(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, LY4/b;->d()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {p0}, LY4/b;->d()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {p0}, LY4/b;->r()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    const-wide v6, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmp-long v8, v1, v6

    .line 43
    .line 44
    const-wide/16 v9, -0x1

    .line 45
    .line 46
    if-nez v8, :cond_0

    .line 47
    .line 48
    move-wide v1, v9

    .line 49
    :cond_0
    invoke-virtual {p0}, LY4/b;->r()J

    .line 50
    .line 51
    .line 52
    move-result-wide v11

    .line 53
    cmp-long v6, v11, v6

    .line 54
    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    move-wide v8, v9

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-wide v8, v11

    .line 60
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    add-int/2addr v0, p1

    .line 66
    :cond_2
    :goto_1
    iget v7, p0, LY4/b;->b:I

    .line 67
    .line 68
    if-ge v7, v0, :cond_3

    .line 69
    .line 70
    move/from16 v7, p2

    .line 71
    .line 72
    move/from16 v10, p3

    .line 73
    .line 74
    move/from16 v11, p4

    .line 75
    .line 76
    move-object/from16 v12, p5

    .line 77
    .line 78
    invoke-static {v7, p0, v10, v11, v12}, Lb6/h;->T(ILY4/b;ZILb6/g;)Lb6/i;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    if-eqz v13, :cond_2

    .line 83
    .line 84
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 p0, 0x0

    .line 89
    new-array p0, p0, [Lb6/i;

    .line 90
    .line 91
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    move-object v10, p0

    .line 96
    check-cast v10, [Lb6/i;

    .line 97
    .line 98
    move-wide v6, v1

    .line 99
    new-instance v2, Lb6/c;

    .line 100
    .line 101
    invoke-direct/range {v2 .. v10}, Lb6/c;-><init>(Ljava/lang/String;IIJJ[Lb6/i;)V

    .line 102
    .line 103
    .line 104
    return-object v2
.end method

.method public static R(LY4/b;IIZILb6/g;)Lb6/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LY4/b;->b:I

    .line 4
    .line 5
    iget-object v2, v0, LY4/b;->a:[B

    .line 6
    .line 7
    invoke-static {v1, v2}, Lb6/h;->g0(I[B)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    new-instance v3, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, v0, LY4/b;->a:[B

    .line 14
    .line 15
    sub-int v5, v2, v1

    .line 16
    .line 17
    const-string v6, "ISO-8859-1"

    .line 18
    .line 19
    invoke-direct {v3, v4, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    add-int/2addr v2, v4

    .line 24
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, LY4/b;->q()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    and-int/lit8 v5, v2, 0x2

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    move v5, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v5, v7

    .line 39
    :goto_0
    and-int/2addr v2, v4

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    move v2, v4

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v2, v7

    .line 45
    :goto_1
    invoke-virtual {v0}, LY4/b;->q()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    new-array v9, v8, [Ljava/lang/String;

    .line 50
    .line 51
    move v10, v7

    .line 52
    :goto_2
    if-ge v10, v8, :cond_2

    .line 53
    .line 54
    iget v11, v0, LY4/b;->b:I

    .line 55
    .line 56
    iget-object v12, v0, LY4/b;->a:[B

    .line 57
    .line 58
    invoke-static {v11, v12}, Lb6/h;->g0(I[B)I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    new-instance v13, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v14, v0, LY4/b;->a:[B

    .line 65
    .line 66
    sub-int v15, v12, v11

    .line 67
    .line 68
    invoke-direct {v13, v14, v11, v15, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    aput-object v13, v9, v10

    .line 72
    .line 73
    add-int/2addr v12, v4

    .line 74
    invoke-virtual {v0, v12}, LY4/b;->A(I)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v10, v10, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    add-int v1, v1, p1

    .line 86
    .line 87
    :cond_3
    :goto_3
    iget v6, v0, LY4/b;->b:I

    .line 88
    .line 89
    if-ge v6, v1, :cond_4

    .line 90
    .line 91
    move/from16 v6, p2

    .line 92
    .line 93
    move/from16 v8, p3

    .line 94
    .line 95
    move/from16 v10, p4

    .line 96
    .line 97
    move-object/from16 v11, p5

    .line 98
    .line 99
    invoke-static {v6, v0, v8, v10, v11}, Lb6/h;->T(ILY4/b;ZILb6/g;)Lb6/i;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    if-eqz v12, :cond_3

    .line 104
    .line 105
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    new-array v0, v7, [Lb6/i;

    .line 110
    .line 111
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, [Lb6/i;

    .line 116
    .line 117
    new-instance v1, Lb6/d;

    .line 118
    .line 119
    move-object/from16 p5, v0

    .line 120
    .line 121
    move-object/from16 p0, v1

    .line 122
    .line 123
    move/from16 p3, v2

    .line 124
    .line 125
    move-object/from16 p1, v3

    .line 126
    .line 127
    move/from16 p2, v5

    .line 128
    .line 129
    move-object/from16 p4, v9

    .line 130
    .line 131
    invoke-direct/range {p0 .. p5}, Lb6/d;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lb6/i;)V

    .line 132
    .line 133
    .line 134
    move-object/from16 v0, p0

    .line 135
    .line 136
    return-object v0
.end method

.method public static S(ILY4/b;)Lb6/e;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ge p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, LY4/b;->q()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x3

    .line 15
    new-array v4, v3, [B

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-virtual {p1, v5, v3, v4}, LY4/b;->c(II[B)V

    .line 19
    .line 20
    .line 21
    new-instance v6, Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v6, v4, v5, v3}, Ljava/lang/String;-><init>([BII)V

    .line 24
    .line 25
    .line 26
    sub-int/2addr p0, v0

    .line 27
    new-array v0, p0, [B

    .line 28
    .line 29
    invoke-virtual {p1, v5, p0, v0}, LY4/b;->c(II[B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v5, v1, v0}, Lb6/h;->f0(II[B)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    new-instance p1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {p1, v0, v5, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lb6/h;->c0(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v3, p0

    .line 46
    invoke-static {v3, v1, v0}, Lb6/h;->f0(II[B)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {v3, p0, v2, v0}, Lb6/h;->X(IILjava/lang/String;[B)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance v0, Lb6/e;

    .line 55
    .line 56
    invoke-direct {v0, v6, p1, p0}, Lb6/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public static T(ILY4/b;ZILb6/g;)Lb6/i;
    .locals 20

    .line 1
    move/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const-string v7, "Failed to decode frame: id="

    .line 6
    .line 7
    invoke-virtual {v6}, LY4/b;->q()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v6}, LY4/b;->q()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {v6}, LY4/b;->q()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v9, 0x3

    .line 20
    if-lt v3, v9, :cond_0

    .line 21
    .line 22
    invoke-virtual {v6}, LY4/b;->q()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    move v5, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x0

    .line 29
    :goto_0
    const/4 v10, 0x4

    .line 30
    if-ne v3, v10, :cond_2

    .line 31
    .line 32
    invoke-virtual {v6}, LY4/b;->t()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    and-int/lit16 v11, v1, 0xff

    .line 39
    .line 40
    shr-int/lit8 v12, v1, 0x8

    .line 41
    .line 42
    and-int/lit16 v12, v12, 0xff

    .line 43
    .line 44
    shl-int/lit8 v12, v12, 0x7

    .line 45
    .line 46
    or-int/2addr v11, v12

    .line 47
    shr-int/lit8 v12, v1, 0x10

    .line 48
    .line 49
    and-int/lit16 v12, v12, 0xff

    .line 50
    .line 51
    shl-int/lit8 v12, v12, 0xe

    .line 52
    .line 53
    or-int/2addr v11, v12

    .line 54
    shr-int/lit8 v1, v1, 0x18

    .line 55
    .line 56
    and-int/lit16 v1, v1, 0xff

    .line 57
    .line 58
    shl-int/lit8 v1, v1, 0x15

    .line 59
    .line 60
    or-int/2addr v1, v11

    .line 61
    :cond_1
    :goto_1
    move v11, v1

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    if-ne v3, v9, :cond_3

    .line 64
    .line 65
    invoke-virtual {v6}, LY4/b;->t()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {v6}, LY4/b;->s()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    goto :goto_1

    .line 75
    :goto_2
    if-lt v3, v9, :cond_4

    .line 76
    .line 77
    invoke-virtual {v6}, LY4/b;->v()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    move v12, v1

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    const/4 v12, 0x0

    .line 84
    :goto_3
    const/4 v13, 0x0

    .line 85
    if-nez v2, :cond_5

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    if-nez v4, :cond_5

    .line 90
    .line 91
    if-nez v5, :cond_5

    .line 92
    .line 93
    if-nez v11, :cond_5

    .line 94
    .line 95
    if-nez v12, :cond_5

    .line 96
    .line 97
    iget v0, v6, LY4/b;->c:I

    .line 98
    .line 99
    invoke-virtual {v6, v0}, LY4/b;->A(I)V

    .line 100
    .line 101
    .line 102
    return-object v13

    .line 103
    :cond_5
    iget v1, v6, LY4/b;->b:I

    .line 104
    .line 105
    add-int v14, v1, v11

    .line 106
    .line 107
    iget v1, v6, LY4/b;->c:I

    .line 108
    .line 109
    const-string v15, "Id3Decoder"

    .line 110
    .line 111
    if-le v14, v1, :cond_6

    .line 112
    .line 113
    const-string v0, "Frame size exceeds remaining tag data"

    .line 114
    .line 115
    invoke-static {v15, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget v0, v6, LY4/b;->c:I

    .line 119
    .line 120
    invoke-virtual {v6, v0}, LY4/b;->A(I)V

    .line 121
    .line 122
    .line 123
    return-object v13

    .line 124
    :cond_6
    if-eqz p4, :cond_7

    .line 125
    .line 126
    move v1, v3

    .line 127
    move v3, v0

    .line 128
    move-object/from16 v0, p4

    .line 129
    .line 130
    invoke-interface/range {v0 .. v5}, Lb6/g;->a(IIIII)Z

    .line 131
    .line 132
    .line 133
    move-result v16

    .line 134
    move v0, v3

    .line 135
    move v3, v1

    .line 136
    move v1, v0

    .line 137
    move v0, v2

    .line 138
    move v2, v4

    .line 139
    move v4, v5

    .line 140
    if-nez v16, :cond_8

    .line 141
    .line 142
    invoke-virtual {v6, v14}, LY4/b;->A(I)V

    .line 143
    .line 144
    .line 145
    return-object v13

    .line 146
    :cond_7
    move v1, v0

    .line 147
    move v0, v2

    .line 148
    move v2, v4

    .line 149
    move v4, v5

    .line 150
    :cond_8
    const/4 v5, 0x1

    .line 151
    if-ne v3, v9, :cond_c

    .line 152
    .line 153
    and-int/lit16 v9, v12, 0x80

    .line 154
    .line 155
    if-eqz v9, :cond_9

    .line 156
    .line 157
    move v9, v5

    .line 158
    goto :goto_4

    .line 159
    :cond_9
    const/4 v9, 0x0

    .line 160
    :goto_4
    and-int/lit8 v16, v12, 0x40

    .line 161
    .line 162
    if-eqz v16, :cond_a

    .line 163
    .line 164
    move/from16 v16, v5

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_a
    const/16 v16, 0x0

    .line 168
    .line 169
    :goto_5
    and-int/lit8 v12, v12, 0x20

    .line 170
    .line 171
    if-eqz v12, :cond_b

    .line 172
    .line 173
    move v12, v5

    .line 174
    goto :goto_6

    .line 175
    :cond_b
    const/4 v12, 0x0

    .line 176
    :goto_6
    move/from16 v17, v16

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    move/from16 v16, v12

    .line 181
    .line 182
    move v12, v9

    .line 183
    goto :goto_c

    .line 184
    :cond_c
    if-ne v3, v10, :cond_12

    .line 185
    .line 186
    and-int/lit8 v9, v12, 0x40

    .line 187
    .line 188
    if-eqz v9, :cond_d

    .line 189
    .line 190
    move v9, v5

    .line 191
    goto :goto_7

    .line 192
    :cond_d
    const/4 v9, 0x0

    .line 193
    :goto_7
    and-int/lit8 v16, v12, 0x8

    .line 194
    .line 195
    if-eqz v16, :cond_e

    .line 196
    .line 197
    move/from16 v16, v5

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_e
    const/16 v16, 0x0

    .line 201
    .line 202
    :goto_8
    and-int/lit8 v17, v12, 0x4

    .line 203
    .line 204
    if-eqz v17, :cond_f

    .line 205
    .line 206
    move/from16 v17, v5

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_f
    const/16 v17, 0x0

    .line 210
    .line 211
    :goto_9
    and-int/lit8 v18, v12, 0x2

    .line 212
    .line 213
    if-eqz v18, :cond_10

    .line 214
    .line 215
    move/from16 v18, v5

    .line 216
    .line 217
    goto :goto_a

    .line 218
    :cond_10
    const/16 v18, 0x0

    .line 219
    .line 220
    :goto_a
    and-int/2addr v12, v5

    .line 221
    if-eqz v12, :cond_11

    .line 222
    .line 223
    move v12, v5

    .line 224
    goto :goto_b

    .line 225
    :cond_11
    const/4 v12, 0x0

    .line 226
    :goto_b
    move/from16 v19, v16

    .line 227
    .line 228
    move/from16 v16, v9

    .line 229
    .line 230
    move/from16 v9, v19

    .line 231
    .line 232
    goto :goto_c

    .line 233
    :cond_12
    const/4 v9, 0x0

    .line 234
    const/4 v12, 0x0

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    :goto_c
    if-nez v9, :cond_13

    .line 242
    .line 243
    if-eqz v17, :cond_14

    .line 244
    .line 245
    :cond_13
    move-object v1, v6

    .line 246
    move-object/from16 v16, v13

    .line 247
    .line 248
    goto/16 :goto_14

    .line 249
    .line 250
    :cond_14
    if-eqz v16, :cond_15

    .line 251
    .line 252
    add-int/lit8 v11, v11, -0x1

    .line 253
    .line 254
    invoke-virtual {v6, v5}, LY4/b;->B(I)V

    .line 255
    .line 256
    .line 257
    :cond_15
    if-eqz v12, :cond_16

    .line 258
    .line 259
    add-int/lit8 v11, v11, -0x4

    .line 260
    .line 261
    invoke-virtual {v6, v10}, LY4/b;->B(I)V

    .line 262
    .line 263
    .line 264
    :cond_16
    if-eqz v18, :cond_17

    .line 265
    .line 266
    invoke-static {v11, v6}, Lb6/h;->h0(ILY4/b;)I

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    :cond_17
    const/4 v5, 0x2

    .line 271
    const/16 v9, 0x54

    .line 272
    .line 273
    const/16 v10, 0x58

    .line 274
    .line 275
    if-ne v0, v9, :cond_19

    .line 276
    .line 277
    if-ne v1, v10, :cond_19

    .line 278
    .line 279
    if-ne v2, v10, :cond_19

    .line 280
    .line 281
    if-eq v3, v5, :cond_18

    .line 282
    .line 283
    if-ne v4, v10, :cond_19

    .line 284
    .line 285
    :cond_18
    :try_start_0
    invoke-static {v11, v6}, Lb6/h;->Z(ILY4/b;)Lb6/m;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    :goto_d
    move v12, v2

    .line 290
    move v2, v11

    .line 291
    move-object/from16 v16, v13

    .line 292
    .line 293
    move v11, v1

    .line 294
    move v13, v4

    .line 295
    :goto_e
    move-object v1, v6

    .line 296
    goto/16 :goto_11

    .line 297
    .line 298
    :catchall_0
    move-exception v0

    .line 299
    move-object v1, v6

    .line 300
    goto/16 :goto_13

    .line 301
    .line 302
    :catch_0
    move-object v1, v6

    .line 303
    move-object/from16 v16, v13

    .line 304
    .line 305
    goto/16 :goto_12

    .line 306
    .line 307
    :cond_19
    if-ne v0, v9, :cond_1a

    .line 308
    .line 309
    invoke-static {v3, v0, v1, v2, v4}, Lb6/h;->e0(IIIII)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    invoke-static {v11, v6, v5}, Lb6/h;->Y(ILY4/b;Ljava/lang/String;)Lb6/m;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    goto :goto_d

    .line 318
    :cond_1a
    const/16 v12, 0x57

    .line 319
    .line 320
    if-ne v0, v12, :cond_1c

    .line 321
    .line 322
    if-ne v1, v10, :cond_1c

    .line 323
    .line 324
    if-ne v2, v10, :cond_1c

    .line 325
    .line 326
    if-eq v3, v5, :cond_1b

    .line 327
    .line 328
    if-ne v4, v10, :cond_1c

    .line 329
    .line 330
    :cond_1b
    invoke-static {v11, v6}, Lb6/h;->b0(ILY4/b;)Lb6/n;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    goto :goto_d

    .line 335
    :cond_1c
    if-ne v0, v12, :cond_1d

    .line 336
    .line 337
    invoke-static {v3, v0, v1, v2, v4}, Lb6/h;->e0(IIIII)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    invoke-static {v11, v6, v5}, Lb6/h;->a0(ILY4/b;Ljava/lang/String;)Lb6/n;

    .line 342
    .line 343
    .line 344
    move-result-object v5
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    goto :goto_d

    .line 346
    :cond_1d
    const/16 v10, 0x49

    .line 347
    .line 348
    const/16 v12, 0x50

    .line 349
    .line 350
    move-object/from16 v16, v13

    .line 351
    .line 352
    if-ne v0, v12, :cond_1e

    .line 353
    .line 354
    const/16 v13, 0x52

    .line 355
    .line 356
    if-ne v1, v13, :cond_1e

    .line 357
    .line 358
    if-ne v2, v10, :cond_1e

    .line 359
    .line 360
    const/16 v13, 0x56

    .line 361
    .line 362
    if-ne v4, v13, :cond_1e

    .line 363
    .line 364
    :try_start_1
    invoke-static {v11, v6}, Lb6/h;->W(ILY4/b;)Lb6/l;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    :goto_f
    move v12, v2

    .line 369
    move v13, v4

    .line 370
    move v2, v11

    .line 371
    move v11, v1

    .line 372
    goto :goto_e

    .line 373
    :catch_1
    move-object v1, v6

    .line 374
    goto/16 :goto_12

    .line 375
    .line 376
    :cond_1e
    const/16 v13, 0x47

    .line 377
    .line 378
    const/16 v8, 0x4f

    .line 379
    .line 380
    if-ne v0, v13, :cond_20

    .line 381
    .line 382
    const/16 v13, 0x45

    .line 383
    .line 384
    if-ne v1, v13, :cond_20

    .line 385
    .line 386
    if-ne v2, v8, :cond_20

    .line 387
    .line 388
    const/16 v13, 0x42

    .line 389
    .line 390
    if-eq v4, v13, :cond_1f

    .line 391
    .line 392
    if-ne v3, v5, :cond_20

    .line 393
    .line 394
    :cond_1f
    invoke-static {v11, v6}, Lb6/h;->U(ILY4/b;)Lb6/f;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    goto :goto_f

    .line 399
    :cond_20
    const/16 v13, 0x41

    .line 400
    .line 401
    const/16 v9, 0x43

    .line 402
    .line 403
    if-ne v3, v5, :cond_21

    .line 404
    .line 405
    if-ne v0, v12, :cond_22

    .line 406
    .line 407
    if-ne v1, v10, :cond_22

    .line 408
    .line 409
    if-ne v2, v9, :cond_22

    .line 410
    .line 411
    goto :goto_10

    .line 412
    :cond_21
    if-ne v0, v13, :cond_22

    .line 413
    .line 414
    if-ne v1, v12, :cond_22

    .line 415
    .line 416
    if-ne v2, v10, :cond_22

    .line 417
    .line 418
    if-ne v4, v9, :cond_22

    .line 419
    .line 420
    :goto_10
    invoke-static {v6, v11, v3}, Lb6/h;->P(LY4/b;II)Lb6/a;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    goto :goto_f

    .line 425
    :cond_22
    const/16 v10, 0x4d

    .line 426
    .line 427
    if-ne v0, v9, :cond_24

    .line 428
    .line 429
    if-ne v1, v8, :cond_24

    .line 430
    .line 431
    if-ne v2, v10, :cond_24

    .line 432
    .line 433
    if-eq v4, v10, :cond_23

    .line 434
    .line 435
    if-ne v3, v5, :cond_24

    .line 436
    .line 437
    :cond_23
    invoke-static {v11, v6}, Lb6/h;->S(ILY4/b;)Lb6/e;

    .line 438
    .line 439
    .line 440
    move-result-object v5
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 441
    goto :goto_f

    .line 442
    :cond_24
    if-ne v0, v9, :cond_25

    .line 443
    .line 444
    const/16 v5, 0x48

    .line 445
    .line 446
    if-ne v1, v5, :cond_25

    .line 447
    .line 448
    if-ne v2, v13, :cond_25

    .line 449
    .line 450
    if-ne v4, v12, :cond_25

    .line 451
    .line 452
    move/from16 v5, p3

    .line 453
    .line 454
    move v12, v2

    .line 455
    move v13, v4

    .line 456
    move v2, v11

    .line 457
    move/from16 v4, p2

    .line 458
    .line 459
    move v11, v1

    .line 460
    move-object v1, v6

    .line 461
    move-object/from16 v6, p4

    .line 462
    .line 463
    :try_start_2
    invoke-static/range {v1 .. v6}, Lb6/h;->Q(LY4/b;IIZILb6/g;)Lb6/c;

    .line 464
    .line 465
    .line 466
    move-result-object v5
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 467
    move/from16 v3, p0

    .line 468
    .line 469
    move-object/from16 v1, p1

    .line 470
    .line 471
    goto :goto_11

    .line 472
    :catchall_1
    move-exception v0

    .line 473
    move-object/from16 v1, p1

    .line 474
    .line 475
    goto/16 :goto_13

    .line 476
    .line 477
    :catch_2
    move-object/from16 v1, p1

    .line 478
    .line 479
    goto/16 :goto_12

    .line 480
    .line 481
    :cond_25
    move v12, v2

    .line 482
    move v13, v4

    .line 483
    move v2, v11

    .line 484
    move v11, v1

    .line 485
    if-ne v0, v9, :cond_26

    .line 486
    .line 487
    const/16 v1, 0x54

    .line 488
    .line 489
    if-ne v11, v1, :cond_26

    .line 490
    .line 491
    if-ne v12, v8, :cond_26

    .line 492
    .line 493
    if-ne v13, v9, :cond_26

    .line 494
    .line 495
    move/from16 v3, p0

    .line 496
    .line 497
    move-object/from16 v1, p1

    .line 498
    .line 499
    move/from16 v4, p2

    .line 500
    .line 501
    move/from16 v5, p3

    .line 502
    .line 503
    move-object/from16 v6, p4

    .line 504
    .line 505
    :try_start_3
    invoke-static/range {v1 .. v6}, Lb6/h;->R(LY4/b;IIZILb6/g;)Lb6/d;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    goto :goto_11

    .line 510
    :catchall_2
    move-exception v0

    .line 511
    goto :goto_13

    .line 512
    :cond_26
    move/from16 v3, p0

    .line 513
    .line 514
    move-object/from16 v1, p1

    .line 515
    .line 516
    if-ne v0, v10, :cond_27

    .line 517
    .line 518
    const/16 v4, 0x4c

    .line 519
    .line 520
    if-ne v11, v4, :cond_27

    .line 521
    .line 522
    if-ne v12, v4, :cond_27

    .line 523
    .line 524
    const/16 v4, 0x54

    .line 525
    .line 526
    if-ne v13, v4, :cond_27

    .line 527
    .line 528
    invoke-static {v2, v1}, Lb6/h;->V(ILY4/b;)Lb6/k;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    goto :goto_11

    .line 533
    :cond_27
    invoke-static {v3, v0, v11, v12, v13}, Lb6/h;->e0(IIIII)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    new-array v5, v2, [B

    .line 538
    .line 539
    const/4 v6, 0x0

    .line 540
    invoke-virtual {v1, v6, v2, v5}, LY4/b;->c(II[B)V

    .line 541
    .line 542
    .line 543
    new-instance v6, Lb6/b;

    .line 544
    .line 545
    invoke-direct {v6, v4, v5}, Lb6/b;-><init>(Ljava/lang/String;[B)V

    .line 546
    .line 547
    .line 548
    move-object v5, v6

    .line 549
    :goto_11
    if-nez v5, :cond_28

    .line 550
    .line 551
    new-instance v4, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-static {v3, v0, v11, v12, v13}, Lb6/h;->e0(IIIII)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    const-string v0, ", frameSize="

    .line 564
    .line 565
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v15, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 576
    .line 577
    .line 578
    :cond_28
    invoke-virtual {v1, v14}, LY4/b;->A(I)V

    .line 579
    .line 580
    .line 581
    return-object v5

    .line 582
    :catch_3
    :goto_12
    :try_start_4
    const-string v0, "Unsupported character encoding"

    .line 583
    .line 584
    invoke-static {v15, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1, v14}, LY4/b;->A(I)V

    .line 588
    .line 589
    .line 590
    return-object v16

    .line 591
    :goto_13
    invoke-virtual {v1, v14}, LY4/b;->A(I)V

    .line 592
    .line 593
    .line 594
    throw v0

    .line 595
    :goto_14
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    .line 596
    .line 597
    invoke-static {v15, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v14}, LY4/b;->A(I)V

    .line 601
    .line 602
    .line 603
    return-object v16
.end method

.method public static U(ILY4/b;)Lb6/f;
    .locals 6

    .line 1
    invoke-virtual {p1}, LY4/b;->q()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    add-int/lit8 p0, p0, -0x1

    .line 10
    .line 11
    new-array v2, p0, [B

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p1, v3, p0, v2}, LY4/b;->c(II[B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v2}, Lb6/h;->g0(I[B)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v4, Ljava/lang/String;

    .line 22
    .line 23
    const-string v5, "ISO-8859-1"

    .line 24
    .line 25
    invoke-direct {v4, v2, v3, p1, v5}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    invoke-static {p1, v0, v2}, Lb6/h;->f0(II[B)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {p1, v3, v1, v2}, Lb6/h;->X(IILjava/lang/String;[B)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {v0}, Lb6/h;->c0(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    add-int/2addr v5, v3

    .line 43
    invoke-static {v5, v0, v2}, Lb6/h;->f0(II[B)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v5, v3, v1, v2}, Lb6/h;->X(IILjava/lang/String;[B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v0}, Lb6/h;->c0(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v3

    .line 56
    if-gt p0, v0, :cond_0

    .line 57
    .line 58
    sget-object p0, Lu6/v;->f:[B

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v2, v0, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    new-instance v0, Lb6/f;

    .line 66
    .line 67
    invoke-direct {v0, v4, p1, v1, p0}, Lb6/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public static V(ILY4/b;)Lb6/k;
    .locals 10

    .line 1
    invoke-virtual {p1}, LY4/b;->v()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    invoke-virtual {p1}, LY4/b;->s()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p1}, LY4/b;->s()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p1}, LY4/b;->q()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, LY4/b;->q()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    new-instance v5, LJ5/y;

    .line 22
    .line 23
    const/4 v6, 0x6

    .line 24
    invoke-direct {v5, v6}, LJ5/y;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget-object v6, p1, LY4/b;->a:[B

    .line 28
    .line 29
    iget v7, p1, LY4/b;->c:I

    .line 30
    .line 31
    invoke-virtual {v5, v7, v6}, LJ5/y;->o(I[B)V

    .line 32
    .line 33
    .line 34
    iget p1, p1, LY4/b;->b:I

    .line 35
    .line 36
    mul-int/lit8 p1, p1, 0x8

    .line 37
    .line 38
    invoke-virtual {v5, p1}, LJ5/y;->q(I)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 p0, p0, -0xa

    .line 42
    .line 43
    mul-int/lit8 p0, p0, 0x8

    .line 44
    .line 45
    add-int p1, v0, v4

    .line 46
    .line 47
    div-int/2addr p0, p1

    .line 48
    move p1, v4

    .line 49
    new-array v4, p0, [I

    .line 50
    .line 51
    move-object v6, v5

    .line 52
    new-array v5, p0, [I

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    :goto_0
    if-ge v7, p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {v6, v0}, LJ5/y;->i(I)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    invoke-virtual {v6, p1}, LJ5/y;->i(I)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    aput v8, v4, v7

    .line 66
    .line 67
    aput v9, v5, v7

    .line 68
    .line 69
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v0, Lb6/k;

    .line 73
    .line 74
    invoke-direct/range {v0 .. v5}, Lb6/k;-><init>(III[I[I)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public static W(ILY4/b;)Lb6/l;
    .locals 4

    .line 1
    new-array v0, p0, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1, p0, v0}, LY4/b;->c(II[B)V

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lb6/h;->g0(I[B)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v2, Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "ISO-8859-1"

    .line 14
    .line 15
    invoke-direct {v2, v0, v1, p1, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    if-gt p0, p1, :cond_0

    .line 21
    .line 22
    sget-object p0, Lu6/v;->f:[B

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v0, p1, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    new-instance p1, Lb6/l;

    .line 30
    .line 31
    invoke-direct {p1, v2, p0}, Lb6/l;-><init>(Ljava/lang/String;[B)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static X(IILjava/lang/String;[B)Ljava/lang/String;
    .locals 1

    .line 1
    if-le p1, p0, :cond_1

    .line 2
    .line 3
    array-length v0, p3

    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 8
    .line 9
    sub-int/2addr p1, p0

    .line 10
    invoke-direct {v0, p3, p0, p1, p2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_1
    :goto_0
    const-string p0, ""

    .line 15
    .line 16
    return-object p0
.end method

.method public static Y(ILY4/b;Ljava/lang/String;)Lb6/m;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ge p0, v1, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p1}, LY4/b;->q()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v2}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sub-int/2addr p0, v1

    .line 15
    new-array v1, p0, [B

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-virtual {p1, v4, p0, v1}, LY4/b;->c(II[B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v4, v2, v1}, Lb6/h;->f0(II[B)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    new-instance p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p1, v1, v4, p0, v3}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Lb6/m;

    .line 31
    .line 32
    invoke-direct {p0, p2, v0, p1}, Lb6/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public static Z(ILY4/b;)Lb6/m;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, LY4/b;->q()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sub-int/2addr p0, v0

    .line 15
    new-array v0, p0, [B

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {p1, v3, p0, v0}, LY4/b;->c(II[B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v1, v0}, Lb6/h;->f0(II[B)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    new-instance p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p1, v0, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lb6/h;->c0(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    add-int/2addr v3, p0

    .line 35
    invoke-static {v3, v1, v0}, Lb6/h;->f0(II[B)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {v3, p0, v2, v0}, Lb6/h;->X(IILjava/lang/String;[B)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Lb6/m;

    .line 44
    .line 45
    const-string v1, "TXXX"

    .line 46
    .line 47
    invoke-direct {v0, v1, p1, p0}, Lb6/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public static a0(ILY4/b;Ljava/lang/String;)Lb6/n;
    .locals 3

    .line 1
    new-array v0, p0, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1, p0, v0}, LY4/b;->c(II[B)V

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lb6/h;->g0(I[B)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "ISO-8859-1"

    .line 14
    .line 15
    invoke-direct {p1, v0, v1, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Lb6/n;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p2, v0, p1}, Lb6/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static b0(ILY4/b;)Lb6/n;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ge p0, v0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, LY4/b;->q()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Lb6/h;->d0(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sub-int/2addr p0, v0

    .line 15
    new-array v0, p0, [B

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {p1, v3, p0, v0}, LY4/b;->c(II[B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v1, v0}, Lb6/h;->f0(II[B)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    new-instance p1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p1, v0, v3, p0, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lb6/h;->c0(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, p0

    .line 35
    invoke-static {v1, v0}, Lb6/h;->g0(I[B)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const-string v2, "ISO-8859-1"

    .line 40
    .line 41
    invoke-static {v1, p0, v2, v0}, Lb6/h;->X(IILjava/lang/String;[B)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v0, Lb6/n;

    .line 46
    .line 47
    const-string v1, "WXXX"

    .line 48
    .line 49
    invoke-direct {v0, v1, p1, p0}, Lb6/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static c0(I)I
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p0, 0x2

    .line 8
    return p0

    .line 9
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 10
    return p0
.end method

.method public static d0(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const-string p0, "ISO-8859-1"

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "UTF-8"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    const-string p0, "UTF-16BE"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    const-string p0, "UTF-16"

    .line 20
    .line 21
    return-object p0
.end method

.method public static e0(IIIII)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x2

    .line 5
    if-ne p0, v3, :cond_0

    .line 6
    .line 7
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    new-array p4, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object p1, p4, v1

    .line 24
    .line 25
    aput-object p2, p4, v0

    .line 26
    .line 27
    aput-object p3, p4, v3

    .line 28
    .line 29
    const-string p1, "%c%c%c"

    .line 30
    .line 31
    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    const/4 v4, 0x4

    .line 55
    new-array v4, v4, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p1, v4, v1

    .line 58
    .line 59
    aput-object p2, v4, v0

    .line 60
    .line 61
    aput-object p3, v4, v3

    .line 62
    .line 63
    aput-object p4, v4, v2

    .line 64
    .line 65
    const-string p1, "%c%c%c%c"

    .line 66
    .line 67
    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static f0(II[B)I
    .locals 2

    .line 1
    invoke-static {p0, p2}, Lb6/h;->g0(I[B)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    array-length p1, p2

    .line 12
    add-int/lit8 p1, p1, -0x1

    .line 13
    .line 14
    if-ge v0, p1, :cond_2

    .line 15
    .line 16
    sub-int p1, v0, p0

    .line 17
    .line 18
    rem-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    add-int/lit8 p1, v0, 0x1

    .line 23
    .line 24
    aget-byte p1, p2, p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    invoke-static {v0, p2}, Lb6/h;->g0(I[B)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    array-length p0, p2

    .line 37
    return p0

    .line 38
    :cond_3
    :goto_1
    return v0
.end method

.method public static g0(I[B)I
    .locals 1

    .line 1
    :goto_0
    array-length v0, p1

    .line 2
    if-ge p0, v0, :cond_1

    .line 3
    .line 4
    aget-byte v0, p1, p0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    array-length p0, p1

    .line 13
    return p0
.end method

.method public static h0(ILY4/b;)I
    .locals 5

    .line 1
    iget-object v0, p1, LY4/b;->a:[B

    .line 2
    .line 3
    iget p1, p1, LY4/b;->b:I

    .line 4
    .line 5
    move v1, p1

    .line 6
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    add-int v3, p1, p0

    .line 9
    .line 10
    if-ge v2, v3, :cond_1

    .line 11
    .line 12
    aget-byte v3, v0, v1

    .line 13
    .line 14
    const/16 v4, 0xff

    .line 15
    .line 16
    and-int/2addr v3, v4

    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    aget-byte v3, v0, v2

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    sub-int v3, v1, p1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    sub-int v3, p0, v3

    .line 28
    .line 29
    add-int/lit8 v3, v3, -0x2

    .line 30
    .line 31
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 p0, p0, -0x1

    .line 35
    .line 36
    :cond_0
    move v1, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return p0
.end method

.method public static i0(LY4/b;IIZ)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, LY4/b;->b:I

    .line 6
    .line 7
    :goto_0
    :try_start_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    move/from16 v5, p2

    .line 13
    .line 14
    if-lt v3, v5, :cond_c

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    if-lt v0, v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, LY4/b;->d()I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    invoke-virtual {v1}, LY4/b;->r()J

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    invoke-virtual {v1}, LY4/b;->v()I

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, LY4/b;->s()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    invoke-virtual {v1}, LY4/b;->s()I

    .line 41
    .line 42
    .line 43
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    int-to-long v8, v8

    .line 45
    move v10, v6

    .line 46
    :goto_1
    const-wide/16 v11, 0x0

    .line 47
    .line 48
    if-nez v7, :cond_1

    .line 49
    .line 50
    cmp-long v7, v8, v11

    .line 51
    .line 52
    if-nez v7, :cond_1

    .line 53
    .line 54
    if-nez v10, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 57
    .line 58
    .line 59
    return v4

    .line 60
    :cond_1
    const/4 v7, 0x4

    .line 61
    if-ne v0, v7, :cond_3

    .line 62
    .line 63
    if-nez p3, :cond_3

    .line 64
    .line 65
    const-wide/32 v13, 0x808080

    .line 66
    .line 67
    .line 68
    and-long/2addr v13, v8

    .line 69
    cmp-long v11, v13, v11

    .line 70
    .line 71
    if-eqz v11, :cond_2

    .line 72
    .line 73
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 74
    .line 75
    .line 76
    return v6

    .line 77
    :cond_2
    const-wide/16 v11, 0xff

    .line 78
    .line 79
    and-long v13, v8, v11

    .line 80
    .line 81
    const/16 v15, 0x8

    .line 82
    .line 83
    shr-long v15, v8, v15

    .line 84
    .line 85
    and-long/2addr v15, v11

    .line 86
    const/16 v17, 0x7

    .line 87
    .line 88
    shl-long v15, v15, v17

    .line 89
    .line 90
    or-long/2addr v13, v15

    .line 91
    const/16 v15, 0x10

    .line 92
    .line 93
    shr-long v15, v8, v15

    .line 94
    .line 95
    and-long/2addr v15, v11

    .line 96
    const/16 v17, 0xe

    .line 97
    .line 98
    shl-long v15, v15, v17

    .line 99
    .line 100
    or-long/2addr v13, v15

    .line 101
    const/16 v15, 0x18

    .line 102
    .line 103
    shr-long/2addr v8, v15

    .line 104
    and-long/2addr v8, v11

    .line 105
    const/16 v11, 0x15

    .line 106
    .line 107
    shl-long/2addr v8, v11

    .line 108
    or-long/2addr v8, v13

    .line 109
    :cond_3
    if-ne v0, v7, :cond_6

    .line 110
    .line 111
    and-int/lit8 v3, v10, 0x40

    .line 112
    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    move v3, v4

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move v3, v6

    .line 118
    :goto_2
    and-int/lit8 v7, v10, 0x1

    .line 119
    .line 120
    if-eqz v7, :cond_5

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_5
    move v4, v6

    .line 124
    goto :goto_4

    .line 125
    :cond_6
    if-ne v0, v3, :cond_8

    .line 126
    .line 127
    and-int/lit8 v3, v10, 0x20

    .line 128
    .line 129
    if-eqz v3, :cond_7

    .line 130
    .line 131
    move v3, v4

    .line 132
    goto :goto_3

    .line 133
    :cond_7
    move v3, v6

    .line 134
    :goto_3
    and-int/lit16 v7, v10, 0x80

    .line 135
    .line 136
    if-eqz v7, :cond_5

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    move v3, v6

    .line 140
    move v4, v3

    .line 141
    :goto_4
    if-eqz v4, :cond_9

    .line 142
    .line 143
    add-int/lit8 v3, v3, 0x4

    .line 144
    .line 145
    :cond_9
    int-to-long v3, v3

    .line 146
    cmp-long v3, v8, v3

    .line 147
    .line 148
    if-gez v3, :cond_a

    .line 149
    .line 150
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 151
    .line 152
    .line 153
    return v6

    .line 154
    :cond_a
    :try_start_1
    invoke-virtual {v1}, LY4/b;->a()I

    .line 155
    .line 156
    .line 157
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    int-to-long v3, v3

    .line 159
    cmp-long v3, v3, v8

    .line 160
    .line 161
    if-gez v3, :cond_b

    .line 162
    .line 163
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 164
    .line 165
    .line 166
    return v6

    .line 167
    :cond_b
    long-to-int v3, v8

    .line 168
    :try_start_2
    invoke-virtual {v1, v3}, LY4/b;->B(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_c
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 174
    .line 175
    .line 176
    return v4

    .line 177
    :goto_5
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 178
    .line 179
    .line 180
    throw v0
.end method


# virtual methods
.method public final O(I[B)LW5/c;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x4

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v4, LY4/b;

    .line 10
    .line 11
    invoke-direct {v4, p2, p1}, LY4/b;-><init>([BI)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4}, LY4/b;->a()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x2

    .line 19
    const-string v5, "Id3Decoder"

    .line 20
    .line 21
    const/16 v6, 0xa

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    if-ge p1, v6, :cond_0

    .line 25
    .line 26
    const-string p1, "Data too short to be an ID3 tag"

    .line 27
    .line 28
    invoke-static {v5, p1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    move-object v10, v7

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v4}, LY4/b;->s()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const v8, 0x494433

    .line 39
    .line 40
    .line 41
    if-eq p1, v8, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-array v8, v0, [Ljava/lang/Object;

    .line 48
    .line 49
    aput-object p1, v8, v1

    .line 50
    .line 51
    const-string p1, "%06X"

    .line 52
    .line 53
    invoke-static {p1, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v8, "Unexpected first three bytes of ID3 tag header: 0x"

    .line 58
    .line 59
    invoke-virtual {v8, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {v5, p1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v4}, LY4/b;->q()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {v4, v0}, LY4/b;->B(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, LY4/b;->q()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-virtual {v4}, LY4/b;->p()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-ne p1, p2, :cond_2

    .line 83
    .line 84
    and-int/lit8 v10, v8, 0x40

    .line 85
    .line 86
    if-eqz v10, :cond_5

    .line 87
    .line 88
    const-string p1, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 89
    .line 90
    invoke-static {v5, p1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const/4 v10, 0x3

    .line 95
    if-ne p1, v10, :cond_3

    .line 96
    .line 97
    and-int/lit8 v10, v8, 0x40

    .line 98
    .line 99
    if-eqz v10, :cond_5

    .line 100
    .line 101
    invoke-virtual {v4}, LY4/b;->d()I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    invoke-virtual {v4, v10}, LY4/b;->B(I)V

    .line 106
    .line 107
    .line 108
    add-int/2addr v10, v2

    .line 109
    sub-int/2addr v9, v10

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    if-ne p1, v2, :cond_7

    .line 112
    .line 113
    and-int/lit8 v10, v8, 0x40

    .line 114
    .line 115
    if-eqz v10, :cond_4

    .line 116
    .line 117
    invoke-virtual {v4}, LY4/b;->p()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    add-int/lit8 v11, v10, -0x4

    .line 122
    .line 123
    invoke-virtual {v4, v11}, LY4/b;->B(I)V

    .line 124
    .line 125
    .line 126
    sub-int/2addr v9, v10

    .line 127
    :cond_4
    and-int/lit8 v10, v8, 0x10

    .line 128
    .line 129
    if-eqz v10, :cond_5

    .line 130
    .line 131
    add-int/lit8 v9, v9, -0xa

    .line 132
    .line 133
    :cond_5
    :goto_1
    if-ge p1, v2, :cond_6

    .line 134
    .line 135
    and-int/lit16 v8, v8, 0x80

    .line 136
    .line 137
    if-eqz v8, :cond_6

    .line 138
    .line 139
    move v8, v0

    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move v8, v1

    .line 142
    :goto_2
    new-instance v10, LG2/h;

    .line 143
    .line 144
    invoke-direct {v10, p1, v8, v9}, LG2/h;-><init>(IZI)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    const-string v8, "Skipped ID3 tag with unsupported majorVersion="

    .line 149
    .line 150
    invoke-static {p1, v8, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :goto_3
    if-nez v10, :cond_8

    .line 155
    .line 156
    return-object v7

    .line 157
    :cond_8
    iget p1, v4, LY4/b;->b:I

    .line 158
    .line 159
    iget v8, v10, LG2/h;->a:I

    .line 160
    .line 161
    if-ne v8, p2, :cond_9

    .line 162
    .line 163
    const/4 v6, 0x6

    .line 164
    :cond_9
    iget-boolean p2, v10, LG2/h;->b:Z

    .line 165
    .line 166
    iget v9, v10, LG2/h;->c:I

    .line 167
    .line 168
    if-eqz p2, :cond_a

    .line 169
    .line 170
    invoke-static {v9, v4}, Lb6/h;->h0(ILY4/b;)I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    :cond_a
    add-int/2addr p1, v9

    .line 175
    invoke-virtual {v4, p1}, LY4/b;->z(I)V

    .line 176
    .line 177
    .line 178
    invoke-static {v4, v8, v6, v1}, Lb6/h;->i0(LY4/b;IIZ)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_c

    .line 183
    .line 184
    if-ne v8, v2, :cond_b

    .line 185
    .line 186
    invoke-static {v4, v2, v6, v0}, Lb6/h;->i0(LY4/b;IIZ)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_b

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_b
    const-string p1, "Failed to validate ID3 tag with majorVersion="

    .line 194
    .line 195
    invoke-static {v8, p1, v5}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object v7

    .line 199
    :cond_c
    move v0, v1

    .line 200
    :cond_d
    :goto_4
    invoke-virtual {v4}, LY4/b;->a()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-lt p1, v6, :cond_e

    .line 205
    .line 206
    iget-object p1, p0, Lb6/h;->b:Lb6/g;

    .line 207
    .line 208
    invoke-static {v8, v4, v0, v6, p1}, Lb6/h;->T(ILY4/b;ZILb6/g;)Lb6/i;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-eqz p1, :cond_d

    .line 213
    .line 214
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_e
    new-instance p1, LW5/c;

    .line 219
    .line 220
    invoke-direct {p1, v3}, LW5/c;-><init>(Ljava/util/List;)V

    .line 221
    .line 222
    .line 223
    return-object p1
.end method

.method public final r(LW5/e;Ljava/nio/ByteBuffer;)LW5/c;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p2, p1}, Lb6/h;->O(I[B)LW5/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
