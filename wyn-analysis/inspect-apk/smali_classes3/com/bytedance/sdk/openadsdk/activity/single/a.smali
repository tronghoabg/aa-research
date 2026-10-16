.class public final synthetic Lcom/bytedance/sdk/openadsdk/activity/single/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;

.field public final synthetic b:Lcom/bytedance/sdk/openadsdk/core/ivm/ivm;

.field public final synthetic c:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;Lcom/bytedance/sdk/openadsdk/core/ivm/ivm;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->a:Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->b:Lcom/bytedance/sdk/openadsdk/core/ivm/ivm;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->c:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->a:Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->b:Lcom/bytedance/sdk/openadsdk/core/ivm/ivm;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/a;->c:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, v1, v2, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->a(Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;Lcom/bytedance/sdk/openadsdk/core/ivm/ivm;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/view/View;)V

    return-void
.end method
