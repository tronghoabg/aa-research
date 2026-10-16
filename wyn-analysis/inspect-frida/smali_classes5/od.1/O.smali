.class public final Lod/O;
.super Lmd/y;
.source "SourceFile"


# static fields
.field public static final s:Ljava/util/logging/Logger;

.field public static final t:Ljava/util/Set;

.field public static final u:Z

.field public static final v:Z

.field public static final w:Z

.field public static x:Ljava/lang/String;


# instance fields
.field public final a:Lod/o1;

.field public final b:Ljava/util/Random;

.field public volatile c:Lod/M;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Lod/Y1;

.field public final i:J

.field public final j:Lmd/n0;

.field public final k:Lj/E;

.field public l:Z

.field public m:Z

.field public n:Ljava/util/concurrent/Executor;

.field public final o:Z

.field public final p:Lg2/k;

.field public q:Z

.field public r:Lmd/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-class v0, Lod/O;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lod/O;->s:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v2, Ljava/util/HashSet;

    .line 14
    .line 15
    const-string v3, "clientLanguage"

    .line 16
    .line 17
    const-string v4, "percentage"

    .line 18
    .line 19
    const-string v5, "clientHostname"

    .line 20
    .line 21
    const-string v6, "serviceConfig"

    .line 22
    .line 23
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    sput-object v2, Lod/O;->t:Ljava/util/Set;

    .line 39
    .line 40
    const-string v2, "io.grpc.internal.DnsNameResolverProvider.enable_jndi"

    .line 41
    .line 42
    const-string v3, "true"

    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, "io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost"

    .line 49
    .line 50
    const-string v4, "false"

    .line 51
    .line 52
    invoke-static {v3, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v5, "io.grpc.internal.DnsNameResolverProvider.enable_service_config"

    .line 57
    .line 58
    invoke-static {v5, v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    sput-boolean v2, Lod/O;->u:Z

    .line 67
    .line 68
    invoke-static {v3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    sput-boolean v2, Lod/O;->v:Z

    .line 73
    .line 74
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    sput-boolean v2, Lod/O;->w:Z

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :try_start_0
    const-string v2, "od.p0"

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    invoke-static {v2, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-class v2, Lod/N;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2

    .line 97
    const/4 v2, 0x0

    .line 98
    :try_start_1
    new-array v3, v2, [Ljava/lang/Class;

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 110
    if-nez v0, :cond_0

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    throw v0

    .line 114
    :cond_0
    :try_start_3
    new-instance v0, Ljava/lang/ClassCastException;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 122
    .line 123
    const-string v3, "Can\'t construct JndiResourceResolverFactory, skipping."

    .line 124
    .line 125
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :catch_1
    move-exception v0

    .line 130
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 131
    .line 132
    const-string v3, "Can\'t find JndiResourceResolverFactory ctor, skipping."

    .line 133
    .line 134
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catch_2
    move-exception v0

    .line 139
    goto :goto_0

    .line 140
    :catch_3
    move-exception v0

    .line 141
    goto :goto_1

    .line 142
    :goto_0
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 143
    .line 144
    const-string v3, "Unable to cast JndiResourceResolverFactory, skipping."

    .line 145
    .line 146
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :goto_1
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 151
    .line 152
    const-string v3, "Unable to find JndiResourceResolverFactory, skipping."

    .line 153
    .line 154
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    :goto_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LQ9/a;Lod/Y1;Lj/E;Z)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v2, Ljava/util/Random;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, Lod/O;->b:Ljava/util/Random;

    .line 12
    .line 13
    sget-object v2, Lod/M;->a:Lod/M;

    .line 14
    .line 15
    iput-object v2, p0, Lod/O;->c:Lod/M;

    .line 16
    .line 17
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lod/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    const-string v2, "args"

    .line 25
    .line 26
    invoke-static {p2, v2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lod/O;->h:Lod/Y1;

    .line 30
    .line 31
    const-string p3, "name"

    .line 32
    .line 33
    invoke-static {p1, p3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p3, "//"

    .line 37
    .line 38
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-static {p3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move v2, v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v2, v1

    .line 55
    :goto_0
    const-string v3, "Invalid DNS name: %s"

    .line 56
    .line 57
    invoke-static {v2, v3, p1}, LFe/e;->r(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    iput-object p1, p0, Lod/O;->e:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lod/O;->f:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/net/URI;->getPort()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    const/4 v2, -0x1

    .line 79
    if-ne p1, v2, :cond_1

    .line 80
    .line 81
    iget p1, p2, LQ9/a;->b:I

    .line 82
    .line 83
    iput p1, p0, Lod/O;->g:I

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {p3}, Ljava/net/URI;->getPort()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, Lod/O;->g:I

    .line 91
    .line 92
    :goto_1
    iget-object p1, p2, LQ9/a;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Lod/o1;

    .line 95
    .line 96
    const-string p3, "proxyDetector"

    .line 97
    .line 98
    invoke-static {p1, p3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lod/O;->a:Lod/o1;

    .line 102
    .line 103
    const-wide/16 v2, 0x0

    .line 104
    .line 105
    if-eqz p5, :cond_2

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_2
    const-string p1, "networkaddress.cache.ttl"

    .line 109
    .line 110
    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    const-wide/16 v4, 0x1e

    .line 115
    .line 116
    if-eqz p3, :cond_3

    .line 117
    .line 118
    :try_start_0
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    goto :goto_2

    .line 123
    :catch_0
    sget-object p5, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 124
    .line 125
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/4 v7, 0x3

    .line 130
    new-array v7, v7, [Ljava/lang/Object;

    .line 131
    .line 132
    aput-object p1, v7, v1

    .line 133
    .line 134
    aput-object p3, v7, v0

    .line 135
    .line 136
    const/4 p1, 0x2

    .line 137
    aput-object v6, v7, p1

    .line 138
    .line 139
    sget-object p1, Lod/O;->s:Ljava/util/logging/Logger;

    .line 140
    .line 141
    const-string p3, "Property({0}) valid is not valid number format({1}), fall back to default({2})"

    .line 142
    .line 143
    invoke-virtual {p1, p5, p3, v7}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    :goto_2
    cmp-long p1, v4, v2

    .line 147
    .line 148
    if-lez p1, :cond_4

    .line 149
    .line 150
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 151
    .line 152
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v2

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move-wide v2, v4

    .line 158
    :goto_3
    iput-wide v2, p0, Lod/O;->i:J

    .line 159
    .line 160
    iput-object p4, p0, Lod/O;->k:Lj/E;

    .line 161
    .line 162
    iget-object p1, p2, LQ9/a;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p1, Lmd/n0;

    .line 165
    .line 166
    const-string p3, "syncContext"

    .line 167
    .line 168
    invoke-static {p1, p3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Lod/O;->j:Lmd/n0;

    .line 172
    .line 173
    iget-object p1, p2, LQ9/a;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, Lod/D0;

    .line 176
    .line 177
    iput-object p1, p0, Lod/O;->n:Ljava/util/concurrent/Executor;

    .line 178
    .line 179
    if-nez p1, :cond_5

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_5
    move v0, v1

    .line 183
    :goto_4
    iput-boolean v0, p0, Lod/O;->o:Z

    .line 184
    .line 185
    iget-object p1, p2, LQ9/a;->e:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Lg2/k;

    .line 188
    .line 189
    const-string p2, "serviceConfigParser"

    .line 190
    .line 191
    invoke-static {p1, p2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iput-object p1, p0, Lod/O;->p:Lg2/k;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 198
    .line 199
    new-array p2, v0, [Ljava/lang/Object;

    .line 200
    .line 201
    aput-object p3, p2, v1

    .line 202
    .line 203
    const-string p3, "nameUri (%s) doesn\'t have an authority"

    .line 204
    .line 205
    invoke-static {p3, p2}, LFe/g;->E(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1
.end method

.method public static n(Ljava/util/Map;Ljava/util/Random;Ljava/lang/String;)Ljava/util/Map;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Lod/O;->t:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "Bad key: %s"

    .line 34
    .line 35
    invoke-static {v4, v5, v3}, LU8/v0;->p0(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v2, "clientLanguage"

    .line 40
    .line 41
    invoke-static {v2, p0}, Lod/r0;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_6

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    const-string v4, "java"

    .line 70
    .line 71
    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    :cond_2
    const-string v2, "percentage"

    .line 78
    .line 79
    invoke-static {v2, p0}, Lod/r0;->e(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Double;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Double;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/16 v4, 0x64

    .line 90
    .line 91
    if-ltz v3, :cond_3

    .line 92
    .line 93
    if-gt v3, v4, :cond_3

    .line 94
    .line 95
    move v5, v1

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move v5, v0

    .line 98
    :goto_1
    const-string v6, "Bad percentage: %s"

    .line 99
    .line 100
    invoke-static {v5, v6, v2}, LU8/v0;->p0(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v4}, Ljava/util/Random;->nextInt(I)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-lt p1, v3, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    const-string p1, "clientHostname"

    .line 111
    .line 112
    invoke-static {p1, p0}, Lod/r0;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_7

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 148
    return-object p0

    .line 149
    :cond_7
    :goto_3
    const-string p1, "serviceConfig"

    .line 150
    .line 151
    invoke-static {p1, p0}, Lod/r0;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    if-eqz p2, :cond_8

    .line 156
    .line 157
    return-object p2

    .line 158
    :cond_8
    new-instance p2, LE5/Q;

    .line 159
    .line 160
    const-string v2, "key \'%s\' missing in \'%s\'"

    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    new-array v3, v3, [Ljava/lang/Object;

    .line 164
    .line 165
    aput-object p0, v3, v0

    .line 166
    .line 167
    aput-object p1, v3, v1

    .line 168
    .line 169
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    const/16 p1, 0xc

    .line 174
    .line 175
    invoke-direct {p2, p0, p1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    throw p2
.end method

.method public static o()Ljava/util/ArrayList;
    .locals 7

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "grpc_config="

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    new-array v4, v4, [Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    aput-object v2, v4, v5

    .line 39
    .line 40
    sget-object v2, Lod/O;->s:Ljava/util/logging/Logger;

    .line 41
    .line 42
    const-string v5, "Ignoring non service config {0}"

    .line 43
    .line 44
    invoke-virtual {v2, v3, v5, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/16 v3, 0xc

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "Failed to close"

    .line 55
    .line 56
    sget-object v4, Lod/q0;->a:Ljava/util/logging/Logger;

    .line 57
    .line 58
    new-instance v5, Lra/a;

    .line 59
    .line 60
    new-instance v6, Ljava/io/StringReader;

    .line 61
    .line 62
    invoke-direct {v6, v2}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v5, v6}, Lra/a;-><init>(Ljava/io/Reader;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-static {v5}, Lod/q0;->a(Lra/a;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :try_start_1
    invoke-virtual {v5}, Lra/a;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v5

    .line 77
    sget-object v6, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 78
    .line 79
    invoke-virtual {v4, v6, v3, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    instance-of v3, v2, Ljava/util/List;

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    check-cast v2, Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v2}, Lod/r0;->a(Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v3, "wrong type "

    .line 100
    .line 101
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    :try_start_2
    invoke-virtual {v5}, Lra/a;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catch_1
    move-exception v1

    .line 121
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 122
    .line 123
    invoke-virtual {v4, v2, v3, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    throw v0

    .line 127
    :cond_2
    return-object v1
.end method


# virtual methods
.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/O;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/O;->r:Lmd/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "not started"

    .line 9
    .line 10
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lod/O;->p()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lod/O;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lod/O;->m:Z

    .line 8
    .line 9
    iget-object v0, p0, Lod/O;->n:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lod/O;->o:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lod/O;->h:Lod/Y1;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lod/V1;->b(Lod/U1;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lod/O;->n:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method

.method public final k(Lmd/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/O;->r:Lmd/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "already started"

    .line 9
    .line 10
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lod/O;->o:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lod/O;->h:Lod/Y1;

    .line 18
    .line 19
    invoke-static {v0}, Lod/V1;->a(Lod/U1;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    iput-object v0, p0, Lod/O;->n:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    :cond_1
    iput-object p1, p0, Lod/O;->r:Lmd/e;

    .line 28
    .line 29
    invoke-virtual {p0}, Lod/O;->p()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final m()Lmd/J;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lod/O;->f:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v3, Lmd/J;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lod/O;->q()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iput-object v4, v3, Lmd/J;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    .line 15
    .line 16
    sget-boolean v4, Lod/O;->w:Z

    .line 17
    .line 18
    if-eqz v4, :cond_13

    .line 19
    .line 20
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 21
    .line 22
    sget-boolean v5, Lod/O;->u:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    :goto_0
    move v5, v0

    .line 27
    goto :goto_3

    .line 28
    :cond_0
    const-string v5, "localhost"

    .line 29
    .line 30
    invoke-virtual {v5, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    sget-boolean v5, Lod/O;->v:Z

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    const-string v5, ":"

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v5, v0

    .line 49
    move v6, v1

    .line 50
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-ge v5, v7, :cond_5

    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    const/16 v8, 0x2e

    .line 61
    .line 62
    if-eq v7, v8, :cond_4

    .line 63
    .line 64
    const/16 v8, 0x30

    .line 65
    .line 66
    if-lt v7, v8, :cond_3

    .line 67
    .line 68
    const/16 v8, 0x39

    .line 69
    .line 70
    if-gt v7, v8, :cond_3

    .line 71
    .line 72
    move v7, v1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v7, v0

    .line 75
    :goto_2
    and-int/2addr v6, v7

    .line 76
    :cond_4
    add-int/2addr v5, v1

    .line 77
    goto :goto_1

    .line 78
    :cond_5
    xor-int/lit8 v5, v6, 0x1

    .line 79
    .line 80
    :goto_3
    if-nez v5, :cond_6

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    iget-object v5, p0, Lod/O;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v5, :cond_12

    .line 90
    .line 91
    :goto_4
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    const/4 v5, 0x0

    .line 96
    if-nez v4, :cond_10

    .line 97
    .line 98
    iget-object v0, p0, Lod/O;->b:Ljava/util/Random;

    .line 99
    .line 100
    sget-object v1, Lod/O;->x:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v1, :cond_7

    .line 103
    .line 104
    :try_start_1
    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sput-object v1, Lod/O;->x:Ljava/lang/String;
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :catch_0
    move-exception v0

    .line 116
    new-instance v1, Ljava/lang/RuntimeException;

    .line 117
    .line 118
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :cond_7
    :goto_5
    sget-object v1, Lod/O;->x:Ljava/lang/String;

    .line 123
    .line 124
    :try_start_2
    invoke-static {}, Lod/O;->o()Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 128
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v4, v5

    .line 133
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_9

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, Ljava/util/Map;

    .line 144
    .line 145
    :try_start_3
    invoke-static {v4, v0, v1}, Lod/O;->n(Ljava/util/Map;Ljava/util/Random;Ljava/lang/String;)Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v4
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 149
    if-eqz v4, :cond_8

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :catch_1
    move-exception v0

    .line 153
    sget-object v1, Lmd/k0;->g:Lmd/k0;

    .line 154
    .line 155
    const-string v2, "failed to pick service config choice"

    .line 156
    .line 157
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1, v0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    new-instance v1, Lmd/d0;

    .line 166
    .line 167
    invoke-direct {v1, v0}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_9
    :goto_6
    if-nez v4, :cond_a

    .line 172
    .line 173
    move-object v1, v5

    .line 174
    goto :goto_8

    .line 175
    :cond_a
    new-instance v1, Lmd/d0;

    .line 176
    .line 177
    invoke-direct {v1, v4}, Lmd/d0;-><init>(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_8

    .line 181
    :catch_2
    move-exception v0

    .line 182
    goto :goto_7

    .line 183
    :catch_3
    move-exception v0

    .line 184
    :goto_7
    sget-object v1, Lmd/k0;->g:Lmd/k0;

    .line 185
    .line 186
    const-string v2, "failed to parse TXT records"

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1, v0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    new-instance v1, Lmd/d0;

    .line 197
    .line 198
    invoke-direct {v1, v0}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 199
    .line 200
    .line 201
    :goto_8
    if-eqz v1, :cond_11

    .line 202
    .line 203
    iget-object v0, v1, Lmd/d0;->a:Lmd/k0;

    .line 204
    .line 205
    if-eqz v0, :cond_b

    .line 206
    .line 207
    new-instance v5, Lmd/d0;

    .line 208
    .line 209
    invoke-direct {v5, v0}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_e

    .line 213
    .line 214
    :cond_b
    iget-object v0, v1, Lmd/d0;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Ljava/util/Map;

    .line 217
    .line 218
    iget-object v1, p0, Lod/O;->p:Lg2/k;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    :try_start_4
    iget-object v2, v1, Lg2/k;->d:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v2, Lod/a2;

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_5

    .line 228
    .line 229
    .line 230
    if-eqz v0, :cond_c

    .line 231
    .line 232
    :try_start_5
    invoke-static {v0}, Lod/S1;->o(Ljava/util/Map;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v4}, Lod/S1;->t(Ljava/util/List;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    goto :goto_9

    .line 241
    :catch_4
    move-exception v2

    .line 242
    goto :goto_a

    .line 243
    :cond_c
    move-object v4, v5

    .line 244
    :goto_9
    if-eqz v4, :cond_d

    .line 245
    .line 246
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-nez v6, :cond_d

    .line 251
    .line 252
    iget-object v2, v2, Lod/a2;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v2, Lmd/Q;

    .line 255
    .line 256
    invoke-static {v4, v2}, Lod/S1;->s(Ljava/util/List;Lmd/Q;)Lmd/d0;

    .line 257
    .line 258
    .line 259
    move-result-object v2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4

    .line 260
    goto :goto_b

    .line 261
    :goto_a
    :try_start_6
    sget-object v4, Lmd/k0;->g:Lmd/k0;

    .line 262
    .line 263
    const-string v6, "can\'t parse load balancer configuration"

    .line 264
    .line 265
    invoke-virtual {v4, v6}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v4, v2}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    new-instance v4, Lmd/d0;

    .line 274
    .line 275
    invoke-direct {v4, v2}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 276
    .line 277
    .line 278
    move-object v2, v4

    .line 279
    goto :goto_b

    .line 280
    :cond_d
    move-object v2, v5

    .line 281
    :goto_b
    if-nez v2, :cond_e

    .line 282
    .line 283
    goto :goto_c

    .line 284
    :cond_e
    iget-object v4, v2, Lmd/d0;->a:Lmd/k0;

    .line 285
    .line 286
    if-eqz v4, :cond_f

    .line 287
    .line 288
    new-instance v0, Lmd/d0;

    .line 289
    .line 290
    invoke-direct {v0, v4}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 291
    .line 292
    .line 293
    move-object v5, v0

    .line 294
    goto :goto_e

    .line 295
    :cond_f
    iget-object v5, v2, Lmd/d0;->b:Ljava/lang/Object;

    .line 296
    .line 297
    :goto_c
    iget-boolean v2, v1, Lg2/k;->a:Z

    .line 298
    .line 299
    iget v4, v1, Lg2/k;->b:I

    .line 300
    .line 301
    iget v1, v1, Lg2/k;->c:I

    .line 302
    .line 303
    invoke-static {v0, v2, v4, v1, v5}, Lod/S0;->a(Ljava/util/Map;ZIILjava/lang/Object;)Lod/S0;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    new-instance v1, Lmd/d0;

    .line 308
    .line 309
    invoke-direct {v1, v0}, Lmd/d0;-><init>(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_5

    .line 310
    .line 311
    .line 312
    :goto_d
    move-object v5, v1

    .line 313
    goto :goto_e

    .line 314
    :catch_5
    move-exception v0

    .line 315
    sget-object v1, Lmd/k0;->g:Lmd/k0;

    .line 316
    .line 317
    const-string v2, "failed to parse service config"

    .line 318
    .line 319
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1, v0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    new-instance v1, Lmd/d0;

    .line 328
    .line 329
    invoke-direct {v1, v0}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 330
    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_10
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 334
    .line 335
    new-array v1, v1, [Ljava/lang/Object;

    .line 336
    .line 337
    aput-object v2, v1, v0

    .line 338
    .line 339
    sget-object v0, Lod/O;->s:Ljava/util/logging/Logger;

    .line 340
    .line 341
    const-string v2, "No TXT records found for {0}"

    .line 342
    .line 343
    invoke-virtual {v0, v4, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_11
    :goto_e
    iput-object v5, v3, Lmd/J;->c:Ljava/lang/Object;

    .line 347
    .line 348
    goto :goto_f

    .line 349
    :cond_12
    new-instance v0, Ljava/lang/ClassCastException;

    .line 350
    .line 351
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :catch_6
    move-exception v0

    .line 356
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 357
    .line 358
    new-instance v4, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v5, "Unable to resolve host "

    .line 361
    .line 362
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v1, v0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iput-object v0, v3, Lmd/J;->b:Ljava/lang/Object;

    .line 381
    .line 382
    :cond_13
    :goto_f
    return-object v3
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lod/O;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lod/O;->m:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lod/O;->l:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lod/O;->i:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    iget-object v2, p0, Lod/O;->k:Lj/E;

    .line 26
    .line 27
    invoke-virtual {v2}, Lj/E;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    cmp-long v0, v2, v0

    .line 32
    .line 33
    if-lez v0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lod/O;->q:Z

    .line 37
    .line 38
    iget-object v0, p0, Lod/O;->n:Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    new-instance v1, Lod/A;

    .line 41
    .line 42
    iget-object v2, p0, Lod/O;->r:Lmd/e;

    .line 43
    .line 44
    invoke-direct {v1, p0, v2}, Lod/A;-><init>(Lod/O;Lmd/e;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final q()Ljava/util/List;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lod/O;->c:Lod/M;

    .line 3
    .line 4
    iget-object v2, p0, Lod/O;->f:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v2}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/net/InetAddress;

    .line 45
    .line 46
    new-instance v3, Lmd/u;

    .line 47
    .line 48
    new-instance v4, Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    iget v5, p0, Lod/O;->g:I

    .line 51
    .line 52
    invoke-direct {v4, v2, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v3, v4}, Lmd/u;-><init>(Ljava/net/SocketAddress;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception v0

    .line 70
    :try_start_1
    sget-object v1, Lk8/t;->a:Ljava/lang/Object;

    .line 71
    .line 72
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 73
    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    new-instance v1, Ljava/lang/RuntimeException;

    .line 77
    .line 78
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :cond_1
    move-object v1, v0

    .line 83
    check-cast v1, Ljava/lang/RuntimeException;

    .line 84
    .line 85
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_1
    if-eqz v0, :cond_2

    .line 87
    .line 88
    sget-object v2, Lod/O;->s:Ljava/util/logging/Logger;

    .line 89
    .line 90
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 91
    .line 92
    const-string v4, "Address resolution failure"

    .line 93
    .line 94
    invoke-virtual {v2, v3, v4, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    throw v1
.end method
