.class public final Lcom/moloco/sdk/internal/publisher/nativead/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/moloco/sdk/internal/publisher/a0;

.field public final d:LW1/r;

.field public final e:Lcom/moloco/sdk/acm/recorder/c;

.field public final f:Lcom/moloco/sdk/internal/services/k;

.field public final g:Lcom/moloco/sdk/publisher/AdFormatType;

.field public final h:Lcom/moloco/sdk/acm/l;

.field public final i:La2/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/a0;Lae/d;LW1/r;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/k;)V
    .locals 0

    .line 1
    const-string p4, "adUnitId"

    .line 2
    .line 3
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->c:Lcom/moloco/sdk/internal/publisher/a0;

    .line 14
    .line 15
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->d:LW1/r;

    .line 16
    .line 17
    iput-object p6, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->f:Lcom/moloco/sdk/internal/services/k;

    .line 20
    .line 21
    sget-object p1, Lcom/moloco/sdk/publisher/AdFormatType;->NATIVE:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->g:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 24
    .line 25
    sget-object p2, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 26
    .line 27
    const-string p2, "ad_create_to_load_ms"

    .line 28
    .line 29
    invoke-virtual {p6, p2}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    sget-object p3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p3, "toLowerCase(...)"

    .line 46
    .line 47
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string p3, "ad_type"

    .line 51
    .line 52
    invoke-virtual {p2, p3, p1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->h:Lcom/moloco/sdk/acm/l;

    .line 56
    .line 57
    new-instance p1, La2/k;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->i:La2/k;

    .line 63
    .line 64
    return-void
.end method

.method public static final b(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/publisher/nativead/model/h;JLlf/c;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v3, v2, Lcom/moloco/sdk/internal/publisher/nativead/e;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    move-object v3, v2

    .line 15
    check-cast v3, Lcom/moloco/sdk/internal/publisher/nativead/e;

    .line 16
    .line 17
    iget v4, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    .line 18
    .line 19
    const/high16 v5, -0x80000000

    .line 20
    .line 21
    and-int v6, v4, v5

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    sub-int/2addr v4, v5

    .line 26
    iput v4, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/publisher/nativead/e;

    .line 30
    .line 31
    invoke-direct {v3, v0, v2}, Lcom/moloco/sdk/internal/publisher/nativead/e;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v2, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->d:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 37
    .line 38
    iget v5, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    const-string v7, "toLowerCase(...)"

    .line 42
    .line 43
    const-string v8, "ad_type"

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    .line 49
    iget-object v0, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->c:Lcom/moloco/sdk/acm/l;

    .line 50
    .line 51
    iget-object v1, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->a:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 54
    .line 55
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object v11, v0

    .line 59
    move-object v0, v3

    .line 60
    goto/16 :goto_3

    .line 61
    .line 62
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v11

    .line 81
    sub-long/2addr v11, v9

    .line 82
    invoke-static/range {p2 .. p3}, LCf/a;->d(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    sub-long/2addr v9, v11

    .line 87
    const-wide/16 v11, 0x0

    .line 88
    .line 89
    cmp-long v2, v9, v11

    .line 90
    .line 91
    if-gez v2, :cond_3

    .line 92
    .line 93
    move-wide v9, v11

    .line 94
    :cond_3
    sget-object v2, LCf/c;->c:LCf/c;

    .line 95
    .line 96
    invoke-static {v9, v10, v2}, LFe/b;->T(JLCf/c;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v9

    .line 100
    iget-object v2, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/h;->a:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance v5, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_5

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    instance-of v12, v11, Lcom/moloco/sdk/internal/publisher/nativead/model/d;

    .line 122
    .line 123
    if-eqz v12, :cond_4

    .line 124
    .line 125
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_6

    .line 134
    .line 135
    const-string v2, "video"

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    const-string v2, "image"

    .line 139
    .line 140
    :goto_2
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 141
    .line 142
    iget-object v5, v0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 143
    .line 144
    const-string v11, "native_ad_load_prepare_time"

    .line 145
    .line 146
    invoke-virtual {v5, v11}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    new-instance v12, Lcom/moloco/sdk/acm/h;

    .line 151
    .line 152
    sget-object v13, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 153
    .line 154
    const-string v13, "native_ad_load_attempted"

    .line 155
    .line 156
    invoke-direct {v12, v13}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    sget-object v13, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 160
    .line 161
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 162
    .line 163
    invoke-virtual {v2, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v8, v13}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v12}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 174
    .line 175
    .line 176
    iput-object v0, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->a:Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 177
    .line 178
    iput-object v2, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->b:Ljava/lang/String;

    .line 179
    .line 180
    iput-object v11, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->c:Lcom/moloco/sdk/acm/l;

    .line 181
    .line 182
    iput v6, v3, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    .line 183
    .line 184
    iget-object v1, v1, Lcom/moloco/sdk/internal/publisher/nativead/model/h;->a:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-virtual {v0, v1, v9, v10, v3}, Lcom/moloco/sdk/internal/publisher/nativead/o;->f(Ljava/util/List;JLlf/c;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-ne v1, v4, :cond_7

    .line 191
    .line 192
    return-object v4

    .line 193
    :cond_7
    move-object/from16 v19, v2

    .line 194
    .line 195
    move-object v2, v1

    .line 196
    move-object/from16 v1, v19

    .line 197
    .line 198
    :goto_3
    check-cast v2, Lcom/moloco/sdk/internal/A;

    .line 199
    .line 200
    instance-of v3, v2, Lcom/moloco/sdk/internal/y;

    .line 201
    .line 202
    const-string v4, "native_ad_load"

    .line 203
    .line 204
    const-string v5, "result"

    .line 205
    .line 206
    if-eqz v3, :cond_8

    .line 207
    .line 208
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 209
    .line 210
    new-instance v3, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v6, "NativeAd load failed: "

    .line 213
    .line 214
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    check-cast v2, Lcom/moloco/sdk/internal/y;

    .line 218
    .line 219
    iget-object v6, v2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v6, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;

    .line 222
    .line 223
    iget-object v6, v6, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 224
    .line 225
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v14

    .line 232
    const/16 v17, 0xc

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const-string v13, "NativeAdLoader"

    .line 237
    .line 238
    const/4 v15, 0x0

    .line 239
    const/16 v16, 0x0

    .line 240
    .line 241
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 245
    .line 246
    new-instance v6, Lcom/moloco/sdk/acm/h;

    .line 247
    .line 248
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 249
    .line 250
    invoke-direct {v6, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 254
    .line 255
    const-string v4, "failure"

    .line 256
    .line 257
    invoke-virtual {v6, v5, v4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 261
    .line 262
    invoke-virtual {v1, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v8, v10}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget-object v2, v2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v2, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;

    .line 275
    .line 276
    iget-object v10, v2, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 277
    .line 278
    invoke-interface {v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;->a()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    const-string v12, "reason"

    .line 283
    .line 284
    invoke-virtual {v6, v12, v10}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget v10, v2, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;->a:I

    .line 288
    .line 289
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    const-string v14, "asset_id"

    .line 294
    .line 295
    invoke-virtual {v6, v14, v13}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v11, v5, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v11, v8, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v1, v2, Lcom/moloco/sdk/internal/publisher/nativead/parser/a;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 315
    .line 316
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;->a()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v11, v12, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-virtual {v11, v14, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 331
    .line 332
    invoke-virtual {v0, v11}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 333
    .line 334
    .line 335
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 336
    .line 337
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :cond_8
    instance-of v3, v2, Lcom/moloco/sdk/internal/z;

    .line 342
    .line 343
    if-eqz v3, :cond_9

    .line 344
    .line 345
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 346
    .line 347
    const/16 v17, 0xc

    .line 348
    .line 349
    const/16 v18, 0x0

    .line 350
    .line 351
    const-string v13, "NativeAdLoader"

    .line 352
    .line 353
    const-string v14, "NativeAd load successfully parsed and loaded all assets"

    .line 354
    .line 355
    const/4 v15, 0x0

    .line 356
    const/16 v16, 0x0

    .line 357
    .line 358
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 362
    .line 363
    new-instance v6, Lcom/moloco/sdk/acm/h;

    .line 364
    .line 365
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 366
    .line 367
    invoke-direct {v6, v4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    sget-object v4, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 371
    .line 372
    const-string v4, "success"

    .line 373
    .line 374
    invoke-virtual {v6, v5, v4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 378
    .line 379
    invoke-virtual {v1, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v10

    .line 383
    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v6, v8, v10}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v6}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v5, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v11, v8, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 406
    .line 407
    invoke-virtual {v0, v11}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 408
    .line 409
    .line 410
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 411
    .line 412
    check-cast v2, Lcom/moloco/sdk/internal/z;

    .line 413
    .line 414
    iget-object v1, v2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 415
    .line 416
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    return-object v0

    .line 420
    :cond_9
    new-instance v0, LE5/Q;

    .line 421
    .line 422
    const/16 v1, 0x9

    .line 423
    .line 424
    const/4 v2, 0x0

    .line 425
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 426
    .line 427
    .line 428
    throw v0
.end method

.method public static final c(Lcom/moloco/sdk/internal/publisher/nativead/o;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p4, Lcom/moloco/sdk/internal/publisher/nativead/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p4

    .line 9
    check-cast v0, Lcom/moloco/sdk/internal/publisher/nativead/i;

    .line 10
    .line 11
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->f:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->f:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/i;

    .line 24
    .line 25
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/internal/publisher/nativead/i;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->d:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->f:I

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lcom/moloco/sdk/internal/A;

    .line 45
    .line 46
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    iget-object p3, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 60
    .line 61
    iget-object p2, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->b:Lcom/moloco/sdk/acm/l;

    .line 62
    .line 63
    iget-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 66
    .line 67
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p0, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->a:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p2, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->b:Lcom/moloco/sdk/acm/l;

    .line 77
    .line 78
    iput-object p3, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 79
    .line 80
    iput v4, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->f:I

    .line 81
    .line 82
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->c:Lcom/moloco/sdk/internal/publisher/a0;

    .line 83
    .line 84
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p4, v2, p1, v0}, Lcom/moloco/sdk/internal/publisher/a0;->a(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    if-ne p4, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    :goto_1
    move-object p1, p4

    .line 94
    check-cast p1, Lcom/moloco/sdk/internal/A;

    .line 95
    .line 96
    instance-of p4, p1, Lcom/moloco/sdk/internal/y;

    .line 97
    .line 98
    if-eqz p4, :cond_6

    .line 99
    .line 100
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 101
    .line 102
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 103
    .line 104
    const-string v2, "failure"

    .line 105
    .line 106
    const-string v4, "result"

    .line 107
    .line 108
    invoke-virtual {p2, v4, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->getErrorCode()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const-string v5, "reason"

    .line 122
    .line 123
    invoke-virtual {p2, v5, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->g:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 133
    .line 134
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    const-string v8, "toLowerCase(...)"

    .line 139
    .line 140
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v9, "ad_type"

    .line 144
    .line 145
    invoke-virtual {p2, v9, v6}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p4, p2}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 149
    .line 150
    .line 151
    new-instance p2, Lcom/moloco/sdk/acm/h;

    .line 152
    .line 153
    sget-object p4, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 154
    .line 155
    const-string p4, "load_ad_failed"

    .line 156
    .line 157
    invoke-direct {p2, p4}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->getErrorCode()I

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    invoke-virtual {p2, v5, p4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p4

    .line 175
    invoke-virtual {p4, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p4

    .line 179
    invoke-static {p4, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v9, p4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->e:Lcom/moloco/sdk/acm/recorder/c;

    .line 186
    .line 187
    invoke-virtual {p4, p2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 188
    .line 189
    .line 190
    move-object p2, p1

    .line 191
    check-cast p2, Lcom/moloco/sdk/internal/y;

    .line 192
    .line 193
    iget-object p2, p2, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p2, Lcom/moloco/sdk/internal/r;

    .line 196
    .line 197
    iput-object p1, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->a:Ljava/lang/Object;

    .line 198
    .line 199
    const/4 p4, 0x0

    .line 200
    iput-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->b:Lcom/moloco/sdk/acm/l;

    .line 201
    .line 202
    iput-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 203
    .line 204
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/i;->f:I

    .line 205
    .line 206
    invoke-virtual {p0, p3, p2, p4, v0}, Lcom/moloco/sdk/internal/publisher/nativead/o;->e(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Llf/c;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    if-ne p0, v1, :cond_5

    .line 211
    .line 212
    :goto_2
    return-object v1

    .line 213
    :cond_5
    move-object p0, p1

    .line 214
    :goto_3
    new-instance p1, Ljava/lang/Exception;

    .line 215
    .line 216
    check-cast p0, Lcom/moloco/sdk/internal/y;

    .line 217
    .line 218
    iget-object p0, p0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Lcom/moloco/sdk/internal/r;

    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/moloco/sdk/internal/r;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :cond_6
    instance-of p0, p1, Lcom/moloco/sdk/internal/z;

    .line 235
    .line 236
    if-eqz p0, :cond_7

    .line 237
    .line 238
    check-cast p1, Lcom/moloco/sdk/internal/z;

    .line 239
    .line 240
    iget-object p0, p1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 241
    .line 242
    return-object p0

    .line 243
    :cond_7
    new-instance p0, LE5/Q;

    .line 244
    .line 245
    const/16 p1, 0x9

    .line 246
    .line 247
    const/4 p2, 0x0

    .line 248
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 249
    .line 250
    .line 251
    throw p0
.end method

.method public static final d(Lcom/moloco/sdk/internal/publisher/nativead/o;Ljava/lang/String;Lcom/moloco/sdk/internal/ortb/model/d;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v3, v2, Lcom/moloco/sdk/internal/publisher/nativead/j;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    move-object v3, v2

    .line 15
    check-cast v3, Lcom/moloco/sdk/internal/publisher/nativead/j;

    .line 16
    .line 17
    iget v4, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->e:I

    .line 18
    .line 19
    const/high16 v5, -0x80000000

    .line 20
    .line 21
    and-int v6, v4, v5

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    sub-int/2addr v4, v5

    .line 26
    iput v4, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->e:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/publisher/nativead/j;

    .line 30
    .line 31
    invoke-direct {v3, v1, v2}, Lcom/moloco/sdk/internal/publisher/nativead/j;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v2, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->c:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 37
    .line 38
    iget v5, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->e:I

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    iget-object v0, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_2
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const-string v2, "privacy"

    .line 63
    .line 64
    const-string v5, "ver"

    .line 65
    .line 66
    const-string v7, "nativeOrtbString"

    .line 67
    .line 68
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 72
    .line 73
    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v0, "native"

    .line 77
    .line 78
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move-object v7, v0

    .line 86
    :goto_1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/model/h;

    .line 87
    .line 88
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catch_0
    move-exception v0

    .line 99
    goto/16 :goto_8

    .line 100
    .line 101
    :cond_4
    :goto_2
    const-string v5, "assets"

    .line 102
    .line 103
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v5}, Lae/d;->d(Lorg/json/JSONArray;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    const-string v8, "link"

    .line 112
    .line 113
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    const/4 v9, 0x0

    .line 118
    sget-object v10, Lff/v;->a:Lff/v;

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    const/4 v8, 0x0

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    :try_start_1
    const-string v11, "url"

    .line 125
    .line 126
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    const-string v12, "fallback"

    .line 131
    .line 132
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    if-eqz v13, :cond_6

    .line 137
    .line 138
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    :cond_6
    const-string v12, "clicktrackers"

    .line 142
    .line 143
    invoke-virtual {v8, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    if-nez v8, :cond_7

    .line 148
    .line 149
    move-object v12, v10

    .line 150
    goto :goto_4

    .line 151
    :cond_7
    new-instance v12, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    move v14, v9

    .line 161
    :goto_3
    if-ge v14, v13, :cond_8

    .line 162
    .line 163
    invoke-virtual {v8, v14}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    add-int/lit8 v14, v14, 0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    :goto_4
    new-instance v8, Lcom/moloco/sdk/internal/publisher/nativead/model/g;

    .line 174
    .line 175
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v8, v11, v12}, Lcom/moloco/sdk/internal/publisher/nativead/model/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    :goto_5
    const-string v11, "imptrackers"

    .line 182
    .line 183
    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    if-nez v11, :cond_9

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    new-instance v10, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    :goto_6
    if-ge v9, v12, :cond_a

    .line 200
    .line 201
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    add-int/lit8 v9, v9, 0x1

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_a
    :goto_7
    const-string v9, "eventtrackers"

    .line 212
    .line 213
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-static {v9}, Lae/d;->e(Lorg/json/JSONArray;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-eqz v11, :cond_b

    .line 226
    .line 227
    invoke-virtual {v7, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    :cond_b
    invoke-direct {v0, v5, v8, v10, v9}, Lcom/moloco/sdk/internal/publisher/nativead/model/h;-><init>(Ljava/util/List;Lcom/moloco/sdk/internal/publisher/nativead/model/g;Ljava/util/List;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :goto_8
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    :goto_9
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    if-eqz v10, :cond_c

    .line 243
    .line 244
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 245
    .line 246
    const/16 v12, 0x8

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const-string v8, "NativeAdLoader"

    .line 250
    .line 251
    const-string v9, "handleOrtbParsing"

    .line 252
    .line 253
    const/4 v11, 0x0

    .line 254
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object v2, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 258
    .line 259
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/f;

    .line 260
    .line 261
    sget-object v7, Lff/w;->a:Lff/w;

    .line 262
    .line 263
    iget-object v8, v1, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 264
    .line 265
    invoke-static {v8, v2, v5, v7}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    iput-object v0, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->a:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v0, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->b:Ljava/lang/Object;

    .line 272
    .line 273
    iput v6, v3, Lcom/moloco/sdk/internal/publisher/nativead/j;->e:I

    .line 274
    .line 275
    move-object/from16 v5, p2

    .line 276
    .line 277
    move-object/from16 v6, p3

    .line 278
    .line 279
    invoke-virtual {v1, v6, v2, v5, v3}, Lcom/moloco/sdk/internal/publisher/nativead/o;->e(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Llf/c;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    if-ne v1, v4, :cond_c

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_c
    move-object v4, v0

    .line 287
    :goto_a
    return-object v4
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/ortb/model/d;Lcom/moloco/sdk/internal/publisher/nativead/model/h;Lcom/moloco/sdk/internal/publisher/C;JLlf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    instance-of v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/g;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/moloco/sdk/internal/publisher/nativead/g;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/moloco/sdk/internal/publisher/nativead/g;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/moloco/sdk/internal/publisher/nativead/g;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->d:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x2

    .line 39
    const/4 v10, 0x1

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    if-eq v2, v10, :cond_3

    .line 43
    .line 44
    if-eq v2, v9, :cond_2

    .line 45
    .line 46
    if-ne v2, v8, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/moloco/sdk/internal/r;

    .line 51
    .line 52
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    iget-object v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lcom/moloco/sdk/internal/r;

    .line 68
    .line 69
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_3
    iget-object v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 75
    .line 76
    iget-object v3, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->b:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 77
    .line 78
    iget-object v4, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lcom/moloco/sdk/internal/publisher/nativead/o;

    .line 81
    .line 82
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v5, v2

    .line 86
    move-object v2, v3

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v1, Lcom/moloco/sdk/internal/publisher/nativead/o;->d:LW1/r;

    .line 92
    .line 93
    invoke-virtual {v0}, LW1/r;->a()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 98
    .line 99
    const-string v0, "Native ad load startTimestampMs="

    .line 100
    .line 101
    const-string v2, ", remainingTimeoutMs="

    .line 102
    .line 103
    move-wide/from16 v12, p4

    .line 104
    .line 105
    invoke-static {v12, v13, v0, v2}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v3, v4}, LCf/a;->d(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v12

    .line 113
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    const/4 v14, 0x0

    .line 121
    const/4 v15, 0x0

    .line 122
    const-string v12, "NativeAdLoader"

    .line 123
    .line 124
    const/16 v16, 0xc

    .line 125
    .line 126
    const/16 v17, 0x0

    .line 127
    .line 128
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/h;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    move-object/from16 v2, p2

    .line 135
    .line 136
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/internal/publisher/nativead/h;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/publisher/nativead/model/h;JLjf/c;)V

    .line 137
    .line 138
    .line 139
    iput-object v1, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v2, p1

    .line 142
    .line 143
    iput-object v2, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->b:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 144
    .line 145
    move-object/from16 v5, p3

    .line 146
    .line 147
    iput-object v5, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 148
    .line 149
    iput v10, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 150
    .line 151
    invoke-static {v3, v4, v0, v6}, LEf/H;->S(JLtf/p;Llf/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v7, :cond_5

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_5
    move-object v4, v1

    .line 160
    :goto_2
    check-cast v0, Lcom/moloco/sdk/internal/A;

    .line 161
    .line 162
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 163
    .line 164
    new-instance v3, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v11, "Handling native ad load result: "

    .line 167
    .line 168
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const-string v11, "NativeAdLoader"

    .line 181
    .line 182
    const/16 v15, 0xc

    .line 183
    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v3, Lff/w;->a:Lff/w;

    .line 190
    .line 191
    const/4 v11, 0x0

    .line 192
    if-nez v0, :cond_7

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    move-object v0, v11

    .line 197
    const-string v11, "NativeAdLoader"

    .line 198
    .line 199
    const-string v12, "Native ad load timeout"

    .line 200
    .line 201
    const/16 v15, 0xc

    .line 202
    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object v8, v4, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 209
    .line 210
    sget-object v10, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_TIMEOUT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 211
    .line 212
    sget-object v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/a;

    .line 213
    .line 214
    invoke-static {v8, v10, v11, v3}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    iput-object v3, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->b:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 221
    .line 222
    iput-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 223
    .line 224
    iput v9, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 225
    .line 226
    invoke-virtual {v4, v5, v3, v2, v6}, Lcom/moloco/sdk/internal/publisher/nativead/o;->e(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Llf/c;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-ne v0, v7, :cond_6

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_6
    move-object v2, v3

    .line 234
    :goto_3
    new-instance v0, Ljava/lang/Exception;

    .line 235
    .line 236
    invoke-virtual {v2}, Lcom/moloco/sdk/internal/r;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    :cond_7
    move-object v9, v11

    .line 249
    instance-of v10, v0, Lcom/moloco/sdk/internal/y;

    .line 250
    .line 251
    if-eqz v10, :cond_9

    .line 252
    .line 253
    iget-object v10, v4, Lcom/moloco/sdk/internal/publisher/nativead/o;->b:Ljava/lang/String;

    .line 254
    .line 255
    sget-object v11, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 256
    .line 257
    check-cast v0, Lcom/moloco/sdk/internal/y;

    .line 258
    .line 259
    iget-object v0, v0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 262
    .line 263
    invoke-static {v10, v11, v0, v3}, Lcom/moloco/sdk/internal/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;Ljava/util/Map;)Lcom/moloco/sdk/internal/r;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    iput-object v0, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->a:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v9, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->b:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 270
    .line 271
    iput-object v9, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->c:Lcom/moloco/sdk/internal/publisher/s0;

    .line 272
    .line 273
    iput v8, v6, Lcom/moloco/sdk/internal/publisher/nativead/g;->f:I

    .line 274
    .line 275
    invoke-virtual {v4, v5, v0, v2, v6}, Lcom/moloco/sdk/internal/publisher/nativead/o;->e(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Llf/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    if-ne v2, v7, :cond_8

    .line 280
    .line 281
    :goto_4
    return-object v7

    .line 282
    :cond_8
    move-object v2, v0

    .line 283
    :goto_5
    new-instance v0, Ljava/lang/Exception;

    .line 284
    .line 285
    invoke-virtual {v2}, Lcom/moloco/sdk/internal/r;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0

    .line 297
    :cond_9
    instance-of v2, v0, Lcom/moloco/sdk/internal/z;

    .line 298
    .line 299
    if-eqz v2, :cond_a

    .line 300
    .line 301
    check-cast v0, Lcom/moloco/sdk/internal/z;

    .line 302
    .line 303
    iget-object v0, v0, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 304
    .line 305
    return-object v0

    .line 306
    :cond_a
    new-instance v0, LE5/Q;

    .line 307
    .line 308
    const/16 v2, 0x9

    .line 309
    .line 310
    const/4 v3, 0x0

    .line 311
    invoke-direct {v0, v3, v2}, LE5/Q;-><init>(BI)V

    .line 312
    .line 313
    .line 314
    throw v0
.end method

.method public final e(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Llf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->i:La2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, LEf/S;->a:LLf/e;

    .line 7
    .line 8
    sget-object v0, LJf/n;->a:LFf/e;

    .line 9
    .line 10
    new-instance v1, Lcom/moloco/sdk/internal/publisher/nativead/f;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p1, p2, p3, v2}, Lcom/moloco/sdk/internal/publisher/nativead/f;-><init>(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Ljf/c;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p4}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 26
    .line 27
    return-object p1
.end method

.method public final f(Ljava/util/List;JLlf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/internal/publisher/nativead/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/nativead/n;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/n;->c:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/n;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/n;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/internal/publisher/nativead/n;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/n;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/n;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/n;->c:I

    .line 52
    .line 53
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->a:Landroid/content/Context;

    .line 54
    .line 55
    invoke-static {p4, p1, p2, p3, v0}, LA6/c;->c(Landroid/content/Context;Ljava/util/List;JLlf/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    if-ne p4, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_3
    :goto_1
    check-cast p4, Lcom/moloco/sdk/internal/A;

    .line 63
    .line 64
    instance-of p1, p4, Lcom/moloco/sdk/internal/z;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    new-instance p1, Lcom/moloco/sdk/internal/z;

    .line 69
    .line 70
    check-cast p4, Lcom/moloco/sdk/internal/z;

    .line 71
    .line 72
    iget-object p2, p4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    instance-of p1, p4, Lcom/moloco/sdk/internal/y;

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 83
    .line 84
    check-cast p4, Lcom/moloco/sdk/internal/y;

    .line 85
    .line 86
    iget-object p1, p4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v3, p1

    .line 89
    check-cast v3, Ljava/lang/Throwable;

    .line 90
    .line 91
    const-string v2, "NativeAd prepareAssets failed"

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    const-string v1, "NativeAdLoader"

    .line 95
    .line 96
    const/16 v5, 0x8

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 103
    .line 104
    iget-object p2, p4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_5
    new-instance p1, LE5/Q;

    .line 111
    .line 112
    const/16 p2, 0x9

    .line 113
    .line 114
    const/4 p3, 0x0

    .line 115
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public final g(Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/C;Llf/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/internal/publisher/nativead/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/publisher/nativead/k;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/k;->c:I

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
    iput v1, v0, Lcom/moloco/sdk/internal/publisher/nativead/k;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/nativead/k;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/internal/publisher/nativead/k;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/internal/publisher/nativead/k;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/publisher/nativead/k;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p4, p0, Lcom/moloco/sdk/internal/publisher/nativead/o;->i:La2/k;

    .line 52
    .line 53
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object p4, LEf/S;->a:LLf/e;

    .line 57
    .line 58
    new-instance v4, Lcom/moloco/sdk/internal/publisher/nativead/m;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    move-object v5, p0

    .line 62
    move-object v7, p1

    .line 63
    move-object v6, p2

    .line 64
    move-object v8, p3

    .line 65
    invoke-direct/range {v4 .. v9}, Lcom/moloco/sdk/internal/publisher/nativead/m;-><init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/acm/l;Ljava/lang/String;Lcom/moloco/sdk/internal/publisher/C;Ljf/c;)V

    .line 66
    .line 67
    .line 68
    iput v3, v0, Lcom/moloco/sdk/internal/publisher/nativead/k;->c:I

    .line 69
    .line 70
    invoke-static {p4, v4, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    if-ne p4, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    check-cast p4, Lef/n;

    .line 78
    .line 79
    iget-object p1, p4, Lef/n;->a:Ljava/lang/Object;

    .line 80
    .line 81
    return-object p1
.end method
