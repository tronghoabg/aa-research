.class public final Lod/N0;
.super Lmd/y;
.source "SourceFile"


# static fields
.field public static final A:J

.field public static final B:La2/v;

.field public static final C:Lmd/t;

.field public static final D:Lmd/l;

.field public static final E:Ljava/lang/reflect/Method;

.field public static final y:Ljava/util/logging/Logger;

.field public static final z:J


# instance fields
.field public final a:La2/v;

.field public final b:La2/v;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lmd/g0;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Lmd/t;

.field public final i:Lmd/l;

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:J

.field public final n:J

.field public final o:Z

.field public final p:Lmd/C;

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:La2/v;

.field public final x:Lcom/google/android/gms/ads/nativead/l;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "Unable to apply census stats"

    .line 2
    .line 3
    const-class v1, Lod/N0;

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
    sput-object v1, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 14
    .line 15
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 16
    .line 17
    const-wide/16 v2, 0x1e

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    sput-wide v1, Lod/N0;->z:J

    .line 24
    .line 25
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v2, 0x1

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    sput-wide v1, Lod/N0;->A:J

    .line 34
    .line 35
    sget-object v1, Lod/a0;->p:Lod/Y1;

    .line 36
    .line 37
    new-instance v2, La2/v;

    .line 38
    .line 39
    const/16 v3, 0x11

    .line 40
    .line 41
    invoke-direct {v2, v1, v3}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lod/N0;->B:La2/v;

    .line 45
    .line 46
    sget-object v1, Lmd/t;->d:Lmd/t;

    .line 47
    .line 48
    sput-object v1, Lod/N0;->C:Lmd/t;

    .line 49
    .line 50
    sget-object v1, Lmd/l;->b:Lmd/l;

    .line 51
    .line 52
    sput-object v1, Lod/N0;->D:Lmd/l;

    .line 53
    .line 54
    :try_start_0
    const-string v1, "io.grpc.census.InternalCensusStatsAccessor"

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const-string v2, "getClientInterceptor"

    .line 61
    .line 62
    const/4 v3, 0x4

    .line 63
    new-array v3, v3, [Ljava/lang/Class;

    .line 64
    .line 65
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    aput-object v4, v3, v5

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    aput-object v4, v3, v5

    .line 72
    .line 73
    const/4 v5, 0x2

    .line 74
    aput-object v4, v3, v5

    .line 75
    .line 76
    const/4 v5, 0x3

    .line 77
    aput-object v4, v3, v5

    .line 78
    .line 79
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_3

    .line 84
    :catch_0
    move-exception v1

    .line 85
    goto :goto_0

    .line 86
    :catch_1
    move-exception v1

    .line 87
    goto :goto_1

    .line 88
    :goto_0
    sget-object v2, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 89
    .line 90
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 91
    .line 92
    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :goto_1
    sget-object v2, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 97
    .line 98
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 99
    .line 100
    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :goto_2
    const/4 v0, 0x0

    .line 104
    :goto_3
    sput-object v0, Lod/N0;->E:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La2/v;Lcom/google/android/gms/ads/nativead/l;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lod/N0;->B:La2/v;

    .line 5
    .line 6
    iput-object v0, p0, Lod/N0;->a:La2/v;

    .line 7
    .line 8
    iput-object v0, p0, Lod/N0;->b:La2/v;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lod/N0;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    sget-object v0, Lmd/g0;->d:Ljava/util/logging/Logger;

    .line 18
    .line 19
    const-class v0, Lmd/g0;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    sget-object v1, Lmd/g0;->e:Lmd/g0;

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    const-class v1, Lmd/f0;

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :try_start_1
    const-class v3, Lod/P;

    .line 34
    .line 35
    sget-boolean v4, Lod/P;->a:Z

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v3

    .line 42
    :try_start_2
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 43
    .line 44
    const-string v5, "Unable to find DNS NameResolver"

    .line 45
    .line 46
    sget-object v6, Lmd/g0;->d:Ljava/util/logging/Logger;

    .line 47
    .line 48
    invoke-virtual {v6, v4, v5, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-class v3, Lmd/f0;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, Lmd/j;

    .line 62
    .line 63
    const/16 v5, 0x9

    .line 64
    .line 65
    invoke-direct {v4, v5}, Lmd/j;-><init>(I)V

    .line 66
    .line 67
    .line 68
    check-cast v2, Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1, v2, v3, v4}, Lmd/e;->f(Ljava/lang/Class;Ljava/util/List;Ljava/lang/ClassLoader;Lmd/i0;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    sget-object v2, Lmd/g0;->d:Ljava/util/logging/Logger;

    .line 81
    .line 82
    const-string v3, "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto/16 :goto_3

    .line 90
    .line 91
    :cond_0
    :goto_1
    new-instance v2, Lmd/g0;

    .line 92
    .line 93
    invoke-direct {v2}, Lmd/g0;-><init>()V

    .line 94
    .line 95
    .line 96
    sput-object v2, Lmd/g0;->e:Lmd/g0;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_1

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lmd/f0;

    .line 113
    .line 114
    sget-object v3, Lmd/g0;->d:Ljava/util/logging/Logger;

    .line 115
    .line 116
    new-instance v4, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v5, "Service loader found "

    .line 122
    .line 123
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    sget-object v3, Lmd/g0;->e:Lmd/g0;

    .line 137
    .line 138
    invoke-virtual {v3, v2}, Lmd/g0;->a(Lmd/f0;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_1
    sget-object v1, Lmd/g0;->e:Lmd/g0;

    .line 143
    .line 144
    invoke-virtual {v1}, Lmd/g0;->c()V

    .line 145
    .line 146
    .line 147
    :cond_2
    sget-object v1, Lmd/g0;->e:Lmd/g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    .line 149
    monitor-exit v0

    .line 150
    iput-object v1, p0, Lod/N0;->d:Lmd/g0;

    .line 151
    .line 152
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v0, p0, Lod/N0;->e:Ljava/util/ArrayList;

    .line 158
    .line 159
    const-string v0, "pick_first"

    .line 160
    .line 161
    iput-object v0, p0, Lod/N0;->g:Ljava/lang/String;

    .line 162
    .line 163
    sget-object v0, Lod/N0;->C:Lmd/t;

    .line 164
    .line 165
    iput-object v0, p0, Lod/N0;->h:Lmd/t;

    .line 166
    .line 167
    sget-object v0, Lod/N0;->D:Lmd/l;

    .line 168
    .line 169
    iput-object v0, p0, Lod/N0;->i:Lmd/l;

    .line 170
    .line 171
    sget-wide v0, Lod/N0;->z:J

    .line 172
    .line 173
    iput-wide v0, p0, Lod/N0;->j:J

    .line 174
    .line 175
    const/4 v0, 0x5

    .line 176
    iput v0, p0, Lod/N0;->k:I

    .line 177
    .line 178
    iput v0, p0, Lod/N0;->l:I

    .line 179
    .line 180
    const-wide/32 v0, 0x1000000

    .line 181
    .line 182
    .line 183
    iput-wide v0, p0, Lod/N0;->m:J

    .line 184
    .line 185
    const-wide/32 v0, 0x100000

    .line 186
    .line 187
    .line 188
    iput-wide v0, p0, Lod/N0;->n:J

    .line 189
    .line 190
    const/4 v0, 0x1

    .line 191
    iput-boolean v0, p0, Lod/N0;->o:Z

    .line 192
    .line 193
    sget-object v1, Lmd/C;->e:Lmd/C;

    .line 194
    .line 195
    iput-object v1, p0, Lod/N0;->p:Lmd/C;

    .line 196
    .line 197
    iput-boolean v0, p0, Lod/N0;->q:Z

    .line 198
    .line 199
    iput-boolean v0, p0, Lod/N0;->r:Z

    .line 200
    .line 201
    iput-boolean v0, p0, Lod/N0;->s:Z

    .line 202
    .line 203
    iput-boolean v0, p0, Lod/N0;->t:Z

    .line 204
    .line 205
    iput-boolean v0, p0, Lod/N0;->u:Z

    .line 206
    .line 207
    iput-boolean v0, p0, Lod/N0;->v:Z

    .line 208
    .line 209
    const-string v0, "target"

    .line 210
    .line 211
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iput-object p1, p0, Lod/N0;->f:Ljava/lang/String;

    .line 215
    .line 216
    iput-object p2, p0, Lod/N0;->w:La2/v;

    .line 217
    .line 218
    iput-object p3, p0, Lod/N0;->x:Lcom/google/android/gms/ads/nativead/l;

    .line 219
    .line 220
    return-void

    .line 221
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 222
    throw p1
.end method


# virtual methods
.method public final a()Lmd/S;
    .locals 25

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-instance v8, Lod/P0;

    .line 5
    .line 6
    new-instance v3, Lod/M0;

    .line 7
    .line 8
    iget-object v4, v2, Lod/N0;->w:La2/v;

    .line 9
    .line 10
    iget-object v4, v4, La2/v;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lpd/h;

    .line 13
    .line 14
    iget-wide v5, v4, Lpd/h;->h:J

    .line 15
    .line 16
    const-wide v9, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v5, v5, v9

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    move v15, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v15, 0x0

    .line 28
    :goto_0
    new-instance v9, Lpd/g;

    .line 29
    .line 30
    iget v5, v4, Lpd/h;->g:I

    .line 31
    .line 32
    invoke-static {v5}, LA/f;->f(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    if-ne v5, v0, :cond_1

    .line 40
    .line 41
    move-object v12, v6

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 44
    .line 45
    iget v1, v4, Lpd/h;->g:I

    .line 46
    .line 47
    invoke-static {v1}, Lpd/f;->p(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v3, "Unknown negotiation type: "

    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    :try_start_0
    iget-object v5, v4, Lpd/h;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 62
    .line 63
    if-nez v5, :cond_3

    .line 64
    .line 65
    const-string v5, "Default"

    .line 66
    .line 67
    sget-object v7, Lqd/k;->d:Lqd/k;

    .line 68
    .line 69
    iget-object v7, v7, Lqd/k;->a:Ljava/security/Provider;

    .line 70
    .line 71
    invoke-static {v5, v7}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iput-object v5, v4, Lpd/h;->e:Ljavax/net/ssl/SSLSocketFactory;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto/16 :goto_c

    .line 84
    .line 85
    :cond_3
    :goto_1
    iget-object v5, v4, Lpd/h;->e:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    move-object v12, v5

    .line 88
    :goto_2
    iget-wide v10, v4, Lpd/h;->h:J

    .line 89
    .line 90
    iget v5, v4, Lpd/h;->l:I

    .line 91
    .line 92
    iget-object v7, v4, Lpd/h;->b:Lod/Y1;

    .line 93
    .line 94
    move-wide/from16 v16, v10

    .line 95
    .line 96
    iget-object v10, v4, Lpd/h;->c:La2/v;

    .line 97
    .line 98
    iget-object v11, v4, Lpd/h;->d:La2/v;

    .line 99
    .line 100
    iget-object v13, v4, Lpd/h;->f:Lqd/b;

    .line 101
    .line 102
    iget v14, v4, Lpd/h;->k:I

    .line 103
    .line 104
    move/from16 v23, v0

    .line 105
    .line 106
    const/16 v24, 0x0

    .line 107
    .line 108
    iget-wide v0, v4, Lpd/h;->i:J

    .line 109
    .line 110
    iget v4, v4, Lpd/h;->j:I

    .line 111
    .line 112
    move-wide/from16 v18, v0

    .line 113
    .line 114
    move/from16 v20, v4

    .line 115
    .line 116
    move/from16 v21, v5

    .line 117
    .line 118
    move-object/from16 v22, v7

    .line 119
    .line 120
    invoke-direct/range {v9 .. v22}, Lpd/g;-><init>(La2/v;La2/v;Ljavax/net/ssl/SSLSocketFactory;Lqd/b;IZJJIILod/Y1;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Lod/Y1;

    .line 124
    .line 125
    const/4 v0, 0x7

    .line 126
    invoke-direct {v4, v0}, Lod/Y1;-><init>(I)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lod/a0;->p:Lod/Y1;

    .line 130
    .line 131
    new-instance v5, La2/v;

    .line 132
    .line 133
    const/16 v1, 0x11

    .line 134
    .line 135
    invoke-direct {v5, v0, v1}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    sget-object v1, Lod/a0;->r:Lod/Y;

    .line 139
    .line 140
    new-instance v7, Ljava/util/ArrayList;

    .line 141
    .line 142
    iget-object v0, v2, Lod/N0;->c:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 145
    .line 146
    .line 147
    const-class v0, Lmd/y;

    .line 148
    .line 149
    monitor-enter v0

    .line 150
    monitor-exit v0

    .line 151
    iget-boolean v0, v2, Lod/N0;->r:Z

    .line 152
    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    sget-object v0, Lod/N0;->E:Ljava/lang/reflect/Method;

    .line 156
    .line 157
    if-eqz v0, :cond_4

    .line 158
    .line 159
    :try_start_1
    iget-boolean v10, v2, Lod/N0;->s:Z

    .line 160
    .line 161
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    iget-boolean v11, v2, Lod/N0;->t:Z

    .line 166
    .line 167
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    iget-boolean v12, v2, Lod/N0;->u:Z

    .line 172
    .line 173
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    const/4 v13, 0x4

    .line 178
    new-array v13, v13, [Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v10, v13, v24

    .line 181
    .line 182
    aput-object v11, v13, v23

    .line 183
    .line 184
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 185
    .line 186
    const/4 v11, 0x2

    .line 187
    aput-object v10, v13, v11

    .line 188
    .line 189
    const/4 v10, 0x3

    .line 190
    aput-object v12, v13, v10

    .line 191
    .line 192
    invoke-virtual {v0, v6, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lud/g;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :catch_1
    move-exception v0

    .line 200
    goto :goto_3

    .line 201
    :catch_2
    move-exception v0

    .line 202
    goto :goto_4

    .line 203
    :goto_3
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 204
    .line 205
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 206
    .line 207
    const-string v12, "Unable to apply census stats"

    .line 208
    .line 209
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :goto_4
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 214
    .line 215
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 216
    .line 217
    const-string v12, "Unable to apply census stats"

    .line 218
    .line 219
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    :goto_5
    move-object v0, v6

    .line 223
    :goto_6
    if-eqz v0, :cond_5

    .line 224
    .line 225
    move/from16 v10, v24

    .line 226
    .line 227
    invoke-virtual {v7, v10, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_5
    iget-boolean v0, v2, Lod/N0;->v:Z

    .line 231
    .line 232
    if-eqz v0, :cond_6

    .line 233
    .line 234
    :try_start_2
    const-string v0, "io.grpc.census.InternalCensusTracingAccessor"

    .line 235
    .line 236
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v10, "getClientInterceptor"

    .line 241
    .line 242
    const/4 v11, 0x0

    .line 243
    new-array v12, v11, [Ljava/lang/Class;

    .line 244
    .line 245
    invoke-virtual {v0, v10, v12}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-array v10, v11, [Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v0, v6, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, Lud/g;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3

    .line 256
    .line 257
    move-object v6, v0

    .line 258
    goto :goto_b

    .line 259
    :catch_3
    move-exception v0

    .line 260
    goto :goto_7

    .line 261
    :catch_4
    move-exception v0

    .line 262
    goto :goto_8

    .line 263
    :catch_5
    move-exception v0

    .line 264
    goto :goto_9

    .line 265
    :catch_6
    move-exception v0

    .line 266
    goto :goto_a

    .line 267
    :goto_7
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 268
    .line 269
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 270
    .line 271
    const-string v12, "Unable to apply census stats"

    .line 272
    .line 273
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    goto :goto_b

    .line 277
    :goto_8
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 278
    .line 279
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 280
    .line 281
    const-string v12, "Unable to apply census stats"

    .line 282
    .line 283
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 284
    .line 285
    .line 286
    goto :goto_b

    .line 287
    :goto_9
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 288
    .line 289
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 290
    .line 291
    const-string v12, "Unable to apply census stats"

    .line 292
    .line 293
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    goto :goto_b

    .line 297
    :goto_a
    sget-object v10, Lod/N0;->y:Ljava/util/logging/Logger;

    .line 298
    .line 299
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 300
    .line 301
    const-string v12, "Unable to apply census stats"

    .line 302
    .line 303
    invoke-virtual {v10, v11, v12, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :goto_b
    if-eqz v6, :cond_6

    .line 307
    .line 308
    const/4 v10, 0x0

    .line 309
    invoke-virtual {v7, v10, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_6
    move-object v6, v1

    .line 313
    move-object v1, v3

    .line 314
    move-object v3, v9

    .line 315
    invoke-direct/range {v1 .. v7}, Lod/M0;-><init>(Lod/N0;Lpd/g;Lod/Y1;La2/v;Lod/Y;Ljava/util/ArrayList;)V

    .line 316
    .line 317
    .line 318
    invoke-direct {v8, v1}, Lod/P0;-><init>(Lod/M0;)V

    .line 319
    .line 320
    .line 321
    return-object v8

    .line 322
    :goto_c
    new-instance v1, Ljava/lang/RuntimeException;

    .line 323
    .line 324
    const-string v2, "TLS Provider failure"

    .line 325
    .line 326
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    throw v1
.end method
