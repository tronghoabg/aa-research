.class public final synthetic Lcom/applovin/impl/mediation/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/applovin/impl/mediation/ads/a$a;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/mediation/ads/a$a;ILjava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/impl/mediation/l;->a:I

    iput-object p1, p0, Lcom/applovin/impl/mediation/l;->d:Lcom/applovin/impl/mediation/ads/a$a;

    iput p2, p0, Lcom/applovin/impl/mediation/l;->b:I

    iput-object p3, p0, Lcom/applovin/impl/mediation/l;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/impl/mediation/l;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/mediation/l;->d:Lcom/applovin/impl/mediation/ads/a$a;

    check-cast v0, Lcom/applovin/impl/mediation/e$b;

    iget v1, p0, Lcom/applovin/impl/mediation/l;->b:I

    iget-object v2, p0, Lcom/applovin/impl/mediation/l;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/mediation/e$b;->a(Lcom/applovin/impl/mediation/e$b;ILjava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/mediation/l;->d:Lcom/applovin/impl/mediation/ads/a$a;

    check-cast v0, Lcom/applovin/impl/mediation/d$b;

    iget v1, p0, Lcom/applovin/impl/mediation/l;->b:I

    iget-object v2, p0, Lcom/applovin/impl/mediation/l;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/mediation/d$b;->a(Lcom/applovin/impl/mediation/d$b;ILjava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
