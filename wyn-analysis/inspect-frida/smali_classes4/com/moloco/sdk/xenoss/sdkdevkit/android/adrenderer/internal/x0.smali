.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lkotlin/jvm/internal/E;

.field public final synthetic e:LHf/l;

.field public final synthetic f:Lkotlin/jvm/internal/E;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/E;LHf/l;Lkotlin/jvm/internal/E;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->d:Lkotlin/jvm/internal/E;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->e:LHf/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->f:Lkotlin/jvm/internal/E;

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
    .locals 4

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->e:LHf/l;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->f:Lkotlin/jvm/internal/E;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->d:Lkotlin/jvm/internal/E;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;-><init>(Lkotlin/jvm/internal/E;LHf/l;Lkotlin/jvm/internal/E;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/t;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->b:I

    .line 4
    .line 5
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->d:Lkotlin/jvm/internal/E;

    .line 6
    .line 7
    const/4 v8, 0x3

    .line 8
    const/4 v9, 0x2

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v2, :cond_2

    .line 13
    .line 14
    if-eq v1, v9, :cond_1

    .line 15
    .line 16
    if-ne v1, v8, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->a:Lkotlin/jvm/internal/G;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, LGf/t;

    .line 37
    .line 38
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v6, v2

    .line 42
    :goto_1
    move-object v4, v1

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, LGf/t;

    .line 50
    .line 51
    new-instance v1, Lkotlin/jvm/internal/G;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iget v3, v5, Lkotlin/jvm/internal/E;->a:I

    .line 57
    .line 58
    new-instance v4, Lef/u;

    .line 59
    .line 60
    invoke-direct {v4, v3}, Lef/u;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->a:Lkotlin/jvm/internal/G;

    .line 66
    .line 67
    iput v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->b:I

    .line 68
    .line 69
    move-object v2, p1

    .line 70
    check-cast v2, LGf/s;

    .line 71
    .line 72
    iget-object v2, v2, LGf/s;->d:LGf/e;

    .line 73
    .line 74
    invoke-interface {v2, v4, p0}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v0, :cond_4

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    move-object v6, p1

    .line 82
    goto :goto_1

    .line 83
    :goto_2
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->f:Lkotlin/jvm/internal/E;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->e:LHf/l;

    .line 87
    .line 88
    if-nez v1, :cond_7

    .line 89
    .line 90
    iget v1, v3, Lkotlin/jvm/internal/E;->a:I

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    iget-object v1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 95
    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w0;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-direct/range {v2 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w0;-><init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/E;LGf/t;Ljf/c;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v6, p1, v2, v8}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iput-object v1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 110
    .line 111
    :cond_6
    :goto_3
    new-instance v1, LAf/q;

    .line 112
    .line 113
    const/16 v2, 0x12

    .line 114
    .line 115
    invoke-direct {v1, v4, v2}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->a:Lkotlin/jvm/internal/G;

    .line 121
    .line 122
    iput v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->b:I

    .line 123
    .line 124
    invoke-static {v6, v1, p0}, Lp7/b;->f(LGf/t;Ltf/a;Llf/c;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v0, :cond_8

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    invoke-static {v1}, LHf/k0;->m(LHf/l;)LHf/l;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v2, LIf/m;

    .line 136
    .line 137
    invoke-direct {v2, v3, v4, v6, v5}, LIf/m;-><init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/G;LGf/t;Lkotlin/jvm/internal/E;)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->c:Ljava/lang/Object;

    .line 141
    .line 142
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->a:Lkotlin/jvm/internal/G;

    .line 143
    .line 144
    iput v8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x0;->b:I

    .line 145
    .line 146
    invoke-interface {v1, v2, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_8

    .line 151
    .line 152
    :goto_4
    return-object v0

    .line 153
    :cond_8
    :goto_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 154
    .line 155
    return-object p1
.end method
