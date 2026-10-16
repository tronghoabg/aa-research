.class public final synthetic Lr9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/f;


# direct methods
.method public synthetic constructor <init>(Lr9/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/j;->a:I

    iput-object p1, p0, Lr9/j;->b:Lr9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lr9/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr9/j;->b:Lr9/f;

    check-cast p1, Ls9/a;

    invoke-interface {v0, p1}, Lr9/f;->c(Ls9/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lr9/j;->b:Lr9/f;

    check-cast p1, Ls9/a;

    invoke-interface {v0, p1}, Lr9/f;->e(Ls9/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
