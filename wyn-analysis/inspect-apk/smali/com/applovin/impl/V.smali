.class public final synthetic Lcom/applovin/impl/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/j4;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/j4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/impl/V;->a:I

    iput-object p1, p0, Lcom/applovin/impl/V;->b:Lcom/applovin/impl/j4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/V;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/V;->b:Lcom/applovin/impl/j4;

    invoke-static {v0}, Lcom/applovin/impl/j4;->b(Lcom/applovin/impl/j4;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/V;->b:Lcom/applovin/impl/j4;

    invoke-static {v0}, Lcom/applovin/impl/j4;->a(Lcom/applovin/impl/j4;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
