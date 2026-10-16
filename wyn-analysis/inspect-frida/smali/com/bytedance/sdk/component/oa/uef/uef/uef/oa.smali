.class public Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/oa;


# static fields
.field private static lw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private moa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field oa:Lcom/bytedance/sdk/component/oa/uef/moa;

.field uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

.field private final yo:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw:Ljava/util/List;

    .line 7
    .line 8
    const-string v0, "com.android.okhttp.Protocol"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "HTTP_1_1"

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    const-string v1, "HTTP_2"

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/wrv;Lcom/bytedance/sdk/component/oa/uef/moa;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    .line 15
    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, "-"

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo:Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method

.method private lw()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "Content-Type"

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
.end method

.method private oa(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 25
    sget v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->uef:I

    const/4 v1, 0x0

    .line 26
    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/xs;->uef()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz p2, :cond_0

    .line 28
    :try_start_1
    const-string v1, "setting"

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->bcc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "gecko"

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->bcc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "load_ug_t"

    .line 29
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->bcc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 30
    invoke-static {v2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa(Ljava/net/HttpURLConnection;)V

    goto :goto_0

    :catch_0
    move-exception p2

    move-object v1, v2

    goto/16 :goto_4

    :catch_1
    move-exception v1

    goto/16 :goto_5

    .line 31
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 32
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->ivm()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 34
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 35
    const-string v6, "_disable_retry"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "1"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 36
    invoke-static {v2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo(Ljava/net/HttpURLConnection;)V

    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {v2, v4, v5}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 38
    :cond_3
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    if-eqz v1, :cond_5

    .line 39
    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/dj;->yo:Ljava/util/concurrent/TimeUnit;

    if-eqz v3, :cond_4

    .line 40
    iget-wide v4, v1, Lcom/bytedance/sdk/component/oa/uef/dj;->oa:J

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    long-to-int v1, v3

    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 41
    :cond_4
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/dj;->lw:Ljava/util/concurrent/TimeUnit;

    if-eqz v3, :cond_5

    .line 42
    iget-wide v4, v1, Lcom/bytedance/sdk/component/oa/uef/dj;->moa:J

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    long-to-int v1, v3

    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 43
    :cond_5
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v1

    if-nez v1, :cond_6

    .line 44
    const-string v1, "GET"

    invoke-virtual {v2, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    goto :goto_3

    .line 45
    :cond_6
    invoke-direct {p0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v1

    iget-object v1, v1, Lcom/bytedance/sdk/component/oa/uef/cq;->yo:Lcom/bytedance/sdk/component/oa/uef/cz;

    if-eqz v1, :cond_7

    .line 46
    const-string v1, "Content-Type"

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v3

    iget-object v3, v3, Lcom/bytedance/sdk/component/oa/uef/cq;->yo:Lcom/bytedance/sdk/component/oa/uef/cz;

    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :cond_7
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->lw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 48
    const-string v1, "POST"

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->lw()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 49
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 50
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 51
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v3

    iget-object v3, v3, Lcom/bytedance/sdk/component/oa/uef/cq;->lw:[B

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    goto :goto_2

    .line 52
    :cond_8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa(Lcom/bytedance/sdk/component/oa/uef/cq;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 53
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->zjm()Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object v3

    iget-object v3, v3, Lcom/bytedance/sdk/component/oa/uef/cq;->moa:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 54
    :cond_9
    :goto_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 55
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 56
    :cond_a
    :goto_3
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    if-eqz v1, :cond_b

    .line 57
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/yo/uef/uef;->oa()V

    .line 58
    :cond_b
    invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V

    .line 59
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    if-eqz v1, :cond_c

    .line 60
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/yo/uef/uef;->yo()V

    .line 61
    :cond_c
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 62
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    if-eqz v1, :cond_d

    .line 63
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/yo/uef/uef;->lw()V

    .line 64
    :cond_d
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 65
    sget v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->oa:I

    .line 66
    invoke-direct {p0, v2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Ljava/net/HttpURLConnection;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string p2, "internal error"

    goto :goto_6

    .line 67
    :cond_e
    :try_start_2
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    invoke-direct {v1, v2, p1, v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(Ljava/net/HttpURLConnection;Lcom/bytedance/sdk/component/oa/uef/wrv;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catch_2
    move-exception p2

    goto :goto_4

    :catch_3
    move-exception v2

    move-object v7, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_5

    .line 68
    :goto_4
    invoke-static {v1, p2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    :goto_5
    const/4 v3, -0x1

    if-ne v0, v3, :cond_f

    if-eqz p2, :cond_f

    .line 69
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/xs;->uef()Ljava/net/URL;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/URL;->toString()Ljava/lang/String;

    const/4 p2, 0x0

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    return-object p1

    .line 71
    :cond_f
    invoke-static {v2, v1}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p2

    .line 72
    :goto_6
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    invoke-direct {v1, v0, p2, p1}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/component/oa/uef/wrv;)V

    return-object v1
.end method

.method private static oa(Ljava/net/HttpURLConnection;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 73
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "delegate"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "client"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 78
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 79
    sget-object v2, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setProtocols"

    new-array v4, v1, [Ljava/lang/Class;

    const-class v5, Ljava/util/List;

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->lw:Ljava/util/List;

    aput-object v3, v1, v0

    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method private oa(Lcom/bytedance/sdk/component/oa/uef/cq;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    if-nez v1, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    const-string v2, "POST"

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->lw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 23
    :cond_1
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/cq;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    sget-object v2, Lcom/bytedance/sdk/component/oa/uef/cq$uef;->uef:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    if-eq v1, v2, :cond_2

    return v0

    .line 24
    :cond_2
    iget-object p1, p1, Lcom/bytedance/sdk/component/oa/uef/cq;->moa:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/util/List;)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/oa/uef/wrv;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/bytedance/sdk/component/oa/uef/dz;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 15
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/wrv;->moa()Lcom/bytedance/sdk/component/oa/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/xs;->uef()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    .line 16
    invoke-static {}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef()Lcom/bytedance/sdk/component/xs/yo/yo;

    move-result-object v0

    move-object/from16 v3, p2

    invoke-virtual {v0, v4, v3}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 18
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa()J

    move-result-wide v14

    .line 19
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v10

    const/4 v0, 0x0

    const/4 v3, 0x0

    move-object/from16 v16, v0

    move v5, v3

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v10, :cond_9

    .line 20
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_0

    .line 21
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    goto :goto_1

    :cond_0
    move v0, v3

    .line 22
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v12

    cmp-long v8, v8, v14

    if-lez v8, :cond_2

    .line 23
    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo:Ljava/lang/String;

    const/4 v8, 0x0

    add-int/lit8 v9, v5, 0x1

    const/4 v6, -0x1

    move-object v5, v7

    const-string v7, "Total timeout"

    invoke-static/range {v3 .. v10}, Lcom/bytedance/sdk/component/xs/uef;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    move-object v4, v5

    if-eqz v16, :cond_1

    return-object v16

    .line 24
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    const/4 v3, -0x1

    const-string v5, "Total timeout"

    invoke-direct {v0, v3, v5, v2, v4}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/lang/String;)V

    return-object v0

    :cond_2
    move-object/from16 v22, v7

    move v7, v5

    move-object/from16 v5, v22

    .line 25
    iget-object v8, v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 26
    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo:Ljava/lang/String;

    move v8, v6

    sget v6, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->oa:I

    move v9, v8

    const/4 v8, 0x0

    add-int/2addr v9, v7

    const-string v7, "Request canceled"

    invoke-static/range {v3 .. v10}, Lcom/bytedance/sdk/component/xs/uef;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    .line 27
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    sget v3, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->oa:I

    const-string v4, "Request canceled"

    invoke-direct {v0, v3, v4, v2, v5}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/lang/String;)V

    return-object v0

    :cond_3
    move v9, v6

    add-int/lit8 v6, v7, 0x1

    .line 28
    :try_start_0
    invoke-interface {v11}, Ljava/util/List;->size()I

    if-eqz v0, :cond_4

    move-object v0, v2

    goto :goto_2

    .line 29
    :cond_4
    invoke-direct {v1, v2, v5}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 30
    :goto_2
    invoke-static {}, Lcom/bytedance/sdk/component/xs/uef;->lw()Z

    move-result v8

    invoke-direct {v1, v0, v8}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v8

    .line 31
    instance-of v0, v8, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    if-eqz v0, :cond_5

    .line 32
    move-object v0, v8

    check-cast v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    invoke-virtual {v0, v5}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->uef(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    :goto_3
    move-wide/from16 v20, v12

    move v13, v7

    move v12, v9

    goto/16 :goto_7

    .line 33
    :cond_5
    :goto_4
    :try_start_1
    invoke-virtual {v8}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    if-eqz v0, :cond_6

    .line 34
    :try_start_2
    invoke-static {}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef()Lcom/bytedance/sdk/component/xs/yo/yo;

    move-result-object v0

    invoke-virtual {v0, v5, v4, v9}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v19, v8

    goto :goto_5

    :catch_1
    move-exception v0

    move-object/from16 v16, v8

    goto :goto_3

    .line 35
    :cond_6
    :try_start_3
    invoke-static {}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef()Lcom/bytedance/sdk/component/xs/yo/yo;

    move-result-object v0

    invoke-virtual {v0, v5, v4, v3}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef(Ljava/lang/String;Ljava/lang/String;Z)V

    move/from16 v16, v3

    .line 36
    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo:Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    move/from16 v17, v9

    move v9, v6

    :try_start_4
    invoke-virtual {v8}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    move/from16 v18, v7

    :try_start_5
    invoke-virtual {v8}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v7
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v19, v8

    const/4 v8, 0x1

    move-wide/from16 v20, v12

    move/from16 v12, v17

    move/from16 v13, v18

    :try_start_6
    invoke-static/range {v3 .. v10}, Lcom/bytedance/sdk/component/xs/uef;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    .line 37
    invoke-virtual/range {v19 .. v19}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    .line 38
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    sub-int/2addr v0, v12

    if-ne v13, v0, :cond_7

    :goto_5
    return-object v19

    :cond_7
    move-object/from16 v16, v19

    const/16 v17, 0x0

    goto :goto_8

    :catch_2
    move-exception v0

    :goto_6
    move-object/from16 v16, v19

    goto :goto_7

    :catch_3
    move-exception v0

    move-object/from16 v19, v8

    move-wide/from16 v20, v12

    move/from16 v12, v17

    move/from16 v13, v18

    goto :goto_6

    :catch_4
    move-exception v0

    move-object/from16 v19, v8

    move-wide/from16 v20, v12

    move/from16 v12, v17

    move v13, v7

    goto :goto_6

    :catch_5
    move-exception v0

    move-object/from16 v19, v8

    move-wide/from16 v20, v12

    move v13, v7

    move v12, v9

    goto :goto_6

    .line 39
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    invoke-static {}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef()Lcom/bytedance/sdk/component/xs/yo/yo;

    move-result-object v3

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v4, v6}, Lcom/bytedance/sdk/component/xs/yo/yo;->uef(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 41
    iget-object v3, v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->yo:Ljava/lang/String;

    move/from16 v17, v6

    sget v6, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->uef:I

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v9, v13, 0x1

    const/4 v8, 0x1

    invoke-static/range {v3 .. v10}, Lcom/bytedance/sdk/component/xs/uef;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    .line 42
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v12

    if-ne v13, v3, :cond_8

    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_8
    :goto_8
    add-int/lit8 v5, v13, 0x1

    move/from16 v3, v17

    move-wide/from16 v12, v20

    goto/16 :goto_0

    :cond_9
    move v12, v6

    if-eqz v16, :cond_a

    return-object v16

    .line 44
    :cond_a
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    sget v3, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->uef:I

    .line 45
    invoke-static {v12, v11}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/String;

    const-string v5, "No URLs to try"

    invoke-direct {v0, v3, v5, v2, v4}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/lang/String;)V

    return-object v0
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv;
    .locals 0

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->dj()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object p1

    return-object p1
.end method

.method private static uef(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    .line 51
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 52
    :catchall_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private uef(Ljava/net/HttpURLConnection;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 49
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v2, "POST"

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->lw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 4
    :cond_1
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/cq;->ivm:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    sget-object v2, Lcom/bytedance/sdk/component/oa/uef/cq$uef;->oa:Lcom/bytedance/sdk/component/oa/uef/cq$uef;

    if-eq v1, v2, :cond_2

    return v0

    .line 5
    :cond_2
    iget-object p1, p1, Lcom/bytedance/sdk/component/oa/uef/cq;->lw:[B

    if-eqz p1, :cond_4

    array-length p1, p1

    if-gtz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    return v0
.end method

.method private static yo(Ljava/net/HttpURLConnection;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "delegate"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 2
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 3
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "client"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 5
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 6
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "setRetryOnConnectionFailure"

    new-array v4, v1, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v3, v1, v0

    invoke-virtual {v2, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa()Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public moa()Lcom/bytedance/sdk/component/oa/uef/oa;
    .locals 3

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;-><init>(Lcom/bytedance/sdk/component/oa/uef/wrv;Lcom/bytedance/sdk/component/oa/uef/moa;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public oa()Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/yo/uef/uef;->dz()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/yo/uef/uef;->wk()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/yo/uef/uef;->uef()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->yo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    instance-of v1, v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/ivm;

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->yo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->uef()I

    move-result v0

    if-gt v1, v0, :cond_2

    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 10
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;

    sget v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;->uef:I

    const-string v2, "Maximum number of requests exceeded"

    iget-object v3, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/bcc;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/component/oa/uef/wrv;)V

    return-object v0

    .line 11
    :cond_3
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/dj;->uef:Ljava/util/List;

    if-eqz v0, :cond_4

    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    iget-object v1, v1, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    iget-object v1, v1, Lcom/bytedance/sdk/component/oa/uef/dj;->uef:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$1;-><init>(Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/oa/uef/bcc;

    new-instance v2, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;

    iget-object v3, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    invoke-direct {v2, v0, v3}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/yo;-><init>(Ljava/util/List;Lcom/bytedance/sdk/component/oa/uef/wrv;)V

    invoke-interface {v1, v2}, Lcom/bytedance/sdk/component/oa/uef/bcc;->uef(Lcom/bytedance/sdk/component/oa/uef/bcc$uef;)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 17
    :cond_4
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-object v0

    .line 19
    :goto_0
    :try_start_2
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 20
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    throw v0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/component/xs/uef;->lw()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    return-object p1
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    invoke-static {}, Lcom/bytedance/sdk/component/xs/uef;->ivm()Z

    move-result v0

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv;->uef()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    .line 10
    invoke-direct {p0, p1, v1}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;Ljava/util/List;)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    return-object p1

    .line 11
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv;Z)Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    return-object p1
.end method

.method public uef()Lcom/bytedance/sdk/component/oa/uef/wrv;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/bytedance/sdk/component/oa/uef/wrv;->oa:Lcom/bytedance/sdk/component/yo/uef/uef;

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/yo/uef/uef;->wk()V

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa:Lcom/bytedance/sdk/component/oa/uef/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->oa()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;

    iget-object v2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/wrv;->bcc()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef:Lcom/bytedance/sdk/component/oa/uef/wrv;

    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wrv;->cz()I

    move-result v3

    invoke-direct {v1, p0, v2, v3, p1}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;-><init>(Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;Ljava/lang/String;ILcom/bytedance/sdk/component/oa/uef/yo;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public yo()V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
