.class public abstract Lcom/bytedance/sdk/component/bcc/uef/ivm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final uef:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->oa(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static synthetic b(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->moa(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic c(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->lw(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic lw(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private synthetic moa(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private synthetic oa(Ljava/lang/Runnable;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public oa(Ljava/lang/Runnable;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/bytedance/sdk/component/bcc/uef/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/bytedance/sdk/component/bcc/uef/a;-><init>(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;I)V

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->yo(Ljava/lang/Runnable;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public uef(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/bytedance/sdk/component/bcc/uef/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/bytedance/sdk/component/bcc/uef/a;-><init>(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;I)V

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->yo(Ljava/lang/Runnable;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public uef(Ljava/lang/Runnable;J)V
    .locals 7

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v1, Lcom/applovin/impl/W;

    const/4 v6, 0x1

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/applovin/impl/W;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->yo(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    .line 7
    iget-object p1, v2, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef:Landroid/os/Handler;

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public abstract uef()Z
.end method

.method public yo(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef()Lcom/bytedance/sdk/component/bcc/uef/lw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
