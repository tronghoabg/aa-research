.class public final Lcom/google/android/gms/internal/ads/zzfha;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzeua;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcnq;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzetk;

.field private final zze:Lcom/google/android/gms/internal/ads/zzeto;

.field private final zzf:Landroid/view/ViewGroup;

.field private zzg:Lcom/google/android/gms/internal/ads/zzbjs;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdga;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfqt;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdif;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzflf;

.field private zzl:Lp8/p;

.field private zzm:Z

.field private zzn:LD6/K0;

.field private zzo:Lcom/google/android/gms/internal/ads/zzetz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;LD6/x1;Lcom/google/android/gms/internal/ads/zzcnq;Lcom/google/android/gms/internal/ads/zzetk;Lcom/google/android/gms/internal/ads/zzeto;Lcom/google/android/gms/internal/ads/zzflf;Lcom/google/android/gms/internal/ads/zzdif;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfha;->zze:Lcom/google/android/gms/internal/ads/zzeto;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzk:Lcom/google/android/gms/internal/ads/zzflf;

    .line 15
    .line 16
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcnq;->zzd()Lcom/google/android/gms/internal/ads/zzdga;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 21
    .line 22
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzcnq;->zzx()Lcom/google/android/gms/internal/ads/zzfqt;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzi:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 27
    .line 28
    new-instance p2, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    .line 34
    .line 35
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    .line 36
    .line 37
    invoke-virtual {p7, p3}, Lcom/google/android/gms/internal/ads/zzflf;->zzc(LD6/x1;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzn:LD6/K0;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzo:Lcom/google/android/gms/internal/ads/zzetz;

    .line 47
    .line 48
    return-void
.end method

.method private final zzt()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzn:LD6/K0;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzn:LD6/K0;

    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzjA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 9
    .line 10
    sget-object v2, LD6/s;->e:LD6/s;

    .line 11
    .line 12
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

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
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfgx;

    .line 31
    .line 32
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzfgx;-><init>(Lcom/google/android/gms/internal/ads/zzfha;LD6/K0;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzo:Lcom/google/android/gms/internal/ads/zzetz;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzetz;->zza()V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method


# virtual methods
.method public final zza(LD6/v1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzety;Lcom/google/android/gms/internal/ads/zzetz;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const/4 p3, 0x1

    .line 2
    const/4 v0, 0x0

    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget p1, LG6/L;->b:I

    .line 6
    .line 7
    const-string p1, "Ad unit ID should not be null for banner ad."

    .line 8
    .line 9
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfgy;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzfgy;-><init>(Lcom/google/android/gms/internal/ads/zzfha;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfha;->zzb()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzk:Lcom/google/android/gms/internal/ads/zzflf;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzflf;->zzC()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzdn:Lcom/google/android/gms/internal/ads/zzbio;

    .line 41
    .line 42
    sget-object v2, LD6/s;->e:LD6/s;

    .line 43
    .line 44
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-static {}, LD6/q;->a()V

    .line 59
    .line 60
    .line 61
    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzkv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 62
    .line 63
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-boolean v1, p1, LD6/v1;->f:Z

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcnq;->zzw()Lcom/google/android/gms/internal/ads/zzecz;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzecz;->zzc(Z)V

    .line 88
    .line 89
    .line 90
    :cond_3
    new-instance v1, Landroid/util/Pair;

    .line 91
    .line 92
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Lcom/google/android/gms/internal/ads/zzdzc;

    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdzc;->zza()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-wide v4, p1, LD6/v1;->z:J

    .line 99
    .line 100
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct {v1, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v3, Landroid/util/Pair;

    .line 108
    .line 109
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdzc;->zzb:Lcom/google/android/gms/internal/ads/zzdzc;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdzc;->zza()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    sget-object v5, LC6/n;->D:LC6/n;

    .line 116
    .line 117
    iget-object v5, v5, LC6/n;->k:Ln7/b;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v5

    .line 126
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v4, 0x2

    .line 134
    new-array v4, v4, [Landroid/util/Pair;

    .line 135
    .line 136
    aput-object v1, v4, v0

    .line 137
    .line 138
    aput-object v3, v4, p3

    .line 139
    .line 140
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzdze;->zza([Landroid/util/Pair;)Landroid/os/Bundle;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzk:Lcom/google/android/gms/internal/ads/zzflf;

    .line 145
    .line 146
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/ads/zzflf;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzflf;->zza(LD6/v1;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzflf;->zzv(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zza:Landroid/content/Context;

    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzflf;->zzB()Lcom/google/android/gms/internal/ads/zzflg;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfqp;->zzg(Lcom/google/android/gms/internal/ads/zzflg;)I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    const/4 v5, 0x3

    .line 166
    invoke-static {p2, v4, v5, p1}, Lcom/google/android/gms/internal/ads/u;->b(Landroid/content/Context;IILD6/v1;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbld;->zzf:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    check-cast v6, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    const/4 v7, 0x0

    .line 183
    if-eqz v6, :cond_5

    .line 184
    .line 185
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzflf;->zzf()LD6/x1;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    iget-boolean v3, v3, LD6/x1;->k:Z

    .line 190
    .line 191
    if-eqz v3, :cond_5

    .line 192
    .line 193
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 194
    .line 195
    if-eqz p1, :cond_4

    .line 196
    .line 197
    const/4 p2, 0x7

    .line 198
    invoke-static {p2, v7, v7}, Lcom/google/android/gms/internal/ads/zzfmi;->zzd(ILjava/lang/String;LD6/K0;)LD6/K0;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzetk;->zzdJ(LD6/K0;)V

    .line 203
    .line 204
    .line 205
    :cond_4
    return v0

    .line 206
    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzjA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 207
    .line 208
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_6

    .line 219
    .line 220
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnq;->zzi()Lcom/google/android/gms/internal/ads/zzcww;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdci;

    .line 227
    .line 228
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzdci;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzdci;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzdci;->zzb(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdci;->zze()Lcom/google/android/gms/internal/ads/zzdcj;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzl(Lcom/google/android/gms/internal/ads/zzdcj;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 242
    .line 243
    .line 244
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdiy;

    .line 245
    .line 246
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdiy;-><init>()V

    .line 247
    .line 248
    .line 249
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 250
    .line 251
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 252
    .line 253
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm(Lcom/google/android/gms/internal/ads/zzdgf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zze(Ly6/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzn()Lcom/google/android/gms/internal/ads/zzdiz;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzm(Lcom/google/android/gms/internal/ads/zzdiz;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 264
    .line 265
    .line 266
    new-instance p2, Lcom/google/android/gms/internal/ads/zzerq;

    .line 267
    .line 268
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzg:Lcom/google/android/gms/internal/ads/zzbjs;

    .line 269
    .line 270
    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzerq;-><init>(Lcom/google/android/gms/internal/ads/zzbjs;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzk(Lcom/google/android/gms/internal/ads/zzerq;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 274
    .line 275
    .line 276
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdof;

    .line 277
    .line 278
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdql;->zza:Lcom/google/android/gms/internal/ads/zzdql;

    .line 279
    .line 280
    invoke-direct {p2, v1, v7}, Lcom/google/android/gms/internal/ads/zzdof;-><init>(Lcom/google/android/gms/internal/ads/zzdql;LD6/y;)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzd(Lcom/google/android/gms/internal/ads/zzdof;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 284
    .line 285
    .line 286
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 287
    .line 288
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    .line 289
    .line 290
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcxs;

    .line 291
    .line 292
    invoke-direct {v2, p2, v1}, Lcom/google/android/gms/internal/ads/zzcxs;-><init>(Lcom/google/android/gms/internal/ads/zzdga;Lcom/google/android/gms/internal/ads/zzdif;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzcww;->zzg(Lcom/google/android/gms/internal/ads/zzcxs;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 296
    .line 297
    .line 298
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    .line 299
    .line 300
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcvp;

    .line 301
    .line 302
    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/zzcvp;-><init>(Landroid/view/ViewGroup;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcww;->zze(Lcom/google/android/gms/internal/ads/zzcvp;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 306
    .line 307
    .line 308
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcww;->zza()Lcom/google/android/gms/internal/ads/zzcwx;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    goto :goto_0

    .line 313
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzc:Lcom/google/android/gms/internal/ads/zzcnq;

    .line 314
    .line 315
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnq;->zzi()Lcom/google/android/gms/internal/ads/zzcww;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdci;

    .line 320
    .line 321
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzdci;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzdci;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzdci;->zzb(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzdci;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdci;->zze()Lcom/google/android/gms/internal/ads/zzdcj;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzl(Lcom/google/android/gms/internal/ads/zzdcj;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 335
    .line 336
    .line 337
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdiy;

    .line 338
    .line 339
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzdiy;-><init>()V

    .line 340
    .line 341
    .line 342
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 343
    .line 344
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 345
    .line 346
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzm(Lcom/google/android/gms/internal/ads/zzdgf;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf(LD6/a;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 350
    .line 351
    .line 352
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zze:Lcom/google/android/gms/internal/ads/zzeto;

    .line 353
    .line 354
    invoke-virtual {p2, v3, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzf(LD6/a;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzg(Lcom/google/android/gms/internal/ads/zzdlg;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 358
    .line 359
    .line 360
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzh(Lcom/google/android/gms/internal/ads/zzddt;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zza(Lcom/google/android/gms/internal/ads/zzdcz;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzb(Lcom/google/android/gms/internal/ads/zzden;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzc(Lcom/google/android/gms/internal/ads/zzddc;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zze(Ly6/f;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzk(Lcom/google/android/gms/internal/ads/zzdfq;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzdiy;

    .line 376
    .line 377
    .line 378
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdiy;->zzn()Lcom/google/android/gms/internal/ads/zzdiz;

    .line 379
    .line 380
    .line 381
    move-result-object p2

    .line 382
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzm(Lcom/google/android/gms/internal/ads/zzdiz;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 383
    .line 384
    .line 385
    new-instance p2, Lcom/google/android/gms/internal/ads/zzerq;

    .line 386
    .line 387
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzg:Lcom/google/android/gms/internal/ads/zzbjs;

    .line 388
    .line 389
    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzerq;-><init>(Lcom/google/android/gms/internal/ads/zzbjs;)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzk(Lcom/google/android/gms/internal/ads/zzerq;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 393
    .line 394
    .line 395
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdof;

    .line 396
    .line 397
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdql;->zza:Lcom/google/android/gms/internal/ads/zzdql;

    .line 398
    .line 399
    invoke-direct {p2, v1, v7}, Lcom/google/android/gms/internal/ads/zzdof;-><init>(Lcom/google/android/gms/internal/ads/zzdql;LD6/y;)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/zzcww;->zzd(Lcom/google/android/gms/internal/ads/zzdof;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 403
    .line 404
    .line 405
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 406
    .line 407
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    .line 408
    .line 409
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcxs;

    .line 410
    .line 411
    invoke-direct {v2, p2, v1}, Lcom/google/android/gms/internal/ads/zzcxs;-><init>(Lcom/google/android/gms/internal/ads/zzdga;Lcom/google/android/gms/internal/ads/zzdif;)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzcww;->zzg(Lcom/google/android/gms/internal/ads/zzcxs;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 415
    .line 416
    .line 417
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    .line 418
    .line 419
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcvp;

    .line 420
    .line 421
    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/zzcvp;-><init>(Landroid/view/ViewGroup;)V

    .line 422
    .line 423
    .line 424
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcww;->zze(Lcom/google/android/gms/internal/ads/zzcvp;)Lcom/google/android/gms/internal/ads/zzcww;

    .line 425
    .line 426
    .line 427
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcww;->zza()Lcom/google/android/gms/internal/ads/zzcwx;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkq;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 432
    .line 433
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, Ljava/lang/Boolean;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_7

    .line 444
    .line 445
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcwx;->zze()Lcom/google/android/gms/internal/ads/zzfqq;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzfqq;->zzi(I)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 450
    .line 451
    .line 452
    iget-object v0, p1, LD6/v1;->p:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzfqq;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 455
    .line 456
    .line 457
    iget-object p1, p1, LD6/v1;->m:Landroid/os/Bundle;

    .line 458
    .line 459
    invoke-virtual {v7, p1}, Lcom/google/android/gms/internal/ads/zzfqq;->zzd(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 460
    .line 461
    .line 462
    :cond_7
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzo:Lcom/google/android/gms/internal/ads/zzetz;

    .line 463
    .line 464
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcwx;->zzc()Lcom/google/android/gms/internal/ads/zzcze;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcze;->zzb()Lp8/p;

    .line 469
    .line 470
    .line 471
    move-result-object p4

    .line 472
    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/ads/zzcze;->zzc(Lp8/p;)Lp8/p;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 477
    .line 478
    new-instance p4, Lcom/google/android/gms/internal/ads/zzfgw;

    .line 479
    .line 480
    invoke-direct {p4, p0, v7, v4, p2}, Lcom/google/android/gms/internal/ads/zzfgw;-><init>(Lcom/google/android/gms/internal/ads/zzfha;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzfqg;Lcom/google/android/gms/internal/ads/zzcwx;)V

    .line 481
    .line 482
    .line 483
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 484
    .line 485
    invoke-static {p1, p4, p2}, Lcom/google/android/gms/internal/ads/zzhcf;->zzr(Lp8/p;Lcom/google/android/gms/internal/ads/zzhcc;Ljava/util/concurrent/Executor;)V

    .line 486
    .line 487
    .line 488
    return p3
.end method

.method public final zzb()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

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

.method public final zzc()V
    .locals 9

    .line 1
    const-string v0, " already has a parent view. Removing its old parent."

    .line 2
    .line 3
    const-string v1, "Banner view provided from "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_6

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v2, :cond_6

    .line 16
    .line 17
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/android/gms/internal/ads/zzcvs;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-virtual {v4}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zza()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zza()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    instance-of v6, v5, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    const-string v6, ""

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcya;->zzn()Lcom/google/android/gms/internal/ads/zzdcs;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcya;->zzn()Lcom/google/android/gms/internal/ads/zzdcs;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzdcs;->zze()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :catch_1
    move-exception v0

    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_0
    :goto_0
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    add-int/lit8 v7, v7, 0x4e

    .line 83
    .line 84
    new-instance v8, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget v1, LG6/L;->b:I

    .line 103
    .line 104
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    check-cast v5, Landroid/view/ViewGroup;

    .line 108
    .line 109
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zza()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzjA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 117
    .line 118
    sget-object v1, LD6/s;->e:LD6/s;

    .line 119
    .line 120
    iget-object v5, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 121
    .line 122
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcya;->zzq()Lcom/google/android/gms/internal/ads/zzdgp;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 139
    .line 140
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzdgp;->zza(Lcom/google/android/gms/internal/ads/zzetk;)Lcom/google/android/gms/internal/ads/zzdgp;

    .line 141
    .line 142
    .line 143
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfha;->zze:Lcom/google/android/gms/internal/ads/zzeto;

    .line 144
    .line 145
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzdgp;->zzb(Lcom/google/android/gms/internal/ads/zzeto;)Lcom/google/android/gms/internal/ads/zzdgp;

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zza()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzo:Lcom/google/android/gms/internal/ads/zzetz;

    .line 156
    .line 157
    if-eqz v4, :cond_3

    .line 158
    .line 159
    invoke-interface {v4, v2}, Lcom/google/android/gms/internal/ads/zzetz;->zzb(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_3
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 177
    .line 178
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 179
    .line 180
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    new-instance v4, Lcom/google/android/gms/internal/ads/zzfgz;

    .line 184
    .line 185
    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/zzfgz;-><init>(Lcom/google/android/gms/internal/ads/zzetk;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 189
    .line 190
    .line 191
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zzh()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-ltz v0, :cond_5

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 199
    .line 200
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 201
    .line 202
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zzh()I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdga;->zzd(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zzg()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdga;->zze(I)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_5
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 218
    .line 219
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 220
    .line 221
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcvs;->zzg()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdga;->zzd(I)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :goto_1
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfha;->zzt()V

    .line 230
    .line 231
    .line 232
    const-string v1, "Error occurred while refreshing the ad. Making a new ad request."

    .line 233
    .line 234
    invoke-static {v1, v0}, LG6/L;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 238
    .line 239
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdga;->zzc()V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzl:Lp8/p;

    .line 246
    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    const-string v0, "Show timer went off but there is an ongoing ad request."

    .line 250
    .line 251
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    const-string v0, "No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad."

    .line 258
    .line 259
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    .line 263
    .line 264
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdga;->zzc()V

    .line 267
    .line 268
    .line 269
    :goto_2
    monitor-exit p0

    .line 270
    return-void

    .line 271
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 272
    throw v0
.end method

.method public final zzd()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbjs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzg:Lcom/google/android/gms/internal/ads/zzbjs;

    return-void
.end method

.method public final zzf(LD6/v;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zze:Lcom/google/android/gms/internal/ads/zzeto;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzeto;->zza(LD6/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzflf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzk:Lcom/google/android/gms/internal/ads/zzflf;

    return-object v0
.end method

.method public final zzh()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzf:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    sget-object v1, LC6/n;->D:LC6/n;

    .line 16
    .line 17
    iget-object v1, v1, LC6/n;->c:LG6/U;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const-string v4, "power"

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Landroid/os/PowerManager;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v2, v3

    .line 40
    :goto_0
    const-string v4, "keyguard"

    .line 41
    .line 42
    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    instance-of v4, v1, Landroid/app/KeyguardManager;

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    move-object v3, v1

    .line 53
    check-cast v3, Landroid/app/KeyguardManager;

    .line 54
    .line 55
    :cond_2
    invoke-static {v0, v2, v3}, LG6/U;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzdfv;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzb:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzdix;->zzq(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzj()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdif;->zzc()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdga;->zzd(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final zzk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdif;->zzd()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzdga;->zze(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

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

.method public final synthetic zzm(LD6/K0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzd:Lcom/google/android/gms/internal/ads/zzetk;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzetk;->zzdJ(LD6/K0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzn()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfha;->zzt()V

    return-void
.end method

.method public final synthetic zzo()Lcom/google/android/gms/internal/ads/zzdga;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzh:Lcom/google/android/gms/internal/ads/zzdga;

    return-object v0
.end method

.method public final synthetic zzp()Lcom/google/android/gms/internal/ads/zzfqt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzi:Lcom/google/android/gms/internal/ads/zzfqt;

    return-object v0
.end method

.method public final synthetic zzq()Lcom/google/android/gms/internal/ads/zzdif;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzj:Lcom/google/android/gms/internal/ads/zzdif;

    return-object v0
.end method

.method public final synthetic zzr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzm:Z

    return v0
.end method

.method public final synthetic zzs(LD6/K0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfha;->zzn:LD6/K0;

    .line 2
    .line 3
    return-void
.end method
