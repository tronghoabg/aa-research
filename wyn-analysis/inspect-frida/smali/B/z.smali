.class public final LB/z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LN/V;


# direct methods
.method public synthetic constructor <init>(LN/V;I)V
    .locals 0

    .line 1
    iput p2, p0, LB/z;->i:I

    iput-object p1, p0, LB/z;->j:LN/V;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, LB/z;->j:LN/V;

    .line 4
    .line 5
    iget v2, p0, LB/z;->i:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/content/res/Configuration;

    .line 11
    .line 12
    const-string v2, "it"

    .line 13
    .line 14
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LN/D;

    .line 18
    .line 19
    invoke-interface {v1, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    if-nez p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-interface {v1, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/ClassCastException;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
