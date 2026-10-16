.class public final Lp9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Lp9/t;

.field public static final m:Lp9/t;


# instance fields
.field public final a:Ljava/util/List;

.field public b:Ljava/util/List;

.field public c:Lp9/A;

.field public d:Lp9/A;

.field public final e:Ljava/util/List;

.field public final f:Ls9/m;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:I

.field public final j:Lp9/c;

.field public final k:Lp9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ls9/j;->b:Ls9/j;

    .line 2
    .line 3
    new-instance v1, Lp9/t;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2, v0}, Lp9/t;-><init>(ILs9/j;)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lp9/u;->l:Lp9/t;

    .line 10
    .line 11
    new-instance v1, Lp9/t;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v1, v2, v0}, Lp9/t;-><init>(ILs9/j;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lp9/u;->m:Lp9/t;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ls9/m;Ljava/lang/String;)V
    .locals 10

    .line 10
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v9, 0x0

    const-wide/16 v5, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v4, v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 11
    invoke-direct/range {v0 .. v9}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    return-void
.end method

.method public constructor <init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp9/u;->f:Ls9/m;

    .line 3
    iput-object p2, p0, Lp9/u;->g:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lp9/u;->a:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lp9/u;->e:Ljava/util/List;

    .line 6
    iput-wide p5, p0, Lp9/u;->h:J

    .line 7
    iput p7, p0, Lp9/u;->i:I

    .line 8
    iput-object p8, p0, Lp9/u;->j:Lp9/c;

    .line 9
    iput-object p9, p0, Lp9/u;->k:Lp9/c;

    return-void
.end method


# virtual methods
.method public final a()LO7/d;
    .locals 2

    .line 1
    new-instance v0, LO7/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lp9/u;->d()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LO7/d;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b(Lp9/k;)Lp9/u;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lp9/u;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "No filter is allowed for document query"

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v6, Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Lp9/u;->e:Ljava/util/List;

    .line 18
    .line 19
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    new-instance v3, Lp9/u;

    .line 26
    .line 27
    iget-wide v8, p0, Lp9/u;->h:J

    .line 28
    .line 29
    iget v10, p0, Lp9/u;->i:I

    .line 30
    .line 31
    iget-object v4, p0, Lp9/u;->f:Ls9/m;

    .line 32
    .line 33
    iget-object v5, p0, Lp9/u;->g:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v7, p0, Lp9/u;->a:Ljava/util/List;

    .line 36
    .line 37
    iget-object v11, p0, Lp9/u;->j:Lp9/c;

    .line 38
    .line 39
    iget-object v12, p0, Lp9/u;->k:Lp9/c;

    .line 40
    .line 41
    invoke-direct/range {v3 .. v12}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 42
    .line 43
    .line 44
    return-object v3
.end method

.method public final c()Ljava/util/TreeSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp9/u;->e:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lp9/k;

    .line 23
    .line 24
    invoke-virtual {v2}, Lp9/k;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lp9/j;

    .line 43
    .line 44
    invoke-virtual {v3}, Lp9/j;->f()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget-object v3, v3, Lp9/j;->c:Ls9/j;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    return-object v0
.end method

.method public final declared-synchronized d()Ljava/util/List;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp9/u;->b:Ljava/util/List;

    .line 3
    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lp9/u;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lp9/t;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Lp9/t;->b:Ls9/j;

    .line 38
    .line 39
    invoke-virtual {v3}, Ls9/j;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_4

    .line 49
    :cond_0
    iget-object v2, p0, Lp9/u;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v3, 0x1

    .line 56
    if-lez v2, :cond_1

    .line 57
    .line 58
    iget-object v2, p0, Lp9/u;->a:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    sub-int/2addr v4, v3

    .line 65
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lp9/t;

    .line 70
    .line 71
    iget v2, v2, Lp9/t;->a:I

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v2, v3

    .line 75
    :goto_1
    invoke-virtual {p0}, Lp9/u;->c()Ljava/util/TreeSet;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ls9/j;

    .line 94
    .line 95
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_2

    .line 104
    .line 105
    sget-object v6, Ls9/j;->b:Ls9/j;

    .line 106
    .line 107
    invoke-virtual {v5, v6}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_2

    .line 112
    .line 113
    new-instance v6, Lp9/t;

    .line 114
    .line 115
    invoke-direct {v6, v2, v5}, Lp9/t;-><init>(ILs9/j;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    sget-object v4, Ls9/j;->b:Ls9/j;

    .line 123
    .line 124
    invoke-virtual {v4}, Ls9/j;->c()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_5

    .line 133
    .line 134
    invoke-static {v2, v3}, LA/f;->b(II)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    sget-object v1, Lp9/u;->l:Lp9/t;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    sget-object v1, Lp9/u;->m:Lp9/t;

    .line 144
    .line 145
    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, p0, Lp9/u;->b:Ljava/util/List;

    .line 153
    .line 154
    :cond_6
    iget-object v0, p0, Lp9/u;->b:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    monitor-exit p0

    .line 157
    return-object v0

    .line 158
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    throw v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp9/u;->f:Ls9/m;

    .line 2
    .line 3
    invoke-static {v0}, Ls9/h;->e(Ls9/m;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lp9/u;->g:Ljava/lang/String;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lp9/u;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, Lp9/u;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lp9/u;

    .line 17
    .line 18
    iget v0, p0, Lp9/u;->i:I

    .line 19
    .line 20
    iget v1, p1, Lp9/u;->i:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    invoke-virtual {p0}, Lp9/u;->i()Lp9/A;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Lp9/u;->i()Lp9/A;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lp9/A;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 39
    return p1
.end method

.method public final f(J)Lp9/u;
    .locals 10

    .line 1
    new-instance v0, Lp9/u;

    .line 2
    .line 3
    iget-object v3, p0, Lp9/u;->e:Ljava/util/List;

    .line 4
    .line 5
    iget-object v4, p0, Lp9/u;->a:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, Lp9/u;->f:Ls9/m;

    .line 8
    .line 9
    iget-object v2, p0, Lp9/u;->g:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object v8, p0, Lp9/u;->j:Lp9/c;

    .line 13
    .line 14
    iget-object v9, p0, Lp9/u;->k:Lp9/c;

    .line 15
    .line 16
    move-wide v5, p1

    .line 17
    invoke-direct/range {v0 .. v9}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final g(Ls9/k;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ls9/k;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_c

    .line 7
    .line 8
    iget-object v0, p1, Ls9/k;->a:Ls9/h;

    .line 9
    .line 10
    iget-object v0, v0, Ls9/h;->a:Ls9/m;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, p0, Lp9/u;->f:Ls9/m;

    .line 14
    .line 15
    iget-object v4, p0, Lp9/u;->g:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v5, v0, Ls9/e;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v6, 0x2

    .line 26
    if-lt v5, v6, :cond_0

    .line 27
    .line 28
    iget-object v5, v0, Ls9/e;->a:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v6, v5}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Ls9/e;->i(Ls9/e;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    :goto_0
    move v0, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move v0, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v3}, Ls9/h;->e(Ls9/m;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v3, v0}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v3, v0}, Ls9/e;->i(Ls9/e;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    iget-object v3, v3, Ls9/e;->a:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iget-object v0, v0, Ls9/e;->a:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sub-int/2addr v0, v2

    .line 82
    if-ne v3, v0, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :goto_1
    if-eqz v0, :cond_c

    .line 86
    .line 87
    invoke-virtual {p0}, Lp9/u;->d()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Lp9/t;

    .line 106
    .line 107
    iget-object v4, v3, Lp9/t;->b:Ls9/j;

    .line 108
    .line 109
    sget-object v5, Ls9/j;->b:Ls9/j;

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_3

    .line 116
    .line 117
    iget-object v4, p1, Ls9/k;->e:Ls9/l;

    .line 118
    .line 119
    iget-object v3, v3, Lp9/t;->b:Ls9/j;

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-nez v3, :cond_3

    .line 126
    .line 127
    move v0, v1

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    move v0, v2

    .line 130
    :goto_2
    if-eqz v0, :cond_c

    .line 131
    .line 132
    iget-object v0, p0, Lp9/u;->e:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_6

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, Lp9/k;

    .line 149
    .line 150
    invoke-virtual {v3, p1}, Lp9/k;->d(Ls9/k;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_5

    .line 155
    .line 156
    move v0, v1

    .line 157
    goto :goto_3

    .line 158
    :cond_6
    move v0, v2

    .line 159
    :goto_3
    if-eqz v0, :cond_c

    .line 160
    .line 161
    iget-object v0, p0, Lp9/u;->j:Lp9/c;

    .line 162
    .line 163
    if-eqz v0, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0}, Lp9/u;->d()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v0, v3, p1}, Lp9/c;->a(Ljava/util/List;Ls9/k;)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    iget-boolean v0, v0, Lp9/c;->a:Z

    .line 174
    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    if-gtz v3, :cond_8

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    if-gez v3, :cond_8

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_8
    move p1, v1

    .line 184
    goto :goto_6

    .line 185
    :cond_9
    :goto_4
    iget-object v0, p0, Lp9/u;->k:Lp9/c;

    .line 186
    .line 187
    if-eqz v0, :cond_b

    .line 188
    .line 189
    invoke-virtual {p0}, Lp9/u;->d()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v0, v3, p1}, Lp9/c;->a(Ljava/util/List;Ls9/k;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iget-boolean v0, v0, Lp9/c;->a:Z

    .line 198
    .line 199
    if-eqz v0, :cond_a

    .line 200
    .line 201
    if-ltz p1, :cond_8

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    if-lez p1, :cond_8

    .line 205
    .line 206
    :cond_b
    :goto_5
    move p1, v2

    .line 207
    :goto_6
    if-eqz p1, :cond_c

    .line 208
    .line 209
    return v2

    .line 210
    :cond_c
    return v1
.end method

.method public final h()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lp9/u;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-wide v2, p0, Lp9/u;->h:J

    .line 11
    .line 12
    const-wide/16 v4, -0x1

    .line 13
    .line 14
    cmp-long v0, v2, v4

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lp9/u;->j:Lp9/c;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lp9/u;->k:Lp9/c;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lp9/u;->a:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x1

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lp9/t;

    .line 46
    .line 47
    iget-object v0, v0, Lp9/t;->b:Ls9/j;

    .line 48
    .line 49
    sget-object v2, Ls9/j;->b:Ls9/j;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    :cond_0
    return v3

    .line 58
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp9/u;->i()Lp9/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lp9/A;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget v1, p0, Lp9/u;->i:I

    .line 12
    .line 13
    invoke-static {v1}, LA/f;->f(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method

.method public final declared-synchronized i()Lp9/A;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lp9/u;->c:Lp9/A;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lp9/u;->d()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lp9/u;->j(Ljava/util/List;)Lp9/A;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lp9/u;->c:Lp9/A;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    iget-object v0, p0, Lp9/u;->c:Lp9/A;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-object v0

    .line 23
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method public final declared-synchronized j(Ljava/util/List;)Lp9/A;
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lp9/u;->i:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lp9/A;

    .line 8
    .line 9
    iget-object v3, p0, Lp9/u;->f:Ls9/m;

    .line 10
    .line 11
    iget-object v4, p0, Lp9/u;->g:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v5, p0, Lp9/u;->e:Ljava/util/List;

    .line 14
    .line 15
    iget-wide v7, p0, Lp9/u;->h:J

    .line 16
    .line 17
    iget-object v9, p0, Lp9/u;->j:Lp9/c;

    .line 18
    .line 19
    iget-object v10, p0, Lp9/u;->k:Lp9/c;

    .line 20
    .line 21
    move-object v6, p1

    .line 22
    invoke-direct/range {v2 .. v10}, Lp9/A;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLp9/c;Lp9/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v2

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    move-object v6, p1

    .line 31
    :try_start_1
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lp9/t;

    .line 51
    .line 52
    iget v3, v2, Lp9/t;->a:I

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    if-ne v3, v4, :cond_1

    .line 56
    .line 57
    move v4, v1

    .line 58
    :cond_1
    iget-object v2, v2, Lp9/t;->b:Ls9/j;

    .line 59
    .line 60
    new-instance v3, Lp9/t;

    .line 61
    .line 62
    invoke-direct {v3, v4, v2}, Lp9/t;-><init>(ILs9/j;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget-object v0, p0, Lp9/u;->k:Lp9/c;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    new-instance v2, Lp9/c;

    .line 75
    .line 76
    iget-object v3, v0, Lp9/c;->b:Ljava/lang/Object;

    .line 77
    .line 78
    iget-boolean v0, v0, Lp9/c;->a:Z

    .line 79
    .line 80
    invoke-direct {v2, v3, v0}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 81
    .line 82
    .line 83
    move-object v9, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move-object v9, v1

    .line 86
    :goto_1
    iget-object v0, p0, Lp9/u;->j:Lp9/c;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    new-instance v1, Lp9/c;

    .line 91
    .line 92
    iget-object v2, v0, Lp9/c;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iget-boolean v0, v0, Lp9/c;->a:Z

    .line 95
    .line 96
    invoke-direct {v1, v2, v0}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 97
    .line 98
    .line 99
    :cond_4
    move-object v10, v1

    .line 100
    new-instance v2, Lp9/A;

    .line 101
    .line 102
    iget-object v3, p0, Lp9/u;->f:Ls9/m;

    .line 103
    .line 104
    iget-object v4, p0, Lp9/u;->g:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v5, p0, Lp9/u;->e:Ljava/util/List;

    .line 107
    .line 108
    iget-wide v7, p0, Lp9/u;->h:J

    .line 109
    .line 110
    move-object v6, p1

    .line 111
    invoke-direct/range {v2 .. v10}, Lp9/A;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLp9/c;Lp9/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    monitor-exit p0

    .line 115
    return-object v2

    .line 116
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Query(target="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lp9/u;->i()Lp9/A;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lp9/A;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ";limitType="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget v1, p0, Lp9/u;->i:I

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    const-string v1, "LIMIT_TO_LAST"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    throw v0

    .line 37
    :cond_1
    const-string v1, "LIMIT_TO_FIRST"

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ")"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method
