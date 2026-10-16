.class public final Lcom/moloco/sdk/internal/utils/a;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LNf/a;

.field public b:Llf/j;

.field public c:I

.field public final synthetic d:LNf/d;

.field public final synthetic e:Llf/j;


# direct methods
.method public constructor <init>(LNf/d;Ltf/l;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/utils/a;->d:LNf/d;

    .line 2
    .line 3
    check-cast p2, Llf/j;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/moloco/sdk/internal/utils/a;->e:Llf/j;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/utils/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/utils/a;->e:Llf/j;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/utils/a;->d:LNf/d;

    .line 6
    .line 7
    invoke-direct {p1, v1, v0, p2}, Lcom/moloco/sdk/internal/utils/a;-><init>(LNf/d;Ltf/l;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/utils/a;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/utils/a;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/utils/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/moloco/sdk/internal/utils/a;->c:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/moloco/sdk/internal/utils/a;->a:LNf/a;

    .line 15
    .line 16
    check-cast v0, LNf/a;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_3

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v1, p0, Lcom/moloco/sdk/internal/utils/a;->b:Llf/j;

    .line 33
    .line 34
    check-cast v1, Ltf/l;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/moloco/sdk/internal/utils/a;->a:LNf/a;

    .line 37
    .line 38
    check-cast v3, LNf/a;

    .line 39
    .line 40
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object p1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/moloco/sdk/internal/utils/a;->d:LNf/d;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/moloco/sdk/internal/utils/a;->a:LNf/a;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/moloco/sdk/internal/utils/a;->e:Llf/j;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/moloco/sdk/internal/utils/a;->b:Llf/j;

    .line 55
    .line 56
    iput v3, p0, Lcom/moloco/sdk/internal/utils/a;->c:I

    .line 57
    .line 58
    invoke-virtual {p1, p0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-ne v3, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    :try_start_1
    move-object v3, p1

    .line 66
    check-cast v3, LNf/a;

    .line 67
    .line 68
    iput-object v3, p0, Lcom/moloco/sdk/internal/utils/a;->a:LNf/a;

    .line 69
    .line 70
    iput-object v4, p0, Lcom/moloco/sdk/internal/utils/a;->b:Llf/j;

    .line 71
    .line 72
    iput v2, p0, Lcom/moloco/sdk/internal/utils/a;->c:I

    .line 73
    .line 74
    invoke-interface {v1, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    if-ne v1, v0, :cond_4

    .line 79
    .line 80
    :goto_1
    return-object v0

    .line 81
    :cond_4
    move-object v0, p1

    .line 82
    move-object p1, v1

    .line 83
    :goto_2
    invoke-interface {v0, v4}, LNf/a;->a(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :catchall_1
    move-exception v0

    .line 88
    move-object v5, v0

    .line 89
    move-object v0, p1

    .line 90
    move-object p1, v5

    .line 91
    :goto_3
    invoke-interface {v0, v4}, LNf/a;->a(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method
