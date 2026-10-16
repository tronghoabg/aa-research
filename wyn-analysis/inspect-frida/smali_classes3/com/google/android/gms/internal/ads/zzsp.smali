.class final synthetic Lcom/google/android/gms/internal/ads/zzsp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzss;

.field private final synthetic zzb:Landroid/media/AudioRouting;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzss;Landroid/media/AudioRouting;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Lcom/google/android/gms/internal/ads/zzss;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Landroid/media/AudioRouting;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zza:Lcom/google/android/gms/internal/ads/zzss;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzb:Landroid/media/AudioRouting;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzss;->zzb(Landroid/media/AudioRouting;)V

    return-void
.end method
