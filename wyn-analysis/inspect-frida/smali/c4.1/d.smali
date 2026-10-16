.class public final Lc4/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lc4/h;

.field public final synthetic c:Lkotlin/jvm/internal/G;

.field public final synthetic d:Lkotlin/jvm/internal/G;

.field public final synthetic e:Lh4/h;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lkotlin/jvm/internal/G;

.field public final synthetic h:LX3/c;


# direct methods
.method public constructor <init>(Lc4/h;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lh4/h;Ljava/lang/Object;Lkotlin/jvm/internal/G;LX3/c;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/d;->b:Lc4/h;

    .line 2
    .line 3
    iput-object p2, p0, Lc4/d;->c:Lkotlin/jvm/internal/G;

    .line 4
    .line 5
    iput-object p3, p0, Lc4/d;->d:Lkotlin/jvm/internal/G;

    .line 6
    .line 7
    iput-object p4, p0, Lc4/d;->e:Lh4/h;

    .line 8
    .line 9
    iput-object p5, p0, Lc4/d;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p6, p0, Lc4/d;->g:Lkotlin/jvm/internal/G;

    .line 12
    .line 13
    iput-object p7, p0, Lc4/d;->h:LX3/c;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Llf/j;-><init>(ILjf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 9

    .line 1
    new-instance v0, Lc4/d;

    .line 2
    .line 3
    iget-object v6, p0, Lc4/d;->g:Lkotlin/jvm/internal/G;

    .line 4
    .line 5
    iget-object v7, p0, Lc4/d;->h:LX3/c;

    .line 6
    .line 7
    iget-object v1, p0, Lc4/d;->b:Lc4/h;

    .line 8
    .line 9
    iget-object v2, p0, Lc4/d;->c:Lkotlin/jvm/internal/G;

    .line 10
    .line 11
    iget-object v3, p0, Lc4/d;->d:Lkotlin/jvm/internal/G;

    .line 12
    .line 13
    iget-object v4, p0, Lc4/d;->e:Lh4/h;

    .line 14
    .line 15
    iget-object v5, p0, Lc4/d;->f:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lc4/d;-><init>(Lc4/h;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lh4/h;Ljava/lang/Object;Lkotlin/jvm/internal/G;LX3/c;Ljf/c;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, Lc4/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc4/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc4/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lc4/d;->a:I

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
    iget-object p1, p0, Lc4/d;->c:Lkotlin/jvm/internal/G;

    .line 26
    .line 27
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    check-cast v4, Lb4/m;

    .line 31
    .line 32
    iget-object p1, p0, Lc4/d;->d:Lkotlin/jvm/internal/G;

    .line 33
    .line 34
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, LX3/b;

    .line 38
    .line 39
    iget-object p1, p0, Lc4/d;->g:Lkotlin/jvm/internal/G;

    .line 40
    .line 41
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v8, p1

    .line 44
    check-cast v8, Lh4/l;

    .line 45
    .line 46
    iput v2, p0, Lc4/d;->a:I

    .line 47
    .line 48
    iget-object v6, p0, Lc4/d;->e:Lh4/h;

    .line 49
    .line 50
    iget-object v7, p0, Lc4/d;->f:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v9, p0, Lc4/d;->h:LX3/c;

    .line 53
    .line 54
    iget-object v3, p0, Lc4/d;->b:Lc4/h;

    .line 55
    .line 56
    move-object v10, p0

    .line 57
    invoke-static/range {v3 .. v10}, Lc4/h;->a(Lc4/h;Lb4/m;LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    return-object p1
.end method
