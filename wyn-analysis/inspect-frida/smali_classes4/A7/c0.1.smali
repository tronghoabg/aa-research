.class public final LA7/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG4/a;
.implements Lr9/z;


# instance fields
.field public a:J

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/Z;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 2
    const-string p1, "health_monitor"

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 4
    const-string p1, "health_monitor:start"

    iput-object p1, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 5
    const-string p1, "health_monitor:count"

    iput-object p1, p0, LA7/c0;->c:Ljava/lang/Object;

    .line 6
    const-string p1, "health_monitor:value"

    iput-object p1, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 7
    iput-wide p2, p0, LA7/c0;->a:J

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, LS3/s;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, LS3/s;-><init>(BI)V

    iput-object v0, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 14
    iput-object p1, p0, LA7/c0;->c:Ljava/lang/Object;

    const-wide/32 v0, 0xfa00000

    .line 15
    iput-wide v0, p0, LA7/c0;->a:J

    .line 16
    new-instance p1, LS3/c;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, LS3/c;-><init>(I)V

    iput-object p1, p0, LA7/c0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr9/K;LJ5/n;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 9
    iput-wide v0, p0, LA7/c0;->a:J

    .line 10
    iput-object p1, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 11
    new-instance p1, Lr9/q;

    invoke-direct {p1, p0, p2}, Lr9/q;-><init>(LA7/c0;LJ5/n;)V

    iput-object p1, p0, LA7/c0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls9/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA7/c0;->m(Ls9/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Ls9/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA7/c0;->m(Ls9/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c(Ls9/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA7/c0;->m(Ls9/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()J
    .locals 4

    .line 1
    iget-wide v0, p0, LA7/c0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    const-string v2, "Attempting to get a sequence number outside of a transaction"

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-wide v0, p0, LA7/c0;->a:J

    .line 21
    .line 22
    return-wide v0
.end method

.method public declared-synchronized e()Lz4/c;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lz4/c;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LA7/c0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/io/File;

    .line 11
    .line 12
    iget-wide v1, p0, LA7/c0;->a:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lz4/c;->y(Ljava/io/File;J)Lz4/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lz4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method

.method public f(LB4/d;LG9/e;)V
    .locals 7

    .line 1
    const-string v0, "Had two simultaneous puts for: "

    .line 2
    .line 3
    const-string v1, "Put: Obtained: "

    .line 4
    .line 5
    iget-object v2, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LS3/c;

    .line 8
    .line 9
    invoke-virtual {v2, p1}, LS3/c;->o(LB4/d;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LS3/s;

    .line 16
    .line 17
    monitor-enter v3

    .line 18
    :try_start_0
    iget-object v4, v3, LS3/s;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, LG4/b;

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    iget-object v4, v3, LS3/s;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lxa/d;

    .line 33
    .line 34
    invoke-virtual {v4}, Lxa/d;->y()LG4/b;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, v3, LS3/s;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_0
    :goto_0
    iget v5, v4, LG4/b;->b:I

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    add-int/2addr v5, v6

    .line 53
    iput v5, v4, LG4/b;->b:I

    .line 54
    .line 55
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    iget-object v3, v4, LG4/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 59
    .line 60
    .line 61
    :try_start_1
    const-string v3, "DiskLruCacheWrapper"

    .line 62
    .line 63
    const/4 v4, 0x2

    .line 64
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    const-string v3, "DiskLruCacheWrapper"

    .line 71
    .line 72
    new-instance v4, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, " for for Key: "

    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto :goto_4

    .line 98
    :cond_1
    :goto_1
    :try_start_2
    invoke-virtual {p0}, LA7/c0;->e()Lz4/c;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1, v2}, Lz4/c;->o(Ljava/lang/String;)Lvb/e;

    .line 103
    .line 104
    .line 105
    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    iget-object p1, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, LS3/s;

    .line 111
    .line 112
    invoke-virtual {p1, v2}, LS3/s;->v(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    :try_start_3
    invoke-virtual {p1, v2}, Lz4/c;->h(Ljava/lang/String;)LA7/b0;

    .line 117
    .line 118
    .line 119
    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    :try_start_4
    invoke-virtual {p1}, LA7/b0;->o()Ljava/io/File;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p2, LG9/e;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v3, p2, LG9/e;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, LB4/g;

    .line 131
    .line 132
    iget-object p2, p2, LG9/e;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p2, LB4/b;

    .line 135
    .line 136
    invoke-interface {p2, v1, v0, v3}, LB4/b;->g(Ljava/lang/Object;Ljava/io/File;LB4/g;)Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_3

    .line 141
    .line 142
    iget-object p2, p1, LA7/b0;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p2, Lz4/c;

    .line 145
    .line 146
    invoke-static {p2, p1, v6}, Lz4/c;->a(Lz4/c;LA7/b0;Z)V

    .line 147
    .line 148
    .line 149
    iput-boolean v6, p1, LA7/b0;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 150
    .line 151
    :cond_3
    :try_start_5
    iget-boolean p2, p1, LA7/b0;->b:Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 152
    .line 153
    if-nez p2, :cond_6

    .line 154
    .line 155
    :try_start_6
    invoke-virtual {p1}, LA7/b0;->d()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :catchall_2
    move-exception p2

    .line 160
    :try_start_7
    iget-boolean v0, p1, LA7/b0;->b:Z
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 161
    .line 162
    if-nez v0, :cond_4

    .line 163
    .line 164
    :try_start_8
    invoke-virtual {p1}, LA7/b0;->d()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 165
    .line 166
    .line 167
    :catch_0
    :cond_4
    :try_start_9
    throw p2

    .line 168
    :catch_1
    move-exception p1

    .line 169
    goto :goto_2

    .line 170
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 171
    .line 172
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 180
    :goto_2
    :try_start_a
    const-string p2, "DiskLruCacheWrapper"

    .line 181
    .line 182
    const/4 v0, 0x5

    .line 183
    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_6

    .line 188
    .line 189
    const-string p2, "DiskLruCacheWrapper"

    .line 190
    .line 191
    const-string v0, "Unable to put to disk cache"

    .line 192
    .line 193
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 194
    .line 195
    .line 196
    :catch_2
    :cond_6
    :goto_3
    iget-object p1, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p1, LS3/s;

    .line 199
    .line 200
    invoke-virtual {p1, v2}, LS3/s;->v(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :goto_4
    iget-object p2, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p2, LS3/s;

    .line 207
    .line 208
    invoke-virtual {p2, v2}, LS3/s;->v(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :goto_5
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 213
    throw p1
.end method

.method public g(Ls9/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA7/c0;->m(Ls9/h;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public h(LB4/d;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS3/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LS3/c;->o(LB4/d;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const-string v2, "DiskLruCacheWrapper"

    .line 11
    .line 12
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Get: Obtained: "

    .line 21
    .line 22
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, " for for Key: "

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    :try_start_0
    invoke-virtual {p0}, LA7/c0;->e()Lz4/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Lz4/c;->o(Ljava/lang/String;)Lvb/e;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    iget-object p1, p1, Lvb/e;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, [Ljava/io/File;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    aget-object p1, p1, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    return-object p1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    const/4 v0, 0x5

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    const-string v0, "Unable to get from disk cache"

    .line 70
    .line 71
    invoke-static {v2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_1
    const/4 p1, 0x0

    .line 75
    return-object p1
.end method

.method public i()V
    .locals 5

    .line 1
    iget-wide v0, p0, LA7/c0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    const-string v4, "Committing a transaction without having started one"

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v0, v4, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-wide v2, p0, LA7/c0;->a:J

    .line 21
    .line 22
    return-void
.end method

.method public j()V
    .locals 5

    .line 1
    iget-wide v0, p0, LA7/c0;->a:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    const-string v2, "Starting a transaction without committing the previous one"

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LA7/c0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, LJ5/n;

    .line 23
    .line 24
    iget-wide v1, v0, LJ5/n;->a:J

    .line 25
    .line 26
    const-wide/16 v3, 0x1

    .line 27
    .line 28
    add-long/2addr v1, v3

    .line 29
    iput-wide v1, v0, LJ5/n;->a:J

    .line 30
    .line 31
    iput-wide v1, p0, LA7/c0;->a:J

    .line 32
    .line 33
    return-void
.end method

.method public k(LY2/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public l(Lr9/S;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LA7/c0;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1, v0, v1}, Lr9/S;->b(J)Lr9/S;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lr9/K;

    .line 12
    .line 13
    iget-object v0, v0, Lr9/K;->g:Lr9/O;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lr9/O;->b(Lr9/S;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public m(Ls9/h;)V
    .locals 3

    .line 1
    iget-object p1, p1, Ls9/h;->a:Ls9/m;

    .line 2
    .line 3
    invoke-static {p1}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, LA7/c0;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x2

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aput-object p1, v1, v2

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    aput-object v0, v1, p1

    .line 23
    .line 24
    iget-object p1, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lr9/K;

    .line 27
    .line 28
    const-string v0, "INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)"

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/c0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/Z;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LA7/n0;

    .line 11
    .line 12
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v3, p0, LA7/c0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, LA7/c0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, LA7/c0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 51
    .line 52
    .line 53
    return-void
.end method
