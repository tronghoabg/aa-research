.class public Lcom/bytedance/sdk/component/ivm/uef/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final uef:Lcom/bytedance/sdk/component/ivm/uef/moa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/ivm/uef/moa;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/component/ivm/uef/moa;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/component/ivm/uef/moa;->uef:Lcom/bytedance/sdk/component/ivm/uef/moa;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private oa(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V
    .locals 2

    .line 8
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->wk()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 10
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->moa()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private oa(Lcom/bytedance/sdk/component/ivm/uef/uef;Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context == null"

    invoke-static {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/yo;->uef(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    const-string p2, "AdLogConfig == null"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/ivm/uef/yo;->uef(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object p1

    const-string p2, "AdLogDepend ==null"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/ivm/uef/yo;->uef(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/ivm/uef/uef;)V
    .locals 2

    .line 16
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/yo/uef;->oa()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/yo/uef;->uef()V

    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 19
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/yo/uef;->oa()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20
    invoke-interface {p1}, Lcom/bytedance/sdk/component/ivm/uef/lw;->lw()Ljava/util/concurrent/Executor;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 21
    new-instance v0, Lcom/bytedance/sdk/component/ivm/uef/moa$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/ivm/uef/moa$1;-><init>(Lcom/bytedance/sdk/component/ivm/uef/moa;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->wk()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->moa()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->zjm()V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef()V
    .locals 2

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->wk()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 24
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 25
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->moa()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->bcc()V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/ivm/uef/moa;->oa(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/component/ivm/uef/moa;->oa(Lcom/bytedance/sdk/component/ivm/uef/uef;Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->zjm()Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)V

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->xs()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->oa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V

    .line 5
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->bcc()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->yo(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->oa()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V

    .line 7
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->cz()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->moa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V

    .line 8
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->ivm()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef()Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/uef/uef/lw;->uef:Lcom/bytedance/sdk/component/ivm/uef/uef/uef/lw;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef()Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)V

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Lcom/bytedance/sdk/component/ivm/uef/lw;)V

    .line 11
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->yo()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Z)V

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->lw()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(J)V

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->wrv()I

    move-result p2

    invoke-static {p2}, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;->uef(I)V

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->dj()I

    move-result p2

    invoke-static {p2}, Lcom/bytedance/sdk/component/ivm/uef/oa/oa/yo;->oa(I)V

    .line 15
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/ivm/uef/moa;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/util/List;ZLjava/util/Map;ILjava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 28
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->wk()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 29
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->moa()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->bcc()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->ivm()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    if-eqz p2, :cond_4

    .line 32
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 33
    :cond_2
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->ivm()I

    move-result v0

    if-nez v0, :cond_3

    .line 34
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 35
    :cond_3
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Ljava/lang/String;Ljava/util/List;ZLjava/util/Map;ILjava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public uef(Ljava/lang/String;Z)V
    .locals 2

    .line 36
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/xs;->wk()Lcom/bytedance/sdk/component/ivm/uef/lw;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 37
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->moa()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->bcc()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v0}, Lcom/bytedance/sdk/component/ivm/uef/lw;->ivm()I

    move-result v0

    if-nez v0, :cond_2

    .line 40
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 41
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Ljava/lang/String;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 22
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef(Z)V

    return-void
.end method
