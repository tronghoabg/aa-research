.class final Lcom/google/android/gms/internal/ads/zzckm;
.super Lcom/google/android/gms/internal/ads/zzhj;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzik;


# static fields
.field private static final zza:Ljava/util/regex/Pattern;


# instance fields
.field private final zzb:I

.field private final zzc:I

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/ads/zzij;

.field private zzf:Lcom/google/android/gms/internal/ads/zzhv;

.field private zzg:Ljava/net/HttpURLConnection;

.field private final zzh:Ljava/util/Queue;

.field private zzi:Ljava/io/InputStream;

.field private zzj:Z

.field private zzk:I

.field private zzl:J

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:J

.field private final zzq:J

.field private final zzr:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^bytes (\\d+)-(\\d+)/(\\d+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzckm;->zza:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzip;IIJJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhj;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdh;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzd:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Lcom/google/android/gms/internal/ads/zzij;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzij;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zze:Lcom/google/android/gms/internal/ads/zzij;

    .line 16
    .line 17
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzb:I

    .line 18
    .line 19
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzc:I

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzh:Ljava/util/Queue;

    .line 27
    .line 28
    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzq:J

    .line 29
    .line 30
    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzr:J

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzhj;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method private final zzl()V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzh:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    sget v1, LG6/L;->b:I

    .line 21
    .line 22
    const-string v1, "Unexpected error while disconnecting"

    .line 23
    .line 24
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzg:Ljava/net/HttpURLConnection;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    :try_start_0
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzl:J

    .line 10
    .line 11
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzm:J

    .line 12
    .line 13
    sub-long/2addr v2, v4

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    cmp-long v2, v2, v6

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    return v7

    .line 22
    :cond_1
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzn:J

    .line 23
    .line 24
    add-long/2addr v2, v4

    .line 25
    int-to-long v8, v0

    .line 26
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzr:J

    .line 27
    .line 28
    add-long/2addr v2, v8

    .line 29
    add-long/2addr v2, v4

    .line 30
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzp:J

    .line 31
    .line 32
    const-wide/16 v12, 0x1

    .line 33
    .line 34
    add-long v14, v10, v12

    .line 35
    .line 36
    cmp-long v0, v2, v14

    .line 37
    .line 38
    if-lez v0, :cond_2

    .line 39
    .line 40
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzo:J

    .line 41
    .line 42
    cmp-long v0, v10, v2

    .line 43
    .line 44
    if-gez v0, :cond_2

    .line 45
    .line 46
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzq:J

    .line 47
    .line 48
    add-long/2addr v10, v14

    .line 49
    sub-long/2addr v10, v4

    .line 50
    const-wide/16 v4, -0x1

    .line 51
    .line 52
    add-long/2addr v10, v4

    .line 53
    add-long v16, v14, v8

    .line 54
    .line 55
    add-long v4, v16, v4

    .line 56
    .line 57
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    const/4 v6, 0x2

    .line 66
    move-wide v2, v14

    .line 67
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzckm;->zzk(JJI)Ljava/net/HttpURLConnection;

    .line 68
    .line 69
    .line 70
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzp:J

    .line 71
    .line 72
    move-wide v10, v4

    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    :goto_0
    add-long/2addr v10, v12

    .line 77
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzn:J

    .line 78
    .line 79
    sub-long/2addr v10, v2

    .line 80
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzm:J

    .line 81
    .line 82
    sub-long/2addr v10, v2

    .line 83
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    long-to-int v0, v2

    .line 88
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;

    .line 89
    .line 90
    move-object/from16 v3, p1

    .line 91
    .line 92
    move/from16 v4, p2

    .line 93
    .line 94
    invoke-virtual {v2, v3, v4, v0}, Ljava/io/InputStream;->read([BII)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v0, v7, :cond_3

    .line 99
    .line 100
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzm:J

    .line 101
    .line 102
    int-to-long v4, v0

    .line 103
    add-long/2addr v2, v4

    .line 104
    iput-wide v2, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzm:J

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V

    .line 107
    .line 108
    .line 109
    return v0

    .line 110
    :cond_3
    new-instance v0, Ljava/io/EOFException;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :goto_1
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 117
    .line 118
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 119
    .line 120
    const/16 v4, 0x7d0

    .line 121
    .line 122
    const/4 v5, 0x2

    .line 123
    invoke-direct {v2, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 124
    .line 125
    .line 126
    throw v2
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhv;)J
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzm:J

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 8
    .line 9
    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 10
    .line 11
    const-wide/16 v8, -0x1

    .line 12
    .line 13
    cmp-long v2, v0, v8

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzq:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzq:J

    .line 21
    .line 22
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    :goto_0
    add-long/2addr v0, v3

    .line 27
    add-long v5, v0, v8

    .line 28
    .line 29
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzn:J

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    move-object v2, p0

    .line 33
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzckm;->zzk(JJI)Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzg:Ljava/net/HttpURLConnection;

    .line 38
    .line 39
    const-string v1, "Content-Range"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    sget-object v1, Lcom/google/android/gms/internal/ads/zzckm;->zza:Ljava/util/regex/Pattern;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x2

    .line 72
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    const/4 v6, 0x3

    .line 81
    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    iget-wide v6, p1, Lcom/google/android/gms/internal/ads/zzhv;->zzf:J

    .line 90
    .line 91
    cmp-long v10, v6, v8

    .line 92
    .line 93
    if-eqz v10, :cond_1

    .line 94
    .line 95
    iput-wide v6, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzl:J

    .line 96
    .line 97
    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzn:J

    .line 98
    .line 99
    add-long/2addr v0, v6

    .line 100
    add-long/2addr v0, v8

    .line 101
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    iput-wide v0, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzo:J

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    iget-wide v6, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzn:J

    .line 109
    .line 110
    sub-long v6, v0, v6

    .line 111
    .line 112
    iput-wide v6, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzl:J

    .line 113
    .line 114
    add-long/2addr v0, v8

    .line 115
    iput-wide v0, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzo:J

    .line 116
    .line 117
    :goto_1
    iput-wide v4, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzp:J

    .line 118
    .line 119
    iput-boolean v3, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzj:Z

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 122
    .line 123
    .line 124
    iget-wide v0, v2, Lcom/google/android/gms/internal/ads/zzckm;->zzl:J

    .line 125
    .line 126
    return-wide v0

    .line 127
    :catch_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    new-instance v3, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    add-int/lit8 v1, v1, 0x1b

    .line 138
    .line 139
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 140
    .line 141
    .line 142
    const-string v1, "Unexpected Content-Range ["

    .line 143
    .line 144
    const-string v4, "]"

    .line 145
    .line 146
    invoke-static {v3, v1, v0, v4}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    sget v3, LG6/L;->b:I

    .line 151
    .line 152
    invoke-static {v1}, LH6/l;->c(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/ads/zzckk;

    .line 156
    .line 157
    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzckk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 158
    .line 159
    .line 160
    throw v1
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzg:Ljava/net/HttpURLConnection;

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
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;
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
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

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
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzckm;->zzl()V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzj:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzj:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzckm;->zzl()V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzj:Z

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzj:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 52
    .line 53
    .line 54
    :cond_2
    throw v2
.end method

.method public final zzj()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzg:Ljava/net/HttpURLConnection;

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

.method public final zzk(JJI)Ljava/net/HttpURLConnection;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzig;
        }
    .end annotation

    .line 1
    const-string v1, "Unable to connect to "

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v0, "-"

    .line 12
    .line 13
    const-string v3, "bytes="

    .line 14
    .line 15
    :try_start_0
    new-instance v4, Ljava/net/URL;

    .line 16
    .line 17
    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Ljava/net/HttpURLConnection;

    .line 25
    .line 26
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzb:I

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 29
    .line 30
    .line 31
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzc:I

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 34
    .line 35
    .line 36
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zze:Lcom/google/android/gms/internal/ads/zzij;

    .line 37
    .line 38
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzij;->zza()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 54
    if-eqz v6, :cond_0

    .line 55
    .line 56
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v4, v7, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    move-object v5, p1

    .line 81
    move v7, p5

    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_0
    :try_start_2
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    add-int/lit8 v5, v5, 0x7

    .line 93
    .line 94
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    add-int/2addr v5, v6

    .line 103
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string p2, "Range"

    .line 125
    .line 126
    invoke-virtual {v4, p2, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string p1, "User-Agent"

    .line 130
    .line 131
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzd:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v4, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string p1, "Accept-Encoding"

    .line 137
    .line 138
    const-string p2, "identity"

    .line 139
    .line 140
    invoke-virtual {v4, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string p1, "GET"

    .line 144
    .line 145
    invoke-virtual {v4, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzh:Ljava/util/Queue;

    .line 152
    .line 153
    invoke-interface {p1, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 157
    .line 158
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :try_start_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzk:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 169
    .line 170
    const/16 p1, 0xc8

    .line 171
    .line 172
    if-lt p2, p1, :cond_2

    .line 173
    .line 174
    const/16 p1, 0x12b

    .line 175
    .line 176
    if-gt p2, p1, :cond_2

    .line 177
    .line 178
    :try_start_4
    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;

    .line 183
    .line 184
    if-eqz p2, :cond_1

    .line 185
    .line 186
    new-instance p2, Ljava/io/SequenceInputStream;

    .line 187
    .line 188
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;

    .line 189
    .line 190
    invoke-direct {p2, p3, p1}, Ljava/io/SequenceInputStream;-><init>(Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 191
    .line 192
    .line 193
    move-object p1, p2

    .line 194
    goto :goto_1

    .line 195
    :catch_1
    move-exception v0

    .line 196
    move-object p1, v0

    .line 197
    goto :goto_2

    .line 198
    :cond_1
    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzi:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 199
    .line 200
    return-object v4

    .line 201
    :goto_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzckm;->zzl()V

    .line 202
    .line 203
    .line 204
    new-instance p2, Lcom/google/android/gms/internal/ads/zzig;

    .line 205
    .line 206
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 207
    .line 208
    const/16 p4, 0x7d0

    .line 209
    .line 210
    invoke-direct {p2, p1, p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 211
    .line 212
    .line 213
    throw p2

    .line 214
    :cond_2
    invoke-virtual {v4}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzckm;->zzl()V

    .line 219
    .line 220
    .line 221
    new-instance p2, Lcom/google/android/gms/internal/ads/zzckl;

    .line 222
    .line 223
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzk:I

    .line 224
    .line 225
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 226
    .line 227
    invoke-direct {p2, p3, p1, p4, p5}, Lcom/google/android/gms/internal/ads/zzckl;-><init>(ILjava/util/Map;Lcom/google/android/gms/internal/ads/zzhv;I)V

    .line 228
    .line 229
    .line 230
    throw p2

    .line 231
    :catch_2
    move-exception v0

    .line 232
    move-object p2, v0

    .line 233
    move-object v4, p2

    .line 234
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzckm;->zzl()V

    .line 235
    .line 236
    .line 237
    new-instance v2, Lcom/google/android/gms/internal/ads/zzig;

    .line 238
    .line 239
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 244
    .line 245
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    const/16 v6, 0x7d0

    .line 250
    .line 251
    move v7, p5

    .line 252
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 253
    .line 254
    .line 255
    throw v2

    .line 256
    :catch_3
    move-exception v0

    .line 257
    move v7, p5

    .line 258
    move-object p1, v0

    .line 259
    move-object v5, p1

    .line 260
    :goto_3
    new-instance v3, Lcom/google/android/gms/internal/ads/zzig;

    .line 261
    .line 262
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzckm;->zzf:Lcom/google/android/gms/internal/ads/zzhv;

    .line 267
    .line 268
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    move v8, v7

    .line 273
    const/16 v7, 0x7d0

    .line 274
    .line 275
    invoke-direct/range {v3 .. v8}, Lcom/google/android/gms/internal/ads/zzig;-><init>(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhv;II)V

    .line 276
    .line 277
    .line 278
    throw v3
.end method
