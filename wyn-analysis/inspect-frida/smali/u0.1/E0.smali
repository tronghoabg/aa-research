.class public final Lu0/E0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LHf/v0;

.field public final synthetic c:Lu0/b0;


# direct methods
.method public constructor <init>(LHf/v0;Lu0/b0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/E0;->b:LHf/v0;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/E0;->c:Lu0/b0;

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
    new-instance p1, Lu0/E0;

    .line 2
    .line 3
    iget-object v0, p0, Lu0/E0;->b:LHf/v0;

    .line 4
    .line 5
    iget-object v1, p0, Lu0/E0;->c:Lu0/b0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lu0/E0;-><init>(LHf/v0;Lu0/b0;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lu0/E0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/E0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/E0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lu0/E0;->a:I

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
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LB3/a;

    .line 26
    .line 27
    iget-object v1, p0, Lu0/E0;->c:Lu0/b0;

    .line 28
    .line 29
    const/16 v3, 0xa

    .line 30
    .line 31
    invoke-direct {p1, v1, v3}, LB3/a;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    iput v2, p0, Lu0/E0;->a:I

    .line 35
    .line 36
    iget-object v1, p0, Lu0/E0;->b:LHf/v0;

    .line 37
    .line 38
    invoke-interface {v1, p1, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    :goto_0
    new-instance p1, LE5/Q;

    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
