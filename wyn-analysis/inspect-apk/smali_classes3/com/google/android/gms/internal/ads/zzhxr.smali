.class public final Lcom/google/android/gms/internal/ads/zzhxr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhns;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzhns;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzher;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzhea;

.field private static final zzf:Lcom/google/android/gms/internal/ads/zzhma;

.field private static final zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhxo;->zza:Lcom/google/android/gms/internal/ads/zzhxo;

    .line 2
    .line 3
    const-class v1, Lcom/google/android/gms/internal/ads/zzhxl;

    .line 4
    .line 5
    const-class v2, Lcom/google/android/gms/internal/ads/zzheu;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhns;->zzd(Lcom/google/android/gms/internal/ads/zzhnr;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhns;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhxr;->zzb:Lcom/google/android/gms/internal/ads/zzhns;

    .line 12
    .line 13
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhxq;->zza:Lcom/google/android/gms/internal/ads/zzhxq;

    .line 14
    .line 15
    const-class v1, Lcom/google/android/gms/internal/ads/zzhxn;

    .line 16
    .line 17
    const-class v3, Lcom/google/android/gms/internal/ads/zzhev;

    .line 18
    .line 19
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzhns;->zzd(Lcom/google/android/gms/internal/ads/zzhnr;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhns;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhxr;->zzc:Lcom/google/android/gms/internal/ads/zzhns;

    .line 24
    .line 25
    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhun;->zzl()Lcom/google/android/gms/internal/ads/zzigh;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzhmj;->zzf(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzigh;)Lcom/google/android/gms/internal/ads/zzher;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhxr;->zzd:Lcom/google/android/gms/internal/ads/zzher;

    .line 36
    .line 37
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhta;->zzd:Lcom/google/android/gms/internal/ads/zzhta;

    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhup;->zzi()Lcom/google/android/gms/internal/ads/zzigh;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    .line 44
    .line 45
    invoke-static {v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhmj;->zze(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhta;Lcom/google/android/gms/internal/ads/zzigh;)Lcom/google/android/gms/internal/ads/zzhea;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhxr;->zze:Lcom/google/android/gms/internal/ads/zzhea;

    .line 50
    .line 51
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhxp;->zza:Lcom/google/android/gms/internal/ads/zzhxp;

    .line 52
    .line 53
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhxr;->zzf:Lcom/google/android/gms/internal/ads/zzhma;

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    sput v0, Lcom/google/android/gms/internal/ads/zzhxr;->zzg:I

    .line 57
    .line 58
    return-void
.end method

.method public static zza(Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    sget p0, Lcom/google/android/gms/internal/ads/zzhxr;->zzg:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhle;->zza(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Lcom/google/android/gms/internal/ads/zzhzf;->zza:I

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhne;->zza()Lcom/google/android/gms/internal/ads/zzhne;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhzf;->zza(Lcom/google/android/gms/internal/ads/zzhne;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhna;->zza()Lcom/google/android/gms/internal/ads/zzhna;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhxj;->zza:Ljava/math/BigInteger;

    .line 28
    .line 29
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhxg;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhxg;-><init>([B)V

    .line 33
    .line 34
    .line 35
    sget-object v4, Lcom/google/android/gms/internal/ads/zzhxh;->zza:Lcom/google/android/gms/internal/ads/zzhxh;

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zzd(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zze(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 41
    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zzf(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 46
    .line 47
    .line 48
    const/16 v6, 0xc00

    .line 49
    .line 50
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhxg;->zza(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 51
    .line 52
    .line 53
    sget-object v7, Lcom/google/android/gms/internal/ads/zzhxj;->zza:Ljava/math/BigInteger;

    .line 54
    .line 55
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzhxg;->zzb(Ljava/math/BigInteger;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 56
    .line 57
    .line 58
    sget-object v8, Lcom/google/android/gms/internal/ads/zzhxi;->zza:Lcom/google/android/gms/internal/ads/zzhxi;

    .line 59
    .line 60
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzhxg;->zzc(Lcom/google/android/gms/internal/ads/zzhxi;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhxg;->zzg()Lcom/google/android/gms/internal/ads/zzhxj;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v9, "RSA_SSA_PSS_3072_SHA256_F4"

    .line 68
    .line 69
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhxg;

    .line 73
    .line 74
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhxg;-><init>([B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zzd(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zze(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zzf(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhxg;->zza(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzhxg;->zzb(Ljava/math/BigInteger;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 90
    .line 91
    .line 92
    sget-object v4, Lcom/google/android/gms/internal/ads/zzhxi;->zzd:Lcom/google/android/gms/internal/ads/zzhxi;

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zzc(Lcom/google/android/gms/internal/ads/zzhxi;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhxg;->zzg()Lcom/google/android/gms/internal/ads/zzhxj;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v5, "RSA_SSA_PSS_3072_SHA256_F4_RAW"

    .line 102
    .line 103
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const-string v2, "RSA_SSA_PSS_3072_SHA256_SHA256_32_F4"

    .line 107
    .line 108
    sget-object v5, Lcom/google/android/gms/internal/ads/zzhwp;->zzk:Lcom/google/android/gms/internal/ads/zzhxj;

    .line 109
    .line 110
    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhxg;

    .line 114
    .line 115
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhxg;-><init>([B)V

    .line 116
    .line 117
    .line 118
    sget-object v5, Lcom/google/android/gms/internal/ads/zzhxh;->zzc:Lcom/google/android/gms/internal/ads/zzhxh;

    .line 119
    .line 120
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zzd(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zze(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 124
    .line 125
    .line 126
    const/16 v6, 0x40

    .line 127
    .line 128
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhxg;->zzf(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 129
    .line 130
    .line 131
    const/16 v9, 0x1000

    .line 132
    .line 133
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzhxg;->zza(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzhxg;->zzb(Ljava/math/BigInteger;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzhxg;->zzc(Lcom/google/android/gms/internal/ads/zzhxi;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhxg;->zzg()Lcom/google/android/gms/internal/ads/zzhxj;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v8, "RSA_SSA_PSS_4096_SHA512_F4"

    .line 147
    .line 148
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhxg;

    .line 152
    .line 153
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhxg;-><init>([B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zzd(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhxg;->zze(Lcom/google/android/gms/internal/ads/zzhxh;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhxg;->zzf(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzhxg;->zza(I)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzhxg;->zzb(Ljava/math/BigInteger;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhxg;->zzc(Lcom/google/android/gms/internal/ads/zzhxi;)Lcom/google/android/gms/internal/ads/zzhxg;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhxg;->zzg()Lcom/google/android/gms/internal/ads/zzhxj;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const-string v3, "RSA_SSA_PSS_4096_SHA512_F4_RAW"

    .line 179
    .line 180
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    const-string v2, "RSA_SSA_PSS_4096_SHA512_SHA512_64_F4"

    .line 184
    .line 185
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhwp;->zzl:Lcom/google/android/gms/internal/ads/zzhxj;

    .line 186
    .line 187
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhna;->zzd(Ljava/util/Map;)V

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhnb;->zza()Lcom/google/android/gms/internal/ads/zzhnb;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxr;->zzb:Lcom/google/android/gms/internal/ads/zzhns;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhnb;->zzb(Lcom/google/android/gms/internal/ads/zzhns;)V

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhnb;->zza()Lcom/google/android/gms/internal/ads/zzhnb;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxr;->zzc:Lcom/google/android/gms/internal/ads/zzhns;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhnb;->zzb(Lcom/google/android/gms/internal/ads/zzhns;)V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhmv;->zza()Lcom/google/android/gms/internal/ads/zzhmv;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxr;->zzf:Lcom/google/android/gms/internal/ads/zzhma;

    .line 220
    .line 221
    const-class v2, Lcom/google/android/gms/internal/ads/zzhxj;

    .line 222
    .line 223
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhmv;->zzb(Lcom/google/android/gms/internal/ads/zzhma;Ljava/lang/Class;)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhmb;->zza()Lcom/google/android/gms/internal/ads/zzhmb;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxr;->zzd:Lcom/google/android/gms/internal/ads/zzher;

    .line 231
    .line 232
    const/4 v2, 0x1

    .line 233
    invoke-virtual {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzhmb;->zzf(Lcom/google/android/gms/internal/ads/zzhea;IZ)V

    .line 234
    .line 235
    .line 236
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhmb;->zza()Lcom/google/android/gms/internal/ads/zzhmb;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxr;->zze:Lcom/google/android/gms/internal/ads/zzhea;

    .line 241
    .line 242
    const/4 v2, 0x0

    .line 243
    invoke-virtual {v0, v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzhmb;->zzf(Lcom/google/android/gms/internal/ads/zzhea;IZ)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 248
    .line 249
    const-string v0, "Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available."

    .line 250
    .line 251
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p0
.end method
