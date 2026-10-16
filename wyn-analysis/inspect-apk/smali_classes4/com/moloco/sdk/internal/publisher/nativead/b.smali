.class public final Lcom/moloco/sdk/internal/publisher/nativead/b;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lcom/moloco/sdk/internal/publisher/C;

.field public b:I

.field public final synthetic c:Lcom/moloco/sdk/internal/publisher/nativead/c;

.field public final synthetic d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/nativead/c;Lcom/moloco/sdk/publisher/AdLoad$Listener;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->c:Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->e:Ljava/lang/String;

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
    .locals 3

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/publisher/nativead/b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/b;->c:Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/b;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/c;Lcom/moloco/sdk/publisher/AdLoad$Listener;Ljava/lang/String;Ljf/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/b;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/nativead/b;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->b:I

    .line 6
    .line 7
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->c:Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 8
    .line 9
    const/4 v12, 0x0

    .line 10
    iget-object v10, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->k:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 11
    .line 12
    iget-object v11, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->i:Lcom/moloco/sdk/acm/recorder/c;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    check-cast v2, Lef/n;

    .line 27
    .line 28
    iget-object v2, v2, Lef/n;->a:Ljava/lang/Object;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "acmLoadTimerEvent"

    .line 43
    .line 44
    iget-object v9, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->m:Lcom/moloco/sdk/acm/l;

    .line 45
    .line 46
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v2, "adFormatType"

    .line 50
    .line 51
    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, Lcom/moloco/sdk/internal/publisher/C;

    .line 55
    .line 56
    sget-object v2, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 57
    .line 58
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    move-object v8, v2

    .line 63
    check-cast v8, Lcom/moloco/sdk/internal/B;

    .line 64
    .line 65
    iget-object v7, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->d:Lcom/moloco/sdk/publisher/AdLoad$Listener;

    .line 66
    .line 67
    invoke-direct/range {v6 .. v12}, Lcom/moloco/sdk/internal/publisher/C;-><init>(Lcom/moloco/sdk/publisher/AdLoad$Listener;Lcom/moloco/sdk/internal/B;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/acm/recorder/c;Ltf/a;)V

    .line 68
    .line 69
    .line 70
    iget-object v2, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->b:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 71
    .line 72
    iput-object v6, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->a:Lcom/moloco/sdk/internal/publisher/C;

    .line 73
    .line 74
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->b:I

    .line 75
    .line 76
    iget-object v4, v0, Lcom/moloco/sdk/internal/publisher/nativead/b;->e:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v2, v4, v9, v6, v0}, Lcom/moloco/sdk/internal/publisher/nativead/o;->g(Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-ne v2, v1, :cond_2

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    move-object v1, v6

    .line 86
    :goto_0
    invoke-static {v2}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object v16

    .line 90
    sget-object v23, Lef/C;->a:Lef/C;

    .line 91
    .line 92
    if-nez v16, :cond_8

    .line 93
    .line 94
    check-cast v2, Lcom/moloco/sdk/internal/publisher/nativead/d;

    .line 95
    .line 96
    iget-object v4, v2, Lcom/moloco/sdk/internal/publisher/nativead/d;->c:Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 97
    .line 98
    const/4 v6, 0x2

    .line 99
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iget-object v4, v4, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->d:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    check-cast v4, Lcom/moloco/sdk/internal/publisher/nativead/model/l;

    .line 110
    .line 111
    if-eqz v4, :cond_3

    .line 112
    .line 113
    iget-object v4, v4, Lcom/moloco/sdk/internal/publisher/nativead/model/l;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    const/4 v4, 0x0

    .line 117
    :goto_1
    const/4 v6, 0x0

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    move v4, v3

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move v4, v6

    .line 123
    :goto_2
    iget-object v7, v2, Lcom/moloco/sdk/internal/publisher/nativead/d;->c:Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 124
    .line 125
    invoke-virtual {v7, v3}, Lcom/moloco/sdk/internal/publisher/nativead/model/n;->b(I)Landroid/net/Uri;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move v3, v6

    .line 133
    :goto_3
    iget-object v6, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->a:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v8, v2, Lcom/moloco/sdk/internal/publisher/nativead/d;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 136
    .line 137
    if-eqz v4, :cond_7

    .line 138
    .line 139
    :try_start_0
    sget v3, Lu0/L;->j:I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :catch_0
    sget-object v13, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 143
    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const-string v14, "NativeAdImpl"

    .line 149
    .line 150
    const-string v15, "Compose dependency not available for native video ad"

    .line 151
    .line 152
    const/16 v18, 0xc

    .line 153
    .line 154
    const/16 v19, 0x0

    .line 155
    .line 156
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 160
    .line 161
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 162
    .line 163
    const-string v9, "native_ad_compose_not_available"

    .line 164
    .line 165
    invoke-direct {v4, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 175
    .line 176
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    const-string v10, "toLowerCase(...)"

    .line 181
    .line 182
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v10, "ad_type"

    .line 186
    .line 187
    invoke-virtual {v4, v10, v9}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v11, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 191
    .line 192
    .line 193
    if-nez v3, :cond_6

    .line 194
    .line 195
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 196
    .line 197
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 198
    .line 199
    sget-object v4, Lff/w;->a:Lff/w;

    .line 200
    .line 201
    invoke-static {v6, v2, v3, v4}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    iget-object v3, v8, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 206
    .line 207
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 208
    .line 209
    invoke-virtual {v1, v2, v3}, Lcom/moloco/sdk/internal/publisher/C;->a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 210
    .line 211
    .line 212
    return-object v23

    .line 213
    :cond_6
    const/16 v16, 0x0

    .line 214
    .line 215
    const/16 v17, 0x0

    .line 216
    .line 217
    const-string v14, "NativeAdImpl"

    .line 218
    .line 219
    const-string v15, "Compose not available, native video ad will fall back to image view"

    .line 220
    .line 221
    const/16 v18, 0xc

    .line 222
    .line 223
    const/16 v19, 0x0

    .line 224
    .line 225
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_7
    :goto_4
    new-instance v13, LC6/l;

    .line 229
    .line 230
    iget-object v3, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->d:Lcom/moloco/sdk/internal/services/u;

    .line 231
    .line 232
    iget-object v4, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->e:Lcom/moloco/sdk/internal/services/events/c;

    .line 233
    .line 234
    iget-object v9, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 235
    .line 236
    iget-object v10, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 237
    .line 238
    iget-object v14, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->a:Ljava/lang/String;

    .line 239
    .line 240
    iget-object v15, v2, Lcom/moloco/sdk/internal/publisher/nativead/d;->a:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 241
    .line 242
    iget-object v2, v2, Lcom/moloco/sdk/internal/publisher/nativead/d;->b:Lcom/moloco/sdk/internal/publisher/nativead/model/h;

    .line 243
    .line 244
    iget-object v12, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->k:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 245
    .line 246
    move-object/from16 v16, v2

    .line 247
    .line 248
    move-object/from16 v17, v3

    .line 249
    .line 250
    move-object/from16 v18, v4

    .line 251
    .line 252
    move-object/from16 v20, v9

    .line 253
    .line 254
    move-object/from16 v21, v10

    .line 255
    .line 256
    move-object/from16 v22, v11

    .line 257
    .line 258
    move-object/from16 v19, v12

    .line 259
    .line 260
    invoke-direct/range {v13 .. v22}, LC6/l;-><init>(Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/u;Lcom/moloco/sdk/internal/publisher/nativead/model/h;Lcom/moloco/sdk/internal/services/u;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/publisher/AdFormatType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 261
    .line 262
    .line 263
    iput-object v13, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->n:LC6/l;

    .line 264
    .line 265
    iget-object v2, v5, Lcom/moloco/sdk/internal/publisher/nativead/c;->c:Lcom/moloco/sdk/internal/publisher/nativead/a;

    .line 266
    .line 267
    iput-object v7, v2, Lcom/moloco/sdk/internal/publisher/nativead/a;->h:Lcom/moloco/sdk/internal/publisher/nativead/model/n;

    .line 268
    .line 269
    new-instance v3, LS8/d;

    .line 270
    .line 271
    move-object v4, v6

    .line 272
    const-class v6, Lcom/moloco/sdk/internal/publisher/nativead/c;

    .line 273
    .line 274
    const-string v7, "handleGeneralAdClick"

    .line 275
    .line 276
    move-object v9, v4

    .line 277
    const/4 v4, 0x0

    .line 278
    move-object v10, v8

    .line 279
    const-string v8, "handleGeneralAdClick()V"

    .line 280
    .line 281
    move-object v11, v9

    .line 282
    const/4 v9, 0x0

    .line 283
    move-object v12, v10

    .line 284
    const/4 v10, 0x5

    .line 285
    invoke-direct/range {v3 .. v10}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 286
    .line 287
    .line 288
    iput-object v3, v2, Lcom/moloco/sdk/internal/publisher/nativead/a;->g:LS8/d;

    .line 289
    .line 290
    iget v2, v12, Lcom/moloco/sdk/internal/ortb/model/u;->b:F

    .line 291
    .line 292
    new-instance v3, Ljava/lang/Float;

    .line 293
    .line 294
    invoke-direct {v3, v2}, Ljava/lang/Float;-><init>(F)V

    .line 295
    .line 296
    .line 297
    const/4 v2, 0x4

    .line 298
    const/4 v4, 0x0

    .line 299
    invoke-static {v11, v3, v4, v2, v4}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-object v3, v12, Lcom/moloco/sdk/internal/ortb/model/u;->d:Lcom/moloco/sdk/internal/ortb/model/w;

    .line 304
    .line 305
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/w;->d:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 306
    .line 307
    invoke-virtual {v1, v2, v3}, Lcom/moloco/sdk/internal/publisher/C;->c(Lcom/moloco/sdk/publisher/MolocoAd;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 308
    .line 309
    .line 310
    return-object v23

    .line 311
    :cond_8
    sget-object v13, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 312
    .line 313
    const-string v15, "Failed to load native ad."

    .line 314
    .line 315
    const/16 v17, 0x0

    .line 316
    .line 317
    const-string v14, "NativeAdImpl"

    .line 318
    .line 319
    const/16 v18, 0x8

    .line 320
    .line 321
    const/16 v19, 0x0

    .line 322
    .line 323
    invoke-static/range {v13 .. v19}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    return-object v23
.end method
