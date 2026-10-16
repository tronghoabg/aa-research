.class public Lcom/bytedance/adsdk/ugeno/cz/moa/yo;
.super Lcom/bytedance/adsdk/ugeno/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/adsdk/ugeno/oa/yo<",
        "Lcom/bytedance/adsdk/ugeno/cz/moa/uef;",
        ">;"
    }
.end annotation


# instance fields
.field protected aje:Ljava/lang/String;

.field private jp:I

.field protected lo:Z

.field private nj:F

.field protected qn:Landroid/widget/ImageView$ScaleType;

.field private syr:I

.field protected uef:Ljava/lang/String;

.field private uf:F

.field private wf:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->qn:Landroid/widget/ImageView$ScaleType;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->syr:I

    .line 10
    .line 11
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uf:F

    .line 14
    .line 15
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->nj:F

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->jp:I

    .line 19
    .line 20
    const/high16 p1, 0x42480000    # 50.0f

    .line 21
    .line 22
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->wf:F

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic ab(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic bcc(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->nj:F

    return p0
.end method

.method public static synthetic bs(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method private cq(Ljava/lang/String;)Landroid/widget/ImageView$ScaleType;
    .locals 3

    .line 2
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "centerCrop"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_1
    const-string v2, "fitCenter"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_2
    const-string v2, "crop"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_3
    const-string v2, "fit"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_4
    const-string v2, "centerInside"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_5
    const-string v2, "fitStart"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_6
    const-string v2, "fitEnd"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_7
    const-string v2, "center"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    return-object v0

    .line 4
    :pswitch_0
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 5
    :pswitch_1
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 6
    :pswitch_2
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 7
    :pswitch_3
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 8
    :pswitch_4
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    return-object p1

    .line 9
    :pswitch_5
    sget-object p1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_7
        -0x4bf440f6 -> :sswitch_6
        -0x1f1fd52f -> :sswitch_5
        -0x144ecb4f -> :sswitch_4
        0x18c11 -> :sswitch_3
        0x2eba90 -> :sswitch_2
        0x1f0a33c6 -> :sswitch_1
        0x453ac885 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic cq(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method public static synthetic cz(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    return-object p0
.end method

.method private cz()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    const-string v1, "local://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->yo()Ljava/lang/String;

    move-result-object v1

    const-string v2, "raw"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v1, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/bytedance/adsdk/ugeno/xs/moa;->uef(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setImageResource(I)V

    return-void

    .line 8
    :cond_1
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef(Landroid/widget/ImageView;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 11
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v1, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {v1, v0}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setImageResource(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :catchall_0
    :goto_0
    return-void

    .line 12
    :cond_3
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->zjm()V

    return-void
.end method

.method public static synthetic dj(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic dz(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uf:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic lw(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method public static synthetic oib(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic sy(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method private varargs uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->uef(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    instance-of v0, p1, Lcom/bytedance/adsdk/ugeno/oa/uef;

    if-eqz v0, :cond_2

    .line 27
    check-cast p1, Lcom/bytedance/adsdk/ugeno/oa/uef;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/uef;->cz()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 28
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 29
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 30
    invoke-direct {p0, v0, p2, p3}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic wk(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic wrv(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic xs(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Lcom/bytedance/adsdk/ugeno/core/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->tam:Lcom/bytedance/adsdk/ugeno/core/ivm;

    return-object p0
.end method

.method public static synthetic zjm(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    return-object p0
.end method

.method private zjm()V
    .locals 9

    .line 2
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uf:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/lw;->oa()Lcom/bytedance/adsdk/ugeno/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->cz:Lcom/bytedance/adsdk/ugeno/core/dj;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    new-instance v3, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$1;

    invoke-direct {v3, p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$1;-><init>(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/bytedance/adsdk/ugeno/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/uef$uef;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/lw;->oa()Lcom/bytedance/adsdk/ugeno/uef;

    move-result-object v2

    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->cz:Lcom/bytedance/adsdk/ugeno/core/dj;

    iget-object v4, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v6

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v7

    new-instance v8, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$2;

    invoke-direct {v8, p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$2;-><init>(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)V

    .line 6
    invoke-interface/range {v2 .. v8}, Lcom/bytedance/adsdk/ugeno/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Landroid/widget/ImageView;IILcom/bytedance/adsdk/ugeno/uef$uef;)V

    .line 7
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->lo:Z

    if-nez v0, :cond_2

    iget v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->nj:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 8
    :cond_2
    :goto_0
    invoke-static {}, Lcom/bytedance/adsdk/ugeno/lw;->uef()Lcom/bytedance/adsdk/ugeno/lw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/lw;->oa()Lcom/bytedance/adsdk/ugeno/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->cz:Lcom/bytedance/adsdk/ugeno/core/dj;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    new-instance v3, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$3;

    invoke-direct {v3, p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$3;-><init>(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/bytedance/adsdk/ugeno/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/dj;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/uef$uef;)V

    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->bcc()V

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    .line 5
    invoke-static {v0}, LA0/j;->x(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {v0}, LA0/j;->j(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/AnimatedImageDrawable;

    move-result-object v0

    invoke-static {v0}, LA0/j;->r(Landroid/graphics/drawable/AnimatedImageDrawable;)V

    :cond_0
    return-void
.end method

.method public dz(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    return-void
.end method

.method public moa()Lcom/bytedance/adsdk/ugeno/cz/moa/uef;
    .locals 2

    .line 2
    new-instance v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->uef(Lcom/bytedance/adsdk/ugeno/moa;)V

    return-object v0
.end method

.method public oa()V
    .locals 3

    .line 2
    invoke-super {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa()V

    .line 3
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->cz()V

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->qn:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->hts:I

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setBorderColor(I)V

    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->gem:F

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setCornerRadius(F)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->nkh:F

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setBorderWidth(F)V

    .line 8
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->syr:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 9
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v1, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->jp:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setEraseEnabled(Z)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    iget v1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->wf:F

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setEraseRadius(F)V

    return-void
.end method

.method public synthetic uef()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->moa()Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    move-result-object v0

    return-object v0
.end method

.method public uef(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/bytedance/adsdk/ugeno/xs/moa;->oa(Landroid/content/Context;Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "imageBgBlur"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v4, "tintColor"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_2
    const-string v4, "erase"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_3
    const-string v4, "src"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_4
    const-string v4, "isBgGaussianBlur"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_5
    const-string v4, "eraseRadius"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_6
    const-string v4, "imageBlur"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_7
    const-string v4, "scaleType"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    move v3, v0

    goto :goto_0

    :sswitch_8
    const-string v4, "scaleMode"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    move v3, v1

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    .line 7
    :pswitch_0
    invoke-static {p2, v2}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->nj:F

    return-void

    .line 8
    :pswitch_1
    invoke-static {p2}, Lcom/bytedance/adsdk/ugeno/xs/uef;->uef(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->syr:I

    return-void

    .line 9
    :pswitch_2
    invoke-static {p2, v1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->jp:I

    if-ne p1, v0, :cond_a

    .line 10
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    if-eqz p1, :cond_a

    .line 11
    check-cast p1, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setEraseEnabled(Z)V

    return-void

    .line 12
    :pswitch_3
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef:Ljava/lang/String;

    return-void

    .line 13
    :pswitch_4
    invoke-static {p2, v1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->lo:Z

    return-void

    :pswitch_5
    const/high16 p1, 0x42480000    # 50.0f

    .line 14
    invoke-static {p2, p1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->wf:F

    .line 15
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    if-eqz p2, :cond_a

    .line 16
    check-cast p2, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    invoke-virtual {p2, p1}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setEraseRadius(F)V

    :cond_a
    :goto_1
    return-void

    .line 17
    :pswitch_6
    invoke-static {p2, v2}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uf:F

    return-void

    .line 18
    :pswitch_7
    invoke-direct {p0, p2}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->cq(Ljava/lang/String;)Landroid/widget/ImageView$ScaleType;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->qn:Landroid/widget/ImageView$ScaleType;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6ff1fdf3 -> :sswitch_8
        -0x6feea85c -> :sswitch_7
        -0x345fd79e -> :sswitch_6
        -0x30b32928 -> :sswitch_5
        -0x16313a4f -> :sswitch_4
        0x1bde4 -> :sswitch_3
        0x5c492a6 -> :sswitch_2
        0x4f219128 -> :sswitch_1
        0x63d9eb87 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public uef(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-virtual {p0, p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa(Lcom/bytedance/adsdk/ugeno/oa/yo;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    move-result-object v0

    check-cast v0, Lcom/bytedance/adsdk/ugeno/oa/uef;

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->xs:Lcom/bytedance/adsdk/ugeno/oa/uef;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->lz()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_0
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->xs:Lcom/bytedance/adsdk/ugeno/oa/uef;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public xs()V
    .locals 2

    .line 2
    invoke-super {p0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->xs()V

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    check-cast v0, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    new-instance v1, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$4;

    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/ugeno/cz/moa/yo$4;-><init>(Lcom/bytedance/adsdk/ugeno/cz/moa/yo;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/cz/moa/yo;->aje:Ljava/lang/String;

    return-object v0
.end method
