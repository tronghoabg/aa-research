.class public final LE5/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/h;


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field public g:Lg6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg6/b;->f:Lg6/b;

    .line 5
    .line 6
    iput-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(II)J
    .locals 2

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg6/b;->a(I)Lg6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p1, Lg6/a;->b:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Lg6/a;->f:[J

    .line 13
    .line 14
    aget-wide v0, p1, p2

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide p1
.end method

.method public final b(J)I
    .locals 9

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    iget-wide v1, p0, LE5/H0;->d:J

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/high16 v3, -0x8000000000000000L

    .line 9
    .line 10
    cmp-long v5, p1, v3

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    if-eqz v5, :cond_4

    .line 14
    .line 15
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v5, v1, v7

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    cmp-long v1, p1, v1

    .line 25
    .line 26
    if-ltz v1, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget v1, v0, Lg6/b;->d:I

    .line 30
    .line 31
    :goto_0
    iget v2, v0, Lg6/b;->a:I

    .line 32
    .line 33
    if-ge v1, v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lg6/b;->a(I)Lg6/a;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget-wide v7, v5, Lg6/a;->a:J

    .line 40
    .line 41
    cmp-long v5, v7, v3

    .line 42
    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lg6/b;->a(I)Lg6/a;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget-wide v7, v5, Lg6/a;->a:J

    .line 50
    .line 51
    cmp-long v5, v7, p1

    .line 52
    .line 53
    if-lez v5, :cond_2

    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0, v1}, Lg6/b;->a(I)Lg6/a;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget v7, v5, Lg6/a;->b:I

    .line 60
    .line 61
    if-eq v7, v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {v5, v6}, Lg6/a;->a(I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-ge v5, v7, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    :goto_1
    if-ge v1, v2, :cond_4

    .line 74
    .line 75
    return v1

    .line 76
    :cond_4
    :goto_2
    return v6
.end method

.method public final c(J)I
    .locals 9

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    iget-wide v1, p0, LE5/H0;->d:J

    .line 4
    .line 5
    iget v3, v0, Lg6/b;->a:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    sub-int/2addr v3, v4

    .line 9
    :goto_0
    if-ltz v3, :cond_3

    .line 10
    .line 11
    const-wide/high16 v5, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v7, p1, v5

    .line 14
    .line 15
    if-nez v7, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    invoke-virtual {v0, v3}, Lg6/b;->a(I)Lg6/a;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    iget-wide v7, v7, Lg6/a;->a:J

    .line 23
    .line 24
    cmp-long v5, v7, v5

    .line 25
    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v5, v1, v5

    .line 34
    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    cmp-long v5, p1, v1

    .line 38
    .line 39
    if-gez v5, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    cmp-long v5, p1, v7

    .line 43
    .line 44
    if-gez v5, :cond_3

    .line 45
    .line 46
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    :goto_2
    const/4 p1, -0x1

    .line 50
    if-ltz v3, :cond_7

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lg6/b;->a(I)Lg6/a;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget v0, p2, Lg6/a;->b:I

    .line 57
    .line 58
    if-ne v0, p1, :cond_4

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_4
    const/4 v1, 0x0

    .line 62
    :goto_3
    if-ge v1, v0, :cond_7

    .line 63
    .line 64
    iget-object v2, p2, Lg6/a;->e:[I

    .line 65
    .line 66
    aget v2, v2, v1

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    if-ne v2, v4, :cond_5

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_6
    :goto_4
    return v3

    .line 77
    :cond_7
    return p1
.end method

.method public final d(I)J
    .locals 2

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg6/b;->a(I)Lg6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-wide v0, p1, Lg6/a;->a:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public final e(II)I
    .locals 2

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg6/b;->a(I)Lg6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p1, Lg6/a;->b:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Lg6/a;->e:[I

    .line 13
    .line 14
    aget p1, p1, p2

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_2

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, LE5/H0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    check-cast p1, LE5/H0;

    .line 20
    .line 21
    iget-object v0, p0, LE5/H0;->a:Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v1, p1, LE5/H0;->a:Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, LE5/H0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v1, p1, LE5/H0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, LE5/H0;->c:I

    .line 42
    .line 43
    iget v1, p1, LE5/H0;->c:I

    .line 44
    .line 45
    if-ne v0, v1, :cond_2

    .line 46
    .line 47
    iget-wide v0, p0, LE5/H0;->d:J

    .line 48
    .line 49
    iget-wide v2, p1, LE5/H0;->d:J

    .line 50
    .line 51
    cmp-long v0, v0, v2

    .line 52
    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    iget-wide v0, p0, LE5/H0;->e:J

    .line 56
    .line 57
    iget-wide v2, p1, LE5/H0;->e:J

    .line 58
    .line 59
    cmp-long v0, v0, v2

    .line 60
    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    iget-boolean v0, p0, LE5/H0;->f:Z

    .line 64
    .line 65
    iget-boolean v1, p1, LE5/H0;->f:Z

    .line 66
    .line 67
    if-ne v0, v1, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 70
    .line 71
    iget-object p1, p1, LE5/H0;->g:Lg6/b;

    .line 72
    .line 73
    invoke-static {v0, p1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    :goto_0
    const/4 p1, 0x1

    .line 80
    return p1

    .line 81
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg6/b;->a(I)Lg6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-virtual {p1, v0}, Lg6/a;->a(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final g(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg6/b;->a(I)Lg6/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean p1, p1, Lg6/a;->h:Z

    .line 8
    .line 9
    return p1
.end method

.method public final h(Ljava/lang/Integer;Ljava/lang/Object;IJJLg6/b;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LE5/H0;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    iput-object p2, p0, LE5/H0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput p3, p0, LE5/H0;->c:I

    .line 6
    .line 7
    iput-wide p4, p0, LE5/H0;->d:J

    .line 8
    .line 9
    iput-wide p6, p0, LE5/H0;->e:J

    .line 10
    .line 11
    iput-object p8, p0, LE5/H0;->g:Lg6/b;

    .line 12
    .line 13
    iput-boolean p9, p0, LE5/H0;->f:Z

    .line 14
    .line 15
    return-void
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, LE5/H0;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/16 v2, 0xd9

    .line 13
    .line 14
    add-int/2addr v2, v0

    .line 15
    mul-int/lit8 v2, v2, 0x1f

    .line 16
    .line 17
    iget-object v0, p0, LE5/H0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    :goto_1
    add-int/2addr v2, v1

    .line 27
    mul-int/lit8 v2, v2, 0x1f

    .line 28
    .line 29
    iget v0, p0, LE5/H0;->c:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    mul-int/lit8 v2, v2, 0x1f

    .line 33
    .line 34
    iget-wide v0, p0, LE5/H0;->d:J

    .line 35
    .line 36
    const/16 v3, 0x20

    .line 37
    .line 38
    ushr-long v4, v0, v3

    .line 39
    .line 40
    xor-long/2addr v0, v4

    .line 41
    long-to-int v0, v0

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/lit8 v2, v2, 0x1f

    .line 44
    .line 45
    iget-wide v0, p0, LE5/H0;->e:J

    .line 46
    .line 47
    ushr-long v3, v0, v3

    .line 48
    .line 49
    xor-long/2addr v0, v3

    .line 50
    long-to-int v0, v0

    .line 51
    add-int/2addr v2, v0

    .line 52
    mul-int/lit8 v2, v2, 0x1f

    .line 53
    .line 54
    iget-boolean v0, p0, LE5/H0;->f:Z

    .line 55
    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/lit8 v2, v2, 0x1f

    .line 58
    .line 59
    iget-object v0, p0, LE5/H0;->g:Lg6/b;

    .line 60
    .line 61
    invoke-virtual {v0}, Lg6/b;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/2addr v0, v2

    .line 66
    return v0
.end method
