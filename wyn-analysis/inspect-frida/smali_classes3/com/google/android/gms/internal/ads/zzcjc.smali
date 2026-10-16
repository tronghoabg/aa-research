.class final Lcom/google/android/gms/internal/ads/zzcjc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Ljava/lang/String;

.field final synthetic zzb:Ljava/lang/String;

.field final synthetic zzc:J

.field final synthetic zzd:J

.field final synthetic zze:J

.field final synthetic zzf:J

.field final synthetic zzg:J

.field final synthetic zzh:Z

.field final synthetic zzi:I

.field final synthetic zzj:I

.field final synthetic zzk:Lcom/google/android/gms/internal/ads/zzcjh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcjh;Ljava/lang/String;Ljava/lang/String;JJJJJZII)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzc:J

    .line 6
    .line 7
    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzd:J

    .line 8
    .line 9
    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zze:J

    .line 10
    .line 11
    iput-wide p10, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzf:J

    .line 12
    .line 13
    iput-wide p12, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzg:J

    .line 14
    .line 15
    iput-boolean p14, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzh:Z

    .line 16
    .line 17
    iput p15, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzi:I

    .line 18
    .line 19
    move/from16 p2, p16

    .line 20
    .line 21
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzj:I

    .line 22
    .line 23
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzk:Lcom/google/android/gms/internal/ads/zzcjh;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
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
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zza:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const-string v1, "cachedSrc"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzb:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzc:J

    .line 24
    .line 25
    const-string v3, "bufferedDuration"

    .line 26
    .line 27
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzd:J

    .line 35
    .line 36
    const-string v3, "totalDuration"

    .line 37
    .line 38
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzcG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 46
    .line 47
    sget-object v2, LD6/s;->e:LD6/s;

    .line 48
    .line 49
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zze:J

    .line 64
    .line 65
    const-string v3, "qoeLoadedBytes"

    .line 66
    .line 67
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzf:J

    .line 75
    .line 76
    const-string v3, "qoeCachedBytes"

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzg:J

    .line 86
    .line 87
    const-string v3, "totalBytes"

    .line 88
    .line 89
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    sget-object v1, LC6/n;->D:LC6/n;

    .line 97
    .line 98
    iget-object v1, v1, LC6/n;->k:Ln7/b;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v1

    .line 107
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "reportTime"

    .line 112
    .line 113
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_0
    const/4 v1, 0x1

    .line 117
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzh:Z

    .line 118
    .line 119
    if-eq v1, v2, :cond_1

    .line 120
    .line 121
    const-string v1, "0"

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const-string v1, "1"

    .line 125
    .line 126
    :goto_0
    const-string v2, "cacheReady"

    .line 127
    .line 128
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzi:I

    .line 132
    .line 133
    const-string v2, "playerCount"

    .line 134
    .line 135
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzj:I

    .line 143
    .line 144
    const-string v2, "playerPreparedCount"

    .line 145
    .line 146
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjc;->zzk:Lcom/google/android/gms/internal/ads/zzcjh;

    .line 154
    .line 155
    const-string v2, "onPrecacheEvent"

    .line 156
    .line 157
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzw(Ljava/lang/String;Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method
