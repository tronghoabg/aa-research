.class public Lcom/bytedance/sdk/openadsdk/utils/gsd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 4
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(I)V

    const/4 p0, 0x0

    .line 6
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Z)V

    .line 7
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(I)V

    return-object v0
.end method

.method private static oa(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z
    .locals 2

    .line 8
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    instance-of p1, p0, Landroid/app/Activity;

    if-nez p1, :cond_0

    const/high16 p1, 0x10000000

    .line 12
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 13
    :cond_0
    new-instance p1, Lcom/bytedance/sdk/openadsdk/utils/gsd$1;

    invoke-direct {p1, p3, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd$1;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    invoke-static {p0, v0, p1, p4}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/content/Context;Landroid/content/Intent;Lcom/bytedance/sdk/component/utils/oa$oa;Z)Z

    move-result p0

    return p0

    :catchall_0
    move-exception p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x6

    .line 15
    invoke-static {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object p1

    .line 16
    invoke-virtual {p1, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo(Ljava/lang/String;)V

    const/4 p0, 0x2

    .line 17
    invoke-virtual {p1, p0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(I)V

    .line 18
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic uef(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object p0

    return-object p0
.end method

.method public static uef(Landroid/app/Activity;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 54
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)Z
    .locals 6

    .line 39
    instance-of p3, p0, Landroid/app/Activity;

    if-eqz p3, :cond_0

    .line 40
    move-object p3, p0

    check-cast p3, Landroid/app/Activity;

    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/app/Activity;)Z

    move-result p3

    if-nez p3, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/ab;->uef()Lcom/bytedance/sdk/openadsdk/core/ab;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/ab;->lw()Lcom/bytedance/sdk/openadsdk/utils/uef;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/utils/uef;->oa()Landroid/app/Activity;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 42
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p0, p3

    :cond_1
    :goto_0
    if-nez p0, :cond_2

    .line 43
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p0

    :cond_2
    move-object v0, p0

    const/4 p0, 0x0

    if-nez v0, :cond_3

    return p0

    .line 44
    :cond_3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_4

    return p0

    .line 45
    :cond_4
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 46
    new-instance p3, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {p3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p3, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 48
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 49
    const-string p0, "deeplink_url"

    invoke-virtual {v4, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p3, "jsb_deeplink"

    invoke-virtual {v4, p3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)I

    move-result v3

    const/4 v5, 0x1

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/uef;->uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILjava/util/Map;Z)Z

    move-result p0

    return p0
.end method

.method public static uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z
    .locals 6

    .line 2
    const-string v0, "OpenUtils"

    instance-of v1, p0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 3
    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/app/Activity;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/ab;->uef()Lcom/bytedance/sdk/openadsdk/core/ab;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/ab;->lw()Lcom/bytedance/sdk/openadsdk/utils/uef;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/utils/uef;->oa()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/app/Activity;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object p0, v1

    :cond_1
    :goto_0
    if-nez p0, :cond_2

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object p0

    :cond_2
    const/4 v1, 0x0

    if-nez p0, :cond_3

    return v1

    .line 7
    :cond_3
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/sy;->uef(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 p0, 0x5

    .line 9
    invoke-static {p3, p0, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object p0

    .line 10
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    return v1

    .line 11
    :cond_4
    invoke-static {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v2

    .line 12
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 13
    :try_start_0
    new-instance v3, Lp9/C;

    invoke-direct {v3}, Lp9/C;-><init>()V

    .line 14
    iget-object v4, v3, Lp9/C;->c:Ljava/lang/Object;

    check-cast v4, Landroid/content/Intent;

    const-string v5, "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"

    invoke-virtual {v4, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 v1, 0x2

    .line 15
    invoke-virtual {v3, v1}, Lp9/C;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    .line 16
    :try_start_1
    invoke-virtual {v3}, Lp9/C;->b()Lu/k;

    move-result-object v3

    .line 17
    instance-of v4, p0, Landroid/app/Activity;

    if-nez v4, :cond_5

    .line 18
    iget-object v4, v3, Lu/k;->a:Landroid/content/Intent;

    const/high16 v5, 0x10000000

    invoke-virtual {v4, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    .line 19
    :cond_5
    :goto_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-static {p0, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/uef/uef;->uef(Landroid/content/Context;Ljava/lang/String;Lu/k;Landroid/net/Uri;)V

    .line 20
    instance-of v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/TTBaseActivity;

    if-eqz v2, :cond_6

    .line 21
    move-object v2, p0

    check-cast v2, Lcom/bytedance/sdk/openadsdk/activity/single/TTBaseActivity;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTBaseActivity;->yo(Z)V

    :cond_6
    const/16 v2, 0x64

    .line 22
    invoke-static {p3, v2, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object v2

    .line 23
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Z)V

    const/16 v3, 0x8

    .line 24
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(I)V

    .line 25
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v1

    .line 26
    :goto_2
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-static {v0, v2}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xd

    .line 28
    invoke-static {p3, v3, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object v3

    .line 29
    invoke-virtual {v3, v2}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo(Ljava/lang/String;)V

    .line 30
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    .line 31
    invoke-static {p0, p1, p2, p3, v1}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return v1

    :catchall_1
    move-exception v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xc

    .line 34
    invoke-static {p3, v0, p2}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Ljava/lang/String;ILcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    move-result-object v0

    .line 35
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo(Ljava/lang/String;)V

    .line 36
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    .line 37
    invoke-static {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z

    move-result p0

    return p0

    .line 38
    :cond_7
    invoke-static {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->oa(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static uef(Ljava/lang/String;)Z
    .locals 0

    .line 52
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
