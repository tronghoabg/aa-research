.class public final LC/h;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/e;

    .line 2
    .line 3
    check-cast p2, Ld0/c;

    .line 4
    .line 5
    iget-wide p1, p2, Ld0/c;->a:J

    .line 6
    .line 7
    check-cast p3, Ljf/c;

    .line 8
    .line 9
    new-instance p1, LC/h;

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p1, p2, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    sget-object p2, Lef/C;->a:Lef/C;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, LC/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 7
    .line 8
    return-object p1
.end method
