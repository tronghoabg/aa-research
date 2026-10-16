.class Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

.field final synthetic lw:Ljava/lang/String;

.field final synthetic moa:Ljava/lang/String;

.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->oa:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->moa:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->lw:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 4

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result p1

    const/4 v0, 0x3

    const-string v1, "net"

    if-eqz p1, :cond_2

    .line 2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz p1, :cond_3

    .line 5
    const-string p2, "net data is null"

    invoke-interface {p1, v0, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    invoke-direct {p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;-><init>()V

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->oa:Ljava/lang/String;

    .line 7
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->yo:Ljava/lang/String;

    .line 8
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->moa:Ljava/lang/String;

    .line 9
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->lw:Ljava/lang/String;

    .line 10
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    .line 11
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;->uef(Ljava/lang/Long;)Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;

    move-result-object p2

    .line 13
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/yo;->uef()Lcom/bytedance/sdk/openadsdk/core/cq/uef/yo;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef/uef;)V

    .line 14
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;)V

    .line 15
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz p2, :cond_3

    .line 16
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    invoke-interface {v0, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(Lorg/json/JSONObject;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 18
    :catch_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "parse json exception data is"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-interface {p2, v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz p1, :cond_3

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "net code error code is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " message is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 2

    .line 21
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$3;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz p1, :cond_0

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "net error "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "net"

    const/4 v1, 0x3

    invoke-interface {p1, v1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
