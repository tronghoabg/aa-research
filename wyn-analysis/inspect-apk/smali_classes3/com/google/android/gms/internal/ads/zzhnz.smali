.class public final Lcom/google/android/gms/internal/ads/zzhnz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhod;


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzibk;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzidl;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzhta;

.field private final zze:Lcom/google/android/gms/internal/ads/zzhtx;

.field private final zzf:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzibk;Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzhta;Lcom/google/android/gms/internal/ads/zzhtx;Lcom/google/android/gms/internal/ads/zzhes;Lcom/google/android/gms/internal/ads/zzhet;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzb:Lcom/google/android/gms/internal/ads/zzibk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzc:Lcom/google/android/gms/internal/ads/zzidl;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzd:Lcom/google/android/gms/internal/ads/zzhta;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zze:Lcom/google/android/gms/internal/ads/zzhtx;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzf:Ljava/lang/Integer;

    return-void
.end method

.method public static zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzhta;Lcom/google/android/gms/internal/ads/zzhtx;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhnz;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhtx;->zzd:Lcom/google/android/gms/internal/ads/zzhtx;

    .line 2
    .line 3
    if-ne p3, v0, :cond_1

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 9
    .line 10
    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0

    .line 16
    :cond_1
    if-eqz p4, :cond_d

    .line 17
    .line 18
    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhok;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzibk;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhnz;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x4

    .line 29
    const/4 v4, 0x3

    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x1

    .line 32
    if-eqz v1, :cond_6

    .line 33
    .line 34
    if-eq v1, v6, :cond_5

    .line 35
    .line 36
    if-eq v1, v5, :cond_4

    .line 37
    .line 38
    if-eq v1, v4, :cond_3

    .line 39
    .line 40
    if-ne v1, v3, :cond_2

    .line 41
    .line 42
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhes;->zze:Lcom/google/android/gms/internal/ads/zzhes;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "Unknown KeyMaterialType "

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhes;->zzd:Lcom/google/android/gms/internal/ads/zzhes;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhes;->zzc:Lcom/google/android/gms/internal/ads/zzhes;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhes;->zzb:Lcom/google/android/gms/internal/ads/zzhes;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhes;->zza:Lcom/google/android/gms/internal/ads/zzhes;

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_c

    .line 77
    .line 78
    if-eq v7, v6, :cond_b

    .line 79
    .line 80
    if-eq v7, v5, :cond_a

    .line 81
    .line 82
    if-eq v7, v4, :cond_9

    .line 83
    .line 84
    if-eq v7, v3, :cond_8

    .line 85
    .line 86
    const/4 v3, 0x5

    .line 87
    if-ne v7, v3, :cond_7

    .line 88
    .line 89
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zzf:Lcom/google/android/gms/internal/ads/zzhet;

    .line 90
    .line 91
    :goto_2
    move-object v4, p2

    .line 92
    move-object v5, p3

    .line 93
    move-object v8, p4

    .line 94
    move-object v6, v1

    .line 95
    move-object v7, v3

    .line 96
    move-object v1, p0

    .line 97
    move-object v3, p1

    .line 98
    goto :goto_3

    .line 99
    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 100
    .line 101
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string p2, "Unknown OutputPrefixType "

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_8
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zze:Lcom/google/android/gms/internal/ads/zzhet;

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_9
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zzd:Lcom/google/android/gms/internal/ads/zzhet;

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_a
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zzc:Lcom/google/android/gms/internal/ads/zzhet;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_b
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zzb:Lcom/google/android/gms/internal/ads/zzhet;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_c
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhet;->zza:Lcom/google/android/gms/internal/ads/zzhet;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :goto_3
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzhnz;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzibk;Lcom/google/android/gms/internal/ads/zzidl;Lcom/google/android/gms/internal/ads/zzhta;Lcom/google/android/gms/internal/ads/zzhtx;Lcom/google/android/gms/internal/ads/zzhes;Lcom/google/android/gms/internal/ads/zzhet;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_d
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 135
    .line 136
    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    .line 137
    .line 138
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0
.end method


# virtual methods
.method public final zzb()Lcom/google/android/gms/internal/ads/zzidl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzc:Lcom/google/android/gms/internal/ads/zzidl;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzhta;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzd:Lcom/google/android/gms/internal/ads/zzhta;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzhtx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zze:Lcom/google/android/gms/internal/ads/zzhtx;

    return-object v0
.end method

.method public final zze()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzf:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzibk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zzb:Lcom/google/android/gms/internal/ads/zzibk;

    return-object v0
.end method

.method public final zzg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhnz;->zza:Ljava/lang/String;

    return-object v0
.end method
