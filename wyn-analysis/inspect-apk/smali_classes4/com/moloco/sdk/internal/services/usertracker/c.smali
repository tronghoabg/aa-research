.class public final Lcom/moloco/sdk/internal/services/usertracker/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La9/a;

.field public final b:Lcom/moloco/sdk/internal/services/usertracker/a;

.field public final c:LNf/d;


# direct methods
.method public constructor <init>(La9/a;Lcom/moloco/sdk/internal/services/usertracker/a;)V
    .locals 1

    .line 1
    const-string v0, "idRepository"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/usertracker/c;->a:La9/a;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/usertracker/c;->b:Lcom/moloco/sdk/internal/services/usertracker/a;

    .line 12
    .line 13
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/usertracker/c;->c:LNf/d;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Llf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lcom/moloco/sdk/internal/services/usertracker/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/usertracker/b;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/usertracker/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/moloco/sdk/internal/services/usertracker/b;-><init>(Lcom/moloco/sdk/internal/services/usertracker/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const-string v4, "com.moloco.sdk.mref"

    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v7, :cond_3

    .line 40
    .line 41
    if-eq v2, v6, :cond_2

    .line 42
    .line 43
    if-ne v2, v5, :cond_1

    .line 44
    .line 45
    iget-object v1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, LNf/a;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, LNf/a;

    .line 72
    .line 73
    iget-object v6, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    iget-object v2, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, LNf/a;

    .line 84
    .line 85
    iget-object v7, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v7, Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 88
    .line 89
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v2

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iput-object p0, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 98
    .line 99
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/usertracker/c;->c:LNf/d;

    .line 100
    .line 101
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 102
    .line 103
    iput v7, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 104
    .line 105
    invoke-virtual {p1, v0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-ne v2, v1, :cond_5

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move-object v7, p0

    .line 113
    :goto_1
    :try_start_2
    iget-object v2, v7, Lcom/moloco/sdk/internal/services/usertracker/c;->b:Lcom/moloco/sdk/internal/services/usertracker/a;

    .line 114
    .line 115
    iput-object v7, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 118
    .line 119
    iput v6, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 120
    .line 121
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/usertracker/a;->a:Lcom/moloco/sdk/internal/services/g;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object v6, LEf/S;->a:LLf/e;

    .line 127
    .line 128
    sget-object v6, LLf/d;->b:LLf/d;

    .line 129
    .line 130
    new-instance v8, Lcom/moloco/sdk/internal/services/d;

    .line 131
    .line 132
    invoke-direct {v8, v2, v4, v3}, Lcom/moloco/sdk/internal/services/d;-><init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v6, v8, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    if-ne v2, v1, :cond_6

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    move-object v6, v2

    .line 143
    move-object v2, p1

    .line 144
    move-object p1, v6

    .line 145
    move-object v6, v7

    .line 146
    :goto_2
    :try_start_3
    check-cast p1, Ljava/lang/String;

    .line 147
    .line 148
    if-nez p1, :cond_8

    .line 149
    .line 150
    iget-object p1, v6, Lcom/moloco/sdk/internal/services/usertracker/c;->a:La9/a;

    .line 151
    .line 152
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string v7, "toString(...)"

    .line 161
    .line 162
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-object v6, v6, Lcom/moloco/sdk/internal/services/usertracker/c;->b:Lcom/moloco/sdk/internal/services/usertracker/a;

    .line 166
    .line 167
    iput-object v2, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->a:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object p1, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->b:Ljava/lang/Object;

    .line 170
    .line 171
    iput v5, v0, Lcom/moloco/sdk/internal/services/usertracker/b;->e:I

    .line 172
    .line 173
    iget-object v5, v6, Lcom/moloco/sdk/internal/services/usertracker/a;->a:Lcom/moloco/sdk/internal/services/g;

    .line 174
    .line 175
    invoke-virtual {v5, v4, p1, v0}, Lcom/moloco/sdk/internal/services/g;->a(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-ne v0, v1, :cond_7

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    sget-object v0, Lef/C;->a:Lef/C;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 183
    .line 184
    :goto_3
    if-ne v0, v1, :cond_8

    .line 185
    .line 186
    :goto_4
    return-object v1

    .line 187
    :cond_8
    move-object v1, p1

    .line 188
    move-object v0, v2

    .line 189
    goto :goto_5

    .line 190
    :catchall_1
    move-exception p1

    .line 191
    goto :goto_8

    .line 192
    :goto_5
    invoke-interface {v0, v3}, LNf/a;->a(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :goto_6
    move-object v9, v0

    .line 197
    move-object v0, p1

    .line 198
    move-object p1, v9

    .line 199
    goto :goto_7

    .line 200
    :catchall_2
    move-exception v0

    .line 201
    goto :goto_6

    .line 202
    :goto_7
    move-object v2, v0

    .line 203
    :goto_8
    invoke-interface {v2, v3}, LNf/a;->a(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    throw p1
.end method
