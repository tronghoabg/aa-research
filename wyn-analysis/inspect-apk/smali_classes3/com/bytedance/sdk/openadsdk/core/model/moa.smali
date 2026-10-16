.class public Lcom/bytedance/sdk/openadsdk/core/model/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;"
        }
    .end annotation
.end field

.field private uef:Lcom/bytedance/sdk/openadsdk/core/dz/moa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa:Ljava/util/Set;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public oa()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa:Ljava/util/Set;

    return-object v0
.end method

.method public oa(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dz/moa;)V
    .locals 0

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;-><init>()V

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :cond_0
    return-void
.end method

.method public uef(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/zjm;",
            ">;)V"
        }
    .end annotation

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/moa;->oa:Ljava/util/Set;

    return-void
.end method
