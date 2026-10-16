.class public Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/ue$uef;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;,
        Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;
    }
.end annotation


# instance fields
.field private bcc:I

.field private ivm:Z

.field private lw:Z

.field private moa:J

.field private oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

.field private uef:Landroid/os/Handler;

.field private xs:I

.field private yo:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/component/utils/ue;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/utils/ue;-><init>(Lcom/bytedance/sdk/component/utils/ue$uef;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 15
    .line 16
    const/16 v0, 0x2710

    .line 17
    .line 18
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->xs:I

    .line 19
    .line 20
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->bcc:I

    .line 21
    .line 22
    return-void
.end method

.method private moa()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->yo:J

    .line 15
    .line 16
    sub-long/2addr v0, v2

    .line 17
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->xs:I

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-ltz v0, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef()V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method private yo()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->yo:J

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 18
    .line 19
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    .line 20
    .line 21
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;->uef()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    .line 31
    .line 32
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->bcc:I

    .line 33
    .line 34
    int-to-long v3, v3

    .line 35
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    .line 44
    .line 45
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->xs:I

    .line 46
    .line 47
    int-to-long v2, v2

    .line 48
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->moa:J

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    if-eqz v0, :cond_1

    .line 7
    sget-object v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public oa(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->bcc:I

    return-void
.end method

.method public uef()V
    .locals 2

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    .line 9
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->xs:I

    return-void
.end method

.method public uef(Landroid/os/Message;)V
    .locals 1

    .line 13
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-void

    .line 14
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->moa()V

    return-void

    .line 15
    :cond_1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->yo()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;)V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->lw:Z

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->ivm:Z

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa;->uef:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    if-eqz p1, :cond_1

    .line 7
    sget-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;)V

    :cond_1
    :goto_0
    return-void
.end method
