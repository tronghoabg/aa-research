.class public final LB/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LN/V;

.field public final synthetic k:LD/i;


# direct methods
.method public synthetic constructor <init>(LN/V;LD/i;I)V
    .locals 0

    .line 1
    iput p3, p0, LB/k;->i:I

    iput-object p1, p0, LB/k;->j:LN/V;

    iput-object p2, p0, LB/k;->k:LD/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LB/k;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/C;

    .line 7
    .line 8
    const-string v0, "$this$DisposableEffect"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, LB/j;

    .line 14
    .line 15
    iget-object v0, p0, LB/k;->j:LN/V;

    .line 16
    .line 17
    iget-object v1, p0, LB/k;->k:LD/i;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {p1, v0, v1, v2}, LB/j;-><init>(LN/V;LD/i;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, LN/C;

    .line 25
    .line 26
    const-string v0, "$this$DisposableEffect"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, LB/j;

    .line 32
    .line 33
    iget-object v0, p0, LB/k;->j:LN/V;

    .line 34
    .line 35
    iget-object v1, p0, LB/k;->k:LD/i;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {p1, v0, v1, v2}, LB/j;-><init>(LN/V;LD/i;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast p1, LN/C;

    .line 43
    .line 44
    const-string v0, "$this$DisposableEffect"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, LB/j;

    .line 50
    .line 51
    iget-object v0, p0, LB/k;->j:LN/V;

    .line 52
    .line 53
    iget-object v1, p0, LB/k;->k:LD/i;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-direct {p1, v0, v1, v2}, LB/j;-><init>(LN/V;LD/i;I)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
