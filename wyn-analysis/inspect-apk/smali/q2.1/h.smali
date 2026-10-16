.class public final synthetic Lq2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq2/r;


# direct methods
.method public synthetic constructor <init>(Lq2/i;Lq2/r;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq2/h;->a:I

    iput-object p2, p0, Lq2/h;->b:Lq2/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq2/i;Lq2/r;LN1/Y;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Lq2/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq2/h;->b:Lq2/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lq2/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/h;->b:Lq2/r;

    .line 7
    .line 8
    invoke-interface {v0}, Lq2/r;->B()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lq2/h;->b:Lq2/r;

    .line 13
    .line 14
    invoke-interface {v0}, Lq2/r;->q()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    iget-object v0, p0, Lq2/h;->b:Lq2/r;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
