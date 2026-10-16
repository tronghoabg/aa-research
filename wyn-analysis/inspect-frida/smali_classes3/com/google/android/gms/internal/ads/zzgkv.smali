.class final synthetic Lcom/google/android/gms/internal/ads/zzgkv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgti;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgkz;

.field private final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgkz;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgkv;->zza:Lcom/google/android/gms/internal/ads/zzgkz;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzgkv;->zzb:I

    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgkv;->zza:Lcom/google/android/gms/internal/ads/zzgkz;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzgkv;->zzb:I

    check-cast p1, Lcom/google/android/gms/internal/ads/zzgkk;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzgkz;->zzf(ILcom/google/android/gms/internal/ads/zzgkk;)Lcom/google/android/gms/internal/ads/zzgky;

    move-result-object p1

    return-object p1
.end method
