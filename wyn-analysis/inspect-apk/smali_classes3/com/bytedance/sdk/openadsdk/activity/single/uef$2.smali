.class Lcom/bytedance/sdk/openadsdk/activity/single/uef$2;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/activity/single/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/uef;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(I)Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onTick(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef$2;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;J)J

    .line 4
    .line 5
    .line 6
    return-void
.end method
