.class public final LRe/p;
.super LRe/a;
.source "SourceFile"


# instance fields
.field public final c:LF5/d;

.field public final d:Lya/b;

.field public final e:Lx9/d;

.field public final f:Lx9/d;


# direct methods
.method public constructor <init>(LHe/c;LF5/d;)V
    .locals 2

    .line 1
    sget-object v0, LNe/b;->d:Lya/b;

    .line 2
    .line 3
    sget-object v1, LNe/b;->c:Lx9/d;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LRe/p;->c:LF5/d;

    .line 9
    .line 10
    iput-object v0, p0, LRe/p;->d:Lya/b;

    .line 11
    .line 12
    iput-object v1, p0, LRe/p;->e:Lx9/d;

    .line 13
    .line 14
    iput-object v1, p0, LRe/p;->f:Lx9/d;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 9

    .line 1
    instance-of v0, p1, LOe/a;

    .line 2
    .line 3
    iget-object v1, p0, LRe/a;->b:LHe/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v2, LRe/n;

    .line 8
    .line 9
    move-object v3, p1

    .line 10
    check-cast v3, LOe/a;

    .line 11
    .line 12
    iget-object v4, p0, LRe/p;->c:LF5/d;

    .line 13
    .line 14
    iget-object v5, p0, LRe/p;->d:Lya/b;

    .line 15
    .line 16
    iget-object v6, p0, LRe/p;->e:Lx9/d;

    .line 17
    .line 18
    iget-object v7, p0, LRe/p;->f:Lx9/d;

    .line 19
    .line 20
    invoke-direct/range {v2 .. v7}, LRe/n;-><init>(LOe/a;LF5/d;Lya/b;Lx9/d;Lx9/d;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, LHe/c;->d(LHe/f;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v3, LRe/o;

    .line 28
    .line 29
    iget-object v5, p0, LRe/p;->c:LF5/d;

    .line 30
    .line 31
    iget-object v6, p0, LRe/p;->d:Lya/b;

    .line 32
    .line 33
    iget-object v7, p0, LRe/p;->e:Lx9/d;

    .line 34
    .line 35
    iget-object v8, p0, LRe/p;->f:Lx9/d;

    .line 36
    .line 37
    move-object v4, p1

    .line 38
    invoke-direct/range {v3 .. v8}, LRe/o;-><init>(LHe/f;LF5/d;Lya/b;Lx9/d;Lx9/d;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, LHe/c;->d(LHe/f;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
