.class Lcom/applovin/impl/w1$e;
.super Lcom/applovin/impl/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/w1;->a(J)Lcom/applovin/impl/t4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/t4;

.field final synthetic b:Lcom/applovin/impl/w1;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/w1;Lcom/applovin/impl/t4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/w1$e;->b:Lcom/applovin/impl/w1;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/w1$e;->a:Lcom/applovin/impl/t4;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/applovin/impl/b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    instance-of p1, p1, Lcom/applovin/adview/AppLovinFullscreenActivity;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/applovin/impl/w1$e;->a:Lcom/applovin/impl/t4;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/applovin/impl/t4;->b(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/applovin/impl/w1$e;->b:Lcom/applovin/impl/w1;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/applovin/impl/w1;->b:Lcom/applovin/impl/sdk/k;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->e()Lcom/applovin/impl/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p0}, Lcom/applovin/impl/c;->b(Lcom/applovin/impl/b;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
