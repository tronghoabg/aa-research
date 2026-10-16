.class public final LA/W;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/W;->i:I

    iput-object p2, p0, LA/W;->j:Ljava/lang/Object;

    iput-object p3, p0, LA/W;->k:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LN/g;

    .line 6
    .line 7
    iget-object v0, p1, LN/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LN/f;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v2, p1, LN/g;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p1, LN/g;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, LN/g;->f:LN/e;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit v0

    .line 37
    sget-object p1, Lef/C;->a:Lef/C;

    .line 38
    .line 39
    return-object p1

    .line 40
    :goto_1
    monitor-exit v0

    .line 41
    throw p1
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, LA7/b0;

    .line 6
    .line 7
    iget-object v0, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LEf/n;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    monitor-exit v0

    .line 27
    throw p1
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LN/p0;

    .line 6
    .line 7
    iget-object v1, v0, LN/p0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, LA/W;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Throwable;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    :try_start_0
    instance-of v4, p1, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v3

    .line 25
    :goto_0
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-static {v2, p1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    move-object v2, v3

    .line 34
    :cond_2
    :goto_1
    iput-object v2, v0, LN/p0;->d:Ljava/lang/Throwable;

    .line 35
    .line 36
    iget-object p1, v0, LN/p0;->q:LHf/x0;

    .line 37
    .line 38
    sget-object v0, LN/j0;->a:LN/j0;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v3, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit v1

    .line 47
    sget-object p1, Lef/C;->a:Lef/C;

    .line 48
    .line 49
    return-object p1

    .line 50
    :goto_2
    monitor-exit v1

    .line 51
    throw p1
.end method

.method private final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lu0/B;

    .line 6
    .line 7
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LN/v;

    .line 10
    .line 11
    iget-object v1, p1, Lu0/B;->d:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object p1, p1, Lu0/B;->f:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v1

    .line 20
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v1

    .line 25
    throw p1
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    iget v6, p0, LA/W;->i:I

    .line 8
    .line 9
    packed-switch v6, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Ljava/lang/Throwable;

    .line 14
    .line 15
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, LB/F;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LB/F;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LA/W;->k:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    check-cast v1, LS3/n;

    .line 26
    .line 27
    iget-object p1, v1, LS3/n;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LGf/e;

    .line 30
    .line 31
    invoke-virtual {p1, v3, v0}, LGf/e;->k(ZLjava/lang/Throwable;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p1, v1, LS3/n;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LGf/e;

    .line 37
    .line 38
    invoke-virtual {p1}, LGf/e;->f()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, LGf/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v2, Lef/C;->a:Lef/C;

    .line 47
    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    move-object p1, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    check-cast p1, Lu1/q;

    .line 53
    .line 54
    instance-of v3, p1, Lu1/p;

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    check-cast p1, Lu1/p;

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 63
    .line 64
    const-string v4, "DataStore scope was cancelled before updateData could complete"

    .line 65
    .line 66
    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v3, v0

    .line 71
    :goto_0
    iget-object p1, p1, Lu1/p;->b:LEf/u;

    .line 72
    .line 73
    invoke-virtual {p1, v3}, LEf/u;->Y(Ljava/lang/Throwable;)Z

    .line 74
    .line 75
    .line 76
    :cond_3
    move-object p1, v2

    .line 77
    :goto_1
    if-nez p1, :cond_0

    .line 78
    .line 79
    return-object v2

    .line 80
    :pswitch_0
    check-cast p1, Lu0/j;

    .line 81
    .line 82
    const-string v0, "it"

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lu0/M0;

    .line 90
    .line 91
    iget-boolean v1, v0, Lu0/M0;->c:Z

    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    iget-object p1, p1, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 96
    .line 97
    invoke-interface {p1}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string v1, "it.lifecycleOwner.lifecycle"

    .line 102
    .line 103
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, LV/d;

    .line 109
    .line 110
    iput-object v1, v0, Lu0/M0;->e:LV/d;

    .line 111
    .line 112
    iget-object v2, v0, Lu0/M0;->d:Landroidx/lifecycle/o;

    .line 113
    .line 114
    if-nez v2, :cond_4

    .line 115
    .line 116
    iput-object p1, v0, Lu0/M0;->d:Landroidx/lifecycle/o;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    sget-object v2, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n;

    .line 127
    .line 128
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-ltz p1, :cond_5

    .line 133
    .line 134
    new-instance p1, Lu0/L0;

    .line 135
    .line 136
    invoke-direct {p1, v0, v1, v4}, Lu0/L0;-><init>(Lu0/M0;LV/d;I)V

    .line 137
    .line 138
    .line 139
    new-instance v1, LV/d;

    .line 140
    .line 141
    const v2, -0x773f589e

    .line 142
    .line 143
    .line 144
    invoke-direct {v1, v2, v4, p1}, LV/d;-><init>(IZLef/e;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, v0, Lu0/M0;->b:LN/s;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, LN/s;->b(LV/d;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 153
    .line 154
    return-object p1

    .line 155
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 156
    .line 157
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, Lu0/C;

    .line 160
    .line 161
    iget-object p1, p1, Lu0/C;->a:Landroid/view/Choreographer;

    .line 162
    .line 163
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, LN/v;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 168
    .line 169
    .line 170
    sget-object p1, Lef/C;->a:Lef/C;

    .line 171
    .line 172
    return-object p1

    .line 173
    :pswitch_2
    invoke-direct {p0, p1}, LA/W;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :pswitch_3
    check-cast p1, LN/C;

    .line 179
    .line 180
    const-string v0, "$this$DisposableEffect"

    .line 181
    .line 182
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Landroid/content/Context;

    .line 188
    .line 189
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, Lu0/y;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 198
    .line 199
    .line 200
    new-instance v0, LA/V;

    .line 201
    .line 202
    const/4 v2, 0x7

    .line 203
    invoke-direct {v0, v2, p1, v1}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_4
    check-cast p1, Landroid/view/MotionEvent;

    .line 208
    .line 209
    const-string v0, "motionEvent"

    .line 210
    .line 211
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const-string v3, "onTouchEvent"

    .line 219
    .line 220
    iget-object v4, p0, LA/W;->k:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v4, Lp0/r;

    .line 223
    .line 224
    if-nez v0, :cond_8

    .line 225
    .line 226
    iget-object v0, v4, Lp0/r;->a:LM0/c;

    .line 227
    .line 228
    if-eqz v0, :cond_7

    .line 229
    .line 230
    invoke-virtual {v0, p1}, LM0/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-eqz p1, :cond_6

    .line 241
    .line 242
    move v1, v2

    .line 243
    :cond_6
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p1, Lp0/q;

    .line 246
    .line 247
    iput v1, p1, Lp0/q;->c:I

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v5

    .line 254
    :cond_8
    iget-object v0, v4, Lp0/r;->a:LM0/c;

    .line 255
    .line 256
    if-eqz v0, :cond_9

    .line 257
    .line 258
    invoke-virtual {v0, p1}, LM0/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 262
    .line 263
    return-object p1

    .line 264
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v5

    .line 268
    :pswitch_5
    check-cast p1, Lr0/s;

    .line 269
    .line 270
    const-string v0, "$this$layout"

    .line 271
    .line 272
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Le0/F;

    .line 278
    .line 279
    iget-object v0, v0, Le0/F;->k:LB/F;

    .line 280
    .line 281
    iget-object v1, p0, LA/W;->j:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v1, Lr0/t;

    .line 284
    .line 285
    invoke-static {p1, v1, v0}, Lr0/s;->e(Lr0/s;Lr0/t;Ltf/l;)V

    .line 286
    .line 287
    .line 288
    sget-object p1, Lef/C;->a:Lef/C;

    .line 289
    .line 290
    return-object p1

    .line 291
    :pswitch_6
    check-cast p1, Lr0/s;

    .line 292
    .line 293
    const-string v0, "$this$layout"

    .line 294
    .line 295
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Le0/l;

    .line 301
    .line 302
    iget-object v0, v0, Le0/l;->b:Ltf/l;

    .line 303
    .line 304
    iget-object v1, p0, LA/W;->j:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v1, Lr0/t;

    .line 307
    .line 308
    invoke-static {p1, v1, v0}, Lr0/s;->e(Lr0/s;Lr0/t;Ltf/l;)V

    .line 309
    .line 310
    .line 311
    sget-object p1, Lef/C;->a:Lef/C;

    .line 312
    .line 313
    return-object p1

    .line 314
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 315
    .line 316
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, LN0/j;

    .line 319
    .line 320
    if-eqz p1, :cond_b

    .line 321
    .line 322
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 323
    .line 324
    if-eqz v1, :cond_a

    .line 325
    .line 326
    iput-boolean v4, v0, LN0/j;->d:Z

    .line 327
    .line 328
    iget-object p1, v0, LN0/j;->b:LN0/m;

    .line 329
    .line 330
    if-eqz p1, :cond_c

    .line 331
    .line 332
    iget-object p1, p1, LN0/m;->b:LN0/l;

    .line 333
    .line 334
    invoke-virtual {p1, v4}, LN0/i;->cancel(Z)Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-eqz p1, :cond_c

    .line 339
    .line 340
    iput-object v5, v0, LN0/j;->a:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v5, v0, LN0/j;->b:LN0/m;

    .line 343
    .line 344
    iput-object v5, v0, LN0/j;->c:LN0/n;

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_a
    invoke-virtual {v0, p1}, LN0/j;->b(Ljava/lang/Throwable;)V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :cond_b
    iget-object p1, p0, LA/W;->k:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast p1, LEf/L;

    .line 354
    .line 355
    invoke-virtual {p1}, LEf/z0;->y()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    invoke-virtual {v0, p1}, LN0/j;->a(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_c
    :goto_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 363
    .line 364
    return-object p1

    .line 365
    :pswitch_8
    check-cast p1, Lc0/r;

    .line 366
    .line 367
    const-string v0, "it"

    .line 368
    .line 369
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, LN/V;

    .line 375
    .line 376
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-nez v1, :cond_d

    .line 385
    .line 386
    invoke-interface {v0, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, LB/D;

    .line 392
    .line 393
    invoke-virtual {v0, p1}, LB/D;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    :cond_d
    sget-object p1, Lef/C;->a:Lef/C;

    .line 397
    .line 398
    return-object p1

    .line 399
    :pswitch_9
    check-cast p1, Lr0/s;

    .line 400
    .line 401
    const-string v0, "$this$layout"

    .line 402
    .line 403
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    iget-object p1, p0, LA/W;->k:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p1, LZ/l;

    .line 409
    .line 410
    iget p1, p1, LZ/l;->b:F

    .line 411
    .line 412
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v0, Lr0/t;

    .line 415
    .line 416
    invoke-static {v0, v3, v3, p1}, Lr0/s;->a(Lr0/t;IIF)V

    .line 417
    .line 418
    .line 419
    sget-object p1, Lef/C;->a:Lef/C;

    .line 420
    .line 421
    return-object p1

    .line 422
    :pswitch_a
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, LN/s;

    .line 425
    .line 426
    invoke-virtual {v0, p1}, LN/s;->w(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lx/r;

    .line 432
    .line 433
    if-eqz v0, :cond_e

    .line 434
    .line 435
    invoke-virtual {v0, p1}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    :cond_e
    sget-object p1, Lef/C;->a:Lef/C;

    .line 439
    .line 440
    return-object p1

    .line 441
    :pswitch_b
    invoke-direct {p0, p1}, LA/W;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    return-object p1

    .line 446
    :pswitch_c
    invoke-direct {p0, p1}, LA/W;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    return-object p1

    .line 451
    :pswitch_d
    invoke-direct {p0, p1}, LA/W;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    return-object p1

    .line 456
    :pswitch_e
    check-cast p1, Lt0/I;

    .line 457
    .line 458
    const-string v0, "owner"

    .line 459
    .line 460
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    instance-of v0, p1, Lu0/n;

    .line 464
    .line 465
    if-eqz v0, :cond_f

    .line 466
    .line 467
    check-cast p1, Lu0/n;

    .line 468
    .line 469
    goto :goto_5

    .line 470
    :cond_f
    move-object p1, v5

    .line 471
    :goto_5
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, LM0/o;

    .line 474
    .line 475
    if-eqz p1, :cond_10

    .line 476
    .line 477
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Lu0/F;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-virtual {p1}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    invoke-virtual {p1}, Lu0/F;->getHolderToLayoutNode()Ljava/util/HashMap;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    invoke-static {v1}, Lkotlin/jvm/internal/K;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    sget-object p1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 512
    .line 513
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 514
    .line 515
    .line 516
    :cond_10
    invoke-virtual {v0}, LM0/i;->getView()Landroid/view/View;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v1, Lkotlin/jvm/internal/G;

    .line 523
    .line 524
    iput-object p1, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 525
    .line 526
    invoke-virtual {v0, v5}, LM0/i;->setView$ui_release(Landroid/view/View;)V

    .line 527
    .line 528
    .line 529
    sget-object p1, Lef/C;->a:Lef/C;

    .line 530
    .line 531
    return-object p1

    .line 532
    :pswitch_f
    check-cast p1, LZ/k;

    .line 533
    .line 534
    const-string v0, "it"

    .line 535
    .line 536
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, LZ/k;

    .line 542
    .line 543
    invoke-interface {p1, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, Lt0/t;

    .line 550
    .line 551
    invoke-virtual {v0, p1}, Lt0/t;->D(LZ/k;)V

    .line 552
    .line 553
    .line 554
    sget-object p1, Lef/C;->a:Lef/C;

    .line 555
    .line 556
    return-object p1

    .line 557
    :pswitch_10
    check-cast p1, Lx0/g;

    .line 558
    .line 559
    const-string v0, "$this$semantics"

    .line 560
    .line 561
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    sget-object v0, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 565
    .line 566
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v0, Lz0/b;

    .line 569
    .line 570
    sget-object v1, Lx0/n;->q:Lx0/q;

    .line 571
    .line 572
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {p1, v1, v0}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    new-instance v0, LI/f;

    .line 580
    .line 581
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v1, LI/i;

    .line 584
    .line 585
    invoke-direct {v0, v1, v4}, LI/f;-><init>(LI/i;I)V

    .line 586
    .line 587
    .line 588
    sget-object v1, Lx0/f;->a:Lx0/q;

    .line 589
    .line 590
    new-instance v2, Lx0/a;

    .line 591
    .line 592
    invoke-direct {v2, v5, v0}, Lx0/a;-><init>(Ljava/lang/String;Lef/e;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p1, v1, v2}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    sget-object p1, Lef/C;->a:Lef/C;

    .line 599
    .line 600
    return-object p1

    .line 601
    :pswitch_11
    check-cast p1, LN/C;

    .line 602
    .line 603
    const-string v1, "$this$DisposableEffect"

    .line 604
    .line 605
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast p1, LG/e;

    .line 611
    .line 612
    iget-object v1, p1, LG/e;->a:LP/d;

    .line 613
    .line 614
    iget-object v2, p0, LA/W;->k:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v2, LG/g;

    .line 617
    .line 618
    invoke-virtual {v1, v2}, LP/d;->b(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    new-instance v1, LA/V;

    .line 622
    .line 623
    invoke-direct {v1, v0, p1, v2}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    return-object v1

    .line 627
    :pswitch_12
    check-cast p1, LE0/q;

    .line 628
    .line 629
    const-string v0, "finalResult"

    .line 630
    .line 631
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, LS3/c;

    .line 637
    .line 638
    iget-object v1, v0, LS3/c;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v1, Lc8/e;

    .line 641
    .line 642
    iget-object v2, p0, LA/W;->k:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v2, LE0/p;

    .line 645
    .line 646
    monitor-enter v1

    .line 647
    :try_start_0
    iget-boolean v3, p1, LE0/q;->b:Z

    .line 648
    .line 649
    if-eqz v3, :cond_11

    .line 650
    .line 651
    iget-object v0, v0, LS3/c;->c:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, LD0/b;

    .line 654
    .line 655
    invoke-virtual {v0, v2, p1}, LD0/b;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    goto :goto_6

    .line 659
    :catchall_0
    move-exception v0

    .line 660
    move-object p1, v0

    .line 661
    goto :goto_7

    .line 662
    :cond_11
    iget-object p1, v0, LS3/c;->c:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast p1, LD0/b;

    .line 665
    .line 666
    invoke-virtual {p1, v2}, LD0/b;->e(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 667
    .line 668
    .line 669
    :goto_6
    monitor-exit v1

    .line 670
    sget-object p1, Lef/C;->a:Lef/C;

    .line 671
    .line 672
    return-object p1

    .line 673
    :goto_7
    monitor-exit v1

    .line 674
    throw p1

    .line 675
    :pswitch_13
    check-cast p1, Ltf/l;

    .line 676
    .line 677
    const-string v0, "onAsyncCompletion"

    .line 678
    .line 679
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast p1, LE0/f;

    .line 685
    .line 686
    iget-object v0, p1, LE0/f;->d:LE0/i;

    .line 687
    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    iget-object v0, p0, LA/W;->k:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v0, LE0/p;

    .line 694
    .line 695
    iget-object v1, p1, LE0/f;->a:LE0/a;

    .line 696
    .line 697
    const-string v2, "platformFontLoader"

    .line 698
    .line 699
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const-string v1, "createDefaultTypeface"

    .line 703
    .line 704
    iget-object v2, p1, LE0/f;->f:LB/F;

    .line 705
    .line 706
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    iget-object p1, p1, LE0/f;->e:Lxa/d;

    .line 710
    .line 711
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    iget-object v1, v0, LE0/p;->a:LE0/o;

    .line 715
    .line 716
    if-nez v1, :cond_12

    .line 717
    .line 718
    move v2, v4

    .line 719
    goto :goto_8

    .line 720
    :cond_12
    instance-of v2, v1, LE0/c;

    .line 721
    .line 722
    :goto_8
    iget-object p1, p1, Lxa/d;->b:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast p1, LE0/n;

    .line 725
    .line 726
    iget v3, v0, LE0/p;->c:I

    .line 727
    .line 728
    iget-object v0, v0, LE0/p;->b:LE0/l;

    .line 729
    .line 730
    if-eqz v2, :cond_13

    .line 731
    .line 732
    invoke-interface {p1, v0, v3}, LE0/n;->o(LE0/l;I)Landroid/graphics/Typeface;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    goto :goto_9

    .line 737
    :cond_13
    instance-of v2, v1, LE0/m;

    .line 738
    .line 739
    if-eqz v2, :cond_14

    .line 740
    .line 741
    check-cast v1, LE0/m;

    .line 742
    .line 743
    invoke-interface {p1, v1, v0, v3}, LE0/n;->i(LE0/m;LE0/l;I)Landroid/graphics/Typeface;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    :goto_9
    new-instance v5, LE0/q;

    .line 748
    .line 749
    invoke-direct {v5, p1, v4}, LE0/q;-><init>(Ljava/lang/Object;Z)V

    .line 750
    .line 751
    .line 752
    :cond_14
    if-eqz v5, :cond_15

    .line 753
    .line 754
    return-object v5

    .line 755
    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 756
    .line 757
    const-string v0, "Could not load font"

    .line 758
    .line 759
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    throw p1

    .line 763
    :pswitch_14
    check-cast p1, LN/C;

    .line 764
    .line 765
    const-string v0, "$this$DisposableEffect"

    .line 766
    .line 767
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast p1, LE/S;

    .line 773
    .line 774
    const-string v0, "view"

    .line 775
    .line 776
    iget-object v2, p0, LA/W;->k:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v2, Landroid/view/View;

    .line 779
    .line 780
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    iget v0, p1, LE/S;->q:I

    .line 784
    .line 785
    if-nez v0, :cond_17

    .line 786
    .line 787
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 788
    .line 789
    iget-object v0, p1, LE/S;->r:LE/z;

    .line 790
    .line 791
    invoke-static {v2, v0}, Lk1/J;->l(Landroid/view/View;Lk1/r;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    if-eqz v3, :cond_16

    .line 799
    .line 800
    invoke-virtual {v2}, Landroid/view/View;->requestApplyInsets()V

    .line 801
    .line 802
    .line 803
    :cond_16
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 804
    .line 805
    .line 806
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 807
    .line 808
    const/16 v5, 0x1e

    .line 809
    .line 810
    if-lt v3, v5, :cond_17

    .line 811
    .line 812
    invoke-static {v2, v0}, Lk1/S;->o(Landroid/view/View;LYf/f;)V

    .line 813
    .line 814
    .line 815
    :cond_17
    iget v0, p1, LE/S;->q:I

    .line 816
    .line 817
    add-int/2addr v0, v4

    .line 818
    iput v0, p1, LE/S;->q:I

    .line 819
    .line 820
    new-instance v0, LA/V;

    .line 821
    .line 822
    invoke-direct {v0, v1, p1, v2}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    return-object v0

    .line 826
    :pswitch_15
    check-cast p1, Lx0/g;

    .line 827
    .line 828
    const-string v1, "$this$semantics"

    .line 829
    .line 830
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    iget-object v1, p0, LA/W;->j:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v1, LN/V;

    .line 836
    .line 837
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    check-cast v3, Ljava/lang/Boolean;

    .line 842
    .line 843
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 844
    .line 845
    .line 846
    sget-object v4, Lx0/p;->a:[Lkotlin/reflect/KProperty;

    .line 847
    .line 848
    aget-object v0, v4, v0

    .line 849
    .line 850
    sget-object v4, Lx0/p;->b:Lx0/q;

    .line 851
    .line 852
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    const-string v6, "property"

    .line 856
    .line 857
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {p1, v4, v3}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    new-instance v0, LA0/e;

    .line 864
    .line 865
    iget-object v3, p0, LA/W;->k:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v3, Lc0/o;

    .line 868
    .line 869
    invoke-direct {v0, v2, v3, v1}, LA0/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    sget-object v1, Lx0/f;->n:Lx0/q;

    .line 873
    .line 874
    new-instance v2, Lx0/a;

    .line 875
    .line 876
    invoke-direct {v2, v5, v0}, Lx0/a;-><init>(Ljava/lang/String;Lef/e;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {p1, v1, v2}, Lx0/g;->d(Lx0/q;Ljava/lang/Object;)V

    .line 880
    .line 881
    .line 882
    sget-object p1, Lef/C;->a:Lef/C;

    .line 883
    .line 884
    return-object p1

    .line 885
    :pswitch_16
    move-object v0, p1

    .line 886
    check-cast v0, Lt0/v;

    .line 887
    .line 888
    const-string p1, "$this$onDrawWithContent"

    .line 889
    .line 890
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0}, Lt0/v;->a()V

    .line 894
    .line 895
    .line 896
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 897
    .line 898
    move-object v1, p1

    .line 899
    check-cast v1, Le0/f;

    .line 900
    .line 901
    iget-object p1, p0, LA/W;->k:Ljava/lang/Object;

    .line 902
    .line 903
    move-object v2, p1

    .line 904
    check-cast v2, Le0/m;

    .line 905
    .line 906
    const/4 v4, 0x0

    .line 907
    const/16 v5, 0x3c

    .line 908
    .line 909
    const/4 v3, 0x0

    .line 910
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/consent_sdk/a;->e(Lg0/d;Le0/f;Le0/m;FLg0/g;I)V

    .line 911
    .line 912
    .line 913
    sget-object p1, Lef/C;->a:Lef/C;

    .line 914
    .line 915
    return-object p1

    .line 916
    :pswitch_17
    check-cast p1, LN/C;

    .line 917
    .line 918
    const-string v0, "$this$DisposableEffect"

    .line 919
    .line 920
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast p1, LA/U;

    .line 926
    .line 927
    const-string v0, "animation"

    .line 928
    .line 929
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v1, LA/O;

    .line 932
    .line 933
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    iget-object v0, p1, LA/U;->h:LX/p;

    .line 937
    .line 938
    invoke-virtual {v0, v1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    new-instance v0, LA/V;

    .line 942
    .line 943
    invoke-direct {v0, v2, p1, v1}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 944
    .line 945
    .line 946
    return-object v0

    .line 947
    :pswitch_18
    check-cast p1, LN/C;

    .line 948
    .line 949
    const-string v0, "$this$DisposableEffect"

    .line 950
    .line 951
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    new-instance p1, LA/V;

    .line 955
    .line 956
    iget-object v0, p0, LA/W;->j:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v0, LA/U;

    .line 959
    .line 960
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v1, LA/M;

    .line 963
    .line 964
    invoke-direct {p1, v4, v0, v1}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 965
    .line 966
    .line 967
    return-object p1

    .line 968
    :pswitch_19
    check-cast p1, LN/C;

    .line 969
    .line 970
    const-string v0, "$this$DisposableEffect"

    .line 971
    .line 972
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    iget-object p1, p0, LA/W;->j:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast p1, LA/U;

    .line 978
    .line 979
    const-string v0, "transition"

    .line 980
    .line 981
    iget-object v1, p0, LA/W;->k:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v1, LA/U;

    .line 984
    .line 985
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    iget-object v0, p1, LA/U;->i:LX/p;

    .line 989
    .line 990
    invoke-virtual {v0, v1}, LX/p;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    new-instance v0, LA/V;

    .line 994
    .line 995
    invoke-direct {v0, v3, p1, v1}, LA/V;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 996
    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
