.class public final synthetic Lmc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmc/j;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Lmc/f;

.field public final synthetic e:Ljava/nio/ByteBuffer;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Lmc/j;Ljava/lang/String;ILmc/f;Ljava/nio/ByteBuffer;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc/c;->a:Lmc/j;

    iput-object p2, p0, Lmc/c;->b:Ljava/lang/String;

    iput p3, p0, Lmc/c;->c:I

    iput-object p4, p0, Lmc/c;->d:Lmc/f;

    iput-object p5, p0, Lmc/c;->e:Ljava/nio/ByteBuffer;

    iput-wide p6, p0, Lmc/c;->f:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x0

    .line 5
    iget-wide v4, p0, Lmc/c;->f:J

    .line 6
    .line 7
    iget-object v6, p0, Lmc/c;->a:Lmc/j;

    .line 8
    .line 9
    iget-object v6, v6, Lmc/j;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 10
    .line 11
    const-string v7, "DartMessenger#handleMessageFromDart on "

    .line 12
    .line 13
    new-instance v8, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v9, "PlatformChannel ScheduleHandler on "

    .line 16
    .line 17
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v9, p0, Lmc/c;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-static {v8}, Lld/a;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v11, 0x1d

    .line 36
    .line 37
    iget v12, p0, Lmc/c;->c:I

    .line 38
    .line 39
    if-lt v10, v11, :cond_0

    .line 40
    .line 41
    invoke-static {v8}, Ltg/b;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v12, v0}, Ls3/a;->b(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    invoke-static {v8}, Ltg/b;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const-string v10, "asyncTraceEnd"

    .line 54
    .line 55
    :try_start_0
    sget-object v11, Ltg/b;->f:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    if-nez v11, :cond_1

    .line 58
    .line 59
    const-class v11, Landroid/os/Trace;

    .line 60
    .line 61
    new-array v13, v2, [Ljava/lang/Class;

    .line 62
    .line 63
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    aput-object v14, v13, v3

    .line 66
    .line 67
    const-class v14, Ljava/lang/String;

    .line 68
    .line 69
    aput-object v14, v13, v1

    .line 70
    .line 71
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    aput-object v14, v13, v0

    .line 74
    .line 75
    invoke-virtual {v11, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    sput-object v11, Ltg/b;->f:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    :goto_0
    sget-object v11, Ltg/b;->f:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    sget-wide v13, Ltg/b;->c:J

    .line 87
    .line 88
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v14

    .line 96
    new-array v2, v2, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object v13, v2, v3

    .line 99
    .line 100
    aput-object v8, v2, v1

    .line 101
    .line 102
    aput-object v14, v2, v0

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-virtual {v11, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_1
    invoke-static {v10, v0}, Ltg/b;->C(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Lld/a;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lmc/c;->d:Lmc/f;

    .line 128
    .line 129
    iget-object v1, p0, Lmc/c;->e:Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    :try_start_2
    iget-object v0, v0, Lmc/f;->a:Luc/d;

    .line 134
    .line 135
    new-instance v2, Lmc/g;

    .line 136
    .line 137
    invoke-direct {v2, v6, v12}, Lmc/g;-><init>(Lio/flutter/embedding/engine/FlutterJNI;I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0, v1, v2}, Luc/d;->d(Ljava/nio/ByteBuffer;Lmc/g;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :catch_1
    move-exception v0

    .line 145
    goto :goto_3

    .line 146
    :catch_2
    move-exception v0

    .line 147
    goto :goto_4

    .line 148
    :goto_3
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-eqz v7, :cond_2

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-interface {v7, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_2
    throw v0

    .line 167
    :goto_4
    const-string v2, "DartMessenger"

    .line 168
    .line 169
    const-string v7, "Uncaught exception in binary message listener"

    .line 170
    .line 171
    invoke-static {v2, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v12}, Lio/flutter/embedding/engine/FlutterJNI;->invokePlatformMessageEmptyResponseCallback(I)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_3
    invoke-virtual {v6, v12}, Lio/flutter/embedding/engine/FlutterJNI;->invokePlatformMessageEmptyResponseCallback(I)V

    .line 179
    .line 180
    .line 181
    :goto_5
    if-eqz v1, :cond_4

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_4

    .line 188
    .line 189
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    goto :goto_7

    .line 195
    :cond_4
    :goto_6
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6, v4, v5}, Lio/flutter/embedding/engine/FlutterJNI;->cleanupMessageData(J)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :goto_7
    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 203
    .line 204
    .line 205
    goto :goto_8

    .line 206
    :catchall_1
    move-exception v1

    .line 207
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    :goto_8
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 211
    :catchall_2
    move-exception v0

    .line 212
    invoke-virtual {v6, v4, v5}, Lio/flutter/embedding/engine/FlutterJNI;->cleanupMessageData(J)V

    .line 213
    .line 214
    .line 215
    throw v0
.end method
