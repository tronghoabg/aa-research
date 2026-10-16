.class Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->rl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:I

.field final synthetic uef:I

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 2
    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->uef:I

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->oa:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2
    .line 3
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->uef:I

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->oa:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->syr(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v1, v1, Landroid/view/TextureView;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->syr(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/view/TextureView;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->uf(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 43
    .line 44
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->syr(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    instance-of v1, v1, Landroid/view/SurfaceView;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 53
    .line 54
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->syr(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroid/view/SurfaceView;

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 64
    .line 65
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->nj(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :catchall_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo$5;->yo:Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 70
    .line 71
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->jp(Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    return-void
.end method
