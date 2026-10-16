.class public final Lcom/moloco/sdk/internal/publisher/k0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/publisher/AdShowListener;

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/l0;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/k0;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/k0;->b:Lcom/moloco/sdk/internal/publisher/l0;

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
    new-instance p1, Lcom/moloco/sdk/internal/publisher/k0;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/k0;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/k0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/moloco/sdk/internal/publisher/k0;-><init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/k0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/k0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v5, v1, Lcom/moloco/sdk/internal/publisher/k0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    iget-object v7, v5, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 17
    .line 18
    iget-object v9, v1, Lcom/moloco/sdk/internal/publisher/k0;->a:Lcom/moloco/sdk/publisher/AdShowListener;

    .line 19
    .line 20
    if-eqz v9, :cond_0

    .line 21
    .line 22
    new-instance v8, LX2/j;

    .line 23
    .line 24
    iget-object v10, v5, Lcom/moloco/sdk/internal/publisher/l0;->b:Lcom/moloco/sdk/internal/services/u;

    .line 25
    .line 26
    iget-object v11, v5, Lcom/moloco/sdk/internal/publisher/l0;->c:Lcom/moloco/sdk/internal/services/events/c;

    .line 27
    .line 28
    new-instance v12, Lcom/moloco/sdk/internal/publisher/d0;

    .line 29
    .line 30
    invoke-direct {v12, v5, v3}, Lcom/moloco/sdk/internal/publisher/d0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;I)V

    .line 31
    .line 32
    .line 33
    new-instance v13, Lcom/moloco/sdk/internal/publisher/d0;

    .line 34
    .line 35
    const/4 v14, 0x2

    .line 36
    invoke-direct {v13, v5, v14}, Lcom/moloco/sdk/internal/publisher/d0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;I)V

    .line 37
    .line 38
    .line 39
    iget-object v15, v5, Lcom/moloco/sdk/internal/publisher/l0;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 40
    .line 41
    new-instance v14, Lcom/moloco/sdk/internal/publisher/d0;

    .line 42
    .line 43
    invoke-direct {v14, v5, v2}, Lcom/moloco/sdk/internal/publisher/d0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;I)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v16, v14

    .line 47
    .line 48
    iget-object v14, v5, Lcom/moloco/sdk/internal/publisher/l0;->i:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 49
    .line 50
    invoke-direct/range {v8 .. v16}, LX2/j;-><init>(Lcom/moloco/sdk/publisher/AdShowListener;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/publisher/d0;Lcom/moloco/sdk/internal/publisher/d0;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/d0;)V

    .line 51
    .line 52
    .line 53
    iput-object v8, v7, LC8/i;->f:Ljava/lang/Object;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iput-object v6, v7, LC8/i;->f:Ljava/lang/Object;

    .line 57
    .line 58
    :goto_0
    iget-object v8, v7, LC8/i;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, LX2/j;

    .line 61
    .line 62
    iget-object v9, v7, LC8/i;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 65
    .line 66
    instance-of v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 67
    .line 68
    if-eqz v10, :cond_1

    .line 69
    .line 70
    instance-of v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 71
    .line 72
    if-eqz v10, :cond_2

    .line 73
    .line 74
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    instance-of v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 78
    .line 79
    if-eqz v10, :cond_2

    .line 80
    .line 81
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v9, v6

    .line 85
    :goto_1
    sget-object v10, Lef/C;->a:Lef/C;

    .line 86
    .line 87
    sget-object v11, Lff/w;->a:Lff/w;

    .line 88
    .line 89
    iget-object v12, v5, Lcom/moloco/sdk/internal/publisher/l0;->d:Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v9, :cond_12

    .line 92
    .line 93
    iget-object v13, v5, Lcom/moloco/sdk/internal/publisher/l0;->p:Lcom/moloco/sdk/internal/publisher/B;

    .line 94
    .line 95
    iget-boolean v13, v13, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 96
    .line 97
    if-nez v13, :cond_3

    .line 98
    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_3
    invoke-interface {v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;->l()LHf/v0;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-interface {v13}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    check-cast v13, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_4

    .line 116
    .line 117
    if-eqz v8, :cond_13

    .line 118
    .line 119
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_ALREADY_DISPLAYING:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 120
    .line 121
    sget-object v2, Lcom/moloco/sdk/internal/o;->f:Lcom/moloco/sdk/internal/o;

    .line 122
    .line 123
    invoke-static {v12, v0, v2, v11}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v8, v0}, LX2/j;->R(Lcom/moloco/sdk/internal/r;)V

    .line 128
    .line 129
    .line 130
    return-object v10

    .line 131
    :cond_4
    iget-object v11, v7, LC8/i;->e:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v11, LEf/H0;

    .line 134
    .line 135
    if-eqz v11, :cond_5

    .line 136
    .line 137
    invoke-virtual {v11, v6}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 138
    .line 139
    .line 140
    :cond_5
    new-instance v11, Lcom/moloco/sdk/internal/publisher/g0;

    .line 141
    .line 142
    invoke-direct {v11, v9, v8, v5, v6}, Lcom/moloco/sdk/internal/publisher/g0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;LX2/j;Lcom/moloco/sdk/internal/publisher/l0;Ljf/c;)V

    .line 143
    .line 144
    .line 145
    iget-object v12, v5, Lcom/moloco/sdk/internal/publisher/l0;->m:LKd/a;

    .line 146
    .line 147
    invoke-static {v12, v6, v11, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    iput-object v11, v7, LC8/i;->e:Ljava/lang/Object;

    .line 152
    .line 153
    instance-of v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 154
    .line 155
    if-eqz v7, :cond_7

    .line 156
    .line 157
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;

    .line 158
    .line 159
    new-instance v3, Lcom/moloco/sdk/internal/publisher/j0;

    .line 160
    .line 161
    invoke-direct {v3, v5, v8}, Lcom/moloco/sdk/internal/publisher/j0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;LX2/j;)V

    .line 162
    .line 163
    .line 164
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    const/4 v15, 0x0

    .line 168
    const-string v12, "TemplateFullscreenAd"

    .line 169
    .line 170
    const-string v13, "fullscreen ad show called"

    .line 171
    .line 172
    const/16 v16, 0xc

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    new-instance v5, LY2/B;

    .line 180
    .line 181
    invoke-direct {v5, v3, v4, v9, v0}, LY2/B;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;

    .line 185
    .line 186
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 187
    .line 188
    iget-object v4, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 189
    .line 190
    invoke-virtual {v4, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;->b(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/b;

    .line 194
    .line 195
    invoke-direct {v3, v0, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;LY2/B;Ljf/c;)V

    .line 196
    .line 197
    .line 198
    iget-object v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->a:LKd/a;

    .line 199
    .line 200
    invoke-static {v4, v6, v3, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 201
    .line 202
    .line 203
    :try_start_0
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;->d:Ljava/lang/ref/WeakReference;

    .line 204
    .line 205
    iget-object v3, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->a:Landroid/content/Context;

    .line 206
    .line 207
    iget-object v4, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->k:LHf/x0;

    .line 208
    .line 209
    iget-object v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->c:Lcom/moloco/sdk/acm/recorder/c;

    .line 210
    .line 211
    iget-object v8, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->m:LHf/x0;

    .line 212
    .line 213
    invoke-static {v3, v4, v0, v7, v8}, Lp7/b;->d(Landroid/content/Context;LHf/x0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;Lcom/moloco/sdk/acm/recorder/c;LHf/x0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 214
    .line 215
    .line 216
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w;

    .line 217
    .line 218
    invoke-direct {v0, v9, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;LY2/B;Ljf/c;)V

    .line 219
    .line 220
    .line 221
    iget-object v3, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/x;->d:LKd/a;

    .line 222
    .line 223
    invoke-static {v3, v6, v0, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 224
    .line 225
    .line 226
    goto/16 :goto_7

    .line 227
    .line 228
    :goto_2
    move-object v14, v0

    .line 229
    goto :goto_3

    .line 230
    :catch_0
    move-exception v0

    .line 231
    goto :goto_2

    .line 232
    :goto_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 233
    .line 234
    const/16 v2, 0x24

    .line 235
    .line 236
    if-lt v0, v2, :cond_6

    .line 237
    .line 238
    instance-of v0, v14, Ljava/lang/reflect/UndeclaredThrowableException;

    .line 239
    .line 240
    if-eqz v0, :cond_6

    .line 241
    .line 242
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 243
    .line 244
    const-string v13, "Android16BetaFix - Prevented system-level NPE during startActivity"

    .line 245
    .line 246
    const/4 v15, 0x0

    .line 247
    const-string v12, "TemplateFullscreenAd"

    .line 248
    .line 249
    const/16 v16, 0x8

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/F;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/F;

    .line 257
    .line 258
    invoke-virtual {v5, v0}, LY2/B;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_7

    .line 262
    .line 263
    :cond_6
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 264
    .line 265
    const-string v13, "Failed to start fullscreen activity"

    .line 266
    .line 267
    const/4 v15, 0x0

    .line 268
    const-string v12, "TemplateFullscreenAd"

    .line 269
    .line 270
    const/16 v16, 0x8

    .line 271
    .line 272
    const/16 v17, 0x0

    .line 273
    .line 274
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    throw v14

    .line 278
    :cond_7
    instance-of v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 279
    .line 280
    if-eqz v7, :cond_13

    .line 281
    .line 282
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;

    .line 283
    .line 284
    iget-object v7, v5, Lcom/moloco/sdk/internal/publisher/l0;->q:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 285
    .line 286
    new-instance v11, Lcom/moloco/sdk/internal/publisher/i0;

    .line 287
    .line 288
    invoke-direct {v11, v5, v8}, Lcom/moloco/sdk/internal/publisher/i0;-><init>(Lcom/moloco/sdk/internal/publisher/l0;LX2/j;)V

    .line 289
    .line 290
    .line 291
    const-string v5, "options"

    .line 292
    .line 293
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    iget-object v5, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 297
    .line 298
    if-eqz v5, :cond_8

    .line 299
    .line 300
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 301
    .line 302
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;

    .line 303
    .line 304
    invoke-direct {v3, v5, v11, v0, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;Ljf/c;)V

    .line 305
    .line 306
    .line 307
    iget-object v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->f:LKd/a;

    .line 308
    .line 309
    invoke-static {v0, v6, v3, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 310
    .line 311
    .line 312
    return-object v10

    .line 313
    :cond_8
    iget-object v14, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 314
    .line 315
    if-eqz v14, :cond_10

    .line 316
    .line 317
    iget-object v2, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;->b:LF4/f;

    .line 318
    .line 319
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;

    .line 320
    .line 321
    invoke-direct {v5, v11, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;-><init>(Lcom/moloco/sdk/internal/publisher/i0;I)V

    .line 322
    .line 323
    .line 324
    iget-object v7, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H0;

    .line 325
    .line 326
    iput-object v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->c:Ltf/a;

    .line 327
    .line 328
    new-instance v5, LAf/r;

    .line 329
    .line 330
    const/16 v8, 0x13

    .line 331
    .line 332
    invoke-direct {v5, v14, v8}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    iput-object v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->d:Ltf/l;

    .line 336
    .line 337
    iput-object v11, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->k:Lcom/moloco/sdk/internal/publisher/i0;

    .line 338
    .line 339
    iput-boolean v3, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->l:Z

    .line 340
    .line 341
    iget-object v5, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;

    .line 342
    .line 343
    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Q0;->g:Lcom/moloco/sdk/internal/A;

    .line 344
    .line 345
    instance-of v8, v5, Lcom/moloco/sdk/internal/y;

    .line 346
    .line 347
    if-eqz v8, :cond_9

    .line 348
    .line 349
    check-cast v5, Lcom/moloco/sdk/internal/y;

    .line 350
    .line 351
    iget-object v0, v5, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 354
    .line 355
    invoke-virtual {v11, v0}, Lcom/moloco/sdk/internal/publisher/i0;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 356
    .line 357
    .line 358
    return-object v10

    .line 359
    :cond_9
    instance-of v8, v5, Lcom/moloco/sdk/internal/z;

    .line 360
    .line 361
    if-eqz v8, :cond_f

    .line 362
    .line 363
    check-cast v5, Lcom/moloco/sdk/internal/z;

    .line 364
    .line 365
    iget-object v0, v5, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 368
    .line 369
    new-instance v12, LS8/d;

    .line 370
    .line 371
    const-string v17, "destroy()V"

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const-class v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 377
    .line 378
    const-string v16, "destroy"

    .line 379
    .line 380
    const/16 v19, 0x6

    .line 381
    .line 382
    invoke-direct/range {v12 .. v19}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 383
    .line 384
    .line 385
    move-object v5, v12

    .line 386
    new-instance v12, LS8/d;

    .line 387
    .line 388
    const-string v17, "onForciblyClosed()V"

    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const-class v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 394
    .line 395
    const-string v16, "onForciblyClosed"

    .line 396
    .line 397
    const/16 v19, 0x7

    .line 398
    .line 399
    invoke-direct/range {v12 .. v19}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 400
    .line 401
    .line 402
    iget-object v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->c:Ltf/a;

    .line 403
    .line 404
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;

    .line 405
    .line 406
    invoke-direct {v8, v11, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;-><init>(Lcom/moloco/sdk/internal/publisher/i0;I)V

    .line 407
    .line 408
    .line 409
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/b;

    .line 410
    .line 411
    invoke-direct {v9, v11, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/b;-><init>(Lcom/moloco/sdk/internal/publisher/i0;I)V

    .line 412
    .line 413
    .line 414
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;->h:LHf/j0;

    .line 415
    .line 416
    const-string v4, "adData"

    .line 417
    .line 418
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iget-object v4, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 422
    .line 423
    iget-object v13, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->a:Landroid/content/Context;

    .line 424
    .line 425
    const-string v15, "onShowListenerClick"

    .line 426
    .line 427
    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    iget-object v15, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 431
    .line 432
    invoke-static {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/a;->b(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;)Z

    .line 433
    .line 434
    .line 435
    move-result v16

    .line 436
    if-nez v16, :cond_a

    .line 437
    .line 438
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 439
    .line 440
    invoke-virtual {v11, v0}, Lcom/moloco/sdk/internal/publisher/i0;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 441
    .line 442
    .line 443
    return-object v10

    .line 444
    :cond_a
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/h;

    .line 445
    .line 446
    iget-object v0, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 447
    .line 448
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 449
    .line 450
    iget-object v0, v2, LF4/f;->c:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 453
    .line 454
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;

    .line 455
    .line 456
    iget-object v0, v2, LF4/f;->d:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Lcom/moloco/sdk/internal/g;

    .line 459
    .line 460
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->d:Ltf/p;

    .line 461
    .line 462
    sput-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->e:LS8/d;

    .line 463
    .line 464
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 465
    .line 466
    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->a:Ljava/lang/ref/WeakReference;

    .line 470
    .line 471
    sput-object v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->h:LS8/d;

    .line 472
    .line 473
    sput-object v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->i:Ltf/a;

    .line 474
    .line 475
    sput-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->j:Ltf/a;

    .line 476
    .line 477
    sput-object v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/b;

    .line 478
    .line 479
    iget-object v0, v2, LF4/f;->e:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/m;

    .line 482
    .line 483
    if-eqz v0, :cond_b

    .line 484
    .line 485
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/c;

    .line 486
    .line 487
    iget-boolean v5, v0, Lcom/moloco/sdk/internal/ortb/model/m;->a:Z

    .line 488
    .line 489
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/m;->b:Ljava/lang/String;

    .line 490
    .line 491
    invoke-direct {v4, v5, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/c;-><init>(ZLjava/lang/String;)V

    .line 492
    .line 493
    .line 494
    goto :goto_4

    .line 495
    :cond_b
    move-object v4, v6

    .line 496
    :goto_4
    sput-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->l:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/c;

    .line 497
    .line 498
    iget-object v0, v2, LF4/f;->f:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/o;

    .line 501
    .line 502
    if-eqz v0, :cond_d

    .line 503
    .line 504
    new-instance v16, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/b;

    .line 505
    .line 506
    iget-object v4, v0, Lcom/moloco/sdk/internal/ortb/model/o;->d:Ljava/lang/Boolean;

    .line 507
    .line 508
    if-eqz v4, :cond_c

    .line 509
    .line 510
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    :cond_c
    move/from16 v21, v3

    .line 515
    .line 516
    iget-object v3, v0, Lcom/moloco/sdk/internal/ortb/model/o;->b:Ljava/lang/String;

    .line 517
    .line 518
    iget-object v4, v0, Lcom/moloco/sdk/internal/ortb/model/o;->c:Ljava/lang/String;

    .line 519
    .line 520
    const/16 v17, 0x1

    .line 521
    .line 522
    iget-boolean v0, v0, Lcom/moloco/sdk/internal/ortb/model/o;->a:Z

    .line 523
    .line 524
    move/from16 v18, v0

    .line 525
    .line 526
    move-object/from16 v19, v3

    .line 527
    .line 528
    move-object/from16 v20, v4

    .line 529
    .line 530
    invoke-direct/range {v16 .. v21}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/b;-><init>(ZZLjava/lang/String;Ljava/lang/String;Z)V

    .line 531
    .line 532
    .line 533
    goto :goto_5

    .line 534
    :cond_d
    move-object/from16 v16, v6

    .line 535
    .line 536
    :goto_5
    sput-object v16, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->m:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/b;

    .line 537
    .line 538
    sput-object v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->n:Lcom/moloco/sdk/acm/recorder/c;

    .line 539
    .line 540
    new-instance v0, Landroid/content/Intent;

    .line 541
    .line 542
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;

    .line 543
    .line 544
    invoke-direct {v0, v13, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 545
    .line 546
    .line 547
    const-string v3, "CLOSE_DELAY_SECONDS"

    .line 548
    .line 549
    iget v4, v2, LF4/f;->a:I

    .line 550
    .line 551
    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 552
    .line 553
    .line 554
    const-string v3, "DEC_DELAY_SECONDS"

    .line 555
    .line 556
    iget v2, v2, LF4/f;->b:I

    .line 557
    .line 558
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 559
    .line 560
    .line 561
    iget-object v2, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->f:Ljava/lang/String;

    .line 562
    .line 563
    if-eqz v2, :cond_e

    .line 564
    .line 565
    const-string v3, "BUNDLE_ID"

    .line 566
    .line 567
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 568
    .line 569
    .line 570
    :cond_e
    const/high16 v2, 0x10000000

    .line 571
    .line 572
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v13, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 576
    .line 577
    .line 578
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 579
    .line 580
    iget-object v2, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->m:LHf/x0;

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v6, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    return-object v10

    .line 589
    :cond_f
    new-instance v2, LE5/Q;

    .line 590
    .line 591
    invoke-direct {v2, v4, v0}, LE5/Q;-><init>(BI)V

    .line 592
    .line 593
    .line 594
    throw v2

    .line 595
    :cond_10
    iget-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s0;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;

    .line 596
    .line 597
    if-eqz v0, :cond_11

    .line 598
    .line 599
    iget-object v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;->c:LF4/f;

    .line 600
    .line 601
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/p;

    .line 602
    .line 603
    invoke-direct {v4, v0, v3, v11, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/p;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;LF4/f;Lcom/moloco/sdk/internal/publisher/i0;Ljf/c;)V

    .line 604
    .line 605
    .line 606
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/q;->e:LKd/a;

    .line 607
    .line 608
    invoke-static {v0, v6, v4, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 609
    .line 610
    .line 611
    move-object v6, v10

    .line 612
    :cond_11
    if-nez v6, :cond_13

    .line 613
    .line 614
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/b;

    .line 615
    .line 616
    invoke-interface {v11, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 617
    .line 618
    .line 619
    return-object v10

    .line 620
    :cond_12
    :goto_6
    if-eqz v8, :cond_13

    .line 621
    .line 622
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_NOT_LOADED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 623
    .line 624
    sget-object v2, Lcom/moloco/sdk/internal/o;->e:Lcom/moloco/sdk/internal/o;

    .line 625
    .line 626
    invoke-static {v12, v0, v2, v11}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v8, v0}, LX2/j;->R(Lcom/moloco/sdk/internal/r;)V

    .line 631
    .line 632
    .line 633
    :cond_13
    :goto_7
    return-object v10
.end method
