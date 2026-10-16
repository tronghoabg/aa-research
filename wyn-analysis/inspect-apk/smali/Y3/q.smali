.class public final LY3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li4/g;
.implements Lr0/l;


# instance fields
.field public final a:LHf/x0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-wide v0, LY3/u;->a:J

    .line 5
    .line 6
    new-instance v2, LL0/a;

    .line 7
    .line 8
    invoke-direct {v2, v0, v1}, LL0/a;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LY3/q;->a:LHf/x0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(LX3/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, LY3/l;

    .line 2
    .line 3
    iget-object v1, p0, LY3/q;->a:LHf/x0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LY3/l;-><init>(LHf/x0;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, LHf/k0;->o(LHf/l;Ljf/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 3

    .line 1
    new-instance v0, LL0/a;

    .line 2
    .line 3
    invoke-direct {v0, p3, p4}, LL0/a;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LY3/q;->a:LHf/x0;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iget p3, p2, Lr0/t;->a:I

    .line 20
    .line 21
    iget p4, p2, Lr0/t;->b:I

    .line 22
    .line 23
    new-instance v0, LE/w;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p3, p4, v0}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
