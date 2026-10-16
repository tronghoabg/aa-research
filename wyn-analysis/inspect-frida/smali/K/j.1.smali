.class public final LK/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LK/j;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, LK/j;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, LK/j;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, LK/j;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_6

    .line 5
    .line 6
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 7
    .line 8
    const-class v1, LK/j;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    check-cast p1, LK/j;

    .line 30
    .line 31
    iget-wide v0, p0, LK/j;->a:J

    .line 32
    .line 33
    iget-wide v2, p1, LK/j;->a:J

    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, Le0/q;->b(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-wide v0, p0, LK/j;->b:J

    .line 43
    .line 44
    iget-wide v2, p1, LK/j;->b:J

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, Le0/q;->b(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    iget-wide v0, p0, LK/j;->c:J

    .line 54
    .line 55
    iget-wide v2, p1, LK/j;->c:J

    .line 56
    .line 57
    invoke-static {v0, v1, v2, v3}, Le0/q;->b(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    iget-wide v0, p0, LK/j;->d:J

    .line 65
    .line 66
    iget-wide v2, p1, LK/j;->d:J

    .line 67
    .line 68
    invoke-static {v0, v1, v2, v3}, Le0/q;->b(JJ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    :goto_0
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_6
    :goto_1
    const/4 p1, 0x0

    .line 78
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, Le0/q;->j:I

    .line 2
    .line 3
    iget-wide v0, p0, LK/j;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Lef/w;->a(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-wide v1, p0, LK/j;->b:J

    .line 12
    .line 13
    invoke-static {v1, v2}, Lef/w;->a(J)I

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
    iget-wide v2, p0, LK/j;->c:J

    .line 21
    .line 22
    invoke-static {v2, v3}, Lef/w;->a(J)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-wide v1, p0, LK/j;->d:J

    .line 30
    .line 31
    invoke-static {v1, v2}, Lef/w;->a(J)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    return v1
.end method
