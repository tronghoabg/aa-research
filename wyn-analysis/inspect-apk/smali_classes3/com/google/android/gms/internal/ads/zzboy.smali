.class final Lcom/google/android/gms/internal/ads/zzboy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbpx;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzclb;

    .line 2
    .line 3
    sget-object p1, LC6/n;->D:LC6/n;

    .line 4
    .line 5
    iget-object p1, p1, LC6/n;->s:LF6/r;

    .line 6
    .line 7
    iget-boolean p2, p1, LF6/r;->b:Z

    .line 8
    .line 9
    if-eqz p2, :cond_3

    .line 10
    .line 11
    iget-object p2, p1, LF6/r;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Lcom/google/android/gms/internal/ads/zzgrg;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgrf;->zzc()Lcom/google/android/gms/internal/ads/zzgre;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zznh:Lcom/google/android/gms/internal/ads/zzbio;

    .line 23
    .line 24
    sget-object v2, LD6/s;->e:LD6/s;

    .line 25
    .line 26
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p1, LF6/r;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    iget-object v1, p1, LF6/r;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgre;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgre;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v1, p1, LF6/r;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgre;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgre;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string v1, "Missing session token and/or appId"

    .line 69
    .line 70
    const-string v2, "onLMDupdate"

    .line 71
    .line 72
    invoke-virtual {p1, v1, v2}, LF6/r;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgre;->zzc()Lcom/google/android/gms/internal/ads/zzgrf;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object p1, p1, LF6/r;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, LS3/l;

    .line 82
    .line 83
    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzgrg;->zzb(Lcom/google/android/gms/internal/ads/zzgrf;Lcom/google/android/gms/internal/ads/zzgsd;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    :goto_1
    const-string p1, "LastMileDelivery not connected"

    .line 88
    .line 89
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
