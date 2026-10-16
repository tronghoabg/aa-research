.class public Lcom/bytedance/sdk/openadsdk/component/reward/wk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;
    }
.end annotation


# static fields
.field private static final uef:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;",
            "Lcom/bytedance/sdk/openadsdk/component/reward/wk;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final oa:Landroid/content/Context;

.field private final yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef:Lj$/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->oa:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    .line 18
    .line 19
    return-void
.end method

.method public static uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;)Lcom/bytedance/sdk/openadsdk/component/reward/wk;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2
    const-class v1, Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    monitor-enter v1

    .line 3
    :try_start_0
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    invoke-direct {v2, p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/wk;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;)V

    invoke-virtual {v0, p1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v1

    throw p0

    .line 6
    :cond_1
    :goto_2
    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    return-object p0
.end method


# virtual methods
.method public uef(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    const-wide/32 v1, 0xa037a0

    .line 12
    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    .line 13
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 14
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/oa;->moa(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object v1
.end method

.method public uef()V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tpq()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/oa;->yo(Ljava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z
    .locals 2

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/wk$uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/common/oa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/common/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Z)Z

    move-result p1

    return p1
.end method
