.class public final LN/l0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LN/o0;

.field public final synthetic d:LN/Q;


# direct methods
.method public constructor <init>(LN/o0;LN/Q;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/l0;->c:LN/o0;

    .line 2
    .line 3
    iput-object p2, p0, LN/l0;->d:LN/Q;

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
    .locals 3

    .line 1
    new-instance v0, LN/l0;

    .line 2
    .line 3
    iget-object v1, p0, LN/l0;->c:LN/o0;

    .line 4
    .line 5
    iget-object v2, p0, LN/l0;->d:LN/Q;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN/l0;-><init>(LN/o0;LN/Q;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LN/l0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
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
    invoke-virtual {p0, p1, p2}, LN/l0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/l0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LN/l0;->a:I

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
    sget-object p1, Lef/C;->a:Lef/C;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LN/l0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LEf/E;

    .line 30
    .line 31
    iput v2, p0, LN/l0;->a:I

    .line 32
    .line 33
    iget-object v1, p0, LN/l0;->c:LN/o0;

    .line 34
    .line 35
    iget-object v2, p0, LN/l0;->d:LN/Q;

    .line 36
    .line 37
    invoke-virtual {v1, p1, v2, p0}, LN/o0;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-object v0
.end method
