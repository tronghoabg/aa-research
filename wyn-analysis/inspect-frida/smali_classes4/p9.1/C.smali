.class public final Lp9/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lp9/C;->c:Ljava/lang/Object;

    .line 16
    new-instance v0, Lab/b;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v0, p0, Lp9/C;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lp9/C;->a:I

    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lp9/C;->b:Z

    return-void
.end method

.method public constructor <init>(Lp9/u;Lc9/d;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp9/C;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lp9/C;->a:I

    .line 4
    invoke-virtual {p1}, Lp9/u;->a()LO7/d;

    move-result-object p1

    .line 5
    new-instance v0, LV5/s;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 6
    new-instance p1, Ls9/i;

    .line 7
    sget-object v1, Ls9/g;->a:Lc9/b;

    .line 8
    new-instance v2, Lc9/d;

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v2, v3, v0}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-direct {p1, v1, v2}, Ls9/i;-><init>(Lc9/c;Lc9/d;)V

    .line 9
    iput-object p1, p0, Lp9/C;->d:Ljava/lang/Object;

    .line 10
    iput-object p2, p0, Lp9/C;->e:Ljava/lang/Object;

    .line 11
    sget-object p1, Ls9/h;->c:Lc9/d;

    .line 12
    iput-object p1, p0, Lp9/C;->f:Ljava/lang/Object;

    .line 13
    iput-object p1, p0, Lp9/C;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu/n;)V
    .locals 3

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lp9/C;->c:Ljava/lang/Object;

    .line 23
    new-instance v1, Lab/b;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object v1, p0, Lp9/C;->d:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 26
    iput v1, p0, Lp9/C;->a:I

    const/4 v1, 0x1

    .line 27
    iput-boolean v1, p0, Lp9/C;->b:Z

    if-eqz p1, :cond_0

    .line 28
    iget-object v1, p1, Lu/n;->d:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    iget-object p1, p1, Lu/n;->c:Lu/f;

    .line 30
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 31
    const-string v2, "android.support.customtabs.extra.SESSION"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 32
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method public static c(Lp9/f;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lp9/f;->a:Lp9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    return v1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "Unknown change type: "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lp9/f;->a:Lp9/e;

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    return v1

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return p0
.end method


# virtual methods
.method public a(LA7/b0;Lv9/t;Z)LX2/j;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-boolean v6, v1, LA7/b0;->b:Z

    .line 11
    .line 12
    xor-int/2addr v6, v5

    .line 13
    new-array v7, v4, [Ljava/lang/Object;

    .line 14
    .line 15
    const-string v8, "Cannot apply changes that need a refill"

    .line 16
    .line 17
    invoke-static {v6, v8, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v6, v0, Lp9/C;->d:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v10, v6

    .line 23
    check-cast v10, Ls9/i;

    .line 24
    .line 25
    iget-object v6, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Ls9/i;

    .line 28
    .line 29
    iput-object v6, v0, Lp9/C;->d:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v6, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Lc9/d;

    .line 34
    .line 35
    iput-object v6, v0, Lp9/C;->g:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v6, v1, LA7/b0;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, La2/v;

    .line 40
    .line 41
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v11, Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v6, v6, La2/v;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Ljava/util/TreeMap;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-direct {v11, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    new-instance v6, LV5/s;

    .line 58
    .line 59
    invoke-direct {v6, v0, v3}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v11, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 63
    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v6, v2, Lv9/t;->c:Lc9/d;

    .line 68
    .line 69
    invoke-virtual {v6}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    :goto_0
    move-object v7, v6

    .line 74
    check-cast v7, LA7/v;

    .line 75
    .line 76
    iget-object v8, v7, LA7/v;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Ljava/util/Iterator;

    .line 79
    .line 80
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_0

    .line 85
    .line 86
    invoke-virtual {v7}, LA7/v;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Ls9/h;

    .line 91
    .line 92
    iget-object v8, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, Lc9/d;

    .line 95
    .line 96
    invoke-virtual {v8, v7}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    iput-object v7, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    iget-object v6, v2, Lv9/t;->d:Lc9/d;

    .line 104
    .line 105
    invoke-virtual {v6}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    :goto_1
    move-object v7, v6

    .line 110
    check-cast v7, LA7/v;

    .line 111
    .line 112
    iget-object v8, v7, LA7/v;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v8, Ljava/util/Iterator;

    .line 115
    .line 116
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_1

    .line 121
    .line 122
    invoke-virtual {v7}, LA7/v;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Ls9/h;

    .line 127
    .line 128
    iget-object v8, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v8, Lc9/d;

    .line 131
    .line 132
    iget-object v8, v8, Lc9/d;->a:Lc9/c;

    .line 133
    .line 134
    invoke-virtual {v8, v7}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    const-string v9, "Modified document %s not found in view."

    .line 139
    .line 140
    new-array v12, v5, [Ljava/lang/Object;

    .line 141
    .line 142
    aput-object v7, v12, v4

    .line 143
    .line 144
    invoke-static {v8, v9, v12}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    iget-object v6, v2, Lv9/t;->e:Lc9/d;

    .line 149
    .line 150
    invoke-virtual {v6}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    :goto_2
    move-object v7, v6

    .line 155
    check-cast v7, LA7/v;

    .line 156
    .line 157
    iget-object v8, v7, LA7/v;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v8, Ljava/util/Iterator;

    .line 160
    .line 161
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_2

    .line 166
    .line 167
    invoke-virtual {v7}, LA7/v;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, Ls9/h;

    .line 172
    .line 173
    iget-object v8, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v8, Lc9/d;

    .line 176
    .line 177
    invoke-virtual {v8, v7}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    iput-object v7, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    iget-boolean v6, v2, Lv9/t;->b:Z

    .line 185
    .line 186
    iput-boolean v6, v0, Lp9/C;->b:Z

    .line 187
    .line 188
    :cond_3
    if-eqz p3, :cond_4

    .line 189
    .line 190
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_4
    iget-boolean v6, v0, Lp9/C;->b:Z

    .line 195
    .line 196
    if-nez v6, :cond_5

    .line 197
    .line 198
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 199
    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_5
    iget-object v6, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v6, Lc9/d;

    .line 205
    .line 206
    sget-object v7, Ls9/h;->c:Lc9/d;

    .line 207
    .line 208
    iput-object v7, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 209
    .line 210
    iget-object v7, v0, Lp9/C;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v7, Ls9/i;

    .line 213
    .line 214
    iget-object v7, v7, Ls9/i;->b:Lc9/d;

    .line 215
    .line 216
    invoke-virtual {v7}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    :goto_3
    move-object v8, v7

    .line 221
    check-cast v8, LA7/v;

    .line 222
    .line 223
    iget-object v9, v8, LA7/v;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v9, Ljava/util/Iterator;

    .line 226
    .line 227
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-eqz v9, :cond_9

    .line 232
    .line 233
    invoke-virtual {v8}, LA7/v;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    check-cast v8, Ls9/k;

    .line 238
    .line 239
    iget-object v9, v8, Ls9/k;->a:Ls9/h;

    .line 240
    .line 241
    iget-object v12, v0, Lp9/C;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v12, Lc9/d;

    .line 244
    .line 245
    iget-object v12, v12, Lc9/d;->a:Lc9/c;

    .line 246
    .line 247
    invoke-virtual {v12, v9}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_6

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_6
    iget-object v12, v0, Lp9/C;->d:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v12, Ls9/i;

    .line 257
    .line 258
    iget-object v12, v12, Ls9/i;->a:Lc9/c;

    .line 259
    .line 260
    invoke-virtual {v12, v9}, Lc9/c;->b(Ls9/h;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, Ls9/k;

    .line 265
    .line 266
    if-nez v9, :cond_7

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_7
    invoke-virtual {v9}, Ls9/k;->c()Z

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-eqz v9, :cond_8

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_8
    iget-object v9, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v9, Lc9/d;

    .line 279
    .line 280
    iget-object v8, v8, Ls9/k;->a:Ls9/h;

    .line 281
    .line 282
    invoke-virtual {v9, v8}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    iput-object v8, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_9
    new-instance v7, Ljava/util/ArrayList;

    .line 290
    .line 291
    iget-object v8, v6, Lc9/d;->a:Lc9/c;

    .line 292
    .line 293
    invoke-virtual {v8}, Lc9/c;->size()I

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    iget-object v9, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v9, Lc9/d;

    .line 300
    .line 301
    iget-object v9, v9, Lc9/d;->a:Lc9/c;

    .line 302
    .line 303
    invoke-virtual {v9}, Lc9/c;->size()I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    add-int/2addr v9, v8

    .line 308
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    :cond_a
    :goto_4
    move-object v9, v8

    .line 316
    check-cast v9, LA7/v;

    .line 317
    .line 318
    iget-object v12, v9, LA7/v;->b:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v12, Ljava/util/Iterator;

    .line 321
    .line 322
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_b

    .line 327
    .line 328
    invoke-virtual {v9}, LA7/v;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    check-cast v9, Ls9/h;

    .line 333
    .line 334
    iget-object v12, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v12, Lc9/d;

    .line 337
    .line 338
    iget-object v12, v12, Lc9/d;->a:Lc9/c;

    .line 339
    .line 340
    invoke-virtual {v12, v9}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    if-nez v12, :cond_a

    .line 345
    .line 346
    new-instance v12, Lp9/r;

    .line 347
    .line 348
    sget-object v13, Lp9/q;->b:Lp9/q;

    .line 349
    .line 350
    invoke-direct {v12, v13, v9}, Lp9/r;-><init>(Lp9/q;Ls9/h;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :cond_b
    iget-object v8, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v8, Lc9/d;

    .line 360
    .line 361
    invoke-virtual {v8}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    :cond_c
    :goto_5
    move-object v9, v8

    .line 366
    check-cast v9, LA7/v;

    .line 367
    .line 368
    iget-object v12, v9, LA7/v;->b:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v12, Ljava/util/Iterator;

    .line 371
    .line 372
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    if-eqz v12, :cond_d

    .line 377
    .line 378
    invoke-virtual {v9}, LA7/v;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    check-cast v9, Ls9/h;

    .line 383
    .line 384
    iget-object v12, v6, Lc9/d;->a:Lc9/c;

    .line 385
    .line 386
    invoke-virtual {v12, v9}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v12

    .line 390
    if-nez v12, :cond_c

    .line 391
    .line 392
    new-instance v12, Lp9/r;

    .line 393
    .line 394
    sget-object v13, Lp9/q;->a:Lp9/q;

    .line 395
    .line 396
    invoke-direct {v12, v13, v9}, Lp9/r;-><init>(Lp9/q;Ls9/h;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_d
    move-object v6, v7

    .line 404
    :goto_6
    iget-object v7, v0, Lp9/C;->f:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v7, Lc9/d;

    .line 407
    .line 408
    iget-object v7, v7, Lc9/d;->a:Lc9/c;

    .line 409
    .line 410
    invoke-virtual {v7}, Lc9/c;->size()I

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    if-nez v7, :cond_e

    .line 415
    .line 416
    iget-boolean v7, v0, Lp9/C;->b:Z

    .line 417
    .line 418
    if-eqz v7, :cond_e

    .line 419
    .line 420
    if-nez p3, :cond_e

    .line 421
    .line 422
    const/4 v7, 0x3

    .line 423
    goto :goto_7

    .line 424
    :cond_e
    move v7, v3

    .line 425
    :goto_7
    iget v8, v0, Lp9/C;->a:I

    .line 426
    .line 427
    if-eq v7, v8, :cond_f

    .line 428
    .line 429
    move v14, v5

    .line 430
    goto :goto_8

    .line 431
    :cond_f
    move v14, v4

    .line 432
    :goto_8
    iput v7, v0, Lp9/C;->a:I

    .line 433
    .line 434
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    if-nez v8, :cond_11

    .line 439
    .line 440
    if-eqz v14, :cond_10

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_10
    const/4 v1, 0x0

    .line 444
    goto :goto_c

    .line 445
    :cond_11
    :goto_9
    if-ne v7, v3, :cond_12

    .line 446
    .line 447
    move v12, v5

    .line 448
    goto :goto_a

    .line 449
    :cond_12
    move v12, v4

    .line 450
    :goto_a
    if-nez v2, :cond_14

    .line 451
    .line 452
    :cond_13
    move/from16 v16, v4

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_14
    iget-object v2, v2, Lv9/t;->a:Lcom/google/protobuf/ByteString;

    .line 456
    .line 457
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-nez v2, :cond_13

    .line 462
    .line 463
    move/from16 v16, v5

    .line 464
    .line 465
    :goto_b
    new-instance v7, Lp9/D;

    .line 466
    .line 467
    iget-object v2, v0, Lp9/C;->c:Ljava/lang/Object;

    .line 468
    .line 469
    move-object v8, v2

    .line 470
    check-cast v8, Lp9/u;

    .line 471
    .line 472
    iget-object v2, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 473
    .line 474
    move-object v9, v2

    .line 475
    check-cast v9, Ls9/i;

    .line 476
    .line 477
    iget-object v1, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 478
    .line 479
    move-object v13, v1

    .line 480
    check-cast v13, Lc9/d;

    .line 481
    .line 482
    const/4 v15, 0x0

    .line 483
    invoke-direct/range {v7 .. v16}, Lp9/D;-><init>(Lp9/u;Ls9/i;Ls9/i;Ljava/util/ArrayList;ZLc9/d;ZZZ)V

    .line 484
    .line 485
    .line 486
    move-object v1, v7

    .line 487
    :goto_c
    new-instance v2, LX2/j;

    .line 488
    .line 489
    const/16 v3, 0x19

    .line 490
    .line 491
    invoke-direct {v2, v3, v1, v6}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object v2
.end method

.method public b()Lu/k;
    .locals 8

    .line 1
    iget-object v0, p0, Lp9/C;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Intent;

    .line 4
    .line 5
    const-string v1, "android.support.customtabs.extra.SESSION"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v1, "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"

    .line 26
    .line 27
    iget-boolean v2, p0, Lp9/C;->b:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lp9/C;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lab/b;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Landroid/os/Bundle;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lp9/C;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroid/os/Bundle;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v1, p0, Lp9/C;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroid/util/SparseArray;

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    new-instance v1, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lp9/C;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Landroid/util/SparseArray;

    .line 70
    .line 71
    const-string v4, "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"

    .line 72
    .line 73
    invoke-virtual {v1, v4, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    :cond_2
    const-string v1, "androidx.browser.customtabs.extra.SHARE_STATE"

    .line 80
    .line 81
    iget v2, p0, Lp9/C;->a:I

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 87
    .line 88
    const/16 v2, 0x18

    .line 89
    .line 90
    if-lt v1, v2, :cond_4

    .line 91
    .line 92
    invoke-static {}, Lu/i;->a()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_4

    .line 101
    .line 102
    const-string v4, "com.android.browser.headers"

    .line 103
    .line 104
    invoke-virtual {v0, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    new-instance v5, Landroid/os/Bundle;

    .line 116
    .line 117
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 118
    .line 119
    .line 120
    :goto_0
    const-string v6, "Accept-Language"

    .line 121
    .line 122
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_4

    .line 127
    .line 128
    invoke-virtual {v5, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    :cond_4
    const/16 v2, 0x22

    .line 135
    .line 136
    if-lt v1, v2, :cond_6

    .line 137
    .line 138
    iget-object v1, p0, Lp9/C;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Landroid/app/ActivityOptions;

    .line 141
    .line 142
    if-nez v1, :cond_5

    .line 143
    .line 144
    invoke-static {}, Lu/h;->a()Landroid/app/ActivityOptions;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, p0, Lp9/C;->e:Ljava/lang/Object;

    .line 149
    .line 150
    :cond_5
    iget-object v1, p0, Lp9/C;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Landroid/app/ActivityOptions;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-static {v1, v2}, Lu/j;->a(Landroid/app/ActivityOptions;Z)V

    .line 156
    .line 157
    .line 158
    :cond_6
    iget-object v1, p0, Lp9/C;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Landroid/app/ActivityOptions;

    .line 161
    .line 162
    if-eqz v1, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    :cond_7
    new-instance v1, Lu/k;

    .line 169
    .line 170
    invoke-direct {v1, v0, v3}, Lu/k;-><init>(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 171
    .line 172
    .line 173
    return-object v1
.end method

.method public d(Lc9/c;LA7/b0;)LA7/b0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v1, LA7/b0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La2/v;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v2, La2/v;

    .line 13
    .line 14
    const/16 v3, 0x13

    .line 15
    .line 16
    invoke-direct {v2, v3}, La2/v;-><init>(I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v3, v1, LA7/b0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    :goto_1
    check-cast v3, Ls9/i;

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    iget-object v3, v0, Lp9/C;->d:Ljava/lang/Object;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :goto_2
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v4, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 32
    .line 33
    :goto_3
    check-cast v4, Lc9/d;

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_2
    iget-object v4, v0, Lp9/C;->g:Ljava/lang/Object;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :goto_4
    iget-object v5, v0, Lp9/C;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Lp9/u;

    .line 42
    .line 43
    iget v6, v5, Lp9/u;->i:I

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    invoke-static {v6, v7}, LA/f;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    iget-wide v9, v5, Lp9/u;->h:J

    .line 51
    .line 52
    if-eqz v8, :cond_3

    .line 53
    .line 54
    iget-object v8, v3, Ls9/i;->a:Lc9/c;

    .line 55
    .line 56
    invoke-virtual {v8}, Lc9/c;->size()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    int-to-long v12, v8

    .line 61
    cmp-long v8, v12, v9

    .line 62
    .line 63
    if-nez v8, :cond_3

    .line 64
    .line 65
    iget-object v8, v3, Ls9/i;->b:Lc9/d;

    .line 66
    .line 67
    iget-object v8, v8, Lc9/d;->a:Lc9/c;

    .line 68
    .line 69
    invoke-virtual {v8}, Lc9/c;->d()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, Ls9/k;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_3
    const/4 v8, 0x0

    .line 77
    :goto_5
    const/4 v12, 0x2

    .line 78
    invoke-static {v6, v12}, LA/f;->b(II)Z

    .line 79
    .line 80
    .line 81
    move-result v13

    .line 82
    if-eqz v13, :cond_4

    .line 83
    .line 84
    iget-object v13, v3, Ls9/i;->a:Lc9/c;

    .line 85
    .line 86
    invoke-virtual {v13}, Lc9/c;->size()I

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    int-to-long v13, v13

    .line 91
    cmp-long v13, v13, v9

    .line 92
    .line 93
    if-nez v13, :cond_4

    .line 94
    .line 95
    iget-object v13, v3, Ls9/i;->b:Lc9/d;

    .line 96
    .line 97
    iget-object v13, v13, Lc9/d;->a:Lc9/c;

    .line 98
    .line 99
    invoke-virtual {v13}, Lc9/c;->e()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    check-cast v13, Ls9/k;

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_4
    const/4 v13, 0x0

    .line 107
    :goto_6
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    move-object/from16 p1, v3

    .line 112
    .line 113
    const/4 v11, 0x0

    .line 114
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v16

    .line 118
    sget-object v15, Lp9/e;->a:Lp9/e;

    .line 119
    .line 120
    if-eqz v16, :cond_16

    .line 121
    .line 122
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v16

    .line 126
    check-cast v16, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v17

    .line 132
    move-object/from16 v7, v17

    .line 133
    .line 134
    check-cast v7, Ls9/h;

    .line 135
    .line 136
    iget-object v12, v3, Ls9/i;->a:Lc9/c;

    .line 137
    .line 138
    invoke-virtual {v12, v7}, Lc9/c;->b(Ls9/h;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    check-cast v12, Ls9/k;

    .line 143
    .line 144
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v18

    .line 148
    move-object/from16 v1, v18

    .line 149
    .line 150
    check-cast v1, Ls9/k;

    .line 151
    .line 152
    invoke-virtual {v5, v1}, Lp9/u;->g(Ls9/k;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Ls9/k;

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_5
    const/4 v1, 0x0

    .line 166
    :goto_8
    move-object/from16 v16, v3

    .line 167
    .line 168
    if-eqz v12, :cond_6

    .line 169
    .line 170
    iget-object v3, v0, Lp9/C;->g:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v3, Lc9/d;

    .line 173
    .line 174
    iget-object v3, v3, Lc9/d;->a:Lc9/c;

    .line 175
    .line 176
    move-object/from16 v18, v5

    .line 177
    .line 178
    iget-object v5, v12, Ls9/k;->a:Ls9/h;

    .line 179
    .line 180
    invoke-virtual {v3, v5}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_7

    .line 185
    .line 186
    const/4 v3, 0x1

    .line 187
    goto :goto_9

    .line 188
    :cond_6
    move-object/from16 v18, v5

    .line 189
    .line 190
    :cond_7
    const/4 v3, 0x0

    .line 191
    :goto_9
    if-eqz v1, :cond_9

    .line 192
    .line 193
    invoke-virtual {v1}, Ls9/k;->c()Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-nez v5, :cond_8

    .line 198
    .line 199
    iget-object v5, v0, Lp9/C;->g:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v5, Lc9/d;

    .line 202
    .line 203
    iget-object v5, v5, Lc9/d;->a:Lc9/c;

    .line 204
    .line 205
    iget-object v0, v1, Ls9/k;->a:Ls9/h;

    .line 206
    .line 207
    invoke-virtual {v5, v0}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    iget v0, v1, Ls9/k;->f:I

    .line 214
    .line 215
    const/4 v5, 0x2

    .line 216
    invoke-static {v0, v5}, LA/f;->b(II)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_9

    .line 221
    .line 222
    :cond_8
    const/4 v0, 0x1

    .line 223
    goto :goto_a

    .line 224
    :cond_9
    const/4 v0, 0x0

    .line 225
    :goto_a
    if-eqz v12, :cond_e

    .line 226
    .line 227
    if-eqz v1, :cond_e

    .line 228
    .line 229
    iget-object v5, v12, Ls9/k;->e:Ls9/l;

    .line 230
    .line 231
    iget-object v15, v1, Ls9/k;->e:Ls9/l;

    .line 232
    .line 233
    invoke-virtual {v5, v15}, Ls9/l;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-nez v5, :cond_d

    .line 238
    .line 239
    invoke-virtual {v12}, Ls9/k;->c()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_a

    .line 244
    .line 245
    iget v0, v1, Ls9/k;->f:I

    .line 246
    .line 247
    const/4 v5, 0x2

    .line 248
    invoke-static {v0, v5}, LA/f;->b(II)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_b

    .line 253
    .line 254
    invoke-virtual {v1}, Ls9/k;->c()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-nez v0, :cond_b

    .line 259
    .line 260
    goto :goto_d

    .line 261
    :cond_a
    const/4 v5, 0x2

    .line 262
    :cond_b
    sget-object v0, Lp9/e;->c:Lp9/e;

    .line 263
    .line 264
    new-instance v3, Lp9/f;

    .line 265
    .line 266
    invoke-direct {v3, v0, v1}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v3}, La2/v;->m(Lp9/f;)V

    .line 270
    .line 271
    .line 272
    if-eqz v8, :cond_c

    .line 273
    .line 274
    invoke-virtual/range {v18 .. v18}, Lp9/u;->a()LO7/d;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0, v1, v8}, LO7/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-gtz v0, :cond_11

    .line 283
    .line 284
    :cond_c
    if-eqz v13, :cond_f

    .line 285
    .line 286
    invoke-virtual/range {v18 .. v18}, Lp9/u;->a()LO7/d;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, v1, v13}, LO7/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-gez v0, :cond_f

    .line 295
    .line 296
    goto :goto_c

    .line 297
    :cond_d
    const/4 v5, 0x2

    .line 298
    if-eq v3, v0, :cond_12

    .line 299
    .line 300
    sget-object v0, Lp9/e;->d:Lp9/e;

    .line 301
    .line 302
    new-instance v3, Lp9/f;

    .line 303
    .line 304
    invoke-direct {v3, v0, v1}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v3}, La2/v;->m(Lp9/f;)V

    .line 308
    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_e
    const/4 v5, 0x2

    .line 312
    if-nez v12, :cond_10

    .line 313
    .line 314
    if-eqz v1, :cond_10

    .line 315
    .line 316
    sget-object v0, Lp9/e;->b:Lp9/e;

    .line 317
    .line 318
    new-instance v3, Lp9/f;

    .line 319
    .line 320
    invoke-direct {v3, v0, v1}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, v3}, La2/v;->m(Lp9/f;)V

    .line 324
    .line 325
    .line 326
    :cond_f
    :goto_b
    const/4 v0, 0x1

    .line 327
    goto :goto_e

    .line 328
    :cond_10
    if-eqz v12, :cond_12

    .line 329
    .line 330
    if-nez v1, :cond_12

    .line 331
    .line 332
    new-instance v0, Lp9/f;

    .line 333
    .line 334
    invoke-direct {v0, v15, v12}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v0}, La2/v;->m(Lp9/f;)V

    .line 338
    .line 339
    .line 340
    if-nez v8, :cond_11

    .line 341
    .line 342
    if-eqz v13, :cond_f

    .line 343
    .line 344
    :cond_11
    :goto_c
    const/4 v0, 0x1

    .line 345
    const/4 v11, 0x1

    .line 346
    goto :goto_e

    .line 347
    :cond_12
    :goto_d
    const/4 v0, 0x0

    .line 348
    :goto_e
    if-eqz v0, :cond_15

    .line 349
    .line 350
    if-eqz v1, :cond_14

    .line 351
    .line 352
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v0, v1, Ls9/k;->a:Ls9/h;

    .line 356
    .line 357
    move-object/from16 v3, p1

    .line 358
    .line 359
    invoke-virtual {v3, v0}, Ls9/i;->a(Ls9/h;)Ls9/i;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    iget-object v7, v3, Ls9/i;->a:Lc9/c;

    .line 364
    .line 365
    invoke-virtual {v7, v0, v1}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 366
    .line 367
    .line 368
    move-result-object v7

    .line 369
    iget-object v3, v3, Ls9/i;->b:Lc9/d;

    .line 370
    .line 371
    invoke-virtual {v3, v1}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    new-instance v12, Ls9/i;

    .line 376
    .line 377
    invoke-direct {v12, v7, v3}, Ls9/i;-><init>(Lc9/c;Lc9/d;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ls9/k;->c()Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-eqz v1, :cond_13

    .line 385
    .line 386
    invoke-virtual {v4, v0}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    :goto_f
    move-object v4, v0

    .line 391
    goto :goto_10

    .line 392
    :cond_13
    invoke-virtual {v4, v0}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    goto :goto_f

    .line 397
    :cond_14
    move-object/from16 v3, p1

    .line 398
    .line 399
    invoke-virtual {v3, v7}, Ls9/i;->a(Ls9/h;)Ls9/i;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v4, v7}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    move-object v12, v0

    .line 408
    move-object v4, v1

    .line 409
    goto :goto_10

    .line 410
    :cond_15
    move-object/from16 v3, p1

    .line 411
    .line 412
    move-object v12, v3

    .line 413
    :goto_10
    move-object/from16 v0, p0

    .line 414
    .line 415
    move-object/from16 v1, p2

    .line 416
    .line 417
    move-object/from16 p1, v12

    .line 418
    .line 419
    move-object/from16 v3, v16

    .line 420
    .line 421
    const/4 v7, 0x1

    .line 422
    move v12, v5

    .line 423
    move-object/from16 v5, v18

    .line 424
    .line 425
    goto/16 :goto_7

    .line 426
    .line 427
    :cond_16
    move-object/from16 v3, p1

    .line 428
    .line 429
    const-wide/16 v0, -0x1

    .line 430
    .line 431
    cmp-long v0, v9, v0

    .line 432
    .line 433
    if-eqz v0, :cond_18

    .line 434
    .line 435
    iget-object v0, v3, Ls9/i;->a:Lc9/c;

    .line 436
    .line 437
    invoke-virtual {v0}, Lc9/c;->size()I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    int-to-long v0, v0

    .line 442
    sub-long/2addr v0, v9

    .line 443
    :goto_11
    const-wide/16 v7, 0x0

    .line 444
    .line 445
    cmp-long v5, v0, v7

    .line 446
    .line 447
    if-lez v5, :cond_18

    .line 448
    .line 449
    const/4 v5, 0x1

    .line 450
    invoke-static {v6, v5}, LA/f;->b(II)Z

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    iget-object v8, v3, Ls9/i;->b:Lc9/d;

    .line 455
    .line 456
    if-eqz v7, :cond_17

    .line 457
    .line 458
    iget-object v7, v8, Lc9/d;->a:Lc9/c;

    .line 459
    .line 460
    invoke-virtual {v7}, Lc9/c;->d()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    check-cast v7, Ls9/k;

    .line 465
    .line 466
    goto :goto_12

    .line 467
    :cond_17
    iget-object v7, v8, Lc9/d;->a:Lc9/c;

    .line 468
    .line 469
    invoke-virtual {v7}, Lc9/c;->e()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    check-cast v7, Ls9/k;

    .line 474
    .line 475
    :goto_12
    iget-object v8, v7, Ls9/k;->a:Ls9/h;

    .line 476
    .line 477
    invoke-virtual {v3, v8}, Ls9/i;->a(Ls9/h;)Ls9/i;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    iget-object v8, v7, Ls9/k;->a:Ls9/h;

    .line 482
    .line 483
    invoke-virtual {v4, v8}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    new-instance v8, Lp9/f;

    .line 488
    .line 489
    invoke-direct {v8, v15, v7}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v8}, La2/v;->m(Lp9/f;)V

    .line 493
    .line 494
    .line 495
    const-wide/16 v7, 0x1

    .line 496
    .line 497
    sub-long/2addr v0, v7

    .line 498
    goto :goto_11

    .line 499
    :cond_18
    const/4 v5, 0x1

    .line 500
    if-eqz v11, :cond_1a

    .line 501
    .line 502
    if-nez p2, :cond_19

    .line 503
    .line 504
    goto :goto_13

    .line 505
    :cond_19
    const/4 v7, 0x0

    .line 506
    goto :goto_14

    .line 507
    :cond_1a
    :goto_13
    move v7, v5

    .line 508
    :goto_14
    const-string v0, "View was refilled using docs that themselves needed refilling."

    .line 509
    .line 510
    const/4 v1, 0x0

    .line 511
    new-array v1, v1, [Ljava/lang/Object;

    .line 512
    .line 513
    invoke-static {v7, v0, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    new-instance v0, LA7/b0;

    .line 517
    .line 518
    invoke-direct {v0, v3, v2, v4, v11}, LA7/b0;-><init>(Ls9/i;La2/v;Lc9/d;Z)V

    .line 519
    .line 520
    .line 521
    return-object v0
.end method

.method public e(I)V
    .locals 4

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-gt p1, v0, :cond_2

    .line 5
    .line 6
    iput p1, p0, Lp9/C;->a:I

    .line 7
    .line 8
    iget-object v1, p0, Lp9/C;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/content/Intent;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const-string v3, "android.support.customtabs.extra.SHARE_MENU_ITEM"

    .line 14
    .line 15
    if-ne p1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {v1, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v0, "Invalid value for the shareState argument"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method
