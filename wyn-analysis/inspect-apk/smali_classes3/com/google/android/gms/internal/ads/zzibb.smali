.class final Lcom/google/android/gms/internal/ads/zzibb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhev;


# instance fields
.field private final zza:Ljava/security/interfaces/RSAPublicKey;

.field private final zzb:Lcom/google/android/gms/internal/ads/zziat;

.field private final zzc:[B

.field private final zzd:[B


# direct methods
.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPublicKey;Lcom/google/android/gms/internal/ads/zziat;[B[B[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhlf;->zza()Z

    .line 5
    .line 6
    .line 7
    move-result p5

    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzibi;->zzb(Lcom/google/android/gms/internal/ads/zziat;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    .line 14
    .line 15
    .line 16
    move-result-object p5

    .line 17
    invoke-virtual {p5}, Ljava/math/BigInteger;->bitLength()I

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzibi;->zzc(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzibi;->zzd(Ljava/math/BigInteger;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzibb;->zza:Ljava/security/interfaces/RSAPublicKey;

    .line 32
    .line 33
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzb:Lcom/google/android/gms/internal/ads/zziat;

    .line 34
    .line 35
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzc:[B

    .line 36
    .line 37
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzd:[B

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 41
    .line 42
    const-string p2, "Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode."

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
.end method

.method private final zzb([B[B)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzibb;->zza:Ljava/security/interfaces/RSAPublicKey;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    add-int/lit8 v2, v2, 0x7

    .line 16
    .line 17
    div-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    array-length v3, p1

    .line 20
    if-ne v2, v3, :cond_8

    .line 21
    .line 22
    new-instance v3, Ljava/math/BigInteger;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-direct {v3, v4, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-gez p1, :cond_7

    .line 33
    .line 34
    invoke-virtual {v3, v1, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/ads/zzhlh;->zzb(Ljava/math/BigInteger;I)[B

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzb:Lcom/google/android/gms/internal/ads/zziat;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzibi;->zzb(Lcom/google/android/gms/internal/ads/zziat;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Lcom/google/android/gms/internal/ads/zziak;->zzd:Lcom/google/android/gms/internal/ads/zziak;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzibh;->zzb(Lcom/google/android/gms/internal/ads/zziat;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zziak;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/security/MessageDigest;

    .line 58
    .line 59
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzd:[B

    .line 63
    .line 64
    array-length v3, p2

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v3, 0x2

    .line 79
    if-eq v1, v3, :cond_3

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    if-eq v1, v5, :cond_2

    .line 83
    .line 84
    const/4 v5, 0x4

    .line 85
    if-ne v1, v5, :cond_1

    .line 86
    .line 87
    const-string v0, "3051300d060960864801650304020305000440"

    .line 88
    .line 89
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zziau;->zza(Ljava/lang/String;)[B

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    const-string v0, "Unsupported hash "

    .line 101
    .line 102
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_2
    const-string v0, "3041300d060960864801650304020205000430"

    .line 111
    .line 112
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zziau;->zza(Ljava/lang/String;)[B

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    goto :goto_0

    .line 117
    :cond_3
    const-string v0, "3031300d060960864801650304020105000420"

    .line 118
    .line 119
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zziau;->zza(Ljava/lang/String;)[B

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_0
    array-length v1, p2

    .line 124
    array-length v5, v0

    .line 125
    add-int/2addr v5, v1

    .line 126
    add-int/lit8 v1, v5, 0xb

    .line 127
    .line 128
    if-lt v2, v1, :cond_6

    .line 129
    .line 130
    new-array v1, v2, [B

    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    aput-byte v6, v1, v6

    .line 134
    .line 135
    aput-byte v4, v1, v4

    .line 136
    .line 137
    move v4, v6

    .line 138
    :goto_1
    add-int/lit8 v7, v3, 0x1

    .line 139
    .line 140
    sub-int v8, v2, v5

    .line 141
    .line 142
    add-int/lit8 v8, v8, -0x3

    .line 143
    .line 144
    if-ge v4, v8, :cond_4

    .line 145
    .line 146
    const/4 v8, -0x1

    .line 147
    aput-byte v8, v1, v3

    .line 148
    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    move v3, v7

    .line 152
    goto :goto_1

    .line 153
    :cond_4
    aput-byte v6, v1, v3

    .line 154
    .line 155
    array-length v2, v0

    .line 156
    invoke-static {v0, v6, v1, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    .line 158
    .line 159
    array-length v0, p2

    .line 160
    add-int/2addr v7, v2

    .line 161
    invoke-static {p2, v6, v1, v7, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_5

    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 172
    .line 173
    const-string p2, "invalid signature"

    .line 174
    .line 175
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 180
    .line 181
    const-string p2, "intended encoded message length too short"

    .line 182
    .line 183
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 188
    .line 189
    const-string p2, "signature out of range"

    .line 190
    .line 191
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw p1

    .line 195
    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 196
    .line 197
    const-string p2, "invalid signature\'s length"

    .line 198
    .line 199
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1
.end method


# virtual methods
.method public final zza([B[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzibb;->zzc:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzibb;->zzb([B[B)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhok;->zze([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    array-length v0, p1

    .line 17
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzibb;->zzb([B[B)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 26
    .line 27
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
