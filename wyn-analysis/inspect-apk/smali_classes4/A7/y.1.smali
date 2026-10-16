.class public abstract LA7/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:LA7/D;

.field public static final A0:LA7/D;

.field public static final B:LA7/D;

.field public static final B0:LA7/D;

.field public static final C:LA7/D;

.field public static final C0:LA7/D;

.field public static final D:LA7/D;

.field public static final D0:LA7/D;

.field public static final E:LA7/D;

.field public static final E0:LA7/D;

.field public static final F:LA7/D;

.field public static final F0:LA7/D;

.field public static final G:LA7/D;

.field public static final G0:LA7/D;

.field public static final H:LA7/D;

.field public static final H0:LA7/D;

.field public static final I:LA7/D;

.field public static final I0:LA7/D;

.field public static final J:LA7/D;

.field public static final J0:LA7/D;

.field public static final K:LA7/D;

.field public static final K0:LA7/D;

.field public static final L:LA7/D;

.field public static final L0:LA7/D;

.field public static final M:LA7/D;

.field public static final M0:LA7/D;

.field public static final N:LA7/D;

.field public static final N0:LA7/D;

.field public static final O:LA7/D;

.field public static final O0:LA7/D;

.field public static final P:LA7/D;

.field public static final P0:LA7/D;

.field public static final Q:LA7/D;

.field public static final Q0:LA7/D;

.field public static final R:LA7/D;

.field public static final R0:LA7/D;

.field public static final S:LA7/D;

.field public static final S0:LA7/D;

.field public static final T:LA7/D;

.field public static final T0:LA7/D;

.field public static final U:LA7/D;

.field public static final U0:LA7/D;

.field public static final V:LA7/D;

.field public static final V0:LA7/D;

.field public static final W:LA7/D;

.field public static final W0:LA7/D;

.field public static final X:LA7/D;

.field public static final X0:LA7/D;

.field public static final Y:LA7/D;

.field public static final Y0:LA7/D;

.field public static final Z:LA7/D;

.field public static final Z0:LA7/D;

.field public static final a:Ljava/util/List;

.field public static final a0:LA7/D;

.field public static final a1:LA7/D;

.field public static final b:LA7/D;

.field public static final b0:LA7/D;

.field public static final b1:LA7/D;

.field public static final c:LA7/D;

.field public static final c0:LA7/D;

.field public static final c1:LA7/D;

.field public static final d:LA7/D;

.field public static final d0:LA7/D;

.field public static final d1:LA7/D;

.field public static final e:LA7/D;

.field public static final e0:LA7/D;

.field public static final e1:LA7/D;

.field public static final f:LA7/D;

.field public static final f0:LA7/D;

.field public static final f1:LA7/D;

.field public static final g:LA7/D;

.field public static final g0:LA7/D;

.field public static final g1:LA7/D;

.field public static final h:LA7/D;

.field public static final h0:LA7/D;

.field public static final h1:LA7/D;

.field public static final i:LA7/D;

.field public static final i0:LA7/D;

.field public static final i1:LA7/D;

.field public static final j:LA7/D;

.field public static final j0:LA7/D;

.field public static final j1:LA7/D;

.field public static final k:LA7/D;

.field public static final k0:LA7/D;

.field public static final k1:LA7/D;

.field public static final l:LA7/D;

.field public static final l0:LA7/D;

.field public static final l1:LA7/D;

.field public static final m:LA7/D;

.field public static final m0:LA7/D;

.field public static final n:LA7/D;

.field public static final n0:LA7/D;

.field public static final o:LA7/D;

.field public static final o0:LA7/D;

.field public static final p:LA7/D;

.field public static final p0:LA7/D;

.field public static final q:LA7/D;

.field public static final q0:LA7/D;

.field public static final r:LA7/D;

.field public static final r0:LA7/D;

.field public static final s:LA7/D;

.field public static final s0:LA7/D;

.field public static final t:LA7/D;

.field public static final t0:LA7/D;

.field public static final u:LA7/D;

.field public static final u0:LA7/D;

.field public static final v:LA7/D;

.field public static final v0:LA7/D;

.field public static final w:LA7/D;

.field public static final w0:LA7/D;

.field public static final x:LA7/D;

.field public static final x0:LA7/D;

.field public static final y:LA7/D;

.field public static final y0:LA7/D;

.field public static final z:LA7/D;

.field public static final z0:LA7/D;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LA7/y;->a:Ljava/util/List;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    const-wide/16 v0, 0x2710

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lwa/a;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, v2}, Lwa/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v2, "measurement.ad_id_cache_time"

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v2, v0, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sput-object v1, LA7/y;->b:LA7/D;

    .line 40
    .line 41
    const-wide/32 v1, 0x36ee80

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, LVa/ka;

    .line 49
    .line 50
    const/4 v6, 0x6

    .line 51
    invoke-direct {v5, v6}, LVa/ka;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const-string v6, "measurement.app_uninstalled_additional_ad_id_cache_time"

    .line 55
    .line 56
    invoke-static {v6, v4, v5, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    sput-object v4, LA7/y;->c:LA7/D;

    .line 61
    .line 62
    const-wide/32 v4, 0x5265c00

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Lm9/S;

    .line 70
    .line 71
    const/4 v8, 0x7

    .line 72
    invoke-direct {v7, v8}, Lm9/S;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const-string v8, "measurement.monitoring.sample_period_millis"

    .line 76
    .line 77
    invoke-static {v8, v6, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    sput-object v6, LA7/y;->d:LA7/D;

    .line 82
    .line 83
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v7, Lx9/d;

    .line 88
    .line 89
    const/16 v8, 0x8

    .line 90
    .line 91
    invoke-direct {v7, v8}, Lx9/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    const-string v8, "measurement.config.cache_time"

    .line 95
    .line 96
    invoke-static {v8, v6, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    sput-object v6, LA7/y;->e:LA7/D;

    .line 101
    .line 102
    new-instance v6, LVa/ka;

    .line 103
    .line 104
    const/16 v7, 0xa

    .line 105
    .line 106
    invoke-direct {v6, v7}, LVa/ka;-><init>(I)V

    .line 107
    .line 108
    .line 109
    const-string v7, "measurement.config.url_scheme"

    .line 110
    .line 111
    const-string v8, "https"

    .line 112
    .line 113
    invoke-static {v7, v8, v6, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    sput-object v6, LA7/y;->f:LA7/D;

    .line 118
    .line 119
    new-instance v6, Lm9/S;

    .line 120
    .line 121
    const/16 v7, 0xb

    .line 122
    .line 123
    invoke-direct {v6, v7}, Lm9/S;-><init>(I)V

    .line 124
    .line 125
    .line 126
    const-string v7, "measurement.config.url_authority"

    .line 127
    .line 128
    const-string v9, "app-measurement.com"

    .line 129
    .line 130
    invoke-static {v7, v9, v6, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    sput-object v6, LA7/y;->g:LA7/D;

    .line 135
    .line 136
    const/16 v6, 0x64

    .line 137
    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    new-instance v9, Lx9/d;

    .line 143
    .line 144
    const/16 v10, 0xc

    .line 145
    .line 146
    invoke-direct {v9, v10}, Lx9/d;-><init>(I)V

    .line 147
    .line 148
    .line 149
    const-string v10, "measurement.upload.max_bundles"

    .line 150
    .line 151
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    sput-object v7, LA7/y;->h:LA7/D;

    .line 156
    .line 157
    const/high16 v7, 0x10000

    .line 158
    .line 159
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    new-instance v10, LVa/ka;

    .line 164
    .line 165
    const/16 v11, 0xe

    .line 166
    .line 167
    invoke-direct {v10, v11}, LVa/ka;-><init>(I)V

    .line 168
    .line 169
    .line 170
    const-string v11, "measurement.upload.max_batch_size"

    .line 171
    .line 172
    invoke-static {v11, v9, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    sput-object v9, LA7/y;->i:LA7/D;

    .line 177
    .line 178
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    new-instance v9, Lx4/d;

    .line 183
    .line 184
    const/4 v10, 0x2

    .line 185
    invoke-direct {v9, v10}, Lx4/d;-><init>(I)V

    .line 186
    .line 187
    .line 188
    const-string v10, "measurement.upload.max_bundle_size"

    .line 189
    .line 190
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    sput-object v7, LA7/y;->j:LA7/D;

    .line 195
    .line 196
    const/16 v7, 0x3e8

    .line 197
    .line 198
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    new-instance v10, Lza/a;

    .line 203
    .line 204
    const/4 v11, 0x3

    .line 205
    invoke-direct {v10, v11}, Lza/a;-><init>(I)V

    .line 206
    .line 207
    .line 208
    const-string v11, "measurement.upload.max_events_per_bundle"

    .line 209
    .line 210
    invoke-static {v11, v9, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    sput-object v9, LA7/y;->k:LA7/D;

    .line 215
    .line 216
    const v9, 0x186a0

    .line 217
    .line 218
    .line 219
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    new-instance v11, Lya/b;

    .line 224
    .line 225
    const/4 v12, 0x3

    .line 226
    invoke-direct {v11, v12}, Lya/b;-><init>(I)V

    .line 227
    .line 228
    .line 229
    const-string v12, "measurement.upload.max_events_per_day"

    .line 230
    .line 231
    invoke-static {v12, v10, v11, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    sput-object v10, LA7/y;->l:LA7/D;

    .line 236
    .line 237
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    new-instance v10, Lza/a;

    .line 242
    .line 243
    const/4 v11, 0x4

    .line 244
    invoke-direct {v10, v11}, Lza/a;-><init>(I)V

    .line 245
    .line 246
    .line 247
    const-string v11, "measurement.upload.max_error_events_per_day"

    .line 248
    .line 249
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    sput-object v7, LA7/y;->m:LA7/D;

    .line 254
    .line 255
    const v7, 0xc350

    .line 256
    .line 257
    .line 258
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    new-instance v10, Lc8/e;

    .line 263
    .line 264
    const/4 v11, 0x5

    .line 265
    invoke-direct {v10, v11}, Lc8/e;-><init>(I)V

    .line 266
    .line 267
    .line 268
    const-string v11, "measurement.upload.max_public_events_per_day"

    .line 269
    .line 270
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    sput-object v7, LA7/y;->n:LA7/D;

    .line 275
    .line 276
    const/16 v7, 0x2710

    .line 277
    .line 278
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    new-instance v10, LXd/c;

    .line 283
    .line 284
    const/4 v11, 0x5

    .line 285
    invoke-direct {v10, v11}, LXd/c;-><init>(I)V

    .line 286
    .line 287
    .line 288
    const-string v11, "measurement.upload.max_conversions_per_day"

    .line 289
    .line 290
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    sput-object v7, LA7/y;->o:LA7/D;

    .line 295
    .line 296
    const/16 v7, 0xa

    .line 297
    .line 298
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    new-instance v10, Lwa/a;

    .line 303
    .line 304
    const/4 v11, 0x5

    .line 305
    invoke-direct {v10, v11}, Lwa/a;-><init>(I)V

    .line 306
    .line 307
    .line 308
    const-string v11, "measurement.upload.max_realtime_events_per_day"

    .line 309
    .line 310
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 311
    .line 312
    .line 313
    move-result-object v7

    .line 314
    sput-object v7, LA7/y;->p:LA7/D;

    .line 315
    .line 316
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    new-instance v9, Lm9/S;

    .line 321
    .line 322
    const/4 v10, 0x5

    .line 323
    invoke-direct {v9, v10}, Lm9/S;-><init>(I)V

    .line 324
    .line 325
    .line 326
    const-string v10, "measurement.store.max_stored_events_per_app"

    .line 327
    .line 328
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    sput-object v7, LA7/y;->q:LA7/D;

    .line 333
    .line 334
    new-instance v7, Lx9/d;

    .line 335
    .line 336
    const/4 v9, 0x5

    .line 337
    invoke-direct {v7, v9}, Lx9/d;-><init>(I)V

    .line 338
    .line 339
    .line 340
    const-string v9, "measurement.upload.url"

    .line 341
    .line 342
    const-string v10, "https://app-measurement.com/a"

    .line 343
    .line 344
    invoke-static {v9, v10, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    sput-object v7, LA7/y;->r:LA7/D;

    .line 349
    .line 350
    new-instance v7, Lx4/d;

    .line 351
    .line 352
    const/4 v9, 0x5

    .line 353
    invoke-direct {v7, v9}, Lx4/d;-><init>(I)V

    .line 354
    .line 355
    .line 356
    const-string v9, "measurement.sgtm.google_signal.url"

    .line 357
    .line 358
    const-string v10, "https://app-measurement.com/s"

    .line 359
    .line 360
    invoke-static {v9, v10, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    sput-object v7, LA7/y;->s:LA7/D;

    .line 365
    .line 366
    const-wide/32 v9, 0x2932e00

    .line 367
    .line 368
    .line 369
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    new-instance v9, Lza/a;

    .line 374
    .line 375
    const/4 v10, 0x5

    .line 376
    invoke-direct {v9, v10}, Lza/a;-><init>(I)V

    .line 377
    .line 378
    .line 379
    const-string v10, "measurement.upload.backoff_period"

    .line 380
    .line 381
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    sput-object v7, LA7/y;->t:LA7/D;

    .line 386
    .line 387
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    new-instance v9, Lya/b;

    .line 392
    .line 393
    const/4 v10, 0x5

    .line 394
    invoke-direct {v9, v10}, Lya/b;-><init>(I)V

    .line 395
    .line 396
    .line 397
    const-string v10, "measurement.upload.window_interval"

    .line 398
    .line 399
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    sput-object v7, LA7/y;->u:LA7/D;

    .line 404
    .line 405
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    new-instance v9, Lm9/S;

    .line 410
    .line 411
    const/4 v10, 0x6

    .line 412
    invoke-direct {v9, v10}, Lm9/S;-><init>(I)V

    .line 413
    .line 414
    .line 415
    const-string v10, "measurement.upload.interval"

    .line 416
    .line 417
    invoke-static {v10, v7, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    sput-object v7, LA7/y;->v:LA7/D;

    .line 422
    .line 423
    new-instance v7, Lc8/e;

    .line 424
    .line 425
    const/4 v9, 0x6

    .line 426
    invoke-direct {v7, v9}, Lc8/e;-><init>(I)V

    .line 427
    .line 428
    .line 429
    const-string v9, "measurement.upload.realtime_upload_interval"

    .line 430
    .line 431
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    sput-object v0, LA7/y;->w:LA7/D;

    .line 436
    .line 437
    const-wide/16 v9, 0x3e8

    .line 438
    .line 439
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    new-instance v7, Lx4/d;

    .line 444
    .line 445
    const/4 v9, 0x6

    .line 446
    invoke-direct {v7, v9}, Lx4/d;-><init>(I)V

    .line 447
    .line 448
    .line 449
    const-string v9, "measurement.upload.debug_upload_interval"

    .line 450
    .line 451
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    sput-object v0, LA7/y;->x:LA7/D;

    .line 456
    .line 457
    const-wide/16 v9, 0x1f4

    .line 458
    .line 459
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    new-instance v7, Lwa/a;

    .line 464
    .line 465
    const/4 v9, 0x6

    .line 466
    invoke-direct {v7, v9}, Lwa/a;-><init>(I)V

    .line 467
    .line 468
    .line 469
    const-string v9, "measurement.upload.minimum_delay"

    .line 470
    .line 471
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, LA7/y;->y:LA7/D;

    .line 476
    .line 477
    const-wide/32 v9, 0xea60

    .line 478
    .line 479
    .line 480
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    new-instance v7, Lya/b;

    .line 485
    .line 486
    const/4 v9, 0x6

    .line 487
    invoke-direct {v7, v9}, Lya/b;-><init>(I)V

    .line 488
    .line 489
    .line 490
    const-string v9, "measurement.alarm_manager.minimum_interval"

    .line 491
    .line 492
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sput-object v0, LA7/y;->z:LA7/D;

    .line 497
    .line 498
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    new-instance v4, Lx9/d;

    .line 503
    .line 504
    const/4 v5, 0x6

    .line 505
    invoke-direct {v4, v5}, Lx9/d;-><init>(I)V

    .line 506
    .line 507
    .line 508
    const-string v5, "measurement.upload.stale_data_deletion_interval"

    .line 509
    .line 510
    invoke-static {v5, v0, v4, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    sput-object v0, LA7/y;->A:LA7/D;

    .line 515
    .line 516
    const-wide/32 v4, 0x240c8400

    .line 517
    .line 518
    .line 519
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    new-instance v7, LVa/ka;

    .line 524
    .line 525
    const/4 v9, 0x7

    .line 526
    invoke-direct {v7, v9}, LVa/ka;-><init>(I)V

    .line 527
    .line 528
    .line 529
    const-string v9, "measurement.upload.refresh_blacklisted_config_interval"

    .line 530
    .line 531
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, LA7/y;->B:LA7/D;

    .line 536
    .line 537
    const-wide/16 v9, 0x3a98

    .line 538
    .line 539
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    new-instance v7, Lza/a;

    .line 544
    .line 545
    const/4 v9, 0x6

    .line 546
    invoke-direct {v7, v9}, Lza/a;-><init>(I)V

    .line 547
    .line 548
    .line 549
    const-string v9, "measurement.upload.initial_upload_delay_time"

    .line 550
    .line 551
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    sput-object v0, LA7/y;->C:LA7/D;

    .line 556
    .line 557
    const-wide/32 v9, 0x1b7740

    .line 558
    .line 559
    .line 560
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    new-instance v7, Lc8/e;

    .line 565
    .line 566
    const/4 v9, 0x7

    .line 567
    invoke-direct {v7, v9}, Lc8/e;-><init>(I)V

    .line 568
    .line 569
    .line 570
    const-string v9, "measurement.upload.retry_time"

    .line 571
    .line 572
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    sput-object v0, LA7/y;->D:LA7/D;

    .line 577
    .line 578
    const/4 v0, 0x6

    .line 579
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    new-instance v7, Lwa/a;

    .line 584
    .line 585
    const/4 v9, 0x7

    .line 586
    invoke-direct {v7, v9}, Lwa/a;-><init>(I)V

    .line 587
    .line 588
    .line 589
    const-string v9, "measurement.upload.retry_count"

    .line 590
    .line 591
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    sput-object v0, LA7/y;->E:LA7/D;

    .line 596
    .line 597
    const-wide/32 v9, 0x1ee62800

    .line 598
    .line 599
    .line 600
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    new-instance v7, Lx9/d;

    .line 605
    .line 606
    const/4 v9, 0x7

    .line 607
    invoke-direct {v7, v9}, Lx9/d;-><init>(I)V

    .line 608
    .line 609
    .line 610
    const-string v9, "measurement.upload.max_queue_time"

    .line 611
    .line 612
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    sput-object v0, LA7/y;->F:LA7/D;

    .line 617
    .line 618
    const-wide/32 v9, 0x493e0

    .line 619
    .line 620
    .line 621
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    new-instance v7, Lx4/d;

    .line 626
    .line 627
    const/4 v9, 0x7

    .line 628
    invoke-direct {v7, v9}, Lx4/d;-><init>(I)V

    .line 629
    .line 630
    .line 631
    const-string v9, "measurement.upload.google_signal_max_queue_time"

    .line 632
    .line 633
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    sput-object v0, LA7/y;->G:LA7/D;

    .line 638
    .line 639
    const/4 v0, 0x4

    .line 640
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    new-instance v7, Lza/a;

    .line 645
    .line 646
    const/4 v9, 0x7

    .line 647
    invoke-direct {v7, v9}, Lza/a;-><init>(I)V

    .line 648
    .line 649
    .line 650
    const-string v9, "measurement.lifetimevalue.max_currency_tracked"

    .line 651
    .line 652
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    sput-object v0, LA7/y;->H:LA7/D;

    .line 657
    .line 658
    const/16 v0, 0xc8

    .line 659
    .line 660
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    new-instance v7, Lya/b;

    .line 665
    .line 666
    const/4 v9, 0x7

    .line 667
    invoke-direct {v7, v9}, Lya/b;-><init>(I)V

    .line 668
    .line 669
    .line 670
    const-string v9, "measurement.audience.filter_result_max_count"

    .line 671
    .line 672
    invoke-static {v9, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    sput-object v0, LA7/y;->I:LA7/D;

    .line 677
    .line 678
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    const-string v7, "measurement.upload.max_public_user_properties"

    .line 683
    .line 684
    const/4 v9, 0x0

    .line 685
    invoke-static {v7, v0, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    sput-object v0, LA7/y;->J:LA7/D;

    .line 690
    .line 691
    const/16 v0, 0x7d0

    .line 692
    .line 693
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    const-string v7, "measurement.upload.max_event_name_cardinality"

    .line 698
    .line 699
    invoke-static {v7, v0, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    sput-object v0, LA7/y;->K:LA7/D;

    .line 704
    .line 705
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    const-string v7, "measurement.upload.max_public_event_params"

    .line 710
    .line 711
    invoke-static {v7, v0, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    sput-object v0, LA7/y;->L:LA7/D;

    .line 716
    .line 717
    const-wide/16 v10, 0x1388

    .line 718
    .line 719
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    new-instance v7, LXd/c;

    .line 724
    .line 725
    const/16 v10, 0x8

    .line 726
    .line 727
    invoke-direct {v7, v10}, LXd/c;-><init>(I)V

    .line 728
    .line 729
    .line 730
    const-string v10, "measurement.service_client.idle_disconnect_millis"

    .line 731
    .line 732
    invoke-static {v10, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    sput-object v0, LA7/y;->M:LA7/D;

    .line 737
    .line 738
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 739
    .line 740
    new-instance v7, LVa/ka;

    .line 741
    .line 742
    const/16 v10, 0x8

    .line 743
    .line 744
    invoke-direct {v7, v10}, LVa/ka;-><init>(I)V

    .line 745
    .line 746
    .line 747
    const-string v10, "measurement.test.boolean_flag"

    .line 748
    .line 749
    invoke-static {v10, v0, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 750
    .line 751
    .line 752
    move-result-object v7

    .line 753
    sput-object v7, LA7/y;->N:LA7/D;

    .line 754
    .line 755
    new-instance v7, Lm9/S;

    .line 756
    .line 757
    const/16 v10, 0x8

    .line 758
    .line 759
    invoke-direct {v7, v10}, Lm9/S;-><init>(I)V

    .line 760
    .line 761
    .line 762
    const-string v10, "measurement.test.string_flag"

    .line 763
    .line 764
    const-string v11, "---"

    .line 765
    .line 766
    invoke-static {v10, v11, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 767
    .line 768
    .line 769
    move-result-object v7

    .line 770
    sput-object v7, LA7/y;->O:LA7/D;

    .line 771
    .line 772
    const-wide/16 v10, -0x1

    .line 773
    .line 774
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 775
    .line 776
    .line 777
    move-result-object v7

    .line 778
    new-instance v12, Lc8/e;

    .line 779
    .line 780
    const/16 v13, 0x8

    .line 781
    .line 782
    invoke-direct {v12, v13}, Lc8/e;-><init>(I)V

    .line 783
    .line 784
    .line 785
    const-string v13, "measurement.test.long_flag"

    .line 786
    .line 787
    invoke-static {v13, v7, v12, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    sput-object v7, LA7/y;->P:LA7/D;

    .line 792
    .line 793
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 794
    .line 795
    .line 796
    move-result-object v7

    .line 797
    new-instance v10, Lwa/a;

    .line 798
    .line 799
    const/16 v11, 0x8

    .line 800
    .line 801
    invoke-direct {v10, v11}, Lwa/a;-><init>(I)V

    .line 802
    .line 803
    .line 804
    const-string v11, "measurement.test.cached_long_flag"

    .line 805
    .line 806
    const/4 v12, 0x1

    .line 807
    invoke-static {v11, v7, v10, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 808
    .line 809
    .line 810
    const/4 v7, -0x2

    .line 811
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 812
    .line 813
    .line 814
    move-result-object v7

    .line 815
    new-instance v10, Lya/b;

    .line 816
    .line 817
    const/16 v11, 0x8

    .line 818
    .line 819
    invoke-direct {v10, v11}, Lya/b;-><init>(I)V

    .line 820
    .line 821
    .line 822
    const-string v11, "measurement.test.int_flag"

    .line 823
    .line 824
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    sput-object v7, LA7/y;->Q:LA7/D;

    .line 829
    .line 830
    const-wide/high16 v10, -0x3ff8000000000000L    # -3.0

    .line 831
    .line 832
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 833
    .line 834
    .line 835
    move-result-object v7

    .line 836
    new-instance v10, LVa/ka;

    .line 837
    .line 838
    const/16 v11, 0x9

    .line 839
    .line 840
    invoke-direct {v10, v11}, LVa/ka;-><init>(I)V

    .line 841
    .line 842
    .line 843
    const-string v11, "measurement.test.double_flag"

    .line 844
    .line 845
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 846
    .line 847
    .line 848
    move-result-object v7

    .line 849
    sput-object v7, LA7/y;->R:LA7/D;

    .line 850
    .line 851
    const/16 v7, 0x32

    .line 852
    .line 853
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v7

    .line 857
    new-instance v10, Lza/a;

    .line 858
    .line 859
    const/16 v11, 0x8

    .line 860
    .line 861
    invoke-direct {v10, v11}, Lza/a;-><init>(I)V

    .line 862
    .line 863
    .line 864
    const-string v11, "measurement.experiment.max_ids"

    .line 865
    .line 866
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 867
    .line 868
    .line 869
    move-result-object v7

    .line 870
    sput-object v7, LA7/y;->S:LA7/D;

    .line 871
    .line 872
    const/16 v7, 0x1b

    .line 873
    .line 874
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    new-instance v10, Lc8/e;

    .line 879
    .line 880
    const/16 v11, 0x9

    .line 881
    .line 882
    invoke-direct {v10, v11}, Lc8/e;-><init>(I)V

    .line 883
    .line 884
    .line 885
    const-string v11, "measurement.upload.max_item_scoped_custom_parameters"

    .line 886
    .line 887
    invoke-static {v11, v7, v10, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 888
    .line 889
    .line 890
    move-result-object v7

    .line 891
    sput-object v7, LA7/y;->T:LA7/D;

    .line 892
    .line 893
    const/16 v7, 0x1f4

    .line 894
    .line 895
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v7

    .line 899
    new-instance v10, LXd/c;

    .line 900
    .line 901
    const/16 v11, 0x9

    .line 902
    .line 903
    invoke-direct {v10, v11}, LXd/c;-><init>(I)V

    .line 904
    .line 905
    .line 906
    const-string v11, "measurement.upload.max_event_parameter_value_length"

    .line 907
    .line 908
    invoke-static {v11, v7, v10, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 909
    .line 910
    .line 911
    move-result-object v7

    .line 912
    sput-object v7, LA7/y;->U:LA7/D;

    .line 913
    .line 914
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 915
    .line 916
    .line 917
    move-result-object v6

    .line 918
    new-instance v7, Lwa/a;

    .line 919
    .line 920
    const/16 v10, 0x9

    .line 921
    .line 922
    invoke-direct {v7, v10}, Lwa/a;-><init>(I)V

    .line 923
    .line 924
    .line 925
    const-string v10, "measurement.max_bundles_per_iteration"

    .line 926
    .line 927
    invoke-static {v10, v6, v7, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    sput-object v6, LA7/y;->V:LA7/D;

    .line 932
    .line 933
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 934
    .line 935
    .line 936
    move-result-object v4

    .line 937
    new-instance v5, Lm9/S;

    .line 938
    .line 939
    const/16 v6, 0x9

    .line 940
    .line 941
    invoke-direct {v5, v6}, Lm9/S;-><init>(I)V

    .line 942
    .line 943
    .line 944
    const-string v6, "measurement.sdk.attribution.cache.ttl"

    .line 945
    .line 946
    invoke-static {v6, v4, v5, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 947
    .line 948
    .line 949
    move-result-object v4

    .line 950
    sput-object v4, LA7/y;->W:LA7/D;

    .line 951
    .line 952
    const-wide/32 v4, 0x6ddd00

    .line 953
    .line 954
    .line 955
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 956
    .line 957
    .line 958
    move-result-object v4

    .line 959
    new-instance v5, Lx9/d;

    .line 960
    .line 961
    const/16 v6, 0x9

    .line 962
    .line 963
    invoke-direct {v5, v6}, Lx9/d;-><init>(I)V

    .line 964
    .line 965
    .line 966
    const-string v6, "measurement.redaction.app_instance_id.ttl"

    .line 967
    .line 968
    invoke-static {v6, v4, v5, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 969
    .line 970
    .line 971
    move-result-object v4

    .line 972
    sput-object v4, LA7/y;->X:LA7/D;

    .line 973
    .line 974
    const/4 v4, 0x7

    .line 975
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    new-instance v5, Lza/a;

    .line 980
    .line 981
    const/16 v6, 0x9

    .line 982
    .line 983
    invoke-direct {v5, v6}, Lza/a;-><init>(I)V

    .line 984
    .line 985
    .line 986
    const-string v6, "measurement.rb.attribution.client.min_ad_services_version"

    .line 987
    .line 988
    invoke-static {v6, v4, v5, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 989
    .line 990
    .line 991
    move-result-object v4

    .line 992
    sput-object v4, LA7/y;->Y:LA7/D;

    .line 993
    .line 994
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 995
    .line 996
    .line 997
    move-result-object v4

    .line 998
    new-instance v5, Lya/b;

    .line 999
    .line 1000
    const/16 v6, 0x9

    .line 1001
    .line 1002
    invoke-direct {v5, v6}, Lya/b;-><init>(I)V

    .line 1003
    .line 1004
    .line 1005
    const-string v6, "measurement.dma_consent.max_daily_dcu_realtime_events"

    .line 1006
    .line 1007
    invoke-static {v6, v4, v5, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    sput-object v4, LA7/y;->Z:LA7/D;

    .line 1012
    .line 1013
    new-instance v4, LXd/c;

    .line 1014
    .line 1015
    const/16 v5, 0xa

    .line 1016
    .line 1017
    invoke-direct {v4, v5}, LXd/c;-><init>(I)V

    .line 1018
    .line 1019
    .line 1020
    const-string v5, "measurement.rb.attribution.uri_scheme"

    .line 1021
    .line 1022
    invoke-static {v5, v8, v4, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v4

    .line 1026
    sput-object v4, LA7/y;->a0:LA7/D;

    .line 1027
    .line 1028
    new-instance v4, Lm9/S;

    .line 1029
    .line 1030
    const/16 v5, 0xa

    .line 1031
    .line 1032
    invoke-direct {v4, v5}, Lm9/S;-><init>(I)V

    .line 1033
    .line 1034
    .line 1035
    const-string v5, "measurement.rb.attribution.uri_authority"

    .line 1036
    .line 1037
    const-string v6, "google-analytics.com"

    .line 1038
    .line 1039
    invoke-static {v5, v6, v4, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v4

    .line 1043
    sput-object v4, LA7/y;->b0:LA7/D;

    .line 1044
    .line 1045
    new-instance v4, Lc8/e;

    .line 1046
    .line 1047
    const/16 v5, 0xa

    .line 1048
    .line 1049
    invoke-direct {v4, v5}, Lc8/e;-><init>(I)V

    .line 1050
    .line 1051
    .line 1052
    const-string v5, "measurement.rb.attribution.uri_path"

    .line 1053
    .line 1054
    const-string v6, "privacy-sandbox/register-app-conversion"

    .line 1055
    .line 1056
    invoke-static {v5, v6, v4, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v4

    .line 1060
    sput-object v4, LA7/y;->c0:LA7/D;

    .line 1061
    .line 1062
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    new-instance v2, Lx4/d;

    .line 1067
    .line 1068
    const/16 v4, 0xa

    .line 1069
    .line 1070
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1071
    .line 1072
    .line 1073
    const-string v4, "measurement.session.engagement_interval"

    .line 1074
    .line 1075
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v1

    .line 1079
    sput-object v1, LA7/y;->d0:LA7/D;

    .line 1080
    .line 1081
    new-instance v1, Lwa/a;

    .line 1082
    .line 1083
    const/16 v2, 0xa

    .line 1084
    .line 1085
    invoke-direct {v1, v2}, Lwa/a;-><init>(I)V

    .line 1086
    .line 1087
    .line 1088
    const-string v2, "measurement.rb.attribution.app_allowlist"

    .line 1089
    .line 1090
    const-string v4, "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword"

    .line 1091
    .line 1092
    invoke-static {v2, v4, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    sput-object v1, LA7/y;->e0:LA7/D;

    .line 1097
    .line 1098
    new-instance v1, Lya/b;

    .line 1099
    .line 1100
    const/16 v2, 0xa

    .line 1101
    .line 1102
    invoke-direct {v1, v2}, Lya/b;-><init>(I)V

    .line 1103
    .line 1104
    .line 1105
    const-string v2, "measurement.rb.attribution.user_properties"

    .line 1106
    .line 1107
    const-string v4, "_npa,npa|_fot,fot"

    .line 1108
    .line 1109
    invoke-static {v2, v4, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    sput-object v1, LA7/y;->f0:LA7/D;

    .line 1114
    .line 1115
    new-instance v1, Lx9/d;

    .line 1116
    .line 1117
    const/16 v2, 0xa

    .line 1118
    .line 1119
    invoke-direct {v1, v2}, Lx9/d;-><init>(I)V

    .line 1120
    .line 1121
    .line 1122
    const-string v2, "measurement.rb.attribution.event_params"

    .line 1123
    .line 1124
    const-string v4, "value|currency"

    .line 1125
    .line 1126
    invoke-static {v2, v4, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    sput-object v1, LA7/y;->g0:LA7/D;

    .line 1131
    .line 1132
    new-instance v1, Lza/a;

    .line 1133
    .line 1134
    const/16 v2, 0xa

    .line 1135
    .line 1136
    invoke-direct {v1, v2}, Lza/a;-><init>(I)V

    .line 1137
    .line 1138
    .line 1139
    const-string v2, "measurement.rb.attribution.query_parameters_to_remove"

    .line 1140
    .line 1141
    const-string v4, ""

    .line 1142
    .line 1143
    invoke-static {v2, v4, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    sput-object v1, LA7/y;->h0:LA7/D;

    .line 1148
    .line 1149
    const-wide/32 v1, 0x48190800

    .line 1150
    .line 1151
    .line 1152
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v1

    .line 1156
    new-instance v2, Lc8/e;

    .line 1157
    .line 1158
    const/16 v4, 0xb

    .line 1159
    .line 1160
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1161
    .line 1162
    .line 1163
    const-string v4, "measurement.rb.attribution.max_queue_time"

    .line 1164
    .line 1165
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    sput-object v1, LA7/y;->i0:LA7/D;

    .line 1170
    .line 1171
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    new-instance v2, LXd/c;

    .line 1176
    .line 1177
    const/16 v4, 0xb

    .line 1178
    .line 1179
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1180
    .line 1181
    .line 1182
    const-string v4, "measurement.rb.attribution.max_trigger_uris_queried_at_once"

    .line 1183
    .line 1184
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1185
    .line 1186
    .line 1187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    new-instance v2, Lwa/a;

    .line 1192
    .line 1193
    const/16 v4, 0xb

    .line 1194
    .line 1195
    invoke-direct {v2, v4}, Lwa/a;-><init>(I)V

    .line 1196
    .line 1197
    .line 1198
    const-string v4, "measurement.rb.max_trigger_registrations_per_day"

    .line 1199
    .line 1200
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    sput-object v1, LA7/y;->j0:LA7/D;

    .line 1205
    .line 1206
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1207
    .line 1208
    new-instance v2, Lx9/d;

    .line 1209
    .line 1210
    const/16 v4, 0xb

    .line 1211
    .line 1212
    invoke-direct {v2, v4}, Lx9/d;-><init>(I)V

    .line 1213
    .line 1214
    .line 1215
    const-string v4, "measurement.config.bundle_for_all_apps_on_backgrounded"

    .line 1216
    .line 1217
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    sput-object v2, LA7/y;->k0:LA7/D;

    .line 1222
    .line 1223
    new-instance v2, Lx4/d;

    .line 1224
    .line 1225
    const/16 v4, 0xb

    .line 1226
    .line 1227
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1228
    .line 1229
    .line 1230
    const-string v4, "measurement.config.notify_trigger_uris_on_backgrounded"

    .line 1231
    .line 1232
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    sput-object v2, LA7/y;->l0:LA7/D;

    .line 1237
    .line 1238
    new-instance v2, Lza/a;

    .line 1239
    .line 1240
    const/16 v4, 0xb

    .line 1241
    .line 1242
    invoke-direct {v2, v4}, Lza/a;-><init>(I)V

    .line 1243
    .line 1244
    .line 1245
    const-string v4, "measurement.collection.log_event_and_bundle_v2"

    .line 1246
    .line 1247
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1248
    .line 1249
    .line 1250
    const-string v2, "measurement.quality.checksum"

    .line 1251
    .line 1252
    invoke-static {v2, v0, v9, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    sput-object v2, LA7/y;->m0:LA7/D;

    .line 1257
    .line 1258
    new-instance v2, Lya/b;

    .line 1259
    .line 1260
    const/16 v4, 0xb

    .line 1261
    .line 1262
    invoke-direct {v2, v4}, Lya/b;-><init>(I)V

    .line 1263
    .line 1264
    .line 1265
    const-string v4, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    .line 1266
    .line 1267
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v2

    .line 1271
    sput-object v2, LA7/y;->n0:LA7/D;

    .line 1272
    .line 1273
    new-instance v2, LXd/c;

    .line 1274
    .line 1275
    const/16 v4, 0xc

    .line 1276
    .line 1277
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1278
    .line 1279
    .line 1280
    const-string v4, "measurement.audience.refresh_event_count_filters_timestamp"

    .line 1281
    .line 1282
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v2

    .line 1286
    sput-object v2, LA7/y;->o0:LA7/D;

    .line 1287
    .line 1288
    new-instance v2, Lm9/S;

    .line 1289
    .line 1290
    const/16 v4, 0xc

    .line 1291
    .line 1292
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1293
    .line 1294
    .line 1295
    const-string v4, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    .line 1296
    .line 1297
    invoke-static {v4, v0, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    sput-object v2, LA7/y;->p0:LA7/D;

    .line 1302
    .line 1303
    new-instance v2, Lc8/e;

    .line 1304
    .line 1305
    const/16 v4, 0xc

    .line 1306
    .line 1307
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1308
    .line 1309
    .line 1310
    const-string v4, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    .line 1311
    .line 1312
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    sput-object v2, LA7/y;->q0:LA7/D;

    .line 1317
    .line 1318
    new-instance v2, Lx4/d;

    .line 1319
    .line 1320
    const/16 v4, 0xc

    .line 1321
    .line 1322
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1323
    .line 1324
    .line 1325
    const-string v4, "measurement.integration.disable_firebase_instance_id"

    .line 1326
    .line 1327
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    sput-object v2, LA7/y;->r0:LA7/D;

    .line 1332
    .line 1333
    new-instance v2, Lwa/a;

    .line 1334
    .line 1335
    const/16 v4, 0xc

    .line 1336
    .line 1337
    invoke-direct {v2, v4}, Lwa/a;-><init>(I)V

    .line 1338
    .line 1339
    .line 1340
    const-string v4, "measurement.collection.service.update_with_analytics_fix"

    .line 1341
    .line 1342
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v2

    .line 1346
    sput-object v2, LA7/y;->s0:LA7/D;

    .line 1347
    .line 1348
    const v2, 0x31b50

    .line 1349
    .line 1350
    .line 1351
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v2

    .line 1355
    new-instance v4, Lya/b;

    .line 1356
    .line 1357
    const/16 v5, 0xc

    .line 1358
    .line 1359
    invoke-direct {v4, v5}, Lya/b;-><init>(I)V

    .line 1360
    .line 1361
    .line 1362
    const-string v5, "measurement.service.storage_consent_support_version"

    .line 1363
    .line 1364
    invoke-static {v5, v2, v4, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    sput-object v2, LA7/y;->t0:LA7/D;

    .line 1369
    .line 1370
    new-instance v2, LVa/ka;

    .line 1371
    .line 1372
    const/16 v4, 0xd

    .line 1373
    .line 1374
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1375
    .line 1376
    .line 1377
    const-string v4, "measurement.service.store_null_safelist"

    .line 1378
    .line 1379
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    sput-object v2, LA7/y;->u0:LA7/D;

    .line 1384
    .line 1385
    new-instance v2, Lza/a;

    .line 1386
    .line 1387
    const/16 v4, 0xc

    .line 1388
    .line 1389
    invoke-direct {v2, v4}, Lza/a;-><init>(I)V

    .line 1390
    .line 1391
    .line 1392
    const-string v4, "measurement.service.store_safelist"

    .line 1393
    .line 1394
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    sput-object v2, LA7/y;->v0:LA7/D;

    .line 1399
    .line 1400
    new-instance v2, Lc8/e;

    .line 1401
    .line 1402
    const/16 v4, 0xd

    .line 1403
    .line 1404
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1405
    .line 1406
    .line 1407
    const-string v4, "measurement.session_stitching_token_enabled"

    .line 1408
    .line 1409
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v2

    .line 1413
    sput-object v2, LA7/y;->w0:LA7/D;

    .line 1414
    .line 1415
    new-instance v2, LXd/c;

    .line 1416
    .line 1417
    const/16 v4, 0xd

    .line 1418
    .line 1419
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1420
    .line 1421
    .line 1422
    const-string v4, "measurement.sgtm.service"

    .line 1423
    .line 1424
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v2

    .line 1428
    sput-object v2, LA7/y;->x0:LA7/D;

    .line 1429
    .line 1430
    new-instance v2, Lm9/S;

    .line 1431
    .line 1432
    const/16 v4, 0xd

    .line 1433
    .line 1434
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1435
    .line 1436
    .line 1437
    const-string v4, "measurement.sgtm.preview_mode_enabled"

    .line 1438
    .line 1439
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    sput-object v2, LA7/y;->y0:LA7/D;

    .line 1444
    .line 1445
    new-instance v2, Lx9/d;

    .line 1446
    .line 1447
    const/16 v4, 0xd

    .line 1448
    .line 1449
    invoke-direct {v2, v4}, Lx9/d;-><init>(I)V

    .line 1450
    .line 1451
    .line 1452
    const-string v4, "measurement.sgtm.rollout_percentage_fix"

    .line 1453
    .line 1454
    invoke-static {v4, v0, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    sput-object v2, LA7/y;->z0:LA7/D;

    .line 1459
    .line 1460
    new-instance v2, Lx4/d;

    .line 1461
    .line 1462
    const/16 v4, 0xd

    .line 1463
    .line 1464
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1465
    .line 1466
    .line 1467
    const-string v4, "measurement.sgtm.app_allowlist"

    .line 1468
    .line 1469
    const-string v5, "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa"

    .line 1470
    .line 1471
    invoke-static {v4, v5, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v2

    .line 1475
    sput-object v2, LA7/y;->A0:LA7/D;

    .line 1476
    .line 1477
    new-instance v2, Lza/a;

    .line 1478
    .line 1479
    const/16 v4, 0xd

    .line 1480
    .line 1481
    invoke-direct {v2, v4}, Lza/a;-><init>(I)V

    .line 1482
    .line 1483
    .line 1484
    const-string v4, "measurement.sgtm.upload_queue"

    .line 1485
    .line 1486
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v2

    .line 1490
    sput-object v2, LA7/y;->B0:LA7/D;

    .line 1491
    .line 1492
    new-instance v2, Lya/b;

    .line 1493
    .line 1494
    const/16 v4, 0xd

    .line 1495
    .line 1496
    invoke-direct {v2, v4}, Lya/b;-><init>(I)V

    .line 1497
    .line 1498
    .line 1499
    const-string v4, "measurement.sgtm.google_signal.enable"

    .line 1500
    .line 1501
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v2

    .line 1505
    sput-object v2, LA7/y;->C0:LA7/D;

    .line 1506
    .line 1507
    new-instance v2, LXd/c;

    .line 1508
    .line 1509
    const/16 v4, 0xe

    .line 1510
    .line 1511
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1512
    .line 1513
    .line 1514
    const-string v4, "measurement.gmscore_feature_tracking"

    .line 1515
    .line 1516
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v2

    .line 1520
    sput-object v2, LA7/y;->D0:LA7/D;

    .line 1521
    .line 1522
    new-instance v2, Lm9/S;

    .line 1523
    .line 1524
    const/16 v4, 0xe

    .line 1525
    .line 1526
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1527
    .line 1528
    .line 1529
    const-string v4, "measurement.gmscore_client_telemetry"

    .line 1530
    .line 1531
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v2

    .line 1535
    sput-object v2, LA7/y;->E0:LA7/D;

    .line 1536
    .line 1537
    new-instance v2, Lc8/e;

    .line 1538
    .line 1539
    const/16 v4, 0xe

    .line 1540
    .line 1541
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1542
    .line 1543
    .line 1544
    const-string v4, "measurement.gmscore_network_migration"

    .line 1545
    .line 1546
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    sput-object v0, LA7/y;->F0:LA7/D;

    .line 1551
    .line 1552
    new-instance v0, Lwa/a;

    .line 1553
    .line 1554
    const/16 v2, 0xe

    .line 1555
    .line 1556
    invoke-direct {v0, v2}, Lwa/a;-><init>(I)V

    .line 1557
    .line 1558
    .line 1559
    const-string v2, "measurement.fix_health_monitor_stack_trace"

    .line 1560
    .line 1561
    invoke-static {v2, v1, v0, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v0

    .line 1565
    sput-object v0, LA7/y;->G0:LA7/D;

    .line 1566
    .line 1567
    new-instance v0, Lx4/d;

    .line 1568
    .line 1569
    const/4 v2, 0x1

    .line 1570
    invoke-direct {v0, v2}, Lx4/d;-><init>(I)V

    .line 1571
    .line 1572
    .line 1573
    const-string v2, "measurement.rb.attribution.service"

    .line 1574
    .line 1575
    invoke-static {v2, v1, v0, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    sput-object v0, LA7/y;->H0:LA7/D;

    .line 1580
    .line 1581
    new-instance v0, Lza/a;

    .line 1582
    .line 1583
    const/4 v2, 0x1

    .line 1584
    invoke-direct {v0, v2}, Lza/a;-><init>(I)V

    .line 1585
    .line 1586
    .line 1587
    const-string v2, "measurement.rb.attribution.client2"

    .line 1588
    .line 1589
    invoke-static {v2, v1, v0, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    sput-object v0, LA7/y;->I0:LA7/D;

    .line 1594
    .line 1595
    new-instance v0, Lya/b;

    .line 1596
    .line 1597
    const/4 v2, 0x1

    .line 1598
    invoke-direct {v0, v2}, Lya/b;-><init>(I)V

    .line 1599
    .line 1600
    .line 1601
    const-string v2, "measurement.rb.attribution.uuid_generation"

    .line 1602
    .line 1603
    invoke-static {v2, v1, v0, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    sput-object v0, LA7/y;->J0:LA7/D;

    .line 1608
    .line 1609
    new-instance v0, LXd/c;

    .line 1610
    .line 1611
    const/4 v2, 0x2

    .line 1612
    invoke-direct {v0, v2}, LXd/c;-><init>(I)V

    .line 1613
    .line 1614
    .line 1615
    const-string v2, "measurement.rb.attribution.enable_trigger_redaction"

    .line 1616
    .line 1617
    invoke-static {v2, v1, v0, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    sput-object v0, LA7/y;->K0:LA7/D;

    .line 1622
    .line 1623
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1624
    .line 1625
    new-instance v2, LVa/ka;

    .line 1626
    .line 1627
    const/4 v4, 0x2

    .line 1628
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1629
    .line 1630
    .line 1631
    const-string v4, "measurement.rb.attribution.followup1.service"

    .line 1632
    .line 1633
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1634
    .line 1635
    .line 1636
    new-instance v2, Lm9/S;

    .line 1637
    .line 1638
    const/4 v4, 0x2

    .line 1639
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1640
    .line 1641
    .line 1642
    const-string v4, "measurement.rb.attribution.retry_disposition"

    .line 1643
    .line 1644
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v2

    .line 1648
    sput-object v2, LA7/y;->L0:LA7/D;

    .line 1649
    .line 1650
    new-instance v2, Lc8/e;

    .line 1651
    .line 1652
    const/4 v4, 0x2

    .line 1653
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1654
    .line 1655
    .line 1656
    const-string v4, "measurement.rb.attribution.ad_campaign_info"

    .line 1657
    .line 1658
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v2

    .line 1662
    sput-object v2, LA7/y;->M0:LA7/D;

    .line 1663
    .line 1664
    new-instance v2, Lwa/a;

    .line 1665
    .line 1666
    const/4 v4, 0x2

    .line 1667
    invoke-direct {v2, v4}, Lwa/a;-><init>(I)V

    .line 1668
    .line 1669
    .line 1670
    const-string v4, "measurement.rb.attribution.improved_retry"

    .line 1671
    .line 1672
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v2

    .line 1676
    sput-object v2, LA7/y;->N0:LA7/D;

    .line 1677
    .line 1678
    new-instance v2, Lya/b;

    .line 1679
    .line 1680
    const/4 v4, 0x2

    .line 1681
    invoke-direct {v2, v4}, Lya/b;-><init>(I)V

    .line 1682
    .line 1683
    .line 1684
    const-string v4, "measurement.client.sessions.enable_fix_background_engagement"

    .line 1685
    .line 1686
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v2

    .line 1690
    sput-object v2, LA7/y;->O0:LA7/D;

    .line 1691
    .line 1692
    new-instance v2, LVa/ka;

    .line 1693
    .line 1694
    const/4 v4, 0x3

    .line 1695
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1696
    .line 1697
    .line 1698
    const-string v4, "measurement.client.sessions.enable_pause_engagement_in_background"

    .line 1699
    .line 1700
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v2

    .line 1704
    sput-object v2, LA7/y;->P0:LA7/D;

    .line 1705
    .line 1706
    new-instance v2, Lza/a;

    .line 1707
    .line 1708
    const/4 v4, 0x2

    .line 1709
    invoke-direct {v2, v4}, Lza/a;-><init>(I)V

    .line 1710
    .line 1711
    .line 1712
    const-string v4, "measurement.dma_consent.service_dcu_event2"

    .line 1713
    .line 1714
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v2

    .line 1718
    sput-object v2, LA7/y;->Q0:LA7/D;

    .line 1719
    .line 1720
    new-instance v2, Lc8/e;

    .line 1721
    .line 1722
    const/4 v4, 0x3

    .line 1723
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1724
    .line 1725
    .line 1726
    const-string v4, "measurement.dma_consent.services_database_update_fix"

    .line 1727
    .line 1728
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v2

    .line 1732
    sput-object v2, LA7/y;->R0:LA7/D;

    .line 1733
    .line 1734
    new-instance v2, LXd/c;

    .line 1735
    .line 1736
    const/4 v4, 0x3

    .line 1737
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1738
    .line 1739
    .line 1740
    const-string v4, "measurement.dma_consent.setting_npa_inline_fix"

    .line 1741
    .line 1742
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    sput-object v2, LA7/y;->S0:LA7/D;

    .line 1747
    .line 1748
    new-instance v2, Lwa/a;

    .line 1749
    .line 1750
    const/4 v4, 0x3

    .line 1751
    invoke-direct {v2, v4}, Lwa/a;-><init>(I)V

    .line 1752
    .line 1753
    .line 1754
    const-string v4, "measurement.gbraid_campaign.gbraid.client"

    .line 1755
    .line 1756
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v2

    .line 1760
    sput-object v2, LA7/y;->T0:LA7/D;

    .line 1761
    .line 1762
    new-instance v2, Lm9/S;

    .line 1763
    .line 1764
    const/4 v4, 0x3

    .line 1765
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1766
    .line 1767
    .line 1768
    const-string v4, "measurement.gbraid_campaign.gbraid.service"

    .line 1769
    .line 1770
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v2

    .line 1774
    sput-object v2, LA7/y;->U0:LA7/D;

    .line 1775
    .line 1776
    new-instance v2, Lx9/d;

    .line 1777
    .line 1778
    const/4 v4, 0x3

    .line 1779
    invoke-direct {v2, v4}, Lx9/d;-><init>(I)V

    .line 1780
    .line 1781
    .line 1782
    const-string v4, "measurement.service.consent.pfo_on_fx"

    .line 1783
    .line 1784
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v2

    .line 1788
    sput-object v2, LA7/y;->V0:LA7/D;

    .line 1789
    .line 1790
    new-instance v2, Lx4/d;

    .line 1791
    .line 1792
    const/4 v4, 0x3

    .line 1793
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1794
    .line 1795
    .line 1796
    const-string v4, "measurement.service.consent.params_on_fx"

    .line 1797
    .line 1798
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v2

    .line 1802
    sput-object v2, LA7/y;->W0:LA7/D;

    .line 1803
    .line 1804
    new-instance v2, Lx9/d;

    .line 1805
    .line 1806
    const/4 v4, 0x4

    .line 1807
    invoke-direct {v2, v4}, Lx9/d;-><init>(I)V

    .line 1808
    .line 1809
    .line 1810
    const-string v4, "measurement.consent.stop_reset_on_storage_denied.client"

    .line 1811
    .line 1812
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v2

    .line 1816
    sput-object v2, LA7/y;->X0:LA7/D;

    .line 1817
    .line 1818
    new-instance v2, LXd/c;

    .line 1819
    .line 1820
    const/4 v4, 0x6

    .line 1821
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1822
    .line 1823
    .line 1824
    const-string v4, "measurement.consent.stop_reset_on_storage_denied.service"

    .line 1825
    .line 1826
    invoke-static {v4, v1, v2, v12}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v2

    .line 1830
    sput-object v2, LA7/y;->Y0:LA7/D;

    .line 1831
    .line 1832
    new-instance v2, LXd/c;

    .line 1833
    .line 1834
    const/4 v4, 0x7

    .line 1835
    invoke-direct {v2, v4}, LXd/c;-><init>(I)V

    .line 1836
    .line 1837
    .line 1838
    const-string v4, "measurement.consent.scrub_audience_data_analytics_consent"

    .line 1839
    .line 1840
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v2

    .line 1844
    sput-object v2, LA7/y;->Z0:LA7/D;

    .line 1845
    .line 1846
    new-instance v2, Lx4/d;

    .line 1847
    .line 1848
    const/16 v4, 0x8

    .line 1849
    .line 1850
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1851
    .line 1852
    .line 1853
    const-string v4, "measurement.consent.fix_first_open_count_from_snapshot"

    .line 1854
    .line 1855
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    sput-object v2, LA7/y;->a1:LA7/D;

    .line 1860
    .line 1861
    new-instance v2, Lx4/d;

    .line 1862
    .line 1863
    const/16 v4, 0x9

    .line 1864
    .line 1865
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 1866
    .line 1867
    .line 1868
    const-string v4, "measurement.fix_engagement_on_reset_analytics_data"

    .line 1869
    .line 1870
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v2

    .line 1874
    sput-object v2, LA7/y;->b1:LA7/D;

    .line 1875
    .line 1876
    new-instance v2, LVa/ka;

    .line 1877
    .line 1878
    const/16 v4, 0xb

    .line 1879
    .line 1880
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1881
    .line 1882
    .line 1883
    const-string v4, "measurement.rb.attribution.service.bundle_on_backgrounded"

    .line 1884
    .line 1885
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v2

    .line 1889
    sput-object v2, LA7/y;->c1:LA7/D;

    .line 1890
    .line 1891
    new-instance v2, LVa/ka;

    .line 1892
    .line 1893
    const/16 v4, 0xc

    .line 1894
    .line 1895
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1896
    .line 1897
    .line 1898
    const-string v4, "measurement.rb.attribution.client.bundle_on_backgrounded"

    .line 1899
    .line 1900
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v1

    .line 1904
    sput-object v1, LA7/y;->d1:LA7/D;

    .line 1905
    .line 1906
    new-instance v1, Lwa/a;

    .line 1907
    .line 1908
    const/16 v2, 0xd

    .line 1909
    .line 1910
    invoke-direct {v1, v2}, Lwa/a;-><init>(I)V

    .line 1911
    .line 1912
    .line 1913
    const-string v2, "measurement.set_default_event_parameters_propagate_clear.service.dev"

    .line 1914
    .line 1915
    invoke-static {v2, v0, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v1

    .line 1919
    sput-object v1, LA7/y;->e1:LA7/D;

    .line 1920
    .line 1921
    new-instance v1, Lx9/d;

    .line 1922
    .line 1923
    const/4 v2, 0x1

    .line 1924
    invoke-direct {v1, v2}, Lx9/d;-><init>(I)V

    .line 1925
    .line 1926
    .line 1927
    const-string v2, "measurement.set_default_event_parameters_propagate_clear.client.dev"

    .line 1928
    .line 1929
    invoke-static {v2, v0, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v1

    .line 1933
    sput-object v1, LA7/y;->f1:LA7/D;

    .line 1934
    .line 1935
    new-instance v1, Lx9/d;

    .line 1936
    .line 1937
    const/4 v2, 0x2

    .line 1938
    invoke-direct {v1, v2}, Lx9/d;-><init>(I)V

    .line 1939
    .line 1940
    .line 1941
    const-string v2, "measurement.set_default_event_parameters_with_backfill.service"

    .line 1942
    .line 1943
    invoke-static {v2, v0, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v1

    .line 1947
    sput-object v1, LA7/y;->g1:LA7/D;

    .line 1948
    .line 1949
    new-instance v1, LXd/c;

    .line 1950
    .line 1951
    const/4 v2, 0x4

    .line 1952
    invoke-direct {v1, v2}, LXd/c;-><init>(I)V

    .line 1953
    .line 1954
    .line 1955
    const-string v2, "measurement.set_default_event_parameters_with_backfill.client.dev"

    .line 1956
    .line 1957
    invoke-static {v2, v0, v1, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1958
    .line 1959
    .line 1960
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1961
    .line 1962
    new-instance v2, LVa/ka;

    .line 1963
    .line 1964
    const/4 v4, 0x4

    .line 1965
    invoke-direct {v2, v4}, LVa/ka;-><init>(I)V

    .line 1966
    .line 1967
    .line 1968
    const-string v4, "measurement.defensively_copy_bundles_validate_default_params"

    .line 1969
    .line 1970
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v2

    .line 1974
    sput-object v2, LA7/y;->h1:LA7/D;

    .line 1975
    .line 1976
    new-instance v2, Lm9/S;

    .line 1977
    .line 1978
    const/4 v4, 0x4

    .line 1979
    invoke-direct {v2, v4}, Lm9/S;-><init>(I)V

    .line 1980
    .line 1981
    .line 1982
    const-string v4, "measurement.fix_origin_in_upload_utils.service"

    .line 1983
    .line 1984
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v2

    .line 1988
    sput-object v2, LA7/y;->i1:LA7/D;

    .line 1989
    .line 1990
    new-instance v2, Lc8/e;

    .line 1991
    .line 1992
    const/4 v4, 0x4

    .line 1993
    invoke-direct {v2, v4}, Lc8/e;-><init>(I)V

    .line 1994
    .line 1995
    .line 1996
    const-string v4, "measurement.chimera.parameter.service"

    .line 1997
    .line 1998
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 1999
    .line 2000
    .line 2001
    new-instance v2, Lx4/d;

    .line 2002
    .line 2003
    const/4 v4, 0x4

    .line 2004
    invoke-direct {v2, v4}, Lx4/d;-><init>(I)V

    .line 2005
    .line 2006
    .line 2007
    const-string v4, "measurement.service.ad_impression.convert_value_to_double"

    .line 2008
    .line 2009
    invoke-static {v4, v1, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v2

    .line 2013
    sput-object v2, LA7/y;->j1:LA7/D;

    .line 2014
    .line 2015
    new-instance v2, Lwa/a;

    .line 2016
    .line 2017
    const/4 v4, 0x4

    .line 2018
    invoke-direct {v2, v4}, Lwa/a;-><init>(I)V

    .line 2019
    .line 2020
    .line 2021
    const-string v4, "measurement.persisted_config_defensive_copies"

    .line 2022
    .line 2023
    invoke-static {v4, v0, v2, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    sput-object v0, LA7/y;->k1:LA7/D;

    .line 2028
    .line 2029
    new-instance v0, Lya/b;

    .line 2030
    .line 2031
    const/4 v2, 0x4

    .line 2032
    invoke-direct {v0, v2}, Lya/b;-><init>(I)V

    .line 2033
    .line 2034
    .line 2035
    const-string v2, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    .line 2036
    .line 2037
    invoke-static {v2, v1, v0, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 2038
    .line 2039
    .line 2040
    new-instance v0, LVa/ka;

    .line 2041
    .line 2042
    const/4 v2, 0x5

    .line 2043
    invoke-direct {v0, v2}, LVa/ka;-><init>(I)V

    .line 2044
    .line 2045
    .line 2046
    const-string v2, "measurement.currency.escape_underscore_fix"

    .line 2047
    .line 2048
    invoke-static {v2, v1, v0, v3}, LA7/y;->a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v0

    .line 2052
    sput-object v0, LA7/y;->l1:LA7/D;

    .line 2053
    .line 2054
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;LA7/C;Z)LA7/D;
    .locals 1

    .line 1
    new-instance v0, LA7/D;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LA7/D;-><init>(Ljava/lang/String;Ljava/lang/Object;LA7/C;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    sget-object p0, LA7/y;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
