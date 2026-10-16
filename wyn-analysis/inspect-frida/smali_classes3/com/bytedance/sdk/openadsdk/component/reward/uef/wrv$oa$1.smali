.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;
.super Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;->uef(Landroid/app/Activity;IFZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic bcc:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

.field final synthetic ivm:Z

.field final synthetic lw:Z

.field final synthetic moa:Landroid/app/Activity;

.field final synthetic oa:Z

.field uef:Z

.field final synthetic xs:F

.field final synthetic yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;ZILandroid/app/Activity;ZZF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->oa:Z

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->lw:Z

    .line 10
    .line 11
    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->ivm:Z

    .line 12
    .line 13
    iput p7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->xs:F

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$uef;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private oa()V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 2
    .line 3
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Landroid/app/Activity;I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 23
    .line 24
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    .line 25
    .line 26
    iget-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->lw:Z

    .line 27
    .line 28
    iget-boolean v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->ivm:Z

    .line 29
    .line 30
    invoke-static {v0, v2, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Landroid/app/Activity;Landroid/view/View;IZZ)[I

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v3, 0x4

    .line 35
    aget v3, v0, v3

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    aget v3, v0, v1

    .line 41
    .line 42
    aget v4, v0, v4

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    aget v5, v0, v1

    .line 46
    .line 47
    const/4 v1, 0x3

    .line 48
    aget v6, v0, v1

    .line 49
    .line 50
    iget v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->xs:F

    .line 51
    .line 52
    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv;->uef(Landroid/view/View;IIIIF)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 76
    .line 77
    .line 78
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private uef()V
    .locals 8

    .line 4
    :try_start_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-ne v0, v1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->cq(Landroid/content/Context;)I

    move-result v2

    sub-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 9
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->wrv(Landroid/content/Context;)I

    move-result v2

    sub-int/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 10
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 11
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    .line 12
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    if-nez v0, :cond_5

    .line 14
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    .line 15
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 16
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v7, :cond_1

    .line 17
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef()F

    move-result v1

    :goto_1
    float-to-int v1, v1

    add-int/2addr v0, v1

    goto :goto_2

    .line 18
    :cond_1
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->yo:I

    if-ne v6, v1, :cond_3

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->moa:Landroid/app/Activity;

    .line 19
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v6, v6, Landroid/content/res/Configuration;->orientation:I

    if-ne v6, v1, :cond_3

    .line 20
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->lw:Z

    if-eqz v1, :cond_2

    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef()F

    move-result v1

    float-to-int v1, v1

    add-int/2addr v3, v1

    .line 22
    :cond_2
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->ivm:Z

    if-eqz v1, :cond_3

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef()F

    move-result v1

    goto :goto_1

    .line 24
    :cond_3
    :goto_2
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 25
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 26
    iput-boolean v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z

    .line 27
    :cond_4
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->xs:F

    const/high16 v1, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_6

    const/high16 v0, -0x1000000

    .line 28
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    .line 29
    :cond_5
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    .line 30
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_6
    return-void
.end method


# virtual methods
.method public uef(II)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->oa:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->oa()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa$1;->uef()V

    return-void
.end method
