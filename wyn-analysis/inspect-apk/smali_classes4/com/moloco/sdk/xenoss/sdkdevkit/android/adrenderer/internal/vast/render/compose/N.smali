.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/u;


# instance fields
.field public final synthetic a:LZ/d;

.field public final synthetic b:LE/F;

.field public final synthetic c:Lh0/c;

.field public final synthetic d:Lh0/c;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:Le0/E;

.field public final synthetic i:J


# direct methods
.method public constructor <init>(LZ/d;LE/F;Lh0/c;Lh0/c;JJJLe0/E;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->a:LZ/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->b:LE/F;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->c:Lh0/c;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->d:Lh0/c;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->e:J

    .line 13
    .line 14
    iput-wide p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->f:J

    .line 15
    .line 16
    iput-wide p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->g:J

    .line 17
    .line 18
    iput-object p11, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->h:Le0/E;

    .line 19
    .line 20
    iput-wide p12, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->i:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, LE/q;->a:LE/q;

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v10

    .line 13
    move-object/from16 v2, p3

    .line 14
    .line 15
    check-cast v2, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    move-object/from16 v8, p4

    .line 22
    .line 23
    check-cast v8, Ltf/p;

    .line 24
    .line 25
    move-object/from16 v9, p5

    .line 26
    .line 27
    check-cast v9, Ltf/l;

    .line 28
    .line 29
    move-object/from16 v2, p6

    .line 30
    .line 31
    check-cast v2, LN/o;

    .line 32
    .line 33
    move-object/from16 v3, p7

    .line 34
    .line 35
    check-cast v3, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const-string v5, "onButtonReplaced"

    .line 42
    .line 43
    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v5, "onMuteChange"

    .line 47
    .line 48
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    and-int/lit8 v5, v3, 0x6

    .line 52
    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    const/4 v5, 0x4

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 v5, 0x2

    .line 64
    :goto_0
    or-int/2addr v5, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v5, v3

    .line 67
    :goto_1
    and-int/lit8 v6, v3, 0x30

    .line 68
    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2, v10}, LN/o;->f(Z)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    const/16 v6, 0x20

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/16 v6, 0x10

    .line 81
    .line 82
    :goto_2
    or-int/2addr v5, v6

    .line 83
    :cond_3
    and-int/lit16 v6, v3, 0x180

    .line 84
    .line 85
    if-nez v6, :cond_5

    .line 86
    .line 87
    invoke-virtual {v2, v4}, LN/o;->f(Z)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_4

    .line 92
    .line 93
    const/16 v6, 0x100

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    const/16 v6, 0x80

    .line 97
    .line 98
    :goto_3
    or-int/2addr v5, v6

    .line 99
    :cond_5
    and-int/lit16 v6, v3, 0xc00

    .line 100
    .line 101
    if-nez v6, :cond_7

    .line 102
    .line 103
    invoke-virtual {v2, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_6

    .line 108
    .line 109
    const/16 v6, 0x800

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    const/16 v6, 0x400

    .line 113
    .line 114
    :goto_4
    or-int/2addr v5, v6

    .line 115
    :cond_7
    and-int/lit16 v3, v3, 0x6000

    .line 116
    .line 117
    if-nez v3, :cond_9

    .line 118
    .line 119
    invoke-virtual {v2, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_8

    .line 124
    .line 125
    const/16 v3, 0x4000

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    const/16 v3, 0x2000

    .line 129
    .line 130
    :goto_5
    or-int/2addr v5, v3

    .line 131
    :cond_9
    move/from16 v20, v5

    .line 132
    .line 133
    const v3, 0x12493

    .line 134
    .line 135
    .line 136
    and-int v3, v20, v3

    .line 137
    .line 138
    const v5, 0x12492

    .line 139
    .line 140
    .line 141
    if-ne v3, v5, :cond_b

    .line 142
    .line 143
    invoke-virtual {v2}, LN/o;->x()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-nez v3, :cond_a

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_a
    invoke-virtual {v2}, LN/o;->I()V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_b
    :goto_6
    const v3, -0x4dbd10d7

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, LN/o;->M(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, LN/o;->F()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    sget-object v5, LN/k;->a:LN/P;

    .line 166
    .line 167
    if-ne v3, v5, :cond_c

    .line 168
    .line 169
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 170
    .line 171
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 172
    .line 173
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    invoke-direct {v6, v7, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 177
    .line 178
    .line 179
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;

    .line 180
    .line 181
    invoke-direct {v11, v7, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;-><init>(FF)V

    .line 182
    .line 183
    .line 184
    invoke-direct {v5, v3, v6, v11}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;)V

    .line 185
    .line 186
    .line 187
    sget-object v3, LN/P;->f:LN/P;

    .line 188
    .line 189
    invoke-static {v5, v3}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v2, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    move-object v7, v3

    .line 197
    check-cast v7, LN/V;

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    invoke-virtual {v2, v3}, LN/o;->p(Z)V

    .line 201
    .line 202
    .line 203
    sget-object v3, LZ/i;->a:LZ/i;

    .line 204
    .line 205
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->a:LZ/d;

    .line 206
    .line 207
    invoke-virtual {v1, v3, v5}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Lr7/e;->w(LZ/k;)LZ/k;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->b:LE/F;

    .line 216
    .line 217
    invoke-static {v1, v3}, Lcom/moloco/sdk/internal/publisher/H;->e0(LZ/k;LE/F;)LZ/k;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;

    .line 222
    .line 223
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->h:Le0/E;

    .line 224
    .line 225
    iget-wide v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->i:J

    .line 226
    .line 227
    move-object/from16 v17, v5

    .line 228
    .line 229
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->c:Lh0/c;

    .line 230
    .line 231
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->d:Lh0/c;

    .line 232
    .line 233
    move-wide/from16 v18, v11

    .line 234
    .line 235
    iget-wide v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->e:J

    .line 236
    .line 237
    iget-wide v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->f:J

    .line 238
    .line 239
    move-object/from16 p2, v3

    .line 240
    .line 241
    move/from16 p1, v4

    .line 242
    .line 243
    iget-wide v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;->g:J

    .line 244
    .line 245
    move-wide v15, v3

    .line 246
    move/from16 v4, p1

    .line 247
    .line 248
    move-object/from16 v3, p2

    .line 249
    .line 250
    invoke-direct/range {v3 .. v19}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/M;-><init>(ZLh0/c;Lh0/c;LN/V;Ltf/p;Ltf/l;ZJJJLe0/E;J)V

    .line 251
    .line 252
    .line 253
    const v4, -0x7b78043e

    .line 254
    .line 255
    .line 256
    invoke-static {v2, v4, v3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    shr-int/lit8 v3, v20, 0x3

    .line 261
    .line 262
    and-int/lit8 v3, v3, 0xe

    .line 263
    .line 264
    const/high16 v4, 0x30000

    .line 265
    .line 266
    or-int/2addr v3, v4

    .line 267
    const/4 v6, 0x0

    .line 268
    const/4 v7, 0x0

    .line 269
    const/4 v5, 0x0

    .line 270
    move v4, v10

    .line 271
    move v10, v3

    .line 272
    move v3, v4

    .line 273
    move-object v4, v1

    .line 274
    move-object v9, v2

    .line 275
    invoke-static/range {v3 .. v10}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 276
    .line 277
    .line 278
    :goto_7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 279
    .line 280
    return-object v1
.end method
