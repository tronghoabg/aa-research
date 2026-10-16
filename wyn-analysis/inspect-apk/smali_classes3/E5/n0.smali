.class public final LE5/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, LE5/n0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [Lc8/t;

    iput-object v1, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 3
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 4
    new-array v1, v0, [Landroid/graphics/Matrix;

    iput-object v1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 5
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 6
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 7
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LE5/n0;->i:Ljava/lang/Object;

    .line 8
    new-instance v1, Lc8/t;

    invoke-direct {v1}, Lc8/t;-><init>()V

    iput-object v1, p0, LE5/n0;->j:Ljava/lang/Object;

    const/4 v1, 0x2

    .line 9
    new-array v2, v1, [F

    iput-object v2, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 10
    new-array v1, v1, [F

    iput-object v1, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 11
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 12
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, LE5/n0;->m:Ljava/lang/Object;

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, LE5/n0;->g:Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    iget-object v2, p0, LE5/n0;->h:Ljava/lang/Object;

    check-cast v2, [Lc8/t;

    new-instance v3, Lc8/t;

    invoke-direct {v3}, Lc8/t;-><init>()V

    aput-object v3, v2, v1

    .line 15
    iget-object v2, p0, LE5/n0;->b:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    .line 16
    iget-object v2, p0, LE5/n0;->c:Ljava/lang/Object;

    check-cast v2, [Landroid/graphics/Matrix;

    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(LE5/O;LF5/f;Landroid/os/Handler;LF5/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE5/n0;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p4, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 19
    iput-object p1, p0, LE5/n0;->i:Ljava/lang/Object;

    .line 20
    new-instance p1, Lf6/X;

    invoke-direct {p1}, Lf6/X;-><init>()V

    iput-object p1, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 24
    new-instance p1, LI5/f;

    const/4 p4, 0x1

    invoke-direct {p1, p4}, LI5/f;-><init>(I)V

    iput-object p1, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 25
    new-instance p4, LI5/f;

    const/4 v0, 0x0

    invoke-direct {p4, v0}, LI5/f;-><init>(I)V

    iput-object p4, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance v0, Lf6/C;

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p3, v0, Lf6/C;->a:Landroid/os/Handler;

    .line 32
    iput-object p2, v0, Lf6/C;->b:Ljava/lang/Object;

    .line 33
    iget-object p1, p1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance p1, LI5/e;

    .line 35
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p1, LI5/e;->a:Ljava/lang/Object;

    .line 37
    iget-object p2, p4, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(LU1/z;LV1/d;LQ1/s;LV1/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE5/n0;->a:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p4, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 40
    iput-object p1, p0, LE5/n0;->i:Ljava/lang/Object;

    .line 41
    new-instance p1, Lk2/g0;

    invoke-direct {p1}, Lk2/g0;-><init>()V

    iput-object p1, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 42
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 43
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 45
    iput-object p2, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 46
    iput-object p3, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 47
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 48
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LE5/n0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls9/f;Lad/L;Lr9/l;Lv9/g;Lw9/e;LVa/Y7;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, LE5/n0;->a:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p0, LE5/n0;->g:Z

    .line 51
    iput-object p1, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 52
    iput-object p2, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 53
    iput-object p3, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 54
    iput-object p4, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 55
    iput-object p6, p0, LE5/n0;->i:Ljava/lang/Object;

    .line 56
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 57
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 58
    new-instance p1, Lio/flutter/plugin/platform/x;

    .line 59
    new-instance p3, Lo1/c;

    const/16 v0, 0x8

    invoke-direct {p3, p2, v0}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p5, p1, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 62
    iput-object p3, p1, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 63
    iput p2, p1, Lio/flutter/plugin/platform/x;->a:I

    .line 64
    iput-boolean p2, p1, Lio/flutter/plugin/platform/x;->c:Z

    .line 65
    iput-object p1, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 66
    new-instance p1, Lv9/p;

    invoke-direct {p1, p0}, Lv9/p;-><init>(LE5/n0;)V

    .line 67
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    new-instance p2, Lv9/A;

    iget-object p3, p4, Lv9/g;->b:Lw9/e;

    iget-object v0, p4, Lv9/g;->a:Lv9/o;

    iget-object v1, p4, Lv9/g;->c:Lv9/m;

    invoke-direct {p2, v1, p3, v0, p1}, Lv9/A;-><init>(Lv9/m;Lw9/e;Lv9/o;Lv9/p;)V

    .line 69
    iput-object p2, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 70
    new-instance p1, Lv9/q;

    invoke-direct {p1, p0}, Lv9/q;-><init>(LE5/n0;)V

    .line 71
    new-instance p2, Lv9/B;

    iget-object p3, p4, Lv9/g;->b:Lw9/e;

    iget-object v0, p4, Lv9/g;->a:Lv9/o;

    iget-object p4, p4, Lv9/g;->c:Lv9/m;

    invoke-direct {p2, p4, p3, v0, p1}, Lv9/B;-><init>(Lv9/m;Lw9/e;Lv9/o;Lv9/q;)V

    .line 72
    iput-object p2, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 73
    new-instance p1, Lr9/E;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0, p5}, Lr9/E;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 74
    iget-object p2, p6, LVa/Y7;->d:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    monitor-enter p2

    .line 75
    :try_start_0
    iget-object p3, p6, LVa/Y7;->d:Ljava/lang/Object;

    check-cast p3, Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(ILjava/util/ArrayList;Lf6/X;)LE5/J0;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iput-object p3, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    move p3, p1

    .line 10
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p1

    .line 15
    if-ge p3, v0, :cond_4

    .line 16
    .line 17
    sub-int v0, p3, p1

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LE5/m0;

    .line 24
    .line 25
    iget-object v1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, p3, -0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, LE5/m0;

    .line 39
    .line 40
    iget-object v4, v3, LE5/m0;->a:Lf6/t;

    .line 41
    .line 42
    iget-object v4, v4, Lf6/t;->o:Lf6/r;

    .line 43
    .line 44
    iget v3, v3, LE5/m0;->d:I

    .line 45
    .line 46
    iget-object v4, v4, Lf6/n;->b:LE5/J0;

    .line 47
    .line 48
    invoke-virtual {v4}, LE5/J0;->o()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    iput v4, v0, LE5/m0;->d:I

    .line 54
    .line 55
    iput-boolean v2, v0, LE5/m0;->e:Z

    .line 56
    .line 57
    iget-object v2, v0, LE5/m0;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iput v2, v0, LE5/m0;->d:I

    .line 64
    .line 65
    iput-boolean v2, v0, LE5/m0;->e:Z

    .line 66
    .line 67
    iget-object v2, v0, LE5/m0;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget-object v2, v0, LE5/m0;->a:Lf6/t;

    .line 73
    .line 74
    iget-object v2, v2, Lf6/t;->o:Lf6/r;

    .line 75
    .line 76
    iget-object v2, v2, Lf6/n;->b:LE5/J0;

    .line 77
    .line 78
    invoke-virtual {v2}, LE5/J0;->o()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v3, p3

    .line 83
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, LE5/m0;

    .line 94
    .line 95
    iget v5, v4, LE5/m0;->d:I

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, v4, LE5/m0;->d:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v1, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v2, v0, LE5/m0;->b:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-boolean v1, p0, LE5/n0;->g:Z

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0, v0}, LE5/n0;->n(LE5/m0;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_2

    .line 131
    .line 132
    iget-object v1, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    iget-object v1, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, LE5/l0;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    iget-object v1, v0, LE5/l0;->b:LE5/k0;

    .line 153
    .line 154
    iget-object v0, v0, LE5/l0;->a:Lf6/a;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lf6/a;->b(Lf6/A;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, LE5/n0;->d()LE5/J0;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1
.end method

.method public b(ILjava/util/ArrayList;Lk2/g0;)LN1/N;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iput-object p3, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    move p3, p1

    .line 10
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p1

    .line 15
    if-ge p3, v0, :cond_4

    .line 16
    .line 17
    sub-int v0, p3, p1

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LU1/O;

    .line 24
    .line 25
    iget-object v1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-lez p3, :cond_0

    .line 31
    .line 32
    add-int/lit8 v3, p3, -0x1

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, LU1/O;

    .line 39
    .line 40
    iget-object v4, v3, LU1/O;->a:Lk2/D;

    .line 41
    .line 42
    iget-object v4, v4, Lk2/D;->o:Lk2/B;

    .line 43
    .line 44
    iget v3, v3, LU1/O;->d:I

    .line 45
    .line 46
    iget-object v4, v4, Lk2/x;->b:LN1/N;

    .line 47
    .line 48
    invoke-virtual {v4}, LN1/N;->o()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    iput v4, v0, LU1/O;->d:I

    .line 54
    .line 55
    iput-boolean v2, v0, LU1/O;->e:Z

    .line 56
    .line 57
    iget-object v2, v0, LU1/O;->c:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iput v2, v0, LU1/O;->d:I

    .line 64
    .line 65
    iput-boolean v2, v0, LU1/O;->e:Z

    .line 66
    .line 67
    iget-object v2, v0, LU1/O;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    iget-object v2, v0, LU1/O;->a:Lk2/D;

    .line 73
    .line 74
    iget-object v2, v2, Lk2/D;->o:Lk2/B;

    .line 75
    .line 76
    iget-object v2, v2, Lk2/x;->b:LN1/N;

    .line 77
    .line 78
    invoke-virtual {v2}, LN1/N;->o()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v3, p3

    .line 83
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, LU1/O;

    .line 94
    .line 95
    iget v5, v4, LU1/O;->d:I

    .line 96
    .line 97
    add-int/2addr v5, v2

    .line 98
    iput v5, v4, LU1/O;->d:I

    .line 99
    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    invoke-virtual {v1, p3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v2, v0, LU1/O;->b:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-boolean v1, p0, LE5/n0;->g:Z

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    invoke-virtual {p0, v0}, LE5/n0;->o(LU1/O;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v1, Ljava/util/IdentityHashMap;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_2

    .line 131
    .line 132
    iget-object v1, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, Ljava/util/HashSet;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_2
    iget-object v1, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, LU1/N;

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    iget-object v1, v0, LU1/N;->b:LU1/I;

    .line 153
    .line 154
    iget-object v0, v0, LU1/N;->a:Lk2/a;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lk2/a;->c(Lk2/I;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    :goto_3
    add-int/lit8 p3, p3, 0x1

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_4
    invoke-virtual {p0}, LE5/n0;->e()LN1/N;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1
.end method

.method public c(Lc8/k;FLandroid/graphics/RectF;Lzg/x;Landroid/graphics/Path;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-virtual {v4}, Landroid/graphics/Path;->rewind()V

    .line 12
    .line 13
    .line 14
    iget-object v5, v0, LE5/n0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v5, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {v5}, Landroid/graphics/Path;->rewind()V

    .line 19
    .line 20
    .line 21
    iget-object v6, v0, LE5/n0;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v6, Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-virtual {v6}, Landroid/graphics/Path;->rewind()V

    .line 26
    .line 27
    .line 28
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 29
    .line 30
    invoke-virtual {v6, v2, v7}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 31
    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    :goto_0
    iget-object v9, v0, LE5/n0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v9, [Landroid/graphics/Matrix;

    .line 37
    .line 38
    iget-object v10, v0, LE5/n0;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v10, [Landroid/graphics/Matrix;

    .line 41
    .line 42
    iget-object v11, v0, LE5/n0;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v11, [Lc8/t;

    .line 45
    .line 46
    const/4 v12, 0x1

    .line 47
    const/4 v13, 0x4

    .line 48
    const/4 v14, 0x2

    .line 49
    const/4 v15, 0x3

    .line 50
    const/16 v16, 0x0

    .line 51
    .line 52
    iget-object v7, v0, LE5/n0;->k:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, [F

    .line 55
    .line 56
    if-ge v8, v13, :cond_9

    .line 57
    .line 58
    if-eq v8, v12, :cond_2

    .line 59
    .line 60
    if-eq v8, v14, :cond_1

    .line 61
    .line 62
    if-eq v8, v15, :cond_0

    .line 63
    .line 64
    iget-object v13, v1, Lc8/k;->f:Lc8/c;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    iget-object v13, v1, Lc8/k;->e:Lc8/c;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-object v13, v1, Lc8/k;->h:Lc8/c;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object v13, v1, Lc8/k;->g:Lc8/c;

    .line 74
    .line 75
    :goto_1
    if-eq v8, v12, :cond_5

    .line 76
    .line 77
    if-eq v8, v14, :cond_4

    .line 78
    .line 79
    if-eq v8, v15, :cond_3

    .line 80
    .line 81
    iget-object v15, v1, Lc8/k;->b:LFe/e;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object v15, v1, Lc8/k;->a:LFe/e;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object v15, v1, Lc8/k;->d:LFe/e;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    iget-object v15, v1, Lc8/k;->c:LFe/e;

    .line 91
    .line 92
    :goto_2
    aget-object v14, v11, v8

    .line 93
    .line 94
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-interface {v13, v2}, Lc8/c;->a(Landroid/graphics/RectF;)F

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    move/from16 v12, p2

    .line 102
    .line 103
    invoke-virtual {v15, v14, v12, v13}, LFe/e;->E(Lc8/t;FF)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v13, v8, 0x1

    .line 107
    .line 108
    rem-int/lit8 v14, v13, 0x4

    .line 109
    .line 110
    mul-int/lit8 v14, v14, 0x5a

    .line 111
    .line 112
    int-to-float v14, v14

    .line 113
    aget-object v15, v10, v8

    .line 114
    .line 115
    invoke-virtual {v15}, Landroid/graphics/Matrix;->reset()V

    .line 116
    .line 117
    .line 118
    iget-object v15, v0, LE5/n0;->d:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v15, Landroid/graphics/PointF;

    .line 121
    .line 122
    move-object/from16 v19, v9

    .line 123
    .line 124
    const/4 v9, 0x1

    .line 125
    if-eq v8, v9, :cond_8

    .line 126
    .line 127
    const/4 v9, 0x2

    .line 128
    if-eq v8, v9, :cond_7

    .line 129
    .line 130
    const/4 v9, 0x3

    .line 131
    if-eq v8, v9, :cond_6

    .line 132
    .line 133
    iget v9, v2, Landroid/graphics/RectF;->right:F

    .line 134
    .line 135
    move/from16 v17, v8

    .line 136
    .line 137
    iget v8, v2, Landroid/graphics/RectF;->top:F

    .line 138
    .line 139
    invoke-virtual {v15, v9, v8}, Landroid/graphics/PointF;->set(FF)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move/from16 v17, v8

    .line 144
    .line 145
    iget v8, v2, Landroid/graphics/RectF;->left:F

    .line 146
    .line 147
    iget v9, v2, Landroid/graphics/RectF;->top:F

    .line 148
    .line 149
    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    move/from16 v17, v8

    .line 154
    .line 155
    iget v8, v2, Landroid/graphics/RectF;->left:F

    .line 156
    .line 157
    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    .line 158
    .line 159
    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_8
    move/from16 v17, v8

    .line 164
    .line 165
    iget v8, v2, Landroid/graphics/RectF;->right:F

    .line 166
    .line 167
    iget v9, v2, Landroid/graphics/RectF;->bottom:F

    .line 168
    .line 169
    invoke-virtual {v15, v8, v9}, Landroid/graphics/PointF;->set(FF)V

    .line 170
    .line 171
    .line 172
    :goto_3
    aget-object v8, v10, v17

    .line 173
    .line 174
    iget v9, v15, Landroid/graphics/PointF;->x:F

    .line 175
    .line 176
    iget v15, v15, Landroid/graphics/PointF;->y:F

    .line 177
    .line 178
    invoke-virtual {v8, v9, v15}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 179
    .line 180
    .line 181
    aget-object v8, v10, v17

    .line 182
    .line 183
    invoke-virtual {v8, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 184
    .line 185
    .line 186
    aget-object v8, v11, v17

    .line 187
    .line 188
    iget v9, v8, Lc8/t;->b:F

    .line 189
    .line 190
    aput v9, v7, v16

    .line 191
    .line 192
    iget v8, v8, Lc8/t;->c:F

    .line 193
    .line 194
    const/16 v18, 0x1

    .line 195
    .line 196
    aput v8, v7, v18

    .line 197
    .line 198
    aget-object v8, v10, v17

    .line 199
    .line 200
    invoke-virtual {v8, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 201
    .line 202
    .line 203
    aget-object v8, v19, v17

    .line 204
    .line 205
    invoke-virtual {v8}, Landroid/graphics/Matrix;->reset()V

    .line 206
    .line 207
    .line 208
    aget-object v8, v19, v17

    .line 209
    .line 210
    aget v9, v7, v16

    .line 211
    .line 212
    aget v7, v7, v18

    .line 213
    .line 214
    invoke-virtual {v8, v9, v7}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 215
    .line 216
    .line 217
    aget-object v7, v19, v17

    .line 218
    .line 219
    invoke-virtual {v7, v14}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 220
    .line 221
    .line 222
    move v8, v13

    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_9
    move-object/from16 v19, v9

    .line 226
    .line 227
    move/from16 v8, v16

    .line 228
    .line 229
    :goto_4
    if-ge v8, v13, :cond_13

    .line 230
    .line 231
    aget-object v9, v11, v8

    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    const/4 v12, 0x0

    .line 237
    aput v12, v7, v16

    .line 238
    .line 239
    iget v9, v9, Lc8/t;->a:F

    .line 240
    .line 241
    const/16 v18, 0x1

    .line 242
    .line 243
    aput v9, v7, v18

    .line 244
    .line 245
    aget-object v9, v10, v8

    .line 246
    .line 247
    invoke-virtual {v9, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 248
    .line 249
    .line 250
    if-nez v8, :cond_a

    .line 251
    .line 252
    aget v9, v7, v16

    .line 253
    .line 254
    aget v14, v7, v18

    .line 255
    .line 256
    invoke-virtual {v4, v9, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_a
    aget v9, v7, v16

    .line 261
    .line 262
    aget v14, v7, v18

    .line 263
    .line 264
    invoke-virtual {v4, v9, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 265
    .line 266
    .line 267
    :goto_5
    aget-object v9, v11, v8

    .line 268
    .line 269
    aget-object v14, v10, v8

    .line 270
    .line 271
    invoke-virtual {v9, v14, v4}, Lc8/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 272
    .line 273
    .line 274
    if-eqz v3, :cond_b

    .line 275
    .line 276
    aget-object v9, v11, v8

    .line 277
    .line 278
    aget-object v14, v10, v8

    .line 279
    .line 280
    iget-object v15, v3, Lzg/x;->a:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v15, Lc8/g;

    .line 283
    .line 284
    iget-object v13, v15, Lc8/g;->d:Ljava/util/BitSet;

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move/from16 p2, v12

    .line 290
    .line 291
    move/from16 v12, v16

    .line 292
    .line 293
    invoke-virtual {v13, v8, v12}, Ljava/util/BitSet;->set(IZ)V

    .line 294
    .line 295
    .line 296
    iget v12, v9, Lc8/t;->e:F

    .line 297
    .line 298
    invoke-virtual {v9, v12}, Lc8/t;->a(F)V

    .line 299
    .line 300
    .line 301
    new-instance v12, Landroid/graphics/Matrix;

    .line 302
    .line 303
    invoke-direct {v12, v14}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 304
    .line 305
    .line 306
    new-instance v13, Ljava/util/ArrayList;

    .line 307
    .line 308
    iget-object v9, v9, Lc8/t;->g:Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-direct {v13, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 311
    .line 312
    .line 313
    new-instance v9, Lc8/m;

    .line 314
    .line 315
    invoke-direct {v9, v13, v12}, Lc8/m;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 316
    .line 317
    .line 318
    iget-object v12, v15, Lc8/g;->b:[Lc8/s;

    .line 319
    .line 320
    aput-object v9, v12, v8

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_b
    move/from16 p2, v12

    .line 324
    .line 325
    :goto_6
    add-int/lit8 v12, v8, 0x1

    .line 326
    .line 327
    rem-int/lit8 v9, v12, 0x4

    .line 328
    .line 329
    aget-object v13, v11, v8

    .line 330
    .line 331
    iget v14, v13, Lc8/t;->b:F

    .line 332
    .line 333
    const/16 v16, 0x0

    .line 334
    .line 335
    aput v14, v7, v16

    .line 336
    .line 337
    iget v13, v13, Lc8/t;->c:F

    .line 338
    .line 339
    const/16 v18, 0x1

    .line 340
    .line 341
    aput v13, v7, v18

    .line 342
    .line 343
    aget-object v13, v10, v8

    .line 344
    .line 345
    invoke-virtual {v13, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 346
    .line 347
    .line 348
    aget-object v13, v11, v9

    .line 349
    .line 350
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    iget-object v14, v0, LE5/n0;->f:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v14, [F

    .line 356
    .line 357
    const/16 v16, 0x0

    .line 358
    .line 359
    aput p2, v14, v16

    .line 360
    .line 361
    iget v13, v13, Lc8/t;->a:F

    .line 362
    .line 363
    const/16 v18, 0x1

    .line 364
    .line 365
    aput v13, v14, v18

    .line 366
    .line 367
    aget-object v13, v10, v9

    .line 368
    .line 369
    invoke-virtual {v13, v14}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 370
    .line 371
    .line 372
    aget v13, v7, v16

    .line 373
    .line 374
    aget v15, v14, v16

    .line 375
    .line 376
    sub-float/2addr v13, v15

    .line 377
    move-object/from16 v20, v10

    .line 378
    .line 379
    move-object v15, v11

    .line 380
    float-to-double v10, v13

    .line 381
    aget v13, v7, v18

    .line 382
    .line 383
    aget v14, v14, v18

    .line 384
    .line 385
    sub-float/2addr v13, v14

    .line 386
    float-to-double v13, v13

    .line 387
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 388
    .line 389
    .line 390
    move-result-wide v10

    .line 391
    double-to-float v10, v10

    .line 392
    const v11, 0x3a83126f    # 0.001f

    .line 393
    .line 394
    .line 395
    sub-float/2addr v10, v11

    .line 396
    move/from16 v11, p2

    .line 397
    .line 398
    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    aget-object v11, v15, v8

    .line 403
    .line 404
    iget v13, v11, Lc8/t;->b:F

    .line 405
    .line 406
    const/16 v16, 0x0

    .line 407
    .line 408
    aput v13, v7, v16

    .line 409
    .line 410
    iget v11, v11, Lc8/t;->c:F

    .line 411
    .line 412
    const/4 v13, 0x1

    .line 413
    aput v11, v7, v13

    .line 414
    .line 415
    aget-object v11, v20, v8

    .line 416
    .line 417
    invoke-virtual {v11, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 418
    .line 419
    .line 420
    if-eq v8, v13, :cond_c

    .line 421
    .line 422
    const/4 v11, 0x3

    .line 423
    if-eq v8, v11, :cond_c

    .line 424
    .line 425
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    aget v14, v7, v13

    .line 430
    .line 431
    sub-float/2addr v11, v14

    .line 432
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 433
    .line 434
    .line 435
    goto :goto_7

    .line 436
    :cond_c
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    const/16 v16, 0x0

    .line 441
    .line 442
    aget v13, v7, v16

    .line 443
    .line 444
    sub-float/2addr v11, v13

    .line 445
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 446
    .line 447
    .line 448
    :goto_7
    const/high16 v11, 0x43870000    # 270.0f

    .line 449
    .line 450
    iget-object v13, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v13, Lc8/t;

    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    invoke-virtual {v13, v14, v11, v14}, Lc8/t;->d(FFF)V

    .line 456
    .line 457
    .line 458
    const/4 v11, 0x1

    .line 459
    if-eq v8, v11, :cond_f

    .line 460
    .line 461
    const/4 v11, 0x2

    .line 462
    if-eq v8, v11, :cond_e

    .line 463
    .line 464
    const/4 v14, 0x3

    .line 465
    if-eq v8, v14, :cond_d

    .line 466
    .line 467
    iget-object v11, v1, Lc8/k;->j:Lc8/e;

    .line 468
    .line 469
    goto :goto_8

    .line 470
    :cond_d
    iget-object v11, v1, Lc8/k;->i:Lc8/e;

    .line 471
    .line 472
    goto :goto_8

    .line 473
    :cond_e
    const/4 v14, 0x3

    .line 474
    iget-object v11, v1, Lc8/k;->l:Lc8/e;

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_f
    const/4 v14, 0x3

    .line 478
    iget-object v11, v1, Lc8/k;->k:Lc8/e;

    .line 479
    .line 480
    :goto_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    const/4 v11, 0x0

    .line 484
    invoke-virtual {v13, v10, v11}, Lc8/t;->c(FF)V

    .line 485
    .line 486
    .line 487
    iget-object v10, v0, LE5/n0;->l:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v10, Landroid/graphics/Path;

    .line 490
    .line 491
    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    .line 492
    .line 493
    .line 494
    aget-object v11, v19, v8

    .line 495
    .line 496
    invoke-virtual {v13, v11, v10}, Lc8/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 497
    .line 498
    .line 499
    iget-boolean v11, v0, LE5/n0;->g:Z

    .line 500
    .line 501
    if-eqz v11, :cond_10

    .line 502
    .line 503
    invoke-virtual {v0, v10, v8}, LE5/n0;->m(Landroid/graphics/Path;I)Z

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    if-nez v11, :cond_11

    .line 508
    .line 509
    invoke-virtual {v0, v10, v9}, LE5/n0;->m(Landroid/graphics/Path;I)Z

    .line 510
    .line 511
    .line 512
    move-result v9

    .line 513
    if-eqz v9, :cond_10

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_10
    const/16 v18, 0x1

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_11
    :goto_9
    sget-object v9, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 520
    .line 521
    invoke-virtual {v10, v10, v6, v9}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 522
    .line 523
    .line 524
    const/4 v11, 0x0

    .line 525
    const/16 v16, 0x0

    .line 526
    .line 527
    aput v11, v7, v16

    .line 528
    .line 529
    iget v9, v13, Lc8/t;->a:F

    .line 530
    .line 531
    const/16 v18, 0x1

    .line 532
    .line 533
    aput v9, v7, v18

    .line 534
    .line 535
    aget-object v9, v19, v8

    .line 536
    .line 537
    invoke-virtual {v9, v7}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 538
    .line 539
    .line 540
    aget v9, v7, v16

    .line 541
    .line 542
    aget v10, v7, v18

    .line 543
    .line 544
    invoke-virtual {v5, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 545
    .line 546
    .line 547
    aget-object v9, v19, v8

    .line 548
    .line 549
    invoke-virtual {v13, v9, v5}, Lc8/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 550
    .line 551
    .line 552
    goto :goto_b

    .line 553
    :goto_a
    aget-object v9, v19, v8

    .line 554
    .line 555
    invoke-virtual {v13, v9, v4}, Lc8/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 556
    .line 557
    .line 558
    :goto_b
    if-eqz v3, :cond_12

    .line 559
    .line 560
    aget-object v9, v19, v8

    .line 561
    .line 562
    iget-object v10, v3, Lzg/x;->a:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v10, Lc8/g;

    .line 565
    .line 566
    iget-object v11, v10, Lc8/g;->d:Ljava/util/BitSet;

    .line 567
    .line 568
    add-int/lit8 v14, v8, 0x4

    .line 569
    .line 570
    const/4 v0, 0x0

    .line 571
    invoke-virtual {v11, v14, v0}, Ljava/util/BitSet;->set(IZ)V

    .line 572
    .line 573
    .line 574
    iget v11, v13, Lc8/t;->e:F

    .line 575
    .line 576
    invoke-virtual {v13, v11}, Lc8/t;->a(F)V

    .line 577
    .line 578
    .line 579
    new-instance v11, Landroid/graphics/Matrix;

    .line 580
    .line 581
    invoke-direct {v11, v9}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 582
    .line 583
    .line 584
    new-instance v9, Ljava/util/ArrayList;

    .line 585
    .line 586
    iget-object v13, v13, Lc8/t;->g:Ljava/util/ArrayList;

    .line 587
    .line 588
    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 589
    .line 590
    .line 591
    new-instance v13, Lc8/m;

    .line 592
    .line 593
    invoke-direct {v13, v9, v11}, Lc8/m;-><init>(Ljava/util/ArrayList;Landroid/graphics/Matrix;)V

    .line 594
    .line 595
    .line 596
    iget-object v9, v10, Lc8/g;->c:[Lc8/s;

    .line 597
    .line 598
    aput-object v13, v9, v8

    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_12
    const/4 v0, 0x0

    .line 602
    :goto_c
    move/from16 v16, v0

    .line 603
    .line 604
    move v8, v12

    .line 605
    move-object v11, v15

    .line 606
    move-object/from16 v10, v20

    .line 607
    .line 608
    const/4 v13, 0x4

    .line 609
    move-object/from16 v0, p0

    .line 610
    .line 611
    goto/16 :goto_4

    .line 612
    .line 613
    :cond_13
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v5}, Landroid/graphics/Path;->isEmpty()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-nez v0, :cond_14

    .line 624
    .line 625
    sget-object v0, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 626
    .line 627
    invoke-virtual {v4, v5, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 628
    .line 629
    .line 630
    :cond_14
    return-void
.end method

.method public d()LE5/J0;
    .locals 4

    .line 1
    iget-object v0, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, LE5/J0;->a:LE5/G0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, LE5/m0;

    .line 27
    .line 28
    iput v2, v3, LE5/m0;->d:I

    .line 29
    .line 30
    iget-object v3, v3, LE5/m0;->a:Lf6/t;

    .line 31
    .line 32
    iget-object v3, v3, Lf6/t;->o:Lf6/r;

    .line 33
    .line 34
    iget-object v3, v3, Lf6/n;->b:LE5/J0;

    .line 35
    .line 36
    invoke-virtual {v3}, LE5/J0;->o()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, LE5/z0;

    .line 45
    .line 46
    iget-object v2, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lf6/X;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, LE5/z0;-><init>(Ljava/util/ArrayList;Lf6/X;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public e()LN1/N;
    .locals 4

    .line 1
    iget-object v0, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, LN1/N;->a:LN1/K;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ge v1, v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, LU1/O;

    .line 27
    .line 28
    iput v2, v3, LU1/O;->d:I

    .line 29
    .line 30
    iget-object v3, v3, LU1/O;->a:Lk2/D;

    .line 31
    .line 32
    iget-object v3, v3, Lk2/D;->o:Lk2/B;

    .line 33
    .line 34
    iget-object v3, v3, Lk2/x;->b:LN1/N;

    .line 35
    .line 36
    invoke-virtual {v3}, LN1/N;->o()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v2, v3

    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance v1, LU1/V;

    .line 45
    .line 46
    iget-object v2, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lk2/g0;

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public f()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Lv9/A;

    .line 5
    .line 6
    invoke-virtual {v1}, Lv9/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    sget-object v3, Lv9/r;->a:Lv9/r;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Lmd/k0;->e:Lmd/k0;

    .line 15
    .line 16
    invoke-virtual {v1, v3, v2}, Lv9/b;->a(Lv9/r;Lmd/k0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lv9/B;

    .line 22
    .line 23
    invoke-virtual {v1}, Lv9/b;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    sget-object v2, Lmd/k0;->e:Lmd/k0;

    .line 30
    .line 31
    invoke-virtual {v1, v3, v2}, Lv9/b;->a(Lv9/r;Lmd/k0;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-array v3, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    aput-object v2, v3, v4

    .line 56
    .line 57
    const-string v2, "RemoteStore"

    .line 58
    .line 59
    const-string v4, "Stopping write stream with %d pending writes"

    .line 60
    .line 61
    invoke-static {v2, v4, v0, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 69
    .line 70
    return-void
.end method

.method public g()V
    .locals 3

    .line 1
    iget v0, p0, LE5/n0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, LU1/O;

    .line 25
    .line 26
    iget-object v2, v1, LU1/O;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v2, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, LU1/N;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v2, v1, LU1/N;->b:LU1/I;

    .line 47
    .line 48
    iget-object v1, v1, LU1/N;->a:Lk2/a;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lk2/a;->c(Lk2/I;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void

    .line 58
    :pswitch_0
    iget-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, LE5/m0;

    .line 77
    .line 78
    iget-object v2, v1, LE5/m0;->c:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    iget-object v2, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, LE5/l0;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    iget-object v2, v1, LE5/l0;->b:LE5/k0;

    .line 99
    .line 100
    iget-object v1, v1, LE5/l0;->a:Lf6/a;

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lf6/a;->b(Lf6/A;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    return-void

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE5/n0;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lr9/l;

    .line 7
    .line 8
    iget-object v1, v1, Lr9/l;->c:Lr9/v;

    .line 9
    .line 10
    invoke-interface {v1}, Lr9/v;->d()Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lv9/B;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object v1, v2, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 25
    .line 26
    invoke-virtual {p0}, LE5/n0;->u()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, LE5/n0;->w()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v1, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lio/flutter/plugin/platform/x;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, LE5/n0;->i()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public i()V
    .locals 7

    .line 1
    iget-object v0, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lt9/i;

    .line 18
    .line 19
    iget v1, v1, Lt9/i;->a:I

    .line 20
    .line 21
    :goto_0
    iget-boolean v2, p0, LE5/n0;->g:Z

    .line 22
    .line 23
    iget-object v3, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lv9/B;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/16 v5, 0xa

    .line 35
    .line 36
    if-ge v2, v5, :cond_4

    .line 37
    .line 38
    iget-object v2, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lr9/l;

    .line 41
    .line 42
    iget-object v2, v2, Lr9/l;->c:Lr9/v;

    .line 43
    .line 44
    invoke-interface {v2, v1}, Lr9/v;->b(I)Lt9/i;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v3}, Lv9/b;->c()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget-object v0, v3, Lv9/b;->b:Lme/a;

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    iget-object v0, v3, Lv9/b;->e:Lg5/d;

    .line 67
    .line 68
    iget-object v1, v3, Lv9/b;->g:Lw9/d;

    .line 69
    .line 70
    iget-object v2, v3, Lv9/b;->f:Lw9/e;

    .line 71
    .line 72
    sget-wide v5, Lv9/b;->o:J

    .line 73
    .line 74
    invoke-virtual {v2, v1, v5, v6, v0}, Lw9/e;->b(Lw9/d;JLjava/lang/Runnable;)Lme/a;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, v3, Lv9/b;->b:Lme/a;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_1
    iget-boolean v2, p0, LE5/n0;->g:Z

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-ge v2, v5, :cond_2

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move v2, v4

    .line 94
    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 95
    .line 96
    const-string v5, "addToWritePipeline called when pipeline is full"

    .line 97
    .line 98
    invoke-static {v2, v5, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lv9/b;->c()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_3

    .line 109
    .line 110
    iget-boolean v2, v3, Lv9/B;->s:Z

    .line 111
    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    iget-object v2, v1, Lt9/i;->d:Ljava/util/List;

    .line 115
    .line 116
    invoke-virtual {v3, v2}, Lv9/B;->j(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    iget v1, v1, Lt9/i;->a:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    :goto_2
    invoke-virtual {p0}, LE5/n0;->v()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0}, LE5/n0;->v()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    new-array v1, v4, [Ljava/lang/Object;

    .line 133
    .line 134
    const-string v2, "startWriteStream() called when shouldStartWriteStream() is false."

    .line 135
    .line 136
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lv9/B;->g()V

    .line 140
    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public j(Lr9/S;)V
    .locals 3

    .line 1
    iget v0, p1, Lr9/S;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LE5/n0;->u()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, LE5/n0;->w()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v0, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lv9/A;

    .line 34
    .line 35
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, p1}, LE5/n0;->t(Lr9/S;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void
.end method

.method public k(LE5/m0;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, LE5/m0;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, LE5/m0;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LE5/l0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, LE5/l0;->b:LE5/k0;

    .line 27
    .line 28
    iget-object v2, v0, LE5/l0;->a:Lf6/a;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lf6/a;->n(Lf6/A;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, LE5/l0;->c:LVa/Za;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Lf6/a;->q(Lf6/D;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lf6/a;->p(LI5/g;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public l(LU1/O;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, LU1/O;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, LU1/O;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LU1/N;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v0, LU1/N;->b:LU1/I;

    .line 27
    .line 28
    iget-object v2, v0, LU1/N;->a:Lk2/a;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lk2/a;->o(Lk2/I;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, LU1/N;->c:LU1/M;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Lk2/a;->r(Lk2/M;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lk2/a;->q(LZ1/e;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public m(Landroid/graphics/Path;I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [Lc8/t;

    .line 11
    .line 12
    aget-object v1, v1, p2

    .line 13
    .line 14
    iget-object v2, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [Landroid/graphics/Matrix;

    .line 17
    .line 18
    aget-object p2, v2, p2

    .line 19
    .line 20
    invoke-virtual {v1, p2, v0}, Lc8/t;->b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 33
    .line 34
    .line 35
    sget-object v2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_0

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    cmpl-float p1, p1, v0

    .line 64
    .line 65
    if-lez p1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 p1, 0x0

    .line 69
    return p1

    .line 70
    :cond_1
    :goto_0
    return v1
.end method

.method public n(LE5/m0;)V
    .locals 6

    .line 1
    iget-object v0, p1, LE5/m0;->a:Lf6/t;

    .line 2
    .line 3
    new-instance v1, LE5/k0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LE5/k0;-><init>(LE5/n0;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, LVa/Za;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p0, v2, LVa/Za;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, LI5/f;

    .line 18
    .line 19
    iput-object v3, v2, LVa/Za;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v3, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, LI5/f;

    .line 24
    .line 25
    iput-object v3, v2, LVa/Za;->c:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p1, v2, LVa/Za;->a:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v3, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    new-instance v4, LE5/l0;

    .line 34
    .line 35
    invoke-direct {v4, v0, v1, v2}, LE5/l0;-><init>(Lf6/a;LE5/k0;LVa/Za;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget p1, Lu6/v;->a:I

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    new-instance v3, Landroid/os/Handler;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p1, v0, Lf6/a;->c:LI5/f;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v5, Lf6/C;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v3, v5, Lf6/C;->a:Landroid/os/Handler;

    .line 74
    .line 75
    iput-object v2, v5, Lf6/C;->b:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object p1, p1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-eqz p1, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, v0, Lf6/a;->d:LI5/f;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v3, LI5/e;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v2, v3, LI5/e;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object p1, p1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 111
    .line 112
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Lt6/K;

    .line 118
    .line 119
    iget-object v2, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, LF5/l;

    .line 122
    .line 123
    invoke-virtual {v0, v1, p1, v2}, Lf6/a;->j(Lf6/A;Lt6/K;LF5/l;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public o(LU1/O;)V
    .locals 6

    .line 1
    iget-object v0, p1, LU1/O;->a:Lk2/D;

    .line 2
    .line 3
    new-instance v1, LU1/I;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LU1/I;-><init>(LE5/n0;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, LU1/M;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1}, LU1/M;-><init>(LE5/n0;LU1/O;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LE5/n0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/util/HashMap;

    .line 16
    .line 17
    new-instance v4, LU1/N;

    .line 18
    .line 19
    invoke-direct {v4, v0, v1, v2}, LU1/N;-><init>(Lk2/a;LU1/I;LU1/M;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget p1, LQ1/x;->a:I

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    new-instance v3, Landroid/os/Handler;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, Lk2/a;->c:LZ1/d;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v5, Lk2/L;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v3, v5, Lk2/L;->a:Landroid/os/Handler;

    .line 58
    .line 59
    iput-object v2, v5, Lk2/L;->b:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object p1, p1, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 62
    .line 63
    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v0, Lk2/a;->d:LZ1/d;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, LZ1/c;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v2, v3, LZ1/c;->a:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object p1, p1, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, LS1/A;

    .line 102
    .line 103
    iget-object v2, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, LV1/k;

    .line 106
    .line 107
    invoke-virtual {v0, v1, p1, v2}, Lk2/a;->k(Lk2/I;LS1/A;LV1/k;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public p(Lf6/w;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LE5/m0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, LE5/m0;->a:Lf6/t;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lf6/t;->m(Lf6/w;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, LE5/m0;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, Lf6/q;

    .line 22
    .line 23
    iget-object p1, p1, Lf6/q;->a:Lf6/z;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, LE5/n0;->g()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v1}, LE5/n0;->k(LE5/m0;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public q(Lk2/F;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/n0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LU1/O;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, LU1/O;->a:Lk2/D;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lk2/D;->n(Lk2/F;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, LU1/O;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, Lk2/A;

    .line 22
    .line 23
    iget-object p1, p1, Lk2/A;->a:Lk2/H;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, LE5/n0;->g()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0, v1}, LE5/n0;->l(LU1/O;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public r(II)V
    .locals 7

    .line 1
    iget v0, p0, LE5/n0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    sub-int/2addr p2, v0

    .line 8
    :goto_0
    if-lt p2, p1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LU1/O;

    .line 19
    .line 20
    iget-object v3, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/util/HashMap;

    .line 23
    .line 24
    iget-object v4, v2, LU1/O;->b:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v3, v2, LU1/O;->a:Lk2/D;

    .line 30
    .line 31
    iget-object v3, v3, Lk2/D;->o:Lk2/B;

    .line 32
    .line 33
    iget-object v3, v3, Lk2/x;->b:LN1/N;

    .line 34
    .line 35
    invoke-virtual {v3}, LN1/N;->o()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    neg-int v3, v3

    .line 40
    move v4, p2

    .line 41
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-ge v4, v5, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, LU1/O;

    .line 52
    .line 53
    iget v6, v5, LU1/O;->d:I

    .line 54
    .line 55
    add-int/2addr v6, v3

    .line 56
    iput v6, v5, LU1/O;->d:I

    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iput-boolean v0, v2, LU1/O;->e:Z

    .line 62
    .line 63
    iget-boolean v1, p0, LE5/n0;->g:Z

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0, v2}, LE5/n0;->l(LU1/O;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 p2, p2, -0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-void

    .line 74
    :pswitch_0
    const/4 v0, 0x1

    .line 75
    sub-int/2addr p2, v0

    .line 76
    :goto_2
    if-lt p2, p1, :cond_5

    .line 77
    .line 78
    iget-object v1, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, LE5/m0;

    .line 87
    .line 88
    iget-object v3, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Ljava/util/HashMap;

    .line 91
    .line 92
    iget-object v4, v2, LE5/m0;->b:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v3, v2, LE5/m0;->a:Lf6/t;

    .line 98
    .line 99
    iget-object v3, v3, Lf6/t;->o:Lf6/r;

    .line 100
    .line 101
    iget-object v3, v3, Lf6/n;->b:LE5/J0;

    .line 102
    .line 103
    invoke-virtual {v3}, LE5/J0;->o()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    neg-int v3, v3

    .line 108
    move v4, p2

    .line 109
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-ge v4, v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, LE5/m0;

    .line 120
    .line 121
    iget v6, v5, LE5/m0;->d:I

    .line 122
    .line 123
    add-int/2addr v6, v3

    .line 124
    iput v6, v5, LE5/m0;->d:I

    .line 125
    .line 126
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    iput-boolean v0, v2, LE5/m0;->e:Z

    .line 130
    .line 131
    iget-boolean v1, p0, LE5/n0;->g:Z

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    invoke-virtual {p0, v2}, LE5/n0;->k(LE5/m0;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    add-int/lit8 p2, p2, -0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public s(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC6/l;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LC6/l;->o(I)Lv9/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Lv9/u;->a:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, v0, Lv9/u;->a:I

    .line 14
    .line 15
    iget-object v0, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lv9/A;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v2, v2, [Ljava/lang/Object;

    .line 25
    .line 26
    const-string v3, "Unwatching targets requires an open stream"

    .line 27
    .line 28
    invoke-static {v1, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lka/i0;->g()Lka/g0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, v0, Lv9/A;->r:Lv9/o;

    .line 36
    .line 37
    iget-object v2, v2, Lv9/o;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lka/g0;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p1}, Lka/g0;->d(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lka/i0;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lv9/b;->i(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public t(Lr9/S;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, LC6/l;

    .line 6
    .line 7
    iget v3, p1, Lr9/S;->b:I

    .line 8
    .line 9
    invoke-virtual {v2, v3}, LC6/l;->o(I)Lv9/u;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, v2, Lv9/u;->a:I

    .line 14
    .line 15
    add-int/2addr v3, v1

    .line 16
    iput v3, v2, Lv9/u;->a:I

    .line 17
    .line 18
    iget-object v2, p1, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object v2, Ls9/o;->b:Ls9/o;

    .line 27
    .line 28
    iget-object v3, p1, Lr9/S;->e:Ls9/o;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ls9/o;->a(Ls9/o;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-lez v2, :cond_1

    .line 35
    .line 36
    :cond_0
    iget-object v2, p0, LE5/n0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lad/L;

    .line 39
    .line 40
    iget v3, p1, Lr9/S;->b:I

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lad/L;->p(I)Lc9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v2, v2, Lc9/d;->a:Lc9/c;

    .line 47
    .line 48
    invoke-virtual {v2}, Lc9/c;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    new-instance v3, Lr9/S;

    .line 57
    .line 58
    iget-object v10, p1, Lr9/S;->f:Ls9/o;

    .line 59
    .line 60
    iget-object v11, p1, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 61
    .line 62
    iget-object v4, p1, Lr9/S;->a:Lp9/A;

    .line 63
    .line 64
    iget v5, p1, Lr9/S;->b:I

    .line 65
    .line 66
    iget-wide v6, p1, Lr9/S;->c:J

    .line 67
    .line 68
    iget-object v8, p1, Lr9/S;->d:Lr9/y;

    .line 69
    .line 70
    iget-object v9, p1, Lr9/S;->e:Ls9/o;

    .line 71
    .line 72
    invoke-direct/range {v3 .. v12}, Lr9/S;-><init>(Lp9/A;IJLr9/y;Ls9/o;Ls9/o;Lcom/google/protobuf/ByteString;Ljava/lang/Integer;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v3

    .line 76
    :cond_1
    iget-object v2, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lv9/A;

    .line 79
    .line 80
    invoke-virtual {v2}, Lv9/b;->c()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    new-array v4, v0, [Ljava/lang/Object;

    .line 85
    .line 86
    const-string v5, "Watching queries requires an open stream"

    .line 87
    .line 88
    invoke-static {v3, v5, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lka/i0;->g()Lka/g0;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-object v4, v2, Lv9/A;->r:Lv9/o;

    .line 96
    .line 97
    iget-object v5, v4, Lv9/o;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v3, v5}, Lka/g0;->c(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lka/o1;->h()Lka/j1;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-object v6, p1, Lr9/S;->a:Lp9/A;

    .line 107
    .line 108
    invoke-virtual {v6}, Lp9/A;->e()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_2

    .line 113
    .line 114
    invoke-static {}, Lka/l1;->f()Lka/k1;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    iget-object v4, v4, Lv9/o;->a:Ls9/f;

    .line 119
    .line 120
    iget-object v6, v6, Lp9/A;->d:Ls9/m;

    .line 121
    .line 122
    invoke-static {v4, v6}, Lv9/o;->k(Ls9/f;Ls9/m;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v7, v4}, Lka/k1;->a(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lka/l1;

    .line 134
    .line 135
    invoke-virtual {v5, v4}, Lka/j1;->a(Lka/l1;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {v4, v6}, Lv9/o;->j(Lp9/A;)Lka/n1;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v5, v4}, Lka/j1;->c(Lka/n1;)V

    .line 144
    .line 145
    .line 146
    :goto_0
    iget v4, p1, Lr9/S;->b:I

    .line 147
    .line 148
    invoke-virtual {v5, v4}, Lka/j1;->f(I)V

    .line 149
    .line 150
    .line 151
    iget-object v4, p1, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    iget-object v7, p1, Lr9/S;->e:Ls9/o;

    .line 158
    .line 159
    if-eqz v6, :cond_3

    .line 160
    .line 161
    sget-object v6, Ls9/o;->b:Ls9/o;

    .line 162
    .line 163
    invoke-virtual {v7, v6}, Ls9/o;->a(Ls9/o;)I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-lez v6, :cond_3

    .line 168
    .line 169
    iget-object v6, v7, Ls9/o;->a:Ls8/q;

    .line 170
    .line 171
    invoke-static {v6}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v5, v6}, Lka/j1;->d(Lcom/google/protobuf/Timestamp;)V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_3
    invoke-virtual {v5, v4}, Lka/j1;->e(Lcom/google/protobuf/ByteString;)V

    .line 180
    .line 181
    .line 182
    :goto_1
    iget-object v6, p1, Lr9/S;->h:Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v6, :cond_5

    .line 185
    .line 186
    invoke-virtual {v4}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_4

    .line 191
    .line 192
    sget-object v4, Ls9/o;->b:Ls9/o;

    .line 193
    .line 194
    invoke-virtual {v7, v4}, Ls9/o;->a(Ls9/o;)I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-lez v4, :cond_5

    .line 199
    .line 200
    :cond_4
    invoke-static {}, Lcom/google/protobuf/Int32Value;->newBuilder()Lcom/google/protobuf/Int32Value$Builder;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    invoke-virtual {v4, v6}, Lcom/google/protobuf/Int32Value$Builder;->setValue(I)Lcom/google/protobuf/Int32Value$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v5, v4}, Lka/j1;->b(Lcom/google/protobuf/Int32Value$Builder;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Lka/o1;

    .line 220
    .line 221
    invoke-virtual {v3, v4}, Lka/g0;->b(Lka/o1;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, p1, Lr9/S;->d:Lr9/y;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    const/4 v5, 0x0

    .line 231
    if-eqz v4, :cond_9

    .line 232
    .line 233
    if-eq v4, v1, :cond_8

    .line 234
    .line 235
    const/4 v6, 0x2

    .line 236
    if-eq v4, v6, :cond_7

    .line 237
    .line 238
    const/4 v6, 0x3

    .line 239
    if-ne v4, v6, :cond_6

    .line 240
    .line 241
    const-string p1, "limbo-document"

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    const-string v2, "Unrecognized query purpose: %s"

    .line 245
    .line 246
    new-array v1, v1, [Ljava/lang/Object;

    .line 247
    .line 248
    aput-object p1, v1, v0

    .line 249
    .line 250
    invoke-static {v2, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    throw v5

    .line 254
    :cond_7
    const-string p1, "existence-filter-mismatch-bloom"

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_8
    const-string p1, "existence-filter-mismatch"

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_9
    move-object p1, v5

    .line 261
    :goto_2
    if-nez p1, :cond_a

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_a
    new-instance v5, Ljava/util/HashMap;

    .line 265
    .line 266
    invoke-direct {v5, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 267
    .line 268
    .line 269
    const-string v0, "goog-listen-tags"

    .line 270
    .line 271
    invoke-virtual {v5, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    :goto_3
    if-eqz v5, :cond_b

    .line 275
    .line 276
    invoke-virtual {v3, v5}, Lka/g0;->a(Ljava/util/HashMap;)V

    .line 277
    .line 278
    .line 279
    :cond_b
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Lka/i0;

    .line 284
    .line 285
    invoke-virtual {v2, p1}, Lv9/b;->i(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE5/n0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv9/A;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv9/b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE5/n0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE5/n0;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv9/B;

    .line 8
    .line 9
    invoke-virtual {v0}, Lv9/b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LE5/n0;->m:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public w()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LE5/n0;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "startWatchStream() called when shouldStartWatchStream() is false."

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LC6/l;

    .line 14
    .line 15
    iget-object v2, p0, LE5/n0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ls9/f;

    .line 18
    .line 19
    invoke-direct {v0, v2, p0}, LC6/l;-><init>(Ls9/f;LE5/n0;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LE5/n0;->l:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lv9/A;

    .line 27
    .line 28
    invoke-virtual {v0}, Lv9/b;->g()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lio/flutter/plugin/platform/x;

    .line 34
    .line 35
    iget v2, v0, Lio/flutter/plugin/platform/x;->b:I

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v0, v2}, Lio/flutter/plugin/platform/x;->c(I)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v0, Lio/flutter/plugin/platform/x;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lme/a;

    .line 46
    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v2, v1

    .line 51
    :goto_0
    const-string v3, "onlineStateTimer shouldn\'t be started yet"

    .line 52
    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v2, v3, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lw9/d;->f:Lw9/d;

    .line 59
    .line 60
    new-instance v2, Lkd/c;

    .line 61
    .line 62
    const/16 v3, 0x11

    .line 63
    .line 64
    invoke-direct {v2, v0, v3}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    iget-object v3, v0, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Lw9/e;

    .line 70
    .line 71
    const-wide/16 v4, 0x2710

    .line 72
    .line 73
    invoke-virtual {v3, v1, v4, v5, v2}, Lw9/e;->b(Lw9/d;JLjava/lang/Runnable;)Lme/a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v0, Lio/flutter/plugin/platform/x;->d:Ljava/lang/Object;

    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public x(I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LE5/n0;->d:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lr9/S;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    new-array v5, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object v4, v5, v0

    .line 29
    .line 30
    const-string v0, "stopListening called on target no currently watched: %d"

    .line 31
    .line 32
    invoke-static {v2, v0, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LE5/n0;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lv9/A;

    .line 38
    .line 39
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, p1}, LE5/n0;->s(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    iget-object p1, v0, Lv9/b;->b:Lme/a;

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    iget-object p1, v0, Lv9/b;->e:Lg5/d;

    .line 71
    .line 72
    iget-object v1, v0, Lv9/b;->g:Lw9/d;

    .line 73
    .line 74
    iget-object v2, v0, Lv9/b;->f:Lw9/e;

    .line 75
    .line 76
    sget-wide v3, Lv9/b;->o:J

    .line 77
    .line 78
    invoke-virtual {v2, v1, v3, v4, p1}, Lw9/e;->b(Lw9/d;JLjava/lang/Runnable;)Lme/a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, v0, Lv9/b;->b:Lme/a;

    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-boolean p1, p0, LE5/n0;->g:Z

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    iget-object p1, p0, LE5/n0;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, Lio/flutter/plugin/platform/x;

    .line 92
    .line 93
    invoke-virtual {p1, v3}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 94
    .line 95
    .line 96
    :cond_3
    return-void
.end method
