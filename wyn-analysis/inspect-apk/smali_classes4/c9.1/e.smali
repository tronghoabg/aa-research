.class public final Lc9/e;
.super Lc9/i;
.source "SourceFile"


# instance fields
.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/g;Lc9/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc9/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/g;Lc9/g;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lc9/e;->e:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;Lc9/g;Lc9/g;)Lc9/i;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lc9/i;->a:Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lc9/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    :cond_1
    if-nez p3, :cond_2

    .line 10
    .line 11
    iget-object p3, p0, Lc9/i;->c:Lc9/g;

    .line 12
    .line 13
    :cond_2
    if-nez p4, :cond_3

    .line 14
    .line 15
    iget-object p4, p0, Lc9/i;->d:Lc9/g;

    .line 16
    .line 17
    :cond_3
    new-instance v0, Lc9/e;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2, p3, p4}, Lc9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc9/g;Lc9/g;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final q(Lc9/i;)V
    .locals 2

    .line 1
    iget v0, p0, Lc9/e;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lc9/i;->c:Lc9/g;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v0, "Can\'t set left after using size"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public final size()I
    .locals 2

    .line 1
    iget v0, p0, Lc9/e;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lc9/i;->c:Lc9/g;

    .line 7
    .line 8
    invoke-interface {v0}, Lc9/g;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iget-object v1, p0, Lc9/i;->d:Lc9/g;

    .line 15
    .line 16
    invoke-interface {v1}, Lc9/g;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v1, v0

    .line 21
    iput v1, p0, Lc9/e;->e:I

    .line 22
    .line 23
    :cond_0
    iget v0, p0, Lc9/e;->e:I

    .line 24
    .line 25
    return v0
.end method
