.class public abstract Lt9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls9/h;

.field public final b:Lt9/m;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ls9/h;Lt9/m;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lt9/h;-><init>(Ls9/h;Lt9/m;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ls9/h;Lt9/m;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lt9/h;->a:Ls9/h;

    .line 4
    iput-object p2, p0, Lt9/h;->b:Lt9/m;

    .line 5
    iput-object p3, p0, Lt9/h;->c:Ljava/util/List;

    return-void
.end method

.method public static c(Ls9/k;Lt9/f;)Lt9/h;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ls9/k;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Lt9/f;->a:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v0, p0, Ls9/k;->a:Ls9/h;

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Ls9/k;->e()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p0, Lt9/e;

    .line 29
    .line 30
    sget-object p1, Lt9/m;->c:Lt9/m;

    .line 31
    .line 32
    invoke-direct {p0, v0, p1}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    new-instance p1, Lt9/o;

    .line 37
    .line 38
    iget-object p0, p0, Ls9/k;->e:Ls9/l;

    .line 39
    .line 40
    sget-object v1, Lt9/m;->c:Lt9/m;

    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, v0, p0, v1, v2}, Lt9/o;-><init>(Ls9/h;Ls9/l;Lt9/m;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_2
    iget-object p0, p0, Ls9/k;->e:Ls9/l;

    .line 52
    .line 53
    new-instance v1, Ls9/l;

    .line 54
    .line 55
    invoke-direct {v1}, Ls9/l;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v2, Ljava/util/HashSet;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, Lt9/f;->a:Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_5

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ls9/j;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0, v3}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-nez v4, :cond_4

    .line 92
    .line 93
    iget-object v4, v3, Ls9/e;->a:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const/4 v5, 0x1

    .line 100
    if-le v4, v5, :cond_4

    .line 101
    .line 102
    invoke-virtual {v3}, Ls9/e;->k()Ls9/e;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ls9/j;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {p0, v3}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v1, v4, v3}, Ls9/l;->g(Lka/C1;Ls9/j;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    new-instance p0, Lt9/l;

    .line 120
    .line 121
    new-instance p1, Lt9/f;

    .line 122
    .line 123
    invoke-direct {p1, v2}, Lt9/f;-><init>(Ljava/util/HashSet;)V

    .line 124
    .line 125
    .line 126
    sget-object v2, Lt9/m;->c:Lt9/m;

    .line 127
    .line 128
    invoke-direct {p0, v0, v1, p1, v2}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 133
    return-object p0
.end method


# virtual methods
.method public abstract a(Ls9/k;Lt9/f;Ls8/q;)Lt9/f;
.end method

.method public abstract b(Ls9/k;Lt9/j;)V
.end method

.method public abstract d()Lt9/f;
.end method

.method public final e(Lt9/h;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lt9/h;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/h;->a:Ls9/h;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lt9/h;->b:Lt9/m;

    .line 12
    .line 13
    iget-object p1, p1, Lt9/h;->b:Lt9/m;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lt9/m;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public final f()I
    .locals 2

    .line 1
    iget-object v0, p0, Lt9/h;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v0, v0, Ls9/h;->a:Ls9/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls9/e;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lt9/h;->b:Lt9/m;

    .line 12
    .line 13
    invoke-virtual {v1}, Lt9/m;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "key="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lt9/h;->a:Ls9/h;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", precondition="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lt9/h;->b:Lt9/m;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final h(Ls8/q;Ls9/k;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/h;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lt9/g;

    .line 27
    .line 28
    iget-object v3, v2, Lt9/g;->b:Lt9/p;

    .line 29
    .line 30
    iget-object v4, p2, Ls9/k;->e:Ls9/l;

    .line 31
    .line 32
    iget-object v2, v2, Lt9/g;->a:Ls9/j;

    .line 33
    .line 34
    invoke-virtual {v4, v2}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v3, v4, p1}, Lt9/p;->b(Lka/C1;Ls8/q;)Lka/C1;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0
.end method

.method public final i(Ls9/k;Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Ljava/util/HashMap;

    .line 3
    .line 4
    iget-object v2, p0, Lt9/h;->c:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x0

    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    move v3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v5

    .line 27
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const/4 v7, 0x2

    .line 44
    new-array v7, v7, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object v4, v7, v5

    .line 47
    .line 48
    aput-object v6, v7, v0

    .line 49
    .line 50
    const-string v4, "server transform count (%d) should match field transform count (%d)"

    .line 51
    .line 52
    invoke-static {v3, v4, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-ge v5, v3, :cond_1

    .line 60
    .line 61
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lt9/g;

    .line 66
    .line 67
    iget-object v4, v3, Lt9/g;->b:Lt9/p;

    .line 68
    .line 69
    iget-object v6, p1, Ls9/k;->e:Ls9/l;

    .line 70
    .line 71
    iget-object v3, v3, Lt9/g;->a:Ls9/j;

    .line 72
    .line 73
    invoke-virtual {v6, v3}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Lka/C1;

    .line 82
    .line 83
    invoke-interface {v4, v6, v7}, Lt9/p;->c(Lka/C1;Lka/C1;)Lka/C1;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    add-int/2addr v5, v0

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    return-object v1
.end method

.method public final j(Ls9/k;)V
    .locals 2

    .line 1
    iget-object p1, p1, Ls9/k;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v0, p0, Lt9/h;->a:Ls9/h;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v1, "Can only apply a mutation to a document with the same key"

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
