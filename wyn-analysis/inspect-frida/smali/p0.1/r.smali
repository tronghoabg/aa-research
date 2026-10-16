.class public final Lp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/o;


# instance fields
.field public a:LM0/c;

.field public b:LGf/r;

.field public c:Z

.field public final d:Lp0/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp0/q;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lp0/q;-><init>(Lp0/r;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp0/r;->d:Lp0/q;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
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

.method public final s()Lp0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/r;->d:Lp0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
