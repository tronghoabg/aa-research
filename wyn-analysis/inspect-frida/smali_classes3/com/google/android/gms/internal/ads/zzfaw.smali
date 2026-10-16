.class public final Lcom/google/android/gms/internal/ads/zzfaw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# static fields
.field private static zzc:Ljava/lang/String;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzb:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhcp;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfaw;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfaw;->zzb:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfav;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfav;-><init>(Lcom/google/android/gms/internal/ads/zzfaw;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfaw;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x1b

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfax;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzgq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 2
    .line 3
    sget-object v1, LD6/s;->e:LD6/s;

    .line 4
    .line 5
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzgz:Lcom/google/android/gms/internal/ads/zzbio;

    .line 20
    .line 21
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfaw;->zzc:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfaw;->zzb:Landroid/content/Context;

    .line 40
    .line 41
    sget-object v1, LC6/n;->D:LC6/n;

    .line 42
    .line 43
    iget-object v1, v1, LC6/n;->y:Lcom/google/android/gms/internal/ads/zzelp;

    .line 44
    .line 45
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzelq;->zzb(Landroid/content/Context;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfaw;->zzc:Ljava/lang/String;

    .line 50
    .line 51
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfax;

    .line 52
    .line 53
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfaw;->zzc:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfax;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfaw;->zzb:Landroid/content/Context;

    .line 60
    .line 61
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfax;

    .line 62
    .line 63
    sget-object v2, LC6/n;->D:LC6/n;

    .line 64
    .line 65
    iget-object v2, v2, LC6/n;->y:Lcom/google/android/gms/internal/ads/zzelp;

    .line 66
    .line 67
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzelq;->zzb(Landroid/content/Context;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzfax;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfax;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfax;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method
