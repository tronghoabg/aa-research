.class final synthetic Lcom/google/android/gms/internal/ads/zzeok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzeom;

.field private final synthetic zzb:Lp8/p;

.field private final synthetic zzc:Lp8/p;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzfky;

.field private final synthetic zze:Lcom/google/android/gms/internal/ads/zzfkn;

.field private final synthetic zzf:Lorg/json/JSONObject;

.field private final synthetic zzg:LC6/b;

.field private final synthetic zzh:Lcom/google/android/gms/internal/ads/zzcdu;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeom;Lp8/p;Lp8/p;Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;Lorg/json/JSONObject;LC6/b;Lcom/google/android/gms/internal/ads/zzcdu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeok;->zza:Lcom/google/android/gms/internal/ads/zzeom;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzb:Lp8/p;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzc:Lp8/p;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzd:Lcom/google/android/gms/internal/ads/zzfky;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeok;->zze:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzf:Lorg/json/JSONObject;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzg:LC6/b;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzh:Lcom/google/android/gms/internal/ads/zzcdu;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeok;->zza:Lcom/google/android/gms/internal/ads/zzeom;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzb:Lp8/p;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzc:Lp8/p;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzd:Lcom/google/android/gms/internal/ads/zzfky;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeok;->zze:Lcom/google/android/gms/internal/ads/zzfkn;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzf:Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzg:LC6/b;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzeok;->zzh:Lcom/google/android/gms/internal/ads/zzcdu;

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzeom;->zzf(Lp8/p;Lp8/p;Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;Lorg/json/JSONObject;LC6/b;Lcom/google/android/gms/internal/ads/zzcdu;)Lcom/google/android/gms/internal/ads/zzdpw;

    move-result-object v0

    return-object v0
.end method
