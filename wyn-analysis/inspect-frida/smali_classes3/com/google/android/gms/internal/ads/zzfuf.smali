.class final synthetic Lcom/google/android/gms/internal/ads/zzfuf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzful;

.field private final synthetic zzb:I

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzftw;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzftw;

.field private final synthetic zze:J

.field private final synthetic zzf:I

.field private final synthetic zzg:I

.field private final synthetic zzh:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzful;ILcom/google/android/gms/internal/ads/zzftw;Lcom/google/android/gms/internal/ads/zzftw;JIIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zza:Lcom/google/android/gms/internal/ads/zzful;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzc:Lcom/google/android/gms/internal/ads/zzftw;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzd:Lcom/google/android/gms/internal/ads/zzftw;

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zze:J

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzf:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzg:I

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzh:Z

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zza:Lcom/google/android/gms/internal/ads/zzful;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzc:Lcom/google/android/gms/internal/ads/zzftw;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzd:Lcom/google/android/gms/internal/ads/zzftw;

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zze:J

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzf:I

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzg:I

    iget-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzfuf;->zzh:Z

    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzful;->zzD(ILcom/google/android/gms/internal/ads/zzftw;Lcom/google/android/gms/internal/ads/zzftw;JIIZ)V

    return-void
.end method
