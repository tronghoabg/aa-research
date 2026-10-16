.class public final LVa/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/io/Serializable;

.field public h:Ljava/lang/Object;

.field public final i:Ljava/util/AbstractMap;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    packed-switch p1, :pswitch_data_0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-string p1, ""

    iput-object p1, p0, LVa/H;->d:Ljava/lang/String;

    .line 17
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    rsub-int/lit8 p1, p1, 0x8

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    rsub-int v0, v0, 0xea

    const-string v1, "\ufff4\u0002\u000e\u0003\ufffe\ufffd\u0003"

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x6

    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 19
    sget-object v4, LVa/Ab;->x:Ljava/lang/Object;

    monitor-enter v4

    .line 20
    :try_start_0
    new-array v5, p1, [C

    .line 21
    sput v2, LVa/Ab;->v:I

    :goto_0
    sget v6, LVa/Ab;->v:I

    if-ge v6, p1, :cond_0

    .line 22
    aget-char v7, v1, v6

    add-int/2addr v7, v0

    int-to-char v7, v7

    .line 23
    aput-char v7, v5, v6

    add-int/lit16 v7, v7, -0x99

    int-to-char v7, v7

    .line 24
    aput-char v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    .line 25
    sput v6, LVa/Ab;->v:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    if-lez v3, :cond_1

    .line 26
    sput v3, LVa/Ab;->w:I

    .line 27
    new-array v0, p1, [C

    .line 28
    invoke-static {v5, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    sget v1, LVa/Ab;->w:I

    sub-int v3, p1, v1

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    sget v1, LVa/Ab;->w:I

    sub-int v3, p1, v1

    invoke-static {v0, v1, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    :cond_1
    new-array v0, p1, [C

    .line 32
    sput v2, LVa/Ab;->v:I

    :goto_1
    sget v1, LVa/Ab;->v:I

    const/4 v3, 0x1

    if-ge v1, p1, :cond_2

    sub-int v6, p1, v1

    sub-int/2addr v6, v3

    .line 33
    aget-char v3, v5, v6

    aput-char v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 34
    sput v1, LVa/Ab;->v:I

    goto :goto_1

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LVa/H;->e:Ljava/lang/String;

    .line 37
    iput-boolean v3, p0, LVa/H;->a:Z

    .line 38
    const-string p1, ""

    iput-object p1, p0, LVa/H;->f:Ljava/lang/String;

    .line 39
    iput-boolean v2, p0, LVa/H;->b:Z

    .line 40
    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LVa/H;->i:Ljava/util/AbstractMap;

    .line 41
    iput-boolean v2, p0, LVa/H;->c:Z

    .line 42
    const-string p1, ""

    iput-object p1, p0, LVa/H;->g:Ljava/io/Serializable;

    return-void

    .line 43
    :goto_2
    monitor-exit v4

    throw p1

    .line 44
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LVa/H;->g:Ljava/io/Serializable;

    new-instance p1, Ljava/util/HashMap;

    .line 45
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LVa/H;->i:Ljava/util/AbstractMap;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LVa/H;->g:Ljava/io/Serializable;

    new-instance v0, Ljava/util/HashMap;

    .line 2
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LVa/H;->i:Ljava/util/AbstractMap;

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/HashSet;

    .line 4
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LVa/H;->g:Ljava/io/Serializable;

    .line 5
    iget-boolean v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    iput-boolean v0, p0, LVa/H;->a:Z

    .line 6
    iget-boolean v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    iput-boolean v0, p0, LVa/H;->b:Z

    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    iput-boolean v0, p0, LVa/H;->c:Z

    .line 8
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g:Ljava/lang/String;

    iput-object v0, p0, LVa/H;->d:Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    iput-object v0, p0, LVa/H;->h:Ljava/lang/Object;

    .line 10
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->h:Ljava/lang/String;

    iput-object v0, p0, LVa/H;->e:Ljava/lang/String;

    .line 11
    iget-object v0, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->i:Ljava/util/ArrayList;

    .line 12
    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->X(Ljava/util/ArrayList;)Ljava/util/HashMap;

    move-result-object v0

    .line 13
    iput-object v0, p0, LVa/H;->i:Ljava/util/AbstractMap;

    .line 14
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->j:Ljava/lang/String;

    iput-object p1, p0, LVa/H;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 14

    .line 1
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->p:Lcom/google/android/gms/common/api/Scope;

    .line 2
    .line 3
    iget-object v1, p0, LVa/H;->g:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o:Lcom/google/android/gms/common/api/Scope;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-boolean v0, p0, LVa/H;->c:Z

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, LVa/H;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/accounts/Account;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, LVa/H;->g:Ljava/io/Serializable;

    .line 41
    .line 42
    check-cast v0, Ljava/util/HashSet;

    .line 43
    .line 44
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->n:Lcom/google/android/gms/common/api/Scope;

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    new-instance v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 50
    .line 51
    new-instance v5, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, LVa/H;->h:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, Landroid/accounts/Account;

    .line 60
    .line 61
    iget-boolean v7, p0, LVa/H;->c:Z

    .line 62
    .line 63
    iget-boolean v8, p0, LVa/H;->a:Z

    .line 64
    .line 65
    iget-boolean v9, p0, LVa/H;->b:Z

    .line 66
    .line 67
    iget-object v10, p0, LVa/H;->d:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v11, p0, LVa/H;->e:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v13, p0, LVa/H;->f:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, p0, LVa/H;->i:Ljava/util/AbstractMap;

    .line 74
    .line 75
    move-object v12, v0

    .line 76
    check-cast v12, Ljava/util/HashMap;

    .line 77
    .line 78
    const/4 v4, 0x3

    .line 79
    invoke-direct/range {v3 .. v13}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v3
.end method

.method public b()Lj$/util/concurrent/ConcurrentHashMap;
    .locals 2

    .line 1
    sget v0, LVa/H;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/H;->j:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/H;->i:Ljava/util/AbstractMap;

    .line 10
    .line 11
    check-cast v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x29

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, LVa/H;->k:I

    .line 18
    .line 19
    return-object v1
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/H;->j:I

    .line 3
    .line 4
    iget-object v1, p0, LVa/H;->e:Ljava/lang/String;

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x25

    .line 7
    .line 8
    rem-int/lit16 v2, v0, 0x80

    .line 9
    .line 10
    sput v2, LVa/H;->k:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x52

    .line 17
    .line 18
    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    monitor-exit p0

    .line 27
    return-object v1

    .line 28
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    throw v0
.end method

.method public d(Z)V
    .locals 3

    .line 1
    sget v0, LVa/H;->k:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x41

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/H;->j:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-boolean p1, p0, LVa/H;->a:Z

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x69

    .line 17
    .line 18
    rem-int/lit16 p1, v0, 0x80

    .line 19
    .line 20
    sput p1, LVa/H;->j:I

    .line 21
    .line 22
    rem-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    throw v2

    .line 28
    :cond_1
    throw v2
.end method
