.class public final Lcom/google/android/gms/internal/ads/zzewq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzb:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhcp;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzewq;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzewq;->zzb:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzewp;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzewp;-><init>(Lcom/google/android/gms/internal/ads/zzewq;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzewq;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

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

    const/16 v0, 0xd

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzewr;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzewq;->zzb:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "audio"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/media/AudioManager;

    .line 10
    .line 11
    sget-object v1, LC6/n;->D:LC6/n;

    .line 12
    .line 13
    iget-object v2, v1, LC6/n;->i:LG6/a;

    .line 14
    .line 15
    invoke-virtual {v2}, LG6/a;->b()F

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget-object v2, v1, LC6/n;->i:LG6/a;

    .line 20
    .line 21
    invoke-virtual {v2}, LG6/a;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    new-instance v3, Lcom/google/android/gms/internal/ads/zzewr;

    .line 28
    .line 29
    const/4 v9, -0x1

    .line 30
    const/4 v10, -0x1

    .line 31
    const/4 v4, -0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, -0x1

    .line 35
    const/4 v8, -0x1

    .line 36
    const/4 v11, -0x1

    .line 37
    const/4 v14, 0x1

    .line 38
    invoke-direct/range {v3 .. v14}, Lcom/google/android/gms/internal/ads/zzewr;-><init>(IZZIIIIIFZZ)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/4 v2, 0x3

    .line 55
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzmE:Lcom/google/android/gms/internal/ads/zzbio;

    .line 60
    .line 61
    sget-object v8, LD6/s;->e:LD6/s;

    .line 62
    .line 63
    iget-object v8, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 64
    .line 65
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    iget-object v1, v1, LC6/n;->f:LG6/V;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, LG6/b0;->f(Landroid/media/AudioManager;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    move v8, v1

    .line 88
    move v9, v2

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const/4 v1, -0x1

    .line 91
    move v8, v1

    .line 92
    move v9, v8

    .line 93
    :goto_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    const/4 v1, 0x2

    .line 98
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    new-instance v3, Lcom/google/android/gms/internal/ads/zzewr;

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    invoke-direct/range {v3 .. v14}, Lcom/google/android/gms/internal/ads/zzewr;-><init>(IZZIIIIIFZZ)V

    .line 106
    .line 107
    .line 108
    return-object v3
.end method
