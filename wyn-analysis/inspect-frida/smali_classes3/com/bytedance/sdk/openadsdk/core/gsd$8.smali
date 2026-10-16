.class Lcom/bytedance/sdk/openadsdk/core/gsd$8;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Ljava/util/List;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/gsd;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/gsd;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->yo:Lcom/bytedance/sdk/openadsdk/core/gsd;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->oa:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 7

    if-eqz p2, :cond_7

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    const-string p2, "cypher"

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p2

    .line 4
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 7
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, v0

    .line 8
    :catchall_0
    :cond_0
    :try_start_2
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/gsd$oa;

    move-result-object p1

    .line 9
    iget p2, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->uef:I

    const/16 v0, 0x4e20

    if-eq p2, v0, :cond_1

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/gzw$oa;->uef(ILjava/lang/String;)V

    goto/16 :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    .line 11
    :cond_1
    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/gsd$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/lz;

    if-nez p2, :cond_2

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->yo:Lcom/bytedance/sdk/openadsdk/core/gsd;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/openadsdk/core/gsd;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;)V

    goto :goto_2

    .line 13
    :cond_2
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-interface {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/gzw$oa;->uef(Lcom/bytedance/sdk/openadsdk/core/gsd$oa;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 14
    :goto_0
    const-string p2, "NetApiImpl"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->yo:Lcom/bytedance/sdk/openadsdk/core/gsd;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/openadsdk/core/gsd;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;)V

    .line 16
    :goto_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result p1

    if-nez p1, :cond_6

    .line 17
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/gsd$8$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/gsd$8$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/gsd$8;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->oa(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    return-void

    :cond_3
    const/4 v0, -0x2

    .line 18
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v3

    .line 20
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 21
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v0

    :cond_4
    move-object v4, v0

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-interface {v0, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/gzw$oa;->uef(ILjava/lang/String;)V

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result v0

    if-nez v0, :cond_5

    .line 24
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/gsd$8$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/gsd$8$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/gsd$8;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 25
    :cond_5
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result p2

    if-nez p2, :cond_6

    .line 26
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->oa:Ljava/util/List;

    const-string v1, "reward"

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :cond_6
    :goto_2
    return-void

    .line 27
    :cond_7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result p2

    if-nez p2, :cond_8

    .line 28
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/gsd$8$3;

    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/core/gsd$8$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/gsd$8;)V

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 29
    :cond_8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->oa:Ljava/util/List;

    const-string v0, "reward"

    const/4 v2, -0x1

    const-string v3, "response is null"

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 30
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->yo:Lcom/bytedance/sdk/openadsdk/core/gsd;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/openadsdk/core/gsd;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 6

    if-eqz p2, :cond_0

    .line 31
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    :goto_0
    move-object v3, p2

    goto :goto_1

    .line 32
    :cond_0
    const-string p2, ""

    goto :goto_0

    .line 33
    :goto_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->uef:Lcom/bytedance/sdk/openadsdk/core/gzw$oa;

    const/4 v0, -0x2

    invoke-interface {p2, v0, v3}, Lcom/bytedance/sdk/openadsdk/core/gzw$oa;->uef(ILjava/lang/String;)V

    if-eqz p1, :cond_1

    .line 34
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/gsd$8;->oa:Ljava/util/List;

    const-string v0, "reward"

    const/4 v2, -0x1

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 37
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    move-result p1

    if-nez p1, :cond_2

    .line 38
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/gsd$8$4;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/gsd$8$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/gsd$8;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    :cond_2
    return-void
.end method
