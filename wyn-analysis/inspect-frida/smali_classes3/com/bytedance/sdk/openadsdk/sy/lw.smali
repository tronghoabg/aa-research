.class Lcom/bytedance/sdk/openadsdk/sy/lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/sy/moa;


# instance fields
.field private moa:I

.field private oa:I

.field private uef:Lcom/bytedance/sdk/openadsdk/sy/moa;

.field private yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/sy/moa;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->uef:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 5
    .line 6
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->oa:I

    .line 7
    .line 8
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->yo:I

    .line 9
    .line 10
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->moa:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/sy/oa/uef;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->uef:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/moa;->uef()Lcom/bytedance/sdk/openadsdk/sy/oa/uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "8.0.0.5"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->oa:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->yo:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->oa(I)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/sy/lw;->moa:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->yo(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm;->xs()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->ivm(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->moa()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->moa(I)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
