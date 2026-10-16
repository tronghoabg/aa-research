.class public Lcom/bytedance/sdk/openadsdk/activity/single/cz;
.super Lcom/bytedance/sdk/openadsdk/activity/single/yo;
.source "SourceFile"


# instance fields
.field private ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

.field private bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

.field private bs:I

.field private cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

.field private cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

.field private dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

.field private dz:I

.field public ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

.field private sy:Z

.field private wk:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

.field private wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private final xs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/activity/single/bcc;",
            ">;"
        }
    .end annotation
.end field

.field private zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->sy:Z

    .line 13
    .line 14
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 20
    .line 21
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v0, 0x23

    .line 24
    .line 25
    if-lt p3, v0, :cond_0

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    invoke-virtual {p2, p3}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private moa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->xs(Landroid/view/View;)V

    .line 3
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    if-eqz v0, :cond_1

    .line 5
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->xs(Landroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;->getITopLayout()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->xs(Landroid/view/View;)V

    .line 7
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->yo()V

    .line 10
    :cond_2
    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;

    if-eqz v0, :cond_3

    .line 11
    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->etd()V

    .line 12
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz p1, :cond_4

    .line 13
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/utils/dz;->yo()V

    :cond_4
    return-void
.end method

.method private oa(IZ)I
    .locals 16

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->at()Ljava/util/List;

    move-result-object v1

    .line 2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    .line 4
    iput v2, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dz:I

    const/4 v3, 0x0

    move/from16 v7, p1

    move v12, v3

    :goto_0
    if-ge v12, v2, :cond_9

    add-int/lit8 v4, v2, -0x1

    if-ne v12, v4, :cond_0

    const/4 v4, 0x1

    move v14, v4

    goto :goto_1

    :cond_0
    move v14, v3

    .line 5
    :goto_1
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v10, :cond_1

    .line 6
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->lw:Ljava/lang/String;

    invoke-virtual {v10, v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->pu(Ljava/lang/String;)V

    .line 7
    :cond_1
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 8
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 9
    iget-object v13, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    new-instance v4, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v15, v7, 0x1

    const/4 v9, 0x1

    const/4 v11, 0x0

    move-object v6, v10

    move v8, v12

    move v10, v14

    invoke-direct/range {v4 .. v11}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    move-object v10, v6

    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v11, v15

    goto :goto_4

    .line 10
    :cond_2
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v11, v7, 0x1

    invoke-static {v5, v10, v7, v12, v14}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v5, v7, 0x2

    const/4 v13, 0x1

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    move v11, v5

    goto :goto_4

    .line 12
    :cond_3
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 13
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v15, v7, 0x1

    invoke-static {v5, v10, v7, v12, v14}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 14
    :cond_4
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 15
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v11, v7, 0x1

    invoke-static {v5, v10, v7, v12, v14}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v5, v7, 0x2

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 17
    :cond_5
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v15, v7, 0x1

    invoke-static {v5, v10, v7, v12, v14}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :goto_4
    if-eqz p2, :cond_8

    .line 18
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-nez v14, :cond_6

    .line 19
    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lw()Z

    move-result v5

    if-eqz v5, :cond_8

    if-eqz v4, :cond_8

    .line 20
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v5, v11, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v7, v5

    goto :goto_5

    .line 21
    :cond_6
    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa()Z

    move-result v5

    if-eqz v5, :cond_7

    if-eqz v4, :cond_7

    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 22
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v5, v11, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v11, v5

    .line 23
    :cond_7
    invoke-virtual {v10}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bcc()Ljava/lang/String;

    move-result-object v4

    .line 24
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    .line 25
    new-instance v8, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v9, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    add-int/lit8 v4, v11, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x1

    invoke-direct/range {v8 .. v15}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZZZ)V

    iput-object v8, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wk:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 26
    iget-object v5, v0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v7, v4

    goto :goto_5

    :cond_8
    move v7, v11

    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    :cond_9
    return v7

    :cond_a
    return p1
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)I
    .locals 7

    .line 62
    iget p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_9

    .line 63
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 64
    instance-of v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean v2, v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-nez v2, :cond_9

    .line 65
    :cond_0
    iget-boolean v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    .line 66
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    .line 67
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v4

    .line 68
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uef()Lcom/bytedance/sdk/openadsdk/core/model/gsd;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 69
    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gsd;->yo()I

    move-result v5

    goto :goto_1

    :cond_1
    const/16 v5, 0xa

    .line 70
    :goto_1
    instance-of v6, v1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz v6, :cond_4

    if-eqz v4, :cond_2

    :goto_2
    add-int/2addr v0, v5

    goto :goto_4

    .line 71
    :cond_2
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v1

    if-eqz v1, :cond_3

    int-to-double v2, v0

    .line 72
    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    move-result-wide v0

    add-double/2addr v0, v2

    double-to-int v0, v0

    goto :goto_4

    :cond_3
    int-to-long v0, v0

    const-wide/16 v2, 0xa

    add-long/2addr v0, v2

    long-to-int v0, v0

    goto :goto_4

    .line 73
    :cond_4
    instance-of v4, v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz v4, :cond_8

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    if-eqz v2, :cond_7

    .line 74
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nl()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    .line 75
    :cond_6
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->tpx(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)I

    move-result v2

    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->rt(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)I

    move-result v1

    add-int/2addr v1, v2

    :goto_3
    add-int/2addr v1, v0

    move v0, v1

    goto :goto_4

    .line 76
    :cond_7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lw()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 77
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qz()Z

    move-result v2

    if-nez v2, :cond_8

    .line 78
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hzk()Lcom/bytedance/sdk/openadsdk/core/model/gr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gr;->moa()I

    move-result v1

    goto :goto_3

    :cond_8
    :goto_4
    add-int/lit8 p1, p1, 0x1

    goto/16 :goto_0

    :cond_9
    return v0
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 5

    .line 27
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-nez p3, :cond_1

    if-eqz p2, :cond_0

    .line 28
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->d_()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 29
    new-instance p3, Lcom/bytedance/sdk/openadsdk/activity/single/oa$moa;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    invoke-direct {p3, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$moa;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;)V

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    goto :goto_0

    .line 30
    :cond_0
    new-instance p3, Lcom/bytedance/sdk/openadsdk/activity/single/oa$uef;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    invoke-direct {p3, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$uef;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;)V

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    .line 31
    :cond_1
    :goto_0
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->oa()V

    .line 32
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)I

    move-result p3

    .line 33
    instance-of v0, p2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v2, p2

    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean v2, v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-nez v2, :cond_2

    iget-boolean v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    if-nez v2, :cond_2

    iget-object v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qz()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 34
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->moa()V

    goto/16 :goto_2

    .line 35
    :cond_2
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2, p3, v3}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(ILcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 36
    instance-of v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz v2, :cond_3

    move-object v3, p2

    check-cast v3, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean v3, v3, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-eqz v3, :cond_3

    .line 37
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->moa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    goto :goto_2

    .line 38
    :cond_3
    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nl()Z

    move-result v3

    if-eqz v3, :cond_8

    .line 39
    instance-of v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 40
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v1

    goto :goto_1

    :cond_4
    move v3, v4

    :goto_1
    if-eqz v2, :cond_6

    .line 41
    iget-boolean v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    if-nez v2, :cond_5

    iget-object v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    move v4, v1

    :cond_6
    if-nez v3, :cond_7

    if-eqz v4, :cond_a

    .line 43
    :cond_7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    invoke-virtual {v2, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    goto :goto_2

    .line 44
    :cond_8
    iget-boolean v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    if-eqz v3, :cond_9

    .line 45
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-boolean v4, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->bs:Z

    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V

    goto :goto_2

    :cond_9
    if-eqz v2, :cond_a

    .line 46
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hzk()Lcom/bytedance/sdk/openadsdk/core/model/gr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gr;->moa()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->yo(I)V

    .line 47
    :cond_a
    :goto_2
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz v2, :cond_b

    if-nez p1, :cond_b

    mul-int/lit16 p3, p3, 0x3e8

    int-to-long v3, p3

    .line 48
    invoke-interface {v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef(J)V

    .line 49
    :cond_b
    instance-of p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    const/16 p3, 0x8

    if-eqz p1, :cond_d

    .line 50
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bs:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bs:I

    const/4 p1, 0x0

    .line 51
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(F)V

    .line 52
    iget-object p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 53
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 54
    :cond_c
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->yo(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    return-void

    :cond_d
    if-eqz v0, :cond_12

    .line 55
    move-object p1, p2

    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-eqz p1, :cond_e

    .line 56
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 57
    :cond_e
    iget-boolean p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    if-eqz p1, :cond_f

    iget-object p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 58
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bs:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bs:I

    .line 59
    :cond_f
    iget-boolean p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    if-nez p1, :cond_11

    iget-object p1, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_10

    goto :goto_3

    .line 60
    :cond_10
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->yo(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    return-void

    .line 61
    :cond_11
    :goto_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_12
    return-void
.end method

.method private orq()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    .line 2
    .line 3
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/cz;->uef(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/utils/cz$uef;)Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    .line 13
    .line 14
    return-void
.end method

.method private tpx()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->wk(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ivm()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, v2, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->oa(IZ)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 53
    .line 54
    add-int/lit8 v5, v2, 0x1

    .line 55
    .line 56
    const/4 v6, 0x1

    .line 57
    invoke-static {v3, v4, v2, v5, v6}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v2, v5

    .line 65
    :cond_1
    invoke-direct {p0, v2, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(IZ)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private static uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 8

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getDurationSlotType()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 7
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V

    return-object v1

    :cond_2
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    .line 8
    new-instance p0, Lcom/bytedance/sdk/openadsdk/activity/single/ivm;

    move v7, v6

    move v6, v5

    move v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/activity/single/ivm;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V

    return-object v2
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    return-object p0
.end method

.method private uef(IZ)V
    .locals 0

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dz()Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ivm()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->orq()V

    :cond_1
    :goto_0
    return-void
.end method

.method private yo(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v2

    const-string v3, "tt_multiple_ad_indicator"

    invoke-static {v2, v3}, Lcom/bytedance/sdk/component/utils/orq;->oa(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 2
    iget p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dj:I

    .line 3
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    add-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dz:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, v0

    aput-object v5, v6, v1

    invoke-virtual {v4, v2, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 5
    const-string v0, "SeqSwitchLayoutManager"

    const-string v1, "updateCurrentAdIndex: "

    invoke-static {v0, v1, p1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public bcc()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public cq()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    .line 8
    .line 9
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v0, v2, :cond_3

    .line 18
    .line 19
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 26
    .line 27
    instance-of v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_2
    instance-of v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    iget-boolean v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ab:Z

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_3
    return-object v1
.end method

.method public cz()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->cz()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dhk()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public dhk()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, -0x1

    .line 9
    return v0
.end method

.method public dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Lcom/bytedance/sdk/openadsdk/activity/single/lw;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wk:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v0, -0x1

    .line 14
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    :goto_1
    if-le v1, v0, :cond_3

    .line 23
    .line 24
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 31
    .line 32
    instance-of v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 37
    .line 38
    iget-boolean v3, v2, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wk:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    add-int/lit8 v1, v1, -0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wk:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 49
    .line 50
    return-object v0
.end method

.method public ivm()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->ivm()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cq()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public moa()Z
    .locals 4

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    const/4 v2, 0x1

    .line 16
    invoke-static {v2, v0}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 17
    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 18
    instance-of v3, v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz v3, :cond_1

    check-cast v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-eqz v0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public oa()V
    .locals 2

    .line 79
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa()V

    .line 80
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->yo()V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz v0, :cond_1

    const/4 v1, -0x1

    .line 83
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->oa(I)V

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz v0, :cond_2

    .line 85
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef()V

    :cond_2
    return-void
.end method

.method public oa(Landroid/app/Activity;)V
    .locals 1

    .line 95
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa(Landroid/app/Activity;)V

    .line 96
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)V
    .locals 2

    const/4 p1, 0x1

    .line 86
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 87
    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(I)V

    .line 88
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz p1, :cond_4

    .line 89
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/utils/dz;->oa()V

    return-void

    :cond_1
    if-ne p2, p1, :cond_2

    .line 90
    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->oa(I)V

    .line 91
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz p1, :cond_4

    .line 92
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/utils/dz;->uef()V

    return-void

    :cond_2
    const/4 v0, 0x3

    if-eq p2, v0, :cond_3

    const/4 v0, 0x4

    if-ne p2, v0, :cond_4

    .line 93
    :cond_3
    :try_start_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p2

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dxx()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 94
    const-string v0, "SeqSwitchLayoutManager"

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public oib()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->cz()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public sy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->bcc()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public uef()V
    .locals 0

    .line 2
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef()V

    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->tpx()V

    return-void
.end method

.method public uef(F)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    if-nez v0, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/wk/uef;->setProgress(F)V

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_1

    .line 100
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 101
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    if-lez p1, :cond_2

    .line 102
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_2

    .line 103
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public uef(I)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 105
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    .line 106
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->oa(I)V

    :cond_1
    return-void
.end method

.method public uef(II)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 76
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(II)V

    if-ltz p1, :cond_1

    .line 77
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->yo:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 78
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p2

    const-string v2, "tt_multiple_playable_wait_tips"

    invoke-static {p2, v2}, Lcom/bytedance/sdk/component/utils/orq;->oa(Landroid/content/Context;Ljava/lang/String;)I

    move-result p2

    .line 79
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-virtual {v3, p2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->yo:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 82
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public uef(Landroid/app/Activity;)V
    .locals 3

    .line 83
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/app/Activity;)V

    .line 84
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oa(Landroid/app/Activity;)V

    .line 86
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dhk()I

    move-result p1

    .line 87
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 88
    iget v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    if-lt v2, p1, :cond_1

    .line 89
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oib()V

    goto :goto_0

    .line 90
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz p1, :cond_3

    .line 91
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->yo()V

    .line 92
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz p1, :cond_4

    .line 93
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/utils/dz;->yo()V

    .line 94
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->orq()Z

    move-result p1

    if-nez p1, :cond_5

    .line 95
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->tpq()Z

    move-result p1

    if-nez p1, :cond_5

    .line 96
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/activity/single/oa$yo;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$yo;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_5
    const/4 p1, 0x0

    .line 97
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    return-void
.end method

.method public uef(Landroid/os/Bundle;)V
    .locals 4

    .line 12
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/os/Bundle;)V

    .line 13
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 14
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-virtual {v1, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    new-instance p1, Lcom/bytedance/sdk/openadsdk/wk/uef;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-direct {p1, v1}, Lcom/bytedance/sdk/openadsdk/wk/uef;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    .line 17
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x50

    .line 18
    iput v1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 19
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cz:Lcom/bytedance/sdk/openadsdk/wk/uef;

    invoke-virtual {v1, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-direct {p1, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/4 v1, 0x0

    const/high16 v2, -0x1000000

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, v3, v1, v3, v2}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 24
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 25
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v2

    iput v2, p1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 26
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v2

    iput v2, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    const v2, 0x800035

    .line 27
    iput v2, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->wrv:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v2, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-direct {p1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 30
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 32
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;->setShowDislike(Z)V

    .line 33
    new-instance p1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;-><init>(ILcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 34
    invoke-virtual {p0, v1, v1, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 2

    .line 140
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/view/View;)V

    .line 141
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x4

    .line 142
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public uef(Landroid/view/View;Z)V
    .locals 1

    .line 144
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/view/View;Z)V

    .line 145
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x4

    .line 147
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz p2, :cond_2

    .line 149
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void

    .line 150
    :cond_2
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 1

    .line 127
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    if-nez p1, :cond_0

    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wrv:Z

    if-eqz p1, :cond_1

    .line 129
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz p1, :cond_1

    .line 130
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->ivm()V

    .line 131
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object p1

    .line 132
    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz v0, :cond_3

    .line 133
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 134
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 135
    :cond_2
    check-cast p1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->tpx()V

    :cond_3
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 4

    .line 35
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    goto/16 :goto_2

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_2

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dhk()I

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-nez p2, :cond_4

    .line 38
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v1, :cond_2

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    add-int/2addr v1, v0

    goto :goto_0

    :cond_2
    move v1, p1

    .line 39
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 40
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    :cond_3
    if-nez p2, :cond_4

    .line 41
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs()V

    return-void

    .line 42
    :cond_4
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v1, :cond_9

    if-ne v1, p2, :cond_5

    goto :goto_2

    .line 43
    :cond_5
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dz()V

    .line 44
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->moa()V

    .line 45
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 46
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    :cond_6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oib()V

    .line 48
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    iput-boolean p1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wrv:Z

    .line 49
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lw()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 50
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz v2, :cond_9

    .line 51
    iget v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    add-int/2addr v1, v0

    .line 52
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 53
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    goto :goto_1

    :cond_7
    const/4 v1, 0x0

    .line 54
    :goto_1
    instance-of v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz v2, :cond_9

    if-eq v1, p2, :cond_9

    .line 55
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 56
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v3, v3, Landroid/view/ViewGroup;

    if-eqz v3, :cond_8

    .line 57
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 58
    :cond_8
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oib()V

    .line 59
    :cond_9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-static {v1}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_2
    return-void

    .line 60
    :cond_a
    iput-boolean v0, p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wrv:Z

    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 62
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 63
    invoke-direct {p0, v0, p2, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    .line 64
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    invoke-virtual {p2, v1, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oa(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    .line 65
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    move-result-object p2

    if-eqz p2, :cond_d

    .line 66
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 67
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    if-ne v1, v2, :cond_b

    .line 68
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 69
    :cond_b
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_c

    .line 70
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 71
    :cond_c
    :goto_3
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_d

    .line 72
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, p2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_d
    if-eqz v0, :cond_e

    .line 73
    iget p1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->zjm:I

    :cond_e
    :goto_4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_f

    .line 74
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p2, v0, v1, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 75
    :cond_f
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 8

    .line 107
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_2

    .line 108
    instance-of p1, v0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz p1, :cond_2

    .line 109
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p1

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    if-eqz p1, :cond_1

    .line 110
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p1

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dz()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    .line 111
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    iget p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dj:I

    add-int/lit8 p1, p1, 0x1

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-object v5, v4

    iget-object v4, v5, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->e_()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/bytedance/sdk/openadsdk/activity/single/cz$2;

    invoke-direct {v7, p0, v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/cz$2;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/cz;JI)V

    const-string v6, "dislike_skip"

    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;)V

    .line 113
    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object p1

    if-nez p1, :cond_3

    .line 114
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dz()Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    move-result-object p1

    .line 115
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p0, v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Z)V
    .locals 0

    .line 136
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Z)V

    if-nez p1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wrv:Z

    if-eqz p1, :cond_1

    .line 138
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz p1, :cond_1

    .line 139
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZZZI)V
    .locals 2

    .line 116
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    goto :goto_1

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->dz()Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 118
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->gsd()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v1, p5, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;-><init>(ILcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 119
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;->uef:Landroid/os/Bundle;

    const-string p5, "isSkip"

    invoke-virtual {p1, p5, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 120
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;->uef:Landroid/os/Bundle;

    const-string p2, "force"

    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 121
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;->uef:Landroid/os/Bundle;

    const-string p2, "isFromLandingPage"

    invoke-virtual {p1, p2, p4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 122
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {p0, p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;Z)V
    .locals 1

    .line 123
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;Z)V

    if-eqz p1, :cond_0

    .line 124
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-ne p1, v0, :cond_0

    .line 125
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz p1, :cond_0

    .line 126
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->oa(Z)V

    :cond_0
    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 152
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Z)V

    .line 153
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->yo(Z)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)Z
    .locals 1

    .line 151
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->xs:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public wk()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->at()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public wrv()Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bcc:Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->xs()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->moa()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public yo()V
    .locals 2

    .line 6
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->yo()V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ab:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dz()V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->cq:Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;

    if-eqz v0, :cond_1

    const/4 v1, -0x1

    .line 10
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;->uef(I)V

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->ivm:Lcom/bytedance/sdk/openadsdk/utils/dz;

    if-eqz v0, :cond_2

    .line 12
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/utils/dz;->oa()V

    :cond_2
    return-void
.end method

.method public zjm()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->bs:I

    .line 2
    .line 3
    return v0
.end method
