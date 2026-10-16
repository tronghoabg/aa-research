.class public Lcom/bytedance/adsdk/ugeno/uef/uef/yo;
.super Lcom/bytedance/adsdk/ugeno/uef/uef/uef;
.source "SourceFile"


# instance fields
.field private bcc:Landroid/graphics/Paint;

.field private cz:Landroid/graphics/PorterDuffXfermode;

.field private dj:Landroid/graphics/Matrix;

.field private ivm:Landroid/view/View;

.field private lw:F

.field private moa:F

.field private xs:Landroid/graphics/Paint;

.field private yo:Ljava/lang/String;

.field private zjm:Landroid/graphics/LinearGradient;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;-><init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Lorg/json/JSONObject;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->ivm:Landroid/view/View;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->ivm:Landroid/view/View;

    .line 24
    .line 25
    const/4 p2, 0x2

    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    .line 31
    .line 32
    sget-object p2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 33
    .line 34
    invoke-direct {p1, p2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->cz:Landroid/graphics/PorterDuffXfermode;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    .line 52
    .line 53
    return-void
.end method

.method private yo(Landroid/graphics/Canvas;)V
    .locals 22

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_9

    .line 2
    iget v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v3

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 3
    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v4}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v4

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 4
    iget-object v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    iget-object v5, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->cz:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 5
    iget-object v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->yo:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v8, 0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "right"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :sswitch_1
    const-string v5, "left"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v8

    goto :goto_1

    :sswitch_2
    const-string v5, "top"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v7

    goto :goto_1

    :sswitch_3
    const-string v5, "bottom"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v4, -0x1

    :goto_1
    const v5, 0x3f666666    # 0.9f

    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v10, 0x437f0000    # 255.0f

    if-eqz v4, :cond_7

    if-eq v4, v8, :cond_5

    if-eq v4, v6, :cond_3

    if-eq v4, v7, :cond_1

    return-void

    .line 6
    :cond_1
    iget v14, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    int-to-float v3, v3

    sub-float v15, v0, v3

    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v11, p1

    move-object/from16 v16, v0

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 7
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    iget v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    sub-float/2addr v4, v3

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 8
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 9
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 10
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v0

    cmpg-float v0, v0, v9

    if-gtz v0, :cond_2

    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_2

    .line 11
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    mul-float/2addr v2, v10

    sub-float/2addr v10, v2

    float-to-int v2, v10

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 12
    :cond_2
    iget v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    sub-float v20, v2, v3

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    const/16 v19, 0x0

    move-object/from16 v16, p1

    move/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v21, v3

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    :cond_3
    int-to-float v0, v3

    .line 13
    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v6, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    const/16 v17, 0x0

    move-object/from16 v16, p1

    move/from16 v18, v0

    move/from16 v19, v3

    move/from16 v20, v4

    move-object/from16 v21, v6

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 14
    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    invoke-virtual {v3, v2, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 15
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 16
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 17
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpg-float v2, v2, v9

    if-gtz v2, :cond_4

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpl-float v2, v2, v5

    if-lez v2, :cond_4

    .line 18
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v3

    mul-float/2addr v3, v10

    sub-float/2addr v10, v3

    float-to-int v3, v10

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 19
    :cond_4
    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v20, v0

    move/from16 v19, v2

    move-object/from16 v21, v3

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 20
    :cond_5
    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    int-to-float v0, v0

    sub-float v19, v3, v0

    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v20, v3

    move-object/from16 v21, v4

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 21
    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    iget v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    sub-float/2addr v4, v0

    invoke-virtual {v3, v4, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 22
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 23
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 24
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpg-float v2, v2, v9

    if-gtz v2, :cond_6

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpl-float v2, v2, v5

    if-lez v2, :cond_6

    .line 25
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v3

    mul-float/2addr v3, v10

    sub-float/2addr v10, v3

    float-to-int v3, v10

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 26
    :cond_6
    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    sub-float v19, v2, v0

    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    const/16 v20, 0x0

    move-object/from16 v16, p1

    move-object/from16 v21, v0

    move/from16 v17, v2

    move/from16 v18, v3

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    :cond_7
    int-to-float v0, v0

    .line 27
    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v4, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v17, v0

    move/from16 v19, v2

    move/from16 v20, v3

    move-object/from16 v21, v4

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 28
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    iget v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    invoke-virtual {v2, v0, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 29
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->dj:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 30
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 31
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpg-float v2, v2, v9

    if-gtz v2, :cond_8

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v2

    cmpl-float v2, v2, v5

    if-lez v2, :cond_8

    .line 32
    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {v3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->etd()F

    move-result v3

    mul-float/2addr v3, v10

    sub-float/2addr v10, v3

    float-to-int v3, v10

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 33
    :cond_8
    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->bcc:Landroid/graphics/Paint;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v19, v0

    move/from16 v20, v2

    move-object/from16 v21, v3

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void

    .line 34
    :cond_9
    iget-object v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    iget-object v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->cz:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 35
    iget v0, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    iget v2, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    iget-object v3, v1, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->xs:Landroid/graphics/Paint;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, p1

    move/from16 v19, v0

    move/from16 v20, v2

    move-object/from16 v21, v3

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 36
    :goto_2
    const-string v2, "BaseEffectWrapper"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_3
        0x1c155 -> :sswitch_2
        0x32a007 -> :sswitch_1
        0x677c21c -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public oa()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/uef;->uef:Lorg/json/JSONObject;

    const-string v1, "direction"

    const-string v2, "left"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->yo:Ljava/lang/String;

    return-void
.end method

.method public oa(Landroid/graphics/Canvas;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->yo(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public uef(II)V
    .locals 11

    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    int-to-float p1, p2

    .line 3
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    .line 4
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->yo:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "right"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "left"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "top"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "bottom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    packed-switch p2, :pswitch_data_0

    return-void

    .line 5
    :pswitch_0
    new-instance v0, Landroid/graphics/LinearGradient;

    iget p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    neg-float v1, p1

    iget v4, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    const/4 v6, -0x1

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    return-void

    .line 6
    :pswitch_1
    new-instance v1, Landroid/graphics/LinearGradient;

    iget v2, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->moa:F

    const/4 v7, -0x1

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    return-void

    .line 7
    :pswitch_2
    new-instance v2, Landroid/graphics/LinearGradient;

    iget v4, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    const/4 v8, -0x1

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v2, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    return-void

    .line 8
    :pswitch_3
    new-instance v3, Landroid/graphics/LinearGradient;

    iget p1, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->lw:F

    neg-float v5, p1

    const/4 v9, -0x1

    sget-object v10, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v3, p0, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->zjm:Landroid/graphics/LinearGradient;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_3
        0x1c155 -> :sswitch_2
        0x32a007 -> :sswitch_1
        0x677c21c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public uef(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/uef/uef/yo;->yo(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public yo()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/animation/PropertyValuesHolder;",
            ">;"
        }
    .end annotation

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x2

    .line 38
    new-array v2, v1, [F

    fill-array-data v2, :array_0

    const-string v3, "rubIn"

    invoke-static {v3, v2}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v2, Lcom/bytedance/adsdk/ugeno/uef/lw;->zjm:Lcom/bytedance/adsdk/ugeno/uef/lw;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/uef/lw;->oa()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    invoke-static {v2, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
