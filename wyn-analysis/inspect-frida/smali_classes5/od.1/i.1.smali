.class public final Lod/i;
.super Lod/U;
.source "SourceFile"


# instance fields
.field public final a:Lod/y;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile c:Lmd/k0;

.field public d:Lmd/k0;

.field public e:Lmd/k0;

.field public final f:Lcom/google/android/gms/ads/nativead/l;

.field public final synthetic g:Lod/j;


# direct methods
.method public constructor <init>(Lod/j;Lod/y;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/i;->g:Lod/j;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    const p3, -0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    new-instance p1, Lcom/google/android/gms/ads/nativead/l;

    .line 17
    .line 18
    const/16 p3, 0xb

    .line 19
    .line 20
    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lod/i;->f:Lcom/google/android/gms/ads/nativead/l;

    .line 24
    .line 25
    const-string p1, "delegate"

    .line 26
    .line 27
    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lod/i;->a:Lod/y;

    .line 31
    .line 32
    return-void
.end method

.method public static h(Lod/i;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lod/i;->d:Lmd/k0;

    .line 15
    .line 16
    iget-object v1, p0, Lod/i;->e:Lmd/k0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-object v2, p0, Lod/i;->d:Lmd/k0;

    .line 20
    .line 21
    iput-object v2, p0, Lod/i;->e:Lmd/k0;

    .line 22
    .line 23
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-super {p0, v0}, Lod/U;->d(Lmd/k0;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-super {p0, v1}, Lod/U;->a(Lmd/k0;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void

    .line 35
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0
.end method


# virtual methods
.method public final a(Lmd/k0;)V
    .locals 2

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, Lod/i;->c:Lmd/k0;

    .line 16
    .line 17
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v0, p0, Lod/i;->e:Lmd/k0;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iput-object p1, p0, Lod/i;->e:Lmd/k0;

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    invoke-super {p0, p1}, Lod/U;->a(Lmd/k0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public final c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;
    .locals 8

    .line 1
    iget-object v0, p3, Lmd/c;->c:Lv9/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lod/i;->g:Lod/j;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lod/i;->g:Lod/j;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz v0, :cond_4

    .line 18
    .line 19
    new-instance v1, Lod/a1;

    .line 20
    .line 21
    iget-object v2, p0, Lod/i;->a:Lod/y;

    .line 22
    .line 23
    iget-object v6, p0, Lod/i;->f:Lcom/google/android/gms/ads/nativead/l;

    .line 24
    .line 25
    move-object v3, p1

    .line 26
    move-object v4, p2

    .line 27
    move-object v5, p3

    .line 28
    move-object v7, p4

    .line 29
    invoke-direct/range {v1 .. v7}, Lod/a1;-><init>(Lod/u;LF6/r;Lmd/b0;Lmd/c;Lcom/google/android/gms/ads/nativead/l;[Lmd/i;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-lez p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lod/i;->f:Lcom/google/android/gms/ads/nativead/l;

    .line 41
    .line 42
    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lod/i;

    .line 45
    .line 46
    iget-object p2, p1, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    invoke-static {p1}, Lod/i;->h(Lod/i;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    new-instance p1, Lod/S;

    .line 58
    .line 59
    iget-object p2, p0, Lod/i;->c:Lmd/k0;

    .line 60
    .line 61
    invoke-direct {p1, p2, v7}, Lod/S;-><init>(Lmd/k0;[Lmd/i;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_2
    :try_start_0
    iget-object p1, p0, Lod/i;->g:Lod/j;

    .line 66
    .line 67
    iget-object p1, p1, Lod/j;->b:Lod/D0;

    .line 68
    .line 69
    iget-object p1, v0, Lv9/i;->a:Ln9/d;

    .line 70
    .line 71
    invoke-virtual {p1}, Ln9/d;->W()Lcom/google/android/gms/tasks/Task;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p2, v0, Lv9/i;->b:Ln9/b;

    .line 76
    .line 77
    invoke-virtual {p2}, Ln9/b;->W()Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    const/4 p3, 0x2

    .line 82
    new-array p3, p3, [Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    const/4 p4, 0x0

    .line 85
    aput-object p1, p3, p4

    .line 86
    .line 87
    const/4 p4, 0x1

    .line 88
    aput-object p2, p3, p4

    .line 89
    .line 90
    invoke-static {p3}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    sget-object p4, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 95
    .line 96
    new-instance v0, LA5/g;

    .line 97
    .line 98
    const/16 v2, 0x14

    .line 99
    .line 100
    invoke-direct {v0, p1, v1, p2, v2}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, p4, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    sget-object p2, Lmd/k0;->j:Lmd/k0;

    .line 110
    .line 111
    const-string p3, "Credentials should use fail() instead of throwing exceptions"

    .line 112
    .line 113
    invoke-virtual {p2, p3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p2, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v1, p1}, Lod/a1;->a(Lmd/k0;)V

    .line 122
    .line 123
    .line 124
    :goto_1
    iget-object p1, v1, Lod/a1;->h:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-enter p1

    .line 127
    :try_start_1
    iget-object p2, v1, Lod/a1;->i:Lod/r;

    .line 128
    .line 129
    if-nez p2, :cond_3

    .line 130
    .line 131
    new-instance p2, Lod/L;

    .line 132
    .line 133
    invoke-direct {p2}, Lod/L;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p2, v1, Lod/a1;->k:Lod/L;

    .line 137
    .line 138
    iput-object p2, v1, Lod/a1;->i:Lod/r;

    .line 139
    .line 140
    monitor-exit p1

    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    move-object p2, v0

    .line 144
    goto :goto_3

    .line 145
    :cond_3
    monitor-exit p1

    .line 146
    :goto_2
    return-object p2

    .line 147
    :goto_3
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    throw p2

    .line 149
    :cond_4
    move-object v3, p1

    .line 150
    move-object v4, p2

    .line 151
    move-object v5, p3

    .line 152
    move-object v7, p4

    .line 153
    iget-object p1, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-ltz p1, :cond_5

    .line 160
    .line 161
    new-instance p1, Lod/S;

    .line 162
    .line 163
    iget-object p2, p0, Lod/i;->c:Lmd/k0;

    .line 164
    .line 165
    invoke-direct {p1, p2, v7}, Lod/S;-><init>(Lmd/k0;[Lmd/i;)V

    .line 166
    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_5
    iget-object p1, p0, Lod/i;->a:Lod/y;

    .line 170
    .line 171
    invoke-interface {p1, v3, v4, v5, v7}, Lod/u;->c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1
.end method

.method public final d(Lmd/k0;)V
    .locals 2

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-gez v0, :cond_1

    .line 14
    .line 15
    iput-object p1, p0, Lod/i;->c:Lmd/k0;

    .line 16
    .line 17
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lod/i;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iput-object p1, p0, Lod/i;->d:Lmd/k0;

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-super {p0, p1}, Lod/U;->d(Lmd/k0;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    :try_start_1
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method

.method public final g()Lod/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/i;->a:Lod/y;

    .line 2
    .line 3
    return-object v0
.end method
