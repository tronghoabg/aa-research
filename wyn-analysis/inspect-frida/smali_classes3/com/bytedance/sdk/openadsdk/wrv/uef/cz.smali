.class public Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;
.super Lcom/bytedance/sdk/component/uef/moa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/component/uef/moa<",
        "Lorg/json/JSONObject;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private oa:Ljava/lang/String;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/oyt;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/moa;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 2

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;

    const-string v1, "endcardDynamicCreatives"

    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;

    const-string v1, "multiOpenCovert"

    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;

    const-string v1, "skipToNextAd"

    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;

    const-string v1, "speedVideoOrTimer"

    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;

    const-string v1, "openPlayable"

    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    return-void
.end method


# virtual methods
.method public bridge synthetic uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p2, Lorg/json/JSONObject;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 7
    const-string p1, "endcardDynamicCreatives"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->cz(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    const-string p1, "multiOpenCovert"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->zjm(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 11
    :cond_1
    const-string p1, "skipToNextAd"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_2
    const-string p1, "speedVideoOrTimer"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->bcc(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 15
    :cond_3
    const-string p1, "openPlayable"

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->oa:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/cz;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->xs(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
