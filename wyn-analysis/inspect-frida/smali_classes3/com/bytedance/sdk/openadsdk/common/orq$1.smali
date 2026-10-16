.class Lcom/bytedance/sdk/openadsdk/common/orq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/common/orq;->xs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/common/orq;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/common/orq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->xs()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->removeAllViews()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroid/view/ViewGroup;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->uef(Lcom/bytedance/sdk/openadsdk/common/orq;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->oa(Lcom/bytedance/sdk/openadsdk/common/orq;)Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    instance-of p1, p1, Landroid/app/Activity;

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/orq$1;->uef:Lcom/bytedance/sdk/openadsdk/common/orq;

    .line 70
    .line 71
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/orq;->oa(Lcom/bytedance/sdk/openadsdk/common/orq;)Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/app/Activity;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void
.end method
