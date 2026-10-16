.class public final LJ3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:LJ3/d;


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:J

.field public final g:J

.field public final h:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, LJ3/d;

    .line 2
    .line 3
    sget-object v10, Lff/x;->a:Lff/x;

    .line 4
    .line 5
    const-wide/16 v6, -0x1

    .line 6
    .line 7
    const-wide/16 v8, -0x1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-direct/range {v0 .. v10}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LJ3/d;->i:LJ3/d;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(IZZZZJJLjava/util/Set;)V
    .locals 1

    .line 1
    const-string v0, "requiredNetworkType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentUriTriggers"

    .line 7
    .line 8
    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, LJ3/d;->a:I

    .line 15
    .line 16
    iput-boolean p2, p0, LJ3/d;->b:Z

    .line 17
    .line 18
    iput-boolean p3, p0, LJ3/d;->c:Z

    .line 19
    .line 20
    iput-boolean p4, p0, LJ3/d;->d:Z

    .line 21
    .line 22
    iput-boolean p5, p0, LJ3/d;->e:Z

    .line 23
    .line 24
    iput-wide p6, p0, LJ3/d;->f:J

    .line 25
    .line 26
    iput-wide p8, p0, LJ3/d;->g:J

    .line 27
    .line 28
    iput-object p10, p0, LJ3/d;->h:Ljava/util/Set;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_9

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LJ3/d;

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
    goto :goto_0

    .line 20
    :cond_1
    check-cast p1, LJ3/d;

    .line 21
    .line 22
    iget-boolean v0, p0, LJ3/d;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, LJ3/d;->b:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    iget-boolean v0, p0, LJ3/d;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, LJ3/d;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-boolean v0, p0, LJ3/d;->d:Z

    .line 37
    .line 38
    iget-boolean v1, p1, LJ3/d;->d:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-boolean v0, p0, LJ3/d;->e:Z

    .line 44
    .line 45
    iget-boolean v1, p1, LJ3/d;->e:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-wide v0, p0, LJ3/d;->f:J

    .line 51
    .line 52
    iget-wide v2, p1, LJ3/d;->f:J

    .line 53
    .line 54
    cmp-long v0, v0, v2

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-wide v0, p0, LJ3/d;->g:J

    .line 60
    .line 61
    iget-wide v2, p1, LJ3/d;->g:J

    .line 62
    .line 63
    cmp-long v0, v0, v2

    .line 64
    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    iget v0, p0, LJ3/d;->a:I

    .line 69
    .line 70
    iget v1, p1, LJ3/d;->a:I

    .line 71
    .line 72
    if-eq v0, v1, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-object v0, p0, LJ3/d;->h:Ljava/util/Set;

    .line 76
    .line 77
    iget-object p1, p1, LJ3/d;->h:Ljava/util/Set;

    .line 78
    .line 79
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1

    .line 84
    :cond_9
    :goto_0
    const/4 p1, 0x0

    .line 85
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, LJ3/d;->a:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean v1, p0, LJ3/d;->b:Z

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-boolean v1, p0, LJ3/d;->c:Z

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-boolean v1, p0, LJ3/d;->d:Z

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-boolean v1, p0, LJ3/d;->e:Z

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-wide v1, p0, LJ3/d;->f:J

    .line 30
    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    ushr-long v4, v1, v3

    .line 34
    .line 35
    xor-long/2addr v1, v4

    .line 36
    long-to-int v1, v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-wide v1, p0, LJ3/d;->g:J

    .line 41
    .line 42
    ushr-long v3, v1, v3

    .line 43
    .line 44
    xor-long/2addr v1, v3

    .line 45
    long-to-int v1, v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, LJ3/d;->h:Ljava/util/Set;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v1, v0

    .line 56
    return v1
.end method
