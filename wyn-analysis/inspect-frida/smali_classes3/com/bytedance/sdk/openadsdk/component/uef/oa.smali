.class public Lcom/bytedance/sdk/openadsdk/component/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;Lcom/bytedance/sdk/openadsdk/component/cz/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/cz;
    .locals 6

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/uef/oa$2;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v3, "open_ad"

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    move-object v2, p0

    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/uef/oa$2;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/component/bcc/uef;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p3}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0, v2, v0}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/yo/oa;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;)Lcom/bytedance/sdk/openadsdk/component/uef/uef;
    .locals 6

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/uef/uef;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "open_ad"

    const/4 v4, 0x4

    move-object v2, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/component/bcc/uef;)V

    const p0, 0x1020002

    .line 2
    invoke-virtual {p1, p0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v2, v0}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/yo/oa;)V

    .line 4
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-object v0
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/component/bcc/uef;Lcom/bytedance/sdk/openadsdk/component/cz/oa;)Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;
    .locals 6

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/uef/oa$1;

    const-string v3, "open_ad"

    const/4 v4, 0x4

    move-object v2, p0

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/uef/oa$1;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/component/bcc/uef;)V

    .line 6
    invoke-virtual {v0, p3}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v2, v0}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/yo/oa;)V

    .line 8
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/component/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-object v0
.end method

.method private static uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/yo/oa;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 15
    const-string p1, "open_ad"

    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object p0

    .line 16
    invoke-virtual {p2, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    :cond_0
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 3

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zou()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "click_area"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "video_normal_ad"

    goto :goto_0

    :cond_0
    const-string v1, "image_normal_ad"

    :goto_0
    const-string v2, "openad_creative_type"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "click_scence"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Ljava/util/Map;)V

    return-void
.end method
