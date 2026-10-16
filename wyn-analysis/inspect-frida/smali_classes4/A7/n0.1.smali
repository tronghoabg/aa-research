.class public final LA7/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/C0;


# static fields
.field public static volatile I:LA7/n0;


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public final B:Ljava/lang/Boolean;

.field public final C:Ljava/lang/Boolean;

.field public volatile D:Z

.field public E:I

.field public F:I

.field public final G:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final H:J

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lc8/e;

.field public final g:LA7/e;

.field public final h:LA7/Z;

.field public final i:LA7/N;

.field public final j:LA7/k0;

.field public final k:LA7/x1;

.field public final l:LA7/U1;

.field public final m:LA7/J;

.field public final n:Ln7/b;

.field public final o:LA7/i1;

.field public final p:LA7/P0;

.field public final q:LA7/r;

.field public final r:LA7/f1;

.field public final s:Ljava/lang/String;

.field public t:LA7/H;

.field public u:LA7/m1;

.field public v:LA7/q;

.field public w:LA7/I;

.field public x:Z

.field public y:Ljava/lang/Boolean;

.field public z:J


# direct methods
.method public constructor <init>(LA7/L0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LA7/n0;->x:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, LA7/n0;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, LA7/L0;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, Lc8/e;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, v3}, Lc8/e;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, LA7/n0;->f:Lc8/e;

    .line 23
    .line 24
    sput-object v2, LA7/I0;->k:Lc8/e;

    .line 25
    .line 26
    iput-object v1, p0, LA7/n0;->a:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v2, p1, LA7/L0;->b:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v2, p0, LA7/n0;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v2, p1, LA7/L0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iput-object v2, p0, LA7/n0;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p1, LA7/L0;->d:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v2, p0, LA7/n0;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-boolean v2, p1, LA7/L0;->h:Z

    .line 41
    .line 42
    iput-boolean v2, p0, LA7/n0;->e:Z

    .line 43
    .line 44
    iget-object v2, p1, LA7/L0;->e:Ljava/lang/Boolean;

    .line 45
    .line 46
    iput-object v2, p0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 47
    .line 48
    iget-object v2, p1, LA7/L0;->j:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v2, p0, LA7/n0;->s:Ljava/lang/String;

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    iput-boolean v2, p0, LA7/n0;->D:Z

    .line 54
    .line 55
    iget-object v3, p1, LA7/L0;->g:Lcom/google/android/gms/internal/measurement/zzdw;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 60
    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    const-string v5, "measurementEnabled"

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 70
    .line 71
    if-eqz v5, :cond_0

    .line 72
    .line 73
    check-cast v4, Ljava/lang/Boolean;

    .line 74
    .line 75
    iput-object v4, p0, LA7/n0;->B:Ljava/lang/Boolean;

    .line 76
    .line 77
    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 78
    .line 79
    const-string v4, "measurementDeactivated"

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 86
    .line 87
    if-eqz v4, :cond_1

    .line 88
    .line 89
    check-cast v3, Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v3, p0, LA7/n0;->C:Ljava/lang/Boolean;

    .line 92
    .line 93
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzhj;->zzb(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    sget-object v3, Ln7/b;->a:Ln7/b;

    .line 97
    .line 98
    iput-object v3, p0, LA7/n0;->n:Ln7/b;

    .line 99
    .line 100
    iget-object v3, p1, LA7/L0;->i:Ljava/lang/Long;

    .line 101
    .line 102
    if-eqz v3, :cond_2

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    :goto_0
    iput-wide v3, p0, LA7/n0;->H:J

    .line 114
    .line 115
    new-instance v3, LA7/e;

    .line 116
    .line 117
    invoke-direct {v3, p0}, LA7/B0;-><init>(LA7/n0;)V

    .line 118
    .line 119
    .line 120
    new-instance v4, Lm9/S;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    invoke-direct {v4, v5}, Lm9/S;-><init>(I)V

    .line 124
    .line 125
    .line 126
    iput-object v4, v3, LA7/e;->d:LA7/f;

    .line 127
    .line 128
    iput-object v3, p0, LA7/n0;->g:LA7/e;

    .line 129
    .line 130
    new-instance v3, LA7/Z;

    .line 131
    .line 132
    invoke-direct {v3, p0}, LA7/Z;-><init>(LA7/n0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3}, LA7/D0;->f0()V

    .line 136
    .line 137
    .line 138
    iput-object v3, p0, LA7/n0;->h:LA7/Z;

    .line 139
    .line 140
    new-instance v3, LA7/N;

    .line 141
    .line 142
    invoke-direct {v3, p0}, LA7/N;-><init>(LA7/n0;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, LA7/D0;->f0()V

    .line 146
    .line 147
    .line 148
    iput-object v3, p0, LA7/n0;->i:LA7/N;

    .line 149
    .line 150
    new-instance v4, LA7/U1;

    .line 151
    .line 152
    invoke-direct {v4, p0}, LA7/U1;-><init>(LA7/n0;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, LA7/D0;->f0()V

    .line 156
    .line 157
    .line 158
    iput-object v4, p0, LA7/n0;->l:LA7/U1;

    .line 159
    .line 160
    new-instance v4, Lxa/d;

    .line 161
    .line 162
    const/4 v5, 0x3

    .line 163
    invoke-direct {v4, p0, v5}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    new-instance v5, LA7/J;

    .line 167
    .line 168
    invoke-direct {v5, v4}, LA7/J;-><init>(Lxa/d;)V

    .line 169
    .line 170
    .line 171
    iput-object v5, p0, LA7/n0;->m:LA7/J;

    .line 172
    .line 173
    new-instance v4, LA7/r;

    .line 174
    .line 175
    invoke-direct {v4, p0}, LA7/r;-><init>(LA7/n0;)V

    .line 176
    .line 177
    .line 178
    iput-object v4, p0, LA7/n0;->q:LA7/r;

    .line 179
    .line 180
    new-instance v4, LA7/i1;

    .line 181
    .line 182
    invoke-direct {v4, p0}, LA7/i1;-><init>(LA7/n0;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, LA7/Y;->i0()V

    .line 186
    .line 187
    .line 188
    iput-object v4, p0, LA7/n0;->o:LA7/i1;

    .line 189
    .line 190
    new-instance v4, LA7/P0;

    .line 191
    .line 192
    invoke-direct {v4, p0}, LA7/P0;-><init>(LA7/n0;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, LA7/Y;->i0()V

    .line 196
    .line 197
    .line 198
    iput-object v4, p0, LA7/n0;->p:LA7/P0;

    .line 199
    .line 200
    new-instance v5, LA7/x1;

    .line 201
    .line 202
    invoke-direct {v5, p0}, LA7/x1;-><init>(LA7/n0;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, LA7/Y;->i0()V

    .line 206
    .line 207
    .line 208
    iput-object v5, p0, LA7/n0;->k:LA7/x1;

    .line 209
    .line 210
    new-instance v5, LA7/f1;

    .line 211
    .line 212
    invoke-direct {v5, p0}, LA7/D0;-><init>(LA7/n0;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5}, LA7/D0;->f0()V

    .line 216
    .line 217
    .line 218
    iput-object v5, p0, LA7/n0;->r:LA7/f1;

    .line 219
    .line 220
    new-instance v5, LA7/k0;

    .line 221
    .line 222
    invoke-direct {v5, p0}, LA7/k0;-><init>(LA7/n0;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5}, LA7/D0;->f0()V

    .line 226
    .line 227
    .line 228
    iput-object v5, p0, LA7/n0;->j:LA7/k0;

    .line 229
    .line 230
    iget-object v6, p1, LA7/L0;->g:Lcom/google/android/gms/internal/measurement/zzdw;

    .line 231
    .line 232
    if-eqz v6, :cond_3

    .line 233
    .line 234
    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/zzdw;->zzb:J

    .line 235
    .line 236
    const-wide/16 v8, 0x0

    .line 237
    .line 238
    cmp-long v6, v6, v8

    .line 239
    .line 240
    if-eqz v6, :cond_3

    .line 241
    .line 242
    move v0, v2

    .line 243
    :cond_3
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    instance-of v1, v1, Landroid/app/Application;

    .line 248
    .line 249
    if-eqz v1, :cond_5

    .line 250
    .line 251
    invoke-static {v4}, LA7/n0;->b(LA7/Y;)V

    .line 252
    .line 253
    .line 254
    iget-object v1, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, LA7/n0;

    .line 257
    .line 258
    iget-object v2, v1, LA7/n0;->a:Landroid/content/Context;

    .line 259
    .line 260
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    instance-of v2, v2, Landroid/app/Application;

    .line 265
    .line 266
    if-eqz v2, :cond_6

    .line 267
    .line 268
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 269
    .line 270
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Landroid/app/Application;

    .line 275
    .line 276
    iget-object v2, v4, LA7/P0;->c:LA7/c1;

    .line 277
    .line 278
    if-nez v2, :cond_4

    .line 279
    .line 280
    new-instance v2, LA7/c1;

    .line 281
    .line 282
    invoke-direct {v2, v4}, LA7/c1;-><init>(LA7/P0;)V

    .line 283
    .line 284
    .line 285
    iput-object v2, v4, LA7/P0;->c:LA7/c1;

    .line 286
    .line 287
    :cond_4
    if-nez v0, :cond_6

    .line 288
    .line 289
    iget-object v0, v4, LA7/P0;->c:LA7/c1;

    .line 290
    .line 291
    invoke-virtual {v1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 292
    .line 293
    .line 294
    iget-object v0, v4, LA7/P0;->c:LA7/c1;

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    const-string v1, "Registered activity lifecycle callback"

    .line 304
    .line 305
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 306
    .line 307
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_5
    invoke-static {v3}, LA7/n0;->d(LA7/D0;)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v3, LA7/N;->i:LA7/P;

    .line 315
    .line 316
    const-string v1, "Application context is not an Application"

    .line 317
    .line 318
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_6
    :goto_1
    new-instance v0, LA7/p;

    .line 322
    .line 323
    const/4 v1, 0x2

    .line 324
    invoke-direct {v0, v1, p0, p1}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 328
    .line 329
    .line 330
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdw;Ljava/lang/Long;)LA7/n0;
    .locals 12

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zze:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzf:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzdw;

    .line 12
    .line 13
    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zza:J

    .line 14
    .line 15
    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzb:J

    .line 16
    .line 17
    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzc:Z

    .line 18
    .line 19
    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzd:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/zzdw;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v1

    .line 30
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, LA7/n0;->I:LA7/n0;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    const-class v1, LA7/n0;

    .line 45
    .line 46
    monitor-enter v1

    .line 47
    :try_start_0
    sget-object v0, LA7/n0;->I:LA7/n0;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, LA7/L0;

    .line 52
    .line 53
    invoke-direct {v0, p0, p1, p2}, LA7/L0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdw;Ljava/lang/Long;)V

    .line 54
    .line 55
    .line 56
    new-instance p0, LA7/n0;

    .line 57
    .line 58
    invoke-direct {p0, v0}, LA7/n0;-><init>(LA7/L0;)V

    .line 59
    .line 60
    .line 61
    sput-object p0, LA7/n0;->I:LA7/n0;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    monitor-exit v1

    .line 68
    goto :goto_2

    .line 69
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p0

    .line 71
    :cond_3
    if-eqz p1, :cond_4

    .line 72
    .line 73
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    const-string p2, "dataCollectionDefaultEnabled"

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    sget-object p0, LA7/n0;->I:LA7/n0;

    .line 86
    .line 87
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object p0, LA7/n0;->I:LA7/n0;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdw;->zzg:Landroid/os/Bundle;

    .line 93
    .line 94
    const-string p2, "dataCollectionDefaultEnabled"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 105
    .line 106
    :cond_4
    :goto_2
    sget-object p0, LA7/n0;->I:LA7/n0;

    .line 107
    .line 108
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, LA7/n0;->I:LA7/n0;

    .line 112
    .line 113
    return-object p0
.end method

.method public static b(LA7/Y;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, LA7/Y;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public static c(LA7/B0;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v0, "Component not created"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static d(LA7/D0;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, LA7/D0;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v1, "Component not initialized: "

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Component not created"

    .line 31
    .line 32
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method


# virtual methods
.method public final e()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/n0;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final f()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, LA7/n0;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, LA7/n0;->j:LA7/k0;

    .line 6
    .line 7
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LA7/n0;->y:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object v1, p0, LA7/n0;->n:Ln7/b;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-wide v2, p0, LA7/n0;->z:J

    .line 20
    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_5

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    iget-wide v4, p0, LA7/n0;->z:J

    .line 41
    .line 42
    sub-long/2addr v2, v4

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide/16 v4, 0x3e8

    .line 48
    .line 49
    cmp-long v0, v2, v4

    .line 50
    .line 51
    if-lez v0, :cond_5

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iput-wide v0, p0, LA7/n0;->z:J

    .line 61
    .line 62
    iget-object v0, p0, LA7/n0;->l:LA7/U1;

    .line 63
    .line 64
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "android.permission.INTERNET"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, LA7/U1;->g1(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x1

    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, LA7/U1;->g1(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    iget-object v1, p0, LA7/n0;->a:Landroid/content/Context;

    .line 86
    .line 87
    invoke-static {v1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, LE0/a;->e()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    iget-object v4, p0, LA7/n0;->g:LA7/e;

    .line 98
    .line 99
    invoke-virtual {v4}, LA7/e;->r0()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_1

    .line 104
    .line 105
    invoke-static {v1}, LA7/U1;->K0(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    invoke-static {v1}, LA7/U1;->V0(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    :cond_1
    move v1, v2

    .line 118
    goto :goto_0

    .line 119
    :cond_2
    move v1, v3

    .line 120
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iput-object v4, p0, LA7/n0;->y:Ljava/lang/Boolean;

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0}, LA7/n0;->j()LA7/I;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v1}, LA7/I;->l0()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {p0}, LA7/n0;->j()LA7/I;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 141
    .line 142
    .line 143
    iget-object v4, v4, LA7/I;->m:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v0, v1, v4}, LA7/U1;->P0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    invoke-virtual {p0}, LA7/n0;->j()LA7/I;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, LA7/I;->m:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_3

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    move v2, v3

    .line 168
    :cond_4
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, LA7/n0;->y:Ljava/lang/Boolean;

    .line 173
    .line 174
    :cond_5
    iget-object v0, p0, LA7/n0;->y:Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    return v0

    .line 181
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 182
    .line 183
    const-string v1, "AppMeasurement is not initialized"

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0
.end method

.method public final g()I
    .locals 4

    .line 1
    iget-object v0, p0, LA7/n0;->j:LA7/k0;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LA7/n0;->g:LA7/e;

    .line 10
    .line 11
    const-string v1, "firebase_analytics_collection_deactivated"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    iget-object v0, p0, LA7/n0;->C:Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    return v0

    .line 39
    :cond_1
    iget-object v0, p0, LA7/n0;->j:LA7/k0;

    .line 40
    .line 41
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, p0, LA7/n0;->D:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    return v0

    .line 54
    :cond_2
    iget-object v0, p0, LA7/n0;->h:LA7/Z;

    .line 55
    .line 56
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-string v3, "measurement_enabled"

    .line 67
    .line 68
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    const/4 v0, 0x0

    .line 88
    :goto_0
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    const/4 v0, 0x3

    .line 98
    return v0

    .line 99
    :cond_5
    iget-object v0, p0, LA7/n0;->g:LA7/e;

    .line 100
    .line 101
    const-string v1, "firebase_analytics_collection_enabled"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    const/4 v0, 0x4

    .line 117
    return v0

    .line 118
    :cond_7
    iget-object v0, p0, LA7/n0;->B:Ljava/lang/Boolean;

    .line 119
    .line 120
    if-eqz v0, :cond_9

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_8
    const/4 v0, 0x5

    .line 130
    return v0

    .line 131
    :cond_9
    iget-object v0, p0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 132
    .line 133
    if-eqz v0, :cond_b

    .line 134
    .line 135
    iget-object v0, p0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_a

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_a
    const/4 v0, 0x7

    .line 145
    return v0

    .line 146
    :cond_b
    :goto_1
    const/4 v0, 0x0

    .line 147
    return v0
.end method

.method public final h()LA7/r;
    .locals 2

    .line 1
    iget-object v0, p0, LA7/n0;->q:LA7/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Component not created"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final i()LA7/q;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->v:LA7/q;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/n0;->v:LA7/q;

    .line 7
    .line 8
    return-object v0
.end method

.method public final j()LA7/I;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->w:LA7/I;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/n0;->w:LA7/I;

    .line 7
    .line 8
    return-object v0
.end method

.method public final k()LA7/H;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->t:LA7/H;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/n0;->t:LA7/H;

    .line 7
    .line 8
    return-object v0
.end method

.method public final l()LA7/J;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->m:LA7/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()LA7/m1;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->u:LA7/m1;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/n0;->u:LA7/m1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->l:LA7/U1;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzb()Ln7/a;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->n:Ln7/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzd()Lc8/e;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->f:Lc8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzj()LA7/N;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->i:LA7/N;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final zzl()LA7/k0;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/n0;->j:LA7/k0;

    .line 2
    .line 3
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
