.class public final Lcom/moloco/sdk/internal/publisher/g0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

.field public final synthetic c:LX2/j;

.field public final synthetic d:Lcom/moloco/sdk/internal/publisher/l0;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;LX2/j;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/g0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/g0;->c:LX2/j;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/g0;->d:Lcom/moloco/sdk/internal/publisher/l0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/publisher/g0;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/g0;->d:Lcom/moloco/sdk/internal/publisher/l0;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/g0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/g0;->c:LX2/j;

    .line 8
    .line 9
    invoke-direct {p1, v1, v2, v0, p2}, Lcom/moloco/sdk/internal/publisher/g0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;LX2/j;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/g0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/g0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/internal/publisher/g0;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/g0;->d:Lcom/moloco/sdk/internal/publisher/l0;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/g0;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x6

    .line 11
    iget-object v2, v2, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/moloco/sdk/internal/publisher/g0;->c:LX2/j;

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x2

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eq v1, v7, :cond_1

    .line 20
    .line 21
    if-ne v1, v8, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;->l()LHf/v0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Lcom/moloco/sdk/internal/publisher/e0;

    .line 47
    .line 48
    invoke-direct {v1, v8, v4}, Llf/j;-><init>(ILjf/c;)V

    .line 49
    .line 50
    .line 51
    iput v7, p0, Lcom/moloco/sdk/internal/publisher/g0;->a:I

    .line 52
    .line 53
    invoke-static {p1, v1, p0}, LHf/k0;->p(LHf/l;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    if-eqz v6, :cond_4

    .line 61
    .line 62
    invoke-static {v2, v4, v4, v5, v4}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const-string v1, "molocoAd"

    .line 70
    .line 71
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v6, LX2/j;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Lcom/moloco/sdk/internal/publisher/b;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-virtual {v1, p1, v7}, Lcom/moloco/sdk/internal/publisher/b;->b(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    invoke-interface {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;->l()LHf/v0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance v1, Lcom/moloco/sdk/internal/publisher/f0;

    .line 87
    .line 88
    invoke-direct {v1, v8, v4}, Llf/j;-><init>(ILjf/c;)V

    .line 89
    .line 90
    .line 91
    iput v8, p0, Lcom/moloco/sdk/internal/publisher/g0;->a:I

    .line 92
    .line 93
    invoke-static {p1, v1, p0}, LHf/k0;->p(LHf/l;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v0, :cond_5

    .line 98
    .line 99
    :goto_1
    return-object v0

    .line 100
    :cond_5
    :goto_2
    if-eqz v6, :cond_6

    .line 101
    .line 102
    invoke-static {v2, v4, v4, v5, v4}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v6, p1}, LX2/j;->W(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 110
    .line 111
    return-object p1
.end method
