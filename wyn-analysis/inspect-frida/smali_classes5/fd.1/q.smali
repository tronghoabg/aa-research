.class public final Lfd/q;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lfd/H;

.field public final synthetic e:Lkotlin/jvm/internal/G;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lfd/H;Lkotlin/jvm/internal/G;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfd/q;->c:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lfd/q;->d:Lfd/H;

    .line 4
    .line 5
    iput-object p3, p0, Lfd/q;->e:Lkotlin/jvm/internal/G;

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
    .locals 3

    .line 1
    new-instance p1, Lfd/q;

    .line 2
    .line 3
    iget-object v0, p0, Lfd/q;->d:Lfd/H;

    .line 4
    .line 5
    iget-object v1, p0, Lfd/q;->e:Lkotlin/jvm/internal/G;

    .line 6
    .line 7
    iget-object v2, p0, Lfd/q;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lfd/q;-><init>(Ljava/lang/String;Lfd/H;Lkotlin/jvm/internal/G;Ljf/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lfd/q;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lfd/q;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lfd/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lfd/q;->b:I

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
    iget-object v0, p0, Lfd/q;->a:Lkotlin/jvm/internal/G;

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

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
    iget-object p1, p0, Lfd/q;->c:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v1, Lx1/e;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Lx1/e;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lfd/q;->d:Lfd/H;

    .line 35
    .line 36
    iget-object v3, p1, Lfd/H;->a:Landroid/content/Context;

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    invoke-static {v3}, Lfd/I;->a(Landroid/content/Context;)Lu1/i;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Lu1/i;->getData()LHf/l;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    new-instance v4, LHf/a0;

    .line 49
    .line 50
    invoke-direct {v4, v3, p1, v1}, LHf/a0;-><init>(LHf/l;Lfd/H;Lx1/e;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lfd/q;->e:Lkotlin/jvm/internal/G;

    .line 54
    .line 55
    iput-object p1, p0, Lfd/q;->a:Lkotlin/jvm/internal/G;

    .line 56
    .line 57
    iput v2, p0, Lfd/q;->b:I

    .line 58
    .line 59
    invoke-static {v4, p0}, LHf/k0;->q(LHf/l;Llf/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-ne v1, v0, :cond_2

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    move-object v0, p1

    .line 67
    move-object p1, v1

    .line 68
    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 69
    .line 70
    sget-object p1, Lef/C;->a:Lef/C;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_3
    const-string p1, "context"

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    throw p1
.end method
