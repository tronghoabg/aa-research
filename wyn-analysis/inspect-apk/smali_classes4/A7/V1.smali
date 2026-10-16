.class public final LA7/V1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x9

    iput v0, p0, LA7/V1;->a:I

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/n0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/V1;->a:I

    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    iput-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LG6/I;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA7/V1;->a:I

    .line 5
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LG6/U;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA7/V1;->a:I

    .line 6
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LA7/V1;->a:I

    iput-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object p2, p0, LA7/V1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, LR4/c;

    .line 4
    .line 5
    iget-boolean v0, p2, LR4/c;->c:Z

    .line 6
    .line 7
    invoke-static {p1}, LR4/c;->c(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput-boolean p1, p2, LR4/c;->c:Z

    .line 12
    .line 13
    iget-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LR4/c;

    .line 16
    .line 17
    iget-boolean p1, p1, LR4/c;->c:Z

    .line 18
    .line 19
    if-eq v0, p1, :cond_2

    .line 20
    .line 21
    const-string p1, "ConnectivityMonitor"

    .line 22
    .line 23
    const/4 p2, 0x3

    .line 24
    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-string p1, "ConnectivityMonitor"

    .line 31
    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v0, "connectivity changed, isConnected: "

    .line 35
    .line 36
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LA7/V1;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, LR4/c;

    .line 42
    .line 43
    iget-boolean v0, v0, LR4/c;->c:Z

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object p1, p0, LA7/V1;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, LR4/c;

    .line 58
    .line 59
    iget-object p2, p1, LR4/c;->b:Lba/a;

    .line 60
    .line 61
    iget-boolean p1, p1, LR4/c;->c:Z

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object p1, p2, Lba/a;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Lcom/bumptech/glide/h;

    .line 68
    .line 69
    monitor-enter p1

    .line 70
    :try_start_0
    iget-object p2, p2, Lba/a;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, LE5/b;

    .line 73
    .line 74
    invoke-virtual {p2}, LE5/b;->j()V

    .line 75
    .line 76
    .line 77
    monitor-exit p1

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p2

    .line 80
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p2

    .line 82
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 1
    const-string v0, "FirebaseMessaging"

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v3, 0x17

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    :cond_0
    const-string v1, "Connectivity change received registered"

    .line 23
    .line 24
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    .line 28
    .line 29
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LA7/V1;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LW9/w;

    .line 37
    .line 38
    iget-object v1, v1, LW9/w;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 41
    .line 42
    iget-object v1, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x1f

    .line 9
    .line 10
    const/16 v5, 0x1d

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x6

    .line 16
    const/16 v10, 0x9

    .line 17
    .line 18
    const/4 v11, 0x5

    .line 19
    const/4 v12, 0x2

    .line 20
    const/4 v13, 0x3

    .line 21
    const/4 v14, 0x0

    .line 22
    const/4 v15, 0x1

    .line 23
    iget v6, v1, LA7/V1;->a:I

    .line 24
    .line 25
    packed-switch v6, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    const-string v2, "connectivity"

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz v2, :cond_6

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    if-eq v3, v15, :cond_4

    .line 59
    .line 60
    if-eq v3, v8, :cond_3

    .line 61
    .line 62
    if-eq v3, v11, :cond_3

    .line 63
    .line 64
    if-eq v3, v9, :cond_5

    .line 65
    .line 66
    if-eq v3, v10, :cond_2

    .line 67
    .line 68
    move v6, v7

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v6, 0x7

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    packed-switch v2, :pswitch_data_1

    .line 77
    .line 78
    .line 79
    :pswitch_0
    move v6, v9

    .line 80
    goto :goto_2

    .line 81
    :pswitch_1
    sget v2, Lu6/v;->a:I

    .line 82
    .line 83
    if-lt v2, v5, :cond_7

    .line 84
    .line 85
    move v6, v10

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :pswitch_2
    move v6, v12

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    :pswitch_3
    move v6, v11

    .line 90
    goto :goto_2

    .line 91
    :pswitch_4
    move v6, v8

    .line 92
    goto :goto_2

    .line 93
    :pswitch_5
    move v6, v13

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    :goto_0
    move v6, v15

    .line 96
    goto :goto_2

    .line 97
    :catch_0
    :cond_7
    :goto_1
    move v6, v14

    .line 98
    :goto_2
    sget v2, Lu6/v;->a:I

    .line 99
    .line 100
    iget-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Lu6/o;

    .line 103
    .line 104
    if-lt v2, v4, :cond_8

    .line 105
    .line 106
    if-ne v6, v11, :cond_8

    .line 107
    .line 108
    :try_start_1
    const-string v2, "phone"

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance v4, LQ1/m;

    .line 120
    .line 121
    invoke-direct {v4, v3, v15}, LQ1/m;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, LA0/j;->o(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v2, v0, v4}, Le1/c;->q(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;LQ1/m;)V

    .line 129
    .line 130
    .line 131
    invoke-static {v2, v4}, Le1/c;->p(Landroid/telephony/TelephonyManager;LQ1/m;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :catch_1
    invoke-static {v3, v11}, Lu6/o;->a(Lu6/o;I)V

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-static {v3, v6}, Lu6/o;->a(Lu6/o;I)V

    .line 140
    .line 141
    .line 142
    :goto_3
    return-void

    .line 143
    :pswitch_6
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, LJ4/d;

    .line 146
    .line 147
    invoke-virtual {v0}, LJ4/d;->k()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_7
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const-string v2, "close action"

    .line 156
    .line 157
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lio/flutter/plugins/urllauncher/WebViewActivity;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 168
    .line 169
    .line 170
    :cond_9
    return-void

    .line 171
    :pswitch_8
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, LW9/w;

    .line 174
    .line 175
    if-nez v0, :cond_a

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_a
    invoke-virtual {v0}, LW9/w;->a()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_b

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_b
    const-string v0, "FirebaseMessaging"

    .line 186
    .line 187
    invoke-static {v0, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_c

    .line 192
    .line 193
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 194
    .line 195
    const/16 v4, 0x17

    .line 196
    .line 197
    if-ne v2, v4, :cond_d

    .line 198
    .line 199
    invoke-static {v0, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_d

    .line 204
    .line 205
    :cond_c
    const-string v2, "Connectivity changed. Starting background sync."

    .line 206
    .line 207
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    :cond_d
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, LW9/w;

    .line 213
    .line 214
    iget-object v2, v0, LW9/w;->d:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v2, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    const-wide/16 v4, 0x0

    .line 222
    .line 223
    invoke-static {v0, v4, v5}, Lcom/google/firebase/messaging/FirebaseMessaging;->b(Ljava/lang/Runnable;J)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, LW9/w;

    .line 229
    .line 230
    iget-object v0, v0, LW9/w;->d:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 233
    .line 234
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 237
    .line 238
    .line 239
    iput-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 240
    .line 241
    :goto_4
    return-void

    .line 242
    :pswitch_9
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_e

    .line 247
    .line 248
    iget-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v3, LJ9/o;

    .line 251
    .line 252
    iget-object v4, v3, LJ9/o;->j:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v4, LN1/c;

    .line 255
    .line 256
    iget-object v5, v3, LJ9/o;->i:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v5, LY9/c;

    .line 259
    .line 260
    invoke-static {v0, v2, v4, v5}, LW1/b;->c(Landroid/content/Context;Landroid/content/Intent;LN1/c;LY9/c;)LW1/b;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v3, v0}, LJ9/o;->g(LW1/b;)V

    .line 265
    .line 266
    .line 267
    :cond_e
    return-void

    .line 268
    :pswitch_a
    invoke-direct/range {p0 .. p2}, LA7/V1;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :pswitch_b
    const-string v3, "context"

    .line 273
    .line 274
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const-string v0, "intent"

    .line 278
    .line 279
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, LQ3/d;

    .line 285
    .line 286
    invoke-virtual {v0, v2}, LQ3/d;->g(Landroid/content/Intent;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_c
    const-string v2, "connectivity"

    .line 291
    .line 292
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 297
    .line 298
    if-nez v2, :cond_f

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_f
    :try_start_2
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 302
    .line 303
    .line 304
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 305
    if-eqz v2, :cond_15

    .line 306
    .line 307
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-nez v3, :cond_10

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_10
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_12

    .line 319
    .line 320
    if-eq v3, v15, :cond_13

    .line 321
    .line 322
    if-eq v3, v8, :cond_12

    .line 323
    .line 324
    if-eq v3, v11, :cond_12

    .line 325
    .line 326
    if-eq v3, v9, :cond_14

    .line 327
    .line 328
    if-eq v3, v10, :cond_11

    .line 329
    .line 330
    move v6, v7

    .line 331
    goto :goto_7

    .line 332
    :cond_11
    const/4 v6, 0x7

    .line 333
    goto :goto_7

    .line 334
    :cond_12
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    packed-switch v2, :pswitch_data_2

    .line 339
    .line 340
    .line 341
    :pswitch_d
    move v6, v9

    .line 342
    goto :goto_7

    .line 343
    :pswitch_e
    sget v2, LQ1/x;->a:I

    .line 344
    .line 345
    if-lt v2, v5, :cond_16

    .line 346
    .line 347
    move v6, v10

    .line 348
    goto :goto_7

    .line 349
    :cond_13
    :pswitch_f
    move v6, v12

    .line 350
    goto :goto_7

    .line 351
    :cond_14
    :pswitch_10
    move v6, v11

    .line 352
    goto :goto_7

    .line 353
    :pswitch_11
    move v6, v8

    .line 354
    goto :goto_7

    .line 355
    :pswitch_12
    move v6, v13

    .line 356
    goto :goto_7

    .line 357
    :cond_15
    :goto_5
    move v6, v15

    .line 358
    goto :goto_7

    .line 359
    :catch_2
    :cond_16
    :goto_6
    move v6, v14

    .line 360
    :goto_7
    sget v2, LQ1/x;->a:I

    .line 361
    .line 362
    iget-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v3, LQ1/n;

    .line 365
    .line 366
    if-lt v2, v4, :cond_17

    .line 367
    .line 368
    if-ne v6, v11, :cond_17

    .line 369
    .line 370
    :try_start_3
    const-string v2, "phone"

    .line 371
    .line 372
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v4, LQ1/m;

    .line 382
    .line 383
    invoke-direct {v4, v3, v14}, LQ1/m;-><init>(Ljava/lang/Object;I)V

    .line 384
    .line 385
    .line 386
    invoke-static {v0}, LA0/j;->o(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v2, v0, v4}, LF5/i;->o(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;LQ1/m;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v2, v4}, LF5/i;->n(Landroid/telephony/TelephonyManager;LQ1/m;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3

    .line 394
    .line 395
    .line 396
    goto :goto_8

    .line 397
    :catch_3
    invoke-static {v11, v3}, LQ1/n;->a(ILQ1/n;)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_17
    invoke-static {v6, v3}, LQ1/n;->a(ILQ1/n;)V

    .line 402
    .line 403
    .line 404
    :goto_8
    return-void

    .line 405
    :pswitch_13
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, LJc/a;

    .line 408
    .line 409
    invoke-virtual {v0}, LJc/a;->b()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    iget v3, v0, LJc/a;->e:I

    .line 414
    .line 415
    invoke-static {v2, v3}, LA/f;->b(II)Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-nez v3, :cond_18

    .line 420
    .line 421
    iget-object v3, v0, LJc/a;->b:Lmd/J;

    .line 422
    .line 423
    new-instance v4, LE5/c;

    .line 424
    .line 425
    const/16 v5, 0xa

    .line 426
    .line 427
    invoke-direct {v4, v3, v2, v5}, LE5/c;-><init>(Ljava/lang/Object;II)V

    .line 428
    .line 429
    .line 430
    iget-object v3, v3, Lmd/J;->a:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v3, Landroid/os/Handler;

    .line 433
    .line 434
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 435
    .line 436
    .line 437
    :cond_18
    iput v2, v0, LJc/a;->e:I

    .line 438
    .line 439
    return-void

    .line 440
    :pswitch_14
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    const-string v3, "android.intent.action.USER_PRESENT"

    .line 445
    .line 446
    invoke-static {v0, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    iget-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v3, LG6/U;

    .line 453
    .line 454
    if-eqz v0, :cond_19

    .line 455
    .line 456
    iput-boolean v15, v3, LG6/U;->e:Z

    .line 457
    .line 458
    goto :goto_9

    .line 459
    :cond_19
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    const-string v2, "android.intent.action.SCREEN_OFF"

    .line 464
    .line 465
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_1a

    .line 470
    .line 471
    iput-boolean v14, v3, LG6/U;->e:Z

    .line 472
    .line 473
    :cond_1a
    :goto_9
    return-void

    .line 474
    :pswitch_15
    iget-object v3, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v3, LG6/I;

    .line 477
    .line 478
    monitor-enter v3

    .line 479
    :try_start_4
    new-instance v4, Ljava/util/ArrayList;

    .line 480
    .line 481
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 482
    .line 483
    .line 484
    iget-object v5, v3, LG6/I;->e:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v5, Ljava/util/WeakHashMap;

    .line 487
    .line 488
    invoke-virtual {v5}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 489
    .line 490
    .line 491
    move-result-object v5

    .line 492
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    :cond_1b
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_1c

    .line 501
    .line 502
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    check-cast v6, Ljava/util/Map$Entry;

    .line 507
    .line 508
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v7

    .line 512
    check-cast v7, Landroid/content/IntentFilter;

    .line 513
    .line 514
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    invoke-virtual {v7, v8}, Landroid/content/IntentFilter;->hasAction(Ljava/lang/String;)Z

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    if-eqz v7, :cond_1b

    .line 523
    .line 524
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    check-cast v6, Landroid/content/BroadcastReceiver;

    .line 529
    .line 530
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    goto :goto_a

    .line 534
    :catchall_0
    move-exception v0

    .line 535
    goto :goto_c

    .line 536
    :cond_1c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    :goto_b
    if-ge v14, v5, :cond_1d

    .line 541
    .line 542
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v6

    .line 546
    check-cast v6, Landroid/content/BroadcastReceiver;

    .line 547
    .line 548
    invoke-virtual {v6, v0, v2}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 549
    .line 550
    .line 551
    add-int/2addr v14, v15

    .line 552
    goto :goto_b

    .line 553
    :cond_1d
    monitor-exit v3

    .line 554
    return-void

    .line 555
    :goto_c
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 556
    throw v0

    .line 557
    :pswitch_16
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v0, LE5/E0;

    .line 560
    .line 561
    iget-object v2, v0, LE5/E0;->b:Landroid/os/Handler;

    .line 562
    .line 563
    new-instance v3, LC8/g;

    .line 564
    .line 565
    invoke-direct {v3, v0, v12}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :pswitch_17
    iget-object v0, v1, LA7/V1;->b:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, LA7/n0;

    .line 575
    .line 576
    if-nez v2, :cond_1e

    .line 577
    .line 578
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 579
    .line 580
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 581
    .line 582
    .line 583
    const-string v2, "App receiver called with null intent"

    .line 584
    .line 585
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 586
    .line 587
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    goto :goto_d

    .line 591
    :cond_1e
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    if-nez v2, :cond_1f

    .line 596
    .line 597
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 598
    .line 599
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 600
    .line 601
    .line 602
    const-string v2, "App receiver called with null action"

    .line 603
    .line 604
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 605
    .line 606
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_1f
    const-string v4, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 611
    .line 612
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    if-nez v2, :cond_20

    .line 617
    .line 618
    iget-object v0, v0, LA7/n0;->i:LA7/N;

    .line 619
    .line 620
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 621
    .line 622
    .line 623
    const-string v2, "App receiver called with unknown action"

    .line 624
    .line 625
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 626
    .line 627
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_20
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    if-eqz v2, :cond_22

    .line 636
    .line 637
    iget-object v2, v0, LA7/n0;->g:LA7/e;

    .line 638
    .line 639
    sget-object v4, LA7/y;->I0:LA7/D;

    .line 640
    .line 641
    invoke-virtual {v2, v3, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    if-nez v2, :cond_21

    .line 646
    .line 647
    goto :goto_d

    .line 648
    :cond_21
    iget-object v2, v0, LA7/n0;->i:LA7/N;

    .line 649
    .line 650
    invoke-static {v2}, LA7/n0;->d(LA7/D0;)V

    .line 651
    .line 652
    .line 653
    const-string v3, "App receiver notified triggers are available"

    .line 654
    .line 655
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 656
    .line 657
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    iget-object v2, v0, LA7/n0;->j:LA7/k0;

    .line 661
    .line 662
    invoke-static {v2}, LA7/n0;->d(LA7/D0;)V

    .line 663
    .line 664
    .line 665
    new-instance v3, LA7/V;

    .line 666
    .line 667
    invoke-direct {v3, v13}, LA7/V;-><init>(I)V

    .line 668
    .line 669
    .line 670
    iput-object v0, v3, LA7/V;->b:Ljava/lang/Object;

    .line 671
    .line 672
    invoke-virtual {v2, v3}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 673
    .line 674
    .line 675
    :cond_22
    :goto_d
    return-void

    .line 676
    nop

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_11
        :pswitch_11
        :pswitch_d
        :pswitch_11
        :pswitch_f
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method
