.class public final Lt0/p;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt0/p;->i:I

    iput-object p1, p0, Lt0/p;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lu0/l0;Lu0/s;)V
    .locals 0

    const/4 p2, 0x5

    iput p2, p0, Lt0/p;->i:I

    .line 2
    iput-object p1, p0, Lt0/p;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lt0/p;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA0/e;

    .line 9
    .line 10
    invoke-virtual {v0}, LA0/e;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/io/File;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "getName(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/16 v2, 0x2e

    .line 26
    .line 27
    const-string v3, ""

    .line 28
    .line 29
    invoke-static {v2, v1, v3}, LBf/k;->N0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "preferences_pb"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "File extension for file: "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, " does not match required extension for Preferences file: preferences_pb"

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :pswitch_0
    const-string v0, "There are multiple DataStores active for the same file: "

    .line 72
    .line 73
    iget-object v1, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lu1/G;

    .line 76
    .line 77
    iget-object v1, v1, Lu1/G;->a:Ltf/a;

    .line 78
    .line 79
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/io/File;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    sget-object v3, Lu1/G;->k:Ljava/lang/Object;

    .line 90
    .line 91
    monitor-enter v3

    .line 92
    :try_start_0
    sget-object v4, Lu1/G;->j:Ljava/util/LinkedHashSet;

    .line 93
    .line 94
    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_1

    .line 99
    .line 100
    const-string v0, "it"

    .line 101
    .line 102
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    .line 108
    monitor-exit v3

    .line 109
    return-object v1

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto :goto_0

    .line 112
    :cond_1
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v0, ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore\'s active on the same file (by confirming that the scope is cancelled)."

    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :goto_0
    monitor-exit v3

    .line 140
    throw v0

    .line 141
    :pswitch_1
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Lu0/l0;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    sget-object v0, Lef/C;->a:Lef/C;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_2
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lu0/n;

    .line 154
    .line 155
    iget-object v1, v0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 156
    .line 157
    if-eqz v1, :cond_3

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    const/4 v2, 0x7

    .line 164
    if-eq v1, v2, :cond_2

    .line 165
    .line 166
    const/16 v2, 0x9

    .line 167
    .line 168
    if-eq v1, v2, :cond_2

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    iput-wide v1, v0, Lu0/n;->f0:J

    .line 176
    .line 177
    iget-object v1, v0, Lu0/n;->i0:Lg5/d;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 180
    .line 181
    .line 182
    :cond_3
    :goto_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_3
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lt0/B;

    .line 188
    .line 189
    iget-object v1, v0, Lt0/B;->b:Ls0/a;

    .line 190
    .line 191
    invoke-interface {v1, v0}, Ls0/a;->o(Ls0/c;)V

    .line 192
    .line 193
    .line 194
    sget-object v0, Lef/C;->a:Lef/C;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_4
    sget-object v0, Lt0/y;->w:Le0/B;

    .line 198
    .line 199
    iget-object v1, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Ltf/l;

    .line 202
    .line 203
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    sget-object v0, Lef/C;->a:Lef/C;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_5
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Lt0/y;

    .line 212
    .line 213
    iget-object v0, v0, Lt0/y;->f:Lt0/y;

    .line 214
    .line 215
    if-eqz v0, :cond_4

    .line 216
    .line 217
    invoke-virtual {v0}, Lt0/y;->R()V

    .line 218
    .line 219
    .line 220
    :cond_4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_6
    iget-object v0, p0, Lt0/p;->j:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Lt0/t;

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    iput v1, v0, Lt0/t;->v:I

    .line 229
    .line 230
    invoke-virtual {v0}, Lt0/t;->l()LP/d;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    iget v3, v2, LP/d;->c:I

    .line 235
    .line 236
    const v4, 0x7fffffff

    .line 237
    .line 238
    .line 239
    if-lez v3, :cond_7

    .line 240
    .line 241
    iget-object v2, v2, LP/d;->a:[Ljava/lang/Object;

    .line 242
    .line 243
    move v5, v1

    .line 244
    :cond_5
    aget-object v6, v2, v5

    .line 245
    .line 246
    check-cast v6, Lt0/t;

    .line 247
    .line 248
    iget v7, v6, Lt0/t;->t:I

    .line 249
    .line 250
    iput v7, v6, Lt0/t;->u:I

    .line 251
    .line 252
    iput v4, v6, Lt0/t;->t:I

    .line 253
    .line 254
    iget-object v7, v6, Lt0/t;->r:Lt0/u;

    .line 255
    .line 256
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    iget v7, v6, Lt0/t;->O:I

    .line 260
    .line 261
    const/4 v8, 0x2

    .line 262
    if-ne v7, v8, :cond_6

    .line 263
    .line 264
    const/4 v7, 0x3

    .line 265
    iput v7, v6, Lt0/t;->O:I

    .line 266
    .line 267
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 268
    .line 269
    if-lt v5, v3, :cond_5

    .line 270
    .line 271
    :cond_7
    iget-object v2, v0, Lt0/t;->x:Lt0/i;

    .line 272
    .line 273
    invoke-virtual {v2}, Lt0/y;->I()LD0/b;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v2}, LD0/b;->c()V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Lt0/t;->l()LP/d;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    iget v3, v2, LP/d;->c:I

    .line 285
    .line 286
    if-lez v3, :cond_a

    .line 287
    .line 288
    iget-object v2, v2, LP/d;->a:[Ljava/lang/Object;

    .line 289
    .line 290
    move v5, v1

    .line 291
    :cond_8
    aget-object v6, v2, v5

    .line 292
    .line 293
    check-cast v6, Lt0/t;

    .line 294
    .line 295
    iget v7, v6, Lt0/t;->u:I

    .line 296
    .line 297
    iget v8, v6, Lt0/t;->t:I

    .line 298
    .line 299
    if-eq v7, v8, :cond_9

    .line 300
    .line 301
    invoke-virtual {v0}, Lt0/t;->x()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lt0/t;->o()V

    .line 305
    .line 306
    .line 307
    iget v7, v6, Lt0/t;->t:I

    .line 308
    .line 309
    if-ne v7, v4, :cond_9

    .line 310
    .line 311
    invoke-virtual {v6}, Lt0/t;->u()V

    .line 312
    .line 313
    .line 314
    :cond_9
    iget-object v6, v6, Lt0/t;->r:Lt0/u;

    .line 315
    .line 316
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iput-boolean v1, v6, Lt0/u;->c:Z

    .line 320
    .line 321
    add-int/lit8 v5, v5, 0x1

    .line 322
    .line 323
    if-lt v5, v3, :cond_8

    .line 324
    .line 325
    :cond_a
    sget-object v0, Lef/C;->a:Lef/C;

    .line 326
    .line 327
    return-object v0

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
