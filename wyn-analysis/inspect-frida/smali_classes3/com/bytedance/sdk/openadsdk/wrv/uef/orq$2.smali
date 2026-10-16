.class Lcom/bytedance/sdk/openadsdk/wrv/uef/orq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;->uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;->uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq$2;->uef:Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;->uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
