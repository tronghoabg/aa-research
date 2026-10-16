.class public final synthetic Lp9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp9/n;

.field public final synthetic c:Lp9/v;


# direct methods
.method public synthetic constructor <init>(Lp9/n;Lp9/v;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp9/m;->a:I

    iput-object p1, p0, Lp9/m;->b:Lp9/n;

    iput-object p2, p0, Lp9/m;->c:Lp9/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    iget-object v3, p0, Lp9/m;->c:Lp9/v;

    .line 5
    .line 6
    iget-object v4, p0, Lp9/m;->b:Lp9/n;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    iget v7, p0, Lp9/m;->a:I

    .line 11
    .line 12
    packed-switch v7, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v4, v4, Lp9/n;->j:LQ1/n;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v7, v3, Lp9/v;->a:Lp9/u;

    .line 21
    .line 22
    iget-object v8, v4, LQ1/n;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v8, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    check-cast v9, Lp9/h;

    .line 31
    .line 32
    if-nez v9, :cond_1

    .line 33
    .line 34
    new-instance v9, Lp9/h;

    .line 35
    .line 36
    invoke-direct {v9}, Lp9/h;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Lp9/v;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    move v0, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v0, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v8, v9, Lp9/h;->a:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_3

    .line 63
    .line 64
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    check-cast v10, Lp9/v;

    .line 69
    .line 70
    invoke-virtual {v10}, Lp9/v;->a()Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    invoke-virtual {v3}, Lp9/v;->a()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_4

    .line 82
    .line 83
    move v0, v1

    .line 84
    :cond_4
    :goto_0
    iget-object v1, v9, Lp9/h;->a:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget v1, v4, LQ1/n;->a:I

    .line 90
    .line 91
    iput v1, v3, Lp9/v;->e:I

    .line 92
    .line 93
    iget-object v8, v3, Lp9/v;->f:Lp9/D;

    .line 94
    .line 95
    if-eqz v8, :cond_5

    .line 96
    .line 97
    iget-boolean v10, v3, Lp9/v;->d:Z

    .line 98
    .line 99
    if-nez v10, :cond_5

    .line 100
    .line 101
    invoke-virtual {v3, v8, v1}, Lp9/v;->d(Lp9/D;I)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    iget-object v1, v3, Lp9/v;->f:Lp9/D;

    .line 108
    .line 109
    invoke-virtual {v3, v1}, Lp9/v;->c(Lp9/D;)V

    .line 110
    .line 111
    .line 112
    move v1, v6

    .line 113
    goto :goto_1

    .line 114
    :cond_5
    move v1, v5

    .line 115
    :goto_1
    xor-int/2addr v1, v6

    .line 116
    new-array v8, v5, [Ljava/lang/Object;

    .line 117
    .line 118
    const-string v10, "onOnlineStateChanged() shouldn\'t raise an event for brand-new listeners."

    .line 119
    .line 120
    invoke-static {v1, v10, v8}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, v9, Lp9/h;->b:Lp9/D;

    .line 124
    .line 125
    if-eqz v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {v3, v1}, Lp9/v;->b(Lp9/D;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_6

    .line 132
    .line 133
    invoke-virtual {v4}, LQ1/n;->f()V

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-static {v0}, LA/f;->f(I)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iget-object v1, v4, LQ1/n;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lp9/z;

    .line 143
    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    if-eq v0, v6, :cond_8

    .line 147
    .line 148
    if-eq v0, v2, :cond_7

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    const-string v0, "listenToRemoteStore"

    .line 152
    .line 153
    invoke-virtual {v1, v0}, Lp9/z;->a(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v1, Lp9/z;->c:Ljava/util/HashMap;

    .line 157
    .line 158
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    const-string v2, "This is the first listen to query: %s"

    .line 163
    .line 164
    new-array v3, v6, [Ljava/lang/Object;

    .line 165
    .line 166
    aput-object v7, v3, v5

    .line 167
    .line 168
    invoke-static {v0, v2, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Lp9/z;->a:Lr9/l;

    .line 172
    .line 173
    invoke-virtual {v7}, Lp9/u;->i()Lp9/A;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v0, v2}, Lr9/l;->a(Lp9/A;)Lr9/S;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-object v1, v1, Lp9/z;->b:LE5/n0;

    .line 182
    .line 183
    invoke-virtual {v1, v0}, LE5/n0;->j(Lr9/S;)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_8
    invoke-virtual {v1, v7, v5}, Lp9/z;->d(Lp9/u;Z)I

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    invoke-virtual {v1, v7, v6}, Lp9/z;->d(Lp9/u;Z)I

    .line 192
    .line 193
    .line 194
    :goto_2
    return-void

    .line 195
    :pswitch_0
    iget-object v4, v4, Lp9/n;->j:LQ1/n;

    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object v7, v3, Lp9/v;->a:Lp9/u;

    .line 201
    .line 202
    iget-object v8, v4, LQ1/n;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v8, Ljava/util/HashMap;

    .line 205
    .line 206
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    check-cast v9, Lp9/h;

    .line 211
    .line 212
    if-nez v9, :cond_a

    .line 213
    .line 214
    goto/16 :goto_5

    .line 215
    .line 216
    :cond_a
    iget-object v9, v9, Lp9/h;->a:Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-eqz v10, :cond_c

    .line 226
    .line 227
    invoke-virtual {v3}, Lp9/v;->a()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_b

    .line 232
    .line 233
    move v0, v6

    .line 234
    goto :goto_3

    .line 235
    :cond_b
    move v0, v2

    .line 236
    goto :goto_3

    .line 237
    :cond_c
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    :cond_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_e

    .line 246
    .line 247
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    check-cast v10, Lp9/v;

    .line 252
    .line 253
    invoke-virtual {v10}, Lp9/v;->a()Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-eqz v10, :cond_d

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_e
    invoke-virtual {v3}, Lp9/v;->a()Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_f

    .line 265
    .line 266
    move v0, v1

    .line 267
    :cond_f
    :goto_3
    invoke-static {v0}, LA/f;->f(I)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    iget-object v1, v4, LQ1/n;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v1, Lp9/z;

    .line 274
    .line 275
    if-eqz v0, :cond_13

    .line 276
    .line 277
    if-eq v0, v6, :cond_12

    .line 278
    .line 279
    if-eq v0, v2, :cond_10

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_10
    const-string v0, "stopListeningToRemoteStore"

    .line 283
    .line 284
    invoke-virtual {v1, v0}, Lp9/z;->a(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v0, v1, Lp9/z;->c:Ljava/util/HashMap;

    .line 288
    .line 289
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, Lp9/w;

    .line 294
    .line 295
    if-eqz v0, :cond_11

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_11
    move v6, v5

    .line 299
    :goto_4
    const-string v2, "Trying to stop listening to a query not found"

    .line 300
    .line 301
    new-array v3, v5, [Ljava/lang/Object;

    .line 302
    .line 303
    invoke-static {v6, v2, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iget v0, v0, Lp9/w;->b:I

    .line 307
    .line 308
    iget-object v2, v1, Lp9/z;->d:Ljava/util/HashMap;

    .line 309
    .line 310
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    check-cast v2, Ljava/util/List;

    .line 319
    .line 320
    invoke-interface {v2, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_14

    .line 328
    .line 329
    iget-object v1, v1, Lp9/z;->b:LE5/n0;

    .line 330
    .line 331
    invoke-virtual {v1, v0}, LE5/n0;->x(I)V

    .line 332
    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_12
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1, v7, v5}, Lp9/z;->k(Lp9/u;Z)V

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_13
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v7, v6}, Lp9/z;->k(Lp9/u;Z)V

    .line 346
    .line 347
    .line 348
    :cond_14
    :goto_5
    return-void

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
