.class public abstract Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/uef/oa/oa/uef;


# instance fields
.field protected oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

.field protected uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

.field protected yo:Lcom/bytedance/adsdk/uef/oa/moa/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/uef/oa/moa/yo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->yo:Lcom/bytedance/adsdk/uef/oa/moa/yo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    invoke-interface {v1}, Lcom/bytedance/adsdk/uef/oa/oa/uef;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->yo:Lcom/bytedance/adsdk/uef/oa/moa/yo;

    invoke-virtual {v1}, Lcom/bytedance/adsdk/uef/oa/moa/yo;->uef()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

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
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->oa:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->oa()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public uef()Lcom/bytedance/adsdk/uef/oa/moa/lw;
    .locals 1

    .line 2
    sget-object v0, Lcom/bytedance/adsdk/uef/oa/moa/ivm;->uef:Lcom/bytedance/adsdk/uef/oa/moa/ivm;

    return-object v0
.end method

.method public uef(Lcom/bytedance/adsdk/uef/oa/oa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/oa/uef/bs;->uef:Lcom/bytedance/adsdk/uef/oa/oa/uef;

    return-void
.end method
