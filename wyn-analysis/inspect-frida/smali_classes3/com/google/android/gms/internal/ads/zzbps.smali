.class final synthetic Lcom/google/android/gms/internal/ads/zzbps;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbpx;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzbps;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbps;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbps;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbps;->zza:Lcom/google/android/gms/internal/ads/zzbps;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcmn;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbpw;->zza:Lcom/google/android/gms/internal/ads/zzbpx;

    .line 4
    .line 5
    const-string v0, "u"

    .line 6
    .line 7
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget p1, LG6/L;->b:I

    .line 16
    .line 17
    const-string p1, "URL missing from httpTrack GMSG."

    .line 18
    .line 19
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzg:Lcom/google/android/gms/internal/ads/zzbio;

    .line 24
    .line 25
    sget-object v1, LD6/s;->e:LD6/s;

    .line 26
    .line 27
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    sget p1, LG6/L;->b:I

    .line 48
    .line 49
    const-string p1, "URL is empty from httpTrack GMSG."

    .line 50
    .line 51
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object v0, p1

    .line 56
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcks;

    .line 57
    .line 58
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcks;->zzC()Lcom/google/android/gms/internal/ads/zzfkn;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcks;->zzC()Lcom/google/android/gms/internal/ads/zzfkn;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfkn;->zzax:LH6/q;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    :goto_0
    new-instance v1, LG6/B;

    .line 73
    .line 74
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcmn;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcmv;

    .line 79
    .line 80
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcmv;->zzs()LH6/a;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, LH6/a;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {v1, v2, p1, p2, v0}, LG6/B;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LH6/q;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, LG6/p;->zzb()Lp8/p;

    .line 90
    .line 91
    .line 92
    return-void
.end method
