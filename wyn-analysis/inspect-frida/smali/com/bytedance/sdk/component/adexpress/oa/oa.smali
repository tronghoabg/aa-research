.class public Lcom/bytedance/sdk/component/adexpress/oa/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/zjm;


# instance fields
.field private ivm:I

.field private lw:Lcom/bytedance/sdk/component/adexpress/oa/cq;

.field private moa:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

.field private oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

.field private uef:Landroid/content/Context;

.field private yo:Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;ZLcom/bytedance/sdk/component/adexpress/dynamic/lw/bcc;Lcom/bytedance/sdk/component/adexpress/oa/bcc;Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->uef:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->lw:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->yo:Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;

    .line 9
    .line 10
    iput-object p6, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->moa:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    .line 11
    .line 12
    if-eqz p8, :cond_0

    .line 13
    .line 14
    iput-object p8, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p6, p2

    .line 18
    move-object p2, p1

    .line 19
    new-instance p1, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    .line 20
    .line 21
    invoke-direct/range {p1 .. p7}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;ZLcom/bytedance/sdk/component/adexpress/dynamic/lw/bcc;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    .line 25
    .line 26
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    .line 27
    .line 28
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->moa:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/bcc;)V

    .line 31
    .line 32
    .line 33
    instance-of p1, p5, Lcom/bytedance/sdk/component/adexpress/dynamic/lw/xs;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x3

    .line 38
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->ivm:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const/4 p1, 0x2

    .line 42
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->ivm:I

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/adexpress/oa/oa;)Lcom/bytedance/sdk/component/adexpress/oa/cq;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->lw:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/adexpress/oa/oa;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->ivm:I

    return p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/component/adexpress/oa/oa;)Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public oa()Lcom/bytedance/sdk/component/adexpress/dynamic/moa;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->moa()Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/DynamicRootView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public uef()V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->oa()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->lw:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    move-result-object v0

    iget v1, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->ivm:I

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->uef(I)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/oa;->oa:Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;

    new-instance v1, Lcom/bytedance/sdk/component/adexpress/oa/oa$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/component/adexpress/oa/oa$1;-><init>(Lcom/bytedance/sdk/component/adexpress/oa/oa;Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/dynamic/uef/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V

    const/4 p1, 0x1

    return p1
.end method
