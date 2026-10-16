.class Lcom/applovin/impl/m3$b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/m3$b;->a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/m3$b;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/m3$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/m3$b$d;->a:Lcom/applovin/impl/m3$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Activity;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/applovin/mediation/MaxDebuggerAdUnitsListActivity;

    invoke-virtual {p0, p1}, Lcom/applovin/impl/m3$b$d;->a(Lcom/applovin/mediation/MaxDebuggerAdUnitsListActivity;)V

    return-void
.end method

.method public a(Lcom/applovin/mediation/MaxDebuggerAdUnitsListActivity;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/m3$b$d;->a:Lcom/applovin/impl/m3$b;

    iget-object v0, v0, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    invoke-static {v0}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/o3;->f()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/applovin/impl/m3$b$d;->a:Lcom/applovin/impl/m3$b;

    iget-object v1, v1, Lcom/applovin/impl/m3$b;->b:Lcom/applovin/impl/m3;

    invoke-static {v1}, Lcom/applovin/impl/m3;->b(Lcom/applovin/impl/m3;)Lcom/applovin/impl/o3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/applovin/impl/o3;->t()Lcom/applovin/impl/sdk/k;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lcom/applovin/impl/q;->initialize(Ljava/util/List;ZLcom/applovin/impl/sdk/k;)V

    return-void
.end method
