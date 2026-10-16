.class public final LN1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LD9/n;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LD9/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget v1, v0, LD9/n;->b:I

    .line 8
    .line 9
    iget v2, v0, LD9/n;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-gt v1, v2, :cond_0

    .line 14
    .line 15
    move v1, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v4

    .line 18
    :goto_0
    invoke-static {v1}, LQ1/k;->c(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v1, LN1/h;

    .line 22
    .line 23
    invoke-direct {v1, v0}, LN1/h;-><init>(LD9/n;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, LQ1/x;->E(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3}, LQ1/x;->E(I)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(LD9/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p1, LD9/n;->b:I

    .line 8
    .line 9
    iput v0, p0, LN1/h;->a:I

    .line 10
    .line 11
    iget p1, p1, LD9/n;->c:I

    .line 12
    .line 13
    iput p1, p0, LN1/h;->b:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LN1/h;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, LN1/h;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, LN1/h;->a:I

    .line 16
    .line 17
    iget v2, p1, LN1/h;->a:I

    .line 18
    .line 19
    if-ne v1, v2, :cond_2

    .line 20
    .line 21
    iget v1, p0, LN1/h;->b:I

    .line 22
    .line 23
    iget p1, p1, LN1/h;->b:I

    .line 24
    .line 25
    if-ne v1, p1, :cond_2

    .line 26
    .line 27
    sget p1, LQ1/x;->a:I

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x3fd1

    .line 2
    .line 3
    iget v1, p0, LN1/h;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, LN1/h;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    return v0
.end method
