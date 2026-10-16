.class public final Lm9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lm9/X;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lm9/X;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lm9/i;->a:I

    .line 5
    .line 6
    iput-object p1, p0, Lm9/i;->b:Lm9/X;

    .line 7
    .line 8
    iput p3, p0, Lm9/i;->c:I

    .line 9
    .line 10
    iput p4, p0, Lm9/i;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lm9/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lm9/i;

    .line 6
    .line 7
    iget v0, p1, Lm9/i;->a:I

    .line 8
    .line 9
    iget v1, p0, Lm9/i;->a:I

    .line 10
    .line 11
    invoke-static {v1, v0}, LA/f;->b(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lm9/i;->b:Lm9/X;

    .line 18
    .line 19
    iget-object v1, p1, Lm9/i;->b:Lm9/X;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lm9/o;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v0, p0, Lm9/i;->c:I

    .line 28
    .line 29
    iget v1, p1, Lm9/i;->c:I

    .line 30
    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    iget v0, p0, Lm9/i;->d:I

    .line 34
    .line 35
    iget p1, p1, Lm9/i;->d:I

    .line 36
    .line 37
    if-ne v0, p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lm9/i;->a:I

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
    iget-object v1, p0, Lm9/i;->b:Lm9/X;

    .line 10
    .line 11
    invoke-virtual {v1}, Lm9/o;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget v0, p0, Lm9/i;->c:I

    .line 19
    .line 20
    add-int/2addr v1, v0

    .line 21
    mul-int/lit8 v1, v1, 0x1f

    .line 22
    .line 23
    iget v0, p0, Lm9/i;->d:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    return v1
.end method
