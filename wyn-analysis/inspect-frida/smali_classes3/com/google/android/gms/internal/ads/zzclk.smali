.class final synthetic Lcom/google/android/gms/internal/ads/zzclk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzclm;

.field private final synthetic zzb:Landroid/view/View;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcdu;

.field private final synthetic zzd:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzclm;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzcdu;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzclk;->zza:Lcom/google/android/gms/internal/ads/zzclm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzb:Landroid/view/View;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzc:Lcom/google/android/gms/internal/ads/zzcdu;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzd:I

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzclk;->zza:Lcom/google/android/gms/internal/ads/zzclm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzb:Landroid/view/View;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzc:Lcom/google/android/gms/internal/ads/zzcdu;

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzclk;->zzd:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzclm;->zzU(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzcdu;I)V

    return-void
.end method
