.class public final Lcom/google/android/gms/internal/ads/zzfsd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:LH6/s;

.field private final zzb:LH6/p;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzhcq;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfse;

.field private final zze:Lcom/google/android/gms/internal/ads/zzcnn;


# direct methods
.method public constructor <init>(LH6/s;LH6/p;Lcom/google/android/gms/internal/ads/zzhcq;Lcom/google/android/gms/internal/ads/zzfse;Lcom/google/android/gms/internal/ads/zzcnn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zza:LH6/s;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:LH6/p;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhcq;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzd:Lcom/google/android/gms/internal/ads/zzfse;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzcnn;

    .line 13
    .line 14
    return-void
.end method

.method private final zze(Ljava/lang/String;JI)Lp8/p;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zza:LH6/s;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, LH6/k;

    .line 5
    .line 6
    iget v1, v1, LH6/k;->a:I

    .line 7
    .line 8
    if-le p4, v1, :cond_1

    .line 9
    .line 10
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzd:Lcom/google/android/gms/internal/ads/zzfse;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    check-cast v0, LH6/k;

    .line 15
    .line 16
    iget-boolean p3, v0, LH6/k;->d:Z

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    const-string p3, ""

    .line 21
    .line 22
    const/4 p4, 0x2

    .line 23
    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzfse;->zza(Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, LH6/o;->d:LH6/o;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    sget-object p1, LH6/o;->c:LH6/o;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzjW:Lcom/google/android/gms/internal/ads/zzbio;

    .line 41
    .line 42
    sget-object v1, LD6/s;->e:LD6/s;

    .line 43
    .line 44
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "pa"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    new-instance v4, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    add-int/2addr v2, v3

    .line 108
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 109
    .line 110
    .line 111
    const-string v2, "&"

    .line 112
    .line 113
    invoke-static {v4, v0, v2, v1}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-object v0, p1

    .line 119
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfsc;

    .line 120
    .line 121
    move-object v2, p0

    .line 122
    move-object v6, p1

    .line 123
    move-wide v4, p2

    .line 124
    move v3, p4

    .line 125
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzfsc;-><init>(Lcom/google/android/gms/internal/ads/zzfsd;IJLjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-wide/16 p1, 0x0

    .line 129
    .line 130
    cmp-long p1, v4, p1

    .line 131
    .line 132
    if-nez p1, :cond_3

    .line 133
    .line 134
    iget-object p1, v2, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhcq;

    .line 135
    .line 136
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfsb;

    .line 137
    .line 138
    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/ads/zzfsb;-><init>(Lcom/google/android/gms/internal/ads/zzfsd;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-static {p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzj(Lp8/p;Lcom/google/android/gms/internal/ads/zzhbn;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    return-object p1

    .line 150
    :cond_3
    iget-object p1, v2, Lcom/google/android/gms/internal/ads/zzfsd;->zzc:Lcom/google/android/gms/internal/ads/zzhcq;

    .line 151
    .line 152
    new-instance p2, Lcom/google/android/gms/internal/ads/zzfsa;

    .line 153
    .line 154
    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/ads/zzfsa;-><init>(Lcom/google/android/gms/internal/ads/zzfsd;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 158
    .line 159
    invoke-interface {p1, p2, v4, v5, p3}, Lcom/google/android/gms/internal/ads/zzhcq;->zze(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/zzhco;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzj(Lp8/p;Lcom/google/android/gms/internal/ads/zzhbn;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1
.end method

.method private final zzf(Ljava/lang/String;)LH6/o;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzko:Lcom/google/android/gms/internal/ads/zzbio;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zze:Lcom/google/android/gms/internal/ads/zzcnn;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    sget-object v2, LC6/n;->D:LC6/n;

    .line 24
    .line 25
    iget-object v3, v2, LC6/n;->c:LG6/U;

    .line 26
    .line 27
    invoke-virtual {v3, p1}, LG6/U;->F(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, LC6/n;->c:LG6/U;

    .line 34
    .line 35
    invoke-virtual {v2, p1}, LG6/U;->G(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcnn;->zzb()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v2, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzkp:Lcom/google/android/gms/internal/ads/zzbio;

    .line 53
    .line 54
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:LH6/p;

    .line 66
    .line 67
    invoke-virtual {v0, v2, p1}, LH6/p;->a(Ljava/util/HashMap;Ljava/lang/String;)LH6/o;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zzb:LH6/p;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v0, v1, p1}, LH6/p;->a(Ljava/util/HashMap;Ljava/lang/String;)LH6/o;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lp8/p;
    .locals 4

    .line 1
    sget-object v0, LH6/o;->b:LH6/o;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzg:Lcom/google/android/gms/internal/ads/zzbio;

    .line 6
    .line 7
    sget-object v2, LD6/s;->e:LD6/s;

    .line 8
    .line 9
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    :try_start_0
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfsd;->zze(Ljava/lang/String;JI)Lp8/p;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return-object p1

    .line 38
    :catch_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final zzb(IJLjava/lang/String;LH6/o;)Lp8/p;
    .locals 3

    .line 1
    sget-object v0, LH6/o;->c:LH6/o;

    .line 2
    .line 3
    if-eq p5, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p5}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzfsd;->zza:LH6/s;

    .line 11
    .line 12
    move-object v0, p5

    .line 13
    check-cast v0, LH6/k;

    .line 14
    .line 15
    iget v0, v0, LH6/k;->b:I

    .line 16
    .line 17
    int-to-long v0, v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eq p1, v2, :cond_1

    .line 20
    .line 21
    long-to-double p2, p2

    .line 22
    check-cast p5, LH6/k;

    .line 23
    .line 24
    iget-wide v0, p5, LH6/k;->c:D

    .line 25
    .line 26
    mul-double/2addr v0, p2

    .line 27
    double-to-long v0, v0

    .line 28
    :cond_1
    add-int/2addr p1, v2

    .line 29
    invoke-direct {p0, p4, v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfsd;->zze(Ljava/lang/String;JI)Lp8/p;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final synthetic zzc(Ljava/lang/String;)LH6/o;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfsd;->zzf(Ljava/lang/String;)LH6/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final synthetic zzd(Ljava/lang/String;)LH6/o;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzfsd;->zzf(Ljava/lang/String;)LH6/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
