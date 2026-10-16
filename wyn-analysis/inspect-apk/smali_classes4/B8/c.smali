.class public final synthetic LB8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB8/c;->a:I

    iput-object p2, p0, LB8/c;->b:Ljava/lang/Object;

    iput-object p3, p0, LB8/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ9/I;

    .line 4
    .line 5
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/protobuf/GeneratedMessageLite;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, v0, LJ9/I;->a:Landroid/app/Application;

    .line 11
    .line 12
    iget-object v3, v0, LJ9/I;->b:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    .line 16
    .line 17
    .line 18
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :try_start_1
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 27
    .line 28
    .line 29
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception v1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_2
    move-exception v2

    .line 41
    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    :goto_0
    throw v1

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 46
    throw v1
.end method

.method private final b()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-static {}, LW9/u;->f()LW9/u;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v3, "FirebaseMessaging"

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const-string v3, "FirebaseMessaging"

    .line 26
    .line 27
    const-string v5, "Starting service"

    .line 28
    .line 29
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v3, v2, LW9/u;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, Landroid/content/Intent;

    .line 40
    .line 41
    const-string v3, "com.google.firebase.MESSAGING_EVENT"

    .line 42
    .line 43
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    const-string v3, "Error resolving target intent service, skipping classname enforcement. Resolved service was: "

    .line 54
    .line 55
    monitor-enter v2

    .line 56
    :try_start_0
    iget-object v5, v2, LW9/u;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    monitor-exit v2

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v6, 0x0

    .line 70
    invoke-virtual {v5, v1, v6}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const/4 v6, 0x0

    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 78
    .line 79
    if-nez v5, :cond_2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    iget-object v8, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-eqz v7, :cond_5

    .line 93
    .line 94
    iget-object v7, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 95
    .line 96
    if-nez v7, :cond_3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    const-string v3, "."

    .line 100
    .line 101
    invoke-virtual {v7, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_4

    .line 106
    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iput-object v3, v2, LW9/u;->a:Ljava/lang/Object;

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_4
    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 135
    .line 136
    iput-object v3, v2, LW9/u;->a:Ljava/lang/Object;

    .line 137
    .line 138
    :goto_0
    iget-object v3, v2, LW9/u;->a:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v5, v3

    .line 141
    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    .line 143
    monitor-exit v2

    .line 144
    goto :goto_4

    .line 145
    :cond_5
    :goto_1
    :try_start_2
    const-string v7, "FirebaseMessaging"

    .line 146
    .line 147
    new-instance v8, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v3, "/"

    .line 158
    .line 159
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object v3, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v7, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    .line 173
    .line 174
    monitor-exit v2

    .line 175
    :goto_2
    move-object v5, v6

    .line 176
    goto :goto_4

    .line 177
    :cond_6
    :goto_3
    :try_start_3
    const-string v3, "FirebaseMessaging"

    .line 178
    .line 179
    const-string v5, "Failed to resolve target intent service, skipping classname enforcement"

    .line 180
    .line 181
    invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    .line 183
    .line 184
    monitor-exit v2

    .line 185
    goto :goto_2

    .line 186
    :goto_4
    if-eqz v5, :cond_8

    .line 187
    .line 188
    const-string v3, "FirebaseMessaging"

    .line 189
    .line 190
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_7

    .line 195
    .line 196
    const-string v3, "FirebaseMessaging"

    .line 197
    .line 198
    const-string v4, "Restricting intent to a specific service: "

    .line 199
    .line 200
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    :cond_7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 212
    .line 213
    .line 214
    :cond_8
    :try_start_4
    invoke-virtual {v2, v0}, LW9/u;->h(Landroid/content/Context;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_9

    .line 219
    .line 220
    invoke-static {v0, v1}, LW9/D;->d(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    goto :goto_5

    .line 225
    :catch_0
    move-exception v0

    .line 226
    goto :goto_6

    .line 227
    :catch_1
    move-exception v0

    .line 228
    goto :goto_7

    .line 229
    :cond_9
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    const-string v1, "FirebaseMessaging"

    .line 234
    .line 235
    const-string v2, "Missing wake lock permission, service start may be delayed"

    .line 236
    .line 237
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    :goto_5
    if-nez v0, :cond_a

    .line 241
    .line 242
    const-string v0, "FirebaseMessaging"

    .line 243
    .line 244
    const-string v1, "Error while delivering the message: ServiceIntent not found."

    .line 245
    .line 246
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 247
    .line 248
    .line 249
    const/16 v0, 0x194

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_a
    const/4 v0, -0x1

    .line 253
    goto :goto_8

    .line 254
    :goto_6
    const-string v1, "FirebaseMessaging"

    .line 255
    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v3, "Failed to start service while in background: "

    .line 259
    .line 260
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    const/16 v0, 0x192

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :goto_7
    const-string v1, "FirebaseMessaging"

    .line 277
    .line 278
    const-string v2, "Error while delivering the message to the serviceIntent"

    .line 279
    .line 280
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 281
    .line 282
    .line 283
    const/16 v0, 0x191

    .line 284
    .line 285
    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :goto_9
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 291
    throw v0
.end method

.method private final c()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LZ9/d;

    .line 4
    .line 5
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LC8/j;

    .line 8
    .line 9
    iget-object v0, v0, LZ9/d;->i:Laa/k;

    .line 10
    .line 11
    iget-object v2, v0, Laa/k;->b:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v2

    .line 14
    :try_start_0
    iget-object v0, v0, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v3, "fetch_timeout_in_seconds"

    .line 21
    .line 22
    iget-wide v4, v1, LC8/j;->a:J

    .line 23
    .line 24
    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v3, "minimum_fetch_interval_in_seconds"

    .line 29
    .line 30
    iget-wide v4, v1, LC8/j;->b:J

    .line 31
    .line 32
    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 37
    .line 38
    .line 39
    monitor-exit v2

    .line 40
    const/4 v0, 0x0

    .line 41
    return-object v0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw v0
.end method

.method private final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Laa/c;

    .line 4
    .line 5
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Laa/e;

    .line 8
    .line 9
    iget-object v0, v0, Laa/c;->b:Laa/o;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v2, v0, Laa/o;->a:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v3, v0, Laa/o;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    iget-object v1, v1, Laa/e;->a:Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v3, "UTF-8"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v2, v1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    const/4 v0, 0x0

    .line 41
    return-object v0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_0

    .line 44
    :catchall_1
    move-exception v1

    .line 45
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    throw v1
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LB8/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp9/n;

    .line 9
    .line 10
    iget-object v0, v0, Lp9/n;->g:Lr9/l;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, LB8/c;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lp9/u;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lr9/l;->b(Lp9/u;Z)Lba/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lp9/C;

    .line 22
    .line 23
    iget-object v3, v0, Lba/a;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lc9/d;

    .line 26
    .line 27
    invoke-direct {v1, v2, v3}, Lp9/C;-><init>(Lp9/u;Lc9/d;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lc9/c;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v0, v2}, Lp9/C;->d(Lc9/c;LA7/b0;)LA7/b0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {v1, v0, v2, v3}, Lp9/C;->a(LA7/b0;Lv9/t;Z)LX2/j;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lp9/D;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_0
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lp9/n;

    .line 52
    .line 53
    iget-object v0, v0, Lp9/n;->g:Lr9/l;

    .line 54
    .line 55
    iget-object v0, v0, Lr9/l;->f:LVa/Za;

    .line 56
    .line 57
    iget-object v1, v0, LVa/Za;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lr9/b;

    .line 60
    .line 61
    iget-object v2, p0, LB8/c;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ls9/h;

    .line 64
    .line 65
    invoke-interface {v1, v2}, Lr9/b;->e(Ls9/h;)Lt9/d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    iget-object v3, v1, Lt9/d;->b:Lt9/h;

    .line 72
    .line 73
    instance-of v3, v3, Lt9/l;

    .line 74
    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-static {v2}, Ls9/k;->g(Ls9/h;)Ls9/k;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    :goto_0
    iget-object v0, v0, LVa/Za;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lr9/A;

    .line 86
    .line 87
    invoke-interface {v0, v2}, Lr9/A;->B(Ls9/h;)Ls9/k;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_1
    if-eqz v1, :cond_2

    .line 92
    .line 93
    sget-object v2, Lt9/f;->b:Lt9/f;

    .line 94
    .line 95
    new-instance v3, Ls8/q;

    .line 96
    .line 97
    new-instance v4, Ljava/util/Date;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-direct {v3, v4}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v1, Lt9/d;->b:Lt9/h;

    .line 106
    .line 107
    invoke-virtual {v1, v0, v2, v3}, Lt9/h;->a(Ls9/k;Lt9/f;Ls8/q;)Lt9/f;

    .line 108
    .line 109
    .line 110
    :cond_2
    return-object v0

    .line 111
    :pswitch_1
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lorg/apache/tika/pipes/PipesClient;

    .line 114
    .line 115
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Llg/c;

    .line 118
    .line 119
    invoke-static {v0, v1}, Lorg/apache/tika/pipes/PipesClient;->a(Lorg/apache/tika/pipes/PipesClient;Llg/c;)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_2
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;

    .line 127
    .line 128
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Ljava/util/List;

    .line 131
    .line 132
    invoke-static {v0, v1}, Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;->a(Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;Ljava/util/List;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0

    .line 137
    :pswitch_3
    invoke-direct {p0}, LB8/c;->d()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    :pswitch_4
    invoke-direct {p0}, LB8/c;->c()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_5
    invoke-direct {p0}, LB8/c;->b()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    :pswitch_6
    invoke-direct {p0}, LB8/c;->a()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_7
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, LJ9/I;

    .line 160
    .line 161
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Lcom/google/protobuf/Parser;

    .line 164
    .line 165
    const-string v2, "Recoverable exception while reading cache: "

    .line 166
    .line 167
    monitor-enter v0

    .line 168
    :try_start_0
    iget-object v3, v0, LJ9/I;->a:Landroid/app/Application;

    .line 169
    .line 170
    iget-object v4, v0, LJ9/I;->b:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 173
    .line 174
    .line 175
    move-result-object v3
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    :try_start_1
    invoke-interface {v1, v3}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Lcom/google/protobuf/AbstractMessageLite;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 181
    .line 182
    if-eqz v3, :cond_3

    .line 183
    .line 184
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catchall_0
    move-exception v1

    .line 189
    goto :goto_6

    .line 190
    :catch_0
    move-exception v1

    .line 191
    goto :goto_4

    .line 192
    :catch_1
    move-exception v1

    .line 193
    goto :goto_4

    .line 194
    :cond_3
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 195
    goto :goto_5

    .line 196
    :catchall_1
    move-exception v1

    .line 197
    if-eqz v3, :cond_4

    .line 198
    .line 199
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :catchall_2
    move-exception v3

    .line 204
    :try_start_5
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    :cond_4
    :goto_3
    throw v1
    :try_end_5
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 208
    :goto_4
    :try_start_6
    new-instance v3, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v1}, Lic/d;->F(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    monitor-exit v0

    .line 228
    const/4 v1, 0x0

    .line 229
    :goto_5
    return-object v1

    .line 230
    :goto_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 231
    throw v1

    .line 232
    :pswitch_8
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, LI8/b;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, LD6/c1;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance v2, Lorg/json/JSONObject;

    .line 247
    .line 248
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v3, "safetyNetToken"

    .line 252
    .line 253
    iget-object v1, v1, LD6/c1;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    const-string v2, "UTF-8"

    .line 263
    .line 264
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-object v2, v0, LI8/b;->b:LC8/i;

    .line 269
    .line 270
    const/4 v3, 0x1

    .line 271
    iget-object v0, v0, LI8/b;->e:LC8/j;

    .line 272
    .line 273
    invoke-virtual {v2, v1, v3, v0}, LC8/i;->n([BILC8/j;)LC8/a;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :pswitch_9
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, LG8/d;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, LD6/c1;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v2, Lorg/json/JSONObject;

    .line 293
    .line 294
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 295
    .line 296
    .line 297
    const-string v3, "playIntegrityToken"

    .line 298
    .line 299
    iget-object v1, v1, LD6/c1;->a:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    const-string v2, "UTF-8"

    .line 309
    .line 310
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v2, v0, LG8/d;->c:LC8/i;

    .line 315
    .line 316
    const/4 v3, 0x3

    .line 317
    iget-object v0, v0, LG8/d;->f:LC8/j;

    .line 318
    .line 319
    invoke-virtual {v2, v1, v3, v0}, LC8/i;->n([BILC8/j;)LC8/a;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :pswitch_a
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 327
    .line 328
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Lcom/vungle/ads/internal/executor/i;

    .line 331
    .line 332
    invoke-static {v0, v1}, Lcom/vungle/ads/internal/executor/g;->a(Ljava/util/concurrent/Callable;Ltf/a;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    return-object v0

    .line 337
    :pswitch_b
    iget-object v0, p0, LB8/c;->b:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, LB8/d;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    iget-object v1, p0, LB8/c;->c:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v1, LB8/e;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    new-instance v2, Lorg/json/JSONObject;

    .line 352
    .line 353
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 354
    .line 355
    .line 356
    const-string v3, "debugToken"

    .line 357
    .line 358
    iget-object v1, v1, LB8/e;->b:Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    const-string v2, "UTF-8"

    .line 368
    .line 369
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    iget-object v2, v0, LB8/d;->a:LC8/i;

    .line 374
    .line 375
    const/4 v3, 0x2

    .line 376
    iget-object v0, v0, LB8/d;->d:LC8/j;

    .line 377
    .line 378
    invoke-virtual {v2, v1, v3, v0}, LC8/i;->n([BILC8/j;)LC8/a;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    return-object v0

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
