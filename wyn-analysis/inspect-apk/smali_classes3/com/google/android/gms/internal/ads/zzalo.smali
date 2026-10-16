.class public final Lcom/google/android/gms/internal/ads/zzalo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "OpusHead"

    .line 4
    .line 5
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzalo;->zzb:[B

    .line 12
    .line 13
    return-void
.end method

.method public static zza(I)I
    .locals 0

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzfz;Lcom/google/android/gms/internal/ads/zzagt;JLcom/google/android/gms/internal/ads/zzq;ZZLcom/google/android/gms/internal/ads/zzgti;Z)Ljava/util/List;
    .locals 85
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    const-string v11, "video/3gpp"

    const-string v12, "text/x-unknown"

    const-string v14, "application/ttml+xml"

    const-string v8, "BoxParsers"

    const/16 v4, 0x8

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    .line 2
    :goto_0
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzfz;->zzc:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    if-ge v6, v1, :cond_92

    .line 3
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzfz;

    .line 4
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzgb;->zzd:I

    const v9, 0x7472616b

    if-eq v7, v9, :cond_0

    move v3, v4

    move-object v1, v5

    move/from16 v45, v6

    move-object v2, v8

    move-object/from16 v24, v11

    move-object v7, v12

    move-object/from16 v39, v14

    const v5, 0x6d696e66

    const v6, 0x7374626c

    const/4 v9, 0x2

    const/4 v15, 0x0

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const/16 v46, 0xc

    const/16 v55, 0x1

    move-object/from16 v8, p1

    move-object/from16 v4, p7

    goto/16 :goto_74

    :cond_0
    const v7, 0x6d766864

    .line 5
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v7

    .line 6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x6d646961

    .line 7
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v10

    .line 8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v9

    .line 10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzalo;->zzj(Lcom/google/android/gms/internal/ads/zzeu;)I

    move-result v9

    const v15, 0x736f756e

    const/16 v28, 0x5

    const v2, 0x74657874

    const/16 v30, 0x1

    const/4 v13, -0x1

    if-ne v9, v15, :cond_1

    move/from16 v15, v30

    goto :goto_1

    :cond_1
    const v15, 0x76696465

    if-ne v9, v15, :cond_2

    const/4 v15, 0x2

    goto :goto_1

    :cond_2
    if-eq v9, v2, :cond_3

    const v15, 0x7362746c

    if-eq v9, v15, :cond_3

    const v15, 0x73756274

    if-eq v9, v15, :cond_3

    const v15, 0x636c6370

    if-eq v9, v15, :cond_3

    const v15, 0x73756270

    if-ne v9, v15, :cond_4

    :cond_3
    const/4 v15, 0x3

    goto :goto_1

    :cond_4
    const v15, 0x6d657461

    if-ne v9, v15, :cond_5

    move/from16 v15, v28

    goto :goto_1

    :cond_5
    move v15, v13

    :goto_1
    if-ne v15, v13, :cond_6

    move v3, v4

    move-object/from16 v58, v5

    move/from16 v45, v6

    move-object v2, v8

    move-object/from16 v24, v11

    move-object v7, v12

    move-object/from16 v39, v14

    const/4 v0, 0x0

    const/4 v9, 0x2

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const/16 v46, 0xc

    :goto_2
    move-object/from16 v4, p7

    goto/16 :goto_72

    :cond_6
    const v3, 0x746b6864

    .line 12
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v3

    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 15
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 16
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v33

    invoke-static/range {v33 .. v33}, Lcom/google/android/gms/internal/ads/zzalo;->zza(I)I

    move-result v33

    if-nez v33, :cond_7

    goto :goto_3

    :cond_7
    const/16 v4, 0x10

    .line 17
    :goto_3
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    move-object v4, v5

    .line 18
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v5

    const/4 v9, 0x4

    .line 19
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v9

    const/4 v2, 0x0

    :goto_4
    if-nez v33, :cond_8

    const/4 v13, 0x4

    goto :goto_5

    :cond_8
    const/16 v13, 0x8

    :goto_5
    const-wide/16 v37, 0x0

    move-object/from16 v39, v14

    move/from16 v40, v15

    if-ge v2, v13, :cond_b

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    move-result-object v13

    add-int v41, v9, v2

    .line 20
    aget-byte v13, v13, v41

    const/4 v14, -0x1

    const-wide v41, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v13, v14, :cond_a

    if-nez v33, :cond_9

    .line 21
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    move-result-wide v13

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    move-result-wide v13

    :goto_6
    cmp-long v2, v13, v37

    if-nez v2, :cond_c

    :goto_7
    move-wide/from16 v13, v41

    goto :goto_8

    :cond_a
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v14, v39

    move/from16 v15, v40

    const/4 v13, -0x1

    goto :goto_4

    :cond_b
    const-wide v41, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    goto :goto_7

    :cond_c
    :goto_8
    const/16 v2, 0xa

    .line 23
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 24
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v15

    const/4 v9, 0x4

    .line 25
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v2

    .line 27
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v0

    .line 28
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 29
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v9

    move-object/from16 v33, v1

    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v1

    move/from16 v43, v2

    const/high16 v2, 0x10000

    move-object/from16 v44, v4

    const/high16 v4, -0x10000

    if-nez v43, :cond_13

    if-ne v0, v2, :cond_f

    if-eq v9, v4, :cond_10

    if-ne v9, v2, :cond_e

    if-nez v1, :cond_d

    const/4 v0, 0x0

    goto :goto_9

    :cond_d
    move/from16 v0, v30

    :goto_9
    move v9, v2

    move/from16 v2, v30

    goto :goto_b

    :cond_e
    move v0, v2

    :cond_f
    :goto_a
    const/16 v43, 0x0

    goto :goto_d

    :cond_10
    if-nez v1, :cond_11

    move/from16 v2, v30

    const/4 v0, 0x0

    goto :goto_b

    :cond_11
    move/from16 v0, v30

    move v2, v0

    :goto_b
    if-eq v2, v0, :cond_12

    const/16 v0, 0x5a

    :goto_c
    const/16 v1, 0x10

    goto :goto_13

    :cond_12
    const/high16 v0, 0x10000

    goto :goto_a

    :cond_13
    :goto_d
    if-nez v43, :cond_19

    if-ne v0, v4, :cond_16

    const/high16 v2, 0x10000

    if-eq v9, v2, :cond_17

    if-ne v9, v4, :cond_15

    if-nez v1, :cond_14

    const/4 v0, 0x0

    goto :goto_e

    :cond_14
    const/4 v0, 0x1

    :goto_e
    move v9, v4

    :goto_f
    const/4 v2, 0x1

    goto :goto_10

    :cond_15
    move v0, v4

    :cond_16
    const/4 v2, 0x0

    goto :goto_11

    :cond_17
    if-nez v1, :cond_18

    const/4 v0, 0x0

    goto :goto_f

    :cond_18
    const/4 v0, 0x1

    goto :goto_f

    :goto_10
    if-eq v2, v0, :cond_15

    const/16 v0, 0x10e

    goto :goto_c

    :cond_19
    move/from16 v2, v43

    :goto_11
    if-eq v2, v4, :cond_1b

    const/high16 v4, 0x10000

    if-ne v2, v4, :cond_1a

    goto :goto_12

    :cond_1a
    const/4 v0, 0x0

    goto :goto_c

    :cond_1b
    :goto_12
    if-nez v0, :cond_1a

    if-nez v9, :cond_1a

    const/high16 v0, -0x10000

    if-ne v1, v0, :cond_1a

    const/16 v0, 0xb4

    goto :goto_c

    .line 31
    :goto_13
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 32
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v1

    const/4 v2, 0x2

    .line 33
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 34
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v2

    cmp-long v3, p2, v41

    if-nez v3, :cond_1c

    move-wide/from16 v45, v13

    goto :goto_14

    :cond_1c
    move-wide/from16 v45, p2

    :goto_14
    iget-object v3, v7, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 35
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzalo;->zzd(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzgd;

    move-result-object v3

    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/zzgd;->zzc:J

    cmp-long v7, v45, v41

    if-nez v7, :cond_1d

    move-wide v13, v3

    move-wide/from16 v3, v41

    :goto_15
    const v7, 0x6d696e66

    goto :goto_16

    :cond_1d
    const-wide/32 v47, 0xf4240

    .line 36
    sget-object v51, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v49, v3

    .line 37
    invoke-static/range {v45 .. v51}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    move-wide/from16 v13, v49

    goto :goto_15

    .line 38
    :goto_16
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v9

    .line 39
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, 0x7374626c

    .line 40
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v9

    .line 41
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, 0x6d646864

    .line 42
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzalo;->zzk(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzalh;

    move-result-object v43

    const v7, 0x73747364

    .line 45
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v7

    if-nez v7, :cond_1e

    const-string v0, "Ignoring track where sample table (stbl) box is missing a sample description (stsd)."

    .line 46
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, p7

    move/from16 v45, v6

    move-object v2, v8

    move-object/from16 v24, v11

    move-object v7, v12

    move-object/from16 v1, v33

    move-object/from16 v58, v44

    const/4 v0, 0x0

    const/16 v3, 0x8

    const/4 v9, 0x2

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const/16 v46, 0xc

    goto/16 :goto_72

    :cond_1e
    move v9, v6

    invoke-virtual/range {v43 .. v43}, Lcom/google/android/gms/internal/ads/zzalh;->zzc()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    const/16 v10, 0xc

    .line 47
    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    move-object/from16 v24, v11

    .line 48
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v11

    move/from16 v45, v9

    new-instance v9, Lcom/google/android/gms/internal/ads/zzalk;

    .line 49
    invoke-direct {v9, v11}, Lcom/google/android/gms/internal/ads/zzalk;-><init>(I)V

    move/from16 v46, v10

    const/4 v10, 0x0

    :goto_17
    if-ge v10, v11, :cond_8a

    move-wide/from16 v47, v3

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v3

    .line 50
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v4

    if-lez v4, :cond_1f

    move/from16 v49, v3

    const/4 v3, 0x1

    :goto_18
    move/from16 v50, v4

    goto :goto_19

    :cond_1f
    move/from16 v49, v3

    const/4 v3, 0x0

    goto :goto_18

    .line 51
    :goto_19
    const-string v4, "childAtomSize must be positive"

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 52
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v3

    move-object/from16 v51, v8

    const v8, 0x61766331

    move/from16 v52, v10

    const v10, 0x656e6376

    if-eq v3, v8, :cond_20

    const v8, 0x61766333

    if-eq v3, v8, :cond_20

    if-eq v3, v10, :cond_20

    const v8, 0x6d317620

    if-eq v3, v8, :cond_20

    const v8, 0x6d703476

    if-eq v3, v8, :cond_20

    const v8, 0x68766331

    if-eq v3, v8, :cond_20

    const v8, 0x68657631

    if-eq v3, v8, :cond_20

    const v8, 0x76766331

    if-eq v3, v8, :cond_20

    const v8, 0x76766931

    if-eq v3, v8, :cond_20

    const v8, 0x73323633

    if-eq v3, v8, :cond_20

    const v8, 0x48323633

    if-eq v3, v8, :cond_20

    const v8, 0x68323633

    if-eq v3, v8, :cond_20

    const v8, 0x76703038

    if-eq v3, v8, :cond_20

    const v8, 0x76703039

    if-eq v3, v8, :cond_20

    const v8, 0x61763031

    if-eq v3, v8, :cond_20

    const v8, 0x64766176

    if-eq v3, v8, :cond_20

    const v8, 0x64766131

    if-eq v3, v8, :cond_20

    const v8, 0x64766865

    if-eq v3, v8, :cond_20

    const v8, 0x64766831

    if-eq v3, v8, :cond_20

    const v8, 0x61707631

    if-eq v3, v8, :cond_20

    const v8, 0x64617631

    if-ne v3, v8, :cond_21

    :cond_20
    move-object/from16 v8, p4

    move/from16 v16, v1

    move/from16 v17, v2

    move-object v1, v7

    move/from16 v19, v11

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v2, v50

    move-object/from16 v62, v51

    const/16 v11, 0x10

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const v36, 0x74657874

    move v7, v3

    move/from16 v3, v49

    goto/16 :goto_27

    :cond_21
    const v4, 0x6d703461

    if-eq v3, v4, :cond_30

    const v4, 0x656e6361

    if-eq v3, v4, :cond_30

    const v4, 0x61632d33

    if-eq v3, v4, :cond_30

    const v4, 0x65632d33

    if-eq v3, v4, :cond_30

    const v4, 0x61632d34

    if-eq v3, v4, :cond_30

    const v4, 0x6d6c7061

    if-eq v3, v4, :cond_30

    const v4, 0x64747363

    if-eq v3, v4, :cond_30

    const v4, 0x64747365

    if-eq v3, v4, :cond_30

    const v4, 0x64747368

    if-eq v3, v4, :cond_30

    const v4, 0x6474736c

    if-eq v3, v4, :cond_30

    const v4, 0x64747378

    if-eq v3, v4, :cond_30

    const v4, 0x73616d72

    if-eq v3, v4, :cond_30

    const v4, 0x73617762

    if-eq v3, v4, :cond_30

    const v4, 0x6c70636d

    if-eq v3, v4, :cond_30

    const v4, 0x736f7774

    if-eq v3, v4, :cond_30

    const v4, 0x74776f73

    if-eq v3, v4, :cond_30

    const v4, 0x2e6d7032

    if-eq v3, v4, :cond_30

    const v4, 0x2e6d7033

    if-eq v3, v4, :cond_30

    const v4, 0x6d686131

    if-eq v3, v4, :cond_30

    const v4, 0x6d686d31

    if-eq v3, v4, :cond_30

    const v4, 0x616c6163

    if-eq v3, v4, :cond_30

    const v4, 0x616c6177

    if-eq v3, v4, :cond_30

    const v4, 0x756c6177

    if-eq v3, v4, :cond_30

    const v4, 0x4f707573

    if-eq v3, v4, :cond_30

    const v4, 0x664c6143

    if-eq v3, v4, :cond_30

    const v4, 0x69616d66

    if-eq v3, v4, :cond_30

    const v4, 0x6970636d

    if-eq v3, v4, :cond_30

    const v4, 0x6670636d

    if-ne v3, v4, :cond_22

    move-object/from16 v8, p4

    move/from16 v16, v1

    move/from16 v17, v2

    move v2, v3

    move-object v1, v7

    move/from16 v19, v11

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v3, v49

    move/from16 v4, v50

    move-object/from16 v62, v51

    move/from16 v10, v52

    const/16 v11, 0x10

    :goto_1a
    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const v36, 0x74657874

    move/from16 v7, p6

    goto/16 :goto_26

    :cond_22
    const v4, 0x54544d4c

    if-eq v3, v4, :cond_26

    const v4, 0x74783367

    if-eq v3, v4, :cond_26

    const v4, 0x77767474

    if-eq v3, v4, :cond_26

    const v4, 0x73747070

    if-eq v3, v4, :cond_26

    const v4, 0x63363038

    if-eq v3, v4, :cond_26

    const v4, 0x6d703473

    if-eq v3, v4, :cond_26

    const v4, 0x74657874

    if-ne v3, v4, :cond_23

    :goto_1b
    const/16 v29, 0x10

    goto/16 :goto_1f

    :cond_23
    const v8, 0x6d657474

    if-ne v3, v8, :cond_25

    const/16 v29, 0x10

    add-int/lit8 v3, v49, 0x10

    .line 53
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v3, 0x0

    .line 54
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    .line 55
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 56
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    :cond_24
    :goto_1c
    move v3, v0

    move/from16 v16, v1

    move/from16 v17, v2

    move/from16 v36, v4

    move-object v1, v7

    move-object v4, v9

    move/from16 v19, v11

    move-object/from16 v27, v12

    move/from16 v32, v15

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v25, v49

    move/from16 v70, v50

    move-object/from16 v2, v51

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    :goto_1d
    move v12, v5

    move-wide/from16 v49, v13

    :goto_1e
    const/4 v5, 0x0

    goto/16 :goto_6c

    :cond_25
    const v8, 0x63616d6d

    if-ne v3, v8, :cond_24

    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 57
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 58
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    const-string v8, "application/x-camera-motion"

    .line 59
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 60
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    goto :goto_1c

    :cond_26
    const v4, 0x74657874

    goto :goto_1b

    :goto_1f
    add-int/lit8 v8, v49, 0x10

    .line 61
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const-wide v53, 0x7fffffffffffffffL

    const v8, 0x54544d4c

    if-ne v3, v8, :cond_27

    move/from16 v19, v11

    move-object/from16 v4, v39

    :goto_20
    move-wide/from16 v10, v53

    :goto_21
    const/4 v3, 0x0

    goto/16 :goto_25

    :cond_27
    const v10, 0x74783367

    if-ne v3, v10, :cond_28

    add-int/lit8 v3, v50, -0x10

    .line 62
    new-array v4, v3, [B

    const/4 v8, 0x0

    .line 63
    invoke-virtual {v7, v4, v8, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 64
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v3

    const-string v4, "application/x-quicktime-tx3g"

    move/from16 v19, v11

    :goto_22
    move-wide/from16 v10, v53

    goto/16 :goto_25

    :cond_28
    const v4, 0x77767474

    const/4 v8, 0x0

    if-ne v3, v4, :cond_29

    const-string v3, "application/x-mp4-vtt"

    :goto_23
    move-object v4, v3

    move/from16 v19, v11

    goto :goto_20

    :cond_29
    const v4, 0x73747070

    if-ne v3, v4, :cond_2a

    move/from16 v19, v11

    move-wide/from16 v10, v37

    move-object/from16 v4, v39

    goto :goto_21

    :cond_2a
    const v4, 0x63363038

    if-ne v3, v4, :cond_2b

    const/4 v4, 0x1

    iput v4, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzd:I

    const-string v3, "application/x-mp4-cea-608"

    goto :goto_23

    :cond_2b
    move/from16 v19, v11

    const/4 v4, 0x1

    const v11, 0x6d703473

    if-ne v3, v11, :cond_2e

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v3

    const/4 v4, 0x4

    .line 65
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 66
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v4

    const v8, 0x65736473

    if-ne v4, v8, :cond_2d

    .line 67
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/ads/zzalo;->zzq(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzalf;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzalf;->zzb()[B

    move-result-object v4

    if-eqz v4, :cond_2c

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzalf;->zzb()[B

    move-result-object v4

    .line 68
    array-length v4, v4

    const/16 v8, 0x40

    if-ne v4, v8, :cond_2c

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzalf;->zzb()[B

    move-result-object v3

    .line 69
    invoke-static {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzalo;->zzl([BII)Ljava/lang/String;

    move-result-object v3

    .line 70
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 71
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 72
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v3

    const-string v4, "application/vobsub"

    goto :goto_22

    :cond_2c
    move v3, v0

    move/from16 v16, v1

    move/from16 v17, v2

    move-object v1, v7

    move-object v4, v9

    move/from16 v18, v10

    move-object/from16 v27, v12

    move/from16 v32, v15

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v25, v49

    move/from16 v70, v50

    move-object/from16 v2, v51

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    :goto_24
    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    const v36, 0x74657874

    goto/16 :goto_1d

    :cond_2d
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto/16 :goto_22

    :cond_2e
    move-object v4, v12

    goto/16 :goto_20

    :goto_25
    if-eqz v4, :cond_2f

    .line 73
    new-instance v8, Lcom/google/android/gms/internal/ads/zzt;

    .line 74
    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 75
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 76
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 77
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 78
    invoke-virtual {v8, v10, v11}, Lcom/google/android/gms/internal/ads/zzt;->zzt(J)Lcom/google/android/gms/internal/ads/zzt;

    .line 79
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 80
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    :cond_2f
    move v3, v0

    move/from16 v16, v1

    move/from16 v17, v2

    move-object v1, v7

    move-object v4, v9

    move-object/from16 v27, v12

    move/from16 v32, v15

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v25, v49

    move/from16 v70, v50

    move-object/from16 v2, v51

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    const v18, 0x74783367

    goto :goto_24

    :cond_30
    move/from16 v19, v11

    const/16 v29, 0x10

    move-object/from16 v8, p4

    move/from16 v16, v1

    move/from16 v17, v2

    move v2, v3

    move-object v1, v7

    move/from16 v11, v29

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    move-wide/from16 v60, v47

    move/from16 v3, v49

    move/from16 v4, v50

    move-object/from16 v62, v51

    move/from16 v10, v52

    goto/16 :goto_1a

    .line 81
    :goto_26
    invoke-static/range {v1 .. v10}, Lcom/google/android/gms/internal/ads/zzalo;->zzp(Lcom/google/android/gms/internal/ads/zzeu;IIIILjava/lang/String;ZLcom/google/android/gms/internal/ads/zzq;Lcom/google/android/gms/internal/ads/zzalk;I)V

    move/from16 v52, v10

    move/from16 v25, v3

    move/from16 v70, v4

    move-object v4, v9

    move-object/from16 v27, v12

    move-wide/from16 v49, v13

    move/from16 v32, v15

    move-object/from16 v2, v62

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    move v3, v0

    move v12, v5

    goto/16 :goto_1e

    :goto_27
    add-int/lit8 v10, v3, 0x10

    .line 82
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 83
    invoke-virtual {v1, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 84
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v10

    .line 85
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v11

    move-wide/from16 v49, v13

    const/16 v13, 0x32

    .line 86
    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v13

    const v14, 0x656e6376

    if-ne v7, v14, :cond_33

    .line 87
    invoke-static {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzalo;->zzs(Lcom/google/android/gms/internal/ads/zzeu;II)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_32

    .line 88
    iget-object v14, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-nez v8, :cond_31

    move/from16 v25, v3

    const/16 v26, 0x0

    goto :goto_28

    :cond_31
    move/from16 v25, v3

    .line 89
    iget-object v3, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/internal/ads/zzamq;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzamq;->zzb:Ljava/lang/String;

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzq;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzq;

    move-result-object v3

    move-object/from16 v26, v3

    .line 90
    :goto_28
    iget-object v3, v9, Lcom/google/android/gms/internal/ads/zzalk;->zza:[Lcom/google/android/gms/internal/ads/zzamq;

    .line 91
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Lcom/google/android/gms/internal/ads/zzamq;

    aput-object v7, v3, v52

    :goto_29
    move v3, v14

    goto :goto_2a

    :cond_32
    move/from16 v25, v3

    move-object/from16 v26, v8

    goto :goto_29

    .line 92
    :goto_2a
    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    move v7, v3

    move-object/from16 v3, v26

    :goto_2b
    const v14, 0x6d317620

    goto :goto_2c

    :cond_33
    move/from16 v25, v3

    move-object v3, v8

    goto :goto_2b

    :goto_2c
    if-ne v7, v14, :cond_34

    const-string v26, "video/mpeg"

    goto :goto_2d

    :cond_34
    const v14, 0x48323633

    if-ne v7, v14, :cond_35

    move v7, v14

    move-object/from16 v26, v24

    goto :goto_2d

    :cond_35
    const/16 v26, 0x0

    :goto_2d
    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v53, v0

    move-object/from16 v35, v3

    move/from16 v68, v5

    move-object/from16 v33, v6

    move/from16 v66, v10

    move/from16 v65, v11

    move-object/from16 v27, v12

    move v3, v13

    move/from16 v67, v14

    move/from16 v32, v15

    move-object/from16 v5, v26

    const/4 v0, -0x1

    const/4 v6, 0x0

    const/16 v8, 0x8

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v34, 0x0

    const/16 v44, 0x0

    const/16 v47, 0x0

    const/16 v48, -0x1

    const/16 v51, 0x0

    const/16 v54, -0x1

    const/16 v63, -0x1

    const/16 v64, -0x1

    const/16 v69, 0x0

    :goto_2e
    sub-int v15, v3, v25

    if-ge v15, v2, :cond_36

    .line 93
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v15

    .line 94
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v70

    if-nez v70, :cond_38

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v70

    move/from16 v71, v3

    sub-int v3, v70, v25

    if-ne v3, v2, :cond_37

    :cond_36
    move/from16 v70, v2

    move-object/from16 v73, v5

    move/from16 v79, v8

    move-object/from16 v75, v9

    move/from16 v84, v11

    move/from16 v78, v12

    move-object/from16 v2, v62

    const/4 v5, 0x0

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    goto/16 :goto_68

    :cond_37
    const/4 v3, 0x0

    goto :goto_2f

    :cond_38
    move/from16 v71, v3

    move/from16 v3, v70

    :goto_2f
    if-lez v3, :cond_39

    move/from16 v70, v2

    const/4 v2, 0x1

    goto :goto_30

    :cond_39
    move/from16 v70, v2

    const/4 v2, 0x0

    .line 95
    :goto_30
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 96
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v2

    move/from16 v72, v15

    const v15, 0x61766343

    if-ne v2, v15, :cond_3c

    const/16 v15, 0x8

    add-int/lit8 v0, v72, 0x8

    if-nez v5, :cond_3a

    const/4 v2, 0x1

    :goto_31
    const/4 v5, 0x0

    goto :goto_32

    :cond_3a
    const/4 v2, 0x0

    goto :goto_31

    .line 97
    :goto_32
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 98
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 99
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzaff;->zza(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzaff;

    move-result-object v0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaff;->zza:Ljava/util/List;

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzb:I

    iput v6, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzc:I

    if-nez v26, :cond_3b

    iget v6, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzk:F

    move/from16 v67, v6

    const/4 v6, 0x0

    goto :goto_33

    :cond_3b
    const/4 v6, 0x1

    :goto_33
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzl:Ljava/lang/String;

    iget v10, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzj:I

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzg:I

    iget v12, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzh:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzi:I

    move/from16 v56, v15

    iget v15, v0, Lcom/google/android/gms/internal/ads/zzaff;->zze:I

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzaff;->zzf:I

    const-string v26, "video/avc"

    move/from16 v34, v12

    move v12, v0

    move v0, v11

    move/from16 v11, v34

    move-object/from16 v77, v4

    move/from16 v74, v7

    move-object/from16 v34, v8

    move-object/from16 v75, v9

    move/from16 v48, v10

    move/from16 v79, v15

    move-object/from16 v73, v26

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    move v10, v5

    move/from16 v26, v6

    const/4 v5, 0x0

    move-object v6, v2

    move-object/from16 v2, v62

    goto/16 :goto_67

    :cond_3c
    const/16 v56, 0x8

    const v15, 0x68766343

    if-ne v2, v15, :cond_40

    add-int/lit8 v15, v72, 0x8

    if-nez v5, :cond_3d

    const/4 v0, 0x1

    :goto_34
    const/4 v5, 0x0

    goto :goto_35

    :cond_3d
    const/4 v0, 0x0

    goto :goto_34

    .line 100
    :goto_35
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 101
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 102
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzagu;->zza(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzagu;

    move-result-object v0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzagu;->zza:Ljava/util/List;

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzb:I

    iput v5, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzc:I

    if-nez v26, :cond_3e

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzl:F

    move/from16 v67, v5

    const/4 v5, 0x0

    goto :goto_36

    :cond_3e
    const/4 v5, 0x1

    :goto_36
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzm:I

    iget v8, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzc:I

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzn:Ljava/lang/String;

    iget v11, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzk:I

    const/4 v12, -0x1

    if-eq v11, v12, :cond_3f

    goto :goto_37

    :cond_3f
    move v11, v14

    :goto_37
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzd:I

    iget v13, v0, Lcom/google/android/gms/internal/ads/zzagu;->zze:I

    iget v14, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzh:I

    iget v15, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzi:I

    move-object/from16 v34, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzj:I

    move/from16 v26, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzf:I

    move/from16 v48, v2

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzg:I

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzagu;->zzo:Lcom/google/android/gms/internal/ads/zzgo;

    const-string v54, "video/hevc"

    move-object/from16 v77, v4

    move/from16 v74, v7

    move/from16 v63, v8

    move-object/from16 v75, v9

    move/from16 v64, v13

    move/from16 v79, v48

    move-object/from16 v73, v54

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    move-object v13, v0

    move/from16 v48, v6

    move/from16 v54, v12

    move v0, v14

    move-object/from16 v6, v34

    move v12, v2

    move-object/from16 v34, v10

    move v14, v11

    move v11, v15

    move/from16 v10, v26

    move-object/from16 v2, v62

    const/4 v15, -0x1

    move/from16 v26, v5

    :goto_38
    const/4 v5, 0x0

    goto/16 :goto_67

    :cond_40
    const v15, 0x6c687643

    if-ne v2, v15, :cond_4d

    add-int/lit8 v15, v72, 0x8

    const-string v2, "video/hevc"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "lhvC must follow hvcC atom"

    .line 103
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    if-eqz v13, :cond_42

    iget-object v2, v13, Lcom/google/android/gms/internal/ads/zzgo;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 104
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v5, 0x2

    if-lt v2, v5, :cond_41

    const/4 v2, 0x1

    goto :goto_39

    :cond_41
    const/4 v2, 0x0

    goto :goto_39

    :cond_42
    const/4 v2, 0x0

    const/4 v13, 0x0

    :goto_39
    const-string v5, "must have at least two layers"

    .line 105
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 106
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-static {v1, v13}, Lcom/google/android/gms/internal/ads/zzagu;->zzb(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzgo;)Lcom/google/android/gms/internal/ads/zzagu;

    move-result-object v2

    iget v5, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzc:I

    iget v15, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzb:I

    if-ne v5, v15, :cond_43

    const/4 v5, 0x1

    goto :goto_3a

    :cond_43
    const/4 v5, 0x0

    :goto_3a
    const-string v15, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    .line 109
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzh:I

    const/4 v15, -0x1

    if-eq v5, v15, :cond_45

    if-ne v0, v5, :cond_44

    const/4 v5, 0x1

    goto :goto_3b

    :cond_44
    const/4 v5, 0x0

    :goto_3b
    const-string v15, "colorSpace must be the same for both views"

    .line 110
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    :cond_45
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzi:I

    const/4 v15, -0x1

    if-eq v5, v15, :cond_47

    if-ne v11, v5, :cond_46

    const/4 v5, 0x1

    goto :goto_3c

    :cond_46
    const/4 v5, 0x0

    :goto_3c
    const-string v15, "colorRange must be the same for both views"

    .line 111
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    :cond_47
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzj:I

    const/4 v15, -0x1

    if-eq v5, v15, :cond_49

    if-ne v10, v5, :cond_48

    const/4 v5, 0x1

    goto :goto_3d

    :cond_48
    const/4 v5, 0x0

    :goto_3d
    const-string v15, "colorTransfer must be the same for both views"

    .line 112
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    :cond_49
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzf:I

    if-ne v8, v5, :cond_4a

    const/4 v5, 0x1

    goto :goto_3e

    :cond_4a
    const/4 v5, 0x0

    :goto_3e
    const-string v15, "bitdepthLuma must be the same for both views"

    .line 113
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzg:I

    if-ne v12, v5, :cond_4b

    const/4 v5, 0x1

    goto :goto_3f

    :cond_4b
    const/4 v5, 0x0

    :goto_3f
    const-string v15, "bitdepthChroma must be the same for both views"

    .line 114
    invoke-static {v5, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    if-eqz v6, :cond_4c

    .line 115
    sget v5, Lcom/google/android/gms/internal/ads/zzgwt;->zzd:I

    new-instance v5, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 116
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 117
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgwq;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwq;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzagu;->zza:Ljava/util/List;

    .line 118
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgwq;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 119
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v6

    const/4 v15, 0x0

    goto :goto_40

    :cond_4c
    const-string v5, "initializationData must be already set from hvcC atom"

    const/4 v15, 0x0

    .line 120
    invoke-static {v15, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 121
    :goto_40
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzagu;->zzn:Ljava/lang/String;

    const-string v5, "video/mv-hevc"

    move-object/from16 v34, v2

    move-object/from16 v77, v4

    move-object/from16 v73, v5

    move/from16 v74, v7

    move/from16 v79, v8

    move-object/from16 v75, v9

    :goto_41
    move-object/from16 v2, v62

    :goto_42
    const/4 v5, 0x0

    :goto_43
    const/4 v7, 0x3

    const v8, 0x65736473

    :goto_44
    const/4 v9, 0x2

    :goto_45
    const/4 v15, -0x1

    goto/16 :goto_67

    :cond_4d
    const v15, 0x76766343

    if-ne v2, v15, :cond_4f

    add-int/lit8 v15, v72, 0x8

    if-nez v5, :cond_4e

    const/4 v2, 0x1

    :goto_46
    const/4 v5, 0x0

    goto :goto_47

    :cond_4e
    const/4 v2, 0x0

    goto :goto_46

    .line 122
    :goto_47
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 123
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 124
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzahp;->zza(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzahp;

    move-result-object v2

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzahp;->zza:Ljava/util/List;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzahp;->zzb:I

    iput v6, v9, Lcom/google/android/gms/internal/ads/zzalk;->zzc:I

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzahp;->zzc:Ljava/lang/String;

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzahp;->zzd:I

    const-string v8, "video/vvc"

    move v12, v2

    move/from16 v79, v12

    move-object/from16 v77, v4

    move-object/from16 v34, v6

    move/from16 v74, v7

    move-object/from16 v73, v8

    move-object/from16 v75, v9

    move-object/from16 v2, v62

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    const/16 v48, 0x10

    move-object v6, v5

    goto/16 :goto_38

    :cond_4f
    const v15, 0x76657875

    if-ne v2, v15, :cond_5f

    add-int/lit8 v15, v72, 0x8

    .line 125
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v2

    move-object/from16 v73, v5

    const/4 v15, 0x0

    :goto_48
    sub-int v5, v2, v72

    if-ge v5, v3, :cond_58

    .line 126
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 127
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v5

    if-lez v5, :cond_50

    move/from16 v74, v2

    const/4 v2, 0x1

    goto :goto_49

    :cond_50
    move/from16 v74, v2

    const/4 v2, 0x0

    .line 128
    :goto_49
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 129
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v2

    move-object/from16 v75, v9

    const v9, 0x65796573

    if-ne v2, v9, :cond_57

    add-int/lit8 v2, v74, 0x8

    .line 130
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v2

    :goto_4a
    sub-int v9, v2, v74

    if-ge v9, v5, :cond_56

    .line 131
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 132
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v9

    if-lez v9, :cond_51

    const/4 v15, 0x1

    goto :goto_4b

    :cond_51
    const/4 v15, 0x0

    .line 133
    :goto_4b
    invoke-static {v15, v4}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 134
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v15

    move/from16 v76, v2

    const v2, 0x73747269

    if-ne v15, v2, :cond_55

    const/4 v2, 0x4

    .line 135
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 136
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v2

    const/4 v15, 0x1

    and-int/lit8 v9, v2, 0x1

    move/from16 v76, v2

    const/4 v15, 0x2

    and-int/lit8 v2, v76, 0x2

    if-ne v2, v15, :cond_52

    const/4 v2, 0x1

    goto :goto_4c

    :cond_52
    const/4 v2, 0x0

    :goto_4c
    and-int/lit8 v15, v76, 0x8

    move-object/from16 v77, v4

    move/from16 v4, v56

    if-ne v15, v4, :cond_53

    const/4 v4, 0x1

    :goto_4d
    const/4 v15, 0x1

    goto :goto_4e

    :cond_53
    const/4 v4, 0x0

    goto :goto_4d

    :goto_4e
    if-eq v15, v9, :cond_54

    const/4 v9, 0x0

    goto :goto_4f

    :cond_54
    move v9, v15

    :goto_4f
    new-instance v15, Lcom/google/android/gms/internal/ads/zzalg;

    move/from16 v78, v5

    new-instance v5, Lcom/google/android/gms/internal/ads/zzalj;

    .line 137
    invoke-direct {v5, v9, v2, v4}, Lcom/google/android/gms/internal/ads/zzalj;-><init>(ZZZ)V

    invoke-direct {v15, v5}, Lcom/google/android/gms/internal/ads/zzalg;-><init>(Lcom/google/android/gms/internal/ads/zzalj;)V

    :goto_50
    const/4 v4, 0x1

    goto :goto_51

    :cond_55
    move-object/from16 v77, v4

    move/from16 v78, v5

    add-int v2, v76, v9

    const/16 v56, 0x8

    goto :goto_4a

    :cond_56
    move-object/from16 v77, v4

    move/from16 v78, v5

    const/4 v4, 0x1

    const/4 v15, 0x0

    goto :goto_51

    :cond_57
    move-object/from16 v77, v4

    move/from16 v78, v5

    goto :goto_50

    :goto_51
    add-int v2, v74, v78

    move-object/from16 v9, v75

    move-object/from16 v4, v77

    const/16 v56, 0x8

    goto/16 :goto_48

    :cond_58
    move-object/from16 v77, v4

    move-object/from16 v75, v9

    const/4 v4, 0x1

    if-nez v15, :cond_59

    const/4 v9, 0x0

    goto :goto_52

    .line 138
    :cond_59
    new-instance v9, Lcom/google/android/gms/internal/ads/zzaln;

    invoke-direct {v9, v15}, Lcom/google/android/gms/internal/ads/zzaln;-><init>(Lcom/google/android/gms/internal/ads/zzalg;)V

    :goto_52
    if-eqz v9, :cond_5a

    if-eqz v13, :cond_5c

    .line 139
    iget-object v2, v13, Lcom/google/android/gms/internal/ads/zzgo;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 140
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v15, 0x2

    if-lt v2, v15, :cond_5b

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzaln;->zza()Z

    move-result v2

    const-string v5, "both eye views must be marked as available"

    .line 141
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzaln;->zzb()Lcom/google/android/gms/internal/ads/zzalg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalg;->zza()Lcom/google/android/gms/internal/ads/zzalj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalj;->zzc()Z

    move-result v2

    xor-int/2addr v2, v4

    const-string v5, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 142
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    :cond_5a
    move/from16 v74, v7

    move/from16 v79, v8

    move/from16 v84, v11

    move/from16 v78, v12

    move-object/from16 v76, v13

    move-object/from16 v2, v62

    const/4 v5, 0x0

    const/4 v7, 0x3

    const v8, 0x65736473

    :goto_53
    const/4 v9, 0x2

    const/4 v15, -0x1

    goto/16 :goto_65

    :cond_5b
    :goto_54
    const/4 v15, -0x1

    goto :goto_55

    :cond_5c
    const/4 v13, 0x0

    goto :goto_54

    :goto_55
    if-ne v14, v15, :cond_5e

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzaln;->zzb()Lcom/google/android/gms/internal/ads/zzalg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalg;->zza()Lcom/google/android/gms/internal/ads/zzalj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalj;->zzc()Z

    move-result v2

    move/from16 v74, v7

    move/from16 v79, v8

    if-eq v4, v2, :cond_5d

    move-object/from16 v2, v62

    const/4 v5, 0x0

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v14, 0x4

    goto/16 :goto_45

    :cond_5d
    move/from16 v14, v28

    goto/16 :goto_41

    :cond_5e
    move/from16 v74, v7

    move/from16 v79, v8

    move-object/from16 v2, v62

    const/4 v5, 0x0

    const/4 v7, 0x3

    const v8, 0x65736473

    :goto_56
    const/4 v9, 0x2

    goto/16 :goto_67

    :cond_5f
    move-object/from16 v77, v4

    move-object/from16 v73, v5

    move-object/from16 v75, v9

    const/4 v4, 0x1

    const v5, 0x64766343

    if-eq v2, v5, :cond_60

    const v5, 0x64767643

    if-eq v2, v5, :cond_60

    const v5, 0x64767743

    if-ne v2, v5, :cond_61

    :cond_60
    move/from16 v74, v7

    move/from16 v79, v8

    move/from16 v84, v11

    move/from16 v78, v12

    move-object/from16 v76, v13

    move-object/from16 v2, v62

    const/4 v5, 0x0

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    goto/16 :goto_66

    :cond_61
    const v5, 0x76706343

    if-ne v2, v5, :cond_66

    add-int/lit8 v15, v72, 0xc

    if-nez v73, :cond_62

    move v0, v4

    :goto_57
    const/4 v5, 0x0

    goto :goto_58

    :cond_62
    const/4 v0, 0x0

    goto :goto_57

    .line 143
    :goto_58
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 144
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 145
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v0

    int-to-byte v0, v0

    .line 146
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v2

    int-to-byte v2, v2

    .line 147
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v5

    const/16 v31, 0x4

    shr-int/lit8 v8, v5, 0x4

    shr-int/lit8 v9, v5, 0x1

    const v15, 0x76703038

    if-ne v7, v15, :cond_63

    const-string v10, "video/x-vnd.on2.vp8"

    goto :goto_59

    .line 148
    :cond_63
    const-string v10, "video/x-vnd.on2.vp9"

    .line 149
    :goto_59
    const-string v11, "video/x-vnd.on2.vp9"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_64

    and-int/lit8 v6, v9, 0x7

    int-to-byte v9, v8

    int-to-byte v6, v6

    .line 150
    invoke-static {v0, v2, v9, v6}, Lcom/google/android/gms/internal/ads/zzdr;->zza(BBBB)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v6

    :cond_64
    and-int/lit8 v0, v5, 0x1

    .line 151
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v2

    .line 152
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v5

    .line 153
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    move-result v2

    if-eq v4, v0, :cond_65

    const/4 v0, 0x2

    goto :goto_5a

    :cond_65
    move v0, v4

    :goto_5a
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    move-result v5

    move v11, v0

    move v0, v2

    move/from16 v74, v7

    move v12, v8

    move/from16 v79, v12

    move-object/from16 v73, v10

    move-object/from16 v2, v62

    const/4 v7, 0x3

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    move v10, v5

    goto/16 :goto_38

    :cond_66
    const v15, 0x76703038

    const v5, 0x61763143

    if-ne v2, v5, :cond_68

    add-int/lit8 v2, v3, -0x8

    .line 154
    new-array v5, v2, [B

    const/4 v6, 0x0

    .line 155
    invoke-virtual {v1, v5, v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 156
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    .line 157
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzafe;->zza([B)Lcom/google/android/gms/internal/ads/zzafe;

    move-result-object v5

    if-eqz v5, :cond_67

    iget-object v0, v5, Lcom/google/android/gms/internal/ads/zzafe;->zze:Ljava/lang/String;

    iget v10, v5, Lcom/google/android/gms/internal/ads/zzafe;->zzd:I

    iget v11, v5, Lcom/google/android/gms/internal/ads/zzafe;->zzc:I

    iget v6, v5, Lcom/google/android/gms/internal/ads/zzafe;->zzb:I

    iget v8, v5, Lcom/google/android/gms/internal/ads/zzafe;->zza:I

    move-object/from16 v34, v0

    move v0, v6

    move v12, v8

    :cond_67
    const-string v5, "video/av01"

    move-object v6, v2

    move-object/from16 v73, v5

    :goto_5b
    move/from16 v74, v7

    move/from16 v79, v8

    goto/16 :goto_41

    :cond_68
    const v5, 0x636c6c69

    if-ne v2, v5, :cond_6a

    if-nez v30, :cond_69

    .line 158
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzalo;->zzn()Ljava/nio/ByteBuffer;

    move-result-object v30

    :cond_69
    move-object/from16 v2, v30

    const/16 v5, 0x15

    .line 159
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 160
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 161
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v30, v2

    goto :goto_5b

    :cond_6a
    const v5, 0x6d646376

    if-ne v2, v5, :cond_6c

    if-nez v30, :cond_6b

    .line 162
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzalo;->zzn()Ljava/nio/ByteBuffer;

    move-result-object v30

    :cond_6b
    move-object/from16 v2, v30

    .line 163
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v5

    .line 164
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v9

    .line 165
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v15

    .line 166
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v4

    move/from16 v74, v7

    .line 167
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v7

    move-object/from16 v76, v13

    .line 168
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v13

    move/from16 v78, v12

    .line 169
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v12

    move/from16 v79, v8

    .line 170
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    move-result v8

    .line 171
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    move-result-wide v80

    .line 172
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    move-result-wide v82

    move/from16 v84, v11

    const/4 v11, 0x1

    .line 173
    invoke-virtual {v2, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 174
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 175
    invoke-virtual {v2, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 176
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 177
    invoke-virtual {v2, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 178
    invoke-virtual {v2, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 179
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 180
    invoke-virtual {v2, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 181
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x2710

    div-long v4, v80, v4

    long-to-int v4, v4

    int-to-short v4, v4

    .line 182
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x2710

    div-long v4, v82, v4

    long-to-int v4, v4

    int-to-short v4, v4

    .line 183
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v30, v2

    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    goto/16 :goto_42

    :cond_6c
    move/from16 v74, v7

    move/from16 v79, v8

    move/from16 v84, v11

    move/from16 v78, v12

    move-object/from16 v76, v13

    const v4, 0x64323633

    if-ne v2, v4, :cond_6e

    if-nez v73, :cond_6d

    const/4 v2, 0x1

    :goto_5c
    const/4 v5, 0x0

    goto :goto_5d

    :cond_6d
    const/4 v2, 0x0

    goto :goto_5c

    .line 184
    :goto_5d
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    move-object/from16 v73, v24

    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    goto/16 :goto_43

    :cond_6e
    const/4 v5, 0x0

    const v8, 0x65736473

    if-ne v2, v8, :cond_71

    if-nez v73, :cond_6f

    const/4 v2, 0x1

    goto :goto_5e

    :cond_6f
    const/4 v2, 0x0

    .line 185
    :goto_5e
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    move/from16 v4, v72

    .line 186
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzalo;->zzq(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzalf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalf;->zza()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzalf;->zzb()[B

    move-result-object v7

    if-eqz v7, :cond_70

    .line 187
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v6

    :cond_70
    move-object/from16 v47, v2

    move-object/from16 v73, v4

    :goto_5f
    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    const/4 v7, 0x3

    goto/16 :goto_44

    :cond_71
    move/from16 v4, v72

    const v7, 0x62747274

    if-ne v2, v7, :cond_72

    .line 188
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzalo;->zzr(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzald;

    move-result-object v2

    move-object/from16 v44, v2

    goto :goto_5f

    :cond_72
    const v7, 0x70617370

    if-ne v2, v7, :cond_73

    const/16 v56, 0x8

    add-int/lit8 v15, v4, 0x8

    .line 189
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 190
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v2

    .line 191
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v4

    int-to-float v2, v2

    int-to-float v4, v4

    div-float/2addr v2, v4

    move/from16 v67, v2

    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    const/4 v7, 0x3

    const/4 v9, 0x2

    const/4 v15, -0x1

    const/16 v26, 0x1

    goto/16 :goto_67

    :cond_73
    const/16 v56, 0x8

    const v7, 0x73763364

    if-ne v2, v7, :cond_76

    add-int/lit8 v15, v4, 0x8

    :goto_60
    sub-int v2, v15, v4

    if-ge v2, v3, :cond_75

    .line 192
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 193
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v2

    add-int/2addr v2, v15

    .line 194
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v7

    const v9, 0x70726f6a

    if-ne v7, v9, :cond_74

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    move-result-object v4

    .line 195
    invoke-static {v4, v15, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    move-object/from16 v51, v2

    goto :goto_5f

    :cond_74
    move v15, v2

    goto :goto_60

    :cond_75
    move-object/from16 v51, v5

    goto :goto_5f

    :cond_76
    const v7, 0x73743364

    if-ne v2, v7, :cond_7c

    .line 196
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v2

    const/4 v7, 0x3

    .line 197
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    if-nez v2, :cond_77

    .line 198
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v2

    if-eqz v2, :cond_7b

    const/4 v15, 0x1

    if-eq v2, v15, :cond_7a

    const/4 v15, 0x2

    if-eq v2, v15, :cond_79

    if-eq v2, v7, :cond_78

    :cond_77
    move-object/from16 v2, v62

    goto/16 :goto_53

    :cond_78
    move v14, v7

    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    goto/16 :goto_44

    :cond_79
    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    const/4 v9, 0x2

    const/4 v14, 0x2

    goto/16 :goto_45

    :cond_7a
    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    const/4 v9, 0x2

    const/4 v14, 0x1

    goto/16 :goto_45

    :cond_7b
    move-object/from16 v2, v62

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    const/4 v9, 0x2

    const/4 v14, 0x0

    goto/16 :goto_45

    :cond_7c
    const/4 v7, 0x3

    const v9, 0x61707643

    if-ne v2, v9, :cond_7d

    add-int/lit8 v15, v4, 0xc

    add-int/lit8 v0, v3, -0xc

    .line 199
    new-array v2, v0, [B

    .line 200
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v15, 0x0

    .line 201
    invoke-virtual {v1, v2, v15, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 202
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzdr;->zzd([B)Ljava/lang/String;

    move-result-object v0

    .line 203
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v4

    new-instance v6, Lcom/google/android/gms/internal/ads/zzeu;

    .line 204
    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzalo;->zzm(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzi;

    move-result-object v2

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzi;->zzf:I

    iget v9, v2, Lcom/google/android/gms/internal/ads/zzi;->zzg:I

    iget v10, v2, Lcom/google/android/gms/internal/ads/zzi;->zzb:I

    iget v11, v2, Lcom/google/android/gms/internal/ads/zzi;->zzc:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    const-string v12, "video/apv"

    move-object/from16 v34, v0

    move/from16 v79, v6

    move v0, v10

    move-object/from16 v73, v12

    move-object/from16 v13, v76

    const/4 v15, -0x1

    move v10, v2

    move-object v6, v4

    move v12, v9

    move-object/from16 v2, v62

    goto/16 :goto_56

    :cond_7d
    const v4, 0x636f6c72

    if-ne v2, v4, :cond_77

    const/4 v15, -0x1

    if-ne v0, v15, :cond_84

    if-ne v10, v15, :cond_83

    .line 205
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v0

    const v2, 0x6e636c78

    if-eq v0, v2, :cond_7e

    const v2, 0x6e636c63

    if-ne v0, v2, :cond_7f

    :cond_7e
    move-object/from16 v2, v62

    goto :goto_61

    .line 206
    :cond_7f
    const-string v2, "Unsupported color type: "

    .line 207
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v62

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v15

    move v10, v0

    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    goto/16 :goto_56

    .line 208
    :goto_61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v0

    .line 209
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v4

    const/4 v9, 0x2

    .line 210
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    const/16 v10, 0x13

    if-ne v3, v10, :cond_81

    .line 211
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v3

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_80

    const/4 v3, 0x1

    goto :goto_63

    :cond_80
    :goto_62
    const/4 v3, 0x0

    goto :goto_63

    :cond_81
    move v10, v3

    goto :goto_62

    .line 212
    :goto_63
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    move-result v0

    const/4 v11, 0x1

    if-eq v11, v3, :cond_82

    move v3, v9

    goto :goto_64

    :cond_82
    const/4 v3, 0x1

    :goto_64
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    move-result v4

    move v11, v3

    move v3, v10

    move-object/from16 v13, v76

    move/from16 v12, v78

    move v10, v4

    goto :goto_67

    :cond_83
    move-object/from16 v2, v62

    const/4 v9, 0x2

    move v0, v15

    :goto_65
    move-object/from16 v13, v76

    move/from16 v12, v78

    move/from16 v11, v84

    goto :goto_67

    :cond_84
    move-object/from16 v2, v62

    const/4 v9, 0x2

    goto :goto_65

    .line 213
    :goto_66
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfw;->zza(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzfw;

    move-result-object v4

    move-object/from16 v69, v4

    goto :goto_65

    :goto_67
    add-int v3, v71, v3

    move-object/from16 v62, v2

    move/from16 v2, v70

    move-object/from16 v5, v73

    move/from16 v7, v74

    move-object/from16 v9, v75

    move-object/from16 v4, v77

    move/from16 v8, v79

    goto/16 :goto_2e

    :goto_68
    if-eqz v69, :cond_85

    move-object/from16 v3, v69

    .line 214
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzfw;->zza:Ljava/lang/String;

    const-string v4, "video/dolby-vision"

    goto :goto_69

    :cond_85
    move-object/from16 v3, v34

    move-object/from16 v4, v73

    :goto_69
    if-nez v4, :cond_86

    move-object/from16 v6, v33

    move/from16 v3, v53

    move/from16 v12, v68

    move-object/from16 v4, v75

    goto/16 :goto_6c

    .line 215
    :cond_86
    new-instance v11, Lcom/google/android/gms/internal/ads/zzt;

    .line 216
    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    move/from16 v12, v68

    .line 217
    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 218
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 219
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v66

    .line 220
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzv(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v65

    .line 221
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzw(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v54

    .line 222
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzx(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v64

    .line 223
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzy(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v67

    .line 224
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzB(F)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v3, v53

    .line 225
    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzA(I)Lcom/google/android/gms/internal/ads/zzt;

    move-object/from16 v4, v51

    .line 226
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzC([B)Lcom/google/android/gms/internal/ads/zzt;

    .line 227
    invoke-virtual {v11, v14}, Lcom/google/android/gms/internal/ads/zzt;->zzD(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 228
    invoke-virtual {v11, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v4, v48

    .line 229
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzq(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v4, v63

    .line 230
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzF(I)Lcom/google/android/gms/internal/ads/zzt;

    move-object/from16 v4, v35

    .line 231
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzs(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    move-object/from16 v6, v33

    .line 232
    invoke-virtual {v11, v6}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzh;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzh;-><init>()V

    .line 233
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzh;->zza(I)Lcom/google/android/gms/internal/ads/zzh;

    move/from16 v0, v84

    .line 234
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzh;->zzb(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 235
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/ads/zzh;->zzc(I)Lcom/google/android/gms/internal/ads/zzh;

    if-eqz v30, :cond_87

    .line 236
    invoke-virtual/range {v30 .. v30}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    goto :goto_6a

    :cond_87
    move-object v0, v5

    :goto_6a
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzh;->zzd([B)Lcom/google/android/gms/internal/ads/zzh;

    move/from16 v0, v79

    .line 237
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzh;->zze(I)Lcom/google/android/gms/internal/ads/zzh;

    move/from16 v0, v78

    .line 238
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzh;->zzf(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 239
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzh;->zzg()Lcom/google/android/gms/internal/ads/zzi;

    move-result-object v0

    .line 240
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzE(Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzt;

    if-eqz v44, :cond_88

    invoke-virtual/range {v44 .. v44}, Lcom/google/android/gms/internal/ads/zzald;->zza()J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v0

    .line 241
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual/range {v44 .. v44}, Lcom/google/android/gms/internal/ads/zzald;->zzb()J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v0

    .line 242
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    goto :goto_6b

    :cond_88
    if-eqz v47, :cond_89

    .line 243
    invoke-virtual/range {v47 .. v47}, Lcom/google/android/gms/internal/ads/zzalf;->zzc()J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v0

    .line 244
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual/range {v47 .. v47}, Lcom/google/android/gms/internal/ads/zzalf;->zzd()J

    move-result-wide v13

    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v0

    .line 245
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 246
    :cond_89
    :goto_6b
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v0

    move-object/from16 v4, v75

    iput-object v0, v4, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    :goto_6c
    add-int v0, v25, v70

    .line 247
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/16 v55, 0x1

    add-int/lit8 v10, v52, 0x1

    move-object v7, v1

    move-object v8, v2

    move v0, v3

    move-object v9, v4

    move v5, v12

    move/from16 v1, v16

    move/from16 v2, v17

    move/from16 v11, v19

    move-object/from16 v12, v27

    move/from16 v15, v32

    move-wide/from16 v13, v49

    move-object/from16 v44, v58

    move-object/from16 v33, v59

    move-wide/from16 v3, v60

    goto/16 :goto_17

    :cond_8a
    move-wide/from16 v60, v3

    move-object v2, v8

    move-object v4, v9

    move-object/from16 v27, v12

    move-wide/from16 v49, v13

    move/from16 v32, v15

    move-object/from16 v59, v33

    move-object/from16 v58, v44

    const v8, 0x65736473

    const/4 v9, 0x2

    const/4 v15, -0x1

    const v18, 0x74783367

    const v20, 0x54544d4c

    const v21, 0x77767474

    const v22, 0x73747070

    const v23, 0x63363038

    move v12, v5

    const/4 v5, 0x0

    const v0, 0x74726566

    move-object/from16 v1, v59

    .line 248
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v0

    if-eqz v0, :cond_8c

    const v3, 0x63686170

    .line 249
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    move-result-object v0

    if-eqz v0, :cond_8c

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    const/16 v3, 0x8

    .line 250
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 251
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    move-result v6

    const/4 v7, 0x4

    if-lt v6, v7, :cond_8b

    .line 252
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v13

    goto :goto_6e

    :cond_8b
    :goto_6d
    move v13, v15

    goto :goto_6e

    :cond_8c
    const/16 v3, 0x8

    const/4 v7, 0x4

    goto :goto_6d

    :goto_6e
    if-nez p5, :cond_8d

    const v0, 0x65647473

    .line 253
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v0

    if-eqz v0, :cond_8d

    .line 254
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzalo;->zzo(Lcom/google/android/gms/internal/ads/zzfz;)Landroid/util/Pair;

    move-result-object v0

    if-eqz v0, :cond_8d

    .line 255
    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/internal/ads/zzhao;

    .line 256
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhao;

    goto :goto_6f

    :cond_8d
    move-object v0, v5

    move-object v6, v0

    :goto_6f
    iget-object v10, v4, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    if-nez v10, :cond_8e

    move-object/from16 v4, p7

    move-object v0, v5

    move-object/from16 v7, v27

    goto/16 :goto_72

    :cond_8e
    if-eqz v32, :cond_90

    new-instance v5, Lcom/google/android/gms/internal/ads/zzfy;

    move/from16 v11, v32

    invoke-direct {v5, v11}, Lcom/google/android/gms/internal/ads/zzfy;-><init>(I)V

    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    move-result-object v11

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    if-eqz v10, :cond_8f

    const/4 v15, 0x1

    new-array v14, v15, [Lcom/google/android/gms/internal/ads/zzao;

    const/16 v57, 0x0

    aput-object v5, v14, v57

    .line 257
    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    move-result-object v5

    goto :goto_70

    :cond_8f
    const/4 v15, 0x1

    const/16 v57, 0x0

    .line 258
    new-instance v10, Lcom/google/android/gms/internal/ads/zzap;

    new-array v14, v15, [Lcom/google/android/gms/internal/ads/zzao;

    aput-object v5, v14, v57

    move-wide/from16 v7, v41

    .line 259
    invoke-direct {v10, v7, v8, v14}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    move-object v5, v10

    .line 260
    :goto_70
    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 261
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v10

    goto :goto_71

    :cond_90
    const/4 v15, 0x1

    :goto_71
    iget-object v5, v10, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    move-object/from16 v7, v27

    .line 262
    invoke-static {v5, v7}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v15

    new-instance v8, Lcom/google/android/gms/internal/ads/zzamo;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzamo;-><init>()V

    .line 263
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/ads/zzamo;->zza(I)Lcom/google/android/gms/internal/ads/zzamo;

    move/from16 v11, v40

    .line 264
    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/ads/zzamo;->zzb(I)Lcom/google/android/gms/internal/ads/zzamo;

    invoke-virtual/range {v43 .. v43}, Lcom/google/android/gms/internal/ads/zzalh;->zza()J

    move-result-wide v11

    .line 265
    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/internal/ads/zzamo;->zzc(J)Lcom/google/android/gms/internal/ads/zzamo;

    move-wide/from16 v11, v49

    .line 266
    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/internal/ads/zzamo;->zzd(J)Lcom/google/android/gms/internal/ads/zzamo;

    move-wide/from16 v11, v60

    .line 267
    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/internal/ads/zzamo;->zze(J)Lcom/google/android/gms/internal/ads/zzamo;

    invoke-virtual/range {v43 .. v43}, Lcom/google/android/gms/internal/ads/zzalh;->zzb()J

    move-result-wide v11

    .line 268
    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/internal/ads/zzamo;->zzf(J)Lcom/google/android/gms/internal/ads/zzamo;

    .line 269
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/ads/zzamo;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzamo;

    iget v10, v4, Lcom/google/android/gms/internal/ads/zzalk;->zzd:I

    .line 270
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/ads/zzamo;->zzh(I)Lcom/google/android/gms/internal/ads/zzamo;

    iget-object v10, v4, Lcom/google/android/gms/internal/ads/zzalk;->zza:[Lcom/google/android/gms/internal/ads/zzamq;

    .line 271
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/ads/zzamo;->zzi([Lcom/google/android/gms/internal/ads/zzamq;)Lcom/google/android/gms/internal/ads/zzamo;

    iget v4, v4, Lcom/google/android/gms/internal/ads/zzalk;->zzc:I

    .line 272
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/zzamo;->zzj(I)Lcom/google/android/gms/internal/ads/zzamo;

    .line 273
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzamo;->zzk(Lcom/google/android/gms/internal/ads/zzhao;)Lcom/google/android/gms/internal/ads/zzamo;

    .line 274
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/zzamo;->zzl(Lcom/google/android/gms/internal/ads/zzhao;)Lcom/google/android/gms/internal/ads/zzamo;

    .line 275
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzamo;->zzm(Z)Lcom/google/android/gms/internal/ads/zzamo;

    .line 276
    invoke-virtual {v8, v13}, Lcom/google/android/gms/internal/ads/zzamo;->zzn(I)Lcom/google/android/gms/internal/ads/zzamo;

    .line 277
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzamo;->zzo()Lcom/google/android/gms/internal/ads/zzamp;

    move-result-object v0

    goto/16 :goto_2

    .line 278
    :goto_72
    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/ads/zzgti;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzamp;

    if-eqz v0, :cond_91

    const v5, 0x6d646961

    .line 279
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v1

    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v5, 0x6d696e66

    .line 281
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v1

    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7374626c

    .line 283
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    move-result-object v1

    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v8, p1

    const/4 v15, 0x0

    .line 285
    invoke-static {v0, v1, v8, v15}, Lcom/google/android/gms/internal/ads/zzalo;->zzg(Lcom/google/android/gms/internal/ads/zzamp;Lcom/google/android/gms/internal/ads/zzfz;Lcom/google/android/gms/internal/ads/zzagt;Z)Lcom/google/android/gms/internal/ads/zzams;

    move-result-object v0

    move-object/from16 v1, v58

    .line 286
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_73
    const/16 v55, 0x1

    goto :goto_74

    :cond_91
    move-object/from16 v8, p1

    move-object/from16 v1, v58

    const v5, 0x6d696e66

    const v6, 0x7374626c

    const/4 v15, 0x0

    goto :goto_73

    :goto_74
    add-int/lit8 v0, v45, 0x1

    move v6, v0

    move-object v5, v1

    move-object v8, v2

    move v4, v3

    move-object v12, v7

    move-object/from16 v11, v24

    move-object/from16 v14, v39

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_92
    move-object v1, v5

    return-object v1
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzga;)Lcom/google/android/gms/internal/ads/zzap;
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lcom/google/android/gms/internal/ads/zzap;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    new-array v4, v3, [Lcom/google/android/gms/internal/ads/zzao;

    .line 13
    .line 14
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-lt v4, v1, :cond_16

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    add-int/2addr v7, v4

    .line 37
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const v9, 0x6d657461

    .line 42
    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    if-ne v8, v9, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzf(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ge v4, v7, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    add-int/2addr v8, v4

    .line 71
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    const v11, 0x696c7374

    .line 76
    .line 77
    .line 78
    if-ne v9, v11, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    :cond_0
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-ge v9, v8, :cond_1

    .line 96
    .line 97
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzaly;->zzc(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzao;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    if-eqz v9, :cond_0

    .line 102
    .line 103
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_2

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_2
    new-instance v10, Lcom/google/android/gms/internal/ads/zzap;

    .line 115
    .line 116
    invoke-direct {v10, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :goto_3
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    goto/16 :goto_a

    .line 129
    .line 130
    :cond_5
    const v9, 0x736d7461

    .line 131
    .line 132
    .line 133
    if-ne v8, v9, :cond_13

    .line 134
    .line 135
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 136
    .line 137
    .line 138
    const/16 v4, 0xc

    .line 139
    .line 140
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 141
    .line 142
    .line 143
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-ge v8, v7, :cond_12

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    const v12, 0x73617574

    .line 162
    .line 163
    .line 164
    if-ne v11, v12, :cond_11

    .line 165
    .line 166
    const/16 v8, 0x10

    .line 167
    .line 168
    if-ge v9, v8, :cond_6

    .line 169
    .line 170
    goto/16 :goto_9

    .line 171
    .line 172
    :cond_6
    const/4 v8, 0x4

    .line 173
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 174
    .line 175
    .line 176
    const/4 v8, -0x1

    .line 177
    move v9, v3

    .line 178
    move v11, v9

    .line 179
    :goto_5
    const/4 v12, 0x2

    .line 180
    if-ge v9, v12, :cond_9

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-nez v12, :cond_7

    .line 191
    .line 192
    move v8, v13

    .line 193
    goto :goto_6

    .line 194
    :cond_7
    if-ne v12, v0, :cond_8

    .line 195
    .line 196
    move v11, v13

    .line 197
    :cond_8
    :goto_6
    add-int/2addr v9, v0

    .line 198
    goto :goto_5

    .line 199
    :cond_9
    const v9, -0x7fffffff

    .line 200
    .line 201
    .line 202
    if-ne v8, v4, :cond_a

    .line 203
    .line 204
    const/16 v4, 0xf0

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_a
    const/16 v12, 0xd

    .line 208
    .line 209
    if-ne v8, v12, :cond_b

    .line 210
    .line 211
    const/16 v4, 0x78

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_b
    const/16 v12, 0x15

    .line 215
    .line 216
    if-eq v8, v12, :cond_d

    .line 217
    .line 218
    :cond_c
    :goto_7
    move v4, v9

    .line 219
    goto :goto_8

    .line 220
    :cond_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-lt v8, v1, :cond_c

    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    add-int/2addr v8, v1

    .line 231
    if-le v8, v7, :cond_e

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 239
    .line 240
    .line 241
    move-result v12

    .line 242
    if-lt v8, v4, :cond_c

    .line 243
    .line 244
    const v4, 0x73726672

    .line 245
    .line 246
    .line 247
    if-eq v12, v4, :cond_f

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzF()I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    :goto_8
    if-ne v4, v9, :cond_10

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_10
    new-instance v10, Lcom/google/android/gms/internal/ads/zzap;

    .line 258
    .line 259
    new-instance v8, Lcom/google/android/gms/internal/ads/zzakb;

    .line 260
    .line 261
    int-to-float v4, v4

    .line 262
    invoke-direct {v8, v4, v11}, Lcom/google/android/gms/internal/ads/zzakb;-><init>(FI)V

    .line 263
    .line 264
    .line 265
    new-array v4, v0, [Lcom/google/android/gms/internal/ads/zzao;

    .line 266
    .line 267
    aput-object v8, v4, v3

    .line 268
    .line 269
    invoke-direct {v10, v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 270
    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_11
    add-int/2addr v8, v9

    .line 274
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_4

    .line 278
    .line 279
    :cond_12
    :goto_9
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    goto :goto_a

    .line 284
    :cond_13
    const v4, -0x56878686

    .line 285
    .line 286
    .line 287
    if-ne v8, v4, :cond_14

    .line 288
    .line 289
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzi(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzap;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    goto :goto_a

    .line 298
    :cond_14
    const v4, 0x6368706c

    .line 299
    .line 300
    .line 301
    if-ne v8, v4, :cond_15

    .line 302
    .line 303
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzh(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzap;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    :cond_15
    :goto_a
    invoke-virtual {p0, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :cond_16
    return-object v2
.end method

.method public static zzd(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzgd;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzalo;->zza(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Lcom/google/android/gms/internal/ads/zzgd;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzgd;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzfz;)Lcom/google/android/gms/internal/ads/zzap;
    .locals 12

    .line 1
    const v0, 0x68646c72    # 4.3148E24f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x6b657973

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x696c7374

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v0, :cond_7

    .line 24
    .line 25
    if-eqz v1, :cond_7

    .line 26
    .line 27
    if-eqz p0, :cond_7

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzalo;->zzj(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x6d647461

    .line 36
    .line 37
    .line 38
    if-eq v0, v3, :cond_0

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 43
    .line 44
    const/16 v1, 0xc

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    new-array v3, v1, [Ljava/lang/String;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    move v5, v4

    .line 57
    :goto_0
    if-ge v5, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x4

    .line 64
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v6, v6, -0x8

    .line 68
    .line 69
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 70
    .line 71
    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    aput-object v6, v3, v5

    .line 76
    .line 77
    add-int/lit8 v5, v5, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 81
    .line 82
    const/16 v0, 0x8

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 85
    .line 86
    .line 87
    new-instance v5, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-le v6, v0, :cond_6

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    add-int/2addr v7, v6

    .line 107
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    add-int/lit8 v6, v6, -0x1

    .line 112
    .line 113
    if-ltz v6, :cond_4

    .line 114
    .line 115
    if-ge v6, v1, :cond_4

    .line 116
    .line 117
    aget-object v6, v3, v6

    .line 118
    .line 119
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-ge v8, v7, :cond_2

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    const v11, 0x64617461

    .line 134
    .line 135
    .line 136
    if-ne v10, v11, :cond_3

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    add-int/lit8 v9, v9, -0x10

    .line 147
    .line 148
    new-array v11, v9, [B

    .line 149
    .line 150
    invoke-virtual {p0, v11, v4, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 151
    .line 152
    .line 153
    :try_start_0
    new-instance v9, Lcom/google/android/gms/internal/ads/zzfx;

    .line 154
    .line 155
    invoke-direct {v9, v6, v11, v10, v8}, Lcom/google/android/gms/internal/ads/zzfx;-><init>(Ljava/lang/String;[BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :catch_0
    const-string v8, "MetadataUtil"

    .line 160
    .line 161
    const-string v9, "Failed to parse metadata entry with key: "

    .line 162
    .line 163
    invoke-static {v6, v9, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_2
    move-object v9, v2

    .line 167
    goto :goto_3

    .line 168
    :cond_3
    add-int/2addr v8, v9

    .line 169
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :goto_3
    if-eqz v9, :cond_5

    .line 174
    .line 175
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    new-instance v9, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    add-int/lit8 v8, v8, 0x29

    .line 190
    .line 191
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 192
    .line 193
    .line 194
    const-string v8, "Skipped metadata with unknown key index: "

    .line 195
    .line 196
    const-string v10, "BoxParsers"

    .line 197
    .line 198
    invoke-static {v9, v8, v6, v10}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    :goto_4
    invoke-virtual {p0, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-nez p0, :cond_7

    .line 210
    .line 211
    new-instance p0, Lcom/google/android/gms/internal/ads/zzap;

    .line 212
    .line 213
    invoke-direct {p0, v5}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_7
    :goto_5
    return-object v2
.end method

.method public static zzf(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const v2, 0x68646c72    # 4.3148E24f

    .line 14
    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static zzg(Lcom/google/android/gms/internal/ads/zzamp;Lcom/google/android/gms/internal/ads/zzfz;Lcom/google/android/gms/internal/ads/zzagt;Z)Lcom/google/android/gms/internal/ads/zzams;
    .locals 44
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v3, -0x1

    .line 6
    const v5, 0x7374737a

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v5, :cond_0

    .line 15
    .line 16
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 17
    .line 18
    new-instance v8, Lcom/google/android/gms/internal/ads/zzall;

    .line 19
    .line 20
    invoke-direct {v8, v5, v7}, Lcom/google/android/gms/internal/ads/zzall;-><init>(Lcom/google/android/gms/internal/ads/zzga;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const v5, 0x73747a32

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v5, :cond_4a

    .line 32
    .line 33
    new-instance v8, Lcom/google/android/gms/internal/ads/zzalm;

    .line 34
    .line 35
    invoke-direct {v8, v5}, Lcom/google/android/gms/internal/ads/zzalm;-><init>(Lcom/google/android/gms/internal/ads/zzga;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzali;->zza()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    const/4 v7, 0x0

    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    new-instance v0, Lcom/google/android/gms/internal/ads/zzams;

    .line 46
    .line 47
    new-array v2, v7, [J

    .line 48
    .line 49
    new-array v3, v7, [I

    .line 50
    .line 51
    new-array v5, v7, [J

    .line 52
    .line 53
    new-array v6, v7, [I

    .line 54
    .line 55
    new-array v7, v7, [I

    .line 56
    .line 57
    const-wide/16 v9, 0x0

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/ads/zzams;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[J[II[J[I[IZJI)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_1
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzb:I

    .line 67
    .line 68
    const/4 v10, 0x2

    .line 69
    const-wide/16 v11, 0x0

    .line 70
    .line 71
    if-ne v9, v10, :cond_2

    .line 72
    .line 73
    iget-wide v13, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzf:J

    .line 74
    .line 75
    cmp-long v9, v13, v11

    .line 76
    .line 77
    if-lez v9, :cond_2

    .line 78
    .line 79
    int-to-float v9, v5

    .line 80
    long-to-float v13, v13

    .line 81
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 82
    .line 83
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 84
    .line 85
    .line 86
    move-result-object v14

    .line 87
    const v15, 0x49742400    # 1000000.0f

    .line 88
    .line 89
    .line 90
    div-float/2addr v13, v15

    .line 91
    div-float/2addr v9, v13

    .line 92
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzz(F)Lcom/google/android/gms/internal/ads/zzt;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    new-instance v13, Lcom/google/android/gms/internal/ads/zzamo;

    .line 100
    .line 101
    invoke-direct {v13, v1, v6}, Lcom/google/android/gms/internal/ads/zzamo;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v13, v9}, Lcom/google/android/gms/internal/ads/zzamo;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzamo;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzamo;->zzo()Lcom/google/android/gms/internal/ads/zzamp;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :cond_2
    const v9, 0x7374636f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    if-nez v9, :cond_3

    .line 119
    .line 120
    const v9, 0x636f3634

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const/4 v13, 0x1

    .line 131
    goto :goto_1

    .line 132
    :cond_3
    move v13, v7

    .line 133
    :goto_1
    const v14, 0x73747363

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 144
    .line 145
    const v15, 0x73747473

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v15, v15, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 156
    .line 157
    move-wide/from16 v16, v11

    .line 158
    .line 159
    const v11, 0x73747373

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    if-eqz v11, :cond_4

    .line 167
    .line 168
    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_4
    move-object v11, v6

    .line 172
    :goto_2
    const v12, 0x63747473

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    move-object v0, v6

    .line 185
    :goto_3
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 186
    .line 187
    new-instance v12, Lcom/google/android/gms/internal/ads/zzale;

    .line 188
    .line 189
    invoke-direct {v12, v14, v9, v13}, Lcom/google/android/gms/internal/ads/zzale;-><init>(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzeu;Z)V

    .line 190
    .line 191
    .line 192
    const/16 v9, 0xc

    .line 193
    .line 194
    invoke-virtual {v15, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    add-int/2addr v13, v3

    .line 202
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-eqz v0, :cond_6

    .line 211
    .line 212
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 216
    .line 217
    .line 218
    move-result v18

    .line 219
    goto :goto_4

    .line 220
    :cond_6
    const/16 v18, 0x0

    .line 221
    .line 222
    :goto_4
    if-eqz v11, :cond_8

    .line 223
    .line 224
    invoke-virtual {v11, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    if-lez v9, :cond_7

    .line 232
    .line 233
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 234
    .line 235
    .line 236
    move-result v19

    .line 237
    add-int/lit8 v19, v19, -0x1

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_7
    move/from16 v19, v3

    .line 241
    .line 242
    move-object v11, v6

    .line 243
    goto :goto_5

    .line 244
    :cond_8
    move/from16 v19, v3

    .line 245
    .line 246
    const/4 v9, 0x0

    .line 247
    :goto_5
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzali;->zzb()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 252
    .line 253
    if-eq v10, v3, :cond_c

    .line 254
    .line 255
    move/from16 v21, v3

    .line 256
    .line 257
    iget-object v3, v6, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 258
    .line 259
    const/16 v22, 0x1

    .line 260
    .line 261
    const-string v4, "audio/raw"

    .line 262
    .line 263
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-nez v4, :cond_a

    .line 268
    .line 269
    const-string v4, "audio/g711-mlaw"

    .line 270
    .line 271
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-nez v4, :cond_a

    .line 276
    .line 277
    const-string v4, "audio/g711-alaw"

    .line 278
    .line 279
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    if-eqz v3, :cond_9

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_9
    :goto_6
    const/4 v3, 0x0

    .line 287
    goto :goto_9

    .line 288
    :cond_a
    :goto_7
    if-nez v13, :cond_9

    .line 289
    .line 290
    if-nez v18, :cond_b

    .line 291
    .line 292
    if-nez v9, :cond_b

    .line 293
    .line 294
    move/from16 v3, v22

    .line 295
    .line 296
    :goto_8
    const/4 v13, 0x0

    .line 297
    goto :goto_9

    .line 298
    :cond_b
    const/4 v3, 0x0

    .line 299
    goto :goto_8

    .line 300
    :cond_c
    move/from16 v21, v3

    .line 301
    .line 302
    const/16 v22, 0x1

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :goto_9
    new-instance v4, Ljava/util/ArrayList;

    .line 306
    .line 307
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 308
    .line 309
    .line 310
    if-nez v11, :cond_d

    .line 311
    .line 312
    move/from16 v31, v22

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_d
    const/16 v31, 0x0

    .line 316
    .line 317
    :goto_a
    if-eqz v3, :cond_12

    .line 318
    .line 319
    iget v0, v12, Lcom/google/android/gms/internal/ads/zzale;->zza:I

    .line 320
    .line 321
    new-array v3, v0, [J

    .line 322
    .line 323
    new-array v5, v0, [I

    .line 324
    .line 325
    :goto_b
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzale;->zza()Z

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    if-eqz v8, :cond_e

    .line 330
    .line 331
    iget v8, v12, Lcom/google/android/gms/internal/ads/zzale;->zzb:I

    .line 332
    .line 333
    iget-wide v13, v12, Lcom/google/android/gms/internal/ads/zzale;->zzd:J

    .line 334
    .line 335
    aput-wide v13, v3, v8

    .line 336
    .line 337
    iget v9, v12, Lcom/google/android/gms/internal/ads/zzale;->zzc:I

    .line 338
    .line 339
    aput v9, v5, v8

    .line 340
    .line 341
    goto :goto_b

    .line 342
    :cond_e
    int-to-long v7, v7

    .line 343
    const/16 v9, 0x2000

    .line 344
    .line 345
    div-int/2addr v9, v10

    .line 346
    const/4 v11, 0x0

    .line 347
    const/4 v12, 0x0

    .line 348
    :goto_c
    if-ge v11, v0, :cond_f

    .line 349
    .line 350
    aget v13, v5, v11

    .line 351
    .line 352
    sget-object v14, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 353
    .line 354
    add-int/2addr v13, v9

    .line 355
    add-int/lit8 v13, v13, -0x1

    .line 356
    .line 357
    div-int/2addr v13, v9

    .line 358
    add-int/2addr v12, v13

    .line 359
    add-int/lit8 v11, v11, 0x1

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_f
    new-array v11, v12, [J

    .line 363
    .line 364
    new-array v13, v12, [I

    .line 365
    .line 366
    new-array v14, v12, [J

    .line 367
    .line 368
    new-array v15, v12, [I

    .line 369
    .line 370
    move-object/from16 v18, v3

    .line 371
    .line 372
    move-object/from16 v19, v5

    .line 373
    .line 374
    move-object/from16 v23, v6

    .line 375
    .line 376
    const/4 v3, 0x0

    .line 377
    const/4 v5, 0x0

    .line 378
    const/4 v6, 0x0

    .line 379
    const/16 v24, 0x0

    .line 380
    .line 381
    const/16 v25, 0x0

    .line 382
    .line 383
    :goto_d
    if-ge v3, v0, :cond_11

    .line 384
    .line 385
    aget v26, v19, v3

    .line 386
    .line 387
    aget-wide v27, v18, v3

    .line 388
    .line 389
    move/from16 v42, v25

    .line 390
    .line 391
    move/from16 v25, v0

    .line 392
    .line 393
    move/from16 v0, v24

    .line 394
    .line 395
    move/from16 v24, v42

    .line 396
    .line 397
    move/from16 v42, v26

    .line 398
    .line 399
    move/from16 v26, v3

    .line 400
    .line 401
    move/from16 v3, v42

    .line 402
    .line 403
    :goto_e
    if-lez v3, :cond_10

    .line 404
    .line 405
    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    .line 406
    .line 407
    .line 408
    move-result v29

    .line 409
    aput-wide v27, v11, v24

    .line 410
    .line 411
    move/from16 p0, v3

    .line 412
    .line 413
    mul-int v3, v10, v29

    .line 414
    .line 415
    aput v3, v13, v24

    .line 416
    .line 417
    add-int/2addr v6, v3

    .line 418
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    move/from16 p1, v6

    .line 423
    .line 424
    move-wide/from16 v32, v7

    .line 425
    .line 426
    int-to-long v6, v5

    .line 427
    mul-long v7, v32, v6

    .line 428
    .line 429
    aput-wide v7, v14, v24

    .line 430
    .line 431
    aput v22, v15, v24

    .line 432
    .line 433
    aget v3, v13, v24

    .line 434
    .line 435
    int-to-long v6, v3

    .line 436
    add-long v27, v27, v6

    .line 437
    .line 438
    add-int v5, v5, v29

    .line 439
    .line 440
    sub-int v3, p0, v29

    .line 441
    .line 442
    add-int/lit8 v24, v24, 0x1

    .line 443
    .line 444
    move/from16 v6, p1

    .line 445
    .line 446
    move-wide/from16 v7, v32

    .line 447
    .line 448
    goto :goto_e

    .line 449
    :cond_10
    move-wide/from16 v32, v7

    .line 450
    .line 451
    add-int/lit8 v3, v26, 0x1

    .line 452
    .line 453
    move/from16 v7, v24

    .line 454
    .line 455
    move/from16 v24, v0

    .line 456
    .line 457
    move/from16 v0, v25

    .line 458
    .line 459
    move/from16 v25, v7

    .line 460
    .line 461
    move-wide/from16 v7, v32

    .line 462
    .line 463
    goto :goto_d

    .line 464
    :cond_11
    move-wide/from16 v32, v7

    .line 465
    .line 466
    int-to-long v7, v5

    .line 467
    mul-long v7, v7, v32

    .line 468
    .line 469
    int-to-long v5, v6

    .line 470
    move-object v0, v1

    .line 471
    move-object/from16 v18, v4

    .line 472
    .line 473
    move/from16 v34, v12

    .line 474
    .line 475
    move-object/from16 v26, v13

    .line 476
    .line 477
    move/from16 v27, v24

    .line 478
    .line 479
    move-object/from16 v25, v11

    .line 480
    .line 481
    move-object/from16 v29, v15

    .line 482
    .line 483
    goto/16 :goto_1b

    .line 484
    .line 485
    :cond_12
    move-object/from16 v23, v6

    .line 486
    .line 487
    new-array v3, v5, [J

    .line 488
    .line 489
    new-array v6, v5, [I

    .line 490
    .line 491
    new-array v10, v5, [J

    .line 492
    .line 493
    move-object/from16 p0, v0

    .line 494
    .line 495
    new-array v0, v5, [I

    .line 496
    .line 497
    move/from16 v35, v9

    .line 498
    .line 499
    move-object/from16 v34, v11

    .line 500
    .line 501
    move/from16 v25, v14

    .line 502
    .line 503
    move-wide/from16 v26, v16

    .line 504
    .line 505
    move-wide/from16 v28, v26

    .line 506
    .line 507
    move-wide/from16 v32, v28

    .line 508
    .line 509
    move/from16 v30, v18

    .line 510
    .line 511
    move/from16 v11, v19

    .line 512
    .line 513
    const/16 p1, 0x0

    .line 514
    .line 515
    const/16 v24, 0x0

    .line 516
    .line 517
    move v9, v7

    .line 518
    move-object/from16 v19, v8

    .line 519
    .line 520
    move/from16 v18, v13

    .line 521
    .line 522
    const/4 v7, 0x0

    .line 523
    const/4 v8, 0x0

    .line 524
    const/4 v13, 0x0

    .line 525
    :goto_f
    const-string v14, "BoxParsers"

    .line 526
    .line 527
    if-ge v7, v5, :cond_1f

    .line 528
    .line 529
    move-wide/from16 v36, v26

    .line 530
    .line 531
    move/from16 v26, p1

    .line 532
    .line 533
    move/from16 v27, v22

    .line 534
    .line 535
    :goto_10
    if-nez v26, :cond_14

    .line 536
    .line 537
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzale;->zza()Z

    .line 538
    .line 539
    .line 540
    move-result v27

    .line 541
    move-object/from16 v38, v1

    .line 542
    .line 543
    if-eqz v27, :cond_13

    .line 544
    .line 545
    iget-wide v1, v12, Lcom/google/android/gms/internal/ads/zzale;->zzd:J

    .line 546
    .line 547
    move-wide/from16 v36, v1

    .line 548
    .line 549
    iget v1, v12, Lcom/google/android/gms/internal/ads/zzale;->zzc:I

    .line 550
    .line 551
    move/from16 v26, v1

    .line 552
    .line 553
    move-object/from16 v1, v38

    .line 554
    .line 555
    goto :goto_10

    .line 556
    :cond_13
    const/4 v1, 0x0

    .line 557
    goto :goto_11

    .line 558
    :cond_14
    move-object/from16 v38, v1

    .line 559
    .line 560
    move/from16 v1, v26

    .line 561
    .line 562
    :goto_11
    if-nez v27, :cond_15

    .line 563
    .line 564
    const-string v1, "Unexpected end of chunk data"

    .line 565
    .line 566
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    move-object v15, v0

    .line 586
    move-object v11, v1

    .line 587
    move v5, v7

    .line 588
    goto/16 :goto_15

    .line 589
    .line 590
    :cond_15
    if-nez p0, :cond_16

    .line 591
    .line 592
    goto :goto_13

    .line 593
    :cond_16
    :goto_12
    if-nez v24, :cond_18

    .line 594
    .line 595
    if-lez v30, :cond_17

    .line 596
    .line 597
    add-int/lit8 v30, v30, -0x1

    .line 598
    .line 599
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 600
    .line 601
    .line 602
    move-result v24

    .line 603
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 604
    .line 605
    .line 606
    move-result v13

    .line 607
    goto :goto_12

    .line 608
    :cond_17
    const/16 v24, 0x0

    .line 609
    .line 610
    :cond_18
    add-int/lit8 v24, v24, -0x1

    .line 611
    .line 612
    :goto_13
    invoke-interface/range {v19 .. v19}, Lcom/google/android/gms/internal/ads/zzali;->zzc()I

    .line 613
    .line 614
    .line 615
    move-result v2

    .line 616
    move-object/from16 v26, v0

    .line 617
    .line 618
    move/from16 p1, v1

    .line 619
    .line 620
    int-to-long v0, v2

    .line 621
    add-long v32, v32, v0

    .line 622
    .line 623
    if-le v2, v8, :cond_19

    .line 624
    .line 625
    move v8, v2

    .line 626
    :cond_19
    aput-wide v36, v3, v7

    .line 627
    .line 628
    aput v2, v6, v7

    .line 629
    .line 630
    move-wide/from16 v39, v0

    .line 631
    .line 632
    int-to-long v0, v13

    .line 633
    add-long v0, v28, v0

    .line 634
    .line 635
    aput-wide v0, v10, v7

    .line 636
    .line 637
    aput v31, v26, v7

    .line 638
    .line 639
    if-ne v7, v11, :cond_1a

    .line 640
    .line 641
    aput v22, v26, v7

    .line 642
    .line 643
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    :cond_1a
    if-eqz v34, :cond_1c

    .line 651
    .line 652
    if-ne v7, v11, :cond_1c

    .line 653
    .line 654
    add-int/lit8 v14, v35, -0x1

    .line 655
    .line 656
    if-lez v14, :cond_1b

    .line 657
    .line 658
    invoke-virtual/range {v34 .. v34}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    add-int/lit8 v0, v0, -0x1

    .line 663
    .line 664
    move v11, v0

    .line 665
    :cond_1b
    move/from16 v35, v14

    .line 666
    .line 667
    :cond_1c
    int-to-long v0, v9

    .line 668
    add-long v28, v28, v0

    .line 669
    .line 670
    add-int/lit8 v25, v25, -0x1

    .line 671
    .line 672
    if-nez v25, :cond_1e

    .line 673
    .line 674
    if-lez v18, :cond_1d

    .line 675
    .line 676
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 677
    .line 678
    .line 679
    move-result v0

    .line 680
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    add-int/lit8 v18, v18, -0x1

    .line 685
    .line 686
    move/from16 v25, v0

    .line 687
    .line 688
    move v9, v1

    .line 689
    goto :goto_14

    .line 690
    :cond_1d
    const/16 v25, 0x0

    .line 691
    .line 692
    :cond_1e
    :goto_14
    add-long v0, v36, v39

    .line 693
    .line 694
    add-int/lit8 v2, p1, -0x1

    .line 695
    .line 696
    add-int/lit8 v7, v7, 0x1

    .line 697
    .line 698
    move-wide/from16 v42, v0

    .line 699
    .line 700
    move-object/from16 v0, v26

    .line 701
    .line 702
    move-wide/from16 v26, v42

    .line 703
    .line 704
    move/from16 p1, v2

    .line 705
    .line 706
    move-object/from16 v1, v38

    .line 707
    .line 708
    goto/16 :goto_f

    .line 709
    .line 710
    :cond_1f
    move-object/from16 v26, v0

    .line 711
    .line 712
    move-object/from16 v38, v1

    .line 713
    .line 714
    move-object v11, v3

    .line 715
    move-object v2, v6

    .line 716
    move-object v3, v10

    .line 717
    move-object/from16 v15, v26

    .line 718
    .line 719
    move/from16 v26, p1

    .line 720
    .line 721
    :goto_15
    int-to-long v0, v13

    .line 722
    add-long v0, v28, v0

    .line 723
    .line 724
    if-eqz p0, :cond_21

    .line 725
    .line 726
    :goto_16
    if-lez v30, :cond_21

    .line 727
    .line 728
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    if-eqz v6, :cond_20

    .line 733
    .line 734
    const/4 v6, 0x0

    .line 735
    goto :goto_17

    .line 736
    :cond_20
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 737
    .line 738
    .line 739
    add-int/lit8 v30, v30, -0x1

    .line 740
    .line 741
    goto :goto_16

    .line 742
    :cond_21
    move/from16 v6, v22

    .line 743
    .line 744
    :goto_17
    if-nez v35, :cond_27

    .line 745
    .line 746
    if-nez v25, :cond_26

    .line 747
    .line 748
    if-nez v26, :cond_25

    .line 749
    .line 750
    if-nez v18, :cond_24

    .line 751
    .line 752
    if-nez v24, :cond_23

    .line 753
    .line 754
    if-nez v6, :cond_22

    .line 755
    .line 756
    move-wide/from16 p0, v0

    .line 757
    .line 758
    move-object/from16 v0, v38

    .line 759
    .line 760
    const/4 v6, 0x0

    .line 761
    const/4 v7, 0x0

    .line 762
    const/4 v9, 0x0

    .line 763
    const/4 v10, 0x0

    .line 764
    const/4 v12, 0x0

    .line 765
    const/4 v13, 0x0

    .line 766
    goto/16 :goto_18

    .line 767
    .line 768
    :cond_22
    move-wide/from16 p0, v0

    .line 769
    .line 770
    move-object/from16 v24, v2

    .line 771
    .line 772
    move-object/from16 v25, v3

    .line 773
    .line 774
    move-object/from16 v18, v4

    .line 775
    .line 776
    move-object/from16 v0, v38

    .line 777
    .line 778
    goto/16 :goto_1a

    .line 779
    .line 780
    :cond_23
    move-wide/from16 p0, v0

    .line 781
    .line 782
    move v13, v6

    .line 783
    move/from16 v12, v24

    .line 784
    .line 785
    move-object/from16 v0, v38

    .line 786
    .line 787
    const/4 v6, 0x0

    .line 788
    const/4 v7, 0x0

    .line 789
    const/4 v9, 0x0

    .line 790
    const/4 v10, 0x0

    .line 791
    goto :goto_18

    .line 792
    :cond_24
    move-wide/from16 p0, v0

    .line 793
    .line 794
    move v13, v6

    .line 795
    move/from16 v10, v18

    .line 796
    .line 797
    move/from16 v12, v24

    .line 798
    .line 799
    move-object/from16 v0, v38

    .line 800
    .line 801
    const/4 v6, 0x0

    .line 802
    const/4 v7, 0x0

    .line 803
    const/4 v9, 0x0

    .line 804
    goto :goto_18

    .line 805
    :cond_25
    move-wide/from16 p0, v0

    .line 806
    .line 807
    move v13, v6

    .line 808
    move/from16 v10, v18

    .line 809
    .line 810
    move/from16 v12, v24

    .line 811
    .line 812
    move/from16 v9, v26

    .line 813
    .line 814
    move-object/from16 v0, v38

    .line 815
    .line 816
    const/4 v6, 0x0

    .line 817
    const/4 v7, 0x0

    .line 818
    goto :goto_18

    .line 819
    :cond_26
    move-wide/from16 p0, v0

    .line 820
    .line 821
    move v13, v6

    .line 822
    move/from16 v10, v18

    .line 823
    .line 824
    move/from16 v12, v24

    .line 825
    .line 826
    move/from16 v7, v25

    .line 827
    .line 828
    move/from16 v9, v26

    .line 829
    .line 830
    move-object/from16 v0, v38

    .line 831
    .line 832
    const/4 v6, 0x0

    .line 833
    goto :goto_18

    .line 834
    :cond_27
    move-wide/from16 p0, v0

    .line 835
    .line 836
    move v13, v6

    .line 837
    move/from16 v10, v18

    .line 838
    .line 839
    move/from16 v12, v24

    .line 840
    .line 841
    move/from16 v7, v25

    .line 842
    .line 843
    move/from16 v9, v26

    .line 844
    .line 845
    move/from16 v6, v35

    .line 846
    .line 847
    move-object/from16 v0, v38

    .line 848
    .line 849
    :goto_18
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzamp;->zza:I

    .line 850
    .line 851
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v18

    .line 855
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 856
    .line 857
    .line 858
    move-result v18

    .line 859
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v19

    .line 863
    add-int/lit8 v18, v18, 0x42

    .line 864
    .line 865
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 866
    .line 867
    .line 868
    move-result v19

    .line 869
    add-int v19, v19, v18

    .line 870
    .line 871
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v18

    .line 875
    add-int/lit8 v19, v19, 0x23

    .line 876
    .line 877
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 878
    .line 879
    .line 880
    move-result v18

    .line 881
    add-int v18, v18, v19

    .line 882
    .line 883
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v19

    .line 887
    add-int/lit8 v18, v18, 0x1a

    .line 888
    .line 889
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 890
    .line 891
    .line 892
    move-result v19

    .line 893
    add-int v19, v19, v18

    .line 894
    .line 895
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v18

    .line 899
    add-int/lit8 v19, v19, 0x21

    .line 900
    .line 901
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 902
    .line 903
    .line 904
    move-result v18

    .line 905
    add-int v18, v18, v19

    .line 906
    .line 907
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v19

    .line 911
    add-int/lit8 v18, v18, 0x24

    .line 912
    .line 913
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 914
    .line 915
    .line 916
    move-result v19

    .line 917
    move-object/from16 v24, v2

    .line 918
    .line 919
    move/from16 v2, v22

    .line 920
    .line 921
    if-eq v2, v13, :cond_28

    .line 922
    .line 923
    const-string v2, ", ctts invalid"

    .line 924
    .line 925
    goto :goto_19

    .line 926
    :cond_28
    const-string v2, ""

    .line 927
    .line 928
    :goto_19
    add-int v18, v18, v19

    .line 929
    .line 930
    new-instance v13, Ljava/lang/StringBuilder;

    .line 931
    .line 932
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 933
    .line 934
    .line 935
    move-result v19

    .line 936
    move-object/from16 v25, v3

    .line 937
    .line 938
    add-int v3, v19, v18

    .line 939
    .line 940
    invoke-direct {v13, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 941
    .line 942
    .line 943
    const-string v3, "Inconsistent stbl box for track "

    .line 944
    .line 945
    move-object/from16 v18, v4

    .line 946
    .line 947
    const-string v4, ": remainingSynchronizationSamples "

    .line 948
    .line 949
    invoke-static {v1, v6, v3, v4, v13}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 950
    .line 951
    .line 952
    const-string v1, ", remainingSamplesAtTimestampDelta "

    .line 953
    .line 954
    const-string v3, ", remainingSamplesInChunk "

    .line 955
    .line 956
    invoke-static {v7, v9, v1, v3, v13}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 957
    .line 958
    .line 959
    const-string v1, ", remainingTimestampDeltaChanges "

    .line 960
    .line 961
    const-string v3, ", remainingSamplesAtTimestampOffset "

    .line 962
    .line 963
    invoke-static {v10, v12, v1, v3, v13}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    :goto_1a
    move/from16 v34, v5

    .line 977
    .line 978
    move/from16 v27, v8

    .line 979
    .line 980
    move-object/from16 v26, v24

    .line 981
    .line 982
    move-object/from16 v14, v25

    .line 983
    .line 984
    move-wide/from16 v5, v32

    .line 985
    .line 986
    move-wide/from16 v7, p0

    .line 987
    .line 988
    move-object/from16 v29, v15

    .line 989
    .line 990
    move-object/from16 v25, v11

    .line 991
    .line 992
    :goto_1b
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzamp;->zzf:J

    .line 993
    .line 994
    cmp-long v3, v1, v16

    .line 995
    .line 996
    const-wide/32 v32, 0x7fffffff

    .line 997
    .line 998
    .line 999
    if-lez v3, :cond_29

    .line 1000
    .line 1001
    const-wide/16 v3, 0x8

    .line 1002
    .line 1003
    mul-long v35, v5, v3

    .line 1004
    .line 1005
    const-wide/32 v37, 0xf4240

    .line 1006
    .line 1007
    .line 1008
    sget-object v41, Ljava/math/RoundingMode;->HALF_DOWN:Ljava/math/RoundingMode;

    .line 1009
    .line 1010
    move-wide/from16 v39, v1

    .line 1011
    .line 1012
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v1

    .line 1016
    cmp-long v3, v1, v16

    .line 1017
    .line 1018
    if-lez v3, :cond_29

    .line 1019
    .line 1020
    cmp-long v3, v1, v32

    .line 1021
    .line 1022
    if-gez v3, :cond_29

    .line 1023
    .line 1024
    invoke-virtual/range {v23 .. v23}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v3

    .line 1028
    long-to-int v1, v1

    .line 1029
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    new-instance v2, Lcom/google/android/gms/internal/ads/zzamo;

    .line 1037
    .line 1038
    const/4 v3, 0x0

    .line 1039
    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzamo;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[B)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzamo;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzamo;

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzamo;->zzo()Lcom/google/android/gms/internal/ads/zzamp;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    goto :goto_1c

    .line 1050
    :cond_29
    move-object v1, v0

    .line 1051
    :goto_1c
    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzc:J

    .line 1052
    .line 1053
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1054
    .line 1055
    const-wide/32 v9, 0xf4240

    .line 1056
    .line 1057
    .line 1058
    move-object/from16 v13, v41

    .line 1059
    .line 1060
    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1061
    .line 1062
    .line 1063
    move-result-wide v2

    .line 1064
    invoke-static/range {v18 .. v18}, Lcom/google/android/gms/internal/ads/zzhaq;->zzf(Ljava/util/Collection;)[I

    .line 1065
    .line 1066
    .line 1067
    move-result-object v30

    .line 1068
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzi:Lcom/google/android/gms/internal/ads/zzhao;

    .line 1069
    .line 1070
    const-wide/32 v4, 0xf4240

    .line 1071
    .line 1072
    .line 1073
    if-nez v0, :cond_2a

    .line 1074
    .line 1075
    invoke-static {v14, v4, v5, v11, v12}, Lcom/google/android/gms/internal/ads/zzfm;->zzx([JJJ)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v23, Lcom/google/android/gms/internal/ads/zzams;

    .line 1079
    .line 1080
    move-object/from16 v24, v1

    .line 1081
    .line 1082
    move-wide/from16 v32, v2

    .line 1083
    .line 1084
    move-object/from16 v28, v14

    .line 1085
    .line 1086
    invoke-direct/range {v23 .. v34}, Lcom/google/android/gms/internal/ads/zzams;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[J[II[J[I[IZJI)V

    .line 1087
    .line 1088
    .line 1089
    return-object v23

    .line 1090
    :cond_2a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1091
    .line 1092
    .line 1093
    move-result v2

    .line 1094
    const/4 v3, 0x1

    .line 1095
    if-ne v2, v3, :cond_2e

    .line 1096
    .line 1097
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzb:I

    .line 1098
    .line 1099
    if-ne v2, v3, :cond_2e

    .line 1100
    .line 1101
    array-length v2, v14

    .line 1102
    const/4 v3, 0x2

    .line 1103
    if-lt v2, v3, :cond_2e

    .line 1104
    .line 1105
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzj:Lcom/google/android/gms/internal/ads/zzhao;

    .line 1106
    .line 1107
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1108
    .line 1109
    .line 1110
    const/4 v6, 0x0

    .line 1111
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1112
    .line 1113
    .line 1114
    move-result-wide v9

    .line 1115
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1116
    .line 1117
    .line 1118
    move-result-wide v35

    .line 1119
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzd:J

    .line 1120
    .line 1121
    move-wide/from16 v39, v4

    .line 1122
    .line 1123
    move-wide/from16 v37, v11

    .line 1124
    .line 1125
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1126
    .line 1127
    .line 1128
    move-result-wide v3

    .line 1129
    move-wide/from16 v11, v39

    .line 1130
    .line 1131
    move-wide/from16 v39, v37

    .line 1132
    .line 1133
    add-long/2addr v3, v9

    .line 1134
    add-int/lit8 v5, v2, -0x1

    .line 1135
    .line 1136
    const/4 v13, 0x4

    .line 1137
    invoke-static {v13, v5}, Ljava/lang/Math;->min(II)I

    .line 1138
    .line 1139
    .line 1140
    move-result v13

    .line 1141
    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    .line 1142
    .line 1143
    .line 1144
    move-result v13

    .line 1145
    add-int/lit8 v2, v2, -0x4

    .line 1146
    .line 1147
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    .line 1152
    .line 1153
    .line 1154
    move-result v2

    .line 1155
    aget-wide v19, v14, v6

    .line 1156
    .line 1157
    cmp-long v5, v19, v9

    .line 1158
    .line 1159
    if-gtz v5, :cond_2d

    .line 1160
    .line 1161
    aget-wide v5, v14, v13

    .line 1162
    .line 1163
    cmp-long v5, v9, v5

    .line 1164
    .line 1165
    if-gez v5, :cond_2d

    .line 1166
    .line 1167
    aget-wide v5, v14, v2

    .line 1168
    .line 1169
    cmp-long v2, v5, v3

    .line 1170
    .line 1171
    if-gez v2, :cond_2d

    .line 1172
    .line 1173
    const-wide/16 v5, 0x2

    .line 1174
    .line 1175
    add-long/2addr v5, v7

    .line 1176
    cmp-long v2, v3, v5

    .line 1177
    .line 1178
    if-gtz v2, :cond_2d

    .line 1179
    .line 1180
    sub-long v3, v7, v3

    .line 1181
    .line 1182
    move-wide/from16 v5, v16

    .line 1183
    .line 1184
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 1185
    .line 1186
    .line 1187
    move-result-wide v2

    .line 1188
    const/4 v4, 0x0

    .line 1189
    aget-wide v15, v14, v4

    .line 1190
    .line 1191
    sub-long v35, v9, v15

    .line 1192
    .line 1193
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 1194
    .line 1195
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 1196
    .line 1197
    int-to-long v9, v4

    .line 1198
    move-wide/from16 v37, v9

    .line 1199
    .line 1200
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1201
    .line 1202
    .line 1203
    move-result-wide v9

    .line 1204
    move-wide/from16 v35, v2

    .line 1205
    .line 1206
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1207
    .line 1208
    .line 1209
    move-result-wide v2

    .line 1210
    move-wide/from16 v16, v5

    .line 1211
    .line 1212
    move-wide/from16 v5, v39

    .line 1213
    .line 1214
    cmp-long v4, v9, v16

    .line 1215
    .line 1216
    if-nez v4, :cond_2b

    .line 1217
    .line 1218
    cmp-long v4, v2, v16

    .line 1219
    .line 1220
    if-eqz v4, :cond_2f

    .line 1221
    .line 1222
    const-wide/16 v9, 0x0

    .line 1223
    .line 1224
    :cond_2b
    cmp-long v4, v9, v32

    .line 1225
    .line 1226
    if-gtz v4, :cond_2f

    .line 1227
    .line 1228
    cmp-long v4, v2, v32

    .line 1229
    .line 1230
    if-lez v4, :cond_2c

    .line 1231
    .line 1232
    goto :goto_1d

    .line 1233
    :cond_2c
    long-to-int v4, v9

    .line 1234
    move-object/from16 v7, p2

    .line 1235
    .line 1236
    iput v4, v7, Lcom/google/android/gms/internal/ads/zzagt;->zza:I

    .line 1237
    .line 1238
    long-to-int v2, v2

    .line 1239
    iput v2, v7, Lcom/google/android/gms/internal/ads/zzagt;->zzb:I

    .line 1240
    .line 1241
    const-wide/32 v2, 0xf4240

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v14, v2, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzx([JJJ)V

    .line 1245
    .line 1246
    .line 1247
    const/4 v4, 0x0

    .line 1248
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v35

    .line 1252
    const-wide/32 v37, 0xf4240

    .line 1253
    .line 1254
    .line 1255
    move-wide/from16 v39, v11

    .line 1256
    .line 1257
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1258
    .line 1259
    .line 1260
    move-result-wide v32

    .line 1261
    new-instance v23, Lcom/google/android/gms/internal/ads/zzams;

    .line 1262
    .line 1263
    move-object/from16 v24, v1

    .line 1264
    .line 1265
    move-object/from16 v28, v14

    .line 1266
    .line 1267
    invoke-direct/range {v23 .. v34}, Lcom/google/android/gms/internal/ads/zzams;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[J[II[J[I[IZJI)V

    .line 1268
    .line 1269
    .line 1270
    return-object v23

    .line 1271
    :cond_2d
    move-wide/from16 v5, v39

    .line 1272
    .line 1273
    goto :goto_1d

    .line 1274
    :cond_2e
    move-wide v5, v11

    .line 1275
    :cond_2f
    :goto_1d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1276
    .line 1277
    .line 1278
    move-result v2

    .line 1279
    const/4 v3, 0x1

    .line 1280
    if-ne v2, v3, :cond_31

    .line 1281
    .line 1282
    const/4 v4, 0x0

    .line 1283
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1284
    .line 1285
    .line 1286
    move-result-wide v2

    .line 1287
    const-wide/16 v16, 0x0

    .line 1288
    .line 1289
    cmp-long v2, v2, v16

    .line 1290
    .line 1291
    if-nez v2, :cond_31

    .line 1292
    .line 1293
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzj:Lcom/google/android/gms/internal/ads/zzhao;

    .line 1294
    .line 1295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1299
    .line 1300
    .line 1301
    move-result-wide v2

    .line 1302
    const/4 v0, 0x0

    .line 1303
    :goto_1e
    array-length v4, v14

    .line 1304
    if-ge v0, v4, :cond_30

    .line 1305
    .line 1306
    aget-wide v9, v14, v0

    .line 1307
    .line 1308
    sub-long v35, v9, v2

    .line 1309
    .line 1310
    const-wide/32 v37, 0xf4240

    .line 1311
    .line 1312
    .line 1313
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1314
    .line 1315
    move-wide/from16 v39, v5

    .line 1316
    .line 1317
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1318
    .line 1319
    .line 1320
    move-result-wide v4

    .line 1321
    aput-wide v4, v14, v0

    .line 1322
    .line 1323
    const/16 v22, 0x1

    .line 1324
    .line 1325
    add-int/lit8 v0, v0, 0x1

    .line 1326
    .line 1327
    move-wide/from16 v5, v39

    .line 1328
    .line 1329
    goto :goto_1e

    .line 1330
    :cond_30
    move-wide/from16 v39, v5

    .line 1331
    .line 1332
    sub-long v35, v7, v2

    .line 1333
    .line 1334
    const-wide/32 v37, 0xf4240

    .line 1335
    .line 1336
    .line 1337
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1338
    .line 1339
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v32

    .line 1343
    new-instance v23, Lcom/google/android/gms/internal/ads/zzams;

    .line 1344
    .line 1345
    move-object/from16 v24, v1

    .line 1346
    .line 1347
    move-object/from16 v28, v14

    .line 1348
    .line 1349
    invoke-direct/range {v23 .. v34}, Lcom/google/android/gms/internal/ads/zzams;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[J[II[J[I[IZJI)V

    .line 1350
    .line 1351
    .line 1352
    return-object v23

    .line 1353
    :cond_31
    move-wide/from16 v39, v5

    .line 1354
    .line 1355
    move-object/from16 v11, v25

    .line 1356
    .line 1357
    move-object/from16 v13, v26

    .line 1358
    .line 1359
    move-object/from16 v15, v29

    .line 1360
    .line 1361
    move/from16 v12, v34

    .line 1362
    .line 1363
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzb:I

    .line 1364
    .line 1365
    const/4 v3, 0x1

    .line 1366
    if-ne v2, v3, :cond_32

    .line 1367
    .line 1368
    const/4 v2, 0x1

    .line 1369
    goto :goto_1f

    .line 1370
    :cond_32
    const/4 v2, 0x0

    .line 1371
    :goto_1f
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    new-array v3, v3, [I

    .line 1376
    .line 1377
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    new-array v4, v4, [I

    .line 1382
    .line 1383
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzj:Lcom/google/android/gms/internal/ads/zzhao;

    .line 1384
    .line 1385
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1386
    .line 1387
    .line 1388
    const/4 v6, 0x0

    .line 1389
    const/4 v7, 0x0

    .line 1390
    const/4 v8, 0x0

    .line 1391
    const/4 v9, 0x0

    .line 1392
    :goto_20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1393
    .line 1394
    .line 1395
    move-result v10

    .line 1396
    if-ge v6, v10, :cond_3b

    .line 1397
    .line 1398
    move-object v10, v3

    .line 1399
    move-object/from16 v19, v4

    .line 1400
    .line 1401
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1402
    .line 1403
    .line 1404
    move-result-wide v3

    .line 1405
    const-wide/16 v23, -0x1

    .line 1406
    .line 1407
    cmp-long v20, v3, v23

    .line 1408
    .line 1409
    if-eqz v20, :cond_3a

    .line 1410
    .line 1411
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1412
    .line 1413
    .line 1414
    move-result-wide v35

    .line 1415
    move-object/from16 p0, v10

    .line 1416
    .line 1417
    move-object/from16 v25, v11

    .line 1418
    .line 1419
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzd:J

    .line 1420
    .line 1421
    sget-object v41, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1422
    .line 1423
    move-wide/from16 v37, v39

    .line 1424
    .line 1425
    move-wide/from16 v39, v10

    .line 1426
    .line 1427
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1428
    .line 1429
    .line 1430
    move-result-wide v10

    .line 1431
    move-wide/from16 v39, v37

    .line 1432
    .line 1433
    add-long/2addr v10, v3

    .line 1434
    move/from16 v20, v6

    .line 1435
    .line 1436
    const/4 v6, 0x1

    .line 1437
    invoke-static {v14, v3, v4, v6, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzo([JJZZ)I

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    aput v3, p0, v20

    .line 1442
    .line 1443
    const/4 v4, 0x0

    .line 1444
    invoke-static {v14, v10, v11, v2, v4}, Lcom/google/android/gms/internal/ads/zzfm;->zzq([JJZZ)I

    .line 1445
    .line 1446
    .line 1447
    move-result v3

    .line 1448
    add-int/lit8 v4, v3, -0x1

    .line 1449
    .line 1450
    move/from16 v23, v6

    .line 1451
    .line 1452
    const/16 v22, 0x0

    .line 1453
    .line 1454
    :goto_21
    array-length v6, v14

    .line 1455
    if-ge v3, v6, :cond_35

    .line 1456
    .line 1457
    aget-wide v28, v14, v3

    .line 1458
    .line 1459
    cmp-long v6, v28, v10

    .line 1460
    .line 1461
    if-gez v6, :cond_33

    .line 1462
    .line 1463
    move/from16 v24, v2

    .line 1464
    .line 1465
    move v4, v3

    .line 1466
    goto :goto_22

    .line 1467
    :cond_33
    add-int/lit8 v6, v22, 0x1

    .line 1468
    .line 1469
    move/from16 v24, v2

    .line 1470
    .line 1471
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 1472
    .line 1473
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzv;->zzr:I

    .line 1474
    .line 1475
    if-le v6, v2, :cond_34

    .line 1476
    .line 1477
    goto :goto_23

    .line 1478
    :cond_34
    move/from16 v22, v6

    .line 1479
    .line 1480
    :goto_22
    add-int/lit8 v3, v3, 0x1

    .line 1481
    .line 1482
    move/from16 v2, v24

    .line 1483
    .line 1484
    goto :goto_21

    .line 1485
    :cond_35
    move/from16 v24, v2

    .line 1486
    .line 1487
    :goto_23
    add-int/lit8 v4, v4, 0x1

    .line 1488
    .line 1489
    aput v4, v19, v20

    .line 1490
    .line 1491
    aget v2, p0, v20

    .line 1492
    .line 1493
    :goto_24
    aget v3, p0, v20

    .line 1494
    .line 1495
    if-lez v3, :cond_36

    .line 1496
    .line 1497
    aget v4, v15, v3

    .line 1498
    .line 1499
    and-int/lit8 v4, v4, 0x1

    .line 1500
    .line 1501
    if-nez v4, :cond_36

    .line 1502
    .line 1503
    add-int/lit8 v3, v3, -0x1

    .line 1504
    .line 1505
    aput v3, p0, v20

    .line 1506
    .line 1507
    goto :goto_24

    .line 1508
    :cond_36
    if-nez v3, :cond_37

    .line 1509
    .line 1510
    const/4 v4, 0x0

    .line 1511
    aget v6, v15, v4

    .line 1512
    .line 1513
    and-int/lit8 v6, v6, 0x1

    .line 1514
    .line 1515
    if-nez v6, :cond_38

    .line 1516
    .line 1517
    aput v2, p0, v20

    .line 1518
    .line 1519
    :goto_25
    aget v3, p0, v20

    .line 1520
    .line 1521
    aget v2, v19, v20

    .line 1522
    .line 1523
    if-ge v3, v2, :cond_38

    .line 1524
    .line 1525
    aget v2, v15, v3

    .line 1526
    .line 1527
    and-int/lit8 v2, v2, 0x1

    .line 1528
    .line 1529
    if-nez v2, :cond_38

    .line 1530
    .line 1531
    add-int/lit8 v3, v3, 0x1

    .line 1532
    .line 1533
    aput v3, p0, v20

    .line 1534
    .line 1535
    const/16 v23, 0x1

    .line 1536
    .line 1537
    goto :goto_25

    .line 1538
    :cond_37
    const/4 v4, 0x0

    .line 1539
    :cond_38
    aget v2, v19, v20

    .line 1540
    .line 1541
    sub-int v6, v2, v3

    .line 1542
    .line 1543
    add-int/2addr v6, v7

    .line 1544
    if-eq v9, v3, :cond_39

    .line 1545
    .line 1546
    const/4 v3, 0x1

    .line 1547
    goto :goto_26

    .line 1548
    :cond_39
    move v3, v4

    .line 1549
    :goto_26
    or-int/2addr v3, v8

    .line 1550
    move v9, v2

    .line 1551
    move v8, v3

    .line 1552
    move v7, v6

    .line 1553
    :goto_27
    const/16 v22, 0x1

    .line 1554
    .line 1555
    goto :goto_28

    .line 1556
    :cond_3a
    move/from16 v24, v2

    .line 1557
    .line 1558
    move/from16 v20, v6

    .line 1559
    .line 1560
    move-object/from16 p0, v10

    .line 1561
    .line 1562
    move-object/from16 v25, v11

    .line 1563
    .line 1564
    const/4 v4, 0x0

    .line 1565
    goto :goto_27

    .line 1566
    :goto_28
    add-int/lit8 v6, v20, 0x1

    .line 1567
    .line 1568
    move-object/from16 v3, p0

    .line 1569
    .line 1570
    move-object/from16 v4, v19

    .line 1571
    .line 1572
    move/from16 v2, v24

    .line 1573
    .line 1574
    move-object/from16 v11, v25

    .line 1575
    .line 1576
    goto/16 :goto_20

    .line 1577
    .line 1578
    :cond_3b
    move-object/from16 p0, v3

    .line 1579
    .line 1580
    move-object/from16 v19, v4

    .line 1581
    .line 1582
    move-object/from16 v25, v11

    .line 1583
    .line 1584
    const/4 v4, 0x0

    .line 1585
    if-eq v7, v12, :cond_3c

    .line 1586
    .line 1587
    const/4 v2, 0x1

    .line 1588
    goto :goto_29

    .line 1589
    :cond_3c
    move v2, v4

    .line 1590
    :goto_29
    or-int/2addr v2, v8

    .line 1591
    if-eqz v2, :cond_3d

    .line 1592
    .line 1593
    new-array v3, v7, [J

    .line 1594
    .line 1595
    goto :goto_2a

    .line 1596
    :cond_3d
    move-object/from16 v3, v25

    .line 1597
    .line 1598
    :goto_2a
    if-eqz v2, :cond_3e

    .line 1599
    .line 1600
    new-array v6, v7, [I

    .line 1601
    .line 1602
    :goto_2b
    const/4 v8, 0x1

    .line 1603
    goto :goto_2c

    .line 1604
    :cond_3e
    move-object v6, v13

    .line 1605
    goto :goto_2b

    .line 1606
    :goto_2c
    if-ne v8, v2, :cond_3f

    .line 1607
    .line 1608
    move/from16 v27, v4

    .line 1609
    .line 1610
    :cond_3f
    if-eqz v2, :cond_40

    .line 1611
    .line 1612
    new-array v8, v7, [I

    .line 1613
    .line 1614
    goto :goto_2d

    .line 1615
    :cond_40
    move-object v8, v15

    .line 1616
    :goto_2d
    if-eqz v2, :cond_41

    .line 1617
    .line 1618
    new-instance v9, Ljava/util/ArrayList;

    .line 1619
    .line 1620
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1621
    .line 1622
    .line 1623
    goto :goto_2e

    .line 1624
    :cond_41
    move-object/from16 v9, v18

    .line 1625
    .line 1626
    :goto_2e
    new-array v7, v7, [J

    .line 1627
    .line 1628
    move v10, v4

    .line 1629
    move v11, v10

    .line 1630
    move v12, v11

    .line 1631
    const-wide/16 v32, 0x0

    .line 1632
    .line 1633
    :goto_2f
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhao;->zzb()I

    .line 1634
    .line 1635
    .line 1636
    move-result v4

    .line 1637
    if-ge v10, v4, :cond_48

    .line 1638
    .line 1639
    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1640
    .line 1641
    .line 1642
    move-result-wide v23

    .line 1643
    aget v4, p0, v10

    .line 1644
    .line 1645
    move/from16 p1, v2

    .line 1646
    .line 1647
    aget v2, v19, v10

    .line 1648
    .line 1649
    move-object/from16 v18, v5

    .line 1650
    .line 1651
    if-eqz p1, :cond_42

    .line 1652
    .line 1653
    sub-int v5, v2, v4

    .line 1654
    .line 1655
    move-object/from16 v28, v7

    .line 1656
    .line 1657
    move-object/from16 v7, v25

    .line 1658
    .line 1659
    invoke-static {v7, v4, v3, v12, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1660
    .line 1661
    .line 1662
    invoke-static {v13, v4, v6, v12, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1663
    .line 1664
    .line 1665
    invoke-static {v15, v4, v8, v12, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1666
    .line 1667
    .line 1668
    goto :goto_30

    .line 1669
    :cond_42
    move-object/from16 v28, v7

    .line 1670
    .line 1671
    move-object/from16 v7, v25

    .line 1672
    .line 1673
    :goto_30
    move/from16 v5, v27

    .line 1674
    .line 1675
    :goto_31
    if-ge v4, v2, :cond_47

    .line 1676
    .line 1677
    move-object/from16 v26, v6

    .line 1678
    .line 1679
    move-object/from16 v25, v7

    .line 1680
    .line 1681
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzd:J

    .line 1682
    .line 1683
    sget-object v38, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1684
    .line 1685
    const-wide/32 v34, 0xf4240

    .line 1686
    .line 1687
    .line 1688
    move-wide/from16 v36, v6

    .line 1689
    .line 1690
    invoke-static/range {v32 .. v38}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1691
    .line 1692
    .line 1693
    move-result-wide v6

    .line 1694
    aget-wide v29, v14, v4

    .line 1695
    .line 1696
    sub-long v35, v29, v23

    .line 1697
    .line 1698
    move-object/from16 v41, v38

    .line 1699
    .line 1700
    const-wide/32 v37, 0xf4240

    .line 1701
    .line 1702
    .line 1703
    invoke-static/range {v35 .. v41}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1704
    .line 1705
    .line 1706
    move-result-wide v29

    .line 1707
    const-wide/16 v16, 0x0

    .line 1708
    .line 1709
    cmp-long v20, v29, v16

    .line 1710
    .line 1711
    if-gez v20, :cond_43

    .line 1712
    .line 1713
    const/16 v22, 0x0

    .line 1714
    .line 1715
    :goto_32
    const/16 v20, 0x1

    .line 1716
    .line 1717
    goto :goto_33

    .line 1718
    :cond_43
    const/16 v22, 0x1

    .line 1719
    .line 1720
    goto :goto_32

    .line 1721
    :goto_33
    xor-int/lit8 v21, v22, 0x1

    .line 1722
    .line 1723
    or-int v11, v21, v11

    .line 1724
    .line 1725
    add-long v6, v6, v29

    .line 1726
    .line 1727
    aput-wide v6, v28, v12

    .line 1728
    .line 1729
    if-eqz p1, :cond_44

    .line 1730
    .line 1731
    aget v6, v26, v12

    .line 1732
    .line 1733
    if-le v6, v5, :cond_44

    .line 1734
    .line 1735
    aget v5, v13, v4

    .line 1736
    .line 1737
    :cond_44
    if-eqz p1, :cond_45

    .line 1738
    .line 1739
    if-nez v31, :cond_45

    .line 1740
    .line 1741
    aget v6, v8, v12

    .line 1742
    .line 1743
    const/4 v7, 0x1

    .line 1744
    and-int/2addr v6, v7

    .line 1745
    if-eqz v6, :cond_46

    .line 1746
    .line 1747
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v6

    .line 1751
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1752
    .line 1753
    .line 1754
    goto :goto_34

    .line 1755
    :cond_45
    const/4 v7, 0x1

    .line 1756
    :cond_46
    :goto_34
    add-int/2addr v12, v7

    .line 1757
    add-int/2addr v4, v7

    .line 1758
    move-object/from16 v7, v25

    .line 1759
    .line 1760
    move-object/from16 v6, v26

    .line 1761
    .line 1762
    goto :goto_31

    .line 1763
    :cond_47
    move-object/from16 v26, v6

    .line 1764
    .line 1765
    move-object/from16 v25, v7

    .line 1766
    .line 1767
    const/4 v7, 0x1

    .line 1768
    const-wide/16 v16, 0x0

    .line 1769
    .line 1770
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzhao;->zzc(I)J

    .line 1771
    .line 1772
    .line 1773
    move-result-wide v21

    .line 1774
    add-long v32, v21, v32

    .line 1775
    .line 1776
    add-int/2addr v10, v7

    .line 1777
    move/from16 v2, p1

    .line 1778
    .line 1779
    move/from16 v27, v5

    .line 1780
    .line 1781
    move-object/from16 v5, v18

    .line 1782
    .line 1783
    move-object/from16 v7, v28

    .line 1784
    .line 1785
    goto/16 :goto_2f

    .line 1786
    .line 1787
    :cond_48
    move-object/from16 v26, v6

    .line 1788
    .line 1789
    move-object/from16 v28, v7

    .line 1790
    .line 1791
    const/4 v7, 0x1

    .line 1792
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzd:J

    .line 1793
    .line 1794
    sget-object v38, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1795
    .line 1796
    const-wide/32 v34, 0xf4240

    .line 1797
    .line 1798
    .line 1799
    move-wide/from16 v36, v4

    .line 1800
    .line 1801
    invoke-static/range {v32 .. v38}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 1802
    .line 1803
    .line 1804
    move-result-wide v32

    .line 1805
    if-eqz v11, :cond_49

    .line 1806
    .line 1807
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 1808
    .line 1809
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v0

    .line 1813
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzu(Z)Lcom/google/android/gms/internal/ads/zzt;

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v0

    .line 1820
    new-instance v2, Lcom/google/android/gms/internal/ads/zzamo;

    .line 1821
    .line 1822
    const/4 v4, 0x0

    .line 1823
    invoke-direct {v2, v1, v4}, Lcom/google/android/gms/internal/ads/zzamo;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[B)V

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzamo;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzamo;

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzamo;->zzo()Lcom/google/android/gms/internal/ads/zzamp;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v1

    .line 1833
    :cond_49
    move-object/from16 v24, v1

    .line 1834
    .line 1835
    new-instance v23, Lcom/google/android/gms/internal/ads/zzams;

    .line 1836
    .line 1837
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzhaq;->zzf(Ljava/util/Collection;)[I

    .line 1838
    .line 1839
    .line 1840
    move-result-object v30

    .line 1841
    array-length v0, v3

    .line 1842
    move/from16 v34, v0

    .line 1843
    .line 1844
    move-object/from16 v25, v3

    .line 1845
    .line 1846
    move-object/from16 v29, v8

    .line 1847
    .line 1848
    invoke-direct/range {v23 .. v34}, Lcom/google/android/gms/internal/ads/zzams;-><init>(Lcom/google/android/gms/internal/ads/zzamp;[J[II[J[I[IZJI)V

    .line 1849
    .line 1850
    .line 1851
    return-object v23

    .line 1852
    :cond_4a
    move-object v4, v6

    .line 1853
    const-string v0, "Track has no sample table size information"

    .line 1854
    .line 1855
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v0

    .line 1859
    throw v0
.end method

.method public static zzh(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzap;
    .locals 8

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    const-wide/16 v6, 0x2710

    .line 23
    .line 24
    div-long/2addr v4, v6

    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    cmp-long v6, v4, v6

    .line 28
    .line 29
    if-gez v6, :cond_0

    .line 30
    .line 31
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 41
    .line 42
    invoke-virtual {p0, v6, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    new-instance v7, Lcom/google/android/gms/internal/ads/zzaiy;

    .line 47
    .line 48
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzaiy;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v4, v5}, Lcom/google/android/gms/internal/ads/zzaiy;->zza(J)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 52
    .line 53
    .line 54
    new-instance v4, Lcom/google/android/gms/internal/ads/zzx;

    .line 55
    .line 56
    invoke-direct {v4, v1, v6}, Lcom/google/android/gms/internal/ads/zzx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzaiy;->zzd(Lcom/google/android/gms/internal/ads/zzx;)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzaiy;->zze()Lcom/google/android/gms/internal/ads/zzaiz;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/ads/zzap;

    .line 80
    .line 81
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :catch_0
    return-object v1
.end method

.method private static zzi(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzap;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/16 v1, 0x2b

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x2d

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    :try_start_0
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    new-instance v1, Lcom/google/android/gms/internal/ads/zzap;

    .line 55
    .line 56
    new-instance v3, Lcom/google/android/gms/internal/ads/zzgc;

    .line 57
    .line 58
    invoke-direct {v3, v2, p0}, Lcom/google/android/gms/internal/ads/zzgc;-><init>(FF)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    new-array p0, p0, [Lcom/google/android/gms/internal/ads/zzao;

    .line 63
    .line 64
    aput-object v3, p0, v0

    .line 65
    .line 66
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v2, v3, p0}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :catch_0
    const/4 p0, 0x0

    .line 76
    return-object p0
.end method

.method private static zzj(Lcom/google/android/gms/internal/ads/zzeu;)I
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static zzk(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzalh;
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const/16 v3, 0x8

    .line 5
    .line 6
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzalo;->zza(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    move v5, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v5, 0x10

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 27
    .line 28
    .line 29
    move-result-wide v7

    .line 30
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    move v6, v1

    .line 35
    :goto_1
    if-nez v4, :cond_1

    .line 36
    .line 37
    const/4 v9, 0x4

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move v9, v3

    .line 40
    :goto_2
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-ge v6, v9, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    add-int v12, v5, v6

    .line 52
    .line 53
    aget-byte v9, v9, v12

    .line 54
    .line 55
    const/4 v12, -0x1

    .line 56
    if-eq v9, v12, :cond_4

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    :goto_3
    const-wide/16 v5, 0x0

    .line 70
    .line 71
    cmp-long v5, v3, v5

    .line 72
    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    :goto_4
    move-wide v9, v10

    .line 76
    goto :goto_5

    .line 77
    :cond_3
    move-wide v10, v7

    .line 78
    const-wide/32 v8, 0xf4240

    .line 79
    .line 80
    .line 81
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 82
    .line 83
    move-wide v6, v3

    .line 84
    invoke-static/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    move-wide v7, v10

    .line 89
    move-wide v9, v3

    .line 90
    goto :goto_5

    .line 91
    :cond_4
    add-int/2addr v6, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    shr-int/lit8 v3, p0, 0xa

    .line 102
    .line 103
    and-int/lit8 v3, v3, 0x1f

    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x60

    .line 106
    .line 107
    int-to-char v3, v3

    .line 108
    shr-int/lit8 v4, p0, 0x5

    .line 109
    .line 110
    and-int/lit8 v4, v4, 0x1f

    .line 111
    .line 112
    add-int/lit8 v4, v4, 0x60

    .line 113
    .line 114
    int-to-char v4, v4

    .line 115
    and-int/lit8 p0, p0, 0x1f

    .line 116
    .line 117
    add-int/lit8 p0, p0, 0x60

    .line 118
    .line 119
    int-to-char p0, p0

    .line 120
    new-array v5, v0, [C

    .line 121
    .line 122
    aput-char v3, v5, v1

    .line 123
    .line 124
    aput-char v4, v5, v2

    .line 125
    .line 126
    const/4 v3, 0x2

    .line 127
    aput-char p0, v5, v3

    .line 128
    .line 129
    :goto_6
    if-ge v1, v0, :cond_8

    .line 130
    .line 131
    aget-char p0, v5, v1

    .line 132
    .line 133
    const/16 v3, 0x61

    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    if-lt p0, v3, :cond_6

    .line 137
    .line 138
    const/16 v3, 0x7a

    .line 139
    .line 140
    if-le p0, v3, :cond_7

    .line 141
    .line 142
    :cond_6
    :goto_7
    move-object v11, v4

    .line 143
    goto :goto_8

    .line 144
    :cond_7
    add-int/2addr v1, v2

    .line 145
    goto :goto_6

    .line 146
    :cond_8
    new-instance v4, Ljava/lang/String;

    .line 147
    .line 148
    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([C)V

    .line 149
    .line 150
    .line 151
    goto :goto_7

    .line 152
    :goto_8
    new-instance v6, Lcom/google/android/gms/internal/ads/zzalh;

    .line 153
    .line 154
    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/internal/ads/zzalh;-><init>(JJLjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v6
.end method

.method private static zzl([BII)Ljava/lang/String;
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/16 v2, 0x40

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    move v1, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v4

    .line 13
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    move v2, v4

    .line 22
    :goto_1
    array-length v5, p0

    .line 23
    add-int/lit8 v5, v5, -0x3

    .line 24
    .line 25
    if-ge v2, v5, :cond_1

    .line 26
    .line 27
    aget-byte v5, p0, v2

    .line 28
    .line 29
    add-int/lit8 v6, v2, 0x1

    .line 30
    .line 31
    aget-byte v6, p0, v6

    .line 32
    .line 33
    add-int/lit8 v7, v2, 0x2

    .line 34
    .line 35
    aget-byte v7, p0, v7

    .line 36
    .line 37
    add-int/lit8 v8, v2, 0x3

    .line 38
    .line 39
    aget-byte v8, p0, v8

    .line 40
    .line 41
    invoke-static {v5, v6, v7, v8}, Lcom/google/android/gms/internal/ads/zzhaq;->zze(BBBB)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    shr-int/lit8 v6, v5, 0x10

    .line 46
    .line 47
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 48
    .line 49
    shr-int/lit8 v7, v5, 0x8

    .line 50
    .line 51
    const/16 v8, 0xff

    .line 52
    .line 53
    and-int/2addr v7, v8

    .line 54
    add-int/lit8 v7, v7, -0x80

    .line 55
    .line 56
    mul-int/lit16 v9, v7, 0x36fb

    .line 57
    .line 58
    and-int/2addr v6, v8

    .line 59
    div-int/lit16 v9, v9, 0x2710

    .line 60
    .line 61
    add-int/2addr v9, v6

    .line 62
    invoke-static {v9, v8}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    shl-int/2addr v9, v0

    .line 71
    and-int/2addr v5, v8

    .line 72
    add-int/lit8 v5, v5, -0x80

    .line 73
    .line 74
    mul-int/lit16 v7, v7, 0x1c01

    .line 75
    .line 76
    mul-int/lit16 v10, v5, 0xd7f

    .line 77
    .line 78
    div-int/lit16 v10, v10, 0x2710

    .line 79
    .line 80
    sub-int v10, v6, v10

    .line 81
    .line 82
    div-int/lit16 v7, v7, 0x2710

    .line 83
    .line 84
    sub-int/2addr v10, v7

    .line 85
    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    shl-int/lit8 v7, v7, 0x8

    .line 94
    .line 95
    mul-int/lit16 v5, v5, 0x457e

    .line 96
    .line 97
    div-int/lit16 v5, v5, 0x2710

    .line 98
    .line 99
    add-int/2addr v5, v6

    .line 100
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    or-int v6, v9, v7

    .line 109
    .line 110
    or-int/2addr v5, v6

    .line 111
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    new-array v6, v3, [Ljava/lang/Object;

    .line 116
    .line 117
    aput-object v5, v6, v4

    .line 118
    .line 119
    const-string v5, "%06x"

    .line 120
    .line 121
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    add-int/lit8 v2, v2, 0x4

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_1
    const-string p0, ", "

    .line 132
    .line 133
    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/zzgtl;->zzd(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    add-int/lit8 v0, v0, 0x7

    .line 150
    .line 151
    const/16 v2, 0xa

    .line 152
    .line 153
    invoke-static {v0, v2, v1}, LA7/p0;->g(IILjava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-static {v0, v3, p0}, LA7/p0;->g(IILjava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 164
    .line 165
    .line 166
    const-string v0, "size: "

    .line 167
    .line 168
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, "x"

    .line 175
    .line 176
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, "\npalette: "

    .line 183
    .line 184
    const-string p2, "\n"

    .line 185
    .line 186
    invoke-static {v1, p1, p0, p2}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0
.end method

.method private static zzm(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzi;
    .locals 11

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzh;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzh;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/ads/zzet;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    array-length v3, v2

    .line 13
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    mul-int/2addr p0, v2

    .line 23
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzf(I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    move v5, v4

    .line 36
    :goto_0
    if-ge v5, v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    move v7, v4

    .line 46
    :goto_1
    if-ge v7, v6, :cond_2

    .line 47
    .line 48
    const/4 v8, 0x6

    .line 49
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 57
    .line 58
    .line 59
    const/16 v9, 0xb

    .line 60
    .line 61
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x4

    .line 65
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    add-int/2addr v9, v2

    .line 73
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzh;->zze(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzh;->zzf(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 80
    .line 81
    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzh;->zza(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 104
    .line 105
    .line 106
    if-eq p0, v10, :cond_0

    .line 107
    .line 108
    const/4 v8, 0x2

    .line 109
    goto :goto_2

    .line 110
    :cond_0
    move v8, p0

    .line 111
    :goto_2
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzh;->zzb(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 112
    .line 113
    .line 114
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzh;->zzc(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 119
    .line 120
    .line 121
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzh;->zzg()Lcom/google/android/gms/internal/ads/zzi;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method

.method private static zzn()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method private static zzo(Lcom/google/android/gms/internal/ads/zzfz;)Landroid/util/Pair;
    .locals 8

    .line 1
    const v0, 0x656c7374

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 13
    .line 14
    const/16 v0, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzalo;->zza(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhao;->zza(I)Lcom/google/android/gms/internal/ads/zzhan;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhao;->zza(I)Lcom/google/android/gms/internal/ads/zzhan;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_0
    if-ge v4, v1, :cond_4

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-ne v0, v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    :goto_1
    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/internal/ads/zzhan;->zza(J)Lcom/google/android/gms/internal/ads/zzhan;

    .line 55
    .line 56
    .line 57
    if-ne v0, v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    int-to-long v6, v6

    .line 69
    :goto_2
    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzhan;->zza(J)Lcom/google/android/gms/internal/ads/zzhan;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzv()S

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-ne v6, v5, :cond_3

    .line 77
    .line 78
    const/4 v5, 0x2

    .line 79
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    const-string v0, "Unsupported media rate."

    .line 88
    .line 89
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0

    .line 93
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhan;->zzb()Lcom/google/android/gms/internal/ads/zzhao;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzhan;->zzb()Lcom/google/android/gms/internal/ads/zzhao;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method private static zzp(Lcom/google/android/gms/internal/ads/zzeu;IIIILjava/lang/String;ZLcom/google/android/gms/internal/ads/zzq;Lcom/google/android/gms/internal/ads/zzalk;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/16 v15, 0x10

    const/16 v16, 0x3

    add-int/lit8 v11, v2, 0x10

    .line 1
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v11, 0x6

    const/16 v12, 0x8

    if-eqz p6, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v18

    .line 3
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    move/from16 v9, v18

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    const/4 v9, 0x0

    :goto_0
    const/4 v10, 0x4

    const/16 v20, 0x0

    if-eqz v9, :cond_1

    if-ne v9, v14, :cond_2

    :cond_1
    move/from16 v22, v13

    goto :goto_5

    :cond_2
    if-ne v9, v13, :cond_5a

    .line 5
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v21

    .line 7
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-int v8, v8

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v9

    .line 9
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v15

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v21

    and-int/lit8 v22, v21, 0x1

    and-int/lit8 v21, v21, 0x2

    if-eqz v22, :cond_4

    if-eqz v21, :cond_3

    sget-object v21, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    :goto_1
    move/from16 v22, v13

    move-object/from16 v13, v21

    goto :goto_2

    .line 12
    :cond_3
    sget-object v21, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_1

    .line 13
    :goto_2
    invoke-static {v15, v13}, Lcom/google/android/gms/internal/ads/zzfm;->zzD(ILjava/nio/ByteOrder;)I

    move-result v13

    goto :goto_4

    :cond_4
    move/from16 v22, v13

    if-eqz v21, :cond_5

    .line 14
    sget-object v13, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_3

    .line 15
    :cond_5
    sget-object v13, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    :goto_3
    invoke-static {v15, v13}, Lcom/google/android/gms/internal/ads/zzfm;->zzC(ILjava/nio/ByteOrder;)I

    move-result v13

    :goto_4
    if-nez v13, :cond_6

    const/4 v13, -0x1

    .line 16
    :cond_6
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    move/from16 v23, v9

    move v9, v8

    move/from16 v8, v23

    move/from16 v23, v12

    move/from16 v12, v20

    goto :goto_6

    .line 17
    :goto_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v8

    .line 18
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzF()I

    move-result v13

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v21

    move/from16 v23, v12

    add-int/lit8 v12, v21, -0x4

    .line 20
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v12

    if-ne v9, v14, :cond_7

    .line 22
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    :cond_7
    move v9, v13

    const/4 v13, -0x1

    :goto_6
    const v15, 0x73616d72

    const v11, 0x73617762

    const v10, 0x69616d66

    if-ne v1, v10, :cond_8

    const/4 v8, -0x1

    const/4 v9, -0x1

    goto :goto_8

    :cond_8
    if-ne v1, v15, :cond_9

    const/16 v8, 0x1f40

    move v9, v8

    :goto_7
    move v8, v14

    goto :goto_8

    :cond_9
    if-ne v1, v11, :cond_a

    const/16 v1, 0x3e80

    move v9, v1

    move v1, v11

    goto :goto_7

    :cond_a
    :goto_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v14

    const v10, 0x656e6361

    if-ne v1, v10, :cond_d

    .line 23
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzalo;->zzs(Lcom/google/android/gms/internal/ads/zzeu;II)Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 24
    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v6, :cond_b

    const/4 v6, 0x0

    goto :goto_9

    .line 25
    :cond_b
    iget-object v11, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Lcom/google/android/gms/internal/ads/zzamq;

    iget-object v11, v11, Lcom/google/android/gms/internal/ads/zzamq;->zzb:Ljava/lang/String;

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/ads/zzq;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzq;

    move-result-object v6

    .line 26
    :goto_9
    iget-object v11, v7, Lcom/google/android/gms/internal/ads/zzalk;->zza:[Lcom/google/android/gms/internal/ads/zzamq;

    .line 27
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzamq;

    aput-object v1, v11, p9

    :cond_c
    move v1, v10

    .line 28
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    :cond_d
    const v10, 0x61632d33

    const-string v11, "audio/mhm1"

    const-string v28, "audio/raw"

    if-ne v1, v10, :cond_e

    const-string v10, "audio/ac3"

    goto/16 :goto_e

    :cond_e
    const v10, 0x65632d33

    if-ne v1, v10, :cond_f

    .line 29
    const-string v10, "audio/eac3"

    goto/16 :goto_e

    :cond_f
    const v10, 0x61632d34

    if-ne v1, v10, :cond_10

    const-string v10, "audio/ac4"

    goto/16 :goto_e

    :cond_10
    const v10, 0x64747363

    if-ne v1, v10, :cond_11

    const-string v10, "audio/vnd.dts"

    goto/16 :goto_e

    :cond_11
    const v10, 0x64747368

    if-eq v1, v10, :cond_26

    const v10, 0x6474736c

    if-ne v1, v10, :cond_12

    goto/16 :goto_d

    :cond_12
    const v10, 0x64747365

    if-ne v1, v10, :cond_13

    const-string v10, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_e

    :cond_13
    const v10, 0x64747378

    if-ne v1, v10, :cond_14

    const-string v10, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_e

    :cond_14
    if-ne v1, v15, :cond_15

    const-string v10, "audio/3gpp"

    goto/16 :goto_e

    :cond_15
    const v10, 0x73617762

    if-ne v1, v10, :cond_16

    const-string v10, "audio/amr-wb"

    goto/16 :goto_e

    :cond_16
    const v10, 0x736f7774

    if-ne v1, v10, :cond_18

    :goto_a
    move/from16 v13, v22

    :cond_17
    :goto_b
    move-object/from16 v10, v28

    goto/16 :goto_e

    :cond_18
    const v10, 0x74776f73

    if-ne v1, v10, :cond_19

    const/high16 v10, 0x10000000

    move v13, v10

    goto :goto_b

    :cond_19
    const v10, 0x6c70636d

    if-ne v1, v10, :cond_1a

    const/4 v10, -0x1

    if-ne v13, v10, :cond_17

    goto :goto_a

    :cond_1a
    const v10, 0x2e6d7032

    if-eq v1, v10, :cond_25

    const v10, 0x2e6d7033

    if-ne v1, v10, :cond_1b

    goto :goto_c

    :cond_1b
    const v10, 0x6d686131

    if-ne v1, v10, :cond_1c

    const-string v10, "audio/mha1"

    goto :goto_e

    :cond_1c
    const v10, 0x6d686d31

    if-ne v1, v10, :cond_1d

    move-object v10, v11

    goto :goto_e

    :cond_1d
    const v10, 0x616c6163

    if-ne v1, v10, :cond_1e

    const-string v10, "audio/alac"

    goto :goto_e

    :cond_1e
    const v10, 0x616c6177

    if-ne v1, v10, :cond_1f

    const-string v10, "audio/g711-alaw"

    goto :goto_e

    :cond_1f
    const v10, 0x756c6177

    if-ne v1, v10, :cond_20

    const-string v10, "audio/g711-mlaw"

    goto :goto_e

    :cond_20
    const v10, 0x4f707573

    if-ne v1, v10, :cond_21

    const-string v10, "audio/opus"

    goto :goto_e

    :cond_21
    const v10, 0x664c6143

    if-ne v1, v10, :cond_22

    const-string v10, "audio/flac"

    goto :goto_e

    :cond_22
    const v10, 0x6d6c7061

    if-ne v1, v10, :cond_23

    const-string v10, "audio/true-hd"

    goto :goto_e

    :cond_23
    const v10, 0x69616d66

    if-ne v1, v10, :cond_24

    const-string v1, "audio/iamf"

    move/from16 v37, v10

    move-object v10, v1

    move/from16 v1, v37

    goto :goto_e

    :cond_24
    const/4 v10, 0x0

    goto :goto_e

    :cond_25
    :goto_c
    const-string v10, "audio/mpeg"

    goto :goto_e

    :cond_26
    :goto_d
    const-string v10, "audio/vnd.dts.hd"

    :goto_e
    move/from16 p9, v13

    const/4 v2, 0x0

    const/4 v15, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_f
    sub-int v13, v14, p2

    if-ge v13, v3, :cond_57

    .line 30
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v13

    if-lez v13, :cond_27

    const/4 v3, 0x1

    :goto_10
    move-object/from16 v29, v15

    goto :goto_11

    :cond_27
    move/from16 v3, v20

    goto :goto_10

    .line 32
    :goto_11
    const-string v15, "childAtomSize must be positive"

    invoke-static {v3, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v3

    move/from16 v30, v9

    const v9, 0x6d686143

    if-ne v3, v9, :cond_2a

    add-int/lit8 v3, v14, 0x8

    .line 34
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v3, 0x1

    .line 35
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v9

    .line 37
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 38
    invoke-static {v10, v11}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_28

    .line 39
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v15, v3, [Ljava/lang/Object;

    aput-object v9, v15, v20

    const-string v9, "mhm1.%02X"

    invoke-static {v9, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    move-object v15, v9

    goto :goto_12

    .line 40
    :cond_28
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-array v15, v3, [Ljava/lang/Object;

    aput-object v9, v15, v20

    const-string v3, "mha1.%02X"

    invoke-static {v3, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    .line 41
    :goto_12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    move-result v3

    new-array v9, v3, [B

    move-object/from16 v31, v11

    move/from16 v11, v20

    .line 42
    invoke-virtual {v0, v9, v11, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    if-nez v2, :cond_29

    .line 43
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    :goto_13
    move/from16 v3, p9

    move/from16 v32, v12

    move/from16 v19, v13

    :goto_14
    move/from16 v9, v30

    :goto_15
    const/16 v18, 0x9

    const/16 v24, 0x4

    goto/16 :goto_33

    .line 44
    :cond_29
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v9, v2}, Lcom/google/android/gms/internal/ads/zzgwt;->zzk(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    goto :goto_13

    :cond_2a
    move-object/from16 v31, v11

    move/from16 v11, v20

    const v9, 0x6d686150

    if-ne v3, v9, :cond_2d

    add-int/lit8 v3, v14, 0x8

    .line 45
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 46
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v3

    if-lez v3, :cond_2c

    new-array v9, v3, [B

    .line 47
    invoke-virtual {v0, v9, v11, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    if-nez v2, :cond_2b

    .line 48
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    move/from16 v3, p9

    move/from16 v32, v12

    move/from16 v19, v13

    move-object/from16 v15, v29

    goto :goto_14

    .line 49
    :cond_2b
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-static {v2, v9}, Lcom/google/android/gms/internal/ads/zzgwt;->zzk(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    :goto_16
    move/from16 v3, p9

    move/from16 v32, v12

    move/from16 v19, v13

    move-object/from16 v15, v29

    move/from16 v9, v30

    :goto_17
    const/4 v11, 0x0

    goto :goto_15

    :cond_2c
    move/from16 v32, v12

    move/from16 v19, v13

    move/from16 v9, v30

    :goto_18
    const/16 v18, 0x9

    const/16 v24, 0x4

    goto/16 :goto_32

    :cond_2d
    const v9, 0x65736473

    if-eq v3, v9, :cond_50

    if-eqz p6, :cond_32

    const v11, 0x77617665

    if-ne v3, v11, :cond_32

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v3

    if-lt v3, v14, :cond_2e

    const/4 v11, 0x1

    :goto_19
    const/4 v9, 0x0

    goto :goto_1a

    :cond_2e
    const/4 v11, 0x0

    goto :goto_19

    .line 50
    :goto_1a
    invoke-static {v11, v9}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    :goto_1b
    sub-int v9, v3, v14

    if-ge v9, v13, :cond_31

    .line 51
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 52
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v9

    if-lez v9, :cond_2f

    const/4 v11, 0x1

    goto :goto_1c

    :cond_2f
    const/4 v11, 0x0

    .line 53
    :goto_1c
    invoke-static {v11, v15}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 54
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v11

    move/from16 v33, v3

    const v3, 0x65736473

    if-eq v11, v3, :cond_30

    add-int v9, v33, v9

    move v3, v9

    goto :goto_1b

    :cond_30
    move/from16 v32, v12

    move/from16 v19, v13

    move/from16 v9, v30

    move/from16 v3, v33

    :goto_1d
    const/4 v11, -0x1

    const/16 v18, 0x9

    const/16 v24, 0x4

    goto/16 :goto_2c

    :cond_31
    move/from16 v32, v12

    move/from16 v19, v13

    move/from16 v9, v30

    const/4 v3, -0x1

    goto :goto_1d

    :cond_32
    const v9, 0x62747274

    if-ne v3, v9, :cond_33

    .line 55
    invoke-static {v0, v14}, Lcom/google/android/gms/internal/ads/zzalo;->zzr(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzald;

    move-result-object v27

    goto :goto_16

    :cond_33
    const v9, 0x64616333

    if-ne v3, v9, :cond_34

    add-int/lit8 v3, v14, 0x8

    .line 56
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 57
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzafa;->zza(Lcom/google/android/gms/internal/ads/zzeu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    :goto_1e
    move/from16 v32, v12

    move/from16 v19, v13

    move/from16 v9, v30

    const/4 v11, 0x0

    goto :goto_18

    :cond_34
    const v9, 0x64656333

    if-ne v3, v9, :cond_35

    add-int/lit8 v3, v14, 0x8

    .line 58
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzafa;->zzb(Lcom/google/android/gms/internal/ads/zzeu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    goto :goto_1e

    :cond_35
    const v9, 0x64616334

    if-ne v3, v9, :cond_36

    add-int/lit8 v3, v14, 0x8

    .line 60
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 61
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzafd;->zza(Lcom/google/android/gms/internal/ads/zzeu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    goto :goto_1e

    :cond_36
    const v9, 0x646d6c70

    if-ne v3, v9, :cond_38

    if-lez v12, :cond_37

    move/from16 v3, p9

    move v9, v12

    move/from16 v32, v9

    move/from16 v19, v13

    move/from16 v8, v22

    :goto_1f
    move-object/from16 v15, v29

    goto/16 :goto_17

    .line 62
    :cond_37
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x31

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v0, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v0

    throw v0

    :cond_38
    const/4 v9, 0x0

    const v11, 0x64647473

    if-eq v3, v11, :cond_39

    const v11, 0x75647473

    if-ne v3, v11, :cond_3a

    :cond_39
    move/from16 v32, v12

    move/from16 v19, v13

    const/16 v18, 0x9

    const/16 v24, 0x4

    goto/16 :goto_2b

    :cond_3a
    const v11, 0x644f7073

    if-ne v3, v11, :cond_3b

    add-int/lit8 v2, v14, 0x8

    add-int/lit8 v3, v13, -0x8

    .line 63
    sget-object v11, Lcom/google/android/gms/internal/ads/zzalo;->zzb:[B

    .line 64
    array-length v15, v11

    add-int v9, v15, v3

    invoke-static {v11, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v9

    .line 65
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 66
    invoke-virtual {v0, v9, v15, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 67
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzgx;->zza([B)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_16

    :cond_3b
    const v9, 0x64664c61

    if-ne v3, v9, :cond_3c

    add-int/lit8 v2, v14, 0xc

    add-int/lit8 v3, v13, -0xc

    add-int/lit8 v9, v13, -0x8

    .line 68
    new-array v9, v9, [B

    const/16 v11, 0x66

    const/16 v20, 0x0

    .line 69
    aput-byte v11, v9, v20

    const/16 v11, 0x4c

    const/16 v25, 0x1

    .line 70
    aput-byte v11, v9, v25

    const/16 v11, 0x61

    .line 71
    aput-byte v11, v9, v22

    const/16 v11, 0x43

    .line 72
    aput-byte v11, v9, v16

    .line 73
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v2, 0x4

    .line 74
    invoke-virtual {v0, v9, v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 75
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    goto/16 :goto_16

    :cond_3c
    const v9, 0x616c6163

    if-ne v3, v9, :cond_3e

    add-int/lit8 v2, v14, 0xc

    add-int/lit8 v3, v13, -0xc

    .line 76
    new-array v8, v3, [B

    .line 77
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v11, 0x0

    .line 78
    invoke-virtual {v0, v8, v11, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 79
    sget v2, Lcom/google/android/gms/internal/ads/zzdr;->zza:I

    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 80
    invoke-direct {v2, v8}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    const/4 v3, 0x5

    .line 81
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 82
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v3

    const/16 v11, 0x9

    .line 83
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 84
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v11

    const/16 v15, 0x14

    .line 85
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 86
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    move-result v2

    filled-new-array {v2, v11, v3}, [I

    move-result-object v2

    const/16 v20, 0x0

    aget v11, v2, v20

    const/16 v25, 0x1

    aget v2, v2, v25

    sget-object v15, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 87
    invoke-static {v3, v15}, Lcom/google/android/gms/internal/ads/zzfm;->zzC(ILjava/nio/ByteOrder;)I

    move-result v3

    if-nez v3, :cond_3d

    const/4 v3, -0x1

    .line 88
    :cond_3d
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v8

    move-object v9, v8

    move v8, v2

    move-object v2, v9

    move v9, v11

    move/from16 v32, v12

    move/from16 v19, v13

    goto/16 :goto_1f

    :cond_3e
    const v11, 0x69616362

    if-ne v3, v11, :cond_48

    const/16 v18, 0x9

    add-int/lit8 v2, v14, 0x9

    .line 89
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzP()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    move-result v2

    .line 91
    new-array v3, v2, [B

    const/4 v11, 0x0

    .line 92
    invoke-virtual {v0, v3, v11, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 93
    sget v2, Lcom/google/android/gms/internal/ads/zzdr;->zza:I

    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 94
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    const/4 v11, 0x0

    const/4 v15, 0x0

    .line 95
    :goto_20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    move-result v29

    if-lez v29, :cond_3f

    if-eqz v11, :cond_40

    if-nez v15, :cond_3f

    goto :goto_21

    :cond_3f
    move-object/from16 v34, v3

    move/from16 v32, v12

    move/from16 v19, v13

    const/16 v24, 0x4

    goto/16 :goto_25

    .line 96
    :cond_40
    :goto_21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v29

    shr-int/lit8 v9, v29, 0x3

    and-int/lit8 v32, v29, 0x2

    const/16 v25, 0x1

    and-int/lit8 v29, v29, 0x1

    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzP()J

    move-result-wide v33

    invoke-static/range {v33 .. v34}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    move-result v33

    move-object/from16 v34, v3

    const/4 v3, 0x4

    if-le v9, v3, :cond_41

    const/16 v3, 0x18

    if-ge v9, v3, :cond_41

    if-eqz v32, :cond_41

    .line 98
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzQ()V

    .line 99
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzQ()V

    :cond_41
    if-eqz v29, :cond_42

    .line 100
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzP()J

    move-result-wide v35

    invoke-static/range {v35 .. v36}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    move-result v3

    .line 101
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    :cond_42
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v3

    add-int v3, v3, v33

    move/from16 v32, v12

    const/16 v12, 0x1f

    if-ne v9, v12, :cond_44

    const/4 v12, 0x4

    .line 102
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 103
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v9

    .line 104
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v11

    .line 105
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v29, v9

    move/from16 v12, v22

    new-array v9, v12, [Ljava/lang/Object;

    const/16 v20, 0x0

    aput-object v29, v9, v20

    const/16 v25, 0x1

    aput-object v11, v9, v25

    sget-object v11, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v12, "iamf.%03X.%03X"

    .line 106
    invoke-static {v11, v12, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    move-object v11, v9

    :cond_43
    move/from16 v19, v13

    const/16 v24, 0x4

    goto :goto_24

    :cond_44
    if-nez v9, :cond_43

    .line 107
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzQ()V

    .line 108
    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v12, 0x4

    invoke-virtual {v2, v12, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "mp4a"

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_46

    .line 109
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzQ()V

    const/4 v12, 0x2

    .line 110
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    new-instance v15, Lcom/google/android/gms/internal/ads/zzet;

    .line 111
    invoke-direct {v15}, Lcom/google/android/gms/internal/ads/zzet;-><init>()V

    .line 112
    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/zzet;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    move/from16 v19, v13

    const/4 v12, 0x5

    .line 113
    invoke-virtual {v15, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    move-result v13

    const/16 v12, 0x1f

    if-ne v13, v12, :cond_45

    const/4 v12, 0x6

    .line 114
    invoke-virtual {v15, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    move-result v13

    add-int/lit8 v13, v13, 0x20

    goto :goto_22

    :cond_45
    const/4 v12, 0x6

    :goto_22
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v15

    const/16 v24, 0x4

    add-int/lit8 v15, v15, 0x4

    .line 115
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    move-result v21

    new-instance v12, Ljava/lang/StringBuilder;

    add-int v15, v15, v21

    invoke-direct {v12, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".40."

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    :goto_23
    move-object v15, v9

    goto :goto_24

    :cond_46
    move/from16 v19, v13

    const/16 v24, 0x4

    goto :goto_23

    .line 116
    :goto_24
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    move/from16 v13, v19

    move/from16 v12, v32

    move-object/from16 v3, v34

    const v9, 0x616c6163

    const/16 v22, 0x2

    goto/16 :goto_20

    :goto_25
    if-eqz v11, :cond_47

    if-eqz v15, :cond_47

    .line 117
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v25, 0x1

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v9, Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    .line 118
    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "."

    .line 119
    invoke-static {v9, v11, v2, v15}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    goto :goto_26

    :cond_47
    const/4 v15, 0x0

    .line 120
    :goto_26
    invoke-static/range {v34 .. v34}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    move/from16 v3, p9

    :goto_27
    move/from16 v9, v30

    const/4 v11, 0x0

    goto/16 :goto_33

    :cond_48
    move/from16 v32, v12

    move/from16 v19, v13

    const/16 v18, 0x9

    const/16 v24, 0x4

    const v9, 0x70636d43

    if-ne v3, v9, :cond_4e

    add-int/lit8 v3, v14, 0xc

    .line 121
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 122
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v3

    const/16 v25, 0x1

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_49

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_28

    .line 123
    :cond_49
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 124
    :goto_28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v9

    const v11, 0x6970636d

    if-ne v1, v11, :cond_4a

    .line 125
    invoke-static {v9, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzC(ILjava/nio/ByteOrder;)I

    move-result v3

    goto :goto_29

    :cond_4a
    const v11, 0x6670636d

    if-ne v1, v11, :cond_4b

    .line 126
    invoke-static {v9, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzD(ILjava/nio/ByteOrder;)I

    move-result v3

    goto :goto_29

    :cond_4b
    move/from16 v3, p9

    :goto_29
    if-nez v3, :cond_4c

    const/4 v3, -0x1

    :cond_4c
    const/4 v9, -0x1

    if-eq v3, v9, :cond_4d

    move-object/from16 v10, v28

    :cond_4d
    move-object/from16 v15, v29

    goto :goto_27

    :cond_4e
    move/from16 v9, v30

    :cond_4f
    :goto_2a
    const/4 v11, 0x0

    goto/16 :goto_32

    .line 127
    :goto_2b
    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 128
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 129
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 130
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 131
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v9, v30

    .line 132
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 133
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzs(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    .line 134
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 135
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v3

    iput-object v3, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    goto :goto_2a

    :cond_50
    move/from16 v32, v12

    move/from16 v19, v13

    move/from16 v9, v30

    const/16 v18, 0x9

    const/16 v24, 0x4

    move v3, v14

    const/4 v11, -0x1

    :goto_2c
    if-eq v3, v11, :cond_4f

    .line 136
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzalo;->zzq(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzalf;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzalf;->zza()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzalf;->zzb()[B

    move-result-object v10

    if-eqz v10, :cond_56

    const-string v2, "audio/vorbis"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_54

    .line 137
    sget v2, Lcom/google/android/gms/internal/ads/zzaho;->zza:I

    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 138
    invoke-direct {v2, v10}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    const/4 v12, 0x1

    .line 139
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    const/4 v13, 0x0

    .line 140
    :goto_2d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    move-result v15

    if-lez v15, :cond_51

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzn()I

    move-result v15

    const/16 v11, 0xff

    if-ne v15, v11, :cond_52

    .line 141
    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    add-int/2addr v13, v11

    const/4 v11, -0x1

    const/4 v12, 0x1

    goto :goto_2d

    :cond_51
    const/16 v11, 0xff

    .line 142
    :cond_52
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v12

    add-int/2addr v12, v13

    const/4 v13, 0x0

    .line 143
    :goto_2e
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    move-result v15

    if-lez v15, :cond_53

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzn()I

    move-result v15

    if-ne v15, v11, :cond_53

    const/4 v15, 0x1

    .line 144
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    add-int/2addr v13, v11

    goto :goto_2e

    :cond_53
    const/4 v15, 0x1

    .line 145
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    move-result v17

    add-int v17, v17, v13

    .line 146
    new-array v13, v12, [B

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    move-result v2

    const/4 v11, 0x0

    .line 147
    invoke-static {v10, v2, v13, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v12

    array-length v12, v10

    add-int v2, v2, v17

    sub-int/2addr v12, v2

    .line 148
    new-array v15, v12, [B

    .line 149
    invoke-static {v10, v2, v15, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 150
    invoke-static {v13, v15}, Lcom/google/android/gms/internal/ads/zzgwt;->zzk(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    :goto_2f
    move-object v10, v3

    move-object/from16 v15, v29

    :goto_30
    move/from16 v3, p9

    goto :goto_33

    :cond_54
    const/4 v11, 0x0

    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_55

    .line 151
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzaey;->zza([B)Lcom/google/android/gms/internal/ads/zzaex;

    move-result-object v2

    iget v9, v2, Lcom/google/android/gms/internal/ads/zzaex;->zza:I

    iget v8, v2, Lcom/google/android/gms/internal/ads/zzaex;->zzb:I

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzaex;->zzc:Ljava/lang/String;

    goto :goto_31

    :cond_55
    move-object/from16 v15, v29

    .line 152
    :goto_31
    invoke-static {v10}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object v2

    move-object v10, v3

    goto :goto_30

    :cond_56
    const/4 v11, 0x0

    goto :goto_2f

    :goto_32
    move/from16 v3, p9

    move-object/from16 v15, v29

    :goto_33
    add-int v14, v14, v19

    move/from16 p9, v3

    move/from16 v20, v11

    move-object/from16 v11, v31

    move/from16 v12, v32

    const/16 v22, 0x2

    move/from16 v3, p3

    goto/16 :goto_f

    :cond_57
    move-object/from16 v29, v15

    .line 153
    iget-object v0, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    if-nez v0, :cond_5a

    if-eqz v10, :cond_5a

    new-instance v0, Lcom/google/android/gms/internal/ads/zzt;

    .line 154
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 155
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 156
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    move-object/from16 v15, v29

    .line 157
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 158
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 159
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    move/from16 v13, p9

    .line 160
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/zzt;->zzJ(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 161
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 162
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzs(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    .line 163
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    if-eqz v26, :cond_58

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzalf;->zzc()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v1

    .line 164
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual/range {v26 .. v26}, Lcom/google/android/gms/internal/ads/zzalf;->zzd()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v1

    .line 165
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    goto :goto_34

    :cond_58
    if-eqz v27, :cond_59

    .line 166
    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/internal/ads/zzald;->zza()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v1

    .line 167
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    invoke-virtual/range {v27 .. v27}, Lcom/google/android/gms/internal/ads/zzald;->zzb()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzhaq;->zzb(J)I

    move-result v1

    .line 168
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 169
    :cond_59
    :goto_34
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object v0

    iput-object v0, v7, Lcom/google/android/gms/internal/ads/zzalk;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    :cond_5a
    return-void
.end method

.method private static zzq(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzalf;
    .locals 9

    .line 1
    add-int/lit8 p1, p1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzt(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzt(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzas;->zze(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzalo;->zzt(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p1, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p0, v3, v6, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 109
    .line 110
    .line 111
    const-wide/16 p0, 0x0

    .line 112
    .line 113
    cmp-long v6, v4, p0

    .line 114
    .line 115
    const-wide/16 v7, -0x1

    .line 116
    .line 117
    if-gtz v6, :cond_4

    .line 118
    .line 119
    move-wide v4, v7

    .line 120
    :cond_4
    cmp-long p0, v0, p0

    .line 121
    .line 122
    if-lez p0, :cond_5

    .line 123
    .line 124
    move-wide v6, v0

    .line 125
    goto :goto_0

    .line 126
    :cond_5
    move-wide v6, v7

    .line 127
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzalf;

    .line 128
    .line 129
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzalf;-><init>(Ljava/lang/String;[BJJ)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_6
    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzalf;

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    const-wide/16 v4, -0x1

    .line 137
    .line 138
    move-wide v6, v4

    .line 139
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzalf;-><init>(Ljava/lang/String;[BJJ)V

    .line 140
    .line 141
    .line 142
    return-object v1
.end method

.method private static zzr(Lcom/google/android/gms/internal/ads/zzeu;I)Lcom/google/android/gms/internal/ads/zzald;
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    new-instance v2, Lcom/google/android/gms/internal/ads/zzald;

    .line 19
    .line 20
    invoke-direct {v2, p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzald;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    return-object v2
.end method

.method private static zzs(Lcom/google/android/gms/internal/ads/zzeu;II)Landroid/util/Pair;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    sub-int v2, v1, p1

    .line 8
    .line 9
    move/from16 v4, p2

    .line 10
    .line 11
    if-ge v2, v4, :cond_11

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    if-lez v2, :cond_0

    .line 23
    .line 24
    move v7, v5

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v7, v6

    .line 27
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 28
    .line 29
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const v8, 0x73696e66

    .line 37
    .line 38
    .line 39
    if-ne v7, v8, :cond_10

    .line 40
    .line 41
    add-int/lit8 v7, v1, 0x8

    .line 42
    .line 43
    const/4 v8, -0x1

    .line 44
    move v12, v6

    .line 45
    move v9, v8

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    :goto_2
    sub-int v13, v7, v1

    .line 49
    .line 50
    const/4 v14, 0x4

    .line 51
    if-ge v13, v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 57
    .line 58
    .line 59
    move-result v13

    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 61
    .line 62
    .line 63
    move-result v15

    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const v3, 0x66726d61

    .line 67
    .line 68
    .line 69
    if-ne v15, v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    goto :goto_3

    .line 80
    :cond_1
    const v3, 0x7363686d

    .line 81
    .line 82
    .line 83
    if-ne v15, v3, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 86
    .line 87
    .line 88
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 89
    .line 90
    invoke-virtual {v0, v14, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    goto :goto_3

    .line 95
    :cond_2
    const v3, 0x73636869

    .line 96
    .line 97
    .line 98
    if-ne v15, v3, :cond_3

    .line 99
    .line 100
    move v9, v7

    .line 101
    move v12, v13

    .line 102
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/16 v16, 0x0

    .line 105
    .line 106
    const-string v3, "cenc"

    .line 107
    .line 108
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_6

    .line 113
    .line 114
    const-string v3, "cbc1"

    .line 115
    .line 116
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_6

    .line 121
    .line 122
    const-string v3, "cens"

    .line 123
    .line 124
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-nez v3, :cond_6

    .line 129
    .line 130
    const-string v3, "cbcs"

    .line 131
    .line 132
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    move-object/from16 v3, v16

    .line 140
    .line 141
    goto/16 :goto_c

    .line 142
    .line 143
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 144
    .line 145
    move v3, v5

    .line 146
    goto :goto_5

    .line 147
    :cond_7
    move v3, v6

    .line 148
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 149
    .line 150
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    if-eq v9, v8, :cond_8

    .line 154
    .line 155
    move v3, v5

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    move v3, v6

    .line 158
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 159
    .line 160
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v3, v9, 0x8

    .line 164
    .line 165
    :goto_7
    sub-int v7, v3, v9

    .line 166
    .line 167
    if-ge v7, v12, :cond_d

    .line 168
    .line 169
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    const v13, 0x74656e63

    .line 181
    .line 182
    .line 183
    if-ne v8, v13, :cond_c

    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzalo;->zza(I)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 194
    .line 195
    .line 196
    if-nez v3, :cond_9

    .line 197
    .line 198
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 199
    .line 200
    .line 201
    move v14, v6

    .line 202
    move v15, v14

    .line 203
    goto :goto_8

    .line 204
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    and-int/lit16 v7, v3, 0xf0

    .line 209
    .line 210
    shr-int/2addr v7, v14

    .line 211
    and-int/lit8 v3, v3, 0xf

    .line 212
    .line 213
    move v15, v3

    .line 214
    move v14, v7

    .line 215
    :goto_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-ne v3, v5, :cond_a

    .line 220
    .line 221
    move-object v3, v10

    .line 222
    move v10, v5

    .line 223
    goto :goto_9

    .line 224
    :cond_a
    move-object v3, v10

    .line 225
    move v10, v6

    .line 226
    :goto_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    const/16 v7, 0x10

    .line 231
    .line 232
    new-array v13, v7, [B

    .line 233
    .line 234
    invoke-virtual {v0, v13, v6, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 235
    .line 236
    .line 237
    if-eqz v10, :cond_b

    .line 238
    .line 239
    if-nez v12, :cond_b

    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    new-array v8, v7, [B

    .line 246
    .line 247
    invoke-virtual {v0, v8, v6, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v16, v8

    .line 251
    .line 252
    :cond_b
    new-instance v9, Lcom/google/android/gms/internal/ads/zzamq;

    .line 253
    .line 254
    move-object v8, v3

    .line 255
    invoke-direct/range {v9 .. v16}, Lcom/google/android/gms/internal/ads/zzamq;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 256
    .line 257
    .line 258
    move-object v3, v9

    .line 259
    goto :goto_a

    .line 260
    :cond_c
    move-object v8, v10

    .line 261
    add-int/2addr v3, v7

    .line 262
    goto :goto_7

    .line 263
    :cond_d
    move-object v8, v10

    .line 264
    move-object/from16 v3, v16

    .line 265
    .line 266
    :goto_a
    if-eqz v3, :cond_e

    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_e
    move v5, v6

    .line 270
    :goto_b
    const-string v6, "tenc atom is mandatory"

    .line 271
    .line 272
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzage;->zza(ZLjava/lang/String;)V

    .line 273
    .line 274
    .line 275
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :goto_c
    if-nez v3, :cond_f

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_f
    return-object v3

    .line 285
    :cond_10
    :goto_d
    add-int/2addr v1, v2

    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_11
    const/16 v16, 0x0

    .line 289
    .line 290
    return-object v16
.end method

.method private static zzt(Lcom/google/android/gms/internal/ads/zzeu;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
.end method
