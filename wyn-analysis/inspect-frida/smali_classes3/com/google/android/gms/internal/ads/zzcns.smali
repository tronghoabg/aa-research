.class public final Lcom/google/android/gms/internal/ads/zzcns;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:LH6/a;

.field private final zzb:Landroid/content/Context;

.field private final zzc:J

.field private final zzd:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcnr;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcnr;->zzd()LH6/a;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zza:LH6/a;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcnr;->zze()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcnr;->zzg()Ljava/lang/ref/WeakReference;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzd:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcnr;->zzf()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzc:J

    return-void
.end method


# virtual methods
.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    return-object v0
.end method

.method public final zzb()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    return-object v0
.end method

.method public final zzc()Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzd:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final zzd()LH6/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcns;->zza:LH6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 2
    .line 3
    iget-object v0, v0, LC6/n;->c:LG6/U;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcns;->zza:LH6/a;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, v1, LH6/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, LG6/U;->E(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzcnp;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcnp;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zza:LH6/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcnp;-><init>(Landroid/content/Context;LH6/a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final zzg()LC6/f;
    .locals 3

    .line 1
    new-instance v0, LC6/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcns;->zza:LH6/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LC6/f;-><init>(Landroid/content/Context;LH6/a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/ads/zzblr;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzblr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzb:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzblr;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final zzi()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcns;->zzc:J

    return-wide v0
.end method
