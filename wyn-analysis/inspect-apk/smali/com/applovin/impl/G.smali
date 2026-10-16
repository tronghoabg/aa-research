.class public final synthetic Lcom/applovin/impl/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/t4$b;
.implements Lt/a;
.implements Lcom/applovin/impl/u0$c;
.implements Lcom/applovin/impl/s3$b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/applovin/impl/G;->a:I

    iput-object p1, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lcom/applovin/impl/u3;->c(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/applovin/impl/u0$b;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/u0;

    invoke-static {v0, p1}, Lcom/applovin/impl/u0;->f(Lcom/applovin/impl/u0;Lcom/applovin/impl/u0$b;)V

    return-void
.end method

.method public a(ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 3
    iget v0, p0, Lcom/applovin/impl/G;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p2, Ljava/lang/Void;

    check-cast p3, Ljava/lang/Void;

    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/w1;

    invoke-static {v0, p1, p2, p3}, Lcom/applovin/impl/w1;->g(Lcom/applovin/impl/w1;ZLjava/lang/Void;Ljava/lang/Void;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-static {v0, p1, p2, p3}, Lcom/applovin/impl/t4;->b(Ljava/lang/Runnable;ZLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/t4$a;

    invoke-static {v0, p1, p2, p3}, Lcom/applovin/impl/t4;->e(Lcom/applovin/impl/t4$a;ZLjava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_3
    check-cast p2, Lcom/applovin/impl/p2;

    check-cast p3, Ljava/lang/Exception;

    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/d6;

    invoke-static {v0, p1, p2, p3}, Lcom/applovin/impl/d6;->e(Lcom/applovin/impl/d6;ZLcom/applovin/impl/p2;Ljava/lang/Exception;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/G;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/y2;

    check-cast p1, Lcom/applovin/impl/i5;

    invoke-static {v0, p1}, Lcom/applovin/impl/y2;->u(Lcom/applovin/impl/y2;Lcom/applovin/impl/i5;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/G;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/p7;

    check-cast p1, Lcom/applovin/impl/i5;

    invoke-static {v0, p1}, Lcom/applovin/impl/p7;->e1(Lcom/applovin/impl/p7;Lcom/applovin/impl/i5;)Ljava/util/List;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
