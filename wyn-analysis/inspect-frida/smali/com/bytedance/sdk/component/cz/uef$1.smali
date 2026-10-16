.class Lcom/bytedance/sdk/component/cz/uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/cz/uef$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/component/cz/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/component/cz/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/cz/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;)F

    move-result v0

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->oa(Lcom/bytedance/sdk/component/cz/uef;)F

    move-result v0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->yo(Lcom/bytedance/sdk/component/cz/uef;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;)F

    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->oa(Lcom/bytedance/sdk/component/cz/uef;)F

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->moa(Lcom/bytedance/sdk/component/cz/uef;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;F)F

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->lw(Lcom/bytedance/sdk/component/cz/uef;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/cz/uef;->oa(Lcom/bytedance/sdk/component/cz/uef;F)F

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->ivm(Lcom/bytedance/sdk/component/cz/uef;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;J)J

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;Z)Z

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;)F

    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/cz/uef;->oa(Lcom/bytedance/sdk/component/cz/uef;)F

    return-void
.end method

.method public uef(I)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/cz/uef;->uef(Lcom/bytedance/sdk/component/cz/uef;I)I

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/component/cz/uef$1;->uef:Lcom/bytedance/sdk/component/cz/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/component/cz/uef;->xs(Lcom/bytedance/sdk/component/cz/uef;)V

    return-void
.end method
