.class Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wrv$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/wrv$1;

.field final synthetic moa:Z

.field final synthetic oa:Ljava/util/List;

.field final synthetic uef:Ljava/lang/String;

.field final synthetic yo:Lcom/bytedance/sdk/component/xs/oa/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/component/xs/oa/moa;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->lw:Lcom/bytedance/sdk/openadsdk/core/wrv$1;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->oa:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->yo:Lcom/bytedance/sdk/component/xs/oa/moa;

    .line 8
    .line 9
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->moa:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->moa()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->oa:Ljava/util/List;

    invoke-static {p2, v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/wrv;->uef(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/util/List;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v0

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v2, p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(ILjava/lang/String;ILjava/lang/String;)V

    .line 4
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result v5

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->oa()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->yo:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->oa:Ljava/util/List;

    const-string v3, "ipv6"

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 5
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->moa:Z

    if-nez p1, :cond_1

    .line 6
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 7
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wrv;->uef()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 9

    if-eqz p2, :cond_0

    .line 8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v2, p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(ILjava/lang/String;ILjava/lang/String;)V

    .line 9
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->uef:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->yo:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->oa:Ljava/util/List;

    const-string v3, "ipv6"

    const/4 v5, -0x1

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 10
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;->moa:Z

    if-nez p1, :cond_0

    .line 11
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4$2;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 12
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wrv;->uef()V

    return-void
.end method
