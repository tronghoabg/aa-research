.class public final Lcom/google/android/gms/internal/ads/zzafz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[I

.field private static final zzc:[I

.field private static final zzd:[I

.field private static final zze:[I

.field private static final zzf:[I

.field private static final zzg:[I

.field private static final zzh:[I

.field private static final zzi:[I

.field private static final zzj:[I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v0, 0x8

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x6

    const/16 v5, 0x10

    new-array v6, v5, [I

    fill-array-data v6, :array_0

    sput-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zzb:[I

    new-array v6, v5, [I

    fill-array-data v6, :array_1

    sput-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zzc:[I

    const/16 v6, 0x1d

    new-array v6, v6, [I

    fill-array-data v6, :array_2

    sput-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zzd:[I

    new-array v6, v5, [I

    fill-array-data v6, :array_3

    sput-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zze:[I

    const/16 v6, 0xa

    const/16 v7, 0xc

    filled-new-array {v3, v0, v6, v7}, [I

    move-result-object v8

    sput-object v8, Lcom/google/android/gms/internal/ads/zzafz;->zzf:[I

    const/16 v8, 0xf

    const/16 v9, 0x9

    filled-new-array {v4, v9, v7, v8}, [I

    move-result-object v8

    sput-object v8, Lcom/google/android/gms/internal/ads/zzafz;->zzg:[I

    filled-new-array {v1, v2, v4, v0}, [I

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzafz;->zzh:[I

    const/16 v1, 0xd

    const/16 v2, 0xb

    filled-new-array {v9, v2, v1, v5}, [I

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzafz;->zzi:[I

    filled-new-array {v3, v0, v6, v7}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzafz;->zzj:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x2
        0x2
        0x2
        0x3
        0x3
        0x4
        0x4
        0x5
        0x6
        0x6
        0x6
        0x7
        0x8
        0x8
    .end array-data

    :array_1
    .array-data 4
        -0x1
        0x1f40
        0x3e80
        0x7d00
        -0x1
        -0x1
        0x2b11
        0x5622
        0xac44
        -0x1
        -0x1
        0x2ee0
        0x5dc0
        0xbb80
        -0x1
        -0x1
    .end array-data

    :array_2
    .array-data 4
        0x40
        0x70
        0x80
        0xc0
        0xe0
        0x100
        0x180
        0x1c0
        0x200
        0x280
        0x300
        0x380
        0x400
        0x480
        0x500
        0x600
        0x780
        0x800
        0x900
        0xa00
        0xa80
        0xb00
        0xb07
        0xb80
        0xc00
        0xf00
        0x1000
        0x1800
        0x1e00
    .end array-data

    :array_3
    .array-data 4
        0x1f40
        0x3e80
        0x7d00
        0xfa00
        0x1f400
        0x5622
        0xac44
        0x15888
        0x2b110
        0x56220
        0x2ee0
        0x5dc0
        0xbb80
        0x17700
        0x2ee00
        0x5dc00
    .end array-data
.end method

.method public static zza(I)I
    .locals 1

    const v0, 0x7ffe8001

    if-eq p0, v0, :cond_7

    const v0, -0x180fe80

    if-eq p0, v0, :cond_7

    const v0, 0x1fffe800

    if-eq p0, v0, :cond_7

    const v0, -0xe0ff18

    if-ne p0, v0, :cond_0

    goto :goto_3

    :cond_0
    const v0, 0x64582025

    if-eq p0, v0, :cond_6

    const v0, 0x25205864

    if-ne p0, v0, :cond_1

    goto :goto_2

    :cond_1
    const v0, 0x40411bf2

    if-eq p0, v0, :cond_5

    const v0, -0xde4bec0

    if-ne p0, v0, :cond_2

    goto :goto_1

    :cond_2
    const v0, 0x71c442e8

    if-eq p0, v0, :cond_4

    const v0, -0x17bd3b8f

    if-ne p0, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x4

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x3

    return p0

    :cond_6
    :goto_2
    const/4 p0, 0x2

    return p0

    :cond_7
    :goto_3
    const/4 p0, 0x1

    return p0
.end method

.method public static zzb([BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzafz;->zzi([B)Lcom/google/android/gms/internal/ads/zzet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 p4, 0x3c

    .line 6
    .line 7
    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    const/4 p4, 0x6

    .line 11
    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    sget-object p5, Lcom/google/android/gms/internal/ads/zzafz;->zzb:[I

    .line 16
    .line 17
    aget p4, p5, p4

    .line 18
    .line 19
    const/4 p5, 0x4

    .line 20
    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 21
    .line 22
    .line 23
    move-result p5

    .line 24
    sget-object v0, Lcom/google/android/gms/internal/ads/zzafz;->zzc:[I

    .line 25
    .line 26
    aget p5, v0, p5

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v1, 0x1d

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    if-lt v0, v1, :cond_0

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzafz;->zzd:[I

    .line 41
    .line 42
    aget v0, v1, v0

    .line 43
    .line 44
    mul-int/lit16 v0, v0, 0x3e8

    .line 45
    .line 46
    div-int/2addr v0, v2

    .line 47
    :goto_0
    const/16 v1, 0xa

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-lez p0, :cond_1

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    :goto_1
    add-int/2addr p4, p0

    .line 62
    new-instance p0, Lcom/google/android/gms/internal/ads/zzt;

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 68
    .line 69
    .line 70
    const-string p1, "video/mp2t"

    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 73
    .line 74
    .line 75
    const-string p1, "audio/vnd.dts"

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 87
    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzs(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/ads/zzt;->zzg(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public static zzc([B)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-byte v1, p0, v0

    .line 3
    .line 4
    const/4 v2, -0x2

    .line 5
    const/4 v3, 0x7

    .line 6
    const/4 v4, 0x6

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x4

    .line 9
    if-eq v1, v2, :cond_2

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    const/16 v2, 0x1f

    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    aget-byte v1, p0, v1

    .line 20
    .line 21
    and-int/lit8 v1, v1, 0x3

    .line 22
    .line 23
    shl-int/lit8 v1, v1, 0xc

    .line 24
    .line 25
    aget-byte v2, p0, v4

    .line 26
    .line 27
    and-int/lit16 v2, v2, 0xff

    .line 28
    .line 29
    shl-int/2addr v2, v6

    .line 30
    aget-byte p0, p0, v3

    .line 31
    .line 32
    :goto_0
    and-int/lit16 p0, p0, 0xf0

    .line 33
    .line 34
    shr-int/2addr p0, v6

    .line 35
    or-int/2addr v1, v2

    .line 36
    or-int/2addr p0, v1

    .line 37
    add-int/2addr p0, v5

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    aget-byte v0, p0, v4

    .line 40
    .line 41
    and-int/lit8 v0, v0, 0x3

    .line 42
    .line 43
    shl-int/lit8 v0, v0, 0xc

    .line 44
    .line 45
    aget-byte v1, p0, v3

    .line 46
    .line 47
    and-int/lit16 v1, v1, 0xff

    .line 48
    .line 49
    shl-int/2addr v1, v6

    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    aget-byte p0, p0, v2

    .line 53
    .line 54
    :goto_1
    and-int/lit8 p0, p0, 0x3c

    .line 55
    .line 56
    shr-int/lit8 p0, p0, 0x2

    .line 57
    .line 58
    or-int/2addr v0, v1

    .line 59
    or-int/2addr p0, v0

    .line 60
    add-int/2addr p0, v5

    .line 61
    move v0, v5

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    aget-byte v0, p0, v3

    .line 64
    .line 65
    and-int/lit8 v0, v0, 0x3

    .line 66
    .line 67
    shl-int/lit8 v0, v0, 0xc

    .line 68
    .line 69
    aget-byte v1, p0, v4

    .line 70
    .line 71
    and-int/lit16 v1, v1, 0xff

    .line 72
    .line 73
    shl-int/2addr v1, v6

    .line 74
    const/16 v2, 0x9

    .line 75
    .line 76
    aget-byte p0, p0, v2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    aget-byte v1, p0, v6

    .line 80
    .line 81
    and-int/lit8 v1, v1, 0x3

    .line 82
    .line 83
    shl-int/lit8 v1, v1, 0xc

    .line 84
    .line 85
    aget-byte v2, p0, v3

    .line 86
    .line 87
    and-int/lit16 v2, v2, 0xff

    .line 88
    .line 89
    shl-int/2addr v2, v6

    .line 90
    aget-byte p0, p0, v4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_2
    if-eqz v0, :cond_3

    .line 94
    .line 95
    mul-int/lit8 p0, p0, 0x10

    .line 96
    .line 97
    div-int/lit8 p0, p0, 0xe

    .line 98
    .line 99
    :cond_3
    return p0
.end method

.method public static zzd([B)Lcom/google/android/gms/internal/ads/zzafy;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    invoke-static/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzafz;->zzi([B)Lcom/google/android/gms/internal/ads/zzet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x28

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eq v4, v3, :cond_0

    .line 21
    .line 22
    const/16 v5, 0x10

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/16 v5, 0x14

    .line 26
    .line 27
    :goto_0
    const/16 v6, 0xc

    .line 28
    .line 29
    const/16 v7, 0x8

    .line 30
    .line 31
    if-eq v4, v3, :cond_1

    .line 32
    .line 33
    move v3, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v3, v6

    .line 36
    :goto_1
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/lit8 v12, v3, 0x1

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v8, -0x1

    .line 50
    const/4 v9, 0x0

    .line 51
    if-eqz v3, :cond_7

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    const/4 v11, 0x3

    .line 58
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    add-int/2addr v13, v4

    .line 63
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-eqz v14, :cond_2

    .line 68
    .line 69
    const/16 v14, 0x24

    .line 70
    .line 71
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    add-int/2addr v14, v4

    .line 79
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    add-int/2addr v11, v4

    .line 84
    if-ne v14, v4, :cond_6

    .line 85
    .line 86
    if-ne v11, v4, :cond_6

    .line 87
    .line 88
    add-int/2addr v2, v4

    .line 89
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    move v14, v9

    .line 94
    :goto_2
    if-ge v14, v2, :cond_4

    .line 95
    .line 96
    shr-int v15, v11, v14

    .line 97
    .line 98
    and-int/2addr v15, v4

    .line 99
    if-ne v15, v4, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 102
    .line 103
    .line 104
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    mul-int/lit16 v13, v13, 0x200

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    add-int/2addr v2, v4

    .line 123
    shl-int/2addr v2, v1

    .line 124
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    add-int/2addr v11, v4

    .line 129
    :goto_3
    if-ge v9, v11, :cond_5

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v9, v9, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    move v9, v13

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const-string v0, "Multiple audio presentations or assets not supported"

    .line 140
    .line 141
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    throw v0

    .line 146
    :cond_7
    move v10, v8

    .line 147
    :goto_4
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 151
    .line 152
    .line 153
    if-eqz v3, :cond_b

    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/4 v5, 0x4

    .line 160
    if-eqz v2, :cond_8

    .line 161
    .line 162
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_9

    .line 170
    .line 171
    const/16 v2, 0x18

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 174
    .line 175
    .line 176
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_a

    .line 181
    .line 182
    const/16 v2, 0xa

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    add-int/2addr v2, v4

    .line 189
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 190
    .line 191
    .line 192
    :cond_a
    const/4 v2, 0x5

    .line 193
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 194
    .line 195
    .line 196
    sget-object v2, Lcom/google/android/gms/internal/ads/zzafz;->zze:[I

    .line 197
    .line 198
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    aget v2, v2, v5

    .line 203
    .line 204
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    add-int/lit8 v8, v0, 0x1

    .line 209
    .line 210
    :goto_5
    move v11, v2

    .line 211
    goto :goto_6

    .line 212
    :cond_b
    const v2, -0x7fffffff

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :goto_6
    if-eqz v3, :cond_f

    .line 217
    .line 218
    if-eqz v10, :cond_e

    .line 219
    .line 220
    if-eq v10, v4, :cond_d

    .line 221
    .line 222
    if-ne v10, v1, :cond_c

    .line 223
    .line 224
    const v0, 0xbb80

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_c
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    add-int/lit8 v0, v0, 0x33

    .line 239
    .line 240
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 241
    .line 242
    .line 243
    const-string v0, "Unsupported reference clock code in DTS HD header: "

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const/4 v1, 0x0

    .line 256
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    throw v0

    .line 261
    :cond_d
    const v0, 0xac44

    .line 262
    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_e
    const/16 v0, 0x7d00

    .line 266
    .line 267
    :goto_7
    int-to-long v1, v9

    .line 268
    int-to-long v5, v0

    .line 269
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 270
    .line 271
    const-wide/32 v3, 0xf4240

    .line 272
    .line 273
    .line 274
    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 275
    .line 276
    .line 277
    move-result-wide v0

    .line 278
    :goto_8
    move-wide v13, v0

    .line 279
    move v10, v8

    .line 280
    goto :goto_9

    .line 281
    :cond_f
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :goto_9
    new-instance v8, Lcom/google/android/gms/internal/ads/zzafy;

    .line 288
    .line 289
    const/4 v15, 0x0

    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const-string v9, "audio/vnd.dts.hd;profile=lbr"

    .line 293
    .line 294
    invoke-direct/range {v8 .. v16}, Lcom/google/android/gms/internal/ads/zzafy;-><init>(Ljava/lang/String;IIIJI[B)V

    .line 295
    .line 296
    .line 297
    return-object v8
.end method

.method public static zze([B)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzafz;->zzi([B)Lcom/google/android/gms/internal/ads/zzet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2a

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v1, v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v0, 0xc

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public static zzf([BLjava/util/concurrent/atomic/AtomicInteger;)Lcom/google/android/gms/internal/ads/zzafy;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzafz;->zzi([B)Lcom/google/android/gms/internal/ads/zzet;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget-object v3, Lcom/google/android/gms/internal/ads/zzafz;->zzf:[I

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    add-int/lit8 v5, v3, 0x1

    .line 21
    .line 22
    const v6, 0x40411bf2

    .line 23
    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    if-ne v2, v6, :cond_0

    .line 27
    .line 28
    move v2, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v7

    .line 31
    :goto_0
    if-eqz v2, :cond_a

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_9

    .line 38
    .line 39
    add-int/lit8 v6, v3, -0x1

    .line 40
    .line 41
    aget-byte v8, v0, v6

    .line 42
    .line 43
    shl-int/lit8 v8, v8, 0x8

    .line 44
    .line 45
    aget-byte v3, v0, v3

    .line 46
    .line 47
    and-int/lit16 v3, v3, 0xff

    .line 48
    .line 49
    const v9, 0xffff

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v6, v9}, Lcom/google/android/gms/internal/ads/zzfm;->zzM([BIII)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-char v6, v8

    .line 57
    or-int/2addr v3, v6

    .line 58
    const/4 v6, 0x0

    .line 59
    if-ne v3, v0, :cond_8

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    if-eq v3, v4, :cond_2

    .line 69
    .line 70
    if-ne v3, v0, :cond_1

    .line 71
    .line 72
    const/16 v3, 0x180

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x33

    .line 86
    .line 87
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-string v0, "Unsupported base duration index in DTS UHD header: "

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    throw v0

    .line 107
    :cond_2
    const/16 v3, 0x1e0

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    const/16 v3, 0x200

    .line 111
    .line 112
    :goto_1
    const/4 v8, 0x3

    .line 113
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    add-int/2addr v8, v4

    .line 118
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_6

    .line 123
    .line 124
    if-eq v9, v4, :cond_5

    .line 125
    .line 126
    if-ne v9, v0, :cond_4

    .line 127
    .line 128
    const v6, 0xbb80

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    add-int/lit8 v0, v0, 0x30

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 145
    .line 146
    .line 147
    const-string v0, "Unsupported clock rate index in DTS UHD header: "

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    throw v0

    .line 164
    :cond_5
    const v6, 0xac44

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    const/16 v6, 0x7d00

    .line 169
    .line 170
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_7

    .line 175
    .line 176
    const/16 v9, 0x24

    .line 177
    .line 178
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 179
    .line 180
    .line 181
    :cond_7
    mul-int/2addr v3, v8

    .line 182
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    shl-int v0, v4, v0

    .line 187
    .line 188
    mul-int/2addr v0, v6

    .line 189
    int-to-long v12, v6

    .line 190
    int-to-long v8, v3

    .line 191
    const-wide/32 v10, 0xf4240

    .line 192
    .line 193
    .line 194
    sget-object v14, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 195
    .line 196
    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v8

    .line 200
    :goto_3
    move v13, v0

    .line 201
    move-wide v15, v8

    .line 202
    goto :goto_4

    .line 203
    :cond_8
    const-string v0, "CRC check failed"

    .line 204
    .line 205
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    throw v0

    .line 210
    :cond_9
    const-string v0, "Only supports full channel mask-based audio presentation"

    .line 211
    .line 212
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    throw v0

    .line 217
    :cond_a
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    const v0, -0x7fffffff

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :goto_4
    move v0, v7

    .line 227
    move v3, v0

    .line 228
    :goto_5
    if-ge v0, v2, :cond_b

    .line 229
    .line 230
    sget-object v0, Lcom/google/android/gms/internal/ads/zzafz;->zzg:[I

    .line 231
    .line 232
    invoke-static {v1, v0, v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    add-int/2addr v3, v0

    .line 237
    move v0, v4

    .line 238
    goto :goto_5

    .line 239
    :cond_b
    move v0, v7

    .line 240
    :goto_6
    if-gtz v0, :cond_e

    .line 241
    .line 242
    if-eqz v2, :cond_c

    .line 243
    .line 244
    sget-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zzh:[I

    .line 245
    .line 246
    invoke-static {v1, v6, v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    move-object/from16 v8, p1

    .line 251
    .line 252
    invoke-virtual {v8, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_c
    move-object/from16 v8, p1

    .line 257
    .line 258
    :goto_7
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_d

    .line 263
    .line 264
    sget-object v6, Lcom/google/android/gms/internal/ads/zzafz;->zzi:[I

    .line 265
    .line 266
    invoke-static {v1, v6, v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    goto :goto_8

    .line 271
    :cond_d
    move v6, v7

    .line 272
    :goto_8
    add-int/2addr v3, v6

    .line 273
    add-int/lit8 v0, v0, 0x1

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_e
    add-int v14, v5, v3

    .line 277
    .line 278
    new-instance v10, Lcom/google/android/gms/internal/ads/zzafy;

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const/16 v18, 0x0

    .line 283
    .line 284
    const-string v11, "audio/vnd.dts.uhd;profile=p2"

    .line 285
    .line 286
    const/4 v12, 0x2

    .line 287
    invoke-direct/range {v10 .. v18}, Lcom/google/android/gms/internal/ads/zzafy;-><init>(Ljava/lang/String;IIIJI[B)V

    .line 288
    .line 289
    .line 290
    return-object v10
.end method

.method public static zzg([B)I
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzafz;->zzi([B)Lcom/google/android/gms/internal/ads/zzet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lcom/google/android/gms/internal/ads/zzafz;->zzj:[I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzafz;->zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v1

    .line 18
    return p0
.end method

.method private static zzh(Lcom/google/android/gms/internal/ads/zzet;[IZ)I
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    move v0, p2

    .line 3
    move v1, v0

    .line 4
    :goto_0
    const/4 v2, 0x3

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, p2

    .line 19
    :goto_1
    if-ge p2, v1, :cond_1

    .line 20
    .line 21
    aget v2, p1, p2

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    shl-int v2, v3, v2

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    add-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    aget p1, p1, v1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method private static zzi([B)Lcom/google/android/gms/internal/ads/zzet;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-byte v1, p0, v0

    .line 3
    .line 4
    const/16 v2, 0x7f

    .line 5
    .line 6
    if-eq v1, v2, :cond_4

    .line 7
    .line 8
    const/16 v2, 0x64

    .line 9
    .line 10
    if-eq v1, v2, :cond_4

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-eq v1, v2, :cond_4

    .line 15
    .line 16
    const/16 v2, 0x71

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    array-length v1, p0

    .line 22
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aget-byte v1, p0, v0

    .line 27
    .line 28
    const/4 v2, -0x2

    .line 29
    const/4 v3, -0x1

    .line 30
    if-eq v1, v2, :cond_1

    .line 31
    .line 32
    if-eq v1, v3, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x25

    .line 35
    .line 36
    if-eq v1, v2, :cond_1

    .line 37
    .line 38
    const/16 v2, -0xe

    .line 39
    .line 40
    if-eq v1, v2, :cond_1

    .line 41
    .line 42
    const/16 v2, -0x18

    .line 43
    .line 44
    if-ne v1, v2, :cond_2

    .line 45
    .line 46
    :cond_1
    move v1, v0

    .line 47
    :goto_0
    array-length v2, p0

    .line 48
    add-int/2addr v2, v3

    .line 49
    if-ge v1, v2, :cond_2

    .line 50
    .line 51
    aget-byte v2, p0, v1

    .line 52
    .line 53
    add-int/lit8 v4, v1, 0x1

    .line 54
    .line 55
    aget-byte v5, p0, v4

    .line 56
    .line 57
    aput-byte v5, p0, v1

    .line 58
    .line 59
    aput-byte v2, p0, v4

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/ads/zzet;

    .line 65
    .line 66
    array-length v2, p0

    .line 67
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 68
    .line 69
    .line 70
    aget-byte v0, p0, v0

    .line 71
    .line 72
    const/16 v3, 0x1f

    .line 73
    .line 74
    if-ne v0, v3, :cond_3

    .line 75
    .line 76
    new-instance v0, Lcom/google/android/gms/internal/ads/zzet;

    .line 77
    .line 78
    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/16 v3, 0x10

    .line 86
    .line 87
    if-lt v2, v3, :cond_3

    .line 88
    .line 89
    const/4 v2, 0x2

    .line 90
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 91
    .line 92
    .line 93
    const/16 v2, 0xe

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzp(II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    array-length v0, p0

    .line 104
    invoke-virtual {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzb([BI)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_4
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzet;

    .line 109
    .line 110
    array-length v1, p0

    .line 111
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 112
    .line 113
    .line 114
    return-object v0
.end method
