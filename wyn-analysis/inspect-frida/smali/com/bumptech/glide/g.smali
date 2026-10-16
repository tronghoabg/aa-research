.class public final Lcom/bumptech/glide/g;
.super LU4/a;
.source "SourceFile"


# instance fields
.field public final q:Landroid/content/Context;

.field public final r:Lcom/bumptech/glide/h;

.field public final s:Ljava/lang/Class;

.field public final t:Lcom/bumptech/glide/c;

.field public u:Lcom/bumptech/glide/a;

.field public v:Ljava/lang/Object;

.field public w:Ljava/util/ArrayList;

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU4/c;

    .line 2
    .line 3
    invoke-direct {v0}, LU4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LE4/m;->c:LE4/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LU4/a;->d(LE4/m;)LU4/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LU4/c;

    .line 13
    .line 14
    invoke-virtual {v0}, LU4/a;->h()LU4/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LU4/c;

    .line 19
    .line 20
    invoke-virtual {v0}, LU4/a;->m()LU4/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LU4/c;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LU4/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/bumptech/glide/g;->r:Lcom/bumptech/glide/h;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/bumptech/glide/g;->s:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/bumptech/glide/g;->q:Landroid/content/Context;

    .line 9
    .line 10
    iget-object p4, p2, Lcom/bumptech/glide/h;->a:Lcom/bumptech/glide/b;

    .line 11
    .line 12
    iget-object p4, p4, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/c;

    .line 13
    .line 14
    iget-object p4, p4, Lcom/bumptech/glide/c;->e:Lx/e;

    .line 15
    .line 16
    invoke-virtual {p4, p3}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/bumptech/glide/a;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p4}, Lx/e;->entrySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    check-cast p4, Landroidx/datastore/preferences/protobuf/i0;

    .line 29
    .line 30
    invoke-virtual {p4}, Landroidx/datastore/preferences/protobuf/i0;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/bumptech/glide/a;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    if-nez v0, :cond_2

    .line 66
    .line 67
    sget-object v0, Lcom/bumptech/glide/c;->i:Lcom/bumptech/glide/a;

    .line 68
    .line 69
    :cond_2
    iput-object v0, p0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 70
    .line 71
    iget-object p1, p1, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/c;

    .line 72
    .line 73
    iput-object p1, p0, Lcom/bumptech/glide/g;->t:Lcom/bumptech/glide/c;

    .line 74
    .line 75
    iget-object p1, p2, Lcom/bumptech/glide/h;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_5

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, LD9/j;

    .line 92
    .line 93
    if-eqz p3, :cond_3

    .line 94
    .line 95
    iget-object p4, p0, Lcom/bumptech/glide/g;->w:Ljava/util/ArrayList;

    .line 96
    .line 97
    if-nez p4, :cond_4

    .line 98
    .line 99
    new-instance p4, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object p4, p0, Lcom/bumptech/glide/g;->w:Ljava/util/ArrayList;

    .line 105
    .line 106
    :cond_4
    iget-object p4, p0, Lcom/bumptech/glide/g;->w:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    monitor-enter p2

    .line 113
    :try_start_0
    iget-object p1, p2, Lcom/bumptech/glide/h;->k:LU4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    monitor-exit p2

    .line 116
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->q(LU4/a;)Lcom/bumptech/glide/g;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_0
    move-exception p1

    .line 121
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    throw p1
.end method


# virtual methods
.method public final bridge synthetic a(LU4/a;)LU4/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->q(LU4/a;)Lcom/bumptech/glide/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final b()LU4/a;
    .locals 2

    .line 1
    invoke-super {p0}, LU4/a;->b()LU4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/bumptech/glide/g;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 14
    .line 15
    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, LU4/a;->b()LU4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/bumptech/glide/g;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 14
    .line 15
    return-object v0
.end method

.method public final q(LU4/a;)Lcom/bumptech/glide/g;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/b;->j(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, LU4/a;->a(LU4/a;)LU4/a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/bumptech/glide/g;

    .line 9
    .line 10
    return-object p1
.end method

.method public final r(LV4/a;)V
    .locals 15

    .line 1
    sget-object v14, LY4/h;->a:LY4/g;

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lgc/b;->j(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/bumptech/glide/g;->x:Z

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    new-instance v3, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/bumptech/glide/g;->u:Lcom/bumptech/glide/a;

    .line 16
    .line 17
    iget-object v9, p0, LU4/a;->c:Lcom/bumptech/glide/d;

    .line 18
    .line 19
    iget v7, p0, LU4/a;->g:I

    .line 20
    .line 21
    iget v8, p0, LU4/a;->f:I

    .line 22
    .line 23
    iget-object v4, p0, Lcom/bumptech/glide/g;->v:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v11, p0, Lcom/bumptech/glide/g;->w:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/bumptech/glide/g;->t:Lcom/bumptech/glide/c;

    .line 28
    .line 29
    iget-object v12, v2, Lcom/bumptech/glide/c;->f:LE4/o;

    .line 30
    .line 31
    iget-object v13, v0, Lcom/bumptech/glide/a;->a:LW4/a;

    .line 32
    .line 33
    new-instance v0, LU4/d;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/bumptech/glide/g;->q:Landroid/content/Context;

    .line 36
    .line 37
    iget-object v5, p0, Lcom/bumptech/glide/g;->s:Ljava/lang/Class;

    .line 38
    .line 39
    move-object v6, p0

    .line 40
    move-object/from16 v10, p1

    .line 41
    .line 42
    invoke-direct/range {v0 .. v14}, LU4/d;-><init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lcom/bumptech/glide/g;IILcom/bumptech/glide/d;LV4/a;Ljava/util/ArrayList;LE4/o;LW4/a;LY4/g;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v10, LV4/a;->c:LU4/d;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, LU4/d;->f(LU4/b;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iget-boolean v2, p0, LU4/a;->e:Z

    .line 54
    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1}, LU4/d;->e()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const-string v0, "Argument must not be null"

    .line 65
    .line 66
    invoke-static {v1, v0}, Lgc/b;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, LU4/d;->g()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {v1}, LU4/d;->a()V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void

    .line 79
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/g;->r:Lcom/bumptech/glide/h;

    .line 80
    .line 81
    invoke-virtual {v1, v10}, Lcom/bumptech/glide/h;->c(LV4/a;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, v10, LV4/a;->c:LU4/d;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/bumptech/glide/g;->r:Lcom/bumptech/glide/h;

    .line 87
    .line 88
    monitor-enter v1

    .line 89
    :try_start_0
    iget-object v2, v1, Lcom/bumptech/glide/h;->f:LR4/k;

    .line 90
    .line 91
    iget-object v2, v2, LR4/k;->a:Ljava/util/Set;

    .line 92
    .line 93
    invoke-interface {v2, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-object v2, v1, Lcom/bumptech/glide/h;->d:LE5/b;

    .line 97
    .line 98
    iget-object v3, v2, LE5/b;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Ljava/util/Set;

    .line 101
    .line 102
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    iget-boolean v3, v2, LE5/b;->b:Z

    .line 106
    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v0}, LU4/d;->a()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {v0}, LU4/d;->c()V

    .line 114
    .line 115
    .line 116
    const-string v3, "RequestTracker"

    .line 117
    .line 118
    const/4 v4, 0x2

    .line 119
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_4

    .line 124
    .line 125
    const-string v4, "Paused, delaying request"

    .line 126
    .line 127
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-object v2, v2, LE5/b;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    :goto_1
    monitor-exit v1

    .line 138
    return-void

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    throw v0

    .line 142
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string v1, "You must call #load() before calling #into()"

    .line 145
    .line 146
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
.end method
