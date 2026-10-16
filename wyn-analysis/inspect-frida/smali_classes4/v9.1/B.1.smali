.class public final Lv9/B;
.super Lv9/b;
.source "SourceFile"


# static fields
.field public static final u:Lcom/google/protobuf/ByteString;


# instance fields
.field public final r:Lv9/o;

.field public s:Z

.field public t:Lcom/google/protobuf/ByteString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 2
    .line 3
    sput-object v0, Lv9/B;->u:Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lv9/m;Lw9/e;Lv9/o;Lv9/q;)V
    .locals 9

    .line 1
    sget-object v0, Lka/e0;->d:LF6/r;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v1, Lka/e0;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v0, Lka/e0;->d:LF6/r;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, LF6/r;->d()LM/y;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lmd/c0;->c:Lmd/c0;

    .line 17
    .line 18
    iput-object v2, v0, LM/y;->d:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "google.firestore.v1.Firestore"

    .line 21
    .line 22
    const-string v3, "Write"

    .line 23
    .line 24
    invoke-static {v2, v3}, LF6/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v0, LM/y;->e:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    iput-boolean v2, v0, LM/y;->a:Z

    .line 32
    .line 33
    invoke-static {}, Lka/K1;->e()Lka/K1;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 38
    .line 39
    new-instance v3, Ltd/b;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, v0, LM/y;->b:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {}, Lka/N1;->c()Lka/N1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Ltd/b;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 53
    .line 54
    .line 55
    iput-object v3, v0, LM/y;->c:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v0}, LM/y;->d()LF6/r;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lka/e0;->d:LF6/r;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    monitor-exit v1

    .line 68
    :cond_1
    move-object v4, v0

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    throw p1

    .line 72
    :goto_2
    sget-object v6, Lw9/d;->d:Lw9/d;

    .line 73
    .line 74
    sget-object v7, Lw9/d;->c:Lw9/d;

    .line 75
    .line 76
    move-object v2, p0

    .line 77
    move-object v3, p1

    .line 78
    move-object v5, p2

    .line 79
    move-object v8, p4

    .line 80
    invoke-direct/range {v2 .. v8}, Lv9/b;-><init>(Lv9/m;LF6/r;Lw9/e;Lw9/d;Lw9/d;Lv9/s;)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    iput-boolean p1, v2, Lv9/B;->s:Z

    .line 85
    .line 86
    sget-object p1, Lv9/B;->u:Lcom/google/protobuf/ByteString;

    .line 87
    .line 88
    iput-object p1, v2, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 89
    .line 90
    iput-object p3, v2, Lv9/B;->r:Lv9/o;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final e(Lcom/google/protobuf/MessageLite;)V
    .locals 5

    .line 1
    check-cast p1, Lka/N1;

    .line 2
    .line 3
    invoke-virtual {p1}, Lka/N1;->d()Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lv9/B;->s:Z

    .line 11
    .line 12
    iget-object p1, p0, Lv9/b;->l:Lv9/s;

    .line 13
    .line 14
    check-cast p1, Lv9/q;

    .line 15
    .line 16
    iget-object p1, p1, Lv9/q;->a:LE5/n0;

    .line 17
    .line 18
    iget-object v0, p1, LE5/n0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lv9/B;

    .line 21
    .line 22
    iget-object v1, v0, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 23
    .line 24
    iget-object v2, p1, LE5/n0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lr9/l;

    .line 27
    .line 28
    new-instance v3, Lng/a;

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    invoke-direct {v3, v4, v2, v1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v2, Lr9/l;->a:Lp7/b;

    .line 36
    .line 37
    const-string v2, "Set stream token"

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, LE5/n0;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/util/ArrayDeque;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lt9/i;

    .line 61
    .line 62
    iget-object v1, v1, Lt9/i;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lv9/B;->j(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-void
.end method

.method public final f(Lcom/google/protobuf/MessageLite;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    check-cast p1, Lka/N1;

    .line 4
    .line 5
    invoke-virtual {p1}, Lka/N1;->d()Lcom/google/protobuf/ByteString;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iput-object v2, p0, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    iget-object v4, p0, Lv9/b;->k:Lw9/l;

    .line 14
    .line 15
    iput-wide v2, v4, Lw9/l;->f:J

    .line 16
    .line 17
    invoke-virtual {p1}, Lka/N1;->b()Lcom/google/protobuf/Timestamp;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lv9/B;->r:Lv9/o;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {p1}, Lka/N1;->f()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    new-instance v7, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    move v3, v0

    .line 40
    :goto_0
    if-ge v3, v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Lka/N1;->e(I)Lka/Q1;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v4, v6}, Lv9/o;->d(Lka/Q1;Ls9/o;)Lt9/j;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    add-int/2addr v3, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p1, p0, Lv9/b;->l:Lv9/s;

    .line 56
    .line 57
    check-cast p1, Lv9/q;

    .line 58
    .line 59
    iget-object p1, p1, Lv9/q;->a:LE5/n0;

    .line 60
    .line 61
    iget-object v2, p1, LE5/n0;->m:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/ArrayDeque;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v5, v2

    .line 70
    check-cast v5, Lt9/i;

    .line 71
    .line 72
    iget-object v2, p1, LE5/n0;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lv9/B;

    .line 75
    .line 76
    iget-object v8, v2, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 77
    .line 78
    iget-object v2, v5, Lt9/i;->d:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ne v2, v3, :cond_1

    .line 89
    .line 90
    move v2, v1

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    move v2, v0

    .line 93
    :goto_1
    iget-object v3, v5, Lt9/i;->d:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    const/4 v10, 0x2

    .line 112
    new-array v10, v10, [Ljava/lang/Object;

    .line 113
    .line 114
    aput-object v4, v10, v0

    .line 115
    .line 116
    aput-object v9, v10, v1

    .line 117
    .line 118
    const-string v4, "Mutations sent %d must equal results received %d"

    .line 119
    .line 120
    invoke-static {v2, v4, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object v2, Ls9/g;->a:Lc9/b;

    .line 124
    .line 125
    move-object v9, v2

    .line 126
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-ge v0, v2, :cond_2

    .line 131
    .line 132
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lt9/j;

    .line 137
    .line 138
    iget-object v2, v2, Lt9/j;->a:Ls9/o;

    .line 139
    .line 140
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lt9/h;

    .line 145
    .line 146
    iget-object v4, v4, Lt9/h;->a:Ls9/h;

    .line 147
    .line 148
    invoke-virtual {v9, v4, v2}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    add-int/2addr v0, v1

    .line 153
    goto :goto_2

    .line 154
    :cond_2
    new-instance v4, LC8/i;

    .line 155
    .line 156
    const/16 v10, 0x11

    .line 157
    .line 158
    invoke-direct/range {v4 .. v10}, LC8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p1, LE5/n0;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Lad/L;

    .line 164
    .line 165
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lp9/s;

    .line 168
    .line 169
    invoke-virtual {v0}, Lp9/s;->e()Lp9/z;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v1, "handleSuccessfulWrite"

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Lp9/z;->a(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object v1, v4, LC8/i;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Lt9/i;

    .line 181
    .line 182
    iget v2, v1, Lt9/i;->a:I

    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    invoke-virtual {v0, v2, v3}, Lp9/z;->f(ILmd/k0;)V

    .line 186
    .line 187
    .line 188
    iget v1, v1, Lt9/i;->a:I

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Lp9/z;->j(I)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v0, Lp9/z;->a:Lr9/l;

    .line 194
    .line 195
    new-instance v2, Laa/f;

    .line 196
    .line 197
    const/16 v5, 0x14

    .line 198
    .line 199
    invoke-direct {v2, v5, v1, v4}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v1, v1, Lr9/l;->a:Lp7/b;

    .line 203
    .line 204
    const-string v4, "Acknowledge batch"

    .line 205
    .line 206
    invoke-virtual {v1, v4, v2}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lc9/c;

    .line 211
    .line 212
    invoke-virtual {v0, v1, v3}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, LE5/n0;->i()V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lv9/B;->s:Z

    .line 3
    .line 4
    invoke-super {p0}, Lv9/b;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv9/B;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lv9/B;->j(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final j(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lv9/b;->c()Z

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
    const-string v3, "Writing mutations requires an opened stream"

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lv9/B;->s:Z

    .line 14
    .line 15
    const-string v2, "Handshake must be complete before writing mutations"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lka/K1;->f()Lka/I1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lt9/h;

    .line 41
    .line 42
    iget-object v2, p0, Lv9/B;->r:Lv9/o;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lv9/o;->i(Lt9/h;)Lka/G1;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lka/I1;->a(Lka/G1;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p1, p0, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lka/I1;->c(Lcom/google/protobuf/ByteString;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lka/K1;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lv9/b;->i(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
