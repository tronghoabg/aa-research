.class public final LD0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LD0/b;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lc8/e;

    const/16 v1, 0x13

    .line 8
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 9
    iput-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 10
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ljava/util/HashMap;-><init>(IF)V

    iput-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LD0/b;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IILjava/util/Map;Lt0/r;Ltf/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LD0/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LD0/b;->d:I

    iput-object p4, p0, LD0/b;->f:Ljava/lang/Object;

    check-cast p5, Lkotlin/jvm/internal/n;

    iput-object p5, p0, LD0/b;->g:Ljava/lang/Object;

    .line 3
    iput p1, p0, LD0/b;->b:I

    .line 4
    iput p2, p0, LD0/b;->c:I

    .line 5
    iput-object p3, p0, LD0/b;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly1/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LD0/b;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 13
    iput v0, p0, LD0/b;->b:I

    .line 14
    iput-object p1, p0, LD0/b;->e:Ljava/lang/Object;

    .line 15
    iput-object p1, p0, LD0/b;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 4

    .line 1
    iget-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly1/l;

    .line 4
    .line 5
    iget-object v0, v0, Ly1/l;->a:Landroid/util/SparseArray;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ly1/l;

    .line 16
    .line 17
    :goto_0
    iget v1, p0, LD0/b;->b:I

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x2

    .line 21
    if-eq v1, v3, :cond_2

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, LD0/b;->f()V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    iput v3, p0, LD0/b;->b:I

    .line 30
    .line 31
    iput-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 32
    .line 33
    iput v2, p0, LD0/b;->d:I

    .line 34
    .line 35
    :goto_1
    move v2, v3

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iput-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 40
    .line 41
    iget v0, p0, LD0/b;->d:I

    .line 42
    .line 43
    add-int/2addr v0, v2

    .line 44
    iput v0, p0, LD0/b;->d:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const v0, 0xfe0e

    .line 48
    .line 49
    .line 50
    if-ne p1, v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, LD0/b;->f()V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    const v0, 0xfe0f

    .line 57
    .line 58
    .line 59
    if-ne p1, v0, :cond_5

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    iget-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ly1/l;

    .line 65
    .line 66
    iget-object v1, v0, Ly1/l;->b:Ly1/i;

    .line 67
    .line 68
    if-eqz v1, :cond_8

    .line 69
    .line 70
    iget v1, p0, LD0/b;->d:I

    .line 71
    .line 72
    const/4 v3, 0x3

    .line 73
    if-ne v1, v2, :cond_7

    .line 74
    .line 75
    invoke-virtual {p0}, LD0/b;->g()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    iget-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ly1/l;

    .line 84
    .line 85
    iput-object v0, p0, LD0/b;->g:Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {p0}, LD0/b;->f()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_6
    invoke-virtual {p0}, LD0/b;->f()V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_7
    iput-object v0, p0, LD0/b;->g:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {p0}, LD0/b;->f()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_8
    invoke-virtual {p0}, LD0/b;->f()V

    .line 102
    .line 103
    .line 104
    :goto_2
    iput p1, p0, LD0/b;->c:I

    .line 105
    .line 106
    return v2
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/e;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, LD0/b;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, LD0/b;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget p1, p0, LD0/b;->c:I

    .line 31
    .line 32
    add-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    iput p1, p0, LD0/b;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-object v1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    :try_start_1
    iget p1, p0, LD0/b;->d:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput p1, p0, LD0/b;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit v0

    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1

    .line 49
    :goto_0
    monitor-exit v0

    .line 50
    throw p1
.end method

.method public c()V
    .locals 5

    .line 1
    sget-object v0, Lr0/s;->a:Lr0/s;

    .line 2
    .line 3
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lt0/r;

    .line 6
    .line 7
    iget-object v1, v1, Lt0/r;->a:Lt0/t;

    .line 8
    .line 9
    iget-object v1, v1, Lt0/t;->p:LL0/i;

    .line 10
    .line 11
    sget v2, Lr0/s;->c:I

    .line 12
    .line 13
    sget-object v3, Lr0/s;->b:LL0/i;

    .line 14
    .line 15
    iget v4, p0, LD0/b;->d:I

    .line 16
    .line 17
    sput v4, Lr0/s;->c:I

    .line 18
    .line 19
    sput-object v1, Lr0/s;->b:LL0/i;

    .line 20
    .line 21
    iget-object v1, p0, LD0/b;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sput v2, Lr0/s;->c:I

    .line 29
    .line 30
    sput-object v3, Lr0/s;->b:LL0/i;

    .line 31
    .line 32
    return-void
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lc8/e;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, LD0/b;->h()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    iput v1, p0, LD0/b;->b:I

    .line 15
    .line 16
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, LD0/b;->h()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    iput v1, p0, LD0/b;->b:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    iget-object v1, p0, LD0/b;->g:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, LD0/b;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v1, p0, LD0/b;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v0

    .line 62
    invoke-virtual {p0}, LD0/b;->i()V

    .line 63
    .line 64
    .line 65
    return-object p2

    .line 66
    :goto_1
    monitor-exit v0

    .line 67
    throw p1

    .line 68
    :cond_2
    const/4 p1, 0x0

    .line 69
    throw p1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/e;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, LD0/b;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, LD0/b;->h()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    iput p1, p0, LD0/b;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw p1
.end method

.method public f()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, LD0/b;->b:I

    .line 3
    .line 4
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ly1/l;

    .line 7
    .line 8
    iput-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, LD0/b;->d:I

    .line 12
    .line 13
    return-void
.end method

.method public g()Z
    .locals 4

    .line 1
    iget-object v0, p0, LD0/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly1/l;

    .line 4
    .line 5
    iget-object v0, v0, Ly1/l;->b:Ly1/i;

    .line 6
    .line 7
    invoke-virtual {v0}, Ly1/i;->b()Lz1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-virtual {v0, v1}, Lgf/e;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lgf/e;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget v0, v0, Lgf/e;->a:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    iget v0, p0, LD0/b;->c:I

    .line 34
    .line 35
    const v1, 0xfe0f

    .line 36
    .line 37
    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    return v0
.end method

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/e;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget v1, p0, LD0/b;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    monitor-exit v0

    .line 12
    throw v1
.end method

.method public i()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, LD0/b;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/e;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {p0}, LD0/b;->h()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ltz v1, :cond_4

    .line 11
    .line 12
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, LD0/b;->h()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_4

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    :goto_1
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, LD0/b;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ne v1, v2, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, LD0/b;->h()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/16 v2, 0x10

    .line 55
    .line 56
    if-le v1, v2, :cond_2

    .line 57
    .line 58
    iget-object v1, p0, LD0/b;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_2

    .line 67
    .line 68
    iget-object v1, p0, LD0/b;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    invoke-static {v1}, Lff/o;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, p0, LD0/b;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    iget-object v3, p0, LD0/b;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-static {v3}, Lkotlin/jvm/internal/K;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, LD0/b;->g:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    invoke-static {v3}, Lkotlin/jvm/internal/K;->a(Ljava/util/LinkedHashSet;)Ljava/util/Collection;

    .line 102
    .line 103
    .line 104
    invoke-interface {v3, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, LD0/b;->h()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v3, v3, -0x1

    .line 115
    .line 116
    iput v3, p0, LD0/b;->b:I

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    const-string v2, "inconsistent state"

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    :cond_2
    const/4 v1, 0x0

    .line 128
    move-object v2, v1

    .line 129
    :goto_2
    monitor-exit v0

    .line 130
    if-nez v1, :cond_3

    .line 131
    .line 132
    if-nez v2, :cond_3

    .line 133
    .line 134
    return-void

    .line 135
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_0

    .line 142
    .line 143
    :cond_4
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v2, "map/keySet size inconsistency"

    .line 146
    .line 147
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    :goto_3
    monitor-exit v0

    .line 152
    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LD0/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "LruCache[maxSize=16,hits="

    .line 12
    .line 13
    iget-object v1, p0, LD0/b;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lc8/e;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget v2, p0, LD0/b;->c:I

    .line 19
    .line 20
    iget v3, p0, LD0/b;->d:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x64

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, LD0/b;->c:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ",misses="

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, LD0/b;->d:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ",hitRate="

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, "%]"

    .line 61
    .line 62
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit v1

    .line 70
    return-object v0

    .line 71
    :goto_1
    monitor-exit v1

    .line 72
    throw v0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
