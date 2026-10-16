.class public Lcom/bytedance/sdk/openadsdk/core/model/xs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private moa:I

.field private oa:I

.field private uef:I

.field private yo:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->uef:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->oa:I

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->moa:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->uef:I

    return v0
.end method

.method public oa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->uef:I

    return-void
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->moa:I

    return v0
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->moa:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->yo:J

    return-void
.end method

.method public yo()J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->yo:J

    return-wide v0
.end method

.method public yo(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/xs;->oa:I

    return-void
.end method
