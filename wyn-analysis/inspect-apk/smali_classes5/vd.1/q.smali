.class public final Lvd/q;
.super Lvd/b;
.source "SourceFile"


# instance fields
.field public final d:Lmd/e;

.field public e:Lvd/k;

.field public f:Z

.field public g:Lmd/n;

.field public h:Lmd/N;

.field public final i:Lmd/e;

.field public final synthetic j:Lvd/r;


# direct methods
.method public constructor <init>(Lvd/r;LDd/c;Lvd/h;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/q;->j:Lvd/r;

    .line 5
    .line 6
    invoke-virtual {p2}, LDd/c;->G()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lmd/N;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lvd/q;->h:Lmd/N;

    .line 15
    .line 16
    new-instance v0, Lvd/f;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, p1, v1}, Lvd/f;-><init>(Lvd/b;Lmd/N;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, LDd/c;->L()Lmd/J;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v1, p2, LDd/c;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lmd/J;->x(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p2, LDd/c;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lmd/b;

    .line 39
    .line 40
    const-string v2, "attrs"

    .line 41
    .line 42
    invoke-static {v1, v2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p1, Lmd/J;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p2, p2, LDd/c;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, [[Ljava/lang/Object;

    .line 50
    .line 51
    array-length v1, p2

    .line 52
    const/4 v2, 0x2

    .line 53
    new-array v3, v2, [I

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    aput v2, v3, v4

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    aput v1, v3, v2

    .line 60
    .line 61
    const-class v1, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, [[Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v1, p1, Lmd/J;->c:Ljava/lang/Object;

    .line 70
    .line 71
    array-length v3, p2

    .line 72
    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lmd/J;->i(Lmd/N;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lmd/J;->j()LDd/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p3, p1}, Lvd/h;->b(LDd/c;)Lmd/e;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lvd/q;->d:Lmd/e;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-virtual {p3, p2}, Lvd/h;->b(LDd/c;)Lmd/e;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iput-object p1, p0, Lvd/q;->d:Lmd/e;

    .line 94
    .line 95
    :goto_0
    iget-object p1, p0, Lvd/q;->d:Lmd/e;

    .line 96
    .line 97
    invoke-virtual {p1}, Lmd/e;->d()Lmd/e;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lvd/q;->i:Lmd/e;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final c()Lmd/b;
    .locals 5

    .line 1
    iget-object v0, p0, Lvd/q;->e:Lvd/k;

    .line 2
    .line 3
    iget-object v1, p0, Lvd/q;->d:Lmd/e;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v1}, Lmd/e;->c()Lmd/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v1, Lvd/r;->n:Lmd/a;

    .line 15
    .line 16
    iget-object v2, p0, Lvd/q;->e:Lvd/k;

    .line 17
    .line 18
    new-instance v3, Ljava/util/IdentityHashMap;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v3, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v3, v2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_0

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lmd/a;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v3, v2, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    new-instance v0, Lmd/b;

    .line 74
    .line 75
    invoke-direct {v0, v3}, Lmd/b;-><init>(Ljava/util/IdentityHashMap;)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_2
    invoke-virtual {v1}, Lmd/e;->c()Lmd/b;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvd/q;->e:Lvd/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lvd/q;->e:Lvd/k;

    .line 7
    .line 8
    iget-object v0, v0, Lvd/k;->f:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-super {p0}, Lvd/b;->p()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final q(Lmd/N;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvd/q;->h:Lmd/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lvd/q;->s()Lmd/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lmd/e;->q(Lmd/N;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-object p1, p0, Lvd/q;->h:Lmd/N;

    .line 14
    .line 15
    new-instance v0, Lvd/f;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lvd/f;-><init>(Lvd/b;Lmd/N;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lvd/q;->s()Lmd/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, v0}, Lmd/e;->q(Lmd/N;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lvd/b;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lvd/r;->g(Ljava/util/List;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lvd/q;->j:Lvd/r;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p1}, Lvd/r;->g(Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v1, Lvd/r;->f:LS1/n;

    .line 22
    .line 23
    iget-object v4, p0, Lvd/q;->e:Lvd/k;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, LS1/n;->containsValue(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lvd/q;->e:Lvd/k;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lvd/q;->e:Lvd/k;

    .line 37
    .line 38
    iget-object v0, v0, Lvd/k;->f:Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lmd/u;

    .line 48
    .line 49
    iget-object v0, v0, Lmd/u;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/net/SocketAddress;

    .line 56
    .line 57
    iget-object v2, v1, Lvd/r;->f:LS1/n;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, LS1/n;->containsKey(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iget-object v1, v1, Lvd/r;->f:LS1/n;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, LS1/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lvd/k;

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Lvd/k;->a(Lvd/q;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_1
    invoke-virtual {p0}, Lvd/b;->b()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lvd/r;->g(Ljava/util/List;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-static {p1}, Lvd/r;->g(Ljava/util/List;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    iget-object v0, v1, Lvd/r;->f:LS1/n;

    .line 95
    .line 96
    invoke-virtual {p0}, Lmd/e;->a()Lmd/u;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-object v4, v4, Lmd/u;->a:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v0, v4}, LS1/n;->containsKey(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    iget-object v0, v1, Lvd/r;->f:LS1/n;

    .line 113
    .line 114
    invoke-virtual {p0}, Lmd/e;->a()Lmd/u;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v1, v1, Lmd/u;->a:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, LS1/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lvd/k;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iput-object v2, p0, Lvd/q;->e:Lvd/k;

    .line 134
    .line 135
    iget-object v1, v0, Lvd/k;->f:Ljava/util/HashSet;

    .line 136
    .line 137
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object v1, v0, Lvd/k;->b:Lt6/q;

    .line 141
    .line 142
    iget-object v2, v1, Lt6/q;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 145
    .line 146
    const-wide/16 v3, 0x0

    .line 147
    .line 148
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v1, Lt6/q;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 154
    .line 155
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, Lvd/k;->c:Lt6/q;

    .line 159
    .line 160
    iget-object v1, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 163
    .line 164
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 165
    .line 166
    .line 167
    iget-object v0, v0, Lt6/q;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 170
    .line 171
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_2
    invoke-virtual {p0}, Lvd/b;->b()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Lvd/r;->g(Ljava/util/List;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_3

    .line 184
    .line 185
    invoke-static {p1}, Lvd/r;->g(Ljava/util/List;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    .line 191
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lmd/u;

    .line 196
    .line 197
    iget-object v0, v0, Lmd/u;->a:Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Ljava/net/SocketAddress;

    .line 204
    .line 205
    iget-object v2, v1, Lvd/r;->f:LS1/n;

    .line 206
    .line 207
    invoke-virtual {v2, v0}, LS1/n;->containsKey(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_3

    .line 212
    .line 213
    iget-object v1, v1, Lvd/r;->f:LS1/n;

    .line 214
    .line 215
    invoke-virtual {v1, v0}, LS1/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Lvd/k;

    .line 220
    .line 221
    invoke-virtual {v0, p0}, Lvd/k;->a(Lvd/q;)V

    .line 222
    .line 223
    .line 224
    :cond_3
    :goto_0
    iget-object v0, p0, Lvd/q;->d:Lmd/e;

    .line 225
    .line 226
    invoke-virtual {v0, p1}, Lmd/e;->r(Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method

.method public final s()Lmd/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/q;->d:Lmd/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lvd/q;->f:Z

    .line 3
    .line 4
    iget-object v1, p0, Lvd/q;->h:Lmd/N;

    .line 5
    .line 6
    sget-object v2, Lmd/k0;->n:Lmd/k0;

    .line 7
    .line 8
    invoke-virtual {v2}, Lmd/k0;->f()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    xor-int/2addr v3, v0

    .line 13
    const-string v4, "The error status must not be OK"

    .line 14
    .line 15
    invoke-static {v4, v3}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lmd/n;

    .line 19
    .line 20
    sget-object v4, Lmd/m;->c:Lmd/m;

    .line 21
    .line 22
    invoke-direct {v3, v4, v2}, Lmd/n;-><init>(Lmd/m;Lmd/k0;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, v3}, Lmd/N;->a(Lmd/n;)V

    .line 26
    .line 27
    .line 28
    new-array v0, v0, [Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    aput-object p0, v0, v1

    .line 32
    .line 33
    iget-object v1, p0, Lvd/q;->i:Lmd/e;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const-string v3, "Subchannel ejected: {0}"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3, v0}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "OutlierDetectionSubchannel{addresses="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lvd/q;->d:Lmd/e;

    .line 9
    .line 10
    invoke-virtual {v1}, Lmd/e;->b()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7d

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
