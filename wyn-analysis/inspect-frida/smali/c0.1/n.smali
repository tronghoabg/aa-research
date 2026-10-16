.class public final Lc0/n;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Ls0/b;


# instance fields
.field public final b:LB/F;

.field public final c:LN/Y;

.field public final d:La2/v;


# direct methods
.method public constructor <init>(LB/F;)V
    .locals 1

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lc0/n;->b:LB/F;

    .line 7
    .line 8
    sget-object p1, LN/P;->f:LN/P;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lc0/n;->c:LN/Y;

    .line 16
    .line 17
    sget-object p1, Lc0/m;->a:La2/v;

    .line 18
    .line 19
    iput-object p1, p0, Lc0/n;->d:La2/v;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final e0(Lc0/l;)V
    .locals 1

    .line 1
    const-string v0, "focusProperties"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/n;->b:LB/F;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LB/F;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/n;->c:LN/Y;

    .line 12
    .line 13
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lc0/n;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lc0/n;->e0(Lc0/l;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lc0/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lc0/n;

    .line 6
    .line 7
    iget-object p1, p1, Lc0/n;->b:LB/F;

    .line 8
    .line 9
    iget-object v0, p0, Lc0/n;->b:LB/F;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
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
    iget-object v0, p0, Lc0/n;->d:La2/v;

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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/n;->b:LB/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final o(Ls0/c;)V
    .locals 1

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lc0/m;->a:La2/v;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lc0/n;

    .line 13
    .line 14
    iget-object v0, p0, Lc0/n;->c:LN/Y;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
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
