.class public final LD3/j;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LD3/b;

.field public final synthetic d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(LD3/b;Landroid/app/Activity;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD3/j;->c:LD3/b;

    .line 2
    .line 3
    iput-object p2, p0, LD3/j;->d:Landroid/app/Activity;

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
    new-instance v0, LD3/j;

    .line 2
    .line 3
    iget-object v1, p0, LD3/j;->c:LD3/b;

    .line 4
    .line 5
    iget-object v2, p0, LD3/j;->d:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LD3/j;-><init>(LD3/b;Landroid/app/Activity;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LD3/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/t;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LD3/j;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LD3/j;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LD3/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LD3/j;->a:I

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
    goto :goto_0

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
    iget-object p1, p0, LD3/j;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LGf/t;

    .line 28
    .line 29
    new-instance v1, LD3/i;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v1, p1, v3}, LD3/i;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, LD3/j;->c:LD3/b;

    .line 36
    .line 37
    iget-object v4, v3, LD3/b;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, LE3/a;

    .line 40
    .line 41
    new-instance v5, Lcom/applovin/impl/T0;

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    invoke-direct {v5, v6}, Lcom/applovin/impl/T0;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iget-object v6, p0, LD3/j;->d:Landroid/app/Activity;

    .line 48
    .line 49
    invoke-interface {v4, v6, v5, v1}, LE3/a;->b(Landroid/content/Context;Lcom/applovin/impl/T0;LD3/i;)V

    .line 50
    .line 51
    .line 52
    new-instance v4, LA0/e;

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    invoke-direct {v4, v5, v3, v1}, LA0/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput v2, p0, LD3/j;->a:I

    .line 59
    .line 60
    invoke-static {p1, v4, p0}, Lp7/b;->f(LGf/t;Ltf/a;Llf/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_2

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 68
    .line 69
    return-object p1
.end method
