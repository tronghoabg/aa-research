.class public final LV1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:LE5/q;

.field public static final i:Ljava/util/Random;


# instance fields
.field public final a:LN1/M;

.field public final b:LN1/L;

.field public final c:Ljava/util/HashMap;

.field public d:LV1/i;

.field public e:LN1/N;

.field public f:Ljava/lang/String;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE5/q;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LE5/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LV1/f;->h:LE5/q;

    .line 8
    .line 9
    new-instance v0, Ljava/util/Random;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LV1/f;->i:Ljava/util/Random;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN1/M;

    .line 5
    .line 6
    invoke-direct {v0}, LN1/M;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LV1/f;->a:LN1/M;

    .line 10
    .line 11
    new-instance v0, LN1/L;

    .line 12
    .line 13
    invoke-direct {v0}, LN1/L;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LV1/f;->b:LN1/L;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    sget-object v0, LN1/N;->a:LN1/K;

    .line 26
    .line 27
    iput-object v0, p0, LV1/f;->e:LN1/N;

    .line 28
    .line 29
    const-wide/16 v0, -0x1

    .line 30
    .line 31
    iput-wide v0, p0, LV1/f;->g:J

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(LV1/e;)V
    .locals 4

    .line 1
    iget-wide v0, p1, LV1/e;->c:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-wide v0, p0, LV1/f;->g:J

    .line 10
    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, LV1/f;->f:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public final declared-synchronized b(LV1/a;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LV1/f;->f:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LV1/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, LV1/f;->a(LV1/e;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, LV1/e;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 46
    .line 47
    .line 48
    iget-boolean v2, v1, LV1/e;->e:Z

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, LV1/f;->d:LV1/i;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    iget-object v1, v1, LV1/e;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v2, p1, v1}, LV1/i;->d(LV1/a;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    monitor-exit p0

    .line 63
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p1
.end method

.method public final c(ILk2/H;)LV1/e;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, LV1/f;->c:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    const-wide v6, 0x7fffffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eqz v8, :cond_7

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    check-cast v8, LV1/e;

    .line 34
    .line 35
    iget-wide v9, v8, LV1/e;->c:J

    .line 36
    .line 37
    const-wide/16 v11, -0x1

    .line 38
    .line 39
    cmp-long v9, v9, v11

    .line 40
    .line 41
    if-nez v9, :cond_2

    .line 42
    .line 43
    iget v9, v8, LV1/e;->b:I

    .line 44
    .line 45
    if-ne v1, v9, :cond_2

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    iget-object v9, v8, LV1/e;->g:LV1/f;

    .line 50
    .line 51
    iget-object v10, v9, LV1/f;->c:Ljava/util/HashMap;

    .line 52
    .line 53
    iget-object v13, v9, LV1/f;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v10, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, LV1/e;

    .line 60
    .line 61
    if-eqz v10, :cond_1

    .line 62
    .line 63
    iget-wide v13, v10, LV1/e;->c:J

    .line 64
    .line 65
    cmp-long v10, v13, v11

    .line 66
    .line 67
    if-eqz v10, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iget-wide v9, v9, LV1/f;->g:J

    .line 71
    .line 72
    const-wide/16 v13, 0x1

    .line 73
    .line 74
    add-long/2addr v13, v9

    .line 75
    :goto_1
    iget-wide v9, v2, Lk2/H;->d:J

    .line 76
    .line 77
    cmp-long v13, v9, v13

    .line 78
    .line 79
    if-ltz v13, :cond_2

    .line 80
    .line 81
    iput-wide v9, v8, LV1/e;->c:J

    .line 82
    .line 83
    :cond_2
    iget-object v9, v8, LV1/e;->d:Lk2/H;

    .line 84
    .line 85
    if-nez v2, :cond_3

    .line 86
    .line 87
    iget v10, v8, LV1/e;->b:I

    .line 88
    .line 89
    if-ne v1, v10, :cond_0

    .line 90
    .line 91
    move-wide v15, v11

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-wide v13, v2, Lk2/H;->d:J

    .line 94
    .line 95
    if-nez v9, :cond_4

    .line 96
    .line 97
    invoke-virtual {v2}, Lk2/H;->b()Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-nez v10, :cond_0

    .line 102
    .line 103
    move-wide v15, v11

    .line 104
    iget-wide v11, v8, LV1/e;->c:J

    .line 105
    .line 106
    cmp-long v10, v13, v11

    .line 107
    .line 108
    if-nez v10, :cond_0

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    move-wide v15, v11

    .line 112
    iget-wide v10, v9, Lk2/H;->d:J

    .line 113
    .line 114
    cmp-long v10, v13, v10

    .line 115
    .line 116
    if-nez v10, :cond_0

    .line 117
    .line 118
    iget v10, v2, Lk2/H;->b:I

    .line 119
    .line 120
    iget v11, v9, Lk2/H;->b:I

    .line 121
    .line 122
    if-ne v10, v11, :cond_0

    .line 123
    .line 124
    iget v10, v2, Lk2/H;->c:I

    .line 125
    .line 126
    iget v11, v9, Lk2/H;->c:I

    .line 127
    .line 128
    if-ne v10, v11, :cond_0

    .line 129
    .line 130
    :goto_2
    iget-wide v10, v8, LV1/e;->c:J

    .line 131
    .line 132
    cmp-long v12, v10, v15

    .line 133
    .line 134
    if-eqz v12, :cond_6

    .line 135
    .line 136
    cmp-long v12, v10, v6

    .line 137
    .line 138
    if-gez v12, :cond_5

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    if-nez v12, :cond_0

    .line 142
    .line 143
    sget v10, LQ1/x;->a:I

    .line 144
    .line 145
    iget-object v10, v5, LV1/e;->d:Lk2/H;

    .line 146
    .line 147
    if-eqz v10, :cond_0

    .line 148
    .line 149
    if-eqz v9, :cond_0

    .line 150
    .line 151
    move-object v5, v8

    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_6
    :goto_3
    move-object v5, v8

    .line 155
    move-wide v6, v10

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_7
    if-nez v5, :cond_8

    .line 159
    .line 160
    sget-object v4, LV1/f;->h:LE5/q;

    .line 161
    .line 162
    invoke-virtual {v4}, LE5/q;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    check-cast v4, Ljava/lang/String;

    .line 167
    .line 168
    new-instance v5, LV1/e;

    .line 169
    .line 170
    invoke-direct {v5, v0, v4, v1, v2}, LV1/e;-><init>(LV1/f;Ljava/lang/String;ILk2/H;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :cond_8
    return-object v5
.end method

.method public final declared-synchronized d(LN1/N;Lk2/H;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p2, Lk2/H;->a:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, LV1/f;->b:LN1/L;

    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p1, p1, LN1/L;->c:I

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, LV1/f;->c(ILk2/H;)LV1/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, LV1/e;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public final e(LV1/a;)V
    .locals 7

    .line 1
    iget-object v0, p1, LV1/a;->b:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LV1/f;->f:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LV1/e;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, LV1/f;->a(LV1/e;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, LV1/f;->f:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, LV1/e;

    .line 35
    .line 36
    iget v1, p1, LV1/a;->c:I

    .line 37
    .line 38
    iget-object v2, p1, LV1/a;->d:Lk2/H;

    .line 39
    .line 40
    invoke-virtual {p0, v1, v2}, LV1/f;->c(ILk2/H;)LV1/e;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v3, v3, LV1/e;->a:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, p0, LV1/f;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, LV1/f;->f(LV1/a;)V

    .line 49
    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2}, Lk2/H;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-wide v3, v2, Lk2/H;->d:J

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    iget-wide v5, v0, LV1/e;->c:J

    .line 64
    .line 65
    cmp-long p1, v5, v3

    .line 66
    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    iget-object p1, v0, LV1/e;->d:Lk2/H;

    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    iget v0, p1, Lk2/H;->b:I

    .line 74
    .line 75
    iget v5, v2, Lk2/H;->b:I

    .line 76
    .line 77
    if-ne v0, v5, :cond_1

    .line 78
    .line 79
    iget p1, p1, Lk2/H;->c:I

    .line 80
    .line 81
    iget v0, v2, Lk2/H;->c:I

    .line 82
    .line 83
    if-eq p1, v0, :cond_2

    .line 84
    .line 85
    :cond_1
    new-instance p1, Lk2/H;

    .line 86
    .line 87
    iget-object v0, v2, Lk2/H;->a:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {p1, v0, v3, v4}, Lk2/H;-><init>(Ljava/lang/Object;J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v1, p1}, LV1/f;->c(ILk2/H;)LV1/e;

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, LV1/f;->d:LV1/i;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void
.end method

.method public final declared-synchronized f(LV1/a;)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LV1/f;->d:LV1/i;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, LV1/a;->b:LN1/N;

    .line 8
    .line 9
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :cond_0
    :try_start_1
    iget-object v0, p1, LV1/a;->d:Lk2/H;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iget-wide v0, v0, Lk2/H;->d:J

    .line 22
    .line 23
    iget-object v2, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 24
    .line 25
    iget-object v3, p0, LV1/f;->f:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, LV1/e;

    .line 32
    .line 33
    const-wide/16 v3, -0x1

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-wide v5, v2, LV1/e;->c:J

    .line 38
    .line 39
    cmp-long v2, v5, v3

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-wide v5, p0, LV1/f;->g:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    const-wide/16 v7, 0x1

    .line 47
    .line 48
    add-long/2addr v5, v7

    .line 49
    :goto_0
    cmp-long v0, v0, v5

    .line 50
    .line 51
    if-gez v0, :cond_2

    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-void

    .line 55
    :cond_2
    :try_start_2
    iget-object v0, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 56
    .line 57
    iget-object v1, p0, LV1/f;->f:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, LV1/e;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-wide v1, v0, LV1/e;->c:J

    .line 68
    .line 69
    cmp-long v1, v1, v3

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    iget v0, v0, LV1/e;->b:I

    .line 74
    .line 75
    iget v1, p1, LV1/a;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :cond_3
    :try_start_3
    iget v0, p1, LV1/a;->c:I

    .line 85
    .line 86
    iget-object v1, p1, LV1/a;->d:Lk2/H;

    .line 87
    .line 88
    invoke-virtual {p0, v0, v1}, LV1/f;->c(ILk2/H;)LV1/e;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p0, LV1/f;->f:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    iget-object v1, v0, LV1/e;->a:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v1, p0, LV1/f;->f:Ljava/lang/String;

    .line 99
    .line 100
    :cond_4
    iget-object v1, p1, LV1/a;->d:Lk2/H;

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    invoke-virtual {v1}, Lk2/H;->b()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    new-instance v1, Lk2/H;

    .line 112
    .line 113
    iget-object v3, p1, LV1/a;->d:Lk2/H;

    .line 114
    .line 115
    iget-object v4, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 116
    .line 117
    iget-wide v5, v3, Lk2/H;->d:J

    .line 118
    .line 119
    iget v3, v3, Lk2/H;->b:I

    .line 120
    .line 121
    invoke-direct {v1, v4, v5, v6, v3}, Lk2/H;-><init>(Ljava/lang/Object;JI)V

    .line 122
    .line 123
    .line 124
    iget v3, p1, LV1/a;->c:I

    .line 125
    .line 126
    invoke-virtual {p0, v3, v1}, LV1/f;->c(ILk2/H;)LV1/e;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-boolean v3, v1, LV1/e;->e:Z

    .line 131
    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    iput-boolean v2, v1, LV1/e;->e:Z

    .line 135
    .line 136
    iget-object v1, p1, LV1/a;->b:LN1/N;

    .line 137
    .line 138
    iget-object v3, p1, LV1/a;->d:Lk2/H;

    .line 139
    .line 140
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v4, p0, LV1/f;->b:LN1/L;

    .line 143
    .line 144
    invoke-virtual {v1, v3, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 145
    .line 146
    .line 147
    iget-object v1, p0, LV1/f;->b:LN1/L;

    .line 148
    .line 149
    iget-object v3, p1, LV1/a;->d:Lk2/H;

    .line 150
    .line 151
    iget v3, v3, Lk2/H;->b:I

    .line 152
    .line 153
    invoke-virtual {v1, v3}, LN1/L;->d(I)J

    .line 154
    .line 155
    .line 156
    const-wide/16 v3, 0x0

    .line 157
    .line 158
    invoke-static {v3, v4}, LQ1/x;->W(J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    iget-object v1, p0, LV1/f;->b:LN1/L;

    .line 163
    .line 164
    iget-wide v7, v1, LN1/L;->e:J

    .line 165
    .line 166
    invoke-static {v7, v8}, LQ1/x;->W(J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    add-long/2addr v5, v7

    .line 171
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 172
    .line 173
    .line 174
    iget-object v1, p0, LV1/f;->d:LV1/i;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    :cond_5
    iget-boolean v1, v0, LV1/e;->e:Z

    .line 180
    .line 181
    if-nez v1, :cond_6

    .line 182
    .line 183
    iput-boolean v2, v0, LV1/e;->e:Z

    .line 184
    .line 185
    iget-object v1, p0, LV1/f;->d:LV1/i;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    :cond_6
    iget-object v1, v0, LV1/e;->a:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v3, p0, LV1/f;->f:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_8

    .line 199
    .line 200
    iget-boolean v1, v0, LV1/e;->f:Z

    .line 201
    .line 202
    if-nez v1, :cond_8

    .line 203
    .line 204
    iput-boolean v2, v0, LV1/e;->f:Z

    .line 205
    .line 206
    iget-object v1, p0, LV1/f;->d:LV1/i;

    .line 207
    .line 208
    iget-object v0, v0, LV1/e;->a:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v2, p1, LV1/a;->d:Lk2/H;

    .line 214
    .line 215
    if-eqz v2, :cond_7

    .line 216
    .line 217
    invoke-virtual {v2}, Lk2/H;->b()Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_7

    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_7
    invoke-virtual {v1}, LV1/i;->b()V

    .line 225
    .line 226
    .line 227
    iput-object v0, v1, LV1/i;->i:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {}, LV1/h;->f()Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, LV1/g;->j(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, LV1/g;->u(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iput-object v0, v1, LV1/i;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 242
    .line 243
    iget-object v0, p1, LV1/a;->b:LN1/N;

    .line 244
    .line 245
    iget-object p1, p1, LV1/a;->d:Lk2/H;

    .line 246
    .line 247
    invoke-virtual {v1, v0, p1}, LV1/i;->c(LN1/N;Lk2/H;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 248
    .line 249
    .line 250
    :cond_8
    :goto_1
    monitor-exit p0

    .line 251
    return-void

    .line 252
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 253
    throw p1
.end method

.method public final declared-synchronized g(LV1/a;I)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LV1/f;->d:LV1/i;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p2, 0x0

    .line 12
    :goto_0
    iget-object v0, p0, LV1/f;->c:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LV1/e;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, LV1/e;->a(LV1/a;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 41
    .line 42
    .line 43
    iget-boolean v2, v1, LV1/e;->e:Z

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object v2, v1, LV1/e;->a:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p0, LV1/f;->f:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-boolean v3, v1, LV1/e;->f:Z

    .line 60
    .line 61
    :cond_2
    if-eqz v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, v1}, LV1/f;->a(LV1/e;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    :goto_2
    iget-object v2, p0, LV1/f;->d:LV1/i;

    .line 70
    .line 71
    iget-object v1, v1, LV1/e;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, p1, v1}, LV1/i;->d(LV1/a;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-virtual {p0, p1}, LV1/f;->e(LV1/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw p1
.end method
