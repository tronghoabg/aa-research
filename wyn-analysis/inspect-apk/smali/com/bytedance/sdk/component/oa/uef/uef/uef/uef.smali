.class public Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;
.super Lcom/bytedance/sdk/component/oa/uef/moa;
.source "SourceFile"


# static fields
.field public static volatile uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;


# instance fields
.field private moa:Ljava/util/concurrent/ExecutorService;

.field private oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/oa;",
            ">;"
        }
    .end annotation
.end field

.field private yo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/oa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/oa/uef/moa;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->oa:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->yo:Ljava/util/List;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->moa:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;)V
    .locals 0

    .line 3
    sput-object p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;

    return-void
.end method


# virtual methods
.method public lw()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;->uef()Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public moa()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/oa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->yo:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/zjm;->uef()Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->moa:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    return-object v0
.end method

.method public uef()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public uef(I)V
    .locals 0

    .line 2
    return-void
.end method

.method public yo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/oa;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/uef;->oa:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
