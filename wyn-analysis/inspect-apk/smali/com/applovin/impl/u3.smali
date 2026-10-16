.class public final Lcom/applovin/impl/u3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/HashMap;

.field private static final e:Ljava/lang/Object;

.field private static final f:Ljava/util/HashMap;

.field private static final g:Ljava/lang/Object;

.field private static final h:Ljava/util/HashMap;

.field private static final i:Ljava/lang/Object;


# instance fields
.field private final a:Lcom/applovin/impl/sdk/k;

.field private final b:Lorg/json/JSONObject;

.field private final c:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/applovin/impl/u3;->d:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/applovin/impl/u3;->e:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/applovin/impl/u3;->f:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/applovin/impl/u3;->g:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/applovin/impl/u3;->h:Ljava/util/HashMap;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/applovin/impl/u3;->i:Ljava/lang/Object;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Lcom/applovin/impl/sdk/k;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    .line 5
    .line 6
    sget-object p1, Lcom/applovin/impl/r3;->w8:Lcom/applovin/impl/y4;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/y4;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/applovin/impl/u3;->b:Lorg/json/JSONObject;

    .line 13
    .line 14
    sget-object p1, Lcom/applovin/impl/r3;->v8:Lcom/applovin/impl/y4;

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/y4;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/applovin/impl/u3;->c:Lorg/json/JSONObject;

    .line 21
    .line 22
    sget-object p1, Lcom/applovin/impl/a5;->K:Lcom/applovin/impl/a5;

    .line 23
    .line 24
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p1, v1, v0}, Lcom/applovin/impl/b5;->a(Lcom/applovin/impl/a5;Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    sget-object v0, Lcom/applovin/impl/t3$a;->a:Lcom/applovin/impl/t3$a;

    .line 36
    .line 37
    invoke-direct {p0, p1, v0}, Lcom/applovin/impl/u3;->a(Ljava/lang/String;Lcom/applovin/impl/t3$a;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lcom/applovin/impl/a5;->L:Lcom/applovin/impl/a5;

    .line 41
    .line 42
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p1, v1, v0}, Lcom/applovin/impl/b5;->a(Lcom/applovin/impl/a5;Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    sget-object v0, Lcom/applovin/impl/t3$a;->b:Lcom/applovin/impl/t3$a;

    .line 53
    .line 54
    invoke-direct {p0, p1, v0}, Lcom/applovin/impl/u3;->a(Ljava/lang/String;Lcom/applovin/impl/t3$a;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private static synthetic a(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 4

    const-wide/16 v0, 0x1

    if-nez p0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic a(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 1
    return-object p0
.end method

.method private a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 83
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 84
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private a(Ljava/util/Map;)Ljava/lang/String;
    .locals 6

    .line 55
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 56
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 57
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    .line 59
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 60
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/applovin/impl/s3;

    .line 61
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 62
    invoke-virtual {v5}, Lcom/applovin/impl/s3;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v4}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putObject(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 63
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->putJSONObject(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private a(Lcom/applovin/impl/t3$a;)Ljava/util/HashMap;
    .locals 1

    .line 35
    sget-object v0, Lcom/applovin/impl/t3$a;->a:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_0

    .line 36
    sget-object p1, Lcom/applovin/impl/u3;->d:Ljava/util/HashMap;

    return-object p1

    .line 37
    :cond_0
    sget-object v0, Lcom/applovin/impl/t3$a;->b:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_1

    .line 38
    sget-object p1, Lcom/applovin/impl/u3;->f:Ljava/util/HashMap;

    return-object p1

    .line 39
    :cond_1
    sget-object p1, Lcom/applovin/impl/u3;->h:Ljava/util/HashMap;

    return-object p1
.end method

.method private a(Lcom/applovin/impl/t3;)Ljava/util/HashMap;
    .locals 5

    .line 43
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 44
    invoke-virtual {p1}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/t3$a;)Ljava/util/HashMap;

    move-result-object v1

    .line 45
    invoke-virtual {p1}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/t3$a;)Ljava/lang/Object;

    move-result-object p1

    .line 46
    monitor-enter p1

    .line 47
    :try_start_0
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 48
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    .line 50
    invoke-static {v2}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->isEmpty(Ljava/util/Map;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 51
    sget-object v4, Lcom/applovin/impl/s3$a;->c:Lcom/applovin/impl/s3$a;

    invoke-virtual {v4}, Lcom/applovin/impl/s3$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    .line 52
    invoke-static {v2}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->isEmpty(Ljava/util/Map;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 53
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 54
    :cond_1
    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3$a;Lcom/applovin/impl/s3$a;)Ljava/util/Map;
    .locals 8

    .line 8
    invoke-direct {p0, p2}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/t3$a;)Ljava/util/HashMap;

    move-result-object v0

    .line 9
    invoke-direct {p0, p2}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/t3$a;)Ljava/lang/Object;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 13
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/HashMap;

    .line 14
    invoke-virtual {p3}, Lcom/applovin/impl/s3$a;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_0

    .line 15
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 16
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/HashMap;

    .line 17
    sget-object v6, Lcom/applovin/impl/t3$a;->c:Lcom/applovin/impl/t3$a;

    if-ne p2, v6, :cond_1

    .line 18
    invoke-static {v4}, Lcom/applovin/impl/j3;->a(Ljava/lang/String;)Lcom/applovin/impl/j3;

    move-result-object v4

    .line 19
    invoke-virtual {v4}, Lcom/applovin/impl/j3;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 21
    :cond_2
    monitor-exit v1

    return-object v2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a(Lcom/applovin/impl/y4;)Lorg/json/JSONObject;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {v0, p1}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p1, v0}, Lcom/applovin/impl/sdk/utils/JsonUtils;->jsonObjectFromJsonString(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private a(Lcom/applovin/impl/q3;Ljava/util/Map;)V
    .locals 4

    .line 22
    invoke-virtual {p1}, Lcom/applovin/impl/q3;->c()Lcom/applovin/impl/j3;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/applovin/impl/j3;->a()Lcom/applovin/mediation/MaxAdFormat;

    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/applovin/impl/u3;->c:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/applovin/mediation/MaxAdFormat;->getLabel()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->getInteger(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 25
    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 26
    invoke-static {v3}, Lcom/applovin/impl/j3;->a(Ljava/lang/String;)Lcom/applovin/impl/j3;

    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lcom/applovin/impl/j3;->a()Lcom/applovin/mediation/MaxAdFormat;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v2, v1, :cond_3

    goto :goto_2

    .line 29
    :cond_3
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 30
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v2, v1, :cond_5

    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/applovin/impl/j3;->a(Ljava/lang/String;)Lcom/applovin/impl/j3;

    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/applovin/impl/j3;->a()Lcom/applovin/mediation/MaxAdFormat;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 34
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/applovin/impl/t3$a;)V
    .locals 6

    .line 65
    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/StringUtils;->isValidString(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 66
    :cond_0
    invoke-direct {p0, p2}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/t3$a;)Ljava/util/HashMap;

    move-result-object v0

    .line 67
    invoke-direct {p0, p2}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/t3$a;)Ljava/lang/Object;

    move-result-object p2

    .line 68
    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/JsonUtils;->toStringObjectMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 69
    monitor-enter p2

    .line 70
    :try_start_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 71
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 72
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 73
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 74
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 75
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/applovin/impl/s3;->a(Ljava/lang/String;)Lcom/applovin/impl/s3;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 76
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 77
    invoke-direct {p0, v4}, Lcom/applovin/impl/u3;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v3}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->isEmpty(Ljava/util/Map;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 79
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 80
    sget-object v4, Lcom/applovin/impl/s3$a;->c:Lcom/applovin/impl/s3$a;

    invoke-virtual {v4}, Lcom/applovin/impl/s3$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 82
    :cond_4
    monitor-exit p2

    return-void

    :goto_2
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Lcom/applovin/impl/s3$b;)Z
    .locals 2

    const/4 v0, 0x0

    const-string v1, "MediationStatsManager"

    if-nez p1, :cond_1

    .line 40
    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p1

    const-string p2, "Failed to update stat, no stat provided"

    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return v0

    :cond_1
    if-nez p2, :cond_3

    .line 41
    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p1

    const-string p2, "Failed to update stat, no dimension key provided"

    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v0

    :cond_3
    if-nez p3, :cond_5

    .line 42
    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    move-result-object p1

    const-string p2, "Failed to update stat, no stat updater provided"

    invoke-virtual {p1, v1, p2}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return v0

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic b(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/applovin/impl/u3;->a(Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private b(Lcom/applovin/impl/t3$a;)Ljava/lang/Object;
    .locals 1

    .line 27
    sget-object v0, Lcom/applovin/impl/t3$a;->a:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_0

    .line 28
    sget-object p1, Lcom/applovin/impl/u3;->e:Ljava/lang/Object;

    return-object p1

    .line 29
    :cond_0
    sget-object v0, Lcom/applovin/impl/t3$a;->b:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_1

    .line 30
    sget-object p1, Lcom/applovin/impl/u3;->g:Ljava/lang/Object;

    return-object p1

    .line 31
    :cond_1
    sget-object p1, Lcom/applovin/impl/u3;->i:Ljava/lang/Object;

    return-object p1
.end method

.method private b(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Lcom/applovin/impl/s3$b;)Ljava/util/Map;
    .locals 7

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Lcom/applovin/impl/s3$b;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {p2}, Lcom/applovin/impl/t3;->b()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/t3$a;)Ljava/util/HashMap;

    move-result-object v1

    .line 6
    invoke-virtual {p2}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/t3$a;)Ljava/lang/Object;

    move-result-object v2

    .line 7
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 8
    monitor-enter v2

    .line 9
    :try_start_0
    instance-of v4, p2, Lcom/applovin/impl/q3;

    if-eqz v4, :cond_2

    .line 10
    move-object v4, p2

    check-cast v4, Lcom/applovin/impl/q3;

    invoke-direct {p0, v4, v1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/q3;Ljava/util/Map;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 11
    :cond_2
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/HashMap;

    if-nez v4, :cond_3

    .line 12
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 13
    invoke-virtual {v1, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_3
    invoke-virtual {p1}, Lcom/applovin/impl/s3;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/applovin/impl/s3$a;

    .line 15
    invoke-virtual {v1}, Lcom/applovin/impl/s3$a;->b()Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/HashMap;

    if-nez v5, :cond_4

    .line 17
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 18
    invoke-virtual {v4, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_4
    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p3, v6}, Lcom/applovin/impl/s3$b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 20
    invoke-virtual {v5, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {v3, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 22
    :cond_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object p3, p0, Lcom/applovin/impl/u3;->a:Lcom/applovin/impl/sdk/k;

    sget-object v0, Lcom/applovin/impl/r3;->y8:Lcom/applovin/impl/y4;

    invoke-virtual {p3, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    .line 24
    sget-object v0, Lcom/applovin/impl/s3$a;->c:Lcom/applovin/impl/s3$a;

    invoke-virtual {p1, v0}, Lcom/applovin/impl/s3;->a(Lcom/applovin/impl/s3$a;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 25
    invoke-direct {p0, p2}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/t3;)V

    :cond_6
    return-object v3

    .line 26
    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private b(Lcom/applovin/impl/t3;)V
    .locals 2

    .line 42
    invoke-virtual {p1}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/applovin/impl/u3;->c(Lcom/applovin/impl/t3$a;)Lcom/applovin/impl/a5;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-direct {p0, p1}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/t3;)Ljava/util/HashMap;

    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Lcom/applovin/impl/u3;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-static {}, Lcom/applovin/impl/sdk/k;->o()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/applovin/impl/b5;->b(Lcom/applovin/impl/a5;Ljava/lang/Object;Landroid/content/Context;)V

    return-void
.end method

.method private b(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;)Z
    .locals 3

    .line 32
    iget-object v0, p0, Lcom/applovin/impl/u3;->b:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 35
    invoke-virtual {p2}, Lcom/applovin/impl/t3;->a()Lcom/applovin/impl/t3$a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 36
    iget-object v2, p0, Lcom/applovin/impl/u3;->b:Lorg/json/JSONObject;

    .line 37
    invoke-static {v1, v2}, Lcb/a;->m(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/applovin/impl/s3;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/applovin/impl/sdk/utils/JsonUtils;->valueExists(Lorg/json/JSONArray;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private c(Lcom/applovin/impl/t3$a;)Lcom/applovin/impl/a5;
    .locals 1

    .line 2
    sget-object v0, Lcom/applovin/impl/t3$a;->a:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_0

    .line 3
    sget-object p1, Lcom/applovin/impl/a5;->K:Lcom/applovin/impl/a5;

    return-object p1

    .line 4
    :cond_0
    sget-object v0, Lcom/applovin/impl/t3$a;->b:Lcom/applovin/impl/t3$a;

    if-ne p1, v0, :cond_1

    .line 5
    sget-object p1, Lcom/applovin/impl/a5;->L:Lcom/applovin/impl/a5;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic c(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/applovin/impl/u3;->a(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3$a;)Ljava/util/Map;
    .locals 1

    .line 7
    sget-object v0, Lcom/applovin/impl/s3$a;->b:Lcom/applovin/impl/s3$a;

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/u3;->a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3$a;Lcom/applovin/impl/s3$a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;)Ljava/util/Map;
    .locals 2

    .line 4
    new-instance v0, LV1/c;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, LV1/c;-><init>(I)V

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Lcom/applovin/impl/s3$b;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Ljava/lang/Long;)V
    .locals 2

    .line 6
    new-instance v0, Lcom/applovin/impl/G;

    const/4 v1, 0x5

    invoke-direct {v0, p3, v1}, Lcom/applovin/impl/G;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/u3;->b(Lcom/applovin/impl/s3;Lcom/applovin/impl/t3;Lcom/applovin/impl/s3$b;)Ljava/util/Map;

    return-void
.end method
