.class public Lcom/bytedance/sdk/openadsdk/xs/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/preload/geckox/net/INetWork;


# instance fields
.field protected oa:Lcom/bytedance/sdk/component/oa/uef/dj;

.field protected uef:Lcom/bytedance/sdk/component/oa/uef/dj;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v2, 0xa

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 30
    .line 31
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 32
    .line 33
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-wide/16 v2, 0x1e

    .line 41
    .line 42
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v2, v3, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->oa:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 55
    .line 56
    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/oa/uef/ivm;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/oa/uef/ivm;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-object v0
.end method


# virtual methods
.method public doGet(Ljava/lang/String;)Lcom/bykv/vk/openvk/preload/geckox/net/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "gecko"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lcom/bykv/vk/openvk/preload/geckox/net/Response;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef(Lcom/bytedance/sdk/component/oa/uef/ivm;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/16 v3, 0xc8

    .line 49
    .line 50
    if-ne v2, v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v2, 0x0

    .line 62
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/bykv/vk/openvk/preload/geckox/net/Response;-><init>(Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public doPost(Ljava/lang/String;Ljava/lang/String;)Lcom/bykv/vk/openvk/preload/geckox/net/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 13
    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lcom/bytedance/sdk/component/oa/uef/cz;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object v0

    .line 14
    invoke-static {v0, p2}, Lcom/bytedance/sdk/component/oa/uef/cq;->uef(Lcom/bytedance/sdk/component/oa/uef/cz;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/cq;

    move-result-object p2

    .line 15
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 16
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 17
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    const-string p2, "gecko"

    .line 18
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object p1

    .line 20
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object p1

    .line 21
    invoke-interface {p1}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    .line 22
    new-instance p2, Lcom/bykv/vk/openvk/preload/geckox/net/Response;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef(Lcom/bytedance/sdk/component/oa/uef/ivm;)Ljava/util/Map;

    move-result-object v0

    .line 23
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, Lcom/bykv/vk/openvk/preload/geckox/net/Response;-><init>(Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;)V

    return-object p2
.end method

.method public doPost(Ljava/lang/String;Ljava/util/List;)Lcom/bykv/vk/openvk/preload/geckox/net/Response;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/bykv/vk/openvk/preload/geckox/net/Response;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/lw$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/lw$uef;-><init>()V

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 3
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/bytedance/sdk/component/oa/uef/lw$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/lw$uef;

    goto :goto_0

    .line 4
    :cond_0
    new-instance p2, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 5
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/lw$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/lw;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/cq;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    const-string p2, "gecko"

    .line 7
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object p1

    .line 10
    invoke-interface {p1}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object p1

    .line 11
    new-instance p2, Lcom/bykv/vk/openvk/preload/geckox/net/Response;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef(Lcom/bytedance/sdk/component/oa/uef/ivm;)Ljava/util/Map;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, Lcom/bykv/vk/openvk/preload/geckox/net/Response;-><init>(Ljava/util/Map;Ljava/lang/String;ILjava/lang/String;)V

    return-object p2
.end method

.method public downloadFile(Ljava/lang/String;JLcom/bykv/vk/openvk/preload/geckox/buffer/stream/BufferOutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 p3, 0x0

    .line 3
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "gecko"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->oa:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    .line 37
    .line 38
    .line 39
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wk;->yo()Ljava/io/InputStream;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v2, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    const/16 p2, 0x800

    .line 54
    .line 55
    :try_start_2
    new-array v0, p2, [B

    .line 56
    .line 57
    :goto_0
    invoke-virtual {v2, v0, p3, p2}, Ljava/io/BufferedInputStream;->read([BII)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    const/4 v4, -0x1

    .line 62
    if-eq v3, v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {p4, v0, p3, v3}, Lcom/bykv/vk/openvk/preload/geckox/buffer/stream/BufferOutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    move-object p2, v2

    .line 70
    goto :goto_3

    .line 71
    :catch_0
    move-exception p2

    .line 72
    :goto_1
    move p3, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_0
    invoke-static {v2}, Lcom/bykv/vk/openvk/preload/geckox/utils/CloseableUtils;->close(Ljava/io/Closeable;)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    goto :goto_3

    .line 80
    :catch_1
    move-exception p3

    .line 81
    move-object v2, p2

    .line 82
    move-object p2, p3

    .line 83
    goto :goto_1

    .line 84
    :catch_2
    move-exception p4

    .line 85
    move-object v2, p2

    .line 86
    move-object p2, p4

    .line 87
    :goto_2
    :try_start_3
    new-instance p4, Ljava/lang/RuntimeException;

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "downloadFile failed, code: "

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p3, ", url:"

    .line 100
    .line 101
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p1, ", caused by:"

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {p4, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    throw p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    :goto_3
    invoke-static {p2}, Lcom/bykv/vk/openvk/preload/geckox/utils/CloseableUtils;->close(Ljava/io/Closeable;)Z

    .line 128
    .line 129
    .line 130
    throw p1
.end method

.method public syncDoGet(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "gecko"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/bytedance/sdk/openadsdk/xs/uef$1;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/xs/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/xs/uef;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
