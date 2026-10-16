.class public final Lcom/moloco/sdk/internal/publisher/nativead/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltf/a;


# direct methods
.method public synthetic constructor <init>(Ltf/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;->b:Ltf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x4

    .line 9
    iget v5, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p1

    .line 15
    .line 16
    check-cast v5, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    move-object/from16 v6, p2

    .line 23
    .line 24
    check-cast v6, LN/o;

    .line 25
    .line 26
    move-object/from16 v7, p3

    .line 27
    .line 28
    check-cast v7, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    and-int/lit8 v8, v7, 0x6

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    invoke-virtual {v6, v5}, LN/o;->f(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    move v3, v4

    .line 45
    :cond_0
    or-int/2addr v7, v3

    .line 46
    :cond_1
    and-int/lit8 v3, v7, 0x13

    .line 47
    .line 48
    if-ne v3, v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v6}, LN/o;->x()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v6}, LN/o;->I()V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :cond_3
    :goto_0
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/e;

    .line 63
    .line 64
    invoke-direct {v2, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/e;-><init>(Z)V

    .line 65
    .line 66
    .line 67
    const v3, -0x36cf4ad1

    .line 68
    .line 69
    .line 70
    invoke-static {v6, v3, v2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    const-string v2, "onClick"

    .line 75
    .line 76
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;->b:Ltf/a;

    .line 77
    .line 78
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const v2, 0x1136b375

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 85
    .line 86
    .line 87
    sget-object v7, LZ/i;->a:LZ/i;

    .line 88
    .line 89
    const v2, -0x1d58f75c

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6}, LN/o;->F()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget-object v4, LN/k;->a:LN/P;

    .line 100
    .line 101
    if-ne v2, v4, :cond_4

    .line 102
    .line 103
    new-instance v2, LD/i;

    .line 104
    .line 105
    invoke-direct {v2}, LD/i;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_4
    const/4 v4, 0x0

    .line 112
    invoke-virtual {v6, v4}, LN/o;->p(Z)V

    .line 113
    .line 114
    .line 115
    move-object v9, v2

    .line 116
    check-cast v9, LD/i;

    .line 117
    .line 118
    sget-object v2, LK/A;->a:LN/L0;

    .line 119
    .line 120
    invoke-virtual {v6, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, LK/z;

    .line 125
    .line 126
    iget-object v11, v2, LK/z;->a:LH/d;

    .line 127
    .line 128
    sget-object v2, LK/a;->a:LE/F;

    .line 129
    .line 130
    const v2, 0xae46cc8

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v2}, LN/o;->M(I)V

    .line 134
    .line 135
    .line 136
    sget-wide v17, Le0/q;->h:J

    .line 137
    .line 138
    sget-object v2, LK/g;->a:LN/L0;

    .line 139
    .line 140
    invoke-virtual {v6, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, LK/e;

    .line 145
    .line 146
    invoke-virtual {v5}, LK/e;->b()J

    .line 147
    .line 148
    .line 149
    move-result-wide v19

    .line 150
    invoke-virtual {v6, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    check-cast v2, LK/e;

    .line 155
    .line 156
    invoke-virtual {v2}, LK/e;->a()J

    .line 157
    .line 158
    .line 159
    move-result-wide v12

    .line 160
    invoke-static {v6}, LBa/c;->y(LN/o;)F

    .line 161
    .line 162
    .line 163
    const v2, 0x3ec28f5c    # 0.38f

    .line 164
    .line 165
    .line 166
    invoke-static {v12, v13, v2}, Le0/q;->a(JF)J

    .line 167
    .line 168
    .line 169
    move-result-wide v23

    .line 170
    new-instance v13, LK/j;

    .line 171
    .line 172
    move-wide/from16 v21, v17

    .line 173
    .line 174
    move-object/from16 v16, v13

    .line 175
    .line 176
    invoke-direct/range {v16 .. v24}, LK/j;-><init>(JJJJ)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v4}, LN/o;->p(Z)V

    .line 180
    .line 181
    .line 182
    sget-object v14, LK/a;->e:LE/F;

    .line 183
    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v12, 0x0

    .line 186
    const/4 v8, 0x1

    .line 187
    const/high16 v17, 0x30000000

    .line 188
    .line 189
    const/16 v18, 0x0

    .line 190
    .line 191
    move-object/from16 v16, v6

    .line 192
    .line 193
    move-object v6, v3

    .line 194
    invoke-static/range {v6 .. v18}, LA6/h;->a(Ltf/a;LZ/k;ZLD/i;LK/n;Le0/E;LB/h;LK/j;LE/F;LV/d;LN/o;II)V

    .line 195
    .line 196
    .line 197
    move-object/from16 v2, v16

    .line 198
    .line 199
    invoke-virtual {v2, v4}, LN/o;->p(Z)V

    .line 200
    .line 201
    .line 202
    :goto_1
    return-object v1

    .line 203
    :pswitch_0
    move-object/from16 v5, p1

    .line 204
    .line 205
    check-cast v5, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    move-object/from16 v6, p2

    .line 212
    .line 213
    check-cast v6, LN/o;

    .line 214
    .line 215
    move-object/from16 v7, p3

    .line 216
    .line 217
    check-cast v7, Ljava/lang/Number;

    .line 218
    .line 219
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    and-int/lit8 v8, v7, 0x6

    .line 224
    .line 225
    if-nez v8, :cond_6

    .line 226
    .line 227
    invoke-virtual {v6, v5}, LN/o;->f(Z)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-eqz v8, :cond_5

    .line 232
    .line 233
    move v3, v4

    .line 234
    :cond_5
    or-int/2addr v7, v3

    .line 235
    :cond_6
    and-int/lit8 v3, v7, 0x13

    .line 236
    .line 237
    if-ne v3, v2, :cond_8

    .line 238
    .line 239
    invoke-virtual {v6}, LN/o;->x()Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_7

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_7
    invoke-virtual {v6}, LN/o;->I()V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    :goto_2
    if-eqz v5, :cond_9

    .line 251
    .line 252
    const v2, 0x7f080180

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_9
    const v2, 0x7f080181

    .line 257
    .line 258
    .line 259
    :goto_3
    invoke-static {v2, v6}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    sget-wide v11, Le0/q;->d:J

    .line 264
    .line 265
    const v21, 0x36000

    .line 266
    .line 267
    .line 268
    const/16 v22, 0x3cc

    .line 269
    .line 270
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/nativead/ui/a;->b:Ltf/a;

    .line 271
    .line 272
    const/4 v8, 0x0

    .line 273
    const/4 v9, 0x0

    .line 274
    const-string v10, "play/pause"

    .line 275
    .line 276
    const-wide/16 v13, 0x0

    .line 277
    .line 278
    const-wide/16 v15, 0x0

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const-wide/16 v18, 0x0

    .line 283
    .line 284
    move-object/from16 v20, v6

    .line 285
    .line 286
    move-object v6, v2

    .line 287
    invoke-static/range {v6 .. v22}, LFe/b;->a(Lh0/c;Ltf/a;LZ/k;ZLjava/lang/String;JJJLe0/E;JLN/o;II)V

    .line 288
    .line 289
    .line 290
    :goto_4
    return-object v1

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
