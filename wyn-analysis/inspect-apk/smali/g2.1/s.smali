.class public final Lg2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/F;


# instance fields
.field public final a:Lo2/e;

.field public final b:Landroid/os/Handler;

.field public final c:Lac/a;

.field public final d:Lg2/n;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Lcom/google/android/gms/ads/nativead/l;

.field public final h:Lad/I;

.field public i:Lk2/E;

.field public j:Ll8/e0;

.field public k:Ljava/io/IOException;

.field public l:Lio/ktor/utils/io/T;

.field public m:J

.field public n:J

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:I

.field public v:Z


# direct methods
.method public constructor <init>(Lo2/e;Lad/I;Landroid/net/Uri;Lcom/google/android/gms/ads/nativead/l;Ljava/lang/String;Ljavax/net/SocketFactory;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/s;->a:Lo2/e;

    .line 5
    .line 6
    iput-object p2, p0, Lg2/s;->h:Lad/I;

    .line 7
    .line 8
    iput-object p4, p0, Lg2/s;->g:Lcom/google/android/gms/ads/nativead/l;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lg2/s;->b:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lac/a;

    .line 18
    .line 19
    const/4 p1, 0x6

    .line 20
    invoke-direct {v1, p0, p1}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lg2/s;->c:Lac/a;

    .line 24
    .line 25
    new-instance v0, Lg2/n;

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    move-object v4, p3

    .line 29
    move-object v3, p5

    .line 30
    move-object v5, p6

    .line 31
    invoke-direct/range {v0 .. v5}, Lg2/n;-><init>(Lac/a;Lac/a;Ljava/lang/String;Landroid/net/Uri;Ljavax/net/SocketFactory;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lg2/s;->d:Lg2/n;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lg2/s;->f:Ljava/util/ArrayList;

    .line 49
    .line 50
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iput-wide p1, p0, Lg2/s;->n:J

    .line 56
    .line 57
    iput-wide p1, p0, Lg2/s;->m:J

    .line 58
    .line 59
    iput-wide p1, p0, Lg2/s;->o:J

    .line 60
    .line 61
    return-void
.end method

.method public static a(Lg2/s;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg2/s;->p:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget-object v1, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    iget-boolean v2, p0, Lg2/s;->p:Z

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lg2/r;

    .line 20
    .line 21
    iget-boolean v1, v1, Lg2/r;->d:Z

    .line 22
    .line 23
    and-int/2addr v1, v2

    .line 24
    iput-boolean v1, p0, Lg2/s;->p:Z

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public static g(Lg2/s;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lg2/s;->r:Z

    .line 4
    .line 5
    if-nez v2, :cond_5

    .line 6
    .line 7
    iget-boolean v2, p0, Lg2/s;->s:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    move v2, v0

    .line 14
    :goto_0
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-ge v2, v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lg2/r;

    .line 27
    .line 28
    iget-object v3, v3, Lg2/r;->c:Lk2/c0;

    .line 29
    .line 30
    invoke-virtual {v3}, Lk2/c0;->u()LN1/n;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_1
    add-int/2addr v2, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iput-boolean v1, p0, Lg2/s;->s:Z

    .line 40
    .line 41
    invoke-static {v3}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v3, 0x4

    .line 46
    const-string v4, "initialCapacity"

    .line 47
    .line 48
    invoke-static {v3, v4}, Ll8/s;->d(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-array v3, v3, [Ljava/lang/Object;

    .line 52
    .line 53
    move v4, v0

    .line 54
    move v5, v4

    .line 55
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-ge v4, v6, :cond_4

    .line 60
    .line 61
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Lg2/r;

    .line 66
    .line 67
    iget-object v6, v6, Lg2/r;->c:Lk2/c0;

    .line 68
    .line 69
    new-instance v7, LN1/O;

    .line 70
    .line 71
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v6}, Lk2/c0;->u()LN1/n;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-array v9, v1, [LN1/n;

    .line 83
    .line 84
    aput-object v6, v9, v0

    .line 85
    .line 86
    invoke-direct {v7, v8, v9}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 87
    .line 88
    .line 89
    array-length v6, v3

    .line 90
    add-int/lit8 v8, v5, 0x1

    .line 91
    .line 92
    invoke-static {v6, v8}, Ll8/E;->f(II)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    array-length v9, v3

    .line 97
    if-gt v6, v9, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_2
    aput-object v7, v3, v5

    .line 105
    .line 106
    add-int/2addr v4, v1

    .line 107
    move v5, v8

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-static {v5, v3}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lg2/s;->j:Ll8/e0;

    .line 114
    .line 115
    iget-object v0, p0, Lg2/s;->i:Lk2/E;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, p0}, Lk2/E;->l(Lk2/F;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    :goto_3
    return-void
.end method

.method public static l(Lg2/s;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg2/s;->v:Z

    .line 3
    .line 4
    iget-object v0, p0, Lg2/s;->d:Lg2/n;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Lg2/n;->close()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lg2/z;

    .line 14
    .line 15
    new-instance v3, LY2/B;

    .line 16
    .line 17
    invoke-direct {v3, v0}, LY2/B;-><init>(Lg2/n;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Lg2/z;-><init>(LY2/B;)V

    .line 21
    .line 22
    .line 23
    iput-object v2, v0, Lg2/n;->i:Lg2/z;

    .line 24
    .line 25
    iget-object v3, v0, Lg2/n;->h:Landroid/net/Uri;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lg2/n;->d(Landroid/net/Uri;)Ljava/net/Socket;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Lg2/z;->a(Ljava/net/Socket;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    iput-object v2, v0, Lg2/n;->k:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v1, v0, Lg2/n;->q:Z

    .line 38
    .line 39
    iput-object v2, v0, Lg2/n;->n:LVa/m8;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v2

    .line 43
    new-instance v3, Lio/ktor/utils/io/T;

    .line 44
    .line 45
    invoke-direct {v3, v2}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lg2/n;->b:Lac/a;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lac/a;->L(Lio/ktor/utils/io/T;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, p0, Lg2/s;->h:Lad/I;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v0, Lad/r;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object v5, p0, Lg2/s;->f:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    move v6, v1

    .line 86
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-ge v6, v7, :cond_2

    .line 91
    .line 92
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Lg2/r;

    .line 97
    .line 98
    iget-boolean v8, v7, Lg2/r;->d:Z

    .line 99
    .line 100
    if-nez v8, :cond_0

    .line 101
    .line 102
    new-instance v8, Lg2/r;

    .line 103
    .line 104
    iget-object v7, v7, Lg2/r;->a:Lg2/q;

    .line 105
    .line 106
    iget-object v9, v7, Lg2/q;->a:Lg2/w;

    .line 107
    .line 108
    invoke-direct {v8, p0, v9, v6, v0}, Lg2/r;-><init>(Lg2/s;Lg2/w;ILg2/d;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    iget-object v9, v8, Lg2/r;->a:Lg2/q;

    .line 115
    .line 116
    iget-object v10, v9, Lg2/q;->b:Lg2/f;

    .line 117
    .line 118
    iget-object v8, v8, Lg2/r;->b:Lo2/m;

    .line 119
    .line 120
    iget-object v11, p0, Lg2/s;->c:Lac/a;

    .line 121
    .line 122
    invoke-virtual {v8, v10, v11, v1}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_1

    .line 130
    .line 131
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_0
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_1
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    invoke-static {v3}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 155
    .line 156
    .line 157
    :goto_3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-ge v1, v0, :cond_3

    .line 162
    .line 163
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Lg2/r;

    .line 168
    .line 169
    invoke-virtual {v0}, Lg2/r;->a()V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_3
    return-void
.end method


# virtual methods
.method public final b(JLU1/a0;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public final c()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg2/s;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final d(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lg2/s;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lg2/s;->v:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-wide p1, p0, Lg2/s;->o:J

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_0
    invoke-virtual {p0, p1, p2}, Lg2/s;->i(J)V

    .line 19
    .line 20
    .line 21
    iput-wide p1, p0, Lg2/s;->m:J

    .line 22
    .line 23
    invoke-virtual {p0}, Lg2/s;->m()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lg2/s;->d:Lg2/n;

    .line 31
    .line 32
    iget v2, v0, Lg2/n;->o:I

    .line 33
    .line 34
    if-eq v2, v1, :cond_8

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    if-ne v2, v1, :cond_1

    .line 38
    .line 39
    iput-wide p1, p0, Lg2/s;->n:J

    .line 40
    .line 41
    invoke-virtual {v0, p1, p2}, Lg2/n;->h(J)V

    .line 42
    .line 43
    .line 44
    return-wide p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    const/4 v0, 0x0

    .line 52
    move v2, v0

    .line 53
    :goto_0
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ge v2, v4, :cond_8

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lg2/r;

    .line 66
    .line 67
    iget-object v3, v3, Lg2/r;->c:Lk2/c0;

    .line 68
    .line 69
    invoke-virtual {v3, p1, p2, v0}, Lk2/c0;->F(JZ)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_7

    .line 74
    .line 75
    iput-wide p1, p0, Lg2/s;->n:J

    .line 76
    .line 77
    iget-boolean v2, p0, Lg2/s;->p:Z

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    move v2, v0

    .line 82
    :goto_1
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v2, v3, :cond_3

    .line 89
    .line 90
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lg2/r;

    .line 97
    .line 98
    iget-boolean v4, v3, Lg2/r;->d:Z

    .line 99
    .line 100
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 101
    .line 102
    .line 103
    iput-boolean v0, v3, Lg2/r;->d:Z

    .line 104
    .line 105
    iget-object v4, v3, Lg2/r;->f:Lg2/s;

    .line 106
    .line 107
    invoke-static {v4}, Lg2/s;->a(Lg2/s;)V

    .line 108
    .line 109
    .line 110
    iget-object v4, v3, Lg2/r;->a:Lg2/q;

    .line 111
    .line 112
    iget-object v4, v4, Lg2/q;->b:Lg2/f;

    .line 113
    .line 114
    iget-object v5, v3, Lg2/r;->f:Lg2/s;

    .line 115
    .line 116
    iget-object v5, v5, Lg2/s;->c:Lac/a;

    .line 117
    .line 118
    iget-object v3, v3, Lg2/r;->b:Lo2/m;

    .line 119
    .line 120
    invoke-virtual {v3, v4, v5, v0}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 121
    .line 122
    .line 123
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    iget-boolean v2, p0, Lg2/s;->v:Z

    .line 127
    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    iget-object v2, p0, Lg2/s;->d:Lg2/n;

    .line 131
    .line 132
    invoke-static {p1, p2}, LQ1/x;->W(J)J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    invoke-virtual {v2, v3, v4}, Lg2/n;->i(J)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    iget-object v2, p0, Lg2/s;->d:Lg2/n;

    .line 141
    .line 142
    invoke-virtual {v2, p1, p2}, Lg2/n;->h(J)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    iget-object v2, p0, Lg2/s;->d:Lg2/n;

    .line 147
    .line 148
    invoke-virtual {v2, p1, p2}, Lg2/n;->h(J)V

    .line 149
    .line 150
    .line 151
    :goto_2
    move v2, v0

    .line 152
    :goto_3
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-ge v2, v3, :cond_8

    .line 159
    .line 160
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lg2/r;

    .line 167
    .line 168
    iget-boolean v4, v3, Lg2/r;->d:Z

    .line 169
    .line 170
    if-nez v4, :cond_6

    .line 171
    .line 172
    iget-object v4, v3, Lg2/r;->a:Lg2/q;

    .line 173
    .line 174
    iget-object v4, v4, Lg2/q;->b:Lg2/f;

    .line 175
    .line 176
    iget-object v4, v4, Lg2/f;->h:Lg2/g;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v5, v4, Lg2/g;->e:Ljava/lang/Object;

    .line 182
    .line 183
    monitor-enter v5

    .line 184
    :try_start_0
    iput-boolean v1, v4, Lg2/g;->k:Z

    .line 185
    .line 186
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    iget-object v4, v3, Lg2/r;->c:Lk2/c0;

    .line 188
    .line 189
    invoke-virtual {v4, v0}, Lk2/c0;->C(Z)V

    .line 190
    .line 191
    .line 192
    iget-object v3, v3, Lg2/r;->c:Lk2/c0;

    .line 193
    .line 194
    iput-wide p1, v3, Lk2/c0;->t:J

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :catchall_0
    move-exception p1

    .line 198
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    throw p1

    .line 200
    :cond_6
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_8
    return-wide p1
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg2/s;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lg2/s;->d:Lg2/n;

    .line 6
    .line 7
    iget v0, v0, Lg2/n;->o:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    :cond_0
    return v2

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg2/s;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lg2/s;->q:Z

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    return-wide v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg2/s;->k:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    throw v0
.end method

.method public final i(J)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg2/s;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lg2/r;

    .line 22
    .line 23
    iget-boolean v2, v1, Lg2/r;->d:Z

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    iget-object v1, v1, Lg2/r;->c:Lk2/c0;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-virtual {v1, p1, p2, v2}, Lk2/c0;->i(JZ)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    return-void
.end method

.method public final j()Lk2/n0;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg2/s;->s:Z

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk2/n0;

    .line 7
    .line 8
    iget-object v1, p0, Lg2/s;->j:Ll8/e0;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v2, v2, [LN1/O;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ll8/F;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, [LN1/O;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lk2/n0;-><init>([LN1/O;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final k(LU1/C;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg2/s;->e()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final m()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lg2/s;->n:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final n()J
    .locals 10

    .line 1
    iget-boolean v0, p0, Lg2/s;->p:Z

    .line 2
    .line 3
    const-wide/high16 v1, -0x8000000000000000L

    .line 4
    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    iget-object v0, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-wide v3, p0, Lg2/s;->m:J

    .line 17
    .line 18
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v5, v3, v5

    .line 24
    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    return-wide v3

    .line 28
    :cond_1
    const/4 v3, 0x1

    .line 29
    const/4 v4, 0x0

    .line 30
    const-wide v5, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    move v7, v4

    .line 36
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-ge v7, v8, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    check-cast v8, Lg2/r;

    .line 47
    .line 48
    iget-boolean v9, v8, Lg2/r;->d:Z

    .line 49
    .line 50
    if-nez v9, :cond_2

    .line 51
    .line 52
    iget-object v3, v8, Lg2/r;->c:Lk2/c0;

    .line 53
    .line 54
    invoke-virtual {v3}, Lk2/c0;->o()J

    .line 55
    .line 56
    .line 57
    move-result-wide v8

    .line 58
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    move v3, v4

    .line 63
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    if-nez v3, :cond_5

    .line 67
    .line 68
    cmp-long v0, v5, v1

    .line 69
    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    return-wide v5

    .line 74
    :cond_5
    :goto_1
    const-wide/16 v0, 0x0

    .line 75
    .line 76
    return-wide v0

    .line 77
    :cond_6
    :goto_2
    return-wide v1
.end method

.method public final o(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v4, p0, Lg2/s;->f:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    if-ge v2, v5, :cond_1

    .line 12
    .line 13
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lg2/q;

    .line 18
    .line 19
    iget-object v4, v4, Lg2/q;->c:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    move v4, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v4, v1

    .line 26
    :goto_1
    and-int/2addr v3, v4

    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lg2/s;->t:Z

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lg2/s;->d:Lg2/n;

    .line 37
    .line 38
    iget-object v1, v0, Lg2/n;->e:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lg2/n;->b()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public final q(Lk2/E;J)V
    .locals 3

    .line 1
    iget-object p2, p0, Lg2/s;->d:Lg2/n;

    .line 2
    .line 3
    iput-object p1, p0, Lg2/s;->i:Lk2/E;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    .line 7
    .line 8
    :try_start_1
    iget-object p1, p2, Lg2/n;->i:Lg2/z;

    .line 9
    .line 10
    iget-object p3, p2, Lg2/n;->h:Landroid/net/Uri;

    .line 11
    .line 12
    invoke-virtual {p2, p3}, Lg2/n;->d(Landroid/net/Uri;)Ljava/net/Socket;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p1, p3}, Lg2/z;->a(Ljava/net/Socket;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 17
    .line 18
    .line 19
    :try_start_2
    iget-object p1, p2, Lg2/n;->h:Landroid/net/Uri;

    .line 20
    .line 21
    iget-object p3, p2, Lg2/n;->k:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p2, Lg2/n;->g:LE4/n;

    .line 24
    .line 25
    sget-object v1, Ll8/j0;->g:Ll8/j0;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-virtual {v0, v2, p3, v1, p1}, LE4/n;->k(ILjava/lang/String;Ljava/util/Map;Landroid/net/Uri;)Lg2/B;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, LE4/n;->y(Lg2/B;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p1

    .line 37
    iget-object p3, p2, Lg2/n;->i:Lg2/z;

    .line 38
    .line 39
    invoke-static {p3}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 40
    .line 41
    .line 42
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 43
    :catch_1
    move-exception p1

    .line 44
    iput-object p1, p0, Lg2/s;->k:Ljava/io/IOException;

    .line 45
    .line 46
    invoke-static {p2}, LQ1/x;->g(Ljava/io/Closeable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final r([Ln2/q;[Z[Lk2/d0;[ZJ)J
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_2

    .line 5
    .line 6
    aget-object v2, p3, v1

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    aget-boolean v2, p2, v1

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    aput-object v2, p3, v1

    .line 20
    .line 21
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object p2, p0, Lg2/s;->f:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 27
    .line 28
    .line 29
    move v1, v0

    .line 30
    :goto_1
    array-length v2, p1

    .line 31
    iget-object v3, p0, Lg2/s;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-ge v1, v2, :cond_5

    .line 35
    .line 36
    aget-object v2, p1, v1

    .line 37
    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-interface {v2}, Ln2/q;->g()LN1/O;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v5, p0, Lg2/s;->j:Ll8/e0;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v2}, Ll8/K;->indexOf(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lg2/r;

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v3, v3, Lg2/r;->a:Lg2/q;

    .line 64
    .line 65
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Lg2/s;->j:Ll8/e0;

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ll8/K;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    aget-object v2, p3, v1

    .line 77
    .line 78
    if-nez v2, :cond_4

    .line 79
    .line 80
    new-instance v2, LA/x;

    .line 81
    .line 82
    const/16 v3, 0xf

    .line 83
    .line 84
    invoke-direct {v2, p0, v5, v3}, LA/x;-><init>(Ljava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    aput-object v2, p3, v1

    .line 88
    .line 89
    aput-boolean v4, p4, v1

    .line 90
    .line 91
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-ge v0, p1, :cond_7

    .line 99
    .line 100
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lg2/r;

    .line 105
    .line 106
    iget-object p3, p1, Lg2/r;->a:Lg2/q;

    .line 107
    .line 108
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    if-nez p3, :cond_6

    .line 113
    .line 114
    invoke-virtual {p1}, Lg2/r;->a()V

    .line 115
    .line 116
    .line 117
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    iput-boolean v4, p0, Lg2/s;->t:Z

    .line 121
    .line 122
    const-wide/16 p1, 0x0

    .line 123
    .line 124
    cmp-long p1, p5, p1

    .line 125
    .line 126
    if-eqz p1, :cond_8

    .line 127
    .line 128
    iput-wide p5, p0, Lg2/s;->m:J

    .line 129
    .line 130
    iput-wide p5, p0, Lg2/s;->n:J

    .line 131
    .line 132
    iput-wide p5, p0, Lg2/s;->o:J

    .line 133
    .line 134
    :cond_8
    invoke-virtual {p0}, Lg2/s;->p()V

    .line 135
    .line 136
    .line 137
    return-wide p5
.end method
