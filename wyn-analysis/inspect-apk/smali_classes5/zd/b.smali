.class public final Lzd/b;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lzd/c;

.field public final synthetic c:LFd/d;


# direct methods
.method public constructor <init>(Lzd/c;LFd/d;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd/b;->b:Lzd/c;

    .line 2
    .line 3
    iput-object p2, p0, Lzd/b;->c:LFd/d;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lzd/b;

    .line 2
    .line 3
    iget-object v0, p0, Lzd/b;->b:Lzd/c;

    .line 4
    .line 5
    iget-object v1, p0, Lzd/b;->c:LFd/d;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lzd/b;-><init>(Lzd/c;LFd/d;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lzd/b;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lzd/b;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lzd/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lzd/b;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lzd/b;->b:Lzd/c;

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    check-cast v1, Lzd/e;

    .line 29
    .line 30
    invoke-virtual {v1}, Lzd/e;->getCoroutineContext()Ljf/h;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v3, LEf/l0;->a:LEf/l0;

    .line 35
    .line 36
    invoke-interface {v1, v3}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LEf/m0;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, LEf/m0;->isActive()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-eqz v1, :cond_4

    .line 51
    .line 52
    iput v2, p0, Lzd/b;->a:I

    .line 53
    .line 54
    check-cast p1, LAd/e;

    .line 55
    .line 56
    iget-object v1, p0, Lzd/b;->c:LFd/d;

    .line 57
    .line 58
    invoke-virtual {p1, v1, p0}, LAd/e;->a(LFd/d;Llf/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    return-object p1

    .line 66
    :cond_4
    new-instance p1, LCd/s0;

    .line 67
    .line 68
    const-string v0, "Client already closed"

    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    invoke-direct {p1, v0, v1}, LCd/s0;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method
