.class public final synthetic Lcom/applovin/impl/sdk/nativeAd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/applovin/impl/sdk/nativeAd/e;->a:I

    iput-object p2, p0, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg2/y;[BLl8/e0;)V
    .locals 0

    .line 2
    const/16 p3, 0x13

    iput p3, p0, Lcom/applovin/impl/sdk/nativeAd/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL8/a;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljb/g;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 11
    .line 12
    iget-object v3, v0, LL8/a;->d:Ljava/io/Serializable;

    .line 13
    .line 14
    check-cast v3, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v0, LL8/a;->e:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v3, Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, LL8/a;->d:Ljava/io/Serializable;

    .line 27
    .line 28
    check-cast v3, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v3, v1, Ljb/g;->f:Ljb/f;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    iget-object v3, v3, Ljb/f;->a:La2/c;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    iget-object v3, v3, La2/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Ljb/e;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljb/e;->j()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    iget-object v3, v1, Ljb/g;->f:Ljb/f;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3}, Ljb/f;->a()Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v3, v4

    .line 63
    :goto_0
    if-eqz v3, :cond_3

    .line 64
    .line 65
    iget-object v3, v0, LL8/a;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/util/HashMap;

    .line 68
    .line 69
    iget-object v5, v1, Ljb/g;->f:Ljb/f;

    .line 70
    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    invoke-virtual {v5}, Ljb/f;->a()Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    invoke-virtual {v0, v1}, LL8/a;->g(Ljb/g;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljb/g;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, LL8/a;->g(Ljb/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception v1

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    monitor-exit v0

    .line 106
    return-void

    .line 107
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v7, " "

    .line 4
    .line 5
    const/16 v8, 0x191

    .line 6
    .line 7
    const/16 v9, 0xc8

    .line 8
    .line 9
    const-string v10, ""

    .line 10
    .line 11
    const-string v11, "CSeq"

    .line 12
    .line 13
    const/16 v12, 0xa

    .line 14
    .line 15
    const/4 v13, 0x2

    .line 16
    const/4 v14, 0x0

    .line 17
    const/4 v15, 0x0

    .line 18
    const/4 v0, 0x1

    .line 19
    iget v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->a:I

    .line 20
    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lm9/M;

    .line 27
    .line 28
    iget-object v0, v0, Lm9/M;->b:LVc/c;

    .line 29
    .line 30
    iget-object v0, v0, LVc/c;->b:Luc/h;

    .line 31
    .line 32
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lm9/O;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Luc/h;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v2, v0

    .line 43
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 44
    .line 45
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object v3, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Landroid/content/Context;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v3, v4, v0}, Lr9/K;->d0(Landroid/content/Context;Ls9/f;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v14}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Lm9/G; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    return-void

    .line 70
    :pswitch_1
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 71
    .line 72
    const/16 v3, 0x16

    .line 73
    .line 74
    invoke-direct {v2, v3}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lkd/t;

    .line 80
    .line 81
    iget-object v4, v3, Lkd/t;->b:Lkd/i;

    .line 82
    .line 83
    iget-object v5, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/lang/String;

    .line 86
    .line 87
    const-string v6, "messageArg"

    .line 88
    .line 89
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v4, v4, Lkd/i;->a:LC8/i;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, LC8/i;->q()Luc/n;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    new-instance v7, LVa/X7;

    .line 102
    .line 103
    const-string v8, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage"

    .line 104
    .line 105
    iget-object v4, v4, LC8/i;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, Luc/f;

    .line 108
    .line 109
    invoke-direct {v7, v4, v6, v14, v8}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-array v4, v13, [Ljava/lang/Object;

    .line 113
    .line 114
    aput-object v3, v4, v15

    .line 115
    .line 116
    aput-object v5, v4, v0

    .line 117
    .line 118
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v3, Lk2/c;

    .line 123
    .line 124
    const/16 v4, 0x13

    .line 125
    .line 126
    invoke-direct {v3, v2, v4}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v0, v3}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_2
    const-string v0, "$command"

    .line 134
    .line 135
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, Ljava/lang/Runnable;

    .line 138
    .line 139
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v0, "this$0"

    .line 143
    .line 144
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, LT3/m;

    .line 147
    .line 148
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :try_start_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3}, LT3/m;->e()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    invoke-virtual {v3}, LT3/m;->e()V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :pswitch_3
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lk2/X;

    .line 166
    .line 167
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Ls2/w;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Lk2/X;->B(Ls2/w;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_4
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, LQ1/c;

    .line 178
    .line 179
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-interface {v0, v2}, LQ1/c;->accept(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_5
    invoke-direct {v1}, Lcom/applovin/impl/sdk/nativeAd/e;->a()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_6
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Ljb/g;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Ljb/f;

    .line 199
    .line 200
    iget-object v3, v2, Ljb/f;->b:Ljava/lang/Runnable;

    .line 201
    .line 202
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 203
    .line 204
    .line 205
    iput-object v2, v0, Ljb/g;->f:Ljb/f;

    .line 206
    .line 207
    iget-object v0, v0, Ljb/g;->e:Lcom/applovin/impl/sdk/nativeAd/e;

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/nativeAd/e;->run()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_7
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Ljava/lang/Runnable;

    .line 216
    .line 217
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v2, LT3/m;

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    :try_start_2
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, LT3/m;->e()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    invoke-virtual {v2}, LT3/m;->e()V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :pswitch_8
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Landroidx/profileinstaller/ProfileInstallerInitializer;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 244
    .line 245
    const/16 v3, 0x1c

    .line 246
    .line 247
    if-lt v2, v3, :cond_0

    .line 248
    .line 249
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-static {v2}, Li3/f;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    goto :goto_1

    .line 258
    :cond_0
    new-instance v2, Landroid/os/Handler;

    .line 259
    .line 260
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 265
    .line 266
    .line 267
    :goto_1
    new-instance v3, Ljava/util/Random;

    .line 268
    .line 269
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 270
    .line 271
    .line 272
    const/16 v4, 0x3e8

    .line 273
    .line 274
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    new-instance v3, Li3/c;

    .line 283
    .line 284
    iget-object v4, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v4, Landroid/content/Context;

    .line 287
    .line 288
    invoke-direct {v3, v4, v15}, Li3/c;-><init>(Landroid/content/Context;I)V

    .line 289
    .line 290
    .line 291
    add-int/lit16 v0, v0, 0x1388

    .line 292
    .line 293
    int-to-long v4, v0

    .line 294
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_9
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Lg2/y;

    .line 301
    .line 302
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v2, [B

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    :try_start_3
    iget-object v3, v0, Lg2/y;->a:Ljava/io/OutputStream;

    .line 310
    .line 311
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :catch_1
    iget-object v2, v0, Lg2/y;->d:Lg2/z;

    .line 316
    .line 317
    iget-boolean v2, v2, Lg2/z;->f:Z

    .line 318
    .line 319
    if-nez v2, :cond_1

    .line 320
    .line 321
    iget-object v0, v0, Lg2/y;->d:Lg2/z;

    .line 322
    .line 323
    iget-object v0, v0, Lg2/z;->a:LY2/B;

    .line 324
    .line 325
    :cond_1
    :goto_2
    return-void

    .line 326
    :pswitch_a
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v2, LY2/B;

    .line 329
    .line 330
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v3, Ll8/K;

    .line 333
    .line 334
    iget-object v13, v2, LY2/B;->c:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v13, Lg2/n;

    .line 337
    .line 338
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    sget-object v17, Lg2/A;->a:Ljava/util/regex/Pattern;

    .line 342
    .line 343
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v17

    .line 347
    move-object/from16 v14, v17

    .line 348
    .line 349
    check-cast v14, Ljava/lang/CharSequence;

    .line 350
    .line 351
    sget-object v4, Lg2/A;->b:Ljava/util/regex/Pattern;

    .line 352
    .line 353
    invoke-virtual {v4, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 358
    .line 359
    .line 360
    move-result v14

    .line 361
    iget-object v5, v13, Lg2/n;->g:LE4/n;

    .line 362
    .line 363
    if-eqz v14, :cond_1a

    .line 364
    .line 365
    invoke-interface {v3, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v14

    .line 369
    check-cast v14, Ljava/lang/CharSequence;

    .line 370
    .line 371
    invoke-virtual {v4, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    invoke-static {v14}, LQ1/k;->c(Z)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    invoke-interface {v3, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    if-lez v10, :cond_2

    .line 398
    .line 399
    move v14, v0

    .line 400
    goto :goto_3

    .line 401
    :cond_2
    move v14, v15

    .line 402
    :goto_3
    invoke-static {v14}, LQ1/k;->c(Z)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v3, v0, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object v14

    .line 409
    move/from16 v18, v0

    .line 410
    .line 411
    new-instance v0, La2/c;

    .line 412
    .line 413
    invoke-direct {v0, v12}, La2/c;-><init>(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v14}, La2/c;->F(Ljava/util/List;)V

    .line 417
    .line 418
    .line 419
    new-instance v14, Lg2/o;

    .line 420
    .line 421
    invoke-direct {v14, v0}, Lg2/o;-><init>(La2/c;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, LB8/e;

    .line 425
    .line 426
    sget-object v12, Lg2/A;->h:Ljava/lang/String;

    .line 427
    .line 428
    invoke-direct {v0, v12}, LB8/e;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    add-int/lit8 v10, v10, 0x1

    .line 432
    .line 433
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    invoke-interface {v3, v10, v12}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-virtual {v0, v3}, LB8/e;->e(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v14, v11}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    iget-object v10, v13, Lg2/n;->f:Landroid/util/SparseArray;

    .line 457
    .line 458
    invoke-virtual {v10, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    check-cast v11, Lg2/B;

    .line 463
    .line 464
    if-nez v11, :cond_3

    .line 465
    .line 466
    goto/16 :goto_13

    .line 467
    .line 468
    :cond_3
    invoke-virtual {v10, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 469
    .line 470
    .line 471
    iget-object v3, v13, Lg2/n;->a:Lac/a;

    .line 472
    .line 473
    const-string v10, "application/sdp"

    .line 474
    .line 475
    const-string v12, "Accept"

    .line 476
    .line 477
    const-string v15, "Transport"

    .line 478
    .line 479
    iget v6, v11, Lg2/B;->b:I

    .line 480
    .line 481
    if-eq v4, v9, :cond_e

    .line 482
    .line 483
    if-eq v4, v8, :cond_9

    .line 484
    .line 485
    const/16 v0, 0x1cd

    .line 486
    .line 487
    if-eq v4, v0, :cond_7

    .line 488
    .line 489
    const/16 v0, 0x12d

    .line 490
    .line 491
    if-eq v4, v0, :cond_4

    .line 492
    .line 493
    const/16 v0, 0x12e

    .line 494
    .line 495
    if-eq v4, v0, :cond_4

    .line 496
    .line 497
    :try_start_4
    new-instance v0, Lio/ktor/utils/io/T;

    .line 498
    .line 499
    new-instance v2, Ljava/lang/StringBuilder;

    .line 500
    .line 501
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 502
    .line 503
    .line 504
    invoke-static {v6}, Lg2/A;->h(I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-static {v13, v0}, Lg2/n;->a(Lg2/n;Lio/ktor/utils/io/T;)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_13

    .line 528
    .line 529
    :catch_2
    move-exception v0

    .line 530
    goto/16 :goto_e

    .line 531
    .line 532
    :catch_3
    move-exception v0

    .line 533
    goto/16 :goto_e

    .line 534
    .line 535
    :cond_4
    iget v0, v13, Lg2/n;->o:I

    .line 536
    .line 537
    const/4 v2, -0x1

    .line 538
    if-eq v0, v2, :cond_5

    .line 539
    .line 540
    const/4 v2, 0x0

    .line 541
    iput v2, v13, Lg2/n;->o:I

    .line 542
    .line 543
    :cond_5
    const-string v0, "Location"

    .line 544
    .line 545
    invoke-virtual {v14, v0}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    if-nez v0, :cond_6

    .line 550
    .line 551
    const-string v0, "Redirection without new location."

    .line 552
    .line 553
    const/4 v2, 0x0

    .line 554
    invoke-virtual {v3, v0, v2}, Lac/a;->N(Ljava/lang/String;Ljava/io/IOException;)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_13

    .line 558
    .line 559
    :cond_6
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-static {v0}, Lg2/A;->f(Landroid/net/Uri;)Landroid/net/Uri;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    iput-object v2, v13, Lg2/n;->h:Landroid/net/Uri;

    .line 568
    .line 569
    invoke-static {v0}, Lg2/A;->d(Landroid/net/Uri;)LY1/t;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    iput-object v0, v13, Lg2/n;->j:LY1/t;

    .line 574
    .line 575
    iget-object v0, v13, Lg2/n;->h:Landroid/net/Uri;

    .line 576
    .line 577
    iget-object v2, v13, Lg2/n;->k:Ljava/lang/String;

    .line 578
    .line 579
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    const/4 v3, 0x2

    .line 583
    new-array v4, v3, [Ljava/lang/Object;

    .line 584
    .line 585
    const/16 v19, 0x0

    .line 586
    .line 587
    aput-object v12, v4, v19

    .line 588
    .line 589
    aput-object v10, v4, v18

    .line 590
    .line 591
    move/from16 v6, v18

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    invoke-static {v6, v4, v7}, Ll8/j0;->c(I[Ljava/lang/Object;LE4/n;)Ll8/j0;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    invoke-virtual {v5, v3, v2, v4, v0}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v5, v0}, LE4/n;->y(Lg2/B;)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_13

    .line 606
    .line 607
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 608
    .line 609
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-static {v6}, Lg2/A;->h(I)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    iget-object v2, v11, Lg2/B;->c:Lg2/o;

    .line 630
    .line 631
    invoke-virtual {v2, v15}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    const/16 v3, 0xa

    .line 639
    .line 640
    if-ne v6, v3, :cond_8

    .line 641
    .line 642
    const-string v3, "TCP"

    .line 643
    .line 644
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    if-nez v2, :cond_8

    .line 649
    .line 650
    new-instance v2, Lg2/u;

    .line 651
    .line 652
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    goto :goto_4

    .line 656
    :cond_8
    new-instance v2, Lio/ktor/utils/io/T;

    .line 657
    .line 658
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    :goto_4
    invoke-static {v13, v2}, Lg2/n;->a(Lg2/n;Lio/ktor/utils/io/T;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_13

    .line 665
    .line 666
    :cond_9
    iget-object v0, v13, Lg2/n;->j:LY1/t;

    .line 667
    .line 668
    if-eqz v0, :cond_d

    .line 669
    .line 670
    iget-boolean v0, v13, Lg2/n;->q:Z

    .line 671
    .line 672
    if-nez v0, :cond_d

    .line 673
    .line 674
    const-string v0, "WWW-Authenticate"

    .line 675
    .line 676
    invoke-static {v0}, Lg2/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    iget-object v2, v14, Lg2/o;->a:Ll8/L;

    .line 681
    .line 682
    invoke-virtual {v2, v0}, Ll8/L;->d(Ljava/lang/String;)Ll8/K;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-nez v2, :cond_c

    .line 691
    .line 692
    const/4 v15, 0x0

    .line 693
    :goto_5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-ge v15, v2, :cond_b

    .line 698
    .line 699
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    check-cast v2, Ljava/lang/String;

    .line 704
    .line 705
    invoke-static {v2}, Lg2/A;->e(Ljava/lang/String;)LVa/m8;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    iput-object v2, v13, Lg2/n;->n:LVa/m8;

    .line 710
    .line 711
    iget v2, v2, LVa/m8;->b:I

    .line 712
    .line 713
    const/4 v3, 0x2

    .line 714
    if-ne v2, v3, :cond_a

    .line 715
    .line 716
    goto :goto_6

    .line 717
    :cond_a
    const/16 v18, 0x1

    .line 718
    .line 719
    add-int/lit8 v15, v15, 0x1

    .line 720
    .line 721
    goto :goto_5

    .line 722
    :cond_b
    :goto_6
    invoke-virtual {v5}, LE4/n;->w()V

    .line 723
    .line 724
    .line 725
    const/4 v6, 0x1

    .line 726
    iput-boolean v6, v13, Lg2/n;->q:Z

    .line 727
    .line 728
    goto/16 :goto_13

    .line 729
    .line 730
    :cond_c
    const-string v0, "Missing WWW-Authenticate header in a 401 response."

    .line 731
    .line 732
    const/4 v2, 0x0

    .line 733
    invoke-static {v0, v2}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    throw v0

    .line 738
    :cond_d
    new-instance v0, Lio/ktor/utils/io/T;

    .line 739
    .line 740
    new-instance v2, Ljava/lang/StringBuilder;

    .line 741
    .line 742
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 743
    .line 744
    .line 745
    invoke-static {v6}, Lg2/A;->h(I)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    invoke-static {v13, v0}, Lg2/n;->a(Lg2/n;Lio/ktor/utils/io/T;)V

    .line 766
    .line 767
    .line 768
    goto/16 :goto_13

    .line 769
    .line 770
    :cond_e
    packed-switch v6, :pswitch_data_1

    .line 771
    .line 772
    .line 773
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 774
    .line 775
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 776
    .line 777
    .line 778
    throw v0

    .line 779
    :pswitch_b
    const-string v0, "Session"

    .line 780
    .line 781
    invoke-virtual {v14, v0}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-virtual {v14, v15}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    if-eqz v0, :cond_10

    .line 790
    .line 791
    if-eqz v2, :cond_10

    .line 792
    .line 793
    invoke-static {v0}, Lg2/A;->c(Ljava/lang/String;)LA2/d;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    iget v2, v13, Lg2/n;->o:I

    .line 798
    .line 799
    const/4 v3, -0x1

    .line 800
    if-eq v2, v3, :cond_f

    .line 801
    .line 802
    const/4 v15, 0x1

    .line 803
    goto :goto_7

    .line 804
    :cond_f
    const/4 v15, 0x0

    .line 805
    :goto_7
    invoke-static {v15}, LQ1/k;->g(Z)V

    .line 806
    .line 807
    .line 808
    const/4 v6, 0x1

    .line 809
    iput v6, v13, Lg2/n;->o:I

    .line 810
    .line 811
    iget-object v2, v0, LA2/d;->c:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v2, Ljava/lang/String;

    .line 814
    .line 815
    iput-object v2, v13, Lg2/n;->k:Ljava/lang/String;

    .line 816
    .line 817
    iget-wide v2, v0, LA2/d;->b:J

    .line 818
    .line 819
    iput-wide v2, v13, Lg2/n;->l:J

    .line 820
    .line 821
    invoke-virtual {v13}, Lg2/n;->b()V

    .line 822
    .line 823
    .line 824
    goto/16 :goto_13

    .line 825
    .line 826
    :cond_10
    const-string v0, "Missing mandatory session or transport header"

    .line 827
    .line 828
    const/4 v2, 0x0

    .line 829
    invoke-static {v0, v2}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    throw v0

    .line 834
    :pswitch_c
    const-string v0, "Range"

    .line 835
    .line 836
    invoke-virtual {v14, v0}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    if-nez v0, :cond_11

    .line 841
    .line 842
    sget-object v0, Lg2/C;->c:Lg2/C;

    .line 843
    .line 844
    goto :goto_8

    .line 845
    :cond_11
    invoke-static {v0}, Lg2/C;->a(Ljava/lang/String;)Lg2/C;

    .line 846
    .line 847
    .line 848
    move-result-object v0
    :try_end_4
    .catch LN1/D; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    .line 849
    :goto_8
    :try_start_5
    const-string v2, "RTP-Info"

    .line 850
    .line 851
    invoke-virtual {v14, v2}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    if-nez v2, :cond_12

    .line 856
    .line 857
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 858
    .line 859
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 860
    .line 861
    goto :goto_9

    .line 862
    :cond_12
    iget-object v3, v13, Lg2/n;->h:Landroid/net/Uri;

    .line 863
    .line 864
    invoke-static {v3, v2}, Lg2/D;->a(Landroid/net/Uri;Ljava/lang/String;)Ll8/e0;

    .line 865
    .line 866
    .line 867
    move-result-object v2
    :try_end_5
    .catch LN1/D; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_2

    .line 868
    goto :goto_9

    .line 869
    :catch_4
    :try_start_6
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 870
    .line 871
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 872
    .line 873
    :goto_9
    invoke-static {v2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    iget v3, v13, Lg2/n;->o:I

    .line 878
    .line 879
    const/4 v6, 0x1

    .line 880
    const/4 v4, 0x2

    .line 881
    if-eq v3, v6, :cond_14

    .line 882
    .line 883
    if-ne v3, v4, :cond_13

    .line 884
    .line 885
    goto :goto_a

    .line 886
    :cond_13
    const/4 v15, 0x0

    .line 887
    goto :goto_b

    .line 888
    :cond_14
    :goto_a
    const/4 v15, 0x1

    .line 889
    :goto_b
    invoke-static {v15}, LQ1/k;->g(Z)V

    .line 890
    .line 891
    .line 892
    iput v4, v13, Lg2/n;->o:I

    .line 893
    .line 894
    iget-object v3, v13, Lg2/n;->m:Lg2/m;

    .line 895
    .line 896
    if-nez v3, :cond_16

    .line 897
    .line 898
    new-instance v3, Lg2/m;

    .line 899
    .line 900
    iget-wide v4, v13, Lg2/n;->l:J

    .line 901
    .line 902
    const-wide/16 v6, 0x2

    .line 903
    .line 904
    div-long/2addr v4, v6

    .line 905
    invoke-direct {v3, v13, v4, v5}, Lg2/m;-><init>(Lg2/n;J)V

    .line 906
    .line 907
    .line 908
    iput-object v3, v13, Lg2/n;->m:Lg2/m;

    .line 909
    .line 910
    iget-boolean v6, v3, Lg2/m;->c:Z

    .line 911
    .line 912
    if-eqz v6, :cond_15

    .line 913
    .line 914
    goto :goto_c

    .line 915
    :cond_15
    const/4 v6, 0x1

    .line 916
    iput-boolean v6, v3, Lg2/m;->c:Z

    .line 917
    .line 918
    iget-object v6, v3, Lg2/m;->a:Landroid/os/Handler;

    .line 919
    .line 920
    invoke-virtual {v6, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 921
    .line 922
    .line 923
    :cond_16
    :goto_c
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    iput-wide v3, v13, Lg2/n;->s:J

    .line 929
    .line 930
    iget-object v3, v13, Lg2/n;->b:Lac/a;

    .line 931
    .line 932
    iget-wide v4, v0, Lg2/C;->a:J

    .line 933
    .line 934
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 935
    .line 936
    .line 937
    move-result-wide v4

    .line 938
    invoke-virtual {v3, v4, v5, v2}, Lac/a;->M(JLl8/K;)V

    .line 939
    .line 940
    .line 941
    goto/16 :goto_13

    .line 942
    .line 943
    :pswitch_d
    invoke-virtual {v2}, LY2/B;->x()V

    .line 944
    .line 945
    .line 946
    goto/16 :goto_13

    .line 947
    .line 948
    :pswitch_e
    const-string v0, "Public"

    .line 949
    .line 950
    invoke-virtual {v14, v0}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-static {v0}, Lg2/A;->b(Ljava/lang/String;)Ll8/e0;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-static {v0}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    iget-object v2, v13, Lg2/n;->m:Lg2/m;

    .line 963
    .line 964
    if-eqz v2, :cond_17

    .line 965
    .line 966
    goto/16 :goto_13

    .line 967
    .line 968
    :cond_17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    if-nez v2, :cond_19

    .line 973
    .line 974
    const/16 v16, 0x2

    .line 975
    .line 976
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-eqz v0, :cond_18

    .line 985
    .line 986
    goto :goto_d

    .line 987
    :cond_18
    const-string v0, "DESCRIBE not supported."

    .line 988
    .line 989
    const/4 v2, 0x0

    .line 990
    invoke-virtual {v3, v0, v2}, Lac/a;->N(Ljava/lang/String;Ljava/io/IOException;)V

    .line 991
    .line 992
    .line 993
    goto/16 :goto_13

    .line 994
    .line 995
    :cond_19
    :goto_d
    iget-object v0, v13, Lg2/n;->h:Landroid/net/Uri;

    .line 996
    .line 997
    iget-object v2, v13, Lg2/n;->k:Ljava/lang/String;

    .line 998
    .line 999
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    const/4 v3, 0x2

    .line 1003
    new-array v4, v3, [Ljava/lang/Object;

    .line 1004
    .line 1005
    const/16 v19, 0x0

    .line 1006
    .line 1007
    aput-object v12, v4, v19

    .line 1008
    .line 1009
    const/4 v6, 0x1

    .line 1010
    aput-object v10, v4, v6

    .line 1011
    .line 1012
    const/4 v7, 0x0

    .line 1013
    invoke-static {v6, v4, v7}, Ll8/j0;->c(I[Ljava/lang/Object;LE4/n;)Ll8/j0;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    invoke-virtual {v5, v3, v2, v4, v0}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    invoke-virtual {v5, v0}, LE4/n;->y(Lg2/B;)V

    .line 1022
    .line 1023
    .line 1024
    goto/16 :goto_13

    .line 1025
    .line 1026
    :pswitch_f
    new-instance v3, LX2/j;

    .line 1027
    .line 1028
    invoke-static {v0}, Lg2/G;->a(Ljava/lang/String;)Lg2/F;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    const/16 v4, 0x10

    .line 1033
    .line 1034
    invoke-direct {v3, v4, v14, v0}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v2, v3}, LY2/B;->v(LX2/j;)V
    :try_end_6
    .catch LN1/D; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_2

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_13

    .line 1041
    .line 1042
    :goto_e
    new-instance v2, Lio/ktor/utils/io/T;

    .line 1043
    .line 1044
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-static {v13, v2}, Lg2/n;->a(Lg2/n;Lio/ktor/utils/io/T;)V

    .line 1048
    .line 1049
    .line 1050
    goto/16 :goto_13

    .line 1051
    .line 1052
    :cond_1a
    move v2, v15

    .line 1053
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    check-cast v0, Ljava/lang/CharSequence;

    .line 1058
    .line 1059
    sget-object v2, Lg2/A;->a:Ljava/util/regex/Pattern;

    .line 1060
    .line 1061
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 1066
    .line 1067
    .line 1068
    move-result v2

    .line 1069
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 1070
    .line 1071
    .line 1072
    const/4 v6, 0x1

    .line 1073
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v2}, Lg2/A;->a(Ljava/lang/String;)I

    .line 1081
    .line 1082
    .line 1083
    const/4 v4, 0x2

    .line 1084
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1092
    .line 1093
    .line 1094
    invoke-interface {v3, v10}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-lez v0, :cond_1b

    .line 1099
    .line 1100
    const/4 v2, 0x1

    .line 1101
    goto :goto_f

    .line 1102
    :cond_1b
    const/4 v2, 0x0

    .line 1103
    :goto_f
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 1104
    .line 1105
    .line 1106
    const/4 v6, 0x1

    .line 1107
    invoke-interface {v3, v6, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    new-instance v4, La2/c;

    .line 1112
    .line 1113
    const/16 v6, 0xa

    .line 1114
    .line 1115
    invoke-direct {v4, v6}, La2/c;-><init>(I)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v4, v2}, La2/c;->F(Ljava/util/List;)V

    .line 1119
    .line 1120
    .line 1121
    new-instance v2, Lg2/o;

    .line 1122
    .line 1123
    invoke-direct {v2, v4}, Lg2/o;-><init>(La2/c;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v4, LB8/e;

    .line 1127
    .line 1128
    sget-object v6, Lg2/A;->h:Ljava/lang/String;

    .line 1129
    .line 1130
    invoke-direct {v4, v6}, LB8/e;-><init>(Ljava/lang/String;)V

    .line 1131
    .line 1132
    .line 1133
    const/16 v18, 0x1

    .line 1134
    .line 1135
    add-int/lit8 v0, v0, 0x1

    .line 1136
    .line 1137
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1138
    .line 1139
    .line 1140
    move-result v6

    .line 1141
    invoke-interface {v3, v0, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-virtual {v4, v0}, LB8/e;->e(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v2, v11}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1156
    .line 1157
    .line 1158
    move-result v0

    .line 1159
    new-instance v2, LE4/n;

    .line 1160
    .line 1161
    new-instance v3, La2/c;

    .line 1162
    .line 1163
    iget-object v4, v5, LE4/n;->d:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast v4, Lg2/n;

    .line 1166
    .line 1167
    iget-object v6, v4, Lg2/n;->c:Ljava/lang/String;

    .line 1168
    .line 1169
    iget-object v12, v4, Lg2/n;->k:Ljava/lang/String;

    .line 1170
    .line 1171
    invoke-direct {v3, v0, v6, v12}, La2/c;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    new-instance v6, Lg2/o;

    .line 1175
    .line 1176
    invoke-direct {v6, v3}, Lg2/o;-><init>(La2/c;)V

    .line 1177
    .line 1178
    .line 1179
    const/16 v3, 0x195

    .line 1180
    .line 1181
    invoke-direct {v2, v3, v6, v10}, LE4/n;-><init>(ILg2/o;Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    iget-object v3, v2, LE4/n;->c:Ljava/lang/Object;

    .line 1185
    .line 1186
    check-cast v3, Lg2/o;

    .line 1187
    .line 1188
    invoke-virtual {v3, v11}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v6

    .line 1192
    if-eqz v6, :cond_1c

    .line 1193
    .line 1194
    const/4 v6, 0x1

    .line 1195
    goto :goto_10

    .line 1196
    :cond_1c
    const/4 v6, 0x0

    .line 1197
    :goto_10
    invoke-static {v6}, LQ1/k;->c(Z)V

    .line 1198
    .line 1199
    .line 1200
    new-instance v6, Ll8/H;

    .line 1201
    .line 1202
    const/4 v11, 0x4

    .line 1203
    invoke-direct {v6, v11}, Ll8/E;-><init>(I)V

    .line 1204
    .line 1205
    .line 1206
    iget v11, v2, LE4/n;->b:I

    .line 1207
    .line 1208
    if-eq v11, v9, :cond_26

    .line 1209
    .line 1210
    const/16 v9, 0x1cd

    .line 1211
    .line 1212
    if-eq v11, v9, :cond_25

    .line 1213
    .line 1214
    const/16 v9, 0x1f4

    .line 1215
    .line 1216
    if-eq v11, v9, :cond_24

    .line 1217
    .line 1218
    const/16 v9, 0x1f9

    .line 1219
    .line 1220
    if-eq v11, v9, :cond_23

    .line 1221
    .line 1222
    const/16 v9, 0x12d

    .line 1223
    .line 1224
    if-eq v11, v9, :cond_22

    .line 1225
    .line 1226
    const/16 v9, 0x12e

    .line 1227
    .line 1228
    if-eq v11, v9, :cond_21

    .line 1229
    .line 1230
    const/16 v9, 0x190

    .line 1231
    .line 1232
    if-eq v11, v9, :cond_20

    .line 1233
    .line 1234
    if-eq v11, v8, :cond_1f

    .line 1235
    .line 1236
    const/16 v8, 0x194

    .line 1237
    .line 1238
    if-eq v11, v8, :cond_1e

    .line 1239
    .line 1240
    const/16 v8, 0x195

    .line 1241
    .line 1242
    if-eq v11, v8, :cond_1d

    .line 1243
    .line 1244
    packed-switch v11, :pswitch_data_2

    .line 1245
    .line 1246
    .line 1247
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1248
    .line 1249
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 1250
    .line 1251
    .line 1252
    throw v0

    .line 1253
    :pswitch_10
    const-string v8, "Invalid Range"

    .line 1254
    .line 1255
    goto :goto_11

    .line 1256
    :pswitch_11
    const-string v8, "Header Field Not Valid"

    .line 1257
    .line 1258
    goto :goto_11

    .line 1259
    :pswitch_12
    const-string v8, "Method Not Valid In This State"

    .line 1260
    .line 1261
    goto :goto_11

    .line 1262
    :pswitch_13
    const-string v8, "Session Not Found"

    .line 1263
    .line 1264
    goto :goto_11

    .line 1265
    :cond_1d
    const-string v8, "Method Not Allowed"

    .line 1266
    .line 1267
    goto :goto_11

    .line 1268
    :cond_1e
    const-string v8, "Not Found"

    .line 1269
    .line 1270
    goto :goto_11

    .line 1271
    :cond_1f
    const-string v8, "Unauthorized"

    .line 1272
    .line 1273
    goto :goto_11

    .line 1274
    :cond_20
    const-string v8, "Bad Request"

    .line 1275
    .line 1276
    goto :goto_11

    .line 1277
    :cond_21
    const-string v8, "Move Temporarily"

    .line 1278
    .line 1279
    goto :goto_11

    .line 1280
    :cond_22
    const-string v8, "Move Permanently"

    .line 1281
    .line 1282
    goto :goto_11

    .line 1283
    :cond_23
    const-string v8, "RTSP Version Not Supported"

    .line 1284
    .line 1285
    goto :goto_11

    .line 1286
    :cond_24
    const-string v8, "Internal Server Error"

    .line 1287
    .line 1288
    goto :goto_11

    .line 1289
    :cond_25
    const-string v8, "Unsupported Transport"

    .line 1290
    .line 1291
    goto :goto_11

    .line 1292
    :cond_26
    const-string v8, "OK"

    .line 1293
    .line 1294
    :goto_11
    sget v9, LQ1/x;->a:I

    .line 1295
    .line 1296
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1297
    .line 1298
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    const-string v12, "RTSP/1.0 "

    .line 1301
    .line 1302
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v7

    .line 1318
    invoke-virtual {v6, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    iget-object v3, v3, Lg2/o;->a:Ll8/L;

    .line 1322
    .line 1323
    iget-object v7, v3, Ll8/N;->d:Ll8/j0;

    .line 1324
    .line 1325
    invoke-virtual {v7}, Ll8/j0;->e()Ll8/P;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v7

    .line 1329
    invoke-virtual {v7}, Ll8/F;->g()Ll8/t0;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v7

    .line 1333
    :cond_27
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v8

    .line 1337
    if-eqz v8, :cond_28

    .line 1338
    .line 1339
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v8

    .line 1343
    check-cast v8, Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-virtual {v3, v8}, Ll8/L;->d(Ljava/lang/String;)Ll8/K;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v9

    .line 1349
    const/4 v11, 0x0

    .line 1350
    :goto_12
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 1351
    .line 1352
    .line 1353
    move-result v12

    .line 1354
    if-ge v11, v12, :cond_27

    .line 1355
    .line 1356
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v12

    .line 1360
    const/4 v13, 0x2

    .line 1361
    new-array v14, v13, [Ljava/lang/Object;

    .line 1362
    .line 1363
    const/16 v19, 0x0

    .line 1364
    .line 1365
    aput-object v8, v14, v19

    .line 1366
    .line 1367
    const/16 v18, 0x1

    .line 1368
    .line 1369
    aput-object v12, v14, v18

    .line 1370
    .line 1371
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1372
    .line 1373
    const-string v15, "%s: %s"

    .line 1374
    .line 1375
    invoke-static {v12, v15, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v12

    .line 1379
    invoke-virtual {v6, v12}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1380
    .line 1381
    .line 1382
    add-int/lit8 v11, v11, 0x1

    .line 1383
    .line 1384
    goto :goto_12

    .line 1385
    :cond_28
    invoke-virtual {v6, v10}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v2, v2, LE4/n;->d:Ljava/lang/Object;

    .line 1389
    .line 1390
    check-cast v2, Ljava/lang/String;

    .line 1391
    .line 1392
    invoke-virtual {v6, v2}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v6}, Ll8/H;->g()Ll8/e0;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v2

    .line 1399
    iget-object v3, v4, Lg2/n;->i:Lg2/z;

    .line 1400
    .line 1401
    invoke-virtual {v3, v2}, Lg2/z;->b(Ll8/e0;)V

    .line 1402
    .line 1403
    .line 1404
    iget v2, v5, LE4/n;->b:I

    .line 1405
    .line 1406
    const/16 v18, 0x1

    .line 1407
    .line 1408
    add-int/lit8 v0, v0, 0x1

    .line 1409
    .line 1410
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 1411
    .line 1412
    .line 1413
    move-result v0

    .line 1414
    iput v0, v5, LE4/n;->b:I

    .line 1415
    .line 1416
    :goto_13
    :pswitch_14
    return-void

    .line 1417
    :pswitch_15
    move/from16 v18, v0

    .line 1418
    .line 1419
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v0, Lf6/N;

    .line 1422
    .line 1423
    iget-object v2, v0, Lf6/N;->q:La6/b;

    .line 1424
    .line 1425
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1426
    .line 1427
    check-cast v3, LJ5/t;

    .line 1428
    .line 1429
    if-nez v2, :cond_29

    .line 1430
    .line 1431
    move-object v2, v3

    .line 1432
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    goto :goto_14

    .line 1438
    :cond_29
    new-instance v2, LJ5/o;

    .line 1439
    .line 1440
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    invoke-direct {v2, v4, v5}, LJ5/o;-><init>(J)V

    .line 1446
    .line 1447
    .line 1448
    :goto_14
    iput-object v2, v0, Lf6/N;->x:LJ5/t;

    .line 1449
    .line 1450
    invoke-interface {v3}, LJ5/t;->f()J

    .line 1451
    .line 1452
    .line 1453
    move-result-wide v6

    .line 1454
    iput-wide v6, v0, Lf6/N;->y:J

    .line 1455
    .line 1456
    iget-boolean v2, v0, Lf6/N;->E:Z

    .line 1457
    .line 1458
    if-nez v2, :cond_2a

    .line 1459
    .line 1460
    invoke-interface {v3}, LJ5/t;->f()J

    .line 1461
    .line 1462
    .line 1463
    move-result-wide v6

    .line 1464
    cmp-long v2, v6, v4

    .line 1465
    .line 1466
    if-nez v2, :cond_2a

    .line 1467
    .line 1468
    move/from16 v15, v18

    .line 1469
    .line 1470
    goto :goto_15

    .line 1471
    :cond_2a
    const/4 v15, 0x0

    .line 1472
    :goto_15
    iput-boolean v15, v0, Lf6/N;->z:Z

    .line 1473
    .line 1474
    if-eqz v15, :cond_2b

    .line 1475
    .line 1476
    const/4 v2, 0x7

    .line 1477
    goto :goto_16

    .line 1478
    :cond_2b
    move/from16 v2, v18

    .line 1479
    .line 1480
    :goto_16
    iput v2, v0, Lf6/N;->A:I

    .line 1481
    .line 1482
    iget-wide v4, v0, Lf6/N;->y:J

    .line 1483
    .line 1484
    invoke-interface {v3}, LJ5/t;->e()Z

    .line 1485
    .line 1486
    .line 1487
    move-result v2

    .line 1488
    iget-boolean v3, v0, Lf6/N;->z:Z

    .line 1489
    .line 1490
    iget-object v6, v0, Lf6/N;->g:Lf6/Q;

    .line 1491
    .line 1492
    invoke-virtual {v6, v4, v5, v2, v3}, Lf6/Q;->s(JZZ)V

    .line 1493
    .line 1494
    .line 1495
    iget-boolean v2, v0, Lf6/N;->u:Z

    .line 1496
    .line 1497
    if-nez v2, :cond_2c

    .line 1498
    .line 1499
    invoke-virtual {v0}, Lf6/N;->u()V

    .line 1500
    .line 1501
    .line 1502
    :cond_2c
    return-void

    .line 1503
    :pswitch_16
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1504
    .line 1505
    check-cast v0, Lf5/h;

    .line 1506
    .line 1507
    iget-object v0, v0, Lf5/h;->b:Luc/r;

    .line 1508
    .line 1509
    if-eqz v0, :cond_2d

    .line 1510
    .line 1511
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1512
    .line 1513
    check-cast v2, Lorg/json/JSONObject;

    .line 1514
    .line 1515
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    const-string v3, "notifyError"

    .line 1520
    .line 1521
    const/4 v7, 0x0

    .line 1522
    invoke-virtual {v0, v3, v2, v7}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 1523
    .line 1524
    .line 1525
    :cond_2d
    return-void

    .line 1526
    :pswitch_17
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1527
    .line 1528
    check-cast v0, LWa/h;

    .line 1529
    .line 1530
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 1531
    .line 1532
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1533
    .line 1534
    invoke-virtual {v0, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1535
    .line 1536
    .line 1537
    return-void

    .line 1538
    :pswitch_18
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1539
    .line 1540
    move-object v2, v0

    .line 1541
    check-cast v2, Lp8/q;

    .line 1542
    .line 1543
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 1546
    .line 1547
    iget-object v3, v2, Lp8/m;->a:Ljava/lang/Object;

    .line 1548
    .line 1549
    instance-of v3, v3, Lp8/a;

    .line 1550
    .line 1551
    if-nez v3, :cond_2f

    .line 1552
    .line 1553
    :try_start_7
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    if-nez v0, :cond_2e

    .line 1558
    .line 1559
    sget-object v0, Lp8/m;->g:Ljava/lang/Object;

    .line 1560
    .line 1561
    :cond_2e
    sget-object v3, Lp8/m;->f:Lic/d;

    .line 1562
    .line 1563
    const/4 v7, 0x0

    .line 1564
    invoke-virtual {v3, v2, v7, v0}, Lic/d;->i(Lp8/m;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1565
    .line 1566
    .line 1567
    move-result v0

    .line 1568
    if-eqz v0, :cond_2f

    .line 1569
    .line 1570
    const/4 v3, 0x0

    .line 1571
    invoke-static {v2, v3}, Lp8/m;->c(Lp8/m;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1572
    .line 1573
    .line 1574
    goto :goto_17

    .line 1575
    :catchall_2
    move-exception v0

    .line 1576
    new-instance v3, Lp8/b;

    .line 1577
    .line 1578
    invoke-direct {v3, v0}, Lp8/b;-><init>(Ljava/lang/Throwable;)V

    .line 1579
    .line 1580
    .line 1581
    sget-object v0, Lp8/m;->f:Lic/d;

    .line 1582
    .line 1583
    const/4 v7, 0x0

    .line 1584
    invoke-virtual {v0, v2, v7, v3}, Lic/d;->i(Lp8/m;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1585
    .line 1586
    .line 1587
    move-result v0

    .line 1588
    if-eqz v0, :cond_2f

    .line 1589
    .line 1590
    const/4 v3, 0x0

    .line 1591
    invoke-static {v2, v3}, Lp8/m;->c(Lp8/m;Z)V

    .line 1592
    .line 1593
    .line 1594
    :cond_2f
    :goto_17
    return-void

    .line 1595
    :pswitch_19
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1596
    .line 1597
    check-cast v0, Ldd/a;

    .line 1598
    .line 1599
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1600
    .line 1601
    check-cast v2, Lp8/q;

    .line 1602
    .line 1603
    invoke-interface {v0, v2}, Ldd/a;->g(Lp8/q;)V

    .line 1604
    .line 1605
    .line 1606
    return-void

    .line 1607
    :pswitch_1a
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1608
    .line 1609
    check-cast v0, Lcom/unity3d/ads/IUnityAdsInitializationListener;

    .line 1610
    .line 1611
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1612
    .line 1613
    check-cast v2, Ljava/lang/String;

    .line 1614
    .line 1615
    invoke-static {v0, v2}, Lcom/unity3d/services/core/properties/SdkProperties;->b(Lcom/unity3d/ads/IUnityAdsInitializationListener;Ljava/lang/String;)V

    .line 1616
    .line 1617
    .line 1618
    return-void

    .line 1619
    :pswitch_1b
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v0, Lcom/unity3d/ads/InitializationListener;

    .line 1622
    .line 1623
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v2, Ljava/lang/String;

    .line 1626
    .line 1627
    invoke-static {v0, v2}, Lcom/unity3d/services/core/properties/SdkProperties;->c(Lcom/unity3d/ads/InitializationListener;Ljava/lang/String;)V

    .line 1628
    .line 1629
    .line 1630
    return-void

    .line 1631
    :pswitch_1c
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1632
    .line 1633
    check-cast v0, Lcom/unity3d/services/ads/operation/show/ShowOperationState;

    .line 1634
    .line 1635
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1636
    .line 1637
    check-cast v2, Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;

    .line 1638
    .line 1639
    invoke-static {v0, v2}, Lcom/unity3d/services/ads/operation/show/ShowOperationState;->d(Lcom/unity3d/services/ads/operation/show/ShowOperationState;Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;)V

    .line 1640
    .line 1641
    .line 1642
    return-void

    .line 1643
    :pswitch_1d
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1644
    .line 1645
    check-cast v0, Lcom/unity3d/services/ads/operation/show/ShowOperationState;

    .line 1646
    .line 1647
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1648
    .line 1649
    check-cast v2, Ljava/lang/String;

    .line 1650
    .line 1651
    invoke-static {v0, v2}, Lcom/unity3d/services/ads/operation/show/ShowOperationState;->b(Lcom/unity3d/services/ads/operation/show/ShowOperationState;Ljava/lang/String;)V

    .line 1652
    .line 1653
    .line 1654
    return-void

    .line 1655
    :pswitch_1e
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1656
    .line 1657
    check-cast v0, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;

    .line 1658
    .line 1659
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1660
    .line 1661
    check-cast v2, Ljava/lang/String;

    .line 1662
    .line 1663
    invoke-static {v0, v2}, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;->b(Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;Ljava/lang/String;)V

    .line 1664
    .line 1665
    .line 1666
    return-void

    .line 1667
    :pswitch_1f
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v0, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;

    .line 1670
    .line 1671
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1672
    .line 1673
    check-cast v2, Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;

    .line 1674
    .line 1675
    invoke-static {v0, v2}, Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;->a(Lcom/unity3d/services/ads/gmascar/managers/BiddingBaseManager;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;)V

    .line 1676
    .line 1677
    .line 1678
    return-void

    .line 1679
    :pswitch_20
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1680
    .line 1681
    check-cast v0, Lcom/unity3d/ads/IUnityAdsLoadListener;

    .line 1682
    .line 1683
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1684
    .line 1685
    check-cast v2, Ljava/lang/String;

    .line 1686
    .line 1687
    invoke-static {v0, v2}, Lcom/unity3d/services/ads/UnityAdsImplementation;->c(Lcom/unity3d/ads/IUnityAdsLoadListener;Ljava/lang/String;)V

    .line 1688
    .line 1689
    .line 1690
    return-void

    .line 1691
    :pswitch_21
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1692
    .line 1693
    check-cast v0, Landroid/content/Context;

    .line 1694
    .line 1695
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v2, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;

    .line 1698
    .line 1699
    invoke-static {v0, v2}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;->a(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V

    .line 1700
    .line 1701
    .line 1702
    return-void

    .line 1703
    :pswitch_22
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1704
    .line 1705
    check-cast v0, Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 1706
    .line 1707
    invoke-virtual {v0}, Lcom/moloco/sdk/publisher/MolocoAdError;->getAdUnitId()Ljava/lang/String;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v2

    .line 1711
    invoke-virtual {v0}, Lcom/moloco/sdk/publisher/MolocoAdError;->toString()Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v0

    .line 1715
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1716
    .line 1717
    check-cast v3, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;

    .line 1718
    .line 1719
    invoke-interface {v3, v2, v0}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;->onAdShowFailed(Ljava/lang/String;Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    return-void

    .line 1723
    :pswitch_23
    const-string v0, "Ad cannot be shown as it was not loaded"

    .line 1724
    .line 1725
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1726
    .line 1727
    check-cast v2, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;

    .line 1728
    .line 1729
    iget-object v3, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1730
    .line 1731
    check-cast v3, Ljava/lang/String;

    .line 1732
    .line 1733
    invoke-interface {v2, v3, v0}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;->onAdShowFailed(Ljava/lang/String;Ljava/lang/String;)V

    .line 1734
    .line 1735
    .line 1736
    return-void

    .line 1737
    :pswitch_24
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1738
    .line 1739
    check-cast v0, Lcom/applovin/mediation/adapters/AppLovinAdapterAdViewListener;

    .line 1740
    .line 1741
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1742
    .line 1743
    check-cast v2, Lcom/applovin/sdk/AppLovinAd;

    .line 1744
    .line 1745
    invoke-static {v0, v2}, Lcom/applovin/mediation/adapters/AppLovinAdapterAdViewListener;->a(Lcom/applovin/mediation/adapters/AppLovinAdapterAdViewListener;Lcom/applovin/sdk/AppLovinAd;)V

    .line 1746
    .line 1747
    .line 1748
    return-void

    .line 1749
    :pswitch_25
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1750
    .line 1751
    check-cast v0, Landroid/widget/ImageView;

    .line 1752
    .line 1753
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1754
    .line 1755
    check-cast v2, Landroid/graphics/Bitmap;

    .line 1756
    .line 1757
    invoke-static {v0, v2}, Lcom/applovin/impl/sdk/utils/ImageViewUtils;->b(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    .line 1758
    .line 1759
    .line 1760
    return-void

    .line 1761
    :pswitch_26
    iget-object v0, v1, Lcom/applovin/impl/sdk/nativeAd/e;->b:Ljava/lang/Object;

    .line 1762
    .line 1763
    check-cast v0, Lcom/applovin/impl/sdk/nativeAd/b;

    .line 1764
    .line 1765
    iget-object v2, v1, Lcom/applovin/impl/sdk/nativeAd/e;->c:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v2, Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;

    .line 1768
    .line 1769
    invoke-static {v0, v2}, Lcom/applovin/impl/sdk/nativeAd/b;->e(Lcom/applovin/impl/sdk/nativeAd/b;Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;)V

    .line 1770
    .line 1771
    .line 1772
    return-void

    .line 1773
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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

    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_14
        :pswitch_f
        :pswitch_14
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_b
        :pswitch_14
        :pswitch_14
    .end packed-switch

    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    :pswitch_data_2
    .packed-switch 0x1c6
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method
