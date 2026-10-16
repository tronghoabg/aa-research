.class public final Lcom/google/android/gms/internal/ads/zzavt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(J)Lcom/google/android/gms/internal/ads/zzawt;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzavs;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzavs;-><init>(J)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawt;->zzf(Lcom/google/android/gms/internal/ads/zzawl;)Lcom/google/android/gms/internal/ads/zzawt;

    move-result-object p0

    return-object p0
.end method

.method public static zzb(JLcom/google/android/gms/internal/ads/zzaws;Z)I
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v2, 0x9

    new-array v2, v2, [J

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aget-wide v4, v2, v3

    const/4 v6, 0x1

    aget-wide v7, v2, v6

    const/4 v9, 0x2

    aget-wide v9, v2, v9

    const/4 v11, 0x3

    aget-wide v11, v2, v11

    const/4 v13, 0x4

    aget-wide v13, v2, v13

    const/4 v15, 0x5

    aget-wide v15, v2, v15

    const/16 v17, 0x6

    aget-wide v17, v2, v17

    const/16 v19, 0x7

    aget-wide v19, v2, v19

    const-wide/32 v21, 0x611b7818

    not-long v0, v4

    and-long/2addr v0, v7

    or-long/2addr v0, v9

    and-long/2addr v4, v11

    or-long/2addr v4, v13

    add-long/2addr v0, v4

    sub-long/2addr v0, v15

    add-long v0, v0, v17

    rem-long v19, v19, v21

    const v2, 0x66deaaf0

    not-int v4, v2

    const v5, 0x172600ca

    and-int/2addr v4, v5

    const v5, 0x2c185527

    or-int/2addr v4, v5

    const v5, 0x532e08dd

    and-int/2addr v2, v5

    const v5, 0x40d83f37

    or-int/2addr v2, v5

    add-int/2addr v4, v2

    const v2, 0x7b9c5d22

    sub-int/2addr v4, v2

    const v2, 0xafd33ca

    const v5, 0x5c63d66c

    rem-int/2addr v5, v2

    const v2, 0x50f0687

    not-int v7, v2

    const v8, 0x2ae22230

    and-int/2addr v7, v8

    const v8, 0x290d888c

    or-int/2addr v7, v8

    const v8, 0x12eae273

    and-int/2addr v2, v8

    const v8, 0x300dc8c3

    or-int/2addr v2, v8

    add-int/2addr v7, v2

    const v2, 0x55b5c0ef

    sub-int/2addr v7, v2

    const v2, 0x392c3c39

    const v8, 0x78a02b09

    rem-int/2addr v8, v2

    const v2, 0x11886451

    not-int v9, v2

    const v10, 0x57550c00

    and-int/2addr v9, v10

    const v10, 0xc08f0c2

    or-int/2addr v9, v10

    const v10, 0x53553e06

    and-int/2addr v2, v10

    const v10, 0x482333e

    or-int/2addr v2, v10

    add-int/2addr v9, v2

    const v2, 0x4f47b728

    sub-int/2addr v9, v2

    const v2, 0x24e7deff

    const v10, 0x5e683656

    rem-int/2addr v10, v2

    if-eqz p3, :cond_0

    const v2, 0x51fd456e

    not-int v11, v2

    const v12, 0x376ec06e

    and-int/2addr v11, v12

    const v12, 0x4a72af82    # 3976160.5f

    or-int/2addr v11, v12

    const v12, 0x3d0c407c

    and-int/2addr v2, v12

    const v12, 0x8228b92

    or-int/2addr v2, v12

    add-int/2addr v11, v2

    const v2, 0x7ca1a2af

    sub-int/2addr v11, v2

    const v2, 0xda1a94f

    const v12, 0x780d2366

    rem-int/2addr v12, v2

    add-long v13, p0, p0

    xor-int v2, v11, v12

    shr-long v11, p0, v2

    xor-long/2addr v11, v13

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p0

    :goto_0
    move v2, v6

    :goto_1
    xor-int v13, v7, v8

    xor-long v14, v0, v19

    ushr-long v16, v11, v13

    const-wide/16 v21, 0x0

    cmp-long v13, v16, v21

    if-nez v13, :cond_1

    if-gez v2, :cond_2

    :cond_1
    move v13, v6

    goto :goto_2

    :cond_2
    move v13, v3

    :goto_2
    and-long/2addr v11, v14

    long-to-int v11, v11

    if-eqz v13, :cond_3

    xor-int v12, v9, v10

    xor-int v14, v4, v5

    or-int/2addr v11, v12

    shl-int/2addr v11, v14

    shr-int/2addr v11, v14

    :cond_3
    int-to-byte v11, v11

    move-object/from16 v12, p2

    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzaws;->zza(B)V

    if-nez v13, :cond_4

    return v2

    :cond_4
    add-int/2addr v2, v6

    move-wide/from16 v11, v16

    goto :goto_1

    nop

    :array_0
    .array-data 8
        0x773d0e7b
        0x5802553e
        0x6d512429
        0x10065116
        0x6da40c08
        0x1045d6a1eL
        0x1acca918
        0x62823856
        0x611b7818
    .end array-data
.end method
