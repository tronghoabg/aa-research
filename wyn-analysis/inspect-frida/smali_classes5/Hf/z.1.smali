.class public final LHf/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LHf/z;->a:I

    iput-object p2, p0, LHf/z;->b:Ljava/lang/Object;

    iput-object p3, p0, LHf/z;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, LHf/z;->a:I

    iput-object p1, p0, LHf/z;->c:Ljava/lang/Object;

    iput-object p2, p0, LHf/z;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ltf/p;Lkotlin/jvm/internal/G;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LHf/z;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    check-cast p1, Llf/j;

    iput-object p1, p0, LHf/z;->b:Ljava/lang/Object;

    iput-object p2, p0, LHf/z;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;Ljf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "Playlist item displaying event is MRAID, setting orientation to: "

    .line 8
    .line 9
    const-string v4, "Set playback: "

    .line 10
    .line 11
    const-string v5, "Playlist item displaying event received: "

    .line 12
    .line 13
    instance-of v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    move-object v6, v2

    .line 18
    check-cast v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;

    .line 19
    .line 20
    iget v7, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->e:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v7, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v8

    .line 29
    iput v7, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->e:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;

    .line 33
    .line 34
    invoke-direct {v6, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;-><init>(LHf/z;Ljf/c;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v2, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->c:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 40
    .line 41
    iget v8, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->e:I

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    if-ne v8, v9, :cond_1

    .line 48
    .line 49
    iget-object v0, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;

    .line 50
    .line 51
    iget-object v5, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->a:LHf/z;

    .line 52
    .line 53
    :try_start_0
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object v5, v0

    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 73
    .line 74
    const-string v12, "TemplateWebView"

    .line 75
    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    const/4 v14, 0x0

    .line 89
    const/4 v15, 0x0

    .line 90
    const/16 v16, 0xc

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object v2, LEf/S;->a:LLf/e;

    .line 98
    .line 99
    sget-object v2, LJf/n;->a:LFf/e;

    .line 100
    .line 101
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/f;

    .line 102
    .line 103
    iget-object v8, v1, LHf/z;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 106
    .line 107
    invoke-direct {v5, v8, v0, v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/f;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;Ljf/c;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->a:LHf/z;

    .line 111
    .line 112
    iput-object v0, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;

    .line 113
    .line 114
    iput v9, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/g;->e:I

    .line 115
    .line 116
    invoke-static {v2, v5, v6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-ne v2, v7, :cond_3

    .line 121
    .line 122
    return-object v7

    .line 123
    :cond_3
    move-object v5, v1

    .line 124
    :goto_1
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 125
    .line 126
    const-string v12, "TemplateWebView"

    .line 127
    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v4, v5, LHf/z;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    .line 137
    iget-object v6, v5, LHf/z;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v6, Lcom/bumptech/glide/f;

    .line 140
    .line 141
    :try_start_2
    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Landroid/webkit/WebSettings;->getMediaPlaybackRequiresUserGesture()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    const/16 v16, 0xc

    .line 159
    .line 160
    const/16 v17, 0x0

    .line 161
    .line 162
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 166
    .line 167
    iget-object v4, v5, LHf/z;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 170
    .line 171
    if-ne v0, v2, :cond_7

    .line 172
    .line 173
    :try_start_3
    const-string v12, "TemplateWebView"

    .line 174
    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, v6, Lcom/bumptech/glide/f;->j:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v2, LHf/x0;

    .line 183
    .line 184
    invoke-virtual {v2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const/16 v16, 0xc

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;->e:LHf/x0;

    .line 205
    .line 206
    iget-object v2, v6, Lcom/bumptech/glide/f;->j:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, LHf/x0;

    .line 209
    .line 210
    invoke-virtual {v2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;

    .line 215
    .line 216
    const-string v3, "<this>"

    .line 217
    .line 218
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;

    .line 222
    .line 223
    iget-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/D;

    .line 224
    .line 225
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/E;->a:[I

    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    aget v4, v5, v4

    .line 232
    .line 233
    if-eq v4, v9, :cond_6

    .line 234
    .line 235
    const/4 v5, 0x2

    .line 236
    if-eq v4, v5, :cond_5

    .line 237
    .line 238
    const/4 v5, 0x3

    .line 239
    if-ne v4, v5, :cond_4

    .line 240
    .line 241
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_4
    new-instance v0, LE5/Q;

    .line 245
    .line 246
    const/16 v2, 0x9

    .line 247
    .line 248
    const/4 v3, 0x0

    .line 249
    invoke-direct {v0, v3, v2}, LE5/Q;-><init>(BI)V

    .line 250
    .line 251
    .line 252
    throw v0

    .line 253
    :cond_5
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;

    .line 257
    .line 258
    :goto_2
    iget-boolean v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;->b:Z

    .line 259
    .line 260
    invoke-direct {v3, v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;Z)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v10, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Lcom/bumptech/glide/f;->g()V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_7
    const-string v12, "TemplateWebView"

    .line 274
    .line 275
    const-string v13, "Playlist item displaying event is not MRAID, setting orientation to none"

    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    const/4 v15, 0x0

    .line 279
    const/16 v16, 0xc

    .line 280
    .line 281
    const/16 v17, 0x0

    .line 282
    .line 283
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;->e:LHf/x0;

    .line 287
    .line 288
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;

    .line 289
    .line 290
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/a;

    .line 291
    .line 292
    invoke-direct {v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/b;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v10, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 299
    .line 300
    .line 301
    goto :goto_4

    .line 302
    :goto_3
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 303
    .line 304
    const-string v4, "Failed to access WebView settings"

    .line 305
    .line 306
    const/4 v6, 0x0

    .line 307
    const-string v3, "TemplateWebView"

    .line 308
    .line 309
    const/16 v7, 0x8

    .line 310
    .line 311
    const/4 v8, 0x0

    .line 312
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 316
    .line 317
    return-object v0
.end method

.method public d(ILjf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, LHf/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/q0;

    .line 7
    .line 8
    iget v1, v0, LHf/q0;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LHf/q0;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/q0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LHf/q0;-><init>(LHf/z;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/q0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/q0;->c:I

    .line 30
    .line 31
    sget-object v3, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    if-lez p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p0, LHf/z;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lkotlin/jvm/internal/C;

    .line 58
    .line 59
    iget-boolean p2, p1, Lkotlin/jvm/internal/C;->a:Z

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    iput-boolean v4, p1, Lkotlin/jvm/internal/C;->a:Z

    .line 64
    .line 65
    sget-object p1, LHf/m0;->a:LHf/m0;

    .line 66
    .line 67
    iput v4, v0, LHf/q0;->c:I

    .line 68
    .line 69
    iget-object p2, p0, LHf/z;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, LHf/m;

    .line 72
    .line 73
    invoke-interface {p2, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    return-object v3
.end method

.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LHf/z;->c:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/high16 v5, -0x80000000

    .line 9
    .line 10
    sget-object v6, Lef/C;->a:Lef/C;

    .line 11
    .line 12
    iget-object v7, p0, LHf/z;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget v8, p0, LHf/z;->a:I

    .line 15
    .line 16
    packed-switch v8, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    instance-of v0, p2, Lea/A;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move-object v0, p2

    .line 24
    check-cast v0, Lea/A;

    .line 25
    .line 26
    iget v1, v0, Lea/A;->b:I

    .line 27
    .line 28
    and-int v8, v1, v5

    .line 29
    .line 30
    if-eqz v8, :cond_0

    .line 31
    .line 32
    sub-int/2addr v1, v5

    .line 33
    iput v1, v0, Lea/A;->b:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, Lea/A;

    .line 37
    .line 38
    invoke-direct {v0, p0, p2}, Lea/A;-><init>(LHf/z;Ljf/c;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object p2, v0, Lea/A;->a:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 44
    .line 45
    iget v5, v0, Lea/A;->b:I

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    if-ne v5, v4, :cond_1

    .line 50
    .line 51
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    check-cast p1, Lx1/b;

    .line 65
    .line 66
    sget-object p2, Lea/D;->e:Lea/y;

    .line 67
    .line 68
    check-cast v2, Lea/D;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p2, Lea/o;

    .line 74
    .line 75
    sget-object v2, Lea/z;->a:Lx1/e;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Lx1/b;->b(Lx1/e;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {p2, p1}, Lea/o;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput v4, v0, Lea/A;->b:I

    .line 87
    .line 88
    check-cast v7, LHf/m;

    .line 89
    .line 90
    invoke-interface {v7, p2, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v1, :cond_3

    .line 95
    .line 96
    move-object v6, v1

    .line 97
    :cond_3
    :goto_1
    return-object v6

    .line 98
    :pswitch_0
    instance-of v8, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;

    .line 99
    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    move-object v8, p2

    .line 103
    check-cast v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;

    .line 104
    .line 105
    iget v9, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;->b:I

    .line 106
    .line 107
    and-int v10, v9, v5

    .line 108
    .line 109
    if-eqz v10, :cond_4

    .line 110
    .line 111
    sub-int/2addr v9, v5

    .line 112
    iput v9, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;->b:I

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;

    .line 116
    .line 117
    invoke-direct {v8, p0, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;-><init>(LHf/z;Ljf/c;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    iget-object p2, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;->a:Ljava/lang/Object;

    .line 121
    .line 122
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 123
    .line 124
    iget v9, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;->b:I

    .line 125
    .line 126
    if-eqz v9, :cond_6

    .line 127
    .line 128
    if-ne v9, v4, :cond_5

    .line 129
    .line 130
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_6
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/D;

    .line 144
    .line 145
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 146
    .line 147
    iget-object p2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->a:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-static {p2}, Lff/o;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    instance-of v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 158
    .line 159
    if-eqz v2, :cond_7

    .line 160
    .line 161
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;

    .line 162
    .line 163
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;

    .line 164
    .line 165
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/z;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 166
    .line 167
    invoke-direct {v1, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/t;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    instance-of v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 172
    .line 173
    if-eqz v2, :cond_8

    .line 174
    .line 175
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;

    .line 176
    .line 177
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;

    .line 178
    .line 179
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 180
    .line 181
    invoke-direct {v1, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/v;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;Z)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    instance-of v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/A;

    .line 186
    .line 187
    if-eqz v2, :cond_9

    .line 188
    .line 189
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;

    .line 190
    .line 191
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/A;

    .line 192
    .line 193
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/A;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;

    .line 194
    .line 195
    invoke-direct {v1, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/u;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/dec/c;Z)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    instance-of v2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/C;

    .line 200
    .line 201
    if-eqz v2, :cond_a

    .line 202
    .line 203
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;

    .line 204
    .line 205
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/C;

    .line 206
    .line 207
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/C;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 208
    .line 209
    invoke-direct {v1, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/w;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;Z)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_a
    if-nez p1, :cond_c

    .line 214
    .line 215
    :goto_3
    iput v4, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/o;->b:I

    .line 216
    .line 217
    check-cast v7, LHf/m;

    .line 218
    .line 219
    invoke-interface {v7, v1, v8}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    if-ne p1, v5, :cond_b

    .line 224
    .line 225
    move-object v6, v5

    .line 226
    :cond_b
    :goto_4
    return-object v6

    .line 227
    :cond_c
    new-instance p1, LE5/Q;

    .line 228
    .line 229
    const/16 p2, 0x9

    .line 230
    .line 231
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 232
    .line 233
    .line 234
    throw p1

    .line 235
    :pswitch_1
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/f;

    .line 236
    .line 237
    check-cast v2, Lkotlin/jvm/internal/G;

    .line 238
    .line 239
    iget-object p2, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 240
    .line 241
    instance-of p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/d;

    .line 242
    .line 243
    if-eqz p2, :cond_d

    .line 244
    .line 245
    instance-of p2, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/c;

    .line 246
    .line 247
    if-eqz p2, :cond_d

    .line 248
    .line 249
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 250
    .line 251
    check-cast v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 252
    .line 253
    invoke-virtual {v7, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/d;)LEf/H0;

    .line 254
    .line 255
    .line 256
    :cond_d
    iput-object p1, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 257
    .line 258
    return-object v6

    .line 259
    :pswitch_2
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;

    .line 260
    .line 261
    invoke-virtual {p0, p1, p2}, LHf/z;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/j;Ljf/c;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    return-object p1

    .line 266
    :pswitch_3
    check-cast p1, LD/h;

    .line 267
    .line 268
    instance-of p2, p1, LD/k;

    .line 269
    .line 270
    check-cast v7, LA7/B0;

    .line 271
    .line 272
    check-cast v2, LEf/E;

    .line 273
    .line 274
    if-eqz p2, :cond_e

    .line 275
    .line 276
    check-cast p1, LD/k;

    .line 277
    .line 278
    invoke-virtual {v7, p1, v2}, LA7/B0;->y(LD/k;LEf/E;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_a

    .line 282
    .line 283
    :cond_e
    instance-of p2, p1, LD/l;

    .line 284
    .line 285
    if-eqz p2, :cond_f

    .line 286
    .line 287
    check-cast p1, LD/l;

    .line 288
    .line 289
    iget-object p1, p1, LD/l;->a:LD/k;

    .line 290
    .line 291
    invoke-virtual {v7, p1}, LA7/B0;->N(LD/k;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_a

    .line 295
    .line 296
    :cond_f
    instance-of p2, p1, LD/j;

    .line 297
    .line 298
    if-eqz p2, :cond_10

    .line 299
    .line 300
    check-cast p1, LD/j;

    .line 301
    .line 302
    iget-object p1, p1, LD/j;->a:LD/k;

    .line 303
    .line 304
    invoke-virtual {v7, p1}, LA7/B0;->N(LD/k;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_a

    .line 308
    .line 309
    :cond_10
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    const-string p2, "interaction"

    .line 313
    .line 314
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const-string p2, "scope"

    .line 318
    .line 319
    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    iget-object p2, v7, LA7/B0;->a:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast p2, LM/y;

    .line 325
    .line 326
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    instance-of v3, p1, LD/e;

    .line 330
    .line 331
    iget-object v4, p2, LM/y;->d:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v4, Ljava/util/ArrayList;

    .line 334
    .line 335
    if-eqz v3, :cond_11

    .line 336
    .line 337
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_11
    instance-of v5, p1, LD/f;

    .line 342
    .line 343
    if-eqz v5, :cond_12

    .line 344
    .line 345
    move-object v5, p1

    .line 346
    check-cast v5, LD/f;

    .line 347
    .line 348
    iget-object v5, v5, LD/f;->a:LD/e;

    .line 349
    .line 350
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_12
    instance-of v5, p1, LD/a;

    .line 355
    .line 356
    if-eqz v5, :cond_13

    .line 357
    .line 358
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_13
    instance-of v5, p1, LD/b;

    .line 363
    .line 364
    if-eqz v5, :cond_1a

    .line 365
    .line 366
    move-object v5, p1

    .line 367
    check-cast v5, LD/b;

    .line 368
    .line 369
    iget-object v5, v5, LD/b;->a:LD/a;

    .line 370
    .line 371
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    :goto_5
    invoke-static {v4}, Lff/o;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    check-cast v4, LD/h;

    .line 379
    .line 380
    iget-object v5, p2, LM/y;->e:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v5, LD/h;

    .line 383
    .line 384
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-nez v5, :cond_1a

    .line 389
    .line 390
    const/4 v5, 0x3

    .line 391
    if-eqz v4, :cond_18

    .line 392
    .line 393
    iget-object v7, p2, LM/y;->b:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v7, LN/V;

    .line 396
    .line 397
    if-eqz v3, :cond_14

    .line 398
    .line 399
    invoke-interface {v7}, LN/K0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    check-cast p1, LM/g;

    .line 404
    .line 405
    iget p1, p1, LM/g;->c:F

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_14
    instance-of p1, p1, LD/a;

    .line 409
    .line 410
    if-eqz p1, :cond_15

    .line 411
    .line 412
    invoke-interface {v7}, LN/K0;->getValue()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    check-cast p1, LM/g;

    .line 417
    .line 418
    iget p1, p1, LM/g;->b:F

    .line 419
    .line 420
    goto :goto_6

    .line 421
    :cond_15
    const/4 p1, 0x0

    .line 422
    :goto_6
    sget-object v3, LM/s;->a:LA/Z;

    .line 423
    .line 424
    instance-of v3, v4, LD/e;

    .line 425
    .line 426
    sget-object v7, LM/s;->a:LA/Z;

    .line 427
    .line 428
    if-eqz v3, :cond_16

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_16
    instance-of v3, v4, LD/a;

    .line 432
    .line 433
    if-eqz v3, :cond_17

    .line 434
    .line 435
    new-instance v7, LA/Z;

    .line 436
    .line 437
    sget-object v3, LA/s;->a:LA/s;

    .line 438
    .line 439
    const/16 v8, 0x2d

    .line 440
    .line 441
    invoke-direct {v7, v8, v3, v0}, LA/Z;-><init>(ILA/r;I)V

    .line 442
    .line 443
    .line 444
    :cond_17
    :goto_7
    new-instance v0, LM/w;

    .line 445
    .line 446
    invoke-direct {v0, p2, p1, v7, v1}, LM/w;-><init>(LM/y;FLA/Z;Ljf/c;)V

    .line 447
    .line 448
    .line 449
    invoke-static {v2, v1, v0, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 450
    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_18
    iget-object p1, p2, LM/y;->e:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast p1, LD/h;

    .line 456
    .line 457
    sget-object v0, LM/s;->a:LA/Z;

    .line 458
    .line 459
    instance-of v0, p1, LD/e;

    .line 460
    .line 461
    sget-object v3, LM/s;->a:LA/Z;

    .line 462
    .line 463
    if-eqz v0, :cond_19

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_19
    instance-of p1, p1, LD/a;

    .line 467
    .line 468
    :goto_8
    new-instance p1, LM/x;

    .line 469
    .line 470
    invoke-direct {p1, p2, v3, v1}, LM/x;-><init>(LM/y;LA/Z;Ljf/c;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v2, v1, p1, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 474
    .line 475
    .line 476
    :goto_9
    iput-object v4, p2, LM/y;->e:Ljava/lang/Object;

    .line 477
    .line 478
    :cond_1a
    :goto_a
    return-object v6

    .line 479
    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    .line 480
    .line 481
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 482
    .line 483
    .line 484
    move-result p1

    .line 485
    invoke-virtual {p0, p1, p2}, LHf/z;->d(ILjf/c;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    return-object p1

    .line 490
    :pswitch_5
    instance-of v0, p2, LHf/Y;

    .line 491
    .line 492
    if-eqz v0, :cond_1b

    .line 493
    .line 494
    move-object v0, p2

    .line 495
    check-cast v0, LHf/Y;

    .line 496
    .line 497
    iget v8, v0, LHf/Y;->b:I

    .line 498
    .line 499
    and-int v9, v8, v5

    .line 500
    .line 501
    if-eqz v9, :cond_1b

    .line 502
    .line 503
    sub-int/2addr v8, v5

    .line 504
    iput v8, v0, LHf/Y;->b:I

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_1b
    new-instance v0, LHf/Y;

    .line 508
    .line 509
    invoke-direct {v0, p0, p2}, LHf/Y;-><init>(LHf/z;Ljf/c;)V

    .line 510
    .line 511
    .line 512
    :goto_b
    iget-object p2, v0, LHf/Y;->a:Ljava/lang/Object;

    .line 513
    .line 514
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 515
    .line 516
    iget v8, v0, LHf/Y;->b:I

    .line 517
    .line 518
    const/4 v9, 0x2

    .line 519
    if-eqz v8, :cond_1e

    .line 520
    .line 521
    if-eq v8, v4, :cond_1d

    .line 522
    .line 523
    if-ne v8, v9, :cond_1c

    .line 524
    .line 525
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    goto :goto_e

    .line 529
    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 530
    .line 531
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw p1

    .line 535
    :cond_1d
    iget-object p1, v0, LHf/Y;->e:LHf/m;

    .line 536
    .line 537
    iget-object v2, v0, LHf/Y;->d:Ljava/lang/Object;

    .line 538
    .line 539
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    goto :goto_c

    .line 543
    :cond_1e
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iput-object p1, v0, LHf/Y;->d:Ljava/lang/Object;

    .line 547
    .line 548
    move-object p2, v7

    .line 549
    check-cast p2, LHf/m;

    .line 550
    .line 551
    iput-object p2, v0, LHf/Y;->e:LHf/m;

    .line 552
    .line 553
    iput v4, v0, LHf/Y;->b:I

    .line 554
    .line 555
    invoke-interface {v2, p1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    if-ne v2, v5, :cond_1f

    .line 560
    .line 561
    goto :goto_d

    .line 562
    :cond_1f
    move-object v2, p1

    .line 563
    move-object p1, p2

    .line 564
    :goto_c
    iput-object v1, v0, LHf/Y;->d:Ljava/lang/Object;

    .line 565
    .line 566
    iput-object v1, v0, LHf/Y;->e:LHf/m;

    .line 567
    .line 568
    iput v9, v0, LHf/Y;->b:I

    .line 569
    .line 570
    invoke-interface {p1, v2, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    if-ne p1, v5, :cond_20

    .line 575
    .line 576
    :goto_d
    move-object v6, v5

    .line 577
    :cond_20
    :goto_e
    return-object v6

    .line 578
    :pswitch_6
    instance-of v0, p2, LHf/P;

    .line 579
    .line 580
    if-eqz v0, :cond_21

    .line 581
    .line 582
    move-object v0, p2

    .line 583
    check-cast v0, LHf/P;

    .line 584
    .line 585
    iget v1, v0, LHf/P;->c:I

    .line 586
    .line 587
    and-int v2, v1, v5

    .line 588
    .line 589
    if-eqz v2, :cond_21

    .line 590
    .line 591
    sub-int/2addr v1, v5

    .line 592
    iput v1, v0, LHf/P;->c:I

    .line 593
    .line 594
    goto :goto_f

    .line 595
    :cond_21
    new-instance v0, LHf/P;

    .line 596
    .line 597
    invoke-direct {v0, p0, p2}, LHf/P;-><init>(LHf/z;Ljf/c;)V

    .line 598
    .line 599
    .line 600
    :goto_f
    iget-object p2, v0, LHf/P;->b:Ljava/lang/Object;

    .line 601
    .line 602
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 603
    .line 604
    iget v2, v0, LHf/P;->c:I

    .line 605
    .line 606
    if-eqz v2, :cond_23

    .line 607
    .line 608
    if-ne v2, v4, :cond_22

    .line 609
    .line 610
    iget-object p1, v0, LHf/P;->e:Ljava/lang/Object;

    .line 611
    .line 612
    iget-object v0, v0, LHf/P;->a:LHf/z;

    .line 613
    .line 614
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    goto :goto_10

    .line 618
    :cond_22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 619
    .line 620
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    throw p1

    .line 624
    :cond_23
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    iput-object p0, v0, LHf/P;->a:LHf/z;

    .line 628
    .line 629
    iput-object p1, v0, LHf/P;->e:Ljava/lang/Object;

    .line 630
    .line 631
    iput v4, v0, LHf/P;->c:I

    .line 632
    .line 633
    check-cast v7, Llf/j;

    .line 634
    .line 635
    invoke-interface {v7, p1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p2

    .line 639
    if-ne p2, v1, :cond_24

    .line 640
    .line 641
    move-object v6, v1

    .line 642
    goto :goto_11

    .line 643
    :cond_24
    move-object v0, p0

    .line 644
    :goto_10
    check-cast p2, Ljava/lang/Boolean;

    .line 645
    .line 646
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 647
    .line 648
    .line 649
    move-result p2

    .line 650
    if-nez p2, :cond_25

    .line 651
    .line 652
    :goto_11
    return-object v6

    .line 653
    :cond_25
    iget-object p2, v0, LHf/z;->c:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast p2, Lkotlin/jvm/internal/G;

    .line 656
    .line 657
    iput-object p1, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 658
    .line 659
    new-instance p1, LIf/a;

    .line 660
    .line 661
    invoke-direct {p1, v0}, LIf/a;-><init>(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    throw p1

    .line 665
    :pswitch_7
    instance-of v0, p2, LHf/M;

    .line 666
    .line 667
    if-eqz v0, :cond_26

    .line 668
    .line 669
    move-object v0, p2

    .line 670
    check-cast v0, LHf/M;

    .line 671
    .line 672
    iget v1, v0, LHf/M;->c:I

    .line 673
    .line 674
    and-int v2, v1, v5

    .line 675
    .line 676
    if-eqz v2, :cond_26

    .line 677
    .line 678
    sub-int/2addr v1, v5

    .line 679
    iput v1, v0, LHf/M;->c:I

    .line 680
    .line 681
    goto :goto_12

    .line 682
    :cond_26
    new-instance v0, LHf/M;

    .line 683
    .line 684
    invoke-direct {v0, p0, p2}, LHf/M;-><init>(LHf/z;Ljf/c;)V

    .line 685
    .line 686
    .line 687
    :goto_12
    iget-object p2, v0, LHf/M;->b:Ljava/lang/Object;

    .line 688
    .line 689
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 690
    .line 691
    iget v2, v0, LHf/M;->c:I

    .line 692
    .line 693
    if-eqz v2, :cond_28

    .line 694
    .line 695
    if-ne v2, v4, :cond_27

    .line 696
    .line 697
    iget-object p1, v0, LHf/M;->e:Ljava/lang/Object;

    .line 698
    .line 699
    iget-object v0, v0, LHf/M;->a:LHf/z;

    .line 700
    .line 701
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    goto :goto_13

    .line 705
    :cond_27
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 706
    .line 707
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    throw p1

    .line 711
    :cond_28
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    iput-object p0, v0, LHf/M;->a:LHf/z;

    .line 715
    .line 716
    iput-object p1, v0, LHf/M;->e:Ljava/lang/Object;

    .line 717
    .line 718
    iput v4, v0, LHf/M;->c:I

    .line 719
    .line 720
    invoke-interface {v7, p1, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object p2

    .line 724
    if-ne p2, v1, :cond_29

    .line 725
    .line 726
    move-object v6, v1

    .line 727
    goto :goto_14

    .line 728
    :cond_29
    move-object v0, p0

    .line 729
    :goto_13
    check-cast p2, Ljava/lang/Boolean;

    .line 730
    .line 731
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 732
    .line 733
    .line 734
    move-result p2

    .line 735
    if-nez p2, :cond_2a

    .line 736
    .line 737
    :goto_14
    return-object v6

    .line 738
    :cond_2a
    iget-object p2, v0, LHf/z;->c:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast p2, Lkotlin/jvm/internal/G;

    .line 741
    .line 742
    iput-object p1, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 743
    .line 744
    new-instance p1, LIf/a;

    .line 745
    .line 746
    invoke-direct {p1, v0}, LIf/a;-><init>(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    throw p1

    .line 750
    :pswitch_8
    instance-of v0, p2, LHf/B;

    .line 751
    .line 752
    if-eqz v0, :cond_2b

    .line 753
    .line 754
    move-object v0, p2

    .line 755
    check-cast v0, LHf/B;

    .line 756
    .line 757
    iget v1, v0, LHf/B;->c:I

    .line 758
    .line 759
    and-int v8, v1, v5

    .line 760
    .line 761
    if-eqz v8, :cond_2b

    .line 762
    .line 763
    sub-int/2addr v1, v5

    .line 764
    iput v1, v0, LHf/B;->c:I

    .line 765
    .line 766
    goto :goto_15

    .line 767
    :cond_2b
    new-instance v0, LHf/B;

    .line 768
    .line 769
    invoke-direct {v0, p0, p2}, LHf/B;-><init>(LHf/z;Ljf/c;)V

    .line 770
    .line 771
    .line 772
    :goto_15
    iget-object p2, v0, LHf/B;->a:Ljava/lang/Object;

    .line 773
    .line 774
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 775
    .line 776
    iget v5, v0, LHf/B;->c:I

    .line 777
    .line 778
    if-eqz v5, :cond_2d

    .line 779
    .line 780
    if-ne v5, v4, :cond_2c

    .line 781
    .line 782
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    goto :goto_16

    .line 786
    :cond_2c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 787
    .line 788
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    throw p1

    .line 792
    :cond_2d
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    check-cast v2, Lkotlin/jvm/internal/E;

    .line 796
    .line 797
    iget p2, v2, Lkotlin/jvm/internal/E;->a:I

    .line 798
    .line 799
    if-lt p2, v4, :cond_2e

    .line 800
    .line 801
    iput v4, v0, LHf/B;->c:I

    .line 802
    .line 803
    check-cast v7, LHf/m;

    .line 804
    .line 805
    invoke-interface {v7, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object p1

    .line 809
    if-ne p1, v1, :cond_2f

    .line 810
    .line 811
    move-object v6, v1

    .line 812
    goto :goto_16

    .line 813
    :cond_2e
    add-int/2addr p2, v4

    .line 814
    iput p2, v2, Lkotlin/jvm/internal/E;->a:I

    .line 815
    .line 816
    :cond_2f
    :goto_16
    return-object v6

    .line 817
    :pswitch_9
    instance-of v0, p2, LHf/y;

    .line 818
    .line 819
    if-eqz v0, :cond_30

    .line 820
    .line 821
    move-object v0, p2

    .line 822
    check-cast v0, LHf/y;

    .line 823
    .line 824
    iget v1, v0, LHf/y;->d:I

    .line 825
    .line 826
    and-int v2, v1, v5

    .line 827
    .line 828
    if-eqz v2, :cond_30

    .line 829
    .line 830
    sub-int/2addr v1, v5

    .line 831
    iput v1, v0, LHf/y;->d:I

    .line 832
    .line 833
    goto :goto_17

    .line 834
    :cond_30
    new-instance v0, LHf/y;

    .line 835
    .line 836
    invoke-direct {v0, p0, p2}, LHf/y;-><init>(LHf/z;Ljf/c;)V

    .line 837
    .line 838
    .line 839
    :goto_17
    iget-object p2, v0, LHf/y;->b:Ljava/lang/Object;

    .line 840
    .line 841
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 842
    .line 843
    iget v2, v0, LHf/y;->d:I

    .line 844
    .line 845
    if-eqz v2, :cond_32

    .line 846
    .line 847
    if-ne v2, v4, :cond_31

    .line 848
    .line 849
    iget-object p1, v0, LHf/y;->a:LHf/z;

    .line 850
    .line 851
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 852
    .line 853
    .line 854
    goto :goto_18

    .line 855
    :catchall_0
    move-exception p2

    .line 856
    goto :goto_19

    .line 857
    :cond_31
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 858
    .line 859
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    throw p1

    .line 863
    :cond_32
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    :try_start_1
    check-cast v7, LHf/m;

    .line 867
    .line 868
    iput-object p0, v0, LHf/y;->a:LHf/z;

    .line 869
    .line 870
    iput v4, v0, LHf/y;->d:I

    .line 871
    .line 872
    invoke-interface {v7, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 876
    if-ne p1, v1, :cond_33

    .line 877
    .line 878
    move-object v6, v1

    .line 879
    :cond_33
    :goto_18
    return-object v6

    .line 880
    :catchall_1
    move-exception p2

    .line 881
    move-object p1, p0

    .line 882
    :goto_19
    iget-object p1, p1, LHf/z;->c:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast p1, Lkotlin/jvm/internal/G;

    .line 885
    .line 886
    iput-object p2, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 887
    .line 888
    throw p2

    .line 889
    :pswitch_data_0
    .packed-switch 0x0
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
