.class public final LG6/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LG6/I;->b:Z

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LG6/I;->e:Ljava/lang/Object;

    new-instance v0, LA7/V1;

    .line 3
    invoke-direct {v0, p0}, LA7/V1;-><init>(LG6/I;)V

    iput-object v0, p0, LG6/I;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LGa/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LG6/I;->c:Z

    iput-object p1, p0, LG6/I;->a:Landroid/content/Context;

    iput-object p2, p0, LG6/I;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LGa/b;
    .locals 11

    .line 1
    iget-boolean v0, p0, LG6/I;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v0, LGa/b;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbd()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v0, v1, v2}, LGa/b;-><init>(ILcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, LG6/I;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LGa/d;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v0, :cond_9

    .line 22
    .line 23
    iget-object v0, p0, LG6/I;->a:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/AndroidAssetUtil;->a(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, "PipelineManager"

    .line 32
    .line 33
    const-string v3, "Failed to initiate native asset manager."

    .line 34
    .line 35
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    :cond_1
    new-instance v0, LGa/d;

    .line 39
    .line 40
    iget-object v3, p0, LG6/I;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, LGa/c;

    .line 43
    .line 44
    invoke-static {}, LH7/u;->b()LH7/t;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-boolean v5, v3, LGa/c;->d:Z

    .line 49
    .line 50
    const/4 v6, 0x4

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    move v5, v6

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v5, v1

    .line 56
    :goto_0
    invoke-static {}, LH7/K;->a()LH7/J;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbe;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget-object v9, v3, LGa/c;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;->zbd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 67
    .line 68
    .line 69
    iget-object v9, v3, LGa/c;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;->zba(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;->zbe(Z)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;->zbb(Z)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 78
    .line 79
    .line 80
    iget-object v3, v3, LGa/c;->c:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpg;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpf;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpk;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpi;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpi;->zba(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpi;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpf;->zba(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpi;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpf;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;->zbc(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbpf;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;

    .line 103
    .line 104
    .line 105
    :cond_3
    invoke-virtual {v7, v8}, LH7/J;->b(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbbb;)V

    .line 106
    .line 107
    .line 108
    if-eqz v5, :cond_7

    .line 109
    .line 110
    const/4 v3, 0x2

    .line 111
    if-eq v5, v2, :cond_6

    .line 112
    .line 113
    const/4 v8, 0x3

    .line 114
    if-eq v5, v3, :cond_5

    .line 115
    .line 116
    if-eq v5, v8, :cond_8

    .line 117
    .line 118
    if-eq v5, v6, :cond_4

    .line 119
    .line 120
    move v6, v1

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const/4 v6, 0x5

    .line 123
    goto :goto_1

    .line 124
    :cond_5
    move v6, v8

    .line 125
    goto :goto_1

    .line 126
    :cond_6
    move v6, v3

    .line 127
    goto :goto_1

    .line 128
    :cond_7
    move v6, v2

    .line 129
    :cond_8
    :goto_1
    invoke-static {}, LH7/C;->a()LH7/B;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3, v6}, LH7/B;->a(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7, v3}, LH7/J;->c(LH7/B;)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbix;->zba()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbiu;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const-string v5, "PassThroughCoarseClassifier"

    .line 144
    .line 145
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbiu;->zba(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbiu;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v3}, LH7/J;->a(Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbiu;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v7}, LH7/t;->a(LH7/J;)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, LH7/b0;->a()LH7/a0;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, LH7/a0;->a()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, v3}, LH7/t;->b(LH7/a0;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtz;->zbi()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuf;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, LH7/u;

    .line 169
    .line 170
    invoke-direct {v0, v3}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;-><init>(LH7/u;)V

    .line 171
    .line 172
    .line 173
    iput-object v0, p0, LG6/I;->e:Ljava/lang/Object;

    .line 174
    .line 175
    :cond_9
    :try_start_0
    iget-object v0, p0, LG6/I;->e:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, LGa/d;

    .line 178
    .line 179
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object v3, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->b:Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;

    .line 183
    .line 184
    iget-wide v4, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J
    :try_end_0
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException; {:try_start_0 .. :try_end_0} :catch_1

    .line 185
    .line 186
    const-wide/16 v6, 0x0

    .line 187
    .line 188
    cmp-long v6, v4, v6

    .line 189
    .line 190
    if-eqz v6, :cond_a

    .line 191
    .line 192
    :try_start_1
    invoke-interface {v3, v4, v5}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->start(J)V

    .line 193
    .line 194
    .line 195
    iget-wide v4, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 196
    .line 197
    invoke-interface {v3, v4, v5}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->waitUntilIdle(J)V
    :try_end_1
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException; {:try_start_1 .. :try_end_1} :catch_0

    .line 198
    .line 199
    .line 200
    iput-boolean v2, p0, LG6/I;->b:Z

    .line 201
    .line 202
    new-instance v0, LGa/b;

    .line 203
    .line 204
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbd()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-direct {v0, v1, v2}, LGa/b;-><init>(ILcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :catch_0
    move-exception v1

    .line 213
    :try_start_2
    iget-wide v4, v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/b;->c:J

    .line 214
    .line 215
    invoke-interface {v3, v4, v5}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/a;->stop(J)Z

    .line 216
    .line 217
    .line 218
    throw v1

    .line 219
    :cond_a
    new-instance v0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;

    .line 220
    .line 221
    const-string v1, "Pipeline has been closed or was not initialized"

    .line 222
    .line 223
    const/16 v3, 0x9

    .line 224
    .line 225
    invoke-direct {v0, v3, v1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;-><init>(ILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0
    :try_end_2
    .catch Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException; {:try_start_2 .. :try_end_2} :catch_1

    .line 229
    :catch_1
    move-exception v0

    .line 230
    new-instance v1, Landroid/os/RemoteException;

    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->getRootCauseMessage()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v3, ""

    .line 237
    .line 238
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbb(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Ljava/lang/String;

    .line 243
    .line 244
    const-string v3, "Failed to initialize detector. "

    .line 245
    .line 246
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-direct {v1, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, LGa/b;

    .line 254
    .line 255
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;->zbe(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v2, v1}, LGa/b;-><init>(ILcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbki;)V

    .line 260
    .line 261
    .line 262
    return-object v0
.end method

.method public declared-synchronized b(Landroid/content/Context;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LG6/I;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LG6/I;->a:Landroid/content/Context;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, LG6/I;->a:Landroid/content/Context;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    iget-object p1, p0, LG6/I;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzeR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 27
    .line 28
    sget-object v0, LD6/s;->e:LD6/s;

    .line 29
    .line 30
    iget-object v1, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput-boolean p1, p0, LG6/I;->c:Z

    .line 43
    .line 44
    new-instance p1, Landroid/content/IntentFilter;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v1, "android.intent.action.SCREEN_ON"

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v1, "android.intent.action.SCREEN_OFF"

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, "android.intent.action.USER_PRESENT"

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzmF:Lcom/google/android/gms/internal/ads/zzbio;

    .line 65
    .line 66
    iget-object v0, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v1, 0x21

    .line 83
    .line 84
    if-lt v0, v1, :cond_2

    .line 85
    .line 86
    iget-object v0, p0, LG6/I;->a:Landroid/content/Context;

    .line 87
    .line 88
    iget-object v1, p0, LG6/I;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, LA7/V1;

    .line 91
    .line 92
    invoke-static {v0, v1, p1}, LA0/h;->p(Landroid/content/Context;LA7/V1;Landroid/content/IntentFilter;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget-object v0, p0, LG6/I;->a:Landroid/content/Context;

    .line 97
    .line 98
    iget-object v1, p0, LG6/I;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, LA7/V1;

    .line 101
    .line 102
    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    :goto_1
    const/4 p1, 0x1

    .line 106
    iput-boolean p1, p0, LG6/I;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    monitor-exit p0

    .line 109
    return-void

    .line 110
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    throw p1
.end method

.method public declared-synchronized c(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LG6/I;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, LG6/I;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 22
    throw p1
.end method
