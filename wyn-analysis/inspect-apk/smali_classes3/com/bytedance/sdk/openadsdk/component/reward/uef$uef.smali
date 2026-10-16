.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "uef"
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

.field protected final moa:Z

.field protected final oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field protected final uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field protected final yo:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/AdSlot;",
            "Lcom/bytedance/sdk/openadsdk/core/model/uef;",
            "T",
            "L;",
            "Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->yo:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->moa:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->yo:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {v1, v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Ljava/lang/Object;ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->yo:Ljava/lang/Object;

    iget-boolean v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$uef;->moa:Z

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/Object;Ljava/lang/Object;Z)V

    return-void
.end method
