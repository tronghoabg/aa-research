.class public final synthetic LK8/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# virtual methods
.method public a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p2, "compressed"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, LK8/A;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Li3/a;

    .line 28
    .line 29
    invoke-interface {p1}, Li3/a;->d()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    return-object p1
.end method

.method public b(ILjava/io/Serializable;)V
    .locals 2

    .line 1
    new-instance v0, LMb/b;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, LMb/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LK8/A;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LK8/A;->c:Ljava/lang/Object;

    .line 3
    .line 4
    move-object v2, v1

    .line 5
    check-cast v2, LK8/b;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "Failed to initialize reCAPTCHA config: "

    .line 25
    .line 26
    const-string v3, "b"

    .line 27
    .line 28
    invoke-static {v1, p1, v3}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, LK8/A;->e:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, Lcom/google/firebase/auth/FirebaseAuth;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v1, p0, LK8/A;->d:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v9, v1

    .line 43
    check-cast v9, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 44
    .line 45
    iget-object v4, p0, LK8/A;->a:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p0, LK8/A;->g:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v5, v1

    .line 50
    check-cast v5, Landroid/app/Activity;

    .line 51
    .line 52
    iget-boolean v6, p0, LK8/A;->b:Z

    .line 53
    .line 54
    iget-object v1, p0, LK8/A;->h:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v8, v1

    .line 57
    check-cast v8, LK8/F;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v1, "PHONE_PROVIDER"

    .line 66
    .line 67
    iget-object v7, p1, LC6/l;->a:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter v7

    .line 70
    :try_start_0
    iget-object p1, p1, LC6/l;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;

    .line 73
    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagm;->zzc(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p1, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move p1, v0

    .line 88
    :goto_0
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v3}, Lcom/google/firebase/auth/FirebaseAuth;->b()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 100
    .line 101
    iget-object v10, p0, LK8/A;->f:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v10, Lcom/google/android/recaptcha/RecaptchaAction;

    .line 104
    .line 105
    invoke-virtual {p1, v1, v7, v10}, LC6/l;->H(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v1, LK8/G;

    .line 110
    .line 111
    invoke-direct {v1, v0, v9}, LK8/G;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    move-object v1, v2

    .line 119
    new-instance v2, LK8/H;

    .line 120
    .line 121
    move v7, v6

    .line 122
    move-object v6, v5

    .line 123
    move-object v5, v4

    .line 124
    move-object v4, v3

    .line 125
    move-object v3, v1

    .line 126
    invoke-direct/range {v2 .. v9}, LK8/H;-><init>(LK8/b;Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZLK8/F;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_2
    move-object v1, v2

    .line 134
    goto :goto_2

    .line 135
    :goto_1
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    throw p1

    .line 137
    :goto_2
    const/4 v7, 0x0

    .line 138
    move-object v2, v1

    .line 139
    invoke-virtual/range {v2 .. v9}, LK8/b;->c(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLK8/F;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
