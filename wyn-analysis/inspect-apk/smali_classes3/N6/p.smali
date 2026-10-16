.class public final LN6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzini;

.field public final b:LG6/H;

.field public final c:Lcom/google/android/gms/internal/ads/zzdcf;

.field public final d:Lcom/google/android/gms/internal/ads/zzini;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzini;LG6/H;Lcom/google/android/gms/internal/ads/zzdcf;Lcom/google/android/gms/internal/ads/zzini;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN6/p;->a:Lcom/google/android/gms/internal/ads/zzini;

    .line 5
    .line 6
    iput-object p2, p0, LN6/p;->b:LG6/H;

    .line 7
    .line 8
    iput-object p3, p0, LN6/p;->c:Lcom/google/android/gms/internal/ads/zzdcf;

    .line 9
    .line 10
    iput-object p4, p0, LN6/p;->d:Lcom/google/android/gms/internal/ads/zzini;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LN6/p;->a:Lcom/google/android/gms/internal/ads/zzini;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfps;

    .line 8
    .line 9
    iget-object v1, p0, LN6/p;->b:LG6/H;

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoi;->zzc()Lcom/google/android/gms/internal/ads/zzhcp;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v1, v1, LG6/H;->b:Lcom/google/android/gms/internal/ads/zzimz;

    .line 16
    .line 17
    check-cast v1, Lcom/google/android/gms/internal/ads/zzefo;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzefo;->zza()Lcom/google/android/gms/internal/ads/zzefn;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v3, LN6/r;

    .line 24
    .line 25
    invoke-direct {v3, v2, v1}, LN6/r;-><init>(Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzefn;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LN6/p;->c:Lcom/google/android/gms/internal/ads/zzdcf;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdcf;->zza()Lcom/google/android/gms/internal/ads/zzdce;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, LN6/p;->d:Lcom/google/android/gms/internal/ads/zzini;

    .line 35
    .line 36
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/google/android/gms/internal/ads/zzdlv;

    .line 41
    .line 42
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfpm;->zzw:Lcom/google/android/gms/internal/ads/zzfpm;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdce;->zzb()Lp8/p;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/ads/zzfpk;->zza(Ljava/lang/Object;Lp8/p;)Lcom/google/android/gms/internal/ads/zzfpj;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfpj;->zzc(Lcom/google/android/gms/internal/ads/zzhbn;)Lcom/google/android/gms/internal/ads/zzfpj;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzgJ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 57
    .line 58
    sget-object v3, LD6/s;->e:LD6/s;

    .line 59
    .line 60
    iget-object v3, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 61
    .line 62
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/Integer;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    int-to-long v3, v1

    .line 73
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v4, v1}, Lcom/google/android/gms/internal/ads/zzfpj;->zzh(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/zzfpj;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpj;->zzi()Lcom/google/android/gms/internal/ads/zzfoz;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lxa/d;

    .line 84
    .line 85
    const/16 v3, 0x12

    .line 86
    .line 87
    invoke-direct {v1, v2, v3}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhcf;->zzr(Lp8/p;Lcom/google/android/gms/internal/ads/zzhcc;Ljava/util/concurrent/Executor;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method
