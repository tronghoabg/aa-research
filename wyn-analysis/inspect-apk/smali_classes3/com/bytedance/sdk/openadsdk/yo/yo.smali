.class public Lcom/bytedance/sdk/openadsdk/yo/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/ku;


# instance fields
.field private lw:Lcom/bytedance/sdk/openadsdk/core/ku$uef;

.field private moa:Z

.field private final oa:Landroid/content/Context;

.field public uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

.field private yo:Lcom/bytedance/sdk/openadsdk/yo/moa;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/FilterWord;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa:Landroid/content/Context;

    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef(Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private moa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa:Landroid/content/Context;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast v0, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->show()V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/yo/yo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/yo/yo;->moa()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/yo/moa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    return-object p0
.end method

.method private uef(Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/FilterWord;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ")V"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/yo/moa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa:Landroid/content/Context;

    invoke-direct {v0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/yo/moa;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    .line 3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/yo/wrv;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa:Landroid/content/Context;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;->getDislikeManager()Lcom/bytedance/sdk/openadsdk/yo/zjm;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/yo/wrv;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/yo/zjm;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    .line 4
    invoke-virtual {p1, p3}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->uef:Lcom/bytedance/sdk/openadsdk/yo/wrv;

    new-instance p2, Lcom/bytedance/sdk/openadsdk/yo/yo$1;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/yo/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/yo/yo;)V

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/yo/wrv;->uef(Lcom/bytedance/sdk/openadsdk/yo/wrv$uef;)V

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    new-instance p2, Lcom/bytedance/sdk/openadsdk/yo/yo$2;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/yo/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/yo/yo;)V

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/yo/moa$uef;)V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/yo/yo;)Lcom/bytedance/sdk/openadsdk/core/ku$uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    return-object p0
.end method


# virtual methods
.method public oa()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;->destroy()V

    :cond_0
    return-void
.end method

.method public uef()V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->oa:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->yo:Lcom/bytedance/sdk/openadsdk/yo/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/yo/moa;->show()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/ku$uef;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/ku$uef;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 11
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->moa:Z

    return-void
.end method

.method public yo()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/yo/yo;->moa:Z

    return v0
.end method
