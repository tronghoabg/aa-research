.class public final Lp9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp9/u;

.field public final b:Lp9/g;

.field public final c:Lp9/b;

.field public d:Z

.field public e:I

.field public f:Lp9/D;


# direct methods
.method public constructor <init>(Lp9/u;Lp9/g;Lp9/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lp9/v;->d:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lp9/v;->e:I

    .line 9
    .line 10
    iput-object p1, p0, Lp9/v;->a:Lp9/u;

    .line 11
    .line 12
    iput-object p3, p0, Lp9/v;->c:Lp9/b;

    .line 13
    .line 14
    iput-object p2, p0, Lp9/v;->b:Lp9/g;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lp9/v;->b:Lp9/g;

    .line 2
    .line 3
    iget v0, v0, Lp9/g;->d:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v1}, LA/f;->b(II)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    return v0
.end method

.method public final b(Lp9/D;)Z
    .locals 14

    .line 1
    iget-object v0, p1, Lp9/D;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p1, Lp9/D;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v1

    .line 19
    :goto_1
    const-string v3, "We got a new snapshot with no changes?"

    .line 20
    .line 21
    new-array v4, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v0, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lp9/v;->b:Lp9/g;

    .line 27
    .line 28
    iget-boolean v3, v0, Lp9/g;->a:Z

    .line 29
    .line 30
    if-nez v3, :cond_4

    .line 31
    .line 32
    new-instance v8, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v3, p1, Lp9/D;->d:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lp9/f;

    .line 54
    .line 55
    iget-object v5, v4, Lp9/f;->a:Lp9/e;

    .line 56
    .line 57
    sget-object v6, Lp9/e;->d:Lp9/e;

    .line 58
    .line 59
    if-eq v5, v6, :cond_2

    .line 60
    .line 61
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance v4, Lp9/D;

    .line 66
    .line 67
    iget-object v5, p1, Lp9/D;->a:Lp9/u;

    .line 68
    .line 69
    const/4 v12, 0x1

    .line 70
    iget-boolean v13, p1, Lp9/D;->i:Z

    .line 71
    .line 72
    iget-object v6, p1, Lp9/D;->b:Ls9/i;

    .line 73
    .line 74
    iget-object v7, p1, Lp9/D;->c:Ls9/i;

    .line 75
    .line 76
    iget-boolean v9, p1, Lp9/D;->e:Z

    .line 77
    .line 78
    iget-object v10, p1, Lp9/D;->f:Lc9/d;

    .line 79
    .line 80
    iget-boolean v11, p1, Lp9/D;->g:Z

    .line 81
    .line 82
    invoke-direct/range {v4 .. v13}, Lp9/D;-><init>(Lp9/u;Ls9/i;Ls9/i;Ljava/util/ArrayList;ZLc9/d;ZZZ)V

    .line 83
    .line 84
    .line 85
    move-object p1, v4

    .line 86
    :cond_4
    iget-boolean v3, p0, Lp9/v;->d:Z

    .line 87
    .line 88
    if-nez v3, :cond_5

    .line 89
    .line 90
    iget v0, p0, Lp9/v;->e:I

    .line 91
    .line 92
    invoke-virtual {p0, p1, v0}, Lp9/v;->d(Lp9/D;I)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_a

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Lp9/v;->c(Lp9/D;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget-object v3, p1, Lp9/D;->d:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_6

    .line 109
    .line 110
    move v0, v1

    .line 111
    goto :goto_5

    .line 112
    :cond_6
    iget-object v3, p0, Lp9/v;->f:Lp9/D;

    .line 113
    .line 114
    if-eqz v3, :cond_7

    .line 115
    .line 116
    iget-object v3, v3, Lp9/D;->f:Lc9/d;

    .line 117
    .line 118
    iget-object v3, v3, Lc9/d;->a:Lc9/c;

    .line 119
    .line 120
    invoke-virtual {v3}, Lc9/c;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    xor-int/2addr v3, v1

    .line 125
    iget-object v4, p1, Lp9/D;->f:Lc9/d;

    .line 126
    .line 127
    iget-object v4, v4, Lc9/d;->a:Lc9/c;

    .line 128
    .line 129
    invoke-virtual {v4}, Lc9/c;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    xor-int/2addr v4, v1

    .line 134
    if-eq v3, v4, :cond_7

    .line 135
    .line 136
    move v3, v1

    .line 137
    goto :goto_3

    .line 138
    :cond_7
    move v3, v2

    .line 139
    :goto_3
    iget-boolean v4, p1, Lp9/D;->g:Z

    .line 140
    .line 141
    if-nez v4, :cond_9

    .line 142
    .line 143
    if-eqz v3, :cond_8

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    move v0, v2

    .line 147
    goto :goto_5

    .line 148
    :cond_9
    :goto_4
    iget-boolean v0, v0, Lp9/g;->b:Z

    .line 149
    .line 150
    :goto_5
    if-eqz v0, :cond_a

    .line 151
    .line 152
    iget-object v0, p0, Lp9/v;->c:Lp9/b;

    .line 153
    .line 154
    const/4 v2, 0x0

    .line 155
    invoke-virtual {v0, p1, v2}, Lp9/b;->a(Ljava/lang/Object;Lm9/G;)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_a
    move v1, v2

    .line 160
    :goto_6
    iput-object p1, p0, Lp9/v;->f:Lp9/D;

    .line 161
    .line 162
    return v1
.end method

.method public final c(Lp9/D;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lp9/v;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "Trying to raise initial event for second time"

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v5, p1, Lp9/D;->a:Lp9/u;

    .line 14
    .line 15
    new-instance v8, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v6, p1, Lp9/D;->b:Ls9/i;

    .line 21
    .line 22
    iget-object v0, v6, Ls9/i;->b:Lc9/d;

    .line 23
    .line 24
    invoke-virtual {v0}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    move-object v2, v0

    .line 29
    check-cast v2, LA7/v;

    .line 30
    .line 31
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/Iterator;

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ls9/k;

    .line 46
    .line 47
    sget-object v3, Lp9/e;->b:Lp9/e;

    .line 48
    .line 49
    new-instance v4, Lp9/f;

    .line 50
    .line 51
    invoke-direct {v4, v3, v2}, Lp9/f;-><init>(Lp9/e;Ls9/k;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v4, Lp9/D;

    .line 59
    .line 60
    invoke-virtual {v5}, Lp9/u;->a()LO7/d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v2, LV5/s;

    .line 65
    .line 66
    const/4 v3, 0x3

    .line 67
    invoke-direct {v2, v0, v3}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Ls9/i;

    .line 71
    .line 72
    sget-object v0, Ls9/g;->a:Lc9/b;

    .line 73
    .line 74
    new-instance v3, Lc9/d;

    .line 75
    .line 76
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 77
    .line 78
    invoke-direct {v3, v9, v2}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v7, v0, v3}, Ls9/i;-><init>(Lc9/c;Lc9/d;)V

    .line 82
    .line 83
    .line 84
    iget-boolean v12, p1, Lp9/D;->h:Z

    .line 85
    .line 86
    iget-boolean v13, p1, Lp9/D;->i:Z

    .line 87
    .line 88
    iget-boolean v9, p1, Lp9/D;->e:Z

    .line 89
    .line 90
    iget-object v10, p1, Lp9/D;->f:Lc9/d;

    .line 91
    .line 92
    const/4 v11, 0x1

    .line 93
    invoke-direct/range {v4 .. v13}, Lp9/D;-><init>(Lp9/u;Ls9/i;Ls9/i;Ljava/util/ArrayList;ZLc9/d;ZZZ)V

    .line 94
    .line 95
    .line 96
    iput-boolean v1, p0, Lp9/v;->d:Z

    .line 97
    .line 98
    iget-object p1, p0, Lp9/v;->c:Lp9/b;

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-virtual {p1, v4, v0}, Lp9/b;->a(Ljava/lang/Object;Lm9/G;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final d(Lp9/D;I)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lp9/v;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "Determining whether to raise first event but already had first event."

    .line 9
    .line 10
    invoke-static {v0, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p1, Lp9/D;->e:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lp9/v;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x3

    .line 26
    invoke-static {p2, v0}, LA/f;->b(II)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v4, p0, Lp9/v;->b:Lp9/g;

    .line 31
    .line 32
    iget-boolean v4, v4, Lp9/g;->c:Z

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    new-array p2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    iget-boolean p1, p1, Lp9/D;->e:Z

    .line 41
    .line 42
    const-string v0, "Waiting for sync, but snapshot is not from cache"

    .line 43
    .line 44
    invoke-static {p1, v0, p2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return v2

    .line 48
    :cond_2
    iget-object v3, p1, Lp9/D;->b:Ls9/i;

    .line 49
    .line 50
    iget-object v3, v3, Ls9/i;->a:Lc9/c;

    .line 51
    .line 52
    invoke-virtual {v3}, Lc9/c;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    iget-boolean p1, p1, Lp9/D;->i:Z

    .line 59
    .line 60
    if-nez p1, :cond_4

    .line 61
    .line 62
    invoke-static {p2, v0}, LA/f;->b(II)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return v2

    .line 70
    :cond_4
    :goto_0
    return v1
.end method
