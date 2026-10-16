.class public Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/uef/oa/oa/oa;


# instance fields
.field private oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

.field private uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

.field private yo:Lcom/bytedance/adsdk/uef/oa/oa/uef;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public oa()Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->yo:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public oa(Lcom/bytedance/adsdk/uef/oa/oa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->oa()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public uef()Lcom/bytedance/adsdk/uef/oa/moa/lw;
    .locals 1

    .line 5
    sget-object v0, Lcom/bytedance/adsdk/uef/oa/moa/ivm;->uef:Lcom/bytedance/adsdk/uef/oa/moa/ivm;

    return-object v0
.end method

.method public uef(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v0, p1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->uef(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v0, p1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->uef(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->yo:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v0, p1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->uef(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public uef(Lcom/bytedance/adsdk/uef/oa/oa/uef;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    return-void
.end method

.method public yo(Lcom/bytedance/adsdk/uef/oa/oa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/oib;->yo:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    .line 2
    .line 3
    return-void
.end method
