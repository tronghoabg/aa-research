.class final Lcom/google/android/gms/internal/ads/zzart;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaru;


# static fields
.field private static final zza:[I

.field private static final zzb:[I


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzagd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzahm;

.field private final zze:Lcom/google/android/gms/internal/ads/zzary;

.field private final zzf:I

.field private final zzg:[B

.field private final zzh:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzi:I

.field private final zzj:Lcom/google/android/gms/internal/ads/zzv;

.field private zzk:I

.field private zzl:J

.field private zzm:I

.field private zzn:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzart;->zza:[I

    const/16 v0, 0x59

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/internal/ads/zzart;->zzb:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
        -0x1
        -0x1
        -0x1
        -0x1
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_1
    .array-data 4
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0x10
        0x11
        0x13
        0x15
        0x17
        0x19
        0x1c
        0x1f
        0x22
        0x25
        0x29
        0x2d
        0x32
        0x37
        0x3c
        0x42
        0x49
        0x50
        0x58
        0x61
        0x6b
        0x76
        0x82
        0x8f
        0x9d
        0xad
        0xbe
        0xd1
        0xe6
        0xfd
        0x117
        0x133
        0x151
        0x173
        0x198
        0x1c1
        0x1ee
        0x220
        0x256
        0x292
        0x2d4
        0x31c
        0x36c
        0x3c3
        0x424
        0x48e
        0x502
        0x583
        0x610
        0x6ab
        0x756
        0x812
        0x8e0
        0x9c3
        0xabd
        0xbd0
        0xcff
        0xe4c
        0xfba
        0x114c
        0x1307
        0x14ee
        0x1706
        0x1954
        0x1bdc
        0x1ea5
        0x21b6
        0x2515
        0x28ca
        0x2cdf
        0x315b
        0x364b
        0x3bb9
        0x41b2
        0x4844
        0x4f7e
        0x5771
        0x602f
        0x69ce
        0x7462
        0x7fff
    .end array-data
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzary;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzc:Lcom/google/android/gms/internal/ads/zzagd;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzart;->zzd:Lcom/google/android/gms/internal/ads/zzahm;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    .line 9
    .line 10
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzc:I

    .line 11
    .line 12
    div-int/lit8 p1, p1, 0xa

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzi:I

    .line 20
    .line 21
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 22
    .line 23
    iget-object v1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzf:[B

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzart;->zzf:I

    .line 36
    .line 37
    iget v1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzb:I

    .line 38
    .line 39
    mul-int/lit8 v2, v1, 0x4

    .line 40
    .line 41
    iget v3, p3, Lcom/google/android/gms/internal/ads/zzary;->zzd:I

    .line 42
    .line 43
    sub-int v2, v3, v2

    .line 44
    .line 45
    iget v4, p3, Lcom/google/android/gms/internal/ads/zzary;->zze:I

    .line 46
    .line 47
    mul-int/2addr v4, v1

    .line 48
    const/16 v5, 0x8

    .line 49
    .line 50
    invoke-static {v2, v5, v4, p2}, LVa/M6;->C(IIII)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-ne v0, p2, :cond_0

    .line 55
    .line 56
    sget-object p2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 57
    .line 58
    add-int p2, p1, v0

    .line 59
    .line 60
    add-int/lit8 p2, p2, -0x1

    .line 61
    .line 62
    div-int/2addr p2, v0

    .line 63
    mul-int/2addr v3, p2

    .line 64
    new-array v2, v3, [B

    .line 65
    .line 66
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzart;->zzg:[B

    .line 67
    .line 68
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 69
    .line 70
    add-int v3, v0, v0

    .line 71
    .line 72
    mul-int/2addr v3, v1

    .line 73
    mul-int/2addr v3, p2

    .line 74
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzart;->zzh:Lcom/google/android/gms/internal/ads/zzeu;

    .line 78
    .line 79
    iget p2, p3, Lcom/google/android/gms/internal/ads/zzary;->zzc:I

    .line 80
    .line 81
    iget v2, p3, Lcom/google/android/gms/internal/ads/zzary;->zzd:I

    .line 82
    .line 83
    mul-int/2addr p2, v2

    .line 84
    mul-int/2addr p2, v5

    .line 85
    div-int/2addr p2, v0

    .line 86
    new-instance v0, Lcom/google/android/gms/internal/ads/zzt;

    .line 87
    .line 88
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v2, "audio/raw"

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 100
    .line 101
    .line 102
    add-int/2addr p1, p1

    .line 103
    mul-int/2addr p1, v1

    .line 104
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzp(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 105
    .line 106
    .line 107
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzb:I

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 110
    .line 111
    .line 112
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzg:I

    .line 113
    .line 114
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzft;->zzb(I)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzH(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 119
    .line 120
    .line 121
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzary;->zzc:I

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x2

    .line 127
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzJ(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzj:Lcom/google/android/gms/internal/ads/zzv;

    .line 135
    .line 136
    return-void

    .line 137
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    add-int/lit8 p1, p1, 0x22

    .line 150
    .line 151
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result p3

    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    add-int/2addr p1, p3

    .line 158
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 159
    .line 160
    .line 161
    const-string p1, "Expected frames per block: "

    .line 162
    .line 163
    const-string p3, "; got: "

    .line 164
    .line 165
    invoke-static {p2, v0, p1, p3, v1}, Lcom/google/android/gms/internal/consent_sdk/a;->u(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const/4 p2, 0x0

    .line 170
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    throw p1
.end method

.method private final zzd(I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    .line 4
    .line 5
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzary;->zzc:I

    .line 6
    .line 7
    int-to-long v6, v1

    .line 8
    sget-object v8, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 9
    .line 10
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzart;->zzl:J

    .line 11
    .line 12
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzart;->zzn:J

    .line 13
    .line 14
    const-wide/32 v4, 0xf4240

    .line 15
    .line 16
    .line 17
    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    add-long v12, v9, v1

    .line 22
    .line 23
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzart;->zzf(I)I

    .line 24
    .line 25
    .line 26
    move-result v15

    .line 27
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 28
    .line 29
    sub-int v16, v1, v15

    .line 30
    .line 31
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzart;->zzd:Lcom/google/android/gms/internal/ads/zzahm;

    .line 32
    .line 33
    const/4 v14, 0x1

    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    invoke-interface/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 37
    .line 38
    .line 39
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzn:J

    .line 40
    .line 41
    move/from16 v3, p1

    .line 42
    .line 43
    int-to-long v3, v3

    .line 44
    add-long/2addr v1, v3

    .line 45
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzn:J

    .line 46
    .line 47
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 48
    .line 49
    sub-int/2addr v1, v15

    .line 50
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 51
    .line 52
    return-void
.end method

.method private final zze(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzary;->zzb:I

    .line 4
    .line 5
    add-int/2addr v0, v0

    .line 6
    div-int/2addr p1, v0

    .line 7
    return p1
.end method

.method private final zzf(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    add-int/2addr p1, p1

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzary;->zzb:I

    mul-int/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final zza(J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzl:J

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzn:J

    return-void
.end method

.method public final zzb(IJ)V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasb;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    .line 4
    .line 5
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzart;->zzf:I

    .line 6
    .line 7
    int-to-long v3, p1

    .line 8
    move-wide v5, p2

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzasb;-><init>(Lcom/google/android/gms/internal/ads/zzary;IJJ)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzc:Lcom/google/android/gms/internal/ads/zzagd;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzart;->zzd:Lcom/google/android/gms/internal/ads/zzahm;

    .line 18
    .line 19
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzart;->zzj:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzasb;->zza()J

    .line 25
    .line 26
    .line 27
    move-result-wide p2

    .line 28
    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzahm;->zzP(J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagb;J)Z
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 6
    .line 7
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzart;->zze(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzart;->zzi:I

    .line 12
    .line 13
    sub-int v3, v4, v3

    .line 14
    .line 15
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 16
    .line 17
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzart;->zzf:I

    .line 18
    .line 19
    add-int/2addr v3, v5

    .line 20
    const/4 v6, -0x1

    .line 21
    add-int/2addr v3, v6

    .line 22
    div-int/2addr v3, v5

    .line 23
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzart;->zze:Lcom/google/android/gms/internal/ads/zzary;

    .line 24
    .line 25
    iget v8, v7, Lcom/google/android/gms/internal/ads/zzary;->zzd:I

    .line 26
    .line 27
    mul-int/2addr v3, v8

    .line 28
    const-wide/16 v9, 0x0

    .line 29
    .line 30
    cmp-long v9, v1, v9

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    if-nez v9, :cond_0

    .line 34
    .line 35
    :goto_0
    move v9, v11

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v9, 0x0

    .line 38
    :goto_1
    if-nez v9, :cond_2

    .line 39
    .line 40
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 41
    .line 42
    if-ge v12, v3, :cond_2

    .line 43
    .line 44
    sub-int v12, v3, v12

    .line 45
    .line 46
    int-to-long v12, v12

    .line 47
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v12

    .line 51
    long-to-int v12, v12

    .line 52
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzart;->zzg:[B

    .line 53
    .line 54
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 55
    .line 56
    move-object/from16 v15, p1

    .line 57
    .line 58
    invoke-interface {v15, v13, v14, v12}, Lcom/google/android/gms/internal/ads/zzagb;->zza([BII)I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    if-ne v12, v6, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 66
    .line 67
    add-int/2addr v13, v12

    .line 68
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 72
    .line 73
    div-int/2addr v1, v8

    .line 74
    if-lez v1, :cond_8

    .line 75
    .line 76
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzart;->zzg:[B

    .line 77
    .line 78
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzart;->zzh:Lcom/google/android/gms/internal/ads/zzeu;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    :goto_2
    if-ge v6, v1, :cond_7

    .line 82
    .line 83
    const/4 v12, 0x0

    .line 84
    :goto_3
    iget v13, v7, Lcom/google/android/gms/internal/ads/zzary;->zzb:I

    .line 85
    .line 86
    if-ge v12, v13, :cond_6

    .line 87
    .line 88
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    mul-int v15, v6, v8

    .line 93
    .line 94
    div-int v16, v8, v13

    .line 95
    .line 96
    add-int/lit8 v16, v16, -0x4

    .line 97
    .line 98
    mul-int/lit8 v17, v12, 0x4

    .line 99
    .line 100
    add-int v17, v17, v15

    .line 101
    .line 102
    add-int/lit8 v15, v17, 0x1

    .line 103
    .line 104
    aget-byte v15, v2, v15

    .line 105
    .line 106
    and-int/lit16 v15, v15, 0xff

    .line 107
    .line 108
    move/from16 v18, v11

    .line 109
    .line 110
    aget-byte v11, v2, v17

    .line 111
    .line 112
    and-int/lit16 v11, v11, 0xff

    .line 113
    .line 114
    add-int/lit8 v19, v17, 0x2

    .line 115
    .line 116
    aget-byte v10, v2, v19

    .line 117
    .line 118
    and-int/lit16 v10, v10, 0xff

    .line 119
    .line 120
    move/from16 p1, v1

    .line 121
    .line 122
    const/16 v1, 0x58

    .line 123
    .line 124
    invoke-static {v10, v1}, Ljava/lang/Math;->min(II)I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    sget-object v19, Lcom/google/android/gms/internal/ads/zzart;->zzb:[I

    .line 129
    .line 130
    aget v21, v19, v10

    .line 131
    .line 132
    mul-int v22, v6, v5

    .line 133
    .line 134
    mul-int v22, v22, v13

    .line 135
    .line 136
    add-int v22, v22, v12

    .line 137
    .line 138
    shl-int/lit8 v15, v15, 0x8

    .line 139
    .line 140
    or-int/2addr v11, v15

    .line 141
    int-to-short v11, v11

    .line 142
    and-int/lit16 v15, v11, 0xff

    .line 143
    .line 144
    add-int v22, v22, v22

    .line 145
    .line 146
    int-to-byte v15, v15

    .line 147
    aput-byte v15, v14, v22

    .line 148
    .line 149
    add-int/lit8 v15, v22, 0x1

    .line 150
    .line 151
    shr-int/lit8 v1, v11, 0x8

    .line 152
    .line 153
    int-to-byte v1, v1

    .line 154
    aput-byte v1, v14, v15

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    :goto_4
    add-int v15, v16, v16

    .line 158
    .line 159
    if-ge v1, v15, :cond_5

    .line 160
    .line 161
    mul-int/lit8 v15, v13, 0x4

    .line 162
    .line 163
    add-int v15, v15, v17

    .line 164
    .line 165
    div-int/lit8 v23, v1, 0x8

    .line 166
    .line 167
    div-int/lit8 v24, v1, 0x2

    .line 168
    .line 169
    rem-int/lit8 v24, v24, 0x4

    .line 170
    .line 171
    mul-int v23, v23, v13

    .line 172
    .line 173
    mul-int/lit8 v23, v23, 0x4

    .line 174
    .line 175
    add-int v23, v23, v15

    .line 176
    .line 177
    add-int v23, v23, v24

    .line 178
    .line 179
    aget-byte v15, v2, v23

    .line 180
    .line 181
    move/from16 v23, v1

    .line 182
    .line 183
    and-int/lit16 v1, v15, 0xff

    .line 184
    .line 185
    rem-int/lit8 v24, v23, 0x2

    .line 186
    .line 187
    if-nez v24, :cond_3

    .line 188
    .line 189
    and-int/lit8 v1, v15, 0xf

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_3
    shr-int/lit8 v1, v1, 0x4

    .line 193
    .line 194
    :goto_5
    and-int/lit8 v15, v1, 0x7

    .line 195
    .line 196
    add-int/2addr v15, v15

    .line 197
    add-int/lit8 v15, v15, 0x1

    .line 198
    .line 199
    mul-int v15, v15, v21

    .line 200
    .line 201
    and-int/lit8 v21, v1, 0x8

    .line 202
    .line 203
    shr-int/lit8 v15, v15, 0x3

    .line 204
    .line 205
    if-eqz v21, :cond_4

    .line 206
    .line 207
    neg-int v15, v15

    .line 208
    :cond_4
    add-int/2addr v11, v15

    .line 209
    const/16 v15, 0x7fff

    .line 210
    .line 211
    invoke-static {v11, v15}, Ljava/lang/Math;->min(II)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    const/16 v15, -0x8000

    .line 216
    .line 217
    invoke-static {v15, v11}, Ljava/lang/Math;->max(II)I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    add-int v15, v13, v13

    .line 222
    .line 223
    add-int v22, v15, v22

    .line 224
    .line 225
    and-int/lit16 v15, v11, 0xff

    .line 226
    .line 227
    int-to-byte v15, v15

    .line 228
    aput-byte v15, v14, v22

    .line 229
    .line 230
    add-int/lit8 v15, v22, 0x1

    .line 231
    .line 232
    move/from16 p3, v1

    .line 233
    .line 234
    shr-int/lit8 v1, v11, 0x8

    .line 235
    .line 236
    int-to-byte v1, v1

    .line 237
    aput-byte v1, v14, v15

    .line 238
    .line 239
    sget-object v1, Lcom/google/android/gms/internal/ads/zzart;->zza:[I

    .line 240
    .line 241
    aget v1, v1, p3

    .line 242
    .line 243
    add-int/2addr v10, v1

    .line 244
    const/16 v1, 0x58

    .line 245
    .line 246
    invoke-static {v10, v1}, Ljava/lang/Math;->min(II)I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    const/4 v15, 0x0

    .line 251
    invoke-static {v15, v10}, Ljava/lang/Math;->max(II)I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    aget v21, v19, v10

    .line 256
    .line 257
    add-int/lit8 v20, v23, 0x1

    .line 258
    .line 259
    move/from16 v1, v20

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_5
    const/4 v15, 0x0

    .line 263
    add-int/lit8 v12, v12, 0x1

    .line 264
    .line 265
    move/from16 v1, p1

    .line 266
    .line 267
    move/from16 v11, v18

    .line 268
    .line 269
    goto/16 :goto_3

    .line 270
    .line 271
    :cond_6
    move/from16 p1, v1

    .line 272
    .line 273
    move/from16 v18, v11

    .line 274
    .line 275
    const/4 v15, 0x0

    .line 276
    add-int/lit8 v6, v6, 0x1

    .line 277
    .line 278
    goto/16 :goto_2

    .line 279
    .line 280
    :cond_7
    move/from16 p1, v1

    .line 281
    .line 282
    const/4 v15, 0x0

    .line 283
    mul-int v5, v5, p1

    .line 284
    .line 285
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzart;->zzf(I)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 293
    .line 294
    .line 295
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 296
    .line 297
    mul-int v2, p1, v8

    .line 298
    .line 299
    sub-int/2addr v1, v2

    .line 300
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzk:I

    .line 301
    .line 302
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzart;->zzd:Lcom/google/android/gms/internal/ads/zzahm;

    .line 307
    .line 308
    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 309
    .line 310
    .line 311
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 312
    .line 313
    add-int/2addr v2, v1

    .line 314
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 315
    .line 316
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzart;->zze(I)I

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-lt v1, v4, :cond_8

    .line 321
    .line 322
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzart;->zzd(I)V

    .line 323
    .line 324
    .line 325
    :cond_8
    if-eqz v9, :cond_9

    .line 326
    .line 327
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzart;->zzm:I

    .line 328
    .line 329
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzart;->zze(I)I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-lez v1, :cond_9

    .line 334
    .line 335
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzart;->zzd(I)V

    .line 336
    .line 337
    .line 338
    :cond_9
    return v9
.end method
