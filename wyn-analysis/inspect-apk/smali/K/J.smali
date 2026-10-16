.class public final LK/J;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# static fields
.field public static final i:LK/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK/J;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK/J;->i:LK/J;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LZ/k;

    .line 2
    .line 3
    check-cast p2, LN/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const-string p3, "$this$composed"

    .line 11
    .line 12
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const p1, 0x48bde1dd

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 19
    .line 20
    .line 21
    sget-object p1, LK/K;->a:LN/L0;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    sget-object p1, Lu0/M;->o:LN/L0;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lu0/p0;

    .line 42
    .line 43
    invoke-interface {p1}, Lu0/p0;->a()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    new-instance p1, LK/y;

    .line 48
    .line 49
    invoke-direct {p1, v0, v1}, LK/y;-><init>(J)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object p1, LZ/i;->a:LZ/i;

    .line 54
    .line 55
    :goto_0
    const/4 p3, 0x0

    .line 56
    invoke-virtual {p2, p3}, LN/o;->p(Z)V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method
