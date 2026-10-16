.class Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/settings/cz;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/settings/cz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v2

    .line 2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->nkh()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dxx;->uef()Lcom/bytedance/sdk/openadsdk/core/fz;

    move-result-object v1

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/core/fz;->moa()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 4
    const-string v1, "Pangle_Debug_Mode"

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v4

    invoke-static {v1, v0, v4}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 6
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    .line 7
    const-string p1, "cypher"

    const/4 v0, -0x1

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    .line 8
    const-string v0, "message"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v1, v0

    .line 12
    :catch_1
    :cond_1
    :try_start_2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->yo()Ljava/util/Map;

    move-result-object p2

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/settings/cz;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    :catchall_0
    :try_start_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->uef(Lorg/json/JSONObject;)Z

    .line 15
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef(J)V

    .line 16
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result p1

    if-nez p1, :cond_2

    .line 17
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->oa(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 18
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->oa()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 19
    :catchall_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/settings/cz;)Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;

    move-result-object p1

    invoke-interface {p1, v3}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;->uef(Z)V

    return-void

    :cond_3
    if-eqz p1, :cond_4

    .line 20
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Ljava/lang/String;)V

    .line 21
    :cond_4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result v0

    if-nez v0, :cond_5

    .line 22
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 23
    :cond_5
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v0

    if-nez v0, :cond_6

    .line 24
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "settings_fetch"

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 25
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/settings/cz;)Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;->uef(Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 7

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/settings/cz;)Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;->uef(Z)V

    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$3;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/settings/cz$3$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/cz$3;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    :cond_0
    if-eqz p1, :cond_2

    .line 29
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "settings_fetch"

    const/4 v3, -0x1

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method
