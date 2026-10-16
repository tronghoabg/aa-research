.class public final Lcom/moloco/sdk/acm/a;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LNf/a;

.field public b:I

.field public final synthetic c:Lcom/moloco/sdk/acm/j;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/acm/j;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/acm/a;->c:Lcom/moloco/sdk/acm/j;

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
    new-instance p1, Lcom/moloco/sdk/acm/a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/acm/a;->c:Lcom/moloco/sdk/acm/j;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/moloco/sdk/acm/a;-><init>(Lcom/moloco/sdk/acm/j;Ljf/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/acm/a;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/acm/a;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/acm/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/acm/a;->c:Lcom/moloco/sdk/acm/j;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/moloco/sdk/acm/j;->c:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    iget v2, p0, Lcom/moloco/sdk/acm/a;->b:I

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    const-string v4, "AndroidClientMetrics"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x1

    .line 15
    const/4 v7, 0x2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-eq v2, v6, :cond_1

    .line 19
    .line 20
    if-ne v2, v7, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/moloco/sdk/acm/a;->a:LNf/a;

    .line 23
    .line 24
    check-cast v0, LNf/a;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    iget-object v0, p0, Lcom/moloco/sdk/acm/a;->a:LNf/a;

    .line 43
    .line 44
    check-cast v0, LNf/a;

    .line 45
    .line 46
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catch_1
    move-exception p1

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_2
    sget-object p1, Lcom/moloco/sdk/acm/db/MetricsDb;->m:La9/a;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, La9/a;->h(Landroid/content/Context;)Lcom/moloco/sdk/acm/db/MetricsDb;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/moloco/sdk/acm/db/MetricsDb;->p()Lcom/moloco/sdk/acm/db/e;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v2, Lad/r;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v8, LY2/B;

    .line 75
    .line 76
    sget-object v9, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 77
    .line 78
    sget-object v9, Lcom/moloco/sdk/acm/f;->d:Lcom/moloco/sdk/acm/n;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 79
    .line 80
    const-string v10, "opsConfig"

    .line 81
    .line 82
    if-eqz v9, :cond_8

    .line 83
    .line 84
    :try_start_3
    invoke-direct {v8, v9, v0}, LY2/B;-><init>(Lcom/moloco/sdk/acm/n;Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    new-instance v9, LC6/l;

    .line 88
    .line 89
    sget-object v11, Lcom/moloco/sdk/acm/f;->d:Lcom/moloco/sdk/acm/n;

    .line 90
    .line 91
    if-eqz v11, :cond_7

    .line 92
    .line 93
    sget-object v10, Lcom/moloco/sdk/acm/f;->g:LKd/a;

    .line 94
    .line 95
    invoke-direct {v9, v8, v11, v10}, LC6/l;-><init>(LY2/B;Lcom/moloco/sdk/acm/n;LKd/a;)V

    .line 96
    .line 97
    .line 98
    sput-object v9, Lcom/moloco/sdk/acm/f;->k:LC6/l;

    .line 99
    .line 100
    new-instance v9, Lba/a;

    .line 101
    .line 102
    invoke-direct {v9, v0}, Lba/a;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lb7/k;

    .line 106
    .line 107
    sget-object v11, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 108
    .line 109
    iget-object v11, v11, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 110
    .line 111
    new-instance v12, Lcom/moloco/sdk/acm/services/b;

    .line 112
    .line 113
    invoke-direct {v12, v8, v10, v9}, Lcom/moloco/sdk/acm/services/b;-><init>(LY2/B;LKd/a;Lba/a;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v11, v12}, Lb7/k;-><init>(Landroidx/lifecycle/o;Lcom/moloco/sdk/acm/services/b;)V

    .line 117
    .line 118
    .line 119
    sput-object v0, Lcom/moloco/sdk/acm/f;->c:Lb7/k;

    .line 120
    .line 121
    new-instance v0, LS3/i;

    .line 122
    .line 123
    sget-object v8, Lcom/moloco/sdk/acm/f;->k:LC6/l;

    .line 124
    .line 125
    if-eqz v8, :cond_6

    .line 126
    .line 127
    sget-object v9, Lcom/moloco/sdk/acm/f;->c:Lb7/k;

    .line 128
    .line 129
    if-eqz v9, :cond_5

    .line 130
    .line 131
    invoke-direct {v0, p1, v2, v8, v9}, LS3/i;-><init>(Lcom/moloco/sdk/acm/db/e;Lad/r;LC6/l;Lb7/k;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/moloco/sdk/acm/f;->b:LS3/i;

    .line 135
    .line 136
    sget-object p1, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 137
    .line 138
    sget-object v0, Lcom/moloco/sdk/acm/o;->a:Lcom/moloco/sdk/acm/o;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    sget-object p1, Lcom/moloco/sdk/acm/f;->f:LNf/d;

    .line 144
    .line 145
    iput-object p1, p0, Lcom/moloco/sdk/acm/a;->a:LNf/a;

    .line 146
    .line 147
    iput v6, p0, Lcom/moloco/sdk/acm/a;->b:I

    .line 148
    .line 149
    invoke-virtual {p1, p0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 153
    if-ne v0, v1, :cond_3

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    move-object v0, p1

    .line 157
    :goto_0
    :try_start_4
    sget-object p1, Lcom/moloco/sdk/acm/f;->e:Lcom/moloco/sdk/acm/m;

    .line 158
    .line 159
    if-eqz p1, :cond_4

    .line 160
    .line 161
    sget-object v2, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 162
    .line 163
    sput-object v5, Lcom/moloco/sdk/acm/f;->e:Lcom/moloco/sdk/acm/m;

    .line 164
    .line 165
    const-string v2, "Updating config with pending config"

    .line 166
    .line 167
    invoke-static {v4, v2}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object v2, v0

    .line 171
    check-cast v2, LNf/a;

    .line 172
    .line 173
    iput-object v2, p0, Lcom/moloco/sdk/acm/a;->a:LNf/a;

    .line 174
    .line 175
    iput v7, p0, Lcom/moloco/sdk/acm/a;->b:I

    .line 176
    .line 177
    invoke-static {p1, p0}, Lcom/moloco/sdk/acm/f;->d(Lcom/moloco/sdk/acm/m;Llf/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 181
    if-ne p1, v1, :cond_4

    .line 182
    .line 183
    :goto_1
    return-object v1

    .line 184
    :cond_4
    :goto_2
    :try_start_5
    invoke-interface {v0, v5}, LNf/a;->a(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p1, Lcom/moloco/sdk/acm/f;->g:LKd/a;

    .line 188
    .line 189
    new-instance v0, Lcom/moloco/sdk/acm/b;

    .line 190
    .line 191
    invoke-direct {v0, v7, v5}, Llf/j;-><init>(ILjf/c;)V

    .line 192
    .line 193
    .line 194
    const/4 v1, 0x3

    .line 195
    invoke-static {p1, v5, v0, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :goto_3
    invoke-interface {v0, v5}, LNf/a;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_5
    const-string p1, "applicationLifecycleTracker"

    .line 204
    .line 205
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v5

    .line 209
    :cond_6
    const-string p1, "requestScheduler"

    .line 210
    .line 211
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v5

    .line 215
    :cond_7
    invoke-static {v10}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v5

    .line 219
    :cond_8
    invoke-static {v10}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v5
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 223
    :goto_4
    const-string v0, "Initialization error"

    .line 224
    .line 225
    invoke-static {v3, p1, v4, v0}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    sget-object p1, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 229
    .line 230
    sget-object v0, Lcom/moloco/sdk/acm/o;->c:Lcom/moloco/sdk/acm/o;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :goto_5
    const-string v0, "MetricsDb"

    .line 237
    .line 238
    const-string v1, "Unable to create metrics db"

    .line 239
    .line 240
    invoke-static {v3, p1, v0, v1}, Lcom/moloco/sdk/acm/services/e;->b(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    sget-object p1, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 244
    .line 245
    sget-object v0, Lcom/moloco/sdk/acm/o;->c:Lcom/moloco/sdk/acm/o;

    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :goto_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 251
    .line 252
    return-object p1
.end method
