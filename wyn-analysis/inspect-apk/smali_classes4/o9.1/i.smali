.class public final Lo9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/c;


# instance fields
.field public final a:Lp9/A;

.field public final b:I


# direct methods
.method public constructor <init>(Lp9/A;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo9/i;->a:Lp9/A;

    .line 5
    .line 6
    iput p2, p0, Lo9/i;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_3

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lo9/i;

    .line 11
    .line 12
    if-eq v1, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Lo9/i;

    .line 16
    .line 17
    iget-object v0, p0, Lo9/i;->a:Lp9/A;

    .line 18
    .line 19
    iget-object v1, p1, Lo9/i;->a:Lp9/A;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lp9/A;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    iget v0, p0, Lo9/i;->b:I

    .line 29
    .line 30
    iget p1, p1, Lo9/i;->b:I

    .line 31
    .line 32
    if-ne v0, p1, :cond_3

    .line 33
    .line 34
    :goto_0
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo9/i;->a:Lp9/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp9/A;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lo9/i;->b:I

    .line 10
    .line 11
    invoke-static {v1}, LA/f;->f(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method
