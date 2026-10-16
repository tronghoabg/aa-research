.class public final Lcom/google/android/gms/internal/ads/zzzu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdp;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdp;->zza:Lcom/google/android/gms/internal/ads/zzdp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzzu;->zza:Lcom/google/android/gms/internal/ads/zzdp;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbg;[IILcom/google/android/gms/internal/ads/zzabr;Lcom/google/android/gms/internal/ads/zzgwt;)Lcom/google/android/gms/internal/ads/zzzv;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzzu;->zza:Lcom/google/android/gms/internal/ads/zzdp;

    .line 4
    .line 5
    move-object/from16 v17, v1

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzzv;

    .line 8
    .line 9
    const v14, 0x3f333333    # 0.7f

    .line 10
    .line 11
    .line 12
    const/high16 v15, 0x3f400000    # 0.75f

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const-wide/16 v6, 0x2710

    .line 16
    .line 17
    const-wide/16 v8, 0x61a8

    .line 18
    .line 19
    const/16 v12, 0x4ff

    .line 20
    .line 21
    const/16 v13, 0x2cf

    .line 22
    .line 23
    move-wide v10, v8

    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    move-object/from16 v3, p2

    .line 27
    .line 28
    move-object/from16 v5, p4

    .line 29
    .line 30
    move-object/from16 v16, p5

    .line 31
    .line 32
    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/internal/ads/zzzv;-><init>(Lcom/google/android/gms/internal/ads/zzbg;[IILcom/google/android/gms/internal/ads/zzabr;JJJIIFFLjava/util/List;Lcom/google/android/gms/internal/ads/zzdp;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method
