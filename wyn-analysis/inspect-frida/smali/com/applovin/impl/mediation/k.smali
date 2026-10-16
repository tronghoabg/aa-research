.class public final synthetic Lcom/applovin/impl/mediation/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/mediation/MediationServiceImpl;

.field public final synthetic c:Lcom/applovin/impl/mediation/h;

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Lcom/applovin/impl/mediation/ads/a$a;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/c3;Lcom/applovin/impl/mediation/h;Landroid/view/ViewGroup;Landroidx/lifecycle/o;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/applovin/impl/mediation/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/mediation/k;->b:Lcom/applovin/impl/mediation/MediationServiceImpl;

    iput-object p2, p0, Lcom/applovin/impl/mediation/k;->f:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/mediation/k;->c:Lcom/applovin/impl/mediation/h;

    iput-object p4, p0, Lcom/applovin/impl/mediation/k;->g:Ljava/lang/Object;

    iput-object p5, p0, Lcom/applovin/impl/mediation/k;->h:Ljava/lang/Object;

    iput-object p6, p0, Lcom/applovin/impl/mediation/k;->d:Landroid/app/Activity;

    iput-object p7, p0, Lcom/applovin/impl/mediation/k;->e:Lcom/applovin/impl/mediation/ads/a$a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/mediation/h;Ljava/lang/String;Lcom/applovin/impl/mediation/MaxAdapterParametersImpl;Lcom/applovin/impl/y2;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/applovin/impl/mediation/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/mediation/k;->b:Lcom/applovin/impl/mediation/MediationServiceImpl;

    iput-object p2, p0, Lcom/applovin/impl/mediation/k;->c:Lcom/applovin/impl/mediation/h;

    iput-object p3, p0, Lcom/applovin/impl/mediation/k;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/impl/mediation/k;->g:Ljava/lang/Object;

    iput-object p5, p0, Lcom/applovin/impl/mediation/k;->h:Ljava/lang/Object;

    iput-object p6, p0, Lcom/applovin/impl/mediation/k;->d:Landroid/app/Activity;

    iput-object p7, p0, Lcom/applovin/impl/mediation/k;->e:Lcom/applovin/impl/mediation/ads/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lcom/applovin/impl/mediation/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v6, p0, Lcom/applovin/impl/mediation/k;->d:Landroid/app/Activity;

    iget-object v1, p0, Lcom/applovin/impl/mediation/k;->b:Lcom/applovin/impl/mediation/MediationServiceImpl;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->f:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/applovin/impl/c3;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->g:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->h:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/lifecycle/o;

    iget-object v3, p0, Lcom/applovin/impl/mediation/k;->c:Lcom/applovin/impl/mediation/h;

    iget-object v7, p0, Lcom/applovin/impl/mediation/k;->e:Lcom/applovin/impl/mediation/ads/a$a;

    invoke-static/range {v1 .. v7}, Lcom/applovin/impl/mediation/MediationServiceImpl;->c(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/c3;Lcom/applovin/impl/mediation/h;Landroid/view/ViewGroup;Landroidx/lifecycle/o;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V

    return-void

    :pswitch_0
    iget-object v8, p0, Lcom/applovin/impl/mediation/k;->b:Lcom/applovin/impl/mediation/MediationServiceImpl;

    iget-object v9, p0, Lcom/applovin/impl/mediation/k;->c:Lcom/applovin/impl/mediation/h;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->h:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lcom/applovin/impl/y2;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->f:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    iget-object v0, p0, Lcom/applovin/impl/mediation/k;->g:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Lcom/applovin/impl/mediation/MaxAdapterParametersImpl;

    iget-object v13, p0, Lcom/applovin/impl/mediation/k;->d:Landroid/app/Activity;

    iget-object v14, p0, Lcom/applovin/impl/mediation/k;->e:Lcom/applovin/impl/mediation/ads/a$a;

    invoke-static/range {v8 .. v14}, Lcom/applovin/impl/mediation/MediationServiceImpl;->f(Lcom/applovin/impl/mediation/MediationServiceImpl;Lcom/applovin/impl/mediation/h;Ljava/lang/String;Lcom/applovin/impl/mediation/MaxAdapterParametersImpl;Lcom/applovin/impl/y2;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
