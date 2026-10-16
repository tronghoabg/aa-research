.class Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;-><init>(Lcom/bytedance/sdk/openadsdk/dz/uef/oa;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/dz/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;Lcom/bytedance/sdk/openadsdk/dz/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;->uef:Lcom/bytedance/sdk/openadsdk/dz/uef/oa;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->getAdapterPosition()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef/oa;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef/oa;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of v0, p1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef$1;->oa:Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/dz/uef/oa$uef;->lw:Lcom/bytedance/sdk/openadsdk/dz/uef/oa;

    .line 29
    .line 30
    check-cast p1, Lcom/bytedance/sdk/openadsdk/dz/uef/uef;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/dz/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/dz/uef/oa;Lcom/bytedance/sdk/openadsdk/dz/uef/uef;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
