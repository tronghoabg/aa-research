.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

.field public final synthetic c:I

.field public final synthetic d:LHf/c0;

.field public final synthetic e:Ltf/l;

.field public final synthetic f:Ltf/a;

.field public final synthetic g:Ltf/a;

.field public final synthetic h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;


# direct methods
.method public constructor <init>(ILHf/c0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;Ltf/a;Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 7
    .line 8
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->c:I

    .line 9
    .line 10
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->d:LHf/c0;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->e:Ltf/l;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->f:Ltf/a;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->g:Ltf/a;

    .line 17
    .line 18
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

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
    move-object/from16 v5, p2

    .line 8
    .line 9
    check-cast v5, LN/o;

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
    invoke-virtual {v5, v1}, LN/o;->e(Ljava/lang/Object;)Z

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
    invoke-virtual {v5}, LN/o;->x()Z

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
    invoke-virtual {v5}, LN/o;->I()V

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
    const/4 v8, 0x0

    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    const v1, 0x6ce6d757

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_4
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    const v1, 0x6ce7cb77

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_5
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    const v2, -0x70198353

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v2}, LN/o;->M(I)V

    .line 90
    .line 91
    .line 92
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 93
    .line 94
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 95
    .line 96
    sget-object v1, LZ/i;->a:LZ/i;

    .line 97
    .line 98
    invoke-static {v1}, LE/L;->a(LZ/k;)LZ/k;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const/4 v4, 0x0

    .line 103
    const/16 v7, 0xdb0

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    move-object v6, v5

    .line 107
    move-object v5, v1

    .line 108
    invoke-static/range {v2 .. v7}, Lgc/b;->d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;Ltf/a;Ltf/t;LZ/k;LN/o;I)V

    .line 109
    .line 110
    .line 111
    move-object v5, v6

    .line 112
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_6
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 118
    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    const v1, -0x70195e33

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 125
    .line 126
    .line 127
    const v1, -0x70195898

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 134
    .line 135
    invoke-virtual {v5, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 140
    .line 141
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    or-int/2addr v1, v2

    .line 146
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->c:I

    .line 147
    .line 148
    invoke-virtual {v5, v2}, LN/o;->c(I)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    or-int/2addr v1, v2

    .line 153
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->d:LHf/c0;

    .line 154
    .line 155
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    or-int/2addr v1, v2

    .line 160
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->e:Ltf/l;

    .line 161
    .line 162
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    or-int/2addr v1, v2

    .line 167
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->f:Ltf/a;

    .line 168
    .line 169
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    or-int/2addr v1, v2

    .line 174
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->g:Ltf/a;

    .line 175
    .line 176
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    or-int/2addr v1, v2

    .line 181
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 182
    .line 183
    invoke-virtual {v5, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    or-int/2addr v1, v2

    .line 188
    invoke-virtual {v5}, LN/o;->F()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-nez v1, :cond_7

    .line 193
    .line 194
    sget-object v1, LN/k;->a:LN/P;

    .line 195
    .line 196
    if-ne v2, v1, :cond_8

    .line 197
    .line 198
    :cond_7
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/b;

    .line 199
    .line 200
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->e:Ltf/l;

    .line 201
    .line 202
    iget-object v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 203
    .line 204
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 205
    .line 206
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 207
    .line 208
    iget v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->c:I

    .line 209
    .line 210
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->d:LHf/c0;

    .line 211
    .line 212
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->f:Ltf/a;

    .line 213
    .line 214
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;->g:Ltf/a;

    .line 215
    .line 216
    move-object/from16 v17, v1

    .line 217
    .line 218
    move-object/from16 v16, v2

    .line 219
    .line 220
    invoke-direct/range {v9 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/b;-><init>(ILHf/c0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;Ltf/a;Ltf/l;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    move-object v2, v9

    .line 227
    :cond_8
    check-cast v2, Ltf/l;

    .line 228
    .line 229
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 230
    .line 231
    .line 232
    const/4 v6, 0x0

    .line 233
    const/4 v7, 0x6

    .line 234
    const/4 v3, 0x0

    .line 235
    const/4 v4, 0x0

    .line 236
    invoke-static/range {v2 .. v7}, La/a;->c(Ltf/l;LZ/k;LM0/m;LN/o;II)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_9
    if-nez v1, :cond_a

    .line 244
    .line 245
    const v1, 0x6cfae063

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 252
    .line 253
    .line 254
    :goto_2
    sget-object v1, Lef/C;->a:Lef/C;

    .line 255
    .line 256
    return-object v1

    .line 257
    :cond_a
    const v1, -0x701998e4

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v1}, LN/o;->M(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v8}, LN/o;->p(Z)V

    .line 264
    .line 265
    .line 266
    new-instance v1, LE5/Q;

    .line 267
    .line 268
    const/16 v2, 0x9

    .line 269
    .line 270
    const/4 v3, 0x0

    .line 271
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 272
    .line 273
    .line 274
    throw v1
.end method
