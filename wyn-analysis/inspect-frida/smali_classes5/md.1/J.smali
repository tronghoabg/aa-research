.class public final Lmd/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/b;
.implements Lb0/a;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 2
    new-instance p1, Lae/b;

    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lad/I;

    const/16 v1, 0xa

    .line 5
    invoke-direct {v0, v1}, Lad/I;-><init>(I)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 9
    iput-object v0, p0, Lmd/J;->c:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lmd/J;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    iput-object p2, p0, Lmd/J;->b:Ljava/lang/Object;

    iput-object p3, p0, Lmd/J;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ls9/l;Lt9/f;Ljava/util/List;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, Lmd/J;->a:Ljava/lang/Object;

    return-void
.end method

.method public static varargs r(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static s(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lmd/J;
    .locals 1

    .line 1
    new-instance v0, Lmd/J;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Lmd/J;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public a(IILjava/lang/String;)Ljava/util/HashMap;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v6, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v7, 0x1

    .line 9
    new-array v3, v7, [Ljava/lang/String;

    .line 10
    .line 11
    new-array v4, v7, [Ljava/lang/String;

    .line 12
    .line 13
    new-array v2, v7, [I

    .line 14
    .line 15
    new-instance v5, Lw9/f;

    .line 16
    .line 17
    invoke-direct {v5}, Lw9/f;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lmd/J;->a:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v8, v0

    .line 23
    check-cast v8, Lr9/K;

    .line 24
    .line 25
    const-string v0, "SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?"

    .line 26
    .line 27
    invoke-virtual {v8, v0}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    iget-object v11, v1, Lmd/J;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v11, Ljava/lang/String;

    .line 42
    .line 43
    const/4 v12, 0x4

    .line 44
    new-array v13, v12, [Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    aput-object v11, v13, v14

    .line 48
    .line 49
    aput-object p3, v13, v7

    .line 50
    .line 51
    const/4 v11, 0x2

    .line 52
    aput-object v0, v13, v11

    .line 53
    .line 54
    const/4 v15, 0x3

    .line 55
    aput-object v10, v13, v15

    .line 56
    .line 57
    invoke-virtual {v9, v13}, Lne/a;->b([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lr9/B;

    .line 61
    .line 62
    invoke-direct/range {v0 .. v6}, Lr9/B;-><init>(Lmd/J;[I[Ljava/lang/String;[Ljava/lang/String;Lw9/f;Ljava/util/HashMap;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, v0}, Lne/a;->f(Lw9/g;)I

    .line 66
    .line 67
    .line 68
    aget-object v0, v3, v14

    .line 69
    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    return-object v6

    .line 73
    :cond_0
    const-string v0, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?"

    .line 74
    .line 75
    invoke-virtual {v8, v0}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    aget-object v3, v3, v14

    .line 80
    .line 81
    aget-object v4, v4, v14

    .line 82
    .line 83
    aget v2, v2, v14

    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object v8, v1, Lmd/J;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v8, Ljava/lang/String;

    .line 92
    .line 93
    const/4 v9, 0x6

    .line 94
    new-array v9, v9, [Ljava/lang/Object;

    .line 95
    .line 96
    aput-object v8, v9, v14

    .line 97
    .line 98
    aput-object p3, v9, v7

    .line 99
    .line 100
    aput-object v3, v9, v11

    .line 101
    .line 102
    aput-object v3, v9, v15

    .line 103
    .line 104
    aput-object v4, v9, v12

    .line 105
    .line 106
    const/4 v3, 0x5

    .line 107
    aput-object v2, v9, v3

    .line 108
    .line 109
    invoke-virtual {v0, v9}, Lne/a;->b([Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lne/a;->i()Landroid/database/Cursor;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_0
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_1

    .line 121
    .line 122
    invoke-virtual {v1, v5, v6, v2}, Lmd/J;->t(Lw9/f;Ljava/util/Map;Landroid/database/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :goto_1
    move-object v3, v0

    .line 127
    goto :goto_2

    .line 128
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Lw9/f;->b()V

    .line 132
    .line 133
    .line 134
    return-object v6

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto :goto_1

    .line 137
    :goto_2
    if-eqz v2, :cond_2

    .line 138
    .line 139
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    :goto_3
    throw v3
.end method

.method public b()LL0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL0/b;

    .line 4
    .line 5
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/y;

    .line 4
    .line 5
    iget-wide v0, v0, Lr0/t;->c:J

    .line 6
    .line 7
    invoke-static {v0, v1}, LBa/c;->R(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public d(Ljava/util/TreeSet;)Ljava/util/HashMap;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/util/TreeSet;->comparator()Ljava/util/Comparator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    const-string v2, "getOverlays() requires natural order"

    .line 12
    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lw9/f;

    .line 24
    .line 25
    invoke-direct {v1}, Lw9/f;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v2, Ls9/m;->b:Ls9/m;

    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ls9/h;

    .line 50
    .line 51
    invoke-virtual {v4}, Ls9/h;->d()Ls9/m;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v2, v5}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-nez v5, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v0, v1, v2, v3}, Lmd/J;->u(Ljava/util/HashMap;Lw9/f;Ls9/m;Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ls9/h;->d()Ls9/m;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v4, v4, Ls9/h;->a:Ls9/m;

    .line 72
    .line 73
    invoke-virtual {v4}, Ls9/e;->f()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {p0, v0, v1, v2, v3}, Lmd/J;->u(Ljava/util/HashMap;Lw9/f;Ls9/m;Ljava/util/ArrayList;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lw9/f;->b()V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public e(Ls9/h;)Lt9/d;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p1, Ls9/h;->a:Ls9/m;

    .line 4
    .line 5
    invoke-virtual {v2}, Ls9/e;->k()Ls9/e;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Ls9/m;

    .line 10
    .line 11
    invoke-static {v2}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object p1, p1, Ls9/h;->a:Ls9/m;

    .line 16
    .line 17
    invoke-virtual {p1}, Ls9/e;->f()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v3, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lr9/K;

    .line 24
    .line 25
    const-string v4, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Ljava/lang/String;

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    new-array v5, v5, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object v4, v5, v1

    .line 39
    .line 40
    aput-object v2, v5, v0

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    aput-object p1, v5, v2

    .line 44
    .line 45
    invoke-virtual {v3, v5}, Lne/a;->b([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lne/a;->i()Landroid/database/Cursor;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p0, v0, v1}, Lmd/J;->k(I[B)Lt9/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    return-object p1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_1
    move-exception p1

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_0
    throw v0
.end method

.method public f(I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput-object p1, v1, v0

    .line 17
    .line 18
    iget-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lr9/K;

    .line 21
    .line 22
    const-string v0, "DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?"

    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public g(ILjava/util/HashMap;)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/Map$Entry;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ls9/h;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lt9/h;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v3, v2, Ls9/h;->a:Ls9/m;

    .line 37
    .line 38
    iget-object v4, v3, Ls9/e;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    sub-int/2addr v4, v0

    .line 45
    invoke-virtual {v3, v4}, Ls9/e;->g(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v2, v2, Ls9/h;->a:Ls9/m;

    .line 50
    .line 51
    invoke-virtual {v2}, Ls9/e;->k()Ls9/e;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ls9/m;

    .line 56
    .line 57
    invoke-static {v4}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v2}, Ls9/e;->f()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget-object v6, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, La2/v;

    .line 72
    .line 73
    iget-object v6, v6, La2/v;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Lv9/o;

    .line 76
    .line 77
    invoke-virtual {v6, v1}, Lv9/o;->i(Lt9/h;)Lka/G1;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v6, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v6, Ljava/lang/String;

    .line 88
    .line 89
    const/4 v7, 0x6

    .line 90
    new-array v7, v7, [Ljava/lang/Object;

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    aput-object v6, v7, v8

    .line 94
    .line 95
    const/4 v6, 0x1

    .line 96
    aput-object v3, v7, v6

    .line 97
    .line 98
    aput-object v4, v7, v0

    .line 99
    .line 100
    const/4 v3, 0x3

    .line 101
    aput-object v2, v7, v3

    .line 102
    .line 103
    const/4 v2, 0x4

    .line 104
    aput-object v5, v7, v2

    .line 105
    .line 106
    const/4 v2, 0x5

    .line 107
    aput-object v1, v7, v2

    .line 108
    .line 109
    iget-object v1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lr9/K;

    .line 112
    .line 113
    const-string v2, "INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)"

    .line 114
    .line 115
    invoke-virtual {v1, v2, v7}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 120
    .line 121
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 122
    .line 123
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v0, "null value for key: "

    .line 126
    .line 127
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :cond_1
    return-void
.end method

.method public getLayoutDirection()LL0/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/f;

    .line 4
    .line 5
    iget-object v0, v0, LX0/E;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lt0/y;

    .line 8
    .line 9
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 10
    .line 11
    iget-object v0, v0, Lt0/t;->p:LL0/i;

    .line 12
    .line 13
    return-object v0
.end method

.method public h(Ls9/m;I)Ljava/util/HashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lw9/f;

    .line 7
    .line 8
    invoke-direct {v1}, Lw9/f;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lr9/K;

    .line 14
    .line 15
    const-string v3, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {p1}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget-object v3, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    new-array v4, v4, [Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    aput-object v3, v4, v5

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    aput-object p1, v4, v3

    .line 41
    .line 42
    const/4 p1, 0x2

    .line 43
    aput-object p2, v4, p1

    .line 44
    .line 45
    invoke-virtual {v2, v4}, Lne/a;->b([Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lne/a;->i()Landroid/database/Cursor;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0, v1, v0, p1}, Lmd/J;->t(Lw9/f;Ljava/util/Map;Landroid/database/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lw9/f;->b()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :catchall_0
    move-exception p2

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_1
    throw p2
.end method

.method public i(Lmd/N;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lmd/O;->c:Lmd/j;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move v4, v3

    .line 7
    :goto_0
    iget-object v5, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v5, [[Ljava/lang/Object;

    .line 10
    .line 11
    array-length v6, v5

    .line 12
    const/4 v7, -0x1

    .line 13
    if-ge v4, v6, :cond_1

    .line 14
    .line 15
    aget-object v5, v5, v4

    .line 16
    .line 17
    aget-object v5, v5, v3

    .line 18
    .line 19
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/2addr v4, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v4, v7

    .line 29
    :goto_1
    if-ne v4, v7, :cond_2

    .line 30
    .line 31
    iget-object v4, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, [[Ljava/lang/Object;

    .line 34
    .line 35
    array-length v4, v4

    .line 36
    add-int/2addr v4, v1

    .line 37
    new-array v5, v0, [I

    .line 38
    .line 39
    aput v0, v5, v1

    .line 40
    .line 41
    aput v4, v5, v3

    .line 42
    .line 43
    const-class v4, Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, [[Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v5, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, [[Ljava/lang/Object;

    .line 54
    .line 55
    array-length v6, v5

    .line 56
    invoke-static {v5, v3, v4, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 57
    .line 58
    .line 59
    iput-object v4, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 60
    .line 61
    array-length v4, v4

    .line 62
    sub-int/2addr v4, v1

    .line 63
    :cond_2
    iget-object v5, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v5, [[Ljava/lang/Object;

    .line 66
    .line 67
    new-array v0, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    aput-object v2, v0, v3

    .line 70
    .line 71
    aput-object p1, v0, v1

    .line 72
    .line 73
    aput-object v0, v5, v4

    .line 74
    .line 75
    return-void
.end method

.method public j()LDd/c;
    .locals 4

    .line 1
    new-instance v0, LDd/c;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lmd/b;

    .line 10
    .line 11
    iget-object v3, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, [[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3}, LDd/c;-><init>(Ljava/util/List;Lmd/b;[[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public k(I[B)Lt9/d;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p2}, Lka/G1;->v([B)Lka/G1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La2/v;

    .line 8
    .line 9
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lv9/o;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lv9/o;->c(Lka/G1;)Lt9/h;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Lt9/d;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Lt9/d;-><init>(ILt9/h;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    const-string p2, "Overlay failed to parse: %s"

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    new-array v0, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    aput-object p1, v0, v1

    .line 31
    .line 32
    invoke-static {p2, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
.end method

.method public l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lr9/k;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, p1, p2, p3, v1}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public m(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, LY0/e;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public n(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, LFe/g;->B(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public o(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lq/p;->a()Lq/p;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Lq/p;->a:Lq/O0;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Lq/O0;->g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public p(IILq/O;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 25
    .line 26
    :cond_1
    iget-object p1, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p1

    .line 29
    check-cast v4, Landroid/util/TypedValue;

    .line 30
    .line 31
    sget-object p1, La1/l;->a:Ljava/lang/ThreadLocal;

    .line 32
    .line 33
    iget-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    check-cast v2, Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_2
    const/4 v8, 0x0

    .line 47
    const/4 v7, 0x1

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, La1/l;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILa1/b;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public q(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lae/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "flutter"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/io/File;

    .line 15
    .line 16
    const-string v2, "lib"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public t(Lw9/f;Ljava/util/Map;Landroid/database/Cursor;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 3
    .line 4
    .line 5
    move-result-object v5

    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-interface {p3}, Landroid/database/Cursor;->isLast()Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    sget-object p1, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 18
    .line 19
    :cond_0
    new-instance v1, LUc/e;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    move-object v4, p0

    .line 23
    move-object v6, p2

    .line 24
    invoke-direct/range {v1 .. v6}, LUc/e;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public u(Ljava/util/HashMap;Lw9/f;Ls9/m;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_3

    .line 8
    :cond_0
    new-instance v1, LR1/q;

    .line 9
    .line 10
    iget-object v0, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p3}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    const/4 v2, 0x2

    .line 19
    new-array v2, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput-object v0, v2, v3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aput-object p3, v2, v0

    .line 26
    .line 27
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object p3, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v2, p3

    .line 34
    check-cast v2, Lr9/K;

    .line 35
    .line 36
    const-string v3, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN ("

    .line 37
    .line 38
    const-string v6, ")"

    .line 39
    .line 40
    move-object v5, p4

    .line 41
    invoke-direct/range {v1 .. v6}, LR1/q;-><init>(Lr9/K;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p3, v1, LR1/q;->f:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p3, Ljava/util/Iterator;

    .line 47
    .line 48
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-eqz p3, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, LR1/q;->w()Lne/a;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3}, Lne/a;->i()Landroid/database/Cursor;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    :goto_1
    :try_start_0
    invoke-interface {p3}, Landroid/database/Cursor;->moveToNext()Z

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    if-eqz p4, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0, p2, p1, p3}, Lmd/J;->t(Lw9/f;Ljava/util/Map;Landroid/database/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p1, v0

    .line 78
    if-eqz p3, :cond_2

    .line 79
    .line 80
    :try_start_1
    invoke-interface {p3}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_1
    move-exception v0

    .line 85
    move-object p2, v0

    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_2
    throw p1

    .line 90
    :cond_3
    :goto_3
    return-void
.end method

.method public v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lyc/b;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lyc/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public x(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "addrs is empty"

    .line 8
    .line 9
    invoke-static {v1, v0}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public y(Ls9/h;Lt9/m;)Lt9/h;
    .locals 7

    .line 1
    iget-object v0, p0, Lmd/J;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, v0

    .line 4
    check-cast v4, Lt9/f;

    .line 5
    .line 6
    if-eqz v4, :cond_0

    .line 7
    .line 8
    new-instance v1, Lt9/l;

    .line 9
    .line 10
    iget-object v0, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, Ls9/l;

    .line 14
    .line 15
    iget-object v0, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v6, v0

    .line 18
    check-cast v6, Ljava/util/List;

    .line 19
    .line 20
    move-object v2, p1

    .line 21
    move-object v5, p2

    .line 22
    invoke-direct/range {v1 .. v6}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    move-object v2, p1

    .line 27
    move-object v5, p2

    .line 28
    new-instance p1, Lt9/o;

    .line 29
    .line 30
    iget-object p2, p0, Lmd/J;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p2, Ls9/l;

    .line 33
    .line 34
    iget-object v0, p0, Lmd/J;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/List;

    .line 37
    .line 38
    invoke-direct {p1, v2, p2, v5, v0}, Lt9/o;-><init>(Ls9/h;Ls9/l;Lt9/m;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method
