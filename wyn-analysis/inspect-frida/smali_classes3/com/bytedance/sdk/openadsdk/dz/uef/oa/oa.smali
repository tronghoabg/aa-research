.class public Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;
.super Lcom/bytedance/sdk/openadsdk/core/ivm/yo;
.source "SourceFile"


# instance fields
.field private uef:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef:Landroid/content/Context;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->oa()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private oa()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private uef(F)I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p1

    return p1
.end method


# virtual methods
.method public uef()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;

    invoke-direct {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;-><init>(Landroid/content/Context;)V

    .line 5
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    .line 7
    const-string v4, "tt_history_no_data"

    invoke-static {v0, v4}, Lcom/bytedance/sdk/component/utils/orq;->oa(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 8
    sget v4, Lcom/bytedance/sdk/openadsdk/utils/bs;->sw:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    const/4 v4, 0x2

    const/high16 v5, 0x41900000    # 18.0f

    .line 9
    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 10
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v5, v6, :cond_1

    .line 11
    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-static {v5}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->h(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_2

    .line 12
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 13
    :cond_2
    const-string v5, "#333333"

    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xd

    .line 15
    invoke-virtual {v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/high16 v7, 0x41800000    # 16.0f

    .line 16
    invoke-direct {p0, v7}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v7

    iput v7, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    const/high16 v7, 0x41000000    # 8.0f

    .line 17
    invoke-direct {p0, v7}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v8

    iput v8, v5, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 18
    invoke-virtual {v1, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v5, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    .line 20
    const-string v8, "tt_history_empty_icon"

    invoke-static {v0, v8}, Lcom/bytedance/sdk/component/utils/orq;->moa(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 21
    sget v8, Lcom/bytedance/sdk/openadsdk/utils/bs;->jkf:I

    invoke-virtual {v5, v8}, Landroid/view/View;->setId(I)V

    .line 22
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v9, 0x42900000    # 72.0f

    .line 23
    invoke-direct {p0, v9}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v10

    .line 24
    invoke-direct {p0, v9}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v9

    invoke-direct {v8, v10, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 25
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v9

    invoke-virtual {v8, v4, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v9, 0xe

    .line 26
    invoke-virtual {v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 27
    invoke-virtual {v1, v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v5, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    .line 29
    const-string v8, "tt_history_placeholder_submessage"

    invoke-static {v0, v8}, Lcom/bytedance/sdk/component/utils/orq;->oa(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    const/high16 v0, 0x41600000    # 14.0f

    .line 30
    invoke-virtual {v5, v4, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 31
    const-string v0, "#666666"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v0, 0x11

    .line 32
    invoke-virtual {v5, v0}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setGravity(I)V

    const/high16 v0, 0x438c0000    # 280.0f

    .line 33
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setMaxWidth(I)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 34
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v5, v0, v4}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/high16 v0, 0x41a00000    # 20.0f

    .line 35
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v4

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v0

    invoke-virtual {v5, v4, v2, v0, v2}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setPadding(IIII)V

    .line 36
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x3

    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 38
    invoke-virtual {v0, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 39
    invoke-direct {p0, v7}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa/oa;->uef(F)I

    move-result v2

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 40
    invoke-virtual {v1, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
