.class public final Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/shadow/okio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "RelaySource"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;",
        "Lcom/applovin/shadow/okio/Source;",
        "<init>",
        "(Lokhttp3/internal/cache2/Relay;)V",
        "Lcom/applovin/shadow/okio/Buffer;",
        "sink",
        "",
        "byteCount",
        "read",
        "(Lcom/applovin/shadow/okio/Buffer;J)J",
        "Lcom/applovin/shadow/okio/Timeout;",
        "timeout",
        "()Lcom/applovin/shadow/okio/Timeout;",
        "Lef/C;",
        "close",
        "()V",
        "Lcom/applovin/shadow/okio/Timeout;",
        "Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;",
        "fileOperator",
        "Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;",
        "sourcePos",
        "J",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sourcePos:J

.field final synthetic this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

.field private final timeout:Lcom/applovin/shadow/okio/Timeout;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/applovin/shadow/okio/Timeout;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/applovin/shadow/okio/Timeout;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->timeout:Lcom/applovin/shadow/okio/Timeout;

    .line 12
    .line 13
    new-instance v0, Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getFile()Ljava/io/RandomAccessFile;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v1, "file!!.channel"

    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, p1}, Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;-><init>(Ljava/nio/channels/FileChannel;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    invoke-virtual {v1}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getSourceCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setSourceCount(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getSourceCount()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getFile()Ljava/io/RandomAccessFile;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setFile(Ljava/io/RandomAccessFile;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    move-object v0, v2

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    :goto_0
    monitor-exit v1

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-static {v0}, Lcom/applovin/shadow/okhttp3/internal/Util;->closeQuietly(Ljava/io/Closeable;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void

    .line 45
    :goto_2
    monitor-exit v1

    .line 46
    throw v0
.end method

.method public read(Lcom/applovin/shadow/okio/Buffer;J)J
    .locals 19
    .param p1    # Lcom/applovin/shadow/okio/Buffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p2

    .line 4
    .line 5
    const-string v0, "sink"

    .line 6
    .line 7
    move-object/from16 v5, p1

    .line 8
    .line 9
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 13
    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    iget-object v8, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 17
    .line 18
    monitor-enter v8

    .line 19
    :goto_0
    :try_start_0
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    iget-wide v9, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 24
    .line 25
    cmp-long v0, v9, v6

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const-wide/16 v6, -0x1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getComplete()Z

    .line 33
    .line 34
    .line 35
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    monitor-exit v8

    .line 39
    return-wide v6

    .line 40
    :cond_0
    :try_start_1
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamReader()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->timeout:Lcom/applovin/shadow/okio/Timeout;

    .line 47
    .line 48
    invoke-virtual {v0, v8}, Lcom/applovin/shadow/okio/Timeout;->waitUntilNotified(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v8, v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setUpstreamReader(Ljava/lang/Thread;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 65
    .line 66
    .line 67
    move-result-wide v9

    .line 68
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/applovin/shadow/okio/Buffer;->size()J

    .line 73
    .line 74
    .line 75
    move-result-wide v11

    .line 76
    sub-long/2addr v9, v11

    .line 77
    iget-wide v11, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    cmp-long v0, v11, v9

    .line 80
    .line 81
    if-gez v0, :cond_6

    .line 82
    .line 83
    move v0, v4

    .line 84
    :goto_1
    monitor-exit v8

    .line 85
    const-wide/16 v8, 0x20

    .line 86
    .line 87
    if-ne v0, v4, :cond_3

    .line 88
    .line 89
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 92
    .line 93
    .line 94
    move-result-wide v6

    .line 95
    iget-wide v10, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 96
    .line 97
    sub-long/2addr v6, v10

    .line 98
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    iget-object v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-wide v3, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 108
    .line 109
    add-long/2addr v3, v8

    .line 110
    invoke-virtual/range {v2 .. v7}, Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;->read(JLcom/applovin/shadow/okio/Buffer;J)V

    .line 111
    .line 112
    .line 113
    iget-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 114
    .line 115
    add-long/2addr v2, v6

    .line 116
    iput-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 117
    .line 118
    return-wide v6

    .line 119
    :cond_3
    const/4 v10, 0x0

    .line 120
    :try_start_2
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstream()Lcom/applovin/shadow/okio/Source;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v4, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 130
    .line 131
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    iget-object v5, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 136
    .line 137
    invoke-virtual {v5}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBufferMaxSize()J

    .line 138
    .line 139
    .line 140
    move-result-wide v11

    .line 141
    invoke-interface {v0, v4, v11, v12}, Lcom/applovin/shadow/okio/Source;->read(Lcom/applovin/shadow/okio/Buffer;J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v11

    .line 145
    cmp-long v0, v11, v6

    .line 146
    .line 147
    if-nez v0, :cond_4

    .line 148
    .line 149
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    invoke-virtual {v0, v2, v3}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->commit(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 156
    .line 157
    .line 158
    iget-object v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 159
    .line 160
    monitor-enter v2

    .line 161
    :try_start_3
    invoke-virtual {v2, v10}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setUpstreamReader(Ljava/lang/Thread;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 165
    .line 166
    .line 167
    monitor-exit v2

    .line 168
    return-wide v6

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    monitor-exit v2

    .line 171
    throw v0

    .line 172
    :catchall_2
    move-exception v0

    .line 173
    goto/16 :goto_4

    .line 174
    .line 175
    :cond_4
    :try_start_4
    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 176
    .line 177
    .line 178
    move-result-wide v6

    .line 179
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    const-wide/16 v4, 0x0

    .line 186
    .line 187
    move-object/from16 v3, p1

    .line 188
    .line 189
    invoke-virtual/range {v2 .. v7}, Lcom/applovin/shadow/okio/Buffer;->copyTo(Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;

    .line 190
    .line 191
    .line 192
    iget-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 193
    .line 194
    add-long/2addr v2, v6

    .line 195
    iput-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 196
    .line 197
    iget-object v13, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->fileOperator:Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;

    .line 198
    .line 199
    invoke-static {v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 205
    .line 206
    .line 207
    move-result-wide v2

    .line 208
    add-long v14, v2, v8

    .line 209
    .line 210
    iget-object v0, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Lcom/applovin/shadow/okio/Buffer;->clone()Lcom/applovin/shadow/okio/Buffer;

    .line 217
    .line 218
    .line 219
    move-result-object v16

    .line 220
    move-wide/from16 v17, v11

    .line 221
    .line 222
    invoke-virtual/range {v13 .. v18}, Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;->write(JLcom/applovin/shadow/okio/Buffer;J)V

    .line 223
    .line 224
    .line 225
    move-wide/from16 v2, v17

    .line 226
    .line 227
    iget-object v4, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 228
    .line 229
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 230
    :try_start_5
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v0, v5, v2, v3}, Lcom/applovin/shadow/okio/Buffer;->write(Lcom/applovin/shadow/okio/Buffer;J)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0}, Lcom/applovin/shadow/okio/Buffer;->size()J

    .line 246
    .line 247
    .line 248
    move-result-wide v8

    .line 249
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBufferMaxSize()J

    .line 250
    .line 251
    .line 252
    move-result-wide v11

    .line 253
    cmp-long v0, v8, v11

    .line 254
    .line 255
    if-lez v0, :cond_5

    .line 256
    .line 257
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v5}, Lcom/applovin/shadow/okio/Buffer;->size()J

    .line 266
    .line 267
    .line 268
    move-result-wide v8

    .line 269
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBufferMaxSize()J

    .line 270
    .line 271
    .line 272
    move-result-wide v11

    .line 273
    sub-long/2addr v8, v11

    .line 274
    invoke-virtual {v0, v8, v9}, Lcom/applovin/shadow/okio/Buffer;->skip(J)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :catchall_3
    move-exception v0

    .line 279
    goto :goto_3

    .line 280
    :cond_5
    :goto_2
    invoke-virtual {v4}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 281
    .line 282
    .line 283
    move-result-wide v8

    .line 284
    add-long/2addr v8, v2

    .line 285
    invoke-virtual {v4, v8, v9}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setUpstreamPos(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 286
    .line 287
    .line 288
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 289
    iget-object v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 290
    .line 291
    monitor-enter v2

    .line 292
    :try_start_7
    invoke-virtual {v2, v10}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setUpstreamReader(Ljava/lang/Thread;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 296
    .line 297
    .line 298
    monitor-exit v2

    .line 299
    return-wide v6

    .line 300
    :catchall_4
    move-exception v0

    .line 301
    monitor-exit v2

    .line 302
    throw v0

    .line 303
    :goto_3
    :try_start_8
    monitor-exit v4

    .line 304
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 305
    :goto_4
    iget-object v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->this$0:Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;

    .line 306
    .line 307
    monitor-enter v2

    .line 308
    :try_start_9
    invoke-virtual {v2, v10}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->setUpstreamReader(Ljava/lang/Thread;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 312
    .line 313
    .line 314
    monitor-exit v2

    .line 315
    throw v0

    .line 316
    :catchall_5
    move-exception v0

    .line 317
    monitor-exit v2

    .line 318
    throw v0

    .line 319
    :cond_6
    :try_start_a
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getUpstreamPos()J

    .line 320
    .line 321
    .line 322
    move-result-wide v4

    .line 323
    iget-wide v6, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 324
    .line 325
    sub-long/2addr v4, v6

    .line 326
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    invoke-virtual {v8}, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay;->getBuffer()Lcom/applovin/shadow/okio/Buffer;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    iget-wide v3, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 335
    .line 336
    sub-long/2addr v3, v9

    .line 337
    move-wide v4, v3

    .line 338
    move-object/from16 v3, p1

    .line 339
    .line 340
    invoke-virtual/range {v2 .. v7}, Lcom/applovin/shadow/okio/Buffer;->copyTo(Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;

    .line 341
    .line 342
    .line 343
    iget-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J

    .line 344
    .line 345
    add-long/2addr v2, v6

    .line 346
    iput-wide v2, v1, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->sourcePos:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 347
    .line 348
    monitor-exit v8

    .line 349
    return-wide v6

    .line 350
    :goto_5
    monitor-exit v8

    .line 351
    throw v0

    .line 352
    :cond_7
    const-string v0, "Check failed."

    .line 353
    .line 354
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v2
.end method

.method public timeout()Lcom/applovin/shadow/okio/Timeout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/applovin/shadow/okhttp3/internal/cache2/Relay$RelaySource;->timeout:Lcom/applovin/shadow/okio/Timeout;

    .line 2
    .line 3
    return-object v0
.end method
