.class public final LHf/r0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LIf/E;


# direct methods
.method public constructor <init>(LIf/E;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/r0;->c:LIf/E;

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
    new-instance v0, LHf/r0;

    .line 2
    .line 3
    iget-object v1, p0, LHf/r0;->c:LIf/E;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LHf/r0;-><init>(LIf/E;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LHf/r0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LHf/m;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LHf/r0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LHf/r0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LHf/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LHf/r0;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, LE5/Q;

    .line 22
    .line 23
    const/16 v0, 0x8

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, LHf/r0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LHf/m;

    .line 36
    .line 37
    new-instance v1, Lkotlin/jvm/internal/C;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v3, LHf/z;

    .line 43
    .line 44
    const/4 v4, 0x5

    .line 45
    invoke-direct {v3, v1, p1, v4}, LHf/z;-><init>(Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iput v2, p0, LHf/r0;->a:I

    .line 49
    .line 50
    iget-object p1, p0, LHf/r0;->c:LIf/E;

    .line 51
    .line 52
    invoke-virtual {p1, v3, p0}, LHf/j0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-object v0
.end method
