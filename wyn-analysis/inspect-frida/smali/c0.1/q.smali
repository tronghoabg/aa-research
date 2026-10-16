.class public final Lc0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Ls0/b;


# instance fields
.field public a:Lc0/q;

.field public final b:LP/d;


# direct methods
.method public constructor <init>(Lc0/o;)V
    .locals 2

    .line 1
    const-string v0, "focusRequester"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, LP/d;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    new-array v1, v1, [Lc0/g;

    .line 14
    .line 15
    invoke-direct {v0, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lc0/q;->b:LP/d;

    .line 19
    .line 20
    iget-object p1, p1, Lc0/o;->a:LP/d;

    .line 21
    .line 22
    invoke-virtual {p1, p0}, LP/d;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lc0/g;)V
    .locals 1

    .line 1
    const-string v0, "focusModifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/q;->b:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP/d;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lc0/q;->a(Lc0/g;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final b(LP/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/q;->b:LP/d;

    .line 2
    .line 3
    iget v1, v0, LP/d;->c:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LP/d;->c(ILP/d;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lc0/q;->b(LP/d;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final c(Lc0/g;)V
    .locals 1

    .line 1
    const-string v0, "focusModifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/q;->b:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP/d;->k(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lc0/q;->c(Lc0/g;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final d(LP/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/q;->b:LP/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/d;->l(LP/d;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lc0/q;->d(LP/d;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()La2/v;
    .locals 1

    .line 1
    sget-object v0, Lc0/p;->a:La2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
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

.method public final o(Ls0/c;)V
    .locals 2

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lc0/p;->a:La2/v;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lc0/q;

    .line 13
    .line 14
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lc0/q;->a:Lc0/q;

    .line 23
    .line 24
    iget-object v1, p0, Lc0/q;->b:LP/d;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lc0/q;->d(LP/d;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lc0/q;->b(LP/d;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iput-object p1, p0, Lc0/q;->a:Lc0/q;

    .line 37
    .line 38
    :cond_2
    return-void
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

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
