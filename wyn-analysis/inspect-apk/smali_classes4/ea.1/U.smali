.class public final Lea/U;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:J

.field public final c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lea/U;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Messenger;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lea/U;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v2, Lea/M;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Firebase.app[SessionGenerator::class.java]"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast v0, Lea/M;

    .line 22
    .line 23
    iget-object v0, v0, Lea/M;->e:Lea/E;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lea/E;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Lea/U;->c(Landroid/os/Messenger;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p1, "currentSession"

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-class v2, Lea/v;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "Firebase.app[SessionDatastore::class.java]"

    .line 50
    .line 51
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast v0, Lea/v;

    .line 55
    .line 56
    check-cast v0, Lea/D;

    .line 57
    .line 58
    iget-object v0, v0, Lea/D;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lea/o;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v1, v0, Lea/o;->a:Ljava/lang/String;

    .line 69
    .line 70
    :cond_2
    const-string v0, "SessionLifecycleService"

    .line 71
    .line 72
    const-string v2, "App has not yet foregrounded. Using previously stored session."

    .line 73
    .line 74
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, p1, v1}, Lea/U;->c(Landroid/os/Messenger;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method public final b()V
    .locals 12

    .line 1
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lea/M;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v2, "Firebase.app[SessionGenerator::class.java]"

    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Lea/M;

    .line 17
    .line 18
    iget v3, v0, Lea/M;->d:I

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    iput v3, v0, Lea/M;->d:I

    .line 23
    .line 24
    new-instance v4, Lea/E;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    iget-object v3, v0, Lea/M;->c:Ljava/lang/String;

    .line 29
    .line 30
    :goto_0
    move-object v7, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {v0}, Lea/M;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget v9, v0, Lea/M;->d:I

    .line 38
    .line 39
    iget-object v3, v0, Lea/M;->a:Lea/Y;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    const-wide/16 v10, 0x3e8

    .line 49
    .line 50
    mul-long/2addr v5, v10

    .line 51
    iget-object v8, v0, Lea/M;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct/range {v4 .. v9}, Lea/E;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    iput-object v4, v0, Lea/M;->e:Lea/E;

    .line 57
    .line 58
    const-string v0, "SessionLifecycleService"

    .line 59
    .line 60
    const-string v3, "Generated new session."

    .line 61
    .line 62
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    const-string v3, "Broadcasting new session"

    .line 66
    .line 67
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-class v3, Lea/H;

    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v3, "Firebase.app[SessionFirelogPublisher::class.java]"

    .line 81
    .line 82
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast v0, Lea/H;

    .line 86
    .line 87
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3, v1}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    check-cast v3, Lea/M;

    .line 99
    .line 100
    iget-object v3, v3, Lea/M;->e:Lea/E;

    .line 101
    .line 102
    const-string v4, "currentSession"

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    if-eqz v3, :cond_3

    .line 106
    .line 107
    check-cast v0, Lea/K;

    .line 108
    .line 109
    iget-object v6, v0, Lea/K;->e:Ljf/h;

    .line 110
    .line 111
    invoke-static {v6}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    new-instance v7, Lea/I;

    .line 116
    .line 117
    invoke-direct {v7, v0, v3, v5}, Lea/I;-><init>(Lea/K;Lea/E;Ljf/c;)V

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x3

    .line 121
    invoke-static {v6, v5, v7, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 122
    .line 123
    .line 124
    new-instance v3, Ljava/util/ArrayList;

    .line 125
    .line 126
    iget-object v6, p0, Lea/U;->c:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_1

    .line 140
    .line 141
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Landroid/os/Messenger;

    .line 146
    .line 147
    const-string v7, "it"

    .line 148
    .line 149
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v6}, Lea/U;->a(Landroid/os/Messenger;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_1
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    const-class v6, Lea/v;

    .line 161
    .line 162
    invoke-virtual {v3, v6}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v6, "Firebase.app[SessionDatastore::class.java]"

    .line 167
    .line 168
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    check-cast v3, Lea/v;

    .line 172
    .line 173
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v6, v1}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    check-cast v1, Lea/M;

    .line 185
    .line 186
    iget-object v1, v1, Lea/M;->e:Lea/E;

    .line 187
    .line 188
    if-eqz v1, :cond_2

    .line 189
    .line 190
    check-cast v3, Lea/D;

    .line 191
    .line 192
    iget-object v1, v1, Lea/E;->a:Ljava/lang/String;

    .line 193
    .line 194
    const-string v2, "sessionId"

    .line 195
    .line 196
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v3, Lea/D;->b:Ljf/h;

    .line 200
    .line 201
    invoke-static {v2}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    new-instance v4, Lea/C;

    .line 206
    .line 207
    invoke-direct {v4, v3, v1, v5}, Lea/C;-><init>(Lea/D;Ljava/lang/String;Ljf/c;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v5, v4, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v5

    .line 218
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v5
.end method

.method public final c(Landroid/os/Messenger;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "SessionLifecycleService"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "SessionUpdateExtra"

    .line 9
    .line 10
    invoke-virtual {v1, v2, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {v3, p2, v2, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p2

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Unable to push new session to "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const/16 p1, 0x2e

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "Removing dead client from list: "

    .line 54
    .line 55
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Lea/U;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :goto_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "msg"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-wide v1, p0, Lea/U;->b:J

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmp-long v1, v1, v3

    .line 14
    .line 15
    const/16 v2, 0x2e

    .line 16
    .line 17
    const-string v3, "SessionLifecycleService"

    .line 18
    .line 19
    if-lez v1, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "Ignoring old message from "

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, " which is older than "

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v4, p0, Lea/U;->b:J

    .line 41
    .line 42
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    if-eq v1, v4, :cond_3

    .line 60
    .line 61
    const/4 v0, 0x2

    .line 62
    if-eq v1, v0, :cond_2

    .line 63
    .line 64
    const/4 v0, 0x4

    .line 65
    if-eq v1, v0, :cond_1

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v1, "Received unexpected event from the SessionLifecycleClient: "

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    iget-object v0, p0, Lea/U;->c:Ljava/util/ArrayList;

    .line 89
    .line 90
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 96
    .line 97
    const-string v2, "msg.replyTo"

    .line 98
    .line 99
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Lea/U;->a(Landroid/os/Messenger;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v2, "Client "

    .line 108
    .line 109
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v2, " bound at "

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, ". Clients: "

    .line 130
    .line 131
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v1, "Activity backgrounding at "

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 171
    .line 172
    .line 173
    move-result-wide v0

    .line 174
    iput-wide v0, p0, Lea/U;->b:J

    .line 175
    .line 176
    return-void

    .line 177
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v5, "Activity foregrounding at "

    .line 180
    .line 181
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 185
    .line 186
    .line 187
    move-result-wide v5

    .line 188
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    iget-boolean v1, p0, Lea/U;->a:Z

    .line 202
    .line 203
    if-nez v1, :cond_4

    .line 204
    .line 205
    const-string v0, "Cold start detected."

    .line 206
    .line 207
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    iput-boolean v4, p0, Lea/U;->a:Z

    .line 211
    .line 212
    invoke-virtual {p0}, Lea/U;->b()V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :cond_4
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 218
    .line 219
    .line 220
    move-result-wide v1

    .line 221
    iget-wide v4, p0, Lea/U;->b:J

    .line 222
    .line 223
    sub-long/2addr v1, v4

    .line 224
    sget-object v4, Lga/j;->c:Lga/h;

    .line 225
    .line 226
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    const-class v5, Lga/j;

    .line 234
    .line 235
    invoke-virtual {v4, v5}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    const-string v5, "Firebase.app[SessionsSettings::class.java]"

    .line 240
    .line 241
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    check-cast v4, Lga/j;

    .line 245
    .line 246
    iget-object v5, v4, Lga/j;->a:LW9/p;

    .line 247
    .line 248
    iget-object v5, v5, LW9/p;->a:Landroid/os/Bundle;

    .line 249
    .line 250
    const-string v6, "firebase_sessions_sessions_restart_timeout"

    .line 251
    .line 252
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    if-eqz v7, :cond_5

    .line 257
    .line 258
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    sget-object v6, LCf/c;->d:LCf/c;

    .line 263
    .line 264
    invoke-static {v5, v6}, LFe/b;->S(ILCf/c;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v5

    .line 268
    new-instance v7, LCf/a;

    .line 269
    .line 270
    invoke-direct {v7, v5, v6}, LCf/a;-><init>(J)V

    .line 271
    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_5
    move-object v7, v0

    .line 275
    :goto_0
    const-wide/16 v5, 0x0

    .line 276
    .line 277
    if-eqz v7, :cond_6

    .line 278
    .line 279
    sget-object v8, LCf/a;->b:LCf/h;

    .line 280
    .line 281
    iget-wide v7, v7, LCf/a;->a:J

    .line 282
    .line 283
    cmp-long v9, v7, v5

    .line 284
    .line 285
    if-lez v9, :cond_6

    .line 286
    .line 287
    invoke-static {v7, v8}, LCf/a;->f(J)Z

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    if-nez v9, :cond_6

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_6
    iget-object v4, v4, Lga/j;->b:Lga/d;

    .line 295
    .line 296
    invoke-virtual {v4}, Lga/d;->b()Lga/n;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    iget-object v4, v4, Lga/n;->b:Lga/f;

    .line 301
    .line 302
    if-eqz v4, :cond_a

    .line 303
    .line 304
    iget-object v4, v4, Lga/f;->c:Ljava/lang/Integer;

    .line 305
    .line 306
    if-eqz v4, :cond_7

    .line 307
    .line 308
    sget-object v0, LCf/a;->b:LCf/h;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    sget-object v4, LCf/c;->d:LCf/c;

    .line 315
    .line 316
    invoke-static {v0, v4}, LFe/b;->S(ILCf/c;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v7

    .line 320
    new-instance v0, LCf/a;

    .line 321
    .line 322
    invoke-direct {v0, v7, v8}, LCf/a;-><init>(J)V

    .line 323
    .line 324
    .line 325
    :cond_7
    if-eqz v0, :cond_8

    .line 326
    .line 327
    sget-object v4, LCf/a;->b:LCf/h;

    .line 328
    .line 329
    iget-wide v7, v0, LCf/a;->a:J

    .line 330
    .line 331
    cmp-long v0, v7, v5

    .line 332
    .line 333
    if-lez v0, :cond_8

    .line 334
    .line 335
    invoke-static {v7, v8}, LCf/a;->f(J)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_8

    .line 340
    .line 341
    goto :goto_1

    .line 342
    :cond_8
    sget-object v0, LCf/a;->b:LCf/h;

    .line 343
    .line 344
    const/16 v0, 0x1e

    .line 345
    .line 346
    sget-object v4, LCf/c;->e:LCf/c;

    .line 347
    .line 348
    invoke-static {v0, v4}, LFe/b;->S(ILCf/c;)J

    .line 349
    .line 350
    .line 351
    move-result-wide v7

    .line 352
    :goto_1
    invoke-static {v7, v8}, LCf/a;->d(J)J

    .line 353
    .line 354
    .line 355
    move-result-wide v4

    .line 356
    cmp-long v0, v1, v4

    .line 357
    .line 358
    if-lez v0, :cond_9

    .line 359
    .line 360
    const-string v0, "Session too long in background. Creating new session."

    .line 361
    .line 362
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0}, Lea/U;->b()V

    .line 366
    .line 367
    .line 368
    :cond_9
    :goto_2
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 369
    .line 370
    .line 371
    move-result-wide v0

    .line 372
    iput-wide v0, p0, Lea/U;->b:J

    .line 373
    .line 374
    return-void

    .line 375
    :cond_a
    const-string p1, "sessionConfigs"

    .line 376
    .line 377
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v0
.end method
