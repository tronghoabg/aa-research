.class public final LA/Q;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LA/U;


# direct methods
.method public constructor <init>(LA/U;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/Q;->c:LA/U;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, LA/Q;

    .line 2
    .line 3
    iget-object v1, p0, LA/Q;->c:LA/U;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LA/Q;-><init>(LA/U;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LA/Q;->b:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LA/Q;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LA/Q;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LA/Q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LA/Q;->a:I

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
    iget-object v1, p0, LA/Q;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LEf/E;

    .line 13
    .line 14
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LA/Q;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LEf/E;

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    :cond_2
    :goto_0
    invoke-interface {v1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, LA/t;->h(Ljf/h;)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-instance v3, LA/P;

    .line 43
    .line 44
    iget-object v4, p0, LA/Q;->c:LA/U;

    .line 45
    .line 46
    invoke-direct {v3, v4, p1}, LA/P;-><init>(LA/U;F)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, LA/Q;->b:Ljava/lang/Object;

    .line 50
    .line 51
    iput v2, p0, LA/Q;->a:I

    .line 52
    .line 53
    invoke-interface {p0}, Ljf/c;->getContext()Ljf/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, LN/d;->B(Ljf/h;)LN/Q;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1, v3, p0}, LN/Q;->d(Ltf/l;Llf/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    return-object v0
.end method
