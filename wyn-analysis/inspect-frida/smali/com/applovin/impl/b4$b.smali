.class Lcom/applovin/impl/b4$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/b4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;

.field private final b:Lcom/applovin/impl/sdk/k;


# direct methods
.method private constructor <init>(Ljava/util/concurrent/BlockingQueue;ILcom/applovin/impl/sdk/k;)V
    .locals 0

    .line 2
    const-string p2, "AppLovinSdk:network"

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    if-eqz p3, :cond_0

    .line 3
    iput-object p1, p0, Lcom/applovin/impl/b4$b;->a:Ljava/util/concurrent/BlockingQueue;

    .line 4
    iput-object p3, p0, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    .line 5
    sget-object p1, Lcom/applovin/impl/y4;->S:Lcom/applovin/impl/y4;

    invoke-virtual {p3, p1}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setPriority(I)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No sdk specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No request queue specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/BlockingQueue;ILcom/applovin/impl/sdk/k;Lcom/applovin/impl/b4$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/b4$b;-><init>(Ljava/util/concurrent/BlockingQueue;ILcom/applovin/impl/sdk/k;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/b4$c;)Ljava/net/HttpURLConnection;
    .locals 3

    .line 4
    new-instance v0, Ljava/net/URL;

    invoke-static {p1}, Lcom/applovin/impl/b4$c;->c(Lcom/applovin/impl/b4$c;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 6
    invoke-static {p1}, Lcom/applovin/impl/b4$c;->d(Lcom/applovin/impl/b4$c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 7
    invoke-static {p1}, Lcom/applovin/impl/b4$c;->e(Lcom/applovin/impl/b4$c;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 8
    invoke-static {p1}, Lcom/applovin/impl/b4$c;->e(Lcom/applovin/impl/b4$c;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 10
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 11
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 13
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 14
    invoke-static {p1}, Lcom/applovin/impl/b4$c;->f(Lcom/applovin/impl/b4$c;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 15
    invoke-static {p1}, Lcom/applovin/impl/b4$c;->f(Lcom/applovin/impl/b4$c;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/b4$b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/applovin/impl/b4$c;

    .line 2
    invoke-direct {p0, v0}, Lcom/applovin/impl/b4$b;->b(Lcom/applovin/impl/b4$c;)V

    return-void
.end method

.method private static synthetic a(Lcom/applovin/impl/b4$c;Lcom/applovin/impl/b4$d;)V
    .locals 0

    .line 3
    invoke-static {p0}, Lcom/applovin/impl/b4$c;->g(Lcom/applovin/impl/b4$c;)Lj1/a;

    move-result-object p0

    invoke-interface {p0, p1}, Lj1/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private b(Lcom/applovin/impl/b4$c;)V
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "processRequest"

    const-string v3, "details"

    const-string v4, "NetworkCommunicationThread"

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 3
    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/applovin/impl/b4$b;->a(Lcom/applovin/impl/b4$c;)Ljava/net/HttpURLConnection;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 4
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/applovin/impl/b4$c;->a(Lcom/applovin/impl/b4$c;)[B

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static/range {p1 .. p1}, Lcom/applovin/impl/b4$c;->a(Lcom/applovin/impl/b4$c;)[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-virtual {v9, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 6
    invoke-static/range {p1 .. p1}, Lcom/applovin/impl/b4$c;->a(Lcom/applovin/impl/b4$c;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 7
    :try_start_2
    invoke-virtual {v9}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 8
    :try_start_3
    invoke-static/range {p1 .. p1}, Lcom/applovin/impl/b4$c;->a(Lcom/applovin/impl/b4$c;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 9
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v11, v0

    if-eqz v10, :cond_0

    .line 10
    :try_start_5
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v11, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 11
    :goto_1
    :try_start_7
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 12
    const-string v11, "outputStream"

    invoke-static {v3, v11, v10}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 13
    iget-object v11, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v11}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    move-result-object v11

    invoke-virtual {v11, v4, v2, v0, v10}, Lcom/applovin/impl/r1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 14
    throw v0

    :catchall_3
    move-exception v0

    move-object v13, v8

    :goto_2
    move-object v10, v9

    move v9, v7

    :goto_3
    move-wide v6, v5

    move-object v5, v0

    goto :goto_9

    .line 15
    :cond_1
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    .line 16
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v7

    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    if-lez v7, :cond_4

    .line 18
    :try_start_8
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v12
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 19
    :try_start_9
    iget-object v0, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-static {v12, v0}, Lcom/applovin/impl/r0;->a(Ljava/io/InputStream;Lcom/applovin/impl/sdk/k;)[B

    move-result-object v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    if-eqz v12, :cond_2

    .line 20
    :try_start_a
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    goto :goto_8

    :cond_2
    :goto_5
    move-object v0, v8

    move-object v2, v0

    :goto_6
    move-object v8, v13

    goto/16 :goto_e

    :catchall_5
    move-exception v0

    move-object v10, v0

    if-eqz v12, :cond_3

    .line 21
    :try_start_b
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_7

    :catchall_6
    move-exception v0

    :try_start_c
    invoke-virtual {v10, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_7

    :catchall_7
    move-exception v0

    move-object v13, v8

    goto :goto_8

    :cond_3
    :goto_7
    throw v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 22
    :goto_8
    :try_start_d
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 23
    const-string v11, "responseDataInputStream"

    invoke-static {v3, v11, v10}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    iget-object v11, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v11}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    move-result-object v11

    invoke-virtual {v11, v4, v2, v0, v10}, Lcom/applovin/impl/r1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 25
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_2

    :cond_4
    move-object v0, v8

    move-object v2, v0

    goto/16 :goto_e

    :catchall_9
    move-exception v0

    move v9, v7

    move-object v10, v8

    move-object v13, v10

    goto :goto_3

    .line 26
    :goto_9
    :try_start_e
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    .line 27
    iget-object v0, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    iget-object v0, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object v0

    const-string v14, "Failed to make HTTP request"

    invoke-virtual {v0, v4, v14, v5}, Lcom/applovin/impl/sdk/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    goto :goto_a

    :catchall_a
    move-exception v0

    goto/16 :goto_f

    :cond_5
    :goto_a
    if-eqz v10, :cond_6

    .line 29
    :try_start_f
    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v14
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    .line 30
    :try_start_10
    iget-object v0, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-static {v14, v0}, Lcom/applovin/impl/r0;->a(Ljava/io/InputStream;Lcom/applovin/impl/sdk/k;)[B

    move-result-object v8
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    if-eqz v14, :cond_6

    .line 31
    :try_start_11
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    goto :goto_b

    :catchall_b
    move-exception v0

    goto :goto_d

    :cond_6
    :goto_b
    move-object v2, v5

    move-wide v5, v6

    move-object v0, v8

    move v7, v9

    move-object v9, v10

    move-wide v10, v11

    goto :goto_6

    :catchall_c
    move-exception v0

    move-object v15, v0

    if-eqz v14, :cond_7

    .line 32
    :try_start_12
    invoke-virtual {v14}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    goto :goto_c

    :catchall_d
    move-exception v0

    :try_start_13
    invoke-virtual {v15, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_c
    throw v15
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 33
    :goto_d
    :try_start_14
    iget-object v14, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v14}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object v14

    invoke-virtual {v14, v4, v5}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 35
    const-string v15, "responseErrorDataInputStream"

    invoke-static {v3, v15, v14}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->putStringIfValid(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 36
    iget-object v3, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v3}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    move-result-object v3

    invoke-virtual {v3, v4, v2, v0, v14}, Lcom/applovin/impl/r1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    goto :goto_b

    .line 37
    :goto_e
    iget-object v3, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-static {v9, v3}, Lcom/applovin/impl/o7;->a(Ljava/net/HttpURLConnection;Lcom/applovin/impl/sdk/k;)V

    .line 38
    invoke-static {}, Lcom/applovin/impl/b4$d;->a()Lcom/applovin/impl/b4$d$a;

    move-result-object v3

    .line 39
    invoke-virtual {v3, v7}, Lcom/applovin/impl/b4$d$a;->a(I)Lcom/applovin/impl/b4$d$a;

    move-result-object v3

    .line 40
    invoke-virtual {v3, v8}, Lcom/applovin/impl/b4$d$a;->a([B)Lcom/applovin/impl/b4$d$a;

    move-result-object v3

    .line 41
    invoke-virtual {v3, v0}, Lcom/applovin/impl/b4$d$a;->b([B)Lcom/applovin/impl/b4$d$a;

    move-result-object v0

    sub-long/2addr v10, v5

    .line 42
    invoke-virtual {v0, v10, v11}, Lcom/applovin/impl/b4$d$a;->a(J)Lcom/applovin/impl/b4$d$a;

    move-result-object v0

    .line 43
    invoke-virtual {v0, v2}, Lcom/applovin/impl/b4$d$a;->a(Ljava/lang/Throwable;)Lcom/applovin/impl/b4$d$a;

    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/applovin/impl/b4$d$a;->a()Lcom/applovin/impl/b4$d;

    move-result-object v0

    .line 45
    invoke-static/range {p1 .. p1}, Lcom/applovin/impl/b4$c;->b(Lcom/applovin/impl/b4$c;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/applovin/impl/F;

    const/4 v4, 0x0

    move-object/from16 v5, p1

    invoke-direct {v3, v4, v5, v0}, Lcom/applovin/impl/F;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 46
    :goto_f
    iget-object v2, v1, Lcom/applovin/impl/b4$b;->b:Lcom/applovin/impl/sdk/k;

    invoke-static {v10, v2}, Lcom/applovin/impl/o7;->a(Ljava/net/HttpURLConnection;Lcom/applovin/impl/sdk/k;)V

    .line 47
    throw v0
.end method

.method public static synthetic b(Lcom/applovin/impl/b4$c;Lcom/applovin/impl/b4$d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/applovin/impl/b4$b;->a(Lcom/applovin/impl/b4$c;Lcom/applovin/impl/b4$d;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    :goto_0
    :try_start_0
    invoke-direct {p0}, Lcom/applovin/impl/b4$b;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 15
    .line 16
    .line 17
    goto :goto_0
.end method
