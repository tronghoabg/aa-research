.class public final Lr9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/v;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Lc9/d;

.field public c:I

.field public d:Lcom/google/protobuf/ByteString;

.field public final e:Lr9/t;

.field public final f:La2/c;


# direct methods
.method public constructor <init>(Lr9/t;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/s;->e:Lr9/t;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v0, Lc9/d;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 16
    .line 17
    sget-object v2, Lr9/c;->c:Lq6/d;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lr9/s;->b:Lc9/d;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput v0, p0, Lr9/s;->c:I

    .line 26
    .line 27
    sget-object v0, Lv9/B;->u:Lcom/google/protobuf/ByteString;

    .line 28
    .line 29
    iput-object v0, p0, Lr9/s;->d:Lcom/google/protobuf/ByteString;

    .line 30
    .line 31
    iget-object p1, p1, Lr9/t;->g:La2/c;

    .line 32
    .line 33
    iput-object p1, p0, Lr9/s;->f:La2/c;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lr9/s;->b:Lc9/d;

    .line 10
    .line 11
    iget-object v0, v0, Lc9/d;->a:Lc9/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lc9/c;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "Document leak -- detected dangling mutation references when queue is empty."

    .line 21
    .line 22
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final b(I)Lt9/i;
    .locals 2

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr9/s;->l(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    :cond_0
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-le v1, p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lt9/i;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public final c(I)Lt9/i;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lr9/s;->l(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lt v0, v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lt9/i;

    .line 21
    .line 22
    iget v1, v0, Lt9/i;->a:I

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-ne v1, p1, :cond_1

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move p1, v2

    .line 30
    :goto_0
    const-string v1, "If found batch must match"

    .line 31
    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p1, v1, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 39
    return-object p1
.end method

.method public final d()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/s;->d:Lcom/google/protobuf/ByteString;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lt9/i;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p1, Lt9/i;->a:I

    .line 4
    .line 5
    invoke-virtual {p0, v2}, Lr9/s;->l(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-ltz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v2, v4, :cond_0

    .line 18
    .line 19
    move v4, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, v1

    .line 22
    :goto_0
    const-string v5, "Batches must exist to be %s"

    .line 23
    .line 24
    new-array v6, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v7, "removed"

    .line 27
    .line 28
    aput-object v7, v6, v1

    .line 29
    .line 30
    invoke-static {v4, v5, v6}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v1

    .line 37
    :goto_1
    const-string v2, "Can only remove the first entry of the mutation queue"

    .line 38
    .line 39
    new-array v4, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {v0, v2, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lr9/s;->b:Lc9/d;

    .line 48
    .line 49
    iget-object v1, p1, Lt9/i;->d:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lt9/h;

    .line 66
    .line 67
    iget-object v2, v2, Lt9/h;->a:Ls9/h;

    .line 68
    .line 69
    iget-object v3, p0, Lr9/s;->e:Lr9/t;

    .line 70
    .line 71
    iget-object v3, v3, Lr9/t;->k:Lr9/z;

    .line 72
    .line 73
    invoke-interface {v3, v2}, Lr9/z;->b(Ls9/h;)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Lr9/c;

    .line 77
    .line 78
    iget v4, p1, Lt9/i;->a:I

    .line 79
    .line 80
    invoke-direct {v3, v2, v4}, Lr9/c;-><init>(Ls9/h;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    iput-object v0, p0, Lr9/s;->b:Lc9/d;

    .line 89
    .line 90
    return-void
.end method

.method public final f(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/s;->d:Lcom/google/protobuf/ByteString;

    .line 5
    .line 6
    return-void
.end method

.method public final g(Ljava/util/Set;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Lc9/d;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    sget-object v2, Lw9/p;->a:Lm9/B;

    .line 6
    .line 7
    new-instance v2, Lq6/d;

    .line 8
    .line 9
    const/16 v3, 0x18

    .line 10
    .line 11
    invoke-direct {v2, v3}, Lq6/d;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ls9/h;

    .line 32
    .line 33
    new-instance v2, Lr9/c;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v1, v3}, Lr9/c;-><init>(Ls9/h;I)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lr9/s;->b:Lc9/d;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Lc9/d;->b(Lr9/c;)LA7/v;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :goto_1
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljava/util/Iterator;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lr9/c;

    .line 60
    .line 61
    iget-object v4, v3, Lr9/c;->a:Ls9/h;

    .line 62
    .line 63
    invoke-virtual {v1, v4}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget v3, v3, Lr9/c;->b:I

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v0, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_3
    :goto_2
    move-object v1, v0

    .line 91
    check-cast v1, LA7/v;

    .line 92
    .line 93
    iget-object v2, v1, LA7/v;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Ljava/util/Iterator;

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-virtual {v1}, LA7/v;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p0, v1}, Lr9/s;->c(I)Lt9/i;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    return-object p1
.end method

.method public final h(Ls8/q;Ljava/util/ArrayList;Ljava/util/List;)Lt9/i;
    .locals 5

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v3, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v4, "Mutation batches should not be empty"

    .line 11
    .line 12
    invoke-static {v0, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lr9/s;->c:I

    .line 16
    .line 17
    add-int/lit8 v3, v0, 0x1

    .line 18
    .line 19
    iput v3, p0, Lr9/s;->c:I

    .line 20
    .line 21
    iget-object v3, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-lez v4, :cond_1

    .line 28
    .line 29
    sub-int/2addr v4, v1

    .line 30
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Lt9/i;

    .line 35
    .line 36
    iget v4, v4, Lt9/i;->a:I

    .line 37
    .line 38
    if-ge v4, v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v1, v2

    .line 42
    :goto_0
    const-string v4, "Mutation batchIds must be monotonically increasing order"

    .line 43
    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {v1, v4, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    new-instance v1, Lt9/i;

    .line 50
    .line 51
    invoke-direct {v1, v0, p1, p2, p3}, Lt9/i;-><init>(ILs8/q;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Lt9/h;

    .line 72
    .line 73
    iget-object p3, p0, Lr9/s;->b:Lc9/d;

    .line 74
    .line 75
    new-instance v2, Lr9/c;

    .line 76
    .line 77
    iget-object v3, p2, Lt9/h;->a:Ls9/h;

    .line 78
    .line 79
    invoke-direct {v2, v3, v0}, Lr9/c;-><init>(Ls9/h;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, v2}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    iput-object p3, p0, Lr9/s;->b:Lc9/d;

    .line 87
    .line 88
    iget-object p2, p2, Lt9/h;->a:Ls9/h;

    .line 89
    .line 90
    invoke-virtual {p2}, Ls9/h;->d()Ls9/m;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-object p3, p0, Lr9/s;->f:La2/c;

    .line 95
    .line 96
    iget-object p3, p3, La2/c;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p3, Lad/L;

    .line 99
    .line 100
    invoke-virtual {p3, p2}, Lad/L;->e(Ls9/m;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    return-object v1
.end method

.method public final i()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    return v0

    .line 11
    :cond_0
    iget v0, p0, Lr9/s;->c:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    return v0
.end method

.method public final j(Lt9/i;Lcom/google/protobuf/ByteString;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget p1, p1, Lt9/i;->a:I

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr9/s;->l(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-ltz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v2, v4, :cond_0

    .line 18
    .line 19
    move v4, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v4, v1

    .line 22
    :goto_0
    const-string v5, "Batches must exist to be %s"

    .line 23
    .line 24
    new-array v6, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v7, "acknowledged"

    .line 27
    .line 28
    aput-object v7, v6, v1

    .line 29
    .line 30
    invoke-static {v4, v5, v6}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    move v4, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v4, v1

    .line 38
    :goto_1
    const-string v5, "Can only acknowledge the first batch in the mutation queue"

    .line 39
    .line 40
    new-array v6, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v4, v5, v6}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lt9/i;

    .line 50
    .line 51
    iget v3, v2, Lt9/i;->a:I

    .line 52
    .line 53
    if-ne p1, v3, :cond_2

    .line 54
    .line 55
    move v3, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move v3, v1

    .line 58
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget v2, v2, Lt9/i;->a:I

    .line 63
    .line 64
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const/4 v4, 0x2

    .line 69
    new-array v4, v4, [Ljava/lang/Object;

    .line 70
    .line 71
    aput-object p1, v4, v1

    .line 72
    .line 73
    aput-object v2, v4, v0

    .line 74
    .line 75
    const-string p1, "Queue ordering failure: expected batch %d, got batch %d"

    .line 76
    .line 77
    invoke-static {v3, p1, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Lr9/s;->d:Lcom/google/protobuf/ByteString;

    .line 84
    .line 85
    return-void
.end method

.method public final k()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lt9/i;

    .line 16
    .line 17
    iget v0, v0, Lt9/i;->a:I

    .line 18
    .line 19
    sub-int/2addr p1, v0

    .line 20
    return p1
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput v0, p0, Lr9/s;->c:I

    .line 11
    .line 12
    :cond_0
    return-void
.end method
