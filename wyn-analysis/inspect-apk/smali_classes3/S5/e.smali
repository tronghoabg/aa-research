.class public final LS5/e;
.super LN2/i;
.source "SourceFile"


# static fields
.field public static final p:[B

.field public static final q:[B


# instance fields
.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, LS5/e;->p:[B

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, LS5/e;->q:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x48t
        0x65t
        0x61t
        0x64t
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    :array_1
    .array-data 1
        0x4ft
        0x70t
        0x75t
        0x73t
        0x54t
        0x61t
        0x67t
        0x73t
    .end array-data
.end method

.method public static g(LY4/b;[B)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LY4/b;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    iget v0, p0, LY4/b;->b:I

    .line 11
    .line 12
    array-length v1, p1

    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    array-length v3, p1

    .line 16
    invoke-virtual {p0, v2, v3, v1}, LY4/b;->c(II[B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, LY4/b;->A(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method


# virtual methods
.method public final c(LY4/b;)J
    .locals 6

    .line 1
    iget-object p1, p1, LY4/b;->a:[B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-byte v0, p1, v0

    .line 5
    .line 6
    and-int/lit16 v1, v0, 0xff

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    and-int/2addr v0, v2

    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    if-eq v0, v4, :cond_1

    .line 17
    .line 18
    aget-byte p1, p1, v3

    .line 19
    .line 20
    and-int/lit8 v4, p1, 0x3f

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v4, v3

    .line 24
    :cond_1
    :goto_0
    shr-int/lit8 p1, v1, 0x3

    .line 25
    .line 26
    and-int/lit8 v0, p1, 0x3

    .line 27
    .line 28
    const/16 v1, 0x10

    .line 29
    .line 30
    if-lt p1, v1, :cond_2

    .line 31
    .line 32
    const/16 p1, 0x9c4

    .line 33
    .line 34
    shl-int/2addr p1, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    const/16 v1, 0xc

    .line 37
    .line 38
    const/16 v5, 0x2710

    .line 39
    .line 40
    if-lt p1, v1, :cond_3

    .line 41
    .line 42
    and-int/2addr p1, v3

    .line 43
    shl-int p1, v5, p1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    if-ne v0, v2, :cond_4

    .line 47
    .line 48
    const p1, 0xea60

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    shl-int p1, v5, v0

    .line 53
    .line 54
    :goto_1
    int-to-long v0, v4

    .line 55
    int-to-long v2, p1

    .line 56
    mul-long/2addr v0, v2

    .line 57
    iget p1, p0, LN2/i;->f:I

    .line 58
    .line 59
    int-to-long v2, p1

    .line 60
    mul-long/2addr v2, v0

    .line 61
    const-wide/32 v0, 0xf4240

    .line 62
    .line 63
    .line 64
    div-long/2addr v2, v0

    .line 65
    return-wide v2
.end method

.method public final e(LY4/b;JLS3/s;)Z
    .locals 2

    .line 1
    sget-object p2, LS5/e;->p:[B

    .line 2
    .line 3
    invoke-static {p1, p2}, LS5/e;->g(LY4/b;[B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p1, LY4/b;->a:[B

    .line 11
    .line 12
    iget p1, p1, LY4/b;->c:I

    .line 13
    .line 14
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 p2, 0x9

    .line 19
    .line 20
    aget-byte p2, p1, p2

    .line 21
    .line 22
    and-int/lit16 p2, p2, 0xff

    .line 23
    .line 24
    invoke-static {p1}, LG5/b;->a([B)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p4, LS3/s;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LE5/T;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, LE5/S;

    .line 36
    .line 37
    invoke-direct {v0}, LE5/S;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "audio/opus"

    .line 41
    .line 42
    iput-object v1, v0, LE5/S;->k:Ljava/lang/String;

    .line 43
    .line 44
    iput p2, v0, LE5/S;->x:I

    .line 45
    .line 46
    const p2, 0xbb80

    .line 47
    .line 48
    .line 49
    iput p2, v0, LE5/S;->y:I

    .line 50
    .line 51
    iput-object p1, v0, LE5/S;->m:Ljava/util/List;

    .line 52
    .line 53
    new-instance p1, LE5/T;

    .line 54
    .line 55
    invoke-direct {p1, v0}, LE5/T;-><init>(LE5/S;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p4, LS3/s;->b:Ljava/lang/Object;

    .line 59
    .line 60
    return p3

    .line 61
    :cond_1
    sget-object p2, LS5/e;->q:[B

    .line 62
    .line 63
    invoke-static {p1, p2}, LS5/e;->g(LY4/b;[B)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    const/4 v0, 0x0

    .line 68
    if-eqz p2, :cond_5

    .line 69
    .line 70
    iget-object p2, p4, LS3/s;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, LE5/T;

    .line 73
    .line 74
    invoke-static {p2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-boolean p2, p0, LS5/e;->o:Z

    .line 78
    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iput-boolean p3, p0, LS5/e;->o:Z

    .line 83
    .line 84
    const/16 p2, 0x8

    .line 85
    .line 86
    invoke-virtual {p1, p2}, LY4/b;->B(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0, v0}, Landroid/support/v4/media/session/b;->p0(LY4/b;ZZ)LS3/l;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, LS3/l;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, [Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {p1}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Landroid/support/v4/media/session/b;->m0(Ljava/util/List;)LW5/c;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-nez p1, :cond_3

    .line 106
    .line 107
    :goto_0
    return p3

    .line 108
    :cond_3
    iget-object p2, p4, LS3/s;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p2, LE5/T;

    .line 111
    .line 112
    invoke-virtual {p2}, LE5/T;->a()LE5/S;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iget-object v0, p4, LS3/s;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, LE5/T;

    .line 119
    .line 120
    iget-object v0, v0, LE5/T;->j:LW5/c;

    .line 121
    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    iget-object v0, v0, LW5/c;->a:[LW5/b;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, LW5/c;->c([LW5/b;)LW5/c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :goto_1
    iput-object p1, p2, LE5/S;->i:LW5/c;

    .line 132
    .line 133
    new-instance p1, LE5/T;

    .line 134
    .line 135
    invoke-direct {p1, p2}, LE5/T;-><init>(LE5/S;)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p4, LS3/s;->b:Ljava/lang/Object;

    .line 139
    .line 140
    return p3

    .line 141
    :cond_5
    iget-object p1, p4, LS3/s;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, LE5/T;

    .line 144
    .line 145
    invoke-static {p1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return v0
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LN2/i;->f(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, LS5/e;->o:Z

    .line 8
    .line 9
    :cond_0
    return-void
.end method
