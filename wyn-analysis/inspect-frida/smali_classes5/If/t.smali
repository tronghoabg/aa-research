.class public final LIf/t;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LGf/i;

.field public b:[B

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:[LHf/l;

.field public final synthetic h:LCd/a;

.field public final synthetic i:LHf/m;


# direct methods
.method public constructor <init>([LHf/l;LCd/a;LHf/m;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LIf/t;->g:[LHf/l;

    .line 2
    .line 3
    iput-object p2, p0, LIf/t;->h:LCd/a;

    .line 4
    .line 5
    iput-object p3, p0, LIf/t;->i:LHf/m;

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
    new-instance v0, LIf/t;

    .line 2
    .line 3
    iget-object v1, p0, LIf/t;->h:LCd/a;

    .line 4
    .line 5
    iget-object v2, p0, LIf/t;->g:[LHf/l;

    .line 6
    .line 7
    iget-object v3, p0, LIf/t;->i:LHf/m;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1, v3, p2}, LIf/t;-><init>([LHf/l;LCd/a;LHf/m;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LIf/t;->f:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, LIf/t;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LIf/t;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LIf/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, LIf/t;->e:I

    .line 6
    .line 7
    sget-object v3, LIf/c;->c:LH6/g;

    .line 8
    .line 9
    sget-object v4, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x2

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    if-eq v2, v5, :cond_2

    .line 17
    .line 18
    if-eq v2, v7, :cond_1

    .line 19
    .line 20
    if-ne v2, v6, :cond_0

    .line 21
    .line 22
    iget v2, v0, LIf/t;->d:I

    .line 23
    .line 24
    iget v6, v0, LIf/t;->c:I

    .line 25
    .line 26
    iget-object v8, v0, LIf/t;->b:[B

    .line 27
    .line 28
    iget-object v9, v0, LIf/t;->a:LGf/i;

    .line 29
    .line 30
    iget-object v10, v0, LIf/t;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v10, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_1
    iget v2, v0, LIf/t;->d:I

    .line 48
    .line 49
    iget v6, v0, LIf/t;->c:I

    .line 50
    .line 51
    iget-object v8, v0, LIf/t;->b:[B

    .line 52
    .line 53
    iget-object v9, v0, LIf/t;->a:LGf/i;

    .line 54
    .line 55
    iget-object v10, v0, LIf/t;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move v11, v7

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget v2, v0, LIf/t;->d:I

    .line 65
    .line 66
    iget v6, v0, LIf/t;->c:I

    .line 67
    .line 68
    iget-object v8, v0, LIf/t;->b:[B

    .line 69
    .line 70
    iget-object v9, v0, LIf/t;->a:LGf/i;

    .line 71
    .line 72
    iget-object v10, v0, LIf/t;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v10, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object/from16 v11, p1

    .line 80
    .line 81
    check-cast v11, LGf/l;

    .line 82
    .line 83
    iget-object v11, v11, LGf/l;->a:Ljava/lang/Object;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, LIf/t;->f:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, LEf/E;

    .line 92
    .line 93
    iget-object v9, v0, LIf/t;->g:[LHf/l;

    .line 94
    .line 95
    array-length v14, v9

    .line 96
    if-nez v14, :cond_4

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    new-array v15, v14, [Ljava/lang/Object;

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    invoke-static {v15, v3, v8, v14}, Lff/m;->o0([Ljava/lang/Object;LH6/g;II)V

    .line 103
    .line 104
    .line 105
    const/4 v10, 0x6

    .line 106
    const/4 v11, 0x0

    .line 107
    invoke-static {v14, v10, v11}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    move-object v10, v11

    .line 112
    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 113
    .line 114
    invoke-direct {v11, v14}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 115
    .line 116
    .line 117
    move-object v13, v10

    .line 118
    move v10, v8

    .line 119
    :goto_0
    if-ge v10, v14, :cond_5

    .line 120
    .line 121
    move/from16 v16, v8

    .line 122
    .line 123
    new-instance v8, LIf/s;

    .line 124
    .line 125
    move-object/from16 v17, v13

    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    move-object/from16 v7, v17

    .line 129
    .line 130
    invoke-direct/range {v8 .. v13}, LIf/s;-><init>([LHf/l;ILjava/util/concurrent/atomic/AtomicInteger;LGf/e;Ljf/c;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v2, v7, v8, v6}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 134
    .line 135
    .line 136
    add-int/lit8 v10, v10, 0x1

    .line 137
    .line 138
    move-object v13, v7

    .line 139
    move/from16 v8, v16

    .line 140
    .line 141
    const/4 v7, 0x2

    .line 142
    goto :goto_0

    .line 143
    :cond_5
    move/from16 v16, v8

    .line 144
    .line 145
    new-array v8, v14, [B

    .line 146
    .line 147
    move-object v9, v12

    .line 148
    move v6, v14

    .line 149
    move-object v10, v15

    .line 150
    move/from16 v2, v16

    .line 151
    .line 152
    :cond_6
    :goto_1
    add-int/2addr v2, v5

    .line 153
    int-to-byte v2, v2

    .line 154
    iput-object v10, v0, LIf/t;->f:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v9, v0, LIf/t;->a:LGf/i;

    .line 157
    .line 158
    iput-object v8, v0, LIf/t;->b:[B

    .line 159
    .line 160
    iput v6, v0, LIf/t;->c:I

    .line 161
    .line 162
    iput v2, v0, LIf/t;->d:I

    .line 163
    .line 164
    iput v5, v0, LIf/t;->e:I

    .line 165
    .line 166
    invoke-interface {v9, v0}, LGf/v;->e(LIf/t;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    if-ne v11, v1, :cond_7

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    :goto_2
    invoke-static {v11}, LGf/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    check-cast v7, Lff/y;

    .line 178
    .line 179
    if-nez v7, :cond_8

    .line 180
    .line 181
    :goto_3
    return-object v4

    .line 182
    :cond_8
    iget v11, v7, Lff/y;->a:I

    .line 183
    .line 184
    aget-object v12, v10, v11

    .line 185
    .line 186
    iget-object v7, v7, Lff/y;->b:Ljava/lang/Object;

    .line 187
    .line 188
    aput-object v7, v10, v11

    .line 189
    .line 190
    if-ne v12, v3, :cond_9

    .line 191
    .line 192
    add-int/lit8 v6, v6, -0x1

    .line 193
    .line 194
    :cond_9
    aget-byte v7, v8, v11

    .line 195
    .line 196
    if-eq v7, v2, :cond_a

    .line 197
    .line 198
    int-to-byte v7, v2

    .line 199
    aput-byte v7, v8, v11

    .line 200
    .line 201
    invoke-interface {v9}, LGf/v;->f()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-static {v7}, LGf/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, Lff/y;

    .line 210
    .line 211
    if-nez v7, :cond_8

    .line 212
    .line 213
    :cond_a
    if-nez v6, :cond_6

    .line 214
    .line 215
    iget-object v7, v0, LIf/t;->h:LCd/a;

    .line 216
    .line 217
    iput-object v10, v0, LIf/t;->f:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v9, v0, LIf/t;->a:LGf/i;

    .line 220
    .line 221
    iput-object v8, v0, LIf/t;->b:[B

    .line 222
    .line 223
    iput v6, v0, LIf/t;->c:I

    .line 224
    .line 225
    iput v2, v0, LIf/t;->d:I

    .line 226
    .line 227
    const/4 v11, 0x2

    .line 228
    iput v11, v0, LIf/t;->e:I

    .line 229
    .line 230
    iget-object v12, v0, LIf/t;->i:LHf/m;

    .line 231
    .line 232
    invoke-virtual {v7, v12, v10, v0}, LCd/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    if-ne v7, v1, :cond_6

    .line 237
    .line 238
    :goto_4
    return-object v1
.end method
