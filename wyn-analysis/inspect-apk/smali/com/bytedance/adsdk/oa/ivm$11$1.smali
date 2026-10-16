.class Lcom/bytedance/adsdk/oa/ivm$11$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/adsdk/oa/ivm$11;->onAnimationStart(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/adsdk/oa/ivm$11;

.field final synthetic uef:J


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/ivm$11;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->oa:Lcom/bytedance/adsdk/oa/ivm$11;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->uef:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    const-string v0, "TMe"

    .line 2
    .line 3
    const-string v1, "--==-- lottie real start play"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->oa:Lcom/bytedance/adsdk/oa/ivm$11;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/bytedance/adsdk/oa/ivm$11;->uef:Lcom/bytedance/adsdk/oa/ivm;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->oa:Lcom/bytedance/adsdk/oa/ivm$11;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/bytedance/adsdk/oa/ivm$11;->uef:Lcom/bytedance/adsdk/oa/ivm;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm;->uef()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->oa:Lcom/bytedance/adsdk/oa/ivm$11;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/bytedance/adsdk/oa/ivm$11;->uef:Lcom/bytedance/adsdk/oa/ivm;

    .line 26
    .line 27
    iget-wide v1, p0, Lcom/bytedance/adsdk/oa/ivm$11$1;->uef:J

    .line 28
    .line 29
    invoke-static {v0, v1, v2}, Lcom/bytedance/adsdk/oa/ivm;->uef(Lcom/bytedance/adsdk/oa/ivm;J)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
