.class public Lcom/bytedance/sdk/openadsdk/moa/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final oa:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static uef:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    return-void
.end method

.method public static oa()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/oa;->yo()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/ab/oa/yo;
    .locals 1

    .line 23
    sget-object v0, Lcom/bytedance/sdk/openadsdk/moa/uef/bcc;->uef:Lcom/bytedance/sdk/openadsdk/moa/uef/bcc;

    return-object v0
.end method

.method public static uef(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    new-instance v1, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;-><init>()V

    new-instance v2, Lcom/bytedance/sdk/openadsdk/moa/uef/ivm;

    invoke-direct {v2}, Lcom/bytedance/sdk/openadsdk/moa/uef/ivm;-><init>()V

    .line 3
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;->yo()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->oa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 5
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;->lw()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->yo(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;->moa()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    new-instance v2, Lcom/bytedance/sdk/openadsdk/moa/uef/xs;

    invoke-direct {v2}, Lcom/bytedance/sdk/openadsdk/moa/uef/xs;-><init>()V

    .line 7
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    sget-object v2, Lcom/bytedance/sdk/openadsdk/moa/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/moa/uef/moa;

    .line 8
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dz()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->oa(I)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->wk()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(I)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 11
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->ne()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef(J)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;

    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef()Lcom/bytedance/sdk/component/ivm/uef/uef;

    move-result-object v1

    .line 13
    invoke-static {v1, p0}, Lcom/bytedance/sdk/component/ivm/uef/oa;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Landroid/content/Context;)V

    .line 14
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->oa()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    .line 15
    :catchall_0
    sget-object p0, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->oa:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/moa/uef;)V
    .locals 2

    .line 16
    new-instance v0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/moa/uef;->lw()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;)V

    .line 17
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/moa/uef;->ivm()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    .line 18
    :goto_0
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->yo(B)V

    const/4 p0, 0x0

    .line 19
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->oa(B)V

    .line 20
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/oa;->oa()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Landroid/content/Context;)V

    .line 22
    :cond_1
    invoke-static {v0}, Lcom/bytedance/sdk/component/ivm/uef/oa;->uef(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V

    return-void
.end method

.method public static uef(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/lang/String;Z)V

    return-void
.end method

.method public static uef(Ljava/lang/String;Z)V
    .locals 1

    .line 27
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/oa;->oa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Landroid/content/Context;)V

    .line 29
    :cond_0
    invoke-static {p0, p1}, Lcom/bytedance/sdk/component/ivm/uef/oa;->uef(Ljava/lang/String;Z)V

    return-void
.end method

.method public static uef(Ljava/util/List;ILjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 24
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/uef/oa$1;

    const-string v1, "track"

    invoke-direct {v0, v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa$1;-><init>(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static yo()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/oa;->moa()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/oa;->lw()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    const-string v1, "AdLogSwitchUtils"

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
