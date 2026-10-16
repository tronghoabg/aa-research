.class public final Lvd/v;
.super Lmd/O;
.source "SourceFile"


# static fields
.field public static final m:Ljava/util/logging/Logger;


# instance fields
.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Lmd/y;

.field public h:Z

.field public final i:Lod/m1;

.field public j:Lmd/m;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public l:Lmd/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lvd/v;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lvd/v;->m:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lmd/y;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, Lod/m1;

    .line 12
    .line 13
    invoke-direct {v0}, Lod/m1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lvd/v;->i:Lod/m1;

    .line 17
    .line 18
    iput-object p1, p0, Lvd/v;->g:Lmd/y;

    .line 19
    .line 20
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 21
    .line 22
    const-string v0, "Created"

    .line 23
    .line 24
    sget-object v1, Lvd/v;->m:Ljava/util/logging/Logger;

    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    new-instance v0, Ljava/util/Random;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lvd/v;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    new-instance p1, Lvd/t;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lvd/v;->l:Lmd/M;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Lmd/L;)Lmd/k0;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lvd/v;->h:Z

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lvd/v;->g(Lmd/L;)Lu0/w0;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v0, p1, Lu0/w0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lmd/k0;

    .line 12
    .line 13
    :try_start_1
    invoke-virtual {v0}, Lmd/k0;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iput-boolean v1, p0, Lvd/v;->h:Z

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Lvd/v;->j()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lu0/w0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lvd/i;

    .line 44
    .line 45
    iget-object v3, v2, Lvd/i;->b:Lvd/e;

    .line 46
    .line 47
    invoke-virtual {v3}, Lvd/e;->f()V

    .line 48
    .line 49
    .line 50
    sget-object v3, Lmd/m;->e:Lmd/m;

    .line 51
    .line 52
    iput-object v3, v2, Lvd/i;->d:Lmd/m;

    .line 53
    .line 54
    sget-object v3, Lvd/v;->m:Ljava/util/logging/Logger;

    .line 55
    .line 56
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 57
    .line 58
    iget-object v2, v2, Lvd/i;->a:Lvd/j;

    .line 59
    .line 60
    const-string v5, "Child balancer {0} deleted"

    .line 61
    .line 62
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iput-boolean v1, p0, Lvd/v;->h:Z

    .line 67
    .line 68
    return-object v0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    iput-boolean v1, p0, Lvd/v;->h:Z

    .line 71
    .line 72
    throw p1
.end method

.method public final c(Lmd/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvd/v;->j:Lmd/m;

    .line 2
    .line 3
    sget-object v1, Lmd/m;->b:Lmd/m;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lmd/m;->c:Lmd/m;

    .line 8
    .line 9
    new-instance v1, Lod/z0;

    .line 10
    .line 11
    invoke-static {p1}, Lmd/K;->a(Lmd/k0;)Lmd/K;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v1, p1}, Lod/z0;-><init>(Lmd/K;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lvd/v;->g:Lmd/y;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lmd/y;->l(Lmd/m;Lmd/M;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 2
    .line 3
    sget-object v1, Lvd/v;->m:Ljava/util/logging/Logger;

    .line 4
    .line 5
    const-string v2, "Shutdown"

    .line 6
    .line 7
    invoke-virtual {v1, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lvd/i;

    .line 31
    .line 32
    iget-object v4, v3, Lvd/i;->b:Lvd/e;

    .line 33
    .line 34
    invoke-virtual {v4}, Lvd/e;->f()V

    .line 35
    .line 36
    .line 37
    sget-object v4, Lmd/m;->e:Lmd/m;

    .line 38
    .line 39
    iput-object v4, v3, Lvd/i;->d:Lmd/m;

    .line 40
    .line 41
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 42
    .line 43
    iget-object v3, v3, Lvd/i;->a:Lvd/j;

    .line 44
    .line 45
    const-string v5, "Child balancer {0} deleted"

    .line 46
    .line 47
    invoke-virtual {v1, v4, v5, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final g(Lmd/L;)Lu0/w0;
    .locals 13

    .line 1
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 2
    .line 3
    sget-object v1, Lvd/v;->m:Ljava/util/logging/Logger;

    .line 4
    .line 5
    const-string v2, "Received resolution result: {0}"

    .line 6
    .line 7
    invoke-virtual {v1, v0, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p1, Lmd/L;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    iget-object v5, p0, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lmd/u;

    .line 34
    .line 35
    new-instance v6, Lvd/j;

    .line 36
    .line 37
    invoke-direct {v6, v4}, Lvd/j;-><init>(Lmd/u;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lvd/i;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v4, Lod/z0;

    .line 53
    .line 54
    sget-object v5, Lmd/K;->e:Lmd/K;

    .line 55
    .line 56
    invoke-direct {v4, v5}, Lod/z0;-><init>(Lmd/K;)V

    .line 57
    .line 58
    .line 59
    new-instance v5, Lvd/i;

    .line 60
    .line 61
    iget-object v7, p0, Lvd/v;->i:Lod/m1;

    .line 62
    .line 63
    invoke-direct {v5, p0, v6, v7, v4}, Lvd/i;-><init>(Lvd/v;Lvd/j;Lod/m1;Lod/z0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    const/4 v4, 0x0

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    sget-object v0, Lmd/k0;->n:Lmd/k0;

    .line 78
    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v2, "NameResolver returned no usable address. "

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v0, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lvd/v;->c(Lmd/k0;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lu0/w0;

    .line 101
    .line 102
    invoke-direct {v0, v4, p1}, Lu0/w0;-><init>(Ljava/io/Serializable;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const/4 v6, 0x1

    .line 119
    const/4 v7, 0x0

    .line 120
    if-eqz v3, :cond_b

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    check-cast v9, Lvd/i;

    .line 137
    .line 138
    iget-object v9, v9, Lvd/i;->c:Lod/m1;

    .line 139
    .line 140
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    check-cast v9, Lvd/i;

    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-nez v9, :cond_4

    .line 154
    .line 155
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Lvd/i;

    .line 160
    .line 161
    invoke-interface {v5, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lvd/i;

    .line 170
    .line 171
    iget-boolean v9, v3, Lvd/i;->f:Z

    .line 172
    .line 173
    if-eqz v9, :cond_5

    .line 174
    .line 175
    iput-boolean v7, v3, Lvd/i;->f:Z

    .line 176
    .line 177
    :cond_5
    :goto_2
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Lvd/i;

    .line 182
    .line 183
    instance-of v7, v8, Lmd/u;

    .line 184
    .line 185
    if-eqz v7, :cond_6

    .line 186
    .line 187
    new-instance v7, Lvd/j;

    .line 188
    .line 189
    move-object v9, v8

    .line 190
    check-cast v9, Lmd/u;

    .line 191
    .line 192
    invoke-direct {v7, v9}, Lvd/j;-><init>(Lmd/u;)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    instance-of v7, v8, Lvd/j;

    .line 197
    .line 198
    const-string v9, "key is wrong type"

    .line 199
    .line 200
    invoke-static {v9, v7}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 201
    .line 202
    .line 203
    move-object v7, v8

    .line 204
    check-cast v7, Lvd/j;

    .line 205
    .line 206
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-eqz v10, :cond_8

    .line 215
    .line 216
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    check-cast v10, Lmd/u;

    .line 221
    .line 222
    new-instance v11, Lvd/j;

    .line 223
    .line 224
    invoke-direct {v11, v10}, Lvd/j;-><init>(Lmd/u;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v7, v11}, Lvd/j;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-eqz v11, :cond_7

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    move-object v10, v4

    .line 235
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v9, " no longer present in load balancer children"

    .line 244
    .line 245
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v10, v7}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    sget-object v7, Lmd/b;->b:Lmd/b;

    .line 256
    .line 257
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    sget-object v9, Lmd/b;->b:Lmd/b;

    .line 262
    .line 263
    sget-object v10, Lmd/O;->e:Lmd/a;

    .line 264
    .line 265
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 266
    .line 267
    new-instance v12, Ljava/util/IdentityHashMap;

    .line 268
    .line 269
    invoke-direct {v12, v6}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v10, v11}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    iget-object v6, v9, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    :cond_9
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    if-eqz v9, :cond_a

    .line 290
    .line 291
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    check-cast v9, Ljava/util/Map$Entry;

    .line 296
    .line 297
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    invoke-virtual {v12, v10}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    if-nez v10, :cond_9

    .line 306
    .line 307
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    check-cast v10, Lmd/a;

    .line 312
    .line 313
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    invoke-virtual {v12, v10, v9}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_a
    new-instance v6, Lmd/b;

    .line 322
    .line 323
    invoke-direct {v6, v12}, Lmd/b;-><init>(Ljava/util/IdentityHashMap;)V

    .line 324
    .line 325
    .line 326
    new-instance v9, Lmd/L;

    .line 327
    .line 328
    invoke-direct {v9, v7, v6, v4}, Lmd/L;-><init>(Ljava/util/List;Lmd/b;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v5, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    check-cast v6, Lvd/i;

    .line 336
    .line 337
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget-boolean v6, v3, Lvd/i;->f:Z

    .line 341
    .line 342
    if-nez v6, :cond_3

    .line 343
    .line 344
    iget-object v3, v3, Lvd/i;->b:Lvd/e;

    .line 345
    .line 346
    invoke-virtual {v3, v9}, Lvd/e;->d(Lmd/L;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_b
    new-instance p1, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-static {v2}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v2, v7}, Ll8/K;->l(I)Ll8/I;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    :cond_c
    :goto_6
    invoke-virtual {v2}, Ll8/I;->hasNext()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-eqz v3, :cond_e

    .line 373
    .line 374
    invoke-virtual {v2}, Ll8/I;->next()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-nez v4, :cond_c

    .line 383
    .line 384
    invoke-virtual {v5, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    check-cast v3, Lvd/i;

    .line 389
    .line 390
    iget-boolean v4, v3, Lvd/i;->f:Z

    .line 391
    .line 392
    if-eqz v4, :cond_d

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_d
    iget-object v4, v3, Lvd/i;->g:Lvd/v;

    .line 396
    .line 397
    iget-object v4, v4, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 398
    .line 399
    iget-object v7, v3, Lvd/i;->a:Lvd/j;

    .line 400
    .line 401
    invoke-interface {v4, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    iput-boolean v6, v3, Lvd/i;->f:Z

    .line 405
    .line 406
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 407
    .line 408
    const-string v8, "Child balancer {0} deactivated"

    .line 409
    .line 410
    invoke-virtual {v1, v4, v8, v7}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :goto_7
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_e
    new-instance v0, Lu0/w0;

    .line 418
    .line 419
    sget-object v1, Lmd/k0;->e:Lmd/k0;

    .line 420
    .line 421
    invoke-direct {v0, p1, v1}, Lu0/w0;-><init>(Ljava/io/Serializable;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    return-object v0
.end method

.method public final h(Ljava/util/Collection;)Lvd/u;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lvd/i;

    .line 21
    .line 22
    iget-object v1, v1, Lvd/i;->e:Lmd/M;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Lvd/u;

    .line 29
    .line 30
    iget-object v1, p0, Lvd/v;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    .line 32
    invoke-direct {p1, v0, v1}, Lvd/u;-><init>(Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public final i(Lmd/m;Lmd/M;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/v;->j:Lmd/m;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lvd/v;->l:Lmd/M;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    :goto_0
    iget-object v0, p0, Lvd/v;->g:Lmd/y;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lmd/y;->l(Lmd/m;Lmd/M;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lvd/v;->j:Lmd/m;

    .line 21
    .line 22
    iput-object p2, p0, Lvd/v;->l:Lmd/M;

    .line 23
    .line 24
    return-void
.end method

.method public final j()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lvd/v;->f:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    sget-object v4, Lmd/m;->b:Lmd/m;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lvd/i;

    .line 29
    .line 30
    iget-boolean v5, v3, Lvd/i;->f:Z

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    iget-object v5, v3, Lvd/i;->d:Lmd/m;

    .line 35
    .line 36
    if-ne v5, v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lvd/i;

    .line 67
    .line 68
    iget-object v2, v2, Lvd/i;->d:Lmd/m;

    .line 69
    .line 70
    sget-object v3, Lmd/m;->a:Lmd/m;

    .line 71
    .line 72
    if-eq v2, v3, :cond_3

    .line 73
    .line 74
    sget-object v4, Lmd/m;->d:Lmd/m;

    .line 75
    .line 76
    if-ne v2, v4, :cond_2

    .line 77
    .line 78
    :cond_3
    new-instance v0, Lvd/t;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v3, v0}, Lvd/v;->i(Lmd/m;Lmd/M;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    sget-object v0, Lmd/m;->c:Lmd/m;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p0, v1}, Lvd/v;->h(Ljava/util/Collection;)Lvd/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0, v0, v1}, Lvd/v;->i(Lmd/m;Lmd/M;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p0, v0}, Lvd/v;->h(Ljava/util/Collection;)Lvd/u;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v4, v0}, Lvd/v;->i(Lmd/m;Lmd/M;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
