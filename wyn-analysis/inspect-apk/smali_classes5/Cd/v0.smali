.class public final synthetic LCd/v0;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljf/c;

    .line 2
    .line 3
    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LRd/e;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, LRd/e;->d(Ljf/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    return-object p1
.end method
