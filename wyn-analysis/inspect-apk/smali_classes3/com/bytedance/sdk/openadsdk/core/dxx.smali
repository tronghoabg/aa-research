.class public Lcom/bytedance/sdk/openadsdk/core/dxx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final oa:Lcom/bytedance/sdk/openadsdk/core/moa;

.field private static final uef:Lcom/bytedance/sdk/openadsdk/core/fz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/lz;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/lz;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/dxx;->uef:Lcom/bytedance/sdk/openadsdk/core/fz;

    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/moa;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/dxx;->oa:Lcom/bytedance/sdk/openadsdk/core/moa;

    .line 14
    .line 15
    return-void
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/core/fz;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dxx;->oa:Lcom/bytedance/sdk/openadsdk/core/moa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa;->uef()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dxx;->uef:Lcom/bytedance/sdk/openadsdk/core/fz;

    .line 11
    .line 12
    return-object v0
.end method
