.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

.field public final synthetic b:Ltf/u;

.field public final synthetic c:Ltf/s;

.field public final synthetic d:Ltf/t;

.field public final synthetic e:Ltf/u;

.field public final synthetic f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

.field public final synthetic g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/u;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->b:Ltf/u;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->c:Ltf/s;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->d:Ltf/t;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->e:Ltf/u;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, LN/o;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    and-int/lit8 v3, v2, 0x6

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v6, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    const/4 v3, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v3

    .line 33
    :cond_1
    and-int/lit8 v2, v2, 0x13

    .line 34
    .line 35
    const/16 v3, 0x12

    .line 36
    .line 37
    if-ne v2, v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v6}, LN/o;->x()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {v6}, LN/o;->I()V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_3
    :goto_1
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 52
    .line 53
    sget-object v3, LZ/i;->a:LZ/i;

    .line 54
    .line 55
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    const v2, 0x6f1e928f

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 65
    .line 66
    .line 67
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 68
    .line 69
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;->b:Ltf/a;

    .line 74
    .line 75
    :cond_4
    invoke-static {v3}, LE/L;->a(LZ/k;)LZ/k;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/16 v3, 0x180

    .line 80
    .line 81
    invoke-static {v1, v5, v2, v6, v3}, Lcom/moloco/sdk/internal/publisher/H;->M(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;Ltf/a;LZ/k;LN/o;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v13}, LN/o;->p(Z)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_5
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 90
    .line 91
    if-eqz v2, :cond_9

    .line 92
    .line 93
    const v2, 0x6f1eb0b4

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 97
    .line 98
    .line 99
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 100
    .line 101
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 102
    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;->a:Ltf/a;

    .line 106
    .line 107
    :cond_6
    invoke-static {v3}, LE/L;->a(LZ/k;)LZ/k;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const v1, 0x6f1ede0b

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v1}, LN/o;->M(I)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 118
    .line 119
    invoke-virtual {v6, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-nez v3, :cond_7

    .line 128
    .line 129
    sget-object v3, LN/k;->a:LN/P;

    .line 130
    .line 131
    if-ne v7, v3, :cond_8

    .line 132
    .line 133
    :cond_7
    new-instance v14, LS8/d;

    .line 134
    .line 135
    const-string v19, "onReplay()V"

    .line 136
    .line 137
    const/16 v20, 0x0

    .line 138
    .line 139
    const/4 v15, 0x0

    .line 140
    const-class v17, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 141
    .line 142
    const-string v18, "onReplay"

    .line 143
    .line 144
    const/16 v21, 0x13

    .line 145
    .line 146
    move-object/from16 v16, v1

    .line 147
    .line 148
    invoke-direct/range {v14 .. v21}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v14}, LN/o;->U(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v7, v14

    .line 155
    :cond_8
    check-cast v7, Lkotlin/reflect/KFunction;

    .line 156
    .line 157
    invoke-virtual {v6, v13}, LN/o;->p(Z)V

    .line 158
    .line 159
    .line 160
    move-object v10, v7

    .line 161
    check-cast v10, Ltf/a;

    .line 162
    .line 163
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 164
    .line 165
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->d:Ltf/t;

    .line 166
    .line 167
    const/16 v12, 0x180

    .line 168
    .line 169
    move-object v3, v5

    .line 170
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->b:Ltf/u;

    .line 171
    .line 172
    move-object v11, v6

    .line 173
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->c:Ltf/s;

    .line 174
    .line 175
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->e:Ltf/u;

    .line 176
    .line 177
    invoke-static/range {v2 .. v12}, Lka/e0;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;Ltf/a;LZ/k;Ltf/u;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Ltf/a;LN/o;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_9
    move-object v11, v6

    .line 185
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 186
    .line 187
    if-eqz v2, :cond_b

    .line 188
    .line 189
    const v2, 0x6f1ee982

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11, v2}, LN/o;->M(I)V

    .line 193
    .line 194
    .line 195
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 196
    .line 197
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 198
    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    iget-object v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;->c:Ltf/a;

    .line 202
    .line 203
    :cond_a
    invoke-static {v3}, LE/L;->a(LZ/k;)LZ/k;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;->d:Ltf/t;

    .line 208
    .line 209
    const/16 v7, 0xc00

    .line 210
    .line 211
    move-object v3, v5

    .line 212
    move-object v6, v11

    .line 213
    move-object v5, v1

    .line 214
    invoke-static/range {v2 .. v7}, Lgc/b;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;Ltf/a;Ltf/t;LZ/k;LN/o;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_b
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 222
    .line 223
    if-eqz v2, :cond_c

    .line 224
    .line 225
    const v1, 0x74c2785e

    .line 226
    .line 227
    .line 228
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_c
    if-nez v1, :cond_d

    .line 236
    .line 237
    const v1, 0x74c30e0a

    .line 238
    .line 239
    .line 240
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 244
    .line 245
    .line 246
    :goto_2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 247
    .line 248
    return-object v1

    .line 249
    :cond_d
    const v1, 0x6f1e8dc2    # 4.9070006E28f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v11, v1}, LN/o;->M(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v11, v13}, LN/o;->p(Z)V

    .line 256
    .line 257
    .line 258
    new-instance v1, LE5/Q;

    .line 259
    .line 260
    const/16 v2, 0x9

    .line 261
    .line 262
    const/4 v3, 0x0

    .line 263
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 264
    .line 265
    .line 266
    throw v1
.end method
