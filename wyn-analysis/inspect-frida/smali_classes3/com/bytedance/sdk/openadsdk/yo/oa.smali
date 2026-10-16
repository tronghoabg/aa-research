.class public Lcom/bytedance/sdk/openadsdk/yo/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile uef:Lcom/bytedance/sdk/openadsdk/yo/oa;


# instance fields
.field private final oa:Lcom/bytedance/sdk/openadsdk/core/gzw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/core/gzw<",
            "Lcom/bytedance/sdk/openadsdk/moa/uef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->yo()Lcom/bytedance/sdk/openadsdk/core/gzw;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/gzw;

    .line 9
    .line 10
    return-void
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/yo/oa;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/yo/oa;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/openadsdk/yo/oa;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/yo/oa;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/openadsdk/yo/oa;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/yo/oa;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/yo/oa;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/yo/oa;

    return-object v0
.end method


# virtual methods
.method public uef(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/FilterWord;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/yo/oa;->uef(Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/FilterWord;",
            ">;",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/gzw;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
