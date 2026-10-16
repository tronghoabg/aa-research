.class public final synthetic Lm9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;II)V
    .locals 0

    .line 1
    iput p4, p0, Lm9/k;->a:I

    iput-object p1, p0, Lm9/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p2, p0, Lm9/k;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput p3, p0, Lm9/k;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm9/G;)V
    .locals 7

    .line 1
    iget v0, p0, Lm9/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INTERNAL ASSERTION FAILED: "

    .line 7
    .line 8
    const-string v1, "Failed to register a listener for a query result"

    .line 9
    .line 10
    iget-object v2, p0, Lm9/k;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 11
    .line 12
    check-cast p1, Lm9/Y;

    .line 13
    .line 14
    iget-object v3, p0, Lm9/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lm9/L;

    .line 31
    .line 32
    invoke-interface {p2}, Lm9/L;->remove()V

    .line 33
    .line 34
    .line 35
    iget-object p2, p1, Lm9/Y;->f:Lm9/b0;

    .line 36
    .line 37
    iget-boolean p2, p2, Lm9/b0;->b:Z
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget p2, p0, Lm9/k;->d:I

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    if-ne p2, v2, :cond_1

    .line 45
    .line 46
    :try_start_1
    new-instance p1, Lm9/G;

    .line 47
    .line 48
    const-string p2, "Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)"

    .line 49
    .line 50
    sget-object v2, Lm9/F;->k:Lm9/F;

    .line 51
    .line 52
    invoke-direct {p1, p2, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception p1

    .line 60
    goto :goto_1

    .line 61
    :catch_1
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 64
    .line 65
    .line 66
    :goto_0
    return-void

    .line 67
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-instance v0, Ljava/lang/AssertionError;

    .line 79
    .line 80
    invoke-direct {v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    new-instance v0, Ljava/lang/AssertionError;

    .line 92
    .line 93
    invoke-direct {v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :pswitch_0
    const-string v0, "INTERNAL ASSERTION FAILED: "

    .line 101
    .line 102
    const-string v1, "Failed to register a listener for a single document"

    .line 103
    .line 104
    iget-object v2, p0, Lm9/k;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 105
    .line 106
    check-cast p1, Lm9/o;

    .line 107
    .line 108
    iget-object v3, p0, Lm9/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 109
    .line 110
    if-eqz p2, :cond_2

    .line 111
    .line 112
    invoke-virtual {v3, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    check-cast p2, Lm9/L;

    .line 125
    .line 126
    invoke-interface {p2}, Lm9/L;->remove()V

    .line 127
    .line 128
    .line 129
    iget-object p2, p1, Lm9/o;->c:Ls9/k;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v4, 0x1

    .line 133
    if-eqz p2, :cond_3

    .line 134
    .line 135
    move v5, v4

    .line 136
    goto :goto_3

    .line 137
    :cond_3
    move v5, v2

    .line 138
    :goto_3
    iget-object v6, p1, Lm9/o;->d:Lm9/b0;

    .line 139
    .line 140
    iget-boolean v6, v6, Lm9/b0;->b:Z

    .line 141
    .line 142
    if-nez v5, :cond_4

    .line 143
    .line 144
    if-eqz v6, :cond_4

    .line 145
    .line 146
    :try_start_3
    new-instance p1, Lm9/G;

    .line 147
    .line 148
    const-string p2, "Failed to get document because the client is offline."

    .line 149
    .line 150
    sget-object v2, Lm9/F;->k:Lm9/F;

    .line 151
    .line 152
    invoke-direct {p1, p2, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :catch_2
    move-exception p1

    .line 160
    goto :goto_5

    .line 161
    :catch_3
    move-exception p1

    .line 162
    goto :goto_6

    .line 163
    :cond_4
    if-eqz p2, :cond_5

    .line 164
    .line 165
    move v2, v4

    .line 166
    :cond_5
    if-eqz v2, :cond_6

    .line 167
    .line 168
    if-eqz v6, :cond_6

    .line 169
    .line 170
    iget p2, p0, Lm9/k;->d:I

    .line 171
    .line 172
    const/4 v2, 0x2

    .line 173
    if-ne p2, v2, :cond_6

    .line 174
    .line 175
    :try_start_4
    new-instance p1, Lm9/G;

    .line 176
    .line 177
    const-string p2, "Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)"

    .line 178
    .line 179
    sget-object v2, Lm9/F;->k:Lm9/F;

    .line 180
    .line 181
    invoke-direct {p1, p2, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    invoke-virtual {v3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_2

    .line 189
    .line 190
    .line 191
    :goto_4
    return-void

    .line 192
    :goto_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    new-instance v0, Ljava/lang/AssertionError;

    .line 204
    .line 205
    invoke-direct {v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 209
    .line 210
    .line 211
    throw v0

    .line 212
    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    new-instance v0, Ljava/lang/AssertionError;

    .line 217
    .line 218
    invoke-direct {v0, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
