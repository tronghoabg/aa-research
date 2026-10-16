.class public final Lod/K1;
.super Lmd/e;
.source "SourceFile"


# instance fields
.field public final d:Lmd/e;

.field public final synthetic e:Lod/L1;


# direct methods
.method public constructor <init>(Lod/L1;Lmd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/K1;->e:Lod/L1;

    .line 5
    .line 6
    iput-object p2, p0, Lod/K1;->d:Lmd/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Lmd/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/K1;->d:Lmd/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lmd/e;->j(Lmd/k0;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lod/K1;->e:Lod/L1;

    .line 7
    .line 8
    iget-object p1, p1, Lod/L1;->c:Lmd/n0;

    .line 9
    .line 10
    new-instance v0, Lkd/c;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {v0, p0, v1}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final n(Lmd/e0;)V
    .locals 5

    .line 1
    sget-object v0, Lod/L1;->d:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e0;->b:Lmd/b;

    .line 4
    .line 5
    iget-object v2, v1, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    sget-object v2, Lmd/b;->b:Lmd/b;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lod/J1;

    .line 21
    .line 22
    iget-object v3, p0, Lod/K1;->e:Lod/L1;

    .line 23
    .line 24
    invoke-direct {v2, v3}, Lod/J1;-><init>(Lod/L1;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-direct {v3, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v3, v2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lmd/a;

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v3, v2, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    new-instance v0, Lmd/b;

    .line 83
    .line 84
    invoke-direct {v0, v3}, Lmd/b;-><init>(Ljava/util/IdentityHashMap;)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lmd/e0;

    .line 88
    .line 89
    iget-object v2, p1, Lmd/e0;->a:Ljava/util/List;

    .line 90
    .line 91
    iget-object p1, p1, Lmd/e0;->c:Lmd/d0;

    .line 92
    .line 93
    invoke-direct {v1, v2, v0, p1}, Lmd/e0;-><init>(Ljava/util/List;Lmd/b;Lmd/d0;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lod/K1;->d:Lmd/e;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Lmd/e;->n(Lmd/e0;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    const-string v0, "RetryingNameResolver can only be used once to wrap a NameResolver"

    .line 105
    .line 106
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
.end method
