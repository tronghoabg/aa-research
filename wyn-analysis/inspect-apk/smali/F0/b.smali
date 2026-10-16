.class public final LF0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz0/b;

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LW/i;->a:LS3/e;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(Lz0/b;J)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF0/b;->a:Lz0/b;

    .line 5
    .line 6
    iget-object p1, p1, Lz0/b;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    sget v0, Lz0/o;->b:I

    .line 13
    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    shr-long v0, p2, v0

    .line 17
    .line 18
    long-to-int v0, v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v0, v1, p1}, Landroid/support/v4/media/session/b;->S(III)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-wide v3, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v3, p2

    .line 30
    long-to-int v3, v3

    .line 31
    invoke-static {v3, v1, p1}, Landroid/support/v4/media/session/b;->S(III)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne v2, v0, :cond_0

    .line 36
    .line 37
    if-eq p1, v3, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-static {v2, p1}, LU8/v0;->g(II)J

    .line 40
    .line 41
    .line 42
    move-result-wide p2

    .line 43
    :cond_1
    iput-wide p2, p0, LF0/b;->b:J

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    return v1

    .line 6
    :cond_0
    instance-of v2, p1, LF0/b;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    return v3

    .line 12
    :cond_1
    check-cast p1, LF0/b;

    .line 13
    .line 14
    iget-wide v4, p1, LF0/b;->b:J

    .line 15
    .line 16
    sget v2, Lz0/o;->b:I

    .line 17
    .line 18
    iget-wide v6, p0, LF0/b;->b:J

    .line 19
    .line 20
    cmp-long v2, v6, v4

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    invoke-static {v0, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, LF0/b;->a:Lz0/b;

    .line 31
    .line 32
    iget-object p1, p1, LF0/b;->a:Lz0/b;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    return v3
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, LF0/b;->a:Lz0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/b;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    sget v1, Lz0/o;->b:I

    .line 10
    .line 11
    iget-wide v1, p0, LF0/b;->b:J

    .line 12
    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    ushr-long v3, v1, v3

    .line 16
    .line 17
    xor-long/2addr v1, v3

    .line 18
    long-to-int v1, v1

    .line 19
    add-int/2addr v1, v0

    .line 20
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x0

    .line 23
    .line 24
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextFieldValue(text=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LF0/b;->a:Lz0/b;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', selection="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, LF0/b;->b:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Lz0/o;->a(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", composition="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 v1, 0x29

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
