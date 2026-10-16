.class public final synthetic Lcom/applovin/impl/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/impl/D;->a:I

    iput-object p1, p0, Lcom/applovin/impl/D;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/D;->d:Ljava/lang/Object;

    iput p3, p0, Lcom/applovin/impl/D;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/impl/D;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/D;->c:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/sdk/AppLovinPostbackListener;

    iget-object v1, p0, Lcom/applovin/impl/D;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lcom/applovin/impl/D;->b:I

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/t2;->I(Lcom/applovin/sdk/AppLovinPostbackListener;Ljava/lang/String;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/D;->d:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/sdk/AppLovinAd;

    iget-object v1, p0, Lcom/applovin/impl/D;->c:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/sdk/AppLovinAdRewardListener;

    iget v2, p0, Lcom/applovin/impl/D;->b:I

    invoke-static {v1, v0, v2}, Lcom/applovin/impl/t2;->d(Lcom/applovin/sdk/AppLovinAdRewardListener;Lcom/applovin/sdk/AppLovinAd;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/applovin/impl/D;->c:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/b1;

    iget-object v1, p0, Lcom/applovin/impl/D;->d:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/b1$c;

    iget v2, p0, Lcom/applovin/impl/D;->b:I

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/b1;->a(Lcom/applovin/impl/b1;Lcom/applovin/impl/b1$c;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
