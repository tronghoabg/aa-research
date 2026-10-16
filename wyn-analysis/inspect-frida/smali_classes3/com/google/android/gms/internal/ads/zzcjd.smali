.class final Lcom/google/android/gms/internal/ads/zzcjd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Ljava/lang/String;

.field final synthetic zzc:I

.field final synthetic zzd:I

.field final synthetic zze:J

.field final synthetic zzf:J

.field final synthetic zzg:Z

.field final synthetic zzh:I

.field final synthetic zzi:I

.field final synthetic zzj:Lcom/google/android/gms/internal/ads/zzcjh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcjh;Ljava/lang/String;Ljava/lang/String;IIJJZII)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzc:I

    .line 6
    .line 7
    iput p5, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzd:I

    .line 8
    .line 9
    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zze:J

    .line 10
    .line 11
    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzf:J

    .line 12
    .line 13
    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzg:Z

    .line 14
    .line 15
    iput p11, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzh:I

    .line 16
    .line 17
    iput p12, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzi:I

    .line 18
    .line 19
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzj:Lcom/google/android/gms/internal/ads/zzcjh;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    const-string v1, "precacheProgress"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "src"

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zza:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const-string v1, "cachedSrc"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzb:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzc:I

    .line 24
    .line 25
    const-string v2, "bytesLoaded"

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzd:I

    .line 35
    .line 36
    const-string v2, "totalBytes"

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zze:J

    .line 46
    .line 47
    const-string v3, "bufferedDuration"

    .line 48
    .line 49
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzf:J

    .line 57
    .line 58
    const-string v3, "totalDuration"

    .line 59
    .line 60
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzg:Z

    .line 69
    .line 70
    if-eq v1, v2, :cond_0

    .line 71
    .line 72
    const-string v1, "0"

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const-string v1, "1"

    .line 76
    .line 77
    :goto_0
    const-string v2, "cacheReady"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzh:I

    .line 83
    .line 84
    const-string v2, "playerCount"

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzi:I

    .line 94
    .line 95
    const-string v2, "playerPreparedCount"

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjd;->zzj:Lcom/google/android/gms/internal/ads/zzcjh;

    .line 105
    .line 106
    const-string v2, "onPrecacheEvent"

    .line 107
    .line 108
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzw(Ljava/lang/String;Ljava/util/Map;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method
