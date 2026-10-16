.class public final Lp0/t;
.super Lp0/n;
.source "SourceFile"

# interfaces
.implements Lp0/o;
.implements LL0/b;


# instance fields
.field public final c:Lu0/p0;

.field public final synthetic d:LL0/b;

.field public e:Lp0/f;

.field public final f:LP/d;

.field public final g:LP/d;

.field public h:Lp0/f;

.field public i:J


# direct methods
.method public constructor <init>(Lu0/p0;LL0/b;)V
    .locals 1

    .line 1
    const-string v0, "viewConfiguration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "density"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lp0/t;->c:Lu0/p0;

    .line 15
    .line 16
    iput-object p2, p0, Lp0/t;->d:LL0/b;

    .line 17
    .line 18
    sget-object p1, Lp0/w;->a:Lp0/f;

    .line 19
    .line 20
    iput-object p1, p0, Lp0/t;->e:Lp0/f;

    .line 21
    .line 22
    new-instance p1, LP/d;

    .line 23
    .line 24
    const/16 p2, 0x10

    .line 25
    .line 26
    new-array v0, p2, [Lp0/s;

    .line 27
    .line 28
    invoke-direct {p1, v0}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lp0/t;->f:LP/d;

    .line 32
    .line 33
    new-instance p1, LP/d;

    .line 34
    .line 35
    new-array p2, p2, [Lp0/s;

    .line 36
    .line 37
    invoke-direct {p1, p2}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lp0/t;->g:LP/d;

    .line 41
    .line 42
    const-wide/16 p1, 0x0

    .line 43
    .line 44
    iput-wide p1, p0, Lp0/t;->i:J

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final A(Ltf/p;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, LEf/n;

    .line 2
    .line 3
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LEf/n;->t()V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lp0/s;

    .line 15
    .line 16
    invoke-direct {p2, p0, v0}, Lp0/s;-><init>(Lp0/t;LEf/n;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lp0/t;->f:LP/d;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-object v2, p0, Lp0/t;->f:LP/d;

    .line 23
    .line 24
    invoke-virtual {v2, p2}, LP/d;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljf/j;

    .line 28
    .line 29
    invoke-static {p2, p2, p1}, LA6/h;->q(Ljf/c;Ljf/c;Ltf/p;)Ljf/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    invoke-direct {v2, p1, v3}, Ljf/j;-><init>(Ljf/c;Lkf/a;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lef/C;->a:Lef/C;

    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljf/j;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit v1

    .line 48
    new-instance p1, LB/F;

    .line 49
    .line 50
    const/16 v1, 0x11

    .line 51
    .line 52
    invoke-direct {p1, p2, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, LEf/n;->v(Ltf/l;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    monitor-exit v1

    .line 65
    throw p1
.end method

.method public final B(Lp0/f;Lp0/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lp0/t;->f:LP/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp0/t;->g:LP/d;

    .line 5
    .line 6
    iget-object v2, p0, Lp0/t;->f:LP/d;

    .line 7
    .line 8
    iget v3, v1, LP/d;->c:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, LP/d;->c(ILP/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lp0/t;->g:LP/d;

    .line 29
    .line 30
    iget v3, v0, LP/d;->c:I

    .line 31
    .line 32
    if-lez v3, :cond_6

    .line 33
    .line 34
    sub-int/2addr v3, v2

    .line 35
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 36
    .line 37
    :cond_1
    aget-object v2, v0, v3

    .line 38
    .line 39
    check-cast v2, Lp0/s;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v4, "event"

    .line 45
    .line 46
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, v2, Lp0/s;->d:Lp0/g;

    .line 50
    .line 51
    if-ne p2, v4, :cond_2

    .line 52
    .line 53
    iget-object v4, v2, Lp0/s;->c:LEf/n;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iput-object v1, v2, Lp0/s;->c:LEf/n;

    .line 58
    .line 59
    invoke-virtual {v4, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 63
    .line 64
    if-gez v3, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-object v0, p0, Lp0/t;->g:LP/d;

    .line 70
    .line 71
    iget v2, v0, LP/d;->c:I

    .line 72
    .line 73
    if-lez v2, :cond_6

    .line 74
    .line 75
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    :cond_4
    aget-object v4, v0, v3

    .line 79
    .line 80
    check-cast v4, Lp0/s;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-string v5, "event"

    .line 86
    .line 87
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, v4, Lp0/s;->d:Lp0/g;

    .line 91
    .line 92
    if-ne p2, v5, :cond_5

    .line 93
    .line 94
    iget-object v5, v4, Lp0/s;->c:LEf/n;

    .line 95
    .line 96
    if-eqz v5, :cond_5

    .line 97
    .line 98
    iput-object v1, v4, Lp0/s;->c:LEf/n;

    .line 99
    .line 100
    invoke-virtual {v5, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    if-lt v3, v2, :cond_4

    .line 106
    .line 107
    :cond_6
    :goto_0
    iget-object p1, p0, Lp0/t;->g:LP/d;

    .line 108
    .line 109
    invoke-virtual {p1}, LP/d;->e()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :goto_1
    iget-object p2, p0, Lp0/t;->g:LP/d;

    .line 114
    .line 115
    invoke-virtual {p2}, LP/d;->e()V

    .line 116
    .line 117
    .line 118
    throw p1

    .line 119
    :catchall_1
    move-exception p1

    .line 120
    monitor-exit v0

    .line 121
    throw p1
.end method

.method public final a()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lp0/t;->h:Lp0/f;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v1, v1, Lp0/f;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lp0/k;

    .line 23
    .line 24
    iget-boolean v5, v5, Lp0/k;->d:Z

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    :goto_1
    if-ge v3, v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lp0/k;

    .line 48
    .line 49
    iget-wide v7, v5, Lp0/k;->a:J

    .line 50
    .line 51
    new-instance v6, Lp0/k;

    .line 52
    .line 53
    sget-wide v21, Ld0/c;->b:J

    .line 54
    .line 55
    iget-boolean v9, v5, Lp0/k;->d:Z

    .line 56
    .line 57
    const/16 v20, 0x1

    .line 58
    .line 59
    move/from16 v18, v9

    .line 60
    .line 61
    iget-wide v9, v5, Lp0/k;->b:J

    .line 62
    .line 63
    iget-wide v11, v5, Lp0/k;->c:J

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    move-wide v14, v9

    .line 67
    move-wide/from16 v16, v11

    .line 68
    .line 69
    move/from16 v19, v18

    .line 70
    .line 71
    invoke-direct/range {v6 .. v22}, Lp0/k;-><init>(JJJZJJZZIJ)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    new-instance v1, Lp0/f;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v1, v2, v3}, Lp0/f;-><init>(Ljava/util/List;LE5/b;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, v0, Lp0/t;->e:Lp0/f;

    .line 87
    .line 88
    sget-object v2, Lp0/g;->a:Lp0/g;

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Lp0/t;->B(Lp0/f;Lp0/g;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Lp0/g;->b:Lp0/g;

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Lp0/t;->B(Lp0/f;Lp0/g;)V

    .line 96
    .line 97
    .line 98
    sget-object v2, Lp0/g;->c:Lp0/g;

    .line 99
    .line 100
    invoke-virtual {v0, v1, v2}, Lp0/t;->B(Lp0/f;Lp0/g;)V

    .line 101
    .line 102
    .line 103
    iput-object v3, v0, Lp0/t;->h:Lp0/f;

    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    :goto_2
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LL0/b;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final j(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LL0/b;->j(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LL0/b;->l(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final n(Lp0/f;Lp0/g;J)V
    .locals 1

    .line 1
    const-string v0, "pointerEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-wide p3, p0, Lp0/t;->i:J

    .line 7
    .line 8
    sget-object p3, Lp0/g;->a:Lp0/g;

    .line 9
    .line 10
    if-ne p2, p3, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lp0/t;->e:Lp0/f;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lp0/t;->B(Lp0/f;Lp0/g;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p1, Lp0/f;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    const/4 p4, 0x0

    .line 24
    :goto_0
    if-ge p4, p3, :cond_2

    .line 25
    .line 26
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lp0/k;

    .line 31
    .line 32
    invoke-static {v0}, Landroid/support/v4/media/session/b;->P(Lp0/k;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 p4, p4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    :goto_1
    iput-object p1, p0, Lp0/t;->h:Lp0/f;

    .line 44
    .line 45
    return-void
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final s()Lp0/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method

.method public final y(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/t;->d:LL0/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LL0/b;->y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method
