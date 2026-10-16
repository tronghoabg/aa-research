.class public final Lpd/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/y;


# static fields
.field public static final P:Ljava/util/Map;

.field public static final Q:Ljava/util/logging/Logger;


# instance fields
.field public final A:Ljavax/net/SocketFactory;

.field public final B:Ljavax/net/ssl/SSLSocketFactory;

.field public C:I

.field public final D:Ljava/util/LinkedList;

.field public final E:Lqd/b;

.field public F:Lod/u0;

.field public G:Z

.field public H:J

.field public I:J

.field public final J:Lg5/d;

.field public final K:I

.field public final L:Lod/a2;

.field public final M:Lod/g0;

.field public final N:Lmd/z;

.field public final O:I

.field public final a:Ljava/net/InetSocketAddress;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Random;

.field public final e:Lod/Y;

.field public final f:I

.field public final g:Lrd/j;

.field public h:LE5/b;

.field public i:Lpd/d;

.field public j:Lc7/l;

.field public final k:Ljava/lang/Object;

.field public final l:Lmd/F;

.field public m:I

.field public final n:Ljava/util/HashMap;

.field public final o:Ljava/util/concurrent/Executor;

.field public final p:Lod/P1;

.field public final q:Ljava/util/concurrent/ScheduledExecutorService;

.field public final r:I

.field public s:I

.field public t:LA7/p1;

.field public u:Lmd/b;

.field public v:Lmd/k0;

.field public w:Z

.field public x:Lod/f0;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    const-class v1, Lrd/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lrd/a;->b:Lrd/a;

    .line 9
    .line 10
    sget-object v2, Lmd/k0;->m:Lmd/k0;

    .line 11
    .line 12
    const-string v3, "No error: A GRPC status of OK should have been sent"

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object v1, Lrd/a;->c:Lrd/a;

    .line 22
    .line 23
    const-string v3, "Protocol error"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object v1, Lrd/a;->d:Lrd/a;

    .line 33
    .line 34
    const-string v3, "Internal error"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v1, Lrd/a;->e:Lrd/a;

    .line 44
    .line 45
    const-string v3, "Flow control error"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object v1, Lrd/a;->f:Lrd/a;

    .line 55
    .line 56
    const-string v3, "Stream closed"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object v1, Lrd/a;->g:Lrd/a;

    .line 66
    .line 67
    const-string v3, "Frame too large"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    sget-object v1, Lrd/a;->h:Lrd/a;

    .line 77
    .line 78
    sget-object v3, Lmd/k0;->n:Lmd/k0;

    .line 79
    .line 80
    const-string v4, "Refused stream"

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    sget-object v1, Lrd/a;->i:Lrd/a;

    .line 90
    .line 91
    sget-object v3, Lmd/k0;->f:Lmd/k0;

    .line 92
    .line 93
    const-string v4, "Cancelled"

    .line 94
    .line 95
    invoke-virtual {v3, v4}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    sget-object v1, Lrd/a;->j:Lrd/a;

    .line 103
    .line 104
    const-string v3, "Compression error"

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v1, Lrd/a;->k:Lrd/a;

    .line 114
    .line 115
    const-string v3, "Connect error"

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    sget-object v1, Lrd/a;->l:Lrd/a;

    .line 125
    .line 126
    sget-object v2, Lmd/k0;->k:Lmd/k0;

    .line 127
    .line 128
    const-string v3, "Enhance your calm"

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v1, Lrd/a;->m:Lrd/a;

    .line 138
    .line 139
    sget-object v2, Lmd/k0;->i:Lmd/k0;

    .line 140
    .line 141
    const-string v3, "Inadequate security"

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, Lpd/m;->P:Ljava/util/Map;

    .line 155
    .line 156
    const-class v0, Lpd/m;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 167
    .line 168
    return-void
.end method

.method public constructor <init>(Lpd/g;Ljava/net/InetSocketAddress;Ljava/lang/String;Lmd/b;Lmd/z;Lg5/d;)V
    .locals 5

    .line 1
    sget-object v0, Lod/a0;->r:Lod/Y;

    .line 2
    .line 3
    new-instance v1, Lrd/j;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/Random;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, p0, Lpd/m;->d:Ljava/util/Random;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v3, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v3, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iput v3, p0, Lpd/m;->C:I

    .line 34
    .line 35
    new-instance v3, Ljava/util/LinkedList;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v3, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 41
    .line 42
    new-instance v3, Lod/g0;

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-direct {v3, p0, v4}, Lod/g0;-><init>(Lmd/E;I)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lpd/m;->M:Lod/g0;

    .line 49
    .line 50
    const/16 v3, 0x7530

    .line 51
    .line 52
    iput v3, p0, Lpd/m;->O:I

    .line 53
    .line 54
    const-string v3, "address"

    .line 55
    .line 56
    invoke-static {p2, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object p2, p0, Lpd/m;->a:Ljava/net/InetSocketAddress;

    .line 60
    .line 61
    iput-object p3, p0, Lpd/m;->b:Ljava/lang/String;

    .line 62
    .line 63
    iget p3, p1, Lpd/g;->h:I

    .line 64
    .line 65
    iput p3, p0, Lpd/m;->r:I

    .line 66
    .line 67
    iget p3, p1, Lpd/g;->l:I

    .line 68
    .line 69
    iput p3, p0, Lpd/m;->f:I

    .line 70
    .line 71
    iget-object p3, p1, Lpd/g;->b:Ljava/util/concurrent/Executor;

    .line 72
    .line 73
    const-string v3, "executor"

    .line 74
    .line 75
    invoke-static {p3, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object p3, p0, Lpd/m;->o:Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    new-instance p3, Lod/P1;

    .line 81
    .line 82
    iget-object v3, p1, Lpd/g;->b:Ljava/util/concurrent/Executor;

    .line 83
    .line 84
    invoke-direct {p3, v3}, Lod/P1;-><init>(Ljava/util/concurrent/Executor;)V

    .line 85
    .line 86
    .line 87
    iput-object p3, p0, Lpd/m;->p:Lod/P1;

    .line 88
    .line 89
    iget-object p3, p1, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 90
    .line 91
    const-string v3, "scheduledExecutorService"

    .line 92
    .line 93
    invoke-static {p3, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iput-object p3, p0, Lpd/m;->q:Ljava/util/concurrent/ScheduledExecutorService;

    .line 97
    .line 98
    const/4 p3, 0x3

    .line 99
    iput p3, p0, Lpd/m;->m:I

    .line 100
    .line 101
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    iput-object p3, p0, Lpd/m;->A:Ljavax/net/SocketFactory;

    .line 106
    .line 107
    iget-object p3, p1, Lpd/g;->f:Ljavax/net/ssl/SSLSocketFactory;

    .line 108
    .line 109
    iput-object p3, p0, Lpd/m;->B:Ljavax/net/ssl/SSLSocketFactory;

    .line 110
    .line 111
    iget-object p3, p1, Lpd/g;->g:Lqd/b;

    .line 112
    .line 113
    const-string v3, "connectionSpec"

    .line 114
    .line 115
    invoke-static {p3, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object p3, p0, Lpd/m;->E:Lqd/b;

    .line 119
    .line 120
    const-string p3, "stopwatchFactory"

    .line 121
    .line 122
    invoke-static {v0, p3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, Lpd/m;->e:Lod/Y;

    .line 126
    .line 127
    iput-object v1, p0, Lpd/m;->g:Lrd/j;

    .line 128
    .line 129
    new-instance p3, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v0, "grpc-java-okhttp/1.62.2"

    .line 135
    .line 136
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    iput-object p3, p0, Lpd/m;->c:Ljava/lang/String;

    .line 144
    .line 145
    iput-object p5, p0, Lpd/m;->N:Lmd/z;

    .line 146
    .line 147
    iput-object p6, p0, Lpd/m;->J:Lg5/d;

    .line 148
    .line 149
    iget p3, p1, Lpd/g;->m:I

    .line 150
    .line 151
    iput p3, p0, Lpd/m;->K:I

    .line 152
    .line 153
    iget-object p1, p1, Lpd/g;->e:Lod/Y1;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance p1, Lod/a2;

    .line 159
    .line 160
    invoke-direct {p1}, Lod/a2;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, Lpd/m;->L:Lod/a2;

    .line 164
    .line 165
    const-class p1, Lpd/m;

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-static {p1, p2}, Lmd/F;->a(Ljava/lang/Class;Ljava/lang/String;)Lmd/F;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, p0, Lpd/m;->l:Lmd/F;

    .line 176
    .line 177
    sget-object p1, Lmd/b;->b:Lmd/b;

    .line 178
    .line 179
    sget-object p2, Lod/S1;->b:Lmd/a;

    .line 180
    .line 181
    new-instance p3, Ljava/util/IdentityHashMap;

    .line 182
    .line 183
    const/4 p5, 0x1

    .line 184
    invoke-direct {p3, p5}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, p2, p4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    iget-object p1, p1, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    if-eqz p2, :cond_1

    .line 205
    .line 206
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    check-cast p2, Ljava/util/Map$Entry;

    .line 211
    .line 212
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p4

    .line 216
    invoke-virtual {p3, p4}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p4

    .line 220
    if-nez p4, :cond_0

    .line 221
    .line 222
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p4

    .line 226
    check-cast p4, Lmd/a;

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-virtual {p3, p4, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_1
    new-instance p1, Lmd/b;

    .line 237
    .line 238
    invoke-direct {p1, p3}, Lmd/b;-><init>(Ljava/util/IdentityHashMap;)V

    .line 239
    .line 240
    .line 241
    iput-object p1, p0, Lpd/m;->u:Lmd/b;

    .line 242
    .line 243
    monitor-enter v2

    .line 244
    :try_start_0
    monitor-exit v2

    .line 245
    return-void

    .line 246
    :catchall_0
    move-exception p1

    .line 247
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    throw p1
.end method

.method public static g(Lpd/m;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lrd/a;->c:Lrd/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lpd/m;->y(Lrd/a;)Lmd/k0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1, p1}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0, p1}, Lpd/m;->u(ILrd/a;Lmd/k0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static h(Lpd/m;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "\r\n"

    .line 5
    .line 6
    const-string v1, "CONNECT "

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 10
    .line 11
    .line 12
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    iget-object v4, p0, Lpd/m;->A:Ljavax/net/SocketFactory;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {v4, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    goto/16 :goto_9

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {v4, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    .line 42
    .line 43
    .line 44
    move-result-object p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 45
    :goto_0
    const/4 v3, 0x1

    .line 46
    :try_start_2
    invoke-virtual {p2, v3}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 47
    .line 48
    .line 49
    iget v3, p0, Lpd/m;->O:I

    .line 50
    .line 51
    invoke-virtual {p2, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Lcg/b;->n(Ljava/net/Socket;)Lcg/d;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {p2}, Lcg/b;->j(Ljava/net/Socket;)Lcg/c;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v4}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p0, p1, p3, p4}, Lpd/m;->i(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lba/a;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 70
    iget-object p1, p0, Lba/a;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lqd/d;

    .line 73
    .line 74
    :try_start_3
    iget-object p0, p0, Lba/a;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lsd/a;

    .line 77
    .line 78
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 79
    .line 80
    iget-object p3, p0, Lsd/a;->a:Ljava/lang/String;

    .line 81
    .line 82
    iget p0, p0, Lsd/a;->b:I

    .line 83
    .line 84
    new-instance p4, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p3, ":"

    .line 93
    .line 94
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p0, " HTTP/1.1"

    .line 101
    .line 102
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {v4, p0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 113
    .line 114
    .line 115
    iget-object p0, p1, Lqd/d;->b:[Ljava/lang/String;

    .line 116
    .line 117
    array-length p0, p0

    .line 118
    div-int/lit8 p0, p0, 0x2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 119
    .line 120
    const/4 p3, 0x0

    .line 121
    move p4, p3

    .line 122
    :goto_1
    if-ge p4, p0, :cond_5

    .line 123
    .line 124
    mul-int/lit8 v1, p4, 0x2

    .line 125
    .line 126
    iget-object v5, p1, Lqd/d;->b:[Ljava/lang/String;

    .line 127
    .line 128
    if-ltz v1, :cond_2

    .line 129
    .line 130
    :try_start_4
    array-length v6, v5

    .line 131
    if-lt v1, v6, :cond_1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_1
    aget-object v6, v5, v1

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :goto_2
    move-object v2, p2

    .line 138
    goto/16 :goto_9

    .line 139
    .line 140
    :cond_2
    :goto_3
    move-object v6, v2

    .line 141
    :goto_4
    invoke-virtual {v4, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 142
    .line 143
    .line 144
    const-string v6, ": "

    .line 145
    .line 146
    invoke-virtual {v4, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 147
    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    if-ltz v1, :cond_4

    .line 152
    .line 153
    array-length v6, v5

    .line 154
    if-lt v1, v6, :cond_3

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_3
    aget-object v1, v5, v1

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_4
    :goto_5
    move-object v1, v2

    .line 161
    :goto_6
    invoke-interface {v4, v1}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 162
    .line 163
    .line 164
    invoke-interface {v4, v0}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 165
    .line 166
    .line 167
    add-int/lit8 p4, p4, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :catch_1
    move-exception p0

    .line 171
    goto :goto_2

    .line 172
    :cond_5
    invoke-virtual {v4, v0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Lcg/A;->flush()V

    .line 176
    .line 177
    .line 178
    invoke-static {v3}, Lpd/m;->s(Lcg/d;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, LE4/n;->q(Ljava/lang/String;)LE4/n;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :goto_7
    invoke-static {v3}, Lpd/m;->s(Lcg/d;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    const-string p4, ""

    .line 191
    .line 192
    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 196
    if-nez p1, :cond_6

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_6
    const/16 p1, 0xc8

    .line 200
    .line 201
    iget p4, p0, LE4/n;->b:I

    .line 202
    .line 203
    if-lt p4, p1, :cond_7

    .line 204
    .line 205
    const/16 p1, 0x12c

    .line 206
    .line 207
    if-ge p4, p1, :cond_7

    .line 208
    .line 209
    :try_start_5
    invoke-virtual {p2, p3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 210
    .line 211
    .line 212
    return-object p2

    .line 213
    :cond_7
    new-instance p1, Lcg/g;

    .line 214
    .line 215
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 216
    .line 217
    .line 218
    :try_start_6
    invoke-virtual {p2}, Ljava/net/Socket;->shutdownOutput()V

    .line 219
    .line 220
    .line 221
    const-wide/16 v0, 0x400

    .line 222
    .line 223
    invoke-virtual {v3, p1, v0, v1}, Lcg/d;->read(Lcg/g;J)J
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :catch_2
    move-exception p3

    .line 228
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string v1, "Unable to read body: "

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p3

    .line 242
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    invoke-virtual {p1, p3}, Lcg/g;->d0(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 250
    .line 251
    .line 252
    :goto_8
    :try_start_8
    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 253
    .line 254
    .line 255
    :catch_3
    :try_start_9
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 256
    .line 257
    iget-object p0, p0, LE4/n;->d:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p0, Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {p1}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    new-instance p3, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    const-string v0, "Response returned from proxy was not successful (expected 2xx, got "

    .line 271
    .line 272
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    const-string p4, " "

    .line 279
    .line 280
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string p0, "). Response body:\n"

    .line 287
    .line 288
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    sget-object p1, Lmd/k0;->n:Lmd/k0;

    .line 299
    .line 300
    invoke-virtual {p1, p0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    new-instance p1, Lmd/l0;

    .line 305
    .line 306
    invoke-direct {p1, p0}, Lmd/l0;-><init>(Lmd/k0;)V

    .line 307
    .line 308
    .line 309
    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    .line 310
    :goto_9
    if-eqz v2, :cond_8

    .line 311
    .line 312
    invoke-static {v2}, Lod/a0;->b(Ljava/io/Closeable;)V

    .line 313
    .line 314
    .line 315
    :cond_8
    sget-object p1, Lmd/k0;->n:Lmd/k0;

    .line 316
    .line 317
    const-string p2, "Failed trying to connect with proxy"

    .line 318
    .line 319
    invoke-virtual {p1, p2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1, p0}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    new-instance p1, Lmd/l0;

    .line 328
    .line 329
    invoke-direct {p1, p0}, Lmd/l0;-><init>(Lmd/k0;)V

    .line 330
    .line 331
    .line 332
    throw p1
.end method

.method public static s(Lcg/d;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    const-wide/16 v1, 0x1

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Lcg/d;->read(Lcg/g;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    const-wide/16 v5, -0x1

    .line 13
    .line 14
    cmp-long v3, v3, v5

    .line 15
    .line 16
    if-eqz v3, :cond_5

    .line 17
    .line 18
    iget-wide v3, v0, Lcg/g;->b:J

    .line 19
    .line 20
    sub-long/2addr v3, v1

    .line 21
    invoke-virtual {v0, v3, v4}, Lcg/g;->o(J)B

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    const-wide v6, 0x7fffffffffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    cmp-long p0, v6, v1

    .line 37
    .line 38
    if-ltz p0, :cond_4

    .line 39
    .line 40
    const-wide v1, 0x7fffffffffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    cmp-long p0, v6, v1

    .line 46
    .line 47
    const-wide/16 v8, 0x1

    .line 48
    .line 49
    if-nez p0, :cond_1

    .line 50
    .line 51
    :goto_0
    move-wide v4, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-long v1, v6, v8

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    const/16 v1, 0xa

    .line 57
    .line 58
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    invoke-virtual/range {v0 .. v5}, Lcg/g;->indexOf(BJJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    const-wide/16 v10, -0x1

    .line 65
    .line 66
    cmp-long p0, v1, v10

    .line 67
    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, Ldg/a;->b(Lcg/g;J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    iget-wide v1, v0, Lcg/g;->b:J

    .line 76
    .line 77
    cmp-long p0, v4, v1

    .line 78
    .line 79
    if-gez p0, :cond_3

    .line 80
    .line 81
    sub-long v1, v4, v8

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Lcg/g;->o(J)B

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    const/16 v1, 0xd

    .line 88
    .line 89
    if-ne p0, v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0, v4, v5}, Lcg/g;->o(J)B

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    const/16 v1, 0xa

    .line 96
    .line 97
    if-ne p0, v1, :cond_3

    .line 98
    .line 99
    invoke-static {v0, v4, v5}, Ldg/a;->b(Lcg/g;J)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :goto_2
    return-object p0

    .line 104
    :cond_3
    new-instance v1, Lcg/g;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    iget-wide v2, v0, Lcg/g;->b:J

    .line 110
    .line 111
    const/16 p0, 0x20

    .line 112
    .line 113
    int-to-long v4, p0

    .line 114
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    const-wide/16 v2, 0x0

    .line 119
    .line 120
    invoke-virtual/range {v0 .. v5}, Lcg/g;->h(Lcg/g;JJ)V

    .line 121
    .line 122
    .line 123
    new-instance p0, Ljava/io/EOFException;

    .line 124
    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v3, "\\n not found: limit="

    .line 128
    .line 129
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-wide v3, v0, Lcg/g;->b:J

    .line 133
    .line 134
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 135
    .line 136
    .line 137
    move-result-wide v3

    .line 138
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, " content="

    .line 142
    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    iget-wide v3, v1, Lcg/g;->b:J

    .line 147
    .line 148
    invoke-virtual {v1, v3, v4}, Lcg/g;->z(J)Lcg/j;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Lcg/j;->e()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const/16 v0, 0x2026

    .line 160
    .line 161
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p0

    .line 172
    :cond_4
    const-string p0, "limit < 0: "

    .line 173
    .line 174
    invoke-static {v6, v7, p0}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_5
    new-instance p0, Ljava/io/EOFException;

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v2, "\\n not found: "

    .line 193
    .line 194
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-wide v2, v0, Lcg/g;->b:J

    .line 198
    .line 199
    invoke-virtual {v0, v2, v3}, Lcg/g;->z(J)Lcg/j;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Lcg/j;->e()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0
.end method

.method public static y(Lrd/a;)Lmd/k0;
    .locals 3

    .line 1
    sget-object v0, Lpd/m;->P:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lmd/k0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Lmd/k0;->g:Lmd/k0;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Unknown http2 error code: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget p0, p0, Lrd/a;->a:I

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final a(Lmd/k0;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lpd/m;->d(Lmd/k0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lpd/k;

    .line 37
    .line 38
    iget-object v3, v3, Lpd/k;->n:Lpd/j;

    .line 39
    .line 40
    new-instance v4, Lmd/b0;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v3, p1, v5, v4}, Lod/a;->h(Lmd/k0;ZLmd/b0;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lpd/k;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lpd/m;->p(Lpd/k;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    iget-object v1, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lpd/k;

    .line 78
    .line 79
    iget-object v3, v2, Lpd/k;->n:Lpd/j;

    .line 80
    .line 81
    sget-object v4, Lod/s;->d:Lod/s;

    .line 82
    .line 83
    new-instance v5, Lmd/b0;

    .line 84
    .line 85
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    invoke-virtual {v3, p1, v4, v6, v5}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2}, Lpd/m;->p(Lpd/k;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    iget-object p1, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lpd/m;->x()V

    .line 102
    .line 103
    .line 104
    monitor-exit v0

    .line 105
    return-void

    .line 106
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    throw p1
.end method

.method public final b()Lmd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/m;->u:Lmd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;
    .locals 15

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    const-string v1, "method"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "headers"

    .line 13
    .line 14
    invoke-static {v2, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lpd/m;->u:Lmd/b;

    .line 18
    .line 19
    new-instance v11, Lod/W1;

    .line 20
    .line 21
    invoke-direct {v11, v0}, Lod/W1;-><init>([Lmd/i;)V

    .line 22
    .line 23
    .line 24
    array-length v4, v0

    .line 25
    const/4 v5, 0x0

    .line 26
    :goto_0
    if-ge v5, v4, :cond_0

    .line 27
    .line 28
    aget-object v6, v0, v5

    .line 29
    .line 30
    invoke-virtual {v6, v1, v2}, Lmd/i;->n(Lmd/b;Lmd/b0;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v5, v5, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v14, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v14

    .line 39
    :try_start_0
    new-instance v0, Lpd/k;

    .line 40
    .line 41
    iget-object v3, p0, Lpd/m;->i:Lpd/d;

    .line 42
    .line 43
    iget-object v5, p0, Lpd/m;->j:Lc7/l;

    .line 44
    .line 45
    iget-object v6, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 46
    .line 47
    iget v7, p0, Lpd/m;->r:I

    .line 48
    .line 49
    iget v8, p0, Lpd/m;->f:I

    .line 50
    .line 51
    iget-object v9, p0, Lpd/m;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v10, p0, Lpd/m;->c:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v12, p0, Lpd/m;->L:Lod/a2;

    .line 56
    .line 57
    move-object v4, p0

    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    move-object/from16 v13, p3

    .line 61
    .line 62
    invoke-direct/range {v0 .. v13}, Lpd/k;-><init>(LF6/r;Lmd/b0;Lpd/d;Lpd/m;Lc7/l;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lod/W1;Lod/a2;Lmd/c;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v14

    .line 66
    return-object v0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    monitor-exit v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw v0
.end method

.method public final d(Lmd/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->v:Lmd/k0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, p0, Lpd/m;->v:Lmd/k0;

    .line 13
    .line 14
    iget-object v1, p0, Lpd/m;->h:LE5/b;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, LE5/b;->o(Lmd/k0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lpd/m;->x()V

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
.end method

.method public final e(Lod/T0;)Ljava/lang/Runnable;
    .locals 7

    .line 1
    check-cast p1, LE5/b;

    .line 2
    .line 3
    iput-object p1, p0, Lpd/m;->h:LE5/b;

    .line 4
    .line 5
    iget-boolean p1, p0, Lpd/m;->G:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lod/u0;

    .line 10
    .line 11
    new-instance v1, Lad/L;

    .line 12
    .line 13
    const/16 p1, 0x11

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lpd/m;->q:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    iget-wide v3, p0, Lpd/m;->H:J

    .line 21
    .line 22
    iget-wide v5, p0, Lpd/m;->I:J

    .line 23
    .line 24
    invoke-direct/range {v0 .. v6}, Lod/u0;-><init>(Lad/L;Ljava/util/concurrent/ScheduledExecutorService;JJ)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lpd/m;->F:Lod/u0;

    .line 28
    .line 29
    invoke-virtual {v0}, Lod/u0;->c()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lpd/m;->p:Lod/P1;

    .line 33
    .line 34
    new-instance v0, Lpd/c;

    .line 35
    .line 36
    invoke-direct {v0, p1, p0}, Lpd/c;-><init>(Lod/P1;Lpd/m;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lpd/m;->g:Lrd/j;

    .line 40
    .line 41
    invoke-static {v0}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p1, Lrd/i;

    .line 49
    .line 50
    invoke-direct {p1, v1}, Lrd/i;-><init>(Lcg/A;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lpd/b;

    .line 54
    .line 55
    invoke-direct {v1, v0, p1}, Lpd/b;-><init>(Lpd/c;Lrd/i;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter p1

    .line 61
    :try_start_0
    new-instance v2, Lpd/d;

    .line 62
    .line 63
    invoke-direct {v2, p0, v1}, Lpd/d;-><init>(Lpd/m;Lpd/b;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, Lpd/m;->i:Lpd/d;

    .line 67
    .line 68
    new-instance v1, Lc7/l;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p0, v1, Lc7/l;->b:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v2, v1, Lc7/l;->c:Ljava/lang/Object;

    .line 76
    .line 77
    const v2, 0xffff

    .line 78
    .line 79
    .line 80
    iput v2, v1, Lc7/l;->a:I

    .line 81
    .line 82
    new-instance v3, Lpd/v;

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    const/4 v5, 0x0

    .line 86
    invoke-direct {v3, v1, v4, v2, v5}, Lpd/v;-><init>(Lc7/l;IILpd/u;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, v1, Lc7/l;->d:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v1, p0, Lpd/m;->j:Lc7/l;

    .line 92
    .line 93
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 95
    .line 96
    const/4 v1, 0x1

    .line 97
    invoke-direct {p1, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lpd/m;->p:Lod/P1;

    .line 101
    .line 102
    new-instance v2, Lpb/a;

    .line 103
    .line 104
    const/4 v3, 0x2

    .line 105
    invoke-direct {v2, p0, p1, v0, v3}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v2}, Lod/P1;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :try_start_1
    invoke-virtual {p0}, Lpd/m;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lpd/m;->p:Lod/P1;

    .line 118
    .line 119
    new-instance v0, Lg5/d;

    .line 120
    .line 121
    const/16 v1, 0x13

    .line 122
    .line 123
    invoke-direct {v0, p0, v1}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lod/P1;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    const/4 p1, 0x0

    .line 130
    return-object p1

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    throw v0
.end method

.method public final f()Lmd/F;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/m;->l:Lmd/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lba/a;
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    new-instance v2, LE4/n;

    .line 6
    .line 7
    const/16 v3, 0x17

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v2, v4, v3}, LE4/n;-><init>(SI)V

    .line 11
    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    iput v3, v2, LE4/n;->b:I

    .line 15
    .line 16
    const-string v4, "https"

    .line 17
    .line 18
    iput-object v4, v2, LE4/n;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-string v5, "host == null"

    .line 25
    .line 26
    if-eqz v4, :cond_31

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v7, 0x0

    .line 33
    move v8, v7

    .line 34
    :goto_0
    if-ge v8, v6, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/16 v10, 0x25

    .line 41
    .line 42
    if-eq v9, v10, :cond_0

    .line 43
    .line 44
    add-int/lit8 v8, v8, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v9, Lcg/g;

    .line 48
    .line 49
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v7, v8, v4}, Lcg/g;->c0(IILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    if-ge v8, v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v4, v8}, Ljava/lang/String;->codePointAt(I)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-ne v11, v10, :cond_1

    .line 62
    .line 63
    add-int/lit8 v12, v8, 0x2

    .line 64
    .line 65
    if-ge v12, v6, :cond_1

    .line 66
    .line 67
    add-int/lit8 v13, v8, 0x1

    .line 68
    .line 69
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    invoke-static {v13}, Lsd/a;->a(C)I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v14

    .line 81
    invoke-static {v14}, Lsd/a;->a(C)I

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    if-eq v13, v3, :cond_1

    .line 86
    .line 87
    if-eq v14, v3, :cond_1

    .line 88
    .line 89
    shl-int/lit8 v8, v13, 0x4

    .line 90
    .line 91
    add-int/2addr v8, v14

    .line 92
    invoke-virtual {v9, v8}, Lcg/g;->X(I)V

    .line 93
    .line 94
    .line 95
    move v8, v12

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    invoke-virtual {v9, v11}, Lcg/g;->e0(I)V

    .line 98
    .line 99
    .line 100
    :goto_2
    invoke-static {v11}, Ljava/lang/Character;->charCount(I)I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    add-int/2addr v8, v11

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {v9}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {v4, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    :goto_3
    const-string v8, "["

    .line 116
    .line 117
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    const-string v9, ":"

    .line 122
    .line 123
    if-eqz v8, :cond_27

    .line 124
    .line 125
    const-string v8, "]"

    .line 126
    .line 127
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_27

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    const/4 v11, 0x1

    .line 138
    sub-int/2addr v8, v11

    .line 139
    const/16 v12, 0x10

    .line 140
    .line 141
    new-array v13, v12, [B

    .line 142
    .line 143
    move v10, v3

    .line 144
    move/from16 v16, v10

    .line 145
    .line 146
    move v15, v7

    .line 147
    move v14, v11

    .line 148
    :goto_4
    if-ge v14, v8, :cond_1a

    .line 149
    .line 150
    if-ne v15, v12, :cond_5

    .line 151
    .line 152
    :cond_4
    :goto_5
    move v3, v7

    .line 153
    :goto_6
    const/4 v6, 0x0

    .line 154
    goto/16 :goto_12

    .line 155
    .line 156
    :cond_5
    add-int/lit8 v11, v14, 0x2

    .line 157
    .line 158
    const/4 v12, 0x2

    .line 159
    if-gt v11, v8, :cond_8

    .line 160
    .line 161
    const-string v3, "::"

    .line 162
    .line 163
    invoke-virtual {v6, v14, v3, v7, v12}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_8

    .line 168
    .line 169
    const/4 v3, -0x1

    .line 170
    if-eq v10, v3, :cond_6

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_6
    add-int/lit8 v15, v15, 0x2

    .line 174
    .line 175
    if-ne v11, v8, :cond_7

    .line 176
    .line 177
    move v10, v15

    .line 178
    :goto_7
    const/16 v14, 0x10

    .line 179
    .line 180
    goto/16 :goto_10

    .line 181
    .line 182
    :cond_7
    move v14, v11

    .line 183
    move v10, v15

    .line 184
    :goto_8
    const/4 v3, 0x1

    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_8
    if-eqz v15, :cond_16

    .line 188
    .line 189
    const/4 v3, 0x1

    .line 190
    invoke-virtual {v6, v14, v9, v7, v3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-eqz v11, :cond_9

    .line 195
    .line 196
    add-int/lit8 v14, v14, 0x1

    .line 197
    .line 198
    goto/16 :goto_d

    .line 199
    .line 200
    :cond_9
    const-string v11, "."

    .line 201
    .line 202
    invoke-virtual {v6, v14, v11, v7, v3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_4

    .line 207
    .line 208
    add-int/lit8 v3, v15, -0x2

    .line 209
    .line 210
    move v12, v3

    .line 211
    move/from16 v11, v16

    .line 212
    .line 213
    :goto_9
    if-ge v11, v8, :cond_13

    .line 214
    .line 215
    const/16 v14, 0x10

    .line 216
    .line 217
    if-ne v12, v14, :cond_a

    .line 218
    .line 219
    goto :goto_c

    .line 220
    :cond_a
    if-eq v12, v3, :cond_c

    .line 221
    .line 222
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    const/16 v7, 0x2e

    .line 227
    .line 228
    if-eq v14, v7, :cond_b

    .line 229
    .line 230
    goto :goto_c

    .line 231
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 232
    .line 233
    :cond_c
    move v7, v11

    .line 234
    const/4 v14, 0x0

    .line 235
    :goto_a
    move/from16 v17, v3

    .line 236
    .line 237
    if-ge v7, v8, :cond_10

    .line 238
    .line 239
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    move/from16 v18, v10

    .line 244
    .line 245
    const/16 v10, 0x30

    .line 246
    .line 247
    if-lt v3, v10, :cond_11

    .line 248
    .line 249
    move/from16 v19, v10

    .line 250
    .line 251
    const/16 v10, 0x39

    .line 252
    .line 253
    if-le v3, v10, :cond_d

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_d
    if-nez v14, :cond_e

    .line 257
    .line 258
    if-eq v11, v7, :cond_e

    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_e
    mul-int/lit8 v14, v14, 0xa

    .line 262
    .line 263
    add-int/2addr v14, v3

    .line 264
    add-int/lit8 v14, v14, -0x30

    .line 265
    .line 266
    const/16 v3, 0xff

    .line 267
    .line 268
    if-le v14, v3, :cond_f

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 272
    .line 273
    move/from16 v3, v17

    .line 274
    .line 275
    move/from16 v10, v18

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_10
    move/from16 v18, v10

    .line 279
    .line 280
    :cond_11
    :goto_b
    sub-int v3, v7, v11

    .line 281
    .line 282
    if-nez v3, :cond_12

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_12
    add-int/lit8 v3, v12, 0x1

    .line 286
    .line 287
    int-to-byte v10, v14

    .line 288
    aput-byte v10, v13, v12

    .line 289
    .line 290
    move v12, v3

    .line 291
    move v11, v7

    .line 292
    move/from16 v3, v17

    .line 293
    .line 294
    move/from16 v10, v18

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    goto :goto_9

    .line 298
    :cond_13
    move/from16 v18, v10

    .line 299
    .line 300
    add-int/lit8 v3, v15, 0x2

    .line 301
    .line 302
    if-eq v12, v3, :cond_15

    .line 303
    .line 304
    :cond_14
    :goto_c
    const/4 v3, 0x0

    .line 305
    goto/16 :goto_6

    .line 306
    .line 307
    :cond_15
    add-int/lit8 v15, v15, 0x2

    .line 308
    .line 309
    move/from16 v10, v18

    .line 310
    .line 311
    goto/16 :goto_7

    .line 312
    .line 313
    :cond_16
    move/from16 v18, v10

    .line 314
    .line 315
    goto/16 :goto_8

    .line 316
    .line 317
    :goto_d
    move v7, v14

    .line 318
    const/4 v11, 0x0

    .line 319
    :goto_e
    if-ge v7, v8, :cond_18

    .line 320
    .line 321
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result v17

    .line 325
    invoke-static/range {v17 .. v17}, Lsd/a;->a(C)I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    move/from16 v17, v12

    .line 330
    .line 331
    const/4 v12, -0x1

    .line 332
    if-ne v3, v12, :cond_17

    .line 333
    .line 334
    goto :goto_f

    .line 335
    :cond_17
    shl-int/lit8 v11, v11, 0x4

    .line 336
    .line 337
    add-int/2addr v11, v3

    .line 338
    add-int/lit8 v7, v7, 0x1

    .line 339
    .line 340
    move/from16 v12, v17

    .line 341
    .line 342
    const/4 v3, 0x1

    .line 343
    goto :goto_e

    .line 344
    :cond_18
    move/from16 v17, v12

    .line 345
    .line 346
    :goto_f
    sub-int v3, v7, v14

    .line 347
    .line 348
    if-eqz v3, :cond_14

    .line 349
    .line 350
    const/4 v12, 0x4

    .line 351
    if-le v3, v12, :cond_19

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_19
    add-int/lit8 v3, v15, 0x1

    .line 355
    .line 356
    ushr-int/lit8 v12, v11, 0x8

    .line 357
    .line 358
    move/from16 v18, v3

    .line 359
    .line 360
    const/16 v3, 0xff

    .line 361
    .line 362
    and-int/2addr v3, v12

    .line 363
    int-to-byte v3, v3

    .line 364
    aput-byte v3, v13, v15

    .line 365
    .line 366
    add-int/lit8 v15, v15, 0x2

    .line 367
    .line 368
    and-int/lit16 v3, v11, 0xff

    .line 369
    .line 370
    int-to-byte v3, v3

    .line 371
    aput-byte v3, v13, v18

    .line 372
    .line 373
    move/from16 v16, v14

    .line 374
    .line 375
    const/4 v3, -0x1

    .line 376
    const/16 v12, 0x10

    .line 377
    .line 378
    move v14, v7

    .line 379
    const/4 v7, 0x0

    .line 380
    goto/16 :goto_4

    .line 381
    .line 382
    :cond_1a
    move/from16 v18, v10

    .line 383
    .line 384
    move v14, v12

    .line 385
    :goto_10
    if-eq v15, v14, :cond_1c

    .line 386
    .line 387
    const/4 v12, -0x1

    .line 388
    if-ne v10, v12, :cond_1b

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_1b
    sub-int v3, v15, v10

    .line 392
    .line 393
    rsub-int/lit8 v6, v3, 0x10

    .line 394
    .line 395
    invoke-static {v13, v10, v13, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 396
    .line 397
    .line 398
    rsub-int/lit8 v12, v15, 0x10

    .line 399
    .line 400
    add-int/2addr v12, v10

    .line 401
    const/4 v3, 0x0

    .line 402
    invoke-static {v13, v10, v12, v3}, Ljava/util/Arrays;->fill([BIIB)V

    .line 403
    .line 404
    .line 405
    goto :goto_11

    .line 406
    :cond_1c
    const/4 v3, 0x0

    .line 407
    :goto_11
    :try_start_0
    invoke-static {v13}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 408
    .line 409
    .line 410
    move-result-object v6
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1

    .line 411
    :goto_12
    if-nez v6, :cond_1e

    .line 412
    .line 413
    :catch_0
    :cond_1d
    :goto_13
    const/4 v10, 0x0

    .line 414
    goto/16 :goto_18

    .line 415
    .line 416
    :cond_1e
    invoke-virtual {v6}, Ljava/net/InetAddress;->getAddress()[B

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    array-length v7, v6

    .line 421
    const/16 v14, 0x10

    .line 422
    .line 423
    if-ne v7, v14, :cond_26

    .line 424
    .line 425
    move v8, v3

    .line 426
    move v10, v8

    .line 427
    const/4 v7, -0x1

    .line 428
    :goto_14
    array-length v11, v6

    .line 429
    if-ge v8, v11, :cond_21

    .line 430
    .line 431
    move v11, v8

    .line 432
    :goto_15
    if-ge v11, v14, :cond_1f

    .line 433
    .line 434
    aget-byte v12, v6, v11

    .line 435
    .line 436
    if-nez v12, :cond_1f

    .line 437
    .line 438
    add-int/lit8 v12, v11, 0x1

    .line 439
    .line 440
    aget-byte v12, v6, v12

    .line 441
    .line 442
    if-nez v12, :cond_1f

    .line 443
    .line 444
    add-int/lit8 v11, v11, 0x2

    .line 445
    .line 446
    const/16 v14, 0x10

    .line 447
    .line 448
    goto :goto_15

    .line 449
    :cond_1f
    sub-int v12, v11, v8

    .line 450
    .line 451
    if-le v12, v10, :cond_20

    .line 452
    .line 453
    move v7, v8

    .line 454
    move v10, v12

    .line 455
    :cond_20
    add-int/lit8 v8, v11, 0x2

    .line 456
    .line 457
    const/16 v14, 0x10

    .line 458
    .line 459
    goto :goto_14

    .line 460
    :cond_21
    new-instance v8, Lcg/g;

    .line 461
    .line 462
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 463
    .line 464
    .line 465
    :cond_22
    :goto_16
    array-length v11, v6

    .line 466
    if-ge v3, v11, :cond_25

    .line 467
    .line 468
    const/16 v11, 0x3a

    .line 469
    .line 470
    if-ne v3, v7, :cond_23

    .line 471
    .line 472
    invoke-virtual {v8, v11}, Lcg/g;->X(I)V

    .line 473
    .line 474
    .line 475
    add-int/2addr v3, v10

    .line 476
    const/16 v14, 0x10

    .line 477
    .line 478
    if-ne v3, v14, :cond_22

    .line 479
    .line 480
    invoke-virtual {v8, v11}, Lcg/g;->X(I)V

    .line 481
    .line 482
    .line 483
    goto :goto_16

    .line 484
    :cond_23
    const/16 v14, 0x10

    .line 485
    .line 486
    if-lez v3, :cond_24

    .line 487
    .line 488
    invoke-virtual {v8, v11}, Lcg/g;->X(I)V

    .line 489
    .line 490
    .line 491
    :cond_24
    aget-byte v11, v6, v3

    .line 492
    .line 493
    const/16 v12, 0xff

    .line 494
    .line 495
    and-int/2addr v11, v12

    .line 496
    shl-int/lit8 v11, v11, 0x8

    .line 497
    .line 498
    add-int/lit8 v13, v3, 0x1

    .line 499
    .line 500
    aget-byte v13, v6, v13

    .line 501
    .line 502
    and-int/2addr v13, v12

    .line 503
    or-int/2addr v11, v13

    .line 504
    int-to-long v12, v11

    .line 505
    invoke-virtual {v8, v12, v13}, Lcg/g;->Z(J)V

    .line 506
    .line 507
    .line 508
    add-int/lit8 v3, v3, 0x2

    .line 509
    .line 510
    goto :goto_16

    .line 511
    :cond_25
    invoke-virtual {v8}, Lcg/g;->readUtf8()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v10

    .line 515
    goto :goto_18

    .line 516
    :cond_26
    new-instance v0, Ljava/lang/AssertionError;

    .line 517
    .line 518
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :catch_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 523
    .line 524
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 525
    .line 526
    .line 527
    throw v0

    .line 528
    :cond_27
    move v3, v7

    .line 529
    :try_start_1
    invoke-static {v6}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 534
    .line 535
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 540
    .line 541
    .line 542
    move-result v7

    .line 543
    if-eqz v7, :cond_28

    .line 544
    .line 545
    goto/16 :goto_13

    .line 546
    .line 547
    :cond_28
    move v7, v3

    .line 548
    :goto_17
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-ge v7, v3, :cond_2b

    .line 553
    .line 554
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    const/16 v8, 0x1f

    .line 559
    .line 560
    if-le v3, v8, :cond_1d

    .line 561
    .line 562
    const/16 v8, 0x7f

    .line 563
    .line 564
    if-lt v3, v8, :cond_29

    .line 565
    .line 566
    goto/16 :goto_13

    .line 567
    .line 568
    :cond_29
    const-string v8, " #%/:?@[\\]"

    .line 569
    .line 570
    invoke-virtual {v8, v3}, Ljava/lang/String;->indexOf(I)I

    .line 571
    .line 572
    .line 573
    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 574
    const/4 v12, -0x1

    .line 575
    if-eq v3, v12, :cond_2a

    .line 576
    .line 577
    goto/16 :goto_13

    .line 578
    .line 579
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 580
    .line 581
    goto :goto_17

    .line 582
    :cond_2b
    move-object v10, v6

    .line 583
    :goto_18
    if-eqz v10, :cond_30

    .line 584
    .line 585
    iput-object v10, v2, LE4/n;->d:Ljava/lang/Object;

    .line 586
    .line 587
    invoke-virtual/range {p1 .. p1}, Ljava/net/InetSocketAddress;->getPort()I

    .line 588
    .line 589
    .line 590
    move-result v3

    .line 591
    if-lez v3, :cond_2f

    .line 592
    .line 593
    const v4, 0xffff

    .line 594
    .line 595
    .line 596
    if-gt v3, v4, :cond_2f

    .line 597
    .line 598
    iput v3, v2, LE4/n;->b:I

    .line 599
    .line 600
    iget-object v3, v2, LE4/n;->d:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v3, Ljava/lang/String;

    .line 603
    .line 604
    if-eqz v3, :cond_2e

    .line 605
    .line 606
    new-instance v3, Lsd/a;

    .line 607
    .line 608
    invoke-direct {v3, v2}, Lsd/a;-><init>(LE4/n;)V

    .line 609
    .line 610
    .line 611
    new-instance v2, LX2/j;

    .line 612
    .line 613
    const/16 v4, 0x1d

    .line 614
    .line 615
    const/4 v5, 0x0

    .line 616
    invoke-direct {v2, v4, v5}, LX2/j;-><init>(IZ)V

    .line 617
    .line 618
    .line 619
    new-instance v4, LA/d0;

    .line 620
    .line 621
    const/4 v5, 0x3

    .line 622
    invoke-direct {v4, v5}, LA/d0;-><init>(I)V

    .line 623
    .line 624
    .line 625
    iput-object v4, v2, LX2/j;->c:Ljava/lang/Object;

    .line 626
    .line 627
    iput-object v3, v2, LX2/j;->b:Ljava/lang/Object;

    .line 628
    .line 629
    new-instance v4, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    iget-object v5, v3, Lsd/a;->a:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    iget v3, v3, Lsd/a;->b:I

    .line 643
    .line 644
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    const-string v4, "Host"

    .line 652
    .line 653
    invoke-virtual {v2, v4, v3}, LX2/j;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    const-string v3, "User-Agent"

    .line 657
    .line 658
    move-object/from16 v6, p0

    .line 659
    .line 660
    iget-object v4, v6, Lpd/m;->c:Ljava/lang/String;

    .line 661
    .line 662
    invoke-virtual {v2, v3, v4}, LX2/j;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    if-eqz v0, :cond_2c

    .line 666
    .line 667
    if-eqz v1, :cond_2c

    .line 668
    .line 669
    const-string v3, "Basic "

    .line 670
    .line 671
    :try_start_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    const-string v1, "ISO-8859-1"

    .line 690
    .line 691
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-static {v0}, Lcg/j;->l([B)Lcg/j;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Lcg/j;->a()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    new-instance v1, Ljava/lang/StringBuilder;

    .line 704
    .line 705
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v0
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_2

    .line 715
    const-string v1, "Proxy-Authorization"

    .line 716
    .line 717
    invoke-virtual {v2, v1, v0}, LX2/j;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    goto :goto_19

    .line 721
    :catch_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 722
    .line 723
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 724
    .line 725
    .line 726
    throw v0

    .line 727
    :cond_2c
    :goto_19
    iget-object v0, v2, LX2/j;->b:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, Lsd/a;

    .line 730
    .line 731
    if-eqz v0, :cond_2d

    .line 732
    .line 733
    new-instance v0, Lba/a;

    .line 734
    .line 735
    invoke-direct {v0, v2}, Lba/a;-><init>(LX2/j;)V

    .line 736
    .line 737
    .line 738
    return-object v0

    .line 739
    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 740
    .line 741
    const-string v1, "url == null"

    .line 742
    .line 743
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v0

    .line 747
    :cond_2e
    move-object/from16 v6, p0

    .line 748
    .line 749
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 750
    .line 751
    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    throw v0

    .line 755
    :cond_2f
    move-object/from16 v6, p0

    .line 756
    .line 757
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 758
    .line 759
    const-string v1, "unexpected port: "

    .line 760
    .line 761
    invoke-static {v3, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    throw v0

    .line 769
    :cond_30
    move-object/from16 v6, p0

    .line 770
    .line 771
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 772
    .line 773
    const-string v1, "unexpected host: "

    .line 774
    .line 775
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    throw v0

    .line 783
    :cond_31
    move-object/from16 v6, p0

    .line 784
    .line 785
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 786
    .line 787
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    throw v0
.end method

.method public final j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lpd/k;

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    if-eqz p5, :cond_0

    .line 19
    .line 20
    iget-object p5, p0, Lpd/m;->i:Lpd/d;

    .line 21
    .line 22
    sget-object v2, Lrd/a;->i:Lrd/a;

    .line 23
    .line 24
    invoke-virtual {p5, p1, v2}, Lpd/d;->h(ILrd/a;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p1, v1, Lpd/k;->n:Lpd/j;

    .line 33
    .line 34
    if-eqz p6, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    new-instance p6, Lmd/b0;

    .line 38
    .line 39
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {p1, p2, p3, p4, p6}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0}, Lpd/m;->v()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, Lpd/m;->x()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v1}, Lpd/m;->p(Lpd/k;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    throw p1
.end method

.method public final k()[Lpd/v;
    .locals 6

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-array v1, v1, [Lpd/v;

    .line 11
    .line 12
    iget-object v2, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lpd/k;

    .line 34
    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    iget-object v4, v4, Lpd/k;->n:Lpd/j;

    .line 38
    .line 39
    invoke-virtual {v4}, Lpd/j;->o()Lpd/v;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    aput-object v4, v1, v3

    .line 44
    .line 45
    move v3, v5

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    monitor-exit v0

    .line 50
    return-object v1

    .line 51
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw v1
.end method

.method public final l()I
    .locals 3

    .line 1
    iget-object v0, p0, Lpd/m;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lod/a0;->a(Ljava/lang/String;)Ljava/net/URI;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    iget-object v0, p0, Lpd/m;->a:Ljava/net/InetSocketAddress;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public final m()Lmd/l0;
    .locals 3

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->v:Lmd/k0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v2, Lmd/l0;

    .line 9
    .line 10
    invoke-direct {v2, v1}, Lmd/l0;-><init>(Lmd/k0;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object v2

    .line 15
    :cond_0
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 16
    .line 17
    const-string v2, "Connection closed"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lmd/l0;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lmd/l0;-><init>(Lmd/k0;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v2

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public final n(I)Lpd/k;
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lpd/k;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p1
.end method

.method public final o(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lpd/m;->m:I

    .line 5
    .line 6
    if-ge p1, v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr p1, v1

    .line 10
    if-ne p1, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    monitor-exit v0

    .line 15
    return v1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public final p(Lpd/k;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lpd/m;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iput-boolean v1, p0, Lpd/m;->z:Z

    .line 23
    .line 24
    iget-object v0, p0, Lpd/m;->F:Lod/u0;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget v2, v0, Lod/u0;->d:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 v2, 0x1

    .line 38
    iput v2, v0, Lod/u0;->d:I

    .line 39
    .line 40
    :cond_1
    iget v2, v0, Lod/u0;->d:I

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x5

    .line 46
    iput v2, v0, Lod/u0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    monitor-exit v0

    .line 52
    goto :goto_2

    .line 53
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1

    .line 55
    :cond_3
    :goto_2
    iget-boolean v0, p1, Lod/b;->e:Z

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lpd/m;->M:Lod/g0;

    .line 60
    .line 61
    invoke-virtual {v0, p1, v1}, LA7/B0;->W(Ljava/lang/Object;Z)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void
.end method

.method public final q(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-object v0, Lmd/k0;->n:Lmd/k0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lrd/a;->d:Lrd/a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1, v0, p1}, Lpd/m;->u(ILrd/a;Lmd/k0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r(Lod/t0;)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lp8/n;->a:Lp8/n;

    .line 3
    .line 4
    iget-object v2, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v2

    .line 7
    :try_start_0
    iget-object v3, p0, Lpd/m;->i:Lpd/d;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    move v3, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v4

    .line 15
    :goto_0
    invoke-static {v3}, LFe/e;->x(Z)V

    .line 16
    .line 17
    .line 18
    iget-boolean v3, p0, Lpd/m;->y:Z

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lpd/m;->m()Lmd/l0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v3, Lod/f0;->g:Ljava/util/logging/Logger;

    .line 27
    .line 28
    new-instance v3, Lod/e0;

    .line 29
    .line 30
    invoke-direct {v3, p1, v0}, Lod/e0;-><init>(Lod/t0;Lmd/l0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v1, v3}, Lp8/n;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_2
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 39
    .line 40
    const-string v1, "Failed to execute PingCallback"

    .line 41
    .line 42
    sget-object v3, Lod/f0;->g:Ljava/util/logging/Logger;

    .line 43
    .line 44
    invoke-virtual {v3, v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    monitor-exit v2

    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    iget-object v1, p0, Lpd/m;->x:Lod/f0;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    move v0, v4

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    iget-object v1, p0, Lpd/m;->d:Ljava/util/Random;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    iget-object v1, p0, Lpd/m;->e:Lod/Y;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v1, Lj/E;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lj/E;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lj/E;->b()V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lod/f0;

    .line 79
    .line 80
    invoke-direct {v3, v5, v6, v1}, Lod/f0;-><init>(JLj/E;)V

    .line 81
    .line 82
    .line 83
    iput-object v3, p0, Lpd/m;->x:Lod/f0;

    .line 84
    .line 85
    iget-object v1, p0, Lpd/m;->L:Lod/a2;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-object v1, v3

    .line 91
    :goto_2
    if-eqz v0, :cond_3

    .line 92
    .line 93
    iget-object v0, p0, Lpd/m;->i:Lpd/d;

    .line 94
    .line 95
    const/16 v3, 0x20

    .line 96
    .line 97
    ushr-long v7, v5, v3

    .line 98
    .line 99
    long-to-int v3, v7

    .line 100
    long-to-int v5, v5

    .line 101
    invoke-virtual {v0, v4, v3, v5}, Lpd/d;->d(ZII)V

    .line 102
    .line 103
    .line 104
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    invoke-virtual {v1, p1}, Lod/f0;->a(Lod/t0;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    throw p1
.end method

.method public final t()V
    .locals 5

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->i:Lpd/d;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :try_start_1
    iget-object v2, v1, Lpd/d;->b:Lpd/b;

    .line 10
    .line 11
    invoke-virtual {v2}, Lpd/b;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v2

    .line 16
    :try_start_2
    iget-object v1, v1, Lpd/d;->a:Lpd/m;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    new-instance v1, LN/I;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, v2}, LN/I;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iget v2, p0, Lpd/m;->f:I

    .line 28
    .line 29
    const/4 v3, 0x7

    .line 30
    invoke-virtual {v1, v3, v2}, LN/I;->d(II)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lpd/m;->i:Lpd/d;

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    iget-object v4, v2, Lpd/d;->c:Lba/a;

    .line 37
    .line 38
    invoke-virtual {v4, v3, v1}, Lba/a;->F(ILN/I;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    .line 40
    .line 41
    :try_start_3
    iget-object v3, v2, Lpd/d;->b:Lpd/b;

    .line 42
    .line 43
    invoke-virtual {v3, v1}, Lpd/b;->o(LN/I;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catch_1
    move-exception v1

    .line 48
    :try_start_4
    iget-object v2, v2, Lpd/d;->a:Lpd/m;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget v1, p0, Lpd/m;->f:I

    .line 54
    .line 55
    const v2, 0xffff

    .line 56
    .line 57
    .line 58
    if-le v1, v2, :cond_0

    .line 59
    .line 60
    iget-object v3, p0, Lpd/m;->i:Lpd/d;

    .line 61
    .line 62
    sub-int/2addr v1, v2

    .line 63
    int-to-long v1, v1

    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-virtual {v3, v4, v1, v2}, Lpd/d;->o(IJ)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception v1

    .line 70
    goto :goto_3

    .line 71
    :cond_0
    :goto_2
    monitor-exit v0

    .line 72
    return-void

    .line 73
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lpd/m;->l:Lmd/F;

    .line 6
    .line 7
    iget-wide v1, v1, Lmd/F;->c:J

    .line 8
    .line 9
    const-string v3, "logId"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, LA7/b0;->e(JLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "address"

    .line 15
    .line 16
    iget-object v2, p0, Lpd/m;->a:Ljava/net/InetSocketAddress;

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final u(ILrd/a;Lmd/k0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lpd/m;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lpd/m;->v:Lmd/k0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iput-object p3, p0, Lpd/m;->v:Lmd/k0;

    .line 9
    .line 10
    iget-object v1, p0, Lpd/m;->h:LE5/b;

    .line 11
    .line 12
    invoke-virtual {v1, p3}, LE5/b;->o(Lmd/k0;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    :goto_0
    const/4 v1, 0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-boolean v3, p0, Lpd/m;->w:Z

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    iput-boolean v1, p0, Lpd/m;->w:Z

    .line 28
    .line 29
    iget-object v3, p0, Lpd/m;->i:Lpd/d;

    .line 30
    .line 31
    new-array v4, v2, [B

    .line 32
    .line 33
    invoke-virtual {v3, p2, v4}, Lpd/d;->b(Lrd/a;[B)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object p2, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-le v4, p1, :cond_2

    .line 69
    .line 70
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lpd/k;

    .line 78
    .line 79
    iget-object v4, v4, Lpd/k;->n:Lpd/j;

    .line 80
    .line 81
    sget-object v5, Lod/s;->b:Lod/s;

    .line 82
    .line 83
    new-instance v6, Lmd/b0;

    .line 84
    .line 85
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, p3, v5, v2, v6}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lpd/k;

    .line 96
    .line 97
    invoke-virtual {p0, v3}, Lpd/m;->p(Lpd/k;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    iget-object p1, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Lpd/k;

    .line 118
    .line 119
    iget-object v2, p2, Lpd/k;->n:Lpd/j;

    .line 120
    .line 121
    sget-object v3, Lod/s;->d:Lod/s;

    .line 122
    .line 123
    new-instance v4, Lmd/b0;

    .line 124
    .line 125
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p3, v3, v1, v4}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p2}, Lpd/m;->p(Lpd/k;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    iget-object p1, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lpd/m;->x()V

    .line 141
    .line 142
    .line 143
    monitor-exit v0

    .line 144
    return-void

    .line 145
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    throw p1
.end method

.method public final v()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Lpd/m;->C:I

    .line 17
    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lpd/k;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lpd/m;->w(Lpd/k;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return v0
.end method

.method public final w(Lpd/k;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p1, Lpd/k;->n:Lpd/j;

    .line 4
    .line 5
    iget v2, v2, Lpd/j;->K:I

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    if-ne v2, v3, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    const-string v4, "StreamId already assigned"

    .line 14
    .line 15
    invoke-static {v4, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 19
    .line 20
    iget v4, p0, Lpd/m;->m:I

    .line 21
    .line 22
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v2, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-boolean v2, p0, Lpd/m;->z:Z

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    iput-boolean v1, p0, Lpd/m;->z:Z

    .line 34
    .line 35
    iget-object v2, p0, Lpd/m;->F:Lod/u0;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v2}, Lod/u0;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-boolean v2, p1, Lod/b;->e:Z

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iget-object v2, p0, Lpd/m;->M:Lod/g0;

    .line 47
    .line 48
    invoke-virtual {v2, p1, v1}, LA7/B0;->W(Ljava/lang/Object;Z)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v2, p1, Lpd/k;->n:Lpd/j;

    .line 52
    .line 53
    iget v4, p0, Lpd/m;->m:I

    .line 54
    .line 55
    iget v5, v2, Lpd/j;->K:I

    .line 56
    .line 57
    if-ne v5, v3, :cond_3

    .line 58
    .line 59
    move v3, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move v3, v0

    .line 62
    :goto_1
    const-string v5, "the stream has been started with id %s"

    .line 63
    .line 64
    if-eqz v3, :cond_c

    .line 65
    .line 66
    iput v4, v2, Lpd/j;->K:I

    .line 67
    .line 68
    iget-object v3, v2, Lpd/j;->F:Lc7/l;

    .line 69
    .line 70
    new-instance v5, Lpd/v;

    .line 71
    .line 72
    iget v6, v3, Lc7/l;->a:I

    .line 73
    .line 74
    invoke-direct {v5, v3, v4, v6, v2}, Lpd/v;-><init>(Lc7/l;IILpd/u;)V

    .line 75
    .line 76
    .line 77
    iput-object v5, v2, Lpd/j;->J:Lpd/v;

    .line 78
    .line 79
    iget-object v3, v2, Lpd/j;->L:Lpd/k;

    .line 80
    .line 81
    iget-object v3, v3, Lpd/k;->n:Lpd/j;

    .line 82
    .line 83
    iget-object v4, v3, Lod/a;->j:Lod/t;

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    move v4, v1

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v4, v0

    .line 90
    :goto_2
    invoke-static {v4}, LFe/e;->x(Z)V

    .line 91
    .line 92
    .line 93
    iget-object v6, v3, Lod/a;->b:Ljava/lang/Object;

    .line 94
    .line 95
    monitor-enter v6

    .line 96
    :try_start_0
    iget-boolean v4, v3, Lod/a;->f:Z

    .line 97
    .line 98
    xor-int/2addr v4, v1

    .line 99
    const-string v5, "Already allocated"

    .line 100
    .line 101
    invoke-static {v5, v4}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    iput-boolean v1, v3, Lod/a;->f:Z

    .line 105
    .line 106
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    invoke-virtual {v3}, Lod/a;->f()V

    .line 108
    .line 109
    .line 110
    iget-object v3, v3, Lod/a;->c:Lod/a2;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v3, v3, Lod/a2;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, Lod/Y1;

    .line 118
    .line 119
    invoke-virtual {v3}, Lod/Y1;->d()J

    .line 120
    .line 121
    .line 122
    iget-boolean v3, v2, Lpd/j;->H:Z

    .line 123
    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    iget-object v3, v2, Lpd/j;->E:Lpd/d;

    .line 127
    .line 128
    iget-object v4, v2, Lpd/j;->L:Lpd/k;

    .line 129
    .line 130
    iget-boolean v4, v4, Lpd/k;->q:Z

    .line 131
    .line 132
    iget v5, v2, Lpd/j;->K:I

    .line 133
    .line 134
    iget-object v6, v2, Lpd/j;->x:Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-virtual {v3, v4, v5, v6}, Lpd/d;->i(ZILjava/util/ArrayList;)V

    .line 137
    .line 138
    .line 139
    iget-object v3, v2, Lpd/j;->L:Lpd/k;

    .line 140
    .line 141
    iget-object v3, v3, Lpd/k;->l:Lod/W1;

    .line 142
    .line 143
    iget-object v3, v3, Lod/W1;->a:[Lmd/i;

    .line 144
    .line 145
    array-length v4, v3

    .line 146
    move v5, v0

    .line 147
    :goto_3
    if-ge v5, v4, :cond_5

    .line 148
    .line 149
    aget-object v6, v3, v5

    .line 150
    .line 151
    invoke-virtual {v6}, Lmd/i;->h()V

    .line 152
    .line 153
    .line 154
    add-int/2addr v5, v1

    .line 155
    goto :goto_3

    .line 156
    :cond_5
    const/4 v1, 0x0

    .line 157
    iput-object v1, v2, Lpd/j;->x:Ljava/util/ArrayList;

    .line 158
    .line 159
    iget-object v1, v2, Lpd/j;->y:Lcg/g;

    .line 160
    .line 161
    iget-wide v3, v1, Lcg/g;->b:J

    .line 162
    .line 163
    const-wide/16 v5, 0x0

    .line 164
    .line 165
    cmp-long v3, v3, v5

    .line 166
    .line 167
    if-lez v3, :cond_6

    .line 168
    .line 169
    iget-object v3, v2, Lpd/j;->F:Lc7/l;

    .line 170
    .line 171
    iget-boolean v4, v2, Lpd/j;->z:Z

    .line 172
    .line 173
    iget-object v5, v2, Lpd/j;->J:Lpd/v;

    .line 174
    .line 175
    iget-boolean v6, v2, Lpd/j;->A:Z

    .line 176
    .line 177
    invoke-virtual {v3, v4, v5, v1, v6}, Lc7/l;->a(ZLpd/v;Lcg/g;Z)V

    .line 178
    .line 179
    .line 180
    :cond_6
    iput-boolean v0, v2, Lpd/j;->H:Z

    .line 181
    .line 182
    :cond_7
    iget-object v0, p1, Lpd/k;->j:LF6/r;

    .line 183
    .line 184
    iget-object v0, v0, LF6/r;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lmd/c0;

    .line 187
    .line 188
    sget-object v1, Lmd/c0;->a:Lmd/c0;

    .line 189
    .line 190
    if-eq v0, v1, :cond_8

    .line 191
    .line 192
    sget-object v1, Lmd/c0;->b:Lmd/c0;

    .line 193
    .line 194
    if-ne v0, v1, :cond_9

    .line 195
    .line 196
    :cond_8
    iget-boolean p1, p1, Lpd/k;->q:Z

    .line 197
    .line 198
    if-eqz p1, :cond_a

    .line 199
    .line 200
    :cond_9
    iget-object p1, p0, Lpd/m;->i:Lpd/d;

    .line 201
    .line 202
    invoke-virtual {p1}, Lpd/d;->flush()V

    .line 203
    .line 204
    .line 205
    :cond_a
    iget p1, p0, Lpd/m;->m:I

    .line 206
    .line 207
    const v0, 0x7ffffffd

    .line 208
    .line 209
    .line 210
    if-lt p1, v0, :cond_b

    .line 211
    .line 212
    const p1, 0x7fffffff

    .line 213
    .line 214
    .line 215
    iput p1, p0, Lpd/m;->m:I

    .line 216
    .line 217
    sget-object v0, Lrd/a;->b:Lrd/a;

    .line 218
    .line 219
    sget-object v1, Lmd/k0;->n:Lmd/k0;

    .line 220
    .line 221
    const-string v2, "Stream ids exhausted"

    .line 222
    .line 223
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {p0, p1, v0, v1}, Lpd/m;->u(ILrd/a;Lmd/k0;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 232
    .line 233
    iput p1, p0, Lpd/m;->m:I

    .line 234
    .line 235
    return-void

    .line 236
    :catchall_0
    move-exception p1

    .line 237
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    throw p1

    .line 239
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 240
    .line 241
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    new-array v1, v1, [Ljava/lang/Object;

    .line 246
    .line 247
    aput-object v2, v1, v0

    .line 248
    .line 249
    invoke-static {v5, v1}, LFe/g;->E(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p1
.end method

.method public final x()V
    .locals 6

    .line 1
    iget-object v0, p0, Lpd/m;->v:Lmd/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lpd/m;->n:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    iget-object v0, p0, Lpd/m;->D:Ljava/util/LinkedList;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-boolean v0, p0, Lpd/m;->y:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lpd/m;->y:Z

    .line 29
    .line 30
    iget-object v1, p0, Lpd/m;->F:Lod/u0;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    monitor-enter v1

    .line 37
    :try_start_0
    iget v4, v1, Lod/u0;->d:I

    .line 38
    .line 39
    const/4 v5, 0x6

    .line 40
    if-eq v4, v5, :cond_3

    .line 41
    .line 42
    iput v5, v1, Lod/u0;->d:I

    .line 43
    .line 44
    iget-object v4, v1, Lod/u0;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    invoke-interface {v4, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    iget-object v4, v1, Lod/u0;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-interface {v4, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 59
    .line 60
    .line 61
    iput-object v2, v1, Lod/u0;->f:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    :cond_3
    monitor-exit v1

    .line 64
    goto :goto_2

    .line 65
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0

    .line 67
    :cond_4
    :goto_2
    iget-object v1, p0, Lpd/m;->x:Lod/f0;

    .line 68
    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0}, Lpd/m;->m()Lmd/l0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v1, v4}, Lod/f0;->c(Lmd/l0;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lpd/m;->x:Lod/f0;

    .line 79
    .line 80
    :cond_5
    iget-boolean v1, p0, Lpd/m;->w:Z

    .line 81
    .line 82
    if-nez v1, :cond_6

    .line 83
    .line 84
    iput-boolean v0, p0, Lpd/m;->w:Z

    .line 85
    .line 86
    iget-object v0, p0, Lpd/m;->i:Lpd/d;

    .line 87
    .line 88
    sget-object v1, Lrd/a;->b:Lrd/a;

    .line 89
    .line 90
    new-array v2, v3, [B

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Lpd/d;->b(Lrd/a;[B)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget-object v0, p0, Lpd/m;->i:Lpd/d;

    .line 96
    .line 97
    invoke-virtual {v0}, Lpd/d;->close()V

    .line 98
    .line 99
    .line 100
    :cond_7
    :goto_3
    return-void
.end method
