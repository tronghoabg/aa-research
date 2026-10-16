.class public final LIf/o;
.super LIf/i;
.source "SourceFile"


# instance fields
.field public final e:Llf/j;


# direct methods
.method public constructor <init>(Ltf/q;LHf/l;Ljf/h;ILGf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p5, p2, p3}, LIf/i;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Llf/j;

    .line 5
    .line 6
    iput-object p1, p0, LIf/o;->e:Llf/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljf/h;ILGf/a;)LIf/g;
    .locals 6

    .line 1
    new-instance v0, LIf/o;

    .line 2
    .line 3
    iget-object v1, p0, LIf/o;->e:Llf/j;

    .line 4
    .line 5
    iget-object v2, p0, LIf/i;->d:LHf/l;

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    move v4, p2

    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, LIf/o;-><init>(Ltf/q;LHf/l;Ljf/h;ILGf/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final g(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LIf/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, LIf/n;-><init>(LIf/o;LHf/m;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    return-object p1
.end method
