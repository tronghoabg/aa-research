.class public final LE5/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/h;


# static fields
.field public static final q:Ljava/lang/Object;

.field public static final r:Ljava/lang/Object;

.field public static final s:LE5/d0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:LE5/d0;

.field public d:J

.field public e:J

.field public f:J

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:LE5/Z;

.field public k:Z

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:J


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE5/I0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LE5/I0;->r:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, LE5/V;

    .line 16
    .line 17
    invoke-direct {v0}, LE5/V;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 21
    .line 22
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 23
    .line 24
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 27
    .line 28
    sget-object v9, LE5/b0;->c:LE5/b0;

    .line 29
    .line 30
    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    new-instance v5, LE5/a0;

    .line 36
    .line 37
    invoke-direct {v5, v3, v4, v1, v2}, LE5/a0;-><init>(Landroid/net/Uri;Lxg/g;Ljava/util/List;Ll8/K;)V

    .line 38
    .line 39
    .line 40
    move-object v6, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v6, v4

    .line 43
    :goto_0
    new-instance v3, LE5/d0;

    .line 44
    .line 45
    new-instance v5, LE5/X;

    .line 46
    .line 47
    invoke-direct {v5, v0}, LE5/W;-><init>(LE5/V;)V

    .line 48
    .line 49
    .line 50
    new-instance v7, LE5/Z;

    .line 51
    .line 52
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const v17, -0x800001

    .line 58
    .line 59
    .line 60
    move-wide v13, v11

    .line 61
    move-wide v15, v11

    .line 62
    move/from16 v18, v17

    .line 63
    .line 64
    move-object v10, v7

    .line 65
    invoke-direct/range {v10 .. v18}, LE5/Z;-><init>(JJJFF)V

    .line 66
    .line 67
    .line 68
    sget-object v8, LE5/f0;->G:LE5/f0;

    .line 69
    .line 70
    const-string v4, "com.google.android.exoplayer2.Timeline"

    .line 71
    .line 72
    invoke-direct/range {v3 .. v9}, LE5/d0;-><init>(Ljava/lang/String;LE5/X;LE5/a0;LE5/Z;LE5/f0;LE5/b0;)V

    .line 73
    .line 74
    .line 75
    sput-object v3, LE5/I0;->s:LE5/d0;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LE5/I0;->q:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, LE5/I0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, LE5/I0;->s:LE5/d0;

    .line 9
    .line 10
    iput-object v0, p0, LE5/I0;->c:LE5/d0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LE5/I0;->i:Z

    .line 2
    .line 3
    iget-object v1, p0, LE5/I0;->j:LE5/Z;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move v0, v2

    .line 17
    :goto_1
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LE5/I0;->j:LE5/Z;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    return v3

    .line 25
    :cond_2
    return v2
.end method

.method public final b(Ljava/lang/Object;LE5/d0;JJJZZLE5/Z;JJIIJ)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/I0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    move-object p1, p2

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, LE5/I0;->s:LE5/d0;

    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, LE5/I0;->c:LE5/d0;

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget-object p1, p2, LE5/d0;->b:LE5/a0;

    .line 14
    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, LE5/I0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-wide p3, p0, LE5/I0;->d:J

    .line 19
    .line 20
    iput-wide p5, p0, LE5/I0;->e:J

    .line 21
    .line 22
    iput-wide p7, p0, LE5/I0;->f:J

    .line 23
    .line 24
    iput-boolean p9, p0, LE5/I0;->g:Z

    .line 25
    .line 26
    iput-boolean p10, p0, LE5/I0;->h:Z

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    if-eqz p11, :cond_2

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move p2, p1

    .line 34
    :goto_1
    iput-boolean p2, p0, LE5/I0;->i:Z

    .line 35
    .line 36
    iput-object p11, p0, LE5/I0;->j:LE5/Z;

    .line 37
    .line 38
    iput-wide p12, p0, LE5/I0;->l:J

    .line 39
    .line 40
    iput-wide p14, p0, LE5/I0;->m:J

    .line 41
    .line 42
    move/from16 p2, p16

    .line 43
    .line 44
    iput p2, p0, LE5/I0;->n:I

    .line 45
    .line 46
    move/from16 p2, p17

    .line 47
    .line 48
    iput p2, p0, LE5/I0;->o:I

    .line 49
    .line 50
    move-wide/from16 p2, p18

    .line 51
    .line 52
    iput-wide p2, p0, LE5/I0;->p:J

    .line 53
    .line 54
    iput-boolean p1, p0, LE5/I0;->k:Z

    .line 55
    .line 56
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
    const-class v1, LE5/I0;

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
    check-cast p1, LE5/I0;

    .line 22
    .line 23
    iget-object v0, p0, LE5/I0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v1, p1, LE5/I0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, LE5/I0;->c:LE5/d0;

    .line 34
    .line 35
    iget-object v1, p1, LE5/I0;->c:LE5/d0;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, LE5/I0;->j:LE5/Z;

    .line 44
    .line 45
    iget-object v1, p1, LE5/I0;->j:LE5/Z;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-wide v0, p0, LE5/I0;->d:J

    .line 54
    .line 55
    iget-wide v2, p1, LE5/I0;->d:J

    .line 56
    .line 57
    cmp-long v0, v0, v2

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    iget-wide v0, p0, LE5/I0;->e:J

    .line 62
    .line 63
    iget-wide v2, p1, LE5/I0;->e:J

    .line 64
    .line 65
    cmp-long v0, v0, v2

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    iget-wide v0, p0, LE5/I0;->f:J

    .line 70
    .line 71
    iget-wide v2, p1, LE5/I0;->f:J

    .line 72
    .line 73
    cmp-long v0, v0, v2

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    iget-boolean v0, p0, LE5/I0;->g:Z

    .line 78
    .line 79
    iget-boolean v1, p1, LE5/I0;->g:Z

    .line 80
    .line 81
    if-ne v0, v1, :cond_2

    .line 82
    .line 83
    iget-boolean v0, p0, LE5/I0;->h:Z

    .line 84
    .line 85
    iget-boolean v1, p1, LE5/I0;->h:Z

    .line 86
    .line 87
    if-ne v0, v1, :cond_2

    .line 88
    .line 89
    iget-boolean v0, p0, LE5/I0;->k:Z

    .line 90
    .line 91
    iget-boolean v1, p1, LE5/I0;->k:Z

    .line 92
    .line 93
    if-ne v0, v1, :cond_2

    .line 94
    .line 95
    iget-wide v0, p0, LE5/I0;->l:J

    .line 96
    .line 97
    iget-wide v2, p1, LE5/I0;->l:J

    .line 98
    .line 99
    cmp-long v0, v0, v2

    .line 100
    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    iget-wide v0, p0, LE5/I0;->m:J

    .line 104
    .line 105
    iget-wide v2, p1, LE5/I0;->m:J

    .line 106
    .line 107
    cmp-long v0, v0, v2

    .line 108
    .line 109
    if-nez v0, :cond_2

    .line 110
    .line 111
    iget v0, p0, LE5/I0;->n:I

    .line 112
    .line 113
    iget v1, p1, LE5/I0;->n:I

    .line 114
    .line 115
    if-ne v0, v1, :cond_2

    .line 116
    .line 117
    iget v0, p0, LE5/I0;->o:I

    .line 118
    .line 119
    iget v1, p1, LE5/I0;->o:I

    .line 120
    .line 121
    if-ne v0, v1, :cond_2

    .line 122
    .line 123
    iget-wide v0, p0, LE5/I0;->p:J

    .line 124
    .line 125
    iget-wide v2, p1, LE5/I0;->p:J

    .line 126
    .line 127
    cmp-long p1, v0, v2

    .line 128
    .line 129
    if-nez p1, :cond_2

    .line 130
    .line 131
    :goto_0
    const/4 p1, 0x1

    .line 132
    return p1

    .line 133
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 134
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, LE5/I0;->a:Ljava/lang/Object;

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
    iget-object v1, p0, LE5/I0;->c:LE5/d0;

    .line 12
    .line 13
    invoke-virtual {v1}, LE5/d0;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit16 v1, v1, 0x3c1

    .line 19
    .line 20
    iget-object v0, p0, LE5/I0;->j:LE5/Z;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, LE5/Z;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :goto_0
    add-int/2addr v1, v0

    .line 31
    mul-int/lit8 v1, v1, 0x1f

    .line 32
    .line 33
    iget-wide v2, p0, LE5/I0;->d:J

    .line 34
    .line 35
    const/16 v0, 0x20

    .line 36
    .line 37
    ushr-long v4, v2, v0

    .line 38
    .line 39
    xor-long/2addr v2, v4

    .line 40
    long-to-int v2, v2

    .line 41
    add-int/2addr v1, v2

    .line 42
    mul-int/lit8 v1, v1, 0x1f

    .line 43
    .line 44
    iget-wide v2, p0, LE5/I0;->e:J

    .line 45
    .line 46
    ushr-long v4, v2, v0

    .line 47
    .line 48
    xor-long/2addr v2, v4

    .line 49
    long-to-int v2, v2

    .line 50
    add-int/2addr v1, v2

    .line 51
    mul-int/lit8 v1, v1, 0x1f

    .line 52
    .line 53
    iget-wide v2, p0, LE5/I0;->f:J

    .line 54
    .line 55
    ushr-long v4, v2, v0

    .line 56
    .line 57
    xor-long/2addr v2, v4

    .line 58
    long-to-int v2, v2

    .line 59
    add-int/2addr v1, v2

    .line 60
    mul-int/lit8 v1, v1, 0x1f

    .line 61
    .line 62
    iget-boolean v2, p0, LE5/I0;->g:Z

    .line 63
    .line 64
    add-int/2addr v1, v2

    .line 65
    mul-int/lit8 v1, v1, 0x1f

    .line 66
    .line 67
    iget-boolean v2, p0, LE5/I0;->h:Z

    .line 68
    .line 69
    add-int/2addr v1, v2

    .line 70
    mul-int/lit8 v1, v1, 0x1f

    .line 71
    .line 72
    iget-boolean v2, p0, LE5/I0;->k:Z

    .line 73
    .line 74
    add-int/2addr v1, v2

    .line 75
    mul-int/lit8 v1, v1, 0x1f

    .line 76
    .line 77
    iget-wide v2, p0, LE5/I0;->l:J

    .line 78
    .line 79
    ushr-long v4, v2, v0

    .line 80
    .line 81
    xor-long/2addr v2, v4

    .line 82
    long-to-int v2, v2

    .line 83
    add-int/2addr v1, v2

    .line 84
    mul-int/lit8 v1, v1, 0x1f

    .line 85
    .line 86
    iget-wide v2, p0, LE5/I0;->m:J

    .line 87
    .line 88
    ushr-long v4, v2, v0

    .line 89
    .line 90
    xor-long/2addr v2, v4

    .line 91
    long-to-int v2, v2

    .line 92
    add-int/2addr v1, v2

    .line 93
    mul-int/lit8 v1, v1, 0x1f

    .line 94
    .line 95
    iget v2, p0, LE5/I0;->n:I

    .line 96
    .line 97
    add-int/2addr v1, v2

    .line 98
    mul-int/lit8 v1, v1, 0x1f

    .line 99
    .line 100
    iget v2, p0, LE5/I0;->o:I

    .line 101
    .line 102
    add-int/2addr v1, v2

    .line 103
    mul-int/lit8 v1, v1, 0x1f

    .line 104
    .line 105
    iget-wide v2, p0, LE5/I0;->p:J

    .line 106
    .line 107
    ushr-long v4, v2, v0

    .line 108
    .line 109
    xor-long/2addr v2, v4

    .line 110
    long-to-int v0, v2

    .line 111
    add-int/2addr v1, v0

    .line 112
    return v1
.end method
