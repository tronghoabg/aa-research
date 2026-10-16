.class public abstract Lod/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Ljava/util/Set;

.field public static final c:Lmd/W;

.field public static final d:Lmd/W;

.field public static final e:Lmd/Z;

.field public static final f:Lmd/W;

.field public static final g:Lmd/Z;

.field public static final h:Lmd/W;

.field public static final i:Lmd/W;

.field public static final j:Lmd/W;

.field public static final k:Lmd/W;

.field public static final l:J

.field public static final m:Lod/o1;

.field public static final n:LB8/e;

.field public static final o:Lod/X;

.field public static final p:Lod/Y1;

.field public static final q:Lod/Y1;

.field public static final r:Lod/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const-class v1, Lod/a0;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sput-object v1, Lod/a0;->a:Ljava/util/logging/Logger;

    .line 14
    .line 15
    sget-object v1, Lmd/j0;->c:Lmd/j0;

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    new-array v2, v2, [Lmd/j0;

    .line 19
    .line 20
    sget-object v3, Lmd/j0;->f:Lmd/j0;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    aput-object v3, v2, v4

    .line 24
    .line 25
    sget-object v3, Lmd/j0;->h:Lmd/j0;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    aput-object v3, v2, v5

    .line 29
    .line 30
    sget-object v3, Lmd/j0;->i:Lmd/j0;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    aput-object v3, v2, v5

    .line 34
    .line 35
    sget-object v3, Lmd/j0;->l:Lmd/j0;

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    aput-object v3, v2, v5

    .line 39
    .line 40
    sget-object v3, Lmd/j0;->m:Lmd/j0;

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    aput-object v3, v2, v5

    .line 44
    .line 45
    sget-object v3, Lmd/j0;->n:Lmd/j0;

    .line 46
    .line 47
    const/4 v6, 0x5

    .line 48
    aput-object v3, v2, v6

    .line 49
    .line 50
    sget-object v3, Lmd/j0;->r:Lmd/j0;

    .line 51
    .line 52
    const/4 v6, 0x6

    .line 53
    aput-object v3, v2, v6

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sput-object v1, Lod/a0;->b:Ljava/util/Set;

    .line 64
    .line 65
    const-string v1, "US-ASCII"

    .line 66
    .line 67
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 68
    .line 69
    .line 70
    new-instance v1, Lod/Y1;

    .line 71
    .line 72
    const/16 v2, 0xb

    .line 73
    .line 74
    invoke-direct {v1, v2}, Lod/Y1;-><init>(I)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lmd/W;

    .line 78
    .line 79
    const-string v3, "grpc-timeout"

    .line 80
    .line 81
    invoke-direct {v2, v3, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 82
    .line 83
    .line 84
    sput-object v2, Lod/a0;->c:Lmd/W;

    .line 85
    .line 86
    sget-object v1, Lmd/b0;->d:Lmd/j;

    .line 87
    .line 88
    new-instance v2, Lmd/W;

    .line 89
    .line 90
    const-string v3, "grpc-encoding"

    .line 91
    .line 92
    invoke-direct {v2, v3, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 93
    .line 94
    .line 95
    sput-object v2, Lod/a0;->d:Lmd/W;

    .line 96
    .line 97
    new-instance v2, Lod/Y1;

    .line 98
    .line 99
    invoke-direct {v2, v0}, Lod/Y1;-><init>(I)V

    .line 100
    .line 101
    .line 102
    const-string v3, "grpc-accept-encoding"

    .line 103
    .line 104
    invoke-static {v3, v2}, Lmd/G;->a(Ljava/lang/String;Lod/Y1;)Lmd/Z;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    sput-object v2, Lod/a0;->e:Lmd/Z;

    .line 109
    .line 110
    new-instance v2, Lmd/W;

    .line 111
    .line 112
    const-string v3, "content-encoding"

    .line 113
    .line 114
    invoke-direct {v2, v3, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 115
    .line 116
    .line 117
    sput-object v2, Lod/a0;->f:Lmd/W;

    .line 118
    .line 119
    new-instance v2, Lod/Y1;

    .line 120
    .line 121
    invoke-direct {v2, v0}, Lod/Y1;-><init>(I)V

    .line 122
    .line 123
    .line 124
    const-string v0, "accept-encoding"

    .line 125
    .line 126
    invoke-static {v0, v2}, Lmd/G;->a(Ljava/lang/String;Lod/Y1;)Lmd/Z;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sput-object v0, Lod/a0;->g:Lmd/Z;

    .line 131
    .line 132
    new-instance v0, Lmd/W;

    .line 133
    .line 134
    const-string v2, "content-length"

    .line 135
    .line 136
    invoke-direct {v0, v2, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 137
    .line 138
    .line 139
    sput-object v0, Lod/a0;->h:Lmd/W;

    .line 140
    .line 141
    new-instance v0, Lmd/W;

    .line 142
    .line 143
    const-string v2, "content-type"

    .line 144
    .line 145
    invoke-direct {v0, v2, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 146
    .line 147
    .line 148
    sput-object v0, Lod/a0;->i:Lmd/W;

    .line 149
    .line 150
    new-instance v0, Lmd/W;

    .line 151
    .line 152
    const-string v2, "te"

    .line 153
    .line 154
    invoke-direct {v0, v2, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 155
    .line 156
    .line 157
    sput-object v0, Lod/a0;->j:Lmd/W;

    .line 158
    .line 159
    new-instance v0, Lmd/W;

    .line 160
    .line 161
    const-string v2, "user-agent"

    .line 162
    .line 163
    invoke-direct {v0, v2, v1}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 164
    .line 165
    .line 166
    sput-object v0, Lod/a0;->k:Lmd/W;

    .line 167
    .line 168
    sget-object v0, Lk8/f;->c:Lk8/f;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 174
    .line 175
    const-wide/16 v1, 0x14

    .line 176
    .line 177
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v6

    .line 181
    sput-wide v6, Lod/a0;->l:J

    .line 182
    .line 183
    sget-object v3, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 184
    .line 185
    const-wide/16 v6, 0x2

    .line 186
    .line 187
    invoke-virtual {v3, v6, v7}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 191
    .line 192
    .line 193
    new-instance v0, Lod/o1;

    .line 194
    .line 195
    invoke-direct {v0}, Lod/o1;-><init>()V

    .line 196
    .line 197
    .line 198
    sput-object v0, Lod/a0;->m:Lod/o1;

    .line 199
    .line 200
    new-instance v0, LB8/e;

    .line 201
    .line 202
    const-string v1, "io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER"

    .line 203
    .line 204
    invoke-direct {v0, v1, v5}, LB8/e;-><init>(Ljava/lang/String;I)V

    .line 205
    .line 206
    .line 207
    sput-object v0, Lod/a0;->n:LB8/e;

    .line 208
    .line 209
    new-instance v0, Lod/X;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    sput-object v0, Lod/a0;->o:Lod/X;

    .line 215
    .line 216
    new-instance v0, Lod/Y1;

    .line 217
    .line 218
    const/16 v1, 0x8

    .line 219
    .line 220
    invoke-direct {v0, v1}, Lod/Y1;-><init>(I)V

    .line 221
    .line 222
    .line 223
    sput-object v0, Lod/a0;->p:Lod/Y1;

    .line 224
    .line 225
    new-instance v0, Lod/Y1;

    .line 226
    .line 227
    const/16 v1, 0x9

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lod/Y1;-><init>(I)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Lod/a0;->q:Lod/Y1;

    .line 233
    .line 234
    new-instance v0, Lod/Y;

    .line 235
    .line 236
    invoke-direct {v0, v4}, Lod/Y;-><init>(I)V

    .line 237
    .line 238
    .line 239
    sput-object v0, Lod/a0;->r:Lod/Y;

    .line 240
    .line 241
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/net/URI;
    .locals 7

    .line 1
    const-string v0, "authority"

    .line 2
    .line 3
    invoke-static {p0, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/net/URI;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    move-object v3, p0

    .line 13
    :try_start_1
    invoke-direct/range {v1 .. v6}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :catch_0
    move-exception v0

    .line 18
    :goto_0
    move-object p0, v0

    .line 19
    goto :goto_1

    .line 20
    :catch_1
    move-exception v0

    .line 21
    move-object v3, p0

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v1, "Invalid authority: "

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public static b(Ljava/io/Closeable;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 7
    .line 8
    const-string v1, "exception caught in closeQuietly"

    .line 9
    .line 10
    sget-object v2, Lod/a0;->a:Ljava/util/logging/Logger;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static c(Lmd/c;Lmd/b0;IZ)[Lmd/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lmd/c;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    new-array v2, v2, [Lmd/i;

    .line 10
    .line 11
    sget-object v3, Lmd/c;->i:Lmd/c;

    .line 12
    .line 13
    new-instance v3, LYf/B;

    .line 14
    .line 15
    invoke-direct {v3, p0, p2, p3}, LYf/B;-><init>(Lmd/c;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-ge p0, p2, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lmd/h;

    .line 30
    .line 31
    invoke-virtual {p2, v3, p1}, Lmd/h;->a(LYf/B;Lmd/b0;)Lmd/i;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    aput-object p2, v2, p0

    .line 36
    .line 37
    add-int/lit8 p0, p0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p0, Lod/a0;->o:Lod/X;

    .line 41
    .line 42
    aput-object p0, v2, v1

    .line 43
    .line 44
    return-object v2
.end method

.method public static d(Ljava/net/InetSocketAddress;)Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    const-class v0, Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    const-string v1, "getHostString"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-array v1, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :catch_0
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static e(Ljava/lang/String;)Lp8/r;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const/4 v3, 0x1

    .line 9
    new-array v3, v3, [Ljava/lang/Object;

    .line 10
    .line 11
    aput-object v2, v3, v0

    .line 12
    .line 13
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-static {v0, p0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    invoke-direct {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lp8/r;

    .line 30
    .line 31
    invoke-direct {v3, v0, p0, v2, v1}, Lp8/r;-><init>(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;Ljava/lang/Boolean;)V

    .line 32
    .line 33
    .line 34
    return-object v3
.end method

.method public static f(Lmd/K;Z)Lod/u;
    .locals 5

    .line 1
    iget-object v0, p0, Lmd/K;->a:Lmd/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lmd/e;->e()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lod/o0;

    .line 11
    .line 12
    iget-object v2, v0, Lod/o0;->v:Lod/k0;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v2, v0, Lod/o0;->k:Lmd/n0;

    .line 18
    .line 19
    new-instance v3, Lod/h0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-direct {v3, v0, v4}, Lod/h0;-><init>(Lod/o0;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    move-object v2, v1

    .line 29
    :goto_0
    if-eqz v2, :cond_3

    .line 30
    .line 31
    iget-object p0, p0, Lmd/K;->b:Lvd/p;

    .line 32
    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_2
    new-instance p1, Lod/T;

    .line 37
    .line 38
    invoke-direct {p1, p0, v2}, Lod/T;-><init>(Lvd/p;Lod/U0;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    iget-object v0, p0, Lmd/K;->c:Lmd/k0;

    .line 43
    .line 44
    invoke-virtual {v0}, Lmd/k0;->f()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    iget-boolean p0, p0, Lmd/K;->d:Z

    .line 51
    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    new-instance p0, Lod/T;

    .line 55
    .line 56
    invoke-static {v0}, Lod/a0;->h(Lmd/k0;)Lmd/k0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v0, Lod/s;->c:Lod/s;

    .line 61
    .line 62
    invoke-direct {p0, p1, v0}, Lod/T;-><init>(Lmd/k0;Lod/s;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_4
    if-nez p1, :cond_5

    .line 67
    .line 68
    new-instance p0, Lod/T;

    .line 69
    .line 70
    invoke-static {v0}, Lod/a0;->h(Lmd/k0;)Lmd/k0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v0, Lod/s;->a:Lod/s;

    .line 75
    .line 76
    invoke-direct {p0, p1, v0}, Lod/T;-><init>(Lmd/k0;Lod/s;)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_5
    return-object v1
.end method

.method public static g(I)Lmd/k0;
    .locals 3

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xc8

    .line 6
    .line 7
    if-ge p0, v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lmd/j0;->p:Lmd/j0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, 0x190

    .line 13
    .line 14
    if-eq p0, v0, :cond_5

    .line 15
    .line 16
    const/16 v0, 0x191

    .line 17
    .line 18
    if-eq p0, v0, :cond_4

    .line 19
    .line 20
    const/16 v0, 0x193

    .line 21
    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/16 v0, 0x194

    .line 25
    .line 26
    if-eq p0, v0, :cond_2

    .line 27
    .line 28
    const/16 v0, 0x1ad

    .line 29
    .line 30
    if-eq p0, v0, :cond_1

    .line 31
    .line 32
    const/16 v0, 0x1af

    .line 33
    .line 34
    if-eq p0, v0, :cond_5

    .line 35
    .line 36
    packed-switch p0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    sget-object v0, Lmd/j0;->e:Lmd/j0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :pswitch_0
    sget-object v0, Lmd/j0;->q:Lmd/j0;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object v0, Lmd/j0;->o:Lmd/j0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    sget-object v0, Lmd/j0;->j:Lmd/j0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    sget-object v0, Lmd/j0;->s:Lmd/j0;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    sget-object v0, Lmd/j0;->p:Lmd/j0;

    .line 55
    .line 56
    :goto_0
    invoke-virtual {v0}, Lmd/j0;->a()Lmd/k0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "HTTP status code "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v0, p0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x1f6
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Lmd/k0;)Lmd/k0;
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, LFe/e;->q(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lmd/k0;->a:Lmd/j0;

    .line 10
    .line 11
    sget-object v1, Lod/a0;->b:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lmd/k0;->m:Lmd/k0;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v2, "Inappropriate status code from control plane: "

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lmd/k0;->a:Lmd/j0;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object p0, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_1
    return-object p0
.end method
