.class public final synthetic Lcom/applovin/impl/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/s2$a;
.implements Lcom/applovin/impl/u0$c;


# instance fields
.field public final synthetic a:Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/M;->a:Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;

    iput-object p2, p0, Lcom/applovin/impl/M;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/M;->a:Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;

    check-cast v0, Lcom/applovin/impl/e7;

    iget-object v1, p0, Lcom/applovin/impl/M;->b:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/sdk/k;

    invoke-static {v0, v1, p1, p2}, Lcom/applovin/impl/e7;->a(Lcom/applovin/impl/e7;Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V

    return-void
.end method

.method public a(Lcom/applovin/impl/u0$b;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/M;->a:Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;

    check-cast v0, Lcom/applovin/impl/u0;

    iget-object v1, p0, Lcom/applovin/impl/M;->b:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/u0$c;

    invoke-static {v0, v1, p1}, Lcom/applovin/impl/u0;->e(Lcom/applovin/impl/u0;Lcom/applovin/impl/u0$c;Lcom/applovin/impl/u0$b;)V

    return-void
.end method
