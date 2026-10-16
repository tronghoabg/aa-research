.class public final synthetic LMb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/vungle/ads/internal/util/j;Landroid/graphics/Bitmap;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LMb/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMb/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LMb/b;->d:Ljava/lang/Object;

    iput p3, p0, LMb/b;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LMb/b;->a:I

    iput-object p1, p0, LMb/b;->c:Ljava/lang/Object;

    iput p2, p0, LMb/b;->b:I

    iput-object p3, p0, LMb/b;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x1

    .line 6
    iget v5, p0, LMb/b;->a:I

    .line 7
    .line 8
    packed-switch v5, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LMb/b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LE4/n;

    .line 14
    .line 15
    invoke-static {}, LBa/c;->E()Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget v6, p0, LMb/b;->b:I

    .line 20
    .line 21
    iget-object v7, p0, LMb/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v7, Lcom/google/protobuf/MessageLite;

    .line 24
    .line 25
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lv9/b;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    new-array v3, v3, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v8, v3, v2

    .line 54
    .line 55
    aput-object v9, v3, v4

    .line 56
    .line 57
    aput-object v7, v3, v1

    .line 58
    .line 59
    const-string v1, "(%x) Stream received (%s): %s"

    .line 60
    .line 61
    invoke-static {v5, v1, v4, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    if-ne v6, v4, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v7}, Lv9/b;->e(Lcom/google/protobuf/MessageLite;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0, v7}, Lv9/b;->f(Lcom/google/protobuf/MessageLite;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-void

    .line 74
    :pswitch_0
    iget-object v1, p0, LMb/b;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lu6/i;

    .line 93
    .line 94
    iget-boolean v3, v2, Lu6/i;->d:Z

    .line 95
    .line 96
    if-nez v3, :cond_2

    .line 97
    .line 98
    iget v3, p0, LMb/b;->b:I

    .line 99
    .line 100
    if-eq v3, v0, :cond_3

    .line 101
    .line 102
    iget-object v5, v2, Lu6/i;->b:LN1/k;

    .line 103
    .line 104
    invoke-virtual {v5, v3}, LN1/k;->a(I)V

    .line 105
    .line 106
    .line 107
    :cond_3
    iput-boolean v4, v2, Lu6/i;->c:Z

    .line 108
    .line 109
    iget-object v3, p0, LMb/b;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lu6/g;

    .line 112
    .line 113
    iget-object v2, v2, Lu6/i;->a:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-interface {v3, v2}, Lu6/g;->invoke(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    return-void

    .line 120
    :pswitch_1
    iget-object v0, p0, LMb/b;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LK8/A;

    .line 123
    .line 124
    iget-object v0, v0, LK8/A;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Li3/a;

    .line 127
    .line 128
    iget v1, p0, LMb/b;->b:I

    .line 129
    .line 130
    iget-object v2, p0, LMb/b;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Ljava/io/Serializable;

    .line 133
    .line 134
    invoke-interface {v0, v1, v2}, Li3/a;->a(ILjava/io/Serializable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_2
    iget-object v0, p0, LMb/b;->d:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Ljava/lang/String;

    .line 141
    .line 142
    iget-object v1, p0, LMb/b;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lcom/unity3d/ads/InitializationListener;

    .line 145
    .line 146
    iget v2, p0, LMb/b;->b:I

    .line 147
    .line 148
    invoke-static {v1, v2, v0}, Lcom/unity3d/services/core/properties/SdkProperties;->d(Lcom/unity3d/ads/InitializationListener;ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_3
    iget-object v0, p0, LMb/b;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ljava/util/Collection;

    .line 155
    .line 156
    iget-object v1, p0, LMb/b;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;

    .line 159
    .line 160
    iget v2, p0, LMb/b;->b:I

    .line 161
    .line 162
    invoke-static {v1, v2, v0}, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;->b(Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;ILjava/util/Collection;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_4
    iget-object v0, p0, LMb/b;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, LUc/n;

    .line 169
    .line 170
    iget v5, p0, LMb/b;->b:I

    .line 171
    .line 172
    iget-object v6, p0, LMb/b;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, LPc/o;

    .line 175
    .line 176
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v7, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 181
    .line 182
    invoke-virtual {v7}, LDd/c;->C()V

    .line 183
    .line 184
    .line 185
    iget-object v8, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->m:Lcom/google/android/gms/ads/nativead/l;

    .line 186
    .line 187
    if-nez v8, :cond_7

    .line 188
    .line 189
    iget-object v8, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 190
    .line 191
    iget-object v9, v8, Lm9/H;->e:Lm9/P;

    .line 192
    .line 193
    if-eqz v9, :cond_5

    .line 194
    .line 195
    instance-of v8, v9, Lm9/T;

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    iget-boolean v8, v8, Lm9/H;->c:Z

    .line 199
    .line 200
    :goto_2
    if-nez v8, :cond_6

    .line 201
    .line 202
    instance-of v8, v9, Lm9/T;

    .line 203
    .line 204
    if-eqz v8, :cond_7

    .line 205
    .line 206
    :cond_6
    new-instance v8, Lcom/google/android/gms/ads/nativead/l;

    .line 207
    .line 208
    const/16 v9, 0xa

    .line 209
    .line 210
    invoke-direct {v8, v9, v2}, Lcom/google/android/gms/ads/nativead/l;-><init>(IZ)V

    .line 211
    .line 212
    .line 213
    iput-object v7, v8, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v8, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->m:Lcom/google/android/gms/ads/nativead/l;

    .line 216
    .line 217
    :cond_7
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->m:Lcom/google/android/gms/ads/nativead/l;

    .line 218
    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    invoke-static {v5}, LA/f;->f(I)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_a

    .line 226
    .line 227
    if-eq v2, v4, :cond_9

    .line 228
    .line 229
    if-eq v2, v1, :cond_8

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_8
    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 233
    .line 234
    move-object v1, v0

    .line 235
    check-cast v1, LDd/c;

    .line 236
    .line 237
    monitor-enter v1

    .line 238
    :try_start_0
    invoke-virtual {v1}, LDd/c;->C()V

    .line 239
    .line 240
    .line 241
    iget-object v0, v1, LDd/c;->c:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lp9/n;

    .line 244
    .line 245
    invoke-virtual {v0}, Lp9/n;->e()V

    .line 246
    .line 247
    .line 248
    new-instance v2, Lp9/l;

    .line 249
    .line 250
    invoke-direct {v2, v0, v3}, Lp9/l;-><init>(Lp9/n;I)V

    .line 251
    .line 252
    .line 253
    iget-object v0, v0, Lp9/n;->d:Lw9/e;

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    .line 257
    .line 258
    monitor-exit v1

    .line 259
    goto :goto_3

    .line 260
    :catchall_0
    move-exception v0

    .line 261
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    throw v0

    .line 263
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/l;->b()V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_a
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/l;->i()V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_b
    const-string v0, "FlutterFirestorePlugin"

    .line 272
    .line 273
    const-string v1, "`PersistentCacheIndexManager` is not available."

    .line 274
    .line 275
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    :goto_3
    const/4 v0, 0x0

    .line 279
    invoke-virtual {v6, v0}, LPc/o;->a(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :pswitch_5
    iget-object v1, p0, LMb/b;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    :cond_c
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_e

    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    check-cast v2, LQ1/i;

    .line 302
    .line 303
    iget-boolean v3, v2, LQ1/i;->d:Z

    .line 304
    .line 305
    if-nez v3, :cond_c

    .line 306
    .line 307
    iget v3, p0, LMb/b;->b:I

    .line 308
    .line 309
    if-eq v3, v0, :cond_d

    .line 310
    .line 311
    iget-object v5, v2, LQ1/i;->b:LN1/k;

    .line 312
    .line 313
    invoke-virtual {v5, v3}, LN1/k;->a(I)V

    .line 314
    .line 315
    .line 316
    :cond_d
    iput-boolean v4, v2, LQ1/i;->c:Z

    .line 317
    .line 318
    iget-object v3, p0, LMb/b;->d:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v3, LQ1/g;

    .line 321
    .line 322
    iget-object v2, v2, LQ1/i;->a:Ljava/lang/Object;

    .line 323
    .line 324
    invoke-interface {v3, v2}, LQ1/g;->invoke(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_e
    return-void

    .line 329
    :pswitch_6
    iget-object v0, p0, LMb/b;->d:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Landroid/graphics/Bitmap;

    .line 332
    .line 333
    iget v1, p0, LMb/b;->b:I

    .line 334
    .line 335
    iget-object v2, p0, LMb/b;->c:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v2, Lcom/vungle/ads/internal/util/j;

    .line 338
    .line 339
    invoke-static {v2, v0, v1}, Lcom/vungle/ads/internal/util/i;->a(Lcom/vungle/ads/internal/util/j;Landroid/graphics/Bitmap;I)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
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
