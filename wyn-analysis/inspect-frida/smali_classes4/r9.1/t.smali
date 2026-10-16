.class public final Lr9/t;
.super Lp7/b;
.source "SourceFile"


# instance fields
.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/HashMap;

.field public final g:La2/c;

.field public final h:Lr9/u;

.field public final i:LY2/B;

.field public final j:LX2/j;

.field public k:Lr9/z;

.field public l:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    sget-object v1, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lr9/t;->e:Ljava/util/HashMap;

    .line 13
    .line 14
    new-instance v1, La2/c;

    .line 15
    .line 16
    const/16 v2, 0x19

    .line 17
    .line 18
    invoke-direct {v1, v2}, La2/c;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lr9/t;->g:La2/c;

    .line 22
    .line 23
    new-instance v1, Lr9/u;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lr9/u;-><init>(Lr9/t;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lr9/t;->h:Lr9/u;

    .line 29
    .line 30
    new-instance v1, LY2/B;

    .line 31
    .line 32
    const/16 v2, 0x17

    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, LY2/B;-><init>(BI)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lr9/t;->i:LY2/B;

    .line 38
    .line 39
    new-instance v1, LX2/j;

    .line 40
    .line 41
    const/16 v2, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, v2, v0}, LX2/j;-><init>(IZ)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Ls9/g;->a:Lc9/b;

    .line 47
    .line 48
    iput-object v0, v1, LX2/j;->b:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v1, p0, Lr9/t;->j:LX2/j;

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lr9/t;->f:Ljava/util/HashMap;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final B()Lr9/w;
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/X;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/X;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final D()Lr9/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/t;->k:Lr9/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Lr9/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/t;->j:LX2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Lr9/Q;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/t;->h:Lr9/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr9/t;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/t;->k:Lr9/z;

    .line 2
    .line 3
    invoke-interface {p1}, Lr9/z;->j()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p2}, Lw9/o;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    iget-object p2, p0, Lr9/t;->k:Lr9/z;

    .line 11
    .line 12
    invoke-interface {p2}, Lr9/z;->i()V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    iget-object p2, p0, Lr9/t;->k:Lr9/z;

    .line 18
    .line 19
    invoke-interface {p2}, Lr9/z;->i()V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final P(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/t;->k:Lr9/z;

    .line 2
    .line 3
    invoke-interface {p1}, Lr9/z;->j()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lr9/t;->k:Lr9/z;

    .line 10
    .line 11
    invoke-interface {p1}, Lr9/z;->i()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    iget-object p2, p0, Lr9/t;->k:Lr9/z;

    .line 17
    .line 18
    invoke-interface {p2}, Lr9/z;->i()V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final S()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr9/t;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "MemoryPersistence shutdown without start"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-boolean v1, p0, Lr9/t;->l:Z

    .line 12
    .line 13
    return-void
.end method

.method public final T()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr9/t;->l:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "MemoryPersistence double-started!"

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-boolean v1, p0, Lr9/t;->l:Z

    .line 14
    .line 15
    return-void
.end method

.method public final u()Lr9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/t;->i:LY2/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Ln9/e;)Lr9/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/t;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lr9/r;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lr9/r;

    .line 12
    .line 13
    invoke-direct {v1}, Lr9/r;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v1
.end method

.method public final y(Ln9/e;)Lr9/f;
    .locals 0

    .line 1
    iget-object p1, p0, Lr9/t;->g:La2/c;

    .line 2
    .line 3
    return-object p1
.end method

.method public final z(Ln9/e;Lr9/f;)Lr9/v;
    .locals 1

    .line 1
    iget-object p2, p0, Lr9/t;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr9/s;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lr9/s;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lr9/s;-><init>(Lr9/t;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
