.class public final Lcom/google/android/gms/internal/ads/zzgev;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgep;


# instance fields
.field private final zza:Ljava/util/concurrent/ExecutorService;

.field private final zzb:Ljava/lang/String;

.field private final zzc:J


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgev;->zza:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgev;->zzb:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzgev;->zzc:J

    return-void
.end method

.method private final zze(Ljava/lang/String;Z[BLjava/lang/String;)Lp8/p;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzges;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v3, p2

    .line 6
    move-object v5, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzges;-><init>(Lcom/google/android/gms/internal/ads/zzgev;Ljava/lang/String;ZLjava/lang/String;[B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/moloco/sdk/internal/publisher/H;->Y(LN0/k;)LN0/m;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private final zzf(Ljava/lang/String;LN0/j;ZLjava/lang/String;[B)V
    .locals 5

    .line 1
    const-string v0, "Timeout: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 17
    .line 18
    :try_start_1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/internal/ads/zzget;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzget;-><init>(Ljava/net/HttpURLConnection;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgev;->zza:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    iget-object v3, p2, LN0/j;->c:LN0/n;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3, v1, v2}, LN0/i;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const-string v1, "User-Agent"

    .line 36
    .line 37
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgev;->zzb:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgev;->zzc:J

    .line 43
    .line 44
    long-to-int v1, v1

    .line 45
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 49
    .line 50
    .line 51
    if-eqz p3, :cond_2

    .line 52
    .line 53
    const/4 p3, 0x1

    .line 54
    invoke-virtual {p1, p3}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 55
    .line 56
    .line 57
    const-string p3, "POST"

    .line 58
    .line 59
    invoke-virtual {p1, p3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    if-eqz p4, :cond_1

    .line 63
    .line 64
    const-string p3, "Content-Type"

    .line 65
    .line 66
    invoke-virtual {p1, p3, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p3

    .line 71
    goto/16 :goto_a

    .line 72
    .line 73
    :catch_0
    move-exception p3

    .line 74
    goto/16 :goto_b

    .line 75
    .line 76
    :cond_1
    :goto_0
    new-instance p3, Ljava/io/BufferedOutputStream;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-direct {p3, p4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    .line 85
    :try_start_2
    invoke-virtual {p3, p5}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 86
    .line 87
    .line 88
    :try_start_3
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catchall_1
    move-exception p4

    .line 93
    :try_start_4
    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_2
    move-exception p3

    .line 98
    :try_start_5
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    throw p4

    .line 102
    :cond_2
    :goto_2
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    const/16 p4, 0x190

    .line 107
    .line 108
    if-ge p3, p4, :cond_3

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 116
    .line 117
    .line 118
    move-result-object p4
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 119
    :goto_3
    :try_start_6
    new-instance p5, Ljava/io/ByteArrayOutputStream;

    .line 120
    .line 121
    invoke-direct {p5}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 122
    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    if-nez p4, :cond_4

    .line 126
    .line 127
    :try_start_7
    new-array v1, v1, [B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 128
    .line 129
    :try_start_8
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :catchall_3
    move-exception p3

    .line 134
    goto :goto_8

    .line 135
    :catchall_4
    move-exception p3

    .line 136
    goto :goto_6

    .line 137
    :cond_4
    const/16 v2, 0x1000

    .line 138
    .line 139
    :try_start_9
    new-array v2, v2, [B

    .line 140
    .line 141
    :goto_4
    invoke-virtual {p4, v2}, Ljava/io/InputStream;->read([B)I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    const/4 v4, -0x1

    .line 146
    if-eq v3, v4, :cond_5

    .line 147
    .line 148
    invoke-virtual {p5, v2, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 153
    .line 154
    .line 155
    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 156
    :try_start_a
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 157
    .line 158
    .line 159
    :try_start_b
    invoke-virtual {p4}, Ljava/io/InputStream;->close()V

    .line 160
    .line 161
    .line 162
    :goto_5
    new-instance p4, Lcom/google/android/gms/internal/ads/zzgeu;

    .line 163
    .line 164
    invoke-direct {p4, p3, v1}, Lcom/google/android/gms/internal/ads/zzgeu;-><init>(I[B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2, p4}, LN0/j;->a(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/net/SocketTimeoutException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 168
    .line 169
    .line 170
    goto :goto_f

    .line 171
    :goto_6
    :try_start_c
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :catchall_5
    move-exception p5

    .line 176
    :try_start_d
    invoke-virtual {p3, p5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :goto_7
    throw p3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 180
    :goto_8
    if-eqz p4, :cond_6

    .line 181
    .line 182
    :try_start_e
    invoke-virtual {p4}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 183
    .line 184
    .line 185
    goto :goto_9

    .line 186
    :catchall_6
    move-exception p4

    .line 187
    :try_start_f
    invoke-virtual {p3, p4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    :goto_9
    throw p3
    :try_end_f
    .catch Ljava/net/SocketTimeoutException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 191
    :goto_a
    move-object v1, p1

    .line 192
    goto :goto_c

    .line 193
    :goto_b
    move-object v1, p1

    .line 194
    goto :goto_e

    .line 195
    :catchall_7
    move-exception p1

    .line 196
    move-object p3, p1

    .line 197
    goto :goto_c

    .line 198
    :catch_1
    move-exception p1

    .line 199
    move-object p3, p1

    .line 200
    goto :goto_e

    .line 201
    :goto_c
    :try_start_10
    invoke-virtual {p2, p3}, LN0/j;->b(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    :goto_d
    move-object p1, v1

    .line 205
    goto :goto_f

    .line 206
    :catchall_8
    move-exception p1

    .line 207
    goto :goto_10

    .line 208
    :goto_e
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    .line 209
    .line 210
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p4

    .line 218
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 219
    .line 220
    .line 221
    move-result p4

    .line 222
    add-int/lit8 p4, p4, 0x9

    .line 223
    .line 224
    new-instance p5, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {p5, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p3

    .line 239
    invoke-direct {p1, p3}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, p1}, LN0/j;->b(Ljava/lang/Throwable;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 243
    .line 244
    .line 245
    goto :goto_d

    .line 246
    :goto_f
    if-eqz p1, :cond_7

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 249
    .line 250
    .line 251
    :cond_7
    return-void

    .line 252
    :goto_10
    if-eqz v1, :cond_8

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 255
    .line 256
    .line 257
    :cond_8
    throw p1
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Lp8/p;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgev;->zze(Ljava/lang/String;Z[BLjava/lang/String;)Lp8/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final zzb(Ljava/lang/String;[BLjava/lang/String;)Lp8/p;
    .locals 1

    .line 1
    const/4 p3, 0x1

    .line 2
    const-string v0, "application/x-protobuf"

    .line 3
    .line 4
    invoke-direct {p0, p1, p3, p2, v0}, Lcom/google/android/gms/internal/ads/zzgev;->zze(Ljava/lang/String;Z[BLjava/lang/String;)Lp8/p;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final synthetic zzc(Ljava/lang/String;ZLjava/lang/String;[BLN0/j;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzger;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v4, p2

    .line 6
    move-object v5, p3

    .line 7
    move-object v6, p4

    .line 8
    move-object v3, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzger;-><init>(Lcom/google/android/gms/internal/ads/zzgev;Ljava/lang/String;LN0/j;ZLjava/lang/String;[B)V

    .line 10
    .line 11
    .line 12
    iget-object p1, v1, Lcom/google/android/gms/internal/ads/zzgev;->zza:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    const-string p1, ""

    .line 18
    .line 19
    return-object p1
.end method

.method public final synthetic zzd(Ljava/lang/String;LN0/j;ZLjava/lang/String;[B)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/ads/zzgev;->zzf(Ljava/lang/String;LN0/j;ZLjava/lang/String;[B)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
