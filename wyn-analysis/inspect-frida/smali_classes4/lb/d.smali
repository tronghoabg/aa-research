.class public final synthetic Llb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llb/f;

.field public final synthetic c:Luc/o;

.field public final synthetic d:Ltc/g;


# direct methods
.method public synthetic constructor <init>(Llb/f;Luc/o;Ltc/g;I)V
    .locals 0

    .line 1
    iput p4, p0, Llb/d;->a:I

    iput-object p1, p0, Llb/d;->b:Llb/f;

    iput-object p2, p0, Llb/d;->c:Luc/o;

    iput-object p3, p0, Llb/d;->d:Ltc/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Llb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb/d;->c:Luc/o;

    .line 7
    .line 8
    iget-object v1, p0, Llb/d;->d:Ltc/g;

    .line 9
    .line 10
    iget-object v2, p0, Llb/d;->b:Llb/f;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Llb/f;->onMethodCall(Luc/o;Luc/q;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Llb/d;->c:Luc/o;

    .line 17
    .line 18
    iget-object v1, p0, Llb/d;->d:Ltc/g;

    .line 19
    .line 20
    iget-object v2, p0, Llb/d;->b:Llb/f;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Llb/f;->onMethodCall(Luc/o;Luc/q;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
