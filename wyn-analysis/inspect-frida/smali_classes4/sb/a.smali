.class public final Lsb/a;
.super LQ6/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lsb/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LN6/a;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lsb/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lsb/a;->b:Ljava/lang/String;

    iput-object p1, p0, Lsb/a;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba/a;

    .line 4
    .line 5
    iget-object v1, v0, Lba/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lh9/c;

    .line 8
    .line 9
    iput-object p1, v1, Lh9/c;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, v0, Lba/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LA/x;

    .line 14
    .line 15
    monitor-enter p1

    .line 16
    :try_start_0
    iget v0, p1, LA/x;->b:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    iput v0, p1, LA/x;->b:I

    .line 21
    .line 22
    if-gtz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, LA/x;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LL7/b;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, LL7/b;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :cond_0
    monitor-exit p1

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw v0
.end method

.method private final b(LQ6/a;)V
    .locals 3

    .line 1
    iget-object p1, p1, LQ6/a;->a:LD6/c1;

    .line 2
    .line 3
    iget-object p1, p1, LD6/c1;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lba/a;

    .line 8
    .line 9
    iget-object v1, p0, Lsb/a;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lba/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lh9/c;

    .line 14
    .line 15
    iget-object v2, v2, Lh9/c;->a:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lba/a;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, LA/x;

    .line 23
    .line 24
    monitor-enter p1

    .line 25
    :try_start_0
    iget v0, p1, LA/x;->b:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    iput v0, p1, LA/x;->b:I

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p1, LA/x;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LL7/b;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, LL7/b;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_0
    monitor-exit p1

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, Lsb/a;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v2, LG6/L;->b:I

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "Failed to generate query info for the tagging library, error: "

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, LH6/l;->f(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/ads/zzblc;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-object v3, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, LN6/a;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    iget-object v2, v3, LN6/a;->k:LN6/b;

    .line 42
    .line 43
    invoke-virtual {v2}, LN6/b;->b()Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v4, ",\"as\":"

    .line 52
    .line 53
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const-string v2, ""

    .line 59
    .line 60
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    sget-object v5, Lcom/google/android/gms/internal/ads/zzblc;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_1

    .line 77
    .line 78
    sget-object v6, Lcom/google/android/gms/internal/ads/zzblc;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    const-wide/16 v6, 0x0

    .line 92
    .line 93
    :goto_1
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v7, p0, Lsb/a;->b:Ljava/lang/String;

    .line 98
    .line 99
    const/4 v8, 0x4

    .line 100
    new-array v8, v8, [Ljava/lang/Object;

    .line 101
    .line 102
    aput-object v7, v8, v1

    .line 103
    .line 104
    aput-object p1, v8, v0

    .line 105
    .line 106
    const/4 p1, 0x2

    .line 107
    aput-object v6, v8, p1

    .line 108
    .line 109
    const/4 p1, 0x3

    .line 110
    aput-object v2, v8, p1

    .line 111
    .line 112
    const-string p1, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, \'*\');"

    .line 113
    .line 114
    invoke-static {v4, p1, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_2

    .line 129
    .line 130
    :try_start_0
    iget-object v0, v3, LN6/a;->h:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 131
    .line 132
    new-instance v2, LN6/t;

    .line 133
    .line 134
    invoke-direct {v2, p0, p1, v1}, LN6/t;-><init>(Lsb/a;Ljava/lang/String;I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :catch_0
    move-exception p1

    .line 142
    sget-object v0, LC6/n;->D:LC6/n;

    .line 143
    .line 144
    iget-object v0, v0, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 145
    .line 146
    const-string v2, "TaggingLibraryJsInterface.getQueryInfo.onFailure"

    .line 147
    .line 148
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    iget-object v0, v3, LN6/a;->b:Landroid/webkit/WebView;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-virtual {v0, p1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzblc;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_3

    .line 171
    .line 172
    sget-object p1, Lcom/google/android/gms/internal/ads/zzblc;->zzd:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_3

    .line 185
    .line 186
    iget-object p1, v3, LN6/a;->l:LN6/v;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance v0, LN6/u;

    .line 192
    .line 193
    invoke-direct {v0, p1, v1}, LN6/u;-><init>(LN6/v;I)V

    .line 194
    .line 195
    .line 196
    iget-object p1, p1, LN6/v;->b:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 197
    .line 198
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 199
    .line 200
    .line 201
    :cond_3
    return-void

    .line 202
    :pswitch_0
    invoke-direct {p0, p1}, Lsb/a;->a(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :pswitch_1
    iget-object v1, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Lba/a;

    .line 209
    .line 210
    iget-object v2, v1, Lba/a;->c:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v2, Lh9/c;

    .line 213
    .line 214
    iput-object p1, v2, Lh9/c;->b:Ljava/lang/String;

    .line 215
    .line 216
    iget-object p1, v1, Lba/a;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p1, LA/x;

    .line 219
    .line 220
    monitor-enter p1

    .line 221
    :try_start_1
    iget v1, p1, LA/x;->b:I

    .line 222
    .line 223
    sub-int/2addr v1, v0

    .line 224
    iput v1, p1, LA/x;->b:I

    .line 225
    .line 226
    if-gtz v1, :cond_4

    .line 227
    .line 228
    iget-object v0, p1, LA/x;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, LL7/b;

    .line 231
    .line 232
    if-eqz v0, :cond_4

    .line 233
    .line 234
    invoke-virtual {v0}, LL7/b;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    .line 236
    .line 237
    :cond_4
    monitor-exit p1

    .line 238
    return-void

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    throw v0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onSuccess(LQ6/a;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lsb/a;->a:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lsb/a;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, LN6/a;

    .line 13
    .line 14
    iget-object v4, p1, LQ6/a;->a:LD6/c1;

    .line 15
    .line 16
    iget-object v4, v4, LD6/c1;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v8, "paw_id"

    .line 26
    .line 27
    invoke-virtual {v7, v8, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    sget-object v8, Lcom/google/android/gms/internal/ads/zzblc;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 31
    .line 32
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    check-cast v8, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    const-string v8, "as"

    .line 45
    .line 46
    iget-object v9, v3, LN6/a;->k:LN6/b;

    .line 47
    .line 48
    invoke-virtual {v9}, LN6/b;->b()Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    :cond_0
    const-string v8, "sdk_ttl_ms"

    .line 56
    .line 57
    sget-object v9, Lcom/google/android/gms/internal/ads/zzblc;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 58
    .line 59
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    sget-object v9, Lcom/google/android/gms/internal/ads/zzblc;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 72
    .line 73
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-wide v9, v5

    .line 85
    :goto_0
    invoke-virtual {v7, v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    const-string v8, "signal"

    .line 89
    .line 90
    invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    const-string v8, "window.postMessage(%1$s, \'*\');"

    .line 98
    .line 99
    new-array v9, v1, [Ljava/lang/Object;

    .line 100
    .line 101
    aput-object v7, v9, v0

    .line 102
    .line 103
    invoke-static {v4, v8, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    goto :goto_2

    .line 108
    :catch_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzblc;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 109
    .line 110
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    iget-object v4, v3, LN6/a;->k:LN6/b;

    .line 123
    .line 124
    invoke-virtual {v4}, LN6/b;->b()Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const-string v7, ",\"as\":"

    .line 133
    .line 134
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const-string v4, ""

    .line 140
    .line 141
    :goto_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    iget-object p1, p1, LQ6/a;->a:LD6/c1;

    .line 146
    .line 147
    sget-object v8, Lcom/google/android/gms/internal/ads/zzblc;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 148
    .line 149
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    check-cast v8, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_3

    .line 160
    .line 161
    sget-object v5, Lcom/google/android/gms/internal/ads/zzblc;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 162
    .line 163
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    check-cast v5, Ljava/lang/Long;

    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v5

    .line 173
    :cond_3
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iget-object p1, p1, LD6/c1;->a:Ljava/lang/String;

    .line 178
    .line 179
    const/4 v6, 0x4

    .line 180
    new-array v6, v6, [Ljava/lang/Object;

    .line 181
    .line 182
    aput-object v2, v6, v0

    .line 183
    .line 184
    aput-object p1, v6, v1

    .line 185
    .line 186
    const/4 p1, 0x2

    .line 187
    aput-object v5, v6, p1

    .line 188
    .line 189
    const/4 p1, 0x3

    .line 190
    aput-object v4, v6, p1

    .line 191
    .line 192
    const-string p1, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, \'*\');"

    .line 193
    .line 194
    invoke-static {v7, p1, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    :goto_2
    sget-object v2, Lcom/google/android/gms/internal/ads/zzblc;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 199
    .line 200
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-eqz v2, :cond_4

    .line 211
    .line 212
    :try_start_1
    iget-object v2, v3, LN6/a;->h:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 213
    .line 214
    new-instance v4, LN6/t;

    .line 215
    .line 216
    invoke-direct {v4, p0, p1, v1}, LN6/t;-><init>(Lsb/a;Ljava/lang/String;I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :catch_1
    move-exception p1

    .line 224
    sget-object v1, LC6/n;->D:LC6/n;

    .line 225
    .line 226
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 227
    .line 228
    const-string v2, "TaggingLibraryJsInterface.getQueryInfo.onSuccess"

    .line 229
    .line 230
    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_4
    iget-object v1, v3, LN6/a;->b:Landroid/webkit/WebView;

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    invoke-virtual {v1, p1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 238
    .line 239
    .line 240
    :goto_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzblc;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_5

    .line 253
    .line 254
    sget-object p1, Lcom/google/android/gms/internal/ads/zzblc;->zzd:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 255
    .line 256
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    check-cast p1, Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_5

    .line 267
    .line 268
    iget-object p1, v3, LN6/a;->l:LN6/v;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    new-instance v1, LN6/u;

    .line 274
    .line 275
    invoke-direct {v1, p1, v0}, LN6/u;-><init>(LN6/v;I)V

    .line 276
    .line 277
    .line 278
    iget-object p1, p1, LN6/v;->b:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 279
    .line 280
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 281
    .line 282
    .line 283
    :cond_5
    return-void

    .line 284
    :pswitch_0
    invoke-direct {p0, p1}, Lsb/a;->b(LQ6/a;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_1
    iget-object p1, p1, LQ6/a;->a:LD6/c1;

    .line 289
    .line 290
    iget-object p1, p1, LD6/c1;->a:Ljava/lang/String;

    .line 291
    .line 292
    iget-object v0, p0, Lsb/a;->c:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lba/a;

    .line 295
    .line 296
    iget-object v2, p0, Lsb/a;->b:Ljava/lang/String;

    .line 297
    .line 298
    iget-object v3, v0, Lba/a;->c:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, Lh9/c;

    .line 301
    .line 302
    iget-object v3, v3, Lh9/c;->a:Ljava/util/HashMap;

    .line 303
    .line 304
    invoke-virtual {v3, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    iget-object p1, v0, Lba/a;->b:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast p1, LA/x;

    .line 310
    .line 311
    monitor-enter p1

    .line 312
    :try_start_2
    iget v0, p1, LA/x;->b:I

    .line 313
    .line 314
    sub-int/2addr v0, v1

    .line 315
    iput v0, p1, LA/x;->b:I

    .line 316
    .line 317
    if-gtz v0, :cond_6

    .line 318
    .line 319
    iget-object v0, p1, LA/x;->c:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, LL7/b;

    .line 322
    .line 323
    if-eqz v0, :cond_6

    .line 324
    .line 325
    invoke-virtual {v0}, LL7/b;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 326
    .line 327
    .line 328
    :cond_6
    monitor-exit p1

    .line 329
    return-void

    .line 330
    :catchall_0
    move-exception v0

    .line 331
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 332
    throw v0

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
