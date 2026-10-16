.class public final LHf/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/g0;


# instance fields
.field public final a:LHf/g0;

.field public final b:Llf/j;


# direct methods
.method public constructor <init>(LHf/g0;Ltf/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/C0;->a:LHf/g0;

    .line 5
    .line 6
    check-cast p2, Llf/j;

    .line 7
    .line 8
    iput-object p2, p0, LHf/C0;->b:Llf/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LHf/B0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/B0;

    .line 7
    .line 8
    iget v1, v0, LHf/B0;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LHf/B0;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/B0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LHf/B0;-><init>(LHf/C0;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/B0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/B0;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, LHf/A0;

    .line 52
    .line 53
    iget-object v2, p0, LHf/C0;->b:Llf/j;

    .line 54
    .line 55
    invoke-direct {p2, p1, v2}, LHf/A0;-><init>(LHf/m;Ltf/p;)V

    .line 56
    .line 57
    .line 58
    iput v3, v0, LHf/B0;->c:I

    .line 59
    .line 60
    iget-object p1, p0, LHf/C0;->a:LHf/g0;

    .line 61
    .line 62
    invoke-interface {p1, p2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    new-instance p1, LE5/Q;

    .line 70
    .line 71
    const/16 p2, 0x8

    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method
