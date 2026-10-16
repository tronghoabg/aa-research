.class final synthetic Lcom/google/android/gms/internal/ads/zzfn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfs;

.field private final synthetic zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final synthetic zzc:Z

.field private final synthetic zzd:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfs;Ljava/util/concurrent/atomic/AtomicBoolean;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfn;->zza:Lcom/google/android/gms/internal/ads/zzfs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzc:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Z

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfn;->zza:Lcom/google/android/gms/internal/ads/zzfs;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzc:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzfn;->zzd:Z

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfs;->zzd(Ljava/util/concurrent/atomic/AtomicBoolean;ZZ)V

    return-void
.end method
