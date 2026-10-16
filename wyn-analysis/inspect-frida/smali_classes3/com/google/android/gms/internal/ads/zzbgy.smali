.class public final Lcom/google/android/gms/internal/ads/zzbgy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:LD6/L;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/String;

.field private final zzd:LD6/Q0;

.field private final zze:Lz6/a;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbvf;

.field private final zzg:LD6/w1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LD6/Q0;Lz6/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzf:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzb:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzc:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzd:LD6/Q0;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zze:Lz6/a;

    .line 18
    .line 19
    sget-object p1, LD6/w1;->a:LD6/w1;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzg:LD6/w1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 8

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, LD6/x1;->W()LD6/x1;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    sget-object v2, LD6/q;->g:LD6/q;

    .line 10
    .line 11
    iget-object v3, v2, LD6/q;->b:LD6/o;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzb:Landroid/content/Context;

    .line 14
    .line 15
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzc:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzf:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v2, LD6/i;

    .line 23
    .line 24
    invoke-direct/range {v2 .. v7}, LD6/i;-><init>(LD6/o;Landroid/content/Context;LD6/x1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v2, v4, v3}, LD6/p;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, LD6/L;

    .line 33
    .line 34
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zza:LD6/L;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzd:LD6/Q0;

    .line 39
    .line 40
    iput-wide v0, v3, LD6/Q0;->n:J

    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbgl;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zze:Lz6/a;

    .line 45
    .line 46
    invoke-direct {v0, v1, v6}, Lcom/google/android/gms/internal/ads/zzbgl;-><init>(Lz6/a;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v0}, LD6/L;->zzJ(Lcom/google/android/gms/internal/ads/zzbgt;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zza:LD6/L;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbgy;->zzg:LD6/w1;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v3}, LD6/w1;->a(Landroid/content/Context;LD6/Q0;)LD6/v1;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v0, v1}, LD6/L;->zze(LD6/v1;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-void

    .line 70
    :goto_0
    const-string v1, "#007 Could not call remote method."

    .line 71
    .line 72
    invoke-static {v1, v0}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
