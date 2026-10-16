.class public Lcom/bytedance/sdk/openadsdk/dz/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ivm:I

.field private lw:Ljava/lang/String;

.field private moa:Ljava/lang/String;

.field private oa:Ljava/lang/String;

.field private uef:Ljava/lang/String;

.field private xs:I

.field private yo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->oa:Ljava/lang/String;

    return-object v0
.end method

.method public lw(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->oa:Ljava/lang/String;

    return-void
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public moa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->uef:Ljava/lang/String;

    return-void
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->xs:I

    return v0
.end method

.method public oa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->xs:I

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->moa:Ljava/lang/String;

    return-void
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "8.0.0.5"

    return-object v0
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->ivm:I

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->lw:Ljava/lang/String;

    return-void
.end method

.method public xs()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->lw:Ljava/lang/String;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;->yo:Ljava/lang/String;

    return-void
.end method
