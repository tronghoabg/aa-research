.class public final La7/a;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"


# static fields
.field public static final a:La7/e;

.field public static b:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La7/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La7/a;->a:La7/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Landroid/content/Intent;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La7/a;->e()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v2, v1, -0x1

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eq v2, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v2, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApiOptions()Lcom/google/android/gms/common/api/e;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 25
    .line 26
    new-array v2, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v3, Lb7/j;->a:Lh7/a;

    .line 29
    .line 30
    const-string v4, "getNoImplementationSignInIntent()"

    .line 31
    .line 32
    invoke-virtual {v3, v4, v2}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lb7/j;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "com.google.android.gms.auth.NO_IMPL"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApiOptions()Lcom/google/android/gms/common/api/e;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lb7/j;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApiOptions()Lcom/google/android/gms/common/api/e;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 61
    .line 62
    new-array v2, v3, [Ljava/lang/Object;

    .line 63
    .line 64
    sget-object v3, Lb7/j;->a:Lh7/a;

    .line 65
    .line 66
    const-string v4, "getFallbackSignInIntent()"

    .line 67
    .line 68
    invoke-virtual {v3, v4, v2}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Lb7/j;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)Landroid/content/Intent;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "com.google.android.gms.auth.APPAUTH_SIGN_IN"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_2
    const/4 v0, 0x0

    .line 82
    throw v0
.end method

.method public final d()Lcom/google/android/gms/tasks/Task;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->asGoogleApiClient()Lcom/google/android/gms/common/api/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, La7/a;->e()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    move v2, v5

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v4

    .line 21
    :goto_0
    new-array v3, v4, [Ljava/lang/Object;

    .line 22
    .line 23
    sget-object v4, Lb7/j;->a:Lh7/a;

    .line 24
    .line 25
    const-string v6, "Revoking access"

    .line 26
    .line 27
    invoke-virtual {v4, v6, v3}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lb7/b;->a(Landroid/content/Context;)Lb7/b;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-string v4, "refreshToken"

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lb7/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v1}, Lb7/j;->b(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    sget-object v0, Lb7/c;->c:Lh7/a;

    .line 48
    .line 49
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->V()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    xor-int/2addr v1, v5

    .line 61
    const-string v2, "Status code must not be SUCCESS"

    .line 62
    .line 63
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/google/android/gms/common/api/z;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Lcom/google/android/gms/common/api/z;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    new-instance v0, Lb7/c;

    .line 76
    .line 77
    invoke-direct {v0, v3}, Lb7/c;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Ljava/lang/Thread;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, Lb7/c;->b:Lcom/google/android/gms/common/api/internal/z;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    new-instance v1, Lb7/h;

    .line 92
    .line 93
    invoke-direct {v1, v0, v5}, Lb7/h;-><init>(Lcom/google/android/gms/common/api/o;I)V

    .line 94
    .line 95
    .line 96
    check-cast v0, Lcom/google/android/gms/common/api/internal/J;

    .line 97
    .line 98
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_1
    new-instance v0, Lae/d;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v0, v2}, Lae/d;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/v;->o(Lcom/google/android/gms/common/api/r;Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method

.method public final declared-synchronized e()I
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, La7/a;->b:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Ld7/e;->d:Ld7/e;

    .line 12
    .line 13
    const v2, 0xbdfcb8

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0, v2}, Ld7/f;->d(Landroid/content/Context;I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    sput v0, La7/a;->b:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v1, v0, v2, v3}, Ld7/f;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "com.google.android.gms.auth.api.fallback"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lr7/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    sput v0, La7/a;->b:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x2

    .line 48
    sput v0, La7/a;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    :cond_2
    :goto_0
    monitor-exit p0

    .line 51
    return v0

    .line 52
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
.end method

.method public final signOut()Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->asGoogleApiClient()Lcom/google/android/gms/common/api/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/l;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, La7/a;->e()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x0

    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    new-array v3, v4, [Ljava/lang/Object;

    .line 21
    .line 22
    sget-object v4, Lb7/j;->a:Lh7/a;

    .line 23
    .line 24
    const-string v5, "Signing out"

    .line 25
    .line 26
    invoke-virtual {v4, v5, v3}, Lh7/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lb7/j;->b(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    sget-object v1, Lcom/google/android/gms/common/api/Status;->e:Lcom/google/android/gms/common/api/Status;

    .line 35
    .line 36
    new-instance v2, Lcom/google/android/gms/common/api/internal/z;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/o;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance v1, Lb7/h;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, v0, v2}, Lb7/h;-><init>(Lcom/google/android/gms/common/api/o;I)V

    .line 50
    .line 51
    .line 52
    check-cast v0, Lcom/google/android/gms/common/api/internal/J;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/J;->b:Lcom/google/android/gms/common/api/l;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/common/api/internal/e;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_1
    new-instance v0, Lae/d;

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    invoke-direct {v0, v1}, Lae/d;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/v;->o(Lcom/google/android/gms/common/api/r;Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method
