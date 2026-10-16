.class public final LN1/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final q:Ljava/lang/Object;

.field public static final r:LN1/w;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:LN1/w;

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:J

.field public g:J

.field public h:Z

.field public i:Z

.field public j:LN1/s;

.field public k:Z

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const/4 v0, 0x3

    .line 2
    new-instance v1, Ljava/lang/Object;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sput-object v1, LN1/M;->q:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v1, LJ5/n;

    .line 10
    .line 11
    invoke-direct {v1, v0}, LJ5/n;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 15
    .line 16
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 17
    .line 18
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 21
    .line 22
    new-instance v2, LE5/Y;

    .line 23
    .line 24
    invoke-direct {v2}, LE5/Y;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v15, LN1/u;->a:LN1/u;

    .line 28
    .line 29
    sget-object v4, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    new-instance v3, LN1/t;

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct/range {v3 .. v11}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 44
    .line 45
    .line 46
    move-object v12, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v12, v6

    .line 49
    :goto_0
    new-instance v9, LN1/w;

    .line 50
    .line 51
    new-instance v11, LN1/r;

    .line 52
    .line 53
    invoke-direct {v11, v1}, LN1/q;-><init>(LJ5/n;)V

    .line 54
    .line 55
    .line 56
    new-instance v13, LN1/s;

    .line 57
    .line 58
    invoke-direct {v13, v2}, LN1/s;-><init>(LE5/Y;)V

    .line 59
    .line 60
    .line 61
    sget-object v14, LN1/z;->B:LN1/z;

    .line 62
    .line 63
    const-string v10, "androidx.media3.common.Timeline"

    .line 64
    .line 65
    invoke-direct/range {v9 .. v15}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 66
    .line 67
    .line 68
    sput-object v9, LN1/M;->r:LN1/w;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    const/4 v2, 0x2

    .line 72
    const/4 v3, 0x4

    .line 73
    const/4 v4, 0x5

    .line 74
    invoke-static {v1, v2, v0, v3, v4}, LN0/a;->k(IIIII)V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    const/4 v1, 0x7

    .line 79
    const/16 v2, 0x8

    .line 80
    .line 81
    const/16 v3, 0x9

    .line 82
    .line 83
    const/16 v4, 0xa

    .line 84
    .line 85
    invoke-static {v0, v1, v2, v3, v4}, LN0/a;->k(IIIII)V

    .line 86
    .line 87
    .line 88
    const/16 v0, 0xb

    .line 89
    .line 90
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 91
    .line 92
    .line 93
    const/16 v0, 0xc

    .line 94
    .line 95
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 96
    .line 97
    .line 98
    const/16 v0, 0xd

    .line 99
    .line 100
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LN1/M;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, LN1/M;->a:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, LN1/M;->r:LN1/w;

    .line 9
    .line 10
    iput-object v0, p0, LN1/M;->c:LN1/w;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LN1/M;->j:LN1/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final b(LN1/w;Ljava/lang/Object;JJJZZLN1/s;JJIJ)V
    .locals 1

    .line 1
    sget-object v0, LN1/M;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object v0, p0, LN1/M;->a:Ljava/lang/Object;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, LN1/M;->r:LN1/w;

    .line 10
    .line 11
    :goto_0
    iput-object v0, p0, LN1/M;->c:LN1/w;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p1, LN1/t;->e:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_1
    iput-object p1, p0, LN1/M;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, p0, LN1/M;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-wide p3, p0, LN1/M;->e:J

    .line 28
    .line 29
    iput-wide p5, p0, LN1/M;->f:J

    .line 30
    .line 31
    iput-wide p7, p0, LN1/M;->g:J

    .line 32
    .line 33
    iput-boolean p9, p0, LN1/M;->h:Z

    .line 34
    .line 35
    iput-boolean p10, p0, LN1/M;->i:Z

    .line 36
    .line 37
    iput-object p11, p0, LN1/M;->j:LN1/s;

    .line 38
    .line 39
    iput-wide p12, p0, LN1/M;->l:J

    .line 40
    .line 41
    move-wide p1, p14

    .line 42
    iput-wide p1, p0, LN1/M;->m:J

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    iput p1, p0, LN1/M;->n:I

    .line 46
    .line 47
    move/from16 p2, p16

    .line 48
    .line 49
    iput p2, p0, LN1/M;->o:I

    .line 50
    .line 51
    move-wide/from16 p2, p17

    .line 52
    .line 53
    iput-wide p2, p0, LN1/M;->p:J

    .line 54
    .line 55
    iput-boolean p1, p0, LN1/M;->k:Z

    .line 56
    .line 57
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LN1/M;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_1
    check-cast p1, LN1/M;

    .line 22
    .line 23
    iget-object v0, p0, LN1/M;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p1, LN1/M;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, LN1/M;->c:LN1/w;

    .line 34
    .line 35
    iget-object v1, p1, LN1/M;->c:LN1/w;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, LN1/M;->d:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, p1, LN1/M;->d:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, LN1/M;->j:LN1/s;

    .line 54
    .line 55
    iget-object v1, p1, LN1/M;->j:LN1/s;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-wide v0, p0, LN1/M;->e:J

    .line 64
    .line 65
    iget-wide v2, p1, LN1/M;->e:J

    .line 66
    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    iget-wide v0, p0, LN1/M;->f:J

    .line 72
    .line 73
    iget-wide v2, p1, LN1/M;->f:J

    .line 74
    .line 75
    cmp-long v0, v0, v2

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    iget-wide v0, p0, LN1/M;->g:J

    .line 80
    .line 81
    iget-wide v2, p1, LN1/M;->g:J

    .line 82
    .line 83
    cmp-long v0, v0, v2

    .line 84
    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    iget-boolean v0, p0, LN1/M;->h:Z

    .line 88
    .line 89
    iget-boolean v1, p1, LN1/M;->h:Z

    .line 90
    .line 91
    if-ne v0, v1, :cond_2

    .line 92
    .line 93
    iget-boolean v0, p0, LN1/M;->i:Z

    .line 94
    .line 95
    iget-boolean v1, p1, LN1/M;->i:Z

    .line 96
    .line 97
    if-ne v0, v1, :cond_2

    .line 98
    .line 99
    iget-boolean v0, p0, LN1/M;->k:Z

    .line 100
    .line 101
    iget-boolean v1, p1, LN1/M;->k:Z

    .line 102
    .line 103
    if-ne v0, v1, :cond_2

    .line 104
    .line 105
    iget-wide v0, p0, LN1/M;->l:J

    .line 106
    .line 107
    iget-wide v2, p1, LN1/M;->l:J

    .line 108
    .line 109
    cmp-long v0, v0, v2

    .line 110
    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    iget-wide v0, p0, LN1/M;->m:J

    .line 114
    .line 115
    iget-wide v2, p1, LN1/M;->m:J

    .line 116
    .line 117
    cmp-long v0, v0, v2

    .line 118
    .line 119
    if-nez v0, :cond_2

    .line 120
    .line 121
    iget v0, p0, LN1/M;->n:I

    .line 122
    .line 123
    iget v1, p1, LN1/M;->n:I

    .line 124
    .line 125
    if-ne v0, v1, :cond_2

    .line 126
    .line 127
    iget v0, p0, LN1/M;->o:I

    .line 128
    .line 129
    iget v1, p1, LN1/M;->o:I

    .line 130
    .line 131
    if-ne v0, v1, :cond_2

    .line 132
    .line 133
    iget-wide v0, p0, LN1/M;->p:J

    .line 134
    .line 135
    iget-wide v2, p1, LN1/M;->p:J

    .line 136
    .line 137
    cmp-long p1, v0, v2

    .line 138
    .line 139
    if-nez p1, :cond_2

    .line 140
    .line 141
    :goto_0
    const/4 p1, 0x1

    .line 142
    return p1

    .line 143
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 144
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, LN1/M;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, LN1/M;->c:LN1/w;

    .line 12
    .line 13
    invoke-virtual {v1}, LN1/w;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, LN1/M;->d:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    :goto_0
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x1f

    .line 33
    .line 34
    iget-object v0, p0, LN1/M;->j:LN1/s;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0}, LN1/s;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    :goto_1
    add-int/2addr v1, v2

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget-wide v2, p0, LN1/M;->e:J

    .line 47
    .line 48
    const/16 v0, 0x20

    .line 49
    .line 50
    ushr-long v4, v2, v0

    .line 51
    .line 52
    xor-long/2addr v2, v4

    .line 53
    long-to-int v2, v2

    .line 54
    add-int/2addr v1, v2

    .line 55
    mul-int/lit8 v1, v1, 0x1f

    .line 56
    .line 57
    iget-wide v2, p0, LN1/M;->f:J

    .line 58
    .line 59
    ushr-long v4, v2, v0

    .line 60
    .line 61
    xor-long/2addr v2, v4

    .line 62
    long-to-int v2, v2

    .line 63
    add-int/2addr v1, v2

    .line 64
    mul-int/lit8 v1, v1, 0x1f

    .line 65
    .line 66
    iget-wide v2, p0, LN1/M;->g:J

    .line 67
    .line 68
    ushr-long v4, v2, v0

    .line 69
    .line 70
    xor-long/2addr v2, v4

    .line 71
    long-to-int v2, v2

    .line 72
    add-int/2addr v1, v2

    .line 73
    mul-int/lit8 v1, v1, 0x1f

    .line 74
    .line 75
    iget-boolean v2, p0, LN1/M;->h:Z

    .line 76
    .line 77
    add-int/2addr v1, v2

    .line 78
    mul-int/lit8 v1, v1, 0x1f

    .line 79
    .line 80
    iget-boolean v2, p0, LN1/M;->i:Z

    .line 81
    .line 82
    add-int/2addr v1, v2

    .line 83
    mul-int/lit8 v1, v1, 0x1f

    .line 84
    .line 85
    iget-boolean v2, p0, LN1/M;->k:Z

    .line 86
    .line 87
    add-int/2addr v1, v2

    .line 88
    mul-int/lit8 v1, v1, 0x1f

    .line 89
    .line 90
    iget-wide v2, p0, LN1/M;->l:J

    .line 91
    .line 92
    ushr-long v4, v2, v0

    .line 93
    .line 94
    xor-long/2addr v2, v4

    .line 95
    long-to-int v2, v2

    .line 96
    add-int/2addr v1, v2

    .line 97
    mul-int/lit8 v1, v1, 0x1f

    .line 98
    .line 99
    iget-wide v2, p0, LN1/M;->m:J

    .line 100
    .line 101
    ushr-long v4, v2, v0

    .line 102
    .line 103
    xor-long/2addr v2, v4

    .line 104
    long-to-int v2, v2

    .line 105
    add-int/2addr v1, v2

    .line 106
    mul-int/lit8 v1, v1, 0x1f

    .line 107
    .line 108
    iget v2, p0, LN1/M;->n:I

    .line 109
    .line 110
    add-int/2addr v1, v2

    .line 111
    mul-int/lit8 v1, v1, 0x1f

    .line 112
    .line 113
    iget v2, p0, LN1/M;->o:I

    .line 114
    .line 115
    add-int/2addr v1, v2

    .line 116
    mul-int/lit8 v1, v1, 0x1f

    .line 117
    .line 118
    iget-wide v2, p0, LN1/M;->p:J

    .line 119
    .line 120
    ushr-long v4, v2, v0

    .line 121
    .line 122
    xor-long/2addr v2, v4

    .line 123
    long-to-int v0, v2

    .line 124
    add-int/2addr v1, v0

    .line 125
    return v1
.end method
