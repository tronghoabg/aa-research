.class public abstract Lcom/bytedance/sdk/openadsdk/activity/single/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected lw:Ljava/lang/String;

.field protected final moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

.field protected final oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected final uef:Landroid/app/Activity;

.field protected yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->gsd(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->yo:Ljava/lang/String;

    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->lw:Ljava/lang/String;

    .line 27
    .line 28
    :cond_1
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public ab()V
    .locals 0

    return-void
.end method

.method public abstract bcc()I
.end method

.method public bs()V
    .locals 0

    return-void
.end method

.method public cq()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public cz()V
    .locals 0

    return-void
.end method

.method public dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public dz()Lcom/bytedance/sdk/openadsdk/activity/single/lw;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ivm()V
    .locals 0

    return-void
.end method

.method public lw()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public moa()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public oa()V
    .locals 0

    .line 1
    return-void
.end method

.method public oa(Landroid/app/Activity;)V
    .locals 0

    .line 2
    return-void
.end method

.method public abstract oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)V
.end method

.method public abstract oib()V
.end method

.method public abstract sy()V
.end method

.method public uef()V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(F)V
    .locals 0

    .line 2
    return-void
.end method

.method public abstract uef(I)V
.end method

.method public uef(II)V
    .locals 0

    .line 3
    return-void
.end method

.method public uef(Landroid/app/Activity;)V
    .locals 0

    .line 4
    return-void
.end method

.method public uef(Landroid/os/Bundle;)V
    .locals 0

    .line 5
    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 0

    .line 6
    return-void
.end method

.method public uef(Landroid/view/View;Z)V
    .locals 0

    .line 7
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 0

    .line 8
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 0

    .line 9
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 0

    .line 10
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Z)V
    .locals 0

    .line 11
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZZZI)V
    .locals 0

    .line 12
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;Z)V
    .locals 0

    .line 13
    return-void
.end method

.method public uef(Ljava/util/Map;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/activity/single/bcc;",
            "FF)V"
        }
    .end annotation

    .line 14
    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 15
    return-void
.end method

.method public abstract uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)Z
.end method

.method public abstract wk()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ">;"
        }
    .end annotation
.end method

.method public abstract wrv()Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;
.end method

.method public xs()V
    .locals 0

    return-void
.end method

.method public yo()V
    .locals 0

    return-void
.end method

.method public abstract zjm()I
.end method
