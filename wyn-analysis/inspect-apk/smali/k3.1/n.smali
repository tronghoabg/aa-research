.class public final Lk3/n;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

.field public final synthetic d:LEf/n;

.field public final synthetic e:Lk3/o;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;LEf/n;Lk3/o;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk3/n;->c:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 2
    .line 3
    iput-object p2, p0, Lk3/n;->d:LEf/n;

    .line 4
    .line 5
    iput-object p3, p0, Lk3/n;->e:Lk3/o;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, Lk3/n;

    .line 2
    .line 3
    iget-object v1, p0, Lk3/n;->d:LEf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lk3/n;->e:Lk3/o;

    .line 6
    .line 7
    iget-object v3, p0, Lk3/n;->c:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lk3/n;-><init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;LEf/n;Lk3/o;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lk3/n;->b:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Lk3/n;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lk3/n;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lk3/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lk3/n;->a:I

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
    iget-object v0, p0, Lk3/n;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljf/c;

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
    iget-object p1, p0, Lk3/n;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LEf/E;

    .line 32
    .line 33
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v1, Ljf/d;->a:Ljf/d;

    .line 38
    .line 39
    invoke-interface {p1, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljf/e;

    .line 47
    .line 48
    new-instance v1, Lk3/s;

    .line 49
    .line 50
    invoke-direct {v1, p1}, Lk3/s;-><init>(Ljf/e;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lk3/n;->c:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 54
    .line 55
    iget-object v3, v3, Lk3/m;->j:Ljava/lang/ThreadLocal;

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    new-instance v5, LJf/u;

    .line 66
    .line 67
    invoke-direct {v5, v4, v3}, LJf/u;-><init>(Ljava/lang/Integer;Ljava/lang/ThreadLocal;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljf/a;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljf/a;->plus(Ljf/h;)Ljf/h;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1, v5}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v1, p0, Lk3/n;->d:LEf/n;

    .line 81
    .line 82
    iput-object v1, p0, Lk3/n;->b:Ljava/lang/Object;

    .line 83
    .line 84
    iput v2, p0, Lk3/n;->a:I

    .line 85
    .line 86
    iget-object v2, p0, Lk3/n;->e:Lk3/o;

    .line 87
    .line 88
    invoke-static {p1, v2, p0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v0, :cond_2

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_2
    move-object v0, v1

    .line 96
    :goto_0
    invoke-interface {v0, p1}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, Lef/C;->a:Lef/C;

    .line 100
    .line 101
    return-object p1
.end method
