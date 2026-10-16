.class public Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;ID)Lcom/bytedance/sdk/openadsdk/core/dz/uef;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;ID)",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    const-string v6, "Extensions"

    const-string v7, "AdVerifications"

    const/4 v8, 0x3

    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    const/4 v9, 0x2

    const-string v10, "InLine"

    invoke-interface {p1, v9, v0, v10}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    invoke-direct {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;-><init>()V

    .line 3
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-ne v0, v8, :cond_2

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm(Ljava/util/List;)V

    return-object v2

    .line 5
    :cond_2
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v9, :cond_0

    .line 6
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v4, "Impression"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v3, 0x6

    goto :goto_2

    :sswitch_1
    const-string v4, "AdTitle"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x5

    goto :goto_2

    :sswitch_2
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x4

    goto :goto_2

    :sswitch_3
    const-string v4, "Error"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_2

    :cond_6
    move v3, v8

    goto :goto_2

    :sswitch_4
    const-string v4, "Description"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    move v3, v9

    goto :goto_2

    :sswitch_5
    const-string v4, "Creatives"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    const/4 v3, 0x1

    goto :goto_2

    :sswitch_6
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_2

    :cond_9
    const/4 v3, 0x0

    :goto_2
    packed-switch v3, :pswitch_data_0

    goto :goto_4

    .line 8
    :pswitch_0
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v3

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/util/List;)V

    goto/16 :goto_0

    .line 9
    :pswitch_1
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 10
    :cond_a
    :goto_3
    :pswitch_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v8, :cond_b

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11
    :cond_b
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v9, :cond_a

    .line 13
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/moa;->uef(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Ljava/util/Set;)V

    goto :goto_3

    .line 16
    :pswitch_3
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    .line 17
    :pswitch_4
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 18
    :pswitch_5
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo()Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_5

    .line 19
    :cond_c
    :goto_4
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_0

    .line 20
    :cond_d
    :goto_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-eq v0, v8, :cond_0

    .line 21
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v9, :cond_d

    .line 22
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 23
    const-string v3, "Creative"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move-wide v4, p4

    .line 24
    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/oa;->uef(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;ID)V

    goto :goto_5

    .line 25
    :cond_e
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_5

    .line 26
    :pswitch_6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/moa;->uef(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Ljava/util/Set;)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bd325cb -> :sswitch_6
        -0x64e1597c -> :sswitch_5
        -0x360d424 -> :sswitch_4
        0x401e1e8 -> :sswitch_3
        0xaf84834 -> :sswitch_2
        0x1deadbd5 -> :sswitch_1
        0x7e026e29 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static uef(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;ID)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    .line 28
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 29
    const-string v0, "Linear"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->xs()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    invoke-static {p1, p2, p3, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/yo;->uef(Lorg/xmlpull/v1/XmlPullParser;Lcom/bytedance/sdk/openadsdk/core/dz/uef;ID)V

    goto :goto_0

    .line 31
    :cond_1
    const-string v0, "CompanionAds"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->yo()Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    move-result-object v0

    if-nez v0, :cond_2

    .line 32
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/uef;->uef(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/yo;)V

    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    :cond_3
    return-void
.end method
