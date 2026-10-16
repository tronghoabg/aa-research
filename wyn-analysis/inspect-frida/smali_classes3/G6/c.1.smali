.class public final synthetic LG6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LG6/j;


# direct methods
.method public synthetic constructor <init>(LG6/j;I)V
    .locals 0

    .line 1
    iput p2, p0, LG6/c;->a:I

    iput-object p1, p0, LG6/c;->b:LG6/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 8

    .line 1
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, LC6/n;->D:LC6/n;

    .line 7
    .line 8
    iget-object v1, v1, LC6/n;->o:LG6/m;

    .line 9
    .line 10
    iget-object v2, v0, LG6/j;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, v0, LG6/j;->e:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, v0, LG6/j;->f:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1}, LG6/m;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    iget-object v0, v0, LG6/j;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3}, LG6/m;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v7, v1, LG6/m;->f:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v7

    .line 29
    :try_start_0
    iput-boolean v6, v1, LG6/m;->d:Z

    .line 30
    .line 31
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-virtual {v1}, LG6/m;->h()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3, v4, v2}, LG6/m;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    sget v2, LG6/L;->b:I

    .line 50
    .line 51
    const-string v2, "Device is linked for debug signals."

    .line 52
    .line 53
    invoke-static {v2}, LH6/l;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "The device is successfully linked for troubleshooting."

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x1

    .line 60
    invoke-virtual {v1, v0, v2, v3, v4}, LG6/m;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-virtual {v1, v0, v2, v3}, LG6/m;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, LG6/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    iget-object v1, p0, LG6/c;->b:LG6/j;

    .line 8
    .line 9
    iput v0, v1, LG6/j;->g:I

    .line 10
    .line 11
    invoke-virtual {v1}, LG6/j;->b()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v1, LC6/n;->D:LC6/n;

    .line 21
    .line 22
    iget-object v1, v1, LC6/n;->o:LG6/m;

    .line 23
    .line 24
    iget-object v0, v0, LG6/j;->a:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, LG6/m;->a(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v1, LC6/n;->D:LC6/n;

    .line 36
    .line 37
    iget-object v1, v1, LC6/n;->o:LG6/m;

    .line 38
    .line 39
    iget-object v0, v0, LG6/j;->a:Landroid/content/Context;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, LG6/m;->a(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_2
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 46
    .line 47
    iget-object v1, v0, LG6/j;->a:Landroid/content/Context;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LG6/j;->d(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    invoke-direct {p0}, LG6/c;->a()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_4
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v1, LC6/n;->D:LC6/n;

    .line 63
    .line 64
    iget-object v2, v1, LC6/n;->o:LG6/m;

    .line 65
    .line 66
    iget-object v3, v0, LG6/j;->a:Landroid/content/Context;

    .line 67
    .line 68
    iget-object v4, v0, LG6/j;->d:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, v0, LG6/j;->e:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzgc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 76
    .line 77
    sget-object v6, LD6/s;->e:LD6/s;

    .line 78
    .line 79
    iget-object v7, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 80
    .line 81
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v3, v5, v4, v0}, LG6/m;->k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v3, v5, v0}, LG6/m;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    const/4 v8, 0x1

    .line 104
    if-eqz v7, :cond_0

    .line 105
    .line 106
    sget v0, LG6/L;->b:I

    .line 107
    .line 108
    const-string v0, "Not linked for in app preview."

    .line 109
    .line 110
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 120
    .line 121
    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v5, "gct"

    .line 125
    .line 126
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const-string v9, "status"

    .line 131
    .line 132
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iput-object v7, v2, LG6/m;->c:Ljava/lang/String;

    .line 137
    .line 138
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbix;->zzkK:Lcom/google/android/gms/internal/ads/zzbio;

    .line 139
    .line 140
    iget-object v6, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 141
    .line 142
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    const/4 v7, 0x0

    .line 153
    if-eqz v6, :cond_4

    .line 154
    .line 155
    const-string v6, "0"

    .line 156
    .line 157
    iget-object v9, v2, LG6/m;->c:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-nez v6, :cond_1

    .line 164
    .line 165
    const-string v6, "2"

    .line 166
    .line 167
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_2

    .line 172
    .line 173
    :cond_1
    move v6, v8

    .line 174
    goto :goto_0

    .line 175
    :cond_2
    move v6, v7

    .line 176
    goto :goto_0

    .line 177
    :catch_0
    move-exception v0

    .line 178
    goto :goto_2

    .line 179
    :goto_0
    invoke-virtual {v2, v6}, LG6/m;->f(Z)V

    .line 180
    .line 181
    .line 182
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 183
    .line 184
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-nez v6, :cond_3

    .line 189
    .line 190
    const-string v6, ""

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_3
    move-object v6, v4

    .line 194
    :goto_1
    check-cast v1, LG6/O;

    .line 195
    .line 196
    invoke-virtual {v1, v6}, LG6/O;->h(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    .line 198
    .line 199
    :cond_4
    iget-object v1, v2, LG6/m;->f:Ljava/lang/Object;

    .line 200
    .line 201
    monitor-enter v1

    .line 202
    :try_start_1
    iput-object v5, v2, LG6/m;->b:Ljava/lang/String;

    .line 203
    .line 204
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 205
    iget-object v1, v2, LG6/m;->c:Ljava/lang/String;

    .line 206
    .line 207
    const-string v5, "2"

    .line 208
    .line 209
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_5

    .line 214
    .line 215
    sget v0, LG6/L;->b:I

    .line 216
    .line 217
    const-string v0, "Creative is not pushed for this device."

    .line 218
    .line 219
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v0, "There was no creative pushed from DFP to the device."

    .line 223
    .line 224
    invoke-virtual {v2, v3, v0, v7, v7}, LG6/m;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_5
    const-string v5, "1"

    .line 229
    .line 230
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_6

    .line 235
    .line 236
    sget v1, LG6/L;->b:I

    .line 237
    .line 238
    const-string v1, "The app is not linked for creative preview."

    .line 239
    .line 240
    invoke-static {v1}, LH6/l;->a(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v3, v4, v0}, LG6/m;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_6
    const-string v0, "0"

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_7

    .line 254
    .line 255
    sget v0, LG6/L;->b:I

    .line 256
    .line 257
    const-string v0, "Device is linked for in app preview."

    .line 258
    .line 259
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v0, "The device is successfully linked for creative preview."

    .line 263
    .line 264
    invoke-virtual {v2, v3, v0, v7, v8}, LG6/m;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 265
    .line 266
    .line 267
    goto :goto_4

    .line 268
    :catchall_0
    move-exception v0

    .line 269
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 270
    throw v0

    .line 271
    :goto_2
    sget v1, LG6/L;->b:I

    .line 272
    .line 273
    const-string v1, "Fail to get in app preview response json."

    .line 274
    .line 275
    invoke-static {v1, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    :goto_3
    const-string v0, "In-app preview failed to load because of a system error. Please try again later."

    .line 279
    .line 280
    invoke-virtual {v2, v3, v0, v8, v8}, LG6/m;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 281
    .line 282
    .line 283
    :cond_7
    :goto_4
    return-void

    .line 284
    :pswitch_5
    iget-object v0, p0, LG6/c;->b:LG6/j;

    .line 285
    .line 286
    iget-object v1, v0, LG6/j;->a:Landroid/content/Context;

    .line 287
    .line 288
    invoke-virtual {v0, v1}, LG6/j;->d(Landroid/content/Context;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
