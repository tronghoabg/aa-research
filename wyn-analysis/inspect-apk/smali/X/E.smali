.class public final LX/E;
.super LX/g;
.source "SourceFile"


# instance fields
.field public final e:LX/g;

.field public final f:Z

.field public final g:Ltf/l;


# direct methods
.method public constructor <init>(LX/g;Ltf/l;Z)V
    .locals 2

    .line 1
    sget-object v0, LX/k;->e:LX/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v1, v0}, LX/g;-><init>(ILX/k;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LX/E;->e:LX/g;

    .line 8
    .line 9
    iput-boolean p3, p0, LX/E;->f:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, LX/g;->f()Ltf/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p1, LX/m;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, LX/b;

    .line 26
    .line 27
    iget-object p1, p1, LX/c;->e:Ltf/l;

    .line 28
    .line 29
    :cond_1
    invoke-static {p2, p1, v1}, LX/m;->l(Ltf/l;Ltf/l;Z)Ltf/l;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LX/E;->g:Ltf/l;

    .line 34
    .line 35
    invoke-static {}, LN/d;->y()J

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LX/g;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, LX/E;->f:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LX/E;->e:LX/g;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LX/g;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX/g;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final e()LX/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX/g;->e()LX/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final f()Ltf/l;
    .locals 1

    .line 1
    iget-object v0, p0, LX/E;->g:Ltf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX/g;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final i()Ltf/l;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-static {}, LX/q;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-static {}, LX/q;->f()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    throw v0
.end method

.method public final m()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX/g;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(LX/y;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LX/g;->n(LX/y;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final t(Ltf/l;)LX/g;
    .locals 3

    .line 1
    iget-object v0, p0, LX/E;->g:Ltf/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, LX/m;->l(Ltf/l;Ltf/l;Z)Ltf/l;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, LX/E;->u()LX/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2}, LX/g;->t(Ltf/l;)LX/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1, v1}, LX/m;->h(LX/g;Ltf/l;Z)LX/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final u()LX/g;
    .locals 1

    .line 1
    iget-object v0, p0, LX/E;->e:LX/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LX/m;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LX/g;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
