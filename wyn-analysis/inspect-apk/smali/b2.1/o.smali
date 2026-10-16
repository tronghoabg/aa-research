.class public final Lb2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/o;


# static fields
.field public static final A:Ljava/util/regex/Pattern;

.field public static final B:Ljava/util/regex/Pattern;

.field public static final C:Ljava/util/regex/Pattern;

.field public static final D:Ljava/util/regex/Pattern;

.field public static final E:Ljava/util/regex/Pattern;

.field public static final F:Ljava/util/regex/Pattern;

.field public static final G:Ljava/util/regex/Pattern;

.field public static final H:Ljava/util/regex/Pattern;

.field public static final I:Ljava/util/regex/Pattern;

.field public static final J:Ljava/util/regex/Pattern;

.field public static final K:Ljava/util/regex/Pattern;

.field public static final L:Ljava/util/regex/Pattern;

.field public static final M:Ljava/util/regex/Pattern;

.field public static final N:Ljava/util/regex/Pattern;

.field public static final O:Ljava/util/regex/Pattern;

.field public static final P:Ljava/util/regex/Pattern;

.field public static final Q:Ljava/util/regex/Pattern;

.field public static final R:Ljava/util/regex/Pattern;

.field public static final S:Ljava/util/regex/Pattern;

.field public static final T:Ljava/util/regex/Pattern;

.field public static final U:Ljava/util/regex/Pattern;

.field public static final V:Ljava/util/regex/Pattern;

.field public static final W:Ljava/util/regex/Pattern;

.field public static final X:Ljava/util/regex/Pattern;

.field public static final Y:Ljava/util/regex/Pattern;

.field public static final Z:Ljava/util/regex/Pattern;

.field public static final a0:Ljava/util/regex/Pattern;

.field public static final b0:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/regex/Pattern;

.field public static final j:Ljava/util/regex/Pattern;

.field public static final k:Ljava/util/regex/Pattern;

.field public static final l:Ljava/util/regex/Pattern;

.field public static final m:Ljava/util/regex/Pattern;

.field public static final n:Ljava/util/regex/Pattern;

.field public static final o:Ljava/util/regex/Pattern;

.field public static final p:Ljava/util/regex/Pattern;

.field public static final q:Ljava/util/regex/Pattern;

.field public static final r:Ljava/util/regex/Pattern;

.field public static final s:Ljava/util/regex/Pattern;

.field public static final t:Ljava/util/regex/Pattern;

.field public static final u:Ljava/util/regex/Pattern;

.field public static final v:Ljava/util/regex/Pattern;

.field public static final w:Ljava/util/regex/Pattern;

.field public static final x:Ljava/util/regex/Pattern;

.field public static final y:Ljava/util/regex/Pattern;

.field public static final z:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Lb2/l;

.field public final b:Lb2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "AVERAGE-BANDWIDTH=(\\d+)\\b"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lb2/o;->c:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "VIDEO=\"(.+?)\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lb2/o;->d:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "AUDIO=\"(.+?)\""

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lb2/o;->e:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const-string v0, "SUBTITLES=\"(.+?)\""

    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lb2/o;->f:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    const-string v0, "CLOSED-CAPTIONS=\"(.+?)\""

    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lb2/o;->g:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    const-string v0, "[^-]BANDWIDTH=(\\d+)\\b"

    .line 42
    .line 43
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lb2/o;->h:Ljava/util/regex/Pattern;

    .line 48
    .line 49
    const-string v0, "CHANNELS=\"(.+?)\""

    .line 50
    .line 51
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lb2/o;->i:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-string v0, "CODECS=\"(.+?)\""

    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lb2/o;->j:Ljava/util/regex/Pattern;

    .line 64
    .line 65
    const-string v0, "RESOLUTION=(\\d+x\\d+)"

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lb2/o;->k:Ljava/util/regex/Pattern;

    .line 72
    .line 73
    const-string v0, "FRAME-RATE=([\\d\\.]+)\\b"

    .line 74
    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lb2/o;->l:Ljava/util/regex/Pattern;

    .line 80
    .line 81
    const-string v0, "#EXT-X-TARGETDURATION:(\\d+)\\b"

    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lb2/o;->m:Ljava/util/regex/Pattern;

    .line 88
    .line 89
    const-string v0, "DURATION=([\\d\\.]+)\\b"

    .line 90
    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lb2/o;->n:Ljava/util/regex/Pattern;

    .line 96
    .line 97
    const-string v0, "PART-TARGET=([\\d\\.]+)\\b"

    .line 98
    .line 99
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, Lb2/o;->o:Ljava/util/regex/Pattern;

    .line 104
    .line 105
    const-string v0, "#EXT-X-VERSION:(\\d+)\\b"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sput-object v0, Lb2/o;->p:Ljava/util/regex/Pattern;

    .line 112
    .line 113
    const-string v0, "#EXT-X-PLAYLIST-TYPE:(.+)\\b"

    .line 114
    .line 115
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lb2/o;->q:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    const-string v0, "CAN-SKIP-UNTIL=([\\d\\.]+)\\b"

    .line 122
    .line 123
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lb2/o;->r:Ljava/util/regex/Pattern;

    .line 128
    .line 129
    const-string v0, "CAN-SKIP-DATERANGES"

    .line 130
    .line 131
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lb2/o;->s:Ljava/util/regex/Pattern;

    .line 136
    .line 137
    const-string v0, "SKIPPED-SEGMENTS=(\\d+)\\b"

    .line 138
    .line 139
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lb2/o;->t:Ljava/util/regex/Pattern;

    .line 144
    .line 145
    const-string v0, "[:|,]HOLD-BACK=([\\d\\.]+)\\b"

    .line 146
    .line 147
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lb2/o;->u:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    const-string v0, "PART-HOLD-BACK=([\\d\\.]+)\\b"

    .line 154
    .line 155
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sput-object v0, Lb2/o;->v:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v0, "CAN-BLOCK-RELOAD"

    .line 162
    .line 163
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sput-object v0, Lb2/o;->w:Ljava/util/regex/Pattern;

    .line 168
    .line 169
    const-string v0, "#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b"

    .line 170
    .line 171
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lb2/o;->x:Ljava/util/regex/Pattern;

    .line 176
    .line 177
    const-string v0, "#EXTINF:([\\d\\.]+)\\b"

    .line 178
    .line 179
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lb2/o;->y:Ljava/util/regex/Pattern;

    .line 184
    .line 185
    const-string v0, "#EXTINF:[\\d\\.]+\\b,(.+)"

    .line 186
    .line 187
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lb2/o;->z:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    const-string v0, "LAST-MSN=(\\d+)\\b"

    .line 194
    .line 195
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lb2/o;->A:Ljava/util/regex/Pattern;

    .line 200
    .line 201
    const-string v0, "LAST-PART=(\\d+)\\b"

    .line 202
    .line 203
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lb2/o;->B:Ljava/util/regex/Pattern;

    .line 208
    .line 209
    const-string v0, "TIME-OFFSET=(-?[\\d\\.]+)\\b"

    .line 210
    .line 211
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lb2/o;->C:Ljava/util/regex/Pattern;

    .line 216
    .line 217
    const-string v0, "#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b"

    .line 218
    .line 219
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lb2/o;->D:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    const-string v0, "BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\""

    .line 226
    .line 227
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, Lb2/o;->E:Ljava/util/regex/Pattern;

    .line 232
    .line 233
    const-string v0, "BYTERANGE-START=(\\d+)\\b"

    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    sput-object v0, Lb2/o;->F:Ljava/util/regex/Pattern;

    .line 240
    .line 241
    const-string v0, "BYTERANGE-LENGTH=(\\d+)\\b"

    .line 242
    .line 243
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, Lb2/o;->G:Ljava/util/regex/Pattern;

    .line 248
    .line 249
    const-string v0, "METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)"

    .line 250
    .line 251
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sput-object v0, Lb2/o;->H:Ljava/util/regex/Pattern;

    .line 256
    .line 257
    const-string v0, "KEYFORMAT=\"(.+?)\""

    .line 258
    .line 259
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sput-object v0, Lb2/o;->I:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    const-string v0, "KEYFORMATVERSIONS=\"(.+?)\""

    .line 266
    .line 267
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    sput-object v0, Lb2/o;->J:Ljava/util/regex/Pattern;

    .line 272
    .line 273
    const-string v0, "URI=\"(.+?)\""

    .line 274
    .line 275
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sput-object v0, Lb2/o;->K:Ljava/util/regex/Pattern;

    .line 280
    .line 281
    const-string v0, "IV=([^,.*]+)"

    .line 282
    .line 283
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    sput-object v0, Lb2/o;->L:Ljava/util/regex/Pattern;

    .line 288
    .line 289
    const-string v0, "TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)"

    .line 290
    .line 291
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    sput-object v0, Lb2/o;->M:Ljava/util/regex/Pattern;

    .line 296
    .line 297
    const-string v0, "TYPE=(PART|MAP)"

    .line 298
    .line 299
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sput-object v0, Lb2/o;->N:Ljava/util/regex/Pattern;

    .line 304
    .line 305
    const-string v0, "LANGUAGE=\"(.+?)\""

    .line 306
    .line 307
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sput-object v0, Lb2/o;->O:Ljava/util/regex/Pattern;

    .line 312
    .line 313
    const-string v0, "NAME=\"(.+?)\""

    .line 314
    .line 315
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    sput-object v0, Lb2/o;->P:Ljava/util/regex/Pattern;

    .line 320
    .line 321
    const-string v0, "GROUP-ID=\"(.+?)\""

    .line 322
    .line 323
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sput-object v0, Lb2/o;->Q:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    const-string v0, "CHARACTERISTICS=\"(.+?)\""

    .line 330
    .line 331
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    sput-object v0, Lb2/o;->R:Ljava/util/regex/Pattern;

    .line 336
    .line 337
    const-string v0, "INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\""

    .line 338
    .line 339
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    sput-object v0, Lb2/o;->S:Ljava/util/regex/Pattern;

    .line 344
    .line 345
    const-string v0, "AUTOSELECT"

    .line 346
    .line 347
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sput-object v0, Lb2/o;->T:Ljava/util/regex/Pattern;

    .line 352
    .line 353
    const-string v0, "DEFAULT"

    .line 354
    .line 355
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    sput-object v0, Lb2/o;->U:Ljava/util/regex/Pattern;

    .line 360
    .line 361
    const-string v0, "FORCED"

    .line 362
    .line 363
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    sput-object v0, Lb2/o;->V:Ljava/util/regex/Pattern;

    .line 368
    .line 369
    const-string v0, "INDEPENDENT"

    .line 370
    .line 371
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    sput-object v0, Lb2/o;->W:Ljava/util/regex/Pattern;

    .line 376
    .line 377
    const-string v0, "GAP"

    .line 378
    .line 379
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Lb2/o;->X:Ljava/util/regex/Pattern;

    .line 384
    .line 385
    const-string v0, "PRECISE"

    .line 386
    .line 387
    invoke-static {v0}, Lb2/o;->a(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sput-object v0, Lb2/o;->Y:Ljava/util/regex/Pattern;

    .line 392
    .line 393
    const-string v0, "VALUE=\"(.+?)\""

    .line 394
    .line 395
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    sput-object v0, Lb2/o;->Z:Ljava/util/regex/Pattern;

    .line 400
    .line 401
    const-string v0, "IMPORT=\"(.+?)\""

    .line 402
    .line 403
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Lb2/o;->a0:Ljava/util/regex/Pattern;

    .line 408
    .line 409
    const-string v0, "\\{\\$([a-zA-Z0-9\\-_]+)\\}"

    .line 410
    .line 411
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Lb2/o;->b0:Ljava/util/regex/Pattern;

    .line 416
    .line 417
    return-void
.end method

.method public constructor <init>(Lb2/l;Lb2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb2/o;->a:Lb2/l;

    .line 5
    .line 6
    iput-object p2, p0, Lb2/o;->b:Lb2/i;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    const-string v0, "=(NO|YES)"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static b(Ljava/lang/String;[LN1/i;)LN1/j;
    .locals 7

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [LN1/i;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    new-instance v3, LN1/i;

    .line 11
    .line 12
    iget-object v4, v2, LN1/i;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v2, LN1/i;->d:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, v2, LN1/i;->b:Ljava/util/UUID;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct {v3, v2, v4, v5, v6}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 20
    .line 21
    .line 22
    aput-object v3, v0, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, LN1/j;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p1, p0, v1, v0}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)LN1/i;
    .locals 8

    .line 1
    sget-object v0, Lb2/o;->J:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-static {p0, v0, v1, p2}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 10
    .line 11
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const/16 v4, 0x2c

    .line 17
    .line 18
    const-string v5, "video/mp4"

    .line 19
    .line 20
    sget-object v6, Lb2/o;->K:Ljava/util/regex/Pattern;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-static {p0, v6, p2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, LN1/i;

    .line 30
    .line 31
    sget-object p2, LN1/e;->d:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {p1, p2, v7, v5, p0}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const-string v2, "com.widevine"

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    new-instance p1, LN1/i;

    .line 58
    .line 59
    sget-object p2, LN1/e;->d:Ljava/util/UUID;

    .line 60
    .line 61
    sget v0, LQ1/x;->a:I

    .line 62
    .line 63
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, "hls"

    .line 70
    .line 71
    invoke-direct {p1, p2, v7, v0, p0}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_1
    const-string v2, "com.microsoft.playready"

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    invoke-static {p0, v6, p2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p1, LN1/e;->e:Ljava/util/UUID;

    .line 106
    .line 107
    invoke-static {p1, v7, p0}, LM2/r;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance p2, LN1/i;

    .line 112
    .line 113
    invoke-direct {p2, p1, v7, v5, p0}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 114
    .line 115
    .line 116
    return-object p2

    .line 117
    :cond_2
    return-object v7
.end method

.method public static d(Lb2/l;Lb2/i;LDd/c;Ljava/lang/String;)Lb2/i;
    .locals 110

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lb2/m;->c:Z

    .line 6
    .line 7
    new-instance v3, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v6, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v7, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v8, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v9, Lb2/h;

    .line 38
    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    invoke-direct/range {v9 .. v17}, Lb2/h;-><init>(JJJZZ)V

    .line 59
    .line 60
    .line 61
    new-instance v10, Ljava/util/TreeMap;

    .line 62
    .line 63
    invoke-direct {v10}, Ljava/util/TreeMap;-><init>()V

    .line 64
    .line 65
    .line 66
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const-wide/16 v18, 0x0

    .line 72
    .line 73
    const-string v14, ""

    .line 74
    .line 75
    const-wide/16 v20, -0x1

    .line 76
    .line 77
    move/from16 v23, v2

    .line 78
    .line 79
    move-object/from16 v73, v14

    .line 80
    .line 81
    move-wide/from16 v42, v16

    .line 82
    .line 83
    move-wide/from16 v44, v42

    .line 84
    .line 85
    move-wide/from16 v48, v44

    .line 86
    .line 87
    move-wide/from16 v27, v18

    .line 88
    .line 89
    move-wide/from16 v46, v27

    .line 90
    .line 91
    move-wide/from16 v54, v46

    .line 92
    .line 93
    move-wide/from16 v58, v54

    .line 94
    .line 95
    move-wide/from16 v62, v58

    .line 96
    .line 97
    move-wide/from16 v67, v62

    .line 98
    .line 99
    move-wide/from16 v71, v67

    .line 100
    .line 101
    move-wide/from16 v74, v71

    .line 102
    .line 103
    move-wide/from16 v56, v20

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    const/4 v15, 0x0

    .line 108
    const/16 v24, 0x0

    .line 109
    .line 110
    const/16 v25, 0x0

    .line 111
    .line 112
    const/16 v26, 0x0

    .line 113
    .line 114
    const/16 v29, 0x0

    .line 115
    .line 116
    const/16 v33, 0x0

    .line 117
    .line 118
    const/16 v37, 0x0

    .line 119
    .line 120
    const/16 v50, 0x0

    .line 121
    .line 122
    const/16 v51, 0x0

    .line 123
    .line 124
    const/16 v52, 0x0

    .line 125
    .line 126
    const/16 v53, 0x0

    .line 127
    .line 128
    const/16 v66, 0x0

    .line 129
    .line 130
    const/16 v69, 0x0

    .line 131
    .line 132
    const/16 v70, 0x0

    .line 133
    .line 134
    move-wide/from16 v19, v48

    .line 135
    .line 136
    move-wide/from16 v16, v74

    .line 137
    .line 138
    move-wide/from16 v21, v56

    .line 139
    .line 140
    const/16 v18, 0x1

    .line 141
    .line 142
    :cond_0
    :goto_0
    invoke-virtual/range {p2 .. p2}, LDd/c;->J()Z

    .line 143
    .line 144
    .line 145
    move-result v30

    .line 146
    if-eqz v30, :cond_50

    .line 147
    .line 148
    invoke-virtual/range {p2 .. p2}, LDd/c;->M()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    const-string v13, "#EXT"

    .line 153
    .line 154
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_1

    .line 159
    .line 160
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_1
    const-string v13, "#EXT-X-PLAYLIST-TYPE"

    .line 164
    .line 165
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-eqz v13, :cond_3

    .line 170
    .line 171
    sget-object v13, Lb2/o;->q:Ljava/util/regex/Pattern;

    .line 172
    .line 173
    invoke-static {v12, v13, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    const-string v13, "VOD"

    .line 178
    .line 179
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-eqz v13, :cond_2

    .line 184
    .line 185
    const/4 v15, 0x1

    .line 186
    goto :goto_0

    .line 187
    :cond_2
    const-string v13, "EVENT"

    .line 188
    .line 189
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_0

    .line 194
    .line 195
    const/4 v12, 0x2

    .line 196
    move v15, v12

    .line 197
    goto :goto_0

    .line 198
    :cond_3
    const-string v13, "#EXT-X-I-FRAMES-ONLY"

    .line 199
    .line 200
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    if-eqz v13, :cond_4

    .line 205
    .line 206
    const/16 v69, 0x1

    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_4
    const-string v13, "#EXT-X-START"

    .line 210
    .line 211
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    const-wide v31, 0x412e848000000000L    # 1000000.0

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    if-eqz v13, :cond_5

    .line 221
    .line 222
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 223
    .line 224
    sget-object v13, Lb2/o;->C:Ljava/util/regex/Pattern;

    .line 225
    .line 226
    invoke-static {v12, v13, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 231
    .line 232
    .line 233
    move-result-wide v34

    .line 234
    move-object v13, v8

    .line 235
    move-object/from16 v77, v9

    .line 236
    .line 237
    mul-double v8, v34, v31

    .line 238
    .line 239
    double-to-long v8, v8

    .line 240
    sget-object v2, Lb2/o;->Y:Ljava/util/regex/Pattern;

    .line 241
    .line 242
    invoke-static {v12, v2}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    move-wide/from16 v42, v8

    .line 247
    .line 248
    :goto_1
    move-object v8, v13

    .line 249
    move-object/from16 v9, v77

    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_5
    move-object v13, v8

    .line 253
    move-object/from16 v77, v9

    .line 254
    .line 255
    const-string v8, "#EXT-X-SERVER-CONTROL"

    .line 256
    .line 257
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_9

    .line 262
    .line 263
    sget-object v8, Lb2/o;->r:Ljava/util/regex/Pattern;

    .line 264
    .line 265
    invoke-static {v12, v8}, Lb2/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 266
    .line 267
    .line 268
    move-result-wide v8

    .line 269
    const-wide/high16 v34, -0x3c20000000000000L    # -9.223372036854776E18

    .line 270
    .line 271
    cmpl-double v30, v8, v34

    .line 272
    .line 273
    if-nez v30, :cond_6

    .line 274
    .line 275
    move-wide/from16 v78, v44

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_6
    mul-double v8, v8, v31

    .line 279
    .line 280
    double-to-long v8, v8

    .line 281
    move-wide/from16 v78, v8

    .line 282
    .line 283
    :goto_2
    sget-object v8, Lb2/o;->s:Ljava/util/regex/Pattern;

    .line 284
    .line 285
    invoke-static {v12, v8}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 286
    .line 287
    .line 288
    move-result v84

    .line 289
    sget-object v8, Lb2/o;->u:Ljava/util/regex/Pattern;

    .line 290
    .line 291
    invoke-static {v12, v8}, Lb2/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 292
    .line 293
    .line 294
    move-result-wide v8

    .line 295
    cmpl-double v30, v8, v34

    .line 296
    .line 297
    if-nez v30, :cond_7

    .line 298
    .line 299
    move-wide/from16 v80, v44

    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_7
    mul-double v8, v8, v31

    .line 303
    .line 304
    double-to-long v8, v8

    .line 305
    move-wide/from16 v80, v8

    .line 306
    .line 307
    :goto_3
    sget-object v8, Lb2/o;->v:Ljava/util/regex/Pattern;

    .line 308
    .line 309
    invoke-static {v12, v8}, Lb2/o;->g(Ljava/lang/String;Ljava/util/regex/Pattern;)D

    .line 310
    .line 311
    .line 312
    move-result-wide v8

    .line 313
    cmpl-double v30, v8, v34

    .line 314
    .line 315
    if-nez v30, :cond_8

    .line 316
    .line 317
    move-wide/from16 v82, v44

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_8
    mul-double v8, v8, v31

    .line 321
    .line 322
    double-to-long v8, v8

    .line 323
    move-wide/from16 v82, v8

    .line 324
    .line 325
    :goto_4
    sget-object v8, Lb2/o;->w:Ljava/util/regex/Pattern;

    .line 326
    .line 327
    invoke-static {v12, v8}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 328
    .line 329
    .line 330
    move-result v85

    .line 331
    new-instance v77, Lb2/h;

    .line 332
    .line 333
    invoke-direct/range {v77 .. v85}, Lb2/h;-><init>(JJJZZ)V

    .line 334
    .line 335
    .line 336
    goto :goto_1

    .line 337
    :cond_9
    const-string v8, "#EXT-X-PART-INF"

    .line 338
    .line 339
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_a

    .line 344
    .line 345
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 346
    .line 347
    sget-object v9, Lb2/o;->o:Ljava/util/regex/Pattern;

    .line 348
    .line 349
    invoke-static {v12, v9, v8}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-static {v8}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 354
    .line 355
    .line 356
    move-result-wide v8

    .line 357
    mul-double v8, v8, v31

    .line 358
    .line 359
    double-to-long v8, v8

    .line 360
    move-wide/from16 v48, v8

    .line 361
    .line 362
    goto :goto_1

    .line 363
    :cond_a
    const-string v8, "#EXT-X-MAP"

    .line 364
    .line 365
    invoke-virtual {v12, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    sget-object v9, Lb2/o;->E:Ljava/util/regex/Pattern;

    .line 370
    .line 371
    move/from16 v78, v2

    .line 372
    .line 373
    const-string v2, "@"

    .line 374
    .line 375
    move/from16 v34, v8

    .line 376
    .line 377
    sget-object v8, Lb2/o;->K:Ljava/util/regex/Pattern;

    .line 378
    .line 379
    if-eqz v34, :cond_10

    .line 380
    .line 381
    invoke-static {v12, v8, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v31

    .line 385
    const/4 v8, 0x0

    .line 386
    invoke-static {v12, v9, v8, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    if-eqz v9, :cond_b

    .line 391
    .line 392
    sget v8, LQ1/x;->a:I

    .line 393
    .line 394
    const/4 v8, -0x1

    .line 395
    invoke-virtual {v9, v2, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    aget-object v8, v2, v51

    .line 400
    .line 401
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v56

    .line 405
    array-length v8, v2

    .line 406
    const/4 v9, 0x1

    .line 407
    if-le v8, v9, :cond_b

    .line 408
    .line 409
    aget-object v2, v2, v9

    .line 410
    .line 411
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 412
    .line 413
    .line 414
    move-result-wide v62

    .line 415
    :cond_b
    move-wide/from16 v34, v56

    .line 416
    .line 417
    cmp-long v2, v34, v21

    .line 418
    .line 419
    if-nez v2, :cond_c

    .line 420
    .line 421
    move-wide/from16 v62, v46

    .line 422
    .line 423
    :cond_c
    if-eqz v33, :cond_e

    .line 424
    .line 425
    if-eqz v37, :cond_d

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_d
    const-string v0, "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."

    .line 429
    .line 430
    const/4 v8, 0x0

    .line 431
    invoke-static {v0, v8}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    throw v0

    .line 436
    :cond_e
    :goto_5
    new-instance v30, Lb2/f;

    .line 437
    .line 438
    move-object/from16 v36, v33

    .line 439
    .line 440
    move-wide/from16 v32, v62

    .line 441
    .line 442
    invoke-direct/range {v30 .. v37}, Lb2/f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    move-object/from16 v33, v36

    .line 446
    .line 447
    move-object/from16 v79, v37

    .line 448
    .line 449
    if-eqz v2, :cond_f

    .line 450
    .line 451
    add-long v62, v62, v34

    .line 452
    .line 453
    :cond_f
    move-object v8, v13

    .line 454
    move-wide/from16 v56, v21

    .line 455
    .line 456
    move-object/from16 v25, v30

    .line 457
    .line 458
    move-object/from16 v9, v77

    .line 459
    .line 460
    move/from16 v2, v78

    .line 461
    .line 462
    move-object/from16 v37, v79

    .line 463
    .line 464
    goto/16 :goto_0

    .line 465
    .line 466
    :cond_10
    move-object/from16 v80, v13

    .line 467
    .line 468
    move-object/from16 v79, v37

    .line 469
    .line 470
    const-string v13, "#EXT-X-TARGETDURATION"

    .line 471
    .line 472
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 473
    .line 474
    .line 475
    move-result v13

    .line 476
    move-object/from16 v82, v6

    .line 477
    .line 478
    move-object/from16 v81, v7

    .line 479
    .line 480
    const-wide/32 v6, 0xf4240

    .line 481
    .line 482
    .line 483
    if-eqz v13, :cond_11

    .line 484
    .line 485
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 486
    .line 487
    sget-object v8, Lb2/o;->m:Ljava/util/regex/Pattern;

    .line 488
    .line 489
    invoke-static {v12, v8, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    int-to-long v8, v2

    .line 498
    mul-long v19, v8, v6

    .line 499
    .line 500
    :goto_6
    move-object/from16 v9, v77

    .line 501
    .line 502
    move/from16 v2, v78

    .line 503
    .line 504
    move-object/from16 v37, v79

    .line 505
    .line 506
    :goto_7
    move-object/from16 v8, v80

    .line 507
    .line 508
    move-object/from16 v7, v81

    .line 509
    .line 510
    move-object/from16 v6, v82

    .line 511
    .line 512
    goto/16 :goto_0

    .line 513
    .line 514
    :cond_11
    const-string v13, "#EXT-X-MEDIA-SEQUENCE"

    .line 515
    .line 516
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 517
    .line 518
    .line 519
    move-result v13

    .line 520
    if-eqz v13, :cond_12

    .line 521
    .line 522
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 523
    .line 524
    sget-object v6, Lb2/o;->x:Ljava/util/regex/Pattern;

    .line 525
    .line 526
    invoke-static {v12, v6, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 531
    .line 532
    .line 533
    move-result-wide v58

    .line 534
    move-wide/from16 v16, v58

    .line 535
    .line 536
    goto :goto_6

    .line 537
    :cond_12
    const-string v13, "#EXT-X-VERSION"

    .line 538
    .line 539
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 540
    .line 541
    .line 542
    move-result v13

    .line 543
    if-eqz v13, :cond_13

    .line 544
    .line 545
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 546
    .line 547
    sget-object v6, Lb2/o;->p:Ljava/util/regex/Pattern;

    .line 548
    .line 549
    invoke-static {v12, v6, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    move-result v18

    .line 557
    goto :goto_6

    .line 558
    :cond_13
    const-string v13, "#EXT-X-DEFINE"

    .line 559
    .line 560
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    if-eqz v13, :cond_16

    .line 565
    .line 566
    sget-object v2, Lb2/o;->a0:Ljava/util/regex/Pattern;

    .line 567
    .line 568
    const/4 v8, 0x0

    .line 569
    invoke-static {v12, v2, v8, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    if-eqz v2, :cond_14

    .line 574
    .line 575
    iget-object v6, v0, Lb2/l;->l:Ljava/util/Map;

    .line 576
    .line 577
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    check-cast v6, Ljava/lang/String;

    .line 582
    .line 583
    if-eqz v6, :cond_15

    .line 584
    .line 585
    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    goto :goto_8

    .line 589
    :cond_14
    sget-object v2, Lb2/o;->P:Ljava/util/regex/Pattern;

    .line 590
    .line 591
    invoke-static {v12, v2, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    sget-object v6, Lb2/o;->Z:Ljava/util/regex/Pattern;

    .line 596
    .line 597
    invoke-static {v12, v6, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    :cond_15
    :goto_8
    move-object/from16 v6, v25

    .line 605
    .line 606
    move-wide/from16 v30, v27

    .line 607
    .line 608
    move-object/from16 v34, v33

    .line 609
    .line 610
    move-wide/from16 v38, v56

    .line 611
    .line 612
    move-object/from16 v13, v66

    .line 613
    .line 614
    :goto_9
    move/from16 v40, v70

    .line 615
    .line 616
    move-object/from16 v27, v73

    .line 617
    .line 618
    move-object/from16 v0, v81

    .line 619
    .line 620
    :goto_a
    move-object/from16 v7, v82

    .line 621
    .line 622
    goto/16 :goto_2a

    .line 623
    .line 624
    :cond_16
    const-string v13, "#EXTINF"

    .line 625
    .line 626
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 627
    .line 628
    .line 629
    move-result v13

    .line 630
    if-eqz v13, :cond_17

    .line 631
    .line 632
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 633
    .line 634
    sget-object v8, Lb2/o;->y:Ljava/util/regex/Pattern;

    .line 635
    .line 636
    invoke-static {v12, v8, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    new-instance v8, Ljava/math/BigDecimal;

    .line 641
    .line 642
    invoke-direct {v8, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    new-instance v2, Ljava/math/BigDecimal;

    .line 646
    .line 647
    invoke-direct {v2, v6, v7}, Ljava/math/BigDecimal;-><init>(J)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v8, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v2}, Ljava/math/BigDecimal;->longValue()J

    .line 655
    .line 656
    .line 657
    move-result-wide v71

    .line 658
    sget-object v2, Lb2/o;->z:Ljava/util/regex/Pattern;

    .line 659
    .line 660
    invoke-static {v12, v2, v14, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v73

    .line 664
    goto/16 :goto_6

    .line 665
    .line 666
    :cond_17
    const-string v6, "#EXT-X-SKIP"

    .line 667
    .line 668
    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    const-wide/16 v34, 0x1

    .line 673
    .line 674
    if-eqz v6, :cond_20

    .line 675
    .line 676
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 677
    .line 678
    sget-object v6, Lb2/o;->t:Ljava/util/regex/Pattern;

    .line 679
    .line 680
    invoke-static {v12, v6, v2}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 685
    .line 686
    .line 687
    move-result v2

    .line 688
    if-eqz v1, :cond_18

    .line 689
    .line 690
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 691
    .line 692
    .line 693
    move-result v6

    .line 694
    if-eqz v6, :cond_18

    .line 695
    .line 696
    const/4 v6, 0x1

    .line 697
    goto :goto_b

    .line 698
    :cond_18
    move/from16 v6, v51

    .line 699
    .line 700
    :goto_b
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 701
    .line 702
    .line 703
    sget v6, LQ1/x;->a:I

    .line 704
    .line 705
    iget-wide v6, v1, Lb2/i;->k:J

    .line 706
    .line 707
    sub-long v6, v16, v6

    .line 708
    .line 709
    long-to-int v6, v6

    .line 710
    add-int/2addr v2, v6

    .line 711
    if-ltz v6, :cond_1f

    .line 712
    .line 713
    iget-object v7, v1, Lb2/i;->r:Ll8/K;

    .line 714
    .line 715
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 716
    .line 717
    .line 718
    move-result v8

    .line 719
    if-gt v2, v8, :cond_1f

    .line 720
    .line 721
    move-wide/from16 v90, v67

    .line 722
    .line 723
    move-object/from16 v37, v79

    .line 724
    .line 725
    :goto_c
    if-ge v6, v2, :cond_1e

    .line 726
    .line 727
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v8

    .line 731
    check-cast v8, Lb2/f;

    .line 732
    .line 733
    iget-wide v12, v1, Lb2/i;->k:J

    .line 734
    .line 735
    cmp-long v9, v16, v12

    .line 736
    .line 737
    if-eqz v9, :cond_1a

    .line 738
    .line 739
    iget v9, v1, Lb2/i;->j:I

    .line 740
    .line 741
    sub-int v9, v9, v53

    .line 742
    .line 743
    iget v12, v8, Lb2/g;->d:I

    .line 744
    .line 745
    add-int v97, v9, v12

    .line 746
    .line 747
    new-instance v9, Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 750
    .line 751
    .line 752
    move/from16 v12, v51

    .line 753
    .line 754
    move-wide/from16 v98, v90

    .line 755
    .line 756
    :goto_d
    iget-object v13, v8, Lb2/f;->m:Ll8/K;

    .line 757
    .line 758
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-ge v12, v0, :cond_19

    .line 763
    .line 764
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, Lb2/d;

    .line 769
    .line 770
    new-instance v92, Lb2/d;

    .line 771
    .line 772
    iget-boolean v13, v0, Lb2/d;->l:Z

    .line 773
    .line 774
    move/from16 v30, v2

    .line 775
    .line 776
    iget-wide v1, v0, Lb2/g;->j:J

    .line 777
    .line 778
    move-wide/from16 v105, v1

    .line 779
    .line 780
    iget-boolean v1, v0, Lb2/g;->k:Z

    .line 781
    .line 782
    iget-object v2, v0, Lb2/g;->a:Ljava/lang/String;

    .line 783
    .line 784
    move/from16 v107, v1

    .line 785
    .line 786
    iget-object v1, v0, Lb2/g;->b:Lb2/f;

    .line 787
    .line 788
    move-object/from16 v94, v1

    .line 789
    .line 790
    move-object/from16 v93, v2

    .line 791
    .line 792
    iget-wide v1, v0, Lb2/g;->c:J

    .line 793
    .line 794
    move-wide/from16 v95, v1

    .line 795
    .line 796
    iget-object v1, v0, Lb2/g;->f:LN1/j;

    .line 797
    .line 798
    iget-object v2, v0, Lb2/g;->g:Ljava/lang/String;

    .line 799
    .line 800
    move-object/from16 v100, v1

    .line 801
    .line 802
    iget-object v1, v0, Lb2/g;->h:Ljava/lang/String;

    .line 803
    .line 804
    move-object/from16 v102, v1

    .line 805
    .line 806
    move-object/from16 v101, v2

    .line 807
    .line 808
    iget-wide v1, v0, Lb2/g;->i:J

    .line 809
    .line 810
    move-wide/from16 v103, v1

    .line 811
    .line 812
    iget-boolean v1, v0, Lb2/d;->m:Z

    .line 813
    .line 814
    move/from16 v109, v1

    .line 815
    .line 816
    move/from16 v108, v13

    .line 817
    .line 818
    invoke-direct/range {v92 .. v109}, Lb2/d;-><init>(Ljava/lang/String;Lb2/f;JIJLN1/j;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 819
    .line 820
    .line 821
    move-object/from16 v1, v92

    .line 822
    .line 823
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 824
    .line 825
    .line 826
    iget-wide v0, v0, Lb2/g;->c:J

    .line 827
    .line 828
    add-long v98, v98, v0

    .line 829
    .line 830
    const/16 v76, 0x1

    .line 831
    .line 832
    add-int/lit8 v12, v12, 0x1

    .line 833
    .line 834
    move-object/from16 v0, p0

    .line 835
    .line 836
    move-object/from16 v1, p1

    .line 837
    .line 838
    move/from16 v2, v30

    .line 839
    .line 840
    goto :goto_d

    .line 841
    :cond_19
    move/from16 v30, v2

    .line 842
    .line 843
    new-instance v83, Lb2/f;

    .line 844
    .line 845
    iget-wide v0, v8, Lb2/g;->j:J

    .line 846
    .line 847
    iget-boolean v2, v8, Lb2/g;->k:Z

    .line 848
    .line 849
    iget-object v12, v8, Lb2/g;->a:Ljava/lang/String;

    .line 850
    .line 851
    iget-object v13, v8, Lb2/g;->b:Lb2/f;

    .line 852
    .line 853
    move-wide/from16 v24, v0

    .line 854
    .line 855
    iget-object v0, v8, Lb2/f;->l:Ljava/lang/String;

    .line 856
    .line 857
    move-object/from16 v86, v0

    .line 858
    .line 859
    iget-wide v0, v8, Lb2/g;->c:J

    .line 860
    .line 861
    move-wide/from16 v87, v0

    .line 862
    .line 863
    iget-object v0, v8, Lb2/g;->f:LN1/j;

    .line 864
    .line 865
    iget-object v1, v8, Lb2/g;->g:Ljava/lang/String;

    .line 866
    .line 867
    move-object/from16 v92, v0

    .line 868
    .line 869
    iget-object v0, v8, Lb2/g;->h:Ljava/lang/String;

    .line 870
    .line 871
    move-object/from16 v94, v0

    .line 872
    .line 873
    move-object/from16 v93, v1

    .line 874
    .line 875
    iget-wide v0, v8, Lb2/g;->i:J

    .line 876
    .line 877
    move-wide/from16 v95, v0

    .line 878
    .line 879
    move/from16 v99, v2

    .line 880
    .line 881
    move-object/from16 v100, v9

    .line 882
    .line 883
    move-object/from16 v84, v12

    .line 884
    .line 885
    move-object/from16 v85, v13

    .line 886
    .line 887
    move/from16 v89, v97

    .line 888
    .line 889
    move-wide/from16 v97, v24

    .line 890
    .line 891
    invoke-direct/range {v83 .. v100}, Lb2/f;-><init>(Ljava/lang/String;Lb2/f;Ljava/lang/String;JIJLN1/j;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    .line 892
    .line 893
    .line 894
    move-object/from16 v8, v83

    .line 895
    .line 896
    goto :goto_e

    .line 897
    :cond_1a
    move/from16 v30, v2

    .line 898
    .line 899
    :goto_e
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    iget-wide v0, v8, Lb2/g;->c:J

    .line 903
    .line 904
    add-long v90, v90, v0

    .line 905
    .line 906
    iget-wide v0, v8, Lb2/g;->j:J

    .line 907
    .line 908
    cmp-long v2, v0, v21

    .line 909
    .line 910
    if-eqz v2, :cond_1b

    .line 911
    .line 912
    iget-wide v12, v8, Lb2/g;->i:J

    .line 913
    .line 914
    add-long v62, v12, v0

    .line 915
    .line 916
    :cond_1b
    iget-object v0, v8, Lb2/g;->h:Ljava/lang/String;

    .line 917
    .line 918
    if-eqz v0, :cond_1c

    .line 919
    .line 920
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    if-nez v1, :cond_1d

    .line 929
    .line 930
    :cond_1c
    move-object/from16 v37, v0

    .line 931
    .line 932
    :cond_1d
    add-long v58, v58, v34

    .line 933
    .line 934
    const/16 v76, 0x1

    .line 935
    .line 936
    add-int/lit8 v6, v6, 0x1

    .line 937
    .line 938
    iget v0, v8, Lb2/g;->d:I

    .line 939
    .line 940
    iget-object v1, v8, Lb2/g;->b:Lb2/f;

    .line 941
    .line 942
    iget-object v2, v8, Lb2/g;->f:LN1/j;

    .line 943
    .line 944
    iget-object v8, v8, Lb2/g;->g:Ljava/lang/String;

    .line 945
    .line 946
    move/from16 v29, v0

    .line 947
    .line 948
    move-object/from16 v25, v1

    .line 949
    .line 950
    move-object/from16 v24, v2

    .line 951
    .line 952
    move-object/from16 v33, v8

    .line 953
    .line 954
    move/from16 v2, v30

    .line 955
    .line 956
    move-wide/from16 v27, v90

    .line 957
    .line 958
    move-object/from16 v0, p0

    .line 959
    .line 960
    move-object/from16 v1, p1

    .line 961
    .line 962
    goto/16 :goto_c

    .line 963
    .line 964
    :cond_1e
    move-object/from16 v0, p0

    .line 965
    .line 966
    move-object/from16 v1, p1

    .line 967
    .line 968
    move-object/from16 v9, v77

    .line 969
    .line 970
    move/from16 v2, v78

    .line 971
    .line 972
    move-object/from16 v8, v80

    .line 973
    .line 974
    move-object/from16 v7, v81

    .line 975
    .line 976
    move-object/from16 v6, v82

    .line 977
    .line 978
    move-wide/from16 v67, v90

    .line 979
    .line 980
    goto/16 :goto_0

    .line 981
    .line 982
    :cond_1f
    new-instance v0, Lb2/n;

    .line 983
    .line 984
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 985
    .line 986
    .line 987
    throw v0

    .line 988
    :cond_20
    const-string v0, "#EXT-X-KEY"

    .line 989
    .line 990
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_27

    .line 995
    .line 996
    sget-object v0, Lb2/o;->H:Ljava/util/regex/Pattern;

    .line 997
    .line 998
    invoke-static {v12, v0, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    sget-object v1, Lb2/o;->I:Ljava/util/regex/Pattern;

    .line 1003
    .line 1004
    const-string v2, "identity"

    .line 1005
    .line 1006
    invoke-static {v12, v1, v2, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v1

    .line 1010
    const-string v6, "NONE"

    .line 1011
    .line 1012
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v6

    .line 1016
    if-eqz v6, :cond_21

    .line 1017
    .line 1018
    invoke-virtual {v10}, Ljava/util/TreeMap;->clear()V

    .line 1019
    .line 1020
    .line 1021
    const/16 v24, 0x0

    .line 1022
    .line 1023
    const/16 v33, 0x0

    .line 1024
    .line 1025
    const/16 v37, 0x0

    .line 1026
    .line 1027
    goto :goto_13

    .line 1028
    :cond_21
    sget-object v6, Lb2/o;->L:Ljava/util/regex/Pattern;

    .line 1029
    .line 1030
    const/4 v7, 0x0

    .line 1031
    invoke-static {v12, v6, v7, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v6

    .line 1035
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v2

    .line 1039
    if-eqz v2, :cond_23

    .line 1040
    .line 1041
    const-string v1, "AES-128"

    .line 1042
    .line 1043
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    if-eqz v0, :cond_22

    .line 1048
    .line 1049
    invoke-static {v12, v8, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    move-object/from16 v33, v0

    .line 1054
    .line 1055
    move-object/from16 v37, v6

    .line 1056
    .line 1057
    goto :goto_13

    .line 1058
    :cond_22
    move-object/from16 v37, v6

    .line 1059
    .line 1060
    :goto_f
    const/16 v33, 0x0

    .line 1061
    .line 1062
    goto :goto_13

    .line 1063
    :cond_23
    move-object/from16 v13, v66

    .line 1064
    .line 1065
    if-nez v13, :cond_26

    .line 1066
    .line 1067
    const-string v2, "SAMPLE-AES-CENC"

    .line 1068
    .line 1069
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v2

    .line 1073
    if-nez v2, :cond_25

    .line 1074
    .line 1075
    const-string v2, "SAMPLE-AES-CTR"

    .line 1076
    .line 1077
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    if-eqz v0, :cond_24

    .line 1082
    .line 1083
    goto :goto_11

    .line 1084
    :cond_24
    const-string v0, "cbcs"

    .line 1085
    .line 1086
    :goto_10
    move-object/from16 v66, v0

    .line 1087
    .line 1088
    goto :goto_12

    .line 1089
    :cond_25
    :goto_11
    const-string v0, "cenc"

    .line 1090
    .line 1091
    goto :goto_10

    .line 1092
    :cond_26
    move-object/from16 v66, v13

    .line 1093
    .line 1094
    :goto_12
    invoke-static {v12, v1, v3}, Lb2/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)LN1/i;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    if-eqz v0, :cond_22

    .line 1099
    .line 1100
    invoke-virtual {v10, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-object/from16 v37, v6

    .line 1104
    .line 1105
    const/16 v24, 0x0

    .line 1106
    .line 1107
    goto :goto_f

    .line 1108
    :goto_13
    move-object/from16 v0, p0

    .line 1109
    .line 1110
    move-object/from16 v1, p1

    .line 1111
    .line 1112
    move-object/from16 v9, v77

    .line 1113
    .line 1114
    move/from16 v2, v78

    .line 1115
    .line 1116
    goto/16 :goto_7

    .line 1117
    .line 1118
    :cond_27
    move-object/from16 v13, v66

    .line 1119
    .line 1120
    const-string v0, "#EXT-X-BYTERANGE"

    .line 1121
    .line 1122
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v0

    .line 1126
    if-eqz v0, :cond_29

    .line 1127
    .line 1128
    sget-object v0, Lb2/o;->D:Ljava/util/regex/Pattern;

    .line 1129
    .line 1130
    invoke-static {v12, v0, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    sget v1, LQ1/x;->a:I

    .line 1135
    .line 1136
    const/4 v8, -0x1

    .line 1137
    invoke-virtual {v0, v2, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    aget-object v1, v0, v51

    .line 1142
    .line 1143
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1144
    .line 1145
    .line 1146
    move-result-wide v56

    .line 1147
    array-length v1, v0

    .line 1148
    const/4 v6, 0x1

    .line 1149
    if-le v1, v6, :cond_28

    .line 1150
    .line 1151
    aget-object v0, v0, v6

    .line 1152
    .line 1153
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1154
    .line 1155
    .line 1156
    move-result-wide v0

    .line 1157
    move-wide/from16 v62, v0

    .line 1158
    .line 1159
    :cond_28
    :goto_14
    move-object/from16 v0, p0

    .line 1160
    .line 1161
    move-object/from16 v1, p1

    .line 1162
    .line 1163
    :goto_15
    move-object/from16 v66, v13

    .line 1164
    .line 1165
    goto/16 :goto_6

    .line 1166
    .line 1167
    :cond_29
    const/4 v6, 0x1

    .line 1168
    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 1169
    .line 1170
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    const/16 v1, 0x3a

    .line 1175
    .line 1176
    if-eqz v0, :cond_2a

    .line 1177
    .line 1178
    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    .line 1179
    .line 1180
    .line 1181
    move-result v0

    .line 1182
    add-int/2addr v0, v6

    .line 1183
    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1188
    .line 1189
    .line 1190
    move-result v53

    .line 1191
    move-object/from16 v0, p0

    .line 1192
    .line 1193
    move-object/from16 v1, p1

    .line 1194
    .line 1195
    move/from16 v52, v6

    .line 1196
    .line 1197
    goto :goto_15

    .line 1198
    :cond_2a
    const-string v0, "#EXT-X-DISCONTINUITY"

    .line 1199
    .line 1200
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    if-eqz v0, :cond_2b

    .line 1205
    .line 1206
    add-int/lit8 v29, v29, 0x1

    .line 1207
    .line 1208
    goto :goto_14

    .line 1209
    :cond_2b
    const-string v0, "#EXT-X-PROGRAM-DATE-TIME"

    .line 1210
    .line 1211
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result v0

    .line 1215
    if-eqz v0, :cond_2d

    .line 1216
    .line 1217
    cmp-long v0, v54, v46

    .line 1218
    .line 1219
    if-nez v0, :cond_2c

    .line 1220
    .line 1221
    invoke-virtual {v12, v1}, Ljava/lang/String;->indexOf(I)I

    .line 1222
    .line 1223
    .line 1224
    move-result v0

    .line 1225
    add-int/2addr v0, v6

    .line 1226
    invoke-virtual {v12, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-static {v0}, LQ1/x;->N(Ljava/lang/String;)J

    .line 1231
    .line 1232
    .line 1233
    move-result-wide v0

    .line 1234
    invoke-static {v0, v1}, LQ1/x;->K(J)J

    .line 1235
    .line 1236
    .line 1237
    move-result-wide v0

    .line 1238
    sub-long v54, v0, v67

    .line 1239
    .line 1240
    goto :goto_14

    .line 1241
    :cond_2c
    move-object/from16 v6, v25

    .line 1242
    .line 1243
    move-wide/from16 v30, v27

    .line 1244
    .line 1245
    move-object/from16 v34, v33

    .line 1246
    .line 1247
    move-wide/from16 v38, v56

    .line 1248
    .line 1249
    goto/16 :goto_9

    .line 1250
    .line 1251
    :cond_2d
    const-string v0, "#EXT-X-GAP"

    .line 1252
    .line 1253
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    if-eqz v0, :cond_2e

    .line 1258
    .line 1259
    move-object/from16 v0, p0

    .line 1260
    .line 1261
    move-object/from16 v1, p1

    .line 1262
    .line 1263
    move-object/from16 v66, v13

    .line 1264
    .line 1265
    move-object/from16 v9, v77

    .line 1266
    .line 1267
    move/from16 v2, v78

    .line 1268
    .line 1269
    move-object/from16 v37, v79

    .line 1270
    .line 1271
    move-object/from16 v8, v80

    .line 1272
    .line 1273
    move-object/from16 v7, v81

    .line 1274
    .line 1275
    move-object/from16 v6, v82

    .line 1276
    .line 1277
    const/16 v70, 0x1

    .line 1278
    .line 1279
    goto/16 :goto_0

    .line 1280
    .line 1281
    :cond_2e
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 1282
    .line 1283
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v0

    .line 1287
    if-eqz v0, :cond_2f

    .line 1288
    .line 1289
    move-object/from16 v0, p0

    .line 1290
    .line 1291
    move-object/from16 v1, p1

    .line 1292
    .line 1293
    move-object/from16 v66, v13

    .line 1294
    .line 1295
    move-object/from16 v9, v77

    .line 1296
    .line 1297
    move/from16 v2, v78

    .line 1298
    .line 1299
    move-object/from16 v37, v79

    .line 1300
    .line 1301
    move-object/from16 v8, v80

    .line 1302
    .line 1303
    move-object/from16 v7, v81

    .line 1304
    .line 1305
    move-object/from16 v6, v82

    .line 1306
    .line 1307
    const/16 v23, 0x1

    .line 1308
    .line 1309
    goto/16 :goto_0

    .line 1310
    .line 1311
    :cond_2f
    const-string v0, "#EXT-X-ENDLIST"

    .line 1312
    .line 1313
    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    move-result v0

    .line 1317
    if-eqz v0, :cond_30

    .line 1318
    .line 1319
    move-object/from16 v0, p0

    .line 1320
    .line 1321
    move-object/from16 v1, p1

    .line 1322
    .line 1323
    move-object/from16 v66, v13

    .line 1324
    .line 1325
    move-object/from16 v9, v77

    .line 1326
    .line 1327
    move/from16 v2, v78

    .line 1328
    .line 1329
    move-object/from16 v37, v79

    .line 1330
    .line 1331
    move-object/from16 v8, v80

    .line 1332
    .line 1333
    move-object/from16 v7, v81

    .line 1334
    .line 1335
    move-object/from16 v6, v82

    .line 1336
    .line 1337
    const/16 v50, 0x1

    .line 1338
    .line 1339
    goto/16 :goto_0

    .line 1340
    .line 1341
    :cond_30
    const-string v0, "#EXT-X-RENDITION-REPORT"

    .line 1342
    .line 1343
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    if-eqz v0, :cond_32

    .line 1348
    .line 1349
    sget-object v0, Lb2/o;->A:Ljava/util/regex/Pattern;

    .line 1350
    .line 1351
    invoke-static {v12, v0}, Lb2/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    .line 1352
    .line 1353
    .line 1354
    move-result-wide v0

    .line 1355
    sget-object v2, Lb2/o;->B:Ljava/util/regex/Pattern;

    .line 1356
    .line 1357
    invoke-virtual {v2, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v6

    .line 1365
    if-eqz v6, :cond_31

    .line 1366
    .line 1367
    const/4 v6, 0x1

    .line 1368
    invoke-virtual {v2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2

    .line 1372
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1376
    .line 1377
    .line 1378
    move-result v2

    .line 1379
    goto :goto_16

    .line 1380
    :cond_31
    const/4 v2, -0x1

    .line 1381
    :goto_16
    invoke-static {v12, v8, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v6

    .line 1385
    move-object/from16 v7, p3

    .line 1386
    .line 1387
    invoke-static {v7, v6}, LQ1/k;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v6

    .line 1391
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v6

    .line 1395
    new-instance v8, Lb2/e;

    .line 1396
    .line 1397
    invoke-direct {v8, v2, v0, v1, v6}, Lb2/e;-><init>(IJLandroid/net/Uri;)V

    .line 1398
    .line 1399
    .line 1400
    move-object/from16 v0, v81

    .line 1401
    .line 1402
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1403
    .line 1404
    .line 1405
    :goto_17
    move-object/from16 v6, v25

    .line 1406
    .line 1407
    move-wide/from16 v30, v27

    .line 1408
    .line 1409
    move-object/from16 v34, v33

    .line 1410
    .line 1411
    move-wide/from16 v38, v56

    .line 1412
    .line 1413
    move/from16 v40, v70

    .line 1414
    .line 1415
    move-object/from16 v27, v73

    .line 1416
    .line 1417
    goto/16 :goto_a

    .line 1418
    .line 1419
    :cond_32
    move-object/from16 v7, p3

    .line 1420
    .line 1421
    move-object/from16 v0, v81

    .line 1422
    .line 1423
    const-string v1, "#EXT-X-PRELOAD-HINT"

    .line 1424
    .line 1425
    invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1426
    .line 1427
    .line 1428
    move-result v1

    .line 1429
    if-eqz v1, :cond_3c

    .line 1430
    .line 1431
    if-eqz v11, :cond_33

    .line 1432
    .line 1433
    :goto_18
    goto :goto_17

    .line 1434
    :cond_33
    sget-object v1, Lb2/o;->N:Ljava/util/regex/Pattern;

    .line 1435
    .line 1436
    invoke-static {v12, v1, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    const-string v2, "PART"

    .line 1441
    .line 1442
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1443
    .line 1444
    .line 1445
    move-result v1

    .line 1446
    if-nez v1, :cond_34

    .line 1447
    .line 1448
    goto :goto_18

    .line 1449
    :cond_34
    move-object/from16 v1, v26

    .line 1450
    .line 1451
    move-object/from16 v26, v25

    .line 1452
    .line 1453
    invoke-static {v12, v8, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v25

    .line 1457
    sget-object v2, Lb2/o;->F:Ljava/util/regex/Pattern;

    .line 1458
    .line 1459
    invoke-static {v12, v2}, Lb2/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v8

    .line 1463
    sget-object v2, Lb2/o;->G:Ljava/util/regex/Pattern;

    .line 1464
    .line 1465
    invoke-static {v12, v2}, Lb2/o;->h(Ljava/lang/String;Ljava/util/regex/Pattern;)J

    .line 1466
    .line 1467
    .line 1468
    move-result-wide v37

    .line 1469
    if-nez v33, :cond_35

    .line 1470
    .line 1471
    const/16 v34, 0x0

    .line 1472
    .line 1473
    goto :goto_19

    .line 1474
    :cond_35
    if-eqz v79, :cond_36

    .line 1475
    .line 1476
    move-object/from16 v34, v79

    .line 1477
    .line 1478
    goto :goto_19

    .line 1479
    :cond_36
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v2

    .line 1483
    move-object/from16 v34, v2

    .line 1484
    .line 1485
    :goto_19
    if-nez v24, :cond_38

    .line 1486
    .line 1487
    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1488
    .line 1489
    .line 1490
    move-result v2

    .line 1491
    if-nez v2, :cond_38

    .line 1492
    .line 1493
    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v2

    .line 1497
    move/from16 v6, v51

    .line 1498
    .line 1499
    new-array v12, v6, [LN1/i;

    .line 1500
    .line 1501
    invoke-interface {v2, v12}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v2

    .line 1505
    check-cast v2, [LN1/i;

    .line 1506
    .line 1507
    new-instance v6, LN1/j;

    .line 1508
    .line 1509
    const/4 v12, 0x1

    .line 1510
    invoke-direct {v6, v13, v12, v2}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 1511
    .line 1512
    .line 1513
    if-nez v1, :cond_37

    .line 1514
    .line 1515
    invoke-static {v13, v2}, Lb2/o;->b(Ljava/lang/String;[LN1/i;)LN1/j;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    :cond_37
    move-object/from16 v32, v6

    .line 1520
    .line 1521
    goto :goto_1a

    .line 1522
    :cond_38
    move-object/from16 v32, v24

    .line 1523
    .line 1524
    :goto_1a
    cmp-long v2, v8, v21

    .line 1525
    .line 1526
    if-eqz v2, :cond_39

    .line 1527
    .line 1528
    cmp-long v6, v37, v21

    .line 1529
    .line 1530
    if-eqz v6, :cond_3b

    .line 1531
    .line 1532
    :cond_39
    new-instance v24, Lb2/d;

    .line 1533
    .line 1534
    if-eqz v2, :cond_3a

    .line 1535
    .line 1536
    move-wide/from16 v35, v8

    .line 1537
    .line 1538
    :goto_1b
    move-wide/from16 v30, v27

    .line 1539
    .line 1540
    goto :goto_1c

    .line 1541
    :cond_3a
    move-wide/from16 v35, v46

    .line 1542
    .line 1543
    goto :goto_1b

    .line 1544
    :goto_1c
    const-wide/16 v27, 0x0

    .line 1545
    .line 1546
    const/16 v39, 0x0

    .line 1547
    .line 1548
    const/16 v40, 0x0

    .line 1549
    .line 1550
    const/16 v41, 0x1

    .line 1551
    .line 1552
    invoke-direct/range {v24 .. v41}, Lb2/d;-><init>(Ljava/lang/String;Lb2/f;JIJLN1/j;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 1553
    .line 1554
    .line 1555
    move-wide/from16 v27, v30

    .line 1556
    .line 1557
    move-object/from16 v11, v24

    .line 1558
    .line 1559
    :cond_3b
    move-object v7, v0

    .line 1560
    move-object/from16 v66, v13

    .line 1561
    .line 1562
    move-object/from16 v25, v26

    .line 1563
    .line 1564
    move-object/from16 v24, v32

    .line 1565
    .line 1566
    move-object/from16 v9, v77

    .line 1567
    .line 1568
    move/from16 v2, v78

    .line 1569
    .line 1570
    move-object/from16 v37, v79

    .line 1571
    .line 1572
    move-object/from16 v8, v80

    .line 1573
    .line 1574
    move-object/from16 v6, v82

    .line 1575
    .line 1576
    const/16 v51, 0x0

    .line 1577
    .line 1578
    move-object/from16 v0, p0

    .line 1579
    .line 1580
    move-object/from16 v26, v1

    .line 1581
    .line 1582
    move-object/from16 v1, p1

    .line 1583
    .line 1584
    goto/16 :goto_0

    .line 1585
    .line 1586
    :cond_3c
    move-object/from16 v1, v26

    .line 1587
    .line 1588
    move-object/from16 v26, v25

    .line 1589
    .line 1590
    const-string v6, "#EXT-X-PART"

    .line 1591
    .line 1592
    invoke-virtual {v12, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1593
    .line 1594
    .line 1595
    move-result v6

    .line 1596
    if-eqz v6, :cond_46

    .line 1597
    .line 1598
    if-nez v33, :cond_3d

    .line 1599
    .line 1600
    const/16 v34, 0x0

    .line 1601
    .line 1602
    goto :goto_1d

    .line 1603
    :cond_3d
    if-eqz v79, :cond_3e

    .line 1604
    .line 1605
    move-object/from16 v34, v79

    .line 1606
    .line 1607
    goto :goto_1d

    .line 1608
    :cond_3e
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v37

    .line 1612
    move-object/from16 v34, v37

    .line 1613
    .line 1614
    :goto_1d
    invoke-static {v12, v8, v3}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v25

    .line 1618
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 1619
    .line 1620
    sget-object v8, Lb2/o;->n:Ljava/util/regex/Pattern;

    .line 1621
    .line 1622
    invoke-static {v12, v8, v6}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v6

    .line 1626
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 1627
    .line 1628
    .line 1629
    move-result-wide v35

    .line 1630
    mul-double v6, v35, v31

    .line 1631
    .line 1632
    double-to-long v6, v6

    .line 1633
    sget-object v8, Lb2/o;->W:Ljava/util/regex/Pattern;

    .line 1634
    .line 1635
    invoke-static {v12, v8}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 1636
    .line 1637
    .line 1638
    move-result v8

    .line 1639
    if-eqz v23, :cond_3f

    .line 1640
    .line 1641
    invoke-interface/range {v82 .. v82}, Ljava/util/List;->isEmpty()Z

    .line 1642
    .line 1643
    .line 1644
    move-result v31

    .line 1645
    if-eqz v31, :cond_3f

    .line 1646
    .line 1647
    const/16 v31, 0x1

    .line 1648
    .line 1649
    goto :goto_1e

    .line 1650
    :cond_3f
    const/16 v31, 0x0

    .line 1651
    .line 1652
    :goto_1e
    or-int v40, v8, v31

    .line 1653
    .line 1654
    sget-object v8, Lb2/o;->X:Ljava/util/regex/Pattern;

    .line 1655
    .line 1656
    invoke-static {v12, v8}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v39

    .line 1660
    const/4 v8, 0x0

    .line 1661
    invoke-static {v12, v9, v8, v3}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v9

    .line 1665
    if-eqz v9, :cond_41

    .line 1666
    .line 1667
    sget v12, LQ1/x;->a:I

    .line 1668
    .line 1669
    const/4 v12, -0x1

    .line 1670
    invoke-virtual {v9, v2, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v2

    .line 1674
    const/16 v51, 0x0

    .line 1675
    .line 1676
    aget-object v9, v2, v51

    .line 1677
    .line 1678
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1679
    .line 1680
    .line 1681
    move-result-wide v30

    .line 1682
    array-length v9, v2

    .line 1683
    const/4 v12, 0x1

    .line 1684
    if-le v9, v12, :cond_40

    .line 1685
    .line 1686
    aget-object v2, v2, v12

    .line 1687
    .line 1688
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1689
    .line 1690
    .line 1691
    move-result-wide v74

    .line 1692
    :cond_40
    move-wide/from16 v37, v30

    .line 1693
    .line 1694
    goto :goto_1f

    .line 1695
    :cond_41
    move-wide/from16 v37, v21

    .line 1696
    .line 1697
    :goto_1f
    cmp-long v2, v37, v21

    .line 1698
    .line 1699
    if-nez v2, :cond_42

    .line 1700
    .line 1701
    move-wide/from16 v35, v46

    .line 1702
    .line 1703
    goto :goto_20

    .line 1704
    :cond_42
    move-wide/from16 v35, v74

    .line 1705
    .line 1706
    :goto_20
    if-nez v24, :cond_44

    .line 1707
    .line 1708
    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1709
    .line 1710
    .line 1711
    move-result v9

    .line 1712
    if-nez v9, :cond_44

    .line 1713
    .line 1714
    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v9

    .line 1718
    const/4 v12, 0x0

    .line 1719
    new-array v8, v12, [LN1/i;

    .line 1720
    .line 1721
    invoke-interface {v9, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v8

    .line 1725
    check-cast v8, [LN1/i;

    .line 1726
    .line 1727
    new-instance v9, LN1/j;

    .line 1728
    .line 1729
    const/4 v12, 0x1

    .line 1730
    invoke-direct {v9, v13, v12, v8}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 1731
    .line 1732
    .line 1733
    if-nez v1, :cond_43

    .line 1734
    .line 1735
    invoke-static {v13, v8}, Lb2/o;->b(Ljava/lang/String;[LN1/i;)LN1/j;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v1

    .line 1739
    :cond_43
    move-object/from16 v32, v9

    .line 1740
    .line 1741
    goto :goto_21

    .line 1742
    :cond_44
    move-object/from16 v32, v24

    .line 1743
    .line 1744
    :goto_21
    new-instance v24, Lb2/d;

    .line 1745
    .line 1746
    const/16 v41, 0x0

    .line 1747
    .line 1748
    move-wide/from16 v30, v27

    .line 1749
    .line 1750
    move-wide/from16 v27, v6

    .line 1751
    .line 1752
    invoke-direct/range {v24 .. v41}, Lb2/d;-><init>(Ljava/lang/String;Lb2/f;JIJLN1/j;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    .line 1753
    .line 1754
    .line 1755
    move-object/from16 v8, v24

    .line 1756
    .line 1757
    move-object/from16 v6, v26

    .line 1758
    .line 1759
    move-object/from16 v7, v82

    .line 1760
    .line 1761
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    add-long v27, v30, v27

    .line 1765
    .line 1766
    if-eqz v2, :cond_45

    .line 1767
    .line 1768
    add-long v35, v35, v37

    .line 1769
    .line 1770
    :cond_45
    move-wide/from16 v74, v35

    .line 1771
    .line 1772
    move-object/from16 v26, v1

    .line 1773
    .line 1774
    move-object/from16 v25, v6

    .line 1775
    .line 1776
    move-object v6, v7

    .line 1777
    move-object/from16 v66, v13

    .line 1778
    .line 1779
    move-object/from16 v24, v32

    .line 1780
    .line 1781
    move-object/from16 v9, v77

    .line 1782
    .line 1783
    move/from16 v2, v78

    .line 1784
    .line 1785
    move-object/from16 v37, v79

    .line 1786
    .line 1787
    move-object/from16 v8, v80

    .line 1788
    .line 1789
    const/16 v51, 0x0

    .line 1790
    .line 1791
    move-object/from16 v1, p1

    .line 1792
    .line 1793
    :goto_22
    move-object v7, v0

    .line 1794
    move-object/from16 v0, p0

    .line 1795
    .line 1796
    goto/16 :goto_0

    .line 1797
    .line 1798
    :cond_46
    move-object/from16 v6, v26

    .line 1799
    .line 1800
    move-wide/from16 v30, v27

    .line 1801
    .line 1802
    move-object/from16 v7, v82

    .line 1803
    .line 1804
    const-string v2, "#"

    .line 1805
    .line 1806
    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1807
    .line 1808
    .line 1809
    move-result v2

    .line 1810
    if-nez v2, :cond_4f

    .line 1811
    .line 1812
    if-nez v33, :cond_47

    .line 1813
    .line 1814
    const/16 v37, 0x0

    .line 1815
    .line 1816
    goto :goto_23

    .line 1817
    :cond_47
    if-eqz v79, :cond_48

    .line 1818
    .line 1819
    move-object/from16 v37, v79

    .line 1820
    .line 1821
    goto :goto_23

    .line 1822
    :cond_48
    invoke-static/range {v58 .. v59}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v37

    .line 1826
    :goto_23
    add-long v8, v58, v34

    .line 1827
    .line 1828
    invoke-static {v12, v3}, Lb2/o;->k(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v2

    .line 1832
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v12

    .line 1836
    check-cast v12, Lb2/f;

    .line 1837
    .line 1838
    cmp-long v66, v56, v21

    .line 1839
    .line 1840
    if-nez v66, :cond_49

    .line 1841
    .line 1842
    move-object/from16 v25, v12

    .line 1843
    .line 1844
    move-wide/from16 v62, v46

    .line 1845
    .line 1846
    goto :goto_24

    .line 1847
    :cond_49
    if-eqz v69, :cond_4a

    .line 1848
    .line 1849
    if-nez v6, :cond_4a

    .line 1850
    .line 1851
    if-nez v12, :cond_4a

    .line 1852
    .line 1853
    new-instance v58, Lb2/f;

    .line 1854
    .line 1855
    const/16 v65, 0x0

    .line 1856
    .line 1857
    const-wide/16 v60, 0x0

    .line 1858
    .line 1859
    const/16 v64, 0x0

    .line 1860
    .line 1861
    move-object/from16 v59, v2

    .line 1862
    .line 1863
    invoke-direct/range {v58 .. v65}, Lb2/f;-><init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    move-object/from16 v12, v58

    .line 1867
    .line 1868
    invoke-virtual {v4, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1869
    .line 1870
    .line 1871
    :cond_4a
    move-object/from16 v25, v12

    .line 1872
    .line 1873
    :goto_24
    if-nez v24, :cond_4c

    .line 1874
    .line 1875
    invoke-virtual {v10}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1876
    .line 1877
    .line 1878
    move-result v12

    .line 1879
    if-nez v12, :cond_4c

    .line 1880
    .line 1881
    invoke-virtual {v10}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v12

    .line 1885
    move-object/from16 v26, v1

    .line 1886
    .line 1887
    move-object/from16 v59, v2

    .line 1888
    .line 1889
    const/4 v1, 0x0

    .line 1890
    new-array v2, v1, [LN1/i;

    .line 1891
    .line 1892
    invoke-interface {v12, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v2

    .line 1896
    check-cast v2, [LN1/i;

    .line 1897
    .line 1898
    new-instance v12, LN1/j;

    .line 1899
    .line 1900
    const/4 v1, 0x1

    .line 1901
    invoke-direct {v12, v13, v1, v2}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 1902
    .line 1903
    .line 1904
    if-nez v26, :cond_4b

    .line 1905
    .line 1906
    invoke-static {v13, v2}, Lb2/o;->b(Ljava/lang/String;[LN1/i;)LN1/j;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v1

    .line 1910
    move-object/from16 v24, v12

    .line 1911
    .line 1912
    goto :goto_26

    .line 1913
    :cond_4b
    move-object/from16 v24, v12

    .line 1914
    .line 1915
    :goto_25
    move-object/from16 v1, v26

    .line 1916
    .line 1917
    goto :goto_26

    .line 1918
    :cond_4c
    move-object/from16 v26, v1

    .line 1919
    .line 1920
    move-object/from16 v59, v2

    .line 1921
    .line 1922
    goto :goto_25

    .line 1923
    :goto_26
    new-instance v2, Lb2/f;

    .line 1924
    .line 1925
    if-eqz v6, :cond_4d

    .line 1926
    .line 1927
    move-object/from16 v26, v6

    .line 1928
    .line 1929
    :goto_27
    move-object/from16 v41, v7

    .line 1930
    .line 1931
    move/from16 v30, v29

    .line 1932
    .line 1933
    move-object/from16 v34, v33

    .line 1934
    .line 1935
    move-object/from16 v35, v37

    .line 1936
    .line 1937
    move-wide/from16 v38, v56

    .line 1938
    .line 1939
    move-object/from16 v25, v59

    .line 1940
    .line 1941
    move-wide/from16 v36, v62

    .line 1942
    .line 1943
    move-wide/from16 v31, v67

    .line 1944
    .line 1945
    move/from16 v40, v70

    .line 1946
    .line 1947
    move-wide/from16 v28, v71

    .line 1948
    .line 1949
    move-object/from16 v27, v73

    .line 1950
    .line 1951
    move-object/from16 v33, v24

    .line 1952
    .line 1953
    move-object/from16 v24, v2

    .line 1954
    .line 1955
    goto :goto_28

    .line 1956
    :cond_4d
    move-object/from16 v26, v25

    .line 1957
    .line 1958
    goto :goto_27

    .line 1959
    :goto_28
    invoke-direct/range {v24 .. v41}, Lb2/f;-><init>(Ljava/lang/String;Lb2/f;Ljava/lang/String;JIJLN1/j;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    .line 1960
    .line 1961
    .line 1962
    move-object/from16 v2, v24

    .line 1963
    .line 1964
    move-wide/from16 v71, v28

    .line 1965
    .line 1966
    move/from16 v29, v30

    .line 1967
    .line 1968
    move-wide/from16 v67, v31

    .line 1969
    .line 1970
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1971
    .line 1972
    .line 1973
    add-long v27, v67, v71

    .line 1974
    .line 1975
    new-instance v2, Ljava/util/ArrayList;

    .line 1976
    .line 1977
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1978
    .line 1979
    .line 1980
    if-eqz v66, :cond_4e

    .line 1981
    .line 1982
    add-long v62, v36, v38

    .line 1983
    .line 1984
    goto :goto_29

    .line 1985
    :cond_4e
    move-wide/from16 v62, v36

    .line 1986
    .line 1987
    :goto_29
    move-object v7, v0

    .line 1988
    move-object/from16 v26, v1

    .line 1989
    .line 1990
    move-object/from16 v25, v6

    .line 1991
    .line 1992
    move-wide/from16 v58, v8

    .line 1993
    .line 1994
    move-object/from16 v66, v13

    .line 1995
    .line 1996
    move-object/from16 v73, v14

    .line 1997
    .line 1998
    move-wide/from16 v56, v21

    .line 1999
    .line 2000
    move-wide/from16 v67, v27

    .line 2001
    .line 2002
    move-object/from16 v24, v33

    .line 2003
    .line 2004
    move-object/from16 v33, v34

    .line 2005
    .line 2006
    move-wide/from16 v71, v46

    .line 2007
    .line 2008
    move-object/from16 v9, v77

    .line 2009
    .line 2010
    move-object/from16 v37, v79

    .line 2011
    .line 2012
    move-object/from16 v8, v80

    .line 2013
    .line 2014
    const/16 v51, 0x0

    .line 2015
    .line 2016
    const/16 v70, 0x0

    .line 2017
    .line 2018
    move-object/from16 v0, p0

    .line 2019
    .line 2020
    move-object/from16 v1, p1

    .line 2021
    .line 2022
    move-object v6, v2

    .line 2023
    move/from16 v2, v78

    .line 2024
    .line 2025
    goto/16 :goto_0

    .line 2026
    .line 2027
    :cond_4f
    move-object/from16 v26, v1

    .line 2028
    .line 2029
    move-object/from16 v34, v33

    .line 2030
    .line 2031
    move-wide/from16 v38, v56

    .line 2032
    .line 2033
    move/from16 v40, v70

    .line 2034
    .line 2035
    move-object/from16 v27, v73

    .line 2036
    .line 2037
    :goto_2a
    move-object/from16 v1, p1

    .line 2038
    .line 2039
    move-object/from16 v25, v6

    .line 2040
    .line 2041
    move-object v6, v7

    .line 2042
    move-object/from16 v66, v13

    .line 2043
    .line 2044
    move-object/from16 v73, v27

    .line 2045
    .line 2046
    move-wide/from16 v27, v30

    .line 2047
    .line 2048
    move-object/from16 v33, v34

    .line 2049
    .line 2050
    move-wide/from16 v56, v38

    .line 2051
    .line 2052
    move/from16 v70, v40

    .line 2053
    .line 2054
    move-object/from16 v9, v77

    .line 2055
    .line 2056
    move/from16 v2, v78

    .line 2057
    .line 2058
    move-object/from16 v37, v79

    .line 2059
    .line 2060
    move-object/from16 v8, v80

    .line 2061
    .line 2062
    const/16 v51, 0x0

    .line 2063
    .line 2064
    goto/16 :goto_22

    .line 2065
    .line 2066
    :cond_50
    move/from16 v78, v2

    .line 2067
    .line 2068
    move-object v0, v7

    .line 2069
    move-object/from16 v80, v8

    .line 2070
    .line 2071
    move-object/from16 v77, v9

    .line 2072
    .line 2073
    move-object v7, v6

    .line 2074
    new-instance v1, Ljava/util/HashMap;

    .line 2075
    .line 2076
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2077
    .line 2078
    .line 2079
    const/4 v6, 0x0

    .line 2080
    :goto_2b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 2081
    .line 2082
    .line 2083
    move-result v2

    .line 2084
    if-ge v6, v2, :cond_54

    .line 2085
    .line 2086
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v2

    .line 2090
    check-cast v2, Lb2/e;

    .line 2091
    .line 2092
    iget-wide v3, v2, Lb2/e;->b:J

    .line 2093
    .line 2094
    cmp-long v8, v3, v21

    .line 2095
    .line 2096
    if-nez v8, :cond_51

    .line 2097
    .line 2098
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 2099
    .line 2100
    .line 2101
    move-result v3

    .line 2102
    int-to-long v3, v3

    .line 2103
    add-long v3, v16, v3

    .line 2104
    .line 2105
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 2106
    .line 2107
    .line 2108
    move-result v8

    .line 2109
    int-to-long v8, v8

    .line 2110
    sub-long/2addr v3, v8

    .line 2111
    :cond_51
    iget v8, v2, Lb2/e;->c:I

    .line 2112
    .line 2113
    const/4 v12, -0x1

    .line 2114
    if-ne v8, v12, :cond_53

    .line 2115
    .line 2116
    cmp-long v9, v48, v44

    .line 2117
    .line 2118
    if-eqz v9, :cond_53

    .line 2119
    .line 2120
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 2121
    .line 2122
    .line 2123
    move-result v8

    .line 2124
    if-eqz v8, :cond_52

    .line 2125
    .line 2126
    invoke-static {v5}, Ll8/s;->j(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v8

    .line 2130
    check-cast v8, Lb2/f;

    .line 2131
    .line 2132
    iget-object v8, v8, Lb2/f;->m:Ll8/K;

    .line 2133
    .line 2134
    goto :goto_2c

    .line 2135
    :cond_52
    move-object v8, v7

    .line 2136
    :goto_2c
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 2137
    .line 2138
    .line 2139
    move-result v8

    .line 2140
    const/16 v76, 0x1

    .line 2141
    .line 2142
    add-int/lit8 v8, v8, -0x1

    .line 2143
    .line 2144
    goto :goto_2d

    .line 2145
    :cond_53
    const/16 v76, 0x1

    .line 2146
    .line 2147
    :goto_2d
    new-instance v9, Lb2/e;

    .line 2148
    .line 2149
    iget-object v2, v2, Lb2/e;->a:Landroid/net/Uri;

    .line 2150
    .line 2151
    invoke-direct {v9, v8, v3, v4, v2}, Lb2/e;-><init>(IJLandroid/net/Uri;)V

    .line 2152
    .line 2153
    .line 2154
    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    add-int/lit8 v6, v6, 0x1

    .line 2158
    .line 2159
    goto :goto_2b

    .line 2160
    :cond_54
    const/16 v76, 0x1

    .line 2161
    .line 2162
    if-eqz v11, :cond_55

    .line 2163
    .line 2164
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2165
    .line 2166
    .line 2167
    :cond_55
    move-object/from16 v27, v5

    .line 2168
    .line 2169
    new-instance v5, Lb2/i;

    .line 2170
    .line 2171
    cmp-long v0, v54, v46

    .line 2172
    .line 2173
    if-eqz v0, :cond_56

    .line 2174
    .line 2175
    move/from16 v25, v76

    .line 2176
    .line 2177
    :goto_2e
    move-object/from16 v30, v1

    .line 2178
    .line 2179
    move-object/from16 v28, v7

    .line 2180
    .line 2181
    move v6, v15

    .line 2182
    move-wide/from16 v9, v42

    .line 2183
    .line 2184
    move-wide/from16 v21, v48

    .line 2185
    .line 2186
    move/from16 v24, v50

    .line 2187
    .line 2188
    move/from16 v14, v52

    .line 2189
    .line 2190
    move/from16 v15, v53

    .line 2191
    .line 2192
    move-wide/from16 v12, v54

    .line 2193
    .line 2194
    move-object/from16 v29, v77

    .line 2195
    .line 2196
    move/from16 v11, v78

    .line 2197
    .line 2198
    move-object/from16 v8, v80

    .line 2199
    .line 2200
    move-object/from16 v7, p3

    .line 2201
    .line 2202
    goto :goto_2f

    .line 2203
    :cond_56
    const/16 v25, 0x0

    .line 2204
    .line 2205
    goto :goto_2e

    .line 2206
    :goto_2f
    invoke-direct/range {v5 .. v30}, Lb2/i;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLN1/j;Ljava/util/List;Ljava/util/List;Lb2/h;Ljava/util/Map;)V

    .line 2207
    .line 2208
    .line 2209
    return-object v5
.end method

.method public static e(LDd/c;Ljava/lang/String;)Lb2/l;
    .locals 37

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    new-instance v5, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v11, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v6, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v7, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v8, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v9, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v10, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v12, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v13, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v14, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    move-object/from16 v17, v10

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    :goto_0
    invoke-virtual/range {p0 .. p0}, LDd/c;->J()Z

    .line 59
    .line 60
    .line 61
    move-result v18

    .line 62
    const-string v19, "application/x-mpegURL"

    .line 63
    .line 64
    const/16 v20, 0x0

    .line 65
    .line 66
    sget-object v15, Lb2/o;->K:Ljava/util/regex/Pattern;

    .line 67
    .line 68
    sget-object v0, Lb2/o;->P:Ljava/util/regex/Pattern;

    .line 69
    .line 70
    const/16 v21, 0x2

    .line 71
    .line 72
    if-eqz v18, :cond_12

    .line 73
    .line 74
    invoke-virtual/range {p0 .. p0}, LDd/c;->M()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "#EXT"

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_0
    const-string v3, "#EXT-X-I-FRAME-STREAM-INF"

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const-string v4, "#EXT-X-DEFINE"

    .line 96
    .line 97
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_1

    .line 102
    .line 103
    invoke-static {v2, v0, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v3, Lb2/o;->Z:Ljava/util/regex/Pattern;

    .line 108
    .line 109
    invoke-static {v2, v3, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v11, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_1
    const-string v0, "#EXT-X-INDEPENDENT-SEGMENTS"

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    move-object/from16 v36, v7

    .line 127
    .line 128
    move-object/from16 v35, v8

    .line 129
    .line 130
    move-object/from16 v34, v9

    .line 131
    .line 132
    move-object/from16 v32, v13

    .line 133
    .line 134
    move-object/from16 v33, v14

    .line 135
    .line 136
    const/4 v10, 0x1

    .line 137
    goto/16 :goto_c

    .line 138
    .line 139
    :cond_2
    const-string v0, "#EXT-X-MEDIA"

    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_3
    const-string v0, "#EXT-X-SESSION-KEY"

    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_6

    .line 158
    .line 159
    sget-object v0, Lb2/o;->I:Ljava/util/regex/Pattern;

    .line 160
    .line 161
    const-string v3, "identity"

    .line 162
    .line 163
    invoke-static {v2, v0, v3, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v2, v0, v11}, Lb2/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)LN1/i;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    sget-object v3, Lb2/o;->H:Ljava/util/regex/Pattern;

    .line 174
    .line 175
    invoke-static {v2, v3, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const-string v3, "SAMPLE-AES-CENC"

    .line 180
    .line 181
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_5

    .line 186
    .line 187
    const-string v3, "SAMPLE-AES-CTR"

    .line 188
    .line 189
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_4

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_4
    const-string v2, "cbcs"

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_5
    :goto_1
    const-string v2, "cenc"

    .line 200
    .line 201
    :goto_2
    new-instance v3, LN1/j;

    .line 202
    .line 203
    const/4 v4, 0x1

    .line 204
    new-array v15, v4, [LN1/i;

    .line 205
    .line 206
    aput-object v0, v15, v20

    .line 207
    .line 208
    invoke-direct {v3, v2, v4, v15}, LN1/j;-><init>(Ljava/lang/String;Z[LN1/i;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_6
    const-string v0, "#EXT-X-STREAM-INF"

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_8

    .line 222
    .line 223
    if-eqz v3, :cond_7

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_7
    :goto_3
    move-object/from16 v36, v7

    .line 227
    .line 228
    move-object/from16 v35, v8

    .line 229
    .line 230
    move-object/from16 v34, v9

    .line 231
    .line 232
    move-object/from16 v32, v13

    .line 233
    .line 234
    move-object/from16 v33, v14

    .line 235
    .line 236
    goto/16 :goto_c

    .line 237
    .line 238
    :cond_8
    :goto_4
    const-string v0, "CLOSED-CAPTIONS=NONE"

    .line 239
    .line 240
    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    or-int v16, v16, v0

    .line 245
    .line 246
    if-eqz v3, :cond_9

    .line 247
    .line 248
    const/16 v0, 0x4000

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_9
    move/from16 v0, v20

    .line 252
    .line 253
    :goto_5
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 254
    .line 255
    move/from16 v23, v3

    .line 256
    .line 257
    sget-object v3, Lb2/o;->h:Ljava/util/regex/Pattern;

    .line 258
    .line 259
    invoke-static {v2, v3, v4}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    sget-object v4, Lb2/o;->c:Ljava/util/regex/Pattern;

    .line 268
    .line 269
    invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 274
    .line 275
    .line 276
    move-result v24

    .line 277
    if-eqz v24, :cond_a

    .line 278
    .line 279
    move/from16 v31, v10

    .line 280
    .line 281
    const/4 v10, 0x1

    .line 282
    invoke-virtual {v4, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    goto :goto_6

    .line 294
    :cond_a
    move/from16 v31, v10

    .line 295
    .line 296
    const/4 v4, -0x1

    .line 297
    :goto_6
    sget-object v10, Lb2/o;->j:Ljava/util/regex/Pattern;

    .line 298
    .line 299
    move-object/from16 v32, v13

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    invoke-static {v2, v10, v13, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    move-object/from16 v33, v14

    .line 307
    .line 308
    sget-object v14, Lb2/o;->k:Ljava/util/regex/Pattern;

    .line 309
    .line 310
    invoke-static {v2, v14, v13, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v14

    .line 314
    if-eqz v14, :cond_b

    .line 315
    .line 316
    sget v13, LQ1/x;->a:I

    .line 317
    .line 318
    const-string v13, "x"

    .line 319
    .line 320
    move-object/from16 v34, v9

    .line 321
    .line 322
    const/4 v9, -0x1

    .line 323
    invoke-virtual {v14, v13, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    aget-object v9, v13, v20

    .line 328
    .line 329
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    const/16 v22, 0x1

    .line 334
    .line 335
    aget-object v13, v13, v22

    .line 336
    .line 337
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v13

    .line 341
    if-lez v9, :cond_c

    .line 342
    .line 343
    if-gtz v13, :cond_d

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_b
    move-object/from16 v34, v9

    .line 347
    .line 348
    :cond_c
    :goto_7
    const/4 v9, -0x1

    .line 349
    const/4 v13, -0x1

    .line 350
    :cond_d
    sget-object v14, Lb2/o;->l:Ljava/util/regex/Pattern;

    .line 351
    .line 352
    move-object/from16 v35, v8

    .line 353
    .line 354
    const/4 v8, 0x0

    .line 355
    invoke-static {v2, v14, v8, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    if-eqz v14, :cond_e

    .line 360
    .line 361
    invoke-static {v14}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    :goto_8
    move-object/from16 v36, v7

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_e
    const/high16 v14, -0x40800000    # -1.0f

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :goto_9
    sget-object v7, Lb2/o;->d:Ljava/util/regex/Pattern;

    .line 372
    .line 373
    invoke-static {v2, v7, v8, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v27

    .line 377
    sget-object v7, Lb2/o;->e:Ljava/util/regex/Pattern;

    .line 378
    .line 379
    invoke-static {v2, v7, v8, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v28

    .line 383
    sget-object v7, Lb2/o;->f:Ljava/util/regex/Pattern;

    .line 384
    .line 385
    invoke-static {v2, v7, v8, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v29

    .line 389
    sget-object v7, Lb2/o;->g:Ljava/util/regex/Pattern;

    .line 390
    .line 391
    invoke-static {v2, v7, v8, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v30

    .line 395
    if-eqz v23, :cond_f

    .line 396
    .line 397
    invoke-static {v2, v15, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-static {v1, v2}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    :goto_a
    move-object/from16 v25, v2

    .line 406
    .line 407
    goto :goto_b

    .line 408
    :cond_f
    invoke-virtual/range {p0 .. p0}, LDd/c;->J()Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_11

    .line 413
    .line 414
    invoke-virtual/range {p0 .. p0}, LDd/c;->M()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    invoke-static {v2, v11}, Lb2/o;->k(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {v1, v2}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    goto :goto_a

    .line 427
    :goto_b
    new-instance v2, LN1/m;

    .line 428
    .line 429
    invoke-direct {v2}, LN1/m;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v7

    .line 436
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    iput-object v7, v2, LN1/m;->a:Ljava/lang/String;

    .line 441
    .line 442
    invoke-static/range {v19 .. v19}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    iput-object v7, v2, LN1/m;->l:Ljava/lang/String;

    .line 447
    .line 448
    iput-object v10, v2, LN1/m;->j:Ljava/lang/String;

    .line 449
    .line 450
    iput v4, v2, LN1/m;->h:I

    .line 451
    .line 452
    iput v3, v2, LN1/m;->i:I

    .line 453
    .line 454
    iput v9, v2, LN1/m;->t:I

    .line 455
    .line 456
    iput v13, v2, LN1/m;->u:I

    .line 457
    .line 458
    iput v14, v2, LN1/m;->v:F

    .line 459
    .line 460
    iput v0, v2, LN1/m;->f:I

    .line 461
    .line 462
    new-instance v0, LN1/n;

    .line 463
    .line 464
    invoke-direct {v0, v2}, LN1/n;-><init>(LN1/m;)V

    .line 465
    .line 466
    .line 467
    new-instance v24, Lb2/k;

    .line 468
    .line 469
    move-object/from16 v26, v0

    .line 470
    .line 471
    invoke-direct/range {v24 .. v30}, Lb2/k;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    move-object/from16 v0, v24

    .line 475
    .line 476
    move-object/from16 v2, v25

    .line 477
    .line 478
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, Ljava/util/ArrayList;

    .line 486
    .line 487
    if-nez v0, :cond_10

    .line 488
    .line 489
    new-instance v0, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    :cond_10
    new-instance v24, La2/t;

    .line 498
    .line 499
    move/from16 v26, v3

    .line 500
    .line 501
    move/from16 v25, v4

    .line 502
    .line 503
    invoke-direct/range {v24 .. v30}, La2/t;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v2, v24

    .line 507
    .line 508
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move/from16 v10, v31

    .line 512
    .line 513
    :goto_c
    move-object/from16 v13, v32

    .line 514
    .line 515
    move-object/from16 v14, v33

    .line 516
    .line 517
    move-object/from16 v9, v34

    .line 518
    .line 519
    move-object/from16 v8, v35

    .line 520
    .line 521
    move-object/from16 v7, v36

    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :cond_11
    const-string v0, "#EXT-X-STREAM-INF must be followed by another line"

    .line 526
    .line 527
    const/4 v8, 0x0

    .line 528
    invoke-static {v0, v8}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    throw v0

    .line 533
    :cond_12
    move-object/from16 v36, v7

    .line 534
    .line 535
    move-object/from16 v35, v8

    .line 536
    .line 537
    move-object/from16 v34, v9

    .line 538
    .line 539
    move/from16 v31, v10

    .line 540
    .line 541
    move-object/from16 v32, v13

    .line 542
    .line 543
    move-object/from16 v33, v14

    .line 544
    .line 545
    new-instance v3, Ljava/util/ArrayList;

    .line 546
    .line 547
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 548
    .line 549
    .line 550
    new-instance v2, Ljava/util/HashSet;

    .line 551
    .line 552
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 553
    .line 554
    .line 555
    move/from16 v4, v20

    .line 556
    .line 557
    :goto_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 558
    .line 559
    .line 560
    move-result v7

    .line 561
    if-ge v4, v7, :cond_15

    .line 562
    .line 563
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v7

    .line 567
    check-cast v7, Lb2/k;

    .line 568
    .line 569
    iget-object v8, v7, Lb2/k;->a:Landroid/net/Uri;

    .line 570
    .line 571
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v8

    .line 575
    if-eqz v8, :cond_14

    .line 576
    .line 577
    iget-object v8, v7, Lb2/k;->b:LN1/n;

    .line 578
    .line 579
    iget-object v9, v8, LN1/n;->l:LN1/B;

    .line 580
    .line 581
    if-nez v9, :cond_13

    .line 582
    .line 583
    const/4 v9, 0x1

    .line 584
    goto :goto_e

    .line 585
    :cond_13
    move/from16 v9, v20

    .line 586
    .line 587
    :goto_e
    invoke-static {v9}, LQ1/k;->g(Z)V

    .line 588
    .line 589
    .line 590
    new-instance v9, La2/u;

    .line 591
    .line 592
    iget-object v10, v7, Lb2/k;->a:Landroid/net/Uri;

    .line 593
    .line 594
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v10

    .line 598
    check-cast v10, Ljava/util/ArrayList;

    .line 599
    .line 600
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    invoke-direct {v9, v13, v13, v10}, La2/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 605
    .line 606
    .line 607
    new-instance v10, LN1/B;

    .line 608
    .line 609
    const/4 v13, 0x1

    .line 610
    new-array v14, v13, [LN1/A;

    .line 611
    .line 612
    aput-object v9, v14, v20

    .line 613
    .line 614
    invoke-direct {v10, v14}, LN1/B;-><init>([LN1/A;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v8}, LN1/n;->a()LN1/m;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    iput-object v10, v8, LN1/m;->k:LN1/B;

    .line 622
    .line 623
    new-instance v9, LN1/n;

    .line 624
    .line 625
    invoke-direct {v9, v8}, LN1/n;-><init>(LN1/m;)V

    .line 626
    .line 627
    .line 628
    new-instance v23, Lb2/k;

    .line 629
    .line 630
    iget-object v8, v7, Lb2/k;->e:Ljava/lang/String;

    .line 631
    .line 632
    iget-object v10, v7, Lb2/k;->f:Ljava/lang/String;

    .line 633
    .line 634
    iget-object v13, v7, Lb2/k;->a:Landroid/net/Uri;

    .line 635
    .line 636
    iget-object v14, v7, Lb2/k;->c:Ljava/lang/String;

    .line 637
    .line 638
    iget-object v7, v7, Lb2/k;->d:Ljava/lang/String;

    .line 639
    .line 640
    move-object/from16 v27, v7

    .line 641
    .line 642
    move-object/from16 v28, v8

    .line 643
    .line 644
    move-object/from16 v25, v9

    .line 645
    .line 646
    move-object/from16 v29, v10

    .line 647
    .line 648
    move-object/from16 v24, v13

    .line 649
    .line 650
    move-object/from16 v26, v14

    .line 651
    .line 652
    invoke-direct/range {v23 .. v29}, Lb2/k;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    move-object/from16 v7, v23

    .line 656
    .line 657
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    :cond_14
    const/16 v22, 0x1

    .line 661
    .line 662
    add-int/lit8 v4, v4, 0x1

    .line 663
    .line 664
    goto :goto_d

    .line 665
    :cond_15
    move/from16 v2, v20

    .line 666
    .line 667
    const/4 v8, 0x0

    .line 668
    const/4 v13, 0x0

    .line 669
    :goto_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    if-ge v2, v4, :cond_33

    .line 674
    .line 675
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    check-cast v4, Ljava/lang/String;

    .line 680
    .line 681
    sget-object v5, Lb2/o;->Q:Ljava/util/regex/Pattern;

    .line 682
    .line 683
    invoke-static {v4, v5, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    invoke-static {v4, v0, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v7

    .line 691
    new-instance v9, LN1/m;

    .line 692
    .line 693
    invoke-direct {v9}, LN1/m;-><init>()V

    .line 694
    .line 695
    .line 696
    const-string v10, ":"

    .line 697
    .line 698
    invoke-static {v5, v10, v7}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    iput-object v10, v9, LN1/m;->a:Ljava/lang/String;

    .line 703
    .line 704
    iput-object v7, v9, LN1/m;->b:Ljava/lang/String;

    .line 705
    .line 706
    invoke-static/range {v19 .. v19}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v10

    .line 710
    iput-object v10, v9, LN1/m;->l:Ljava/lang/String;

    .line 711
    .line 712
    sget-object v10, Lb2/o;->U:Ljava/util/regex/Pattern;

    .line 713
    .line 714
    invoke-static {v4, v10}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 715
    .line 716
    .line 717
    move-result v10

    .line 718
    sget-object v14, Lb2/o;->V:Ljava/util/regex/Pattern;

    .line 719
    .line 720
    invoke-static {v4, v14}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 721
    .line 722
    .line 723
    move-result v14

    .line 724
    if-eqz v14, :cond_16

    .line 725
    .line 726
    or-int/lit8 v10, v10, 0x2

    .line 727
    .line 728
    :cond_16
    sget-object v14, Lb2/o;->T:Ljava/util/regex/Pattern;

    .line 729
    .line 730
    invoke-static {v4, v14}, Lb2/o;->f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z

    .line 731
    .line 732
    .line 733
    move-result v14

    .line 734
    if-eqz v14, :cond_17

    .line 735
    .line 736
    or-int/lit8 v10, v10, 0x4

    .line 737
    .line 738
    :cond_17
    iput v10, v9, LN1/m;->e:I

    .line 739
    .line 740
    sget-object v10, Lb2/o;->R:Ljava/util/regex/Pattern;

    .line 741
    .line 742
    const/4 v14, 0x0

    .line 743
    invoke-static {v4, v10, v14, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v10

    .line 747
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 748
    .line 749
    .line 750
    move-result v14

    .line 751
    if-eqz v14, :cond_18

    .line 752
    .line 753
    move-object/from16 v23, v0

    .line 754
    .line 755
    move/from16 v14, v20

    .line 756
    .line 757
    goto :goto_11

    .line 758
    :cond_18
    sget v14, LQ1/x;->a:I

    .line 759
    .line 760
    const-string v14, ","

    .line 761
    .line 762
    move-object/from16 v23, v0

    .line 763
    .line 764
    const/4 v0, -0x1

    .line 765
    invoke-virtual {v10, v14, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v10

    .line 769
    const-string v14, "public.accessibility.describes-video"

    .line 770
    .line 771
    invoke-static {v14, v10}, LQ1/x;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v14

    .line 775
    if-eqz v14, :cond_19

    .line 776
    .line 777
    const/16 v14, 0x200

    .line 778
    .line 779
    goto :goto_10

    .line 780
    :cond_19
    move/from16 v14, v20

    .line 781
    .line 782
    :goto_10
    const-string v0, "public.accessibility.transcribes-spoken-dialog"

    .line 783
    .line 784
    invoke-static {v0, v10}, LQ1/x;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-eqz v0, :cond_1a

    .line 789
    .line 790
    or-int/lit16 v14, v14, 0x1000

    .line 791
    .line 792
    :cond_1a
    const-string v0, "public.accessibility.describes-music-and-sound"

    .line 793
    .line 794
    invoke-static {v0, v10}, LQ1/x;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    if-eqz v0, :cond_1b

    .line 799
    .line 800
    or-int/lit16 v14, v14, 0x400

    .line 801
    .line 802
    :cond_1b
    const-string v0, "public.easy-to-read"

    .line 803
    .line 804
    invoke-static {v0, v10}, LQ1/x;->k(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    if-eqz v0, :cond_1c

    .line 809
    .line 810
    or-int/lit16 v14, v14, 0x2000

    .line 811
    .line 812
    :cond_1c
    :goto_11
    iput v14, v9, LN1/m;->f:I

    .line 813
    .line 814
    sget-object v0, Lb2/o;->O:Ljava/util/regex/Pattern;

    .line 815
    .line 816
    const/4 v14, 0x0

    .line 817
    invoke-static {v4, v0, v14, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iput-object v0, v9, LN1/m;->d:Ljava/lang/String;

    .line 822
    .line 823
    invoke-static {v4, v15, v14, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    if-nez v0, :cond_1d

    .line 828
    .line 829
    const/4 v0, 0x0

    .line 830
    goto :goto_12

    .line 831
    :cond_1d
    invoke-static {v1, v0}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    :goto_12
    new-instance v10, LN1/B;

    .line 836
    .line 837
    new-instance v14, La2/u;

    .line 838
    .line 839
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 840
    .line 841
    invoke-direct {v14, v5, v7, v1}, La2/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 842
    .line 843
    .line 844
    move/from16 v24, v2

    .line 845
    .line 846
    const/4 v1, 0x1

    .line 847
    new-array v2, v1, [LN1/A;

    .line 848
    .line 849
    aput-object v14, v2, v20

    .line 850
    .line 851
    invoke-direct {v10, v2}, LN1/B;-><init>([LN1/A;)V

    .line 852
    .line 853
    .line 854
    sget-object v1, Lb2/o;->M:Ljava/util/regex/Pattern;

    .line 855
    .line 856
    invoke-static {v4, v1, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 861
    .line 862
    .line 863
    move-result v2

    .line 864
    sparse-switch v2, :sswitch_data_0

    .line 865
    .line 866
    .line 867
    :goto_13
    const/4 v1, -0x1

    .line 868
    goto :goto_14

    .line 869
    :sswitch_0
    const-string v2, "VIDEO"

    .line 870
    .line 871
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v1

    .line 875
    if-nez v1, :cond_1e

    .line 876
    .line 877
    goto :goto_13

    .line 878
    :cond_1e
    const/4 v1, 0x3

    .line 879
    goto :goto_14

    .line 880
    :sswitch_1
    const-string v2, "AUDIO"

    .line 881
    .line 882
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v1

    .line 886
    if-nez v1, :cond_1f

    .line 887
    .line 888
    goto :goto_13

    .line 889
    :cond_1f
    move/from16 v1, v21

    .line 890
    .line 891
    goto :goto_14

    .line 892
    :sswitch_2
    const-string v2, "CLOSED-CAPTIONS"

    .line 893
    .line 894
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    if-nez v1, :cond_20

    .line 899
    .line 900
    goto :goto_13

    .line 901
    :cond_20
    const/4 v1, 0x1

    .line 902
    goto :goto_14

    .line 903
    :sswitch_3
    const-string v2, "SUBTITLES"

    .line 904
    .line 905
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-nez v1, :cond_21

    .line 910
    .line 911
    goto :goto_13

    .line 912
    :cond_21
    move/from16 v1, v20

    .line 913
    .line 914
    :goto_14
    packed-switch v1, :pswitch_data_0

    .line 915
    .line 916
    .line 917
    :goto_15
    move-object/from16 v0, v34

    .line 918
    .line 919
    move-object/from16 v2, v35

    .line 920
    .line 921
    goto/16 :goto_1d

    .line 922
    .line 923
    :pswitch_0
    move/from16 v1, v20

    .line 924
    .line 925
    :goto_16
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 926
    .line 927
    .line 928
    move-result v2

    .line 929
    if-ge v1, v2, :cond_23

    .line 930
    .line 931
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    check-cast v2, Lb2/k;

    .line 936
    .line 937
    iget-object v4, v2, Lb2/k;->c:Ljava/lang/String;

    .line 938
    .line 939
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 940
    .line 941
    .line 942
    move-result v4

    .line 943
    if-eqz v4, :cond_22

    .line 944
    .line 945
    goto :goto_17

    .line 946
    :cond_22
    const/16 v22, 0x1

    .line 947
    .line 948
    add-int/lit8 v1, v1, 0x1

    .line 949
    .line 950
    goto :goto_16

    .line 951
    :cond_23
    const/4 v2, 0x0

    .line 952
    :goto_17
    if-eqz v2, :cond_24

    .line 953
    .line 954
    iget-object v1, v2, Lb2/k;->b:LN1/n;

    .line 955
    .line 956
    iget-object v2, v1, LN1/n;->k:Ljava/lang/String;

    .line 957
    .line 958
    move/from16 v4, v21

    .line 959
    .line 960
    invoke-static {v4, v2}, LQ1/x;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v2

    .line 964
    iput-object v2, v9, LN1/m;->j:Ljava/lang/String;

    .line 965
    .line 966
    invoke-static {v2}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    iput-object v2, v9, LN1/m;->m:Ljava/lang/String;

    .line 975
    .line 976
    iget v2, v1, LN1/n;->u:I

    .line 977
    .line 978
    iput v2, v9, LN1/m;->t:I

    .line 979
    .line 980
    iget v2, v1, LN1/n;->v:I

    .line 981
    .line 982
    iput v2, v9, LN1/m;->u:I

    .line 983
    .line 984
    iget v1, v1, LN1/n;->w:F

    .line 985
    .line 986
    iput v1, v9, LN1/m;->v:F

    .line 987
    .line 988
    :cond_24
    if-nez v0, :cond_25

    .line 989
    .line 990
    goto :goto_15

    .line 991
    :cond_25
    iput-object v10, v9, LN1/m;->k:LN1/B;

    .line 992
    .line 993
    new-instance v1, Lb2/j;

    .line 994
    .line 995
    new-instance v2, LN1/n;

    .line 996
    .line 997
    invoke-direct {v2, v9}, LN1/n;-><init>(LN1/m;)V

    .line 998
    .line 999
    .line 1000
    invoke-direct {v1, v0, v2, v7}, Lb2/j;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    move-object/from16 v2, v36

    .line 1004
    .line 1005
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    goto :goto_15

    .line 1009
    :pswitch_1
    move-object/from16 v2, v36

    .line 1010
    .line 1011
    move/from16 v1, v20

    .line 1012
    .line 1013
    :goto_18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1014
    .line 1015
    .line 1016
    move-result v14

    .line 1017
    if-ge v1, v14, :cond_27

    .line 1018
    .line 1019
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v14

    .line 1023
    check-cast v14, Lb2/k;

    .line 1024
    .line 1025
    move/from16 v25, v1

    .line 1026
    .line 1027
    iget-object v1, v14, Lb2/k;->d:Ljava/lang/String;

    .line 1028
    .line 1029
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v1

    .line 1033
    if-eqz v1, :cond_26

    .line 1034
    .line 1035
    :goto_19
    const/4 v1, 0x1

    .line 1036
    goto :goto_1a

    .line 1037
    :cond_26
    const/4 v1, 0x1

    .line 1038
    add-int/lit8 v14, v25, 0x1

    .line 1039
    .line 1040
    move v1, v14

    .line 1041
    goto :goto_18

    .line 1042
    :cond_27
    const/4 v14, 0x0

    .line 1043
    goto :goto_19

    .line 1044
    :goto_1a
    if-eqz v14, :cond_28

    .line 1045
    .line 1046
    iget-object v5, v14, Lb2/k;->b:LN1/n;

    .line 1047
    .line 1048
    iget-object v5, v5, LN1/n;->k:Ljava/lang/String;

    .line 1049
    .line 1050
    invoke-static {v1, v5}, LQ1/x;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v5

    .line 1054
    iput-object v5, v9, LN1/m;->j:Ljava/lang/String;

    .line 1055
    .line 1056
    invoke-static {v5}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    goto :goto_1b

    .line 1061
    :cond_28
    const/4 v1, 0x0

    .line 1062
    :goto_1b
    sget-object v5, Lb2/o;->i:Ljava/util/regex/Pattern;

    .line 1063
    .line 1064
    move-object/from16 v36, v2

    .line 1065
    .line 1066
    const/4 v2, 0x0

    .line 1067
    invoke-static {v4, v5, v2, v11}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v4

    .line 1071
    if-eqz v4, :cond_29

    .line 1072
    .line 1073
    sget v5, LQ1/x;->a:I

    .line 1074
    .line 1075
    const-string v5, "/"

    .line 1076
    .line 1077
    const/4 v2, 0x2

    .line 1078
    invoke-virtual {v4, v5, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v5

    .line 1082
    aget-object v2, v5, v20

    .line 1083
    .line 1084
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1085
    .line 1086
    .line 1087
    move-result v2

    .line 1088
    iput v2, v9, LN1/m;->B:I

    .line 1089
    .line 1090
    const-string v2, "audio/eac3"

    .line 1091
    .line 1092
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v2

    .line 1096
    if-eqz v2, :cond_29

    .line 1097
    .line 1098
    const-string v2, "/JOC"

    .line 1099
    .line 1100
    invoke-virtual {v4, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v2

    .line 1104
    if-eqz v2, :cond_29

    .line 1105
    .line 1106
    const-string v1, "ec+3"

    .line 1107
    .line 1108
    iput-object v1, v9, LN1/m;->j:Ljava/lang/String;

    .line 1109
    .line 1110
    const-string v1, "audio/eac3-joc"

    .line 1111
    .line 1112
    :cond_29
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v1

    .line 1116
    iput-object v1, v9, LN1/m;->m:Ljava/lang/String;

    .line 1117
    .line 1118
    if-eqz v0, :cond_2b

    .line 1119
    .line 1120
    iput-object v10, v9, LN1/m;->k:LN1/B;

    .line 1121
    .line 1122
    new-instance v1, Lb2/j;

    .line 1123
    .line 1124
    new-instance v2, LN1/n;

    .line 1125
    .line 1126
    invoke-direct {v2, v9}, LN1/n;-><init>(LN1/m;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-direct {v1, v0, v2, v7}, Lb2/j;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;)V

    .line 1130
    .line 1131
    .line 1132
    move-object/from16 v2, v35

    .line 1133
    .line 1134
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1135
    .line 1136
    .line 1137
    :cond_2a
    move-object/from16 v0, v34

    .line 1138
    .line 1139
    goto :goto_1d

    .line 1140
    :cond_2b
    move-object/from16 v2, v35

    .line 1141
    .line 1142
    if-eqz v14, :cond_2a

    .line 1143
    .line 1144
    new-instance v0, LN1/n;

    .line 1145
    .line 1146
    invoke-direct {v0, v9}, LN1/n;-><init>(LN1/m;)V

    .line 1147
    .line 1148
    .line 1149
    move-object v8, v0

    .line 1150
    :goto_1c
    move-object/from16 v0, v34

    .line 1151
    .line 1152
    :goto_1d
    const/4 v4, 0x3

    .line 1153
    :goto_1e
    const/16 v22, 0x1

    .line 1154
    .line 1155
    goto/16 :goto_23

    .line 1156
    .line 1157
    :pswitch_2
    move-object/from16 v2, v35

    .line 1158
    .line 1159
    sget-object v0, Lb2/o;->S:Ljava/util/regex/Pattern;

    .line 1160
    .line 1161
    invoke-static {v4, v0, v11}, Lb2/o;->j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    const-string v1, "CC"

    .line 1166
    .line 1167
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    if-eqz v1, :cond_2c

    .line 1172
    .line 1173
    const/4 v4, 0x2

    .line 1174
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1179
    .line 1180
    .line 1181
    move-result v0

    .line 1182
    const-string v1, "application/cea-608"

    .line 1183
    .line 1184
    goto :goto_1f

    .line 1185
    :cond_2c
    const/4 v4, 0x2

    .line 1186
    const/4 v1, 0x7

    .line 1187
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v0

    .line 1195
    const-string v1, "application/cea-708"

    .line 1196
    .line 1197
    :goto_1f
    if-nez v13, :cond_2d

    .line 1198
    .line 1199
    new-instance v13, Ljava/util/ArrayList;

    .line 1200
    .line 1201
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1202
    .line 1203
    .line 1204
    :cond_2d
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    iput-object v1, v9, LN1/m;->m:Ljava/lang/String;

    .line 1209
    .line 1210
    iput v0, v9, LN1/m;->G:I

    .line 1211
    .line 1212
    new-instance v0, LN1/n;

    .line 1213
    .line 1214
    invoke-direct {v0, v9}, LN1/n;-><init>(LN1/m;)V

    .line 1215
    .line 1216
    .line 1217
    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    goto :goto_1c

    .line 1221
    :pswitch_3
    move/from16 v4, v21

    .line 1222
    .line 1223
    move-object/from16 v2, v35

    .line 1224
    .line 1225
    move/from16 v1, v20

    .line 1226
    .line 1227
    :goto_20
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1228
    .line 1229
    .line 1230
    move-result v14

    .line 1231
    if-ge v1, v14, :cond_2f

    .line 1232
    .line 1233
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v14

    .line 1237
    check-cast v14, Lb2/k;

    .line 1238
    .line 1239
    iget-object v4, v14, Lb2/k;->e:Ljava/lang/String;

    .line 1240
    .line 1241
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v4

    .line 1245
    if-eqz v4, :cond_2e

    .line 1246
    .line 1247
    goto :goto_21

    .line 1248
    :cond_2e
    const/16 v22, 0x1

    .line 1249
    .line 1250
    add-int/lit8 v1, v1, 0x1

    .line 1251
    .line 1252
    const/4 v4, 0x2

    .line 1253
    goto :goto_20

    .line 1254
    :cond_2f
    const/4 v14, 0x0

    .line 1255
    :goto_21
    if-eqz v14, :cond_30

    .line 1256
    .line 1257
    iget-object v1, v14, Lb2/k;->b:LN1/n;

    .line 1258
    .line 1259
    iget-object v1, v1, LN1/n;->k:Ljava/lang/String;

    .line 1260
    .line 1261
    const/4 v4, 0x3

    .line 1262
    invoke-static {v4, v1}, LQ1/x;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    iput-object v1, v9, LN1/m;->j:Ljava/lang/String;

    .line 1267
    .line 1268
    invoke-static {v1}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v1

    .line 1272
    goto :goto_22

    .line 1273
    :cond_30
    const/4 v4, 0x3

    .line 1274
    const/4 v1, 0x0

    .line 1275
    :goto_22
    if-nez v1, :cond_31

    .line 1276
    .line 1277
    const-string v1, "text/vtt"

    .line 1278
    .line 1279
    :cond_31
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v1

    .line 1283
    iput-object v1, v9, LN1/m;->m:Ljava/lang/String;

    .line 1284
    .line 1285
    iput-object v10, v9, LN1/m;->k:LN1/B;

    .line 1286
    .line 1287
    if-eqz v0, :cond_32

    .line 1288
    .line 1289
    new-instance v1, Lb2/j;

    .line 1290
    .line 1291
    new-instance v5, LN1/n;

    .line 1292
    .line 1293
    invoke-direct {v5, v9}, LN1/n;-><init>(LN1/m;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-direct {v1, v0, v5, v7}, Lb2/j;-><init>(Landroid/net/Uri;LN1/n;Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    move-object/from16 v0, v34

    .line 1300
    .line 1301
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    goto/16 :goto_1e

    .line 1305
    .line 1306
    :cond_32
    move-object/from16 v0, v34

    .line 1307
    .line 1308
    const-string v1, "HlsPlaylistParser"

    .line 1309
    .line 1310
    const-string v5, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping"

    .line 1311
    .line 1312
    invoke-static {v1, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    goto/16 :goto_1e

    .line 1316
    .line 1317
    :goto_23
    add-int/lit8 v1, v24, 0x1

    .line 1318
    .line 1319
    move-object/from16 v34, v0

    .line 1320
    .line 1321
    move-object/from16 v35, v2

    .line 1322
    .line 1323
    move-object/from16 v0, v23

    .line 1324
    .line 1325
    const/16 v21, 0x2

    .line 1326
    .line 1327
    move v2, v1

    .line 1328
    move-object/from16 v1, p1

    .line 1329
    .line 1330
    goto/16 :goto_f

    .line 1331
    .line 1332
    :cond_33
    move-object/from16 v0, v34

    .line 1333
    .line 1334
    move-object/from16 v2, v35

    .line 1335
    .line 1336
    if-eqz v16, :cond_34

    .line 1337
    .line 1338
    sget-object v13, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1339
    .line 1340
    :cond_34
    move-object/from16 v34, v0

    .line 1341
    .line 1342
    move-object v9, v13

    .line 1343
    new-instance v0, Lb2/l;

    .line 1344
    .line 1345
    move-object/from16 v1, p1

    .line 1346
    .line 1347
    move-object v5, v2

    .line 1348
    move-object/from16 v7, v17

    .line 1349
    .line 1350
    move/from16 v10, v31

    .line 1351
    .line 1352
    move-object/from16 v12, v32

    .line 1353
    .line 1354
    move-object/from16 v2, v33

    .line 1355
    .line 1356
    move-object/from16 v6, v34

    .line 1357
    .line 1358
    move-object/from16 v4, v36

    .line 1359
    .line 1360
    invoke-direct/range {v0 .. v12}, Lb2/l;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LN1/n;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 1361
    .line 1362
    .line 1363
    return-object v0

    .line 1364
    nop

    .line 1365
    :sswitch_data_0
    .sparse-switch
        -0x392db8c5 -> :sswitch_3
        -0x13dc6572 -> :sswitch_2
        0x3bba3b6 -> :sswitch_1
        0x4de1c5b -> :sswitch_0
    .end sparse-switch

    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Ljava/lang/String;Ljava/util/regex/Pattern;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "YES"

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static g(Ljava/lang/String;Ljava/util/regex/Pattern;)D
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    const-wide/high16 p0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 25
    .line 26
    return-wide p0
.end method

.method public static h(Ljava/lang/String;Ljava/util/regex/Pattern;)J
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_0
    const-wide/16 p0, -0x1

    .line 25
    .line 26
    return-wide p0
.end method

.method public static i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {p2, p3}, Lb2/o;->k(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    :goto_0
    return-object p2
.end method

.method public static j(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0, p2}, Lb2/o;->i(Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p2

    .line 9
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "Couldn\'t match "

    .line 12
    .line 13
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " in "

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0, v0}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0
.end method

.method public static k(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lb2/o;->b0:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 10
    .line 11
    .line 12
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method


# virtual methods
.method public final t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0xef

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v2, 0xbb

    .line 30
    .line 31
    if-ne v1, v2, :cond_6

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0xbf

    .line 38
    .line 39
    if-eq v1, v2, :cond_0

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    :cond_1
    :goto_0
    const/4 v2, -0x1

    .line 47
    if-eq v1, v2, :cond_2

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v4, v3

    .line 61
    :goto_1
    const/4 v5, 0x7

    .line 62
    if-ge v4, v5, :cond_4

    .line 63
    .line 64
    const-string v5, "#EXTM3U"

    .line 65
    .line 66
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eq v1, v5, :cond_3

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    :goto_2
    if-eq v1, v2, :cond_5

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-static {v1}, LQ1/x;->H(I)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/io/BufferedReader;->read()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-static {v1}, LQ1/x;->H(I)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    :cond_6
    :goto_3
    const/4 v1, 0x0

    .line 104
    if-eqz v3, :cond_c

    .line 105
    .line 106
    :goto_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_b

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    const-string v3, "#EXT-X-STREAM-INF"

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    new-instance v1, LDd/c;

    .line 135
    .line 136
    invoke-direct {v1, p2, v0}, LDd/c;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v1, p1}, Lb2/o;->e(LDd/c;Ljava/lang/String;)Lb2/l;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 148
    .line 149
    .line 150
    return-object p1

    .line 151
    :catchall_0
    move-exception p1

    .line 152
    goto :goto_6

    .line 153
    :cond_8
    :try_start_1
    const-string v3, "#EXT-X-TARGETDURATION"

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_a

    .line 160
    .line 161
    const-string v3, "#EXT-X-MEDIA-SEQUENCE"

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    const-string v3, "#EXTINF"

    .line 170
    .line 171
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_a

    .line 176
    .line 177
    const-string v3, "#EXT-X-KEY"

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-nez v3, :cond_a

    .line 184
    .line 185
    const-string v3, "#EXT-X-BYTERANGE"

    .line 186
    .line 187
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_a

    .line 192
    .line 193
    const-string v3, "#EXT-X-DISCONTINUITY"

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-nez v3, :cond_a

    .line 200
    .line 201
    const-string v3, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-nez v3, :cond_a

    .line 208
    .line 209
    const-string v3, "#EXT-X-ENDLIST"

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_9

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_a
    :goto_5
    invoke-virtual {p2, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    iget-object v1, p0, Lb2/o;->a:Lb2/l;

    .line 226
    .line 227
    iget-object v2, p0, Lb2/o;->b:Lb2/i;

    .line 228
    .line 229
    new-instance v3, LDd/c;

    .line 230
    .line 231
    invoke-direct {v3, p2, v0}, LDd/c;-><init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {v1, v2, v3, p1}, Lb2/o;->d(Lb2/l;Lb2/i;LDd/c;Ljava/lang/String;)Lb2/i;

    .line 239
    .line 240
    .line 241
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 243
    .line 244
    .line 245
    return-object p1

    .line 246
    :cond_b
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 247
    .line 248
    .line 249
    const-string p1, "Failed to parse the playlist, could not identify any tags."

    .line 250
    .line 251
    invoke-static {p1, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    throw p1

    .line 256
    :cond_c
    :try_start_2
    const-string p1, "Input does not start with the #EXTM3U header."

    .line 257
    .line 258
    invoke-static {p1, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 263
    :goto_6
    invoke-static {v0}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 264
    .line 265
    .line 266
    throw p1
.end method
