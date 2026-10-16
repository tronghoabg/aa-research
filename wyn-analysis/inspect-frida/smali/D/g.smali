.class public final LD/g;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LD/i;

.field public final synthetic c:LN/V;


# direct methods
.method public constructor <init>(LD/i;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/g;->b:LD/i;

    .line 2
    .line 3
    iput-object p2, p0, LD/g;->c:LN/V;

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
    new-instance p1, LD/g;

    .line 2
    .line 3
    iget-object v0, p0, LD/g;->b:LD/i;

    .line 4
    .line 5
    iget-object v1, p0, LD/g;->c:LN/V;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LD/g;-><init>(LD/i;LN/V;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, LD/g;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LD/g;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LD/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LD/g;->a:I

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
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LD/g;->b:LD/i;

    .line 33
    .line 34
    iget-object v1, v1, LD/i;->a:LHf/j0;

    .line 35
    .line 36
    new-instance v3, LD/c;

    .line 37
    .line 38
    iget-object v4, p0, LD/g;->c:LN/V;

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-direct {v3, p1, v4, v5}, LD/c;-><init>(Ljava/util/ArrayList;LN/V;I)V

    .line 42
    .line 43
    .line 44
    iput v2, p0, LD/g;->a:I

    .line 45
    .line 46
    invoke-virtual {v1, v3, p0}, LHf/j0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v0
.end method
