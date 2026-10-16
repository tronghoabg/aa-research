.class Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;->uef(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/cq/ivm;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;

.field final synthetic lw:Ljava/util/List;

.field final synthetic moa:Ljava/lang/String;

.field final synthetic oa:Ljava/lang/Boolean;

.field final synthetic uef:Ljava/lang/String;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/cq/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bytedance/sdk/openadsdk/cq/ivm;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->ivm:Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->uef:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->oa:Ljava/lang/Boolean;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->yo:Lcom/bytedance/sdk/openadsdk/cq/ivm;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->moa:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->lw:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->ivm:Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->uef:Ljava/lang/String;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->oa:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->yo:Lcom/bytedance/sdk/openadsdk/cq/ivm;

    invoke-static {p1, p2, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;->uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;Lcom/bytedance/sdk/component/xs/oa;Ljava/lang/String;Ljava/lang/Boolean;Lcom/bytedance/sdk/openadsdk/cq/ivm;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 9

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->ivm:Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->uef:Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->yo:Lcom/bytedance/sdk/openadsdk/cq/ivm;

    invoke-static {p1, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;->uef(Lcom/bytedance/sdk/openadsdk/wrv/uef/dz;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/cq/ivm;)V

    .line 3
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->moa:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->uef:Ljava/lang/String;

    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/dz$5;->lw:Ljava/util/List;

    const-string v3, "jsb_request"

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->oa(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
