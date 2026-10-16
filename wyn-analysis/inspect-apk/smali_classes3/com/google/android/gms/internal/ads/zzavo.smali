.class public final Lcom/google/android/gms/internal/ads/zzavo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final synthetic zza:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzavo;->zza:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I[I)Lcom/google/android/gms/internal/ads/zzavl;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzavo;->zza:I

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzavm;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzavm;-><init>()V

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzavp;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzavp;-><init>(I[I)V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzavn;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzavn;-><init>(Lcom/google/android/gms/internal/ads/zzavp;)V

    return-object p1
.end method
