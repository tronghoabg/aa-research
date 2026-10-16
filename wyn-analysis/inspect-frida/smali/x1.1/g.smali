.class public final Lx1/g;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Llf/j;


# direct methods
.method public constructor <init>(Ltf/p;Ljf/c;)V
    .locals 0

    .line 1
    check-cast p1, Llf/j;

    .line 2
    .line 3
    iput-object p1, p0, Lx1/g;->c:Llf/j;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, Lx1/g;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/g;->c:Llf/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lx1/g;-><init>(Ltf/p;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lx1/g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lx1/b;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lx1/g;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lx1/g;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lx1/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lx1/g;->a:I

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
    iget-object v0, p0, Lx1/g;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lx1/b;

    .line 13
    .line 14
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lx1/g;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lx1/b;

    .line 32
    .line 33
    new-instance v1, Lx1/b;

    .line 34
    .line 35
    iget-object p1, p1, Lx1/b;->a:Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v3, "unmodifiableMap(preferencesMap)"

    .line 42
    .line 43
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v1, p1, v3}, Lx1/b;-><init>(Ljava/util/LinkedHashMap;Z)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lx1/g;->b:Ljava/lang/Object;

    .line 55
    .line 56
    iput v2, p0, Lx1/g;->a:I

    .line 57
    .line 58
    iget-object p1, p0, Lx1/g;->c:Llf/j;

    .line 59
    .line 60
    invoke-interface {p1, v1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    return-object v1
.end method
