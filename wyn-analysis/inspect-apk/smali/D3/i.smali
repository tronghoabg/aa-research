.class public final synthetic LD3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LD3/i;->a:I

    iput-object p1, p0, LD3/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LD3/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD3/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkc/r;

    .line 9
    .line 10
    check-cast p1, LD3/k;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lkc/r;->setWindowInfoListenerDisplayFeatures(LD3/k;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LD3/i;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    check-cast p1, Lcom/applovin/impl/i5;

    .line 21
    .line 22
    invoke-static {v0, p1}, Lcom/applovin/impl/sdk/ad/b;->J(Ljava/lang/String;Lcom/applovin/impl/i5;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, LD3/i;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lcom/applovin/impl/sdk/ad/a;

    .line 29
    .line 30
    check-cast p1, Lcom/applovin/impl/i5;

    .line 31
    .line 32
    invoke-static {v0, p1}, Lcom/applovin/impl/sdk/ad/a;->e1(Lcom/applovin/impl/sdk/ad/a;Lcom/applovin/impl/i5;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    check-cast p1, LD3/k;

    .line 37
    .line 38
    iget-object v0, p0, LD3/i;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LGf/t;

    .line 41
    .line 42
    check-cast v0, LGf/s;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, LGf/s;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
