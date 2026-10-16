.class public final Lcom/google/android/gms/internal/ads/zzawc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public zza:I

.field public zzb:Lcom/google/android/gms/internal/ads/zzavx;

.field public zzc:Lcom/google/android/gms/internal/ads/zzavl;

.field public zzd:Lcom/google/android/gms/internal/ads/zzavo;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzavo;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzavo;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzawc;-><init>(Lcom/google/android/gms/internal/ads/zzavo;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzavo;)V
    .locals 3

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzavx;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzavm;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzavm;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzawc;-><init>(Lcom/google/android/gms/internal/ads/zzavx;ILcom/google/android/gms/internal/ads/zzavl;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzd:Lcom/google/android/gms/internal/ads/zzavo;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzavx;ILcom/google/android/gms/internal/ads/zzavl;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzavx;ILcom/google/android/gms/internal/ads/zzavl;Lcom/google/android/gms/internal/ads/zzavo;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzawc;-><init>(Lcom/google/android/gms/internal/ads/zzavx;ILcom/google/android/gms/internal/ads/zzavl;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzd:Lcom/google/android/gms/internal/ads/zzavo;

    return-void
.end method

.method private final zzg()J
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawb;,
            Lcom/google/android/gms/internal/ads/zzavz;
        }
    .end annotation

    move-object/from16 v1, p0

    const v0, 0x4a495ddd    # 3299191.2f

    not-int v2, v0

    const v3, 0x103b005d

    and-int/2addr v2, v3

    const v3, 0x6dc13630

    or-int/2addr v2, v3

    const v3, 0x313ad04d

    and-int/2addr v0, v3

    const v3, 0x2744d712

    or-int/2addr v0, v3

    add-int/2addr v2, v0

    const v0, -0x6cb274c9

    sub-int/2addr v2, v0

    const v0, 0x26bba08c

    const v3, 0x5f69c330

    rem-int/2addr v3, v0

    const v0, 0x288cf3f2

    not-int v4, v0

    const v5, 0x522d5438

    and-int/2addr v4, v5

    const v5, 0x329861

    or-int/2addr v4, v5

    const v5, 0x720d459a

    and-int/2addr v0, v5

    const v5, 0x2c10b9a7

    or-int/2addr v0, v5

    add-int/2addr v4, v0

    const v0, 0x7a1382db

    sub-int/2addr v4, v0

    const v0, 0x9103f75

    const v5, 0x67efcd41

    rem-int/2addr v5, v0

    const v0, 0x3a034cde

    not-int v6, v0

    const v7, 0x4aa08bca    # 5260773.0f

    and-int/2addr v6, v7

    const v7, 0x30d1e39

    or-int/2addr v6, v7

    const v7, 0x68a495c6

    and-int/2addr v0, v7

    const v7, 0x35041414

    or-int/2addr v0, v7

    add-int/2addr v6, v0

    const v0, 0x590f51a8

    sub-int/2addr v6, v0

    const v0, 0x4754edda

    const v7, 0x6ef75032

    rem-int/2addr v7, v0

    const v0, 0x1bc4884

    not-int v8, v0

    const v9, 0xa657805

    and-int/2addr v8, v9

    const v9, 0x50c9310

    or-int/2addr v8, v9

    const v9, -0x759e95f3

    and-int/2addr v0, v9

    const v9, -0x4b7f6986

    or-int/2addr v0, v9

    add-int/2addr v8, v0

    const v0, -0x70c18209

    sub-int/2addr v8, v0

    const v0, 0x47fd2ee5

    const v9, 0x7cad41fd

    rem-int/2addr v9, v0

    const v0, 0x4c7c5fb

    not-int v10, v0

    const v11, 0x61209182

    and-int/2addr v10, v11

    const v11, 0x24fb62b

    or-int/2addr v10, v11

    const v11, 0x75e20388

    and-int/2addr v0, v11

    const v11, 0x16ca867f

    or-int/2addr v0, v11

    add-int/2addr v10, v0

    const v0, 0x7287784f

    sub-int/2addr v10, v0

    const v0, 0xafc8314

    const v11, 0x3ea15540

    rem-int/2addr v11, v0

    const/4 v0, 0x0

    const-wide/16 v12, 0x0

    :goto_0
    xor-int v14, v2, v3

    if-ge v0, v14, :cond_3

    :try_start_0
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    move/from16 v16, v2

    iget v2, v1, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    move/from16 v17, v3

    add-int/lit8 v3, v2, 0x1

    iput v3, v1, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v14, v15, v2}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v2

    xor-int v3, v6, v7

    xor-int v14, v4, v5

    and-int/2addr v14, v2

    int-to-long v14, v14

    shl-long/2addr v14, v0

    or-long/2addr v12, v14

    const/4 v14, 0x1

    if-ne v0, v3, :cond_1

    if-gt v2, v14, :cond_0

    move v0, v3

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzavz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzavz;-><init>()V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    xor-int v3, v8, v9

    and-int/2addr v2, v3

    if-nez v2, :cond_2

    ushr-long v2, v12, v14

    const-wide/16 v4, 0x1

    and-long/2addr v4, v12

    neg-long v4, v4

    xor-long/2addr v2, v4

    return-wide v2

    :cond_2
    xor-int v2, v10, v11

    add-int/2addr v0, v2

    move/from16 v2, v16

    move/from16 v3, v17

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzavz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzavz;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzawb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzawb;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method private static final zzh(J)V
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawa;
        }
    .end annotation

    const/16 v2, 0x9

    new-array v2, v2, [J

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aget-wide v3, v2, v3

    const/4 v5, 0x1

    aget-wide v5, v2, v5

    const/4 v7, 0x2

    aget-wide v7, v2, v7

    const/4 v9, 0x3

    aget-wide v9, v2, v9

    const/4 v11, 0x4

    aget-wide v11, v2, v11

    const/4 v13, 0x5

    aget-wide v13, v2, v13

    const/4 v15, 0x6

    aget-wide v15, v2, v15

    const/16 v17, 0x7

    aget-wide v17, v2, v17

    const-wide/32 v19, 0x1c7062c7

    not-long v0, v3

    and-long/2addr v0, v5

    or-long/2addr v0, v7

    and-long/2addr v3, v9

    or-long/2addr v3, v11

    add-long/2addr v0, v3

    sub-long/2addr v0, v13

    add-long/2addr v0, v15

    rem-long v17, v17, v19

    xor-long v0, v0, v17

    rem-long v0, p0, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzawa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzawa;-><init>()V

    throw v0

    :array_0
    .array-data 8
        0x86fbbe2
        0x1b37c8a2
        0x44085648
        0x3b379caa
        0x60403609
        0xc6f58bedL
        0x187370eb
        0x664f224e
        0x1c7062c7
    .end array-data
.end method


# virtual methods
.method public final zza(J)V
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawa;,
            Lcom/google/android/gms/internal/ads/zzawb;
        }
    .end annotation

    move-object/from16 v0, p0

    const/16 v3, 0x9

    new-array v3, v3, [J

    fill-array-data v3, :array_0

    const/4 v4, 0x0

    aget-wide v4, v3, v4

    const/4 v6, 0x1

    aget-wide v6, v3, v6

    const/4 v8, 0x2

    aget-wide v8, v3, v8

    const/4 v10, 0x3

    aget-wide v10, v3, v10

    const/4 v12, 0x4

    aget-wide v12, v3, v12

    const/4 v14, 0x5

    aget-wide v14, v3, v14

    const/16 v16, 0x6

    aget-wide v16, v3, v16

    const/16 v18, 0x7

    aget-wide v18, v3, v18

    const-wide/32 v20, 0x359abfdb

    not-long v1, v4

    and-long/2addr v1, v6

    or-long/2addr v1, v8

    and-long/2addr v4, v10

    or-long/2addr v4, v12

    add-long/2addr v1, v4

    sub-long/2addr v1, v14

    add-long v1, v1, v16

    rem-long v18, v18, v20

    invoke-static/range {p1 .. p2}, Lcom/google/android/gms/internal/ads/zzawc;->zzh(J)V

    xor-long v1, v1, v18

    div-long v1, p1, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_0

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzavx;->zza:[B

    array-length v3, v3

    int-to-long v3, v3

    cmp-long v3, v1, v3

    if-gtz v3, :cond_0

    long-to-int v1, v1

    iput v1, v0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzawb;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzawb;-><init>()V

    throw v1

    :array_0
    .array-data 8
        0x7f8b6605
        0x2b6d0211
        0x2cc25112
        0x53ad0681
        0x70d21df2
        0x10fbc8866L
        0x726b9f7c
        0x6ea607c9
        0x359abfdb
    .end array-data
.end method

.method public final zzb()J
    .locals 21

    const/16 v2, 0x9

    new-array v2, v2, [J

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aget-wide v3, v2, v3

    const/4 v5, 0x1

    aget-wide v5, v2, v5

    const/4 v7, 0x2

    aget-wide v7, v2, v7

    const/4 v9, 0x3

    aget-wide v9, v2, v9

    const/4 v11, 0x4

    aget-wide v11, v2, v11

    const/4 v13, 0x5

    aget-wide v13, v2, v13

    const/4 v15, 0x6

    aget-wide v15, v2, v15

    const/16 v17, 0x7

    aget-wide v17, v2, v17

    const-wide/32 v19, 0x6a2342ec

    not-long v0, v3

    and-long/2addr v0, v5

    or-long/2addr v0, v7

    and-long/2addr v3, v9

    or-long/2addr v3, v11

    add-long/2addr v0, v3

    sub-long/2addr v0, v13

    add-long/2addr v0, v15

    rem-long v17, v17, v19

    move-object/from16 v2, p0

    iget v3, v2, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    int-to-long v3, v3

    xor-long v0, v0, v17

    mul-long/2addr v3, v0

    return-wide v3

    :array_0
    .array-data 8
        0x1d4ed43b
        0x30ca86e2
        0x47a4c80d
        0x304b07e6
        0x4a25891c
        0xdca15f79L
        0x211012a4
        0x70a64e2a
        0x6a2342ec
    .end array-data
.end method

.method public final zzc()J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawb;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, v0

    return-wide v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzawb;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzawb;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final zzd()I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawb;
        }
    .end annotation

    const v0, 0x18a35fe3

    not-int v1, v0

    const v2, 0x60a8d984

    and-int/2addr v1, v2

    const v2, 0x506ad9c

    or-int/2addr v1, v2

    const v2, 0x60a85448

    and-int/2addr v0, v2

    const v2, 0x17002ff9

    or-int/2addr v0, v2

    add-int/2addr v1, v0

    const v0, 0x5a372932

    sub-int/2addr v1, v0

    const v0, 0x3d75bc47    # 0.05999401f

    const v2, 0x5fedc0e3

    rem-int/2addr v2, v0

    const v0, 0x3a541011

    not-int v3, v0

    const v4, 0x49346911

    and-int/2addr v3, v4

    const v4, 0x3d1e3ecc

    or-int/2addr v3, v4

    const v4, 0x40205191

    and-int/2addr v0, v4

    const v4, 0x3a983ee0

    or-int/2addr v0, v4

    add-int/2addr v3, v0

    const v0, -0x5eb7f32c

    sub-int/2addr v3, v0

    const v0, 0x28168302

    const v4, 0x66bbb7e5

    rem-int/2addr v4, v0

    const v0, 0x4557d5d8

    not-int v5, v0

    const v6, 0x20907059

    and-int/2addr v5, v6

    const v6, 0x1e22cca2

    or-int/2addr v5, v6

    const v6, 0x20903a59

    and-int/2addr v0, v6

    const v6, 0x1565cb80

    or-int/2addr v0, v6

    add-int/2addr v5, v0

    const v0, 0x50496a59

    sub-int/2addr v5, v0

    const v0, 0x1f9d5c18

    const v6, 0x430a1662

    rem-int/2addr v6, v0

    const v0, 0xcf19f38

    not-int v7, v0

    const v8, 0x6f018c1

    and-int/2addr v7, v8

    const v8, 0xc11e91d

    or-int/2addr v7, v8

    const v8, 0x12e250d0

    and-int/2addr v0, v8

    const v8, 0x1016c91d

    or-int/2addr v0, v8

    add-int/2addr v7, v0

    const v0, 0x1870499a

    sub-int/2addr v7, v0

    const v0, 0x18f40a33

    const v8, 0x1f8c83ab

    rem-int/2addr v8, v0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget v10, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    add-int/lit8 v11, v10, 0x1

    iput v11, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v0, v9, v10}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v0

    xor-int/2addr v1, v2

    and-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget v10, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    add-int/lit8 v11, v10, 0x1

    iput v11, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v2, v9, v10}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v2

    xor-int/2addr v3, v4

    and-int/2addr v2, v1

    shl-int/2addr v2, v3

    or-int/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    add-int/lit8 v9, v4, 0x1

    iput v9, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v2

    xor-int v3, v5, v6

    and-int/2addr v1, v2

    shl-int/2addr v1, v3

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzavl;->zza(Lcom/google/android/gms/internal/ads/zzavx;I)B

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int v2, v7, v8

    shl-int/2addr v1, v2

    or-int/2addr v0, v1

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzawb;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzawb;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final zze()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawb;,
            Lcom/google/android/gms/internal/ads/zzavz;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzawc;->zzg()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzf(J)Lcom/google/android/gms/internal/ads/zzavx;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzawa;,
            Lcom/google/android/gms/internal/ads/zzawb;
        }
    .end annotation

    const v0, 0x2e272b88

    const/16 v1, 0x9

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v3, v1, v3

    const/4 v4, 0x2

    aget v4, v1, v4

    const/4 v5, 0x3

    aget v5, v1, v5

    const/4 v6, 0x4

    aget v6, v1, v6

    const/4 v7, 0x5

    aget v7, v1, v7

    const/4 v8, 0x6

    aget v8, v1, v8

    const/4 v9, 0x7

    aget v1, v1, v9

    not-int v9, v2

    and-int/2addr v3, v9

    or-int/2addr v3, v4

    and-int/2addr v2, v5

    or-int/2addr v2, v6

    invoke-static {v3, v2, v7, v8}, Lcb/a;->b(IIII)I

    move-result v2

    rem-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzawc;->zzb()J

    move-result-wide v3

    add-long/2addr v3, p1

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzawc;->zzh(J)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    int-to-long v3, v0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzb:Lcom/google/android/gms/internal/ads/zzavx;

    iget-object v6, v5, Lcom/google/android/gms/internal/ads/zzavx;->zza:[B

    array-length v6, v6

    xor-int/2addr v1, v2

    shr-long/2addr p1, v1

    add-long/2addr p1, v3

    int-to-long v1, v6

    cmp-long v1, p1, v1

    if-gtz v1, :cond_0

    cmp-long v1, p1, v3

    if-ltz v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zzc:Lcom/google/android/gms/internal/ads/zzavl;

    long-to-int p1, p1

    invoke-interface {v1, v5, v0, p1}, Lcom/google/android/gms/internal/ads/zzavl;->zzb(Lcom/google/android/gms/internal/ads/zzavx;II)Lcom/google/android/gms/internal/ads/zzavx;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzawc;->zza:I

    return-object p2

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "CEiv6BFfPnitUE+D"

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzavv;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzawb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzawb;-><init>()V

    throw p1

    nop

    :array_0
    .array-data 4
        0x6366b17f
        0x5989c625
        0x475aaf55
        0x1c81602a
        0x251a3b9b
        -0x627f16db
        0x32181957
        0x47b486c9
        0x2e272b88
    .end array-data
.end method
