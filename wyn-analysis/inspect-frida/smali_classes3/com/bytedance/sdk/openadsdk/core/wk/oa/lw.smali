.class public Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/uef/ivm/uef;
.implements Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;
.implements Lcom/bytedance/sdk/component/utils/ue$uef;
.implements Lcom/bytedance/sdk/openadsdk/core/widget/dhk$oa;
.implements Lcom/bytedance/sdk/openadsdk/core/widget/oib$uef;
.implements Lcom/bytedance/sdk/openadsdk/core/yo/uef$uef;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bykv/vk/openvk/uef/uef/uef/ivm/uef;",
        "Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa<",
        "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
        ">;",
        "Lcom/bytedance/sdk/component/utils/ue$uef;",
        "Lcom/bytedance/sdk/openadsdk/core/widget/dhk$oa;",
        "Lcom/bytedance/sdk/openadsdk/core/widget/oib$uef;",
        "Lcom/bytedance/sdk/openadsdk/core/yo/uef$uef;"
    }
.end annotation


# instance fields
.field ab:I

.field bcc:Landroid/widget/ImageView;

.field bs:I

.field cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

.field cq:Landroid/widget/TextView;

.field cz:Landroid/view/View;

.field dhk:I

.field dj:Landroid/widget/ImageView;

.field private dxx:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;

.field dz:I

.field fz:Z

.field gr:Z

.field gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

.field gzw:Landroid/content/Context;

.field ivm:Landroid/view/View;

.field ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

.field lw:Landroid/widget/ImageView;

.field private lz:J

.field moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

.field protected final oa:I

.field oib:Z

.field orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private final oyt:Ljava/lang/String;

.field pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

.field rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

.field sy:Z

.field tpx:I

.field ue:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

.field protected final uef:I

.field wk:I

.field wrv:Landroid/view/View;

.field xs:Landroid/view/View;

.field yo:Landroid/view/ViewGroup;

.field zjm:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;ZILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;)V
    .locals 8

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 20
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;ZILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;ZILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe4

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef:I

    const/16 v0, 0xa0

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa:I

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gr:Z

    .line 6
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->fz:Z

    .line 7
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oyt:Ljava/lang/String;

    .line 8
    instance-of v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    .line 10
    invoke-virtual {p0, p7}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(Z)V

    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    .line 12
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    .line 13
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->tpx:I

    .line 14
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 15
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/16 p2, 0x8

    .line 16
    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(I)V

    .line 17
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(Landroid/content/Context;Landroid/view/View;)V

    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa()V

    .line 19
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv()V

    return-void
.end method

.method private ivm(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method private lw(I)I
    .locals 3

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab:I

    if-lez v0, :cond_3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bs:I

    if-gtz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const/high16 v1, 0x43640000    # 228.0f

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const/high16 v2, 0x43200000    # 160.0f

    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v1

    int-to-float p1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr p1, v2

    .line 5
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab:I

    int-to-float v2, v2

    div-float/2addr p1, v2

    .line 6
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bs:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int p1, v2

    if-le p1, v0, :cond_1

    return v0

    :cond_1
    if-ge p1, v1, :cond_2

    return v1

    :cond_2
    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private rt()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ix()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/lw;->uef(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aje()Lcom/bytedance/sdk/openadsdk/core/model/dxx;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    :goto_0
    move v0, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v0, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vep()Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vj()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-ne v0, v2, :cond_2

    .line 53
    .line 54
    return v2

    .line 55
    :cond_2
    return v1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;
    .locals 0

    .line 8
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dxx:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;

    return-object p0
.end method


# virtual methods
.method public ab()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    return v0
.end method

.method public bcc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->ivm(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->xs:Landroid/view/View;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->ivm(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public cq()Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm:Landroid/view/View;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv:Landroid/view/View;

    .line 39
    .line 40
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Z)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public dhk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public dj()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(ZZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public dz()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;Lcom/bytedance/sdk/openadsdk/core/widget/dhk$oa;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public getVideoProgress()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lz:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double/2addr v0, v2

    .line 35
    double-to-long v0, v0

    .line 36
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lz:J

    .line 37
    .line 38
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->cz()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lz:J

    .line 47
    .line 48
    :cond_1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lz:J

    .line 49
    .line 50
    return-wide v0
.end method

.method public gsd()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->tpx:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public gzw()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public ivm()V
    .locals 0

    .line 1
    return-void
.end method

.method public lw()V
    .locals 0

    .line 1
    return-void
.end method

.method public moa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    invoke-interface {v0, p0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/ivm/uef;)V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$4;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public moa(I)V
    .locals 1

    .line 12
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dhk:I

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public moa(Z)V
    .locals 1

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gr:Z

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    .line 10
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    :cond_3
    return-void
.end method

.method public oa()V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/view/View;)V

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->xs:Landroid/view/View;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/view/View;)V

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->lw(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public oa(II)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, -0x2

    const/4 v2, -0x1

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_1

    if-lez p1, :cond_2

    .line 8
    :cond_1
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_2
    if-eq p2, v2, :cond_3

    if-eq p2, v1, :cond_3

    if-lez p2, :cond_4

    .line 9
    :cond_3
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 10
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public oa(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v0, :cond_0

    .line 20
    invoke-interface {v0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->uef(Landroid/graphics/SurfaceTexture;)V

    :cond_0
    return-void
.end method

.method public oa(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib:Z

    .line 17
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    invoke-interface {v0, p0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/SurfaceHolder;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public oa(Landroid/view/ViewGroup;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    return-void
.end method

.method public oa(Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public oa(ZZ)V
    .locals 1

    .line 4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const-string v0, "tt_play_movebar_textpage"

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/dj;->uef(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const-string v0, "tt_stop_movebar_textpage"

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/dj;->uef(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public oa(I)Z
    .locals 0

    .line 3
    const/4 p1, 0x0

    return p1
.end method

.method public oib()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm:Landroid/view/View;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv:Landroid/view/View;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    return-void
.end method

.method public orq()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib:Z

    .line 2
    .line 3
    return v0
.end method

.method public sy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->getView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public tpx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    .line 2
    .line 3
    return v0
.end method

.method public uef()V
    .locals 2

    const/4 v0, 0x0

    .line 48
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(ZZ)V

    .line 49
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib()V

    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(II)V
    .locals 2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 42
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result p1

    :cond_0
    if-gtz p1, :cond_1

    return-void

    .line 43
    :cond_1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dz:I

    .line 44
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->tpx()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->tpx:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 45
    :cond_2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw(I)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wk:I

    goto :goto_1

    .line 46
    :cond_3
    :goto_0
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wk:I

    .line 47
    :goto_1
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dz:I

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wk:I

    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oa(II)V

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 2
    return-void
.end method

.method public uef(JJ)V
    .locals 0

    .line 3
    return-void
.end method

.method public uef(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jvw()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ga()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->qn()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    if-eqz p2, :cond_2

    const/4 p1, 0x1

    .line 17
    invoke-virtual {p2, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->wk()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 19
    new-instance p1, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/moa;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/moa;-><init>(Landroid/content/Context;)V

    goto :goto_0

    .line 20
    :cond_3
    new-instance p1, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/yo;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 21
    :goto_0
    instance-of v0, p2, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_4

    .line 22
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xd

    .line 23
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 24
    move-object v1, p2

    check-cast v1, Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    const/16 v0, 0x8

    .line 25
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 26
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    .line 27
    sget p1, Lcom/bytedance/sdk/openadsdk/utils/bs;->az:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    .line 28
    sget p1, Lcom/bytedance/sdk/openadsdk/utils/bs;->uxr:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    .line 29
    sget p1, Lcom/bytedance/sdk/openadsdk/utils/bs;->xw:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->xs:Landroid/view/View;

    .line 30
    sget p1, Lcom/bytedance/sdk/openadsdk/utils/bs;->efa:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    .line 31
    sget p1, Lcom/bytedance/sdk/openadsdk/utils/bs;->lpy:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cz:Landroid/view/View;

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method

.method public uef(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    const/4 p2, 0x1

    .line 80
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib:Z

    .line 81
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 82
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    invoke-interface {p2, p0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/graphics/SurfaceTexture;)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 0

    .line 4
    return-void
.end method

.method public uef(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib:Z

    .line 76
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    invoke-interface {v0, p0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/SurfaceHolder;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 78
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    invoke-interface {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p2

    if-eq p1, p2, :cond_0

    return-void

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    return-void
.end method

.method public uef(Landroid/view/View;Landroid/content/Context;)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 33
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cz:Landroid/view/View;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm:Landroid/view/View;

    if-eqz p2, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cz:Landroid/view/View;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm:Landroid/view/View;

    .line 35
    sget p2, Lcom/bytedance/sdk/openadsdk/utils/bs;->df:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    .line 36
    sget p2, Lcom/bytedance/sdk/openadsdk/utils/bs;->wp:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv:Landroid/view/View;

    .line 37
    sget p2, Lcom/bytedance/sdk/openadsdk/utils/bs;->cop:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Landroid/view/View;Z)V
    .locals 0

    .line 5
    return-void
.end method

.method public uef(Landroid/view/ViewGroup;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 6
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;)V
    .locals 1

    .line 39
    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    if-eqz v0, :cond_0

    .line 40
    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 41
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dz()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;)V

    :cond_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/ref/WeakReference;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 51
    :cond_0
    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->sy:Z

    const/4 p3, 0x0

    invoke-virtual {p0, p3, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(ZZ)V

    .line 52
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(Landroid/view/View;Landroid/content/Context;)V

    .line 53
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->zjm:Landroid/view/View;

    if-eqz p2, :cond_1

    .line 54
    invoke-static {p2, p3}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 55
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    if-eqz p2, :cond_2

    .line 56
    invoke-static {p2, p3}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 57
    :cond_2
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->wrv:Landroid/view/View;

    invoke-static {p2, p3}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 58
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 59
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    move-result-object v0

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    move-result-object v1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo()I

    move-result v2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oa()I

    move-result v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dj:Landroid/widget/ImageView;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->uef(Ljava/lang/String;IILandroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    goto :goto_0

    :cond_3
    move-object v5, p1

    .line 60
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    invoke-static {p1, p3}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 61
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kik()Ljava/lang/String;

    move-result-object p1

    .line 62
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 p3, 0x4

    if-eqz p2, :cond_7

    .line 63
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p1

    const/4 p2, 0x2

    const-string v0, "tt_video_mobile_go_detail"

    if-eq p1, p2, :cond_6

    const/4 p2, 0x3

    if-eq p1, p2, :cond_6

    if-eq p1, p3, :cond_5

    const/4 p2, 0x5

    if-eq p1, p2, :cond_4

    const/16 p2, 0x8

    if-eq p1, p2, :cond_6

    .line 64
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 65
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const-string p2, "tt_video_dial_phone"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 66
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    const-string p2, "tt_video_download_apk"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 67
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 68
    :cond_7
    :goto_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    if-eqz p2, :cond_8

    .line 69
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cq:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 72
    :cond_8
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->fz:Z

    if-nez p1, :cond_9

    .line 73
    invoke-direct {p0, p3}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm(I)V

    :cond_9
    :goto_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->dxx:Lcom/bytedance/sdk/openadsdk/core/wk/oa/ivm$uef;

    return-void
.end method

.method public bridge synthetic uef(Ljava/lang/Object;Ljava/lang/ref/WeakReference;Z)V
    .locals 0

    .line 9
    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/ref/WeakReference;Z)V

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 7
    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->fz:Z

    return-void
.end method

.method public uef(ZZ)V
    .locals 0

    .line 87
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    const/16 p2, 0x8

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public uef(ZZZ)V
    .locals 0

    .line 86
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-static {p2, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    return-void
.end method

.method public uef(ILcom/bykv/vk/openvk/uef/uef/uef/yo/oa;Z)Z
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(ILcom/bykv/vk/openvk/uef/uef/uef/yo/oa;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public uef(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->oib:Z

    .line 84
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    invoke-interface {v0, p0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/graphics/SurfaceTexture;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public wk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gsd:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public wrv()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gr:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "embeded_ad"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "embeded_ad_landingpage"

    .line 9
    .line 10
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const-string v0, "rewarded_video"

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    :goto_1
    move-object v7, v0

    .line 23
    move v8, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yd()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const-string v0, "fullscreen_interstitial_ad"

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ga()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    const-string v0, "banner_ad"

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    move-object v7, v0

    .line 50
    move v8, v2

    .line 51
    :goto_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x4

    .line 58
    if-ne v0, v1, :cond_4

    .line 59
    .line 60
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    .line 61
    .line 62
    invoke-static {v0, v7}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ue:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 67
    .line 68
    :cond_4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 69
    .line 70
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    .line 71
    .line 72
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 73
    .line 74
    invoke-direct {v0, v1, v3, v7, v8}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/uef$uef;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->oa(Z)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gr:Z

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->yo(Z)V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lw(Z)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 121
    .line 122
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$1;

    .line 123
    .line 124
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ue:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->cp:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 135
    .line 136
    if-eqz v1, :cond_6

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$2;

    .line 148
    .line 149
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gzw:Landroid/content/Context;

    .line 150
    .line 151
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 152
    .line 153
    move-object v4, p0

    .line 154
    invoke-direct/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 155
    .line 156
    .line 157
    iput-object v3, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 158
    .line 159
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$3;

    .line 160
    .line 161
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->oa(Z)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 173
    .line 174
    iget-boolean v1, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->gr:Z

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Z)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 180
    .line 181
    iget-object v1, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->pz:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lw(Z)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ue:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 192
    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    iget-object v1, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 196
    .line 197
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    iget-object v0, v4, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ku:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/uef$uef;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_8
    move-object v4, p0

    .line 207
    return-void
.end method

.method public xs()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ivm:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->ivm(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->xs:Landroid/view/View;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->ivm(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->ivm(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->zjm()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->yo()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->oa()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bcc:Landroid/widget/ImageView;

    .line 77
    .line 78
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->orq:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 79
    .line 80
    invoke-virtual/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->uef(Ljava/lang/String;IILandroid/widget/ImageView;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->lw:Landroid/widget/ImageView;

    .line 92
    .line 93
    const/16 v1, 0x8

    .line 94
    .line 95
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 96
    .line 97
    .line 98
    :cond_1
    return-void
.end method

.method public yo()Landroid/view/View;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public yo(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;I)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/ivm/oa;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public yo(II)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab:I

    .line 6
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->bs:I

    return-void
.end method

.method public yo(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->yo:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->moa(I)V

    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public zjm()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
