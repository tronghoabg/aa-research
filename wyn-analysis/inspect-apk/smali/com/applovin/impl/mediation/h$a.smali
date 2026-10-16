.class Lcom/applovin/impl/mediation/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/mediation/adapter/listeners/MaxSignalCollectionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/mediation/h;->a(Lcom/applovin/mediation/adapter/parameters/MaxAdapterSignalCollectionParameters;Lcom/applovin/impl/e5;Landroid/app/Activity;Lcom/applovin/impl/t4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/e5;

.field final synthetic b:Lcom/applovin/impl/t4;

.field final synthetic c:Lcom/applovin/impl/mediation/h;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/mediation/h;Lcom/applovin/impl/e5;Lcom/applovin/impl/t4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/mediation/h$a;->c:Lcom/applovin/impl/mediation/h;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/mediation/h$a;->a:Lcom/applovin/impl/e5;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/applovin/impl/mediation/h$a;->b:Lcom/applovin/impl/t4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onSignalCollected(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/mediation/h$a;->a:Lcom/applovin/impl/e5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/e5;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/applovin/impl/mediation/h$a;->b:Lcom/applovin/impl/t4;

    .line 16
    .line 17
    new-instance v0, Lcom/applovin/impl/mediation/MaxErrorImpl;

    .line 18
    .line 19
    const-string v1, "Signal is not a valid string"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lcom/applovin/impl/mediation/MaxErrorImpl;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/mediation/h$a;->b:Lcom/applovin/impl/t4;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/applovin/impl/t4;->b(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onSignalCollectionFailed(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/mediation/h$a;->b:Lcom/applovin/impl/t4;

    .line 2
    .line 3
    new-instance v1, Lcom/applovin/impl/mediation/MaxErrorImpl;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/applovin/impl/mediation/MaxErrorImpl;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/applovin/impl/t4;->a(Ljava/lang/Object;)Lcom/applovin/impl/t4;

    .line 9
    .line 10
    .line 11
    return-void
.end method
