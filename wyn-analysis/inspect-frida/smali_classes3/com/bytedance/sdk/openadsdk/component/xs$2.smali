.class Lcom/bytedance/sdk/openadsdk/component/xs$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/component/xs;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/core/model/fz;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->uef(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    .line 12
    .line 13
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/xs$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/16 v5, 0x64

    .line 21
    .line 22
    invoke-direct {v1, v4, v5, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
