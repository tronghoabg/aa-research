.class public final LKd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/ArrayList;


# virtual methods
.method public final a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LKd/c;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    div-int/lit16 v1, p1, 0x300

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    rem-int/lit16 p1, p1, 0x300

    .line 12
    .line 13
    aget p1, v0, p1

    .line 14
    .line 15
    return p1
.end method

.method public final b(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LKd/c;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    div-int/lit16 v1, p1, 0x300

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [I

    .line 10
    .line 11
    rem-int/lit16 p1, p1, 0x300

    .line 12
    .line 13
    aput p2, v0, p1

    .line 14
    .line 15
    return-void
.end method
