.class public Lcom/bytedance/sdk/openadsdk/common/dz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/common/dz$uef;
    }
.end annotation


# instance fields
.field private ivm:Lcom/bytedance/sdk/openadsdk/common/ab;

.field private lw:Z

.field private final moa:Lcom/bytedance/sdk/openadsdk/common/uef$oa;

.field private final oa:Ljava/lang/String;

.field private final uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field private xs:Lcom/bytedance/sdk/openadsdk/common/uef$uef;

.field private final yo:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->uef(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->oa(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->oa:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->yo(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Ljava/lang/Runnable;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->yo:Ljava/lang/Runnable;

    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->moa(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Lcom/bytedance/sdk/openadsdk/common/uef$oa;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->moa:Lcom/bytedance/sdk/openadsdk/common/uef$oa;

    .line 7
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->lw(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->lw:Z

    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->ivm(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Lcom/bytedance/sdk/openadsdk/common/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->ivm:Lcom/bytedance/sdk/openadsdk/common/ab;

    .line 9
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/dz$uef;->xs(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)Lcom/bytedance/sdk/openadsdk/common/uef$uef;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->xs:Lcom/bytedance/sdk/openadsdk/common/uef$uef;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/common/dz$uef;Lcom/bytedance/sdk/openadsdk/common/dz$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/dz;-><init>(Lcom/bytedance/sdk/openadsdk/common/dz$uef;)V

    return-void
.end method


# virtual methods
.method public ivm()Lcom/bytedance/sdk/openadsdk/common/ab;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->ivm:Lcom/bytedance/sdk/openadsdk/common/ab;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()Lcom/bytedance/sdk/openadsdk/common/uef$oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->moa:Lcom/bytedance/sdk/openadsdk/common/uef$oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()Lcom/bytedance/sdk/openadsdk/common/uef$uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->xs:Lcom/bytedance/sdk/openadsdk/common/uef$uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Ljava/lang/Runnable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/dz;->yo:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object v0
.end method
