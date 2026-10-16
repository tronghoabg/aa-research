.class final Lcom/google/android/gms/internal/ads/zzcjs;
.super Lcom/google/android/gms/internal/ads/zzhj;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzik;


# static fields
.field private static final zza:Ljava/util/regex/Pattern;

.field private static final zzb:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field private final zzc:Ljavax/net/ssl/SSLSocketFactory;

.field private final zzd:I

.field private final zze:I

.field private final zzf:Ljava/lang/String;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzij;

.field private zzh:Lcom/google/android/gms/internal/ads/zzhv;

.field private zzi:Ljava/net/HttpURLConnection;

.field private zzj:Ljava/io/InputStream;

.field private zzk:Z

.field private zzl:I

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:J

.field private zzq:I

.field private final zzr:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^bytes (\\d+)-(\\d+)/(\\d+)$"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcjs;->zza:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcjs;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzip;III)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhj;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcjr;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzcjr;-><init>(Lcom/google/android/gms/internal/ads/zzcjs;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzc:Ljavax/net/ssl/SSLSocketFactory;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzr:Ljava/util/Set;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdh;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzf:Ljava/lang/String;

    .line 23
    .line 24
    new-instance p1, Lcom/google/android/gms/internal/ads/zzij;

    .line 25
    .line 26
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzij;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzg:Lcom/google/android/gms/internal/ads/zzij;

    .line 30
    .line 31
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzd:I

    .line 32
    .line 33
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zze:I

    .line 34
    .line 35
    iput p5, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzq:I

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzhj;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method private final zzn()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

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
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    sget v1, LG6/L;->b:I

    .line 11
    .line 12
    const-string v1, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzo:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzm:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, -0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcjs;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, [B

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    const/16 v3, 0x1000

    .line 24
    .line 25
    new-array v3, v3, [B

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_0
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzo:J

    .line 31
    .line 32
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzm:J

    .line 33
    .line 34
    cmp-long v8, v4, v6

    .line 35
    .line 36
    if-eqz v8, :cond_4

    .line 37
    .line 38
    array-length v8, v3

    .line 39
    sub-long/2addr v6, v4

    .line 40
    int-to-long v4, v8

    .line 41
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    long-to-int v4, v4

    .line 46
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;

    .line 47
    .line 48
    invoke-virtual {v5, v3, v1, v4}, Ljava/io/InputStream;->read([BII)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    if-eq v4, v2, :cond_2

    .line 59
    .line 60
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzo:J

    .line 61
    .line 62
    int-to-long v7, v4

    .line 63
    add-long/2addr v5, v7

    .line 64
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzo:J

    .line 65
    .line 66
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_3
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_4
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    if-nez p3, :cond_5

    .line 86
    .line 87
    return v1

    .line 88
    :cond_5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 89
    .line 90
    const-wide/16 v3, -0x1

    .line 91
    .line 92
    cmp-long v5, v0, v3

    .line 93
    .line 94
    if-eqz v5, :cond_7

    .line 95
    .line 96
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzp:J

    .line 97
    .line 98
    sub-long/2addr v0, v5

    .line 99
    const-wide/16 v5, 0x0

    .line 100
    .line 101
    cmp-long v5, v0, v5

    .line 102
    .line 103
    if-nez v5, :cond_6

    .line 104
    .line 105
    return v2

    .line 106
    :cond_6
    int-to-long v5, p3

    .line 107
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    long-to-int p3, v0

    .line 112
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;

    .line 113
    .line 114
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-ne p1, v2, :cond_9

    .line 119
    .line 120
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 121
    .line 122
    cmp-long p1, p1, v3

    .line 123
    .line 124
    if-nez p1, :cond_8

    .line 125
    .line 126
    return v2

    .line 127
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_9
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzp:J

    .line 134
    .line 135
    int-to-long v0, p1

    .line 136
    add-long/2addr p2, v0

    .line 137
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzp:J

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    .line 141
    .line 142
    return p1

    .line 143
    :goto_2
    new-instance p2, Lcom/google/android/gms/internal/ads/zzig;

    .line 144
    .line 145
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzh:Lcom/google/android/gms/internal/ads/zzhv;

    .line 146
    .line 147
    const/16 v0, 0x7d0

    .line 148
    .line 149
    const/4 v1, 0x2

    .line 150
    invoke-direct {p2, p1, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 151
    .line 152
    .line 153
    throw p2
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhv;)J
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzh:Lcom/google/android/gms/internal/ads/zzhv;

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    iput-wide v3, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzp:J

    .line 11
    .line 12
    iput-wide v3, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzo:J

    .line 13
    .line 14
    const-string v6, "Unable to connect to "

    .line 15
    .line 16
    :try_start_0
    const-string v0, "Too many redirects: "

    .line 17
    .line 18
    new-instance v7, Ljava/net/URL;

    .line 19
    .line 20
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    invoke-direct {v7, v8}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-wide v8, v5, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 30
    .line 31
    iget-wide v10, v5, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 32
    .line 33
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzhv;->zza(I)Z

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    const/4 v14, 0x0

    .line 38
    :goto_0
    add-int/lit8 v15, v14, 0x1

    .line 39
    .line 40
    move-wide/from16 v16, v3

    .line 41
    .line 42
    const/16 v3, 0x14

    .line 43
    .line 44
    if-gt v14, v3, :cond_16

    .line 45
    .line 46
    const-string v3, "bytes="

    .line 47
    .line 48
    const-string v4, "-"

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 51
    .line 52
    .line 53
    move-result-object v14

    .line 54
    check-cast v14, Ljava/net/HttpURLConnection;

    .line 55
    .line 56
    instance-of v2, v14, Ljavax/net/ssl/HttpsURLConnection;

    .line 57
    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    move-object v2, v14

    .line 61
    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 62
    .line 63
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzc:Ljavax/net/ssl/SSLSocketFactory;

    .line 64
    .line 65
    invoke-virtual {v2, v13}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object v4, v0

    .line 71
    goto/16 :goto_c

    .line 72
    .line 73
    :cond_0
    :goto_1
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzd:I

    .line 74
    .line 75
    invoke-virtual {v14, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 76
    .line 77
    .line 78
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zze:I

    .line 79
    .line 80
    invoke-virtual {v14, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 81
    .line 82
    .line 83
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzg:Lcom/google/android/gms/internal/ads/zzij;

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzij;->zza()Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    if-eqz v13, :cond_1

    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    check-cast v13, Ljava/util/Map$Entry;

    .line 108
    .line 109
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v19

    .line 113
    move-object/from16 v20, v2

    .line 114
    .line 115
    move-object/from16 v2, v19

    .line 116
    .line 117
    check-cast v2, Ljava/lang/String;

    .line 118
    .line 119
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    check-cast v13, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v14, v2, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    move-object/from16 v2, v20

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_1
    cmp-long v2, v8, v16

    .line 132
    .line 133
    const-wide/16 v19, -0x1

    .line 134
    .line 135
    if-nez v2, :cond_3

    .line 136
    .line 137
    cmp-long v2, v10, v19

    .line 138
    .line 139
    if-eqz v2, :cond_2

    .line 140
    .line 141
    move-wide/from16 v21, v16

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_2
    move-wide/from16 v21, v8

    .line 145
    .line 146
    goto :goto_5

    .line 147
    :cond_3
    move-wide/from16 v21, v8

    .line 148
    .line 149
    :goto_3
    invoke-static/range {v21 .. v22}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    add-int/lit8 v2, v2, 0x7

    .line 158
    .line 159
    new-instance v13, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v13, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    move-wide/from16 v2, v21

    .line 168
    .line 169
    invoke-virtual {v13, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    cmp-long v13, v10, v19

    .line 180
    .line 181
    if-eqz v13, :cond_4

    .line 182
    .line 183
    add-long v21, v2, v10

    .line 184
    .line 185
    add-long v2, v21, v19

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v21

    .line 195
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 196
    .line 197
    .line 198
    move-result v21

    .line 199
    add-int v13, v13, v21

    .line 200
    .line 201
    move-wide/from16 v21, v8

    .line 202
    .line 203
    new-instance v8, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    goto :goto_4

    .line 219
    :cond_4
    move-wide/from16 v21, v8

    .line 220
    .line 221
    :goto_4
    const-string v2, "Range"

    .line 222
    .line 223
    invoke-virtual {v14, v2, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_5
    const-string v2, "User-Agent"

    .line 227
    .line 228
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzf:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {v14, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    if-nez v12, :cond_5

    .line 234
    .line 235
    const-string v2, "Accept-Encoding"

    .line 236
    .line 237
    const-string v3, "identity"

    .line 238
    .line 239
    invoke-virtual {v14, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :cond_5
    const/4 v2, 0x0

    .line 243
    invoke-virtual {v14, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v14, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14}, Ljava/net/URLConnection;->connect()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    const/16 v4, 0x12c

    .line 257
    .line 258
    if-eq v3, v4, :cond_6

    .line 259
    .line 260
    const/16 v4, 0x12d

    .line 261
    .line 262
    if-eq v3, v4, :cond_6

    .line 263
    .line 264
    const/16 v4, 0x12e

    .line 265
    .line 266
    if-eq v3, v4, :cond_6

    .line 267
    .line 268
    const/16 v4, 0x12f

    .line 269
    .line 270
    if-eq v3, v4, :cond_6

    .line 271
    .line 272
    const/16 v4, 0x133

    .line 273
    .line 274
    if-eq v3, v4, :cond_6

    .line 275
    .line 276
    const/16 v4, 0x134

    .line 277
    .line 278
    if-ne v3, v4, :cond_7

    .line 279
    .line 280
    :cond_6
    const/4 v4, 0x1

    .line 281
    goto/16 :goto_a

    .line 282
    .line 283
    :cond_7
    iput-object v14, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    .line 285
    :try_start_1
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzl:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4

    .line 290
    .line 291
    const/16 v2, 0xc8

    .line 292
    .line 293
    if-lt v0, v2, :cond_11

    .line 294
    .line 295
    const/16 v3, 0x12b

    .line 296
    .line 297
    if-le v0, v3, :cond_8

    .line 298
    .line 299
    goto/16 :goto_9

    .line 300
    .line 301
    :cond_8
    if-ne v0, v2, :cond_9

    .line 302
    .line 303
    iget-wide v2, v5, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 304
    .line 305
    cmp-long v0, v2, v16

    .line 306
    .line 307
    if-nez v0, :cond_a

    .line 308
    .line 309
    :cond_9
    move-wide/from16 v2, v16

    .line 310
    .line 311
    :cond_a
    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzm:J

    .line 312
    .line 313
    const/4 v2, 0x1

    .line 314
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzhv;->zza(I)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-nez v0, :cond_10

    .line 319
    .line 320
    iget-wide v2, v5, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 321
    .line 322
    cmp-long v0, v2, v19

    .line 323
    .line 324
    if-eqz v0, :cond_b

    .line 325
    .line 326
    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 327
    .line 328
    goto/16 :goto_8

    .line 329
    .line 330
    :cond_b
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 331
    .line 332
    const-string v2, "Content-Length"

    .line 333
    .line 334
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    const-string v4, "] ["

    .line 343
    .line 344
    const-string v6, "Inconsistent headers ["

    .line 345
    .line 346
    const-string v7, "]"

    .line 347
    .line 348
    if-nez v3, :cond_c

    .line 349
    .line 350
    :try_start_2
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 351
    .line 352
    .line 353
    move-result-wide v8
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 354
    goto :goto_6

    .line 355
    :catch_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    new-instance v8, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    add-int/lit8 v3, v3, 0x1c

    .line 366
    .line 367
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 368
    .line 369
    .line 370
    const-string v3, "Unexpected Content-Length ["

    .line 371
    .line 372
    invoke-static {v8, v3, v2, v7}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    sget v8, LG6/L;->b:I

    .line 377
    .line 378
    invoke-static {v3}, LH6/l;->c(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_c
    move-wide/from16 v8, v19

    .line 382
    .line 383
    :goto_6
    const-string v3, "Content-Range"

    .line 384
    .line 385
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-nez v3, :cond_e

    .line 394
    .line 395
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcjs;->zza:Ljava/util/regex/Pattern;

    .line 396
    .line 397
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    if-eqz v10, :cond_e

    .line 406
    .line 407
    const/4 v10, 0x2

    .line 408
    :try_start_3
    invoke-virtual {v3, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v10

    .line 416
    const/4 v12, 0x1

    .line 417
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 422
    .line 423
    .line 424
    move-result-wide v12

    .line 425
    sub-long/2addr v10, v12

    .line 426
    cmp-long v3, v8, v16

    .line 427
    .line 428
    const-wide/16 v12, 0x1

    .line 429
    .line 430
    add-long/2addr v10, v12

    .line 431
    if-gez v3, :cond_d

    .line 432
    .line 433
    move-wide v8, v10

    .line 434
    goto :goto_7

    .line 435
    :cond_d
    cmp-long v3, v8, v10

    .line 436
    .line 437
    if-eqz v3, :cond_e

    .line 438
    .line 439
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    add-int/lit8 v3, v3, 0x19

    .line 448
    .line 449
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 454
    .line 455
    .line 456
    move-result v12

    .line 457
    add-int/2addr v3, v12

    .line 458
    const/16 v18, 0x1

    .line 459
    .line 460
    add-int/lit8 v3, v3, 0x1

    .line 461
    .line 462
    new-instance v12, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    invoke-direct {v12, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    sget v3, LG6/L;->b:I

    .line 487
    .line 488
    invoke-static {v2}, LH6/l;->f(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 492
    .line 493
    .line 494
    move-result-wide v8
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 495
    goto :goto_7

    .line 496
    :catch_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    new-instance v3, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    add-int/lit8 v2, v2, 0x1b

    .line 507
    .line 508
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 509
    .line 510
    .line 511
    const-string v2, "Unexpected Content-Range ["

    .line 512
    .line 513
    invoke-static {v3, v2, v0, v7}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    sget v2, LG6/L;->b:I

    .line 518
    .line 519
    invoke-static {v0}, LH6/l;->c(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    :cond_e
    :goto_7
    cmp-long v0, v8, v19

    .line 523
    .line 524
    if-eqz v0, :cond_f

    .line 525
    .line 526
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzm:J

    .line 527
    .line 528
    sub-long v19, v8, v2

    .line 529
    .line 530
    :cond_f
    move-wide/from16 v2, v19

    .line 531
    .line 532
    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 533
    .line 534
    goto :goto_8

    .line 535
    :cond_10
    iget-wide v2, v5, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 536
    .line 537
    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 538
    .line 539
    :goto_8
    :try_start_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 546
    .line 547
    const/4 v2, 0x1

    .line 548
    iput-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzk:Z

    .line 549
    .line 550
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 551
    .line 552
    .line 553
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzn:J

    .line 554
    .line 555
    return-wide v2

    .line 556
    :catch_3
    move-exception v0

    .line 557
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjs;->zzn()V

    .line 558
    .line 559
    .line 560
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 561
    .line 562
    const/16 v3, 0x7d0

    .line 563
    .line 564
    const/4 v4, 0x1

    .line 565
    invoke-direct {v2, v0, v5, v3, v4}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 566
    .line 567
    .line 568
    throw v2

    .line 569
    :cond_11
    :goto_9
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjs;->zzn()V

    .line 576
    .line 577
    .line 578
    new-instance v2, Lcom/google/android/gms/internal/ads/zzii;

    .line 579
    .line 580
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzl:I

    .line 581
    .line 582
    const/4 v5, 0x0

    .line 583
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B

    .line 584
    .line 585
    const/4 v4, 0x0

    .line 586
    move-object/from16 v7, p1

    .line 587
    .line 588
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/zzii;-><init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzhv;[B)V

    .line 589
    .line 590
    .line 591
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzcjs;->zzl:I

    .line 592
    .line 593
    const/16 v3, 0x1a0

    .line 594
    .line 595
    if-ne v0, v3, :cond_12

    .line 596
    .line 597
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhs;

    .line 598
    .line 599
    const/16 v3, 0x7d8

    .line 600
    .line 601
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzhs;-><init>(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 605
    .line 606
    .line 607
    :cond_12
    throw v2

    .line 608
    :catch_4
    move-exception v0

    .line 609
    move-object v4, v0

    .line 610
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjs;->zzn()V

    .line 611
    .line 612
    .line 613
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 614
    .line 615
    iget-object v0, v5, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 616
    .line 617
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    const/16 v6, 0x7d0

    .line 630
    .line 631
    const/4 v7, 0x1

    .line 632
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 633
    .line 634
    .line 635
    throw v2

    .line 636
    :goto_a
    :try_start_5
    const-string v3, "Location"

    .line 637
    .line 638
    invoke-virtual {v14, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    invoke-virtual {v14}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 643
    .line 644
    .line 645
    const-string v8, "Unsupported protocol redirect: "

    .line 646
    .line 647
    if-eqz v3, :cond_15

    .line 648
    .line 649
    new-instance v9, Ljava/net/URL;

    .line 650
    .line 651
    invoke-direct {v9, v7, v3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    const-string v7, "https"

    .line 659
    .line 660
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v7

    .line 664
    if-nez v7, :cond_14

    .line 665
    .line 666
    const-string v7, "http"

    .line 667
    .line 668
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    if-eqz v7, :cond_13

    .line 673
    .line 674
    goto :goto_b

    .line 675
    :cond_13
    new-instance v0, Ljava/net/ProtocolException;

    .line 676
    .line 677
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    throw v0

    .line 689
    :cond_14
    :goto_b
    move v2, v4

    .line 690
    move-object v7, v9

    .line 691
    move v14, v15

    .line 692
    move-wide/from16 v3, v16

    .line 693
    .line 694
    move-wide/from16 v8, v21

    .line 695
    .line 696
    goto/16 :goto_0

    .line 697
    .line 698
    :cond_15
    new-instance v0, Ljava/net/ProtocolException;

    .line 699
    .line 700
    const-string v2, "Null location redirect"

    .line 701
    .line 702
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    throw v0

    .line 706
    :cond_16
    new-instance v2, Ljava/net/NoRouteToHostException;

    .line 707
    .line 708
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    add-int/2addr v4, v3

    .line 717
    new-instance v3, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-direct {v2, v0}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    throw v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 736
    :goto_c
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 737
    .line 738
    iget-object v0, v5, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 739
    .line 740
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    const/16 v6, 0x7d0

    .line 753
    .line 754
    const/4 v7, 0x1

    .line 755
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 756
    .line 757
    .line 758
    throw v2
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
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
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;
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
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzh:Lcom/google/android/gms/internal/ads/zzhv;

    .line 17
    .line 18
    const/16 v5, 0x7d0

    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    invoke-direct {v3, v2, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 22
    .line 23
    .line 24
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcjs;->zzn()V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzk:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzk:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzr:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzj:Ljava/io/InputStream;

    .line 46
    .line 47
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcjs;->zzn()V

    .line 48
    .line 49
    .line 50
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzk:Z

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzk:Z

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzr:Ljava/util/Set;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 62
    .line 63
    .line 64
    throw v2
.end method

.method public final zzj()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzi:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final zzk(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzq:I

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzr:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/net/Socket;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzq:I

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setReceiveBufferSize(I)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    sget v1, LG6/L;->b:I

    .line 35
    .line 36
    const-string v1, "Failed to update receive buffer size."

    .line 37
    .line 38
    invoke-static {v1, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method

.method public final synthetic zzl(Ljava/net/Socket;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzr:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzm()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcjs;->zzq:I

    return v0
.end method
