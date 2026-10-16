.class Lcom/applovin/impl/o5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/e0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/o5;->p()Lcom/applovin/impl/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/x7;

.field final synthetic b:Lcom/applovin/impl/o5;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/o5;Lcom/applovin/impl/x7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/o5$a;->b:Lcom/applovin/impl/o5;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/o5$a;->a:Lcom/applovin/impl/x7;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/applovin/impl/o5$a;->a:Lcom/applovin/impl/x7;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/applovin/impl/x7;->a(Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/applovin/impl/o5$a;->b:Lcom/applovin/impl/o5;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/applovin/impl/o5;->a(Lcom/applovin/impl/o5;)Lcom/applovin/impl/p7;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/ad/b;->b(Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/o5$a;->b:Lcom/applovin/impl/o5;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 22
    .line 23
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/applovin/impl/o5$a;->b:Lcom/applovin/impl/o5;

    .line 30
    .line 31
    iget-object v0, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 34
    .line 35
    const-string v1, "Failed to cache static companion ad"

    .line 36
    .line 37
    invoke-virtual {v0, p1, v1}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
