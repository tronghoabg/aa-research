.class public final Lcom/google/android/gms/internal/ads/zzfiq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeua;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcnq;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzetk;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfjr;

.field private zzf:Lcom/google/android/gms/internal/ads/zzbjs;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfqt;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzflf;

.field private zzi:Lp8/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcnq;Lcom/google/android/gms/internal/ads/zzetk;Lcom/google/android/gms/internal/ads/zzfjr;Lcom/google/android/gms/internal/ads/zzflf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzh:Lcom/google/android/gms/internal/ads/zzflf;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zze:Lcom/google/android/gms/internal/ads/zzfjr;

    .line 15
    .line 16
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzcnq;->zzx()Lcom/google/android/gms/internal/ads/zzfqt;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzg:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final zza(LD6/v1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzety;Lcom/google/android/gms/internal/ads/zzetz;)Z
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget p1, LG6/L;->b:I

    .line 6
    .line 7
    const-string p1, "Ad unit ID should not be null for interstitial ad."

    .line 8
    .line 9
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfip;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzfip;-><init>(Lcom/google/android/gms/internal/ads/zzfiq;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfiq;->zzb()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzdn:Lcom/google/android/gms/internal/ads/zzbio;

    .line 31
    .line 32
    sget-object v3, LD6/s;->e:LD6/s;

    .line 33
    .line 34
    iget-object v4, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 35
    .line 36
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-static {}, LD6/q;->a()V

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzkv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 52
    .line 53
    iget-object v3, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-boolean v2, p1, LD6/v1;->f:Z

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcnq;->zzw()Lcom/google/android/gms/internal/ads/zzecz;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzecz;->zzc(Z)V

    .line 78
    .line 79
    .line 80
    :cond_3
    check-cast p3, Lcom/google/android/gms/internal/ads/zzfij;

    .line 81
    .line 82
    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzfij;->zza:LD6/x1;

    .line 83
    .line 84
    new-instance v2, Landroid/util/Pair;

    .line 85
    .line 86
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Lcom/google/android/gms/internal/ads/zzdzc;

    .line 87
    .line 88
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdzc;->zza()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    iget-wide v5, p1, LD6/v1;->z:J

    .line 93
    .line 94
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-direct {v2, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v4, Landroid/util/Pair;

    .line 102
    .line 103
    sget-object v5, Lcom/google/android/gms/internal/ads/zzdzc;->zzb:Lcom/google/android/gms/internal/ads/zzdzc;

    .line 104
    .line 105
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzdzc;->zza()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    sget-object v6, LC6/n;->D:LC6/n;

    .line 110
    .line 111
    iget-object v6, v6, LC6/n;->k:Ln7/b;

    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v6

    .line 120
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-direct {v4, v5, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const/4 v5, 0x2

    .line 128
    new-array v5, v5, [Landroid/util/Pair;

    .line 129
    .line 130
    aput-object v2, v5, v1

    .line 131
    .line 132
    aput-object v4, v5, v0

    .line 133
    .line 134
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzdze;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzh:Lcom/google/android/gms/internal/ads/zzflf;

    .line 139
    .line 140
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzflf;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/zzflf;->zzc(LD6/x1;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzflf;->zza(LD6/v1;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzflf;->zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 150
    .line 151
    .line 152
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zza:Landroid/content/Context;

    .line 153
    .line 154
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzflf;->zzB()Lcom/google/android/gms/internal/ads/zzflg;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzfqp;->zzg(Lcom/google/android/gms/internal/ads/zzflg;)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const/4 v2, 0x4

    .line 163
    invoke-static {p2, v1, v2, p1}, Lcom/google/android/gms/internal/ads/u;->b(Landroid/content/Context;IILD6/v1;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzjC:Lcom/google/android/gms/internal/ads/zzbio;

    .line 168
    .line 169
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_4

    .line 180
    .line 181
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 182
    .line 183
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcnq;->zzm()Lcom/google/android/gms/internal/ads/zzdnn;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    new-instance v3, Lcom/google/android/gms/internal/ads/zzdci;

    .line 188
    .line 189
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzdci;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/ads/zzdci;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, p3}, Lcom/google/android/gms/internal/ads/zzdci;->zzb(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdci;->zze()Lcom/google/android/gms/internal/ads/zzdcj;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zze(Lcom/google/android/gms/internal/ads/zzdcj;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 203
    .line 204
    .line 205
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdiy;

    .line 206
    .line 207
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdiy;-><init>()V

    .line 208
    .line 209
    .line 210
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 211
    .line 212
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 213
    .line 214
    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm(Lcom/google/android/gms/internal/ads/zzdgf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2, p3, v3}, Lcom/google/android/gms/internal/ads/zzdiy;->zze(Ly6/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzn()Lcom/google/android/gms/internal/ads/zzdiz;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zzf(Lcom/google/android/gms/internal/ads/zzdiz;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 225
    .line 226
    .line 227
    new-instance p2, Lcom/google/android/gms/internal/ads/zzerq;

    .line 228
    .line 229
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzf:Lcom/google/android/gms/internal/ads/zzbjs;

    .line 230
    .line 231
    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzerq;-><init>(Lcom/google/android/gms/internal/ads/zzbjs;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v1, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zzd(Lcom/google/android/gms/internal/ads/zzerq;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 235
    .line 236
    .line 237
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdnn;->zza()Lcom/google/android/gms/internal/ads/zzdno;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    :goto_0
    move-object v9, p2

    .line 242
    goto :goto_1

    .line 243
    :cond_4
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdiy;

    .line 244
    .line 245
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzdiy;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zze:Lcom/google/android/gms/internal/ads/zzfjr;

    .line 249
    .line 250
    if-eqz v3, :cond_5

    .line 251
    .line 252
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 253
    .line 254
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzdiy;->zza(Lcom/google/android/gms/internal/ads/zzdcz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzdiy;->zzb(Lcom/google/android/gms/internal/ads/zzden;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzdiy;->zzc(Lcom/google/android/gms/internal/ads/zzddc;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 261
    .line 262
    .line 263
    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 264
    .line 265
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcnq;->zzm()Lcom/google/android/gms/internal/ads/zzdnn;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    new-instance v4, Lcom/google/android/gms/internal/ads/zzdci;

    .line 270
    .line 271
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzdci;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, p2}, Lcom/google/android/gms/internal/ads/zzdci;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, p3}, Lcom/google/android/gms/internal/ads/zzdci;->zzb(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdci;->zze()Lcom/google/android/gms/internal/ads/zzdcj;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-interface {v3, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zze(Lcom/google/android/gms/internal/ads/zzdcj;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 285
    .line 286
    .line 287
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 288
    .line 289
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 290
    .line 291
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm(Lcom/google/android/gms/internal/ads/zzdgf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zza(Lcom/google/android/gms/internal/ads/zzdcz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzb(Lcom/google/android/gms/internal/ads/zzden;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzc(Lcom/google/android/gms/internal/ads/zzddc;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf(LD6/a;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzg(Lcom/google/android/gms/internal/ads/zzdlg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zze(Ly6/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzk(Lcom/google/android/gms/internal/ads/zzdfq;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdiy;->zzd(Lcom/google/android/gms/internal/ads/zzddp;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdiy;->zzn()Lcom/google/android/gms/internal/ads/zzdiz;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-interface {v3, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zzf(Lcom/google/android/gms/internal/ads/zzdiz;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 323
    .line 324
    .line 325
    new-instance p2, Lcom/google/android/gms/internal/ads/zzerq;

    .line 326
    .line 327
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzf:Lcom/google/android/gms/internal/ads/zzbjs;

    .line 328
    .line 329
    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zzerq;-><init>(Lcom/google/android/gms/internal/ads/zzbjs;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v3, p2}, Lcom/google/android/gms/internal/ads/zzdnn;->zzd(Lcom/google/android/gms/internal/ads/zzerq;)Lcom/google/android/gms/internal/ads/zzdnn;

    .line 333
    .line 334
    .line 335
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzdnn;->zza()Lcom/google/android/gms/internal/ads/zzdno;

    .line 336
    .line 337
    .line 338
    move-result-object p2

    .line 339
    goto :goto_0

    .line 340
    :goto_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbkq;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 341
    .line 342
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    check-cast p2, Ljava/lang/Boolean;

    .line 347
    .line 348
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 349
    .line 350
    .line 351
    move-result p2

    .line 352
    if-eqz p2, :cond_6

    .line 353
    .line 354
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzdno;->zzc()Lcom/google/android/gms/internal/ads/zzfqq;

    .line 355
    .line 356
    .line 357
    move-result-object p2

    .line 358
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzfqq;->zzi(I)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 359
    .line 360
    .line 361
    iget-object p3, p1, LD6/v1;->p:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 364
    .line 365
    .line 366
    iget-object p1, p1, LD6/v1;->m:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfqq;->zzd(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 369
    .line 370
    .line 371
    :goto_2
    move-object v7, p2

    .line 372
    goto :goto_3

    .line 373
    :cond_6
    const/4 p2, 0x0

    .line 374
    goto :goto_2

    .line 375
    :goto_3
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzdno;->zzb()Lcom/google/android/gms/internal/ads/zzcze;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcze;->zzb()Lp8/p;

    .line 380
    .line 381
    .line 382
    move-result-object p2

    .line 383
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzcze;->zzc(Lp8/p;)Lp8/p;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzi:Lp8/p;

    .line 388
    .line 389
    new-instance v4, Lcom/google/android/gms/internal/ads/zzfio;

    .line 390
    .line 391
    move-object v5, p0

    .line 392
    move-object v6, p4

    .line 393
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzfio;-><init>(Lcom/google/android/gms/internal/ads/zzfiq;Lcom/google/android/gms/internal/ads/zzetz;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzfqg;Lcom/google/android/gms/internal/ads/zzdno;)V

    .line 394
    .line 395
    .line 396
    iget-object p2, v5, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    .line 397
    .line 398
    invoke-static {p1, v4, p2}, Lcom/google/android/gms/internal/ads/zzhcf;->zzr(Lp8/p;Lcom/google/android/gms/internal/ads/zzhcc;Ljava/util/concurrent/Executor;)V

    .line 399
    .line 400
    .line 401
    return v0
.end method

.method public final zzb()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzi:Lp8/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbjs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzf:Lcom/google/android/gms/internal/ads/zzbjs;

    return-void
.end method

.method public final synthetic zzd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzfmi;->zzd(ILjava/lang/String;LD6/K0;)LD6/K0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzetk;->zzdJ(LD6/K0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zze()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzb:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final synthetic zzf()Lcom/google/android/gms/internal/ads/zzetk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    return-object v0
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzfjr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zze:Lcom/google/android/gms/internal/ads/zzfjr;

    return-object v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/ads/zzfqt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzg:Lcom/google/android/gms/internal/ads/zzfqt;

    return-object v0
.end method

.method public final synthetic zzi(Lp8/p;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfiq;->zzi:Lp8/p;

    .line 3
    .line 4
    return-void
.end method
