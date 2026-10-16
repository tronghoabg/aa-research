.class Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;->uef(Landroid/os/MessageQueue;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;

.field final synthetic moa:I

.field final synthetic oa:Landroid/os/MessageQueue;

.field final synthetic uef:I

.field final synthetic yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;ILandroid/os/MessageQueue;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->uef:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->oa:Landroid/os/MessageQueue;

    .line 6
    .line 7
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->yo:I

    .line 8
    .line 9
    iput p5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->moa:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->oa:Landroid/os/MessageQueue;

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->yo:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;Landroid/os/MessageQueue;I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->oa:Landroid/os/MessageQueue;

    .line 13
    .line 14
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2$2;->moa:I

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/cq$2;Landroid/os/MessageQueue;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
