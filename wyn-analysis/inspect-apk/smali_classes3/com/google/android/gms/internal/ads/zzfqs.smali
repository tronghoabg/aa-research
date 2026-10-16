.class final synthetic Lcom/google/android/gms/internal/ads/zzfqs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfqt;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfqj;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfqt;Lcom/google/android/gms/internal/ads/zzfqj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqs;->zza:Lcom/google/android/gms/internal/ads/zzfqt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfqs;->zzb:Lcom/google/android/gms/internal/ads/zzfqj;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqs;->zza:Lcom/google/android/gms/internal/ads/zzfqt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfqs;->zzb:Lcom/google/android/gms/internal/ads/zzfqj;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfqt;->zzc(Lcom/google/android/gms/internal/ads/zzfqj;)V

    return-void
.end method
