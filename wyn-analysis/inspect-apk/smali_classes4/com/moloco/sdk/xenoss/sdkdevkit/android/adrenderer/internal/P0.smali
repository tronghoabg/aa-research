.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

.field public final synthetic e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->f:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->f:J

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;JLjf/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->b:I

    .line 6
    .line 7
    sget-object v3, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    if-eq v2, v7, :cond_1

    .line 19
    .line 20
    if-ne v2, v6, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 23
    .line 24
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v6, v2

    .line 32
    move-object/from16 v2, p1

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, LEf/K;

    .line 47
    .line 48
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LEf/L0; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    move-object/from16 v7, p1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, LEf/E;

    .line 60
    .line 61
    iget-object v9, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->g:Lcom/moloco/sdk/internal/A;

    .line 62
    .line 63
    instance-of v9, v9, Lcom/moloco/sdk/internal/z;

    .line 64
    .line 65
    if-eqz v9, :cond_3

    .line 66
    .line 67
    invoke-interface {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :cond_3
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/O0;

    .line 72
    .line 73
    iget-wide v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->f:J

    .line 74
    .line 75
    invoke-direct {v9, v10, v11, v8, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/O0;-><init>(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Ljf/c;)V

    .line 76
    .line 77
    .line 78
    const/4 v10, 0x3

    .line 79
    invoke-static {v2, v5, v9, v10}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    iget-object v11, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 84
    .line 85
    if-eqz v11, :cond_4

    .line 86
    .line 87
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 88
    .line 89
    if-eqz v11, :cond_4

    .line 90
    .line 91
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 92
    .line 93
    if-eqz v11, :cond_4

    .line 94
    .line 95
    iget-object v11, v11, Lcom/moloco/sdk/internal/ortb/model/h0;->i:Lcom/moloco/sdk/internal/ortb/model/F;

    .line 96
    .line 97
    if-eqz v11, :cond_4

    .line 98
    .line 99
    invoke-static {v11}, Lp7/b;->a(Lcom/moloco/sdk/internal/ortb/model/F;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    move-object v15, v11

    .line 104
    goto :goto_0

    .line 105
    :cond_4
    move-object v15, v5

    .line 106
    :goto_0
    new-instance v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/M0;

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    iget-wide v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->f:J

    .line 111
    .line 112
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 113
    .line 114
    move-object/from16 v16, v11

    .line 115
    .line 116
    invoke-direct/range {v12 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/M0;-><init>(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;Ljf/c;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v5, v12, v10}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :try_start_1
    iput-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->b:I

    .line 126
    .line 127
    invoke-virtual {v9, v0}, LEf/z0;->p(Ljf/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    if-ne v7, v1, :cond_5

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    :goto_1
    check-cast v7, Lcom/moloco/sdk/internal/A;
    :try_end_1
    .catch LEf/L0; {:try_start_1 .. :try_end_1} :catch_0

    .line 135
    .line 136
    if-nez v7, :cond_6

    .line 137
    .line 138
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 139
    .line 140
    invoke-interface {v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 141
    .line 142
    .line 143
    return-object v3

    .line 144
    :cond_6
    instance-of v9, v7, Lcom/moloco/sdk/internal/y;

    .line 145
    .line 146
    if-eqz v9, :cond_7

    .line 147
    .line 148
    check-cast v7, Lcom/moloco/sdk/internal/y;

    .line 149
    .line 150
    iget-object v1, v7, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 153
    .line 154
    invoke-interface {v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v2, v5}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 158
    .line 159
    .line 160
    return-object v3

    .line 161
    :cond_7
    instance-of v9, v7, Lcom/moloco/sdk/internal/z;

    .line 162
    .line 163
    if-eqz v9, :cond_9

    .line 164
    .line 165
    check-cast v7, Lcom/moloco/sdk/internal/z;

    .line 166
    .line 167
    iget-object v7, v7, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 170
    .line 171
    iput-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->c:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 174
    .line 175
    iput v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/P0;->b:I

    .line 176
    .line 177
    invoke-interface {v2, v0}, LEf/K;->await(Ljf/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-ne v2, v1, :cond_8

    .line 182
    .line 183
    :goto_2
    return-object v1

    .line 184
    :cond_8
    move-object v1, v7

    .line 185
    move-object v6, v8

    .line 186
    :goto_3
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 192
    .line 193
    invoke-direct {v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;)V

    .line 194
    .line 195
    .line 196
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 197
    .line 198
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iput-object v2, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->g:Lcom/moloco/sdk/internal/A;

    .line 205
    .line 206
    iget-object v1, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->e:LHf/x0;

    .line 207
    .line 208
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v5, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    invoke-interface {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->a()V

    .line 217
    .line 218
    .line 219
    return-object v3

    .line 220
    :cond_9
    new-instance v1, LE5/Q;

    .line 221
    .line 222
    const/16 v2, 0x9

    .line 223
    .line 224
    const/4 v3, 0x0

    .line 225
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 226
    .line 227
    .line 228
    throw v1

    .line 229
    :catch_0
    invoke-interface {v2, v5}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 230
    .line 231
    .line 232
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 233
    .line 234
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 235
    .line 236
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 237
    .line 238
    invoke-direct {v2, v5}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iput-object v2, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->g:Lcom/moloco/sdk/internal/A;

    .line 245
    .line 246
    invoke-interface {v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->w(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;)V

    .line 247
    .line 248
    .line 249
    return-object v3
.end method
