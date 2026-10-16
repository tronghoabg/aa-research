.class public final synthetic Ldd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldd/e;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldd/e;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldd/c;->a:I

    iput-object p1, p0, Ldd/c;->b:Ldd/e;

    iput-object p2, p0, Ldd/c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    .line 1
    const-string v0, "%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, Ldd/c;->c:Ljava/lang/String;

    .line 6
    .line 7
    const-string v4, "Calling this from your main thread can lead to deadlock"

    .line 8
    .line 9
    iget-object v5, p0, Ldd/c;->b:Ldd/e;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget v7, p0, Ldd/c;->a:I

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v7, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v7, LT6/d;->a:[Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v4, v5, Ldd/e;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v4}, LT6/d;->d(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v5}, LT6/d;->e(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzdc;->zzd(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhw;->zze()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_0

    .line 46
    .line 47
    invoke-static {v4}, LT6/d;->g(Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzh;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/zzg;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    new-instance v8, Lcom/google/android/gms/internal/auth/zzbw;

    .line 58
    .line 59
    invoke-direct {v8}, Lcom/google/android/gms/internal/auth/zzbw;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/auth/zzbw;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/auth/zzbw;

    .line 63
    .line 64
    .line 65
    invoke-interface {v7, v8}, Lcom/google/android/gms/internal/auth/zzg;->zza(Lcom/google/android/gms/internal/auth/zzbw;)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const-string v8, "clear token"

    .line 70
    .line 71
    :try_start_0
    invoke-static {v7, v8}, LT6/d;->c(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/android/gms/common/api/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception v7

    .line 76
    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    new-array v2, v2, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object v8, v2, v6

    .line 83
    .line 84
    aput-object v7, v2, v1

    .line 85
    .line 86
    sget-object v1, LT6/d;->c:Lh7/a;

    .line 87
    .line 88
    invoke-virtual {v1, v0, v2}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    new-instance v0, LS3/s;

    .line 92
    .line 93
    const/16 v1, 0x19

    .line 94
    .line 95
    invoke-direct {v0, v1, v3, v5}, LS3/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v1, LT6/d;->b:Landroid/content/ComponentName;

    .line 99
    .line 100
    invoke-static {v4, v1, v0}, LT6/d;->b(Landroid/content/Context;Landroid/content/ComponentName;LT6/h;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :goto_0
    const/4 v0, 0x0

    .line 104
    return-object v0

    .line 105
    :pswitch_0
    new-instance v7, Landroid/accounts/Account;

    .line 106
    .line 107
    const-string v8, "com.google"

    .line 108
    .line 109
    invoke-direct {v7, v3, v8}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v3, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v8, "oauth2:"

    .line 115
    .line 116
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v8, LB8/e;

    .line 120
    .line 121
    const/16 v9, 0x20

    .line 122
    .line 123
    invoke-static {v9}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-direct {v8, v9}, LB8/e;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v9, v5, Ldd/e;->f:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {v8, v9}, LB8/e;->e(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    sget-object v8, LT6/d;->a:[Ljava/lang/String;

    .line 144
    .line 145
    new-instance v8, Landroid/os/Bundle;

    .line 146
    .line 147
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-static {v7}, LT6/d;->f(Landroid/accounts/Account;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->h(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v4, "Scope cannot be empty or null."

    .line 157
    .line 158
    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v7}, LT6/d;->f(Landroid/accounts/Account;)V

    .line 162
    .line 163
    .line 164
    iget-object v4, v5, Ldd/e;->a:Landroid/content/Context;

    .line 165
    .line 166
    invoke-static {v4}, LT6/d;->d(Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    new-instance v5, Landroid/os/Bundle;

    .line 170
    .line 171
    invoke-direct {v5, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v4, v5}, LT6/d;->e(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzdc;->zzd(Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lcom/google/android/gms/internal/auth/zzhw;->zze()Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_2

    .line 185
    .line 186
    invoke-static {v4}, LT6/d;->g(Landroid/content/Context;)Z

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eqz v8, :cond_2

    .line 191
    .line 192
    invoke-static {v4}, Lcom/google/android/gms/internal/auth/zzh;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/zzg;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-interface {v8, v7, v3, v5}, Lcom/google/android/gms/internal/auth/zzg;->zzc(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    const-string v9, "token retrieval"

    .line 201
    .line 202
    :try_start_1
    invoke-static {v8, v9}, LT6/d;->c(Lcom/google/android/gms/tasks/Task;Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    check-cast v8, Landroid/os/Bundle;

    .line 207
    .line 208
    if-eqz v8, :cond_1

    .line 209
    .line 210
    invoke-static {v4, v8}, LT6/d;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    goto :goto_2

    .line 215
    :catch_1
    move-exception v8

    .line 216
    goto :goto_1

    .line 217
    :cond_1
    new-array v8, v6, [Ljava/lang/Object;

    .line 218
    .line 219
    sget-object v10, LT6/d;->c:Lh7/a;

    .line 220
    .line 221
    const-string v11, "Service call returned null."

    .line 222
    .line 223
    invoke-virtual {v10, v11, v8}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    new-instance v8, Ljava/io/IOException;

    .line 227
    .line 228
    const-string v10, "Service unavailable."

    .line 229
    .line 230
    invoke-direct {v8, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v8
    :try_end_1
    .catch Lcom/google/android/gms/common/api/j; {:try_start_1 .. :try_end_1} :catch_1

    .line 234
    :goto_1
    invoke-static {v8}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    new-array v2, v2, [Ljava/lang/Object;

    .line 239
    .line 240
    aput-object v9, v2, v6

    .line 241
    .line 242
    aput-object v8, v2, v1

    .line 243
    .line 244
    sget-object v1, LT6/d;->c:Lh7/a;

    .line 245
    .line 246
    invoke-virtual {v1, v0, v2}, Lh7/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_2
    new-instance v0, LVa/Za;

    .line 250
    .line 251
    invoke-direct {v0, v7, v3, v5, v4}, LVa/Za;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    sget-object v1, LT6/d;->b:Landroid/content/ComponentName;

    .line 255
    .line 256
    invoke-static {v4, v1, v0}, LT6/d;->b(Landroid/content/Context;Landroid/content/ComponentName;LT6/h;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    check-cast v0, Lcom/google/android/gms/auth/TokenData;

    .line 261
    .line 262
    :goto_2
    iget-object v0, v0, Lcom/google/android/gms/auth/TokenData;->b:Ljava/lang/String;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
