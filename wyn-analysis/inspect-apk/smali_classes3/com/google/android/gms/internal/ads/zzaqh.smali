.class public final Lcom/google/android/gms/internal/ads/zzaqh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzard;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaqr;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzaqr;

.field private final zze:Lcom/google/android/gms/internal/ads/zzaqr;

.field private zzf:J

.field private final zzg:[Z

.field private zzh:Ljava/lang/String;

.field private zzi:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzj:Lcom/google/android/gms/internal/ads/zzaqg;

.field private zzk:Z

.field private zzl:J

.field private zzm:Z

.field private final zzn:Lcom/google/android/gms/internal/ads/zzeu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzard;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 5
    .line 6
    const-string p1, "video/mp2t"

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    new-array p1, p1, [Z

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzg:[Z

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqr;

    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    const/16 p3, 0x80

    .line 19
    .line 20
    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzc:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 24
    .line 25
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqr;

    .line 26
    .line 27
    const/16 p2, 0x8

    .line 28
    .line 29
    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;-><init>(II)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzd:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqr;

    .line 35
    .line 36
    const/4 p2, 0x6

    .line 37
    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;-><init>(II)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zze:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 41
    .line 42
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 48
    .line 49
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 50
    .line 51
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzn:Lcom/google/android/gms/internal/ads/zzeu;

    .line 55
    .line 56
    return-void
.end method

.method private final zzf(JIJ)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzc:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 6
    .line 7
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzc(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzd:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 11
    .line 12
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzc(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zze:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzc(I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 21
    .line 22
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzm:Z

    .line 23
    .line 24
    move-wide v2, p1

    .line 25
    move v4, p3

    .line 26
    move-wide v5, p4

    .line 27
    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzaqg;->zzd(JIJZ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private final zzg([BII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzc:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzd([BII)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzd:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzd([BII)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zze:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqr;->zzd([BII)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final zzh(JIIJ)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzc:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 9
    .line 10
    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/zzaqr;->zze(I)Z

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzd:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 14
    .line 15
    invoke-virtual {v2, p4}, Lcom/google/android/gms/internal/ads/zzaqr;->zze(I)Z

    .line 16
    .line 17
    .line 18
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zzb()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaqr;->zzb()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 40
    .line 41
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 42
    .line 43
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 51
    .line 52
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 53
    .line 54
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 62
    .line 63
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 64
    .line 65
    invoke-static {v4, v1, v5}, Lcom/google/android/gms/internal/ads/zzgr;->zze([BII)Lcom/google/android/gms/internal/ads/zzgq;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 70
    .line 71
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 72
    .line 73
    invoke-static {v5, v1, v6}, Lcom/google/android/gms/internal/ads/zzgr;->zzh([BII)Lcom/google/android/gms/internal/ads/zzgp;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgq;->zza:I

    .line 78
    .line 79
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzb:I

    .line 80
    .line 81
    iget v8, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzc:I

    .line 82
    .line 83
    invoke-static {v6, v7, v8}, Lcom/google/android/gms/internal/ads/zzdr;->zzb(III)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 88
    .line 89
    new-instance v8, Lcom/google/android/gms/internal/ads/zzt;

    .line 90
    .line 91
    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzh:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 97
    .line 98
    .line 99
    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzb:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 102
    .line 103
    .line 104
    const-string v9, "video/avc"

    .line 105
    .line 106
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 110
    .line 111
    .line 112
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgq;->zze:I

    .line 113
    .line 114
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzv(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 115
    .line 116
    .line 117
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzf:I

    .line 118
    .line 119
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzw(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 120
    .line 121
    .line 122
    new-instance v6, Lcom/google/android/gms/internal/ads/zzh;

    .line 123
    .line 124
    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzh;-><init>()V

    .line 125
    .line 126
    .line 127
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzj:I

    .line 128
    .line 129
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzh;->zza(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 130
    .line 131
    .line 132
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzk:I

    .line 133
    .line 134
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzh;->zzb(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 135
    .line 136
    .line 137
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzl:I

    .line 138
    .line 139
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzh;->zzc(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 140
    .line 141
    .line 142
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzh:I

    .line 143
    .line 144
    add-int/lit8 v9, v9, 0x8

    .line 145
    .line 146
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzh;->zze(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 147
    .line 148
    .line 149
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzi:I

    .line 150
    .line 151
    add-int/lit8 v9, v9, 0x8

    .line 152
    .line 153
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzh;->zzf(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzh;->zzg()Lcom/google/android/gms/internal/ads/zzi;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzE(Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzt;

    .line 161
    .line 162
    .line 163
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzg:F

    .line 164
    .line 165
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzB(F)Lcom/google/android/gms/internal/ads/zzt;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 169
    .line 170
    .line 171
    iget v3, v4, Lcom/google/android/gms/internal/ads/zzgq;->zzm:I

    .line 172
    .line 173
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzq(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-interface {v7, v6}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 181
    .line 182
    .line 183
    const/4 v6, 0x1

    .line 184
    iput-boolean v6, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 185
    .line 186
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 187
    .line 188
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzard;->zzb(I)V

    .line 189
    .line 190
    .line 191
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 192
    .line 193
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzaqg;->zza(Lcom/google/android/gms/internal/ads/zzgq;)V

    .line 194
    .line 195
    .line 196
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 197
    .line 198
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzaqg;->zzb(Lcom/google/android/gms/internal/ads/zzgp;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zzb()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_2

    .line 213
    .line 214
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 215
    .line 216
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 217
    .line 218
    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/ads/zzgr;->zze([BII)Lcom/google/android/gms/internal/ads/zzgq;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 223
    .line 224
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzgq;->zzm:I

    .line 225
    .line 226
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzard;->zzb(I)V

    .line 227
    .line 228
    .line 229
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 230
    .line 231
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzaqg;->zza(Lcom/google/android/gms/internal/ads/zzgq;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 235
    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaqr;->zzb()Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    iget-object v0, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 245
    .line 246
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 247
    .line 248
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzgr;->zzh([BII)Lcom/google/android/gms/internal/ads/zzgp;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 253
    .line 254
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzaqg;->zzb(Lcom/google/android/gms/internal/ads/zzgp;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 258
    .line 259
    .line 260
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zze:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 261
    .line 262
    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/zzaqr;->zze(I)Z

    .line 263
    .line 264
    .line 265
    move-result p4

    .line 266
    if-eqz p4, :cond_4

    .line 267
    .line 268
    iget-object p4, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 269
    .line 270
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 271
    .line 272
    invoke-static {p4, v2}, Lcom/google/android/gms/internal/ads/zzgr;->zza([BI)I

    .line 273
    .line 274
    .line 275
    move-result p4

    .line 276
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzn:Lcom/google/android/gms/internal/ads/zzeu;

    .line 277
    .line 278
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 279
    .line 280
    invoke-virtual {v2, v0, p4}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 284
    .line 285
    .line 286
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 287
    .line 288
    move-wide v0, p5

    .line 289
    invoke-virtual {p4, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzard;->zzc(JLcom/google/android/gms/internal/ads/zzeu;)V

    .line 290
    .line 291
    .line 292
    :cond_4
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 293
    .line 294
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzk:Z

    .line 295
    .line 296
    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzaqg;->zze(JIZ)Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-eqz p1, :cond_5

    .line 301
    .line 302
    const/4 p1, 0x0

    .line 303
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzm:Z

    .line 304
    .line 305
    :cond_5
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzm:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzg:[Z

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgr;->zzj([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzc:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzd:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zze:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzard;->zze()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqg;->zzc()V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zza()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzc()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzh:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzb()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqg;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v0, v2, v2}, Lcom/google/android/gms/internal/ads/zzaqg;-><init>(Lcom/google/android/gms/internal/ads/zzahm;ZZ)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzj:Lcom/google/android/gms/internal/ads/zzaqg;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzard;->zza(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final zzc(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    and-int/lit8 p1, p3, 0x2

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzm:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzm:Z

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 15

    .line 1
    const/4 v7, 0x3

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    int-to-long v4, v4

    .line 28
    add-long/2addr v2, v4

    .line 29
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 32
    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    move-object/from16 v4, p1

    .line 38
    .line 39
    invoke-interface {v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzg:[Z

    .line 43
    .line 44
    invoke-static {v9, v1, v8, v2}, Lcom/google/android/gms/internal/ads/zzgr;->zzi([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eq v2, v8, :cond_3

    .line 49
    .line 50
    add-int/lit8 v3, v2, 0x3

    .line 51
    .line 52
    aget-byte v3, v9, v3

    .line 53
    .line 54
    and-int/lit8 v10, v3, 0x1f

    .line 55
    .line 56
    if-lez v2, :cond_0

    .line 57
    .line 58
    add-int/lit8 v3, v2, -0x1

    .line 59
    .line 60
    aget-byte v4, v9, v3

    .line 61
    .line 62
    if-nez v4, :cond_0

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    move v12, v2

    .line 66
    move v11, v3

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    move v11, v2

    .line 69
    move v12, v7

    .line 70
    :goto_1
    sub-int v2, v11, v1

    .line 71
    .line 72
    if-lez v2, :cond_1

    .line 73
    .line 74
    invoke-direct {p0, v9, v1, v11}, Lcom/google/android/gms/internal/ads/zzaqh;->zzg([BII)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sub-int v3, v8, v11

    .line 78
    .line 79
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 80
    .line 81
    int-to-long v13, v3

    .line 82
    sub-long/2addr v4, v13

    .line 83
    if-gez v2, :cond_2

    .line 84
    .line 85
    neg-int v1, v2

    .line 86
    :goto_2
    move-wide v13, v4

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    const/4 v1, 0x0

    .line 89
    goto :goto_2

    .line 90
    :goto_3
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 91
    .line 92
    move-object v0, p0

    .line 93
    move v4, v1

    .line 94
    move-wide v1, v13

    .line 95
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzaqh;->zzh(JIIJ)V

    .line 96
    .line 97
    .line 98
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 99
    .line 100
    move v3, v10

    .line 101
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzaqh;->zzf(JIJ)V

    .line 102
    .line 103
    .line 104
    add-int v1, v11, v12

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    invoke-direct {p0, v9, v1, v8}, Lcom/google/android/gms/internal/ads/zzaqh;->zzg([BII)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final zze(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zza:Lcom/google/android/gms/internal/ads/zzard;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzard;->zzd()V

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzaqh;->zzh(JIIJ)V

    .line 23
    .line 24
    .line 25
    move-object v7, v0

    .line 26
    iget-wide v8, v7, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 27
    .line 28
    const/16 v10, 0x9

    .line 29
    .line 30
    iget-wide v11, v7, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 31
    .line 32
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/zzaqh;->zzf(JIJ)V

    .line 33
    .line 34
    .line 35
    iget-wide v8, v7, Lcom/google/android/gms/internal/ads/zzaqh;->zzf:J

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    iget-wide v12, v7, Lcom/google/android/gms/internal/ads/zzaqh;->zzl:J

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzaqh;->zzh(JIIJ)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
