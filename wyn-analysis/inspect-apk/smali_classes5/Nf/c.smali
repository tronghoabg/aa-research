.class public final LNf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/l;
.implements LEf/R0;


# instance fields
.field public final a:LEf/n;

.field public final synthetic b:LNf/d;


# direct methods
.method public constructor <init>(LNf/d;LEf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LNf/c;->b:LNf/d;

    .line 5
    .line 6
    iput-object p2, p0, LNf/c;->a:LEf/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LEf/n;->a(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b(LJf/r;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LEf/n;->b(LJf/r;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Ljava/lang/Object;Ltf/q;)V
    .locals 2

    .line 1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    sget-object p2, LNf/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, LNf/c;->b:LNf/d;

    .line 7
    .line 8
    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, LFf/d;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p2, v0, v1, p0}, LFf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, LEf/n;->n(Ljava/lang/Object;Ltf/l;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final getContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    iget-object v0, v0, LEf/n;->e:Ljf/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    invoke-virtual {v0}, LEf/n;->isActive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m(Ljava/lang/Object;Ltf/q;)LH6/g;
    .locals 2

    .line 1
    check-cast p1, Lef/C;

    .line 2
    .line 3
    new-instance p2, LNf/b;

    .line 4
    .line 5
    iget-object v0, p0, LNf/c;->b:LNf/d;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, LNf/b;-><init>(LNf/d;LNf/c;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LNf/c;->a:LEf/n;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, LEf/n;->E(Ljava/lang/Object;Ltf/q;)LH6/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, LNf/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final n(Ljava/lang/Object;Ltf/l;)V
    .locals 1

    .line 1
    check-cast p1, Lef/C;

    .line 2
    .line 3
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, LEf/n;->n(Ljava/lang/Object;Ltf/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LEf/n;->o(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LNf/c;->a:LEf/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
