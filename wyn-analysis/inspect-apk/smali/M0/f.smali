.class public final LM0/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LM0/o;


# direct methods
.method public synthetic constructor <init>(LM0/o;I)V
    .locals 0

    .line 1
    iput p2, p0, LM0/f;->i:I

    iput-object p1, p0, LM0/f;->j:LM0/o;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LM0/f;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM0/f;->j:LM0/o;

    .line 7
    .line 8
    invoke-virtual {v0}, LM0/o;->getTypedView$ui_release()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, LM0/o;->getUpdateBlock()Ltf/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v0, Lef/C;->a:Lef/C;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, LM0/f;->j:LM0/o;

    .line 25
    .line 26
    iget-boolean v1, v0, LM0/i;->d:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, LM0/i;->getUpdate()Ltf/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v0, LM0/i;->k:LX/u;

    .line 35
    .line 36
    iget-object v3, v0, LM0/i;->l:LM0/c;

    .line 37
    .line 38
    invoke-virtual {v2, v0, v3, v1}, LX/u;->c(Ljava/lang/Object;Ltf/l;Ltf/a;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
