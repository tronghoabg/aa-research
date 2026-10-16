.class Lcom/applovin/impl/h7$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/h7;->b()Ljava/util/TimerTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/h7;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/h7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 3
    .line 4
    invoke-static {v1}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;)Ljava/lang/Runnable;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/applovin/impl/h7;->c(Lcom/applovin/impl/h7;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v1

    .line 18
    :try_start_1
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 19
    .line 20
    invoke-static {v2}, Lcom/applovin/impl/h7;->d(Lcom/applovin/impl/h7;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;J)J

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/applovin/impl/h7;->e(Lcom/applovin/impl/h7;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;J)J

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 48
    .line 49
    invoke-static {v2, v0}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;Ljava/util/Timer;)Ljava/util/Timer;

    .line 50
    .line 51
    .line 52
    :goto_0
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw v0

    .line 56
    :catchall_1
    move-exception v1

    .line 57
    :try_start_2
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 58
    .line 59
    invoke-static {v2}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;)Lcom/applovin/impl/sdk/k;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 66
    .line 67
    invoke-static {v2}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;)Lcom/applovin/impl/sdk/k;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 81
    .line 82
    invoke-static {v2}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;)Lcom/applovin/impl/sdk/k;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "Timer"

    .line 91
    .line 92
    const-string v4, "Encountered error while executing timed task"

    .line 93
    .line 94
    invoke-virtual {v2, v3, v4, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :catchall_2
    move-exception v1

    .line 99
    goto :goto_5

    .line 100
    :cond_1
    :goto_2
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 101
    .line 102
    invoke-static {v2}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;)Lcom/applovin/impl/sdk/k;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/k;->D()Lcom/applovin/impl/r1;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, "Timer"

    .line 111
    .line 112
    const-string v4, "executingTimedTask"

    .line 113
    .line 114
    invoke-virtual {v2, v3, v4, v1}, Lcom/applovin/impl/r1;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    .line 116
    .line 117
    :cond_2
    iget-object v1, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 118
    .line 119
    invoke-static {v1}, Lcom/applovin/impl/h7;->c(Lcom/applovin/impl/h7;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    monitor-enter v1

    .line 124
    :try_start_3
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 125
    .line 126
    invoke-static {v2}, Lcom/applovin/impl/h7;->d(Lcom/applovin/impl/h7;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 133
    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 135
    .line 136
    .line 137
    move-result-wide v2

    .line 138
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;J)J

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/applovin/impl/h7;->e(Lcom/applovin/impl/h7;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v2

    .line 147
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;J)J

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_3
    move-exception v0

    .line 152
    goto :goto_4

    .line 153
    :cond_3
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 154
    .line 155
    invoke-static {v2, v0}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;Ljava/util/Timer;)Ljava/util/Timer;

    .line 156
    .line 157
    .line 158
    :goto_3
    monitor-exit v1

    .line 159
    return-void

    .line 160
    :goto_4
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 161
    throw v0

    .line 162
    :goto_5
    iget-object v2, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 163
    .line 164
    invoke-static {v2}, Lcom/applovin/impl/h7;->c(Lcom/applovin/impl/h7;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    monitor-enter v2

    .line 169
    :try_start_4
    iget-object v3, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 170
    .line 171
    invoke-static {v3}, Lcom/applovin/impl/h7;->d(Lcom/applovin/impl/h7;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_4

    .line 176
    .line 177
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 178
    .line 179
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    invoke-static {v0, v3, v4}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;J)J

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 187
    .line 188
    invoke-static {v0}, Lcom/applovin/impl/h7;->e(Lcom/applovin/impl/h7;)J

    .line 189
    .line 190
    .line 191
    move-result-wide v3

    .line 192
    invoke-static {v0, v3, v4}, Lcom/applovin/impl/h7;->b(Lcom/applovin/impl/h7;J)J

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :catchall_4
    move-exception v0

    .line 197
    goto :goto_7

    .line 198
    :cond_4
    iget-object v3, p0, Lcom/applovin/impl/h7$a;->a:Lcom/applovin/impl/h7;

    .line 199
    .line 200
    invoke-static {v3, v0}, Lcom/applovin/impl/h7;->a(Lcom/applovin/impl/h7;Ljava/util/Timer;)Ljava/util/Timer;

    .line 201
    .line 202
    .line 203
    :goto_6
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 204
    throw v1

    .line 205
    :goto_7
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 206
    throw v0
.end method
