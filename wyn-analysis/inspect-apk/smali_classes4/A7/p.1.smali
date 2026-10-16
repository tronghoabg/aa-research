.class public final LA7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LA7/p;->a:I

    iput-object p3, p0, LA7/p;->b:Ljava/lang/Object;

    iput-object p2, p0, LA7/p;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/d0;Lcom/google/android/gms/internal/measurement/zzbz;LA7/d0;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LA7/p;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/p;->b:Ljava/lang/Object;

    iput-object p1, p0, LA7/p;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LK8/l;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, LA7/p;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    iput-object p2, p0, LA7/p;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LA7/p;->a:I

    iput-object p1, p0, LA7/p;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/p;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/L1;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/L1;->Z()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/L1;->zzl()LA7/k0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, LA7/k0;->c0()V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, LA7/L1;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, LA7/L1;->p:Ljava/util/ArrayList;

    .line 25
    .line 26
    :cond_0
    iget-object v1, v0, LA7/L1;->p:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, LA7/p;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/Runnable;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LA7/L1;->b0()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, LB7/a;->c(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final c()V
    .locals 4

    .line 1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 2
    .line 3
    iget-object v0, v0, LC6/n;->k:Ln7/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, LA7/p;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    sub-long/2addr v0, v2

    .line 21
    const-string v2, "cld_r"

    .line 22
    .line 23
    iget-object v3, p0, LA7/p;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lcom/google/android/gms/internal/ads/zzdzt;

    .line 26
    .line 27
    invoke-static {v3, v2, v0, v1}, LA2/d;->R(Lcom/google/android/gms/internal/ads/zzdzt;Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final synthetic d()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD6/S0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lq7/a;

    .line 11
    .line 12
    invoke-static {v1}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    iget-object v0, v0, LD6/S0;->l:Lx6/j;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final e()V
    .locals 3

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LEf/n;

    .line 6
    .line 7
    iget-object v2, p0, LA7/p;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LEf/e0;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v0}, LEf/n;->C(LEf/A;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final synthetic f()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LF6/j;

    .line 4
    .line 5
    iget-object v0, v0, LF6/j;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LF6/l;

    .line 8
    .line 9
    iget-object v0, v0, LF6/l;->a:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final g()V
    .locals 7

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG6/O;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v2, "admob"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :try_start_0
    iget-object v3, v0, LG6/O;->a:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    :try_start_1
    iput-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    iput-object v2, v0, LG6/O;->g:Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted()Z

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 38
    .line 39
    const-string v2, "use_https"

    .line 40
    .line 41
    iget-boolean v4, v0, LG6/O;->h:Z

    .line 42
    .line 43
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iput-boolean v1, v0, LG6/O;->h:Z

    .line 48
    .line 49
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    const-string v2, "content_url_opted_out"

    .line 52
    .line 53
    iget-boolean v4, v0, LG6/O;->u:Z

    .line 54
    .line 55
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput-boolean v1, v0, LG6/O;->u:Z

    .line 60
    .line 61
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 62
    .line 63
    const-string v2, "content_url_hashes"

    .line 64
    .line 65
    iget-object v4, v0, LG6/O;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, v0, LG6/O;->i:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 74
    .line 75
    const-string v2, "gad_idless"

    .line 76
    .line 77
    iget-boolean v4, v0, LG6/O;->k:Z

    .line 78
    .line 79
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput-boolean v1, v0, LG6/O;->k:Z

    .line 84
    .line 85
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 86
    .line 87
    const-string v2, "content_vertical_opted_out"

    .line 88
    .line 89
    iget-boolean v4, v0, LG6/O;->v:Z

    .line 90
    .line 91
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iput-boolean v1, v0, LG6/O;->v:Z

    .line 96
    .line 97
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 98
    .line 99
    const-string v2, "content_vertical_hashes"

    .line 100
    .line 101
    iget-object v4, v0, LG6/O;->j:Ljava/lang/String;

    .line 102
    .line 103
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, v0, LG6/O;->j:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 110
    .line 111
    const-string v2, "version_code"

    .line 112
    .line 113
    iget v4, v0, LG6/O;->r:I

    .line 114
    .line 115
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iput v1, v0, LG6/O;->r:I

    .line 120
    .line 121
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbkp;->zzg:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 122
    .line 123
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_0

    .line 134
    .line 135
    sget-object v1, LD6/s;->e:LD6/s;

    .line 136
    .line 137
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzc()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_0

    .line 144
    .line 145
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcff;

    .line 146
    .line 147
    const-string v2, ""

    .line 148
    .line 149
    const-wide/16 v4, 0x0

    .line 150
    .line 151
    invoke-direct {v1, v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzcff;-><init>(Ljava/lang/String;J)V

    .line 152
    .line 153
    .line 154
    iput-object v1, v0, LG6/O;->n:Lcom/google/android/gms/internal/ads/zzcff;

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    goto/16 :goto_2

    .line 159
    .line 160
    :cond_0
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 161
    .line 162
    const-string v2, "app_settings_json"

    .line 163
    .line 164
    iget-object v4, v0, LG6/O;->n:Lcom/google/android/gms/internal/ads/zzcff;

    .line 165
    .line 166
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzcff;->zzd()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget-object v2, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 175
    .line 176
    const-string v4, "app_settings_last_update_ms"

    .line 177
    .line 178
    iget-object v5, v0, LG6/O;->n:Lcom/google/android/gms/internal/ads/zzcff;

    .line 179
    .line 180
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcff;->zzb()J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    invoke-interface {v2, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcff;

    .line 189
    .line 190
    invoke-direct {v2, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzcff;-><init>(Ljava/lang/String;J)V

    .line 191
    .line 192
    .line 193
    iput-object v2, v0, LG6/O;->n:Lcom/google/android/gms/internal/ads/zzcff;

    .line 194
    .line 195
    :goto_0
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 196
    .line 197
    const-string v2, "app_last_background_time_ms"

    .line 198
    .line 199
    iget-wide v4, v0, LG6/O;->o:J

    .line 200
    .line 201
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 202
    .line 203
    .line 204
    move-result-wide v1

    .line 205
    iput-wide v1, v0, LG6/O;->o:J

    .line 206
    .line 207
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 208
    .line 209
    const-string v2, "request_in_session_count"

    .line 210
    .line 211
    iget v4, v0, LG6/O;->q:I

    .line 212
    .line 213
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    iput v1, v0, LG6/O;->q:I

    .line 218
    .line 219
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 220
    .line 221
    const-string v2, "first_ad_req_time_ms"

    .line 222
    .line 223
    iget-wide v4, v0, LG6/O;->p:J

    .line 224
    .line 225
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v1

    .line 229
    iput-wide v1, v0, LG6/O;->p:J

    .line 230
    .line 231
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 232
    .line 233
    const-string v2, "never_pool_slots"

    .line 234
    .line 235
    iget-object v4, v0, LG6/O;->s:Ljava/util/Set;

    .line 236
    .line 237
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iput-object v1, v0, LG6/O;->s:Ljava/util/Set;

    .line 242
    .line 243
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 244
    .line 245
    const-string v2, "display_cutout"

    .line 246
    .line 247
    iget-object v4, v0, LG6/O;->w:Ljava/lang/String;

    .line 248
    .line 249
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iput-object v1, v0, LG6/O;->w:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 256
    .line 257
    const-string v2, "app_measurement_npa"

    .line 258
    .line 259
    iget v4, v0, LG6/O;->B:I

    .line 260
    .line 261
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    iput v1, v0, LG6/O;->B:I

    .line 266
    .line 267
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 268
    .line 269
    const-string v2, "sd_app_measure_npa"

    .line 270
    .line 271
    iget v4, v0, LG6/O;->C:I

    .line 272
    .line 273
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    iput v1, v0, LG6/O;->C:I

    .line 278
    .line 279
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 280
    .line 281
    const-string v2, "sd_app_measure_npa_ts"

    .line 282
    .line 283
    iget-wide v4, v0, LG6/O;->D:J

    .line 284
    .line 285
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v1

    .line 289
    iput-wide v1, v0, LG6/O;->D:J

    .line 290
    .line 291
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 292
    .line 293
    const-string v2, "inspector_info"

    .line 294
    .line 295
    iget-object v4, v0, LG6/O;->x:Ljava/lang/String;

    .line 296
    .line 297
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iput-object v1, v0, LG6/O;->x:Ljava/lang/String;

    .line 302
    .line 303
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 304
    .line 305
    const-string v2, "linked_device"

    .line 306
    .line 307
    iget-boolean v4, v0, LG6/O;->y:Z

    .line 308
    .line 309
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    iput-boolean v1, v0, LG6/O;->y:Z

    .line 314
    .line 315
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 316
    .line 317
    const-string v2, "linked_ad_unit"

    .line 318
    .line 319
    iget-object v4, v0, LG6/O;->z:Ljava/lang/String;

    .line 320
    .line 321
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iput-object v1, v0, LG6/O;->z:Ljava/lang/String;

    .line 326
    .line 327
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 328
    .line 329
    const-string v2, "inspector_ui_storage"

    .line 330
    .line 331
    iget-object v4, v0, LG6/O;->A:Ljava/lang/String;

    .line 332
    .line 333
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    iput-object v1, v0, LG6/O;->A:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 340
    .line 341
    const-string v2, "IABTCF_TCString"

    .line 342
    .line 343
    iget-object v4, v0, LG6/O;->l:Ljava/lang/String;

    .line 344
    .line 345
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    iput-object v1, v0, LG6/O;->l:Ljava/lang/String;

    .line 350
    .line 351
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 352
    .line 353
    const-string v2, "gad_has_consent_for_cookies"

    .line 354
    .line 355
    iget v4, v0, LG6/O;->m:I

    .line 356
    .line 357
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    iput v1, v0, LG6/O;->m:I

    .line 362
    .line 363
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 364
    .line 365
    const-string v2, "is_install_referrer_reported"

    .line 366
    .line 367
    iget-boolean v4, v0, LG6/O;->E:Z

    .line 368
    .line 369
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    iput-boolean v1, v0, LG6/O;->E:Z

    .line 374
    .line 375
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 376
    .line 377
    const-string v2, "total_inflight_ad_limit"

    .line 378
    .line 379
    iget v4, v0, LG6/O;->F:I

    .line 380
    .line 381
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iput v1, v0, LG6/O;->F:I

    .line 386
    .line 387
    iget-object v1, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 388
    .line 389
    const-string v2, "default_queue_capacity"

    .line 390
    .line 391
    iget v4, v0, LG6/O;->G:I

    .line 392
    .line 393
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    iput v1, v0, LG6/O;->G:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 398
    .line 399
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 400
    .line 401
    iget-object v2, v0, LG6/O;->f:Landroid/content/SharedPreferences;

    .line 402
    .line 403
    const-string v4, "native_advanced_settings"

    .line 404
    .line 405
    const-string v5, "{}"

    .line 406
    .line 407
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iput-object v1, v0, LG6/O;->t:Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 415
    .line 416
    goto :goto_1

    .line 417
    :catch_0
    move-exception v1

    .line 418
    :try_start_3
    const-string v2, "Could not convert native advanced settings to json object"

    .line 419
    .line 420
    sget v4, LG6/L;->b:I

    .line 421
    .line 422
    invoke-static {v2, v1}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    :goto_1
    invoke-virtual {v0}, LG6/O;->m()V

    .line 426
    .line 427
    .line 428
    monitor-exit v3

    .line 429
    goto :goto_3

    .line 430
    :goto_2
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 431
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 432
    :catchall_1
    move-exception v0

    .line 433
    const-string v1, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread"

    .line 434
    .line 435
    sget-object v2, LC6/n;->D:LC6/n;

    .line 436
    .line 437
    iget-object v2, v2, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 438
    .line 439
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    const-string v1, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = "

    .line 443
    .line 444
    invoke-static {v1, v0}, LG6/L;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    :goto_3
    return-void
.end method

.method private final h()V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LEf/n;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lp8/p;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LEf/n;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    :cond_0
    instance-of v1, v1, Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LEf/n;->a(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v2}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method private final i()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LU3/j;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/work/Worker;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/work/Worker;->getForegroundInfo()LJ3/j;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    invoke-virtual {v0, v1}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final j()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LPc/S;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LPc/S;->a(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final k()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ8/x;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls8/j;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LJ8/x;->onVerificationFailed(Ls8/j;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final l()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LPc/a;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LPc/a;->a(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final m()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    :try_start_0
    iget-object v1, p0, LA7/p;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    :try_start_1
    sget-object v2, Ljf/i;->a:Ljf/i;

    .line 12
    .line 13
    invoke-static {v2, v1}, LEf/H;->w(Ljf/h;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LJf/g;

    .line 19
    .line 20
    invoke-virtual {v1}, LJf/g;->z()Ljava/lang/Runnable;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iput-object v1, p0, LA7/p;->b:Ljava/lang/Object;

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    const/16 v1, 0x10

    .line 32
    .line 33
    if-lt v0, v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LJf/g;

    .line 38
    .line 39
    iget-object v2, v1, LJf/g;->c:LEf/A;

    .line 40
    .line 41
    invoke-static {v2, v1}, LJf/b;->j(LEf/A;Ljf/h;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v0, p0, LA7/p;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, LJf/g;

    .line 50
    .line 51
    iget-object v1, v0, LJf/g;->c:LEf/A;

    .line 52
    .line 53
    invoke-static {v1, v0, p0}, LJf/b;->i(LEf/A;Ljf/h;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, LJf/g;

    .line 61
    .line 62
    iget-object v2, v1, LJf/g;->f:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v2

    .line 65
    :try_start_2
    sget-object v3, LJf/g;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    .line 69
    .line 70
    monitor-exit v2

    .line 71
    throw v0

    .line 72
    :catchall_2
    move-exception v0

    .line 73
    monitor-exit v2

    .line 74
    throw v0
.end method

.method private final n()V
    .locals 5

    .line 1
    iget-object v0, p0, LA7/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK1/a;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, v0, LK1/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, LK1/a;->e:Lb7/d;

    .line 17
    .line 18
    iget-object v2, v1, Lb7/d;->i:LK1/a;

    .line 19
    .line 20
    if-ne v2, v0, :cond_4

    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    iput-object v3, v1, Lb7/d;->i:LK1/a;

    .line 26
    .line 27
    invoke-virtual {v1}, Lb7/d;->b()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v2, v0, LK1/a;->e:Lb7/d;

    .line 32
    .line 33
    iget-object v4, v2, Lb7/d;->h:LK1/a;

    .line 34
    .line 35
    if-eq v4, v0, :cond_1

    .line 36
    .line 37
    iget-object v1, v2, Lb7/d;->i:LK1/a;

    .line 38
    .line 39
    if-ne v1, v0, :cond_4

    .line 40
    .line 41
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 42
    .line 43
    .line 44
    iput-object v3, v2, Lb7/d;->i:LK1/a;

    .line 45
    .line 46
    invoke-virtual {v2}, Lb7/d;->b()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-boolean v4, v2, Lb7/d;->d:Z

    .line 51
    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 56
    .line 57
    .line 58
    iput-object v3, v2, Lb7/d;->h:LK1/a;

    .line 59
    .line 60
    iget-object v2, v2, Lb7/d;->a:LJ1/b;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-ne v3, v4, :cond_3

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Landroidx/lifecycle/D;->j(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {v2, v1}, Landroidx/lifecycle/D;->h(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_0
    const/4 v1, 0x3

    .line 82
    iput v1, v0, LK1/a;->b:I

    .line 83
    .line 84
    return-void
.end method

.method private final o()V
    .locals 4

    .line 1
    const-string v0, "Starting work for "

    .line 2
    .line 3
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LK3/s;

    .line 6
    .line 7
    iget-object v1, v1, LK3/s;->q:LU3/j;

    .line 8
    .line 9
    iget-object v1, v1, LU3/h;->a:Ljava/lang/Object;

    .line 10
    .line 11
    instance-of v1, v1, LU3/a;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    iget-object v1, p0, LA7/p;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LU3/j;

    .line 19
    .line 20
    invoke-virtual {v1}, LU3/h;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, LK3/s;->s:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LA7/p;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LK3/s;

    .line 37
    .line 38
    iget-object v0, v0, LK3/s;->e:LS3/p;

    .line 39
    .line 40
    iget-object v0, v0, LS3/p;->c:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v1, v2, v0}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, LA7/p;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LK3/s;

    .line 55
    .line 56
    iget-object v1, v0, LK3/s;->q:LU3/j;

    .line 57
    .line 58
    iget-object v0, v0, LK3/s;->f:LJ3/q;

    .line 59
    .line 60
    invoke-virtual {v0}, LJ3/q;->startWork()Lp8/p;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, LU3/j;->k(Lp8/p;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, LK3/s;

    .line 72
    .line 73
    iget-object v1, v1, LK3/s;->q:LU3/j;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 76
    .line 77
    .line 78
    :goto_0
    return-void
.end method

.method private final p()V
    .locals 7

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LA7/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LK3/s;

    .line 8
    .line 9
    :try_start_0
    iget-object v2, v1, LK3/s;->q:LU3/j;

    .line 10
    .line 11
    invoke-virtual {v2}, LU3/h;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LJ3/p;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, LK3/s;->s:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v5, v1, LK3/s;->e:LS3/p;

    .line 31
    .line 32
    iget-object v5, v5, LS3/p;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v5, " returned a null result. Treating it as a failure."

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v2, v3, v4}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_5

    .line 52
    :catch_0
    move-exception v2

    .line 53
    goto :goto_1

    .line 54
    :catch_1
    move-exception v2

    .line 55
    goto :goto_1

    .line 56
    :catch_2
    move-exception v2

    .line 57
    goto :goto_3

    .line 58
    :cond_0
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    sget-object v4, LK3/s;->s:Ljava/lang/String;

    .line 63
    .line 64
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v6, v1, LK3/s;->e:LS3/p;

    .line 70
    .line 71
    iget-object v6, v6, LS3/p;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v6, " returned a "

    .line 77
    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v6, "."

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v3, v4, v5}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, v1, LK3/s;->h:LJ3/p;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    :goto_0
    invoke-virtual {v1}, LK3/s;->b()V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :goto_1
    :try_start_1
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    sget-object v4, LK3/s;->s:Ljava/lang/String;

    .line 107
    .line 108
    new-instance v5, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, " failed because it threw an exception/error"

    .line 117
    .line 118
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v3, v4, v0, v2}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    .line 128
    :cond_1
    :goto_2
    invoke-virtual {v1}, LK3/s;->b()V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :goto_3
    :try_start_2
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    sget-object v4, LK3/s;->s:Ljava/lang/String;

    .line 137
    .line 138
    new-instance v5, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, " was cancelled"

    .line 147
    .line 148
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget v3, v3, LJ3/r;->a:I

    .line 156
    .line 157
    const/4 v5, 0x4

    .line 158
    if-gt v3, v5, :cond_1

    .line 159
    .line 160
    invoke-static {v4, v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :goto_4
    return-void

    .line 165
    :goto_5
    invoke-virtual {v1}, LK3/s;->b()V

    .line 166
    .line 167
    .line 168
    throw v0
.end method

.method private final q()V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/p;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->i(LJ8/o;Z)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, LK8/l;->f:Lh7/a;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v3, "Token refreshing started"

    .line 28
    .line 29
    invoke-virtual {v1, v3, v2}, Lh7/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, LK8/b;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-direct {v1, p0, v2}, LK8/b;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v2, 0x1e

    .line 4
    .line 5
    const-string v3, "dma_consent_settings"

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x1

    .line 12
    iget v0, v1, LA7/p;->a:I

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v2, LL3/a;->d:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "Scheduling work "

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v4, v1, LA7/p;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, LS3/p;

    .line 33
    .line 34
    iget-object v5, v4, LS3/p;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v0, v2, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LL3/a;

    .line 49
    .line 50
    iget-object v0, v0, LL3/a;->a:LL3/b;

    .line 51
    .line 52
    new-array v2, v8, [LS3/p;

    .line 53
    .line 54
    aput-object v4, v2, v7

    .line 55
    .line 56
    invoke-virtual {v0, v2}, LL3/b;->c([LS3/p;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    invoke-direct {v1}, LA7/p;->q()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    invoke-direct {v1}, LA7/p;->p()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    invoke-direct {v1}, LA7/p;->o()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_3
    invoke-direct {v1}, LA7/p;->n()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_4
    invoke-direct {v1}, LA7/p;->m()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_5
    invoke-direct {v1}, LA7/p;->l()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_6
    invoke-direct {v1}, LA7/p;->k()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_7
    invoke-direct {v1}, LA7/p;->j()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_8
    invoke-direct {v1}, LA7/p;->i()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_9
    invoke-direct {v1}, LA7/p;->h()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_a
    invoke-direct {v1}, LA7/p;->g()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_b
    invoke-direct {v1}, LA7/p;->f()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_c
    invoke-direct {v1}, LA7/p;->e()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_d
    invoke-direct {v1}, LA7/p;->d()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_e
    invoke-direct {v1}, LA7/p;->c()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_f
    invoke-direct {v1}, LA7/p;->b()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_10
    invoke-direct {v1}, LA7/p;->a()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_11
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, LA7/t1;

    .line 131
    .line 132
    iget-object v0, v0, LA7/t1;->c:LA7/m1;

    .line 133
    .line 134
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 135
    .line 136
    .line 137
    iget-object v2, v0, LA7/m1;->d:LA7/F;

    .line 138
    .line 139
    if-eqz v2, :cond_0

    .line 140
    .line 141
    iput-object v6, v0, LA7/m1;->d:LA7/F;

    .line 142
    .line 143
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v3, "Disconnected from device MeasurementService"

    .line 148
    .line 149
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 150
    .line 151
    iget-object v4, v1, LA7/p;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Landroid/content/ComponentName;

    .line 154
    .line 155
    invoke-virtual {v2, v3, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, LA7/m1;->p0()V

    .line 162
    .line 163
    .line 164
    :cond_0
    return-void

    .line 165
    :pswitch_12
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 166
    .line 167
    move-object v2, v0

    .line 168
    check-cast v2, LA7/m1;

    .line 169
    .line 170
    iget-object v3, v2, LA7/m1;->d:LA7/F;

    .line 171
    .line 172
    if-nez v3, :cond_1

    .line 173
    .line 174
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    const-string v2, "Failed to send current screen to service"

    .line 179
    .line 180
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 181
    .line 182
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_1
    :try_start_0
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, LA7/j1;

    .line 189
    .line 190
    if-nez v0, :cond_2

    .line 191
    .line 192
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, LA7/n0;

    .line 195
    .line 196
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    const-wide/16 v4, 0x0

    .line 203
    .line 204
    const/4 v6, 0x0

    .line 205
    const/4 v7, 0x0

    .line 206
    invoke-interface/range {v3 .. v8}, LA7/F;->h(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :catch_0
    move-exception v0

    .line 211
    goto :goto_1

    .line 212
    :cond_2
    iget-wide v4, v0, LA7/j1;->c:J

    .line 213
    .line 214
    iget-object v6, v0, LA7/j1;->a:Ljava/lang/String;

    .line 215
    .line 216
    iget-object v7, v0, LA7/j1;->b:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, LA7/n0;

    .line 221
    .line 222
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    invoke-interface/range {v3 .. v8}, LA7/F;->h(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_0
    invoke-virtual {v2}, LA7/m1;->v0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :goto_1
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const-string v3, "Failed to send current screen to the service"

    .line 240
    .line 241
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 242
    .line 243
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :goto_2
    return-void

    .line 247
    :pswitch_13
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 250
    .line 251
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LA7/n0;

    .line 252
    .line 253
    iget-object v0, v0, LA7/n0;->p:LA7/P0;

    .line 254
    .line 255
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 256
    .line 257
    .line 258
    iget-object v2, v1, LA7/p;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v2, LS3/c;

    .line 261
    .line 262
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 266
    .line 267
    .line 268
    iget-object v3, v0, LA7/P0;->d:LA7/K0;

    .line 269
    .line 270
    if-eq v2, v3, :cond_4

    .line 271
    .line 272
    if-nez v3, :cond_3

    .line 273
    .line 274
    move v7, v8

    .line 275
    :cond_3
    const-string v3, "EventInterceptor already set."

    .line 276
    .line 277
    invoke-static {v3, v7}, Lcom/google/android/gms/common/internal/v;->k(Ljava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    :cond_4
    iput-object v2, v0, LA7/P0;->d:LA7/K0;

    .line 281
    .line 282
    return-void

    .line 283
    :pswitch_14
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, LA7/P0;

    .line 286
    .line 287
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-interface {v4, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-static {v4}, LA7/o;->b(Ljava/lang/String;)LA7/o;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    iget-object v5, v1, LA7/p;->b:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v5, LA7/o;

    .line 312
    .line 313
    iget v4, v4, LA7/o;->a:I

    .line 314
    .line 315
    iget v6, v5, LA7/o;->a:I

    .line 316
    .line 317
    invoke-static {v6, v4}, LA7/F0;->h(II)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_7

    .line 322
    .line 323
    invoke-virtual {v2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iget-object v4, v5, LA7/o;->b:Ljava/lang/String;

    .line 332
    .line 333
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 334
    .line 335
    .line 336
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const-string v3, "Setting DMA consent(FE)"

    .line 344
    .line 345
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 346
    .line 347
    invoke-virtual {v2, v3, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, LA7/n0;

    .line 353
    .line 354
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    invoke-virtual {v2}, LA7/m1;->t0()Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-nez v3, :cond_5

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_5
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v2}, LA7/U1;->i1()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    const v3, 0x3ae30

    .line 374
    .line 375
    .line 376
    if-lt v2, v3, :cond_6

    .line 377
    .line 378
    :goto_3
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    new-instance v2, LA7/l1;

    .line 383
    .line 384
    invoke-direct {v2, v8}, LA7/l1;-><init>(I)V

    .line 385
    .line 386
    .line 387
    iput-object v0, v2, LA7/l1;->b:LA7/m1;

    .line 388
    .line 389
    invoke-virtual {v0, v2}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 390
    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_6
    invoke-virtual {v0}, LA7/n0;->m()LA7/m1;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v0, v7}, LA7/m1;->o0(Z)V

    .line 398
    .line 399
    .line 400
    goto :goto_4

    .line 401
    :cond_7
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    iget-object v0, v0, LA7/N;->l:LA7/P;

    .line 410
    .line 411
    const-string v3, "Lower precedence consent source ignored, proposed source"

    .line 412
    .line 413
    invoke-virtual {v0, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :goto_4
    return-void

    .line 417
    :pswitch_15
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, LA7/P0;

    .line 420
    .line 421
    iget-object v2, v1, LA7/p;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v2, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v0, v2, v8}, LA7/P0;->s0(Ljava/lang/Boolean;Z)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_16
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, LA7/P0;

    .line 432
    .line 433
    invoke-virtual {v0}, LA7/B;->g0()LA7/x1;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-virtual {v3}, LA7/Z;->n0()LA7/F0;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    sget-object v7, LA7/E0;->c:LA7/E0;

    .line 446
    .line 447
    invoke-virtual {v3, v7}, LA7/F0;->i(LA7/E0;)Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-nez v3, :cond_9

    .line 452
    .line 453
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const-string v3, "Analytics storage consent denied; will not get session id"

    .line 458
    .line 459
    iget-object v2, v2, LA7/N;->k:LA7/P;

    .line 460
    .line 461
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :cond_8
    :goto_5
    move-object v2, v6

    .line 465
    goto :goto_6

    .line 466
    :cond_9
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    iget-object v7, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v7, LA7/n0;

    .line 473
    .line 474
    iget-object v7, v7, LA7/n0;->n:Ln7/b;

    .line 475
    .line 476
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 480
    .line 481
    .line 482
    move-result-wide v7

    .line 483
    invoke-virtual {v3, v7, v8}, LA7/Z;->i0(J)Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-nez v3, :cond_8

    .line 488
    .line 489
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    iget-object v3, v3, LA7/Z;->r:LA7/a0;

    .line 494
    .line 495
    invoke-virtual {v3}, LA7/a0;->d()J

    .line 496
    .line 497
    .line 498
    move-result-wide v7

    .line 499
    cmp-long v3, v7, v4

    .line 500
    .line 501
    if-nez v3, :cond_a

    .line 502
    .line 503
    goto :goto_5

    .line 504
    :cond_a
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    iget-object v2, v2, LA7/Z;->r:LA7/a0;

    .line 509
    .line 510
    invoke-virtual {v2}, LA7/a0;->d()J

    .line 511
    .line 512
    .line 513
    move-result-wide v2

    .line 514
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    :goto_6
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 519
    .line 520
    move-object v3, v0

    .line 521
    check-cast v3, LA7/n0;

    .line 522
    .line 523
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzdo;

    .line 526
    .line 527
    if-eqz v2, :cond_b

    .line 528
    .line 529
    iget-object v3, v3, LA7/n0;->l:LA7/U1;

    .line 530
    .line 531
    invoke-static {v3}, LA7/n0;->c(LA7/B0;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 535
    .line 536
    .line 537
    move-result-wide v4

    .line 538
    invoke-virtual {v3, v0, v4, v5}, LA7/U1;->z0(Lcom/google/android/gms/internal/measurement/zzdo;J)V

    .line 539
    .line 540
    .line 541
    goto :goto_7

    .line 542
    :cond_b
    :try_start_1
    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/measurement/zzdo;->zza(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 543
    .line 544
    .line 545
    goto :goto_7

    .line 546
    :catch_1
    move-exception v0

    .line 547
    iget-object v2, v3, LA7/n0;->i:LA7/N;

    .line 548
    .line 549
    invoke-static {v2}, LA7/n0;->d(LA7/D0;)V

    .line 550
    .line 551
    .line 552
    const-string v3, "getSessionId failed with exception"

    .line 553
    .line 554
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 555
    .line 556
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    :goto_7
    return-void

    .line 560
    :pswitch_17
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, LA7/P0;

    .line 563
    .line 564
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, LA7/n0;

    .line 567
    .line 568
    invoke-virtual {v0}, LA7/n0;->j()LA7/I;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    iget-object v3, v2, LA7/I;->p:Ljava/lang/String;

    .line 573
    .line 574
    iget-object v4, v1, LA7/p;->c:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v4, Ljava/lang/String;

    .line 577
    .line 578
    if-eqz v3, :cond_c

    .line 579
    .line 580
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    if-nez v3, :cond_c

    .line 585
    .line 586
    move v7, v8

    .line 587
    :cond_c
    iput-object v4, v2, LA7/I;->p:Ljava/lang/String;

    .line 588
    .line 589
    if-eqz v7, :cond_d

    .line 590
    .line 591
    invoke-virtual {v0}, LA7/n0;->j()LA7/I;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, LA7/I;->m0()V

    .line 596
    .line 597
    .line 598
    :cond_d
    return-void

    .line 599
    :pswitch_18
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, LA7/P0;

    .line 602
    .line 603
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 604
    .line 605
    .line 606
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 607
    .line 608
    if-lt v3, v2, :cond_11

    .line 609
    .line 610
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v2}, LA7/Z;->m0()Landroid/util/SparseArray;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    iget-object v3, v1, LA7/p;->c:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v3, Ljava/util/List;

    .line 621
    .line 622
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    :cond_e
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 627
    .line 628
    .line 629
    move-result v4

    .line 630
    if-eqz v4, :cond_10

    .line 631
    .line 632
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    check-cast v4, LA7/E1;

    .line 637
    .line 638
    iget v5, v4, LA7/E1;->c:I

    .line 639
    .line 640
    invoke-static {v2, v5}, LA7/N0;->t(Landroid/util/SparseArray;I)Z

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    if-eqz v5, :cond_f

    .line 645
    .line 646
    iget v5, v4, LA7/E1;->c:I

    .line 647
    .line 648
    invoke-virtual {v2, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v5

    .line 652
    check-cast v5, Ljava/lang/Long;

    .line 653
    .line 654
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 655
    .line 656
    .line 657
    move-result-wide v5

    .line 658
    iget-wide v7, v4, LA7/E1;->b:J

    .line 659
    .line 660
    cmp-long v5, v5, v7

    .line 661
    .line 662
    if-gez v5, :cond_e

    .line 663
    .line 664
    :cond_f
    invoke-virtual {v0}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    invoke-virtual {v5, v4}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    goto :goto_8

    .line 672
    :cond_10
    invoke-virtual {v0}, LA7/P0;->D0()V

    .line 673
    .line 674
    .line 675
    :cond_11
    return-void

    .line 676
    :pswitch_19
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, LA7/s0;

    .line 679
    .line 680
    iget-object v2, v0, LA7/s0;->a:LA7/L1;

    .line 681
    .line 682
    invoke-virtual {v2}, LA7/L1;->Z()V

    .line 683
    .line 684
    .line 685
    iget-object v2, v1, LA7/p;->b:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v2, LA7/d;

    .line 688
    .line 689
    iget-object v3, v2, LA7/d;->c:LA7/R1;

    .line 690
    .line 691
    invoke-virtual {v3}, LA7/R1;->zza()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v3

    .line 695
    iget-object v0, v0, LA7/s0;->a:LA7/L1;

    .line 696
    .line 697
    if-nez v3, :cond_12

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    iget-object v3, v2, LA7/d;->a:Ljava/lang/String;

    .line 703
    .line 704
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v0, v3}, LA7/L1;->K(Ljava/lang/String;)LA7/N1;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    if-eqz v3, :cond_13

    .line 712
    .line 713
    invoke-virtual {v0, v2, v3}, LA7/L1;->i(LA7/d;LA7/N1;)V

    .line 714
    .line 715
    .line 716
    goto :goto_9

    .line 717
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    iget-object v3, v2, LA7/d;->a:Ljava/lang/String;

    .line 721
    .line 722
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v3}, LA7/L1;->K(Ljava/lang/String;)LA7/N1;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    if-eqz v3, :cond_13

    .line 730
    .line 731
    invoke-virtual {v0, v2, v3}, LA7/L1;->F(LA7/d;LA7/N1;)V

    .line 732
    .line 733
    .line 734
    :cond_13
    :goto_9
    return-void

    .line 735
    :pswitch_1a
    const-string v9, "admob_app_id"

    .line 736
    .line 737
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 738
    .line 739
    move-object v10, v0

    .line 740
    check-cast v10, LA7/n0;

    .line 741
    .line 742
    iget-object v0, v10, LA7/n0;->j:LA7/k0;

    .line 743
    .line 744
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 748
    .line 749
    .line 750
    new-instance v0, LA7/q;

    .line 751
    .line 752
    invoke-direct {v0, v10}, LA7/D0;-><init>(LA7/n0;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, LA7/D0;->f0()V

    .line 756
    .line 757
    .line 758
    iput-object v0, v10, LA7/n0;->v:LA7/q;

    .line 759
    .line 760
    new-instance v11, LA7/I;

    .line 761
    .line 762
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 763
    .line 764
    move-object v12, v0

    .line 765
    check-cast v12, LA7/L0;

    .line 766
    .line 767
    iget-wide v13, v12, LA7/L0;->f:J

    .line 768
    .line 769
    invoke-direct {v11, v10}, LA7/Y;-><init>(LA7/n0;)V

    .line 770
    .line 771
    .line 772
    iput-wide v4, v11, LA7/I;->o:J

    .line 773
    .line 774
    iput-object v6, v11, LA7/I;->p:Ljava/lang/String;

    .line 775
    .line 776
    iput-wide v13, v11, LA7/I;->h:J

    .line 777
    .line 778
    invoke-virtual {v11}, LA7/Y;->i0()V

    .line 779
    .line 780
    .line 781
    iput-object v11, v10, LA7/n0;->w:LA7/I;

    .line 782
    .line 783
    new-instance v0, LA7/H;

    .line 784
    .line 785
    invoke-direct {v0, v10}, LA7/H;-><init>(LA7/n0;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0}, LA7/Y;->i0()V

    .line 789
    .line 790
    .line 791
    iput-object v0, v10, LA7/n0;->t:LA7/H;

    .line 792
    .line 793
    new-instance v0, LA7/m1;

    .line 794
    .line 795
    invoke-direct {v0, v10}, LA7/m1;-><init>(LA7/n0;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0}, LA7/Y;->i0()V

    .line 799
    .line 800
    .line 801
    iput-object v0, v10, LA7/n0;->u:LA7/m1;

    .line 802
    .line 803
    iget-object v13, v10, LA7/n0;->l:LA7/U1;

    .line 804
    .line 805
    iget-boolean v0, v13, LA7/D0;->b:Z

    .line 806
    .line 807
    const-string v14, "Can\'t initialize twice"

    .line 808
    .line 809
    if-nez v0, :cond_5f

    .line 810
    .line 811
    invoke-virtual {v13}, LA7/B0;->c0()V

    .line 812
    .line 813
    .line 814
    new-instance v0, Ljava/security/SecureRandom;

    .line 815
    .line 816
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 820
    .line 821
    .line 822
    move-result-wide v15

    .line 823
    cmp-long v17, v15, v4

    .line 824
    .line 825
    if-nez v17, :cond_14

    .line 826
    .line 827
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 828
    .line 829
    .line 830
    move-result-wide v15

    .line 831
    cmp-long v0, v15, v4

    .line 832
    .line 833
    if-nez v0, :cond_14

    .line 834
    .line 835
    invoke-virtual {v13}, LA7/B0;->zzj()LA7/N;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    const-string v2, "Utils falling back to Random for random id"

    .line 840
    .line 841
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 842
    .line 843
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    :cond_14
    move-wide v4, v15

    .line 847
    iget-object v0, v13, LA7/U1;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 848
    .line 849
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 850
    .line 851
    .line 852
    iget-object v0, v13, LA7/B0;->a:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v0, LA7/n0;

    .line 855
    .line 856
    iget-object v0, v0, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 857
    .line 858
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 859
    .line 860
    .line 861
    iput-boolean v8, v13, LA7/D0;->b:Z

    .line 862
    .line 863
    iget-object v2, v10, LA7/n0;->h:LA7/Z;

    .line 864
    .line 865
    iget-boolean v0, v2, LA7/D0;->b:Z

    .line 866
    .line 867
    if-nez v0, :cond_5e

    .line 868
    .line 869
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v0, LA7/n0;

    .line 872
    .line 873
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 874
    .line 875
    const-string v4, "com.google.android.gms.measurement.prefs"

    .line 876
    .line 877
    invoke-virtual {v0, v4, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    iput-object v0, v2, LA7/Z;->c:Landroid/content/SharedPreferences;

    .line 882
    .line 883
    const-string v4, "has_been_opened"

    .line 884
    .line 885
    invoke-interface {v0, v4, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 886
    .line 887
    .line 888
    move-result v0

    .line 889
    iput-boolean v0, v2, LA7/Z;->s:Z

    .line 890
    .line 891
    if-nez v0, :cond_15

    .line 892
    .line 893
    iget-object v0, v2, LA7/Z;->c:Landroid/content/SharedPreferences;

    .line 894
    .line 895
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 900
    .line 901
    .line 902
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 903
    .line 904
    .line 905
    :cond_15
    new-instance v0, LA7/c0;

    .line 906
    .line 907
    sget-object v4, LA7/y;->d:LA7/D;

    .line 908
    .line 909
    invoke-virtual {v4, v6}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    check-cast v4, Ljava/lang/Long;

    .line 914
    .line 915
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 916
    .line 917
    .line 918
    move-result-wide v4

    .line 919
    const-wide/16 v6, 0x0

    .line 920
    .line 921
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 922
    .line 923
    .line 924
    move-result-wide v4

    .line 925
    invoke-direct {v0, v2, v4, v5}, LA7/c0;-><init>(LA7/Z;J)V

    .line 926
    .line 927
    .line 928
    iput-object v0, v2, LA7/Z;->f:LA7/c0;

    .line 929
    .line 930
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 931
    .line 932
    check-cast v0, LA7/n0;

    .line 933
    .line 934
    iget-object v0, v0, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 935
    .line 936
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 937
    .line 938
    .line 939
    iput-boolean v8, v2, LA7/D0;->b:Z

    .line 940
    .line 941
    iget-object v4, v10, LA7/n0;->w:LA7/I;

    .line 942
    .line 943
    iget-boolean v0, v4, LA7/Y;->b:Z

    .line 944
    .line 945
    if-nez v0, :cond_5d

    .line 946
    .line 947
    const-string v0, "string"

    .line 948
    .line 949
    iget-object v5, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v5, LA7/n0;

    .line 952
    .line 953
    iget-object v6, v5, LA7/n0;->a:Landroid/content/Context;

    .line 954
    .line 955
    iget-object v7, v5, LA7/n0;->s:Ljava/lang/String;

    .line 956
    .line 957
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v6

    .line 961
    iget-object v14, v5, LA7/n0;->a:Landroid/content/Context;

    .line 962
    .line 963
    invoke-virtual {v14}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 964
    .line 965
    .line 966
    move-result-object v15

    .line 967
    const-string v8, ""

    .line 968
    .line 969
    const-string v21, "unknown"

    .line 970
    .line 971
    const-string v22, "Unknown"

    .line 972
    .line 973
    const/high16 v23, -0x80000000

    .line 974
    .line 975
    if-nez v15, :cond_17

    .line 976
    .line 977
    move-object/from16 v24, v7

    .line 978
    .line 979
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 980
    .line 981
    .line 982
    move-result-object v7

    .line 983
    move-object/from16 v25, v11

    .line 984
    .line 985
    invoke-static {v6}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 986
    .line 987
    .line 988
    move-result-object v11

    .line 989
    iget-object v7, v7, LA7/N;->f:LA7/P;

    .line 990
    .line 991
    move-object/from16 v26, v14

    .line 992
    .line 993
    const-string v14, "PackageManager is null, app identity information might be inaccurate. appId"

    .line 994
    .line 995
    invoke-virtual {v7, v14, v11}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 996
    .line 997
    .line 998
    :cond_16
    :goto_a
    move-object/from16 v27, v15

    .line 999
    .line 1000
    :goto_b
    move-object/from16 v7, v21

    .line 1001
    .line 1002
    move-object/from16 v11, v22

    .line 1003
    .line 1004
    move/from16 v14, v23

    .line 1005
    .line 1006
    goto/16 :goto_11

    .line 1007
    .line 1008
    :cond_17
    move-object/from16 v24, v7

    .line 1009
    .line 1010
    move-object/from16 v25, v11

    .line 1011
    .line 1012
    move-object/from16 v26, v14

    .line 1013
    .line 1014
    :try_start_2
    invoke-virtual {v15, v6}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v21
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1018
    :goto_c
    move-object/from16 v7, v21

    .line 1019
    .line 1020
    goto :goto_d

    .line 1021
    :catch_2
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v7

    .line 1025
    invoke-static {v6}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v11

    .line 1029
    iget-object v7, v7, LA7/N;->f:LA7/P;

    .line 1030
    .line 1031
    const-string v14, "Error retrieving app installer package name. appId"

    .line 1032
    .line 1033
    invoke-virtual {v7, v14, v11}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_c

    .line 1037
    :goto_d
    if-nez v7, :cond_19

    .line 1038
    .line 1039
    const-string v7, "manual_install"

    .line 1040
    .line 1041
    :cond_18
    move-object/from16 v21, v7

    .line 1042
    .line 1043
    goto :goto_e

    .line 1044
    :cond_19
    const-string v11, "com.android.vending"

    .line 1045
    .line 1046
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v11

    .line 1050
    if-eqz v11, :cond_18

    .line 1051
    .line 1052
    move-object/from16 v21, v8

    .line 1053
    .line 1054
    :goto_e
    :try_start_3
    invoke-virtual/range {v26 .. v26}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v7

    .line 1058
    const/4 v11, 0x0

    .line 1059
    invoke-virtual {v15, v7, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v7

    .line 1063
    if-eqz v7, :cond_16

    .line 1064
    .line 1065
    iget-object v11, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 1066
    .line 1067
    invoke-virtual {v15, v11}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v11

    .line 1071
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v14

    .line 1075
    if-nez v14, :cond_1a

    .line 1076
    .line 1077
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v11
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_4

    .line 1081
    goto :goto_f

    .line 1082
    :cond_1a
    move-object/from16 v11, v22

    .line 1083
    .line 1084
    :goto_f
    :try_start_4
    iget-object v14, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_5

    .line 1085
    .line 1086
    :try_start_5
    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1087
    .line 1088
    move/from16 v23, v7

    .line 1089
    .line 1090
    move-object/from16 v22, v14

    .line 1091
    .line 1092
    goto :goto_a

    .line 1093
    :catch_3
    move-object/from16 v22, v14

    .line 1094
    .line 1095
    goto :goto_10

    .line 1096
    :catch_4
    move-object/from16 v11, v22

    .line 1097
    .line 1098
    :catch_5
    :goto_10
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v7

    .line 1102
    invoke-static {v6}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v14

    .line 1106
    iget-object v7, v7, LA7/N;->f:LA7/P;

    .line 1107
    .line 1108
    move-object/from16 v27, v15

    .line 1109
    .line 1110
    const-string v15, "Error retrieving package info. appId, appName"

    .line 1111
    .line 1112
    invoke-virtual {v7, v14, v15, v11}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_b

    .line 1116
    :goto_11
    iput-object v6, v4, LA7/I;->c:Ljava/lang/String;

    .line 1117
    .line 1118
    iput-object v7, v4, LA7/I;->f:Ljava/lang/String;

    .line 1119
    .line 1120
    iput-object v11, v4, LA7/I;->d:Ljava/lang/String;

    .line 1121
    .line 1122
    iput v14, v4, LA7/I;->e:I

    .line 1123
    .line 1124
    const-wide/16 v14, 0x0

    .line 1125
    .line 1126
    iput-wide v14, v4, LA7/I;->g:J

    .line 1127
    .line 1128
    iget-object v7, v5, LA7/n0;->b:Ljava/lang/String;

    .line 1129
    .line 1130
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v11

    .line 1134
    if-nez v11, :cond_1b

    .line 1135
    .line 1136
    const-string v11, "am"

    .line 1137
    .line 1138
    iget-object v14, v5, LA7/n0;->c:Ljava/lang/String;

    .line 1139
    .line 1140
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v11

    .line 1144
    if-eqz v11, :cond_1b

    .line 1145
    .line 1146
    const/4 v11, 0x1

    .line 1147
    goto :goto_12

    .line 1148
    :cond_1b
    const/4 v11, 0x0

    .line 1149
    :goto_12
    invoke-virtual {v5}, LA7/n0;->g()I

    .line 1150
    .line 1151
    .line 1152
    move-result v14

    .line 1153
    packed-switch v14, :pswitch_data_1

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v15

    .line 1160
    move-object/from16 v21, v6

    .line 1161
    .line 1162
    const-string v6, "App measurement disabled"

    .line 1163
    .line 1164
    iget-object v15, v15, LA7/N;->l:LA7/P;

    .line 1165
    .line 1166
    invoke-virtual {v15, v6}, LA7/P;->c(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v6

    .line 1173
    const-string v15, "Invalid scion state in identity"

    .line 1174
    .line 1175
    iget-object v6, v6, LA7/N;->g:LA7/P;

    .line 1176
    .line 1177
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1178
    .line 1179
    .line 1180
    goto/16 :goto_13

    .line 1181
    .line 1182
    :pswitch_1b
    move-object/from16 v21, v6

    .line 1183
    .line 1184
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v6

    .line 1188
    const-string v15, "App measurement disabled due to denied storage consent"

    .line 1189
    .line 1190
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1191
    .line 1192
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    goto/16 :goto_13

    .line 1196
    .line 1197
    :pswitch_1c
    move-object/from16 v21, v6

    .line 1198
    .line 1199
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v6

    .line 1203
    const-string v15, "App measurement disabled via the global data collection setting"

    .line 1204
    .line 1205
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1206
    .line 1207
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_13

    .line 1211
    :pswitch_1d
    move-object/from16 v21, v6

    .line 1212
    .line 1213
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v6

    .line 1217
    const-string v15, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    .line 1218
    .line 1219
    iget-object v6, v6, LA7/N;->k:LA7/P;

    .line 1220
    .line 1221
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    goto :goto_13

    .line 1225
    :pswitch_1e
    move-object/from16 v21, v6

    .line 1226
    .line 1227
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v6

    .line 1231
    const-string v15, "App measurement disabled via the init parameters"

    .line 1232
    .line 1233
    iget-object v6, v6, LA7/N;->n:LA7/P;

    .line 1234
    .line 1235
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    goto :goto_13

    .line 1239
    :pswitch_1f
    move-object/from16 v21, v6

    .line 1240
    .line 1241
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v6

    .line 1245
    const-string v15, "App measurement disabled via the manifest"

    .line 1246
    .line 1247
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1248
    .line 1249
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    goto :goto_13

    .line 1253
    :pswitch_20
    move-object/from16 v21, v6

    .line 1254
    .line 1255
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v6

    .line 1259
    const-string v15, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    .line 1260
    .line 1261
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1262
    .line 1263
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_13

    .line 1267
    :pswitch_21
    move-object/from16 v21, v6

    .line 1268
    .line 1269
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v6

    .line 1273
    const-string v15, "App measurement deactivated via the init parameters"

    .line 1274
    .line 1275
    iget-object v6, v6, LA7/N;->n:LA7/P;

    .line 1276
    .line 1277
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    goto :goto_13

    .line 1281
    :pswitch_22
    move-object/from16 v21, v6

    .line 1282
    .line 1283
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v6

    .line 1287
    const-string v15, "App measurement deactivated via the manifest"

    .line 1288
    .line 1289
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1290
    .line 1291
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    goto :goto_13

    .line 1295
    :pswitch_23
    move-object/from16 v21, v6

    .line 1296
    .line 1297
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v6

    .line 1301
    const-string v15, "App measurement collection enabled"

    .line 1302
    .line 1303
    iget-object v6, v6, LA7/N;->n:LA7/P;

    .line 1304
    .line 1305
    invoke-virtual {v6, v15}, LA7/P;->c(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    :goto_13
    if-nez v14, :cond_1c

    .line 1309
    .line 1310
    const/4 v6, 0x1

    .line 1311
    goto :goto_14

    .line 1312
    :cond_1c
    const/4 v6, 0x0

    .line 1313
    :goto_14
    iput-object v8, v4, LA7/I;->l:Ljava/lang/String;

    .line 1314
    .line 1315
    iput-object v8, v4, LA7/I;->m:Ljava/lang/String;

    .line 1316
    .line 1317
    if-eqz v11, :cond_1d

    .line 1318
    .line 1319
    iput-object v7, v4, LA7/I;->m:Ljava/lang/String;

    .line 1320
    .line 1321
    :cond_1d
    :try_start_6
    const-string v7, "google_app_id"

    .line 1322
    .line 1323
    invoke-virtual/range {v26 .. v26}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v11

    .line 1327
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v14

    .line 1331
    if-nez v14, :cond_1e

    .line 1332
    .line 1333
    move-object/from16 v14, v24

    .line 1334
    .line 1335
    goto :goto_15

    .line 1336
    :cond_1e
    invoke-static/range {v26 .. v26}, LA7/I0;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v14

    .line 1340
    :goto_15
    invoke-virtual {v11, v7, v0, v14}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1341
    .line 1342
    .line 1343
    move-result v7
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_8

    .line 1344
    if-nez v7, :cond_1f

    .line 1345
    .line 1346
    :catch_6
    const/4 v15, 0x0

    .line 1347
    goto :goto_16

    .line 1348
    :cond_1f
    :try_start_7
    invoke-virtual {v11, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v15
    :try_end_7
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_7 .. :try_end_7} :catch_6
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_8

    .line 1352
    :goto_16
    :try_start_8
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v7

    .line 1356
    if-eqz v7, :cond_20

    .line 1357
    .line 1358
    goto :goto_17

    .line 1359
    :cond_20
    move-object v8, v15

    .line 1360
    :goto_17
    iput-object v8, v4, LA7/I;->l:Ljava/lang/String;

    .line 1361
    .line 1362
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1363
    .line 1364
    .line 1365
    move-result v7

    .line 1366
    if-nez v7, :cond_23

    .line 1367
    .line 1368
    invoke-virtual/range {v26 .. v26}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v7

    .line 1372
    invoke-static/range {v24 .. v24}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v8

    .line 1376
    if-nez v8, :cond_21

    .line 1377
    .line 1378
    move-object/from16 v8, v24

    .line 1379
    .line 1380
    goto :goto_18

    .line 1381
    :cond_21
    invoke-static/range {v26 .. v26}, LA7/I0;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v8

    .line 1385
    :goto_18
    invoke-virtual {v7, v9, v0, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1386
    .line 1387
    .line 1388
    move-result v0
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_8

    .line 1389
    if-nez v0, :cond_22

    .line 1390
    .line 1391
    :catch_7
    const/4 v15, 0x0

    .line 1392
    goto :goto_19

    .line 1393
    :cond_22
    :try_start_9
    invoke-virtual {v7, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v15
    :try_end_9
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_8

    .line 1397
    :goto_19
    :try_start_a
    iput-object v15, v4, LA7/I;->m:Ljava/lang/String;

    .line 1398
    .line 1399
    goto :goto_1a

    .line 1400
    :catch_8
    move-exception v0

    .line 1401
    goto :goto_1d

    .line 1402
    :cond_23
    :goto_1a
    if-eqz v6, :cond_25

    .line 1403
    .line 1404
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 1409
    .line 1410
    const-string v6, "App measurement enabled for app package, google app id"

    .line 1411
    .line 1412
    iget-object v7, v4, LA7/I;->c:Ljava/lang/String;

    .line 1413
    .line 1414
    iget-object v8, v4, LA7/I;->l:Ljava/lang/String;

    .line 1415
    .line 1416
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v8

    .line 1420
    if-eqz v8, :cond_24

    .line 1421
    .line 1422
    iget-object v8, v4, LA7/I;->m:Ljava/lang/String;

    .line 1423
    .line 1424
    goto :goto_1b

    .line 1425
    :cond_24
    iget-object v8, v4, LA7/I;->l:Ljava/lang/String;

    .line 1426
    .line 1427
    :goto_1b
    invoke-virtual {v0, v7, v6, v8}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_8

    .line 1428
    .line 1429
    .line 1430
    :cond_25
    :goto_1c
    const/4 v15, 0x0

    .line 1431
    goto :goto_1e

    .line 1432
    :goto_1d
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v6

    .line 1436
    invoke-static/range {v21 .. v21}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v7

    .line 1440
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 1441
    .line 1442
    const-string v8, "Fetching Google App Id failed with exception. appId"

    .line 1443
    .line 1444
    invoke-virtual {v6, v7, v8, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1445
    .line 1446
    .line 1447
    goto :goto_1c

    .line 1448
    :goto_1e
    iput-object v15, v4, LA7/I;->i:Ljava/util/List;

    .line 1449
    .line 1450
    iget-object v6, v5, LA7/n0;->g:LA7/e;

    .line 1451
    .line 1452
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1453
    .line 1454
    .line 1455
    const-string v0, "analytics.safelisted_events"

    .line 1456
    .line 1457
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v6}, LA7/e;->h0()Landroid/os/Bundle;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v7

    .line 1464
    if-nez v7, :cond_26

    .line 1465
    .line 1466
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v0

    .line 1470
    const-string v7, "Failed to load metadata: Metadata bundle is null"

    .line 1471
    .line 1472
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 1473
    .line 1474
    invoke-virtual {v0, v7}, LA7/P;->c(Ljava/lang/String;)V

    .line 1475
    .line 1476
    .line 1477
    :goto_1f
    const/4 v0, 0x0

    .line 1478
    goto :goto_20

    .line 1479
    :cond_26
    invoke-virtual {v7, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v8

    .line 1483
    if-nez v8, :cond_27

    .line 1484
    .line 1485
    goto :goto_1f

    .line 1486
    :cond_27
    invoke-virtual {v7, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1487
    .line 1488
    .line 1489
    move-result v0

    .line 1490
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    :goto_20
    if-nez v0, :cond_28

    .line 1495
    .line 1496
    :goto_21
    const/4 v0, 0x0

    .line 1497
    goto :goto_22

    .line 1498
    :cond_28
    :try_start_b
    iget-object v7, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 1499
    .line 1500
    check-cast v7, LA7/n0;

    .line 1501
    .line 1502
    iget-object v7, v7, LA7/n0;->a:Landroid/content/Context;

    .line 1503
    .line 1504
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v7

    .line 1508
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1509
    .line 1510
    .line 1511
    move-result v0

    .line 1512
    invoke-virtual {v7, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    if-nez v0, :cond_29

    .line 1517
    .line 1518
    goto :goto_21

    .line 1519
    :cond_29
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v0
    :try_end_b
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_b .. :try_end_b} :catch_9

    .line 1523
    goto :goto_22

    .line 1524
    :catch_9
    move-exception v0

    .line 1525
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v6

    .line 1529
    const-string v7, "Failed to load string array from metadata: resource not found"

    .line 1530
    .line 1531
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 1532
    .line 1533
    invoke-virtual {v6, v7, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    goto :goto_21

    .line 1537
    :goto_22
    if-eqz v0, :cond_2c

    .line 1538
    .line 1539
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1540
    .line 1541
    .line 1542
    move-result v6

    .line 1543
    if-eqz v6, :cond_2a

    .line 1544
    .line 1545
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    const-string v6, "Safelisted event list is empty. Ignoring"

    .line 1550
    .line 1551
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 1552
    .line 1553
    invoke-virtual {v0, v6}, LA7/P;->c(Ljava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    goto :goto_23

    .line 1557
    :cond_2a
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v6

    .line 1561
    :cond_2b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1562
    .line 1563
    .line 1564
    move-result v7

    .line 1565
    if-eqz v7, :cond_2c

    .line 1566
    .line 1567
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v7

    .line 1571
    check-cast v7, Ljava/lang/String;

    .line 1572
    .line 1573
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v8

    .line 1577
    const-string v11, "safelisted event"

    .line 1578
    .line 1579
    invoke-virtual {v8, v11, v7}, LA7/U1;->b1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v7

    .line 1583
    if-nez v7, :cond_2b

    .line 1584
    .line 1585
    goto :goto_23

    .line 1586
    :cond_2c
    iput-object v0, v4, LA7/I;->i:Ljava/util/List;

    .line 1587
    .line 1588
    :goto_23
    if-eqz v27, :cond_2d

    .line 1589
    .line 1590
    invoke-static/range {v26 .. v26}, Lp7/b;->H(Landroid/content/Context;)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v0

    .line 1594
    iput v0, v4, LA7/I;->k:I

    .line 1595
    .line 1596
    goto :goto_24

    .line 1597
    :cond_2d
    const/4 v11, 0x0

    .line 1598
    iput v11, v4, LA7/I;->k:I

    .line 1599
    .line 1600
    :goto_24
    iget-object v0, v5, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1601
    .line 1602
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 1603
    .line 1604
    .line 1605
    const/4 v5, 0x1

    .line 1606
    iput-boolean v5, v4, LA7/Y;->b:Z

    .line 1607
    .line 1608
    iget-object v0, v10, LA7/n0;->i:LA7/N;

    .line 1609
    .line 1610
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1611
    .line 1612
    .line 1613
    const-wide/32 v4, 0x19e10

    .line 1614
    .line 1615
    .line 1616
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v4

    .line 1620
    iget-object v5, v0, LA7/N;->l:LA7/P;

    .line 1621
    .line 1622
    const-string v6, "App measurement initialized, version"

    .line 1623
    .line 1624
    invoke-virtual {v5, v6, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1625
    .line 1626
    .line 1627
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1628
    .line 1629
    .line 1630
    const-string v4, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    .line 1631
    .line 1632
    invoke-virtual {v5, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual/range {v25 .. v25}, LA7/I;->k0()Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v4

    .line 1639
    iget-object v6, v10, LA7/n0;->b:Ljava/lang/String;

    .line 1640
    .line 1641
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1642
    .line 1643
    .line 1644
    move-result v6

    .line 1645
    iget-object v7, v10, LA7/n0;->g:LA7/e;

    .line 1646
    .line 1647
    if-eqz v6, :cond_2f

    .line 1648
    .line 1649
    iget-object v6, v7, LA7/e;->c:Ljava/lang/String;

    .line 1650
    .line 1651
    invoke-virtual {v13, v4, v6}, LA7/U1;->f1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1652
    .line 1653
    .line 1654
    move-result v6

    .line 1655
    if-eqz v6, :cond_2e

    .line 1656
    .line 1657
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1658
    .line 1659
    .line 1660
    const-string v4, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    .line 1661
    .line 1662
    invoke-virtual {v5, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 1663
    .line 1664
    .line 1665
    goto :goto_25

    .line 1666
    :cond_2e
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1667
    .line 1668
    .line 1669
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1670
    .line 1671
    const-string v8, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    .line 1672
    .line 1673
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v4

    .line 1683
    invoke-virtual {v5, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 1684
    .line 1685
    .line 1686
    :cond_2f
    :goto_25
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1687
    .line 1688
    .line 1689
    const-string v4, "Debug-level message logging enabled"

    .line 1690
    .line 1691
    iget-object v5, v0, LA7/N;->m:LA7/P;

    .line 1692
    .line 1693
    invoke-virtual {v5, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 1694
    .line 1695
    .line 1696
    iget v4, v10, LA7/n0;->E:I

    .line 1697
    .line 1698
    iget-object v5, v10, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1699
    .line 1700
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1701
    .line 1702
    .line 1703
    move-result v6

    .line 1704
    if-eq v4, v6, :cond_30

    .line 1705
    .line 1706
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 1707
    .line 1708
    .line 1709
    iget v4, v10, LA7/n0;->E:I

    .line 1710
    .line 1711
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v4

    .line 1715
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1716
    .line 1717
    .line 1718
    move-result v5

    .line 1719
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v5

    .line 1723
    iget-object v6, v0, LA7/N;->f:LA7/P;

    .line 1724
    .line 1725
    const-string v8, "Not all components initialized"

    .line 1726
    .line 1727
    invoke-virtual {v6, v4, v8, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1728
    .line 1729
    .line 1730
    :cond_30
    const/4 v5, 0x1

    .line 1731
    iput-boolean v5, v10, LA7/n0;->x:Z

    .line 1732
    .line 1733
    iget-object v4, v12, LA7/L0;->g:Lcom/google/android/gms/internal/measurement/zzdw;

    .line 1734
    .line 1735
    iget-object v5, v10, LA7/n0;->j:LA7/k0;

    .line 1736
    .line 1737
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v5}, LA7/k0;->c0()V

    .line 1741
    .line 1742
    .line 1743
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 1744
    .line 1745
    .line 1746
    move-result v5

    .line 1747
    const-wide/16 v11, 0x1

    .line 1748
    .line 1749
    if-eqz v5, :cond_31

    .line 1750
    .line 1751
    sget-object v5, LA7/y;->I0:LA7/D;

    .line 1752
    .line 1753
    const/4 v15, 0x0

    .line 1754
    invoke-virtual {v7, v15, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1755
    .line 1756
    .line 1757
    move-result v5

    .line 1758
    if-eqz v5, :cond_31

    .line 1759
    .line 1760
    invoke-static {v13}, LA7/n0;->c(LA7/B0;)V

    .line 1761
    .line 1762
    .line 1763
    invoke-virtual {v13}, LA7/B0;->c0()V

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v13}, LA7/U1;->n1()J

    .line 1767
    .line 1768
    .line 1769
    move-result-wide v5

    .line 1770
    cmp-long v5, v5, v11

    .line 1771
    .line 1772
    if-nez v5, :cond_31

    .line 1773
    .line 1774
    invoke-virtual {v13}, LA7/B0;->c0()V

    .line 1775
    .line 1776
    .line 1777
    new-instance v5, Landroid/content/IntentFilter;

    .line 1778
    .line 1779
    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 1780
    .line 1781
    .line 1782
    const-string v6, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 1783
    .line 1784
    invoke-virtual {v5, v6}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1785
    .line 1786
    .line 1787
    new-instance v6, LA7/V1;

    .line 1788
    .line 1789
    iget-object v8, v13, LA7/B0;->a:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v8, LA7/n0;

    .line 1792
    .line 1793
    invoke-direct {v6, v8}, LA7/V1;-><init>(LA7/n0;)V

    .line 1794
    .line 1795
    .line 1796
    iget-object v8, v8, LA7/n0;->a:Landroid/content/Context;

    .line 1797
    .line 1798
    const/4 v14, 0x2

    .line 1799
    invoke-static {v8, v6, v5, v14}, LY0/e;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 1800
    .line 1801
    .line 1802
    invoke-virtual {v13}, LA7/B0;->zzj()LA7/N;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v5

    .line 1806
    const-string v6, "Registered app receiver"

    .line 1807
    .line 1808
    iget-object v5, v5, LA7/N;->m:LA7/P;

    .line 1809
    .line 1810
    invoke-virtual {v5, v6}, LA7/P;->c(Ljava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    :cond_31
    invoke-static {v2}, LA7/n0;->c(LA7/B0;)V

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v2}, LA7/Z;->n0()LA7/F0;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v5

    .line 1820
    const-string v6, "google_analytics_default_allow_ad_storage"

    .line 1821
    .line 1822
    const/4 v8, 0x0

    .line 1823
    invoke-virtual {v7, v6, v8}, LA7/e;->k0(Ljava/lang/String;Z)LA7/H0;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v6

    .line 1827
    const-string v14, "google_analytics_default_allow_analytics_storage"

    .line 1828
    .line 1829
    invoke-virtual {v7, v14, v8}, LA7/e;->k0(Ljava/lang/String;Z)LA7/H0;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v14

    .line 1833
    move-wide/from16 v28, v11

    .line 1834
    .line 1835
    sget-object v11, LA7/H0;->b:LA7/H0;

    .line 1836
    .line 1837
    sget-object v12, LA7/E0;->c:LA7/E0;

    .line 1838
    .line 1839
    const-string v8, "consent_source"

    .line 1840
    .line 1841
    const-class v15, LA7/E0;

    .line 1842
    .line 1843
    move-object/from16 v30, v2

    .line 1844
    .line 1845
    iget-wide v1, v10, LA7/n0;->H:J

    .line 1846
    .line 1847
    move-object/from16 v31, v9

    .line 1848
    .line 1849
    iget-object v9, v10, LA7/n0;->p:LA7/P0;

    .line 1850
    .line 1851
    if-ne v6, v11, :cond_32

    .line 1852
    .line 1853
    if-eq v14, v11, :cond_33

    .line 1854
    .line 1855
    :cond_32
    move-object/from16 v32, v10

    .line 1856
    .line 1857
    goto :goto_26

    .line 1858
    :cond_33
    move-object/from16 v32, v10

    .line 1859
    .line 1860
    move-object/from16 v33, v13

    .line 1861
    .line 1862
    goto :goto_27

    .line 1863
    :goto_26
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v10

    .line 1867
    move-object/from16 v33, v13

    .line 1868
    .line 1869
    const/16 v13, 0x64

    .line 1870
    .line 1871
    invoke-interface {v10, v8, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1872
    .line 1873
    .line 1874
    move-result v10

    .line 1875
    const/16 v13, -0xa

    .line 1876
    .line 1877
    invoke-static {v13, v10}, LA7/F0;->h(II)Z

    .line 1878
    .line 1879
    .line 1880
    move-result v10

    .line 1881
    if-eqz v10, :cond_34

    .line 1882
    .line 1883
    new-instance v8, Ljava/util/EnumMap;

    .line 1884
    .line 1885
    invoke-direct {v8, v15}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 1886
    .line 1887
    .line 1888
    sget-object v10, LA7/E0;->b:LA7/E0;

    .line 1889
    .line 1890
    invoke-virtual {v8, v10, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    invoke-virtual {v8, v12, v14}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1894
    .line 1895
    .line 1896
    new-instance v6, LA7/F0;

    .line 1897
    .line 1898
    invoke-direct {v6, v8, v13}, LA7/F0;-><init>(Ljava/util/EnumMap;I)V

    .line 1899
    .line 1900
    .line 1901
    const/4 v10, 0x0

    .line 1902
    goto/16 :goto_2b

    .line 1903
    .line 1904
    :cond_34
    :goto_27
    invoke-virtual/range {v32 .. v32}, LA7/n0;->j()LA7/I;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v6

    .line 1908
    invoke-virtual {v6}, LA7/I;->l0()Ljava/lang/String;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v6

    .line 1912
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v6

    .line 1916
    if-nez v6, :cond_35

    .line 1917
    .line 1918
    iget v6, v5, LA7/F0;->b:I

    .line 1919
    .line 1920
    if-eqz v6, :cond_36

    .line 1921
    .line 1922
    const/16 v10, 0x1e

    .line 1923
    .line 1924
    if-eq v6, v10, :cond_36

    .line 1925
    .line 1926
    const/16 v13, 0xa

    .line 1927
    .line 1928
    if-eq v6, v13, :cond_36

    .line 1929
    .line 1930
    if-eq v6, v10, :cond_36

    .line 1931
    .line 1932
    if-eq v6, v10, :cond_36

    .line 1933
    .line 1934
    const/16 v10, 0x28

    .line 1935
    .line 1936
    if-ne v6, v10, :cond_35

    .line 1937
    .line 1938
    goto :goto_28

    .line 1939
    :cond_35
    const/4 v10, 0x0

    .line 1940
    goto :goto_29

    .line 1941
    :cond_36
    :goto_28
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 1942
    .line 1943
    .line 1944
    new-instance v6, LA7/F0;

    .line 1945
    .line 1946
    const/16 v13, -0xa

    .line 1947
    .line 1948
    invoke-direct {v6, v13}, LA7/F0;-><init>(I)V

    .line 1949
    .line 1950
    .line 1951
    const/4 v10, 0x0

    .line 1952
    invoke-virtual {v9, v6, v1, v2, v10}, LA7/P0;->o0(LA7/F0;JZ)V

    .line 1953
    .line 1954
    .line 1955
    goto :goto_2a

    .line 1956
    :goto_29
    invoke-virtual/range {v32 .. v32}, LA7/n0;->j()LA7/I;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v6

    .line 1960
    invoke-virtual {v6}, LA7/I;->l0()Ljava/lang/String;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v6

    .line 1964
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1965
    .line 1966
    .line 1967
    move-result v6

    .line 1968
    if-eqz v6, :cond_38

    .line 1969
    .line 1970
    if-eqz v4, :cond_38

    .line 1971
    .line 1972
    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 1973
    .line 1974
    if-eqz v6, :cond_38

    .line 1975
    .line 1976
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v6

    .line 1980
    const/16 v13, 0x64

    .line 1981
    .line 1982
    invoke-interface {v6, v8, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1983
    .line 1984
    .line 1985
    move-result v6

    .line 1986
    const/16 v8, 0x1e

    .line 1987
    .line 1988
    invoke-static {v8, v6}, LA7/F0;->h(II)Z

    .line 1989
    .line 1990
    .line 1991
    move-result v6

    .line 1992
    if-eqz v6, :cond_38

    .line 1993
    .line 1994
    iget-object v6, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 1995
    .line 1996
    invoke-static {v8, v6}, LA7/F0;->b(ILandroid/os/Bundle;)LA7/F0;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v6

    .line 2000
    iget-object v8, v6, LA7/F0;->a:Ljava/util/EnumMap;

    .line 2001
    .line 2002
    invoke-virtual {v8}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v8

    .line 2006
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v8

    .line 2010
    :cond_37
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2011
    .line 2012
    .line 2013
    move-result v13

    .line 2014
    if-eqz v13, :cond_38

    .line 2015
    .line 2016
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v13

    .line 2020
    check-cast v13, LA7/H0;

    .line 2021
    .line 2022
    if-eq v13, v11, :cond_37

    .line 2023
    .line 2024
    goto :goto_2b

    .line 2025
    :cond_38
    :goto_2a
    const/4 v6, 0x0

    .line 2026
    :goto_2b
    if-eqz v6, :cond_39

    .line 2027
    .line 2028
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2029
    .line 2030
    .line 2031
    const/4 v5, 0x1

    .line 2032
    invoke-virtual {v9, v6, v1, v2, v5}, LA7/P0;->o0(LA7/F0;JZ)V

    .line 2033
    .line 2034
    .line 2035
    move-object v5, v6

    .line 2036
    :cond_39
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v9, v5}, LA7/P0;->n0(LA7/F0;)V

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v5

    .line 2049
    const/4 v6, 0x0

    .line 2050
    invoke-interface {v5, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v3

    .line 2054
    invoke-static {v3}, LA7/o;->b(Ljava/lang/String;)LA7/o;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v3

    .line 2058
    iget v3, v3, LA7/o;->a:I

    .line 2059
    .line 2060
    const-string v5, "google_analytics_default_allow_ad_personalization_signals"

    .line 2061
    .line 2062
    const/4 v6, 0x1

    .line 2063
    invoke-virtual {v7, v5, v6}, LA7/e;->k0(Ljava/lang/String;Z)LA7/H0;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v5

    .line 2067
    if-eq v5, v11, :cond_3a

    .line 2068
    .line 2069
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2070
    .line 2071
    .line 2072
    const-string v8, "Default ad personalization consent from Manifest"

    .line 2073
    .line 2074
    iget-object v13, v0, LA7/N;->n:LA7/P;

    .line 2075
    .line 2076
    invoke-virtual {v13, v8, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2077
    .line 2078
    .line 2079
    :cond_3a
    const-string v5, "google_analytics_default_allow_ad_user_data"

    .line 2080
    .line 2081
    invoke-virtual {v7, v5, v6}, LA7/e;->k0(Ljava/lang/String;Z)LA7/H0;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v5

    .line 2085
    iget-object v6, v9, LA7/B0;->a:Ljava/lang/Object;

    .line 2086
    .line 2087
    check-cast v6, LA7/n0;

    .line 2088
    .line 2089
    if-eq v5, v11, :cond_3c

    .line 2090
    .line 2091
    const/16 v13, -0xa

    .line 2092
    .line 2093
    invoke-static {v13, v3}, LA7/F0;->h(II)Z

    .line 2094
    .line 2095
    .line 2096
    move-result v8

    .line 2097
    if-eqz v8, :cond_3c

    .line 2098
    .line 2099
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2100
    .line 2101
    .line 2102
    new-instance v3, Ljava/util/EnumMap;

    .line 2103
    .line 2104
    invoke-direct {v3, v15}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 2105
    .line 2106
    .line 2107
    sget-object v4, LA7/E0;->d:LA7/E0;

    .line 2108
    .line 2109
    invoke-virtual {v3, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    new-instance v4, LA7/o;

    .line 2113
    .line 2114
    const/4 v15, 0x0

    .line 2115
    invoke-direct {v4, v3, v13, v15, v15}, LA7/o;-><init>(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V

    .line 2116
    .line 2117
    .line 2118
    const/4 v5, 0x1

    .line 2119
    invoke-virtual {v9, v4, v5}, LA7/P0;->m0(LA7/o;Z)V

    .line 2120
    .line 2121
    .line 2122
    :cond_3b
    :goto_2c
    move-object v4, v9

    .line 2123
    move/from16 v25, v10

    .line 2124
    .line 2125
    move-object/from16 v3, v30

    .line 2126
    .line 2127
    goto/16 :goto_2d

    .line 2128
    .line 2129
    :cond_3c
    invoke-virtual/range {v32 .. v32}, LA7/n0;->j()LA7/I;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v5

    .line 2133
    invoke-virtual {v5}, LA7/I;->l0()Ljava/lang/String;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v5

    .line 2137
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2138
    .line 2139
    .line 2140
    move-result v5

    .line 2141
    if-nez v5, :cond_3e

    .line 2142
    .line 2143
    if-eqz v3, :cond_3d

    .line 2144
    .line 2145
    const/16 v8, 0x1e

    .line 2146
    .line 2147
    if-ne v3, v8, :cond_3e

    .line 2148
    .line 2149
    :cond_3d
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2150
    .line 2151
    .line 2152
    new-instance v3, LA7/o;

    .line 2153
    .line 2154
    const/16 v13, -0xa

    .line 2155
    .line 2156
    const/4 v15, 0x0

    .line 2157
    invoke-direct {v3, v13, v15, v15, v15}, LA7/o;-><init>(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 2158
    .line 2159
    .line 2160
    const/4 v5, 0x1

    .line 2161
    invoke-virtual {v9, v3, v5}, LA7/P0;->m0(LA7/o;Z)V

    .line 2162
    .line 2163
    .line 2164
    goto :goto_2c

    .line 2165
    :cond_3e
    invoke-virtual/range {v32 .. v32}, LA7/n0;->j()LA7/I;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v5

    .line 2169
    invoke-virtual {v5}, LA7/I;->l0()Ljava/lang/String;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v5

    .line 2173
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2174
    .line 2175
    .line 2176
    move-result v5

    .line 2177
    if-eqz v5, :cond_40

    .line 2178
    .line 2179
    if-eqz v4, :cond_40

    .line 2180
    .line 2181
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 2182
    .line 2183
    if-eqz v5, :cond_40

    .line 2184
    .line 2185
    const/16 v8, 0x1e

    .line 2186
    .line 2187
    invoke-static {v8, v3}, LA7/F0;->h(II)Z

    .line 2188
    .line 2189
    .line 2190
    move-result v3

    .line 2191
    if-eqz v3, :cond_40

    .line 2192
    .line 2193
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 2194
    .line 2195
    invoke-static {v8, v3}, LA7/o;->a(ILandroid/os/Bundle;)LA7/o;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v3

    .line 2199
    iget-object v5, v3, LA7/o;->e:Ljava/util/EnumMap;

    .line 2200
    .line 2201
    invoke-virtual {v5}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v5

    .line 2205
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v5

    .line 2209
    :cond_3f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2210
    .line 2211
    .line 2212
    move-result v8

    .line 2213
    if-eqz v8, :cond_40

    .line 2214
    .line 2215
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v8

    .line 2219
    check-cast v8, LA7/H0;

    .line 2220
    .line 2221
    if-eq v8, v11, :cond_3f

    .line 2222
    .line 2223
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2224
    .line 2225
    .line 2226
    const/4 v5, 0x1

    .line 2227
    invoke-virtual {v9, v3, v5}, LA7/P0;->m0(LA7/o;Z)V

    .line 2228
    .line 2229
    .line 2230
    :cond_40
    invoke-virtual/range {v32 .. v32}, LA7/n0;->j()LA7/I;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v3

    .line 2234
    invoke-virtual {v3}, LA7/I;->l0()Ljava/lang/String;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v3

    .line 2238
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2239
    .line 2240
    .line 2241
    move-result v3

    .line 2242
    if-eqz v3, :cond_3b

    .line 2243
    .line 2244
    if-eqz v4, :cond_3b

    .line 2245
    .line 2246
    iget-object v3, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 2247
    .line 2248
    if-eqz v3, :cond_3b

    .line 2249
    .line 2250
    move-object/from16 v3, v30

    .line 2251
    .line 2252
    iget-object v5, v3, LA7/Z;->n:LA7/b0;

    .line 2253
    .line 2254
    invoke-virtual {v5}, LA7/b0;->u()Ljava/lang/String;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v5

    .line 2258
    if-nez v5, :cond_41

    .line 2259
    .line 2260
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 2261
    .line 2262
    invoke-static {v5}, LA7/o;->c(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v5

    .line 2266
    if-eqz v5, :cond_41

    .line 2267
    .line 2268
    invoke-static {v9}, LA7/n0;->b(LA7/Y;)V

    .line 2269
    .line 2270
    .line 2271
    iget-object v4, v4, Lcom/google/android/gms/internal/measurement/zzdw;->zze:Ljava/lang/String;

    .line 2272
    .line 2273
    invoke-virtual {v5}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 2274
    .line 2275
    .line 2276
    move-result-object v24

    .line 2277
    iget-object v5, v6, LA7/n0;->n:Ln7/b;

    .line 2278
    .line 2279
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2280
    .line 2281
    .line 2282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2283
    .line 2284
    .line 2285
    move-result-wide v26

    .line 2286
    const-string v23, "allow_personalized_ads"

    .line 2287
    .line 2288
    move-object/from16 v22, v4

    .line 2289
    .line 2290
    move-object/from16 v21, v9

    .line 2291
    .line 2292
    move/from16 v25, v10

    .line 2293
    .line 2294
    invoke-virtual/range {v21 .. v27}, LA7/P0;->x0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 2295
    .line 2296
    .line 2297
    move-object/from16 v4, v21

    .line 2298
    .line 2299
    goto :goto_2d

    .line 2300
    :cond_41
    move-object v4, v9

    .line 2301
    move/from16 v25, v10

    .line 2302
    .line 2303
    :goto_2d
    const-string v5, "google_analytics_tcf_data_enabled"

    .line 2304
    .line 2305
    invoke-virtual {v7, v5}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v5

    .line 2309
    if-nez v5, :cond_42

    .line 2310
    .line 2311
    const/4 v5, 0x1

    .line 2312
    goto :goto_2e

    .line 2313
    :cond_42
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2314
    .line 2315
    .line 2316
    move-result v5

    .line 2317
    :goto_2e
    if-eqz v5, :cond_44

    .line 2318
    .line 2319
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2320
    .line 2321
    .line 2322
    const-string v5, "TCF client enabled."

    .line 2323
    .line 2324
    iget-object v8, v0, LA7/N;->m:LA7/P;

    .line 2325
    .line 2326
    invoke-virtual {v8, v5}, LA7/P;->c(Ljava/lang/String;)V

    .line 2327
    .line 2328
    .line 2329
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 2330
    .line 2331
    .line 2332
    invoke-virtual {v4}, LA7/B;->c0()V

    .line 2333
    .line 2334
    .line 2335
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v5

    .line 2339
    const-string v8, "Register tcfPrefChangeListener."

    .line 2340
    .line 2341
    iget-object v5, v5, LA7/N;->m:LA7/P;

    .line 2342
    .line 2343
    invoke-virtual {v5, v8}, LA7/P;->c(Ljava/lang/String;)V

    .line 2344
    .line 2345
    .line 2346
    iget-object v5, v4, LA7/P0;->t:LA7/U0;

    .line 2347
    .line 2348
    if-nez v5, :cond_43

    .line 2349
    .line 2350
    new-instance v5, LA7/X0;

    .line 2351
    .line 2352
    const/4 v8, 0x1

    .line 2353
    invoke-direct {v5, v4, v6, v8}, LA7/X0;-><init>(LA7/P0;LA7/C0;I)V

    .line 2354
    .line 2355
    .line 2356
    iput-object v5, v4, LA7/P0;->u:LA7/X0;

    .line 2357
    .line 2358
    new-instance v5, LA7/U0;

    .line 2359
    .line 2360
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 2361
    .line 2362
    .line 2363
    iput-object v4, v5, LA7/U0;->a:LA7/P0;

    .line 2364
    .line 2365
    iput-object v5, v4, LA7/P0;->t:LA7/U0;

    .line 2366
    .line 2367
    :cond_43
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v5

    .line 2371
    invoke-virtual {v5}, LA7/Z;->k0()Landroid/content/SharedPreferences;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v5

    .line 2375
    iget-object v6, v4, LA7/P0;->t:LA7/U0;

    .line 2376
    .line 2377
    invoke-interface {v5, v6}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 2378
    .line 2379
    .line 2380
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 2381
    .line 2382
    .line 2383
    invoke-virtual {v4}, LA7/P0;->C0()V

    .line 2384
    .line 2385
    .line 2386
    :cond_44
    iget-object v5, v3, LA7/Z;->g:LA7/a0;

    .line 2387
    .line 2388
    invoke-virtual {v5}, LA7/a0;->d()J

    .line 2389
    .line 2390
    .line 2391
    move-result-wide v8

    .line 2392
    const-wide/16 v18, 0x0

    .line 2393
    .line 2394
    cmp-long v6, v8, v18

    .line 2395
    .line 2396
    if-nez v6, :cond_45

    .line 2397
    .line 2398
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2399
    .line 2400
    .line 2401
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v6

    .line 2405
    iget-object v8, v0, LA7/N;->n:LA7/P;

    .line 2406
    .line 2407
    const-string v9, "Persisting first open"

    .line 2408
    .line 2409
    invoke-virtual {v8, v9, v6}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2410
    .line 2411
    .line 2412
    invoke-virtual {v5, v1, v2}, LA7/a0;->f(J)V

    .line 2413
    .line 2414
    .line 2415
    :cond_45
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 2416
    .line 2417
    .line 2418
    iget-object v6, v4, LA7/P0;->q:LY9/c;

    .line 2419
    .line 2420
    invoke-virtual {v6}, LY9/c;->v()Z

    .line 2421
    .line 2422
    .line 2423
    move-result v8

    .line 2424
    if-eqz v8, :cond_46

    .line 2425
    .line 2426
    invoke-virtual {v6}, LY9/c;->w()Z

    .line 2427
    .line 2428
    .line 2429
    move-result v8

    .line 2430
    if-eqz v8, :cond_46

    .line 2431
    .line 2432
    iget-object v6, v6, LY9/c;->b:Ljava/lang/Object;

    .line 2433
    .line 2434
    check-cast v6, LA7/n0;

    .line 2435
    .line 2436
    iget-object v6, v6, LA7/n0;->h:LA7/Z;

    .line 2437
    .line 2438
    invoke-static {v6}, LA7/n0;->c(LA7/B0;)V

    .line 2439
    .line 2440
    .line 2441
    iget-object v6, v6, LA7/Z;->x:LA7/b0;

    .line 2442
    .line 2443
    const/4 v15, 0x0

    .line 2444
    invoke-virtual {v6, v15}, LA7/b0;->v(Ljava/lang/String;)V

    .line 2445
    .line 2446
    .line 2447
    :cond_46
    invoke-virtual/range {v32 .. v32}, LA7/n0;->f()Z

    .line 2448
    .line 2449
    .line 2450
    move-result v6

    .line 2451
    if-nez v6, :cond_4c

    .line 2452
    .line 2453
    invoke-virtual/range {v32 .. v32}, LA7/n0;->e()Z

    .line 2454
    .line 2455
    .line 2456
    move-result v1

    .line 2457
    if-eqz v1, :cond_4b

    .line 2458
    .line 2459
    invoke-static/range {v33 .. v33}, LA7/n0;->c(LA7/B0;)V

    .line 2460
    .line 2461
    .line 2462
    const-string v1, "android.permission.INTERNET"

    .line 2463
    .line 2464
    move-object/from16 v6, v33

    .line 2465
    .line 2466
    invoke-virtual {v6, v1}, LA7/U1;->g1(Ljava/lang/String;)Z

    .line 2467
    .line 2468
    .line 2469
    move-result v1

    .line 2470
    if-nez v1, :cond_47

    .line 2471
    .line 2472
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2473
    .line 2474
    .line 2475
    const-string v1, "App is missing INTERNET permission"

    .line 2476
    .line 2477
    iget-object v2, v0, LA7/N;->f:LA7/P;

    .line 2478
    .line 2479
    invoke-virtual {v2, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 2480
    .line 2481
    .line 2482
    :cond_47
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 2483
    .line 2484
    invoke-virtual {v6, v1}, LA7/U1;->g1(Ljava/lang/String;)Z

    .line 2485
    .line 2486
    .line 2487
    move-result v1

    .line 2488
    if-nez v1, :cond_48

    .line 2489
    .line 2490
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2491
    .line 2492
    .line 2493
    const-string v1, "App is missing ACCESS_NETWORK_STATE permission"

    .line 2494
    .line 2495
    iget-object v2, v0, LA7/N;->f:LA7/P;

    .line 2496
    .line 2497
    invoke-virtual {v2, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 2498
    .line 2499
    .line 2500
    :cond_48
    move-object/from16 v8, v32

    .line 2501
    .line 2502
    iget-object v1, v8, LA7/n0;->a:Landroid/content/Context;

    .line 2503
    .line 2504
    invoke-static {v1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v2

    .line 2508
    invoke-virtual {v2}, LE0/a;->e()Z

    .line 2509
    .line 2510
    .line 2511
    move-result v2

    .line 2512
    if-nez v2, :cond_4a

    .line 2513
    .line 2514
    invoke-virtual {v7}, LA7/e;->r0()Z

    .line 2515
    .line 2516
    .line 2517
    move-result v2

    .line 2518
    if-nez v2, :cond_4a

    .line 2519
    .line 2520
    invoke-static {v1}, LA7/U1;->K0(Landroid/content/Context;)Z

    .line 2521
    .line 2522
    .line 2523
    move-result v2

    .line 2524
    if-nez v2, :cond_49

    .line 2525
    .line 2526
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2527
    .line 2528
    .line 2529
    const-string v2, "AppMeasurementReceiver not registered/enabled"

    .line 2530
    .line 2531
    iget-object v5, v0, LA7/N;->f:LA7/P;

    .line 2532
    .line 2533
    invoke-virtual {v5, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 2534
    .line 2535
    .line 2536
    :cond_49
    invoke-static {v1}, LA7/U1;->V0(Landroid/content/Context;)Z

    .line 2537
    .line 2538
    .line 2539
    move-result v1

    .line 2540
    if-nez v1, :cond_4a

    .line 2541
    .line 2542
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2543
    .line 2544
    .line 2545
    const-string v1, "AppMeasurementService not registered/enabled"

    .line 2546
    .line 2547
    iget-object v2, v0, LA7/N;->f:LA7/P;

    .line 2548
    .line 2549
    invoke-virtual {v2, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 2550
    .line 2551
    .line 2552
    :cond_4a
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2553
    .line 2554
    .line 2555
    const-string v1, "Uploading is not possible. App measurement disabled"

    .line 2556
    .line 2557
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 2558
    .line 2559
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 2560
    .line 2561
    .line 2562
    :goto_2f
    move-object v2, v7

    .line 2563
    goto/16 :goto_38

    .line 2564
    .line 2565
    :cond_4b
    move-object/from16 v6, v33

    .line 2566
    .line 2567
    goto :goto_2f

    .line 2568
    :cond_4c
    move-object/from16 v8, v32

    .line 2569
    .line 2570
    move-object/from16 v6, v33

    .line 2571
    .line 2572
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2573
    .line 2574
    .line 2575
    move-result-object v9

    .line 2576
    invoke-virtual {v9}, LA7/I;->l0()Ljava/lang/String;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v9

    .line 2580
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2581
    .line 2582
    .line 2583
    move-result v9

    .line 2584
    iget-object v10, v3, LA7/Z;->h:LA7/b0;

    .line 2585
    .line 2586
    if-eqz v9, :cond_4e

    .line 2587
    .line 2588
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v9

    .line 2592
    invoke-virtual {v9}, LA7/Y;->h0()V

    .line 2593
    .line 2594
    .line 2595
    iget-object v9, v9, LA7/I;->m:Ljava/lang/String;

    .line 2596
    .line 2597
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2598
    .line 2599
    .line 2600
    move-result v9

    .line 2601
    if-nez v9, :cond_4d

    .line 2602
    .line 2603
    goto :goto_30

    .line 2604
    :cond_4d
    move-object/from16 v30, v3

    .line 2605
    .line 2606
    move-object/from16 v17, v7

    .line 2607
    .line 2608
    goto/16 :goto_32

    .line 2609
    .line 2610
    :cond_4e
    :goto_30
    invoke-virtual {v8}, LA7/n0;->n()V

    .line 2611
    .line 2612
    .line 2613
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v9

    .line 2617
    invoke-virtual {v9}, LA7/I;->l0()Ljava/lang/String;

    .line 2618
    .line 2619
    .line 2620
    move-result-object v9

    .line 2621
    invoke-virtual {v3}, LA7/B0;->c0()V

    .line 2622
    .line 2623
    .line 2624
    invoke-virtual {v3}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2625
    .line 2626
    .line 2627
    move-result-object v11

    .line 2628
    const-string v13, "gmp_app_id"

    .line 2629
    .line 2630
    const/4 v15, 0x0

    .line 2631
    invoke-interface {v11, v13, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v11

    .line 2635
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v14

    .line 2639
    invoke-virtual {v14}, LA7/Y;->h0()V

    .line 2640
    .line 2641
    .line 2642
    iget-object v14, v14, LA7/I;->m:Ljava/lang/String;

    .line 2643
    .line 2644
    invoke-virtual {v3}, LA7/B0;->c0()V

    .line 2645
    .line 2646
    .line 2647
    move-object/from16 v17, v7

    .line 2648
    .line 2649
    invoke-virtual {v3}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2650
    .line 2651
    .line 2652
    move-result-object v7

    .line 2653
    move-object/from16 v30, v3

    .line 2654
    .line 2655
    move-object/from16 v3, v31

    .line 2656
    .line 2657
    invoke-interface {v7, v3, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2658
    .line 2659
    .line 2660
    move-result-object v7

    .line 2661
    invoke-static {v9, v11, v14, v7}, LA7/U1;->Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 2662
    .line 2663
    .line 2664
    move-result v7

    .line 2665
    if-eqz v7, :cond_51

    .line 2666
    .line 2667
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2668
    .line 2669
    .line 2670
    const-string v7, "Rechecking which service to use due to a GMP App Id change"

    .line 2671
    .line 2672
    iget-object v9, v0, LA7/N;->l:LA7/P;

    .line 2673
    .line 2674
    invoke-virtual {v9, v7}, LA7/P;->c(Ljava/lang/String;)V

    .line 2675
    .line 2676
    .line 2677
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2678
    .line 2679
    .line 2680
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2681
    .line 2682
    .line 2683
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v7

    .line 2687
    const-string v9, "measurement_enabled"

    .line 2688
    .line 2689
    invoke-interface {v7, v9}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2690
    .line 2691
    .line 2692
    move-result v7

    .line 2693
    if-eqz v7, :cond_4f

    .line 2694
    .line 2695
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2696
    .line 2697
    .line 2698
    move-result-object v7

    .line 2699
    const/4 v11, 0x1

    .line 2700
    invoke-interface {v7, v9, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 2701
    .line 2702
    .line 2703
    move-result v7

    .line 2704
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2705
    .line 2706
    .line 2707
    move-result-object v7

    .line 2708
    goto :goto_31

    .line 2709
    :cond_4f
    const/4 v7, 0x0

    .line 2710
    :goto_31
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2711
    .line 2712
    .line 2713
    move-result-object v11

    .line 2714
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2715
    .line 2716
    .line 2717
    move-result-object v11

    .line 2718
    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 2719
    .line 2720
    .line 2721
    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2722
    .line 2723
    .line 2724
    if-eqz v7, :cond_50

    .line 2725
    .line 2726
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2727
    .line 2728
    .line 2729
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2730
    .line 2731
    .line 2732
    move-result-object v11

    .line 2733
    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v11

    .line 2737
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2738
    .line 2739
    .line 2740
    move-result v7

    .line 2741
    invoke-interface {v11, v9, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2742
    .line 2743
    .line 2744
    invoke-interface {v11}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2745
    .line 2746
    .line 2747
    :cond_50
    invoke-virtual {v8}, LA7/n0;->k()LA7/H;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v7

    .line 2751
    invoke-virtual {v7}, LA7/H;->m0()V

    .line 2752
    .line 2753
    .line 2754
    iget-object v7, v8, LA7/n0;->u:LA7/m1;

    .line 2755
    .line 2756
    invoke-virtual {v7}, LA7/m1;->q0()V

    .line 2757
    .line 2758
    .line 2759
    iget-object v7, v8, LA7/n0;->u:LA7/m1;

    .line 2760
    .line 2761
    invoke-virtual {v7}, LA7/m1;->p0()V

    .line 2762
    .line 2763
    .line 2764
    invoke-virtual {v5, v1, v2}, LA7/a0;->f(J)V

    .line 2765
    .line 2766
    .line 2767
    const/4 v15, 0x0

    .line 2768
    invoke-virtual {v10, v15}, LA7/b0;->v(Ljava/lang/String;)V

    .line 2769
    .line 2770
    .line 2771
    :cond_51
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v1

    .line 2775
    invoke-virtual {v1}, LA7/I;->l0()Ljava/lang/String;

    .line 2776
    .line 2777
    .line 2778
    move-result-object v1

    .line 2779
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2780
    .line 2781
    .line 2782
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v2

    .line 2786
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2787
    .line 2788
    .line 2789
    move-result-object v2

    .line 2790
    invoke-interface {v2, v13, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2791
    .line 2792
    .line 2793
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2794
    .line 2795
    .line 2796
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2797
    .line 2798
    .line 2799
    move-result-object v1

    .line 2800
    invoke-virtual {v1}, LA7/Y;->h0()V

    .line 2801
    .line 2802
    .line 2803
    iget-object v1, v1, LA7/I;->m:Ljava/lang/String;

    .line 2804
    .line 2805
    invoke-virtual/range {v30 .. v30}, LA7/B0;->c0()V

    .line 2806
    .line 2807
    .line 2808
    invoke-virtual/range {v30 .. v30}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 2809
    .line 2810
    .line 2811
    move-result-object v2

    .line 2812
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2813
    .line 2814
    .line 2815
    move-result-object v2

    .line 2816
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2817
    .line 2818
    .line 2819
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2820
    .line 2821
    .line 2822
    :goto_32
    invoke-virtual/range {v30 .. v30}, LA7/Z;->n0()LA7/F0;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v1

    .line 2826
    invoke-virtual {v1, v12}, LA7/F0;->i(LA7/E0;)Z

    .line 2827
    .line 2828
    .line 2829
    move-result v1

    .line 2830
    if-nez v1, :cond_52

    .line 2831
    .line 2832
    const/4 v15, 0x0

    .line 2833
    invoke-virtual {v10, v15}, LA7/b0;->v(Ljava/lang/String;)V

    .line 2834
    .line 2835
    .line 2836
    :cond_52
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 2837
    .line 2838
    .line 2839
    invoke-virtual {v10}, LA7/b0;->u()Ljava/lang/String;

    .line 2840
    .line 2841
    .line 2842
    move-result-object v1

    .line 2843
    invoke-virtual {v4, v1}, LA7/P0;->G0(Ljava/lang/String;)V

    .line 2844
    .line 2845
    .line 2846
    invoke-static {v6}, LA7/n0;->c(LA7/B0;)V

    .line 2847
    .line 2848
    .line 2849
    :try_start_c
    iget-object v1, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 2850
    .line 2851
    check-cast v1, LA7/n0;

    .line 2852
    .line 2853
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 2854
    .line 2855
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2856
    .line 2857
    .line 2858
    move-result-object v1

    .line 2859
    const-string v2, "com.google.firebase.remoteconfig.FirebaseRemoteConfig"

    .line 2860
    .line 2861
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_a

    .line 2862
    .line 2863
    .line 2864
    const/4 v1, 0x1

    .line 2865
    goto :goto_33

    .line 2866
    :catch_a
    move/from16 v1, v25

    .line 2867
    .line 2868
    :goto_33
    move-object/from16 v3, v30

    .line 2869
    .line 2870
    if-nez v1, :cond_53

    .line 2871
    .line 2872
    iget-object v1, v3, LA7/Z;->w:LA7/b0;

    .line 2873
    .line 2874
    invoke-virtual {v1}, LA7/b0;->u()Ljava/lang/String;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v2

    .line 2878
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2879
    .line 2880
    .line 2881
    move-result v2

    .line 2882
    if-nez v2, :cond_53

    .line 2883
    .line 2884
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 2885
    .line 2886
    .line 2887
    const-string v2, "Remote config removed with active feature rollouts"

    .line 2888
    .line 2889
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 2890
    .line 2891
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 2892
    .line 2893
    .line 2894
    const/4 v15, 0x0

    .line 2895
    invoke-virtual {v1, v15}, LA7/b0;->v(Ljava/lang/String;)V

    .line 2896
    .line 2897
    .line 2898
    :cond_53
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v0

    .line 2902
    invoke-virtual {v0}, LA7/I;->l0()Ljava/lang/String;

    .line 2903
    .line 2904
    .line 2905
    move-result-object v0

    .line 2906
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2907
    .line 2908
    .line 2909
    move-result v0

    .line 2910
    if-eqz v0, :cond_55

    .line 2911
    .line 2912
    invoke-virtual {v8}, LA7/n0;->j()LA7/I;

    .line 2913
    .line 2914
    .line 2915
    move-result-object v0

    .line 2916
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 2917
    .line 2918
    .line 2919
    iget-object v0, v0, LA7/I;->m:Ljava/lang/String;

    .line 2920
    .line 2921
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2922
    .line 2923
    .line 2924
    move-result v0

    .line 2925
    if-nez v0, :cond_54

    .line 2926
    .line 2927
    goto :goto_34

    .line 2928
    :cond_54
    move-object/from16 v2, v17

    .line 2929
    .line 2930
    goto/16 :goto_38

    .line 2931
    .line 2932
    :cond_55
    :goto_34
    invoke-virtual {v8}, LA7/n0;->e()Z

    .line 2933
    .line 2934
    .line 2935
    move-result v0

    .line 2936
    iget-object v1, v3, LA7/Z;->c:Landroid/content/SharedPreferences;

    .line 2937
    .line 2938
    if-nez v1, :cond_56

    .line 2939
    .line 2940
    move/from16 v1, v25

    .line 2941
    .line 2942
    goto :goto_35

    .line 2943
    :cond_56
    const-string v2, "deferred_analytics_collection"

    .line 2944
    .line 2945
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 2946
    .line 2947
    .line 2948
    move-result v1

    .line 2949
    :goto_35
    if-nez v1, :cond_58

    .line 2950
    .line 2951
    const-string v1, "firebase_analytics_collection_deactivated"

    .line 2952
    .line 2953
    move-object/from16 v2, v17

    .line 2954
    .line 2955
    invoke-virtual {v2, v1}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v1

    .line 2959
    if-eqz v1, :cond_57

    .line 2960
    .line 2961
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2962
    .line 2963
    .line 2964
    move-result v1

    .line 2965
    if-eqz v1, :cond_57

    .line 2966
    .line 2967
    const/4 v1, 0x1

    .line 2968
    goto :goto_36

    .line 2969
    :cond_57
    const/4 v1, 0x0

    .line 2970
    :goto_36
    if-nez v1, :cond_59

    .line 2971
    .line 2972
    const/16 v20, 0x1

    .line 2973
    .line 2974
    xor-int/lit8 v1, v0, 0x1

    .line 2975
    .line 2976
    invoke-virtual {v3, v1}, LA7/Z;->j0(Z)V

    .line 2977
    .line 2978
    .line 2979
    goto :goto_37

    .line 2980
    :cond_58
    move-object/from16 v2, v17

    .line 2981
    .line 2982
    :cond_59
    :goto_37
    if-eqz v0, :cond_5a

    .line 2983
    .line 2984
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 2985
    .line 2986
    .line 2987
    invoke-virtual {v4}, LA7/P0;->z0()V

    .line 2988
    .line 2989
    .line 2990
    :cond_5a
    iget-object v0, v8, LA7/n0;->k:LA7/x1;

    .line 2991
    .line 2992
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 2993
    .line 2994
    .line 2995
    iget-object v0, v0, LA7/x1;->e:LY9/c;

    .line 2996
    .line 2997
    invoke-virtual {v0}, LY9/c;->r()V

    .line 2998
    .line 2999
    .line 3000
    invoke-virtual {v8}, LA7/n0;->m()LA7/m1;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v0

    .line 3004
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 3005
    .line 3006
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3007
    .line 3008
    .line 3009
    invoke-virtual {v0, v1}, LA7/m1;->n0(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 3010
    .line 3011
    .line 3012
    invoke-virtual {v8}, LA7/n0;->m()LA7/m1;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v0

    .line 3016
    iget-object v1, v3, LA7/Z;->z:LVa/X7;

    .line 3017
    .line 3018
    invoke-virtual {v1}, LVa/X7;->o()Landroid/os/Bundle;

    .line 3019
    .line 3020
    .line 3021
    move-result-object v1

    .line 3022
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 3023
    .line 3024
    .line 3025
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 3026
    .line 3027
    .line 3028
    const/4 v11, 0x0

    .line 3029
    invoke-virtual {v0, v11}, LA7/m1;->w0(Z)LA7/N1;

    .line 3030
    .line 3031
    .line 3032
    move-result-object v5

    .line 3033
    new-instance v7, LA7/w0;

    .line 3034
    .line 3035
    const/4 v8, 0x7

    .line 3036
    invoke-direct {v7, v0, v5, v1, v8}, LA7/w0;-><init>(LA7/m1;LA7/N1;Ljava/lang/Object;I)V

    .line 3037
    .line 3038
    .line 3039
    invoke-virtual {v0, v7}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 3040
    .line 3041
    .line 3042
    :goto_38
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 3043
    .line 3044
    .line 3045
    move-result v0

    .line 3046
    if-eqz v0, :cond_5c

    .line 3047
    .line 3048
    sget-object v0, LA7/y;->I0:LA7/D;

    .line 3049
    .line 3050
    const/4 v15, 0x0

    .line 3051
    invoke-virtual {v2, v15, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 3052
    .line 3053
    .line 3054
    move-result v0

    .line 3055
    if-eqz v0, :cond_5c

    .line 3056
    .line 3057
    invoke-static {v6}, LA7/n0;->c(LA7/B0;)V

    .line 3058
    .line 3059
    .line 3060
    invoke-virtual {v6}, LA7/B0;->c0()V

    .line 3061
    .line 3062
    .line 3063
    invoke-virtual {v6}, LA7/U1;->n1()J

    .line 3064
    .line 3065
    .line 3066
    move-result-wide v0

    .line 3067
    cmp-long v0, v0, v28

    .line 3068
    .line 3069
    if-nez v0, :cond_5b

    .line 3070
    .line 3071
    const/4 v11, 0x1

    .line 3072
    goto :goto_39

    .line 3073
    :cond_5b
    const/4 v11, 0x0

    .line 3074
    :goto_39
    if-eqz v11, :cond_5c

    .line 3075
    .line 3076
    new-instance v0, Ljava/lang/Thread;

    .line 3077
    .line 3078
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 3079
    .line 3080
    .line 3081
    new-instance v1, LA7/r0;

    .line 3082
    .line 3083
    const/4 v11, 0x0

    .line 3084
    invoke-direct {v1, v11}, LA7/r0;-><init>(I)V

    .line 3085
    .line 3086
    .line 3087
    iput-object v4, v1, LA7/r0;->b:LA7/P0;

    .line 3088
    .line 3089
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3090
    .line 3091
    .line 3092
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3093
    .line 3094
    .line 3095
    :cond_5c
    iget-object v0, v3, LA7/Z;->p:LA7/X;

    .line 3096
    .line 3097
    const/4 v5, 0x1

    .line 3098
    invoke-virtual {v0, v5}, LA7/X;->c(Z)V

    .line 3099
    .line 3100
    .line 3101
    return-void

    .line 3102
    :cond_5d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3103
    .line 3104
    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3105
    .line 3106
    .line 3107
    throw v0

    .line 3108
    :cond_5e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3109
    .line 3110
    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3111
    .line 3112
    .line 3113
    throw v0

    .line 3114
    :cond_5f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3115
    .line 3116
    invoke-direct {v0, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3117
    .line 3118
    .line 3119
    throw v0

    .line 3120
    :pswitch_24
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 3121
    .line 3122
    check-cast v0, LA7/d0;

    .line 3123
    .line 3124
    iget-object v2, v0, LA7/d0;->b:Ly3/j;

    .line 3125
    .line 3126
    iget-object v3, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 3127
    .line 3128
    check-cast v3, LA7/n0;

    .line 3129
    .line 3130
    iget-object v4, v3, LA7/n0;->j:LA7/k0;

    .line 3131
    .line 3132
    invoke-static {v4}, LA7/n0;->d(LA7/D0;)V

    .line 3133
    .line 3134
    .line 3135
    invoke-virtual {v4}, LA7/k0;->c0()V

    .line 3136
    .line 3137
    .line 3138
    iget-object v4, v1, LA7/p;->b:Ljava/lang/Object;

    .line 3139
    .line 3140
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzbz;

    .line 3141
    .line 3142
    iget-object v3, v3, LA7/n0;->i:LA7/N;

    .line 3143
    .line 3144
    new-instance v5, Landroid/os/Bundle;

    .line 3145
    .line 3146
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 3147
    .line 3148
    .line 3149
    const-string v6, "package_name"

    .line 3150
    .line 3151
    iget-object v0, v0, LA7/d0;->a:Ljava/lang/String;

    .line 3152
    .line 3153
    invoke-virtual {v5, v6, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 3154
    .line 3155
    .line 3156
    :try_start_d
    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/measurement/zzbz;->zza(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 3157
    .line 3158
    .line 3159
    move-result-object v0

    .line 3160
    if-nez v0, :cond_60

    .line 3161
    .line 3162
    invoke-static {v3}, LA7/n0;->d(LA7/D0;)V

    .line 3163
    .line 3164
    .line 3165
    iget-object v0, v3, LA7/N;->f:LA7/P;

    .line 3166
    .line 3167
    const-string v4, "Install Referrer Service returned a null response"

    .line 3168
    .line 3169
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_b

    .line 3170
    .line 3171
    .line 3172
    goto :goto_3a

    .line 3173
    :catch_b
    move-exception v0

    .line 3174
    invoke-static {v3}, LA7/n0;->d(LA7/D0;)V

    .line 3175
    .line 3176
    .line 3177
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 3178
    .line 3179
    .line 3180
    move-result-object v0

    .line 3181
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 3182
    .line 3183
    const-string v4, "Exception occurred while retrieving the Install Referrer"

    .line 3184
    .line 3185
    invoke-virtual {v3, v4, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3186
    .line 3187
    .line 3188
    :cond_60
    :goto_3a
    iget-object v0, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 3189
    .line 3190
    check-cast v0, LA7/n0;

    .line 3191
    .line 3192
    iget-object v0, v0, LA7/n0;->j:LA7/k0;

    .line 3193
    .line 3194
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 3195
    .line 3196
    .line 3197
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 3198
    .line 3199
    .line 3200
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 3201
    .line 3202
    const-string v2, "Unexpected call on client side"

    .line 3203
    .line 3204
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 3205
    .line 3206
    .line 3207
    throw v0

    .line 3208
    :pswitch_25
    move v11, v7

    .line 3209
    move v5, v8

    .line 3210
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 3211
    .line 3212
    check-cast v0, LA7/C0;

    .line 3213
    .line 3214
    invoke-interface {v0}, LA7/C0;->zzd()Lc8/e;

    .line 3215
    .line 3216
    .line 3217
    invoke-static {}, Lc8/e;->e()Z

    .line 3218
    .line 3219
    .line 3220
    move-result v0

    .line 3221
    if-eqz v0, :cond_61

    .line 3222
    .line 3223
    iget-object v0, v1, LA7/p;->b:Ljava/lang/Object;

    .line 3224
    .line 3225
    check-cast v0, LA7/C0;

    .line 3226
    .line 3227
    invoke-interface {v0}, LA7/C0;->zzl()LA7/k0;

    .line 3228
    .line 3229
    .line 3230
    move-result-object v0

    .line 3231
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 3232
    .line 3233
    .line 3234
    goto :goto_3c

    .line 3235
    :cond_61
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 3236
    .line 3237
    check-cast v0, LA7/n;

    .line 3238
    .line 3239
    iget-wide v2, v0, LA7/n;->c:J

    .line 3240
    .line 3241
    const-wide/16 v6, 0x0

    .line 3242
    .line 3243
    cmp-long v0, v2, v6

    .line 3244
    .line 3245
    if-eqz v0, :cond_62

    .line 3246
    .line 3247
    goto :goto_3b

    .line 3248
    :cond_62
    move v5, v11

    .line 3249
    :goto_3b
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 3250
    .line 3251
    check-cast v0, LA7/n;

    .line 3252
    .line 3253
    iput-wide v6, v0, LA7/n;->c:J

    .line 3254
    .line 3255
    if-eqz v5, :cond_63

    .line 3256
    .line 3257
    iget-object v0, v1, LA7/p;->c:Ljava/lang/Object;

    .line 3258
    .line 3259
    check-cast v0, LA7/n;

    .line 3260
    .line 3261
    invoke-virtual {v0}, LA7/n;->c()V

    .line 3262
    .line 3263
    .line 3264
    :cond_63
    :goto_3c
    return-void

    .line 3265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
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

    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch
.end method
