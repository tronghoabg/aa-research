.class public Lcom/bytedance/sdk/openadsdk/core/cq/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ab:F

.field private bcc:I

.field private bs:F

.field private cq:I

.field private cz:I

.field private dhk:Z

.field private dj:F

.field private dz:Z

.field private ivm:I

.field private lw:I

.field private moa:F

.field protected oa:I

.field private oib:Landroid/content/Context;

.field private sy:F

.field protected uef:Ljava/lang/String;

.field private wk:F

.field private wrv:F

.field private xs:I

.field private yo:F

.field private zjm:Landroid/text/TextUtils$TruncateAt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x1000000

    .line 5
    .line 6
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oa:I

    .line 7
    .line 8
    const/high16 v0, 0x41400000    # 12.0f

    .line 9
    .line 10
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo:F

    .line 11
    .line 12
    const/high16 v0, -0x40800000    # -1.0f

    .line 13
    .line 14
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->moa:F

    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ivm:I

    .line 20
    .line 21
    const v0, 0x800003

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bcc:I

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    .line 27
    .line 28
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dhk:Z

    .line 29
    .line 30
    return-void
.end method

.method private moa(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x7fffffff

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "none"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "strikethrough"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "underline"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    :pswitch_0
    return v0

    :pswitch_1
    const/16 p1, 0x10

    return p1

    :pswitch_2
    const/16 p1, 0x8

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3d363934 -> :sswitch_2
        -0x39f7812d -> :sswitch_1
        0x33af38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private moa(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V
    .locals 4

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dhk:Z

    if-eqz v0, :cond_2

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dz:Z

    if-eqz v0, :cond_1

    .line 4
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bs:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    const v0, 0x3727c5ac    # 1.0E-5f

    .line 5
    :cond_0
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wk:F

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ab:F

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->cq:I

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    :cond_1
    return-void

    .line 6
    :cond_2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bs:F

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wk:F

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ab:F

    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->cq:I

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    return-void
.end method

.method private oa(Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x4642c5d0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v1, :cond_2

    const v1, -0x3df94319

    if-eq v0, v1, :cond_1

    const v1, 0x2e3a85

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "bold"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_1
    const-string v0, "normal"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v2

    goto :goto_1

    :cond_2
    const-string v0, "italic"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v4

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_5

    if-eq p1, v4, :cond_4

    return v3

    :cond_4
    return v2

    :cond_5
    return v4
.end method

.method private oa(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V
    .locals 2

    const/4 v0, 0x0

    .line 2
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dj:F

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;->setLineSpacing(FF)V

    return-void
.end method

.method private uef(Ljava/lang/String;)I
    .locals 4

    const/4 v0, 0x1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x3

    const/4 v2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "center_horizontal"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v3, "right"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    goto :goto_0

    :sswitch_2
    const-string v3, "left"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v3, "center_vertical"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v3, "center"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v1

    :pswitch_0
    return v0

    :pswitch_1
    const/4 p1, 0x5

    return p1

    :pswitch_2
    return v1

    :pswitch_3
    const/16 p1, 0x10

    return p1

    :pswitch_4
    const/16 p1, 0x11

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        -0x14c923e0 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x3f657e4e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private uef(I)Landroid/graphics/Typeface;
    .locals 2

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 47
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->g(I)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v0, 0x2bc

    if-lt p1, v0, :cond_1

    .line 48
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    return-object p1

    :cond_1
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    return-object p1
.end method

.method private yo(Ljava/lang/String;)Landroid/text/TextUtils$TruncateAt;
    .locals 1

    .line 1
    const-string v0, "none"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    return-object p1
.end method

.method private yo(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V
    .locals 5

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dj:F

    const/high16 v1, 0x40400000    # 3.0f

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v1, v0}, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;->setLineSpacing(FF)V

    return-void

    .line 4
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo:F

    const v3, 0x3f99999a    # 1.2f

    mul-float/2addr v2, v3

    sub-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-static {v1, v0}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    add-int/2addr v2, v0

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v0

    .line 10
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dj:F

    invoke-static {v0, v1}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {p1, v0}, LA0/j;->v(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    const-string v0, "null"

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const/4 v0, 0x1

    .line 3
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo:F

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;->setTextSize(IF)V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->moa:F

    invoke-static {v0, v1}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;->setMinTextSize(F)V

    .line 5
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oa:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bcc:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 7
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->xs:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLines(I)V

    .line 8
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ivm:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 9
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->cz:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_3

    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->zjm:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 12
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dj:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 13
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dhk:Z

    if-eqz v0, :cond_4

    .line 14
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V

    goto :goto_1

    .line 15
    :cond_4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oa(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V

    .line 16
    :cond_5
    :goto_1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wrv:F

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef(I)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 17
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->moa(Lcom/bytedance/adsdk/ugeno/cz/ivm/uef;)V

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo:F

    invoke-static {v0, v2}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result v0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_6

    .line 19
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->sy:F

    div-float/2addr v1, v0

    .line 20
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setLetterSpacing(F)V

    :cond_6
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 22
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_14

    .line 23
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_14

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, -0x40800000    # -1.0f

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v6, "letterSpacing"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v5, 0x10

    goto/16 :goto_0

    :sswitch_1
    const-string v6, "maxLines"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v5, 0xf

    goto/16 :goto_0

    :sswitch_2
    const-string v6, "minTextSize"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v5, 0xe

    goto/16 :goto_0

    :sswitch_3
    const-string v6, "ellipsis"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v5, 0xd

    goto/16 :goto_0

    :sswitch_4
    const-string v6, "lines"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v5, 0xc

    goto/16 :goto_0

    :sswitch_5
    const-string v6, "text"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v5, 0xb

    goto/16 :goto_0

    :sswitch_6
    const-string v6, "lineHeight"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v5, 0xa

    goto/16 :goto_0

    :sswitch_7
    const-string v6, "fontWeight"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v5, 0x9

    goto/16 :goto_0

    :sswitch_8
    const-string v6, "textDecoration"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v5, 0x8

    goto/16 :goto_0

    :sswitch_9
    const-string v6, "textSize"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v5, 0x7

    goto :goto_0

    :sswitch_a
    const-string v6, "shadowBlur"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v5, 0x6

    goto :goto_0

    :sswitch_b
    const-string v6, "textStyle"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    const/4 v5, 0x5

    goto :goto_0

    :sswitch_c
    const-string v6, "textColor"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    const/4 v5, 0x4

    goto :goto_0

    :sswitch_d
    const-string v6, "textAlign"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_0

    :cond_e
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_e
    const-string v6, "shadowOffsetY"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_0

    :cond_f
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_f
    const-string v6, "shadowOffsetX"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_0

    :cond_10
    move v5, v0

    goto :goto_0

    :sswitch_10
    const-string v6, "shadowColor"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_0

    :cond_11
    move v5, v1

    :goto_0
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 25
    :pswitch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    invoke-static {p2, v4}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p2

    invoke-static {p1, p2}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->sy:F

    return-void

    :pswitch_1
    const p1, 0x7fffffff

    .line 26
    invoke-static {p2, p1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;I)I

    move-result p2

    if-lez p2, :cond_12

    move p1, p2

    .line 27
    :cond_12
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ivm:I

    return-void

    .line 28
    :pswitch_2
    invoke-static {p2, v3}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->moa:F

    return-void

    .line 29
    :pswitch_3
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo(Ljava/lang/String;)Landroid/text/TextUtils$TruncateAt;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->zjm:Landroid/text/TextUtils$TruncateAt;

    return-void

    .line 30
    :pswitch_4
    invoke-static {p2, v1}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->xs:I

    return-void

    .line 31
    :pswitch_5
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef:Ljava/lang/String;

    return-void

    .line 32
    :pswitch_6
    invoke-static {p2, v2}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dj:F

    return-void

    .line 33
    :pswitch_7
    invoke-static {p2, v3}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wrv:F

    cmpg-float p2, p1, v2

    if-ltz p2, :cond_13

    const/high16 p2, 0x447a0000    # 1000.0f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_14

    :cond_13
    const/high16 p1, 0x43c80000    # 400.0f

    .line 34
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wrv:F

    return-void

    .line 35
    :pswitch_8
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->moa(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->cz:I

    return-void

    .line 36
    :pswitch_9
    invoke-static {p2, v4}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->yo:F

    return-void

    .line 37
    :pswitch_a
    invoke-static {p2, v4}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bs:F

    return-void

    .line 38
    :pswitch_b
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oa(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->lw:I

    return-void

    .line 39
    :pswitch_c
    invoke-static {p2}, Lcom/bytedance/adsdk/ugeno/xs/uef;->uef(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oa:I

    return-void

    .line 40
    :pswitch_d
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->uef(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->bcc:I

    return-void

    .line 41
    :pswitch_e
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    invoke-static {p2, v4}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p2

    invoke-static {p1, p2}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->ab:F

    return-void

    .line 42
    :pswitch_f
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->oib:Landroid/content/Context;

    invoke-static {p2, v4}, Lcom/bytedance/adsdk/ugeno/xs/yo;->uef(Ljava/lang/String;F)F

    move-result p2

    invoke-static {p1, p2}, Lcom/bytedance/adsdk/ugeno/xs/bcc;->uef(Landroid/content/Context;F)F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->wk:F

    return-void

    .line 43
    :pswitch_10
    invoke-static {p2}, Lcom/bytedance/adsdk/ugeno/xs/uef;->uef(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->cq:I

    .line 44
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa;->dz:Z

    :cond_14
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5ec185dd -> :sswitch_10
        -0x495b371b -> :sswitch_f
        -0x495b371a -> :sswitch_e
        -0x3f826a28 -> :sswitch_d
        -0x3f64d1ca -> :sswitch_c
        -0x3e80e37c -> :sswitch_b
        -0x3cdd7259 -> :sswitch_a
        -0x3bd2c532 -> :sswitch_9
        -0x3468fa43 -> :sswitch_8
        -0x2bc67c59 -> :sswitch_7
        -0x1ebe99c5 -> :sswitch_6
        0x36452d -> :sswitch_5
        0x6234eff -> :sswitch_4
        0xb3f60d1 -> :sswitch_3
        0x14eed340 -> :sswitch_2
        0x174277fb -> :sswitch_1
        0x7dd4813d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
