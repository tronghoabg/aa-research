.class public Lcom/bytedance/sdk/openadsdk/ab/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:I

.field private cz:I

.field private ivm:Ljava/lang/String;

.field private lw:Z

.field private moa:I

.field private oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private uef:Ljava/lang/String;

.field private xs:I

.field private yo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->bcc:I

    .line 6
    .line 7
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->cz:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bcc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->bcc:I

    .line 2
    .line 3
    return v0
.end method

.method public cz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->cz:I

    .line 2
    .line 3
    return v0
.end method

.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->moa:I

    .line 2
    .line 3
    return v0
.end method

.method public oa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object v0
.end method

.method public oa(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->xs:I

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo:Ljava/lang/String;

    return-void
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public uef(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->moa:I

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef:Ljava/lang/String;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->lw:Z

    return-void
.end method

.method public xs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->xs:I

    .line 2
    .line 3
    return v0
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo:Ljava/lang/String;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->yo:Ljava/lang/String;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->ivm:Ljava/lang/String;

    return-void
.end method
