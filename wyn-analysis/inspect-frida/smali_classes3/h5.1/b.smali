.class public final Lh5/b;
.super Lh5/a;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:LVa/X7;

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/util/Map;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LVa/X7;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh5/b;->b:LVa/X7;

    .line 10
    .line 11
    iput-object p1, p0, Lh5/b;->a:Ljava/util/Map;

    .line 12
    .line 13
    iput-boolean p2, p0, Lh5/b;->c:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh5/b;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final t0()Lh5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/b;->b:LVa/X7;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u0(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lh5/b;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lh5/b;->b:LVa/X7;

    .line 16
    .line 17
    iget-object v3, v2, LVa/X7;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "code"

    .line 22
    .line 23
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string v3, "message"

    .line 27
    .line 28
    iget-object v4, v2, LVa/X7;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v3, "data"

    .line 36
    .line 37
    iget-object v2, v2, LVa/X7;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const-string v2, "error"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final v0(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lh5/b;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lh5/b;->b:LVa/X7;

    .line 11
    .line 12
    iget-object v1, v1, LVa/X7;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/io/Serializable;

    .line 15
    .line 16
    const-string v2, "result"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
