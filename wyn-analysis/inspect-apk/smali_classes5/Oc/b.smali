.class public LOc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lqc/b;
.implements Luc/p;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public b:Luc/f;

.field public c:Luc/r;


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
    iput-object v0, p0, LOc/b;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method

.method public static a(Ljava/util/Map;)LC8/f;
    .locals 1

    .line 1
    const-string v0, "appName"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-class v0, LC8/f;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, LC8/f;

    .line 23
    .line 24
    return-object p0
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
    const/4 v3, 0x1

    .line 11
    invoke-direct {v2, v3, v0}, LNc/c;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

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
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, LNc/c;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, v2, p1}, LNc/c;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    const-string v0, "plugins.flutter.io/firebase_app_check"

    .line 4
    .line 5
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Luc/r;

    .line 9
    .line 10
    invoke-direct {v1, p1, v0}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LOc/b;->c:Luc/r;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Luc/r;->b(Luc/p;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LOc/b;->b:Luc/f;

    .line 19
    .line 20
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 4

    .line 1
    iget-object p1, p0, LOc/b;->c:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, LOc/b;->c:Luc/r;

    .line 8
    .line 9
    iput-object v0, p0, LOc/b;->b:Luc/f;

    .line 10
    .line 11
    iget-object p1, p0, LOc/b;->a:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Luc/j;

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Luc/i;

    .line 38
    .line 39
    invoke-interface {v3, v0}, Luc/i;->onCancel(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0}, Luc/j;->a(Luc/i;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    iget-object v5, p1, Luc/o;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    sparse-switch v7, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_0
    const-string v7, "FirebaseAppCheck#activate"

    .line 23
    .line 24
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v6, v0

    .line 32
    goto :goto_0

    .line 33
    :sswitch_1
    const-string v7, "FirebaseAppCheck#getToken"

    .line 34
    .line 35
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v6, v1

    .line 43
    goto :goto_0

    .line 44
    :sswitch_2
    const-string v7, "FirebaseAppCheck#registerTokenListener"

    .line 45
    .line 46
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v6, v2

    .line 54
    goto :goto_0

    .line 55
    :sswitch_3
    const-string v7, "FirebaseAppCheck#setTokenAutoRefreshEnabled"

    .line 56
    .line 57
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v6, v3

    .line 65
    goto :goto_0

    .line 66
    :sswitch_4
    const-string v7, "FirebaseAppCheck#getLimitedUseAppCheckToken"

    .line 67
    .line 68
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    move v6, v4

    .line 76
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    check-cast p2, Ltc/g;

    .line 80
    .line 81
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_0
    check-cast p1, Ljava/util/Map;

    .line 86
    .line 87
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 88
    .line 89
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 90
    .line 91
    .line 92
    sget-object v2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 93
    .line 94
    new-instance v3, LOc/a;

    .line 95
    .line 96
    invoke-direct {v3, p0, p1, v0, v1}, LOc/a;-><init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    goto :goto_1

    .line 107
    :pswitch_1
    check-cast p1, Ljava/util/Map;

    .line 108
    .line 109
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 110
    .line 111
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 112
    .line 113
    .line 114
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 115
    .line 116
    new-instance v3, LOc/a;

    .line 117
    .line 118
    invoke-direct {v3, p0, p1, v0, v2}, LOc/a;-><init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    goto :goto_1

    .line 129
    :pswitch_2
    check-cast p1, Ljava/util/Map;

    .line 130
    .line 131
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 132
    .line 133
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 134
    .line 135
    .line 136
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 137
    .line 138
    new-instance v2, LOc/a;

    .line 139
    .line 140
    invoke-direct {v2, p0, p1, v0, v4}, LOc/a;-><init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_1

    .line 151
    :pswitch_3
    check-cast p1, Ljava/util/Map;

    .line 152
    .line 153
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 154
    .line 155
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 156
    .line 157
    .line 158
    sget-object v2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 159
    .line 160
    new-instance v3, LOc/a;

    .line 161
    .line 162
    invoke-direct {v3, p0, p1, v1, v0}, LOc/a;-><init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    goto :goto_1

    .line 173
    :pswitch_4
    check-cast p1, Ljava/util/Map;

    .line 174
    .line 175
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 176
    .line 177
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 178
    .line 179
    .line 180
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 181
    .line 182
    new-instance v2, LOc/a;

    .line 183
    .line 184
    invoke-direct {v2, p0, p1, v0, v3}, LOc/a;-><init>(LOc/b;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :goto_1
    new-instance v0, LA5/h;

    .line 195
    .line 196
    check-cast p2, Ltc/g;

    .line 197
    .line 198
    const/16 v1, 0x11

    .line 199
    .line 200
    invoke-direct {v0, v1, p0, p2}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :sswitch_data_0
    .sparse-switch
        -0x4c3926fc -> :sswitch_4
        -0x2817667f -> :sswitch_3
        -0x3e78c2b -> :sswitch_2
        0x16aa6678 -> :sswitch_1
        0x3ec1db28 -> :sswitch_0
    .end sparse-switch

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
