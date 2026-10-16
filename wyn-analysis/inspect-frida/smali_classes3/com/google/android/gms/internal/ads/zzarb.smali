.class public final Lcom/google/android/gms/internal/ads/zzarb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzarp;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzara;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzc:I

.field private zzd:I

.field private zze:Z

.field private zzf:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzara;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarb;->zza:Lcom/google/android/gms/internal/ads/zzara;

    .line 5
    .line 6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfj;Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zza:Lcom/google/android/gms/internal/ads/zzara;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzara;->zza(Lcom/google/android/gms/internal/ads/zzfj;Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzf:Z

    .line 8
    .line 9
    return-void
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzf:Z

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    add-int/2addr v3, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_0
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzf:Z

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    if-eqz p2, :cond_8

    .line 24
    .line 25
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzf:Z

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 28
    .line 29
    .line 30
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 31
    .line 32
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-lez p2, :cond_8

    .line 37
    .line 38
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    if-ge p2, v2, :cond_5

    .line 42
    .line 43
    if-nez p2, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    add-int/2addr v3, v1

    .line 54
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 55
    .line 56
    .line 57
    const/16 v3, 0xff

    .line 58
    .line 59
    if-ne p2, v3, :cond_3

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 68
    .line 69
    rsub-int/lit8 v3, v3, 0x3

    .line 70
    .line 71
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 82
    .line 83
    invoke-virtual {p1, v5, v6, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 84
    .line 85
    .line 86
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 87
    .line 88
    add-int/2addr v5, p2

    .line 89
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 90
    .line 91
    if-ne v5, v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    and-int/lit16 v5, p2, 0x80

    .line 107
    .line 108
    if-eqz v5, :cond_4

    .line 109
    .line 110
    move v5, v0

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move v5, v4

    .line 113
    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    iput-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzarb;->zze:Z

    .line 118
    .line 119
    and-int/lit8 p2, p2, 0xf

    .line 120
    .line 121
    shl-int/lit8 p2, p2, 0x8

    .line 122
    .line 123
    or-int/2addr p2, v6

    .line 124
    add-int/2addr p2, v2

    .line 125
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzc:I

    .line 126
    .line 127
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzc:I

    .line 132
    .line 133
    if-ge p2, v2, :cond_2

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    add-int/2addr p2, p2

    .line 140
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    const/16 v2, 0x1002

    .line 145
    .line 146
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzc(I)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzc:I

    .line 159
    .line 160
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 161
    .line 162
    sub-int/2addr v2, v3

    .line 163
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 168
    .line 169
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 174
    .line 175
    invoke-virtual {p1, v3, v5, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 176
    .line 177
    .line 178
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 179
    .line 180
    add-int/2addr v3, p2

    .line 181
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 182
    .line 183
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzc:I

    .line 184
    .line 185
    if-ne v3, p2, :cond_2

    .line 186
    .line 187
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzarb;->zze:Z

    .line 188
    .line 189
    if-eqz v3, :cond_7

    .line 190
    .line 191
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {v3, v4, p2, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzL([BIII)I

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-nez p2, :cond_6

    .line 200
    .line 201
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzc:I

    .line 202
    .line 203
    add-int/lit8 p2, p2, -0x4

    .line 204
    .line 205
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_6
    :goto_3
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzf:Z

    .line 210
    .line 211
    return-void

    .line 212
    :cond_7
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 213
    .line 214
    .line 215
    :goto_4
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 216
    .line 217
    .line 218
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzarb;->zza:Lcom/google/android/gms/internal/ads/zzara;

    .line 219
    .line 220
    invoke-interface {p2, v2}, Lcom/google/android/gms/internal/ads/zzara;->zzb(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 221
    .line 222
    .line 223
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzarb;->zzd:I

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :cond_8
    return-void
.end method
