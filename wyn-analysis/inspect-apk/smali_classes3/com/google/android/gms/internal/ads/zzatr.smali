.class public final Lcom/google/android/gms/internal/ads/zzatr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Ljava/lang/Object;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzasu;

.field public final zzc:Lcom/google/android/gms/internal/ads/zzatu;

.field public zzd:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzatu;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzd:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzatr;->zza:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzb:Lcom/google/android/gms/internal/ads/zzasu;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzc:Lcom/google/android/gms/internal/ads/zzatu;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzasu;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzd:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzatr;->zza:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzb:Lcom/google/android/gms/internal/ads/zzasu;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzc:Lcom/google/android/gms/internal/ads/zzatu;

    return-void
.end method

.method public static zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzasu;)Lcom/google/android/gms/internal/ads/zzatr;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzatr;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzatr;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzasu;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzatu;)Lcom/google/android/gms/internal/ads/zzatr;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzatr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzatr;-><init>(Lcom/google/android/gms/internal/ads/zzatu;)V

    return-object v0
.end method


# virtual methods
.method public final zzc()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzatr;->zzc:Lcom/google/android/gms/internal/ads/zzatu;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
