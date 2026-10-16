.class public final synthetic Lcom/applovin/impl/E0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/d$b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/applovin/impl/n;

.field public final synthetic c:Lcom/applovin/impl/j2;

.field public final synthetic d:Lcom/applovin/impl/sdk/k;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/n;Lcom/applovin/impl/j2;Lcom/applovin/impl/sdk/k;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/impl/E0;->a:I

    iput-object p1, p0, Lcom/applovin/impl/E0;->b:Lcom/applovin/impl/n;

    iput-object p2, p0, Lcom/applovin/impl/E0;->c:Lcom/applovin/impl/j2;

    iput-object p3, p0, Lcom/applovin/impl/E0;->d:Lcom/applovin/impl/sdk/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/impl/E0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/applovin/impl/E0;->d:Lcom/applovin/impl/sdk/k;

    check-cast p1, Lcom/applovin/mediation/MaxDebuggerWaterfallSegmentsActivity;

    iget-object v1, p0, Lcom/applovin/impl/E0;->c:Lcom/applovin/impl/j2;

    iget-object v2, p0, Lcom/applovin/impl/E0;->b:Lcom/applovin/impl/n;

    invoke-static {v2, v1, v0, p1}, Lcom/applovin/impl/p;->b(Lcom/applovin/impl/n;Lcom/applovin/impl/j2;Lcom/applovin/impl/sdk/k;Lcom/applovin/mediation/MaxDebuggerWaterfallSegmentsActivity;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/applovin/impl/E0;->d:Lcom/applovin/impl/sdk/k;

    check-cast p1, Lcom/applovin/mediation/MaxDebuggerAdUnitDetailActivity;

    iget-object v1, p0, Lcom/applovin/impl/E0;->c:Lcom/applovin/impl/j2;

    iget-object v2, p0, Lcom/applovin/impl/E0;->b:Lcom/applovin/impl/n;

    invoke-static {v2, v1, v0, p1}, Lcom/applovin/impl/p;->c(Lcom/applovin/impl/n;Lcom/applovin/impl/j2;Lcom/applovin/impl/sdk/k;Lcom/applovin/mediation/MaxDebuggerAdUnitDetailActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
