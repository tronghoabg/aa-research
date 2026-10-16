.class public Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:Lorg/json/JSONObject;

.field private ivm:Lorg/json/JSONObject;

.field private lw:I

.field private moa:I

.field private oa:I

.field private uef:I

.field private xs:Lorg/json/JSONObject;

.field private yo:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bcc()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->bcc:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->ivm:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->lw:I

    return v0
.end method

.method public lw(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->lw:I

    return-void
.end method

.method public moa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->moa:I

    return v0
.end method

.method public moa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->moa:I

    return-void
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->oa:I

    return v0
.end method

.method public oa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->oa:I

    return-void
.end method

.method public oa(Lorg/json/JSONObject;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->xs:Lorg/json/JSONObject;

    return-void
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->uef:I

    return v0
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->uef:I

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->ivm:Lorg/json/JSONObject;

    return-void
.end method

.method public xs()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->xs:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->yo:I

    return v0
.end method

.method public yo(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->yo:I

    return-void
.end method

.method public yo(Lorg/json/JSONObject;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->bcc:Lorg/json/JSONObject;

    return-void
.end method
