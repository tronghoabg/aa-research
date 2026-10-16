.class public final LG4/d;
.super LW1/r;
.source "SourceFile"


# instance fields
.field public d:LE4/o;


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LE4/B;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-interface {p1}, LE4/B;->getSize()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, LB4/d;

    .line 2
    .line 3
    check-cast p2, LE4/B;

    .line 4
    .line 5
    iget-object p1, p0, LG4/d;->d:LE4/o;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, LE4/o;->e:LE4/F;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, p2, v0}, LE4/F;->s(LE4/B;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
