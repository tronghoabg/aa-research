.class Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->oa(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

.field final synthetic oa:J

.field final synthetic uef:J

.field final synthetic yo:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;JJI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->uef:J

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->oa:J

    .line 6
    .line 7
    iput p6, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->yo:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->uxr(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->uef:J

    .line 8
    .line 9
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->oa:J

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(JJ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->efa(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->yo:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->uef(I)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->xw(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;)Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->az(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;)Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->uef:J

    .line 40
    .line 41
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->oa:J

    .line 42
    .line 43
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;->uef(JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;

    .line 51
    .line 52
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;->kik(Lcom/bytedance/sdk/openadsdk/core/wk/moa/uef;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const-string v2, "onProgressUpdate error: "

    .line 57
    .line 58
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
