.class public final Lfd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lfd/d;

.field public static final b:Lef/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfd/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfd/d;->a:Lfd/d;

    .line 7
    .line 8
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    .line 9
    .line 10
    const/16 v1, 0x19

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lfd/d;->b:Lef/p;

    .line 20
    .line 21
    return-void
.end method

.method public static a()Luc/n;
    .locals 1

    .line 1
    sget-object v0, Lfd/d;->b:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Luc/n;

    .line 8
    .line 9
    return-object v0
.end method

.method public static b(Luc/f;Lfd/H;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LVa/X7;

    .line 11
    .line 12
    const-string v2, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool"

    .line 13
    .line 14
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-direct {v1, p0, v3, v0, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance v2, Lfd/c;

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, LVa/X7;

    .line 42
    .line 43
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString"

    .line 44
    .line 45
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    new-instance v1, Lfd/c;

    .line 55
    .line 56
    const/16 v3, 0x8

    .line 57
    .line 58
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, LVa/X7;

    .line 73
    .line 74
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt"

    .line 75
    .line 76
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    new-instance v1, Lfd/c;

    .line 86
    .line 87
    const/16 v3, 0x9

    .line 88
    .line 89
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-instance v2, LVa/X7;

    .line 104
    .line 105
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble"

    .line 106
    .line 107
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    new-instance v1, Lfd/c;

    .line 117
    .line 118
    const/16 v3, 0xa

    .line 119
    .line 120
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v2, LVa/X7;

    .line 135
    .line 136
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList"

    .line 137
    .line 138
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    new-instance v1, Lfd/c;

    .line 148
    .line 149
    const/16 v3, 0xb

    .line 150
    .line 151
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_4
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 159
    .line 160
    .line 161
    :goto_4
    new-instance v1, LVa/X7;

    .line 162
    .line 163
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString"

    .line 168
    .line 169
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    if-eqz p1, :cond_5

    .line 173
    .line 174
    new-instance v2, Lfd/c;

    .line 175
    .line 176
    const/16 v3, 0xc

    .line 177
    .line 178
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_5
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 186
    .line 187
    .line 188
    :goto_5
    new-instance v1, LVa/X7;

    .line 189
    .line 190
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool"

    .line 195
    .line 196
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    if-eqz p1, :cond_6

    .line 200
    .line 201
    new-instance v2, Lfd/c;

    .line 202
    .line 203
    const/4 v3, 0x0

    .line 204
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 208
    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_6
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 212
    .line 213
    .line 214
    :goto_6
    new-instance v1, LVa/X7;

    .line 215
    .line 216
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble"

    .line 221
    .line 222
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    if-eqz p1, :cond_7

    .line 226
    .line 227
    new-instance v2, Lfd/c;

    .line 228
    .line 229
    const/4 v3, 0x1

    .line 230
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 234
    .line 235
    .line 236
    goto :goto_7

    .line 237
    :cond_7
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 238
    .line 239
    .line 240
    :goto_7
    new-instance v1, LVa/X7;

    .line 241
    .line 242
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt"

    .line 247
    .line 248
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    if-eqz p1, :cond_8

    .line 252
    .line 253
    new-instance v2, Lfd/c;

    .line 254
    .line 255
    const/4 v3, 0x2

    .line 256
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 260
    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_8
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 264
    .line 265
    .line 266
    :goto_8
    new-instance v1, LVa/X7;

    .line 267
    .line 268
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList"

    .line 273
    .line 274
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    if-eqz p1, :cond_9

    .line 278
    .line 279
    new-instance v2, Lfd/c;

    .line 280
    .line 281
    const/4 v3, 0x3

    .line 282
    invoke-direct {v2, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 286
    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_9
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 290
    .line 291
    .line 292
    :goto_9
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    new-instance v2, LVa/X7;

    .line 297
    .line 298
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear"

    .line 299
    .line 300
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    if-eqz p1, :cond_a

    .line 308
    .line 309
    new-instance v1, Lfd/c;

    .line 310
    .line 311
    const/4 v3, 0x5

    .line 312
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 316
    .line 317
    .line 318
    goto :goto_a

    .line 319
    :cond_a
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 320
    .line 321
    .line 322
    :goto_a
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    new-instance v2, LVa/X7;

    .line 327
    .line 328
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll"

    .line 329
    .line 330
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    if-eqz p1, :cond_b

    .line 338
    .line 339
    new-instance v1, Lfd/c;

    .line 340
    .line 341
    const/4 v3, 0x6

    .line 342
    invoke-direct {v1, p1, v3}, Lfd/c;-><init>(Lfd/H;I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 346
    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_b
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 350
    .line 351
    .line 352
    :goto_b
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    new-instance v2, LVa/X7;

    .line 357
    .line 358
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys"

    .line 359
    .line 360
    invoke-static {}, Lfd/d;->a()Luc/n;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-direct {v2, p0, v4, v1, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    if-eqz p1, :cond_c

    .line 368
    .line 369
    new-instance p0, Lfd/c;

    .line 370
    .line 371
    const/4 v0, 0x7

    .line 372
    invoke-direct {p0, p1, v0}, Lfd/c;-><init>(Lfd/H;I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, p0}, LVa/X7;->n(Luc/b;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :cond_c
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 380
    .line 381
    .line 382
    return-void
.end method
