.class Lcom/bytedance/sdk/openadsdk/common/orq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/common/orq;->oa()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/common/orq;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/common/orq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/orq;->oa(Lcom/bytedance/sdk/openadsdk/common/orq;Z)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/orq;->oa(Lcom/bytedance/sdk/openadsdk/common/orq;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-static {p1, v1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 21
    .line 22
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;Z)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method
