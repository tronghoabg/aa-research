.class public final Lm9/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Lm9/O;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lm9/G;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lm9/O;

    .line 2
    .line 3
    const-wide/16 v5, 0x0

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v8, 0x3

    .line 11
    invoke-direct/range {v0 .. v8}, Lm9/O;-><init>(IIJJLm9/G;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lm9/O;->g:Lm9/O;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(IIJJLm9/G;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm9/O;->a:I

    .line 5
    .line 6
    iput p2, p0, Lm9/O;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lm9/O;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lm9/O;->d:J

    .line 11
    .line 12
    iput p8, p0, Lm9/O;->e:I

    .line 13
    .line 14
    iput-object p7, p0, Lm9/O;->f:Lm9/G;

    .line 15
    .line 16
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
    if-eqz p1, :cond_8

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lm9/O;

    .line 11
    .line 12
    if-eq v1, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lm9/O;

    .line 16
    .line 17
    iget v0, p0, Lm9/O;->a:I

    .line 18
    .line 19
    iget v1, p1, Lm9/O;->a:I

    .line 20
    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iget v0, p0, Lm9/O;->b:I

    .line 25
    .line 26
    iget v1, p1, Lm9/O;->b:I

    .line 27
    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    iget-wide v0, p0, Lm9/O;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, Lm9/O;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    iget-wide v0, p0, Lm9/O;->d:J

    .line 41
    .line 42
    iget-wide v2, p1, Lm9/O;->d:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_5
    iget v0, p0, Lm9/O;->e:I

    .line 50
    .line 51
    iget v1, p1, Lm9/O;->e:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_6
    iget-object p1, p1, Lm9/O;->f:Lm9/G;

    .line 57
    .line 58
    iget-object v0, p0, Lm9/O;->f:Lm9/G;

    .line 59
    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_7
    if-nez p1, :cond_8

    .line 68
    .line 69
    :goto_0
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_8
    :goto_1
    const/4 p1, 0x0

    .line 72
    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget v0, p0, Lm9/O;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget v2, p0, Lm9/O;->b:I

    .line 7
    .line 8
    add-int/2addr v0, v2

    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, Lm9/O;->c:J

    .line 11
    .line 12
    const/16 v4, 0x20

    .line 13
    .line 14
    ushr-long v5, v2, v4

    .line 15
    .line 16
    xor-long/2addr v2, v5

    .line 17
    long-to-int v2, v2

    .line 18
    add-int/2addr v0, v2

    .line 19
    mul-int/2addr v0, v1

    .line 20
    iget-wide v2, p0, Lm9/O;->d:J

    .line 21
    .line 22
    ushr-long v4, v2, v4

    .line 23
    .line 24
    xor-long/2addr v2, v4

    .line 25
    long-to-int v2, v2

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget v2, p0, Lm9/O;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, LA/f;->d(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lm9/O;->f:Lm9/G;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v1, 0x0

    .line 44
    :goto_0
    add-int/2addr v0, v1

    .line 45
    return v0
.end method
