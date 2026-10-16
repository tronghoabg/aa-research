.class public final Lokhttp3/Cache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Cache$RealCacheRequest;,
        Lokhttp3/Cache$Entry;,
        Lokhttp3/Cache$CacheResponseBody;,
        Lokhttp3/Cache$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lokhttp3/Cache;",
        "Ljava/io/Closeable;",
        "Ljava/io/Flushable;",
        "CacheResponseBody",
        "Companion",
        "Entry",
        "RealCacheRequest",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lokhttp3/Cache$Companion;


# instance fields
.field public final a:Lokhttp3/internal/cache/DiskLruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/Cache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/Cache$Companion;-><init>(I)V

    sput-object v0, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;J)V
    .locals 7

    .line 1
    const-string v0, "directory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v2, Lokhttp3/internal/io/FileSystem;->a:Lokhttp3/internal/io/FileSystem;

    .line 7
    .line 8
    const-string v0, "fileSystem"

    .line 9
    .line 10
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lokhttp3/internal/cache/DiskLruCache;

    .line 17
    .line 18
    sget-object v6, Lokhttp3/internal/concurrent/TaskRunner;->i:Lokhttp3/internal/concurrent/TaskRunner;

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    move-wide v4, p2

    .line 22
    invoke-direct/range {v1 .. v6}, Lokhttp3/internal/cache/DiskLruCache;-><init>(Lokhttp3/internal/io/FileSystem;Ljava/io/File;JLokhttp3/internal/concurrent/TaskRunner;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 26
    .line 27
    return-void
.end method

.method public static i(Lokhttp3/Response;Lokhttp3/Response;)V
    .locals 3

    .line 1
    const-string v0, "cached"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lokhttp3/Cache$Entry;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lokhttp3/Cache$Entry;-><init>(Lokhttp3/Response;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 12
    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    check-cast p0, Lokhttp3/Cache$CacheResponseBody;

    .line 16
    .line 17
    iget-object p0, p0, Lokhttp3/Cache$CacheResponseBody;->d:Lokhttp3/internal/cache/DiskLruCache$Snapshot;

    .line 18
    .line 19
    :try_start_0
    iget-object p1, p0, Lokhttp3/internal/cache/DiskLruCache$Snapshot;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v1, p0, Lokhttp3/internal/cache/DiskLruCache$Snapshot;->b:J

    .line 22
    .line 23
    iget-object p0, p0, Lokhttp3/internal/cache/DiskLruCache$Snapshot;->d:Lokhttp3/internal/cache/DiskLruCache;

    .line 24
    .line 25
    invoke-virtual {p0, v1, v2, p1}, Lokhttp3/internal/cache/DiskLruCache;->d(JLjava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    invoke-virtual {v0, p0}, Lokhttp3/Cache$Entry;->c(Lokhttp3/internal/cache/DiskLruCache$Editor;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lokhttp3/internal/cache/DiskLruCache$Editor;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    const/4 p0, 0x0

    .line 40
    :catch_1
    if-nez p0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lokhttp3/internal/cache/DiskLruCache$Editor;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 44
    .line 45
    .line 46
    :catch_2
    :goto_0
    return-void

    .line 47
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 48
    .line 49
    const-string p1, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method


# virtual methods
.method public final a(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 13

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 12
    .line 13
    invoke-static {v0}, Lokhttp3/Cache$Companion;->a(Lokhttp3/HttpUrl;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    iget-object v3, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Lokhttp3/internal/cache/DiskLruCache;->h(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    :try_start_1
    new-instance v3, Lokhttp3/Cache$Entry;

    .line 29
    .line 30
    iget-object v4, v1, Lokhttp3/internal/cache/DiskLruCache$Snapshot;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lcg/H;

    .line 38
    .line 39
    invoke-direct {v3, v4}, Lokhttp3/Cache$Entry;-><init>(Lcg/H;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v3, Lokhttp3/Cache$Entry;->b:Lokhttp3/Headers;

    .line 43
    .line 44
    iget-object v5, v3, Lokhttp3/Cache$Entry;->c:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v6, v3, Lokhttp3/Cache$Entry;->a:Lokhttp3/HttpUrl;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 47
    .line 48
    const-string v7, "Content-Type"

    .line 49
    .line 50
    iget-object v8, v3, Lokhttp3/Cache$Entry;->g:Lokhttp3/Headers;

    .line 51
    .line 52
    invoke-virtual {v8, v7}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const-string v9, "Content-Length"

    .line 57
    .line 58
    invoke-virtual {v8, v9}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    new-instance v10, Lokhttp3/Request$Builder;

    .line 63
    .line 64
    invoke-direct {v10}, Lokhttp3/Request$Builder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v11, "url"

    .line 68
    .line 69
    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v6, v10, Lokhttp3/Request$Builder;->a:Lokhttp3/HttpUrl;

    .line 73
    .line 74
    invoke-virtual {v10, v5, v2}, Lokhttp3/Request$Builder;->f(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v10, v4}, Lokhttp3/Request$Builder;->e(Lokhttp3/Headers;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v10}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    new-instance v11, Lokhttp3/Response$Builder;

    .line 85
    .line 86
    invoke-direct {v11}, Lokhttp3/Response$Builder;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v10, v11, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 90
    .line 91
    const-string v10, "protocol"

    .line 92
    .line 93
    iget-object v12, v3, Lokhttp3/Cache$Entry;->d:Lokhttp3/Protocol;

    .line 94
    .line 95
    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object v12, v11, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 99
    .line 100
    iget v10, v3, Lokhttp3/Cache$Entry;->e:I

    .line 101
    .line 102
    iput v10, v11, Lokhttp3/Response$Builder;->c:I

    .line 103
    .line 104
    const-string v10, "message"

    .line 105
    .line 106
    iget-object v12, v3, Lokhttp3/Cache$Entry;->f:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iput-object v12, v11, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v11, v8}, Lokhttp3/Response$Builder;->c(Lokhttp3/Headers;)V

    .line 114
    .line 115
    .line 116
    new-instance v8, Lokhttp3/Cache$CacheResponseBody;

    .line 117
    .line 118
    invoke-direct {v8, v1, v7, v9}, Lokhttp3/Cache$CacheResponseBody;-><init>(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iput-object v8, v11, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 122
    .line 123
    iget-object v1, v3, Lokhttp3/Cache$Entry;->h:Lokhttp3/Handshake;

    .line 124
    .line 125
    iput-object v1, v11, Lokhttp3/Response$Builder;->e:Lokhttp3/Handshake;

    .line 126
    .line 127
    iget-wide v7, v3, Lokhttp3/Cache$Entry;->i:J

    .line 128
    .line 129
    iput-wide v7, v11, Lokhttp3/Response$Builder;->k:J

    .line 130
    .line 131
    iget-wide v7, v3, Lokhttp3/Cache$Entry;->j:J

    .line 132
    .line 133
    iput-wide v7, v11, Lokhttp3/Response$Builder;->l:J

    .line 134
    .line 135
    invoke-virtual {v11}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v6, v0}, Lokhttp3/HttpUrl;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    iget-object v0, p1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    iget-object v0, v1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 154
    .line 155
    invoke-static {v0}, Lokhttp3/Cache$Companion;->c(Lokhttp3/Headers;)Ljava/util/Set;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/lang/Iterable;

    .line 160
    .line 161
    instance-of v3, v0, Ljava/util/Collection;

    .line 162
    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    move-object v3, v0

    .line 166
    check-cast v3, Ljava/util/Collection;

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_3

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v4, v3}, Lokhttp3/Headers;->g(Ljava/lang/String;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    iget-object v6, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 196
    .line 197
    invoke-virtual {v6, v3}, Lokhttp3/Headers;->g(Ljava/lang/String;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_2

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_3
    :goto_0
    return-object v1

    .line 209
    :cond_4
    :goto_1
    iget-object p1, v1, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 210
    .line 211
    if-nez p1, :cond_5

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    invoke-static {p1}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 215
    .line 216
    .line 217
    return-object v2

    .line 218
    :catch_0
    invoke-static {v1}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 219
    .line 220
    .line 221
    :catch_1
    :goto_2
    return-object v2
.end method

.method public final b(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;
    .locals 6

    .line 1
    iget-object v0, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 2
    .line 3
    iget-object v1, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v2, Lokhttp3/internal/http/HttpMethod;->a:Lokhttp3/internal/http/HttpMethod;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lokhttp3/internal/http/HttpMethod;->a(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :try_start_0
    sget-object p1, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    .line 18
    .line 19
    iget-object v0, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lokhttp3/Cache$Companion;->a(Lokhttp3/HttpUrl;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 29
    .line 30
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 31
    :try_start_1
    const-string v1, "key"

    .line 32
    .line 33
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->i()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->a()V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lokhttp3/internal/cache/DiskLruCache;->P(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Lokhttp3/internal/cache/DiskLruCache;->i:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lokhttp3/internal/cache/DiskLruCache$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 56
    return-object v3

    .line 57
    :cond_0
    :try_start_3
    invoke-virtual {v0, p1}, Lokhttp3/internal/cache/DiskLruCache;->D(Lokhttp3/internal/cache/DiskLruCache$Entry;)V

    .line 58
    .line 59
    .line 60
    iget-wide v1, v0, Lokhttp3/internal/cache/DiskLruCache;->g:J

    .line 61
    .line 62
    iget-wide v4, v0, Lokhttp3/internal/cache/DiskLruCache;->c:J

    .line 63
    .line 64
    cmp-long p1, v1, v4

    .line 65
    .line 66
    if-gtz p1, :cond_1

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    iput-boolean p1, v0, Lokhttp3/internal/cache/DiskLruCache;->o:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    :goto_0
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 75
    return-object v3

    .line 76
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 77
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 78
    :cond_2
    const-string v2, "GET"

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    sget-object v1, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v1, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 93
    .line 94
    invoke-static {v1}, Lokhttp3/Cache$Companion;->c(Lokhttp3/Headers;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "*"

    .line 99
    .line 100
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    new-instance v1, Lokhttp3/Cache$Entry;

    .line 108
    .line 109
    invoke-direct {v1, p1}, Lokhttp3/Cache$Entry;-><init>(Lokhttp3/Response;)V

    .line 110
    .line 111
    .line 112
    :try_start_7
    iget-object p1, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 113
    .line 114
    iget-object v0, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 115
    .line 116
    invoke-static {v0}, Lokhttp3/Cache$Companion;->a(Lokhttp3/HttpUrl;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-wide v4, Lokhttp3/internal/cache/DiskLruCache;->y:J

    .line 121
    .line 122
    invoke-virtual {p1, v4, v5, v0}, Lokhttp3/internal/cache/DiskLruCache;->d(JLjava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Editor;

    .line 123
    .line 124
    .line 125
    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 126
    if-nez p1, :cond_5

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    :try_start_8
    invoke-virtual {v1, p1}, Lokhttp3/Cache$Entry;->c(Lokhttp3/internal/cache/DiskLruCache$Editor;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, Lokhttp3/Cache$RealCacheRequest;

    .line 133
    .line 134
    invoke-direct {v0, p0, p1}, Lokhttp3/Cache$RealCacheRequest;-><init>(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :catch_0
    move-object p1, v3

    .line 139
    :catch_1
    if-nez p1, :cond_6

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    :try_start_9
    invoke-virtual {p1}, Lokhttp3/internal/cache/DiskLruCache$Editor;->a()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    .line 143
    .line 144
    .line 145
    :catch_2
    :goto_2
    return-object v3
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lokhttp3/Request;)V
    .locals 5

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    .line 7
    .line 8
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lokhttp3/Cache$Companion;->a(Lokhttp3/HttpUrl;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    const-string v1, "key"

    .line 21
    .line 22
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->i()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->a()V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lokhttp3/internal/cache/DiskLruCache;->P(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lokhttp3/internal/cache/DiskLruCache;->i:Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lokhttp3/internal/cache/DiskLruCache$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Lokhttp3/internal/cache/DiskLruCache;->D(Lokhttp3/internal/cache/DiskLruCache$Entry;)V

    .line 47
    .line 48
    .line 49
    iget-wide v1, v0, Lokhttp3/internal/cache/DiskLruCache;->g:J

    .line 50
    .line 51
    iget-wide v3, v0, Lokhttp3/internal/cache/DiskLruCache;->c:J

    .line 52
    .line 53
    cmp-long p1, v1, v3

    .line 54
    .line 55
    if-gtz p1, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, v0, Lokhttp3/internal/cache/DiskLruCache;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    throw p1
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/Cache;->a:Lokhttp3/internal/cache/DiskLruCache;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized h()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
.end method
