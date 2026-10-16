.class public final Lt2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# static fields
.field public static final s:[I

.field public static final t:[I

.field public static final u:[B

.field public static final v:[B


# instance fields
.field public final a:[B

.field public final b:I

.field public final c:Ls2/l;

.field public d:Z

.field public e:J

.field public f:I

.field public g:I

.field public h:J

.field public i:I

.field public j:I

.field public k:J

.field public l:Ls2/o;

.field public m:Ls2/C;

.field public n:Ls2/C;

.field public o:Ls2/w;

.field public p:Z

.field public q:J

.field public r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

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
    sput-object v1, Lt2/a;->s:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Lt2/a;->t:[I

    .line 16
    .line 17
    sget v0, LQ1/x;->a:I

    .line 18
    .line 19
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    const-string v1, "#!AMR\n"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sput-object v1, Lt2/a;->u:[B

    .line 28
    .line 29
    const-string v1, "#!AMR-WB\n"

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lt2/a;->v:[B

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
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

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
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

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x2

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    :cond_0
    iput p1, p0, Lt2/a;->b:I

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    new-array p1, p1, [B

    .line 14
    .line 15
    iput-object p1, p0, Lt2/a;->a:[B

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lt2/a;->i:I

    .line 19
    .line 20
    new-instance p1, Ls2/l;

    .line 21
    .line 22
    invoke-direct {p1}, Ls2/l;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lt2/a;->c:Ls2/l;

    .line 26
    .line 27
    iput-object p1, p0, Lt2/a;->n:Ls2/C;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lt2/a;->e:J

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, p0, Lt2/a;->f:I

    .line 7
    .line 8
    iput v2, p0, Lt2/a;->g:I

    .line 9
    .line 10
    iput-wide p3, p0, Lt2/a;->q:J

    .line 11
    .line 12
    iget-object p3, p0, Lt2/a;->o:Ls2/w;

    .line 13
    .line 14
    instance-of p4, p3, Ls2/u;

    .line 15
    .line 16
    if-eqz p4, :cond_2

    .line 17
    .line 18
    check-cast p3, Ls2/u;

    .line 19
    .line 20
    iget-object p4, p3, Ls2/u;->b:LQ1/l;

    .line 21
    .line 22
    iget v0, p4, LQ1/l;->b:I

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p3, p3, Ls2/u;->a:LQ1/l;

    .line 33
    .line 34
    invoke-static {p3, p1, p2}, LQ1/x;->b(LQ1/l;J)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p4, p1}, LQ1/l;->c(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    :goto_0
    iput-wide p1, p0, Lt2/a;->k:J

    .line 43
    .line 44
    iget-wide p3, p0, Lt2/a;->q:J

    .line 45
    .line 46
    sub-long/2addr p3, p1

    .line 47
    invoke-static {p3, p4}, Ljava/lang/Math;->abs(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    const-wide/16 p3, 0x4e20

    .line 52
    .line 53
    cmp-long p1, p1, p3

    .line 54
    .line 55
    if-gez p1, :cond_1

    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Lt2/a;->p:Z

    .line 60
    .line 61
    iget-object p1, p0, Lt2/a;->c:Ls2/l;

    .line 62
    .line 63
    iput-object p1, p0, Lt2/a;->n:Ls2/C;

    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    cmp-long p4, p1, v0

    .line 67
    .line 68
    if-eqz p4, :cond_3

    .line 69
    .line 70
    instance-of p4, p3, Ls2/i;

    .line 71
    .line 72
    if-eqz p4, :cond_3

    .line 73
    .line 74
    check-cast p3, Ls2/i;

    .line 75
    .line 76
    iget-wide v2, p3, Ls2/i;->b:J

    .line 77
    .line 78
    sub-long/2addr p1, v2

    .line 79
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide p1

    .line 83
    const-wide/32 v0, 0x7a1200

    .line 84
    .line 85
    .line 86
    mul-long/2addr p1, v0

    .line 87
    iget p3, p3, Ls2/i;->e:I

    .line 88
    .line 89
    int-to-long p3, p3

    .line 90
    div-long/2addr p1, p3

    .line 91
    iput-wide p1, p0, Lt2/a;->k:J

    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    iput-wide v0, p0, Lt2/a;->k:J

    .line 95
    .line 96
    return-void
.end method

.method public final b(Ls2/j;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p1, Ls2/j;->f:I

    .line 3
    .line 4
    iget-object v1, p0, Lt2/a;->a:[B

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {p1, v1, v0, v2, v0}, Ls2/j;->c([BIIZ)Z

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
    iget-boolean v0, p0, Lt2/a;->d:Z

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
    sget-object v0, Lt2/a;->t:[I

    .line 52
    .line 53
    aget p1, v0, p1

    .line 54
    .line 55
    return p1

    .line 56
    :cond_2
    sget-object v0, Lt2/a;->s:[I

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
    iget-boolean v2, p0, Lt2/a;->d:Z

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
    invoke-static {v1, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

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
    invoke-static {v1, p1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1
.end method

.method public final c(Ls2/j;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p1, Ls2/j;->f:I

    .line 3
    .line 4
    sget-object v1, Lt2/a;->u:[B

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    new-array v2, v2, [B

    .line 8
    .line 9
    array-length v3, v1

    .line 10
    invoke-virtual {p1, v2, v0, v3, v0}, Ls2/j;->c([BIIZ)Z

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
    iput-boolean v0, p0, Lt2/a;->d:Z

    .line 21
    .line 22
    array-length v0, v1

    .line 23
    invoke-virtual {p1, v0}, Ls2/j;->j(I)V

    .line 24
    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iput v0, p1, Ls2/j;->f:I

    .line 28
    .line 29
    sget-object v1, Lt2/a;->v:[B

    .line 30
    .line 31
    array-length v2, v1

    .line 32
    new-array v2, v2, [B

    .line 33
    .line 34
    array-length v4, v1

    .line 35
    invoke-virtual {p1, v2, v0, v4, v0}, Ls2/j;->c([BIIZ)Z

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
    iput-boolean v3, p0, Lt2/a;->d:Z

    .line 45
    .line 46
    array-length v0, v1

    .line 47
    invoke-virtual {p1, v0}, Ls2/j;->j(I)V

    .line 48
    .line 49
    .line 50
    return v3

    .line 51
    :cond_1
    return v0
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lt2/a;->l:Ls2/o;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lt2/a;->m:Ls2/C;

    .line 10
    .line 11
    iput-object v0, p0, Lt2/a;->n:Ls2/C;

    .line 12
    .line 13
    invoke-interface {p1}, Ls2/o;->l()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 0

    .line 1
    check-cast p1, Ls2/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lt2/a;->c(Ls2/j;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, Lt2/a;->m:Ls2/C;

    .line 8
    .line 9
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget v4, LQ1/x;->a:I

    .line 13
    .line 14
    move-object v4, v1

    .line 15
    check-cast v4, Ls2/j;

    .line 16
    .line 17
    iget-wide v4, v4, Ls2/j;->d:J

    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    cmp-long v4, v4, v6

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    move-object v4, v1

    .line 26
    check-cast v4, Ls2/j;

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Lt2/a;->c(Ls2/j;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v1, "Could not find AMR header."

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    throw v1

    .line 43
    :cond_1
    :goto_0
    iget-boolean v4, v0, Lt2/a;->r:Z

    .line 44
    .line 45
    if-nez v4, :cond_5

    .line 46
    .line 47
    iput-boolean v3, v0, Lt2/a;->r:Z

    .line 48
    .line 49
    iget-boolean v4, v0, Lt2/a;->d:Z

    .line 50
    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    const-string v5, "audio/amr-wb"

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const-string v5, "audio/3gpp"

    .line 57
    .line 58
    :goto_1
    if-eqz v4, :cond_3

    .line 59
    .line 60
    const/16 v8, 0x3e80

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/16 v8, 0x1f40

    .line 64
    .line 65
    :goto_2
    if-eqz v4, :cond_4

    .line 66
    .line 67
    sget-object v4, Lt2/a;->t:[I

    .line 68
    .line 69
    const/16 v9, 0x8

    .line 70
    .line 71
    aget v4, v4, v9

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    sget-object v4, Lt2/a;->s:[I

    .line 75
    .line 76
    const/4 v9, 0x7

    .line 77
    aget v4, v4, v9

    .line 78
    .line 79
    :goto_3
    iget-object v9, v0, Lt2/a;->n:Ls2/C;

    .line 80
    .line 81
    new-instance v10, LN1/m;

    .line 82
    .line 83
    invoke-direct {v10}, LN1/m;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    iput-object v5, v10, LN1/m;->m:Ljava/lang/String;

    .line 91
    .line 92
    iput v4, v10, LN1/m;->n:I

    .line 93
    .line 94
    iput v3, v10, LN1/m;->B:I

    .line 95
    .line 96
    iput v8, v10, LN1/m;->C:I

    .line 97
    .line 98
    invoke-static {v10, v9}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget v4, v0, Lt2/a;->g:I

    .line 102
    .line 103
    const-wide/16 v8, 0x4e20

    .line 104
    .line 105
    const/4 v5, -0x1

    .line 106
    if-nez v4, :cond_a

    .line 107
    .line 108
    :try_start_0
    move-object v4, v1

    .line 109
    check-cast v4, Ls2/j;

    .line 110
    .line 111
    invoke-virtual {v0, v4}, Lt2/a;->b(Ls2/j;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    iput v4, v0, Lt2/a;->f:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    iput v4, v0, Lt2/a;->g:I

    .line 118
    .line 119
    iget v10, v0, Lt2/a;->i:I

    .line 120
    .line 121
    if-ne v10, v5, :cond_6

    .line 122
    .line 123
    move-object v10, v1

    .line 124
    check-cast v10, Ls2/j;

    .line 125
    .line 126
    iget-wide v10, v10, Ls2/j;->d:J

    .line 127
    .line 128
    iput-wide v10, v0, Lt2/a;->h:J

    .line 129
    .line 130
    iput v4, v0, Lt2/a;->i:I

    .line 131
    .line 132
    :cond_6
    iget v10, v0, Lt2/a;->i:I

    .line 133
    .line 134
    if-ne v10, v4, :cond_7

    .line 135
    .line 136
    iget v10, v0, Lt2/a;->j:I

    .line 137
    .line 138
    add-int/2addr v10, v3

    .line 139
    iput v10, v0, Lt2/a;->j:I

    .line 140
    .line 141
    :cond_7
    iget-object v10, v0, Lt2/a;->o:Ls2/w;

    .line 142
    .line 143
    instance-of v11, v10, Ls2/u;

    .line 144
    .line 145
    if-eqz v11, :cond_a

    .line 146
    .line 147
    check-cast v10, Ls2/u;

    .line 148
    .line 149
    iget-wide v11, v0, Lt2/a;->k:J

    .line 150
    .line 151
    iget-wide v13, v0, Lt2/a;->e:J

    .line 152
    .line 153
    add-long/2addr v11, v13

    .line 154
    add-long/2addr v11, v8

    .line 155
    move-object v13, v1

    .line 156
    check-cast v13, Ls2/j;

    .line 157
    .line 158
    iget-wide v13, v13, Ls2/j;->d:J

    .line 159
    .line 160
    move-wide v15, v6

    .line 161
    int-to-long v6, v4

    .line 162
    add-long/2addr v13, v6

    .line 163
    iget-object v4, v10, Ls2/u;->b:LQ1/l;

    .line 164
    .line 165
    iget v6, v4, LQ1/l;->b:I

    .line 166
    .line 167
    if-nez v6, :cond_8

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_8
    sub-int/2addr v6, v3

    .line 171
    invoke-virtual {v4, v6}, LQ1/l;->c(I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    sub-long v6, v11, v6

    .line 176
    .line 177
    const-wide/32 v17, 0x186a0

    .line 178
    .line 179
    .line 180
    cmp-long v4, v6, v17

    .line 181
    .line 182
    if-gez v4, :cond_9

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    :goto_4
    invoke-virtual {v10, v11, v12, v13, v14}, Ls2/u;->a(JJ)V

    .line 186
    .line 187
    .line 188
    :goto_5
    iget-boolean v4, v0, Lt2/a;->p:Z

    .line 189
    .line 190
    if-eqz v4, :cond_b

    .line 191
    .line 192
    iget-wide v6, v0, Lt2/a;->q:J

    .line 193
    .line 194
    sub-long/2addr v6, v11

    .line 195
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    cmp-long v4, v6, v8

    .line 200
    .line 201
    if-gez v4, :cond_b

    .line 202
    .line 203
    iput-boolean v2, v0, Lt2/a;->p:Z

    .line 204
    .line 205
    iget-object v4, v0, Lt2/a;->m:Ls2/C;

    .line 206
    .line 207
    iput-object v4, v0, Lt2/a;->n:Ls2/C;

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :cond_a
    move-wide v15, v6

    .line 211
    goto :goto_7

    .line 212
    :catch_0
    move-wide v15, v6

    .line 213
    :goto_6
    move v4, v5

    .line 214
    goto :goto_9

    .line 215
    :cond_b
    :goto_7
    iget-object v4, v0, Lt2/a;->n:Ls2/C;

    .line 216
    .line 217
    iget v6, v0, Lt2/a;->g:I

    .line 218
    .line 219
    invoke-interface {v4, v1, v6, v3}, Ls2/C;->d(LN1/g;IZ)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-ne v4, v5, :cond_c

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_c
    iget v6, v0, Lt2/a;->g:I

    .line 227
    .line 228
    sub-int/2addr v6, v4

    .line 229
    iput v6, v0, Lt2/a;->g:I

    .line 230
    .line 231
    if-lez v6, :cond_d

    .line 232
    .line 233
    :goto_8
    move v4, v2

    .line 234
    goto :goto_9

    .line 235
    :cond_d
    iget-object v4, v0, Lt2/a;->n:Ls2/C;

    .line 236
    .line 237
    iget-wide v6, v0, Lt2/a;->k:J

    .line 238
    .line 239
    iget-wide v10, v0, Lt2/a;->e:J

    .line 240
    .line 241
    add-long v18, v6, v10

    .line 242
    .line 243
    iget v6, v0, Lt2/a;->f:I

    .line 244
    .line 245
    const/16 v20, 0x1

    .line 246
    .line 247
    const/16 v22, 0x0

    .line 248
    .line 249
    const/16 v23, 0x0

    .line 250
    .line 251
    move-object/from16 v17, v4

    .line 252
    .line 253
    move/from16 v21, v6

    .line 254
    .line 255
    invoke-interface/range {v17 .. v23}, Ls2/C;->a(JIIILs2/B;)V

    .line 256
    .line 257
    .line 258
    iget-wide v6, v0, Lt2/a;->e:J

    .line 259
    .line 260
    add-long/2addr v6, v8

    .line 261
    iput-wide v6, v0, Lt2/a;->e:J

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :goto_9
    check-cast v1, Ls2/j;

    .line 265
    .line 266
    iget-object v6, v0, Lt2/a;->o:Ls2/w;

    .line 267
    .line 268
    if-eqz v6, :cond_e

    .line 269
    .line 270
    goto :goto_d

    .line 271
    :cond_e
    iget v6, v0, Lt2/a;->b:I

    .line 272
    .line 273
    and-int/lit8 v7, v6, 0x4

    .line 274
    .line 275
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    if-eqz v7, :cond_f

    .line 281
    .line 282
    new-instance v1, Ls2/u;

    .line 283
    .line 284
    iget-wide v6, v0, Lt2/a;->h:J

    .line 285
    .line 286
    new-array v8, v3, [J

    .line 287
    .line 288
    aput-wide v6, v8, v2

    .line 289
    .line 290
    new-array v3, v3, [J

    .line 291
    .line 292
    aput-wide v15, v3, v2

    .line 293
    .line 294
    invoke-direct {v1, v8, v3, v10, v11}, Ls2/u;-><init>([J[JJ)V

    .line 295
    .line 296
    .line 297
    iput-object v1, v0, Lt2/a;->o:Ls2/w;

    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_f
    and-int/lit8 v7, v6, 0x1

    .line 301
    .line 302
    if-eqz v7, :cond_13

    .line 303
    .line 304
    iget v7, v0, Lt2/a;->i:I

    .line 305
    .line 306
    if-eq v7, v5, :cond_10

    .line 307
    .line 308
    iget v12, v0, Lt2/a;->f:I

    .line 309
    .line 310
    if-eq v7, v12, :cond_10

    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_10
    iget v10, v0, Lt2/a;->j:I

    .line 314
    .line 315
    const/16 v11, 0x14

    .line 316
    .line 317
    if-ge v10, v11, :cond_11

    .line 318
    .line 319
    if-ne v4, v5, :cond_14

    .line 320
    .line 321
    :cond_11
    and-int/lit8 v6, v6, 0x2

    .line 322
    .line 323
    if-eqz v6, :cond_12

    .line 324
    .line 325
    move/from16 v19, v3

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_12
    move/from16 v19, v2

    .line 329
    .line 330
    :goto_a
    int-to-long v2, v7

    .line 331
    const-wide/32 v10, 0x7a1200

    .line 332
    .line 333
    .line 334
    mul-long/2addr v2, v10

    .line 335
    div-long/2addr v2, v8

    .line 336
    long-to-int v2, v2

    .line 337
    new-instance v12, Ls2/i;

    .line 338
    .line 339
    iget-wide v8, v0, Lt2/a;->h:J

    .line 340
    .line 341
    iget-wide v13, v1, Ls2/j;->c:J

    .line 342
    .line 343
    move/from16 v17, v2

    .line 344
    .line 345
    move/from16 v18, v7

    .line 346
    .line 347
    move-wide v15, v8

    .line 348
    invoke-direct/range {v12 .. v19}, Ls2/i;-><init>(JJIIZ)V

    .line 349
    .line 350
    .line 351
    iput-object v12, v0, Lt2/a;->o:Ls2/w;

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_13
    :goto_b
    new-instance v1, Ls2/q;

    .line 355
    .line 356
    invoke-direct {v1, v10, v11}, Ls2/q;-><init>(J)V

    .line 357
    .line 358
    .line 359
    iput-object v1, v0, Lt2/a;->o:Ls2/w;

    .line 360
    .line 361
    :cond_14
    :goto_c
    iget-object v1, v0, Lt2/a;->o:Ls2/w;

    .line 362
    .line 363
    if-eqz v1, :cond_15

    .line 364
    .line 365
    iget-object v2, v0, Lt2/a;->l:Ls2/o;

    .line 366
    .line 367
    invoke-interface {v2, v1}, Ls2/o;->s(Ls2/w;)V

    .line 368
    .line 369
    .line 370
    :cond_15
    :goto_d
    if-ne v4, v5, :cond_16

    .line 371
    .line 372
    iget-object v1, v0, Lt2/a;->o:Ls2/w;

    .line 373
    .line 374
    instance-of v2, v1, Ls2/u;

    .line 375
    .line 376
    if-eqz v2, :cond_16

    .line 377
    .line 378
    iget-wide v2, v0, Lt2/a;->k:J

    .line 379
    .line 380
    iget-wide v5, v0, Lt2/a;->e:J

    .line 381
    .line 382
    add-long/2addr v2, v5

    .line 383
    move-object v5, v1

    .line 384
    check-cast v5, Ls2/u;

    .line 385
    .line 386
    iput-wide v2, v5, Ls2/u;->c:J

    .line 387
    .line 388
    iget-object v2, v0, Lt2/a;->l:Ls2/o;

    .line 389
    .line 390
    invoke-interface {v2, v1}, Ls2/o;->s(Ls2/w;)V

    .line 391
    .line 392
    .line 393
    :cond_16
    return v4
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
