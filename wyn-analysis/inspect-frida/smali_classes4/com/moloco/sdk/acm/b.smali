.class public final Lcom/moloco/sdk/acm/b;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/util/Iterator;

.field public b:I


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/moloco/sdk/acm/b;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, v0, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/acm/b;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/acm/b;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/acm/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/moloco/sdk/acm/b;->b:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "eventProcessor"

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v6, :cond_1

    .line 15
    .line 16
    if-ne v1, v5, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/moloco/sdk/acm/b;->a:Ljava/util/Iterator;

    .line 19
    .line 20
    check-cast v1, Ljava/util/Iterator;

    .line 21
    .line 22
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    iget-object v1, p0, Lcom/moloco/sdk/acm/b;->a:Ljava/util/Iterator;

    .line 35
    .line 36
    check-cast v1, Ljava/util/Iterator;

    .line 37
    .line 38
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lcom/moloco/sdk/acm/f;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lcom/moloco/sdk/acm/l;

    .line 62
    .line 63
    sget-object v7, Lcom/moloco/sdk/acm/f;->b:LS3/i;

    .line 64
    .line 65
    if-eqz v7, :cond_5

    .line 66
    .line 67
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v8, v1

    .line 71
    check-cast v8, Ljava/util/Iterator;

    .line 72
    .line 73
    iput-object v8, p0, Lcom/moloco/sdk/acm/b;->a:Ljava/util/Iterator;

    .line 74
    .line 75
    iput v6, p0, Lcom/moloco/sdk/acm/b;->b:I

    .line 76
    .line 77
    sget-object v8, LEf/S;->a:LLf/e;

    .line 78
    .line 79
    sget-object v8, LLf/d;->b:LLf/d;

    .line 80
    .line 81
    new-instance v9, Lcom/moloco/sdk/acm/eventprocessing/e;

    .line 82
    .line 83
    invoke-direct {v9, p1, v7, v3}, Lcom/moloco/sdk/acm/eventprocessing/e;-><init>(Lcom/moloco/sdk/acm/l;LS3/i;Ljf/c;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v8, v9, p0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 91
    .line 92
    if-ne p1, v7, :cond_4

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move-object p1, v2

    .line 96
    :goto_1
    if-ne p1, v0, :cond_3

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v3

    .line 103
    :cond_6
    sget-object p1, Lcom/moloco/sdk/acm/f;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_a

    .line 114
    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lcom/moloco/sdk/acm/h;

    .line 120
    .line 121
    sget-object v6, Lcom/moloco/sdk/acm/f;->b:LS3/i;

    .line 122
    .line 123
    if-eqz v6, :cond_9

    .line 124
    .line 125
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v7, v1

    .line 129
    check-cast v7, Ljava/util/Iterator;

    .line 130
    .line 131
    iput-object v7, p0, Lcom/moloco/sdk/acm/b;->a:Ljava/util/Iterator;

    .line 132
    .line 133
    iput v5, p0, Lcom/moloco/sdk/acm/b;->b:I

    .line 134
    .line 135
    sget-object v7, LEf/S;->a:LLf/e;

    .line 136
    .line 137
    sget-object v7, LLf/d;->b:LLf/d;

    .line 138
    .line 139
    new-instance v8, Lcom/moloco/sdk/acm/eventprocessing/c;

    .line 140
    .line 141
    invoke-direct {v8, v6, p1, v3}, Lcom/moloco/sdk/acm/eventprocessing/c;-><init>(LS3/i;Lcom/moloco/sdk/acm/h;Ljf/c;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v7, v8, p0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 149
    .line 150
    if-ne p1, v6, :cond_8

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    move-object p1, v2

    .line 154
    :goto_3
    if-ne p1, v0, :cond_7

    .line 155
    .line 156
    :goto_4
    return-object v0

    .line 157
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v3

    .line 161
    :cond_a
    sget-object p1, Lcom/moloco/sdk/acm/f;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 164
    .line 165
    .line 166
    sget-object p1, Lcom/moloco/sdk/acm/f;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 169
    .line 170
    .line 171
    return-object v2
.end method
