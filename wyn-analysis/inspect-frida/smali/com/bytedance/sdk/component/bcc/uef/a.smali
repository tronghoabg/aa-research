.class public final synthetic Lcom/bytedance/sdk/component/bcc/uef/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/bytedance/sdk/component/bcc/uef/ivm;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->a:I

    iput-object p1, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->b:Lcom/bytedance/sdk/component/bcc/uef/ivm;

    iput-object p2, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->b:Lcom/bytedance/sdk/component/bcc/uef/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->b(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->b:Lcom/bytedance/sdk/component/bcc/uef/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/component/bcc/uef/a;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->c(Lcom/bytedance/sdk/component/bcc/uef/ivm;Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
