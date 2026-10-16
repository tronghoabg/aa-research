.class public final LG6/x;
.super Lcom/google/android/gms/internal/ads/zzatl;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzcgd;

.field public final b:LH6/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcgd;)V
    .locals 3

    .line 1
    new-instance v0, LS3/l;

    .line 2
    .line 3
    invoke-direct {v0, p2}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzatl;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzatp;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, LG6/x;->a:Lcom/google/android/gms/internal/ads/zzcgd;

    .line 11
    .line 12
    new-instance p2, LH6/i;

    .line 13
    .line 14
    invoke-direct {p2}, LH6/i;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LG6/x;->b:LH6/i;

    .line 18
    .line 19
    invoke-static {}, LH6/i;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v0, LS3/n;

    .line 27
    .line 28
    const-string v1, "GET"

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p1, v1, v2, v2}, LS3/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    .line 32
    .line 33
    .line 34
    const-string p1, "onNetworkRequest"

    .line 35
    .line 36
    invoke-virtual {p2, p1, v0}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final zzr(Lcom/google/android/gms/internal/ads/zzath;)Lcom/google/android/gms/internal/ads/zzatr;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzaui;->zza(Lcom/google/android/gms/internal/ads/zzath;)Lcom/google/android/gms/internal/ads/zzasu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzatr;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzasu;)Lcom/google/android/gms/internal/ads/zzatr;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final zzs(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzath;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzath;->zzc:Ljava/util/Map;

    .line 4
    .line 5
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzath;->zza:I

    .line 6
    .line 7
    iget-object v2, p0, LG6/x;->b:LH6/i;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, LH6/i;->c()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, LA/x;

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    invoke-direct {v3, v1, v0, v4}, LA/x;-><init>(ILjava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    const-string v0, "onNetworkResponse"

    .line 26
    .line 27
    invoke-virtual {v2, v0, v3}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 28
    .line 29
    .line 30
    const/16 v0, 0xc8

    .line 31
    .line 32
    if-lt v1, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x12c

    .line 35
    .line 36
    if-lt v1, v0, :cond_2

    .line 37
    .line 38
    :cond_1
    new-instance v0, LH6/g;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v0, v1, v3}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    const-string v1, "onNetworkRequestError"

    .line 46
    .line 47
    invoke-virtual {v2, v1, v0}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzath;->zzb:[B

    .line 51
    .line 52
    invoke-static {}, LH6/i;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    new-instance v1, LS3/l;

    .line 62
    .line 63
    invoke-direct {v1, v0}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "onNetworkResponseBody"

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    :goto_1
    iget-object v0, p0, LG6/x;->a:Lcom/google/android/gms/internal/ads/zzcgd;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcgd;->zzc(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    return-void
.end method
