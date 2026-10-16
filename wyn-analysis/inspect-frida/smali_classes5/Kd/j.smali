.class public final LKd/j;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LQf/a;

.field public final synthetic d:Lio/ktor/utils/io/X;


# direct methods
.method public constructor <init>(LQf/a;Lio/ktor/utils/io/X;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LKd/j;->c:LQf/a;

    .line 2
    .line 3
    iput-object p2, p0, LKd/j;->d:Lio/ktor/utils/io/X;

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
    new-instance v0, LKd/j;

    .line 2
    .line 3
    iget-object v1, p0, LKd/j;->c:LQf/a;

    .line 4
    .line 5
    iget-object v2, p0, LKd/j;->d:Lio/ktor/utils/io/X;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LKd/j;-><init>(LQf/a;Lio/ktor/utils/io/X;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LKd/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/ktor/utils/io/b0;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LKd/j;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LKd/j;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LKd/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LKd/j;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    iget-object v1, p0, LKd/j;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lio/ktor/utils/io/b0;

    .line 28
    .line 29
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LKd/j;->b:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v1, p1

    .line 39
    check-cast v1, Lio/ktor/utils/io/b0;

    .line 40
    .line 41
    iget-object v7, v1, Lio/ktor/utils/io/b0;->a:Lio/ktor/utils/io/J;

    .line 42
    .line 43
    iput-object v1, p0, LKd/j;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iput v2, p0, LKd/j;->a:I

    .line 46
    .line 47
    sget-object p1, LKd/o;->a:LQf/a;

    .line 48
    .line 49
    iget-object v5, p0, LKd/j;->d:Lio/ktor/utils/io/X;

    .line 50
    .line 51
    iget-object v6, p0, LKd/j;->c:LQf/a;

    .line 52
    .line 53
    new-instance v4, Lio/ktor/utils/io/q;

    .line 54
    .line 55
    const-wide/16 v8, 0x2001

    .line 56
    .line 57
    invoke-direct/range {v4 .. v9}, Lio/ktor/utils/io/q;-><init>(Lio/ktor/utils/io/t;LQf/a;Lio/ktor/utils/io/J;J)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2, p0}, Lio/ktor/utils/io/q;->d(ZLlf/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    iget-object p1, v1, Lio/ktor/utils/io/b0;->a:Lio/ktor/utils/io/J;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    iput-object v1, p0, LKd/j;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iput v3, p0, LKd/j;->a:I

    .line 73
    .line 74
    invoke-interface {p1, p0}, Lio/ktor/utils/io/J;->f(Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_4

    .line 79
    .line 80
    :goto_1
    return-object v0

    .line 81
    :cond_4
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 82
    .line 83
    return-object p1
.end method
