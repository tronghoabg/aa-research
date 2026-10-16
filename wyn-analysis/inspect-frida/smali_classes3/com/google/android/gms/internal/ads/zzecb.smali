.class final synthetic Lcom/google/android/gms/internal/ads/zzecb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzece;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzbsa;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzfme;

.field private final synthetic zze:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzece;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsa;Lcom/google/android/gms/internal/ads/zzfme;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzecb;->zza:Lcom/google/android/gms/internal/ads/zzece;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzc:Lcom/google/android/gms/internal/ads/zzbsa;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzd:Lcom/google/android/gms/internal/ads/zzfme;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzecb;->zze:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecb;->zza:Lcom/google/android/gms/internal/ads/zzece;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzc:Lcom/google/android/gms/internal/ads/zzbsa;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzecb;->zzd:Lcom/google/android/gms/internal/ads/zzfme;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzecb;->zze:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzece;->zzk(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsa;Lcom/google/android/gms/internal/ads/zzfme;Ljava/util/List;)V

    return-void
.end method
