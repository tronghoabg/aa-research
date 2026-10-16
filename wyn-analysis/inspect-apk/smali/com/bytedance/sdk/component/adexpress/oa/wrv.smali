.class public Lcom/bytedance/sdk/component/adexpress/oa/wrv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;


# instance fields
.field private moa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/adexpress/oa/zjm;",
            ">;"
        }
    .end annotation
.end field

.field uef:Lcom/bytedance/sdk/component/adexpress/oa/wk;

.field private yo:Lcom/bytedance/sdk/component/adexpress/oa/cz;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/bytedance/sdk/component/adexpress/oa/cz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/adexpress/oa/zjm;",
            ">;",
            "Lcom/bytedance/sdk/component/adexpress/oa/cz;",
            ")V"
        }
    .end annotation

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
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->yo:Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public oa()Lcom/bytedance/sdk/component/adexpress/oa/wk;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->uef:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    return-object v0
.end method

.method public oa(Lcom/bytedance/sdk/component/adexpress/oa/zjm;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->yo:Lcom/bytedance/sdk/component/adexpress/oa/cz;

    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->moa()V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/adexpress/oa/zjm;

    .line 3
    invoke-interface {v1, p0}, Lcom/bytedance/sdk/component/adexpress/oa/zjm;->uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/wk;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->uef:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/adexpress/oa/zjm;

    .line 7
    invoke-interface {v0, p0}, Lcom/bytedance/sdk/component/adexpress/oa/zjm;->uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    return-void
.end method

.method public yo()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/wrv;->moa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
