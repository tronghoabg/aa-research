.class public final Lg5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg5/d;->a:I

    iput-object p1, p0, Lg5/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpd/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lpd/m;

    .line 11
    .line 12
    iget-object v1, v0, Lpd/m;->o:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    iget-object v0, v0, Lpd/m;->t:LA7/p1;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lpd/m;

    .line 22
    .line 23
    iget-object v0, v0, Lpd/m;->k:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lpd/m;

    .line 29
    .line 30
    const v2, 0x7fffffff

    .line 31
    .line 32
    .line 33
    iput v2, v1, Lpd/m;->C:I

    .line 34
    .line 35
    invoke-virtual {v1}, Lpd/m;->v()Z

    .line 36
    .line 37
    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lpd/m;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v1
.end method


# virtual methods
.method public a()Lgf/h;
    .locals 4

    .line 1
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk3/h;

    .line 4
    .line 5
    new-instance v1, Lgf/h;

    .line 6
    .line 7
    invoke-direct {v1}, Lgf/h;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lk3/h;->a:Lk3/m;

    .line 11
    .line 12
    new-instance v2, LNe/a;

    .line 13
    .line 14
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 15
    .line 16
    invoke-direct {v2, v3}, LNe/a;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Lgf/h;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ltg/b;->m(Lgf/h;)Lgf/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, v0, Lgf/h;->a:Lgf/f;

    .line 52
    .line 53
    invoke-virtual {v1}, Lgf/f;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lk3/h;

    .line 62
    .line 63
    iget-object v1, v1, Lk3/h;->g:Lo3/g;

    .line 64
    .line 65
    const-string v2, "Required value was null."

    .line 66
    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lk3/h;

    .line 72
    .line 73
    iget-object v1, v1, Lk3/h;->g:Lo3/g;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-interface {v1}, Lo3/g;->g()I

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_3
    return-object v0

    .line 94
    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    :catchall_1
    move-exception v2

    .line 96
    invoke-static {v0, v1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v2
.end method

.method public final run()V
    .locals 15

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    iget v6, p0, Lg5/d;->a:I

    .line 8
    .line 9
    packed-switch v6, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lv9/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Lv9/r;->a:Lv9/r;

    .line 23
    .line 24
    sget-object v2, Lmd/k0;->e:Lmd/k0;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lv9/b;->a(Lv9/r;Lmd/k0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lu0/n;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    iget-object v7, v0, Lu0/n;->e0:Landroid/view/MotionEvent;

    .line 38
    .line 39
    if-eqz v7, :cond_4

    .line 40
    .line 41
    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x3

    .line 46
    if-ne v0, v1, :cond_1

    .line 47
    .line 48
    move v5, v4

    .line 49
    :cond_1
    invoke-virtual {v7}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    const/16 v1, 0xa

    .line 56
    .line 57
    if-eq v0, v1, :cond_4

    .line 58
    .line 59
    if-eq v0, v4, :cond_4

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-eq v0, v4, :cond_4

    .line 63
    .line 64
    :goto_0
    const/4 v1, 0x7

    .line 65
    if-eq v0, v1, :cond_3

    .line 66
    .line 67
    const/16 v3, 0x9

    .line 68
    .line 69
    if-eq v0, v3, :cond_3

    .line 70
    .line 71
    move v8, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v8, v1

    .line 74
    :goto_1
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v6, v0

    .line 77
    check-cast v6, Lu0/n;

    .line 78
    .line 79
    iget-wide v9, v6, Lu0/n;->f0:J

    .line 80
    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-virtual/range {v6 .. v11}, Lu0/n;->v(Landroid/view/MotionEvent;IJZ)V

    .line 83
    .line 84
    .line 85
    :cond_4
    return-void

    .line 86
    :pswitch_1
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lvb/a;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Lrb/a;->b(Lnb/b;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_2
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lf6/N;

    .line 97
    .line 98
    iget-object v1, v0, Lf6/N;->r:[Lf6/U;

    .line 99
    .line 100
    array-length v2, v1

    .line 101
    :goto_2
    if-ge v5, v2, :cond_6

    .line 102
    .line 103
    aget-object v6, v1, v5

    .line 104
    .line 105
    invoke-virtual {v6, v4}, Lf6/U;->o(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v7, v6, Lf6/U;->h:LA/e0;

    .line 109
    .line 110
    if-eqz v7, :cond_5

    .line 111
    .line 112
    iget-object v8, v6, Lf6/U;->e:LI5/f;

    .line 113
    .line 114
    invoke-virtual {v7, v8}, LA/e0;->y(LI5/f;)V

    .line 115
    .line 116
    .line 117
    iput-object v3, v6, Lf6/U;->h:LA/e0;

    .line 118
    .line 119
    iput-object v3, v6, Lf6/U;->g:LE5/T;

    .line 120
    .line 121
    :cond_5
    add-int/2addr v5, v4

    .line 122
    goto :goto_2

    .line 123
    :cond_6
    iget-object v0, v0, Lf6/N;->k:Lb7/k;

    .line 124
    .line 125
    iget-object v1, v0, Lb7/k;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, LJ5/k;

    .line 128
    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    invoke-interface {v1}, LJ5/k;->release()V

    .line 132
    .line 133
    .line 134
    iput-object v3, v0, Lb7/k;->c:Ljava/lang/Object;

    .line 135
    .line 136
    :cond_7
    iput-object v3, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_3
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lt1/d;

    .line 142
    .line 143
    invoke-virtual {v0, v5}, Lt1/d;->n(I)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_4
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Lr4/d;

    .line 150
    .line 151
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f(Lr4/d;)V

    .line 152
    .line 153
    .line 154
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->k:Ls4/a;

    .line 155
    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    :try_start_0
    iget-object v1, v1, Ls4/a;->a:Ls4/b;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, Ls4/b;->b(Lr4/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catch_0
    move-exception v0

    .line 165
    invoke-static {v0}, Lu4/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v1, "Exception thrown inside global complete callback."

    .line 170
    .line 171
    const-string v2, "ffmpeg-kit"

    .line 172
    .line 173
    invoke-static {v1, v0, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    :goto_3
    return-void

    .line 177
    :pswitch_5
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lr4/c;

    .line 180
    .line 181
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e(Lr4/c;)V

    .line 182
    .line 183
    .line 184
    sget-object v1, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->j:Ls4/a;

    .line 185
    .line 186
    if-eqz v1, :cond_9

    .line 187
    .line 188
    :try_start_1
    iget-object v1, v1, Ls4/a;->a:Ls4/b;

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ls4/b;->b(Lr4/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catch_1
    move-exception v0

    .line 195
    invoke-static {v0}, Lu4/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, "Exception thrown inside global complete callback."

    .line 200
    .line 201
    const-string v2, "ffmpeg-kit"

    .line 202
    .line 203
    invoke-static {v1, v0, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_9
    :goto_4
    return-void

    .line 207
    :pswitch_6
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 210
    .line 211
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 212
    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:Lq/i;

    .line 216
    .line 217
    if-eqz v0, :cond_a

    .line 218
    .line 219
    invoke-virtual {v0}, Lq/i;->k()Z

    .line 220
    .line 221
    .line 222
    :cond_a
    return-void

    .line 223
    :pswitch_7
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Lq/t0;

    .line 226
    .line 227
    iput-object v3, v0, Lq/t0;->l:Lg5/d;

    .line 228
    .line 229
    invoke-virtual {v0}, Lq/t0;->drawableStateChanged()V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_8
    invoke-direct {p0}, Lg5/d;->b()V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_9
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, LA2/d;

    .line 240
    .line 241
    iget-wide v6, v0, LA2/d;->b:J

    .line 242
    .line 243
    const-wide/16 v8, 0x2

    .line 244
    .line 245
    mul-long/2addr v8, v6

    .line 246
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 247
    .line 248
    .line 249
    move-result-wide v8

    .line 250
    iget-object v0, v0, LA2/d;->c:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Lod/d;

    .line 253
    .line 254
    iget-object v1, v0, Lod/d;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 255
    .line 256
    invoke-virtual {v1, v6, v7, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_b

    .line 261
    .line 262
    sget-object v1, Lod/d;->c:Ljava/util/logging/Logger;

    .line 263
    .line 264
    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 265
    .line 266
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    iget-object v0, v0, Lod/d;->a:Ljava/lang/String;

    .line 271
    .line 272
    new-array v2, v2, [Ljava/lang/Object;

    .line 273
    .line 274
    aput-object v0, v2, v5

    .line 275
    .line 276
    aput-object v6, v2, v4

    .line 277
    .line 278
    const-string v0, "Increased {0} to {1}"

    .line 279
    .line 280
    invoke-virtual {v1, v3, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_b
    return-void

    .line 284
    :pswitch_a
    iget-object v2, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v2, Lpd/c;

    .line 287
    .line 288
    iget-object v3, v2, Lpd/c;->d:Lpd/m;

    .line 289
    .line 290
    :try_start_2
    iget-object v4, v2, Lpd/c;->i:Lcg/c;

    .line 291
    .line 292
    if-eqz v4, :cond_c

    .line 293
    .line 294
    iget-object v5, v2, Lpd/c;->b:Lcg/g;

    .line 295
    .line 296
    iget-wide v6, v5, Lcg/g;->b:J

    .line 297
    .line 298
    cmp-long v0, v6, v0

    .line 299
    .line 300
    if-lez v0, :cond_c

    .line 301
    .line 302
    invoke-virtual {v4, v5, v6, v7}, Lcg/c;->E(Lcg/g;J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :catch_2
    move-exception v0

    .line 307
    invoke-virtual {v3, v0}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 308
    .line 309
    .line 310
    :cond_c
    :goto_5
    :try_start_3
    iget-object v0, v2, Lpd/c;->i:Lcg/c;

    .line 311
    .line 312
    if-eqz v0, :cond_d

    .line 313
    .line 314
    invoke-virtual {v0}, Lcg/c;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :catch_3
    move-exception v0

    .line 319
    invoke-virtual {v3, v0}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 320
    .line 321
    .line 322
    :cond_d
    :goto_6
    :try_start_4
    iget-object v0, v2, Lpd/c;->j:Ljava/net/Socket;

    .line 323
    .line 324
    if-eqz v0, :cond_e

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 327
    .line 328
    .line 329
    goto :goto_7

    .line 330
    :catch_4
    move-exception v0

    .line 331
    invoke-virtual {v3, v0}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 332
    .line 333
    .line 334
    :cond_e
    :goto_7
    return-void

    .line 335
    :pswitch_b
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lrb/c;

    .line 338
    .line 339
    invoke-virtual {v0, v3}, Lrb/a;->b(Lnb/b;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :pswitch_c
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v0, Lod/L1;

    .line 346
    .line 347
    invoke-virtual {v0}, Lod/L1;->h()V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_d
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lod/E1;

    .line 354
    .line 355
    iget-object v1, v0, Lod/E1;->c:Lod/a2;

    .line 356
    .line 357
    iget-object v1, v1, Lod/a2;->c:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v1, Lod/B0;

    .line 360
    .line 361
    iget-object v0, v0, Lod/E1;->b:Lod/G1;

    .line 362
    .line 363
    sget-object v2, Lod/B0;->E:Lmd/W;

    .line 364
    .line 365
    invoke-virtual {v1, v0}, Lod/B0;->q(Lod/G1;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_e
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lod/B0;

    .line 372
    .line 373
    iget-boolean v1, v0, Lod/B0;->z:Z

    .line 374
    .line 375
    if-nez v1, :cond_f

    .line 376
    .line 377
    iget-object v0, v0, Lod/B0;->u:Lod/t;

    .line 378
    .line 379
    invoke-interface {v0}, Lod/t;->h()V

    .line 380
    .line 381
    .line 382
    :cond_f
    return-void

    .line 383
    :pswitch_f
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Lod/f1;

    .line 386
    .line 387
    iget-object v0, v0, Lod/f1;->c:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, Lmd/e;

    .line 390
    .line 391
    invoke-virtual {v0}, Lmd/e;->o()V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_10
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lod/h1;

    .line 398
    .line 399
    iput-object v3, v0, Lod/h1;->k:Lba/a;

    .line 400
    .line 401
    iget-object v1, v0, Lod/h1;->h:Lod/l0;

    .line 402
    .line 403
    invoke-virtual {v1}, Lod/l0;->b()Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_10

    .line 408
    .line 409
    invoke-virtual {v0}, Lod/h1;->e()V

    .line 410
    .line 411
    .line 412
    :cond_10
    return-void

    .line 413
    :pswitch_11
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Lod/L0;

    .line 416
    .line 417
    iget-object v0, v0, Lod/L0;->i:Lod/o0;

    .line 418
    .line 419
    sget-object v1, Lod/M0;->h0:Lmd/k0;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    new-instance v2, Lod/i0;

    .line 425
    .line 426
    invoke-direct {v2, v0, v1, v5}, Lod/i0;-><init>(Lod/o0;Lmd/k0;I)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v0, Lod/o0;->k:Lmd/n0;

    .line 430
    .line 431
    invoke-virtual {v0, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_12
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lod/E0;

    .line 438
    .line 439
    iget-object v0, v0, Lod/E0;->b:Lod/M0;

    .line 440
    .line 441
    iget-object v1, v0, Lod/M0;->m:Lmd/n0;

    .line 442
    .line 443
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 444
    .line 445
    .line 446
    iget-boolean v1, v0, Lod/M0;->w:Z

    .line 447
    .line 448
    if-eqz v1, :cond_11

    .line 449
    .line 450
    iget-object v0, v0, Lod/M0;->v:Lod/L1;

    .line 451
    .line 452
    invoke-virtual {v0}, Lod/L1;->h()V

    .line 453
    .line 454
    .line 455
    :cond_11
    return-void

    .line 456
    :pswitch_13
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v0, Ld7/j;

    .line 459
    .line 460
    iget-object v0, v0, Ld7/j;->a:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v0, Lod/M0;

    .line 463
    .line 464
    invoke-virtual {v0}, Lod/M0;->s()V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :pswitch_14
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lod/A;

    .line 471
    .line 472
    iget-object v0, v0, Lod/A;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Lod/o0;

    .line 475
    .line 476
    iget-object v1, v0, Lod/o0;->r:Lod/U0;

    .line 477
    .line 478
    iput-object v3, v0, Lod/o0;->q:Lba/a;

    .line 479
    .line 480
    iput-object v3, v0, Lod/o0;->r:Lod/U0;

    .line 481
    .line 482
    sget-object v0, Lmd/k0;->n:Lmd/k0;

    .line 483
    .line 484
    const-string v2, "InternalSubchannel closed transport due to address change"

    .line 485
    .line 486
    invoke-virtual {v0, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-interface {v1, v0}, Lod/U0;->d(Lmd/k0;)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :pswitch_15
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, Lod/K;

    .line 497
    .line 498
    iget-object v0, v0, Lod/K;->b:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Lod/t;

    .line 501
    .line 502
    invoke-interface {v0}, Lod/t;->h()V

    .line 503
    .line 504
    .line 505
    return-void

    .line 506
    :pswitch_16
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Lod/E;

    .line 509
    .line 510
    iget-object v0, v0, Lod/E;->d:Lmd/e;

    .line 511
    .line 512
    invoke-virtual {v0}, Lmd/e;->m()V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :pswitch_17
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 517
    .line 518
    invoke-interface {v0}, Lo2/k;->p()V

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :pswitch_18
    iget-object v2, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v2, Ln1/d;

    .line 525
    .line 526
    iget-boolean v3, v2, Ln1/d;->o:Z

    .line 527
    .line 528
    if-nez v3, :cond_12

    .line 529
    .line 530
    goto/16 :goto_9

    .line 531
    .line 532
    :cond_12
    iget-boolean v3, v2, Ln1/d;->m:Z

    .line 533
    .line 534
    iget-object v4, v2, Ln1/d;->a:Ln1/a;

    .line 535
    .line 536
    if-eqz v3, :cond_13

    .line 537
    .line 538
    iput-boolean v5, v2, Ln1/d;->m:Z

    .line 539
    .line 540
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 541
    .line 542
    .line 543
    move-result-wide v6

    .line 544
    iput-wide v6, v4, Ln1/a;->e:J

    .line 545
    .line 546
    const-wide/16 v8, -0x1

    .line 547
    .line 548
    iput-wide v8, v4, Ln1/a;->g:J

    .line 549
    .line 550
    iput-wide v6, v4, Ln1/a;->f:J

    .line 551
    .line 552
    const/high16 v3, 0x3f000000    # 0.5f

    .line 553
    .line 554
    iput v3, v4, Ln1/a;->h:F

    .line 555
    .line 556
    :cond_13
    iget-wide v6, v4, Ln1/a;->g:J

    .line 557
    .line 558
    cmp-long v3, v6, v0

    .line 559
    .line 560
    if-lez v3, :cond_14

    .line 561
    .line 562
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 563
    .line 564
    .line 565
    move-result-wide v6

    .line 566
    iget-wide v8, v4, Ln1/a;->g:J

    .line 567
    .line 568
    iget v3, v4, Ln1/a;->i:I

    .line 569
    .line 570
    int-to-long v10, v3

    .line 571
    add-long/2addr v8, v10

    .line 572
    cmp-long v3, v6, v8

    .line 573
    .line 574
    if-lez v3, :cond_14

    .line 575
    .line 576
    goto :goto_8

    .line 577
    :cond_14
    invoke-virtual {v2}, Ln1/d;->e()Z

    .line 578
    .line 579
    .line 580
    move-result v3

    .line 581
    if-nez v3, :cond_15

    .line 582
    .line 583
    :goto_8
    iput-boolean v5, v2, Ln1/d;->o:Z

    .line 584
    .line 585
    goto :goto_9

    .line 586
    :cond_15
    iget-boolean v3, v2, Ln1/d;->n:Z

    .line 587
    .line 588
    iget-object v6, v2, Ln1/d;->c:Landroid/widget/ListView;

    .line 589
    .line 590
    if-eqz v3, :cond_16

    .line 591
    .line 592
    iput-boolean v5, v2, Ln1/d;->n:Z

    .line 593
    .line 594
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 595
    .line 596
    .line 597
    move-result-wide v7

    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v11, 0x3

    .line 601
    const/4 v12, 0x0

    .line 602
    move-wide v9, v7

    .line 603
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    invoke-virtual {v6, v3}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 608
    .line 609
    .line 610
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 611
    .line 612
    .line 613
    :cond_16
    iget-wide v7, v4, Ln1/a;->f:J

    .line 614
    .line 615
    cmp-long v0, v7, v0

    .line 616
    .line 617
    if-eqz v0, :cond_17

    .line 618
    .line 619
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 620
    .line 621
    .line 622
    move-result-wide v0

    .line 623
    invoke-virtual {v4, v0, v1}, Ln1/a;->a(J)F

    .line 624
    .line 625
    .line 626
    move-result v3

    .line 627
    const/high16 v5, -0x3f800000    # -4.0f

    .line 628
    .line 629
    mul-float/2addr v5, v3

    .line 630
    mul-float/2addr v5, v3

    .line 631
    const/high16 v7, 0x40800000    # 4.0f

    .line 632
    .line 633
    mul-float/2addr v3, v7

    .line 634
    add-float/2addr v3, v5

    .line 635
    iget-wide v7, v4, Ln1/a;->f:J

    .line 636
    .line 637
    sub-long v7, v0, v7

    .line 638
    .line 639
    iput-wide v0, v4, Ln1/a;->f:J

    .line 640
    .line 641
    long-to-float v0, v7

    .line 642
    mul-float/2addr v0, v3

    .line 643
    iget v1, v4, Ln1/a;->d:F

    .line 644
    .line 645
    mul-float/2addr v0, v1

    .line 646
    float-to-int v0, v0

    .line 647
    iget-object v1, v2, Ln1/d;->q:Lq/t0;

    .line 648
    .line 649
    invoke-virtual {v1, v0}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 650
    .line 651
    .line 652
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 653
    .line 654
    invoke-virtual {v6, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 655
    .line 656
    .line 657
    :goto_9
    return-void

    .line 658
    :cond_17
    new-instance v0, Ljava/lang/RuntimeException;

    .line 659
    .line 660
    const-string v1, "Cannot compute scroll delta before calling start()"

    .line 661
    .line 662
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    throw v0

    .line 666
    :pswitch_19
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, Ll/e;

    .line 669
    .line 670
    invoke-virtual {v0, v4}, Ll/e;->a(Z)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_1a
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v0, Lk3/h;

    .line 680
    .line 681
    iget-object v0, v0, Lk3/h;->a:Lk3/m;

    .line 682
    .line 683
    iget-object v0, v0, Lk3/m;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    const-string v0, "readWriteLock.readLock()"

    .line 690
    .line 691
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 695
    .line 696
    .line 697
    :try_start_5
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v0, Lk3/h;

    .line 700
    .line 701
    invoke-virtual {v0}, Lk3/h;->a()Z

    .line 702
    .line 703
    .line 704
    move-result v0
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 705
    if-nez v0, :cond_18

    .line 706
    .line 707
    :goto_a
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 708
    .line 709
    .line 710
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v0, Lk3/h;

    .line 713
    .line 714
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    goto/16 :goto_11

    .line 718
    .line 719
    :cond_18
    :try_start_6
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v0, Lk3/h;

    .line 722
    .line 723
    iget-object v0, v0, Lk3/h;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 724
    .line 725
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    if-nez v0, :cond_19

    .line 730
    .line 731
    goto :goto_a

    .line 732
    :cond_19
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v0, Lk3/h;

    .line 735
    .line 736
    iget-object v0, v0, Lk3/h;->a:Lk3/m;

    .line 737
    .line 738
    invoke-virtual {v0}, Lk3/m;->g()Lo3/d;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-interface {v0}, Lo3/d;->I()Lo3/a;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-interface {v0}, Lo3/a;->O()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_1a

    .line 751
    .line 752
    goto :goto_a

    .line 753
    :cond_1a
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v0, Lk3/h;

    .line 756
    .line 757
    iget-object v0, v0, Lk3/h;->a:Lk3/m;

    .line 758
    .line 759
    invoke-virtual {v0}, Lk3/m;->g()Lo3/d;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-interface {v0}, Lo3/d;->I()Lo3/a;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    invoke-interface {v2}, Lo3/a;->n()V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 768
    .line 769
    .line 770
    :try_start_7
    invoke-virtual {p0}, Lg5/d;->a()Lgf/h;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-interface {v2}, Lo3/a;->k()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 775
    .line 776
    .line 777
    :try_start_8
    invoke-interface {v2}, Lo3/a;->p()V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 778
    .line 779
    .line 780
    :goto_b
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 781
    .line 782
    .line 783
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v1, Lk3/h;

    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    goto :goto_e

    .line 791
    :catchall_0
    move-exception v0

    .line 792
    goto :goto_12

    .line 793
    :catch_5
    move-exception v0

    .line 794
    goto :goto_c

    .line 795
    :catch_6
    move-exception v0

    .line 796
    goto :goto_d

    .line 797
    :catchall_1
    move-exception v0

    .line 798
    :try_start_9
    invoke-interface {v2}, Lo3/a;->p()V

    .line 799
    .line 800
    .line 801
    throw v0
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 802
    :goto_c
    :try_start_a
    const-string v2, "ROOM"

    .line 803
    .line 804
    const-string v3, "Cannot run invalidation tracker. Is the db closed?"

    .line 805
    .line 806
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 807
    .line 808
    .line 809
    sget-object v0, Lff/x;->a:Lff/x;

    .line 810
    .line 811
    goto :goto_b

    .line 812
    :goto_d
    const-string v2, "ROOM"

    .line 813
    .line 814
    const-string v3, "Cannot run invalidation tracker. Is the db closed?"

    .line 815
    .line 816
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 817
    .line 818
    .line 819
    sget-object v0, Lff/x;->a:Lff/x;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 820
    .line 821
    goto :goto_b

    .line 822
    :goto_e
    move-object v1, v0

    .line 823
    check-cast v1, Ljava/util/Collection;

    .line 824
    .line 825
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    if-nez v1, :cond_1c

    .line 830
    .line 831
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 832
    .line 833
    check-cast v1, Lk3/h;

    .line 834
    .line 835
    iget-object v2, v1, Lk3/h;->i:Ls/f;

    .line 836
    .line 837
    monitor-enter v2

    .line 838
    :try_start_b
    iget-object v1, v1, Lk3/h;->i:Ls/f;

    .line 839
    .line 840
    invoke-virtual {v1}, Ls/f;->iterator()Ljava/util/Iterator;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    :goto_f
    move-object v3, v1

    .line 845
    check-cast v3, Ls/b;

    .line 846
    .line 847
    invoke-virtual {v3}, Ls/b;->hasNext()Z

    .line 848
    .line 849
    .line 850
    move-result v4

    .line 851
    if-eqz v4, :cond_1b

    .line 852
    .line 853
    invoke-virtual {v3}, Ls/b;->next()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    check-cast v3, Ljava/util/Map$Entry;

    .line 858
    .line 859
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    check-cast v3, Lk3/g;

    .line 864
    .line 865
    invoke-virtual {v3, v0}, Lk3/g;->a(Ljava/util/Set;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 866
    .line 867
    .line 868
    goto :goto_f

    .line 869
    :catchall_2
    move-exception v0

    .line 870
    goto :goto_10

    .line 871
    :cond_1b
    monitor-exit v2

    .line 872
    goto :goto_11

    .line 873
    :goto_10
    monitor-exit v2

    .line 874
    throw v0

    .line 875
    :cond_1c
    :goto_11
    return-void

    .line 876
    :goto_12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 877
    .line 878
    .line 879
    iget-object v1, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v1, Lk3/h;

    .line 882
    .line 883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    throw v0

    .line 887
    :pswitch_1b
    iget-object v0, p0, Lg5/d;->b:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v0, LWa/h;

    .line 890
    .line 891
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 892
    .line 893
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
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
