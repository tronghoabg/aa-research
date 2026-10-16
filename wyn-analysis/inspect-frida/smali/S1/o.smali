.class public final LS1/o;
.super LS1/c;
.source "SourceFile"


# instance fields
.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:LS1/v;

.field public final j:LS1/v;

.field public k:LS1/k;

.field public l:Ljava/net/HttpURLConnection;

.field public m:Ljava/io/InputStream;

.field public n:Z

.field public o:I

.field public p:J

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZLS1/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LS1/c;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LS1/o;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput p2, p0, LS1/o;->f:I

    .line 8
    .line 9
    iput p3, p0, LS1/o;->g:I

    .line 10
    .line 11
    iput-boolean p4, p0, LS1/o;->e:Z

    .line 12
    .line 13
    iput-object p5, p0, LS1/o;->i:LS1/v;

    .line 14
    .line 15
    new-instance p1, LS1/v;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p2}, LS1/v;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LS1/o;->j:LS1/v;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, LS1/o;->m:Ljava/io/InputStream;
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
    new-instance v3, LS1/s;

    .line 15
    .line 16
    sget v4, LQ1/x;->a:I

    .line 17
    .line 18
    const/16 v4, 0x7d0

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    invoke-direct {v3, v2, v4, v5}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 22
    .line 23
    .line 24
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :cond_0
    :goto_0
    iput-object v1, p0, LS1/o;->m:Ljava/io/InputStream;

    .line 26
    .line 27
    invoke-virtual {p0}, LS1/o;->q()V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, p0, LS1/o;->n:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, LS1/o;->n:Z

    .line 35
    .line 36
    invoke-virtual {p0}, LS1/c;->l()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v1, p0, LS1/o;->l:Ljava/net/HttpURLConnection;

    .line 40
    .line 41
    iput-object v1, p0, LS1/o;->k:LS1/k;

    .line 42
    .line 43
    return-void

    .line 44
    :goto_1
    iput-object v1, p0, LS1/o;->m:Ljava/io/InputStream;

    .line 45
    .line 46
    invoke-virtual {p0}, LS1/o;->q()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, p0, LS1/o;->n:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iput-boolean v0, p0, LS1/o;->n:Z

    .line 54
    .line 55
    invoke-virtual {p0}, LS1/c;->l()V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-object v1, p0, LS1/o;->l:Ljava/net/HttpURLConnection;

    .line 59
    .line 60
    iput-object v1, p0, LS1/o;->k:LS1/k;

    .line 61
    .line 62
    throw v2
.end method

.method public final d()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, LS1/o;->l:Ljava/net/HttpURLConnection;

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
    const/4 v2, 0x0

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
    iget-object v0, p0, LS1/o;->l:Ljava/net/HttpURLConnection;

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
    iget-object v0, p0, LS1/o;->k:LS1/k;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, LS1/k;->a:Landroid/net/Uri;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final q()V
    .locals 3

    .line 1
    iget-object v0, p0, LS1/o;->l:Ljava/net/HttpURLConnection;

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
    invoke-static {v1, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final r(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v2, "https"

    .line 15
    .line 16
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const-string v2, "http"

    .line 23
    .line 24
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, LS1/s;

    .line 32
    .line 33
    const-string v1, "Unsupported protocol redirect: "

    .line 34
    .line 35
    invoke-static {v1, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2, v0}, LS1/s;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    :goto_0
    iget-boolean v2, p0, LS1/o;->e:Z

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance v1, LS1/s;

    .line 59
    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v3, "Disallowed cross-protocol redirect ("

    .line 63
    .line 64
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, " to "

    .line 75
    .line 76
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, ")"

    .line 83
    .line 84
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v1, p1, v0}, LS1/s;-><init>(Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    throw v1

    .line 95
    :cond_3
    :goto_1
    return-object v1

    .line 96
    :catch_0
    move-exception p1

    .line 97
    new-instance p2, LS1/s;

    .line 98
    .line 99
    const/4 v1, 0x1

    .line 100
    invoke-direct {p2, p1, v0, v1}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :cond_4
    new-instance p1, LS1/s;

    .line 105
    .line 106
    const-string p2, "Null location redirect"

    .line 107
    .line 108
    invoke-direct {p1, p2, v0}, LS1/s;-><init>(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    throw p1
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
    iget-wide v0, p0, LS1/o;->p:J

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
    iget-wide v4, p0, LS1/o;->q:J

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
    iget-object v0, p0, LS1/o;->m:Ljava/io/InputStream;

    .line 31
    .line 32
    sget v1, LQ1/x;->a:I

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
    iget-wide p2, p0, LS1/o;->q:J

    .line 42
    .line 43
    int-to-long v0, p1

    .line 44
    add-long/2addr p2, v0

    .line 45
    iput-wide p2, p0, LS1/o;->q:J

    .line 46
    .line 47
    invoke-virtual {p0, p1}, LS1/c;->b(I)V
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
    sget p2, LQ1/x;->a:I

    .line 53
    .line 54
    const/4 p2, 0x2

    .line 55
    invoke-static {p1, p2}, LS1/s;->a(Ljava/io/IOException;I)LS1/s;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
.end method

.method public final s(LS1/k;)Ljava/net/HttpURLConnection;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    iget-object v2, v11, LS1/k;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v2, v11, LS1/k;->h:I

    .line 17
    .line 18
    const/4 v12, 0x1

    .line 19
    and-int/2addr v2, v12

    .line 20
    const/4 v3, 0x0

    .line 21
    if-ne v2, v12, :cond_0

    .line 22
    .line 23
    move v8, v12

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v8, v3

    .line 26
    :goto_0
    iget-boolean v2, v0, LS1/o;->e:Z

    .line 27
    .line 28
    move v4, v2

    .line 29
    iget v2, v11, LS1/k;->b:I

    .line 30
    .line 31
    move v5, v3

    .line 32
    iget-object v3, v11, LS1/k;->c:[B

    .line 33
    .line 34
    move v7, v4

    .line 35
    move v6, v5

    .line 36
    iget-wide v4, v11, LS1/k;->e:J

    .line 37
    .line 38
    move v9, v6

    .line 39
    move v10, v7

    .line 40
    iget-wide v6, v11, LS1/k;->f:J

    .line 41
    .line 42
    if-nez v10, :cond_1

    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    iget-object v10, v11, LS1/k;->d:Ljava/util/Map;

    .line 46
    .line 47
    invoke-virtual/range {v0 .. v10}, LS1/o;->t(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    return-object v1

    .line 52
    :cond_1
    move-object v0, v3

    .line 53
    move v3, v9

    .line 54
    :goto_1
    add-int/lit8 v13, v3, 0x1

    .line 55
    .line 56
    const/16 v9, 0x14

    .line 57
    .line 58
    if-gt v3, v9, :cond_7

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    iget-object v10, v11, LS1/k;->d:Ljava/util/Map;

    .line 62
    .line 63
    move-object v3, v0

    .line 64
    move-object/from16 v0, p0

    .line 65
    .line 66
    invoke-virtual/range {v0 .. v10}, LS1/o;->t(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v14, "Location"

    .line 75
    .line 76
    invoke-virtual {v9, v14}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    const/16 v15, 0x12e

    .line 81
    .line 82
    if-eq v2, v12, :cond_2

    .line 83
    .line 84
    const/4 v12, 0x3

    .line 85
    if-ne v2, v12, :cond_3

    .line 86
    .line 87
    :cond_2
    const/16 v12, 0x12c

    .line 88
    .line 89
    if-eq v10, v12, :cond_6

    .line 90
    .line 91
    const/16 v12, 0x12d

    .line 92
    .line 93
    if-eq v10, v12, :cond_6

    .line 94
    .line 95
    if-eq v10, v15, :cond_6

    .line 96
    .line 97
    const/16 v12, 0x12f

    .line 98
    .line 99
    if-eq v10, v12, :cond_6

    .line 100
    .line 101
    const/16 v12, 0x133

    .line 102
    .line 103
    if-eq v10, v12, :cond_6

    .line 104
    .line 105
    const/16 v12, 0x134

    .line 106
    .line 107
    if-ne v10, v12, :cond_3

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_3
    const/4 v3, 0x2

    .line 111
    if-ne v2, v3, :cond_5

    .line 112
    .line 113
    const/16 v12, 0x12c

    .line 114
    .line 115
    if-eq v10, v12, :cond_4

    .line 116
    .line 117
    const/16 v12, 0x12d

    .line 118
    .line 119
    if-eq v10, v12, :cond_4

    .line 120
    .line 121
    if-eq v10, v15, :cond_4

    .line 122
    .line 123
    const/16 v12, 0x12f

    .line 124
    .line 125
    if-ne v10, v12, :cond_5

    .line 126
    .line 127
    :cond_4
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1, v14}, LS1/o;->r(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const/4 v2, 0x0

    .line 135
    const/4 v3, 0x1

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    return-object v9

    .line 138
    :cond_6
    :goto_2
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1, v14}, LS1/o;->r(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    move-object/from16 v16, v3

    .line 146
    .line 147
    move v3, v2

    .line 148
    move-object/from16 v2, v16

    .line 149
    .line 150
    :goto_3
    move-object v0, v2

    .line 151
    move v2, v3

    .line 152
    move v3, v13

    .line 153
    const/4 v12, 0x1

    .line 154
    goto :goto_1

    .line 155
    :cond_7
    move-object/from16 v0, p0

    .line 156
    .line 157
    new-instance v1, LS1/s;

    .line 158
    .line 159
    new-instance v2, Ljava/net/NoRouteToHostException;

    .line 160
    .line 161
    const-string v3, "Too many redirects: "

    .line 162
    .line 163
    invoke-static {v13, v3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-direct {v2, v3}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/16 v3, 0x7d1

    .line 171
    .line 172
    const/4 v4, 0x1

    .line 173
    invoke-direct {v1, v2, v3, v4}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 174
    .line 175
    .line 176
    throw v1
.end method

.method public final t(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
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
    iget v0, p0, LS1/o;->f:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, LS1/o;->g:I

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
    iget-object v1, p0, LS1/o;->i:LS1/v;

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
    iget-object v1, p0, LS1/o;->j:LS1/v;

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
    sget-object p10, LS1/w;->a:Ljava/util/regex/Pattern;

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
    iget-object p4, p0, LS1/o;->h:Ljava/lang/String;

    .line 128
    .line 129
    if-eqz p4, :cond_5

    .line 130
    .line 131
    const-string p5, "User-Agent"

    .line 132
    .line 133
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    if-eqz p8, :cond_6

    .line 137
    .line 138
    const-string p4, "gzip"

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    const-string p4, "identity"

    .line 142
    .line 143
    :goto_2
    const-string p5, "Accept-Encoding"

    .line 144
    .line 145
    invoke-virtual {p1, p5, p4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 149
    .line 150
    .line 151
    const/4 p4, 0x1

    .line 152
    if-eqz p3, :cond_7

    .line 153
    .line 154
    move p5, p4

    .line 155
    goto :goto_3

    .line 156
    :cond_7
    const/4 p5, 0x0

    .line 157
    :goto_3
    invoke-virtual {p1, p5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 158
    .line 159
    .line 160
    sget p5, LS1/k;->i:I

    .line 161
    .line 162
    if-eq p2, p4, :cond_a

    .line 163
    .line 164
    const/4 p4, 0x2

    .line 165
    if-eq p2, p4, :cond_9

    .line 166
    .line 167
    const/4 p4, 0x3

    .line 168
    if-ne p2, p4, :cond_8

    .line 169
    .line 170
    const-string p2, "HEAD"

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 174
    .line 175
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :cond_9
    const-string p2, "POST"

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    const-string p2, "GET"

    .line 183
    .line 184
    :goto_4
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    if-eqz p3, :cond_b

    .line 188
    .line 189
    array-length p2, p3

    .line 190
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p2, p3}, Ljava/io/OutputStream;->write([B)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V

    .line 204
    .line 205
    .line 206
    return-object p1

    .line 207
    :cond_b
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 208
    .line 209
    .line 210
    return-object p1
.end method

.method public final u(J)V
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
    iget-object v5, p0, LS1/o;->m:Ljava/io/InputStream;

    .line 23
    .line 24
    sget v6, LQ1/x;->a:I

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
    invoke-virtual {p0, v4}, LS1/c;->b(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, LS1/s;

    .line 51
    .line 52
    invoke-direct {p1}, LS1/s;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    new-instance p1, LS1/s;

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
    invoke-direct {p1, p2, v0, v1}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_3
    :goto_1
    return-void
.end method

.method public final y(LS1/k;)J
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iput-object v0, v1, LS1/o;->k:LS1/k;

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    iput-wide v2, v1, LS1/o;->q:J

    .line 10
    .line 11
    iput-wide v2, v1, LS1/o;->p:J

    .line 12
    .line 13
    invoke-virtual {v1}, LS1/c;->m()V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    :try_start_0
    invoke-virtual/range {p0 .. p1}, LS1/o;->s(LS1/k;)Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iput-object v5, v1, LS1/o;->l:Ljava/net/HttpURLConnection;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iput v6, v1, LS1/o;->o:I

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6

    .line 30
    .line 31
    .line 32
    iget v6, v1, LS1/o;->o:I

    .line 33
    .line 34
    const-string v7, "Content-Range"

    .line 35
    .line 36
    const/16 v8, 0xc8

    .line 37
    .line 38
    const-wide/16 v9, -0x1

    .line 39
    .line 40
    iget-wide v11, v0, LS1/k;->e:J

    .line 41
    .line 42
    iget-wide v13, v0, LS1/k;->f:J

    .line 43
    .line 44
    if-lt v6, v8, :cond_0

    .line 45
    .line 46
    const/16 v15, 0x12b

    .line 47
    .line 48
    if-le v6, v15, :cond_1

    .line 49
    .line 50
    :cond_0
    move-wide/from16 v16, v2

    .line 51
    .line 52
    move-object/from16 v24, v5

    .line 53
    .line 54
    move-wide/from16 v18, v9

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_1
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    iget v6, v1, LS1/o;->o:I

    .line 62
    .line 63
    if-ne v6, v8, :cond_2

    .line 64
    .line 65
    cmp-long v6, v11, v2

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-wide v11, v2

    .line 71
    :goto_0
    const-string v6, "Content-Encoding"

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v8, "gzip"

    .line 78
    .line 79
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_9

    .line 84
    .line 85
    cmp-long v8, v13, v9

    .line 86
    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    iput-wide v13, v1, LS1/o;->p:J

    .line 90
    .line 91
    move-object/from16 v24, v5

    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_3
    const-string v8, "Content-Length"

    .line 96
    .line 97
    invoke-virtual {v5, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v5, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    sget-object v13, LS1/w;->a:Ljava/util/regex/Pattern;

    .line 106
    .line 107
    const-string v13, "Inconsistent headers ["

    .line 108
    .line 109
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v14

    .line 113
    const-string v15, "]"

    .line 114
    .line 115
    move-wide/from16 v16, v2

    .line 116
    .line 117
    const-string v2, "HttpUtil"

    .line 118
    .line 119
    if-nez v14, :cond_4

    .line 120
    .line 121
    :try_start_1
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v18
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    move-wide/from16 v25, v18

    .line 126
    .line 127
    move-wide/from16 v18, v9

    .line 128
    .line 129
    move-wide/from16 v9, v25

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v14, "Unexpected Content-Length ["

    .line 135
    .line 136
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v2, v3}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    move-wide/from16 v18, v9

    .line 153
    .line 154
    :goto_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_6

    .line 159
    .line 160
    sget-object v3, LS1/w;->a:Ljava/util/regex/Pattern;

    .line 161
    .line 162
    invoke-virtual {v3, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-eqz v14, :cond_6

    .line 171
    .line 172
    const/4 v14, 0x2

    .line 173
    :try_start_2
    invoke-virtual {v3, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v20

    .line 184
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v22
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 195
    sub-long v20, v20, v22

    .line 196
    .line 197
    const-wide/16 v22, 0x1

    .line 198
    .line 199
    move-object/from16 v24, v5

    .line 200
    .line 201
    add-long v4, v20, v22

    .line 202
    .line 203
    cmp-long v14, v9, v16

    .line 204
    .line 205
    if-gez v14, :cond_5

    .line 206
    .line 207
    move-wide v9, v4

    .line 208
    goto :goto_2

    .line 209
    :cond_5
    cmp-long v14, v9, v4

    .line 210
    .line 211
    if-eqz v14, :cond_7

    .line 212
    .line 213
    :try_start_3
    new-instance v14, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v8, "] ["

    .line 222
    .line 223
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    invoke-static {v2, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 240
    .line 241
    .line 242
    move-result-wide v9
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 243
    goto :goto_2

    .line 244
    :catch_1
    move-object/from16 v24, v5

    .line 245
    .line 246
    :catch_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    const-string v5, "Unexpected Content-Range ["

    .line 249
    .line 250
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-static {v2, v4}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_6
    move-object/from16 v24, v5

    .line 268
    .line 269
    :cond_7
    :goto_2
    cmp-long v2, v9, v18

    .line 270
    .line 271
    if-eqz v2, :cond_8

    .line 272
    .line 273
    sub-long/2addr v9, v11

    .line 274
    goto :goto_3

    .line 275
    :cond_8
    move-wide/from16 v9, v18

    .line 276
    .line 277
    :goto_3
    iput-wide v9, v1, LS1/o;->p:J

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_9
    move-object/from16 v24, v5

    .line 281
    .line 282
    iput-wide v13, v1, LS1/o;->p:J

    .line 283
    .line 284
    :goto_4
    const/16 v2, 0x7d0

    .line 285
    .line 286
    :try_start_4
    invoke-virtual/range {v24 .. v24}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    iput-object v4, v1, LS1/o;->m:Ljava/io/InputStream;

    .line 291
    .line 292
    if-eqz v6, :cond_a

    .line 293
    .line 294
    new-instance v4, Ljava/util/zip/GZIPInputStream;

    .line 295
    .line 296
    iget-object v5, v1, LS1/o;->m:Ljava/io/InputStream;

    .line 297
    .line 298
    invoke-direct {v4, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 299
    .line 300
    .line 301
    iput-object v4, v1, LS1/o;->m:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 302
    .line 303
    :cond_a
    const/4 v3, 0x1

    .line 304
    goto :goto_5

    .line 305
    :catch_3
    move-exception v0

    .line 306
    const/4 v3, 0x1

    .line 307
    goto :goto_6

    .line 308
    :goto_5
    iput-boolean v3, v1, LS1/o;->n:Z

    .line 309
    .line 310
    invoke-virtual/range {p0 .. p1}, LS1/c;->o(LS1/k;)V

    .line 311
    .line 312
    .line 313
    :try_start_5
    invoke-virtual {v1, v11, v12}, LS1/o;->u(J)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 314
    .line 315
    .line 316
    iget-wide v2, v1, LS1/o;->p:J

    .line 317
    .line 318
    return-wide v2

    .line 319
    :catch_4
    move-exception v0

    .line 320
    invoke-virtual {v1}, LS1/o;->q()V

    .line 321
    .line 322
    .line 323
    instance-of v4, v0, LS1/s;

    .line 324
    .line 325
    if-eqz v4, :cond_b

    .line 326
    .line 327
    check-cast v0, LS1/s;

    .line 328
    .line 329
    throw v0

    .line 330
    :cond_b
    new-instance v4, LS1/s;

    .line 331
    .line 332
    const/4 v3, 0x1

    .line 333
    invoke-direct {v4, v0, v2, v3}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 334
    .line 335
    .line 336
    throw v4

    .line 337
    :goto_6
    invoke-virtual {v1}, LS1/o;->q()V

    .line 338
    .line 339
    .line 340
    new-instance v4, LS1/s;

    .line 341
    .line 342
    invoke-direct {v4, v0, v2, v3}, LS1/s;-><init>(Ljava/io/IOException;II)V

    .line 343
    .line 344
    .line 345
    throw v4

    .line 346
    :goto_7
    invoke-virtual/range {v24 .. v24}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    iget v4, v1, LS1/o;->o:I

    .line 351
    .line 352
    const/16 v5, 0x1a0

    .line 353
    .line 354
    if-ne v4, v5, :cond_f

    .line 355
    .line 356
    move-object/from16 v4, v24

    .line 357
    .line 358
    invoke-virtual {v4, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    sget-object v7, LS1/w;->a:Ljava/util/regex/Pattern;

    .line 363
    .line 364
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    if-eqz v7, :cond_c

    .line 369
    .line 370
    move-wide/from16 v6, v18

    .line 371
    .line 372
    const/4 v3, 0x1

    .line 373
    goto :goto_8

    .line 374
    :cond_c
    sget-object v7, LS1/w;->b:Ljava/util/regex/Pattern;

    .line 375
    .line 376
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    const/4 v3, 0x1

    .line 385
    if-eqz v7, :cond_d

    .line 386
    .line 387
    invoke-virtual {v6, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 395
    .line 396
    .line 397
    move-result-wide v6

    .line 398
    goto :goto_8

    .line 399
    :cond_d
    move-wide/from16 v6, v18

    .line 400
    .line 401
    :goto_8
    cmp-long v6, v11, v6

    .line 402
    .line 403
    if-nez v6, :cond_10

    .line 404
    .line 405
    iput-boolean v3, v1, LS1/o;->n:Z

    .line 406
    .line 407
    invoke-virtual/range {p0 .. p1}, LS1/c;->o(LS1/k;)V

    .line 408
    .line 409
    .line 410
    cmp-long v0, v13, v18

    .line 411
    .line 412
    if-eqz v0, :cond_e

    .line 413
    .line 414
    return-wide v13

    .line 415
    :cond_e
    return-wide v16

    .line 416
    :cond_f
    move-object/from16 v4, v24

    .line 417
    .line 418
    :cond_10
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    if-eqz v0, :cond_11

    .line 423
    .line 424
    :try_start_6
    invoke-static {v0}, Lm8/g;->b(Ljava/io/InputStream;)[B

    .line 425
    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_11
    sget v0, LQ1/x;->a:I
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :catch_5
    sget v0, LQ1/x;->a:I

    .line 432
    .line 433
    :goto_9
    invoke-virtual {v1}, LS1/o;->q()V

    .line 434
    .line 435
    .line 436
    iget v0, v1, LS1/o;->o:I

    .line 437
    .line 438
    if-ne v0, v5, :cond_12

    .line 439
    .line 440
    new-instance v0, LS1/i;

    .line 441
    .line 442
    const/16 v3, 0x7d8

    .line 443
    .line 444
    invoke-direct {v0, v3}, LS1/i;-><init>(I)V

    .line 445
    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_12
    const/4 v0, 0x0

    .line 449
    :goto_a
    new-instance v3, LS1/u;

    .line 450
    .line 451
    iget v4, v1, LS1/o;->o:I

    .line 452
    .line 453
    invoke-direct {v3, v4, v0, v2}, LS1/u;-><init>(ILS1/i;Ljava/util/Map;)V

    .line 454
    .line 455
    .line 456
    throw v3

    .line 457
    :catch_6
    move-exception v0

    .line 458
    invoke-virtual {v1}, LS1/o;->q()V

    .line 459
    .line 460
    .line 461
    const/4 v3, 0x1

    .line 462
    invoke-static {v0, v3}, LS1/s;->a(Ljava/io/IOException;I)LS1/s;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    throw v0
.end method
