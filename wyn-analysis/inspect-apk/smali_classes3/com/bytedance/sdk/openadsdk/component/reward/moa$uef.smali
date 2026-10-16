.class Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/uef/uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/moa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private bcc:J

.field private cz:J

.field private ivm:Landroid/os/CountDownTimer;

.field private lw:I

.field private moa:J

.field private final oa:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

.field private final uef:J

.field private xs:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

.field private final yo:Lcom/bytedance/sdk/openadsdk/moa/xs;


# direct methods
.method public constructor <init>(JLcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef:J

    .line 8
    .line 9
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->yo:Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)Lcom/bytedance/sdk/openadsdk/moa/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->yo:Lcom/bytedance/sdk/openadsdk/moa/xs;

    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef:J

    return-wide v0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    return-wide p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)J
    .locals 2

    .line 3
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bcc:J

    return-wide v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;J)J
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bcc:J

    return-wide p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;)J
    .locals 2

    .line 2
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    return-wide v0
.end method


# virtual methods
.method public ab()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->uef:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public bcc()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public bs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bcc:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public cq()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ivm:Landroid/os/CountDownTimer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ivm:Landroid/os/CountDownTimer;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public cz()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->cz:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public dj()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ab()J

    .line 10
    .line 11
    .line 12
    move-result-wide v10

    .line 13
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    .line 14
    .line 15
    cmp-long v0, v0, v10

    .line 16
    .line 17
    if-ltz v0, :cond_1

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    .line 22
    .line 23
    :cond_1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    .line 24
    .line 25
    sub-long v4, v10, v0

    .line 26
    .line 27
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef$1;

    .line 28
    .line 29
    const-wide/16 v6, 0xc8

    .line 30
    .line 31
    move-wide v8, v4

    .line 32
    move-object v3, p0

    .line 33
    invoke-direct/range {v2 .. v11}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;JJJJ)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v3, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ivm:Landroid/os/CountDownTimer;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public dz()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public ivm()Z
    .locals 2

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public lw()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public moa()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public oa(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    return-void
.end method

.method public oa()Z
    .locals 2

    .line 3
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public uef(J)V
    .locals 0

    .line 5
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->cz:J

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo$uef;

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public wk()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public wrv()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 3
    .line 4
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bcc:J

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->moa:J

    .line 7
    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ivm:Landroid/os/CountDownTimer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->ivm:Landroid/os/CountDownTimer;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public xs()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->lw:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public yo()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public zjm()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->bcc:J

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/moa$uef;->dj()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
