.class public Lcom/bytedance/sdk/component/adexpress/oa/ivm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/zjm;


# instance fields
.field private oa:Lcom/bytedance/sdk/component/adexpress/oa/uef;

.field private uef:Landroid/content/Context;

.field private yo:Lcom/bytedance/sdk/component/adexpress/oa/cq;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/oa/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->uef:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->oa:Lcom/bytedance/sdk/component/adexpress/oa/uef;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->yo:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/adexpress/oa/ivm;)Lcom/bytedance/sdk/component/adexpress/oa/uef;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->oa:Lcom/bytedance/sdk/component/adexpress/oa/uef;

    return-object p0
.end method


# virtual methods
.method public uef()V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/yo;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->oa:Lcom/bytedance/sdk/component/adexpress/oa/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/adexpress/oa/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/yo;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)Z
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->yo:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->xs(I)V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->oa:Lcom/bytedance/sdk/component/adexpress/oa/uef;

    new-instance v1, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;-><init>(Lcom/bytedance/sdk/component/adexpress/oa/ivm;Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/moa;->uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V

    const/4 p1, 0x1

    return p1
.end method
