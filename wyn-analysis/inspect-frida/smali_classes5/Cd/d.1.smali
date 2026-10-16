.class public final LCd/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public synthetic a:LFd/c;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LFd/c;

    .line 2
    .line 3
    check-cast p2, LMd/c;

    .line 4
    .line 5
    check-cast p3, Ljf/c;

    .line 6
    .line 7
    new-instance p2, LCd/d;

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-direct {p2, v0, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p2, LCd/d;->a:LFd/c;

    .line 14
    .line 15
    sget-object p1, Lef/C;->a:Lef/C;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, LCd/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return-object p1
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
    iget-object p1, p0, LCd/d;->a:LFd/c;

    .line 7
    .line 8
    iget-object p1, p1, LFd/c;->f:LNd/d;

    .line 9
    .line 10
    sget-object v0, LCd/f;->a:LNd/a;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p1
.end method
