.class public LYc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Luc/p;
.implements Luc/u;
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public b:Luc/r;

.field public c:Landroid/app/Activity;

.field public final d:LYc/h;

.field public e:LYc/e;

.field public final f:LYc/h;

.field public g:LYc/e;

.field public h:LW9/t;

.field public i:Ljava/util/Map;

.field public j:LYc/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LYc/f;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    sget-object v0, LYc/h;->l:LYc/h;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, LYc/h;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/lifecycle/D;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LYc/h;->l:LYc/h;

    .line 21
    .line 22
    :cond_0
    sget-object v0, LYc/h;->l:LYc/h;

    .line 23
    .line 24
    iput-object v0, p0, LYc/f;->d:LYc/h;

    .line 25
    .line 26
    sget-object v0, LYc/h;->m:LYc/h;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance v0, LYc/h;

    .line 31
    .line 32
    invoke-direct {v0}, Landroidx/lifecycle/D;-><init>()V

    .line 33
    .line 34
    .line 35
    sput-object v0, LYc/h;->m:LYc/h;

    .line 36
    .line 37
    :cond_1
    sget-object v0, LYc/h;->m:LYc/h;

    .line 38
    .line 39
    iput-object v0, p0, LYc/f;->f:LYc/h;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final didReinitializeFirebaseCore()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LNc/c;

    .line 9
    .line 10
    const/16 v3, 0xc

    .line 11
    .line 12
    invoke-direct {v2, v3, v0}, LNc/c;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LB8/a;

    .line 9
    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-direct {v2, p1, v0, v3}, LB8/a;-><init>(Ls8/g;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lq/s1;->c(Luc/u;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYc/f;->j:LYc/g;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lq/s1;->d(Luc/v;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroid/app/Activity;

    .line 14
    .line 15
    iput-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    const/high16 v0, 0x100000

    .line 46
    .line 47
    and-int/2addr p1, v0

    .line 48
    if-eq p1, v0, :cond_0

    .line 49
    .line 50
    iget-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, LYc/f;->onNewIntent(Landroid/content/Intent;)Z

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "FLTFireContextHolder"

    .line 4
    .line 5
    const-string v2, "received application context."

    .line 6
    .line 7
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    sput-object v0, Lka/e0;->h:Landroid/content/Context;

    .line 11
    .line 12
    new-instance v0, Luc/r;

    .line 13
    .line 14
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 15
    .line 16
    const-string v1, "plugins.flutter.io/firebase_messaging"

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LYc/f;->b:Luc/r;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, LYc/g;

    .line 27
    .line 28
    invoke-direct {p1}, LYc/g;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p1, LYc/g;->b:Z

    .line 33
    .line 34
    iput-object p1, p0, LYc/f;->j:LYc/g;

    .line 35
    .line 36
    new-instance p1, LYc/e;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, v0}, LYc/e;-><init>(LYc/f;I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LYc/f;->e:LYc/e;

    .line 43
    .line 44
    new-instance v0, LYc/e;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v0, p0, v2}, LYc/e;-><init>(LYc/f;I)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, LYc/f;->g:LYc/e;

    .line 51
    .line 52
    iget-object v0, p0, LYc/f;->d:LYc/h;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Landroidx/lifecycle/D;->e(Landroidx/lifecycle/F;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LYc/f;->f:LYc/h;

    .line 58
    .line 59
    iget-object v0, p0, LYc/f;->g:LYc/e;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Landroidx/lifecycle/D;->e(Landroidx/lifecycle/F;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v1, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LYc/f;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LYc/f;->c:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LYc/f;->f:LYc/h;

    .line 2
    .line 3
    iget-object v0, p0, LYc/f;->g:LYc/e;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroidx/lifecycle/D;->i(Landroidx/lifecycle/F;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LYc/f;->d:LYc/h;

    .line 9
    .line 10
    iget-object v0, p0, LYc/f;->e:LYc/e;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroidx/lifecycle/D;->i(Landroidx/lifecycle/F;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x3

    .line 10
    iget-object v8, p1, Luc/o;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v9, -0x1

    .line 18
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    sparse-switch v10, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :sswitch_0
    const-string v10, "Messaging#getToken"

    .line 28
    .line 29
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-nez v8, :cond_0

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_0
    const/16 v9, 0xa

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :sswitch_1
    const-string v10, "Messaging#getNotificationSettings"

    .line 42
    .line 43
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    const/16 v9, 0x9

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_2
    const-string v10, "Messaging#requestPermission"

    .line 56
    .line 57
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-nez v8, :cond_2

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_2
    const/16 v9, 0x8

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :sswitch_3
    const-string v10, "Messaging#sendMessage"

    .line 70
    .line 71
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-nez v8, :cond_3

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_3
    const/4 v9, 0x7

    .line 80
    goto :goto_0

    .line 81
    :sswitch_4
    const-string v10, "Messaging#startBackgroundIsolate"

    .line 82
    .line 83
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-nez v8, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    move v9, v1

    .line 91
    goto :goto_0

    .line 92
    :sswitch_5
    const-string v10, "Messaging#setDeliveryMetricsExportToBigQuery"

    .line 93
    .line 94
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-nez v8, :cond_5

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    move v9, v2

    .line 102
    goto :goto_0

    .line 103
    :sswitch_6
    const-string v10, "Messaging#subscribeToTopic"

    .line 104
    .line 105
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-nez v8, :cond_6

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    move v9, v3

    .line 113
    goto :goto_0

    .line 114
    :sswitch_7
    const-string v10, "Messaging#unsubscribeFromTopic"

    .line 115
    .line 116
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-nez v8, :cond_7

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    move v9, v7

    .line 124
    goto :goto_0

    .line 125
    :sswitch_8
    const-string v10, "Messaging#deleteToken"

    .line 126
    .line 127
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-nez v8, :cond_8

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    move v9, v4

    .line 135
    goto :goto_0

    .line 136
    :sswitch_9
    const-string v10, "Messaging#setAutoInitEnabled"

    .line 137
    .line 138
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-nez v8, :cond_9

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_9
    move v9, v5

    .line 146
    goto :goto_0

    .line 147
    :sswitch_a
    const-string v10, "Messaging#getInitialMessage"

    .line 148
    .line 149
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-nez v8, :cond_a

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_a
    move v9, v6

    .line 157
    :goto_0
    packed-switch v9, :pswitch_data_0

    .line 158
    .line 159
    .line 160
    check-cast p2, Ltc/g;

    .line 161
    .line 162
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_0
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 167
    .line 168
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 169
    .line 170
    .line 171
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 172
    .line 173
    new-instance v1, LYc/d;

    .line 174
    .line 175
    invoke-direct {v1, p0, p1, v4}, LYc/d;-><init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    goto/16 :goto_6

    .line 186
    .line 187
    :pswitch_1
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 188
    .line 189
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 190
    .line 191
    .line 192
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 193
    .line 194
    new-instance v1, LYc/d;

    .line 195
    .line 196
    invoke-direct {v1, p0, p1, v7}, LYc/d;-><init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    goto/16 :goto_6

    .line 207
    .line 208
    :pswitch_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    const/16 v0, 0x21

    .line 211
    .line 212
    if-lt p1, v0, :cond_b

    .line 213
    .line 214
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 215
    .line 216
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 220
    .line 221
    new-instance v1, LYc/d;

    .line 222
    .line 223
    invoke-direct {v1, p0, p1, v5}, LYc/d;-><init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :cond_b
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 236
    .line 237
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 238
    .line 239
    .line 240
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 241
    .line 242
    new-instance v1, LYc/d;

    .line 243
    .line 244
    invoke-direct {v1, p0, p1, v7}, LYc/d;-><init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    goto/16 :goto_6

    .line 255
    .line 256
    :pswitch_3
    check-cast p1, Ljava/util/Map;

    .line 257
    .line 258
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 259
    .line 260
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 261
    .line 262
    .line 263
    sget-object v2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 264
    .line 265
    new-instance v3, LRc/a;

    .line 266
    .line 267
    invoke-direct {v3, p1, v0, v1}, LRc/a;-><init>(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 268
    .line 269
    .line 270
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    goto/16 :goto_6

    .line 278
    .line 279
    :pswitch_4
    check-cast p1, Ljava/util/Map;

    .line 280
    .line 281
    const-string v1, "pluginCallbackHandle"

    .line 282
    .line 283
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    const-string v2, "userCallbackHandle"

    .line 288
    .line 289
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    instance-of v2, v1, Ljava/lang/Long;

    .line 294
    .line 295
    if-eqz v2, :cond_c

    .line 296
    .line 297
    check-cast v1, Ljava/lang/Long;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 300
    .line 301
    .line 302
    move-result-wide v1

    .line 303
    goto :goto_1

    .line 304
    :cond_c
    instance-of v2, v1, Ljava/lang/Integer;

    .line 305
    .line 306
    if-eqz v2, :cond_12

    .line 307
    .line 308
    check-cast v1, Ljava/lang/Integer;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    int-to-long v1, v1

    .line 315
    :goto_1
    instance-of v3, p1, Ljava/lang/Long;

    .line 316
    .line 317
    if-eqz v3, :cond_d

    .line 318
    .line 319
    check-cast p1, Ljava/lang/Long;

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 322
    .line 323
    .line 324
    move-result-wide v3

    .line 325
    goto :goto_2

    .line 326
    :cond_d
    instance-of v3, p1, Ljava/lang/Integer;

    .line 327
    .line 328
    if-eqz v3, :cond_11

    .line 329
    .line 330
    check-cast p1, Ljava/lang/Integer;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    int-to-long v3, p1

    .line 337
    :goto_2
    iget-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 338
    .line 339
    const/4 v5, 0x0

    .line 340
    if-eqz p1, :cond_e

    .line 341
    .line 342
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-static {p1}, La2/v;->v(Landroid/content/Intent;)La2/v;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    goto :goto_3

    .line 351
    :cond_e
    move-object p1, v5

    .line 352
    :goto_3
    sget-object v7, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->h:Ljava/util/List;

    .line 353
    .line 354
    sget-object v7, Lka/e0;->h:Landroid/content/Context;

    .line 355
    .line 356
    const-string v8, "io.flutter.firebase.messaging.callback"

    .line 357
    .line 358
    if-nez v7, :cond_f

    .line 359
    .line 360
    const-string v7, "FLTFireBGExecutor"

    .line 361
    .line 362
    const-string v9, "Context is null, cannot continue."

    .line 363
    .line 364
    invoke-static {v7, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_f
    invoke-virtual {v7, v8, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    const-string v9, "callback_handle"

    .line 377
    .line 378
    invoke-interface {v7, v9, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 383
    .line 384
    .line 385
    :goto_4
    sget-object v7, Lka/e0;->h:Landroid/content/Context;

    .line 386
    .line 387
    invoke-virtual {v7, v8, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    const-string v7, "user_callback_handle"

    .line 396
    .line 397
    invoke-interface {v6, v7, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 402
    .line 403
    .line 404
    sget-object v3, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->i:LDd/c;

    .line 405
    .line 406
    if-eqz v3, :cond_10

    .line 407
    .line 408
    const-string p1, "FLTFireMsgService"

    .line 409
    .line 410
    const-string v0, "Attempted to start a duplicate background isolate. Returning..."

    .line 411
    .line 412
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    goto :goto_5

    .line 416
    :cond_10
    new-instance v3, LDd/c;

    .line 417
    .line 418
    invoke-direct {v3, v0}, LDd/c;-><init>(I)V

    .line 419
    .line 420
    .line 421
    sput-object v3, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundService;->i:LDd/c;

    .line 422
    .line 423
    invoke-virtual {v3, v1, v2, p1}, LDd/c;->R(JLa2/v;)V

    .line 424
    .line 425
    .line 426
    :goto_5
    invoke-static {v5}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    goto/16 :goto_6

    .line 431
    .line 432
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 433
    .line 434
    const-string p2, "Expected \'Long\' or \'Integer\' type for \'userCallbackHandle\'."

    .line 435
    .line 436
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw p1

    .line 440
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 441
    .line 442
    const-string p2, "Expected \'Long\' or \'Integer\' type for \'pluginCallbackHandle\'."

    .line 443
    .line 444
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw p1

    .line 448
    :pswitch_5
    check-cast p1, Ljava/util/Map;

    .line 449
    .line 450
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 451
    .line 452
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 453
    .line 454
    .line 455
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 456
    .line 457
    new-instance v2, LRc/a;

    .line 458
    .line 459
    invoke-direct {v2, p1, v0, v3}, LRc/a;-><init>(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    goto :goto_6

    .line 470
    :pswitch_6
    check-cast p1, Ljava/util/Map;

    .line 471
    .line 472
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 473
    .line 474
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 475
    .line 476
    .line 477
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 478
    .line 479
    new-instance v3, LRc/a;

    .line 480
    .line 481
    invoke-direct {v3, p1, v0, v2}, LRc/a;-><init>(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 482
    .line 483
    .line 484
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    goto :goto_6

    .line 492
    :pswitch_7
    check-cast p1, Ljava/util/Map;

    .line 493
    .line 494
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 495
    .line 496
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 497
    .line 498
    .line 499
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 500
    .line 501
    new-instance v2, LRc/a;

    .line 502
    .line 503
    invoke-direct {v2, p1, v0, v7}, LRc/a;-><init>(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    goto :goto_6

    .line 514
    :pswitch_8
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 515
    .line 516
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 517
    .line 518
    .line 519
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 520
    .line 521
    new-instance v1, LNc/c;

    .line 522
    .line 523
    const/16 v2, 0xd

    .line 524
    .line 525
    invoke-direct {v1, v2, p1}, LNc/c;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    goto :goto_6

    .line 536
    :pswitch_9
    check-cast p1, Ljava/util/Map;

    .line 537
    .line 538
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 539
    .line 540
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 541
    .line 542
    .line 543
    sget-object v2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 544
    .line 545
    new-instance v3, LAb/a;

    .line 546
    .line 547
    invoke-direct {v3, p0, p1, v1, v0}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 548
    .line 549
    .line 550
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    goto :goto_6

    .line 558
    :pswitch_a
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 559
    .line 560
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 561
    .line 562
    .line 563
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 564
    .line 565
    new-instance v1, LYc/d;

    .line 566
    .line 567
    invoke-direct {v1, p0, p1, v6}, LYc/d;-><init>(LYc/f;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    :goto_6
    new-instance v0, LA5/h;

    .line 578
    .line 579
    check-cast p2, Ltc/g;

    .line 580
    .line 581
    const/16 v1, 0x1b

    .line 582
    .line 583
    invoke-direct {v0, v1, p0, p2}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    nop

    .line 591
    :sswitch_data_0
    .sparse-switch
        -0x659116c6 -> :sswitch_a
        -0x6304bde1 -> :sswitch_9
        -0x27332c11 -> :sswitch_8
        0x191cc013 -> :sswitch_7
        0x1e2dde89 -> :sswitch_6
        0x243b9fa3 -> :sswitch_5
        0x3756bbda -> :sswitch_4
        0x457e7c40 -> :sswitch_3
        0x4964bddf -> :sswitch_2
        0x4a23be05 -> :sswitch_1
        0x56fbb702 -> :sswitch_0
    .end sparse-switch

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final onNewIntent(Landroid/content/Intent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "google.message_id"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "message_id"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    sget-object v1, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingReceiver;->a:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, LW9/t;

    .line 40
    .line 41
    const-string v3, "notification"

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    invoke-static {}, LY9/c;->h()LY9/c;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5, v0}, LY9/c;->g(Ljava/lang/String;)Ljava/util/HashMap;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    invoke-static {v5}, Lp7/b;->F(Ljava/util/Map;)LW9/t;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v6, "message"

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v5}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    check-cast v5, Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Ljava/util/Map;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    :goto_0
    move-object v5, v4

    .line 86
    :goto_1
    if-nez v2, :cond_5

    .line 87
    .line 88
    :goto_2
    const/4 p1, 0x0

    .line 89
    return p1

    .line 90
    :cond_5
    iput-object v2, p0, LYc/f;->h:LW9/t;

    .line 91
    .line 92
    iput-object v5, p0, LYc/f;->i:Ljava/util/Map;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-static {v2}, Lp7/b;->N(LW9/t;)Ljava/util/HashMap;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v2}, LW9/t;->X()LW9/s;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-nez v1, :cond_6

    .line 106
    .line 107
    iget-object v1, p0, LYc/f;->i:Ljava/util/Map;

    .line 108
    .line 109
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_6
    iget-object v1, p0, LYc/f;->b:Luc/r;

    .line 115
    .line 116
    const-string v2, "Messaging#onMessageOpenedApp"

    .line 117
    .line 118
    invoke-virtual {v1, v2, v0, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, LYc/f;->c:Landroid/app/Activity;

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x1

    .line 127
    return p1
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 0

    .line 1
    check-cast p1, Lq/s1;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lq/s1;->c(Luc/u;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p1, p0, LYc/f;->c:Landroid/app/Activity;

    .line 11
    .line 12
    return-void
.end method
