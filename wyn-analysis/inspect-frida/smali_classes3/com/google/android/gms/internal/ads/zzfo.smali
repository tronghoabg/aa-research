.class final synthetic Lcom/google/android/gms/internal/ads/zzfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfs;

.field private final synthetic zzb:Z

.field private final synthetic zzc:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfs;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfo;->zza:Lcom/google/android/gms/internal/ads/zzfs;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzfo;->zzb:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzfo;->zzc:Z

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfo;->zza:Lcom/google/android/gms/internal/ads/zzfs;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfo;->zzb:Z

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzfo;->zzc:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfs;->zze(ZZ)V

    return-void
.end method
