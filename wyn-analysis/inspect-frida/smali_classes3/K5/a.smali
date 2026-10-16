.class public final LK5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# static fields
.field public static final n:[I

.field public static final o:[I

.field public static final p:[B

.field public static final q:[B

.field public static final r:I


# instance fields
.field public final a:[B

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:J

.field public j:Lf6/N;

.field public k:LJ5/w;

.field public l:LJ5/t;

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, LK5/a;->n:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, LK5/a;->o:[I

    .line 16
    .line 17
    sget v1, Lu6/v;->a:I

    .line 18
    .line 19
    sget-object v1, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    const-string v2, "#!AMR\n"

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sput-object v2, LK5/a;->p:[B

    .line 28
    .line 29
    const-string v2, "#!AMR-WB\n"

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sput-object v1, LK5/a;->q:[B

    .line 36
    .line 37
    const/16 v1, 0x8

    .line 38
    .line 39
    aget v0, v0, v1

    .line 40
    .line 41
    sput v0, LK5/a;->r:I

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iput-object v0, p0, LK5/a;->a:[B

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    iput v0, p0, LK5/a;->g:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 3

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    iput-wide p3, p0, LK5/a;->c:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, LK5/a;->d:I

    .line 7
    .line 8
    iput v0, p0, LK5/a;->e:I

    .line 9
    .line 10
    cmp-long v0, p1, p3

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LK5/a;->l:LJ5/t;

    .line 15
    .line 16
    instance-of v1, v0, LQ5/a;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    check-cast v0, LQ5/a;

    .line 21
    .line 22
    iget-wide v1, v0, LQ5/a;->b:J

    .line 23
    .line 24
    sub-long/2addr p1, v1

    .line 25
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    const-wide/32 p3, 0x7a1200

    .line 30
    .line 31
    .line 32
    mul-long/2addr p1, p3

    .line 33
    iget p3, v0, LQ5/a;->e:I

    .line 34
    .line 35
    int-to-long p3, p3

    .line 36
    div-long/2addr p1, p3

    .line 37
    iput-wide p1, p0, LK5/a;->i:J

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    iput-wide p3, p0, LK5/a;->i:J

    .line 41
    .line 42
    return-void
.end method

.method public final b(LJ5/h;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p1, LJ5/h;->f:I

    .line 3
    .line 4
    iget-object v1, p0, LK5/a;->a:[B

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p1, v1, v0, v2, v0}, LJ5/h;->c([BIIZ)Z

    .line 8
    .line 9
    .line 10
    aget-byte p1, v1, v0

    .line 11
    .line 12
    and-int/lit16 v0, p1, 0x83

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-gtz v0, :cond_5

    .line 16
    .line 17
    shr-int/lit8 p1, p1, 0x3

    .line 18
    .line 19
    const/16 v0, 0xf

    .line 20
    .line 21
    and-int/2addr p1, v0

    .line 22
    if-ltz p1, :cond_3

    .line 23
    .line 24
    if-gt p1, v0, :cond_3

    .line 25
    .line 26
    iget-boolean v0, p0, LK5/a;->b:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    if-lt p1, v2, :cond_1

    .line 33
    .line 34
    const/16 v2, 0xd

    .line 35
    .line 36
    if-le p1, v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-nez v0, :cond_3

    .line 40
    .line 41
    const/16 v2, 0xc

    .line 42
    .line 43
    if-lt p1, v2, :cond_1

    .line 44
    .line 45
    const/16 v2, 0xe

    .line 46
    .line 47
    if-le p1, v2, :cond_3

    .line 48
    .line 49
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 50
    .line 51
    sget-object v0, LK5/a;->o:[I

    .line 52
    .line 53
    aget p1, v0, p1

    .line 54
    .line 55
    return p1

    .line 56
    :cond_2
    sget-object v0, LK5/a;->n:[I

    .line 57
    .line 58
    aget p1, v0, p1

    .line 59
    .line 60
    return p1

    .line 61
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v2, "Illegal AMR "

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-boolean v2, p0, LK5/a;->b:Z

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    const-string v2, "WB"

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const-string v2, "NB"

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, " frame type "

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    throw p1

    .line 97
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v2, "Invalid padding bits for frame header "

    .line 100
    .line 101
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1
.end method

.method public final c(LJ5/h;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p1, LJ5/h;->f:I

    .line 3
    .line 4
    sget-object v1, LK5/a;->p:[B

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    new-array v2, v2, [B

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    invoke-virtual {p1, v2, v0, v3, v0}, LJ5/h;->c([BIIZ)Z

    .line 11
    .line 12
    .line 13
    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iput-boolean v0, p0, LK5/a;->b:Z

    .line 21
    .line 22
    array-length v0, v1

    .line 23
    invoke-virtual {p1, v0}, LJ5/h;->j(I)V

    .line 24
    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iput v0, p1, LJ5/h;->f:I

    .line 28
    .line 29
    sget-object v1, LK5/a;->q:[B

    .line 30
    .line 31
    array-length v2, v1

    .line 32
    new-array v2, v2, [B

    .line 33
    .line 34
    array-length v4, v1

    .line 35
    invoke-virtual {p1, v2, v0, v4, v0}, LJ5/h;->c([BIIZ)Z

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iput-boolean v3, p0, LK5/a;->b:Z

    .line 45
    .line 46
    array-length v0, v1

    .line 47
    invoke-virtual {p1, v0}, LJ5/h;->j(I)V

    .line 48
    .line 49
    .line 50
    return v3

    .line 51
    :cond_1
    return v0
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 9

    .line 1
    iget-object p2, p0, LK5/a;->k:LJ5/w;

    .line 2
    .line 3
    invoke-static {p2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget p2, Lu6/v;->a:I

    .line 7
    .line 8
    move-object p2, p1

    .line 9
    check-cast p2, LJ5/h;

    .line 10
    .line 11
    iget-wide v0, p2, LJ5/h;->d:J

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long p2, v0, v2

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    move-object p2, p1

    .line 20
    check-cast p2, LJ5/h;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, LK5/a;->c(LJ5/h;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p1, "Could not find AMR header."

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-static {p1, p2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    throw p1

    .line 37
    :cond_1
    :goto_0
    iget-boolean p2, p0, LK5/a;->m:Z

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    if-nez p2, :cond_4

    .line 41
    .line 42
    iput-boolean v0, p0, LK5/a;->m:Z

    .line 43
    .line 44
    iget-boolean p2, p0, LK5/a;->b:Z

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    const-string v1, "audio/amr-wb"

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v1, "audio/3gpp"

    .line 52
    .line 53
    :goto_1
    if-eqz p2, :cond_3

    .line 54
    .line 55
    const/16 p2, 0x3e80

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/16 p2, 0x1f40

    .line 59
    .line 60
    :goto_2
    iget-object v2, p0, LK5/a;->k:LJ5/w;

    .line 61
    .line 62
    new-instance v3, LE5/S;

    .line 63
    .line 64
    invoke-direct {v3}, LE5/S;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, v3, LE5/S;->k:Ljava/lang/String;

    .line 68
    .line 69
    sget v1, LK5/a;->r:I

    .line 70
    .line 71
    iput v1, v3, LE5/S;->l:I

    .line 72
    .line 73
    iput v0, v3, LE5/S;->x:I

    .line 74
    .line 75
    iput p2, v3, LE5/S;->y:I

    .line 76
    .line 77
    new-instance p2, LE5/T;

    .line 78
    .line 79
    invoke-direct {p2, v3}, LE5/T;-><init>(LE5/S;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, p2}, LJ5/w;->a(LE5/T;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget p2, p0, LK5/a;->e:I

    .line 86
    .line 87
    const/4 v1, -0x1

    .line 88
    if-nez p2, :cond_6

    .line 89
    .line 90
    :try_start_0
    move-object p2, p1

    .line 91
    check-cast p2, LJ5/h;

    .line 92
    .line 93
    invoke-virtual {p0, p2}, LK5/a;->b(LJ5/h;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, p0, LK5/a;->d:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    iput p2, p0, LK5/a;->e:I

    .line 100
    .line 101
    iget v2, p0, LK5/a;->g:I

    .line 102
    .line 103
    if-ne v2, v1, :cond_5

    .line 104
    .line 105
    move-object v2, p1

    .line 106
    check-cast v2, LJ5/h;

    .line 107
    .line 108
    iget-wide v2, v2, LJ5/h;->d:J

    .line 109
    .line 110
    iput p2, p0, LK5/a;->g:I

    .line 111
    .line 112
    :cond_5
    iget v2, p0, LK5/a;->g:I

    .line 113
    .line 114
    if-ne v2, p2, :cond_6

    .line 115
    .line 116
    iget p2, p0, LK5/a;->h:I

    .line 117
    .line 118
    add-int/2addr p2, v0

    .line 119
    iput p2, p0, LK5/a;->h:I

    .line 120
    .line 121
    :cond_6
    iget-object p2, p0, LK5/a;->k:LJ5/w;

    .line 122
    .line 123
    iget v2, p0, LK5/a;->e:I

    .line 124
    .line 125
    invoke-interface {p2, p1, v2, v0}, LJ5/w;->d(Lt6/i;IZ)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-ne p1, v1, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    iget p2, p0, LK5/a;->e:I

    .line 133
    .line 134
    sub-int/2addr p2, p1

    .line 135
    iput p2, p0, LK5/a;->e:I

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    if-lez p2, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    iget-object v2, p0, LK5/a;->k:LJ5/w;

    .line 142
    .line 143
    iget-wide p1, p0, LK5/a;->i:J

    .line 144
    .line 145
    iget-wide v3, p0, LK5/a;->c:J

    .line 146
    .line 147
    add-long/2addr v3, p1

    .line 148
    iget v6, p0, LK5/a;->d:I

    .line 149
    .line 150
    const/4 v5, 0x1

    .line 151
    const/4 v7, 0x0

    .line 152
    const/4 v8, 0x0

    .line 153
    invoke-interface/range {v2 .. v8}, LJ5/w;->b(JIIILJ5/v;)V

    .line 154
    .line 155
    .line 156
    iget-wide p1, p0, LK5/a;->c:J

    .line 157
    .line 158
    const-wide/16 v2, 0x4e20

    .line 159
    .line 160
    add-long/2addr p1, v2

    .line 161
    iput-wide p1, p0, LK5/a;->c:J

    .line 162
    .line 163
    :catch_0
    :goto_3
    iget-boolean p1, p0, LK5/a;->f:Z

    .line 164
    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_9
    new-instance p1, LJ5/o;

    .line 169
    .line 170
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    invoke-direct {p1, v2, v3}, LJ5/o;-><init>(J)V

    .line 176
    .line 177
    .line 178
    iput-object p1, p0, LK5/a;->l:LJ5/t;

    .line 179
    .line 180
    iget-object p2, p0, LK5/a;->j:Lf6/N;

    .line 181
    .line 182
    invoke-virtual {p2, p1}, Lf6/N;->x(LJ5/t;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v0, p0, LK5/a;->f:Z

    .line 186
    .line 187
    :goto_4
    return v1
.end method

.method public final h(Lf6/N;)V
    .locals 2

    .line 1
    iput-object p1, p0, LK5/a;->j:Lf6/N;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Lf6/N;->m(II)LJ5/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LK5/a;->k:LJ5/w;

    .line 10
    .line 11
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 0

    .line 1
    check-cast p1, LJ5/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LK5/a;->c(LJ5/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
