.class public final synthetic Lcom/applovin/impl/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lcom/applovin/mediation/MaxAdViewAdListener;

.field public final synthetic d:Lcom/applovin/mediation/MaxAd;


# direct methods
.method public synthetic constructor <init>(ZLcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/impl/L0;->a:I

    iput-boolean p1, p0, Lcom/applovin/impl/L0;->b:Z

    iput-object p2, p0, Lcom/applovin/impl/L0;->c:Lcom/applovin/mediation/MaxAdViewAdListener;

    iput-object p3, p0, Lcom/applovin/impl/L0;->d:Lcom/applovin/mediation/MaxAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/impl/L0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/L0;->d:Lcom/applovin/mediation/MaxAd;

    iget-boolean v1, p0, Lcom/applovin/impl/L0;->b:Z

    iget-object v2, p0, Lcom/applovin/impl/L0;->c:Lcom/applovin/mediation/MaxAdViewAdListener;

    invoke-static {v1, v2, v0}, Lcom/applovin/impl/t2;->B(ZLcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/L0;->d:Lcom/applovin/mediation/MaxAd;

    iget-boolean v1, p0, Lcom/applovin/impl/L0;->b:Z

    iget-object v2, p0, Lcom/applovin/impl/L0;->c:Lcom/applovin/mediation/MaxAdViewAdListener;

    invoke-static {v1, v2, v0}, Lcom/applovin/impl/t2;->F(ZLcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
