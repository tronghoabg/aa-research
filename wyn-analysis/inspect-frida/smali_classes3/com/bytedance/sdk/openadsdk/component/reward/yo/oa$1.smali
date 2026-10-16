.class Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cgg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 10
    .line 11
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v0, v2, v1, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(ILandroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)[F

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "BaseManagerBundle"

    .line 21
    .line 22
    const-string v2, "show loading page"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 28
    .line 29
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef([F)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->lw()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 51
    .line 52
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1$1;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$1;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/lw;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method
