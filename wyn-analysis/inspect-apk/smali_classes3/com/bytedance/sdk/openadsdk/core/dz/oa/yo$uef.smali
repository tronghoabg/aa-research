.class public Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

.field private final uef:Ljava/lang/String;

.field private yo:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->yo:Z

    .line 10
    .line 11
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public uef(Z)Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->yo:Z

    return-object p0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;
    .locals 4

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->uef:Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$uef;->yo:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;Ljava/lang/Boolean;)V

    return-object v0
.end method
