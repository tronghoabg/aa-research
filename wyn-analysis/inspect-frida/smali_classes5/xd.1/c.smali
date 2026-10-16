.class public Lxd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/E;


# static fields
.field public static final synthetic d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final e:LNd/a;


# instance fields
.field public final a:Lwd/c;

.field public b:LFd/b;

.field public c:LGd/a;

.field private volatile synthetic received:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, LSd/a;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LNd/a;

    .line 21
    .line 22
    const-string v1, "CustomResponse"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lxd/c;->e:LNd/a;

    .line 28
    .line 29
    const-class v0, Lxd/c;

    .line 30
    .line 31
    const-string v1, "received"

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lxd/c;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Lwd/c;)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lxd/c;->a:Lwd/c;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lxd/c;->received:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(LSd/a;Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lxd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxd/b;

    .line 7
    .line 8
    iget v1, v0, Lxd/b;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxd/b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxd/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxd/b;-><init>(Lxd/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxd/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lxd/b;->d:I

    .line 30
    .line 31
    const-string v3, "type"

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lxd/b;->a:LSd/a;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    iget-object p1, v0, Lxd/b;->a:LSd/a;

    .line 60
    .line 61
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_2
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-object v2, p1, LSd/a;->a:Lkotlin/reflect/KClass;

    .line 73
    .line 74
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, LFe/b;->y(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_4
    invoke-virtual {p0}, Lxd/c;->c()Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_6

    .line 97
    .line 98
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    sget-object v2, LCd/w;->a:LNd/a;

    .line 103
    .line 104
    invoke-virtual {p2}, LGd/a;->c()Lxd/c;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2}, Lxd/c;->b()LNd/d;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    const-string v2, "key"

    .line 116
    .line 117
    sget-object v6, LCd/w;->b:LNd/a;

    .line 118
    .line 119
    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, LNd/d;->c()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-interface {p2, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-nez p2, :cond_6

    .line 131
    .line 132
    sget-object p2, Lxd/c;->d:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    invoke-virtual {p2, p0, v2, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    if-eqz p2, :cond_5

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    new-instance p1, Lxd/a;

    .line 143
    .line 144
    invoke-direct {p1, p0}, Lxd/a;-><init>(Lxd/c;)V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lxd/c;->b()LNd/d;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    sget-object v2, Lxd/c;->e:LNd/a;

    .line 153
    .line 154
    invoke-virtual {p2, v2}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-nez p2, :cond_7

    .line 159
    .line 160
    iput-object p1, v0, Lxd/b;->a:LSd/a;

    .line 161
    .line 162
    iput v5, v0, Lxd/b;->d:I

    .line 163
    .line 164
    invoke-virtual {p0}, Lxd/c;->f()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-ne p2, v1, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    :goto_2
    new-instance v2, LGd/c;

    .line 172
    .line 173
    invoke-direct {v2, p1, p2}, LGd/c;-><init>(LSd/a;Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object p2, p0, Lxd/c;->a:Lwd/c;

    .line 177
    .line 178
    iget-object p2, p2, Lwd/c;->f:LGd/b;

    .line 179
    .line 180
    iput-object p1, v0, Lxd/b;->a:LSd/a;

    .line 181
    .line 182
    iput v4, v0, Lxd/b;->d:I

    .line 183
    .line 184
    invoke-virtual {p2, p0, v2, v0}, LRd/d;->a(Ljava/lang/Object;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-ne p2, v1, :cond_8

    .line 189
    .line 190
    :goto_3
    return-object v1

    .line 191
    :cond_8
    :goto_4
    check-cast p2, LGd/c;

    .line 192
    .line 193
    iget-object p2, p2, LGd/c;->b:Ljava/lang/Object;

    .line 194
    .line 195
    sget-object v0, LMd/a;->a:LMd/a;

    .line 196
    .line 197
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_9
    const/4 p2, 0x0

    .line 205
    :goto_5
    if-eqz p2, :cond_b

    .line 206
    .line 207
    iget-object v0, p1, LSd/a;->a:Lkotlin/reflect/KClass;

    .line 208
    .line 209
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, LFe/b;->y(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_a

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 228
    .line 229
    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    iget-object p1, p1, LSd/a;->a:Lkotlin/reflect/KClass;

    .line 234
    .line 235
    new-instance v0, Lcom/google/android/gms/common/api/x;

    .line 236
    .line 237
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-direct {v0, v1, p2, p1}, Lcom/google/android/gms/common/api/x;-><init>(LGd/a;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V

    .line 242
    .line 243
    .line 244
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    :cond_b
    :goto_6
    return-object p2

    .line 246
    :goto_7
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    const-string v0, "Receive failed"

    .line 251
    .line 252
    invoke-static {v0, p1}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {p2, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 257
    .line 258
    .line 259
    throw p1
.end method

.method public final b()LNd/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxd/c;->d()LFd/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LFd/b;->b()LNd/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final d()LFd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/c;->b:LFd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "request"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final e()LGd/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/c;->c:LGd/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LGd/a;->d()Lio/ktor/utils/io/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpClientCall["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lxd/c;->d()LFd/b;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, LFd/b;->getUrl()LJd/H;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lxd/c;->e()LGd/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, LGd/a;->e()LJd/v;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v1, 0x5d

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
