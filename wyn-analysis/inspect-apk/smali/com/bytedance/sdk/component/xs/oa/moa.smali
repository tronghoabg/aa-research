.class public Lcom/bytedance/sdk/component/xs/oa/moa;
.super Lcom/bytedance/sdk/component/xs/oa/yo;
.source "SourceFile"


# instance fields
.field uef:Lcom/bytedance/sdk/component/oa/uef/cq;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/yo;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 6
    .line 7
    return-void
.end method

.method private ivm(Ljava/lang/String;)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_4

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    new-array v1, v1, [B

    .line 13
    .line 14
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 17
    .line 18
    .line 19
    :try_start_1
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    .line 20
    .line 21
    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_2
    const-string v0, "utf-8"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v3, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    .line 33
    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 34
    .line 35
    .line 36
    :catch_0
    :goto_0
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :try_start_4
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    move-object v0, v3

    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-object v0, v3

    .line 48
    goto :goto_2

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :catchall_2
    move-exception p1

    .line 52
    move-object v2, v0

    .line 53
    :goto_1
    if-eqz v0, :cond_1

    .line 54
    .line 55
    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 56
    .line 57
    .line 58
    :catch_2
    :cond_1
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 61
    .line 62
    .line 63
    :try_start_6
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 64
    .line 65
    .line 66
    :catch_3
    :cond_2
    throw p1

    .line 67
    :catch_4
    move-object v2, v0

    .line 68
    :catch_5
    :goto_2
    if-eqz v0, :cond_3

    .line 69
    .line 70
    :try_start_7
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 71
    .line 72
    .line 73
    :catch_6
    :cond_3
    if-eqz v2, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_7
    :cond_4
    :goto_3
    return-object v1

    .line 77
    :cond_5
    :goto_4
    return-object v0
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/wk;)Lcom/bytedance/sdk/component/oa/uef/cz;
    .locals 0

    .line 73
    :try_start_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wk;->lw()Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/oa/uef/wk;)Lcom/bytedance/sdk/component/oa/uef/cz;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/oa/uef/wk;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object p0

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/cz;)Ljava/nio/charset/Charset;
    .locals 1

    if-eqz p1, :cond_0

    .line 71
    :try_start_0
    sget-object v0, Lcom/bytedance/sdk/component/oa/uef/oa/cz;->uef:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/bytedance/sdk/component/oa/uef/oa/cz;->uef:Ljava/nio/charset/Charset;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 72
    :catch_0
    sget-object p1, Lcom/bytedance/sdk/component/oa/uef/oa/cz;->uef:Ljava/nio/charset/Charset;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/oa/uef/cz;)Ljava/nio/charset/Charset;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;)Ljava/nio/charset/Charset;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/xs/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/xs/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 74
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->bcc()Lcom/bytedance/sdk/component/oa/uef/zjm;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/xs/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/zjm;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public lw(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "{}"

    .line 8
    .line 9
    :cond_0
    const-string v0, "application/json; charset=utf-8"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cz;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/cq;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 20
    .line 21
    return-void
.end method

.method public uef()Lcom/bytedance/sdk/component/xs/oa;
    .locals 13

    .line 27
    const-string v0, "content-type"

    :try_start_0
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 29
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    const-string v6, "URL_NULL_MSG"

    const-string v8, "URL_NULL_BODY"

    const-wide/16 v9, 0x1

    const-wide/16 v11, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x1388

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    return-object v3

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    .line 30
    :cond_0
    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 31
    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    if-nez v2, :cond_1

    .line 32
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    const-string v6, "BODY_NULL_MSG"

    const-string v8, "BODY_NULL_BODY"

    const-wide/16 v9, 0x1

    const-wide/16 v11, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x1388

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    return-object v3

    .line 33
    :cond_1
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 34
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 35
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 36
    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 37
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v1

    .line 39
    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v1

    .line 40
    invoke-interface {v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 41
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->cz()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/lang/String;)V

    .line 42
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 43
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v2

    if-eqz v2, :cond_4

    const/4 v3, 0x0

    .line 44
    :goto_0
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    move-result v4

    if-ge v3, v4, :cond_4

    .line 45
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    move-result-object v4

    .line 46
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    move-result-object v5

    .line 47
    invoke-virtual {v7, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_3

    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    if-nez v5, :cond_2

    .line 49
    const-string v4, ""

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v7, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 50
    :cond_4
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v0

    .line 51
    invoke-static {v7}, Lcom/bytedance/sdk/component/xs/yo/uef;->uef(Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 52
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wk;->moa()[B

    move-result-object v0

    .line 53
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v4

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v5

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v6

    .line 54
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v11

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 55
    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef([B)V

    goto :goto_2

    .line 56
    :cond_5
    iget-boolean v2, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->zjm:Z

    if-eqz v2, :cond_6

    .line 57
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wk;->moa()[B

    move-result-object v2

    .line 58
    new-instance v8, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/oa/uef/wk;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v8, v2, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 59
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v4

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v5

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v6

    .line 60
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v11

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 61
    invoke-virtual {v3, v2}, Lcom/bytedance/sdk/component/xs/oa;->uef([B)V

    goto :goto_2

    :cond_6
    if-eqz v0, :cond_7

    .line 62
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v4

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v5

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v6

    .line 63
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v11

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 64
    :goto_2
    invoke-direct {p0, v3, v1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V

    return-object v3

    .line 65
    :cond_7
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    const/4 v0, 0x0

    return-object v0

    .line 66
    :goto_3
    new-instance v1, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v7, 0x1

    const-wide/16 v9, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x1389

    const/4 v5, 0x0

    const-string v6, "BODY_NULL_BODY"

    invoke-direct/range {v1 .. v10}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    return-object v1
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 2

    .line 8
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Url is Empty"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 13
    :cond_1
    iget v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm:I

    if-lez v1, :cond_2

    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 15
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    if-nez v1, :cond_4

    if-eqz p1, :cond_3

    .line 17
    new-instance v0, Ljava/io/IOException;

    const-string v1, "RequestBody is null, content type is not support!!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_3
    return-void

    .line 18
    :cond_4
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 19
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 20
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    .line 22
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/component/xs/oa/moa$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/component/xs/oa/moa$1;-><init>(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/xs/uef/uef;)V

    .line 25
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 26
    :goto_0
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v1}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 67
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->ivm(Ljava/lang/String;)[B

    move-result-object p1

    .line 68
    const-string p2, "application/json; charset=utf-8"

    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Ljava/lang/String;[B)V

    .line 69
    const-string p1, "Content-Encoding"

    const-string p2, "gzip"

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 70
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->lw(Ljava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;[B)V
    .locals 0

    .line 7
    invoke-static {p1}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/cq;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;[B)Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    const-string p1, "{}"

    .line 6
    :goto_0
    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/cq;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa;->uef:Lcom/bytedance/sdk/component/oa/uef/cq;

    return-void
.end method
