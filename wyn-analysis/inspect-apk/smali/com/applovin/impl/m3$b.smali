.class Lcom/applovin/impl/m3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/s2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/m3;->setListAdapter(Lcom/applovin/impl/o3;Lcom/applovin/impl/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/c;

.field final synthetic b:Lcom/applovin/impl/m3;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/m3;Lcom/applovin/impl/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Lcom/applovin/impl/o3$e;->a:Lcom/applovin/impl/o3$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget-object v0, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 22
    .line 23
    invoke-static {p1, p2, v0}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v1, Lcom/applovin/impl/o3$e;->b:Lcom/applovin/impl/o3$e;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ne v0, v1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, p2}, Lcom/applovin/impl/o3;->a(Lcom/applovin/impl/r2;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 48
    .line 49
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 50
    .line 51
    new-instance v0, Lcom/applovin/impl/m3$b$a;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$a;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 54
    .line 55
    .line 56
    const-class v1, Lcom/applovin/mediation/MaxDebuggerUnifiedFlowActivity;

    .line 57
    .line 58
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->c()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object v0, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 71
    .line 72
    invoke-static {p1, p2, v0}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    sget-object v1, Lcom/applovin/impl/o3$e;->c:Lcom/applovin/impl/o3$e;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-ne v0, v1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    sget-object v1, Lcom/applovin/impl/o3$d;->a:Lcom/applovin/impl/o3$d;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-ne v0, v1, :cond_4

    .line 95
    .line 96
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 97
    .line 98
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->t()Lcom/applovin/impl/sdk/k;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->s0()Lcom/applovin/impl/a7;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lcom/applovin/impl/a7;->j()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/StringUtils;->isValidString(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 121
    .line 122
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 123
    .line 124
    new-instance v0, Lcom/applovin/impl/m3$b$b;

    .line 125
    .line 126
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$b;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 127
    .line 128
    .line 129
    const-class v1, Lcom/applovin/mediation/MaxDebuggerTcfInfoListActivity;

    .line 130
    .line 131
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->c()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iget-object v0, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 144
    .line 145
    invoke-static {p1, p2, v0}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_4
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    sget-object p2, Lcom/applovin/impl/o3$d;->b:Lcom/applovin/impl/o3$d;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-ne p1, p2, :cond_11

    .line 160
    .line 161
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 162
    .line 163
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 164
    .line 165
    new-instance v0, Lcom/applovin/impl/m3$b$c;

    .line 166
    .line 167
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$c;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 168
    .line 169
    .line 170
    const-class v1, Lcom/applovin/mediation/MaxDebuggerTcfConsentStatusesListActivity;

    .line 171
    .line 172
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_5
    sget-object v1, Lcom/applovin/impl/o3$e;->d:Lcom/applovin/impl/o3$e;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-ne v0, v1, :cond_f

    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    sget-object v1, Lcom/applovin/impl/o3$b;->a:Lcom/applovin/impl/o3$b;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    const-class v2, Lcom/applovin/mediation/MaxDebuggerAdUnitsListActivity;

    .line 195
    .line 196
    if-ne v0, v1, :cond_7

    .line 197
    .line 198
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 199
    .line 200
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->f()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-lez p1, :cond_6

    .line 213
    .line 214
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 215
    .line 216
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 217
    .line 218
    new-instance v0, Lcom/applovin/impl/m3$b$d;

    .line 219
    .line 220
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$d;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 221
    .line 222
    .line 223
    invoke-static {p1, v2, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_6
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 228
    .line 229
    const-string p2, "No live ad units"

    .line 230
    .line 231
    const-string v0, "Please setup or enable your MAX ad units on https://applovin.com."

    .line 232
    .line 233
    invoke-static {p2, v0, p1}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_7
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    sget-object v1, Lcom/applovin/impl/o3$b;->b:Lcom/applovin/impl/o3$b;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    const-string v3, "Restart Required"

    .line 248
    .line 249
    const-string v4, "Please complete integrations in order to access this."

    .line 250
    .line 251
    const-string v5, "Complete Integrations"

    .line 252
    .line 253
    if-ne v0, v1, :cond_b

    .line 254
    .line 255
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 256
    .line 257
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->k()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-gtz p1, :cond_9

    .line 270
    .line 271
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 272
    .line 273
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->w()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-lez p1, :cond_8

    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_8
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 289
    .line 290
    invoke-static {v5, v4, p1}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_9
    :goto_0
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 295
    .line 296
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->t()Lcom/applovin/impl/sdk/k;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->t0()Lcom/applovin/impl/g7;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {p1}, Lcom/applovin/impl/g7;->c()Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-eqz p1, :cond_a

    .line 313
    .line 314
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 319
    .line 320
    invoke-static {v3, p1, p2}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :cond_a
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 325
    .line 326
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 327
    .line 328
    new-instance v0, Lcom/applovin/impl/m3$b$e;

    .line 329
    .line 330
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$e;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 331
    .line 332
    .line 333
    const-class v1, Lcom/applovin/mediation/MaxDebuggerTestLiveNetworkActivity;

    .line 334
    .line 335
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :cond_b
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    sget-object v1, Lcom/applovin/impl/o3$b;->c:Lcom/applovin/impl/o3$b;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-ne v0, v1, :cond_e

    .line 350
    .line 351
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 352
    .line 353
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->t()Lcom/applovin/impl/sdk/k;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->t0()Lcom/applovin/impl/g7;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-virtual {p1}, Lcom/applovin/impl/g7;->c()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-nez p1, :cond_c

    .line 370
    .line 371
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 372
    .line 373
    invoke-virtual {p1}, Lcom/applovin/impl/m3;->getSdk()Lcom/applovin/impl/sdk/k;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->t0()Lcom/applovin/impl/g7;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-virtual {p1}, Lcom/applovin/impl/g7;->a()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Lcom/applovin/impl/r2;->b()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 389
    .line 390
    invoke-static {v3, p1, p2}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_c
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 395
    .line 396
    invoke-static {p1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    invoke-virtual {p1}, Lcom/applovin/impl/o3;->v()Ljava/util/List;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    if-lez p1, :cond_d

    .line 409
    .line 410
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 411
    .line 412
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 413
    .line 414
    new-instance v0, Lcom/applovin/impl/m3$b$f;

    .line 415
    .line 416
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$f;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 417
    .line 418
    .line 419
    const-class v1, Lcom/applovin/mediation/MaxDebuggerTestModeNetworkActivity;

    .line 420
    .line 421
    invoke-static {p1, v1, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_d
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 426
    .line 427
    invoke-static {v5, v4, p1}, Lcom/applovin/impl/o7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :cond_e
    invoke-virtual {p1}, Lcom/applovin/impl/j2;->a()I

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    sget-object p2, Lcom/applovin/impl/o3$b;->d:Lcom/applovin/impl/o3$b;

    .line 436
    .line 437
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 438
    .line 439
    .line 440
    move-result p2

    .line 441
    if-ne p1, p2, :cond_11

    .line 442
    .line 443
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 444
    .line 445
    iget-object p2, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 446
    .line 447
    new-instance v0, Lcom/applovin/impl/m3$b$g;

    .line 448
    .line 449
    invoke-direct {v0, p0}, Lcom/applovin/impl/m3$b$g;-><init>(Lcom/applovin/impl/m3$b;)V

    .line 450
    .line 451
    .line 452
    invoke-static {p1, v2, p2, v0}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :cond_f
    sget-object p1, Lcom/applovin/impl/o3$e;->f:Lcom/applovin/impl/o3$e;

    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    if-eq v0, p1, :cond_10

    .line 463
    .line 464
    sget-object p1, Lcom/applovin/impl/o3$e;->e:Lcom/applovin/impl/o3$e;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    if-eq v0, p1, :cond_10

    .line 471
    .line 472
    sget-object p1, Lcom/applovin/impl/o3$e;->g:Lcom/applovin/impl/o3$e;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 475
    .line 476
    .line 477
    move-result p1

    .line 478
    if-ne v0, p1, :cond_11

    .line 479
    .line 480
    :cond_10
    instance-of p1, p2, Lcom/applovin/impl/z3;

    .line 481
    .line 482
    if-eqz p1, :cond_11

    .line 483
    .line 484
    iget-object p1, p0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    .line 485
    .line 486
    iget-object v0, p0, Lcom/applovin/impl/m3$b;->a:Lcom/applovin/impl/c;

    .line 487
    .line 488
    new-instance v1, Lcom/applovin/impl/m3$b$h;

    .line 489
    .line 490
    invoke-direct {v1, p0, p2}, Lcom/applovin/impl/m3$b$h;-><init>(Lcom/applovin/impl/m3$b;Lcom/applovin/impl/r2;)V

    .line 491
    .line 492
    .line 493
    const-class p2, Lcom/applovin/mediation/MaxDebuggerDetailActivity;

    .line 494
    .line 495
    invoke-static {p1, p2, v0, v1}, Lcom/applovin/impl/d;->a(Landroid/content/Context;Ljava/lang/Class;Lcom/applovin/impl/c;Lcom/applovin/impl/d$b;)V

    .line 496
    .line 497
    .line 498
    :cond_11
    return-void
.end method
