.class Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

.field final synthetic uef:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->uef:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    :try_start_0
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->oa(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->oa()V

    .line 5
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    const-string p2, "cypher"

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p2

    .line 7
    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-static {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    return-void

    .line 11
    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Lorg/json/JSONObject;)Z

    move-result p1

    .line 13
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 14
    :catchall_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    .line 16
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    if-eqz p1, :cond_2

    .line 17
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Ljava/lang/String;)V

    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->uef:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v2

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v0, "register_status"

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 7

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    .line 20
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$3;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    if-eqz p1, :cond_1

    .line 21
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gzw;->uef(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm()Ljava/lang/String;

    move-result-object v2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "register_status"

    const/4 v3, -0x1

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    return-void
.end method
