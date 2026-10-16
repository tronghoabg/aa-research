.class final synthetic Lcom/google/android/gms/internal/ads/zzjp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzguj;


# instance fields
.field private final synthetic zza:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzjp;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzjv;->zzA:I

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzwy;

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzafw;

    .line 6
    .line 7
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzafw;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzjp;->zza:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzwy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzagg;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
