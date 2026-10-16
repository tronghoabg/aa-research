.class public Lcom/bytedance/adsdk/ugeno/lw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile uef:Lcom/bytedance/adsdk/ugeno/lw;


# instance fields
.field private ivm:Lcom/bytedance/adsdk/ugeno/core/oa/moa;

.field private lw:Lcom/bytedance/adsdk/ugeno/yo/uef;

.field private moa:Lcom/bytedance/adsdk/ugeno/uef;

.field private oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/adsdk/ugeno/core/oa;",
            ">;"
        }
    .end annotation
.end field

.field private xs:Lcom/bytedance/adsdk/ugeno/core/uef/uef;

.field private yo:Lcom/bytedance/adsdk/ugeno/core/yo;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private ivm()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->oa:Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/lw;->yo:Lcom/bytedance/adsdk/ugeno/core/yo;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/bytedance/adsdk/ugeno/core/yo;->uef()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->oa:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/core/moa;->uef(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static uef()Lcom/bytedance/adsdk/ugeno/lw;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/adsdk/ugeno/lw;->uef:Lcom/bytedance/adsdk/ugeno/lw;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/adsdk/ugeno/lw;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/adsdk/ugeno/lw;->uef:Lcom/bytedance/adsdk/ugeno/lw;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/adsdk/ugeno/lw;

    invoke-direct {v1}, Lcom/bytedance/adsdk/ugeno/lw;-><init>()V

    sput-object v1, Lcom/bytedance/adsdk/ugeno/lw;->uef:Lcom/bytedance/adsdk/ugeno/lw;

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
    sget-object v0, Lcom/bytedance/adsdk/ugeno/lw;->uef:Lcom/bytedance/adsdk/ugeno/lw;

    return-object v0
.end method


# virtual methods
.method public lw()Lcom/bytedance/adsdk/ugeno/core/uef/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->xs:Lcom/bytedance/adsdk/ugeno/core/uef/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Lcom/bytedance/adsdk/ugeno/core/oa/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->ivm:Lcom/bytedance/adsdk/ugeno/core/oa/moa;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Lcom/bytedance/adsdk/ugeno/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->moa:Lcom/bytedance/adsdk/ugeno/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Landroid/content/Context;Lcom/bytedance/adsdk/ugeno/core/yo;Lcom/bytedance/adsdk/ugeno/uef;)V
    .locals 0

    .line 7
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/lw;->yo:Lcom/bytedance/adsdk/ugeno/core/yo;

    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/ugeno/lw;->moa:Lcom/bytedance/adsdk/ugeno/uef;

    .line 9
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/lw;->ivm()V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/bcc;)V
    .locals 2

    .line 11
    new-instance v0, Lcom/bytedance/adsdk/ugeno/moa/uef;

    invoke-direct {v0}, Lcom/bytedance/adsdk/ugeno/moa/uef;-><init>()V

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/uef;->uef()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    .line 13
    invoke-interface {p1}, Lcom/bytedance/adsdk/ugeno/moa/bcc;->uef()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    :cond_0
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/moa/zjm;->uef(Ljava/util/List;)V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/yo;)V
    .locals 2

    .line 15
    new-instance v0, Lcom/bytedance/adsdk/ugeno/moa/lw;

    invoke-direct {v0}, Lcom/bytedance/adsdk/ugeno/moa/lw;-><init>()V

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/lw;->uef()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    .line 17
    invoke-interface {p1}, Lcom/bytedance/adsdk/ugeno/moa/yo;->uef()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 18
    :cond_0
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/moa/moa;->uef(Ljava/util/List;)V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/yo/uef;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/lw;->lw:Lcom/bytedance/adsdk/ugeno/yo/uef;

    return-void
.end method

.method public yo()Lcom/bytedance/adsdk/ugeno/yo/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/lw;->lw:Lcom/bytedance/adsdk/ugeno/yo/uef;

    .line 2
    .line 3
    return-object v0
.end method
