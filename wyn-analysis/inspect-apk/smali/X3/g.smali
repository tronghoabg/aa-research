.class public final LX3/g;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lh4/h;

.field public final synthetic d:LX3/k;


# direct methods
.method public constructor <init>(LX3/k;Lh4/h;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LX3/g;->c:Lh4/h;

    .line 2
    .line 3
    iput-object p1, p0, LX3/g;->d:LX3/k;

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
    new-instance v0, LX3/g;

    .line 2
    .line 3
    iget-object v1, p0, LX3/g;->c:Lh4/h;

    .line 4
    .line 5
    iget-object v2, p0, LX3/g;->d:LX3/k;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p2}, LX3/g;-><init>(LX3/k;Lh4/h;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LX3/g;->b:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LX3/g;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LX3/g;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LX3/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LX3/g;->a:I

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
    iget-object p1, p0, LX3/g;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LEf/E;

    .line 28
    .line 29
    sget-object v1, LEf/S;->a:LLf/e;

    .line 30
    .line 31
    sget-object v1, LJf/n;->a:LFf/e;

    .line 32
    .line 33
    iget-object v1, v1, LFf/e;->e:LFf/e;

    .line 34
    .line 35
    new-instance v3, LX3/f;

    .line 36
    .line 37
    iget-object v4, p0, LX3/g;->d:LX3/k;

    .line 38
    .line 39
    iget-object v5, p0, LX3/g;->c:Lh4/h;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    invoke-direct {v3, v4, v5, v6}, LX3/f;-><init>(LX3/k;Lh4/h;Ljf/c;)V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-static {p1, v1, v3, v4}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput v2, p0, LX3/g;->a:I

    .line 51
    .line 52
    invoke-virtual {p1, p0}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    return-object p1
.end method
