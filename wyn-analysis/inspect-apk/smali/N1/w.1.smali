.class public final LN1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LN1/t;

.field public final c:LN1/s;

.field public final d:LN1/z;

.field public final e:LN1/r;

.field public final f:LN1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    new-instance v1, LJ5/n;

    .line 3
    .line 4
    invoke-direct {v1, v0}, LJ5/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 8
    .line 9
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 10
    .line 11
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 14
    .line 15
    new-instance v2, LE5/Y;

    .line 16
    .line 17
    invoke-direct {v2}, LE5/Y;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v3, LN1/u;->a:LN1/u;

    .line 21
    .line 22
    invoke-virtual {v1}, LJ5/n;->a()LN1/r;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, LE5/Y;->b()LN1/s;

    .line 26
    .line 27
    .line 28
    sget-object v1, LN1/z;->B:LN1/z;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x2

    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-static {v1, v2, v3, v0, v4}, LN0/a;->k(IIIII)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x5

    .line 38
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN1/w;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, LN1/w;->b:LN1/t;

    .line 7
    .line 8
    iput-object p4, p0, LN1/w;->c:LN1/s;

    .line 9
    .line 10
    iput-object p5, p0, LN1/w;->d:LN1/z;

    .line 11
    .line 12
    iput-object p2, p0, LN1/w;->e:LN1/r;

    .line 13
    .line 14
    iput-object p6, p0, LN1/w;->f:LN1/u;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()LN1/p;
    .locals 5

    .line 1
    new-instance v0, LN1/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LJ5/n;

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-direct {v1, v2}, LJ5/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, LN1/p;->d:LJ5/n;

    .line 13
    .line 14
    new-instance v1, Lza/a;

    .line 15
    .line 16
    invoke-direct {v1}, Lza/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, LN1/p;->e:Lza/a;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 22
    .line 23
    iput-object v1, v0, LN1/p;->f:Ljava/util/List;

    .line 24
    .line 25
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 26
    .line 27
    iput-object v1, v0, LN1/p;->g:Ll8/K;

    .line 28
    .line 29
    new-instance v1, LE5/Y;

    .line 30
    .line 31
    invoke-direct {v1}, LE5/Y;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, LN1/p;->k:LE5/Y;

    .line 35
    .line 36
    sget-object v1, LN1/u;->a:LN1/u;

    .line 37
    .line 38
    iput-object v1, v0, LN1/p;->l:LN1/u;

    .line 39
    .line 40
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide v1, v0, LN1/p;->i:J

    .line 46
    .line 47
    iget-object v1, p0, LN1/w;->e:LN1/r;

    .line 48
    .line 49
    new-instance v2, LJ5/n;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-wide v3, v1, LN1/q;->a:J

    .line 55
    .line 56
    iput-wide v3, v2, LJ5/n;->a:J

    .line 57
    .line 58
    iput-object v2, v0, LN1/p;->d:LJ5/n;

    .line 59
    .line 60
    iget-object v1, p0, LN1/w;->a:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v1, v0, LN1/p;->a:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p0, LN1/w;->d:LN1/z;

    .line 65
    .line 66
    iput-object v1, v0, LN1/p;->j:LN1/z;

    .line 67
    .line 68
    iget-object v1, p0, LN1/w;->c:LN1/s;

    .line 69
    .line 70
    invoke-virtual {v1}, LN1/s;->a()LE5/Y;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, v0, LN1/p;->k:LE5/Y;

    .line 75
    .line 76
    iget-object v1, p0, LN1/w;->f:LN1/u;

    .line 77
    .line 78
    iput-object v1, v0, LN1/p;->l:LN1/u;

    .line 79
    .line 80
    iget-object v1, p0, LN1/w;->b:LN1/t;

    .line 81
    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    iget-object v2, v1, LN1/t;->b:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v2, v0, LN1/p;->c:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v2, v1, LN1/t;->a:Landroid/net/Uri;

    .line 89
    .line 90
    iput-object v2, v0, LN1/p;->b:Landroid/net/Uri;

    .line 91
    .line 92
    iget-object v2, v1, LN1/t;->c:Ljava/util/List;

    .line 93
    .line 94
    iput-object v2, v0, LN1/p;->f:Ljava/util/List;

    .line 95
    .line 96
    iget-object v2, v1, LN1/t;->d:Ll8/K;

    .line 97
    .line 98
    iput-object v2, v0, LN1/p;->g:Ll8/K;

    .line 99
    .line 100
    iget-object v2, v1, LN1/t;->e:Ljava/lang/String;

    .line 101
    .line 102
    iput-object v2, v0, LN1/p;->h:Ljava/lang/String;

    .line 103
    .line 104
    new-instance v2, Lza/a;

    .line 105
    .line 106
    invoke-direct {v2}, Lza/a;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v2, v0, LN1/p;->e:Lza/a;

    .line 110
    .line 111
    iget-wide v1, v1, LN1/t;->f:J

    .line 112
    .line 113
    iput-wide v1, v0, LN1/p;->i:J

    .line 114
    .line 115
    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, LN1/w;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, LN1/w;

    .line 10
    .line 11
    iget-object v0, p1, LN1/w;->a:Ljava/lang/String;

    .line 12
    .line 13
    sget v1, LQ1/x;->a:I

    .line 14
    .line 15
    iget-object v1, p0, LN1/w;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, LN1/w;->e:LN1/r;

    .line 24
    .line 25
    iget-object v1, p1, LN1/w;->e:LN1/r;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, LN1/q;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, LN1/w;->b:LN1/t;

    .line 34
    .line 35
    iget-object v1, p1, LN1/w;->b:LN1/t;

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
    iget-object v0, p0, LN1/w;->c:LN1/s;

    .line 44
    .line 45
    iget-object v1, p1, LN1/w;->c:LN1/s;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, LN1/s;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, LN1/w;->d:LN1/z;

    .line 54
    .line 55
    iget-object v1, p1, LN1/w;->d:LN1/z;

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
    iget-object v0, p0, LN1/w;->f:LN1/u;

    .line 64
    .line 65
    iget-object p1, p1, LN1/w;->f:LN1/u;

    .line 66
    .line 67
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    :goto_0
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 76
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LN1/w;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LN1/w;->b:LN1/t;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, LN1/t;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, LN1/w;->c:LN1/s;

    .line 23
    .line 24
    invoke-virtual {v1}, LN1/s;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, LN1/w;->e:LN1/r;

    .line 32
    .line 33
    invoke-virtual {v0}, LN1/q;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, LN1/w;->d:LN1/z;

    .line 41
    .line 42
    invoke-virtual {v1}, LN1/z;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object v0, p0, LN1/w;->f:LN1/u;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return v1
.end method
