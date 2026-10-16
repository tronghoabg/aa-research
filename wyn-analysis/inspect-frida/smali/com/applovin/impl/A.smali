.class public final synthetic Lcom/applovin/impl/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/a2;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/a2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/impl/A;->a:I

    iput-object p1, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/A;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->C(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->E(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->I(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->G(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->L(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->F(Lcom/applovin/impl/a2;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lcom/applovin/impl/A;->b:Lcom/applovin/impl/a2;

    invoke-static {v0}, Lcom/applovin/impl/a2;->J(Lcom/applovin/impl/a2;)V

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
