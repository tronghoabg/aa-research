.class public final Lcom/vungle/ads/internal/downloader/f;
.super Lcom/vungle/ads/internal/task/j;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/vungle/ads/internal/downloader/h;

.field public final synthetic b:Lcom/vungle/ads/internal/downloader/k;

.field public final synthetic c:Lcom/vungle/ads/internal/downloader/d;


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/h;Lcom/vungle/ads/internal/load/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/vungle/ads/internal/downloader/f;->a:Lcom/vungle/ads/internal/downloader/h;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/vungle/ads/internal/downloader/f;->b:Lcom/vungle/ads/internal/downloader/k;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/vungle/ads/internal/downloader/f;->c:Lcom/vungle/ads/internal/downloader/d;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/vungle/ads/internal/task/j;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/downloader/f;->b:Lcom/vungle/ads/internal/downloader/k;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/vungle/ads/internal/downloader/k;->a:Lcom/vungle/ads/internal/downloader/j;

    .line 4
    .line 5
    iget v0, v0, Lcom/vungle/ads/internal/downloader/j;->a:I

    .line 6
    .line 7
    return v0
.end method

.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/downloader/f;->a:Lcom/vungle/ads/internal/downloader/h;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/vungle/ads/internal/downloader/f;->b:Lcom/vungle/ads/internal/downloader/k;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/vungle/ads/internal/downloader/f;->c:Lcom/vungle/ads/internal/downloader/d;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v3, v2

    .line 13
    check-cast v3, Lcom/vungle/ads/internal/load/c;

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/k;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/vungle/ads/internal/downloader/h;->a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/d;)Lcom/vungle/ads/internal/downloader/b;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :goto_0
    const-string v4, "AssetDownloader"

    .line 23
    .line 24
    if-eqz v3, :cond_5

    .line 25
    .line 26
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 35
    .line 36
    const-string v0, "Download cancelled, not retrying"

    .line 37
    .line 38
    invoke-static {v4, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_1
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->b:Lcom/vungle/ads/internal/model/b;

    .line 44
    .line 45
    iget-object v5, v5, Lcom/vungle/ads/internal/model/b;->e:Ljava/lang/Integer;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/16 v7, 0x64

    .line 54
    .line 55
    if-ge v6, v7, :cond_2

    .line 56
    .line 57
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v6, "Partial download asset (percentage="

    .line 62
    .line 63
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v5, "), not retrying"

    .line 70
    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v4, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_2
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    iget v6, v1, Lcom/vungle/ads/internal/downloader/k;->d:I

    .line 90
    .line 91
    if-ge v5, v6, :cond_4

    .line 92
    .line 93
    invoke-static {v3}, Lcom/vungle/ads/internal/downloader/a;->a(Lcom/vungle/ads/internal/downloader/b;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_3

    .line 98
    .line 99
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 100
    .line 101
    const-string v0, "Error reason "

    .line 102
    .line 103
    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget v5, v3, Lcom/vungle/ads/internal/downloader/b;->c:I

    .line 108
    .line 109
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v5, " is not retryable"

    .line 113
    .line 114
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v4, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    goto/16 :goto_1

    .line 125
    .line 126
    :cond_3
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 129
    .line 130
    .line 131
    new-instance v5, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v6, "Error: "

    .line 134
    .line 135
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v6, v3, Lcom/vungle/ads/internal/downloader/b;->b:Ljava/lang/Throwable;

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v6, ", Code: "

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget v6, v3, Lcom/vungle/ads/internal/downloader/b;->a:I

    .line 153
    .line 154
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v6, ", Reason: "

    .line 158
    .line 159
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget v6, v3, Lcom/vungle/ads/internal/downloader/b;->c:I

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v1, v5}, Lcom/vungle/ads/internal/downloader/k;->a(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sget-boolean v5, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 175
    .line 176
    const-string v5, "Download failed, retrying immediately. Attempt "

    .line 177
    .line 178
    invoke-static {v5}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iget-object v6, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const/16 v6, 0x2f

    .line 192
    .line 193
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    iget v6, v1, Lcom/vungle/ads/internal/downloader/k;->d:I

    .line 197
    .line 198
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v6, ". URL: "

    .line 202
    .line 203
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v6, v1, Lcom/vungle/ads/internal/downloader/k;->b:Lcom/vungle/ads/internal/model/b;

    .line 207
    .line 208
    iget-object v6, v6, Lcom/vungle/ads/internal/model/b;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v6, ", Error: "

    .line 214
    .line 215
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget-object v3, v3, Lcom/vungle/ads/internal/downloader/b;->b:Ljava/lang/Throwable;

    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-static {v4, v3}, Lcom/vungle/ads/internal/util/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v1, v2}, Lcom/vungle/ads/internal/downloader/h;->a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/d;)Lcom/vungle/ads/internal/downloader/b;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_4
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 241
    .line 242
    const-string v0, "Max retry attempts reached ("

    .line 243
    .line 244
    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iget v5, v1, Lcom/vungle/ads/internal/downloader/k;->d:I

    .line 249
    .line 250
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const/16 v5, 0x29

    .line 254
    .line 255
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v4, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    :cond_5
    :goto_1
    if-eqz v3, :cond_7

    .line 266
    .line 267
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 268
    .line 269
    const-string v0, "Download failed after "

    .line 270
    .line 271
    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 276
    .line 277
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    add-int/lit8 v5, v5, 0x1

    .line 282
    .line 283
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v5, " attempts. URL: "

    .line 287
    .line 288
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    iget-object v5, v1, Lcom/vungle/ads/internal/downloader/k;->b:Lcom/vungle/ads/internal/model/b;

    .line 292
    .line 293
    iget-object v5, v5, Lcom/vungle/ads/internal/model/b;->b:Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v5, ". Retry history: "

    .line 299
    .line 300
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Lcom/vungle/ads/internal/downloader/k;->d()Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v4, v0}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget-object v0, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-lez v0, :cond_6

    .line 324
    .line 325
    sget-object v4, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 326
    .line 327
    sget-object v5, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->ASSET_DOWNLOAD_RETRY_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 328
    .line 329
    iget-object v8, v1, Lcom/vungle/ads/internal/downloader/k;->c:Lcom/vungle/ads/internal/util/s;

    .line 330
    .line 331
    const-string v0, "retryCount="

    .line 332
    .line 333
    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-object v6, v1, Lcom/vungle/ads/internal/downloader/k;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 338
    .line 339
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v6, " url="

    .line 347
    .line 348
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    iget-object v6, v1, Lcom/vungle/ads/internal/downloader/k;->b:Lcom/vungle/ads/internal/model/b;

    .line 352
    .line 353
    iget-object v6, v6, Lcom/vungle/ads/internal/model/b;->b:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    const-wide/16 v6, 0x2

    .line 363
    .line 364
    invoke-virtual/range {v4 .. v9}, Lcom/vungle/ads/internal/AnalyticsClient;->c(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :cond_6
    if-eqz v2, :cond_7

    .line 368
    .line 369
    check-cast v2, Lcom/vungle/ads/internal/load/c;

    .line 370
    .line 371
    invoke-virtual {v2, v3, v1}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/b;Lcom/vungle/ads/internal/downloader/k;)V

    .line 372
    .line 373
    .line 374
    :cond_7
    return-void
.end method
