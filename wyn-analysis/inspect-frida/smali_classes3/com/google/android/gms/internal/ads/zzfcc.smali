.class public final Lcom/google/android/gms/internal/ads/zzfcc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzceg;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzc:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzceg;Lcom/google/android/gms/internal/ads/zzhcp;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zza:Lcom/google/android/gms/internal/ads/zzceg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zzb:Lcom/google/android/gms/internal/ads/zzhcp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zzc:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfcb;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfcb;-><init>(Lcom/google/android/gms/internal/ads/zzfcc;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zzb:Lcom/google/android/gms/internal/ads/zzhcp;

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

    const/16 v0, 0x22

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfcd;
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zza:Lcom/google/android/gms/internal/ads/zzceg;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcc;->zzc:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzceg;->zzb(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfcd;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzfcd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 19
    .line 20
    .line 21
    return-object v3

    .line 22
    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzceg;->zzi(Landroid/content/Context;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, ""

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    move-object v5, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v5, v2

    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzceg;->zzj(Landroid/content/Context;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    move-object v6, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v6, v2

    .line 42
    :goto_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzceg;->zzk(Landroid/content/Context;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_3

    .line 47
    .line 48
    move-object v7, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move-object v7, v2

    .line 51
    :goto_2
    const/4 v2, 0x1

    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzceg;->zzb(Landroid/content/Context;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x0

    .line 57
    if-eq v2, v0, :cond_4

    .line 58
    .line 59
    move-object v0, v1

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const-string v0, "fa"

    .line 62
    .line 63
    :goto_3
    const-string v2, "TIME_OUT"

    .line 64
    .line 65
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzba:Lcom/google/android/gms/internal/ads/zzbio;

    .line 72
    .line 73
    sget-object v2, LD6/s;->e:LD6/s;

    .line 74
    .line 75
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/lang/Long;

    .line 82
    .line 83
    :cond_5
    move-object v9, v1

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    move-object v8, v3

    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move-object v8, v0

    .line 89
    :goto_4
    new-instance v4, Lcom/google/android/gms/internal/ads/zzfcd;

    .line 90
    .line 91
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzfcd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 92
    .line 93
    .line 94
    return-object v4
.end method
