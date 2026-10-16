.class public final synthetic Lcom/applovin/impl/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/h0;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/h0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/impl/S;->a:I

    iput-object p1, p0, Lcom/applovin/impl/S;->b:Lcom/applovin/impl/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/S;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/S;->b:Lcom/applovin/impl/h0;

    invoke-static {v0}, Lcom/applovin/impl/h0;->j(Lcom/applovin/impl/h0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/S;->b:Lcom/applovin/impl/h0;

    invoke-static {v0}, Lcom/applovin/impl/h0;->l(Lcom/applovin/impl/h0;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/S;->b:Lcom/applovin/impl/h0;

    invoke-static {v0}, Lcom/applovin/impl/h0;->k(Lcom/applovin/impl/h0;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/applovin/impl/S;->b:Lcom/applovin/impl/h0;

    invoke-static {v0}, Lcom/applovin/impl/h0;->m(Lcom/applovin/impl/h0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
