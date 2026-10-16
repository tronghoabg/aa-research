.class public final synthetic Lkd/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/r;


# direct methods
.method public synthetic constructor <init>(Lkd/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/z;->a:I

    iput-object p1, p0, Lkd/z;->b:Lkd/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 11

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager"

    .line 4
    .line 5
    const-string v2, ", Stacktrace: "

    .line 6
    .line 7
    const-string v3, "Cause: "

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x3

    .line 11
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 12
    .line 13
    iget-object v7, p0, Lkd/z;->b:Lkd/r;

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    iget v10, p0, Lkd/z;->a:I

    .line 18
    .line 19
    packed-switch v10, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    check-cast v6, Lkd/q;

    .line 35
    .line 36
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, v6, Lkd/q;->b:Lcom/google/android/gms/ads/nativead/l;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Loc/d;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Loc/d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    instance-of v0, p1, Lkd/a;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    check-cast p1, Lkd/a;

    .line 69
    .line 70
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 75
    .line 76
    new-array v2, v5, [Ljava/lang/Object;

    .line 77
    .line 78
    aput-object p1, v2, v9

    .line 79
    .line 80
    aput-object v0, v2, v8

    .line 81
    .line 82
    aput-object v1, v2, v4

    .line 83
    .line 84
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_0
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    check-cast v6, Lkd/q;

    .line 138
    .line 139
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    check-cast p1, Ljava/lang/String;

    .line 147
    .line 148
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    .line 150
    .line 151
    :try_start_2
    iget-object v0, v6, Lkd/q;->a:Landroid/content/res/AssetManager;

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-nez p1, :cond_1

    .line 158
    .line 159
    new-instance p1, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :catch_0
    move-exception p1

    .line 166
    goto :goto_2

    .line 167
    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 171
    :goto_1
    :try_start_3
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    goto :goto_4

    .line 176
    :catchall_1
    move-exception p1

    .line 177
    goto :goto_3

    .line 178
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 188
    :goto_3
    instance-of v0, p1, Lkd/a;

    .line 189
    .line 190
    if-eqz v0, :cond_2

    .line 191
    .line 192
    check-cast p1, Lkd/a;

    .line 193
    .line 194
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 195
    .line 196
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 197
    .line 198
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 199
    .line 200
    new-array v2, v5, [Ljava/lang/Object;

    .line 201
    .line 202
    aput-object p1, v2, v9

    .line 203
    .line 204
    aput-object v0, v2, v8

    .line 205
    .line 206
    aput-object v1, v2, v4

    .line 207
    .line 208
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    goto :goto_4

    .line 213
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_1
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    check-cast p1, Ljava/util/List;

    .line 253
    .line 254
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    const-string v0, "null cannot be cast to non-null type kotlin.Long"

    .line 259
    .line 260
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    check-cast p1, Ljava/lang/Long;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    :try_start_4
    iget-object p1, v7, Lkd/r;->a:LC8/i;

    .line 270
    .line 271
    iget-object v6, p1, LC8/i;->d:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v6, Lkd/d;

    .line 274
    .line 275
    iget-object p1, p1, LC8/i;->f:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast p1, Lkd/q;

    .line 278
    .line 279
    invoke-virtual {v6, v0, v1, p1}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    const/4 p1, 0x0

    .line 283
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 287
    goto :goto_5

    .line 288
    :catchall_2
    move-exception p1

    .line 289
    instance-of v0, p1, Lkd/a;

    .line 290
    .line 291
    if-eqz v0, :cond_3

    .line 292
    .line 293
    check-cast p1, Lkd/a;

    .line 294
    .line 295
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 298
    .line 299
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 300
    .line 301
    new-array v2, v5, [Ljava/lang/Object;

    .line 302
    .line 303
    aput-object p1, v2, v9

    .line 304
    .line 305
    aput-object v0, v2, v8

    .line 306
    .line 307
    aput-object v1, v2, v4

    .line 308
    .line 309
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    goto :goto_5

    .line 314
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    :goto_5
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
