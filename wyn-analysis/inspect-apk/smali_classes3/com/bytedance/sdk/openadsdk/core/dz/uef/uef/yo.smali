.class public Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static oa(Lorg/xmlpull/v1/XmlPullParser;)D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    const-string v0, "Duration"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, ":"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v0, p0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    aget-object v0, p0, v0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    mul-int/lit16 v0, v0, 0xe10

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    aget-object v1, p0, v1

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    mul-int/lit8 v1, v1, 0x3c

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    int-to-float v0, v1

    .line 45
    const/4 v1, 0x2

    .line 46
    aget-object p0, p0, v1

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 53
    .line 54
    .line 55
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    add-float/2addr v0, p0

    .line 57
    float-to-double v0, v0

    .line 58
    return-wide v0

    .line 59
    :catch_0
    :cond_0
    const-wide/16 v0, 0x0

    .line 60
    .line 61
    return-wide v0
.end method

.method public static uef(Lorg/xmlpull/v1/XmlPullParser;)Lcom/bytedance/sdk/openadsdk/core/dz/oa;
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 28
    const-string v1, "HTMLResource"

    const-string v2, "IconClicks"

    const-string v3, "StaticResource"

    const-string v4, "IFrameResource"

    const-string v5, "IconViewTracking"

    const/4 v6, 0x2

    const/4 v7, 0x3

    const/4 v9, 0x0

    .line 29
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v10

    const-string v11, "Icons"

    if-ne v10, v7, :cond_1

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    goto :goto_1

    :cond_0
    return-object v9

    .line 30
    :cond_1
    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 31
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v10

    if-ne v10, v6, :cond_18

    .line 32
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v12, "Icon"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    .line 33
    sget-object v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    const-string v13, "width"

    invoke-interface {v0, v10, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    move-result v15

    .line 34
    const-string v13, "height"

    invoke-interface {v0, v10, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    move-result v13

    if-lez v15, :cond_2

    const/16 v14, 0x12c

    if-gt v15, v14, :cond_2

    if-lez v13, :cond_2

    if-le v13, v14, :cond_3

    :cond_2
    move-object/from16 v18, v1

    goto/16 :goto_e

    .line 35
    :cond_3
    const-string v14, "offset"

    invoke-interface {v0, v10, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;->uef(Ljava/lang/String;)I

    move-result v14

    .line 36
    const-string v8, "duration"

    invoke-interface {v0, v10, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;->uef(Ljava/lang/String;)I

    move-result v8

    .line 37
    new-instance v24, Ljava/util/ArrayList;

    invoke-direct/range {v24 .. v24}, Ljava/util/ArrayList;-><init>()V

    .line 38
    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    const/16 v26, 0x0

    .line 39
    :goto_2
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    if-ne v6, v7, :cond_4

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    move/from16 v16, v13

    move-object/from16 v6, v24

    move-object/from16 v7, v25

    goto :goto_4

    :cond_5
    if-eqz v10, :cond_7

    if-eqz v9, :cond_6

    .line 40
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->lw()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 41
    :cond_6
    new-instance v6, Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    move/from16 v16, v13

    int-to-long v12, v14

    int-to-long v8, v8

    iget-object v14, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    iget-object v7, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    iget-object v10, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef:Ljava/lang/String;

    move-object/from16 v22, v7

    move-wide/from16 v19, v8

    move-object/from16 v23, v10

    move-wide/from16 v17, v12

    move-object/from16 v21, v14

    move-object v14, v6

    invoke-direct/range {v14 .. v26}, Lcom/bytedance/sdk/openadsdk/core/dz/oa;-><init>(IIJJLcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    const/4 v6, 0x3

    .line 42
    invoke-static {v0, v11, v6}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)V

    move-object v9, v14

    :cond_7
    :goto_3
    const/4 v6, 0x2

    const/4 v7, 0x3

    goto/16 :goto_0

    .line 43
    :goto_4
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v13

    move/from16 v17, v8

    const/4 v8, 0x2

    if-ne v13, v8, :cond_17

    .line 44
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, -0x1

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v18

    sparse-switch v18, :sswitch_data_0

    goto :goto_6

    :sswitch_0
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    const/4 v8, 0x4

    goto :goto_5

    :sswitch_1
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    const/4 v13, 0x3

    goto :goto_6

    :sswitch_2
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    const/4 v13, 0x2

    goto :goto_6

    :sswitch_3
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_6

    :cond_b
    const/4 v8, 0x1

    goto :goto_5

    :sswitch_4
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_6

    :cond_c
    const/4 v8, 0x0

    :goto_5
    move v13, v8

    :goto_6
    packed-switch v13, :pswitch_data_0

    :cond_d
    move-object/from16 v18, v1

    goto/16 :goto_d

    :pswitch_0
    if-eqz v10, :cond_e

    .line 45
    iget-object v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    if-ne v8, v13, :cond_d

    .line 46
    :cond_e
    new-instance v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    move-object/from16 v18, v1

    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    invoke-direct {v10, v8, v13, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    :cond_f
    :goto_7
    move-object/from16 v24, v6

    move-object/from16 v25, v7

    :goto_8
    move/from16 v13, v16

    move/from16 v8, v17

    move-object/from16 v1, v18

    const/4 v7, 0x3

    goto/16 :goto_2

    :pswitch_1
    move-object/from16 v18, v1

    .line 47
    :cond_10
    :goto_9
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v8, 0x3

    if-ne v1, v8, :cond_11

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    .line 48
    :cond_11
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    const/4 v13, 0x2

    if-ne v1, v13, :cond_10

    .line 49
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v8, "IconClickThrough"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 50
    invoke-static {v0, v8}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    goto :goto_9

    .line 51
    :cond_12
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v8, "IconClickTracking"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 52
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;

    invoke-static {v0, v8}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :pswitch_2
    move-object/from16 v18, v1

    const/4 v13, 0x2

    .line 53
    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 54
    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    const-string v8, "creativeType"

    invoke-interface {v0, v1, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 55
    sget-object v8, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->uef:Ljava/util/Set;

    invoke-interface {v8, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    sget-object v10, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->oa:Ljava/util/Set;

    invoke-interface {v10, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_13

    goto :goto_a

    :cond_13
    const/4 v10, 0x0

    goto :goto_b

    .line 56
    :cond_14
    :goto_a
    invoke-static {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 57
    :goto_b
    invoke-interface {v8, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 58
    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    goto :goto_c

    .line 59
    :cond_15
    sget-object v1, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 60
    :goto_c
    new-instance v8, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;

    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    invoke-direct {v8, v10, v1, v13}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object v10, v8

    goto/16 :goto_8

    :pswitch_3
    move-object/from16 v18, v1

    if-nez v10, :cond_16

    .line 61
    new-instance v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;

    invoke-static {v0, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v8, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    invoke-direct {v10, v1, v8, v13}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    goto/16 :goto_7

    .line 62
    :cond_16
    :goto_d
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 v18, v1

    .line 63
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;

    invoke-static {v0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v1, v8}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_17
    move-object/from16 v18, v1

    goto/16 :goto_7

    .line 64
    :goto_e
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_f

    :cond_18
    move-object/from16 v18, v1

    :goto_f
    move-object/from16 v1, v18

    goto/16 :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3e3dd04b -> :sswitch_4
        -0x165f3d2e -> :sswitch_3
        0x285474bc -> :sswitch_2
        0x3d6ff1e4 -> :sswitch_1
        0x72ef4cd9 -> :sswitch_0
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

.method private static uef(Lorg/xmlpull/v1/XmlPullParser;IDLcom/bytedance/sdk/openadsdk/core/dz/uef;)Ljava/lang/String;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    const-wide/high16 v2, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    const/4 v4, 0x0

    const/high16 v5, -0x80000000

    move v6, v5

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    const/4 v8, 0x3

    if-ne v7, v8, :cond_3

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "MediaFiles"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    .line 15
    :cond_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 16
    invoke-virtual {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->moa(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(I)V

    .line 18
    invoke-virtual {v1, v6}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa(I)V

    :cond_2
    return-object v4

    .line 19
    :cond_3
    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_0

    .line 20
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "MediaFile"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 21
    sget-object v7, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    const-string v9, "type"

    invoke-interface {v0, v7, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 22
    const-string v10, "width"

    invoke-interface {v0, v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    move-result v13

    .line 23
    const-string v10, "height"

    invoke-interface {v0, v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    move-result v14

    .line 24
    const-string v10, "bitrate"

    invoke-interface {v0, v7, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    move-result v15

    .line 25
    invoke-static {v0, v8}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-lez v13, :cond_0

    if-lez v14, :cond_0

    .line 26
    sget-object v8, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef:Ljava/util/List;

    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    move/from16 v10, p1

    move-wide/from16 v11, p2

    move-object/from16 v16, v9

    .line 27
    invoke-static/range {v10 .. v16}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(IDIIILjava/lang/String;)D

    move-result-wide v8

    cmpl-double v10, v8, v2

    if-lez v10, :cond_0

    move-object v4, v7

    move-wide v2, v8

    move v5, v13

    move v6, v14

    goto/16 :goto_0
.end method

.method private static uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 93
    const-string v0, "Tracking"

    invoke-static {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/moa;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x3

    .line 65
    :cond_0
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    if-ne v4, v3, :cond_2

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "TrackingEvents"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    return-void

    .line 66
    :cond_2
    :goto_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    if-ne v4, v2, :cond_0

    .line 67
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Tracking"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 68
    sget-object v4, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    const-string v6, "event"

    invoke-interface {p0, v4, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 70
    invoke-static {p0, v5, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)V

    goto :goto_0

    .line 71
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v7, "creativeView"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const/16 v6, 0xb

    goto/16 :goto_2

    :sswitch_1
    const-string v7, "firstQuartile"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_2

    :cond_5
    const/16 v6, 0xa

    goto/16 :goto_2

    :sswitch_2
    const-string v7, "start"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_2

    :cond_6
    const/16 v6, 0x9

    goto/16 :goto_2

    :sswitch_3
    const-string v7, "pause"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_2

    :cond_7
    const/16 v6, 0x8

    goto/16 :goto_2

    :sswitch_4
    const-string v7, "close"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    const/4 v6, 0x7

    goto :goto_2

    :sswitch_5
    const-string v7, "skip"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_2

    :cond_9
    const/4 v6, 0x6

    goto :goto_2

    :sswitch_6
    const-string v7, "mute"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    const/4 v6, 0x5

    goto :goto_2

    :sswitch_7
    const-string v7, "complete"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_2

    :cond_b
    move v6, v0

    goto :goto_2

    :sswitch_8
    const-string v7, "unmute"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_2

    :cond_c
    move v6, v3

    goto :goto_2

    :sswitch_9
    const-string v7, "resume"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_2

    :cond_d
    move v6, v2

    goto :goto_2

    :sswitch_a
    const-string v7, "thirdQuartile"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_2

    :cond_e
    move v6, v1

    goto :goto_2

    :sswitch_b
    const-string v7, "midpoint"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_2

    :cond_f
    const/4 v6, 0x0

    :goto_2
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_0

    .line 72
    :pswitch_0
    invoke-static {p0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x3e800000    # 0.25f

    invoke-virtual {p1, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;F)V

    goto/16 :goto_0

    .line 73
    :pswitch_1
    invoke-static {p0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-virtual {p1, v4, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;J)V

    goto/16 :goto_0

    .line 74
    :pswitch_2
    invoke-static {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa(Ljava/util/List;)V

    goto/16 :goto_0

    .line 75
    :pswitch_3
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->yo(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(Ljava/util/List;)V

    goto/16 :goto_0

    .line 76
    :pswitch_4
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->yo(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(Ljava/util/List;)V

    goto/16 :goto_0

    .line 77
    :pswitch_5
    invoke-static {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj(Ljava/util/List;)V

    goto/16 :goto_0

    .line 78
    :pswitch_6
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->yo(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa(Ljava/util/List;)V

    goto/16 :goto_0

    .line 79
    :pswitch_7
    invoke-static {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv(Ljava/util/List;)V

    goto/16 :goto_0

    .line 80
    :pswitch_8
    invoke-static {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo(Ljava/util/List;)V

    goto/16 :goto_0

    .line 81
    :pswitch_9
    invoke-static {p0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x3f400000    # 0.75f

    invoke-virtual {p1, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;F)V

    goto/16 :goto_0

    .line 82
    :pswitch_a
    invoke-static {p0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {p1, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;F)V

    goto/16 :goto_0

    .line 83
    :cond_10
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v4

    if-ne v4, v0, :cond_11

    .line 84
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    goto/16 :goto_0

    .line 85
    :cond_11
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x61aea3b8 -> :sswitch_b
        -0x4fbdabf6 -> :sswitch_a
        -0x37b237d3 -> :sswitch_9
        -0x321793ce -> :sswitch_8
        -0x23bacec7 -> :sswitch_7
        0x335219 -> :sswitch_6
        0x35e57f -> :sswitch_5
        0x5a5ddf8 -> :sswitch_4
        0x65825f6 -> :sswitch_3
        0x68ac462 -> :sswitch_2
        0x21644853 -> :sswitch_1
        0x69fcaef4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_1
    .end packed-switch
.end method

.method private static uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 86
    const-string v0, "ClickTracking"

    const-string v1, "ClickThrough"

    :cond_0
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_2

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "VideoClicks"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    return-void

    .line 87
    :cond_2
    :goto_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 88
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 90
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v2

    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs(Ljava/util/List;)V

    goto :goto_0

    .line 92
    :cond_4
    invoke-static {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;ID)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x0

    move v4, v3

    .line 1
    :cond_0
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    if-ne v5, v2, :cond_2

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Linear"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    return-void

    .line 2
    :cond_2
    :goto_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    if-ne v5, v1, :cond_0

    if-eqz v4, :cond_3

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 4
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 5
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v7, "TrackingEvents"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    const/4 v6, 0x4

    goto :goto_2

    :sswitch_1
    const-string v7, "Icons"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    move v6, v2

    goto :goto_2

    :sswitch_2
    const-string v7, "MediaFiles"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    move v6, v1

    goto :goto_2

    :sswitch_3
    const-string v7, "Duration"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_2

    :cond_7
    move v6, v0

    goto :goto_2

    :sswitch_4
    const-string v7, "VideoClicks"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_2

    :cond_8
    move v6, v3

    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 6
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 7
    :pswitch_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v5

    invoke-static {p0, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/moa;)V

    goto :goto_0

    .line 8
    :pswitch_1
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;)Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    move-result-object v6

    if-nez v6, :cond_0

    .line 10
    invoke-virtual {p1, v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/oa;)V

    goto/16 :goto_0

    .line 11
    :pswitch_2
    invoke-static {p0, p2, p3, p4, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;IDLcom/bytedance/sdk/openadsdk/core/dz/uef;)Ljava/lang/String;

    move v4, v0

    goto/16 :goto_0

    .line 12
    :pswitch_3
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->oa(Lorg/xmlpull/v1/XmlPullParser;)D

    move-result-wide v5

    invoke-virtual {p1, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(D)V

    goto/16 :goto_0

    .line 13
    :pswitch_4
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a2ef3da -> :sswitch_4
        -0x72e14e4c -> :sswitch_3
        -0x16f37aed -> :sswitch_2
        0x43362fa -> :sswitch_1
        0x247392d0 -> :sswitch_0
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

.method private static yo(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xmlpull/v1/XmlPullParser;",
            ")",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Z)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
