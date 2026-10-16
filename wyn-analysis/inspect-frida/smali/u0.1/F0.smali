.class public final Lu0/F0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lkotlin/jvm/internal/G;

.field public final synthetic d:LN/p0;

.field public final synthetic e:Landroidx/lifecycle/v;

.field public final synthetic f:Lu0/G0;

.field public final synthetic g:Landroid/view/View;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/G;LN/p0;Landroidx/lifecycle/v;Lu0/G0;Landroid/view/View;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/F0;->c:Lkotlin/jvm/internal/G;

    .line 2
    .line 3
    iput-object p2, p0, Lu0/F0;->d:LN/p0;

    .line 4
    .line 5
    iput-object p3, p0, Lu0/F0;->e:Landroidx/lifecycle/v;

    .line 6
    .line 7
    iput-object p4, p0, Lu0/F0;->f:Lu0/G0;

    .line 8
    .line 9
    iput-object p5, p0, Lu0/F0;->g:Landroid/view/View;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lu0/F0;

    .line 2
    .line 3
    iget-object v4, p0, Lu0/F0;->f:Lu0/G0;

    .line 4
    .line 5
    iget-object v5, p0, Lu0/F0;->g:Landroid/view/View;

    .line 6
    .line 7
    iget-object v1, p0, Lu0/F0;->c:Lkotlin/jvm/internal/G;

    .line 8
    .line 9
    iget-object v2, p0, Lu0/F0;->d:LN/p0;

    .line 10
    .line 11
    iget-object v3, p0, Lu0/F0;->e:Landroidx/lifecycle/v;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lu0/F0;-><init>(Lkotlin/jvm/internal/G;LN/p0;Landroidx/lifecycle/v;Lu0/G0;Landroid/view/View;Ljf/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lu0/F0;->b:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, Lu0/F0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/F0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/F0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lu0/F0;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lu0/F0;->e:Landroidx/lifecycle/v;

    .line 6
    .line 7
    sget-object v3, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v5, p0, Lu0/F0;->f:Lu0/G0;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v6, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lu0/F0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LEf/m0;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lu0/F0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LEf/E;

    .line 43
    .line 44
    :try_start_1
    iget-object v1, p0, Lu0/F0;->c:Lkotlin/jvm/internal/G;

    .line 45
    .line 46
    iget-object v1, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lu0/b0;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v7, p0, Lu0/F0;->g:Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    const-string v8, "context.applicationContext"

    .line 63
    .line 64
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v7}, Lu0/I0;->a(Landroid/content/Context;)LHf/v0;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-interface {v7}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    iget-object v9, v1, Lu0/b0;->a:LN/Y;

    .line 86
    .line 87
    invoke-virtual {v9, v8}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v8, Lu0/E0;

    .line 91
    .line 92
    invoke-direct {v8, v7, v1, v4}, Lu0/E0;-><init>(LHf/v0;Lu0/b0;Ljf/c;)V

    .line 93
    .line 94
    .line 95
    const/4 v1, 0x3

    .line 96
    invoke-static {p1, v4, v8, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 97
    .line 98
    .line 99
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    goto :goto_0

    .line 101
    :catchall_1
    move-exception p1

    .line 102
    move-object v0, v4

    .line 103
    goto :goto_5

    .line 104
    :cond_2
    move-object p1, v4

    .line 105
    :goto_0
    :try_start_2
    iget-object v1, p0, Lu0/F0;->d:LN/p0;

    .line 106
    .line 107
    iput-object p1, p0, Lu0/F0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    iput v6, p0, Lu0/F0;->a:I

    .line 110
    .line 111
    new-instance v6, LN/o0;

    .line 112
    .line 113
    invoke-direct {v6, v1, v4}, LN/o0;-><init>(LN/p0;Ljf/c;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p0}, Ljf/c;->getContext()Ljf/h;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v7}, LN/d;->B(Ljf/h;)LN/Q;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    new-instance v8, LN/m0;

    .line 125
    .line 126
    invoke-direct {v8, v1, v6, v7, v4}, LN/m0;-><init>(LN/p0;LN/o0;LN/Q;Ljf/c;)V

    .line 127
    .line 128
    .line 129
    iget-object v1, v1, LN/p0;->a:LN/g;

    .line 130
    .line 131
    invoke-static {v1, v8, p0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    if-ne v1, v0, :cond_3

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    move-object v1, v3

    .line 139
    :goto_1
    if-ne v1, v0, :cond_4

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    move-object v1, v3

    .line 143
    :goto_2
    if-ne v1, v0, :cond_5

    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_5
    move-object v0, p1

    .line 147
    :goto_3
    if-eqz v0, :cond_6

    .line 148
    .line 149
    invoke-interface {v0, v4}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-interface {v2}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1, v5}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 157
    .line 158
    .line 159
    return-object v3

    .line 160
    :goto_4
    move-object v10, v0

    .line 161
    move-object v0, p1

    .line 162
    move-object p1, v10

    .line 163
    goto :goto_5

    .line 164
    :catchall_2
    move-exception v0

    .line 165
    goto :goto_4

    .line 166
    :goto_5
    if-eqz v0, :cond_7

    .line 167
    .line 168
    invoke-interface {v0, v4}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-interface {v2}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0, v5}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 176
    .line 177
    .line 178
    throw p1
.end method
