.class public final synthetic LEf/p0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, LEf/p0;->a:I

    invoke-direct/range {p0 .. p6}, Lkotlin/jvm/internal/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "adm"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v5, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    const-string v6, "p0"

    .line 10
    .line 11
    iget v7, v0, LEf/p0;->a:I

    .line 12
    .line 13
    packed-switch v7, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Ljf/c;

    .line 19
    .line 20
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lio/ktor/utils/io/J;

    .line 23
    .line 24
    invoke-interface {v2, v1}, Lio/ktor/utils/io/J;->f(Ljf/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    return-object v1

    .line 29
    :pswitch_0
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Ljf/c;

    .line 32
    .line 33
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->b(Ljf/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    return-object v1

    .line 42
    :pswitch_1
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 45
    .line 46
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 52
    .line 53
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 56
    .line 57
    .line 58
    return-object v5

    .line 59
    :pswitch_2
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 62
    .line 63
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 69
    .line 70
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 73
    .line 74
    .line 75
    return-object v5

    .line 76
    :pswitch_3
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    iget-object v4, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 87
    .line 88
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->i:LHf/x0;

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v2, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->h:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 99
    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    iget v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 103
    .line 104
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget-object v4, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->c:Ljava/lang/Object;

    .line 109
    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    iget-object v6, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 113
    .line 114
    invoke-virtual {v6, v4, v2, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;->a(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    iget v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 119
    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    iget-object v4, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->d:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz v4, :cond_1

    .line 127
    .line 128
    iget-object v6, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 129
    .line 130
    invoke-virtual {v6, v4, v2, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;->a(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_1
    :goto_0
    return-object v5

    .line 134
    :pswitch_4
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;

    .line 137
    .line 138
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/c;

    .line 149
    .line 150
    invoke-direct {v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/c;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/d;)V

    .line 154
    .line 155
    .line 156
    return-object v5

    .line 157
    :pswitch_5
    move-object/from16 v1, p1

    .line 158
    .line 159
    check-cast v1, Ljf/c;

    .line 160
    .line 161
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->b(Ljf/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    return-object v1

    .line 170
    :pswitch_6
    move-object/from16 v1, p1

    .line 171
    .line 172
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 173
    .line 174
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 180
    .line 181
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 182
    .line 183
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 184
    .line 185
    .line 186
    return-object v5

    .line 187
    :pswitch_7
    move-object/from16 v1, p1

    .line 188
    .line 189
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 190
    .line 191
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c;

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;

    .line 202
    .line 203
    if-eqz v2, :cond_2

    .line 204
    .line 205
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/i;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/i;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 211
    .line 212
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 213
    .line 214
    .line 215
    :cond_2
    return-object v5

    .line 216
    :pswitch_8
    move-object/from16 v1, p1

    .line 217
    .line 218
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 219
    .line 220
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 226
    .line 227
    iget-boolean v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->l:Z

    .line 228
    .line 229
    if-eqz v3, :cond_3

    .line 230
    .line 231
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->k:Lcom/moloco/sdk/internal/publisher/i0;

    .line 232
    .line 233
    if-eqz v2, :cond_4

    .line 234
    .line 235
    invoke-static {v1}, Lgc/b;->f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/internal/publisher/i0;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_3
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;

    .line 244
    .line 245
    if-eqz v2, :cond_4

    .line 246
    .line 247
    invoke-static {v1}, Lgc/b;->f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 252
    .line 253
    .line 254
    :cond_4
    :goto_1
    return-object v5

    .line 255
    :pswitch_9
    move-object/from16 v9, p1

    .line 256
    .line 257
    check-cast v9, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 258
    .line 259
    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget-object v5, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v5, Lcom/moloco/sdk/internal/publisher/l0;

    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5, v2}, Lcom/moloco/sdk/internal/publisher/l0;->b(Lcom/moloco/sdk/internal/r;)V

    .line 270
    .line 271
    .line 272
    iget-object v6, v9, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 273
    .line 274
    iget-object v7, v6, Lcom/moloco/sdk/internal/ortb/model/w;->c:Lcom/moloco/sdk/internal/ortb/model/d0;

    .line 275
    .line 276
    if-eqz v7, :cond_5

    .line 277
    .line 278
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 279
    .line 280
    iget-object v7, v7, Lcom/moloco/sdk/internal/ortb/model/d0;->a:Ljava/lang/Boolean;

    .line 281
    .line 282
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    goto :goto_2

    .line 287
    :cond_5
    const/4 v4, 0x0

    .line 288
    :goto_2
    iget-object v13, v5, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 289
    .line 290
    iget-object v12, v5, Lcom/moloco/sdk/internal/publisher/l0;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 291
    .line 292
    iget-object v11, v5, Lcom/moloco/sdk/internal/publisher/l0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 293
    .line 294
    iget-object v8, v5, Lcom/moloco/sdk/internal/publisher/l0;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 295
    .line 296
    iget-object v10, v5, Lcom/moloco/sdk/internal/publisher/l0;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 297
    .line 298
    iget-object v15, v5, Lcom/moloco/sdk/internal/publisher/l0;->a:Landroid/content/Context;

    .line 299
    .line 300
    iget-object v7, v6, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 301
    .line 302
    iget-object v14, v9, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    .line 303
    .line 304
    if-eqz v4, :cond_8

    .line 305
    .line 306
    iget-object v4, v6, Lcom/moloco/sdk/internal/ortb/model/w;->c:Lcom/moloco/sdk/internal/ortb/model/d0;

    .line 307
    .line 308
    if-eqz v4, :cond_6

    .line 309
    .line 310
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/d0;->b:Lcom/moloco/sdk/internal/ortb/model/U;

    .line 311
    .line 312
    if-eqz v4, :cond_6

    .line 313
    .line 314
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/U;->a:Ljava/lang/Boolean;

    .line 315
    .line 316
    if-eqz v4, :cond_6

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    :cond_6
    move/from16 v22, v3

    .line 323
    .line 324
    new-instance v3, Lcom/moloco/sdk/internal/services/B;

    .line 325
    .line 326
    invoke-direct {v3, v10, v8}, Lcom/moloco/sdk/internal/services/B;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/internal/services/events/c;)V

    .line 327
    .line 328
    .line 329
    iget-object v4, v9, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 330
    .line 331
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    move-object v1, v14

    .line 335
    new-instance v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 336
    .line 337
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 338
    .line 339
    .line 340
    move-result-object v19

    .line 341
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 342
    .line 343
    .line 344
    move-result-object v20

    .line 345
    move-object/from16 v17, v3

    .line 346
    .line 347
    move-object/from16 v16, v4

    .line 348
    .line 349
    move-object/from16 v18, v11

    .line 350
    .line 351
    move-object/from16 v21, v12

    .line 352
    .line 353
    invoke-direct/range {v14 .. v22}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/acm/recorder/c;Z)V

    .line 354
    .line 355
    .line 356
    iput-object v14, v13, LC8/i;->b:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v7, v13, LC8/i;->c:Ljava/lang/Object;

    .line 359
    .line 360
    if-eqz v1, :cond_7

    .line 361
    .line 362
    new-instance v2, Lcom/moloco/sdk/internal/publisher/D;

    .line 363
    .line 364
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/publisher/D;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :cond_7
    iput-object v2, v13, LC8/i;->d:Ljava/lang/Object;

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_8
    move-object/from16 v18, v11

    .line 371
    .line 372
    move-object/from16 v21, v12

    .line 373
    .line 374
    move-object v1, v14

    .line 375
    iget-object v3, v5, Lcom/moloco/sdk/internal/publisher/l0;->g:Ltf/l;

    .line 376
    .line 377
    iget-object v4, v6, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 378
    .line 379
    invoke-interface {v3, v4}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 384
    .line 385
    iput-object v3, v5, Lcom/moloco/sdk/internal/publisher/l0;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 386
    .line 387
    if-eqz v4, :cond_9

    .line 388
    .line 389
    iget-object v3, v4, Lcom/moloco/sdk/internal/ortb/model/h0;->g:Lcom/moloco/sdk/internal/ortb/model/q;

    .line 390
    .line 391
    goto :goto_3

    .line 392
    :cond_9
    move-object v3, v2

    .line 393
    :goto_3
    iput-object v3, v5, Lcom/moloco/sdk/internal/publisher/l0;->r:Lcom/moloco/sdk/internal/ortb/model/q;

    .line 394
    .line 395
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 396
    .line 397
    move-object v3, v7

    .line 398
    move-object v7, v15

    .line 399
    move-object/from16 v11, v18

    .line 400
    .line 401
    move-object/from16 v12, v21

    .line 402
    .line 403
    invoke-direct/range {v6 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 404
    .line 405
    .line 406
    iput-object v6, v13, LC8/i;->b:Ljava/lang/Object;

    .line 407
    .line 408
    iput-object v3, v13, LC8/i;->c:Ljava/lang/Object;

    .line 409
    .line 410
    if-eqz v1, :cond_a

    .line 411
    .line 412
    new-instance v2, Lcom/moloco/sdk/internal/publisher/D;

    .line 413
    .line 414
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/publisher/D;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    :cond_a
    iput-object v2, v13, LC8/i;->d:Ljava/lang/Object;

    .line 418
    .line 419
    move-object v14, v6

    .line 420
    :goto_4
    return-object v14

    .line 421
    :pswitch_a
    move-object/from16 v5, p1

    .line 422
    .line 423
    check-cast v5, Lcom/moloco/sdk/internal/ortb/model/u;

    .line 424
    .line 425
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    iget-object v7, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v7, Lcom/moloco/sdk/internal/publisher/V;

    .line 431
    .line 432
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    sget-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/y0;->a:LBf/i;

    .line 436
    .line 437
    iget-object v8, v5, Lcom/moloco/sdk/internal/ortb/model/u;->a:Ljava/lang/String;

    .line 438
    .line 439
    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    const-string v1, "<VAST"

    .line 443
    .line 444
    invoke-static {v8, v1, v3}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    iput-boolean v1, v7, Lcom/moloco/sdk/internal/publisher/V;->p:Z

    .line 449
    .line 450
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/internal/publisher/V;->b(Lcom/moloco/sdk/internal/r;)V

    .line 451
    .line 452
    .line 453
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/V;->l:Lcom/moloco/sdk/internal/services/B;

    .line 454
    .line 455
    iget-object v8, v7, Lcom/moloco/sdk/internal/publisher/V;->u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 456
    .line 457
    iget-object v9, v7, Lcom/moloco/sdk/internal/publisher/V;->g:Lcom/moloco/sdk/internal/publisher/E;

    .line 458
    .line 459
    iget-object v10, v7, Lcom/moloco/sdk/internal/publisher/V;->a:Landroid/content/Context;

    .line 460
    .line 461
    iget-object v11, v7, Lcom/moloco/sdk/internal/publisher/V;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 462
    .line 463
    iget-object v12, v7, Lcom/moloco/sdk/internal/publisher/V;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 464
    .line 465
    iget-object v13, v7, Lcom/moloco/sdk/internal/publisher/V;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 466
    .line 467
    iget-object v14, v7, Lcom/moloco/sdk/internal/publisher/V;->j:Lcom/moloco/sdk/internal/b;

    .line 468
    .line 469
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;

    .line 473
    .line 474
    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v6, "p1"

    .line 478
    .line 479
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    const-string v6, "p3"

    .line 483
    .line 484
    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    const-string v6, "p4"

    .line 488
    .line 489
    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    const-string v6, "p5"

    .line 493
    .line 494
    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    const-string v6, "p6"

    .line 498
    .line 499
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    const-string v6, "p7"

    .line 503
    .line 504
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    new-instance v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;

    .line 508
    .line 509
    iget-object v6, v5, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 510
    .line 511
    iget-object v6, v6, Lcom/moloco/sdk/internal/ortb/model/w;->a:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 512
    .line 513
    if-eqz v6, :cond_b

    .line 514
    .line 515
    sget-object v9, Lcom/moloco/sdk/internal/i;->a:Lef/p;

    .line 516
    .line 517
    invoke-static {v6, v3}, Lcom/moloco/sdk/internal/i;->a(Lcom/moloco/sdk/internal/ortb/model/h0;Z)LF4/f;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 522
    .line 523
    invoke-static {v6, v3}, Lcom/moloco/sdk/internal/i;->e(Lcom/moloco/sdk/internal/ortb/model/h0;Z)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    invoke-direct {v4, v6, v9, v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;LF4/f;LF4/f;)V

    .line 528
    .line 529
    .line 530
    move-object/from16 v19, v4

    .line 531
    .line 532
    goto :goto_5

    .line 533
    :cond_b
    sget-object v4, Lcom/moloco/sdk/internal/i;->a:Lef/p;

    .line 534
    .line 535
    invoke-virtual {v4}, Lef/p;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 540
    .line 541
    const-string v6, "<this>"

    .line 542
    .line 543
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-static {v4, v3}, Lcom/moloco/sdk/internal/i;->a(Lcom/moloco/sdk/internal/ortb/model/h0;Z)LF4/f;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 551
    .line 552
    invoke-static {v4, v3}, Lcom/moloco/sdk/internal/i;->e(Lcom/moloco/sdk/internal/ortb/model/h0;Z)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-direct {v9, v4, v6, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;LF4/f;LF4/f;)V

    .line 557
    .line 558
    .line 559
    move-object/from16 v19, v9

    .line 560
    .line 561
    :goto_5
    sget-object v4, LEf/S;->a:LLf/e;

    .line 562
    .line 563
    sget-object v4, LJf/n;->a:LFf/e;

    .line 564
    .line 565
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    invoke-interface {v4, v6}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-static {v4}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 574
    .line 575
    .line 576
    move-result-object v23

    .line 577
    move-object/from16 v24, v1

    .line 578
    .line 579
    move-object/from16 v18, v5

    .line 580
    .line 581
    move-object/from16 v25, v8

    .line 582
    .line 583
    move-object/from16 v16, v10

    .line 584
    .line 585
    move-object/from16 v17, v11

    .line 586
    .line 587
    move-object/from16 v20, v12

    .line 588
    .line 589
    move-object/from16 v21, v13

    .line 590
    .line 591
    move-object/from16 v22, v14

    .line 592
    .line 593
    invoke-direct/range {v15 .. v25}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/j0;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;Lcom/moloco/sdk/internal/b;LKd/a;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;)V

    .line 594
    .line 595
    .line 596
    move-object/from16 v1, v18

    .line 597
    .line 598
    check-cast v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 599
    .line 600
    iget-object v4, v7, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 601
    .line 602
    iput-object v15, v4, LR0/e;->d:Ljava/lang/Object;

    .line 603
    .line 604
    iget-object v5, v1, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 605
    .line 606
    iget-object v6, v5, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 607
    .line 608
    iput-object v6, v4, LR0/e;->e:Ljava/lang/Object;

    .line 609
    .line 610
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/u;->c:Ljava/lang/String;

    .line 611
    .line 612
    if-eqz v1, :cond_c

    .line 613
    .line 614
    new-instance v6, Lcom/moloco/sdk/internal/publisher/D;

    .line 615
    .line 616
    invoke-direct {v6, v1}, Lcom/moloco/sdk/internal/publisher/D;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    goto :goto_6

    .line 620
    :cond_c
    move-object v6, v2

    .line 621
    :goto_6
    iput-object v6, v4, LR0/e;->f:Ljava/lang/Object;

    .line 622
    .line 623
    iget-object v1, v5, Lcom/moloco/sdk/internal/ortb/model/w;->e:Lcom/moloco/sdk/internal/ortb/model/b0;

    .line 624
    .line 625
    if-eqz v1, :cond_d

    .line 626
    .line 627
    iget-object v5, v1, Lcom/moloco/sdk/internal/ortb/model/b0;->a:Lcom/moloco/sdk/internal/ortb/model/s;

    .line 628
    .line 629
    if-eqz v5, :cond_d

    .line 630
    .line 631
    iget-object v5, v5, Lcom/moloco/sdk/internal/ortb/model/s;->b:Ljava/lang/String;

    .line 632
    .line 633
    goto :goto_7

    .line 634
    :cond_d
    move-object v5, v2

    .line 635
    :goto_7
    iput-object v5, v4, LR0/e;->h:Ljava/lang/Object;

    .line 636
    .line 637
    if-eqz v1, :cond_e

    .line 638
    .line 639
    iget-object v5, v1, Lcom/moloco/sdk/internal/ortb/model/b0;->a:Lcom/moloco/sdk/internal/ortb/model/s;

    .line 640
    .line 641
    if-eqz v5, :cond_e

    .line 642
    .line 643
    iget-object v5, v5, Lcom/moloco/sdk/internal/ortb/model/s;->a:Ljava/lang/String;

    .line 644
    .line 645
    goto :goto_8

    .line 646
    :cond_e
    move-object v5, v2

    .line 647
    :goto_8
    iput-object v5, v4, LR0/e;->i:Ljava/lang/Object;

    .line 648
    .line 649
    if-eqz v1, :cond_f

    .line 650
    .line 651
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/b0;->a:Lcom/moloco/sdk/internal/ortb/model/s;

    .line 652
    .line 653
    goto :goto_9

    .line 654
    :cond_f
    move-object v1, v2

    .line 655
    :goto_9
    if-eqz v1, :cond_10

    .line 656
    .line 657
    move v1, v3

    .line 658
    goto :goto_a

    .line 659
    :cond_10
    const/4 v1, 0x0

    .line 660
    :goto_a
    iput-boolean v1, v4, LR0/e;->c:Z

    .line 661
    .line 662
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/V;->y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 663
    .line 664
    invoke-virtual {v15, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->setAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;)V

    .line 665
    .line 666
    .line 667
    iget-object v1, v7, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 668
    .line 669
    sget-object v5, Lcom/moloco/sdk/publisher/AdFormatType;->MREC:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 670
    .line 671
    if-ne v1, v5, :cond_11

    .line 672
    .line 673
    iget-boolean v1, v7, Lcom/moloco/sdk/internal/publisher/V;->p:Z

    .line 674
    .line 675
    if-eqz v1, :cond_11

    .line 676
    .line 677
    move v1, v3

    .line 678
    goto :goto_b

    .line 679
    :cond_11
    const/4 v1, 0x0

    .line 680
    :goto_b
    const/4 v5, 0x3

    .line 681
    iget-object v6, v7, Lcom/moloco/sdk/internal/publisher/V;->s:LKd/a;

    .line 682
    .line 683
    const/4 v8, 0x2

    .line 684
    if-eqz v1, :cond_14

    .line 685
    .line 686
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 687
    .line 688
    const-string v11, "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state."

    .line 689
    .line 690
    const/4 v12, 0x0

    .line 691
    const-string v10, "BannerViewImpl"

    .line 692
    .line 693
    const/4 v13, 0x4

    .line 694
    const/4 v14, 0x0

    .line 695
    invoke-static/range {v9 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    iget-object v1, v4, LR0/e;->g:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v1, LEf/H0;

    .line 701
    .line 702
    if-eqz v1, :cond_12

    .line 703
    .line 704
    invoke-virtual {v1, v2}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 705
    .line 706
    .line 707
    :cond_12
    iget-object v1, v4, LR0/e;->d:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 710
    .line 711
    if-eqz v1, :cond_18

    .line 712
    .line 713
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->isLoaded()LHf/v0;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    if-nez v1, :cond_13

    .line 718
    .line 719
    goto :goto_e

    .line 720
    :cond_13
    iget-object v9, v7, Lcom/moloco/sdk/internal/publisher/V;->n:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K0;

    .line 721
    .line 722
    invoke-virtual {v9, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;->a(Landroid/view/View;)LHf/l;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    new-instance v10, Lcom/moloco/sdk/internal/publisher/L;

    .line 727
    .line 728
    const/4 v11, 0x0

    .line 729
    invoke-direct {v10, v5, v2, v11}, Lcom/moloco/sdk/internal/publisher/L;-><init>(ILjf/c;I)V

    .line 730
    .line 731
    .line 732
    new-instance v11, LHf/a0;

    .line 733
    .line 734
    invoke-direct {v11, v1, v9, v10}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 735
    .line 736
    .line 737
    new-instance v1, Lcom/moloco/sdk/internal/publisher/M;

    .line 738
    .line 739
    invoke-direct {v1, v8, v2}, Llf/j;-><init>(ILjf/c;)V

    .line 740
    .line 741
    .line 742
    new-instance v8, LHf/v;

    .line 743
    .line 744
    invoke-direct {v8, v11, v1}, LHf/v;-><init>(LHf/l;Ltf/p;)V

    .line 745
    .line 746
    .line 747
    new-instance v1, Lcom/moloco/sdk/internal/publisher/N;

    .line 748
    .line 749
    invoke-direct {v1, v7, v4, v2}, Lcom/moloco/sdk/internal/publisher/N;-><init>(Lcom/moloco/sdk/internal/publisher/V;LR0/e;Ljf/c;)V

    .line 750
    .line 751
    .line 752
    new-instance v9, LHf/Z;

    .line 753
    .line 754
    const/4 v11, 0x0

    .line 755
    invoke-direct {v9, v8, v1, v11}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 756
    .line 757
    .line 758
    invoke-static {v9, v6}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    iput-object v1, v4, LR0/e;->g:Ljava/lang/Object;

    .line 763
    .line 764
    goto :goto_e

    .line 765
    :cond_14
    sget-object v9, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 766
    .line 767
    const-string v11, "Banner: Using isAdShowing function to track ad display state."

    .line 768
    .line 769
    const/4 v12, 0x0

    .line 770
    const-string v10, "BannerViewImpl"

    .line 771
    .line 772
    const/4 v13, 0x4

    .line 773
    const/4 v14, 0x0

    .line 774
    invoke-static/range {v9 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    iget-object v1, v4, LR0/e;->g:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v1, LEf/H0;

    .line 780
    .line 781
    if-eqz v1, :cond_15

    .line 782
    .line 783
    invoke-virtual {v1, v2}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 784
    .line 785
    .line 786
    :cond_15
    iget-object v1, v4, LR0/e;->d:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 789
    .line 790
    iget-boolean v9, v7, Lcom/moloco/sdk/internal/publisher/V;->e:Z

    .line 791
    .line 792
    if-nez v9, :cond_17

    .line 793
    .line 794
    if-nez v1, :cond_16

    .line 795
    .line 796
    goto :goto_c

    .line 797
    :cond_16
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->l()LHf/v0;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    goto :goto_d

    .line 802
    :cond_17
    :goto_c
    invoke-virtual {v7}, Lcom/moloco/sdk/publisher/Banner;->isViewShown()LHf/v0;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    :goto_d
    new-instance v9, Lcom/moloco/sdk/internal/publisher/O;

    .line 807
    .line 808
    invoke-direct {v9, v8, v2}, Llf/j;-><init>(ILjf/c;)V

    .line 809
    .line 810
    .line 811
    new-instance v8, LHf/v;

    .line 812
    .line 813
    invoke-direct {v8, v1, v9}, LHf/v;-><init>(LHf/l;Ltf/p;)V

    .line 814
    .line 815
    .line 816
    new-instance v1, Lcom/moloco/sdk/internal/publisher/P;

    .line 817
    .line 818
    invoke-direct {v1, v7, v4, v2}, Lcom/moloco/sdk/internal/publisher/P;-><init>(Lcom/moloco/sdk/internal/publisher/V;LR0/e;Ljf/c;)V

    .line 819
    .line 820
    .line 821
    new-instance v9, LHf/Z;

    .line 822
    .line 823
    const/4 v11, 0x0

    .line 824
    invoke-direct {v9, v8, v1, v11}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 825
    .line 826
    .line 827
    invoke-static {v9, v6}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    iput-object v1, v4, LR0/e;->g:Ljava/lang/Object;

    .line 832
    .line 833
    :cond_18
    :goto_e
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 834
    .line 835
    iget-object v8, v7, Lcom/moloco/sdk/internal/publisher/V;->k:Lcom/moloco/sdk/internal/m;

    .line 836
    .line 837
    iget v9, v8, Lcom/moloco/sdk/internal/m;->a:I

    .line 838
    .line 839
    int-to-float v9, v9

    .line 840
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 849
    .line 850
    mul-float/2addr v9, v10

    .line 851
    float-to-int v9, v9

    .line 852
    iget v8, v8, Lcom/moloco/sdk/internal/m;->b:I

    .line 853
    .line 854
    int-to-float v8, v8

    .line 855
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 856
    .line 857
    .line 858
    move-result-object v10

    .line 859
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 860
    .line 861
    .line 862
    move-result-object v10

    .line 863
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 864
    .line 865
    mul-float/2addr v10, v8

    .line 866
    float-to-int v10, v10

    .line 867
    invoke-direct {v1, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 868
    .line 869
    .line 870
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 871
    .line 872
    invoke-virtual {v7, v15, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 873
    .line 874
    .line 875
    iget-boolean v1, v4, LR0/e;->c:Z

    .line 876
    .line 877
    iget-object v4, v7, Lcom/moloco/sdk/internal/publisher/V;->a:Landroid/content/Context;

    .line 878
    .line 879
    if-eqz v1, :cond_19

    .line 880
    .line 881
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;

    .line 882
    .line 883
    const-string v9, "context"

    .line 884
    .line 885
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    invoke-direct {v1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 889
    .line 890
    .line 891
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    .line 892
    .line 893
    const/4 v10, -0x1

    .line 894
    invoke-direct {v9, v10, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v1, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 898
    .line 899
    .line 900
    const/4 v11, 0x0

    .line 901
    invoke-virtual {v1, v11}, Landroid/view/View;->setBackgroundColor(I)V

    .line 902
    .line 903
    .line 904
    const/4 v9, 0x7

    .line 905
    invoke-static {v11, v11, v9}, LHf/k0;->b(III)LHf/j0;

    .line 906
    .line 907
    .line 908
    move-result-object v9

    .line 909
    new-instance v11, Lcom/moloco/sdk/internal/publisher/S;

    .line 910
    .line 911
    invoke-direct {v11, v9, v7, v2}, Lcom/moloco/sdk/internal/publisher/S;-><init>(LHf/j0;Lcom/moloco/sdk/internal/publisher/V;Ljf/c;)V

    .line 912
    .line 913
    .line 914
    invoke-static {v6, v2, v11, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 915
    .line 916
    .line 917
    new-instance v2, Lcom/moloco/sdk/internal/publisher/K;

    .line 918
    .line 919
    invoke-direct {v2, v7, v1, v9}, Lcom/moloco/sdk/internal/publisher/K;-><init>(Lcom/moloco/sdk/internal/publisher/V;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/O;LHf/j0;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 923
    .line 924
    .line 925
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 926
    .line 927
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 928
    .line 929
    .line 930
    move-result-object v5

    .line 931
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 932
    .line 933
    .line 934
    move-result-object v5

    .line 935
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 936
    .line 937
    mul-float/2addr v8, v5

    .line 938
    float-to-int v5, v8

    .line 939
    invoke-direct {v2, v10, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v7, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 943
    .line 944
    .line 945
    :cond_19
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;

    .line 946
    .line 947
    iget-object v2, v7, Lcom/moloco/sdk/internal/publisher/V;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 948
    .line 949
    invoke-direct {v1, v2, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Landroid/content/Context;)V

    .line 950
    .line 951
    .line 952
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 953
    .line 954
    const/4 v4, -0x2

    .line 955
    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 956
    .line 957
    .line 958
    const v4, 0x800053

    .line 959
    .line 960
    .line 961
    iput v4, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 962
    .line 963
    const/16 v4, 0xc

    .line 964
    .line 965
    const/4 v11, 0x0

    .line 966
    invoke-virtual {v1, v4, v11, v11, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 967
    .line 968
    .line 969
    const-string v4, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    .line 970
    .line 971
    invoke-virtual {v1, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;->setPrivacyUrl(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    new-instance v4, Lcom/moloco/sdk/internal/publisher/I;

    .line 975
    .line 976
    invoke-direct {v4, v7, v3}, Lcom/moloco/sdk/internal/publisher/I;-><init>(Lcom/moloco/sdk/internal/publisher/V;I)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/h;->setOnButtonRenderedListener(Ltf/l;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 986
    .line 987
    .line 988
    return-object v15

    .line 989
    :pswitch_b
    move-object/from16 v1, p1

    .line 990
    .line 991
    check-cast v1, Ljava/lang/Throwable;

    .line 992
    .line 993
    iget-object v2, v0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v2, LEf/q0;

    .line 996
    .line 997
    invoke-virtual {v2, v1}, LEf/q0;->j(Ljava/lang/Throwable;)V

    .line 998
    .line 999
    .line 1000
    return-object v5

    .line 1001
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
