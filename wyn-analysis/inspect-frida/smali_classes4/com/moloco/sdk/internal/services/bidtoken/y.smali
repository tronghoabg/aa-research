.class public final Lcom/moloco/sdk/internal/services/bidtoken/y;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/services/bidtoken/A;

.field public final synthetic c:Lcom/moloco/sdk/internal/z;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Lcom/moloco/sdk/internal/z;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->b:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->c:Lcom/moloco/sdk/internal/z;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/services/bidtoken/y;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->b:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->c:Lcom/moloco/sdk/internal/z;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/moloco/sdk/internal/services/bidtoken/y;-><init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Lcom/moloco/sdk/internal/z;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/internal/services/bidtoken/y;->create(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/moloco/sdk/internal/services/bidtoken/y;

    .line 8
    .line 9
    sget-object v0, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/moloco/sdk/internal/services/bidtoken/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->a:I

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
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->b:Lcom/moloco/sdk/internal/services/bidtoken/A;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/moloco/sdk/internal/services/bidtoken/A;->c:LG9/e;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->c:Lcom/moloco/sdk/internal/z;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/moloco/sdk/internal/services/bidtoken/m;

    .line 34
    .line 35
    iput v2, p0, Lcom/moloco/sdk/internal/services/bidtoken/y;->a:I

    .line 36
    .line 37
    invoke-virtual {p1, v1, p0}, LG9/e;->d(Lcom/moloco/sdk/internal/services/bidtoken/m;Llf/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 45
    .line 46
    return-object p1
.end method
