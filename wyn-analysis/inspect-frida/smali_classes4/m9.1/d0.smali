.class public final Lm9/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp9/B;

.field public final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method public constructor <init>(Lp9/B;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm9/d0;->a:Lp9/B;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lm9/d0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lm9/m;)Lm9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/d0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lm9/d0;->b(Lm9/m;)Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lm9/o;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    return-object p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v0, v0, Lm9/G;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lm9/G;

    .line 40
    .line 41
    throw p1

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final b(Lm9/m;)Lcom/google/android/gms/tasks/Task;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lm9/d0;->a:Lp9/B;

    .line 3
    .line 4
    iget-object p1, p1, Lm9/m;->a:Ls9/h;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-boolean v2, v1, Lp9/B;->d:Z

    .line 11
    .line 12
    xor-int/2addr v2, v0

    .line 13
    const/4 v3, 0x0

    .line 14
    new-array v3, v3, [Ljava/lang/Object;

    .line 15
    .line 16
    const-string v4, "A transaction object cannot be used after its update callback has been invoked."

    .line 17
    .line 18
    invoke-static {v2, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, Lp9/B;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    new-instance p1, Lm9/G;

    .line 30
    .line 31
    const-string v0, "Firestore transactions require all reads to be executed before all writes."

    .line 32
    .line 33
    sget-object v1, Lm9/F;->e:Lm9/F;

    .line 34
    .line 35
    invoke-direct {p1, v0, v1}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    iget-object v2, v1, Lp9/B;->a:Lv9/g;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lka/k;->e()Lka/j;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object v4, v2, Lv9/g;->a:Lv9/o;

    .line 54
    .line 55
    iget-object v4, v4, Lv9/o;->b:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Lka/j;->b(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ls9/h;

    .line 75
    .line 76
    iget-object v6, v2, Lv9/g;->a:Lv9/o;

    .line 77
    .line 78
    invoke-virtual {v6, v5}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v3, v5}, Lka/j;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 92
    .line 93
    invoke-direct {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v6, v2, Lv9/g;->c:Lv9/m;

    .line 97
    .line 98
    sget-object v7, Lka/e0;->a:LF6/r;

    .line 99
    .line 100
    if-nez v7, :cond_3

    .line 101
    .line 102
    const-class v8, Lka/e0;

    .line 103
    .line 104
    monitor-enter v8

    .line 105
    :try_start_0
    sget-object v7, Lka/e0;->a:LF6/r;

    .line 106
    .line 107
    if-nez v7, :cond_2

    .line 108
    .line 109
    invoke-static {}, LF6/r;->d()LM/y;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    sget-object v9, Lmd/c0;->b:Lmd/c0;

    .line 114
    .line 115
    iput-object v9, v7, LM/y;->d:Ljava/lang/Object;

    .line 116
    .line 117
    const-string v9, "google.firestore.v1.Firestore"

    .line 118
    .line 119
    const-string v10, "BatchGetDocuments"

    .line 120
    .line 121
    invoke-static {v9, v10}, LF6/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    iput-object v9, v7, LM/y;->e:Ljava/lang/Object;

    .line 126
    .line 127
    iput-boolean v0, v7, LM/y;->a:Z

    .line 128
    .line 129
    invoke-static {}, Lka/k;->d()Lka/k;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    sget-object v10, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 134
    .line 135
    new-instance v10, Ltd/b;

    .line 136
    .line 137
    invoke-direct {v10, v9}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 138
    .line 139
    .line 140
    iput-object v10, v7, LM/y;->b:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {}, Lka/o;->b()Lka/o;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    new-instance v10, Ltd/b;

    .line 147
    .line 148
    invoke-direct {v10, v9}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 149
    .line 150
    .line 151
    iput-object v10, v7, LM/y;->c:Ljava/lang/Object;

    .line 152
    .line 153
    invoke-virtual {v7}, LM/y;->d()LF6/r;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    sput-object v7, Lka/e0;->a:LF6/r;

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :catchall_0
    move-exception p1

    .line 161
    goto :goto_2

    .line 162
    :cond_2
    :goto_1
    monitor-exit v8

    .line 163
    goto :goto_3

    .line 164
    :goto_2
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    throw p1

    .line 166
    :cond_3
    :goto_3
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Lka/k;

    .line 171
    .line 172
    new-instance v8, LVa/Za;

    .line 173
    .line 174
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object v2, v8, LVa/Za;->d:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v4, v8, LVa/Za;->a:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p1, v8, LVa/Za;->b:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v5, v8, LVa/Za;->c:Ljava/lang/Object;

    .line 184
    .line 185
    iget-object p1, v6, Lv9/m;->d:LX8/c;

    .line 186
    .line 187
    iget-object v2, p1, LX8/c;->a:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Lcom/google/android/gms/tasks/Task;

    .line 190
    .line 191
    iget-object v4, p1, LX8/c;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, Lw9/e;

    .line 194
    .line 195
    iget-object v4, v4, Lw9/e;->a:Lw9/c;

    .line 196
    .line 197
    new-instance v9, Laa/f;

    .line 198
    .line 199
    const/16 v10, 0x1a

    .line 200
    .line 201
    invoke-direct {v9, v10, p1, v7}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4, v9}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object v2, v6, Lv9/m;->a:Lw9/e;

    .line 209
    .line 210
    iget-object v2, v2, Lw9/e;->a:Lw9/c;

    .line 211
    .line 212
    new-instance v4, LA5/g;

    .line 213
    .line 214
    const/16 v7, 0x15

    .line 215
    .line 216
    invoke-direct {v4, v6, v8, v3, v7}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v2, v4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    sget-object v2, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 227
    .line 228
    new-instance v3, Lo1/c;

    .line 229
    .line 230
    invoke-direct {v3, v1, v0}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    :goto_4
    sget-object v0, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 238
    .line 239
    new-instance v1, Lcom/unity3d/services/core/webview/b;

    .line 240
    .line 241
    const/16 v2, 0x16

    .line 242
    .line 243
    invoke-direct {v1, p0, v2}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1
.end method

.method public final c(Lm9/m;Ljava/util/Map;Lm9/a0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm9/d0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "Provided data must not be null."

    .line 7
    .line 8
    invoke-static {p2, v1}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "Provided options must not be null."

    .line 12
    .line 13
    invoke-static {p3, v1}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v1, p3, Lm9/a0;->a:Z

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p3, p3, Lm9/a0;->b:Lt9/f;

    .line 23
    .line 24
    invoke-virtual {v0, p2, p3}, Lm9/f0;->e(Ljava/lang/Object;Lt9/f;)Lmd/J;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0, p2}, Lm9/f0;->g(Ljava/lang/Object;)Lmd/J;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    :goto_0
    iget-object p3, p0, Lm9/d0;->a:Lp9/B;

    .line 34
    .line 35
    iget-object p1, p1, Lm9/m;->a:Ls9/h;

    .line 36
    .line 37
    invoke-virtual {p3, p1}, Lp9/B;->a(Ls9/h;)Lt9/m;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2, p1, v0}, Lmd/J;->y(Ls9/h;Lt9/m;)Lt9/h;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-boolean v0, p3, Lp9/B;->d:Z

    .line 50
    .line 51
    xor-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    new-array v1, v1, [Ljava/lang/Object;

    .line 55
    .line 56
    const-string v2, "A transaction object cannot be used after its update callback has been invoked."

    .line 57
    .line 58
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p3, Lp9/B;->c:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    iget-object p2, p3, Lp9/B;->f:Ljava/util/HashSet;

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method
