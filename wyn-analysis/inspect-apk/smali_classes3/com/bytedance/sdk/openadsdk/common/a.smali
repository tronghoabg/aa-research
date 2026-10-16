.class public final synthetic Lcom/bytedance/sdk/openadsdk/common/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/bytedance/sdk/openadsdk/common/tpx;


# direct methods
.method public synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/common/tpx;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/common/a;->a:I

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->f(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->d(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->g(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->b(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->h(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->a(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/a;->b:Lcom/bytedance/sdk/openadsdk/common/tpx;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/tpx;->c(Lcom/bytedance/sdk/openadsdk/common/tpx;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
