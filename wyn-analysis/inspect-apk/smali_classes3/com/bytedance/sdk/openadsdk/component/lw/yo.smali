.class public Lcom/bytedance/sdk/openadsdk/component/lw/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ivm:Ljava/lang/String;

.field private lw:I

.field private moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field private oa:I

.field private uef:I

.field private xs:Z

.field private yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->uef:I

    .line 8
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->oa:I

    .line 9
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->lw:I

    .line 10
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->ivm:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->uef:I

    .line 3
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->oa:I

    .line 4
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    return-void
.end method


# virtual methods
.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->lw:I

    .line 2
    .line 3
    return v0
.end method

.method public moa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->uef:I

    .line 2
    .line 3
    return v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/model/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    return-object v0
.end method

.method public uef(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->xs:Z

    return-void
.end method

.method public yo()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/yo;->oa:I

    .line 2
    .line 3
    return v0
.end method
