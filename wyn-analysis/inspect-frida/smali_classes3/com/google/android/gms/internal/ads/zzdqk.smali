.class public final Lcom/google/android/gms/internal/ads/zzdqk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzbnj;

.field zzb:Lcom/google/android/gms/internal/ads/zzbng;

.field zzc:Lcom/google/android/gms/internal/ads/zzbnw;

.field zzd:Lcom/google/android/gms/internal/ads/zzbnt;

.field zze:Lcom/google/android/gms/internal/ads/zzbsr;

.field final zzf:Lx/v;

.field final zzg:Lx/v;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx/v;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lx/v;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzf:Lx/v;

    .line 11
    .line 12
    new-instance v0, Lx/v;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lx/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzg:Lx/v;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbnj;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zza:Lcom/google/android/gms/internal/ads/zzbnj;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbng;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzb:Lcom/google/android/gms/internal/ads/zzbng;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzbnw;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzc:Lcom/google/android/gms/internal/ads/zzbnw;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbnt;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzd:Lcom/google/android/gms/internal/ads/zzbnt;

    return-object p0
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzbsr;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zze:Lcom/google/android/gms/internal/ads/zzbsr;

    return-object p0
.end method

.method public final zzf(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbnp;Lcom/google/android/gms/internal/ads/zzbnm;)Lcom/google/android/gms/internal/ads/zzdqk;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzf:Lx/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdqk;->zzg:Lx/v;

    .line 9
    .line 10
    invoke-virtual {p2, p1, p3}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object p0
.end method

.method public final zzg()Lcom/google/android/gms/internal/ads/zzdql;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdql;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzdql;-><init>(Lcom/google/android/gms/internal/ads/zzdqk;[B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
