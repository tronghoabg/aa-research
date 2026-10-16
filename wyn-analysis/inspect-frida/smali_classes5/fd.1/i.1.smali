.class public final Lfd/i;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lfd/H;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lfd/H;Ljava/util/List;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfd/i;->b:Lfd/H;

    .line 2
    .line 3
    iput-object p2, p0, Lfd/i;->c:Ljava/util/List;

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
    new-instance p1, Lfd/i;

    .line 2
    .line 3
    iget-object v0, p0, Lfd/i;->b:Lfd/H;

    .line 4
    .line 5
    iget-object v1, p0, Lfd/i;->c:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lfd/i;-><init>(Lfd/H;Ljava/util/List;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lfd/i;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lfd/i;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lfd/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lfd/i;->a:I

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
    iget-object p1, p0, Lfd/i;->b:Lfd/H;

    .line 26
    .line 27
    iget-object p1, p1, Lfd/H;->a:Landroid/content/Context;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    invoke-static {p1}, Lfd/I;->a(Landroid/content/Context;)Lu1/i;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v3, Lfd/h;

    .line 37
    .line 38
    iget-object v4, p0, Lfd/i;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-direct {v3, v4, v1}, Lfd/h;-><init>(Ljava/util/List;Ljf/c;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, Lfd/i;->a:I

    .line 44
    .line 45
    invoke-static {p1, v3, p0}, Landroid/support/v4/media/session/b;->d0(Lu1/i;Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    return-object p1

    .line 53
    :cond_3
    const-string p1, "context"

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1
.end method
