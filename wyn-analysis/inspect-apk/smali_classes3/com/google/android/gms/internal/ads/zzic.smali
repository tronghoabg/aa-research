.class public final Lcom/google/android/gms/internal/ads/zzic;
.super Lcom/google/android/gms/internal/ads/zzhj;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzik;


# instance fields
.field private final zza:Z

.field private final zzb:I

.field private final zzc:I

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/ads/zzij;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzij;

.field private zzg:Lcom/google/android/gms/internal/ads/zzhv;

.field private zzh:Ljava/net/HttpURLConnection;

.field private zzi:Ljava/io/InputStream;

.field private zzj:Z

.field private zzk:I

.field private zzl:J

.field private zzm:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IIZZLcom/google/android/gms/internal/ads/zzij;Lcom/google/android/gms/internal/ads/zzgts;Z[B)V
    .locals 0

    .line 1
    const/4 p5, 0x1

    .line 2
    invoke-direct {p0, p5}, Lcom/google/android/gms/internal/ads/zzhj;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzd:Ljava/lang/String;

    .line 6
    .line 7
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzb:I

    .line 8
    .line 9
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzic;->zzc:I

    .line 10
    .line 11
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzic;->zza:Z

    .line 12
    .line 13
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzic;->zze:Lcom/google/android/gms/internal/ads/zzij;

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzij;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzij;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzf:Lcom/google/android/gms/internal/ads/zzij;

    .line 21
    .line 22
    return-void
.end method

.method private final zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzb:I

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzc:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzic;->zze:Lcom/google/android/gms/internal/ads/zzij;

    .line 23
    .line 24
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzij;->zza()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzic;->zzf:Lcom/google/android/gms/internal/ads/zzij;

    .line 32
    .line 33
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzij;->zza()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_0

    .line 56
    .line 57
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    check-cast p3, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p10

    .line 67
    check-cast p10, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, p10, p3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-wide/16 p2, 0x0

    .line 80
    .line 81
    cmp-long p10, p4, p2

    .line 82
    .line 83
    const-wide/16 v0, -0x1

    .line 84
    .line 85
    if-nez p10, :cond_2

    .line 86
    .line 87
    cmp-long p4, p6, v0

    .line 88
    .line 89
    if-nez p4, :cond_1

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-wide p4, p2

    .line 94
    :cond_2
    const-string p2, "bytes="

    .line 95
    .line 96
    const-string p3, "-"

    .line 97
    .line 98
    invoke-static {p4, p5, p2, p3}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    cmp-long p3, p6, v0

    .line 103
    .line 104
    if-eqz p3, :cond_3

    .line 105
    .line 106
    add-long/2addr p4, p6

    .line 107
    add-long/2addr p4, v0

    .line 108
    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    :goto_1
    if-eqz p2, :cond_4

    .line 116
    .line 117
    const-string p3, "Range"

    .line 118
    .line 119
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzd:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz p2, :cond_5

    .line 125
    .line 126
    const-string p3, "User-Agent"

    .line 127
    .line 128
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    const/4 p2, 0x1

    .line 132
    if-eq p2, p8, :cond_6

    .line 133
    .line 134
    const-string p2, "identity"

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    const-string p2, "gzip"

    .line 138
    .line 139
    :goto_2
    const-string p3, "Accept-Encoding"

    .line 140
    .line 141
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 145
    .line 146
    .line 147
    const/4 p2, 0x0

    .line 148
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 149
    .line 150
    .line 151
    sget p2, Lcom/google/android/gms/internal/ads/zzhv;->zzh:I

    .line 152
    .line 153
    const-string p2, "GET"

    .line 154
    .line 155
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 159
    .line 160
    .line 161
    return-object p1
.end method

.method private final zzl(Ljava/net/URL;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;)Ljava/net/URL;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v3, "https"

    .line 16
    .line 17
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    const-string v3, "http"

    .line 24
    .line 25
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzig;

    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v2, "Unsupported protocol redirect: "

    .line 39
    .line 40
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p1, p2, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzic;->zza:Z

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/lit8 v3, v3, 0x28

    .line 78
    .line 79
    invoke-static {v3, v1, p2}, LA7/p0;->g(IILjava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const-string v3, "Disallowed cross-protocol redirect ("

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " to "

    .line 97
    .line 98
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, ")"

    .line 105
    .line 106
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {v2, p1, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :cond_3
    :goto_1
    return-object v2

    .line 118
    :catch_0
    move-exception p1

    .line 119
    new-instance p2, Lcom/google/android/gms/internal/ads/zzig;

    .line 120
    .line 121
    invoke-direct {p2, p1, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzig;

    .line 126
    .line 127
    const-string p2, "Null location redirect"

    .line 128
    .line 129
    invoke-direct {p1, p2, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method

.method private final zzm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    const-string v1, "DefaultHttpDataSource"

    .line 11
    .line 12
    const-string v2, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzic;->zzm:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    return v3

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 34
    .line 35
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v3, :cond_3

    .line 42
    .line 43
    return v3

    .line 44
    :cond_3
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzm:J

    .line 45
    .line 46
    int-to-long v0, p1

    .line 47
    add-long/2addr p2, v0

    .line 48
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzm:J

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return p1

    .line 54
    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 55
    .line 56
    sget-object p3, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 57
    .line 58
    const/4 p3, 0x2

    .line 59
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzig;->zza(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;I)Lcom/google/android/gms/internal/ads/zzig;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhv;)J
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    const/4 v13, 0x1

    .line 6
    iput-object v12, v1, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 7
    .line 8
    const-wide/16 v14, 0x0

    .line 9
    .line 10
    iput-wide v14, v1, Lcom/google/android/gms/internal/ads/zzic;->zzm:J

    .line 11
    .line 12
    iput-wide v14, v1, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzf(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v3, 0x24

    .line 24
    .line 25
    if-ge v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    move-object v7, v1

    .line 34
    goto/16 :goto_e

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Thread;->threadId()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    :goto_0
    long-to-int v0, v2

    .line 41
    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 42
    .line 43
    .line 44
    const-string v0, "Too many redirects: "

    .line 45
    .line 46
    new-instance v2, Ljava/net/URL;

    .line 47
    .line 48
    iget-object v3, v12, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-wide v5, v12, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 58
    .line 59
    iget-wide v7, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 60
    .line 61
    invoke-virtual {v12, v13}, Lcom/google/android/gms/internal/ads/zzhv;->zza(I)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzic;->zza:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    :try_start_1
    iget-object v11, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzd:Ljava/util/Map;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    move v0, v4

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v10, 0x1

    .line 76
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzic;->zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move-object/from16 v7, p0

    .line 81
    .line 82
    move-wide/from16 v17, v14

    .line 83
    .line 84
    move v14, v0

    .line 85
    goto :goto_2

    .line 86
    :catch_1
    move-exception v0

    .line 87
    move-object/from16 v7, p0

    .line 88
    .line 89
    goto/16 :goto_e

    .line 90
    .line 91
    :cond_1
    move v1, v4

    .line 92
    :goto_1
    add-int/lit8 v3, v4, 0x1

    .line 93
    .line 94
    const/16 v10, 0x14

    .line 95
    .line 96
    if-gt v4, v10, :cond_15

    .line 97
    .line 98
    iget-object v11, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzd:Ljava/util/Map;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 99
    .line 100
    move v4, v3

    .line 101
    const/4 v3, 0x1

    .line 102
    move v10, v4

    .line 103
    const/4 v4, 0x0

    .line 104
    move/from16 v16, v10

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    move-wide/from16 v17, v14

    .line 108
    .line 109
    move/from16 v15, v16

    .line 110
    .line 111
    move v14, v1

    .line 112
    move-object/from16 v1, p0

    .line 113
    .line 114
    :try_start_2
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzic;->zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 115
    .line 116
    .line 117
    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 118
    move-object v4, v2

    .line 119
    move-wide/from16 v19, v7

    .line 120
    .line 121
    move-object v7, v1

    .line 122
    move-wide/from16 v1, v19

    .line 123
    .line 124
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    const-string v10, "Location"

    .line 129
    .line 130
    invoke-virtual {v3, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    const/16 v11, 0x12c

    .line 135
    .line 136
    if-eq v8, v11, :cond_14

    .line 137
    .line 138
    const/16 v11, 0x12d

    .line 139
    .line 140
    if-eq v8, v11, :cond_14

    .line 141
    .line 142
    const/16 v11, 0x12e

    .line 143
    .line 144
    if-eq v8, v11, :cond_14

    .line 145
    .line 146
    const/16 v11, 0x12f

    .line 147
    .line 148
    if-eq v8, v11, :cond_14

    .line 149
    .line 150
    const/16 v11, 0x133

    .line 151
    .line 152
    if-eq v8, v11, :cond_14

    .line 153
    .line 154
    const/16 v11, 0x134

    .line 155
    .line 156
    if-ne v8, v11, :cond_2

    .line 157
    .line 158
    goto/16 :goto_d

    .line 159
    .line 160
    :cond_2
    move-object v2, v3

    .line 161
    :goto_2
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 173
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 174
    .line 175
    const/16 v3, 0x7d8

    .line 176
    .line 177
    const-string v4, "Content-Range"

    .line 178
    .line 179
    const/16 v5, 0xc8

    .line 180
    .line 181
    const-wide/16 v8, -0x1

    .line 182
    .line 183
    if-lt v1, v5, :cond_f

    .line 184
    .line 185
    const/16 v6, 0x12b

    .line 186
    .line 187
    if-le v1, v6, :cond_3

    .line 188
    .line 189
    goto/16 :goto_9

    .line 190
    .line 191
    :cond_3
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    iget v0, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 195
    .line 196
    if-ne v0, v5, :cond_4

    .line 197
    .line 198
    iget-wide v0, v12, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 199
    .line 200
    cmp-long v5, v0, v17

    .line 201
    .line 202
    if-nez v5, :cond_5

    .line 203
    .line 204
    :cond_4
    move-wide/from16 v0, v17

    .line 205
    .line 206
    :cond_5
    const-string v5, "Content-Encoding"

    .line 207
    .line 208
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    const-string v6, "gzip"

    .line 213
    .line 214
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-nez v5, :cond_8

    .line 219
    .line 220
    iget-wide v10, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 221
    .line 222
    cmp-long v6, v10, v8

    .line 223
    .line 224
    if-eqz v6, :cond_6

    .line 225
    .line 226
    iput-wide v10, v7, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    const-string v6, "Content-Length"

    .line 230
    .line 231
    invoke-virtual {v2, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-static {v6, v4}, Lcom/google/android/gms/internal/ads/zzil;->zzb(Ljava/lang/String;Ljava/lang/String;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v10

    .line 243
    cmp-long v4, v10, v8

    .line 244
    .line 245
    if-eqz v4, :cond_7

    .line 246
    .line 247
    sub-long v8, v10, v0

    .line 248
    .line 249
    :cond_7
    iput-wide v8, v7, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_8
    iget-wide v8, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 253
    .line 254
    iput-wide v8, v7, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 255
    .line 256
    :goto_3
    const/16 v4, 0x7d0

    .line 257
    .line 258
    :try_start_4
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 263
    .line 264
    if-eqz v5, :cond_9

    .line 265
    .line 266
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 267
    .line 268
    iget-object v5, v7, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 269
    .line 270
    invoke-direct {v2, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 271
    .line 272
    .line 273
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :catch_2
    move-exception v0

    .line 277
    goto :goto_8

    .line 278
    :cond_9
    :goto_4
    iput-boolean v13, v7, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 279
    .line 280
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 281
    .line 282
    .line 283
    cmp-long v2, v0, v17

    .line 284
    .line 285
    if-nez v2, :cond_a

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :cond_a
    const/16 v2, 0x1000

    .line 289
    .line 290
    :try_start_5
    new-array v2, v2, [B

    .line 291
    .line 292
    :goto_5
    cmp-long v5, v0, v17

    .line 293
    .line 294
    if-lez v5, :cond_d

    .line 295
    .line 296
    const-wide/16 v5, 0x1000

    .line 297
    .line 298
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 299
    .line 300
    .line 301
    move-result-wide v5

    .line 302
    long-to-int v5, v5

    .line 303
    iget-object v6, v7, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 304
    .line 305
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v6, v2, v14, v5}, Ljava/io/InputStream;->read([BII)I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-virtual {v6}, Ljava/lang/Thread;->isInterrupted()Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-nez v6, :cond_c

    .line 320
    .line 321
    const/4 v6, -0x1

    .line 322
    if-eq v5, v6, :cond_b

    .line 323
    .line 324
    int-to-long v8, v5

    .line 325
    sub-long/2addr v0, v8

    .line 326
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :catch_3
    move-exception v0

    .line 331
    goto :goto_7

    .line 332
    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzig;

    .line 333
    .line 334
    invoke-direct {v0, v12, v3, v13}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzig;

    .line 339
    .line 340
    new-instance v1, Ljava/io/InterruptedIOException;

    .line 341
    .line 342
    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 343
    .line 344
    .line 345
    invoke-direct {v0, v1, v12, v4, v13}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 346
    .line 347
    .line 348
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 349
    :cond_d
    :goto_6
    iget-wide v0, v7, Lcom/google/android/gms/internal/ads/zzic;->zzl:J

    .line 350
    .line 351
    return-wide v0

    .line 352
    :goto_7
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 353
    .line 354
    .line 355
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzig;

    .line 356
    .line 357
    if-eqz v1, :cond_e

    .line 358
    .line 359
    check-cast v0, Lcom/google/android/gms/internal/ads/zzig;

    .line 360
    .line 361
    throw v0

    .line 362
    :cond_e
    new-instance v1, Lcom/google/android/gms/internal/ads/zzig;

    .line 363
    .line 364
    invoke-direct {v1, v0, v12, v4, v13}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 365
    .line 366
    .line 367
    throw v1

    .line 368
    :goto_8
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 369
    .line 370
    .line 371
    new-instance v1, Lcom/google/android/gms/internal/ads/zzig;

    .line 372
    .line 373
    invoke-direct {v1, v0, v12, v4, v13}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :cond_f
    :goto_9
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget v5, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 382
    .line 383
    const/16 v6, 0x1a0

    .line 384
    .line 385
    if-ne v5, v6, :cond_11

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzil;->zza(Ljava/lang/String;)J

    .line 392
    .line 393
    .line 394
    move-result-wide v4

    .line 395
    iget-wide v10, v12, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 396
    .line 397
    cmp-long v4, v10, v4

    .line 398
    .line 399
    if-nez v4, :cond_11

    .line 400
    .line 401
    iput-boolean v13, v7, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 402
    .line 403
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 404
    .line 405
    .line 406
    iget-wide v0, v12, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 407
    .line 408
    cmp-long v2, v0, v8

    .line 409
    .line 410
    if-eqz v2, :cond_10

    .line 411
    .line 412
    return-wide v0

    .line 413
    :cond_10
    return-wide v17

    .line 414
    :cond_11
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    if-eqz v2, :cond_12

    .line 419
    .line 420
    :try_start_6
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgzt;->zza(Ljava/io/InputStream;)[B

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    goto :goto_a

    .line 425
    :cond_12
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 426
    .line 427
    goto :goto_a

    .line 428
    :catch_4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B

    .line 429
    .line 430
    :goto_a
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 431
    .line 432
    .line 433
    iget v4, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 434
    .line 435
    if-ne v4, v6, :cond_13

    .line 436
    .line 437
    new-instance v4, Lcom/google/android/gms/internal/ads/zzhs;

    .line 438
    .line 439
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/zzhs;-><init>(I)V

    .line 440
    .line 441
    .line 442
    :goto_b
    move-object v6, v2

    .line 443
    move-object v3, v4

    .line 444
    move-object v2, v0

    .line 445
    goto :goto_c

    .line 446
    :cond_13
    const/4 v4, 0x0

    .line 447
    goto :goto_b

    .line 448
    :goto_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzii;

    .line 449
    .line 450
    move-object v4, v1

    .line 451
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzic;->zzk:I

    .line 452
    .line 453
    move-object v5, v12

    .line 454
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzii;-><init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzhv;[B)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :catch_5
    move-exception v0

    .line 459
    goto :goto_e

    .line 460
    :cond_14
    :goto_d
    :try_start_7
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 461
    .line 462
    .line 463
    invoke-direct {v7, v4, v10, v12}, Lcom/google/android/gms/internal/ads/zzic;->zzl(Ljava/net/URL;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;)Ljava/net/URL;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    move-wide v7, v1

    .line 468
    move-object v2, v3

    .line 469
    move v1, v14

    .line 470
    move v4, v15

    .line 471
    move-wide/from16 v14, v17

    .line 472
    .line 473
    goto/16 :goto_1

    .line 474
    .line 475
    :cond_15
    move-object/from16 v7, p0

    .line 476
    .line 477
    move v15, v3

    .line 478
    new-instance v1, Lcom/google/android/gms/internal/ads/zzig;

    .line 479
    .line 480
    new-instance v2, Ljava/net/NoRouteToHostException;

    .line 481
    .line 482
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    add-int/2addr v3, v10

    .line 491
    new-instance v4, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-direct {v2, v0}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    const/16 v0, 0x7d1

    .line 510
    .line 511
    invoke-direct {v1, v2, v12, v0, v13}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 512
    .line 513
    .line 514
    throw v1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 515
    :goto_e
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 516
    .line 517
    .line 518
    invoke-static {v0, v12, v13}, Lcom/google/android/gms/internal/ads/zzig;->zza(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;I)Lcom/google/android/gms/internal/ads/zzig;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    throw v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final zzd()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    goto :goto_1

    .line 13
    :catch_0
    move-exception v2

    .line 14
    :try_start_2
    new-instance v3, Lcom/google/android/gms/internal/ads/zzig;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 17
    .line 18
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v5, 0x7d0

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    invoke-direct {v3, v2, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 24
    .line 25
    .line 26
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 30
    .line 31
    .line 32
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 42
    .line 43
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 44
    .line 45
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzi:Ljava/io/InputStream;

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzic;->zzm()V

    .line 52
    .line 53
    .line 54
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzj:Z

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 61
    .line 62
    .line 63
    :cond_2
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 64
    .line 65
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzic;->zzg:Lcom/google/android/gms/internal/ads/zzhv;

    .line 66
    .line 67
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 68
    .line 69
    .line 70
    throw v2
.end method

.method public final zzj()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzic;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgww;->zza()Lcom/google/android/gms/internal/ads/zzgww;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzib;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzib;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
