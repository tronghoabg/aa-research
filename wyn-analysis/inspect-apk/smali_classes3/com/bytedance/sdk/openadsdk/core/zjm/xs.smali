.class public Lcom/bytedance/sdk/openadsdk/core/zjm/xs;
.super Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;
.source "SourceFile"


# instance fields
.field private final moa:Ljava/lang/Runnable;

.field private oa:Lcom/bytedance/sdk/component/adexpress/oa/xs;

.field private final uef:Lcom/bytedance/sdk/component/adexpress/oa/cq;

.field private final yo:Lcom/bytedance/sdk/component/bcc/oa/yo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;ZLcom/bytedance/sdk/component/adexpress/dynamic/lw/bcc;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;ZLcom/bytedance/sdk/component/adexpress/dynamic/lw/bcc;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/zjm/xs$1;

    .line 6
    .line 7
    const-string p3, "dynamic_render_template"

    .line 8
    .line 9
    invoke-direct {p2, p0, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/xs$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->yo:Lcom/bytedance/sdk/component/bcc/oa/yo;

    .line 13
    .line 14
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/zjm/xs$2;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/xs$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->moa:Ljava/lang/Runnable;

    .line 20
    .line 21
    iput-object p5, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->uef:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->moa:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;)Lcom/bytedance/sdk/component/adexpress/oa/cq;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->uef:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/zjm/xs;)Lcom/bytedance/sdk/component/adexpress/oa/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->oa:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 2
    invoke-super {p0}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->oa()V

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->moa:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->oa:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/xs;->yo:Lcom/bytedance/sdk/component/bcc/oa/yo;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->yo(Ljava/lang/Runnable;)V

    return-void
.end method
