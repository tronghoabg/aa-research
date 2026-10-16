.class Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/ue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cq()Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo()Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wrv:Lorg/json/JSONObject;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 27
    .line 28
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wrv:Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Lorg/json/JSONObject;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->yo(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/ue;

    .line 51
    .line 52
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->moa(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Ljava/lang/Runnable;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method
