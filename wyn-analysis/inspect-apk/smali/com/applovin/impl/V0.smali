.class public final synthetic Lcom/applovin/impl/V0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/adview/g;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/adview/g;Ljava/lang/Runnable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/applovin/impl/V0;->a:I

    iput-object p1, p0, Lcom/applovin/impl/V0;->b:Lcom/applovin/impl/adview/g;

    iput-object p2, p0, Lcom/applovin/impl/V0;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/applovin/impl/V0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/V0;->b:Lcom/applovin/impl/adview/g;

    iget-object v1, p0, Lcom/applovin/impl/V0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/adview/g;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/V0;->b:Lcom/applovin/impl/adview/g;

    iget-object v1, p0, Lcom/applovin/impl/V0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/applovin/impl/w1;->f(Lcom/applovin/impl/adview/g;Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/V0;->b:Lcom/applovin/impl/adview/g;

    iget-object v1, p0, Lcom/applovin/impl/V0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lcom/applovin/impl/w1;->d(Lcom/applovin/impl/adview/g;Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
