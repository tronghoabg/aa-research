.class public final Lc0/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# static fields
.field public static final i:Lc0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc0/j;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc0/j;->i:Lc0/j;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    check-cast p1, LZ/k;

    .line 3
    .line 4
    check-cast p2, LN/o;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    const-string p3, "$this$composed"

    .line 12
    .line 13
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const p3, -0x136e80c7

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 20
    .line 21
    .line 22
    const p3, -0x1d58f75c

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    sget-object v1, LN/k;->a:LN/P;

    .line 33
    .line 34
    if-ne p3, v1, :cond_0

    .line 35
    .line 36
    new-instance p3, Lc0/g;

    .line 37
    .line 38
    invoke-direct {p3}, Lc0/g;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 45
    .line 46
    .line 47
    check-cast p3, Lc0/g;

    .line 48
    .line 49
    new-instance v1, Lc0/i;

    .line 50
    .line 51
    invoke-direct {v1, p3, v0}, Lc0/i;-><init>(Lc0/g;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, p2}, LN/d;->g(Ltf/a;LN/o;)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lc0/k;->a:La2/v;

    .line 58
    .line 59
    const-string v1, "focusModifier"

    .line 60
    .line 61
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, p3}, LZ/k;->g(LZ/k;)LZ/k;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object p3, Lc0/k;->b:LZ/k;

    .line 69
    .line 70
    invoke-interface {p1, p3}, LZ/k;->g(LZ/k;)LZ/k;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method
