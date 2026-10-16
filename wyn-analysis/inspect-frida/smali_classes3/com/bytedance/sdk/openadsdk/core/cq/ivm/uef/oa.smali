.class public abstract Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/oa$uef;
    }
.end annotation


# instance fields
.field protected uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract oa()Lorg/json/JSONObject;
.end method

.method public abstract uef()Ljava/lang/String;
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    return-void
.end method
