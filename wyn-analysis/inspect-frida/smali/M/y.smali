.class public final LM/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/W;
.implements Lr9/P;


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# virtual methods
.method public a(Lmd/k;)Lod/W;
    .locals 0

    .line 1
    return-object p0
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ltd/a;)V
    .locals 10

    .line 1
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
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
    const-string v2, "writePayload should not be called multiple times"

    .line 12
    .line 13
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lm8/g;->b(Ljava/io/InputStream;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LM/y;->d:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    iget-object p1, p0, LM/y;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lod/W1;

    .line 25
    .line 26
    iget-object v0, p1, Lod/W1;->a:[Lmd/i;

    .line 27
    .line 28
    array-length v2, v0

    .line 29
    move v3, v1

    .line 30
    :goto_1
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    aget-object v4, v0, v3

    .line 33
    .line 34
    invoke-virtual {v4, v1}, Lmd/i;->i(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, [B

    .line 43
    .line 44
    array-length v2, v0

    .line 45
    int-to-long v5, v2

    .line 46
    array-length v0, v0

    .line 47
    int-to-long v7, v0

    .line 48
    iget-object v0, p1, Lod/W1;->a:[Lmd/i;

    .line 49
    .line 50
    array-length v2, v0

    .line 51
    move v9, v1

    .line 52
    :goto_2
    if-ge v9, v2, :cond_2

    .line 53
    .line 54
    aget-object v3, v0, v9

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual/range {v3 .. v8}, Lmd/i;->j(IJJ)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v9, v9, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, [B

    .line 66
    .line 67
    array-length v0, v0

    .line 68
    int-to-long v2, v0

    .line 69
    iget-object p1, p1, Lod/W1;->a:[Lmd/i;

    .line 70
    .line 71
    array-length v0, p1

    .line 72
    move v4, v1

    .line 73
    :goto_3
    if-ge v4, v0, :cond_3

    .line 74
    .line 75
    aget-object v5, p1, v4

    .line 76
    .line 77
    invoke-virtual {v5, v2, v3}, Lmd/i;->k(J)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, [B

    .line 86
    .line 87
    array-length v0, v0

    .line 88
    int-to-long v2, v0

    .line 89
    array-length v0, p1

    .line 90
    :goto_4
    if-ge v1, v0, :cond_4

    .line 91
    .line 92
    aget-object v4, p1, v1

    .line 93
    .line 94
    invoke-virtual {v4, v2, v3}, Lmd/i;->l(J)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    return-void

    .line 101
    :catch_0
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    new-instance v0, Ljava/lang/RuntimeException;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw v0
.end method

.method public close()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LM/y;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, LM/y;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, [B

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    const-string v1, "Lack of request message. GET request is only supported for unary requests"

    .line 13
    .line 14
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LM/y;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lod/b;

    .line 20
    .line 21
    check-cast v0, Lpd/k;

    .line 22
    .line 23
    iget-object v0, v0, Lpd/k;->o:Lad/L;

    .line 24
    .line 25
    iget-object v1, p0, LM/y;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lmd/b0;

    .line 28
    .line 29
    iget-object v2, p0, LM/y;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [B

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lad/L;->w(Lmd/b0;[B)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v0, p0, LM/y;->b:Ljava/lang/Object;

    .line 40
    .line 41
    return-void
.end method

.method public d()LF6/r;
    .locals 6

    .line 1
    new-instance v0, LF6/r;

    .line 2
    .line 3
    iget-object v1, p0, LM/y;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lmd/c0;

    .line 6
    .line 7
    iget-object v2, p0, LM/y;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, LM/y;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ltd/b;

    .line 14
    .line 15
    iget-object v4, p0, LM/y;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ltd/b;

    .line 18
    .line 19
    iget-boolean v5, p0, LM/y;->a:Z

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, LF6/r;-><init>(Lmd/c0;Ljava/lang/String;Ltd/b;Ltd/b;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public declared-synchronized e()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LM/y;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, LM/y;->i()Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, LJ9/h;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, LJ9/h;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LM/y;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v1, p0, LM/y;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ll9/d;

    .line 27
    .line 28
    check-cast v1, LL8/n;

    .line 29
    .line 30
    iget-object v2, v1, LL8/n;->c:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    invoke-virtual {v1, v2, v0}, LL8/n;->c(Ljava/util/concurrent/Executor;Ll9/b;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, LM/y;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    throw v0
.end method

.method public declared-synchronized f()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LM/y;->e()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v0, p0, LM/y;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ls8/g;

    .line 23
    .line 24
    invoke-virtual {v0}, Ls8/g;->k()Z

    .line 25
    .line 26
    .line 27
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :goto_0
    monitor-exit p0

    .line 29
    return v0

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw v0
.end method

.method public flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public g(LY2/B;Lu0/n;Z)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LM/y;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lt0/h;

    .line 6
    .line 7
    iget-boolean v2, v1, LM/y;->a:Z

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return v3

    .line 13
    :cond_0
    const/4 v2, 0x1

    .line 14
    :try_start_0
    iput-boolean v2, v1, LM/y;->a:Z

    .line 15
    .line 16
    iget-object v4, v1, LM/y;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lad/L;

    .line 19
    .line 20
    move-object/from16 v5, p1

    .line 21
    .line 22
    move-object/from16 v6, p2

    .line 23
    .line 24
    invoke-virtual {v4, v5, v6}, Lad/L;->u(LY2/B;Lu0/n;)LE5/b;

    .line 25
    .line 26
    .line 27
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    iget-object v5, v4, LE5/b;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    :try_start_1
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Ljava/lang/Iterable;

    .line 37
    .line 38
    instance-of v7, v6, Ljava/util/Collection;

    .line 39
    .line 40
    if-eqz v7, :cond_1

    .line 41
    .line 42
    move-object v7, v6

    .line 43
    check-cast v7, Ljava/util/Collection;

    .line 44
    .line 45
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Lp0/k;

    .line 70
    .line 71
    iget-boolean v8, v7, Lp0/k;->d:Z

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    .line 75
    iget-boolean v7, v7, Lp0/k;->g:Z

    .line 76
    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    :cond_3
    move v6, v3

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    :goto_0
    move v6, v2

    .line 82
    :goto_1
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Ljava/lang/Iterable;

    .line 87
    .line 88
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    iget-object v9, v1, LM/y;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Lba/a;

    .line 99
    .line 100
    if-eqz v8, :cond_8

    .line 101
    .line 102
    :try_start_2
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Lp0/k;

    .line 107
    .line 108
    if-nez v6, :cond_6

    .line 109
    .line 110
    invoke-static {v8}, Landroid/support/v4/media/session/b;->N(Lp0/k;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_5

    .line 115
    .line 116
    :cond_6
    iget v10, v8, Lp0/k;->h:I

    .line 117
    .line 118
    if-ne v10, v2, :cond_7

    .line 119
    .line 120
    move v15, v2

    .line 121
    goto :goto_3

    .line 122
    :cond_7
    move v15, v3

    .line 123
    :goto_3
    iget-object v10, v1, LM/y;->b:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v11, v10

    .line 126
    check-cast v11, Lt0/t;

    .line 127
    .line 128
    iget-wide v12, v8, Lp0/k;->c:J

    .line 129
    .line 130
    iget-object v10, v1, LM/y;->e:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v14, v10

    .line 133
    check-cast v14, Lt0/h;

    .line 134
    .line 135
    sget-object v10, Lt0/t;->R:Lt0/l;

    .line 136
    .line 137
    const/16 v16, 0x1

    .line 138
    .line 139
    invoke-virtual/range {v11 .. v16}, Lt0/t;->m(JLt0/h;ZZ)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lt0/h;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-nez v10, :cond_5

    .line 147
    .line 148
    iget-wide v10, v8, Lp0/k;->a:J

    .line 149
    .line 150
    invoke-virtual {v9, v10, v11, v0}, Lba/a;->i(JLjava/util/List;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Lt0/h;->clear()V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    iget-object v0, v9, Lba/a;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La2/v;

    .line 160
    .line 161
    invoke-virtual {v0}, La2/v;->y()V

    .line 162
    .line 163
    .line 164
    move/from16 v0, p3

    .line 165
    .line 166
    invoke-virtual {v9, v4, v0}, Lba/a;->q(LE5/b;Z)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    iget-boolean v2, v4, LE5/b;->b:Z

    .line 171
    .line 172
    if-eqz v2, :cond_9

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_9
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ljava/lang/Iterable;

    .line 180
    .line 181
    instance-of v4, v2, Ljava/util/Collection;

    .line 182
    .line 183
    if-eqz v4, :cond_a

    .line 184
    .line 185
    move-object v4, v2

    .line 186
    check-cast v4, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_a

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_c

    .line 204
    .line 205
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    check-cast v4, Lp0/k;

    .line 210
    .line 211
    const-string v5, "<this>"

    .line 212
    .line 213
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-wide v5, v4, Lp0/k;->c:J

    .line 217
    .line 218
    iget-wide v7, v4, Lp0/k;->f:J

    .line 219
    .line 220
    invoke-static {v5, v6, v7, v8}, Ld0/c;->e(JJ)J

    .line 221
    .line 222
    .line 223
    move-result-wide v5

    .line 224
    sget-wide v7, Ld0/c;->b:J

    .line 225
    .line 226
    invoke-static {v5, v6, v7, v8}, Ld0/c;->a(JJ)Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-nez v5, :cond_b

    .line 231
    .line 232
    invoke-virtual {v4}, Lp0/k;->b()Z

    .line 233
    .line 234
    .line 235
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 236
    if-eqz v4, :cond_b

    .line 237
    .line 238
    const/4 v2, 0x2

    .line 239
    goto :goto_5

    .line 240
    :cond_c
    :goto_4
    move v2, v3

    .line 241
    :goto_5
    or-int/2addr v0, v2

    .line 242
    iput-boolean v3, v1, LM/y;->a:Z

    .line 243
    .line 244
    return v0

    .line 245
    :goto_6
    iput-boolean v3, v1, LM/y;->a:Z

    .line 246
    .line 247
    throw v0
.end method

.method public h()V
    .locals 5

    .line 1
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lad/L;

    .line 4
    .line 5
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LM/y;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lba/a;

    .line 15
    .line 16
    iget-object v0, v0, Lba/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La2/v;

    .line 19
    .line 20
    iget-object v1, v0, La2/v;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LP/d;

    .line 23
    .line 24
    iget v2, v1, LP/d;->c:I

    .line 25
    .line 26
    if-lez v2, :cond_1

    .line 27
    .line 28
    iget-object v1, v1, LP/d;->a:[Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :cond_0
    aget-object v4, v1, v3

    .line 32
    .line 33
    check-cast v4, Lp0/e;

    .line 34
    .line 35
    invoke-virtual {v4}, Lp0/e;->C()V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    if-lt v3, v2, :cond_0

    .line 41
    .line 42
    :cond_1
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LP/d;

    .line 45
    .line 46
    invoke-virtual {v0}, LP/d;->e()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public i()Ljava/lang/Boolean;
    .locals 6

    .line 1
    const-string v0, "firebase_messaging_auto_init_enabled"

    .line 2
    .line 3
    iget-object v1, p0, LM/y;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ls8/g;

    .line 8
    .line 9
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 10
    .line 11
    .line 12
    const-string v2, "com.google.firebase.messaging"

    .line 13
    .line 14
    iget-object v1, v1, Ls8/g;->a:Landroid/content/Context;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v4, "auto_init"

    .line 22
    .line 23
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_0
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/16 v3, 0x80

    .line 49
    .line 50
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 57
    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    return-object v0

    .line 77
    :catch_0
    :cond_1
    const/4 v0, 0x0

    .line 78
    return-object v0
.end method

.method public isClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LM/y;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public start()V
    .locals 5

    .line 1
    iget-object v0, p0, LM/y;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/q;

    .line 4
    .line 5
    iget-object v0, v0, Lr9/q;->b:LJ5/n;

    .line 6
    .line 7
    iget-wide v0, v0, LJ5/n;->a:J

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p0, LM/y;->a:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-wide v0, Lr9/q;->d:J

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-wide v0, Lr9/q;->c:J

    .line 23
    .line 24
    :goto_0
    sget-object v2, Lw9/d;->g:Lw9/d;

    .line 25
    .line 26
    new-instance v3, Lkd/c;

    .line 27
    .line 28
    const/16 v4, 0x9

    .line 29
    .line 30
    invoke-direct {v3, p0, v4}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, LM/y;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lw9/e;

    .line 36
    .line 37
    invoke-virtual {v4, v2, v0, v1, v3}, Lw9/e;->b(Lw9/d;JLjava/lang/Runnable;)Lme/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, LM/y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lme/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lme/a;->n()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
