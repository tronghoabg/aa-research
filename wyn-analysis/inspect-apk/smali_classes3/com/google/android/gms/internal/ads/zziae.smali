.class public final Lcom/google/android/gms/internal/ads/zziae;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza([B)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    and-int/lit8 v1, v0, 0x1

    .line 3
    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x84

    .line 9
    .line 10
    if-gt v0, v1, :cond_1

    .line 11
    .line 12
    shr-int/lit8 v1, v0, 0x1

    .line 13
    .line 14
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zziae;->zzc([B)[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zziae;->zzc([B)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    array-length v0, v2

    .line 31
    add-int/lit8 v1, v0, 0x4

    .line 32
    .line 33
    array-length v3, p0

    .line 34
    add-int/2addr v1, v3

    .line 35
    const/16 v4, 0x80

    .line 36
    .line 37
    const/16 v5, 0x30

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x1

    .line 42
    if-lt v1, v4, :cond_0

    .line 43
    .line 44
    add-int/lit8 v4, v1, 0x3

    .line 45
    .line 46
    new-array v4, v4, [B

    .line 47
    .line 48
    aput-byte v5, v4, v6

    .line 49
    .line 50
    const/16 v5, -0x7f

    .line 51
    .line 52
    aput-byte v5, v4, v8

    .line 53
    .line 54
    int-to-byte v1, v1

    .line 55
    aput-byte v1, v4, v7

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    add-int/lit8 v4, v1, 0x2

    .line 60
    .line 61
    new-array v4, v4, [B

    .line 62
    .line 63
    aput-byte v5, v4, v6

    .line 64
    .line 65
    int-to-byte v1, v1

    .line 66
    aput-byte v1, v4, v8

    .line 67
    .line 68
    move v1, v7

    .line 69
    :goto_0
    add-int/lit8 v5, v1, 0x1

    .line 70
    .line 71
    aput-byte v7, v4, v1

    .line 72
    .line 73
    add-int/2addr v1, v7

    .line 74
    int-to-byte v8, v0

    .line 75
    aput-byte v8, v4, v5

    .line 76
    .line 77
    invoke-static {v2, v6, v4, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    add-int/2addr v1, v0

    .line 81
    add-int/lit8 v0, v1, 0x1

    .line 82
    .line 83
    aput-byte v7, v4, v1

    .line 84
    .line 85
    add-int/2addr v1, v7

    .line 86
    int-to-byte v2, v3

    .line 87
    aput-byte v2, v4, v0

    .line 88
    .line 89
    invoke-static {p0, v6, v4, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    return-object v4

    .line 93
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 94
    .line 95
    const-string v0, "Invalid IEEE_P1363 encoding"

    .line 96
    .line 97
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zziac;)Ljava/security/spec/ECParameterSpec;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhlt;->zzc:Ljava/security/spec/ECParameterSpec;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v1, "curve not implemented:"

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhlt;->zzb:Ljava/security/spec/ECParameterSpec;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhlt;->zza:Ljava/security/spec/ECParameterSpec;

    .line 36
    .line 37
    return-object p0
.end method

.method private static zzc([B)[B
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p0

    .line 4
    if-ge v1, v2, :cond_0

    .line 5
    .line 6
    aget-byte v3, p0, v1

    .line 7
    .line 8
    if-nez v3, :cond_0

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v2, -0x1

    .line 16
    .line 17
    :cond_1
    aget-byte v3, p0, v1

    .line 18
    .line 19
    const/16 v4, 0x80

    .line 20
    .line 21
    and-int/2addr v3, v4

    .line 22
    if-ne v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    :cond_2
    sub-int/2addr v2, v1

    .line 26
    add-int v3, v2, v0

    .line 27
    .line 28
    new-array v3, v3, [B

    .line 29
    .line 30
    invoke-static {p0, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    return-object v3
.end method
