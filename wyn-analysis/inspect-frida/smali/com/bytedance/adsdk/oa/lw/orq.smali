.class public Lcom/bytedance/adsdk/oa/lw/orq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/yo/lw;
    .locals 41
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 6
    const-string v2, "ty"

    const-string v3, "nm"

    sget-object v6, Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;->uef:Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;

    .line 7
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    const-string v8, "UNSET"

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    .line 10
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const-wide/16 v16, -0x1

    const/high16 v18, 0x3f800000    # 1.0f

    .line 11
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    move-object/from16 v22, v6

    move-object/from16 v20, v9

    move-object/from16 v23, v20

    move-object/from16 v25, v23

    move-object/from16 v26, v25

    move/from16 v24, v14

    move/from16 v29, v24

    move/from16 v32, v29

    move/from16 v33, v32

    move/from16 v34, v33

    move/from16 v35, v34

    move-object v6, v15

    move-wide/from16 v27, v16

    move/from16 v15, v18

    move-object/from16 v21, v19

    const/4 v14, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v36, 0x0

    move-object/from16 v16, v26

    move-object/from16 v19, v16

    move-wide/from16 v17, v11

    move-object/from16 v11, v19

    move-object v12, v11

    .line 12
    :goto_0
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v37

    if-eqz v37, :cond_29

    .line 13
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v38, -0x1

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v39

    sparse-switch v39, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "masksProperties"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v38, 0x16

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "refId"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v38, 0x15

    goto/16 :goto_1

    :sswitch_2
    const-string v4, "ind"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v38, 0x14

    goto/16 :goto_1

    :sswitch_3
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v38, 0x13

    goto/16 :goto_1

    :sswitch_4
    const-string v4, "tt"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v38, 0x12

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "tm"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v38, 0x11

    goto/16 :goto_1

    :sswitch_6
    const-string v4, "sw"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v38, 0x10

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "st"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v38, 0xf

    goto/16 :goto_1

    :sswitch_8
    const-string v4, "sr"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v38, 0xe

    goto/16 :goto_1

    :sswitch_9
    const-string v4, "sh"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v38, 0xd

    goto/16 :goto_1

    :sswitch_a
    const-string v4, "sc"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v38, 0xc

    goto/16 :goto_1

    :sswitch_b
    const-string v4, "op"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v38, 0xb

    goto/16 :goto_1

    :sswitch_c
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v38, 0xa

    goto/16 :goto_1

    :sswitch_d
    const-string v4, "ks"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v38, 0x9

    goto/16 :goto_1

    :sswitch_e
    const-string v4, "ip"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v38, 0x8

    goto/16 :goto_1

    :sswitch_f
    const-string v4, "hd"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_1

    :cond_f
    const/16 v38, 0x7

    goto :goto_1

    :sswitch_10
    const-string v4, "ef"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_1

    :cond_10
    const/16 v38, 0x6

    goto :goto_1

    :sswitch_11
    const-string v4, "cl"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_1

    :cond_11
    const/16 v38, 0x5

    goto :goto_1

    :sswitch_12
    const-string v4, "w"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_1

    :cond_12
    const/16 v38, 0x4

    goto :goto_1

    :sswitch_13
    const-string v4, "t"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_1

    :cond_13
    const/16 v38, 0x3

    goto :goto_1

    :sswitch_14
    const-string v4, "h"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_1

    :cond_14
    const/16 v38, 0x2

    goto :goto_1

    :sswitch_15
    const-string v4, "shapes"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_1

    :cond_15
    const/16 v38, 0x1

    goto :goto_1

    :sswitch_16
    const-string v4, "parent"

    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_1

    :cond_16
    const/16 v38, 0x0

    :goto_1
    packed-switch v38, :pswitch_data_0

    .line 14
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    :goto_2
    move-object/from16 v38, v6

    :goto_3
    move/from16 v40, v14

    goto/16 :goto_9

    .line 15
    :pswitch_0
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 16
    :goto_4
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    .line 17
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/gsd;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/oa/bcc;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 18
    :cond_17
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(I)V

    .line 19
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    goto :goto_2

    .line 20
    :pswitch_1
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_0

    .line 21
    :pswitch_2
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v4

    move-object/from16 v38, v6

    int-to-long v5, v4

    move-wide/from16 v17, v5

    :cond_18
    :goto_5
    move-object/from16 v6, v38

    goto/16 :goto_0

    :pswitch_3
    move-object/from16 v38, v6

    .line 22
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v4

    .line 23
    sget-object v11, Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;->xs:Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-ge v4, v5, :cond_18

    .line 24
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;->values()[Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;

    move-result-object v5

    aget-object v11, v5, v4

    goto :goto_5

    :pswitch_4
    move-object/from16 v38, v6

    .line 25
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v4

    .line 26
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;->values()[Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;

    move-result-object v5

    array-length v5, v5

    if-lt v4, v5, :cond_19

    .line 27
    const-string v5, "Unsupported matte type: "

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Ljava/lang/String;)V

    goto :goto_3

    .line 28
    :cond_19
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;->values()[Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;

    move-result-object v5

    aget-object v22, v5, v4

    .line 29
    sget-object v4, Lcom/bytedance/adsdk/oa/lw/orq$1;->uef:[I

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v13, 0x1

    if-eq v4, v13, :cond_1b

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1a

    goto :goto_6

    .line 30
    :cond_1a
    const-string v4, "Unsupported matte type: Luma Inverted"

    invoke-virtual {v1, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Ljava/lang/String;)V

    goto :goto_6

    :cond_1b
    const/4 v5, 0x2

    .line 31
    const-string v4, "Unsupported matte type: Luma"

    invoke-virtual {v1, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Ljava/lang/String;)V

    .line 32
    :goto_6
    invoke-virtual {v1, v13}, Lcom/bytedance/adsdk/oa/xs;->uef(I)V

    goto :goto_5

    :pswitch_5
    move-object/from16 v38, v6

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v13, 0x1

    .line 33
    invoke-static {v0, v1, v4}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;Z)Lcom/bytedance/adsdk/oa/yo/uef/oa;

    move-result-object v23

    goto/16 :goto_0

    :pswitch_6
    move-object/from16 v38, v6

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v13, 0x1

    .line 34
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v6

    int-to-float v6, v6

    invoke-static {}, Lcom/bytedance/adsdk/oa/ivm/ivm;->uef()F

    move-result v30

    mul-float v6, v6, v30

    float-to-int v6, v6

    move/from16 v30, v6

    goto :goto_5

    :pswitch_7
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 35
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v35, v4

    goto/16 :goto_0

    :pswitch_8
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 36
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    double-to-float v15, v4

    goto/16 :goto_0

    :pswitch_9
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 37
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Lcom/bytedance/adsdk/oa/ivm/ivm;->uef()F

    move-result v5

    mul-float/2addr v5, v4

    float-to-int v4, v5

    move/from16 v31, v4

    goto/16 :goto_0

    :pswitch_a
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 38
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 39
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v29, v4

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 40
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_d
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 41
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/yo;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/wrv;

    move-result-object v16

    goto/16 :goto_0

    :pswitch_e
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 42
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v24, v4

    goto/16 :goto_0

    :pswitch_f
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 43
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextBoolean()Z

    move-result v36

    goto/16 :goto_0

    :pswitch_10
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 44
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 45
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 46
    :goto_7
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    .line 47
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    .line 48
    :cond_1c
    :goto_8
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    .line 49
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    .line 50
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    goto :goto_8

    .line 51
    :cond_1d
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v5

    const/16 v6, 0x1d

    if-ne v5, v6, :cond_1e

    .line 52
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/lw;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/oa/uef;

    move-result-object v25

    goto :goto_8

    :cond_1e
    const/16 v6, 0x19

    if-ne v5, v6, :cond_1c

    .line 53
    new-instance v5, Lcom/bytedance/adsdk/oa/lw/dj;

    invoke-direct {v5}, Lcom/bytedance/adsdk/oa/lw/dj;-><init>()V

    invoke-virtual {v5, v0, v1}, Lcom/bytedance/adsdk/oa/lw/dj;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/lw/zjm;

    move-result-object v26

    goto :goto_8

    .line 54
    :cond_1f
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v5

    .line 55
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 56
    :cond_20
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    goto :goto_7

    .line 57
    :cond_21
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    .line 58
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Ljava/lang/String;)V

    goto/16 :goto_5

    :pswitch_11
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 59
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_0

    :pswitch_12
    move-object/from16 v38, v6

    const/4 v13, 0x1

    .line 60
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    invoke-static {}, Lcom/bytedance/adsdk/oa/ivm/ivm;->uef()F

    move-result v6

    move/from16 v40, v14

    float-to-double v13, v6

    mul-double/2addr v4, v13

    double-to-float v4, v4

    move/from16 v33, v4

    :goto_9
    move-object/from16 v6, v38

    move/from16 v14, v40

    goto/16 :goto_0

    :pswitch_13
    move-object/from16 v38, v6

    move/from16 v40, v14

    .line 61
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    .line 62
    :goto_a
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    .line 63
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "a"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    const-string v5, "d"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_22

    .line 64
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    goto :goto_a

    .line 65
    :cond_22
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->ivm(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/zjm;

    move-result-object v19

    goto :goto_a

    .line 66
    :cond_23
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 67
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_24

    .line 68
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/oa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/dj;

    move-result-object v20

    .line 69
    :cond_24
    :goto_b
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    .line 70
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    goto :goto_b

    .line 71
    :cond_25
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    goto :goto_a

    .line 72
    :cond_26
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    goto :goto_9

    :pswitch_14
    move-object/from16 v38, v6

    move/from16 v40, v14

    .line 73
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v4

    invoke-static {}, Lcom/bytedance/adsdk/oa/ivm/ivm;->uef()F

    move-result v6

    float-to-double v13, v6

    mul-double/2addr v4, v13

    double-to-float v4, v4

    move/from16 v34, v4

    goto :goto_9

    :pswitch_15
    move-object/from16 v38, v6

    move/from16 v40, v14

    .line 74
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 75
    :cond_27
    :goto_c
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_28

    .line 76
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/bcc;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/oa/yo;

    move-result-object v4

    if-eqz v4, :cond_27

    .line 77
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 78
    :cond_28
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    goto :goto_9

    :pswitch_16
    move-object/from16 v38, v6

    move/from16 v40, v14

    .line 79
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v4

    int-to-long v4, v4

    move-wide/from16 v27, v4

    goto/16 :goto_0

    :cond_29
    move-object/from16 v38, v6

    move/from16 v40, v14

    .line 80
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    .line 81
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    cmpl-float v0, v24, v32

    if-lez v0, :cond_2a

    .line 82
    new-instance v0, Lcom/bytedance/adsdk/oa/xs/uef;

    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, v38

    move-object/from16 v2, v38

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 83
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    cmpl-float v0, v29, v32

    if-lez v0, :cond_2b

    goto :goto_d

    .line 84
    :cond_2b
    invoke-virtual/range {p1 .. p1}, Lcom/bytedance/adsdk/oa/xs;->xs()F

    move-result v29

    .line 85
    :goto_d
    new-instance v0, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 86
    invoke-static/range {v29 .. v29}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v4, 0x0

    move-object/from16 v3, v21

    move-object/from16 v1, p1

    move-object/from16 v2, v21

    move/from16 v5, v24

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 87
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v0, Lcom/bytedance/adsdk/oa/xs/uef;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 89
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v3, v38

    move-object/from16 v1, p1

    move/from16 v5, v29

    move-object/from16 v2, v38

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 90
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    const-string v0, ".ai"

    invoke-virtual {v8, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2c

    const-string v0, "ai"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 92
    :cond_2c
    const-string v0, "Convert your Illustrator layers to shape layers."

    invoke-virtual {v1, v0}, Lcom/bytedance/adsdk/oa/xs;->uef(Ljava/lang/String;)V

    .line 93
    :cond_2d
    new-instance v0, Lcom/bytedance/adsdk/oa/yo/yo/lw;

    move-object v2, v1

    move-object v1, v7

    move-object v3, v8

    move-object v6, v11

    move-object v9, v12

    move-object/from16 v21, v13

    move-object/from16 v11, v16

    move-wide/from16 v4, v17

    move-wide/from16 v7, v27

    move/from16 v12, v30

    move/from16 v13, v31

    move/from16 v17, v33

    move/from16 v18, v34

    move/from16 v16, v35

    move/from16 v24, v36

    move/from16 v14, v40

    invoke-direct/range {v0 .. v26}, Lcom/bytedance/adsdk/oa/yo/yo/lw;-><init>(Ljava/util/List;Lcom/bytedance/adsdk/oa/xs;Ljava/lang/String;JLcom/bytedance/adsdk/oa/yo/yo/lw$uef;JLjava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/uef/wrv;IIIFFFFLcom/bytedance/adsdk/oa/yo/uef/zjm;Lcom/bytedance/adsdk/oa/yo/uef/dj;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;Lcom/bytedance/adsdk/oa/yo/uef/oa;ZLcom/bytedance/adsdk/oa/yo/oa/uef;Lcom/bytedance/adsdk/oa/lw/zjm;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x3b54f756 -> :sswitch_16
        -0x35db5b0e -> :sswitch_15
        0x68 -> :sswitch_14
        0x74 -> :sswitch_13
        0x77 -> :sswitch_12
        0xc69 -> :sswitch_11
        0xca1 -> :sswitch_10
        0xcfc -> :sswitch_f
        0xd27 -> :sswitch_e
        0xd68 -> :sswitch_d
        0xdbf -> :sswitch_c
        0xde1 -> :sswitch_b
        0xe50 -> :sswitch_a
        0xe55 -> :sswitch_9
        0xe5f -> :sswitch_8
        0xe61 -> :sswitch_7
        0xe64 -> :sswitch_6
        0xe79 -> :sswitch_5
        0xe80 -> :sswitch_4
        0xe85 -> :sswitch_3
        0x197df -> :sswitch_2
        0x675e90e -> :sswitch_1
        0x55ed639a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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

.method public static uef(Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/yo/lw;
    .locals 28

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/bytedance/adsdk/oa/xs;->moa()Landroid/graphics/Rect;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/bytedance/adsdk/oa/yo/yo/lw;

    .line 3
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;->uef:Lcom/bytedance/adsdk/oa/yo/yo/lw$uef;

    .line 4
    new-instance v12, Lcom/bytedance/adsdk/oa/yo/uef/wrv;

    invoke-direct {v12}, Lcom/bytedance/adsdk/oa/yo/uef/wrv;-><init>()V

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    sget-object v23, Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;->uef:Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-string v4, "__container"

    const-wide/16 v5, -0x1

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v11, v2

    move-object/from16 v22, v2

    move/from16 v19, v0

    move/from16 v18, v3

    move-object/from16 v3, p0

    invoke-direct/range {v1 .. v27}, Lcom/bytedance/adsdk/oa/yo/yo/lw;-><init>(Ljava/util/List;Lcom/bytedance/adsdk/oa/xs;Ljava/lang/String;JLcom/bytedance/adsdk/oa/yo/yo/lw$uef;JLjava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/uef/wrv;IIIFFFFLcom/bytedance/adsdk/oa/yo/uef/zjm;Lcom/bytedance/adsdk/oa/yo/uef/dj;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/yo/lw$oa;Lcom/bytedance/adsdk/oa/yo/uef/oa;ZLcom/bytedance/adsdk/oa/yo/oa/uef;Lcom/bytedance/adsdk/oa/lw/zjm;)V

    return-object v1
.end method
