.class public Lcom/bytedance/sdk/openadsdk/core/widget/oa;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/widget/oa$oa;,
        Lcom/bytedance/sdk/openadsdk/core/widget/oa$uef;
    }
.end annotation


# instance fields
.field private ab:Z

.field private final bcc:Landroid/content/Context;

.field private bs:I

.field private cq:I

.field private cz:Ljava/lang/String;

.field private dj:Ljava/lang/String;

.field private dz:Landroid/window/OnBackInvokedCallback;

.field private ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

.field private lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

.field private moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

.field private oib:I

.field private sy:F

.field public uef:Lcom/bytedance/sdk/openadsdk/core/widget/oa$oa;

.field private wk:Z

.field private wrv:Ljava/lang/String;

.field private xs:Landroid/view/View;

.field private yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field private zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "tt_custom_dialog"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/bytedance/sdk/component/utils/orq;->ivm(Landroid/content/Context;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->cq:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->wk:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ab:Z

    .line 17
    .line 18
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bcc:Landroid/content/Context;

    .line 19
    .line 20
    return-void
.end method

.method private oa(Landroid/content/Context;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 22
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;

    invoke-direct {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;-><init>(Landroid/content/Context;)V

    .line 23
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 24
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    invoke-direct {v3, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v4, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xd

    .line 27
    invoke-virtual {v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/high16 v7, 0x438c0000    # 280.0f

    .line 28
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setMinimumWidth(I)V

    const/high16 v7, 0x42000000    # 32.0f

    .line 29
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v3, v9, v8, v9, v9}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setPadding(IIII)V

    .line 30
    const-string v8, "tt_custom_dialog_bg_new"

    invoke-static {v1, v8}, Lcom/bytedance/sdk/openadsdk/utils/dj;->uef(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v8, 0x1

    .line 31
    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 32
    invoke-virtual {v3, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 34
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x11

    .line 35
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v11, 0x41800000    # 16.0f

    .line 36
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 37
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 38
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 39
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v12, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setGravity(I)V

    .line 40
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v12, v9}, Landroid/view/View;->setVisibility(I)V

    .line 41
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const-string v13, "#333333"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/high16 v13, 0x41a00000    # 20.0f

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 43
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-static {v8}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 44
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/4 v14, 0x0

    const v15, 0x3fa66666    # 1.3f

    invoke-virtual {v12, v14, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 45
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const v7, 0x3c75c28f    # 0.015f

    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 46
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 48
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 49
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 50
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 51
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/high16 v7, 0x41200000    # 10.0f

    .line 52
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 53
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    const/high16 v11, 0x43160000    # 150.0f

    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    invoke-virtual {v12, v7}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 54
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v11

    invoke-virtual {v7, v11}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 55
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v7, v9}, Landroid/view/View;->setVisibility(I)V

    .line 56
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 58
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 59
    invoke-direct {v0, v13}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 60
    invoke-direct {v0, v13}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    iput v7, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 61
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v7, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setGravity(I)V

    .line 62
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v7, v14, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 63
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const v11, 0x3b83126f    # 0.004f

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 64
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/high16 v11, 0x41700000    # 15.0f

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 65
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bs:I

    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    iget-object v7, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    new-instance v5, Landroid/view/View;

    invoke-direct {v5, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 68
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v11, 0x42000000    # 32.0f

    .line 69
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v11

    iput v11, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 70
    const-string v11, "#E4E4E4"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 71
    invoke-virtual {v5, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    new-instance v7, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    invoke-direct {v7, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;-><init>(Landroid/content/Context;)V

    .line 73
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    invoke-virtual {v7, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 75
    invoke-virtual {v7, v12}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    new-instance v12, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-direct {v12, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;-><init>(Landroid/content/Context;)V

    iput-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v13, 0x1f000016

    .line 77
    invoke-virtual {v12, v13}, Landroid/view/View;->setId(I)V

    .line 78
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v9, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v13, 0x41200000    # 10.0f

    .line 79
    invoke-direct {v0, v13}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v6

    iput v6, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    const/high16 v6, 0x3f800000    # 1.0f

    .line 80
    iput v6, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 81
    iget-object v13, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v6, 0x41800000    # 16.0f

    invoke-direct {v0, v6}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v4

    invoke-direct {v0, v6}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    invoke-virtual {v13, v9, v4, v9, v14}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setPadding(IIII)V

    .line 82
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setGravity(I)V

    .line 84
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 85
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/4 v13, 0x2

    iget v14, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->sy:F

    invoke-virtual {v4, v13, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 86
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/4 v13, 0x0

    invoke-virtual {v4, v13, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 87
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v13, 0x3af9096c    # 0.0019f

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 88
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-static {v9}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v14

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 89
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    iget v14, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bs:I

    invoke-static {v14}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v14

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 90
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v12}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    new-instance v4, Landroid/view/View;

    invoke-direct {v4, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    .line 92
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v4, v8, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 93
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v12, v11}, Landroid/view/View;->setBackgroundColor(I)V

    .line 94
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v11, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-direct {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;-><init>(Landroid/content/Context;)V

    iput-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v1, 0x1f000017

    .line 96
    invoke-virtual {v4, v1}, Landroid/view/View;->setId(I)V

    .line 97
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v1, v9, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x41200000    # 10.0f

    .line 98
    invoke-direct {v0, v4}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 99
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 100
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v11, 0x41800000    # 16.0f

    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v11

    invoke-virtual {v4, v9, v12, v9, v11}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setPadding(IIII)V

    .line 101
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 102
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setGravity(I)V

    .line 103
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 104
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    iget-object v8, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v9, 0x10301fb

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextAppearance(I)V

    const/16 v8, 0x1c

    if-lt v4, v8, :cond_0

    .line 106
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v4}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->h(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object v6

    :cond_0
    if-eqz v6, :cond_1

    .line 107
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 108
    :cond_1
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 109
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setLetterSpacing(F)V

    .line 110
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    iget v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oib:I

    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 111
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    iget v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->sy:F

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 112
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v2
.end method

.method private oa()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->zjm:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->zjm:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->cz:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->cz:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dj:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dj:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    const-string v4, "tt_postive_txt"

    invoke-static {v3, v4}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->wrv:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->wrv:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    const-string v4, "tt_negtive_txt"

    invoke-static {v3, v4}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :goto_2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->cq:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    .line 14
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    :goto_3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->wk:Z

    if-eqz v0, :cond_5

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 20
    :cond_5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private uef(F)I
    .locals 1

    .line 90
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p1

    return p1
.end method

.method private uef(Landroid/content/Context;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 3
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;

    invoke-direct {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;-><init>(Landroid/content/Context;)V

    .line 4
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    new-instance v3, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    invoke-direct {v3, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;-><init>(Landroid/content/Context;)V

    .line 7
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v4, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xd

    .line 8
    invoke-virtual {v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/high16 v7, 0x43820000    # 260.0f

    .line 9
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setMinimumWidth(I)V

    const/high16 v7, 0x42000000    # 32.0f

    .line 10
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v8

    const/4 v9, 0x0

    invoke-virtual {v3, v9, v8, v9, v9}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setPadding(IIII)V

    .line 11
    const-string v8, "tt_custom_dialog_bg"

    invoke-static {v1, v8}, Lcom/bytedance/sdk/openadsdk/utils/dj;->uef(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v3, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v8, 0x1

    .line 12
    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 13
    invoke-virtual {v3, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 15
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x11

    .line 16
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v11, 0x41800000    # 16.0f

    .line 17
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 18
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 19
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 20
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v12, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setGravity(I)V

    .line 21
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v12, v9}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const-string v13, "#333333"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 23
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/high16 v13, 0x41900000    # 18.0f

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 24
    iget-object v12, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v12, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 26
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 27
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 28
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 29
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    iput v12, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/high16 v12, 0x41200000    # 10.0f

    .line 30
    invoke-direct {v0, v12}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    iput v14, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 31
    iget-object v14, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    const/high16 v15, 0x43160000    # 150.0f

    invoke-direct {v0, v15}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v11

    invoke-virtual {v14, v11}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 32
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-direct {v0, v15}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    invoke-virtual {v11, v14}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 33
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v11, v9}, Landroid/view/View;->setVisibility(I)V

    .line 34
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v11, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 35
    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-direct {v5, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 36
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v11, 0x41a00000    # 20.0f

    .line 37
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    iput v14, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 38
    invoke-direct {v0, v11}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v11

    iput v11, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 39
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v11, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setGravity(I)V

    .line 40
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const/high16 v14, 0x40400000    # 3.0f

    invoke-direct {v0, v14}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    int-to-float v14, v14

    const v15, 0x3f99999a    # 1.2f

    invoke-virtual {v11, v14, v15}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 41
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextSize(F)V

    .line 42
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    const-string v13, "#000000"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    iget-object v11, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v11, v5}, Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    new-instance v5, Landroid/view/View;

    invoke-direct {v5, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 46
    invoke-direct {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    iput v7, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 47
    const-string v7, "#E4E4E4"

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v5, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 48
    invoke-virtual {v5, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    new-instance v11, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;

    invoke-direct {v11, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;-><init>(Landroid/content/Context;)V

    .line 50
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v13, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 51
    invoke-virtual {v11, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 52
    invoke-virtual {v11, v13}, Lcom/bytedance/sdk/openadsdk/core/ivm/lw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    new-instance v13, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-direct {v13, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;-><init>(Landroid/content/Context;)V

    iput-object v13, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v14, 0x1f000016

    .line 54
    invoke-virtual {v13, v14}, Landroid/view/View;->setId(I)V

    .line 55
    new-instance v13, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v13, v9, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    invoke-direct {v0, v12}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v14

    iput v14, v13, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    const/high16 v14, 0x3f800000    # 1.0f

    .line 57
    iput v14, v13, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 58
    iget-object v15, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v14, 0x41800000    # 16.0f

    invoke-direct {v0, v14}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v12

    invoke-direct {v0, v14}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v6

    invoke-virtual {v15, v9, v12, v9, v6}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setPadding(IIII)V

    .line 59
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/4 v12, 0x0

    invoke-virtual {v6, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 60
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v6, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setGravity(I)V

    .line 61
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 62
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const-string v14, "#999999"

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v14, 0x41800000    # 16.0f

    invoke-virtual {v6, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 64
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v6, v13}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    new-instance v6, Landroid/view/View;

    invoke-direct {v6, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v6, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    .line 66
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v6, v8, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 67
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v4, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 68
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    new-instance v4, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-direct {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;-><init>(Landroid/content/Context;)V

    iput-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const v1, 0x1f000017

    .line 70
    invoke-virtual {v4, v1}, Landroid/view/View;->setId(I)V

    .line 71
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    invoke-direct {v1, v9, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x41200000    # 10.0f

    .line 72
    invoke-direct {v0, v4}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v4

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    const/high16 v4, 0x3f800000    # 1.0f

    .line 73
    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 74
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v14, 0x41800000    # 16.0f

    invoke-direct {v0, v14}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v6

    invoke-direct {v0, v14}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(F)I

    move-result v7

    invoke-virtual {v4, v9, v6, v9, v7}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setPadding(IIII)V

    .line 75
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 76
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v10}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setGravity(I)V

    .line 77
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 78
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const-string v6, "#38ADFF"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 79
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    const/high16 v14, 0x41800000    # 16.0f

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 80
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/ivm/uef;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 82
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 83
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 84
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 85
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    invoke-virtual {v3, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 88
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->xs:Landroid/view/View;

    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 89
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v2
.end method

.method private uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/widget/oa$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/widget/oa;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/uef;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/widget/oa$2;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/widget/oa;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private yo()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dz:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/rt;->uef()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-string v0, "CustomCommonDialog"

    const-string v1, "isAtLeastT unregisterOnBackInvokedCallback"

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {p0}, LG6/T;->m(Lcom/bytedance/sdk/openadsdk/core/widget/oa;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dz:Landroid/window/OnBackInvokedCallback;

    invoke-static {v0, v1}, Lea/T;->w(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->wrv:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->zjm:Ljava/lang/String;

    return-object p0
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    const-string v0, "CustomCommonDialog"

    .line 2
    .line 3
    const-string v1, "onBackPressed"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->ku()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->ab:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/16 p1, 0xa6

    .line 18
    .line 19
    invoke-static {p1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bs:I

    .line 24
    .line 25
    const/high16 p1, 0x41800000    # 16.0f

    .line 26
    .line 27
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->sy:F

    .line 28
    .line 29
    const-string p1, "#000000"

    .line 30
    .line 31
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oib:I

    .line 36
    .line 37
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bcc:Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa(Landroid/content/Context;)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->bcc:Landroid/content/Context;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(Landroid/content/Context;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/rt;->uef()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    const-string p1, "CustomCommonDialog"

    .line 63
    .line 64
    const-string v1, "isAtLeastT registerOnBackInvokedCallback"

    .line 65
    .line 66
    invoke-static {p1, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/widget/oa$uef;

    .line 70
    .line 71
    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa$uef;-><init>(Lcom/bytedance/sdk/openadsdk/core/widget/oa;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dz:Landroid/window/OnBackInvokedCallback;

    .line 75
    .line 76
    invoke-static {p0}, LG6/T;->m(Lcom/bytedance/sdk/openadsdk/core/widget/oa;)Landroid/window/OnBackInvokedDispatcher;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dz:Landroid/window/OnBackInvokedCallback;

    .line 81
    .line 82
    invoke-static {p1, v1}, LG6/T;->w(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa()V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public show()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->oa()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/widget/oa$oa;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/oa$oa;

    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->cz:Ljava/lang/String;

    return-object p0
.end method

.method public yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->dj:Ljava/lang/String;

    return-object p0
.end method
