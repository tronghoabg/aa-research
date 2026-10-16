.class public final Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http2/Http2Reader$Handler;
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http2/Http2Connection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ReaderRunnable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lokhttp3/internal/http2/Http2Reader$Handler;",
        "Ltf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;",
        "Lokhttp3/internal/http2/Http2Reader$Handler;",
        "Lkotlin/Function0;",
        "Lef/C;",
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


# instance fields
.field public final a:Lokhttp3/internal/http2/Http2Reader;

.field public final synthetic b:Lokhttp3/internal/http2/Http2Connection;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "this$0"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->a:Lokhttp3/internal/http2/Http2Reader;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(ZILcg/B;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v5, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move/from16 v7, p4

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const-string v3, "source"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    and-int/lit8 v4, v5, 0x1

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    move v4, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    const-wide/16 v9, 0x0

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    iget-object v4, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v6, Lcg/g;

    .line 40
    .line 41
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    int-to-long v2, v7

    .line 45
    invoke-virtual {v0, v2, v3}, Lcg/B;->require(J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v6, v2, v3}, Lcg/B;->read(Lcg/g;J)J

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v4, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/16 v2, 0x5b

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, "] onData"

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$pushDataLater$$inlined$execute$default$1;

    .line 79
    .line 80
    move/from16 v8, p1

    .line 81
    .line 82
    invoke-direct/range {v2 .. v8}, Lokhttp3/internal/http2/Http2Connection$pushDataLater$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;ILcg/g;IZ)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v4, Lokhttp3/internal/http2/Http2Connection;->i:Lokhttp3/internal/concurrent/TaskQueue;

    .line 86
    .line 87
    invoke-virtual {v0, v2, v9, v10}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    iget-object v4, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Lokhttp3/internal/http2/Http2Connection;->d(I)Lokhttp3/internal/http2/Http2Stream;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-nez v4, :cond_2

    .line 98
    .line 99
    iget-object v2, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 100
    .line 101
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 102
    .line 103
    invoke-virtual {v2, v5, v3}, Lokhttp3/internal/http2/Http2Connection;->z(ILokhttp3/internal/http2/ErrorCode;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, v1, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 107
    .line 108
    int-to-long v3, v7

    .line 109
    invoke-virtual {v2, v3, v4}, Lokhttp3/internal/http2/Http2Connection;->w(J)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v3, v4}, Lcg/B;->skip(J)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    sget-object v5, Lokhttp3/internal/Util;->a:[B

    .line 117
    .line 118
    iget-object v5, v4, Lokhttp3/internal/http2/Http2Stream;->i:Lokhttp3/internal/http2/Http2Stream$FramingSource;

    .line 119
    .line 120
    int-to-long v6, v7

    .line 121
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    :cond_3
    :goto_1
    cmp-long v8, v6, v9

    .line 125
    .line 126
    if-lez v8, :cond_b

    .line 127
    .line 128
    iget-object v8, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 129
    .line 130
    monitor-enter v8

    .line 131
    :try_start_0
    iget-boolean v11, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->b:Z

    .line 132
    .line 133
    iget-object v12, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->d:Lcg/g;

    .line 134
    .line 135
    iget-wide v12, v12, Lcg/g;->b:J

    .line 136
    .line 137
    add-long/2addr v12, v6

    .line 138
    iget-wide v14, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 139
    .line 140
    cmp-long v12, v12, v14

    .line 141
    .line 142
    if-lez v12, :cond_4

    .line 143
    .line 144
    move v12, v2

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    move v12, v3

    .line 147
    :goto_2
    monitor-exit v8

    .line 148
    if-eqz v12, :cond_5

    .line 149
    .line 150
    invoke-virtual {v0, v6, v7}, Lcg/B;->skip(J)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 154
    .line 155
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->f:Lokhttp3/internal/http2/ErrorCode;

    .line 156
    .line 157
    invoke-virtual {v0, v3}, Lokhttp3/internal/http2/Http2Stream;->e(Lokhttp3/internal/http2/ErrorCode;)V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_5
    if-eqz v11, :cond_6

    .line 162
    .line 163
    invoke-virtual {v0, v6, v7}, Lcg/B;->skip(J)V

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_6
    iget-object v8, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->c:Lcg/g;

    .line 168
    .line 169
    invoke-virtual {v0, v8, v6, v7}, Lcg/B;->read(Lcg/g;J)J

    .line 170
    .line 171
    .line 172
    move-result-wide v11

    .line 173
    const-wide/16 v13, -0x1

    .line 174
    .line 175
    cmp-long v8, v11, v13

    .line 176
    .line 177
    if-eqz v8, :cond_a

    .line 178
    .line 179
    sub-long/2addr v6, v11

    .line 180
    iget-object v8, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->f:Lokhttp3/internal/http2/Http2Stream;

    .line 181
    .line 182
    monitor-enter v8

    .line 183
    :try_start_1
    iget-boolean v11, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->e:Z

    .line 184
    .line 185
    if-eqz v11, :cond_7

    .line 186
    .line 187
    iget-object v11, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->c:Lcg/g;

    .line 188
    .line 189
    iget-wide v12, v11, Lcg/g;->b:J

    .line 190
    .line 191
    invoke-virtual {v11}, Lcg/g;->a()V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    goto :goto_5

    .line 197
    :cond_7
    iget-object v11, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->d:Lcg/g;

    .line 198
    .line 199
    iget-wide v12, v11, Lcg/g;->b:J

    .line 200
    .line 201
    cmp-long v12, v12, v9

    .line 202
    .line 203
    if-nez v12, :cond_8

    .line 204
    .line 205
    move v12, v2

    .line 206
    goto :goto_3

    .line 207
    :cond_8
    move v12, v3

    .line 208
    :goto_3
    iget-object v13, v5, Lokhttp3/internal/http2/Http2Stream$FramingSource;->c:Lcg/g;

    .line 209
    .line 210
    invoke-virtual {v11, v13}, Lcg/g;->q(Lcg/H;)J

    .line 211
    .line 212
    .line 213
    if-eqz v12, :cond_9

    .line 214
    .line 215
    invoke-virtual {v8}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    .line 217
    .line 218
    :cond_9
    move-wide v12, v9

    .line 219
    :goto_4
    monitor-exit v8

    .line 220
    cmp-long v8, v12, v9

    .line 221
    .line 222
    if-lez v8, :cond_3

    .line 223
    .line 224
    invoke-virtual {v5, v12, v13}, Lokhttp3/internal/http2/Http2Stream$FramingSource;->a(J)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :goto_5
    monitor-exit v8

    .line 229
    throw v0

    .line 230
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :catchall_1
    move-exception v0

    .line 237
    monitor-exit v8

    .line 238
    throw v0

    .line 239
    :cond_b
    :goto_6
    if-eqz p1, :cond_c

    .line 240
    .line 241
    sget-object v0, Lokhttp3/internal/Util;->b:Lokhttp3/Headers;

    .line 242
    .line 243
    invoke-virtual {v4, v0, v2}, Lokhttp3/internal/http2/Http2Stream;->j(Lokhttp3/Headers;Z)V

    .line 244
    .line 245
    .line 246
    :cond_c
    return-void
.end method

.method public final b(ILokhttp3/internal/http2/ErrorCode;Lcg/j;)V
    .locals 3

    .line 1
    const-string p2, "debugData"

    .line 2
    .line 3
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lcg/j;->d()I

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 10
    .line 11
    monitor-enter p2

    .line 12
    :try_start_0
    iget-object p3, p2, Lokhttp3/internal/http2/Http2Connection;->b:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    const/4 v0, 0x0

    .line 19
    new-array v1, v0, [Lokhttp3/internal/http2/Http2Stream;

    .line 20
    .line 21
    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-eqz p3, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, p2, Lokhttp3/internal/http2/Http2Connection;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit p2

    .line 31
    check-cast p3, [Lokhttp3/internal/http2/Http2Stream;

    .line 32
    .line 33
    array-length p2, p3

    .line 34
    :cond_0
    :goto_0
    if-ge v0, p2, :cond_1

    .line 35
    .line 36
    aget-object v1, p3, v0

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    iget v2, v1, Lokhttp3/internal/http2/Http2Stream;->a:I

    .line 41
    .line 42
    if-le v2, p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Lokhttp3/internal/http2/Http2Stream;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->g:Lokhttp3/internal/http2/ErrorCode;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lokhttp3/internal/http2/Http2Stream;->k(Lokhttp3/internal/http2/ErrorCode;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 56
    .line 57
    iget v1, v1, Lokhttp3/internal/http2/Http2Stream;->a:I

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Lokhttp3/internal/http2/Http2Connection;->i(I)Lokhttp3/internal/http2/Http2Stream;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void

    .line 64
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 65
    .line 66
    const-string p3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 67
    .line 68
    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    monitor-exit p2

    .line 74
    throw p1
.end method

.method public final c(ZIILjava/util/List;)V
    .locals 10

    .line 1
    iget-object p3, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    and-int/lit8 p3, p2, 0x1

    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    const/4 p3, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    :goto_0
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    const/16 v2, 0x5b

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget-object v5, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v3, v5, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "] onHeaders"

    .line 43
    .line 44
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v3, Lokhttp3/internal/http2/Http2Connection$pushHeadersLater$$inlined$execute$default$1;

    .line 52
    .line 53
    move v8, p1

    .line 54
    move v6, p2

    .line 55
    move-object v7, p4

    .line 56
    invoke-direct/range {v3 .. v8}, Lokhttp3/internal/http2/Http2Connection$pushHeadersLater$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;ILjava/util/List;Z)V

    .line 57
    .line 58
    .line 59
    iget-object p1, v5, Lokhttp3/internal/http2/Http2Connection;->i:Lokhttp3/internal/concurrent/TaskQueue;

    .line 60
    .line 61
    invoke-virtual {p1, v3, v0, v1}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    move v8, p1

    .line 66
    move v5, p2

    .line 67
    move-object v7, p4

    .line 68
    iget-object v6, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 69
    .line 70
    monitor-enter v6

    .line 71
    :try_start_0
    invoke-virtual {v6, v5}, Lokhttp3/internal/http2/Http2Connection;->d(I)Lokhttp3/internal/http2/Http2Stream;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-nez p1, :cond_5

    .line 76
    .line 77
    iget-boolean p1, v6, Lokhttp3/internal/http2/Http2Connection;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    monitor-exit v6

    .line 82
    return-void

    .line 83
    :cond_2
    :try_start_1
    iget p1, v6, Lokhttp3/internal/http2/Http2Connection;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    if-gt v5, p1, :cond_3

    .line 86
    .line 87
    monitor-exit v6

    .line 88
    return-void

    .line 89
    :cond_3
    :try_start_2
    rem-int/lit8 p2, v5, 0x2

    .line 90
    .line 91
    iget p1, v6, Lokhttp3/internal/http2/Http2Connection;->e:I

    .line 92
    .line 93
    rem-int/lit8 p1, p1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    if-ne p2, p1, :cond_4

    .line 96
    .line 97
    monitor-exit v6

    .line 98
    return-void

    .line 99
    :cond_4
    :try_start_3
    invoke-static {v7}, Lokhttp3/internal/Util;->v(Ljava/util/List;)Lokhttp3/Headers;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    new-instance v4, Lokhttp3/internal/http2/Http2Stream;

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-direct/range {v4 .. v9}, Lokhttp3/internal/http2/Http2Stream;-><init>(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V

    .line 107
    .line 108
    .line 109
    iput v5, v6, Lokhttp3/internal/http2/Http2Connection;->d:I

    .line 110
    .line 111
    iget-object p1, v6, Lokhttp3/internal/http2/Http2Connection;->b:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-interface {p1, p2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    iget-object p1, v6, Lokhttp3/internal/http2/Http2Connection;->g:Lokhttp3/internal/concurrent/TaskRunner;

    .line 121
    .line 122
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/TaskRunner;->e()Lokhttp3/internal/concurrent/TaskQueue;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance p2, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object p3, v6, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string p3, "] onStream"

    .line 143
    .line 144
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    new-instance p3, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1;

    .line 152
    .line 153
    invoke-direct {p3, p2, v6, v4}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Stream;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p3, v0, v1}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    .line 158
    .line 159
    monitor-exit v6

    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object p1, v0

    .line 163
    goto :goto_1

    .line 164
    :cond_5
    monitor-exit v6

    .line 165
    invoke-static {v7}, Lokhttp3/internal/Util;->v(Ljava/util/List;)Lokhttp3/Headers;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {p1, p2, v8}, Lokhttp3/internal/http2/Http2Stream;->j(Lokhttp3/Headers;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_1
    monitor-exit v6

    .line 174
    throw p1
.end method

.method public final d(ZII)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    const/4 p3, 0x1

    .line 7
    const-wide/16 v0, 0x1

    .line 8
    .line 9
    if-eq p2, p3, :cond_2

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    if-eq p2, p3, :cond_1

    .line 13
    .line 14
    const/4 p3, 0x3

    .line 15
    if-eq p2, p3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-wide p2, p1, Lokhttp3/internal/http2/Http2Connection;->o:J

    .line 25
    .line 26
    add-long/2addr p2, v0

    .line 27
    iput-wide p2, p1, Lokhttp3/internal/http2/Http2Connection;->o:J

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-wide p2, p1, Lokhttp3/internal/http2/Http2Connection;->m:J

    .line 31
    .line 32
    add-long/2addr p2, v0

    .line 33
    iput-wide p2, p1, Lokhttp3/internal/http2/Http2Connection;->m:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    :goto_0
    monitor-exit p1

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit p1

    .line 38
    throw p2

    .line 39
    :cond_3
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 40
    .line 41
    iget-object v0, p1, Lokhttp3/internal/http2/Http2Connection;->h:Lokhttp3/internal/concurrent/TaskQueue;

    .line 42
    .line 43
    iget-object p1, p1, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 44
    .line 45
    const-string v1, " ping"

    .line 46
    .line 47
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 52
    .line 53
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1;

    .line 54
    .line 55
    invoke-direct {v2, p1, v1, p2, p3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;II)V

    .line 56
    .line 57
    .line 58
    const-wide/16 p1, 0x0

    .line 59
    .line 60
    invoke-virtual {v0, v2, p1, p2}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final e(IILjava/util/List;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter p1

    .line 7
    :try_start_0
    iget-object v0, p1, Lokhttp3/internal/http2/Http2Connection;->z:Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p3, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Lokhttp3/internal/http2/Http2Connection;->z(ILokhttp3/internal/http2/ErrorCode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p1

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_1
    iget-object v0, p1, Lokhttp3/internal/http2/Http2Connection;->z:Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p1

    .line 38
    iget-object v0, p1, Lokhttp3/internal/http2/Http2Connection;->i:Lokhttp3/internal/concurrent/TaskQueue;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p1, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v2, 0x5b

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, "] onRequest"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Lokhttp3/internal/http2/Http2Connection$pushRequestLater$$inlined$execute$default$1;

    .line 68
    .line 69
    invoke-direct {v2, v1, p1, p2, p3}, Lokhttp3/internal/http2/Http2Connection$pushRequestLater$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;ILjava/util/List;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 p1, 0x0

    .line 73
    .line 74
    invoke-virtual {v0, v2, p1, p2}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_0
    monitor-exit p1

    .line 79
    throw p2
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->a:Lokhttp3/internal/http2/Http2Reader;

    .line 4
    .line 5
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->e:Lokhttp3/internal/http2/ErrorCode;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    :try_start_0
    invoke-virtual {v1, v3, p0}, Lokhttp3/internal/http2/Http2Reader;->a(ZLokhttp3/internal/http2/Http2Connection$ReaderRunnable;)Z

    .line 10
    .line 11
    .line 12
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    :goto_0
    const/4 v3, 0x0

    .line 16
    :try_start_1
    invoke-virtual {v1, v3, p0}, Lokhttp3/internal/http2/Http2Reader;->a(ZLokhttp3/internal/http2/Http2Connection$ReaderRunnable;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    :try_start_2
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->h:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    invoke-virtual {v0, v3, v2, v4}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-static {v1}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_5

    .line 34
    :catchall_0
    move-exception v5

    .line 35
    goto :goto_6

    .line 36
    :catch_0
    move-exception v4

    .line 37
    goto :goto_4

    .line 38
    :catchall_1
    move-exception v5

    .line 39
    :goto_2
    move-object v3, v2

    .line 40
    goto :goto_6

    .line 41
    :catch_1
    move-exception v3

    .line 42
    move-object v4, v3

    .line 43
    move-object v3, v2

    .line 44
    goto :goto_4

    .line 45
    :cond_1
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    .line 46
    .line 47
    const-string v5, "Required SETTINGS preface not received"

    .line 48
    .line 49
    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 53
    :goto_3
    move-object v5, v3

    .line 54
    goto :goto_2

    .line 55
    :catchall_2
    move-exception v3

    .line 56
    goto :goto_3

    .line 57
    :goto_4
    :try_start_4
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 58
    .line 59
    invoke-virtual {v0, v2, v2, v4}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_5
    sget-object v0, Lef/C;->a:Lef/C;

    .line 64
    .line 65
    return-object v0

    .line 66
    :goto_6
    invoke-virtual {v0, v3, v2, v4}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 70
    .line 71
    .line 72
    throw v5
.end method
