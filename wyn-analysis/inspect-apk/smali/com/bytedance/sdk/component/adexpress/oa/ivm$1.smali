.class Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/xs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/adexpress/oa/ivm;->uef(Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/adexpress/oa/ivm;

.field final synthetic uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/adexpress/oa/ivm;Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->oa:Lcom/bytedance/sdk/component/adexpress/oa/ivm;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 0

    .line 5
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;

    invoke-interface {p2}, Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;->oa()Lcom/bytedance/sdk/component/adexpress/oa/wk;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 6
    invoke-interface {p2, p1}, Lcom/bytedance/sdk/component/adexpress/oa/wk;->a_(I)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/view/View;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;->yo()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;->oa()Lcom/bytedance/sdk/component/adexpress/oa/wk;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->oa:Lcom/bytedance/sdk/component/adexpress/oa/ivm;

    invoke-static {v0}, Lcom/bytedance/sdk/component/adexpress/oa/ivm;->uef(Lcom/bytedance/sdk/component/adexpress/oa/ivm;)Lcom/bytedance/sdk/component/adexpress/oa/uef;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lcom/bytedance/sdk/component/adexpress/oa/wk;->uef(Lcom/bytedance/sdk/component/adexpress/oa/moa;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/oa/ivm$1;->uef:Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/component/adexpress/oa/zjm$uef;->uef(Z)V

    return-void
.end method
