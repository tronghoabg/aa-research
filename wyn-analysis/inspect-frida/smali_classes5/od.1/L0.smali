.class public final Lod/L0;
.super Lmd/e;
.source "SourceFile"


# instance fields
.field public final d:LDd/c;

.field public final e:Lmd/F;

.field public final f:Lod/k;

.field public final g:Lod/m;

.field public h:Ljava/util/List;

.field public i:Lod/o0;

.field public j:Z

.field public k:Z

.field public l:Lba/a;

.field public final synthetic m:Lod/M0;


# direct methods
.method public constructor <init>(Lod/M0;LDd/c;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/L0;->m:Lod/M0;

    .line 5
    .line 6
    iget-object v0, p2, LDd/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Lod/L0;->h:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lod/L0;->d:LDd/c;

    .line 16
    .line 17
    iget-object p2, p1, Lod/M0;->t:Lmd/d;

    .line 18
    .line 19
    invoke-virtual {p2}, Lmd/d;->g()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance v1, Lmd/F;

    .line 24
    .line 25
    sget-object v2, Lmd/F;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-string v4, "Subchannel"

    .line 32
    .line 33
    invoke-direct {v1, v4, p2, v2, v3}, Lmd/F;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lod/L0;->e:Lmd/F;

    .line 37
    .line 38
    new-instance p2, Lod/m;

    .line 39
    .line 40
    iget-object p1, p1, Lod/M0;->l:Lod/Y1;

    .line 41
    .line 42
    invoke-virtual {p1}, Lod/Y1;->d()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v5, "Subchannel for "

    .line 49
    .line 50
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-direct {p2, v1, v2, v3, v0}, Lod/m;-><init>(Lmd/F;JLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lod/L0;->g:Lod/m;

    .line 64
    .line 65
    new-instance v0, Lod/k;

    .line 66
    .line 67
    invoke-direct {v0, p2, p1}, Lod/k;-><init>(Lod/m;Lod/Y1;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lod/L0;->f:Lod/k;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lod/L0;->m:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lod/L0;->j:Z

    .line 9
    .line 10
    const-string v1, "not started"

    .line 11
    .line 12
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lod/L0;->h:Ljava/util/List;

    .line 16
    .line 17
    return-object v0
.end method

.method public final c()Lmd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/L0;->d:LDd/c;

    .line 2
    .line 3
    iget-object v0, v0, LDd/c;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lmd/b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final d()Lmd/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/L0;->f:Lod/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lod/L0;->j:Z

    .line 2
    .line 3
    const-string v1, "Subchannel is not started"

    .line 4
    .line 5
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lod/L0;->i:Lod/o0;

    .line 9
    .line 10
    return-object v0
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Lod/L0;->m:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lod/L0;->j:Z

    .line 9
    .line 10
    const-string v1, "not started"

    .line 11
    .line 12
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lod/L0;->i:Lod/o0;

    .line 16
    .line 17
    iget-object v1, v0, Lod/o0;->v:Lod/k0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v1, v0, Lod/o0;->k:Lmd/n0;

    .line 23
    .line 24
    new-instance v2, Lod/h0;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v0, v3}, Lod/h0;-><init>(Lod/o0;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final p()V
    .locals 8

    .line 1
    iget-object v0, p0, Lod/L0;->m:Lod/M0;

    .line 2
    .line 3
    iget-object v1, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lod/L0;->i:Lod/o0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-boolean v2, p0, Lod/L0;->k:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v1, p0, Lod/L0;->k:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-boolean v1, v0, Lod/M0;->I:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, p0, Lod/L0;->l:Lba/a;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lba/a;->j()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lod/L0;->l:Lba/a;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void

    .line 36
    :cond_2
    iput-boolean v2, p0, Lod/L0;->k:Z

    .line 37
    .line 38
    :goto_0
    iget-boolean v1, v0, Lod/M0;->I:Z

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    new-instance v3, Lod/v0;

    .line 43
    .line 44
    new-instance v1, Lg5/d;

    .line 45
    .line 46
    const/16 v2, 0xa

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v1}, Lod/v0;-><init>(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 55
    .line 56
    iget-object v1, v0, Lod/M0;->f:Lod/j;

    .line 57
    .line 58
    iget-object v1, v1, Lod/j;->a:Lpd/g;

    .line 59
    .line 60
    iget-object v7, v1, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    .line 62
    const-wide/16 v4, 0x5

    .line 63
    .line 64
    iget-object v2, v0, Lod/M0;->m:Lmd/n0;

    .line 65
    .line 66
    invoke-virtual/range {v2 .. v7}, Lmd/n0;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lba/a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lod/L0;->l:Lba/a;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    iget-object v0, p0, Lod/L0;->i:Lod/o0;

    .line 74
    .line 75
    sget-object v1, Lod/M0;->g0:Lmd/k0;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v2, Lod/i0;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    invoke-direct {v2, v0, v1, v3}, Lod/i0;-><init>(Lod/o0;Lmd/k0;I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v0, Lod/o0;->k:Lmd/n0;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final q(Lmd/N;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lod/L0;->m:Lod/M0;

    .line 4
    .line 5
    iget-object v2, v1, Lod/M0;->m:Lmd/n0;

    .line 6
    .line 7
    invoke-virtual {v2}, Lmd/n0;->e()V

    .line 8
    .line 9
    .line 10
    iget-boolean v2, v0, Lod/L0;->j:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    xor-int/2addr v2, v3

    .line 14
    const-string v4, "already started"

    .line 15
    .line 16
    invoke-static {v4, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean v2, v0, Lod/L0;->k:Z

    .line 20
    .line 21
    xor-int/2addr v2, v3

    .line 22
    const-string v4, "already shutdown"

    .line 23
    .line 24
    invoke-static {v4, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iget-boolean v2, v1, Lod/M0;->I:Z

    .line 28
    .line 29
    xor-int/2addr v2, v3

    .line 30
    const-string v4, "Channel is being terminated"

    .line 31
    .line 32
    invoke-static {v4, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    iput-boolean v3, v0, Lod/L0;->j:Z

    .line 36
    .line 37
    new-instance v5, Lod/o0;

    .line 38
    .line 39
    iget-object v2, v0, Lod/L0;->d:LDd/c;

    .line 40
    .line 41
    iget-object v2, v2, LDd/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v6, v2

    .line 44
    check-cast v6, Ljava/util/List;

    .line 45
    .line 46
    iget-object v2, v1, Lod/M0;->t:Lmd/d;

    .line 47
    .line 48
    invoke-virtual {v2}, Lmd/d;->g()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    iget-object v9, v1, Lod/M0;->f:Lod/j;

    .line 53
    .line 54
    iget-object v2, v9, Lod/j;->a:Lpd/g;

    .line 55
    .line 56
    iget-object v10, v2, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    new-instance v13, Lod/a2;

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    move-object/from16 v3, p1

    .line 62
    .line 63
    invoke-direct {v13, v2, v0, v3}, Lod/a2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v1, Lod/M0;->L:Lod/Y1;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v15, LVa/X7;

    .line 72
    .line 73
    invoke-direct {v15}, LVa/X7;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v2, v1, Lod/M0;->u:Ljava/util/ArrayList;

    .line 77
    .line 78
    iget-object v3, v0, Lod/L0;->e:Lmd/F;

    .line 79
    .line 80
    iget-object v4, v0, Lod/L0;->f:Lod/k;

    .line 81
    .line 82
    iget-object v8, v1, Lod/M0;->s:Lod/Y1;

    .line 83
    .line 84
    iget-object v11, v1, Lod/M0;->p:Lod/Y;

    .line 85
    .line 86
    iget-object v12, v1, Lod/M0;->m:Lmd/n0;

    .line 87
    .line 88
    iget-object v14, v1, Lod/M0;->P:Lmd/C;

    .line 89
    .line 90
    move-object/from16 v19, v2

    .line 91
    .line 92
    iget-object v2, v0, Lod/L0;->g:Lod/m;

    .line 93
    .line 94
    move-object/from16 v16, v2

    .line 95
    .line 96
    move-object/from16 v17, v3

    .line 97
    .line 98
    move-object/from16 v18, v4

    .line 99
    .line 100
    invoke-direct/range {v5 .. v19}, Lod/o0;-><init>(Ljava/util/List;Ljava/lang/String;Lod/Y1;Lod/j;Ljava/util/concurrent/ScheduledExecutorService;Lod/Y;Lmd/n0;Lod/a2;Lmd/C;LVa/X7;Lod/m;Lmd/F;Lmd/e;Ljava/util/ArrayList;)V

    .line 101
    .line 102
    .line 103
    sget-object v7, Lmd/A;->a:Lmd/A;

    .line 104
    .line 105
    iget-object v2, v1, Lod/M0;->l:Lod/Y1;

    .line 106
    .line 107
    invoke-virtual {v2}, Lod/Y1;->d()J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    move-object v10, v5

    .line 112
    new-instance v5, Lmd/B;

    .line 113
    .line 114
    const-string v6, "Child Subchannel started"

    .line 115
    .line 116
    invoke-direct/range {v5 .. v10}, Lmd/B;-><init>(Ljava/lang/String;Lmd/A;JLod/o0;)V

    .line 117
    .line 118
    .line 119
    move-object v2, v5

    .line 120
    move-object v5, v10

    .line 121
    iget-object v3, v1, Lod/M0;->N:Lod/m;

    .line 122
    .line 123
    invoke-virtual {v3, v2}, Lod/m;->b(Lmd/B;)V

    .line 124
    .line 125
    .line 126
    iput-object v5, v0, Lod/L0;->i:Lod/o0;

    .line 127
    .line 128
    iget-object v2, v1, Lod/M0;->P:Lmd/C;

    .line 129
    .line 130
    iget-object v2, v2, Lmd/C;->b:Lj$/util/concurrent/ConcurrentHashMap;

    .line 131
    .line 132
    invoke-virtual {v5}, Lod/o0;->f()Lmd/F;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iget-wide v3, v3, Lmd/F;->c:J

    .line 137
    .line 138
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Lmd/E;

    .line 147
    .line 148
    iget-object v1, v1, Lod/M0;->A:Ljava/util/HashSet;

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final r(Ljava/util/List;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lod/L0;->m:Lod/M0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/M0;->m:Lmd/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lod/L0;->h:Ljava/util/List;

    .line 9
    .line 10
    iget-object v0, p0, Lod/L0;->i:Lod/o0;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "newAddressGroups contains null entry"

    .line 30
    .line 31
    invoke-static {v2, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    xor-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    const-string v2, "newAddressGroups is empty"

    .line 42
    .line 43
    invoke-static {v2, v1}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v1, Lod/A;

    .line 56
    .line 57
    const/16 v2, 0xe

    .line 58
    .line 59
    invoke-direct {v1, v2, v0, p1}, Lod/A;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, v0, Lod/o0;->k:Lmd/n0;

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/L0;->e:Lmd/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/F;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
