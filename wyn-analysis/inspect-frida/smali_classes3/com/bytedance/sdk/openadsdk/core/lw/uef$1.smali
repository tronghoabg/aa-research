.class Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/lw/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->yo()Ljava/util/Map;

    .line 2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;)Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Long;

    .line 5
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;)Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const/4 v6, -0x1

    const/4 v7, 0x0

    move-wide v4, v3

    const/4 v3, 0x1

    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;IJILjava/lang/String;)V

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/xs;->oa(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 10
    const-string v0, "MusicCacheManager"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz v1, :cond_2

    .line 12
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long v4, p1, v0

    const/4 v6, -0x2

    const-string v7, "http response status code isn\'t 200"

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;IJILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 6

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object p1

    .line 14
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;)Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-virtual {p2, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_0

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/lw/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    sub-long/2addr v1, p1

    const/4 v4, -0x2

    const-string v5, "http response status code isn\'t 200"

    move-wide v2, v1

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/lw/uef;IJILjava/lang/String;)V

    :cond_0
    return-void
.end method
