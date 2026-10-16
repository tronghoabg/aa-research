.class public final Lcom/google/android/gms/internal/ads/zzfnc;
.super Lf7/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzfnc;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Landroid/content/Context;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzfmz;

.field public final zzc:I

.field public final zzd:I

.field public final zze:I

.field public final zzf:Ljava/lang/String;

.field public final zzg:I

.field private final zzh:[Lcom/google/android/gms/internal/ads/zzfmz;

.field private final zzi:I

.field private final zzj:I

.field private final zzk:I

.field private final zzl:[I

.field private final zzm:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfnd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfnd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfnc;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIILjava/lang/String;II)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfmz;->values()[Lcom/google/android/gms/internal/ads/zzfmz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzh:[Lcom/google/android/gms/internal/ads/zzfmz;

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfna;->zza()[I

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzl:[I

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfnb;->zza()[I

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzm:[I

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zza:Landroid/content/Context;

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzi:I

    .line 5
    aget-object p1, v0, p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzb:Lcom/google/android/gms/internal/ads/zzfmz;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzc:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzd:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zze:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzf:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzj:I

    .line 6
    aget p1, v1, p6

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzg:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzk:I

    .line 7
    aget p1, v2, p7

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmz;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfmz;->values()[Lcom/google/android/gms/internal/ads/zzfmz;

    move-result-object p8

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzh:[Lcom/google/android/gms/internal/ads/zzfmz;

    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfna;->zza()[I

    move-result-object p8

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzl:[I

    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfnb;->zza()[I

    move-result-object p8

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzm:[I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zza:Landroid/content/Context;

    .line 12
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzi:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzb:Lcom/google/android/gms/internal/ads/zzfmz;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzd:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zze:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzf:Ljava/lang/String;

    const-string p1, "oldest"

    invoke-virtual {p1, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const-string p1, "lru"

    invoke-virtual {p1, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x2

    if-eqz p1, :cond_2

    :cond_1
    move p1, p2

    goto :goto_0

    :cond_2
    const-string p1, "lfu"

    invoke-virtual {p1, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzg:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzj:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzk:I

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzfmz;Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzfnc;
    .locals 11

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfmz;->zza:Lcom/google/android/gms/internal/ads/zzfmz;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfnc;

    .line 6
    .line 7
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhu:Lcom/google/android/gms/internal/ads/zzbio;

    .line 8
    .line 9
    sget-object v2, LD6/s;->e:LD6/s;

    .line 10
    .line 11
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 12
    .line 13
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 24
    .line 25
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhC:Lcom/google/android/gms/internal/ads/zzbio;

    .line 38
    .line 39
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhE:Lcom/google/android/gms/internal/ads/zzbio;

    .line 52
    .line 53
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object v7, v0

    .line 60
    check-cast v7, Ljava/lang/String;

    .line 61
    .line 62
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhw:Lcom/google/android/gms/internal/ads/zzbio;

    .line 63
    .line 64
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v8, v0

    .line 71
    check-cast v8, Ljava/lang/String;

    .line 72
    .line 73
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzhy:Lcom/google/android/gms/internal/ads/zzbio;

    .line 74
    .line 75
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    move-object v9, v0

    .line 82
    check-cast v9, Ljava/lang/String;

    .line 83
    .line 84
    move-object v3, p0

    .line 85
    move-object v2, p1

    .line 86
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzfnc;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmz;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_0
    move-object v4, p0

    .line 91
    move-object v3, p1

    .line 92
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfmz;->zzb:Lcom/google/android/gms/internal/ads/zzfmz;

    .line 93
    .line 94
    if-ne v4, p0, :cond_1

    .line 95
    .line 96
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfnc;

    .line 97
    .line 98
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 99
    .line 100
    sget-object p1, LD6/s;->e:LD6/s;

    .line 101
    .line 102
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhB:Lcom/google/android/gms/internal/ads/zzbio;

    .line 115
    .line 116
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhD:Lcom/google/android/gms/internal/ads/zzbio;

    .line 129
    .line 130
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 131
    .line 132
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhF:Lcom/google/android/gms/internal/ads/zzbio;

    .line 143
    .line 144
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    move-object v8, p0

    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhx:Lcom/google/android/gms/internal/ads/zzbio;

    .line 154
    .line 155
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 156
    .line 157
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    move-object v9, p0

    .line 162
    check-cast v9, Ljava/lang/String;

    .line 163
    .line 164
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhz:Lcom/google/android/gms/internal/ads/zzbio;

    .line 165
    .line 166
    iget-object p1, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 167
    .line 168
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    move-object v10, p0

    .line 173
    check-cast v10, Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/zzfnc;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmz;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v2

    .line 179
    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfmz;->zzc:Lcom/google/android/gms/internal/ads/zzfmz;

    .line 180
    .line 181
    if-ne v4, p0, :cond_2

    .line 182
    .line 183
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfnc;

    .line 184
    .line 185
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhI:Lcom/google/android/gms/internal/ads/zzbio;

    .line 186
    .line 187
    sget-object p1, LD6/s;->e:LD6/s;

    .line 188
    .line 189
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, Ljava/lang/Integer;

    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhK:Lcom/google/android/gms/internal/ads/zzbio;

    .line 202
    .line 203
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 204
    .line 205
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhL:Lcom/google/android/gms/internal/ads/zzbio;

    .line 216
    .line 217
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 218
    .line 219
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 230
    .line 231
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 232
    .line 233
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    move-object v8, p0

    .line 238
    check-cast v8, Ljava/lang/String;

    .line 239
    .line 240
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhH:Lcom/google/android/gms/internal/ads/zzbio;

    .line 241
    .line 242
    iget-object v0, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 243
    .line 244
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    move-object v9, p0

    .line 249
    check-cast v9, Ljava/lang/String;

    .line 250
    .line 251
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbix;->zzhJ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 252
    .line 253
    iget-object p1, p1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 254
    .line 255
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    move-object v10, p0

    .line 260
    check-cast v10, Ljava/lang/String;

    .line 261
    .line 262
    invoke-direct/range {v2 .. v10}, Lcom/google/android/gms/internal/ads/zzfnc;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmz;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-object v2

    .line 266
    :cond_2
    const/4 p0, 0x0

    .line 267
    return-object p0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzi:I

    .line 2
    .line 3
    const/16 v0, 0x4f45

    .line 4
    .line 5
    invoke-static {v0, p1}, La/a;->l0(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x4

    .line 11
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzc:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzd:I

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zze:I

    .line 36
    .line 37
    invoke-static {p1, v2, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzf:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v3, 0x5

    .line 47
    invoke-static {p1, v3, p2, v1}, La/a;->a0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzj:I

    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzfnc;->zzk:I

    .line 60
    .line 61
    const/4 v1, 0x7

    .line 62
    invoke-static {p1, v1, v2}, La/a;->k0(Landroid/os/Parcel;II)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, p1}, La/a;->m0(ILandroid/os/Parcel;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
