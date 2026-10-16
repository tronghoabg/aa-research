.class public Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$uef;,
        Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;,
        Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$yo;
    }
.end annotation


# static fields
.field private static final moa:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private static volatile uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;


# instance fields
.field private lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private final oa:Ljava/lang/Object;

.field private yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$1;

    .line 2
    .line 3
    const/high16 v1, 0x3f400000    # 0.75f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$1;-><init>(IFZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->moa:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->oa:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    .line 14
    return-void
.end method

.method private lw(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->oa:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v2, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->moa:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/ref/SoftReference;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-object v3

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    return-object v1

    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    throw p1
.end method

.method public static synthetic moa()Ljava/util/LinkedHashMap;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->moa:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public static oa(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/model/uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;-><init>()V

    const/4 v2, 0x0

    .line 5
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    const-string p0, "request_id"

    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->uef(Ljava/lang/String;)V

    .line 7
    const-string p0, "ret"

    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->uef(I)V

    .line 8
    const-string p0, "multi_ad_style"

    const/4 v4, 0x0

    invoke-virtual {v3, p0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->oa(I)V

    .line 9
    const-string p0, "message"

    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->oa(Ljava/lang/String;)V

    .line 10
    const-string p0, "gdid_encrypted"

    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 11
    const-string v5, "loop_config"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/core/model/orq;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/orq;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/orq;)V

    .line 12
    const-string v5, "auction_price"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 13
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->moa()I

    move-result v6

    if-eqz v6, :cond_1

    return-object v2

    .line 14
    :cond_1
    const-string v6, "multi_ad_config"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/core/model/rt;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/rt;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/rt;)V

    .line 15
    const-string v6, "creatives"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-eqz v6, :cond_4

    .line 16
    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v4, v7, :cond_4

    .line 17
    invoke-virtual {v6, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-static {v7, v2, v2, v1, v4}, Lcom/bytedance/sdk/openadsdk/core/oa;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;Lcom/bytedance/sdk/openadsdk/core/model/uef;I)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 18
    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dz(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v7}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cd()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 20
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lz(Ljava/lang/String;)V

    .line 21
    :cond_2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 22
    invoke-virtual {v7, p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cz(Ljava/lang/String;)V

    .line 23
    :cond_3
    invoke-virtual {v1, v7}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 24
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 25
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_5
    return-object v0

    :catch_0
    return-object v2
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;
    .locals 2

    .line 2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 7
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->uef(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private uef(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->oa:Ljava/lang/Object;

    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->moa:Ljava/util/LinkedHashMap;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public moa(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-string p1, ""

    return-object p1

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/uef;->oa(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public oa()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$6;

    const-string v1, "iabhistory_clear_overlimit"

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$6;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public uef(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 20
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    const-string v0, "https://"

    const-string v1, "/favicon.ico"

    .line 23
    invoke-static {v0, p1, v1}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;)V
    .locals 2

    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;

    const-string v1, "iabhistory_get_all"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$4;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$oa;)V

    const/16 p1, 0x8

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$uef;)V
    .locals 2

    .line 19
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$5;

    const-string v1, "iabhistory_clear"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$5;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$uef;)V

    const/16 p1, 0x8

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 12
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;

    const-string v1, "iabhistory_insert"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V

    const/16 p1, 0x8

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$yo;)V
    .locals 2

    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_1

    .line 14
    const-string p1, "materialKey is empty"

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$yo;->oa(Ljava/lang/String;)V

    return-void

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->lw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 16
    invoke-interface {p2, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$yo;->uef(Ljava/lang/String;)V

    :cond_1
    return-void

    .line 17
    :cond_2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$3;

    const-string v1, "iabhistory_query_material"

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$3;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo$yo;)V

    const/16 p1, 0x8

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string p1, ""

    return-object p1

    .line 3
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/uef/uef;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
