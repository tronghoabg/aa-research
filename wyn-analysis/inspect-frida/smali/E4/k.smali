.class public final LE4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE4/g;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LZ4/b;


# instance fields
.field public volatile A:Z

.field public B:I

.field public C:I

.field public D:I

.field public final a:LE4/i;

.field public final b:Ljava/util/ArrayList;

.field public final c:LZ4/e;

.field public final d:Ld7/j;

.field public final e:LDd/c;

.field public final f:Lb7/k;

.field public final g:LE4/j;

.field public h:Lcom/bumptech/glide/c;

.field public i:LB4/d;

.field public j:Lcom/bumptech/glide/d;

.field public k:LE4/t;

.field public l:I

.field public m:I

.field public n:LE4/m;

.field public o:LB4/g;

.field public p:LE4/s;

.field public q:I

.field public r:J

.field public s:Ljava/lang/Object;

.field public t:Ljava/lang/Thread;

.field public u:LB4/d;

.field public v:LB4/d;

.field public w:Ljava/lang/Object;

.field public x:LC4/e;

.field public volatile y:LE4/h;

.field public volatile z:Z


# direct methods
.method public constructor <init>(Ld7/j;LDd/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE4/i;

    .line 5
    .line 6
    invoke-direct {v0}, LE4/i;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE4/k;->a:LE4/i;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, LZ4/e;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LE4/k;->c:LZ4/e;

    .line 24
    .line 25
    new-instance v0, Lb7/k;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, v1, v2}, Lb7/k;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LE4/k;->f:Lb7/k;

    .line 33
    .line 34
    new-instance v0, LE4/j;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LE4/k;->g:LE4/j;

    .line 40
    .line 41
    iput-object p1, p0, LE4/k;->d:Ld7/j;

    .line 42
    .line 43
    iput-object p2, p0, LE4/k;->e:LDd/c;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(LB4/d;Ljava/lang/Object;LC4/e;ILB4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE4/k;->u:LB4/d;

    .line 2
    .line 3
    iput-object p2, p0, LE4/k;->w:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LE4/k;->x:LC4/e;

    .line 6
    .line 7
    iput p4, p0, LE4/k;->D:I

    .line 8
    .line 9
    iput-object p5, p0, LE4/k;->v:LB4/d;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, LE4/k;->t:Ljava/lang/Thread;

    .line 16
    .line 17
    if-eq p1, p2, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    iput p1, p0, LE4/k;->C:I

    .line 21
    .line 22
    iget-object p1, p0, LE4/k;->p:LE4/s;

    .line 23
    .line 24
    iget-boolean p2, p1, LE4/s;->m:Z

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, LE4/s;->i:LH4/c;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p1, LE4/s;->h:LH4/c;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p1, p0}, LH4/c;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p0}, LE4/k;->f()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final b(LB4/d;Ljava/lang/Exception;LC4/e;I)V
    .locals 2

    .line 1
    invoke-interface {p3}, LC4/e;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE4/w;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const-string v1, "Fetching data failed"

    .line 11
    .line 12
    invoke-direct {v0, v1, p2}, LE4/w;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, LC4/e;->b()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p1, v0, LE4/w;->b:LB4/d;

    .line 20
    .line 21
    iput p4, v0, LE4/w;->c:I

    .line 22
    .line 23
    iput-object p2, v0, LE4/w;->d:Ljava/lang/Class;

    .line 24
    .line 25
    iget-object p1, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p0, LE4/k;->t:Ljava/lang/Thread;

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    iput p1, p0, LE4/k;->C:I

    .line 40
    .line 41
    iget-object p1, p0, LE4/k;->p:LE4/s;

    .line 42
    .line 43
    iget-boolean p2, p1, LE4/s;->m:Z

    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, LE4/s;->i:LH4/c;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p1, LE4/s;->h:LH4/c;

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, p0}, LH4/c;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {p0}, LE4/k;->p()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c()LZ4/e;
    .locals 1

    .line 1
    iget-object v0, p0, LE4/k;->c:LZ4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, LE4/k;

    .line 2
    .line 3
    iget-object v0, p0, LE4/k;->j:Lcom/bumptech/glide/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, LE4/k;->j:Lcom/bumptech/glide/d;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, LE4/k;->q:I

    .line 19
    .line 20
    iget p1, p1, LE4/k;->q:I

    .line 21
    .line 22
    sub-int/2addr v0, p1

    .line 23
    :cond_0
    return v0
.end method

.method public final d(LC4/e;Ljava/lang/Object;I)LE4/B;
    .locals 5

    .line 1
    const-string v0, "Decoded result "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, LC4/e;->a()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    sget v2, LY4/i;->b:I

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p0, p3, p2}, LE4/k;->e(ILjava/lang/Object;)LE4/B;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "DecodeJob"

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p0, v2, v3, p3, v1}, LE4/k;->i(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {p1}, LC4/e;->a()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :goto_1
    invoke-interface {p1}, LC4/e;->a()V

    .line 52
    .line 53
    .line 54
    throw p2
.end method

.method public final e(ILjava/lang/Object;)LE4/B;
    .locals 8

    .line 1
    iget-object v0, p0, LE4/k;->a:LE4/i;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, LE4/i;->c(Ljava/lang/Class;)LE4/z;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, LE4/k;->o:LB4/g;

    .line 12
    .line 13
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    if-ge v1, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    const/4 v1, 0x4

    .line 22
    if-eq p1, v1, :cond_3

    .line 23
    .line 24
    iget-object v1, p0, LE4/k;->a:LE4/i;

    .line 25
    .line 26
    iget-boolean v1, v1, LE4/i;->r:Z

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 v1, 0x0

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 34
    :goto_2
    sget-object v3, LL4/m;->i:LB4/f;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, LB4/g;->c(LB4/f;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/lang/Boolean;

    .line 41
    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    new-instance v0, LB4/g;

    .line 54
    .line 55
    invoke-direct {v0}, LB4/g;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, LE4/k;->o:LB4/g;

    .line 59
    .line 60
    iget-object v5, v0, LB4/g;->b:LY4/d;

    .line 61
    .line 62
    iget-object v4, v4, LB4/g;->b:LY4/d;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, LY4/d;->h(Lx/v;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v4, v0, LB4/g;->b:LY4/d;

    .line 72
    .line 73
    invoke-virtual {v4, v3, v1}, LY4/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_3
    iget-object v0, p0, LE4/k;->h:Lcom/bumptech/glide/c;

    .line 78
    .line 79
    iget-object v0, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/f;

    .line 80
    .line 81
    iget-object v0, v0, Lcom/bumptech/glide/f;->e:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v1, v0

    .line 84
    check-cast v1, LC4/i;

    .line 85
    .line 86
    monitor-enter v1

    .line 87
    :try_start_0
    iget-object v0, v1, LC4/i;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/util/HashMap;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, LC4/f;

    .line 100
    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    iget-object v3, v1, LC4/i;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_6

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, LC4/f;

    .line 126
    .line 127
    invoke-interface {v4}, LC4/f;->b()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_5

    .line 140
    .line 141
    move-object v0, v4

    .line 142
    goto :goto_4

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move-object p1, v0

    .line 145
    goto :goto_5

    .line 146
    :cond_6
    :goto_4
    if-nez v0, :cond_7

    .line 147
    .line 148
    sget-object v0, LC4/i;->c:LC4/h;

    .line 149
    .line 150
    :cond_7
    invoke-interface {v0, p2}, LC4/f;->a(Ljava/lang/Object;)LC4/g;

    .line 151
    .line 152
    .line 153
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    monitor-exit v1

    .line 155
    :try_start_1
    iget v3, p0, LE4/k;->l:I

    .line 156
    .line 157
    iget v4, p0, LE4/k;->m:I

    .line 158
    .line 159
    new-instance v5, LA/x;

    .line 160
    .line 161
    const/4 p2, 0x2

    .line 162
    invoke-direct {v5, p0, p1, p2}, LA/x;-><init>(Ljava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v2 .. v7}, LE4/z;->a(IILA/x;LB4/g;LC4/g;)LE4/B;

    .line 166
    .line 167
    .line 168
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    invoke-interface {v7}, LC4/g;->a()V

    .line 170
    .line 171
    .line 172
    return-object p1

    .line 173
    :catchall_1
    move-exception v0

    .line 174
    move-object p1, v0

    .line 175
    invoke-interface {v7}, LC4/g;->a()V

    .line 176
    .line 177
    .line 178
    throw p1

    .line 179
    :goto_5
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 180
    throw p1
.end method

.method public final f()V
    .locals 9

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Retrieved data"

    .line 11
    .line 12
    iget-wide v1, p0, LE4/k;->r:J

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "data: "

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, LE4/k;->w:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v4, ", cache key: "

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v4, p0, LE4/k;->u:LB4/d;

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, ", fetcher: "

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, LE4/k;->x:LC4/e;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0, v1, v2, v0, v3}, LE4/k;->i(JLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :try_start_0
    iget-object v1, p0, LE4/k;->x:LC4/e;

    .line 55
    .line 56
    iget-object v2, p0, LE4/k;->w:Ljava/lang/Object;

    .line 57
    .line 58
    iget v3, p0, LE4/k;->D:I

    .line 59
    .line 60
    invoke-virtual {p0, v1, v2, v3}, LE4/k;->d(LC4/e;Ljava/lang/Object;I)LE4/B;

    .line 61
    .line 62
    .line 63
    move-result-object v1
    :try_end_0
    .catch LE4/w; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v1

    .line 66
    iget-object v2, p0, LE4/k;->v:LB4/d;

    .line 67
    .line 68
    iget v3, p0, LE4/k;->D:I

    .line 69
    .line 70
    iput-object v2, v1, LE4/w;->b:LB4/d;

    .line 71
    .line 72
    iput v3, v1, LE4/w;->c:I

    .line 73
    .line 74
    iput-object v0, v1, LE4/w;->d:Ljava/lang/Class;

    .line 75
    .line 76
    iget-object v2, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-object v1, v0

    .line 82
    :goto_0
    if-eqz v1, :cond_7

    .line 83
    .line 84
    iget v2, p0, LE4/k;->D:I

    .line 85
    .line 86
    instance-of v3, v1, LE4/x;

    .line 87
    .line 88
    if-eqz v3, :cond_1

    .line 89
    .line 90
    move-object v3, v1

    .line 91
    check-cast v3, LE4/x;

    .line 92
    .line 93
    invoke-interface {v3}, LE4/x;->initialize()V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object v3, p0, LE4/k;->f:Lb7/k;

    .line 97
    .line 98
    iget-object v3, v3, Lb7/k;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, LE4/A;

    .line 101
    .line 102
    const/4 v4, 0x1

    .line 103
    const/4 v5, 0x0

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    sget-object v0, LE4/A;->e:LDd/c;

    .line 107
    .line 108
    invoke-virtual {v0}, LDd/c;->z()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, LE4/A;

    .line 113
    .line 114
    iput-boolean v5, v0, LE4/A;->d:Z

    .line 115
    .line 116
    iput-boolean v4, v0, LE4/A;->c:Z

    .line 117
    .line 118
    iput-object v1, v0, LE4/A;->b:LE4/B;

    .line 119
    .line 120
    move-object v1, v0

    .line 121
    :cond_2
    invoke-virtual {p0}, LE4/k;->r()V

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, LE4/k;->p:LE4/s;

    .line 125
    .line 126
    monitor-enter v3

    .line 127
    :try_start_1
    iput-object v1, v3, LE4/s;->n:LE4/B;

    .line 128
    .line 129
    iput v2, v3, LE4/s;->o:I

    .line 130
    .line 131
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 132
    invoke-virtual {v3}, LE4/s;->h()V

    .line 133
    .line 134
    .line 135
    const/4 v1, 0x5

    .line 136
    iput v1, p0, LE4/k;->B:I

    .line 137
    .line 138
    :try_start_2
    iget-object v1, p0, LE4/k;->f:Lb7/k;

    .line 139
    .line 140
    iget-object v2, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, LE4/A;

    .line 143
    .line 144
    if-eqz v2, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    move v4, v5

    .line 148
    :goto_1
    if-eqz v4, :cond_4

    .line 149
    .line 150
    iget-object v2, p0, LE4/k;->d:Ld7/j;

    .line 151
    .line 152
    iget-object v3, p0, LE4/k;->o:LB4/g;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    .line 156
    .line 157
    :try_start_3
    invoke-virtual {v2}, Ld7/j;->a()LG4/a;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v4, v1, Lb7/k;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v4, LB4/d;

    .line 164
    .line 165
    new-instance v5, LG9/e;

    .line 166
    .line 167
    iget-object v6, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v6, LB4/j;

    .line 170
    .line 171
    iget-object v7, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v7, LE4/A;

    .line 174
    .line 175
    const/4 v8, 0x3

    .line 176
    invoke-direct {v5, v6, v7, v3, v8}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    invoke-interface {v2, v4, v5}, LG4/a;->f(LB4/d;LG9/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 180
    .line 181
    .line 182
    :try_start_4
    iget-object v1, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, LE4/A;

    .line 185
    .line 186
    invoke-virtual {v1}, LE4/A;->d()V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :catchall_0
    move-exception v2

    .line 191
    iget-object v1, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v1, LE4/A;

    .line 194
    .line 195
    invoke-virtual {v1}, LE4/A;->d()V

    .line 196
    .line 197
    .line 198
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 199
    :catchall_1
    move-exception v1

    .line 200
    goto :goto_3

    .line 201
    :cond_4
    :goto_2
    if-eqz v0, :cond_5

    .line 202
    .line 203
    invoke-virtual {v0}, LE4/A;->d()V

    .line 204
    .line 205
    .line 206
    :cond_5
    invoke-virtual {p0}, LE4/k;->k()V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :goto_3
    if-eqz v0, :cond_6

    .line 211
    .line 212
    invoke-virtual {v0}, LE4/A;->d()V

    .line 213
    .line 214
    .line 215
    :cond_6
    throw v1

    .line 216
    :catchall_2
    move-exception v0

    .line 217
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 218
    throw v0

    .line 219
    :cond_7
    invoke-virtual {p0}, LE4/k;->p()V

    .line 220
    .line 221
    .line 222
    :goto_4
    return-void
.end method

.method public final g()LE4/h;
    .locals 3

    .line 1
    iget v0, p0, LE4/k;->B:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, LE4/k;->a:LE4/i;

    .line 9
    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    iget v1, p0, LE4/k;->B:I

    .line 26
    .line 27
    invoke-static {v1}, LA7/p0;->z(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "Unrecognized stage: "

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_1
    new-instance v0, LE4/G;

    .line 42
    .line 43
    invoke-direct {v0, v2, p0}, LE4/G;-><init>(LE4/i;LE4/k;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    new-instance v0, LE4/e;

    .line 48
    .line 49
    invoke-virtual {v2}, LE4/i;->a()Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1, v2, p0}, LE4/e;-><init>(Ljava/util/List;LE4/i;LE4/g;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    new-instance v0, LE4/C;

    .line 58
    .line 59
    invoke-direct {v0, v2, p0}, LE4/C;-><init>(LE4/i;LE4/k;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method public final h(I)I
    .locals 4

    .line 1
    invoke-static {p1}, LA/f;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x3

    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    invoke-static {p1}, LA7/p0;->z(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v1, "Unrecognized stage: "

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x6

    .line 37
    return p1

    .line 38
    :cond_2
    const/4 p1, 0x4

    .line 39
    return p1

    .line 40
    :cond_3
    iget-object p1, p0, LE4/k;->n:LE4/m;

    .line 41
    .line 42
    iget p1, p1, LE4/m;->a:I

    .line 43
    .line 44
    packed-switch p1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    :pswitch_0
    const/4 p1, 0x1

    .line 48
    goto :goto_1

    .line 49
    :pswitch_1
    const/4 p1, 0x0

    .line 50
    :goto_1
    if-eqz p1, :cond_4

    .line 51
    .line 52
    return v3

    .line 53
    :cond_4
    invoke-virtual {p0, v3}, LE4/k;->h(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    return p1

    .line 58
    :cond_5
    iget-object p1, p0, LE4/k;->n:LE4/m;

    .line 59
    .line 60
    iget p1, p1, LE4/m;->a:I

    .line 61
    .line 62
    packed-switch p1, :pswitch_data_1

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x1

    .line 66
    goto :goto_2

    .line 67
    :pswitch_2
    const/4 p1, 0x0

    .line 68
    :goto_2
    if-eqz p1, :cond_6

    .line 69
    .line 70
    return v1

    .line 71
    :cond_6
    invoke-virtual {p0, v1}, LE4/k;->h(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final i(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p3, v0}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p1, p2}, LY4/i;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, ", load key: "

    .line 15
    .line 16
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LE4/k;->k:LE4/t;

    .line 20
    .line 21
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    if-eqz p4, :cond_0

    .line 25
    .line 26
    const-string p1, ", "

    .line 27
    .line 28
    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p1, ""

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, ", thread: "

    .line 39
    .line 40
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "DecodeJob"

    .line 59
    .line 60
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE4/k;->r()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE4/w;

    .line 5
    .line 6
    const-string v1, "Failed to load resource"

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LE4/w;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LE4/k;->p:LE4/s;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iput-object v0, v1, LE4/s;->q:LE4/w;

    .line 22
    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {v1}, LE4/s;->g()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, LE4/k;->l()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, LE4/k;->g:LE4/j;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, v0, LE4/j;->b:Z

    .line 6
    .line 7
    invoke-virtual {v0}, LE4/j;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE4/k;->n()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v1
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, LE4/k;->g:LE4/j;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, v0, LE4/j;->c:Z

    .line 6
    .line 7
    invoke-virtual {v0}, LE4/j;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE4/k;->n()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v1
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, LE4/k;->g:LE4/j;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, v0, LE4/j;->a:Z

    .line 6
    .line 7
    invoke-virtual {v0}, LE4/j;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LE4/k;->n()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v1
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, LE4/k;->g:LE4/j;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, LE4/j;->b:Z

    .line 6
    .line 7
    iput-boolean v1, v0, LE4/j;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, LE4/j;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    iget-object v0, p0, LE4/k;->f:Lb7/k;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v2, v0, Lb7/k;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, LE4/k;->a:LE4/i;

    .line 22
    .line 23
    iput-object v2, v0, LE4/i;->c:Lcom/bumptech/glide/c;

    .line 24
    .line 25
    iput-object v2, v0, LE4/i;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, v0, LE4/i;->n:LB4/d;

    .line 28
    .line 29
    iput-object v2, v0, LE4/i;->g:Ljava/lang/Class;

    .line 30
    .line 31
    iput-object v2, v0, LE4/i;->k:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v2, v0, LE4/i;->i:LB4/g;

    .line 34
    .line 35
    iput-object v2, v0, LE4/i;->o:Lcom/bumptech/glide/d;

    .line 36
    .line 37
    iput-object v2, v0, LE4/i;->j:LY4/d;

    .line 38
    .line 39
    iput-object v2, v0, LE4/i;->p:LE4/m;

    .line 40
    .line 41
    iget-object v3, v0, LE4/i;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, v0, LE4/i;->l:Z

    .line 47
    .line 48
    iget-object v3, v0, LE4/i;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v0, LE4/i;->m:Z

    .line 54
    .line 55
    iput-boolean v1, p0, LE4/k;->z:Z

    .line 56
    .line 57
    iput-object v2, p0, LE4/k;->h:Lcom/bumptech/glide/c;

    .line 58
    .line 59
    iput-object v2, p0, LE4/k;->i:LB4/d;

    .line 60
    .line 61
    iput-object v2, p0, LE4/k;->o:LB4/g;

    .line 62
    .line 63
    iput-object v2, p0, LE4/k;->j:Lcom/bumptech/glide/d;

    .line 64
    .line 65
    iput-object v2, p0, LE4/k;->k:LE4/t;

    .line 66
    .line 67
    iput-object v2, p0, LE4/k;->p:LE4/s;

    .line 68
    .line 69
    iput v1, p0, LE4/k;->B:I

    .line 70
    .line 71
    iput-object v2, p0, LE4/k;->y:LE4/h;

    .line 72
    .line 73
    iput-object v2, p0, LE4/k;->t:Ljava/lang/Thread;

    .line 74
    .line 75
    iput-object v2, p0, LE4/k;->u:LB4/d;

    .line 76
    .line 77
    iput-object v2, p0, LE4/k;->w:Ljava/lang/Object;

    .line 78
    .line 79
    iput v1, p0, LE4/k;->D:I

    .line 80
    .line 81
    iput-object v2, p0, LE4/k;->x:LC4/e;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    iput-wide v3, p0, LE4/k;->r:J

    .line 86
    .line 87
    iput-boolean v1, p0, LE4/k;->A:Z

    .line 88
    .line 89
    iput-object v2, p0, LE4/k;->s:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v0, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, LE4/k;->e:LDd/c;

    .line 97
    .line 98
    invoke-virtual {v0, p0}, LDd/c;->O(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception v1

    .line 103
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw v1
.end method

.method public final o()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, LE4/k;->C:I

    .line 3
    .line 4
    iget-object v0, p0, LE4/k;->p:LE4/s;

    .line 5
    .line 6
    iget-boolean v1, v0, LE4/s;->m:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, LE4/s;->i:LH4/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, v0, LE4/s;->h:LH4/c;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, p0}, LH4/c;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, LE4/k;->t:Ljava/lang/Thread;

    .line 6
    .line 7
    sget v0, LY4/i;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, LE4/k;->r:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-boolean v1, p0, LE4/k;->A:Z

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, LE4/k;->y:LE4/h;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, LE4/k;->y:LE4/h;

    .line 25
    .line 26
    invoke-interface {v0}, LE4/h;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget v1, p0, LE4/k;->B:I

    .line 33
    .line 34
    invoke-virtual {p0, v1}, LE4/k;->h(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, LE4/k;->B:I

    .line 39
    .line 40
    invoke-virtual {p0}, LE4/k;->g()LE4/h;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, LE4/k;->y:LE4/h;

    .line 45
    .line 46
    iget v1, p0, LE4/k;->B:I

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {p0}, LE4/k;->o()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget v1, p0, LE4/k;->B:I

    .line 56
    .line 57
    const/4 v2, 0x6

    .line 58
    if-eq v1, v2, :cond_2

    .line 59
    .line 60
    iget-boolean v1, p0, LE4/k;->A:Z

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    :cond_2
    if-nez v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, LE4/k;->j()V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    iget v0, p0, LE4/k;->C:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LE4/k;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    iget v1, p0, LE4/k;->C:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq v1, v2, :cond_3

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq v1, v2, :cond_2

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    if-eq v1, v2, :cond_1

    .line 31
    .line 32
    const-string v1, "null"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v1, "DECODE_DATA"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const-string v1, "SWITCH_TO_SOURCE_SERVICE"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const-string v1, "INITIALIZE"

    .line 42
    .line 43
    :goto_0
    const-string v2, "Unrecognized run reason: "

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_4
    invoke-virtual {p0}, LE4/k;->p()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_5
    invoke-virtual {p0, v1}, LE4/k;->h(I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput v0, p0, LE4/k;->B:I

    .line 62
    .line 63
    invoke-virtual {p0}, LE4/k;->g()LE4/h;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, LE4/k;->y:LE4/h;

    .line 68
    .line 69
    invoke-virtual {p0}, LE4/k;->p()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, LE4/k;->c:LZ4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ4/e;->a()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LE4/k;->z:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Throwable;

    .line 28
    .line 29
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v2, "Already notified"

    .line 32
    .line 33
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iput-boolean v1, p0, LE4/k;->z:Z

    .line 38
    .line 39
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    .line 4
    .line 5
    iget-object v2, p0, LE4/k;->x:LC4/e;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, LE4/k;->A:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LE4/k;->j()V
    :try_end_0
    .catch LE4/d; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v2}, LC4/e;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p0}, LE4/k;->q()V
    :try_end_1
    .catch LE4/d; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, LC4/e;->a()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :goto_0
    const/4 v4, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, LE4/k;->A:Z

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", stage: "

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, LE4/k;->B:I

    .line 56
    .line 57
    invoke-static {v1}, LA7/p0;->z(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    iget v0, p0, LE4/k;->B:I

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, LE4/k;->b:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, LE4/k;->j()V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-boolean v0, p0, LE4/k;->A:Z

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    throw v3

    .line 92
    :cond_4
    throw v3

    .line 93
    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    :goto_3
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-interface {v2}, LC4/e;->a()V

    .line 97
    .line 98
    .line 99
    :cond_5
    throw v0
.end method
