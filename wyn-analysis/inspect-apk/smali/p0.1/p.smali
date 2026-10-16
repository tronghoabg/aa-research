.class public final Lp0/p;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lp0/r;


# direct methods
.method public synthetic constructor <init>(Lp0/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp0/p;->i:I

    iput-object p1, p0, Lp0/p;->j:Lp0/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp0/p;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/view/MotionEvent;

    .line 7
    .line 8
    const-string v0, "motionEvent"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lp0/p;->j:Lp0/r;

    .line 14
    .line 15
    iget-object v0, v0, Lp0/r;->a:LM0/c;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, LM0/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    const-string p1, "onTouchEvent"

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1

    .line 32
    :pswitch_0
    check-cast p1, Landroid/view/MotionEvent;

    .line 33
    .line 34
    const-string v0, "motionEvent"

    .line 35
    .line 36
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lp0/p;->j:Lp0/r;

    .line 40
    .line 41
    iget-object v0, v0, Lp0/r;->a:LM0/c;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, p1}, LM0/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object p1, Lef/C;->a:Lef/C;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    const-string p1, "onTouchEvent"

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    throw p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
