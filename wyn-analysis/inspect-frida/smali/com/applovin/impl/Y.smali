.class public final synthetic Lcom/applovin/impl/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/s2$a;
.implements Lcom/applovin/impl/d$b;
.implements Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadSuccessListener;
.implements Lcom/applovin/impl/sdk/d$a;
.implements Lcom/applovin/impl/sdk/c$c;
.implements Ldd/a;
.implements Lw9/n;
.implements Lw9/o;
.implements LL8/e;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/impl/r2;Lcom/applovin/impl/n;Lcom/applovin/impl/o;Lcom/applovin/impl/sdk/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/sdk/k;

    check-cast p1, Lcom/applovin/mediation/MaxDebuggerAdUnitDetailActivity;

    iget-object v1, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/r2;

    iget-object v2, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    check-cast v2, Lcom/applovin/impl/n;

    iget-object v3, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    check-cast v3, Lcom/applovin/impl/o;

    invoke-static {v1, v2, v3, v0, p1}, Lcom/applovin/impl/l;->b(Lcom/applovin/impl/r2;Lcom/applovin/impl/n;Lcom/applovin/impl/o;Lcom/applovin/impl/sdk/k;Lcom/applovin/mediation/MaxDebuggerAdUnitDetailActivity;)V

    return-void
.end method

.method public a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/applovin/impl/l;

    iget-object v0, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/applovin/impl/sdk/k;

    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/applovin/impl/n;

    iget-object v0, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/applovin/impl/o;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/applovin/impl/l;->c(Lcom/applovin/impl/l;Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/n;Lcom/applovin/impl/o;Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V

    return-void
.end method

.method public a(Lcom/applovin/impl/sdk/ad/b;)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/u;

    iget-object v2, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    check-cast v2, Lcom/applovin/impl/sdk/AppLovinAdServiceImpl;

    iget-object v3, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    check-cast v3, Lcom/applovin/sdk/AppLovinAdLoadListener;

    invoke-static {v2, v3, v0, v1, p1}, Lcom/applovin/impl/sdk/AppLovinAdServiceImpl;->a(Lcom/applovin/impl/sdk/AppLovinAdServiceImpl;Lcom/applovin/sdk/AppLovinAdLoadListener;Lorg/json/JSONObject;Lcom/applovin/impl/u;Lcom/applovin/impl/sdk/ad/b;)V

    return-void
.end method

.method public a(Lcom/applovin/impl/sdk/ad/b;Ljava/lang/String;)V
    .locals 7

    .line 4
    iget-object v0, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/applovin/impl/u;

    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/applovin/impl/sdk/d;

    iget-object v0, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/applovin/impl/sdk/d$a;

    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/applovin/impl/sdk/c$a;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/applovin/impl/sdk/d;->a(Lcom/applovin/impl/sdk/d;Lcom/applovin/impl/sdk/d$a;Lcom/applovin/impl/sdk/c$a;Lcom/applovin/impl/u;Lcom/applovin/impl/sdk/ad/b;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ln9/e;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lp9/n;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    xor-int/2addr v1, v3

    .line 35
    const-string v3, "Already fulfilled first user task"

    .line 36
    .line 37
    new-array v2, v2, [Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v1, Lng/a;

    .line 47
    .line 48
    const/4 v2, 0x7

    .line 49
    invoke-direct {v1, v2, v0, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lw9/e;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyc/y;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lq/s1;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LPc/p;

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v2, v0, v1}, Lq/s1;->j(Ljava/lang/String;Lyc/y;)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v3, p1}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    invoke-static {p1, v3}, Lq/s1;->g(Ljava/lang/Exception;Lyc/C;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance v0, Lyc/o;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p1, p2, v1}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v0}, LPc/p;->c(Lyc/o;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public g(Lp8/q;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v6, v0

    .line 4
    check-cast v6, LPc/o;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ldd/e;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v2, "exception"

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1}, Lp8/m;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v6, p1}, LPc/o;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception v0

    .line 30
    move-object p1, v0

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    new-instance v0, Ldd/g;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, v2, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, v0}, LPc/o;->d(Ldd/g;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v0, v0, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    iget-object v0, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const-string v2, "user_recoverable_auth"

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, v1, Ldd/e;->g:LC6/l;

    .line 75
    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    iget-object v0, v1, Ldd/e;->b:Landroid/app/Activity;

    .line 79
    .line 80
    if-nez v0, :cond_0

    .line 81
    .line 82
    new-instance v0, Ldd/g;

    .line 83
    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v3, "Cannot recover auth because app is not in foreground. "

    .line 87
    .line 88
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-direct {v0, v2, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v0}, LPc/o;->d(Ldd/g;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_0
    const/4 v5, 0x0

    .line 110
    iget-object v2, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v7, v2

    .line 113
    check-cast v7, Ljava/lang/String;

    .line 114
    .line 115
    const-string v2, "getTokens"

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x0

    .line 119
    invoke-virtual/range {v1 .. v7}, Ldd/e;->a(Ljava/lang/String;Ldd/j;Ldd/m;LPc/p;LPc/o;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;

    .line 127
    .line 128
    iget-object v1, p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;->a:Landroid/content/Intent;

    .line 129
    .line 130
    if-nez v1, :cond_4

    .line 131
    .line 132
    iget p1, p1, Lcom/google/android/gms/auth/UserRecoverableAuthException;->b:I

    .line 133
    .line 134
    invoke-static {p1}, LA/f;->f(I)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const-string v1, "Auth"

    .line 139
    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    const/4 v2, 0x1

    .line 143
    if-eq p1, v2, :cond_2

    .line 144
    .line 145
    const/4 v2, 0x2

    .line 146
    if-eq p1, v2, :cond_1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_1
    const-string p1, "this instantiation of UserRecoverableAuthException doesn\'t support an Intent."

    .line 150
    .line 151
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    const-string p1, "This shouldn\'t happen. Gms API throwing this exception should support the recovery Intent."

    .line 156
    .line 157
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    const-string p1, "Make sure that an intent was provided to class instantiation."

    .line 162
    .line 163
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    new-instance v8, Landroid/content/Intent;

    .line 168
    .line 169
    invoke-direct {v8, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 170
    .line 171
    .line 172
    :goto_2
    const p1, 0xd02e

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v8, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    new-instance v0, Ldd/g;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {v0, v2, p1}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v0}, LPc/o;->d(Ldd/g;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    new-instance v0, Ldd/g;

    .line 197
    .line 198
    if-nez p1, :cond_7

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    :goto_3
    invoke-direct {v0, v2, v8}, Ldd/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v0}, LPc/o;->d(Ldd/g;)V

    .line 209
    .line 210
    .line 211
    :goto_4
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/l;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/HashSet;

    .line 8
    .line 9
    iget-object v2, v0, Lr9/l;->e:Lr9/A;

    .line 10
    .line 11
    invoke-interface {v2, v1}, Lr9/A;->y(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x1

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ls9/k;

    .line 46
    .line 47
    iget v6, v6, Ls9/k;->b:I

    .line 48
    .line 49
    invoke-static {v6, v5}, LA/f;->b(II)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ls9/h;

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v3, v0, Lr9/l;->f:LVa/Za;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v4, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v3, v4, v6}, LVa/Za;->j(Ljava/util/Map;Ljava/util/Set;)V

    .line 80
    .line 81
    .line 82
    new-instance v6, Ljava/util/HashSet;

    .line 83
    .line 84
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v1, v4, v6}, LVa/Za;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v3, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v4, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    const/4 v8, 0x0

    .line 109
    if-eqz v7, :cond_6

    .line 110
    .line 111
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Lt9/h;

    .line 116
    .line 117
    iget-object v9, v7, Lt9/h;->a:Ls9/h;

    .line 118
    .line 119
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Lr9/x;

    .line 124
    .line 125
    iget-object v9, v9, Lr9/x;->a:Ls9/k;

    .line 126
    .line 127
    iget-object v10, v7, Lt9/h;->c:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    :cond_3
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-eqz v11, :cond_5

    .line 138
    .line 139
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    check-cast v11, Lt9/g;

    .line 144
    .line 145
    iget-object v12, v11, Lt9/g;->a:Ls9/j;

    .line 146
    .line 147
    iget-object v13, v9, Ls9/k;->e:Ls9/l;

    .line 148
    .line 149
    invoke-virtual {v13, v12}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    iget-object v13, v11, Lt9/g;->b:Lt9/p;

    .line 154
    .line 155
    invoke-interface {v13, v12}, Lt9/p;->a(Lka/C1;)Lka/C1;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    if-eqz v12, :cond_3

    .line 160
    .line 161
    if-nez v8, :cond_4

    .line 162
    .line 163
    new-instance v8, Ls9/l;

    .line 164
    .line 165
    invoke-direct {v8}, Ls9/l;-><init>()V

    .line 166
    .line 167
    .line 168
    :cond_4
    iget-object v11, v11, Lt9/g;->a:Ls9/j;

    .line 169
    .line 170
    invoke-virtual {v8, v12, v11}, Ls9/l;->g(Lka/C1;Ls9/j;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_5
    if-eqz v8, :cond_2

    .line 175
    .line 176
    new-instance v9, Lt9/l;

    .line 177
    .line 178
    invoke-virtual {v8}, Ls9/l;->b()Lka/C1;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v10}, Lka/C1;->s()Lka/p0;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-static {v10}, Ls9/l;->c(Lka/p0;)Lt9/f;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    invoke-static {v5}, Lt9/m;->a(Z)Lt9/m;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    iget-object v7, v7, Lt9/h;->a:Ls9/h;

    .line 195
    .line 196
    invoke-direct {v9, v7, v8, v10, v11}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_6
    iget-object v6, v0, Lr9/l;->c:Lr9/v;

    .line 204
    .line 205
    iget-object v7, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v7, Ls8/q;

    .line 208
    .line 209
    invoke-interface {v6, v7, v3, v4}, Lr9/v;->h(Ls8/q;Ljava/util/ArrayList;Ljava/util/List;)Lt9/i;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    new-instance v4, Ljava/util/HashMap;

    .line 214
    .line 215
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Lt9/i;->b()Ljava/util/HashSet;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-eqz v7, :cond_a

    .line 231
    .line 232
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    check-cast v7, Ls9/h;

    .line 237
    .line 238
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    check-cast v9, Lr9/x;

    .line 243
    .line 244
    iget-object v9, v9, Lr9/x;->a:Ls9/k;

    .line 245
    .line 246
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    check-cast v10, Lr9/x;

    .line 251
    .line 252
    iget-object v10, v10, Lr9/x;->b:Lt9/f;

    .line 253
    .line 254
    invoke-virtual {v3, v9, v10}, Lt9/i;->a(Ls9/k;Lt9/f;)Lt9/f;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    if-eqz v11, :cond_8

    .line 263
    .line 264
    move-object v10, v8

    .line 265
    :cond_8
    invoke-static {v9, v10}, Lt9/h;->c(Ls9/k;Lt9/f;)Lt9/h;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    if-eqz v10, :cond_9

    .line 270
    .line 271
    invoke-virtual {v4, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    :cond_9
    iget v7, v9, Ls9/k;->b:I

    .line 275
    .line 276
    invoke-static {v7, v5}, LA/f;->b(II)Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-eqz v7, :cond_7

    .line 281
    .line 282
    sget-object v7, Ls9/o;->b:Ls9/o;

    .line 283
    .line 284
    invoke-virtual {v9, v7}, Ls9/k;->b(Ls9/o;)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_a
    iget-object v0, v0, Lr9/l;->d:Lr9/b;

    .line 289
    .line 290
    iget v2, v3, Lt9/i;->a:I

    .line 291
    .line 292
    invoke-interface {v0, v2, v4}, Lr9/b;->g(ILjava/util/HashMap;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v2, v1}, Lr9/g;->a(ILjava/util/HashMap;)Lr9/g;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, LC8/f;

    .line 2
    .line 3
    const-class v1, Ls8/g;

    .line 4
    .line 5
    invoke-virtual {p1, v1}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls8/g;

    .line 10
    .line 11
    const-class v2, Lx9/e;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, LC6/l;->c(Ljava/lang/Class;)LO9/b;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, LL8/t;

    .line 20
    .line 21
    invoke-virtual {p1, v3}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, LL8/t;

    .line 30
    .line 31
    invoke-virtual {p1, v4}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    iget-object v5, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, LL8/t;

    .line 40
    .line 41
    invoke-virtual {p1, v5}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    iget-object v6, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, LL8/t;

    .line 50
    .line 51
    invoke-virtual {p1, v6}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    move-object v6, p1

    .line 56
    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v6}, LC8/f;-><init>(Ls8/g;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public onConsentFormLoadSuccess(Lcom/google/android/ump/ConsentForm;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/Y;->d:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/privacy/cmp/a;

    iget-object v1, p0, Lcom/applovin/impl/Y;->c:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/privacy/cmp/a$a;

    iget-object v2, p0, Lcom/applovin/impl/Y;->a:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/ump/FormError;

    iget-object v3, p0, Lcom/applovin/impl/Y;->b:Ljava/lang/Object;

    check-cast v3, Lcom/applovin/impl/k0;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/applovin/impl/privacy/cmp/a;->g(Lcom/applovin/impl/privacy/cmp/a;Lcom/applovin/impl/privacy/cmp/a$a;Lcom/google/android/ump/FormError;Lcom/applovin/impl/k0;Lcom/google/android/ump/ConsentForm;)V

    return-void
.end method
