.class public final synthetic LC8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LC8/e;->a:I

    iput-object p2, p0, LC8/e;->b:Ljava/lang/Object;

    iput-boolean p3, p0, LC8/e;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, LC8/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lff/B;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "proxy_retention"

    .line 16
    .line 17
    iget-boolean v1, p0, LC8/e;->c:Z

    .line 18
    .line 19
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p1, p0, LC8/e;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LC8/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LC8/f;

    .line 9
    .line 10
    iget-boolean v0, p0, LC8/e;->c:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LC8/f;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, LC8/f;->m:LC8/b;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p1, LC8/f;->l:Lz8/a;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance p1, Ls8/j;

    .line 32
    .line 33
    const-string v0, "No AppCheckProvider installed."

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, p1, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p1, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    :cond_2
    iget-object v0, p1, LC8/f;->l:Lz8/a;

    .line 62
    .line 63
    invoke-interface {v0}, Lz8/a;->getToken()Lcom/google/android/gms/tasks/Task;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, LB8/b;

    .line 68
    .line 69
    const/4 v2, 0x2

    .line 70
    invoke-direct {v1, p1, v2}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p1, LC8/f;->g:Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p1, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 80
    .line 81
    :cond_3
    iget-object p1, p1, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 82
    .line 83
    :goto_0
    return-object p1

    .line 84
    :pswitch_0
    iget-boolean p1, p0, LC8/e;->c:Z

    .line 85
    .line 86
    iget-object v0, p0, LC8/e;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LC8/f;

    .line 89
    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0}, LC8/f;->b()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    iget-object p1, v0, LC8/f;->m:LC8/b;

    .line 99
    .line 100
    invoke-static {p1}, LC8/c;->a(LC8/b;)LC8/c;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    iget-object p1, v0, LC8/f;->l:Lz8/a;

    .line 110
    .line 111
    if-nez p1, :cond_5

    .line 112
    .line 113
    new-instance p1, Ls8/j;

    .line 114
    .line 115
    const-string v0, "No AppCheckProvider installed."

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, LC8/c;

    .line 121
    .line 122
    const-string v1, "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ=="

    .line 123
    .line 124
    invoke-direct {v0, v1, p1}, LC8/c;-><init>(Ljava/lang/String;Ls8/j;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    goto :goto_1

    .line 132
    :cond_5
    iget-object p1, v0, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-nez p1, :cond_6

    .line 141
    .line 142
    iget-object p1, v0, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    :cond_6
    iget-object p1, v0, LC8/f;->l:Lz8/a;

    .line 151
    .line 152
    invoke-interface {p1}, Lz8/a;->getToken()Lcom/google/android/gms/tasks/Task;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    new-instance v1, LB8/b;

    .line 157
    .line 158
    const/4 v2, 0x2

    .line 159
    invoke-direct {v1, v0, v2}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    iget-object v2, v0, LC8/f;->g:Ljava/util/concurrent/Executor;

    .line 163
    .line 164
    invoke-virtual {p1, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object p1, v0, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 169
    .line 170
    :cond_7
    iget-object p1, v0, LC8/f;->n:Lcom/google/android/gms/tasks/Task;

    .line 171
    .line 172
    new-instance v1, LA5/f;

    .line 173
    .line 174
    const/4 v2, 0x2

    .line 175
    invoke-direct {v1, v2}, LA5/f;-><init>(I)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, LC8/f;->h:Ljava/util/concurrent/Executor;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :goto_1
    return-object p1

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
