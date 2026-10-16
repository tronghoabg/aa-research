.class public Lcom/bytedance/sdk/openadsdk/component/lw/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private uef:I

.field private final yo:Lcom/bytedance/sdk/openadsdk/core/model/uef;


# direct methods
.method public constructor <init>(ILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->uef:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public oa()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->uef:I

    .line 2
    .line 3
    return v0
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/core/model/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/lw/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 2
    .line 3
    return-object v0
.end method
