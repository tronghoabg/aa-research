.class public final LY3/h;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LY3/n;

.field public b:I

.field public final synthetic c:LY3/n;


# direct methods
.method public constructor <init>(LY3/n;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY3/h;->c:LY3/n;

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
    .locals 1

    .line 1
    new-instance p1, LY3/h;

    .line 2
    .line 3
    iget-object v0, p0, LY3/h;->c:LY3/n;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LY3/h;-><init>(LY3/n;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lh4/h;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LY3/h;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LY3/h;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LY3/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 3
    .line 4
    iget v2, p0, LY3/h;->b:I

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LY3/h;->a:LY3/n;

    .line 13
    .line 14
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
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
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, LY3/h;->c:LY3/n;

    .line 31
    .line 32
    iget-object v2, p1, LY3/n;->s:LN/Y;

    .line 33
    .line 34
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, LX3/k;

    .line 39
    .line 40
    iget-object v5, p1, LY3/n;->r:LN/Y;

    .line 41
    .line 42
    invoke-virtual {v5}, LN/Y;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Lh4/h;

    .line 47
    .line 48
    invoke-static {v5}, Lh4/h;->a(Lh4/h;)Lh4/g;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    new-instance v7, Ly3/j;

    .line 53
    .line 54
    const/16 v8, 0x1b

    .line 55
    .line 56
    invoke-direct {v7, p1, v8}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    iput-object v7, v6, Lh4/g;->d:Ly3/j;

    .line 60
    .line 61
    iput-object v4, v6, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 62
    .line 63
    iput-object v4, v6, Lh4/g;->n:Li4/g;

    .line 64
    .line 65
    iput v0, v6, Lh4/g;->q:I

    .line 66
    .line 67
    iget-object v5, v5, Lh4/h;->t:Lh4/c;

    .line 68
    .line 69
    iget-object v7, v5, Lh4/c;->a:Li4/g;

    .line 70
    .line 71
    if-nez v7, :cond_2

    .line 72
    .line 73
    new-instance v7, LY3/m;

    .line 74
    .line 75
    invoke-direct {v7, p1}, LY3/m;-><init>(LY3/n;)V

    .line 76
    .line 77
    .line 78
    iput-object v7, v6, Lh4/g;->l:Li4/g;

    .line 79
    .line 80
    iput-object v4, v6, Lh4/g;->m:Landroidx/lifecycle/o;

    .line 81
    .line 82
    iput-object v4, v6, Lh4/g;->n:Li4/g;

    .line 83
    .line 84
    iput v0, v6, Lh4/g;->q:I

    .line 85
    .line 86
    :cond_2
    iget v7, v5, Lh4/c;->b:I

    .line 87
    .line 88
    const/4 v8, 0x2

    .line 89
    if-nez v7, :cond_5

    .line 90
    .line 91
    iget-object v7, p1, LY3/n;->n:Lr0/h;

    .line 92
    .line 93
    sget v9, LY3/u;->b:I

    .line 94
    .line 95
    sget-object v9, Lr0/g;->b:Lr0/f;

    .line 96
    .line 97
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_3

    .line 102
    .line 103
    move v7, v3

    .line 104
    goto :goto_0

    .line 105
    :cond_3
    sget-object v9, Lr0/g;->c:Lr0/f;

    .line 106
    .line 107
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    :goto_0
    if-eqz v7, :cond_4

    .line 112
    .line 113
    move v7, v8

    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move v7, v3

    .line 116
    :goto_1
    iput v7, v6, Lh4/g;->p:I

    .line 117
    .line 118
    :cond_5
    iget v5, v5, Lh4/c;->c:I

    .line 119
    .line 120
    if-eq v5, v3, :cond_6

    .line 121
    .line 122
    iput v8, v6, Lh4/g;->o:I

    .line 123
    .line 124
    :cond_6
    invoke-virtual {v6}, Lh4/g;->a()Lh4/h;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iput-object p1, p0, LY3/h;->a:LY3/n;

    .line 129
    .line 130
    iput v3, p0, LY3/h;->b:I

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v3, LX3/g;

    .line 136
    .line 137
    invoke-direct {v3, v2, v5, v4}, LX3/g;-><init>(LX3/k;Lh4/h;Ljf/c;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    if-ne v2, v1, :cond_7

    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_7
    move-object v1, p1

    .line 148
    move-object p1, v2

    .line 149
    :goto_2
    check-cast p1, Lh4/i;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    instance-of v2, p1, Lh4/o;

    .line 155
    .line 156
    if-eqz v2, :cond_8

    .line 157
    .line 158
    new-instance v0, LY3/f;

    .line 159
    .line 160
    check-cast p1, Lh4/o;

    .line 161
    .line 162
    iget-object v2, p1, Lh4/o;->a:Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    invoke-virtual {v1, v2}, LY3/n;->h(Landroid/graphics/drawable/Drawable;)Lh0/c;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v1, p1}, LY3/f;-><init>(Lh0/c;Lh4/o;)V

    .line 169
    .line 170
    .line 171
    return-object v0

    .line 172
    :cond_8
    instance-of v2, p1, Lh4/d;

    .line 173
    .line 174
    if-eqz v2, :cond_a

    .line 175
    .line 176
    new-instance v0, LY3/d;

    .line 177
    .line 178
    move-object v2, p1

    .line 179
    check-cast v2, Lh4/d;

    .line 180
    .line 181
    iget-object v2, v2, Lh4/d;->a:Landroid/graphics/drawable/Drawable;

    .line 182
    .line 183
    if-eqz v2, :cond_9

    .line 184
    .line 185
    invoke-virtual {v1, v2}, LY3/n;->h(Landroid/graphics/drawable/Drawable;)Lh0/c;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    :cond_9
    check-cast p1, Lh4/d;

    .line 190
    .line 191
    invoke-direct {v0, v4, p1}, LY3/d;-><init>(Lh0/c;Lh4/d;)V

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_a
    new-instance p1, LE5/Q;

    .line 196
    .line 197
    const/16 v1, 0x9

    .line 198
    .line 199
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(BI)V

    .line 200
    .line 201
    .line 202
    throw p1
.end method
