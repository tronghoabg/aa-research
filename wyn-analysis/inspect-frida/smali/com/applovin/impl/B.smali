.class public final synthetic Lcom/applovin/impl/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZJI)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/applovin/impl/B;->a:I

    iput-object p1, p0, Lcom/applovin/impl/B;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/applovin/impl/B;->b:Z

    iput-wide p3, p0, Lcom/applovin/impl/B;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/applovin/impl/B;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/B;->d:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/sdk/r;

    iget-boolean v1, p0, Lcom/applovin/impl/B;->b:Z

    iget-wide v2, p0, Lcom/applovin/impl/B;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/sdk/r;->c(Lcom/applovin/impl/sdk/r;ZJ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/B;->d:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/a2;

    iget-boolean v1, p0, Lcom/applovin/impl/B;->b:Z

    iget-wide v2, p0, Lcom/applovin/impl/B;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/a2;->H(Lcom/applovin/impl/a2;ZJ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
