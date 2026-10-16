.class final synthetic Lcom/google/android/gms/internal/ads/zzhbf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzhbh;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgwp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhbh;Lcom/google/android/gms/internal/ads/zzgwp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhbf;->zza:Lcom/google/android/gms/internal/ads/zzhbh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhbf;->zzb:Lcom/google/android/gms/internal/ads/zzgwp;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhbf;->zza:Lcom/google/android/gms/internal/ads/zzhbh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhbf;->zzb:Lcom/google/android/gms/internal/ads/zzgwp;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhbh;->zzz(Lcom/google/android/gms/internal/ads/zzgwp;)V

    return-void
.end method
