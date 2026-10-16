.class public final LB/p;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:LD/i;

.field public final synthetic e:LN/V;

.field public final synthetic f:LN/V;

.field public final synthetic g:LN/V;


# direct methods
.method public constructor <init>(ZLD/i;LN/V;LN/V;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB/p;->c:Z

    .line 2
    .line 3
    iput-object p2, p0, LB/p;->d:LD/i;

    .line 4
    .line 5
    iput-object p3, p0, LB/p;->e:LN/V;

    .line 6
    .line 7
    iput-object p4, p0, LB/p;->f:LN/V;

    .line 8
    .line 9
    iput-object p5, p0, LB/p;->g:LN/V;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, LB/p;

    .line 2
    .line 3
    iget-object v4, p0, LB/p;->f:LN/V;

    .line 4
    .line 5
    iget-object v5, p0, LB/p;->g:LN/V;

    .line 6
    .line 7
    iget-object v2, p0, LB/p;->d:LD/i;

    .line 8
    .line 9
    iget-object v3, p0, LB/p;->e:LN/V;

    .line 10
    .line 11
    iget-boolean v1, p0, LB/p;->c:Z

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, LB/p;-><init>(ZLD/i;LN/V;LN/V;LN/V;Ljf/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, LB/p;->b:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp0/t;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LB/p;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/p;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LB/p;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v2

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
    iget-object p1, p0, LB/p;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lp0/t;

    .line 30
    .line 31
    new-instance v4, LB/n;

    .line 32
    .line 33
    iget-object v8, p0, LB/p;->f:LN/V;

    .line 34
    .line 35
    iget-object v6, p0, LB/p;->d:LD/i;

    .line 36
    .line 37
    iget-object v7, p0, LB/p;->e:LN/V;

    .line 38
    .line 39
    iget-boolean v5, p0, LB/p;->c:Z

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-direct/range {v4 .. v9}, LB/n;-><init>(ZLD/i;LN/V;LN/V;Ljf/c;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, LB/o;

    .line 46
    .line 47
    iget-object v5, p0, LB/p;->g:LN/V;

    .line 48
    .line 49
    iget-boolean v6, p0, LB/p;->c:Z

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    invoke-direct {v1, v7, v5, v6}, LB/o;-><init>(ILjava/lang/Object;Z)V

    .line 53
    .line 54
    .line 55
    iput v3, p0, LB/p;->a:I

    .line 56
    .line 57
    sget-object v3, LC/o;->a:LC/h;

    .line 58
    .line 59
    new-instance v3, LC/e;

    .line 60
    .line 61
    invoke-direct {v3, p1}, LC/e;-><init>(LL0/b;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, LC/m;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v5, v3, v4, v1, v6}, LC/m;-><init>(LC/e;LB/n;LB/o;Ljf/c;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v5, p0}, LA6/c;->w(Lp0/t;Ltf/p;Llf/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v0, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move-object p1, v2

    .line 78
    :goto_0
    if-ne p1, v0, :cond_3

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_3
    return-object v2
.end method
