.class public final Lt0/f;
.super LX0/E;
.source "SourceFile"

# interfaces
.implements Lt0/J;


# instance fields
.field public e:Lb0/d;

.field public final f:Lmd/J;

.field public g:Z

.field public final h:LA0/p;


# direct methods
.method public constructor <init>(Lt0/y;Lb0/e;)V
    .locals 1

    .line 1
    const-string v0, "layoutNodeWrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modifier"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LX0/E;-><init>(Lt0/y;LZ/j;)V

    .line 12
    .line 13
    .line 14
    check-cast p2, Lb0/e;

    .line 15
    .line 16
    instance-of v0, p2, Lb0/d;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p2, Lb0/d;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    iput-object p2, p0, Lt0/f;->e:Lb0/d;

    .line 25
    .line 26
    new-instance p2, Lmd/J;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p0, p2, Lmd/J;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p1, p2, Lmd/J;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, p0, LX0/E;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lt0/y;

    .line 38
    .line 39
    iget-object p1, p1, Lt0/y;->e:Lt0/t;

    .line 40
    .line 41
    iget-object p1, p1, Lt0/t;->n:LL0/b;

    .line 42
    .line 43
    iput-object p1, p2, Lmd/J;->a:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object p2, p0, Lt0/f;->f:Lmd/J;

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lt0/f;->g:Z

    .line 49
    .line 50
    new-instance p1, LA0/p;

    .line 51
    .line 52
    const/16 p2, 0x1d

    .line 53
    .line 54
    invoke-direct {p1, p0, p2}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lt0/f;->h:LA0/p;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, LX0/E;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LZ/j;

    .line 4
    .line 5
    check-cast v0, Lb0/e;

    .line 6
    .line 7
    instance-of v1, v0, Lb0/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lb0/d;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-object v0, p0, Lt0/f;->e:Lb0/d;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lt0/f;->g:Z

    .line 19
    .line 20
    iput-boolean v0, p0, LX0/E;->a:Z

    .line 21
    .line 22
    return-void
.end method

.method public final j(Le0/o;)V
    .locals 14

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX0/E;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt0/y;

    .line 9
    .line 10
    iget-wide v1, v0, Lr0/t;->c:J

    .line 11
    .line 12
    invoke-static {v1, v2}, LBa/c;->R(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-object v3, p0, Lt0/f;->e:Lb0/d;

    .line 17
    .line 18
    iget-object v4, v0, Lt0/y;->e:Lt0/t;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-boolean v3, p0, Lt0/f;->g:Z

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-static {v4}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lu0/n;

    .line 31
    .line 32
    invoke-virtual {v3}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    sget-object v5, Lt0/e;->j:Lt0/e;

    .line 37
    .line 38
    iget-object v6, p0, Lt0/f;->h:LA0/p;

    .line 39
    .line 40
    invoke-virtual {v3, p0, v5, v6}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lu0/n;

    .line 51
    .line 52
    invoke-virtual {v3}, Lu0/n;->getSharedDrawScope()Lt0/v;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, v3, Lt0/v;->b:Lt0/f;

    .line 57
    .line 58
    iput-object p0, v3, Lt0/v;->b:Lt0/f;

    .line 59
    .line 60
    invoke-virtual {v0}, Lt0/y;->J()Lt0/r;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0}, Lt0/y;->J()Lt0/r;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, Lt0/r;->a:Lt0/t;

    .line 69
    .line 70
    iget-object v0, v0, Lt0/t;->p:LL0/i;

    .line 71
    .line 72
    iget-object v6, v3, Lt0/v;->a:Lg0/b;

    .line 73
    .line 74
    iget-object v7, v6, Lg0/b;->a:Lg0/a;

    .line 75
    .line 76
    iget-object v8, v7, Lg0/a;->a:LL0/b;

    .line 77
    .line 78
    iget-object v9, v7, Lg0/a;->b:LL0/i;

    .line 79
    .line 80
    iget-object v10, v7, Lg0/a;->c:Le0/o;

    .line 81
    .line 82
    iget-wide v11, v7, Lg0/a;->d:J

    .line 83
    .line 84
    const-string v13, "<set-?>"

    .line 85
    .line 86
    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v5, v7, Lg0/a;->a:LL0/b;

    .line 90
    .line 91
    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, v7, Lg0/a;->b:LL0/i;

    .line 95
    .line 96
    iput-object p1, v7, Lg0/a;->c:Le0/o;

    .line 97
    .line 98
    iput-wide v1, v7, Lg0/a;->d:J

    .line 99
    .line 100
    invoke-interface {p1}, Le0/o;->m()V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, LX0/E;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, LZ/j;

    .line 106
    .line 107
    check-cast v0, Lb0/e;

    .line 108
    .line 109
    invoke-interface {v0, v3}, Lb0/e;->e(Lt0/v;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Le0/o;->restore()V

    .line 113
    .line 114
    .line 115
    iget-object p1, v6, Lg0/b;->a:Lg0/a;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iput-object v8, p1, Lg0/a;->a:LL0/b;

    .line 124
    .line 125
    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v9, p1, Lg0/a;->b:LL0/i;

    .line 129
    .line 130
    iput-object v10, p1, Lg0/a;->c:Le0/o;

    .line 131
    .line 132
    iput-wide v11, p1, Lg0/a;->d:J

    .line 133
    .line 134
    iput-object v4, v3, Lt0/v;->b:Lt0/f;

    .line 135
    .line 136
    return-void
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX0/E;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt0/y;

    .line 4
    .line 5
    invoke-virtual {v0}, Lt0/y;->S()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
