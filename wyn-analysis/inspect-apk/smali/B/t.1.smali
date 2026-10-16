.class public final LB/t;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Z

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LC/e;

.field public final synthetic e:J

.field public final synthetic f:LD/i;

.field public final synthetic g:LN/V;

.field public final synthetic h:LN/V;


# direct methods
.method public constructor <init>(LC/e;JLD/i;LN/V;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB/t;->d:LC/e;

    .line 2
    .line 3
    iput-wide p2, p0, LB/t;->e:J

    .line 4
    .line 5
    iput-object p4, p0, LB/t;->f:LD/i;

    .line 6
    .line 7
    iput-object p5, p0, LB/t;->g:LN/V;

    .line 8
    .line 9
    iput-object p6, p0, LB/t;->h:LN/V;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 8

    .line 1
    new-instance v0, LB/t;

    .line 2
    .line 3
    iget-object v6, p0, LB/t;->h:LN/V;

    .line 4
    .line 5
    iget-wide v2, p0, LB/t;->e:J

    .line 6
    .line 7
    iget-object v4, p0, LB/t;->f:LD/i;

    .line 8
    .line 9
    iget-object v1, p0, LB/t;->d:LC/e;

    .line 10
    .line 11
    iget-object v5, p0, LB/t;->g:LN/V;

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, LB/t;-><init>(LC/e;JLD/i;LN/V;LN/V;Ljf/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, LB/t;->c:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LB/t;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/t;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, LB/t;->b:I

    .line 6
    .line 7
    sget-object v3, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, LB/t;->g:LN/V;

    .line 12
    .line 13
    const/4 v7, 0x5

    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x2

    .line 16
    const/4 v10, 0x1

    .line 17
    iget-object v11, v0, LB/t;->f:LD/i;

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    if-eq v2, v10, :cond_4

    .line 22
    .line 23
    if-eq v2, v9, :cond_3

    .line 24
    .line 25
    if-eq v2, v4, :cond_2

    .line 26
    .line 27
    if-eq v2, v8, :cond_1

    .line 28
    .line 29
    if-ne v2, v7, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_2
    iget-object v2, v0, LB/t;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, LD/l;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_3
    iget-boolean v2, v0, LB/t;->a:Z

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    iget-object v2, v0, LB/t;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, LEf/m0;

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v7, p1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v0, LB/t;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, LEf/E;

    .line 76
    .line 77
    new-instance v12, LB/s;

    .line 78
    .line 79
    iget-object v13, v0, LB/t;->h:LN/V;

    .line 80
    .line 81
    iget-wide v14, v0, LB/t;->e:J

    .line 82
    .line 83
    iget-object v7, v0, LB/t;->f:LD/i;

    .line 84
    .line 85
    iget-object v8, v0, LB/t;->g:LN/V;

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    move-object/from16 v16, v7

    .line 90
    .line 91
    move-object/from16 v17, v8

    .line 92
    .line 93
    invoke-direct/range {v12 .. v18}, LB/s;-><init>(LN/V;JLD/i;LN/V;Ljf/c;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2, v5, v12, v4}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v0, LB/t;->c:Ljava/lang/Object;

    .line 101
    .line 102
    iput v10, v0, LB/t;->b:I

    .line 103
    .line 104
    iget-object v7, v0, LB/t;->d:LC/e;

    .line 105
    .line 106
    invoke-virtual {v7, v0}, LC/e;->a(Llf/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-ne v7, v1, :cond_6

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_6
    :goto_1
    check-cast v7, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-interface {v2}, LEf/m0;->isActive()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_a

    .line 125
    .line 126
    iput-object v5, v0, LB/t;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput-boolean v7, v0, LB/t;->a:Z

    .line 129
    .line 130
    iput v9, v0, LB/t;->b:I

    .line 131
    .line 132
    invoke-interface {v2, v5}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v0}, LEf/m0;->join(Ljf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-ne v2, v1, :cond_7

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move-object v2, v3

    .line 143
    :goto_2
    if-ne v2, v1, :cond_8

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    move v2, v7

    .line 147
    :goto_3
    if-eqz v2, :cond_c

    .line 148
    .line 149
    new-instance v2, LD/k;

    .line 150
    .line 151
    iget-wide v7, v0, LB/t;->e:J

    .line 152
    .line 153
    invoke-direct {v2, v7, v8}, LD/k;-><init>(J)V

    .line 154
    .line 155
    .line 156
    new-instance v7, LD/l;

    .line 157
    .line 158
    invoke-direct {v7, v2}, LD/l;-><init>(LD/k;)V

    .line 159
    .line 160
    .line 161
    iput-object v7, v0, LB/t;->c:Ljava/lang/Object;

    .line 162
    .line 163
    iput v4, v0, LB/t;->b:I

    .line 164
    .line 165
    invoke-virtual {v11, v2, v0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    if-ne v2, v1, :cond_9

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_9
    move-object v2, v7

    .line 173
    :goto_4
    iput-object v5, v0, LB/t;->c:Ljava/lang/Object;

    .line 174
    .line 175
    const/4 v4, 0x4

    .line 176
    iput v4, v0, LB/t;->b:I

    .line 177
    .line 178
    invoke-virtual {v11, v2, v0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v2, v1, :cond_c

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-interface {v6}, LN/K0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, LD/k;

    .line 190
    .line 191
    if-eqz v2, :cond_c

    .line 192
    .line 193
    if-eqz v7, :cond_b

    .line 194
    .line 195
    new-instance v4, LD/l;

    .line 196
    .line 197
    invoke-direct {v4, v2}, LD/l;-><init>(LD/k;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_b
    new-instance v4, LD/j;

    .line 202
    .line 203
    invoke-direct {v4, v2}, LD/j;-><init>(LD/k;)V

    .line 204
    .line 205
    .line 206
    :goto_5
    iput-object v5, v0, LB/t;->c:Ljava/lang/Object;

    .line 207
    .line 208
    const/4 v2, 0x5

    .line 209
    iput v2, v0, LB/t;->b:I

    .line 210
    .line 211
    invoke-virtual {v11, v4, v0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-ne v2, v1, :cond_c

    .line 216
    .line 217
    :goto_6
    return-object v1

    .line 218
    :cond_c
    :goto_7
    invoke-interface {v6, v5}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-object v3
.end method
