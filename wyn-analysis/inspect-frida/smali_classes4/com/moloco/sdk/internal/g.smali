.class public final Lcom/moloco/sdk/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Ltf/c;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/moloco/sdk/internal/g;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/moloco/sdk/internal/g;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/moloco/sdk/internal/g;->b:Z

    return-void
.end method

.method public constructor <init>(ZLcom/moloco/sdk/internal/ortb/model/h;Lcom/moloco/sdk/internal/ortb/model/D;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/moloco/sdk/internal/g;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/moloco/sdk/internal/g;->b:Z

    iput-object p2, p0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/moloco/sdk/internal/g;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/moloco/sdk/internal/g;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, LN/o;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v1, v1, 0x3

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v7}, LN/o;->x()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v7}, LN/o;->I()V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 40
    .line 41
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/g;->l()LHf/v0;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const v1, 0x138fcb15

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v1}, LN/o;->M(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v10, v1

    .line 54
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 55
    .line 56
    invoke-virtual {v7, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget-object v4, LN/k;->a:LN/P;

    .line 65
    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    if-ne v3, v4, :cond_3

    .line 69
    .line 70
    :cond_2
    new-instance v8, LS8/d;

    .line 71
    .line 72
    const-string v13, "goNextAdPartOrDismissAd()V"

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const-class v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 77
    .line 78
    const-string v12, "goNextAdPartOrDismissAd"

    .line 79
    .line 80
    const/16 v15, 0xc

    .line 81
    .line 82
    invoke-direct/range {v8 .. v15}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v3, v8

    .line 89
    :cond_3
    check-cast v3, Lkotlin/reflect/KFunction;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 93
    .line 94
    .line 95
    check-cast v3, Ltf/a;

    .line 96
    .line 97
    const v5, 0x138fd1ce

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7, v5}, LN/o;->M(I)V

    .line 101
    .line 102
    .line 103
    iget-object v5, v0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v10, v5

    .line 106
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 107
    .line 108
    invoke-virtual {v7, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    if-nez v5, :cond_4

    .line 117
    .line 118
    if-ne v6, v4, :cond_5

    .line 119
    .line 120
    :cond_4
    new-instance v8, LEf/p0;

    .line 121
    .line 122
    const-string v13, "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V"

    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v9, 0x1

    .line 126
    const-class v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 127
    .line 128
    const-string v12, "onButtonRendered"

    .line 129
    .line 130
    const/4 v15, 0x5

    .line 131
    invoke-direct/range {v8 .. v15}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v6, v8

    .line 138
    :cond_5
    check-cast v6, Lkotlin/reflect/KFunction;

    .line 139
    .line 140
    invoke-virtual {v7, v1}, LN/o;->p(Z)V

    .line 141
    .line 142
    .line 143
    move-object v4, v6

    .line 144
    check-cast v4, Ltf/l;

    .line 145
    .line 146
    iget-object v1, v0, Lcom/moloco/sdk/internal/g;->d:Ljava/lang/Object;

    .line 147
    .line 148
    move-object v5, v1

    .line 149
    check-cast v5, Ltf/c;

    .line 150
    .line 151
    iget-boolean v6, v0, Lcom/moloco/sdk/internal/g;->b:Z

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-static/range {v2 .. v8}, Ltg/b;->b(LHf/v0;Ltf/a;Ltf/l;Ltf/c;ZLN/o;I)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 158
    .line 159
    return-object v1

    .line 160
    :pswitch_0
    move-object/from16 v7, p1

    .line 161
    .line 162
    check-cast v7, LN/o;

    .line 163
    .line 164
    move-object/from16 v1, p2

    .line 165
    .line 166
    check-cast v1, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    const v1, 0x6e0c5910

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v1}, LN/o;->M(I)V

    .line 175
    .line 176
    .line 177
    iget-boolean v1, v0, Lcom/moloco/sdk/internal/g;->b:Z

    .line 178
    .line 179
    if-eqz v1, :cond_6

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    iget-object v1, v0, Lcom/moloco/sdk/internal/g;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, Lcom/moloco/sdk/internal/ortb/model/h;

    .line 186
    .line 187
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 188
    .line 189
    int-to-float v2, v2

    .line 190
    invoke-static {v2, v2}, LA6/c;->b(FF)J

    .line 191
    .line 192
    .line 193
    move-result-wide v9

    .line 194
    iget-object v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 195
    .line 196
    iget-object v3, v1, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 197
    .line 198
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 203
    .line 204
    int-to-float v2, v2

    .line 205
    new-instance v12, LE/F;

    .line 206
    .line 207
    invoke-direct {v12, v2, v2, v2, v2}, LE/F;-><init>(FFFF)V

    .line 208
    .line 209
    .line 210
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 211
    .line 212
    invoke-static {v2}, LFe/b;->E(I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    invoke-static {v2, v3}, LFe/b;->j(J)V

    .line 217
    .line 218
    .line 219
    const-wide v4, 0xff00000000L

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    and-long/2addr v4, v2

    .line 225
    invoke-static {v2, v3}, LL0/j;->c(J)F

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    const/4 v3, 0x2

    .line 230
    int-to-float v3, v3

    .line 231
    div-float/2addr v2, v3

    .line 232
    invoke-static {v4, v5, v2}, LFe/b;->M(JF)J

    .line 233
    .line 234
    .line 235
    move-result-wide v13

    .line 236
    const v2, 0x7f08017b

    .line 237
    .line 238
    .line 239
    invoke-static {v2, v7}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const v3, 0x3ee66666    # 0.45f

    .line 244
    .line 245
    .line 246
    invoke-static {v9, v10, v3}, LL0/f;->c(JF)J

    .line 247
    .line 248
    .line 249
    move-result-wide v3

    .line 250
    iget-object v5, v1, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    .line 251
    .line 252
    if-eqz v5, :cond_7

    .line 253
    .line 254
    iget-wide v5, v5, Le0/q;->a:J

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    sget-wide v5, Lcom/moloco/sdk/internal/i;->b:J

    .line 258
    .line 259
    :goto_2
    const/4 v8, 0x4

    .line 260
    invoke-static/range {v2 .. v8}, LBa/c;->c(Lh0/c;JJLN/o;I)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-wide v4, v1, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    .line 265
    .line 266
    move-object v3, v12

    .line 267
    move-object v12, v7

    .line 268
    move-wide v6, v9

    .line 269
    move-wide v8, v13

    .line 270
    const/16 v13, 0x40

    .line 271
    .line 272
    iget-object v1, v0, Lcom/moloco/sdk/internal/g;->d:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lcom/moloco/sdk/internal/ortb/model/D;

    .line 275
    .line 276
    move-object v10, v2

    .line 277
    move-object v2, v11

    .line 278
    move-object v11, v1

    .line 279
    invoke-static/range {v2 .. v13}, LBa/c;->b(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;I)LV/d;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    move-object v7, v12

    .line 284
    :goto_3
    const/4 v2, 0x0

    .line 285
    invoke-virtual {v7, v2}, LN/o;->p(Z)V

    .line 286
    .line 287
    .line 288
    return-object v1

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
