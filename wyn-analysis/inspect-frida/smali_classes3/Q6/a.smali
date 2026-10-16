.class public final LQ6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD6/c1;


# direct methods
.method public constructor <init>(LD6/c1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ6/a;->a:LD6/c1;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Landroid/content/Context;Lx6/b;Lx6/g;LQ6/b;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zzj:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 19
    .line 20
    sget-object v1, LD6/s;->e:LD6/s;

    .line 21
    .line 22
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, LH6/c;->b:Ljava/util/concurrent/ExecutorService;

    .line 37
    .line 38
    new-instance v1, LA7/W0;

    .line 39
    .line 40
    const/16 v6, 0x8

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    move-object v2, p0

    .line 44
    move-object v3, p1

    .line 45
    move-object v4, p2

    .line 46
    move-object v5, p3

    .line 47
    invoke-direct/range {v1 .. v7}, LA7/W0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    move-object v2, p0

    .line 55
    move-object v3, p1

    .line 56
    move-object v4, p2

    .line 57
    move-object v5, p3

    .line 58
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbzz;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    move-object p2, p1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object p2, v4, Lx6/g;->a:LD6/Q0;

    .line 66
    .line 67
    :goto_0
    invoke-direct {p0, v2, v3, p2, p1}, Lcom/google/android/gms/internal/ads/zzbzz;-><init>(Landroid/content/Context;Lx6/b;LD6/Q0;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzbzz;->zzb(LQ6/b;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
