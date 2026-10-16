.class public final LD6/k;
.super LD6/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/zzbvf;

.field public final synthetic e:LD6/o;


# direct methods
.method public constructor <init>(LD6/o;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD6/k;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, LD6/k;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LD6/k;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 9
    .line 10
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LD6/k;->e:LD6/o;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LD6/k;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "native_ad"

    .line 4
    .line 5
    invoke-static {v0, v1}, LD6/o;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LD6/h1;

    .line 9
    .line 10
    invoke-direct {v0}, LD6/G;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, LD6/k;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzmo:Lcom/google/android/gms/internal/ads/zzbio;

    .line 7
    .line 8
    sget-object v2, LD6/s;->e:LD6/s;

    .line 9
    .line 10
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, LD6/k;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    const v4, 0xf9960b0

    .line 26
    .line 27
    .line 28
    iget-object v5, p0, LD6/k;->e:LD6/o;

    .line 29
    .line 30
    const-string v6, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"

    .line 31
    .line 32
    iget-object v7, p0, LD6/k;->c:Ljava/lang/String;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    :try_start_0
    new-instance v1, Lq7/b;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v9, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"
    :try_end_0
    .catch LH6/n; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    :try_start_1
    invoke-static {v0}, Ltg/b;->X(Landroid/content/Context;)Lr7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v10, v9}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    check-cast v9, Landroid/os/IBinder;

    .line 53
    .line 54
    if-nez v9, :cond_0

    .line 55
    .line 56
    move-object v10, v8

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const-string v10, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"

    .line 59
    .line 60
    invoke-interface {v9, v10}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    instance-of v11, v10, LD6/I;

    .line 65
    .line 66
    if-eqz v11, :cond_1

    .line 67
    .line 68
    check-cast v10, LD6/I;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v10, LD6/I;

    .line 72
    .line 73
    invoke-direct {v10, v9}, LD6/I;-><init>(Landroid/os/IBinder;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 74
    .line 75
    .line 76
    :goto_0
    :try_start_2
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzbel;->zza()Landroid/os/Parcel;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-static {v9, v1}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9, v7}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v9, v2}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10, v3, v9}, Lcom/google/android/gms/internal/ads/zzbel;->zzcZ(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 101
    .line 102
    .line 103
    if-nez v2, :cond_2

    .line 104
    .line 105
    return-object v8

    .line 106
    :cond_2
    invoke-interface {v2, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    instance-of v3, v1, LD6/H;

    .line 111
    .line 112
    if-eqz v3, :cond_3

    .line 113
    .line 114
    check-cast v1, LD6/H;

    .line 115
    .line 116
    return-object v1

    .line 117
    :catch_0
    move-exception v1

    .line 118
    goto :goto_1

    .line 119
    :catch_1
    move-exception v1

    .line 120
    goto :goto_1

    .line 121
    :catch_2
    move-exception v1

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    new-instance v1, LD6/F;

    .line 124
    .line 125
    invoke-direct {v1, v2}, LD6/F;-><init>(Landroid/os/IBinder;)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :catch_3
    move-exception v1

    .line 130
    new-instance v2, LH6/n;

    .line 131
    .line 132
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw v2
    :try_end_2
    .catch LH6/n; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 136
    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcaf;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcah;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, v5, LD6/o;->f:Ljava/lang/Object;

    .line 141
    .line 142
    const-string v2, "ClientApiBroker.createAdLoaderBuilder"

    .line 143
    .line 144
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcah;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_4
    iget-object v1, v5, LD6/o;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, LD6/f1;

    .line 151
    .line 152
    :try_start_3
    new-instance v5, Lq7/b;

    .line 153
    .line 154
    invoke-direct {v5, v0}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v0}, Lq7/d;->getRemoteCreatorInstance(Landroid/content/Context;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, LD6/I;

    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbel;->zza()Landroid/os/Parcel;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v7}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzbel;->zzcZ(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 188
    .line 189
    .line 190
    if-nez v1, :cond_5

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_5
    invoke-interface {v1, v6}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    instance-of v2, v0, LD6/H;

    .line 198
    .line 199
    if-eqz v2, :cond_6

    .line 200
    .line 201
    check-cast v0, LD6/H;

    .line 202
    .line 203
    :goto_2
    move-object v8, v0

    .line 204
    goto :goto_4

    .line 205
    :catch_4
    move-exception v0

    .line 206
    goto :goto_3

    .line 207
    :catch_5
    move-exception v0

    .line 208
    goto :goto_3

    .line 209
    :cond_6
    new-instance v0, LD6/F;

    .line 210
    .line 211
    invoke-direct {v0, v1}, LD6/F;-><init>(Landroid/os/IBinder;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Lq7/c; {:try_start_3 .. :try_end_3} :catch_4

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :goto_3
    const-string v1, "Could not create remote builder for AdLoader."

    .line 216
    .line 217
    invoke-static {v1, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_4
    return-object v8
.end method

.method public final c(LD6/d0;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lq7/b;

    .line 2
    .line 3
    iget-object v1, p0, LD6/k;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LD6/k;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 9
    .line 10
    const v2, 0xf9960b0

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LD6/k;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, v0, v3, v1, v2}, LD6/d0;->e(Lq7/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;I)LD6/H;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
