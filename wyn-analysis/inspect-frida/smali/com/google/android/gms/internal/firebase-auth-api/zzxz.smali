.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzxz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Ljava/security/interfaces/ECPrivateKey;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzxz;->zza:Ljava/security/interfaces/ECPrivateKey;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zza([BLjava/lang/String;[B[BILcom/google/android/gms/internal/firebase-auth-api/zzyd;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzxz;->zza:Ljava/security/interfaces/ECPrivateKey;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p6, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyb;->zza(Ljava/security/spec/ECParameterSpec;Lcom/google/android/gms/internal/firebase-auth-api/zzyd;[B)Ljava/security/interfaces/ECPublicKey;

    .line 8
    .line 9
    .line 10
    move-result-object p6

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzxz;->zza:Ljava/security/interfaces/ECPrivateKey;

    .line 12
    .line 13
    invoke-static {v0, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzyb;->zza(Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p6

    .line 17
    const/4 v0, 0x2

    .line 18
    new-array v0, v0, [[B

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    aput-object p1, v0, v1

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    aput-object p6, v0, p1

    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzxv;->zza([[B)[B

    .line 27
    .line 28
    .line 29
    move-result-object p6

    .line 30
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzyf;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzyf;

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzyf;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljavax/crypto/Mac;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    mul-int/lit16 v2, v2, 0xff

    .line 43
    .line 44
    if-gt p5, v2, :cond_3

    .line 45
    .line 46
    if-eqz p3, :cond_1

    .line 47
    .line 48
    array-length v2, p3

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 53
    .line 54
    invoke-direct {v2, p3, p2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    new-instance p3, Ljavax/crypto/spec/SecretKeySpec;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljavax/crypto/Mac;->getMacLength()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    new-array v2, v2, [B

    .line 68
    .line 69
    invoke-direct {p3, v2, p2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {v0, p6}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    new-array p6, p5, [B

    .line 80
    .line 81
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 82
    .line 83
    invoke-direct {v2, p3, p2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 87
    .line 88
    .line 89
    new-array p2, v1, [B

    .line 90
    .line 91
    move p3, p1

    .line 92
    move v2, v1

    .line 93
    :goto_2
    invoke-virtual {v0, p2}, Ljavax/crypto/Mac;->update([B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p4}, Ljavax/crypto/Mac;->update([B)V

    .line 97
    .line 98
    .line 99
    int-to-byte p2, p3

    .line 100
    invoke-virtual {v0, p2}, Ljavax/crypto/Mac;->update(B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    array-length v3, p2

    .line 108
    add-int/2addr v3, v2

    .line 109
    if-ge v3, p5, :cond_2

    .line 110
    .line 111
    array-length v3, p2

    .line 112
    invoke-static {p2, v1, p6, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    .line 114
    .line 115
    array-length v3, p2

    .line 116
    add-int/2addr v2, v3

    .line 117
    add-int/2addr p3, p1

    .line 118
    goto :goto_2

    .line 119
    :cond_2
    sub-int/2addr p5, v2

    .line 120
    invoke-static {p2, v1, p6, v2, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    .line 122
    .line 123
    return-object p6

    .line 124
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 125
    .line 126
    const-string p2, "size too large"

    .line 127
    .line 128
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method
