.class final synthetic Lcom/google/android/gms/internal/ads/zzgrm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgry;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgsf;

.field private final synthetic zzc:I

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzgsd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgry;Lcom/google/android/gms/internal/ads/zzgsf;ILcom/google/android/gms/internal/ads/zzgsd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zza:Lcom/google/android/gms/internal/ads/zzgry;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzb:Lcom/google/android/gms/internal/ads/zzgsf;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzc:I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzd:Lcom/google/android/gms/internal/ads/zzgsd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zza:Lcom/google/android/gms/internal/ads/zzgry;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzb:Lcom/google/android/gms/internal/ads/zzgsf;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzc:I

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zzd:Lcom/google/android/gms/internal/ads/zzgsd;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgry;->zzg(Lcom/google/android/gms/internal/ads/zzgsf;ILcom/google/android/gms/internal/ads/zzgsd;)V

    return-void
.end method
