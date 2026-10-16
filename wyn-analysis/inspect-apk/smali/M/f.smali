.class public final LM/f;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LD/i;

.field public final synthetic d:LA7/B0;


# direct methods
.method public constructor <init>(LD/i;LA7/B0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/f;->c:LD/i;

    .line 2
    .line 3
    iput-object p2, p0, LM/f;->d:LA7/B0;

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
    new-instance v0, LM/f;

    .line 2
    .line 3
    iget-object v1, p0, LM/f;->c:LD/i;

    .line 4
    .line 5
    iget-object v2, p0, LM/f;->d:LA7/B0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LM/f;-><init>(LD/i;LA7/B0;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LM/f;->b:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LM/f;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM/f;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LM/f;->a:I

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
    iget-object p1, p0, LM/f;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LEf/E;

    .line 30
    .line 31
    iget-object v1, p0, LM/f;->c:LD/i;

    .line 32
    .line 33
    iget-object v1, v1, LD/i;->a:LHf/j0;

    .line 34
    .line 35
    new-instance v3, LHf/z;

    .line 36
    .line 37
    iget-object v4, p0, LM/f;->d:LA7/B0;

    .line 38
    .line 39
    const/4 v5, 0x6

    .line 40
    invoke-direct {v3, v5, v4, p1}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, LM/f;->a:I

    .line 44
    .line 45
    invoke-virtual {v1, v3, p0}, LHf/j0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
