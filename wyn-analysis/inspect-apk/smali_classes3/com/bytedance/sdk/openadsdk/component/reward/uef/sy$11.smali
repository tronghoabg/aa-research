.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/moa/wrv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->xs(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->bcc(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cz(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->zjm(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 38
    .line 39
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cz(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    sub-int v4, v0, v4

    .line 44
    .line 45
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$11;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 46
    .line 47
    const-string v6, "landingpage_endcard"

    .line 48
    .line 49
    move v7, p1

    .line 50
    invoke-static/range {v1 .. v7}, Lcom/bytedance/sdk/openadsdk/moa/yo$uef;->uef(IIIILcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method
