.class public Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static oa:Ljava/lang/String;

.field private static final uef:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "close-fill"

    .line 4
    .line 5
    const-string v2, "webview-close"

    .line 6
    .line 7
    const-string v3, "dislike"

    .line 8
    .line 9
    const-string v4, "close"

    .line 10
    .line 11
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef:Ljava/util/Set;

    .line 27
    .line 28
    return-void
.end method

.method public static oa(Ljava/lang/String;)D
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    const-string p0, "fontSize"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v0

    :catchall_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static oa()Z
    .locals 1

    .line 11
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static oa(Ljava/lang/String;FZ)[I
    .locals 3

    const/4 v0, 0x0

    .line 3
    :try_start_0
    new-instance v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 5
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    :cond_0
    const/4 p0, -0x2

    .line 8
    invoke-virtual {v1, p0, p0}, Landroid/view/View;->measure(II)V

    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    add-int/lit8 p0, p0, 0x2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    filled-new-array {p0, p1}, [I

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 10
    :catch_0
    filled-new-array {v0, v0}, [I

    move-result-object p0

    return-object p0
.end method

.method private static uef(Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;
    .locals 2

    .line 145
    const-string v0, "union"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 146
    iput v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 147
    iput v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object p0

    .line 148
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 150
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 151
    iput v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 152
    iput v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object p0

    .line 153
    :cond_2
    invoke-static {p3, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;
    .locals 1

    const/4 v0, 0x0

    .line 154
    invoke-static {p0, p1, v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;Z)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/bytedance/sdk/component/adexpress/dynamic/moa/bcc;DIDLjava/lang/String;Lcom/bytedance/sdk/component/adexpress/oa/cq;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p9

    .line 1
    const-string v5, "tt_reward_full_skip"

    const-string v7, "fontSize"

    const-string v8, "open_ad"

    const-string v9, "source"

    const-string v10, "text"

    invoke-virtual/range {p13 .. p13}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa()Ljava/lang/String;

    move-result-object v13

    .line 2
    invoke-virtual/range {p13 .. p13}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->xs()I

    move-result v14

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v15

    const/16 p12, 0x0

    const-string v11, "score-count-type-2"

    const-string v6, "score-count"

    const-string v12, "text_star"

    move/from16 v17, v14

    const/4 v14, 0x4

    move/from16 v18, v15

    const/4 v15, 0x0

    if-eqz v18, :cond_1

    if-eq v4, v14, :cond_1

    .line 4
    invoke-static {v1, v12}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_0

    .line 5
    invoke-static {v1, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_0

    const-string v14, "score-count-type-1"

    .line 6
    invoke-static {v1, v14}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_0

    .line 7
    invoke-static {v1, v11}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 8
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    invoke-direct {v0, v15, v15}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>(FF)V

    return-object v0

    .line 9
    :cond_1
    new-instance v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    invoke-direct {v14}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>()V

    .line 10
    const-string v15, "<svg"

    invoke-virtual {v0, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    move/from16 v19, v15

    if-nez v19, :cond_2

    sget-object v15, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef:Ljava/util/Set;

    invoke-interface {v15, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    :cond_2
    move-object v4, v14

    goto/16 :goto_c

    .line 11
    :cond_3
    const-string v15, "logo"

    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    move/from16 v20, v15

    const-string v15, ""

    if-eqz v20, :cond_d

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "adx:"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 13
    :cond_5
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 14
    sget-object v1, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa:Ljava/lang/String;

    invoke-static {v14, v0, v2, v1}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 15
    :cond_6
    invoke-static {v14, v0, v2, v15}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 16
    :cond_7
    const-string v3, "union"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x41600000    # 14.0f

    goto :goto_0

    :cond_8
    const/high16 v4, 0x41a00000    # 20.0f

    .line 17
    :goto_0
    iput v4, v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    const/high16 v4, 0x41200000    # 10.0f

    .line 18
    iput v4, v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    .line 19
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 20
    invoke-virtual/range {p13 .. p13}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->ue()Ljava/lang/String;

    move-result-object v4

    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    .line 22
    iput v3, v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 23
    :cond_9
    invoke-static {v1, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-static {v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa(Ljava/lang/String;)D

    move-result-wide v3

    double-to-float v1, v3

    .line 25
    const-string v3, "logoad"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 26
    invoke-virtual/range {p13 .. p13}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->pz()Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    .line 28
    iput v3, v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    goto :goto_1

    .line 29
    :cond_a
    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 30
    :cond_b
    :goto_1
    iput v1, v14, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object v14

    :cond_c
    move-object v4, v14

    goto/16 :goto_9

    :cond_d
    move-object/from16 v19, v15

    .line 31
    const-string v15, "development-name"

    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_e

    move-object/from16 v20, v5

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v3

    const-string v4, "tt_text_privacy_development"

    invoke-static {v3, v4}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_e
    move-object/from16 v20, v5

    .line 33
    :goto_2
    const-string v3, "app-version"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 34
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v5

    move-object/from16 v21, v14

    const-string v14, "tt_text_privacy_app_version"

    invoke-static {v5, v14}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_f
    move-object/from16 v21, v14

    .line 35
    :goto_3
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, ")"

    const-string v6, "("

    if-eqz v4, :cond_11

    .line 36
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move/from16 v0, p12

    .line 37
    :goto_4
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v1

    if-eqz v1, :cond_10

    if-gez v0, :cond_10

    .line 38
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>(FF)V

    return-object v0

    .line 39
    :cond_10
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v1

    const-string v3, "tt_comment_num"

    invoke-static {v1, v3}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p12

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 42
    :cond_11
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    .line 43
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move/from16 v0, p12

    .line 44
    :goto_5
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v1

    if-eqz v1, :cond_12

    if-gez v0, :cond_12

    .line 45
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>(FF)V

    return-object v0

    .line 46
    :cond_12
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v3, "###,###,###"

    invoke-direct {v1, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    int-to-long v3, v0

    .line 47
    invoke-virtual {v1, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, p12

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 49
    :cond_13
    const-string v4, "feedback-dislike"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 50
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v4

    if-eqz v4, :cond_14

    .line 51
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>()V

    .line 52
    invoke-static {v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa(Ljava/lang/String;)D

    move-result-wide v1

    double-to-float v1, v1

    .line 53
    iput v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 54
    iput v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object v0

    .line 55
    :cond_14
    const-string v4, "skip-with-time-countdown"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "00"

    if-nez v4, :cond_32

    const-string v4, "skip-with-countdowns-video-countdown"

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_15

    goto/16 :goto_b

    .line 56
    :cond_15
    const-string v4, "skip-with-countdowns-skip-btn"

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v6, "tt_reward_screen_skip_tx"

    const-string v11, "| "

    if-eqz v4, :cond_16

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v6}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 58
    :cond_16
    const-string v4, "skip-with-countdowns-skip-countdown"

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_17

    .line 59
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v0

    const-string v1, "tt_reward_full_skip_count_down"

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    .line 60
    new-array v1, v3, [Ljava/lang/Object;

    aput-object v5, v1, p12

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 62
    :cond_17
    const-string v4, "skip-with-time-skip-btn"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "lineHeight"

    const-wide v22, 0x3ff3333333333333L    # 1.2

    if-eqz v4, :cond_19

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v6}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    .line 64
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 65
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v1

    .line 66
    iget v3, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    float-to-double v3, v3

    mul-double/2addr v3, v1

    div-double v3, v3, v22

    double-to-float v1, v3

    iput v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    :catchall_0
    iget v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    iput v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    :cond_18
    return-object v0

    .line 68
    :cond_19
    const-string v4, "skip"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 69
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 70
    :cond_1a
    const-string v4, "timedown"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "0.0"

    if-eqz v4, :cond_1b

    .line 71
    invoke-static {v6, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 72
    :cond_1b
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-wide/high16 v11, 0x4014000000000000L    # 5.0

    const-wide/16 v24, 0x0

    if-eqz v4, :cond_1e

    .line 73
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v0

    if-eqz v0, :cond_1d

    cmpg-double v0, p10, v24

    if-ltz v0, :cond_1c

    cmpl-double v0, p10, v11

    if-lez v0, :cond_1d

    .line 74
    :cond_1c
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>(FF)V

    return-object v0

    .line 75
    :cond_1d
    invoke-static {v6, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 76
    :cond_1e
    const-string v4, "privacy-detail"

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1f

    .line 77
    const-string v0, "Permission list | Privacy policy"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 78
    :cond_1f
    const-string v4, "arrowButton"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    .line 79
    const-string v0, "Download"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 80
    :cond_20
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v6

    if-eqz v6, :cond_22

    .line 81
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_22

    .line 82
    invoke-virtual/range {p6 .. p6}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/bcc;->zjm()Lcom/bytedance/sdk/component/adexpress/dynamic/moa/lw;

    move-result-object v6

    invoke-virtual {v6}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/lw;->lw()Lcom/bytedance/sdk/component/adexpress/dynamic/moa/ivm;

    move-result-object v6

    if-eqz v6, :cond_22

    .line 83
    invoke-virtual {v6}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/ivm;->ot()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_21

    .line 84
    invoke-virtual/range {p6 .. p6}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/bcc;->zjm()Lcom/bytedance/sdk/component/adexpress/dynamic/moa/lw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/lw;->lw()Lcom/bytedance/sdk/component/adexpress/dynamic/moa/ivm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/ivm;->ot()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->yo(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v19, v0

    :cond_21
    move-object/from16 v0, v19

    .line 85
    :cond_22
    const-string v6, "fillButton"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    .line 86
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "button"

    .line 87
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "downloadWithIcon"

    .line 88
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "downloadButton"

    .line 89
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "laceButton"

    .line 90
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "cardButton"

    .line 91
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    const-string v6, "colourMixtureButton"

    .line 92
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_31

    .line 93
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_31

    .line 94
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v4

    if-eqz v4, :cond_31

    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    .line 95
    :cond_23
    invoke-static {v3, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_31

    .line 96
    invoke-static {v15, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_24

    goto/16 :goto_a

    .line 97
    :cond_24
    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    .line 99
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v6

    double-to-float v6, v6

    .line 100
    const-string v7, "letterSpacing"

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v14

    double-to-float v7, v14

    .line 101
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v14

    double-to-float v5, v14

    .line 102
    const-string v10, "maxWidth"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v14

    double-to-float v3, v14

    int-to-float v4, v4

    add-float v10, v6, v7

    mul-float/2addr v10, v4

    sub-float/2addr v10, v7

    .line 103
    const-string v4, "muted"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    if-eqz v4, :cond_25

    move-object/from16 v4, v21

    .line 104
    :try_start_4
    iput v6, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 105
    iput v6, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object v4

    :cond_25
    move-object/from16 v4, v21

    .line 106
    const-string v7, "star"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_28

    .line 107
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v0

    if-eqz v0, :cond_27

    cmpg-double v0, p10, v24

    if-ltz v0, :cond_26

    cmpl-double v0, p10, v11

    if-gtz v0, :cond_26

    move/from16 v0, p9

    const/4 v1, 0x4

    if-eq v0, v1, :cond_27

    .line 108
    :cond_26
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>(FF)V

    return-object v0

    .line 109
    :cond_27
    const-string v0, "str"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    mul-float/2addr v6, v1

    .line 110
    iput v6, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    return-object v0

    .line 111
    :cond_28
    const-string v7, "icon"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_29

    .line 112
    iput v6, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 113
    iput v6, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object v4

    :cond_29
    if-eqz p3, :cond_2b

    div-float v7, v10, v3

    float-to-int v7, v7

    const/16 v16, 0x1

    add-int/lit8 v7, v7, 0x1

    move/from16 v11, p5

    if-eqz p4, :cond_2a

    if-lt v7, v11, :cond_2a

    move v7, v11

    :cond_2a
    mul-float/2addr v5, v6

    int-to-float v6, v7

    mul-float/2addr v5, v6

    float-to-double v5, v5

    mul-double v5, v5, v22

    double-to-float v5, v5

    :goto_6
    move v6, v3

    goto :goto_7

    :cond_2b
    move/from16 v11, p5

    mul-float/2addr v5, v6

    float-to-double v5, v5

    mul-double v5, v5, v22

    double-to-float v5, v5

    cmpl-float v6, v10, v3

    if-lez v6, :cond_2c

    goto :goto_6

    :cond_2c
    move v6, v10

    .line 114
    :goto_7
    const-string v7, "title"

    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2d

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v7

    if-eqz v7, :cond_30

    .line 115
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_30

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    if-eqz v1, :cond_30

    :cond_2d
    const/16 v1, 0x20

    const/16 v7, 0xa

    .line 116
    :try_start_5
    invoke-virtual {v0, v7, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    move/from16 v1, p12

    invoke-static {v0, v2, v1}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;Z)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    if-eqz p3, :cond_2f

    div-float/2addr v10, v3

    float-to-int v1, v10

    const/16 v16, 0x1

    add-int/lit8 v1, v1, 0x1

    if-eqz p4, :cond_2e

    if-lt v1, v11, :cond_2e

    goto :goto_8

    :cond_2e
    move v11, v1

    .line 117
    :goto_8
    iget v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    int-to-float v2, v11

    mul-float/2addr v1, v2

    iput v1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :cond_2f
    return-object v0

    .line 118
    :catch_2
    :cond_30
    :try_start_6
    iput v6, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 119
    iput v5, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_9

    :catch_3
    move-object/from16 v4, v21

    :catch_4
    :goto_9
    return-object v4

    .line 120
    :cond_31
    :goto_a
    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 121
    :cond_32
    :goto_b
    invoke-virtual/range {p13 .. p13}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef()Z

    move-result v0

    if-eqz v0, :cond_36

    invoke-static {v13}, Lcom/bytedance/sdk/component/adexpress/moa/ivm;->oa(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_36

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double v0, p7, v0

    double-to-int v0, v0

    sub-int v0, v0, v17

    const/16 v7, 0xa

    if-ge v0, v7, :cond_34

    .line 122
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v0

    if-eqz v0, :cond_33

    .line 123
    const-string v0, "0s"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 124
    :cond_33
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v1, v3, [Ljava/lang/Object;

    const-string v3, "0"

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    :cond_34
    move-object/from16 v1, v20

    .line 125
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v0

    if-eqz v0, :cond_35

    .line 126
    const-string v0, "00s"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 127
    :cond_35
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v1, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    :cond_36
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpg-double v0, p7, v0

    if-gez v0, :cond_37

    .line 128
    const-string v0, "0S"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 129
    :cond_37
    const-string v0, "00S"

    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    move-result-object v0

    return-object v0

    .line 130
    :goto_c
    :try_start_7
    const-string v0, "close"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    move-result v0

    if-eqz v0, :cond_38

    const-string v0, "close-fill"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    goto :goto_d

    :catch_5
    :cond_38
    const/high16 v0, 0x41200000    # 10.0f

    goto :goto_e

    .line 131
    :cond_39
    :goto_d
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-float v0, v0

    .line 132
    iput v0, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 133
    iput v0, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    return-object v4

    .line 134
    :goto_e
    iput v0, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    .line 135
    iput v0, v4, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    return-object v4
.end method

.method public static uef(Ljava/lang/String;Ljava/lang/String;Z)Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;
    .locals 4

    .line 155
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;-><init>()V

    .line 156
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float p1, v2

    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->uef(Ljava/lang/String;FZ)[I

    move-result-object p0

    const/4 p1, 0x0

    .line 158
    aget p1, p0, p1

    int-to-float p1, p1

    iput p1, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->uef:F

    const/4 p1, 0x1

    .line 159
    aget p0, p0, p1

    int-to-float p0, p0

    iput p0, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F

    .line 160
    const-string p0, "lineHeight"

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v1, p0, p1, p2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide p0

    const-wide/16 v1, 0x0

    cmpl-double p0, p0, v1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 161
    iput p0, v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/oa$yo;->oa:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static uef()Ljava/lang/String;
    .locals 1

    .line 165
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa:Ljava/lang/String;

    return-object v0
.end method

.method public static uef(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 141
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    .line 142
    :cond_0
    const-string v0, "adx:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 143
    array-length v0, p0

    const/4 v2, 0x2

    if-ge v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 144
    aget-object p0, p0, v0

    return-object p0

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static uef(Ljava/lang/String;FZ)[I
    .locals 1

    .line 162
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/dj;->oa(Ljava/lang/String;FZ)[I

    move-result-object p0

    .line 163
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object p1

    const/4 p2, 0x0

    aget p2, p0, p2

    int-to-float p2, p2

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->oa(Landroid/content/Context;F)I

    move-result p1

    .line 164
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x1

    aget p0, p0, v0

    int-to-float p0, p0

    invoke-static {p2, p0}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->oa(Landroid/content/Context;F)I

    move-result p0

    filled-new-array {p1, p0}, [I

    move-result-object p0

    return-object p0
.end method
