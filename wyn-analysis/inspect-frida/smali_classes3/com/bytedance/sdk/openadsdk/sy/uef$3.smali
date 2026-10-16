.class Lcom/bytedance/sdk/openadsdk/sy/uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/sy/uef;->uef(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/bcc/uef/ivm;

.field final synthetic uef:Z

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/sy/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/sy/uef;ZLcom/bytedance/sdk/component/bcc/uef/ivm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->uef:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->oa:Lcom/bytedance/sdk/component/bcc/uef/ivm;

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
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa(Lcom/bytedance/sdk/openadsdk/sy/uef;)I

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->uef:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->lw(Lcom/bytedance/sdk/openadsdk/sy/uef;)Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo/uef;->uef()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long v2, v0, v2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->lw(Lcom/bytedance/sdk/openadsdk/sy/uef;)Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/sy/yo/uef;->uef(J)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/moa/uef;->uef(J)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    sub-long/2addr v2, v0

    .line 51
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm(Lcom/bytedance/sdk/openadsdk/sy/uef;)Lcom/bytedance/sdk/openadsdk/sy/oa;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getUploadIntervalTime()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    int-to-long v0, v0

    .line 62
    cmp-long v0, v2, v0

    .line 63
    .line 64
    if-gez v0, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->oa:Lcom/bytedance/sdk/component/bcc/uef/ivm;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef$3;->yo:Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 70
    .line 71
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/sy/uef;->xs(Lcom/bytedance/sdk/openadsdk/sy/uef;)Ljava/lang/Runnable;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :catchall_0
    return-void
.end method
