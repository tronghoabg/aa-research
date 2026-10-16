.class final synthetic Lcom/google/android/gms/internal/ads/zzaem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzaeq;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzjd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaeq;Lcom/google/android/gms/internal/ads/zzjd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaem;->zza:Lcom/google/android/gms/internal/ads/zzaeq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaem;->zzb:Lcom/google/android/gms/internal/ads/zzjd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaem;->zza:Lcom/google/android/gms/internal/ads/zzaeq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaem;->zzb:Lcom/google/android/gms/internal/ads/zzjd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaeq;->zzt(Lcom/google/android/gms/internal/ads/zzjd;)V

    return-void
.end method
