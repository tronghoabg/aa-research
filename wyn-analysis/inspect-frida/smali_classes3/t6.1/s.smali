.class public final Lt6/s;
.super Lt6/f;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:LS1/v;

.field public final h:LS1/v;

.field public i:Ljava/net/HttpURLConnection;

.field public j:Ljava/io/InputStream;

.field public k:Z

.field public l:I

.field public m:J

.field public n:J


# direct methods
.method public constructor <init>(IILS1/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lt6/f;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Lt6/s;->e:I

    .line 6
    .line 7
    iput p2, p0, Lt6/s;->f:I

    .line 8
    .line 9
    iput-object p3, p0, Lt6/s;->g:LS1/v;

    .line 10
    .line 11
    new-instance p1, LS1/v;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    invoke-direct {p1, p2}, LS1/v;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lt6/s;->h:LS1/v;

    .line 18
    .line 19
    return-void
.end method

.method public static q(Ljava/net/HttpURLConnection;J)V
    .locals 2

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    sget v0, Lu6/v;->a:I

    .line 4
    .line 5
    const/16 v1, 0x13

    .line 6
    .line 7
    if-lt v0, v1, :cond_4

    .line 8
    .line 9
    const/16 v1, 0x14

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    cmp-long v0, p1, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, -0x1

    .line 29
    if-ne p1, p2, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide/16 v0, 0x800

    .line 33
    .line 34
    cmp-long p1, p1, v0

    .line 35
    .line 36
    if-gtz p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string p2, "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_3

    .line 54
    .line 55
    const-string p2, "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string p2, "unexpectedEndOfInput"

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    new-array v1, v0, [Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 p2, 0x1

    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 85
    .line 86
    .line 87
    new-array p2, v0, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    :catch_0
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lt6/s;->j:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    iget-wide v3, p0, Lt6/s;->m:J

    .line 8
    .line 9
    const-wide/16 v5, -0x1

    .line 10
    .line 11
    cmp-long v7, v3, v5

    .line 12
    .line 13
    if-nez v7, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v5, p0, Lt6/s;->n:J

    .line 17
    .line 18
    sub-long v5, v3, v5

    .line 19
    .line 20
    :goto_0
    iget-object v3, p0, Lt6/s;->i:Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    invoke-static {v3, v5, v6}, Lt6/s;->q(Ljava/net/HttpURLConnection;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v2

    .line 30
    goto :goto_2

    .line 31
    :catch_0
    move-exception v2

    .line 32
    :try_start_2
    new-instance v3, Lt6/x;

    .line 33
    .line 34
    sget v4, Lu6/v;->a:I

    .line 35
    .line 36
    const/16 v4, 0x7d0

    .line 37
    .line 38
    const/4 v5, 0x3

    .line 39
    invoke-direct {v3, v2, v4, v5}, Lt6/x;-><init>(Ljava/io/IOException;II)V

    .line 40
    .line 41
    .line 42
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    :cond_1
    :goto_1
    iput-object v1, p0, Lt6/s;->j:Ljava/io/InputStream;

    .line 44
    .line 45
    invoke-virtual {p0}, Lt6/s;->o()V

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, Lt6/s;->k:Z

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iput-boolean v0, p0, Lt6/s;->k:Z

    .line 53
    .line 54
    invoke-virtual {p0}, Lt6/f;->l()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void

    .line 58
    :goto_2
    iput-object v1, p0, Lt6/s;->j:Ljava/io/InputStream;

    .line 59
    .line 60
    invoke-virtual {p0}, Lt6/s;->o()V

    .line 61
    .line 62
    .line 63
    iget-boolean v1, p0, Lt6/s;->k:Z

    .line 64
    .line 65
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iput-boolean v0, p0, Lt6/s;->k:Z

    .line 68
    .line 69
    invoke-virtual {p0}, Lt6/f;->l()V

    .line 70
    .line 71
    .line 72
    :cond_3
    throw v2
.end method

.method public final d()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, Lt6/s;->i:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ll8/j0;->g:Ll8/j0;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v1, LS1/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, v2, v0}, LS1/n;-><init>(ILjava/util/Map;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method

.method public final k()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/s;->i:Ljava/net/HttpURLConnection;

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

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt6/s;->i:Ljava/net/HttpURLConnection;

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
    const-string v1, "DefaultHttpDataSource"

    .line 11
    .line 12
    const-string v2, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lt6/s;->i:Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final p(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 3

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
    iget v0, p0, Lt6/s;->e:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lt6/s;->f:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lt6/s;->g:LS1/v;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, LS1/v;->a()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v1, p0, Lt6/s;->h:LS1/v;

    .line 34
    .line 35
    invoke-virtual {v1}, LS1/v;->a()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p10

    .line 49
    invoke-interface {p10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p10

    .line 53
    :goto_0
    invoke-interface {p10}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-interface {p10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, v1, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object p10, Lt6/A;->a:Ljava/util/regex/Pattern;

    .line 82
    .line 83
    const-wide/16 v0, 0x0

    .line 84
    .line 85
    cmp-long p10, p4, v0

    .line 86
    .line 87
    const-wide/16 v0, -0x1

    .line 88
    .line 89
    if-nez p10, :cond_2

    .line 90
    .line 91
    cmp-long p10, p6, v0

    .line 92
    .line 93
    if-nez p10, :cond_2

    .line 94
    .line 95
    const/4 p4, 0x0

    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const-string p10, "bytes="

    .line 98
    .line 99
    const-string v2, "-"

    .line 100
    .line 101
    invoke-static {p4, p5, p10, v2}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move-result-object p10

    .line 105
    cmp-long v0, p6, v0

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    add-long/2addr p4, p6

    .line 110
    const-wide/16 p6, 0x1

    .line 111
    .line 112
    sub-long/2addr p4, p6

    .line 113
    invoke-virtual {p10, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-virtual {p10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    :goto_1
    if-eqz p4, :cond_4

    .line 121
    .line 122
    const-string p5, "Range"

    .line 123
    .line 124
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    if-eqz p8, :cond_5

    .line 128
    .line 129
    const-string p4, "gzip"

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    const-string p4, "identity"

    .line 133
    .line 134
    :goto_2
    const-string p5, "Accept-Encoding"

    .line 135
    .line 136
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 140
    .line 141
    .line 142
    const/4 p4, 0x1

    .line 143
    if-eqz p3, :cond_6

    .line 144
    .line 145
    move p5, p4

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    const/4 p5, 0x0

    .line 148
    :goto_3
    invoke-virtual {p1, p5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 149
    .line 150
    .line 151
    sget p5, Lt6/n;->h:I

    .line 152
    .line 153
    if-eq p2, p4, :cond_9

    .line 154
    .line 155
    const/4 p4, 0x2

    .line 156
    if-eq p2, p4, :cond_8

    .line 157
    .line 158
    const/4 p4, 0x3

    .line 159
    if-ne p2, p4, :cond_7

    .line 160
    .line 161
    const-string p2, "HEAD"

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_8
    const-string p2, "POST"

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    const-string p2, "GET"

    .line 174
    .line 175
    :goto_4
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    if-eqz p3, :cond_a

    .line 179
    .line 180
    array-length p2, p3

    .line 181
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {p2, p3}, Ljava/io/OutputStream;->write([B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 195
    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_a
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 199
    .line 200
    .line 201
    return-object p1
.end method

.method public final r(J)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/16 v2, 0x1000

    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    :goto_0
    cmp-long v4, p1, v0

    .line 13
    .line 14
    if-lez v4, :cond_3

    .line 15
    .line 16
    int-to-long v4, v2

    .line 17
    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    long-to-int v4, v4

    .line 22
    iget-object v5, p0, Lt6/s;->j:Ljava/io/InputStream;

    .line 23
    .line 24
    sget v6, Lu6/v;->a:I

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-virtual {v5, v3, v6, v4}, Ljava/io/InputStream;->read([BII)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    const/4 v5, -0x1

    .line 42
    if-eq v4, v5, :cond_1

    .line 43
    .line 44
    int-to-long v5, v4

    .line 45
    sub-long/2addr p1, v5

    .line 46
    invoke-virtual {p0, v4}, Lt6/f;->b(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Lt6/x;

    .line 51
    .line 52
    invoke-direct {p1}, Lt6/x;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    new-instance p1, Lt6/x;

    .line 57
    .line 58
    new-instance p2, Ljava/io/InterruptedIOException;

    .line 59
    .line 60
    invoke-direct {p2}, Ljava/io/InterruptedIOException;-><init>()V

    .line 61
    .line 62
    .line 63
    const/16 v0, 0x7d0

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {p1, p2, v0, v1}, Lt6/x;-><init>(Ljava/io/IOException;II)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_3
    :goto_1
    return-void
.end method

.method public final read([BII)I
    .locals 6

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
    iget-wide v0, p0, Lt6/s;->m:J

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
    iget-wide v4, p0, Lt6/s;->n:J

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
    goto :goto_0

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
    :cond_2
    iget-object v0, p0, Lt6/s;->j:Ljava/io/InputStream;

    .line 31
    .line 32
    sget v1, Lu6/v;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v3, :cond_3

    .line 39
    .line 40
    :goto_0
    return v3

    .line 41
    :cond_3
    iget-wide p2, p0, Lt6/s;->n:J

    .line 42
    .line 43
    int-to-long v0, p1

    .line 44
    add-long/2addr p2, v0

    .line 45
    iput-wide p2, p0, Lt6/s;->n:J

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lt6/f;->b(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return p1

    .line 51
    :catch_0
    move-exception p1

    .line 52
    sget p2, Lu6/v;->a:I

    .line 53
    .line 54
    const/4 p2, 0x2

    .line 55
    invoke-static {p1, p2}, Lt6/x;->a(Ljava/io/IOException;I)Lt6/x;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
.end method

.method public final t(Lt6/n;)J
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-wide/16 v12, 0x0

    .line 6
    .line 7
    iput-wide v12, v1, Lt6/s;->n:J

    .line 8
    .line 9
    iput-wide v12, v1, Lt6/s;->m:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lt6/f;->m()V

    .line 12
    .line 13
    .line 14
    const/4 v14, 0x1

    .line 15
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 16
    .line 17
    iget-object v3, v0, Lt6/n;->a:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget v3, v0, Lt6/n;->g:I

    .line 27
    .line 28
    and-int/2addr v3, v14

    .line 29
    const/4 v15, 0x0

    .line 30
    if-ne v3, v14, :cond_0

    .line 31
    .line 32
    move v9, v14

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v9, v15

    .line 35
    :goto_0
    iget-object v11, v0, Lt6/n;->d:Ljava/util/Map;

    .line 36
    .line 37
    iget v3, v0, Lt6/n;->b:I

    .line 38
    .line 39
    iget-object v4, v0, Lt6/n;->c:[B

    .line 40
    .line 41
    iget-wide v5, v0, Lt6/n;->e:J

    .line 42
    .line 43
    iget-wide v7, v0, Lt6/n;->f:J

    .line 44
    .line 45
    const/4 v10, 0x1

    .line 46
    invoke-virtual/range {v1 .. v11}, Lt6/s;->p(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v2, v1, Lt6/s;->i:Ljava/net/HttpURLConnection;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, v1, Lt6/s;->l:I

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    .line 59
    .line 60
    .line 61
    iget v3, v1, Lt6/s;->l:I

    .line 62
    .line 63
    const-string v4, "Content-Range"

    .line 64
    .line 65
    const/16 v5, 0xc8

    .line 66
    .line 67
    iget-wide v8, v0, Lt6/n;->e:J

    .line 68
    .line 69
    iget-wide v10, v0, Lt6/n;->f:J

    .line 70
    .line 71
    const-wide/16 v16, -0x1

    .line 72
    .line 73
    if-lt v3, v5, :cond_1

    .line 74
    .line 75
    const/16 v6, 0x12b

    .line 76
    .line 77
    if-le v3, v6, :cond_2

    .line 78
    .line 79
    :cond_1
    move-wide/from16 v18, v12

    .line 80
    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_2
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    iget v3, v1, Lt6/s;->l:I

    .line 87
    .line 88
    if-ne v3, v5, :cond_3

    .line 89
    .line 90
    cmp-long v3, v8, v12

    .line 91
    .line 92
    if-eqz v3, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    move-wide v8, v12

    .line 96
    :goto_1
    const-string v3, "Content-Encoding"

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const-string v5, "gzip"

    .line 103
    .line 104
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_9

    .line 109
    .line 110
    cmp-long v5, v10, v16

    .line 111
    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    iput-wide v10, v1, Lt6/s;->m:J

    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_4
    const-string v5, "Content-Length"

    .line 119
    .line 120
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    sget-object v6, Lt6/A;->a:Ljava/util/regex/Pattern;

    .line 129
    .line 130
    const-string v6, "Inconsistent headers ["

    .line 131
    .line 132
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    const-string v10, "]"

    .line 137
    .line 138
    const-string v11, "HttpUtil"

    .line 139
    .line 140
    if-nez v7, :cond_5

    .line 141
    .line 142
    :try_start_1
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v18
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    move-wide/from16 v24, v18

    .line 147
    .line 148
    move-wide/from16 v18, v12

    .line 149
    .line 150
    move-wide/from16 v12, v24

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :catch_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v15, "Unexpected Content-Length ["

    .line 156
    .line 157
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-static {v11, v7}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :cond_5
    move-wide/from16 v18, v12

    .line 174
    .line 175
    move-wide/from16 v12, v16

    .line 176
    .line 177
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-nez v7, :cond_7

    .line 182
    .line 183
    sget-object v7, Lt6/A;->a:Ljava/util/regex/Pattern;

    .line 184
    .line 185
    invoke-virtual {v7, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-eqz v15, :cond_7

    .line 194
    .line 195
    const/4 v15, 0x2

    .line 196
    :try_start_2
    invoke-virtual {v7, v15}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 204
    .line 205
    .line 206
    move-result-wide v20

    .line 207
    invoke-virtual {v7, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v22

    .line 218
    sub-long v20, v20, v22

    .line 219
    .line 220
    const-wide/16 v22, 0x1

    .line 221
    .line 222
    add-long v14, v20, v22

    .line 223
    .line 224
    cmp-long v18, v12, v18

    .line 225
    .line 226
    if-gez v18, :cond_6

    .line 227
    .line 228
    move-wide v12, v14

    .line 229
    goto :goto_3

    .line 230
    :cond_6
    cmp-long v18, v12, v14

    .line 231
    .line 232
    if-eqz v18, :cond_7

    .line 233
    .line 234
    new-instance v7, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v5, "] ["

    .line 243
    .line 244
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-static {v11, v5}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v12
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 264
    goto :goto_3

    .line 265
    :catch_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v6, "Unexpected Content-Range ["

    .line 268
    .line 269
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    invoke-static {v11, v4}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_7
    :goto_3
    cmp-long v4, v12, v16

    .line 286
    .line 287
    if-eqz v4, :cond_8

    .line 288
    .line 289
    sub-long v6, v12, v8

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_8
    move-wide/from16 v6, v16

    .line 293
    .line 294
    :goto_4
    iput-wide v6, v1, Lt6/s;->m:J

    .line 295
    .line 296
    goto :goto_5

    .line 297
    :cond_9
    iput-wide v10, v1, Lt6/s;->m:J

    .line 298
    .line 299
    :goto_5
    const/16 v4, 0x7d0

    .line 300
    .line 301
    :try_start_3
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iput-object v2, v1, Lt6/s;->j:Ljava/io/InputStream;

    .line 306
    .line 307
    if-eqz v3, :cond_a

    .line 308
    .line 309
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 310
    .line 311
    iget-object v3, v1, Lt6/s;->j:Ljava/io/InputStream;

    .line 312
    .line 313
    invoke-direct {v2, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 314
    .line 315
    .line 316
    iput-object v2, v1, Lt6/s;->j:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 317
    .line 318
    :cond_a
    const/4 v7, 0x1

    .line 319
    goto :goto_6

    .line 320
    :catch_2
    move-exception v0

    .line 321
    const/4 v7, 0x1

    .line 322
    goto :goto_7

    .line 323
    :goto_6
    iput-boolean v7, v1, Lt6/s;->k:Z

    .line 324
    .line 325
    invoke-virtual/range {p0 .. p1}, Lt6/f;->n(Lt6/n;)V

    .line 326
    .line 327
    .line 328
    :try_start_4
    invoke-virtual {v1, v8, v9}, Lt6/s;->r(J)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 329
    .line 330
    .line 331
    iget-wide v2, v1, Lt6/s;->m:J

    .line 332
    .line 333
    return-wide v2

    .line 334
    :catch_3
    move-exception v0

    .line 335
    invoke-virtual {v1}, Lt6/s;->o()V

    .line 336
    .line 337
    .line 338
    instance-of v2, v0, Lt6/x;

    .line 339
    .line 340
    if-eqz v2, :cond_b

    .line 341
    .line 342
    check-cast v0, Lt6/x;

    .line 343
    .line 344
    throw v0

    .line 345
    :cond_b
    new-instance v2, Lt6/x;

    .line 346
    .line 347
    const/4 v7, 0x1

    .line 348
    invoke-direct {v2, v0, v4, v7}, Lt6/x;-><init>(Ljava/io/IOException;II)V

    .line 349
    .line 350
    .line 351
    throw v2

    .line 352
    :goto_7
    invoke-virtual {v1}, Lt6/s;->o()V

    .line 353
    .line 354
    .line 355
    new-instance v2, Lt6/x;

    .line 356
    .line 357
    invoke-direct {v2, v0, v4, v7}, Lt6/x;-><init>(Ljava/io/IOException;II)V

    .line 358
    .line 359
    .line 360
    throw v2

    .line 361
    :goto_8
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    iget v5, v1, Lt6/s;->l:I

    .line 366
    .line 367
    const/16 v6, 0x1a0

    .line 368
    .line 369
    if-ne v5, v6, :cond_f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    sget-object v5, Lt6/A;->a:Ljava/util/regex/Pattern;

    .line 376
    .line 377
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-eqz v5, :cond_c

    .line 382
    .line 383
    move-wide/from16 v4, v16

    .line 384
    .line 385
    const/4 v7, 0x1

    .line 386
    goto :goto_9

    .line 387
    :cond_c
    sget-object v5, Lt6/A;->b:Ljava/util/regex/Pattern;

    .line 388
    .line 389
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    const/4 v7, 0x1

    .line 398
    if-eqz v5, :cond_d

    .line 399
    .line 400
    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 408
    .line 409
    .line 410
    move-result-wide v4

    .line 411
    goto :goto_9

    .line 412
    :cond_d
    move-wide/from16 v4, v16

    .line 413
    .line 414
    :goto_9
    cmp-long v4, v8, v4

    .line 415
    .line 416
    if-nez v4, :cond_f

    .line 417
    .line 418
    iput-boolean v7, v1, Lt6/s;->k:Z

    .line 419
    .line 420
    invoke-virtual/range {p0 .. p1}, Lt6/f;->n(Lt6/n;)V

    .line 421
    .line 422
    .line 423
    cmp-long v0, v10, v16

    .line 424
    .line 425
    if-eqz v0, :cond_e

    .line 426
    .line 427
    return-wide v10

    .line 428
    :cond_e
    return-wide v18

    .line 429
    :cond_f
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-eqz v0, :cond_11

    .line 434
    .line 435
    :try_start_5
    sget v2, Lu6/v;->a:I

    .line 436
    .line 437
    const/16 v2, 0x1000

    .line 438
    .line 439
    new-array v2, v2, [B

    .line 440
    .line 441
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 442
    .line 443
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 444
    .line 445
    .line 446
    :goto_a
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    const/4 v7, -0x1

    .line 451
    if-eq v5, v7, :cond_10

    .line 452
    .line 453
    invoke-virtual {v4, v2, v15, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 454
    .line 455
    .line 456
    goto :goto_a

    .line 457
    :cond_10
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 458
    .line 459
    .line 460
    goto :goto_b

    .line 461
    :cond_11
    sget v0, Lu6/v;->a:I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 462
    .line 463
    goto :goto_b

    .line 464
    :catch_4
    sget v0, Lu6/v;->a:I

    .line 465
    .line 466
    :goto_b
    invoke-virtual {v1}, Lt6/s;->o()V

    .line 467
    .line 468
    .line 469
    iget v0, v1, Lt6/s;->l:I

    .line 470
    .line 471
    if-ne v0, v6, :cond_12

    .line 472
    .line 473
    new-instance v0, Lt6/m;

    .line 474
    .line 475
    const/16 v2, 0x7d8

    .line 476
    .line 477
    invoke-direct {v0, v2}, Lt6/m;-><init>(I)V

    .line 478
    .line 479
    .line 480
    goto :goto_c

    .line 481
    :cond_12
    const/4 v0, 0x0

    .line 482
    :goto_c
    new-instance v2, Lt6/z;

    .line 483
    .line 484
    iget v4, v1, Lt6/s;->l:I

    .line 485
    .line 486
    invoke-direct {v2, v4, v0, v3}, Lt6/z;-><init>(ILt6/m;Ljava/util/Map;)V

    .line 487
    .line 488
    .line 489
    throw v2

    .line 490
    :catch_5
    move-exception v0

    .line 491
    invoke-virtual {v1}, Lt6/s;->o()V

    .line 492
    .line 493
    .line 494
    const/4 v7, 0x1

    .line 495
    invoke-static {v0, v7}, Lt6/x;->a(Ljava/io/IOException;I)Lt6/x;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    throw v0
.end method
