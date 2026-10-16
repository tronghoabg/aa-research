.class public final Lcom/google/android/gms/internal/ads/zzctu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzddc;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfkq;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfky;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfsi;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfsm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfsm;Lcom/google/android/gms/internal/ads/zzfsi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzb:Lcom/google/android/gms/internal/ads/zzfky;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzd:Lcom/google/android/gms/internal/ads/zzfsm;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzc:Lcom/google/android/gms/internal/ads/zzfsi;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfky;->zzb:Lcom/google/android/gms/internal/ads/zzfkx;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfkx;->zzb:Lcom/google/android/gms/internal/ads/zzfkq;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzctu;->zza:Lcom/google/android/gms/internal/ads/zzfkq;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final zzdJ(LD6/K0;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzctu;->zza:Lcom/google/android/gms/internal/ads/zzfkq;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfkq;->zza:Ljava/util/List;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzc:Lcom/google/android/gms/internal/ads/zzfsi;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzb:Lcom/google/android/gms/internal/ads/zzfky;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzctu;->zzd:Lcom/google/android/gms/internal/ads/zzfsm;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v0, v1, v3, p1}, Lcom/google/android/gms/internal/ads/zzfsi;->zza(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzfsm;->zza(Ljava/util/List;LH6/q;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
