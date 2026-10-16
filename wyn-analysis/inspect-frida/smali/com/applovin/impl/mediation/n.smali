.class public final synthetic Lcom/applovin/impl/mediation/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/mediation/h;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Landroidx/lifecycle/o;

.field public final synthetic e:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/mediation/h;Landroid/view/ViewGroup;Landroidx/lifecycle/o;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/applovin/impl/mediation/n;->a:I

    iput-object p1, p0, Lcom/applovin/impl/mediation/n;->b:Lcom/applovin/impl/mediation/h;

    iput-object p2, p0, Lcom/applovin/impl/mediation/n;->c:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/applovin/impl/mediation/n;->d:Landroidx/lifecycle/o;

    iput-object p4, p0, Lcom/applovin/impl/mediation/n;->e:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/applovin/impl/mediation/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/mediation/n;->b:Lcom/applovin/impl/mediation/h;

    iget-object v1, p0, Lcom/applovin/impl/mediation/n;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/applovin/impl/mediation/n;->d:Landroidx/lifecycle/o;

    iget-object v3, p0, Lcom/applovin/impl/mediation/n;->e:Landroid/app/Activity;

    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/mediation/h;->a(Lcom/applovin/impl/mediation/h;Landroid/view/ViewGroup;Landroidx/lifecycle/o;Landroid/app/Activity;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/mediation/n;->b:Lcom/applovin/impl/mediation/h;

    iget-object v1, p0, Lcom/applovin/impl/mediation/n;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/applovin/impl/mediation/n;->d:Landroidx/lifecycle/o;

    iget-object v3, p0, Lcom/applovin/impl/mediation/n;->e:Landroid/app/Activity;

    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/mediation/h;->f(Lcom/applovin/impl/mediation/h;Landroid/view/ViewGroup;Landroidx/lifecycle/o;Landroid/app/Activity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
