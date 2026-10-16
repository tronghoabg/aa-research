.class public final Lea/I;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lea/r;

.field public b:Lea/K;

.field public c:Lea/G;

.field public d:Ls8/g;

.field public e:Lea/E;

.field public f:Lga/j;

.field public g:I

.field public final synthetic h:Lea/K;

.field public final synthetic i:Lea/E;


# direct methods
.method public constructor <init>(Lea/K;Lea/E;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea/I;->h:Lea/K;

    .line 2
    .line 3
    iput-object p2, p0, Lea/I;->i:Lea/E;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lea/I;

    .line 2
    .line 3
    iget-object v0, p0, Lea/I;->h:Lea/K;

    .line 4
    .line 5
    iget-object v1, p0, Lea/I;->i:Lea/E;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lea/I;-><init>(Lea/K;Lea/E;Ljf/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lea/I;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lea/I;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lea/I;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v1, Lea/I;->g:I

    .line 6
    .line 7
    iget-object v3, v1, Lea/I;->h:Lea/K;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    if-eq v2, v6, :cond_2

    .line 15
    .line 16
    if-eq v2, v5, :cond_1

    .line 17
    .line 18
    if-ne v2, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, v1, Lea/I;->f:Lga/j;

    .line 21
    .line 22
    iget-object v2, v1, Lea/I;->e:Lea/E;

    .line 23
    .line 24
    iget-object v3, v1, Lea/I;->d:Ls8/g;

    .line 25
    .line 26
    iget-object v4, v1, Lea/I;->c:Lea/G;

    .line 27
    .line 28
    iget-object v5, v1, Lea/I;->b:Lea/K;

    .line 29
    .line 30
    iget-object v6, v1, Lea/I;->a:Lea/r;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v7, v5

    .line 36
    move-object v5, v3

    .line 37
    move-object v3, v7

    .line 38
    move-object v7, v6

    .line 39
    move-object v6, v4

    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object/from16 v2, p1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v2, p1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput v6, v1, Lea/I;->g:I

    .line 67
    .line 68
    invoke-static {v3, v1}, Lea/K;->a(Lea/K;Llf/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-ne v2, v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_b

    .line 82
    .line 83
    sget-object v2, Lea/r;->c:Lea/Y;

    .line 84
    .line 85
    iget-object v6, v3, Lea/K;->b:LP9/d;

    .line 86
    .line 87
    iput v5, v1, Lea/I;->g:I

    .line 88
    .line 89
    invoke-virtual {v2, v6, v1}, Lea/Y;->a(LP9/d;Llf/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-ne v2, v0, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    :goto_1
    move-object v6, v2

    .line 97
    check-cast v6, Lea/r;

    .line 98
    .line 99
    sget-object v2, Lea/G;->a:Lea/G;

    .line 100
    .line 101
    iget-object v5, v3, Lea/K;->a:Ls8/g;

    .line 102
    .line 103
    iget-object v7, v3, Lea/K;->c:Lga/j;

    .line 104
    .line 105
    sget-object v8, Lfa/c;->a:Lfa/c;

    .line 106
    .line 107
    iput-object v6, v1, Lea/I;->a:Lea/r;

    .line 108
    .line 109
    iput-object v3, v1, Lea/I;->b:Lea/K;

    .line 110
    .line 111
    iput-object v2, v1, Lea/I;->c:Lea/G;

    .line 112
    .line 113
    iput-object v5, v1, Lea/I;->d:Ls8/g;

    .line 114
    .line 115
    iget-object v9, v1, Lea/I;->i:Lea/E;

    .line 116
    .line 117
    iput-object v9, v1, Lea/I;->e:Lea/E;

    .line 118
    .line 119
    iput-object v7, v1, Lea/I;->f:Lga/j;

    .line 120
    .line 121
    iput v4, v1, Lea/I;->g:I

    .line 122
    .line 123
    invoke-virtual {v8, v1}, Lfa/c;->b(Llf/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-ne v4, v0, :cond_6

    .line 128
    .line 129
    :goto_2
    return-object v0

    .line 130
    :cond_6
    move-object v0, v7

    .line 131
    move-object v7, v6

    .line 132
    move-object v6, v2

    .line 133
    move-object v2, v9

    .line 134
    :goto_3
    check-cast v4, Ljava/util/Map;

    .line 135
    .line 136
    iget-object v15, v7, Lea/r;->a:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const-string v6, "firebaseApp"

    .line 142
    .line 143
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string v6, "sessionDetails"

    .line 147
    .line 148
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string v6, "sessionsSettings"

    .line 152
    .line 153
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v6, "subscribers"

    .line 157
    .line 158
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget-object v6, v7, Lea/r;->b:Ljava/lang/String;

    .line 162
    .line 163
    const-string v7, "firebaseAuthenticationToken"

    .line 164
    .line 165
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v7, Lea/F;

    .line 169
    .line 170
    new-instance v8, Lea/N;

    .line 171
    .line 172
    new-instance v14, Lea/j;

    .line 173
    .line 174
    sget-object v9, Lfa/d;->b:Lfa/d;

    .line 175
    .line 176
    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    check-cast v9, LR8/j;

    .line 181
    .line 182
    sget-object v10, Lea/i;->d:Lea/i;

    .line 183
    .line 184
    sget-object v11, Lea/i;->c:Lea/i;

    .line 185
    .line 186
    sget-object v12, Lea/i;->b:Lea/i;

    .line 187
    .line 188
    if-nez v9, :cond_7

    .line 189
    .line 190
    move-object v9, v12

    .line 191
    goto :goto_4

    .line 192
    :cond_7
    iget-object v9, v9, LR8/j;->a:LR0/e;

    .line 193
    .line 194
    invoke-virtual {v9}, LR0/e;->f()Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-eqz v9, :cond_8

    .line 199
    .line 200
    move-object v9, v11

    .line 201
    goto :goto_4

    .line 202
    :cond_8
    move-object v9, v10

    .line 203
    :goto_4
    sget-object v13, Lfa/d;->a:Lfa/d;

    .line 204
    .line 205
    invoke-interface {v4, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, LR8/j;

    .line 210
    .line 211
    if-nez v4, :cond_9

    .line 212
    .line 213
    move-object v10, v12

    .line 214
    goto :goto_5

    .line 215
    :cond_9
    iget-object v4, v4, LR8/j;->a:LR0/e;

    .line 216
    .line 217
    invoke-virtual {v4}, LR0/e;->f()Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_a

    .line 222
    .line 223
    move-object v10, v11

    .line 224
    :cond_a
    :goto_5
    invoke-virtual {v0}, Lga/j;->a()D

    .line 225
    .line 226
    .line 227
    move-result-wide v11

    .line 228
    invoke-direct {v14, v9, v10, v11, v12}, Lea/j;-><init>(Lea/i;Lea/i;D)V

    .line 229
    .line 230
    .line 231
    iget-object v9, v2, Lea/E;->a:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v10, v2, Lea/E;->b:Ljava/lang/String;

    .line 234
    .line 235
    iget v11, v2, Lea/E;->c:I

    .line 236
    .line 237
    iget-wide v12, v2, Lea/E;->d:J

    .line 238
    .line 239
    move-object/from16 v16, v6

    .line 240
    .line 241
    invoke-direct/range {v8 .. v16}, Lea/N;-><init>(Ljava/lang/String;Ljava/lang/String;IJLea/j;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v5}, Lea/G;->a(Ls8/g;)Lea/b;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {v7, v8, v0}, Lea/F;-><init>(Lea/N;Lea/b;)V

    .line 249
    .line 250
    .line 251
    sget v0, Lea/K;->g:I

    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const-string v2, "SessionFirelogPublisher"

    .line 257
    .line 258
    :try_start_0
    iget-object v0, v3, Lea/K;->d:La2/v;

    .line 259
    .line 260
    invoke-virtual {v0, v7}, La2/v;->x(Lea/F;)V

    .line 261
    .line 262
    .line 263
    const-string v0, "Successfully logged Session Start event."

    .line 264
    .line 265
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :catch_0
    move-exception v0

    .line 270
    const-string v3, "Error logging Session Start event to DataTransport: "

    .line 271
    .line 272
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 273
    .line 274
    .line 275
    :cond_b
    :goto_6
    sget-object v0, Lef/C;->a:Lef/C;

    .line 276
    .line 277
    return-object v0
.end method
