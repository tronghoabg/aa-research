.class public final LA7/P0;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public c:LA7/c1;

.field public d:LA7/K0;

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:Ljava/lang/Object;

.field public i:Z

.field public j:I

.field public k:LA7/X0;

.field public l:Ljava/util/PriorityQueue;

.field public m:Z

.field public n:LA7/F0;

.field public final o:Ljava/util/concurrent/atomic/AtomicLong;

.field public p:J

.field public final q:LY9/c;

.field public r:Z

.field public s:LA7/X0;

.field public t:LA7/U0;

.field public u:LA7/X0;

.field public final v:Ly3/j;


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, LA7/Y;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LA7/P0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LA7/P0;->h:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, LA7/P0;->i:Z

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput v0, p0, LA7/P0;->j:I

    .line 23
    .line 24
    iput-boolean v0, p0, LA7/P0;->r:Z

    .line 25
    .line 26
    new-instance v0, Ly3/j;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, v1}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LA7/P0;->v:Ly3/j;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LA7/P0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    sget-object v0, LA7/F0;->c:LA7/F0;

    .line 42
    .line 43
    iput-object v0, p0, LA7/P0;->n:LA7/F0;

    .line 44
    .line 45
    const-wide/16 v0, -0x1

    .line 46
    .line 47
    iput-wide v0, p0, LA7/P0;->p:J

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    const-wide/16 v1, 0x0

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, LA7/P0;->o:Ljava/util/concurrent/atomic/AtomicLong;

    .line 57
    .line 58
    new-instance v0, LY9/c;

    .line 59
    .line 60
    const/4 v1, 0x5

    .line 61
    invoke-direct {v0, p1, v1}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, LA7/P0;->q:LY9/c;

    .line 65
    .line 66
    return-void
.end method

.method public static p0(LA7/P0;LA7/F0;JZZ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LA7/Z;->n0()LA7/F0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, LA7/P0;->p:J

    .line 16
    .line 17
    cmp-long v1, p2, v1

    .line 18
    .line 19
    iget v2, p1, LA7/F0;->b:I

    .line 20
    .line 21
    if-gtz v1, :cond_0

    .line 22
    .line 23
    iget v0, v0, LA7/F0;->b:I

    .line 24
    .line 25
    invoke-static {v0, v2}, LA7/F0;->h(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p2, "Dropped out-of-date consent setting, proposed settings"

    .line 36
    .line 37
    iget-object p0, p0, LA7/N;->l:LA7/P;

    .line 38
    .line 39
    invoke-virtual {p0, p2, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/16 v3, 0x64

    .line 55
    .line 56
    const-string v4, "consent_source"

    .line 57
    .line 58
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v2, v1}, LA7/F0;->h(II)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "consent_settings"

    .line 77
    .line 78
    invoke-virtual {p1}, LA7/F0;->m()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "Setting storage consent(FE)"

    .line 96
    .line 97
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 98
    .line 99
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-wide p2, p0, LA7/P0;->p:J

    .line 103
    .line 104
    iget-object p0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, LA7/n0;

    .line 107
    .line 108
    invoke-static {p0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, LA7/m1;->t0()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-nez p2, :cond_1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {p1}, LA7/B0;->b0()LA7/U1;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, LA7/U1;->i1()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    const p2, 0x3ae30

    .line 128
    .line 129
    .line 130
    if-lt p1, p2, :cond_4

    .line 131
    .line 132
    :goto_0
    invoke-static {p0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    iget-object p3, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p3, LA7/n0;

    .line 143
    .line 144
    if-eqz p2, :cond_2

    .line 145
    .line 146
    iget-object p2, p3, LA7/n0;->g:LA7/e;

    .line 147
    .line 148
    sget-object v0, LA7/y;->X0:LA7/D;

    .line 149
    .line 150
    const/4 v1, 0x0

    .line 151
    invoke-virtual {p2, v1, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_3

    .line 156
    .line 157
    :cond_2
    if-eqz p4, :cond_3

    .line 158
    .line 159
    invoke-virtual {p3}, LA7/n0;->k()LA7/H;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p2}, LA7/H;->m0()V

    .line 164
    .line 165
    .line 166
    :cond_3
    new-instance p2, LA7/l1;

    .line 167
    .line 168
    const/4 p3, 0x0

    .line 169
    invoke-direct {p2, p3}, LA7/l1;-><init>(I)V

    .line 170
    .line 171
    .line 172
    iput-object p1, p2, LA7/l1;->b:LA7/m1;

    .line 173
    .line 174
    invoke-virtual {p1, p2}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    invoke-virtual {p0}, LA7/n0;->m()LA7/m1;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1, p4}, LA7/m1;->o0(Z)V

    .line 183
    .line 184
    .line 185
    :goto_1
    if-eqz p5, :cond_5

    .line 186
    .line 187
    invoke-virtual {p0}, LA7/n0;->m()LA7/m1;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, p1}, LA7/m1;->n0(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 197
    .line 198
    .line 199
    :cond_5
    return-void

    .line 200
    :cond_6
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object p0, p0, LA7/N;->l:LA7/P;

    .line 209
    .line 210
    const-string p2, "Lower precedence consent source ignored, proposed source"

    .line 211
    .line 212
    invoke-virtual {p0, p2, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public static q0(LA7/P0;LA7/F0;LA7/F0;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    iget-object v3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, LA7/n0;

    .line 13
    .line 14
    iget-object v3, v3, LA7/n0;->g:LA7/e;

    .line 15
    .line 16
    sget-object v4, LA7/y;->X0:LA7/D;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-virtual {v3, v5, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_3

    .line 24
    .line 25
    :cond_0
    sget-object v3, LA7/E0;->c:LA7/E0;

    .line 26
    .line 27
    sget-object v4, LA7/E0;->b:LA7/E0;

    .line 28
    .line 29
    new-array v5, v1, [LA7/E0;

    .line 30
    .line 31
    aput-object v3, v5, v0

    .line 32
    .line 33
    aput-object v4, v5, v2

    .line 34
    .line 35
    move v6, v0

    .line 36
    :goto_0
    if-ge v6, v1, :cond_2

    .line 37
    .line 38
    aget-object v7, v5, v6

    .line 39
    .line 40
    invoke-virtual {p2, v7}, LA7/F0;->i(LA7/E0;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-nez v8, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v7}, LA7/F0;->i(LA7/E0;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    move v5, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    add-int/2addr v6, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v5, v0

    .line 57
    :goto_1
    new-array v1, v1, [LA7/E0;

    .line 58
    .line 59
    aput-object v3, v1, v0

    .line 60
    .line 61
    aput-object v4, v1, v2

    .line 62
    .line 63
    invoke-virtual {p1, p2, v1}, LA7/F0;->k(LA7/F0;[LA7/E0;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez v5, :cond_4

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    return-void

    .line 73
    :cond_4
    :goto_2
    iget-object p0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, LA7/n0;

    .line 76
    .line 77
    invoke-virtual {p0}, LA7/n0;->j()LA7/I;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, LA7/I;->m0()V

    .line 82
    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v1, v0, LA7/n0;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, Landroid/app/Application;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LA7/P0;->c:LA7/c1;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Application;

    .line 26
    .line 27
    iget-object v1, p0, LA7/P0;->c:LA7/c1;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final B0()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/n0;

    .line 10
    .line 11
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 12
    .line 13
    sget-object v1, LA7/y;->I0:LA7/D;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v2, v1}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LA7/k0;->o0()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "Cannot get trigger URIs from analytics worker thread"

    .line 38
    .line 39
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {}, Lc8/e;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "Cannot get trigger URIs from main thread"

    .line 56
    .line 57
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "Getting trigger URIs (FE)"

    .line 71
    .line 72
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    new-instance v7, LA7/Q0;

    .line 87
    .line 88
    invoke-direct {v7}, LA7/Q0;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p0, v7, LA7/Q0;->c:LA7/P0;

    .line 92
    .line 93
    iput-object v3, v7, LA7/Q0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    .line 95
    const-wide/16 v4, 0x1388

    .line 96
    .line 97
    const-string v6, "get trigger URIs"

    .line 98
    .line 99
    invoke-virtual/range {v2 .. v7}, LA7/k0;->i0(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/util/List;

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v1, "Timed out waiting for get trigger URIs"

    .line 115
    .line 116
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v2, LA7/p;

    .line 127
    .line 128
    const/4 v3, 0x4

    .line 129
    invoke-direct {v2, v3}, LA7/p;-><init>(I)V

    .line 130
    .line 131
    .line 132
    iput-object p0, v2, LA7/p;->b:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v0, v2, LA7/p;->c:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    :goto_0
    return-void
.end method

.method public final C0()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "\u0000"

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "Handle tcf update."

    .line 13
    .line 14
    iget-object v2, v2, LA7/N;->m:LA7/P;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, LA7/Z;->k0()Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v4, "IABTCF_VendorConsents"

    .line 33
    .line 34
    :try_start_0
    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-object v4, v1

    .line 40
    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "GoogleConsent"

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const/16 v7, 0x2f2

    .line 53
    .line 54
    if-le v5, v7, :cond_0

    .line 55
    .line 56
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :cond_0
    const-string v4, "IABTCF_gdprApplies"

    .line 68
    .line 69
    const/4 v5, -0x1

    .line 70
    :try_start_1
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result v4
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    goto :goto_1

    .line 75
    :catch_1
    move v4, v5

    .line 76
    :goto_1
    const-string v7, "gdprApplies"

    .line 77
    .line 78
    if-eq v4, v5, :cond_1

    .line 79
    .line 80
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v3, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_1
    const-string v4, "IABTCF_EnableAdvertiserConsentMode"

    .line 88
    .line 89
    :try_start_2
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 90
    .line 91
    .line 92
    move-result v4
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    .line 93
    goto :goto_2

    .line 94
    :catch_2
    move v4, v5

    .line 95
    :goto_2
    const-string v8, "EnableAdvertiserConsentMode"

    .line 96
    .line 97
    if-eq v4, v5, :cond_2

    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v3, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_2
    const-string v4, "IABTCF_PolicyVersion"

    .line 107
    .line 108
    :try_start_3
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v4
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_3

    .line 112
    goto :goto_3

    .line 113
    :catch_3
    move v4, v5

    .line 114
    :goto_3
    if-eq v4, v5, :cond_3

    .line 115
    .line 116
    const-string v9, "PolicyVersion"

    .line 117
    .line 118
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v3, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_3
    const-string v4, "IABTCF_PurposeConsents"

    .line 126
    .line 127
    :try_start_4
    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4
    :try_end_4
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_4

    .line 131
    goto :goto_4

    .line 132
    :catch_4
    move-object v4, v1

    .line 133
    :goto_4
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const-string v9, "PurposeConsents"

    .line 138
    .line 139
    if-nez v1, :cond_4

    .line 140
    .line 141
    invoke-virtual {v3, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_4
    const-string v1, "IABTCF_CmpSdkID"

    .line 145
    .line 146
    :try_start_5
    invoke-interface {v2, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v1
    :try_end_5
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_5

    .line 150
    goto :goto_5

    .line 151
    :catch_5
    move v1, v5

    .line 152
    :goto_5
    const-string v2, "CmpSdkID"

    .line 153
    .line 154
    if-eq v1, v5, :cond_5

    .line 155
    .line 156
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_5
    new-instance v1, LA7/D1;

    .line 164
    .line 165
    invoke-direct {v1, v3}, LA7/D1;-><init>(Ljava/util/HashMap;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const-string v4, "Tcf preferences read"

    .line 173
    .line 174
    iget-object v3, v3, LA7/N;->n:LA7/P;

    .line 175
    .line 176
    invoke-virtual {v3, v4, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, LA7/B0;->c0()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    const-string v10, ""

    .line 191
    .line 192
    const-string v11, "stored_tcf_param"

    .line 193
    .line 194
    invoke-interface {v4, v11, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v1}, LA7/D1;->a()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_15

    .line 207
    .line 208
    invoke-virtual {v3}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-interface {v3, v11, v10}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 220
    .line 221
    .line 222
    iget-object v3, v1, LA7/D1;->a:Ljava/util/HashMap;

    .line 223
    .line 224
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    const-string v6, "1"

    .line 229
    .line 230
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    const/4 v10, 0x2

    .line 235
    const/4 v11, 0x0

    .line 236
    if-eqz v4, :cond_e

    .line 237
    .line 238
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-eqz v4, :cond_e

    .line 247
    .line 248
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_e

    .line 257
    .line 258
    invoke-virtual {v1}, LA7/D1;->b()I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    if-gez v4, :cond_6

    .line 263
    .line 264
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 265
    .line 266
    :goto_6
    move-object v12, v4

    .line 267
    move v4, v11

    .line 268
    goto/16 :goto_9

    .line 269
    .line 270
    :cond_6
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    check-cast v9, Ljava/lang/String;

    .line 275
    .line 276
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_7

    .line 281
    .line 282
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_7
    new-instance v12, Landroid/os/Bundle;

    .line 286
    .line 287
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 291
    .line 292
    .line 293
    move-result v13

    .line 294
    const-string v14, "denied"

    .line 295
    .line 296
    const-string v15, "granted"

    .line 297
    .line 298
    const/16 v5, 0x31

    .line 299
    .line 300
    if-lez v13, :cond_9

    .line 301
    .line 302
    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    .line 303
    .line 304
    .line 305
    move-result v13

    .line 306
    if-ne v13, v5, :cond_8

    .line 307
    .line 308
    move-object v13, v15

    .line 309
    goto :goto_7

    .line 310
    :cond_8
    move-object v13, v14

    .line 311
    :goto_7
    const-string v11, "ad_storage"

    .line 312
    .line 313
    invoke-virtual {v12, v11, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_9
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 317
    .line 318
    .line 319
    move-result v11

    .line 320
    const/4 v13, 0x3

    .line 321
    if-le v11, v13, :cond_b

    .line 322
    .line 323
    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    if-ne v11, v5, :cond_a

    .line 328
    .line 329
    invoke-virtual {v9, v13}, Ljava/lang/String;->charAt(I)C

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    if-ne v11, v5, :cond_a

    .line 334
    .line 335
    move-object v11, v15

    .line 336
    goto :goto_8

    .line 337
    :cond_a
    move-object v11, v14

    .line 338
    :goto_8
    const-string v13, "ad_personalization"

    .line 339
    .line 340
    invoke-virtual {v12, v13, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    const/4 v13, 0x6

    .line 348
    if-le v11, v13, :cond_d

    .line 349
    .line 350
    const/4 v11, 0x4

    .line 351
    if-lt v4, v11, :cond_d

    .line 352
    .line 353
    const/4 v4, 0x0

    .line 354
    invoke-virtual {v9, v4}, Ljava/lang/String;->charAt(I)C

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-ne v11, v5, :cond_c

    .line 359
    .line 360
    invoke-virtual {v9, v13}, Ljava/lang/String;->charAt(I)C

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    if-ne v9, v5, :cond_c

    .line 365
    .line 366
    move-object v14, v15

    .line 367
    :cond_c
    const-string v5, "ad_user_data"

    .line 368
    .line 369
    invoke-virtual {v12, v5, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_d
    const/4 v4, 0x0

    .line 374
    goto :goto_9

    .line 375
    :cond_e
    move v4, v11

    .line 376
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 377
    .line 378
    move-object v12, v5

    .line 379
    :goto_9
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    const-string v9, "Consent generated from Tcf"

    .line 384
    .line 385
    iget-object v5, v5, LA7/N;->n:LA7/P;

    .line 386
    .line 387
    invoke-virtual {v5, v9, v12}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 391
    .line 392
    if-eq v12, v5, :cond_f

    .line 393
    .line 394
    iget-object v5, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v5, LA7/n0;

    .line 397
    .line 398
    iget-object v5, v5, LA7/n0;->n:Ln7/b;

    .line 399
    .line 400
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 404
    .line 405
    .line 406
    move-result-wide v13

    .line 407
    const/16 v5, -0x1e

    .line 408
    .line 409
    invoke-virtual {v0, v12, v5, v13, v14}, LA7/P0;->r0(Landroid/os/Bundle;IJ)V

    .line 410
    .line 411
    .line 412
    :cond_f
    new-instance v5, Landroid/os/Bundle;

    .line 413
    .line 414
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 415
    .line 416
    .line 417
    new-instance v9, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :try_start_6
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    check-cast v2, Ljava/lang/String;

    .line 427
    .line 428
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 429
    .line 430
    .line 431
    move-result v11

    .line 432
    if-nez v11, :cond_10

    .line 433
    .line 434
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 435
    .line 436
    .line 437
    move-result v2
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 438
    goto :goto_a

    .line 439
    :catch_6
    :cond_10
    const/4 v2, -0x1

    .line 440
    :goto_a
    const/16 v11, 0x3f

    .line 441
    .line 442
    const-string v12, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"

    .line 443
    .line 444
    if-ltz v2, :cond_11

    .line 445
    .line 446
    const/16 v13, 0xfff

    .line 447
    .line 448
    if-gt v2, v13, :cond_11

    .line 449
    .line 450
    shr-int/lit8 v13, v2, 0x6

    .line 451
    .line 452
    and-int/2addr v13, v11

    .line 453
    invoke-virtual {v12, v13}, Ljava/lang/String;->charAt(I)C

    .line 454
    .line 455
    .line 456
    move-result v13

    .line 457
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    and-int/2addr v2, v11

    .line 461
    invoke-virtual {v12, v2}, Ljava/lang/String;->charAt(I)C

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    goto :goto_b

    .line 469
    :cond_11
    const-string v2, "00"

    .line 470
    .line 471
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    :goto_b
    invoke-virtual {v1}, LA7/D1;->b()I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-ltz v1, :cond_12

    .line 479
    .line 480
    if-gt v1, v11, :cond_12

    .line 481
    .line 482
    invoke-virtual {v12, v1}, Ljava/lang/String;->charAt(I)C

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_12
    const-string v1, "0"

    .line 491
    .line 492
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    :goto_c
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_13

    .line 504
    .line 505
    goto :goto_d

    .line 506
    :cond_13
    move v10, v4

    .line 507
    :goto_d
    or-int/lit8 v1, v10, 0x4

    .line 508
    .line 509
    invoke-virtual {v3, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_14

    .line 518
    .line 519
    or-int/lit8 v1, v10, 0xc

    .line 520
    .line 521
    :cond_14
    invoke-virtual {v12, v1}, Ljava/lang/String;->charAt(I)C

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    const-string v2, "_tcfd"

    .line 533
    .line 534
    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    const-string v1, "auto"

    .line 538
    .line 539
    const-string v2, "_tcf"

    .line 540
    .line 541
    invoke-virtual {v0, v1, v2, v5}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 542
    .line 543
    .line 544
    :cond_15
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LA7/P0;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_6

    .line 16
    .line 17
    iget-boolean v1, p0, LA7/P0;->i:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, LA7/E1;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, v2, LA7/U1;->f:Le3/d;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    iget-object v3, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, LA7/n0;

    .line 48
    .line 49
    iget-object v3, v3, LA7/n0;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {v3}, Le3/e;->a(Landroid/content/Context;)Le3/d;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-object v3, v2, LA7/U1;->f:Le3/d;

    .line 56
    .line 57
    :cond_2
    iget-object v2, v2, LA7/U1;->f:Le3/d;

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 v3, 0x1

    .line 63
    iput-boolean v3, p0, LA7/P0;->i:Z

    .line 64
    .line 65
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v3, v3, LA7/N;->n:LA7/P;

    .line 70
    .line 71
    const-string v4, "Registering trigger URI"

    .line 72
    .line 73
    iget-object v5, v1, LA7/E1;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v3, v4, v5}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Le3/d;->e(Landroid/net/Uri;)Lp8/p;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    iput-boolean v0, p0, LA7/P0;->i:Z

    .line 89
    .line 90
    invoke-virtual {p0}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, LA7/n0;

    .line 101
    .line 102
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 103
    .line 104
    sget-object v3, LA7/y;->N0:LA7/D;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-virtual {v0, v4, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, LA7/Z;->m0()Landroid/util/SparseArray;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-wide v3, v1, LA7/E1;->b:J

    .line 122
    .line 123
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iget v4, v1, LA7/E1;->c:I

    .line 128
    .line 129
    invoke-virtual {v0, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v3, v0}, LA7/Z;->h0(Landroid/util/SparseArray;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    new-instance v0, LA7/V0;

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct {v0, p0, v3}, LA7/V0;-><init>(Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    new-instance v3, LS3/e;

    .line 146
    .line 147
    const/4 v4, 0x2

    .line 148
    invoke-direct {v3, v4, p0, v1}, LS3/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v1, LL7/b;

    .line 152
    .line 153
    const/16 v4, 0x18

    .line 154
    .line 155
    invoke-direct {v1, v4, v2, v3}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2, v1, v0}, Lp8/p;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_0
    return-void
.end method

.method public final E0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, LA7/Z;->n:LA7/b0;

    .line 9
    .line 10
    invoke-virtual {v0}, LA7/b0;->u()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LA7/n0;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const-string v2, "unset"

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, LA7/n0;->n:Ln7/b;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    const-string v7, "_npa"

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const-string v6, "app"

    .line 41
    .line 42
    move-object v2, p0

    .line 43
    invoke-virtual/range {v2 .. v7}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v2, "true"

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    const-wide/16 v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-wide/16 v2, 0x0

    .line 59
    .line 60
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    iget-object v0, v1, LA7/n0;->n:Ln7/b;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    const-string v12, "app"

    .line 74
    .line 75
    const-string v13, "_npa"

    .line 76
    .line 77
    move-object v8, p0

    .line 78
    invoke-virtual/range {v8 .. v13}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v2, v8

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v2, p0

    .line 84
    :goto_1
    invoke-virtual {v1}, LA7/n0;->e()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-boolean v0, v2, LA7/P0;->r:Z

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "Recording app launch after enabling measurement for the first time (FE)"

    .line 99
    .line 100
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, LA7/P0;->z0()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, LA7/B;->g0()LA7/x1;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v0, v0, LA7/x1;->e:LY9/c;

    .line 113
    .line 114
    invoke-virtual {v0}, LY9/c;->r()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v1, LA7/r0;

    .line 122
    .line 123
    invoke-direct {v1, p0}, LA7/r0;-><init>(LA7/P0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v3, "Updating Scion state (FE)"

    .line 135
    .line 136
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 137
    .line 138
    invoke-virtual {v0, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, LA7/n0;->m()LA7/m1;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 149
    .line 150
    .line 151
    const/4 v1, 0x1

    .line 152
    invoke-virtual {v0, v1}, LA7/m1;->w0(Z)LA7/N1;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    new-instance v3, LA7/q1;

    .line 157
    .line 158
    const/4 v4, 0x3

    .line 159
    invoke-direct {v3, v0, v1, v4}, LA7/q1;-><init>(LA7/m1;LA7/N1;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v3}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final F0(Landroid/os/Bundle;J)V
    .locals 12

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "app_id"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "Package name should be null when calling setConditionalUserProperty"

    .line 23
    .line 24
    iget-object v1, v1, LA7/N;->i:LA7/P;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-class v1, Ljava/lang/String;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v0, p1, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string p1, "origin"

    .line 39
    .line 40
    invoke-static {v0, p1, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string v3, "name"

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    const-string v4, "value"

    .line 49
    .line 50
    const-class v5, Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v0, v4, v5, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const-string v5, "trigger_event_name"

    .line 56
    .line 57
    invoke-static {v0, v5, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-wide/16 v6, 0x0

    .line 61
    .line 62
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const-string v9, "trigger_timeout"

    .line 67
    .line 68
    const-class v10, Ljava/lang/Long;

    .line 69
    .line 70
    invoke-static {v0, v9, v10, v8}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const-string v8, "timed_out_event_name"

    .line 74
    .line 75
    invoke-static {v0, v8, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v8, "timed_out_event_params"

    .line 79
    .line 80
    const-class v11, Landroid/os/Bundle;

    .line 81
    .line 82
    invoke-static {v0, v8, v11, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const-string v8, "triggered_event_name"

    .line 86
    .line 87
    invoke-static {v0, v8, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    const-string v8, "triggered_event_params"

    .line 91
    .line 92
    invoke-static {v0, v8, v11, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const-string v7, "time_to_live"

    .line 100
    .line 101
    invoke-static {v0, v7, v10, v6}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    const-string v6, "expired_event_name"

    .line 105
    .line 106
    invoke-static {v0, v6, v1, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    const-string v1, "expired_event_params"

    .line 110
    .line 111
    invoke-static {v0, v1, v11, v2}, LA7/I0;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    const-string p1, "creation_timestamp"

    .line 136
    .line 137
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-virtual {p3, p1}, LA7/U1;->W0(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, LA7/n0;

    .line 159
    .line 160
    if-eqz p3, :cond_1

    .line 161
    .line 162
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iget-object p3, v1, LA7/n0;->m:LA7/J;

    .line 167
    .line 168
    invoke-virtual {p3, p1}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget-object p2, p2, LA7/N;->f:LA7/P;

    .line 173
    .line 174
    const-string p3, "Invalid conditional user property name"

    .line 175
    .line 176
    invoke-virtual {p2, p3, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_1
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    invoke-virtual {p3, p2, p1}, LA7/U1;->h0(Ljava/lang/Object;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result p3

    .line 188
    if-eqz p3, :cond_2

    .line 189
    .line 190
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    iget-object v0, v1, LA7/n0;->m:LA7/J;

    .line 195
    .line 196
    invoke-virtual {v0, p1}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 201
    .line 202
    const-string v0, "Invalid conditional user property value"

    .line 203
    .line 204
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_2
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-virtual {p3, p2, p1}, LA7/U1;->c1(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p3

    .line 216
    if-nez p3, :cond_3

    .line 217
    .line 218
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    iget-object v0, v1, LA7/n0;->m:LA7/J;

    .line 223
    .line 224
    invoke-virtual {v0, p1}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p3, p3, LA7/N;->f:LA7/P;

    .line 229
    .line 230
    const-string v0, "Unable to normalize conditional user property value"

    .line 231
    .line 232
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_3
    invoke-static {p3, v0}, LA7/I0;->g(Ljava/lang/Object;Landroid/os/Bundle;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 240
    .line 241
    .line 242
    move-result-wide p2

    .line 243
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    const-wide/16 v3, 0x1

    .line 252
    .line 253
    const-wide v5, 0x39ef8b000L

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    if-nez v2, :cond_5

    .line 259
    .line 260
    cmp-long v2, p2, v5

    .line 261
    .line 262
    if-gtz v2, :cond_4

    .line 263
    .line 264
    cmp-long v2, p2, v3

    .line 265
    .line 266
    if-gez v2, :cond_5

    .line 267
    .line 268
    :cond_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v1, v1, LA7/n0;->m:LA7/J;

    .line 273
    .line 274
    invoke-virtual {v1, p1}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    iget-object p3, v0, LA7/N;->f:LA7/P;

    .line 283
    .line 284
    const-string v0, "Invalid conditional user property timeout"

    .line 285
    .line 286
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_5
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 291
    .line 292
    .line 293
    move-result-wide p2

    .line 294
    cmp-long v2, p2, v5

    .line 295
    .line 296
    if-gtz v2, :cond_7

    .line 297
    .line 298
    cmp-long v2, p2, v3

    .line 299
    .line 300
    if-gez v2, :cond_6

    .line 301
    .line 302
    goto :goto_0

    .line 303
    :cond_6
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    new-instance p2, LA7/S0;

    .line 308
    .line 309
    const/4 p3, 0x2

    .line 310
    invoke-direct {p2, p0, v0, p3}, LA7/S0;-><init>(LA7/P0;Landroid/os/Bundle;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p2}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_7
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iget-object v1, v1, LA7/n0;->m:LA7/J;

    .line 322
    .line 323
    invoke-virtual {v1, p1}, LA7/J;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    iget-object p3, v0, LA7/N;->f:LA7/P;

    .line 332
    .line 333
    const-string v0, "Invalid conditional user property time to live"

    .line 334
    .line 335
    invoke-virtual {p3, p1, v0, p2}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    return-void
.end method

.method public final G0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA7/P0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, LA7/n0;

    .line 7
    .line 8
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    invoke-virtual/range {v1 .. v6}, LA7/P0;->v0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p4}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p5}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 11
    .line 12
    .line 13
    const-string v0, "allow_personalized_ads"

    .line 14
    .line 15
    invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    instance-of v0, p3, Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "_npa"

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    move-object v0, p3

    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-virtual {v0, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    const-string p5, "false"

    .line 43
    .line 44
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    const-wide/16 v2, 0x1

    .line 49
    .line 50
    if-eqz p3, :cond_0

    .line 51
    .line 52
    move-wide v4, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    :goto_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    cmp-long v2, v4, v2

    .line 65
    .line 66
    if-nez v2, :cond_1

    .line 67
    .line 68
    const-string p5, "true"

    .line 69
    .line 70
    :cond_1
    iget-object v0, v0, LA7/Z;->n:LA7/b0;

    .line 71
    .line 72
    invoke-virtual {v0, p5}, LA7/b0;->v(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_1
    move-object p5, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    if-nez p3, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 80
    .line 81
    .line 82
    move-result-object p5

    .line 83
    iget-object p5, p5, LA7/Z;->n:LA7/b0;

    .line 84
    .line 85
    const-string v0, "unset"

    .line 86
    .line 87
    invoke-virtual {p5, v0}, LA7/b0;->v(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "non_personalized_ads(_npa)"

    .line 96
    .line 97
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 98
    .line 99
    const-string v2, "Setting user property(FE)"

    .line 100
    .line 101
    invoke-virtual {v0, v1, v2, p3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    move-object v6, p3

    .line 105
    move-object v7, p5

    .line 106
    iget-object p3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p3, LA7/n0;

    .line 109
    .line 110
    invoke-virtual {p3}, LA7/n0;->e()Z

    .line 111
    .line 112
    .line 113
    move-result p5

    .line 114
    if-nez p5, :cond_5

    .line 115
    .line 116
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string p2, "User property not set since app measurement is disabled"

    .line 121
    .line 122
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 123
    .line 124
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_5
    invoke-virtual {p3}, LA7/n0;->f()Z

    .line 129
    .line 130
    .line 131
    move-result p5

    .line 132
    if-nez p5, :cond_6

    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    new-instance v3, LA7/R1;

    .line 136
    .line 137
    move-wide v4, p1

    .line 138
    move-object v8, p4

    .line 139
    invoke-direct/range {v3 .. v8}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {p3}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object p1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p1, LA7/n0;

    .line 149
    .line 150
    invoke-virtual {p1}, LA7/n0;->k()LA7/H;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    const/4 p3, 0x0

    .line 162
    invoke-virtual {v3, p2, p3}, LA7/R1;->writeToParcel(Landroid/os/Parcel;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Landroid/os/Parcel;->marshall()[B

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 170
    .line 171
    .line 172
    array-length p2, p4

    .line 173
    const/high16 p5, 0x20000

    .line 174
    .line 175
    const/4 v0, 0x1

    .line 176
    if-le p2, p5, :cond_7

    .line 177
    .line 178
    invoke-virtual {p1}, LA7/B0;->zzj()LA7/N;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string p2, "User property too long for local database. Sending directly to service"

    .line 183
    .line 184
    iget-object p1, p1, LA7/N;->g:LA7/P;

    .line 185
    .line 186
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    invoke-virtual {p1, v0, p4}, LA7/H;->l0(I[B)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    :goto_3
    invoke-virtual {v1, v0}, LA7/m1;->w0(Z)LA7/N1;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    new-instance v0, LA7/p1;

    .line 199
    .line 200
    const/4 v5, 0x0

    .line 201
    move-object v4, v3

    .line 202
    move v3, p3

    .line 203
    invoke-direct/range {v0 .. v5}, LA7/p1;-><init>(LA7/m1;LA7/N1;ZLf7/a;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v0}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final l0(JZ)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Resetting analytics data (FE)"

    .line 12
    .line 13
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LA7/B;->g0()LA7/x1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, LA7/x1;->f:LA7/B1;

    .line 26
    .line 27
    iget-object v1, v0, LA7/B1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, LA7/C1;

    .line 30
    .line 31
    invoke-virtual {v1}, LA7/n;->a()V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LA7/x1;

    .line 37
    .line 38
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, LA7/n0;

    .line 41
    .line 42
    iget-object v2, v2, LA7/n0;->g:LA7/e;

    .line 43
    .line 44
    sget-object v3, LA7/y;->b1:LA7/D;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-virtual {v2, v4, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const-wide/16 v5, 0x0

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, LA7/n0;

    .line 58
    .line 59
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    iput-wide v1, v0, LA7/B1;->b:J

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iput-wide v5, v0, LA7/B1;->b:J

    .line 72
    .line 73
    :goto_0
    iget-wide v1, v0, LA7/B1;->b:J

    .line 74
    .line 75
    iput-wide v1, v0, LA7/B1;->c:J

    .line 76
    .line 77
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, LA7/n0;

    .line 80
    .line 81
    invoke-virtual {v0}, LA7/n0;->j()LA7/I;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, LA7/I;->m0()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LA7/n0;->e()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object v3, v2, LA7/Z;->g:LA7/a0;

    .line 97
    .line 98
    invoke-virtual {v3, p1, p2}, LA7/a0;->f(J)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iget-object p1, p1, LA7/Z;->w:LA7/b0;

    .line 106
    .line 107
    invoke-virtual {p1}, LA7/b0;->u()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_1

    .line 116
    .line 117
    iget-object p1, v2, LA7/Z;->w:LA7/b0;

    .line 118
    .line 119
    invoke-virtual {p1, v4}, LA7/b0;->v(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object p1, v2, LA7/Z;->q:LA7/a0;

    .line 123
    .line 124
    invoke-virtual {p1, v5, v6}, LA7/a0;->f(J)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v2, LA7/Z;->r:LA7/a0;

    .line 128
    .line 129
    invoke-virtual {p1, v5, v6}, LA7/a0;->f(J)V

    .line 130
    .line 131
    .line 132
    iget-object p1, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, LA7/n0;

    .line 135
    .line 136
    iget-object p1, p1, LA7/n0;->g:LA7/e;

    .line 137
    .line 138
    const-string p2, "firebase_analytics_collection_deactivated"

    .line 139
    .line 140
    invoke-virtual {p1, p2}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_2

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_2

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    xor-int/lit8 p1, v1, 0x1

    .line 154
    .line 155
    invoke-virtual {v2, p1}, LA7/Z;->j0(Z)V

    .line 156
    .line 157
    .line 158
    :goto_1
    iget-object p1, v2, LA7/Z;->x:LA7/b0;

    .line 159
    .line 160
    invoke-virtual {p1, v4}, LA7/b0;->v(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object p1, v2, LA7/Z;->y:LA7/a0;

    .line 164
    .line 165
    invoke-virtual {p1, v5, v6}, LA7/a0;->f(J)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v2, LA7/Z;->z:LVa/X7;

    .line 169
    .line 170
    invoke-virtual {p1, v4}, LVa/X7;->p(Landroid/os/Bundle;)V

    .line 171
    .line 172
    .line 173
    if-eqz p3, :cond_3

    .line 174
    .line 175
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const/4 p2, 0x0

    .line 180
    invoke-virtual {p1, p2}, LA7/m1;->w0(Z)LA7/N1;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    iget-object p3, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p3, LA7/n0;

    .line 187
    .line 188
    invoke-virtual {p3}, LA7/n0;->k()LA7/H;

    .line 189
    .line 190
    .line 191
    move-result-object p3

    .line 192
    invoke-virtual {p3}, LA7/H;->m0()V

    .line 193
    .line 194
    .line 195
    new-instance p3, LA7/q1;

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    invoke-direct {p3, p1, p2, v0}, LA7/q1;-><init>(LA7/m1;LA7/N1;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p3}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    :cond_3
    invoke-virtual {p0}, LA7/B;->g0()LA7/x1;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    iget-object p1, p1, LA7/x1;->e:LY9/c;

    .line 209
    .line 210
    invoke-virtual {p1}, LY9/c;->r()V

    .line 211
    .line 212
    .line 213
    xor-int/lit8 p1, v1, 0x1

    .line 214
    .line 215
    iput-boolean p1, p0, LA7/P0;->r:Z

    .line 216
    .line 217
    return-void
.end method

.method public final m0(LA7/o;Z)V
    .locals 2

    .line 1
    new-instance v0, LA7/p;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LA7/p;->run()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final n0(LA7/F0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LA7/E0;->c:LA7/E0;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, LA7/F0;->i(LA7/E0;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, LA7/E0;->b:LA7/E0;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, LA7/F0;->i(LA7/E0;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, LA7/n0;

    .line 25
    .line 26
    invoke-virtual {p1}, LA7/n0;->m()LA7/m1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, LA7/m1;->s0()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    :cond_1
    move p1, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move p1, v1

    .line 39
    :goto_0
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, LA7/n0;

    .line 42
    .line 43
    iget-object v3, v0, LA7/n0;->j:LA7/k0;

    .line 44
    .line 45
    invoke-static {v3}, LA7/n0;->d(LA7/D0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, LA7/k0;->c0()V

    .line 49
    .line 50
    .line 51
    iget-boolean v0, v0, LA7/n0;->D:Z

    .line 52
    .line 53
    if-eq p1, v0, :cond_5

    .line 54
    .line 55
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LA7/n0;

    .line 58
    .line 59
    iget-object v3, v0, LA7/n0;->j:LA7/k0;

    .line 60
    .line 61
    invoke-static {v3}, LA7/n0;->d(LA7/D0;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, LA7/k0;->c0()V

    .line 65
    .line 66
    .line 67
    iput-boolean p1, v0, LA7/n0;->D:Z

    .line 68
    .line 69
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const-string v4, "measurement_enabled_from_api"

    .line 81
    .line 82
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v0, 0x0

    .line 102
    :goto_1
    if-eqz p1, :cond_4

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1, v1}, LA7/P0;->s0(Ljava/lang/Boolean;Z)V

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public final o0(LA7/F0;JZ)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 2
    .line 3
    .line 4
    iget v7, p1, LA7/F0;->b:I

    .line 5
    .line 6
    const/16 v8, -0xa

    .line 7
    .line 8
    if-eq v7, v8, :cond_2

    .line 9
    .line 10
    sget-object v2, LA7/E0;->b:LA7/E0;

    .line 11
    .line 12
    iget-object v3, p1, LA7/F0;->a:Ljava/util/EnumMap;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LA7/H0;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    sget-object v2, LA7/H0;->b:LA7/H0;

    .line 23
    .line 24
    :cond_0
    sget-object v3, LA7/H0;->b:LA7/H0;

    .line 25
    .line 26
    if-ne v2, v3, :cond_2

    .line 27
    .line 28
    sget-object v2, LA7/E0;->c:LA7/E0;

    .line 29
    .line 30
    iget-object v4, p1, LA7/F0;->a:Ljava/util/EnumMap;

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, LA7/H0;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    move-object v2, v3

    .line 41
    :cond_1
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 48
    .line 49
    const-string v2, "Ignoring empty consent settings"

    .line 50
    .line 51
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object v2, p0, LA7/P0;->h:Ljava/lang/Object;

    .line 56
    .line 57
    monitor-enter v2

    .line 58
    :try_start_0
    iget-object v6, p0, LA7/P0;->n:LA7/F0;

    .line 59
    .line 60
    iget v3, v6, LA7/F0;->b:I

    .line 61
    .line 62
    invoke-static {v7, v3}, LA7/F0;->h(II)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x0

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    iget-object v3, p0, LA7/P0;->n:LA7/F0;

    .line 70
    .line 71
    iget-object v5, p1, LA7/F0;->a:Ljava/util/EnumMap;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-array v9, v4, [LA7/E0;

    .line 78
    .line 79
    invoke-interface {v5, v9}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, [LA7/E0;

    .line 84
    .line 85
    invoke-virtual {p1, v3, v5}, LA7/F0;->k(LA7/F0;[LA7/E0;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    sget-object v5, LA7/E0;->c:LA7/E0;

    .line 90
    .line 91
    invoke-virtual {p1, v5}, LA7/F0;->i(LA7/E0;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    const/4 v10, 0x1

    .line 96
    if-eqz v9, :cond_3

    .line 97
    .line 98
    iget-object v9, p0, LA7/P0;->n:LA7/F0;

    .line 99
    .line 100
    invoke-virtual {v9, v5}, LA7/F0;->i(LA7/E0;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-nez v5, :cond_3

    .line 105
    .line 106
    move v4, v10

    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_3
    :goto_0
    iget-object v5, p0, LA7/P0;->n:LA7/F0;

    .line 112
    .line 113
    invoke-virtual {p1, v5}, LA7/F0;->j(LA7/F0;)LA7/F0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, LA7/P0;->n:LA7/F0;

    .line 118
    .line 119
    move v5, v4

    .line 120
    move v4, v10

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move-object v0, p1

    .line 123
    move v3, v4

    .line 124
    move v5, v3

    .line 125
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    if-nez v4, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v2, v2, LA7/N;->l:LA7/P;

    .line 133
    .line 134
    const-string v3, "Ignoring lower-priority consent settings, proposed settings"

    .line 135
    .line 136
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    iget-object v2, p0, LA7/P0;->o:Ljava/util/concurrent/atomic/AtomicLong;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    if-eqz v3, :cond_7

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-virtual {p0, v2}, LA7/P0;->G0(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    move-object v2, v0

    .line 153
    new-instance v0, LA7/b1;

    .line 154
    .line 155
    move-object v1, p0

    .line 156
    move-wide v3, p2

    .line 157
    move v7, v5

    .line 158
    move-object v8, v6

    .line 159
    move-wide v5, v9

    .line 160
    invoke-direct/range {v0 .. v8}, LA7/b1;-><init>(LA7/P0;LA7/F0;JJZLA7/F0;)V

    .line 161
    .line 162
    .line 163
    if-eqz p4, :cond_6

    .line 164
    .line 165
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, LA7/b1;->run()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_6
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1, v0}, LA7/k0;->n0(Ljava/lang/Runnable;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    move-object v2, v0

    .line 181
    move-wide v3, v9

    .line 182
    new-instance v0, LA7/d1;

    .line 183
    .line 184
    move-object v1, p0

    .line 185
    invoke-direct/range {v0 .. v6}, LA7/d1;-><init>(LA7/P0;LA7/F0;JZLA7/F0;)V

    .line 186
    .line 187
    .line 188
    if-eqz p4, :cond_8

    .line 189
    .line 190
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, LA7/d1;->run()V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_8
    const/16 v1, 0x1e

    .line 198
    .line 199
    if-eq v7, v1, :cond_a

    .line 200
    .line 201
    if-ne v7, v8, :cond_9

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_9
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_a
    :goto_2
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v0}, LA7/k0;->n0(Ljava/lang/Runnable;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    throw v0
.end method

.method public final r0(Landroid/os/Bundle;IJ)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LA7/F0;->c:LA7/F0;

    .line 5
    .line 6
    sget-object v0, LA7/G0;->b:LA7/G0;

    .line 7
    .line 8
    iget-object v0, v0, LA7/G0;->a:[LA7/E0;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    const/4 v3, 0x0

    .line 13
    if-ge v2, v1, :cond_3

    .line 14
    .line 15
    aget-object v4, v0, v2

    .line 16
    .line 17
    iget-object v5, v4, LA7/E0;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    iget-object v4, v4, LA7/E0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    const-string v5, "granted"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const-string v5, "denied"

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v5, v3

    .line 56
    :goto_1
    if-nez v5, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v4, v3

    .line 63
    :goto_2
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "Ignoring invalid consent setting"

    .line 70
    .line 71
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "Valid consent values are \'granted\', \'denied\'"

    .line 81
    .line 82
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LA7/k0;->o0()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {p2, p1}, LA7/F0;->b(ILandroid/os/Bundle;)LA7/F0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, v1, LA7/F0;->a:Ljava/util/EnumMap;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    sget-object v5, LA7/H0;->b:LA7/H0;

    .line 114
    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, LA7/H0;

    .line 122
    .line 123
    if-eq v4, v5, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0, v1, p3, p4, v0}, LA7/P0;->o0(LA7/F0;JZ)V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-static {p2, p1}, LA7/o;->a(ILandroid/os/Bundle;)LA7/o;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v2, v1, LA7/o;->e:Ljava/util/EnumMap;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_8

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, LA7/H0;

    .line 153
    .line 154
    if-eq v4, v5, :cond_7

    .line 155
    .line 156
    invoke-virtual {p0, v1, v0}, LA7/P0;->m0(LA7/o;Z)V

    .line 157
    .line 158
    .line 159
    :cond_8
    invoke-static {p1}, LA7/o;->c(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-eqz p1, :cond_b

    .line 164
    .line 165
    const/16 v1, -0x1e

    .line 166
    .line 167
    if-ne p2, v1, :cond_9

    .line 168
    .line 169
    const-string p2, "tcf"

    .line 170
    .line 171
    :goto_3
    move-object v5, p2

    .line 172
    goto :goto_4

    .line 173
    :cond_9
    const-string p2, "app"

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :goto_4
    iget-object p2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p2, LA7/n0;

    .line 179
    .line 180
    iget-object p2, p2, LA7/n0;->g:LA7/e;

    .line 181
    .line 182
    sget-object v1, LA7/y;->S0:LA7/D;

    .line 183
    .line 184
    invoke-virtual {p2, v3, v1}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_a

    .line 189
    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    const-string v9, "allow_personalized_ads"

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    move-object v4, p0

    .line 199
    move-object v8, v5

    .line 200
    move-wide v5, p3

    .line 201
    invoke-virtual/range {v4 .. v9}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_a
    move-object v8, v5

    .line 206
    move-wide v5, p3

    .line 207
    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    move-wide v9, v5

    .line 212
    move-object v5, v8

    .line 213
    const/4 v8, 0x0

    .line 214
    const-string v6, "allow_personalized_ads"

    .line 215
    .line 216
    move-object v4, p0

    .line 217
    invoke-virtual/range {v4 .. v10}, LA7/P0;->x0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 218
    .line 219
    .line 220
    :cond_b
    return-void
.end method

.method public final s0(Ljava/lang/Boolean;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Setting app measurement enabled (FE)"

    .line 12
    .line 13
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "measurement_enabled"

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 49
    .line 50
    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, LA7/B0;->c0()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-string v0, "measurement_enabled_from_api"

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-interface {p2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    :goto_1
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object p2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p2, LA7/n0;

    .line 89
    .line 90
    iget-object v0, p2, LA7/n0;->j:LA7/k0;

    .line 91
    .line 92
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 96
    .line 97
    .line 98
    iget-boolean p2, p2, LA7/n0;->D:Z

    .line 99
    .line 100
    if-nez p2, :cond_4

    .line 101
    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-nez p1, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-void

    .line 112
    :cond_4
    :goto_2
    invoke-virtual {p0}, LA7/P0;->E0()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final t0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    move/from16 v10, p8

    .line 10
    .line 11
    const/4 v11, 0x0

    .line 12
    const/4 v12, 0x1

    .line 13
    invoke-static {v7}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, LA7/Y;->h0()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v13, v0

    .line 28
    check-cast v13, LA7/n0;

    .line 29
    .line 30
    invoke-virtual {v13}, LA7/n0;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "Event not sent since app measurement is disabled"

    .line 41
    .line 42
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {v13}, LA7/n0;->j()LA7/I;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, LA7/I;->i:Ljava/util/List;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v2, "Dropping non-safelisted event. event name, origin"

    .line 67
    .line 68
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 69
    .line 70
    invoke-virtual {v0, v8, v2, v7}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    iget-boolean v0, v1, LA7/P0;->f:Z

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    iput-boolean v12, v1, LA7/P0;->f:Z

    .line 80
    .line 81
    :try_start_0
    iget-boolean v0, v13, LA7/n0;->e:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    .line 83
    iget-object v2, v13, LA7/n0;->a:Landroid/content/Context;

    .line 84
    .line 85
    const-string v3, "com.google.android.gms.tagmanager.TagManagerService"

    .line 86
    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v3, v12, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 102
    :goto_0
    :try_start_2
    const-string v3, "initialize"

    .line 103
    .line 104
    new-array v4, v12, [Ljava/lang/Class;

    .line 105
    .line 106
    const-class v5, Landroid/content/Context;

    .line 107
    .line 108
    aput-object v5, v4, v11

    .line 109
    .line 110
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-array v3, v12, [Ljava/lang/Object;

    .line 115
    .line 116
    aput-object v2, v3, v11

    .line 117
    .line 118
    invoke-virtual {v0, v14, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catch_0
    move-exception v0

    .line 123
    :try_start_3
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v2, v2, LA7/N;->i:LA7/P;

    .line 128
    .line 129
    const-string v3, "Failed to invoke Tag Manager\'s initialize() method"

    .line 130
    .line 131
    invoke-virtual {v2, v3, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catch_1
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v2, "Tag Manager is not found and thus will not be used"

    .line 140
    .line 141
    iget-object v0, v0, LA7/N;->l:LA7/P;

    .line 142
    .line 143
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    :goto_1
    const-string v0, "_cmp"

    .line 147
    .line 148
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iget-object v15, v13, LA7/n0;->n:Ln7/b;

    .line 153
    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    const-string v0, "gclid"

    .line 157
    .line 158
    invoke-virtual {v9, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_4

    .line 163
    .line 164
    invoke-virtual {v9, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    const-string v5, "auto"

    .line 176
    .line 177
    const-string v6, "_lgclid"

    .line 178
    .line 179
    invoke-virtual/range {v1 .. v6}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    move-object v6, v1

    .line 183
    if-eqz p6, :cond_5

    .line 184
    .line 185
    sget-object v0, LA7/U1;->j:[Ljava/lang/String;

    .line 186
    .line 187
    aget-object v0, v0, v11

    .line 188
    .line 189
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_5

    .line 194
    .line 195
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v1, v1, LA7/Z;->z:LVa/X7;

    .line 204
    .line 205
    invoke-virtual {v1}, LVa/X7;->o()Landroid/os/Bundle;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0, v9, v1}, LA7/U1;->x0(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    iget-object v0, v13, LA7/n0;->m:LA7/J;

    .line 213
    .line 214
    iget-object v1, v6, LA7/P0;->v:Ly3/j;

    .line 215
    .line 216
    const/16 v2, 0x28

    .line 217
    .line 218
    if-nez v10, :cond_a

    .line 219
    .line 220
    const-string v3, "_iap"

    .line 221
    .line 222
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_a

    .line 227
    .line 228
    iget-object v3, v13, LA7/n0;->l:LA7/U1;

    .line 229
    .line 230
    invoke-static {v3}, LA7/n0;->c(LA7/B0;)V

    .line 231
    .line 232
    .line 233
    const-string v4, "event"

    .line 234
    .line 235
    invoke-virtual {v3, v4, v8}, LA7/U1;->e1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    const/16 v16, 0x2

    .line 240
    .line 241
    if-nez v5, :cond_6

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    sget-object v5, LA7/I0;->a:[Ljava/lang/String;

    .line 245
    .line 246
    sget-object v14, LA7/I0;->b:[Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v3, v4, v5, v14, v8}, LA7/U1;->S0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    if-nez v5, :cond_7

    .line 253
    .line 254
    const/16 v16, 0xd

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    invoke-virtual {v3, v2, v4, v8}, LA7/U1;->J0(ILjava/lang/String;Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_8

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_8
    move/from16 v16, v11

    .line 265
    .line 266
    :goto_2
    if-eqz v16, :cond_a

    .line 267
    .line 268
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v0, v8}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iget-object v3, v3, LA7/N;->h:LA7/P;

    .line 277
    .line 278
    const-string v4, "Invalid public event name. Event will not be logged (FE)"

    .line 279
    .line 280
    invoke-virtual {v3, v4, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v13}, LA7/n0;->n()V

    .line 284
    .line 285
    .line 286
    invoke-static {v8, v2, v12}, LA7/U1;->s0(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-eqz v8, :cond_9

    .line 291
    .line 292
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    :cond_9
    invoke-virtual {v13}, LA7/n0;->n()V

    .line 297
    .line 298
    .line 299
    const/4 v2, 0x0

    .line 300
    const-string v3, "_ev"

    .line 301
    .line 302
    move-object/from16 p5, v0

    .line 303
    .line 304
    move-object/from16 p1, v1

    .line 305
    .line 306
    move-object/from16 p2, v2

    .line 307
    .line 308
    move-object/from16 p4, v3

    .line 309
    .line 310
    move/from16 p6, v11

    .line 311
    .line 312
    move/from16 p3, v16

    .line 313
    .line 314
    invoke-static/range {p1 .. p6}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_11

    .line 318
    .line 319
    :cond_a
    invoke-virtual {v6}, LA7/B;->f0()LA7/i1;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {v3, v11}, LA7/i1;->k0(Z)LA7/j1;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    const-string v4, "_sc"

    .line 328
    .line 329
    if-eqz v3, :cond_b

    .line 330
    .line 331
    invoke-virtual {v9, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-nez v5, :cond_b

    .line 336
    .line 337
    iput-boolean v12, v3, LA7/j1;->d:Z

    .line 338
    .line 339
    :cond_b
    if-eqz p6, :cond_c

    .line 340
    .line 341
    if-nez v10, :cond_c

    .line 342
    .line 343
    move v5, v12

    .line 344
    goto :goto_3

    .line 345
    :cond_c
    move v5, v11

    .line 346
    :goto_3
    invoke-static {v3, v9, v5}, LA7/U1;->u0(LA7/j1;Landroid/os/Bundle;Z)V

    .line 347
    .line 348
    .line 349
    const-string v3, "am"

    .line 350
    .line 351
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v14

    .line 355
    invoke-static {v8}, LA7/U1;->j1(Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    if-eqz p6, :cond_d

    .line 360
    .line 361
    iget-object v5, v6, LA7/P0;->d:LA7/K0;

    .line 362
    .line 363
    if-eqz v5, :cond_d

    .line 364
    .line 365
    if-nez v3, :cond_d

    .line 366
    .line 367
    if-nez v14, :cond_d

    .line 368
    .line 369
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-virtual {v0, v8}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v0, v9}, LA7/J;->b(Landroid/os/Bundle;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iget-object v1, v1, LA7/N;->m:LA7/P;

    .line 382
    .line 383
    const-string v3, "Passing event to registered event handler (FE)"

    .line 384
    .line 385
    invoke-virtual {v1, v2, v3, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iget-object v0, v6, LA7/P0;->d:LA7/K0;

    .line 389
    .line 390
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object v0, v6, LA7/P0;->d:LA7/K0;

    .line 394
    .line 395
    check-cast v0, LS3/c;

    .line 396
    .line 397
    move-wide/from16 v4, p3

    .line 398
    .line 399
    move-object v1, v7

    .line 400
    move-object v2, v8

    .line 401
    move-object v3, v9

    .line 402
    invoke-virtual/range {v0 .. v5}, LS3/c;->p(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :cond_d
    invoke-virtual {v13}, LA7/n0;->f()Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-nez v3, :cond_e

    .line 411
    .line 412
    goto/16 :goto_11

    .line 413
    .line 414
    :cond_e
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    invoke-virtual {v3, v8}, LA7/U1;->i0(Ljava/lang/String;)I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz v3, :cond_10

    .line 423
    .line 424
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-virtual {v0, v8}, LA7/J;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    iget-object v4, v4, LA7/N;->h:LA7/P;

    .line 433
    .line 434
    const-string v5, "Invalid event name. Event will not be logged (FE)"

    .line 435
    .line 436
    invoke-virtual {v4, v5, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 440
    .line 441
    .line 442
    invoke-static {v8, v2, v12}, LA7/U1;->s0(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-eqz v8, :cond_f

    .line 447
    .line 448
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    :cond_f
    invoke-virtual {v13}, LA7/n0;->n()V

    .line 453
    .line 454
    .line 455
    const-string v2, "_ev"

    .line 456
    .line 457
    const/4 v4, 0x0

    .line 458
    move-object/from16 p5, v0

    .line 459
    .line 460
    move-object/from16 p1, v1

    .line 461
    .line 462
    move-object/from16 p4, v2

    .line 463
    .line 464
    move/from16 p3, v3

    .line 465
    .line 466
    move-object/from16 p2, v4

    .line 467
    .line 468
    move/from16 p6, v11

    .line 469
    .line 470
    invoke-static/range {p1 .. p6}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :cond_10
    const-string v0, "_o"

    .line 475
    .line 476
    const-string v1, "_sn"

    .line 477
    .line 478
    const-string v2, "_si"

    .line 479
    .line 480
    filled-new-array {v0, v1, v4, v2}, [Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-virtual {v2, v8, v9, v1, v10}, LA7/U1;->o0(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v6}, LA7/B;->f0()LA7/i1;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-virtual {v1, v11}, LA7/i1;->k0(Z)LA7/j1;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    const-string v10, "_ae"

    .line 512
    .line 513
    if-eqz v1, :cond_11

    .line 514
    .line 515
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-eqz v1, :cond_11

    .line 520
    .line 521
    invoke-virtual {v6}, LA7/B;->g0()LA7/x1;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    iget-object v1, v1, LA7/x1;->f:LA7/B1;

    .line 526
    .line 527
    iget-object v4, v1, LA7/B1;->e:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v4, LA7/x1;

    .line 530
    .line 531
    iget-object v4, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v4, LA7/n0;

    .line 534
    .line 535
    iget-object v4, v4, LA7/n0;->n:Ln7/b;

    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 541
    .line 542
    .line 543
    move-result-wide v4

    .line 544
    const-wide/16 p5, 0x0

    .line 545
    .line 546
    iget-wide v2, v1, LA7/B1;->c:J

    .line 547
    .line 548
    sub-long v2, v4, v2

    .line 549
    .line 550
    iput-wide v4, v1, LA7/B1;->c:J

    .line 551
    .line 552
    cmp-long v1, v2, p5

    .line 553
    .line 554
    if-lez v1, :cond_12

    .line 555
    .line 556
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-virtual {v1, v9, v2, v3}, LA7/U1;->w0(Landroid/os/Bundle;J)V

    .line 561
    .line 562
    .line 563
    goto :goto_4

    .line 564
    :cond_11
    const-wide/16 p5, 0x0

    .line 565
    .line 566
    :cond_12
    :goto_4
    const-string v1, "auto"

    .line 567
    .line 568
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    const-string v2, "_ffr"

    .line 573
    .line 574
    if-nez v1, :cond_16

    .line 575
    .line 576
    const-string v1, "_ssr"

    .line 577
    .line 578
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    if-eqz v1, :cond_16

    .line 583
    .line 584
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-virtual {v9, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-static {v2}, Ln7/f;->b(Ljava/lang/String;)Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_13

    .line 597
    .line 598
    const/4 v2, 0x0

    .line 599
    goto :goto_5

    .line 600
    :cond_13
    if-eqz v2, :cond_14

    .line 601
    .line 602
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    :cond_14
    :goto_5
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    iget-object v3, v3, LA7/Z;->w:LA7/b0;

    .line 611
    .line 612
    invoke-virtual {v3}, LA7/b0;->u()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    invoke-static {v2, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    if-eqz v3, :cond_15

    .line 621
    .line 622
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    const-string v1, "Not logging duplicate session_start_with_rollout event"

    .line 627
    .line 628
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 629
    .line 630
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    goto/16 :goto_11

    .line 634
    .line 635
    :cond_15
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    iget-object v1, v1, LA7/Z;->w:LA7/b0;

    .line 640
    .line 641
    invoke-virtual {v1, v2}, LA7/b0;->v(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    goto :goto_6

    .line 645
    :cond_16
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-eqz v1, :cond_17

    .line 650
    .line 651
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    iget-object v1, v1, LA7/Z;->w:LA7/b0;

    .line 660
    .line 661
    invoke-virtual {v1}, LA7/b0;->u()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    if-nez v3, :cond_17

    .line 670
    .line 671
    invoke-virtual {v9, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :cond_17
    :goto_6
    new-instance v1, Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    sget-object v2, LA7/y;->O0:LA7/D;

    .line 683
    .line 684
    iget-object v3, v13, LA7/n0;->g:LA7/e;

    .line 685
    .line 686
    const/4 v4, 0x0

    .line 687
    invoke-virtual {v3, v4, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    if-eqz v2, :cond_18

    .line 692
    .line 693
    invoke-virtual {v6}, LA7/B;->g0()LA7/x1;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-virtual {v2}, LA7/B;->c0()V

    .line 698
    .line 699
    .line 700
    iget-boolean v2, v2, LA7/x1;->d:Z

    .line 701
    .line 702
    goto :goto_7

    .line 703
    :cond_18
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    iget-object v2, v2, LA7/Z;->t:LA7/X;

    .line 708
    .line 709
    invoke-virtual {v2}, LA7/X;->d()Z

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    :goto_7
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    iget-object v3, v3, LA7/Z;->q:LA7/a0;

    .line 718
    .line 719
    invoke-virtual {v3}, LA7/a0;->d()J

    .line 720
    .line 721
    .line 722
    move-result-wide v16

    .line 723
    cmp-long v3, v16, p5

    .line 724
    .line 725
    if-lez v3, :cond_1a

    .line 726
    .line 727
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    move/from16 v17, v11

    .line 732
    .line 733
    move/from16 v16, v12

    .line 734
    .line 735
    move-wide/from16 v11, p3

    .line 736
    .line 737
    invoke-virtual {v3, v11, v12}, LA7/Z;->i0(J)Z

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    if-eqz v3, :cond_19

    .line 742
    .line 743
    if-eqz v2, :cond_19

    .line 744
    .line 745
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    const-string v3, "Current session is expired, remove the session number, ID, and engagement time"

    .line 750
    .line 751
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 752
    .line 753
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    .line 758
    .line 759
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 760
    .line 761
    .line 762
    move-result-wide v2

    .line 763
    const-string v6, "_sid"

    .line 764
    .line 765
    move-object v5, v4

    .line 766
    const/4 v4, 0x0

    .line 767
    move-object/from16 v18, v5

    .line 768
    .line 769
    const-string v5, "auto"

    .line 770
    .line 771
    move/from16 v20, v14

    .line 772
    .line 773
    move-object/from16 v19, v15

    .line 774
    .line 775
    move-wide/from16 v14, p5

    .line 776
    .line 777
    move-object/from16 p5, v1

    .line 778
    .line 779
    move-object/from16 v1, p0

    .line 780
    .line 781
    invoke-virtual/range {v1 .. v6}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 788
    .line 789
    .line 790
    move-result-wide v2

    .line 791
    const-string v6, "_sno"

    .line 792
    .line 793
    const/4 v4, 0x0

    .line 794
    const-string v5, "auto"

    .line 795
    .line 796
    move-object/from16 v1, p0

    .line 797
    .line 798
    invoke-virtual/range {v1 .. v6}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 805
    .line 806
    .line 807
    move-result-wide v2

    .line 808
    const-string v6, "_se"

    .line 809
    .line 810
    const/4 v4, 0x0

    .line 811
    const-string v5, "auto"

    .line 812
    .line 813
    move-object/from16 v1, p0

    .line 814
    .line 815
    invoke-virtual/range {v1 .. v6}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    move-object v6, v1

    .line 819
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    iget-object v1, v1, LA7/Z;->r:LA7/a0;

    .line 824
    .line 825
    invoke-virtual {v1, v14, v15}, LA7/a0;->f(J)V

    .line 826
    .line 827
    .line 828
    goto :goto_9

    .line 829
    :cond_19
    move-object/from16 v18, v4

    .line 830
    .line 831
    move/from16 v20, v14

    .line 832
    .line 833
    move-object/from16 v19, v15

    .line 834
    .line 835
    :goto_8
    move-wide/from16 v14, p5

    .line 836
    .line 837
    move-object/from16 p5, v1

    .line 838
    .line 839
    goto :goto_9

    .line 840
    :cond_1a
    move-object/from16 v18, v4

    .line 841
    .line 842
    move/from16 v17, v11

    .line 843
    .line 844
    move/from16 v16, v12

    .line 845
    .line 846
    move/from16 v20, v14

    .line 847
    .line 848
    move-object/from16 v19, v15

    .line 849
    .line 850
    move-wide/from16 v11, p3

    .line 851
    .line 852
    goto :goto_8

    .line 853
    :goto_9
    const-string v1, "extend_session"

    .line 854
    .line 855
    invoke-virtual {v9, v1, v14, v15}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 856
    .line 857
    .line 858
    move-result-wide v1

    .line 859
    const-wide/16 v3, 0x1

    .line 860
    .line 861
    cmp-long v1, v1, v3

    .line 862
    .line 863
    if-nez v1, :cond_1b

    .line 864
    .line 865
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    .line 870
    .line 871
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 872
    .line 873
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    iget-object v1, v13, LA7/n0;->k:LA7/x1;

    .line 877
    .line 878
    invoke-static {v1}, LA7/n0;->b(LA7/Y;)V

    .line 879
    .line 880
    .line 881
    iget-object v1, v1, LA7/x1;->e:LY9/c;

    .line 882
    .line 883
    invoke-virtual {v1, v11, v12}, LY9/c;->s(J)V

    .line 884
    .line 885
    .line 886
    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    .line 887
    .line 888
    invoke-virtual {v9}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 893
    .line 894
    .line 895
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 899
    .line 900
    .line 901
    move-result v2

    .line 902
    move/from16 v3, v17

    .line 903
    .line 904
    :goto_a
    if-ge v3, v2, :cond_20

    .line 905
    .line 906
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    add-int/lit8 v3, v3, 0x1

    .line 911
    .line 912
    check-cast v4, Ljava/lang/String;

    .line 913
    .line 914
    if-eqz v4, :cond_1f

    .line 915
    .line 916
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v9, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v5

    .line 923
    instance-of v14, v5, Landroid/os/Bundle;

    .line 924
    .line 925
    if-eqz v14, :cond_1c

    .line 926
    .line 927
    check-cast v5, Landroid/os/Bundle;

    .line 928
    .line 929
    move/from16 v14, v16

    .line 930
    .line 931
    new-array v15, v14, [Landroid/os/Bundle;

    .line 932
    .line 933
    aput-object v5, v15, v17

    .line 934
    .line 935
    move-object v5, v15

    .line 936
    goto :goto_b

    .line 937
    :cond_1c
    instance-of v14, v5, [Landroid/os/Parcelable;

    .line 938
    .line 939
    if-eqz v14, :cond_1d

    .line 940
    .line 941
    check-cast v5, [Landroid/os/Parcelable;

    .line 942
    .line 943
    array-length v14, v5

    .line 944
    const-class v15, [Landroid/os/Bundle;

    .line 945
    .line 946
    invoke-static {v5, v14, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v5

    .line 950
    check-cast v5, [Landroid/os/Bundle;

    .line 951
    .line 952
    goto :goto_b

    .line 953
    :cond_1d
    instance-of v14, v5, Ljava/util/ArrayList;

    .line 954
    .line 955
    if-eqz v14, :cond_1e

    .line 956
    .line 957
    check-cast v5, Ljava/util/ArrayList;

    .line 958
    .line 959
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 960
    .line 961
    .line 962
    move-result v14

    .line 963
    new-array v14, v14, [Landroid/os/Bundle;

    .line 964
    .line 965
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v5

    .line 969
    check-cast v5, [Landroid/os/Bundle;

    .line 970
    .line 971
    goto :goto_b

    .line 972
    :cond_1e
    move-object/from16 v5, v18

    .line 973
    .line 974
    :goto_b
    if-eqz v5, :cond_1f

    .line 975
    .line 976
    invoke-virtual {v9, v4, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 977
    .line 978
    .line 979
    :cond_1f
    const/16 v16, 0x1

    .line 980
    .line 981
    goto :goto_a

    .line 982
    :cond_20
    move/from16 v9, v17

    .line 983
    .line 984
    :goto_c
    invoke-virtual/range {p5 .. p5}, Ljava/util/ArrayList;->size()I

    .line 985
    .line 986
    .line 987
    move-result v1

    .line 988
    if-ge v9, v1, :cond_25

    .line 989
    .line 990
    move-object/from16 v14, p5

    .line 991
    .line 992
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    check-cast v1, Landroid/os/Bundle;

    .line 997
    .line 998
    if-eqz v9, :cond_21

    .line 999
    .line 1000
    const-string v2, "_ep"

    .line 1001
    .line 1002
    goto :goto_d

    .line 1003
    :cond_21
    move-object v2, v8

    .line 1004
    :goto_d
    invoke-virtual {v1, v0, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    if-eqz p7, :cond_22

    .line 1008
    .line 1009
    invoke-virtual {v6}, LA7/B0;->b0()LA7/U1;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    invoke-virtual {v3, v1}, LA7/U1;->n0(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    :cond_22
    move-object v15, v1

    .line 1018
    new-instance v25, LA7/x;

    .line 1019
    .line 1020
    move-object v1, v2

    .line 1021
    new-instance v2, LA7/w;

    .line 1022
    .line 1023
    invoke-direct {v2, v15}, LA7/w;-><init>(Landroid/os/Bundle;)V

    .line 1024
    .line 1025
    .line 1026
    move-object v3, v7

    .line 1027
    move-wide v4, v11

    .line 1028
    move-object v7, v0

    .line 1029
    move-object/from16 v0, v25

    .line 1030
    .line 1031
    invoke-direct/range {v0 .. v5}, LA7/x;-><init>(Ljava/lang/String;LA7/w;Ljava/lang/String;J)V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v13}, LA7/n0;->m()LA7/m1;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v1

    .line 1038
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v1}, LA7/Y;->h0()V

    .line 1045
    .line 1046
    .line 1047
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 1048
    .line 1049
    check-cast v2, LA7/n0;

    .line 1050
    .line 1051
    invoke-virtual {v2}, LA7/n0;->k()LA7/H;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v3

    .line 1062
    move/from16 v4, v17

    .line 1063
    .line 1064
    invoke-virtual {v0, v3, v4}, LA7/x;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v3}, Landroid/os/Parcel;->marshall()[B

    .line 1068
    .line 1069
    .line 1070
    move-result-object v4

    .line 1071
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 1072
    .line 1073
    .line 1074
    array-length v3, v4

    .line 1075
    const/high16 v5, 0x20000

    .line 1076
    .line 1077
    if-le v3, v5, :cond_23

    .line 1078
    .line 1079
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    const-string v3, "Event is too long for local database. Sending event directly to service"

    .line 1084
    .line 1085
    iget-object v2, v2, LA7/N;->g:LA7/P;

    .line 1086
    .line 1087
    invoke-virtual {v2, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    const/16 v24, 0x0

    .line 1091
    .line 1092
    :goto_e
    const/4 v2, 0x1

    .line 1093
    goto :goto_f

    .line 1094
    :cond_23
    const/4 v3, 0x0

    .line 1095
    invoke-virtual {v2, v3, v4}, LA7/H;->l0(I[B)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v4

    .line 1099
    move/from16 v24, v4

    .line 1100
    .line 1101
    goto :goto_e

    .line 1102
    :goto_f
    invoke-virtual {v1, v2}, LA7/m1;->w0(Z)LA7/N1;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v23

    .line 1106
    new-instance v21, LA7/p1;

    .line 1107
    .line 1108
    const/16 v26, 0x1

    .line 1109
    .line 1110
    move-object/from16 v25, v0

    .line 1111
    .line 1112
    move-object/from16 v22, v1

    .line 1113
    .line 1114
    invoke-direct/range {v21 .. v26}, LA7/p1;-><init>(LA7/m1;LA7/N1;ZLf7/a;I)V

    .line 1115
    .line 1116
    .line 1117
    move-object/from16 v1, v21

    .line 1118
    .line 1119
    move-object/from16 v0, v22

    .line 1120
    .line 1121
    invoke-virtual {v0, v1}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 1122
    .line 1123
    .line 1124
    if-nez v20, :cond_24

    .line 1125
    .line 1126
    iget-object v0, v6, LA7/P0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v11

    .line 1132
    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    if-eqz v0, :cond_24

    .line 1137
    .line 1138
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    check-cast v0, LA7/J0;

    .line 1143
    .line 1144
    new-instance v3, Landroid/os/Bundle;

    .line 1145
    .line 1146
    invoke-direct {v3, v15}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1147
    .line 1148
    .line 1149
    move-object/from16 v1, p1

    .line 1150
    .line 1151
    move-wide/from16 v4, p3

    .line 1152
    .line 1153
    move-object v2, v8

    .line 1154
    invoke-interface/range {v0 .. v5}, LA7/J0;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 1155
    .line 1156
    .line 1157
    goto :goto_10

    .line 1158
    :cond_24
    const/16 v16, 0x1

    .line 1159
    .line 1160
    add-int/lit8 v9, v9, 0x1

    .line 1161
    .line 1162
    move-wide/from16 v11, p3

    .line 1163
    .line 1164
    move-object v0, v7

    .line 1165
    move-object/from16 p5, v14

    .line 1166
    .line 1167
    const/16 v17, 0x0

    .line 1168
    .line 1169
    move-object/from16 v7, p1

    .line 1170
    .line 1171
    goto/16 :goto_c

    .line 1172
    .line 1173
    :cond_25
    invoke-virtual {v6}, LA7/B;->f0()LA7/i1;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    const/4 v3, 0x0

    .line 1178
    invoke-virtual {v0, v3}, LA7/i1;->k0(Z)LA7/j1;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    if-eqz v0, :cond_26

    .line 1183
    .line 1184
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    if-eqz v0, :cond_26

    .line 1189
    .line 1190
    invoke-virtual {v6}, LA7/B;->g0()LA7/x1;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v1

    .line 1201
    iget-object v0, v0, LA7/x1;->f:LA7/B1;

    .line 1202
    .line 1203
    const/4 v14, 0x1

    .line 1204
    invoke-virtual {v0, v1, v2, v14, v14}, LA7/B1;->c(JZZ)Z

    .line 1205
    .line 1206
    .line 1207
    :cond_26
    :goto_11
    return-void
.end method

.method public final u0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "name"

    .line 23
    .line 24
    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "creation_timestamp"

    .line 28
    .line 29
    invoke-virtual {v2, p1, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    const-string p1, "expired_event_name"

    .line 35
    .line 36
    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "expired_event_params"

    .line 40
    .line 41
    invoke-virtual {v2, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance p2, LA7/S0;

    .line 49
    .line 50
    const/4 p3, 0x1

    .line 51
    invoke-direct {p2, p0, v2, p3}, LA7/S0;-><init>(LA7/P0;Landroid/os/Bundle;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final v0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/P0;->d:LA7/K0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {p2}, LA7/U1;->j1(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    move v8, v0

    .line 17
    goto :goto_2

    .line 18
    :cond_1
    :goto_1
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :goto_2
    const/4 v9, 0x1

    .line 21
    const/4 v7, 0x1

    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p1

    .line 24
    move-object v3, p2

    .line 25
    move-object v6, p3

    .line 26
    move-wide v4, p4

    .line 27
    invoke-virtual/range {v1 .. v9}, LA7/P0;->t0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 15

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string v0, "app"

    .line 4
    .line 5
    move-object v3, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object/from16 v3, p1

    .line 8
    .line 9
    :goto_0
    if-nez p3, :cond_1

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    move-object v6, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v6, p3

    .line 19
    .line 20
    :goto_1
    const-string v0, "screen_view"

    .line 21
    .line 22
    move-object/from16 v4, p2

    .line 23
    .line 24
    invoke-static {v4, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_d

    .line 30
    .line 31
    invoke-virtual {p0}, LA7/B;->f0()LA7/i1;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    iget-object v2, v5, LA7/i1;->l:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v2

    .line 38
    :try_start_0
    iget-boolean v0, v5, LA7/i1;->k:Z

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v5}, LA7/B0;->zzj()LA7/N;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 47
    .line 48
    const-string v1, "Cannot log screen view event when the app is in the background."

    .line 49
    .line 50
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    monitor-exit v2

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_2
    const-string v0, "screen_name"

    .line 59
    .line 60
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    const/16 v0, 0x1f4

    .line 65
    .line 66
    if-eqz v8, :cond_4

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-lez v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iget-object v4, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, LA7/n0;

    .line 81
    .line 82
    iget-object v4, v4, LA7/n0;->g:LA7/e;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    if-le v3, v0, :cond_4

    .line 88
    .line 89
    :cond_3
    invoke-virtual {v5}, LA7/B0;->zzj()LA7/N;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 94
    .line 95
    const-string v1, "Invalid screen name length for screen view. Length"

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v1, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    monitor-exit v2

    .line 109
    return-void

    .line 110
    :cond_4
    const-string v3, "screen_class"

    .line 111
    .line 112
    invoke-virtual {v6, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-eqz v3, :cond_6

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-lez v4, :cond_5

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    iget-object v7, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v7, LA7/n0;

    .line 131
    .line 132
    iget-object v7, v7, LA7/n0;->g:LA7/e;

    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    if-le v4, v0, :cond_6

    .line 138
    .line 139
    :cond_5
    invoke-virtual {v5}, LA7/B0;->zzj()LA7/N;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 144
    .line 145
    const-string v1, "Invalid screen class length for screen view. Length"

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v0, v1, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    monitor-exit v2

    .line 159
    return-void

    .line 160
    :cond_6
    if-nez v3, :cond_8

    .line 161
    .line 162
    iget-object v0, v5, LA7/i1;->g:Landroid/app/Activity;

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v5, v0}, LA7/i1;->l0(Ljava/lang/Class;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    :goto_2
    move-object v3, v0

    .line 175
    goto :goto_3

    .line 176
    :cond_7
    const-string v0, "Activity"

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_8
    :goto_3
    move-object v9, v3

    .line 180
    iget-object v0, v5, LA7/i1;->c:LA7/j1;

    .line 181
    .line 182
    iget-boolean v3, v5, LA7/i1;->h:Z

    .line 183
    .line 184
    if-eqz v3, :cond_9

    .line 185
    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    iput-boolean v1, v5, LA7/i1;->h:Z

    .line 189
    .line 190
    iget-object v1, v0, LA7/j1;->b:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v1, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    iget-object v0, v0, LA7/j1;->a:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v0, v8}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v1, :cond_9

    .line 203
    .line 204
    if-eqz v0, :cond_9

    .line 205
    .line 206
    invoke-virtual {v5}, LA7/B0;->zzj()LA7/N;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 211
    .line 212
    const-string v1, "Ignoring call to log screen view event with duplicate parameters."

    .line 213
    .line 214
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    monitor-exit v2

    .line 218
    return-void

    .line 219
    :cond_9
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    invoke-virtual {v5}, LA7/B0;->zzj()LA7/N;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 225
    .line 226
    const-string v1, "Logging screen view with name, class"

    .line 227
    .line 228
    if-nez v8, :cond_a

    .line 229
    .line 230
    const-string v2, "null"

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_a
    move-object v2, v8

    .line 234
    :goto_4
    if-nez v9, :cond_b

    .line 235
    .line 236
    const-string v3, "null"

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    move-object v3, v9

    .line 240
    :goto_5
    invoke-virtual {v0, v2, v1, v3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object v0, v5, LA7/i1;->c:LA7/j1;

    .line 244
    .line 245
    if-nez v0, :cond_c

    .line 246
    .line 247
    iget-object v0, v5, LA7/i1;->d:LA7/j1;

    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_c
    iget-object v0, v5, LA7/i1;->c:LA7/j1;

    .line 251
    .line 252
    :goto_6
    new-instance v7, LA7/j1;

    .line 253
    .line 254
    invoke-virtual {v5}, LA7/B0;->b0()LA7/U1;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, LA7/U1;->o1()J

    .line 259
    .line 260
    .line 261
    move-result-wide v10

    .line 262
    const/4 v12, 0x1

    .line 263
    move-wide/from16 v13, p6

    .line 264
    .line 265
    invoke-direct/range {v7 .. v14}, LA7/j1;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    .line 266
    .line 267
    .line 268
    iput-object v7, v5, LA7/i1;->c:LA7/j1;

    .line 269
    .line 270
    iput-object v0, v5, LA7/i1;->d:LA7/j1;

    .line 271
    .line 272
    iput-object v7, v5, LA7/i1;->i:LA7/j1;

    .line 273
    .line 274
    iget-object v1, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, LA7/n0;

    .line 277
    .line 278
    iget-object v1, v1, LA7/n0;->n:Ln7/b;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 284
    .line 285
    .line 286
    move-result-wide v9

    .line 287
    invoke-virtual {v5}, LA7/B0;->zzl()LA7/k0;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    new-instance v4, LA7/v0;

    .line 292
    .line 293
    const/4 v11, 0x2

    .line 294
    move-object v8, v0

    .line 295
    invoke-direct/range {v4 .. v11}, LA7/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v4}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :goto_7
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    throw v0

    .line 304
    :cond_d
    if-eqz p5, :cond_f

    .line 305
    .line 306
    iget-object v0, p0, LA7/P0;->d:LA7/K0;

    .line 307
    .line 308
    if-eqz v0, :cond_f

    .line 309
    .line 310
    invoke-static {v4}, LA7/U1;->j1(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_e

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_e
    move v9, v1

    .line 318
    goto :goto_9

    .line 319
    :cond_f
    :goto_8
    const/4 v0, 0x1

    .line 320
    move v9, v0

    .line 321
    :goto_9
    new-instance v7, Landroid/os/Bundle;

    .line 322
    .line 323
    invoke-direct {v7, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :cond_10
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-eqz v2, :cond_15

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    check-cast v2, Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v7, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    instance-of v6, v5, Landroid/os/Bundle;

    .line 351
    .line 352
    if-eqz v6, :cond_11

    .line 353
    .line 354
    new-instance v6, Landroid/os/Bundle;

    .line 355
    .line 356
    check-cast v5, Landroid/os/Bundle;

    .line 357
    .line 358
    invoke-direct {v6, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v7, v2, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_11
    instance-of v2, v5, [Landroid/os/Parcelable;

    .line 366
    .line 367
    if-eqz v2, :cond_13

    .line 368
    .line 369
    check-cast v5, [Landroid/os/Parcelable;

    .line 370
    .line 371
    move v2, v1

    .line 372
    :goto_b
    array-length v6, v5

    .line 373
    if-ge v2, v6, :cond_10

    .line 374
    .line 375
    aget-object v6, v5, v2

    .line 376
    .line 377
    instance-of v6, v6, Landroid/os/Bundle;

    .line 378
    .line 379
    if-eqz v6, :cond_12

    .line 380
    .line 381
    new-instance v6, Landroid/os/Bundle;

    .line 382
    .line 383
    aget-object v8, v5, v2

    .line 384
    .line 385
    check-cast v8, Landroid/os/Bundle;

    .line 386
    .line 387
    invoke-direct {v6, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 388
    .line 389
    .line 390
    aput-object v6, v5, v2

    .line 391
    .line 392
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_13
    instance-of v2, v5, Ljava/util/List;

    .line 396
    .line 397
    if-eqz v2, :cond_10

    .line 398
    .line 399
    check-cast v5, Ljava/util/List;

    .line 400
    .line 401
    move v2, v1

    .line 402
    :goto_c
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    if-ge v2, v6, :cond_10

    .line 407
    .line 408
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    instance-of v8, v6, Landroid/os/Bundle;

    .line 413
    .line 414
    if-eqz v8, :cond_14

    .line 415
    .line 416
    new-instance v8, Landroid/os/Bundle;

    .line 417
    .line 418
    check-cast v6, Landroid/os/Bundle;

    .line 419
    .line 420
    invoke-direct {v8, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v5, v2, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 427
    .line 428
    goto :goto_c

    .line 429
    :cond_15
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    new-instance v1, LA7/a1;

    .line 434
    .line 435
    move-object v2, p0

    .line 436
    move/from16 v10, p4

    .line 437
    .line 438
    move/from16 v8, p5

    .line 439
    .line 440
    move-wide/from16 v5, p6

    .line 441
    .line 442
    invoke-direct/range {v1 .. v10}, LA7/a1;-><init>(LA7/P0;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZ)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 446
    .line 447
    .line 448
    return-void
.end method

.method public final x0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string v2, "app"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object v2, p1

    .line 7
    :goto_0
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0x18

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    invoke-virtual {v6, p2}, LA7/U1;->W0(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const-string v7, "user property"

    .line 26
    .line 27
    invoke-virtual {v6, v7, p2}, LA7/U1;->e1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    const/4 v9, 0x6

    .line 32
    if-nez v8, :cond_2

    .line 33
    .line 34
    :goto_1
    move v6, v9

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    sget-object v8, LA7/I0;->e:[Ljava/lang/String;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-virtual {v6, v7, v8, v10, p2}, LA7/U1;->S0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_3

    .line 44
    .line 45
    const/16 v6, 0xf

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-virtual {v6, v5, v7, p2}, LA7/U1;->J0(ILjava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    move v6, v4

    .line 56
    :goto_2
    iget-object v7, p0, LA7/P0;->v:Ly3/j;

    .line 57
    .line 58
    iget-object v8, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, LA7/n0;

    .line 61
    .line 62
    const/4 v9, 0x1

    .line 63
    if-eqz v6, :cond_6

    .line 64
    .line 65
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 66
    .line 67
    .line 68
    invoke-static {p2, v5, v9}, LA7/U1;->s0(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    :cond_5
    invoke-virtual {v8}, LA7/n0;->n()V

    .line 79
    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    const-string v3, "_ev"

    .line 83
    .line 84
    move-object/from16 p5, v0

    .line 85
    .line 86
    move-object p2, v2

    .line 87
    move-object p4, v3

    .line 88
    move/from16 p6, v4

    .line 89
    .line 90
    move p3, v6

    .line 91
    move-object p1, v7

    .line 92
    invoke-static/range {p1 .. p6}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_6
    move-object v6, v7

    .line 97
    if-eqz p3, :cond_b

    .line 98
    .line 99
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {v7, p3, p2}, LA7/U1;->h0(Ljava/lang/Object;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_9

    .line 108
    .line 109
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 110
    .line 111
    .line 112
    invoke-static {p2, v5, v9}, LA7/U1;->s0(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    instance-of v3, p3, Ljava/lang/String;

    .line 117
    .line 118
    if-nez v3, :cond_7

    .line 119
    .line 120
    instance-of v3, p3, Ljava/lang/CharSequence;

    .line 121
    .line 122
    if-eqz v3, :cond_8

    .line 123
    .line 124
    :cond_7
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    :cond_8
    invoke-virtual {v8}, LA7/n0;->n()V

    .line 133
    .line 134
    .line 135
    const/4 v0, 0x0

    .line 136
    const-string v3, "_ev"

    .line 137
    .line 138
    move-object p2, v0

    .line 139
    move-object/from16 p5, v2

    .line 140
    .line 141
    move-object p4, v3

    .line 142
    move/from16 p6, v4

    .line 143
    .line 144
    move-object p1, v6

    .line 145
    move p3, v7

    .line 146
    invoke-static/range {p1 .. p6}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_9
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4, p3, p2}, LA7/U1;->c1(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-eqz v4, :cond_a

    .line 159
    .line 160
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    new-instance v0, LA7/v0;

    .line 165
    .line 166
    const/4 v7, 0x1

    .line 167
    move-object v1, p0

    .line 168
    move-object v3, p2

    .line 169
    move-wide/from16 v5, p5

    .line 170
    .line 171
    invoke-direct/range {v0 .. v7}, LA7/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    return-void

    .line 178
    :cond_b
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    new-instance v0, LA7/v0;

    .line 183
    .line 184
    const/4 v4, 0x0

    .line 185
    const/4 v7, 0x1

    .line 186
    move-object v1, p0

    .line 187
    move-object v3, p2

    .line 188
    move-wide/from16 v5, p5

    .line 189
    .line 190
    invoke-direct/range {v0 .. v7}, LA7/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public final y0()Ljava/util/PriorityQueue;
    .locals 3

    .line 1
    iget-object v0, p0, LA7/P0;->l:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/PriorityQueue;

    .line 6
    .line 7
    new-instance v0, LA7/M0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, LA7/R0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, v2}, LA7/R0;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lj$/util/Comparator$-CC;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, LA7/O0;->k(Ljava/util/Comparator;)Ljava/util/PriorityQueue;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LA7/P0;->l:Ljava/util/PriorityQueue;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LA7/P0;->l:Ljava/util/PriorityQueue;

    .line 29
    .line 30
    return-object v0
.end method

.method public final z0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/n0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/n0;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    const-string v1, "google_analytics_deferred_deep_link_enabled"

    .line 20
    .line 21
    iget-object v2, v0, LA7/n0;->g:LA7/e;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "Deferred Deep Link feature enabled."

    .line 40
    .line 41
    iget-object v1, v1, LA7/N;->m:LA7/P;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, LA7/r0;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-direct {v2, v3}, LA7/r0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v2, LA7/r0;->b:LA7/P0;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v2, 0x1

    .line 66
    invoke-virtual {v1, v2}, LA7/m1;->w0(Z)LA7/N1;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, LA7/n0;

    .line 73
    .line 74
    invoke-virtual {v3}, LA7/n0;->k()LA7/H;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/4 v4, 0x0

    .line 79
    new-array v5, v4, [B

    .line 80
    .line 81
    const/4 v6, 0x3

    .line 82
    invoke-virtual {v3, v6, v5}, LA7/H;->l0(I[B)Z

    .line 83
    .line 84
    .line 85
    new-instance v3, LA7/q1;

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    invoke-direct {v3, v1, v2, v5}, LA7/q1;-><init>(LA7/m1;LA7/N1;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 92
    .line 93
    .line 94
    iput-boolean v4, p0, LA7/P0;->r:Z

    .line 95
    .line 96
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1}, LA7/B0;->c0()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/4 v3, 0x0

    .line 108
    const-string v4, "previous_os_version"

    .line 109
    .line 110
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, LA7/n0;

    .line 117
    .line 118
    invoke-virtual {v3}, LA7/n0;->i()LA7/q;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, LA7/D0;->e0()V

    .line 123
    .line 124
    .line 125
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-nez v5, :cond_2

    .line 132
    .line 133
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_2

    .line 138
    .line 139
    invoke-virtual {v1}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 151
    .line 152
    .line 153
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-nez v1, :cond_3

    .line 158
    .line 159
    invoke-virtual {v0}, LA7/n0;->i()LA7/q;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, LA7/D0;->e0()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_3

    .line 171
    .line 172
    new-instance v0, Landroid/os/Bundle;

    .line 173
    .line 174
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v1, "_po"

    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "auto"

    .line 183
    .line 184
    const-string v2, "_ou"

    .line 185
    .line 186
    invoke-virtual {p0, v1, v2, v0}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 187
    .line 188
    .line 189
    :cond_3
    :goto_0
    return-void
.end method
